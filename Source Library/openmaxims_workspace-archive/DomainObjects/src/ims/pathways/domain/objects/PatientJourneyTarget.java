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
 * @author Barbara Worwood
 * Generated.
 */


public class PatientJourneyTarget extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1088100001;
	private static final long serialVersionUID = 1088100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Pathway Target */
	private ims.pathways.configuration.domain.objects.PathwayTarget pathwayTarget;
	/** Week number this target is due */
	private Integer weekNumber;
	/** Date in which this target is due */
	private java.util.Date targetDate;
	private ims.pathways.domain.objects.JourneyTargetStatus currentStatus;
	/** 
	  * Collection of ims.pathways.domain.objects.JourneyTargetStatus.
	  */
	private java.util.Set statusHistory;
	/** Associated Clock for the patient Journey target - A Pathway may have multiple clocks */
	private ims.pathways.domain.objects.PathwayClock journeyClock;
	/** AchievedDateTime */
	private java.util.Date achievedDate;
	/** Scheduled Date */
	private java.util.Date scheduledDate;
	/** This date will be set when the Pathway is deleted from Provider System */
	private java.util.Date cancelledDate;
	/** Flag to indicate Cancelled Events */
	private Boolean hasCancelledEvents;
	/** 
	  * Collection of ims.pathways.domain.objects.PatientEvent.
	  */
	private java.util.Set events;
	/** Patient Pathway Journey */
	private ims.pathways.domain.objects.PatientPathwayJourney pathwayJourney;
	/** Achieved Day/Week Variance */
	private Integer achievedVariance;
	/** Actual Date this target date was calculated from */
	private java.util.Date targetCalFromDate;
	/** Readjustments
	  * Collection of ims.pathways.domain.objects.TargetReadjustment.
	  */
	private java.util.Set readjustments;
	/** hasReadjustments */
	private Boolean hasReadjustments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientJourneyTarget (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientJourneyTarget ()
    {
    	super();
    }
    public PatientJourneyTarget (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.domain.objects.PatientJourneyTarget.class;
	}


	public ims.pathways.configuration.domain.objects.PathwayTarget getPathwayTarget() {
		return pathwayTarget;
	}
	public void setPathwayTarget(ims.pathways.configuration.domain.objects.PathwayTarget pathwayTarget) {
		this.pathwayTarget = pathwayTarget;
	}

	public Integer getWeekNumber() {
		return weekNumber;
	}
	public void setWeekNumber(Integer weekNumber) {
		this.weekNumber = weekNumber;
	}

	public java.util.Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(java.util.Date targetDate) {
		this.targetDate = targetDate;
	}

	public ims.pathways.domain.objects.JourneyTargetStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.pathways.domain.objects.JourneyTargetStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.pathways.domain.objects.PathwayClock getJourneyClock() {
		return journeyClock;
	}
	public void setJourneyClock(ims.pathways.domain.objects.PathwayClock journeyClock) {
		this.journeyClock = journeyClock;
	}

	public java.util.Date getAchievedDate() {
		return achievedDate;
	}
	public void setAchievedDate(java.util.Date achievedDate) {
		this.achievedDate = achievedDate;
	}

	public java.util.Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(java.util.Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public java.util.Date getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(java.util.Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public Boolean isHasCancelledEvents() {
		return hasCancelledEvents;
	}
	public void setHasCancelledEvents(Boolean hasCancelledEvents) {
		this.hasCancelledEvents = hasCancelledEvents;
	}

	public java.util.Set getEvents() {
		if ( null == events ) {
			events = new java.util.HashSet();
		}
		return events;
	}
	public void setEvents(java.util.Set paramValue) {
		this.events = paramValue;
	}

	public ims.pathways.domain.objects.PatientPathwayJourney getPathwayJourney() {
		return pathwayJourney;
	}
	public void setPathwayJourney(ims.pathways.domain.objects.PatientPathwayJourney pathwayJourney) {
		this.pathwayJourney = pathwayJourney;
	}

	public Integer getAchievedVariance() {
		return achievedVariance;
	}
	public void setAchievedVariance(Integer achievedVariance) {
		this.achievedVariance = achievedVariance;
	}

	public java.util.Date getTargetCalFromDate() {
		return targetCalFromDate;
	}
	public void setTargetCalFromDate(java.util.Date targetCalFromDate) {
		this.targetCalFromDate = targetCalFromDate;
	}

	public java.util.Set getReadjustments() {
		if ( null == readjustments ) {
			readjustments = new java.util.HashSet();
		}
		return readjustments;
	}
	public void setReadjustments(java.util.Set paramValue) {
		this.readjustments = paramValue;
	}

	public Boolean isHasReadjustments() {
		return hasReadjustments;
	}
	public void setHasReadjustments(Boolean hasReadjustments) {
		this.hasReadjustments = hasReadjustments;
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
		
		auditStr.append("\r\n*pathwayTarget* :");
		if (pathwayTarget != null)
		{
			auditStr.append(toShortClassName(pathwayTarget));
				
		    auditStr.append(pathwayTarget.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*weekNumber* :");
		auditStr.append(weekNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetDate* :");
		auditStr.append(targetDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
			java.util.Iterator it5 = statusHistory.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.JourneyTargetStatus obj = (ims.pathways.domain.objects.JourneyTargetStatus)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*journeyClock* :");
		if (journeyClock != null)
		{
			auditStr.append(toShortClassName(journeyClock));
				
		    auditStr.append(journeyClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*achievedDate* :");
		auditStr.append(achievedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduledDate* :");
		auditStr.append(scheduledDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledDate* :");
		auditStr.append(cancelledDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasCancelledEvents* :");
		auditStr.append(hasCancelledEvents);
	    auditStr.append("; ");
		auditStr.append("\r\n*events* :");
		if (events != null)
		{
			java.util.Iterator it11 = events.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.PatientEvent obj = (ims.pathways.domain.objects.PatientEvent)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathwayJourney* :");
		if (pathwayJourney != null)
		{
			auditStr.append(toShortClassName(pathwayJourney));
				
		    auditStr.append(pathwayJourney.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*achievedVariance* :");
		auditStr.append(achievedVariance);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetCalFromDate* :");
		auditStr.append(targetCalFromDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*readjustments* :");
		if (readjustments != null)
		{
			java.util.Iterator it15 = readjustments.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.pathways.domain.objects.TargetReadjustment obj = (ims.pathways.domain.objects.TargetReadjustment)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasReadjustments* :");
		auditStr.append(hasReadjustments);
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
		
		String keyClassName = "PatientJourneyTarget";
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
		if (this.getPathwayTarget() != null)
		{
			sb.append("<pathwayTarget>");
			sb.append(this.getPathwayTarget().toXMLString(domMap)); 	
			sb.append("</pathwayTarget>");		
		}
		if (this.getWeekNumber() != null)
		{
			sb.append("<weekNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWeekNumber().toString()));
			sb.append("</weekNumber>");		
		}
		if (this.getTargetDate() != null)
		{
			sb.append("<targetDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTargetDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</targetDate>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getJourneyClock() != null)
		{
			sb.append("<journeyClock>");
			sb.append(this.getJourneyClock().toXMLString(domMap)); 	
			sb.append("</journeyClock>");		
		}
		if (this.getAchievedDate() != null)
		{
			sb.append("<achievedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAchievedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</achievedDate>");		
		}
		if (this.getScheduledDate() != null)
		{
			sb.append("<scheduledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getScheduledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</scheduledDate>");		
		}
		if (this.getCancelledDate() != null)
		{
			sb.append("<cancelledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCancelledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cancelledDate>");		
		}
		if (this.isHasCancelledEvents() != null)
		{
			sb.append("<hasCancelledEvents>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasCancelledEvents().toString()));
			sb.append("</hasCancelledEvents>");		
		}
		if (this.getEvents() != null)
		{
			if (this.getEvents().size() > 0 )
			{
			sb.append("<events>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getEvents(), domMap));
			sb.append("</events>");		
			}
		}
		if (this.getPathwayJourney() != null)
		{
			sb.append("<pathwayJourney>");
			sb.append(this.getPathwayJourney().toXMLString(domMap)); 	
			sb.append("</pathwayJourney>");		
		}
		if (this.getAchievedVariance() != null)
		{
			sb.append("<achievedVariance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAchievedVariance().toString()));
			sb.append("</achievedVariance>");		
		}
		if (this.getTargetCalFromDate() != null)
		{
			sb.append("<targetCalFromDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTargetCalFromDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</targetCalFromDate>");		
		}
		if (this.getReadjustments() != null)
		{
			if (this.getReadjustments().size() > 0 )
			{
			sb.append("<readjustments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReadjustments(), domMap));
			sb.append("</readjustments>");		
			}
		}
		if (this.isHasReadjustments() != null)
		{
			sb.append("<hasReadjustments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasReadjustments().toString()));
			sb.append("</hasReadjustments>");		
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
			PatientJourneyTarget domainObject = getPatientJourneyTargetfromXML(itemEl, factory, domMap);

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
			PatientJourneyTarget domainObject = getPatientJourneyTargetfromXML(itemEl, factory, domMap);

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
		
	public static PatientJourneyTarget getPatientJourneyTargetfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientJourneyTargetfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientJourneyTarget getPatientJourneyTargetfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientJourneyTarget.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientJourneyTarget.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientJourneyTarget class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientJourneyTarget)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientJourneyTarget.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientJourneyTarget ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientJourneyTarget)factory.getImportedDomainObject(PatientJourneyTarget.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientJourneyTarget();
		}
		String keyClassName = "PatientJourneyTarget";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientJourneyTarget)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientJourneyTarget obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pathwayTarget");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathwayTarget(ims.pathways.configuration.domain.objects.PathwayTarget.getPathwayTargetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("weekNumber");
		if(fldEl != null)
		{	
    		obj.setWeekNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("targetDate");
		if(fldEl != null)
		{	
    		obj.setTargetDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.pathways.domain.objects.JourneyTargetStatus.getJourneyTargetStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.pathways.domain.objects.JourneyTargetStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("journeyClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setJourneyClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("achievedDate");
		if(fldEl != null)
		{	
    		obj.setAchievedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("scheduledDate");
		if(fldEl != null)
		{	
    		obj.setScheduledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cancelledDate");
		if(fldEl != null)
		{	
    		obj.setCancelledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hasCancelledEvents");
		if(fldEl != null)
		{	
    		obj.setHasCancelledEvents(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("events");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setEvents(ims.pathways.domain.objects.PatientEvent.fromSetXMLString(fldEl, factory, obj.getEvents(), domMap));
		}
		fldEl = el.element("pathwayJourney");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathwayJourney(ims.pathways.domain.objects.PatientPathwayJourney.getPatientPathwayJourneyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("achievedVariance");
		if(fldEl != null)
		{	
    		obj.setAchievedVariance(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("targetCalFromDate");
		if(fldEl != null)
		{	
    		obj.setTargetCalFromDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("readjustments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReadjustments(ims.pathways.domain.objects.TargetReadjustment.fromSetXMLString(fldEl, factory, obj.getReadjustments(), domMap));
		}
		fldEl = el.element("hasReadjustments");
		if(fldEl != null)
		{	
    		obj.setHasReadjustments(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		, "events"
		, "readjustments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PathwayTarget = "pathwayTarget";
		public static final String WeekNumber = "weekNumber";
		public static final String TargetDate = "targetDate";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String JourneyClock = "journeyClock";
		public static final String AchievedDate = "achievedDate";
		public static final String ScheduledDate = "scheduledDate";
		public static final String CancelledDate = "cancelledDate";
		public static final String HasCancelledEvents = "hasCancelledEvents";
		public static final String Events = "events";
		public static final String PathwayJourney = "pathwayJourney";
		public static final String AchievedVariance = "achievedVariance";
		public static final String TargetCalFromDate = "targetCalFromDate";
		public static final String Readjustments = "readjustments";
		public static final String HasReadjustments = "hasReadjustments";
	}
}

