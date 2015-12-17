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
 * Created on 6 Oct 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.nursing.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import ims.clinical.vo.lookups.PlanOfCareGroupings;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Color;
import ims.framework.utils.DateTime;
import ims.framework.utils.Image;
import ims.nursing.vo.PlanOfCareActionsVo;
import ims.nursing.vo.PlanOfCareActionsVoCollection;
import ims.nursing.vo.PlanOfCareHistoryVo;
import ims.nursing.vo.PlanOfCareHistoryVoCollection;
import ims.nursing.vo.PlanOfCareListVo;
import ims.nursing.vo.PlanOfCareListVoCollection;
import ims.vo.ValueObjectCollection;
import ims.vo.ValueObjectRef;

public class NursingSummaryHelper
{
	private static final Integer	COL_PLAN			= new Integer(0);
	private static final Integer	COL_STARTDATE		= new Integer(1);
	private static final Integer	COL_RESOLVEDDATE	= new Integer(2);
	private static final Integer	COL_URL				= new Integer(3);
	
	private DynamicGrid grid;
	private Image red;
	private Image green;
	private Image yellow;
	private Image link;
	private ValueObjectCollection coll;
	
	public NursingSummaryHelper(DynamicGrid dynGrid, Image red, Image green, Image yellow, Image link, ValueObjectCollection coll)
	{
		this.grid = dynGrid;
		this.red = red;
		this.yellow = yellow;
		this.green = green;
		this.link = link;
		this.coll = coll;
	}
	
	public void displayActionsGroupByPlan(PlanOfCareListVoCollection coll, boolean orderDesc)
	{
		if(grid == null)
			throw new CodingRuntimeException("The grid was not passed down in the constructor !");
		
		clearGrid();
		createGridColumns();
		
		if (orderDesc)
		{
			sortDesc();
		}

		populateGrid(coll);
	}
	
	@SuppressWarnings("unchecked")
	public ValueObjectCollection sortDesc()
	{
		if (coll != null)
		{
			ArrayList collPlans = getArrayList(coll);
			Collections.sort(collPlans, new ActionsComparator());
			copyArrayListIntoColl(coll, collPlans);
			return coll; 
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private void populateGrid(PlanOfCareListVoCollection coll)
	{
		PlanOfCareGroupings group = null;
		String plan = "";
		
		DynamicGridRow groupRow = null;
		DynamicGridRow planRow = null;
		DynamicGridRow actionRow = null;
		
		for (int i = 0; i < coll.size(); i++)
		{
			PlanOfCareListVo poc = coll.get(i);
			
			if(poc.getGroupIsNotNull() && !poc.getGroup().equals(group))
			{
				group = poc.getGroup();
				groupRow = grid.getRows().newRow();
				
				groupRow.setBold(true);
				groupRow.setBackColor(Color.AliceBlue);
				groupRow.setReadOnly(true);
				groupRow.setTextColor(Color.Blue);
				groupRow.setValue(poc.getGroup());
				
				DynamicGridCell cell = groupRow.getCells().newCell(getColumn(COL_PLAN), DynamicCellType.STRING);
				cell.setValue(group.getText());
			}
			
			// plan of care with the same name
			if(poc.getTitleIsNotNull())//&& !poc.getTitle().equals(plan))
			{
				plan = poc.getTitle();
				
				if(poc.getGroup() != null &&
						groupRow != null)
				{
					planRow = groupRow.getRows().newRow();
				}
				else
				{
					planRow = grid.getRows().newRow();
				}

				planRow.setBold(true);
				planRow.setBackColor(Color.Beige);
				planRow.setValue(poc);
						
				if(Color.Red.equals(poc.getLevelOfIntervention()))
				{
					planRow.setExpandedImage(red);
					planRow.setCollapsedImage(red);
				}
				
				else if(Color.Green.equals(poc.getLevelOfIntervention()))
				{
					planRow.setExpandedImage(green);
					planRow.setCollapsedImage(green);
				}
				
				else if(Color.Yellow.equals(poc.getLevelOfIntervention()))
				{
					planRow.setExpandedImage(yellow);
					planRow.setCollapsedImage(yellow);	
				}
				
				DynamicGridCell cell = planRow.getCells().newCell(getColumn(COL_PLAN), DynamicCellType.STRING);
				cell.setValue(plan);
				cell.setReadOnly(true);
				cell = planRow.getCells().newCell(getColumn(COL_STARTDATE), DynamicCellType.STRING);
				cell.setValue(poc.getStartDateTimeIsNotNull() ? poc.getStartDateTime().toString() : "");
				cell.setReadOnly(true);
				cell = planRow.getCells().newCell(getColumn(COL_RESOLVEDDATE), DynamicCellType.STRING);
				cell.setValue(poc.getResolvedDateTimeIsNotNull() ? poc.getResolvedDateTime().toString() : "");
				cell.setReadOnly(true);
				
				if(poc.getAssessmentQuestionIsNotNull() &&
						poc.getAssessmentQuestion().getURLIsNotNull())
				{
					cell = planRow.getCells().newCell(getColumn(COL_URL), DynamicCellType.IMAGEBUTTON);
					cell.setValue(link);
					cell.setTooltip(poc.getAssessmentQuestion().getURL());
					cell.setAutoPostBack(true);
				}
			}
			
			if (poc.getActions() != null)
			{
				PlanOfCareActionsVoCollection actionColl = poc.getActions();
				
				if(actionColl != null)
				{
					ArrayList collActions = getArrayList(actionColl);
					Collections.sort(collActions, new ActionsComparator());
					copyArrayListIntoColl(actionColl, collActions);
				}

				//Fix WDEV-1929:
				if (actionColl != null &&
						planRow != null &&
							actionColl.size() == 0)
				{	
					actionRow = planRow.getRows().newRow();
					DynamicGridCell cell = actionRow.getCells().newCell(getColumn(COL_PLAN), DynamicCellType.STRING);
					String actionTxt = "No actions recorded";
					cell.setValue(actionTxt);		
				}
				
				if (actionColl != null)
				{
					for (int j = 0; j < actionColl.size(); j++) 
					{
						PlanOfCareActionsVo action = actionColl.get(j);
						
						if (planRow != null)
						{
							actionRow = planRow.getRows().newRow();
							actionRow.setReadOnly(true);
							actionRow.setValue(action);
					
							DynamicGridCell cell = actionRow.getCells().newCell(getColumn(COL_PLAN), DynamicCellType.STRING);
							String actionTxt = action.getAuthoringInformation().getAuthoringDateTime().toString(true) + "hrs - " + action.getAction();
							cell.setValue(actionTxt);
					
							if(groupRow != null)
								groupRow.setExpanded(true);
							planRow.setExpanded(true);
						}
					}
				}
			}
		}	
	}
	
	private void createGridColumns()
	{
		DynamicGridColumn column = grid.getColumns().newColumn("Plan of care", COL_PLAN);
		column.setWidth(500);

		column = grid.getColumns().newColumn("Start date", COL_STARTDATE);
		column.setWidth(120);

		column = grid.getColumns().newColumn("Resolved date", COL_RESOLVEDDATE);
		column.setWidth(120);
		
		column = grid.getColumns().newColumn(" ", COL_URL);
		column.setAlignment(Alignment.CENTER);
		column.setWidth(-1);		
	}

	private DynamicGridColumn getColumn(Integer identifier)
	{
		return grid.getColumns().getByIdentifier(identifier);
	}			

	private void clearGrid()
	{
		if(grid != null)
			grid.clear();
	}

	public class ActionsComparator implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			DateTime action1DT = null;
			DateTime action2DT = null;
			
			if(o1 instanceof PlanOfCareActionsVo)
			{
				PlanOfCareActionsVo planOfCareActionsVo = ((PlanOfCareActionsVo)o1);
				action1DT = planOfCareActionsVo.getAuthoringInformationIsNotNull()?planOfCareActionsVo.getAuthoringInformation().getAuthoringDateTime():null;
			}
			
			if(o2 instanceof PlanOfCareActionsVo)
			{
				PlanOfCareActionsVo planOfCareActionsVo = ((PlanOfCareActionsVo)o2);
				action2DT = planOfCareActionsVo.getAuthoringInformationIsNotNull()?planOfCareActionsVo.getAuthoringInformation().getAuthoringDateTime():null;
			}
			
			if(o1 instanceof PlanOfCareHistoryVo)
			{
				PlanOfCareHistoryVo planOfCareHistoryVo = ((PlanOfCareHistoryVo)o1);
				action1DT = planOfCareHistoryVo.getAuthoringInformationIsNotNull()?planOfCareHistoryVo.getAuthoringInformation().getAuthoringDateTime():null;
			}
			
			if(o2 instanceof PlanOfCareHistoryVo)
			{
				PlanOfCareHistoryVo planOfCareHistoryVo = ((PlanOfCareHistoryVo)o2);
				action2DT = planOfCareHistoryVo.getAuthoringInformationIsNotNull()?planOfCareHistoryVo.getAuthoringInformation().getAuthoringDateTime():null;
			}
			
			if(o1 instanceof PlanOfCareListVo)
			{
				PlanOfCareListVo planOfCareListVo = ((PlanOfCareListVo)o1);
				action1DT = planOfCareListVo.getStartDateTimeIsNotNull() ? planOfCareListVo.getStartDateTime() : null;
			}
			
			if(o2 instanceof PlanOfCareListVo)
			{
				PlanOfCareListVo planOfCareListVo = ((PlanOfCareListVo)o2);
				action2DT = planOfCareListVo.getStartDateTimeIsNotNull() ? planOfCareListVo.getStartDateTime() : null;
			}
			
			if(action1DT != null)
				return action1DT.compareTo(action2DT)*-1;
			
			if(action2DT != null)
				return action2DT.compareTo(action1DT)*-1;
						
			return 0;
		}
	}
	
	private ArrayList getArrayList(Object obj)
	{
		ArrayList<ValueObjectRef> list = new ArrayList<ValueObjectRef>();
			
		if (obj instanceof PlanOfCareActionsVoCollection) 
		{
			PlanOfCareActionsVoCollection coll = (PlanOfCareActionsVoCollection)obj;
			for (int i = 0; i < coll.size(); i++)
			{
				list.add(coll.get(i));
			}	
		}
		
		if (obj instanceof PlanOfCareHistoryVoCollection) 
		{
			PlanOfCareHistoryVoCollection coll = (PlanOfCareHistoryVoCollection)obj;
			for (int i = 0; i < coll.size(); i++)
			{
				list.add(coll.get(i));
			}	
		}
		
		if (obj instanceof PlanOfCareListVoCollection) 
		{
			PlanOfCareListVoCollection coll = (PlanOfCareListVoCollection)obj;
			for (int i = 0; i < coll.size(); i++)
			{
				list.add(coll.get(i));
			}	
		}

		return list;
	}
	
	private void copyArrayListIntoColl(Object obj, ArrayList collActions)
	{
		if (obj instanceof PlanOfCareActionsVoCollection) 
		{	
			PlanOfCareActionsVoCollection coll = (PlanOfCareActionsVoCollection)obj;
			coll.clear();
			
			for (int i = 0; collActions  != null && i < collActions.size(); i++)
			{
				coll.add((PlanOfCareActionsVo)collActions.get(i));
			}
		}
		
		if (obj instanceof PlanOfCareHistoryVoCollection) 
		{	
			PlanOfCareHistoryVoCollection coll = (PlanOfCareHistoryVoCollection)obj;
			coll.clear();
			
			for (int i = 0; collActions  != null && i < collActions.size(); i++)
			{
				coll.add((PlanOfCareHistoryVo)collActions.get(i));
			}
		}
		
		if (obj instanceof PlanOfCareListVoCollection) 
		{	
			PlanOfCareListVoCollection coll = (PlanOfCareListVoCollection)obj;
			coll.clear();
			
			for (int i = 0; collActions  != null && i < collActions.size(); i++)
			{
				coll.add((PlanOfCareListVo)collActions.get(i));
			}
		}
	}
}
