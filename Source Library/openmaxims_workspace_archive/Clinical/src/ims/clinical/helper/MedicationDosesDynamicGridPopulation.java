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

import ims.clinical.vo.MedicationOverViewVo;
import ims.core.vo.MedicationDose;
import ims.core.vo.PatientMedicationVo;
import ims.core.vo.lookups.MedicationTimesOfAdministration;
import ims.core.vo.lookups.MedicationTimesOfAdministrationCollection;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Color;
import ims.framework.utils.Image;

public final class MedicationDosesDynamicGridPopulation 
{
	private static final int		DESC_OR_DOSE_ID			= 1;
	private static final int		DESC_OR_ROUTE_ID		= 2;
	private static final int		FREQ_OR_TIMES_ID		= 3;
	private static final int		MED_DO_ID				= 4;
	private static final int		MED_DAYS_ID				= 5;
	private static final int		COMMENCED_BY_ID			= 6;
	private static final int		COMMENCED_DATE_ID		= 7;
	private static final int		AUDIT_ID				= 8;
	private static final int		COPY_ID					= 9;

	private static final Integer	COL_MED_DESC_OR_DOSE	= new Integer(DESC_OR_DOSE_ID);
	private static final Integer	COL_MED_DESC_OR_ROUTE	= new Integer(DESC_OR_ROUTE_ID);
	private static final Integer	COL_MED_FREQ_OR_TIMES	= new Integer(FREQ_OR_TIMES_ID);
	private static final Integer	COL_MED_DO				= new Integer(MED_DO_ID);
	private static final Integer	COL_MED_DAYS			= new Integer(MED_DAYS_ID);
	private static final Integer	COL_MED_COMMENCED_BY	= new Integer(COMMENCED_BY_ID);
	private static final Integer	COL_MED_COMMENCED_DATE	= new Integer(7);
	private static final Integer	COL_AUDIT				= new Integer(AUDIT_ID);
	private static final Integer	COL_COPY				= new Integer(COPY_ID);
	
	private static final Integer	COL_DOSE_DOSE			= new Integer(DESC_OR_DOSE_ID);
	private static final Integer	COL_DOSE_ROUTE			= new Integer(DESC_OR_ROUTE_ID);
	private static final Integer	COL_DOSE_TIMES			= new Integer(FREQ_OR_TIMES_ID);
	private static final Integer	COL_DOSE_COMMENCED_BY	= new Integer(COMMENCED_BY_ID);
	private static final Integer	COL_DOSE_COMMENCED_DATE	= new Integer(COMMENCED_DATE_ID);

	private static final Color		FIRST_COLOUR			= Color.Beige;
	private static final Color		SECOND_COLOUR			= Color.White;

	private DynamicGrid				grid;
	private boolean					checkColumn;
	private Image					blisterpackImage;
	private Image					tabletdoseImage;
	private Image					doImage					= null;
	private Image 					imgAudit;
	
	public MedicationDosesDynamicGridPopulation(DynamicGrid grid, Image blisterpackImage, Image tabletdoseImage)
	{
		medicationDosesDynamicGridPopulation(grid, false, blisterpackImage, tabletdoseImage, null, imgAudit);
	}
	
	public MedicationDosesDynamicGridPopulation(DynamicGrid grid, Image blisterpackImage, Image tabletdoseImage, boolean bCheckColumn )
	{
		medicationDosesDynamicGridPopulation(grid, bCheckColumn, blisterpackImage, tabletdoseImage, null, imgAudit);
	}
	
	/**
	 * used also to mark a discharge info error (call this constructor only when you have discharge info
	 * @param grid
	 * @param blisterpackImage
	 * @param tabletdoseImage
	 * @param doImage
	 */
	public MedicationDosesDynamicGridPopulation(DynamicGrid grid, Image blisterpackImage, Image tabletdoseImage, Image doImage, Image imgAudit)
	{
		medicationDosesDynamicGridPopulation(grid, false, blisterpackImage, tabletdoseImage, doImage, imgAudit);
	}

	/**
	 * @param grid
	 * @param blisterpackImage
	 * @param tabletdoseImage
	 * @param doImage
	 */
	private void medicationDosesDynamicGridPopulation(DynamicGrid grid, boolean bCheckColumn, Image blisterpackImage, Image tabletdoseImage, Image doImage, Image imgAudit)
	{
		this.grid = grid;
		this.checkColumn = bCheckColumn;
		this.blisterpackImage= blisterpackImage;
		this.tabletdoseImage = tabletdoseImage;
		this.doImage = doImage;
		this.imgAudit = imgAudit;
	}
	
	public MedicationDosesDynamicGridPopulation()
	{
	}
	
	public void initializeGrid()
	{
		this.grid.clear();
		this.grid.setSelectable(true);

		int do_width 	   = 35;
		int med_dats_width = 50;
		int check_width    = 30;
		int offset = hasDischargeInfo()?do_width + med_dats_width:0;
		offset = this.checkColumn ? offset + check_width : offset;
		
		DynamicGridColumn column = this.grid.getColumns().newColumn("Medication / Doses");
		column.setIdentifier(COL_MED_DESC_OR_DOSE);
		//offset/2 + offset/4 + offset/4 = offset -> distribute evenly the width of newly created columns when exists
		column.setWidth(210 - offset/2);
		
		column = this.grid.getColumns().newColumn("Route");
		column.setIdentifier(COL_MED_DESC_OR_ROUTE);
		column.setWidth(130 - offset/4);

		column = this.grid.getColumns().newColumn("Frequency/Times");
		column.setIdentifier(COL_MED_FREQ_OR_TIMES);
		column.setWidth(130);
		
		if(hasDischargeInfo())
		{
			column = this.grid.getColumns().newColumn("D.O.");
			column.setIdentifier(COL_MED_DO);
			column.setWidth(do_width);
			
			column = this.grid.getColumns().newColumn("Days");
			column.setIdentifier(COL_MED_DAYS);
			column.setWidth(med_dats_width);
		}
		
		column = this.grid.getColumns().newColumn("Commenced By (HCP)");
		column.setIdentifier(COL_MED_COMMENCED_BY);
		column.setWidth(150 - offset/4);
		
		column = this.grid.getColumns().newColumn("Commenced Date");
		column.setIdentifier(COL_MED_COMMENCED_DATE);
		column.setWidth(115);
		
		if (this.checkColumn)
		{
			column = this.grid.getColumns().newColumn("Copy");
			column.setIdentifier(COL_COPY);
			column.setWidth(check_width);
		}

		column = this.grid.getColumns().newColumn("");
		column.setIdentifier(COL_AUDIT);
		column.setWidth(-1);
		
	}

	public void populate(MedicationOverViewVo voOverView)
	{
		this.grid.getRows().clear();
		if ( (voOverView != null) && (voOverView.getMedicationIsNotNull()) )
		{
			voOverView.getMedication().sort();
			for (int i = 0 ; i < voOverView.getMedication().size() ; i++)
			{
				Color objColor = (i% 2) == 0 ? FIRST_COLOUR : SECOND_COLOUR;
				addMedicationRow(voOverView.getMedication().get(i), false, objColor);
			}
		}

	}
	
	public void populateHideDiscontinued(MedicationOverViewVo voOverView)
	{
		
		this.grid.getRows().clear();
		if ( (voOverView != null) && (voOverView.getMedicationIsNotNull()) )
		{
			voOverView.getMedication().sort();
			for (int i = 0 ; i < voOverView.getMedication().size() ; i++)
			{
				Color objColor = (i% 2) == 0 ? FIRST_COLOUR : SECOND_COLOUR;
				
				addMedicationRow(voOverView.getMedication().get(i), true, objColor);
			}
		}

	}
	
	private void addMedicationRow(PatientMedicationVo voMed, boolean bHideDiscontinued, Color objColor)
	{
		if(voMed == null)
			throw new CodingRuntimeException("Coding Error voSnapShot is null addMedicationRow()");
		
		if ( (bHideDiscontinued) && (voMed.getIsDiscontinuedIsNotNull()) && (voMed.getIsDiscontinued().booleanValue())) 
			return;

		boolean bAllDosesAreDiscontinued = true;
		MedicationDose voDose = null;
		
		//Loop thru to see if collection has any non-discontinued Doses - i.e. current ones.
		for (int k = 0 ; k < voMed.getPrescribedDoses().size() ; k++)
		{
			voDose = voMed.getPrescribedDoses().get(k);
			if ((voDose.getIsStopped() == null) || (voDose.getIsStoppedIsNotNull() && (voDose.getIsStopped().booleanValue() == false)) )
				bAllDosesAreDiscontinued = false;
		}

		//If we are not hiding Discontinued Meds and doses the ignore the bAllDosesAreDiscontinued boolean.
		if (!bHideDiscontinued)
			bAllDosesAreDiscontinued = false;
		
		if (!bAllDosesAreDiscontinued)
		{
			DynamicGridRow row = this.grid.getRows().newRow();
			DynamicGridCell cell1 = row.getCells().newCell(getColByIdentifier(COL_MED_DESC_OR_DOSE), DynamicCellType.LABEL);
			cell1.setValue(voMed.getOtherMedicationText());
			cell1.setIdentifier(voMed.getOtherMedicationText());
			//WDEV-1204 - add tooltip
			cell1.setTooltip(voMed.getDiscontinuedTooltip());
	
			DynamicGridCell cell2 = row.getCells().newCell(getColByIdentifier(COL_MED_FREQ_OR_TIMES), DynamicCellType.LABEL);
			cell2.setValue(voMed.getFrequencyIsNotNull() ? voMed.getFrequency().toString() : "");
			cell2.setIdentifier(voMed.getFrequency());
			
			if(hasDischargeInfo())
			{
				DynamicGridCell cellDo = row.getCells().newCell(getColByIdentifier(COL_MED_DO), DynamicCellType.IMAGE);
				cellDo.setValue(voMed.getIsInTTOIsNotNull() && voMed.getIsInTTO().booleanValue()?doImage:null);
				
				DynamicGridCell cellDays = row.getCells().newCell(getColByIdentifier(COL_MED_DAYS), DynamicCellType.INT);
				cellDays.setValue(voMed.getNoDaysSupply());
			}
			
			DynamicGridCell cell3 = row.getCells().newCell(getColByIdentifier(COL_MED_COMMENCED_BY), DynamicCellType.LABEL);
			cell3.setValue(voMed.getHcpCommencedIsNotNull() ? voMed.getHcpCommenced().toString() : "");
			cell3.setIdentifier(voMed.getFrequency());
	
			DynamicGridCell cell4 = row.getCells().newCell(getColByIdentifier(COL_MED_COMMENCED_DATE), DynamicCellType.LABEL);
			cell4.setValue(voMed.getCommencedDateIsNotNull() ? voMed.getCommencedDate().toString() : "");
			cell4.setIdentifier(voMed.getFrequency());
			
			DynamicGridCell cellAudit = row.getCells().newCell(getColByIdentifier(COL_AUDIT), DynamicCellType.IMAGE);
			if (voMed.getSysInfoIsNotNull() && voMed.getSysInfo().getLastupdateUser() != null)
			{
				cellAudit.setValue(this.imgAudit);
				cellAudit.setTooltip("This record had been updated.");
			}
		
			if (this.checkColumn)
			{
				DynamicGridCell cellChecked = row.getCells().newCell(getColByIdentifier(COL_COPY), DynamicCellType.BOOL);
				cellChecked.setValue(Boolean.TRUE);
				cellChecked.setIdentifier(null);
			}		
	
			row.setValue(voMed);
			
			for (int i = 0 ; i < voMed.getPrescribedDoses().size() ; i ++)
				addDoseRow(row, voMed.getPrescribedDoses().get(i), bHideDiscontinued, objColor);
				
			row.setExpanded(true);
			row.setSelectable(true);
			row.setBackColor(objColor);
			row.setExpandedImage(this.blisterpackImage);

			if ( (voMed.getIsDiscontinuedIsNotNull()) && (voMed.getIsDiscontinued().booleanValue()) )
				row.setBold(false);
			else
				row.setBold(true);
		}
	}

	private boolean addDoseRow(DynamicGridRow row, MedicationDose voDose, boolean bHideDiscontinued, Color objColor)
	{
	  	if(voDose == null || row == null)
			throw new CodingRuntimeException("Dose or Row not sent - Coding Error");
	
		if ( (bHideDiscontinued) && (voDose.getIsStoppedIsNotNull()) && (voDose.getIsStopped().booleanValue())) 
			return false;
		
		DynamicGridRow childRow = row.getRows().newRow();
		DynamicGridCell cell1 = childRow.getCells().newCell(getColByIdentifier(COL_DOSE_DOSE), DynamicCellType.LABEL);
		cell1.setValue(voDose.getDoseIsNotNull() ? voDose.getDose() : "");
		cell1.setIdentifier(voDose.getDose());
		cell1.setTooltip(voDose.getDiscontinuedTooltip());

		DynamicGridCell cell2= childRow.getCells().newCell(getColByIdentifier(COL_DOSE_ROUTE), DynamicCellType.LABEL);
		cell2.setValue(voDose.getAdminRouteIsNotNull() ? voDose.getAdminRoute().toString() : "");
		cell2.setIdentifier(voDose.getAdminRoute());
	
		DynamicGridCell cell3 = childRow.getCells().newCell(getColByIdentifier(COL_DOSE_TIMES), DynamicCellType.LABEL);
		cell3.setValue(voDose.getAdminTimesIsNotNull() ? createTimesString(voDose.getAdminTimes()) : "");
		cell3.setTooltip(voDose.getAdminTimesIsNotNull() ? createTimesString(voDose.getAdminTimes()) : "");
		cell3.setIdentifier(voDose.getAdminTimes());
	
		DynamicGridCell cell4 = childRow.getCells().newCell(getColByIdentifier(COL_DOSE_COMMENCED_BY), DynamicCellType.LABEL);
		cell4.setValue(voDose.getDoseStartHcpIsNotNull() ? voDose.getDoseStartHcp().toString() : "");
		cell4.setIdentifier(voDose.getDose());
			
		DynamicGridCell cell5 = childRow.getCells().newCell(getColByIdentifier(COL_DOSE_COMMENCED_DATE), DynamicCellType.LABEL);
		cell5.setValue(voDose.getDoseStartDateIsNotNull() ? voDose.getDoseStartDate().toString() : "");
		cell5.setIdentifier(voDose.getDose());
	
		childRow.setValue(voDose);
			
		childRow.setExpanded(true);
		childRow.setSelectable(false);
		childRow.setBackColor(objColor);
		childRow.setExpandedImage(this.tabletdoseImage);
		childRow.setCollapsedImage(this.tabletdoseImage);

		if ( (voDose.getIsStoppedIsNotNull()) && (voDose.getIsStopped().booleanValue()) )
			childRow.setBold(false);
		else
			childRow.setBold(true);

		return true;
	}

	private String createTimesString(MedicationTimesOfAdministrationCollection voTimesColl) 
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < voTimesColl.size() ; i++)
		{
			MedicationTimesOfAdministration lkpTime = voTimesColl.get(i);
			sb.append(lkpTime.toString());
			if (i < voTimesColl.size() - 1)
				sb.append(", ");
		}
		return sb.toString();
	}
	
	private boolean hasDischargeInfo()
	{
		return doImage != null; 
	}
	
	private DynamicGridColumn getColByIdentifier(Object indentifier)
	{
		return this.grid.getColumns().getByIdentifier(indentifier);
	}
}
