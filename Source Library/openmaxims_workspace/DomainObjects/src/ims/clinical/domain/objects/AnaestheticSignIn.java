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


public class AnaestheticSignIn extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100129;
	private static final long serialVersionUID = 1072100129L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Patient confirmed their identity against consent and ID bracelet */
	private Boolean patientConfirmedIdentity;
	/** ID bracelet checked against consent */
	private Boolean idBraceletChecked;
	/** Allergies Checked */
	private Boolean allergiesChecked;
	/** Allergies confirmed by patient */
	private ims.domain.lookups.LookupInstance allergiesConfirmedByPatient;
	/** Allergy bracelet present and correct */
	private Boolean allergyBraceletPresen;
	/** Is the patient diabetic */
	private ims.domain.lookups.LookupInstance isPatientDiabetic;
	/** Procedure and Site Confirmed by Patient */
	private ims.domain.lookups.LookupInstance procedureAndSiteConfirmedByPatient;
	/** Procedure and Site Confirmed by Practitioner  */
	private ims.domain.lookups.LookupInstance procedureAndSiteConfirmedByPractitioner;
	/** Operation site Marked */
	private ims.domain.lookups.LookupInstance operationSiteMarked;
	/** Patient Starved */
	private ims.domain.lookups.LookupInstance patientStarved;
	/** Anaesthetic Type */
	private ims.domain.lookups.LookupInstance anaestheticType;
	/** Regional Block Required? */
	private Boolean regionalBlockRequired;
	/** Anticoagulant Status Confirmed */
	private Boolean anticoagulantStatusConfirmed;
	/** ASA Class */
	private Integer aSAClass;
	/** Anaesthesia machine and medication check complete */
	private Boolean anaesthesiaMachineAndMedicationCheckComplete;
	/** Dentures, Implants or Loose Teeth Check Complate */
	private Boolean denturesImplantsLooseTeeth;
	/** Does this patient have a known difficult airway / aspiration risk and is the appropriate equipment / assistance available? */
	private ims.domain.lookups.LookupInstance knownDifficultAirway;
	/** Is there a risk of >500ml blood loss (7 ml/kg in children)? */
	private ims.domain.lookups.LookupInstance riskOrGreaterThan500mlBloodLoss;
	/** G&S / Electronic issue or cross matched / cell salvage with operator is available? */
	private Boolean gandSElectronicIssues;
	/** Intra-operative fluids required */
	private ims.domain.lookups.LookupInstance intraoperativeFluidsRequired;
	/** Antibiotics required */
	private Boolean antibioticsRequired;
	/** Antibiotics given and administration record completed */
	private java.util.Date antibioticsGivenDateTime;
	/** Patient pre-induction Temperature */
	private java.lang.Float patientPreinductionTemperature;
	/** Pre-op Blood Glucose  result */
	private java.lang.Float preopBloodGlucoseResult;
	/** Signature by registered practitioner */
	private ims.core.resource.people.domain.objects.Medic signatureByRegisteredPractitioner;
	/** LA Anaesthetic Block Type
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List lAAnaestheticBlockType;
	/** Interscalene */
	private Boolean interscalene;
	/** Axillary */
	private Boolean axillary;
	/** Left and Right Side checked and correct side marked */
	private ims.domain.lookups.LookupInstance leftAndRightSideCheckedAndSorrectSideMarked;
	/** Anaesthetist sign */
	private ims.core.resource.people.domain.objects.Medic anaesthetistSign;
	/** Relevant Charts And Notes Present */
	private Boolean relevantChartsNotesPresent;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AnaestheticSignIn (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AnaestheticSignIn ()
    {
    	super();
    }
    public AnaestheticSignIn (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.AnaestheticSignIn.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static AnaestheticSignIn getAnaestheticSignInFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from AnaestheticSignIn c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. AnaestheticSignIn.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (AnaestheticSignIn)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public Boolean isPatientConfirmedIdentity() {
		return patientConfirmedIdentity;
	}
	public void setPatientConfirmedIdentity(Boolean patientConfirmedIdentity) {
		this.patientConfirmedIdentity = patientConfirmedIdentity;
	}

	public Boolean isIdBraceletChecked() {
		return idBraceletChecked;
	}
	public void setIdBraceletChecked(Boolean idBraceletChecked) {
		this.idBraceletChecked = idBraceletChecked;
	}

	public Boolean isAllergiesChecked() {
		return allergiesChecked;
	}
	public void setAllergiesChecked(Boolean allergiesChecked) {
		this.allergiesChecked = allergiesChecked;
	}

	public ims.domain.lookups.LookupInstance getAllergiesConfirmedByPatient() {
		return allergiesConfirmedByPatient;
	}
	public void setAllergiesConfirmedByPatient(ims.domain.lookups.LookupInstance allergiesConfirmedByPatient) {
		this.allergiesConfirmedByPatient = allergiesConfirmedByPatient;
	}

	public Boolean isAllergyBraceletPresen() {
		return allergyBraceletPresen;
	}
	public void setAllergyBraceletPresen(Boolean allergyBraceletPresen) {
		this.allergyBraceletPresen = allergyBraceletPresen;
	}

	public ims.domain.lookups.LookupInstance getIsPatientDiabetic() {
		return isPatientDiabetic;
	}
	public void setIsPatientDiabetic(ims.domain.lookups.LookupInstance isPatientDiabetic) {
		this.isPatientDiabetic = isPatientDiabetic;
	}

	public ims.domain.lookups.LookupInstance getProcedureAndSiteConfirmedByPatient() {
		return procedureAndSiteConfirmedByPatient;
	}
	public void setProcedureAndSiteConfirmedByPatient(ims.domain.lookups.LookupInstance procedureAndSiteConfirmedByPatient) {
		this.procedureAndSiteConfirmedByPatient = procedureAndSiteConfirmedByPatient;
	}

	public ims.domain.lookups.LookupInstance getProcedureAndSiteConfirmedByPractitioner() {
		return procedureAndSiteConfirmedByPractitioner;
	}
	public void setProcedureAndSiteConfirmedByPractitioner(ims.domain.lookups.LookupInstance procedureAndSiteConfirmedByPractitioner) {
		this.procedureAndSiteConfirmedByPractitioner = procedureAndSiteConfirmedByPractitioner;
	}

	public ims.domain.lookups.LookupInstance getOperationSiteMarked() {
		return operationSiteMarked;
	}
	public void setOperationSiteMarked(ims.domain.lookups.LookupInstance operationSiteMarked) {
		this.operationSiteMarked = operationSiteMarked;
	}

	public ims.domain.lookups.LookupInstance getPatientStarved() {
		return patientStarved;
	}
	public void setPatientStarved(ims.domain.lookups.LookupInstance patientStarved) {
		this.patientStarved = patientStarved;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticType() {
		return anaestheticType;
	}
	public void setAnaestheticType(ims.domain.lookups.LookupInstance anaestheticType) {
		this.anaestheticType = anaestheticType;
	}

	public Boolean isRegionalBlockRequired() {
		return regionalBlockRequired;
	}
	public void setRegionalBlockRequired(Boolean regionalBlockRequired) {
		this.regionalBlockRequired = regionalBlockRequired;
	}

	public Boolean isAnticoagulantStatusConfirmed() {
		return anticoagulantStatusConfirmed;
	}
	public void setAnticoagulantStatusConfirmed(Boolean anticoagulantStatusConfirmed) {
		this.anticoagulantStatusConfirmed = anticoagulantStatusConfirmed;
	}

	public Integer getASAClass() {
		return aSAClass;
	}
	public void setASAClass(Integer aSAClass) {
		this.aSAClass = aSAClass;
	}

	public Boolean isAnaesthesiaMachineAndMedicationCheckComplete() {
		return anaesthesiaMachineAndMedicationCheckComplete;
	}
	public void setAnaesthesiaMachineAndMedicationCheckComplete(Boolean anaesthesiaMachineAndMedicationCheckComplete) {
		this.anaesthesiaMachineAndMedicationCheckComplete = anaesthesiaMachineAndMedicationCheckComplete;
	}

	public Boolean isDenturesImplantsLooseTeeth() {
		return denturesImplantsLooseTeeth;
	}
	public void setDenturesImplantsLooseTeeth(Boolean denturesImplantsLooseTeeth) {
		this.denturesImplantsLooseTeeth = denturesImplantsLooseTeeth;
	}

	public ims.domain.lookups.LookupInstance getKnownDifficultAirway() {
		return knownDifficultAirway;
	}
	public void setKnownDifficultAirway(ims.domain.lookups.LookupInstance knownDifficultAirway) {
		this.knownDifficultAirway = knownDifficultAirway;
	}

	public ims.domain.lookups.LookupInstance getRiskOrGreaterThan500mlBloodLoss() {
		return riskOrGreaterThan500mlBloodLoss;
	}
	public void setRiskOrGreaterThan500mlBloodLoss(ims.domain.lookups.LookupInstance riskOrGreaterThan500mlBloodLoss) {
		this.riskOrGreaterThan500mlBloodLoss = riskOrGreaterThan500mlBloodLoss;
	}

	public Boolean isGandSElectronicIssues() {
		return gandSElectronicIssues;
	}
	public void setGandSElectronicIssues(Boolean gandSElectronicIssues) {
		this.gandSElectronicIssues = gandSElectronicIssues;
	}

	public ims.domain.lookups.LookupInstance getIntraoperativeFluidsRequired() {
		return intraoperativeFluidsRequired;
	}
	public void setIntraoperativeFluidsRequired(ims.domain.lookups.LookupInstance intraoperativeFluidsRequired) {
		this.intraoperativeFluidsRequired = intraoperativeFluidsRequired;
	}

	public Boolean isAntibioticsRequired() {
		return antibioticsRequired;
	}
	public void setAntibioticsRequired(Boolean antibioticsRequired) {
		this.antibioticsRequired = antibioticsRequired;
	}

	public java.util.Date getAntibioticsGivenDateTime() {
		return antibioticsGivenDateTime;
	}
	public void setAntibioticsGivenDateTime(java.util.Date antibioticsGivenDateTime) {
		this.antibioticsGivenDateTime = antibioticsGivenDateTime;
	}

	public java.lang.Float getPatientPreinductionTemperature() {
		return patientPreinductionTemperature;
	}
	public void setPatientPreinductionTemperature(java.lang.Float patientPreinductionTemperature) {
		this.patientPreinductionTemperature = patientPreinductionTemperature;
	}

	public java.lang.Float getPreopBloodGlucoseResult() {
		return preopBloodGlucoseResult;
	}
	public void setPreopBloodGlucoseResult(java.lang.Float preopBloodGlucoseResult) {
		this.preopBloodGlucoseResult = preopBloodGlucoseResult;
	}

	public ims.core.resource.people.domain.objects.Medic getSignatureByRegisteredPractitioner() {
		return signatureByRegisteredPractitioner;
	}
	public void setSignatureByRegisteredPractitioner(ims.core.resource.people.domain.objects.Medic signatureByRegisteredPractitioner) {
		this.signatureByRegisteredPractitioner = signatureByRegisteredPractitioner;
	}

	public java.util.List getLAAnaestheticBlockType() {
		if ( null == lAAnaestheticBlockType ) {
			lAAnaestheticBlockType = new java.util.ArrayList();
		}
		return lAAnaestheticBlockType;
	}
	public void setLAAnaestheticBlockType(java.util.List paramValue) {
		this.lAAnaestheticBlockType = paramValue;
	}

	public Boolean isInterscalene() {
		return interscalene;
	}
	public void setInterscalene(Boolean interscalene) {
		this.interscalene = interscalene;
	}

	public Boolean isAxillary() {
		return axillary;
	}
	public void setAxillary(Boolean axillary) {
		this.axillary = axillary;
	}

	public ims.domain.lookups.LookupInstance getLeftAndRightSideCheckedAndSorrectSideMarked() {
		return leftAndRightSideCheckedAndSorrectSideMarked;
	}
	public void setLeftAndRightSideCheckedAndSorrectSideMarked(ims.domain.lookups.LookupInstance leftAndRightSideCheckedAndSorrectSideMarked) {
		this.leftAndRightSideCheckedAndSorrectSideMarked = leftAndRightSideCheckedAndSorrectSideMarked;
	}

	public ims.core.resource.people.domain.objects.Medic getAnaesthetistSign() {
		return anaesthetistSign;
	}
	public void setAnaesthetistSign(ims.core.resource.people.domain.objects.Medic anaesthetistSign) {
		this.anaesthetistSign = anaesthetistSign;
	}

	public Boolean isRelevantChartsNotesPresent() {
		return relevantChartsNotesPresent;
	}
	public void setRelevantChartsNotesPresent(Boolean relevantChartsNotesPresent) {
		this.relevantChartsNotesPresent = relevantChartsNotesPresent;
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
		auditStr.append("\r\n*patientConfirmedIdentity* :");
		auditStr.append(patientConfirmedIdentity);
	    auditStr.append("; ");
		auditStr.append("\r\n*idBraceletChecked* :");
		auditStr.append(idBraceletChecked);
	    auditStr.append("; ");
		auditStr.append("\r\n*allergiesChecked* :");
		auditStr.append(allergiesChecked);
	    auditStr.append("; ");
		auditStr.append("\r\n*allergiesConfirmedByPatient* :");
		if (allergiesConfirmedByPatient != null)
			auditStr.append(allergiesConfirmedByPatient.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allergyBraceletPresen* :");
		auditStr.append(allergyBraceletPresen);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPatientDiabetic* :");
		if (isPatientDiabetic != null)
			auditStr.append(isPatientDiabetic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureAndSiteConfirmedByPatient* :");
		if (procedureAndSiteConfirmedByPatient != null)
			auditStr.append(procedureAndSiteConfirmedByPatient.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureAndSiteConfirmedByPractitioner* :");
		if (procedureAndSiteConfirmedByPractitioner != null)
			auditStr.append(procedureAndSiteConfirmedByPractitioner.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*operationSiteMarked* :");
		if (operationSiteMarked != null)
			auditStr.append(operationSiteMarked.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStarved* :");
		if (patientStarved != null)
			auditStr.append(patientStarved.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
			auditStr.append(anaestheticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*regionalBlockRequired* :");
		auditStr.append(regionalBlockRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*anticoagulantStatusConfirmed* :");
		auditStr.append(anticoagulantStatusConfirmed);
	    auditStr.append("; ");
		auditStr.append("\r\n*aSAClass* :");
		auditStr.append(aSAClass);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthesiaMachineAndMedicationCheckComplete* :");
		auditStr.append(anaesthesiaMachineAndMedicationCheckComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*denturesImplantsLooseTeeth* :");
		auditStr.append(denturesImplantsLooseTeeth);
	    auditStr.append("; ");
		auditStr.append("\r\n*knownDifficultAirway* :");
		if (knownDifficultAirway != null)
			auditStr.append(knownDifficultAirway.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*riskOrGreaterThan500mlBloodLoss* :");
		if (riskOrGreaterThan500mlBloodLoss != null)
			auditStr.append(riskOrGreaterThan500mlBloodLoss.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*gandSElectronicIssues* :");
		auditStr.append(gandSElectronicIssues);
	    auditStr.append("; ");
		auditStr.append("\r\n*intraoperativeFluidsRequired* :");
		if (intraoperativeFluidsRequired != null)
			auditStr.append(intraoperativeFluidsRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*antibioticsRequired* :");
		auditStr.append(antibioticsRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*antibioticsGivenDateTime* :");
		auditStr.append(antibioticsGivenDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientPreinductionTemperature* :");
		auditStr.append(patientPreinductionTemperature);
	    auditStr.append("; ");
		auditStr.append("\r\n*preopBloodGlucoseResult* :");
		auditStr.append(preopBloodGlucoseResult);
	    auditStr.append("; ");
		auditStr.append("\r\n*signatureByRegisteredPractitioner* :");
		if (signatureByRegisteredPractitioner != null)
		{
			auditStr.append(toShortClassName(signatureByRegisteredPractitioner));
				
		    auditStr.append(signatureByRegisteredPractitioner.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lAAnaestheticBlockType* :");
		if (lAAnaestheticBlockType != null)
		{
		int i27=0;
		for (i27=0; i27<lAAnaestheticBlockType.size(); i27++)
		{
			if (i27 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)lAAnaestheticBlockType.get(i27);
			auditStr.append(obj.getText());
		}
		if (i27 > 0)
			auditStr.append("] " + i27);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*interscalene* :");
		auditStr.append(interscalene);
	    auditStr.append("; ");
		auditStr.append("\r\n*axillary* :");
		auditStr.append(axillary);
	    auditStr.append("; ");
		auditStr.append("\r\n*leftAndRightSideCheckedAndSorrectSideMarked* :");
		if (leftAndRightSideCheckedAndSorrectSideMarked != null)
			auditStr.append(leftAndRightSideCheckedAndSorrectSideMarked.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistSign* :");
		if (anaesthetistSign != null)
		{
			auditStr.append(toShortClassName(anaesthetistSign));
				
		    auditStr.append(anaesthetistSign.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantChartsNotesPresent* :");
		auditStr.append(relevantChartsNotesPresent);
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
		
		String keyClassName = "AnaestheticSignIn";
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
		if (this.isPatientConfirmedIdentity() != null)
		{
			sb.append("<patientConfirmedIdentity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPatientConfirmedIdentity().toString()));
			sb.append("</patientConfirmedIdentity>");		
		}
		if (this.isIdBraceletChecked() != null)
		{
			sb.append("<idBraceletChecked>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIdBraceletChecked().toString()));
			sb.append("</idBraceletChecked>");		
		}
		if (this.isAllergiesChecked() != null)
		{
			sb.append("<allergiesChecked>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllergiesChecked().toString()));
			sb.append("</allergiesChecked>");		
		}
		if (this.getAllergiesConfirmedByPatient() != null)
		{
			sb.append("<allergiesConfirmedByPatient>");
			sb.append(this.getAllergiesConfirmedByPatient().toXMLString()); 
			sb.append("</allergiesConfirmedByPatient>");		
		}
		if (this.isAllergyBraceletPresen() != null)
		{
			sb.append("<allergyBraceletPresen>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllergyBraceletPresen().toString()));
			sb.append("</allergyBraceletPresen>");		
		}
		if (this.getIsPatientDiabetic() != null)
		{
			sb.append("<isPatientDiabetic>");
			sb.append(this.getIsPatientDiabetic().toXMLString()); 
			sb.append("</isPatientDiabetic>");		
		}
		if (this.getProcedureAndSiteConfirmedByPatient() != null)
		{
			sb.append("<procedureAndSiteConfirmedByPatient>");
			sb.append(this.getProcedureAndSiteConfirmedByPatient().toXMLString()); 
			sb.append("</procedureAndSiteConfirmedByPatient>");		
		}
		if (this.getProcedureAndSiteConfirmedByPractitioner() != null)
		{
			sb.append("<procedureAndSiteConfirmedByPractitioner>");
			sb.append(this.getProcedureAndSiteConfirmedByPractitioner().toXMLString()); 
			sb.append("</procedureAndSiteConfirmedByPractitioner>");		
		}
		if (this.getOperationSiteMarked() != null)
		{
			sb.append("<operationSiteMarked>");
			sb.append(this.getOperationSiteMarked().toXMLString()); 
			sb.append("</operationSiteMarked>");		
		}
		if (this.getPatientStarved() != null)
		{
			sb.append("<patientStarved>");
			sb.append(this.getPatientStarved().toXMLString()); 
			sb.append("</patientStarved>");		
		}
		if (this.getAnaestheticType() != null)
		{
			sb.append("<anaestheticType>");
			sb.append(this.getAnaestheticType().toXMLString()); 
			sb.append("</anaestheticType>");		
		}
		if (this.isRegionalBlockRequired() != null)
		{
			sb.append("<regionalBlockRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRegionalBlockRequired().toString()));
			sb.append("</regionalBlockRequired>");		
		}
		if (this.isAnticoagulantStatusConfirmed() != null)
		{
			sb.append("<anticoagulantStatusConfirmed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnticoagulantStatusConfirmed().toString()));
			sb.append("</anticoagulantStatusConfirmed>");		
		}
		if (this.getASAClass() != null)
		{
			sb.append("<aSAClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getASAClass().toString()));
			sb.append("</aSAClass>");		
		}
		if (this.isAnaesthesiaMachineAndMedicationCheckComplete() != null)
		{
			sb.append("<anaesthesiaMachineAndMedicationCheckComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnaesthesiaMachineAndMedicationCheckComplete().toString()));
			sb.append("</anaesthesiaMachineAndMedicationCheckComplete>");		
		}
		if (this.isDenturesImplantsLooseTeeth() != null)
		{
			sb.append("<denturesImplantsLooseTeeth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDenturesImplantsLooseTeeth().toString()));
			sb.append("</denturesImplantsLooseTeeth>");		
		}
		if (this.getKnownDifficultAirway() != null)
		{
			sb.append("<knownDifficultAirway>");
			sb.append(this.getKnownDifficultAirway().toXMLString()); 
			sb.append("</knownDifficultAirway>");		
		}
		if (this.getRiskOrGreaterThan500mlBloodLoss() != null)
		{
			sb.append("<riskOrGreaterThan500mlBloodLoss>");
			sb.append(this.getRiskOrGreaterThan500mlBloodLoss().toXMLString()); 
			sb.append("</riskOrGreaterThan500mlBloodLoss>");		
		}
		if (this.isGandSElectronicIssues() != null)
		{
			sb.append("<gandSElectronicIssues>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isGandSElectronicIssues().toString()));
			sb.append("</gandSElectronicIssues>");		
		}
		if (this.getIntraoperativeFluidsRequired() != null)
		{
			sb.append("<intraoperativeFluidsRequired>");
			sb.append(this.getIntraoperativeFluidsRequired().toXMLString()); 
			sb.append("</intraoperativeFluidsRequired>");		
		}
		if (this.isAntibioticsRequired() != null)
		{
			sb.append("<antibioticsRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAntibioticsRequired().toString()));
			sb.append("</antibioticsRequired>");		
		}
		if (this.getAntibioticsGivenDateTime() != null)
		{
			sb.append("<antibioticsGivenDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAntibioticsGivenDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</antibioticsGivenDateTime>");		
		}
		if (this.getPatientPreinductionTemperature() != null)
		{
			sb.append("<patientPreinductionTemperature>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientPreinductionTemperature().toString()));
			sb.append("</patientPreinductionTemperature>");		
		}
		if (this.getPreopBloodGlucoseResult() != null)
		{
			sb.append("<preopBloodGlucoseResult>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreopBloodGlucoseResult().toString()));
			sb.append("</preopBloodGlucoseResult>");		
		}
		if (this.getSignatureByRegisteredPractitioner() != null)
		{
			sb.append("<signatureByRegisteredPractitioner>");
			sb.append(this.getSignatureByRegisteredPractitioner().toXMLString(domMap)); 	
			sb.append("</signatureByRegisteredPractitioner>");		
		}
		if (this.getLAAnaestheticBlockType() != null)
		{
			if (this.getLAAnaestheticBlockType().size() > 0 )
			{
			sb.append("<lAAnaestheticBlockType>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getLAAnaestheticBlockType())); 
			sb.append("</lAAnaestheticBlockType>");		
			}
		}
		if (this.isInterscalene() != null)
		{
			sb.append("<interscalene>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInterscalene().toString()));
			sb.append("</interscalene>");		
		}
		if (this.isAxillary() != null)
		{
			sb.append("<axillary>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAxillary().toString()));
			sb.append("</axillary>");		
		}
		if (this.getLeftAndRightSideCheckedAndSorrectSideMarked() != null)
		{
			sb.append("<leftAndRightSideCheckedAndSorrectSideMarked>");
			sb.append(this.getLeftAndRightSideCheckedAndSorrectSideMarked().toXMLString()); 
			sb.append("</leftAndRightSideCheckedAndSorrectSideMarked>");		
		}
		if (this.getAnaesthetistSign() != null)
		{
			sb.append("<anaesthetistSign>");
			sb.append(this.getAnaesthetistSign().toXMLString(domMap)); 	
			sb.append("</anaesthetistSign>");		
		}
		if (this.isRelevantChartsNotesPresent() != null)
		{
			sb.append("<relevantChartsNotesPresent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRelevantChartsNotesPresent().toString()));
			sb.append("</relevantChartsNotesPresent>");		
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
			AnaestheticSignIn domainObject = getAnaestheticSignInfromXML(itemEl, factory, domMap);

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
			AnaestheticSignIn domainObject = getAnaestheticSignInfromXML(itemEl, factory, domMap);

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
		
	public static AnaestheticSignIn getAnaestheticSignInfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAnaestheticSignInfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AnaestheticSignIn getAnaestheticSignInfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AnaestheticSignIn.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AnaestheticSignIn.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AnaestheticSignIn class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AnaestheticSignIn)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AnaestheticSignIn.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AnaestheticSignIn ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AnaestheticSignIn)factory.getImportedDomainObject(AnaestheticSignIn.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AnaestheticSignIn();
		}
		String keyClassName = "AnaestheticSignIn";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AnaestheticSignIn)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AnaestheticSignIn obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientConfirmedIdentity");
		if(fldEl != null)
		{	
    		obj.setPatientConfirmedIdentity(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("idBraceletChecked");
		if(fldEl != null)
		{	
    		obj.setIdBraceletChecked(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allergiesChecked");
		if(fldEl != null)
		{	
    		obj.setAllergiesChecked(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allergiesConfirmedByPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAllergiesConfirmedByPatient(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allergyBraceletPresen");
		if(fldEl != null)
		{	
    		obj.setAllergyBraceletPresen(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPatientDiabetic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsPatientDiabetic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureAndSiteConfirmedByPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureAndSiteConfirmedByPatient(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureAndSiteConfirmedByPractitioner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureAndSiteConfirmedByPractitioner(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("operationSiteMarked");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOperationSiteMarked(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientStarved");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStarved(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("regionalBlockRequired");
		if(fldEl != null)
		{	
    		obj.setRegionalBlockRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anticoagulantStatusConfirmed");
		if(fldEl != null)
		{	
    		obj.setAnticoagulantStatusConfirmed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aSAClass");
		if(fldEl != null)
		{	
    		obj.setASAClass(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anaesthesiaMachineAndMedicationCheckComplete");
		if(fldEl != null)
		{	
    		obj.setAnaesthesiaMachineAndMedicationCheckComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("denturesImplantsLooseTeeth");
		if(fldEl != null)
		{	
    		obj.setDenturesImplantsLooseTeeth(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("knownDifficultAirway");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setKnownDifficultAirway(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("riskOrGreaterThan500mlBloodLoss");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRiskOrGreaterThan500mlBloodLoss(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("gandSElectronicIssues");
		if(fldEl != null)
		{	
    		obj.setGandSElectronicIssues(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intraoperativeFluidsRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntraoperativeFluidsRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("antibioticsRequired");
		if(fldEl != null)
		{	
    		obj.setAntibioticsRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("antibioticsGivenDateTime");
		if(fldEl != null)
		{	
    		obj.setAntibioticsGivenDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("patientPreinductionTemperature");
		if(fldEl != null)
		{	
    		obj.setPatientPreinductionTemperature(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preopBloodGlucoseResult");
		if(fldEl != null)
		{	
    		obj.setPreopBloodGlucoseResult(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("signatureByRegisteredPractitioner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSignatureByRegisteredPractitioner(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lAAnaestheticBlockType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLAAnaestheticBlockType(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getLAAnaestheticBlockType())); 
		}
		fldEl = el.element("interscalene");
		if(fldEl != null)
		{	
    		obj.setInterscalene(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("axillary");
		if(fldEl != null)
		{	
    		obj.setAxillary(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("leftAndRightSideCheckedAndSorrectSideMarked");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLeftAndRightSideCheckedAndSorrectSideMarked(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaesthetistSign");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaesthetistSign(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("relevantChartsNotesPresent");
		if(fldEl != null)
		{	
    		obj.setRelevantChartsNotesPresent(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "lAAnaestheticBlockType"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String PatientConfirmedIdentity = "patientConfirmedIdentity";
		public static final String IdBraceletChecked = "idBraceletChecked";
		public static final String AllergiesChecked = "allergiesChecked";
		public static final String AllergiesConfirmedByPatient = "allergiesConfirmedByPatient";
		public static final String AllergyBraceletPresen = "allergyBraceletPresen";
		public static final String IsPatientDiabetic = "isPatientDiabetic";
		public static final String ProcedureAndSiteConfirmedByPatient = "procedureAndSiteConfirmedByPatient";
		public static final String ProcedureAndSiteConfirmedByPractitioner = "procedureAndSiteConfirmedByPractitioner";
		public static final String OperationSiteMarked = "operationSiteMarked";
		public static final String PatientStarved = "patientStarved";
		public static final String AnaestheticType = "anaestheticType";
		public static final String RegionalBlockRequired = "regionalBlockRequired";
		public static final String AnticoagulantStatusConfirmed = "anticoagulantStatusConfirmed";
		public static final String ASAClass = "aSAClass";
		public static final String AnaesthesiaMachineAndMedicationCheckComplete = "anaesthesiaMachineAndMedicationCheckComplete";
		public static final String DenturesImplantsLooseTeeth = "denturesImplantsLooseTeeth";
		public static final String KnownDifficultAirway = "knownDifficultAirway";
		public static final String RiskOrGreaterThan500mlBloodLoss = "riskOrGreaterThan500mlBloodLoss";
		public static final String GandSElectronicIssues = "gandSElectronicIssues";
		public static final String IntraoperativeFluidsRequired = "intraoperativeFluidsRequired";
		public static final String AntibioticsRequired = "antibioticsRequired";
		public static final String AntibioticsGivenDateTime = "antibioticsGivenDateTime";
		public static final String PatientPreinductionTemperature = "patientPreinductionTemperature";
		public static final String PreopBloodGlucoseResult = "preopBloodGlucoseResult";
		public static final String SignatureByRegisteredPractitioner = "signatureByRegisteredPractitioner";
		public static final String LAAnaestheticBlockType = "lAAnaestheticBlockType";
		public static final String Interscalene = "interscalene";
		public static final String Axillary = "axillary";
		public static final String LeftAndRightSideCheckedAndSorrectSideMarked = "leftAndRightSideCheckedAndSorrectSideMarked";
		public static final String AnaesthetistSign = "anaesthetistSign";
		public static final String RelevantChartsNotesPresent = "relevantChartsNotesPresent";
	}
}

