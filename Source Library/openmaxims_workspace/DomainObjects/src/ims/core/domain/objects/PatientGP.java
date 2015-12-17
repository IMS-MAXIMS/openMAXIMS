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
package ims.core.domain.objects;

/**
 * 
 * @author Vasile Purdila
 * Generated.
 */


public class PatientGP extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1000100007;
	private static final long serialVersionUID = 1000100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** A coded value to distinguish different types of patient care provision.  */
	private ims.domain.lookups.LookupInstance lkp_provisiontype;
	/** Identifier for the primary care organisation with which the patient is registered. */
	private String primaryCareIdentifier;
	/** Object identifier - UID */
	private String objectidentifier;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private java.util.Date beffdate;
	/** Beffdate confirmed */
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	/** Betdate confirmed */
	private Boolean betdatecnf;
	/** reference to internal gp record */
	private ims.core.resource.people.domain.objects.Gp gp;
	/** reference to practice record */
	private ims.core.resource.place.domain.objects.Organisation practice;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientGP (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientGP ()
    {
    	super();
    }
    public PatientGP (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.domain.objects.PatientGP.class;
	}


	public ims.domain.lookups.LookupInstance getLkp_provisiontype() {
		return lkp_provisiontype;
	}
	public void setLkp_provisiontype(ims.domain.lookups.LookupInstance lkp_provisiontype) {
		this.lkp_provisiontype = lkp_provisiontype;
	}

	public String getPrimaryCareIdentifier() {
		return primaryCareIdentifier;
	}
	public void setPrimaryCareIdentifier(String primaryCareIdentifier) {
		if ( null != primaryCareIdentifier && primaryCareIdentifier.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for primaryCareIdentifier. Tried to set value: "+
				primaryCareIdentifier);
		}
		this.primaryCareIdentifier = primaryCareIdentifier;
	}

	public String getObjectidentifier() {
		return objectidentifier;
	}
	public void setObjectidentifier(String objectidentifier) {
		if ( null != objectidentifier && objectidentifier.length() > 14 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for objectidentifier. Tried to set value: "+
				objectidentifier);
		}
		this.objectidentifier = objectidentifier;
	}

	public java.util.Date getBeffdate() {
		return beffdate;
	}
	public void setBeffdate(java.util.Date beffdate) {
		this.beffdate = beffdate;
	}

	public Boolean isBeffdatecnf() {
		return beffdatecnf;
	}
	public void setBeffdatecnf(Boolean beffdatecnf) {
		this.beffdatecnf = beffdatecnf;
	}

	public java.util.Date getBetdate() {
		return betdate;
	}
	public void setBetdate(java.util.Date betdate) {
		this.betdate = betdate;
	}

	public Boolean isBetdatecnf() {
		return betdatecnf;
	}
	public void setBetdatecnf(Boolean betdatecnf) {
		this.betdatecnf = betdatecnf;
	}

	public ims.core.resource.people.domain.objects.Gp getGp() {
		return gp;
	}
	public void setGp(ims.core.resource.people.domain.objects.Gp gp) {
		this.gp = gp;
	}

	public ims.core.resource.place.domain.objects.Organisation getPractice() {
		return practice;
	}
	public void setPractice(ims.core.resource.place.domain.objects.Organisation practice) {
		this.practice = practice;
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
		
		auditStr.append("\r\n*lkp_provisiontype* :");
		if (lkp_provisiontype != null)
			auditStr.append(lkp_provisiontype.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryCareIdentifier* :");
		auditStr.append(primaryCareIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectidentifier* :");
		auditStr.append(objectidentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdate* :");
		auditStr.append(beffdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdatecnf* :");
		auditStr.append(beffdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdate* :");
		auditStr.append(betdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdatecnf* :");
		auditStr.append(betdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*gp* :");
		if (gp != null)
		{
			auditStr.append(toShortClassName(gp));
				
		    auditStr.append(gp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*practice* :");
		if (practice != null)
		{
			auditStr.append(toShortClassName(practice));
				
		    auditStr.append(practice.getId());
		}
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
		
		String keyClassName = "PatientGP";
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
		if (this.getLkp_provisiontype() != null)
		{
			sb.append("<lkp_provisiontype>");
			sb.append(this.getLkp_provisiontype().toXMLString()); 
			sb.append("</lkp_provisiontype>");		
		}
		if (this.getPrimaryCareIdentifier() != null)
		{
			sb.append("<primaryCareIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrimaryCareIdentifier().toString()));
			sb.append("</primaryCareIdentifier>");		
		}
		if (this.getObjectidentifier() != null)
		{
			sb.append("<objectidentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectidentifier().toString()));
			sb.append("</objectidentifier>");		
		}
		if (this.getBeffdate() != null)
		{
			sb.append("<beffdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBeffdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</beffdate>");		
		}
		if (this.isBeffdatecnf() != null)
		{
			sb.append("<beffdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBeffdatecnf().toString()));
			sb.append("</beffdatecnf>");		
		}
		if (this.getBetdate() != null)
		{
			sb.append("<betdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBetdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</betdate>");		
		}
		if (this.isBetdatecnf() != null)
		{
			sb.append("<betdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBetdatecnf().toString()));
			sb.append("</betdatecnf>");		
		}
		if (this.getGp() != null)
		{
			sb.append("<gp>");
			sb.append(this.getGp().toXMLString(domMap)); 	
			sb.append("</gp>");		
		}
		if (this.getPractice() != null)
		{
			sb.append("<practice>");
			sb.append(this.getPractice().toXMLString(domMap)); 	
			sb.append("</practice>");		
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
			PatientGP domainObject = getPatientGPfromXML(itemEl, factory, domMap);

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
			PatientGP domainObject = getPatientGPfromXML(itemEl, factory, domMap);

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
		
	public static PatientGP getPatientGPfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientGPfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientGP getPatientGPfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientGP.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientGP.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientGP class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientGP)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientGP.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientGP ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientGP)factory.getImportedDomainObject(PatientGP.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientGP();
		}
		String keyClassName = "PatientGP";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientGP)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientGP obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("lkp_provisiontype");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLkp_provisiontype(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primaryCareIdentifier");
		if(fldEl != null)
		{	
    		obj.setPrimaryCareIdentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectidentifier");
		if(fldEl != null)
		{	
    		obj.setObjectidentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("beffdate");
		if(fldEl != null)
		{	
    		obj.setBeffdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("beffdatecnf");
		if(fldEl != null)
		{	
    		obj.setBeffdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("betdate");
		if(fldEl != null)
		{	
    		obj.setBetdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("betdatecnf");
		if(fldEl != null)
		{	
    		obj.setBetdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("practice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPractice(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Lkp_provisiontype = "lkp_provisiontype";
		public static final String PrimaryCareIdentifier = "primaryCareIdentifier";
		public static final String Objectidentifier = "objectidentifier";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String Gp = "gp";
		public static final String Practice = "practice";
	}
}

