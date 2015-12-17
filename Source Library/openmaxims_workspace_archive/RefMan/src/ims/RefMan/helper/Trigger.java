/*
 * Created on 11 Nov 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.RefMan.helper;

import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.framework.utils.StringUtils;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;

import java.text.ParseException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

public class Trigger
{
	private static String	daily	= "Daily";
	private static String	weekly	= "Weekly";
	private static String	monthly	= "Monthly";

	private String		frequency;
	private DateTime	startDateTime;
	private Integer		days;
	private Integer		weeks;
	private boolean		mon;
	private boolean		tue;
	private boolean		wed;
	private boolean		thu;
	private boolean		fri;
	private boolean		sat;
	private boolean		sun;
	private Integer		dayOfMonth;
	private Time 		timeOfMonth;
	ims.framework.UIEngine engine;

	public Trigger(ims.framework.UIEngine eng)
	{
		engine = eng;
	}

	public Trigger(String xml, ims.framework.UIEngine eng)
	{
		engine = eng;

		try
		{
			this.initFromXML(xml);
		}
		catch (DocumentException e)
		{
			engine.showMessage("Error deserializing trigger: " + e.toString());
		}
		catch (ParseException e)
		{
			engine.showMessage("Error deserializing trigger: " + e.toString());
		}
		catch (Exception e)
		{
			engine.showMessage("Error deserializing trigger: " + e.toString());
		}
	}

	public Integer getDays()
	{
		return days;
	}

	public void setDays(Integer days)
	{
		this.days = days;
	}

	public String getFrequency()
	{
		return frequency;
	}

	public void setFrequency(String frequency)
	{
		this.frequency = frequency;
	}

	public boolean isFri()
	{
		return fri;
	}

	public void setFri(boolean fri)
	{
		this.fri = fri;
	}

	public boolean isMon()
	{
		return mon;
	}

	public void setMon(boolean mon)
	{
		this.mon = mon;
	}

	public boolean isSat()
	{
		return sat;
	}

	public void setSat(boolean sat)
	{
		this.sat = sat;
	}

	public DateTime getStartDateTime()
	{
		return startDateTime;
	}

	public void setStartDateTime(DateTime startDateTime)
	{
		this.startDateTime = startDateTime;
	}

	public boolean isSun()
	{
		return sun;
	}

	public void setSun(boolean sun)
	{
		this.sun = sun;
	}

	public boolean isThu()
	{
		return thu;
	}

	public void setThu(boolean thu)
	{
		this.thu = thu;
	}

	public boolean isTue()
	{
		return tue;
	}

	public void setTue(boolean tue)
	{
		this.tue = tue;
	}

	public boolean isWed()
	{
		return wed;
	}

	public void setWed(boolean wed)
	{
		this.wed = wed;
	}

	public Integer getWeeks()
	{
		return weeks;
	}

	public void setWeeks(Integer weeks)
	{
		this.weeks = weeks;
	}


	public Integer getDayOfMonth()
	{
		return dayOfMonth;
	}

	public void setDayOfMonth(Integer dayOfMonth)
	{
		this.dayOfMonth = dayOfMonth;
	}

	public Time getTimeOfMonth()
	{
		return timeOfMonth;
	}

	public void setTimeOfMonth(Time timeOfMonth)
	{
		this.timeOfMonth = timeOfMonth;
	}

	public String toXML()
	{
		if (frequency == null || frequency.length() == 0 || (days == null && weeks == null && weekly.equals(frequency)) || (startDateTime == null && !monthly.equals(frequency)))
			return null;

		StringBuffer sb = new StringBuffer();

		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		sb.append("<trigger>");
		sb.append("<frequency>");
		sb.append(StringUtils.encodeXML(frequency));
		sb.append("</frequency>");
		sb.append("<startdatetime>");
		sb.append(StringUtils.encodeXML(startDateTime != null ? startDateTime.toString(DateTimeFormat.ISO) : ""));
		sb.append("</startdatetime>");
		sb.append("<days>");
		sb.append(days != null ? String.valueOf(days) : "");
		sb.append("</days>");
		sb.append("<weeks>");
		sb.append(weeks != null ? String.valueOf(weeks) : "");
		sb.append("</weeks>");
		sb.append("<mon>");
		sb.append(mon);
		sb.append("</mon>");
		sb.append("<tue>");
		sb.append(tue);
		sb.append("</tue>");
		sb.append("<wed>");
		sb.append(wed);
		sb.append("</wed>");
		sb.append("<thu>");
		sb.append(thu);
		sb.append("</thu>");
		sb.append("<fri>");
		sb.append(fri);
		sb.append("</fri>");
		sb.append("<sat>");
		sb.append(sat);
		sb.append("</sat>");
		sb.append("<sun>");
		sb.append(sun);
		sb.append("</sun>");
		sb.append("<dayofmonth>");
		sb.append(dayOfMonth != null ? String.valueOf(dayOfMonth) : "");
		sb.append("</dayofmonth>");
		sb.append("<timeofmonth>");
		sb.append(StringUtils.encodeXML(timeOfMonth != null ? timeOfMonth.toString(TimeFormat.FLAT4) : ""));
		sb.append("</timeofmonth>");

		sb.append("</trigger>");

		return sb.toString();
	}

	private void initFromXML(String xmlTrigger) throws DocumentException, ParseException
	{
		Document maindoc = getXmlDocument(xmlTrigger);

		Node node = maindoc.selectSingleNode("trigger/frequency");
		if(node != null)
			frequency = node.getStringValue();
		node = maindoc.selectSingleNode("trigger/startdatetime");
		if(node != null && node.getStringValue().length() > 0)
			startDateTime = new DateTime(node.getStringValue());
		node = maindoc.selectSingleNode("trigger/days");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			days = new Integer(Integer.parseInt(node.getStringValue()));
		node = maindoc.selectSingleNode("trigger/weeks");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			weeks = new Integer(Integer.parseInt(node.getStringValue()));

		node = maindoc.selectSingleNode("trigger/mon");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			mon = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/tue");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			tue = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/wed");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			wed = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/thu");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			thu = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/fri");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			fri = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/sat");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			sat = node.getStringValue().equalsIgnoreCase("true") ? true : false;
		node = maindoc.selectSingleNode("trigger/sun");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			sun = node.getStringValue().equalsIgnoreCase("true") ? true : false;

		node = maindoc.selectSingleNode("trigger/dayofmonth");
		if (node != null && node.getStringValue() != null && node.getStringValue().length() > 0)
			dayOfMonth = new Integer(Integer.parseInt(node.getStringValue()));
		node = maindoc.selectSingleNode("trigger/timeofmonth");
		if(node != null && node.getStringValue().length() > 0)
			timeOfMonth = new Time(node.getStringValue(), TimeFormat.FLAT4);
	}

	private Document getXmlDocument(String xmlBuffer) throws DocumentException
	{
		return DocumentHelper.parseText(xmlBuffer);
	}

	public String getHtmlTranslation()
	{
		return getTriggerTranslation(true);
	}

	public String getTextTranslation()
	{
		return getTriggerTranslation(false);
	}

	public String getTriggerTranslation(boolean bHtml)
	{
		if (frequency == null || frequency.length() == 0 || (days == null && weeks == null && weekly.equals(frequency)) || (startDateTime == null && !monthly.equals(frequency)))
			return null;

		String fontHeader = "";
		String fontFooter = "";

		if (bHtml)
		{
			fontHeader = "<FONT color=#0000FF>";
			fontFooter = "</FONT>";
		}

		StringBuffer sb = new StringBuffer(100);

		if (bHtml)
			sb.append("&nbsp;At ");
		else
			sb.append("At ");

		if (frequency.equals(daily))
		{
			sb.append(fontHeader);
			sb.append(startDateTime.getTime().toString());
			sb.append(fontFooter);

			sb.append(" every ");

			if(days != null)
				if (days.intValue() == 1)
					sb.append("day");
				else
				{
					sb.append(fontHeader);
					sb.append(days.toString());
					sb.append(fontFooter);
					sb.append(" days");
				}

			sb.append(", starting ");
			sb.append(fontHeader);
			sb.append(startDateTime.getDate().toString());
			sb.append(fontFooter);

			return sb.toString();
		}
		else if (frequency.equals(weekly))
		{
			sb.append(fontHeader);
			sb.append(startDateTime.getTime().toString());
			sb.append(fontFooter);

			sb.append(" every ");

			String comma = "";

			if (mon == false && tue == false && wed == false && thu == false && fri == false && sat == false && sun == false)
				return "";

			if (mon == true)
			{
				sb.append(fontHeader);
				sb.append("Mon");
				sb.append(fontFooter);
				comma = ",";
			}
			if (tue == true)
			{
				sb.append(comma);
				sb.append(fontHeader);
				sb.append("Tue");
				sb.append(fontFooter);
				comma = ",";
			}
			if (wed == true)
			{
				sb.append(comma);
				sb.append(fontHeader);
				sb.append("Wed");
				sb.append(fontFooter);
				comma = ",";
			}
			if (thu == true)
			{
				sb.append(comma);
				sb.append(fontHeader);
				sb.append("Thu");
				sb.append(fontFooter);
				comma = ",";
			}
			if (fri == true)
			{
				sb.append(comma);
				sb.append(fontHeader);
				sb.append("Fri");
				sb.append(fontFooter);
				comma = ",";
			}
			if (sat == true)
			{
				sb.append(comma);
				sb.append(fontHeader);
				sb.append("Sat");
				sb.append(fontFooter);
				comma = ",";
			}
			if (sun == true)
			{
				sb.append(comma);
				sb.append(fontHeader);
				sb.append("Sun");
				sb.append(fontFooter);
				comma = ",";
			}

			if (weeks.intValue() == 1)
				sb.append(" of every week");
			else
			{
				sb.append(" of every ");
				sb.append(fontHeader);
				sb.append(weeks.toString());
				sb.append(fontFooter);
				sb.append(" weeks");
			}

			sb.append(", starting ");
			sb.append(fontHeader);
			sb.append(startDateTime.getDate().toString());
			sb.append(fontFooter);

			return sb.toString();
		}
		else if (frequency.equals(monthly))
		{
			if(bHtml)
				sb.append("<FONT color=#0000FF>");

			if(timeOfMonth != null)
				sb.append(timeOfMonth.toString());

			if(bHtml)
				sb.append("</FONT>");

			sb.append(" on the ");

			if(bHtml)
				sb.append("<FONT color=#0000FF>");

			if(dayOfMonth != null)
			{
				sb.append(dayOfMonth.intValue());

				if(dayOfMonth.intValue() == 1 || dayOfMonth.intValue() == 21 || dayOfMonth.intValue() == 31)
					sb.append("st ");
				else if(dayOfMonth.intValue() == 2 || dayOfMonth.intValue() == 22)
					sb.append("nd ");
				else if(dayOfMonth.intValue() == 3 || dayOfMonth.intValue() == 23)
					sb.append("rd ");
				else
					sb.append("th ");
			}

			if(bHtml)
				sb.append("</FONT>");

			sb.append("day of every month");

			sb.append(", starting ");

			if(bHtml)
				sb.append("<FONT color=#0000FF>");

			if(startDateTime != null && startDateTime.getDate() != null)
				sb.append(startDateTime.getDate().toString());

			if(bHtml)
				sb.append("</FONT>");

			return sb.toString();
		}
		return null;
	}
}
