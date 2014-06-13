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

import java.text.ParseException;

import org.apache.log4j.Logger;

import ims.clinical.vo.AdmissionMedicationChangesVo;
import ims.clinical.vo.AdmissionMedicationChangesVoCollection;
import ims.clinical.vo.PatientTTOIfVo;
import ims.clinical.vo.TTODetailsIFVo;
import ims.clinical.vo.TTODetailsIFVoCollection;
import ims.core.vo.Patient;
import ims.core.vo.lookups.MedicationDoseUnit;
import ims.core.vo.lookups.MedicationRoute;
import ims.core.vo.lookups.YesNo;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.ST;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.group.RDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1;
import ca.uhn.hl7v2.model.v24.message.RDS_O13;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.RXD;
import ca.uhn.hl7v2.model.v24.segment.RXR;

public class O13VoMapper extends VoMapper {

	@Override
	public Message populateMessage() {
		// Not required for inbound messages
		return null;
	}

	private static final Logger			LOG		= Logger.getLogger(O13VoMapper.class);

	
	@Override
	public Message processEvent(Message msg, ProviderSystemVo providerSystem)
			throws HL7Exception {
		
		
		PID pid=null;
		RXD rxd=null;
		RXR rxr=null;
		RDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1 group = null;
		ORC orc = null;
		int RXDCount=0;
		PatientTTOIfVo patientTTO = new PatientTTOIfVo();
		TTODetailsIFVoCollection ttos = new TTODetailsIFVoCollection();
		patientTTO.setTTOs(ttos);
		
		AdmissionMedicationChangesVoCollection medChanges = new AdmissionMedicationChangesVoCollection();
		patientTTO.setMedicationChanges(medChanges);
		
		if (msg instanceof RDS_O13)
		{
			pid=((RDS_O13)msg).getRDS_O13_PIDPD1NTEAL1PV1PV2().getPID();
			RXDCount=((RDS_O13)msg).getRDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1Reps();
//			rxd=((RDS_O13)msg).getRDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1().getRXD();
		}
		
		for (int i=0;i<RXDCount;i++)
		{
		group=((RDS_O13)msg).getRDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1(i);
		rxd=group.getRXD();
		orc=group.getORC();
		rxr=group.getRXR();
		
		 if(orc==null||orc.getOrderControl()==null||orc.getOrderControl().getValue()==null)
			 throw new HL7Exception("Failed to read order control");
		 if("NW".equals(orc.getOrderControl().getValue()))//||!"OD".equals(orc.getOrderControl().getValue()))
		 {		 
		 
		
		TTODetailsIFVo ttoDetails = new TTODetailsIFVo();

//		String dispenseGiveCodeSystem=rxd.getDispenseGiveCode().getNameOfCodingSystem().getValue();// Should always be JAC
		String dispenseGiveCode=rxd.getDispenseGiveCode().getText().getValue();
		ttoDetails.setMedication(dispenseGiveCode);
		
		try{
		DateTime d=new DateTime(rxd.getDateTimeDispensed().getTimeOfAnEvent().getValue());
		ttoDetails.setDateDispensed(d);
		}catch (ParseException pe)
		{
			LOG.error("Failed to parse date in RDX-3 Date/Time Dispensed.",pe);
			throw new HL7Exception("Failed to parse date in RDX-3 Date/Time Dispensed.",pe);
		}

		String ActualDispenseAmount=rxd.getActualDispenseAmount().getValue();

		try {
			ttoDetails.setDoseAmount(Float.parseFloat(ActualDispenseAmount));
		}catch (NumberFormatException nfe)
		{
			LOG.error("Invalid data: ActualDispenseAmount: "+ActualDispenseAmount+" failed to convert to an Float",nfe);
			throw new HL7Exception("Invalid data: ActualDispenseAmount: "+ActualDispenseAmount+" failed to convert to an Float",nfe);
		}

//		String ActualDispenseUnitsSystem=rxd.getActualDispenseUnits().getNameOfCodingSystem().getValue();// Should always be JAC
		String ActualDispenseUnits=rxd.getActualDispenseUnits().getText().getValue();
		MedicationDoseUnit dose = (MedicationDoseUnit)svc.getLocalLookup(MedicationDoseUnit.class,MedicationDoseUnit.TYPE_ID,providerSystem.getCodeSystem().getText(),ActualDispenseUnits);
		if (dose==null)
		{
			dose = (MedicationDoseUnit)addLookupInstanceMapping(MedicationDoseUnit.class, MedicationDoseUnit.TYPE_ID, ActualDispenseUnits,ActualDispenseUnits, providerSystem.getCodeSystem().getText());
		}
		ttoDetails.setDoseUnit(dose);
		
		String NoOfRefillsRemaining=rxd.getNumberOfRefillsRemaining().getValue();
		try{
			ttoDetails.setDaysSupply(Integer.parseInt(NoOfRefillsRemaining));
		} catch (NumberFormatException nfe)
		{
			LOG.error("Invalid data: getNumberOfRefillsRemaining: "+NoOfRefillsRemaining+" failed to convert to an Integer",nfe);
			throw new HL7Exception("Invalid data: getNumberOfRefillsRemaining: "+NoOfRefillsRemaining+" failed to convert to an Integer",nfe);
		}
		
		
		String DispenseNotes="";
		
		ST[] notes=rxd.getDispenseNotes();
		for (ST st : notes) {
			if(!DispenseNotes.equals(""))
			{
				DispenseNotes+="\n";
			}
			DispenseNotes+=st.getValue();
		}
		
		ttoDetails.setFrequency(DispenseNotes);
		
//		String NeedsHumanReview=rxd.getNeedsHumanReview().getValue();
//		YesNo yesNo=(YesNo)svc.getLocalLookup(YesNo.class, YesNo.TYPE_ID, getCurrentProviderExternalCode(), NeedsHumanReview) ;
//MN		ttoDetails.setNeedsHumanReview(yesNo);
		
//		String SpecialDispensingInstructions="";
		CE[] instructions =rxd.getPharmacyTreatmentSupplierSSpecialDispensingInstructions();
//		for (CE ce : instructions) {
//			if (!SpecialDispensingInstructions.equals(""))
//			{
//				SpecialDispensingInstructions+="\n";
//			}
//			SpecialDispensingInstructions+=ce.getText();
//		}
//MN		ttoDetails.setSpecialDispensingInstructions(SpecialDispensingInstructions);
		
		if(instructions!=null&&instructions[0]!=null&&instructions[0].getText()!=null)
		{
			String gpToContinue= instructions[0].getText().getValue();
			YesNo yesNoGP=(YesNo)svc.getLocalLookup(YesNo.class, YesNo.TYPE_ID, providerSystem.getCodeSystem().getText(), gpToContinue);
			ttoDetails.setGpToContinue(yesNoGP);
		}
		
		if(rxr!=null&&rxr.getRoute()!=null&&rxr.getRoute().getText()!=null)
		{
			String route = rxr.getRoute().getText().getValue();
			MedicationRoute medRoute = (MedicationRoute)svc.getLocalLookup(MedicationRoute.class, MedicationRoute.TYPE_ID,  providerSystem.getCodeSystem().getText(), route);
			ttoDetails.setRoute(medRoute);
		}
		
		
		ttos.add(ttoDetails);
		}
		else if ("OD".equals(orc.getOrderControl().getValue()))
		{
			AdmissionMedicationChangesVo medChange = new AdmissionMedicationChangesVo();
			medChange.setMedication(rxd.getDispenseGiveCode().getText().getValue());
			
			String noteText="";
			ST[] notes = rxd.getDispenseNotes();
			for (ST st : notes) {
				if (!noteText.equals(""))
				{
					noteText+="\n";
				}
				noteText+=st.getValue();
			}
			medChange.setMedicationChanges(noteText);
			medChanges.add(medChange);
		}
		else
		{
			throw new HL7Exception("Order Control not OD or NW");
		}
		 
		}
		
		
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		try {
			Patient patVo2 = getDemog().getPatient(patVo);
			patientTTO.setPatient(patVo2);
		} catch (StaleObjectException soe)
		{
			LOG.error("Patient record updated externally.Please resubmit message", soe);
			throw new HL7Exception("Patient record updated externally.Please resubmit message");
		}
		catch (Exception e)
		{
			LOG.error(e.getMessage(),e);
			throw new HL7Exception(e.getMessage());
		}


		
		try {
			hl7tto.setPatientCareContextTTORecord(patientTTO);
		}
		catch (DomainRuntimeException dre)
		{
			LOG.error(dre.getMessage(),dre);
			throw new HL7Exception(dre.getMessage());
		}
		catch (StaleObjectException soe)
		{
			LOG.error(soe.getMessage(),soe);
			throw new HL7Exception(soe.getMessage());
		}
		catch (Exception e)
		{
			LOG.error(e.getMessage(),e);
			throw new HL7Exception(e.getMessage());
		}
		
		 Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));;
		 return ack;
	}

}
