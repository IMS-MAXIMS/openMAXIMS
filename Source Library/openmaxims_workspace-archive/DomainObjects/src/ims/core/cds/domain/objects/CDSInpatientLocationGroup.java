//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.core.cds.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class CDSInpatientLocationGroup extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1104100002;
	private static final long serialVersionUID = 1104100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}

	/**  Location Class */
	private String locationClass;
	/** Site Code of Treatment */
	private String siteCodeTreatment;
	/** Intended Clinical Care Intensity */
	private String intendedCCIntensity;
	/** Age Group Intended */
	private String ageGroupIntended;
	/** Sex of Patients */
	private String sexOfPatients;
	/** Ward Day Period Availability */
	private String wardDayAvail;
	/** Ward Night Period Availability */
	private String wardNightAvail;
	/**  Start Date */
	private java.util.Date startDate;
	/**  End Date */
	private java.util.Date endDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CDSInpatientLocationGroup (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CDSInpatientLocationGroup ()
    {
    	super();
    }
    public CDSInpatientLocationGroup (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.cds.domain.objects.CDSInpatientLocationGroup.class;
	}


	public String getLocationClass() {
		return locationClass;
	}
	public void setLocationClass(String locationClass) {
		if ( null != locationClass && locationClass.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locationClass. Tried to set value: "+
				locationClass);
		}
		this.locationClass = locationClass;
	}

	public String getSiteCodeTreatment() {
		return siteCodeTreatment;
	}
	public void setSiteCodeTreatment(String siteCodeTreatment) {
		if ( null != siteCodeTreatment && siteCodeTreatment.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for siteCodeTreatment. Tried to set value: "+
				siteCodeTreatment);
		}
		this.siteCodeTreatment = siteCodeTreatment;
	}

	public String getIntendedCCIntensity() {
		return intendedCCIntensity;
	}
	public void setIntendedCCIntensity(String intendedCCIntensity) {
		if ( null != intendedCCIntensity && intendedCCIntensity.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for intendedCCIntensity. Tried to set value: "+
				intendedCCIntensity);
		}
		this.intendedCCIntensity = intendedCCIntensity;
	}

	public String getAgeGroupIntended() {
		return ageGroupIntended;
	}
	public void setAgeGroupIntended(String ageGroupIntended) {
		if ( null != ageGroupIntended && ageGroupIntended.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ageGroupIntended. Tried to set value: "+
				ageGroupIntended);
		}
		this.ageGroupIntended = ageGroupIntended;
	}

	public String getSexOfPatients() {
		return sexOfPatients;
	}
	public void setSexOfPatients(String sexOfPatients) {
		if ( null != sexOfPatients && sexOfPatients.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sexOfPatients. Tried to set value: "+
				sexOfPatients);
		}
		this.sexOfPatients = sexOfPatients;
	}

	public String getWardDayAvail() {
		return wardDayAvail;
	}
	public void setWardDayAvail(String wardDayAvail) {
		if ( null != wardDayAvail && wardDayAvail.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wardDayAvail. Tried to set value: "+
				wardDayAvail);
		}
		this.wardDayAvail = wardDayAvail;
	}

	public String getWardNightAvail() {
		return wardNightAvail;
	}
	public void setWardNightAvail(String wardNightAvail) {
		if ( null != wardNightAvail && wardNightAvail.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wardNightAvail. Tried to set value: "+
				wardNightAvail);
		}
		this.wardNightAvail = wardNightAvail;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
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
		
		auditStr.append("\r\n*locationClass* :");
		auditStr.append(locationClass);
	    auditStr.append("; ");
		auditStr.append("\r\n*siteCodeTreatment* :");
		auditStr.append(siteCodeTreatment);
	    auditStr.append("; ");
		auditStr.append("\r\n*intendedCCIntensity* :");
		auditStr.append(intendedCCIntensity);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageGroupIntended* :");
		auditStr.append(ageGroupIntended);
	    auditStr.append("; ");
		auditStr.append("\r\n*sexOfPatients* :");
		auditStr.append(sexOfPatients);
	    auditStr.append("; ");
		auditStr.append("\r\n*wardDayAvail* :");
		auditStr.append(wardDayAvail);
	    auditStr.append("; ");
		auditStr.append("\r\n*wardNightAvail* :");
		auditStr.append(wardNightAvail);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
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
		
		String keyClassName = "CDSInpatientLocationGroup";
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
		if (this.getLocationClass() != null)
		{
			sb.append("<locationClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocationClass().toString()));
			sb.append("</locationClass>");		
		}
		if (this.getSiteCodeTreatment() != null)
		{
			sb.append("<siteCodeTreatment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteCodeTreatment().toString()));
			sb.append("</siteCodeTreatment>");		
		}
		if (this.getIntendedCCIntensity() != null)
		{
			sb.append("<intendedCCIntensity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntendedCCIntensity().toString()));
			sb.append("</intendedCCIntensity>");		
		}
		if (this.getAgeGroupIntended() != null)
		{
			sb.append("<ageGroupIntended>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeGroupIntended().toString()));
			sb.append("</ageGroupIntended>");		
		}
		if (this.getSexOfPatients() != null)
		{
			sb.append("<sexOfPatients>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSexOfPatients().toString()));
			sb.append("</sexOfPatients>");		
		}
		if (this.getWardDayAvail() != null)
		{
			sb.append("<wardDayAvail>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWardDayAvail().toString()));
			sb.append("</wardDayAvail>");		
		}
		if (this.getWardNightAvail() != null)
		{
			sb.append("<wardNightAvail>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWardNightAvail().toString()));
			sb.append("</wardNightAvail>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
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
			CDSInpatientLocationGroup domainObject = getCDSInpatientLocationGroupfromXML(itemEl, factory, domMap);

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
			CDSInpatientLocationGroup domainObject = getCDSInpatientLocationGroupfromXML(itemEl, factory, domMap);

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
		
	public static CDSInpatientLocationGroup getCDSInpatientLocationGroupfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCDSInpatientLocationGroupfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CDSInpatientLocationGroup getCDSInpatientLocationGroupfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CDSInpatientLocationGroup.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CDSInpatientLocationGroup.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CDSInpatientLocationGroup class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CDSInpatientLocationGroup)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CDSInpatientLocationGroup.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CDSInpatientLocationGroup ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CDSInpatientLocationGroup)factory.getImportedDomainObject(CDSInpatientLocationGroup.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CDSInpatientLocationGroup();
		}
		String keyClassName = "CDSInpatientLocationGroup";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CDSInpatientLocationGroup)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CDSInpatientLocationGroup obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("locationClass");
		if(fldEl != null)
		{	
    		obj.setLocationClass(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("siteCodeTreatment");
		if(fldEl != null)
		{	
    		obj.setSiteCodeTreatment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intendedCCIntensity");
		if(fldEl != null)
		{	
    		obj.setIntendedCCIntensity(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ageGroupIntended");
		if(fldEl != null)
		{	
    		obj.setAgeGroupIntended(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sexOfPatients");
		if(fldEl != null)
		{	
    		obj.setSexOfPatients(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wardDayAvail");
		if(fldEl != null)
		{	
    		obj.setWardDayAvail(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wardNightAvail");
		if(fldEl != null)
		{	
    		obj.setWardNightAvail(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String LocationClass = "locationClass";
		public static final String SiteCodeTreatment = "siteCodeTreatment";
		public static final String IntendedCCIntensity = "intendedCCIntensity";
		public static final String AgeGroupIntended = "ageGroupIntended";
		public static final String SexOfPatients = "sexOfPatients";
		public static final String WardDayAvail = "wardDayAvail";
		public static final String WardNightAvail = "wardNightAvail";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
	}
}

