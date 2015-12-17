package ims.RefMan.forms.dischargesummarywardpacu;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final CAN_CONFIGURE_THEATRE_PROFILESClass CAN_CONFIGURE_THEATRE_PROFILES;
	public final QUERY_SERVER_URLClass QUERY_SERVER_URL;
	public final REPORT_SERVER_URLClass REPORT_SERVER_URL;
	public final FILE_UPLOAD_DIRClass FILE_UPLOAD_DIR;
	public final PDF_UPLOAD_URLClass PDF_UPLOAD_URL;
	public final ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		CAN_CONFIGURE_THEATRE_PROFILES = new CAN_CONFIGURE_THEATRE_PROFILESClass(configFlags);
		QUERY_SERVER_URL = new QUERY_SERVER_URLClass(configFlags);
		REPORT_SERVER_URL = new REPORT_SERVER_URLClass(configFlags);
		FILE_UPLOAD_DIR = new FILE_UPLOAD_DIRClass(configFlags);
		PDF_UPLOAD_URL = new PDF_UPLOAD_URLClass(configFlags);
		ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS = new ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass(configFlags);
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
	public final class CAN_CONFIGURE_THEATRE_PROFILESClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CAN_CONFIGURE_THEATRE_PROFILESClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CAN_CONFIGURE_THEATRE_PROFILES");
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
	public final class ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS");
		}
	}
}
