package ims.RefMan.forms.bookappointment;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final SCHEDULING_SLOTS_CREATIONClass SCHEDULING_SLOTS_CREATION;
	public final ICAB_ENABLEDClass ICAB_ENABLED;
	public final PUKKAJ_ENABLEDClass PUKKAJ_ENABLED;
	public final CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		SCHEDULING_SLOTS_CREATION = new SCHEDULING_SLOTS_CREATIONClass(configFlags);
		ICAB_ENABLED = new ICAB_ENABLEDClass(configFlags);
		PUKKAJ_ENABLED = new PUKKAJ_ENABLEDClass(configFlags);
		CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL = new CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass(configFlags);
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
	public final class SCHEDULING_SLOTS_CREATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SCHEDULING_SLOTS_CREATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("SCHEDULING_SLOTS_CREATION");
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
}
