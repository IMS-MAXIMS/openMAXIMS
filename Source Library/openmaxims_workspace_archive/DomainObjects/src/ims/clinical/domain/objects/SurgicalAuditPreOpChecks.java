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


public class SurgicalAuditPreOpChecks extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100101;
	private static final long serialVersionUID = 1072100101L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Planned Procedures
	  * Collection of ims.core.clinical.domain.objects.PatientProcedure.
	  */
	private java.util.List plannedProcedures;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Medic consultant;
	/** Time Patient sent for */
	private java.util.Date sentForTime;
	/** Arrival Time in Holding bay */
	private java.util.Date arrivalTime;
	/** Leave Holding Bay time */
	private java.util.Date leaveHoldingTime;
	/** Accompanying Nurse */
	private ims.core.resource.people.domain.objects.Nurse accompanyingNurse;
	/** Accompanying Nurse is Locum Nurse? */
	private Boolean accompanyingLocumBool;
	/** Accompanying Nurse Locum name */
	private String accompanyingLocumNurse;
	/** Transferred from  */
	private ims.core.resource.place.domain.objects.Location transferredFrom;
	/** ASA Grade */
	private ims.domain.lookups.LookupInstance aSAGrade;
	/** Consent received  */
	private ims.domain.lookups.LookupInstance consentReceived;
	/** Consent Auth by  */
	private String consentAuthBy;
	/** BMI */
	private ims.core.vitals.domain.objects.VitalSigns bMI;
	/** Site Marked */
	private ims.domain.lookups.LookupInstance siteMarked;
	/** Action Taken */
	private ims.domain.lookups.LookupInstance actionTaken;
	/** Confirm Patient Details */
	private ims.domain.lookups.LookupInstance confirmPatientDetails;
	/** Pre-Op Check done */
	private ims.domain.lookups.LookupInstance preOpCheckDone;
	/** Theatre Nurse */
	private ims.core.resource.people.domain.objects.Nurse theatreNurse;
	/** Theatre Nurse is Locum Nurse? */
	private Boolean theatreNurseLocumBool;
	/** Theatre Nurse Locum name */
	private String theatreNurseLocumNurse;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalAuditPreOpChecks (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalAuditPreOpChecks ()
    {
    	super();
    }
    public SurgicalAuditPreOpChecks (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalAuditPreOpChecks.class;
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

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.List getPlannedProcedures() {
		if ( null == plannedProcedures ) {
			plannedProcedures = new java.util.ArrayList();
		}
		return plannedProcedures;
	}
	public void setPlannedProcedures(java.util.List paramValue) {
		this.plannedProcedures = paramValue;
	}

	public ims.core.resource.people.domain.objects.Medic getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Medic consultant) {
		this.consultant = consultant;
	}

	public java.util.Date getSentForTime() {
		return sentForTime;
	}
	public void setSentForTime(java.util.Date sentForTime) {
		this.sentForTime = sentForTime;
	}

	public java.util.Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(java.util.Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public java.util.Date getLeaveHoldingTime() {
		return leaveHoldingTime;
	}
	public void setLeaveHoldingTime(java.util.Date leaveHoldingTime) {
		this.leaveHoldingTime = leaveHoldingTime;
	}

	public ims.core.resource.people.domain.objects.Nurse getAccompanyingNurse() {
		return accompanyingNurse;
	}
	public void setAccompanyingNurse(ims.core.resource.people.domain.objects.Nurse accompanyingNurse) {
		this.accompanyingNurse = accompanyingNurse;
	}

	public Boolean isAccompanyingLocumBool() {
		return accompanyingLocumBool;
	}
	public void setAccompanyingLocumBool(Boolean accompanyingLocumBool) {
		this.accompanyingLocumBool = accompanyingLocumBool;
	}

	public String getAccompanyingLocumNurse() {
		return accompanyingLocumNurse;
	}
	public void setAccompanyingLocumNurse(String accompanyingLocumNurse) {
		if ( null != accompanyingLocumNurse && accompanyingLocumNurse.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for accompanyingLocumNurse. Tried to set value: "+
				accompanyingLocumNurse);
		}
		this.accompanyingLocumNurse = accompanyingLocumNurse;
	}

	public ims.core.resource.place.domain.objects.Location getTransferredFrom() {
		return transferredFrom;
	}
	public void setTransferredFrom(ims.core.resource.place.domain.objects.Location transferredFrom) {
		this.transferredFrom = transferredFrom;
	}

	public ims.domain.lookups.LookupInstance getASAGrade() {
		return aSAGrade;
	}
	public void setASAGrade(ims.domain.lookups.LookupInstance aSAGrade) {
		this.aSAGrade = aSAGrade;
	}

	public ims.domain.lookups.LookupInstance getConsentReceived() {
		return consentReceived;
	}
	public void setConsentReceived(ims.domain.lookups.LookupInstance consentReceived) {
		this.consentReceived = consentReceived;
	}

	public String getConsentAuthBy() {
		return consentAuthBy;
	}
	public void setConsentAuthBy(String consentAuthBy) {
		if ( null != consentAuthBy && consentAuthBy.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for consentAuthBy. Tried to set value: "+
				consentAuthBy);
		}
		this.consentAuthBy = consentAuthBy;
	}

	public ims.core.vitals.domain.objects.VitalSigns getBMI() {
		return bMI;
	}
	public void setBMI(ims.core.vitals.domain.objects.VitalSigns bMI) {
		this.bMI = bMI;
	}

	public ims.domain.lookups.LookupInstance getSiteMarked() {
		return siteMarked;
	}
	public void setSiteMarked(ims.domain.lookups.LookupInstance siteMarked) {
		this.siteMarked = siteMarked;
	}

	public ims.domain.lookups.LookupInstance getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(ims.domain.lookups.LookupInstance actionTaken) {
		this.actionTaken = actionTaken;
	}

	public ims.domain.lookups.LookupInstance getConfirmPatientDetails() {
		return confirmPatientDetails;
	}
	public void setConfirmPatientDetails(ims.domain.lookups.LookupInstance confirmPatientDetails) {
		this.confirmPatientDetails = confirmPatientDetails;
	}

	public ims.domain.lookups.LookupInstance getPreOpCheckDone() {
		return preOpCheckDone;
	}
	public void setPreOpCheckDone(ims.domain.lookups.LookupInstance preOpCheckDone) {
		this.preOpCheckDone = preOpCheckDone;
	}

	public ims.core.resource.people.domain.objects.Nurse getTheatreNurse() {
		return theatreNurse;
	}
	public void setTheatreNurse(ims.core.resource.people.domain.objects.Nurse theatreNurse) {
		this.theatreNurse = theatreNurse;
	}

	public Boolean isTheatreNurseLocumBool() {
		return theatreNurseLocumBool;
	}
	public void setTheatreNurseLocumBool(Boolean theatreNurseLocumBool) {
		this.theatreNurseLocumBool = theatreNurseLocumBool;
	}

	public String getTheatreNurseLocumNurse() {
		return theatreNurseLocumNurse;
	}
	public void setTheatreNurseLocumNurse(String theatreNurseLocumNurse) {
		if ( null != theatreNurseLocumNurse && theatreNurseLocumNurse.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for theatreNurseLocumNurse. Tried to set value: "+
				theatreNurseLocumNurse);
		}
		this.theatreNurseLocumNurse = theatreNurseLocumNurse;
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedProcedures* :");
		if (plannedProcedures != null)
		{
		int i4=0;
		for (i4=0; i4<plannedProcedures.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientProcedure obj = (ims.core.clinical.domain.objects.PatientProcedure)plannedProcedures.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sentForTime* :");
		auditStr.append(sentForTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*arrivalTime* :");
		auditStr.append(arrivalTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*leaveHoldingTime* :");
		auditStr.append(leaveHoldingTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*accompanyingNurse* :");
		if (accompanyingNurse != null)
		{
			auditStr.append(toShortClassName(accompanyingNurse));
				
		    auditStr.append(accompanyingNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*accompanyingLocumBool* :");
		auditStr.append(accompanyingLocumBool);
	    auditStr.append("; ");
		auditStr.append("\r\n*accompanyingLocumNurse* :");
		auditStr.append(accompanyingLocumNurse);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferredFrom* :");
		if (transferredFrom != null)
		{
			auditStr.append(toShortClassName(transferredFrom));
				
		    auditStr.append(transferredFrom.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*aSAGrade* :");
		if (aSAGrade != null)
			auditStr.append(aSAGrade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consentReceived* :");
		if (consentReceived != null)
			auditStr.append(consentReceived.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consentAuthBy* :");
		auditStr.append(consentAuthBy);
	    auditStr.append("; ");
		auditStr.append("\r\n*bMI* :");
		if (bMI != null)
		{
			auditStr.append(toShortClassName(bMI));
				
		    auditStr.append(bMI.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*siteMarked* :");
		if (siteMarked != null)
			auditStr.append(siteMarked.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*actionTaken* :");
		if (actionTaken != null)
			auditStr.append(actionTaken.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmPatientDetails* :");
		if (confirmPatientDetails != null)
			auditStr.append(confirmPatientDetails.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpCheckDone* :");
		if (preOpCheckDone != null)
			auditStr.append(preOpCheckDone.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreNurse* :");
		if (theatreNurse != null)
		{
			auditStr.append(toShortClassName(theatreNurse));
				
		    auditStr.append(theatreNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreNurseLocumBool* :");
		auditStr.append(theatreNurseLocumBool);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreNurseLocumNurse* :");
		auditStr.append(theatreNurseLocumNurse);
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
		
		String keyClassName = "SurgicalAuditPreOpChecks";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getPlannedProcedures() != null)
		{
			if (this.getPlannedProcedures().size() > 0 )
			{
			sb.append("<plannedProcedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPlannedProcedures(), domMap));
			sb.append("</plannedProcedures>");		
			}
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getSentForTime() != null)
		{
			sb.append("<sentForTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSentForTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</sentForTime>");		
		}
		if (this.getArrivalTime() != null)
		{
			sb.append("<arrivalTime>");
			sb.append(new ims.framework.utils.DateTime(this.getArrivalTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</arrivalTime>");		
		}
		if (this.getLeaveHoldingTime() != null)
		{
			sb.append("<leaveHoldingTime>");
			sb.append(new ims.framework.utils.DateTime(this.getLeaveHoldingTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</leaveHoldingTime>");		
		}
		if (this.getAccompanyingNurse() != null)
		{
			sb.append("<accompanyingNurse>");
			sb.append(this.getAccompanyingNurse().toXMLString(domMap)); 	
			sb.append("</accompanyingNurse>");		
		}
		if (this.isAccompanyingLocumBool() != null)
		{
			sb.append("<accompanyingLocumBool>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAccompanyingLocumBool().toString()));
			sb.append("</accompanyingLocumBool>");		
		}
		if (this.getAccompanyingLocumNurse() != null)
		{
			sb.append("<accompanyingLocumNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAccompanyingLocumNurse().toString()));
			sb.append("</accompanyingLocumNurse>");		
		}
		if (this.getTransferredFrom() != null)
		{
			sb.append("<transferredFrom>");
			sb.append(this.getTransferredFrom().toXMLString(domMap)); 	
			sb.append("</transferredFrom>");		
		}
		if (this.getASAGrade() != null)
		{
			sb.append("<aSAGrade>");
			sb.append(this.getASAGrade().toXMLString()); 
			sb.append("</aSAGrade>");		
		}
		if (this.getConsentReceived() != null)
		{
			sb.append("<consentReceived>");
			sb.append(this.getConsentReceived().toXMLString()); 
			sb.append("</consentReceived>");		
		}
		if (this.getConsentAuthBy() != null)
		{
			sb.append("<consentAuthBy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConsentAuthBy().toString()));
			sb.append("</consentAuthBy>");		
		}
		if (this.getBMI() != null)
		{
			sb.append("<bMI>");
			sb.append(this.getBMI().toXMLString(domMap)); 	
			sb.append("</bMI>");		
		}
		if (this.getSiteMarked() != null)
		{
			sb.append("<siteMarked>");
			sb.append(this.getSiteMarked().toXMLString()); 
			sb.append("</siteMarked>");		
		}
		if (this.getActionTaken() != null)
		{
			sb.append("<actionTaken>");
			sb.append(this.getActionTaken().toXMLString()); 
			sb.append("</actionTaken>");		
		}
		if (this.getConfirmPatientDetails() != null)
		{
			sb.append("<confirmPatientDetails>");
			sb.append(this.getConfirmPatientDetails().toXMLString()); 
			sb.append("</confirmPatientDetails>");		
		}
		if (this.getPreOpCheckDone() != null)
		{
			sb.append("<preOpCheckDone>");
			sb.append(this.getPreOpCheckDone().toXMLString()); 
			sb.append("</preOpCheckDone>");		
		}
		if (this.getTheatreNurse() != null)
		{
			sb.append("<theatreNurse>");
			sb.append(this.getTheatreNurse().toXMLString(domMap)); 	
			sb.append("</theatreNurse>");		
		}
		if (this.isTheatreNurseLocumBool() != null)
		{
			sb.append("<theatreNurseLocumBool>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTheatreNurseLocumBool().toString()));
			sb.append("</theatreNurseLocumBool>");		
		}
		if (this.getTheatreNurseLocumNurse() != null)
		{
			sb.append("<theatreNurseLocumNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTheatreNurseLocumNurse().toString()));
			sb.append("</theatreNurseLocumNurse>");		
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
			SurgicalAuditPreOpChecks domainObject = getSurgicalAuditPreOpChecksfromXML(itemEl, factory, domMap);

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
			SurgicalAuditPreOpChecks domainObject = getSurgicalAuditPreOpChecksfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalAuditPreOpChecks getSurgicalAuditPreOpChecksfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalAuditPreOpChecksfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalAuditPreOpChecks getSurgicalAuditPreOpChecksfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalAuditPreOpChecks.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalAuditPreOpChecks.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalAuditPreOpChecks class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalAuditPreOpChecks)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalAuditPreOpChecks.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalAuditPreOpChecks ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalAuditPreOpChecks)factory.getImportedDomainObject(SurgicalAuditPreOpChecks.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalAuditPreOpChecks();
		}
		String keyClassName = "SurgicalAuditPreOpChecks";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalAuditPreOpChecks)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalAuditPreOpChecks obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("plannedProcedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPlannedProcedures(ims.core.clinical.domain.objects.PatientProcedure.fromListXMLString(fldEl, factory, obj.getPlannedProcedures(), domMap));
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sentForTime");
		if(fldEl != null)
		{	
    		obj.setSentForTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("arrivalTime");
		if(fldEl != null)
		{	
    		obj.setArrivalTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("leaveHoldingTime");
		if(fldEl != null)
		{	
    		obj.setLeaveHoldingTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("accompanyingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAccompanyingNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("accompanyingLocumBool");
		if(fldEl != null)
		{	
    		obj.setAccompanyingLocumBool(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("accompanyingLocumNurse");
		if(fldEl != null)
		{	
    		obj.setAccompanyingLocumNurse(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transferredFrom");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferredFrom(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("aSAGrade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setASAGrade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consentReceived");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsentReceived(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consentAuthBy");
		if(fldEl != null)
		{	
    		obj.setConsentAuthBy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bMI");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBMI(ims.core.vitals.domain.objects.VitalSigns.getVitalSignsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("siteMarked");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSiteMarked(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("actionTaken");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActionTaken(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("confirmPatientDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConfirmPatientDetails(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preOpCheckDone");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreOpCheckDone(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("theatreNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("theatreNurseLocumBool");
		if(fldEl != null)
		{	
    		obj.setTheatreNurseLocumBool(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreNurseLocumNurse");
		if(fldEl != null)
		{	
    		obj.setTheatreNurseLocumNurse(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "plannedProcedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String PlannedProcedures = "plannedProcedures";
		public static final String Consultant = "consultant";
		public static final String SentForTime = "sentForTime";
		public static final String ArrivalTime = "arrivalTime";
		public static final String LeaveHoldingTime = "leaveHoldingTime";
		public static final String AccompanyingNurse = "accompanyingNurse";
		public static final String AccompanyingLocumBool = "accompanyingLocumBool";
		public static final String AccompanyingLocumNurse = "accompanyingLocumNurse";
		public static final String TransferredFrom = "transferredFrom";
		public static final String ASAGrade = "aSAGrade";
		public static final String ConsentReceived = "consentReceived";
		public static final String ConsentAuthBy = "consentAuthBy";
		public static final String BMI = "bMI";
		public static final String SiteMarked = "siteMarked";
		public static final String ActionTaken = "actionTaken";
		public static final String ConfirmPatientDetails = "confirmPatientDetails";
		public static final String PreOpCheckDone = "preOpCheckDone";
		public static final String TheatreNurse = "theatreNurse";
		public static final String TheatreNurseLocumBool = "theatreNurseLocumBool";
		public static final String TheatreNurseLocumNurse = "theatreNurseLocumNurse";
	}
}

