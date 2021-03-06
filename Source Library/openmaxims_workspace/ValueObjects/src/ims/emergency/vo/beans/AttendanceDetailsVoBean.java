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

package ims.emergency.vo.beans;

public class AttendanceDetailsVoBean extends ims.vo.ValueObjectBean
{
	public AttendanceDetailsVoBean()
	{
	}
	public AttendanceDetailsVoBean(ims.emergency.vo.AttendanceDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.arrivaldatetime = vo.getArrivalDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getArrivalDateTime().getBean();
		this.registrationdatetime = vo.getRegistrationDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRegistrationDateTime().getBean();
		this.dischargedatetime = vo.getDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDischargeDateTime().getBean();
		this.attendancetype = vo.getAttendanceType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAttendanceType().getBean();
		this.emergencydepttype = vo.getEmergencyDeptType() == null ? null : (ims.vo.LookupInstanceBean)vo.getEmergencyDeptType().getBean();
		this.modeofarrival = vo.getModeOfArrival() == null ? null : (ims.vo.LookupInstanceBean)vo.getModeOfArrival().getBean();
		this.accompaniedby = vo.getAccompaniedBy() == null ? null : (ims.vo.LookupInstanceBean)vo.getAccompaniedBy().getBean();
		this.registrationlocation = vo.getRegistrationLocation() == null ? null : new ims.vo.RefVoBean(vo.getRegistrationLocation().getBoId(), vo.getRegistrationLocation().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextShortVoBean)vo.getCareContext().getBean();
		this.emergencyepisode = vo.getEmergencyEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEmergencyEpisode().getBoId(), vo.getEmergencyEpisode().getBoVersion());
		this.outcome = vo.getOutcome() == null ? null : (ims.vo.LookupInstanceBean)vo.getOutcome().getBean();
		this.destination = vo.getDestination();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.ambulancearrivaldatetime = vo.getAmbulanceArrivalDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAmbulanceArrivalDateTime().getBean();
		this.ambulancejobno = vo.getAmbulanceJobNo();
		this.ageatattendance = vo.getAgeAtAttendance();
		this.urgencylevel = vo.getUrgencyLevel() == null ? null : (ims.vo.LookupInstanceBean)vo.getUrgencyLevel().getBean();
		this.visittype = vo.getVisitType() == null ? null : (ims.vo.LookupInstanceBean)vo.getVisitType().getBean();
		this.edconsultant = vo.getEDConsultant() == null ? null : (ims.vo.LookupInstanceBean)vo.getEDConsultant().getBean();
		this.registeringmos = vo.getRegisteringMOS() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getRegisteringMOS().getBean();
		this.updatingmos = vo.getUpdatingMOS() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getUpdatingMOS().getBean();
		this.comments = vo.getComments();
		this.preferedlanguage = vo.getPreferedLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getPreferedLanguage().getBean();
		this.intrepreterrequired = vo.getIntrepreterRequired() == null ? null : (ims.vo.LookupInstanceBean)vo.getIntrepreterRequired().getBean();
		this.depttype = vo.getDeptType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDeptType().getBean();
		this.isexpectedarrival = vo.getIsExpectedArrival();
		this.isprimarycare = vo.getIsPrimaryCare();
		this.bedtyperequested = vo.getBedTypeRequested() == null ? null : (ims.vo.LookupInstanceBean)vo.getBedTypeRequested().getBean();
		this.useprivatehealthinsurance = vo.getUsePrivateHealthInsurance();
		this.endofregistrationdatetime = vo.getEndOfRegistrationDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEndOfRegistrationDateTime().getBean();
		this.ambulancehandoverdatetime = vo.getAmbulanceHandoverDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAmbulanceHandoverDateTime().getBean();
		this.ambulancedelayreason = vo.getAmbulanceDelayReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getAmbulanceDelayReason().getBean();
		this.customid = vo.getCustomID();
		this.accomodationrequestedtype = vo.getAccomodationRequestedType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAccomodationRequestedType().getBean();
		this.ambulancedelayreasoncomment = vo.getAmbulanceDelayReasonComment();
		this.requiressignoff = vo.getRequiresSignOff() == null ? null : (ims.vo.LookupInstanceBean)vo.getRequiresSignOff().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.AttendanceDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.arrivaldatetime = vo.getArrivalDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getArrivalDateTime().getBean();
		this.registrationdatetime = vo.getRegistrationDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRegistrationDateTime().getBean();
		this.dischargedatetime = vo.getDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDischargeDateTime().getBean();
		this.attendancetype = vo.getAttendanceType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAttendanceType().getBean();
		this.emergencydepttype = vo.getEmergencyDeptType() == null ? null : (ims.vo.LookupInstanceBean)vo.getEmergencyDeptType().getBean();
		this.modeofarrival = vo.getModeOfArrival() == null ? null : (ims.vo.LookupInstanceBean)vo.getModeOfArrival().getBean();
		this.accompaniedby = vo.getAccompaniedBy() == null ? null : (ims.vo.LookupInstanceBean)vo.getAccompaniedBy().getBean();
		this.registrationlocation = vo.getRegistrationLocation() == null ? null : new ims.vo.RefVoBean(vo.getRegistrationLocation().getBoId(), vo.getRegistrationLocation().getBoVersion());
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextShortVoBean)vo.getCareContext().getBean(map);
		this.emergencyepisode = vo.getEmergencyEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEmergencyEpisode().getBoId(), vo.getEmergencyEpisode().getBoVersion());
		this.outcome = vo.getOutcome() == null ? null : (ims.vo.LookupInstanceBean)vo.getOutcome().getBean();
		this.destination = vo.getDestination();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.ambulancearrivaldatetime = vo.getAmbulanceArrivalDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAmbulanceArrivalDateTime().getBean();
		this.ambulancejobno = vo.getAmbulanceJobNo();
		this.ageatattendance = vo.getAgeAtAttendance();
		this.urgencylevel = vo.getUrgencyLevel() == null ? null : (ims.vo.LookupInstanceBean)vo.getUrgencyLevel().getBean();
		this.visittype = vo.getVisitType() == null ? null : (ims.vo.LookupInstanceBean)vo.getVisitType().getBean();
		this.edconsultant = vo.getEDConsultant() == null ? null : (ims.vo.LookupInstanceBean)vo.getEDConsultant().getBean();
		this.registeringmos = vo.getRegisteringMOS() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getRegisteringMOS().getBean(map);
		this.updatingmos = vo.getUpdatingMOS() == null ? null : (ims.core.vo.beans.MemberOfStaffLiteVoBean)vo.getUpdatingMOS().getBean(map);
		this.comments = vo.getComments();
		this.preferedlanguage = vo.getPreferedLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getPreferedLanguage().getBean();
		this.intrepreterrequired = vo.getIntrepreterRequired() == null ? null : (ims.vo.LookupInstanceBean)vo.getIntrepreterRequired().getBean();
		this.depttype = vo.getDeptType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDeptType().getBean();
		this.isexpectedarrival = vo.getIsExpectedArrival();
		this.isprimarycare = vo.getIsPrimaryCare();
		this.bedtyperequested = vo.getBedTypeRequested() == null ? null : (ims.vo.LookupInstanceBean)vo.getBedTypeRequested().getBean();
		this.useprivatehealthinsurance = vo.getUsePrivateHealthInsurance();
		this.endofregistrationdatetime = vo.getEndOfRegistrationDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEndOfRegistrationDateTime().getBean();
		this.ambulancehandoverdatetime = vo.getAmbulanceHandoverDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAmbulanceHandoverDateTime().getBean();
		this.ambulancedelayreason = vo.getAmbulanceDelayReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getAmbulanceDelayReason().getBean();
		this.customid = vo.getCustomID();
		this.accomodationrequestedtype = vo.getAccomodationRequestedType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAccomodationRequestedType().getBean();
		this.ambulancedelayreasoncomment = vo.getAmbulanceDelayReasonComment();
		this.requiressignoff = vo.getRequiresSignOff() == null ? null : (ims.vo.LookupInstanceBean)vo.getRequiresSignOff().getBean();
	}

	public ims.emergency.vo.AttendanceDetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.AttendanceDetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.AttendanceDetailsVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.AttendanceDetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.AttendanceDetailsVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.framework.utils.beans.DateTimeBean getArrivalDateTime()
	{
		return this.arrivaldatetime;
	}
	public void setArrivalDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.arrivaldatetime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getRegistrationDateTime()
	{
		return this.registrationdatetime;
	}
	public void setRegistrationDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.registrationdatetime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDischargeDateTime()
	{
		return this.dischargedatetime;
	}
	public void setDischargeDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.dischargedatetime = value;
	}
	public ims.vo.LookupInstanceBean getAttendanceType()
	{
		return this.attendancetype;
	}
	public void setAttendanceType(ims.vo.LookupInstanceBean value)
	{
		this.attendancetype = value;
	}
	public ims.vo.LookupInstanceBean getEmergencyDeptType()
	{
		return this.emergencydepttype;
	}
	public void setEmergencyDeptType(ims.vo.LookupInstanceBean value)
	{
		this.emergencydepttype = value;
	}
	public ims.vo.LookupInstanceBean getModeOfArrival()
	{
		return this.modeofarrival;
	}
	public void setModeOfArrival(ims.vo.LookupInstanceBean value)
	{
		this.modeofarrival = value;
	}
	public ims.vo.LookupInstanceBean getAccompaniedBy()
	{
		return this.accompaniedby;
	}
	public void setAccompaniedBy(ims.vo.LookupInstanceBean value)
	{
		this.accompaniedby = value;
	}
	public ims.vo.RefVoBean getRegistrationLocation()
	{
		return this.registrationlocation;
	}
	public void setRegistrationLocation(ims.vo.RefVoBean value)
	{
		this.registrationlocation = value;
	}
	public ims.core.vo.beans.CareContextShortVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.vo.beans.CareContextShortVoBean value)
	{
		this.carecontext = value;
	}
	public ims.vo.RefVoBean getEmergencyEpisode()
	{
		return this.emergencyepisode;
	}
	public void setEmergencyEpisode(ims.vo.RefVoBean value)
	{
		this.emergencyepisode = value;
	}
	public ims.vo.LookupInstanceBean getOutcome()
	{
		return this.outcome;
	}
	public void setOutcome(ims.vo.LookupInstanceBean value)
	{
		this.outcome = value;
	}
	public String getDestination()
	{
		return this.destination;
	}
	public void setDestination(String value)
	{
		this.destination = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getEpisode()
	{
		return this.episode;
	}
	public void setEpisode(ims.vo.RefVoBean value)
	{
		this.episode = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAmbulanceArrivalDateTime()
	{
		return this.ambulancearrivaldatetime;
	}
	public void setAmbulanceArrivalDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.ambulancearrivaldatetime = value;
	}
	public String getAmbulanceJobNo()
	{
		return this.ambulancejobno;
	}
	public void setAmbulanceJobNo(String value)
	{
		this.ambulancejobno = value;
	}
	public Integer getAgeAtAttendance()
	{
		return this.ageatattendance;
	}
	public void setAgeAtAttendance(Integer value)
	{
		this.ageatattendance = value;
	}
	public ims.vo.LookupInstanceBean getUrgencyLevel()
	{
		return this.urgencylevel;
	}
	public void setUrgencyLevel(ims.vo.LookupInstanceBean value)
	{
		this.urgencylevel = value;
	}
	public ims.vo.LookupInstanceBean getVisitType()
	{
		return this.visittype;
	}
	public void setVisitType(ims.vo.LookupInstanceBean value)
	{
		this.visittype = value;
	}
	public ims.vo.LookupInstanceBean getEDConsultant()
	{
		return this.edconsultant;
	}
	public void setEDConsultant(ims.vo.LookupInstanceBean value)
	{
		this.edconsultant = value;
	}
	public ims.core.vo.beans.MemberOfStaffLiteVoBean getRegisteringMOS()
	{
		return this.registeringmos;
	}
	public void setRegisteringMOS(ims.core.vo.beans.MemberOfStaffLiteVoBean value)
	{
		this.registeringmos = value;
	}
	public ims.core.vo.beans.MemberOfStaffLiteVoBean getUpdatingMOS()
	{
		return this.updatingmos;
	}
	public void setUpdatingMOS(ims.core.vo.beans.MemberOfStaffLiteVoBean value)
	{
		this.updatingmos = value;
	}
	public String getComments()
	{
		return this.comments;
	}
	public void setComments(String value)
	{
		this.comments = value;
	}
	public ims.vo.LookupInstanceBean getPreferedLanguage()
	{
		return this.preferedlanguage;
	}
	public void setPreferedLanguage(ims.vo.LookupInstanceBean value)
	{
		this.preferedlanguage = value;
	}
	public ims.vo.LookupInstanceBean getIntrepreterRequired()
	{
		return this.intrepreterrequired;
	}
	public void setIntrepreterRequired(ims.vo.LookupInstanceBean value)
	{
		this.intrepreterrequired = value;
	}
	public ims.vo.LookupInstanceBean getDeptType()
	{
		return this.depttype;
	}
	public void setDeptType(ims.vo.LookupInstanceBean value)
	{
		this.depttype = value;
	}
	public Boolean getIsExpectedArrival()
	{
		return this.isexpectedarrival;
	}
	public void setIsExpectedArrival(Boolean value)
	{
		this.isexpectedarrival = value;
	}
	public Boolean getIsPrimaryCare()
	{
		return this.isprimarycare;
	}
	public void setIsPrimaryCare(Boolean value)
	{
		this.isprimarycare = value;
	}
	public ims.vo.LookupInstanceBean getBedTypeRequested()
	{
		return this.bedtyperequested;
	}
	public void setBedTypeRequested(ims.vo.LookupInstanceBean value)
	{
		this.bedtyperequested = value;
	}
	public Boolean getUsePrivateHealthInsurance()
	{
		return this.useprivatehealthinsurance;
	}
	public void setUsePrivateHealthInsurance(Boolean value)
	{
		this.useprivatehealthinsurance = value;
	}
	public ims.framework.utils.beans.DateTimeBean getEndOfRegistrationDateTime()
	{
		return this.endofregistrationdatetime;
	}
	public void setEndOfRegistrationDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.endofregistrationdatetime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAmbulanceHandoverDateTime()
	{
		return this.ambulancehandoverdatetime;
	}
	public void setAmbulanceHandoverDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.ambulancehandoverdatetime = value;
	}
	public ims.vo.LookupInstanceBean getAmbulanceDelayReason()
	{
		return this.ambulancedelayreason;
	}
	public void setAmbulanceDelayReason(ims.vo.LookupInstanceBean value)
	{
		this.ambulancedelayreason = value;
	}
	public String getCustomID()
	{
		return this.customid;
	}
	public void setCustomID(String value)
	{
		this.customid = value;
	}
	public ims.vo.LookupInstanceBean getAccomodationRequestedType()
	{
		return this.accomodationrequestedtype;
	}
	public void setAccomodationRequestedType(ims.vo.LookupInstanceBean value)
	{
		this.accomodationrequestedtype = value;
	}
	public String getAmbulanceDelayReasonComment()
	{
		return this.ambulancedelayreasoncomment;
	}
	public void setAmbulanceDelayReasonComment(String value)
	{
		this.ambulancedelayreasoncomment = value;
	}
	public ims.vo.LookupInstanceBean getRequiresSignOff()
	{
		return this.requiressignoff;
	}
	public void setRequiresSignOff(ims.vo.LookupInstanceBean value)
	{
		this.requiressignoff = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean arrivaldatetime;
	private ims.framework.utils.beans.DateTimeBean registrationdatetime;
	private ims.framework.utils.beans.DateTimeBean dischargedatetime;
	private ims.vo.LookupInstanceBean attendancetype;
	private ims.vo.LookupInstanceBean emergencydepttype;
	private ims.vo.LookupInstanceBean modeofarrival;
	private ims.vo.LookupInstanceBean accompaniedby;
	private ims.vo.RefVoBean registrationlocation;
	private ims.core.vo.beans.CareContextShortVoBean carecontext;
	private ims.vo.RefVoBean emergencyepisode;
	private ims.vo.LookupInstanceBean outcome;
	private String destination;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean episode;
	private ims.framework.utils.beans.DateTimeBean ambulancearrivaldatetime;
	private String ambulancejobno;
	private Integer ageatattendance;
	private ims.vo.LookupInstanceBean urgencylevel;
	private ims.vo.LookupInstanceBean visittype;
	private ims.vo.LookupInstanceBean edconsultant;
	private ims.core.vo.beans.MemberOfStaffLiteVoBean registeringmos;
	private ims.core.vo.beans.MemberOfStaffLiteVoBean updatingmos;
	private String comments;
	private ims.vo.LookupInstanceBean preferedlanguage;
	private ims.vo.LookupInstanceBean intrepreterrequired;
	private ims.vo.LookupInstanceBean depttype;
	private Boolean isexpectedarrival;
	private Boolean isprimarycare;
	private ims.vo.LookupInstanceBean bedtyperequested;
	private Boolean useprivatehealthinsurance;
	private ims.framework.utils.beans.DateTimeBean endofregistrationdatetime;
	private ims.framework.utils.beans.DateTimeBean ambulancehandoverdatetime;
	private ims.vo.LookupInstanceBean ambulancedelayreason;
	private String customid;
	private ims.vo.LookupInstanceBean accomodationrequestedtype;
	private String ambulancedelayreasoncomment;
	private ims.vo.LookupInstanceBean requiressignoff;
}
