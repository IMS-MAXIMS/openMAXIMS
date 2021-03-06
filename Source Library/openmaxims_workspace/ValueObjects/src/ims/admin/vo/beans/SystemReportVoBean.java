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

package ims.admin.vo.beans;

public class SystemReportVoBean extends ims.vo.ValueObjectBean
{
	public SystemReportVoBean()
	{
	}
	public SystemReportVoBean(ims.admin.vo.SystemReportVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.reportname = vo.getReportName();
		this.reportdescription = vo.getReportDescription();
		this.isactive = vo.getIsActive();
		this.imsid = vo.getImsId();
		this.exportfilename = vo.getExportFileName();
		this.queryeditable = vo.getQueryEditable();
		this.templateeditable = vo.getTemplateEditable();
		this.lastdeployment = vo.getLastDeployment() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLastDeployment().getBean();
		this.lastupdated = vo.getLastUpdated() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLastUpdated().getBean();
		this.templates = vo.getTemplates() == null ? null : vo.getTemplates().getBeanCollection();
		this.reportxml = vo.getReportXml();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.SystemReportVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.reportname = vo.getReportName();
		this.reportdescription = vo.getReportDescription();
		this.isactive = vo.getIsActive();
		this.imsid = vo.getImsId();
		this.exportfilename = vo.getExportFileName();
		this.queryeditable = vo.getQueryEditable();
		this.templateeditable = vo.getTemplateEditable();
		this.lastdeployment = vo.getLastDeployment() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLastDeployment().getBean();
		this.lastupdated = vo.getLastUpdated() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLastUpdated().getBean();
		this.templates = vo.getTemplates() == null ? null : vo.getTemplates().getBeanCollection();
		this.reportxml = vo.getReportXml();
	}

	public ims.admin.vo.SystemReportVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.admin.vo.SystemReportVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.SystemReportVo vo = null;
		if(map != null)
			vo = (ims.admin.vo.SystemReportVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.admin.vo.SystemReportVo();
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
	public String getReportName()
	{
		return this.reportname;
	}
	public void setReportName(String value)
	{
		this.reportname = value;
	}
	public String getReportDescription()
	{
		return this.reportdescription;
	}
	public void setReportDescription(String value)
	{
		this.reportdescription = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Integer getImsId()
	{
		return this.imsid;
	}
	public void setImsId(Integer value)
	{
		this.imsid = value;
	}
	public String getExportFileName()
	{
		return this.exportfilename;
	}
	public void setExportFileName(String value)
	{
		this.exportfilename = value;
	}
	public Boolean getQueryEditable()
	{
		return this.queryeditable;
	}
	public void setQueryEditable(Boolean value)
	{
		this.queryeditable = value;
	}
	public Boolean getTemplateEditable()
	{
		return this.templateeditable;
	}
	public void setTemplateEditable(Boolean value)
	{
		this.templateeditable = value;
	}
	public ims.framework.utils.beans.DateTimeBean getLastDeployment()
	{
		return this.lastdeployment;
	}
	public void setLastDeployment(ims.framework.utils.beans.DateTimeBean value)
	{
		this.lastdeployment = value;
	}
	public ims.framework.utils.beans.DateTimeBean getLastUpdated()
	{
		return this.lastupdated;
	}
	public void setLastUpdated(ims.framework.utils.beans.DateTimeBean value)
	{
		this.lastupdated = value;
	}
	public ims.core.vo.beans.TemplateBoLiteVoBean[] getTemplates()
	{
		return this.templates;
	}
	public void setTemplates(ims.core.vo.beans.TemplateBoLiteVoBean[] value)
	{
		this.templates = value;
	}
	public String getReportXml()
	{
		return this.reportxml;
	}
	public void setReportXml(String value)
	{
		this.reportxml = value;
	}

	private Integer id;
	private int version;
	private String reportname;
	private String reportdescription;
	private Boolean isactive;
	private Integer imsid;
	private String exportfilename;
	private Boolean queryeditable;
	private Boolean templateeditable;
	private ims.framework.utils.beans.DateTimeBean lastdeployment;
	private ims.framework.utils.beans.DateTimeBean lastupdated;
	private ims.core.vo.beans.TemplateBoLiteVoBean[] templates;
	private String reportxml;
}
