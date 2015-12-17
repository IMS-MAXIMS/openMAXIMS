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
package ims.correspondence.forms.correspondenceoutpatientlist;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISPLAY_PATID_TYPEClass DISPLAY_PATID_TYPE;
	public final OUTPAT_CREATE_CORRESPONDENCE_DETAILSClass OUTPAT_CREATE_CORRESPONDENCE_DETAILS;
	public final RIP_COLOURClass RIP_COLOUR;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISPLAY_PATID_TYPE = new DISPLAY_PATID_TYPEClass(configFlags);
		OUTPAT_CREATE_CORRESPONDENCE_DETAILS = new OUTPAT_CREATE_CORRESPONDENCE_DETAILSClass(configFlags);
		RIP_COLOUR = new RIP_COLOURClass(configFlags);
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
	public final class OUTPAT_CREATE_CORRESPONDENCE_DETAILSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OUTPAT_CREATE_CORRESPONDENCE_DETAILSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("OUTPAT_CREATE_CORRESPONDENCE_DETAILS");
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
}
