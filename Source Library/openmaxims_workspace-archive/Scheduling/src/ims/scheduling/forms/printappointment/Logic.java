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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.62 build 3110.16630)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.scheduling.forms.printappointment;

import java.util.ArrayList;
import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;
import ims.admin.vo.ReportListVo;
import ims.admin.vo.ReportListVoCollection;
import ims.admin.vo.ReportTemplateLiteVo;
import ims.admin.vo.ReportTemplateLiteVoCollection;
import ims.admin.vo.ReportsCategoryListVo;
import ims.admin.vo.ReportsCategoryListVoCollection;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.PatientShort;
import ims.domain.exceptions.DomainInterfaceException;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.controls.DynamicGridRowCollection;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.utils.Color;

public class Logic extends BaseLogic
{
	private static final long	serialVersionUID	= 1L;
	private static final String	COLUMN_NAME			= "0";

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{		
		ReportTemplateLiteVoCollection templates = domain.getTemplates(form.getGlobalContext().Scheduling.getAppointmentIds());		
		createDynamicGridColumns();
		populateReportsGrid(templates);
	}
	@Override
	protected void onBtnOKClick() throws ims.framework.exceptions.PresentationLogicException
	{
		Object value = form.dyngrdReports().getValue();
		
		if(value == null || !(value instanceof ReportTemplateLiteVo))
		{
			engine.showMessage("Please select a template !");
			return;
		}		
		
		printReport((ReportTemplateLiteVo)value);
		
		engine.close(DialogResult.OK);
	}
	
	private void printReport(ReportTemplateLiteVo voTemplate)
	{
		ArrayList ids = form.getGlobalContext().Scheduling.getAppointmentIds();

		String urlQueryServer = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		String urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();

		String[] obj = null;
		try
		{
			obj = domain.getReportAndTemplate(voTemplate.getReport().getBoId(), voTemplate.getID_TemplateBo());
		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage("Error retrieving report template !\r\n" + e.getMessage());
			return;
		}

		if (obj == null || obj.length == 0)
		{
			engine.showMessage("I could not get the report and template !");
			return;
		}

		QueryBuilderClient client = new QueryBuilderClient(urlQueryServer, engine.getSessionId());

		for(int i=0;i<ids.size();i++)
		{
			client.addSeed(new SeedValue("APPT_ID", ids.get(i), Integer.class));
			client.addSeed(new SeedValue("Booking_Appointment_id", ids.get(i), Integer.class));
		}
		
		PatientShort ps = form.getGlobalContext().Core.getPatientShort();
		if (ps != null)
		{
			client.addSeed(new SeedValue("PID", ps.getID_Patient(), Integer.class));
		}
		
		String resultUrl = "";
		try
		{
			resultUrl = client.buildReportAsUrl(obj[0], obj[1], urlReportServer, QueryBuilderClient.PDF, "", 1);
		}
		catch (QueryBuilderClientException e1)
		{
			engine.showMessage("Error creating report: " + e1.getMessage());
			return;
		}

		engine.openUrl(resultUrl);
	}
	
	private void populateReportsGrid(ReportTemplateLiteVoCollection templates)
	{
		if (templates == null ||
				(templates != null &&
						templates.size() == 0))
			return;
		
		ReportListVoCollection coll = new ReportListVoCollection();
		for (int i = 0; i < templates.size(); i++)
		{
			ReportTemplateLiteVo rep = templates.get(i);
			if (rep != null &&
				rep.getReportIsNotNull())
			{
					coll.add(domain.getReport(rep.getReport()));
			}			
		}
		
		populateReports(coll);
	}

	private void addCategory(DynamicGridRow rowParent, ReportsCategoryListVo voCategory)
	{
		if (voCategory == null)
			return;

		DynamicGridRow categoryRow = null;
		if (rowParent == null)
			categoryRow = form.dyngrdReports().getRows().newRow();
		else
			categoryRow = rowParent.getRows().newRow();

		categoryRow.setValue(voCategory);
		categoryRow.setSelectable(false);
		categoryRow.setCollapsedImage(form.getImages().Core.ReportCategory);
		categoryRow.setExpandedImage(form.getImages().Core.ReportCategory);

		DynamicGridCell cellName = createCell(categoryRow, getColumn(COLUMN_NAME));
		cellName.setValue(voCategory.getName());

		if (voCategory.getSubCategoriesIsNotNull() && voCategory.getSubCategories().size() > 0)
		{
			categoryRow.setExpanded(true);
			addSubcategories(categoryRow, voCategory.getSubCategories());
		}
	}

	private void addSubcategories(DynamicGridRow rowParent, ReportsCategoryListVoCollection voReportsCategoryColl)
	{
		for (int i = 0; i < voReportsCategoryColl.size(); i++)
		{
			addCategory(rowParent, voReportsCategoryColl.get(i));
		}
	}

	private void populateReports(ReportListVoCollection coll)
	{
		if (coll == null)
			return;

		for (int i = 0; i < coll.size(); i++)
		{
			ReportListVo voReportList = coll.get(i);
			DynamicGridRow row = getReportRow(form.dyngrdReports().getRows(), voReportList);
			addReport(row, voReportList);
		}
	}
	
	private void createDynamicGridColumns()
	{
		DynamicGridColumn columnName = form.dyngrdReports().getColumns().newColumn("Name", COLUMN_NAME);
		columnName.setWidth(-1);
	}
	
	private DynamicGridColumn getColumn(String identifier)
	{
		return form.dyngrdReports().getColumns().getByIdentifier(identifier);
	}
	
	private DynamicGridRow getReportRow(DynamicGridRowCollection parentRows, ReportListVo voReportList)
	{
		if (parentRows == null)
			return null;

		for (int i = 0; i < parentRows.size(); i++)
		{
			DynamicGridRow dynamicGridRow = parentRows.get(i);
			Object value = dynamicGridRow.getValue();
			if (value instanceof ReportsCategoryListVo)
			{
				ReportsCategoryListVo voReportsCategory = (ReportsCategoryListVo) value;
				if (voReportsCategory.getReports().indexOf(voReportList) >= 0)
				{
					return dynamicGridRow;
				}
			}

			if (dynamicGridRow.getRows() != null && dynamicGridRow.getRows().size() > 0)
			{
				DynamicGridRow row = getReportRow(dynamicGridRow.getRows(), voReportList);
				if (row != null)
					return row;
			}
		}

		return null;
	}
	
	private void addReport(DynamicGridRow rowParent, ReportListVo voReportList)
	{
		DynamicGridRow reportRow = null;
		
		if(voReportList.getTemplatesIsNotNull() && voReportList.getTemplates().size() == 0)
			return;
		
		if (rowParent == null)
			reportRow = form.dyngrdReports().getRows().newRow();
		else
			reportRow = rowParent.getRows().newRow();

		reportRow.setValue(voReportList);
		reportRow.setSelectable(false);
		reportRow.setCollapsedImage(form.getImages().Core.ReportDesigner);
		reportRow.setExpandedImage(form.getImages().Core.ReportDesigner);

		DynamicGridCell cellName = createCell(reportRow, getColumn(COLUMN_NAME));
		cellName.setValue(voReportList.getReportName());

		if(voReportList.getImsIdIsNotNull() && voReportList.getImsId().intValue() > 0)
		{
			reportRow.setTextColor(Color.Blue);
		}
		
		addTemplates(voReportList, reportRow);
	}

	private void addTemplates(ReportListVo voReportList, DynamicGridRow reportRow)
	{
		for (int i = 0; voReportList.getTemplatesIsNotNull() && i < voReportList.getTemplates().size(); i++)
		{
			ReportTemplateLiteVo reportTemplateLiteVo = voReportList.getTemplates().get(i);

			DynamicGridRow templateRow = reportRow.getRows().newRow();
			templateRow.setValue(reportTemplateLiteVo);
			templateRow.setCollapsedImage(form.getImages().Core.TemplateReport);
			templateRow.setExpandedImage(form.getImages().Core.TemplateReport);

			DynamicGridCell cellTemplateName = createCell(templateRow, getColumn(COLUMN_NAME));
			cellTemplateName.setValue(reportTemplateLiteVo.getName());
			
			if(voReportList.getImsIdIsNotNull() && voReportList.getImsId().intValue() > 0)
			{
				templateRow.setTextColor(Color.Blue);
			}
			
		}
	}
	
	private DynamicGridCell createCell(DynamicGridRow row, DynamicGridColumn column)
	{
		DynamicGridCell cell = row.getCells().get(column);
		if (cell == null)
		{
			cell = row.getCells().newCell(column, DynamicCellType.STRING);
			cell.setReadOnly(true);
		}

		return cell;
	}
}
