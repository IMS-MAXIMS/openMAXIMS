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
 * @author Sean Nesbitt
 * Generated.
 */


public class PreTreatmentPlanActivity extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100044;
	private static final long serialVersionUID = 1074100044L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Mouldroom Notes */
	private String mouldRoomNotes;
	/** CompletingHCP - HCP who said that the action was complete */
	private Integer completingHcp;
	/** Computer action to be performed on. */
	private Integer compPerf;
	/** HCP to Plan */
	private Integer hcpPlan;
	/** Outcome Reason - LKT 3708 */
	private Integer outcomeReas;
	/** Activity Outcome - LKT 3708 */
	private Integer activityOutcome;
	/** Activity done flag */
	private Boolean activityDone;
	/** completed date */
	private java.util.Date compDate;
	/** Target Date */
	private java.util.Date targetDate;
	/** Activity order */
	private Integer activityOrder;
	/** Activity - LKT 3707 */
	private Integer activity;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PreTreatmentPlanActivity (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PreTreatmentPlanActivity ()
    {
    	super();
    }
    public PreTreatmentPlanActivity (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PreTreatmentPlanActivity.class;
	}


	public String getMouldRoomNotes() {
		return mouldRoomNotes;
	}
	public void setMouldRoomNotes(String mouldRoomNotes) {
		if ( null != mouldRoomNotes && mouldRoomNotes.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mouldRoomNotes. Tried to set value: "+
				mouldRoomNotes);
		}
		this.mouldRoomNotes = mouldRoomNotes;
	}

	public Integer getCompletingHcp() {
		return completingHcp;
	}
	public void setCompletingHcp(Integer completingHcp) {
		this.completingHcp = completingHcp;
	}

	public Integer getCompPerf() {
		return compPerf;
	}
	public void setCompPerf(Integer compPerf) {
		this.compPerf = compPerf;
	}

	public Integer getHcpPlan() {
		return hcpPlan;
	}
	public void setHcpPlan(Integer hcpPlan) {
		this.hcpPlan = hcpPlan;
	}

	public Integer getOutcomeReas() {
		return outcomeReas;
	}
	public void setOutcomeReas(Integer outcomeReas) {
		this.outcomeReas = outcomeReas;
	}

	public Integer getActivityOutcome() {
		return activityOutcome;
	}
	public void setActivityOutcome(Integer activityOutcome) {
		this.activityOutcome = activityOutcome;
	}

	public Boolean isActivityDone() {
		return activityDone;
	}
	public void setActivityDone(Boolean activityDone) {
		this.activityDone = activityDone;
	}

	public java.util.Date getCompDate() {
		return compDate;
	}
	public void setCompDate(java.util.Date compDate) {
		this.compDate = compDate;
	}

	public java.util.Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(java.util.Date targetDate) {
		this.targetDate = targetDate;
	}

	public Integer getActivityOrder() {
		return activityOrder;
	}
	public void setActivityOrder(Integer activityOrder) {
		this.activityOrder = activityOrder;
	}

	public Integer getActivity() {
		return activity;
	}
	public void setActivity(Integer activity) {
		this.activity = activity;
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
		
		auditStr.append("\r\n*mouldRoomNotes* :");
		auditStr.append(mouldRoomNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*completingHcp* :");
		auditStr.append(completingHcp);
	    auditStr.append("; ");
		auditStr.append("\r\n*compPerf* :");
		auditStr.append(compPerf);
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpPlan* :");
		auditStr.append(hcpPlan);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeReas* :");
		auditStr.append(outcomeReas);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityOutcome* :");
		auditStr.append(activityOutcome);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityDone* :");
		auditStr.append(activityDone);
	    auditStr.append("; ");
		auditStr.append("\r\n*compDate* :");
		auditStr.append(compDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetDate* :");
		auditStr.append(targetDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityOrder* :");
		auditStr.append(activityOrder);
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		auditStr.append(activity);
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
		
		String keyClassName = "PreTreatmentPlanActivity";
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
		if (this.getMouldRoomNotes() != null)
		{
			sb.append("<mouldRoomNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMouldRoomNotes().toString()));
			sb.append("</mouldRoomNotes>");		
		}
		if (this.getCompletingHcp() != null)
		{
			sb.append("<completingHcp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCompletingHcp().toString()));
			sb.append("</completingHcp>");		
		}
		if (this.getCompPerf() != null)
		{
			sb.append("<compPerf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCompPerf().toString()));
			sb.append("</compPerf>");		
		}
		if (this.getHcpPlan() != null)
		{
			sb.append("<hcpPlan>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHcpPlan().toString()));
			sb.append("</hcpPlan>");		
		}
		if (this.getOutcomeReas() != null)
		{
			sb.append("<outcomeReas>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOutcomeReas().toString()));
			sb.append("</outcomeReas>");		
		}
		if (this.getActivityOutcome() != null)
		{
			sb.append("<activityOutcome>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityOutcome().toString()));
			sb.append("</activityOutcome>");		
		}
		if (this.isActivityDone() != null)
		{
			sb.append("<activityDone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActivityDone().toString()));
			sb.append("</activityDone>");		
		}
		if (this.getCompDate() != null)
		{
			sb.append("<compDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCompDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</compDate>");		
		}
		if (this.getTargetDate() != null)
		{
			sb.append("<targetDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTargetDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</targetDate>");		
		}
		if (this.getActivityOrder() != null)
		{
			sb.append("<activityOrder>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityOrder().toString()));
			sb.append("</activityOrder>");		
		}
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivity().toString()));
			sb.append("</activity>");		
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
			PreTreatmentPlanActivity domainObject = getPreTreatmentPlanActivityfromXML(itemEl, factory, domMap);

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
			PreTreatmentPlanActivity domainObject = getPreTreatmentPlanActivityfromXML(itemEl, factory, domMap);

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
		
	public static PreTreatmentPlanActivity getPreTreatmentPlanActivityfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPreTreatmentPlanActivityfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PreTreatmentPlanActivity getPreTreatmentPlanActivityfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PreTreatmentPlanActivity.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PreTreatmentPlanActivity.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PreTreatmentPlanActivity class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PreTreatmentPlanActivity)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PreTreatmentPlanActivity.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PreTreatmentPlanActivity ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PreTreatmentPlanActivity)factory.getImportedDomainObject(PreTreatmentPlanActivity.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PreTreatmentPlanActivity();
		}
		String keyClassName = "PreTreatmentPlanActivity";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PreTreatmentPlanActivity)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PreTreatmentPlanActivity obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("mouldRoomNotes");
		if(fldEl != null)
		{	
    		obj.setMouldRoomNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("completingHcp");
		if(fldEl != null)
		{	
    		obj.setCompletingHcp(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("compPerf");
		if(fldEl != null)
		{	
    		obj.setCompPerf(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hcpPlan");
		if(fldEl != null)
		{	
    		obj.setHcpPlan(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcomeReas");
		if(fldEl != null)
		{	
    		obj.setOutcomeReas(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityOutcome");
		if(fldEl != null)
		{	
    		obj.setActivityOutcome(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityDone");
		if(fldEl != null)
		{	
    		obj.setActivityDone(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("compDate");
		if(fldEl != null)
		{	
    		obj.setCompDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("targetDate");
		if(fldEl != null)
		{	
    		obj.setTargetDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activityOrder");
		if(fldEl != null)
		{	
    		obj.setActivityOrder(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activity");
		if(fldEl != null)
		{	
    		obj.setActivity(new Integer(fldEl.getTextTrim()));	
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
		public static final String MouldRoomNotes = "mouldRoomNotes";
		public static final String CompletingHcp = "completingHcp";
		public static final String CompPerf = "compPerf";
		public static final String HcpPlan = "hcpPlan";
		public static final String OutcomeReas = "outcomeReas";
		public static final String ActivityOutcome = "activityOutcome";
		public static final String ActivityDone = "activityDone";
		public static final String CompDate = "compDate";
		public static final String TargetDate = "targetDate";
		public static final String ActivityOrder = "activityOrder";
		public static final String Activity = "activity";
	}
}

