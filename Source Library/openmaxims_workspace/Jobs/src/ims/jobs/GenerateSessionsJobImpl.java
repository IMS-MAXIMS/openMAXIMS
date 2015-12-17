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
package ims.jobs;

import ims.admin.helper.SessionGenerationHelper;
import ims.domain.DomainSession;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.interfaces.IConfiguredScheduledJob;
import ims.scheduler.DomainFactoryBridge;
import ims.scheduler.SchedulerJobExecutionStatus;
import ims.scheduler.SchedulerJobExecutionSummary;
import ims.scheduling.domain.objects.ProfileGenerationSettings;
import ims.scheduling.vo.ProfileGenerationSettingsVo;
import ims.scheduling.vo.ProfileLiteVo;
import ims.scheduling.vo.ProfileSessionsGeneratedCountVo;
import ims.scheduling.vo.ProfileSessionsGeneratedCountVoCollection;
import ims.scheduling.vo.ProfileShortVo;
import ims.scheduling.vo.ProfileShortVoCollection;
import ims.scheduling.vo.domain.ProfileGenerationSettingsVoAssembler;
import ims.scheduling.vo.domain.ProfileShortVoAssembler;

import java.util.Calendar;
import java.util.List;

import org.quartz.JobExecutionException;

public final class GenerateSessionsJobImpl extends ims.scheduler.SchedulerJob
{
	private static int DEFAULT_AUTO_GENERATION_DAYS_INTERVAL = new Integer(0);
	private int	 	GeneratedSessionNo = 0;
	private int 	TotalGeneratedSessionNo = 0;
	
	@Override
	public SchedulerJobExecutionSummary doExecute() throws JobExecutionException
	{
		long start = System.currentTimeMillis();
		StringBuilder summaryMessage = new StringBuilder();
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());		
		summaryMessage.append("Started scheduled job at: " +  calendar.getTime());
		summaryMessage.append("\n");
		trace("Scheduled job was started successfully!");
		
		ProfileGenerationSettingsVo  job = getJobDetails();
		if (job == null)
		{
			throw new JobExecutionException("Job configuration is missing. Aborted execution at: " + calendar.getTime());
		}
		
		 ProfileShortVoCollection profileColl = getProfilesList();
		 
		 if (profileColl == null || profileColl.size() == 0)
		 {
			 summaryMessage.append("Scheduled job ended at: " +  calendar.getTime());
			 summaryMessage.append("\n");
			 summaryMessage.append("No sessions to generate!");
			 trace("Scheduled job has ended!");
			 return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
		 }
				
		 ProfileSessionsGeneratedCountVoCollection	coll = new ProfileSessionsGeneratedCountVoCollection();
		 ProfileSessionsGeneratedCountVo profileWithSessionsVo = new ProfileSessionsGeneratedCountVo();
		 int sessCounterForProfile = 0;
		 for (ProfileShortVo voProfile : profileColl)
		 {	
			 if (voProfile == null)
				 continue;
			 try
			 {
				 ims.admin.helper.SessionGenerationHelper helper = new SessionGenerationHelper(voProfile);
				 DomainSession session = DomainSession.getSession();								
				 sessCounterForProfile = helper.generateSessionsForProfile(voProfile, session);				 
				 profileWithSessionsVo = countSessionsForProfile(voProfile,sessCounterForProfile);			

			 }
			 catch (DomainInterfaceException ex)
			 {
				 profileWithSessionsVo.setErrorMessage(ex.getMessage()!= null && ex.getMessage().length() > 0 ? (ex.getMessage().length() > 500  ? ex.getMessage().substring(0, 499) : ex.getMessage()) : null);
			 }
			 catch(Exception e)
			 {
				 trace("Error occured while generating  sessions: " + e.getMessage());
				 e.printStackTrace();

				 summaryMessage.append("Scheduled job execution has failed!");
				 summaryMessage.append("\n");
				 summaryMessage.append("Total generated sessions: " + TotalGeneratedSessionNo); //WDEV-18840
				 return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.FAILED, e.getMessage());	
			 }
			 finally
			 {
				 coll.add(profileWithSessionsVo);
			 }
			 GeneratedSessionNo += sessCounterForProfile;			
		 }
		TotalGeneratedSessionNo += GeneratedSessionNo;
		 
		job.setSessionsCount(coll);
		saveJob(job);

		long end = System.currentTimeMillis();				
		
		calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());				
		summaryMessage.append("Scheduled job ended at: " +  calendar.getTime());
		summaryMessage.append("\n");
		
		int d = (int) (((end - start) / 1000) / 86400);
		int h = (int) (((end - start) / 1000) / 3600);
		int m = (int) ((((end - start) / 1000) / 60) % 60);
		int s = (int) (((end - start) / 1000) % 60);
		
		summaryMessage.append("Total time for execution: " + d + " days, " + h + " hours, " + m + " minutes, " + s + " seconds.");
		summaryMessage.append("\n");
		summaryMessage.append("Total number of generated sessions: " + TotalGeneratedSessionNo);
		summaryMessage.append("\n");
		summaryMessage.append("Scheduled job has completed successfully!");
		
		trace("Scheduled job has ended!");

		return new SchedulerJobExecutionSummary(SchedulerJobExecutionStatus.SUCCEEDED, summaryMessage.toString());
	}

	/*private int getProfileIndex(ProfileShortVo profileToGenVo, ProfileSessionsGeneratedCountVoCollection coll)
	{
		if (coll == null || coll.size() == 0 || profileToGenVo == null)
			return -1;
		for (int i=0; i<coll.size(); i++)
		{
			if (coll.get(i) != null && coll.get(i).getProfileIsNotNull() && coll.get(i).getProfile().getID_Sch_Profile().equals(profileToGenVo.getID_Sch_Profile()))
				return i;
		}
		return -1;
	}*/

	private ProfileSessionsGeneratedCountVo countSessionsForProfile(ProfileShortVo voProf, int generatedSessionNo)
	{
		ProfileSessionsGeneratedCountVo voProfileCount = new ProfileSessionsGeneratedCountVo();
		
		voProfileCount.setProfile((ProfileLiteVo)voProf);
		voProfileCount.setNumberOfSessionsGenerated(generatedSessionNo);
		
		return voProfileCount;
	}

	@Override
	public void cleanUpSettings(IConfiguredScheduledJob job) throws Exception
	{
		ProfileGenerationSettings  doProfileGenSettings = ProfileGenerationSettings.getProfileGenerationSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		
		if(doProfileGenSettings != null)
		{
			getDomainFactory().delete(doProfileGenSettings);
		}
	}
	private ProfileShortVoCollection getProfilesList()
	{
		DomainFactoryBridge domainFactory = getDomainFactory();
		
		String hqlQuery = " from Sch_Profile as profile where profile.isActive = :ACTIVE and profile.readyToGenerate = :READY_TO_GENERATE and (profile.autoGeneratePeriod is not null OR profile.autoGeneratePeriod <> :ZERO) and (profile.effTo is null or profile.effTo >= :TODAY) ORDER BY profile.name asc";
		
		List<?> profileList = domainFactory.find(hqlQuery, new String[]{"ACTIVE", "READY_TO_GENERATE", "ZERO", "TODAY"}, new Object[]{true, true, DEFAULT_AUTO_GENERATION_DAYS_INTERVAL, new java.util.Date()});
		
		if (profileList == null || profileList.isEmpty())
			return null;
		
		return ProfileShortVoAssembler.createProfileShortVoCollectionFromSch_Profile(profileList);
	}
	
	private ProfileGenerationSettingsVo getJobDetails() 
	{
		ProfileGenerationSettings  doProfileGenSettings = ProfileGenerationSettings.getProfileGenerationSettingsFromConfiguredJob(getDomainFactory(), super.getConfiguredJob().getConfiguredScheduledJobID());
		return ProfileGenerationSettingsVoAssembler.create(doProfileGenSettings);
	}
	private synchronized void saveJob(ProfileGenerationSettingsVo job)
	{
		if(job == null)
			return;
		
		DomainFactoryBridge factory = getDomainFactory();
		ProfileGenerationSettings doJob = ProfileGenerationSettingsVoAssembler.extractProfileGenerationSettings(factory, job);
		try 
		{
			factory.save(doJob);
		} 
		catch (StaleObjectException e) 
		{
			trace("Job details save failed! " + e.getMessage());
			return;
		}
	}
	
}
