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

import ims.hl7.utils.HL7Utils;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v24.datatype.XAD;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.message.MFN_M02;
import ca.uhn.hl7v2.model.v24.segment.MFE;
import ca.uhn.hl7v2.model.v24.segment.MFI;
import ca.uhn.hl7v2.model.v24.segment.STF;

public class M02NasMapper extends NasMapper 
{
	private static final String[] msgAttService={"MEMBER_OF_STAFF_NAME", "GP_DETAIL"};
	private static final String[] msgAttId={"MOS_ID", "GP_ID"};
	private static final String[] msgAttSrcc={"MOS_CODE", "GP_CODE"};
	private static final String[] msgAttPasCode={"MOS_PAS_CODE", "GP_PAS_CODE"};
	private static final String[] msgAttExternalCode={"MOS_EXTERNAL_CODE", "GP_EXTERNAL_CODE"};
	private static final String[] msgAttSurname={"MOS_SURNAME", "GP_SURNAME"};
	private static final String[] msgAttSurnameSearch={"MOS_SURNAME_SEARCH","GP_SURNAME_SEARCH"};
	private static final String[] msgAttName={"MOS_NAME", "GP_NAME"};
	private static final String[] msgAttForenames={"MOS_FORENAMES", "GP_FORENAMES"};
	private static final String[] msgAttTitle={"MOS_TITLE", "GP_TITLE"};
	private static final String[] msgAttAct={"MOS_ACT", "GP_ACT"};
	private static final String[] msgAttPhone={"MOS_PHONE_NUMBER", "GP_PHONE_NUMBER"};
	private static final String[] msgAttAddr1={"MOS_ADDRESS_1", "GP_ADDRESS_1"};
	private static final String[] msgAttAddr2={"MOS_ADDRESS_2", "GP_ADDRESS_2"};
	private static final String[] msgAttAddr3={"MOS_ADDRESS_3", "GP_ADDRESS_3"};
	private static final String[] msgAttAddr4={"MOS_ADDRESS_4", "GP_ADDRESS_4"};
	private static final String[] msgAttPostCode={"MOS_POST_CODE", "GP_POST_CODE"};
	private static final String[] msgAttBaseLoc={"MOS_BASE_LOCATION", "GP_BASE_LOCATION"};
	private static final String[] msgAttPrimOrg={"MOS_PRIM_ORG_ID", "GP_PRIM_ORG_ID"};
	private static final String[] msgAttOtherPerson={"MOS_OTHER_PERSON_CODE", "GP_OTHER_PERSON_CODE"};
	private static final String[] msgAttNINumber={"MOS_NI_NUMBER", "GP_NI_NUMBER"};
	private static final String[] msgAttNameAbbr={"MOS_NAME_ABBR", "GP_NAME_ABBR"};
	private static final String[] msgAttDateDel={"MOS_DATE_DELETED", "GP_DATE_DELETED"};
	private static final String[] msgAttPriority={"MOS_SEARCH_PRIORITY_CODE", "GP_SEARCH_PRIORITY_CODE"};

	
	private static final int MOS_TYPE=0;
	private static final int GP_TYPE=1;

	public ImsNasMsg translate(Message msg) throws Exception 
	{
		return(createResourceNasMsg(msg));
	}


	private ImsNasMsg createResourceNasMsg(Message msg) throws Exception
	{
		// Translate the given HL7 Message contents
		// into a nas message for the Resource Service
		// and one for the member_of_staff_name or gp_detail Service
		// depending on resource type
		ImsNasMsg sendMsg = new ImsNasMsg();
		
		int msgType=MOS_TYPE;
		if (isGPStaffType(msg))
			msgType=GP_TYPE;
			
		
		MFN_M02 mt = (MFN_M02)msg;
		
		//MFE mfe = mfn_m02.getMFE();
		
		int mfe_count = mt.getMFN_M02_MFESTFPRAORGReps(); 
		for (int i = 0; i < mfe_count; i++)
		{
			ImsNasMsg mosMsg = new ImsNasMsg();
			ImsNasMsg rsfMsg = new ImsNasMsg();
			
			MFE mfe = mt.getMFN_M02_MFESTFPRAORG(i).getMFE();
			STF stf = mt.getMFN_M02_MFESTFPRAORG(i).getSTF();
		
			// MFE-4   Primary key value 
			Varies v = mfe.getPrimaryKeyValueMFE(0);
			String srcc = HL7Utils.getValueFromVariant(v, 0);
			String type = HL7Utils.getValueFromVariant(v, 1);		
	
			rsfMsg.addPair("*SERVICE", "RESOURCE");
			rsfMsg.addPair("KEY_ATT_NAME",msgAttId[msgType]);
			mosMsg.addPair("*SERVICE", msgAttService[msgType]);
	
			int rsno = getResourceBySrccType(srcc, type);
			if (rsno < 0)
			{
				rsfMsg.addPair("ACTION", "INSERT");
				mosMsg.addPair("ACTION", "INSERT");
			}
			else
			{
	
				// We need to do a get before update, so include in same multimessage;
				ImsNasMsg tmpMsg = new ImsNasMsg();
				tmpMsg.addPair("*SERVICE", "RESOURCE");
				tmpMsg.addPair("ACTION", "GETFORUPD");
				tmpMsg.addPair("RSNO", String.valueOf(rsno));
				sendMsg.append(tmpMsg);
				
				rsfMsg.addPair("ACTION", "UPDATE");
				rsfMsg.addPair("RSNO", String.valueOf(rsno));
				
				mosMsg.addPair(msgAttId[msgType], String.valueOf(rsno));
				// We need to check whether the GP or MOS exists or not
				// to determine the action
				if (msgType == GP_TYPE)
				{
					int gpId = getGpByGpCode(srcc);
					if (gpId < 0)
						mosMsg.addPair("ACTION", "INSERT");
					else
					{
						// We need to do a get before update, so include in same multimessage;
						ImsNasMsg tmpGpMsg = new ImsNasMsg();
						tmpGpMsg.addPair("*SERVICE", msgAttService[msgType]);
						tmpGpMsg.addPair("ACTION", "GETFORUPD");
						tmpGpMsg.addPair("GP_ID", String.valueOf(gpId));
						sendMsg.append(tmpGpMsg);
						
						mosMsg.addPair("ACTION", "UPDATE");
					}
				}
				else
				{
					int mosId = getMOSByMosId(rsno);
					if (mosId < 0)
					{
						mosMsg.addPair("ACTION", "INSERT");
					}
					else
					{
						// We need to do a get before update, so include in same multimessage;
						ImsNasMsg tmpMosMsg = new ImsNasMsg();
						tmpMosMsg.addPair("*SERVICE", msgAttService[msgType]);
						tmpMosMsg.addPair("ACTION", "GETFORUPD");
						tmpMosMsg.addPair("MOS_ID", String.valueOf(rsno));
						sendMsg.append(tmpMosMsg);
	
						mosMsg.addPair("ACTION", "UPDATE");
					}
				}
			}
	
			// SRCC
			rsfMsg.addPair("SRCC", srcc);
			rsfMsg.addPair("TYPE", type);
			mosMsg.addPair(msgAttSrcc[msgType], srcc);
			
			// STF-1   Primary key value
			//Jul 2008 - not sure yet if this should be made mandatory, but they are not sending it at the 
			//moment and messages are failing to process.
			String nationalCode = stf.getPrimaryKeyValueSTF().getIdentifier().getValue();
			if (nationalCode == null || nationalCode.length() == 0)
			{
				throw new Exception("Primary Key Value cannot be blank - STF[1] in MFE segment "+mfe_count);
			}
				
			rsfMsg.addPair("CODE", nationalCode);
			mosMsg.addPair(msgAttExternalCode[msgType], nationalCode);
			
			// STF-2   Staff ID code
			mosMsg.addPair(msgAttPasCode[msgType],stf.getStaffIDCode(0).getID().getValue());
			mosMsg.addPair(msgAttNINumber[msgType], stf.getStaffIDCode(1).getID().getValue());
			rsfMsg.addPair("AT" + stf.getStaffIDCode(2).getID().getValue(), stf.getStaffIDCode(3).getID().getValue());
					
			// STF-3   Staff name  
			XPN name = stf.getStaffName(0);
			String surname = name.getFamilyName().getSurname().getValue();
			String forename = name.getGivenName().getValue();
			String midName = name.getSecondAndFurtherGivenNamesOrInitialsThereof().getValue();
			String titleTxt = name.getPrefixEgDR().getValue();
			rsfMsg.addPair("SURNAME",surname);
			mosMsg.addPair(msgAttSurname[msgType], surname);
			mosMsg.addPair(msgAttSurnameSearch[msgType], surname.toUpperCase());
			
			// STF-3 Staff Name - Suffix will be used for abbreviated name
			mosMsg.addPair(msgAttNameAbbr[msgType], name.getSuffixEgJRorIII().getValue());
	
			// WDEV-5459
			StringBuffer fullName = new StringBuffer();
			StringBuffer forenames = new StringBuffer();
			if  (titleTxt != null)
				fullName.append(titleTxt).append(" ");
			if (forename != null)
			{
				fullName.append(forename).append(" ");
				forenames.append(forename).append(" ");
			}
			if (midName != null)
			{
				fullName.append(midName).append(" ");
				forenames.append(midName);
			}
			if (surname != null)
				fullName.append(surname);
			
			rsfMsg.addPair("ADNM", fullName.toString());
			rsfMsg.addPair("NAME", fullName.toString());
			mosMsg.addPair(msgAttName[msgType], fullName.toString());
			mosMsg.addPair(msgAttTitle[msgType], titleTxt);
			mosMsg.addPair(msgAttForenames[msgType], forenames.toString());
	
			
			// STF-4   Staff type  
			// Resource Type - External value is 1st repetition, Lookup Type is 2nd repetition
			
			LookupInfo lkp = getCodeTranslation(stf.getStaffType(1).getValue(), stf.getStaffType(0).getValue());
			if (lkp != null)
				rsfMsg.addPair("RESTYPE", lkp.getId());  
			
			
			// STF-7   Active/inactive flag 
			if (stf.getActiveInactiveFlag().getValue().equalsIgnoreCase("A"))
			{
				rsfMsg.addPair("STAT", "Y");
				mosMsg.addPair(msgAttAct[msgType], "Y");
			}
			else
			{
				rsfMsg.addPair("STAT", "N");
				mosMsg.addPair(msgAttAct[msgType], "N");
			}
			
			// STF-8   Department
			// BaseLocation is the first instance, Primary Organisation is the second instance
			mosMsg.addPair(msgAttBaseLoc[msgType], getLocationIdFromLocationCode(stf.getDepartment(0).getIdentifier().getValue()));
			
			int primOrg = getResourceBySrccType(stf.getDepartment(1).getIdentifier().getValue(), "ORGCOD");
			if (primOrg > 0)
			{
				mosMsg.addPair(msgAttPrimOrg[msgType], String.valueOf(primOrg));
			}
	
			// STF-9   Hospital service
			mosMsg.addPair("STAFF_ROLE_CODE", stf.getHospitalService(0).getIdentifier().getValue());
			
			//	STF-10   Phone
			rsfMsg.addPair("TEL", stf.getPhone(0).get9999999X99999CAnyText().getValue());
			rsfMsg.addPair("EMAIL", stf.getPhone(0).getEmailAddress().getValue());
			mosMsg.addPair(msgAttPhone[msgType], stf.getPhone(0).get9999999X99999CAnyText().getValue());
			
			// STF-11   Office/home address  
			XAD addr = stf.getOfficeHomeAddress(0);
			rsfMsg.addPair("ADR1", addr.getStreetAddress().getStreetOrMailingAddress().getValue());
			rsfMsg.addPair("ADR2", addr.getOtherDesignation().getValue());
			rsfMsg.addPair("ADR3", addr.getCity().getValue());
			rsfMsg.addPair("ADR4", addr.getStateOrProvince().getValue());
			rsfMsg.addPair("PCOD", addr.getZipOrPostalCode().getValue());
			mosMsg.addPair(msgAttAddr1[msgType], addr.getStreetAddress().getStreetOrMailingAddress().getValue());
			mosMsg.addPair(msgAttAddr2[msgType], addr.getOtherDesignation().getValue());
			mosMsg.addPair(msgAttAddr3[msgType], addr.getCity().getValue());
			mosMsg.addPair(msgAttAddr4[msgType], addr.getStateOrProvince().getValue());
			mosMsg.addPair(msgAttPostCode[msgType], addr.getZipOrPostalCode().getValue());
	
			
			// STF-13   Institution inactivation date  
			// Date Deleted
			mosMsg.addPair(msgAttDateDel[msgType], stf.getInstitutionInactivationDate(0).getDate().getTimeOfAnEvent().getValue());
			
			// STF-14   Backup person ID  
			mosMsg.addPair(msgAttOtherPerson[msgType], stf.getBackupPersonID(0).getIdentifier().getValue());
			
			// STF-19   Job code/class
			// Search Priority Code
			mosMsg.addPair(msgAttPriority[msgType], stf.getJobCodeClass().getJobCode().getValue());
			
			// This append to sendMsg is needed as when the get's are included
			// in the call, the append to the messages themselves failed in
			// the multi-message section
			sendMsg.append(rsfMsg);
			sendMsg.append(mosMsg);
		} //for all MFEs
		return sendMsg;
	}
	
	private String getLocationIdFromLocationCode(String code) throws Exception 
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (code == null) throw new Exception("Invalid Location CODE passed.");
			
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "LOCATION");
		nm.addPair("*ACTION", "GET");
		nm.addPair("LOCATION_CODE", code);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
		{
			ImsNasMsg outMsg = new ImsNasMsg(outMess.toString());
			String locId = outMsg.findPair("LOCATION_ID").getAttVal();
			return locId;
		}
		else
			return null;
	}
	
	public boolean isGPStaffType(Message msg) throws HL7Exception
	{
		// MFI-1   Master file identifier will have a value of STF or PRA   
		MFI mfi = (MFI) msg.get("MFI");
		if (mfi.getMasterFileIdentifier().getIdentifier().getValue().equals("PRA"))
			return true;
		else
			return false;
	}
}
