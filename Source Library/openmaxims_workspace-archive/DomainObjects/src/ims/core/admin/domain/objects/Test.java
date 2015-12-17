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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class Test extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable , ims.framework.interfaces.IEntityNotification{
	public static final int CLASSID = 1004100042;
	private static final long serialVersionUID = 1004100042L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String stringField;
	private Integer intField;
	private Boolean booleanField;
	private java.lang.Float decimalField;
	private java.util.Date dateField;
	private String timeField;
	private java.util.Date dateTimeField;
	private Integer partialDateField;
	/** 
	  * Collection of ims.core.admin.domain.objects.TestColl.
	  */
	private java.util.Set testColl;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Test (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Test ()
    {
    	super();
    }
    public Test (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.Test.class;
	}


	public String getStringField() {
		return stringField;
	}
	public void setStringField(String stringField) {
		if ( null != stringField && stringField.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for stringField. Tried to set value: "+
				stringField);
		}
		this.stringField = stringField;
	}

	public Integer getIntField() {
		return intField;
	}
	public void setIntField(Integer intField) {
		this.intField = intField;
	}

	public Boolean isBooleanField() {
		return booleanField;
	}
	public void setBooleanField(Boolean booleanField) {
		this.booleanField = booleanField;
	}

	public java.lang.Float getDecimalField() {
		return decimalField;
	}
	public void setDecimalField(java.lang.Float decimalField) {
		this.decimalField = decimalField;
	}

	public java.util.Date getDateField() {
		return dateField;
	}
	public void setDateField(java.util.Date dateField) {
		this.dateField = dateField;
	}

	public String getTimeField() {
		return timeField;
	}
	public void setTimeField(String timeField) {
		this.timeField = timeField;
	}

	public java.util.Date getDateTimeField() {
		return dateTimeField;
	}
	public void setDateTimeField(java.util.Date dateTimeField) {
		this.dateTimeField = dateTimeField;
	}

	public Integer getPartialDateField() {
		return partialDateField;
	}
	public void setPartialDateField(Integer partialDateField) {
		this.partialDateField = partialDateField;
	}

	public java.util.Set getTestColl() {
		if ( null == testColl ) {
			testColl = new java.util.HashSet();
		}
		return testColl;
	}
	public void setTestColl(java.util.Set paramValue) {
		this.testColl = paramValue;
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
		
		auditStr.append("\r\n*stringField* :");
		auditStr.append(stringField);
	    auditStr.append("; ");
		auditStr.append("\r\n*intField* :");
		auditStr.append(intField);
	    auditStr.append("; ");
		auditStr.append("\r\n*booleanField* :");
		auditStr.append(booleanField);
	    auditStr.append("; ");
		auditStr.append("\r\n*decimalField* :");
		auditStr.append(decimalField);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateField* :");
		auditStr.append(dateField);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeField* :");
		auditStr.append(timeField);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeField* :");
		auditStr.append(dateTimeField);
	    auditStr.append("; ");
		auditStr.append("\r\n*partialDateField* :");
		auditStr.append(partialDateField);
	    auditStr.append("; ");
		auditStr.append("\r\n*testColl* :");
		if (testColl != null)
		{
			java.util.Iterator it9 = testColl.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.TestColl obj = (ims.core.admin.domain.objects.TestColl)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
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
		
		String keyClassName = "Test";
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
		if (this.getStringField() != null)
		{
			sb.append("<stringField>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStringField().toString()));
			sb.append("</stringField>");		
		}
		if (this.getIntField() != null)
		{
			sb.append("<intField>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntField().toString()));
			sb.append("</intField>");		
		}
		if (this.isBooleanField() != null)
		{
			sb.append("<booleanField>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBooleanField().toString()));
			sb.append("</booleanField>");		
		}
		if (this.getDecimalField() != null)
		{
			sb.append("<decimalField>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDecimalField().toString()));
			sb.append("</decimalField>");		
		}
		if (this.getDateField() != null)
		{
			sb.append("<dateField>");
			sb.append(new ims.framework.utils.DateTime(this.getDateField()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateField>");		
		}
		if (this.getTimeField() != null)
		{
			sb.append("<timeField>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeField().toString()));
			sb.append("</timeField>");		
		}
		if (this.getDateTimeField() != null)
		{
			sb.append("<dateTimeField>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeField()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeField>");		
		}
		if (this.getPartialDateField() != null)
		{
			sb.append("<partialDateField>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPartialDateField().toString()));
			sb.append("</partialDateField>");		
		}
		if (this.getTestColl() != null)
		{
			if (this.getTestColl().size() > 0 )
			{
			sb.append("<testColl>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTestColl(), domMap));
			sb.append("</testColl>");		
			}
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
			Test domainObject = getTestfromXML(itemEl, factory, domMap);

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
			Test domainObject = getTestfromXML(itemEl, factory, domMap);

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
		
	public static Test getTestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Test getTestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Test.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Test.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Test class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Test)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Test.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Test ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Test)factory.getImportedDomainObject(Test.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Test();
		}
		String keyClassName = "Test";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Test)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Test obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("stringField");
		if(fldEl != null)
		{	
    		obj.setStringField(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intField");
		if(fldEl != null)
		{	
    		obj.setIntField(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("booleanField");
		if(fldEl != null)
		{	
    		obj.setBooleanField(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("decimalField");
		if(fldEl != null)
		{	
    		obj.setDecimalField(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateField");
		if(fldEl != null)
		{	
    		obj.setDateField(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeField");
		if(fldEl != null)
		{	
    		obj.setTimeField(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateTimeField");
		if(fldEl != null)
		{	
    		obj.setDateTimeField(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("partialDateField");
		if(fldEl != null)
		{	
    		obj.setPartialDateField(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("testColl");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTestColl(ims.core.admin.domain.objects.TestColl.fromSetXMLString(fldEl, factory, obj.getTestColl(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "testColl"
		};
	}

	/**
	INotification
	*/
public int[] getNotificationUserIds() {
int[] userIDs = new int[2];
userIDs[0] =15;
userIDs[1]=17;
return userIDs;
}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String StringField = "stringField";
		public static final String IntField = "intField";
		public static final String BooleanField = "booleanField";
		public static final String DecimalField = "decimalField";
		public static final String DateField = "dateField";
		public static final String TimeField = "timeField";
		public static final String DateTimeField = "dateTimeField";
		public static final String PartialDateField = "partialDateField";
		public static final String TestColl = "testColl";
	}
}

