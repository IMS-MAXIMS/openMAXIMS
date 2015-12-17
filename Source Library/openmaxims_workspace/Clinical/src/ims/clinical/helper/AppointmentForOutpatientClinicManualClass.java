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
package ims.clinical.helper;

import ims.RefMan.vo.CatsReferralManualAssembledForAppointmentOutcomeListVo;
import ims.RefMan.vo.PatientElectiveListRefVo;
import ims.core.vo.PatientManuallyAssembledVo;
import ims.core.vo.lookups.YesNo;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.scheduling.vo.AppointmentForOutpatientClinicListManualCustomClassVo;

import java.util.Date;

public class AppointmentForOutpatientClinicManualClass
{
	private static final Integer YES	= YesNo.YES.getID();
	private static final Integer NO		= YesNo.NO.getID();
	
	
	//----------------------------------------------------------------------------------------------------------------------------------
	// Class Fields
	//----------------------------------------------------------------------------------------------------------------------------------

	private Integer		appointmentID;
	private Integer		appointmentVersion;
	private Date		appointmentDate;
	private String		appointmentStartTime;
	
	private Integer		appointmentStatus_ID;
	private String		appointmentStatus_Text;
	
	private Integer		appointmentActivityImage;
	private String		appointmentActivityName;
	
	private String		appointmentSessionName;

	private Boolean		isCABBooking;
	
	private Integer		patientID;
	private Integer		patientVersion;
	private String		patientSurname;
	private String		patientForename;
	private String		patientSex;
	private String		patientDisplayID;
	private Integer		patientDob;
	private Long		numberOfCommunicationChannels;
	
	private Integer		appointmentOutcomeID;
	private String		appointmentOutcomeText;
	private String		appointmentOutcomeComments;
	private Boolean		hasElectiveList;
	private Boolean		wasPrinted;
	
	private String		bookingLetterRecordingUserTitle;
	private String		bookingLetterRecordingUserSurname;
	private String		bookingLetterRecordingUserForename;
	private Date		bookingLetterRecordingDateTime;
	
	private Long		numberOfLinkedAppointments;
	
	private String		appointmentComments;
	private String		bookingComments;
	
	private Integer		referralID;
	private Integer		referralVersion;
	private String		referralRTTStatusDescription;
	private Date		referral18WWDate;
	private Boolean		interpreterRequired;
	private Integer		languageID;
	private String		languageText;
	private String		otherLanguage;
	private Boolean		isICAB;
	private String		codeUBRN;
	
	private Integer		patientElectiveListID;
	private Integer		patientElectiveListVersion;
	
	private Date		trackingStatusChangedDateTime;
	private Integer		trackingStatusID;
	private	String		trackingStatusText;
	
	private String		serviceFunction;

	
	
	//----------------------------------------------------------------------------------------------------------------------------------
	// Constructors
	//----------------------------------------------------------------------------------------------------------------------------------
	
	public AppointmentForOutpatientClinicManualClass(Integer id, Integer version, Date appointmentDate, String appointmentStartTime,
													 Integer appointmentStatus_ID, String appointmentStatus_Text,
													 Integer appointmentActivityImage, String appointmentActivityName,
													 String appointmentSessionName,
													 Boolean isCABBooking,
													 Integer patientID, Integer patientVersion,
													 String patientSurname, String patientForename, String patientSex, Integer patientDoB,
													 String patientDisplayID,
													 Long numberOfCommunicationChannels,
													 Integer appointmentOutcomeID, String appointmentOutcomeText, String appointmentOutcomeComments,
													 Boolean hasElectiveList, Boolean wasPrinted,
													 String bookingLetterRecordingUserTitle,
													 String bookingLetterRecordingUserSurname, String bookingLetterRecordingUserForename,
													 Date bookingLetterRecordingDateTime,
													 Long numberOfLinkedAppointments,
													 String appointmentComments,
													 String bookingComments,
													 Integer referralID, Integer referralVersion,
													 String currentRTTStatusDescription, Date referral18WW,
													 Integer interpreterRequired, Integer languageID, String languageText, String otherLanguage,
													 Boolean isICAB, String codeUBRN,
													 Integer patientElectiveListID, Integer patientElectiveListVersion,
													 Date trackingStatusChangedDateTime, Integer trackingStatusID, String trackingStatusText,
													 String serviceFunction)
	{
		this.appointmentID				= id;
		this.appointmentVersion			= version;
		this.appointmentDate			= appointmentDate;
		this.appointmentStartTime		= appointmentStartTime;
		
		this.appointmentStatus_ID		= appointmentStatus_ID;
		this.appointmentStatus_Text		= appointmentStatus_Text;
		
		this.appointmentActivityImage	= appointmentActivityImage;
		this.appointmentActivityName	= appointmentActivityName;
		
		this.appointmentSessionName		= appointmentSessionName;
		
		this.isCABBooking				= isCABBooking;
		
		this.patientID						= patientID;
		this.patientVersion					= patientVersion;
		this.patientSurname					= patientSurname;
		this.patientForename				= patientForename;
		this.patientSex						= patientSex;
		this.patientDob						= patientDoB;
		this.patientDisplayID				= patientDisplayID;
		this.numberOfCommunicationChannels	= numberOfCommunicationChannels;
		
		this.appointmentOutcomeID		= appointmentOutcomeID;
		this.appointmentOutcomeText		= appointmentOutcomeText;
		this.appointmentOutcomeComments	= appointmentOutcomeComments;
		this.hasElectiveList			= hasElectiveList;
		this.wasPrinted					= wasPrinted;
		
		
		this.bookingLetterRecordingUserTitle	= bookingLetterRecordingUserTitle;
		this.bookingLetterRecordingUserSurname	= bookingLetterRecordingUserSurname;
		this.bookingLetterRecordingUserForename = bookingLetterRecordingUserForename;
		
		this.bookingLetterRecordingDateTime		= bookingLetterRecordingDateTime;
		
		this.numberOfLinkedAppointments	= numberOfLinkedAppointments;
		this.appointmentComments		= appointmentComments;
		this.bookingComments			= bookingComments;
		
		this.referralID						= referralID;
		this.referralVersion				= referralVersion;
		this.referralRTTStatusDescription	= currentRTTStatusDescription;
		this.referral18WWDate				= referral18WW;
		this.interpreterRequired			= YES.equals(interpreterRequired) ? Boolean.TRUE : Boolean.FALSE;
		this.languageID						= languageID;
		this.languageText					= languageText;
		this.otherLanguage					= otherLanguage;
		this.isICAB							= isICAB;
		this.codeUBRN						= codeUBRN;
		
		this.patientElectiveListID			= patientElectiveListID;
		this.patientElectiveListVersion		= patientElectiveListVersion;
		
		this.trackingStatusChangedDateTime	= trackingStatusChangedDateTime;
		this.trackingStatusID				= trackingStatusID;
		this.trackingStatusText				= trackingStatusText;
		
		this.serviceFunction				= serviceFunction;
	}



	public AppointmentForOutpatientClinicListManualCustomClassVo toAppointmentForOutpatientClinicListManualCustomClassVo()
	{
		AppointmentForOutpatientClinicListManualCustomClassVo appointment = new AppointmentForOutpatientClinicListManualCustomClassVo(this.appointmentID, this.appointmentVersion);
		
		if (this.appointmentDate != null) appointment.setAppointmentDate(new ims.framework.utils.Date(this.appointmentDate));
		if (this.appointmentStartTime != null) appointment.setApptStartTime(new ims.framework.utils.Time(this.appointmentStartTime));
		
		appointment.setAppointmentStatusID(this.appointmentStatus_ID);
		appointment.setAppointmentStatusText(this.appointmentStatus_Text);
		
		appointment.setAppointmentActivityImage(this.appointmentActivityImage);
		appointment.setAppointmentActivityName(this.appointmentActivityName);
		
		appointment.setSessionName(this.appointmentSessionName);
		
		appointment.setIsCABBooking(this.isCABBooking);
		
		if (this.patientID != null)
		{
			PatientManuallyAssembledVo patient = new PatientManuallyAssembledVo(this.patientID, this.patientVersion);
			if (this.patientDob != null) patient.setDob(new PartialDate(this.patientDob));
			patient.setSurname(this.patientSurname);
			patient.setForename(this.patientForename);
			patient.setSex(this.patientSex);
			patient.setDisplayID(this.patientDisplayID);
			
			patient.setHasCommunicationChannel(this.numberOfCommunicationChannels > 0);
			
			appointment.setPatient(patient);
		}

		appointment.setOutcomeID(this.appointmentOutcomeID);
		appointment.setOutcomeText(this.appointmentOutcomeText);
		appointment.setOutcomeComments(this.appointmentOutcomeComments);
		appointment.setHasElectiveList(this.hasElectiveList);
		appointment.setWasPrinted(this.wasPrinted);
		
		appointment.setBookingLetterRecordingUserTitle(this.bookingLetterRecordingUserTitle);
		appointment.setBookingLetterRecordingUserSurname(this.bookingLetterRecordingUserSurname);
		appointment.setBookingLetterRecordingUserForename(this.bookingLetterRecordingUserForename);
		
		if (this.bookingLetterRecordingDateTime != null) appointment.setBookingLetterRecordingDateTime(new DateTime(this.bookingLetterRecordingDateTime));
		
		appointment.setHasLinkedAppointments(this.numberOfLinkedAppointments > 0);
		appointment.setComments(this.appointmentComments);
		appointment.setBookingComments(this.bookingComments);
		
		if (this.referralID != null)
		{
			CatsReferralManualAssembledForAppointmentOutcomeListVo referral = new CatsReferralManualAssembledForAppointmentOutcomeListVo(this.referralID, this.referralVersion);
			referral.setIsCAB(this.isICAB);
			referral.setCurrentRTTStatus(this.referralRTTStatusDescription);
			if (this.referral18WWDate != null) referral.setEnd18WW(new ims.framework.utils.Date(this.referral18WWDate));
			referral.setInterpreterRequired(this.interpreterRequired);
			referral.setLanguageID(this.languageID);
			referral.setLanguageText(this.languageText);
			referral.setOtherLanguage(this.otherLanguage);
			referral.setCodeUBRN(this.codeUBRN);

			appointment.setReferral(referral);
		}
		
		if (this.patientElectiveListID != null)
		{
			PatientElectiveListRefVo electiveList = new PatientElectiveListRefVo(this.patientElectiveListID, this.patientElectiveListVersion);
			
			appointment.setElectiveList(electiveList);
		}
		
		if (this.trackingStatusChangedDateTime != null)	appointment.setTrackingStatusChangeDateTime(new DateTime(this.trackingStatusChangedDateTime));
		appointment.setTrackingStatusID(this.trackingStatusID);
		appointment.setTrackingStatusText(this.trackingStatusText);
		
		appointment.setServiceFunction(this.serviceFunction);
		

		return appointment;
	}
}
