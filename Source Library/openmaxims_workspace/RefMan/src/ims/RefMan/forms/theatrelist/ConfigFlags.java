package ims.RefMan.forms.theatrelist;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final MERGED_COLOURClass MERGED_COLOUR;
	public final RIP_COLOURClass RIP_COLOUR;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		MERGED_COLOUR = new MERGED_COLOURClass(configFlags);
		RIP_COLOUR = new RIP_COLOURClass(configFlags);
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
}
