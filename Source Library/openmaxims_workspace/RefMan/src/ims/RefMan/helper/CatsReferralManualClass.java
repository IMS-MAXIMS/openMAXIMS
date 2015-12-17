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
package ims.RefMan.helper;

import java.util.Date;

public class CatsReferralManualClass 
{
	private Integer CatsReferralId;
	private String patient_title;
	private String patient_surname;
	private String patient_forename;
	//private String any_nhsnum;
	//private String verified_nhsnum;
	private String display_PatID;//WDEV-19621
	private Date patient_dod;
	private Date ReferralDate;
	private Integer LinkedICPID;
	private Integer LinkedELEID;
	private Boolean isCAB;
	private String ReferralLocationName;
	private String ServiceName;
	private Boolean isFlaggedForReview;
	private Date End18WW;
	private Boolean isCurrentlyAllocated;
	private Boolean HasInvestigations;
	private Integer AdditionalInvStatusID;
	private Integer CatsCurrentStatusID;
	private String CatsCurrentStatusText;
	private Boolean HasApointments;
	private Integer ConsAppointmentStatusID;
	private Date ConsAppointmentDate;
	private String ConsAppointmentStartTime;
	private Integer AssociatedPatientId;
	private Date DateRecieved;
	private Boolean HasDocuments;
	private Boolean HasReferralLetter;
	private Date EndDateKPI;		//wdev-19673
	private Integer UrgencyID; //WDEV-20275
	private String UrgencyText; //WDEV-20275
	private Integer TriageOutcomeStatusId;
	private String TriageOutcomeStatusText;
	private Integer HasTriagePendingDiagnosticResult;  //WDEV-20880
	private Boolean RTTClockImpact;
	private String UBRN;//wdev-22497

	public CatsReferralManualClass(Integer CatsReferralId,
								String patient_title,
								String patient_surname,
								String patient_forename,
								//String any_nhsnum,
								//String verified_nhsnum,
								String display_PatID, //WDEV-19621
								Date patient_dod,
								Integer LinkedICPID,
								Integer LinkedELEID,
								Date ReferralDate,
								Boolean isCAB,
								String ReferralLocationName,
								String ServiceName,
								Boolean isFlaggedForReview,
								Date End18WW,
								Boolean isCurrentlyAllocated,
								Boolean HasInvestigations,
								Integer AdditionalInvStatusID,
								Integer CatsCurrentStatusId,
								String CatsCurrentStatusText,
								Boolean HasApointments,
								Integer ConsAppointmentStatusID,
								Date ConsAppointmentDate,
								String ConsAppointmentStartTime,
								Integer AssociatedPatientId,
								Date DateRecieved,
								Boolean HasDocuments,
								Boolean HasReferralLetter,
								Date EndDateKPI,
								Integer UrgencyID,//WDEV-20275
								String UrgencyText,//WDEV-20275
								Integer TriageOutcomeStatusId,
								String TriageOutcomeStatusText,
								Integer HasTriagePendingDiagnosticResult, //WDEV-20880
								Boolean RTTClockImpact,
								String UBRN)
	{
		this.CatsReferralId = CatsReferralId;
		this.patient_title = patient_title;
		this.patient_surname = patient_surname;
		this.patient_forename = patient_forename;
		//this.any_nhsnum = any_nhsnum;
		//this.verified_nhsnum = verified_nhsnum;
		this.display_PatID=display_PatID; //WDEV-19621
		this.patient_dod = patient_dod;
		this.LinkedICPID = LinkedICPID;
		this.LinkedELEID = LinkedELEID;
		this.ReferralDate = ReferralDate;
		this.isCAB = isCAB;
		this.ReferralLocationName = ReferralLocationName;
		this.ServiceName = ServiceName;
		this.isFlaggedForReview = isFlaggedForReview;
		this.End18WW = End18WW;
		this.isCurrentlyAllocated = isCurrentlyAllocated;
		this.HasInvestigations = HasInvestigations;
		this.AdditionalInvStatusID = AdditionalInvStatusID;
		this.CatsCurrentStatusID = CatsCurrentStatusId;
		this.CatsCurrentStatusText = CatsCurrentStatusText;
		this.HasApointments = HasApointments;
		this.ConsAppointmentStatusID = ConsAppointmentStatusID;
		this.ConsAppointmentDate = ConsAppointmentDate;
		this.ConsAppointmentStartTime = ConsAppointmentStartTime;
		this.AssociatedPatientId = AssociatedPatientId;
		this.DateRecieved = DateRecieved;
		this.HasDocuments = HasDocuments;
		this.HasReferralLetter = HasReferralLetter;
		this.EndDateKPI = EndDateKPI;	//wdev-19673
		this.UrgencyID = UrgencyID; //WDEV-20275
		this.UrgencyText = UrgencyText; //WDEV-20275
		this.TriageOutcomeStatusId = TriageOutcomeStatusId;
		this.TriageOutcomeStatusText = TriageOutcomeStatusText;
		this.HasTriagePendingDiagnosticResult=HasTriagePendingDiagnosticResult; //WDEV-20880
		this.RTTClockImpact = RTTClockImpact;
		this.UBRN= UBRN;
	}

	public Integer getCatsReferralId()
	{
		return this.CatsReferralId;
	}
	public String getPatientName()
	{
		String temp;
				
		temp = this.patient_surname != null ? this.patient_surname + " ": ""; //WDEV-20055
		temp += this.patient_forename != null ? this.patient_forename + " " : ""; //WDEV-20055
		temp += this.patient_title != null ? this.patient_title: "";
		
		return temp;
	}
	//WDEV-19665 
	public String getPatientSurname()
	{
		return this.patient_surname;
	}
	public String getPatientForename()
	{
		return this.patient_forename;
	}
	public String getPatientTitle()
	{
		return this.patient_title;
	}	
	
	/*public String getPatientnhsnum()
	{
		return this.verified_nhsnum;
	}
	public String getAnynhsnum()
	{
		return this.any_nhsnum;
	}*/

	//WDEV-19621
	public String getDysplayPatID()
	{
		return this.display_PatID;
	}
	
	public Date getPatientDOD()
	{
		return this.patient_dod;
	}

	public Integer getLinkedICPID()
	{
		return this.LinkedICPID;
	}

	public Boolean getisCAB()
	{
		return this.isCAB;
	}

	public String getReferralLocationName()
	{
		return this.ReferralLocationName;
	}

	public String getServiceName()
	{
		return this.ServiceName;
	}

	public Boolean getisFlaggedForReview()
	{
		return this.isFlaggedForReview;
	}

	public Date getEnd18WW()
	{
		return this.End18WW;
	}

	public Boolean getisCurrentlyAllocated()
	{
		return this.isCurrentlyAllocated;
	}

	public Boolean getHasInvestigations()
	{
		return this.HasInvestigations;
	}

	public Integer getAdditionalInvStatusID()
	{
		return this.AdditionalInvStatusID;
	}

	public Integer getCatsCurrentStatusId()
	{
		return this.CatsCurrentStatusID;
	}

	public String getCatsCurrentStatusText()
	{
		return this.CatsCurrentStatusText;
	}

	public Boolean getHasApointments()
	{
		return this.HasApointments;
	}

	public Integer getConsAppointmentStatusID()
	{
		return this.ConsAppointmentStatusID;
	}

	public Date getConsAppointmentDate()
	{
		return this.ConsAppointmentDate;
	}

	public ims.framework.utils.Time getConsAppointmentStartTime()
	{
		String ApptStartTime = this.ConsAppointmentStartTime;
		if ( null != ApptStartTime ) 
		{
			return new ims.framework.utils.Time(ApptStartTime);
		}
		return null;
	}

	public Integer getAssociatedPatientId()
	{
		return this.AssociatedPatientId;
	}

	public Date getDateRecieved()
	{
		return this.DateRecieved;
	}

	//WDEV-20752
	public Date getReferralDate()
	{
		return this.ReferralDate;
	}
	
	public Boolean getHasDocuments()
	{
		return this.HasDocuments;
	}

	public Boolean getHasReferralLetter()
	{
		return this.HasReferralLetter;
	}

	public Integer getLinkedELEID()
	{
		return this.LinkedELEID;
	}
	//wdev-19673
	public Date getEndDateKPI()
	{
		return this.EndDateKPI;
	}
	
	// start WDEV-20275
	public Integer getReferralUrgencyID()
	{
		return this.UrgencyID;
	}
	
	public String getReferralUrgencyText()
	{
		return this.UrgencyText;
	}
	// end WDEV-20275
	
	public Integer getTriageOutcomeStatusId()
	{
		return this.TriageOutcomeStatusId;
	}
	
	public String getTriageOutcomeStatusString()
	{
		return this.TriageOutcomeStatusText;
	}
	
	public Integer getHasTriagePendingDiagnosticResult() //WDEV-20880
	{
		return this.HasTriagePendingDiagnosticResult;
	}
	
	public Boolean getRTTClockImpact()
	{
		return this.RTTClockImpact;
	}
	public String getUBRN()
	{
		return this.UBRN;
	}
}
