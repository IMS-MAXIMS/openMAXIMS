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

public class PIDBarOncologyManualClass 
{
	private Integer diagnosisID;
	private String diagnosisDesc;
	private Date start_date;
	private Date end_date;
	private String hcpNameSurname;
	private String hcpNameForename;
	private String hcpNameTitle;

	public PIDBarOncologyManualClass(Integer diagnosisID,
								String diagnosisDesc,
								Date start_date,
								Date end_date,
								String hcpNameSurname,
								String hcpNameForename,
								String hcpNameTitle)
	{
		this.diagnosisID = diagnosisID;
		this.diagnosisDesc = diagnosisDesc;
		this.start_date = start_date;
		this.end_date = end_date;
		this.hcpNameSurname = hcpNameSurname;
		this.hcpNameForename = hcpNameForename;
		this.hcpNameTitle = hcpNameTitle;
	}

	public String getHcpName()
	{
		String temp;
			
		temp = this.hcpNameTitle != null ? this.hcpNameTitle + " ": "";
		temp += this.hcpNameForename != null ? this.hcpNameForename : "";
		temp += " ";
		temp += this.hcpNameSurname != null ? this.hcpNameSurname : "";
		return temp;
	}
	
	public String getDiagnosisDesc()
	{
		return this.diagnosisDesc;
	}

	public Date getStartdate()
	{
		return this.start_date;
	}
	public Date getEnddate()
	{
		return this.end_date;
	}
}
