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
import ims.admin.vo.AppUserPasswordVo;
import ims.admin.vo.AppUserVo;
import ims.admin.vo.domain.AppUserPasswordVoAssembler;
import ims.admin.vo.domain.AppUserVoAssembler;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.Configuration;
import ims.configuration.EnvironmentConfig;
import ims.core.configuration.domain.objects.AppUser;
import ims.domain.DomainFactory;
import ims.framework.exceptions.ConfigurationException;
import ims.framework.interfaces.IAppUser;
import ims.framework.utils.DateTime;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;

import javax.naming.AuthenticationException;
import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
public class LDAPUserProvider extends UserProvider
{
	private static final long serialVersionUID = 1L;
	private static final org.apache.log4j.Logger LocalLogger = ims.utils.Logging.getLogger(LDAPUserProvider.class);
		
	public IAppUser getAppUser(String username, String password) throws Exception
	{
		IAppUser user = null;
		if(password==null||password.length()==0)
		{
			throw new Exception("LDAP Error: Access denied.");
		}
		if(ConfigFlag.DOM.EXTERNAL_AUTHENTICATION.getValue())
		{
			user = getAppUser(username);
			if(user == null)
				throw new Exception("Invalid user and/or password.");
			
			if(user.useExternalAuthentication())
			{
				authenticateWithLDAP(username, password);
				return user;			
			}
		}
		
		return super.getAppUser(username, password);		
	}
	public IAppUser getAppUser(String username) 
	{
		return super.getAppUser(username);
	}
	public String getUserRealName(IAppUser user)
	{
		return super.getUserRealName(user);
	}	
	public IAppUser changePassword(IAppUser user, String newPassword) throws Exception
	{
		if(user == null)
			throw new Exception("Invalid user and/or password.");
		
		if(user.useExternalAuthentication())
		{
			throw new ConfigurationException("Change password functionality not supported.");			
		}
		else
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
	@SuppressWarnings("unchecked")
	private void authenticateWithLDAP(String username, String password) throws Exception 
	{		
		Hashtable authEnv = new Hashtable(11);
		
		String server = EnvironmentConfig.getLDAPServer();
		String domain = EnvironmentConfig.getLDAPDomain();
		String port = String.valueOf(EnvironmentConfig.getLDAPPort());
		String[] baseItems = EnvironmentConfig.getLDAPBase().split("\\.");
		String base = "";

		for(int x = 0; x < baseItems.length; x++)
		{
			if(base.length() > 0)
				base += ",";
			base += "dc=" + baseItems[x];
		}
		
		String group = EnvironmentConfig.getLDAPGroup();
		
		
		String securityPrincipal = "";		
		if(domain.length() > 0)
		{
			securityPrincipal += domain + "\\";
		}		
		securityPrincipal += username;
		
		authEnv.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		authEnv.put(Context.PROVIDER_URL, "ldap://" + server + ":" + port);
		authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
		authEnv.put(Context.REFERRAL, "follow");
		authEnv.put(Context.SECURITY_PRINCIPAL, securityPrincipal);
		authEnv.put(Context.SECURITY_CREDENTIALS, password);
		
		DirContext authContext = null;
		try 
		{
			authContext = new InitialDirContext(authEnv);
			if(group.length() > 0)
			{
				SearchControls constraints = new SearchControls();
				constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
				
				String search = "(&(objectCategory=user)(SAMAccountName=" + username + "))";
				NamingEnumeration result = authContext.search(base, search, constraints);
				
				boolean found = false;
				if(result != null && result.hasMore())
				{				
					SearchResult item = (SearchResult)result.next();					
					Attribute memberOf = item.getAttributes().get("memberof");
					
					NamingEnumeration memberOfAttributes = memberOf.getAll();
					while(memberOfAttributes.hasMore())
					{
 						String groupName = memberOfAttributes.next().toString().toLowerCase(); 						
 						if(groupName.startsWith("cn="))
 						{
 							groupName = groupName.substring(3);
 						}
 						int firstCommaIndex = groupName.indexOf(",");
 						if(firstCommaIndex > 0)
 						{
 							groupName = groupName.substring(0, firstCommaIndex);
 						}
 						
 						LocalLogger.info("LDAP user '" + username + "' is member of '" + groupName + "'.");
 						
						if(groupName.equals(group.toLowerCase()))
						{
							found = true;
							break;
						}
					}
					
					result.close();
					authContext.close();
				}
				
				if(!found)					
				{
					throw new Exception("LDAP Error: Access denied.");
				}
			}
		}
		catch(CommunicationException ex)
		{
			if(authContext != null)
			{
				authContext.close();
			}
			
			ex.printStackTrace();			
			throw new Exception("Unable to connect to LDAP Server. \r\n\r\n" + ex.getMessage());
		}
		catch(AuthenticationException ex)
		{
			ex.printStackTrace();			
			String errorMessage = ex.getMessage();
			
			if(errorMessage.toLowerCase().contains("ldaperr:"))
			{
				if(errorMessage.toLowerCase().contains("data 533,"))
				{
					throw new Exception("LDAP Error: Account disabled.");
				}
				else if(errorMessage.toLowerCase().contains("data 775,"))
				{
					throw new Exception("LDAP Error: Account locked.");
				}
				else if(errorMessage.toLowerCase().contains("data 525,"))
				{
					throw new Exception("LDAP Error: User not found.");					
				}
				else if(errorMessage.toLowerCase().contains("data 52e,"))
				{
					throw new Exception("LDAP Error: Invalid user credentials.");					
				}
				else if(errorMessage.toLowerCase().contains("data 530,"))
				{
					throw new Exception("LDAP Error: User not permitted to logon at this time.");					
				}
				else if(errorMessage.toLowerCase().contains("data 531,"))
				{
					throw new Exception("LDAP Error: User not permitted to logon from this workstation.");					
				}
				else if(errorMessage.toLowerCase().contains("data 532,"))
				{
					throw new Exception("LDAP Error: Password expired.");					
				}
				else if(errorMessage.toLowerCase().contains("data 701,"))
				{
					throw new Exception("LDAP Error: Account expired.");					
				}
				else if(errorMessage.toLowerCase().contains("data 773,"))
				{
					throw new Exception("LDAP Error: User must reset the password before logging on.");					
				}
			}
			
			throw new Exception("LDAP Error: Access denied.");
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
			throw ex;
		}
	}	
}
