//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
package ims.ocrr.forms.newresults;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final RELEASE_MODEClass RELEASE_MODE;
	public final OCRR_NEW_RESULTS_TIMER_REFRESH_RATEClass OCRR_NEW_RESULTS_TIMER_REFRESH_RATE;
	public final OCS_NEWRES_DAYS_MAXClass OCS_NEWRES_DAYS_MAX;
	public final OCS_NEWRES_DAYS_DEFAULTClass OCS_NEWRES_DAYS_DEFAULT;
	public final OCS_NEWRES_UNSEEN_CUTOFFClass OCS_NEWRES_UNSEEN_CUTOFF;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		RELEASE_MODE = new RELEASE_MODEClass(configFlags);
		OCRR_NEW_RESULTS_TIMER_REFRESH_RATE = new OCRR_NEW_RESULTS_TIMER_REFRESH_RATEClass(configFlags);
		OCS_NEWRES_DAYS_MAX = new OCS_NEWRES_DAYS_MAXClass(configFlags);
		OCS_NEWRES_DAYS_DEFAULT = new OCS_NEWRES_DAYS_DEFAULTClass(configFlags);
		OCS_NEWRES_UNSEEN_CUTOFF = new OCS_NEWRES_UNSEEN_CUTOFFClass(configFlags);
	}

	public final class RELEASE_MODEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RELEASE_MODEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("RELEASE_MODE");
		}
	}
	public final class OCRR_NEW_RESULTS_TIMER_REFRESH_RATEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCRR_NEW_RESULTS_TIMER_REFRESH_RATEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("OCRR_NEW_RESULTS_TIMER_REFRESH_RATE");
		}
	}
	public final class OCS_NEWRES_DAYS_MAXClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCS_NEWRES_DAYS_MAXClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("OCS_NEWRES_DAYS_MAX");
		}
	}
	public final class OCS_NEWRES_DAYS_DEFAULTClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCS_NEWRES_DAYS_DEFAULTClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("OCS_NEWRES_DAYS_DEFAULT");
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
