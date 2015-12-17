package ims.RefMan.forms.referraloverviewandkpis;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL = new CREATE_ICP_ON_ACCEPTANCE_OF_REFERRALClass(configFlags);
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
