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

import java.util.ArrayList;
import java.util.List;

import ims.hl7.utils.HL7Utils;
import imsmaxims.common.ImsNasMsg;
import imsmaxims.common.ImsNasPair;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Varies;


import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.datatype.ID;
import ca.uhn.hl7v2.model.v24.datatype.NDL;
import ca.uhn.hl7v2.model.v24.datatype.PL;
import ca.uhn.hl7v2.model.v24.datatype.TS;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.datatype.XTN;

import ca.uhn.hl7v2.model.v24.group.ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI;
import ca.uhn.hl7v2.model.v24.group.ORU_R01_PIDPD1NK1NTEPV1PV2;
import ca.uhn.hl7v2.model.v24.group.ORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI;
import ca.uhn.hl7v2.model.v24.message.ORU_R01;
import ca.uhn.hl7v2.model.v24.segment.NTE;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.ORC;
import ca.uhn.hl7v2.model.v24.segment.OBR;
import ca.uhn.hl7v2.model.v24.segment.PID;

public class R01NasMapper extends NasMapper
{
	
	private Integer pkey;
	private static final int DATE = 0;
	private static final int TIME = 1;
	private static final int DATETIME = 2;
	private static final int OBX_NTE = 0;
	private static final int OBR_NTE = 1;

	public ImsNasMsg translate(Message msg) throws Exception
	{	
		
		MSH msh = null;
		boolean bRadiology = false;
		
		if (conn == null)
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		if (!(msg instanceof ORU_R01))
		{
			throw new Exception("Message type for R01 must be ORU_R01");			
		}	
		ImsNasMsg ocs_results = new ImsNasMsg(); //create individual messages and then stitch them together at the enr
		
		
		ORU_R01 mt = (ORU_R01)msg;		
		ORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI group1 = mt.getORU_R01_PIDPD1NK1NTEPV1PV2ORCOBRNTECTDOBXNTEFT1CTI();		
		ORU_R01_PIDPD1NK1NTEPV1PV2 pid_group = group1.getORU_R01_PIDPD1NK1NTEPV1PV2();

		msh = mt.getMSH();
		setPkey(getPatientPkey(pid_group.getPID()));		
		if (getPkey() == null)
		{
			throw new Exception("Patient does not exist");						
		}
		
		int orc_obr_count = group1.getORU_R01_ORCOBRNTECTDOBXNTEFT1CTIReps();
		for (int i = 0; i < orc_obr_count; i++)
		{			
			ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group = group1.getORU_R01_ORCOBRNTECTDOBXNTEFT1CTI(i);
			int obx_count = orc_group.getORU_R01_OBXNTEReps();
			
			ocs_results.append(makeOCS_RESULTSMsg(orc_group,pid_group,msh.getSendingApplication().getNamespaceID().getValue(),bRadiology));
			ImsNasMsg ocs_comps = new ImsNasMsg();
			//ocs_results.append(ocs_comps);
			OBR obr = orc_group.getOBR();
			ID id = obr.getDiagnosticServSectID();
			//String[] names = id.getExtraComponents();
			List <String> names = new ArrayList<String>();
			
			
			if (obr.getDiagnosticServSectID().getValue().equals("RAD"))
			{
				bRadiology = true;
				
				StringBuffer repText = new StringBuffer();
				String val = "";
				//RCHT send report in multiple OBXs to preserve formatting without using escaping
				//so build up report from all obxs then put into first obx and translate as normal
				for (int j = 0; j < obx_count; j++)
				{
					OBX obx = orc_group.getORU_R01_OBXNTE(j).getOBX();
					String resVal = HL7Utils.getValueFromVariant(obx.getObservationValue(0),0);
					
					if (resVal == null || resVal.equals(""))
						repText.append("\r\n");
					else
					{
						repText.append(resVal);					
						repText.append("\r\n");
					}
				}
				
				OBX obx = orc_group.getORU_R01_OBXNTE(0).getOBX();
				
				ocs_results.append(ocs_comps);
				ocs_comps.append(makeOCS_COMPSMsg(obx,0,msh.getSendingApplication().getNamespaceID().getValue()));

				//clear RESVAL,TEXT_SEQNO and RES_TEXT
				ocs_comps.replacePair(ocs_comps.findPair("RES_VAL"),"");
				ocs_comps.replacePair(ocs_comps.findPair("TXT_SEQNO"),"");
				ocs_comps.replacePair(ocs_comps.findPair("RES_TEXT"),"");
 
				ocs_comps.addPairs(getTextInfo(repText.toString(), "TXT_SEQNO","RES_TEXT",null,0));
				
				if (bRadiology && ocs_comps.findPair("DATE_OF_OBS") != null)
				{
					//work around for JavaNas BR (where it retrieves 
					//display date/time/flag from Repeating Group
					//but we are not using the repeating group, so need to them manually)									
					ocs_results.addPair(ocs_comps.findPair("DATE_OF_OBS"));
					ocs_results.addPair(ocs_comps.findPair("TIME_OF_OBS"));
					ocs_results.addPair("DISPLAY_FLAG","E");					
				}
				
			}
			else
			{			
				for (int j = 0; j < obx_count; j++)
				{
					OBX obx = orc_group.getORU_R01_OBXNTE(j).getOBX();
					ocs_comps.append(makeOCS_COMPSMsg(obx,j,msh.getSendingApplication().getNamespaceID().getValue()));
					
					int obx_nte_count = orc_group.getORU_R01_OBXNTE(j).getNTEReps();
					for (int k = 0; k < obx_nte_count; k++)
					{					
						NTE nte = orc_group.getORU_R01_OBXNTE(j).getNTE(k);
						
						ArrayList ar = getNTEAttributes(nte,k,OBX_NTE);
						if (ar != null && ar.size() > 0)
							ocs_comps.addPairs(ar,j+1);				
					}					
				}
			}
			
			ocs_results.append(ocs_comps);
		}	
			
		return ocs_results;
	}
	
	private ImsNasMsg makeOCS_COMPSMsg(OBX obx, int seqNo, String msgSrcId) throws Exception
	{
		ImsNasMsg nm = new ImsNasMsg();
		
		nm.addPair("*SERVICE","OCS_COMPS");
		nm.addPair("ACTION","INSERT");		
		nm.addPair("RES_COMP_ID","");
		nm.addPair("RES_ID","");
		nm.addPair("RES_COMP_SEQ",""+seqNo+1);
		nm.addPair("RES_CD","");
		nm.addPair("RES_EXT_CD",obx.getObservationIdentifier().getIdentifier().getValue());
		String resVal = HL7Utils.getValueFromVariant(obx.getObservationValue(0),0);
		String valType = obx.getValueType().getValue();
		if (valType.equals("CE"))
			valType = "NM"; //JME Mar 2006
		nm.addPair("RES_VAL_TYPE",valType);
		if(valType.equals("FT") || valType.equals("TX"))
		{
			nm.addPair("RES_VAL","");
			nm.addPairs(getTextInfo(resVal,"TXT_SEQNO","RES_TEXT",null,0));
		}
		else
			nm.addPair("RES_VAL",resVal);
		
		nm.addPair("UNIT_OF_MEASURE",obx.getUnits().getText().getValue());
		nm.addPair("REF_RANGE",obx.getReferencesRange().getValue());
		nm.addPair("ABNORMAL_FLAG",obx.getAbnormalFlags().getValue());
		nm.addPair("RES_STAT","F");

		TS ts = obx.getDateTimeOfTheObservation();
		String dt;
		
		if (ts != null && (dt = ts.getTimeOfAnEvent().getValue()) != null)
		{			
			nm.addPair("DATE_OF_OBS",getDateTime(dt,DATE));
			nm.addPair("TIME_OF_OBS",getDateTime(dt,TIME));		
		}
		nm.addPair("RES_EXT_NAME",obx.getObservationIdentifier().getText().getValue());
		nm.addPair("RES_NAME",obx.getObservationIdentifier().getText().getValue());
		nm.addPair("COMP_MSG_SRC_ID",msgSrcId); //config flags?
		
		return nm;

	}
	
	private ArrayList makeOCS_RESULTSMsg(ORU_R01_ORCOBRNTECTDOBXNTEFT1CTI orc_group, ORU_R01_PIDPD1NK1NTEPV1PV2 pid_group, String msgSrcId, boolean bRadiology) throws Exception
	{

		ArrayList nmList = new ArrayList();
		ORC orc = orc_group.getORC();			
		OBR obr = orc_group.getOBR();
		PID pid = pid_group.getPID();
		
		nmList.add (new ImsNasPair("*SERVICE","OCS_RESULTS"));
		nmList.add (new ImsNasPair("ACTION","INSERT"));	
		
		nmList.add (new ImsNasPair("PKEY",getPkey().toString()));		
		String perfOrdNum = obr.getFillerOrderNumber().getEntityIdentifier().getValue();
		if (perfOrdNum == null) throw new Exception ("No Filler Order Number found in OBR.3");
		nmList.add (new ImsNasPair("PERF_ORD_NUM",perfOrdNum));		
		nmList.add (new ImsNasPair("HL7_MESS_TYPE",orc.getOrderControl().getValue()));
		nmList.add (new ImsNasPair("PERF_NAME",obr.getDiagnosticServSectID().getValue()));
		nmList.add (new ImsNasPair("ORDER_ID",obr.getPlacerOrderNumber().getEntityIdentifier().getValue()));
		String discip = obr.getDiagnosticServSectID().getValue();
		
		Varies v = obr.getDiagnosticServSectID().getExtraComponents().getComponent(0);
		String discipTxt = HL7Utils.getValueFromVariant(v, 0);			
	
		
		if (discip == null) throw new Exception ("Discipline not specified (OBR.24)");
		if (discipTxt != null && discipTxt.length() > 0)
			nmList.add (new ImsNasPair("DISCIP_EXT_CD",discipTxt));
		else
			nmList.add (new ImsNasPair("DISCIP_EXT_CD",discip));
		//nm.addPair("PARENT_ORD_NO",obr.getParentNumber().getParentSFillerOrderNumber());
		//PartialDate pd = new PartialDate(ts.getTimeOfAnEvent().getValue());				
		String dt = obr.getResultsRptStatusChngDateTime().getTimeOfAnEvent().getValue();
		if (dt == null)
			dt = obr.getObservationDateTime().getTimeOfAnEvent().getValue();
		if (dt != null)
		{
			nmList.add (new ImsNasPair("REP_DATE",getDateTime(dt,DATETIME)));
			nmList.add (new ImsNasPair("REP_TIME",getDateTime(dt,TIME)));
		}
		
		if (obr.getDiagnosticServSectID().getValue().equals("RAD"))
		{
			bRadiology = true;
			nmList.add (new ImsNasPair("TEST_CAT","RAD"));
		}
		else if (obr.getDiagnosticServSectID().getValue().equals("LAB"))
			nmList.add (new ImsNasPair("TEST_CAT","LAB")); 
		else
			throw new Exception("OBR[24] (Diagnostic Service Sector Id) is invalid - must be 'LAB' or 'RAD'");
			
		nmList.add (new ImsNasPair("PARENT_RES_ID",obr.getParentResult().getOBX3ObservationIdentifierOfParentResult().getIdentifier().getValue()));
		if (bRadiology)
		{		
			if (obr.getPrincipalResultInterpreter() != null)
			{
				NDL ndl = obr.getPrincipalResultInterpreter();
				nmList.add (new ImsNasPair("PR_RES_INTERP_NM",ndl.getOPName().getFamilyName().getValue()));
			}
			nmList.add (new ImsNasPair("ASS_RES_INTERP_CD",""));		
			nmList.add (new ImsNasPair("ASS_RES_INTERP_NM",""));
		}
		//don't know what to do with these yet.
		nmList.add (new ImsNasPair("TECH_CODE",obr.getTechnician(0).getRoom().getValue()));
		nmList.add (new ImsNasPair("TECH_NAME",obr.getTechnician(0).getRoom().getValue()));
		nmList.add (new ImsNasPair("TRANS_CODE",obr.getTranscriptionist(0).getRoom().getValue()));
		nmList.add (new ImsNasPair("TRANS_NAME",obr.getTranscriptionist(0).getRoom().getValue()));
		if (msgSrcId != null)
		{
			nmList.add (new ImsNasPair("MSG_SRC_ID",msgSrcId));
		}
		else
		{			
			nmList.add (new ImsNasPair("MSG_SRC_ID",""));
		}
		
		nmList.add (new ImsNasPair("RES_STAT_HD",obr.getResultStatus().getValue()));
		CE ce = obr.getUniversalServiceIdentifier();
		String sName = ce.getText().getValue();
		String sCode = ce.getIdentifier().getValue();
		if (sName == null || sName.equals(""))
		{
			sName = ce.getAlternateText().getValue();		
		}
		if  (sCode == null || sCode.equals(""))
		{
			sCode = ce.getAlternateIdentifier().getValue();
		}
			
				
		nmList.add (new ImsNasPair("TEST_EXT_NM",sName));
		nmList.add (new ImsNasPair("TEST_EXT_CD",sCode));
		
		nmList.add (new ImsNasPair("PERF_ORG_NM",obr.getFillerField1().getValue()));
		nmList.add (new ImsNasPair("RES_ORD_ID",""));
		nmList.add (new ImsNasPair("RES_ORDNO",obr.getFillerOrderNumber().getEntityIdentifier().getValue()));
		nmList.add (new ImsNasPair("REQ_USER_NM",obr.getOrderingProvider(0).getIDNumber().getValue()));
		nmList.add (new ImsNasPair("REQ_CONTACT_NO",obr.getOrderCallbackPhoneNumber(0).getPhoneNumber().getValue()));		
		dt = obr.getRequestedDateTime().getTimeOfAnEvent().getValue();				
		if (dt != null)
		{
			nmList.add (new ImsNasPair("REQ_DT",getDateTime(dt,DATE)));
			nmList.add (new ImsNasPair("REQ_TM",getDateTime(dt,TIME)));
		}
		else
		{
			dt = orc.getQuantityTiming(0).getStartDateTime().getTimeOfAnEvent().getValue();				
			if (dt != null)
			{
				nmList.add (new ImsNasPair("REQ_DT",getDateTime(dt,DATE)));
				nmList.add (new ImsNasPair("REQ_TM",getDateTime(dt,TIME)));			
			}
		}
		nmList.add (new ImsNasPair("PROC_NM",obr.getUniversalServiceIdentifier().getIdentifier().getValue()));
		nmList.add (new ImsNasPair("PRTY_CD",obr.getQuantityTiming(0).getPriority().getValue()));
		nmList.add (new ImsNasPair("DNGR_CD",obr.getDangerCode().getIdentifier().getValue()));
		nmList.add (new ImsNasPair("DNGR_NM",obr.getDangerCode().getText().getValue()));
		nmList.add (new ImsNasPair("ABN_FL","N")); //maybe calculate based on OBX abnormal flags?
		dt = obr.getObservationDateTime().getTimeOfAnEvent().getValue();
		if (dt != null)
		{	
			nmList.add (new ImsNasPair("SPC_COLL_DT",getDateTime(dt,DATE)));
			nmList.add (new ImsNasPair("SPC_COLL_TM",getDateTime(dt,TIME)));
		}
		nmList.add (new ImsNasPair("SPC_COLL_CD",obr.getCollectorIdentifier(0).getFamilyName().getSurname().getValue()));
		nmList.add (new ImsNasPair("SPC_ACT_CD",obr.getSpecimenActionCode().getValue()));
		dt = obr.getSpecimenReceivedDateTime().getTimeOfAnEvent().getValue();
		if (dt != null)
		{
			nmList.add (new ImsNasPair("SPC_RX_DT",getDateTime(dt,DATE)));
			nmList.add (new ImsNasPair("SPC_RX_TIME",getDateTime(dt,TIME)));
			nmList.add (new ImsNasPair("SPC_COLL_END_DT",getDateTime(dt,DATE)));
			nmList.add (new ImsNasPair("SPC_COLL_END_TM",getDateTime(dt,TIME)));
			
		}
		String spcSrc = obr.getSpecimenSource().getSpecimenSourceNameOrCode().getIdentifier().getValue();
		//if (spcSrc == null && !obr.getDiagnosticServSectID().getValue().equals("RAD")) throw new Exception ("Specimen Source Name must be provided (OBR.15)");
		nmList.add (new ImsNasPair("SPC_SRC_NM",spcSrc ));
		nmList.add (new ImsNasPair("SPC_SITE_NM",obr.getSpecimenSource().getSpecimenSourceNameOrCode().getIdentifier().getValue()));
		nmList.add (new ImsNasPair("SPC_NO_CONT",obr.getNumberOfSampleContainers().getValue()));
		nmList.add (new ImsNasPair("SPC_TPORT",obr.getTransportLogisticsOfCollectedSample(0).getIdentifier().getValue()));
		if (msgSrcId != null) 
			nmList.add (new ImsNasPair("MSG_SRC_ID",msgSrcId));
		else
			nmList.add (new ImsNasPair("MSG_SRC_ID",""));
		
		nmList.add (new ImsNasPair("PERF_TEL",orc.getCallBackPhoneNumber(0).getPhoneNumber().getValue()));		
		nmList.add (new ImsNasPair("CODE_CONTEXT_ID","-1"));
		nmList.add (new ImsNasPair("TEST_NOTE","-1"));
		
		//To ensure RCHT examined date/time is displayed 
		if (bRadiology)		
			dt = obr.getQuantityTiming(0).getStartDateTime().getTimeOfAnEvent().getValue();
		else			
			dt = obr.getObservationDateTime().getTimeOfAnEvent().getValue();
			
		if (dt != null)
		{
			nmList.add (new ImsNasPair("DISPLAY_DATE",getDateTime(dt,DATE)));
			nmList.add (new ImsNasPair("DISPLAY_TIME",getDateTime(dt,TIME)));
		}
		
		String status = obr.getResultStatus().getValue();
		if (status != null)
		{	//throw new Exception("OBX[11] (Observation Result Status) is a required field"); //only for OBX status
			if (status.equals("P") || status.equals("X"))
				nmList.add (new ImsNasPair("VW_STAT_TXT","NEW"));
			else if (status.equals("C") || status.equals("F"))
				nmList.add (new ImsNasPair("VW_STAT_TXT","UPD"));
			else
				nmList.add (new ImsNasPair("VW_STAT_TXT","UNK"));
		}
			
		nmList.add (new ImsNasPair("TEST_NM",obr.getUniversalServiceIdentifier().getIdentifier().getValue()));
		nmList.add (new ImsNasPair("RES_ORD_ID",""));
		nmList.add (new ImsNasPair("ORD_LOC_NM",orc.getEntererSLocation().getPointOfCare().getValue()));
		nmList.add (new ImsNasPair("RESP_CONS_NM",""/*obr.getOrderingProvider(0).getFamilyName().getOwnSurname().getValue()*/));
		nmList.add (new ImsNasPair("REJ_REASON",""));
		nmList.add (new ImsNasPair("REJ_REASON_TXT",""));
		nmList.add (new ImsNasPair("RES_SPEC_ID",""));
		nmList.add (new ImsNasPair("SPC_COLL_VOL",obr.getCollectionVolume().getQuantity().getValue()));
		nmList.add (new ImsNasPair("SPC_SITE_EXT_CD",obr.getSpecimenSource().getSpecimenSourceNameOrCode().getIdentifier().getValue()));
		nmList.add (new ImsNasPair("SPC_SRC_EXT_CD",obr.getSpecimenSource().getSpecimenSourceNameOrCode().getIdentifier().getValue()));		
		String spcCode = obr.getFillerOrderNumber().getEntityIdentifier().getValue();
		//if (spcCode == null)
			//throw new Exception("Specimen Code/Lab No. must be specified (OBR.20)");
		
		nmList.add (new ImsNasPair("SPC_PERF_CD",spcCode));
		nmList.add (new ImsNasPair("RES_CMNT",""));
		nmList.add (new ImsNasPair("SPEC_RESULTS",""));
		nmList.add (new ImsNasPair("NUMDAYS",""));		
		nmList.add (new ImsNasPair("CHART_FLAG",""));
		nmList.add (new ImsNasPair("RG_UPDATE_FLAG",""));
		nmList.add (new ImsNasPair("AUTHORISED_FLAG",""));

		//--------------		
		//	PID INFO
		//--------------
		
		if (pid != null)
		{
			//patient stuff (ends up in ocs_orders insert on result only sites)
			XPN pat_name = pid.getPatientName(0);
			nmList.add (new ImsNasPair("RES_EXT_PATID",pid.getPatientIdentifierList(0).getID().getValue()));
			nmList.add (new ImsNasPair("RES_EXT_PATID_TYPE",pid.getPatientIdentifierList(0).getAssigningAuthority().getNamespaceID().getValue()));			
			nmList.add (new ImsNasPair("RES_NHS_NO",pid.getSSNNumberPatient().getValue()));
			nmList.add (new ImsNasPair("RES_TITLE",pat_name.getPrefixEgDR().getValue()));
			nmList.add (new ImsNasPair("RES_FNAME",pat_name.getGivenName().getValue()));
			nmList.add (new ImsNasPair("RES_SNAME",pat_name.getFamilyName().getName()));
			if (pid.getDateTimeOfBirth() != null && pid.getDateTimeOfBirth().getTimeOfAnEvent() != null && pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue() != null)
				nmList.add (new ImsNasPair("RES_DOB",getDateTime(pid.getDateTimeOfBirth().getTimeOfAnEvent().getValue(),DATE)));
			nmList.add (new ImsNasPair("RES_SEX",pid.getAdministrativeSex().getValue()));
			if (pid.getPatientAddress(0) != null){				
				nmList.add (new ImsNasPair("RES_ADD1",pid.getPatientAddress(0).getStreetAddress().getStreetOrMailingAddress().getValue()));
				nmList.add (new ImsNasPair("RES_ADD2",pid.getPatientAddress(0).getCity().getValue()));
				nmList.add (new ImsNasPair("RES_ADD3",pid.getPatientAddress(0).getStateOrProvince().getValue()));
				nmList.add (new ImsNasPair("RES_ADD4",pid.getPatientAddress(0).getZipOrPostalCode().getValue()));
			}
			nmList.add (new ImsNasPair("AC_NO",pid.getPatientAccountNumber().getID().getValue()));
			nmList.add (new ImsNasPair("SS_NO",pid.getSSNNumberPatient().getValue()));		
		}
		
		//TODO review specs for these
		PL pl = orc.getEntererSLocation();		
		nmList.add (new ImsNasPair("ORD_LOC_EXT_CD",pl.getPointOfCare().getValue()));
		String locName = pl.getLocationDescription().getValue();
		if (locName == null || locName.equals("")) locName = pl.getPointOfCare().getValue();
		nmList.add (new ImsNasPair("ORD_LOC_EXT_NM",locName));
		
		XCN xcn = orc.getOrderingProvider(0);
		nmList.add (new ImsNasPair("RESP_CONS_EXT_CD",xcn.getIDNumber().getValue()));
		String consName = xcn.getFamilyName().getSurname().getValue();
		if (consName == null || consName.equals("")) consName = xcn.getIDNumber().getValue(); 
		nmList.add (new ImsNasPair("RESP_CONS_EXT_NM",consName));
		
		StringBuffer note = new StringBuffer();
		// Build up content of PID NTEs into single CLNC_NOTE attribute		
		if (pid_group.getNTEReps() > 0)
		{		
			for (int i = 0; i < pid_group.getNTEReps(); i++)
			{
				for (int j = 0; j < pid_group.getNTE(i).getComment().length;j++)
				{
					note.append(pid_group.getNTE(i).getComment(j));
					note.append(" ");
				}
			}			
			nmList.add (new ImsNasPair("CLNC_NOTE",note.toString()));
		}
		// OBR NTEs		
		if (orc_group.getNTEReps() > 0)
		{
			Integer nSeqNo = new Integer(0);
			int nxt_i = 1;
			for (int i = 0; i < orc_group.getNTEReps(); i++)
			{
				//nSeqNo = i;
				ArrayList tmp = getNTEAttributes(orc_group.getNTE(i),nSeqNo, OBR_NTE); 
				if (tmp != null && tmp.size() > 0)
				{
					nmList.addAll(tmp);
					nSeqNo+= tmp.size() / 4;
				}
			}
		}
		return nmList;

	}
	

	private ArrayList getTextInfo(String resVal,String attrSeqno, String attrTxt,ArrayList prependList,Integer nSeqNo)
	{
		ArrayList nmList = new ArrayList();
		
		int ptr = 0;
		//int nSeqNo = 0;
		//tmp
		//attrSeqno = "TXT_SEQNO";
		//attrTxt = "RES_TEXT";

		if (resVal.length() <= 0 )
			return null;
		
		while (resVal.length() > 255 && ptr < resVal.length())
		{
			nmList.add(new ImsNasPair(attrSeqno,nSeqNo.toString()));			
			nmList.add(new ImsNasPair(attrTxt,resVal.substring(ptr,ptr+255)));

			if (prependList != null)
			{		
				nmList.add(new ImsNasPair("CMNT_SRC","1"));
				nmList.add(new ImsNasPair("CMNT_TYPE_CD","1"));
			}
			ptr+=255;
			if (ptr > resVal.length() || ptr+255 > resVal.length())
			{
				resVal = resVal.substring(ptr);
				ptr = resVal.length();
			}
			nSeqNo = nSeqNo +1;			
		}
		// bring this back in
		if (prependList != null)
		{		
			nmList.add(new ImsNasPair("CMNT_SRC","1"));
			nmList.add(new ImsNasPair("CMNT_TYPE_CD","1"));
		}
		nmList.add(new ImsNasPair(attrSeqno ,nSeqNo.toString()));
		nmList.add(new ImsNasPair(attrTxt,resVal));
		
		return nmList;
	}


	private boolean isValidNTE(NTE nte) throws HL7Exception
	{
		if (nte == null)
			return false;
		String s1,s2,s3,s4;
		
		s1 = nte.getCommentType().getIdentifier().getValue();
		s2 = nte.getComment(0).getValue();
		s3 = nte.getSourceOfComment().getValue();
		s4 = nte.getSetIDNTE().getValue();
		
		if ((s1 == null || s1.equals("")) &&
			(s2 == null || s2.equals("")) &&
			(s3 == null || s3.equals("")) &&
			(s4 == null || s4.equals("")) )
			return false;
				
				
				
				//("")&& s2 == null && s3 == null && s4 == null)
			//return false;
		
		//if (s1.equals("") && s2.equals("") && s3.equals("") && s4.equals(""))
			//return false;
		
		
		return true;
	}
	
	private ArrayList getNTEAttributes(NTE nte,Integer nSeqNo, int type) throws HL7Exception
	{
		ArrayList nmList = new ArrayList();
		
		if (!isValidNTE(nte))
			return null;
		
		//if (nte == null)
		//	return nmList;
		
		if (type != OBR_NTE) //blank NTEs are OK for OBR NTEs (e.g. for formatting of reports), probably should be ok anyway
		{			
			if (nte.getComment(0).getValue() == null || nte.getComment(0).getValue().equals(""))
				return null;
			
			/*if (nte.getComment(0).getValue().equals("") )
				return nmList;*/
		}
		
		if (type == OBX_NTE)
		{			
			//String cmntType = nte.getCommentType().getIdentifier().getValue();
			nmList.add(new ImsNasPair("CMNT_SEQNO",""+nSeqNo));
			StringBuffer note = new StringBuffer();
			for (int i = 0; i < nte.getComment().length;i++)
			{
				note.append(nte.getComment(i));
				note.append(" ");
			}
			nmList.add(new ImsNasPair("CMNT_TXT",note.toString()));		
			nmList.add(new ImsNasPair("CMNT_TYPE","1"));
			ID id = nte.getSourceOfComment();
			if (id == null || id.getValue() == null || id.getValue().equals(""))
				nmList.add(new ImsNasPair("CMNT_SRC","X"));
			else
				nmList.add(new ImsNasPair("CMNT_SRC",nte.getSourceOfComment().getValue()));
		}
		else if (type == OBR_NTE)
		{
			int nRepeats = nte.getComment().length; 
			ArrayList rgPairs = new ArrayList();
			//Ensure blank NTEs are included
			if (nRepeats == 0)
				nRepeats = 1;
			
			for (int j = 0; j < nRepeats;j++)
			{
				String s = nte.getComment(j).getValue();
				String cmntSrc = "", chunk = "", typeCode = "1";
				
				ID id = nte.getSourceOfComment(); 
				if (id == null || id.getValue() == null || id.getValue().equals(""))
					cmntSrc = "1";
				else
					cmntSrc = nte.getSourceOfComment().getValue();
					//nmList.add(new ImsNasPair("CMNT_SRC",nte.getSourceOfComment().getValue()));
				
				
				if (s == null || s.equals(""))
				{
					nmList.add(new ImsNasPair("RESCOMM_TXT"," "));
					nmList.add(new ImsNasPair("RESCOMM_SEQNO","" + nSeqNo));
					nmList.add(new ImsNasPair("CMNT_SRC",cmntSrc));
					nmList.add(new ImsNasPair("CMNT_TYPE_CD",typeCode));	
				}
				else if (s.length() <= 255)
				{					
					nmList.add(new ImsNasPair("RESCOMM_TXT",s));
					nmList.add(new ImsNasPair("RESCOMM_SEQNO","" + nSeqNo));
					nmList.add(new ImsNasPair("CMNT_SRC",cmntSrc));
					nmList.add(new ImsNasPair("CMNT_TYPE_CD",typeCode));												
				}
				else
				{
					chunk = nte.getComment(j).getValue();
					
					rgPairs.add(new ImsNasPair("CMNT_SRC",cmntSrc));
					rgPairs.add(new ImsNasPair("CMNT_TYPE_CD",typeCode));
					nmList.addAll(getTextInfo(chunk,"RESCOMM_SEQNO","RESCOMM_TXT",rgPairs,nSeqNo));

					//nSeqNo = 0;
					//nmList.add(new ImsNasPair("RESCOMM_TXT",nte.getComment(j).getValue()));
					//Nas Server handles RESCOMM_TXT in chunks of 255, whereas NTE comment is FT (up to 64k)
					/*
					while(chunk.length() > 255)
					{						
						
						String txt = chunk.substring(0,255);
						nmList.add(new ImsNasPair("RESCOMM_TXT",txt));						
						nmList.add(new ImsNasPair("RESCOMM_SEQNO","" + ++nSeqNo));
						nmList.add(new ImsNasPair("CMNT_SRC",cmntSrc));
						nmList.add(new ImsNasPair("CMNT_TYPE_CD",typeCode));
						
						chunk = chunk.substring(255);						
					}
					nmList.add(new ImsNasPair("RESCOMM_TXT",chunk));						
					nmList.add(new ImsNasPair("RESCOMM_SEQNO","" + ++nSeqNo));
					nmList.add(new ImsNasPair("CMNT_SRC",cmntSrc));
					nmList.add(new ImsNasPair("CMNT_TYPE_CD",typeCode));*/

				}
			}
			
		}
		
		return nmList;		
	}


	private Integer getPkey()
	{
		return pkey;
	}


	private void setPkey(Integer pkey)
	{
		this.pkey = pkey;
	}


}
