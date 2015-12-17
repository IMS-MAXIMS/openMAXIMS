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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class IntraOpCaseStaffDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100132;
	private static final long serialVersionUID = 1072100132L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	private ims.domain.lookups.LookupInstance anaestheticType;
	/** Anaesthetist */
	private ims.core.resource.people.domain.objects.Medic anaesthetist;
	/** Assisting Anaesthetist */
	private ims.core.resource.people.domain.objects.Medic assistingAnaesthetist;
	/** Supervising Anaesthetist */
	private ims.core.resource.people.domain.objects.Medic supervisingAnaesthetist;
	/** Anaesthetic Practioner */
	private ims.core.resource.people.domain.objects.Medic anaestheticPractioner;
	/** Responsible HCP */
	private ims.core.resource.people.domain.objects.Medic responsibleHCP;
	/** Operating Surgeon */
	private ims.core.resource.people.domain.objects.Medic operatingSurgeon;
	/** Supervising Surgeon */
	private ims.core.resource.people.domain.objects.Medic supervisingSurgeon;
	/** Assisting Surgeons
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.List assistingSurgeons;
	/** Scrub Practitioner 1 */
	private ims.core.resource.people.domain.objects.Nurse scrubPractitioner1;
	/** Scrub Practitioner 2 */
	private ims.core.resource.people.domain.objects.Nurse scrubPractitioner2;
	/** Other */
	private String other;
	/** Circulator Scrub Nurse Role
	  * Collection of ims.clinical.domain.objects.CirculatorScrubNurseRole.
	  */
	private java.util.List circulatorScrubNurseRoles;
	/** Diathermy and Laser  */
	private Boolean displayDiathermyandLaser;
	/** Irrigation, Catheters, Drains and Tubes  */
	private Boolean displayIrrigationCathetersDrainsTubes;
	/** Specimens, Wound Packing and Skin Closure  */
	private Boolean displaySpecimensWoundPackingSkinClosure;
	/** Implants, Arterial Clamps and Other Equipment  */
	private Boolean displayImplantsArterialClampsOtherEquipment;
	/** Tourniquet  */
	private Boolean displayTourniquet;
	/** Recovery Details  */
	private Boolean displayRecoveryDetails;
	/** is Recovery In Theatre */
	private Boolean isRecoveryInTheatre;
	/** PatientAssessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment patientAssessment;
	/** Case Service */
	private ims.core.clinical.domain.objects.Service caseService;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public IntraOpCaseStaffDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public IntraOpCaseStaffDetails ()
    {
    	super();
    }
    public IntraOpCaseStaffDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.IntraOpCaseStaffDetails.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static IntraOpCaseStaffDetails getIntraOpCaseStaffDetailsFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from IntraOpCaseStaffDetails c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. IntraOpCaseStaffDetails.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (IntraOpCaseStaffDetails)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticType() {
		return anaestheticType;
	}
	public void setAnaestheticType(ims.domain.lookups.LookupInstance anaestheticType) {
		this.anaestheticType = anaestheticType;
	}

	public ims.core.resource.people.domain.objects.Medic getAnaesthetist() {
		return anaesthetist;
	}
	public void setAnaesthetist(ims.core.resource.people.domain.objects.Medic anaesthetist) {
		this.anaesthetist = anaesthetist;
	}

	public ims.core.resource.people.domain.objects.Medic getAssistingAnaesthetist() {
		return assistingAnaesthetist;
	}
	public void setAssistingAnaesthetist(ims.core.resource.people.domain.objects.Medic assistingAnaesthetist) {
		this.assistingAnaesthetist = assistingAnaesthetist;
	}

	public ims.core.resource.people.domain.objects.Medic getSupervisingAnaesthetist() {
		return supervisingAnaesthetist;
	}
	public void setSupervisingAnaesthetist(ims.core.resource.people.domain.objects.Medic supervisingAnaesthetist) {
		this.supervisingAnaesthetist = supervisingAnaesthetist;
	}

	public ims.core.resource.people.domain.objects.Medic getAnaestheticPractioner() {
		return anaestheticPractioner;
	}
	public void setAnaestheticPractioner(ims.core.resource.people.domain.objects.Medic anaestheticPractioner) {
		this.anaestheticPractioner = anaestheticPractioner;
	}

	public ims.core.resource.people.domain.objects.Medic getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Medic responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public ims.core.resource.people.domain.objects.Medic getOperatingSurgeon() {
		return operatingSurgeon;
	}
	public void setOperatingSurgeon(ims.core.resource.people.domain.objects.Medic operatingSurgeon) {
		this.operatingSurgeon = operatingSurgeon;
	}

	public ims.core.resource.people.domain.objects.Medic getSupervisingSurgeon() {
		return supervisingSurgeon;
	}
	public void setSupervisingSurgeon(ims.core.resource.people.domain.objects.Medic supervisingSurgeon) {
		this.supervisingSurgeon = supervisingSurgeon;
	}

	public java.util.List getAssistingSurgeons() {
		if ( null == assistingSurgeons ) {
			assistingSurgeons = new java.util.ArrayList();
		}
		return assistingSurgeons;
	}
	public void setAssistingSurgeons(java.util.List paramValue) {
		this.assistingSurgeons = paramValue;
	}

	public ims.core.resource.people.domain.objects.Nurse getScrubPractitioner1() {
		return scrubPractitioner1;
	}
	public void setScrubPractitioner1(ims.core.resource.people.domain.objects.Nurse scrubPractitioner1) {
		this.scrubPractitioner1 = scrubPractitioner1;
	}

	public ims.core.resource.people.domain.objects.Nurse getScrubPractitioner2() {
		return scrubPractitioner2;
	}
	public void setScrubPractitioner2(ims.core.resource.people.domain.objects.Nurse scrubPractitioner2) {
		this.scrubPractitioner2 = scrubPractitioner2;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		if ( null != other && other.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for other. Tried to set value: "+
				other);
		}
		this.other = other;
	}

	public java.util.List getCirculatorScrubNurseRoles() {
		if ( null == circulatorScrubNurseRoles ) {
			circulatorScrubNurseRoles = new java.util.ArrayList();
		}
		return circulatorScrubNurseRoles;
	}
	public void setCirculatorScrubNurseRoles(java.util.List paramValue) {
		this.circulatorScrubNurseRoles = paramValue;
	}

	public Boolean isDisplayDiathermyandLaser() {
		return displayDiathermyandLaser;
	}
	public void setDisplayDiathermyandLaser(Boolean displayDiathermyandLaser) {
		this.displayDiathermyandLaser = displayDiathermyandLaser;
	}

	public Boolean isDisplayIrrigationCathetersDrainsTubes() {
		return displayIrrigationCathetersDrainsTubes;
	}
	public void setDisplayIrrigationCathetersDrainsTubes(Boolean displayIrrigationCathetersDrainsTubes) {
		this.displayIrrigationCathetersDrainsTubes = displayIrrigationCathetersDrainsTubes;
	}

	public Boolean isDisplaySpecimensWoundPackingSkinClosure() {
		return displaySpecimensWoundPackingSkinClosure;
	}
	public void setDisplaySpecimensWoundPackingSkinClosure(Boolean displaySpecimensWoundPackingSkinClosure) {
		this.displaySpecimensWoundPackingSkinClosure = displaySpecimensWoundPackingSkinClosure;
	}

	public Boolean isDisplayImplantsArterialClampsOtherEquipment() {
		return displayImplantsArterialClampsOtherEquipment;
	}
	public void setDisplayImplantsArterialClampsOtherEquipment(Boolean displayImplantsArterialClampsOtherEquipment) {
		this.displayImplantsArterialClampsOtherEquipment = displayImplantsArterialClampsOtherEquipment;
	}

	public Boolean isDisplayTourniquet() {
		return displayTourniquet;
	}
	public void setDisplayTourniquet(Boolean displayTourniquet) {
		this.displayTourniquet = displayTourniquet;
	}

	public Boolean isDisplayRecoveryDetails() {
		return displayRecoveryDetails;
	}
	public void setDisplayRecoveryDetails(Boolean displayRecoveryDetails) {
		this.displayRecoveryDetails = displayRecoveryDetails;
	}

	public Boolean isIsRecoveryInTheatre() {
		return isRecoveryInTheatre;
	}
	public void setIsRecoveryInTheatre(Boolean isRecoveryInTheatre) {
		this.isRecoveryInTheatre = isRecoveryInTheatre;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getPatientAssessment() {
		return patientAssessment;
	}
	public void setPatientAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment patientAssessment) {
		this.patientAssessment = patientAssessment;
	}

	public ims.core.clinical.domain.objects.Service getCaseService() {
		return caseService;
	}
	public void setCaseService(ims.core.clinical.domain.objects.Service caseService) {
		this.caseService = caseService;
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
		
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
			auditStr.append(anaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetist* :");
		if (anaesthetist != null)
		{
			auditStr.append(toShortClassName(anaesthetist));
				
		    auditStr.append(anaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assistingAnaesthetist* :");
		if (assistingAnaesthetist != null)
		{
			auditStr.append(toShortClassName(assistingAnaesthetist));
				
		    auditStr.append(assistingAnaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisingAnaesthetist* :");
		if (supervisingAnaesthetist != null)
		{
			auditStr.append(toShortClassName(supervisingAnaesthetist));
				
		    auditStr.append(supervisingAnaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticPractioner* :");
		if (anaestheticPractioner != null)
		{
			auditStr.append(toShortClassName(anaestheticPractioner));
				
		    auditStr.append(anaestheticPractioner.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*operatingSurgeon* :");
		if (operatingSurgeon != null)
		{
			auditStr.append(toShortClassName(operatingSurgeon));
				
		    auditStr.append(operatingSurgeon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisingSurgeon* :");
		if (supervisingSurgeon != null)
		{
			auditStr.append(toShortClassName(supervisingSurgeon));
				
		    auditStr.append(supervisingSurgeon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assistingSurgeons* :");
		if (assistingSurgeons != null)
		{
		int i10=0;
		for (i10=0; i10<assistingSurgeons.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)assistingSurgeons.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scrubPractitioner1* :");
		if (scrubPractitioner1 != null)
		{
			auditStr.append(toShortClassName(scrubPractitioner1));
				
		    auditStr.append(scrubPractitioner1.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scrubPractitioner2* :");
		if (scrubPractitioner2 != null)
		{
			auditStr.append(toShortClassName(scrubPractitioner2));
				
		    auditStr.append(scrubPractitioner2.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*other* :");
		auditStr.append(other);
	    auditStr.append("; ");
		auditStr.append("\r\n*circulatorScrubNurseRoles* :");
		if (circulatorScrubNurseRoles != null)
		{
		int i14=0;
		for (i14=0; i14<circulatorScrubNurseRoles.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.CirculatorScrubNurseRole obj = (ims.clinical.domain.objects.CirculatorScrubNurseRole)circulatorScrubNurseRoles.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*displayDiathermyandLaser* :");
		auditStr.append(displayDiathermyandLaser);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayIrrigationCathetersDrainsTubes* :");
		auditStr.append(displayIrrigationCathetersDrainsTubes);
	    auditStr.append("; ");
		auditStr.append("\r\n*displaySpecimensWoundPackingSkinClosure* :");
		auditStr.append(displaySpecimensWoundPackingSkinClosure);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayImplantsArterialClampsOtherEquipment* :");
		auditStr.append(displayImplantsArterialClampsOtherEquipment);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayTourniquet* :");
		auditStr.append(displayTourniquet);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayRecoveryDetails* :");
		auditStr.append(displayRecoveryDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*isRecoveryInTheatre* :");
		auditStr.append(isRecoveryInTheatre);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAssessment* :");
		if (patientAssessment != null)
		{
			auditStr.append(toShortClassName(patientAssessment));
				
		    auditStr.append(patientAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*caseService* :");
		if (caseService != null)
		{
			auditStr.append(toShortClassName(caseService));
				
		    auditStr.append(caseService.getId());
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
		
		String keyClassName = "IntraOpCaseStaffDetails";
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
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.getAnaestheticType() != null)
		{
			sb.append("<anaestheticType>");
			sb.append(this.getAnaestheticType().toXMLString()); 
			sb.append("</anaestheticType>");		
		}
		if (this.getAnaesthetist() != null)
		{
			sb.append("<anaesthetist>");
			sb.append(this.getAnaesthetist().toXMLString(domMap)); 	
			sb.append("</anaesthetist>");		
		}
		if (this.getAssistingAnaesthetist() != null)
		{
			sb.append("<assistingAnaesthetist>");
			sb.append(this.getAssistingAnaesthetist().toXMLString(domMap)); 	
			sb.append("</assistingAnaesthetist>");		
		}
		if (this.getSupervisingAnaesthetist() != null)
		{
			sb.append("<supervisingAnaesthetist>");
			sb.append(this.getSupervisingAnaesthetist().toXMLString(domMap)); 	
			sb.append("</supervisingAnaesthetist>");		
		}
		if (this.getAnaestheticPractioner() != null)
		{
			sb.append("<anaestheticPractioner>");
			sb.append(this.getAnaestheticPractioner().toXMLString(domMap)); 	
			sb.append("</anaestheticPractioner>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.getOperatingSurgeon() != null)
		{
			sb.append("<operatingSurgeon>");
			sb.append(this.getOperatingSurgeon().toXMLString(domMap)); 	
			sb.append("</operatingSurgeon>");		
		}
		if (this.getSupervisingSurgeon() != null)
		{
			sb.append("<supervisingSurgeon>");
			sb.append(this.getSupervisingSurgeon().toXMLString(domMap)); 	
			sb.append("</supervisingSurgeon>");		
		}
		if (this.getAssistingSurgeons() != null)
		{
			if (this.getAssistingSurgeons().size() > 0 )
			{
			sb.append("<assistingSurgeons>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssistingSurgeons(), domMap));
			sb.append("</assistingSurgeons>");		
			}
		}
		if (this.getScrubPractitioner1() != null)
		{
			sb.append("<scrubPractitioner1>");
			sb.append(this.getScrubPractitioner1().toXMLString(domMap)); 	
			sb.append("</scrubPractitioner1>");		
		}
		if (this.getScrubPractitioner2() != null)
		{
			sb.append("<scrubPractitioner2>");
			sb.append(this.getScrubPractitioner2().toXMLString(domMap)); 	
			sb.append("</scrubPractitioner2>");		
		}
		if (this.getOther() != null)
		{
			sb.append("<other>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOther().toString()));
			sb.append("</other>");		
		}
		if (this.getCirculatorScrubNurseRoles() != null)
		{
			if (this.getCirculatorScrubNurseRoles().size() > 0 )
			{
			sb.append("<circulatorScrubNurseRoles>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCirculatorScrubNurseRoles(), domMap));
			sb.append("</circulatorScrubNurseRoles>");		
			}
		}
		if (this.isDisplayDiathermyandLaser() != null)
		{
			sb.append("<displayDiathermyandLaser>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayDiathermyandLaser().toString()));
			sb.append("</displayDiathermyandLaser>");		
		}
		if (this.isDisplayIrrigationCathetersDrainsTubes() != null)
		{
			sb.append("<displayIrrigationCathetersDrainsTubes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayIrrigationCathetersDrainsTubes().toString()));
			sb.append("</displayIrrigationCathetersDrainsTubes>");		
		}
		if (this.isDisplaySpecimensWoundPackingSkinClosure() != null)
		{
			sb.append("<displaySpecimensWoundPackingSkinClosure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplaySpecimensWoundPackingSkinClosure().toString()));
			sb.append("</displaySpecimensWoundPackingSkinClosure>");		
		}
		if (this.isDisplayImplantsArterialClampsOtherEquipment() != null)
		{
			sb.append("<displayImplantsArterialClampsOtherEquipment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayImplantsArterialClampsOtherEquipment().toString()));
			sb.append("</displayImplantsArterialClampsOtherEquipment>");		
		}
		if (this.isDisplayTourniquet() != null)
		{
			sb.append("<displayTourniquet>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayTourniquet().toString()));
			sb.append("</displayTourniquet>");		
		}
		if (this.isDisplayRecoveryDetails() != null)
		{
			sb.append("<displayRecoveryDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayRecoveryDetails().toString()));
			sb.append("</displayRecoveryDetails>");		
		}
		if (this.isIsRecoveryInTheatre() != null)
		{
			sb.append("<isRecoveryInTheatre>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsRecoveryInTheatre().toString()));
			sb.append("</isRecoveryInTheatre>");		
		}
		if (this.getPatientAssessment() != null)
		{
			sb.append("<patientAssessment>");
			sb.append(this.getPatientAssessment().toXMLString(domMap)); 	
			sb.append("</patientAssessment>");		
		}
		if (this.getCaseService() != null)
		{
			sb.append("<caseService>");
			sb.append(this.getCaseService().toXMLString(domMap)); 	
			sb.append("</caseService>");		
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
			IntraOpCaseStaffDetails domainObject = getIntraOpCaseStaffDetailsfromXML(itemEl, factory, domMap);

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
			IntraOpCaseStaffDetails domainObject = getIntraOpCaseStaffDetailsfromXML(itemEl, factory, domMap);

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
		
	public static IntraOpCaseStaffDetails getIntraOpCaseStaffDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIntraOpCaseStaffDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static IntraOpCaseStaffDetails getIntraOpCaseStaffDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!IntraOpCaseStaffDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!IntraOpCaseStaffDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the IntraOpCaseStaffDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (IntraOpCaseStaffDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(IntraOpCaseStaffDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		IntraOpCaseStaffDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (IntraOpCaseStaffDetails)factory.getImportedDomainObject(IntraOpCaseStaffDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new IntraOpCaseStaffDetails();
		}
		String keyClassName = "IntraOpCaseStaffDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (IntraOpCaseStaffDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, IntraOpCaseStaffDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaesthetist(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assistingAnaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssistingAnaesthetist(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("supervisingAnaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSupervisingAnaesthetist(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaestheticPractioner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaestheticPractioner(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("operatingSurgeon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOperatingSurgeon(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("supervisingSurgeon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSupervisingSurgeon(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assistingSurgeons");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssistingSurgeons(ims.core.resource.people.domain.objects.Medic.fromListXMLString(fldEl, factory, obj.getAssistingSurgeons(), domMap));
		}
		fldEl = el.element("scrubPractitioner1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScrubPractitioner1(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scrubPractitioner2");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScrubPractitioner2(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("other");
		if(fldEl != null)
		{	
    		obj.setOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("circulatorScrubNurseRoles");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCirculatorScrubNurseRoles(ims.clinical.domain.objects.CirculatorScrubNurseRole.fromListXMLString(fldEl, factory, obj.getCirculatorScrubNurseRoles(), domMap));
		}
		fldEl = el.element("displayDiathermyandLaser");
		if(fldEl != null)
		{	
    		obj.setDisplayDiathermyandLaser(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayIrrigationCathetersDrainsTubes");
		if(fldEl != null)
		{	
    		obj.setDisplayIrrigationCathetersDrainsTubes(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displaySpecimensWoundPackingSkinClosure");
		if(fldEl != null)
		{	
    		obj.setDisplaySpecimensWoundPackingSkinClosure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayImplantsArterialClampsOtherEquipment");
		if(fldEl != null)
		{	
    		obj.setDisplayImplantsArterialClampsOtherEquipment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayTourniquet");
		if(fldEl != null)
		{	
    		obj.setDisplayTourniquet(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayRecoveryDetails");
		if(fldEl != null)
		{	
    		obj.setDisplayRecoveryDetails(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isRecoveryInTheatre");
		if(fldEl != null)
		{	
    		obj.setIsRecoveryInTheatre(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCaseService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assistingSurgeons"
		, "circulatorScrubNurseRoles"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String AnaestheticType = "anaestheticType";
		public static final String Anaesthetist = "anaesthetist";
		public static final String AssistingAnaesthetist = "assistingAnaesthetist";
		public static final String SupervisingAnaesthetist = "supervisingAnaesthetist";
		public static final String AnaestheticPractioner = "anaestheticPractioner";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String OperatingSurgeon = "operatingSurgeon";
		public static final String SupervisingSurgeon = "supervisingSurgeon";
		public static final String AssistingSurgeons = "assistingSurgeons";
		public static final String ScrubPractitioner1 = "scrubPractitioner1";
		public static final String ScrubPractitioner2 = "scrubPractitioner2";
		public static final String Other = "other";
		public static final String CirculatorScrubNurseRoles = "circulatorScrubNurseRoles";
		public static final String DisplayDiathermyandLaser = "displayDiathermyandLaser";
		public static final String DisplayIrrigationCathetersDrainsTubes = "displayIrrigationCathetersDrainsTubes";
		public static final String DisplaySpecimensWoundPackingSkinClosure = "displaySpecimensWoundPackingSkinClosure";
		public static final String DisplayImplantsArterialClampsOtherEquipment = "displayImplantsArterialClampsOtherEquipment";
		public static final String DisplayTourniquet = "displayTourniquet";
		public static final String DisplayRecoveryDetails = "displayRecoveryDetails";
		public static final String IsRecoveryInTheatre = "isRecoveryInTheatre";
		public static final String PatientAssessment = "patientAssessment";
		public static final String CaseService = "caseService";
	}
}

