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
package ims.core.forms.carespelldialog;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIEDClass STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED;
	public final DISPLAY_BED_NUMBER_FOR_CARECONTEXTClass DISPLAY_BED_NUMBER_FOR_CARECONTEXT;
	public final CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWIDClass CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWID;
	public final RETRIEVE_PAS_EPISODES_VIA_DTOClass RETRIEVE_PAS_EPISODES_VIA_DTO;
	public final DEMOGRAPHICS_EXT_SYSTEMClass DEMOGRAPHICS_EXT_SYSTEM;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED = new STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIEDClass(configFlags);
		DISPLAY_BED_NUMBER_FOR_CARECONTEXT = new DISPLAY_BED_NUMBER_FOR_CARECONTEXTClass(configFlags);
		CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWID = new CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWIDClass(configFlags);
		RETRIEVE_PAS_EPISODES_VIA_DTO = new RETRIEVE_PAS_EPISODES_VIA_DTOClass(configFlags);
		DEMOGRAPHICS_EXT_SYSTEM = new DEMOGRAPHICS_EXT_SYSTEMClass(configFlags);
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
	public final class STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIEDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIEDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED");
		}
	}
	public final class DISPLAY_BED_NUMBER_FOR_CARECONTEXTClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_BED_NUMBER_FOR_CARECONTEXTClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISPLAY_BED_NUMBER_FOR_CARECONTEXT");
		}
	}
	public final class CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWIDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWIDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWID");
		}
	}
	public final class RETRIEVE_PAS_EPISODES_VIA_DTOClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RETRIEVE_PAS_EPISODES_VIA_DTOClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("RETRIEVE_PAS_EPISODES_VIA_DTO");
		}
	}
	public final class DEMOGRAPHICS_EXT_SYSTEMClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DEMOGRAPHICS_EXT_SYSTEMClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DEMOGRAPHICS_EXT_SYSTEM");
		}
	}
}
