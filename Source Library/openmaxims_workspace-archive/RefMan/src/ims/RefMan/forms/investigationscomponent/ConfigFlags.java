package ims.RefMan.forms.investigationscomponent;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final CANCELLED_INVESTIGATION_ROW_COLOURClass CANCELLED_INVESTIGATION_ROW_COLOUR;
	public final OCS_NEWRES_UNSEEN_CUTOFFClass OCS_NEWRES_UNSEEN_CUTOFF;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		CANCELLED_INVESTIGATION_ROW_COLOUR = new CANCELLED_INVESTIGATION_ROW_COLOURClass(configFlags);
		OCS_NEWRES_UNSEEN_CUTOFF = new OCS_NEWRES_UNSEEN_CUTOFFClass(configFlags);
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
	public final class OCS_NEWRES_UNSEEN_CUTOFFClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCS_NEWRES_UNSEEN_CUTOFFClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("OCS_NEWRES_UNSEEN_CUTOFF");
		}
	}
}
