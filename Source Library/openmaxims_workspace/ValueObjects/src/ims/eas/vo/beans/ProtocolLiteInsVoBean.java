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

package ims.eas.vo.beans;

public class ProtocolLiteInsVoBean extends ims.vo.ValueObjectBean
{
	public ProtocolLiteInsVoBean()
	{
	}
	public ProtocolLiteInsVoBean(ims.eas.vo.ProtocolLiteInsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.protocolname = vo.getProtocolName();
		this.treatmentsite = vo.getTreatmentSite() == null ? null : (ims.eas.vo.beans.TreatmentSitesVoBean)vo.getTreatmentSite().getBean();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.phases = vo.getPhases() == null ? null : vo.getPhases().getBeanCollection();
		this.clintrialprotocol = vo.getClinTrialProtocol();
		this.clinicaltrial = vo.getClinicalTrial() == null ? null : (ims.vo.LookupInstanceBean)vo.getClinicalTrial().getBean();
		this.primarytumour = vo.getPrimaryTumour() == null ? null : (ims.eas.vo.beans.PrimaryTumourNameVoBean)vo.getPrimaryTumour().getBean();
		this.appropcccl = vo.getAppropCCCL() == null ? null : (ims.vo.LookupInstanceBean)vo.getAppropCCCL().getBean();
		this.conssessdefault = vo.getConsSessDefault() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsSessDefault().getBean();
		this.conssessrequired = vo.getConsSessRequired() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsSessRequired().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.eas.vo.ProtocolLiteInsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.protocolname = vo.getProtocolName();
		this.treatmentsite = vo.getTreatmentSite() == null ? null : (ims.eas.vo.beans.TreatmentSitesVoBean)vo.getTreatmentSite().getBean(map);
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.phases = vo.getPhases() == null ? null : vo.getPhases().getBeanCollection();
		this.clintrialprotocol = vo.getClinTrialProtocol();
		this.clinicaltrial = vo.getClinicalTrial() == null ? null : (ims.vo.LookupInstanceBean)vo.getClinicalTrial().getBean();
		this.primarytumour = vo.getPrimaryTumour() == null ? null : (ims.eas.vo.beans.PrimaryTumourNameVoBean)vo.getPrimaryTumour().getBean(map);
		this.appropcccl = vo.getAppropCCCL() == null ? null : (ims.vo.LookupInstanceBean)vo.getAppropCCCL().getBean();
		this.conssessdefault = vo.getConsSessDefault() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsSessDefault().getBean();
		this.conssessrequired = vo.getConsSessRequired() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsSessRequired().getBean();
	}

	public ims.eas.vo.ProtocolLiteInsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.eas.vo.ProtocolLiteInsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.eas.vo.ProtocolLiteInsVo vo = null;
		if(map != null)
			vo = (ims.eas.vo.ProtocolLiteInsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.eas.vo.ProtocolLiteInsVo();
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
	public String getProtocolName()
	{
		return this.protocolname;
	}
	public void setProtocolName(String value)
	{
		this.protocolname = value;
	}
	public ims.eas.vo.beans.TreatmentSitesVoBean getTreatmentSite()
	{
		return this.treatmentsite;
	}
	public void setTreatmentSite(ims.eas.vo.beans.TreatmentSitesVoBean value)
	{
		this.treatmentsite = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public ims.eas.vo.beans.ProtocolPhaseVoBean[] getPhases()
	{
		return this.phases;
	}
	public void setPhases(ims.eas.vo.beans.ProtocolPhaseVoBean[] value)
	{
		this.phases = value;
	}
	public Boolean getClinTrialProtocol()
	{
		return this.clintrialprotocol;
	}
	public void setClinTrialProtocol(Boolean value)
	{
		this.clintrialprotocol = value;
	}
	public ims.vo.LookupInstanceBean getClinicalTrial()
	{
		return this.clinicaltrial;
	}
	public void setClinicalTrial(ims.vo.LookupInstanceBean value)
	{
		this.clinicaltrial = value;
	}
	public ims.eas.vo.beans.PrimaryTumourNameVoBean getPrimaryTumour()
	{
		return this.primarytumour;
	}
	public void setPrimaryTumour(ims.eas.vo.beans.PrimaryTumourNameVoBean value)
	{
		this.primarytumour = value;
	}
	public ims.vo.LookupInstanceBean getAppropCCCL()
	{
		return this.appropcccl;
	}
	public void setAppropCCCL(ims.vo.LookupInstanceBean value)
	{
		this.appropcccl = value;
	}
	public ims.vo.LookupInstanceBean getConsSessDefault()
	{
		return this.conssessdefault;
	}
	public void setConsSessDefault(ims.vo.LookupInstanceBean value)
	{
		this.conssessdefault = value;
	}
	public ims.vo.LookupInstanceBean getConsSessRequired()
	{
		return this.conssessrequired;
	}
	public void setConsSessRequired(ims.vo.LookupInstanceBean value)
	{
		this.conssessrequired = value;
	}

	private Integer id;
	private int version;
	private String protocolname;
	private ims.eas.vo.beans.TreatmentSitesVoBean treatmentsite;
	private ims.vo.LookupInstanceBean status;
	private ims.eas.vo.beans.ProtocolPhaseVoBean[] phases;
	private Boolean clintrialprotocol;
	private ims.vo.LookupInstanceBean clinicaltrial;
	private ims.eas.vo.beans.PrimaryTumourNameVoBean primarytumour;
	private ims.vo.LookupInstanceBean appropcccl;
	private ims.vo.LookupInstanceBean conssessdefault;
	private ims.vo.LookupInstanceBean conssessrequired;
}