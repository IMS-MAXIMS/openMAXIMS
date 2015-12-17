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
package ims.alerts;

import ims.framework.UIEngine;
import ims.framework.AlertLogic;
import ims.framework.Alert;

public class Handlers implements AlertLogic
{
	protected Handlers(UIEngine engine)
	{
		this.engine = engine;
	}
	public void dispatch(Alert alert)
	{
		if(alert instanceof PatientAlert)
			on((PatientAlert) alert);
		if(alert instanceof PatientAllergy)
			on((PatientAllergy) alert);
		if(alert instanceof PatientInfo)
			on((PatientInfo) alert);
		if(alert instanceof NewResults)
			on((NewResults) alert);
	}
	public void on(PatientAlert alert)
	{
		if(alert == null)
			return;
	}
	public void on(PatientAllergy alert)
	{
		if(alert == null)
			return;
	}
	public void on(PatientInfo alert)
	{
		if(alert == null)
			return;
	}
	public void on(NewResults alert)
	{
		if(alert == null)
			return;
	}
	protected UIEngine engine;
}
