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
package ims.clinical.forms.patientclinicalnotes;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final ALLOW_ONLY_ONE_CLINICAL_NOTEClass ALLOW_ONLY_ONE_CLINICAL_NOTE;
	public final DAILY_NOTES_LIST_NO_OF_DAYSClass DAILY_NOTES_LIST_NO_OF_DAYS;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		ALLOW_ONLY_ONE_CLINICAL_NOTE = new ALLOW_ONLY_ONE_CLINICAL_NOTEClass(configFlags);
		DAILY_NOTES_LIST_NO_OF_DAYS = new DAILY_NOTES_LIST_NO_OF_DAYSClass(configFlags);
	}

	public final class ALLOW_ONLY_ONE_CLINICAL_NOTEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_ONLY_ONE_CLINICAL_NOTEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_ONLY_ONE_CLINICAL_NOTE");
		}
	}
	public final class DAILY_NOTES_LIST_NO_OF_DAYSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DAILY_NOTES_LIST_NO_OF_DAYSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("DAILY_NOTES_LIST_NO_OF_DAYS");
		}
	}
}
