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
package ims.core.helper;

import ims.admin.vo.ReportSeedParsedVo;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;

import java.text.ParseException;

public class ReportSeedsHelper
{
	private static final String	INTEGER			= "java.lang.Integer";
	private static final String	BIG_INTEGER		= "java.math.BigInteger";
	private static final String	SHORT			= "java.lang.Short";
	private static final String	LONG			= "java.lang.Long";
	private static final String	BOOOLEAN		= "java.lang.Boolean";
	private static final String	STRING			= "java.lang.String";
	private static final String	BIG_DECIMAL		= "java.math.BigDecimal";
	private static final String	FLOAT			= "java.lang.Float";
	private static final String	DOUBLE			= "java.lang.Double";
	private static final String	UTIL_DATE		= "java.util.Date";
	private static final String	SQL_DATE		= "java.sql.Date";
	private static final String	SQL_TIME		= "java.sql.Time";

	public static final String	HCP_BO			= "ims.core.resource.people.domain.objects.Hcp";
	private static final String	HCP_FIELD		= "Hcp_id";
	private static final String	HCP_LABEL		= "Select a Clinician";

	public static final String	GP_BO			= "ims.core.resource.people.domain.objects.Gp";
	private static final String	GP_FIELD		= "Gp_id";
	private static final String	GP_LABEL		= "Select a GP";

	public static final String	MEDIC_BO		= "ims.core.resource.people.domain.objects.Medic";
	private static final String	MEDIC_FIELD		= "Medic_id";
	private static final String	MEDIC_LABEL		= "Select a Medic";

	public static final String	MOS_BO			= "ims.core.resource.people.domain.objects.MemberOfStaff";
	private static final String	MOS_FIELD		= "MemberOfStaff_id";
	private static final String	MOS_LABEL		= "Select a Member of Staff";

	public static final String	ORG_BO			= "ims.core.resource.place.domain.objects.Organisation";
	private static final String	ORG_FIELD		= "Organisation_id";
	private static final String	ORG_LABEL		= "Select an Organisation";

	public static final String	LOCATION_BO		= "ims.core.resource.place.domain.objects.Location";
	private static final String	LOCATION_FIELD	= "Location_id";
	private static final String	LOCATION_LABEL	= "Select a Location";

	public static final String	LOC_SITE_BO		= "ims.core.resource.place.domain.objects.LocSite";
	private static final String	LOC_SITE_FIELD	= "LocSite_id";
	private static final String	LOC_SITE_LABEL	= "Select a Hospital";

	public static final String	LOOKUPINSTANCE_BO		= "ims.domain.lookups.LookupInstance";
	private static final String	LOOKUPINSTANCE_FIELD	= "LookupInstance_id";
	private static final String	LOOKUPINSTANCE_LABEL	= "Select";
	
	
	
	ims.framework.UIEngine		engine;

	public ReportSeedsHelper(ims.framework.UIEngine engine)
	{
		this.engine = engine;
	}

	public Object getReportValue(ReportSeedParsedVo voSeed)
	{
		return getValue(voSeed, true);
	}

	public Object getValue(ReportSeedParsedVo voSeed)
	{
		return getValue(voSeed, false);
	}

	public Object getValue(ReportSeedParsedVo voSeed, boolean reportValue)
	{
		if (voSeed == null || voSeed.getValue() == null)
			return null;

		String value = voSeed.getValue();
		String dataType = voSeed.getType();

		if (dataType == null || dataType.equals(""))
			return "";

		if (dataType.equals(INTEGER) || dataType.equals(BIG_INTEGER) || dataType.equals(SHORT) || dataType.equals(LONG))
		{
			try
			{
				if (dataType.equals(INTEGER))
				{
					if (reportValue == false)
					{
						if (voSeed.getHCPIsNotNull())
							return voSeed.getHCP();

						if (voSeed.getGPIsNotNull())
							return voSeed.getGP();

						if (voSeed.getMOSIsNotNull())
							return voSeed.getMOS();

						if (voSeed.getOrganisationIsNotNull())
							return voSeed.getOrganisation();

						if (voSeed.getLocationIsNotNull())
							return voSeed.getLocation();

						if (voSeed.getLocSiteIsNotNull())
							return voSeed.getLocSite();
						
						if (voSeed.getSexIsNotNull())
							return voSeed.getSex();
						
						if (voSeed.getOutcomeIsNotNull())
							return voSeed.getOutcome();
					}

					return new Integer(Integer.parseInt(value));
				}
			}
			catch (NumberFormatException exc)
			{
				engine.showErrors(new String[]{exc.getMessage()});
			}
		}

		if (dataType.equals(BOOOLEAN))
		{
			return Boolean.valueOf(value);
		}

		if (dataType.equals(STRING))
		{
			return value;
		}

		if (dataType.equals(BIG_DECIMAL) || dataType.equals(FLOAT) || dataType.equals(DOUBLE))
		{
			return Float.valueOf(value);
		}

		if (dataType.equals(SQL_DATE))
		{
			try
			{
				if (reportValue)
					return new java.sql.Date((new Date(value).getDate()).getTime());

				return new Date(value);
			}
			catch (ParseException e)
			{
				engine.showMessage(e.getMessage());
			}
		}

		if (dataType.equals(UTIL_DATE))
		{
			try
			{
				if (reportValue)
					return new DateTime(value).getJavaDate();

				return new DateTime(value);
			}
			catch (ParseException e)
			{
				engine.showMessage(e.getMessage());
			}
		}
		
		if (dataType.equals(SQL_TIME))
		{
			return new Time(value);
		}

		return "";
	}

	public DynamicCellType getCellType(ReportSeedParsedVo voReportSeed)
	{
		if (voReportSeed == null)
			return DynamicCellType.LABEL;

		String dataType = voReportSeed.getType();
		if (dataType == null)
			return DynamicCellType.LABEL;

		if (dataType.equals(INTEGER) || dataType.equals(BIG_INTEGER) || dataType.equals(SHORT) || dataType.equals(LONG))
		{
			DynamicCellType defaultType = DynamicCellType.INT;

			if (dataType.equals(INTEGER))
				defaultType = getBoReportType(voReportSeed);

			return defaultType;
		}

		if (dataType.equals(BOOOLEAN))
			return DynamicCellType.BOOL;

		if (dataType.equals(STRING))
			return DynamicCellType.STRING;

		if (dataType.equals(BIG_DECIMAL) || dataType.equals(FLOAT) || dataType.equals(DOUBLE))
			return DynamicCellType.DECIMAL;

		if (dataType.equals(SQL_DATE))
			return DynamicCellType.DATE;

		if (dataType.equals(UTIL_DATE))
			return DynamicCellType.DATETIME;
		
		if (dataType.equals(SQL_TIME))
			return DynamicCellType.TIME;

		return DynamicCellType.LABEL;
	}

	private DynamicCellType getBoReportType(ReportSeedParsedVo voReportSeed)
	{
		String boName = voReportSeed.getBOName();
		String boField = voReportSeed.getBOField();

		if (boName != null && boField != null)
		{
			if (boName.equals(HCP_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;

			if (boName.equals(GP_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;

			if (boName.equals(MEDIC_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;

			if (boName.equals(MOS_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;

			if (boName.equals(ORG_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;

			if (boName.equals(LOCATION_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;

			if (boName.equals(LOC_SITE_BO) && boField.equals("id"))
				return DynamicCellType.QUERYCOMBOBOX;
			
			if (boName.equals(LOOKUPINSTANCE_BO) && boField.equals("id"))
				return DynamicCellType.ENUMERATION;
					
		}

		return DynamicCellType.INT;
	}

	public String getIdentifier(ReportSeedParsedVo voReportSeed)
	{
		String dataType = voReportSeed.getType();
		if (dataType == null)
			return null;

		if (dataType.equals(INTEGER))
		{
			String boName = voReportSeed.getBOName();
			String boField = voReportSeed.getBOField();

			if (boName != null && boField != null)
			{
				if (boName.equals(HCP_BO) && boField.equals("id"))
					return HCP_BO;

				if (boName.equals(GP_BO) && boField.equals("id"))
					return GP_BO;

				if (boName.equals(MEDIC_BO) && boField.equals("id"))
					return MEDIC_BO;

				if (boName.equals(MOS_BO) && boField.equals("id"))
					return MOS_BO;

				if (boName.equals(ORG_BO) && boField.equals("id"))
					return ORG_BO;

				if (boName.equals(LOCATION_BO) && boField.equals("id"))
					return LOCATION_BO;

				if (boName.equals(LOC_SITE_BO) && boField.equals("id"))
					return LOC_SITE_BO;
				
				if (boName.equals(LOOKUPINSTANCE_BO) && boField.equals("id"))
					return LOOKUPINSTANCE_BO;
							
			}
		}

		return null;
	}

	public String getCellName(ReportSeedParsedVo voSeed)
	{
		/*
		String identifier = getIdentifier(voSeed);
		StringBuilder sb = new StringBuilder();
		
		if (identifier != null)
		{
			if (identifier == HCP_BO)
			{
				sb.append(" (");
				sb.append(HCP_LABEL);
				sb.append(')');
			}
			else if (identifier == GP_BO)
			{
				sb.append(" (");
				sb.append(GP_LABEL);
				sb.append(')');
			}
			else if (identifier == MEDIC_BO)
			{
				sb.append(" (");
				sb.append(MEDIC_LABEL);
				sb.append(')');
			}
			else if (identifier == MOS_BO)
			{
				sb.append(" (");
				sb.append(MOS_LABEL);
				sb.append(')');
			}
			else if (identifier == ORG_BO)
			{
				sb.append(" (");
				sb.append(ORG_LABEL);
				sb.append(')');
			}
			else if (identifier == LOC_SITE_BO)
			{
				sb.append(" (");
				sb.append(LOC_SITE_LABEL);
				sb.append(')');
			}
			else if (identifier == LOCATION_BO)
			{
				sb.append(" (");
				sb.append(LOCATION_LABEL);
				sb.append(')');
			}
			else if (identifier == LOC_SITE_BO)
			{
				sb.append(" (");
				sb.append(LOC_SITE_LABEL);
				sb.append(')');
			}
		}
		*/
		
		return voSeed.getName();// + sb.toString();
	}
}
