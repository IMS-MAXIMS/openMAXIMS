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

import ims.configuration.gen.ConfigFlag;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.utils.Color;
import ims.framework.utils.Image;
import ims.ocrr.vo.InvestShortVo;
import ims.ocrr.vo.InvestigationSelectOrderVo;
import ims.ocrr.vo.OrderEntryTemplateColumnVo;
import ims.ocrr.vo.OrderEntryTemplateColumnVoCollection;
import ims.ocrr.vo.OrderEntryTemplateComponentShortVo;
import ims.ocrr.vo.OrderEntryTemplateComponentShortVoCollection;
import ims.ocrr.vo.OrderEntryTemplateVo;
import ims.ocrr.vo.OrderSetComponentForHelpTextVo;
import ims.ocrr.vo.OrderSetComponentForHelpTextVoCollection;
import ims.ocrr.vo.OrderSetForHelpTextVo;
import ims.ocrr.vo.SelectedComponentFromSelectOrderVo;
import ims.ocrr.vo.SelectedComponentFromSelectOrderVoCollection;
import ims.ocrr.vo.lookups.SelectAndOrderComponentType;
import ims.ocrr.vo.lookups.TemplateDividerType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class OrderEntryTemplatePopulation
{
	private static final long serialVersionUID = 1L;
	
	protected DynamicGrid grid;
	protected Image profileImage;
	protected Image investigationImage;
	protected Image orderSetImage;
	
	public OrderEntryTemplatePopulation(DynamicGrid grid, Image investigationImage, Image profileImage, Image orderSetImage)
	{
		this.grid = grid;
		this.investigationImage = investigationImage;
		this.profileImage = profileImage;		
		this.orderSetImage = orderSetImage;
	}
	public void populateSearch(SelectedComponentFromSelectOrderVoCollection items)
	{
		populateSearch(items, new SelectedComponentFromSelectOrderVoCollection(), new SelectedComponentFromSelectOrderVoCollection());
	}
	public void populateSearch(SelectedComponentFromSelectOrderVoCollection items, SelectedComponentFromSelectOrderVoCollection selection, SelectedComponentFromSelectOrderVoCollection linkedSelection)
	{
		this.grid.clear();
		this.grid.setSelectable(false);
		
		DynamicGridColumn selectInvestigationColumn = this.grid.getColumns().newColumn(" ");
		selectInvestigationColumn.setWidth(20);		
		
		DynamicGridColumn imageInvestigationColumn = this.grid.getColumns().newColumn(" ");
		imageInvestigationColumn.setWidth(20);		
		
		DynamicGridColumn textInvestigationColumn = this.grid.getColumns().newColumn("Investigations", true);
		textInvestigationColumn.setWidth(350);		
		
		DynamicGridColumn selectProfileColumn = this.grid.getColumns().newColumn(" ");
		selectProfileColumn.setWidth(20);		
		
		DynamicGridColumn imageProfileColumn = this.grid.getColumns().newColumn(" ");		
		imageProfileColumn.setWidth(20);		
		
		DynamicGridColumn textProfileColumn = this.grid.getColumns().newColumn("Profiles", true);
		textProfileColumn.setWidth(350);		
		
		if(items == null)
			return;
		
		SelectedComponentFromSelectOrderVoCollection investigations = new SelectedComponentFromSelectOrderVoCollection();
		SelectedComponentFromSelectOrderVoCollection profiles = new SelectedComponentFromSelectOrderVoCollection();
		
		for(int x = 0; x < items.size(); x++)
		{
			SelectedComponentFromSelectOrderVo item = items.get(x);
			if(item != null)
			{
				boolean isProfile = item.getComponentTypeIsNotNull() && item.getComponentType().equals(SelectAndOrderComponentType.PROFILE);
				if(!isProfile)
				{
					if(investigations.indexOf(item) < 0)
						investigations.add(item);
				}
				else
				{
					if(profiles.indexOf(item) < 0)
						profiles.add(item);
				}
			}
		}
		
		int noRows = investigations.size() > profiles.size() ? investigations.size() : profiles.size();
		for(int x = 0; x < noRows; x++)
		{
			DynamicGridRow row = this.grid.getRows().newRow();			
			
			if(investigations.size() > x)
			{
				SelectedComponentFromSelectOrderVo investigation = investigations.get(x);
				
				String text = investigation.getText();
				String tooltip = investigation.getTooltip();
			
				SelectedComponentFromSelectOrderVo component = new SelectedComponentFromSelectOrderVo();
				component.setID(investigation.getID());
				component.setComponentType(SelectAndOrderComponentType.INVESTIGATION);
				component.setText(text);
				component.setCategory(investigation.getCategory());
				component.setHelpText(investigation.getHelpText());
				component.setTooltip(tooltip);
				component.setAdditionalLocationInfo(investigation.getAdditionalLocationInfo());
				component.setParentInvestigationId(investigation.getParentInvestigationId());
				component.setIsAddon(investigation.getIsAddon());
				component.setRequiresSite(investigation.getRequiresSite());
				component.setServiceID(investigation.getServiceID());
				component.setMinReOrderPeriod(investigation.getMinReOrderPeriod());
				component.setMinReOrderVal(investigation.getMinReOrderVal());
				component.setMinReOrderFemalePeriod(investigation.getMinReOrderFemalePeriod());
				component.setMinReOrderFemaleVal(investigation.getMinReOrderFemaleVal());
				component.setPhlebMayCollect(investigation.getPhlebMayCollect());
				component.setGenderSpecific(investigation.getGenderSpecific());
			
				boolean isLocked = false;
				if(new Boolean((selection.indexOf(component) >= 0)))
				{
					isLocked = linkedSelection.indexOf(component) >= 0;
				}
				DynamicGridCell cell = row.getCells().newCell(selectInvestigationColumn, DynamicCellType.BOOL);
				if(isLocked)
				{
					cell.setReadOnly(true);
				}
				cell.setValue(new Boolean((selection.indexOf(component) >= 0)));
				cell.setTooltip(tooltip);
				cell.setAutoPostBack(true);
				
				cell = row.getCells().newCell(imageInvestigationColumn, DynamicCellType.IMAGE);
				cell.setValue(this.investigationImage);
				cell.setTooltip(component.getHelpText());
				
				cell = row.getCells().newCell(textInvestigationColumn, DynamicCellType.LABEL);
				if(isLocked)
				{
					cell.setTextColor(Color.DarkGray);					
				}
				
				boolean isAdditionalInfoToBeShown = ConfigFlag.UI.OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME.getValue();
				cell.setValue(isAdditionalInfoToBeShown ? text + component.getAdditionalLocationInfo() : text);
				cell.setIdentifier(component);
				cell.setTooltip(tooltip);				
			}
			if(profiles.size() > x)
			{
				SelectedComponentFromSelectOrderVo profile = profiles.get(x);
				
				String text = profile.getText();
				String tooltip = profile.getTooltip();
				
				SelectedComponentFromSelectOrderVo component = new SelectedComponentFromSelectOrderVo();
				component.setID(profile.getID());
				component.setComponentType(SelectAndOrderComponentType.PROFILE);
				component.setCategory(profile.getCategory());
				component.setText(text);
				component.setTooltip(tooltip);
				component.setHelpText(profile.getHelpText());
				component.setAdditionalLocationInfo(profile.getAdditionalLocationInfo());
				component.setParentInvestigationId(profile.getParentInvestigationId());
				component.setIsAddon(profile.getIsAddon());
				component.setRequiresSite(profile.getRequiresSite());
				component.setServiceID(profile.getServiceID());
				component.setMinReOrderPeriod(profile.getMinReOrderPeriod());
				component.setMinReOrderVal(profile.getMinReOrderVal());
				component.setMinReOrderFemalePeriod(profile.getMinReOrderFemalePeriod());
				component.setMinReOrderFemaleVal(profile.getMinReOrderFemaleVal());
				component.setPhlebMayCollect(profile.getPhlebMayCollect());
				component.setGenderSpecific(profile.getGenderSpecific());

				
				DynamicGridCell cell = row.getCells().newCell(selectProfileColumn, DynamicCellType.BOOL);
				cell.setValue(new Boolean((selection.indexOf(component) >= 0)));
				cell.setTooltip(tooltip);
				cell.setAutoPostBack(true);
				
				cell = row.getCells().newCell(imageProfileColumn, DynamicCellType.IMAGE);
				cell.setValue(this.profileImage);
				cell.setTooltip(component.getHelpText());
				
				cell = row.getCells().newCell(textProfileColumn, DynamicCellType.LABEL);				
				boolean isAdditionalInfoToBeShown = ConfigFlag.UI.OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME.getValue();
				cell.setValue(isAdditionalInfoToBeShown ? text + component.getAdditionalLocationInfo() : text);
				cell.setTooltip(tooltip);
				cell.setIdentifier(component);
			}
		}		
	}
	public void populate(OrderEntryTemplateVo record)
	{
		populate(record, new SelectedComponentFromSelectOrderVoCollection());
	}
	public void populate(OrderEntryTemplateVo record, SelectedComponentFromSelectOrderVoCollection selection)
	{
		this.grid.clear();
		this.grid.setSelectable(false);
				
		if(record == null)
			return;
		
		OrderEntryTemplateColumnVoCollection columns = record.getColumns();
		OrderEntryTemplateComponentShortVoCollection components = record.getComponents();
		
		columns.sort();		
		components.sort();
		
		// adding all rows		
		int rowCount = 0;
		int maxRows = 0;
		for(int x = 0; x < components.size(); x++)
		{			
			OrderEntryTemplateComponentShortVo component = components.get(x);
			if(component.getDividerIsNotNull())
				{
				if(component.getDivider().equals(TemplateDividerType.COLUMNSEPARATOR))
				{
					if(rowCount > maxRows)
						maxRows = rowCount;
					rowCount = 0;
				}				
				else if(component.getDivider().equals(TemplateDividerType.SEPARATOR))
				{
					rowCount++;
				}
			}
			else
				rowCount++;			
		}
		if(rowCount > maxRows)
			maxRows = rowCount;
		
		for(int x = 0; x < maxRows; x++)
		{
			this.grid.getRows().newRow();
		}
		
		int columnIndex = 0;
		int rowIndex = 0;
		DynamicGridColumn[] currentColumns = new DynamicGridColumn[2];		
		
		currentColumns = addColumn(columns.get(columnIndex));		
		columnIndex++;
		
		for(int x = 0; x < components.size(); x++)
		{
			OrderEntryTemplateComponentShortVo component = components.get(x);
			if(component.getDividerIsNotNull())
			{
				if(component.getDivider().equals(TemplateDividerType.COLUMNSEPARATOR))
				{
					currentColumns = addColumn(columns.get(columnIndex));
					columnIndex++;
					rowIndex = 0;
				}
				if(component.getDivider().equals(TemplateDividerType.SEPARATOR))
				{
					addSeparator(columnIndex * 3 - 1, rowIndex, component.getDividerText(), component.getDividerColour(), component.getDividerIsBold());
					rowIndex++;
				}
			}
			else
			{
				addComponent(component, currentColumns[0], currentColumns[1], currentColumns[2], this.grid.getRows().get(rowIndex), selection);
				rowIndex++;
			}
		}
		
		
		if(record.getFormTextIsNotNull() && record.getFormText().trim().length() > 0)
		{
			grid.setFooterMaxHeight(150);
			grid.setFooterValue(record.getFormText());
		}
		else
		{
			grid.setFooterMaxHeight(0);
			grid.setFooterValue(null);
		}
	}
	
	private String escapeAmpersandInTooltip(String tooltip)
	{
		if (tooltip == null)
			return null;

		if (!tooltip.contains("&"))
			return tooltip;

		StringBuilder sb = new StringBuilder(tooltip);

		for (int i = sb.length() - 1; i >= 0; i--) //WDEV-16285
		{
			if (sb.charAt(i) == '&' && i < sb.length() - 1 && sb.charAt(i + 1) != ' ')
			{
				sb.insert(i, " ");
			}
		}
		
		return sb.toString();
	}
	
	void addSeparator(int columnIndex, int rowIndex, String dividerText, Color dividerColour, Boolean dividerIsBold) 
	{
		if(dividerText != null && dividerText.trim().length() > 0)
		{
			String text = dividerText; 
			DynamicGridRow row = grid.getRows().get(rowIndex);
			DynamicGridColumn column = grid.getColumns().get(columnIndex);			
			DynamicGridCell cell = row.getCells().newCell(column, DynamicCellType.HTMLVIEW);
			
			if(dividerColour != null)
			{
				text = "<font color=\"" + dividerColour.getValue() + "\">" + text + "</font>";
			}			
			if(dividerIsBold != null && dividerIsBold.booleanValue())
			{
				text = "<b>" + text + "</b>";
			}
			
			cell.setValue(text);
		}
	}
	protected DynamicGridColumn[] addColumn(OrderEntryTemplateColumnVo column)
	{
		if(column == null || !column.getColNameIsNotNull())
			return null;
		
		DynamicGridColumn[] columns = new DynamicGridColumn[3];
		
		DynamicGridColumn newColumn = this.grid.getColumns().newColumn(" ");
		columns[0] = newColumn;
		newColumn.setWidth(20);
		
		newColumn = this.grid.getColumns().newColumn(" ");
		columns[1] = newColumn;
		newColumn.setWidth(20);
		
		newColumn = this.grid.getColumns().newColumn(column.getColName(), column, true);
		columns[2] = newColumn;
		newColumn.setWidth(200);		
				
		return columns;
	}
		
	protected void addComponent(OrderEntryTemplateComponentShortVo component, DynamicGridColumn checkColumn, DynamicGridColumn imageColumn, DynamicGridColumn textColumn, DynamicGridRow row, SelectedComponentFromSelectOrderVoCollection selection)
	{
		if(component == null)
			return;
		
		Image image = null;
		Object value = null;
		String text = "";
		String tooltip = "";
		String helpTextTooltip = "";
		Color textColor = null;
		SelectedComponentFromSelectOrderVo selectedComponent = new SelectedComponentFromSelectOrderVo(); 
		
		// investigation or profile
		if(component.getInvestigationIsNotNull())
		{		
			value = component;
	
			InvestShortVo investigation = component.getInvestigation();
					
			if(investigation.getInvestigationIndexIsNotNull())
			{
				text = investigation.getInvestigationIndex().getName();
				tooltip = getComponentInvestigationTooltip(investigation);//WDEV-16660
				if(investigation.getInvestigationIndex().getIsProfileIsNotNull() && investigation.getInvestigationIndex().getIsProfile().booleanValue())
				{
					selectedComponent.setID(investigation.getID_Investigation());
					selectedComponent.setComponentType(SelectAndOrderComponentType.PROFILE);
					image = this.profileImage;
				}
				else
				{
					selectedComponent.setID(investigation.getID_Investigation());
					selectedComponent.setComponentType(SelectAndOrderComponentType.INVESTIGATION);
					image = this.investigationImage;
				}
			}	
			
			helpTextTooltip = component.getInvestigation().buildHelpTextTooltip();
			textColor = component.getInvestigation().getColour();
		}		
		// order set
		else if(component.getOrderSetIsNotNull())
		{
			value = component;
			
			//WDEV-11938
			OrderSetForHelpTextVo orderSet = component.getOrderSet();
			selectedComponent.setID(orderSet.getID_OrderSet());
			selectedComponent.setComponentType(SelectAndOrderComponentType.ORDERSET);
			image = this.orderSetImage;
			text = orderSet.getName();			
			tooltip = orderSet.getDescription();
			
			//WDEV-11938 - starts here
			String helpText = orderSet != null ? orderSet.buildHelpTextTooltip() : "";
			
			TreeSet<String> investigationNames = getInvestigationNamesFromOrderSet(orderSet, new TreeSet<String>(), new ArrayList<OrderSetForHelpTextVo>());
			String investigationTooltip = treeSetToString(investigationNames);
			
			helpTextTooltip += helpText != null ? helpText : "";
			
			if(investigationTooltip.length() > 0)
				helpTextTooltip += "<b>Investigations:</b>" + "<br>" + investigationTooltip;
			
			//WDEV-11938 - ends here
			textColor = orderSet.getColor();			
		}
		else if(component.getDivider().equals(TemplateDividerType.SEPARATOR)) 
		{
			text = component.getDividerText();
		}
		
		DynamicGridCell cell = row.getCells().newCell(checkColumn, DynamicCellType.BOOL);		
		cell.setTooltip(escapeAmpersandInTooltip(tooltip));
		cell.setAutoPostBack(true);		
		cell.setValue(new Boolean(selection.indexOf(selectedComponent) >= 0));
		
		cell = row.getCells().newCell(imageColumn, DynamicCellType.IMAGE);
		cell.setTooltip(escapeAmpersandInTooltip(helpTextTooltip));
		cell.setValue(image);
		
		cell = row.getCells().newCell(textColumn, DynamicCellType.LABEL);
		cell.setValue(text);		
		cell.setTooltip(escapeAmpersandInTooltip(tooltip));
		if(textColor != null)
			cell.setTextColor(textColor);
		cell.setIdentifier(value);		
	}
	
	//WDEV-16660
	private String getComponentInvestigationTooltip(InvestShortVo result)
	{
		if (result == null)
			return "";
		
		StringBuilder tooltip = new StringBuilder();
		
		tooltip.append(result.getInvestigationIndex().getDescription());

		if (result.getTurnaroundMeasureIsNotNull() && result.getExpectedTurnaroundIsNotNull())
		{
			tooltip.append(" - Expected Turn Around: ");
			tooltip.append(result.getExpectedTurnaround().toString());
			tooltip.append(" ").append(result.getTurnaroundMeasure().getText());
		}
		else if (result.getProviderServiceIsNotNull() && result.getProviderService().getLocationServiceIsNotNull() && result.getProviderService().getLocationService().getServiceIsNotNull() && result.getProviderService().getLocationService().getService().getExpectedTurnaround() != null)
		{
			tooltip.append(" - Expected Turn Around: ");
			tooltip.append(result.getProviderService().getLocationService().getService().getExpectedTurnaround().toString());
			
			if(result.getProviderService().getLocationService().getService().getTurnaroundMeasure() != null)
				tooltip.append(" ").append(result.getProviderService().getLocationService().getService().getTurnaroundMeasure().getText());
		}
		
		// Amend '&' characters with space not to cause problems in tool tip boxes
		// as these are HTML and '&' is a special character
		for (int i = tooltip.length() - 1; i >= 0; i--)
		{
			if (tooltip.charAt(i) == '&' && i < tooltip.length() - 1 && tooltip.charAt(i + 1) != ' ')
				tooltip.insert(i, " ");
		}
		
		return tooltip.toString();
	}
	
	//WDEV-11938
	private String treeSetToString(TreeSet<String> investigationNames) 
	{
		String colString = "";
		
		if(investigationNames == null)
			return colString;
		
		for(Iterator<String> investigation = investigationNames.iterator(); investigation.hasNext();)
		{
			colString += (colString.length() > 0 ? "<br>" : "") + investigation.next();
		}
		
		return colString;
	}
	
	//WDEV-11938
	private TreeSet<String> getInvestigationNamesFromOrderSet(OrderSetForHelpTextVo orderSet, TreeSet<String> investigationNames, ArrayList<OrderSetForHelpTextVo> visitedOrderSet) 
	{
		if(orderSet == null || orderSet.getComponent() == null || visitedOrderSet.indexOf(orderSet) >=0)
			return investigationNames;
		
		visitedOrderSet.add(orderSet);
		OrderSetComponentForHelpTextVoCollection orderSetComponent = orderSet.getComponent();
		
		for(int i=0; i<orderSetComponent.size(); i++)
		{
			OrderSetComponentForHelpTextVo component = orderSetComponent.get(i);
			
			if(component == null)
				continue;
			
			if(component.getInvestigationIsNotNull() && component.getInvestigation().getInvestigationIndexIsNotNull() && (component.getInvestigation().getInvestigationIndex().getIsProfile() == null || Boolean.FALSE.equals(component.getInvestigation().getInvestigationIndex().getIsProfile())))
				investigationNames.add(component.getInvestigation().getInvestigationIndex().getName() + getTurnaround(component.getInvestigation())); //WDEV-16863
			
			if(component.getInvestigationIsNotNull() && component.getInvestigation().getAssocInvestigationsIsNotNull())
			{
				for(int j=0; j<component.getInvestigation().getAssocInvestigations().size(); j++)
				{
					InvestigationSelectOrderVo investigationChild = component.getInvestigation().getAssocInvestigations().get(j);
					
					if(!investigationChild.getInvestigationIndexIsNotNull())
						continue;
					
					if(investigationChild.getInvestigationIndex().getIsProfile() == null || Boolean.FALSE.equals(investigationChild.getInvestigationIndex().getIsProfile()))
						investigationNames.add(investigationChild.getInvestigationIndex().getName() + getTurnaround(investigationChild)); //WDEV-16863
				}
			}
				
			getInvestigationNamesFromOrderSet(component.getOrderSet(), investigationNames, visitedOrderSet);
		}
		
		return investigationNames;
	}
	
	//WDEV-16863
	private StringBuffer getTurnaround(InvestigationSelectOrderVo investigationSelectOrderVo)
	{
		StringBuffer tooltip = new StringBuffer();
		
		if (investigationSelectOrderVo.getTurnaroundMeasureIsNotNull() && investigationSelectOrderVo.getExpectedTurnaroundIsNotNull())
		{
			tooltip.append(" - Expected Turn Around: ");
			tooltip.append(investigationSelectOrderVo.getExpectedTurnaround().toString());
			tooltip.append(" ").append(investigationSelectOrderVo.getTurnaroundMeasure().getText());
		}
		else if (investigationSelectOrderVo.getProviderServiceIsNotNull() && investigationSelectOrderVo.getProviderService().getLocationServiceIsNotNull() && investigationSelectOrderVo.getProviderService().getLocationService().getServiceIsNotNull() && investigationSelectOrderVo.getProviderService().getLocationService().getService().getExpectedTurnaround() != null)
		{
			tooltip.append(" - Expected Turn Around: ");
			tooltip.append(investigationSelectOrderVo.getProviderService().getLocationService().getService().getExpectedTurnaround().toString());
			
			if(investigationSelectOrderVo.getProviderService().getLocationService().getService().getTurnaroundMeasure() != null)
				tooltip.append(" ").append(investigationSelectOrderVo.getProviderService().getLocationService().getService().getTurnaroundMeasure().getText());
		}
		
		return tooltip;
	}
}
