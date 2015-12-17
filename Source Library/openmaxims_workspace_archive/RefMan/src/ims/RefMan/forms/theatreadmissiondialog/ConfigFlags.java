package ims.RefMan.forms.theatreadmissiondialog;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final HEARTS_REPLICATE_PATIENTSClass HEARTS_REPLICATE_PATIENTS;
	public final ALLOW_UPDATES_TO_NHS_NOClass ALLOW_UPDATES_TO_NHS_NO;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		HEARTS_REPLICATE_PATIENTS = new HEARTS_REPLICATE_PATIENTSClass(configFlags);
		ALLOW_UPDATES_TO_NHS_NO = new ALLOW_UPDATES_TO_NHS_NOClass(configFlags);
	}

	public final class HEARTS_REPLICATE_PATIENTSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HEARTS_REPLICATE_PATIENTSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("HEARTS_REPLICATE_PATIENTS");
		}
	}
	public final class ALLOW_UPDATES_TO_NHS_NOClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_UPDATES_TO_NHS_NOClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_UPDATES_TO_NHS_NO");
		}
	}
}
