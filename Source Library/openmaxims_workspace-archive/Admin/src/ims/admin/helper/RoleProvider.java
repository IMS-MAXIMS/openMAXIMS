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

import ims.admin.vo.domain.AppRoleVoAssembler;
import ims.core.configuration.domain.objects.AppRole;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppRole;
import ims.framework.interfaces.IRoleProvider;
public class RoleProvider extends DomainImpl implements IRoleProvider
{
	public IAppRole getRole(int roleId)
	{
		DomainFactory factory = getDomainFactory();
		AppRole domRole = (AppRole)factory.getDomainObject(AppRole.class, roleId);
		return AppRoleVoAssembler.create(domRole);
	}
}
