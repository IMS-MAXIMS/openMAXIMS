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
package ims.ocrr.forms.resultdialog;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORMClass DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORM;
	public final OCRR_KEEP_RESULT_HISTORYClass OCRR_KEEP_RESULT_HISTORY;
	public final CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass CREATE_ORDERS_WITH_CARECONTEXT_ONLY;
	public final QUERY_SERVER_URLClass QUERY_SERVER_URL;
	public final FILE_SERVER_URLClass FILE_SERVER_URL;
	public final REPORT_SERVER_URLClass REPORT_SERVER_URL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORM = new DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORMClass(configFlags);
		OCRR_KEEP_RESULT_HISTORY = new OCRR_KEEP_RESULT_HISTORYClass(configFlags);
		CREATE_ORDERS_WITH_CARECONTEXT_ONLY = new CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass(configFlags);
		QUERY_SERVER_URL = new QUERY_SERVER_URLClass(configFlags);
		FILE_SERVER_URL = new FILE_SERVER_URLClass(configFlags);
		REPORT_SERVER_URL = new REPORT_SERVER_URLClass(configFlags);
	}

	public final class DISPLAY_PATID_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_PATID_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DISPLAY_PATID_TYPE");
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
	public final class DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORMClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORMClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORM");
		}
	}
	public final class OCRR_KEEP_RESULT_HISTORYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCRR_KEEP_RESULT_HISTORYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("OCRR_KEEP_RESULT_HISTORY");
		}
	}
	public final class CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CREATE_ORDERS_WITH_CARECONTEXT_ONLY");
		}
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
	public final class FILE_SERVER_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public FILE_SERVER_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("FILE_SERVER_URL");
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
}
