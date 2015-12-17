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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ChemotherapyCycleDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100005;
	private static final long serialVersionUID = 1074100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CycleNumber */
	private Integer cycleNumber;
	/** CycleStartDate */
	private java.util.Date cycleStartDate;
	/** CycleDuration */
	private Integer cycleDuration;
	/** DayDetails
	  * Collection of ims.oncology.domain.objects.ChemoTherapyDayDetails.
	  */
	private java.util.List dayDetails;
	/** Active? */
	private Boolean isActive;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ChemotherapyCycleDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ChemotherapyCycleDetails ()
    {
    	super();
    }
    public ChemotherapyCycleDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.ChemotherapyCycleDetails.class;
	}


	public Integer getCycleNumber() {
		return cycleNumber;
	}
	public void setCycleNumber(Integer cycleNumber) {
		this.cycleNumber = cycleNumber;
	}

	public java.util.Date getCycleStartDate() {
		return cycleStartDate;
	}
	public void setCycleStartDate(java.util.Date cycleStartDate) {
		this.cycleStartDate = cycleStartDate;
	}

	public Integer getCycleDuration() {
		return cycleDuration;
	}
	public void setCycleDuration(Integer cycleDuration) {
		this.cycleDuration = cycleDuration;
	}

	public java.util.List getDayDetails() {
		if ( null == dayDetails ) {
			dayDetails = new java.util.ArrayList();
		}
		return dayDetails;
	}
	public void setDayDetails(java.util.List paramValue) {
		this.dayDetails = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		
		auditStr.append("\r\n*cycleNumber* :");
		auditStr.append(cycleNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*cycleStartDate* :");
		auditStr.append(cycleStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cycleDuration* :");
		auditStr.append(cycleDuration);
	    auditStr.append("; ");
		auditStr.append("\r\n*dayDetails* :");
		if (dayDetails != null)
		{
		int i4=0;
		for (i4=0; i4<dayDetails.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.ChemoTherapyDayDetails obj = (ims.oncology.domain.objects.ChemoTherapyDayDetails)dayDetails.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
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
		
		String keyClassName = "ChemotherapyCycleDetails";
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
		if (this.getCycleNumber() != null)
		{
			sb.append("<cycleNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCycleNumber().toString()));
			sb.append("</cycleNumber>");		
		}
		if (this.getCycleStartDate() != null)
		{
			sb.append("<cycleStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCycleStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cycleStartDate>");		
		}
		if (this.getCycleDuration() != null)
		{
			sb.append("<cycleDuration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCycleDuration().toString()));
			sb.append("</cycleDuration>");		
		}
		if (this.getDayDetails() != null)
		{
			if (this.getDayDetails().size() > 0 )
			{
			sb.append("<dayDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDayDetails(), domMap));
			sb.append("</dayDetails>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
			ChemotherapyCycleDetails domainObject = getChemotherapyCycleDetailsfromXML(itemEl, factory, domMap);

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
			ChemotherapyCycleDetails domainObject = getChemotherapyCycleDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ChemotherapyCycleDetails getChemotherapyCycleDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getChemotherapyCycleDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ChemotherapyCycleDetails getChemotherapyCycleDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ChemotherapyCycleDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ChemotherapyCycleDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ChemotherapyCycleDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ChemotherapyCycleDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ChemotherapyCycleDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ChemotherapyCycleDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ChemotherapyCycleDetails)factory.getImportedDomainObject(ChemotherapyCycleDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ChemotherapyCycleDetails();
		}
		String keyClassName = "ChemotherapyCycleDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ChemotherapyCycleDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ChemotherapyCycleDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("cycleNumber");
		if(fldEl != null)
		{	
    		obj.setCycleNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cycleStartDate");
		if(fldEl != null)
		{	
    		obj.setCycleStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cycleDuration");
		if(fldEl != null)
		{	
    		obj.setCycleDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dayDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDayDetails(ims.oncology.domain.objects.ChemoTherapyDayDetails.fromListXMLString(fldEl, factory, obj.getDayDetails(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "dayDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CycleNumber = "cycleNumber";
		public static final String CycleStartDate = "cycleStartDate";
		public static final String CycleDuration = "cycleDuration";
		public static final String DayDetails = "dayDetails";
		public static final String IsActive = "isActive";
	}
}

