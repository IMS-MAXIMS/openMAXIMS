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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.emergency.forms.dischargedetails_outcome;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		Emergency = new EmergencyContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");
		public boolean getEpisodeofCareShortIsNotNull()
		{
			return !cx_CoreEpisodeofCareShort.getValueIsNull(context);
		}
		public ims.core.vo.EpisodeofCareShortVo getEpisodeofCareShort()
		{
			return (ims.core.vo.EpisodeofCareShortVo)cx_CoreEpisodeofCareShort.getValue(context);
		}
		public void setEpisodeofCareShort(ims.core.vo.EpisodeofCareShortVo value)
		{
			cx_CoreEpisodeofCareShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreEpisodeofCareShort = new ims.framework.ContextVariable("Core.EpisodeofCareShort", "_cvp_Core.EpisodeofCareShort");
		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextShortVo value)
		{
			cx_CoreCurrentCareContext.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getImsReportIdIsNotNull()
		{
			return !cx_CoreImsReportId.getValueIsNull(context);
		}
		public Integer getImsReportId()
		{
			return (Integer)cx_CoreImsReportId.getValue(context);
		}
		public void setImsReportId(Integer value)
		{
			cx_CoreImsReportId.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreImsReportId = new ims.framework.ContextVariable("Core.ImsReportId", "_cv_Core.ImsReportId");
		public boolean getDeathDetailsIsNotNull()
		{
			return !cx_CoreDeathDetails.getValueIsNull(context);
		}
		public ims.core.vo.DeathDetailsVo getDeathDetails()
		{
			return (ims.core.vo.DeathDetailsVo)cx_CoreDeathDetails.getValue(context);
		}
		public void setDeathDetails(ims.core.vo.DeathDetailsVo value)
		{
			cx_CoreDeathDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreDeathDetails = new ims.framework.ContextVariable("Core.DeathDetails", "_cv_Core.DeathDetails");
		public boolean getParentFormModeIsNotNull()
		{
			return !cx_CoreParentFormMode.getValueIsNull(context);
		}
		public ims.framework.enumerations.FormMode getParentFormMode()
		{
			return (ims.framework.enumerations.FormMode)cx_CoreParentFormMode.getValue(context);
		}
		public void setParentFormMode(ims.framework.enumerations.FormMode value)
		{
			cx_CoreParentFormMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreParentFormMode = new ims.framework.ContextVariable("Core.ParentFormMode", "_cv_Core.ParentFormMode");
		public boolean getVitalSignIsNotNull()
		{
			return !cx_CoreVitalSign.getValueIsNull(context);
		}
		public ims.core.vo.VitalSignsVo getVitalSign()
		{
			return (ims.core.vo.VitalSignsVo)cx_CoreVitalSign.getValue(context);
		}
		public void setVitalSign(ims.core.vo.VitalSignsVo value)
		{
			cx_CoreVitalSign.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreVitalSign = new ims.framework.ContextVariable("Core.VitalSign", "_cv_Core.VitalSign");
		public boolean getRefreshParentIsNotNull()
		{
			return !cx_CoreRefreshParent.getValueIsNull(context);
		}
		public Boolean getRefreshParent()
		{
			return (Boolean)cx_CoreRefreshParent.getValue(context);
		}
		public void setRefreshParent(Boolean value)
		{
			cx_CoreRefreshParent.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreRefreshParent = new ims.framework.ContextVariable("Core.RefreshParent", "_cv_Core.RefreshParent");

		private ims.framework.Context context;
	}
	public final class EmergencyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private EmergencyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getReasonForBreachIsNotNull()
		{
			return !cx_EmergencyReasonForBreach.getValueIsNull(context);
		}
		public ims.emergency.vo.ReasonForBreachVo getReasonForBreach()
		{
			return (ims.emergency.vo.ReasonForBreachVo)cx_EmergencyReasonForBreach.getValue(context);
		}
		public void setReasonForBreach(ims.emergency.vo.ReasonForBreachVo value)
		{
			cx_EmergencyReasonForBreach.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyReasonForBreach = new ims.framework.ContextVariable("Emergency.ReasonForBreach", "_cv_Emergency.ReasonForBreach");
		public boolean getEDClinicDetailsIsNotNull()
		{
			return !cx_EmergencyEDClinicDetails.getValueIsNull(context);
		}
		public ims.emergency.vo.EDClinicDetailsVo getEDClinicDetails()
		{
			return (ims.emergency.vo.EDClinicDetailsVo)cx_EmergencyEDClinicDetails.getValue(context);
		}
		public void setEDClinicDetails(ims.emergency.vo.EDClinicDetailsVo value)
		{
			cx_EmergencyEDClinicDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyEDClinicDetails = new ims.framework.ContextVariable("Emergency.EDClinicDetails", "_cv_Emergency.EDClinicDetails");
		public boolean getTrackingAttendanceStatusIsNotNull()
		{
			return !cx_EmergencyTrackingAttendanceStatus.getValueIsNull(context);
		}
		public ims.emergency.vo.TrackingAttendanceStatusVo getTrackingAttendanceStatus()
		{
			return (ims.emergency.vo.TrackingAttendanceStatusVo)cx_EmergencyTrackingAttendanceStatus.getValue(context);
		}
		public void setTrackingAttendanceStatus(ims.emergency.vo.TrackingAttendanceStatusVo value)
		{
			cx_EmergencyTrackingAttendanceStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyTrackingAttendanceStatus = new ims.framework.ContextVariable("Emergency.TrackingAttendanceStatus", "_cv_Emergency.TrackingAttendanceStatus");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public EmergencyContext Emergency;
}
