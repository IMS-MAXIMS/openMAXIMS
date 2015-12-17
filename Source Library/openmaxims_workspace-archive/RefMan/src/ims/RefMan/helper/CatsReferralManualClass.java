package ims.RefMan.helper;

import java.util.Date;

public class CatsReferralManualClass 
{
	private Integer CatsReferralId;
	private String patient_title;
	private String patient_surname;
	private String patient_forename;
	private String any_nhsnum;
	private String verified_nhsnum;
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

	public CatsReferralManualClass(Integer CatsReferralId,
								String patient_title,
								String patient_surname,
								String patient_forename,
								String any_nhsnum,
								String verified_nhsnum,
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
								Boolean HasReferralLetter)
	{
		this.CatsReferralId = CatsReferralId;
		this.patient_title = patient_title;
		this.patient_surname = patient_surname;
		this.patient_forename = patient_forename;
		this.any_nhsnum = any_nhsnum;
		this.verified_nhsnum = verified_nhsnum;
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
	}

	public Integer getCatsReferralId()
	{
		return this.CatsReferralId;
	}
	public String getPatientName()
	{
		String temp;
			
		temp = this.patient_title != null ? this.patient_title + " ": "";
		temp += this.patient_forename != null ? this.patient_forename : "";
		temp += " ";
		temp += this.patient_surname != null ? this.patient_surname : "";
		return temp;
	}
	
	public String getPatientnhsnum()
	{
		return this.verified_nhsnum;
	}
	public String getAnynhsnum()
	{
		return this.any_nhsnum;
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

}
