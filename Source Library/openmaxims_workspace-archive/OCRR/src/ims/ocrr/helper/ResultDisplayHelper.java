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
package ims.ocrr.helper;

import ims.configuration.EnvironmentConfig;
import ims.configuration.gen.ConfigFlag;
import ims.core.helper.ConversionHelper;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.ImageType;
import ims.framework.exceptions.ConfigurationException;
import ims.framework.utils.Base64;
import ims.framework.utils.Color;
import ims.ocrr.configuration.vo.AnalyteRefVo;
import ims.ocrr.configuration.vo.AnalyteRefVoCollection;
import ims.ocrr.vo.PathologyResultComponentVo;
import ims.ocrr.vo.PathologyResultDetailVo;
import ims.ocrr.vo.ResultComponentCommentsVoCollection;
import ims.ocrr.vo.lookups.InvEventType;
import ims.ocrr.vo.lookups.InvestigationOrderability;
import ims.ocrr.vo.lookups.ResultEDSubtype;
import ims.ocrr.vo.lookups.ResultValueType;
import ims.vo.interfaces.IOrderResultDisplay;
import ims.vo.interfaces.IOrderSpecimen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.UUID;

import org.apache.commons.io.IOUtils;

public class ResultDisplayHelper
{
	public static final Integer COL_NAME = new Integer(1);
	public static final Integer COL_TEST = new Integer(2);
	public static final Integer COL_VALUE = new Integer(3);
	public static final Integer COL_UNITS = new Integer(4);
	public static final Integer COL_REF_RANGE = new Integer(5);
	public static final Integer COL_COMMENTS = new Integer(6);
	public static final Integer COL_PICK = new Integer(7);	
	public static final Integer COL_PREVIEW = new Integer(8);// 	WDEV-15894
	public static final Integer COL_CHECKED_EXIT = new Integer(9);// 	WDEV-15894
	public static final Integer COL_NEXT = new Integer(10);	// 	WDEV-15894

	public static final Integer PICK_VIEWED = new Integer(0);
	public static final Integer PICK_QRY = new Integer(1);
	public static final Integer PICK_SEEN = new Integer(2);
	public static final Integer PICK_CHKD = new Integer(3);
	public static final Integer BUTTON_CHKD = new Integer(4);// 	WDEV-15894
	public static final Integer BUTTON_PREVIEW = new Integer(5);// 	WDEV-15894
	public static final Integer BUTTON_NEXT = new Integer(6);// 	WDEV-15894
	
	public static final String BOOKED_IN = "Booked In";// 	WDEV-15894
	public static final String RESULTED = "Resulted";// 
	
	ims.framework.controls.DynamicGrid grid;
	IOrderResultDisplay pathOrdInv; 
	IOrderResultDisplay radOrderInv;
	AnalyteRefVoCollection localContextAnalytes;	
	ArrayList<String> temporaryFiles;	
	ims.framework.UIEngine engine;
	Boolean extendedDataResult;
	LinkedHashMap<ResultEDSubtype, Object> dataStore;
	
	public ResultDisplayHelper(IOrderResultDisplay ordInv, ims.framework.controls.DynamicGrid grdResults, ims.framework.UIEngine uiEngine)
	{
		grid = grdResults;
		pathOrdInv = ordInv;
		engine = uiEngine;		
	}
	
	public ResultDisplayHelper(IOrderResultDisplay radRes, ims.framework.controls.DynamicGrid grdResults, Boolean extendedDataResult, ims.framework.UIEngine uiEngine)
	{
		grid = grdResults;
		radOrderInv = radRes;
		engine = uiEngine;		
	}
	
	public void formatRadResultsGrid(boolean showingHistory)
	{
		grid.clear();
		
		grid.setSelectable(false);
		grid.setReadOnly(false);
		
		DynamicGridColumn column = grid.getColumns().newColumn("Investigation");
		column.setIdentifier(COL_NAME);
		column.setWidth(100);
		column.setDynamicWidthSupported(true);
		
		column = grid.getColumns().newColumn("Report");
		column.setIdentifier(COL_VALUE);
		column.setWidth(500);
		column.setDynamicWidthSupported(true);

		if(!showingHistory)
		{
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_PICK);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);		
		
			// 	WDEV-15894 - starts here
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_PREVIEW);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
			
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_CHECKED_EXIT);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
			
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_NEXT);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
			// 	WDEV-15894 - ends here
		}
	}
	
	public void formatPathResultsGrid(boolean showingHistory) 
	{
		grid.clear();
		
		grid.setSelectable(false);
		grid.setReadOnly(false);
		
		DynamicGridColumn column = grid.getColumns().newColumn("Investigation");
		column.setIdentifier(COL_NAME);
		column.setWidth(100);
		column.setDynamicWidthSupported(true);

		column = grid.getColumns().newColumn("Analyte");
		column.setIdentifier(COL_TEST);
		column.setWidth(100);
		column.setDynamicWidthSupported(true);
		
		column = grid.getColumns().newColumn("Value");
		column.setIdentifier(COL_VALUE);
		column.setWidth(140);
		column.setDynamicWidthSupported(true);
		
		column = grid.getColumns().newColumn("Units");
		column.setIdentifier(COL_UNITS);
		column.setWidth(60);
		column.setDynamicWidthSupported(true);
		
		column = grid.getColumns().newColumn("Ref. Range");
		column.setIdentifier(COL_REF_RANGE);
		column.setWidth(80);
		column.setDynamicWidthSupported(true);
		
		column = grid.getColumns().newColumn("Comments");
		column.setIdentifier(COL_COMMENTS);
		column.setWidth(showingHistory ? -1 : 300);
		column.setDynamicWidthSupported(true);

		if(!showingHistory)
		{
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_PICK);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
	
			grid.setFooterValue("Please scroll to end of result and select one of the options available."); //WDEV-16907
			
			// 	WDEV-15894 - starts here
		
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_PREVIEW);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
			
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_CHECKED_EXIT);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
			
			column = grid.getColumns().newColumn("");
			column.setIdentifier(COL_NEXT);
			column.setWidth(0);
			column.setDynamicWidthSupported(true);
			// 	WDEV-15894 - ends here
		}
	}

	public boolean addPathResult(boolean showingHistory, String displayTextMappingForResultStatus)// 	WDEV-15783
	{
		if(isDFT())
		{
			return addPathResultForDFTInvestigations(showingHistory);
		}
		
		return addPathResultForSimpleInvestigations(showingHistory,	displayTextMappingForResultStatus);
	}

	private boolean isDFT() 
	{
		if(pathOrdInv != null && InvEventType.TIME_SERIES.equals(pathOrdInv.getIInvestigationEventType()))
			return true;
		
		return false;
	}

	private boolean addPathResultForSimpleInvestigations(boolean showingHistory, String displayTextMappingForResultStatus) 
	{
		if(grid.getColumns().size() == 0)
			formatPathResultsGrid(showingHistory);
		
		if(pathOrdInv == null)
			return false;
		
		DynamicGridColumn nameColumn = grid.getColumns().getByIdentifier(COL_NAME);
		if(nameColumn == null)
			return false;
		
		DynamicGridRow row = grid.getRows().newRow();
		boolean bNonResultable = false;
		if(pathOrdInv.getIOrderResultDisplayOrderAbility() != null)
			bNonResultable = pathOrdInv.getIOrderResultDisplayOrderAbility().equals(InvestigationOrderability.ORDERONLY);
		
		row.setBackColor(bNonResultable ? Color.LightGray : Color.Beige);
		row.setBold(true);
		
		if(!showingHistory)
		{
			DynamicGridCell cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_PICK), DynamicCellType.STRING);
			cell.setWidth(0);
		}

		DynamicGridCell cell = row.getCells().newCell(nameColumn, DynamicCellType.STRING);
		
		String name = getInvestigationDisplayString(showingHistory, displayTextMappingForResultStatus); // 	WDEV-15783
		
		cell.setValue(name);
		cell.setWidth(800); // wdev-2367 Was 400 - now full width
		
		cell.setReadOnly(true);
		
		cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_COMMENTS), DynamicCellType.STRING);
		cell.setWidth(0);
		
		if(pathOrdInv.getIOrderResultDisplayPathResultDetails() != null && pathOrdInv.getIOrderResultDisplayPathResultDetails().getResultComponentsIsNotNull())
		{
			// WDEV-3953
			/*if (pathOrdInv.getIOrderResultDisplayConfidentialTest() != null && pathOrdInv.getIOrderResultDisplayConfidentialTest().booleanValue())
			{
				if (!engine.hasRight(AppRight.CAN_VIEW_CONFIDENTIAL_INVESTIGATION_RESULTS))
				{
					//returning true as code has got this far so something (orderinvestigation but not result) has been added
					return true; 
				}
			}*/
			
			for(int x = 0; x < pathOrdInv.getIOrderResultDisplayPathResultDetails().getResultComponents().size(); x++)
			{
				addInvestigationResultComponent(row, pathOrdInv, pathOrdInv.getIOrderResultDisplayPathResultDetails().getResultComponents().get(x), showingHistory);
			}			
			//WDEV-11688
			addCommentsToResult(row,pathOrdInv.getIOrderResultDisplayPathResultDetails().getResultComments());
			addExtendedDataResult(row, pathOrdInv);
			return true;
		}
		else if(showingHistory)	//This investigation has not been resulted yet
		{
			addNoResultRow(row, bNonResultable);
		}
		
		return false;
	}
	
	//WDEV-16232
	private boolean addPathResultForDFTInvestigations(boolean showingHistory) 
	{
		if(grid.getColumns().size() == 0)
			formatPathResultsGrid(showingHistory);
		
		if(pathOrdInv == null || pathOrdInv.getIOrderSpecimens() == null)
			return false;
		
		DynamicGridColumn nameColumn = grid.getColumns().getByIdentifier(COL_NAME);
		if(nameColumn == null)
			return false;
		
		
		for(int i=0; i<pathOrdInv.getIOrderSpecimens().length; i++)
		{
			IOrderSpecimen specimen = pathOrdInv.getIOrderSpecimens()[i];
			
			DynamicGridRow row = grid.getRows().newRow();
			boolean bNonResultable = false;
			if(pathOrdInv.getIOrderResultDisplayOrderAbility() != null)
				bNonResultable = pathOrdInv.getIOrderResultDisplayOrderAbility().equals(InvestigationOrderability.ORDERONLY);
			
			row.setBackColor(bNonResultable ? Color.LightGray : Color.Beige);
			row.setBold(true);
			
			PathologyResultDetailVo resultDetails = pathOrdInv.getIOrderResultDisplayPathResultDetailsForDFT(specimen);
			
			if(!showingHistory)
			{
				DynamicGridCell cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_PICK), DynamicCellType.STRING);
				cell.setWidth(0);
			}
	
			DynamicGridCell cell = row.getCells().newCell(nameColumn, DynamicCellType.STRING);
			
			String name = getInvestigationDisplayStringForDFT(showingHistory, specimen, resultDetails); 
			
			cell.setValue(name);
			cell.setWidth(800); 
			
			cell.setReadOnly(true);
			
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_COMMENTS), DynamicCellType.STRING);
			cell.setWidth(0);
			
			if(resultDetails != null && resultDetails.getResultComponentsIsNotNull())
			{
				for(int x = 0; x < resultDetails.getResultComponents().size(); x++)
				{
					addInvestigationResultComponent(row, pathOrdInv, resultDetails.getResultComponents().get(x), showingHistory);
				}			
				
				addCommentsToResult(row, resultDetails.getResultComments());
				addExtendedDataResult(row, pathOrdInv);
				
				if(i == pathOrdInv.getIOrderSpecimens().length -1)
					return true;
			}
			else if(showingHistory)	
			{
				addNoResultRow(row, bNonResultable);
			}
		}
		
		return false;
	}

	private String getInvestigationDisplayStringForDFT(boolean showingHistory, IOrderSpecimen specimen, PathologyResultDetailVo resultDetails) 
	{
		StringBuilder name = new StringBuilder();

		// Investigation Name
		name.append(pathOrdInv.getIOrderResultDisplayInvName());
		
		name.append(" - Specimen: ").append(specimen.getIOrderSpecimenSource());
		
		if(specimen.getIOrderSpecimenCollectionDateTime() != null)
		{
			if(Boolean.TRUE.equals(specimen.getIOrderSpecimenCollectionTimeSupplied()))
			{
				name.append(" - Coll. Date: ").append(specimen.getIOrderSpecimenCollectionDateTime().toString());
			}
			else
			{
				name.append(" - Coll. Date: ").append(specimen.getIOrderSpecimenCollectionDateTime().toString(false));
			}
		}
		
		if(specimen.getIOrderSpecimenReceivedDateTime() != null)
		{
			if(Boolean.TRUE.equals(specimen.getIOrderSpecimenReceivedTimeSupplied()))
			{
				name.append(" - Rec. Date: ").append(specimen.getIOrderSpecimenReceivedDateTime().toString());
			}
			else
			{
				name.append(" - Rec. Date: ").append(specimen.getIOrderSpecimenReceivedDateTime().toString(false));
			}
		}
		
		name.append(" - Lab No: ").append(specimen.getIOrderSpecimenFillerOrdNum());
		
		name.append("<br>");
		
		if(pathOrdInv.getIOrderResultLabSpecimenType() != null)
		{
			name.append("Result Specimen Type: " + pathOrdInv.getIOrderResultLabSpecimenType());
		}
		
		if (specimen.getIOrderSpecimenResultedDate() != null)
		{
			if (Boolean.TRUE.equals(specimen.getIOrderSpecimenResultedTimeSupplied()))
			{
				name.append(" - Result Date: " + specimen.getIOrderSpecimenResultedDate().toString());
			}
			else
			{
				name.append(" - Result Date: " + specimen.getIOrderSpecimenResultedDate().toString(false));
			}
		}
		
		if(pathOrdInv.getIOrderResultDisplayStatus() != null)
		{
			name.append(" - Result Status : " + ((resultDetails != null && resultDetails.getID_PathResultDetails() != null) ? RESULTED : BOOKED_IN));
		}
		
		return name.toString();
	}

	private String getInvestigationDisplayString(boolean showingHistory, String displayTextMappingForResultStatus)// 	WDEV-15783
	{
		StringBuilder name = new StringBuilder();

		// Investigation Name
		name.append(pathOrdInv.getIOrderResultDisplayInvName());

		if (Boolean.TRUE.equals(ConfigFlag.UI.DISPLAY_SPECIMEN_TYPE_AT_INVESTIGATION_LEVEL.getValue()))
		{	
			// Specimen
			name.append(" - Specimen: ").append(pathOrdInv.getIOrderResultSpecimen());
		}
		
		if (pathOrdInv.getIOrderResultLabSpecimenType() != null && pathOrdInv.getIOrderResultLabSpecimenType().length() > 0)// 	WDEV-15714
		{
			name.append(" - Lab Specimen: ").append(pathOrdInv.getIOrderResultLabSpecimenType());
		}
		
		// Result Date
		if (pathOrdInv.getIOrderResultDisplayRepDateTime() != null)
		{
			if (pathOrdInv.getIOrderResultDisplayRepTimeSupplied() != null && pathOrdInv.getIOrderResultDisplayRepTimeSupplied().equals(Boolean.TRUE))
				name.append(" - Result Date: " + pathOrdInv.getIOrderResultDisplayRepDateTime().toString());
			else
				name.append(" - Result Date: " + pathOrdInv.getIOrderResultDisplayRepDateTime().toString(false));
		}
		
		//WDEV-2780
		if(pathOrdInv.getIOrderResultDisplayStatus() != null)
		{
			if (Boolean.FALSE.equals(ConfigFlag.UI.DISPLAY_SPECIMEN_TYPE_AT_INVESTIGATION_LEVEL.getValue()))
			{
				name.append((!showingHistory ? " - Current Status :" :  " - Status :"));
			}
			
			name.append(" ").append(pathOrdInv.getIOrderResultDisplayStatus());
		}
		
		if(displayTextMappingForResultStatus != null && displayTextMappingForResultStatus.length() > 0)// 	WDEV-15783
		{
			name.append(" ").append(displayTextMappingForResultStatus);
		}
		
		return name.toString();
	}


	//WDEV-11688
	private void addCommentsToResult(DynamicGridRow row, ResultComponentCommentsVoCollection resultComments)
	{
		if (resultComments == null)
			return;
		for (int i = 0 ; i < resultComments.size() ; i++)
		{
			DynamicGridRow newRow = row.getRows().newRow();
			DynamicGridColumn colTest = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_TEST);
			DynamicGridCell cell = newRow.getCells().newCell(colTest,DynamicCellType.WRAPTEXT);
			cell.setReadOnly(true);//WDEV-16232
			cell.setValue(resultComments.get(i).getCmtText());
			colTest.setCanGrow(true);
			colTest.setDynamicWidthSupported(true);
			cell.setWidth(700);
		}
		
	}

	public void cleanupGrid(boolean showingHistory, DynamicGridRow row)
	{
		DynamicGridCell cell;
		if(showingHistory)
		{
			DynamicGridColumn colTest = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_TEST);
			if (colTest != null)
			{
				cell = row.getCells().newCell(colTest, DynamicCellType.LABEL);
				colTest.setWidth(0);
				cell.setWidth(0);
			}
			DynamicGridColumn colValue = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_VALUE);
			if (colValue != null)
			{
				cell = row.getCells().newCell(colValue, DynamicCellType.LABEL);
				colValue.setWidth(0);
				cell.setWidth(0);
			}
			DynamicGridColumn colUnits = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_UNITS);
			if (colUnits != null)
			{
				cell = row.getCells().newCell(colUnits, DynamicCellType.LABEL);
				colUnits.setWidth(0);
				cell.setWidth(0);
			}
			DynamicGridColumn colRefRange = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_REF_RANGE);
			if (colRefRange != null)
			{
				cell = row.getCells().newCell(colRefRange, DynamicCellType.LABEL);
				colRefRange.setWidth(0);
				cell.setWidth(0);
			}
			DynamicGridColumn colComments = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_COMMENTS);
			if (colComments != null)
			{
				cell = row.getCells().newCell(colComments, DynamicCellType.WRAPTEXT);
				colComments.setWidth(0);
				cell.setWidth(0);
			}
		}
	}
	
	public boolean addRadResult(boolean showingHistory, String displayTextMappingForResultStatus)// 	WDEV-15783
	{
		if(grid.getColumns().size() == 0)
			formatRadResultsGrid(showingHistory);
		
		if(radOrderInv == null)
			return false;
		
		DynamicGridColumn nameColumn = grid.getColumns().getByIdentifier(COL_NAME);
		if(nameColumn == null)
			return false;
		
		DynamicGridRow row = grid.getRows().newRow();
		row.setBackColor(Color.AntiqueWhite);
		row.setBold(true);
		
		if(!showingHistory)
		{
			DynamicGridCell cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_PICK), DynamicCellType.STRING);
			cell.setWidth(0);
		}

		DynamicGridCell cell = row.getCells().newCell(nameColumn, DynamicCellType.STRING);
		cell.setWidth(800);
		cell.setReadOnly(true); //WDEV-16256
		
		//WDEV-2780
		String szDisplayText = radOrderInv.getIOrderResultDisplayInvName();
		
		if (radOrderInv.getIOrderResultDisplayRequestedLocation() != null)
			szDisplayText += " (" + radOrderInv.getIOrderResultDisplayRequestedLocation() + ") ";
		
		if(radOrderInv.getIOrderResultDisplayStatus() != null)
			szDisplayText += (!showingHistory ? " - Current Status : " :  " - Status : ") + radOrderInv.getIOrderResultDisplayStatus();
		
		if(displayTextMappingForResultStatus != null && displayTextMappingForResultStatus.length() > 0)// 	WDEV-15783
		{
			szDisplayText += " " + displayTextMappingForResultStatus;
		}
		
		cell.setValue(szDisplayText);
		
		if(!showingHistory && radOrderInv.getIOrderResultDisplayRadResultDetails() == null)
		{
			addNoResultRow(row, false);
		}
		else if(radOrderInv.getIOrderResultDisplayRadResultDetails() != null)
		{
			// WDEV-3953
			/*if (radOrderInv.getIOrderResultDisplayConfidentialTest() != null && radOrderInv.getIOrderResultDisplayConfidentialTest().booleanValue())
			{
				if (!engine.hasRight(AppRight.CAN_VIEW_CONFIDENTIAL_INVESTIGATION_RESULTS))
				{
					//returning true as code has got this far so something (orderinvestigation but not result) has been added
					return true; 
				}
			}*/
			
			row = row.getRows().newRow();

			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_VALUE), DynamicCellType.WRAPTEXT);
			cell.setValue(formatWrapCellValue(radOrderInv.getIOrderResultDisplayRadResultDetails().getReportText()));
			
			//WDEV-2780
			cell.setWidth(690);				//wdev-16401		it was 400
			cell.setFixedFont(true);
			cell.setReadOnly(true);
		
			//WDEV-2450
			DynamicGridRow repRow = grid.getRows().newRow();
			DynamicGridCell cellLabel = repRow.getCells().newCell(grid.getColumns().getByIdentifier(COL_NAME), DynamicCellType.HTMLVIEW);
			cellLabel.setValue("<b>Report Author:</b>");
			cellLabel.setReadOnly(true);
			DynamicGridCell cellValue = repRow.getCells().newCell(grid.getColumns().getByIdentifier(COL_VALUE), DynamicCellType.STRING);
			cellValue.setValue(radOrderInv.getIOrderResultDisplayRadResultDetails().getAuthoringRadiologistName());
			cellValue.setWidth(400);
			cellValue.setReadOnly(true);
			
			DynamicGridRow typRow = grid.getRows().newRow();
			cellLabel = typRow.getCells().newCell(grid.getColumns().getByIdentifier(COL_NAME), DynamicCellType.HTMLVIEW);
			cellLabel.setValue("<b>Typist:</b>");
			cellLabel.setReadOnly(true);
			cellValue = typRow.getCells().newCell(grid.getColumns().getByIdentifier(COL_VALUE), DynamicCellType.STRING);
			cellValue.setValue(radOrderInv.getIOrderResultDisplayRadResultDetails().getTranscriberName());
			cellValue.setWidth(400);
			cellValue.setReadOnly(true);
			
			DynamicGridRow authRow = grid.getRows().newRow();
			cellLabel = authRow.getCells().newCell(grid.getColumns().getByIdentifier(COL_NAME), DynamicCellType.HTMLVIEW);
			cellLabel.setValue("<b>Authorised By:</b>");
			cellLabel.setReadOnly(true);
			cellValue = authRow.getCells().newCell(grid.getColumns().getByIdentifier(COL_VALUE), DynamicCellType.STRING);
			cellValue.setValue(radOrderInv.getIOrderResultDisplayRadResultDetails().getVerifyingRadiologistName());
			cellValue.setWidth(400);
			cellValue.setReadOnly(true);
			
			//this code cleans the extra cells that will appear on the parent row
			//cleanupGrid(showingHistory, row);
			
			return true;
		}
		
		return false;
	}
	
	private void addNoResultRow(DynamicGridRow parentRow, boolean bNonResultable)
	{
		if(parentRow == null)
			return;
		
		DynamicGridRow row = parentRow.getRows().newRow();
		DynamicGridCell cell;

		cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_NAME), DynamicCellType.STRING);
		cell.setValue(bNonResultable ? "Non Resultable" : "No result to display.");
		cell.setWidth(300);
		cell.setReadOnly(true);
	
		DynamicGridColumn colTest = grid.getColumns().getByIdentifier(COL_TEST),
		  				  colValue = grid.getColumns().getByIdentifier(COL_VALUE),
		  				  colUnits = grid.getColumns().getByIdentifier(COL_UNITS),
		  				  colRefRange = grid.getColumns().getByIdentifier(COL_REF_RANGE),
		  				  colComments = grid.getColumns().getByIdentifier(COL_COMMENTS);
		
		if(colTest != null)
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_TEST), DynamicCellType.LABEL);
			colTest.setWidth(0);
			cell.setWidth(0);
		}
		if(colValue != null)
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_VALUE), DynamicCellType.LABEL);
			colValue.setWidth(0);
			cell.setWidth(0);
		}
		if(colUnits != null)
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_UNITS), DynamicCellType.LABEL);
			colUnits.setWidth(0);
			cell.setWidth(0);
		}

		if(colRefRange != null)
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_REF_RANGE), DynamicCellType.LABEL);
			colRefRange.setWidth(0);
			cell.setWidth(0);
		}

		if(colComments != null)
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(COL_COMMENTS), DynamicCellType.WRAPTEXT);
			colComments.setWidth(0);
			cell.setWidth(0);
		}		
	}
	
	private void addInvestigationResultComponent(DynamicGridRow parentRow, IOrderResultDisplay pathOrderInvestigation, PathologyResultComponentVo component, boolean showingHistory) 
	{
		String abnPrefix;
		
		if(parentRow == null || component == null || component.getResValType() == null)
			return;
		
		addAnalyte(component.getAnalyte().toAnalyteRefVo());
		
		if(component.getResValType().equals(ResultValueType.ED))
			return;
		
		DynamicGridRow row = parentRow.getRows().newRow();
		DynamicGridCell cell;

		if(!showingHistory)
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_PICK), DynamicCellType.STRING);
			cell.setWidth(0);		
		}
				
		DynamicGridColumn colTest = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_TEST),
						  colValue = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_VALUE),
						  colUnits = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_UNITS),
						  colRefRange = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_REF_RANGE),
						  colComments = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_COMMENTS);
		
		
		
		if(component.getResValType().equals(ResultValueType.NM) || component.getResValType().equals(ResultValueType.SN))
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_NAME), DynamicCellType.STRING);
			cell.setValue("");
			cell.setWidth(100);
			cell.setReadOnly(true);

			cell = row.getCells().newCell(colTest, DynamicCellType.WRAPTEXT);
			if (component.getAnalyteIsNotNull())
			{
				cell.setValue(component.getAnalyte().getAnalyteExtText());
				cell.setTooltip(component.getAnalyte().getAnalyteExtText());
			}
			colTest.setWidth(100);
			cell.setWidth(100);
			cell.setReadOnly(true);

			if(component.getIsAbnormalIsNotNull() && component.getIsAbnormal().booleanValue())
				abnPrefix = "* ";
			else
				abnPrefix = "";
			
			cell = row.getCells().newCell(colValue, DynamicCellType.LABEL);
			cell.setValue(abnPrefix+component.getResultVal());
			colValue.setWidth(140);
			cell.setWidth(140);
			cell.setReadOnly(true);
			if(component.getIsAbnormalIsNotNull() && component.getIsAbnormal().booleanValue())
			{
				cell.setTextColor(Color.Red);				
			}
			
			cell = row.getCells().newCell(colUnits, DynamicCellType.LABEL);
			if(component.getUnitOfMeasure() != null)
			{
				cell.setValue(component.getUnitOfMeasure().getText());
				cell.setTooltip(component.getUnitOfMeasure().getText());
			}
			colUnits.setWidth(60);
			cell.setWidth(60);			
			cell.setReadOnly(true);
			
			cell = row.getCells().newCell(colRefRange, DynamicCellType.LABEL);
			cell.setValue(component.getRefRange());
			colRefRange.setWidth(80);
			cell.setWidth(80);
			cell.setTooltip(component.getRefRange());
			cell.setReadOnly(true);
			
			cell = row.getCells().newCell(colComments, DynamicCellType.WRAPTEXT);
			cell.setValue(formatWrapCellValue( getResultComments(component.getResultComponentComments())));
			colComments.setWidth(300);
			cell.setWidth(300);
			cell.setReadOnly(true);
		}
		else if(component.getResValType().equals(ResultValueType.ST) 
				|| component.getResValType().equals(ResultValueType.FT)
				||component.getResValType().equals(ResultValueType.TX)
				||component.getResValType().equals(ResultValueType.CE)) //WDEV-14900 CE data
		{
			cell = row.getCells().newCell(grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_NAME), DynamicCellType.STRING);
			cell.setValue("");
			cell.setWidth(100);
			cell.setReadOnly(true);

			cell = row.getCells().newCell(colTest, DynamicCellType.WRAPTEXT);
			cell.setValue(component.getAnalyte().getAnalyteExtText());
			colTest.setWidth(100);
			cell.setWidth(100);
			cell.setReadOnly(true);
			
			if(component.getIsAbnormalIsNotNull() && component.getIsAbnormal().booleanValue())
				abnPrefix = "* ";
			else
				abnPrefix = "";

			String comments = getResultComments(component.getResultComponentComments());
			
			cell = row.getCells().newCell(colValue, DynamicCellType.WRAPTEXT);
			if (component.getResValType().equals(ResultValueType.ST))
				cell.setValue(abnPrefix + component.getResultVal());
			else
			{
				String displayText=component.getFormattedText();
				if(null==displayText||"".equals(displayText))
					displayText=component.getResultVal();
				if(null==displayText) //WDEV-6046 MN if it is still null display an empty string
					displayText="";
				cell.setValue(abnPrefix + displayText);
			}			 
			
			if (comments == null || comments.length() == 0)
			{
				colValue.setWidth(460);
				cell.setWidth(460);
			}
			else if (comments.length() < 10)
			{
				colValue.setWidth(410);
				cell.setWidth(410);
			}
			else
			{
				colValue.setWidth(260);
				cell.setWidth(260);
			}
			
			cell.setReadOnly(true);
			cell.setFixedFont(true);
			if(component.getIsAbnormalIsNotNull() && component.getIsAbnormal().booleanValue())
			{
				cell.setTextColor(Color.Red);				
			}
			
			cell = row.getCells().newCell(colUnits, DynamicCellType.LABEL);
			if(component.getUnitOfMeasure() != null)
			{
				cell.setValue(component.getUnitOfMeasure().getText());
				cell.setTooltip(component.getUnitOfMeasure().getText());
			}
			colUnits.setWidth(60);
			cell.setWidth(60);
			cell.setReadOnly(true);
			
			cell = row.getCells().newCell(colRefRange, DynamicCellType.LABEL);
			cell.setValue(component.getRefRange());
			cell.setTooltip(component.getRefRange());
			colRefRange.setWidth(80);
			cell.setWidth(80);
			cell.setReadOnly(true);
			
			cell = row.getCells().newCell(colComments, DynamicCellType.WRAPTEXT);
			cell.setValue(formatWrapCellValue(comments));
			cell.setFixedFont(true);
			
			if (comments == null || comments.length() == 0)
			{
				colComments.setWidth(0);
				cell.setWidth(0);
			}
			else if (comments.length() < 10)
			{
				colComments.setWidth(50);
				cell.setWidth(50);
			}
			else
			{
				colComments.setWidth(200);
				cell.setWidth(200);
			}

			cell.setReadOnly(true);
		}
	}
	
	private void addAnalyte(AnalyteRefVo value)
	{
		if(value == null)
			return;
		
		AnalyteRefVoCollection analytes = localContextAnalytes;
		if(analytes == null)
			analytes = new AnalyteRefVoCollection();
		
		if(analytes.indexOf(value) >= 0)
			return;
		analytes.add(value);
		
		localContextAnalytes = analytes;
	}
	
	public ArrayList<String> getTemporaryFiles()
	{
		return temporaryFiles;
	}
	
	@SuppressWarnings("unchecked") 
	private void addExtendedDataResult(DynamicGridRow row, IOrderResultDisplay pathOrdInv)
	{
		if(row == null || grid == null)
			return;
		
		
		temporaryFiles = new ArrayList<String>();
		ByteArrayOutputStream outStream = null;
		try
		{
			if(ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() == null || ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().length() == 0)
				throw new ConfigurationException("Config Flag FILE_UPLOAD_DIR is null or empty");
			
			File uploadFileDir = new File(EnvironmentConfig.getBaseUri() + ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue());						
			if (!uploadFileDir.exists()) {
				 uploadFileDir.mkdirs();
			}
			
			DynamicGridRow newRow = row;
			
			DynamicGridColumn coll = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_NAME);
							  coll = grid.getColumns().getByIdentifier(ResultDisplayHelper.COL_NAME);
							  coll.setWidth(800);
			
			StringBuffer sb = new StringBuffer();
			sb.append("<table>");
			
			outStream = new ByteArrayOutputStream();
			
			dataStore = pathOrdInv.getIOrderResultDisplayExtendedDataResult();
			
			if (dataStore != null && dataStore.size() > 0)
			{
				for (Entry<ResultEDSubtype, Object> entry : dataStore.entrySet())
				{							
					if (entry.getKey() instanceof ims.ocrr.vo.lookups.ResultEDSubtype &&
						entry.getKey().equals(ims.ocrr.vo.lookups.ResultEDSubtype.PDF))
					{
						StringBuilder pdfData = (StringBuilder) dataStore.get(ims.ocrr.vo.lookups.ResultEDSubtype.PDF);
						if (pdfData != null && pdfData.length() > 0)
						{
							ArrayList<String> imagesList = new ArrayList<String>();
							ArrayList<OutputStream> list = engine.convertPdfToImages(Base64.decode(pdfData.toString()), ImageType.JPG);
							for (int i = 0; i < list.size(); i++) 
							{
								String path, fileName = UUID.randomUUID().toString();				
						
								if (ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().endsWith(File.separator)) {
									path = ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + fileName + "." + ImageType.JPG.toString();
								}
								else {						
									path = ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + File.separator + fileName + "." + ImageType.JPG.toString();
								}
						
								imagesList.add(path);
					
								FileOutputStream newOut = new FileOutputStream(uploadFileDir + File.separator + fileName + "." + ImageType.JPG.toString());               		                   		  
			    						 newOut.write(((ByteArrayOutputStream) list.get(i)).toByteArray());  
			    						 newOut.close();
			    						 
			    						 temporaryFiles.add(EnvironmentConfig.getBaseUri() + path);
							}
					
							sb = new StringBuffer();
							sb.append("<table>");
							for(int i=0; i < imagesList.size(); i++) 
							{
								String jpgFile = (String) imagesList.get(i);				
								sb.append("<tr><td><img src='"+ jpgFile +"' width='100%'></td></tr>");
							}	
							sb.append("</table>");
					
							DynamicGridCell cell = newRow.getRows().newRow().getCells().newCell(coll, DynamicCellType.HTMLVIEW);
								cell.setValue(sb.toString());
								cell.setWidth(800);			
								cell.setReadOnly(true);
						}
					}				
					else if (entry.getKey() instanceof ims.ocrr.vo.lookups.ResultEDSubtype &&
							entry.getKey().equals(ims.ocrr.vo.lookups.ResultEDSubtype.RTF))
					{
						StringBuilder rtfData = (StringBuilder) dataStore.get(ims.ocrr.vo.lookups.ResultEDSubtype.RTF);
						if (rtfData != null && rtfData.length() > 0)
						{
							ConversionHelper helper = new ConversionHelper();			
							helper.convert( rtfData.toString().getBytes(), "rtf", outStream);
					
							ArrayList<String> imagesList = new ArrayList<String>();
							ArrayList<OutputStream> list = engine.convertPdfToImages(IOUtils.toByteArray(new ByteArrayInputStream(outStream.toByteArray())), ImageType.JPG);
							for (int i = 0; i < list.size(); i++) 
							{
								String path, fileName = UUID.randomUUID().toString();				
						
								if (ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().endsWith(File.separator)) {						
									path = ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + fileName + "." + ImageType.JPG.toString();
								}
								else {
									path = ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + File.separator + fileName + "." + ImageType.JPG.toString();
								}
						
								imagesList.add(path);
						
								FileOutputStream newOut = new FileOutputStream(uploadFileDir + File.separator + fileName + "." + ImageType.JPG.toString());               		                   		  
			    						 newOut.write(((ByteArrayOutputStream) list.get(i)).toByteArray());  
			    						 newOut.close();
			    		
			    				temporaryFiles.add(EnvironmentConfig.getBaseUri() + path);				 
							}
					
							sb = new StringBuffer();
							sb.append("<table>");
					
							for(int i=0; i < imagesList.size(); i++)
							{
								String jpgFile = (String) imagesList.get(i);				
								sb.append("<tr><td><img src='"+  jpgFile +"' width='100%'></td></tr>");
							}		
					
							sb.append("</table>");
					
							DynamicGridCell cell = newRow.getRows().newRow().getCells().newCell(coll, DynamicCellType.HTMLVIEW);
							cell.setValue(sb.toString());
							cell.setWidth(800);			
							cell.setReadOnly(true);
						}				
					}					
					else if (entry.getKey() instanceof ims.ocrr.vo.lookups.ResultEDSubtype &&
							entry.getKey().equals(ims.ocrr.vo.lookups.ResultEDSubtype.HTML))
					{						
					
						StringBuilder htmlData = (StringBuilder) dataStore.get(ims.ocrr.vo.lookups.ResultEDSubtype.HTML);
						if (htmlData != null && htmlData.length() > 0)
						{
							sb = new StringBuffer();
					
							sb.append("<table>");
							sb.append("<tr><td>" + htmlData.toString() + "</td></tr>");
							sb.append("</table>");
					
							DynamicGridCell cell = newRow.getRows().newRow().getCells().newCell(coll, DynamicCellType.HTMLVIEW);
							cell.setValue(sb.toString());
							cell.setWidth(800);			
							cell.setReadOnly(true);
						}
					}
					else if (entry.getKey() instanceof ims.ocrr.vo.lookups.ResultEDSubtype &&
						entry.getKey().equals(ims.ocrr.vo.lookups.ResultEDSubtype.JPEG))
					{						
						if (dataStore.get(ims.ocrr.vo.lookups.ResultEDSubtype.JPEG) instanceof ArrayList)
						{
							ArrayList< HashMap<ims.ocrr.vo.lookups.ResultEDSubtype, StringBuilder>>  jpegData = (ArrayList< HashMap<ims.ocrr.vo.lookups.ResultEDSubtype, StringBuilder>>) dataStore.get(ims.ocrr.vo.lookups.ResultEDSubtype.JPEG);
							if (jpegData != null && jpegData.size() > 0)
							{
								sb = new StringBuffer();
								sb.append("<table>");
					
								for (int i = 0; i < jpegData.size(); i++) 
								{
									String path, fileName = UUID.randomUUID().toString();				
						
									if (ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue().endsWith(File.separator)) {
										path = ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + fileName + "." + ImageType.JPG.toString();
									}
									else {
										path = ConfigFlag.GEN.FILE_UPLOAD_DIR.getValue() + File.separator + fileName + "." + ImageType.JPG.toString();
									}					
									
									Base64.decodeToFile(jpegData.get(i).get(ims.ocrr.vo.lookups.ResultEDSubtype.JPEG).toString(), uploadFileDir + File.separator + fileName + "." + ImageType.JPG.toString());			    		
						
									sb.append("<tr><td><img src='"+  path +"' width='100%'></td></tr>");
						
									temporaryFiles.add(EnvironmentConfig.getBaseUri() + path);
								}
						
								sb.append("</table>");
					
								DynamicGridCell cell = newRow.getRows().newRow().getCells().newCell(coll, DynamicCellType.HTMLVIEW);
								cell.setValue(sb.toString());
								cell.setWidth(800);			
								cell.setReadOnly(true);
							}	
						}
					}	
				}	
			}
			
			coll.setWidth(100);
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);			
		}
		finally
		{
			if (outStream != null)
			{
				try
				{
					outStream.close();
				}
				catch (IOException e)
				{ 
				}
			}
		}
	}
	
	private String getResultComments(ResultComponentCommentsVoCollection comments)
	{		
		if(comments == null)
			return "";
		
		StringBuffer result = new StringBuffer();
		
		for(int x = 0; x < comments.size(); x++)
		{
			if(comments.get(x) != null && comments.get(x).getCmtTextIsNotNull())
			{
				if(result.length() > 0)
					result.append("\n");
				result.append(comments.get(x).getCmtText());
			}
		}
		
		return result.toString();
	}

	public void setAnalytes(AnalyteRefVoCollection localContextAnalytes)
	{
		this.localContextAnalytes = localContextAnalytes;
	}
	
	private String formatWrapCellValue(String value)
	{
		if(value == null)
			return "";
		
		String result = "";
		int counter = 0;
		for(int x =0; x < value.length();x++)
		{
			counter++;
			if(value.charAt(x) == ' '||value.charAt(x) == '\n' || value.charAt(x) == '\r' || value.charAt(x) == '-')
				counter = 0;
			if(counter > 23)
			{	
				counter = 0;							
				
				//Check forward
				for (int i = x; i > 0 && i < value.length(); i++) 
				{
					if(value.charAt(i) == ' '||value.charAt(i) == '\n' || value.charAt(i) == '\r' || value.charAt(i) == '-')
					{													
							//Check backward
							for (int j = x; j > 0; j--) 
							{
								if(value.charAt(j) == ' '||value.charAt(j) == '\n' || value.charAt(j) == '\r')
								{										
									if (!value.substring(j, i).contains("@"))
									{							
										result += " ";
									}						
									
									break;
								}
							}		
																								
						break;
					}
				}
			}
			
			result += value.charAt(x);
		}

		return result;
	}
}
