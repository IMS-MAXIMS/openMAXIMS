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

package ims.spinalinjuries.vo.beans;

public class RespExamBean extends ims.vo.ValueObjectBean
{
	public RespExamBean()
	{
	}
	public RespExamBean(ims.spinalinjuries.vo.RespExam vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.airentry = vo.getAirEntry();
		this.additionalfactors = vo.getAdditionalFactors();
		this.analysisofasses = vo.getAnalysisofAsses();
		this.assnotes = vo.getAssNotes();
		this.respexamobs = vo.getRespExamObs() == null ? null : (ims.spinalinjuries.vo.beans.RespExamObsBean)vo.getRespExamObs().getBean();
		this.respexamausc = vo.getRespExamAusc() == null ? null : (ims.spinalinjuries.vo.beans.RespExamAuscBean)vo.getRespExamAusc().getBean();
		this.respexamlungf = vo.getRespExamLungF() == null ? null : (ims.spinalinjuries.vo.beans.RespExamLungFBean)vo.getRespExamLungF().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.spinalinjuries.vo.RespExam vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.airentry = vo.getAirEntry();
		this.additionalfactors = vo.getAdditionalFactors();
		this.analysisofasses = vo.getAnalysisofAsses();
		this.assnotes = vo.getAssNotes();
		this.respexamobs = vo.getRespExamObs() == null ? null : (ims.spinalinjuries.vo.beans.RespExamObsBean)vo.getRespExamObs().getBean(map);
		this.respexamausc = vo.getRespExamAusc() == null ? null : (ims.spinalinjuries.vo.beans.RespExamAuscBean)vo.getRespExamAusc().getBean(map);
		this.respexamlungf = vo.getRespExamLungF() == null ? null : (ims.spinalinjuries.vo.beans.RespExamLungFBean)vo.getRespExamLungF().getBean(map);
	}

	public ims.spinalinjuries.vo.RespExam buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.spinalinjuries.vo.RespExam buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.spinalinjuries.vo.RespExam vo = null;
		if(map != null)
			vo = (ims.spinalinjuries.vo.RespExam)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.spinalinjuries.vo.RespExam();
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
	public Boolean getAirEntry()
	{
		return this.airentry;
	}
	public void setAirEntry(Boolean value)
	{
		this.airentry = value;
	}
	public String getAdditionalFactors()
	{
		return this.additionalfactors;
	}
	public void setAdditionalFactors(String value)
	{
		this.additionalfactors = value;
	}
	public String getAnalysisofAsses()
	{
		return this.analysisofasses;
	}
	public void setAnalysisofAsses(String value)
	{
		this.analysisofasses = value;
	}
	public String getAssNotes()
	{
		return this.assnotes;
	}
	public void setAssNotes(String value)
	{
		this.assnotes = value;
	}
	public ims.spinalinjuries.vo.beans.RespExamObsBean getRespExamObs()
	{
		return this.respexamobs;
	}
	public void setRespExamObs(ims.spinalinjuries.vo.beans.RespExamObsBean value)
	{
		this.respexamobs = value;
	}
	public ims.spinalinjuries.vo.beans.RespExamAuscBean getRespExamAusc()
	{
		return this.respexamausc;
	}
	public void setRespExamAusc(ims.spinalinjuries.vo.beans.RespExamAuscBean value)
	{
		this.respexamausc = value;
	}
	public ims.spinalinjuries.vo.beans.RespExamLungFBean getRespExamLungF()
	{
		return this.respexamlungf;
	}
	public void setRespExamLungF(ims.spinalinjuries.vo.beans.RespExamLungFBean value)
	{
		this.respexamlungf = value;
	}

	private Integer id;
	private int version;
	private Boolean airentry;
	private String additionalfactors;
	private String analysisofasses;
	private String assnotes;
	private ims.spinalinjuries.vo.beans.RespExamObsBean respexamobs;
	private ims.spinalinjuries.vo.beans.RespExamAuscBean respexamausc;
	private ims.spinalinjuries.vo.beans.RespExamLungFBean respexamlungf;
}
