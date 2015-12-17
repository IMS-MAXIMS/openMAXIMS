package ims.RefMan.forms.referraldetails;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final PUKKAJ_ENABLEDClass PUKKAJ_ENABLED;
	public final CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL;
	public final SHOW_PRESENTATION_TABClass SHOW_PRESENTATION_TAB;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		PUKKAJ_ENABLED = new PUKKAJ_ENABLEDClass(configFlags);
		CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL = new CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass(configFlags);
		SHOW_PRESENTATION_TAB = new SHOW_PRESENTATION_TABClass(configFlags);
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
	public final class CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL");
		}
	}
	public final class SHOW_PRESENTATION_TABClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SHOW_PRESENTATION_TABClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("SHOW_PRESENTATION_TAB");
		}
	}
}
