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

import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.GpLiteVo;
import ims.core.vo.HL7ReferralVo;
import ims.core.vo.MedicVo;
import ims.core.vo.MedicWithMappingsLiteVo;
import ims.core.vo.Patient;
import ims.core.vo.lookups.ReferralPriority;
import ims.core.vo.lookups.ReferralType;
import ims.core.vo.lookups.SourceOfReferral;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.pathways.domain.HL7PathwayIf;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v23.message.REF_I13;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.message.REF_I12;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.RF1;

public class I12VoMapper extends VoMapper {
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
		// Identify the Patient, Register if required
		Patient patient = savePatient(msg, providerSystem);
		RF1 rf1 = (RF1) msg.get("RF1");
		
		// Get the external referral identifier which is unique per referral
		String rkey = rf1.getOriginatingReferralIdentifier().getEntityIdentifier().getValue();
		
		// See if a referral exists for this patient and referral key
		// if so, we will update it, if not, create it
		HL7ReferralVo referral = hL7PathwayIf.getReferralByPatientAndRKEY(patient, rkey);

		// If this message is an instance of I13 and the referral is not found, reject
		// the message as I13 is a referral update message
		if (referral == null && msg instanceof REF_I13)
			throw new HL7Exception("Referral not found, this referral cannot be updated");
		
		if (referral == null)
			referral = new HL7ReferralVo();
		
		if (rf1.getReferralStatus().getIdentifier().getValue().equalsIgnoreCase("Y"))
			referral.setIsActive(Boolean.TRUE);
		else
			referral.setIsActive(Boolean.FALSE);
		
		PV1 pv1 = (PV1) ((REF_I12)msg).getREF_I12_AUTCTD().get("PV1");
		
		referral.setPatient(patient);
		referral.setReferralPriority((ReferralPriority)svc.getLocalLookup(ReferralPriority.class, ReferralPriority.TYPE_ID, providerSystem.getCodeSystem().getText(), rf1.getReferralPriority().getIdentifier().getValue()));
		referral.setExtReferralKey(rkey);
		if (rf1.getEffectiveDate() != null && rf1.getEffectiveDate().getTimeOfAnEvent() != null && rf1.getEffectiveDate().getTimeOfAnEvent().getValue() != null)
			referral.setReferralReceivedDate(new Date(rf1.getEffectiveDate().getTimeOfAnEvent().getValue(), DateFormat.ISO));
		if (rf1.getProcessDate() != null && rf1.getProcessDate().getTimeOfAnEvent() != null && rf1.getProcessDate().getTimeOfAnEvent().getValue() != null)
			referral.setOriginalReferralDate(new Date(rf1.getProcessDate().getTimeOfAnEvent().getValue(), DateFormat.ISO));
		if (pv1.getContractEffectiveDate(0) != null)
			referral.setDateOfReferral(new Date(pv1.getContractEffectiveDate(0).toString(), DateFormat.ISO));
		referral.setAuthoringDateTime(new DateTime());
		CE refDet = rf1.getReferralReason()[0];
		referral.setReferralDetails(refDet.getIdentifier().getValue());
		referral.setDetails(rf1.getExternalReferralIdentifier()[0].getEntityIdentifier().getValue());
		
		if (pv1.getAdmitDateTime() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
			referral.setFirstApptDate(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));
		
		
		referral.setSpecialty((Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));

		MedicVo medic = hcpAdmin.getMedicByNationalCode(pv1.getAttendingDoctor(0).getIDNumber().getValue());
		referral.setReferredTo(medic);
		if (medic == null)
		{
			// Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
			String pasCode = pv1.getAttendingDoctor(1).getIDNumber().getValue();
			if (pasCode != null)
			{
				MedicWithMappingsLiteVo medLite = hcpAdmin.getMedicMedicMappingsByPasCode(pasCode);
				referral.setReferredTo(medLite);
			}
		}
		
		referral.setReferralType(ReferralType.EXTERNAL);
		referral.setSourceOfReferral((SourceOfReferral) svc.getLocalLookup(SourceOfReferral.class, SourceOfReferral.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getAdmitSource().getValue()));
		
		if (pv1.getReferringDoctor(0) != null)	
		{
			GpLiteVo gp = gpAdmin.getGPByTaxonomyType(pv1.getReferringDoctor(0).getIDNumber().getValue(), TaxonomyType.NAT_GP_CODE);
			if (gp == null && pv1.getReferringDoctor(1).getIDNumber().getValue() != null) // See if second repetition has been supplied and try to get by PAS code
				gp = gpAdmin.getGPByTaxonomyType(pv1.getReferringDoctor(1).getIDNumber().getValue(), TaxonomyType.PAS);
			referral.setReferringGP(gp);
			referral.setSourceOfReferral(SourceOfReferral.GP);
			referral.setReferringClinician(null);  // This will be set below if required, otherwise set to null as GP could be set
			
			// If GP not found, this could be a referring consultant
			if (gp == null)
			{
				HcpRefVo referringMedic = hcpAdmin.getMedicByNationalCode(pv1.getReferringDoctor(0).getIDNumber().getValue());
				if (referringMedic == null && pv1.getReferringDoctor(1) != null && pv1.getReferringDoctor(1).getIDNumber().getValue() != null)
				{
					// WDEV-16443 - check if medic using the PAS code
					referringMedic = hcpAdmin.getMedicMedicMappingsByPasCode(pv1.getReferringDoctor(1).getIDNumber().getValue());
				}
				referral.setReferringClinician(referringMedic);
				referral.setSourceOfReferral(SourceOfReferral.CONSULTANT);
			}
			
			// The referring location is sent down in the assigning facility of PV1-8
			if (pv1.getReferringDoctor(0).getAssigningFacility() != null)
			{
				referral.setReferralLocation(pv1.getReferringDoctor(0).getAssigningFacility().getUniversalID().getValue());
			}
		}
		

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
