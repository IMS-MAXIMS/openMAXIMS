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
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppUser;
import ims.framework.interfaces.IUserProvider;
import ims.framework.utils.DateTime;

public class UserProvider extends DomainImpl implements IUserProvider
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public IAppUser getAppUser(String username, String password) throws Exception
	{
		String hql = "from AppUser user where user.username=:username and user.password=:password and user.isActive is true";
		List list = getDomainFactory().find(hql, new String[] { "username", "password" }, new Object[] { username, Configuration.getHash(password) } );
		if (list.size() == 0)
			return null;
		
		return AppUserVoAssembler.create((AppUser)list.get(0));
	}
	public IAppUser getAppUser(String username) 
	{
		return AppUserVoAssembler.create(AppUser.getAppUserFromUsername(getDomainFactory(), username));
	}
	public IAppUser getAppUser(int id) 
	{
		return AppUserVoAssembler.create((AppUser)getDomainFactory().getDomainObject(AppUser.class, id));
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
		
		String currentEncodedPassord = domUser.getEncodedPassword();
		
		domUser.setPassword(Configuration.getHash(newPassword));	
		domUser.setEncodedPassword(Configuration.encryptPasswordWithCloak(newPassword));		
		java.util.Date date = domUser.getPwdExpDate();
		if (date != null)
		{
			Calendar cal = Calendar.getInstance();
			cal.setTime(new java.util.Date());
			cal.add(Calendar.DATE, ConfigFlag.GEN.PASSWD_EXP_INCREMENT.getValue());
			domUser.setPwdExpDate(cal.getTime());
		}
			
		// WDEV-8894 fix - the current encoded password might be null
		// and in this case we won't store it in the history
		if(currentEncodedPassord != null && currentEncodedPassord.trim().length() > 0)
		{
			List prev = domUser.getPreviousPasswords();
			if(prev == null)
				prev = new ArrayList();
			
			AppUserPasswordVo previousPassword = new AppUserPasswordVo();
			previousPassword.setDateTime(new DateTime());
			previousPassword.setEncodedPassword(currentEncodedPassord);
			prev.add(AppUserPasswordVoAssembler.extractAppUserPassword(factory, previousPassword));
			
			domUser.setPreviousPasswords(prev);
		}
		
		factory.save(domUser);
		
		AppUserVo fulluser = AppUserVoAssembler.create(domUser); 
		user = fulluser;
		user.setClearPassword(newPassword);
		
		return user;
	}
}
