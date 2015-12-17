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
package ims.ccosched.Helper;

import ims.core.vo.PatientShort;
import ims.core.vo.lookups.PatIdType;
import ims.dto.client.Patient;

public class PatientShortHelper
{
	public PatientShort getPatientShort(Patient.PatientRecord patient)
	{
		if(patient != null && patient.Pkey != null)
		{
			PatientShort patientShort = new PatientShort();
			patientShort.setID_Patient(Integer.valueOf(patient.Pkey));
			if(patient.Nhsn != null)
				patientShort.addId(PatIdType.NHSN, patient.Nhsn);
			if(patient.Pkey != null)
				patientShort.addId(PatIdType.PKEY, patient.Pkey);
			if(patient.Hospnum != null)
				patientShort.addId(PatIdType.HOSPNUM, patient.Hospnum);
			if(patient.Chartnum != null)
				patientShort.addId(PatIdType.CHARTNUM, patient.Chartnum);
			
			return patientShort;
		}
		
		return null;
	}
}
