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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class GoalPlanning extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100059;
	private static final long serialVersionUID = 1072100059L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Goal Planning Date */
	private java.util.Date goalPlanningDate;
	/** Predicted Discharge Date */
	private Integer predicatedDischargeDate;
	/** Goal Planning Outcome */
	private ims.domain.lookups.LookupInstance goalPlanningOutcome;
	/** Prime Reason for Cancellation */
	private ims.domain.lookups.LookupInstance primeCancelReason;
	/** Predicted Next Goal Planning */
	private Integer predictedNextGoalPlanning;
	/** Discharge Delay Value */
	private Integer dischargeDelayValue;
	/** Discharge Delay Unit */
	private ims.domain.lookups.LookupInstance dischargeDelayUnit;
	/** Is Goal Planning Conference */
	private Boolean isGoalPlanningConf;
	/** Minutes (Needs to hold path to document) */
	private String minutes;
	/** Comments */
	private String comments;
	/** Goal Planning Meeting - Invitees
	  * Collection of ims.clinical.domain.objects.GoalPlanningMeetingAttendee.
	  */
	private java.util.Set invitees;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public GoalPlanning (Integer id, int ver)
    {
    	super(id, ver);
    }
    public GoalPlanning ()
    {
    	super();
    }
    public GoalPlanning (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.GoalPlanning.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getGoalPlanningDate() {
		return goalPlanningDate;
	}
	public void setGoalPlanningDate(java.util.Date goalPlanningDate) {
		this.goalPlanningDate = goalPlanningDate;
	}

	public Integer getPredicatedDischargeDate() {
		return predicatedDischargeDate;
	}
	public void setPredicatedDischargeDate(Integer predicatedDischargeDate) {
		this.predicatedDischargeDate = predicatedDischargeDate;
	}

	public ims.domain.lookups.LookupInstance getGoalPlanningOutcome() {
		return goalPlanningOutcome;
	}
	public void setGoalPlanningOutcome(ims.domain.lookups.LookupInstance goalPlanningOutcome) {
		this.goalPlanningOutcome = goalPlanningOutcome;
	}

	public ims.domain.lookups.LookupInstance getPrimeCancelReason() {
		return primeCancelReason;
	}
	public void setPrimeCancelReason(ims.domain.lookups.LookupInstance primeCancelReason) {
		this.primeCancelReason = primeCancelReason;
	}

	public Integer getPredictedNextGoalPlanning() {
		return predictedNextGoalPlanning;
	}
	public void setPredictedNextGoalPlanning(Integer predictedNextGoalPlanning) {
		this.predictedNextGoalPlanning = predictedNextGoalPlanning;
	}

	public Integer getDischargeDelayValue() {
		return dischargeDelayValue;
	}
	public void setDischargeDelayValue(Integer dischargeDelayValue) {
		this.dischargeDelayValue = dischargeDelayValue;
	}

	public ims.domain.lookups.LookupInstance getDischargeDelayUnit() {
		return dischargeDelayUnit;
	}
	public void setDischargeDelayUnit(ims.domain.lookups.LookupInstance dischargeDelayUnit) {
		this.dischargeDelayUnit = dischargeDelayUnit;
	}

	public Boolean isIsGoalPlanningConf() {
		return isGoalPlanningConf;
	}
	public void setIsGoalPlanningConf(Boolean isGoalPlanningConf) {
		this.isGoalPlanningConf = isGoalPlanningConf;
	}

	public String getMinutes() {
		return minutes;
	}
	public void setMinutes(String minutes) {
		if ( null != minutes && minutes.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for minutes. Tried to set value: "+
				minutes);
		}
		this.minutes = minutes;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public java.util.Set getInvitees() {
		if ( null == invitees ) {
			invitees = new java.util.HashSet();
		}
		return invitees;
	}
	public void setInvitees(java.util.Set paramValue) {
		this.invitees = paramValue;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*goalPlanningDate* :");
		auditStr.append(goalPlanningDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*predicatedDischargeDate* :");
		auditStr.append(predicatedDischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*goalPlanningOutcome* :");
		if (goalPlanningOutcome != null)
			auditStr.append(goalPlanningOutcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primeCancelReason* :");
		if (primeCancelReason != null)
			auditStr.append(primeCancelReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*predictedNextGoalPlanning* :");
		auditStr.append(predictedNextGoalPlanning);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDelayValue* :");
		auditStr.append(dischargeDelayValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDelayUnit* :");
		if (dischargeDelayUnit != null)
			auditStr.append(dischargeDelayUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isGoalPlanningConf* :");
		auditStr.append(isGoalPlanningConf);
	    auditStr.append("; ");
		auditStr.append("\r\n*minutes* :");
		auditStr.append(minutes);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*invitees* :");
		if (invitees != null)
		{
			java.util.Iterator it14 = invitees.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.GoalPlanningMeetingAttendee obj = (ims.clinical.domain.objects.GoalPlanningMeetingAttendee)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
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
		
		String keyClassName = "GoalPlanning";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getGoalPlanningDate() != null)
		{
			sb.append("<goalPlanningDate>");
			sb.append(new ims.framework.utils.DateTime(this.getGoalPlanningDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</goalPlanningDate>");		
		}
		if (this.getPredicatedDischargeDate() != null)
		{
			sb.append("<predicatedDischargeDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPredicatedDischargeDate().toString()));
			sb.append("</predicatedDischargeDate>");		
		}
		if (this.getGoalPlanningOutcome() != null)
		{
			sb.append("<goalPlanningOutcome>");
			sb.append(this.getGoalPlanningOutcome().toXMLString()); 
			sb.append("</goalPlanningOutcome>");		
		}
		if (this.getPrimeCancelReason() != null)
		{
			sb.append("<primeCancelReason>");
			sb.append(this.getPrimeCancelReason().toXMLString()); 
			sb.append("</primeCancelReason>");		
		}
		if (this.getPredictedNextGoalPlanning() != null)
		{
			sb.append("<predictedNextGoalPlanning>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPredictedNextGoalPlanning().toString()));
			sb.append("</predictedNextGoalPlanning>");		
		}
		if (this.getDischargeDelayValue() != null)
		{
			sb.append("<dischargeDelayValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeDelayValue().toString()));
			sb.append("</dischargeDelayValue>");		
		}
		if (this.getDischargeDelayUnit() != null)
		{
			sb.append("<dischargeDelayUnit>");
			sb.append(this.getDischargeDelayUnit().toXMLString()); 
			sb.append("</dischargeDelayUnit>");		
		}
		if (this.isIsGoalPlanningConf() != null)
		{
			sb.append("<isGoalPlanningConf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsGoalPlanningConf().toString()));
			sb.append("</isGoalPlanningConf>");		
		}
		if (this.getMinutes() != null)
		{
			sb.append("<minutes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinutes().toString()));
			sb.append("</minutes>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getInvitees() != null)
		{
			if (this.getInvitees().size() > 0 )
			{
			sb.append("<invitees>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvitees(), domMap));
			sb.append("</invitees>");		
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
			GoalPlanning domainObject = getGoalPlanningfromXML(itemEl, factory, domMap);

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
			GoalPlanning domainObject = getGoalPlanningfromXML(itemEl, factory, domMap);

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
		
	public static GoalPlanning getGoalPlanningfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGoalPlanningfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static GoalPlanning getGoalPlanningfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!GoalPlanning.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!GoalPlanning.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the GoalPlanning class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (GoalPlanning)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(GoalPlanning.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		GoalPlanning ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (GoalPlanning)factory.getImportedDomainObject(GoalPlanning.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new GoalPlanning();
		}
		String keyClassName = "GoalPlanning";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (GoalPlanning)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, GoalPlanning obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("goalPlanningDate");
		if(fldEl != null)
		{	
    		obj.setGoalPlanningDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("predicatedDischargeDate");
		if(fldEl != null)
		{	
    		obj.setPredicatedDischargeDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("goalPlanningOutcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGoalPlanningOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primeCancelReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrimeCancelReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("predictedNextGoalPlanning");
		if(fldEl != null)
		{	
    		obj.setPredictedNextGoalPlanning(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDelayValue");
		if(fldEl != null)
		{	
    		obj.setDischargeDelayValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDelayUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeDelayUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isGoalPlanningConf");
		if(fldEl != null)
		{	
    		obj.setIsGoalPlanningConf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minutes");
		if(fldEl != null)
		{	
    		obj.setMinutes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("invitees");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvitees(ims.clinical.domain.objects.GoalPlanningMeetingAttendee.fromSetXMLString(fldEl, factory, obj.getInvitees(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "invitees"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String GoalPlanningDate = "goalPlanningDate";
		public static final String PredicatedDischargeDate = "predicatedDischargeDate";
		public static final String GoalPlanningOutcome = "goalPlanningOutcome";
		public static final String PrimeCancelReason = "primeCancelReason";
		public static final String PredictedNextGoalPlanning = "predictedNextGoalPlanning";
		public static final String DischargeDelayValue = "dischargeDelayValue";
		public static final String DischargeDelayUnit = "dischargeDelayUnit";
		public static final String IsGoalPlanningConf = "isGoalPlanningConf";
		public static final String Minutes = "minutes";
		public static final String Comments = "comments";
		public static final String Invitees = "invitees";
	}
}

