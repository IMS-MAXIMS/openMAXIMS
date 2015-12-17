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
package ims.hl7.nas.mapping;

import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.message.ADT_A60;
import ca.uhn.hl7v2.model.v24.segment.IAM;
import ca.uhn.hl7v2.model.v24.segment.EVN;

public class A60NasMapper extends NasMapper
{
	
	public ImsNasMsg translate(Message msg) throws Exception 
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}

		//EVN
		EVN evn = (EVN) msg.get(SegName.EVN);
		/* field 1 */
		if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A60"))
		{
			throw new HL7Exception("Unexpected Event Type Code for this message type");
		}
		
		ImsNasMsg nm = new ImsNasMsg();		
		Integer pkey = null;
				
		if (((pkey = getPatientHospNum(msg)) != null))
		{			
		
			nm.addPair("*SERVICE", "ALLERGY");
			nm.addPair("ACTION", "INSERT");
			nm.addPair("PKEY", pkey.toString());					
			
			//Get Allergy from IAM segment
			ADT_A60 a60Mess =  (ADT_A60)msg;			
			
			/* field 2 */
			String strTmpDateTime = null;
			strTmpDateTime = evn.getRecordedDateTime().getTimeOfAnEvent().getValue();
			if (strTmpDateTime == null || strTmpDateTime.equals(""))
				throw new HL7Exception("EVN.02 - Recorded Date/Time is a required field");
			else
				nm.addPair("RDAT",strTmpDateTime);
					
			String alReaction = "";
			
			if (a60Mess.getIAMReps() > 0)
			{
				IAM iam1 = a60Mess.getIAM(0);
				
				nm.addPair("RUSR","-1"); // mandatory attributes for Allergy Service
				nm.addPair("RHCP","-1");// mandatory attributes for Allergy Service
				
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

				/* field 9 */
				//IAM.9.2	Sensitivity to Causative Agent	Note Text	Reaction Text e.g. Causes a red rash.					
				//Allergy reaction text to be stored in EFFC = 255 characters
				//<EFFC />				
				if ((iam1.getSensitivityToCausativeAgentCode() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier().getValue() != null))
				{
					/* field 14 */
					//IAM.14	Reported By	XPN	250		Y	Clinician name
					XPN reportedBy = iam1.getReportedBy();
					String alReportedBy = " - " + reportedBy.getGivenName().getValue().toString(); 
					
					alReaction += "Reaction - Status - Reported By\r\n"; 
					alReaction += iam1.getSensitivityToCausativeAgentCode().getIdentifier().toString() + " - ";
					if (iam1.getAllergyClinicalStatusCode().getIdentifier().toString().equalsIgnoreCase("C"))
					{
						//C = Created and shown as Active in Maxims
						alReaction += "Active";
					}
					else if (iam1.getAllergyClinicalStatusCode().getIdentifier().toString().equalsIgnoreCase("I"))
					{
						//I = Removed/Deleted and shown as Cancelled in Maxims
						alReaction += "Cancelled";
						nm.addPair("ALLKUPID","-60001");// This is to flag that this allergy is canceled and should be displayed as so.
					}
					else
						alReaction += iam1.getAllergyClinicalStatusCode().getIdentifier().toString();
						
					alReaction +=  " - " + alReportedBy + "\r\n";
				}						
				
				/* field 2 */
				//Allergen Type Code				
				//Code type Medication = -101 = DA
				//<ALLCAT>-101</ALLCAT>
				if (iam1.getAllergenTypeCode().getText().toString().equals("MED"))
				{
					nm.addPair("ALLCAT","-101");
				}
				
				/* field 3 */
				//!AM.3.3	Allergen Description	Chemical Name	
				//<ALCODE>
				String alCode = iam1.getAllergenCodeMnemonicDescription().getIdentifier().getValue();
				if (alCode != null)
					nm.addPair("ALCODE",alCode);
				//<ALTEXT>
				String alText = iam1.getAllergenCodeMnemonicDescription().getText().getValue();
				if (alText != null)
					nm.addPair("ALTEXT",alText);

				/* field 4 */
				//IAM.04	Allergy Severity Code	CE	250	Na	N
				//Sverity display in <EFFC>
				String alSeverity = iam1.getAllergySeverityCode().getIdentifier().getValue();
				if (alSeverity != null)
					nm.addPair("EFFC","Severity : " + alSeverity);
			
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
					
					/* field 9 */
					//IAM.9.2	Sensitivity to Causative Agent	Note Text	Reaction Text e.g. Causes a red rash.					
					//Allergy reaction text to be stored in EFFC = 255 characters
					//<EFFC />				
					if ((iam1.getSensitivityToCausativeAgentCode() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier() != null) && (iam1.getSensitivityToCausativeAgentCode().getIdentifier().getValue() != null))
					{
						if (alReaction == "")
							alReaction += "Reaction - Status - Reported By\r\n"; 
						
						/* field 14 */
						//IAM.14	Reported By	XPN	250		Y	Clinician name
						XPN reportedBy = iam1.getReportedBy();
						String alReportedBy = " - " + reportedBy.getGivenName().getValue().toString(); 
						
						alReaction += iam1.getSensitivityToCausativeAgentCode().getIdentifier().toString() + " - " + iam1.getAllergyClinicalStatusCode().getIdentifier().toString() + alReportedBy + "\r\n";
					}						
				}
			
				if ( alReaction != null && !alReaction.toString().equals(""))
				{
					nm.addPair("EFFC",alReaction.toString());
				}					
			}
			
			//all Allergies will be marked as Active as we are using the status at the reaction level 
			nm.addPair("STAT","A");
		}
		else
		{
			throw new HL7Exception("Unable to match patient");
		}
				
		return nm;	
	}		
}
