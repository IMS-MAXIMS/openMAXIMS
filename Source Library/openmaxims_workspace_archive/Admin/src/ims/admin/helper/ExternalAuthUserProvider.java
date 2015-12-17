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

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ims.admin.vo.AppUserPasswordVo;
import ims.admin.vo.AppUserVo;
import ims.admin.vo.domain.AppUserPasswordVoAssembler;
import ims.admin.vo.domain.AppUserVoAssembler;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.Configuration;
import ims.core.configuration.domain.objects.AppUser;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.domain.DomainFactory;
import ims.domain.DomainSession;
import ims.domain.exceptions.DTODomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.dto.Connection;
import ims.dto.ConnectionFactoryManager;
import ims.dto.DTODomainImplementation;
import ims.dto.DtoErrorCode;
import ims.dto.Result;
import ims.dto.ResultException;
import ims.dto.client.App_users;
import ims.dto.client.User;
import ims.framework.exceptions.PasswordExpiredException;
import ims.framework.interfaces.IAppUser;
import ims.framework.interfaces.IUserProvider;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;

public class ExternalAuthUserProvider extends DTODomainImplementation implements IUserProvider
{
	private static final long serialVersionUID = 1L;
	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(ExternalAuthUserProvider.class);
	
	public static final int NOT_AUTHORISED=-14;
	public static final int LOGIN_FAILED=-15;
	public static final int ACCOUNT_EXPIRED=-30;
	public static final int PASSWORD_EXPIRED=-29;
	

	@SuppressWarnings("unchecked")
	public IAppUser getAppUser(String username, String password) throws Exception
	{
		if(!ConfigFlag.DOM.EXTERNAL_AUTHENTICATION.getValue())
		{
			// Standard authorisation as this is called when EXTERNAL_AUTHENTICATION is set to false
			String hql = "from AppUser user where user.username=:username and user.password=:password and user.isActive is true";
			List list = getDomainFactory().find(hql, new String[] { "username", "password" }, new Object[] { username, Configuration.getHash(password) } );
			if (list.size() == 0)
				return null;
			
			return AppUserVoAssembler.create((AppUser)list.get(0));
		}
		else
		{
			DomainFactory factory = getDomainFactory();
			
			String hql = "from AppUser user where user.username=:username and user.isActive is true";
			List list = factory.find(hql, new String[]{"username"}, new Object[]{username});
			if (list.size() == 0)
				return null;
			
			// If the record is there, and external authentication is set to true, we want
			// to authorise this user via the dto call
			// if external authentication is null or false, validate against the password
			AppUser domUser = (AppUser) list.get(0);   // Unique per name, so definitely only one returned
			if (domUser != null && ConfigFlag.DOM.EXTERNAL_AUTHENTICATION.getValue() == true)  // Check flag here!
			{
				// Verify with external i.e. dto
				try
				{
					Connection connection = ConnectionFactoryManager.getConnection(domUser.getUsername(), password, this.getDomainFactory().getDomainSession());
					// insert connection into domain session
					getSession().setAttribute(ims.dto.DTODomainImplementation.DTO_CONNECTION, connection);
				}
				catch (ResultException e)
				{
					Result res = e.getResult();
					switch (res.getId())
					{
						case LOGIN_FAILED:
							return null;
						
						case PASSWORD_EXPIRED:
							Calendar cal = Calendar.getInstance();
							cal.add(Calendar.DATE, -1);
							domUser.setPwdExpDate(cal.getTime());
							return AppUserVoAssembler.create(domUser);
							
						case ACCOUNT_EXPIRED:
							Calendar calAcc = Calendar.getInstance();
							calAcc.add(Calendar.DATE, -1);
							domUser.setEffectiveTo(calAcc.getTime());
							return AppUserVoAssembler.create(domUser);
					}
					
				}
				
				return (getDtoUser(factory, domUser));
			}
			else
			{
				// Verify password
				if (domUser.getPassword() == null || !domUser.getPassword().equals(password))
					return null;
			}
			
			return AppUserVoAssembler.create(domUser);
		}
	}	
	
	private IAppUser getDtoUser(DomainFactory factory, AppUser domUser) throws PasswordExpiredException 
	{
	
		User userRec=null;
		try
		{
			userRec = (User)super.getDTOInstance(User.class);
		}
		catch (ResultException e)
		{
			LOG.error("Error occurred getting DTOInstance. " + e.getMessage(), e);
			return null;
		}

		// Hearts User Service does not handle GET call, so we need to do a Insert, if duplicate error, try update
		userRec.Filter.User = domUser.getUsername();
		Result res = userRec.get();
		if (res != null && res.getId() < 0)
		{
			switch (res.getId())
			{
				case NOT_AUTHORISED:
					LOG.error("You are not authorised to logon to this application - please contact a Systems Administrator");
					return null;
				
				case ACCOUNT_EXPIRED:
					LOG.error("Your account has expired - please contact a Systems Administrator");
					return null;
					
				case PASSWORD_EXPIRED:
					throw new PasswordExpiredException("Password Has Expired");
					
				default:
					LOG.error("Error occurred retrieving user details from DTO server. (" + res.getId() + ")" + res.getMessage());
				    return null;
			}
		}
		
		try 
		{
			if (!userRec.DataCollection.get(0).Dateauthfr.equals(""))
			{
				Date authorisedFrom = new Date(userRec.DataCollection.get(0).Dateauthfr, DateFormat.ISO);
				domUser.setEffectiveFrom(authorisedFrom.getDate());
			}
			
			if (!userRec.DataCollection.get(0).Dateauthto.equals(""))
			{
				Date authorisedTo = new Date(userRec.DataCollection.get(0).Dateauthto, DateFormat.ISO);
				domUser.setEffectiveTo(authorisedTo.getDate());
			}
			
			if (!userRec.DataCollection.get(0).Daysleft.equals(""))
			{
				int daysLeft = new Integer(userRec.DataCollection.get(0).Daysleft).intValue();
				Date pwdExpDate = new Date();
				pwdExpDate.addDay(daysLeft);
				domUser.setPwdExpDate(pwdExpDate.getDate());

			}

			domUser.setIsActive(true);
			factory.save(domUser);  // Replicate Changes locally

		}
		catch (ParseException e) 
		{
			LOG.error("Invalid Date Values supplied - " + e.getMessage(), e);
		} 
		catch (StaleObjectException e) 
		{
			LOG.error("StaleObjectException replicating External User Locally " + e.getMessage(), e);
		}
		
		
		return AppUserVoAssembler.create(domUser);
	}

	
	public IAppUser getAppUser(String username) 
	{
		return AppUserVoAssembler.create(AppUser.getAppUserFromUsername(getDomainFactory(), username));
	}
	
	public String getUserRealName(IAppUser user)
	{
		if (user.getMosId() != null)
		{
			MemberOfStaff mos = (MemberOfStaff)getDomainFactory().getDomainObject(MemberOfStaff.class, user.getMosId());
			return mos.getName().toString();			
		}
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public IAppUser changePassword(IAppUser user, String newPassword) throws Exception
	{
		DomainFactory factory = getDomainFactory();
		AppUser domUser = (AppUser)factory.getDomainObject(AppUser.class, user.getUserId());
		java.util.Date date = domUser.getPwdExpDate();
		if (date != null)
		{
			Calendar cal = Calendar.getInstance();
			cal.setTime(new java.util.Date());
			cal.add(Calendar.DATE, ConfigFlag.GEN.PASSWD_EXP_INCREMENT.getValue());
			domUser.setPwdExpDate(cal.getTime());
		}

		
		// WDEV-14264 May need to replicate to both HEARTS and MAXIMS
		if (ConfigFlag.DTO.USER_REPLICATION_SERVICE.getValue().equals("USER"))
			changeHeartPassword(user, newPassword);
		else if (ConfigFlag.DTO.USER_REPLICATION_SERVICE.getValue().equals("BOTH"))
		{
			changeHeartPassword(user, newPassword);
			changeMaximsPassword(user, newPassword, domUser.getPwdExpDate());
		}
		else
			changeMaximsPassword(user, newPassword, domUser.getPwdExpDate());
		
		
		
		String currentEncodedPassord = domUser.getEncodedPassword();
		
		domUser.setPassword(Configuration.getHash(newPassword));	
		domUser.setEncodedPassword(Configuration.encryptPasswordWithCloak(newPassword));		
				
		List prev = domUser.getPreviousPasswords();
		if(prev == null)
			prev = new ArrayList();
		
		AppUserPasswordVo previousPassword = new AppUserPasswordVo();
		previousPassword.setDateTime(new DateTime());
		previousPassword.setEncodedPassword(currentEncodedPassord);
		
		//WDEV-9647 If encodedPassword is null, set it to
		// 'unknown' as not null value in password history
		if (!previousPassword.getEncodedPasswordIsNotNull())
			previousPassword.setEncodedPassword("unknown");
		
		prev.add(AppUserPasswordVoAssembler.extractAppUserPassword(factory, previousPassword));
		
		domUser.setPreviousPasswords(prev);
		
		factory.save(domUser);
		
		AppUserVo fulluser = AppUserVoAssembler.create(domUser); 
		user = fulluser;
		user.setClearPassword(newPassword);
		
		return user;
	}

	private void changeMaximsPassword(IAppUser user, String newPassword, java.util.Date pwdExpDate) throws DTODomainInterfaceException, Exception, StaleObjectException
	{
		App_users userRec = (App_users)super.getDTOInstance(App_users.class);
		
		userRec.Filter.clear();
		userRec.Filter.Uname = user.getUsername();
		userRec.Filter.User_id = user.getUserId() + "";
				
		Result res = userRec.get();
		if (res != null && res.getId() != DtoErrorCode.NO_DATA_FOUND)
		{
			throw new DTODomainInterfaceException(res.getId(), "Error occurred getting user to DTO server." + res.getMessage());
		}


		userRec.DataCollection.get(0).Upass=Configuration.getHash(newPassword);
		userRec.DataCollection.get(0).Uname=user.getUsername();
		userRec.DataCollection.get(0).User_id = user.getUserId() + "";
		userRec.EditFilter.IncludeDbname=false;
		userRec.EditFilter.IncludeDbpass=false;
		if (pwdExpDate != null)
			userRec.DataCollection.get(0).Passwd_exp=new Date(pwdExpDate).toString(DateFormat.ISO);
		res = userRec.update();
		if (res != null && res.getId() != DtoErrorCode.NO_DATA_FOUND)
		{
			throw new DTODomainInterfaceException(res.getId(), "Error occurred updating password remotely. (" + res.getId() + ")" + res.getMessage());
		}


	}

	private void changeHeartPassword(IAppUser user, String newPassword)
			throws DTODomainInterfaceException, Exception, StaleObjectException
	{
		User userRec=null;
		try
		{
			userRec = (User)super.getDTOInstance(User.class);
		}
		catch (ResultException e)
		{
			LOG.error("Error occurred getting DTOInstance. " + e.getMessage(), e);
			return;
		}
		
		userRec.Filter.User=user.getUsername();
		Result res = userRec.get();
		if (res != null && res.getId() < 0)
		{
			throw new DTODomainInterfaceException(res.getId(), "Error occurred retrieving remote user record. (" + res.getId() + ")" + res.getMessage());
		}

		userRec.DataCollection.get(0).Pass=newPassword;
		userRec.DataCollection.get(0).User=user.getUsername();
		userRec.DataCollection.get(0).Hpcd = "NA";
		userRec.DataCollection.get(0).Maxims="Y";
		res = userRec.update();
		if (res != null && res.getId() != DtoErrorCode.NO_DATA_FOUND)
		{
			throw new DTODomainInterfaceException(res.getId(), "Error occurred updating password remotely. (" + res.getId() + ")" + res.getMessage());
		}	
	}

	public IAppUser getAppUser(int id)
	{
		if(id <= 0)
			return null;
		
		AppUser domUser = (AppUser)getDomainFactory().getDomainObject(AppUser.class, id);
		return AppUserVoAssembler.create(domUser); 
	}
}
