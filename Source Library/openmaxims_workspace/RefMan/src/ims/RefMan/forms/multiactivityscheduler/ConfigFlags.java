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
package ims.RefMan.forms.multiactivityscheduler;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final QUERY_SERVER_URLClass QUERY_SERVER_URL;
	public final REPORT_SERVER_URLClass REPORT_SERVER_URL;
	public final QUARTZ_SERVER_URLClass QUARTZ_SERVER_URL;
	public final BATCH_JOB_EXPORT_FOLDERClass BATCH_JOB_EXPORT_FOLDER;
	public final PROMPT_FOR_REPORT_PARAMSClass PROMPT_FOR_REPORT_PARAMS;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		QUERY_SERVER_URL = new QUERY_SERVER_URLClass(configFlags);
		REPORT_SERVER_URL = new REPORT_SERVER_URLClass(configFlags);
		QUARTZ_SERVER_URL = new QUARTZ_SERVER_URLClass(configFlags);
		BATCH_JOB_EXPORT_FOLDER = new BATCH_JOB_EXPORT_FOLDERClass(configFlags);
		PROMPT_FOR_REPORT_PARAMS = new PROMPT_FOR_REPORT_PARAMSClass(configFlags);
	}

	public final class QUERY_SERVER_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public QUERY_SERVER_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("QUERY_SERVER_URL");
		}
	}
	public final class REPORT_SERVER_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public REPORT_SERVER_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("REPORT_SERVER_URL");
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
	public final class BATCH_JOB_EXPORT_FOLDERClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public BATCH_JOB_EXPORT_FOLDERClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("BATCH_JOB_EXPORT_FOLDER");
		}
	}
	public final class PROMPT_FOR_REPORT_PARAMSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PROMPT_FOR_REPORT_PARAMSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("PROMPT_FOR_REPORT_PARAMS");
		}
	}
}
