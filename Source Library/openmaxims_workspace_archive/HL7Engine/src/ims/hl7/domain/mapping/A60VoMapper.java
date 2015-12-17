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

import ims.admin.vo.ConfigPropertyVo;
import ims.admin.vo.ConfigPropertyVoCollection;
import ims.configuration.ConfigItems;
import ims.core.vo.AllergenVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.PatientAllergy;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.lookups.AllergenType;
import ims.core.vo.lookups.SourceofInformation;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;

import ims.framework.utils.PartialDate;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.utils.SegName;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.message.ADT_A60;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.IAM;


public class A60VoMapper extends VoMapper
{	
	private static final Logger		LOG		= Logger.getLogger(A60VoMapper.class);
	
	// This event is called when an patient allergy is received

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{		
		try {
			processPatientAllergy(msg, providerSystem);
		}
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		
		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;	
		
	}

	private void processPatientAllergy(Message msg, ProviderSystemVo providerSystem) throws Exception
	{
	
		//http://jira/browse/WDEV-13713
		//Please populate the Clinical Term and Description fields with the Allergen from IAM:3.2 and the Effect field with the data from IAM:9
		//Please append to the Effect data the following " - Reported by: " and the value from IAM:14.2 
		
		EVN evn = (EVN) msg.get(SegName.EVN);
		
		ADT_A60 a60Mess =  (ADT_A60)msg;
		
		PatientAllergy pa = new PatientAllergy();
				
		/* field 2 */
		/*
		String strTmpDateTime = null;
		strTmpDateTime = evn.getRecordedDateTime().getTimeOfAnEvent().getValue();
		if (strTmpDateTime == null || strTmpDateTime.equals(""))
			throw new HL7Exception("EVN.02 - Recorded Date/Time is a required field");
		else
			nm.addPair("RDAT",strTmpDateTime);
		*/
		String strTmpDateTime = evn.getRecordedDateTime().getTimeOfAnEvent().getValue();
		if (strTmpDateTime == null || strTmpDateTime.equals(""))
		{
			//TODO reject message
			throw new HL7Exception("EVN.02 - Recorded Date/Time is a required field");			
		}
		else
			pa.setWhenIdentified(new PartialDate(strTmpDateTime));
		
		if (a60Mess.getIAMReps() > 0)
		{
		
			IAM iam1 = a60Mess.getIAM(0);
			
			//Authoring information
			AuthoringInformationVo auth = new AuthoringInformationVo();
			auth.setAuthoringDateTime(populateDateTimeVoFromTS(evn.getRecordedDateTime()));
			
			//Ascribe don't send any HCP codes, so we will used a dummy mapped ALLERGY MOS
			auth.setAuthoringHcp(getHcpAllergy());
			pa.setAuthoringInformation(auth);
						
			/* field 18 */
			//IAM.18	Statused by Person	XCN	250		N
			//check all IAM sements for status of reaction first
			/*
			U	Unconfirmed 
			P	Pending 
			S	Suspect 
			C	Confirmed or verified 
			I	Confirmed but inactive 
			E	Erroneous 
			D	Doubt raised 
			*/
			if ((iam1.getAllergyClinicalStatusCode() == null) || (iam1.getAllergyClinicalStatusCode().getIdentifier() == null))
				throw new HL7Exception("IAM.18 - Clinical Status - for reaction - is a required field");
			
			//http://jira/browse/WDEV-13713			
			//always display the status in the effect comment, not to be mapped to the actual status. The allergy should be inactivated manually
//			if (iam1.getAllergyClinicalStatusCode() != null && iam1.getAllergyClinicalStatusCode().getIdentifier() != null 
//					&& iam1.getAllergyClinicalStatusCode().getIdentifier().getValue() != null 
//					&& iam1.getAllergyClinicalStatusCode().getIdentifier().getValue().subSequence(0, 1).equals("C"))
//				pa.setIsCurrentlyActiveAllergy(true);
			pa.setIsCurrentlyActiveAllergy(true);
			
			String allergyStatus = "";
			if (iam1.getAllergyClinicalStatusCode() != null && iam1.getAllergyClinicalStatusCode().getIdentifier() != null)
				allergyStatus = iam1.getAllergyClinicalStatusCode().getIdentifier().getValue();
					
			//PatientAllergyReactionVoCollection paReactColl = new PatientAllergyReactionVoCollection();
			
			/* field 9 */
			//IAM.9.2	Sensitivity to Causative Agent	Note Text	Reaction Text e.g. Causes a red rash.					
			//Allergy reaction text to be stored in EFFC = 255 characters
			//<EFFC />				
			if ((iam1.getSensitivityToCausativeAgentCode() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier().getValue() != null))
			{
				/* field 14 */
				//IAM.14	Reported By	XPN	250		Y	Clinician name
				XPN reportedBy = iam1.getReportedBy();
				String alReportedBy = reportedBy.getGivenName().getValue().toString();
								
				/*
				PatientAllergyReactionVo reactVo = new PatientAllergyReactionVo();				
				//Reaction info
				reactVo.setReaction(getReactionLookup(iam1.getSensitivityToCausativeAgentCode()));
				reactVo.setSeverity(getSeverityLookup(iam1.getAllergySeverityCode()));
				paReactColl.add(reactVo);				
				pa.setReactions(paReactColl);
				*/
								
				//patient info
				pa.setPatient(this.getPatient(a60Mess, providerSystem));			
								
				//TODO allery code may not be given...			
				//!AM.3.3	Allergen Description	Chemical Name	

				//<ALCODE
				//String alCode = iam1.getAllergenCodeMnemonicDescription().getIdentifier().getValue();
				//<ALCODE>
				//String alCode = iam1.getAllergenCodeMnemonicDescription().getIdentifier().getValue();
				//if (alCode != null)

				//TODO review for other provider systems
				//<ALTEXT>
				//always going to be a new record as we don;t get codes from Ascribe.
				
				String alText = iam1.getAllergenCodeMnemonicDescription().getText().getValue();
				
				//http://jira/browse/WDEV-13713
				pa.setAllergenDescription(alText);
				
				AllergenVo allVo = null;
				if (alText != null)
				{
					if ((allVo = allergen.getAllergenByName(alText)) == null)
					{
						allVo = new AllergenVo();
						allVo.setIGenericItemName(alText);
						allVo.setIsActive(true);
						allVo.setAllergenType(AllergenType.MEDICATION);
						
						
						//save allergy first and use as ref in PAtient Allergy
						try
						{
							String[] errors = allVo.validate();
							if (errors != null)
							{
								throw new HL7Exception("Validation of Allergy failed. " + VoMapper.toDisplayString(errors));				
							}
							allVo = allergen.saveAllergenVo(allVo);							
						}
						catch (StaleObjectException e)
						{
							LOG.error("StaleObjectException occurred saving Allergy - " + e.getMessage(), e);
							throw new HL7Exception("Allergy data has been updated by another user/process - please try again", e);
						}
						catch (UniqueKeyViolationException e)
						{
							LOG.error("UniqueKeyViolationException occurred savePatientAllergy " + e.getMessage(), e);
							throw new HL7Exception("UniqueKeyViolationException occurred savePatientAllergy " + e.getMessage(), e);
						}
					}
				}
				else
					allVo = null;
				
				pa.setAllergen(allVo);
								

				// Allergy reaction
				//String alReaction = "Reaction - Status - Reported By\r\n";
				//PatientAllergyReactionVo reactVoR = new PatientAllergyReactionVo();
				String alReaction = "Reaction - Status - Reported By\r\n"; 
				
				
				alReaction += iam1.getSensitivityToCausativeAgentCode().getIdentifier().toString();					
				
				alReaction +=  " - " + allergyStatus + " - " + alReportedBy + "\r\n";
				
				/* field 2 */
				//Allergen Type Code				
				//Code type Medication = -101 = DA = -893 in Maxims Web
				//<ALLCAT>-101</ALLCAT>				
				if (iam1.getAllergenTypeCode().getText().toString().equals("MED"))
				{
					pa.setAllergenType(AllergenType.MEDICATION);
				}				
								
				/* field 6 */
				//IAM.06	Allergy Action Code	CNE	250	Na	N
				
				/* field 7 */
				//IAM.7	Allergy Unique Identifier	Request ID	Long Integer
				//ToDo   discuss how we can use this external id for updates.
				
				/* field 8 */
				//IAM.8	Action Reason		Leave Blank
				
				/* field 9 */
				//IAM.09	Sensitivity to Causative Agent Code	CE	250		Y blank
				
				/* field 10 */
				//IAM.10	Allergen Group Code/Mnemonic/Description	CE	250		N	
				
				/* field 11 */
				//IAM.11	Onset Date	DT	8		N
				// taken from EVN field 2
				
				/* field 12 */
				//IAM.12	Onset Date Text	ST	60		N	
				
				/* field 13 */
				//IAM.13	Reported Date/Time	TS	8		N
								
				/* field 15 */
				//IAM.15	Relationship to Patient Code	CE	250		Y	blank
				
				/* field 16 */
				//IAM.16	Alert Device Code	CE	250		Y	blank
				
				/* field 17 */
				//IAM.17	Allergy Clinical Status Code	CE	250	Status	N
				
				/* field 19 */
				//IAM.19	Statused by Organization	XON	250		N
				
				/* field 20 */
				//IAM.20	Statused at Date/Time	TS	8		N
				
				//PatientAllergyReactionVoCollection paReactCollR = new PatientAllergyReactionVoCollection();
				
				
				//go through repititions for other reaction texts
				for (int i =1; i < a60Mess.getIAMReps(); i++)
				{								
					iam1 = a60Mess.getIAM(i);

					/* field 18 */
					//IAM.18	Statused by Person	XCN	250		N
					//check all IAM sements for status of reaction first
					/*
					U	Unconfirmed 
					P	Pending 
					S	Suspect 
					C	Confirmed or verified 
					I	Confirmed but inactive 
					E	Erroneous 
					D	Doubt raised 
					*/
					if ((iam1.getAllergyClinicalStatusCode() == null) || (iam1.getAllergyClinicalStatusCode().getIdentifier() == null))
						throw new HL7Exception("IAM.18 - Clinical Status - for reaction - is a required field");
					
					if (iam1.getAllergyClinicalStatusCode() != null && iam1.getAllergyClinicalStatusCode().getIdentifier() != null)
						allergyStatus = iam1.getAllergyClinicalStatusCode().getIdentifier().getValue();
					
					/* field 9 */
					//IAM.9.2	Sensitivity to Causative Agent	Note Text	Reaction Text e.g. Causes a red rash.					
					//Allergy reaction text to be stored in EFFC = 255 characters
					//<EFFC />				
					if ((iam1.getSensitivityToCausativeAgentCode() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier().getValue() != null))
					{
						
						//PatientAllergyReactionVo reactVoR = new PatientAllergyReactionVo();
						if (alReaction != "")
							alReaction += "Reaction - Status - Reported By\r\n"; 
						
						//Reaction info
						/*
						if (alReaction == "")
						{
							reactVoR.setReaction(getReactionLookup(iam1.getSensitivityToCausativeAgentCode()));
							reactVoR.setSeverity(getSeverityLookup(iam1.getAllergySeverityCode()));
							paReactCollR.add(reactVoR);
						}						
						*/
						
						/* field 14 */
						//IAM.14	Reported By	XPN	250		Y	Clinician name
						XPN reportedByR = iam1.getReportedBy();
						String alReportedByR = " - " + reportedByR.getGivenName().getValue().toString(); 
						
						alReaction += iam1.getSensitivityToCausativeAgentCode().getIdentifier().toString() + " - " + allergyStatus + " - " + alReportedByR + "\r\n";
					}					
					
					//pa.setReactions(paReactCollR);
					
				}
				
				//add all reactions to the effect
				//http://jira/browse/WDEV-13713
				pa.setComments(alReaction);
				
				//Clinical Contact???
				pa.setSourceofInformation(SourceofInformation.CLINICALCONTACT);
				
			}
			
			//save Patient allergy
			try
			{
				String[] errors = pa.validate();
				if (errors != null)
				{
					throw new HL7Exception("Validation of Patient Allergy failed. " + VoMapper.toDisplayString(errors));				
				}
				allergy.savePatientAllergy(pa);
			}
			catch (StaleObjectException e)
			{
				LOG.error("StaleObjectException occurred saving Allergy - " + e.getMessage(), e);
				throw new HL7Exception("Allergy data has been updated by another user/process - please try again", e);
			}
			catch (UniqueKeyViolationException e)
			{
				LOG.error("UniqueKeyViolationException occurred savePatientAllergy " + e.getMessage(), e);
				throw new HL7Exception("UniqueKeyViolationException occurred savePatientAllergy " + e.getMessage(), e);
			}
			
			
		}		
		
	}

	private HcpLiteVo getHcpAllergy() 
	{
		ims.core.vo.Hcp hcpVo = hcpAdmin.getHcpByExternalCode(TaxonomyType.MAXIMS_INTERNAL, "ASCRIBEALLERGY"); 
		return (hcpVo != null?hcpVo.toHcpLiteVo():null);
	}

	public static ConfigItems[] toConfigItemArray(ConfigPropertyVoCollection properties)
	{
		if (properties == null || properties.size() == 0)
			return null;
		
		ConfigItems[] items = new ConfigItems[properties.size()];
		for (int i=0; i<properties.size(); i++)
		{
			ConfigPropertyVo prop= properties.get(i);
			ConfigItems item = new ConfigItems(prop.getPropertyName(), prop.getPropertyValue());
			items[i] = item;
		}
		return items;
	}
	
	public Message populateMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
