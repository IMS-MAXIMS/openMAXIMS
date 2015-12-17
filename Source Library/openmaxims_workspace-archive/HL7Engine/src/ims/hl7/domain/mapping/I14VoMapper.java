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
package ims.hl7.domain.mapping;

// WDEV-11723 

import ims.core.vo.HL7ReferralVo;
import ims.core.vo.Patient;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.pathways.domain.HL7PathwayIf;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.RF1;

public class I14VoMapper extends VoMapper {
	protected HL7PathwayIf	hL7PathwayIf=null;
	
	@Override
	public Message populateMessage()
	{
		// Inbound only - this method is not required
		return null;
	}

	@Override
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		try
		{
			if (hL7PathwayIf == null)
				hL7PathwayIf = (HL7PathwayIf) getDomainImpl("ims.pathways.domain.impl.HL7PathwayIfImpl");
			processMessage(msg, providerSystem);
		}
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;	

	}
	
	
	private void processMessage(Message msg, ProviderSystemVo providerSystem) throws Exception 
	{
		RF1 rf1 = (RF1) msg.get("RF1");

		// Identify the Patient, Register if required
		Patient patient = savePatient(msg, providerSystem);
	
		
		// Get the external referral identifier which is unique per referral
		String rkey = rf1.getOriginatingReferralIdentifier().getEntityIdentifier().getValue();
		
		// See if a referral exists for this patient and referral key
		// if so, we will update it, if not, create it
		HL7ReferralVo referral = hL7PathwayIf.getReferralByPatientAndRKEY(patient, rkey);

		// If this message is an instance of I13 and the referral is not found, reject
		// the message as I13 is a referral update message
		if (referral == null)
			throw new HL7Exception("Referral not found, this referral cannot be cancelled");
		
		referral.setIsActive(Boolean.FALSE);
		String[] errors = referral.validate();
		if (errors != null && errors.length > 0)
		{
			StringBuffer errStr = new StringBuffer();
			for (int i=0; i<errors.length; i++)
			{
				if (i >0)
					errStr.append(". ");
				errStr.append(errors[i]);
			}
			throw new HL7Exception("Referral Validation Failed - " + errStr.toString());
		}
		hL7PathwayIf.saveReferral(referral);
		
		// Message Processed
		return;
	}


}
