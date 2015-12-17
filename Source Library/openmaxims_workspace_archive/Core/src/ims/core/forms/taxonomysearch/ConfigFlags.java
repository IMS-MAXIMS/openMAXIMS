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
package ims.core.forms.taxonomysearch;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final DISABLE_EXTERNAL_CODE_TYPEClass DISABLE_EXTERNAL_CODE_TYPE;
	public final READ_CODES_SEARCH_TYPEClass READ_CODES_SEARCH_TYPE;
	public final TAXONOMY_SEARCH_MAX_SIZEClass TAXONOMY_SEARCH_MAX_SIZE;
	public final TAXONOMY_SEARCH_CRITERIA_SIZEClass TAXONOMY_SEARCH_CRITERIA_SIZE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		DISABLE_EXTERNAL_CODE_TYPE = new DISABLE_EXTERNAL_CODE_TYPEClass(configFlags);
		READ_CODES_SEARCH_TYPE = new READ_CODES_SEARCH_TYPEClass(configFlags);
		TAXONOMY_SEARCH_MAX_SIZE = new TAXONOMY_SEARCH_MAX_SIZEClass(configFlags);
		TAXONOMY_SEARCH_CRITERIA_SIZE = new TAXONOMY_SEARCH_CRITERIA_SIZEClass(configFlags);
	}

	public final class DISABLE_EXTERNAL_CODE_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public DISABLE_EXTERNAL_CODE_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("DISABLE_EXTERNAL_CODE_TYPE");
		}
	}
	public final class READ_CODES_SEARCH_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public READ_CODES_SEARCH_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("READ_CODES_SEARCH_TYPE");
		}
	}
	public final class TAXONOMY_SEARCH_MAX_SIZEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public TAXONOMY_SEARCH_MAX_SIZEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("TAXONOMY_SEARCH_MAX_SIZE");
		}
	}
	public final class TAXONOMY_SEARCH_CRITERIA_SIZEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public TAXONOMY_SEARCH_CRITERIA_SIZEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("TAXONOMY_SEARCH_CRITERIA_SIZE");
		}
	}
}
