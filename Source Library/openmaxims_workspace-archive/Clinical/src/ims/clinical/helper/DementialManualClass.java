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
package ims.clinical.helper;

import java.util.Date;




public class DementialManualClass 
{	
	private Integer DementiaId;
	private String patient_title;
	private String patient_surname;
	private String patient_forename;
	private String patient_identifier;
	private Integer patient_dob;
	private String ward;
	private String consultant_title;
	private String consultant_surname;
	private String consultant_forename;
	private Integer statusID;
	private String statusText;
	private String reasonForExclusion;
	private Boolean isExcludedFromWorklist;
	private Date dischargeDateTime;
	private Date breachDateTime;
	private Boolean deliriumConfirmed;
	private Boolean dementiaConfirmed;

	public DementialManualClass(Integer DementiaId,
								String patient_title,
								String patient_surname,
								String patient_forename,
								String patient_identifier,
								Integer patient_dob,
								String ward,
								String consultant_title,
								String consultant_surname,
								String consultant_forename,
								Integer statusID,
								String statusText,
								String reasonForExclusion,
								Boolean isExcludedFromWorklist,
								Date dischargeDateTime,
								Date breachDateTime,
								Boolean deliriumConfirmed,
								Boolean dementiaConfirmed)
	{
		this.DementiaId = DementiaId;
		this.patient_title = patient_title;
		this.patient_surname = patient_surname;
		this.patient_forename = patient_forename;
		this.patient_identifier = patient_identifier;
		this.patient_dob = patient_dob;
		this.ward = ward;
		this.consultant_title = consultant_title;
		this.consultant_surname = consultant_surname;
		this.consultant_forename = consultant_forename;
		this.statusID = statusID;
		this.statusText = statusText;
		this.reasonForExclusion = reasonForExclusion;
		this.isExcludedFromWorklist = isExcludedFromWorklist;
		this.dischargeDateTime = dischargeDateTime;
		this.breachDateTime = breachDateTime;
		this.deliriumConfirmed = deliriumConfirmed;
		this.dementiaConfirmed = dementiaConfirmed;
	}

	public Integer getDementiaId()
	{
		return this.DementiaId;
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
	
	public String getPatientSurnameName()
	{
		return this.patient_surname;
	}
	
	public String getPatientForename()
	{
		return this.patient_forename;
	}
	
	public String getPatientIdentifier()
	{
		return this.patient_identifier;
	}

	public Integer getPatientDOB()
	{
		return this.patient_dob;
	}

	public String getWard()
	{
		return this.ward;
	}

	public String getConsultantSort()
	{
		String temp;
		
		temp = this.consultant_surname != null ? this.consultant_surname : "";
		temp += " ";
		temp += this.consultant_forename != null ? this.consultant_forename : "";
		return temp;
	}

	public String getConsultant()
	{
		String temp;
		
		temp = this.consultant_title != null ? this.consultant_title + " ": "";
		temp += this.consultant_forename != null ? this.consultant_forename : "";
		temp += " ";
		temp += this.consultant_surname != null ? this.consultant_surname : "";
		return temp;
	}

	public String getReasonForExclusion()
	{
		return this.reasonForExclusion;
	}

	public String getStatusText()
	{
		return this.statusText;
	}
	
	public Integer getStatusID()
	{
		return this.statusID;
	}
	
	public Boolean getisExcludedFromWorklist()
	{
		return this.isExcludedFromWorklist;
	}

	public ims.framework.utils.DateTime getDischargeDateTime()
	{
		return this.dischargeDateTime != null ? new ims.framework.utils.DateTime(this.dischargeDateTime) : null;
	}
	public ims.framework.utils.DateTime getBreechDateTime()                                                        
	{                                              
		return this.breachDateTime != null ? new ims.framework.utils.DateTime(this.breachDateTime) : null;		
	}
                                                                                                                                                                                               
	public Boolean getisDeliriumConfirmed()
	{
		return this.deliriumConfirmed;
	}

	public Boolean getisDementiaConfirmed()
	{
		return this.dementiaConfirmed;
	}

}
