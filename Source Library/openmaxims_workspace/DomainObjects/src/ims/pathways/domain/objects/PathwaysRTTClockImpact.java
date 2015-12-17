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
package ims.pathways.domain.objects;

/**
 * 
 * @author George Cristian Josan
 * Generated.
 */


public class PathwaysRTTClockImpact extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1088100013;
	private static final long serialVersionUID = 1088100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Active RTT clock before recording outcome */
	private ims.pathways.domain.objects.PathwayClock initialClock;
	/** RTT clock when outcome recorded */
	private ims.pathways.domain.objects.PathwayClock finalClock;
	/** RTT status before recording outcome */
	private ims.pathways.domain.objects.PathwayRTTStatus initialRTTStatus;
	/** RTT status when outcome recorded */
	private ims.pathways.domain.objects.PathwayRTTStatus finalRTTStatus;
	/** Clock started when outcome recorded */
	private Boolean clockStarted;
	/** Clock stopped when outcome recorded */
	private Boolean clockStopped;
	/** Outcome event (RTT status point to event configuration)  */
	private ims.pathways.domain.objects.RTTStatusEventMap outcomeEvent;
	/** Journey against which this clock impact occurred */
	private ims.pathways.domain.objects.PatientPathwayJourney journey;
	/** Source of the Clock Impact (Appointment Outcome, Admin Event, Referral Outcome) */
	private ims.domain.lookups.LookupInstance source;
	/** Initial Clock State */
	private ims.domain.lookups.LookupInstance initialClockState;
	/** Final Clock State */
	private ims.domain.lookups.LookupInstance finalClockState;
	private String outcomeDescription;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PathwaysRTTClockImpact (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PathwaysRTTClockImpact ()
    {
    	super();
    }
    public PathwaysRTTClockImpact (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.domain.objects.PathwaysRTTClockImpact.class;
	}


	public ims.pathways.domain.objects.PathwayClock getInitialClock() {
		return initialClock;
	}
	public void setInitialClock(ims.pathways.domain.objects.PathwayClock initialClock) {
		this.initialClock = initialClock;
	}

	public ims.pathways.domain.objects.PathwayClock getFinalClock() {
		return finalClock;
	}
	public void setFinalClock(ims.pathways.domain.objects.PathwayClock finalClock) {
		this.finalClock = finalClock;
	}

	public ims.pathways.domain.objects.PathwayRTTStatus getInitialRTTStatus() {
		return initialRTTStatus;
	}
	public void setInitialRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus initialRTTStatus) {
		this.initialRTTStatus = initialRTTStatus;
	}

	public ims.pathways.domain.objects.PathwayRTTStatus getFinalRTTStatus() {
		return finalRTTStatus;
	}
	public void setFinalRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus finalRTTStatus) {
		this.finalRTTStatus = finalRTTStatus;
	}

	public Boolean isClockStarted() {
		return clockStarted;
	}
	public void setClockStarted(Boolean clockStarted) {
		this.clockStarted = clockStarted;
	}

	public Boolean isClockStopped() {
		return clockStopped;
	}
	public void setClockStopped(Boolean clockStopped) {
		this.clockStopped = clockStopped;
	}

	public ims.pathways.domain.objects.RTTStatusEventMap getOutcomeEvent() {
		return outcomeEvent;
	}
	public void setOutcomeEvent(ims.pathways.domain.objects.RTTStatusEventMap outcomeEvent) {
		this.outcomeEvent = outcomeEvent;
	}

	public ims.pathways.domain.objects.PatientPathwayJourney getJourney() {
		return journey;
	}
	public void setJourney(ims.pathways.domain.objects.PatientPathwayJourney journey) {
		this.journey = journey;
	}

	public ims.domain.lookups.LookupInstance getSource() {
		return source;
	}
	public void setSource(ims.domain.lookups.LookupInstance source) {
		this.source = source;
	}

	public ims.domain.lookups.LookupInstance getInitialClockState() {
		return initialClockState;
	}
	public void setInitialClockState(ims.domain.lookups.LookupInstance initialClockState) {
		this.initialClockState = initialClockState;
	}

	public ims.domain.lookups.LookupInstance getFinalClockState() {
		return finalClockState;
	}
	public void setFinalClockState(ims.domain.lookups.LookupInstance finalClockState) {
		this.finalClockState = finalClockState;
	}

	public String getOutcomeDescription() {
		return outcomeDescription;
	}
	public void setOutcomeDescription(String outcomeDescription) {
		if ( null != outcomeDescription && outcomeDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for outcomeDescription. Tried to set value: "+
				outcomeDescription);
		}
		this.outcomeDescription = outcomeDescription;
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
		
		auditStr.append("\r\n*initialClock* :");
		if (initialClock != null)
		{
			auditStr.append(toShortClassName(initialClock));
				
		    auditStr.append(initialClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*finalClock* :");
		if (finalClock != null)
		{
			auditStr.append(toShortClassName(finalClock));
				
		    auditStr.append(finalClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*initialRTTStatus* :");
		if (initialRTTStatus != null)
		{
			auditStr.append(toShortClassName(initialRTTStatus));
				
		    auditStr.append(initialRTTStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*finalRTTStatus* :");
		if (finalRTTStatus != null)
		{
			auditStr.append(toShortClassName(finalRTTStatus));
				
		    auditStr.append(finalRTTStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clockStarted* :");
		auditStr.append(clockStarted);
	    auditStr.append("; ");
		auditStr.append("\r\n*clockStopped* :");
		auditStr.append(clockStopped);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeEvent* :");
		if (outcomeEvent != null)
		{
			auditStr.append(toShortClassName(outcomeEvent));
				
		    auditStr.append(outcomeEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*journey* :");
		if (journey != null)
		{
			auditStr.append(toShortClassName(journey));
				
		    auditStr.append(journey.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		if (source != null)
			auditStr.append(source.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*initialClockState* :");
		if (initialClockState != null)
			auditStr.append(initialClockState.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*finalClockState* :");
		if (finalClockState != null)
			auditStr.append(finalClockState.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeDescription* :");
		auditStr.append(outcomeDescription);
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
		
		String keyClassName = "PathwaysRTTClockImpact";
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
		if (this.getInitialClock() != null)
		{
			sb.append("<initialClock>");
			sb.append(this.getInitialClock().toXMLString(domMap)); 	
			sb.append("</initialClock>");		
		}
		if (this.getFinalClock() != null)
		{
			sb.append("<finalClock>");
			sb.append(this.getFinalClock().toXMLString(domMap)); 	
			sb.append("</finalClock>");		
		}
		if (this.getInitialRTTStatus() != null)
		{
			sb.append("<initialRTTStatus>");
			sb.append(this.getInitialRTTStatus().toXMLString(domMap)); 	
			sb.append("</initialRTTStatus>");		
		}
		if (this.getFinalRTTStatus() != null)
		{
			sb.append("<finalRTTStatus>");
			sb.append(this.getFinalRTTStatus().toXMLString(domMap)); 	
			sb.append("</finalRTTStatus>");		
		}
		if (this.isClockStarted() != null)
		{
			sb.append("<clockStarted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isClockStarted().toString()));
			sb.append("</clockStarted>");		
		}
		if (this.isClockStopped() != null)
		{
			sb.append("<clockStopped>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isClockStopped().toString()));
			sb.append("</clockStopped>");		
		}
		if (this.getOutcomeEvent() != null)
		{
			sb.append("<outcomeEvent>");
			sb.append(this.getOutcomeEvent().toXMLString(domMap)); 	
			sb.append("</outcomeEvent>");		
		}
		if (this.getJourney() != null)
		{
			sb.append("<journey>");
			sb.append(this.getJourney().toXMLString(domMap)); 	
			sb.append("</journey>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(this.getSource().toXMLString()); 
			sb.append("</source>");		
		}
		if (this.getInitialClockState() != null)
		{
			sb.append("<initialClockState>");
			sb.append(this.getInitialClockState().toXMLString()); 
			sb.append("</initialClockState>");		
		}
		if (this.getFinalClockState() != null)
		{
			sb.append("<finalClockState>");
			sb.append(this.getFinalClockState().toXMLString()); 
			sb.append("</finalClockState>");		
		}
		if (this.getOutcomeDescription() != null)
		{
			sb.append("<outcomeDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOutcomeDescription().toString()));
			sb.append("</outcomeDescription>");		
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
			PathwaysRTTClockImpact domainObject = getPathwaysRTTClockImpactfromXML(itemEl, factory, domMap);

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
			PathwaysRTTClockImpact domainObject = getPathwaysRTTClockImpactfromXML(itemEl, factory, domMap);

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
		
	public static PathwaysRTTClockImpact getPathwaysRTTClockImpactfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPathwaysRTTClockImpactfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PathwaysRTTClockImpact getPathwaysRTTClockImpactfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PathwaysRTTClockImpact.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PathwaysRTTClockImpact.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PathwaysRTTClockImpact class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PathwaysRTTClockImpact)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PathwaysRTTClockImpact.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PathwaysRTTClockImpact ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PathwaysRTTClockImpact)factory.getImportedDomainObject(PathwaysRTTClockImpact.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PathwaysRTTClockImpact();
		}
		String keyClassName = "PathwaysRTTClockImpact";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PathwaysRTTClockImpact)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PathwaysRTTClockImpact obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("initialClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInitialClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("finalClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFinalClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("initialRTTStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInitialRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus.getPathwayRTTStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("finalRTTStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFinalRTTStatus(ims.pathways.domain.objects.PathwayRTTStatus.getPathwayRTTStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clockStarted");
		if(fldEl != null)
		{	
    		obj.setClockStarted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clockStopped");
		if(fldEl != null)
		{	
    		obj.setClockStopped(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcomeEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOutcomeEvent(ims.pathways.domain.objects.RTTStatusEventMap.getRTTStatusEventMapfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("journey");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setJourney(ims.pathways.domain.objects.PatientPathwayJourney.getPatientPathwayJourneyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("initialClockState");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInitialClockState(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("finalClockState");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFinalClockState(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outcomeDescription");
		if(fldEl != null)
		{	
    		obj.setOutcomeDescription(new String(fldEl.getTextTrim()));	
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
		public static final String InitialClock = "initialClock";
		public static final String FinalClock = "finalClock";
		public static final String InitialRTTStatus = "initialRTTStatus";
		public static final String FinalRTTStatus = "finalRTTStatus";
		public static final String ClockStarted = "clockStarted";
		public static final String ClockStopped = "clockStopped";
		public static final String OutcomeEvent = "outcomeEvent";
		public static final String Journey = "journey";
		public static final String Source = "source";
		public static final String InitialClockState = "initialClockState";
		public static final String FinalClockState = "finalClockState";
		public static final String OutcomeDescription = "outcomeDescription";
	}
}

