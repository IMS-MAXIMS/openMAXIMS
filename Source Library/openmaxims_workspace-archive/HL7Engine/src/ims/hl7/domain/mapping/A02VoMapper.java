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


import org.apache.log4j.Logger;

import ims.configuration.gen.ConfigFlag;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.Patient;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A02VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A02VoMapper.class);

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return(processPatientTransfer(msg, providerSystem));
	}

	public Message populateMessage()
	{
		// Not needed for inbound messages
		return null;
	}
	
	public Message processPatientTransfer(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{

		try
		{
			Patient patVo;
			try
			{
				patVo = savePatient(msg,providerSystem, false);
			}
			catch (Exception ex)
			{
				LOG.error(ex);
				return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			}
			
			PV1 pv1 = (PV1) msg.get("PV1");
			PV2 pv2 = (PV2)msg.get("PV2");
			EVN evn = (EVN)msg.get("EVN");
			LocationRefVo loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
			LocationRefVo locFrom = orgLoc.getLocationByTaxonomyType(pv1.getPriorPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
			DateTime transferDT=null;
			if(evn.getEventOccurred().getTimeOfAnEvent().getValue()!=null)
			{
				transferDT = new DateTime(evn.getEventOccurred().getTimeOfAnEvent().getValue());
			}
			
			//WDEV-10593
			DateTime transactionDT=null;
			if(evn.getRecordedDateTime() != null &&  evn.getRecordedDateTime().getTimeOfAnEvent() != null && evn.getRecordedDateTime().getTimeOfAnEvent().getValue() != null)
			{
				transactionDT = new DateTime(evn.getRecordedDateTime().getTimeOfAnEvent().getValue());
			}			
			
			HcpRefVo hcp = hcpAdmin.getMedicByNationalCode(pv1.getAdmittingDoctor(0).getIDNumber().getValue());
			if (hcp == null && pv1.getAdmittingDoctor(1).getIDNumber().getValue() != null)  // Check by pas code if not found by national code
				hcp = hcpAdmin.getMedicMedicMappingsByPasCode(pv1.getAdmittingDoctor(1).getIDNumber().getValue());
			//if the hcp is still null try and get it from consulting doctor pv1.9 WDEV-7881 
			if (hcp == null)
			{
				hcp = hcpAdmin.getMedicByNationalCode(pv1.getConsultingDoctor(0).getIDNumber().getValue());
				if (hcp == null)
				{
					// Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
					String pasCode = pv1.getConsultingDoctor(1).getIDNumber().getValue();
					if (pasCode != null)
						hcp = hcpAdmin.getMedicMedicMappingsByPasCode(pasCode);
				}

			}
			
			// Get the stay
			Integer stay =HL7Utils.getIntegerFromNM(pv2.getEstimatedLengthOfInpatientStay());
			
			// WDEV-12588 if specialty supplied, ensure there is a mapping for it
			Specialty specialty = (Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue());
			if (ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue() && specialty == null 
					&& pv1.getHospitalService().getValue() != null && !pv1.getHospitalService().getValue().equals(Hl7Null))  // WDEV-12810
			{
				throw new HL7Exception("Specialty not found with mapping value = " + pv1.getHospitalService().getValue());
			}
			getADT().transferPatient(patVo, hcp, loc,stay,locFrom,transferDT, transactionDT, specialty);
		}
		catch (Exception ex)
		{
			LOG.error(ex);
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}

}
