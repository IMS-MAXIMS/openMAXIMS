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
package ims.ocs_if.helper;

import ims.core.resource.people.vo.HcpRefVo;
import ims.domain.DomainInterface;
import ims.framework.utils.DateTime;
import ims.ocs_if.vo.IfOrderInvestigationVo;
import ims.ocs_if.vo.IfOrderMessageVo;
import ims.ocs_if.vo.IfOutOcsOrderVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v24.message.ORM_O01;
import ca.uhn.hl7v2.model.v24.message.ORR_O02;
import ca.uhn.hl7v2.model.v24.message.ORU_R01;
import ca.uhn.hl7v2.model.v24.segment.ORC;

public interface IHL7Helper {

	ORM_O01 PopulateOrderMessage(ORM_O01 order,IfOrderMessageVo msgVo, IfOrderInvestigationVo inv, DomainInterface domObj ) throws DataTypeException, HL7Exception;
	ORR_O02 PopulateOrderMessage(ORR_O02 order,IfOrderInvestigationVo invVo, IfOutOcsOrderVo newOrder,DomainInterface domObj ) throws DataTypeException, HL7Exception;
	void ProcessOrderMessage(ORC orc,IfOrderInvestigationVo invVo,IfOrderInvestigationVo invFromMesssageVo,DomainInterface domObj,DateTime startDT,DateTime endDT,HcpRefVo seenBy);
	void PocessResultMessage(ORU_R01 result,IfOrderInvestigationVo invVo,IfOrderInvestigationVo invFromMesssageVo,DomainInterface domObj)throws HL7Exception;
	Boolean isReferralDiagnostic(Integer nBookingId);

}
