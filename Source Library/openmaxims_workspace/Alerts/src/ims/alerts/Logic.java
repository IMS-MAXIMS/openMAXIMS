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

/*
 * This code was generated
 * Copyright (C) 1995-2012 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 08/10/2015, 16:34
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
		if (engine.isFormAccessibleFromNavigation(new FormHelper(102486)))
			engine.open(new FormHelper(102486));
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
	public void on(PatientDementiaStatus alert)
	{
		super.on(alert);
		if (engine.isFormAccessibleFromNavigation(new FormHelper(123259)))
			engine.open(new FormHelper(123259));
		else
			engine.showMessage("Access to this form is restricted!");
	}
	public void on(PatientAlertCCO alert)
	{
		super.on(alert);
		if (engine.isFormAccessibleFromNavigation(new FormHelper(101156)))
			engine.open(new FormHelper(101156));
		else
			engine.showMessage("Access to this form is restricted!");
	}
}
