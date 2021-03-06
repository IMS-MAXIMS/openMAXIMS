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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 4847.21738)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.eas.forms.eassummaryinformation;

import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	/**
	* Initialise the component and display the items passed as parameters
	*/
	public void initialise(ims.eas.vo.lookups.PrimaryTumour primaryTumour, ims.eas.vo.lookups.TreatmentSites treatmentSite, ims.eas.vo.ProtocolNameVo protocol, ims.eas.vo.lookups.EASStatus status)
	{
		if (primaryTumour != null)
			form.lblPrimaryTumour().setValue(primaryTumour.getText());
		else
			form.lblPrimaryTumour().setValue("N/A");
		
		if (treatmentSite != null)
			form.lblTreatmentSite().setValue(treatmentSite.getText());
		else
			form.lblTreatmentSite().setValue("N/A");
		
		if (protocol != null && protocol.getProtocolNameIsNotNull())
			form.lblProtocol().setValue(protocol.getProtocolName());
		else 
			form.lblProtocol().setValue("Off Protocol");
		
		if (status != null)
			form.lblStatus().setValue(status.getText());
		else
			form.lblStatus().setValue("N/A");
			
		
	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{
		form.lblPrimaryTumour().setValue("");
		form.lblProtocol().setValue("");
		form.lblStatus().setValue("");
		form.lblTreatmentSite().setValue("");
		
	}
}
