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
package ims.admin.helper;

import ims.framework.utils.DateTime;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;

import java.text.ParseException;
import java.util.Calendar;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

public class ImsTrigger
{
	private static String DAILY = "Daily";
	private static String WEEKLY = "Weekly";
	private static String MONTHLY	= "Monthly";
		
	private String frequency;
	private DateTime startDateTime;
	private DateTime stopDateTime;
	private Integer days;
	private Integer hours;
	private Integer minutes;	
	private boolean mon;
	private boolean tue;
	private boolean wed;
	private boolean thu;
	private boolean fri;
	private boolean sat;
	private boolean sun;
	private Integer		dayOfMonth;
	private Time 		timeOfMonth;
	
	private String lastError = null;

	public ImsTrigger()
	{
	}

	public ImsTrigger(String xml)
	{
		try
		{
			this.initFromXML(xml);
		}
		catch (DocumentException e)
		{
			lastError = e.toString();
		}
		catch (ParseException e)
		{
			lastError = e.toString();
		}
		catch (Exception e)
		{
			lastError = e.toString();
		}
	}
	
	public String getFrequency()
	{
		return frequency;
	}
	
	private void initFromXML(String xmlTrigger) throws DocumentException, ParseException
	{
		Document maindoc = getXmlDocument(xmlTrigger);
	
		Node node = maindoc.selectSingleNode("trigger/frequency");
		if(node != null)
			frequency = node.getStringValue();	
		node = maindoc.selectSingleNode("trigger/startdatetime");		
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			startDateTime = new DateTime(node.getStringValue());
		node = maindoc.selectSingleNode("trigger/stopdatetime");		
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			stopDateTime = new DateTime(node.getStringValue());
		node = maindoc.selectSingleNode("trigger/days");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			days = new Integer(Integer.parseInt(node.getStringValue()));
		node = maindoc.selectSingleNode("trigger/hours");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			hours = new Integer(Integer.parseInt(node.getStringValue()));
		node = maindoc.selectSingleNode("trigger/minutes");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			minutes = new Integer(Integer.parseInt(node.getStringValue()));
		node = maindoc.selectSingleNode("trigger/mon");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			mon = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/tue");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			tue = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/wed");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			wed = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/thu");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			thu = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/fri");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			fri = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/sat");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			sat = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/sun");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			sun = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		
		node = maindoc.selectSingleNode("trigger/dayofmonth");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			dayOfMonth = new Integer(Integer.parseInt(node.getStringValue()));
		node = maindoc.selectSingleNode("trigger/timeofmonth");
		if(node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			timeOfMonth = new Time(node.getStringValue(), TimeFormat.FLAT4);
		
	}
	
	private Document getXmlDocument(String xmlBuffer) throws DocumentException
	{
		return DocumentHelper.parseText(xmlBuffer);
	}
	
	public String getLastError()
	{
		return lastError;
	}
	
	public DateTime getStartDateTime()
	{
		return startDateTime;
	}
	
	public DateTime getStopDateTime()
	{
		return stopDateTime;
	}
	
	public Object getRepeatInterval()
	{
		Object repeatInterval = null;
		
		if (days != null)
		{			
			repeatInterval = days * 24L * 60L * 60L * 1000L;				
			
			if (hours != null)
			{	
				repeatInterval = days * (24L * 60L * 60L * 1000L) +  hours * (60L * 60L * 1000L);				
				
				if (minutes != null)
				{	
					repeatInterval = days * (24L * 60L * 60L * 1000L) +  hours * (60L * 60L * 1000L) + minutes * (60L * 1000L);								
				}
			}
		}
		else if (hours != null)
		{
			repeatInterval = hours * (60L * 60L * 1000L);
			
			if (minutes != null)
			{	
				repeatInterval = hours * (60L * 60L * 1000L) + minutes * (60L * 1000L);								
			}
		}
		else if (minutes != null)
		{
			repeatInterval = minutes * (60L * 1000L);						
		}
		
		return repeatInterval;
	}
	
	
	public String getCronString()
	{
		StringBuffer cronString = new StringBuffer();
		
		java.util.Calendar cal = Calendar.getInstance();
		
		if(frequency.equals(DAILY))
		{
			cal.setTime(startDateTime.getJavaDate());

			cronString.append(cal.get(Calendar.SECOND)); //second
			cronString.append(" ");
			cronString.append(cal.get(Calendar.MINUTE)); //minute
			cronString.append(" ");
			cronString.append(cal.get(Calendar.HOUR_OF_DAY)); //hour
			cronString.append(" ");
			cronString.append("*"); //Day of month
			cronString.append("/");
			cronString.append(days);
			cronString.append(" *"); //Month
			cronString.append(" ?"); //Day of week
		}
		else if(frequency.equals(WEEKLY))
		{
			cal.setTime(startDateTime.getJavaDate());
			
			String comma = "";
			StringBuffer weekDays = new StringBuffer();
			
			if(mon == true)
			{
				weekDays.append("Mon");
				comma = ",";
			}
			if(tue == true)
			{
				weekDays.append(comma);
				weekDays.append("Tue");
				comma = ",";
			}
			if(wed == true)
			{
				weekDays.append(comma);
				weekDays.append("Wed");
				comma = ",";
			}
			if(thu == true)
			{
				weekDays.append(comma);
				weekDays.append("Thu");
				comma = ",";
			}
			if(fri == true)
			{
				weekDays.append(comma);
				weekDays.append("Fri");
				comma = ",";
			}
			if(sat == true)
			{
				weekDays.append(comma);
				weekDays.append("Sat");
				comma = ",";
			}
			if(sun == true)
			{
				weekDays.append(comma);
				weekDays.append("Sun");
				comma = ",";
			}
			
			cronString.append(cal.get(Calendar.SECOND)); //second
			cronString.append(" ");
			cronString.append(cal.get(Calendar.MINUTE)); //minute
			cronString.append(" ");
			cronString.append(cal.get(Calendar.HOUR_OF_DAY)); //hour
			cronString.append(" ?"); //Day of month
			cronString.append(" *"); //Month
			cronString.append(" "); 
			cronString.append(weekDays.toString()); //Day of week
		}
		else if(frequency.equals(MONTHLY))
		{
			cronString.append(timeOfMonth.getSecond()); //second
			cronString.append(" ");
			cronString.append(timeOfMonth.getMinute()); //minute
			cronString.append(" ");
			cronString.append(timeOfMonth.getHour()); //hour
			cronString.append(" ");
			cronString.append(dayOfMonth); //Day of month
			cronString.append(" *"); //Month
			cronString.append(" ?"); //Day of week
		}

		//System.out.println(cronString.toString());
		
		return cronString.toString();
	}
}
