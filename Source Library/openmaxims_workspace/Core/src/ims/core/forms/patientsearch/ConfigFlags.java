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
package ims.core.forms.patientsearch;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final PAT_SEARCH_OPTIONAL_COL_TYPEClass PAT_SEARCH_OPTIONAL_COL_TYPE;
	public final SEARCH_REQ_FORENAMEClass SEARCH_REQ_FORENAME;
	public final DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCHClass DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCH;
	public final DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCHClass DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCH;
	public final MERGED_COLOURClass MERGED_COLOUR;
	public final RIP_COLOURClass RIP_COLOUR;
	public final DEMOGRAPHICS_FORMClass DEMOGRAPHICS_FORM;
	public final DEMOGRAPHICS_EXT_SYSTEMClass DEMOGRAPHICS_EXT_SYSTEM;
	public final PATIENT_SEARCH_TYPEClass PATIENT_SEARCH_TYPE;
	public final CASE_SENSITIVE_PATIDClass CASE_SENSITIVE_PATID;
	public final LOCAL_PATIENT_REGISTRATIONClass LOCAL_PATIENT_REGISTRATION;
	public final ENABLE_EXCHEQUER_CODES_VALIDATIONClass ENABLE_EXCHEQUER_CODES_VALIDATION;
	public final PAT_SEARCH_MAX_SIZEClass PAT_SEARCH_MAX_SIZE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		PAT_SEARCH_OPTIONAL_COL_TYPE = new PAT_SEARCH_OPTIONAL_COL_TYPEClass(configFlags);
		SEARCH_REQ_FORENAME = new SEARCH_REQ_FORENAMEClass(configFlags);
		DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCH = new DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCHClass(configFlags);
		DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCH = new DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCHClass(configFlags);
		MERGED_COLOUR = new MERGED_COLOURClass(configFlags);
		RIP_COLOUR = new RIP_COLOURClass(configFlags);
		DEMOGRAPHICS_FORM = new DEMOGRAPHICS_FORMClass(configFlags);
		DEMOGRAPHICS_EXT_SYSTEM = new DEMOGRAPHICS_EXT_SYSTEMClass(configFlags);
		PATIENT_SEARCH_TYPE = new PATIENT_SEARCH_TYPEClass(configFlags);
		CASE_SENSITIVE_PATID = new CASE_SENSITIVE_PATIDClass(configFlags);
		LOCAL_PATIENT_REGISTRATION = new LOCAL_PATIENT_REGISTRATIONClass(configFlags);
		ENABLE_EXCHEQUER_CODES_VALIDATION = new ENABLE_EXCHEQUER_CODES_VALIDATIONClass(configFlags);
		PAT_SEARCH_MAX_SIZE = new PAT_SEARCH_MAX_SIZEClass(configFlags);
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
	public final class PAT_SEARCH_OPTIONAL_COL_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PAT_SEARCH_OPTIONAL_COL_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("PAT_SEARCH_OPTIONAL_COL_TYPE");
		}
	}
	public final class SEARCH_REQ_FORENAMEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public SEARCH_REQ_FORENAMEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("SEARCH_REQ_FORENAME");
		}
	}
	public final class DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCHClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCHClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCH");
		}
	}
	public final class DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCHClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCHClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCH");
		}
	}
	public final class MERGED_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public MERGED_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("MERGED_COLOUR");
		}
	}
	public final class RIP_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RIP_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("RIP_COLOUR");
		}
	}
	public final class DEMOGRAPHICS_FORMClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DEMOGRAPHICS_FORMClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.Form getValue()
		{
			return (ims.framework.Form)configFlags.get("DEMOGRAPHICS_FORM");
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
	public final class ENABLE_EXCHEQUER_CODES_VALIDATIONClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ENABLE_EXCHEQUER_CODES_VALIDATIONClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ENABLE_EXCHEQUER_CODES_VALIDATION");
		}
	}
	public final class PAT_SEARCH_MAX_SIZEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PAT_SEARCH_MAX_SIZEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("PAT_SEARCH_MAX_SIZE");
		}
	}
}
