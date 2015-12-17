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
package ims.emergency.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class Triage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100004;
	private static final long serialVersionUID = 1086100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Episode */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.CareContext attendance;
	/** Current Area */
	private ims.emergency.configuration.domain.objects.TrackingArea trackingArea;
	/** Triage Start Date Time */
	private java.util.Date triageStartDateTime;
	/** Current Triage Assessment */
	private ims.emergency.domain.objects.TriageProtocolAssessment currentTriageAssessment;
	/** Current Triage Pathay */
	private ims.icps.instantiation.domain.objects.PatientICP currentTriagePathway;
	/** CurrentTriagePriority */
	private ims.domain.lookups.LookupInstance currentTriagePriority;
	/** Main Presenting Problem */
	private ims.core.clinical.domain.objects.PatientProblem mainPresentingProblem;
	/** Triage Completion Date Time */
	private java.util.Date triageCompletionTime;
	/** Medic Intervention StartDate Time */
	private java.util.Date medicInterventionStartDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Triage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Triage ()
    {
    	super();
    }
    public Triage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.Triage.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public ims.core.admin.domain.objects.CareContext getAttendance() {
		return attendance;
	}
	public void setAttendance(ims.core.admin.domain.objects.CareContext attendance) {
		this.attendance = attendance;
	}

	public ims.emergency.configuration.domain.objects.TrackingArea getTrackingArea() {
		return trackingArea;
	}
	public void setTrackingArea(ims.emergency.configuration.domain.objects.TrackingArea trackingArea) {
		this.trackingArea = trackingArea;
	}

	public java.util.Date getTriageStartDateTime() {
		return triageStartDateTime;
	}
	public void setTriageStartDateTime(java.util.Date triageStartDateTime) {
		this.triageStartDateTime = triageStartDateTime;
	}

	public ims.emergency.domain.objects.TriageProtocolAssessment getCurrentTriageAssessment() {
		return currentTriageAssessment;
	}
	public void setCurrentTriageAssessment(ims.emergency.domain.objects.TriageProtocolAssessment currentTriageAssessment) {
		this.currentTriageAssessment = currentTriageAssessment;
	}

	public ims.icps.instantiation.domain.objects.PatientICP getCurrentTriagePathway() {
		return currentTriagePathway;
	}
	public void setCurrentTriagePathway(ims.icps.instantiation.domain.objects.PatientICP currentTriagePathway) {
		this.currentTriagePathway = currentTriagePathway;
	}

	public ims.domain.lookups.LookupInstance getCurrentTriagePriority() {
		return currentTriagePriority;
	}
	public void setCurrentTriagePriority(ims.domain.lookups.LookupInstance currentTriagePriority) {
		this.currentTriagePriority = currentTriagePriority;
	}

	public ims.core.clinical.domain.objects.PatientProblem getMainPresentingProblem() {
		return mainPresentingProblem;
	}
	public void setMainPresentingProblem(ims.core.clinical.domain.objects.PatientProblem mainPresentingProblem) {
		this.mainPresentingProblem = mainPresentingProblem;
	}

	public java.util.Date getTriageCompletionTime() {
		return triageCompletionTime;
	}
	public void setTriageCompletionTime(java.util.Date triageCompletionTime) {
		this.triageCompletionTime = triageCompletionTime;
	}

	public java.util.Date getMedicInterventionStartDateTime() {
		return medicInterventionStartDateTime;
	}
	public void setMedicInterventionStartDateTime(java.util.Date medicInterventionStartDateTime) {
		this.medicInterventionStartDateTime = medicInterventionStartDateTime;
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
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*attendance* :");
		if (attendance != null)
		{
			auditStr.append(toShortClassName(attendance));
				
		    auditStr.append(attendance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*trackingArea* :");
		if (trackingArea != null)
		{
			auditStr.append(toShortClassName(trackingArea));
				
		    auditStr.append(trackingArea.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triageStartDateTime* :");
		auditStr.append(triageStartDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentTriageAssessment* :");
		if (currentTriageAssessment != null)
		{
			auditStr.append(toShortClassName(currentTriageAssessment));
				
		    auditStr.append(currentTriageAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentTriagePathway* :");
		if (currentTriagePathway != null)
		{
			auditStr.append(toShortClassName(currentTriagePathway));
				
		    auditStr.append(currentTriagePathway.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentTriagePriority* :");
		if (currentTriagePriority != null)
			auditStr.append(currentTriagePriority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mainPresentingProblem* :");
		if (mainPresentingProblem != null)
		{
			auditStr.append(toShortClassName(mainPresentingProblem));
				
		    auditStr.append(mainPresentingProblem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triageCompletionTime* :");
		auditStr.append(triageCompletionTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicInterventionStartDateTime* :");
		auditStr.append(medicInterventionStartDateTime);
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
		
		String keyClassName = "Triage";
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
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAttendance() != null)
		{
			sb.append("<attendance>");
			sb.append(this.getAttendance().toXMLString(domMap)); 	
			sb.append("</attendance>");		
		}
		if (this.getTrackingArea() != null)
		{
			sb.append("<trackingArea>");
			sb.append(this.getTrackingArea().toXMLString(domMap)); 	
			sb.append("</trackingArea>");		
		}
		if (this.getTriageStartDateTime() != null)
		{
			sb.append("<triageStartDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTriageStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</triageStartDateTime>");		
		}
		if (this.getCurrentTriageAssessment() != null)
		{
			sb.append("<currentTriageAssessment>");
			sb.append(this.getCurrentTriageAssessment().toXMLString(domMap)); 	
			sb.append("</currentTriageAssessment>");		
		}
		if (this.getCurrentTriagePathway() != null)
		{
			sb.append("<currentTriagePathway>");
			sb.append(this.getCurrentTriagePathway().toXMLString(domMap)); 	
			sb.append("</currentTriagePathway>");		
		}
		if (this.getCurrentTriagePriority() != null)
		{
			sb.append("<currentTriagePriority>");
			sb.append(this.getCurrentTriagePriority().toXMLString()); 
			sb.append("</currentTriagePriority>");		
		}
		if (this.getMainPresentingProblem() != null)
		{
			sb.append("<mainPresentingProblem>");
			sb.append(this.getMainPresentingProblem().toXMLString(domMap)); 	
			sb.append("</mainPresentingProblem>");		
		}
		if (this.getTriageCompletionTime() != null)
		{
			sb.append("<triageCompletionTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTriageCompletionTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</triageCompletionTime>");		
		}
		if (this.getMedicInterventionStartDateTime() != null)
		{
			sb.append("<medicInterventionStartDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getMedicInterventionStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</medicInterventionStartDateTime>");		
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
			Triage domainObject = getTriagefromXML(itemEl, factory, domMap);

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
			Triage domainObject = getTriagefromXML(itemEl, factory, domMap);

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
		
	public static Triage getTriagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTriagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Triage getTriagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Triage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Triage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Triage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Triage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Triage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Triage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Triage)factory.getImportedDomainObject(Triage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Triage();
		}
		String keyClassName = "Triage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Triage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Triage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendance(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("trackingArea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTrackingArea(ims.emergency.configuration.domain.objects.TrackingArea.getTrackingAreafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("triageStartDateTime");
		if(fldEl != null)
		{	
    		obj.setTriageStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentTriageAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentTriageAssessment(ims.emergency.domain.objects.TriageProtocolAssessment.getTriageProtocolAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentTriagePathway");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentTriagePathway(ims.icps.instantiation.domain.objects.PatientICP.getPatientICPfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentTriagePriority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentTriagePriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mainPresentingProblem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMainPresentingProblem(ims.core.clinical.domain.objects.PatientProblem.getPatientProblemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("triageCompletionTime");
		if(fldEl != null)
		{	
    		obj.setTriageCompletionTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("medicInterventionStartDateTime");
		if(fldEl != null)
		{	
    		obj.setMedicInterventionStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String TrackingArea = "trackingArea";
		public static final String TriageStartDateTime = "triageStartDateTime";
		public static final String CurrentTriageAssessment = "currentTriageAssessment";
		public static final String CurrentTriagePathway = "currentTriagePathway";
		public static final String CurrentTriagePriority = "currentTriagePriority";
		public static final String MainPresentingProblem = "mainPresentingProblem";
		public static final String TriageCompletionTime = "triageCompletionTime";
		public static final String MedicInterventionStartDateTime = "medicInterventionStartDateTime";
	}
}

