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

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.IN1;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ims.admin.vo.ConfigPropertyVo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.ConfigItems;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CareSpellVo;
import ims.core.vo.InsuranceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.core.vo.PatientMedicalInsuranceVo;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;

public class A28VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A28VoMapper.class);
	
	
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return (processPatientUpdate(msg, providerSystem));
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}	
	
	public Message populateMessage(PatientRefVo patient, String hl7Application,ProviderSystemVo providerSystem) throws Exception
	{
		// Get the Full Patient
		Patient fullPatient = demog.getPatient(patient);
		
		// A05 is the format used for A28 messages
		ADT_A05 a28Msg = new ADT_A05();
		PID pid = a28Msg.getPID();
		renderPatientVoToPID(fullPatient, pid, getProviderSystem(hl7Application));
		PV1 pv = a28Msg.getPV1();
		pv.getPatientClass().setValue("U");  // Unknown - only mandatory item
		
		NK1 nk1 = a28Msg.getNK1();
		renderNextOfKinVoToNK1(fullPatient.getNok(), nk1,providerSystem);
		PD1 pd1=a28Msg.getPD1();
		
		//GP
		renderGPDetailsToPD1(fullPatient,pd1);
		
		IN1 in1 = a28Msg.getADT_A05_IN1IN2IN3ROL().getIN1();
		IN1 in1EHIC= a28Msg.getADT_A05_IN1IN2IN3ROL(1).getIN1();
		
		if(fullPatient.getInsuranceIsNotNull())
		{
			renderInsuranceToIN1(fullPatient.getInsurance(),in1,getProviderSystem(hl7Application));
		}
		if(fullPatient.getCurrentMedicalInsuranceIsNotNull())
		{
			renderPatientMedicalInsuranceToIN1(fullPatient.getCurrentMedicalInsurance(),in1,getProviderSystem(hl7Application));
		}
		if(fullPatient.getInsuranceIsNotNull())
		{
			renderEHICToIN1(fullPatient.getInsurance(),in1EHIC,getProviderSystem(hl7Application));
		}

		
		
//		String gpCode=null;
//		if(fullPatient.getGpIsNotNull()&&fullPatient.getGp().getCodeMappingsIsNotNull())
//		{
//			gpCode=fullPatient.getGp().getNationalCode();
//			pd1.getPatientPrimaryCareProviderNameIDNo(0).getIDNumber().setValue(gpCode);
//		}
//		if(fullPatient.getGpIsNotNull()&&fullPatient.getGp().getNameIsNotNull()&&fullPatient.getGpIsNotNull()&&fullPatient.getGp().getName().getSurnameIsNotNull())
//		{
//			pd1.getPatientPrimaryCareProviderNameIDNo(0).getFamilyName().getSurname().setValue(fullPatient.getGp().getName().getSurname()); //
//		}
//		if(fullPatient.getGpIsNotNull()&&fullPatient.getGp().getNameIsNotNull()&&fullPatient.getGpIsNotNull()&&fullPatient.getGp().getName().getForenameIsNotNull())
//		{
//			pd1.getPatientPrimaryCareProviderNameIDNo(0).getGivenName().setValue(fullPatient.getGp().getName().getForename());
//		}
//		
//		if(fullPatient.getGpSurgeryIsNotNull())
//		{
//			String practiceCode = orgLoc.getPracticeNationalCodeForSurgery(fullPatient.getGpSurgery());
//			pd1.getPatientPrimaryFacility(0).getOrganizationName().setValue(practiceCode);
//		}
		
		
		
		
//		This might be a way to implement sending more details about the GP practice		
//		ROL rol = a28Msg.getROL();
//		rol.getRoleInstanceID().getEntityIdentifier().setValue("val");// GP code
//		rol.getActionCode().setValue("UP");//
//		rol.getRoleROL().getIdentifier().setValue("PP");
//		renderGpShortVoToXCN(fullPatient.getGp(), rol.getRolePerson(0), providerSystem); 
//		renderAddressVoToXAD(org.getAddress(), rol.getOfficeHomeAddress(0), providerSystem);
//		renderCommChannelVoCollectionToXTN(org.getCommChannels(), rol.getPhone(0));
		
		populateMSH(a28Msg, getProviderSystem(hl7Application));
		populateEVN(a28Msg);
		return a28Msg;
	}
	
	protected void renderPatientMedicalInsuranceToIN1(PatientMedicalInsuranceVo medicalInsurance,IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		if(medicalInsurance==null||in1==null||providerSystem==null)
		{
			return;
		}
		//IN1-3
		if(medicalInsurance.getCompanyIsNotNull()&&medicalInsurance.getCompany().getCodeMappingsIsNotNull())
		{
			String companyName  = medicalInsurance.getCompany().getCodeMappings().getMappingValue(providerSystem.getCodeSystem());
			in1.getInsuranceCompanyID(0).getID().setValue(companyName);
		}
		//IN1-36
		if(medicalInsurance.getPolicyNumberIsNotNull())
		{
			in1.getPolicyNumber().setValue(medicalInsurance.getPolicyNumber());
		}
		//IN1-2
		if(medicalInsurance.getPolicyTypeIsNotNull())
		{
			in1.getInsurancePlanID().getIdentifier().setValue(svc.getRemoteLookup(medicalInsurance.getPolicyType().getID(), providerSystem.getCodeSystem().getText()));
		}
		//IN1-13
		if(medicalInsurance.getExpiryDateIsNotNull())
		{
			in1.getPlanExpirationDate().setValue(medicalInsurance.getExpiryDate().toString(DateFormat.ISO));
		}
		
	}
	
	
	protected void renderInsuranceToIN1(InsuranceVo insurance,IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		if(insurance!=null||in1==null||providerSystem==null)
		{
		// Medical Card / Insurance	
		
		//IN1-28
			in1.getSetIDIN1().setValue("1");
			if(insurance.getHealthActCategoryIsNotNull())
			{
				in1.getPreAdmitCert().setValue(svc.getRemoteLookup(insurance.getHealthActCategory().getID(), providerSystem.getCodeSystem().getText()));
			}
		//IN1-35
		//IN1-31
			if(insurance.getMedicalCardProvedIsNotNull())
			{
				in1.getBillingStatus().setValue(svc.getRemoteLookup(insurance.getMedicalCardProved().getID(), providerSystem.getCodeSystem().getText()));
			}
		//IN1-14-3
			if(insurance.getEligibilityProofIsNotNull())
			{
				in1.getAuthorizationInformation().getSource().setValue(insurance.getEligibilityProof());
			}
		//IN1-29
			if(insurance.getMedicalCardNoIsNotNull())
			{
				in1.getCompanyPlanCode().setValue(insurance.getMedicalCardNo());
			}
		}
		
	}
	
	
	
	protected void renderEHICToIN1(InsuranceVo insurance, IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception {
		if (insurance != null || in1 == null || providerSystem == null)
		{
			in1.getSetIDIN1().setValue("2");
			// IN1-2
			in1.getInsurancePlanID().getIdentifier().setValue("EHIC");
			// IN1-3
			in1.getInsuranceCompanyID(0).getID().setValue("EHIC");
			// IN1-36
			if (insurance.getEHICNumberIsNotNull())
			{
				in1.getPolicyNumber().setValue(insurance.getEHICNumber());
			}
			// IN1-13
			if (insurance.getEHICExpiryDateIsNotNull())
			{
				in1.getPlanExpirationDate().setValue(
						insurance.getEHICExpiryDate().toString(DateFormat.ISO));
			}
			// IN1-5-6
			if (insurance.getEHICCountryIsNotNull())
			{
				in1.getInsuranceCompanyAddress(0).getCountry().setValue(svc.getRemoteLookup(insurance.getEHICCountry().getID(),providerSystem.getCodeSystem().getText()));
			}
			// IN1-4
			if (insurance.getEHICInstitutionIsNotNull())
			{
				in1.getInsuranceCompanyName(0).getOrganizationName().setValue(insurance.getEHICInstitution());
			}
		}
	}
	
	
	
	private void populateEVN(ADT_A05 msg) throws Exception
	{
		EVN evn = msg.getEVN();
		
		evn.getEventTypeCode().setValue("A28");
		renderDateTimeVoToTS(new DateTime(), evn.getRecordedDateTime());
	}

	private void populateMSH(ADT_A05 msg, ProviderSystemVo providerSystem) throws DataTypeException, Exception
	{
		LOG.debug("A28VoMapper populateMSH: entry");
		String receivingFacility=null;
		ConfigPropertyVo prop = providerSystem.getConfigurationProperty(ConfigItems.Hl7Facility);
		if (prop != null)
		{
			receivingFacility = prop.getPropertyValue();
		}
		if (receivingFacility == null)
			receivingFacility = cfg.getReceivingFacility();
		String processingId=null;
		ConfigPropertyVo hl7Prop = providerSystem.getConfigurationProperty(ConfigItems.ProcessingID);
		if (hl7Prop != null)
		{
			processingId=hl7Prop.getPropertyValue();
		}
		if (processingId == null)
			processingId = cfg.getProcessingId();
		DateTime msgDateTime = new DateTime();
		renderDateTimeVoToTS(msgDateTime, msg.getMSH().getDateTimeOfMessage());
		msg.getMSH().getSendingApplication().getNamespaceID().setValue(cfg.getSendApplication());
		msg.getMSH().getSendingFacility().getNamespaceID().setValue(cfg.getSendFacility()); 

		msg.getMSH().getFieldSeparator().setValue("|");  
		msg.getMSH().getEncodingCharacters().setValue("^~\\&");
		msg.getMSH().getReceivingApplication().getNamespaceID().setValue(providerSystem.getHl7Application());
		msg.getMSH().getReceivingFacility().getNamespaceID().setValue(receivingFacility);
		msg.getMSH().getVersionID().getVersionID().setValue("2.4");
		msg.getMSH().getMessageType().getMessageType().setValue("ADT");
		msg.getMSH().getMessageType().getTriggerEvent().setValue("A28");
		msg.getMSH().getProcessingID().getProcessingID().setValue(processingId);  // Debug / Production / Training
		msg.getMSH().getMessageControlID().setValue(new String() + new java.util.Date().getTime());
		LOG.debug("A28VoMapper populateMSH: exit");
		
	}
	
	
	protected Message processPatientUpdate(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return this.processPatientUpdate(msg, providerSystem, true);
	}
	
	protected Message processPatientUpdate(Message msg, ProviderSystemVo providerSystem, boolean includeNok) throws HL7Exception
	{
		try
		{
			Patient patVo = savePatient(msg, providerSystem, includeNok);
			PV1 pv1 = (PV1) msg.get("PV1");
			if (ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
			{
				createCareSpell(patVo, pv1,providerSystem);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}

	private void createCareSpell(Patient patVo, PV1 pv1,ProviderSystemVo providerSystem) throws HL7Exception 
	{
		
		PasEventVo pas=new PasEventVo();
		String visitId=pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
		if (pv1.getAlternateVisitID().getID().getValue()!=null)
		{
			String pasEpisodeId=pv1.getAlternateVisitID().getID().getValue();	
			if (psearch.getPasEvent(pasEpisodeId,patVo,visitId)==null)
			{
				pas.setPatient(patVo);
				
				try 
				{
					fillPasEventFromPV1(pv1, pas, getOrgLoc(), getHcpAdmin(),providerSystem);
				} 
				catch (Exception e) 
				{
					throw new HL7Exception(e.getMessage(), e);
				}
				
				
				CareSpellVo careSpell=createCareSpellVo(pas,pv1);
				try 
				{
					pas = saveCareSpell(careSpell);
				} 
				catch (StaleObjectException e) 
				{
					throw new HL7Exception(e.getMessage(), e);
				}
			}
		}
	}

}
