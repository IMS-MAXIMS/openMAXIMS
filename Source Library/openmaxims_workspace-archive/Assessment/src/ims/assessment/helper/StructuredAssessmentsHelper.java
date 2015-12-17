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
package ims.assessment.helper;

import java.util.HashMap;
import java.util.Map;

import ims.assessment.configuration.vo.AssessmentQuestionRefVo;
import ims.assessment.configuration.vo.AssessmentQuestionRefVoCollection;
import ims.assessment.vo.AssessmentQuestionRoleVo;
import ims.assessment.vo.AssessmentQuestionRoleVoCollection;
import ims.assessment.vo.AssessmentRoleVo;
import ims.assessment.vo.AssessmentRoleVoCollection;
import ims.assessment.vo.DPPQuestionGroupVo;
import ims.assessment.vo.DPPQuestionGroupVoCollection;
import ims.assessment.vo.UserAssessmentVo;
import ims.clinical.vo.lookups.PlanOfCareGroupings;
import ims.clinical.vo.lookups.PlanOfCareGroupingsCollection;
import ims.core.vo.AnswerOptionVo;
import ims.core.vo.AssessmentQuestionGroupVo;
import ims.core.vo.AssessmentQuestionGroupVoCollection;
import ims.core.vo.AssessmentQuestionVo;
import ims.core.vo.AssessmentQuestionVoCollection;
import ims.core.vo.QuestionAnswerTypeVo;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.PreActiveActiveInactiveStatusCollection;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Color;
import ims.framework.utils.Image;
import ims.framework.UIEngine;

public class StructuredAssessmentsHelper
{
	DynamicGrid	dynGrid			= null;
	DynamicGrid	dynGridDetails	= null;
	int			gridType		= DETAILS_GRID;
	int			viewMode		= -1;
	Image 		imgQuestion		= null;
	PreActiveActiveInactiveStatusCollection activeColl = null;
	PlanOfCareGroupingsCollection 			groupsColl = null;
	HashMap map = null;
	boolean readonlySelect = true;
	AssessmentRoleVoCollection roleVoColl = null;
	UIEngine engine = null;
	boolean displayActive = true;
	Integer roleId = null;
	AssessmentQuestionGroupVoCollection contextHiddenGroups = null;
	DPPQuestionGroupVoCollection voDPPQuestionGroupColl = null;
	
	public static final int	SINGLE_GROUP_NO_FLAT	= 1;
	public static final int	SINGLE_GROUP_FLAT		= 2;
	public static final int	MULTIPLE_GROUP_NO_FLAT	= 3;
	public static final int	MULTIPLE_GROUP_FLAT		= 4;
	
	public static final int DETAILS_GRID 			= 1;
	public static final int ROLES_GRID 				= 2;
	public static final int DPP_GRID 				= 3;
	
	private static final String	COLUMN_QUESTIONGROUP	= "0";
	private static final String	COLUMN_MANDATORY		= "1";
	private static final String	COLUMN_MULTIANSWERS		= "2";
	private static final String	COLUMN_STATUS			= "3";
	private static final String	COLUMN_GROUP			= "4";
	private static final String	COLUMN_SELECT			= "5";
	private static final String	COLUMN_DPPGROUP			= "6";
	
	private static final String CR = "<BR>";
	
	public StructuredAssessmentsHelper(DynamicGrid dynGrid, UIEngine engine, int viewMode, int gridType, Image imgQuestionSmall, PreActiveActiveInactiveStatusCollection activeColl, PlanOfCareGroupingsCollection groupsColl, boolean displayActive, AssessmentQuestionGroupVoCollection contextHiddenGroups)
	{
		this.dynGrid = dynGrid;
		this.engine = engine;
		this.viewMode = viewMode;
		this.gridType = gridType;
		this.imgQuestion = imgQuestionSmall;
		this.activeColl = activeColl;
		this.groupsColl = groupsColl; 
		this.displayActive = displayActive;
		this.contextHiddenGroups = contextHiddenGroups;
	}
	
	public boolean createDynamicGridColumns()
	{
		if(dynGrid == null)
			throw new CodingRuntimeException("Cannot create columns for null dynamic grid");
		boolean createHiddenColumns = false;

		dynGrid.getColumns().clear();
		dynGrid.getRows().clear();
		
		boolean isDetailsGrid = isDetailsGrid();
		boolean isRolesGrid = isRolesGrid();
		boolean isDPPGrid = isDppGrid();

		if (viewMode == SINGLE_GROUP_NO_FLAT)
			return false; // we should not get here

		if (viewMode == SINGLE_GROUP_FLAT)
		{
			DynamicGridColumn newColumn = dynGrid.getColumns().newColumn("Question", COLUMN_QUESTIONGROUP);
			int questionWidth = (isDetailsGrid ? 450 : isDPPGrid? 550 : 220);
			newColumn.setWidth(questionWidth);
			if(isDPPGrid)
			{
				addColumnDppGroup();
			}
			else
			{
				newColumn = dynGrid.getColumns().newColumn("Mandatory", COLUMN_MANDATORY);
				newColumn.setWidth(80);
				newColumn.setAlignment(Alignment.CENTER);
				newColumn = dynGrid.getColumns().newColumn("Multiple Answers", COLUMN_MULTIANSWERS);
				int multiAnsWidth = isDetailsGrid ? 120 : 100; 
				newColumn.setWidth(multiAnsWidth);
				newColumn.setAlignment(Alignment.CENTER);
				newColumn = dynGrid.getColumns().newColumn("Status", COLUMN_STATUS);
				newColumn.setWidth(isDetailsGrid ? -1 : 50);
				if (isRolesGrid)
				{
					addColumnSelect();
				}
			}


			createHiddenColumns = true;
		}
		else if (viewMode == MULTIPLE_GROUP_NO_FLAT)
		{
			DynamicGridColumn newColumn = dynGrid.getColumns().newColumn("Group / Questions", COLUMN_QUESTIONGROUP);
			newColumn.setWidth(isDetailsGrid ? 450 : isDPPGrid ? 550 : 220);
			if(isDPPGrid)
			{
				addColumnDppGroup();
			}
			else
			{
				newColumn = dynGrid.getColumns().newColumn("Mandatory", COLUMN_MANDATORY);
				newColumn.setWidth(80);
				newColumn.setAlignment(Alignment.CENTER);
				newColumn = dynGrid.getColumns().newColumn("Multiple Answers", COLUMN_MULTIANSWERS);
				newColumn.setWidth(isDetailsGrid ? 120 : 100);
				newColumn.setAlignment(Alignment.CENTER);
				newColumn = dynGrid.getColumns().newColumn("Status", COLUMN_STATUS);
				newColumn.setWidth(isDetailsGrid ? -1 : 50);
				if (isRolesGrid)
				{
					addColumnSelect();
				}
			}
		}
		else if (viewMode == MULTIPLE_GROUP_FLAT)
		{
			DynamicGridColumn newColumn = dynGrid.getColumns().newColumn("Question", COLUMN_QUESTIONGROUP);
			// WDEV-724 - changed from 450 to 350
			newColumn.setWidth(isDetailsGrid ? 350 : isDPPGrid ? 150 : 165);
			if(isDPPGrid)
			{
				addColumnDppGroup();				
			}
			else
			{
				newColumn = dynGrid.getColumns().newColumn("Mandatory", COLUMN_MANDATORY);
				newColumn.setWidth(80);
				newColumn.setAlignment(Alignment.CENTER);
				newColumn = dynGrid.getColumns().newColumn("Multiple Answers", COLUMN_MULTIANSWERS);
				newColumn.setWidth(isDetailsGrid ? 120 : 100);
				newColumn.setAlignment(Alignment.CENTER);
				newColumn = dynGrid.getColumns().newColumn("Status", COLUMN_STATUS);
				newColumn.setWidth(isDetailsGrid ? 100 : 60);
				newColumn = dynGrid.getColumns().newColumn("Group", COLUMN_GROUP);
				newColumn.setWidth(isDetailsGrid ? -1 : 50);
				if (isRolesGrid)
				{
					addColumnSelect();
				}
			}
			createHiddenColumns = true;
		}

		return createHiddenColumns;
	}

	public void addColumnSelect()
	{
		DynamicGridColumn newColumn = dynGrid.getColumns().newColumn("Select", COLUMN_SELECT);
		newColumn.setWidth(-1);
		newColumn.setAlignment(Alignment.CENTER);
		newColumn.setHeaderAlignment(Alignment.CENTER);
	}
	
	private void addColumnDppGroup()
	{
		DynamicGridColumn dppGroupColumn = dynGrid.getColumns().newColumn("DPP Group", COLUMN_DPPGROUP);
		dppGroupColumn.setWidth(-1);
	}
	
	public AssessmentQuestionGroupVoCollection populateGrid(UserAssessmentVo assessment)
	{
		return populateGrid(assessment, null);
	}
	public AssessmentQuestionGroupVoCollection populateGrid(UserAssessmentVo assessment, DPPQuestionGroupVoCollection dppQuestionGroupColl)
	{
		this.voDPPQuestionGroupColl = dppQuestionGroupColl;
		if(viewMode == MULTIPLE_GROUP_NO_FLAT)
		{
			populateMultipleGroupsNoFlat(assessment);
		}
		else if(viewMode == SINGLE_GROUP_FLAT)
		{
			populateSingleGroupFlat(assessment);
		}
		else if(viewMode == MULTIPLE_GROUP_FLAT)
		{
			populateMultipleGroupsFlat(assessment);
		}
		return contextHiddenGroups;
	}
	
	private void populateMultipleGroupsNoFlat(UserAssessmentVo assessment)
	{
		for(int i = 0; i < assessment.getQuestionGroups().size(); i++)
		{
			AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(i);
			if(isNotActive(group.getActiveStatus()))
				continue;
						
			DynamicGridRow row = dynGrid.getRows().newRow();
			
			DynamicGridCell cell = row.getCells().newCell(getGridColumn(COLUMN_QUESTIONGROUP), DynamicCellType.STRING);
			cell.setValue(group.getName());
			cell.setReadOnly(true);
			
			row.setValue(group);
			createToolTip(row, getGridColumn(COLUMN_QUESTIONGROUP), getGroupTooltip(group));
			row.setBold(true);
			row.setBackColor(Color.Beige);
			row.setExpanded(false);
			
			for (int j = 0; j < group.getQuestions().size(); j++)
			{
				AssessmentQuestionVo question = group.getQuestions().get(j);

				if(isNotActive(question.getActiveStatus()))
					continue;
				if(question.getQuestionIsNotNull() && isNotActive(question.getQuestion().getStatus()))
					continue;
					
				DynamicGridRow childRow = row.getRows().newRow();

				createRowCells(childRow);

				cell = childRow.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP));
				cell.setValue(question.getQuestionIsNotNull() ? question.getQuestion().getText() : "");
				cell.setTooltip(getQuestionTooltip(question));
								
				if(isDppGrid())
				{
					cell = childRow.getCells().get(getGridColumn(COLUMN_DPPGROUP));
					engine.populate(cell, groupsColl);
					cell.setValue(getDppQuestionGroup(question, assessment));
				}
				else
				{
					engine.populate(childRow.getCells().get(getGridColumn(COLUMN_STATUS)), activeColl);
					cell = childRow.getCells().get(getGridColumn(COLUMN_MANDATORY));
					cell.setValue(question.getIsMandatory());
					cell = childRow.getCells().get(getGridColumn(COLUMN_MULTIANSWERS));
					cell.setValue(question.getAllowsMultipleAnswers());
					cell = childRow.getCells().get(getGridColumn(COLUMN_STATUS));
					cell.setValue(question.getActiveStatus());
				}
				
				childRow.setValue(question);

				childRow.setExpandedImage(imgQuestion);
				childRow.setCollapsedImage(imgQuestion);
			}
		}
	}
	private PlanOfCareGroupings getDppQuestionGroup(AssessmentQuestionVo question, UserAssessmentVo assessment)
	{
		if (isDppGrid())
		{
			for (int i = 0; voDPPQuestionGroupColl != null && i < voDPPQuestionGroupColl.size(); i++)
			{
				DPPQuestionGroupVo voDPPQuestionGroup = voDPPQuestionGroupColl.get(i);
				boolean sameQuestion = voDPPQuestionGroup.getAssessmentQuestionsIsNotNull() && voDPPQuestionGroup.getAssessmentQuestions().indexOf(question) >= 0;
				boolean sameAssessment = voDPPQuestionGroup.getAssessmentQuestionsIsNotNull() && voDPPQuestionGroup.getUserAssessment().equals(assessment);
				if (sameQuestion && sameAssessment)
				{
					return voDPPQuestionGroup.getGroup();
				}
			}
		}

		return null;
	}
	private void createRowCells(DynamicGridRow row)
	{
		if(row == null)
			return;
		
		switch (viewMode)
		{
			case SINGLE_GROUP_FLAT :
			case MULTIPLE_GROUP_NO_FLAT :
				DynamicGridCell cell = row.getCells().newCell(getGridColumn(COLUMN_QUESTIONGROUP), DynamicCellType.STRING);
				cell.setReadOnly(true);
				if(isDppGrid())
				{
					row.getCells().newCell(getGridColumn(COLUMN_DPPGROUP), DynamicCellType.ENUMERATION);
				}
				else
				{
					row.getCells().newCell(getGridColumn(COLUMN_MANDATORY), DynamicCellType.BOOL);
					row.getCells().newCell(getGridColumn(COLUMN_MULTIANSWERS), DynamicCellType.BOOL);
					row.getCells().newCell(getGridColumn(COLUMN_STATUS), DynamicCellType.ANSWER);
					if (isRolesGrid())
					{
						DynamicGridCell selectCell = row.getCells().newCell(getGridColumn(COLUMN_SELECT), DynamicCellType.BOOL);
						selectCell.setAutoPostBack(true);
					}
				}
			break;
			case MULTIPLE_GROUP_FLAT :
				cell = row.getCells().newCell(getGridColumn(COLUMN_QUESTIONGROUP), DynamicCellType.STRING);
				cell.setReadOnly(true);
				if (isDppGrid())
				{
					row.getCells().newCell(getGridColumn(COLUMN_DPPGROUP), DynamicCellType.ENUMERATION);
				}
				else
				{
					row.getCells().newCell(getGridColumn(COLUMN_MANDATORY), DynamicCellType.BOOL);
					row.getCells().newCell(getGridColumn(COLUMN_MULTIANSWERS), DynamicCellType.BOOL);
					row.getCells().newCell(getGridColumn(COLUMN_STATUS), DynamicCellType.ANSWER);
					DynamicGridCell cellGroup = row.getCells().newCell(getGridColumn(COLUMN_GROUP), DynamicCellType.ENUMERATION);
					if(isRolesGrid())
					{
						cellGroup.setReadOnly(true);
						DynamicGridCell selectCell = row.getCells().newCell(getGridColumn(COLUMN_SELECT), DynamicCellType.BOOL);
						selectCell.setAutoPostBack(true);
					}
				}
				
			break;
			default :
			break;
		}
	}
	
	public void addQuestionToGrid(AssessmentQuestionVo assessmentQuestionVo, AssessmentQuestionGroupVoCollection groupColl)
	{
		if(assessmentQuestionVo == null)
			return;
		
		DynamicGridRow row = null;
		switch (viewMode)
		{
			case MULTIPLE_GROUP_NO_FLAT :
				row = dynGrid.getSelectedRow();
				if(row != null)
					row = row.getRows().newRow();
			break;
			case MULTIPLE_GROUP_FLAT :
			case SINGLE_GROUP_FLAT :
				row = dynGrid.getRows().newRow();
			break;
			default :
			break;
		}
		
		createRowCells(row);
		
		row.setValue(assessmentQuestionVo);
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setValue(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getText() : "");
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setTooltip(getQuestionTooltip(assessmentQuestionVo));
		row.getCells().get(getGridColumn(COLUMN_MANDATORY)).setValue(assessmentQuestionVo.getIsMandatory());
		row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS)).setValue(assessmentQuestionVo.getAllowsMultipleAnswers());
		engine.populate(row.getCells().get(getGridColumn(COLUMN_STATUS)), activeColl);
		row.getCells().get(getGridColumn(COLUMN_STATUS)).setValue(PreActiveActiveInactiveStatus.ACTIVE);
		
		if(viewMode == MULTIPLE_GROUP_FLAT)
		{
			DynamicGridCell cell = row.getCells().get(getGridColumn(COLUMN_GROUP));

			for(int i = 0; groupColl != null && i < groupColl.size(); i++)
			{
				cell.getItems().newItem(groupColl.get(i));
			}
		}
		
		if(viewMode == MULTIPLE_GROUP_NO_FLAT)
		{
			row.setExpandedImage(imgQuestion);
			row.setCollapsedImage(imgQuestion);
		}
	}
	
	private void addRoleQuestionToGrid(AssessmentQuestionVo assessmentQuestionVo, DynamicGridRow detailsRow)
	{
		if (assessmentQuestionVo == null)
			return;

		DynamicGridRow row = null;
		switch (viewMode)
		{
			case MULTIPLE_GROUP_NO_FLAT :
				row = dynGrid.getSelectedRow();
				if (row != null)
					row = row.getRows().newRow();
			break;
			case MULTIPLE_GROUP_FLAT :
			case SINGLE_GROUP_FLAT :
				row = dynGrid.getRows().newRow();
			break;
			default :
			break;
		}

		createRowCells(row);

		row.setValue(assessmentQuestionVo);
		DynamicGridCell cellQuestionGroup = row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP));
		cellQuestionGroup.setValue(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getText() : "");
		cellQuestionGroup.setTooltip(getQuestionTooltip(assessmentQuestionVo));
		cellQuestionGroup.setReadOnly(true);

		DynamicGridCell cellMandatory = row.getCells().get(getGridColumn(COLUMN_MANDATORY));
		cellMandatory.setValue(assessmentQuestionVo.getIsMandatory());
		cellMandatory.setReadOnly(true);

		DynamicGridCell cellMultiAnswer = row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS));
		cellMultiAnswer.setValue(assessmentQuestionVo.getAllowsMultipleAnswers());
		cellMultiAnswer.setReadOnly(true);

		engine.populate(row.getCells().get(getGridColumn(COLUMN_STATUS)), activeColl);
		DynamicGridCell cellStatus = row.getCells().get(getGridColumn(COLUMN_STATUS));
		cellStatus.setValue(PreActiveActiveInactiveStatus.ACTIVE);
		cellStatus.setReadOnly(true);

		DynamicGridCell cellSelect = row.getCells().get(getGridColumn(COLUMN_SELECT));
		cellSelect.setValue(isQuestionSelected(assessmentQuestionVo));
		cellSelect.setReadOnly(readonlySelect);

		if (viewMode == MULTIPLE_GROUP_FLAT)
		{
			Object value = detailsRow.getCells().get(getGridColumn(COLUMN_GROUP)).getValue();
			if (value instanceof AssessmentQuestionGroupVo)
			{
				DynamicGridCell cell = row.getCells().get(getGridColumn(COLUMN_GROUP));
				cell.getItems().newItem(value);
				cell.setValue(value);
				cell.setReadOnly(true);
			}
		}

		if (viewMode == MULTIPLE_GROUP_NO_FLAT)
		{
			row.setExpandedImage(imgQuestion);
			row.setCollapsedImage(imgQuestion);
		}
	}
	
	private void populateSingleGroupFlat(UserAssessmentVo assessment)
	{
		AssessmentQuestionGroupVoCollection hiddenGroups = new AssessmentQuestionGroupVoCollection();
		if(assessment.getQuestionGroupsIsNotNull() && assessment.getQuestionGroups().size() > 0)
			hiddenGroups.add(assessment.getQuestionGroups().get(0)); //we should only have 1 item
		
		//TODO - check if the calling context gets updated
		contextHiddenGroups = hiddenGroups;
		
		if(assessment.getQuestionGroups().size() > 0)
		{
			for(int i = 0; i < assessment.getQuestionGroups().get(0).getQuestions().size(); i++)
			{
				AssessmentQuestionVo assessmentQuestionVo = assessment.getQuestionGroups().get(0).getQuestions().get(i);
				if(isNotActive(assessmentQuestionVo.getActiveStatus()))
					continue;
				
				if(assessmentQuestionVo.getQuestionIsNotNull() && isNotActive(assessmentQuestionVo.getQuestion().getStatus()))
					continue;
				
				DynamicGridRow row = dynGrid.getRows().newRow();
				createRowCells(row);
				
				DynamicGridCell cell = row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP));
				cell.setReadOnly(true);
				cell.setValue(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getText() : "");
				cell.setTooltip(getQuestionTooltip(assessmentQuestionVo));
				
				if(isDppGrid())
				{
					cell = row.getCells().get(getGridColumn(COLUMN_DPPGROUP));
					engine.populate(cell, groupsColl);
					cell.setValue(getDppQuestionGroup(assessmentQuestionVo, assessment));
				}
				else
				{
					//engine.populate(row.getCells().get(getGridColumn(COLUMN_STATUS)), ims.core.vo.lookups.LookupHelper.getPreActiveActiveInactiveStatus(this.domain.getLookupService()));
					cell = row.getCells().get(getGridColumn(COLUMN_STATUS));
					for (int j = 0; j < activeColl.size(); j++)
					{
						PreActiveActiveInactiveStatus lkup = activeColl.get(j);
						cell.getItems().newItem(lkup, lkup.getImage());
					}
		
					cell = row.getCells().get(getGridColumn(COLUMN_MANDATORY));
					cell.setValue(assessmentQuestionVo.getIsMandatory());
					cell = row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS));
					cell.setValue(assessmentQuestionVo.getAllowsMultipleAnswers());
					cell = row.getCells().get(getGridColumn(COLUMN_STATUS));
					cell.setValue(assessmentQuestionVo.getActiveStatus());
				}
				
				row.setValue(assessmentQuestionVo);
			}
		}
	}
	
	private void populateMultipleGroupsFlat(UserAssessmentVo assessment)
	{
		AssessmentQuestionVoCollection coll = new AssessmentQuestionVoCollection();

		for(int i = 0; i < assessment.getQuestionGroups().size(); i++)
		{
			AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(i);
			
			for (int j = 0; j < group.getQuestions().size(); j++)
			{
				coll.add(group.getQuestions().get(j));
			}
		}
		
		//TODO - check here as well - or try to do it using reflection
		contextHiddenGroups = assessment.getQuestionGroups();
		
		coll.sort(); //sort the questions by seqno
		
		for(int i = 0; i < coll.size(); i++)
		{
			AssessmentQuestionVo assessmentQuestionVo = coll.get(i);
			if(isNotActive(assessmentQuestionVo.getActiveStatus()))
				continue;

			if(assessmentQuestionVo.getQuestionIsNotNull() && isNotActive(assessmentQuestionVo.getQuestion().getStatus()))
				continue;
			//Do not display a question that has an inactive group
			AssessmentQuestionGroupVo groupValue = getGroupByQuestion(assessmentQuestionVo, assessment);
			if(groupValue != null && isNotActive(groupValue.getActiveStatus()))
				continue;
			DynamicGridRow row = dynGrid.getRows().newRow();
			createRowCells(row);
		
			DynamicGridCell cell = row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP));
			cell.setReadOnly(true);
			cell.setTooltip(getQuestionTooltip(assessmentQuestionVo));
			cell.setValue(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getText() : "");
			
			if(isDppGrid())
			{
				cell = row.getCells().get(getGridColumn(COLUMN_DPPGROUP));
				engine.populate(cell, groupsColl);
				cell.setValue(getDppQuestionGroup(assessmentQuestionVo, assessment));
			}
			else
			{
				cell = row.getCells().get(getGridColumn(COLUMN_STATUS));
				for (int j = 0; j < activeColl.size(); j++)
				{
					PreActiveActiveInactiveStatus lkup = activeColl.get(j);
					cell.getItems().newItem(lkup, lkup.getImage());
				}
				
				//populate groups cell
				cell = row.getCells().get(getGridColumn(COLUMN_GROUP));
				for(int j = 0; j < assessment.getQuestionGroups().size(); j++)
				{
					AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(j);
	
					cell.getItems().newItem(group);
				}
				
				cell = row.getCells().get(getGridColumn(COLUMN_MANDATORY));
				cell.setValue(assessmentQuestionVo.getIsMandatory());
				cell = row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS));
				cell.setValue(assessmentQuestionVo.getAllowsMultipleAnswers());
				cell = row.getCells().get(getGridColumn(COLUMN_STATUS));
				cell.setValue(assessmentQuestionVo.getActiveStatus());
				cell = row.getCells().get(getGridColumn(COLUMN_GROUP));
				cell.setValue(groupValue);
			}
			
			row.setValue(assessmentQuestionVo);
		}
	}
	
	public void updateQuestionInGrid(AssessmentQuestionVo assessmentQuestionVo)
	{
		DynamicGridRow row = dynGrid.getSelectedRow();
	
		if(row == null)
			return;
		
		row.setValue(assessmentQuestionVo);
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setValue(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getText() : "");
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setTooltip(getQuestionTooltip(assessmentQuestionVo));
		row.getCells().get(getGridColumn(COLUMN_MANDATORY)).setValue(assessmentQuestionVo.getIsMandatory());
		row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS)).setValue(assessmentQuestionVo.getAllowsMultipleAnswers());
		engine.populate(row.getCells().get(getGridColumn(COLUMN_STATUS)), activeColl);
	}
	
	public void updateGroupRow(AssessmentQuestionGroupVo group, DynamicGridRow row, boolean createNewQuestionGroupCell)
	{
		if(group == null || row == null)
			return;
		
		if(createNewQuestionGroupCell)
			row.getCells().newCell(getGridColumn(COLUMN_QUESTIONGROUP), DynamicCellType.STRING);
		row.setValue(group);
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setValue(group.getName());
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setReadOnly(true);
		createToolTip(row, getGridColumn(COLUMN_QUESTIONGROUP), getGroupTooltip(group));
		row.setBold(true);
		row.setBackColor(Color.Beige);
		row.setExpanded(true);
		
		dynGrid.setValue(row.getValue());
	}
	
	public void populateQuestionsRoleGrid(DynamicGrid detailsGrid, HashMap map, boolean readOnlySelect, Integer roleId)
	{
		this.dynGridDetails = detailsGrid;
		this.map = map;
		this.readonlySelect = readOnlySelect;
		this.roleId = roleId;
		
		dynGrid.getRows().clear();
		switch (viewMode)
		{
			case MULTIPLE_GROUP_NO_FLAT :
				populateRoleGridFromScreenMultipleGroupNoFlat();
			break;
			case MULTIPLE_GROUP_FLAT :
				populateRoleGridFromScreenMultipleGroupFlat();
			break;
			case SINGLE_GROUP_FLAT :
				populateRoleFromScreenSingleGroupFlat();
			break;
			default :
			break;
		}
	}
	
	private void populateRoleFromScreenSingleGroupFlat()
	{
		for (int i = 0; dynGridDetails != null && i < dynGridDetails.getRows().size(); i++)
		{
			DynamicGridRow row = dynGridDetails.getRows().get(i);

			if (row.getValue() instanceof AssessmentQuestionVo)
			{
				AssessmentQuestionVo value = (AssessmentQuestionVo) row.getValue();
				updateAssessmentQuestionData(row, value);
				addRoleQuestionToGrid(value, row);
			}
		}
	}

	private void populateRoleGridFromScreenMultipleGroupFlat()
	{
		for (int i = 0; dynGridDetails != null && i < dynGridDetails.getRows().size(); i++)
		{
			DynamicGridRow row = dynGridDetails.getRows().get(i);

			if (row.getValue() instanceof AssessmentQuestionVo)
			{
				AssessmentQuestionVo value = (AssessmentQuestionVo) row.getValue();
				updateAssessmentQuestionData(row, value);
				addRoleQuestionToGrid(value, row);
			}
		}
	}

	private void populateRoleGridFromScreenMultipleGroupNoFlat()
	{
		for (int i = 0; dynGridDetails != null && i < dynGridDetails.getRows().size(); i++)
		{
			DynamicGridRow rowDetails = dynGridDetails.getRows().get(i);
			DynamicGridRow roleRow = null;
			if (rowDetails.getValue() instanceof AssessmentQuestionGroupVo)
			{
				roleRow = dynGrid.getRows().newRow();
				roleRow.getCells().newCell(getGridColumn(COLUMN_QUESTIONGROUP), DynamicCellType.STRING);
				updateQuestionGroupRow((AssessmentQuestionGroupVo) rowDetails.getValue(), roleRow);
			}

			if (roleRow != null)
			{
				for (int j = 0; j < rowDetails.getRows().size(); j++)
				{
					DynamicGridRow childRow = rowDetails.getRows().get(j);
					if (childRow.getValue() instanceof AssessmentQuestionVo)
					{
						AssessmentQuestionVo value = (AssessmentQuestionVo) childRow.getValue();
						updateAssessmentQuestionData(childRow, value);
						addRoleQuestionToGrid(value, childRow);
					}
				}
			}
		}
	}
	
	private void updateAssessmentQuestionData(DynamicGridRow row, AssessmentQuestionVo value)
	{
		value.setIsMandatory((Boolean) row.getCells().get(getGridColumn(dynGridDetails, COLUMN_MANDATORY)).getValue());
		value.setAllowsMultipleAnswers((Boolean) row.getCells().get(getGridColumn(dynGridDetails, COLUMN_MULTIANSWERS)).getValue());
	}

	public void updateQuestionGroupRow(AssessmentQuestionGroupVo group, DynamicGridRow row)
	{
		row.setValue(group);
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setValue(group.getName());
		row.getCells().get(getGridColumn(COLUMN_QUESTIONGROUP)).setReadOnly(true);
		createToolTip(row, getGridColumn(COLUMN_QUESTIONGROUP), getGroupTooltip(group));
		row.setBold(true);
		row.setBackColor(Color.Beige);
		row.setExpanded(true);

		dynGrid.setValue(row.getValue());
	}
	
	public boolean populateDataFromDynGrid(UserAssessmentVo assessment, AssessmentRoleVoCollection roleColl, HashMap assessmentRoleMap, String assessmentName)
	{
		this.roleVoColl = roleColl;
		return populateDataFromGrid(assessment, assessmentRoleMap, assessmentName);
	}
	
	public boolean populateDataFromDynGrid(UserAssessmentVo voUserAssessment, DPPQuestionGroupVoCollection questionGroups)
	{
		this.voDPPQuestionGroupColl = questionGroups;
		return populateDataFromGrid(voUserAssessment, null, null);
	}
	
	/*public DPPQuestionGroupVoCollection addOrRemoveQuestionFromGroup(DynamicGridCell cell, UserAssessmentVo userAssessment, DPPQuestionGroupVoCollection collection)
	{
		if(cell == null)
			return voDPPQuestionGroupColl;
		
		this.voDPPQuestionGroupColl = collection;
		
		DynamicGridRow row = cell.getRow();
		if(row.getValue() instanceof AssessmentQuestionVo)
		{
			AssessmentQuestionVo voAssQuestion = (AssessmentQuestionVo) row.getValue();
			if(cell.getValue() != null)
				updateDppVoCollection(userAssessment, voAssQuestion, row);
			else
				removeAssessmentQuestion(userAssessment, voAssQuestion);
		}
		
		return voDPPQuestionGroupColl;
	}*/	
	private boolean populateDataFromGrid(UserAssessmentVo assessment, HashMap assessmentRoleMap, String assessmentName)
	{
		boolean bRet = false;
		
		switch (viewMode)
		{
			case MULTIPLE_GROUP_NO_FLAT :
				bRet = populateGroupCollectionFromScreenMultipleGroupNoFlat(assessment, assessmentRoleMap);
			break;
			case MULTIPLE_GROUP_FLAT :
				bRet = populateGroupCollectionFromScreenMultipleGroupFlat(assessment, assessmentRoleMap);
			break;
			case SINGLE_GROUP_FLAT :
				bRet = populateGroupCollectionFromScreenSingleGroupFlat(assessment, assessmentRoleMap, assessmentName);
			break;
			default :
			break;
		}
		return bRet;
	}

				
	private boolean populateGroupCollectionFromScreenSingleGroupFlat(UserAssessmentVo assessment, HashMap assessmentRoleMap, String assessmentName)
	{
		AssessmentQuestionGroupVo hiddenGroup = null;
		
		if(contextHiddenGroups != null && contextHiddenGroups.size() > 0)
			hiddenGroup = contextHiddenGroups.get(0);
		else
			hiddenGroup = new AssessmentQuestionGroupVo();
		
		if(assessment.getQuestionGroups() == null)
		{
			assessment.setQuestionGroups(new AssessmentQuestionGroupVoCollection());
		}

		assessment.getQuestionGroups().add(hiddenGroup);
		
		if(hiddenGroup.getQuestions() == null)
			hiddenGroup.setQuestions(new AssessmentQuestionVoCollection());
		else
			hiddenGroup.getQuestions().clear();
		
		int seqNo = 1;
		for(int i = 0; i < dynGrid.getRows().size(); i++)
		{
			DynamicGridRow row = dynGrid.getRows().get(i);
			
			if(row.getValue() instanceof AssessmentQuestionVo)
			{
				AssessmentQuestionVo value = (AssessmentQuestionVo) row.getValue();
				value.setIsMandatory((Boolean) row.getCells().get(getGridColumn(COLUMN_MANDATORY)).getValue());
				if(value.getIsMandatory() == null)
					value.setIsMandatory(Boolean.FALSE);
				value.setAllowsMultipleAnswers((Boolean) row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS)).getValue());
				if(value.getAllowsMultipleAnswers() == null)
					value.setAllowsMultipleAnswers(Boolean.FALSE);
				value.setActiveStatus( (PreActiveActiveInactiveStatus) row.getCells().get(getGridColumn(COLUMN_STATUS)).getValue());
				value.setSequence(new Integer(seqNo++));
				value.setAssessmentAnswerRole(getQuestionRole(value, assessmentRoleMap));
				hiddenGroup.getQuestions().add(value);
			}
		}
		
		hiddenGroup.setName(assessmentName);
		hiddenGroup.setActiveStatus(PreActiveActiveInactiveStatus.ACTIVE);
		
		return true;
	}
	private boolean populateGroupCollectionFromScreenMultipleGroupFlat(UserAssessmentVo assessment, HashMap assessmentRoleMap)
	{
		int seqNo = 1;
		Map prevAssoc = new HashMap();

		//remove all questions from the groups
		for (int i = 0; i < assessment.getQuestionGroups().size(); i++)
		{
			AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(i);
			
			if(group.getQuestionsIsNotNull())
			{
				//save the old association group <==> question
				for (int j = 0; j < group.getQuestions().size(); j++)
				{
					prevAssoc.put(group.getQuestions().get(j), group);
				}
				
				group.getQuestions().clear();
			}
		}
		
		for(int i = 0; i < dynGrid.getRows().size(); i++)
		{
			DynamicGridRow row = dynGrid.getRows().get(i);

			if(row.getValue() instanceof AssessmentQuestionVo)
			{
				AssessmentQuestionVo value = (AssessmentQuestionVo) row.getValue();
				value.setIsMandatory((Boolean) row.getCells().get(getGridColumn(COLUMN_MANDATORY)).getValue());
				if(value.getIsMandatory() == null)
					value.setIsMandatory(Boolean.FALSE);
				value.setAllowsMultipleAnswers((Boolean) row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS)).getValue());
				if(value.getAllowsMultipleAnswers() == null)
					value.setAllowsMultipleAnswers(Boolean.FALSE);
				value.setActiveStatus( (PreActiveActiveInactiveStatus) row.getCells().get(getGridColumn(COLUMN_STATUS)).getValue());
				value.setSequence(new Integer(seqNo++));
				value.setAssessmentAnswerRole(getQuestionRole(value, assessmentRoleMap));
				
				AssessmentQuestionGroupVo questionGroup = (AssessmentQuestionGroupVo)row.getCells().get(getGridColumn(COLUMN_GROUP)).getValue();
				
				if(questionGroup == null)
				{
					engine.showMessage("Every question must belong to a group, please select one !");
					return false;
				}
				
				boolean bFound = false;
				for (int j = 0; j < assessment.getQuestionGroups().size(); j++)
				{
					AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(j);
					
					//compare instances
					if(group == questionGroup)
					{
						if(group.getQuestions() == null)
							group.setQuestions(new AssessmentQuestionVoCollection());
						
						group.getQuestions().add(value);
						bFound = true;
						break;
					}
				}
				
				if(bFound == false)
				{
					if(questionGroup.getQuestions() == null)
						questionGroup.setQuestions(new AssessmentQuestionVoCollection());

					questionGroup.getQuestions().add(value);
					assessment.getQuestionGroups().add(questionGroup);
				}
			}
		}

		//if a question has got a new parent, we reset the question id to avoid a conflict
		//(org.hibernate.ObjectDeletedException: deleted object would be re-saved by cascade (remove deleted object from associations):)
		for (int i = 0; i < assessment.getQuestionGroups().size(); i++)
		{
			AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(i);
			
			if(group.getQuestionsIsNotNull())
			{
				for (int j = 0; j < group.getQuestions().size(); j++)
				{
					AssessmentQuestionVo q = group.getQuestions().get(j);
					AssessmentQuestionGroupVo g = (AssessmentQuestionGroupVo) prevAssoc.get(q);
					
					if(g != group)
						q.setID_AssessmentQuestion(null); //this question will be deleted from database and reinserted with a new id
				}
			}
		}
		
		return true;
	}
	private boolean populateGroupCollectionFromScreenMultipleGroupNoFlat(UserAssessmentVo assessment, HashMap assessmentRoleMap)
	{
		assessment.getQuestionGroups().clear();
		int seqNo = 1;
		for(int i = 0; i < dynGrid.getRows().size(); i++)
		{
			DynamicGridRow row = dynGrid.getRows().get(i);
			
			AssessmentQuestionGroupVo assessmentQuestionGroupVo = (AssessmentQuestionGroupVo) row.getValue();
			if(assessmentQuestionGroupVo.getQuestionsIsNotNull())
				assessmentQuestionGroupVo.getQuestions().clear();
			else
				assessmentQuestionGroupVo.setQuestions(new AssessmentQuestionVoCollection());
			
			for (int j = 0; j < row.getRows().size(); j++)
			{
				DynamicGridRow childRow = row.getRows().get(j);
				
				if(childRow.getValue() instanceof AssessmentQuestionVo)
				{
					AssessmentQuestionVo value = (AssessmentQuestionVo) childRow.getValue();
					value.setIsMandatory((Boolean) childRow.getCells().get(getGridColumn(COLUMN_MANDATORY)).getValue());
					if(value.getIsMandatory() == null)
						value.setIsMandatory(Boolean.FALSE);
					value.setAllowsMultipleAnswers((Boolean) childRow.getCells().get(getGridColumn(COLUMN_MULTIANSWERS)).getValue());
					if(value.getAllowsMultipleAnswers() == null)
						value.setAllowsMultipleAnswers(Boolean.FALSE);
					value.setActiveStatus( (PreActiveActiveInactiveStatus) childRow.getCells().get(getGridColumn(COLUMN_STATUS)).getValue());
					value.setSequence(new Integer(seqNo++));
					value.setAssessmentAnswerRole(getQuestionRole(value, assessmentRoleMap));
					assessmentQuestionGroupVo.getQuestions().add(value);
					if(isDppGrid())
					{
						updateDppVoCollection(assessment, value, childRow);
					}
				}
			}
			
			if(assessment.getQuestionGroups().contains(assessmentQuestionGroupVo) == false)
				assessment.getQuestionGroups().add(assessmentQuestionGroupVo);
		}
		
		return true;
	}
	
	private void updateDppVoCollection(UserAssessmentVo assessment, AssessmentQuestionVo assessmentQuestion, DynamicGridRow row)
	{
		if(assessment == null || assessmentQuestion == null || row == null)
			return;
	
		DynamicGridColumn groupCol = getGridColumn(COLUMN_DPPGROUP);
		if(groupCol != null)
		{
			DynamicGridCell cell = row.getCells().get(groupCol);
			if(cell != null && cell.getValue() instanceof PlanOfCareGroupings)
			{
				PlanOfCareGroupings group = (PlanOfCareGroupings) cell.getValue();
				updateDppVoCollection(assessment, assessmentQuestion, group);
			}
		}
	}
	
	private void updateDppVoCollection(UserAssessmentVo assessment, AssessmentQuestionVo assessmentQuestion, PlanOfCareGroupings group)
	{
		if (voDPPQuestionGroupColl == null)
			voDPPQuestionGroupColl = new DPPQuestionGroupVoCollection();

		boolean assessmentFound = false;
		for (int i = 0; voDPPQuestionGroupColl != null && i < voDPPQuestionGroupColl.size(); i++)
		{
			DPPQuestionGroupVo voDppGroup = voDPPQuestionGroupColl.get(i);
			boolean sameAssessment = voDppGroup.getUserAssessmentIsNotNull() && voDppGroup.getUserAssessment().equals(assessment);
			boolean sameGroup 	   = voDppGroup.getGroupIsNotNull() && voDppGroup.getGroup().equals(group);
			if (sameAssessment && sameGroup)
			{
				AssessmentQuestionRefVoCollection assQuestionColl = voDppGroup.getAssessmentQuestions();
				if(assQuestionColl == null)
					assQuestionColl = new AssessmentQuestionRefVoCollection();
				int index = assQuestionColl.indexOf(assessmentQuestion);
				if(index < 0)
				{
					assQuestionColl.add(assessmentQuestion);
					voDppGroup.setAssessmentQuestions(assQuestionColl);
					voDPPQuestionGroupColl.set(i, voDppGroup);
					
					assessmentFound = true;
					break;
				}
			}
		}
		
		if(assessmentFound == false)
		{
			DPPQuestionGroupVo voDppGroup = new DPPQuestionGroupVo();
			voDppGroup.setUserAssessment(assessment);
			voDppGroup.setAssessmentQuestions(new AssessmentQuestionRefVoCollection());
			voDppGroup.getAssessmentQuestions().add(assessmentQuestion);
			voDppGroup.setGroup(group);
			voDPPQuestionGroupColl.add(voDppGroup);
		}
	}
	
	/*private boolean removeAssessmentQuestion(UserAssessmentVo userAssessment, AssessmentQuestionVo voAssQuestion)
	{
		for (int i = 0; voDPPQuestionGroupColl != null && i < voDPPQuestionGroupColl.size(); i++)
		{
			DPPQuestionGroupVo voDppGroup = voDPPQuestionGroupColl.get(i);
			boolean sameAssessment = voDppGroup.getUserAssessmentIsNotNull() && voDppGroup.getUserAssessment().equals(userAssessment);
			if (sameAssessment)
			{
				AssessmentQuestionVoCollection assQuestionColl = voDppGroup.getAssessmentQuestions();
				if(assQuestionColl != null)
				{
					int index = assQuestionColl.indexOf(voAssQuestion);
					if(index >= 0)
					{
						assQuestionColl.remove(voAssQuestion);
						voDppGroup.setAssessmentQuestions(assQuestionColl);
						voDPPQuestionGroupColl.set(i, voDppGroup);
						
						return true;
					}
				}
			}
		}
		
		return false;
	}
*/
	public AssessmentQuestionVo updateAssessmentQuestionVoFromRowData(DynamicGridRow row)
	{
		if (row == null)
			return null;
		AssessmentQuestionVo value = (AssessmentQuestionVo) row.getValue();
		value.setIsMandatory((Boolean) row.getCells().get(getGridColumn(COLUMN_MANDATORY)).getValue());
		if (value.getIsMandatory() == null)
			value.setIsMandatory(Boolean.FALSE);
		value.setAllowsMultipleAnswers((Boolean) row.getCells().get(getGridColumn(COLUMN_MULTIANSWERS)).getValue());
		if (value.getAllowsMultipleAnswers() == null)
			value.setAllowsMultipleAnswers(Boolean.FALSE);
		value.setActiveStatus((PreActiveActiveInactiveStatus) row.getCells().get(getGridColumn(COLUMN_STATUS)).getValue());
		return value;
	}

	public void addGroupToGroupCombos(AssessmentQuestionGroupVo group)
	{
		for (int i = 0; i < dynGrid.getRows().size(); i++)
		{
			DynamicGridRow row = dynGrid.getRows().get(i);
			DynamicGridCell cell = row.getCells().get(getGridColumn(COLUMN_GROUP));

			cell.getItems().newItem(group);
		}
	}
	
	private AssessmentQuestionGroupVo getGroupByQuestion(AssessmentQuestionVo assessmentQuestionVo, UserAssessmentVo assessment)
	{
		for(int i = 0; i < assessment.getQuestionGroups().size(); i++)
		{
			AssessmentQuestionGroupVo group = assessment.getQuestionGroups().get(i);
			
			for (int j = 0; j < group.getQuestions().size(); j++)
			{
				if(group.getQuestions().get(j).getID_AssessmentQuestionIsNotNull() && group.getQuestions().get(j).getID_AssessmentQuestion().equals(assessmentQuestionVo.getID_AssessmentQuestion()))
					return group;
			}
		}
		
		return null;
	}

	private String getGroupTooltip(AssessmentQuestionGroupVo group)
	{
		StringBuffer sb = new StringBuffer();

		sb.append("<b>Name: </b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		sb.append(group.getName());
		sb.append(CR);
		sb.append("<b>Description: </b>&nbsp;");
		sb.append(group.getDescription());
		sb.append(CR);
		sb.append("<b>Status: </b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		sb.append(group.getActiveStatusIsNotNull() ? group.getActiveStatus().getText() : "");
		sb.append(CR);
		sb.append("<b>Score:</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		sb.append(group.getGroupScoreIsNotNull() ? group.getGroupScore().toString() : "");

		return sb.toString();
	}

	private void createToolTip(DynamicGridRow row, DynamicGridColumn column, String tooltip)
	{
		row.getCells().get(column).setTooltip(tooltip);
	}
	
	private AssessmentQuestionRoleVoCollection getQuestionRole(AssessmentQuestionVo voAssessmentQuestion, HashMap assessmentRoleMap)
	{
		if (assessmentRoleMap == null)
			return null;

		AssessmentQuestionRoleVoCollection voColl = new AssessmentQuestionRoleVoCollection();

		for (int i = 0; roleVoColl != null && i < roleVoColl.size(); i++)
		{
			AssessmentRoleVo voAssessRole = roleVoColl.get(i);
			if (voAssessRole.getAnswerAllIsNotNull() && voAssessRole.getAnswerAll().booleanValue() == false)
			{
				AssessmentQuestionVoCollection voAssQColl = (AssessmentQuestionVoCollection) assessmentRoleMap.get(voAssessRole.getAppRole().getID_AppRole());
				if (voAssQColl != null)
				{
					if (voAssQColl.indexOf(voAssessmentQuestion) >= 0)
					{
						AssessmentQuestionRoleVo voAssessQuestionRole = new AssessmentQuestionRoleVo();
						voAssessQuestionRole.setAppRole(voAssessRole.getAppRole());
						voColl.add(voAssessQuestionRole);
					}
				}
			}
		}

		return voColl;
	}
	
	private String getQuestionTooltip(AssessmentQuestionVo assessmentQuestionVo)
	{
		if(assessmentQuestionVo == null)
			return "";
		
		StringBuffer sb = new StringBuffer();
		
		if(assessmentQuestionVo.getQuestionIsNotNull())
		{
			sb.append("<b>Short text: &nbsp;</b>");
			sb.append(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getShortText() : "");
			sb.append(CR);
			sb.append("<b>Text: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>");
			sb.append(assessmentQuestionVo.getQuestionIsNotNull() ? assessmentQuestionVo.getQuestion().getText() : "");
			sb.append(CR);
		}
		
		if(assessmentQuestionVo.getQuestionIsNotNull() && assessmentQuestionVo.getQuestion().getAnswerTypesIsNotNull())
		{
			sb.append("<b>Status: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b>");
			sb.append(assessmentQuestionVo.getQuestion().getStatusIsNotNull() ? assessmentQuestionVo.getQuestion().getStatus().toString() : "");
			sb.append(CR);
			
			sb.append("<b>Answer Types: &nbsp;&nbsp;</b>");
			for (int i = 0; i < assessmentQuestionVo.getQuestion().getAnswerTypes().size(); i++)
			{
				QuestionAnswerTypeVo answerType = assessmentQuestionVo.getQuestion().getAnswerTypes().get(i);
				if(answerType.getActiveStatusIsNotNull() && answerType.getActiveStatus().booleanValue())
				{
					sb.append(CR);
					sb.append("&nbsp;&nbsp;&nbsp;");
					sb.append(i+1);
					sb.append(")");
					sb.append("&nbsp;&nbsp;");
					sb.append(answerType.getAnswerType().getText());
					String separator = answerType.getAnswerTypeIsNotNull() && answerType.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR)?" - " + answerType.getSeparatorText():"";
					sb.append(separator);
					if(answerType.getOptionsIsNotNull())
					{
						for (int j = 0; j < answerType.getOptions().size(); j++)
						{
							AnswerOptionVo option = answerType.getOptions().get(j);
							sb.append(CR);
							sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;->&nbsp;");
							sb.append(option.getOptionText());
							
							if(option.getScoreIsNotNull())
							{
								sb.append("&nbsp;&nbsp; (Score: ");
								sb.append(option.getScore().toString());
								sb.append(")");
							}
						}
					}
					sb.append("</li>");
				}
			}
		}
		return sb.toString();
	}
	
	private Boolean isQuestionSelected(AssessmentQuestionVo assessmentQuestionVo)
	{
		if (map == null || roleId == null)
			return Boolean.FALSE;

		AssessmentQuestionVoCollection voAssQColl = (AssessmentQuestionVoCollection) map.get(roleId);
		if (voAssQColl != null)
		{
			int index = voAssQColl.indexOf(assessmentQuestionVo);
			if (index >= 0)
				return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}
	
	private DynamicGridColumn getGridColumn(String identifier)
	{
		return dynGrid.getColumns().getByIdentifier(identifier);
	}
	
	private DynamicGridColumn getGridColumn(DynamicGrid grid, String identifier)
	{
		return grid.getColumns().getByIdentifier(identifier);
	}
	
	private boolean isNotActive(PreActiveActiveInactiveStatus activeStatus)
	{
		return displayActive && activeStatus != null && !activeStatus.equals(PreActiveActiveInactiveStatus.ACTIVE);
	}
	
	private boolean isDppGrid()
	{
		boolean isDPPGrid = gridType == DPP_GRID;
		return isDPPGrid;
	}

	private boolean isRolesGrid()
	{
		boolean isRolesGrid = gridType == ROLES_GRID;
		return isRolesGrid;
	}

	private boolean isDetailsGrid()
	{
		boolean isDetailsGrid = gridType == DETAILS_GRID;
		return isDetailsGrid;
	}

	public DPPQuestionGroupVoCollection getDPPQuestionGroupVoCollection()
	{
		return voDPPQuestionGroupColl;
	}

	public DPPQuestionGroupVoCollection getDataFromGrid(DPPQuestionGroupVoCollection voDPPQuestionsGroupColl, UserAssessmentVo userAssessmentVo)
	{
		if (voDPPQuestionsGroupColl == null)
			voDPPQuestionsGroupColl = new DPPQuestionGroupVoCollection();

		// 1. Remove all Assessment Questions - they will be readded later
		for (int i = 0; i < voDPPQuestionsGroupColl.size(); i++)
		{
			voDPPQuestionsGroupColl.get(i).setAssessmentQuestions(new AssessmentQuestionRefVoCollection());
		}

		// 2. Add the existing - if the DPPQuestionGroupVo record doesn't exists then create one
		for (int i = 0; i < dynGrid.getRows().size(); i++)
		{
			DynamicGridRow row = dynGrid.getRows().get(i);
			if (viewMode == StructuredAssessmentsHelper.MULTIPLE_GROUP_NO_FLAT)
			{
				for (int j = 0; j < row.getRows().size(); j++)
				{
					DynamicGridRow rowChild = row.getRows().get(j);
					PlanOfCareGroupings group = getGroup(rowChild);
					AssessmentQuestionRefVo assessmentQuestion = getAssessmentQuestion(rowChild);
				
					voDPPQuestionsGroupColl = setGroupDataIntoDppQuestion(voDPPQuestionsGroupColl, userAssessmentVo, group, assessmentQuestion);
				}
			}
			else
			{
				PlanOfCareGroupings group = getGroup(row);
				AssessmentQuestionRefVo assessmentQuestion = getAssessmentQuestion(row);
				
				voDPPQuestionsGroupColl = setGroupDataIntoDppQuestion(voDPPQuestionsGroupColl, userAssessmentVo, group, assessmentQuestion);
			}
		}


		// 3 3.can through all the records and make inactive the ones that don't have questions 
		for (int i = 0; i < voDPPQuestionsGroupColl.size(); i++)
		{
			if(voDPPQuestionsGroupColl.get(i).getAssessmentQuestions() != null && voDPPQuestionsGroupColl.get(i).getAssessmentQuestions().size() == 0)
				voDPPQuestionsGroupColl.get(i).setIsActive(Boolean.FALSE);
				
		}

		return voDPPQuestionsGroupColl;
	}

	/**
	 * @param rowChild
	 * @return
	 */
	private AssessmentQuestionRefVo getAssessmentQuestion(DynamicGridRow rowChild)
	{
		AssessmentQuestionRefVo assessmentQuestion = null;
		if (rowChild.getValue() instanceof AssessmentQuestionVo)
			assessmentQuestion = (AssessmentQuestionRefVo) rowChild.getValue();
		if(assessmentQuestion != null)
			assessmentQuestion = assessmentQuestion.toAssessmentQuestionRefVo();
		return assessmentQuestion;
	}

	private DPPQuestionGroupVoCollection setGroupDataIntoDppQuestion(DPPQuestionGroupVoCollection voDPPQuestionsGroupColl, UserAssessmentVo userAssessmentVo, PlanOfCareGroupings group, AssessmentQuestionRefVo assessmentQuestion)
	{
		if (group != null && assessmentQuestion != null)
		{
			DPPQuestionGroupVo voDppQuestionGroup = null;
			for (int i = 0; i < voDPPQuestionsGroupColl.size(); i++)
			{
				DPPQuestionGroupVo voDPPQGroup = voDPPQuestionsGroupColl.get(i);
				boolean sameAssessment = voDPPQGroup.getUserAssessmentIsNotNull() && voDPPQGroup.getUserAssessment().equals(userAssessmentVo);
				boolean sameGroup = voDPPQGroup.getGroupIsNotNull() && voDPPQGroup.getGroup().equals(group);
				if (sameAssessment && sameGroup)
				{
					voDppQuestionGroup = voDPPQGroup;
					break;
				}
			}
			if (voDppQuestionGroup == null)
			{
				voDppQuestionGroup = new DPPQuestionGroupVo();
			}

			// Populate common data
			voDppQuestionGroup.setGroup(group);
			voDppQuestionGroup.setUserAssessment(userAssessmentVo);
			voDppQuestionGroup.setIsActive(Boolean.TRUE);

			if (voDppQuestionGroup.getAssessmentQuestions() == null)
				voDppQuestionGroup.setAssessmentQuestions(new AssessmentQuestionRefVoCollection());

			int indexQuestion = voDppQuestionGroup.getAssessmentQuestions().indexOf(assessmentQuestion);
			if (indexQuestion < 0)
				voDppQuestionGroup.getAssessmentQuestions().add(assessmentQuestion);
			else
				voDppQuestionGroup.getAssessmentQuestions().set(indexQuestion, assessmentQuestion);

			int indexDpp = voDPPQuestionsGroupColl.indexOf(voDppQuestionGroup);
			if (indexDpp < 0)
				voDPPQuestionsGroupColl.add(voDppQuestionGroup);
			else
				voDPPQuestionsGroupColl.set(indexDpp, voDppQuestionGroup);
		}

		return voDPPQuestionsGroupColl;
	}

	private PlanOfCareGroupings getGroup(DynamicGridRow rowChild)
	{
		DynamicGridColumn groupCol = getGridColumn(COLUMN_DPPGROUP);
		if(groupCol != null)
		{
			DynamicGridCell cell = rowChild.getCells().get(groupCol);
			if(cell != null && cell.getValue() instanceof PlanOfCareGroupings)
			{
				PlanOfCareGroupings group = (PlanOfCareGroupings) cell.getValue();
				return group;
			}
		}
		
		return null;
	}
}
