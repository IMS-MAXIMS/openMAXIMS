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
/*
 * Created on Jun 16, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.scheduler.DateSessionSlotsClass;

import ims.framework.utils.Date;
import java.util.ArrayList;

/**
 * @author vpurdila
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class DateSessionSlotsClass
{
	public DateSessionSlotsClass(Date Date, String SessionId, String SessionDetailsId, ArrayList SlotList)
	{
		date = Date;
		sessionId = SessionId;
		sessionDetailsId = SessionDetailsId;
		slotList = (ArrayList)SlotList.clone();
	}
	public DateSessionSlotsClass(Date Date, String SessionId, String SessionDetailsId, ArrayList SlotList, String Appt_id)
	{
		date = Date;
		sessionId = SessionId;
		sessionDetailsId = SessionDetailsId;
		slotList = (ArrayList)SlotList.clone();
		appt_id  = Appt_id;
	}
	
	public Date getDate(){return date;}
	public void setDate(Date value){date = value;}
	public String getSessionId(){return sessionId;}
	public void   setSessionId(String value){sessionId = value;}
	public String getSessionDetailsId() {return sessionDetailsId;}
	public void   setSessionDetailsId(String value) {sessionDetailsId = value;}
	public ArrayList getSlotList(){return slotList;}
	public void   setSlotList(ArrayList value){slotList = (ArrayList)value.clone();}
	public String getAppt_id() {return appt_id;}
	public void setAppt_id(String appt_id) {this.appt_id = appt_id;}
	
	private Date date;
	private String sessionId;
	private String sessionDetailsId;
	private ArrayList slotList;
	//26/01/2005 - Appt_id - Rebooking Action logic
	private String appt_id;
}
