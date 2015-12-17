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
 * Created on 05-Jan-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.scheduler.ActionSession;

import ims.framework.utils.Date;
import ims.scheduler.ActionData.ActionData;

import java.util.Hashtable;

/**
 * @author aursache
 * Stores the SessionDate, ActionID and the Session
 * for the dates that have a different actionID(changed in Booking Action Dialog) 
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class ActionSession
{
	Date sessionDate; 
	String actionID;
	int percentage;
	boolean actionChanged;
	int intervalTimeRequired;
	String appt_id;
	String 	sessionTime;
	Hashtable session;
	ActionData actionData;
	/**
	 * @param sessionDate
	 * @param actionID
	 * @param actionChanged
	 * @param session
	 * @param actionData
	 */
	public ActionSession(Date sessionDate, String actionID, Hashtable session, ActionData actionData) 
	{
		this.sessionDate = sessionDate;
		this.actionID = actionID;
		this.session = session;
		this.actionData = actionData;
		this.actionChanged = false;
		this.appt_id = "";
	}
	//Constructors
	public ActionSession()
	{
		setSessionDate(null);
		setActionID(new String(""));
		setSession(null);
		setActionData(null);
		setActionChanged(false);
		setAppt_id("");
	}

	//Setters
	public void setSessionDate(Date SessionDate)
	{
		this.sessionDate = SessionDate != null?SessionDate.copy():null;
	}
	public void setActionID(String Action_ID)
	{
		this.actionID = Action_ID;
	}
	public void setSession(Hashtable Session)
	{
		this.session = Session != null?(Hashtable)Session.clone():null;
	}
	public void setActionData(ActionData actionData) 
	{
		this.actionData = actionData;
	}
	public void setPercentage(int percentage) 
	{
		this.percentage = percentage;
	}
	public void setActionChanged(boolean actionChanged)
	{
		this.actionChanged = actionChanged;
	}
	public void setIntervalTimeRequired(int IntervalTimeRequired) 
	{
		this.intervalTimeRequired = IntervalTimeRequired;
	}
	public void setAppt_id(String appt_id) 
	{
		this.appt_id = appt_id;
	}
	public void setSessionTime(String sessTime) 
	{
		this.sessionTime = sessTime;
	}
	//Getters
	public Date getSessionDate(){return this.sessionDate;}
	public String getAction(){return this.actionID;}
	public Hashtable getSession(){return this.session;}
	public ActionData getActionData() {return actionData;}
	public int getPercentage() {return percentage;}
	public boolean isActionChanged() {return actionChanged;}
	public int getIntervalTimeRequired() {	return intervalTimeRequired;}
	public String getAppt_id() {return appt_id;}
	public String getSessionTime() {return sessionTime;}
}
