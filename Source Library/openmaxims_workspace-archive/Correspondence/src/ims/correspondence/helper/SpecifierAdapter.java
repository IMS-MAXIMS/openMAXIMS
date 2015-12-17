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
package ims.correspondence.helper;

import ims.core.helper.GenericInfoAdapter;
import ims.core.vo.lookups.Specialty;
import ims.correspondence.vo.lookups.ProfileType;
import ims.vo.interfaces.ICspTypeSpecifier;

public class SpecifierAdapter extends GenericInfoAdapter implements ICspTypeSpecifier
{
		
	public SpecifierAdapter(Specialty specialty)
	{
		super(specialty);
	}
	public ProfileType getSpecifierType()
	{
		if (this.getInstance() instanceof Specialty)
			return ProfileType.SPECIALTY;
		else
			return null;
	}
}
