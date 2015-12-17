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


import ims.domain.DomainSession;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.impl.DomainImpl;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.scheduling.vo.ProfileShortVo;
import ims.scheduling.vo.Sch_ProfileRefVo;

public class SessionGenerationHelper extends DomainImpl implements ISessionGenerationHelper
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProfileShortVo profile;
	private DomainSession session;
		
	public SessionGenerationHelper(ProfileShortVo voProfileToGen)
	{
		this.profile = voProfileToGen;
		
	}
	// used to get the instantiated Domain Impl class
	protected Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		
		DomainSession sess = ims.scheduler.DomainSession.getSession();
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		
		return factory.create(implClass, sess);
	}
	
	public Integer generateSessionsForProfile(ProfileShortVo voProfile, DomainSession domSession) throws DomainInterfaceException
	{
		this.profile = voProfile;
		this.session = domSession;

		
		Date profileLastGenDate = voProfile.getLastGenDate();
		//int existingSessions = countSessionsForProfile(this.profile);
				
		Date fromDate =  new Date();
		if (profileLastGenDate != null && (profileLastGenDate.equals(fromDate) || (profileLastGenDate.isLessThan(fromDate) && profileLastGenDate.isGreaterOrEqualThan(fromDate.addDay(1)))))
		{	
			fromDate = ((Date) profileLastGenDate.clone()).addDay(1);
		}	
		else if (voProfile.getEffFrm().isGreaterOrEqualThan(fromDate))
		{	
			fromDate = 	 (Date) voProfile.getEffFrm().clone();
		}
		
		Date tempToDate = ((Date) fromDate.clone()).addDay(voProfile.getAutoGeneratePeriod().intValue()*7);
		
		if (voProfile.getEffToIsNotNull() && tempToDate.isGreaterThan(voProfile.getEffTo()))
			tempToDate = (Date) voProfile.getEffTo().clone();

		/*if (profileLastGenDate != null && profileLastGenDate.isLessOrEqualThan(new Date()) && fromDate.isLessOrEqualThan(profileLastGenDate))
		{			
			if(existingSessions > 0)
			{
				throw new DomainInterfaceException("Generation Error - There are existing Sessions for this Profile. It is not possible to generate sessions for the same dates.");

			}	
		}*/

		return generateSessionsForProfile(this.profile, fromDate, tempToDate, this.session);
	}

	public Integer generateSessions(ProfileShortVo profile, Date dateFrom,	Date dateTo, DomainSession sess) throws DomainInterfaceException 
	{
		return generateSessionsForProfile(profile, dateFrom, dateTo, sess);
		
	}
	private Integer generateSessionsForProfile(ProfileShortVo voProf, Date fromDate, Date toDate, DomainSession sess) throws DomainInterfaceException
	{
		try
		{
			//Class<?> implClass = Class.forName("ims.scheduling.domain.impl.GenerateSessionsImpl");
			 ISessionGenerationHelper impl = (ISessionGenerationHelper) getDomainImpl("ims.scheduling.domain.impl.GenerateSessionsImpl");
			return impl.generateSessions(profile, fromDate, toDate, session);
		}
		catch (Exception e)
		{
			//Log the exception in system, should be fine
			createSystemLogEntry(SystemLogType.APPLICATION, SystemLogLevel.ERROR, "Class Cast exception has occured.Please check log file for: " + new DateTime().toString(DateTimeFormat.STANDARD, true) + " timestamp.");
		}
		
		return 0;
	}
	
	public Integer countSessionsForProfile(Sch_ProfileRefVo profileRefVo)
	{
		try
		{
			//Class<?> implClass = Class.forName("ims.scheduling.domain.impl.GenerateSessionsImpl");
			ISessionGenerationHelper impl = (ISessionGenerationHelper) getDomainImpl("ims.scheduling.domain.impl.GenerateSessionsImpl");
			return impl.countSessionsForProfile(profileRefVo);
		}
		catch (Exception e)
		{
			//Log the exception in system, should be fine
			createSystemLogEntry(SystemLogType.APPLICATION, SystemLogLevel.ERROR, "Class Cast exception has occured.Please check log file for: " + new DateTime().toString(DateTimeFormat.STANDARD, true) + " timestamp.");
		}
		
		return 0;
	}
}
