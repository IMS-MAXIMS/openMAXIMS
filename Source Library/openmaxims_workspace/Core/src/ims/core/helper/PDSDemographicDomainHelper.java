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

import java.util.ArrayList;

import ims.core.domain.PDSDemographics;
import ims.core.domain.impl.PDSDemographicsImpl;
import ims.core.vo.MissingMappingVoCollection;
import ims.core.vo.Patient;
import ims.core.vo.PatientShort;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppRole;

public class PDSDemographicDomainHelper extends DomainImpl  implements IPDSDemographicDomainHelper
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Patient getPatient(PatientShort pat) throws StaleObjectException
    {
    	PDSDemographics  impl = (PDSDemographics) getDomainImpl(PDSDemographicsImpl.class);
    	return impl.getPatient(pat);
    }

	public Patient updateLocalPatientWithPds(Patient lpiPatient, Patient pdsPatient, ArrayList errors, String samlXml, IAppRole appRole, MissingMappingVoCollection missingMappings) throws DomainInterfaceException, StaleObjectException, ForeignKeyViolationException	
	{
		PDSDemographics  impl = (PDSDemographics) getDomainImpl(PDSDemographicsImpl.class);
    	return impl.updateLocalPatientWithPds(lpiPatient, pdsPatient, errors, samlXml, appRole, missingMappings);
	}
	
}
