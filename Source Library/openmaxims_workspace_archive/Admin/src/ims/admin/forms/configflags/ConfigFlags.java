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
package ims.admin.forms.configflags;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final RELEASE_MODEClass RELEASE_MODE;
	public final ENABLE_DB_CONNECTION_TRACEClass ENABLE_DB_CONNECTION_TRACE;
	public final QUARTZ_SERVER_URLClass QUARTZ_SERVER_URL;
	public final LOG_FILEClass LOG_FILE;
	public final SESSION_TIMEOUTClass SESSION_TIMEOUT;
	public final DISPLAY_CHOICEClass DISPLAY_CHOICE;
	public final LOGGING_LEVELClass LOGGING_LEVEL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		RELEASE_MODE = new RELEASE_MODEClass(configFlags);
		ENABLE_DB_CONNECTION_TRACE = new ENABLE_DB_CONNECTION_TRACEClass(configFlags);
		QUARTZ_SERVER_URL = new QUARTZ_SERVER_URLClass(configFlags);
		LOG_FILE = new LOG_FILEClass(configFlags);
		SESSION_TIMEOUT = new SESSION_TIMEOUTClass(configFlags);
		DISPLAY_CHOICE = new DISPLAY_CHOICEClass(configFlags);
		LOGGING_LEVEL = new LOGGING_LEVELClass(configFlags);
	}

	public final class RELEASE_MODEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RELEASE_MODEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("RELEASE_MODE");
		}
	}
	public final class ENABLE_DB_CONNECTION_TRACEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ENABLE_DB_CONNECTION_TRACEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ENABLE_DB_CONNECTION_TRACE");
		}
	}
	public final class QUARTZ_SERVER_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public QUARTZ_SERVER_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("QUARTZ_SERVER_URL");
		}
	}
	public final class LOG_FILEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public LOG_FILEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("LOG_FILE");
		}
	}
	public final class SESSION_TIMEOUTClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SESSION_TIMEOUTClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("SESSION_TIMEOUT");
		}
	}
	public final class DISPLAY_CHOICEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_CHOICEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DISPLAY_CHOICE");
		}
	}
	public final class LOGGING_LEVELClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public LOGGING_LEVELClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("LOGGING_LEVEL");
		}
	}
}
