// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class PathwayClockRTTStatusVoBean extends ims.vo.ValueObjectBean
{
	public PathwayClockRTTStatusVoBean()
	{
	}
	public PathwayClockRTTStatusVoBean(ims.RefMan.vo.PathwayClockRTTStatusVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.currentrttstatus = vo.getCurrentRTTStatus() == null ? null : new ims.vo.RefVoBean(vo.getCurrentRTTStatus().getBoId(), vo.getCurrentRTTStatus().getBoVersion());
		if(vo.getRTTStatusHistory() != null)
		{
			this.rttstatushistory = new ims.vo.RefVoBean[vo.getRTTStatusHistory().size()];
			for(int rttstatushistory_i = 0; rttstatushistory_i < vo.getRTTStatusHistory().size(); rttstatushistory_i++)
			{
				this.rttstatushistory[rttstatushistory_i] = new ims.vo.RefVoBean(vo.getRTTStatusHistory().get(rttstatushistory_i).getBoId(),vo.getRTTStatusHistory().get(rttstatushistory_i).getBoVersion());
			}
		}
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.PathwayClockRTTStatusVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.currentrttstatus = vo.getCurrentRTTStatus() == null ? null : new ims.vo.RefVoBean(vo.getCurrentRTTStatus().getBoId(), vo.getCurrentRTTStatus().getBoVersion());
		if(vo.getRTTStatusHistory() != null)
		{
			this.rttstatushistory = new ims.vo.RefVoBean[vo.getRTTStatusHistory().size()];
			for(int rttstatushistory_i = 0; rttstatushistory_i < vo.getRTTStatusHistory().size(); rttstatushistory_i++)
			{
				this.rttstatushistory[rttstatushistory_i] = new ims.vo.RefVoBean(vo.getRTTStatusHistory().get(rttstatushistory_i).getBoId(),vo.getRTTStatusHistory().get(rttstatushistory_i).getBoVersion());
			}
		}
	}

	public ims.RefMan.vo.PathwayClockRTTStatusVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.PathwayClockRTTStatusVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.PathwayClockRTTStatusVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.PathwayClockRTTStatusVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.PathwayClockRTTStatusVo();
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
	public ims.vo.RefVoBean getCurrentRTTStatus()
	{
		return this.currentrttstatus;
	}
	public void setCurrentRTTStatus(ims.vo.RefVoBean value)
	{
		this.currentrttstatus = value;
	}
	public ims.vo.RefVoBean[] getRTTStatusHistory()
	{
		return this.rttstatushistory;
	}
	public void setRTTStatusHistory(ims.vo.RefVoBean[] value)
	{
		this.rttstatushistory = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean currentrttstatus;
	private ims.vo.RefVoBean[] rttstatushistory;
}
