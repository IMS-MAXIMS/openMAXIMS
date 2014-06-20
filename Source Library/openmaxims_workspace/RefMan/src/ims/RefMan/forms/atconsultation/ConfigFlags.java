package ims.RefMan.forms.atconsultation;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
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
