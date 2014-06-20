package ims.RefMan.forms.cliniclist;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final MERGED_COLOURClass MERGED_COLOUR;
	public final RIP_COLOURClass RIP_COLOUR;
	public final FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR;
	public final ICAB_ENABLEDClass ICAB_ENABLED;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		MERGED_COLOUR = new MERGED_COLOURClass(configFlags);
		RIP_COLOUR = new RIP_COLOURClass(configFlags);
		FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR = new FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass(configFlags);
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
	public final class MERGED_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public MERGED_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("MERGED_COLOUR");
		}
	}
	public final class RIP_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RIP_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("RIP_COLOUR");
		}
	}
	public final class FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR");
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
