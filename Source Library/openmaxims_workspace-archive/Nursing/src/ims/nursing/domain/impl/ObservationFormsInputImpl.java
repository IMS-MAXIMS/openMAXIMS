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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.22 build 41101.1201)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.nursing.domain.impl;

import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.nursing.domain.objects.ObservationForm;
import ims.nursing.vo.domain.ObservationFormAssembler;

public class ObservationFormsInputImpl extends DomainImpl implements ims.nursing.domain.ObservationFormsInput, ims.domain.impl.Transactional
{
	/**
	* Get Form Commenced
	*/
	public ims.nursing.vo.ObservationForm getFormsCommencement(Integer formCommenceID)
	{
		DomainFactory factory = getDomainFactory();
		ObservationForm formComm = (ObservationForm)factory.getDomainObject(ObservationForm.class, formCommenceID);
		
		return (ObservationFormAssembler.create(formComm));
	}
	
	/**
	 * Includes both Insert and Update actions
	 */
	public ims.nursing.vo.ObservationForm saveFormsCommenced(ims.nursing.vo.ObservationForm formsCommenced) throws StaleObjectException
	{
		// Ensure the value object has been validated
		if (!formsCommenced.isValidated())
			throw new DomainRuntimeException("Forms commenced has not been validated");
		
		DomainFactory factory = getDomainFactory();
		ObservationForm domFormComm = ObservationFormAssembler.extractObservationForm(factory, formsCommenced);
		
		factory.save(domFormComm);
		return (ObservationFormAssembler.create(domFormComm)); 
	}
}
