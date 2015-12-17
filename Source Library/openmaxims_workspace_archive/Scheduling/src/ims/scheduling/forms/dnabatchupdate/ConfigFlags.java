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
package ims.scheduling.forms.dnabatchupdate;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final QUERY_SERVER_URLClass QUERY_SERVER_URL;
	public final REPORT_SERVER_URLClass REPORT_SERVER_URL;
	public final FILE_UPLOAD_DIRClass FILE_UPLOAD_DIR;
	public final PDF_UPLOAD_URLClass PDF_UPLOAD_URL;
	public final BATCH_JOB_EXPORT_FOLDERClass BATCH_JOB_EXPORT_FOLDER;
	public final ICAB_ENABLEDClass ICAB_ENABLED;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		QUERY_SERVER_URL = new QUERY_SERVER_URLClass(configFlags);
		REPORT_SERVER_URL = new REPORT_SERVER_URLClass(configFlags);
		FILE_UPLOAD_DIR = new FILE_UPLOAD_DIRClass(configFlags);
		PDF_UPLOAD_URL = new PDF_UPLOAD_URLClass(configFlags);
		BATCH_JOB_EXPORT_FOLDER = new BATCH_JOB_EXPORT_FOLDERClass(configFlags);
		ICAB_ENABLED = new ICAB_ENABLEDClass(configFlags);
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
	public final class FILE_UPLOAD_DIRClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public FILE_UPLOAD_DIRClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("FILE_UPLOAD_DIR");
		}
	}
	public final class PDF_UPLOAD_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PDF_UPLOAD_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("PDF_UPLOAD_URL");
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
	public final class ICAB_ENABLEDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ICAB_ENABLEDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ICAB_ENABLED");
		}
	}
}
