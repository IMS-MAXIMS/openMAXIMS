/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TheatreTrackingIdleConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100056;
	private static final long serialVersionUID = 1096100056L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Idle Time in Mins from Time of Arrival */
	private Integer timeOfArrivalIdleMin;
	/** Idle Colour if Time of Arrival has exceeded  idle mins */
	private ims.framework.utils.Color timeOfArrivalIdleColour;
	/** Idle Time in Mins from Time into PACU */
	private Integer timeIntoPACUIdleMin;
	/** Idle Colour if Time into PACU has exceeded  idle mins */
	private ims.framework.utils.Color timeIntoPACUIdleColour;
	/** Idle Time in Mins from Time to Theatre */
	private Integer timeToTheatreIdleMin;
	/** Idle Colour if Time to Theatre has exceeded  idle mins */
	private ims.framework.utils.Color timeToTheatreIdleColour;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TheatreTrackingIdleConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TheatreTrackingIdleConfig ()
    {
    	super();
    }
    public TheatreTrackingIdleConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.TheatreTrackingIdleConfig.class;
	}


	public Integer getTimeOfArrivalIdleMin() {
		return timeOfArrivalIdleMin;
	}
	public void setTimeOfArrivalIdleMin(Integer timeOfArrivalIdleMin) {
		this.timeOfArrivalIdleMin = timeOfArrivalIdleMin;
	}

	public ims.framework.utils.Color getTimeOfArrivalIdleColour() {
		return timeOfArrivalIdleColour;
	}
	public void setTimeOfArrivalIdleColour(ims.framework.utils.Color timeOfArrivalIdleColour) {
		this.timeOfArrivalIdleColour = timeOfArrivalIdleColour;
	}

	public Integer getTimeIntoPACUIdleMin() {
		return timeIntoPACUIdleMin;
	}
	public void setTimeIntoPACUIdleMin(Integer timeIntoPACUIdleMin) {
		this.timeIntoPACUIdleMin = timeIntoPACUIdleMin;
	}

	public ims.framework.utils.Color getTimeIntoPACUIdleColour() {
		return timeIntoPACUIdleColour;
	}
	public void setTimeIntoPACUIdleColour(ims.framework.utils.Color timeIntoPACUIdleColour) {
		this.timeIntoPACUIdleColour = timeIntoPACUIdleColour;
	}

	public Integer getTimeToTheatreIdleMin() {
		return timeToTheatreIdleMin;
	}
	public void setTimeToTheatreIdleMin(Integer timeToTheatreIdleMin) {
		this.timeToTheatreIdleMin = timeToTheatreIdleMin;
	}

	public ims.framework.utils.Color getTimeToTheatreIdleColour() {
		return timeToTheatreIdleColour;
	}
	public void setTimeToTheatreIdleColour(ims.framework.utils.Color timeToTheatreIdleColour) {
		this.timeToTheatreIdleColour = timeToTheatreIdleColour;
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
		
		auditStr.append("\r\n*timeOfArrivalIdleMin* :");
		auditStr.append(timeOfArrivalIdleMin);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOfArrivalIdleColour* :");
		auditStr.append(timeOfArrivalIdleColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeIntoPACUIdleMin* :");
		auditStr.append(timeIntoPACUIdleMin);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeIntoPACUIdleColour* :");
		auditStr.append(timeIntoPACUIdleColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeToTheatreIdleMin* :");
		auditStr.append(timeToTheatreIdleMin);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeToTheatreIdleColour* :");
		auditStr.append(timeToTheatreIdleColour);
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
		
		String keyClassName = "TheatreTrackingIdleConfig";
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
		if (this.getTimeOfArrivalIdleMin() != null)
		{
			sb.append("<timeOfArrivalIdleMin>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOfArrivalIdleMin().toString()));
			sb.append("</timeOfArrivalIdleMin>");		
		}
		if (this.getTimeOfArrivalIdleColour() != null)
		{
			sb.append("<timeOfArrivalIdleColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOfArrivalIdleColour().toString()));
			sb.append("</timeOfArrivalIdleColour>");		
		}
		if (this.getTimeIntoPACUIdleMin() != null)
		{
			sb.append("<timeIntoPACUIdleMin>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeIntoPACUIdleMin().toString()));
			sb.append("</timeIntoPACUIdleMin>");		
		}
		if (this.getTimeIntoPACUIdleColour() != null)
		{
			sb.append("<timeIntoPACUIdleColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeIntoPACUIdleColour().toString()));
			sb.append("</timeIntoPACUIdleColour>");		
		}
		if (this.getTimeToTheatreIdleMin() != null)
		{
			sb.append("<timeToTheatreIdleMin>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeToTheatreIdleMin().toString()));
			sb.append("</timeToTheatreIdleMin>");		
		}
		if (this.getTimeToTheatreIdleColour() != null)
		{
			sb.append("<timeToTheatreIdleColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeToTheatreIdleColour().toString()));
			sb.append("</timeToTheatreIdleColour>");		
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
			TheatreTrackingIdleConfig domainObject = getTheatreTrackingIdleConfigfromXML(itemEl, factory, domMap);

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
			TheatreTrackingIdleConfig domainObject = getTheatreTrackingIdleConfigfromXML(itemEl, factory, domMap);

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
		
	public static TheatreTrackingIdleConfig getTheatreTrackingIdleConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTheatreTrackingIdleConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TheatreTrackingIdleConfig getTheatreTrackingIdleConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TheatreTrackingIdleConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TheatreTrackingIdleConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TheatreTrackingIdleConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TheatreTrackingIdleConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TheatreTrackingIdleConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TheatreTrackingIdleConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TheatreTrackingIdleConfig)factory.getImportedDomainObject(TheatreTrackingIdleConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TheatreTrackingIdleConfig();
		}
		String keyClassName = "TheatreTrackingIdleConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TheatreTrackingIdleConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TheatreTrackingIdleConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("timeOfArrivalIdleMin");
		if(fldEl != null)
		{	
    		obj.setTimeOfArrivalIdleMin(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeOfArrivalIdleColour");
		if(fldEl != null)
		{	
    		obj.setTimeOfArrivalIdleColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("timeIntoPACUIdleMin");
		if(fldEl != null)
		{	
    		obj.setTimeIntoPACUIdleMin(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeIntoPACUIdleColour");
		if(fldEl != null)
		{	
    		obj.setTimeIntoPACUIdleColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("timeToTheatreIdleMin");
		if(fldEl != null)
		{	
    		obj.setTimeToTheatreIdleMin(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeToTheatreIdleColour");
		if(fldEl != null)
		{	
    		obj.setTimeToTheatreIdleColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
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
		public static final String TimeOfArrivalIdleMin = "timeOfArrivalIdleMin";
		public static final String TimeOfArrivalIdleColour = "timeOfArrivalIdleColour";
		public static final String TimeIntoPACUIdleMin = "timeIntoPACUIdleMin";
		public static final String TimeIntoPACUIdleColour = "timeIntoPACUIdleColour";
		public static final String TimeToTheatreIdleMin = "timeToTheatreIdleMin";
		public static final String TimeToTheatreIdleColour = "timeToTheatreIdleColour";
	}
}

