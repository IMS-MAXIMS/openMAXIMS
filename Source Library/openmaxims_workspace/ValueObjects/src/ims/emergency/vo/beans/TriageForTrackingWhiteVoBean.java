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

public class TriageForTrackingWhiteVoBean extends ims.vo.ValueObjectBean
{
	public TriageForTrackingWhiteVoBean()
	{
	}
	public TriageForTrackingWhiteVoBean(ims.emergency.vo.TriageForTrackingWhiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.mainpresentingproblem = vo.getMainPresentingProblem() == null ? null : (ims.emergency.vo.beans.PatientProblemForClinicianWorklistVoBean)vo.getMainPresentingProblem().getBean();
		this.attendance = vo.getAttendance() == null ? null : new ims.vo.RefVoBean(vo.getAttendance().getBoId(), vo.getAttendance().getBoVersion());
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.currenttriagepriority = vo.getCurrentTriagePriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentTriagePriority().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.TriageForTrackingWhiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.mainpresentingproblem = vo.getMainPresentingProblem() == null ? null : (ims.emergency.vo.beans.PatientProblemForClinicianWorklistVoBean)vo.getMainPresentingProblem().getBean(map);
		this.attendance = vo.getAttendance() == null ? null : new ims.vo.RefVoBean(vo.getAttendance().getBoId(), vo.getAttendance().getBoVersion());
		this.episode = vo.getEpisode() == null ? null : new ims.vo.RefVoBean(vo.getEpisode().getBoId(), vo.getEpisode().getBoVersion());
		this.currenttriagepriority = vo.getCurrentTriagePriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentTriagePriority().getBean();
	}

	public ims.emergency.vo.TriageForTrackingWhiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.TriageForTrackingWhiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.TriageForTrackingWhiteVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.TriageForTrackingWhiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.TriageForTrackingWhiteVo();
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
	public ims.emergency.vo.beans.PatientProblemForClinicianWorklistVoBean getMainPresentingProblem()
	{
		return this.mainpresentingproblem;
	}
	public void setMainPresentingProblem(ims.emergency.vo.beans.PatientProblemForClinicianWorklistVoBean value)
	{
		this.mainpresentingproblem = value;
	}
	public ims.vo.RefVoBean getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.vo.RefVoBean value)
	{
		this.attendance = value;
	}
	public ims.vo.RefVoBean getEpisode()
	{
		return this.episode;
	}
	public void setEpisode(ims.vo.RefVoBean value)
	{
		this.episode = value;
	}
	public ims.vo.LookupInstanceBean getCurrentTriagePriority()
	{
		return this.currenttriagepriority;
	}
	public void setCurrentTriagePriority(ims.vo.LookupInstanceBean value)
	{
		this.currenttriagepriority = value;
	}

	private Integer id;
	private int version;
	private ims.emergency.vo.beans.PatientProblemForClinicianWorklistVoBean mainpresentingproblem;
	private ims.vo.RefVoBean attendance;
	private ims.vo.RefVoBean episode;
	private ims.vo.LookupInstanceBean currenttriagepriority;
}
