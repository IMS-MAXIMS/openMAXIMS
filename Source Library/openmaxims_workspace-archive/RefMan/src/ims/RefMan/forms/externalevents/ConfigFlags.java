package ims.RefMan.forms.externalevents;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final FILE_SERVER_URLClass FILE_SERVER_URL;
	public final PUKKAJ_ENABLEDClass PUKKAJ_ENABLED;
	public final HL7_OUTBOUND_DOCUMENT_SHAREClass HL7_OUTBOUND_DOCUMENT_SHARE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		FILE_SERVER_URL = new FILE_SERVER_URLClass(configFlags);
		PUKKAJ_ENABLED = new PUKKAJ_ENABLEDClass(configFlags);
		HL7_OUTBOUND_DOCUMENT_SHARE = new HL7_OUTBOUND_DOCUMENT_SHAREClass(configFlags);
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
	public final class PUKKAJ_ENABLEDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PUKKAJ_ENABLEDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("PUKKAJ_ENABLED");
		}
	}
	public final class HL7_OUTBOUND_DOCUMENT_SHAREClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HL7_OUTBOUND_DOCUMENT_SHAREClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("HL7_OUTBOUND_DOCUMENT_SHARE");
		}
	}
}
