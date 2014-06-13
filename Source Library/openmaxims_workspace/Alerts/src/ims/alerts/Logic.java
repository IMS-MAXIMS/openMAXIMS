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

/*
 * This code was generated
 * Copyright (C) 1995-2012 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 15/04/2014, 15:03
 *
 */
package ims.alerts;

import ims.framework.UIEngine;

public class Logic extends Handlers
{
	protected Logic(UIEngine engine)
	{
		super(engine);
	}
	
	public void on(PatientAlert alert)
	{
		super.on(alert);
		if (engine.isFormAccessibleFromNavigation(new FormHelper(101156)))
			engine.open(new FormHelper(101156));
		else
			engine.showMessage("Access to this form is restricted!");
	}
	public void on(PatientAllergy alert)
	{
		super.on(alert);
		if (engine.isFormAccessibleFromNavigation(new FormHelper(101154)))
			engine.open(new FormHelper(101154));
		else
			engine.showMessage("Access to this form is restricted!");
	}
	public void on(PatientInfo alert)
	{
		super.on(alert);
		if (engine.isFormAccessibleFromNavigation(new FormHelper(102101)))
			engine.open(new FormHelper(102101));
		else
			engine.showMessage("Access to this form is restricted!");
	}
	public void on(NewResults alert)
	{
		super.on(alert);
		if (engine.isFormAccessibleFromNavigation(new FormHelper(116186)))
			engine.open(new FormHelper(116186));
		else
			engine.showMessage("Access to this form is restricted!");
	}
}
