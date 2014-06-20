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
package ims.ocrr.helper;

import ims.RefMan.vo.CatsReferralRefVo;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.scheduling.domain.SessionAdmin;

public class OCRRSchedulingHelper extends DomainImpl implements IOCRRSchedulingHelper{

	public void updateCatsReferralAdditionalInvStatus(CatsReferralRefVo catsReferral) throws StaleObjectException
	{
		SessionAdmin impl = (SessionAdmin) getDomainImpl(ims.scheduling.domain.impl.SessionAdminImpl.class);
		impl.updateCatsReferralAdditionalInvStatus(catsReferral);			
	}

	
}
