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
package ims.core.forms.authoringinfo;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final AUTHORING_INFO_COMPONENT_ISREADONLYClass AUTHORING_INFO_COMPONENT_ISREADONLY;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		AUTHORING_INFO_COMPONENT_ISREADONLY = new AUTHORING_INFO_COMPONENT_ISREADONLYClass(configFlags);
	}

	public final class AUTHORING_INFO_COMPONENT_ISREADONLYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public AUTHORING_INFO_COMPONENT_ISREADONLYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("AUTHORING_INFO_COMPONENT_ISREADONLY");
		}
	}
}
