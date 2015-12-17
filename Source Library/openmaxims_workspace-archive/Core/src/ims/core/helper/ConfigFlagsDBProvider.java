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
package ims.core.helper;

import java.util.HashMap;

import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.configuration.EnvironmentConfig;
import ims.configuration.IFlag;
import ims.core.configuration.domain.objects.ConfigFlag;
import ims.core.configuration.domain.objects.ConfigFlagGroup;
import ims.framework.interfaces.IConfigFlagsProvider;

public class ConfigFlagsDBProvider extends DomainImpl implements IConfigFlagsProvider 
{
	private static final long serialVersionUID = 1L;
	private static HashMap<String, String> flagValues = new HashMap<String, String>();
	
	private static String groupName = EnvironmentConfig.getFlagsGroupName();	
	private static ConfigFlagGroup group;
	
	public String getValue(String name) 
	{
		if(group == null)
			group = getGroup();
		if(group == null)
			throw new DomainRuntimeException("Unable to load the config flags group '" + groupName + "'");
		
		if(flagValues.containsKey(name))
		{
			return flagValues.get(name);
		}
		
		ConfigFlag flag = ConfigFlag.getRecordByNameAndGroup(getDomainFactory(), name, group);
		if(flag == null)		
		{
			setCachedValue(name, null);
			return null;
		}
		
		String result = flag.getValue();
		setCachedValue(name, result);		
		return result;
	}	
	public void setValue(String name, String value, String defaultValue, boolean isSystem) throws Exception
	{		
		group = getGroup();
		if(group == null)			
			throw new DomainRuntimeException("Unable to load the config flags group '" + groupName + "'");
		
		DomainFactory factory = getDomainFactory();
		ConfigFlag flag = ConfigFlag.getRecordByNameAndGroup(factory, name, group);
		if(flag == null)
		{			
			flag = new ConfigFlag();
			flag.setName(name);
			flag.setGroup(group);						
			flag.setIsSystem(isSystem);			
		}
				
		flag.setValue(value);		
		
		try
		{
			factory.save(flag);			
			setCachedValue(name, value);
		}
		catch(StaleObjectException e)
		{
			throw new Exception(e);
		}
	}
	private void setCachedValue(String name, String value) 
	{
		if(EnvironmentConfig.getClusterNodes().length() == 0)
		{
			flagValues.put(name, value);
		}
	}
	private ConfigFlagGroup getGroup()
	{
		return getGroupByName(groupName);
	}
	private ConfigFlagGroup getGroupByName(String groupName) 
	{
		ConfigFlagGroup group = ConfigFlagGroup.getConfigFlagGroupFromName(getDomainFactory(), groupName);
		
		if(group == null)
			return createGroup(groupName);
		
		return group;
	}
	private ConfigFlagGroup createGroup(String name) 
	{
		try
		{
			DomainFactory factory = getDomainFactory();
			
			ConfigFlagGroup group = new ConfigFlagGroup();
			group.setName(name);
			
			factory.save(group);
			
			return group;
		}
		catch (Exception e) 
		{
			throw new RuntimeException("Unable to create the config flags group '" + groupName + "'", e);
		}
	}
	public String getActiveGroup() 
	{
		return groupName;
	}
	public IFlag getConfigFlag(String group, String name) 
	{
		return null;
	}
	public IFlag[] getConfigFlags(String group) 
	{
		return null;
	}
	public String[] getGroups() 
	{
		return null;
	}
}
