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
package ims.admin.helper;

import ims.admin.domain.DischargeSummaryScheduleSTHKForm;
import ims.admin.domain.impl.DischargeSummaryScheduleSTHKFormImpl;
import ims.clinical.vo.DischargeSummaryScheduleVo;
import ims.clinical.vo.DischargeSummaryScheduleVoCollection;
import ims.domain.impl.DomainImplFlyweightFactory;
import java.util.Date;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.quartz.JobDetail;
import org.quartz.ObjectAlreadyExistsException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class BatchScheduleSTHKServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public void init()throws ServletException
	{					
		try 
		{
			DischargeSummaryScheduleSTHKForm impl = (DischargeSummaryScheduleSTHKForm)DomainImplFlyweightFactory.getInstance().create(DischargeSummaryScheduleSTHKFormImpl.class, ims.domain.DomainSession.getSession());
			DischargeSummaryScheduleVoCollection jobs = impl.getJobs();			
									
			Properties properties = QuartzProperties.getProperties();
			if( properties == null)
			{
				System.out.println("Quartz start without property file");
			}
			
			if (jobs != null)
			{
				for (int i = 0 ; i < jobs.size() ; i++)
				{
					DischargeSummaryScheduleVo job = jobs.get(i);
					
					String  interval = job.getRepeatInterval();
					XStream xS = new XStream(new DomDriver());
					Object repeatInterval = xS.fromXML(interval);
					
					SchedulerFactory sf = new StdSchedulerFactory(properties);					
					long ctime = System.currentTimeMillis();
					
					Scheduler sched;
					try 
					{
						sched = sf.getScheduler();						
						if (!sched.isStarted())	{
							sched.start();
						}						
						
						JobDetail jd = null;
						SimpleTrigger simpleCron = null;						
						
						try {
							jd = new JobDetail(job.getJobType().toString(), DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName(), DischargeSummaryScheduleSTHKFormImpl.class);							
							jd.setRequestsRecovery(true);
							jd.setDescription(job.getJobType().toString());							
							
							simpleCron = new SimpleTrigger(job.getJobType().toString(), new Date(), null, SimpleTrigger.REPEAT_INDEFINITELY, repeatInterval != null ? Long.parseLong(repeatInterval.toString()) : 0);
							simpleCron.setStartTime(new Date(ctime));
							simpleCron.setPriority(5);							
							
							sched.scheduleJob(jd, simpleCron);
						}
						catch (ObjectAlreadyExistsException e) 
						{
							//If Job Exist														 
							 Trigger currentTrigger = (sched.getTriggersOfJob(job.getJobType().toString(), DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName()))[0];
							 
							 if (currentTrigger != null)
							 {
								 Date lastRun = currentTrigger.getPreviousFireTime();
								 Date nextRun = currentTrigger.getNextFireTime();
								 Date currentDate = new Date();
								 
								 if (currentDate.compareTo(nextRun) > 1)
								 {
									//Job zombie in database: re-schedule it 							 
									 System.out.println("Delete old job : lastRun: " + lastRun);
									 sched.deleteJob(job.getJobType().toString(), DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName());  
									 sched.scheduleJob(jd, simpleCron);
									 System.out.println("Job re-scheduled : currentDate:" + currentDate + ", next fire time:" + nextRun);								
								 }
							 }
							 else
							 {
								 System.out.println("No trigger register for existing job");
							 }
							 
							 continue;
						}
					}
					catch (SchedulerException err)
					{
						err.printStackTrace();
					}
				}
			}
		} 
		catch (InstantiationException err) 
		{
			err.printStackTrace();
		} 
		catch (IllegalAccessException err) 
		{		
			err.printStackTrace();
		} 
		catch (Exception err) 
		{		
			err.printStackTrace();
		}		
	}
}
		
