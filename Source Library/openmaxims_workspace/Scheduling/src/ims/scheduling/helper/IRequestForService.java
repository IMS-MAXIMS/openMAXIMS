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
package ims.scheduling.helper;

import ims.RefMan.vo.CareSpellForRequestServiceShortVo;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.LinkedCatsReferralForOutcomeVo;
import ims.RefMan.vo.LinkedCatsReferralForOutcomeVoCollection;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;

public interface IRequestForService
{
	/**
	 * Function used to record a Request for Service for an Appointment Outcome
	 * @param linkedReferral
	 * @param parrentReferral
	 * @return
	 * @throws DomainInterfaceException
	 * @throws StaleObjectException
	 */
	public LinkedCatsReferralForOutcomeVo saveLinkedReferralForServiceRequest(LinkedCatsReferralForOutcomeVo linkedReferral, CatsReferralRefVo parentReferral, CareSpellForRequestServiceShortVo careSpell) throws DomainInterfaceException, StaleObjectException;
	
	/**
	 *	Function used to record a collection of Requests for Service for an Appointment Outcome
	 * @param linkedReferrals
	 * @param parentReferral
	 * @param careSpell
	 * @throws DomainInterfaceException
	 * @throws StaleObjectException
	 */
	public void saveLinkedReferralsForServiceRequest(LinkedCatsReferralForOutcomeVoCollection linkedReferrals, CatsReferralRefVo parentReferral, CareSpellForRequestServiceShortVo careSpell) throws DomainInterfaceException, StaleObjectException;
}
