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
package ims.admin.forms.organisationandlocation;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final DEMOGRAPHICS_USE_POSTCODEClass DEMOGRAPHICS_USE_POSTCODE;
	public final ORG_LOC_SHOW_CHECKSClass ORG_LOC_SHOW_CHECKS;
	public final ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROPClass ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROP;
	public final ENABLE_EXCHEQUER_CODES_VALIDATIONClass ENABLE_EXCHEQUER_CODES_VALIDATION;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		DEMOGRAPHICS_USE_POSTCODE = new DEMOGRAPHICS_USE_POSTCODEClass(configFlags);
		ORG_LOC_SHOW_CHECKS = new ORG_LOC_SHOW_CHECKSClass(configFlags);
		ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROP = new ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROPClass(configFlags);
		ENABLE_EXCHEQUER_CODES_VALIDATION = new ENABLE_EXCHEQUER_CODES_VALIDATIONClass(configFlags);
	}

	public final class STALE_OBJECT_MESSAGEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public STALE_OBJECT_MESSAGEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("STALE_OBJECT_MESSAGE");
		}
	}
	public final class DEMOGRAPHICS_USE_POSTCODEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DEMOGRAPHICS_USE_POSTCODEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DEMOGRAPHICS_USE_POSTCODE");
		}
	}
	public final class ORG_LOC_SHOW_CHECKSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ORG_LOC_SHOW_CHECKSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ORG_LOC_SHOW_CHECKS");
		}
	}
	public final class ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROPClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROPClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROP");
		}
	}
	public final class ENABLE_EXCHEQUER_CODES_VALIDATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ENABLE_EXCHEQUER_CODES_VALIDATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ENABLE_EXCHEQUER_CODES_VALIDATION");
		}
	}
}
