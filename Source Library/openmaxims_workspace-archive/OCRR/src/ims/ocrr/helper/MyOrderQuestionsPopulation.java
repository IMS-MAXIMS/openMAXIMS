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

import ims.admin.vo.lookups.GenderSpecific;
import ims.assessment.helper.UserAssessmentInstHelper.AnswerCellData;
import ims.assessment.vo.PatientAssessmentAnswerVo;
import ims.assessment.vo.PatientAssessmentAnswerVoCollection;
import ims.core.vo.AnswerDetailsVo;
import ims.core.vo.AnswerDetailsVoCollection;
import ims.core.vo.AnswerOptionVo;
import ims.core.vo.AnswerOptionVoCollection;
import ims.core.vo.GeneralQuestionAnswerVo;
import ims.core.vo.GeneralQuestionAnswerVoCollection;
import ims.core.vo.QuestionAnswerTypeVo;
import ims.core.vo.QuestionInformationShortVo;
import ims.core.vo.ServiceLiteVo;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.QuestionAnswerType;
import ims.core.vo.lookups.ServiceCategory;
import ims.core.vo.lookups.Sex;
import ims.framework.EnhancedItem;
import ims.framework.UIEngine;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridCellItem;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DynamicCellDecoratorMode;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.Date;
import ims.framework.utils.Image;
import ims.framework.utils.PartialDate;
import ims.framework.utils.Time;
import ims.ocrr.configuration.vo.InvestigationRefVo;
import ims.ocrr.vo.CategoryQuestionAnswerVo;
import ims.ocrr.vo.CategoryQuestionAnswerVoCollection;
import ims.ocrr.vo.CategoryQuestionShortVo;
import ims.ocrr.vo.CategoryQuestionShortVoCollection;
import ims.ocrr.vo.InvestigationLiteVoCollection;
import ims.ocrr.vo.InvestigationOcsQuestionsVo;
import ims.ocrr.vo.InvestigationOcsQuestionsVoCollection;
import ims.ocrr.vo.InvestigationQuestionAnswerVo;
import ims.ocrr.vo.InvestigationQuestionAnswerVoCollection;
import ims.ocrr.vo.InvestigationQuestionShortVo;
import ims.ocrr.vo.OcsQASessionVo;
import ims.ocrr.vo.QuestionTooltipVoCollection;
import ims.ocrr.vo.ServiceQuestionAnswerVo;
import ims.ocrr.vo.ServiceQuestionAnswerVoCollection;
import ims.ocrr.vo.ServiceQuestionShortVo;
import ims.ocrr.vo.ServiceQuestionShortVoCollection;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.CategoryCollection;
import ims.ocrr.vo.lookups.OrderQuestionType;
import ims.vo.interfaces.IQuestionType;

import java.util.ArrayList;

public final class MyOrderQuestionsPopulation 
{
	private DynamicGrid gridQuestions;
	private Image questionImage;	
	private Image infoImage;
	private DynamicGridColumn columnName;
	private Image mandatoryQuestionImage;
	private Image investigationImage;
	private String questionOrInformation = "Questions";
	private EnhancedItem optionYes = EnhancedItem.YES;
	private EnhancedItem optionNo = EnhancedItem.NO;
	private Sex patientSex = null;
	private Integer patientAge = null;
	private UIEngine engine = null;
		
	public MyOrderQuestionsPopulation(DynamicGrid gridQuestions, Image questionImage, Image infoImage, Image mandatoryQuestionImage, Image investigationImage, Integer age, Sex sex)	
	{
		this.gridQuestions = gridQuestions;
		this.questionImage = questionImage;
		this.infoImage = infoImage;
		this.mandatoryQuestionImage = mandatoryQuestionImage;
		this.investigationImage = investigationImage;
		setAge(age);
		setSex(sex);
	}
	
	// WDEV-3953 - overloaded constructor to take engine parameter
	public MyOrderQuestionsPopulation(DynamicGrid gridQuestions, Image questionImage, Image infoImage, Image mandatoryQuestionImage, Image investigationImage, Integer age, Sex sex, UIEngine uiEngine)	
	{
		this.gridQuestions = gridQuestions;
		this.questionImage = questionImage;
		this.infoImage = infoImage;
		this.mandatoryQuestionImage = mandatoryQuestionImage;
		this.investigationImage = investigationImage;
		setAge(age);
		setSex(sex);
		engine = uiEngine;
	}

	public MyOrderQuestionsPopulation()
	{
		
	}
	
	public void clearQuestions()
	{
		this.gridQuestions.clear();
		this.gridQuestions.setSelectable(false);	
	}
		
	public void populate(GeneralQuestionAnswerVoCollection questions, boolean isInfo)
	{	
		clearQuestions();
		
		if(questions == null)
			return;
		
		if(questionOrInformation.equals("Information"))
			this.columnName = this.gridQuestions.getColumns().newColumn(questionOrInformation);		
		else
			this.columnName = this.gridQuestions.getColumns().newColumn("Question / Information");	
		
		this.columnName.setWidth(DEFAULT_QUESTION_COLUMN_WIDTH);
		
		int noDynamicColumns = getDynamicColumnsNumber(questions);		
		DynamicGridColumn[] columnsAnswer = new DynamicGridColumn[noDynamicColumns];
		
		for(int x = 0; x < noDynamicColumns; x++)
		{
			if(x == 0)
				columnsAnswer[x] = this.gridQuestions.getColumns().newColumn("Answer(s)");
			else
				columnsAnswer[x] = this.gridQuestions.getColumns().newColumn(" ");
			columnsAnswer[x].setDynamicWidthSupported(true);
		}
		
		GeneralQuestionAnswerVoCollection collCatQuestions = getQuestionsByType(questions, OrderQuestionType.CATEGORY);
		if(collCatQuestions != null)
		{
			DynamicGridRow row = gridQuestions.getRows().newRow();
			row.setSelectable(false);
			DynamicGridCell cell = row.getCells().newCell(columnName, DynamicCellType.LABEL);
			row.setBackColor(Color.Beige);			
			cell.setValue("Category Questions");
			addQuestions(row, columnsAnswer, collCatQuestions);
			row.setExpanded(true);
		}
		GeneralQuestionAnswerVoCollection collServiceQuestions = getQuestionsByType(questions, OrderQuestionType.SERVICE);
		if(collServiceQuestions != null)
		{
			DynamicGridRow row = gridQuestions.getRows().newRow();
			row.setSelectable(false);
			DynamicGridCell cell = row.getCells().newCell(columnName, DynamicCellType.LABEL);
			row.setBackColor(Color.Beige);
			cell.setValue("Service " + this.questionOrInformation + (isInfo ? " : " + ( collServiceQuestions.get(0).getItemName()) : ""));
			addQuestions(row, columnsAnswer, collServiceQuestions);
			row.setExpanded(true);
		}
		GeneralQuestionAnswerVoCollection collInvQuestions = getQuestionsByType(questions, OrderQuestionType.INVESTIGATION);
		if(collInvQuestions != null)
		{
			DynamicGridRow row = gridQuestions.getRows().newRow();
			row.setSelectable(false);
			DynamicGridCell cell = row.getCells().newCell(columnName, DynamicCellType.LABEL);
			row.setBackColor(Color.Beige);
			cell.setValue("Investigation " + this.questionOrInformation  + (isInfo ? " : " + (collInvQuestions.get(0).getItemName()) : ""));
			addQuestions(row, columnsAnswer, collInvQuestions);
			row.setExpanded(true);
		}

	}
	
	//WDEV-16762
	public void populateQuestionInformation(GeneralQuestionAnswerVoCollection questions)
	{
		clearQuestions();
		
		if(questions == null)
			return;
		
		if(questionOrInformation.equals("Information"))
			this.columnName = this.gridQuestions.getColumns().newColumn(questionOrInformation);		
		else
			this.columnName = this.gridQuestions.getColumns().newColumn("Question / Information");	
		
		this.columnName.setWidth(DEFAULT_QUESTION_COLUMN_WIDTH);
		
		int noDynamicColumns = getDynamicColumnsNumber(questions);		
		DynamicGridColumn[] columnsAnswer = new DynamicGridColumn[noDynamicColumns];
		
		for(int x = 0; x < noDynamicColumns; x++)
		{
			if(x == 0)
				columnsAnswer[x] = this.gridQuestions.getColumns().newColumn("Answer(s)");
			else
				columnsAnswer[x] = this.gridQuestions.getColumns().newColumn(" ");
			columnsAnswer[x].setDynamicWidthSupported(true);
		}
		
		GeneralQuestionAnswerVoCollection collInvQuestions = getQuestionsByType(questions, OrderQuestionType.INVESTIGATION);
		if(collInvQuestions != null)
		{
			for(int i=0; i<collInvQuestions.size(); i++)
			{
				DynamicGridRow row = createOrFindInvestigationRow(collInvQuestions.get(i));
				
				GeneralQuestionAnswerVoCollection question = new GeneralQuestionAnswerVoCollection();
				question.add(collInvQuestions.get(i));
				
				addQuestions(row, columnsAnswer, question);
			}
		}
	}
	
	//WDEV-16762
	private DynamicGridRow createOrFindInvestigationRow(GeneralQuestionAnswerVo generalQuestionAnswerVo) 
	{
		if(generalQuestionAnswerVo == null)
			return null;
		
		DynamicGridRow row = null;
		
		for(int i=0; i<gridQuestions.getRows().size(); i++)
		{
			row = gridQuestions.getRows().get(i);
			
			if(row != null && row.getValue() != null && row.getValue().equals(generalQuestionAnswerVo.getItemId()))
				return row;
		}
		
		row = gridQuestions.getRows().newRow();
		
		row.setSelectable(false);
		DynamicGridCell cell = row.getCells().newCell(columnName, DynamicCellType.LABEL);
		row.setBackColor(Color.Beige);
		cell.setValue("Investigation " + this.questionOrInformation + " : " + generalQuestionAnswerVo.getItemName());
		row.setExpanded(true);
		row.setValue(generalQuestionAnswerVo.getItemId());
		
		return row;
	}

	public void populate(OcsQASessionVo voOcsQASession) throws PresentationLogicException
	{
		populate(voOcsQASession, false);
	}
	public void populate(OcsQASessionVo voOcsQASession, boolean previewMode) throws PresentationLogicException
	{
		checkDataIntegrity(voOcsQASession);
		prepareGraphicGrid();
				
		for (int j = 0; voOcsQASession != null && voOcsQASession.getCategoryQuestionAnswersIsNotNull() && j < voOcsQASession.getCategoryQuestionAnswers().size(); j++)
		{
			CategoryQuestionAnswerVo voCatQAnswer = voOcsQASession.getCategoryQuestionAnswers().get(j);
			
			DynamicGridRow topCategoryRow = null;
			if(categoryOrServiceOrQuestionsAdded(voCatQAnswer))
			{
				topCategoryRow = addCategoryRow(voCatQAnswer);
				topCategoryRow.setSelectable(false);
				
				// Category
				addQuestions(topCategoryRow, voCatQAnswer.getCategoryQuestionAnswers(), previewMode);
	
				// Service
				for (int k = 0; k < voCatQAnswer.getServiceQuestionAnswers().size(); k++)
				{
					ServiceQuestionAnswerVo voServiceQAnswer = voCatQAnswer.getServiceQuestionAnswers().get(k);
					DynamicGridRow serviceRow = addServiceRow(topCategoryRow, voServiceQAnswer);
					serviceRow.setSelectable(false);
					addQuestions(serviceRow, voServiceQAnswer.getServiceQuestionAnswers(), previewMode);
					
					//Investigations
					for (int s = 0; voServiceQAnswer.getInvestigationQuestionAnswersIsNotNull() && s < voServiceQAnswer.getInvestigationQuestionAnswers().size(); s++)
					{
						InvestigationQuestionAnswerVo voInvQuestionAnswer = voServiceQAnswer.getInvestigationQuestionAnswers().get(s);
						
						// WDEV-3953
						if(engine != null)
						{
/*							boolean isConfidentialInv = voInvQuestionAnswer.getInvestigationIsNotNull() && voInvQuestionAnswer.getInvestigation().getInvestigationIndexIsNotNull() && voInvQuestionAnswer.getInvestigation().getInvestigationIndex().getConfidentialTestIsNotNull() && voInvQuestionAnswer.getInvestigation().getInvestigationIndex().getConfidentialTest().booleanValue();
							if (isConfidentialInv)
							{
								if (!engine.hasRight(AppRight.CAN_VIEW_CONFIDENTIAL_INVESTIGATIONS_ORDERED))
								{
									continue;
								}
							}
*/						}

						DynamicGridRow investigationRow = addInvestigationRow(serviceRow, voInvQuestionAnswer);
						investigationRow.setSelectable(false);
						addQuestions(investigationRow, voInvQuestionAnswer.getInvestigationQuestionAnswers(), previewMode);
					}
				}
			}
			
			//WDEV-6898
			if(voCatQAnswer.getClinicalInvestigationQuestionAnswersIsNotNull())
			{
				for(int i=0;i<voCatQAnswer.getClinicalInvestigationQuestionAnswers().size();i++)
				{
					for(int y=0;y<voCatQAnswer.getClinicalInvestigationQuestionAnswers().get(i).getInvestigationQuestionAnswers().size();y++)
					{
						if(!isClinicalQuestionAlreadyAdded(voCatQAnswer.getClinicalInvestigationQuestionAnswers().get(i).getInvestigationQuestionAnswers().get(y), voOcsQASession.getCategoryQuestionAnswers()))
						{
							if(topCategoryRow == null) {
								topCategoryRow = addCategoryRow(voCatQAnswer);
								topCategoryRow.setSelectable(false);
							}
							
								
							addQuestion(topCategoryRow, voCatQAnswer.getClinicalInvestigationQuestionAnswers().get(i).getInvestigationQuestionAnswers().get(y), previewMode);
						}
							
					}
				}
			}
		}
	}

	//check if the question has been added at category level
	private boolean isClinicalQuestionAlreadyAdded(GeneralQuestionAnswerVo generalQuestionAnswerVo, CategoryQuestionAnswerVoCollection categoryQuestionAnswerVoCollection)
	{
		if(categoryQuestionAnswerVoCollection != null)
		{
			for(CategoryQuestionAnswerVo voCatQuestionAnswer : categoryQuestionAnswerVoCollection)
			{
				if(voCatQuestionAnswer.getCategoryQuestionAnswersIsNotNull())
				{
					for(GeneralQuestionAnswerVo voGenQuestAns : voCatQuestionAnswer.getCategoryQuestionAnswers())
					{
						if(voGenQuestAns.getQuestion().equals(generalQuestionAnswerVo.getQuestion()))
							return true;
					}
				}
			}
		}
		
		return false;
	}

	private DynamicGridRow addInvestigationRow(DynamicGridRow serviceRow, InvestigationQuestionAnswerVo voInvQuestionAnswer)
	{
		DynamicGridRow investigationRow = addTreeRow(serviceRow.getRows().newRow(), voInvQuestionAnswer.getInvestigation().getInvestigationIndex().getName());
		investigationRow.setSelectable(false);
		investigationRow.setIdentifier(voInvQuestionAnswer);
		investigationRow.setBackColor(Color.AntiqueWhite);
		investigationRow.setExpandedImage(investigationImage);
		investigationRow.setCollapsedImage(investigationImage);
		investigationRow.setBold(true);
		return investigationRow;
	}
	
	private DynamicGridRow addServiceRow(DynamicGridRow topCategoryRow, ServiceQuestionAnswerVo voServiceQAnswer)
	{
		DynamicGridRow serviceRow = addTreeRow(topCategoryRow.getRows().newRow(), voServiceQAnswer.getService().getServiceName());
		serviceRow.setSelectable(false);
		serviceRow.setIdentifier(voServiceQAnswer);
		serviceRow.setBackColor(Color.AntiqueWhite);
		serviceRow.setBold(true);
		return serviceRow;
	}
	
	private DynamicGridRow addCategoryRow(CategoryQuestionAnswerVo voCatQAnswer)
	{
		DynamicGridRow topCategoryRow = addTreeRow(gridQuestions.getRows().newRow(), voCatQAnswer.getCategory().getText());
		topCategoryRow.setSelectable(false);
		topCategoryRow.setIdentifier(voCatQAnswer.getCategory());
		topCategoryRow.setBackColor(Color.Bisque);
		topCategoryRow.setBold(true);
		return topCategoryRow;
	}

	private boolean categoryOrServiceOrQuestionsAdded(CategoryQuestionAnswerVo voCatQAnswer)
	{
		if (voCatQAnswer == null)
			return false;

		boolean serviceQuestionsAdded = voCatQAnswer.getServiceQuestionAnswersIsNotNull() && voCatQAnswer.getServiceQuestionAnswers().size() > 0 && voCatQAnswer.getServiceQuestionAnswers().get(0).getInvestigationQuestionAnswersIsNotNull() && voCatQAnswer.getServiceQuestionAnswers().get(0).getInvestigationQuestionAnswers().size() > 0; //WDEV-16804
		boolean categoryQuestionsAdded = voCatQAnswer.getCategoryQuestionAnswersIsNotNull() && voCatQAnswer.getCategoryQuestionAnswers().size() > 0;
		return categoryQuestionsAdded || serviceQuestionsAdded;
	}

	public OcsQASessionVo getAnswers(OcsQASessionVo voOcsQASession)
	{
		if(voOcsQASession == null)
			return new OcsQASessionVo();
		
		// Get the Category Questions
		CategoryQuestionAnswerVoCollection voColl = new CategoryQuestionAnswerVoCollection();
		int questionsGridSize = gridQuestions.getRows().size();
		if(questionsGridSize > 0)
		{
			for (int i = 0; i < questionsGridSize; i++)
			{
				DynamicGridRow firstLevelRow = gridQuestions.getRows().get(i);
				firstLevelRow.setSelectable(false);
				Object categoryIndetifier = firstLevelRow.getIdentifier();
				if (categoryIndetifier instanceof Category)
				{
					CategoryQuestionAnswerVo voCategoryQuestion = new CategoryQuestionAnswerVo();
					voCategoryQuestion.setCategory((Category) categoryIndetifier);
					
					GeneralQuestionAnswerVoCollection categoryQuestions = new GeneralQuestionAnswerVoCollection();
					ServiceQuestionAnswerVoCollection serviceQuestions  = new ServiceQuestionAnswerVoCollection();
										
					for (int j = 0; j < firstLevelRow.getRows().size(); j++)
					{
						DynamicGridRow secondLevelRow = firstLevelRow.getRows().get(j);
						secondLevelRow.setSelectable(false);
						if(secondLevelRow.getIdentifier() instanceof GeneralQuestionAnswerVo)
						{
							//Category Questions
							categoryQuestions.add(getQuestionAnswer(secondLevelRow));
						}
						
						if(secondLevelRow.getIdentifier() instanceof ServiceQuestionAnswerVo)
						{
							//Service Questions
							ServiceQuestionAnswerVo voServiceQuestionAnswer = (ServiceQuestionAnswerVo)secondLevelRow.getIdentifier();
							//WDEV-2944  - Clear the ID as it has to create a new instance every time
							voServiceQuestionAnswer.setID_ServiceQuestionAnswer(null);
							GeneralQuestionAnswerVoCollection genQuestionColl = new GeneralQuestionAnswerVoCollection();
							InvestigationQuestionAnswerVoCollection investigationCollection = new InvestigationQuestionAnswerVoCollection();
							
							for (int k = 0; k < secondLevelRow.getRows().size(); k++)
							{
								DynamicGridRow serviceRow = secondLevelRow.getRows().get(k);
								serviceRow.setSelectable(false);
								if(serviceRow.getIdentifier() instanceof GeneralQuestionAnswerVo)
								{
									GeneralQuestionAnswerVo voGeneralQuestionAnwer = getQuestionAnswer(serviceRow);
									if(voGeneralQuestionAnwer != null)
										genQuestionColl.add(voGeneralQuestionAnwer);
								}
								else if(serviceRow.getIdentifier() instanceof InvestigationQuestionAnswerVo)
								{
									//Investigation Questions
									InvestigationQuestionAnswerVo voInvestigationQuestionAnswer = (InvestigationQuestionAnswerVo)serviceRow.getIdentifier();
									//WDEV-2944  - Clear the ID as it has to create a new instance every time
									voInvestigationQuestionAnswer.setID_InvestigationQuestionAnswer(null);
									GeneralQuestionAnswerVoCollection investigationQuestions = new GeneralQuestionAnswerVoCollection();
									
									for (int l = 0; l < serviceRow.getRows().size(); l++)
									{
										DynamicGridRow investigationRow = serviceRow.getRows().get(l);
										investigationRow.setSelectable(false);
										GeneralQuestionAnswerVo voGeneralQuestionAnwer = getQuestionAnswer(investigationRow);
										if(voGeneralQuestionAnwer != null)
											investigationQuestions.add(voGeneralQuestionAnwer);
									}
									voInvestigationQuestionAnswer.setInvestigationQuestionAnswers(investigationQuestions);
									investigationCollection.add(voInvestigationQuestionAnswer);
								}
							}
							
							voServiceQuestionAnswer.setServiceQuestionAnswers(genQuestionColl);
							voServiceQuestionAnswer.setInvestigationQuestionAnswers(investigationCollection);
							serviceQuestions.add(voServiceQuestionAnswer);
						}					
					}
					
					voCategoryQuestion.setCategoryQuestionAnswers(categoryQuestions);
					voCategoryQuestion.setServiceQuestionAnswers(serviceQuestions);
					
					voColl.add(voCategoryQuestion);
				}
			}
			
			voOcsQASession.setCategoryQuestionAnswers(voColl);
		}
		else
		{
			return null;	
		}
		
		return voOcsQASession;
	}

	public OcsQASessionVo setOcsQASessionAnswers(OcsQASessionVo voOcsQASession, CategoryQuestionShortVoCollection categoryConfigQuestions, ServiceQuestionShortVoCollection serviceConfigQuestions, InvestigationOcsQuestionsVoCollection investigationOcsQuestionsColl)
	{
		//Everything is driven by the Investigations
		if(investigationOcsQuestionsColl == null || investigationOcsQuestionsColl.size() == 0)
			return null;
		
		if(voOcsQASession == null)
			throw new CodingRuntimeException("Cannot set answers for null OcsQASessionVo");
		
		if(voOcsQASession.getCategoryQuestionAnswers() == null)
			voOcsQASession.setCategoryQuestionAnswers(new CategoryQuestionAnswerVoCollection());
		
		//Get a list of top Categories
		CategoryCollection categoryColl = getCategoryCollection(investigationOcsQuestionsColl);

		//Add new Category /Investigations/Service Questions
		for (int i = 0; i < categoryColl.size(); i++)
		{
			Category category = categoryColl.get(i);
			for (int j = 0; investigationOcsQuestionsColl != null && j < investigationOcsQuestionsColl.size(); j++)
			{
				InvestigationOcsQuestionsVo voInvestigation = investigationOcsQuestionsColl.get(j);
				
				CategoryQuestionAnswerVo voCategoryQuestionAnswerVo = getCategoryQuestionAnswer(category, voOcsQASession);
				if(voInvestigation.getInvestigationIndex().getCategory().equals(category) && isInvestigationAdded(voInvestigation, voOcsQASession) == false)
				{
					//Category Questions Hierarchy
					buildCategoryQuestions(category, voCategoryQuestionAnswerVo, categoryConfigQuestions);
	
					//Get Questions that have to be asked in every Investigations
					GeneralQuestionAnswerVoCollection askedInEveryInvestigations = getQuestionsToBeAskedInEveryInvestigation(category, categoryConfigQuestions, serviceConfigQuestions, voInvestigation);
					
					//Build Service and Investigation Questions
					buildServiceQuestions(category, voCategoryQuestionAnswerVo, serviceConfigQuestions, askedInEveryInvestigations, voInvestigation);
					
					//Aa CategoryQuestionAnswerVo if there is at least one Question added
					if(isAtLeastOneQuestionAdded(voCategoryQuestionAnswerVo))
					{
						int index = voOcsQASession.getCategoryQuestionAnswers().indexOf(voCategoryQuestionAnswerVo);
						if(index < 0)
							voOcsQASession.getCategoryQuestionAnswers().add(voCategoryQuestionAnswerVo);
						else
							voOcsQASession.getCategoryQuestionAnswers().set(index, voCategoryQuestionAnswerVo);
					}
					
					if(voInvestigation.getProviderService() == null)
					{
						if(voCategoryQuestionAnswerVo.getClinicalInvestigationQuestionAnswers() == null)
							voCategoryQuestionAnswerVo.setClinicalInvestigationQuestionAnswers(new InvestigationQuestionAnswerVoCollection());
						
						InvestigationQuestionAnswerVo voInvQuestionAnswer = getInstInvestigationQuestionAnswerFromConfigInvestigation(voInvestigation, voCategoryQuestionAnswerVo.getClinicalInvestigationQuestionAnswers(), askedInEveryInvestigations);
						voCategoryQuestionAnswerVo.getClinicalInvestigationQuestionAnswers().add(voInvQuestionAnswer);
						voOcsQASession.getCategoryQuestionAnswers().add(voCategoryQuestionAnswerVo);
					}
				}
			}			
		}
		
		removeUnusedCategoryQuestions(categoryColl, voOcsQASession);
		removeUnusedInvestigations(investigationOcsQuestionsColl, voOcsQASession);
		
		return voOcsQASession;
	}

	private void removeUnusedCategoryQuestions(CategoryCollection categoryColl, OcsQASessionVo voOcsQASession)
	{
		if (voOcsQASession == null || voOcsQASession.getCategoryQuestionAnswers() == null)
			return;
		
		for (int i = voOcsQASession.getCategoryQuestionAnswers().size() - 1; i >= 0; i--)
		{
			CategoryQuestionAnswerVo question = voOcsQASession.getCategoryQuestionAnswers().get(i);
			
			if (categoryColl == null || !categoryColl.contains(question.getCategory()))
			{
				voOcsQASession.getCategoryQuestionAnswers().remove(question);
			}
		}
	}

	private void removeUnusedInvestigations(InvestigationOcsQuestionsVoCollection investigationOcsQuestionsColl, OcsQASessionVo ocsQASession)
	{
		InvestigationLiteVoCollection voExistingInvColl = getExistingInvestigations(ocsQASession);
		for (int i = 0; voExistingInvColl != null && i < voExistingInvColl.size(); i++)
		{
			//Check if the investigation was removed
			if(isInvestigationRemoved(voExistingInvColl.get(i), investigationOcsQuestionsColl))
			{
				removeInvestigationFromVo(voExistingInvColl.get(i).getID_Investigation(), ocsQASession);
			}
		}
	}

	public OcsQASessionVo removeInvestigationFromVo(Integer investigationId, OcsQASessionVo ocsQASession)
	{
		if (investigationId == null)
			return ocsQASession;

		for (int i = 0; ocsQASession != null && ocsQASession.getCategoryQuestionAnswersIsNotNull() && i < ocsQASession.getCategoryQuestionAnswers().size(); i++)
		{
			CategoryQuestionAnswerVo categoryQuestionAnswerVo = ocsQASession.getCategoryQuestionAnswers().get(i);
			for (int j = 0; categoryQuestionAnswerVo.getServiceQuestionAnswersIsNotNull() && j < categoryQuestionAnswerVo.getServiceQuestionAnswers().size(); j++)
			{
				ServiceQuestionAnswerVo serviceQuestionAnswerVo = categoryQuestionAnswerVo.getServiceQuestionAnswers().get(j);
				
				if (serviceQuestionAnswerVo.getInvestigationQuestionAnswers() != null)
				{
					//Remove the Investigation Question Answer
					for (int k = serviceQuestionAnswerVo.getInvestigationQuestionAnswers().size() - 1; k >= 0; k--)
					{
						InvestigationQuestionAnswerVo invQAVo = serviceQuestionAnswerVo.getInvestigationQuestionAnswers().get(k);
						if (invQAVo.getInvestigationIsNotNull() && invQAVo.getInvestigation().getID_InvestigationIsNotNull() && invQAVo.getInvestigation().getID_Investigation().equals(investigationId))
						{
							serviceQuestionAnswerVo.getInvestigationQuestionAnswers().remove(invQAVo);
						}
					}
				}
			}
		}

		return ocsQASession;
	}
	
	public OcsQASessionVo removeUnusedCategoryQuestions(OcsQASessionVo ocsQASession, CategoryCollection usedCategories)
	{
		if (ocsQASession == null || ocsQASession.getCategoryQuestionAnswers() == null)
			return ocsQASession;
		
		
		for (int i = ocsQASession.getCategoryQuestionAnswers().size() - 1; i >= 0; i--)
		{
			CategoryQuestionAnswerVo categoryQuestion = ocsQASession.getCategoryQuestionAnswers().get(i);
			
			if (!usedCategories.contains(categoryQuestion.getCategory()))
				ocsQASession.getCategoryQuestionAnswers().remove(categoryQuestion);
		}
		
		return ocsQASession;
	}
	
	
	public OcsQASessionVo removeUnusedServiceQuestions(OcsQASessionVo ocsQASession, ArrayList<Integer> usedServices)
	{
		if (ocsQASession == null || ocsQASession.getCategoryQuestionAnswers() == null)
			return ocsQASession;
		
		
		for (int i = ocsQASession.getCategoryQuestionAnswers().size() - 1; i >= 0; i--)
		{
			CategoryQuestionAnswerVo categoryQuestion = ocsQASession.getCategoryQuestionAnswers().get(i);
			
			if (categoryQuestion.getServiceQuestionAnswers() != null)
			{
				for (int j = categoryQuestion.getServiceQuestionAnswers().size() - 1; j >= 0; j--)
				{
					ServiceQuestionAnswerVo serviceQuestion = categoryQuestion.getServiceQuestionAnswers().get(j);
					
					if (!usedServices.contains(serviceQuestion.getService().getID_Service()))
						categoryQuestion.getServiceQuestionAnswers().remove(serviceQuestion);
				}
			}
		}
		
		return ocsQASession;
	}


	private boolean isInvestigationRemoved(InvestigationRefVo voRefInvestigation, InvestigationOcsQuestionsVoCollection investigationOcsQuestionsColl)
	{
		for (int i = 0; investigationOcsQuestionsColl != null && i < investigationOcsQuestionsColl.size(); i++)
		{
			if(investigationOcsQuestionsColl.get(i).equals(voRefInvestigation))
				return false;
		}
				
		return true;
	}

	private InvestigationLiteVoCollection getExistingInvestigations(OcsQASessionVo voOcsQA)
	{
		if (voOcsQA == null)
			return null;

		InvestigationLiteVoCollection voColl = new InvestigationLiteVoCollection();
		for (int i = 0; voOcsQA.getCategoryQuestionAnswersIsNotNull() && i < voOcsQA.getCategoryQuestionAnswers().size(); i++)
		{
			CategoryQuestionAnswerVo categoryQuestionAnswerVo = voOcsQA.getCategoryQuestionAnswers().get(i);
			for (int j = 0; categoryQuestionAnswerVo.getServiceQuestionAnswersIsNotNull() && j < categoryQuestionAnswerVo.getServiceQuestionAnswers().size(); j++)
			{
				ServiceQuestionAnswerVo serviceQuestionAnswerVo = categoryQuestionAnswerVo.getServiceQuestionAnswers().get(j);
				for (int k = 0; serviceQuestionAnswerVo.getInvestigationQuestionAnswers() != null && k < serviceQuestionAnswerVo.getInvestigationQuestionAnswers().size(); k++)
				{
					voColl.add(serviceQuestionAnswerVo.getInvestigationQuestionAnswers().get(k).getInvestigation());
				}
			}
		}
		return voColl;
	}

	private boolean isInvestigationAdded(InvestigationRefVo voRefInvestigation, OcsQASessionVo voOcsQA)
	{
		if(voRefInvestigation == null || voOcsQA == null)
			return false;
		
		for (int i = 0; voOcsQA.getCategoryQuestionAnswersIsNotNull() && i < voOcsQA.getCategoryQuestionAnswers().size(); i++)
		{
			CategoryQuestionAnswerVo categoryQuestionAnswerVo = voOcsQA.getCategoryQuestionAnswers().get(i);
			for (int j = 0; categoryQuestionAnswerVo.getServiceQuestionAnswersIsNotNull() && j < categoryQuestionAnswerVo.getServiceQuestionAnswers().size(); j++)
			{
				ServiceQuestionAnswerVo serviceQuestionAnswerVo = categoryQuestionAnswerVo.getServiceQuestionAnswers().get(j);
				for (int k = 0; serviceQuestionAnswerVo.getInvestigationQuestionAnswers() != null && k < serviceQuestionAnswerVo.getInvestigationQuestionAnswers().size(); k++)
				{
					if(voRefInvestigation.equals(serviceQuestionAnswerVo.getInvestigationQuestionAnswers().get(k).getInvestigation()))
						return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean isAtLeastOneQuestionAdded(CategoryQuestionAnswerVo voCategoryQuestionAnswerVo)
	{
		if(voCategoryQuestionAnswerVo == null)
			return false;
		
		if(voCategoryQuestionAnswerVo.getCategoryQuestionAnswers() != null && voCategoryQuestionAnswerVo.getCategoryQuestionAnswers().size() > 0)
			return true;
		
		for (int i = 0; voCategoryQuestionAnswerVo.getServiceQuestionAnswersIsNotNull() && i < voCategoryQuestionAnswerVo.getServiceQuestionAnswers().size(); i++)
		{
			ServiceQuestionAnswerVo serviceQuestionAnswerVo = voCategoryQuestionAnswerVo.getServiceQuestionAnswers().get(i);
			
			if(serviceQuestionAnswerVo.getServiceQuestionAnswers().size() > 0)
				return true;
			
			for (int j = 0; serviceQuestionAnswerVo.getInvestigationQuestionAnswersIsNotNull() && j < serviceQuestionAnswerVo.getInvestigationQuestionAnswers().size(); j++)
			{
				if(serviceQuestionAnswerVo.getInvestigationQuestionAnswers().get(j).getInvestigationQuestionAnswers().size() > 0)
					return true;
			}
		}
		
		return false;
	}

	private GeneralQuestionAnswerVoCollection getQuestionsToBeAskedInEveryInvestigation(Category category, CategoryQuestionShortVoCollection categoryConfigQuestions, ServiceQuestionShortVoCollection serviceConfigQuestions, InvestigationOcsQuestionsVo voInvOcs)
	{
		//Category Questions
		GeneralQuestionAnswerVoCollection voColl = new GeneralQuestionAnswerVoCollection();
		for (int i = 0; categoryConfigQuestions != null && i < categoryConfigQuestions.size(); i++)
		{
			CategoryQuestionShortVo categoryQuestion = categoryConfigQuestions.get(i);
			if(categoryQuestion.getOCRRCategoryIsNotNull() && categoryQuestion.getOCRRCategory().equals(category))
			{
				if(categoryQuestion.getAskForInvestigationsIsNotNull() && categoryQuestion.getAskForInvestigations().booleanValue())
				{
					//WDEV-3332
					if(isCategoryQuestionActive(categoryQuestion))
					{
						GeneralQuestionAnswerVo voGCQ = createNewCategoryQuestion(categoryQuestion);
						if(voGCQ != null)
							voColl.add(voGCQ);
					}
				}
			}
		}

		//Service Questions
		Category investigationCategory = voInvOcs != null && voInvOcs.getInvestigationIndexIsNotNull() && voInvOcs.getInvestigationIndex().getCategoryIsNotNull()?voInvOcs.getInvestigationIndex().getCategory():null;
		if(investigationCategory  != null && investigationCategory .equals(category))
		{
			for (int j = 0; serviceConfigQuestions != null && j < serviceConfigQuestions.size(); j++)
			{
				ServiceQuestionShortVo voServiceQ = serviceConfigQuestions.get(j);
				if(voServiceQ.getAskForInvestigationsIsNotNull() && voServiceQ.getAskForInvestigations().booleanValue())
				{
					if(isSameService(voServiceQ, voInvOcs))
					{
						GeneralQuestionAnswerVo voGSQ = createNewServiceQuestion(voServiceQ);
						if(voGSQ != null)
							voColl.add(voGSQ);
					}
				}
			}
		}
		
		return voColl;
	}

	private boolean isCategoryQuestionActive(CategoryQuestionShortVo categoryQuestion)
	{
		if(categoryQuestion == null)
			return false;
		
		PreActiveActiveInactiveStatus questionStatus = categoryQuestion.getQuestionInformationIsNotNull()?categoryQuestion.getQuestionInformation().getStatus():null;
		if(questionStatus != null && questionStatus.equals(PreActiveActiveInactiveStatus.ACTIVE))
		{
			return true;
		}
		
		return false;
	}

	private boolean isSameService(ServiceQuestionShortVo voServiceQ, InvestigationOcsQuestionsVo voInvOcs)
	{
		if(voServiceQ == null || voInvOcs == null)
			return false;
		
		ServiceLiteVo serviceConfigVo = voServiceQ.getServiceIsNotNull() ? voServiceQ.getService() : null;
		ServiceLiteVo serviceInvestigationVo = voInvOcs.getProviderServiceIsNotNull() && voInvOcs.getProviderService().getLocationServiceIsNotNull() ? voInvOcs.getProviderService().getLocationService().getService() : null;
		// Check against the same service
		if (serviceConfigVo != null && serviceConfigVo.equals(serviceInvestigationVo))
			return true;
		
		return false;
	}

	private CategoryQuestionAnswerVo getCategoryQuestionAnswer(Category category, OcsQASessionVo voOcsQASession)
	{
		for (int i = 0; voOcsQASession != null && i < voOcsQASession.getCategoryQuestionAnswers().size(); i++)
		{
			if(voOcsQASession.getCategoryQuestionAnswers().get(i).getCategory().equals(category))
				return voOcsQASession.getCategoryQuestionAnswers().get(i);
		}
	
		CategoryQuestionAnswerVo voCategoryQuestionAnswer = new CategoryQuestionAnswerVo();
		voCategoryQuestionAnswer.setCategory(category);
		voCategoryQuestionAnswer.setServiceQuestionAnswers(new ServiceQuestionAnswerVoCollection());
		voCategoryQuestionAnswer.setCategoryQuestionAnswers(new GeneralQuestionAnswerVoCollection());
		
		return voCategoryQuestionAnswer;
	}

	private boolean isCategoryQuestionAdded(CategoryQuestionAnswerVo voCategoryQuestionAnswer, QuestionInformationShortVo voQuestionInformation)
	{
		if(voQuestionInformation != null && voCategoryQuestionAnswer != null && voCategoryQuestionAnswer.getCategoryQuestionAnswersIsNotNull())
		{
			for (int i = 0; i < voCategoryQuestionAnswer.getCategoryQuestionAnswers().size(); i++)
			{
				if(voQuestionInformation.equals(voCategoryQuestionAnswer.getCategoryQuestionAnswers().get(i).getQuestion()))
				{
					return true;
				}
			}
		}
		
		return false;
	}

	private CategoryCollection getCategoryCollection(InvestigationOcsQuestionsVoCollection investigationOcsQuestionsColl)
	{
		CategoryCollection categoryColl = new CategoryCollection();
		for (int i = 0; investigationOcsQuestionsColl != null && i < investigationOcsQuestionsColl.size(); i++)
		{
			InvestigationOcsQuestionsVo voOrderInv = investigationOcsQuestionsColl.get(i);
			if (voOrderInv.getInvestigationIndexIsNotNull())
			{
				Category category = voOrderInv.getInvestigationIndex().getCategory();
				if (categoryColl.indexOf(category) < 0)
					categoryColl.add(category);
			}
		}

		categoryColl.sort();
		
		return categoryColl;
	}

	private void buildCategoryQuestions(Category category, CategoryQuestionAnswerVo voCategoryQuestionAnswer, CategoryQuestionShortVoCollection categoryConfigQuestions)
	{
		// Add the Category question if now added before
		if (categoryConfigQuestions != null && categoryConfigQuestions.size() > 0)
		{
			if (voCategoryQuestionAnswer.getCategoryQuestionAnswers() == null)
				voCategoryQuestionAnswer.setCategoryQuestionAnswers(new GeneralQuestionAnswerVoCollection());

			for (int i = 0; i < categoryConfigQuestions.size(); i++)
			{
				CategoryQuestionShortVo categoryQuestionShortVo = categoryConfigQuestions.get(i);
				if (categoryQuestionShortVo.getOCRRCategoryIsNotNull() && categoryQuestionShortVo.getOCRRCategory().equals(category))
				{
					boolean categoryQuestionAdded = isCategoryQuestionAdded(voCategoryQuestionAnswer, categoryQuestionShortVo.getQuestionInformation());
					boolean askedForEveryInvestigation = categoryQuestionShortVo.getAskForInvestigationsIsNotNull() && categoryQuestionShortVo.getAskForInvestigations().booleanValue();
					//Don't add duplicated questions or questions marked as "Ask for every Investigation"
					if (categoryQuestionAdded == false && askedForEveryInvestigation == false && isCategoryQuestionActive(categoryQuestionShortVo))
						voCategoryQuestionAnswer.getCategoryQuestionAnswers().add(createNewCategoryQuestion(categoryQuestionShortVo));
				}
			}
		}
		else
		{
			// Clear category questions
			voCategoryQuestionAnswer.setCategoryQuestionAnswers(null);
		}
	}
	
	private void buildServiceQuestions(Category category, CategoryQuestionAnswerVo voCategoryQuestionAnswerVo, ServiceQuestionShortVoCollection serviceConfigQuestions, GeneralQuestionAnswerVoCollection askedInEveryInvestigations, InvestigationOcsQuestionsVo voInvOcs)
	{
		if (voInvOcs != null)
		{
			Category investigationCategory = voInvOcs.getInvestigationIndexIsNotNull() && voInvOcs.getInvestigationIndex().getCategoryIsNotNull() ? voInvOcs.getInvestigationIndex().getCategory() : null;
			if (investigationCategory != null && investigationCategory.equals(category))
			{
				ServiceLiteVo serviceVo = voInvOcs.getProviderServiceIsNotNull() && voInvOcs.getProviderService().getLocationServiceIsNotNull() ? voInvOcs.getProviderService().getLocationService().getService() : null;
				if(serviceVo != null)
				{
					ServiceQuestionAnswerVo voServiceQA = getInstServiceQuestionAnswerFromConfigService(serviceConfigQuestions, voCategoryQuestionAnswerVo, askedInEveryInvestigations, serviceVo, voInvOcs);
					boolean questionsAdded = voServiceQA  != null && voServiceQA.getServiceQuestionAnswersIsNotNull() && voServiceQA.getServiceQuestionAnswers().size() > 0;
					boolean investigationQuestionsAdded = voServiceQA  != null && voServiceQA.getInvestigationQuestionAnswersIsNotNull() && voServiceQA.getInvestigationQuestionAnswers().size() > 0;
					//Add the Service only if there is at least one Service or Investigation Question
					if(questionsAdded || investigationQuestionsAdded)
					{
						if (voCategoryQuestionAnswerVo.getServiceQuestionAnswers() == null)
							voCategoryQuestionAnswerVo.setServiceQuestionAnswers(new ServiceQuestionAnswerVoCollection());
						
						int index = voCategoryQuestionAnswerVo.getServiceQuestionAnswers().indexOf(voServiceQA);
						if(index < 0)
							voCategoryQuestionAnswerVo.getServiceQuestionAnswers().add(voServiceQA);
						else
							voCategoryQuestionAnswerVo.getServiceQuestionAnswers().set(index, voServiceQA);
					}
				}
			}
		}
		else
		{
			voCategoryQuestionAnswerVo.setServiceQuestionAnswers(null);
		}
	}

	private ServiceQuestionAnswerVo createDummyServiceQuaetionAnswerVo(InvestigationOcsQuestionsVo voInvOcs)
	{
		ServiceQuestionAnswerVo voServiceQuestionAnswer = new ServiceQuestionAnswerVo();
		voServiceQuestionAnswer.setService(new ServiceLiteVo());
		voServiceQuestionAnswer.getService().setServiceName("No Service");
		voServiceQuestionAnswer.getService().setServiceCategory(ServiceCategory.CLINICAL);
		
		voServiceQuestionAnswer.setInvestigationQuestionAnswers(new InvestigationQuestionAnswerVoCollection());
		voServiceQuestionAnswer.getInvestigationQuestionAnswers().add(new InvestigationQuestionAnswerVo());
		voServiceQuestionAnswer.getInvestigationQuestionAnswers().get(0).setInvestigationQuestionAnswers(new GeneralQuestionAnswerVoCollection());
		voServiceQuestionAnswer.getInvestigationQuestionAnswers().get(0).setInvestigation(voInvOcs);
		
		
		GeneralQuestionAnswerVoCollection voGQAColl = getInvestigationQuestions(voInvOcs);
		for( GeneralQuestionAnswerVo voItem : voGQAColl)
			voServiceQuestionAnswer.getInvestigationQuestionAnswers().get(0).getInvestigationQuestionAnswers().add(voItem);
		
		return voServiceQuestionAnswer;
		
	}

	private InvestigationQuestionAnswerVo getInstInvestigationQuestionAnswerFromConfigInvestigation(InvestigationOcsQuestionsVo voInvOcs, InvestigationQuestionAnswerVoCollection collection, GeneralQuestionAnswerVoCollection askedInEveryInvestigations)
	{
		if (voInvOcs == null)
			return null;
		
		InvestigationQuestionAnswerVo voIQA = null;
		for (int i = 0; collection != null && i < collection.size(); i++)
		{
			if(collection.get(i).getInvestigationIsNotNull() && collection.get(i).getInvestigation().equals(voInvOcs))
			{
				voIQA = collection.get(i);
				break;
			}
		}

		if(voIQA == null)
		{
			voIQA = new InvestigationQuestionAnswerVo();
			voIQA.setInvestigationQuestionAnswers(new GeneralQuestionAnswerVoCollection());
		}
		
		voIQA.setInvestigation(voInvOcs);
		
		//Add Investigation Questions 
		GeneralQuestionAnswerVoCollection voGQAColl = getInvestigationQuestions(voInvOcs);
		for (int i = 0; voGQAColl != null && i < voGQAColl.size(); i++)
		{
			//Avoid duplicated question for the same Investigation
			if(isQuestionAdded(voGQAColl.get(i), voIQA.getInvestigationQuestionAnswers()) == false)
				voIQA.getInvestigationQuestionAnswers().add(voGQAColl.get(i));
		}
		
		//Add Questions Asked in every investigation
		for (int i = 0; askedInEveryInvestigations != null && i < askedInEveryInvestigations.size(); i++)
			voIQA.getInvestigationQuestionAnswers().add(askedInEveryInvestigations.get(i));

		return voIQA;
	}

	private ServiceQuestionAnswerVo getInstServiceQuestionAnswerFromConfigService(ServiceQuestionShortVoCollection serviceConfigQuestions, CategoryQuestionAnswerVo voCategoryQuestionAnswerVo, GeneralQuestionAnswerVoCollection askedInEveryInvestigations, ServiceLiteVo voServiceLiteVo, InvestigationOcsQuestionsVo voInvOcs)
	{
		if(voServiceLiteVo == null)
			return null;
		
		ServiceQuestionAnswerVo voSQA = null;
		
		//Find the ServiceQuestionAnswerVo - if exists
		for (int i = 0; voCategoryQuestionAnswerVo != null && i < voCategoryQuestionAnswerVo.getServiceQuestionAnswers().size(); i++)
		{
			ServiceQuestionAnswerVo serviceQuestionAnswerVo = voCategoryQuestionAnswerVo.getServiceQuestionAnswers().get(i);
			if(serviceQuestionAnswerVo.getServiceIsNotNull() && serviceQuestionAnswerVo.getService().equals(voServiceLiteVo))
			{
				voSQA = serviceQuestionAnswerVo;
				break;
			}
		}
		
		if(voSQA == null)
		{
			voSQA = new ServiceQuestionAnswerVo();
			voSQA.setServiceQuestionAnswers(new GeneralQuestionAnswerVoCollection());
		}
		
		voSQA.setService(voServiceLiteVo);
		GeneralQuestionAnswerVoCollection voGQAColl = getServiceQuestions(serviceConfigQuestions, voServiceLiteVo);
		for (int i = 0; voGQAColl != null && i < voGQAColl.size(); i++)
		{
			//Avoid duplicating questions for the same Service
			if(isQuestionAdded(voGQAColl.get(i), voSQA.getServiceQuestionAnswers()) == false)
				voSQA.getServiceQuestionAnswers().add(voGQAColl.get(i));	
		}
		
		//Build Investigation Questions
		if(voSQA.getInvestigationQuestionAnswers() == null)
			voSQA.setInvestigationQuestionAnswers(new InvestigationQuestionAnswerVoCollection());
		InvestigationQuestionAnswerVo voIQA = getInstInvestigationQuestionAnswerFromConfigInvestigation(voInvOcs, voSQA.getInvestigationQuestionAnswers(), askedInEveryInvestigations);
		//Don't add an Investigation if it doesn't have any questions
		if(voIQA != null && voIQA.getInvestigationQuestionAnswersIsNotNull() && voIQA.getInvestigationQuestionAnswers().size() > 0)
			voSQA.getInvestigationQuestionAnswers().add(voIQA);
		
		return voSQA;
	}
	
	private boolean isQuestionAdded(GeneralQuestionAnswerVo vo, GeneralQuestionAnswerVoCollection serviceQuestionAnswers)
	{
		if(serviceQuestionAnswers == null)
			return false;
		
		for (int i = 0; i < serviceQuestionAnswers.size(); i++)
		{
			if(serviceQuestionAnswers.get(i).getQuestion().equals(vo.getQuestion()))
				return true;
		}
		
		return false;
	}

	private GeneralQuestionAnswerVo createNewCategoryQuestion(CategoryQuestionShortVo categoryConfigQuestion)
	{
		if(categoryConfigQuestion == null)
			return null;
		
		if(isQuestionRelevant(categoryConfigQuestion.getQuestionInformation(), getAge(), getSex()) == false)
			return null;
		
		GeneralQuestionAnswerVo categoryQuestion = new GeneralQuestionAnswerVo();
		categoryQuestion.setQuestion(categoryConfigQuestion.getQuestionInformation());
		categoryQuestion.setPatientAnswers(new PatientAssessmentAnswerVoCollection());
		categoryQuestion.setWasMandatory(categoryConfigQuestion.getIsMandatory());
		return categoryQuestion;
	}
	
	private GeneralQuestionAnswerVoCollection getServiceQuestions(ServiceQuestionShortVoCollection serviceConfigQuestions, ServiceLiteVo voServiceLite)
	{
		GeneralQuestionAnswerVoCollection serviceQuestions = new GeneralQuestionAnswerVoCollection();
		for (int i = 0; serviceConfigQuestions != null && i < serviceConfigQuestions.size(); i++)
		{
			ServiceQuestionShortVo serviceQuestionShortVo = serviceConfigQuestions.get(i);
			boolean askedForEveryInvestigation = serviceQuestionShortVo.getAskForInvestigationsIsNotNull() && serviceQuestionShortVo.getAskForInvestigations().booleanValue();
			if(askedForEveryInvestigation == false && serviceQuestionShortVo.getService().equals(voServiceLite))
			{
				GeneralQuestionAnswerVo voGQA = createNewServiceQuestion(serviceQuestionShortVo);
				if(voGQA != null)
					serviceQuestions.add(voGQA);
			}
		}
		return serviceQuestions;
	}
	
	private GeneralQuestionAnswerVo createNewServiceQuestion(ServiceQuestionShortVo serviceQuestionConfig)
	{
		if(serviceQuestionConfig == null)
			return null;
		
		if(isQuestionRelevant(serviceQuestionConfig.getQuestionInformation(), getAge(), getSex()) == false)
			return null;
		
		GeneralQuestionAnswerVo serviceQuestion = new GeneralQuestionAnswerVo();
		serviceQuestion.setQuestion(serviceQuestionConfig.getQuestionInformation());
		serviceQuestion.setPatientAnswers(new PatientAssessmentAnswerVoCollection());
		serviceQuestion.setWasMandatory(serviceQuestionConfig.getIsMandatory());
		return serviceQuestion;
	}
	
	private GeneralQuestionAnswerVoCollection getInvestigationQuestions(InvestigationOcsQuestionsVo voInvOcs)
	{
		if(voInvOcs == null)
			return null;
		
		GeneralQuestionAnswerVoCollection invQuestions = new GeneralQuestionAnswerVoCollection();
		for (int i = 0; i < voInvOcs.getAssocQuestions().size(); i++)
		{
			InvestigationQuestionShortVo voInvestigationQuestion = voInvOcs.getAssocQuestions().get(i);
			if(isQuestionRelevant(voInvestigationQuestion.getQuestion(), getAge(), getSex()))
			{
				GeneralQuestionAnswerVo voGeneralQuestionAnswer = new GeneralQuestionAnswerVo();
				voGeneralQuestionAnswer.setQuestion(voInvestigationQuestion.getQuestion());
				voGeneralQuestionAnswer.setWasMandatory(voInvestigationQuestion.getIsMandatory());
				invQuestions.add(voGeneralQuestionAnswer);
			}
		}
		
		return invQuestions;
	}
		
	private GeneralQuestionAnswerVo getQuestionAnswer(DynamicGridRow gridRow)
	{
		if(gridRow == null)
			return null;
		
		if(gridRow.getIdentifier() instanceof GeneralQuestionAnswerVo)
		{
			GeneralQuestionAnswerVo vo = new GeneralQuestionAnswerVo();
			vo.setQuestion(((GeneralQuestionAnswerVo)gridRow.getIdentifier()).getQuestion());
			vo.setWasMandatory(((GeneralQuestionAnswerVo)gridRow.getIdentifier()).getWasMandatory());
			vo.setPatientAnswers(getPatientAnswers(gridRow));
			
			return vo;
		}
		
		return null;
	}

	private PatientAssessmentAnswerVoCollection getPatientAnswers(DynamicGridRow gridRow)
	{
		PatientAssessmentAnswerVoCollection patientAssAnswerColl = new PatientAssessmentAnswerVoCollection();
		AnswerDetailsVoCollection answerDetails = new AnswerDetailsVoCollection();

		PatientAssessmentAnswerVo voPatientAssessmentAnswer = new PatientAssessmentAnswerVo();
		for (int x = 0; x < this.gridQuestions.getColumns().size(); x++)
		{
			DynamicGridCell cell = gridRow.getCells().get(this.gridQuestions.getColumns().get(x));

			// we save the separators as well
			// if(cell != null &&
			// !cell.getType().equals(DynamicCellType.DYNAMICLABEL) &&
			// !cell.getType().equals(DynamicCellType.EMPTY) &&
			// cell.getIdentifier() != null && cell.getIdentifier() instanceof
			// QuestionAnswerTypeVo)
			if (cell != null && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof QuestionAnswerTypeVo || cell.getIdentifier() instanceof AnswerCellData))
			{
				answerDetails.add(getCellAnswer(cell));
			}
		}

		voPatientAssessmentAnswer.setAnswerDetails(answerDetails);
		patientAssAnswerColl.add(voPatientAssessmentAnswer);

		return patientAssAnswerColl;
	}

	private DynamicGridRow addTreeRow(DynamicGridRow parentRow, String cellText)
	{
		DynamicGridCell cell = parentRow.getCells().newCell(this.gridQuestions.getColumns().getByIdentifier(QUESTION_COLUMN), DynamicCellType.LABEL);
		
		cell.setValue(cellText);
		parentRow.setExpanded(true);
		return parentRow;
	}
	
	private void prepareGraphicGrid()
	{
		this.gridQuestions.clear();			
		this.gridQuestions.setSelectable(false);
		createStaticColumns();
	}

	private void createStaticColumns()
	{
		String columnHeader = questionOrInformation.equals("Information")?questionOrInformation:"Question / Information";
		DynamicGridColumn questionColumn = this.gridQuestions.getColumns().newColumn(columnHeader, QUESTION_COLUMN);
		questionColumn.setCanGrow(false);
		questionColumn.setWidth(DEFAULT_QUESTION_COLUMN_WIDTH);
	}
	
	private void checkDataIntegrity(OcsQASessionVo ocsQASessionVo) throws PresentationLogicException
	{
		for (int j = 0; ocsQASessionVo != null &&  ocsQASessionVo.getCategoryQuestionAnswersIsNotNull() && j < ocsQASessionVo.getCategoryQuestionAnswers().size(); j++)
		{
			if(ocsQASessionVo.getCategoryQuestionAnswers().get(j).getCategory() == null)
				throw new PresentationLogicException("Invalid Category for Category Questions and Answers");		
		}
	}

	private void addQuestions(DynamicGridRow pRow, DynamicGridColumn[] columnsAnswer, GeneralQuestionAnswerVoCollection collQuestions) 
	{ 
		for (int i = 0; i < collQuestions.size(); i++)
		{
			Image rowQuestionImage = null;
			if(collQuestions.get(i).getIQuestionTypeQuestion().getIsQuestionIsNotNull() && collQuestions.get(i).getIQuestionTypeQuestion().getIsQuestion().equals(Boolean.FALSE))
				rowQuestionImage = this.infoImage;
			else
			{
				rowQuestionImage = this.questionImage;
				if(collQuestions.get(i).getIQuestionTypeIsMandatory() != null && collQuestions.get(i).getIQuestionTypeIsMandatory().booleanValue())
					rowQuestionImage = this.mandatoryQuestionImage;
			}
			
			DynamicGridRow row = pRow.getRows().newRow();
			row.setSelectable(false);
			
			row.setCollapsedImage(rowQuestionImage);
			row.setExpandedImage(rowQuestionImage);
			
			DynamicGridCell questionNameCell = row.getCells().newCell(this.columnName, DynamicCellType.WRAPTEXT);
			questionNameCell.setReadOnly(true);
			questionNameCell.setValue(collQuestions.get(i).getIQuestionTypeQuestion().getText());
			
			row.setIdentifier(collQuestions.get(i));
			
			if(collQuestions.get(i).getQuestionIsNotNull())
				addAnswers(row, columnsAnswer, collQuestions.get(i));
		}
	}
	
	private void addQuestions(DynamicGridRow pRow, GeneralQuestionAnswerVoCollection collQuestions, boolean previewMode) throws PresentationLogicException
	{
		for (int i = 0; collQuestions != null && i < collQuestions.size(); i++)
		{
			addQuestion(pRow, collQuestions.get(i),previewMode);
		}
	}

	private void addQuestion(DynamicGridRow pRow, GeneralQuestionAnswerVo question, boolean previewMode) throws PresentationLogicException
	{
		Image rowQuestionImage = null;
		if(question.getIQuestionTypeQuestion().getIsQuestionIsNotNull() && question.getIQuestionTypeQuestion().getIsQuestion().equals(Boolean.FALSE))
			rowQuestionImage = this.infoImage;
		else
		{
			rowQuestionImage = this.questionImage;
			if(question.getIQuestionTypeIsMandatory() != null && question.getIQuestionTypeIsMandatory().booleanValue())
				rowQuestionImage = this.mandatoryQuestionImage;
		}
		
		DynamicGridRow row = pRow.getRows().newRow();
		row.setSelectable(false);
		
		row.setCollapsedImage(rowQuestionImage);
		row.setExpandedImage(rowQuestionImage);
		
		DynamicGridCell questionNameCell = row.getCells().newCell(this.gridQuestions.getColumns().getByIdentifier(QUESTION_COLUMN), DynamicCellType.WRAPTEXT);
		questionNameCell.setReadOnly(true);
		questionNameCell.setValue(question.getIQuestionTypeQuestion().getText());
		
		row.setIdentifier(question);
		
		if(question.getQuestionIsNotNull() && previewMode == false)
			addAnswers(row, question);
	}

	private void addAnswers(DynamicGridRow row, GeneralQuestionAnswerVo vo)  throws PresentationLogicException
	{
		if(vo == null || vo.getQuestion() == null)
			return;
		
		if(vo.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < vo.getQuestion().getAnswerTypes().size(); x++)
			{
				if(vo.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
						&& vo.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					boolean readOnlyCell = false;
					addAnswerCell(row, getAnswerColumn(x), vo.getQuestion().getAnswerTypes().get(x), getInstAnswerType(vo.getPatientAnswers(), vo.getQuestion().getAnswerTypes().get(x)), readOnlyCell);														
				}
			}
		}		
	}
	
	//	Gets and Instance of the AnswerDetailsVo based on a QuestionAnswerTypeVo
	private AnswerDetailsVo getInstAnswerType(PatientAssessmentAnswerVoCollection patientAnswers, QuestionAnswerTypeVo configAnswerType)
	{
		if(patientAnswers == null || patientAnswers.size() == 0 || configAnswerType == null)
			return null;
			
		for (int i = 0; i < patientAnswers.size(); i++)
		{
			PatientAssessmentAnswerVo voPatAssAnswerVo = patientAnswers.get(i);
			for (int j = 0; voPatAssAnswerVo != null && j < voPatAssAnswerVo.getAnswerDetails().size(); j++)
			{
				if(voPatAssAnswerVo.getAnswerDetails().get(j).getAnswerTypeIsNotNull() && voPatAssAnswerVo.getAnswerDetails().get(j).getAnswerType().equals(configAnswerType))
				{
					return voPatAssAnswerVo.getAnswerDetails().get(j);
				}
			}
		}
		
		return null;
	}
	
	private DynamicGridCell addAnswerCell(DynamicGridRow row, DynamicGridColumn column, QuestionAnswerTypeVo configAnswer, AnswerDetailsVo instAnswer, boolean readOnly)  throws PresentationLogicException
	{
		checkDataIntegrity(configAnswer);
	
		DynamicCellType cellAnswerType = getCellAnswerType(configAnswer.getAnswerType());
		DynamicGridCell cell = row.getCells().newCell(column, cellAnswerType);
		
		cell.setWidth(getCellAnswerWidth(configAnswer, instAnswer));
		cell.setDecoratorType(DynamicCellDecoratorMode.ALWAYS);
		cell.setIdentifier(configAnswer);
		cell.setReadOnly(readOnly);
		setAnswerCellValue(cell, configAnswer, instAnswer);
		setCellAnswer(cell, instAnswer);
		
		if (instAnswer == null)
		{
			setCellTooltip(cell, configAnswer);
		}
		else //WDEV-16927
		{
			setCellAnswerTooltip(cell, instAnswer);
		}
		
		return cell;
	}
	
	//WDEV-16927
	private void setCellAnswerTooltip(DynamicGridCell cell, AnswerDetailsVo answer)
	{
		if(cell == null || answer == null)
			return;
		
		else if(cell.getType() == DynamicCellType.COMMENT)
		{
			cell.setTooltip(answer.getStringAnswer());
		}
		else if(cell.getType() == DynamicCellType.DATE && answer.getDateAnswer() != null)
		{
			cell.setTooltip(answer.getDateAnswer().toString());
		}
		else if(cell.getType() == DynamicCellType.PARTIALDATE && answer.getPartialDate() != null)
		{
			cell.setTooltip(answer.getPartialDate().toString());
		}
		else if(cell.getType() == DynamicCellType.DECIMAL && answer.getDecimalAnswer() != null)
		{
			cell.setTooltip(answer.getDecimalAnswer().toString());
		}
		else if(cell.getType() == DynamicCellType.INT && answer.getIntegerAnswer() != null)
		{
			cell.setTooltip(answer.getIntegerAnswer().toString());
		}
		else if(cell.getType() == DynamicCellType.STRING)
		{
			cell.setTooltip(answer.getStringAnswer());
		}
		else if(cell.getType() == DynamicCellType.TIME && answer.getTimeAnswer() != null)
		{
			cell.setTooltip(answer.getTimeAnswer().toString());
		}
		else if(cell.getType() == DynamicCellType.WRAPTEXT)
		{
			cell.setTooltip(answer.getStringAnswer());
		}
		
	}

	private void setCellTooltip(DynamicGridCell cell, QuestionAnswerTypeVo configAnswer)
	{
		if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.DATE))
			cell.setTooltip("Select date");
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.DECIMAL))
			cell.setTooltip("Enter decimal value");
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.INTEGER))
			cell.setTooltip("Enter numeric value");
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PARTIALDATE))
			cell.setTooltip("Enter partial date");
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.TEXT))
			cell.setTooltip("Enter text");
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.TIME))
			cell.setTooltip("Enter time");		
	}
	
	private void setAnswerCellValue(DynamicGridCell cell, QuestionAnswerTypeVo configAnswer, AnswerDetailsVo instAnswer) 
	{
		if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
		{
			cell.setTextColor(DEFAULT_SEPARATOR_CELL_TEXT_COLOR);
			cell.setValue(" " + (configAnswer.getSeparatorTextIsNotNull() ? configAnswer.getSeparatorText() : "") + " ");
		}
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
		{
			cell.getItems().clear();
			cell.getItems().newItem(this.optionYes, this.optionYes.getIItemImage());
			cell.getItems().newItem(this.optionNo, this.optionNo.getIItemImage());
		}
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
		{
			setAnswerCellOptions(configAnswer, cell);
		}
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))				
		{
			setAnswerCellOptions(configAnswer, cell);
			
			if(instAnswer != null)
			{
				if(instAnswer.getMaxMultiselectAllowedIsNotNull())
				{
					cell.setMaxCheckedItemsForMultiSelect(instAnswer.getMaxMultiselectAllowed());						
				}
			}
			else
			{
				if(configAnswer.getMaxMultiselectAllowedIsNotNull())
				{
					cell.setMaxCheckedItemsForMultiSelect(configAnswer.getMaxMultiselectAllowed());
				}
			}							
		}
	}
	
	private DynamicCellType getCellAnswerType(ims.core.vo.lookups.QuestionAnswerType answerType)
	{
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.DATE))
			return DynamicCellType.DATE;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.DECIMAL))
			return DynamicCellType.DECIMAL;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.INTEGER))
			return DynamicCellType.INT;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))
			return DynamicCellType.MULTISELECT;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.PARTIALDATE))
			return DynamicCellType.PARTIALDATE;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
			return DynamicCellType.ENUMERATION;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
			return DynamicCellType.DYNAMICLABEL;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.TEXT))
			return DynamicCellType.WRAPTEXT;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.TIME))
			return DynamicCellType.TIME;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
			return DynamicCellType.ANSWER;
		
		return DynamicCellType.EMPTY;		
	}
	
	private int getCellAnswerWidth(QuestionAnswerTypeVo configAnswer, AnswerDetailsVo instAnswer)
	{
		if(configAnswer == null || configAnswer.getAnswerType() == null)
			return 0;
		
		ims.core.vo.lookups.QuestionAnswerType answerType = configAnswer.getAnswerType();
		
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.DATE))
			return DEFAULT_DATE_ANSWER_CELL_WIDTH;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.DECIMAL))
			return DEFAULT_DECIMAL_ANSWER_CELL_WIDTH;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.INTEGER))
			return DEFAULT_INTEGER_ANSWER_CELL_WIDTH;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))
		{
			int defaultMultiSelect = DEFAULT_MULTISELECT_ANSWER_CELL_WIDTH;
			if(instAnswer != null)
				return instAnswer.getAnswerWidth() == null ? defaultMultiSelect : instAnswer.getAnswerWidth().intValue();
			
			return configAnswer.getAnswerWidth() == null ? defaultMultiSelect : configAnswer.getAnswerWidth().intValue();
		}
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.PARTIALDATE))
			return DEFAULT_PARTIALDATE_ANSWER_CELL_WIDTH;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
		{
			if(instAnswer != null)
				return instAnswer.getAnswerWidth() == null ? DEFAULT_PICKLIST_ANSWER_CELL_WIDTH : instAnswer.getAnswerWidth().intValue();
			
			return configAnswer.getAnswerWidth() == null ? DEFAULT_PICKLIST_ANSWER_CELL_WIDTH : configAnswer.getAnswerWidth().intValue();
		}
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
			return DEFAULT_SEPARATOR_ANSWER_CELL_WIDTH;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.TEXT))
		{
			if(instAnswer != null)
				return instAnswer.getAnswerWidth() == null ? DEFAULT_TEXT_ANSWER_CELL_WIDTH : instAnswer.getAnswerWidth().intValue();
			
			return configAnswer.getAnswerWidth() == null ? DEFAULT_TEXT_ANSWER_CELL_WIDTH : configAnswer.getAnswerWidth().intValue();
		}
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.TIME))
			return DEFAULT_TIME_ANSWER_CELL_WIDTH;
		else if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
			return DEFAULT_YESNO_ANSWER_CELL_WIDTH;
		
		return DEFAULT_UNKNOWN_ANSWER_CELL_WIDTH;
	}
	
	private void checkDataIntegrity(QuestionAnswerTypeVo answer) throws PresentationLogicException
	{
		if(answer == null)
			throw new PresentationLogicException("Invalid user assessment question answer");
		if(answer.getAnswerType() == null)
			throw new PresentationLogicException("Invalid user assessment question answer type");
	}

	private DynamicGridColumn getAnswerColumn(int answerIndex)
	{
		DynamicGridColumn column = this.gridQuestions.getColumns().getByIdentifier(new Integer(answerIndex));
		if(column == null)
			column = createAnswerColumn(answerIndex);
		
		return column;
	}
	private DynamicGridColumn createAnswerColumn(int answerIndex) 
	{
		DynamicGridColumn column = this.gridQuestions.getColumns().newColumn("");
		column.setDynamicWidthSupported(true);
		column.setIdentifier(new Integer(answerIndex));
		column.setWidth(100);				
		return column;
	}

	private GeneralQuestionAnswerVoCollection getQuestionsByType(GeneralQuestionAnswerVoCollection questions, OrderQuestionType type) 
	{	
		if(questions == null || type == null)
			return null;
		
		GeneralQuestionAnswerVoCollection voCollQuestionAnswers = new GeneralQuestionAnswerVoCollection();
		for(int i=0;i<questions.size();i++)
		{
			if(questions.get(i).getIQuestionTypeOrderQuestionType().equals(type))
				voCollQuestionAnswers.add(questions.get(i));
		}
		
		return voCollQuestionAnswers.size() > 0 ? voCollQuestionAnswers : null;
	}

	private boolean isQuestionRelevant(QuestionInformationShortVo question, Integer age, Sex sex)
	{
		boolean isRelevant = true;
		if(age != null)
		{
			Integer minAge = question.getAgeRangeMin();
			Integer maxAge = question.getAgeRangeMax();
		
			if(minAge != null)
			{
				if(age.intValue() < minAge.intValue())
					isRelevant = false;
				
				if(maxAge != null)
				{
					if(age.intValue() > maxAge.intValue())
						isRelevant = false;
				}
			}
			else
			{
				if(maxAge != null)
				{
					if(age.intValue() > maxAge.intValue())
						isRelevant = false;
				}
			}
		}
		
		if(sex != null)
		{
			GenderSpecific lkpGender = question.getGenderSpecific();
			if(lkpGender != null)
			{
				if(lkpGender.equals(GenderSpecific.MALE) && !sex.equals(Sex.MALE))
					isRelevant = false;
				else if(lkpGender.equals(GenderSpecific.FEMALE) && !sex.equals(Sex.FEMALE))
					isRelevant = false;
			}
		}
			
		return isRelevant;
	}

	private int getDynamicColumnsNumber(GeneralQuestionAnswerVoCollection questions) 
	{
		if(questions == null)
			return 0;
		
		int max = 0;
		
		for(int x = 0; x < questions.size(); x++)
		{
			IQuestionType question = questions.get(x);
			
			if(question.getIQuestionTypeQuestion().getAnswerTypesIsNotNull())
			{
				int ansersCount = question.getIQuestionTypeQuestion().getAnswerTypes().size();
				if(ansersCount > max)
					max = ansersCount;
			}
		}
		return max;
	}


	private boolean addAnswers(DynamicGridRow row, DynamicGridColumn[] columns, GeneralQuestionAnswerVo question)
	{
		if(row == null || question == null || question.getIQuestionTypeQuestion() == null ||  question.getIQuestionTypeQuestion().getAnswerTypes() == null  || question.getIQuestionTypeQuestion().getAnswerTypes().size() == 0)
			return false;
			
		for(int x = 0; x < question.getIQuestionTypeQuestion().getAnswerTypes().size(); x++)
		{
			QuestionAnswerTypeVo answer = question.getIQuestionTypeQuestion().getAnswerTypes().get(x);
			if(answer != null)
			{
				QuestionAnswerType type = answer.getAnswerType();
				DynamicCellType cellType = getQuestionAnswerType(type);
				DynamicGridCell answerCell = row.getCells().newCell(columns[x], getQuestionAnswerType(type));
				answerCell.setWidth(getAnswerCellWidth(cellType));
				answerCell.setReadOnly(false);
				
				setAnswerCellValue(answerCell, answer);
				
				if(cellType == DynamicCellType.DYNAMICLABEL || cellType == DynamicCellType.BOOL)
					answerCell.setDecoratorType(DynamicCellDecoratorMode.NEVER);
				else
					answerCell.setDecoratorType(DynamicCellDecoratorMode.ALWAYS);
				
				answerCell.setTooltip(getAnswerCellTooltip(cellType));
				answerCell.setIdentifier(answer);
				
				addAnswerData(row, question);
			}
		}
		
		return true;		
	}
	
	private void addAnswerData(DynamicGridRow row,  GeneralQuestionAnswerVo voQuestionAnswer)
	{
		if(voQuestionAnswer.getPatientAnswers() == null)
			return;
		
		for(int x = 0; x < voQuestionAnswer.getPatientAnswers().get(0).getAnswerDetails().size(); x++)
		{
			AnswerDetailsVo answer = voQuestionAnswer.getPatientAnswers().get(0).getAnswerDetails().get(x);
			DynamicGridCell cell = findCell(row, answer.getAnswerType());
			
			if(cell != null)
			{
				setCellAnswer(cell, answer);
			}
		}
	}
	
	public void setCellAnswer(DynamicGridCell cell, AnswerDetailsVo answer)
	{
		if(cell == null)
			return;
		if(answer == null)
			return;
		
		if(cell.getType() == DynamicCellType.ANSWER)
		{
			if(answer.getBoolValueAnswerIsNotNull())
				cell.setValue(answer.getBoolValueAnswer().booleanValue() ? this.optionYes : this.optionNo);
			else
				cell.setValue(null);
		}
		else if(cell.getType() == DynamicCellType.COMMENT)
		{
			cell.setValue(answer.getStringAnswer());
		}
		else if(cell.getType() == DynamicCellType.DATE)
		{
			cell.setValue(answer.getDateAnswer());
		}
		else if(cell.getType() == DynamicCellType.PARTIALDATE)
		{
			cell.setValue(answer.getPartialDate());
		}
		else if(cell.getType() == DynamicCellType.DECIMAL)
		{
			cell.setValue(answer.getDecimalAnswer());
		}
		else if(cell.getType() == DynamicCellType.ENUMERATION)
		{
			cell.setValue(answer.getPicklist());			
		}
		else if(cell.getType() == DynamicCellType.INT)
		{
			cell.setValue(answer.getIntegerAnswer());
		}
		else if(cell.getType() == DynamicCellType.STRING)
		{
			cell.setValue(answer.getStringAnswer());
		}
		else if(cell.getType() == DynamicCellType.TIME)
		{
			cell.setValue(answer.getTimeAnswer());
		}
		else if(cell.getType() == DynamicCellType.WRAPTEXT)
		{
			cell.setValue(answer.getStringAnswer());
		}
		else if(cell.getType() == DynamicCellType.MULTISELECT)
		{			
			setCellMultiAnswer(cell, answer.getMultiSelectAnswers());
		}
	}
	
	private void setCellMultiAnswer(DynamicGridCell cell, AnswerOptionVoCollection items)
	{
		if(!cell.getType().equals(DynamicCellType.MULTISELECT))
			throw new CodingRuntimeException("Multiple answer should be collected only for multiselect cells");
		
		if(cell.getItems() != null)
		{
			for(int x = 0; x < cell.getItems().size(); x++)
			{
				boolean checked = false;
				
				if(items != null)
				{
					for(int y = 0; y < items.size(); y++)
					{
						if(cell.getItems().get(x).getIdentifier() != null 
								&& cell.getItems().get(x).getIdentifier().equals(items.get(y)))
						{
							checked = true;
							break;
						}
					}
				}
				
				cell.getItems().get(x).setChecked(checked);
			}
		}
	}
	
	private DynamicGridCell findCell(DynamicGridRow questionRow, QuestionAnswerTypeVo answerType)
	{
		if(questionRow == null)
			return null;
		if(answerType == null)
			return null;
		for(int x = 0; x < this.gridQuestions.getColumns().size(); x++)
		{
			DynamicGridCell cell = questionRow.getCells().get(this.gridQuestions.getColumns().get(x));
			
			if(cell != null && cell.getIdentifier() != null && cell.getIdentifier() instanceof QuestionAnswerTypeVo)
			{										
				if(cell.getIdentifier().equals(answerType))
					return cell;
			}			
		}
		
		return null;
	}

	private void setAnswerCellValue(DynamicGridCell cell, QuestionAnswerTypeVo configAnswer) 
	{
		if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
		{
			cell.setTextColor(DEFAULT_SEPARATOR_CELL_TEXT_COLOR);
			cell.setValue(" " + (configAnswer.getSeparatorTextIsNotNull() ? configAnswer.getSeparatorText() : "") + " ");
		}
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
		{
			cell.getItems().clear();
			cell.getItems().newItem(this.optionYes);
			cell.getItems().newItem(this.optionNo);
		}
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
		{
			setAnswerCellOptions(configAnswer, cell);
		}
		else if(configAnswer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))				
		{
			setAnswerCellOptions(configAnswer, cell);
			if(configAnswer.getMaxMultiselectAllowedIsNotNull())
			{
				cell.setMaxCheckedItemsForMultiSelect(configAnswer.getMaxMultiselectAllowed());
			}								
		}
	}	
	
	private void setAnswerCellOptions(QuestionAnswerTypeVo answer, DynamicGridCell cell) 
	{
		cell.getItems().clear();
		int maxVisibleItems = 0;
		if(answer.getOptionsIsNotNull())
		{
			for(int x = 0; x < answer.getOptions().size(); x++)
			{
				AnswerOptionVo answerItem = answer.getOptions().get(x);									
				if(answerItem != null)
				{
/*					//WDEV-1631 - When Viewing an Instantiated Assessment i simply want to see all the question and answered given, in edit mode i want to see all the questions and answer options. 
					if(displayAnsweredOnly && isNotAnswered(answerItem, instAnswer))
						continue;*/
					DynamicGridCellItem item = cell.getItems().newItem(answerItem);				
					item.setIdentifier(answerItem);
					maxVisibleItems++;
					if(answerItem.getColourIsNotNull() 
							&& answer.getAnswerTypeIsNotNull() 
							&& answer.getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))
					{
						item.setMarkerColor(answerItem.getColour());					
					}
				}
			}			
		}		
		
		cell.setMaxVisibleItemsForMultiSelect(maxVisibleItems == 0?1:maxVisibleItems);
	}
	
	private int getAnswerCellWidth(DynamicCellType cellType)
	{
		if(cellType == null)
			return 0;
		
		if(cellType.equals(DynamicCellType.ANSWER))
			return 30;
		if(cellType.equals(DynamicCellType.BOOL))
			return 30;
		if(cellType.equals(DynamicCellType.BUTTON))
			return 50;
		if(cellType.equals(DynamicCellType.COMMENT))
			return 250;
		if(cellType.equals(DynamicCellType.DATE))
			return 80;
		if(cellType.equals(DynamicCellType.DECIMAL))
			return 60;
		if(cellType.equals(DynamicCellType.EMPTY))
			return 0;
		if(cellType.equals(DynamicCellType.ENUMERATION))
			return 150;
		if(cellType.equals(DynamicCellType.HTMLVIEW))
			return 250;
		if(cellType.equals(DynamicCellType.IMAGE))
			return 25;
		if(cellType.equals(DynamicCellType.INT))
			return 60;
		if(cellType.equals(DynamicCellType.LABEL))
			return 70;
		if(cellType.equals(DynamicCellType.MULTISELECT))
			return 180;
		if(cellType.equals(DynamicCellType.PARTIALDATE))
			return 70;
		if(cellType.equals(DynamicCellType.QUERYCOMBOBOX))
			return 150;
		if(cellType.equals(DynamicCellType.STRING))
			return 250;
		if(cellType.equals(DynamicCellType.TIME))
			return 40;
		if(cellType.equals(DynamicCellType.WRAPTEXT))
			return 250;
		if(cellType.equals(DynamicCellType.DYNAMICLABEL))
			return 50;
		
		return 100;
	}	
	private String getAnswerCellTooltip(DynamicCellType cellType)
	{
		if(cellType == null)
			return "";
		
		if(cellType.equals(DynamicCellType.ANSWER))
			return "Select an answer";
		if(cellType.equals(DynamicCellType.BOOL))
			return "";
		if(cellType.equals(DynamicCellType.BUTTON))
			return "";
		if(cellType.equals(DynamicCellType.COMMENT))
			return "Enter comment";
		if(cellType.equals(DynamicCellType.DATE))
			return "Select date";
		if(cellType.equals(DynamicCellType.DECIMAL))
			return "Enter decimal value";
		if(cellType.equals(DynamicCellType.EMPTY))
			return "";
		if(cellType.equals(DynamicCellType.ENUMERATION))
			return "Select an item from list";
		if(cellType.equals(DynamicCellType.HTMLVIEW))
			return "";
		if(cellType.equals(DynamicCellType.IMAGE))
			return "";
		if(cellType.equals(DynamicCellType.INT))
			return "Enter integer value";
		if(cellType.equals(DynamicCellType.LABEL))
			return "";
		if(cellType.equals(DynamicCellType.MULTISELECT))
			return "Select one or more items";
		if(cellType.equals(DynamicCellType.PARTIALDATE))
			return "Enter partial date value";
		if(cellType.equals(DynamicCellType.QUERYCOMBOBOX))
			return "Search and select an item";
		if(cellType.equals(DynamicCellType.STRING))
			return "Enter text";
		if(cellType.equals(DynamicCellType.TIME))
			return "Enter time value";
		if(cellType.equals(DynamicCellType.WRAPTEXT))
			return "Enter multiline text";
		if(cellType.equals(DynamicCellType.DYNAMICLABEL))
			return "";
		
		return "";
	}
	private DynamicCellType getQuestionAnswerType(QuestionAnswerType answerType)
	{
		if(answerType == null)
			return DynamicCellType.EMPTY;
		
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.DATE))
			return DynamicCellType.DATE;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.DECIMAL))
			return DynamicCellType.DECIMAL;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.INTEGER))
			return DynamicCellType.INT;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
			return DynamicCellType.ENUMERATION;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.TEXT))
			return DynamicCellType.WRAPTEXT;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.TIME))
			return DynamicCellType.TIME;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
			return DynamicCellType.ANSWER;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))
			return DynamicCellType.MULTISELECT;
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.PARTIALDATE))
			return DynamicCellType.PARTIALDATE;		
		if(answerType.equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
			return DynamicCellType.LABEL;		
		
		return DynamicCellType.EMPTY;
	}
	

	private AnswerDetailsVo getCellAnswer(DynamicGridCell cell)
	{
		if(cell == null)
			return null;
		
			AnswerDetailsVo answerDetails = null;
			QuestionAnswerTypeVo config =  null;
			
			if(cell.getIdentifier() instanceof AnswerCellData)
			{
				answerDetails = ((AnswerCellData)cell.getIdentifier()).getInstData();
				config = ((AnswerCellData)cell.getIdentifier()).getConfigData();
			}
			else if(cell.getIdentifier() instanceof QuestionAnswerTypeVo)
			{
				config = (QuestionAnswerTypeVo)cell.getIdentifier();
			}
			
			if(answerDetails == null)
				answerDetails = new AnswerDetailsVo();
			
			answerDetails.setAnswerType(config);	
		
		if(cell.getType() == DynamicCellType.ANSWER)
		{
			if(cell.getValue() == null)
			{
				answerDetails.setBoolValueAnswer(null);
			}
			else
			{
				if(cell.getValue().equals(this.optionYes))
					answerDetails.setBoolValueAnswer(Boolean.TRUE);
				else
					answerDetails.setBoolValueAnswer(Boolean.FALSE);
			}
		}
		else if(cell.getType() == DynamicCellType.COMMENT)
		{
			answerDetails.setAnswerWidth(new Integer(cell.getWidth()));
			answerDetails.setStringAnswer((String)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.DATE)
		{
			answerDetails.setDateAnswer((Date)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.PARTIALDATE)
		{
			answerDetails.setPartialDate((PartialDate)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.DECIMAL)
		{
			answerDetails.setDecimalAnswer((Float)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.ENUMERATION)
		{
			answerDetails.setAnswerWidth(new Integer(cell.getWidth()));
			answerDetails.setPicklist((AnswerOptionVo)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.INT)
		{
			answerDetails.setIntegerAnswer((Integer)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.STRING)
		{
			answerDetails.setAnswerWidth(new Integer(cell.getWidth()));
			answerDetails.setStringAnswer((String)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.TIME)
		{
			answerDetails.setTimeAnswer((Time)cell.getValue());
		}
		else if(cell.getType() == DynamicCellType.WRAPTEXT)
		{
			answerDetails.setAnswerWidth(new Integer(cell.getWidth()));
			answerDetails.setStringAnswer(cell.getValue() != null?(String)cell.getValue():"");
		}
		else if(cell.getType() == DynamicCellType.MULTISELECT)
		{
			answerDetails.setAnswerWidth(new Integer(cell.getWidth()));
			answerDetails.setMaxMultiselectAllowed(cell.getMaxCheckedItemsForMultiSelect());
			answerDetails.setMultiSelectAnswers(getCellMultiAnswer(cell));
		}
		
		return answerDetails;
	}	
	
	private AnswerOptionVoCollection getCellMultiAnswer(DynamicGridCell cell)
	{
		if(!cell.getType().equals(DynamicCellType.MULTISELECT))
			throw new CodingRuntimeException("Multiple answer should be collected only for multiselect cells");
		
		AnswerOptionVoCollection result = new AnswerOptionVoCollection();
		
		for(int x = 0; x < cell.getItems().size(); x++)
		{
			if(cell.getItems().get(x).isChecked())
			{
				result.add((AnswerOptionVo)cell.getItems().get(x).getIdentifier());
			}
		}
		
		return result;
	}
	

	public void setGridQuestions(DynamicGrid gridQuestions)
	{
		this.gridQuestions = gridQuestions;
	}
	
	public void setQuestionOrInformation(String questionOrInformation)
	{
		this.questionOrInformation = questionOrInformation;
	}
	
	public void setInfoImage(Image infoImage)
	{
		this.infoImage = infoImage;
	}
	
	public void addTooltips(QuestionTooltipVoCollection questionTooltips)
	{
		if(questionTooltips == null)
			return;
		
		QuestionInformationShortVo voQuestInfoShort = null;
		DynamicGridRow pRow;
		for(int i=0;i<gridQuestions.getRows().size();i++)
		{
			pRow = gridQuestions.getRows().get(i);
			for(int p=0;p<pRow.getRows().size();p++)
			{
				DynamicGridRow cRow = pRow.getRows().get(p);
				if(cRow.getIdentifier() != null)
				{
					if(cRow.getIdentifier() instanceof IQuestionType)
						voQuestInfoShort = ((IQuestionType)cRow.getIdentifier()).getIQuestionTypeQuestion();
				}
				
				if(voQuestInfoShort != null)
				{
					for(int j=0; j<questionTooltips.size(); j++)
					{
						if(voQuestInfoShort.getID_QuestionInformationIsNotNull() && questionTooltips.get(j).getQuestionIDIsNotNull())
						{
							if(voQuestInfoShort.getID_QuestionInformation().equals(questionTooltips.get(j).getQuestionID()))
							{
								DynamicGridCell cellName = cRow.getCells().get(columnName);
								cellName.setTooltip(questionTooltips.get(j).getTooltip());
							}
						}
					}
				}		
			}	
		}
	}
	
	public static String getTextualQuestionAndAnswers(OcsQASessionVo ocsQASessionVo)
	{
		GeneralQuestionAnswerVoCollection questions = getGeneralQuestionAnswerCollection(ocsQASessionVo);
		return getTextualQuestionAndAnswers(questions, false);
	}
	
	public static String getTextualQuestionAndAnswers(GeneralQuestionAnswerVoCollection questions)
	{
		return getTextualQuestionAndAnswers(questions, false);
	}
	
	public static String getTextualQuestionAndAnswers(GeneralQuestionAnswerVoCollection questions, boolean useShort)
	{
		if (questions == null)
			return null;

		StringBuffer sb = new StringBuffer();
		String prefix = "";
		for (int i = 0; i < questions.size(); i++)
		{
			GeneralQuestionAnswerVo vo = questions.get(i);
			
			if(vo.getPatientAnswers() == null || vo.getPatientAnswers().size() == 0)
				continue;
			
			if (i > 0)
				prefix = ". ";
			
			if (useShort)
				sb.append(prefix + vo.getQuestion().getShortText() + " : ");
			else
			{
				sb.append((i>0 ? "\r" : "")  + "Question : " + vo.getQuestion().getText() + "\r");
			}
				
			
			for (int p = 0; p < vo.getPatientAnswers().size(); p++)
			{
				if (!useShort)
					sb.append("Answer(s) ");

				AnswerDetailsVoCollection answerColl = vo.getPatientAnswers().get(p).getAnswerDetails();
				if (answerColl != null)
				{
					for (int j=0; j<answerColl.size(); j++)
					{
						AnswerDetailsVo ans = answerColl.get(j);
						QuestionAnswerTypeVo ansType = ans.getAnswerType();
						if (ansType == null || ansType.getAnswerType() == null)
							continue;
						if (ansType.getAnswerType().equals(QuestionAnswerType.DATE))
							sb.append(ans.getDateAnswer());
						else if (ansType.getAnswerType().equals(QuestionAnswerType.DECIMAL))
							sb.append(ans.getDecimalAnswer());
						else if (ansType.getAnswerType().equals(QuestionAnswerType.INTEGER))
							sb.append(ans.getIntegerAnswer());
						else if (ansType.getAnswerType().equals(QuestionAnswerType.MULTISELECT))
						{
							if (useShort)
								sb.append("(");
							String comma = "";
							int countAns = ans.getMultiSelectAnswers().size();
							for (int k=0; k<countAns; k++)
							{
								AnswerOptionVo multi = ans.getMultiSelectAnswers().get(k);
								if (useShort)
								{
									sb.append(comma + multi.getOptionText());
									comma = ",";
								}
								else
								{
									sb.append(comma + multi.getOptionText());
									comma = ",";
								}
							}
							if (useShort)
								sb.append(")");
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
							sb.append(ans.getPartialDate());
						else if (ansType.getAnswerType().equals(QuestionAnswerType.PICKLIST))
						{
							if(ans.getPicklist() != null)
								sb.append(ans.getPicklist().getOptionText());
						}
							
						else if (ansType.getAnswerType().equals(QuestionAnswerType.TEXT))
							sb.append(ans.getStringAnswer());
						else if (ansType.getAnswerType().equals(QuestionAnswerType.TIME))
							sb.append(ans.getTimeAnswer());
						else if (ansType.getAnswerType().equals(QuestionAnswerType.YESNO))
							if (!ans.getBoolValueAnswerIsNotNull())
								sb.append("Not Specified");
							else if (ans.getBoolValueAnswer().booleanValue() == true)
								sb.append("Yes");
							else
								sb.append("No");
					}
					if (useShort)
						sb.append(", ");
					else
						sb.append("\r");
				}
			}
		}
		return sb.toString();
	}
	
	private static GeneralQuestionAnswerVoCollection getGeneralQuestionAnswerCollection(OcsQASessionVo voOcsQASession)
	{
		GeneralQuestionAnswerVoCollection voColl = new GeneralQuestionAnswerVoCollection();

		for (int j = 0; voOcsQASession != null && voOcsQASession.getCategoryQuestionAnswersIsNotNull() && j < voOcsQASession.getCategoryQuestionAnswers().size(); j++)
		{
			CategoryQuestionAnswerVo voCatQAnswer = voOcsQASession.getCategoryQuestionAnswers().get(j);

			// Category
			for (int k = 0; k < voCatQAnswer.getCategoryQuestionAnswers().size(); k++)
			{
				voColl.add(voCatQAnswer.getCategoryQuestionAnswers().get(k));
			}

			// Service
			for (int k = 0; k < voCatQAnswer.getServiceQuestionAnswers().size(); k++)
			{
				ServiceQuestionAnswerVo voServiceQAnswer = voCatQAnswer.getServiceQuestionAnswers().get(k);
				for (int index = 0; index < voServiceQAnswer.getServiceQuestionAnswers().size(); index++)
				{
					voColl.add(voServiceQAnswer.getServiceQuestionAnswers().get(index));
				}

				for (int i = 0; i < voServiceQAnswer.getInvestigationQuestionAnswers().size(); i++)
				{
					InvestigationQuestionAnswerVo voSQAnswer = voServiceQAnswer.getInvestigationQuestionAnswers().get(i);
					for (int index = 0; voSQAnswer != null && index < voSQAnswer.getInvestigationQuestionAnswers().size(); index++)
					{
						voColl.add(voSQAnswer.getInvestigationQuestionAnswers().get(index));
					}
				}
			}
		}

		return voColl;
	}
	
	public String[] validateAnswers()
	{
		OcsQASessionVo voValidate = new OcsQASessionVo();
		voValidate = this.getAnswers(voValidate);
	
		ArrayList<String> errors = new ArrayList<String>();
		if (voValidate != null)
		{
			for (int i = 0; voValidate.getCategoryQuestionAnswersIsNotNull() && i < voValidate.getCategoryQuestionAnswers().size(); i++)
			{
				CategoryQuestionAnswerVo voCQA = voValidate.getCategoryQuestionAnswers().get(i);

				// Category Questions
				getMandatoryQuestionErrors(errors, voCQA.getCategoryQuestionAnswers(), voCQA.getCategory().toString());

				for (int j = 0; j < voCQA.getServiceQuestionAnswers().size(); j++)
				{
					ServiceQuestionAnswerVo voSQA = voCQA.getServiceQuestionAnswers().get(j);
					//ServiceQuestions
					getMandatoryQuestionErrors(errors, voSQA.getServiceQuestionAnswers(), voSQA.getService().getServiceName());
					
					for (int k = 0; k < voSQA.getInvestigationQuestionAnswers().size(); k++)
					{
						InvestigationQuestionAnswerVo voIQA = voSQA.getInvestigationQuestionAnswers().get(k);
						//Investigation Questions
						getMandatoryQuestionErrors(errors, voIQA.getInvestigationQuestionAnswers(), voIQA.getInvestigation().getInvestigationIndex().getName());
					}
				}
			}
		}

		if (errors.size() > 0)
		{
			String[] errs = new String[errors.size()];
			errors.toArray(errs);
			return errs;
		}

		return null;
	}
	
	/*1. In the case when a question is marked as mandatory at Category/Investigation/Service level. 
    - at least one answer has to be provided if the questions doesn't contain any mandatory answers. The message displayed will be: " 'Q1' - At least one Answer is mandatory" 
    - if the question has mandatory answers then all the mandatory answers have to be provided. The message displayed will be: " 'Q1' - answer(s) is/are mandatory - Mandatory Message1, Mandatory message 2, (etc)" 
	2. When a question is not marked as mandatory at Category/Investigation/Service level and when the question contains mandatory answers then if we answer the question (that means providing at least one answer) then all the mandatory answers should be provided. The message displayed will be: " 'Q1' - answer(s) is/are mandatory - Mandatory Message1, Mandatory message 2, (etc)"*/
	private void getMandatoryQuestionErrors(ArrayList<String> errors, GeneralQuestionAnswerVoCollection voColl, String headerText)
	{
		boolean newHeader = true;
		for (int j = 0; voColl != null && j < voColl.size(); j++)
		{
			GeneralQuestionAnswerVo voGQA = voColl.get(j);

			QuestionInformationShortVo question = voGQA.getQuestion();

			boolean isQuestion = question.getIsQuestion().booleanValue();
			boolean isMandatory = voGQA.getWasMandatoryIsNotNull() ? voGQA.getWasMandatory().booleanValue() : false;

			if (isQuestion)
			{
				if(isMandatory)
				{
					if (hasMandatoryAnswers(voGQA))
					{
						ArrayList<String> mandatoryAnswers = getMandatoryAnswers(voGQA);
						if (mandatoryAnswers != null && mandatoryAnswers.size() > 0)
						{
							if (newHeader)
							{
								errors.add(headerText + ":\n");
								newHeader = false;
							}
	
							String header = "'" + question.getText() + "' - " + (mandatoryAnswers.size() >  1 ? " Answers are mandatory" : " An answer is mandatory");
							for (String answ : mandatoryAnswers)
							{
								if (answ != null && answ.length() > 0)
								{	
									header += " - ";
									break;
								}
							}
							mandatoryAnswers.add(0, header);
							errors.add(getAnswersFlat(mandatoryAnswers));
						}
					}
					else if (isHasAtLeastOneAnswer(voGQA.getPatientAnswers()) == false)
					{
						if (newHeader)
						{
							errors.add(headerText + ":\n");
							newHeader = false;
						}
	
						errors.add("'" + question.getText() + "'" + " - At least one answer is mandatory");
					}
				}
				else
				{
					if(isHasAtLeastOneAnswer(voGQA.getPatientAnswers()) && hasMandatoryAnswers(voGQA))
					{
						ArrayList<String> mandatoryAnswers = getMandatoryAnswers(voGQA);
						if (mandatoryAnswers != null && mandatoryAnswers.size() > 0)
						{
							if (newHeader)
							{
								errors.add(headerText + ":\n");
								newHeader = false;
							}
	
							String header = "'" + question.getText() + "' - " + (mandatoryAnswers.size() > 1 ? " Answers are mandatory" : " An answer is mandatory");
							for (String answ : mandatoryAnswers)
							{
								if (answ != null && answ.length() > 0)
								{	
									header += " - ";
									break;
								}
							}
							mandatoryAnswers.add(0, header);
							errors.add(getAnswersFlat(mandatoryAnswers));
						}
					}
				}
			}
		}
	}
	
	private String getAnswersFlat(ArrayList<String> mandatoryAnswers)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; mandatoryAnswers != null && i < mandatoryAnswers.size(); i++)
			sb.append(mandatoryAnswers.get(i));
			
		return sb.toString();
	}

	private boolean hasMandatoryAnswers(GeneralQuestionAnswerVo voGQA)
	{
		if(voGQA == null)
			return false;
		
		for (int j = 0; j < voGQA.getPatientAnswers().size(); j++)
		{
			PatientAssessmentAnswerVo voPAA = voGQA.getPatientAnswers().get(j);
			for (int k = 0; k < voPAA.getAnswerDetails().size(); k++)
			{
				if (voPAA.getAnswerDetails().get(k).getAnswerType().getIsMandatoryIsNotNull() && voPAA.getAnswerDetails().get(k).getAnswerType().getIsMandatory().booleanValue())
				{
					return true;
				}
			}
		}

		return false;
	}
	
	private ArrayList<String> getMandatoryAnswers(GeneralQuestionAnswerVo voGQA)
	{
		ArrayList<String> errors = null;
		String separator = ", ";

		for (int j = 0; j < voGQA.getPatientAnswers().size(); j++)
		{
			PatientAssessmentAnswerVo voPAA = voGQA.getPatientAnswers().get(j);
			for (int k = 0; k < voPAA.getAnswerDetails().size(); k++)
			{
				// Check if answer is mandatory
				if (voPAA.getAnswerDetails().get(k).getAnswerType().getIsMandatoryIsNotNull() && voPAA.getAnswerDetails().get(k).getAnswerType().getIsMandatory().booleanValue())
				{
					if (isAnswered(voPAA.getAnswerDetails().get(k)) == false)
					{
						if (errors == null)
							errors = new ArrayList<String>();
						
						//Add the mandatory validation message only if not null or size > 0 WDEV-17050
						errors.add(voPAA.getAnswerDetails().get(k).getAnswerType().getMandatoryValMessageIsNotNull() && voPAA.getAnswerDetails().get(k).getAnswerType().getMandatoryValMessage().trim().length() > 0 ? voPAA.getAnswerDetails().get(k).getAnswerType().getMandatoryValMessage() : "");
						errors.add(voPAA.getAnswerDetails().get(k).getAnswerType().getMandatoryValMessageIsNotNull() && voPAA.getAnswerDetails().get(k).getAnswerType().getMandatoryValMessage().trim().length() > 0 ? separator: "" );
					}
				}
			}
		}

		//Remove last separator ", "
		if(errors != null && errors.size() > 0)
			errors.remove(errors.size() - 1);
		
		return errors;
	}
	
	private boolean isHasAtLeastOneAnswer(PatientAssessmentAnswerVoCollection patientAnswers)
	{
		if(patientAnswers == null || patientAnswers.size() == 0)
			return false;
		
		for (int i = 0; i < patientAnswers.size(); i++)
		{
			for (int j = 0; j < patientAnswers.get(i).getAnswerDetails().size(); j++)
			{
				if(isAnswered(patientAnswers.get(i).getAnswerDetails().get(j)))
					return true;
			}
		}
		return false;
	}
	
	private boolean isAnswered(AnswerDetailsVo answerDetail)
	{
		if(answerDetail == null || answerDetail.getAnswerType() == null || answerDetail.getAnswerType().getAnswerType() == null)
			return false;
		
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.DATE))
			return answerDetail.getDateAnswerIsNotNull();
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.DECIMAL))
			return answerDetail.getDecimalAnswerIsNotNull();
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.INTEGER))
			return answerDetail.getIntegerAnswerIsNotNull();
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.MULTISELECT))
			return answerDetail.getMultiSelectAnswersIsNotNull() && answerDetail.getMultiSelectAnswers().size() > 0; 
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
			return answerDetail.getPartialDateIsNotNull();
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.PICKLIST))
			return answerDetail.getPicklistIsNotNull();
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.TEXT))
			return answerDetail.getStringAnswerIsNotNull() && answerDetail.getStringAnswer().trim().length() > 0;
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.TIME))
			return answerDetail.getTimeAnswerIsNotNull();
		if(answerDetail.getAnswerType().getAnswerType().equals(QuestionAnswerType.YESNO))
			return answerDetail.getBoolValueAnswerIsNotNull();
		
		return false;
	}
	
	
	private static final Color		DEFAULT_SEPARATOR_CELL_TEXT_COLOR		= Color.Blue;
	private static final Integer	QUESTION_COLUMN							= new Integer(-1);

	// Default Values
	private static final int		DEFAULT_QUESTION_COLUMN_WIDTH			= 450; //290 was the old value modified to 450 for WDEV-15814
	private static final int		DEFAULT_YESNO_ANSWER_CELL_WIDTH			= 25;
	private static final int		DEFAULT_TIME_ANSWER_CELL_WIDTH			= 80;
	private static final int		DEFAULT_TEXT_ANSWER_CELL_WIDTH			= 200;
	private static final int		DEFAULT_SEPARATOR_ANSWER_CELL_WIDTH		= 20;
	private static final int		DEFAULT_PICKLIST_ANSWER_CELL_WIDTH		= 200;
	private static final int		DEFAULT_PARTIALDATE_ANSWER_CELL_WIDTH	= 80;
	private static final int		DEFAULT_INTEGER_ANSWER_CELL_WIDTH		= 80;
	private static final int		DEFAULT_DECIMAL_ANSWER_CELL_WIDTH		= 80;
	private static final int		DEFAULT_DATE_ANSWER_CELL_WIDTH			= 100;
	private static final int		DEFAULT_MULTISELECT_ANSWER_CELL_WIDTH	= 250;
	private static final int		DEFAULT_UNKNOWN_ANSWER_CELL_WIDTH		= 10;

	
	private void setAge(Integer age)
	{
		this.patientAge = age;		
	}
	
	private Integer getAge()
	{
		return patientAge;
	}
	
	private Sex getSex()
	{
		return patientSex;
	}
	
	private void setSex(Sex sex)
	{
		this.patientSex = sex;
	}
}
