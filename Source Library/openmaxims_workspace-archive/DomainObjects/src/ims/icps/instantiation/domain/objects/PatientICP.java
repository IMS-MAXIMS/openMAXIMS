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
package ims.icps.instantiation.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientICP extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1100100000;
	private static final long serialVersionUID = 1100100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ICP */
	private ims.icps.configuration.domain.objects.ICP iCP;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Started Date Time */
	private java.util.Date startedDateTime;
	/** hasOutstandingAdminActions */
	private Boolean hasOutstandingAdminActions;
	/** hasOutstandingNursingActions */
	private Boolean hasOutstandingNursingActions;
	/** hasOutstandingPhysioActions2 */
	private Boolean hasOutstandingPhysioActions;
	/** hasOutstandingClinicalActions */
	private Boolean hasOutstandingClinicalActions;
	/** Stages
	  * Collection of ims.icps.instantiation.domain.objects.PatientICPStage.
	  */
	private java.util.Set stages;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** CompletedDateTime */
	private java.util.Date completedDateTime;
	/** PasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Appointments
	  * Collection of ims.scheduling.domain.objects.Booking_Appointment.
	  */
	private java.util.Set appointments;
	/** Critical Events
	  * Collection of ims.icps.instantiation.domain.objects.PatientCriticalEvents.
	  */
	private java.util.Set criticalEvents;
	/** Multidiscipline Evaluation Notes
	  * Collection of ims.icps.instantiation.domain.objects.PatientICPEvaluationNote.
	  */
	private java.util.Set evaluationNotes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientICP (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientICP ()
    {
    	super();
    }
    public PatientICP (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.icps.instantiation.domain.objects.PatientICP.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.icps.configuration.domain.objects.ICP getICP() {
		return iCP;
	}
	public void setICP(ims.icps.configuration.domain.objects.ICP iCP) {
		this.iCP = iCP;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.Date getStartedDateTime() {
		return startedDateTime;
	}
	public void setStartedDateTime(java.util.Date startedDateTime) {
		this.startedDateTime = startedDateTime;
	}

	public Boolean isHasOutstandingAdminActions() {
		return hasOutstandingAdminActions;
	}
	public void setHasOutstandingAdminActions(Boolean hasOutstandingAdminActions) {
		this.hasOutstandingAdminActions = hasOutstandingAdminActions;
	}

	public Boolean isHasOutstandingNursingActions() {
		return hasOutstandingNursingActions;
	}
	public void setHasOutstandingNursingActions(Boolean hasOutstandingNursingActions) {
		this.hasOutstandingNursingActions = hasOutstandingNursingActions;
	}

	public Boolean isHasOutstandingPhysioActions() {
		return hasOutstandingPhysioActions;
	}
	public void setHasOutstandingPhysioActions(Boolean hasOutstandingPhysioActions) {
		this.hasOutstandingPhysioActions = hasOutstandingPhysioActions;
	}

	public Boolean isHasOutstandingClinicalActions() {
		return hasOutstandingClinicalActions;
	}
	public void setHasOutstandingClinicalActions(Boolean hasOutstandingClinicalActions) {
		this.hasOutstandingClinicalActions = hasOutstandingClinicalActions;
	}

	public java.util.Set getStages() {
		if ( null == stages ) {
			stages = new java.util.HashSet();
		}
		return stages;
	}
	public void setStages(java.util.Set paramValue) {
		this.stages = paramValue;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Date getCompletedDateTime() {
		return completedDateTime;
	}
	public void setCompletedDateTime(java.util.Date completedDateTime) {
		this.completedDateTime = completedDateTime;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public java.util.Set getAppointments() {
		if ( null == appointments ) {
			appointments = new java.util.HashSet();
		}
		return appointments;
	}
	public void setAppointments(java.util.Set paramValue) {
		this.appointments = paramValue;
	}

	public java.util.Set getCriticalEvents() {
		if ( null == criticalEvents ) {
			criticalEvents = new java.util.HashSet();
		}
		return criticalEvents;
	}
	public void setCriticalEvents(java.util.Set paramValue) {
		this.criticalEvents = paramValue;
	}

	public java.util.Set getEvaluationNotes() {
		if ( null == evaluationNotes ) {
			evaluationNotes = new java.util.HashSet();
		}
		return evaluationNotes;
	}
	public void setEvaluationNotes(java.util.Set paramValue) {
		this.evaluationNotes = paramValue;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*iCP* :");
		if (iCP != null)
		{
			auditStr.append(toShortClassName(iCP));
				
		    auditStr.append(iCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startedDateTime* :");
		auditStr.append(startedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasOutstandingAdminActions* :");
		auditStr.append(hasOutstandingAdminActions);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasOutstandingNursingActions* :");
		auditStr.append(hasOutstandingNursingActions);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasOutstandingPhysioActions* :");
		auditStr.append(hasOutstandingPhysioActions);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasOutstandingClinicalActions* :");
		auditStr.append(hasOutstandingClinicalActions);
	    auditStr.append("; ");
		auditStr.append("\r\n*stages* :");
		if (stages != null)
		{
			java.util.Iterator it10 = stages.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.icps.instantiation.domain.objects.PatientICPStage obj = (ims.icps.instantiation.domain.objects.PatientICPStage)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completedDateTime* :");
		auditStr.append(completedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointments* :");
		if (appointments != null)
		{
			java.util.Iterator it14 = appointments.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Booking_Appointment obj = (ims.scheduling.domain.objects.Booking_Appointment)it14.next();
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
		auditStr.append("\r\n*criticalEvents* :");
		if (criticalEvents != null)
		{
			java.util.Iterator it15 = criticalEvents.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.icps.instantiation.domain.objects.PatientCriticalEvents obj = (ims.icps.instantiation.domain.objects.PatientCriticalEvents)it15.next();
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
		auditStr.append("\r\n*evaluationNotes* :");
		if (evaluationNotes != null)
		{
			java.util.Iterator it16 = evaluationNotes.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.icps.instantiation.domain.objects.PatientICPEvaluationNote obj = (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
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
		
		String keyClassName = "PatientICP";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getICP() != null)
		{
			sb.append("<iCP>");
			sb.append(this.getICP().toXMLString(domMap)); 	
			sb.append("</iCP>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getStartedDateTime() != null)
		{
			sb.append("<startedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startedDateTime>");		
		}
		if (this.isHasOutstandingAdminActions() != null)
		{
			sb.append("<hasOutstandingAdminActions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasOutstandingAdminActions().toString()));
			sb.append("</hasOutstandingAdminActions>");		
		}
		if (this.isHasOutstandingNursingActions() != null)
		{
			sb.append("<hasOutstandingNursingActions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasOutstandingNursingActions().toString()));
			sb.append("</hasOutstandingNursingActions>");		
		}
		if (this.isHasOutstandingPhysioActions() != null)
		{
			sb.append("<hasOutstandingPhysioActions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasOutstandingPhysioActions().toString()));
			sb.append("</hasOutstandingPhysioActions>");		
		}
		if (this.isHasOutstandingClinicalActions() != null)
		{
			sb.append("<hasOutstandingClinicalActions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasOutstandingClinicalActions().toString()));
			sb.append("</hasOutstandingClinicalActions>");		
		}
		if (this.getStages() != null)
		{
			if (this.getStages().size() > 0 )
			{
			sb.append("<stages>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStages(), domMap));
			sb.append("</stages>");		
			}
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCompletedDateTime() != null)
		{
			sb.append("<completedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedDateTime>");		
		}
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getAppointments() != null)
		{
			if (this.getAppointments().size() > 0 )
			{
			sb.append("<appointments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAppointments(), domMap));
			sb.append("</appointments>");		
			}
		}
		if (this.getCriticalEvents() != null)
		{
			if (this.getCriticalEvents().size() > 0 )
			{
			sb.append("<criticalEvents>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCriticalEvents(), domMap));
			sb.append("</criticalEvents>");		
			}
		}
		if (this.getEvaluationNotes() != null)
		{
			if (this.getEvaluationNotes().size() > 0 )
			{
			sb.append("<evaluationNotes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getEvaluationNotes(), domMap));
			sb.append("</evaluationNotes>");		
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
			PatientICP domainObject = getPatientICPfromXML(itemEl, factory, domMap);

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
			PatientICP domainObject = getPatientICPfromXML(itemEl, factory, domMap);

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
		
	public static PatientICP getPatientICPfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientICPfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientICP getPatientICPfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientICP.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientICP.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientICP class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientICP)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientICP.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientICP ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientICP)factory.getImportedDomainObject(PatientICP.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientICP();
		}
		String keyClassName = "PatientICP";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientICP)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientICP obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("iCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setICP(ims.icps.configuration.domain.objects.ICP.getICPfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startedDateTime");
		if(fldEl != null)
		{	
    		obj.setStartedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hasOutstandingAdminActions");
		if(fldEl != null)
		{	
    		obj.setHasOutstandingAdminActions(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasOutstandingNursingActions");
		if(fldEl != null)
		{	
    		obj.setHasOutstandingNursingActions(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasOutstandingPhysioActions");
		if(fldEl != null)
		{	
    		obj.setHasOutstandingPhysioActions(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasOutstandingClinicalActions");
		if(fldEl != null)
		{	
    		obj.setHasOutstandingClinicalActions(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stages");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStages(ims.icps.instantiation.domain.objects.PatientICPStage.fromSetXMLString(fldEl, factory, obj.getStages(), domMap));
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("completedDateTime");
		if(fldEl != null)
		{	
    		obj.setCompletedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAppointments(ims.scheduling.domain.objects.Booking_Appointment.fromSetXMLString(fldEl, factory, obj.getAppointments(), domMap));
		}
		fldEl = el.element("criticalEvents");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCriticalEvents(ims.icps.instantiation.domain.objects.PatientCriticalEvents.fromSetXMLString(fldEl, factory, obj.getCriticalEvents(), domMap));
		}
		fldEl = el.element("evaluationNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setEvaluationNotes(ims.icps.instantiation.domain.objects.PatientICPEvaluationNote.fromSetXMLString(fldEl, factory, obj.getEvaluationNotes(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "stages"
		, "appointments"
		, "criticalEvents"
		, "evaluationNotes"
		};
	}

	/**
	hasActions(ims.icps.configuration.domain.objects.ICPPhase configurationPhase)
	*/
private boolean hasActions(ims.icps.configuration.domain.objects.ICPPhase configurationPhase)
{
                // Lookup IDs
                final int STATUS_ACTIVE = -617;

                if (configurationPhase == null)
                                return false;

                // Get phase iterator
                java.util.Iterator<ims.icps.configuration.domain.objects.ICPAction> actionIterator = configurationPhase.getActions().iterator();

                // Iterate phases
                while (actionIterator.hasNext())
                {
                                // Get action
                                ims.icps.configuration.domain.objects.ICPAction action = actionIterator.next();

                                if (action.getStatus().getId() == STATUS_ACTIVE)
                                                return true;
                }

                // Check for stage action in Patient ICP

                // Get stage iterator
                java.util.Iterator<PatientICPStage> stageIterator = this.stages.iterator();

                // Iterate stages
                while (stageIterator.hasNext())
                {
                                // Get stage
                                PatientICPStage stage = stageIterator.next();
                                // Get phase iterator
                                java.util.Iterator<PatientICPPhase> patientPhaseIterator = stage.getStagePhases().iterator();

                                // Iterate phases
                                while (patientPhaseIterator.hasNext())
                                {
                                                // Get phase
                                                PatientICPPhase phase = patientPhaseIterator.next();
                                                
                                                if (phase.getPhase().getId() != configurationPhase.getId())
                                                                continue;

                                                if (phase.getPhaseActions().size() != 0)
                                                                return true;
                                }
                }

                return false;
}


	/**
	hasActions(ims.icps.configuration.domain.objects.ICPStage configurationStage)
	*/
      private boolean hasActions(ims.icps.configuration.domain.objects.ICPStage configurationStage)
      {
            // Lookup IDs
            final int STATUS_ACTIVE = -617;

            if (configurationStage == null)
                  return false;

            // Get phase iterator
            java.util.Iterator<ims.icps.configuration.domain.objects.ICPPhase> phaseIterator = configurationStage.getPhases().iterator();

            // Iterate phases
            while (phaseIterator.hasNext())
            {
                  // Get phase
                  ims.icps.configuration.domain.objects.ICPPhase phase = phaseIterator.next();
                  
                  // Check phase
                  if (phase == null || phase.getStatus().getId() != STATUS_ACTIVE)
                        continue;

                  // Get action iterator
                  java.util.Iterator<ims.icps.configuration.domain.objects.ICPAction> actionIterator = phase.getActions().iterator();

                  // Iterate actions
                  while (actionIterator.hasNext())
                  {
                        // Get action
                        ims.icps.configuration.domain.objects.ICPAction action = actionIterator.next();

                        if (action.getStatus().getId() == STATUS_ACTIVE)
                              return true;
                  }
            }

            // Check for stage action in Patient ICP

            // Get stage iterator
            java.util.Iterator<PatientICPStage> stageIterator = this.stages.iterator();

            // Iterate stages
            while (stageIterator.hasNext())
            {
                  // Get stage
                  PatientICPStage stage = stageIterator.next();

                  if (stage.getStage().getId() == configurationStage.getId())
                  {
                        // Get phase iterator
                        java.util.Iterator<PatientICPPhase> patientPhaseIterator = stage.getStagePhases().iterator();

                        // Iterate phases
                        while (patientPhaseIterator.hasNext())
                        {
                              // Get phase
                              PatientICPPhase phase = patientPhaseIterator.next();

                              if (phase.getPhaseActions().size() != 0)
                                    return true;
                        }
                  }
            }

            return false;
      }


	/**
	private void updatePatientICPOutstandingDisciplines() - Function used to update outstandin7g discipline actions after stage / phase inactivation
	*/
private void updatePatientICPOutstandingDisciplines()
{
	// Lookup IDs
	final int STATUS_STAGE_OUTSTANDING = -1747;
	final int STATUS_PHASE_IN_PROGRESS = -1750;
	final int STATUS_ACTION_OUTSTANDING = -1753;

	final int HCP_DIS_NURSING = -27;
	final int HCP_DIS_MEDICAL = -59;
	final int HCP_DIS_OTHER = -62;
	final int HCP_DIS_THERAPY = -61;
	
	// Assume no discipline actions are required
	this.hasOutstandingClinicalActions = Boolean.FALSE;
	this.hasOutstandingNursingActions = Boolean.FALSE;
	this.hasOutstandingPhysioActions = Boolean.FALSE;
	this.hasOutstandingAdminActions = Boolean.FALSE;


	// Stage Iterator
	java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPStage> stageIterator = this.getStages().iterator();

	// Iterate stages
	while (stageIterator.hasNext())
	{
		PatientICPStage stage = stageIterator.next();

		// If the stage is not in scope move to next stage
		if (stage.getCurrentStatus().getStatus().getId() != STATUS_STAGE_OUTSTANDING)
			continue;

		// Phase iterator
		java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPPhase> phaseIterator = stage.getStagePhases().iterator();

		// Iterate phases
		while (phaseIterator.hasNext())
		{
			PatientICPPhase phase = phaseIterator.next();

			// If the phase is not in scope move to next phase
			if (phase.getCurrentStatus().getStatus().getId() != STATUS_PHASE_IN_PROGRESS)
				continue;

			// Action iterator
			java.util.Iterator<PatientICPAction> actionIterator = phase.getPhaseActions().iterator();

			// Iterate actions
			while (actionIterator.hasNext())
			{
				PatientICPAction action = actionIterator.next();

				// If the action is not in scope move to next action
				if (action.getCurrentStatus().getStatus().getId() != STATUS_ACTION_OUTSTANDING)
					continue;

				// Iterator for action disciplines
				java.util.Iterator<ims.domain.lookups.LookupInstance> iteratorActionDisciplines = action.getAction().getDiscipline().iterator();

				while (iteratorActionDisciplines.hasNext())
				{
					ims.domain.lookups.LookupInstance discipline = iteratorActionDisciplines.next();

					switch (discipline.getId())
					{
						case HCP_DIS_MEDICAL:
							this.hasOutstandingClinicalActions = Boolean.TRUE;
							break;

						case HCP_DIS_NURSING:
							this.hasOutstandingNursingActions = Boolean.TRUE;
							break;

						case HCP_DIS_THERAPY:
							this.hasOutstandingPhysioActions = Boolean.TRUE;
							break;

						case HCP_DIS_OTHER:
							this.hasOutstandingAdminActions = Boolean.TRUE;
							break;
					}
					
					// If we have all disciplines marked as outstanding no need to analyze any further
					if (Boolean.TRUE.equals(this.hasOutstandingAdminActions) && Boolean.TRUE.equals(this.hasOutstandingClinicalActions)
							&& Boolean.TRUE.equals(this.hasOutstandingNursingActions) && Boolean.TRUE.equals(this.hasOutstandingPhysioActions))
						return;
				}
			}
		}
	}
}



	public void bringStageIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String stageID)
	{	
		// Lookup IDs
		final int STATUS_ACTIVE = -617;

		final int STATUS_STAGE_NOT_IN_SCOPE = -1746;
		final int STATUS_STAGE_OUTSTANDING = -1747;

		final int STATUS_PHASE_NOT_IN_SCOPE = -1749;
		final int STATUS_PHASE_IN_PROGRESS = -1750;

		final int STATUS_ACTION_NOT_IN_SCOPE = -1752;
		final int STATUS_ACTION_OUTSTANDING = -1753;

		final int HCP_DIS_NURSING = -27;
		final int HCP_DIS_MEDICAL = -59;
		final int HCP_DIS_OTHER = -62;
		final int HCP_DIS_THERAPY = -61;

		// Check parameters
		if (factory == null || stageID == null)
			return;

		// Get configuration stage
		ims.icps.configuration.domain.objects.ICPStage configurationStage = (ims.icps.configuration.domain.objects.ICPStage) factory.getDomainObject(ims.icps.configuration.domain.objects.ICPStage.class, Integer.parseInt(stageID));

		// If no configuration stage was found end function
		if (configurationStage == null)
			return;

		// Get an iterator for instance stages
		java.util.Iterator<PatientICPStage> patientStageIterator = stages.iterator();

		// Declare an instance stage
		PatientICPStage patientStage = null;

		// Iterate instance stages
		while (patientStageIterator.hasNext())
		{
			// Get instance stage
			PatientICPStage instanceStage = patientStageIterator.next();

			// Match stage id
			if (instanceStage.getStage().getId().equals(Integer.parseInt(stageID)))
			{
				patientStage = instanceStage;
				break;
			}
		}

		// If no instance stage was found and configuration is not active - end
		// function
		if (patientStage == null && configurationStage.getStatus().getId() != STATUS_ACTIVE)
			return;

		// If an instance was found and can not be brought into scope (unlikely
		// situation) - end function
		if (patientStage != null && patientStage.getCurrentStatus().getStatus().getId() != STATUS_STAGE_NOT_IN_SCOPE)
			return;

		// Check if an instance stage was found
		if (patientStage == null)
		{
			// Create a new instance stage
			patientStage = new PatientICPStage();
			patientStage.setICP(this);
			patientStage.setPatient(this.patient);
			patientStage.setCareContext(this.careContext);
			patientStage.setStage(configurationStage);

			// Add created instance stage to ICP
			this.getStages().add(patientStage);
		}

		// Create a new status (OUTSTANDING) for instance stage
		PatientICPStageStatus stageStatus = new PatientICPStageStatus();
		// Populate values to status
		stageStatus.setStatusDate(new java.util.Date());
		stageStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
		stageStatus.setStatus(factory.getLookupInstance(STATUS_STAGE_OUTSTANDING));

		// Set status to instance stage
		patientStage.setCurrentStatus(stageStatus);
		// Add status to instance stage status history
		patientStage.getStatusHistory().add(stageStatus);

		// Bring phases into scope

		// Get an iterator for configuration phases for current stage
		java.util.Iterator<ims.icps.configuration.domain.objects.ICPPhase> configurationPhaseIterator = patientStage.getStage().getPhases().iterator();

		// Iterate all (instance and configuration) phases for instance stage
		while (configurationPhaseIterator.hasNext())
		{
			// Get configuration phase
			ims.icps.configuration.domain.objects.ICPPhase configurationPhase = configurationPhaseIterator.next();

			// Declare an instance phase
			PatientICPPhase patientPhase = null;

			// Get an iterator for instance phases for current stage
			java.util.Iterator<PatientICPPhase> patientPhaseIterator = patientStage.getStagePhases().iterator();

			// Iterate all instance phases (look for an instance phase to match
			// the configuration phase)
			while (patientPhaseIterator.hasNext())
			{
				// Get instance phase
				PatientICPPhase instancePhase = patientPhaseIterator.next();

				// Match phase id
				if (instancePhase.getPhase().getId().equals(configurationPhase.getId()))
				{
					patientPhase = instancePhase;
					break;
				}
			}

			// If no instance phases were found and the configuration phase is
			// not active skip it
			if (patientPhase == null && configurationPhase.getStatus().getId() != STATUS_ACTIVE)
				continue;

			// If an instance was found and the configuration stage is not set
			// to activate on initiation skip it
			if (patientPhase != null && !Boolean.TRUE.equals(patientPhase.getPhase().isIsActivatedOnInitiation()))
				continue;

			// If an instance was found and it is already brought into scope
			// (impossible situation) skip it
			if (patientPhase != null && patientPhase.getCurrentStatus().getStatus().getId() == STATUS_ACTION_OUTSTANDING)
				continue;

			// Check if an instance phase was found
			if (patientPhase == null)
			{
				// Create a new instance phase
				patientPhase = new PatientICPPhase();
				patientPhase.setICP(this);
				patientPhase.setCareContext(this.careContext);
				patientPhase.setPatient(this.patient);
				patientPhase.setParentStage(patientStage);
				patientPhase.setPhase(configurationPhase);

				// Add instance phase to instance stage
				patientStage.getStagePhases().add(patientPhase);
			}

			// Create a new status for instance phase
			PatientICPPhaseStatus phaseStatus = new PatientICPPhaseStatus();
			// Populate values to status
			phaseStatus.setStatusDate(new java.util.Date());
			phaseStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());

			// Decide status
			if (patientPhase.getPhase().isIsActivatedOnInitiation())
			{
				phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_IN_PROGRESS));
			}
			else
			{
				phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_NOT_IN_SCOPE));
			}

			// Set status to instance phase
			patientPhase.setCurrentStatus(phaseStatus);
			// Add status to instance phase status history
			patientPhase.getStatusHistory().add(phaseStatus);

			// Bring actions into scope

			// Get an iterator for configuration actions for current phase
			java.util.Iterator<ims.icps.configuration.domain.objects.ICPAction> configurationActionIterator = patientPhase.getPhase().getActions().iterator();

			// Iterate all (instance and configuration) actions for instance
			// stage
			while (configurationActionIterator.hasNext())
			{
				// Get configuration action
				ims.icps.configuration.domain.objects.ICPAction configurationAction = configurationActionIterator.next();

				// Declare an instance action
				PatientICPAction patientAction = null;

				// Get an iterator for instance actions for current phase
				java.util.Iterator<PatientICPAction> patientActionIterator = patientPhase.getPhaseActions().iterator();

				// Iterate all instance actions
				while (patientActionIterator.hasNext())
				{
					// Get instance action
					PatientICPAction instanceAction = patientActionIterator.next();

					// Match action id
					if (instanceAction.getAction().getId() == configurationAction.getId())
					{
						patientAction = instanceAction;
						break;
					}
				}

				// If no instance actions were found and configuration action is
				// not active skip it
				if (patientAction == null && configurationAction.getStatus().getId() != STATUS_ACTIVE)
					continue;

				// If an instance action was found and the configuration action
				// is not set to activate on initiation skip it
				// if (patientAction != null &&
				// !Boolean.TRUE.equals(patientAction.getAction().isIsActivatedOnInitiation()))
				// continue;

				// If an instance action was found and is already brought into
				// scope (impossible situation) skip it
				if (patientAction != null && patientAction.getCurrentStatus().getStatus().getId() == STATUS_ACTION_OUTSTANDING)
					continue;

				// Check if an instance action was found
				if (patientAction == null)
				{
					// Create a new instance action
					patientAction = new PatientICPAction();
					patientAction.setICP(this);
					patientAction.setCareContext(this.careContext);
					patientAction.setPatient(this.patient);
					patientAction.setParentPhase(patientPhase);
					patientAction.setAction(configurationAction);

					// Add instance action to instance phase
					patientPhase.getPhaseActions().add(patientAction);
				}

				// Create a new status for instance action
				PatientICPActionStatus actionStatus = new PatientICPActionStatus();
				// Populate values to status
				actionStatus.setStatusDate(new java.util.Date());
				actionStatus.setChangedBy((ims.core.resource.people.domain.objects.MemberOfStaff) factory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, factory.getDomainSession().getUser().getMosId()));

				// Decide status
				if (patientPhase.getCurrentStatus().getStatus().getId() == STATUS_PHASE_IN_PROGRESS)
				{
					actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_OUTSTANDING));
				}
				else
				{
					actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_NOT_IN_SCOPE));
				}

				// Set status to instance action
				patientAction.setCurrentStatus(actionStatus);
				// Add status to instance action status history
				patientAction.getStatusHistory().add(actionStatus);

				// Update ICP outstanding actions

				// Get an iterator for the patient action disciplines
				java.util.Iterator<ims.domain.lookups.LookupInstance> iteratorActionDiscipline = patientAction.getAction().getDiscipline().iterator();

				while (iteratorActionDiscipline.hasNext())
				{
					ims.domain.lookups.LookupInstance discipline = iteratorActionDiscipline.next();

					if (patientAction.getCurrentStatus().getStatus().getId() == STATUS_ACTION_OUTSTANDING)
					{
						switch (discipline.getId())
						{
							case HCP_DIS_MEDICAL:
								this.hasOutstandingClinicalActions = Boolean.TRUE;
								break;

							case HCP_DIS_NURSING:
								this.hasOutstandingNursingActions = Boolean.TRUE;
								break;

							case HCP_DIS_THERAPY:
								this.hasOutstandingPhysioActions = Boolean.TRUE;
								break;

							case HCP_DIS_OTHER:
								this.hasOutstandingAdminActions = Boolean.TRUE;
								break;
						}
					}
				}
			}
		}

	}

	public void bringPhaseIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String phaseID)
	{	
		// Lookup IDs
		final int STATUS_ACTIVE = -617;

		final int STATUS_STAGE_NOT_IN_SCOPE = -1746;
		final int STATUS_STAGE_OUTSTANDING = -1747;

		final int STATUS_PHASE_NOT_IN_SCOPE = -1749;
		final int STATUS_PHASE_IN_PROGRESS = -1750;

		final int STATUS_ACTION_NOT_IN_SCOPE = -1752;
		final int STATUS_ACTION_OUTSTANDING = -1753;

		final int HCP_DIS_NURSING = -27;
		final int HCP_DIS_MEDICAL = -59;
		final int HCP_DIS_OTHER = -62;
		final int HCP_DIS_THERAPY = -61;

		// Check parameter
		if (factory == null || phaseID == null)
			return;

		// Get configuration phase
		ims.icps.configuration.domain.objects.ICPPhase domainPhase = (ims.icps.configuration.domain.objects.ICPPhase) factory.getDomainObject(ims.icps.configuration.domain.objects.ICPPhase.class, Integer.parseInt(phaseID));

		// If configuration phase is null - end function
		if (domainPhase == null)
			return;

		// Check if phase has actions
		if (domainPhase.getActions().size() == 0)
			return;

		// Declare configuration parent stage
		ims.icps.configuration.domain.objects.ICPStage configurationParentStage = null;
		// Declare instance parent stage
		PatientICPStage instanceParentStage = null;

		// Find configuration parent stage (if no configuration parent stage is
		// found - end function)

		// Get an iterator for configuration stages
		java.util.Iterator<ims.icps.configuration.domain.objects.ICPStage> configurationStagesIterator = this.iCP.getStages().iterator();

		// Iterate configuration stages
		while (configurationStagesIterator.hasNext())
		{
			// Get configuration stage
			ims.icps.configuration.domain.objects.ICPStage configurationStage = configurationStagesIterator.next();

			// Get an iterator for configuration phases
			java.util.Iterator<ims.icps.configuration.domain.objects.ICPPhase> configurationPhasesIterator = configurationStage.getPhases().iterator();

			// Iterate configuration phases
			while (configurationPhasesIterator.hasNext())
			{
				// Get configuration phase
				ims.icps.configuration.domain.objects.ICPPhase configurationPhase = configurationPhasesIterator.next();

				// Match phase ID
				if (configurationPhase.getId() == Integer.parseInt(phaseID))
				{
					// Assign configuration parent stage and interrupt phase
					// iteration
					configurationParentStage = configurationStage;
					break;
				}
			}

			// If a configuration parent stage was found interrupt iteration
			if (configurationParentStage != null)
				break;
		}

		// If no configuration parent stage was found - end function
		if (configurationParentStage == null)
			return;

		// Find instance parent stage

		// Get an iterator for instance stages
		java.util.Iterator<PatientICPStage> instanceStagesIterator = this.getStages().iterator();

		// Iterate instance stages
		while (instanceStagesIterator.hasNext())
		{
			// Get instance stage
			PatientICPStage instanceStage = instanceStagesIterator.next();

			// Match stage ID
			if (instanceStage.getStage().getId() == configurationParentStage.getId())
			{
				// Assign instance parent stage and interrupt stage iteration
				instanceParentStage = instanceStage;
				break;
			}
		}

		// Check instance parent stage
		if (instanceParentStage == null)
		{
			// Check if configuration parent stage can be brought into scope -
			// if it can not, end function
			if (configurationParentStage.getStatus().getId() != STATUS_ACTIVE)
				return;

			// Bring configuration parent stage into scope
			this.bringStageIntoScope(factory, engine, configurationParentStage.getId().toString());

			// Look once more for instance parent stage

			// Get an iterator for instance stages
			java.util.Iterator<PatientICPStage> patientStageIterator = this.getStages().iterator();

			// Iterate instance stages
			while (patientStageIterator.hasNext())
			{
				// Get instance stage
				PatientICPStage patientStage = patientStageIterator.next();

				// Match stage ID
				if (patientStage.getStage().getId() == configurationParentStage.getId())
				{
					// Assign instance parent stage and interrupt iteration
					instanceParentStage = patientStage;
					break;
				}
			}

			// If no instance parent stage was found (should not occur) - end
			// function
			if (instanceParentStage == null)
				return;
		}

		// Check if instance parent stage is brought into scope
		if (instanceParentStage.getCurrentStatus().getStatus().getId() != STATUS_STAGE_OUTSTANDING)
		{
			// Bring instance parent stage into scope
			this.bringStageIntoScope(factory, engine, instanceParentStage.getStage().getId().toString());
		}

		// Find instance phase (if any, otherwise, create one)

		// Get an iterator for instance phases
		java.util.Iterator<PatientICPPhase> instancePhaseIterator = instanceParentStage.getStagePhases().iterator();

		// Declare an instance phase
		PatientICPPhase patientPhase = null;

		// Iterate instance phases
		while (instancePhaseIterator.hasNext())
		{
			// Get instance phase
			PatientICPPhase instancePhase = instancePhaseIterator.next();

			// Match phase ID
			if (instancePhase.getPhase().getId() == Integer.parseInt(phaseID))
			{
				// Assign instance phase and break iteration
				patientPhase = instancePhase;
				break;
			}
		}

		// If no instance phase were found and the configuration phase is not
		// active end function
		if (patientPhase == null && domainPhase.getStatus().getId() != STATUS_ACTIVE)
			return;

		// If an instance phase was found and it is already brought into scope -
		// end function
		if (patientPhase != null && patientPhase.getCurrentStatus().getStatus().getId() == STATUS_PHASE_IN_PROGRESS)
			return;

		// Check if an instance phase was found
		if (patientPhase == null)
		{
			// Create a new instance phase
			patientPhase = new PatientICPPhase();
			patientPhase.setICP(this);
			patientPhase.setCareContext(this.careContext);
			patientPhase.setPatient(this.patient);
			patientPhase.setParentStage(instanceParentStage);
			patientPhase.setPhase(domainPhase);

			// Add instance phase to instance parent stage
			instanceParentStage.getStagePhases().add(patientPhase);
		}

		// Create a new status for instance phase
		PatientICPPhaseStatus phaseStatus = new PatientICPPhaseStatus();
		// Populate values to status
		phaseStatus.setStatusDate(new java.util.Date());
		phaseStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
		phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_IN_PROGRESS));

		// Set status to instance phase
		patientPhase.setCurrentStatus(phaseStatus);
		// Add status to instance phase status history
		patientPhase.getStatusHistory().add(phaseStatus);

		// Bring actions into scope

		// Get an iterator for configuration actions for current phase
		java.util.Iterator<ims.icps.configuration.domain.objects.ICPAction> configurationActionIterator = patientPhase.getPhase().getActions().iterator();

		// Iterate all (instance and configuration) actions for instance stage
		while (configurationActionIterator.hasNext())
		{
			// Get configuration action
			ims.icps.configuration.domain.objects.ICPAction configurationAction = configurationActionIterator.next();

			// Declare an instance action
			PatientICPAction patientAction = null;

			// Get an iterator for instance phase actions
			java.util.Iterator<PatientICPAction> instanceActionIterator = patientPhase.getPhaseActions().iterator();

			// Iterate all instance actions
			while (instanceActionIterator.hasNext())
			{
				// Get instance action
				PatientICPAction instanceAction = instanceActionIterator.next();

				// Match action id
				if (instanceAction.getAction().getId() == configurationAction.getId())
				{
					patientAction = instanceAction;
					break;
				}
			}

			// If no instance actions were found and configuration action is not
			// active skip it
			if (patientAction == null && configurationAction.getStatus().getId() != STATUS_ACTIVE)
				continue;

			// If an instance action was found and is already brought into scope
			// (impossible situation) skip it
			if (patientAction != null && patientAction.getCurrentStatus().getStatus().getId() == STATUS_ACTION_OUTSTANDING)
				continue;

			// Check if an instance action was found
			if (patientAction == null)
			{
				// Create a new instance action
				patientAction = new PatientICPAction();
				patientAction.setICP(this);
				patientAction.setCareContext(this.careContext);
				patientAction.setPatient(this.patient);
				patientAction.setParentPhase(patientPhase);
				patientAction.setAction(configurationAction);

				// Add instance action to instance phase
				patientPhase.getPhaseActions().add(patientAction);
			}

			// Create a new status for instance action
			PatientICPActionStatus actionStatus = new PatientICPActionStatus();
			// Populate values to status
			actionStatus.setStatusDate(new java.util.Date());
			actionStatus.setChangedBy((ims.core.resource.people.domain.objects.MemberOfStaff) factory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, factory.getDomainSession().getUser().getMosId()));
			actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_OUTSTANDING));

			// Set status to instance action
			patientAction.setCurrentStatus(actionStatus);
			// Add status to instance action status history
			patientAction.getStatusHistory().add(actionStatus);

			// Update ICP outstanding actions

			// Get an iterator for the patient action disciplines
			java.util.Iterator<ims.domain.lookups.LookupInstance> iteratorActionDiscipline = patientAction.getAction().getDiscipline().iterator();

			while (iteratorActionDiscipline.hasNext())
			{
				ims.domain.lookups.LookupInstance discipline = iteratorActionDiscipline.next();

				switch (discipline.getId())
				{
					case HCP_DIS_MEDICAL:
						this.hasOutstandingClinicalActions = Boolean.TRUE;
						break;

					case HCP_DIS_NURSING:
						this.hasOutstandingNursingActions = Boolean.TRUE;
						break;

					case HCP_DIS_THERAPY:
						this.hasOutstandingPhysioActions = Boolean.TRUE;
						break;

					case HCP_DIS_OTHER:
						this.hasOutstandingAdminActions = Boolean.TRUE;
						break;
				}
			}
		}

	}

	public void removePhaseFromScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String phaseID)
	{	
final int STATUS_ACTIVE = -617;

final int STATUS_PHASE_NOT_IN_SCOPE = -1749;
final int STATUS_PHASE_IN_PROGRESS = -1750;

final int STATUS_ACTION_NOT_IN_SCOPE = -1752;
final int STATUS_ACTION_OUTSTANDING = -1753;

final int HCP_DIS_NURSING = -27;
final int HCP_DIS_MEDICAL = -59;
final int HCP_DIS_OTHER = -62;
final int HCP_DIS_THERAPY = -61;


// Check parameter
if (factory == null || phaseID == null)
	return;

// Declare instance parent stage
PatientICPPhase domainInstancePhase = null;


// Find Phase

// Get an iterator for instance stages
java.util.Iterator<PatientICPStage> instanceStagesIterator = this.getStages().iterator();

// Iterate instance stages
while (instanceStagesIterator.hasNext())
{
	PatientICPStage patientStage = instanceStagesIterator.next();
	
	// Get an iterator for instance phases
	java.util.Iterator<PatientICPPhase> instancePhaseIterator = patientStage.getStagePhases().iterator();

	while (instancePhaseIterator.hasNext())
	{
		PatientICPPhase patientPhase = instancePhaseIterator.next();
		
		if (patientPhase.getPhase().getId() == Integer.parseInt(phaseID))
		{
			domainInstancePhase = patientPhase;
			break;
		}
	}
	
	if (domainInstancePhase != null)
		break;
}

// Check if we found the instance phase and it is in scope
// Otherwise end function
if (domainInstancePhase == null || domainInstancePhase.getCurrentStatus().getStatus().getId() != STATUS_PHASE_IN_PROGRESS)
	return;


// Create a new status for instance phase
PatientICPPhaseStatus phaseStatus = new PatientICPPhaseStatus();
// Populate values to status
phaseStatus.setStatusDate(new java.util.Date());
phaseStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_NOT_IN_SCOPE));

// Set status to instance phase
domainInstancePhase.setCurrentStatus(phaseStatus);
// Add status to instance phase status history
domainInstancePhase.getStatusHistory().add(phaseStatus);

// Remove actions from scope

// Get an iterator to actions for current phase
java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPAction> domainActionIterator = domainInstancePhase.getPhaseActions().iterator();

// Iterate actions
while (domainActionIterator.hasNext())
{
	// Get Patient action
	PatientICPAction domainAction = domainActionIterator.next();
	
	// If the action is in the scope then remove it from scope
	if (domainAction != null && domainAction.getCurrentStatus().getStatus().getId() == STATUS_ACTION_OUTSTANDING)
	{
		// Create a new status for instance action
		PatientICPActionStatus actionStatus = new PatientICPActionStatus();
		// Populate values to status
		actionStatus.setStatusDate(new java.util.Date());
		actionStatus.setChangedBy((ims.core.resource.people.domain.objects.MemberOfStaff) factory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, factory.getDomainSession().getUser().getMosId()));
		actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_NOT_IN_SCOPE));

		// Set status to action
		domainAction.setCurrentStatus(actionStatus);
		domainAction.getStatusHistory().add(actionStatus);
	}
}

// Update ICP outstanding discipline actions
updatePatientICPOutstandingDisciplines();

	}

	public void removeStageFromScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String stageID)
	{	
		// Lookup IDs
		final int STATUS_STAGE_NOT_IN_SCOPE = -1746;
		final int STATUS_STAGE_OUTSTANDING = -1747;

		final int STATUS_PHASE_NOT_IN_SCOPE = -1749;
		final int STATUS_PHASE_IN_PROGRESS = -1750;

		final int STATUS_ACTION_NOT_IN_SCOPE = -1752;
		final int STATUS_ACTION_OUTSTANDING = -1753;

		final int HCP_DIS_NURSING = -27;
		final int HCP_DIS_MEDICAL = -59;
		final int HCP_DIS_OTHER = -62;
		final int HCP_DIS_THERAPY = -61;
		
		// Check parameter
		if (factory == null || stageID == null)
			return;
		
		// Declare instance stage
		PatientICPStage domainInstanceStage = null;
		
		// Find stage
		
		// Get an iterator for instance stages
		java.util.Iterator<PatientICPStage> instanceStageIterator = this.getStages().iterator();
		// Iterate instance stages
		while (instanceStageIterator.hasNext())
		{
			PatientICPStage stage = instanceStageIterator.next();
			
			// Get the stage
			if (stage.getStage().getId() == Integer.parseInt(stageID))
			{
				domainInstanceStage = stage;
				break;
			}
		}
		
		// Check if we found an instance stage and it is in scope
		// Otherwise end function
		if (domainInstanceStage == null || domainInstanceStage.getCurrentStatus().getStatus().getId() != STATUS_STAGE_OUTSTANDING)
			return;
		
		// Create a new status for instance phase
		PatientICPStageStatus stageStatus = new PatientICPStageStatus();
		// Populate values to status
		stageStatus.setStatusDate(new java.util.Date());
		stageStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
		stageStatus.setStatus(factory.getLookupInstance(STATUS_STAGE_NOT_IN_SCOPE));

		// Set status to instance stage
		domainInstanceStage.setCurrentStatus(stageStatus);
		// Add status to instance stage status history
		domainInstanceStage.getStatusHistory().add(stageStatus);
		
		// Remove phases from scope
		
		// Get an iterator for instance phases
		java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPPhase> domainPhaseIterator = domainInstanceStage.getStagePhases().iterator();
		
		// Iterate phases
		while (domainPhaseIterator.hasNext())
		{
			// Get Patient Phase
			PatientICPPhase domainPhase = domainPhaseIterator.next();
			
			// If the stage is in the scope then remove it - and it's actions
			if (domainPhase != null && domainPhase.getCurrentStatus().getStatus().getId() == STATUS_PHASE_IN_PROGRESS)
			{
				// Create a new status for the phase
				PatientICPPhaseStatus phaseStatus = new PatientICPPhaseStatus();
				// Populate values to status
				phaseStatus.setStatusDate(new java.util.Date());
				phaseStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
				phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_NOT_IN_SCOPE));
				
				// Set status to phase
				domainPhase.setCurrentStatus(phaseStatus);
				// Add status to phase status history
				domainPhase.getStatusHistory().add(phaseStatus);
				
				// Get an iterator for instance actions
				java.util.Iterator<ims.icps.instantiation.domain.objects.PatientICPAction> domainActionIterator = domainPhase.getPhaseActions().iterator();
				
				// Iterate actions
				while (domainActionIterator.hasNext())
				{
					// Get Patient action
					PatientICPAction domainAction = domainActionIterator.next();
					
					// If the action is in the scope then remove it from scope
					if (domainAction != null && domainAction.getCurrentStatus().getStatus().getId() == STATUS_ACTION_OUTSTANDING)
					{
						// Create a new status for instance action
						PatientICPActionStatus actionStatus = new PatientICPActionStatus();
						// Populate values to status
						actionStatus.setStatusDate(new java.util.Date());
						actionStatus.setChangedBy((ims.core.resource.people.domain.objects.MemberOfStaff) factory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, factory.getDomainSession().getUser().getMosId()));
						actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_NOT_IN_SCOPE));

						// Set status to action
						domainAction.setCurrentStatus(actionStatus);
						domainAction.getStatusHistory().add(actionStatus);
					}
				}
			}
		}
		
		// Update ICP outstanding discipline actions
		updatePatientICPOutstandingDisciplines();

	}

	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String ICP = "iCP";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String StartedDateTime = "startedDateTime";
		public static final String HasOutstandingAdminActions = "hasOutstandingAdminActions";
		public static final String HasOutstandingNursingActions = "hasOutstandingNursingActions";
		public static final String HasOutstandingPhysioActions = "hasOutstandingPhysioActions";
		public static final String HasOutstandingClinicalActions = "hasOutstandingClinicalActions";
		public static final String Stages = "stages";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CompletedDateTime = "completedDateTime";
		public static final String PasEvent = "pasEvent";
		public static final String Appointments = "appointments";
		public static final String CriticalEvents = "criticalEvents";
		public static final String EvaluationNotes = "evaluationNotes";
	}
}

