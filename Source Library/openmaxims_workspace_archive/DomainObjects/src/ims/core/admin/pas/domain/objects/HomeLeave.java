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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class HomeLeave extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100017;
	private static final long serialVersionUID = 1014100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date Patient went On Home Leave */
	private java.util.Date dateOnHomeLeave;
	/** Time Patient went On Home Leave */
	private String timeOnHomeLeave;
	/** Expected Date Of Return */
	private java.util.Date expectedDateOfReturn;
	/** ExpectedTimeOfReturn */
	private String expectedTimeOfReturn;
	/** Date Patient Returned from Home Leave */
	private java.util.Date dateReturnedFromHomeLeave;
	/** Time Patient Returned From Home Leave */
	private String timeReturnedFromHomeLeave;
	/** VacatedBedNumber */
	private String vacatedBedNumber;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HomeLeave (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HomeLeave ()
    {
    	super();
    }
    public HomeLeave (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.HomeLeave.class;
	}


	public java.util.Date getDateOnHomeLeave() {
		return dateOnHomeLeave;
	}
	public void setDateOnHomeLeave(java.util.Date dateOnHomeLeave) {
		this.dateOnHomeLeave = dateOnHomeLeave;
	}

	public String getTimeOnHomeLeave() {
		return timeOnHomeLeave;
	}
	public void setTimeOnHomeLeave(String timeOnHomeLeave) {
		this.timeOnHomeLeave = timeOnHomeLeave;
	}

	public java.util.Date getExpectedDateOfReturn() {
		return expectedDateOfReturn;
	}
	public void setExpectedDateOfReturn(java.util.Date expectedDateOfReturn) {
		this.expectedDateOfReturn = expectedDateOfReturn;
	}

	public String getExpectedTimeOfReturn() {
		return expectedTimeOfReturn;
	}
	public void setExpectedTimeOfReturn(String expectedTimeOfReturn) {
		this.expectedTimeOfReturn = expectedTimeOfReturn;
	}

	public java.util.Date getDateReturnedFromHomeLeave() {
		return dateReturnedFromHomeLeave;
	}
	public void setDateReturnedFromHomeLeave(java.util.Date dateReturnedFromHomeLeave) {
		this.dateReturnedFromHomeLeave = dateReturnedFromHomeLeave;
	}

	public String getTimeReturnedFromHomeLeave() {
		return timeReturnedFromHomeLeave;
	}
	public void setTimeReturnedFromHomeLeave(String timeReturnedFromHomeLeave) {
		this.timeReturnedFromHomeLeave = timeReturnedFromHomeLeave;
	}

	public String getVacatedBedNumber() {
		return vacatedBedNumber;
	}
	public void setVacatedBedNumber(String vacatedBedNumber) {
		if ( null != vacatedBedNumber && vacatedBedNumber.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for vacatedBedNumber. Tried to set value: "+
				vacatedBedNumber);
		}
		this.vacatedBedNumber = vacatedBedNumber;
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
		
		auditStr.append("\r\n*dateOnHomeLeave* :");
		auditStr.append(dateOnHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOnHomeLeave* :");
		auditStr.append(timeOnHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedDateOfReturn* :");
		auditStr.append(expectedDateOfReturn);
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedTimeOfReturn* :");
		auditStr.append(expectedTimeOfReturn);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateReturnedFromHomeLeave* :");
		auditStr.append(dateReturnedFromHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeReturnedFromHomeLeave* :");
		auditStr.append(timeReturnedFromHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*vacatedBedNumber* :");
		auditStr.append(vacatedBedNumber);
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
		
		String keyClassName = "HomeLeave";
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
		if (this.getDateOnHomeLeave() != null)
		{
			sb.append("<dateOnHomeLeave>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOnHomeLeave()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOnHomeLeave>");		
		}
		if (this.getTimeOnHomeLeave() != null)
		{
			sb.append("<timeOnHomeLeave>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOnHomeLeave().toString()));
			sb.append("</timeOnHomeLeave>");		
		}
		if (this.getExpectedDateOfReturn() != null)
		{
			sb.append("<expectedDateOfReturn>");
			sb.append(new ims.framework.utils.DateTime(this.getExpectedDateOfReturn()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expectedDateOfReturn>");		
		}
		if (this.getExpectedTimeOfReturn() != null)
		{
			sb.append("<expectedTimeOfReturn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExpectedTimeOfReturn().toString()));
			sb.append("</expectedTimeOfReturn>");		
		}
		if (this.getDateReturnedFromHomeLeave() != null)
		{
			sb.append("<dateReturnedFromHomeLeave>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReturnedFromHomeLeave()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReturnedFromHomeLeave>");		
		}
		if (this.getTimeReturnedFromHomeLeave() != null)
		{
			sb.append("<timeReturnedFromHomeLeave>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeReturnedFromHomeLeave().toString()));
			sb.append("</timeReturnedFromHomeLeave>");		
		}
		if (this.getVacatedBedNumber() != null)
		{
			sb.append("<vacatedBedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVacatedBedNumber().toString()));
			sb.append("</vacatedBedNumber>");		
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
			HomeLeave domainObject = getHomeLeavefromXML(itemEl, factory, domMap);

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
			HomeLeave domainObject = getHomeLeavefromXML(itemEl, factory, domMap);

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
		
	public static HomeLeave getHomeLeavefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHomeLeavefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HomeLeave getHomeLeavefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HomeLeave.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HomeLeave.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HomeLeave class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HomeLeave)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HomeLeave.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HomeLeave ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HomeLeave)factory.getImportedDomainObject(HomeLeave.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HomeLeave();
		}
		String keyClassName = "HomeLeave";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HomeLeave)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HomeLeave obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateOnHomeLeave");
		if(fldEl != null)
		{	
    		obj.setDateOnHomeLeave(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeOnHomeLeave");
		if(fldEl != null)
		{	
    		obj.setTimeOnHomeLeave(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expectedDateOfReturn");
		if(fldEl != null)
		{	
    		obj.setExpectedDateOfReturn(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("expectedTimeOfReturn");
		if(fldEl != null)
		{	
    		obj.setExpectedTimeOfReturn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateReturnedFromHomeLeave");
		if(fldEl != null)
		{	
    		obj.setDateReturnedFromHomeLeave(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeReturnedFromHomeLeave");
		if(fldEl != null)
		{	
    		obj.setTimeReturnedFromHomeLeave(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vacatedBedNumber");
		if(fldEl != null)
		{	
    		obj.setVacatedBedNumber(new String(fldEl.getTextTrim()));	
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
		public static final String DateOnHomeLeave = "dateOnHomeLeave";
		public static final String TimeOnHomeLeave = "timeOnHomeLeave";
		public static final String ExpectedDateOfReturn = "expectedDateOfReturn";
		public static final String ExpectedTimeOfReturn = "expectedTimeOfReturn";
		public static final String DateReturnedFromHomeLeave = "dateReturnedFromHomeLeave";
		public static final String TimeReturnedFromHomeLeave = "timeReturnedFromHomeLeave";
		public static final String VacatedBedNumber = "vacatedBedNumber";
	}
}

