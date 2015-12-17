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


public class TrackStatusConfig extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1096100052;
	private static final long serialVersionUID = 1096100052L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Time into PACU  */
	private ims.framework.utils.Color timeintoPACU;
	/** Time Start anaesthetist time */
	private ims.framework.utils.Color timeStartAnaesthetist;
	/** TheatreIn */
	private ims.framework.utils.Color theatreIn;
	/** Surgery Start  */
	private ims.framework.utils.Color surgeryStart;
	/** Surgery Finish  */
	private ims.framework.utils.Color surgeryFinish;
	/** Time Into Recovery */
	private ims.framework.utils.Color timeIntoRecovery;
	/** Time Out Of Recovery */
	private ims.framework.utils.Color timeOutOfRecovery;
    public TrackStatusConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TrackStatusConfig ()
    {
    	super();
    }
    public TrackStatusConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.TrackStatusConfig.class;
	}


	public ims.framework.utils.Color getTimeintoPACU() {
		return timeintoPACU;
	}
	public void setTimeintoPACU(ims.framework.utils.Color timeintoPACU) {
		this.timeintoPACU = timeintoPACU;
	}

	public ims.framework.utils.Color getTimeStartAnaesthetist() {
		return timeStartAnaesthetist;
	}
	public void setTimeStartAnaesthetist(ims.framework.utils.Color timeStartAnaesthetist) {
		this.timeStartAnaesthetist = timeStartAnaesthetist;
	}

	public ims.framework.utils.Color getTheatreIn() {
		return theatreIn;
	}
	public void setTheatreIn(ims.framework.utils.Color theatreIn) {
		this.theatreIn = theatreIn;
	}

	public ims.framework.utils.Color getSurgeryStart() {
		return surgeryStart;
	}
	public void setSurgeryStart(ims.framework.utils.Color surgeryStart) {
		this.surgeryStart = surgeryStart;
	}

	public ims.framework.utils.Color getSurgeryFinish() {
		return surgeryFinish;
	}
	public void setSurgeryFinish(ims.framework.utils.Color surgeryFinish) {
		this.surgeryFinish = surgeryFinish;
	}

	public ims.framework.utils.Color getTimeIntoRecovery() {
		return timeIntoRecovery;
	}
	public void setTimeIntoRecovery(ims.framework.utils.Color timeIntoRecovery) {
		this.timeIntoRecovery = timeIntoRecovery;
	}

	public ims.framework.utils.Color getTimeOutOfRecovery() {
		return timeOutOfRecovery;
	}
	public void setTimeOutOfRecovery(ims.framework.utils.Color timeOutOfRecovery) {
		this.timeOutOfRecovery = timeOutOfRecovery;
	}

	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*timeintoPACU* :");
		auditStr.append(timeintoPACU);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeStartAnaesthetist* :");
		auditStr.append(timeStartAnaesthetist);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreIn* :");
		auditStr.append(theatreIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryStart* :");
		auditStr.append(surgeryStart);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryFinish* :");
		auditStr.append(surgeryFinish);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeIntoRecovery* :");
		auditStr.append(timeIntoRecovery);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOutOfRecovery* :");
		auditStr.append(timeOutOfRecovery);
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
		
		String keyClassName = "TrackStatusConfig";
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
		if (this.getTimeintoPACU() != null)
		{
			sb.append("<timeintoPACU>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeintoPACU().toString()));
			sb.append("</timeintoPACU>");		
		}
		if (this.getTimeStartAnaesthetist() != null)
		{
			sb.append("<timeStartAnaesthetist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeStartAnaesthetist().toString()));
			sb.append("</timeStartAnaesthetist>");		
		}
		if (this.getTheatreIn() != null)
		{
			sb.append("<theatreIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTheatreIn().toString()));
			sb.append("</theatreIn>");		
		}
		if (this.getSurgeryStart() != null)
		{
			sb.append("<surgeryStart>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurgeryStart().toString()));
			sb.append("</surgeryStart>");		
		}
		if (this.getSurgeryFinish() != null)
		{
			sb.append("<surgeryFinish>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurgeryFinish().toString()));
			sb.append("</surgeryFinish>");		
		}
		if (this.getTimeIntoRecovery() != null)
		{
			sb.append("<timeIntoRecovery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeIntoRecovery().toString()));
			sb.append("</timeIntoRecovery>");		
		}
		if (this.getTimeOutOfRecovery() != null)
		{
			sb.append("<timeOutOfRecovery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOutOfRecovery().toString()));
			sb.append("</timeOutOfRecovery>");		
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
			TrackStatusConfig domainObject = getTrackStatusConfigfromXML(itemEl, factory, domMap);

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
			TrackStatusConfig domainObject = getTrackStatusConfigfromXML(itemEl, factory, domMap);

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
		
	public static TrackStatusConfig getTrackStatusConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTrackStatusConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TrackStatusConfig getTrackStatusConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TrackStatusConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TrackStatusConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TrackStatusConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TrackStatusConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TrackStatusConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TrackStatusConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TrackStatusConfig)factory.getImportedDomainObject(TrackStatusConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TrackStatusConfig();
		}
		String keyClassName = "TrackStatusConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TrackStatusConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TrackStatusConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("timeintoPACU");
		if(fldEl != null)
		{	
    		obj.setTimeintoPACU(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("timeStartAnaesthetist");
		if(fldEl != null)
		{	
    		obj.setTimeStartAnaesthetist(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("theatreIn");
		if(fldEl != null)
		{	
    		obj.setTheatreIn(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("surgeryStart");
		if(fldEl != null)
		{	
    		obj.setSurgeryStart(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("surgeryFinish");
		if(fldEl != null)
		{	
    		obj.setSurgeryFinish(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("timeIntoRecovery");
		if(fldEl != null)
		{	
    		obj.setTimeIntoRecovery(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("timeOutOfRecovery");
		if(fldEl != null)
		{	
    		obj.setTimeOutOfRecovery(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
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
		public static final String TimeintoPACU = "timeintoPACU";
		public static final String TimeStartAnaesthetist = "timeStartAnaesthetist";
		public static final String TheatreIn = "theatreIn";
		public static final String SurgeryStart = "surgeryStart";
		public static final String SurgeryFinish = "surgeryFinish";
		public static final String TimeIntoRecovery = "timeIntoRecovery";
		public static final String TimeOutOfRecovery = "timeOutOfRecovery";
	}
}

