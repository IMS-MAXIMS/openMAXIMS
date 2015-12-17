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
package ims.core.helper;

import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.ReferralLiteVo;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.pathways.vo.EventVo;
import ims.pathways.vo.PatientEventVo;
import ims.pathways.vo.PatientJourneyVo;

public interface IPathwayPatientEventHelper
{
	PatientEventVo instantiatePatientEvent(PatientEventVo patientEvent) throws StaleObjectException, DomainInterfaceException;
	
	PatientJourneyVo createPatientJourney(PatientJourneyVo patJourney, ReferralLiteVo referral, Specialty specialty, HcpRefVo consultant,Boolean non18week) throws StaleObjectException, DomainInterfaceException;
	
	EventVo getEventByTaxonomyMap(TaxonomyType taxType, String value) throws DomainInterfaceException;
	
}
