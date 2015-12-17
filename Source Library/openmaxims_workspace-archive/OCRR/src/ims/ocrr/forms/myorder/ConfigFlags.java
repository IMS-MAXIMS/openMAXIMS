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
package ims.ocrr.forms.myorder;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final ORDER_ENTRY_UI_TYPEClass ORDER_ENTRY_UI_TYPE;
	public final ALLOW_CLINICALNOTES_WHEN_ORDERINGClass ALLOW_CLINICALNOTES_WHEN_ORDERING;
	public final OCRR_NO_OF_REPORT_TO_ROWSClass OCRR_NO_OF_REPORT_TO_ROWS;
	public final CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass CREATE_ORDERS_WITH_CARECONTEXT_ONLY;
	public final USE_GHG_SPECIMEN_NUMBERINGClass USE_GHG_SPECIMEN_NUMBERING;
	public final PAEDIATRIC_AGEClass PAEDIATRIC_AGE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		ORDER_ENTRY_UI_TYPE = new ORDER_ENTRY_UI_TYPEClass(configFlags);
		ALLOW_CLINICALNOTES_WHEN_ORDERING = new ALLOW_CLINICALNOTES_WHEN_ORDERINGClass(configFlags);
		OCRR_NO_OF_REPORT_TO_ROWS = new OCRR_NO_OF_REPORT_TO_ROWSClass(configFlags);
		CREATE_ORDERS_WITH_CARECONTEXT_ONLY = new CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass(configFlags);
		USE_GHG_SPECIMEN_NUMBERING = new USE_GHG_SPECIMEN_NUMBERINGClass(configFlags);
		PAEDIATRIC_AGE = new PAEDIATRIC_AGEClass(configFlags);
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
	public final class ORDER_ENTRY_UI_TYPEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ORDER_ENTRY_UI_TYPEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("ORDER_ENTRY_UI_TYPE");
		}
	}
	public final class ALLOW_CLINICALNOTES_WHEN_ORDERINGClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_CLINICALNOTES_WHEN_ORDERINGClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_CLINICALNOTES_WHEN_ORDERING");
		}
	}
	public final class OCRR_NO_OF_REPORT_TO_ROWSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCRR_NO_OF_REPORT_TO_ROWSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("OCRR_NO_OF_REPORT_TO_ROWS");
		}
	}
	public final class CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CREATE_ORDERS_WITH_CARECONTEXT_ONLYClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CREATE_ORDERS_WITH_CARECONTEXT_ONLY");
		}
	}
	public final class USE_GHG_SPECIMEN_NUMBERINGClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public USE_GHG_SPECIMEN_NUMBERINGClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("USE_GHG_SPECIMEN_NUMBERING");
		}
	}
	public final class PAEDIATRIC_AGEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PAEDIATRIC_AGEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Integer getValue()
		{
			return (Integer)configFlags.get("PAEDIATRIC_AGE");
		}
	}
}
