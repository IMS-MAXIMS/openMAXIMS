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
package ims.core.helper;

import ims.core.vo.domain.PatientAssembler;
import ims.domain.impl.DomainImpl;
import ims.domain.impl.Transactional;
import ims.framework.exceptions.CodingRuntimeException;

public class PdsTouchPointImpl extends DomainImpl implements IPdsTouchPoint, Transactional
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public ims.core.vo.Patient getPatient(ims.core.patient.vo.PatientRefVo patient)
	{
		if(patient == null || patient.getID_Patient() == null)
			throw new CodingRuntimeException("patient os null or id not provided for method getPatient");
		
		return PatientAssembler.create((ims.core.patient.domain.objects.Patient) getDomainFactory().getDomainObject(patient)); 
	}
	
}
