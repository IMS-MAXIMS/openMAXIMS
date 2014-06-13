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
 * Created on 10-Dec-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package ims.core.domain.impl;

import ims.core.domain.Demographics;
import ims.core.vo.PatientId;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.PatientAssembler;
import ims.core.vo.lookups.PatIdType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;

/**
 * @author bworwood
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DemographicsLocalImpl extends DemographicsImpl implements Demographics, ims.domain.impl.Transactional 
{
	public ims.core.vo.Patient getPatient(PatientShort patient) throws StaleObjectException
	{
		DomainFactory factory = getDomainFactory();
		PatientId intfId = null;
		if (patient.getIdentifiers() == null || patient.getIdentifiers().size() == 0 || (intfId = patient.getIdentifiers().get(0)) == null)
		{
			throw new DomainRuntimeException("Patient Get call must contain valid identifier");
		}

		String hql = " from Patient p " +
			" join p.identifiers as ids" +
			" where ids.value = :idValue " + 
			" and ids.type = :idType "; 

		java.util.List patientList = factory.find(hql, new String[]{"idValue", "idType"}, new Object[]{intfId.getValue(), getDomLookup(intfId.getType())});			
		ims.core.patient.domain.objects.Patient domPatient=null;
		if (patientList != null && !patientList.isEmpty())
		{
			// Patient Should be unique per id value and type
			if (patientList.size() > 1) 
			{
				throw new DomainRuntimeException("More than one patient found with identifier type = " + PatIdType.TYPE_ID + " and value = " + intfId.getValue());
			}
			domPatient = (ims.core.patient.domain.objects.Patient)patientList.get(0);
			return PatientAssembler.create(domPatient);
		}

		return null;
	}

}
