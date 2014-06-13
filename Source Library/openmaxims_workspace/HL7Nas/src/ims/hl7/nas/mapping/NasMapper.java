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

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MRG;
import ca.uhn.hl7v2.model.v24.segment.PID;

import ca.uhn.hl7v2.model.v24.segment.PV1;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;
import ims.hl7.HL7Config;
import ims.hl7.nas.mapping.LookupInfo;
import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasClient;
import imsmaxims.common.ImsNasMsg;
import imsmaxims.common.ImsNasPair;

public abstract class NasMapper
{
	protected ImsNasClient conn;
	protected HL7Config cfg = new HL7Config();
	
	protected static final int DATE = 0;
	protected static final int TIME = 1;
	protected static final int DATETIME = 2;
	
	protected static final int INVALID_CLASS = -1;
	protected static final int NONE = 0;
	protected static final int INPATIENT = 1;
	protected static final int OUTPATIENT = 2;
	protected static final int EITHER = 3;
	protected static final int WAITLIST = 4;
	
	
	
	/**
	 * The field conn in NasMapper is available to the translate method
	 * so that it can send calls itself to the NAS server which may be required to
	 * build up the message it will return.
	 * Use the getCodeTranslation method to translate codes.
	 * Don't modify anything in conn itself.
	 */
	public abstract ImsNasMsg translate(Message msg) throws Exception;
	
	public final void setConnection(ImsNasClient nasClient)
	{
		conn = nasClient;
	}
		
	public final LookupInfo getCodeTranslation(String extType, String extCode) throws Exception
	{
		if (extCode == null) return null;
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		LookupInfo lookup = new LookupInfo();
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "LKUP");
		nm.addPair("*ACTION", "GET");
		nm.addPair("LKUP_SRCT", extType);
		nm.addPair("LKUP_SRCC", extCode);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();		
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occured translating code type " + extType + ", value " + extCode + "." + errMess);
		}
		if (rv == -2) return lookup;
		nm = new ImsNasMsg(outMess.toString());
		lookup.setId(nm.getPairVal("LKUP_ID"));
		lookup.setText(nm.getPairVal("LKUP_NM"));
		
		return lookup;
	}

	public final String getCodeTranslation(int type, String extCode) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate with no connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "LKUP");
		nm.addPair("*ACTION", "GET");
		nm.addPair("LKUP_TYP", "" + type);
		nm.addPair("LKUP_SRCC", extCode);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();		
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occured translating code. " + errMess);
		}
		if (rv == -2) return "";
		nm = new ImsNasMsg(outMess.toString());
		
		String code = nm.getPairVal("LKUP_ID");
		return code;
	}
	
	public final Integer getPatientPkey(Message msg) throws Exception
	{		
		if (msg == null) throw new Exception("Null message passed to getPatientPkey");
		
		PID pid = (PID) msg.get("PID");
		return getPatientPkey(pid);
	}
	public final Integer getPatientHospNum(Message msg) throws Exception
	{		
		if (msg == null) throw new Exception("Null message passed to getPatientPkey");
		
		PID pid = (PID) msg.get("PID");
		return getPatientHospNum(pid);
	}
	
	
	
	public final Integer getPatientPkey(PID pid) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (pid == null) throw new Exception("Null PID passed to getPatientPkey");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("*ACTION", "GET");
				
		String idVal = null;
		String localIdType = null;
		
		CX[] idList = pid.getPatientIdentifierList();
		int i;
		for (i = 0; i < idList.length; i++)
		{
			String idType = idList[i].getIdentifierTypeCode().getValue();

			if (cfg.getIdentifierTypeComponent().equals("C4"))
			{
				idType = idList[i].getAssigningAuthority().getNamespaceID().getValue();
			}
			
			if (idType == null) 
				throw new HL7Exception("PID Identifier Type in use not specified");

			if (idType.equals(cfg.getPrimaryPatidType()))
			{
				idVal = idList[i].getID().getValue();
				localIdType = this.getCodeTranslation("PID",idType).getId();
				if (localIdType == null)
				{
					throw new HL7Exception("Lookup Mapping for Primary Patient ID Type not available : " + cfg.getPrimaryPatidType());
				}
			}						
		}
		if ( idVal == null || idVal.equals("") || localIdType == null)
		{
			throw new HL7Exception("PID must contain Primary Patient ID Type : " + cfg.getPrimaryPatidType());
		}		
		nm.addPair("OIDTYPE", localIdType);
		nm.addPair("OIDVAL", idVal);
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occured making PATIENT GET call. " + errMess);			
		}
		if (rv == -2)
			return null;
		
		nm = new ImsNasMsg(outMess.toString());
		String pkeyStr = nm.getPairVal("PKEY");
		return Integer.valueOf(pkeyStr);
	}

	public final Integer getXRAYPatient(PID pid) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (pid == null) throw new Exception("Null PID passed to getPatientPkey");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("*ACTION", "GET");
				
		String idVal = null;
		
		CX[] idList = pid.getPatientIdentifierList();
		int i;
		for (i = 0; i < idList.length; i++)
		{
			String idType = idList[i].getIdentifierTypeCode().getValue();
			
			if (idType == null) 
				throw new HL7Exception("PID HOSPNUM Identifier Type expected.");

			idVal = idList[i].getID().getValue();
		}
		if ( idVal == null || idVal.equals(""))
		{
			throw new HL7Exception("PID must contain HOSPNUM ID Type : " + cfg.getPrimaryPatidType());
		}		
		nm.addPair("PAS_PKEY", idVal);
		//WDEV-6543	//Coombe
		nm.addPair("INACTIVE", "0");
		
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occured making PATIENT GET call. " + errMess);			
		}
		if (rv == -2)
			return null;
		
		nm = new ImsNasMsg(outMess.toString());
		
		String inactive = nm.getPairVal("INACTIVE");
		if (inactive.equals("1")) //patient record there but deleted - counts as not found
			return null;
		String xrayStr = nm.getPairVal("XRAYNUM");
		return Integer.valueOf(xrayStr);
	}
	
	public final int[] getXRAYDoctorInfo(String doctorCode,String practiceCode) throws Exception
	{
		int[] ret = {-1,-1};
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (doctorCode == null || doctorCode.length() == 0) throw new Exception("Null Doctor Code passed to getXRAYDoctor");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "RADDOCTOR");
		nm.addPair("*ACTION", "GET");
		nm.addPair("DOCTORCD", doctorCode);
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occured making DOCTOR GET call. " + errMess);			
		}
		if (rv == -2)
			return null;
		
		nm = new ImsNasMsg(outMess.toString());
		String idStr = nm.getPairVal("RADDOCTOR_ID");
		
		//WDEV-4548, getPRactice id based on message content rather than radiology data
		String practStr = "";
		if (practiceCode != null && practiceCode.length() > 0)
		{
			nm = new ImsNasMsg();
			nm.addPair("*SERVICE", "RADPRACTICE");
			nm.addPair("*ACTION", "GET");
			nm.addPair("PRACTCODE", practiceCode);
			
			outMess = new StringBuffer();
			errMess = new StringBuffer();
			rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
			if (rv < 0 && rv != -2)
			{
				throw new Exception("Error " + rv + " occured making RADPRACTICE GET call. " + errMess);			
			}
			
			if (rv != -2)		
			{
				nm = new ImsNasMsg(outMess.toString());				
				practStr = nm.getPairVal("RADPRACTICE_ID");
			}
		}
			
		if (idStr != "")
			ret[0] = Integer.valueOf(idStr);
		if (practStr != "")
			ret[1] = Integer.valueOf(practStr);
		
		return ret; 
	}


	
	public final Integer getPatientHospNum(PID pid) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (pid == null) throw new Exception("Null PID passed to getPatientPkey");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("*ACTION", "GET");
				
		String idVal = null;
		
		CX[] idList = pid.getPatientIdentifierList();
		int i;
		for (i = 0; i < idList.length; i++)
		{
			String idType = idList[i].getIdentifierTypeCode().getValue();
			
			if (idType == null) 
				throw new HL7Exception("PID HOSPNUM Identifier Type expected.");

			idVal = idList[i].getID().getValue();
		}
		if ( idVal == null || idVal.equals(""))
		{
			throw new HL7Exception("PID must contain HOSPNUM ID Type : " + cfg.getPrimaryPatidType());
		}		
		nm.addPair("HOSPNUM", idVal);
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occured making PATIENT GET call. " + errMess);			
		}
		if (rv == -2)
			return null;
		
		nm = new ImsNasMsg(outMess.toString());
		String pkeyStr = nm.getPairVal("PKEY");
		return Integer.valueOf(pkeyStr);
	}
	
	protected String getLookupTable(String type) throws Exception
	{
		/* Get from LKT based on LKT_OLDTYPE
		 * if no data, get on LKT_TYP.
		 * Return retrieved table name
		 */
		ImsNasMsg nm = new ImsNasMsg();
		ImsNasPair pair = new ImsNasPair("LKT_OLDTYPE",type);
		nm.addPair("*SERVICE","LKT");
		nm.addPair("ACTION","GET");
		nm.addPair(pair);
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error getting lookup type on LKT_OLDTYPE:  " + errMess);
		}
		else if (rv == -2)
		{
			try{
				Integer.parseInt(type);
			}
			catch(Exception e)
			{
				throw new Exception("Error getting lookup type on LKT_TYP:  '" + type + "' is not a number.");
			}
			
			nm.removePair(pair);
			pair.setAttName("LKT_TYP");
			pair.setAttVal(type);
			nm.addPair(pair);
			rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
			if (rv < 0)
				throw new Exception("Error getting lookup type on LKT_TYP: " + errMess);
			
		}
		String s1 = "";		
		ImsNasMsg outMsg = new ImsNasMsg(outMess.toString());		
		pair = outMsg.findPair("LKT_TBLNAME");		
		if (pair != null) 
			s1 = pair.getAttVal();
		return s1;		
	}
	
	
	protected int getResourceBySrccType(String srcc, String type) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (srcc == null || type == null) throw new Exception("Invalid Resource SRCC or TYPE passed (null)");
			
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "RESOURCE");
		nm.addPair("*ACTION", "GET");
		nm.addPair("SRCC", srcc);
		nm.addPair("TYPE", type);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
		{
			ImsNasMsg outMsg = new ImsNasMsg(outMess.toString());
			if (outMsg != null)
			{
				String rsno = outMsg.findPair("RSNO").getAttVal();
				return Integer.parseInt(rsno);
			}
		}
		return rv;		
	}
	
	protected int getResourceByNationalCode(String code, String type) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (code == null) throw new Exception("Invalid Resource CODE or TYPE passed.");
			
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "RESOURCE");
		nm.addPair("*ACTION", "GET");
		nm.addPair("CODE", code);
		nm.addPair("TYPE", type);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
		{
			ImsNasMsg outMsg = new ImsNasMsg(outMess.toString());
			String rsno = outMsg.findPair("RSNO").getAttVal();
			return Integer.parseInt(rsno);
		}
		else
			return rv;
	}
	
	protected int getGpByGpCode(String srcc) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (srcc == null) throw new Exception("Invalid GP Code passed.");
			
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "GP_DETAIL");
		nm.addPair("*ACTION", "GET");
		nm.addPair("GP_CODE", srcc);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
		{
			ImsNasMsg outMsg = new ImsNasMsg(outMess.toString());
			if (outMsg != null)
			{
				String gpId = outMsg.findPair("GP_ID").getAttVal();
				return Integer.parseInt(gpId);
			}
		}
		return rv;		
	}
	
	protected int getMOSByMosId(int mosId) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "MEMBER_OF_STAFF_NAME");
		nm.addPair("*ACTION", "GET");
		nm.addPair("MOS_ID", String.valueOf(mosId));
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		return rv;		
	}
	
	protected int getOrganisationByOrgCode(String orgCode) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "ORGANISATION");
		nm.addPair("*ACTION", "GET");
		nm.addPair("ORG_CODE", orgCode);
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv >= 0)
		{
			ImsNasMsg outMsg = new ImsNasMsg(outMess.toString());
			if (outMsg != null)
			{
				String orgId = outMsg.findPair("ORG_ID").getAttVal();
				return Integer.parseInt(orgId);
			}
		}
		return rv;		
	}
	
	protected boolean isCurrentInpatient(String scep, Integer pkey) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "INP");
		nm.addPair("*ACTION", "GET");
		nm.addPair("EPID", scep);
		nm.addPair("PKEY", pkey.toString());
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error checking inpatient status: " + errMess);
		}else if (rv == -2)
		{
			return false;
		}else
		{
			return true;
		}
	}
	
	protected int checkPatientClass(Message msg,String scep) throws Exception
	{
		
		StringBuffer classVal = new StringBuffer();
		
		return isPatientClassValid(msg,classVal);
		
	}
	
	protected int isPatientClassValid(Message msg,StringBuffer classVal) throws Exception
	{
		/*  
		 *  The A05's produced by these conversations all seem to have PV1.2 values like 
		 *  "PREADMIT" if it's an IP or OP pre-registration or "WAITLIST" if it's an OP 
		 *  referral or IP Waiting list addition 
		 * */
		
		// if current inp or outp records exists - return and do nothing (unless msg/event
		// is to specifically manipulate a current encounter)
		PV1 pv1 = (PV1) msg.get(SegName.PV1);
		
		classVal.append(pv1.getPatientClass().getValue());
		if (classVal.toString() == null || classVal.toString().length() == 0)
		{
			return INVALID_CLASS;
		}
		else if(classVal.toString().equalsIgnoreCase("E")) // Emergency
			return INPATIENT;
		else if(classVal.toString().equalsIgnoreCase("I")) // Inpatient
			return INPATIENT;
		else if(classVal.toString().equalsIgnoreCase("O")) // Outpatient
			return OUTPATIENT;
		else if(classVal.toString().equalsIgnoreCase("P")) // Pre-admit (Inpatient and Outpatient)
			return EITHER;
		else if(classVal.toString().equalsIgnoreCase("R")) // Recurring (Inpatient and Outpatient)
			return EITHER;
		else if(classVal.toString().equalsIgnoreCase("B")) // Obstetrics
			return EITHER;
		else if(classVal.toString().equalsIgnoreCase("W")) // Waitlist
			return WAITLIST;
		else if(classVal.toString().equalsIgnoreCase("N")) // 
			return INPATIENT;		
		else
			return INVALID_CLASS;
		
	}

	
	protected boolean isCurrentOutpatient(String scep, Integer pkey) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "OPT");
		nm.addPair("*ACTION", "GET");
		nm.addPair("EPID", scep);
		nm.addPair("PKEY", pkey.toString());
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();

		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error checking outpatient status: " + errMess);
		}else if (rv == -2)
		{
			return false;
		}else
		{
			return true;
		}
	}

	
	protected String getVisitNumberFromPV1(PV1 pv1) throws Exception
	{
		String tmpVal = "";
		//if patient type is NEWBRON use a visit number of 0 (as a visit number will not be supplied)
		/* field 18 */
		
		if (pv1.getPatientType() != null && pv1.getPatientType().getValue() != null && pv1.getPatientType().getValue().equals("NEWBORN"))
		{
			return "0";
		}else
		{
			/* field 19 */
			tmpVal = pv1.getVisitNumber().getIdentifierTypeCode().getValue();
			if (tmpVal == null || !tmpVal.equalsIgnoreCase("VISITID"))
				throw new HL7Exception("PV1.19 - Visit must have identifier of type VISITID");
			
			tmpVal = pv1.getVisitNumber().getID().getValue();
			if (tmpVal == null || tmpVal.equals(""))
				throw new HL7Exception("PV1.19 - Visit Identifier is a mandatory field");
			
			try
			{
				return tmpVal;
				
			}catch (NumberFormatException nfe)
			{
				throw new HL7Exception("PV1.19 - Visit Identifier must be a valid integer value");
			}
		}		
	}
	
	protected String getDateTime(String dt, int returnType)
	{		
		
		//to extract a date - compare to longest a date can be
		//ie YYYYMMDD == 8 - pad anything < 8 with zeros
		StringBuffer ret = new StringBuffer();
		
		if (returnType == DATE)
		{	
			if (dt.length() >= 8)
				ret.append(dt.substring(0,8));
			else
			{
				for (int i = dt.length(); i < 8; i++)
					ret.append("0");
			}
		}
		else if (returnType == TIME)
		{
			ret.setLength(0);			
			if (dt.length() >= 8)
			{
				dt = dt.substring(8,dt.length());			
				ret.append(dt);
			}
			for (int i = dt.length(); i < 6; i++)
				ret.append("0");
		}
		else if (returnType == DATETIME)
		{
			ret.append(getDateTime(dt,DATE));
			ret.append(getDateTime(dt,TIME));
		}
		return ret.toString();
	}
	
	public final ImsNasMsg doMerge(MRG mrg,Message msg, PID altPID) throws Exception
	{
		/* WDEV-5010
		 * Two message types support the same functionality, A34 and A40 (merge ids)
		 * but as they are part of different groups (A34 -> ADT_A30, A40 -> ADT_A39)
		 * the PID segment must be retrived differently.  So when calling
		 * this method (e.g. from A40NasMapper), we pass in the PID (altPID), otherwise pass null
		 * and treat generically
		 * */
		
		PID pid = null;
		if (altPID == null)
			pid = (PID) msg.get("PID");
		else
			pid = altPID;
		
		if (cfg.getMAXIMSRis())
		{
			/*
			 * Full merge not supported in Radiology interface - this is being used to modify the PAS id.
			 * If the new id already exists, the transaction fails.
			 * */
			
			ImsNasMsg risMsg = new ImsNasMsg();
			
			Integer pkey = null;
			Integer newId = null;
			String tmp = null;
			String newPasId = null;
			
			newPasId = pid.getPatientIdentifierList(0).getID().getValue();

			CX cx = mrg.getPriorPatientIdentifierList()[0];
			tmp = cx.getID().getValue();
			//pid.getPatientIdentifierList(0).getID().setValue(tmp);
			//checking that the new id isn't already assigned
			if ((newId = getXRAYPatient(pid)) == null)
			{
				pid.getPatientIdentifierList(0).getID().setValue(tmp);
				
				if ((pkey = getXRAYPatient(pid)) != null)
				{								
					risMsg.addPair("*SERVICE", "PATIENT");
					risMsg.addPair("ACTION", "UPDATE_IDS");
					risMsg.addPair("XRAYNUM", pkey.toString());
					risMsg.addPair("PAS_PKEY", newPasId);				
					risMsg.addPair("CHARTNUM", newPasId);
					//need to set it back to ensure msg is correctly logged
					pid.getPatientIdentifierList(0).getID().setValue(newPasId);
					return risMsg;
				}
				else
				{
					throw new HL7Exception("Error occurred getting patient to update" );
				}
			}
			else
			{				
				throw new HL7Exception("Error occurred updating (xray) patient id: " + newId + " to " + tmp + ". New ID is already assigned ");
			}
		}

		ImsNasMsg nm = new ImsNasMsg();
		
		nm.addPair("*SERVICE", "ICWS_PATMERGE");
		nm.addPair("ACTION", "INSERT");		
		
		Integer keepPkey = null;
		Integer removePkey = null;
		if ((keepPkey = getPatientPkey(pid)) != null) //probably won't be able to use this.
		{					
			nm.addPair("KEEPPKEY", keepPkey.toString());
			nm.addPair("RUSR", "-1");	
			Date dt = new Date();
			Time tm = new Time();
			nm.addPair("RDAT",dt.toString(DateFormat.ISO));
			nm.addPair("RTIM",tm.toString(TimeFormat.FLAT6));
			
			//This is a slightly sneaky way of getting the remove pkey
			//replace the PID.patient id with that from the MRG segment and call getPatientPkey again
			//but it assumes (for the moment) that the coding systems will be the same (because we 
			//only replaced the value - not the whole field.
			
			//PID pid = (PID) msg.get("PID");
			
			CX cx = mrg.getPriorPatientIdentifierList()[0];
			pid.getPatientIdentifierList(0).getID().setValue(cx.getID().getValue());
			
			if ( (removePkey = getPatientPkey(pid)) != null)
				nm.addPair("REMOVEPKEY", removePkey.toString());
			else
				throw new HL7Exception("Patient to be merged/removed not found (" + cx.getID().getValue() + ")");
		}
		else
		{
			throw new HL7Exception("Patient to be kept not found");
		}
		return nm;		
	}

}
