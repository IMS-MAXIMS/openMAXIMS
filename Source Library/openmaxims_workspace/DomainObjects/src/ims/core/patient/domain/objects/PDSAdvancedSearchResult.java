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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.core.patient.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSAdvancedSearchResult extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100017;
	private static final long serialVersionUID = 1001100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** NHSNumber */
	private String nHSNumber;
	/** Surname */
	private String surname;
	/** Upper Surname */
	private String upperSurname;
	/** Forename */
	private String forename;
	/** Upper Forename */
	private String upperForename;
	/** Preferred Name */
	private String preferredName;
	/** Gender */
	private ims.domain.lookups.LookupInstance gender;
	/** DateOfBirth */
	private java.util.Date dateOfBirth;
	/** Date Of Death */
	private java.util.Date dateOfDeath;
	/** Primary Care Info */
	private String primaryCareInfo;
	/** This item indicates the nature of any sensitivity information with regard to a Service User record on PDS */
	private String confidentialityCode;
	/** NHS Number Type */
	private ims.domain.lookups.LookupInstance nHSNumberType;
	/** Person Title */
	private ims.domain.lookups.LookupInstance title;
	/** Name Type Identifier */
	private ims.domain.lookups.LookupInstance nameType;
	private String namesuffix;
	/** A link to a CMET representing zero to many addresses
	  * Collection of ims.core.patient.domain.objects.PDSAddr.
	  */
	private java.util.List pDSAddresses;
	/** A link to a CMET representing zero to many telecommunication address
	  * Collection of ims.core.patient.domain.objects.PDSTel.
	  */
	private java.util.List pDSTellecoms;
	/** pdsErrCreationTime */
	private java.util.Date pdsErrCreationTime;
	/** pdsErrInteractionId */
	private String pdsErrInteractionId;
	/** pdsErrProcessingCode */
	private String pdsErrProcessingCode;
	/** pdsErrQueryResponseCode */
	private String pdsErrQueryResponseCode;
	/** pdsErrId */
	private String pdsErrId;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSAdvancedSearchResult (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSAdvancedSearchResult ()
    {
    	super();
    }
    public PDSAdvancedSearchResult (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PDSAdvancedSearchResult.class;
	}


	public String getNHSNumber() {
		return nHSNumber;
	}
	public void setNHSNumber(String nHSNumber) {
		if ( null != nHSNumber && nHSNumber.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumber. Tried to set value: "+
				nHSNumber);
		}
		this.nHSNumber = nHSNumber;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if ( null != surname && surname.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for surname. Tried to set value: "+
				surname);
		}
		this.surname = surname;
	}

	public String getUpperSurname() {
		return upperSurname;
	}
	public void setUpperSurname(String upperSurname) {
		if ( null != upperSurname && upperSurname.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperSurname. Tried to set value: "+
				upperSurname);
		}
		this.upperSurname = upperSurname;
	}

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		if ( null != forename && forename.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for forename. Tried to set value: "+
				forename);
		}
		this.forename = forename;
	}

	public String getUpperForename() {
		return upperForename;
	}
	public void setUpperForename(String upperForename) {
		if ( null != upperForename && upperForename.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperForename. Tried to set value: "+
				upperForename);
		}
		this.upperForename = upperForename;
	}

	public String getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(String preferredName) {
		if ( null != preferredName && preferredName.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for preferredName. Tried to set value: "+
				preferredName);
		}
		this.preferredName = preferredName;
	}

	public ims.domain.lookups.LookupInstance getGender() {
		return gender;
	}
	public void setGender(ims.domain.lookups.LookupInstance gender) {
		this.gender = gender;
	}

	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public java.util.Date getDateOfDeath() {
		return dateOfDeath;
	}
	public void setDateOfDeath(java.util.Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public String getPrimaryCareInfo() {
		return primaryCareInfo;
	}
	public void setPrimaryCareInfo(String primaryCareInfo) {
		if ( null != primaryCareInfo && primaryCareInfo.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for primaryCareInfo. Tried to set value: "+
				primaryCareInfo);
		}
		this.primaryCareInfo = primaryCareInfo;
	}

	public String getConfidentialityCode() {
		return confidentialityCode;
	}
	public void setConfidentialityCode(String confidentialityCode) {
		if ( null != confidentialityCode && confidentialityCode.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for confidentialityCode. Tried to set value: "+
				confidentialityCode);
		}
		this.confidentialityCode = confidentialityCode;
	}

	public ims.domain.lookups.LookupInstance getNHSNumberType() {
		return nHSNumberType;
	}
	public void setNHSNumberType(ims.domain.lookups.LookupInstance nHSNumberType) {
		this.nHSNumberType = nHSNumberType;
	}

	public ims.domain.lookups.LookupInstance getTitle() {
		return title;
	}
	public void setTitle(ims.domain.lookups.LookupInstance title) {
		this.title = title;
	}

	public ims.domain.lookups.LookupInstance getNameType() {
		return nameType;
	}
	public void setNameType(ims.domain.lookups.LookupInstance nameType) {
		this.nameType = nameType;
	}

	public String getNamesuffix() {
		return namesuffix;
	}
	public void setNamesuffix(String namesuffix) {
		if ( null != namesuffix && namesuffix.length() > 35 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for namesuffix. Tried to set value: "+
				namesuffix);
		}
		this.namesuffix = namesuffix;
	}

	public java.util.List getPDSAddresses() {
		if ( null == pDSAddresses ) {
			pDSAddresses = new java.util.ArrayList();
		}
		return pDSAddresses;
	}
	public void setPDSAddresses(java.util.List paramValue) {
		this.pDSAddresses = paramValue;
	}

	public java.util.List getPDSTellecoms() {
		if ( null == pDSTellecoms ) {
			pDSTellecoms = new java.util.ArrayList();
		}
		return pDSTellecoms;
	}
	public void setPDSTellecoms(java.util.List paramValue) {
		this.pDSTellecoms = paramValue;
	}

	public java.util.Date getPdsErrCreationTime() {
		return pdsErrCreationTime;
	}
	public void setPdsErrCreationTime(java.util.Date pdsErrCreationTime) {
		this.pdsErrCreationTime = pdsErrCreationTime;
	}

	public String getPdsErrInteractionId() {
		return pdsErrInteractionId;
	}
	public void setPdsErrInteractionId(String pdsErrInteractionId) {
		if ( null != pdsErrInteractionId && pdsErrInteractionId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pdsErrInteractionId. Tried to set value: "+
				pdsErrInteractionId);
		}
		this.pdsErrInteractionId = pdsErrInteractionId;
	}

	public String getPdsErrProcessingCode() {
		return pdsErrProcessingCode;
	}
	public void setPdsErrProcessingCode(String pdsErrProcessingCode) {
		if ( null != pdsErrProcessingCode && pdsErrProcessingCode.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pdsErrProcessingCode. Tried to set value: "+
				pdsErrProcessingCode);
		}
		this.pdsErrProcessingCode = pdsErrProcessingCode;
	}

	public String getPdsErrQueryResponseCode() {
		return pdsErrQueryResponseCode;
	}
	public void setPdsErrQueryResponseCode(String pdsErrQueryResponseCode) {
		if ( null != pdsErrQueryResponseCode && pdsErrQueryResponseCode.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pdsErrQueryResponseCode. Tried to set value: "+
				pdsErrQueryResponseCode);
		}
		this.pdsErrQueryResponseCode = pdsErrQueryResponseCode;
	}

	public String getPdsErrId() {
		return pdsErrId;
	}
	public void setPdsErrId(String pdsErrId) {
		if ( null != pdsErrId && pdsErrId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pdsErrId. Tried to set value: "+
				pdsErrId);
		}
		this.pdsErrId = pdsErrId;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*nHSNumber* :");
		auditStr.append(nHSNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*surname* :");
		auditStr.append(surname);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperSurname* :");
		auditStr.append(upperSurname);
	    auditStr.append("; ");
		auditStr.append("\r\n*forename* :");
		auditStr.append(forename);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperForename* :");
		auditStr.append(upperForename);
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredName* :");
		auditStr.append(preferredName);
	    auditStr.append("; ");
		auditStr.append("\r\n*gender* :");
		if (gender != null)
			auditStr.append(gender.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfBirth* :");
		auditStr.append(dateOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfDeath* :");
		auditStr.append(dateOfDeath);
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryCareInfo* :");
		auditStr.append(primaryCareInfo);
	    auditStr.append("; ");
		auditStr.append("\r\n*confidentialityCode* :");
		auditStr.append(confidentialityCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSNumberType* :");
		if (nHSNumberType != null)
			auditStr.append(nHSNumberType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*title* :");
		if (title != null)
			auditStr.append(title.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nameType* :");
		if (nameType != null)
			auditStr.append(nameType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*namesuffix* :");
		auditStr.append(namesuffix);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSAddresses* :");
		if (pDSAddresses != null)
		{
		int i16=0;
		for (i16=0; i16<pDSAddresses.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSAddr obj = (ims.core.patient.domain.objects.PDSAddr)pDSAddresses.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSTellecoms* :");
		if (pDSTellecoms != null)
		{
		int i17=0;
		for (i17=0; i17<pDSTellecoms.size(); i17++)
		{
			if (i17 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSTel obj = (ims.core.patient.domain.objects.PDSTel)pDSTellecoms.get(i17);
		    if (obj != null)
			{
				if (i17 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsErrCreationTime* :");
		auditStr.append(pdsErrCreationTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsErrInteractionId* :");
		auditStr.append(pdsErrInteractionId);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsErrProcessingCode* :");
		auditStr.append(pdsErrProcessingCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsErrQueryResponseCode* :");
		auditStr.append(pdsErrQueryResponseCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsErrId* :");
		auditStr.append(pdsErrId);
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "PDSAdvancedSearchResult";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getNHSNumber() != null)
		{
			sb.append("<nHSNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumber().toString()));
			sb.append("</nHSNumber>");		
		}
		if (this.getSurname() != null)
		{
			sb.append("<surname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurname().toString()));
			sb.append("</surname>");		
		}
		if (this.getUpperSurname() != null)
		{
			sb.append("<upperSurname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperSurname().toString()));
			sb.append("</upperSurname>");		
		}
		if (this.getForename() != null)
		{
			sb.append("<forename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForename().toString()));
			sb.append("</forename>");		
		}
		if (this.getUpperForename() != null)
		{
			sb.append("<upperForename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperForename().toString()));
			sb.append("</upperForename>");		
		}
		if (this.getPreferredName() != null)
		{
			sb.append("<preferredName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreferredName().toString()));
			sb.append("</preferredName>");		
		}
		if (this.getGender() != null)
		{
			sb.append("<gender>");
			sb.append(this.getGender().toXMLString()); 
			sb.append("</gender>");		
		}
		if (this.getDateOfBirth() != null)
		{
			sb.append("<dateOfBirth>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfBirth()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfBirth>");		
		}
		if (this.getDateOfDeath() != null)
		{
			sb.append("<dateOfDeath>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfDeath()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfDeath>");		
		}
		if (this.getPrimaryCareInfo() != null)
		{
			sb.append("<primaryCareInfo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrimaryCareInfo().toString()));
			sb.append("</primaryCareInfo>");		
		}
		if (this.getConfidentialityCode() != null)
		{
			sb.append("<confidentialityCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConfidentialityCode().toString()));
			sb.append("</confidentialityCode>");		
		}
		if (this.getNHSNumberType() != null)
		{
			sb.append("<nHSNumberType>");
			sb.append(this.getNHSNumberType().toXMLString()); 
			sb.append("</nHSNumberType>");		
		}
		if (this.getTitle() != null)
		{
			sb.append("<title>");
			sb.append(this.getTitle().toXMLString()); 
			sb.append("</title>");		
		}
		if (this.getNameType() != null)
		{
			sb.append("<nameType>");
			sb.append(this.getNameType().toXMLString()); 
			sb.append("</nameType>");		
		}
		if (this.getNamesuffix() != null)
		{
			sb.append("<namesuffix>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNamesuffix().toString()));
			sb.append("</namesuffix>");		
		}
		if (this.getPDSAddresses() != null)
		{
			if (this.getPDSAddresses().size() > 0 )
			{
			sb.append("<pDSAddresses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPDSAddresses(), domMap));
			sb.append("</pDSAddresses>");		
			}
		}
		if (this.getPDSTellecoms() != null)
		{
			if (this.getPDSTellecoms().size() > 0 )
			{
			sb.append("<pDSTellecoms>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPDSTellecoms(), domMap));
			sb.append("</pDSTellecoms>");		
			}
		}
		if (this.getPdsErrCreationTime() != null)
		{
			sb.append("<pdsErrCreationTime>");
			sb.append(new ims.framework.utils.DateTime(this.getPdsErrCreationTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</pdsErrCreationTime>");		
		}
		if (this.getPdsErrInteractionId() != null)
		{
			sb.append("<pdsErrInteractionId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPdsErrInteractionId().toString()));
			sb.append("</pdsErrInteractionId>");		
		}
		if (this.getPdsErrProcessingCode() != null)
		{
			sb.append("<pdsErrProcessingCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPdsErrProcessingCode().toString()));
			sb.append("</pdsErrProcessingCode>");		
		}
		if (this.getPdsErrQueryResponseCode() != null)
		{
			sb.append("<pdsErrQueryResponseCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPdsErrQueryResponseCode().toString()));
			sb.append("</pdsErrQueryResponseCode>");		
		}
		if (this.getPdsErrId() != null)
		{
			sb.append("<pdsErrId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPdsErrId().toString()));
			sb.append("</pdsErrId>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			PDSAdvancedSearchResult domainObject = getPDSAdvancedSearchResultfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			PDSAdvancedSearchResult domainObject = getPDSAdvancedSearchResultfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static PDSAdvancedSearchResult getPDSAdvancedSearchResultfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSAdvancedSearchResultfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSAdvancedSearchResult getPDSAdvancedSearchResultfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSAdvancedSearchResult.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSAdvancedSearchResult.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSAdvancedSearchResult class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSAdvancedSearchResult)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSAdvancedSearchResult.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSAdvancedSearchResult ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSAdvancedSearchResult)factory.getImportedDomainObject(PDSAdvancedSearchResult.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSAdvancedSearchResult();
		}
		String keyClassName = "PDSAdvancedSearchResult";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSAdvancedSearchResult)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSAdvancedSearchResult obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("nHSNumber");
		if(fldEl != null)
		{	
    		obj.setNHSNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surname");
		if(fldEl != null)
		{	
    		obj.setSurname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperSurname");
		if(fldEl != null)
		{	
    		obj.setUpperSurname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forename");
		if(fldEl != null)
		{	
    		obj.setForename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperForename");
		if(fldEl != null)
		{	
    		obj.setUpperForename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preferredName");
		if(fldEl != null)
		{	
    		obj.setPreferredName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gender");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGender(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateOfBirth");
		if(fldEl != null)
		{	
    		obj.setDateOfBirth(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateOfDeath");
		if(fldEl != null)
		{	
    		obj.setDateOfDeath(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("primaryCareInfo");
		if(fldEl != null)
		{	
    		obj.setPrimaryCareInfo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confidentialityCode");
		if(fldEl != null)
		{	
    		obj.setConfidentialityCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nHSNumberType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNHSNumberType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("title");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTitle(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nameType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNameType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("namesuffix");
		if(fldEl != null)
		{	
    		obj.setNamesuffix(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDSAddresses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPDSAddresses(ims.core.patient.domain.objects.PDSAddr.fromListXMLString(fldEl, factory, obj.getPDSAddresses(), domMap));
		}
		fldEl = el.element("pDSTellecoms");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPDSTellecoms(ims.core.patient.domain.objects.PDSTel.fromListXMLString(fldEl, factory, obj.getPDSTellecoms(), domMap));
		}
		fldEl = el.element("pdsErrCreationTime");
		if(fldEl != null)
		{	
    		obj.setPdsErrCreationTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pdsErrInteractionId");
		if(fldEl != null)
		{	
    		obj.setPdsErrInteractionId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsErrProcessingCode");
		if(fldEl != null)
		{	
    		obj.setPdsErrProcessingCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsErrQueryResponseCode");
		if(fldEl != null)
		{	
    		obj.setPdsErrQueryResponseCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsErrId");
		if(fldEl != null)
		{	
    		obj.setPdsErrId(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "pDSAddresses"
		, "pDSTellecoms"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String NHSNumber = "nHSNumber";
		public static final String Surname = "surname";
		public static final String UpperSurname = "upperSurname";
		public static final String Forename = "forename";
		public static final String UpperForename = "upperForename";
		public static final String PreferredName = "preferredName";
		public static final String Gender = "gender";
		public static final String DateOfBirth = "dateOfBirth";
		public static final String DateOfDeath = "dateOfDeath";
		public static final String PrimaryCareInfo = "primaryCareInfo";
		public static final String ConfidentialityCode = "confidentialityCode";
		public static final String NHSNumberType = "nHSNumberType";
		public static final String Title = "title";
		public static final String NameType = "nameType";
		public static final String Namesuffix = "namesuffix";
		public static final String PDSAddresses = "pDSAddresses";
		public static final String PDSTellecoms = "pDSTellecoms";
		public static final String PdsErrCreationTime = "pdsErrCreationTime";
		public static final String PdsErrInteractionId = "pdsErrInteractionId";
		public static final String PdsErrProcessingCode = "pdsErrProcessingCode";
		public static final String PdsErrQueryResponseCode = "pdsErrQueryResponseCode";
		public static final String PdsErrId = "pdsErrId";
	}
}

