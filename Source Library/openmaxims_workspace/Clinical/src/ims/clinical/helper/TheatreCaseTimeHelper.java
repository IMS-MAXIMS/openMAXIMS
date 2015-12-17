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

import ims.clinical.vo.PeriOpAnaesthticSignInTimVo;
import ims.clinical.vo.PeriOpPatientArrivedTimeVo;
import ims.clinical.vo.PeriOpPatientLeftTheatreVo;
import ims.clinical.vo.PeriOpPatientSentTimeVo;
import ims.clinical.vo.PeriOpReadyForDischargeVo;
import ims.clinical.vo.PeriOpReadyForSurgeryTimeVo;
import ims.clinical.vo.PeriOpSafetyBriefTimeVo;
import ims.clinical.vo.PeriOpSurgeryStartTimeVo;
import ims.clinical.vo.PeriOpSurgeryStopTimeVo;
import ims.clinical.vo.PeriOpTimeIntoRecoveryVo;
import ims.clinical.vo.PeriOpTimeOutCompleteVo;
import ims.clinical.vo.PeriOpTimeOutOfRecoveryVo;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;
import ims.scheduling.vo.lookups.AcuteTheateListBookingState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TheatreCaseTimeHelper
{
	public static final int SAFETY_BRIEF = 0;
	public static final int PATIENT_SENT = 1;
	public static final int PATIENT_ARRIVED = 2;
	public static final int ANAES_SIGN_IN = 3;
	public static final int ANAES_RFS = 4;
	public static final int TIMEOUT_COMPLTED = 5;
	public static final int SURGERY_START = 6;
	public static final int SURGERY_STOP = 7;
	public static final int PATIENT_LEFT = 8;
	public static final int INTO_RECOVERY = 9;
	public static final int READY_FOR_DISCHARGE = 10;
	public static final int TIME_OUT_RECOVERY = 11;

	/**
	 * this map will be used when validating that the PerOPTime value is after
	 * the preceding and before the next available times
	 */
	public static java.util.Map<Integer, DateTime> createTimeValidationMap(PeriOpSafetyBriefTimeVo periOpSafetyBriefTimeVo, PeriOpReadyForSurgeryTimeVo periOpReadyForSurgeryTimeVo, PeriOpAnaesthticSignInTimVo periOpAnaesthticSignInTimVo, PeriOpPatientArrivedTimeVo periOpPatientArrivedTimeVo, PeriOpPatientLeftTheatreVo periOpPatientLeftTheatreVo, PeriOpPatientSentTimeVo periOpPatientSentTimeVo, PeriOpReadyForDischargeVo periOpReadyForDischargeVo, PeriOpSurgeryStartTimeVo periOpSurgeryStartTimeVo, PeriOpSurgeryStopTimeVo periOpSurgeryStopTimeVo, PeriOpTimeIntoRecoveryVo periOpTimeIntoRecovery, PeriOpTimeOutCompleteVo periOpTimeOutCompleteVo, PeriOpTimeOutOfRecoveryVo periOpTimeOutOfRecoveryVo)
	{
		java.util.Map<Integer, DateTime> times = new HashMap<Integer, DateTime>();

		times.put(TheatreCaseTimeHelper.SAFETY_BRIEF, periOpSafetyBriefTimeVo != null ? periOpSafetyBriefTimeVo.getSafetyBriefTime() : null);
		times.put(TheatreCaseTimeHelper.PATIENT_SENT, periOpPatientSentTimeVo != null ? periOpPatientSentTimeVo.getPatientSentTime() : null);
		times.put(TheatreCaseTimeHelper.PATIENT_ARRIVED, periOpPatientArrivedTimeVo != null ? periOpPatientArrivedTimeVo.getPatientArrivedTime() : null);
		times.put(TheatreCaseTimeHelper.ANAES_SIGN_IN, periOpAnaesthticSignInTimVo != null ? periOpAnaesthticSignInTimVo.getAnaestheticStartTime() : null);
		times.put(TheatreCaseTimeHelper.ANAES_RFS, periOpReadyForSurgeryTimeVo != null ? periOpReadyForSurgeryTimeVo.getAnaesthetisedReadyForSurgeryTime() : null);
		times.put(TheatreCaseTimeHelper.TIMEOUT_COMPLTED, periOpTimeOutCompleteVo != null ? periOpTimeOutCompleteVo.getTimeOutCompleted() : null);
		times.put(TheatreCaseTimeHelper.SURGERY_START, periOpSurgeryStartTimeVo != null ? periOpSurgeryStartTimeVo.getSurgeryStartTime() : null);
		times.put(TheatreCaseTimeHelper.SURGERY_STOP, periOpSurgeryStopTimeVo != null ? periOpSurgeryStopTimeVo.getSurgeryStopTime() : null);
		times.put(TheatreCaseTimeHelper.PATIENT_LEFT, periOpPatientLeftTheatreVo != null ? periOpPatientLeftTheatreVo.getPatientLeftTheatreTime() : null);
		times.put(TheatreCaseTimeHelper.INTO_RECOVERY, periOpTimeIntoRecovery != null ? periOpTimeIntoRecovery.getTimeIntoRecovery() : null);
		times.put(TheatreCaseTimeHelper.READY_FOR_DISCHARGE, periOpReadyForDischargeVo != null ? periOpReadyForDischargeVo.getReadyForDischargeTime() : null);
		times.put(TheatreCaseTimeHelper.TIME_OUT_RECOVERY, periOpTimeOutOfRecoveryVo != null ? periOpTimeOutOfRecoveryVo.getTimeOutOfRecovery() : null);

		return times;
	}

	public static String[] validateTime(Integer state, DateTime dateTime, Map<Integer, DateTime> items)
	{
		Integer origState = state;

		DateTime start = null;
		DateTime end = null;

		// get next value if any
		int nextValueIndex = -1;

		//WDEV-22481 - only validate Safety Brief against anything beyond Anaesthetic SignIn
		if(origState == SAFETY_BRIEF)
			state = ANAES_SIGN_IN; 

		while (end == null && state < 12)
		{
			nextValueIndex = state += 1;
			end = items.get(nextValueIndex);
		}

		int previousValueIndex = -1;
		if (origState != PATIENT_SENT && origState != SAFETY_BRIEF) //WDEV-22940
		{
			// get previous value if any
			while (start == null && origState > 0)
			{
					previousValueIndex = origState -= 1;
					start = items.get(previousValueIndex);
			}
		}

		List<String> listOfErrors = new ArrayList<String>();

		if (start != null)
		{
			if (dateTime.isLessThan(start))
			{
				String field = getLabel(previousValueIndex);
				listOfErrors.add("Provided value is before '" + field + "' Date Time");
			}
		}
		if (end != null)
		{
			if (dateTime.isGreaterThan(end))
			{
				String field = getLabel(nextValueIndex);
				listOfErrors.add("Provided value is after '" + field + "' Date Time");					

			}
		}

		String[] arrErrors = listOfErrors.toArray(new String[0]);
		return arrErrors;
	}

	public static String getLabel(int index)
	{
		String label="";
		switch (index)
		{
		case SAFETY_BRIEF:
			label = "Safety Brief";
			break;
		case PATIENT_SENT:
			label = "Patient Sent For";
			break;
		case PATIENT_ARRIVED:
			label = "Patient Arrived";
			break;
		case ANAES_SIGN_IN:
			label = "Anaesthetic Sign In";
			break;
		case ANAES_RFS:
			label = "Anaesthetised Ready For Surgery";
			break;
		case TIMEOUT_COMPLTED:
			label = "Time Out Completed";
			break;
		case SURGERY_START:
			label = "Surgery Start";
			break;
		case SURGERY_STOP:
			label = "Surgery Stop";
			break;
		case INTO_RECOVERY:
			label = "Into Recovery";
			break;
		case PATIENT_LEFT:
			label = "Patient Left Theatre";
			break;
		case READY_FOR_DISCHARGE:
			label = "Ready For Discharge";
			break;
		case TIME_OUT_RECOVERY:
			label = "Time Out of Recovery";
			break;
		default:
			throw new CodingRuntimeException("index not availabe in constants");
		}
		return label;
	}

	//WDEV-22400
	public static AcuteTheateListBookingState getBookingState(int index)
	{
		AcuteTheateListBookingState state=null;
		switch (index)
		{
		case SAFETY_BRIEF:
			state = AcuteTheateListBookingState.SAFETY_BRIEF;
			break;
		case PATIENT_SENT:
			state = AcuteTheateListBookingState.PATIENT_SENT_FOR;
			break;
		case PATIENT_ARRIVED:
			state = AcuteTheateListBookingState.PATIENT_ARRIVED;
			break;
		case ANAES_SIGN_IN:
			state = AcuteTheateListBookingState.ANAESTHETIC_SIGNIN;
			break;
		case ANAES_RFS:
			state = AcuteTheateListBookingState.ANAESTHETIC_RFS;
			break;
		case TIMEOUT_COMPLTED:
			state = AcuteTheateListBookingState.TIMEOUT_COMPLETE;
			break;
		case SURGERY_START:
			state = AcuteTheateListBookingState.SURGERY_START_TIME;
			break;
		case SURGERY_STOP:
			state = AcuteTheateListBookingState.SURGERY_STOP;
			break;
		case INTO_RECOVERY:
			state = AcuteTheateListBookingState.INTO_RECOVERY;
			break;
		case PATIENT_LEFT:
			state = AcuteTheateListBookingState.PATIENT_LEFT_THEATRE;
			break;
		case READY_FOR_DISCHARGE:
			state = AcuteTheateListBookingState.READY_FOR_DISCHARGE;
			break;
		case TIME_OUT_RECOVERY:
			state = AcuteTheateListBookingState.TIME_OUT_OF_RECOVERY;
			break;
		}
		return state;
	}	
}
