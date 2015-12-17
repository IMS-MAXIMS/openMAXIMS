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
package ims.admin.forms.sessionadmin;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final SESSION_LOG_LOCATIONClass SESSION_LOG_LOCATION;
	public final SESSION_TIMEOUTClass SESSION_TIMEOUT;
	public final HOST_NAMEClass HOST_NAME;
	public final START_TIMEClass START_TIME;
	public final DBTYPEClass DBTYPE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		SESSION_LOG_LOCATION = new SESSION_LOG_LOCATIONClass(configFlags);
		SESSION_TIMEOUT = new SESSION_TIMEOUTClass(configFlags);
		HOST_NAME = new HOST_NAMEClass(configFlags);
		START_TIME = new START_TIMEClass(configFlags);
		DBTYPE = new DBTYPEClass(configFlags);
	}

	public final class SESSION_LOG_LOCATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SESSION_LOG_LOCATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("SESSION_LOG_LOCATION");
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
	public final class START_TIMEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public START_TIMEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("START_TIME");
		}
	}
	public final class DBTYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DBTYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DBTYPE");
		}
	}
}
