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
package ims.admin.forms.dischargesummaryschedule;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final SMTP_SERVERClass SMTP_SERVER;
	public final SMTP_SENDERClass SMTP_SENDER;
	public final SMTP_AUTHClass SMTP_AUTH;
	public final SMTP_PORTClass SMTP_PORT;
	public final QUERY_SERVER_URLClass QUERY_SERVER_URL;
	public final REPORT_SERVER_URLClass REPORT_SERVER_URL;
	public final FILE_UPLOAD_DIRClass FILE_UPLOAD_DIR;
	public final PDF_STORE_PATHClass PDF_STORE_PATH;
	public final PDF_UPLOAD_URLClass PDF_UPLOAD_URL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		SMTP_SERVER = new SMTP_SERVERClass(configFlags);
		SMTP_SENDER = new SMTP_SENDERClass(configFlags);
		SMTP_AUTH = new SMTP_AUTHClass(configFlags);
		SMTP_PORT = new SMTP_PORTClass(configFlags);
		QUERY_SERVER_URL = new QUERY_SERVER_URLClass(configFlags);
		REPORT_SERVER_URL = new REPORT_SERVER_URLClass(configFlags);
		FILE_UPLOAD_DIR = new FILE_UPLOAD_DIRClass(configFlags);
		PDF_STORE_PATH = new PDF_STORE_PATHClass(configFlags);
		PDF_UPLOAD_URL = new PDF_UPLOAD_URLClass(configFlags);
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
	public final class SMTP_SERVERClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SMTP_SERVERClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("SMTP_SERVER");
		}
	}
	public final class SMTP_SENDERClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SMTP_SENDERClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("SMTP_SENDER");
		}
	}
	public final class SMTP_AUTHClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SMTP_AUTHClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("SMTP_AUTH");
		}
	}
	public final class SMTP_PORTClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SMTP_PORTClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("SMTP_PORT");
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
	public final class PDF_STORE_PATHClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PDF_STORE_PATHClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("PDF_STORE_PATH");
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
}
