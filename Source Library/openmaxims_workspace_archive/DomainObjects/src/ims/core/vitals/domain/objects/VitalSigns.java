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
package ims.core.vitals.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class VitalSigns extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100004;
	private static final long serialVersionUID = 1022100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Vitals actually done Date Time - editable */
	private java.util.Date vitalsTakenDateTime;
	/** Blood Pressure */
	private ims.core.vitals.domain.objects.Bloodpressure bloodPressure;
	/** Pulse */
	private ims.core.vitals.domain.objects.Pulse pulse;
	/** Respiratory */
	private ims.core.vitals.domain.objects.Respiratory respiratory;
	/** Temperature */
	private ims.core.vitals.domain.objects.Temperature temperature;
	/** Glasgow Coma Scale */
	private ims.core.vitals.domain.objects.GCS glasgowComaScale;
	/** Oxygen Saturation */
	private ims.core.vitals.domain.objects.OxygenSaturation oxygenSaturation;
	/** Blood Sugar */
	private ims.core.vitals.domain.objects.BloodSugar bloodSugar;
	/** Lung Function Test */
	private ims.core.vitals.domain.objects.LungFunctionTests lungFunctionTest;
	/** Pupils - size and reaction */
	private ims.core.vitals.domain.objects.Pupils pupils;
	/** Visual Acuity */
	private ims.core.vitals.domain.objects.VisualAcuity visualAcuity;
	/** Metrics */
	private ims.core.vitals.domain.objects.Metrics metrics;
	/** Arterial Blood Gas */
	private ims.core.vitals.domain.objects.ArterialBloodGas arterialBloodGas;
	/** Ventilation Chart */
	private ims.core.vitals.domain.objects.VentilationChart ventilationChart;
	/** Pain */
	private ims.core.vitals.domain.objects.Pain pain;
	/** To indicate if the Vital Signs record has been created as part of the Ventilation Record */
	private Boolean isVentilationChartRecord;
	/** Means of indicating which VS's were taken
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List recordedSigns;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Bloodpressure.
	  */
	private java.util.Set inactiveBloodPressure;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Pulse.
	  */
	private java.util.Set inactivePulse;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Respiratory.
	  */
	private java.util.Set inactiveRespiratory;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Temperature.
	  */
	private java.util.Set inactiveTemperature;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.GCS.
	  */
	private java.util.Set inactiveGlasgowComaScale;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.OxygenSaturation.
	  */
	private java.util.Set inactiveOxygenSaturation;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.BloodSugar.
	  */
	private java.util.Set inactiveBloodSugar;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.LungFunctionTests.
	  */
	private java.util.Set inactiveLungFunctionTest;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Pupils.
	  */
	private java.util.Set inactivePupils;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.VisualAcuity.
	  */
	private java.util.Set inactiveVisualAcuity;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Metrics.
	  */
	private java.util.Set inactiveMetrics;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.VentilationChart.
	  */
	private java.util.Set inactiveVentilationChart;
	/** Collection of Inactive Records
	  * Collection of ims.core.vitals.domain.objects.Pain.
	  */
	private java.util.Set inactivePain;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Patient Conscious Level */
	private ims.domain.lookups.LookupInstance patientConscious;
	/** Urine Output */
	private ims.domain.lookups.LookupInstance urine2mlkgkhr;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Patient Causing Concern */
	private ims.domain.lookups.LookupInstance patientCausingConcern;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public VitalSigns (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VitalSigns ()
    {
    	super();
    }
    public VitalSigns (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.VitalSigns.class;
	}


	public java.util.Date getVitalsTakenDateTime() {
		return vitalsTakenDateTime;
	}
	public void setVitalsTakenDateTime(java.util.Date vitalsTakenDateTime) {
		this.vitalsTakenDateTime = vitalsTakenDateTime;
	}

	public ims.core.vitals.domain.objects.Bloodpressure getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(ims.core.vitals.domain.objects.Bloodpressure bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public ims.core.vitals.domain.objects.Pulse getPulse() {
		return pulse;
	}
	public void setPulse(ims.core.vitals.domain.objects.Pulse pulse) {
		this.pulse = pulse;
	}

	public ims.core.vitals.domain.objects.Respiratory getRespiratory() {
		return respiratory;
	}
	public void setRespiratory(ims.core.vitals.domain.objects.Respiratory respiratory) {
		this.respiratory = respiratory;
	}

	public ims.core.vitals.domain.objects.Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(ims.core.vitals.domain.objects.Temperature temperature) {
		this.temperature = temperature;
	}

	public ims.core.vitals.domain.objects.GCS getGlasgowComaScale() {
		return glasgowComaScale;
	}
	public void setGlasgowComaScale(ims.core.vitals.domain.objects.GCS glasgowComaScale) {
		this.glasgowComaScale = glasgowComaScale;
	}

	public ims.core.vitals.domain.objects.OxygenSaturation getOxygenSaturation() {
		return oxygenSaturation;
	}
	public void setOxygenSaturation(ims.core.vitals.domain.objects.OxygenSaturation oxygenSaturation) {
		this.oxygenSaturation = oxygenSaturation;
	}

	public ims.core.vitals.domain.objects.BloodSugar getBloodSugar() {
		return bloodSugar;
	}
	public void setBloodSugar(ims.core.vitals.domain.objects.BloodSugar bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	public ims.core.vitals.domain.objects.LungFunctionTests getLungFunctionTest() {
		return lungFunctionTest;
	}
	public void setLungFunctionTest(ims.core.vitals.domain.objects.LungFunctionTests lungFunctionTest) {
		this.lungFunctionTest = lungFunctionTest;
	}

	public ims.core.vitals.domain.objects.Pupils getPupils() {
		return pupils;
	}
	public void setPupils(ims.core.vitals.domain.objects.Pupils pupils) {
		this.pupils = pupils;
	}

	public ims.core.vitals.domain.objects.VisualAcuity getVisualAcuity() {
		return visualAcuity;
	}
	public void setVisualAcuity(ims.core.vitals.domain.objects.VisualAcuity visualAcuity) {
		this.visualAcuity = visualAcuity;
	}

	public ims.core.vitals.domain.objects.Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(ims.core.vitals.domain.objects.Metrics metrics) {
		this.metrics = metrics;
	}

	public ims.core.vitals.domain.objects.ArterialBloodGas getArterialBloodGas() {
		return arterialBloodGas;
	}
	public void setArterialBloodGas(ims.core.vitals.domain.objects.ArterialBloodGas arterialBloodGas) {
		this.arterialBloodGas = arterialBloodGas;
	}

	public ims.core.vitals.domain.objects.VentilationChart getVentilationChart() {
		return ventilationChart;
	}
	public void setVentilationChart(ims.core.vitals.domain.objects.VentilationChart ventilationChart) {
		this.ventilationChart = ventilationChart;
	}

	public ims.core.vitals.domain.objects.Pain getPain() {
		return pain;
	}
	public void setPain(ims.core.vitals.domain.objects.Pain pain) {
		this.pain = pain;
	}

	public Boolean isIsVentilationChartRecord() {
		return isVentilationChartRecord;
	}
	public void setIsVentilationChartRecord(Boolean isVentilationChartRecord) {
		this.isVentilationChartRecord = isVentilationChartRecord;
	}

	public java.util.List getRecordedSigns() {
		if ( null == recordedSigns ) {
			recordedSigns = new java.util.ArrayList();
		}
		return recordedSigns;
	}
	public void setRecordedSigns(java.util.List paramValue) {
		this.recordedSigns = paramValue;
	}

	public java.util.Set getInactiveBloodPressure() {
		if ( null == inactiveBloodPressure ) {
			inactiveBloodPressure = new java.util.HashSet();
		}
		return inactiveBloodPressure;
	}
	public void setInactiveBloodPressure(java.util.Set paramValue) {
		this.inactiveBloodPressure = paramValue;
	}

	public java.util.Set getInactivePulse() {
		if ( null == inactivePulse ) {
			inactivePulse = new java.util.HashSet();
		}
		return inactivePulse;
	}
	public void setInactivePulse(java.util.Set paramValue) {
		this.inactivePulse = paramValue;
	}

	public java.util.Set getInactiveRespiratory() {
		if ( null == inactiveRespiratory ) {
			inactiveRespiratory = new java.util.HashSet();
		}
		return inactiveRespiratory;
	}
	public void setInactiveRespiratory(java.util.Set paramValue) {
		this.inactiveRespiratory = paramValue;
	}

	public java.util.Set getInactiveTemperature() {
		if ( null == inactiveTemperature ) {
			inactiveTemperature = new java.util.HashSet();
		}
		return inactiveTemperature;
	}
	public void setInactiveTemperature(java.util.Set paramValue) {
		this.inactiveTemperature = paramValue;
	}

	public java.util.Set getInactiveGlasgowComaScale() {
		if ( null == inactiveGlasgowComaScale ) {
			inactiveGlasgowComaScale = new java.util.HashSet();
		}
		return inactiveGlasgowComaScale;
	}
	public void setInactiveGlasgowComaScale(java.util.Set paramValue) {
		this.inactiveGlasgowComaScale = paramValue;
	}

	public java.util.Set getInactiveOxygenSaturation() {
		if ( null == inactiveOxygenSaturation ) {
			inactiveOxygenSaturation = new java.util.HashSet();
		}
		return inactiveOxygenSaturation;
	}
	public void setInactiveOxygenSaturation(java.util.Set paramValue) {
		this.inactiveOxygenSaturation = paramValue;
	}

	public java.util.Set getInactiveBloodSugar() {
		if ( null == inactiveBloodSugar ) {
			inactiveBloodSugar = new java.util.HashSet();
		}
		return inactiveBloodSugar;
	}
	public void setInactiveBloodSugar(java.util.Set paramValue) {
		this.inactiveBloodSugar = paramValue;
	}

	public java.util.Set getInactiveLungFunctionTest() {
		if ( null == inactiveLungFunctionTest ) {
			inactiveLungFunctionTest = new java.util.HashSet();
		}
		return inactiveLungFunctionTest;
	}
	public void setInactiveLungFunctionTest(java.util.Set paramValue) {
		this.inactiveLungFunctionTest = paramValue;
	}

	public java.util.Set getInactivePupils() {
		if ( null == inactivePupils ) {
			inactivePupils = new java.util.HashSet();
		}
		return inactivePupils;
	}
	public void setInactivePupils(java.util.Set paramValue) {
		this.inactivePupils = paramValue;
	}

	public java.util.Set getInactiveVisualAcuity() {
		if ( null == inactiveVisualAcuity ) {
			inactiveVisualAcuity = new java.util.HashSet();
		}
		return inactiveVisualAcuity;
	}
	public void setInactiveVisualAcuity(java.util.Set paramValue) {
		this.inactiveVisualAcuity = paramValue;
	}

	public java.util.Set getInactiveMetrics() {
		if ( null == inactiveMetrics ) {
			inactiveMetrics = new java.util.HashSet();
		}
		return inactiveMetrics;
	}
	public void setInactiveMetrics(java.util.Set paramValue) {
		this.inactiveMetrics = paramValue;
	}

	public java.util.Set getInactiveVentilationChart() {
		if ( null == inactiveVentilationChart ) {
			inactiveVentilationChart = new java.util.HashSet();
		}
		return inactiveVentilationChart;
	}
	public void setInactiveVentilationChart(java.util.Set paramValue) {
		this.inactiveVentilationChart = paramValue;
	}

	public java.util.Set getInactivePain() {
		if ( null == inactivePain ) {
			inactivePain = new java.util.HashSet();
		}
		return inactivePain;
	}
	public void setInactivePain(java.util.Set paramValue) {
		this.inactivePain = paramValue;
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

	public ims.domain.lookups.LookupInstance getPatientConscious() {
		return patientConscious;
	}
	public void setPatientConscious(ims.domain.lookups.LookupInstance patientConscious) {
		this.patientConscious = patientConscious;
	}

	public ims.domain.lookups.LookupInstance getUrine2mlkgkhr() {
		return urine2mlkgkhr;
	}
	public void setUrine2mlkgkhr(ims.domain.lookups.LookupInstance urine2mlkgkhr) {
		this.urine2mlkgkhr = urine2mlkgkhr;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.domain.lookups.LookupInstance getPatientCausingConcern() {
		return patientCausingConcern;
	}
	public void setPatientCausingConcern(ims.domain.lookups.LookupInstance patientCausingConcern) {
		this.patientCausingConcern = patientCausingConcern;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*vitalsTakenDateTime* :");
		auditStr.append(vitalsTakenDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*bloodPressure* :");
		if (bloodPressure != null)
		{
			auditStr.append(toShortClassName(bloodPressure));
				
		    auditStr.append(bloodPressure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pulse* :");
		if (pulse != null)
		{
			auditStr.append(toShortClassName(pulse));
				
		    auditStr.append(pulse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*respiratory* :");
		if (respiratory != null)
		{
			auditStr.append(toShortClassName(respiratory));
				
		    auditStr.append(respiratory.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*temperature* :");
		if (temperature != null)
		{
			auditStr.append(toShortClassName(temperature));
				
		    auditStr.append(temperature.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*glasgowComaScale* :");
		if (glasgowComaScale != null)
		{
			auditStr.append(toShortClassName(glasgowComaScale));
				
		    auditStr.append(glasgowComaScale.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oxygenSaturation* :");
		if (oxygenSaturation != null)
		{
			auditStr.append(toShortClassName(oxygenSaturation));
				
		    auditStr.append(oxygenSaturation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bloodSugar* :");
		if (bloodSugar != null)
		{
			auditStr.append(toShortClassName(bloodSugar));
				
		    auditStr.append(bloodSugar.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lungFunctionTest* :");
		if (lungFunctionTest != null)
		{
			auditStr.append(toShortClassName(lungFunctionTest));
				
		    auditStr.append(lungFunctionTest.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pupils* :");
		if (pupils != null)
		{
			auditStr.append(toShortClassName(pupils));
				
		    auditStr.append(pupils.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*visualAcuity* :");
		if (visualAcuity != null)
		{
			auditStr.append(toShortClassName(visualAcuity));
				
		    auditStr.append(visualAcuity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*metrics* :");
		if (metrics != null)
		{
			auditStr.append(toShortClassName(metrics));
				
		    auditStr.append(metrics.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*arterialBloodGas* :");
		if (arterialBloodGas != null)
		{
			auditStr.append(toShortClassName(arterialBloodGas));
				
		    auditStr.append(arterialBloodGas.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ventilationChart* :");
		if (ventilationChart != null)
		{
			auditStr.append(toShortClassName(ventilationChart));
				
		    auditStr.append(ventilationChart.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pain* :");
		if (pain != null)
		{
			auditStr.append(toShortClassName(pain));
				
		    auditStr.append(pain.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isVentilationChartRecord* :");
		auditStr.append(isVentilationChartRecord);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordedSigns* :");
		if (recordedSigns != null)
		{
			java.util.Iterator it17 = recordedSigns.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it17.next();
			auditStr.append(obj.getText());
			i17++;
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveBloodPressure* :");
		if (inactiveBloodPressure != null)
		{
			java.util.Iterator it18 = inactiveBloodPressure.iterator();
			int i18=0;
			while (it18.hasNext())
			{
				if (i18 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Bloodpressure obj = (ims.core.vitals.domain.objects.Bloodpressure)it18.next();
		if (obj != null)
		{
		   if (i18 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i18++;
		}
		if (i18 > 0)
			auditStr.append("] " + i18);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivePulse* :");
		if (inactivePulse != null)
		{
			java.util.Iterator it19 = inactivePulse.iterator();
			int i19=0;
			while (it19.hasNext())
			{
				if (i19 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Pulse obj = (ims.core.vitals.domain.objects.Pulse)it19.next();
		if (obj != null)
		{
		   if (i19 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i19++;
		}
		if (i19 > 0)
			auditStr.append("] " + i19);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveRespiratory* :");
		if (inactiveRespiratory != null)
		{
			java.util.Iterator it20 = inactiveRespiratory.iterator();
			int i20=0;
			while (it20.hasNext())
			{
				if (i20 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Respiratory obj = (ims.core.vitals.domain.objects.Respiratory)it20.next();
		if (obj != null)
		{
		   if (i20 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i20++;
		}
		if (i20 > 0)
			auditStr.append("] " + i20);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveTemperature* :");
		if (inactiveTemperature != null)
		{
			java.util.Iterator it21 = inactiveTemperature.iterator();
			int i21=0;
			while (it21.hasNext())
			{
				if (i21 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Temperature obj = (ims.core.vitals.domain.objects.Temperature)it21.next();
		if (obj != null)
		{
		   if (i21 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i21++;
		}
		if (i21 > 0)
			auditStr.append("] " + i21);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveGlasgowComaScale* :");
		if (inactiveGlasgowComaScale != null)
		{
			java.util.Iterator it22 = inactiveGlasgowComaScale.iterator();
			int i22=0;
			while (it22.hasNext())
			{
				if (i22 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.GCS obj = (ims.core.vitals.domain.objects.GCS)it22.next();
		if (obj != null)
		{
		   if (i22 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i22++;
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveOxygenSaturation* :");
		if (inactiveOxygenSaturation != null)
		{
			java.util.Iterator it23 = inactiveOxygenSaturation.iterator();
			int i23=0;
			while (it23.hasNext())
			{
				if (i23 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.OxygenSaturation obj = (ims.core.vitals.domain.objects.OxygenSaturation)it23.next();
		if (obj != null)
		{
		   if (i23 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i23++;
		}
		if (i23 > 0)
			auditStr.append("] " + i23);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveBloodSugar* :");
		if (inactiveBloodSugar != null)
		{
			java.util.Iterator it24 = inactiveBloodSugar.iterator();
			int i24=0;
			while (it24.hasNext())
			{
				if (i24 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.BloodSugar obj = (ims.core.vitals.domain.objects.BloodSugar)it24.next();
		if (obj != null)
		{
		   if (i24 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i24++;
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveLungFunctionTest* :");
		if (inactiveLungFunctionTest != null)
		{
			java.util.Iterator it25 = inactiveLungFunctionTest.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.LungFunctionTests obj = (ims.core.vitals.domain.objects.LungFunctionTests)it25.next();
		if (obj != null)
		{
		   if (i25 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i25++;
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivePupils* :");
		if (inactivePupils != null)
		{
			java.util.Iterator it26 = inactivePupils.iterator();
			int i26=0;
			while (it26.hasNext())
			{
				if (i26 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Pupils obj = (ims.core.vitals.domain.objects.Pupils)it26.next();
		if (obj != null)
		{
		   if (i26 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i26++;
		}
		if (i26 > 0)
			auditStr.append("] " + i26);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveVisualAcuity* :");
		if (inactiveVisualAcuity != null)
		{
			java.util.Iterator it27 = inactiveVisualAcuity.iterator();
			int i27=0;
			while (it27.hasNext())
			{
				if (i27 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.VisualAcuity obj = (ims.core.vitals.domain.objects.VisualAcuity)it27.next();
		if (obj != null)
		{
		   if (i27 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i27++;
		}
		if (i27 > 0)
			auditStr.append("] " + i27);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveMetrics* :");
		if (inactiveMetrics != null)
		{
			java.util.Iterator it28 = inactiveMetrics.iterator();
			int i28=0;
			while (it28.hasNext())
			{
				if (i28 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Metrics obj = (ims.core.vitals.domain.objects.Metrics)it28.next();
		if (obj != null)
		{
		   if (i28 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i28++;
		}
		if (i28 > 0)
			auditStr.append("] " + i28);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveVentilationChart* :");
		if (inactiveVentilationChart != null)
		{
			java.util.Iterator it29 = inactiveVentilationChart.iterator();
			int i29=0;
			while (it29.hasNext())
			{
				if (i29 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.VentilationChart obj = (ims.core.vitals.domain.objects.VentilationChart)it29.next();
		if (obj != null)
		{
		   if (i29 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i29++;
		}
		if (i29 > 0)
			auditStr.append("] " + i29);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivePain* :");
		if (inactivePain != null)
		{
			java.util.Iterator it30 = inactivePain.iterator();
			int i30=0;
			while (it30.hasNext())
			{
				if (i30 > 0)
					auditStr.append(",");
				ims.core.vitals.domain.objects.Pain obj = (ims.core.vitals.domain.objects.Pain)it30.next();
		if (obj != null)
		{
		   if (i30 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i30++;
		}
		if (i30 > 0)
			auditStr.append("] " + i30);
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
		auditStr.append("\r\n*patientConscious* :");
		if (patientConscious != null)
			auditStr.append(patientConscious.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*urine2mlkgkhr* :");
		if (urine2mlkgkhr != null)
			auditStr.append(urine2mlkgkhr.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientCausingConcern* :");
		if (patientCausingConcern != null)
			auditStr.append(patientCausingConcern.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "VitalSigns";
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
		if (this.getVitalsTakenDateTime() != null)
		{
			sb.append("<vitalsTakenDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getVitalsTakenDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</vitalsTakenDateTime>");		
		}
		if (this.getBloodPressure() != null)
		{
			sb.append("<bloodPressure>");
			sb.append(this.getBloodPressure().toXMLString(domMap)); 	
			sb.append("</bloodPressure>");		
		}
		if (this.getPulse() != null)
		{
			sb.append("<pulse>");
			sb.append(this.getPulse().toXMLString(domMap)); 	
			sb.append("</pulse>");		
		}
		if (this.getRespiratory() != null)
		{
			sb.append("<respiratory>");
			sb.append(this.getRespiratory().toXMLString(domMap)); 	
			sb.append("</respiratory>");		
		}
		if (this.getTemperature() != null)
		{
			sb.append("<temperature>");
			sb.append(this.getTemperature().toXMLString(domMap)); 	
			sb.append("</temperature>");		
		}
		if (this.getGlasgowComaScale() != null)
		{
			sb.append("<glasgowComaScale>");
			sb.append(this.getGlasgowComaScale().toXMLString(domMap)); 	
			sb.append("</glasgowComaScale>");		
		}
		if (this.getOxygenSaturation() != null)
		{
			sb.append("<oxygenSaturation>");
			sb.append(this.getOxygenSaturation().toXMLString(domMap)); 	
			sb.append("</oxygenSaturation>");		
		}
		if (this.getBloodSugar() != null)
		{
			sb.append("<bloodSugar>");
			sb.append(this.getBloodSugar().toXMLString(domMap)); 	
			sb.append("</bloodSugar>");		
		}
		if (this.getLungFunctionTest() != null)
		{
			sb.append("<lungFunctionTest>");
			sb.append(this.getLungFunctionTest().toXMLString(domMap)); 	
			sb.append("</lungFunctionTest>");		
		}
		if (this.getPupils() != null)
		{
			sb.append("<pupils>");
			sb.append(this.getPupils().toXMLString(domMap)); 	
			sb.append("</pupils>");		
		}
		if (this.getVisualAcuity() != null)
		{
			sb.append("<visualAcuity>");
			sb.append(this.getVisualAcuity().toXMLString(domMap)); 	
			sb.append("</visualAcuity>");		
		}
		if (this.getMetrics() != null)
		{
			sb.append("<metrics>");
			sb.append(this.getMetrics().toXMLString(domMap)); 	
			sb.append("</metrics>");		
		}
		if (this.getArterialBloodGas() != null)
		{
			sb.append("<arterialBloodGas>");
			sb.append(this.getArterialBloodGas().toXMLString(domMap)); 	
			sb.append("</arterialBloodGas>");		
		}
		if (this.getVentilationChart() != null)
		{
			sb.append("<ventilationChart>");
			sb.append(this.getVentilationChart().toXMLString(domMap)); 	
			sb.append("</ventilationChart>");		
		}
		if (this.getPain() != null)
		{
			sb.append("<pain>");
			sb.append(this.getPain().toXMLString(domMap)); 	
			sb.append("</pain>");		
		}
		if (this.isIsVentilationChartRecord() != null)
		{
			sb.append("<isVentilationChartRecord>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsVentilationChartRecord().toString()));
			sb.append("</isVentilationChartRecord>");		
		}
		if (this.getRecordedSigns() != null)
		{
			if (this.getRecordedSigns().size() > 0 )
			{
			sb.append("<recordedSigns>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getRecordedSigns())); 
			sb.append("</recordedSigns>");		
			}
		}
		if (this.getInactiveBloodPressure() != null)
		{
			if (this.getInactiveBloodPressure().size() > 0 )
			{
			sb.append("<inactiveBloodPressure>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveBloodPressure(), domMap));
			sb.append("</inactiveBloodPressure>");		
			}
		}
		if (this.getInactivePulse() != null)
		{
			if (this.getInactivePulse().size() > 0 )
			{
			sb.append("<inactivePulse>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactivePulse(), domMap));
			sb.append("</inactivePulse>");		
			}
		}
		if (this.getInactiveRespiratory() != null)
		{
			if (this.getInactiveRespiratory().size() > 0 )
			{
			sb.append("<inactiveRespiratory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveRespiratory(), domMap));
			sb.append("</inactiveRespiratory>");		
			}
		}
		if (this.getInactiveTemperature() != null)
		{
			if (this.getInactiveTemperature().size() > 0 )
			{
			sb.append("<inactiveTemperature>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveTemperature(), domMap));
			sb.append("</inactiveTemperature>");		
			}
		}
		if (this.getInactiveGlasgowComaScale() != null)
		{
			if (this.getInactiveGlasgowComaScale().size() > 0 )
			{
			sb.append("<inactiveGlasgowComaScale>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveGlasgowComaScale(), domMap));
			sb.append("</inactiveGlasgowComaScale>");		
			}
		}
		if (this.getInactiveOxygenSaturation() != null)
		{
			if (this.getInactiveOxygenSaturation().size() > 0 )
			{
			sb.append("<inactiveOxygenSaturation>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveOxygenSaturation(), domMap));
			sb.append("</inactiveOxygenSaturation>");		
			}
		}
		if (this.getInactiveBloodSugar() != null)
		{
			if (this.getInactiveBloodSugar().size() > 0 )
			{
			sb.append("<inactiveBloodSugar>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveBloodSugar(), domMap));
			sb.append("</inactiveBloodSugar>");		
			}
		}
		if (this.getInactiveLungFunctionTest() != null)
		{
			if (this.getInactiveLungFunctionTest().size() > 0 )
			{
			sb.append("<inactiveLungFunctionTest>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveLungFunctionTest(), domMap));
			sb.append("</inactiveLungFunctionTest>");		
			}
		}
		if (this.getInactivePupils() != null)
		{
			if (this.getInactivePupils().size() > 0 )
			{
			sb.append("<inactivePupils>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactivePupils(), domMap));
			sb.append("</inactivePupils>");		
			}
		}
		if (this.getInactiveVisualAcuity() != null)
		{
			if (this.getInactiveVisualAcuity().size() > 0 )
			{
			sb.append("<inactiveVisualAcuity>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveVisualAcuity(), domMap));
			sb.append("</inactiveVisualAcuity>");		
			}
		}
		if (this.getInactiveMetrics() != null)
		{
			if (this.getInactiveMetrics().size() > 0 )
			{
			sb.append("<inactiveMetrics>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveMetrics(), domMap));
			sb.append("</inactiveMetrics>");		
			}
		}
		if (this.getInactiveVentilationChart() != null)
		{
			if (this.getInactiveVentilationChart().size() > 0 )
			{
			sb.append("<inactiveVentilationChart>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveVentilationChart(), domMap));
			sb.append("</inactiveVentilationChart>");		
			}
		}
		if (this.getInactivePain() != null)
		{
			if (this.getInactivePain().size() > 0 )
			{
			sb.append("<inactivePain>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactivePain(), domMap));
			sb.append("</inactivePain>");		
			}
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
		if (this.getPatientConscious() != null)
		{
			sb.append("<patientConscious>");
			sb.append(this.getPatientConscious().toXMLString()); 
			sb.append("</patientConscious>");		
		}
		if (this.getUrine2mlkgkhr() != null)
		{
			sb.append("<urine2mlkgkhr>");
			sb.append(this.getUrine2mlkgkhr().toXMLString()); 
			sb.append("</urine2mlkgkhr>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getPatientCausingConcern() != null)
		{
			sb.append("<patientCausingConcern>");
			sb.append(this.getPatientCausingConcern().toXMLString()); 
			sb.append("</patientCausingConcern>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			VitalSigns domainObject = getVitalSignsfromXML(itemEl, factory, domMap);

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
			VitalSigns domainObject = getVitalSignsfromXML(itemEl, factory, domMap);

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
		
	public static VitalSigns getVitalSignsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVitalSignsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VitalSigns getVitalSignsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VitalSigns.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VitalSigns.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VitalSigns class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VitalSigns)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VitalSigns.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VitalSigns ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VitalSigns)factory.getImportedDomainObject(VitalSigns.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VitalSigns();
		}
		String keyClassName = "VitalSigns";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VitalSigns)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VitalSigns obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("vitalsTakenDateTime");
		if(fldEl != null)
		{	
    		obj.setVitalsTakenDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bloodPressure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBloodPressure(ims.core.vitals.domain.objects.Bloodpressure.getBloodpressurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pulse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPulse(ims.core.vitals.domain.objects.Pulse.getPulsefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("respiratory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRespiratory(ims.core.vitals.domain.objects.Respiratory.getRespiratoryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("temperature");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTemperature(ims.core.vitals.domain.objects.Temperature.getTemperaturefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("glasgowComaScale");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGlasgowComaScale(ims.core.vitals.domain.objects.GCS.getGCSfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("oxygenSaturation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOxygenSaturation(ims.core.vitals.domain.objects.OxygenSaturation.getOxygenSaturationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bloodSugar");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBloodSugar(ims.core.vitals.domain.objects.BloodSugar.getBloodSugarfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lungFunctionTest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLungFunctionTest(ims.core.vitals.domain.objects.LungFunctionTests.getLungFunctionTestsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pupils");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPupils(ims.core.vitals.domain.objects.Pupils.getPupilsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("visualAcuity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVisualAcuity(ims.core.vitals.domain.objects.VisualAcuity.getVisualAcuityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("metrics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMetrics(ims.core.vitals.domain.objects.Metrics.getMetricsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("arterialBloodGas");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setArterialBloodGas(ims.core.vitals.domain.objects.ArterialBloodGas.getArterialBloodGasfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ventilationChart");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVentilationChart(ims.core.vitals.domain.objects.VentilationChart.getVentilationChartfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pain");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPain(ims.core.vitals.domain.objects.Pain.getPainfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isVentilationChartRecord");
		if(fldEl != null)
		{	
    		obj.setIsVentilationChartRecord(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordedSigns");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRecordedSigns(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getRecordedSigns())); 
		}
		fldEl = el.element("inactiveBloodPressure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveBloodPressure(ims.core.vitals.domain.objects.Bloodpressure.fromSetXMLString(fldEl, factory, obj.getInactiveBloodPressure(), domMap));
		}
		fldEl = el.element("inactivePulse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactivePulse(ims.core.vitals.domain.objects.Pulse.fromSetXMLString(fldEl, factory, obj.getInactivePulse(), domMap));
		}
		fldEl = el.element("inactiveRespiratory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveRespiratory(ims.core.vitals.domain.objects.Respiratory.fromSetXMLString(fldEl, factory, obj.getInactiveRespiratory(), domMap));
		}
		fldEl = el.element("inactiveTemperature");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveTemperature(ims.core.vitals.domain.objects.Temperature.fromSetXMLString(fldEl, factory, obj.getInactiveTemperature(), domMap));
		}
		fldEl = el.element("inactiveGlasgowComaScale");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveGlasgowComaScale(ims.core.vitals.domain.objects.GCS.fromSetXMLString(fldEl, factory, obj.getInactiveGlasgowComaScale(), domMap));
		}
		fldEl = el.element("inactiveOxygenSaturation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveOxygenSaturation(ims.core.vitals.domain.objects.OxygenSaturation.fromSetXMLString(fldEl, factory, obj.getInactiveOxygenSaturation(), domMap));
		}
		fldEl = el.element("inactiveBloodSugar");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveBloodSugar(ims.core.vitals.domain.objects.BloodSugar.fromSetXMLString(fldEl, factory, obj.getInactiveBloodSugar(), domMap));
		}
		fldEl = el.element("inactiveLungFunctionTest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveLungFunctionTest(ims.core.vitals.domain.objects.LungFunctionTests.fromSetXMLString(fldEl, factory, obj.getInactiveLungFunctionTest(), domMap));
		}
		fldEl = el.element("inactivePupils");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactivePupils(ims.core.vitals.domain.objects.Pupils.fromSetXMLString(fldEl, factory, obj.getInactivePupils(), domMap));
		}
		fldEl = el.element("inactiveVisualAcuity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveVisualAcuity(ims.core.vitals.domain.objects.VisualAcuity.fromSetXMLString(fldEl, factory, obj.getInactiveVisualAcuity(), domMap));
		}
		fldEl = el.element("inactiveMetrics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveMetrics(ims.core.vitals.domain.objects.Metrics.fromSetXMLString(fldEl, factory, obj.getInactiveMetrics(), domMap));
		}
		fldEl = el.element("inactiveVentilationChart");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveVentilationChart(ims.core.vitals.domain.objects.VentilationChart.fromSetXMLString(fldEl, factory, obj.getInactiveVentilationChart(), domMap));
		}
		fldEl = el.element("inactivePain");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactivePain(ims.core.vitals.domain.objects.Pain.fromSetXMLString(fldEl, factory, obj.getInactivePain(), domMap));
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
		fldEl = el.element("patientConscious");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientConscious(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("urine2mlkgkhr");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrine2mlkgkhr(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientCausingConcern");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientCausingConcern(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "recordedSigns"
		, "inactiveBloodPressure"
		, "inactivePulse"
		, "inactiveRespiratory"
		, "inactiveTemperature"
		, "inactiveGlasgowComaScale"
		, "inactiveOxygenSaturation"
		, "inactiveBloodSugar"
		, "inactiveLungFunctionTest"
		, "inactivePupils"
		, "inactiveVisualAcuity"
		, "inactiveMetrics"
		, "inactiveVentilationChart"
		, "inactivePain"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String VitalsTakenDateTime = "vitalsTakenDateTime";
		public static final String BloodPressure = "bloodPressure";
		public static final String Pulse = "pulse";
		public static final String Respiratory = "respiratory";
		public static final String Temperature = "temperature";
		public static final String GlasgowComaScale = "glasgowComaScale";
		public static final String OxygenSaturation = "oxygenSaturation";
		public static final String BloodSugar = "bloodSugar";
		public static final String LungFunctionTest = "lungFunctionTest";
		public static final String Pupils = "pupils";
		public static final String VisualAcuity = "visualAcuity";
		public static final String Metrics = "metrics";
		public static final String ArterialBloodGas = "arterialBloodGas";
		public static final String VentilationChart = "ventilationChart";
		public static final String Pain = "pain";
		public static final String IsVentilationChartRecord = "isVentilationChartRecord";
		public static final String RecordedSigns = "recordedSigns";
		public static final String InactiveBloodPressure = "inactiveBloodPressure";
		public static final String InactivePulse = "inactivePulse";
		public static final String InactiveRespiratory = "inactiveRespiratory";
		public static final String InactiveTemperature = "inactiveTemperature";
		public static final String InactiveGlasgowComaScale = "inactiveGlasgowComaScale";
		public static final String InactiveOxygenSaturation = "inactiveOxygenSaturation";
		public static final String InactiveBloodSugar = "inactiveBloodSugar";
		public static final String InactiveLungFunctionTest = "inactiveLungFunctionTest";
		public static final String InactivePupils = "inactivePupils";
		public static final String InactiveVisualAcuity = "inactiveVisualAcuity";
		public static final String InactiveMetrics = "inactiveMetrics";
		public static final String InactiveVentilationChart = "inactiveVentilationChart";
		public static final String InactivePain = "inactivePain";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String PatientConscious = "patientConscious";
		public static final String Urine2mlkgkhr = "urine2mlkgkhr";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String PatientCausingConcern = "patientCausingConcern";
		public static final String RecordingInformation = "recordingInformation";
	}
}

