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
package ims.admin.forms.service;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_NAME_LOCATIONClass DISPLAY_NAME_LOCATION;
	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final DISPLAY_NAME_FUNCTIONClass DISPLAY_NAME_FUNCTION;
	public final DISPLAY_NAME_ACTIVITYClass DISPLAY_NAME_ACTIVITY;
	public final SERVICE_TABSClass SERVICE_TABS;
	public final BOOKAPPT_UI_TYPEClass BOOKAPPT_UI_TYPE;
	public final LINK_ACTIVITY_TO_PROCEDUREClass LINK_ACTIVITY_TO_PROCEDURE;
	public final ENABLE_EXCHEQUER_CODES_VALIDATIONClass ENABLE_EXCHEQUER_CODES_VALIDATION;
	public final CLINICAL_ADMIN_SEARCH_MAX_SIZEClass CLINICAL_ADMIN_SEARCH_MAX_SIZE;
	public final DISPLAY_NAME_SERVICEClass DISPLAY_NAME_SERVICE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_NAME_LOCATION = new DISPLAY_NAME_LOCATIONClass(configFlags);
		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		DISPLAY_NAME_FUNCTION = new DISPLAY_NAME_FUNCTIONClass(configFlags);
		DISPLAY_NAME_ACTIVITY = new DISPLAY_NAME_ACTIVITYClass(configFlags);
		SERVICE_TABS = new SERVICE_TABSClass(configFlags);
		BOOKAPPT_UI_TYPE = new BOOKAPPT_UI_TYPEClass(configFlags);
		LINK_ACTIVITY_TO_PROCEDURE = new LINK_ACTIVITY_TO_PROCEDUREClass(configFlags);
		ENABLE_EXCHEQUER_CODES_VALIDATION = new ENABLE_EXCHEQUER_CODES_VALIDATIONClass(configFlags);
		CLINICAL_ADMIN_SEARCH_MAX_SIZE = new CLINICAL_ADMIN_SEARCH_MAX_SIZEClass(configFlags);
		DISPLAY_NAME_SERVICE = new DISPLAY_NAME_SERVICEClass(configFlags);
	}

	public final class DISPLAY_NAME_LOCATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_NAME_LOCATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DISPLAY_NAME_LOCATION");
		}
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
	public final class DISPLAY_NAME_FUNCTIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_NAME_FUNCTIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DISPLAY_NAME_FUNCTION");
		}
	}
	public final class DISPLAY_NAME_ACTIVITYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_NAME_ACTIVITYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DISPLAY_NAME_ACTIVITY");
		}
	}
	public final class SERVICE_TABSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SERVICE_TABSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("SERVICE_TABS");
		}
	}
	public final class BOOKAPPT_UI_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public BOOKAPPT_UI_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("BOOKAPPT_UI_TYPE");
		}
	}
	public final class LINK_ACTIVITY_TO_PROCEDUREClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public LINK_ACTIVITY_TO_PROCEDUREClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("LINK_ACTIVITY_TO_PROCEDURE");
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
	public final class CLINICAL_ADMIN_SEARCH_MAX_SIZEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CLINICAL_ADMIN_SEARCH_MAX_SIZEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("CLINICAL_ADMIN_SEARCH_MAX_SIZE");
		}
	}
	public final class DISPLAY_NAME_SERVICEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_NAME_SERVICEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DISPLAY_NAME_SERVICE");
		}
	}
}
