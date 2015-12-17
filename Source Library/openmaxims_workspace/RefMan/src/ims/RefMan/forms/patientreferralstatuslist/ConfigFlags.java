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
package ims.RefMan.forms.patientreferralstatuslist;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR;
	public final ALLOW_RE_ADMIT_FUNCTIONALITYClass ALLOW_RE_ADMIT_FUNCTIONALITY;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR = new FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass(configFlags);
		ALLOW_RE_ADMIT_FUNCTIONALITY = new ALLOW_RE_ADMIT_FUNCTIONALITYClass(configFlags);
	}

	public final class FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR");
		}
	}
	public final class ALLOW_RE_ADMIT_FUNCTIONALITYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_RE_ADMIT_FUNCTIONALITYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_RE_ADMIT_FUNCTIONALITY");
		}
	}
}
