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
package ims.admin.forms.hl7testharness;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final HL7_FORMAT_EXPRESSIONClass HL7_FORMAT_EXPRESSION;
	public final HL7_PORTClass HL7_PORT;
	public final HOST_NAMEClass HOST_NAME;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		HL7_FORMAT_EXPRESSION = new HL7_FORMAT_EXPRESSIONClass(configFlags);
		HL7_PORT = new HL7_PORTClass(configFlags);
		HOST_NAME = new HOST_NAMEClass(configFlags);
	}

	public final class HL7_FORMAT_EXPRESSIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HL7_FORMAT_EXPRESSIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("HL7_FORMAT_EXPRESSION");
		}
	}
	public final class HL7_PORTClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HL7_PORTClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("HL7_PORT");
		}
	}
	public final class HOST_NAMEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HOST_NAMEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("HOST_NAME");
		}
	}
}
