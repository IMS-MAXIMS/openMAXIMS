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

import java.util.StringTokenizer;

import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;
import ims.hl7.HL7Config;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v231.segment.AIG;
import ca.uhn.hl7v2.model.v231.segment.AIL;
import ca.uhn.hl7v2.model.v231.segment.AIP;
import ca.uhn.hl7v2.model.v231.segment.AIS;
import ca.uhn.hl7v2.model.v231.segment.MSH;
import ca.uhn.hl7v2.model.v231.segment.PID;
import ca.uhn.hl7v2.model.v231.segment.SCH;

public abstract class V231NasMapper extends NasMapper
{
	//protected ImsNasClient conn;
	protected HL7Config cfg = new HL7Config();
	
	protected static final int DATE = 0;
	protected static final int TIME = 1;
	protected static final int DATETIME = 2;
	
	public static final String AIS_TYPE_CODE = "0";
	public static final String AIG_TYPE_CODE = "1";
	public static final String AIL_TYPE_CODE = "2";
	public static final String AIP_TYPE_CODE = "3";
	
	public abstract ImsNasMsg translate(Message msg) throws Exception;
	
	public final Integer getPatientPkey(PID pid) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (pid == null) throw new Exception("Null PID passed to getPatientPkey");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "PATIENT");
		nm.addPair("ACTION", "GET");
				
		String idVal = null;
		String localIdType = null;
		
		idVal = pid.getAlternatePatientIDPID(0).getID().getValue();
		if (idVal == null) throw new Exception("Null PAS PID in message");
		localIdType = "HOSPNUM";

		if ( idVal == null || idVal.equals("") || localIdType == null)
		{
			throw new HL7Exception("PID must contain Primary Patient ID Type : " + cfg.getPrimaryPatidType());
		}		
		nm.addPair(localIdType,idVal);
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occurred making PATIENT GET call. " + errMess);			
		}
		if (rv == -2)
			return null;
		
		nm = new ImsNasMsg(outMess.toString());
		String pkeyStr = nm.getPairVal("HOSPNUM");
		return Integer.valueOf(pkeyStr);
	}
	
	public final Integer getPatientPkeyV231(Message msg) throws Exception
	{		
		if (msg == null) throw new Exception("Null message passed to getPatientPkey");
		
		PID pid = (PID) msg.get("PID");
		return getPatientPkey(pid);
	}
	
	public final ImsNasMsg startGenSchedMsg(MSH msh, SCH sch) throws Exception
	{
		ImsNasMsg nm = new ImsNasMsg();
		String appt_id = "";
		String pkey = "";
		boolean bUpdating = false;
		Date date = new Date();
		Time time = new Time();
		
		
		nm.addPair("*SERVICE", "GENERIC_SCHEDULE");
		String fillerAppId = sch.getFillerAppointmentID().getEntityIdentifier().getValue();
		 
		if ((appt_id = getSchedAppointment(fillerAppId)) == null)
			nm.addPair("ACTION", "INSERT");
		else
		{
			nm.addPair("ACTION", "UPDATE");
			nm.addPair("APPT_ID", appt_id);
			bUpdating = true;
		}
		
		//fillerAppId = sch.getFillerAppointmentID().getEntityIdentifier().getValue();
		StringTokenizer tokens = new StringTokenizer(fillerAppId,"/");
		tokens.nextToken();
		pkey = tokens.nextToken();
		nm.addPair("F_APPT_ID",fillerAppId);		
		nm.addPair("F_APPL",msh.getSendingApplication().getNamespaceID().getValue());
		nm.addPair("PKEY",pkey);			
		
		String reason = sch.getEventReason().getIdentifier().getValue();
		nm.addPair("EV_REAS",reason);
		//WDEV-8755
		if (reason != null && reason.toUpperCase().equals("REARRANGE"))
			nm.addPair("F_STATUS","Booked");
		else
			nm.addPair("F_STATUS",sch.getFillerStatusCode().getIdentifier().getValue());
		
		nm.addPair("APP_REAS",sch.getAppointmentReason().getIdentifier().getValue());
		
		String strTmpDateTime = null;
		strTmpDateTime = sch.getAppointmentTimingQuantity(0).getStartDateTime().getTimeOfAnEvent().getValue();
		if (strTmpDateTime == null || strTmpDateTime.equals(""))
			throw new HL7Exception("SCH.11 - Scheduled Date/Time is a required field");

		nm.addPair("ST_TIME",strTmpDateTime.substring(0,8));
 
		//MAXGEN-807, WDEV-8755 - put the extra 00 on time in JavaServer Business Rule as it's used to
		//reconstruct the filler_app_id, 
		//Removing it here allows us to disable the TrimFillerAppTstp trigger on sched_appointment	
		nm.addPair("APP_ST_TIME",strTmpDateTime.substring(8,12));
		nm.addPair("APP_END_TIME",strTmpDateTime.substring(8,12));

		nm.addPair("F_PER",sch.getEnteredByPerson(0).getIDNumber().getValue());
		nm.addPair("F_PHONE",sch.getFillerContactPhoneNumber().getPhoneNumber().getValue());
		nm.addPair("E_PER",sch.getEnteredByPerson(0).getIDNumber().getValue());
		nm.addPair("E_PHONE",sch.getFillerContactPhoneNumber().getPhoneNumber().getValue());
		
		date.toString(DateFormat.ISO);
		
		//df.parse(date.toString());
		nm.addPair("CDAT",date.toString(DateFormat.ISO));
		nm.addPair("CTIM",time.toString(TimeFormat.FLAT6));
		nm.addPair("RDAT",date.toString(DateFormat.ISO));
		nm.addPair("RTIM",time.toString(TimeFormat.FLAT6));
		if (bUpdating)
		{
			nm.addPair("UDAT",date.toString(DateFormat.ISO));
			nm.addPair("UTIM",time.toString(TimeFormat.FLAT6));
		}
		return nm;
	}
	
	public final String getSchedAppointment(String filleAppId) throws Exception
	{
		if (conn == null) throw new Exception("Cannot operate without connection to NAS Server.");
		
		if (filleAppId == null || filleAppId.length() == 0) throw new Exception("No filleAppId passed to getSchedAppointment");
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair("*SERVICE", "GENERIC_SCHEDULE");
		nm.addPair("*ACTION", "GET");
		nm.addPair("F_APPT_ID", filleAppId);
		
		StringBuffer outMess = new StringBuffer();
		StringBuffer errMess = new StringBuffer();
		int rv = conn.sendClientRequest(nm.toString(), outMess, errMess);
		if (rv < 0 && rv != -2)
		{
			throw new Exception("Error " + rv + " occurred making GENERIC_SCHEDULE GET call. " + errMess);			
		}
		if (rv == -2)
			return null;
		
		nm = new ImsNasMsg(outMess.toString());
		String appt_id = nm.getPairVal("APPT_ID");
		return appt_id;
	}
	
	public final void getServiceInfo(AIS ais,int nSeqNo,ImsNasMsg nm) throws Exception
	{
		nm.addPair("RES_SEQNO","" + nSeqNo);
		nm.addPair("RES_INFO","RESINFO"); //obsolete for ais
		nm.addPair("RES_TYPE",AIS_TYPE_CODE);
		nm.addPair("RES_TY_ROL","");
		nm.addPair("RES_GP","");				
		nm.addPair("RESST_TIME",ais.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RESEND_TIME",ais.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RES_QTY",ais.getDuration().getValue());
		nm.addPair("RES_QT_UT",ais.getDurationUnits().getIdentifier().getValue());
		nm.addPair("RESCDAT","");
		nm.addPair("RESCTIM","");
		nm.addPair("RESRDAT","");
		nm.addPair("RESRTIM","");
		nm.addPair("RESUDAT","");
		nm.addPair("RESUTIM","");
	}
	
	public final void getGroupInfo(AIG aig,int nSeqNo,ImsNasMsg nm) throws Exception
	{		
		nm.addPair("RES_SEQNO","" + nSeqNo);
		nm.addPair("RES_INFO","RESINFO"); //obsolete for aig
		nm.addPair("RES_TYPE",AIG_TYPE_CODE);
		nm.addPair("RES_TY_ROL",aig.getResourceType().getIdentifier().getValue());
		nm.addPair("RES_GP",aig.getResourceGroup(0).getText().getValue());
		nm.addPair("RESST_TIME",aig.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RESEND_TIME",aig.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RES_QTY",aig.getResourceQuantity().getValue());
		nm.addPair("RES_QT_UT",aig.getResourceQuantityUnits().getIdentifier().getValue());
		nm.addPair("RESCDAT","");
		nm.addPair("RESCTIM","");
		nm.addPair("RESRDAT","");
		nm.addPair("RESRTIM","");
		nm.addPair("RESUDAT","");
		nm.addPair("RESUTIM","");
	}
	
	public final void getLocationInfo(AIL ail,int nSeqNo,ImsNasMsg nm) throws Exception
	{		
		nm.addPair("RES_SEQNO","" + nSeqNo);
		nm.addPair("RES_INFO",ail.getLocationResourceID().getLocationDescription().getValue());
		nm.addPair("RES_TYPE",AIL_TYPE_CODE);
		nm.addPair("RES_TY_ROL",ail.getLocationTypeAIL().getIdentifier().getValue());
		nm.addPair("RES_GP",ail.getLocationGroup().getText().getValue());
		nm.addPair("RES_ID",ail.getLocationResourceID().getPointOfCare().getValue());
		nm.addPair("RESST_TIME",ail.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RESEND_TIME",ail.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RES_QTY","");
		nm.addPair("RES_QT_UT","");
		nm.addPair("RESCDAT","");
		nm.addPair("RESCTIM","");
		nm.addPair("RESRDAT","");
		nm.addPair("RESRTIM","");
		nm.addPair("RESUDAT","");
		nm.addPair("RESUTIM","");
	}
	
	public final void getPersonnellInfo(AIP aip,int nSeqNo,ImsNasMsg nm) throws Exception
	{		
		nm.addPair("RES_SEQNO","" + nSeqNo);
		nm.addPair("RES_INFO","RESINFO"); //obsolete for aig
		nm.addPair("RES_TYPE",AIP_TYPE_CODE);
		nm.addPair("RES_TY_ROL",aip.getResourceRole().getText().getValue());
		nm.addPair("RES_GP",aip.getResourceGroup().getText().getValue());
		nm.addPair("RESST_TIME",aip.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RESEND_TIME",aip.getStartDateTime().getTimeOfAnEvent().getValue());
		nm.addPair("RES_QTY","");
		nm.addPair("RES_QT_UT","");
		nm.addPair("RESCDAT","");
		nm.addPair("RESCTIM","");
		nm.addPair("RESRDAT","");
		nm.addPair("RESRTIM","");
		nm.addPair("RESUDAT","");
		nm.addPair("RESUTIM","");
	}

}
