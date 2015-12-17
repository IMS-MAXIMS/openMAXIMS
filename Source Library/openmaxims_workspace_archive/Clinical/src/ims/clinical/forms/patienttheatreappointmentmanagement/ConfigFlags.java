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
package ims.clinical.forms.patienttheatreappointmentmanagement;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final BOOKAPPT_UI_TYPEClass BOOKAPPT_UI_TYPE;
	public final SEARCH_REQ_FORENAMEClass SEARCH_REQ_FORENAME;
	public final MERGED_COLOURClass MERGED_COLOUR;
	public final RIP_COLOURClass RIP_COLOUR;
	public final PATIENT_SEARCH_TYPEClass PATIENT_SEARCH_TYPE;
	public final ICAB_ENABLEDClass ICAB_ENABLED;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		BOOKAPPT_UI_TYPE = new BOOKAPPT_UI_TYPEClass(configFlags);
		SEARCH_REQ_FORENAME = new SEARCH_REQ_FORENAMEClass(configFlags);
		MERGED_COLOUR = new MERGED_COLOURClass(configFlags);
		RIP_COLOUR = new RIP_COLOURClass(configFlags);
		PATIENT_SEARCH_TYPE = new PATIENT_SEARCH_TYPEClass(configFlags);
		ICAB_ENABLED = new ICAB_ENABLEDClass(configFlags);
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
	public final class BOOKAPPT_UI_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public BOOKAPPT_UI_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("BOOKAPPT_UI_TYPE");
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
}
