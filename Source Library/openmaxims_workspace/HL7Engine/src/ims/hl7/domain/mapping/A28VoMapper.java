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


import ims.admin.vo.ConfigPropertyVo;
import ims.configuration.ConfigItems;
import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CareSpellVo;
import ims.core.vo.NationalHealthCoverVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.PatRelative;
import ims.core.vo.Patient;
import ims.core.vo.PatientMedicalInsuranceVo;
import ims.core.vo.lookups.PrivateInsurancePolicyType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;

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

public class A28VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A28VoMapper.class);
	
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
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
		if(fullPatient!=null  //http://jira/browse/WDEV-18571
				&&fullPatient.getSCN()!=null)
			pid.getIdentityReliabilityCode(0).setValue(fullPatient.getSCN().toString());
		PV1 pv = a28Msg.getPV1();
		pv.getPatientClass().setValue("U");  // Unknown - only mandatory item
		
		
		//WDEV-22006 Comment out following code and replace by calling a single method
		
//		NK1 nk1 = a28Msg.getNK1();
//		//WDEV-20335
//		Boolean isConfidential = fullPatient.getIsConfidential();
//		
//		//WDEV-20336 Populate NK1 from PDSRelative object first. If object is Null then use Next of Kin VO
//		int NK1Iteration = 0;
//		
//		if(fullPatient.getPDSrelatives() != null
//				&& fullPatient.getPDSrelatives().size() > 0)
//		{
//			for (int i=0; i < fullPatient.getPDSrelatives().size(); i++)
//			{
//				PatRelative patRelative = fullPatient.getPDSrelatives().get(i);
//				renderPatRelativeVoToNK1(patRelative, nk1, providerSystem, isConfidential);
//				NK1Iteration ++;
//			}
//		}
//		else
//		{
//			renderNextOfKinVoToNK1(fullPatient.getNok(), nk1, providerSystem, isConfidential);
//			NK1Iteration ++;
//		}//WDEV-20336
//		
//		// WDEV-19988
//		// If config flag HL7_INCLUDE_FAMILY_SUPPORT  is true and 
//		// any support family network contact details exist, then add these as NK1 segments (within a loop)
//		if(fullPatient.getSupportNetworkFamilyIsNotNull() 
//				&& ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
//		{
//			
//			for (int i=0; i<fullPatient.getSupportNetworkFamily().size(); i++)
//			{
//				NK1 sfn = a28Msg.getNK1(NK1Iteration);
//				if(fullPatient.getSupportNetworkFamily().get(i).getInactivatingDateTime()==null)
//				{
//					//WDEV-20335
//					renderSupportNetworkFamilyVoToNK1(fullPatient.getSupportNetworkFamily().get(i), sfn, providerSystem, isConfidential); //WDEV-20335
//					NK1Iteration++;
//				}
//			}
//		}

		renderPatientVoToNK1(fullPatient, a28Msg, providerSystem);
		//WDEV-22006
		
		//
		PD1 pd1=a28Msg.getPD1();
		
		//GP
		//WDEV-20993
//		renderGPDetailsToPD1(fullPatient,pd1);
		renderGPDetailsToPD1(fullPatient, pd1, providerSystem);
		
		IN1 in1 = a28Msg.getADT_A05_IN1IN2IN3ROL().getIN1();
		IN1 in1EHIC= a28Msg.getADT_A05_IN1IN2IN3ROL(1).getIN1();
		
		if(fullPatient.getNationalHealthCoverIsNotNull())
		{
			renderInsuranceToIN1(fullPatient.getNationalHealthCover(),in1,getProviderSystem(hl7Application));
		}
		if(fullPatient.getCurrentMedicalInsuranceIsNotNull())
		{
			renderPatientMedicalInsuranceToIN1(fullPatient.getCurrentMedicalInsurance(),in1,getProviderSystem(hl7Application));
		}
		if(fullPatient.getNationalHealthCoverIsNotNull())
		{
			renderEHICToIN1(fullPatient.getNationalHealthCover(),in1EHIC,getProviderSystem(hl7Application));
		}

		//WDEV-22624
		renderPatientDetailsToPD1(fullPatient, pd1, providerSystem); //WDEV-22624
		
		
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
		//WDEV-22918
//		populateEVN(a28Msg);
		populateEVN(a28Msg, fullPatient); //WDEV-22918
		return a28Msg;
	}
	
	//WDEV-22750 - Moved code to VoMapper
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
		if(medicalInsurance.getPolicyTypeIsNotNull()&&!(medicalInsurance.getPolicyType().getID()==(PrivateInsurancePolicyType.OTHER.getID())))
		{
			in1.getInsurancePlanID().getIdentifier().setValue(svc.getRemoteLookup(medicalInsurance.getPolicyType().getID(), providerSystem.getCodeSystem().getText()));
		}
		else if(medicalInsurance.getPlanOrUnitsIsNotNull())
		{
			in1.getInsurancePlanID().getIdentifier().setValue(medicalInsurance.getPlanOrUnits());
		}
		//IN1-13
		if(medicalInsurance.getExpiryDateIsNotNull())
		{
			in1.getPlanExpirationDate().setValue(medicalInsurance.getExpiryDate().toString(DateFormat.ISO));
		}
		
	}
	
	//WDEV-22750 - Moved code to VoMapper
	protected void renderInsuranceToIN1(NationalHealthCoverVo insurance,IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception
	{
		if (insurance != null || in1 == null || providerSystem == null)
		{
		// Medical Card / Insurance	
		
		//IN1-28
			in1.getSetIDIN1().setValue("1");

			//WDEV-23272
//			if (insurance.getHealthActCategoryIsNotNull())
//			{
//				
//				in1.getPreAdmitCert().setValue(svc.getRemoteLookup(insurance.getHealthActCategory().getID(), providerSystem.getCodeSystem().getText()));
//			}
			//WDEV-23272
			if (insurance.getEligibilityIsNotNull())
			{
				in1.getPreAdmitCert().setValue(svc.getRemoteLookup(insurance.getEligibility().getID(), providerSystem.getCodeSystem().getText()));
			}
			if(insurance.getMedicalCardExpiryDateIsNotNull())
			{
				in1.getVerificationDateTime().getTimeOfAnEvent().setValue(insurance.getMedicalCardExpiryDate().toString(DateFormat.ISO));
			} //WDEV-23272
			
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
	
	
	//WDEV-22750 - Moved code to VoMapper
	protected void renderEHICToIN1(NationalHealthCoverVo insurance, IN1 in1,ProviderSystemVo providerSystem) throws HL7Exception {
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
			//WDEV-22621
//			// IN1-4
//			if (insurance.getEHICInstitutionIsNotNull())
//			{
//				in1.getInsuranceCompanyName(0).getOrganizationName().setValue(insurance.getEHICInstitution());
//			}
			if (insurance.getEHICInstitutionCodeIsNotNull())
			{
				in1.getInsuranceCompanyName(0).getOrganizationName().setValue(svc.getRemoteLookup(insurance.getEHICInstitutionCode().getID(),providerSystem.getCodeSystem().getText()));
			} //WDEV-22621
			
		}
	}
	
	
	//WDEV-22918
//	private void populateEVN(ADT_A05 msg) throws Exception
	private void populateEVN(ADT_A05 msg, Patient fullPatient) throws Exception //WDEV-22918
	{
		EVN evn = msg.getEVN();
		
		evn.getEventTypeCode().setValue("A28");
		//WDEV-22918
//		renderDateTimeVoToTS(new DateTime(), evn.getRecordedDateTime());
		if (fullPatient.getSysInfo() != null)
		{
			if (fullPatient.getSysInfo().getLastupdateDateTime() != null)
			{
				renderDateTimeVoToTS(fullPatient.getSysInfo().getLastupdateDateTime(), evn.getRecordedDateTime());
			}
			else if (fullPatient.getSysInfo().getCreationDateTime() != null)
			{
				renderDateTimeVoToTS(fullPatient.getSysInfo().getCreationDateTime(), evn.getRecordedDateTime());
			}
		} //WDEV-22918
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
	
	//WDEV-20112
//	protected Message processPatientUpdate(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	protected EventResponse processPatientUpdate(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		return this.processPatientUpdate(msg, providerSystem, true);
	}
	
	//WDEV-20112
//	protected Message processPatientUpdate(Message msg, ProviderSystemVo providerSystem, boolean includeNok) throws HL7Exception
	protected EventResponse processPatientUpdate(Message msg, ProviderSystemVo providerSystem, boolean includeNok) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		try
		{
			Patient patVo = savePatient(msg, providerSystem, includeNok);
			
			//WDEV-20112
			response.setPatient(patVo); //WDEV-20112
			
			PV1 pv1 = (PV1) msg.get("PV1");
			if (ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
			{
				createCareSpell(patVo, pv1,providerSystem);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		
		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
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
				
				//WDEV-20278
//				CareSpellVo careSpell=createCareSpellVo(pas,pv1);
				CareSpellVo careSpell = createCareSpellVo(pas, pv1, providerSystem); //WDEV-20278
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
