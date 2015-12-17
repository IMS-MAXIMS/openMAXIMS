//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.RefMan.forms.referralappointmentdetailscomponent;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final STALE_OBJECT_MESSAGEClass STALE_OBJECT_MESSAGE;
	public final CAN_CONFIGURE_THEATRE_PROFILESClass CAN_CONFIGURE_THEATRE_PROFILES;
	public final CANCELLED_INVESTIGATION_ROW_COLOURClass CANCELLED_INVESTIGATION_ROW_COLOUR;
	public final ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		STALE_OBJECT_MESSAGE = new STALE_OBJECT_MESSAGEClass(configFlags);
		CAN_CONFIGURE_THEATRE_PROFILES = new CAN_CONFIGURE_THEATRE_PROFILESClass(configFlags);
		CANCELLED_INVESTIGATION_ROW_COLOUR = new CANCELLED_INVESTIGATION_ROW_COLOURClass(configFlags);
		ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS = new ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass(configFlags);
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
	public final class CAN_CONFIGURE_THEATRE_PROFILESClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CAN_CONFIGURE_THEATRE_PROFILESClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("CAN_CONFIGURE_THEATRE_PROFILES");
		}
	}
	public final class CANCELLED_INVESTIGATION_ROW_COLOURClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public CANCELLED_INVESTIGATION_ROW_COLOURClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public ims.framework.utils.Color getValue()
		{
			return (ims.framework.utils.Color)configFlags.get("CANCELLED_INVESTIGATION_ROW_COLOUR");
		}
	}
	public final class ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERSClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS");
		}
	}
}
