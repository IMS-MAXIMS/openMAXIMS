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

import ims.admin.vo.LocalSettingsVo;
import ims.admin.vo.domain.LocalSettingsVoAssembler;
import ims.core.configuration.domain.objects.LocalSettings;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.LocalSettingsType;
import ims.framework.interfaces.ILocalSettingsProvider;

public class LocalSettingsProvider extends DomainImpl implements ILocalSettingsProvider 
{
	private static final long serialVersionUID = 1L;

	public String getLocalSetting(String uniqueId, LocalSettingsType settingType) 
	{
		LocalSettingsVo ls = LocalSettingsVoAssembler.create(LocalSettings.getRecordByInstanceIdentifierAndSettingType(getDomainFactory(), uniqueId, settingType.hashCode()));
		return ls != null ? ls.getValues() : null;
	}
	public void setLocalSetting(String uniqueId, LocalSettingsType settingType, String value) 
	{
		LocalSettingsVo instance = LocalSettingsVoAssembler.create(LocalSettings.getRecordByInstanceIdentifierAndSettingType(getDomainFactory(), uniqueId, settingType.hashCode()));
		
		if(instance == null)
			instance = new LocalSettingsVo();
		
		instance.setInstanceIdentifier(uniqueId);
		instance.setSettingType(settingType.hashCode());
		instance.setValues(value);
		
		String[] errors = instance.validate();
		if(errors != null && errors.length > 0)
		{
			throw new RuntimeException("Validation errors while creating local settings.");
		}
		
		DomainFactory factory = getDomainFactory();
		LocalSettings doInstance = LocalSettingsVoAssembler.extractLocalSettings(factory, instance);
		try 
		{
			factory.save(doInstance);
		} 
		catch (StaleObjectException e) 
		{
			throw new RuntimeException(e);
		}
	}
}
