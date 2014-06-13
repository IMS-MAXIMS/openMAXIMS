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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.icp.vo.beans;

public class PatientICPLiteVoBean extends ims.vo.ValueObjectBean
{
	public PatientICPLiteVoBean()
	{
	}
	public PatientICPLiteVoBean(ims.icp.vo.PatientICPLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.hasoutstandingadminactions = vo.getHasOutstandingAdminActions();
		this.hasoutstandingnursingactions = vo.getHasOutstandingNursingActions();
		this.hasoutstandingphysioactions = vo.getHasOutstandingPhysioActions();
		this.hasoutstandingclinicalactions = vo.getHasOutstandingClinicalActions();
		this.icp = vo.getICP() == null ? null : (ims.icp.vo.beans.ICPLiteVoBean)vo.getICP().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.icp.vo.PatientICPLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.hasoutstandingadminactions = vo.getHasOutstandingAdminActions();
		this.hasoutstandingnursingactions = vo.getHasOutstandingNursingActions();
		this.hasoutstandingphysioactions = vo.getHasOutstandingPhysioActions();
		this.hasoutstandingclinicalactions = vo.getHasOutstandingClinicalActions();
		this.icp = vo.getICP() == null ? null : (ims.icp.vo.beans.ICPLiteVoBean)vo.getICP().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
	}

	public ims.icp.vo.PatientICPLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.icp.vo.PatientICPLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.icp.vo.PatientICPLiteVo vo = null;
		if(map != null)
			vo = (ims.icp.vo.PatientICPLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.icp.vo.PatientICPLiteVo();
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
	public Boolean getHasOutstandingAdminActions()
	{
		return this.hasoutstandingadminactions;
	}
	public void setHasOutstandingAdminActions(Boolean value)
	{
		this.hasoutstandingadminactions = value;
	}
	public Boolean getHasOutstandingNursingActions()
	{
		return this.hasoutstandingnursingactions;
	}
	public void setHasOutstandingNursingActions(Boolean value)
	{
		this.hasoutstandingnursingactions = value;
	}
	public Boolean getHasOutstandingPhysioActions()
	{
		return this.hasoutstandingphysioactions;
	}
	public void setHasOutstandingPhysioActions(Boolean value)
	{
		this.hasoutstandingphysioactions = value;
	}
	public Boolean getHasOutstandingClinicalActions()
	{
		return this.hasoutstandingclinicalactions;
	}
	public void setHasOutstandingClinicalActions(Boolean value)
	{
		this.hasoutstandingclinicalactions = value;
	}
	public ims.icp.vo.beans.ICPLiteVoBean getICP()
	{
		return this.icp;
	}
	public void setICP(ims.icp.vo.beans.ICPLiteVoBean value)
	{
		this.icp = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}

	private Integer id;
	private int version;
	private Boolean hasoutstandingadminactions;
	private Boolean hasoutstandingnursingactions;
	private Boolean hasoutstandingphysioactions;
	private Boolean hasoutstandingclinicalactions;
	private ims.icp.vo.beans.ICPLiteVoBean icp;
	private ims.vo.RefVoBean carecontext;
}