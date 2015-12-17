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
package ims.ocrr.forms.itemselection;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAMEClass OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME = new OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAMEClass(configFlags);
	}

	public final class OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAMEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAMEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME");
		}
	}
}
