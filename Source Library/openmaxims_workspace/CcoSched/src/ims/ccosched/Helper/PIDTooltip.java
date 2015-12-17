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
package ims.ccosched.Helper;

import ims.ccosched.vo.PatTreatPlanActionLiteDisplayVo;
import ims.ccosched.vo.PatTreatPlanActionVo;
import ims.ccosched.vo.PatTreatmentPlanLiteVo;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonName;
import ims.core.vo.lookups.ChannelType;
import ims.dto.client.Go_ptplact.Go_ptplactRecord;
import ims.dto.client.Go_ptreatpl.Go_ptreatplRecord;

public class PIDTooltip
{
	public String getTooltip(PatientShort patient, Go_ptreatplRecord treatmentPlan, Go_ptplactRecord action)
	{
		CCOTooltip tooltip = new CCOTooltip();
		if(patient != null)
		{
			StringBuilder name = new StringBuilder();
			PersonName personName = patient.getName();
			if(personName != null)
			{
				name.append(personName.getNameTypeIsNotNull() ? personName.getNameType().toString() : "");
				if (name.length() > 0)
					name.append(" ");

				name.append(personName.getSurname());
				if (name.length() > 0)
					name.append(" ");

				name.append(personName.getMiddleNameIsNotNull() ? personName.getMiddleName() : "");
				if (name.length() > 0)
					name.append(" ");
				name.append(personName.getForenameIsNotNull() ? personName.getForename() : "");
			}

			//Name
			tooltip.setName(name.toString());

			//PID
			tooltip.setHospNum(patient.getHospnum() != null?patient.getHospnum().getValue():"");

			//Address
			PersonAddress address = patient.getAddress();
			if(address != null)
			{
				tooltip.setAddress(address.toDisplayString());

				// Post Code
				tooltip.setPostCode(address.getPostCode());
			}

			//Country?? - no country in the vo
			//tooltip.setCountry(patient.getc);

			//DOB
			tooltip.setDob(patient.getDobIsNotNull() ?patient.getDob().toString():"");

			//Communication
			CommChannelVoCollection voColl = patient.getCommChannels();
			//WDEV-18158
			for (int i = 0; voColl != null && i < voColl.size(); i++)
			{
				ChannelType channelType = voColl.get(i).getChannelType();
				String value = voColl.get(i).getCommValue();
				if(channelType != null)
				{
					if(channelType.equals(ChannelType.GEN_PHONE))
						tooltip.setGeneralPhone(value);			

					if(channelType.equals(ChannelType.WORK_PHONE))
						tooltip.setWorkPhone(value);

					if(channelType.equals(ChannelType.HOME_PHONE))
						tooltip.setHomePhone(value);

					if(channelType.equals(ChannelType.MOBILE))
						tooltip.setNightPhone(value);
				}
			}


			if(action != null)
			{
				tooltip.setAction(action.Activitygrptxt + " / " + action.Action_idtxt);
				tooltip.setCategory(action.Txcattypetxt);
				tooltip.setTransport(action.Transreq_txt);
			}

			if(treatmentPlan != null)
			{
				tooltip.setConsultant(treatmentPlan.Chcptxt);
			}
		}

		return getCCOPatientInfoTooltip(tooltip);
	}

	public String getCCOPatientInfoTooltip(CCOTooltip tooltip)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");

		sb.append("<head>");
		sb.append("<meta http-equiv='Content-Type' content='text/html; charset=windows-1252'>");
		sb.append("<title>New Page 1</title>");
		sb.append("<style>");
		sb.append("<!--");
		sb.append("table.MsoTableColorful2");
		sb.append("	{border-left:medium none; border-right:medium none; border-top:medium none; border-bottom:1.5pt solid black; font-size:10.0pt;");
		sb.append("	font-family:'Times New Roman';");
		sb.append("	}");
		sb.append(" p.MsoNormal");
		sb.append("	{mso-style-parent:'';");
		sb.append("	margin-bottom:.0001pt;");
		sb.append("	font-size:9.0pt;");
		sb.append("	font-family:'Times New Roman';");
		sb.append("	font-weight:bold; margin-left:0cm; margin-right:0cm; margin-top:0cm}");
		sb.append("-->");
		sb.append("</style>");
		sb.append("</head>");

		sb.append("<body>");

		sb.append("<table class='MsoTableColorful2' border='1' cellspacing='0' cellpadding='0' width='619' style='width: 464.4pt; border-collapse: collapse; border: medium none' id='table1'>");
		sb.append("<tr>");
		sb.append("<td width='619' colspan='2' valign='top' style='width: 464.4pt; border-left: medium none; border-right: medium none; border-top: medium none; border-bottom: 1.5pt solid black; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: maroon'>");
		sb.append("<p class='MsoNormal'><i>");
		sb.append("<span lang='EN-IE' style='color: white; font-weight: normal'>&nbsp;</span></i></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><b><i><span lang='EN-IE'>General</span></i></b></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>&nbsp;</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Name.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getName());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Hospital Number.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getHospNum());
		sb.append("</span></td>");
		sb.append("	</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Address.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.address);
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Post Code.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getPostCode() + "</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Country.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.country + "</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Date Of Birth.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.dob + "</span></td>");
		sb.append("</tr>");
		sb.append("<tr style='height: 6.65pt'>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; height: 6.65pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>&nbsp;</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; height: 6.65pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>&nbsp;</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><b><i><span lang='EN-IE'>Communication</span></i></b></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>&nbsp;</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("General&nbsp; Phone.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getGeneralPhone());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Work Phone.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getWorkPhone());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Home Phone</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getHomePhone());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Night Phone</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getNightPhone());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>&nbsp;</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>&nbsp;</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><b><i><span lang='EN-IE'>Treatment Details</span></i></b></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>&nbsp;</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Consultant.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getConsultant() +"</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Action.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getAction());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Category.</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getCategory());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><i><span lang='EN-IE' style='font-weight: normal'>");
		sb.append("Transport</span></i></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border: medium none; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>" + tooltip.getTransport());
		sb.append("</span></td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td width='127' valign='top' style='width: 95.4pt; border-left: medium none; border-right: medium none; border-top: medium none; border-bottom: 1.5pt solid black; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: #FFFFEF'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE' style='font-weight: normal'>&nbsp;</span></td>");
		sb.append("<td width='492' valign='top' style='width: 369.0pt; border-left: medium none; border-right: medium none; border-top: medium none; border-bottom: 1.5pt solid black; padding-left: 5.4pt; padding-right: 5.4pt; padding-top: 0cm; padding-bottom: 0cm; background: silver'>");
		sb.append("<p class='MsoNormal'><span lang='EN-IE'>&nbsp;</span></td>");
		sb.append("</tr>");
		sb.append("</table>");

		sb.append("	</body>");

		sb.append("</html>");

		return sb.toString();
	}
	private class CCOTooltip
	{
		private String	name 			= "", hospNum		= "", address 	= "", postCode 	= "", dob = "";
		private String	country 		= "", generalPhone	= "", workPhone = "", HomePhone = "", NightPhone = "";
		private String	consultant		= "", action 		= "", category	= "", transport	= "";

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getAction()
		{
			return action;
		}
		public void setAction(String action)
		{
			this.action = action;
		}
		public String getAddress()
		{
			return address;
		}
		public void setAddress(String address)
		{
			this.address = address;
		}
		public String getCategory()
		{
			return category;
		}
		public void setCategory(String category)
		{
			this.category = category;
		}
		public String getConsultant()
		{
			return consultant;
		}
		public void setConsultant(String consultant)
		{
			this.consultant = consultant;
		}
		public String getCountry()
		{
			return country;
		}
		public void setCountry(String country)
		{
			this.country = country;
		}
		public String getDob()
		{
			return dob;
		}
		public void setDob(String dob)
		{
			this.dob = dob;
		}
		public String getGeneralPhone()
		{
			return generalPhone;
		}
		public void setGeneralPhone(String generalPhone)
		{
			this.generalPhone = generalPhone;
		}
		public String getHomePhone()
		{
			return HomePhone;
		}
		public void setHomePhone(String homePhone)
		{
			HomePhone = homePhone;
		}
		public String getHospNum()
		{
			return hospNum;
		}
		public void setHospNum(String hospNum)
		{
			this.hospNum = hospNum;
		}
		public String getNightPhone()
		{
			return NightPhone;
		}
		public void setNightPhone(String nightPhone)
		{
			NightPhone = nightPhone;
		}
		public String getPostCode()
		{
			return postCode != null?postCode:"";
		}
		public void setPostCode(String postCode)
		{
			this.postCode = postCode;
		}
		public String getTransport()
		{
			return transport;
		}
		public void setTransport(String transport)
		{
			this.transport = transport;
		}
		public String getWorkPhone()
		{
			return workPhone;
		}
		public void setWorkPhone(String workPhone)
		{
			this.workPhone = workPhone;
		}
	}
	public String getTooltip2(PatientShort patient, PatTreatmentPlanLiteVo treatmentPlan, PatTreatPlanActionVo action) 
	{
		CCOTooltip tooltip = new CCOTooltip();
		if(patient != null)
		{
			StringBuilder name = new StringBuilder();
			PersonName personName = patient.getName();
			if(personName != null)
			{
				name.append(personName.getNameTypeIsNotNull() ? personName.getNameType().toString() : "");
				if (name.length() > 0)
					name.append(" ");

				name.append(personName.getSurname());
				if (name.length() > 0)
					name.append(" ");

				name.append(personName.getMiddleNameIsNotNull() ? personName.getMiddleName() : "");
				if (name.length() > 0)
					name.append(" ");
				name.append(personName.getForenameIsNotNull() ? personName.getForename() : "");
			}

			//Name
			tooltip.setName(name.toString());

			//PID
			tooltip.setHospNum(patient.getHospnum() != null?patient.getHospnum().getValue():"");

			//Address
			PersonAddress address = patient.getAddress();
			if(address != null)
			{
				tooltip.setAddress(address.toDisplayString());

				// Post Code
				tooltip.setPostCode(address.getPostCode());
			}

			//Country?? - no country in the vo
			//tooltip.setCountry(patient.getc);

			//DOB
			tooltip.setDob(patient.getDobIsNotNull() ?patient.getDob().toString():"");

			//Communication
			CommChannelVoCollection voColl = patient.getCommChannels();
			for (int i = 0; i < voColl.size(); i++)
			{
				ChannelType channelType = voColl.get(i).getChannelType();
				String value = voColl.get(i).getCommValue();
				if(channelType != null)
				{
					if(channelType.equals(ChannelType.GEN_PHONE))
						tooltip.setGeneralPhone(value);			

					if(channelType.equals(ChannelType.WORK_PHONE))
						tooltip.setWorkPhone(value);

					if(channelType.equals(ChannelType.HOME_PHONE))
						tooltip.setHomePhone(value);

					if(channelType.equals(ChannelType.MOBILE))
						tooltip.setNightPhone(value);
				}
			}


			if(action != null)
			{
				String actionStr = action.getActionIsNotNull()?action.getAction().getActionIsNotNull()?action.getAction().getAction().getName():"":"";
				tooltip.setAction(action.getActivityGroupIsNotNull()?action.getActivityGroup().getActivityGroupName():"" + " / " + actionStr );
				tooltip.setCategory(action.getCategoryIsNotNull()?action.getCategory().getText():"");
				tooltip.setTransport(action.getTransportIsNotNull()?action.getTransport().getText():"");
			}

			if(treatmentPlan != null)
			{
				tooltip.setConsultant(treatmentPlan.getConsultantIsNotNull()?treatmentPlan.getConsultant().toString():"");
			}
		}

		return getCCOPatientInfoTooltip(tooltip);
	}
	//WDEV-16919 short VO used to display action data in the CCOSched tooltip for Clinic View
	public String getTooltipClinicView (PatientShort patient, PatTreatmentPlanLiteVo treatmentPlan, PatTreatPlanActionLiteDisplayVo action) 
	{
		CCOTooltip tooltip = new CCOTooltip();
		if(patient != null)
		{
			StringBuilder name = new StringBuilder();
			PersonName personName = patient.getName();
			if(personName != null)
			{
				name.append(personName.getNameTypeIsNotNull() ? personName.getNameType().toString() : "");
				if (name.length() > 0)
					name.append(" ");

				name.append(personName.getSurname());
				if (name.length() > 0)
					name.append(" ");

				name.append(personName.getMiddleNameIsNotNull() ? personName.getMiddleName() : "");
				if (name.length() > 0)
					name.append(" ");
				name.append(personName.getForenameIsNotNull() ? personName.getForename() : "");
			}

			//Name
			tooltip.setName(name.toString());

			//PID
			tooltip.setHospNum(patient.getHospnum() != null?patient.getHospnum().getValue():"");

			//Address
			PersonAddress address = patient.getAddress();
			if(address != null)
			{
				tooltip.setAddress(address.toDisplayString());

				// Post Code
				tooltip.setPostCode(address.getPostCode());
			}

			//DOB
			tooltip.setDob(patient.getDobIsNotNull() ?patient.getDob().toString():"");

			//Communication
			CommChannelVoCollection voColl = patient.getCommChannels();
			for (int i = 0; i < voColl.size(); i++)
			{
				ChannelType channelType = voColl.get(i).getChannelType();
				String value = voColl.get(i).getCommValue();
				if(channelType != null)
				{
					if(channelType.equals(ChannelType.GEN_PHONE))
						tooltip.setGeneralPhone(value);			

					if(channelType.equals(ChannelType.WORK_PHONE))
						tooltip.setWorkPhone(value);

					if(channelType.equals(ChannelType.HOME_PHONE))
						tooltip.setHomePhone(value);

					if(channelType.equals(ChannelType.MOBILE))
						tooltip.setNightPhone(value);
				}
			}

			// Tplan action info for records linked to a TP action
			if(action != null)
			{
				String actionStr = action.getActionIsNotNull() ? action.getAction().getActionIsNotNull() ? action.getAction().getAction().getName() : "" : "";
				tooltip.setAction(action.getActivityGroupIsNotNull() ? action.getActivityGroup().getActivityGroupName():"" + " / " + actionStr );
				tooltip.setCategory(action.getCategoryIsNotNull() ? action.getCategory().getText():"");
				tooltip.setTransport(action.getTransportIsNotNull() ? action.getTransport().getText():"");
			}
			//Tplan Consultant for records linked to a TP action
			if(treatmentPlan != null)
			{
				tooltip.setConsultant(treatmentPlan.getConsultantIsNotNull()? treatmentPlan.getConsultant().toString():"");
			}
		}

		return getCCOPatientInfoTooltip(tooltip);
	}	
}
