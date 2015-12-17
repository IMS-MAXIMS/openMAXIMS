//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.core.helper;

import ims.admin.vo.PDSConfigurationVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.clinical.domain.objects.TaxonomyMap;
import ims.core.generic.domain.objects.Address;
import ims.core.generic.domain.objects.PersonName;
import ims.core.resource.people.domain.objects.Gp;
import ims.core.resource.place.domain.objects.Organisation;
import ims.core.vo.lookups.GPStatus;
import ims.core.vo.lookups.OrganisationType;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.hibernate3.Registry;
import ims.domain.lookups.LookupInstance;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchResult;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.type.Type;

/**
 * @author bworwood
 *
 * SdsRequestQueue - class which will poll the sds request table
 * for requests. It will check the SDS Ldap Server to get C&B Referral details
 */
public class SdsRequestHelper
{
	private static final Logger LOG = Logger.getLogger(SdsRequestHelper.class);
	private Session sess;
	private Gp createdOrFoundGp;
	private Organisation createdOrFoundPractice;
	private PDSConfigurationVo pdsConfiguration;
	
	private static boolean sdsCfgLoaded = false;
	
	static
	{
		if(!sdsCfgLoaded)
		{
			InputStream init = Thread.currentThread().getContextClassLoader().getResourceAsStream("sds.properties");

			try
			{
    			if(init == null)
    			{
    				throw new FileNotFoundException("The file sds.properties was not found. It should be found in \\webapp\\web-inf\\classes");
    			}
    			else
    			{
    				Properties prop = new Properties();
    				prop.load(init);
    				
    				Properties systemProp = System.getProperties();
    				systemProp.setProperty("javax.net.ssl.keyStore", prop.getProperty("javax.net.ssl.keyStore"));
    				systemProp.setProperty("javax.net.ssl.trustStore", prop.getProperty("javax.net.ssl.trustStore"));
    				systemProp.setProperty("javax.net.ssl.keyStorePassword", prop.getProperty("javax.net.ssl.keyStorePassword"));
    				systemProp.setProperty("javax.net.ssl.trustStorePassword", prop.getProperty("javax.net.ssl.trustStorePassword"));
    				
    				System.out.println("SDS properties loaded succesfully from sds.properties config file.");
    				
    				sdsCfgLoaded = true;
    			}
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public Gp getCreatedOrFoundGp()
	{
		return createdOrFoundGp;
	}

	public void setCreatedOrFoundGp(Gp createdOrFoundGp)
	{
		this.createdOrFoundGp = createdOrFoundGp;
	}

	public Organisation getCreatedOrFoundPractice()
	{
		return createdOrFoundPractice;
	}

	public void setCreatedOrFoundPractice(Organisation createdOrFoundPractice)
	{
		this.createdOrFoundPractice = createdOrFoundPractice;
	}

	public SdsRequestHelper() 
	{
	}
	
	public SdsRequestHelper(PDSConfigurationVo pdsConfiguration)
	{
		this.pdsConfiguration = pdsConfiguration;
	}

	protected static Session getNewSession() throws Exception
	{
		return Registry.getInstance().getSessionFactory().openSession();	
	}
	
	public Gp processGPSdsRequest(Gp gp, String sdsHost, String sdsPort) throws Exception
    {
		if(gp == null)
			return null;
		
		Ldap.setHost(sdsHost);
		Ldap.setPort(sdsPort);
		Ldap.setBaseDn("o=nhs");
		Ldap.setContext("ou=People");

		String[] returnAttributes = new String[100];
		returnAttributes[0] = "nhsgnc";  // National GP Code
		returnAttributes[1] = "uid";  // sdsId
		returnAttributes[2] = "givenName";  // Forename 
		returnAttributes[3] = "sn";  // Surname
		returnAttributes[4] = "uniqueIdentifier";  // sdsRoleId
		returnAttributes[5] = "nhsidcode";  // Another ID?
		returnAttributes[6] = "o";  // Practice Name?
		returnAttributes[7] = "personTitle";
		returnAttributes[8] = "nhsPersonStatus";
		Ldap.setReturnAttributes(returnAttributes);

		StringBuffer filter = new StringBuffer();
		filter.append("(&");
		filter.append("(objectclass=organizationalPerson)");
		
		String sdsId = "";
		String gpCode = "";
		
		if(gp.getCodeMappings() != null)
		{
			for(int j = 0; j < gp.getCodeMappings().size(); j++)
			{
				Object mapping = gp.getCodeMappings().get(j);
				
				if(mapping instanceof TaxonomyMap)
				{
					if(((TaxonomyMap)mapping).getTaxonomyName() != null && (TaxonomyType.SDSID.getID() == ((TaxonomyMap)mapping).getTaxonomyName().getId()))
					{
						sdsId = ((TaxonomyMap) mapping).getTaxonomyCode();
					}
					
					if(((TaxonomyMap)mapping).getTaxonomyName() != null && (TaxonomyType.NAT_GP_CODE.getID() == ((TaxonomyMap)mapping).getTaxonomyName().getId()))
					{
						gpCode = ((TaxonomyMap) mapping).getTaxonomyCode();
					}
				}
			}
		}
		
		if(sdsId != null && sdsId.length()>0)
		{
    		filter.append("(uid=");
    		filter.append(sdsId);
    		filter.append(")");
		}
		
		if(gpCode != null && gpCode.length()>0)
		{
    		filter.append("(nhsgnc=");
    		filter.append(gpCode);
    		filter.append(")");
		}
		
		filter.append(")");
		
		Ldap.setFilter(filter.toString());
		
		//perform person search
		NamingEnumeration personSearch = null;
		NamingEnumeration personRecord = null;
		SearchResult item = null;
		PersonDetails pdts = new PersonDetails();
		try
		{
			logMessage(Ldap.outputDetails().getBytes(), true);
			personSearch = Ldap.search();
		}
		catch (NamingException e) 
		{
			LOG.error("NamingException during LdapSearch call for GP Search - " + e.getMessage(), e);
			throw new Exception("NamingException during LdapSearch call for GP Search - " + ((sdsId != null && sdsId.length() > 0) ? "SDSID = " + sdsId : "NATIONAL GP CODE = " + gpCode), e.getCause());
		}
		
		if (personSearch == null || (personSearch != null && !personSearch.hasMoreElements()))
		{
			LOG.error("No Ldap record found for this GP - " + sdsId);
			throw new Exception("No Ldap record found for this GP - " + ((sdsId != null && sdsId.length() > 0) ? "SDSID = " + sdsId : "NATIONAL GP CODE = " + gpCode));
		}
		
		StringBuffer messageToLog = new StringBuffer();
		// Look for results
		while (personSearch.hasMoreElements()) 
		{
			try 
			{
				item = (SearchResult) personSearch.next();
			} 
			catch (NamingException e) 
			{
				LOG.error("NamingException during iteration of GP Search result - " + e.getMessage(), e);
				throw new Exception("NamingException during iteration of GP Search result - " + ((sdsId != null && sdsId.length() > 0) ? "SDSID = " + sdsId : "NATIONAL GP CODE = " + gpCode), e.getCause());
			}
			
			if(item == null)
				continue;
			
			personRecord = item.getAttributes().getAll();
			String returnedElement = null;
			String returnedAttribute = "";
			String returnedValue = "";
			
			while (personRecord.hasMoreElements()) 
			{
				Object nextEl = personRecord.nextElement();
				
				if(nextEl == null)
					continue;
				
				returnedElement = nextEl.toString();
				messageToLog.append(returnedElement);

				if (returnedElement.length() > 1) 
				{
					int len = returnedElement.length();
					int colon = returnedElement.indexOf(":");

					returnedAttribute = returnedElement.substring(0, colon);
					returnedValue =	returnedElement.substring(colon + 2, len);

					if (returnedAttribute != null)
					{
						if (returnedAttribute.equals("nhsgnc") && returnedValue != null)
							pdts.nhsgnc = returnedValue;
						else if (returnedAttribute.equals("uid") && returnedValue != null)
							pdts.uid = returnedValue;
						else if (returnedAttribute.equals("givenName") && returnedValue != null)
							pdts.givenName = returnedValue;
						else if (returnedAttribute.equals("sn") && returnedValue != null)
							pdts.sn = returnedValue;
						else if (returnedAttribute.equals("uniqueIdentifier") && returnedValue != null)
							pdts.uniqueIdentifier = returnedValue;
						else if (returnedAttribute.equals("nhsidcode") && returnedValue != null)
							pdts.nhsidcode = returnedValue;
						else if (returnedAttribute.equals("o") && returnedValue != null)
							pdts.practiceName = returnedValue;
						else if (returnedAttribute.equals("personTitle") && returnedValue != null)	
							pdts.personTitle = returnedValue;
						else if (returnedAttribute.equals("nhsPersonStatus") && returnedValue != null)
							pdts.nhsPersonStatus = returnedValue;
					}
				}
			}
		}
		
		logMessage(messageToLog.toString().getBytes(), false);
		
    	if (pdts.nhsgnc == null && pdts.uid == null)
    	{
    		throw new Exception("NAT_GP_CODE and SDSID are null.");
    	}
    	else
    	{
    		Gp sdsGp = createGP(pdts, false);

        	if(sdsGp.getName() != null)
        	{
        		gp.getName().setForename(sdsGp.getName().getForename());
            	gp.getName().setUpperForename(sdsGp.getName().getForename() != null ? sdsGp.getName().getForename().toUpperCase() : null);
            	//WDEV-23281
            	gp.getName().setSurname(sdsGp.getName().getSurname());
            	//WDEV-23281
            	gp.getName().setUpperSurname(sdsGp.getName().getSurname() != null ? sdsGp.getName().getSurname().toUpperCase() : null);
            	gp.getName().setMiddleName(sdsGp.getName().getMiddleName());
            	gp.getName().setTitle(sdsGp.getName().getTitle());
        	}
    			
//        	if(getGPSDSId(gp) == null)
//        	{
//        		TaxonomyMap taxonomyMap = getGPSDSId(sdsGp);
//        		
//        		if(taxonomyMap != null)
//        		{
//        			if(gp.getCodeMappings()== null)
//        			{
//        				gp.setCodeMappings(new ArrayList());
//        			}
//        				
//        			gp.getCodeMappings().add(taxonomyMap);
//        		}
//        	}
        	
    		gp.setStatus(sdsGp.getStatus());
		}
    	
		return gp;
    }
	
	private TaxonomyMap getGPSDSId(Gp gp)
	{
		if(gp == null || gp.getCodeMappings() == null)
			return null;
			
		for(int i=0; i<gp.getCodeMappings().size(); i++)
		{
			if(!(gp.getCodeMappings().get(i) instanceof TaxonomyMap))
				continue;
			
			TaxonomyMap taxonomyMap = (TaxonomyMap) gp.getCodeMappings().get(i);
			
			if(taxonomyMap.getTaxonomyName() != null && taxonomyMap.getTaxonomyName().getId() == TaxonomyType.SDSID.getID())
				return taxonomyMap;
		}
		
		return null;
	}

	public Organisation processPracticeSdsRequest(Organisation practice, String sdsHost, String sdsPort) throws Exception
    {
		if(practice == null)
			return null;
		
		Ldap.setBaseDn("o=nhs");
		Ldap.setContext("ou=Organisations"); //People
		String[] returnAttributes = new String[100];
		returnAttributes[0] = "nhsIDCode";  // ID - sbould be same as sdsOrgId
		returnAttributes[1] = "o";  // Practice Name
		returnAttributes[2] = "postalAddress";
		returnAttributes[3] = "postalCode";
		returnAttributes[4] = "nhsPCTCode";
		
		Ldap.setReturnAttributes(returnAttributes);

		//build the search filter
		StringBuffer filter = new StringBuffer();
		filter.append("(&");
		filter.append("(objectclass=nhsGPPractice)");
		
		String sdsOrgId = getTaxonomyCode(practice, TaxonomyType.ICAB);
		
		if(sdsOrgId == null || sdsOrgId.length() == 0)
		{
			sdsOrgId = getTaxonomyCode(practice, TaxonomyType.NAT_LOC_CODE);
		}
		
		if(sdsOrgId != null && sdsOrgId.length() > 0)
		{
			filter.append("(nhsIDCode=");
			filter.append(sdsOrgId);
			filter.append(")");
		}
		
		filter.append(")");

		Ldap.setFilter(filter.toString());
		
		//perform person search
		NamingEnumeration orgSearch = null;
		NamingEnumeration orgRecord = null;
		SearchResult item = null;
		
		PersonDetails pdts = new PersonDetails();
		try
		{
			logMessage(Ldap.outputDetails().getBytes(), true);
			orgSearch = Ldap.search();
			
		} 
		catch (NamingException e) 
		{
			LOG.error("NamingException during LdapSearch call for orgSearch - " + e.getMessage(), e);
			throw new Exception("NamingException during LdapSearch call for this Practice - " + sdsOrgId);
		}
		
		if (orgSearch == null || (orgSearch != null && !orgSearch.hasMoreElements()))
		{
			LOG.error("No Ldap record found for this Practice - " + sdsOrgId);
			throw new Exception("No Ldap record found for this Practice - " + sdsOrgId);
		}
		
		StringBuffer messageToLog = new StringBuffer();
		while (orgSearch.hasMoreElements()) 
		{
			try 
			{
				item = (SearchResult) orgSearch.next();
			} 
			catch (NamingException e) 
			{
				LOG.error("NamingException occured during iteration of orgSearch - " + e.getMessage(), e);
				throw new Exception("NamingException occured during iteration for this Practice - " + sdsOrgId);
			}
			
			if(item == null)
				continue;

			orgRecord = item.getAttributes().getAll();
			String returnedElement = null;
			String returnedAttribute = "";
			String returnedValue = "";
			
			while (orgRecord.hasMoreElements()) 
			{
				Object nextEl = orgRecord.nextElement();
				
				if(nextEl == null)
					continue;
				
				returnedElement = nextEl.toString();
				messageToLog.append(returnedElement);

				if (returnedElement.length() > 1) 
				{
					int len = returnedElement.length();
					int colon = returnedElement.indexOf(":");

					returnedAttribute = returnedElement.substring(0, colon);
					returnedValue =	returnedElement.substring(colon + 2, len);
					
					if (returnedAttribute != null)
					{
						if (returnedAttribute.equals("nhsIDCode") && returnedValue != null)
							pdts.nhsidcode = returnedValue;
						else if (returnedAttribute.equals("postalAddress") && returnedValue != null)
							pdts.postalAddress = returnedValue;
						else if (returnedAttribute.equals("postalCode") && returnedValue != null)
							pdts.postalCode = returnedValue;
						else if (returnedAttribute.equals("nhsPCTCode") && returnedValue != null)
							pdts.nhspctCode = returnedValue;
						else if (returnedAttribute.equals("o") && returnedValue != null)
							pdts.practiceName = returnedValue;			
					}
				}
			}
		}
		
		logMessage(messageToLog.toString().getBytes(), false);
		
		Organisation sdsOrg = getPractice(pdts);
		
		if(sdsOrg != null)
		{
			practice.setName(sdsOrg.getName());
			practice.setUpperName(sdsOrg.getUpperName());
			practice.setAddress(sdsOrg.getAddress());
			practice.setIsActive(sdsOrg.isIsActive());
			practice.setPctCode(sdsOrg.getPctCode());
			
			if(getTaxonomyMap(practice, TaxonomyType.ICAB) == null)
			{
				TaxonomyMap taxonomyMap = getTaxonomyMap(sdsOrg, TaxonomyType.ICAB);
        		
        		if(taxonomyMap != null)
        		{
        			if(practice.getCodeMappings()== null)
        			{
        				practice.setCodeMappings(new ArrayList());
        			}
        			
        			practice.getCodeMappings().add(taxonomyMap);
        		}
			}
			if(getTaxonomyMap(practice, TaxonomyType.SDSID) == null)
			{
				TaxonomyMap taxonomyMap = getTaxonomyMap(sdsOrg, TaxonomyType.SDSID);
        		
        		if(taxonomyMap != null)
        		{
        			if(practice.getCodeMappings()== null)
        			{
        				practice.setCodeMappings(new ArrayList());
        			}
        			
        			practice.getCodeMappings().add(taxonomyMap);
        		}
			}
			if(getTaxonomyMap(practice, TaxonomyType.PAS) == null)
			{
				TaxonomyMap taxonomyMap = getTaxonomyMap(sdsOrg, TaxonomyType.PAS);
        		
        		if(taxonomyMap != null)
        		{
        			if(practice.getCodeMappings()== null)
        			{
        				practice.setCodeMappings(new ArrayList());
        			}
        			
        			practice.getCodeMappings().add(taxonomyMap);
        		}
			}
		}
		
		return practice;
    }
	
   private TaxonomyMap getTaxonomyMap(Organisation org, TaxonomyType code)
   {
	   if(org == null || org.getCodeMappings() == null)
			return null;
			
		for(int i=0; i<org.getCodeMappings().size(); i++)
		{
			if(!(org.getCodeMappings().get(i) instanceof TaxonomyMap))
				continue;
			
			TaxonomyMap taxonomyMap = (TaxonomyMap) org.getCodeMappings().get(i);
			
			if(taxonomyMap.getTaxonomyName() != null && taxonomyMap.getTaxonomyName().getId() == code.getID())
				return taxonomyMap;
		}
		
		return null;
	}
   	
   	private String getTaxonomyCode(Organisation practice, TaxonomyType taxMap)
	{
		if(practice == null || taxMap == null)
			return null;
		
		if(practice.getCodeMappings() != null)
		{
			for(int j = 0; j < practice.getCodeMappings().size(); j++)
			{
				Object mapping = practice.getCodeMappings().get(j);
				
				if(mapping instanceof TaxonomyMap)
				{
					if(((TaxonomyMap)mapping).getTaxonomyName() != null  && (taxMap.getID() == ((TaxonomyMap)mapping).getTaxonomyName().getId()))
					{
						return ((TaxonomyMap) mapping).getTaxonomyCode();
					}
				}
			}
		}
		
		return null;
	}

   private Gp createGP(PersonDetails pdts, boolean save) throws Exception 
   {
    	Gp gp = new Gp();
    	
    	PersonName pn = new PersonName();
    	pn.setForename(pdts.givenName);
    	pn.setUpperForename(pn.getForename() != null ? pn.getForename().toUpperCase() : null);
    	pn.setSurname(pdts.sn);
    	pn.setUpperSurname(pn.getSurname() != null ? pn.getSurname().toUpperCase() : null);
    	
    	if (pdts.personTitle != null)
    	{
    		pn.setTitle(getICABLocalLookup(pdts.personTitle));
    	}
    	
    	if (sess == null || !sess.isOpen())
    	{
    		sess = getNewSession();
    	}
    	
    	// Get Title and Nametype pn.setTitle()
    	gp.setName(pn);
    	
    	if (pdts.nhsPersonStatus != null && !pdts.nhsPersonStatus.equals("1"))  // wdev-6722 inactive is set and not 1
    		gp.setStatus((LookupInstance) sess.get(LookupInstance.class, new Integer(GPStatus.INACTIVE.getID())));
    	else
    		gp.setStatus((LookupInstance) sess.get(LookupInstance.class, new Integer(GPStatus.ACTIVE.getID())));
    
    	// Code Mappings
    	List lst = new ArrayList();
    	TaxonomyMap map = new TaxonomyMap();
    	LookupInstance taxonomyName;
    	
    	if (pdts.nhsgnc != null)
    	{
    		taxonomyName = (LookupInstance) sess.get(LookupInstance.class, new Integer(TaxonomyType.NAT_GP_CODE.getID()));
    		map.setTaxonomyName(taxonomyName);
    		map.setTaxonomyCode(pdts.nhsgnc);  // National Gp Code
    		lst.add(map);
    	}
    	
    	if (pdts.uid != null)
    	{
    		map = new TaxonomyMap();
    		taxonomyName = (LookupInstance) sess.get(LookupInstance.class, new Integer(TaxonomyType.SDSID.getID()));
    		map.setTaxonomyName(taxonomyName);
    		map.setTaxonomyCode(pdts.uid);  // sdsId
    		lst.add(map);
    	}
    	
    	if (pdts.uniqueIdentifier != null)
    	{
    		map = new TaxonomyMap();
    		taxonomyName = (LookupInstance) sess.get(LookupInstance.class, new Integer(TaxonomyType.PAS.getID()));
    		map.setTaxonomyName(taxonomyName);
    		map.setTaxonomyCode(pdts.uniqueIdentifier);  // sdsRoleId
    		lst.add(map);
    	}
    	
    	if (lst.size() > 0)
    		gp.setCodeMappings(lst);
    	
    	return gp;
   }
   
   private LookupInstance getICABLocalLookup(String extCode) throws Exception
   {
		if (sess == null || !sess.isOpen())
		{
			sess = getNewSession();
		}

	String hql = " from LookupInstance l join l.mappings as ms where ms.extCode = ? and ms.extSystem = ?";
	List lst = sess.createQuery(hql).setParameters(new Object[]{extCode, TaxonomyType.ICAB.getText()}, new Type[]{Hibernate.STRING, Hibernate.STRING}).list();

	if (lst != null && lst.size() > 0)
		return(LookupInstance) lst.get(0);
	
	return null;
   }
   
   private Address getAddress(PersonDetails pdts,String delimiter,boolean bFillEmptyLines)
   {
	   	Address adr  = new Address();
	   	StringTokenizer tokenizer = new StringTokenizer(pdts.postalAddress, delimiter);
	   	
	   	if (!bFillEmptyLines)
	   	{
			if (tokenizer.hasMoreTokens())
				adr.setLine1(tokenizer.nextToken().trim());
			if (tokenizer.hasMoreTokens())
				adr.setLine2(tokenizer.nextToken().trim());
			if (tokenizer.hasMoreTokens())
				adr.setLine3(tokenizer.nextToken().trim());
			if (tokenizer.hasMoreTokens())
				adr.setLine4(tokenizer.nextToken().trim());
			if (tokenizer.hasMoreTokens())
				adr.setLine5(tokenizer.nextToken().trim());
	   	}
	   	else
	   	{
			//TODO trickier than you'd think!
	   	}
	   	//adr.setAddressType(AddressType.CORRESPONDENCE);
	   	adr.setPostCode(pdts.postalCode);
	   	return adr;
   }
   
   private Organisation getPractice(PersonDetails pdts) throws Exception
   {
		Organisation org = new Organisation();
		
		if (sess == null || !sess.isOpen())
    	{
    		sess = getNewSession();
    	}
				
		org.setType((LookupInstance) sess.get(LookupInstance.class, new Integer(OrganisationType.GPP.getID())));
		org.setName(pdts.practiceName);//
		if (pdts.practiceName.length() > 30)
			org.setUpperName(pdts.practiceName.toUpperCase().substring(0, 30));
		else
			org.setUpperName(pdts.practiceName.toUpperCase());
			
		org.setComment("SDS lookup");//
		org.setAddress(getAddress(pdts,"$",false));	//	
		org.setPctCode(pdts.nhspctCode);
		org.setIsActive(Boolean.TRUE);//
		
		//Code Mappings
		List lstMappings = new ArrayList();
		TaxonomyMap map = new TaxonomyMap();
		LookupInstance taxonomyName;
		if (pdts.nhsidcode != null)
		{
			map = new TaxonomyMap();
			taxonomyName = (LookupInstance) sess.get(LookupInstance.class, new Integer(TaxonomyType.ICAB.getID()));
			map.setTaxonomyName(taxonomyName);
			map.setTaxonomyCode(pdts.nhsidcode);  // Practice Code ?
			lstMappings.add(map);
		}
		if (pdts.uid != null)
		{
			map = new TaxonomyMap();
			taxonomyName = (LookupInstance) sess.get(LookupInstance.class, new Integer(TaxonomyType.SDSID.getID()));
			map.setTaxonomyName(taxonomyName);
			map.setTaxonomyCode(pdts.uid);  // sdsId
			lstMappings.add(map);
		}
		
		if (pdts.uniqueIdentifier != null)
		{
			map = new TaxonomyMap();
			taxonomyName = (LookupInstance) sess.get(LookupInstance.class, new Integer(TaxonomyType.PAS.getID()));
			map.setTaxonomyName(taxonomyName);
			map.setTaxonomyCode(pdts.uniqueIdentifier);  // ?
			lstMappings.add(map);
		}
		
		if (lstMappings.size() > 0)
			org.setCodeMappings(lstMappings);
		
		return org;
   }
   
   /**
    * wdev-6418
    * Log the inputs and outputs to SDS if the flag is set
    */
   static String[] months = {"", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
   static final String     FILE_SEPARATOR = "__";  

	protected void logMessage(byte[] b, boolean outbound)
	{
		if (pdsConfiguration == null || !Boolean.TRUE.equals(pdsConfiguration.getPDS_STORE_MESSAGE()) || ConfigFlag.GEN.RELEASE_MODE.getValue())
			return;
		
		if(pdsConfiguration.getPDS_STORE_MESSAGE_LOC() == null || pdsConfiguration.getPDS_STORE_MESSAGE_LOC().length() == 0)
			return;
		
		try
		{
			// File should be timestamped
			DateTime tst = new DateTime();

			String month = months[tst.getDate().getMonth()];
			String logFolder;
			if (outbound)
				logFolder = pdsConfiguration.getPDS_STORE_MESSAGE_LOC() + "/outbound/SDS_REQUEST/" + tst.getDate().getYear() + "/" + month + "/" + tst.getDate().getDay();
			else
				logFolder = pdsConfiguration.getPDS_STORE_MESSAGE_LOC() + "/inbound/SDS_REQUEST/" + tst.getDate().getYear() + "/" + month + "/" + tst.getDate().getDay();

			File fileFolder = new File(logFolder);
			if (!fileFolder.exists())
				fileFolder.mkdirs();

			String fileName = logFolder + "/" + tst.toString(DateTimeFormat.MILLI) + ".msg";

			File f = new File(fileName);
			// Should always be unique, so append _instance until not found
			int inst = 1;
			while (f.exists())
			{
				if (fileName.indexOf(FILE_SEPARATOR) < 0)
					fileName = fileName.substring(0, fileName.indexOf(".msg")) + FILE_SEPARATOR + inst + ".msg";
				else
					fileName = fileName.substring(0, fileName.indexOf(FILE_SEPARATOR)) + FILE_SEPARATOR + inst + ".msg";
				inst++;

				f = new File(fileName);
			}
			FileOutputStream fout = new FileOutputStream(f);
			if (b != null)
				fout.write(b);
			fout.close();
		}
		catch (IOException e)
		{
			LOG.error("IOException occurred storing log message - " + e.getMessage(), e);
		}

	}
}

class PersonDetails
{
	String nhsgnc;  // National GP Code
	String uid;  // sdsId
	String givenName;  // Forename 
	String sn;  // Surname
	String uniqueIdentifier;  // sdsRoleId
	String nhsidcode;  // Another ID
	String practiceName;  // Practice Name?
	String personTitle;
	String nhsPersonStatus;
	String postalAddress;
	String postalCode;
	String nhspctCode;
	
	public String toString()
	{
		StringBuffer output = new StringBuffer();
		
		output.append("PersonDetails Record:\n");
		output.append("nhsgnc:" +nhsgnc + "\n");
		output.append("uid:" + uid + "\n");
		output.append("givenName:" + givenName + "\n");
		output.append("sn:" + sn + "\n");
		output.append("uniqueIdentifier:" + uniqueIdentifier + "\n");
		output.append("nhsidcode:" + nhsidcode + "\n");
		output.append("practiceName:" + practiceName + "\n");
		output.append("personTitle:" + personTitle + "\n");
		output.append("nhsPersonStatus:" + nhsPersonStatus + "\n");
		output.append("postalAddress:" + postalAddress + "\n");
		output.append("postalCode:" + postalCode + "\n");
		output.append("nhspctcode:" + nhspctCode + "\n");
		output.append("\n\n");
		return output.toString();
	}
}
