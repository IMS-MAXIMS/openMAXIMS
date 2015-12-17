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
