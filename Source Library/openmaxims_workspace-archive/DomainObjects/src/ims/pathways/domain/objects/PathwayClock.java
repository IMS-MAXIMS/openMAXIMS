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
package ims.pathways.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PathwayClock extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1088100005;
	private static final long serialVersionUID = 1088100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** External Pathway/Clock ID */
	private String extClockId;
	/** Pathway Identifier passed from PAS */
	private String extClockName;
	/** Clock Start Date */
	private java.util.Date startDate;
	/** Clock Stop Date */
	private java.util.Date stopDate;
	/** Pause Details if any
	  * Collection of ims.pathways.domain.objects.PauseDetails.
	  */
	private java.util.List pauseDetails;
	/** The current pause record */
	private ims.pathways.domain.objects.PauseDetails currentPause;
	/** Current RTTStatus */
	private ims.pathways.domain.objects.PathwayRTTStatus currentRTTStatus;
	/** RTTStatus History
	  * Collection of ims.pathways.domain.objects.PathwayRTTStatus.
	  */
	private java.util.List rTTStatusHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PathwayClock (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PathwayClock ()
    {
    	super();
    }
    public PathwayClock (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.domain.objects.PathwayClock.class;
	}


	public String getExtClockId() {
		return extClockId;
	}
	public void setExtClockId(String extClockId) {
		if ( null != extClockId && extClockId.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for extClockId. Tried to set value: "+
				extClockId);
		}
		this.extClockId = extClockId;
	}

	public String getExtClockName() {
		return extClockName;
	}
	public void setExtClockName(String extClockName) {
		if ( null != extClockName && extClockName.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for extClockName. Tried to set value: "+
				extClockName);
		}
		this.extClockName = extClockName;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getStopDate() {
		return stopDate;
	}
	public void setStopDate(java.util.Date stopDate) {
		this.stopDate = stopDate;
	}

	public java.util.List getPauseDetails() {
		if ( null == pauseDetails ) {
			pauseDetails = new java.util.ArrayList();
		}
		return pauseDetails;
	}
	public void setPauseDetails(java.util.List paramValue) {
		this.pauseDetails = paramValue;
	}

	public ims.pathways.domain.objects.PauseDetails getCurrentPause() {
		return currentPause;
	}
	public void setCurrentPause(ims.pathways.domain.objects.PauseDetails currentPause) {
		this.currentPause = currentPause;
	}

	public ims.pathways.domain.objects.PathwayRTTStatus getCurrentRTTStatus() {
		return currentRTTStatus;
	}
	public void setCurrentRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus currentRTTStatus) {
		this.currentRTTStatus = currentRTTStatus;
	}

	public java.util.List getRTTStatusHistory() {
		if ( null == rTTStatusHistory ) {
			rTTStatusHistory = new java.util.ArrayList();
		}
		return rTTStatusHistory;
	}
	public void setRTTStatusHistory(java.util.List paramValue) {
		this.rTTStatusHistory = paramValue;
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
		
		auditStr.append("\r\n*extClockId* :");
		auditStr.append(extClockId);
	    auditStr.append("; ");
		auditStr.append("\r\n*extClockName* :");
		auditStr.append(extClockName);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*stopDate* :");
		auditStr.append(stopDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*pauseDetails* :");
		if (pauseDetails != null)
		{
		int i5=0;
		for (i5=0; i5<pauseDetails.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.pathways.domain.objects.PauseDetails obj = (ims.pathways.domain.objects.PauseDetails)pauseDetails.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentPause* :");
		if (currentPause != null)
		{
			auditStr.append(toShortClassName(currentPause));
				
		    auditStr.append(currentPause.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentRTTStatus* :");
		if (currentRTTStatus != null)
		{
			auditStr.append(toShortClassName(currentRTTStatus));
				
		    auditStr.append(currentRTTStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTStatusHistory* :");
		if (rTTStatusHistory != null)
		{
		int i8=0;
		for (i8=0; i8<rTTStatusHistory.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.pathways.domain.objects.PathwayRTTStatus obj = (ims.pathways.domain.objects.PathwayRTTStatus)rTTStatusHistory.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
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
		
		String keyClassName = "PathwayClock";
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
		if (this.getExtClockId() != null)
		{
			sb.append("<extClockId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtClockId().toString()));
			sb.append("</extClockId>");		
		}
		if (this.getExtClockName() != null)
		{
			sb.append("<extClockName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtClockName().toString()));
			sb.append("</extClockName>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getStopDate() != null)
		{
			sb.append("<stopDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStopDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</stopDate>");		
		}
		if (this.getPauseDetails() != null)
		{
			if (this.getPauseDetails().size() > 0 )
			{
			sb.append("<pauseDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPauseDetails(), domMap));
			sb.append("</pauseDetails>");		
			}
		}
		if (this.getCurrentPause() != null)
		{
			sb.append("<currentPause>");
			sb.append(this.getCurrentPause().toXMLString(domMap)); 	
			sb.append("</currentPause>");		
		}
		if (this.getCurrentRTTStatus() != null)
		{
			sb.append("<currentRTTStatus>");
			sb.append(this.getCurrentRTTStatus().toXMLString(domMap)); 	
			sb.append("</currentRTTStatus>");		
		}
		if (this.getRTTStatusHistory() != null)
		{
			if (this.getRTTStatusHistory().size() > 0 )
			{
			sb.append("<rTTStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRTTStatusHistory(), domMap));
			sb.append("</rTTStatusHistory>");		
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
			PathwayClock domainObject = getPathwayClockfromXML(itemEl, factory, domMap);

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
			PathwayClock domainObject = getPathwayClockfromXML(itemEl, factory, domMap);

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
		
	public static PathwayClock getPathwayClockfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPathwayClockfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PathwayClock getPathwayClockfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PathwayClock.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PathwayClock.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PathwayClock class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PathwayClock)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PathwayClock.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PathwayClock ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PathwayClock)factory.getImportedDomainObject(PathwayClock.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PathwayClock();
		}
		String keyClassName = "PathwayClock";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PathwayClock)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PathwayClock obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("extClockId");
		if(fldEl != null)
		{	
    		obj.setExtClockId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("extClockName");
		if(fldEl != null)
		{	
    		obj.setExtClockName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("stopDate");
		if(fldEl != null)
		{	
    		obj.setStopDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pauseDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPauseDetails(ims.pathways.domain.objects.PauseDetails.fromListXMLString(fldEl, factory, obj.getPauseDetails(), domMap));
		}
		fldEl = el.element("currentPause");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentPause(ims.pathways.domain.objects.PauseDetails.getPauseDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentRTTStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus.getPathwayRTTStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rTTStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRTTStatusHistory(ims.pathways.domain.objects.PathwayRTTStatus.fromListXMLString(fldEl, factory, obj.getRTTStatusHistory(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "pauseDetails"
		, "rTTStatusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ExtClockId = "extClockId";
		public static final String ExtClockName = "extClockName";
		public static final String StartDate = "startDate";
		public static final String StopDate = "stopDate";
		public static final String PauseDetails = "pauseDetails";
		public static final String CurrentPause = "currentPause";
		public static final String CurrentRTTStatus = "currentRTTStatus";
		public static final String RTTStatusHistory = "rTTStatusHistory";
	}
}

