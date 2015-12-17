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
package ims.hl7.domain.mapping;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import ims.clinical.vo.AdmissionMedicationChangesVo;
import ims.clinical.vo.AdmissionMedicationChangesVoCollection;
import ims.clinical.vo.PatientTTOIfVo;
import ims.clinical.vo.TTANoteVo;
import ims.clinical.vo.TTANoteVoCollection;
import ims.clinical.vo.TTODetailsIFVo;
import ims.clinical.vo.TTODetailsIFVoCollection;
import ims.core.vo.Patient;
import ims.core.vo.lookups.MedicationDoseUnit;
import ims.core.vo.lookups.MedicationRoute;
import ims.core.vo.lookups.YesNo;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.ST;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.group.RDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1;
import ca.uhn.hl7v2.model.v24.message.RDS_O13;
import ca.uhn.hl7v2.model.v24.segment.NTE;
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
	//WDEV-20113
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 

	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		PID pid=null;
		RXD rxd=null;
		RXR rxr=null;
		RDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1 group = null;
		ORC orc = null;
		NTE nte = null;
		int RXDCount=0;
		PatientTTOIfVo patientTTO = new PatientTTOIfVo();
		TTODetailsIFVoCollection ttos = new TTODetailsIFVoCollection();
		patientTTO.setTTOs(ttos);
		
		AdmissionMedicationChangesVoCollection medChanges = new AdmissionMedicationChangesVoCollection();
		patientTTO.setMedicationChanges(medChanges);
		Map<Integer, List<TTANoteVo>> drugNotes = new HashMap<Integer, List<TTANoteVo>>(); //WDEV-18997
		
		if (msg instanceof RDS_O13)
		{
			pid=((RDS_O13)msg).getRDS_O13_PIDPD1NTEAL1PV1PV2().getPID();
			int nteCount = ((RDS_O13)msg).getRDS_O13_PIDPD1NTEAL1PV1PV2().getNTEReps();
			for (int i=0;i<nteCount;i++)
			{
				nte=((RDS_O13)msg).getRDS_O13_PIDPD1NTEAL1PV1PV2().getNTE(i);
				TTANoteVo note = getTTANote(nte);
				
				Integer perscriptionNumber=null;
				try 
				{
					perscriptionNumber = Integer.parseInt(nte.getSetIDNTE().getValue());	
				}
				catch (NumberFormatException nfe)
				{
					perscriptionNumber=null;
				}
				
				
				if (perscriptionNumber!=null&&perscriptionNumber.equals(12))
				{
					if(patientTTO.getTTANotes()==null)
					{
						patientTTO.setTTANotes(new TTANoteVoCollection());
					}
					patientTTO.getTTANotes().add(note);
				}
				else if(perscriptionNumber!=null&&perscriptionNumber.intValue()>99)
				{
					List<TTANoteVo> notes=drugNotes.get(perscriptionNumber);
					if(notes==null)
					{
						notes= new ArrayList<TTANoteVo>();
					}
					notes.add(note);
					drugNotes.put(perscriptionNumber, notes);
				}
						
			}
			RXDCount=((RDS_O13)msg).getRDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1Reps();
//			rxd=((RDS_O13)msg).getRDS_O13_ORCRXONTERXRRXCNTERXERXRRXCRXDRXRRXCOBXNTEFT1().getRXD();
		}
		
		for (int i=0; i<RXDCount; i++)
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
			
			Integer num = null;
			try
			{
				num= Integer.parseInt(rxd.getPrescriptionNumber().getValue());
			}
			catch (NumberFormatException nfe)
			{
				 num=null;
			}
			if(num!=null)
			{
				List<TTANoteVo> notes= drugNotes.get(num);
				TTANoteVoCollection notesCollection = new TTANoteVoCollection();
				if(notes!=null)
				{
					for (TTANoteVo note : notes)
					{
						notesCollection.add(note);
					}
				}
				ttoDetails.setMedComments(notesCollection);
			}
			
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
			
			//WDEV-19712 
			if(rxd != null 
					&& rxd.getDispenseSubIDCounter() != null)
			{
				Integer sortOrder = Integer.valueOf(rxd.getDispenseSubIDCounter().getValue());
				ttoDetails.setSortOrder(sortOrder);
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
			//WDEV-20112
			if(patVo2 != null)
			{
				response.setPatient(patVo2);
			} //WDEV-20112
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
			//WDEV-20112
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), dre.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
//			throw new HL7Exception(dre.getMessage());
		}
		catch (StaleObjectException soe)
		{
			LOG.error(soe.getMessage(),soe);
			//WDEV-20112
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), soe.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
//			throw new HL7Exception(soe.getMessage());
		}
		catch (Exception e)
		{
			LOG.error(e.getMessage(),e);
			//WDEV-20112
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response;//WDEV-20112
//			throw new HL7Exception(e.getMessage());
		}

		//WDEV-20112
//		 Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		 return ack;
		response.setMessage(HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}

	
	private TTANoteVo getTTANote(NTE nte) throws HL7Exception
	{
		TTANoteVo note = new TTANoteVo();
		String date = nte.getComment(0).getValue();
		String comment = HL7Utils.getValueFromVariant(nte.getComment(0).getExtraComponents().getComponent(0), 0);
		String surname =HL7Utils.getValueFromVariant(nte.getSourceOfComment().getExtraComponents().getComponent(0),0);
		String forname =HL7Utils.getValueFromVariant(nte.getSourceOfComment().getExtraComponents().getComponent(1),0);
		String title =HL7Utils.getValueFromVariant(nte.getSourceOfComment().getExtraComponents().getComponent(4),0);
		
		StringBuilder fullName = new StringBuilder("");
		if(title!=null)
		{
			fullName.append(title);
			fullName.append(" ");
		}
		if(forname!=null)
		{
			fullName.append(forname);
			fullName.append(" ");
		}
		if(surname!=null)
		{
			fullName.append(surname);
		}
		
		note.setNoteDate(date);
		note.setTTAComment(comment);
		note.setSourceOfInformation(fullName.toString());
		return note;
	}

}
