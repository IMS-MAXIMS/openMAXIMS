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
package ims.admin.forms.remoteadmin;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final ENABLE_DB_CONNECTION_TRACEClass ENABLE_DB_CONNECTION_TRACE;
	public final SESSION_TIMEOUTClass SESSION_TIMEOUT;
	public final LOGGING_LEVELClass LOGGING_LEVEL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		ENABLE_DB_CONNECTION_TRACE = new ENABLE_DB_CONNECTION_TRACEClass(configFlags);
		SESSION_TIMEOUT = new SESSION_TIMEOUTClass(configFlags);
		LOGGING_LEVEL = new LOGGING_LEVELClass(configFlags);
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
