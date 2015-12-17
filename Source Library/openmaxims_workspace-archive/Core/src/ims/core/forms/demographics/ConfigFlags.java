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
package ims.core.forms.demographics;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final DEMOGRAPHICS_TYPEClass DEMOGRAPHICS_TYPE;
	public final CAPSCAN_ENABLEDClass CAPSCAN_ENABLED;
	public final DEMOGRAPHICS_EXT_SYSTEMClass DEMOGRAPHICS_EXT_SYSTEM;
	public final PATIENT_SEARCH_TYPEClass PATIENT_SEARCH_TYPE;
	public final CASE_SENSITIVE_PATIDClass CASE_SENSITIVE_PATID;
	public final LOCAL_PATIENT_REGISTRATIONClass LOCAL_PATIENT_REGISTRATION;
	public final HEARTS_REPLICATE_PATIENTSClass HEARTS_REPLICATE_PATIENTS;
	public final ALLOW_DUPLICATE_NHS_NUMBERSClass ALLOW_DUPLICATE_NHS_NUMBERS;
	public final ALLOW_UPDATES_TO_NHS_NOClass ALLOW_UPDATES_TO_NHS_NO;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		DEMOGRAPHICS_TYPE = new DEMOGRAPHICS_TYPEClass(configFlags);
		CAPSCAN_ENABLED = new CAPSCAN_ENABLEDClass(configFlags);
		DEMOGRAPHICS_EXT_SYSTEM = new DEMOGRAPHICS_EXT_SYSTEMClass(configFlags);
		PATIENT_SEARCH_TYPE = new PATIENT_SEARCH_TYPEClass(configFlags);
		CASE_SENSITIVE_PATID = new CASE_SENSITIVE_PATIDClass(configFlags);
		LOCAL_PATIENT_REGISTRATION = new LOCAL_PATIENT_REGISTRATIONClass(configFlags);
		HEARTS_REPLICATE_PATIENTS = new HEARTS_REPLICATE_PATIENTSClass(configFlags);
		ALLOW_DUPLICATE_NHS_NUMBERS = new ALLOW_DUPLICATE_NHS_NUMBERSClass(configFlags);
		ALLOW_UPDATES_TO_NHS_NO = new ALLOW_UPDATES_TO_NHS_NOClass(configFlags);
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
	public final class DEMOGRAPHICS_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DEMOGRAPHICS_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("DEMOGRAPHICS_TYPE");
		}
	}
	public final class CAPSCAN_ENABLEDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CAPSCAN_ENABLEDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CAPSCAN_ENABLED");
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
	public final class PATIENT_SEARCH_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PATIENT_SEARCH_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("PATIENT_SEARCH_TYPE");
		}
	}
	public final class CASE_SENSITIVE_PATIDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CASE_SENSITIVE_PATIDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CASE_SENSITIVE_PATID");
		}
	}
	public final class LOCAL_PATIENT_REGISTRATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public LOCAL_PATIENT_REGISTRATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("LOCAL_PATIENT_REGISTRATION");
		}
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
	public final class ALLOW_DUPLICATE_NHS_NUMBERSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_DUPLICATE_NHS_NUMBERSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_DUPLICATE_NHS_NUMBERS");
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
