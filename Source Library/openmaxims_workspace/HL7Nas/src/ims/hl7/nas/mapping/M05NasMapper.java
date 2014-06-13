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
import ca.uhn.hl7v2.model.v24.group.MFN_M05_MFELOCLCHLRLLDPLCHLCC;
import ca.uhn.hl7v2.model.v24.message.MFN_M05;
import ca.uhn.hl7v2.model.v24.segment.LOC;
import ca.uhn.hl7v2.model.v24.segment.MFE;
import ca.uhn.hl7v2.model.v24.segment.MFI;

public class M05NasMapper extends NasMapper 
{
	private static final String[] msgAttService={"LOCATION", "ORGANISATION"};
	private static final String[] msgAttId={"LOCATION_ID", "ORG_ID"};
	private static final String[] msgAttCode={"LOCATION_CODE", "ORG_CODE"};
	private static final String[] msgAttPasCode={"LOCATION_PAS_CODE","ORG_PAS_CODE"};
	private static final String[] msgAttName={"LOCATION_NAME", "ORG_CODE_DESC"};
	private static final String[] msgAttStat={"LOC_ACT", "ORG_ACT"};

	private static final int LOC_TYPE=0;
	private static final int ORG_TYPE=1;

	public ImsNasMsg translate(Message msg) throws Exception 
	{
		return (createResourceLocNasMsg(msg));
	}

	private ImsNasMsg createResourceLocNasMsg(Message msg) throws Exception
	{
		ImsNasMsg sendMsg = new ImsNasMsg();
		
		int msgType=ORG_TYPE;
		if (isLocationType(msg))
			msgType=LOC_TYPE;
		
		//MFN_M05_MFELOCLCHLRLLDPLCHLCC mfn_m05 = (MFN_M05_MFELOCLCHLRLLDPLCHLCC) msg.get("MFN_M05_MFELOCLCHLRLLDPLCHLCC");
		MFN_M05 mfn_m05 = (MFN_M05)msg;
		
		
		int mfe_count = mfn_m05.getMFN_M05_MFELOCLCHLRLLDPLCHLCCReps(); 
		for (int i = 0; i < mfe_count; i++)
		{
		
	        LOC loc = mfn_m05.getMFN_M05_MFELOCLCHLRLLDPLCHLCC(i).getLOC();
			MFE mfe = mfn_m05.getMFN_M05_MFELOCLCHLRLLDPLCHLCC(i).getMFE();
			
			// MFE-4   Primary key value 
			Varies v = mfe.getPrimaryKeyValueMFE(0);
			String srcc = HL7Utils.getValueFromVariant(v, 0);
			String type = HL7Utils.getValueFromVariant(v, 1);			
			String locName = loc.getOrganizationNameLOC(0).getOrganizationName().getValue();
			
			ImsNasMsg rsfMsg = new ImsNasMsg();
			ImsNasMsg locMsg = new ImsNasMsg();
			ImsNasMsg lkupMsg = new ImsNasMsg();
			ImsNasMsg tmpSendMsg = new ImsNasMsg();
			rsfMsg.addPair("*SERVICE", "RESOURCE");
			rsfMsg.addPair("KEY_ATT_NAME",msgAttId[msgType]);
			locMsg.addPair("*SERVICE", msgAttService[msgType]);
			//lkupMsg.addPair("*SERVICE","LCODE");
			
			//There's an assumption here that if the RSF entry doesn't exist, then neither does the LOCATION entry.
			//If they are out of kilter, will get duplicate key errors on location.
			int rsno = getResourceBySrccType(srcc, type);
			if (rsno < 0)
			{
				rsfMsg.addPair("ACTION", "INSERT");
				locMsg.addPair("ACTION", "INSERT");
			}
			else
			{
				ImsNasMsg tmpMsg = new ImsNasMsg();
				tmpMsg.addPair("*SERVICE", "RESOURCE");
				tmpMsg.addPair("ACTION", "GETFORUPD");
				tmpMsg.addPair("RSNO", String.valueOf(rsno));
				tmpSendMsg.append(tmpMsg);
			
				rsfMsg.addPair("ACTION", "UPDATE");
				rsfMsg.addPair("RSNO", String.valueOf(rsno));
				locMsg.addPair(msgAttId[msgType], String.valueOf(rsno));	
	
				if (msgType == LOC_TYPE)
				{
					if (!doesLocationExist(rsno))
					{
						locMsg.addPair("ACTION", "INSERT");
					}
					else
					{
						// We need to do a get before update, so include in same multimessage;
						ImsNasMsg tmpLocMsg = new ImsNasMsg();
						tmpLocMsg.addPair("*SERVICE", msgAttService[msgType]);
						tmpLocMsg.addPair("ACTION", "GETFORUPD");
						tmpLocMsg.addPair(msgAttId[msgType], String.valueOf(rsno));
						tmpSendMsg.append(tmpLocMsg);
						
						locMsg.addPair("ACTION", "UPDATE");
						locMsg.addPair(msgAttId[msgType], String.valueOf(rsno));
					}
				}
				else
				{
					if (!doesOrganisationExist(rsno))
						locMsg.addPair("ACTION", "INSERT");
					else
					{
						// We need to do a get before update, so include in same multimessage;
						ImsNasMsg tmpOrgMsg = new ImsNasMsg();
						tmpOrgMsg.addPair("*SERVICE", msgAttService[msgType]);
						tmpOrgMsg.addPair("ACTION", "GETFORUPD");
						tmpOrgMsg.addPair(msgAttId[msgType], String.valueOf(rsno));
						tmpSendMsg.append(tmpOrgMsg);
						locMsg.addPair("ACTION", "UPDATE");
					}
				}
			}
	
			// LOC-1   Primary key value - LOC   
			String nationalCode= loc.getPrimaryKeyValueLOC().getComponent(0).toString();
			rsfMsg.addPair("CODE", nationalCode);
			rsfMsg.addPair("TYPE", type);
			rsfMsg.addPair("SRCC", srcc);
			locMsg.addPair(msgAttCode[msgType], srcc);
			locMsg.addPair(msgAttPasCode[msgType], nationalCode);
	 		
			// LOC-3   Location type 
			rsfMsg.addPair("AT" + loc.getLocationTypeLOC(0).getValue(), loc.getLocationTypeLOC(1).getValue());
			locMsg.addPair(msgAttStat[msgType], loc.getLocationTypeLOC(2).getValue());
			
			// LOC-4   Organization name - 1st instance
			rsfMsg.addPair("NAME", locName);
			locMsg.addPair("ORG_NAME", locName);
			// LOC-4   Organization name - 2nd instance
			rsfMsg.addPair("ADNM", loc.getOrganizationNameLOC(1).getOrganizationName().getValue());
			locMsg.addPair(msgAttName[msgType], loc.getOrganizationNameLOC(1).getOrganizationName().getValue());
	
			// LOC-5   Location address   
			XAD addr = loc.getLocationAddress(0);
			rsfMsg.addPair("ADR1", addr.getStreetAddress().getStreetOrMailingAddress().getValue());
			rsfMsg.addPair("ADR2", addr.getOtherDesignation().getValue());
			rsfMsg.addPair("ADR3", addr.getCity().getValue());
			rsfMsg.addPair("ADR4", addr.getStateOrProvince().getValue());
			rsfMsg.addPair("PCOD", addr.getZipOrPostalCode().getValue());
			locMsg.addPair("ADDRESS_LINE_1", addr.getStreetAddress().getStreetOrMailingAddress().getValue());
			locMsg.addPair("ADDRESS_LINE_2", addr.getOtherDesignation().getValue());
			locMsg.addPair("ADDRESS_LINE_3", addr.getCity().getValue());
			locMsg.addPair("ADDRESS_LINE_4", addr.getStateOrProvince().getValue());
			locMsg.addPair("POSTCODE", addr.getZipOrPostalCode().getValue());
			
			// LOC-6   Location phone   
			rsfMsg.addPair("TEL", loc.getLocationPhone(0).get9999999X99999CAnyText().getValue());
			locMsg.addPair("ADDRESS_PHONE_NUMBER", loc.getLocationPhone(0).get9999999X99999CAnyText().getValue());
			locMsg.addPair("ADDRESS_FAX_NUMBER", loc.getLocationPhone(1).get9999999X99999CAnyText().getValue());
	
			// LOC-9   Location service code
			String orgTypeCode = loc.getLocationServiceCode().getValue();
			if (orgTypeCode != null && !orgTypeCode.equals(""))
			{
				if (msgType == ORG_TYPE)
				{
					LookupInfo lkp = getCodeTranslation("ORNCOD", orgTypeCode);
					if (lkp != null && lkp.getId() != null)
						locMsg.addPair("ORG_TYPE_CODE", lkp.getId());
				}
				else
				{
					int orgId = getOrganisationByOrgCode(orgTypeCode);
					if (orgId > 0)
						locMsg.addPair("ORG_ID", String.valueOf(orgId));
				}
			}
			
			rsfMsg.addPair("STAT", "Y");
			locMsg.addPair("INTERNAL_ORG_FLAG", "Y");  // Default and only value on current LIVE DB (organisation)
			locMsg.addPair("PRIMARY_LOCATION", "N"); // Default and only value on current LIVE DB (location)
	
			//MAXGEN-
			//Need to create corresponding LCD entries as per I/A
			
			//MFE mfe = mt.getMFN_M01_MFEZxx(i).getMFE();
			String extCode = HL7Utils.getValueFromVariant(v, 0);
			String extText = HL7Utils.getValueFromVariant(v, 1);			
			String activeFlag = "";
			String evtCode = mfe.getRecordLevelEventCode().getValue();
			String cmds = mfe.getPrimaryKeyValueType(0).getValue();
			
			LookupInfo lkpInfo = getCodeTranslation(type, extCode);
			
			boolean insertRequired = true;
			
			if (lkpInfo.getId() == null)
			{
				lkupMsg.addPair("ACTION", "INSERT");
				activeFlag = "Y";
			}
			else
			{			
				insertRequired=false;
				String curText = lkpInfo.getText();
				// for updates, check for difference betwen text values (saves unnecessary server call if they are identical (including case))
				// MUP	Update record for master file
				if ( (evtCode.equals("MUP") || evtCode.equals("MAD")) && curText.toString().compareTo(locName) == 0)
				{
					//return null;
					continue;
				}
				//MDL	Delete record from master file			
				//MDC	Deactivate: discontinue using record in master file, but do not delete from database
				//else 
				if (evtCode.equals("MDL") || evtCode.equals("MDC"))
					activeFlag = "N";
				//MAC	Reactivate deactivated record
				else if (evtCode == "MAC")
					activeFlag = "Y";
				
				lkupMsg.addPair("ACTION", "UPDATE");	
			}
			
			String table = getLookupTable(type); //move to superclass? 
			if (table != null && table.equals(""))
				return null;
			else if (table.equals("LKUP_EXTERN")) 
			{
				lkupMsg.addPair("*SERVICE", "LCODE");		
				lkupMsg.addPair("TYPE", type); //"ORGNME"
				lkupMsg.addPair("SRCC", extCode);
				lkupMsg.addPair("TEXT", locName);
				lkupMsg.addPair("CMDS", cmds);
				if (!activeFlag.equals(""))
					lkupMsg.addPair("ACTIVE", activeFlag);
				
				if (!insertRequired)
				{
					tmpSendMsg.addPair("*SERVICE", "LCODE");					
					tmpSendMsg.addPair("TYPE", type);
					tmpSendMsg.addPair("SRCC", extCode);					
					tmpSendMsg.addPair("ACTION", "GETFORUPD");
					lkupMsg.addPair("CODE", lkpInfo.getId());
					tmpSendMsg.addPair("CODE", lkpInfo.getId()); //GFU
				}
				else
					lkupMsg.addPair("ACTION", "INSERT");
			}
			else		
			{
				
				lkupMsg.addPair("*SERVICE", "LKUP");
				if (lkpInfo.getType() != null)
					lkupMsg.addPair("LKUP_TYP", lkpInfo.getType());
				lkupMsg.addPair("LKUP_SRCT", type);
				lkupMsg.addPair("LKUP_NM", extText);
				lkupMsg.addPair("LKUP_DESC", extText);
				lkupMsg.addPair("LKUP_SRCC", extCode);
				lkupMsg.addPair("LKUP_CMDS", cmds);
				if (!activeFlag.equals(""))
					lkupMsg.addPair("LKP_STAT", activeFlag);
				
				tmpSendMsg.addPair("*SERVICE", "LKUP");
				tmpSendMsg.addPair("ACTION", "GETFORUPD");
				tmpSendMsg.addPair("LKUP_SRCT", type);
				tmpSendMsg.addPair("LKUP_SRCC", extCode);
				if (!insertRequired)
				{
					lkupMsg.addPair("LKUP_ID", lkpInfo.getId());
					tmpSendMsg.addPair("LKUP_ID", lkpInfo.getId());
				}
			}		
			
			 //--------
			sendMsg.append(tmpSendMsg);
			sendMsg.append(lkupMsg);		
			sendMsg.append(rsfMsg);
			sendMsg.append(locMsg);
		}
		if (sendMsg.getPairCount() > 0)
			return sendMsg;
		else
			return null;
	}

	private boolean doesOrganisationExist(int rsno) throws Exception 
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "ORGANISATION");
		nm.addPair("*ACTION", "GET");
		nm.addPair("ORG_ID", String.valueOf(rsno));
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
			return true;
		return false;
	}
	private boolean doesLocationExist(int rsno) throws Exception 
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "LOCATION");
		nm.addPair("*ACTION", "GET");
		nm.addPair("LOCATION_ID", String.valueOf(rsno));
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
			return true;
		return false;
	}

	public boolean isLocationType(Message msg) throws HL7Exception
	{
		// MFI-1   Master file identifier will have a value of LOC or ORG   
		MFI mfi = (MFI) msg.get("MFI");
		if (mfi.getMasterFileIdentifier().getIdentifier().getValue().equals("LOC"))
			return true;
		else
			return false;
	}
}
