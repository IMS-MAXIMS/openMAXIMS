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
 * Generated: 16/04/2014, 12:40
 *
 */
package ims.webservice;

public class MAXIMSWebService extends ims.domain.impl.DomainWebService
{
	public MAXIMSWebService() 
	{
		super();
	}

	public String login(String username, String password) throws Exception
	{
		return super.login(username, password);
	}
	
	public void logout()
	{
		super.logout();
	}
	
	public void logout(String sessionToken)
	{
		super.logout(sessionToken);
	}

	public ims.core.vo.beans.NotificationVoBean[] getNotifications(
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.NotificationVoCollection ret = intf.getNotifications(
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public void markNotificationAsSeen(

												  Integer notificationId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_notificationId=null;
	    if (notificationId != null)
		{
			v_notificationId = notificationId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	    intf.markNotificationAsSeen(
												  v_notificationId 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public void registerMobileDeviceToPushNotifications(

												  String uniqueDeviceId

												 , String deviceTokenId

												 , String deviceName

												 , String deviceModel

												 , String systemName

												 , String systemVersion

												 , Boolean enablePushNotifications
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_uniqueDeviceId=null;
	    if (uniqueDeviceId != null)
		{
			v_uniqueDeviceId = uniqueDeviceId;
	}
	String v_deviceTokenId=null;
	    if (deviceTokenId != null)
		{
			v_deviceTokenId = deviceTokenId;
	}
	String v_deviceName=null;
	    if (deviceName != null)
		{
			v_deviceName = deviceName;
	}
	String v_deviceModel=null;
	    if (deviceModel != null)
		{
			v_deviceModel = deviceModel;
	}
	String v_systemName=null;
	    if (systemName != null)
		{
			v_systemName = systemName;
	}
	String v_systemVersion=null;
	    if (systemVersion != null)
		{
			v_systemVersion = systemVersion;
	}
	Boolean v_enablePushNotifications=null;
	    if (enablePushNotifications != null)
		{
			v_enablePushNotifications = enablePushNotifications;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	    intf.registerMobileDeviceToPushNotifications(
												  v_uniqueDeviceId 
												 , v_deviceTokenId 
												 , v_deviceName 
												 , v_deviceModel 
												 , v_systemName 
												 , v_systemVersion 
												 , v_enablePushNotifications 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public ims.core.vo.beans.PatientShortBean getPatientById(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientShort ret = intf.getPatientById(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.core.vo.beans.PatientShortBean)ret.getBean();
	}
	public ims.core.vo.beans.PatientShortBean[] searchPatients(

												  String searchString
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_searchString=null;
	    if (searchString != null)
		{
			v_searchString = searchString;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientShortCollection ret = intf.searchPatients(
												  v_searchString 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.ocrr.vo.beans.OcsOrderWebServiceVoBean getOrderById(

												  Integer orderId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_orderId=null;
	    if (orderId != null)
		{
			v_orderId = orderId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.ocrr.vo.OcsOrderWebServiceVo ret = intf.getOrderById(
												  v_orderId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.ocrr.vo.beans.OcsOrderWebServiceVoBean)ret.getBean();
	}
	public void markOrderAsSeen(

												  Integer orderId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_orderId=null;
	    if (orderId != null)
		{
			v_orderId = orderId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	    intf.markOrderAsSeen(
												  v_orderId 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public byte[] getPatientImage(

												  Integer patientId

												 , Boolean smallImage
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
	Boolean v_smallImage=null;
	    if (smallImage != null)
		{
			v_smallImage = smallImage;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   byte[] ret = intf.getPatientImage(
												  v_patientId 
												 , v_smallImage 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public ims.ocrr.vo.beans.OcsOrderWebServiceListVoBean[] getPatientOrders(

												  Integer patientId

												 , Integer lastNumberOfDays
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
	Integer v_lastNumberOfDays=null;
	    if (lastNumberOfDays != null)
		{
			v_lastNumberOfDays = lastNumberOfDays;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.ocrr.vo.OcsOrderWebServiceListVoCollection ret = intf.getPatientOrders(
												  v_patientId 
												 , v_lastNumberOfDays 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.core.vo.beans.PatientAllergyBean[] getPatientAllergies(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientAllergyCollection ret = intf.getPatientAllergies(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.core.vo.beans.PatientAlertBean[] getPatientAlerts(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientAlertCollection ret = intf.getPatientAlerts(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.admin.vo.beans.LoggedInUserInfoWebServiceVoBean getLoggedInUserInfo(
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.admin.vo.LoggedInUserInfoWebServiceVo ret = intf.getLoggedInUserInfo(
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.admin.vo.beans.LoggedInUserInfoWebServiceVoBean)ret.getBean();
	}
	public ims.core.vo.beans.VitalSignsWebServiceVoBean[] getPatientVitalSigns(

												  Integer patientId

												 , Integer lastNumberOfDays
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
	Integer v_lastNumberOfDays=null;
	    if (lastNumberOfDays != null)
		{
			v_lastNumberOfDays = lastNumberOfDays;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.VitalSignsWebServiceVoCollection ret = intf.getPatientVitalSigns(
												  v_patientId 
												 , v_lastNumberOfDays 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public Integer getCurrentInpatientCareContext(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   Integer ret = intf.getCurrentInpatientCareContext(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public void recordVitalSigns(

												  Integer patientId

												 , ims.core.vo.beans.VitalSignsWebServiceVoBean vitalSigns
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
	ims.core.vo.VitalSignsWebServiceVo v_vitalSigns=null;
	    if (vitalSigns != null)
		{
			v_vitalSigns = vitalSigns.buildVo();
			//String[] errors0 = v_vitalSigns.validate();
			//if (errors0 != null)
			//	throw new Exception("Errors found during value object (vitalSigns) validation - " + errors0);
	
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	    intf.recordVitalSigns(
												  v_patientId 
												 , v_vitalSigns 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public ims.core.vo.beans.PatientDiagnosisWebServiceListVoBean[] getPatientDiagnosisForCurrentEpisodeOfCare(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientDiagnosisWebServiceListVoCollection ret = intf.getPatientDiagnosisForCurrentEpisodeOfCare(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.core.vo.beans.PatientProcedureWebServiceListVoBean[] getPatientProceduresForCurrentEpisodeOfCare(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientProcedureWebServiceListVoCollection ret = intf.getPatientProceduresForCurrentEpisodeOfCare(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.core.vo.beans.PatientDiagnosisWebServiceVoBean getPatientDiagnosis(

												  Integer diagnosisId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_diagnosisId=null;
	    if (diagnosisId != null)
		{
			v_diagnosisId = diagnosisId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientDiagnosisWebServiceVo ret = intf.getPatientDiagnosis(
												  v_diagnosisId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.core.vo.beans.PatientDiagnosisWebServiceVoBean)ret.getBean();
	}
	public ims.core.vo.beans.PatientProcedureWebServiceVoBean getPatientProcedure(

												  Integer procedureId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_procedureId=null;
	    if (procedureId != null)
		{
			v_procedureId = procedureId;
	}
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientProcedureWebServiceVo ret = intf.getPatientProcedure(
												  v_procedureId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.core.vo.beans.PatientProcedureWebServiceVoBean)ret.getBean();
	}
	public ims.core.vo.beans.PatientGroupWebServiceVoBean[] getMyPatients(
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
		
		ims.core.domain.Notifications intf = (ims.core.domain.Notifications)super.getDomainImpl("ims.core.domain.impl.NotificationsImpl");		

	   ims.core.vo.PatientGroupWebServiceVoCollection ret = intf.getMyPatients(
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public ims.core.vo.beans.PatientKioskSettingsVoBean getPatientKioskSettings(

												  String kioskId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_kioskId=null;
	    if (kioskId != null)
		{
			v_kioskId = kioskId;
	}
		
		ims.admin.domain.PatientKioskConfig intf = (ims.admin.domain.PatientKioskConfig)super.getDomainImpl("ims.admin.domain.impl.PatientKioskConfigImpl");		

	   ims.core.vo.PatientKioskSettingsVo ret = intf.getPatientKioskSettings(
												  v_kioskId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.core.vo.beans.PatientKioskSettingsVoBean)ret.getBean();
	}
	public ims.scheduling.vo.beans.Sch_BookingVoBean saveBooking(

												  ims.scheduling.vo.beans.Sch_BookingVoBean booking

												 , ims.vo.RefVoBean catsReferral

												 , Boolean isRebook
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	ims.scheduling.vo.Sch_BookingVo v_booking=null;
	    if (booking != null)
		{
			v_booking = booking.buildVo();
			//String[] errors0 = v_booking.validate();
			//if (errors0 != null)
			//	throw new Exception("Errors found during value object (booking) validation - " + errors0);
	
	}
	ims.careuk.vo.CatsReferralRefVo v_catsReferral=null;
	    if (catsReferral != null)
		{
			v_catsReferral = catsReferral == null ? null : new ims.careuk.vo.CatsReferralRefVo(catsReferral.getId(), catsReferral.getVersion());
	}
	Boolean v_isRebook=null;
	    if (isRebook != null)
		{
			v_isRebook = isRebook;
	}
		
		ims.careuk.domain.BookAppointment intf = (ims.careuk.domain.BookAppointment)super.getDomainImpl("ims.careuk.domain.impl.BookAppointmentImpl");		

	   ims.scheduling.vo.Sch_BookingVo ret = intf.saveBooking(
												  v_booking 
												 , v_catsReferral 
												 , v_isRebook 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return (ims.scheduling.vo.beans.Sch_BookingVoBean)ret.getBean();
	}
	public void processAppointmentForPukkaJ(

												  ims.vo.RefVoBean catsReferral

												 , ims.vo.RefVoBean appt
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	ims.careuk.vo.CatsReferralRefVo v_catsReferral=null;
	    if (catsReferral != null)
		{
			v_catsReferral = catsReferral == null ? null : new ims.careuk.vo.CatsReferralRefVo(catsReferral.getId(), catsReferral.getVersion());
	}
	ims.scheduling.vo.Booking_AppointmentRefVo v_appt=null;
	    if (appt != null)
		{
			v_appt = appt == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(appt.getId(), appt.getVersion());
	}
		
		ims.careuk.domain.BookAppointment intf = (ims.careuk.domain.BookAppointment)super.getDomainImpl("ims.careuk.domain.impl.BookAppointmentImpl");		

	    intf.processAppointmentForPukkaJ(
												  v_catsReferral 
												 , v_appt 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public void cancelAppointmentForPukkaJ(

												  ims.vo.RefVoBean catsReferral

												 , ims.vo.RefVoBean appt
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	ims.careuk.vo.CatsReferralRefVo v_catsReferral=null;
	    if (catsReferral != null)
		{
			v_catsReferral = catsReferral == null ? null : new ims.careuk.vo.CatsReferralRefVo(catsReferral.getId(), catsReferral.getVersion());
	}
	ims.scheduling.vo.Booking_AppointmentRefVo v_appt=null;
	    if (appt != null)
		{
			v_appt = appt == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(appt.getId(), appt.getVersion());
	}
		
		ims.careuk.domain.BookAppointment intf = (ims.careuk.domain.BookAppointment)super.getDomainImpl("ims.careuk.domain.impl.BookAppointmentImpl");		

	    intf.cancelAppointmentForPukkaJ(
												  v_catsReferral 
												 , v_appt 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public Integer generateSessionSlots(

												  String directoryOfService

												 , ims.framework.utils.beans.DateBean fromDate

												 , ims.framework.utils.beans.DateBean toDate
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_directoryOfService=null;
	    if (directoryOfService != null)
		{
			v_directoryOfService = directoryOfService;
	}
	ims.framework.utils.Date v_fromDate=null;
	    if (fromDate != null)
		{
			v_fromDate = fromDate.buildDate();
	}
	ims.framework.utils.Date v_toDate=null;
	    if (toDate != null)
		{
			v_toDate = toDate.buildDate();
	}
		
		ims.scheduling.domain.GenerateSessions intf = (ims.scheduling.domain.GenerateSessions)super.getDomainImpl("ims.scheduling.domain.impl.GenerateSessionsImpl");		

	   Integer ret = intf.generateSessionSlots(
												  v_directoryOfService 
												 , v_fromDate 
												 , v_toDate 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public ims.admin.vo.beans.PatientKioskBookingVoBean[] listPatientKioskBookingsForToday(

												  String surname

												 , ims.framework.utils.beans.DateBean dateOfBirth

												 , Integer genderId

												 , String kioskId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_surname=null;
	    if (surname != null)
		{
			v_surname = surname;
	}
	ims.framework.utils.Date v_dateOfBirth=null;
	    if (dateOfBirth != null)
		{
			v_dateOfBirth = dateOfBirth.buildDate();
	}
	Integer v_genderId=null;
	    if (genderId != null)
		{
			v_genderId = genderId;
	}
	String v_kioskId=null;
	    if (kioskId != null)
		{
			v_kioskId = kioskId;
	}
		
		ims.scheduling.domain.PatientKioskOperations intf = (ims.scheduling.domain.PatientKioskOperations)super.getDomainImpl("ims.scheduling.domain.impl.PatientKioskOperationsImpl");		

	   ims.admin.vo.PatientKioskBookingVoCollection ret = intf.listPatientKioskBookingsForToday(
												  v_surname 
												 , v_dateOfBirth 
												 , v_genderId 
												 , v_kioskId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret.getBeanCollectionArray();
	}
	public void confirmPatientKioskAppointmentsForToday(

												  Integer[] appointmentIds

												 , String kioskId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer[] v_appointmentIds=null;
	    if (appointmentIds != null)
		{
			v_appointmentIds = appointmentIds;
	}
	String v_kioskId=null;
	    if (kioskId != null)
		{
			v_kioskId = kioskId;
	}
		
		ims.scheduling.domain.PatientKioskOperations intf = (ims.scheduling.domain.PatientKioskOperations)super.getDomainImpl("ims.scheduling.domain.impl.PatientKioskOperationsImpl");		

	    intf.confirmPatientKioskAppointmentsForToday(
												  v_appointmentIds 
												 , v_kioskId 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public Boolean isPatientLate(

												  Integer patientId
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	Integer v_patientId=null;
	    if (patientId != null)
		{
			v_patientId = patientId;
	}
		
		ims.scheduling.domain.PatientKioskOperations intf = (ims.scheduling.domain.PatientKioskOperations)super.getDomainImpl("ims.scheduling.domain.impl.PatientKioskOperationsImpl");		

	   Boolean ret = intf.isPatientLate(
												  v_patientId 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public void updateCatsReferralAdditionalInvStatus(

												  ims.vo.RefVoBean catsReferral
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	ims.careuk.vo.CatsReferralRefVo v_catsReferral=null;
	    if (catsReferral != null)
		{
			v_catsReferral = catsReferral == null ? null : new ims.careuk.vo.CatsReferralRefVo(catsReferral.getId(), catsReferral.getVersion());
	}
		
		ims.scheduling.domain.SessionAdmin intf = (ims.scheduling.domain.SessionAdmin)super.getDomainImpl("ims.scheduling.domain.impl.SessionAdminImpl");		

	    intf.updateCatsReferralAdditionalInvStatus(
												  v_catsReferral 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
	public String getSecurityToken(

												  String sessionToken
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_sessionToken=null;
	    if (sessionToken != null)
		{
			v_sessionToken = sessionToken;
	}
		
		ims.admin.domain.WebServicesIntegration intf = (ims.admin.domain.WebServicesIntegration)super.getDomainImpl("ims.admin.domain.impl.WebServicesIntegrationImpl");		

	   String ret = intf.getSecurityToken(
												  v_sessionToken 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public byte[] buildReport(

												  String templateId

												 , String imsId

												 , String templateName

												 , String reportId

												 , String format
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_templateId=null;
	    if (templateId != null)
		{
			v_templateId = templateId;
	}
	String v_imsId=null;
	    if (imsId != null)
		{
			v_imsId = imsId;
	}
	String v_templateName=null;
	    if (templateName != null)
		{
			v_templateName = templateName;
	}
	String v_reportId=null;
	    if (reportId != null)
		{
			v_reportId = reportId;
	}
	String v_format=null;
	    if (format != null)
		{
			v_format = format;
	}
		
		ims.admin.domain.WebServicesIntegration intf = (ims.admin.domain.WebServicesIntegration)super.getDomainImpl("ims.admin.domain.impl.WebServicesIntegrationImpl");		

	   byte[] ret = intf.buildReport(
												  v_templateId 
												 , v_imsId 
												 , v_templateName 
												 , v_reportId 
												 , v_format 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public String buildReportAsUrl(

												  String templateId

												 , String imsId

												 , String templateName

												 , String reportId

												 , String format
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_templateId=null;
	    if (templateId != null)
		{
			v_templateId = templateId;
	}
	String v_imsId=null;
	    if (imsId != null)
		{
			v_imsId = imsId;
	}
	String v_templateName=null;
	    if (templateName != null)
		{
			v_templateName = templateName;
	}
	String v_reportId=null;
	    if (reportId != null)
		{
			v_reportId = reportId;
	}
	String v_format=null;
	    if (format != null)
		{
			v_format = format;
	}
		
		ims.admin.domain.WebServicesIntegration intf = (ims.admin.domain.WebServicesIntegration)super.getDomainImpl("ims.admin.domain.impl.WebServicesIntegrationImpl");		

	   String ret = intf.buildReportAsUrl(
												  v_templateId 
												 , v_imsId 
												 , v_templateName 
												 , v_reportId 
												 , v_format 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public String buildReportAsUrlInlineFrame(

												  String templateId

												 , String imsId

												 , String templateName

												 , String reportId

												 , String format
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_templateId=null;
	    if (templateId != null)
		{
			v_templateId = templateId;
	}
	String v_imsId=null;
	    if (imsId != null)
		{
			v_imsId = imsId;
	}
	String v_templateName=null;
	    if (templateName != null)
		{
			v_templateName = templateName;
	}
	String v_reportId=null;
	    if (reportId != null)
		{
			v_reportId = reportId;
	}
	String v_format=null;
	    if (format != null)
		{
			v_format = format;
	}
		
		ims.admin.domain.WebServicesIntegration intf = (ims.admin.domain.WebServicesIntegration)super.getDomainImpl("ims.admin.domain.impl.WebServicesIntegrationImpl");		

	   String ret = intf.buildReportAsUrlInlineFrame(
												  v_templateId 
												 , v_imsId 
												 , v_templateName 
												 , v_reportId 
												 , v_format 
                                           ); 

		//super.freeDomainImpl(intf);
				if(ret == null)
			return null;
				return ret;
	}
	public void addSeed(

												  String name

												 , String value
                                                 ) throws Exception
	{
		if (!loggedIn()) throw new Exception("Not logged in!!");
			
	String v_name=null;
	    if (name != null)
		{
			v_name = name;
	}
	String v_value=null;
	    if (value != null)
		{
			v_value = value;
	}
		
		ims.admin.domain.WebServicesIntegration intf = (ims.admin.domain.WebServicesIntegration)super.getDomainImpl("ims.admin.domain.impl.WebServicesIntegrationImpl");		

	    intf.addSeed(
												  v_name 
												 , v_value 
                                           ); 

		//super.freeDomainImpl(intf);
						
	}
}		
