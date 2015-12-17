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
package ims.clinical.forms.patientsummary;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final PATIENT_SUMMARY_CDI_DISPLAYClass PATIENT_SUMMARY_CDI_DISPLAY;
	public final STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIEDClass STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED;
	public final DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARYClass DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARY;
	public final READ_AUDIT_ENABLEDClass READ_AUDIT_ENABLED;
	public final DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARYClass DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARY;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		PATIENT_SUMMARY_CDI_DISPLAY = new PATIENT_SUMMARY_CDI_DISPLAYClass(configFlags);
		STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED = new STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIEDClass(configFlags);
		DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARY = new DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARYClass(configFlags);
		READ_AUDIT_ENABLED = new READ_AUDIT_ENABLEDClass(configFlags);
		DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARY = new DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARYClass(configFlags);
	}

	public final class PATIENT_SUMMARY_CDI_DISPLAYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PATIENT_SUMMARY_CDI_DISPLAYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("PATIENT_SUMMARY_CDI_DISPLAY");
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
	public final class DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARY");
		}
	}
	public final class READ_AUDIT_ENABLEDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public READ_AUDIT_ENABLEDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("READ_AUDIT_ENABLED");
		}
	}
	public final class DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARY");
		}
	}
}
