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
package ims.core.forms.otheraddresses;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final MAXIMUM_NUMBER_OF_OTHERADDRESSESClass MAXIMUM_NUMBER_OF_OTHERADDRESSES;
	public final LOCAL_PATIENT_REGISTRATIONClass LOCAL_PATIENT_REGISTRATION;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		MAXIMUM_NUMBER_OF_OTHERADDRESSES = new MAXIMUM_NUMBER_OF_OTHERADDRESSESClass(configFlags);
		LOCAL_PATIENT_REGISTRATION = new LOCAL_PATIENT_REGISTRATIONClass(configFlags);
	}

	public final class MAXIMUM_NUMBER_OF_OTHERADDRESSESClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public MAXIMUM_NUMBER_OF_OTHERADDRESSESClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("MAXIMUM_NUMBER_OF_OTHERADDRESSES");
		}
	}
	public final class LOCAL_PATIENT_REGISTRATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public LOCAL_PATIENT_REGISTRATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("LOCAL_PATIENT_REGISTRATION");
		}
	}
}
