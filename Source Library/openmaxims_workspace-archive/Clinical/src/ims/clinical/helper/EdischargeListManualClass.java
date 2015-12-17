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
/*
 * Created on 20-Feb-2008
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.clinical.helper;

import java.util.Date;

public class EdischargeListManualClass
{
	private Integer CareContextId;
	private String patient_hospnum;
	private String patient_title;
	private String patient_surname;
	private String patient_forename;
	private String specialty;
	private String ResponsibleHcp_title;
	private String ResponsibleHcp_surname;
	private String ResponsibleHcp_forename;
	private String Ward;
	private Date DischargeDate;
	private String LetterStatus;

	public EdischargeListManualClass(Integer CareContextId,
								String patient_title,
								String patient_surname,
								String patient_forename,
								String specialty,
								String ResponsibleHcp_title,
								String ResponsibleHcp_surname,
								String ResponsibleHcp_forename,
								String patient_hospnum,
								String Ward,
								Date DischargeDate,
								String LetterStatus
								)
	{
		this.CareContextId = CareContextId;
		this.patient_title = patient_title;
		this.patient_surname = patient_surname;
		this.patient_forename = patient_forename;
		this.specialty = specialty;
		this.ResponsibleHcp_title = ResponsibleHcp_title;
		this.ResponsibleHcp_surname = ResponsibleHcp_surname;
		this.ResponsibleHcp_forename = ResponsibleHcp_forename;
		this.patient_hospnum = patient_hospnum;
		this.Ward = Ward;
		this.DischargeDate = DischargeDate;
		this.LetterStatus = LetterStatus;
	}

	public Integer getCareContextId()
	{
		return this.CareContextId;
	}
	public String getPatientName()
	{
		String temp;
		
		temp = this.patient_title != null ? this.patient_title + " ": "";
		temp += this.patient_forename != null ? this.patient_forename : "";
		temp += " ";
		temp += this.patient_surname != null ? this.patient_surname : "";
		return temp;
	}
	public String getPatientHospnum()
	{
		return this.patient_hospnum;
	}
	public String getResponsibleHcp()
	{
		String temp;
		temp = this.ResponsibleHcp_title != null ? this.ResponsibleHcp_title  + " " : "";
		temp += this.ResponsibleHcp_forename != null ? this.ResponsibleHcp_forename : "";
		temp += " ";
		temp += this.ResponsibleHcp_surname != null ? this.ResponsibleHcp_surname : "";
		return temp;
	}
	public String getWard()
	{
		return this.Ward;
	}
	public Date getDischargeDate()
	{
		return this.DischargeDate;
	}

	public String getLetterStatus()
	{
		return this.LetterStatus;
	}


}
