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
package ims.admin.helper;

import ims.core.clinical.domain.objects.Medication;
import ims.core.vo.MedicationVo;
import ims.core.vo.domain.MedicationVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;

public class MedicationManagement 
{
	private DomainFactory domain;
	
	public MedicationManagement(DomainFactory domain)
	{
		if(domain == null)
			throw new CodingRuntimeException("Domain not supplied");
		
		this.domain = domain;
	}
	
	public MedicationVo createOrUpdateMedication(MedicationVo value) throws StaleObjectException
	{
		if(value == null)
			throw new CodingRuntimeException("Invalid medication");
		if(value.getMedicationName() == null || value.getMedicationName().trim().length() == 0)
			throw new CodingRuntimeException("Invalid medication name");		
		
		MedicationVo existingMedication = getMedicationByName(value.getMedicationName());
		
		if(existingMedication == null)
			return insertMedication(value);
		else
			return existingMedication;
	}
	public MedicationVo getMedicationByName(String medicationName) 
	{
		if(medicationName == null || medicationName.trim().length() == 0)
			throw new CodingRuntimeException("Invalid medication name");
		
		return MedicationVoAssembler.create(Medication.getMedicationFromMedicationName(domain, medicationName));
	}
	private MedicationVo insertMedication(MedicationVo value) throws StaleObjectException 
	{		
		if(!value.isValidated())
			throw new CodingRuntimeException("Medication not validated");
		
		Medication dom = MedicationVoAssembler.extractMedication(domain, value);
		domain.save(dom);
		return MedicationVoAssembler.create(dom);
	}
	/*
	private MedicationVo updateMedication(MedicationVo existingMedication, MedicationVo value) throws StaleObjectException 
	{
		Medication dom = MedicationVoAssembler.extractMedication(domain, mergeMedication(existingMedication, value));
		domain.save(dom);
		return MedicationVoAssembler.create(dom);		
	}
	private MedicationVo mergeMedication(MedicationVo existingMedication, MedicationVo value) 
	{
		return existingMedication;
	}
	*/
}
