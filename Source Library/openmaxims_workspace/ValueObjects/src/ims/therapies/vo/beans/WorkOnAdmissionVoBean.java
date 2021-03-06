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

package ims.therapies.vo.beans;

public class WorkOnAdmissionVoBean extends ims.vo.ValueObjectBean
{
	public WorkOnAdmissionVoBean()
	{
	}
	public WorkOnAdmissionVoBean(ims.therapies.vo.WorkOnAdmissionVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAuthoringCP().getBean();
		this.presentcareer = vo.getPresentCareer();
		this.pastqualifications = vo.getPastQualifications();
		this.employername = vo.getEmployerName();
		this.employeraddress = vo.getEmployerAddress();
		this.employerphone = vo.getEmployerPhone();
		this.benefitadvice = vo.getBenefitAdvice();
		this.worksiteassessment = vo.getWorkSiteAssessment() == null ? null : (ims.vo.LookupInstanceBean)vo.getWorkSiteAssessment().getBean();
		this.worksiteassesscomment = vo.getWorkSiteAssessComment();
		this.referdea = vo.getReferDEA() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferDEA().getBean();
		this.deacomment = vo.getDEAComment();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.WorkOnAdmissionVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAuthoringCP().getBean(map);
		this.presentcareer = vo.getPresentCareer();
		this.pastqualifications = vo.getPastQualifications();
		this.employername = vo.getEmployerName();
		this.employeraddress = vo.getEmployerAddress();
		this.employerphone = vo.getEmployerPhone();
		this.benefitadvice = vo.getBenefitAdvice();
		this.worksiteassessment = vo.getWorkSiteAssessment() == null ? null : (ims.vo.LookupInstanceBean)vo.getWorkSiteAssessment().getBean();
		this.worksiteassesscomment = vo.getWorkSiteAssessComment();
		this.referdea = vo.getReferDEA() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferDEA().getBean();
		this.deacomment = vo.getDEAComment();
	}

	public ims.therapies.vo.WorkOnAdmissionVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.therapies.vo.WorkOnAdmissionVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.WorkOnAdmissionVo vo = null;
		if(map != null)
			vo = (ims.therapies.vo.WorkOnAdmissionVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.therapies.vo.WorkOnAdmissionVo();
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
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.framework.utils.beans.DateTimeBean getAuthoringDateTime()
	{
		return this.authoringdatetime;
	}
	public void setAuthoringDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.authoringdatetime = value;
	}
	public ims.core.vo.beans.HcpBean getAuthoringCP()
	{
		return this.authoringcp;
	}
	public void setAuthoringCP(ims.core.vo.beans.HcpBean value)
	{
		this.authoringcp = value;
	}
	public String getPresentCareer()
	{
		return this.presentcareer;
	}
	public void setPresentCareer(String value)
	{
		this.presentcareer = value;
	}
	public String getPastQualifications()
	{
		return this.pastqualifications;
	}
	public void setPastQualifications(String value)
	{
		this.pastqualifications = value;
	}
	public String getEmployerName()
	{
		return this.employername;
	}
	public void setEmployerName(String value)
	{
		this.employername = value;
	}
	public String getEmployerAddress()
	{
		return this.employeraddress;
	}
	public void setEmployerAddress(String value)
	{
		this.employeraddress = value;
	}
	public String getEmployerPhone()
	{
		return this.employerphone;
	}
	public void setEmployerPhone(String value)
	{
		this.employerphone = value;
	}
	public String getBenefitAdvice()
	{
		return this.benefitadvice;
	}
	public void setBenefitAdvice(String value)
	{
		this.benefitadvice = value;
	}
	public ims.vo.LookupInstanceBean getWorkSiteAssessment()
	{
		return this.worksiteassessment;
	}
	public void setWorkSiteAssessment(ims.vo.LookupInstanceBean value)
	{
		this.worksiteassessment = value;
	}
	public String getWorkSiteAssessComment()
	{
		return this.worksiteassesscomment;
	}
	public void setWorkSiteAssessComment(String value)
	{
		this.worksiteassesscomment = value;
	}
	public ims.vo.LookupInstanceBean getReferDEA()
	{
		return this.referdea;
	}
	public void setReferDEA(ims.vo.LookupInstanceBean value)
	{
		this.referdea = value;
	}
	public String getDEAComment()
	{
		return this.deacomment;
	}
	public void setDEAComment(String value)
	{
		this.deacomment = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean carecontext;
	private ims.framework.utils.beans.DateTimeBean authoringdatetime;
	private ims.core.vo.beans.HcpBean authoringcp;
	private String presentcareer;
	private String pastqualifications;
	private String employername;
	private String employeraddress;
	private String employerphone;
	private String benefitadvice;
	private ims.vo.LookupInstanceBean worksiteassessment;
	private String worksiteassesscomment;
	private ims.vo.LookupInstanceBean referdea;
	private String deacomment;
}
