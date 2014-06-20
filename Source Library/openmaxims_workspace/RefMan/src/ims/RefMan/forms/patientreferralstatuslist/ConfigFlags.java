package ims.RefMan.forms.patientreferralstatuslist;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR;
	public final ALLOW_RE_ADMIT_FUNCTIONALITYClass ALLOW_RE_ADMIT_FUNCTIONALITY;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR = new FURTHER_MANAGEMENT_REQUIRED_ROW_COLOURClass(configFlags);
		ALLOW_RE_ADMIT_FUNCTIONALITY = new ALLOW_RE_ADMIT_FUNCTIONALITYClass(configFlags);
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
	public final class ALLOW_RE_ADMIT_FUNCTIONALITYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_RE_ADMIT_FUNCTIONALITYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_RE_ADMIT_FUNCTIONALITY");
		}
	}
}
