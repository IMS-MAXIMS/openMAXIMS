package ims.RefMan.forms.printerselectiondialog;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final QUERY_SERVER_URLClass QUERY_SERVER_URL;
	public final REPORT_SERVER_URLClass REPORT_SERVER_URL;
	public final FILE_UPLOAD_DIRClass FILE_UPLOAD_DIR;
	public final PDF_UPLOAD_URLClass PDF_UPLOAD_URL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		QUERY_SERVER_URL = new QUERY_SERVER_URLClass(configFlags);
		REPORT_SERVER_URL = new REPORT_SERVER_URLClass(configFlags);
		FILE_UPLOAD_DIR = new FILE_UPLOAD_DIRClass(configFlags);
		PDF_UPLOAD_URL = new PDF_UPLOAD_URLClass(configFlags);
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
}
