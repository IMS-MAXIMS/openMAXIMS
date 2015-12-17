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

//import ims.configuration.ConfigFlag;
import imsmaxims.common.ImsNasMsg;
import imsmaxims.common.ImsNasPair;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v231.message.QRY_A19;
import ca.uhn.hl7v2.model.v231.segment.QRD;



public class V231A19NasMapper extends V231NasMapper
{
	/*
	private ImsNasMsg getNextListNASMessage(Message msg) throws Exception
	{
		ImsNasMsg nm = new ImsNasMsg();
		QRD qrd = (QRD)msg.get("QRD");
		String maxno = qrd.getQuantityLimitedRequest().getQuantity().getValue();
		if (maxno.length() == 0)
			maxno = "" + ConfigFlag.DOM.PAT_SEARCH_MAX_SIZE.getValue();
		nm.addPair (new ImsNasPair("*SERVICE","PATIENT"));
		nm.addPair (new ImsNasPair("ACTION","NEXTLIST"));
		nm.addPair (new ImsNasPair("MAXNO",maxno));
		return nm;
	}*/
	
	
	
	private ImsNasMsg getQueryNASMessage(Message msg) throws Exception
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		if (!(msg instanceof QRY_A19))
		{
			throw new Exception("Message type for A19 must be QRY_A19");			
		}
		
		QRY_A19 mt = (QRY_A19)msg;
		QRD qrd = mt.getQRD();
		
		ImsNasMsg nm = new ImsNasMsg();
		nm.addPair (new ImsNasPair("*SERVICE","PATIENT"));
		
		//Query by Patient or snm,dob,sex (which must all be together)
		String idNum = qrd.getWhoSubjectFilter(0).getIDNumber().getValue();
		if (idNum != null && idNum.length() > 0) //what id type is this meant to be?
		{
			nm.addPair (new ImsNasPair("ACTION","GET"));
			//nm.addPair (new ImsNasPair("ACTION","GET")); //supported
			nm.addPair (new ImsNasPair("HOSPNUM",idNum));
			
		}
		else
		{
			nm.addPair (new ImsNasPair("ACTION","LIST"));
			//"" + ConfigFlag.DOM.PAT_SEARCH_MAX_SIZE.getValue()
			nm.addPair (new ImsNasPair("MAXNO",qrd.getQuantityLimitedRequest().getQuantity().getValue()));		
			
			//QRD[8.2]
			String snm = qrd.getWhoSubjectFilter(0).getFamilyLastName().getFamilyName().getValue();
			//QRD[8.3]
			String fnm = qrd.getWhoSubjectFilter(0).getGivenName().getValue();
			//QRD[8.4]		
			String dob = qrd.getWhoSubjectFilter(0).getMiddleInitialOrName().getValue(); //PAS kludge
			//QRD[2.5]
			String sex = qrd.getWhoSubjectFilter(0).getSuffixEgJRorIII().getValue();
			
			if (snm != null && snm.length() > 0)
				nm.addPair (new ImsNasPair("SNM",snm));
			if (fnm != null && fnm.length() > 0)
				nm.addPair (new ImsNasPair("FNM1",fnm));
			if (dob != null && dob.length() > 0)
				nm.addPair(new ImsNasPair("DOB",getDateTime(dob,DATE)));
			if (sex != null && sex.length() > 0)
				nm.addPair(new ImsNasPair("PAS_SEX",sex));
		}
		if (nm.getPairCount() == 1)
			return null;
		return nm;
	}
/*
	public ImsNasMsg nextList()
	{
		return this.getNextListNASMessage();
	}*/
	public ImsNasMsg translate(Message msg) throws Exception
	{
		// TODO Auto-generated method stub
		//check MSH for continuation pointer
		//if (isContinueMsg(msg))
		//	return nextList();
		
		return getQueryNASMessage(msg);
	}

}
