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
package ims.RefMan.forms.theatreadmissiondialog;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final HEARTS_REPLICATE_PATIENTSClass HEARTS_REPLICATE_PATIENTS;
	public final ALLOW_UPDATES_TO_NHS_NOClass ALLOW_UPDATES_TO_NHS_NO;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		HEARTS_REPLICATE_PATIENTS = new HEARTS_REPLICATE_PATIENTSClass(configFlags);
		ALLOW_UPDATES_TO_NHS_NO = new ALLOW_UPDATES_TO_NHS_NOClass(configFlags);
	}

	public final class HEARTS_REPLICATE_PATIENTSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HEARTS_REPLICATE_PATIENTSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("HEARTS_REPLICATE_PATIENTS");
		}
	}
	public final class ALLOW_UPDATES_TO_NHS_NOClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_UPDATES_TO_NHS_NOClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_UPDATES_TO_NHS_NO");
		}
	}
}
