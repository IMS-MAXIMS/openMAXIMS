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

package ims.admin.vo.beans;

public class AppTopButtonVoBean extends ims.vo.ValueObjectBean
{
	public AppTopButtonVoBean()
	{
	}
	public AppTopButtonVoBean(ims.admin.vo.AppTopButtonVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.text = vo.getText();
		this.action = vo.getAction() == null ? null : (ims.vo.LookupInstanceBean)vo.getAction().getBean();
		this.buildin = vo.getBuildIn();
		this.form = vo.getForm() == null ? null : (ims.framework.utils.beans.FormNameBean)vo.getForm().getBean();
		this.url = vo.getURL();
		this.alwaysenabled = vo.getAlwaysEnabled();
		this.enabled = vo.getEnabled();
		this.contextdependent = vo.getContextDependent();
		this.patientmustbeselected = vo.getPatientMustBeSelected();
		this.displaymaximisebutton = vo.getDisplayMaximiseButton();
		this.displayclosebutton = vo.getDisplayCloseButton();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.AppTopButtonVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.text = vo.getText();
		this.action = vo.getAction() == null ? null : (ims.vo.LookupInstanceBean)vo.getAction().getBean();
		this.buildin = vo.getBuildIn();
		this.form = vo.getForm() == null ? null : (ims.framework.utils.beans.FormNameBean)vo.getForm().getBean();
		this.url = vo.getURL();
		this.alwaysenabled = vo.getAlwaysEnabled();
		this.enabled = vo.getEnabled();
		this.contextdependent = vo.getContextDependent();
		this.patientmustbeselected = vo.getPatientMustBeSelected();
		this.displaymaximisebutton = vo.getDisplayMaximiseButton();
		this.displayclosebutton = vo.getDisplayCloseButton();
	}

	public ims.admin.vo.AppTopButtonVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.admin.vo.AppTopButtonVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.AppTopButtonVo vo = null;
		if(map != null)
			vo = (ims.admin.vo.AppTopButtonVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.admin.vo.AppTopButtonVo();
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
	public String getText()
	{
		return this.text;
	}
	public void setText(String value)
	{
		this.text = value;
	}
	public ims.vo.LookupInstanceBean getAction()
	{
		return this.action;
	}
	public void setAction(ims.vo.LookupInstanceBean value)
	{
		this.action = value;
	}
	public Integer getBuildIn()
	{
		return this.buildin;
	}
	public void setBuildIn(Integer value)
	{
		this.buildin = value;
	}
	public ims.framework.utils.beans.FormNameBean getForm()
	{
		return this.form;
	}
	public void setForm(ims.framework.utils.beans.FormNameBean value)
	{
		this.form = value;
	}
	public String getURL()
	{
		return this.url;
	}
	public void setURL(String value)
	{
		this.url = value;
	}
	public Boolean getAlwaysEnabled()
	{
		return this.alwaysenabled;
	}
	public void setAlwaysEnabled(Boolean value)
	{
		this.alwaysenabled = value;
	}
	public Boolean getEnabled()
	{
		return this.enabled;
	}
	public void setEnabled(Boolean value)
	{
		this.enabled = value;
	}
	public Boolean getContextDependent()
	{
		return this.contextdependent;
	}
	public void setContextDependent(Boolean value)
	{
		this.contextdependent = value;
	}
	public Boolean getPatientMustBeSelected()
	{
		return this.patientmustbeselected;
	}
	public void setPatientMustBeSelected(Boolean value)
	{
		this.patientmustbeselected = value;
	}
	public Boolean getDisplayMaximiseButton()
	{
		return this.displaymaximisebutton;
	}
	public void setDisplayMaximiseButton(Boolean value)
	{
		this.displaymaximisebutton = value;
	}
	public Boolean getDisplayCloseButton()
	{
		return this.displayclosebutton;
	}
	public void setDisplayCloseButton(Boolean value)
	{
		this.displayclosebutton = value;
	}

	private Integer id;
	private int version;
	private String text;
	private ims.vo.LookupInstanceBean action;
	private Integer buildin;
	private ims.framework.utils.beans.FormNameBean form;
	private String url;
	private Boolean alwaysenabled;
	private Boolean enabled;
	private Boolean contextdependent;
	private Boolean patientmustbeselected;
	private Boolean displaymaximisebutton;
	private Boolean displayclosebutton;
}
