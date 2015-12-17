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
package ims.core.forms.inpatientlist;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final INPAT_CREATE_CORRESPONDENCE_DETAILSClass INPAT_CREATE_CORRESPONDENCE_DETAILS;
	public final RIP_COLOURClass RIP_COLOUR;
	public final RIP_INFO_COLOURClass RIP_INFO_COLOUR;
	public final DEMOGRAPHICS_FORMClass DEMOGRAPHICS_FORM;
	public final DEMOGRAPHICS_EXT_SYSTEMClass DEMOGRAPHICS_EXT_SYSTEM;
	public final PATIENT_SEARCH_TYPEClass PATIENT_SEARCH_TYPE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		INPAT_CREATE_CORRESPONDENCE_DETAILS = new INPAT_CREATE_CORRESPONDENCE_DETAILSClass(configFlags);
		RIP_COLOUR = new RIP_COLOURClass(configFlags);
		RIP_INFO_COLOUR = new RIP_INFO_COLOURClass(configFlags);
		DEMOGRAPHICS_FORM = new DEMOGRAPHICS_FORMClass(configFlags);
		DEMOGRAPHICS_EXT_SYSTEM = new DEMOGRAPHICS_EXT_SYSTEMClass(configFlags);
		PATIENT_SEARCH_TYPE = new PATIENT_SEARCH_TYPEClass(configFlags);
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
	public final class INPAT_CREATE_CORRESPONDENCE_DETAILSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public INPAT_CREATE_CORRESPONDENCE_DETAILSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("INPAT_CREATE_CORRESPONDENCE_DETAILS");
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
	public final class RIP_INFO_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RIP_INFO_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("RIP_INFO_COLOUR");
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
}
