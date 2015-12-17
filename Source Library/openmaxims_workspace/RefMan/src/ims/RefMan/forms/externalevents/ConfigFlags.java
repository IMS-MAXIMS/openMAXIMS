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
package ims.RefMan.forms.externalevents;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final FILE_SERVER_URLClass FILE_SERVER_URL;
	public final PUKKAJ_ENABLEDClass PUKKAJ_ENABLED;
	public final HL7_OUTBOUND_DOCUMENT_SHAREClass HL7_OUTBOUND_DOCUMENT_SHARE;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		FILE_SERVER_URL = new FILE_SERVER_URLClass(configFlags);
		PUKKAJ_ENABLED = new PUKKAJ_ENABLEDClass(configFlags);
		HL7_OUTBOUND_DOCUMENT_SHARE = new HL7_OUTBOUND_DOCUMENT_SHAREClass(configFlags);
	}

	public final class FILE_SERVER_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public FILE_SERVER_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("FILE_SERVER_URL");
		}
	}
	public final class PUKKAJ_ENABLEDClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PUKKAJ_ENABLEDClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("PUKKAJ_ENABLED");
		}
	}
	public final class HL7_OUTBOUND_DOCUMENT_SHAREClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public HL7_OUTBOUND_DOCUMENT_SHAREClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("HL7_OUTBOUND_DOCUMENT_SHARE");
		}
	}
}
