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

import ims.ocs_if.vo.QueuedEventVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;

/**
 * Interface definition for a message queue handler
 * @author mnoonan
 *
 */

public interface IQueueHandler
{
	public IHL7OutboundMessageHandler getEvent(QueuedEventVo event);
	public IHL7OutboundMessageHandler saveMessage(IHL7OutboundMessageHandler event) throws ims.domain.exceptions.StaleObjectException;
}
