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
package ims.admin.helper;

import java.util.List;

import javax.naming.NamingException;

import ims.admin.vo.ConfiguredJobVo;
import ims.admin.vo.domain.ConfiguredJobVoAssembler;
import ims.admin.vo.domain.SystemJobVoAssembler;
import ims.core.configuration.domain.objects.ConfiguredJob;
import ims.core.vo.ConfiguredJobExecutionSummaryVo;
import ims.core.vo.ConfiguredJobExecutionTraceVo;
import ims.core.vo.ConfiguredJobExecutionTraceVoCollection;
import ims.core.vo.domain.ConfiguredJobExecutionSummaryVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.framework.interfaces.IScheduledJob;
import ims.framework.interfaces.ISchedulerServlet;
import ims.framework.interfaces.ITraceRecord;
import ims.scheduler.IScheduledJobsProvider;
import ims.scheduler.SchedulerJob;
import ims.scheduler.SchedulerJobExecutionSummary;
import ims.scheduler.SchedulerJobExecutionTrace;
 
public class ScheduledJobsProvider extends DomainImpl implements IScheduledJobsProvider 
{ 
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	public IScheduledJob[] getAvailableScheduledJobs() 
	{
		DomainFactory factory = getDomainFactory();
		String hqlString = "from SystemJob job where job.isActive = :ACTIVE";
		List jobs = factory.find(hqlString, new String[] {"ACTIVE"}, new Object[] {Boolean.TRUE});
		return SystemJobVoAssembler.createSystemJobVoCollectionFromSystemJob(jobs).toIScheduledJobArray();
	}
	public IConfiguredScheduledJob getConfiguredScheduledJob(int id) 
	{		
		return getConfiguredScheduledJobVo(id);
	}
	public ConfiguredJobVo getConfiguredScheduledJobVo(int id) 
	{		
		return ConfiguredJobVoAssembler.create((ConfiguredJob)getDomainFactory().getDomainObject(ConfiguredJob.class, id));
	}
	@SuppressWarnings("unchecked")
	public IConfiguredScheduledJob[] getConfiguredScheduledJobs() 
	{
		DomainFactory factory = getDomainFactory();
		String hqlString = "from ConfiguredJob as configuredJob where configuredJob.isActive = 1";
		List jobs = factory.find(hqlString, new String[] {}, new Object[] {});
		return ConfiguredJobVoAssembler.createConfiguredJobVoCollectionFromConfiguredJob(jobs).toIConfiguredScheduledJobArray();
	}
	public void saveExecutionSummaryAndTrace(IConfiguredScheduledJob job, SchedulerJobExecutionSummary summary, SchedulerJobExecutionTrace trace) 
	{
		ConfiguredJobExecutionSummaryVo record = new ConfiguredJobExecutionSummaryVo();
		
		record.setConfiguredJob(getConfiguredScheduledJobVo(job.getConfiguredScheduledJobID()));
		record.setStartDateTime(summary.getStartDateTime());
		record.setEndDateTime(summary.getEndDateTime());
		record.setMessage(summary.getMessage());
		record.setStatus(summary.getStatus().getId());
		ConfiguredJobExecutionTraceVoCollection traces = new ConfiguredJobExecutionTraceVoCollection();
		if(trace != null)
		{
			for(int x = 0; x < trace.getTrace().size(); x++)
			{
				ITraceRecord traceRecord = trace.getTrace().get(x);
				ConfiguredJobExecutionTraceVo item = new ConfiguredJobExecutionTraceVo();
				item.setDateTime(traceRecord.getDateTime());
				item.setMessage(traceRecord.getMessage());
				traces.add(item);				
			}
		}
		record.setTraces(traces);
		
		String[] errors = record.validate();
		if(errors != null && errors.length > 0)
		{
			throw new RuntimeException("Unable to save the scheduled job execution summary due to validation errors");
		}
		
		DomainFactory factory = getDomainFactory();
		try 
		{
			factory.save(ConfiguredJobExecutionSummaryVoAssembler.extractConfiguredJobExecutionSummary(factory, record));
		} 
		catch (StaleObjectException e) 
		{
			e.printStackTrace();
		}		
	}
	public void cleanUpConfiguredScheduledJobSettings(int id) 
	{
		IConfiguredScheduledJob job = getConfiguredScheduledJob(id);
		if(job != null)
		{
			String implName = job.getScheduledJob().getScheduledJobClassName();
			
			try 
			{
				Class impl = Class.forName(implName);
				SchedulerJob jobInstance = (SchedulerJob)impl.newInstance();
				jobInstance.cleanUpSettings(job);
			} 
			catch (Exception e) 
			{
				
			}
		}
	}
	
	private ISchedulerServlet getQuartzInstance()
	{
		try 
		{
			return ims.configuration.JNDI.getTaskSchedulerServlet();
		} 
		catch (NamingException e) 
		{		
			e.printStackTrace();
		}
		
		return null;
	}	
}
