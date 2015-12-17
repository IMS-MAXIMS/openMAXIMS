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
 * @author Kevin O'Carroll
 * Generated.
 */


public class SurgeryDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100080;
	private static final long serialVersionUID = 1003100080L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** PatientProcedure */
	private ims.core.clinical.domain.objects.PatientProcedure patientProcedure;
	/** HospitalPerformed (Organisation) */
	private ims.core.resource.place.domain.objects.Organisation hospitalPerformed;
	/** ResponsibleConsultant */
	private ims.core.resource.people.domain.objects.Hcp responsibleConsultant;
	/** SpecialtyFunctionCode */
	private ims.domain.lookups.LookupInstance specialtyFunctionCode;
	/** AdmissionDate */
	private java.util.Date admissionDate;
	/** DischargeDate */
	private java.util.Date dischargeDate;
	/** DischargeDestination */
	private ims.domain.lookups.LookupInstance dischargeDestination;
	/** ASA Grade Pre Surgery */
	private ims.domain.lookups.LookupInstance aSAGrade;
	/** ConsultantPresence */
	private ims.domain.lookups.LookupInstance consultantPresence;
	/** SubProcedures
	  * Collection of ims.core.clinical.domain.objects.SubProcedures.
	  */
	private java.util.Set subProcedures;
	/** Anaesthetist */
	private ims.core.resource.people.domain.objects.Hcp anaesthetist;
	/** AnaesthetistGrade */
	private ims.domain.lookups.LookupInstance anaesthetistGrade;
	/** Assistants
	  * Collection of ims.clinical.domain.objects.SurgeryAssistants.
	  */
	private java.util.Set assistants;
	/** ProcedureType */
	private ims.domain.lookups.LookupInstance procedureType;
	/** PreOpPossum */
	private ims.assessment.instantiation.domain.objects.PatientAssessment preOpPossum;
	/** OperativeDetailsPossum */
	private ims.assessment.instantiation.domain.objects.PatientAssessment operativeDetailsPossum;
	/** OperativeFindings */
	private ims.assessment.instantiation.domain.objects.PatientAssessment operativeFindings;
	/** ProcedureDetails */
	private ims.assessment.instantiation.domain.objects.PatientAssessment procedureDetails;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgeryDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgeryDetails ()
    {
    	super();
    }
    public SurgeryDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgeryDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getPatientProcedure() {
		return patientProcedure;
	}
	public void setPatientProcedure(ims.core.clinical.domain.objects.PatientProcedure patientProcedure) {
		this.patientProcedure = patientProcedure;
	}

	public ims.core.resource.place.domain.objects.Organisation getHospitalPerformed() {
		return hospitalPerformed;
	}
	public void setHospitalPerformed(ims.core.resource.place.domain.objects.Organisation hospitalPerformed) {
		this.hospitalPerformed = hospitalPerformed;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleConsultant() {
		return responsibleConsultant;
	}
	public void setResponsibleConsultant(ims.core.resource.people.domain.objects.Hcp responsibleConsultant) {
		this.responsibleConsultant = responsibleConsultant;
	}

	public ims.domain.lookups.LookupInstance getSpecialtyFunctionCode() {
		return specialtyFunctionCode;
	}
	public void setSpecialtyFunctionCode(ims.domain.lookups.LookupInstance specialtyFunctionCode) {
		this.specialtyFunctionCode = specialtyFunctionCode;
	}

	public java.util.Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(java.util.Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public ims.domain.lookups.LookupInstance getDischargeDestination() {
		return dischargeDestination;
	}
	public void setDischargeDestination(ims.domain.lookups.LookupInstance dischargeDestination) {
		this.dischargeDestination = dischargeDestination;
	}

	public ims.domain.lookups.LookupInstance getASAGrade() {
		return aSAGrade;
	}
	public void setASAGrade(ims.domain.lookups.LookupInstance aSAGrade) {
		this.aSAGrade = aSAGrade;
	}

	public ims.domain.lookups.LookupInstance getConsultantPresence() {
		return consultantPresence;
	}
	public void setConsultantPresence(ims.domain.lookups.LookupInstance consultantPresence) {
		this.consultantPresence = consultantPresence;
	}

	public java.util.Set getSubProcedures() {
		if ( null == subProcedures ) {
			subProcedures = new java.util.HashSet();
		}
		return subProcedures;
	}
	public void setSubProcedures(java.util.Set paramValue) {
		this.subProcedures = paramValue;
	}

	public ims.core.resource.people.domain.objects.Hcp getAnaesthetist() {
		return anaesthetist;
	}
	public void setAnaesthetist(ims.core.resource.people.domain.objects.Hcp anaesthetist) {
		this.anaesthetist = anaesthetist;
	}

	public ims.domain.lookups.LookupInstance getAnaesthetistGrade() {
		return anaesthetistGrade;
	}
	public void setAnaesthetistGrade(ims.domain.lookups.LookupInstance anaesthetistGrade) {
		this.anaesthetistGrade = anaesthetistGrade;
	}

	public java.util.Set getAssistants() {
		if ( null == assistants ) {
			assistants = new java.util.HashSet();
		}
		return assistants;
	}
	public void setAssistants(java.util.Set paramValue) {
		this.assistants = paramValue;
	}

	public ims.domain.lookups.LookupInstance getProcedureType() {
		return procedureType;
	}
	public void setProcedureType(ims.domain.lookups.LookupInstance procedureType) {
		this.procedureType = procedureType;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getPreOpPossum() {
		return preOpPossum;
	}
	public void setPreOpPossum(ims.assessment.instantiation.domain.objects.PatientAssessment preOpPossum) {
		this.preOpPossum = preOpPossum;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getOperativeDetailsPossum() {
		return operativeDetailsPossum;
	}
	public void setOperativeDetailsPossum(ims.assessment.instantiation.domain.objects.PatientAssessment operativeDetailsPossum) {
		this.operativeDetailsPossum = operativeDetailsPossum;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getOperativeFindings() {
		return operativeFindings;
	}
	public void setOperativeFindings(ims.assessment.instantiation.domain.objects.PatientAssessment operativeFindings) {
		this.operativeFindings = operativeFindings;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(ims.assessment.instantiation.domain.objects.PatientAssessment procedureDetails) {
		this.procedureDetails = procedureDetails;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientProcedure* :");
		if (patientProcedure != null)
		{
			auditStr.append(toShortClassName(patientProcedure));
				
		    auditStr.append(patientProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospitalPerformed* :");
		if (hospitalPerformed != null)
		{
			auditStr.append(toShortClassName(hospitalPerformed));
				
		    auditStr.append(hospitalPerformed.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleConsultant* :");
		if (responsibleConsultant != null)
		{
			auditStr.append(toShortClassName(responsibleConsultant));
				
		    auditStr.append(responsibleConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialtyFunctionCode* :");
		if (specialtyFunctionCode != null)
			auditStr.append(specialtyFunctionCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDate* :");
		auditStr.append(admissionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDestination* :");
		if (dischargeDestination != null)
			auditStr.append(dischargeDestination.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*aSAGrade* :");
		if (aSAGrade != null)
			auditStr.append(aSAGrade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantPresence* :");
		if (consultantPresence != null)
			auditStr.append(consultantPresence.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*subProcedures* :");
		if (subProcedures != null)
		{
			java.util.Iterator it11 = subProcedures.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.SubProcedures obj = (ims.core.clinical.domain.objects.SubProcedures)it11.next();
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
		auditStr.append("\r\n*anaesthetist* :");
		if (anaesthetist != null)
		{
			auditStr.append(toShortClassName(anaesthetist));
				
		    auditStr.append(anaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistGrade* :");
		if (anaesthetistGrade != null)
			auditStr.append(anaesthetistGrade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assistants* :");
		if (assistants != null)
		{
			java.util.Iterator it14 = assistants.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.SurgeryAssistants obj = (ims.clinical.domain.objects.SurgeryAssistants)it14.next();
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
		auditStr.append("\r\n*procedureType* :");
		if (procedureType != null)
			auditStr.append(procedureType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpPossum* :");
		if (preOpPossum != null)
		{
			auditStr.append(toShortClassName(preOpPossum));
				
		    auditStr.append(preOpPossum.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*operativeDetailsPossum* :");
		if (operativeDetailsPossum != null)
		{
			auditStr.append(toShortClassName(operativeDetailsPossum));
				
		    auditStr.append(operativeDetailsPossum.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*operativeFindings* :");
		if (operativeFindings != null)
		{
			auditStr.append(toShortClassName(operativeFindings));
				
		    auditStr.append(operativeFindings.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDetails* :");
		if (procedureDetails != null)
		{
			auditStr.append(toShortClassName(procedureDetails));
				
		    auditStr.append(procedureDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
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
		
		String keyClassName = "SurgeryDetails";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPatientProcedure() != null)
		{
			sb.append("<patientProcedure>");
			sb.append(this.getPatientProcedure().toXMLString(domMap)); 	
			sb.append("</patientProcedure>");		
		}
		if (this.getHospitalPerformed() != null)
		{
			sb.append("<hospitalPerformed>");
			sb.append(this.getHospitalPerformed().toXMLString(domMap)); 	
			sb.append("</hospitalPerformed>");		
		}
		if (this.getResponsibleConsultant() != null)
		{
			sb.append("<responsibleConsultant>");
			sb.append(this.getResponsibleConsultant().toXMLString(domMap)); 	
			sb.append("</responsibleConsultant>");		
		}
		if (this.getSpecialtyFunctionCode() != null)
		{
			sb.append("<specialtyFunctionCode>");
			sb.append(this.getSpecialtyFunctionCode().toXMLString()); 
			sb.append("</specialtyFunctionCode>");		
		}
		if (this.getAdmissionDate() != null)
		{
			sb.append("<admissionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDate>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getDischargeDestination() != null)
		{
			sb.append("<dischargeDestination>");
			sb.append(this.getDischargeDestination().toXMLString()); 
			sb.append("</dischargeDestination>");		
		}
		if (this.getASAGrade() != null)
		{
			sb.append("<aSAGrade>");
			sb.append(this.getASAGrade().toXMLString()); 
			sb.append("</aSAGrade>");		
		}
		if (this.getConsultantPresence() != null)
		{
			sb.append("<consultantPresence>");
			sb.append(this.getConsultantPresence().toXMLString()); 
			sb.append("</consultantPresence>");		
		}
		if (this.getSubProcedures() != null)
		{
			if (this.getSubProcedures().size() > 0 )
			{
			sb.append("<subProcedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSubProcedures(), domMap));
			sb.append("</subProcedures>");		
			}
		}
		if (this.getAnaesthetist() != null)
		{
			sb.append("<anaesthetist>");
			sb.append(this.getAnaesthetist().toXMLString(domMap)); 	
			sb.append("</anaesthetist>");		
		}
		if (this.getAnaesthetistGrade() != null)
		{
			sb.append("<anaesthetistGrade>");
			sb.append(this.getAnaesthetistGrade().toXMLString()); 
			sb.append("</anaesthetistGrade>");		
		}
		if (this.getAssistants() != null)
		{
			if (this.getAssistants().size() > 0 )
			{
			sb.append("<assistants>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssistants(), domMap));
			sb.append("</assistants>");		
			}
		}
		if (this.getProcedureType() != null)
		{
			sb.append("<procedureType>");
			sb.append(this.getProcedureType().toXMLString()); 
			sb.append("</procedureType>");		
		}
		if (this.getPreOpPossum() != null)
		{
			sb.append("<preOpPossum>");
			sb.append(this.getPreOpPossum().toXMLString(domMap)); 	
			sb.append("</preOpPossum>");		
		}
		if (this.getOperativeDetailsPossum() != null)
		{
			sb.append("<operativeDetailsPossum>");
			sb.append(this.getOperativeDetailsPossum().toXMLString(domMap)); 	
			sb.append("</operativeDetailsPossum>");		
		}
		if (this.getOperativeFindings() != null)
		{
			sb.append("<operativeFindings>");
			sb.append(this.getOperativeFindings().toXMLString(domMap)); 	
			sb.append("</operativeFindings>");		
		}
		if (this.getProcedureDetails() != null)
		{
			sb.append("<procedureDetails>");
			sb.append(this.getProcedureDetails().toXMLString(domMap)); 	
			sb.append("</procedureDetails>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
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
			SurgeryDetails domainObject = getSurgeryDetailsfromXML(itemEl, factory, domMap);

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
			SurgeryDetails domainObject = getSurgeryDetailsfromXML(itemEl, factory, domMap);

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
		
	public static SurgeryDetails getSurgeryDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgeryDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgeryDetails getSurgeryDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgeryDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgeryDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgeryDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgeryDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgeryDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgeryDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgeryDetails)factory.getImportedDomainObject(SurgeryDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgeryDetails();
		}
		String keyClassName = "SurgeryDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgeryDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgeryDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospitalPerformed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospitalPerformed(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("responsibleConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialtyFunctionCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialtyFunctionCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionDate");
		if(fldEl != null)
		{	
    		obj.setAdmissionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDestination");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeDestination(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("aSAGrade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setASAGrade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consultantPresence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsultantPresence(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("subProcedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSubProcedures(ims.core.clinical.domain.objects.SubProcedures.fromSetXMLString(fldEl, factory, obj.getSubProcedures(), domMap));
		}
		fldEl = el.element("anaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaesthetist(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaesthetistGrade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaesthetistGrade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assistants");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssistants(ims.clinical.domain.objects.SurgeryAssistants.fromSetXMLString(fldEl, factory, obj.getAssistants(), domMap));
		}
		fldEl = el.element("procedureType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preOpPossum");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreOpPossum(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("operativeDetailsPossum");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOperativeDetailsPossum(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("operativeFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOperativeFindings(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedureDetails(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "subProcedures"
		, "assistants"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String PatientProcedure = "patientProcedure";
		public static final String HospitalPerformed = "hospitalPerformed";
		public static final String ResponsibleConsultant = "responsibleConsultant";
		public static final String SpecialtyFunctionCode = "specialtyFunctionCode";
		public static final String AdmissionDate = "admissionDate";
		public static final String DischargeDate = "dischargeDate";
		public static final String DischargeDestination = "dischargeDestination";
		public static final String ASAGrade = "aSAGrade";
		public static final String ConsultantPresence = "consultantPresence";
		public static final String SubProcedures = "subProcedures";
		public static final String Anaesthetist = "anaesthetist";
		public static final String AnaesthetistGrade = "anaesthetistGrade";
		public static final String Assistants = "assistants";
		public static final String ProcedureType = "procedureType";
		public static final String PreOpPossum = "preOpPossum";
		public static final String OperativeDetailsPossum = "operativeDetailsPossum";
		public static final String OperativeFindings = "operativeFindings";
		public static final String ProcedureDetails = "procedureDetails";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String EpisodeOfCare = "episodeOfCare";
	}
}

