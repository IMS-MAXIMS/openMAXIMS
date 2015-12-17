package ims.RefMan.forms.referralappointmentdetailscomponent;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final CAN_CONFIGURE_THEATRE_PROFILESClass CAN_CONFIGURE_THEATRE_PROFILES;
	public final CANCELLED_INVESTIGATION_ROW_COLOURClass CANCELLED_INVESTIGATION_ROW_COLOUR;
	public final ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		CAN_CONFIGURE_THEATRE_PROFILES = new CAN_CONFIGURE_THEATRE_PROFILESClass(configFlags);
		CANCELLED_INVESTIGATION_ROW_COLOUR = new CANCELLED_INVESTIGATION_ROW_COLOURClass(configFlags);
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
	public final class CANCELLED_INVESTIGATION_ROW_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CANCELLED_INVESTIGATION_ROW_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("CANCELLED_INVESTIGATION_ROW_COLOUR");
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
