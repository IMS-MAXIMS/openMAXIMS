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


import ims.admin.vo.lookups.GenderSpecific;
import ims.assessment.configuration.vo.AssessmentQuestionRefVo;
import ims.assessment.vo.Answer_DetailsVo;
import ims.assessment.vo.Answer_DetailsVoCollection;
import ims.assessment.vo.Answer_OptionVo;
import ims.assessment.vo.Answer_OptionVoCollection;
import ims.assessment.vo.Assessment_QuestionGroupVo;
import ims.assessment.vo.Assessment_QuestionGroupVoCollection;
import ims.assessment.vo.Assessment_QuestionVo;
import ims.assessment.vo.Assessment_QuestionVoCollection;
import ims.assessment.vo.GraphicAssessmentFindingQuestionVo;
import ims.assessment.vo.GraphicAssessmentFindingVo;
import ims.assessment.vo.GraphicAssessmentQuestionVo;
import ims.assessment.vo.GraphicAssessmentVo;
import ims.assessment.vo.Graphic_AssessmentFindingQuestionVo;
import ims.assessment.vo.Graphic_AssessmentFindingVo;
import ims.assessment.vo.Graphic_AssessmentQuestionVo;
import ims.assessment.vo.Graphic_AssessmentVo;
import ims.assessment.vo.PatientAssessmentAnswerVo;
import ims.assessment.vo.PatientAssessmentAnswerVoCollection;
import ims.assessment.vo.PatientAssessmentDataVo;
import ims.assessment.vo.PatientAssessmentGroupVo;
import ims.assessment.vo.PatientAssessmentGroupVoCollection;
import ims.assessment.vo.PatientAssessmentQuestionVo;
import ims.assessment.vo.PatientAssessmentQuestionVoCollection;
import ims.assessment.vo.PatientAssessmentVo;
import ims.assessment.vo.PatientGraphicAssessmentFindingQuestionAnswerVo;
import ims.assessment.vo.PatientGraphicAssessmentFindingQuestionAnswerVoCollection;
import ims.assessment.vo.PatientGraphicAssessmentFindingVo;
import ims.assessment.vo.PatientGraphicAssessmentFindingVoCollection;
import ims.assessment.vo.PatientGraphicAssessmentQuestionAnswerVo;
import ims.assessment.vo.PatientGraphicAssessmentQuestionAnswerVoCollection;
import ims.assessment.vo.PatientGraphicAssessmentVo;
import ims.assessment.vo.PatientGraphicAssessmentVoCollection;
import ims.assessment.vo.PatientGraphicalAssessmentStageVo;
import ims.assessment.vo.PatientGraphicalAssessmentStageVoCollection;
import ims.assessment.vo.Patient_AssessmentAnswerVo;
import ims.assessment.vo.Patient_AssessmentAnswerVoCollection;
import ims.assessment.vo.Patient_AssessmentDataVo;
import ims.assessment.vo.Patient_AssessmentGroupVo;
import ims.assessment.vo.Patient_AssessmentGroupVoCollection;
import ims.assessment.vo.Patient_AssessmentQuestionVo;
import ims.assessment.vo.Patient_AssessmentQuestionVoCollection;
import ims.assessment.vo.Patient_AssessmentVo;
import ims.assessment.vo.Patient_GraphicAssessmentFindingQuestionAnswerVo;
import ims.assessment.vo.Patient_GraphicAssessmentFindingQuestionAnswerVoCollection;
import ims.assessment.vo.Patient_GraphicAssessmentFindingVo;
import ims.assessment.vo.Patient_GraphicAssessmentFindingVoCollection;
import ims.assessment.vo.Patient_GraphicAssessmentQuestionAnswerVo;
import ims.assessment.vo.Patient_GraphicAssessmentQuestionAnswerVoCollection;
import ims.assessment.vo.Patient_GraphicAssessmentVo;
import ims.assessment.vo.Patient_GraphicAssessmentVoCollection;
import ims.assessment.vo.Patient_GraphicalAssessmentStageVo;
import ims.assessment.vo.Patient_GraphicalAssessmentStageVoCollection;
import ims.assessment.vo.Question_AnswerTypeVo;
import ims.assessment.vo.Question_InformationVo;
import ims.assessment.vo.UserAssessmentVo;
import ims.assessment.vo.User_AssessmentVo;
import ims.assessment.vo.enums.DPPScore;
import ims.assessment.vo.lookups.AnswerStatus;
import ims.core.vo.AnswerDetailsVo;
import ims.core.vo.AnswerDetailsVoCollection;
import ims.core.vo.AnswerOptionVo;
import ims.core.vo.AnswerOptionVoCollection;
import ims.core.vo.AssessmentQuestionGroupVo;
import ims.core.vo.AssessmentQuestionGroupVoCollection;
import ims.core.vo.AssessmentQuestionVo;
import ims.core.vo.AssessmentQuestionVoCollection;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.GeneralQuestionAnswerVo;
import ims.core.vo.GeneralQuestionAnswerVoCollection;
import ims.core.vo.PatientAssessmentInfoVo;
import ims.core.vo.QuestionAnswerTypeVo;
import ims.core.vo.QuestionInformationVo;
import ims.core.vo.lookups.PatientAssessmentStatusReason;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.QuestionAnswerType;
import ims.core.vo.lookups.Sex;
import ims.framework.EnhancedItem;
import ims.framework.controls.DynamicGrid;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridCellItem;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.controls.DynamicGridRowCollection;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DynamicCellDecoratorMode;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.Date;
import ims.framework.utils.Image;
import ims.framework.utils.PartialDate;
import ims.framework.utils.Time;
import ims.nursing.vo.enums.DPPErrors;

import java.util.ArrayList;
/**
 * User Assessment Helper
 * @author mmihalec
 */
public class UserAssessmentInstHelper 
{				
	private int overallQuestionSequence = 0;
	private DynamicGrid grid;
	private boolean isDPP = false;
	private boolean displayAnsweredOnly = false;
	private boolean showConfirmation = false;
	private boolean showSelect = false;
	private Image questionImage;
	private Image additionalAnswerImage;
	private Image buttonAddImage;
	private Image buttonRemoveImage;
	private Image mandatoryQuestionImage;
	private PatientAssessmentInfoVo patInfo;
	
	// Default Values
	private static final int 	DEFAULT_QUESTION_COLUMN_WIDTH 			= 400;
	private static final int 	DEFAULT_GRAPHIC_QUESTION_COLUMN_WIDTH 	= 250;
	private static final int 	DEFAULT_YESNO_ANSWER_CELL_WIDTH 		= 25;
	private static final int 	DEFAULT_TIME_ANSWER_CELL_WIDTH			= 80;
	private static final int 	DEFAULT_TEXT_ANSWER_CELL_WIDTH			= 200;
	private static final int 	DEFAULT_SEPARATOR_ANSWER_CELL_WIDTH 	= 20;
	private static final int 	DEFAULT_PICKLIST_ANSWER_CELL_WIDTH		= 200;
	private static final int 	DEFAULT_PARTIALDATE_ANSWER_CELL_WIDTH 	= 80;
	private static final int 	DEFAULT_INTEGER_ANSWER_CELL_WIDTH 		= 80;
	private static final int 	DEFAULT_DECIMAL_ANSWER_CELL_WIDTH 		= 80;
	private static final int 	DEFAULT_DATE_ANSWER_CELL_WIDTH			= 100;
	private static final int 	DEFAULT_MULTISELECT_ANSWER_CELL_WIDTH 	= 250;
	private static final int 	DEFAULT_UNKNOWN_ANSWER_CELL_WIDTH 		= 10;
	private static final int 	DEFAULT_BUTTON_CELL_WIDTH				= 30;
	private static final int	DEFAULT_LEGEND_CELL_WIDTH				= 550;
	private static final Color	DEFAULT_SEPARATOR_CELL_TEXT_COLOR		= Color.Blue;
	
	// Dynamic Grid Column Identifiers
	private static final Integer QUESTION_COLUMN 	= new Integer(-1);	
	private static final Integer IMAGE_COLUMN 		= new Integer(-2);	
	private static final Integer BUTTON_COLUMN 		= new Integer(-3);
	private static final Integer CONFIRM_COLUMN     = new Integer(-4);
	private static final Integer NOTAPPLICABLE_COLUMN = new Integer(-5);
	private static final Integer POC_COLUMN			= new Integer(-6); 
	private static final Integer SELECT_NA_COLUMN    = new Integer(-7);
	
	// Button Identifiers
	private static final Integer BUTTON_ADD_ANSWER 		= new Integer(-101);
	private static final Integer BUTTON_REMOVE_ANSWER 	= new Integer(-102);
	
	//Rows Other Identifiers
	private static final Object NON_DATA_ROW			= new Integer(-500);
	
	
	private EnhancedItem optionYes = EnhancedItem.YES;
	private EnhancedItem optionNo = EnhancedItem.NO;	
	
	public UserAssessmentInstHelper(DynamicGrid grid, Image questionImage, Image additionalAnswerImage, Image buttonAddImage, Image buttonRemoveImage, Image mandatoryQuestionImage)
	{
		initialize(grid, questionImage, additionalAnswerImage, buttonAddImage, buttonRemoveImage, mandatoryQuestionImage, false, false, false, false,null);
	}
	public UserAssessmentInstHelper(DynamicGrid grid, Image questionImage, Image additionalAnswerImage, Image buttonAddImage, Image buttonRemoveImage, Image mandatoryQuestionImage, boolean isDPP, boolean displayOnlyAnswered, boolean showConfirmation, boolean showSelect)
	{
		initialize(grid,  questionImage, additionalAnswerImage, buttonAddImage, buttonRemoveImage, mandatoryQuestionImage, isDPP, displayOnlyAnswered, showConfirmation, showSelect,null);
	}
	
	public UserAssessmentInstHelper(DynamicGrid grid, Image questionImage, Image additionalAnswerImage, Image buttonAddImage, Image buttonRemoveImage, Image mandatoryQuestionImage, boolean isDPP, boolean displayOnlyAsnwered)
	{
		initialize(grid,  questionImage, additionalAnswerImage, buttonAddImage, buttonRemoveImage, mandatoryQuestionImage, isDPP, displayOnlyAsnwered, false, false,null);
	}
	
	//Added for WDEV-11366
	public UserAssessmentInstHelper(DynamicGrid grid, Image questionImage, Image additionalAnswerImage, Image buttonAddImage, Image buttonRemoveImage, Image mandatoryQuestionImage, boolean isDPP, boolean displayOnlyAnswered, boolean showConfirmation, boolean showSelect,PatientAssessmentInfoVo patInfo)
	{
		initialize(grid,  questionImage, additionalAnswerImage, buttonAddImage, buttonRemoveImage, mandatoryQuestionImage, isDPP, displayOnlyAnswered, showConfirmation, showSelect,patInfo);
	}
	
	public UserAssessmentInstHelper(DynamicGrid dyngrdQuestions, Image questionSmall, Image textBox, Image smallNew, Image smallCancel, Image mandatoryQuestion, boolean isDPP, boolean displayAnswered, PatientAssessmentInfoVo patientInfo)
	{
		initialize(dyngrdQuestions,  questionSmall, textBox, smallNew, smallCancel, mandatoryQuestion, isDPP, displayAnswered, false, false,patientInfo);
	}
	/**
	 * @param grid
	 * @param yesImage
	 * @param noImage
	 * @param questionImage
	 * @param additionalAnswerImage
	 * @param buttonAddImage
	 * @param buttonRemoveImage
	 * @param mandatoryQuestionImage
	 * @param isDPP 
	 * @param showSelect 
	 */
	private void initialize(DynamicGrid grid, Image questionImage, Image additionalAnswerImage, Image buttonAddImage, Image buttonRemoveImage, Image mandatoryQuestionImage, boolean isDPP, boolean displayAnsweredOnly, boolean showConfirmation, boolean showSelect,PatientAssessmentInfoVo patInfo)
	{
		checkDataIntegrity(grid);		
		this.grid = grid;
		this.questionImage = questionImage;
		this.additionalAnswerImage = additionalAnswerImage;
		this.buttonAddImage = buttonAddImage;
		this.buttonRemoveImage = buttonRemoveImage;
		this.mandatoryQuestionImage = mandatoryQuestionImage;
		this.isDPP = isDPP;
		this.displayAnsweredOnly = displayAnsweredOnly;
		this.showConfirmation = showConfirmation;
		this.showSelect = showSelect;
		this.patInfo = patInfo;
	}	
	public void populate(UserAssessmentVo data) throws PresentationLogicException
	{
		checkDataIntegrity(data);				
		boolean isFlatView = data.getIsFlatView().booleanValue();
		boolean isMultiGroup = data.getIsMultipleGroup().booleanValue();		
		
		if(isDPP)
		{
			prepareGrid(true, data.getGroupQuestionWidth());
			populateQuestionsFlat(data);
		}
		else
		{
			prepareGrid(isFlatView, data.getGroupQuestionWidth());
			
			if(isMultiGroup && isFlatView)
				populateQuestionsFlat(data);
			else
				populateQuestionsHierarchical(data);
		}
	}
	public void populate(PatientAssessmentDataVo data, PatientAssessmentStatusReason status) throws PresentationLogicException
	{
		if(isGraphicAssessmentData(data))
			populateGraphic(data, status);
		else
			populateUserAssessment(data, status, null);	
	}
	public void populate(PatientAssessmentDataVo data, PatientAssessmentStatusReason status, AnswerStatus answerStatus) throws PresentationLogicException
	{
		if(isGraphicAssessmentData(data))
			populateGraphic(data, status);
		else
			populateUserAssessment(data, status, answerStatus);	
	}
	public void populate(ims.assessment.vo.UserDefinedObjectComponentVo voUserDefinedObjectComponent) throws PresentationLogicException
	{
		//Filter the Active ones
		if(voUserDefinedObjectComponent != null && voUserDefinedObjectComponent.getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
		{			
			//voPatientAssessmentData.setStatus(PatientAssessmentStatusReason.NOTCOMMENCED);
			//Graphic Assessment
			populate(voUserDefinedObjectComponent.getGraphic());
		}
	}
	public void populate(GraphicAssessmentVo voGraphicAssessment) throws PresentationLogicException 
	{		
		PatientAssessmentDataVo voPatientAssessmentData = new PatientAssessmentDataVo();
		
		if(voGraphicAssessment != null)
		{	
			voPatientAssessmentData.setGraphic(voGraphicAssessment);
			//------ Associated Graphic Questions -------
			if(voGraphicAssessment.getAssociatedQuestionsIsNotNull())
			{
				voPatientAssessmentData.setGraphicQuestion(new PatientGraphicAssessmentQuestionAnswerVoCollection());
				for(int k = 0; k < voGraphicAssessment.getAssociatedQuestions().size(); k++)
				{
					GraphicAssessmentQuestionVo graphicAssessmentQuestionVo = voGraphicAssessment.getAssociatedQuestions().get(k);
					PreActiveActiveInactiveStatus assessmentQuestionStatus = graphicAssessmentQuestionVo.getActiveStatus();
					//WDEV-1211 - Check assessmentQuestion to be active
					if(assessmentQuestionStatus != null && assessmentQuestionStatus.equals(PreActiveActiveInactiveStatus.ACTIVE))
					{
						//WDEV-11366
						if (isQuestionInvalidForPatient(graphicAssessmentQuestionVo.getQuestion()))
							continue;
						PatientGraphicAssessmentQuestionAnswerVo voPatientGraphicAssessmentQuestionAnswer = new PatientGraphicAssessmentQuestionAnswerVo(); 
						voPatientGraphicAssessmentQuestionAnswer.setGraphicQuestion(graphicAssessmentQuestionVo);
						voPatientAssessmentData.getGraphicQuestion().add(voPatientGraphicAssessmentQuestionAnswer);
					}
				}
			}
			//------ End Associated Graphic Questions ---
			
			if(voPatientAssessmentData.getGraphicFindings() == null)
				voPatientAssessmentData.setGraphicFindings(new PatientGraphicAssessmentVoCollection());
			
			//DrawingGraphicImage and Findings collection
			for(int j = 0; j < voGraphicAssessment.getImages().size(); j++)
			{
				PatientGraphicAssessmentVo voPatientGraphicAssessment = new PatientGraphicAssessmentVo();
				voPatientGraphicAssessment.setGraphicImage(voGraphicAssessment.getImages().get(j));
				if(voGraphicAssessment.getFindingsAndQuestionsIsNotNull())
				{
					voPatientGraphicAssessment.setPatientGraphicFinding(new PatientGraphicAssessmentFindingVoCollection());
					for(int m = 0;  m < voGraphicAssessment.getFindingsAndQuestions().size(); m++)
					{
						GraphicAssessmentFindingVo voGraphicAssessmentFinding = voGraphicAssessment.getFindingsAndQuestions().get(m);
						
						PatientGraphicAssessmentFindingVo voPatientGraphicAssessmentFinding = new PatientGraphicAssessmentFindingVo();
						voPatientGraphicAssessmentFinding.setGraphicFinding(voGraphicAssessmentFinding.getFinding());

						//TODO - this works for Graphical Assessment and Graphical Assessment with questions where we have
						// 1:1 relationship between GraphicAssessmentFinding and FindingStageQuestions
						// need to review for the third type of assessment
						//if(voGraphicAssessmentFinding.getAssociatedQuestionsIsNotNull())
						if(voGraphicAssessmentFinding.getFindingStageIsNotNull() && voGraphicAssessmentFinding.getFindingStage().size() > 0 && voGraphicAssessmentFinding.getFindingStage().get(0).getAssociatedQuestionsIsNotNull())
						{
							//voPatientGraphicAssessmentFinding.setFindingQuestion(new PatientGraphicAssessmentFindingQuestionAnswerVoCollection());
							voPatientGraphicAssessmentFinding.setStage(new PatientGraphicalAssessmentStageVoCollection());
							//for(int l = 0; l < voGraphicAssessmentFinding.getAssociatedQuestions().size(); l++)
							for(int l = 0; l < voGraphicAssessmentFinding.getFindingStage().get(0).getAssociatedQuestions().size(); l++)
							{
								//GraphicAssessmentFindingQuestionVo graphicAssessmentFindingQuestionVo = voGraphicAssessmentFinding.getAssociatedQuestions().get(l);
								GraphicAssessmentFindingQuestionVo graphicAssessmentFindingQuestionVo = voGraphicAssessmentFinding.getFindingStage().get(0).getAssociatedQuestions().get(l);
								
								PreActiveActiveInactiveStatus findingQuestionStatus = graphicAssessmentFindingQuestionVo.getActiveStatus();
								//WDEV-1211 - Check finding Question to be active
								if(findingQuestionStatus != null && findingQuestionStatus.equals(PreActiveActiveInactiveStatus.ACTIVE))
								{
									PatientGraphicAssessmentFindingQuestionAnswerVo vpPGAFindingQA = new PatientGraphicAssessmentFindingQuestionAnswerVo();
									vpPGAFindingQA.setGraphicFindingQuestion(graphicAssessmentFindingQuestionVo);
									vpPGAFindingQA.setIsMandatory(graphicAssessmentFindingQuestionVo.getIsMandatory());

									PatientGraphicalAssessmentStageVo voPGASVo = new PatientGraphicalAssessmentStageVo();
									voPGASVo.setFindingQuestion(new PatientGraphicAssessmentFindingQuestionAnswerVoCollection());
									voPGASVo.getFindingQuestion().add(vpPGAFindingQA);
									voPGASVo.setStage(voGraphicAssessmentFinding.getFindingStage().get(0));
									
									voPatientGraphicAssessmentFinding.setStage(new PatientGraphicalAssessmentStageVoCollection());
									voPatientGraphicAssessmentFinding.getStage().add(voPGASVo);
								}
							}
						}
						voPatientGraphicAssessment.getPatientGraphicFinding().add(voPatientGraphicAssessmentFinding);
					}
				}
				voPatientAssessmentData.getGraphicFindings().add(voPatientGraphicAssessment);
			}
		}
		
		populateGraphic(voPatientAssessmentData, null);
	}
	public void populateGraphicFinding(PatientAssessmentVo data, PatientGraphicAssessmentFindingVo voGraphicAssessmentFinding) throws PresentationLogicException
	{
		checkDataIntegrity(voGraphicAssessmentFinding);
		prepareGraphicGrid(isCompleted(data.getStatus()));
		populateGraphicFindingQuestions(voGraphicAssessmentFinding);
		setAnswersGraphicFindings(voGraphicAssessmentFinding.getStage());
	}
	public void populateGraphicFinding(PatientAssessmentVo data, PatientGraphicAssessmentFindingVo voGraphicAssessmentFinding, PatientGraphicalAssessmentStageVo pgasVo) throws PresentationLogicException
	{
		checkDataIntegrity(voGraphicAssessmentFinding);
		prepareGraphicGrid(isCompleted(data.getStatus()));
		populateGraphicFindingQuestions(pgasVo);
		setAnswersGraphicFindings(pgasVo);
	}
	private void populateGraphic(PatientAssessmentDataVo data, PatientAssessmentStatusReason status) throws PresentationLogicException
	{
		checkDataIntegrity(data);
		prepareGraphicGrid(isCompleted(status));
		populateGraphicQuestions(data);
		setAnswersGraphic(data.getGraphicQuestion());
	}
	
	private boolean isCompleted(PatientAssessmentStatusReason status)
	{
		return PatientAssessmentStatusReason.COMPLETED.equals(status);
	}
	private boolean isGraphicAssessmentData(PatientAssessmentDataVo data)
	{
		return data != null && data.getGraphic() != null;
	}
	private void populateUserAssessment(PatientAssessmentDataVo data, PatientAssessmentStatusReason status, AnswerStatus answerStatus) throws PresentationLogicException
	{
		checkDataIntegrity(data);		
		boolean isFlatView = data.getUserAssessment().getIsFlatView().booleanValue();
		boolean isMultiGroup = data.getUserAssessment().getIsMultipleGroup().booleanValue();				
		
		prepareGrid(isFlatView, data.getGroupQuestionWidth(), isCompleted(status));
		
		if(isDPP)
		{
			populateQuestionsFlat(data, answerStatus);
			setAnswersFlat(data.getAnswerGroups());
		}
		else
		{
			if(isMultiGroup && isFlatView)
				populateQuestionsFlat(data, null);
			else
				populateQuestionsHierarchical(data);		
			
			if(isFlatView)
				setAnswersFlat(data.getAnswerGroups());
			else
				setAnswersHierarchical(data.getAnswerGroups());
		}
	}
	
	//WDEV-11366
	private boolean isQuestionInvalidForPatient(QuestionInformationVo question)
	{
		if (patInfo == null)
			return false;
		if (question.getGenderSpecificIsNotNull() )
		{
			if (GenderSpecific.MALE.equals(question.getGenderSpecific()) && (!patInfo.getSexIsNotNull() || !Sex.MALE.equals(patInfo.getSex())))
					return true;
			else
			if (GenderSpecific.FEMALE.equals(question.getGenderSpecific()) && (!patInfo.getSexIsNotNull() || !Sex.FEMALE.equals(patInfo.getSex()) ))
					return true;
		}
		if (question.getAgeRangeMaxIsNotNull() && (!patInfo.getAgeIsNotNull() || patInfo.getAge()>question.getAgeRangeMax()))
			return true;
		if (question.getAgeRangeMinIsNotNull() && (!patInfo.getAgeIsNotNull() || patInfo.getAge()<question.getAgeRangeMin()))
			return true;
		return false;
	}
	
	public PatientAssessmentGroupVoCollection getAnswers(PatientAssessmentGroupVoCollection groupColl)
	{
		if(groupColl == null)
			groupColl = new PatientAssessmentGroupVoCollection();
		
		if(isFlatView())
		{
			return calculateScores(getAnswersFlat(groupColl));
		}
		else
		{
			return calculateScores(getAnswersHierarchical(groupColl));		
		}
	}

	//-------------------- Filter the ANSWERED questions -------------------------------------------------
/*	private PatientAssessmentGroupVoCollection filterUnanswered(PatientAssessmentGroupVoCollection answers)
	{
		if(answers == null)
			return null;
		
		for (int i = 0; i < answers.size(); i++)
		{
			for (int j = 0; j < answers.get(i).getAssessmentAnswers().size(); j++)
			{
				PatientAssessmentQuestionVo q = answers.get(i).getAssessmentAnswers().get(j);
				
				q.setIsAnswered(isAnswered(q) ? AnswerStatus.ANSWERED : AnswerStatus.NOTANSWERED);
			}
		}
		return answers;
	}*/
	
	private boolean isAnswered(PatientAssessmentQuestionVo questionAnswer)
	{
		if(questionAnswer == null)
			return false;
		
		for(int x = 0; x < questionAnswer.getPatientAnswers().size(); x++)
		{
			if(isAnswered(questionAnswer.getPatientAnswers().get(x)))
				return true;
		}
		
		return false;
	}
	
	private Boolean isAnswered(PatientGraphicAssessmentFindingQuestionAnswerVo answer)
	{
		if(answer == null || answer.getPatientAnswers() == null)
			return Boolean.FALSE;
		
		for (int i = 0; i < answer.getPatientAnswers().size(); i++)
		{
			if(isAnswered(answer.getPatientAnswers().get(i)))
				return Boolean.TRUE;
		}
			
		return Boolean.FALSE;
	}
	
	private Boolean isAnswered(PatientGraphicAssessmentQuestionAnswerVo answer)
	{
		if(answer == null || answer.getPatientAnswers() == null)
			return Boolean.FALSE;
		
		for (int i = 0; i < answer.getPatientAnswers().size(); i++)
		{
			if(isAnswered(answer.getPatientAnswers().get(i)))
				return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	private boolean isAnswered(PatientAssessmentAnswerVo answer)
	{
		if(answer == null || answer.getAnswerDetails() == null)
			return false;		
		if(answer.getAuthoringInfoIsNotNull())
			return true;
		
		for(int x = 0; x < answer.getAnswerDetails().size(); x++)
		{
			if(isAnswered(answer.getAnswerDetails().get(x)))
				return true;
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
	//-------------------- End Filter the ANSWERED questions -----------------------------------------------
	
	public PatientGraphicAssessmentQuestionAnswerVoCollection getGraphicAnswers(PatientGraphicAssessmentQuestionAnswerVoCollection answers)
	{
		if(answers == null)
			answers = new PatientGraphicAssessmentQuestionAnswerVoCollection();
		
//		//WDEV-11366
//		//Remove answers that are not valid anymore for current patient
//		for (int i = answers.size()-1 ; i >=0 ; i--)
//		{
//			PatientGraphicAssessmentQuestionAnswerVo question = answers.get(i);
//			if (question == null)
//				continue;
//			if (!question.getGraphicQuestionIsNotNull())
//				continue;
//			if (!question.getGraphicQuestion().getQuestionIsNotNull())
//				continue;
//			if (isQuestionInvalidForPatient(question.getGraphicQuestion().getQuestion()))
//				answers.remove(i);
//		}
		
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			answers = updateGraphicQuestion(answers, this.grid.getRows().get(x));
		}
		
		return answers;
	}

	public PatientGraphicAssessmentFindingQuestionAnswerVoCollection getGraphicFindingAnswers(PatientGraphicAssessmentFindingQuestionAnswerVoCollection answers)
	{
		if(answers == null)
			answers = new PatientGraphicAssessmentFindingQuestionAnswerVoCollection(); 

		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			answers = updateGraphicFindingQuestion(answers, this.grid.getRows().get(x));
		}
		
		return answers;
	}

	public static String getTextualQuestionAndAnswers(GeneralQuestionAnswerVoCollection questions)
	{
		return getTextualQuestionAndAnswers(questions, false, false,false);
	}
	
	
//	public static String getAnswersAsText(GeneralQuestionAnswerVo vo)
//	{
//		return getAnswersAsText(vo,false);
//	}
	
	public static String getAnswersAsText(GeneralQuestionAnswerVo vo)
	{
		boolean nullAnswer=false;
		StringBuffer sb = new StringBuffer();
		if(vo.getPatientAnswers() == null || vo.getPatientAnswers().size() == 0)
			return null;
		
		for (int p = 0; p < vo.getPatientAnswers().size(); p++)
		{
			nullAnswer=true;
			AnswerDetailsVoCollection answerColl = vo.getPatientAnswers().get(p).getAnswerDetails();
			if (answerColl != null)
			{
				for (int j=0; j<answerColl.size(); j++)
				{
					AnswerDetailsVo ans = answerColl.get(j);
					QuestionAnswerTypeVo ansType = ans.getAnswerType();
					if (ansType == null || ansType.getAnswerType() == null)
						continue;
					
					if(sb.length()>0)
					{
						sb.append(" ");
					}
					if (ansType.getAnswerType().equals(QuestionAnswerType.DATE))
					{
						if (ans.getDateAnswerIsNotNull())
							nullAnswer=false;
						sb.append(ans.getDateAnswer());
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.DECIMAL))
					{
						if (ans.getDecimalAnswerIsNotNull())
							nullAnswer=false;
						sb.append(ans.getDecimalAnswer());
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.INTEGER))
					{
						if (ans.getIntegerAnswerIsNotNull())
							nullAnswer=false;
						sb.append(ans.getIntegerAnswer());
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.MULTISELECT))
					{
						sb.append("(");
						String comma = "";
						int countAns = ans.getMultiSelectAnswers().size();
						for (int k=0; k<countAns; k++)
						{
							AnswerOptionVo multi = ans.getMultiSelectAnswers().get(k);
							if (multi.getOptionTextIsNotNull())
								nullAnswer=false;
							sb.append(comma + multi.getOptionText());
							comma = ",";
						}
						sb.append(")");
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
					{
						if (ans.getPartialDateIsNotNull())
							nullAnswer=false;
						sb.append(ans.getPartialDate());
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.PICKLIST))
					{
						if(ans.getPicklist() != null)
						{
							nullAnswer=false;
							sb.append(ans.getPicklist().getOptionText());
						}
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.TEXT))
					{
						if (ans.getStringAnswerIsNotNull())
							nullAnswer=false;
						sb.append(ans.getStringAnswer());
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.TIME))
					{
						if (ans.getTimeAnswerIsNotNull())
							nullAnswer=false;//WEBDEV-3386
						if (sb.length() == 0){								
							sb.append(ans.getTimeAnswer());}
						else{
							sb.append(" ");
							sb.append(ans.getTimeAnswer());}
						
					}
					else if (ansType.getAnswerType().equals(QuestionAnswerType.YESNO))
						if (!ans.getBoolValueAnswerIsNotNull())
							sb.append("Not Specified");
						else if (ans.getBoolValueAnswer().booleanValue() == true)
						{
							sb.append("Yes");
							nullAnswer=false;
						}
						else
						{
							sb.append("No");
							nullAnswer=false;
						}
				}
			}
		}
		if(nullAnswer)
			return null;
		else
			return sb.toString();
	}

	
	
	
	public static String getTextualQuestionAndAnswers(GeneralQuestionAnswerVoCollection questions, boolean useShort, boolean excludeNullAnswers,boolean lineBreaks)
	{
		if (questions == null)
			return null;

		StringBuffer returnValue = new StringBuffer();
		boolean nullAnswer=false;
		String prefix = "";
		for (int i = 0; i < questions.size(); i++)
		{
			StringBuffer sb = new StringBuffer();

			GeneralQuestionAnswerVo vo = questions.get(i);
			
			if(vo.getPatientAnswers() == null || vo.getPatientAnswers().size() == 0)
				continue;
			
			if (i > 0&&lineBreaks)
			{
				prefix = ". \r";
			}
			else if (i > 0)
			{
				prefix = ". ";
			}
				
			
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

				nullAnswer=true;
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
						{
							if (ans.getDateAnswerIsNotNull())
								nullAnswer=false;
							sb.append(ans.getDateAnswer());
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.DECIMAL))
						{
							if (ans.getDecimalAnswerIsNotNull())
								nullAnswer=false;
							sb.append(ans.getDecimalAnswer());
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.INTEGER))
						{
							if (ans.getIntegerAnswerIsNotNull())
								nullAnswer=false;
							sb.append(ans.getIntegerAnswer());
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.MULTISELECT))
						{
							if (useShort)
								sb.append("(");
							String comma = "";
							int countAns = ans.getMultiSelectAnswers().size();
							for (int k=0; k<countAns; k++)
							{
								AnswerOptionVo multi = ans.getMultiSelectAnswers().get(k);
								if (multi.getOptionTextIsNotNull())
									nullAnswer=false;
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
						{
							if (ans.getPartialDateIsNotNull())
								nullAnswer=false;
							sb.append(ans.getPartialDate());
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.PICKLIST))
						{
							if(ans.getPicklist() != null)
							{
								nullAnswer=false;
								sb.append(ans.getPicklist().getOptionText());
							}
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.TEXT))
						{
							if (ans.getStringAnswerIsNotNull())
								nullAnswer=false;
							sb.append(ans.getStringAnswer());
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.TIME))
						{
							if (ans.getTimeAnswerIsNotNull())
								nullAnswer=false;
							//WEBDEV-3386
							if (sb.length() == 0){								
								sb.append(ans.getTimeAnswer());}
							else{
								sb.append(" ");
								sb.append(ans.getTimeAnswer());}
							
						}
						else if (ansType.getAnswerType().equals(QuestionAnswerType.YESNO))
							if (!ans.getBoolValueAnswerIsNotNull())
								sb.append("Not Specified");
							else if (ans.getBoolValueAnswer().booleanValue() == true)
							{
								sb.append("Yes");
								nullAnswer=false;
							}
							else
							{
								sb.append("No");
								nullAnswer=false;
							}
					}
					if (useShort)
						sb.append(", ");
					else
						sb.append("\r");
				}
			}
			if (!nullAnswer || !excludeNullAnswers)
				returnValue.append(sb);
		}
		return returnValue.toString();
	}

	//Overloaded method that returns the DPPQuestionText without index
	public static String getDPPQuestionAndAnswers(PatientAssessmentQuestionVo question)
	{
		return getDPPQuestionAndAnswers(question, -1);
	}
	public static String getDPPQuestionAndAnswers(PatientAssessmentQuestionVo question, int index)
	{
		if (question == null)
			return null;

		StringBuffer sb = new StringBuffer();
		if (index != -1)
		{
			// Don't display the index
			/*
			 * sb.append(index); sb.append(". ");
			 */
		}
		if (question.getAssessmentQuestion().getQuestionIsNotNull())
		{
			sb.append(question.getAssessmentQuestion().getQuestion().getShortText());
		}

		int asnwerSize = question.getPatientAnswersIsNotNull() ? question.getPatientAnswers().size() : 0;
		for (int i = 0; i < asnwerSize; i++)
		{
			PatientAssessmentAnswerVo vo = question.getPatientAnswers().get(i);

			AnswerDetailsVoCollection answerColl = vo.getAnswerDetails();
			if (answerColl != null)
			{
				String commaSeparator = ", ";
				int ansColSize = answerColl.size();
				for (int j = 0; j < ansColSize; j++)
				{
					AnswerDetailsVo ans = answerColl.get(j);
					QuestionAnswerTypeVo ansType = ans.getAnswerType();
					if (ansType == null)
						continue;
					QuestionAnswerType questionAnswerType = ansType.getAnswerType();
					if (questionAnswerType == null)
						continue;
					if (questionAnswerType.equals(QuestionAnswerType.DATE))
						sb.append(ans.getDateAnswer());
					else if (questionAnswerType.equals(QuestionAnswerType.DECIMAL))
						sb.append(ans.getDecimalAnswer());
					else if (questionAnswerType.equals(QuestionAnswerType.INTEGER))
						sb.append(ans.getIntegerAnswer());
					else if (questionAnswerType.equals(QuestionAnswerType.MULTISELECT))
					{
						if (ans.getMultiSelectAnswers() != null && ans.getMultiSelectAnswers().size() > 0)
							ans.getMultiSelectAnswers().sort();

						for (int k = 0; k < ans.getMultiSelectAnswers().size(); k++)
						{
							if (i == 0 && j == 0 && k == 0)
								sb.append(" - ");
							AnswerOptionVo multi = ans.getMultiSelectAnswers().get(k);
							//WDEV-2210 - Only put text of answer into DPP answer history and POC title if they are RED/YELLOW/GREEN
							Color colour = multi.getColour();
							
							//Check against the colour as the green score is the same as the white score
							if(colour == null || 
							   (colour.equals(DPPScore.GREEN_SCORE.getTextColor())  ||
								colour.equals(DPPScore.YELLOW_SCORE.getTextColor()) ||
								colour.equals(DPPScore.RED_SCORE.getTextColor())) == false)
								continue;
													
							sb.append(multi.getOptionText());
							if (k < (ans.getMultiSelectAnswers().size() - 1))
								sb.append(commaSeparator);
						}
					}
					else if (questionAnswerType.equals(QuestionAnswerType.PARTIALDATE))
						sb.append(ans.getPartialDate());
					else if (questionAnswerType.equals(QuestionAnswerType.PICKLIST))
					{
						if (ans.getPicklistIsNotNull())
							sb.append(ans.getPicklist().getOptionText());
					}
					else if (questionAnswerType.equals(QuestionAnswerType.TEXT))
						sb.append(ans.getStringAnswer());
					else if (questionAnswerType.equals(QuestionAnswerType.TIME))
						sb.append(ans.getTimeAnswer());
					else if (questionAnswerType.equals(QuestionAnswerType.YESNO))
					{
						if (j > 0)
							sb.append(commaSeparator);

						String separator = getPreviousSeparatorIfExists(question.getAssessmentQuestion(), ansType);
						if (separator != null)
						{
							sb.append(separator);
							sb.append(" ");
						}

						if (!ans.getBoolValueAnswerIsNotNull())
							sb.append("Not Specified");
						else if (ans.getBoolValueAnswer().booleanValue() == true)
							sb.append("Yes");
						else
							sb.append("No");
					}
				}
				if (i < (asnwerSize - 1))
					sb.append("\r");
			}
		}
		return sb.toString();
	}
	private static String getPreviousSeparatorIfExists(AssessmentQuestionVo assessmentQuestion, QuestionAnswerTypeVo ansType)
	{
		if(assessmentQuestion == null || ansType == null)
			return null;
		
		if(assessmentQuestion.getQuestion() == null || assessmentQuestion.getQuestion().getAnswerTypes() == null)
			return null;
		
		for (int i = 0; i < assessmentQuestion.getQuestion().getAnswerTypes().size(); i++)
		{
			QuestionAnswerTypeVo voQuestionAnswerType = assessmentQuestion.getQuestion().getAnswerTypes().get(i);
			if(voQuestionAnswerType != null && voQuestionAnswerType.equals(ansType))
			{
				if(i > 0)
				{
					QuestionAnswerTypeVo voPrevAnswerType = assessmentQuestion.getQuestion().getAnswerTypes().get(i-1);
					if(voPrevAnswerType != null && voPrevAnswerType.getAnswerTypeIsNotNull() && voPrevAnswerType.getAnswerType().equals(QuestionAnswerType.SEPARATOR))
						return voPrevAnswerType.getSeparatorText();
				}
			}
		}
		return null;
	}
	//Format the tooltip creating a table for the Question Answer
	public static String getGraphicAssessmentFindingTooltip(PatientGraphicAssessmentFindingVo voPatientGraphicAssessmentFinding)
	{
		StringBuffer tooltip = new StringBuffer();
		String boldStart = "<B>";
		String boldEnd   = "</B>";
		String newLine 	 = "<BR>";
		if (voPatientGraphicAssessmentFinding.getAuthoringInformationIsNotNull())
		{
			AuthoringInformationVo voAuthoringInformation = voPatientGraphicAssessmentFinding.getAuthoringInformation();
			if (voAuthoringInformation.getAuthoringHcpIsNotNull())
			{
				tooltip.append(boldStart);
				tooltip.append("Authoring HCP: ");
				tooltip.append(boldEnd);
				tooltip.append(voAuthoringInformation.getAuthoringHcp().toString());
				tooltip.append(newLine);
			}

			if (voAuthoringInformation.getAuthoringDateTimeIsNotNull())
			{
				tooltip.append(boldStart);
				tooltip.append("Authoring Date/Time: ");
				tooltip.append(boldEnd);
				tooltip.append(voAuthoringInformation.getAuthoringDateTime().toString());
				tooltip.append(newLine);
			}
		}

		if (voPatientGraphicAssessmentFinding.getAreaNameIsNotNull())
		{
			tooltip.append(boldStart);
			tooltip.append("Area: ");
			tooltip.append(boldEnd);
			tooltip.append(voPatientGraphicAssessmentFinding.getAreaName());
			tooltip.append(newLine);
		}

		if (voPatientGraphicAssessmentFinding.getAreaDetailsIsNotNull())
		{
			tooltip.append(boldStart);
			tooltip.append("Details: ");
			tooltip.append(boldEnd);
			tooltip.append(voPatientGraphicAssessmentFinding.getAreaDetails());
			tooltip.append(newLine);
		}

		tooltip.append("<TABLE BORDER=1 CELLSPACING=0 CELLPADDING=1 BGCOLOR=#D4D0C8 width='300'>");
		// Grid Header
		tooltip.append("<TR>");
		tooltip.append("<TD WIDTH=99 ALIGN='CENTER'>");
		tooltip.append("<span style='font-family: Tahoma; font-size: 8pt; font-weight: 700'>Question</span></TD>");
		tooltip.append("<TD WIDTH=169 ALIGN='CENTER'>");
		tooltip.append("<span style='font-family: Tahoma; font-size: 8pt; font-weight: 700'>Answers</span></TD>");
		tooltip.append("</TR>");

		// Get the Finding Questions in tooltip
		if(voPatientGraphicAssessmentFinding.getStageIsNotNull())
		{
			PatientGraphicalAssessmentStageVo annotatedStage = null;
			
			if(voPatientGraphicAssessmentFinding.getStage().size() == 1)
				annotatedStage = voPatientGraphicAssessmentFinding.getStage().get(0);
			else
			{
				for (int i = 0; i < voPatientGraphicAssessmentFinding.getStage().size(); i++)
				{
					if(voPatientGraphicAssessmentFinding.getStage().get(i).getStageIsNotNull() 
							&& voPatientGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStageIsNotNull() 
							&& voPatientGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotatedIsNotNull()
							&& voPatientGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotated().booleanValue())
					{
						annotatedStage = voPatientGraphicAssessmentFinding.getStage().get(i);
						break;
					}
				}
			}
			if(annotatedStage != null && annotatedStage.getFindingQuestionIsNotNull())
			{
				for (int i = 0; i < annotatedStage.getFindingQuestion().size(); i++)
				{
					PatientGraphicAssessmentFindingQuestionAnswerVo voFindingQ = annotatedStage.getFindingQuestion().get(i);
					// Add only the answered ones
					if (voFindingQ.getIsAnsweredIsNotNull() && voFindingQ.getIsAnswered().booleanValue())
					{
						if (voFindingQ.getGraphicFindingQuestionIsNotNull() && voFindingQ.getGraphicFindingQuestion().getQuestionIsNotNull())
						{
							tooltip.append("<TR>");
							String question = voFindingQ.getGraphicFindingQuestion().getQuestion().getShortText();
							addQuestionCell(tooltip, question);
		
							for (int j = 0; j < voFindingQ.getPatientAnswers().size(); j++)
							{
								if (j > 0)
								{
									// Add dummy Question cell
									tooltip.append("<TR>");
									addQuestionCell(tooltip, "&nbsp");
								}
		
								AnswerDetailsVoCollection answerColl = voFindingQ.getPatientAnswers().get(j).getAnswerDetails();
								if (answerColl != null)
								{
									for (int j1 = 0; j1 < answerColl.size(); j1++)
									{
										AnswerDetailsVo ans = answerColl.get(j1);
										String answers = getAnswerDetail(ans);
										addAnswerTableCell(tooltip, answers);
									}
								}
								if (j > 0)
								{
									tooltip.append("</TR>");
								}
							}
		
							if (voFindingQ.getPatientAnswers().size() == 0)
							{
								// Add dummy answer cell
								addAnswerTableCell(tooltip, "&nbsp");
								tooltip.append("</TR>");
							}
						}
					}
				}
			}
		}

		tooltip.append("</TABLE>");
		return tooltip.toString();// new ims.utils.textile.Textile().process(
	}

	private static void addAnswerTableCell(StringBuffer tooltip, String answers)
	{
		tooltip.append("<TD WIDTH=169 ALIGN='LEFT' BGCOLOR=#F5F5F5><span style='font-family: Tahoma; font-size: 8pt'>");
		tooltip.append(answers != null && answers.length() > 0?answers:"&nbsp");
		tooltip.append("</span></TD>");
	}
	
	private static void addQuestionCell(StringBuffer tooltip, String question)
	{
		tooltip.append("<TD WIDTH=99 ALIGN='left' BGCOLOR=#F5F5F5><span style='font-family: Tahoma; font-size: 8pt'>");//F5F5F5
		tooltip.append(question != null && question.length() > 0?question:"&nbsp");
		tooltip.append("</span></TD>");
	}
	
	public static String getAnswerDetail(AnswerDetailsVo ans)
	{
		StringBuffer tooltip = new StringBuffer();
		QuestionAnswerTypeVo ansType = ans.getAnswerType();
		if (ansType == null || ansType.getAnswerType() == null)
			return "";
		if (ansType.getAnswerType().equals(QuestionAnswerType.DATE))
			tooltip.append(ans.getDateAnswerIsNotNull() ? ans.getDateAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.DECIMAL))
			tooltip.append(ans.getDecimalAnswerIsNotNull() ? ans.getDecimalAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.INTEGER))
			tooltip.append(ans.getIntegerAnswerIsNotNull() ? ans.getIntegerAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.MULTISELECT))
		{
			int size = ans.getMultiSelectAnswers().size();
			for (int k = 0; k < size; k++)
			{
				AnswerOptionVo multi = ans.getMultiSelectAnswers().get(k);
				//Ensure you don't add unnecessary <BR>
				if(!(k == 0 && tooltip.lastIndexOf("<BR>") == tooltip.length()-1))
					tooltip.append("<BR>");
				tooltip.append(multi.getOptionTextIsNotNull() ? multi.getOptionText() : "");
			}
		}
		else if(ansType.getAnswerType().equals(QuestionAnswerType.SEPARATOR) && ans.getAnswerType().getSeparatorTextIsNotNull())
		{
			//sb.append("<br>");
			tooltip.append("<font color=#0000FF>" + ans.getAnswerType().getSeparatorText() + "</font>");
		}
		else if (ansType.getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
			tooltip.append(ans.getPartialDateIsNotNull() ? ans.getPartialDate().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.PICKLIST))
			tooltip.append(ans.getPicklistIsNotNull()?ans.getPicklist().getOptionText():"");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.TEXT))
			tooltip.append(ans.getStringAnswerIsNotNull()?ans.getStringAnswer().toString():"");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.TIME))
			tooltip.append(ans.getTimeAnswerIsNotNull() ? ans.getTimeAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.YESNO))
			if (!ans.getBoolValueAnswerIsNotNull())
				tooltip.append("Not Specified");
			else if (ans.getBoolValueAnswer().booleanValue() == true)
				tooltip.append("Yes");
			else
				tooltip.append("No");
		
		return tooltip.toString();
	}
	@SuppressWarnings("unchecked")
	public String[] validateData()
	{
			PatientAssessmentGroupVoCollection answers = getAnswers(null);
		
		if(answers == null)
			return null;

		ArrayList errors = new ArrayList();
		for(int x = 0; x < answers.size(); x++)
		{			
			errors = validateAnswer(answers.get(x), errors);
		}
		
		if(errors.size() > 0)
		{
			String[] result = new String[errors.size()];			
			errors.toArray(result);
			return result;
		}
		
		return null;
	}
	@SuppressWarnings("unchecked")
	public String[] validateGraphicAnswers()
	{
		PatientGraphicAssessmentQuestionAnswerVoCollection answers = getGraphicAnswers(null);
		if(answers == null)
			return null;
		
		ArrayList errors = new ArrayList();
		for (int i = 0; i < answers.size(); i++)
		{
			errors = validateGraphicAnswer(answers.get(i), errors);
		}
		
		if(errors.size() > 0)
		{
			String[] result = new String[errors.size()];
			errors.toArray(result);
			return result;
		}
		
		return null;
	}
	@SuppressWarnings("unchecked")
	public String[] validateGraphicFindingAnswer()
	{
		PatientGraphicAssessmentFindingQuestionAnswerVoCollection answers = getGraphicFindingAnswers(null);
		if(answers == null)
			return null;
		
		ArrayList errors = new ArrayList();
		for (int i = 0; i < answers.size(); i++)
		{
			errors = validateGraphicFindingAnswer(answers.get(i), errors);
		}
		
		if(errors.size() > 0)
		{
			String[] result = new String[errors.size()];
			errors.toArray(result);
			return result;
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	public String[] validateAllGraphicQuestions(PatientAssessmentDataVo voPatientAssessmentData)
	{
		ArrayList errors = new ArrayList();
		if(voPatientAssessmentData == null)
			return null;
		
		//Graphic Questions
		if(voPatientAssessmentData.getGraphicQuestionIsNotNull())
		{
			for (int i = 0; i < voPatientAssessmentData.getGraphicQuestion().size(); i++)
			{

				errors = validateGraphicAnswer(voPatientAssessmentData.getGraphicQuestion().get(i), errors);
			}
		}
		
		//Graphic Finding Questions
		if(voPatientAssessmentData.getGraphicFindingsIsNotNull())
		{
			for (int i = 0; i < voPatientAssessmentData.getGraphicFindings().size(); i++)
			{
				PatientGraphicAssessmentFindingVoCollection voGraphicAssessFindingColl = voPatientAssessmentData.getGraphicFindings().get(i).getPatientGraphicFinding();
				if(voGraphicAssessFindingColl == null)
					continue;
					
				for (int j = 0; j < voGraphicAssessFindingColl.size(); j++)
				{
					PatientGraphicalAssessmentStageVoCollection stages = voGraphicAssessFindingColl.get(j).getStage();
					if(stages != null)
					{
						for (int k = 0; k < stages.size(); k++)
						{
							PatientGraphicAssessmentFindingQuestionAnswerVoCollection findingQuestionsColl = stages.get(k).getFindingQuestion();
							if(findingQuestionsColl != null)
							{
								for (int l = 0; l < findingQuestionsColl.size(); l++)
								{
									errors = validateGraphicFindingAnswer(findingQuestionsColl.get(l), errors);						
								}
							}
						}
					}
				}
			}
		}
		if(errors.size() > 0)
		{
			String[] result = new String[errors.size()];
			errors.toArray(result);
			return result;
		}
		return null;
	}
	public void addOrRemoveAnswer(DynamicGridCell initiatorCell)
	{
		if(initiatorCell == null || initiatorCell.getIdentifier() == null)
			return;
		if(!initiatorCell.getIdentifier().equals(BUTTON_ADD_ANSWER) 
				&& !initiatorCell.getIdentifier().equals(BUTTON_REMOVE_ANSWER))
			return;
		
		checkDataIntegrity(initiatorCell.getRow());
		
		if(initiatorCell.getIdentifier().equals(BUTTON_REMOVE_ANSWER))
		{
			if(initiatorCell.getRow().getParent() != null)
				initiatorCell.getRow().getParent().getRows().remove(initiatorCell.getRow());
			else
				this.grid.getRows().remove(initiatorCell.getRow());
		}
		else
		{			
			duplicateQuestionRow(initiatorCell.getRow());
		}			
	}	
	public void notifyFormModeChange(FormMode formMode)
	{
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);
		if(buttonColumn != null)
		{
			buttonColumn.setWidth(formMode == FormMode.EDIT ? DEFAULT_BUTTON_CELL_WIDTH : 0);
		}			
	}
	@SuppressWarnings("unchecked")
	private ArrayList validateAnswer(PatientAssessmentGroupVo answer, ArrayList errors)
	{
		if(errors == null)
			errors = new ArrayList();		
		if(answer == null || answer.getAssessmentAnswers() == null)
			return errors;
		
		for(int x = 0; x < answer.getAssessmentAnswers().size(); x++)
		{
			errors = validateAnswer(answer.getAssessmentAnswers().get(x), errors);
		}
		
		return errors;
	}
	@SuppressWarnings("unchecked")
	private ArrayList validateAnswer(PatientAssessmentQuestionVo assessmentQuestion, ArrayList errors)
	{
		if(errors == null)
			errors = new ArrayList();	
		if(assessmentQuestion == null || assessmentQuestion.getAssessmentQuestion() == null || assessmentQuestion.getPatientAnswers() == null)
			return errors;
		
		QuestionInformationVo question = assessmentQuestion.getAssessmentQuestion().getQuestion();
		PatientAssessmentAnswerVoCollection patientAnswers = assessmentQuestion.getPatientAnswers();
		Boolean isMandatory = assessmentQuestion.getIsMandatory();
		
		validateAllAnswers(errors, question, patientAnswers, isMandatory);			
		
		return errors;
	}
	/**
	 * @param errors
	 * @param question
	 * @param patientAnswers
	 * @param isMandatory
	 */
	@SuppressWarnings("unchecked")
	private void validateAllAnswers(ArrayList errors, QuestionInformationVo question, PatientAssessmentAnswerVoCollection patientAnswers, Boolean isMandatory)
	{
		if(isMandatory != null && isMandatory.booleanValue())
		{
			boolean questionWasAnswered = true;
			if(patientAnswers != null && patientAnswers.size() > 0)
			{
				for(int i = 0; i < patientAnswers.size(); i++)
				{
					questionWasAnswered = false;						
					PatientAssessmentAnswerVo answerDetail = patientAnswers.get(i);
										
					if(answerDetail != null)
					{
						for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
						{								
							if(wasAnswered(answerDetail.getAnswerDetails().get(x)))
								questionWasAnswered = true;
						}
					}
					
					if(!questionWasAnswered)
					{
						errors.add("The question '" + question.getShortText() + "' is mandatory.");
					}
				}		
			}
			else
			{
				errors.add("The question '" + question.getShortText() + "' is mandatory.");
			}					
		}
		
		boolean anyAnswered = false;
		ArrayList indecidedErrors = new ArrayList();
		if(patientAnswers != null && patientAnswers.size() > 0)
		{
			for(int i = 0; i < patientAnswers.size(); i++)
			{
				PatientAssessmentAnswerVo answerDetail = patientAnswers.get(i);				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{		
					if(answerDetail.getAnswerDetails().get(x).getAnswerTypeIsNotNull() 
							&& answerDetail.getAnswerDetails().get(x).getAnswerType().getIsMandatoryIsNotNull())
					{						
						if(answerDetail.getAnswerDetails().get(x).getAnswerType().getIsMandatory().booleanValue())
						{
							if(!wasAnswered(answerDetail.getAnswerDetails().get(x)))
							{
								String posNo = String.valueOf(x + 1);
								if(x == 0)
									posNo += "st";
								else if(x == 1)
									posNo += "nd";
								else if(x == 2)
									posNo += "rd";
								else
									posNo += "th";
								
								String validationMessage = answerDetail.getAnswerDetails().get(x).getAnswerType().getMandatoryValMessage();
								if(validationMessage != null && validationMessage.trim().length() > 0)
									indecidedErrors.add(validationMessage);
								else									
									indecidedErrors.add("The " + posNo + " answer detail for the question '" + question.getShortText() + "' answer number " + i + " is mandatory.");
							}
							else
							{
								anyAnswered = true;
							}
						}
						else
						{
							if(wasAnswered(answerDetail.getAnswerDetails().get(x)))
								anyAnswered = true;
						}
					}
				}
			}
		}
		if(anyAnswered)
		{
			for(int x = 0; x < indecidedErrors.size(); x++)
			{
				errors.add(indecidedErrors.get(x));
			}
		}
	}
	private boolean wasAnswered(AnswerDetailsVo answerDetails)
	{
		if(answerDetails == null || answerDetails.getAnswerType() == null)
			return false;
		
		if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.DATE))
		{
			return answerDetails.getDateAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.DECIMAL))
		{
			return answerDetails.getDecimalAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.INTEGER))
		{
			return answerDetails.getIntegerAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))
		{
			return answerDetails.getMultiSelectAnswersIsNotNull() && answerDetails.getMultiSelectAnswers().size() > 0;	//WDEV-11137
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PARTIALDATE))
		{
			return answerDetails.getPartialDateIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
		{
			return answerDetails.getPicklistIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
		{
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.TEXT))
		{
			if(answerDetails.getStringAnswer() == null)
				return false;
			else
				return answerDetails.getStringAnswer().trim().length() > 0;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.TIME))
		{
			return answerDetails.getTimeAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
		{
			return answerDetails.getBoolValueAnswerIsNotNull();
		}
		
		return false;
	}
	@SuppressWarnings("unchecked")
	private ArrayList validateGraphicAnswer(PatientGraphicAssessmentQuestionAnswerVo answer, ArrayList errors)
	{
		if(errors == null)
			errors = new ArrayList();	
		
		if(answer == null || answer.getGraphicQuestion() == null || answer.getPatientAnswers() == null)
			return errors;
		
		QuestionInformationVo question = answer.getGraphicQuestion().getQuestion();
		if (isQuestionInvalidForPatient(question))
			return errors;
		PatientAssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		Boolean isMandatory = answer.getIsMandatory();
		
		validateAllAnswers(errors, question, patientAnswers, isMandatory);

		return errors;
	}
	@SuppressWarnings("unchecked")
	private ArrayList validateGraphicFindingAnswer(PatientGraphicAssessmentFindingQuestionAnswerVo answer, ArrayList errors)
	{
		if(errors == null)
			errors = new ArrayList();	
	
		if(answer == null || answer.getGraphicFindingQuestion() == null || answer.getPatientAnswers() == null)
			return errors;
		
		QuestionInformationVo question = answer.getGraphicFindingQuestion().getQuestion();
		PatientAssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		Boolean isMandatory = answer.getIsMandatory();
		
		validateAllAnswers(errors, question, patientAnswers, isMandatory);
		return errors;
	}
	private PatientAssessmentGroupVoCollection calculateScores(PatientAssessmentGroupVoCollection groups)
	{
		if(groups == null)
			return null;
				
		for(int x = 0; x < groups.size(); x++)
		{
			Float groupScore = new Float(0);
			PatientAssessmentGroupVo group = groups.get(x);
				
			if(group != null && group.getAssessmentAnswersIsNotNull())
			{
				for(int y = 0; y < group.getAssessmentAnswers().size(); y++)
				{
					PatientAssessmentQuestionVo assessmentQuestion = group.getAssessmentAnswers().get(y);
					
					if(assessmentQuestion.getPatientAnswers() != null)
					{
						for(int i = 0; i < assessmentQuestion.getPatientAnswers().size(); i++)
						{						
							PatientAssessmentAnswerVo answerDetail = assessmentQuestion.getPatientAnswers().get(i);
						
							if(assessmentQuestion != null && assessmentQuestion.getAssessmentQuestionIsNotNull() && answerDetail.getAnswerDetailsIsNotNull())
							{
								AssessmentQuestionVo question = assessmentQuestion.getAssessmentQuestion();
								if(question.getScoringAnswerTypeIsNotNull())
								{
									for(int z = 0; z < answerDetail.getAnswerDetails().size(); z++)
									{								
										AnswerDetailsVo answerDetails = answerDetail.getAnswerDetails().get(z);
										if(answerDetails != null && answerDetails.getAnswerTypeIsNotNull())
										{									
											if(answerDetails.getAnswerType().equals(question.getScoringAnswerType()))
											{
												if(answerDetails.getPicklist() != null && answerDetails.getAnswerType().getOptionsIsNotNull())
												{
													for(int o = 0; o < answerDetails.getAnswerType().getOptions().size(); o++)
													{
														if(answerDetails.getPicklist().equals(answerDetails.getAnswerType().getOptions().get(o)))
														{
															if(answerDetails.getAnswerType().getOptions().get(o).getScoreIsNotNull())
															{
																groupScore += answerDetails.getAnswerType().getOptions().get(o).getScore();
																break;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
				//WDEV-3916
				group.setCurrentScore(new Float(groupScore));			
				groups.set(x, group);
			}
		}
		
		return groups;
	}
		private PatientAssessmentGroupVoCollection getAnswersFlat(PatientAssessmentGroupVoCollection answers)
	{
			if(answers == null)
				answers = new PatientAssessmentGroupVoCollection();
				
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			AssessmentQuestionGroupVo questionGroup = (AssessmentQuestionGroupVo)(this.grid.getRows().get(x).getCells().get(this.grid.getColumns().getByIdentifier(QUESTION_COLUMN)).getIdentifier());
				PatientAssessmentQuestionVoCollection questionAnswers = getQuestionRowAnswer(this.grid.getRows().get(x), getPatientAssessmentVoCollection(answers, questionGroup));								
			
			PatientAssessmentGroupVo group = new PatientAssessmentGroupVo();
			group.setAssessmentQuestionGroup(questionGroup);			
						
			answers = addUpdateGroupQuestionFlat(answers, group, questionAnswers);
		}
		
		return answers;
	}
		private PatientAssessmentQuestionVoCollection getPatientAssessmentVoCollection(PatientAssessmentGroupVoCollection answers, AssessmentQuestionGroupVo questionGroup)
		{
			for (int i = 0; answers != null && i < answers.size(); i++)
			{
				if(answers.get(i).getAssessmentQuestionGroupIsNotNull() && answers.get(i).getAssessmentQuestionGroup().equals(questionGroup))
					return answers.get(i).getAssessmentAnswers();
			}

			return new PatientAssessmentQuestionVoCollection();
		}
	private PatientAssessmentGroupVoCollection addUpdateGroupQuestionFlat(PatientAssessmentGroupVoCollection answers, PatientAssessmentGroupVo group, PatientAssessmentQuestionVoCollection questionAnswers)
	{
		if(answers == null)
			answers = new PatientAssessmentGroupVoCollection();		
		if(group == null || questionAnswers == null)
			return answers;
			
		int index = -1;
		for(int x = 0; x < answers.size(); x++)
		{
			if(answers.get(x).getAssessmentQuestionGroup() != null 
					&& answers.get(x).getAssessmentQuestionGroup().equals(group.getAssessmentQuestionGroup()))
			{			
				index = x;	
				group = answers.get(x);
				break;
			}
		}
		
		PatientAssessmentQuestionVoCollection groupAnswers = group.getAssessmentAnswers();
		if(groupAnswers == null)
			groupAnswers = new PatientAssessmentQuestionVoCollection();		
						
		for(int x = 0; x < questionAnswers.size(); x++)
		{			
			boolean found = false;
			if(index > -1 && answers.get(index).getAssessmentAnswers() != null)
			{
				for(int y = 0; y < answers.get(index).getAssessmentAnswers().size(); y++)
				{
					if(answers.get(index).getAssessmentAnswers().get(y) != null 
							&& answers.get(index).getAssessmentAnswers().get(y).getAssessmentQuestionIsNotNull()
							&& answers.get(index).getAssessmentAnswers().get(y).getAssessmentQuestion().equals(questionAnswers.get(x).getAssessmentQuestion()))
					{
						found = true;						
						for(int z = 0; z < questionAnswers.get(x).getPatientAnswers().size(); z++)
						{
							answers.get(index).getAssessmentAnswers().get(y).getPatientAnswers().add(questionAnswers.get(x).getPatientAnswers().get(z));
						}
						break;
					}
				}
			}
			
			if(!found)
				groupAnswers.add(questionAnswers.get(x));
		}			
		
		if(groupAnswers.size() > 0)
			group.setAssessmentAnswers(groupAnswers);
		
		if(index != - 1)
			answers.set(index, group);
		else
			answers.add(group);
		
		return answers;
	}
	
	private PatientGraphicAssessmentQuestionAnswerVoCollection updateGraphicQuestion(PatientGraphicAssessmentQuestionAnswerVoCollection answers, DynamicGridRow row)
	{
		if(answers == null)
			answers = new PatientGraphicAssessmentQuestionAnswerVoCollection();		
		if(row == null || NON_DATA_ROW.equals(row.getIdentifier()))
			return answers;
		
		
		GraphicAssessmentQuestionVo question = (GraphicAssessmentQuestionVo)row.getIdentifier();
		PatientGraphicAssessmentQuestionAnswerVo answer = findOrCreateAnswer(answers, question);
		
		answer.setGraphicQuestion(question);
		answer.setIsMandatory(question.getIsMandatory());
				
		AnswerDetailsVoCollection answerDetails = new AnswerDetailsVoCollection();
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = row.getCells().get(this.grid.getColumns().get(x));
			
			if(cell != null && !cell.getType().equals(DynamicCellType.DYNAMICLABEL) && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof QuestionAnswerTypeVo || cell.getIdentifier() instanceof AnswerCellData))
			{										
				answerDetails.add(getCellAnswer(cell));					
			}			
		}
		
		PatientAssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		if(patientAnswers == null)
			patientAnswers = new PatientAssessmentAnswerVoCollection();			
		
		PatientAssessmentAnswerVo patientAnswer = (PatientAssessmentAnswerVo)row.getValue();
		if(patientAnswer == null)
			patientAnswer = new PatientAssessmentAnswerVo();

		if(isFirstAnswer(row))
			patientAnswers.clear();
		
		//PatientAssessmentAnswerVo patientAnswer = new PatientAssessmentAnswerVo();
		patientAnswer.setAnswerDetails(answerDetails);		
		patientAnswers.add(patientAnswer);
		
		answer.setPatientAnswers(patientAnswers);
		answer.setIsAnswered(isAnswered(answer));
		
		answers.add(answer);
		return answers;
	}
	
	private PatientGraphicAssessmentFindingQuestionAnswerVoCollection updateGraphicFindingQuestion(PatientGraphicAssessmentFindingQuestionAnswerVoCollection answers, DynamicGridRow row)
	{
		if(answers == null)
			answers = new PatientGraphicAssessmentFindingQuestionAnswerVoCollection();		
		if(row == null || NON_DATA_ROW.equals(row.getIdentifier()))
			return answers;
		
		GraphicAssessmentFindingQuestionVo question = (GraphicAssessmentFindingQuestionVo)row.getIdentifier();
		PatientGraphicAssessmentFindingQuestionAnswerVo answer = findOrCreateAnswer(answers, question);
		
		answer.setGraphicFindingQuestion(question);
		answer.setIsMandatory(question.getIsMandatory());
				
		AnswerDetailsVoCollection answerDetails = new AnswerDetailsVoCollection();
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = row.getCells().get(this.grid.getColumns().get(x));
			
			//we save the separators as well
			//if(cell != null && !cell.getType().equals(DynamicCellType.DYNAMICLABEL) && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && cell.getIdentifier() instanceof QuestionAnswerTypeVo)
			if(cell != null && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof QuestionAnswerTypeVo || cell.getIdentifier() instanceof AnswerCellData))
			{										
				answerDetails.add(getCellAnswer(cell));					
			}			
		}
		
		PatientAssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		if(patientAnswers == null)
			patientAnswers = new PatientAssessmentAnswerVoCollection();
		else if(isFirstAnswer(row))
			patientAnswers.clear();
		
		PatientAssessmentAnswerVo patientAnswer = (PatientAssessmentAnswerVo)row.getValue();
		if(patientAnswer == null)
			patientAnswer = new PatientAssessmentAnswerVo();
		
		patientAnswer.setAnswerDetails(answerDetails);		
		patientAnswers.add(patientAnswer);
		
		answer.setPatientAnswers(patientAnswers);	
		answer.setIsAnswered(isAnswered(answer));
		answers.add(answer);
		return answers;
	}
	
	private PatientAssessmentGroupVoCollection getAnswersHierarchical(PatientAssessmentGroupVoCollection answers)
	{
			if(answers == null)
				answers = new PatientAssessmentGroupVoCollection();
		
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			PatientAssessmentGroupVo groupAnswers = getGroupRowAnswer(this.grid.getRows().get(x));
			if(groupAnswers != null)
				answers.add(groupAnswers);
		}
		
		return answers;
	}
	private PatientAssessmentGroupVo getGroupRowAnswer(DynamicGridRow groupRow)
	{
		if(groupRow == null || groupRow.getRows().size() == 0)
			return null;
		
			GroupRowData groupData = (GroupRowData)groupRow.getIdentifier();
			
			PatientAssessmentGroupVo groupAnswers = groupData.getInstGroup();
			if(groupAnswers == null)
				groupAnswers = new PatientAssessmentGroupVo();
			
			//groupAnswers.setAssessmentQuestionGroup((AssessmentQuestionGroupVo)groupRow.getIdentifier());		
			groupAnswers.setAssessmentQuestionGroup(groupData.getConfigGroup());
			PatientAssessmentQuestionVoCollection answers = groupAnswers.getAssessmentAnswers();
		
		for(int x = 0; x < groupRow.getRows().size(); x++)
		{
			answers = getQuestionRowAnswer(groupRow.getRows().get(x), answers);
		}
		
		groupAnswers.setAssessmentAnswers(answers);
		return groupAnswers;
	}
	
	private PatientAssessmentQuestionVo findAnswer(PatientAssessmentGroupVoCollection groupVoColl, AssessmentQuestionVo question)
	{
		if (groupVoColl == null || question == null)
			return null;
		
		for (int i = 0; i < groupVoColl.size(); i++)
		{
			for (int j = 0; j < groupVoColl.get(i).getAssessmentAnswers().size(); j++)
			{
				PatientAssessmentQuestionVo answer = groupVoColl.get(i).getAssessmentAnswers().get(j);
				AssessmentQuestionVo assessmentQuestion = answer.getAssessmentQuestion();
				if (assessmentQuestion != null && assessmentQuestion.equals(question))
					return answer;
			}

		}
		return null;
	}
	
	private PatientAssessmentQuestionVo findOrCreateAnswer(PatientAssessmentQuestionVoCollection assesmentQuestions, AssessmentQuestionVo question)
	{
		if(assesmentQuestions == null || question == null)
			return new PatientAssessmentQuestionVo();
		
		for(int x = 0; x < assesmentQuestions.size(); x++)
		{
			PatientAssessmentQuestionVo assessmentQuestion = assesmentQuestions.get(x);
			if(assessmentQuestion != null 
					&& assessmentQuestion.getAssessmentQuestionIsNotNull()
					&& assessmentQuestion.getAssessmentQuestion().equals(question))
			{
				return assessmentQuestion;
			}
		}
		
		return new PatientAssessmentQuestionVo();
	}

	private PatientGraphicAssessmentFindingQuestionAnswerVo findOrCreateAnswer(PatientGraphicAssessmentFindingQuestionAnswerVoCollection answers, GraphicAssessmentFindingQuestionVo question)
	{
		if(answers == null || question == null)
			return new PatientGraphicAssessmentFindingQuestionAnswerVo();
		
		for(int x = 0; x < answers.size(); x++)
		{
			PatientGraphicAssessmentFindingQuestionAnswerVo answer = answers.get(x);
			if(answer != null 
					&& answer.getGraphicFindingQuestionIsNotNull()
					&& answer.getGraphicFindingQuestion().equals(question))
			{
				return answer;
			}
		}
		
		return new PatientGraphicAssessmentFindingQuestionAnswerVo();
	}
	
	private PatientGraphicAssessmentQuestionAnswerVo findOrCreateAnswer(PatientGraphicAssessmentQuestionAnswerVoCollection answers, GraphicAssessmentQuestionVo question)
	{
		if(answers == null || question == null)
			return new PatientGraphicAssessmentQuestionAnswerVo();
		
		for(int x = 0; x < answers.size(); x++)
		{
			PatientGraphicAssessmentQuestionAnswerVo answer = answers.get(x);
			if(answer != null 
					&& answer.getGraphicQuestionIsNotNull()
					&& answer.getGraphicQuestion().equals(question))
			{
				return answer;
			}
		}
		
		return new PatientGraphicAssessmentQuestionAnswerVo();
	}
	
	private PatientAssessmentQuestionVoCollection getQuestionRowAnswer(DynamicGridRow row, PatientAssessmentQuestionVoCollection answers)
	{
		if(row == null)
			return answers;
		if(answers == null)
			answers = new PatientAssessmentQuestionVoCollection();
		
		AssessmentQuestionVo question = (AssessmentQuestionVo)row.getIdentifier();
		PatientAssessmentQuestionVo answer = findOrCreateAnswer(answers, question);
		
		answer.setAssessmentQuestion(question);
		AnswerStatus status = AnswerStatus.ANSWERED;
		if(isDPP)
		{
			DynamicGridColumn column = this.grid.getColumns().getByIdentifier(NOTAPPLICABLE_COLUMN);
			if(column != null)
			{
				DynamicGridCell cellNA = row.getCells().get(column);
				if(cellNA.getValue() instanceof Boolean && ((Boolean)cellNA.getValue()).booleanValue())
					status = AnswerStatus.NOTAPPLICABLE;
			}
			
			DynamicGridColumn confirmColumn = this.grid.getColumns().getByIdentifier(CONFIRM_COLUMN);
			if(confirmColumn != null)
			{
				DynamicGridCell confirmCell = row.getCells().get(confirmColumn);
				if(confirmCell != null && confirmCell.getValue() instanceof Boolean)
					answer.setIsConfirmed((Boolean)confirmCell.getValue());
			}
		}

		answer.setIsMandatory(question.getIsMandatory());
		answer.setAllowsMultipleAnswers(question.getAllowsMultipleAnswersIsNotNull() ? question.getAllowsMultipleAnswers() : Boolean.FALSE);
		answer.setSequence(new Integer(overallQuestionSequence++));
		
		AnswerDetailsVoCollection answerDetails = new AnswerDetailsVoCollection();
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = row.getCells().get(this.grid.getColumns().get(x));
			
				if(cell != null && !cell.getType().equals(DynamicCellType.DYNAMICLABEL) && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof QuestionAnswerTypeVo || cell.getIdentifier() instanceof AnswerCellData))
			{										
				answerDetails.add(getCellAnswer(cell));					
			}			
		}
		
		PatientAssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		if(patientAnswers == null)
			patientAnswers = new PatientAssessmentAnswerVoCollection();			
		else if(isFirstAnswer(row))
			patientAnswers.clear();
			
		PatientAssessmentAnswerVo patientAnswer = (PatientAssessmentAnswerVo)row.getValue();
		if(patientAnswer == null)
			patientAnswer = new PatientAssessmentAnswerVo();
		
		patientAnswer.setAnswerDetails(answerDetails);		
		patientAnswers.add(patientAnswer);
		
		answer.setPatientAnswers(patientAnswers);
		
		//Set Status
		if(isDPP)
		{
			if(status != null && status.equals(AnswerStatus.NOTAPPLICABLE) == false)
				answer.setIsAnswered(isAnswered(answer) ? AnswerStatus.ANSWERED : AnswerStatus.NOTANSWERED);
			else
				answer.setIsAnswered(status);
		}
		else
		{
			answer.setIsAnswered(isAnswered(answer) ? AnswerStatus.ANSWERED : AnswerStatus.NOTANSWERED);
		}
		
		answers.add(answer);
		return answers;
	}	
	
	public PatientAssessmentVo updateQuestionStatusToAnswered(PatientAssessmentVo voPatientAssessment, AnswerStatus status)
	{
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			DynamicGridRow row = this.grid.getRows().get(x);
		
			AssessmentQuestionVo question = (AssessmentQuestionVo)row.getIdentifier();
			PatientAssessmentQuestionVo answer = findAnswer(voPatientAssessment.getAssessmentData().getAnswerGroups(), question);
			if(answer == null)
				throw new CodingRuntimeException("Unable to find an answer for '" + question.getQuestion().getText() + "' question.");
			if(status == null)
				throw new CodingRuntimeException("No status provided for '" + question.getQuestion().getText() + "' question.");
			//Change the status from Non Applicable to Answered
			if(isAnswerStatus(answer, status))
			{
				DynamicGridColumn columnNASelect = this.grid.getColumns().getByIdentifier(SELECT_NA_COLUMN);
				if(columnNASelect != null)
				{
					DynamicGridCell cellNASelect = row.getCells().get(columnNASelect);
					if(cellNASelect.getValue() instanceof Boolean && ((Boolean)cellNASelect.getValue()).booleanValue())
						answer.setIsAnswered(AnswerStatus.ANSWERED);
				}
			}
		}
		
		return voPatientAssessment;
	}	

	public AnswerDetailsVo getCellAnswer(DynamicGridCell cell)
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
	
	private void setAnswersGraphic(PatientGraphicAssessmentQuestionAnswerVoCollection answers)
	{
		if(answers == null || answers.size() <= 0)
			return;

		for(int x = 0; x < answers.size(); x++)
		{
			PatientGraphicAssessmentQuestionAnswerVo answerGraphic = answers.get(x);
			setQuestionRowAnswer(answerGraphic);
		}
	}
	
	private DynamicGridRow getRowsByIdentifier(PatientGraphicAssessmentQuestionAnswerVo voPatientGAQAnswer)
	{
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			PatientGraphicAssessmentQuestionAnswerVo questionAnswer = (PatientGraphicAssessmentQuestionAnswerVo)(this.grid.getRows().get(x).getCells().get(this.grid.getColumns().getByIdentifier(QUESTION_COLUMN)).getIdentifier());
			if(voPatientGAQAnswer.equals(questionAnswer))
				return this.grid.getRows().get(x);
		}
		
		return null;
	}

	private void setAnswersGraphicFindings(PatientGraphicalAssessmentStageVoCollection stages)
	{
		if(stages == null || stages.size() <= 0)
			return;

		//we need annotated stage
		PatientGraphicalAssessmentStageVo annotatedStage = null;
		for (int i = 0; i < stages.size(); i++)
		{
			PatientGraphicalAssessmentStageVo stage = stages.get(i);
			
			if(stage.getStageIsNotNull() 
					&& stage.getStage().getAssessmentStageIsNotNull() 
					&& stage.getStage().getAssessmentStage().getIsAnnotatedIsNotNull()
					&& stage.getStage().getAssessmentStage().getIsAnnotated().booleanValue())
			{
				annotatedStage = stage;
				break;
			}
		}
		
		if(annotatedStage == null)
		{
			//we should always have an annotated stage
			annotatedStage = stages.get(0);
		}
		//else
		{
			if(annotatedStage.getFindingQuestionIsNotNull())
			{
				for(int x = 0; x < annotatedStage.getFindingQuestion().size(); x++)
				{
					PatientGraphicAssessmentFindingQuestionAnswerVo answerGraphicFinding = annotatedStage.getFindingQuestion().get(x);
					setQuestionFindingRowAnswer(answerGraphicFinding);
				}
			}
		}
	}
	private void setAnswersGraphicFindings(PatientGraphicalAssessmentStageVo pgasVo)
	{
		if(pgasVo == null)
			return;

		if(pgasVo.getFindingQuestionIsNotNull())
		{
			for(int x = 0; x < pgasVo.getFindingQuestion().size(); x++)
			{
				PatientGraphicAssessmentFindingQuestionAnswerVo answerGraphicFinding = pgasVo.getFindingQuestion().get(x);
				setQuestionFindingRowAnswer(answerGraphicFinding);
			}
		}
	}
	private DynamicGridRow getRowByIdentifier(PatientGraphicAssessmentFindingQuestionAnswerVo graphicFindingQuestionAnswer)
	{
		if(graphicFindingQuestionAnswer == null)
			return null;

		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			PatientGraphicAssessmentFindingQuestionAnswerVo findingAnswer = (PatientGraphicAssessmentFindingQuestionAnswerVo)(this.grid.getRows().get(x).getCells().get(this.grid.getColumns().getByIdentifier(QUESTION_COLUMN)).getIdentifier());
			if(graphicFindingQuestionAnswer.equals(findingAnswer))
				return this.grid.getRows().get(x);
		}
		
		return null;
	}
	
	private void setAnswersFlat(PatientAssessmentGroupVoCollection answers)
	{
		if(answers == null)
			return;
		
		for(int x = 0; x < answers.size(); x++)
		{
			PatientAssessmentGroupVo answerGroup = answers.get(x);
			if(answerGroup != null && answerGroup.getAssessmentAnswersIsNotNull())
			{
				for(int y = 0; y < answerGroup.getAssessmentAnswers().size(); y++)
				{
					setQuestionRowAnswer(null, answerGroup.getAssessmentAnswers().get(y));
				}
			}
		}
	}
	private void setAnswersHierarchical(PatientAssessmentGroupVoCollection answers)
	{
		if(answers == null)
			return;
		
		for(int x = 0; x < answers.size(); x++)
		{
			PatientAssessmentGroupVo answerGroup = answers.get(x);
			if(answerGroup != null)
			{
				setGroupRowAnswer(answerGroup);
			}
		}
	}
	private boolean setGroupRowAnswer(PatientAssessmentGroupVo answerGroup)
	{
		if(answerGroup == null)
			return false;
		
		DynamicGridRow groupRow = findRow(answerGroup.getAssessmentQuestionGroup());	
		if(groupRow == null)
			return false;
		
		GroupRowData groupData = (GroupRowData)groupRow.getIdentifier();
		groupRow.setIdentifier(new GroupRowData(groupData.getConfigGroup(), answerGroup));
		
		
		for(int x = 0; x < answerGroup.getAssessmentAnswers().size(); x++)
		{
			setQuestionRowAnswer(groupRow, answerGroup.getAssessmentAnswers().get(x));
		}
		
		return true;
	}
	
	private boolean setQuestionRowAnswer(PatientGraphicAssessmentQuestionAnswerVo graphicAnswer)
	{
		if(graphicAnswer == null || graphicAnswer.getPatientAnswers() == null)
			return false;
		
		DynamicGridRow initialQuestionRow = null;
		DynamicGridRow questionRow = getRowsByIdentifier(graphicAnswer);		
		if(questionRow == null)
			return false;
		
		for(int i = 0; i < graphicAnswer.getPatientAnswers().size(); i++)
		{
			PatientAssessmentAnswerVo answerDetail = graphicAnswer.getPatientAnswers().get(i);
		
			if(answerDetail != null)
			{
				if(i > 0)
				{
					if(initialQuestionRow == null)
						initialQuestionRow = questionRow;
					
					questionRow = duplicateQuestionRow(initialQuestionRow);
				}
				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{
					AnswerDetailsVo answer = answerDetail.getAnswerDetails().get(x);
					DynamicGridCell cell = findCell(questionRow, answer.getAnswerType());
					
					if(cell != null)
					{
						if (x == 0)
							cell.getRow().setValue(answerDetail);
						
						setCellAnswer(cell, answer);
					}
				}
			}
		}
		
		return true;
	}
		
	private boolean setQuestionFindingRowAnswer(PatientGraphicAssessmentFindingQuestionAnswerVo graphicAnswer)
	{
		if(graphicAnswer == null || graphicAnswer.getPatientAnswers() == null)
			return false;
		
		DynamicGridRow initialQuestionRow = null;
		DynamicGridRow questionRow = getRowByIdentifier(graphicAnswer);		
		if(questionRow == null)
			return false;
		
		for(int i = 0; i < graphicAnswer.getPatientAnswers().size(); i++)
		{
			PatientAssessmentAnswerVo answerDetail = graphicAnswer.getPatientAnswers().get(i);
		
			if(answerDetail != null)
			{
				if(i > 0)
				{
					if(initialQuestionRow == null)
						initialQuestionRow = questionRow;
					
					questionRow = duplicateQuestionRow(initialQuestionRow);
				}
				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{
					AnswerDetailsVo answer = answerDetail.getAnswerDetails().get(x);
					DynamicGridCell cell = findCell(questionRow, answer.getAnswerType());
					
					if(cell != null)
					{
						if (x == 0)
							cell.getRow().setValue(answerDetail);
						
						setCellAnswer(cell, answer);
					}
				}
			}
		}
		
		return true;
	}

	private boolean setQuestionRowAnswer(DynamicGridRow groupRow, PatientAssessmentQuestionVo assessmentQuestion)
	{
		if(assessmentQuestion == null || assessmentQuestion.getPatientAnswers() == null)
			return false;
		
		DynamicGridRow initialQuestionRow = null;
		DynamicGridRow questionRow = findRow(groupRow, assessmentQuestion.getAssessmentQuestion());		
		if(questionRow == null)
			return false;
		
		if(isDPP)
		{
			//Set Readonly the row if IsRoleReadOnly = true
			if(assessmentQuestion.getIsRoleReadOnlyIsNotNull() && assessmentQuestion.getIsRoleReadOnly().booleanValue())
			{
				questionRow.setReadOnly(true);
				questionRow.setBackColor(Color.LightGray);
			}
			DynamicGridColumn pocColumn = this.grid.getColumns().getByIdentifier(POC_COLUMN);
			boolean isNewAssessmentQuestion = assessmentQuestion.getID_PatientAssessmentQuestionIsNotNull();
			if(pocColumn != null)
			{
				DynamicGridCell pocCell = questionRow.getCells().get(pocColumn);
				if(pocCell != null)
				{
					Boolean pocChecked = assessmentQuestion != null ? assessmentQuestion.getIsPoc() : Boolean.FALSE;
					boolean pocSaved   = assessmentQuestion.getIsPocSavedIsNotNull()?assessmentQuestion.getIsPocSaved().booleanValue():false;
					//Set readonly the cell when we have a saved POC value against a Question or pocSaved (Question had a POC previously saved against)
					if (pocChecked != null && pocChecked.booleanValue() && (isNewAssessmentQuestion || pocSaved))
						pocCell.setReadOnly(true);
					pocCell.setValue(pocChecked);				
				}
			}
			
			DynamicGridColumn confirmColumn = this.grid.getColumns().getByIdentifier(CONFIRM_COLUMN);
			if(confirmColumn != null)
			{
				DynamicGridCell confirmCell = questionRow.getCells().get(confirmColumn);
				if(confirmCell != null)
				{
					confirmCell.setValue(assessmentQuestion.getIsConfirmed());
					if(assessmentQuestion.getIsConfirmedIsNotNull() && assessmentQuestion.getIsConfirmed().booleanValue() && isNewAssessmentQuestion)
						confirmCell.setReadOnly(true);
				}
			}
			
			//Set Readonly the NA cell if we have either Confirmed or POC
			boolean isConfirmed = assessmentQuestion.getIsConfirmedIsNotNull() && assessmentQuestion.getIsConfirmed().booleanValue();
			boolean isPoc = assessmentQuestion.getIsPocIsNotNull() && assessmentQuestion.getIsPoc().booleanValue();
			if(isConfirmed || isPoc)
			{
				DynamicGridColumn naColumn = this.grid.getColumns().getByIdentifier(NOTAPPLICABLE_COLUMN);
				if(naColumn != null)
				{
					DynamicGridCell naCell = questionRow.getCells().get(naColumn);
					if(naCell != null)
					{
						naCell.setReadOnly(true);
					}
				}
			}
		}
		
		for(int i = 0; i < assessmentQuestion.getPatientAnswers().size(); i++)
		{
			PatientAssessmentAnswerVo answerDetail = assessmentQuestion.getPatientAnswers().get(i);
		
			if(answerDetail != null)
			{
				if(i > 0)
				{
					if(initialQuestionRow == null)
						initialQuestionRow = questionRow;
					
					questionRow = duplicateQuestionRow(initialQuestionRow);
				}
				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{
					AnswerDetailsVo answer = answerDetail.getAnswerDetails().get(x);
					DynamicGridCell cell = findCell(questionRow, answer.getAnswerType());
					
					if(cell != null)
					{
						if(isDPP)
							cell.setAutoPostBack(true);
						
						if (x == 0)
							cell.getRow().setValue(answerDetail);
			
						setCellAnswer(cell, answer);
					}
				}
			}
		}
		
		return true;		
	}
	private void setCellAnswer(DynamicGridCell cell, AnswerDetailsVo answer)
	{
		if (cell == null)
			return;
		if (answer == null)
			return;

		QuestionAnswerTypeVo answerType = null;

		if (cell.getIdentifier() instanceof QuestionAnswerTypeVo)
			answerType = (QuestionAnswerTypeVo) cell.getIdentifier();
		else if (cell.getIdentifier() instanceof AnswerCellData)
			answerType = ((AnswerCellData) cell.getIdentifier()).getConfigData();

		cell.setIdentifier(new AnswerCellData(answerType, answer));
		
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
		
	private boolean isFirstAnswer(DynamicGridRow row)
	{
		if(row == null)
			throw new CodingRuntimeException("Invalid Row");

		return row.equals(findFirstRowWithSameIdentifier(row.getParent() == null?this.grid.getRows():row.getParent().getRows(), row.getIdentifier()));
	}
		
	private DynamicGridCell findCell(DynamicGridRow questionRow, QuestionAnswerTypeVo answerType)
	{
		if(questionRow == null)
			return null;
		if(answerType == null)
			return null;
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = questionRow.getCells().get(this.grid.getColumns().get(x));
			
			if(cell != null && cell.getIdentifier() != null)
			{										
					if(cell.getIdentifier() instanceof QuestionAnswerTypeVo && cell.getIdentifier().equals(answerType))
						return cell;
					else if(cell.getIdentifier() instanceof AnswerCellData && ((AnswerCellData)cell.getIdentifier()).getConfigData().equals(answerType))
						return cell;
			}			
		}
		
		return null;
	}
	private DynamicGridRow findRow(DynamicGridRow groupRow, AssessmentQuestionVo assessmentQuestion)
	{
		if(assessmentQuestion == null)
			return null;
		
		DynamicGridRowCollection rows = null;
		if(groupRow != null)
			rows = groupRow.getRows();
		else
			rows = this.grid.getRows();
		
		for(int x = 0; x < rows.size(); x++)
		{
			DynamicGridRow row = rows.get(x);
			if(row.getIdentifier() != null && row.getIdentifier() instanceof AssessmentQuestionVo)
			{
				if(row.getIdentifier().equals(assessmentQuestion))
					return row;
			}
		}
		
		return null;
	}
	private DynamicGridRow findRow(AssessmentQuestionGroupVo assessmentQuestionGroup)
	{
		if(assessmentQuestionGroup == null)
			return null;
		
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			DynamicGridRow row = this.grid.getRows().get(x);
				if(row.getIdentifier() != null)
				{
					if(row.getIdentifier() instanceof AssessmentQuestionGroupVo)
			{
				if(row.getIdentifier().equals(assessmentQuestionGroup))
					return row;
			}
					else if(row.getIdentifier() instanceof GroupRowData)
					{
						if(((GroupRowData)row.getIdentifier()).getConfigGroup().equals(assessmentQuestionGroup))
							return row; 
					}
				}
		}
		
		return null;
	}		
	private void prepareGraphicGrid(boolean isComplete)
	{
		this.grid.clear();			
		this.grid.setSelectable(false);
		createStaticColumns(isComplete);
	}
	private void createStaticColumns(boolean isComplete)
	{
		 if(this.questionImage != null && this.mandatoryQuestionImage != null)
			 createImageColumnWhenFlat();
		 
		DynamicGridColumn questionColumn = this.grid.getColumns().newColumn("Question", QUESTION_COLUMN);
		questionColumn.setCanGrow(false);
		questionColumn.setWidth(DEFAULT_GRAPHIC_QUESTION_COLUMN_WIDTH);	
				
		if(!isComplete)
		{
			DynamicGridColumn buttonColumn = this.grid.getColumns().newColumn("", BUTTON_COLUMN);
			buttonColumn.setAlignment(Alignment.CENTER);
			buttonColumn.setCanGrow(false);
			buttonColumn.setWidth(0);			
		}
	}

	private void prepareGrid(boolean flatView, Integer questionColumnWidth)
	{
		prepareGrid(flatView, questionColumnWidth, false);		
	}
	private void prepareGrid(boolean flatView, Integer questionColumnWidth, boolean isComplete)
	{
		this.grid.clear();			
		this.grid.setSelectable(false);	
		createStaticColumns(flatView, questionColumnWidth, isComplete);
	}
	private void createStaticColumns(boolean flatView, Integer questionColumnWidth, boolean isComplete) 
	{
		if(flatView && this.questionImage != null && this.mandatoryQuestionImage != null)
			createImageColumnWhenFlat();
		
		DynamicGridColumn questionColumn = this.grid.getColumns().newColumn(flatView ? "Question" : "Group / Question", QUESTION_COLUMN);
		questionColumn.setCanGrow(false);
		questionColumn.setWidth(questionColumnWidth == null ? (isDPP ? DEFAULT_QUESTION_COLUMN_WIDTH - 240 : DEFAULT_QUESTION_COLUMN_WIDTH) : questionColumnWidth.intValue());	
				
		if(!isComplete)
		{
			DynamicGridColumn buttonColumn = this.grid.getColumns().newColumn("", BUTTON_COLUMN);
			buttonColumn.setAlignment(Alignment.CENTER);
			buttonColumn.setCanGrow(false);
			buttonColumn.setWidth(0);			
		}
	}

	private int countActiveQuestions(AssessmentQuestionVoCollection questions)
	{
		if(questions == null)
			return 0;
		
		int count = 0;
		for(int x = 0; x < questions.size(); x++)
		{
			AssessmentQuestionVo question = questions.get(x);
			if(question.getActiveStatusIsNotNull() 
					&& question.getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
				count++;
		}		
		return count;
	}
	private AssessmentQuestionGroupVoCollection buildExistingGroups(PatientAssessmentDataVo data) throws PresentationLogicException
	{
		if(data.getAnswerGroups() == null)
			return new AssessmentQuestionGroupVoCollection();		
		checkDataIntegrity(data);
		
		AssessmentQuestionGroupVoCollection result = new AssessmentQuestionGroupVoCollection();
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			result.add(data.getAnswerGroups().get(x).getAssessmentQuestionGroup());
		}
		
		return result;
	}
	private PatientAssessmentGroupVo getInstGroup(PatientAssessmentDataVo data, AssessmentQuestionGroupVo configGroup)
	{
		if(data == null || configGroup == null)
			return null;
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			if(data.getAnswerGroups().get(x) != null
					&& data.getAnswerGroups().get(x).getAssessmentQuestionGroup() != null
					&& data.getAnswerGroups().get(x).getAssessmentQuestionGroup().equals(configGroup))
			{
				return data.getAnswerGroups().get(x);
			}
		}
		
		return null;
	}
	private PatientAssessmentQuestionVo getInstAnswer(PatientAssessmentDataVo data, AssessmentQuestionGroupVo configGroup, AssessmentQuestionVo configQuestion)
	{
		if(data == null || configGroup == null || configQuestion == null)
			return null; 
		
		PatientAssessmentGroupVo instGroup = getInstGroup(data, configGroup);
		if(instGroup == null)
			return null;
		
		for(int x = 0; x < instGroup.getAssessmentAnswers().size(); x++)
		{
			if(instGroup.getAssessmentAnswers().get(x) != null
					&& instGroup.getAssessmentAnswers().get(x).getAssessmentQuestion() != null
					&& instGroup.getAssessmentAnswers().get(x).getAssessmentQuestion().equals(configQuestion))
			{
				return instGroup.getAssessmentAnswers().get(x);
			}				
		}
		
		return null;
	}
	private AssessmentQuestionVoCollection buildExistingQuestions(PatientAssessmentDataVo data, AssessmentQuestionGroupVo group) throws PresentationLogicException
	{
		if(data.getAnswerGroups() == null || group == null)
			return new AssessmentQuestionVoCollection();
		checkDataIntegrity(data);		
		
		AssessmentQuestionVoCollection result = new AssessmentQuestionVoCollection();
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			if(data.getAnswerGroups().get(x).getAssessmentQuestionGroup() != null
					&& data.getAnswerGroups().get(x).getAssessmentQuestionGroup().equals(group))
			{
				PatientAssessmentQuestionVoCollection answers = sortAnswersBySequence(data.getAnswerGroups().get(x).getAssessmentAnswers()); 
				for(int y = 0; y < answers.size(); y++)
				{
					result.add(data.getAnswerGroups().get(x).getAssessmentAnswers().get(y).getAssessmentQuestion());
				}
			}
		}
		
		return result;
	}
	private void populateQuestionsHierarchical(PatientAssessmentDataVo data) throws PresentationLogicException 
	{
		if(data.getAnswerGroups() == null)
			return;		
		checkDataIntegrity(data);		
		boolean flatView = data.getUserAssessment().getIsFlatView().booleanValue();
		
		AssessmentQuestionGroupVoCollection existingGroups = buildExistingGroups(data);
		
		for(int x = 0; x < existingGroups.size(); x++)
		{
			if(existingGroups.get(x) != null)
			{
				AssessmentQuestionVoCollection existingQuestions = buildExistingQuestions(data, existingGroups.get(x));
				
				if(flatView)
				{
					for(int y = 0; y < existingQuestions.size(); y++)
					{
						addQuestionRow(existingQuestions.get(y), existingGroups.get(x), getInstAnswer(data, existingGroups.get(x), existingQuestions.get(y)));						
					}
				}
				else
				{		
					addGroupRow(existingGroups.get(x), existingQuestions, data);
				}
			}
		}
	}	
	private void populateQuestionsHierarchical(UserAssessmentVo data) throws PresentationLogicException
	{	
		if(data.getQuestionGroups() == null)
			return;
		checkDataIntegrity(data);
		boolean flatView = data.getIsFlatView().booleanValue();
		
		for(int x = 0; x < data.getQuestionGroups().size(); x++)
		{
			if(data.getQuestionGroups().get(x) != null 
					&& data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
					&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
			{
				if(flatView)				
				{
					if(data.getQuestionGroups().get(x).getQuestionsIsNotNull())
					{
						for(int y = 0; y < data.getQuestionGroups().get(x).getQuestions().size(); y++)
						{
							if(data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
									&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE) 
									&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatusIsNotNull() 
									&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
							{
								addQuestionRow(data.getQuestionGroups().get(x).getQuestions().get(y), data.getQuestionGroups().get(x), null);
							}
						}
					}
				}
				else
				{
					if(countActiveQuestions(data.getQuestionGroups().get(x).getQuestions()) > 0)
						addGroupRow(data.getQuestionGroups().get(x));
				}
			}
		}
	}	
	private void populateQuestionsFlat(PatientAssessmentDataVo data, AnswerStatus answerStatus) throws PresentationLogicException
	{
		if(data.getAnswerGroups() == null)
			return;
				
		PatientAssessmentQuestionVoCollection answers = new PatientAssessmentQuestionVoCollection();
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			if(data.getAnswerGroups().get(x) != null 
					&& data.getAnswerGroups().get(x).getAssessmentAnswers() != null)
			{
				for(int y = 0; y < data.getAnswerGroups().get(x).getAssessmentAnswers().size(); y++)
				{
					PatientAssessmentQuestionVo answer = data.getAnswerGroups().get(x).getAssessmentAnswers().get(y);
					
					if(isDPP)
					{
						//For DPP add only the asnwers having the same AnswerStatus (e.g. ANSWERED, NOT APPLICABLE)
						if(isAnswerStatus(answer, answerStatus))
							answers.add(answer);
					}
					else
					{
						// WDEV-5868
						//if(!displayAnsweredOnly || (answer.getIsAnsweredIsNotNull() && answer.getIsAnswered().equals(AnswerStatus.ANSWERED) && answer.getAssessmentQuestionIsNotNull()))
						// we show all the questions
						if(answer.getAssessmentQuestionIsNotNull())
						{						
							answers.add(answer);
						}
					}
				}
			}
		}		
		
		answers = sortAnswersBySequence(answers);
		
		for(int x = 0; x < answers.size(); x++)
		{
			PatientAssessmentQuestionVo answer = answers.get(x);
			AssessmentQuestionVo question = answer.getAssessmentQuestion();
			AssessmentQuestionGroupVo questionGroup = null;
			
			for(int y = 0; y < data.getAnswerGroups().size(); y++)
			{
				if(data.getAnswerGroups().get(y) != null 
						&& data.getAnswerGroups().get(y).getAssessmentAnswers() != null)
				{
					for(int z = 0; z < data.getAnswerGroups().get(y).getAssessmentAnswers().size(); z++)
					{
						if(data.getAnswerGroups().get(y).getAssessmentAnswers().get(z) != null 
								&& data.getAnswerGroups().get(y).getAssessmentAnswers().get(z).equals(answer))
						{
							questionGroup = data.getAnswerGroups().get(y).getAssessmentQuestionGroup();
							break;
						}
					}
				}
				
				if(questionGroup != null)
					break;
			}
			
			addQuestionRow(question, questionGroup, getInstAnswer(data, questionGroup, question));
		}
	}
	
	private void populateGraphicQuestions(PatientAssessmentDataVo data) throws PresentationLogicException
	{
		if(data.getGraphicQuestion() == null)
			return;

		ims.assessment.vo.PatientGraphicAssessmentQuestionAnswerVoCollection voColl = null;
		for(int i = 0; i < data.getGraphicQuestion().size(); i++)
		{
			if(voColl == null)
				voColl = new ims.assessment.vo.PatientGraphicAssessmentQuestionAnswerVoCollection();
			voColl.add(data.getGraphicQuestion().get(i));
		}
		
		voColl = sortGraphicQuestionsByIndex(voColl);
		for(int i = 0; i < voColl.size(); i++)
		{
			addGraphicQuestionRow(voColl.get(i).getGraphicQuestion(), voColl.get(i), allowMutlipleAnswers(voColl.get(i).getGraphicQuestion()));
		}
	}
	private void populateGraphicFindingQuestions(PatientGraphicalAssessmentStageVo pgasVo) throws PresentationLogicException 
	{
		if(pgasVo == null)
			return;
		
		PatientGraphicAssessmentFindingQuestionAnswerVoCollection voColl = null;
		for(int i = 0; i < pgasVo.getFindingQuestion().size(); i++)
		{
			if(voColl == null)
				voColl = new PatientGraphicAssessmentFindingQuestionAnswerVoCollection();
			voColl.add(pgasVo.getFindingQuestion().get(i));
		}
		
		voColl = sortGraphicQuestionsByIndex(voColl);
		for (int i = 0; i < voColl.size(); i++)
		{
			addGraphicQuestionRow(voColl.get(i).getGraphicFindingQuestion(), voColl.get(i), allowMultipleAnswers(voColl.get(i).getGraphicFindingQuestion()));			
		}
	}
	private void populateGraphicFindingQuestions(PatientGraphicAssessmentFindingVo voGraphicAssessmentFinding) throws PresentationLogicException 
	{
		if(voGraphicAssessmentFinding.getStage() == null || voGraphicAssessmentFinding.getStage().size() == 0)
			return;
		
		PatientGraphicalAssessmentStageVo annotatedStage = null;
		
		if(voGraphicAssessmentFinding.getStage().size() == 1)
			annotatedStage = voGraphicAssessmentFinding.getStage().get(0);
		else
		{
			for (int i = 0; i < voGraphicAssessmentFinding.getStage().size(); i++)
			{
				if(voGraphicAssessmentFinding.getStage().get(i).getStageIsNotNull() 
						&& voGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStageIsNotNull() 
						&& voGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotatedIsNotNull()
						&& voGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotated().booleanValue())
				{
					annotatedStage = voGraphicAssessmentFinding.getStage().get(i);
					break;
				}
			}
		}
		
		if(annotatedStage == null)
			return;
		
		PatientGraphicAssessmentFindingQuestionAnswerVoCollection voColl = null;
		for(int i = 0; i < annotatedStage.getFindingQuestion().size(); i++)
		{
			if(voColl == null)
				voColl = new PatientGraphicAssessmentFindingQuestionAnswerVoCollection();
			if (isQuestionInvalidForPatient(annotatedStage.getFindingQuestion().get(i).getGraphicFindingQuestion().getQuestion()))
				continue;
			voColl.add(annotatedStage.getFindingQuestion().get(i));
		}
		
		voColl = sortGraphicQuestionsByIndex(voColl);
		for (int i = 0; i < voColl.size(); i++)
		{
			addGraphicQuestionRow(voColl.get(i).getGraphicFindingQuestion(), voColl.get(i), allowMultipleAnswers(voColl.get(i).getGraphicFindingQuestion()));			
		}
	}
	private boolean allowMutlipleAnswers(GraphicAssessmentQuestionVo graphicQuestion)
	{
		if(graphicQuestion != null)
		{
			return graphicQuestion.getAllowsMultipleAnswersIsNotNull() && graphicQuestion.getAllowsMultipleAnswers().booleanValue(); 
		}
		return false;
	}
	private boolean allowMultipleAnswers(GraphicAssessmentFindingQuestionVo graphicFindingQuestion)
	{
		if(graphicFindingQuestion != null)
		{
			return graphicFindingQuestion.getAllowsMultipleAnswersIsNotNull() && graphicFindingQuestion.getAllowsMultipleAnswers().booleanValue();
		}
		return false;
	}
	private void populateQuestionsFlat(UserAssessmentVo data) throws PresentationLogicException
	{
		if(data.getQuestionGroups() == null)
			return;
		
		AssessmentQuestionVoCollection questions = new AssessmentQuestionVoCollection();				
		for(int x = 0; x < data.getQuestionGroups().size(); x++)
		{				
			if(data.getQuestionGroups().get(x).getQuestionsIsNotNull() 
					&& data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
					&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
			{
				for(int y = 0; y < data.getQuestionGroups().get(x).getQuestions().size(); y++)
				{
					if(data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
							&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE) 
							&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatusIsNotNull() 
							&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
					{
						questions.add(data.getQuestionGroups().get(x).getQuestions().get(y));
					}
				}
			}
		}				
		
		questions = sortQuestionsBySequence(questions);
		
		for(int x = 0; x < questions.size(); x++)
		{
			AssessmentQuestionVo question = questions.get(x);
			AssessmentQuestionGroupVo questionGroup = null;
			
			for(int y = 0; y < data.getQuestionGroups().size(); y++)
			{				
				if(data.getQuestionGroups().get(y).getQuestionsIsNotNull())
				{
					for(int z = 0; z < data.getQuestionGroups().get(y).getQuestions().size(); z++)
					{
						if(data.getQuestionGroups().get(y).getQuestions().get(z).equals(question))
						{
							questionGroup = data.getQuestionGroups().get(y);
							break;
						}
					}
				}
				
				if(questionGroup != null)
					break;
			}
			
			addQuestionRow(question, questionGroup, null);
		}
	}	
	private PatientAssessmentQuestionVoCollection sortAnswersBySequence(PatientAssessmentQuestionVoCollection answersToBeSorted)
	{
		if(answersToBeSorted == null)
			return new PatientAssessmentQuestionVoCollection();
		
		int size = answersToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				PatientAssessmentQuestionVo source = answersToBeSorted.get(sorted[x]);
				PatientAssessmentQuestionVo compare = answersToBeSorted.get(sorted[y]);
					
				if(source.getSequenceIsNotNull() && compare.getSequenceIsNotNull())
				{
					if(source.getSequence().compareTo(compare.getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		PatientAssessmentQuestionVoCollection sortedAnswers = new PatientAssessmentQuestionVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedAnswers.add(answersToBeSorted.get(sorted[x]));
		}
		
		return sortedAnswers;
	}
	private AssessmentQuestionVoCollection sortQuestionsBySequence(AssessmentQuestionVoCollection questionsToBeSorted)
	{
		if(questionsToBeSorted == null)
			return new AssessmentQuestionVoCollection();
	
		int size = questionsToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				AssessmentQuestionVo source = questionsToBeSorted.get(sorted[x]);
				AssessmentQuestionVo compare = questionsToBeSorted.get(sorted[y]);
					
				if(source.getSequenceIsNotNull() && compare.getSequenceIsNotNull())
				{
					if(source.getSequence().compareTo(compare.getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		AssessmentQuestionVoCollection sortedQuestions = new AssessmentQuestionVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedQuestions.add(questionsToBeSorted.get(sorted[x]));
		}
		
		return sortedQuestions;
	}
	private PatientGraphicAssessmentQuestionAnswerVoCollection sortGraphicQuestionsByIndex(PatientGraphicAssessmentQuestionAnswerVoCollection questionsToBeSorted)
	{
		if(questionsToBeSorted == null)
			return new PatientGraphicAssessmentQuestionAnswerVoCollection();
	
		int size = questionsToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				PatientGraphicAssessmentQuestionAnswerVo source = questionsToBeSorted.get(sorted[x]);
				PatientGraphicAssessmentQuestionAnswerVo compare = questionsToBeSorted.get(sorted[y]);
					
				if(source.getGraphicQuestionIsNotNull() && compare.getGraphicQuestionIsNotNull())
				{
					if(source.getGraphicQuestion().getSequenceIsNotNull())
					if(source.getGraphicQuestion().getSequence().compareTo(compare.getGraphicQuestion().getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		PatientGraphicAssessmentQuestionAnswerVoCollection sortedQuestions = new PatientGraphicAssessmentQuestionAnswerVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedQuestions.add(questionsToBeSorted.get(sorted[x]));
		}
		
		return sortedQuestions;
	}
	
	private PatientGraphicAssessmentFindingQuestionAnswerVoCollection sortGraphicQuestionsByIndex(PatientGraphicAssessmentFindingQuestionAnswerVoCollection questionsToBeSorted)
	{
		if(questionsToBeSorted == null)
			return new PatientGraphicAssessmentFindingQuestionAnswerVoCollection();
	
		int size = questionsToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				PatientGraphicAssessmentFindingQuestionAnswerVo source = questionsToBeSorted.get(sorted[x]);
				PatientGraphicAssessmentFindingQuestionAnswerVo compare = questionsToBeSorted.get(sorted[y]);
					
				if(source.getGraphicFindingQuestionIsNotNull() && compare.getGraphicFindingQuestionIsNotNull())
				{
					if(source.getGraphicFindingQuestion().getSequenceIsNotNull())
					if(source.getGraphicFindingQuestion().getSequence().compareTo(compare.getGraphicFindingQuestion().getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		PatientGraphicAssessmentFindingQuestionAnswerVoCollection sortedQuestions = new PatientGraphicAssessmentFindingQuestionAnswerVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedQuestions.add(questionsToBeSorted.get(sorted[x]));
		}
		
		return sortedQuestions;
	}
	private DynamicGridColumn createImageColumnWhenFlat() 
	{
		DynamicGridColumn imageColumn = this.grid.getColumns().newColumn("", IMAGE_COLUMN);
		imageColumn.setWidth(26);
		return imageColumn;
	}	
	private DynamicGridRow addGroupRow(AssessmentQuestionGroupVo group) throws PresentationLogicException 
	{
		return addGroupRow(group, group.getQuestions(), null);
	}
	private DynamicGridRow addGroupRow(AssessmentQuestionGroupVo group, AssessmentQuestionVoCollection questions, PatientAssessmentDataVo data) throws PresentationLogicException
	{
		checkDataIntegrity(group);		
		
		DynamicGridColumn column = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridRow row = this.grid.getRows().newRow();		
		row.setBackColor(Color.Beige);
		row.setBold(true);
			row.setIdentifier(new GroupRowData(group, null));
		row.setExpanded(true);
		
		DynamicGridCell cell = row.getCells().newCell(column, DynamicCellType.WRAPTEXT);
		cell.setValue(group.getName());			
		cell.setReadOnly(true);	
		
		if(questions != null)
		{
			for(int x = 0; x < questions.size(); x++)
			{
				if(questions.get(x).getActiveStatusIsNotNull() 
						&& (data != null || questions.get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE)))
				{
					if(data == null)
						addQuestionRow(row, questions.get(x), group, null);
					else
						addQuestionRow(row, questions.get(x), group, getInstAnswer(data, group, questions.get(x)));
				}
			}
		}
		
		return row;
	}
	private void checkDataIntegrity(AssessmentQuestionGroupVo group) throws PresentationLogicException
	{
		if(group == null)			
			throw new PresentationLogicException("Invalid user assessment group");
		if(group.getName() == null)
			throw new PresentationLogicException("Invalid user assessment group name");
	}
	private DynamicGridRow findLastRowWithSameIdentifier(DynamicGridRowCollection rows, Object identifier)
	{
		if(rows == null || identifier == null)
			return null;
		
		DynamicGridRow lastRow = null;		
		for(int x = 0; x < rows.size(); x++)
		{
			if(identifier.equals(rows.get(x).getIdentifier()))
			{
				lastRow = rows.get(x);
			}
		}
		
		return lastRow;
	}
		
		private DynamicGridRow findFirstRowWithSameIdentifier(DynamicGridRowCollection rows, Object identifier)
		{
			if(rows == null || identifier == null)
				return null;
					
			for(int x = 0; x < rows.size(); x++)
			{
				if(identifier.equals(rows.get(x).getIdentifier()))
				{
					return rows.get(x);
				}
			}
			
			return null;
		}
	private DynamicGridRow duplicateQuestionRow(DynamicGridRow row)
	{
		if(row == null || row.getIdentifier() == null)
			return null;
		
		Object identifier = row.getIdentifier();
		AssessmentQuestionVo question = null;
		AssessmentQuestionGroupVo questionGroup = null;
		GraphicAssessmentFindingQuestionVo voGraphicFindingQuestion = null;
		GraphicAssessmentQuestionVo voGraphicQuestion = null;
		
		if(identifier instanceof AssessmentQuestionVo)			
			question = (AssessmentQuestionVo)identifier;
		if(identifier instanceof AssessmentQuestionGroupVo)
			questionGroup = (AssessmentQuestionGroupVo)identifier;
		
		if(identifier instanceof GraphicAssessmentFindingQuestionVo)
			voGraphicFindingQuestion = (GraphicAssessmentFindingQuestionVo)identifier;
		if(identifier instanceof GraphicAssessmentQuestionVo)
			voGraphicQuestion = (GraphicAssessmentQuestionVo)identifier;
		
		if(question == null && questionGroup == null && voGraphicFindingQuestion == null && voGraphicQuestion == null)
			return null;
		
		DynamicGridRow newRow;
		DynamicGridRow lastRow = findLastRowWithSameIdentifier(row.getParent() == null ? this.grid.getRows() : row.getParent().getRows(), identifier);
		if(lastRow == null)
			lastRow = row;
		
		if(row.getParent() != null)
			newRow = row.getParent().getRows().newRowAfter(lastRow);
		else
			newRow = this.grid.getRows().newRowAfter(lastRow);
		
		newRow.setIdentifier(identifier);				
				 
		DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
		if(imageColumn != null)
		{
			DynamicGridCell imageCell = newRow.getCells().newCell(imageColumn, DynamicCellType.IMAGE);
			imageCell.setValue(this.additionalAnswerImage);
		}
				
		newRow.setExpandedImage(this.additionalAnswerImage);
		newRow.setCollapsedImage(this.additionalAnswerImage);
		
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);
		
		DynamicGridCell questionCell = row.getCells().get(questionColumn);
		DynamicGridCell newQuestionCell = newRow.getCells().newCell(questionColumn, questionCell.getType());		
		newQuestionCell.setTooltip(questionCell.getTooltip());
		newQuestionCell.setTextColor(questionCell.getTextColor());
		newQuestionCell.setReadOnly(true);
		if(questionCell.getIdentifier() != null)
			newQuestionCell.setIdentifier(questionCell.getIdentifier());
		
		if(buttonColumn != null)
		{
			DynamicGridCell buttonCell = row.getCells().get(buttonColumn);
			if(buttonCell != null)
			{
				DynamicGridCell newButtonCell = newRow.getCells().newCell(buttonColumn, buttonCell.getType());			
				newButtonCell.setTooltip("Remove this answer");
				newButtonCell.setValue(this.buttonRemoveImage);
				newButtonCell.setIdentifier(BUTTON_REMOVE_ANSWER);
				buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
			}
		}		
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell answerCell = row.getCells().get(this.grid.getColumns().get(x));
			if(answerCell == null)
				continue;
			if(answerCell.getType().equals(DynamicCellType.DYNAMICLABEL))
			{
				DynamicGridCell newSeparatorCell = newRow.getCells().newCell(this.grid.getColumns().get(x), answerCell.getType());
				newSeparatorCell.setValue(answerCell.getValue());
				newSeparatorCell.setTextColor(answerCell.getTextColor());
				newSeparatorCell.setTooltip(answerCell.getTooltip());				
			}
				else if(answerCell.getIdentifier() != null && (answerCell.getIdentifier() instanceof QuestionAnswerTypeVo || answerCell.getIdentifier() instanceof AnswerCellData))
			{				
				DynamicGridCell newAnswerCell = newRow.getCells().newCell(this.grid.getColumns().get(x), answerCell.getType());
					
					if(answerCell.getIdentifier() instanceof AnswerCellData)
						newAnswerCell.setIdentifier(((AnswerCellData)answerCell.getIdentifier()).getConfigData());
					else
				newAnswerCell.setIdentifier(answerCell.getIdentifier());
				newAnswerCell.setWidth(answerCell.getWidth());
				newAnswerCell.setReadOnly(answerCell.isReadOnly());
				newAnswerCell.setDecoratorType(answerCell.getDecoratorType());
				newAnswerCell.setMaxCheckedItemsForMultiSelect(answerCell.getMaxCheckedItemsForMultiSelect());
				newAnswerCell.setMaxVisibleItemsForMultiSelect(answerCell.getMaxVisibleItemsForMultiSelect());
				newAnswerCell.setTextColor(answerCell.getTextColor());
				newAnswerCell.setTooltip(answerCell.getTooltip());
				
				if(answerCell.getType().isSupportingItems())
				{
					for(int y = 0; y < answerCell.getItems().size(); y++)
					{					
						DynamicGridCellItem item = answerCell.getItems().get(y);
						DynamicGridCellItem newItem = newAnswerCell.getItems().newItem(item.getValue(), item.getImage(), item.getTextColor(), false);
						newItem.setMarkerColor(item.getMarkerColor());
						if(item.getIdentifier() != null)
							newItem.setIdentifier(item.getIdentifier());
					}
				}
			}
		}
		
		return newRow;
	}
	private void addQuestionRow(AssessmentQuestionVo question, AssessmentQuestionGroupVo questionGroup, PatientAssessmentQuestionVo instAnswer) throws PresentationLogicException
	{
		addQuestionRow(null, question, questionGroup, instAnswer);
	}

	private void addQuestionRow(DynamicGridRow groupRow, AssessmentQuestionVo question, AssessmentQuestionGroupVo questionGroup, PatientAssessmentQuestionVo instAnswer) throws PresentationLogicException 
	{
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);

		checkDataIntegrity(question);
				
		DynamicGridRow row;
		
		Image rowQuestionImage = this.questionImage;
		if(question.getIsMandatoryIsNotNull() && question.getIsMandatory().booleanValue())
			rowQuestionImage = this.mandatoryQuestionImage;
		
		if(groupRow != null)
			row = groupRow.getRows().newRow();
		else
		{			
			row = this.grid.getRows().newRow();
			
			DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
			if(imageColumn != null)
			{
				row.getCells().newCell(imageColumn, DynamicCellType.IMAGE).setValue(rowQuestionImage);				
			}
		}
		
		row.setIdentifier(question);
		row.setExpandedImage(rowQuestionImage);
		row.setCollapsedImage(rowQuestionImage);
		
		if(isDPP == false)
		{
			if(buttonColumn != null 
					&& ((instAnswer == null && question != null && question.getAllowsMultipleAnswersIsNotNull() && question.getAllowsMultipleAnswers().booleanValue())
					|| (instAnswer != null && instAnswer.getAllowsMultipleAnswersIsNotNull() && instAnswer.getAllowsMultipleAnswers().booleanValue())))
			{
				DynamicGridCell buttonCell = row.getCells().newCell(buttonColumn, DynamicCellType.IMAGEBUTTON);			
				buttonCell.setTooltip("Create new answer for this question");
				buttonCell.setValue(this.buttonAddImage);
				buttonCell.setIdentifier(BUTTON_ADD_ANSWER);			
				buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
			}
		}

		DynamicGridCell questionCell = row.getCells().newCell(questionColumn, DynamicCellType.WRAPTEXT);		
		questionCell.setValue(question.getQuestion().getShortText());
		questionCell.setTooltip(question.getQuestion().getText());			
		questionCell.setReadOnly(true);	
		
		if(isFlatView())
			questionCell.setIdentifier(questionGroup);
		
		if(question.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < question.getQuestion().getAnswerTypes().size(); x++)
			{
				if(question.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
						&& question.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					boolean readOnlyCell = false;
					//Set readonly the cell when not applicable
					if(isDPP && showSelect/*(isAnswerStatus(instAnswer, AnswerStatus.NOTAPPLICABLE) || isAnswerStatus(instAnswer, AnswerStatus.NOTANSWERED))*/)
						readOnlyCell = true;
					addAnswerCell(row, getAnswerColumn(x), question.getQuestion().getAnswerTypes().get(x), getInstAnswerType(instAnswer, question.getQuestion().getAnswerTypes().get(x)), readOnlyCell);														
				}
			}
		}
		
		if(isDPP)
		{
			if(showSelect/*isAnswerStatus(instAnswer, AnswerStatus.NOTAPPLICABLE) || isAnswerStatus(instAnswer, AnswerStatus.NOTANSWERED)*/)
			{
				DynamicGridColumn confirmedColum 	 = getDppColumn(SELECT_NA_COLUMN);
				if(confirmedColum != null)
				{
					DynamicGridCell cell = row.getCells().newCell(confirmedColum, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);	
				}
			}
			else
			{
				DynamicGridColumn confirmedColum 	 = showConfirmation?getDppColumn(CONFIRM_COLUMN):null; 
				DynamicGridColumn notApplicableColum = getDppColumn(NOTAPPLICABLE_COLUMN);
				DynamicGridColumn pocColumn 		 = getDppColumn(POC_COLUMN);
				
				if(confirmedColum != null)
				{
					DynamicGridCell cell = row.getCells().newCell(confirmedColum, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);
				}
				
				if(notApplicableColum != null)
				{
					DynamicGridCell cell = row.getCells().newCell(notApplicableColum, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);
				}
				
				if(pocColumn != null)
				{
					DynamicGridCell cell = row.getCells().newCell(pocColumn, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);
				}
			}
		}
	}
 
	private boolean isAnswerStatus(PatientAssessmentQuestionVo instAnswer, AnswerStatus answerStatus)
	{
		if(answerStatus == null)
			return true;
		
		if(instAnswer != null && instAnswer.getIsAnsweredIsNotNull() && instAnswer.getIsAnswered().equals(answerStatus))
			return true;
			
		return false;
	}
	
	private void addGraphicQuestionLegend(String legendText)
	{
		if (legendText == null)
			return;
		//Get the question column
		DynamicGridColumn qColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		qColumn.setDynamicWidthSupported(true);
		//Create the new row
		DynamicGridRow newRow = this.grid.getRows().newRow();
		newRow.setIdentifier(NON_DATA_ROW);
		
		//Create the cell in column Question
		DynamicGridCell newCell = newRow.getCells().newCell(qColumn,DynamicCellType.HTMLVIEW);
		newCell.setWidth(DEFAULT_LEGEND_CELL_WIDTH);
		newCell.setValue(legendText);
		
	}
	
	private void addGraphicQuestionRow(GraphicAssessmentQuestionVo question, PatientGraphicAssessmentQuestionAnswerVo voPatientGraphicAssessmentQuestionAnswer, boolean allowMultipleQuestion) throws PresentationLogicException 
	{
		checkDataIntegrity(question);
		
		addGraphicQuestionLegend(question.getQuestion().getLegendText());
		
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);

		DynamicGridRow row = this.grid.getRows().newRow();
		
		Image rowQuestionImage = this.questionImage;
		if(question.getIsMandatoryIsNotNull() && question.getIsMandatory().booleanValue())
			rowQuestionImage = this.mandatoryQuestionImage;
		
		DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
		if(imageColumn != null)
		{
			row.getCells().newCell(imageColumn, DynamicCellType.IMAGE).setValue(rowQuestionImage);				
		}
		
		row.setIdentifier(question);
		row.setExpandedImage(rowQuestionImage);
		row.setCollapsedImage(rowQuestionImage);
		
		if(buttonColumn != null && allowMultipleQuestion)
		{
			DynamicGridCell buttonCell = row.getCells().newCell(buttonColumn, DynamicCellType.IMAGEBUTTON);			
			buttonCell.setTooltip("Create new answer for this question");
			buttonCell.setValue(this.buttonAddImage);
			buttonCell.setIdentifier(BUTTON_ADD_ANSWER);			
			buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
		}

		DynamicGridCell questionCell = row.getCells().newCell(questionColumn, DynamicCellType.WRAPTEXT);		
		questionCell.setValue(question.getQuestion().getShortText());
		questionCell.setTooltip(question.getQuestion().getText());			
		questionCell.setReadOnly(true);	
		
		questionCell.setIdentifier(voPatientGraphicAssessmentQuestionAnswer);
		
		if(question.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < question.getQuestion().getAnswerTypes().size(); x++)
			{
				if(question.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
						&& question.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					addAnswerCell(row, getAnswerColumn(x), question.getQuestion().getAnswerTypes().get(x), getInstAnswerType(voPatientGraphicAssessmentQuestionAnswer.getPatientAnswers(), question.getQuestion().getAnswerTypes().get(x)));
				}
			}
		}
	}	

	private void addGraphicQuestionRow(GraphicAssessmentFindingQuestionVo question, PatientGraphicAssessmentFindingQuestionAnswerVo voPatientGraphicAssessmentFindingQuestionAnswer, boolean allowMultipleQuestion)  throws PresentationLogicException
	{
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);
	
		checkDataIntegrity(question);
		
		addGraphicQuestionLegend(question.getQuestion().getLegendText());
		
		DynamicGridRow row = this.grid.getRows().newRow();
		
		Image rowQuestionImage = this.questionImage;
		if(question.getIsMandatoryIsNotNull() && question.getIsMandatory().booleanValue())
			rowQuestionImage = this.mandatoryQuestionImage;
		
		DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
		if(imageColumn != null)
		{
			row.getCells().newCell(imageColumn, DynamicCellType.IMAGE).setValue(rowQuestionImage);				
		}
		
		row.setIdentifier(question);
		row.setExpandedImage(rowQuestionImage);
		row.setCollapsedImage(rowQuestionImage);
		
		if(buttonColumn != null && allowMultipleQuestion)
		{
			DynamicGridCell buttonCell = row.getCells().newCell(buttonColumn, DynamicCellType.IMAGEBUTTON);			
			buttonCell.setTooltip("Create new answer for this question");
			buttonCell.setValue(this.buttonAddImage);
			buttonCell.setIdentifier(BUTTON_ADD_ANSWER);			
			buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
		}

		DynamicGridCell questionCell = row.getCells().newCell(questionColumn, DynamicCellType.WRAPTEXT);		
		questionCell.setValue(question.getQuestion().getShortText());
		questionCell.setTooltip(question.getQuestion().getText());			
		questionCell.setReadOnly(true);	
		
		questionCell.setIdentifier(voPatientGraphicAssessmentFindingQuestionAnswer);
		
		if(question.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < question.getQuestion().getAnswerTypes().size(); x++)
			{
				if(question.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
					&& question.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					addAnswerCell(row, getAnswerColumn(x), question.getQuestion().getAnswerTypes().get(x), getInstAnswerType(voPatientGraphicAssessmentFindingQuestionAnswer.getPatientAnswers(), question.getQuestion().getAnswerTypes().get(x)));
				}
			}
		}
	}

	private AnswerDetailsVo getInstAnswerType(PatientAssessmentQuestionVo instQuestion, QuestionAnswerTypeVo configAnswerType)
	{
		if(instQuestion == null || instQuestion.getPatientAnswers() == null || instQuestion.getPatientAnswers().size() == 0 || configAnswerType == null)
			return null;
		
		for(int x = 0; x < instQuestion.getPatientAnswers().size(); x++)
		{
			PatientAssessmentAnswerVo answer = instQuestion.getPatientAnswers().get(x);		
			if(answer != null && answer.getAnswerDetails() != null)
			{
				for(int y = 0; y < answer.getAnswerDetails().size(); y++)
				{
					if(answer.getAnswerDetails().get(y).getAnswerTypeIsNotNull() && answer.getAnswerDetails().get(y).getAnswerType().equals(configAnswerType))
					{
						return answer.getAnswerDetails().get(y);
					}
				}
			}		
		}
		
		return null;
	}
	
	//Gets and Instance of the AnswerDetailsVo based on a QuestionAnswerTypeVo
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
	
	private DynamicGridCell addAnswerCell(DynamicGridRow row, DynamicGridColumn column, QuestionAnswerTypeVo configAnswer, AnswerDetailsVo instAnswer) throws PresentationLogicException
	{
		return addAnswerCell(row, column, configAnswer, instAnswer, false);
	}
	
	private DynamicGridCell addAnswerCell(DynamicGridRow row, DynamicGridColumn column, QuestionAnswerTypeVo configAnswer, AnswerDetailsVo instAnswer, boolean readOnly) throws PresentationLogicException 
	{
		checkDataIntegrity(configAnswer);
	
		DynamicCellType cellAnswerType = getCellAnswerType(configAnswer.getAnswerType());
		DynamicGridCell cell = row.getCells().newCell(column, cellAnswerType);
		
		cell.setWidth(getCellAnswerWidth(configAnswer, instAnswer));
		cell.setDecoratorType(DynamicCellDecoratorMode.ALWAYS);
		cell.setIdentifier(configAnswer);
		cell.setReadOnly(readOnly);
		setAnswerCellValue(cell, configAnswer, instAnswer);				
		setCellTooltip(cell, configAnswer);
		if(isDPP && cellAnswerType != null && cellAnswerType.equals(DynamicCellType.MULTISELECT))
		{
			cell.setAutoPostBack(true);
		}
		
		return cell;
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
			setAnswerCellOptions(configAnswer, cell, instAnswer);
			
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
	
	private void setAnswerCellOptions(QuestionAnswerTypeVo answer, DynamicGridCell cell)
	{
		setAnswerCellOptions(answer, cell, null);
	}
	private void setAnswerCellOptions(QuestionAnswerTypeVo answer, DynamicGridCell cell, AnswerDetailsVo instAnswer) 
	{
		cell.getItems().clear();
	 	// WDEV-3617
		cell.setAutoWrapForMultiSelect(true);
		int maxVisibleItems = 0;
		if(answer.getOptionsIsNotNull())
		{
			for(int x = 0; x < answer.getOptions().size(); x++)
			{
				AnswerOptionVo answerItem = answer.getOptions().get(x);									
				if(answerItem != null)
				{
					//WDEV-1631 - When Viewing an Instantiated Assessment i simply want to see all the question and answered given, in edit mode i want to see all the questions and answer options. 
					if(displayAnsweredOnly && isNotAnswered(answerItem, instAnswer))
						continue;
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
		
		cell.setMaxVisibleItemsForMultiSelect(0);
		
		// This line is no longer needed, the answer is going to be wrapped.
		// MM - WDEV-3617
		//cell.setMaxVisibleItemsForMultiSelect(maxVisibleItems == 0 ? 1 : maxVisibleItems + 1);
	}
	private boolean isNotAnswered(AnswerOptionVo answerItem, AnswerDetailsVo instAnswer)
	{
		if(answerItem == null || instAnswer == null)
			return false;

		return instAnswer.getMultiSelectAnswers().indexOf(answerItem) < 0;
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
			if(isDPP)
				defaultMultiSelect = DEFAULT_MULTISELECT_ANSWER_CELL_WIDTH + 190;
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
	private DynamicGridColumn getAnswerColumn(int answerIndex)
	{
		DynamicGridColumn column = this.grid.getColumns().getByIdentifier(new Integer(answerIndex));
		if(column == null)
			column = createAnswerColumn(answerIndex);
		
		return column;
	}
	private DynamicGridColumn createAnswerColumn(int answerIndex) 
	{
		DynamicGridColumn column = this.grid.getColumns().newColumn("");
		column.setDynamicWidthSupported(isDPP?false:true);
		column.setIdentifier(new Integer(answerIndex));
		column.setWidth(isDPP?DEFAULT_MULTISELECT_ANSWER_CELL_WIDTH + 190 : 100);				
		return column;
	}
	
	private DynamicGridColumn getDppColumn(Integer identifier)
	{
		if(identifier == null)
			return null;
		
		DynamicGridColumn column = this.grid.getColumns().getByIdentifier(identifier);
		if(column == null)
		{
			if(identifier.equals(NOTAPPLICABLE_COLUMN))
			{
				return createColumn("N/A", NOTAPPLICABLE_COLUMN);
			}
			if(identifier.equals(CONFIRM_COLUMN))
			{
				return createColumn("Confirm", CONFIRM_COLUMN);
			}
			if(identifier.equals(POC_COLUMN))
			{
				return createColumn("P.O.C.", POC_COLUMN);
			}
			
			if(identifier.equals(SELECT_NA_COLUMN))
			{
				return createColumn("Select", SELECT_NA_COLUMN);
			}
		}
		
		return column;
	}
	
	private DynamicGridColumn createColumn(String text, Integer identifier)
	{
		DynamicGridColumn column = this.grid.getColumns().newColumn(text, identifier);
		column.setDynamicWidthSupported(false);
		column.setCanGrow(false);
		column.setWidth(50);
		column.setAlignment(Alignment.CENTER);
		column.setHeaderAlignment(Alignment.CENTER);
		return column;
	}
	
	private boolean isFlatView()
	{
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			if(this.grid.getRows().get(x).getRows().size() > 0)
				return false;
		}
		
		return true;
	}
	private void checkDataIntegrity(DynamicGrid grid)
	{
		if(grid == null)
			throw new CodingRuntimeException("Invalid user assessment context grid");
	}
	private void checkDataIntegrity(UserAssessmentVo data) throws PresentationLogicException
	{
		if(data == null)
			throw new PresentationLogicException("Invalid user assessment");
		if(data.getIsFlatView() == null)
			throw new PresentationLogicException("Invalid user assessment view type");
		if(data.getIsMultipleGroup() == null)
			throw new PresentationLogicException("Invalid user assessment data");
	}	
	
	private void checkDataIntegrity(PatientGraphicAssessmentFindingVo voGraphicAssessmentFinding)  throws PresentationLogicException
	{
		if(voGraphicAssessmentFinding == null)
			throw new PresentationLogicException("Invalid patient graphic assessment finding data");
	
		if(voGraphicAssessmentFinding.getStage() == null || voGraphicAssessmentFinding.getStage().size() == 0 || voGraphicAssessmentFinding.getStage().get(0).getFindingQuestion() == null)
			throw new PresentationLogicException("Invalid patient graphic assessment finding question data");
	}
	
	private void checkDataIntegrity(GraphicAssessmentFindingQuestionVo voGraphicAssessmentFinding) throws PresentationLogicException
	{
		if(voGraphicAssessmentFinding == null)
			throw new PresentationLogicException("Invalid graphic assessment finding question data");
		
		if(voGraphicAssessmentFinding.getQuestion() == null)
			throw new PresentationLogicException("Invalid graphic assessment finding question");
	}
	
	private void checkDataIntegrity(GraphicAssessmentQuestionVo voGraphicAssessmentQuestion) throws PresentationLogicException
	{
		if(voGraphicAssessmentQuestion == null)
			throw new PresentationLogicException("Invalid graphic assessment question data");
		
		if(voGraphicAssessmentQuestion.getQuestion() == null)
			throw new PresentationLogicException("Invalid graphic assessment question");
	}
	
	private void checkDataIntegrity(PatientAssessmentDataVo data) throws PresentationLogicException
	{
		if(data == null)
			throw new PresentationLogicException("Invalid user assessment data");
		
		if(isGraphicAssessmentData(data))
		{
			// if(data.getGraphicQuestion() == null)
			//	 throw new PresentationLogicException("Invalid graphic associated question data");
			if(data.getGraphic() == null)
				throw new PresentationLogicException("Invalid graphic assessment component data");
		}
		else
		{
			if(data.getAnswerGroups() == null)
				throw new PresentationLogicException("Invalid user assessment groups data");
			if(data.getUserAssessment() == null)
				throw new PresentationLogicException("Invalid user assessment component data");
			if(data.getUserAssessment().getIsFlatView() == null)
				throw new PresentationLogicException("Invalid user assessment view type");
			if(data.getUserAssessment().getIsMultipleGroup() == null)
				throw new PresentationLogicException("Invalid user assessment multi group attribute");
		}
	}
	private void checkDataIntegrity(AssessmentQuestionVo question) throws PresentationLogicException
	{
		if(question == null)
			throw new PresentationLogicException("Invalid user assessment question");
		if(question.getQuestion() == null)
			throw new PresentationLogicException("Invalid user assessment question");
		if(question.getQuestion().getText() == null)
			throw new PresentationLogicException("Invalid user assessment question text");
		if(question.getQuestion().getShortText() == null)
			throw new PresentationLogicException("Invalid user assessment question short text");
	}
	private void checkDataIntegrity(QuestionAnswerTypeVo answer) throws PresentationLogicException
	{
		if(answer == null)
			throw new PresentationLogicException("Invalid user assessment question answer");
		if(answer.getAnswerType() == null)
			throw new PresentationLogicException("Invalid user assessment question answer type");
	}
	private void checkDataIntegrity(DynamicGridRow row)
	{
		if(row == null)
			throw new CodingRuntimeException("Invalid user assessment answer row to duplicate");		
	}
	
	//Checks if the POC checkbox has been checked
	public boolean isPocSelected(AssessmentQuestionRefVo voAssessmQuestion)
	{
		for (int i = 0; i < grid.getRows().size(); i++)
		{
			DynamicGridRow row = grid.getRows().get(i);
			
			if(row.getIdentifier() instanceof AssessmentQuestionVo && row.getIdentifier().equals(voAssessmQuestion))
			{
				DynamicGridColumn column = this.grid.getColumns().getByIdentifier(POC_COLUMN);
				if(column != null)
				{
					DynamicGridCell cell = row.getCells().get(column);
					if(cell.getValue() instanceof Boolean)
						return ((Boolean)cell.getValue()).booleanValue();
				}
			}
		}
		
		return false;
	}
	public DPPErrors setDPPCellValueChanged(DynamicGridCell cell)
	{
		if(isDPP && cell != null)
		{
			DynamicGridColumn confirmColumn = this.grid.getColumns().getByIdentifier(CONFIRM_COLUMN);
			DynamicGridColumn notApplicableColumn = this.grid.getColumns().getByIdentifier(NOTAPPLICABLE_COLUMN);
			DynamicGridColumn pocColumn     = this.grid.getColumns().getByIdentifier(POC_COLUMN);
						
			if(cell.getColumn().equals(notApplicableColumn))
			{
				if(cell.getValue() instanceof Boolean)
				{
					Boolean value = (Boolean) cell.getValue();
					if(value == null)
						return null;
					if(value.booleanValue())
					{
						if(isAtLeastOneAnswerAdded(cell.getRow()))
						{
							cell.setValue(Boolean.FALSE);
							return DPPErrors.NAERROR;
						}
					}
			
					//Set the readonly the rest of the cell, except NOTAPPLICABLE_COLUMN
					DynamicGridCell answerCell = getDppAnswerCell(cell.getRow());
					if(answerCell != null)
						answerCell.setReadOnly(value.booleanValue());
				
					if(confirmColumn != null)
					{
						DynamicGridCell confirmCell = cell.getRow().getCells().get(confirmColumn);
						if(confirmCell != null)
						{
							confirmCell.setValue(Boolean.FALSE);
							confirmCell.setReadOnly(value.booleanValue());
						}
					}
					
					if(pocColumn != null)
					{
						DynamicGridCell pocCell = cell.getRow().getCells().get(pocColumn);
						if(pocCell != null)
						{
							pocCell.setValue(Boolean.FALSE);
							pocCell.setReadOnly(value.booleanValue());
						}
					}
				}
			}
			
			//return true when we have a 
			//Make Readonly the NA column if either POC or Confirm are checked
			if (cell.getColumn().equals(pocColumn) || cell.getColumn().equals(confirmColumn))
			{
				if (cell.getValue() instanceof Boolean)
				{
					Boolean value = (Boolean) cell.getValue();
					if (value.booleanValue())
					{
						if(isAtLeastOneAnswerAdded(cell.getRow()) == false)
						{
							cell.setValue(Boolean.FALSE);
							return DPPErrors.CONFIRMERROR;
						}

						makeReaOnlyNACell(cell.getRow(), true);
					}
					else
					{
						boolean isPocChecked = false;
						boolean isConfirmedChecked = false;
						if (pocColumn != null)
						{
							DynamicGridCell pocCell = cell.getRow().getCells().get(pocColumn);
							if(pocCell != null)
							{
								Boolean pocValue = (Boolean) pocCell.getValue();
								isPocChecked = pocValue != null && pocValue.booleanValue();
							}
							else
							{
								isPocChecked = true;
							}
						}
						if (confirmColumn != null)
						{
							DynamicGridCell confirmedCell = cell.getRow().getCells().get(confirmColumn);
							if(confirmedCell != null)
							{
								Boolean confirmValue = (Boolean) confirmedCell.getValue();
								isConfirmedChecked = confirmValue != null && confirmValue.booleanValue();
							}
							else
							{
								isConfirmedChecked = true;
							}
						}
						
						makeReaOnlyNACell(cell.getRow(), isPocChecked || isConfirmedChecked);
					}
				}
			}
			
			//If select an Answer then automatically check the Confirm column
			//Check to see if the Answer Column
			if(confirmColumn != null && cell.equals(getDppAnswerCell(cell.getRow())))
			{
				DynamicGridCell confirmCell = cell.getRow().getCells().get(confirmColumn);
				if(confirmCell != null)
				if(isAtLeastOneAnswerAdded(cell.getRow()))
				{
					confirmCell.setValue(Boolean.TRUE);
				}
				else
				{
					//WDEV-2243 - isConfimedReadOnly means confirmation is saved, so it cannot be deselected 
					if(isConfimedReadOnly(confirmCell) == false)
						confirmCell.setValue(Boolean.FALSE);
				}
			}
			
			//WDEV-2210 
			if(pocColumn != null && cell.equals(getDppAnswerCell(cell.getRow())))
			{
				DynamicGridCell pocCell = cell.getRow().getCells().get(pocColumn);
				if(pocCell != null && pocCell.getValue() instanceof Boolean)
				{
					if(isYellowOrRedColourCellsSelected(cell.getRow()))
					{
						if(((Boolean)pocCell.getValue()).booleanValue() == false)
							pocCell.setValue(Boolean.TRUE);
					}
					else
					{
						//WDEV-2243 - isPocReadOnly means POC is saved, so it cannot be deselected
						if(isPocReadOnly(pocCell) == false)
							pocCell.setValue(Boolean.FALSE);
					}
				}
			}
		}
		
		return null;
	}	
	
	private boolean isConfimedReadOnly(DynamicGridCell confirmCell)
	{
		if (confirmCell != null)
			return confirmCell.isReadOnly();
		return false;
	}

	private boolean isPocReadOnly(DynamicGridCell pocCell)
	{
		if (pocCell != null)
			return pocCell.isReadOnly();
		return false;
	}
	
	private boolean isAtLeastOneAnswerAdded(DynamicGridRow row)
	{
		DynamicGridCell answerCell = getDppAnswerCell(row);
		if (answerCell != null)
		{
			AnswerDetailsVo answerDetail = getCellAnswer(answerCell);
			if (answerDetail != null && answerDetail.getMultiSelectAnswers() != null && answerDetail.getMultiSelectAnswers().size() > 0)
			{
				return true;
			}
		}
		
		return false;
	}
	
	private boolean isYellowOrRedColourCellsSelected(DynamicGridRow row)
	{
		DynamicGridCell answerCell = getDppAnswerCell(row);
		if (answerCell != null)
		{
			AnswerDetailsVo answerDetail = getCellAnswer(answerCell);
			if (answerDetail != null && answerDetail.getMultiSelectAnswers() != null)
			{
				for (int i = 0; i < answerDetail.getMultiSelectAnswers().size(); i++)
				{
					AnswerOptionVo voAnswerOption = answerDetail.getMultiSelectAnswers().get(i);
					//WDEV-3916
					Float score = voAnswerOption.getScore();
					if (score != null && (score.intValue() == getYellowScore() || score.intValue() == getRedScore()))
						return true;
				}
			}
		}

		return false;
	}
	
	private void makeReaOnlyNACell(DynamicGridRow row, boolean value)
	{
		if(row != null)
		{
			DynamicGridColumn naColumn = this.grid.getColumns().getByIdentifier(NOTAPPLICABLE_COLUMN);
			if(naColumn != null)
			{
				DynamicGridCell naCell = row.getCells().get(naColumn);
				if(naCell != null)
				{
					naCell.setReadOnly(value);
				}
			}
		}
	}
	private DynamicGridCell getDppAnswerCell(DynamicGridRow row)
	{
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = row.getCells().get(this.grid.getColumns().get(x));
			
			if(cell != null && !cell.getType().equals(DynamicCellType.DYNAMICLABEL) && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof QuestionAnswerTypeVo || cell.getIdentifier() instanceof AnswerCellData))
			{										
				return cell;					
			}			
		}
		
		return null;
	}
	
	private int getYellowScore()
	{
		return getScoreNumber(DPPScore.YELLOW_SCORE.getText());
	}

	private int getRedScore()
	{
		return getScoreNumber(DPPScore.RED_SCORE.getText());
	}

	private int getScoreNumber(String scoreText)
	{
		int defaultValue = 0;
		if (scoreText != null)
		{
			if (scoreText.equals(DPPScore.YELLOW_SCORE.getText()))
				defaultValue = 1;

			if (scoreText.equals(DPPScore.RED_SCORE))
				defaultValue = 2;
		}

		try
		{
			Integer val = Integer.valueOf(scoreText);

			if (val != null)
				return val.intValue();
		}
		catch (NumberFormatException e)
		{
			return defaultValue;
		}

		return defaultValue;
	}
	
	//WDEV-12215 - starts here
	
	public static String getGraphicAssessmentFindingTooltip(Patient_GraphicAssessmentFindingVo voPatientGraphicAssessmentFinding)
	{
		StringBuffer tooltip = new StringBuffer();
		String boldStart = "<B>";
		String boldEnd   = "</B>";
		String newLine 	 = "<BR>";
		if (voPatientGraphicAssessmentFinding.getAuthoringInformationIsNotNull())
		{
			AuthoringInformationVo voAuthoringInformation = voPatientGraphicAssessmentFinding.getAuthoringInformation();
			if (voAuthoringInformation.getAuthoringHcpIsNotNull())
			{
				tooltip.append(boldStart);
				tooltip.append("Authoring HCP: ");
				tooltip.append(boldEnd);
				tooltip.append(voAuthoringInformation.getAuthoringHcp().toString());
				tooltip.append(newLine);
			}

			if (voAuthoringInformation.getAuthoringDateTimeIsNotNull())
			{
				tooltip.append(boldStart);
				tooltip.append("Authoring Date/Time: ");
				tooltip.append(boldEnd);
				tooltip.append(voAuthoringInformation.getAuthoringDateTime().toString());
				tooltip.append(newLine);
			}
		}

		if (voPatientGraphicAssessmentFinding.getAreaNameIsNotNull())
		{
			tooltip.append(boldStart);
			tooltip.append("Area: ");
			tooltip.append(boldEnd);
			tooltip.append(voPatientGraphicAssessmentFinding.getAreaName());
			tooltip.append(newLine);
		}

		if (voPatientGraphicAssessmentFinding.getAreaDetailsIsNotNull())
		{
			tooltip.append(boldStart);
			tooltip.append("Details: ");
			tooltip.append(boldEnd);
			tooltip.append(voPatientGraphicAssessmentFinding.getAreaDetails());
			tooltip.append(newLine);
		}

		tooltip.append("<TABLE BORDER=1 CELLSPACING=0 CELLPADDING=1 BGCOLOR=#D4D0C8 width='300'>");
		// Grid Header
		tooltip.append("<TR>");
		tooltip.append("<TD WIDTH=99 ALIGN='CENTER'>");
		tooltip.append("<span style='font-family: Tahoma; font-size: 8pt; font-weight: 700'>Question</span></TD>");
		tooltip.append("<TD WIDTH=169 ALIGN='CENTER'>");
		tooltip.append("<span style='font-family: Tahoma; font-size: 8pt; font-weight: 700'>Answers</span></TD>");
		tooltip.append("</TR>");

		// Get the Finding Questions in tooltip
		if(voPatientGraphicAssessmentFinding.getStageIsNotNull())
		{
			Patient_GraphicalAssessmentStageVo annotatedStage = null;
			
			if(voPatientGraphicAssessmentFinding.getStage().size() == 1)
				annotatedStage = voPatientGraphicAssessmentFinding.getStage().get(0);
			else
			{
				for (int i = 0; i < voPatientGraphicAssessmentFinding.getStage().size(); i++)
				{
					if(voPatientGraphicAssessmentFinding.getStage().get(i).getStageIsNotNull() 
							&& voPatientGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStageIsNotNull() 
							&& voPatientGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotatedIsNotNull()
							&& voPatientGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotated().booleanValue())
					{
						annotatedStage = voPatientGraphicAssessmentFinding.getStage().get(i);
						break;
					}
				}
			}
			if(annotatedStage != null && annotatedStage.getFindingQuestionIsNotNull())
			{
				for (int i = 0; i < annotatedStage.getFindingQuestion().size(); i++)
				{
					Patient_GraphicAssessmentFindingQuestionAnswerVo voFindingQ = annotatedStage.getFindingQuestion().get(i);
					// Add only the answered ones
					if (voFindingQ.getIsAnsweredIsNotNull() && voFindingQ.getIsAnswered().booleanValue())
					{
						if (voFindingQ.getGraphicFindingQuestionIsNotNull() && voFindingQ.getGraphicFindingQuestion().getQuestionIsNotNull())
						{
							tooltip.append("<TR>");
							String question = voFindingQ.getGraphicFindingQuestion().getQuestion().getShortText();
							addQuestionCell(tooltip, question);
		
							for (int j = 0; j < voFindingQ.getPatientAnswers().size(); j++)
							{
								if (j > 0)
								{
									// Add dummy Question cell
									tooltip.append("<TR>");
									addQuestionCell(tooltip, "&nbsp");
								}
		
								Answer_DetailsVoCollection answerColl = voFindingQ.getPatientAnswers().get(j).getAnswerDetails();
								if (answerColl != null)
								{
									for (int j1 = 0; j1 < answerColl.size(); j1++)
									{
										Answer_DetailsVo ans = answerColl.get(j1);
										String answers = getAnswerDetail(ans);
										addAnswerTableCell(tooltip, answers);
									}
								}
								if (j > 0)
								{
									tooltip.append("</TR>");
								}
							}
		
							if (voFindingQ.getPatientAnswers().size() == 0)
							{
								// Add dummy answer cell
								addAnswerTableCell(tooltip, "&nbsp");
								tooltip.append("</TR>");
							}
						}
					}
				}
			}
		}

		tooltip.append("</TABLE>");
		return tooltip.toString();// new ims.utils.textile.Textile().process(
	}
	
	public static String getAnswerDetail(Answer_DetailsVo ans)
	{
		StringBuffer tooltip = new StringBuffer();
		Question_AnswerTypeVo ansType = ans.getAnswerType();
		if (ansType == null || ansType.getAnswerType() == null)
			return "";
		if (ansType.getAnswerType().equals(QuestionAnswerType.DATE))
			tooltip.append(ans.getDateAnswerIsNotNull() ? ans.getDateAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.DECIMAL))
			tooltip.append(ans.getDecimalAnswerIsNotNull() ? ans.getDecimalAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.INTEGER))
			tooltip.append(ans.getIntegerAnswerIsNotNull() ? ans.getIntegerAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.MULTISELECT))
		{
			int size = ans.getMultiSelectAnswers().size();
			for (int k = 0; k < size; k++)
			{
				Answer_OptionVo multi = ans.getMultiSelectAnswers().get(k);
				//Ensure you don't add unnecessary <BR>
				if(!(k == 0 && tooltip.lastIndexOf("<BR>") == tooltip.length()-1))
					tooltip.append("<BR>");
				tooltip.append(multi.getOptionTextIsNotNull() ? multi.getOptionText() : "");
			}
		}
		else if(ansType.getAnswerType().equals(QuestionAnswerType.SEPARATOR) && ans.getAnswerType().getSeparatorTextIsNotNull())
		{
			//sb.append("<br>");
			tooltip.append("<font color=#0000FF>" + ans.getAnswerType().getSeparatorText() + "</font>");
		}
		else if (ansType.getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
			tooltip.append(ans.getPartialDateIsNotNull() ? ans.getPartialDate().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.PICKLIST))
			tooltip.append(ans.getPicklistIsNotNull()?ans.getPicklist().getOptionText():"");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.TEXT))
			tooltip.append(ans.getStringAnswerIsNotNull()?ans.getStringAnswer().toString():"");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.TIME))
			tooltip.append(ans.getTimeAnswerIsNotNull() ? ans.getTimeAnswer().toString() : "");
		else if (ansType.getAnswerType().equals(QuestionAnswerType.YESNO))
			if (!ans.getBoolValueAnswerIsNotNull())
				tooltip.append("Not Specified");
			else if (ans.getBoolValueAnswer().booleanValue() == true)
				tooltip.append("Yes");
			else
				tooltip.append("No");
		
		return tooltip.toString();
	}
	
	public void populate(User_AssessmentVo data) throws PresentationLogicException
	{
		checkDataIntegrity(data);				
		boolean isFlatView = data.getIsFlatView().booleanValue();
		boolean isMultiGroup = data.getIsMultipleGroup().booleanValue();		
		
		if(isDPP)
		{
			prepareGrid(true, data.getGroupQuestionWidth());
			populateQuestionsFlat(data);
		}
		else
		{
			prepareGrid(isFlatView, data.getGroupQuestionWidth());
			
			if(isMultiGroup && isFlatView)
				populateQuestionsFlat(data);
			else
				populateQuestionsHierarchical(data);
		}
	}
	
	private void populateQuestionsFlat(User_AssessmentVo data) throws PresentationLogicException
	{
		if(data.getQuestionGroups() == null)
			return;
		
		Assessment_QuestionVoCollection questions = new Assessment_QuestionVoCollection();				
		for(int x = 0; x < data.getQuestionGroups().size(); x++)
		{				
			if(data.getQuestionGroups().get(x).getQuestionsIsNotNull() 
					&& data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
					&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
			{
				for(int y = 0; y < data.getQuestionGroups().get(x).getQuestions().size(); y++)
				{
					if(data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
							&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE) 
							&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatusIsNotNull() 
							&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
					{
						questions.add(data.getQuestionGroups().get(x).getQuestions().get(y));
					}
				}
			}
		}				
		
		questions = sortQuestionsBySequence(questions);
		
		for(int x = 0; x < questions.size(); x++)
		{
			Assessment_QuestionVo question = questions.get(x);
			Assessment_QuestionGroupVo questionGroup = null;
			
			for(int y = 0; y < data.getQuestionGroups().size(); y++)
			{				
				if(data.getQuestionGroups().get(y).getQuestionsIsNotNull())
				{
					for(int z = 0; z < data.getQuestionGroups().get(y).getQuestions().size(); z++)
					{
						if(data.getQuestionGroups().get(y).getQuestions().get(z).equals(question))
						{
							questionGroup = data.getQuestionGroups().get(y);
							break;
						}
					}
				}
				
				if(questionGroup != null)
					break;
			}
			
			addQuestionRow(question, questionGroup, null);
		}
	}	
	
	private Assessment_QuestionVoCollection sortQuestionsBySequence(Assessment_QuestionVoCollection questionsToBeSorted)
	{
		if(questionsToBeSorted == null)
			return new Assessment_QuestionVoCollection();
	
		int size = questionsToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				Assessment_QuestionVo source = questionsToBeSorted.get(sorted[x]);
				Assessment_QuestionVo compare = questionsToBeSorted.get(sorted[y]);
					
				if(source.getSequenceIsNotNull() && compare.getSequenceIsNotNull())
				{
					if(source.getSequence().compareTo(compare.getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		Assessment_QuestionVoCollection sortedQuestions = new Assessment_QuestionVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedQuestions.add(questionsToBeSorted.get(sorted[x]));
		}
		
		return sortedQuestions;
	}
	
	private void checkDataIntegrity(User_AssessmentVo data) throws PresentationLogicException
	{
		if(data == null)
			throw new PresentationLogicException("Invalid user assessment");
		if(data.getIsFlatView() == null)
			throw new PresentationLogicException("Invalid user assessment view type");
		if(data.getIsMultipleGroup() == null)
			throw new PresentationLogicException("Invalid user assessment data");
	}
	
	private void populateQuestionsHierarchical(User_AssessmentVo data) throws PresentationLogicException
	{	
		if(data.getQuestionGroups() == null)
			return;
		checkDataIntegrity(data);
		boolean flatView = data.getIsFlatView().booleanValue();
		
		for(int x = 0; x < data.getQuestionGroups().size(); x++)
		{
			if(data.getQuestionGroups().get(x) != null 
					&& data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
					&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
			{
				if(flatView)				
				{
					if(data.getQuestionGroups().get(x).getQuestionsIsNotNull())
					{
						for(int y = 0; y < data.getQuestionGroups().get(x).getQuestions().size(); y++)
						{
							if(data.getQuestionGroups().get(x).getActiveStatusIsNotNull() 
									&& data.getQuestionGroups().get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE) 
									&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatusIsNotNull() 
									&& data.getQuestionGroups().get(x).getQuestions().get(y).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
							{
								addQuestionRow(data.getQuestionGroups().get(x).getQuestions().get(y), data.getQuestionGroups().get(x), null);
							}
						}
					}
				}
				else
				{
					if(countActiveQuestions(data.getQuestionGroups().get(x).getQuestions()) > 0)
						addGroupRow(data.getQuestionGroups().get(x));
				}
			}
		}
	}
	
	private DynamicGridRow addGroupRow(Assessment_QuestionGroupVo group) throws PresentationLogicException 
	{
		return addGroupRow(group, group.getQuestions(), null);
	}
	
	private DynamicGridRow addGroupRow(Assessment_QuestionGroupVo group, Assessment_QuestionVoCollection questions, Patient_AssessmentDataVo data) throws PresentationLogicException
	{
		checkDataIntegrity(group);		
		
		DynamicGridColumn column = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridRow row = this.grid.getRows().newRow();		
		row.setBackColor(Color.Beige);
		row.setBold(true);
			row.setIdentifier(new Group_RowData(group, null));
		row.setExpanded(true);
		
		DynamicGridCell cell = row.getCells().newCell(column, DynamicCellType.WRAPTEXT);
		cell.setValue(group.getName());			
		cell.setReadOnly(true);	
		
		if(questions != null)
		{
			for(int x = 0; x < questions.size(); x++)
			{
				if(questions.get(x).getActiveStatusIsNotNull() 
						&& (data != null || questions.get(x).getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE)))
				{
					if(data == null)
						addQuestionRow(row, questions.get(x), group, null);
					else
						addQuestionRow(row, questions.get(x), group, getInstAnswer(data, group, questions.get(x)));
				}
			}
		}
		
		return row;
	}
	
	private Patient_AssessmentQuestionVo getInstAnswer(Patient_AssessmentDataVo data, Assessment_QuestionGroupVo configGroup, Assessment_QuestionVo configQuestion)
	{
		if(data == null || configGroup == null || configQuestion == null)
			return null; 
		
		Patient_AssessmentGroupVo instGroup = getInstGroup(data, configGroup);
		if(instGroup == null)
			return null;
		
		for(int x = 0; x < instGroup.getAssessmentAnswers().size(); x++)
		{
			if(instGroup.getAssessmentAnswers().get(x) != null
					&& instGroup.getAssessmentAnswers().get(x).getAssessmentQuestion() != null
					&& instGroup.getAssessmentAnswers().get(x).getAssessmentQuestion().equals(configQuestion))
			{
				return instGroup.getAssessmentAnswers().get(x);
			}				
		}
		
		return null;
	}
	
	private Patient_AssessmentGroupVo getInstGroup(Patient_AssessmentDataVo data, Assessment_QuestionGroupVo configGroup)
	{
		if(data == null || configGroup == null)
			return null;
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			if(data.getAnswerGroups().get(x) != null
					&& data.getAnswerGroups().get(x).getAssessmentQuestionGroup() != null
					&& data.getAnswerGroups().get(x).getAssessmentQuestionGroup().equals(configGroup))
			{
				return data.getAnswerGroups().get(x);
			}
		}
		
		return null;
	}
	
	private void checkDataIntegrity(Assessment_QuestionGroupVo group) throws PresentationLogicException
	{
		if(group == null)			
			throw new PresentationLogicException("Invalid user assessment group");
		if(group.getName() == null)
			throw new PresentationLogicException("Invalid user assessment group name");
	}
	
	private int countActiveQuestions(Assessment_QuestionVoCollection questions)
	{
		if(questions == null)
			return 0;
		
		int count = 0;
		for(int x = 0; x < questions.size(); x++)
		{
			Assessment_QuestionVo question = questions.get(x);
			if(question.getActiveStatusIsNotNull() 
					&& question.getActiveStatus().equals(PreActiveActiveInactiveStatus.ACTIVE))
				count++;
		}		
		return count;
	}
	
	private void addQuestionRow(Assessment_QuestionVo question, Assessment_QuestionGroupVo questionGroup, Patient_AssessmentQuestionVo instAnswer) throws PresentationLogicException
	{
		addQuestionRow(null, question, questionGroup, instAnswer);
	}
	
	private void addQuestionRow(DynamicGridRow groupRow, Assessment_QuestionVo question, Assessment_QuestionGroupVo questionGroup, Patient_AssessmentQuestionVo instAnswer) throws PresentationLogicException 
	{
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);

		checkDataIntegrity(question);
				
		DynamicGridRow row;
		
		Image rowQuestionImage = this.questionImage;
		if(question.getIsMandatoryIsNotNull() && question.getIsMandatory().booleanValue())
			rowQuestionImage = this.mandatoryQuestionImage;
		
		if(groupRow != null)
			row = groupRow.getRows().newRow();
		else
		{			
			row = this.grid.getRows().newRow();
			
			DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
			if(imageColumn != null)
			{
				row.getCells().newCell(imageColumn, DynamicCellType.IMAGE).setValue(rowQuestionImage);				
			}
		}
		
		row.setIdentifier(question);
		row.setExpandedImage(rowQuestionImage);
		row.setCollapsedImage(rowQuestionImage);
		
		if(isDPP == false)
		{
			if(buttonColumn != null 
					&& ((instAnswer == null && question != null && question.getAllowsMultipleAnswersIsNotNull() && question.getAllowsMultipleAnswers().booleanValue())
					|| (instAnswer != null && instAnswer.getAllowsMultipleAnswersIsNotNull() && instAnswer.getAllowsMultipleAnswers().booleanValue())))
			{
				DynamicGridCell buttonCell = row.getCells().newCell(buttonColumn, DynamicCellType.IMAGEBUTTON);			
				buttonCell.setTooltip("Create new answer for this question");
				buttonCell.setValue(this.buttonAddImage);
				buttonCell.setIdentifier(BUTTON_ADD_ANSWER);			
				buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
			}
		}

		DynamicGridCell questionCell = row.getCells().newCell(questionColumn, DynamicCellType.WRAPTEXT);		
		questionCell.setValue(question.getQuestion().getShortText());
		questionCell.setTooltip(question.getQuestion().getText());			
		questionCell.setReadOnly(true);	
		
		if(isFlatView())
			questionCell.setIdentifier(questionGroup);
		
		if(question.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < question.getQuestion().getAnswerTypes().size(); x++)
			{
				if(question.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
						&& question.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					boolean readOnlyCell = false;
					//Set readonly the cell when not applicable
					if(isDPP && showSelect/*(isAnswerStatus(instAnswer, AnswerStatus.NOTAPPLICABLE) || isAnswerStatus(instAnswer, AnswerStatus.NOTANSWERED))*/)
						readOnlyCell = true;
					addAnswerCell(row, getAnswerColumn(x), question.getQuestion().getAnswerTypes().get(x), getInstAnswerType(instAnswer, question.getQuestion().getAnswerTypes().get(x)), readOnlyCell);														
				}
			}
		}
		
		if(isDPP)
		{
			if(showSelect/*isAnswerStatus(instAnswer, AnswerStatus.NOTAPPLICABLE) || isAnswerStatus(instAnswer, AnswerStatus.NOTANSWERED)*/)
			{
				DynamicGridColumn confirmedColum 	 = getDppColumn(SELECT_NA_COLUMN);
				if(confirmedColum != null)
				{
					DynamicGridCell cell = row.getCells().newCell(confirmedColum, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);	
				}
			}
			else
			{
				DynamicGridColumn confirmedColum 	 = showConfirmation?getDppColumn(CONFIRM_COLUMN):null; 
				DynamicGridColumn notApplicableColum = getDppColumn(NOTAPPLICABLE_COLUMN);
				DynamicGridColumn pocColumn 		 = getDppColumn(POC_COLUMN);
				
				if(confirmedColum != null)
				{
					DynamicGridCell cell = row.getCells().newCell(confirmedColum, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);
				}
				
				if(notApplicableColum != null)
				{
					DynamicGridCell cell = row.getCells().newCell(notApplicableColum, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);
				}
				
				if(pocColumn != null)
				{
					DynamicGridCell cell = row.getCells().newCell(pocColumn, DynamicCellType.BOOL);
					cell.setAutoPostBack(true);
				}
			}
		}
	}
	
	private void checkDataIntegrity(Assessment_QuestionVo question) throws PresentationLogicException
	{
		if(question == null)
			throw new PresentationLogicException("Invalid user assessment question");
		if(question.getQuestion() == null)
			throw new PresentationLogicException("Invalid user assessment question");
		if(question.getQuestion().getText() == null)
			throw new PresentationLogicException("Invalid user assessment question text");
		if(question.getQuestion().getShortText() == null)
			throw new PresentationLogicException("Invalid user assessment question short text");
	}
	
	private Answer_DetailsVo getInstAnswerType(Patient_AssessmentQuestionVo instQuestion, Question_AnswerTypeVo configAnswerType)
	{
		if(instQuestion == null || instQuestion.getPatientAnswers() == null || instQuestion.getPatientAnswers().size() == 0 || configAnswerType == null)
			return null;
		
		for(int x = 0; x < instQuestion.getPatientAnswers().size(); x++)
		{
			Patient_AssessmentAnswerVo answer = instQuestion.getPatientAnswers().get(x);		
			if(answer != null && answer.getAnswerDetails() != null)
			{
				for(int y = 0; y < answer.getAnswerDetails().size(); y++)
				{
					if(answer.getAnswerDetails().get(y).getAnswerTypeIsNotNull() && answer.getAnswerDetails().get(y).getAnswerType().equals(configAnswerType))
					{
						return answer.getAnswerDetails().get(y);
					}
				}
			}		
		}
		
		return null;
	}
	
	private DynamicGridCell addAnswerCell(DynamicGridRow row, DynamicGridColumn column, Question_AnswerTypeVo configAnswer, Answer_DetailsVo instAnswer) throws PresentationLogicException
	{
		return addAnswerCell(row, column, configAnswer, instAnswer, false);
	}
	
	private DynamicGridCell addAnswerCell(DynamicGridRow row, DynamicGridColumn column, Question_AnswerTypeVo configAnswer, Answer_DetailsVo instAnswer, boolean readOnly) throws PresentationLogicException 
	{
		checkDataIntegrity(configAnswer);
	
		DynamicCellType cellAnswerType = getCellAnswerType(configAnswer.getAnswerType());
		DynamicGridCell cell = row.getCells().newCell(column, cellAnswerType);
		
		cell.setWidth(getCellAnswerWidth(configAnswer, instAnswer));
		cell.setDecoratorType(DynamicCellDecoratorMode.ALWAYS);
		cell.setIdentifier(configAnswer);
		cell.setReadOnly(readOnly);
		setAnswerCellValue(cell, configAnswer, instAnswer);				
		setCellTooltip(cell, configAnswer);
		if(isDPP && cellAnswerType != null && cellAnswerType.equals(DynamicCellType.MULTISELECT))
		{
			cell.setAutoPostBack(true);
		}
		
		return cell;
	}
	
	private void setCellTooltip(DynamicGridCell cell, Question_AnswerTypeVo configAnswer)
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
	
	private void checkDataIntegrity(Question_AnswerTypeVo answer) throws PresentationLogicException
	{
		if(answer == null)
			throw new PresentationLogicException("Invalid user assessment question answer");
		if(answer.getAnswerType() == null)
			throw new PresentationLogicException("Invalid user assessment question answer type");
	}
	
	private int getCellAnswerWidth(Question_AnswerTypeVo configAnswer, Answer_DetailsVo instAnswer)
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
			if(isDPP)
				defaultMultiSelect = DEFAULT_MULTISELECT_ANSWER_CELL_WIDTH + 190;
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
	
	private void setAnswerCellValue(DynamicGridCell cell, Question_AnswerTypeVo configAnswer, Answer_DetailsVo instAnswer) 
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
			setAnswerCellOptions(configAnswer, cell, instAnswer);
			
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
	
	private void setAnswerCellOptions(Question_AnswerTypeVo answer, DynamicGridCell cell)
	{
		setAnswerCellOptions(answer, cell, null);
	}
	
	private void setAnswerCellOptions(Question_AnswerTypeVo answer, DynamicGridCell cell, Answer_DetailsVo instAnswer) 
	{
		cell.getItems().clear();
	 	// WDEV-3617
		cell.setAutoWrapForMultiSelect(true);
		int maxVisibleItems = 0;
		if(answer.getOptionsIsNotNull())
		{
			for(int x = 0; x < answer.getOptions().size(); x++)
			{
				Answer_OptionVo answerItem = answer.getOptions().get(x);									
				if(answerItem != null)
				{
					//WDEV-1631 - When Viewing an Instantiated Assessment i simply want to see all the question and answered given, in edit mode i want to see all the questions and answer options. 
					if(displayAnsweredOnly && isNotAnswered(answerItem, instAnswer))
						continue;
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
		
		cell.setMaxVisibleItemsForMultiSelect(0);
		
		// This line is no longer needed, the answer is going to be wrapped.
		// MM - WDEV-3617
		//cell.setMaxVisibleItemsForMultiSelect(maxVisibleItems == 0 ? 1 : maxVisibleItems + 1);
	}
	
	private boolean isNotAnswered(Answer_OptionVo answerItem, Answer_DetailsVo instAnswer)
	{
		if(answerItem == null || instAnswer == null)
			return false;

		return instAnswer.getMultiSelectAnswers().indexOf(answerItem) < 0;
	}
	
	public void populate(Graphic_AssessmentVo voGraphicAssessment) throws PresentationLogicException 
	{		
		Patient_AssessmentDataVo voPatientAssessmentData = new Patient_AssessmentDataVo();
		
		if(voGraphicAssessment != null)
		{	
			voPatientAssessmentData.setGraphic(voGraphicAssessment);
			//------ Associated Graphic Questions -------
			if(voGraphicAssessment.getAssociatedQuestionsIsNotNull())
			{
				voPatientAssessmentData.setGraphicQuestion(new Patient_GraphicAssessmentQuestionAnswerVoCollection());
				for(int k = 0; k < voGraphicAssessment.getAssociatedQuestions().size(); k++)
				{
					Graphic_AssessmentQuestionVo graphicAssessmentQuestionVo = voGraphicAssessment.getAssociatedQuestions().get(k);
					PreActiveActiveInactiveStatus assessmentQuestionStatus = graphicAssessmentQuestionVo.getActiveStatus();
					//WDEV-1211 - Check assessmentQuestion to be active
					if(assessmentQuestionStatus != null && assessmentQuestionStatus.equals(PreActiveActiveInactiveStatus.ACTIVE))
					{
						//WDEV-11366
						if (isQuestionInvalidForPatient(graphicAssessmentQuestionVo.getQuestion()))
							continue;
						Patient_GraphicAssessmentQuestionAnswerVo voPatientGraphicAssessmentQuestionAnswer = new Patient_GraphicAssessmentQuestionAnswerVo(); 
						voPatientGraphicAssessmentQuestionAnswer.setGraphicQuestion(graphicAssessmentQuestionVo);
						voPatientAssessmentData.getGraphicQuestion().add(voPatientGraphicAssessmentQuestionAnswer);
					}
				}
			}
			//------ End Associated Graphic Questions ---
			
			if(voPatientAssessmentData.getGraphicFindings() == null)
				voPatientAssessmentData.setGraphicFindings(new Patient_GraphicAssessmentVoCollection());
			
			//DrawingGraphicImage and Findings collection
			for(int j = 0; j < voGraphicAssessment.getImages().size(); j++)
			{
				Patient_GraphicAssessmentVo voPatientGraphicAssessment = new Patient_GraphicAssessmentVo();
				voPatientGraphicAssessment.setGraphicImage(voGraphicAssessment.getImages().get(j));
				if(voGraphicAssessment.getFindingsAndQuestionsIsNotNull())
				{
					voPatientGraphicAssessment.setPatientGraphicFinding(new Patient_GraphicAssessmentFindingVoCollection());
					for(int m = 0;  m < voGraphicAssessment.getFindingsAndQuestions().size(); m++)
					{
						Graphic_AssessmentFindingVo voGraphicAssessmentFinding = voGraphicAssessment.getFindingsAndQuestions().get(m);
						
						Patient_GraphicAssessmentFindingVo voPatientGraphicAssessmentFinding = new Patient_GraphicAssessmentFindingVo();
						voPatientGraphicAssessmentFinding.setGraphicFinding(voGraphicAssessmentFinding.getFinding());

						//TODO - this works for Graphical Assessment and Graphical Assessment with questions where we have
						// 1:1 relationship between GraphicAssessmentFinding and FindingStageQuestions
						// need to review for the third type of assessment
						//if(voGraphicAssessmentFinding.getAssociatedQuestionsIsNotNull())
						if(voGraphicAssessmentFinding.getFindingStageIsNotNull() && voGraphicAssessmentFinding.getFindingStage().size() > 0 && voGraphicAssessmentFinding.getFindingStage().get(0).getAssociatedQuestionsIsNotNull())
						{
							//voPatientGraphicAssessmentFinding.setFindingQuestion(new PatientGraphicAssessmentFindingQuestionAnswerVoCollection());
							voPatientGraphicAssessmentFinding.setStage(new Patient_GraphicalAssessmentStageVoCollection());
							//for(int l = 0; l < voGraphicAssessmentFinding.getAssociatedQuestions().size(); l++)
							for(int l = 0; l < voGraphicAssessmentFinding.getFindingStage().get(0).getAssociatedQuestions().size(); l++)
							{
								//GraphicAssessmentFindingQuestionVo graphicAssessmentFindingQuestionVo = voGraphicAssessmentFinding.getAssociatedQuestions().get(l);
								Graphic_AssessmentFindingQuestionVo graphicAssessmentFindingQuestionVo = voGraphicAssessmentFinding.getFindingStage().get(0).getAssociatedQuestions().get(l);
								
								PreActiveActiveInactiveStatus findingQuestionStatus = graphicAssessmentFindingQuestionVo.getActiveStatus();
								//WDEV-1211 - Check finding Question to be active
								if(findingQuestionStatus != null && findingQuestionStatus.equals(PreActiveActiveInactiveStatus.ACTIVE))
								{
									Patient_GraphicAssessmentFindingQuestionAnswerVo vpPGAFindingQA = new Patient_GraphicAssessmentFindingQuestionAnswerVo();
									vpPGAFindingQA.setGraphicFindingQuestion(graphicAssessmentFindingQuestionVo);
									vpPGAFindingQA.setIsMandatory(graphicAssessmentFindingQuestionVo.getIsMandatory());

									Patient_GraphicalAssessmentStageVo voPGASVo = new Patient_GraphicalAssessmentStageVo();
									voPGASVo.setFindingQuestion(new Patient_GraphicAssessmentFindingQuestionAnswerVoCollection());
									voPGASVo.getFindingQuestion().add(vpPGAFindingQA);
									voPGASVo.setStage(voGraphicAssessmentFinding.getFindingStage().get(0));
									
									voPatientGraphicAssessmentFinding.setStage(new Patient_GraphicalAssessmentStageVoCollection());
									voPatientGraphicAssessmentFinding.getStage().add(voPGASVo);
								}
							}
						}
						voPatientGraphicAssessment.getPatientGraphicFinding().add(voPatientGraphicAssessmentFinding);
					}
				}
				voPatientAssessmentData.getGraphicFindings().add(voPatientGraphicAssessment);
			}
		}
		
		populateGraphic(voPatientAssessmentData, null);
	}
	
	private void populateGraphic(Patient_AssessmentDataVo data, PatientAssessmentStatusReason status) throws PresentationLogicException
	{
		checkDataIntegrity(data);
		prepareGraphicGrid(isCompleted(status));
		populateGraphicQuestions(data);
		setAnswersGraphic(data.getGraphicQuestion());
	}
	
	private void setAnswersGraphic(Patient_GraphicAssessmentQuestionAnswerVoCollection answers)
	{
		if(answers == null || answers.size() <= 0)
			return;

		for(int x = 0; x < answers.size(); x++)
		{
			Patient_GraphicAssessmentQuestionAnswerVo answerGraphic = answers.get(x);
			setQuestionRowAnswer(answerGraphic);
		}
	}
	
	private boolean setQuestionRowAnswer(Patient_GraphicAssessmentQuestionAnswerVo graphicAnswer)
	{
		if(graphicAnswer == null || graphicAnswer.getPatientAnswers() == null)
			return false;
		
		DynamicGridRow initialQuestionRow = null;
		DynamicGridRow questionRow = getRowsByIdentifier(graphicAnswer);		
		if(questionRow == null)
			return false;
		
		for(int i = 0; i < graphicAnswer.getPatientAnswers().size(); i++)
		{
			Patient_AssessmentAnswerVo answerDetail = graphicAnswer.getPatientAnswers().get(i);
		
			if(answerDetail != null)
			{
				if(i > 0)
				{
					if(initialQuestionRow == null)
						initialQuestionRow = questionRow;
					
					questionRow = duplicate_QuestionRow(initialQuestionRow);
				}
				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{
					Answer_DetailsVo answer = answerDetail.getAnswerDetails().get(x);
					DynamicGridCell cell = findCell(questionRow, answer.getAnswerType());
					
					if(cell != null)
					{
						if (x == 0)
							cell.getRow().setValue(answerDetail);
						
						setCellAnswer(cell, answer);
					}
				}
			}
		}
		
		return true;
	}
	
	private void setCellAnswer(DynamicGridCell cell, Answer_DetailsVo answer)
	{
		if (cell == null)
			return;
		if (answer == null)
			return;

		Question_AnswerTypeVo answerType = null;

		if (cell.getIdentifier() instanceof Question_AnswerTypeVo)
			answerType = (Question_AnswerTypeVo) cell.getIdentifier();
		else if (cell.getIdentifier() instanceof AnswerCellData)
			answerType = ((Answer_CellData) cell.getIdentifier()).getConfigData();

		cell.setIdentifier(new Answer_CellData(answerType, answer));
		
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
	
	private void setCellMultiAnswer(DynamicGridCell cell, Answer_OptionVoCollection items)
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
	
	private DynamicGridCell findCell(DynamicGridRow questionRow, Question_AnswerTypeVo answerType)
	{
		if(questionRow == null)
			return null;
		if(answerType == null)
			return null;
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = questionRow.getCells().get(this.grid.getColumns().get(x));
			
			if(cell != null && cell.getIdentifier() != null)
			{										
					if(cell.getIdentifier() instanceof Question_AnswerTypeVo && cell.getIdentifier().equals(answerType))
						return cell;
					else if(cell.getIdentifier() instanceof Answer_CellData && ((Answer_CellData)cell.getIdentifier()).getConfigData().equals(answerType))
						return cell;
			}			
		}
		
		return null;
	}
	
	private DynamicGridRow duplicate_QuestionRow(DynamicGridRow row)
	{
		if(row == null || row.getIdentifier() == null)
			return null;
		
		Object identifier = row.getIdentifier();
		Assessment_QuestionVo question = null;
		Assessment_QuestionGroupVo questionGroup = null;
		Graphic_AssessmentFindingQuestionVo voGraphicFindingQuestion = null;
		Graphic_AssessmentQuestionVo voGraphicQuestion = null;
		
		if(identifier instanceof Assessment_QuestionVo)			
			question = (Assessment_QuestionVo)identifier;
		if(identifier instanceof Assessment_QuestionGroupVo)
			questionGroup = (Assessment_QuestionGroupVo)identifier;
		
		if(identifier instanceof Graphic_AssessmentFindingQuestionVo)
			voGraphicFindingQuestion = (Graphic_AssessmentFindingQuestionVo)identifier;
		if(identifier instanceof Graphic_AssessmentQuestionVo)
			voGraphicQuestion = (Graphic_AssessmentQuestionVo)identifier;
		
		if(question == null && questionGroup == null && voGraphicFindingQuestion == null && voGraphicQuestion == null)
			return null;
		
		DynamicGridRow newRow;
		DynamicGridRow lastRow = findLastRowWithSameIdentifier(row.getParent() == null ? this.grid.getRows() : row.getParent().getRows(), identifier);
		if(lastRow == null)
			lastRow = row;
		
		if(row.getParent() != null)
			newRow = row.getParent().getRows().newRowAfter(lastRow);
		else
			newRow = this.grid.getRows().newRowAfter(lastRow);
		
		newRow.setIdentifier(identifier);				
				 
		DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
		if(imageColumn != null)
		{
			DynamicGridCell imageCell = newRow.getCells().newCell(imageColumn, DynamicCellType.IMAGE);
			imageCell.setValue(this.additionalAnswerImage);
		}
				
		newRow.setExpandedImage(this.additionalAnswerImage);
		newRow.setCollapsedImage(this.additionalAnswerImage);
		
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);
		
		DynamicGridCell questionCell = row.getCells().get(questionColumn);
		DynamicGridCell newQuestionCell = newRow.getCells().newCell(questionColumn, questionCell.getType());		
		newQuestionCell.setTooltip(questionCell.getTooltip());
		newQuestionCell.setTextColor(questionCell.getTextColor());
		newQuestionCell.setReadOnly(true);
		if(questionCell.getIdentifier() != null)
			newQuestionCell.setIdentifier(questionCell.getIdentifier());
		
		if(buttonColumn != null)
		{
			DynamicGridCell buttonCell = row.getCells().get(buttonColumn);
			if(buttonCell != null)
			{
				DynamicGridCell newButtonCell = newRow.getCells().newCell(buttonColumn, buttonCell.getType());			
				newButtonCell.setTooltip("Remove this answer");
				newButtonCell.setValue(this.buttonRemoveImage);
				newButtonCell.setIdentifier(BUTTON_REMOVE_ANSWER);
				buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
			}
		}		
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell answerCell = row.getCells().get(this.grid.getColumns().get(x));
			if(answerCell == null)
				continue;
			if(answerCell.getType().equals(DynamicCellType.DYNAMICLABEL))
			{
				DynamicGridCell newSeparatorCell = newRow.getCells().newCell(this.grid.getColumns().get(x), answerCell.getType());
				newSeparatorCell.setValue(answerCell.getValue());
				newSeparatorCell.setTextColor(answerCell.getTextColor());
				newSeparatorCell.setTooltip(answerCell.getTooltip());				
			}
				else if(answerCell.getIdentifier() != null && (answerCell.getIdentifier() instanceof Question_AnswerTypeVo || answerCell.getIdentifier() instanceof Answer_CellData))
			{				
				DynamicGridCell newAnswerCell = newRow.getCells().newCell(this.grid.getColumns().get(x), answerCell.getType());
					
					if(answerCell.getIdentifier() instanceof Answer_CellData)
						newAnswerCell.setIdentifier(((Answer_CellData)answerCell.getIdentifier()).getConfigData());
					else
				newAnswerCell.setIdentifier(answerCell.getIdentifier());
				newAnswerCell.setWidth(answerCell.getWidth());
				newAnswerCell.setReadOnly(answerCell.isReadOnly());
				newAnswerCell.setDecoratorType(answerCell.getDecoratorType());
				newAnswerCell.setMaxCheckedItemsForMultiSelect(answerCell.getMaxCheckedItemsForMultiSelect());
				newAnswerCell.setMaxVisibleItemsForMultiSelect(answerCell.getMaxVisibleItemsForMultiSelect());
				newAnswerCell.setTextColor(answerCell.getTextColor());
				newAnswerCell.setTooltip(answerCell.getTooltip());
				
				if(answerCell.getType().isSupportingItems())
				{
					for(int y = 0; y < answerCell.getItems().size(); y++)
					{					
						DynamicGridCellItem item = answerCell.getItems().get(y);
						DynamicGridCellItem newItem = newAnswerCell.getItems().newItem(item.getValue(), item.getImage(), item.getTextColor(), false);
						newItem.setMarkerColor(item.getMarkerColor());
						if(item.getIdentifier() != null)
							newItem.setIdentifier(item.getIdentifier());
					}
				}
			}
		}
		
		return newRow;
	}
	
	private DynamicGridRow getRowsByIdentifier(Patient_GraphicAssessmentQuestionAnswerVo voPatientGAQAnswer)
	{
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			Patient_GraphicAssessmentQuestionAnswerVo questionAnswer = (Patient_GraphicAssessmentQuestionAnswerVo)(this.grid.getRows().get(x).getCells().get(this.grid.getColumns().getByIdentifier(QUESTION_COLUMN)).getIdentifier());
			if(voPatientGAQAnswer.equals(questionAnswer))
				return this.grid.getRows().get(x);
		}
		
		return null;
	}
	
	private void populateGraphicQuestions(Patient_AssessmentDataVo data) throws PresentationLogicException
	{
		if(data.getGraphicQuestion() == null)
			return;

		ims.assessment.vo.Patient_GraphicAssessmentQuestionAnswerVoCollection voColl = null;
		for(int i = 0; i < data.getGraphicQuestion().size(); i++)
		{
			if(voColl == null)
				voColl = new ims.assessment.vo.Patient_GraphicAssessmentQuestionAnswerVoCollection();
			voColl.add(data.getGraphicQuestion().get(i));
		}
		
		voColl = sortGraphicQuestionsByIndex(voColl);
		for(int i = 0; i < voColl.size(); i++)
		{
			addGraphicQuestionRow(voColl.get(i).getGraphicQuestion(), voColl.get(i), allowMutlipleAnswers(voColl.get(i).getGraphicQuestion()));
		}
	}
	
	private void addGraphicQuestionRow(Graphic_AssessmentQuestionVo question, Patient_GraphicAssessmentQuestionAnswerVo voPatientGraphicAssessmentQuestionAnswer, boolean allowMultipleQuestion) throws PresentationLogicException 
	{
		checkDataIntegrity(question);
		
		addGraphicQuestionLegend(question.getQuestion().getLegendText());
		
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);

		DynamicGridRow row = this.grid.getRows().newRow();
		
		Image rowQuestionImage = this.questionImage;
		if(question.getIsMandatoryIsNotNull() && question.getIsMandatory().booleanValue())
			rowQuestionImage = this.mandatoryQuestionImage;
		
		DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
		if(imageColumn != null)
		{
			row.getCells().newCell(imageColumn, DynamicCellType.IMAGE).setValue(rowQuestionImage);				
		}
		
		row.setIdentifier(question);
		row.setExpandedImage(rowQuestionImage);
		row.setCollapsedImage(rowQuestionImage);
		
		if(buttonColumn != null && allowMultipleQuestion)
		{
			DynamicGridCell buttonCell = row.getCells().newCell(buttonColumn, DynamicCellType.IMAGEBUTTON);			
			buttonCell.setTooltip("Create new answer for this question");
			buttonCell.setValue(this.buttonAddImage);
			buttonCell.setIdentifier(BUTTON_ADD_ANSWER);			
			buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
		}

		DynamicGridCell questionCell = row.getCells().newCell(questionColumn, DynamicCellType.WRAPTEXT);		
		questionCell.setValue(question.getQuestion().getShortText());
		questionCell.setTooltip(question.getQuestion().getText());			
		questionCell.setReadOnly(true);	
		
		questionCell.setIdentifier(voPatientGraphicAssessmentQuestionAnswer);
		
		if(question.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < question.getQuestion().getAnswerTypes().size(); x++)
			{
				if(question.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
						&& question.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					addAnswerCell(row, getAnswerColumn(x), question.getQuestion().getAnswerTypes().get(x), getInstAnswerType(voPatientGraphicAssessmentQuestionAnswer.getPatientAnswers(), question.getQuestion().getAnswerTypes().get(x)));
				}
			}
		}
	}
	
	private Answer_DetailsVo getInstAnswerType(Patient_AssessmentAnswerVoCollection patientAnswers, Question_AnswerTypeVo configAnswerType)
	{
		if(patientAnswers == null || patientAnswers.size() == 0 || configAnswerType == null)
			return null;
			
		for (int i = 0; i < patientAnswers.size(); i++)
		{
			Patient_AssessmentAnswerVo voPatAssAnswerVo = patientAnswers.get(i);
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

	private void checkDataIntegrity(Graphic_AssessmentQuestionVo voGraphicAssessmentQuestion) throws PresentationLogicException
	{
		if(voGraphicAssessmentQuestion == null)
			throw new PresentationLogicException("Invalid graphic assessment question data");
		
		if(voGraphicAssessmentQuestion.getQuestion() == null)
			throw new PresentationLogicException("Invalid graphic assessment question");
	}
	
	private boolean allowMutlipleAnswers(Graphic_AssessmentQuestionVo graphicQuestion)
	{
		if(graphicQuestion != null)
		{
			return graphicQuestion.getAllowsMultipleAnswersIsNotNull() && graphicQuestion.getAllowsMultipleAnswers().booleanValue(); 
		}
		return false;
	}
	
	private Patient_GraphicAssessmentQuestionAnswerVoCollection sortGraphicQuestionsByIndex(Patient_GraphicAssessmentQuestionAnswerVoCollection questionsToBeSorted)
	{
		if(questionsToBeSorted == null)
			return new Patient_GraphicAssessmentQuestionAnswerVoCollection();
	
		int size = questionsToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				Patient_GraphicAssessmentQuestionAnswerVo source = questionsToBeSorted.get(sorted[x]);
				Patient_GraphicAssessmentQuestionAnswerVo compare = questionsToBeSorted.get(sorted[y]);
					
				if(source.getGraphicQuestionIsNotNull() && compare.getGraphicQuestionIsNotNull())
				{
					if(source.getGraphicQuestion().getSequenceIsNotNull())
					if(source.getGraphicQuestion().getSequence().compareTo(compare.getGraphicQuestion().getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		Patient_GraphicAssessmentQuestionAnswerVoCollection sortedQuestions = new Patient_GraphicAssessmentQuestionAnswerVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedQuestions.add(questionsToBeSorted.get(sorted[x]));
		}
		
		return sortedQuestions;
	}
	
	private void checkDataIntegrity(Patient_AssessmentDataVo data) throws PresentationLogicException
	{
		if(data == null)
			throw new PresentationLogicException("Invalid user assessment data");
		
		if(isGraphicAssessmentData(data))
		{
			// if(data.getGraphicQuestion() == null)
			//	 throw new PresentationLogicException("Invalid graphic associated question data");
			if(data.getGraphic() == null)
				throw new PresentationLogicException("Invalid graphic assessment component data");
		}
		else
		{
			if(data.getAnswerGroups() == null)
				throw new PresentationLogicException("Invalid user assessment groups data");
			if(data.getUserAssessment() == null)
				throw new PresentationLogicException("Invalid user assessment component data");
			if(data.getUserAssessment().getIsFlatView() == null)
				throw new PresentationLogicException("Invalid user assessment view type");
			if(data.getUserAssessment().getIsMultipleGroup() == null)
				throw new PresentationLogicException("Invalid user assessment multi group attribute");
		}
	}
	
	private boolean isGraphicAssessmentData(Patient_AssessmentDataVo data)
	{
		return data != null && data.getGraphic() != null;
	}
	
	private boolean isQuestionInvalidForPatient(Question_InformationVo question)
	{
		if (patInfo == null)
			return false;
		
		if (question.getGenderSpecificIsNotNull() )
		{
			if (GenderSpecific.MALE.equals(question.getGenderSpecific()) && (!patInfo.getSexIsNotNull() || !Sex.MALE.equals(patInfo.getSex())))
					return true;
			else
			if (GenderSpecific.FEMALE.equals(question.getGenderSpecific()) && (!patInfo.getSexIsNotNull() || !Sex.FEMALE.equals(patInfo.getSex()) ))
					return true;
		}
		
		if (question.getAgeRangeMaxIsNotNull() && (!patInfo.getAgeIsNotNull() || patInfo.getAge()>question.getAgeRangeMax()))
			return true;
		
		if (question.getAgeRangeMinIsNotNull() && (!patInfo.getAgeIsNotNull() || patInfo.getAge()<question.getAgeRangeMin()))
			return true;
		
		return false;
	}
	
	public void populate(Patient_AssessmentDataVo data, PatientAssessmentStatusReason status) throws PresentationLogicException
	{
		if(isGraphicAssessmentData(data))
			populateGraphic(data, status);
		else
			populateUserAssessment(data, status, null);	
	}
	
	private void populateUserAssessment(Patient_AssessmentDataVo data, PatientAssessmentStatusReason status, AnswerStatus answerStatus) throws PresentationLogicException
	{
		checkDataIntegrity(data);		
		boolean isFlatView = data.getUserAssessment().getIsFlatView().booleanValue();
		boolean isMultiGroup = data.getUserAssessment().getIsMultipleGroup().booleanValue();				
		
		prepareGrid(isFlatView, data.getGroupQuestionWidth(), isCompleted(status));
		
		if(isDPP)
		{
			populateQuestionsFlat(data, answerStatus);
			setAnswersFlat(data.getAnswerGroups());
		}
		else
		{
			if(isMultiGroup && isFlatView)
				populateQuestionsFlat(data, null);
			else
				populateQuestionsHierarchical(data);		
			
			if(isFlatView)
				setAnswersFlat(data.getAnswerGroups());
			else
				setAnswersHierarchical(data.getAnswerGroups());
		}
	}
	
	private void setAnswersFlat(Patient_AssessmentGroupVoCollection answers)
	{
		if(answers == null)
			return;
		
		for(int x = 0; x < answers.size(); x++)
		{
			Patient_AssessmentGroupVo answerGroup = answers.get(x);
			if(answerGroup != null && answerGroup.getAssessmentAnswersIsNotNull())
			{
				for(int y = 0; y < answerGroup.getAssessmentAnswers().size(); y++)
				{
					setQuestionRowAnswer(null, answerGroup.getAssessmentAnswers().get(y));
				}
			}
		}
	}
	
	private void setAnswersHierarchical(Patient_AssessmentGroupVoCollection answers)
	{
		if(answers == null)
			return;
		
		for(int x = 0; x < answers.size(); x++)
		{
			Patient_AssessmentGroupVo answerGroup = answers.get(x);
			if(answerGroup != null)
			{
				setGroupRowAnswer(answerGroup);
			}
		}
	}
	
	private boolean setGroupRowAnswer(Patient_AssessmentGroupVo answerGroup)
	{
		if(answerGroup == null)
			return false;
		
		DynamicGridRow groupRow = findRow(answerGroup.getAssessmentQuestionGroup());	
		if(groupRow == null)
			return false;
		
		Group_RowData groupData = (Group_RowData)groupRow.getIdentifier();
		groupRow.setIdentifier(new Group_RowData(groupData.getConfigGroup(), answerGroup));
		
		
		for(int x = 0; x < answerGroup.getAssessmentAnswers().size(); x++)
		{
			setQuestionRowAnswer(groupRow, answerGroup.getAssessmentAnswers().get(x));
		}
		
		return true;
	}
	
	private boolean setQuestionRowAnswer(DynamicGridRow groupRow, Patient_AssessmentQuestionVo assessmentQuestion)
	{
		if(assessmentQuestion == null || assessmentQuestion.getPatientAnswers() == null)
			return false;
		
		DynamicGridRow initialQuestionRow = null;
		DynamicGridRow questionRow = findRow(groupRow, assessmentQuestion.getAssessmentQuestion());		
		if(questionRow == null)
			return false;
		
		if(isDPP)
		{
			//Set Readonly the row if IsRoleReadOnly = true
			if(assessmentQuestion.getIsRoleReadOnlyIsNotNull() && assessmentQuestion.getIsRoleReadOnly().booleanValue())
			{
				questionRow.setReadOnly(true);
				questionRow.setBackColor(Color.LightGray);
			}
			
			DynamicGridColumn pocColumn = this.grid.getColumns().getByIdentifier(POC_COLUMN);
			boolean isNewAssessmentQuestion = assessmentQuestion.getID_PatientAssessmentQuestionIsNotNull();
			
			if(pocColumn != null)
			{
				DynamicGridCell pocCell = questionRow.getCells().get(pocColumn);
				if(pocCell != null)
				{
					Boolean pocChecked = assessmentQuestion != null ? assessmentQuestion.getIsPoc() : Boolean.FALSE;
					boolean pocSaved   = assessmentQuestion.getIsPocSavedIsNotNull()?assessmentQuestion.getIsPocSaved().booleanValue():false;
					//Set readonly the cell when we have a saved POC value against a Question or pocSaved (Question had a POC previously saved against)
					if (pocChecked != null && pocChecked.booleanValue() && (isNewAssessmentQuestion || pocSaved))
						pocCell.setReadOnly(true);
					
					pocCell.setValue(pocChecked);				
				}
			}
			
			DynamicGridColumn confirmColumn = this.grid.getColumns().getByIdentifier(CONFIRM_COLUMN);
			if(confirmColumn != null)
			{
				DynamicGridCell confirmCell = questionRow.getCells().get(confirmColumn);
				if(confirmCell != null)
				{
					confirmCell.setValue(assessmentQuestion.getIsConfirmed());
					if(assessmentQuestion.getIsConfirmedIsNotNull() && assessmentQuestion.getIsConfirmed().booleanValue() && isNewAssessmentQuestion)
						confirmCell.setReadOnly(true);
				}
			}
			
			//Set Readonly the NA cell if we have either Confirmed or POC
			boolean isConfirmed = assessmentQuestion.getIsConfirmedIsNotNull() && assessmentQuestion.getIsConfirmed().booleanValue();
			boolean isPoc = assessmentQuestion.getIsPocIsNotNull() && assessmentQuestion.getIsPoc().booleanValue();
			if(isConfirmed || isPoc)
			{
				DynamicGridColumn naColumn = this.grid.getColumns().getByIdentifier(NOTAPPLICABLE_COLUMN);
				if(naColumn != null)
				{
					DynamicGridCell naCell = questionRow.getCells().get(naColumn);
					if(naCell != null)
					{
						naCell.setReadOnly(true);
					}
				}
			}
		}
		
		for(int i = 0; i < assessmentQuestion.getPatientAnswers().size(); i++)
		{
			Patient_AssessmentAnswerVo answerDetail = assessmentQuestion.getPatientAnswers().get(i);
		
			if(answerDetail != null)
			{
				if(i > 0)
				{
					if(initialQuestionRow == null)
						initialQuestionRow = questionRow;
					
					questionRow = duplicate_QuestionRow(initialQuestionRow);
				}
				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{
					Answer_DetailsVo answer = answerDetail.getAnswerDetails().get(x);
					DynamicGridCell cell = findCell(questionRow, answer.getAnswerType());
					
					if(cell != null)
					{
						if(isDPP)
							cell.setAutoPostBack(true);
						
						if (x == 0)
							cell.getRow().setValue(answerDetail);
			
						setCellAnswer(cell, answer);
					}
				}
			}
		}
		
		return true;		
	}
	
	private DynamicGridRow findRow(DynamicGridRow groupRow, Assessment_QuestionVo assessmentQuestion)
	{
		if(assessmentQuestion == null)
			return null;
		
		DynamicGridRowCollection rows = null;
		if(groupRow != null)
			rows = groupRow.getRows();
		else
			rows = this.grid.getRows();
		
		for(int x = 0; x < rows.size(); x++)
		{
			DynamicGridRow row = rows.get(x);
			if(row.getIdentifier() != null && row.getIdentifier() instanceof Assessment_QuestionVo)
			{
				if(row.getIdentifier().equals(assessmentQuestion))
					return row;
			}
		}
		
		return null;
	}
	
	private DynamicGridRow findRow(Assessment_QuestionGroupVo assessmentQuestionGroup)
	{
		if(assessmentQuestionGroup == null)
			return null;
		
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			DynamicGridRow row = this.grid.getRows().get(x);
			
			if(row.getIdentifier() != null)
			{
				if(row.getIdentifier() instanceof Assessment_QuestionGroupVo)
				{
					if(row.getIdentifier().equals(assessmentQuestionGroup))
						return row;
				}
				else if(row.getIdentifier() instanceof Group_RowData)
				{
					if(((Group_RowData)row.getIdentifier()).getConfigGroup().equals(assessmentQuestionGroup))
						return row; 
				}
			}
		}
		
		return null;
	}
	
	private void populateQuestionsFlat(Patient_AssessmentDataVo data, AnswerStatus answerStatus) throws PresentationLogicException
	{
		if(data.getAnswerGroups() == null)
			return;
				
		Patient_AssessmentQuestionVoCollection answers = new Patient_AssessmentQuestionVoCollection();
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			if(data.getAnswerGroups().get(x) != null 
					&& data.getAnswerGroups().get(x).getAssessmentAnswers() != null)
			{
				for(int y = 0; y < data.getAnswerGroups().get(x).getAssessmentAnswers().size(); y++)
				{
					Patient_AssessmentQuestionVo answer = data.getAnswerGroups().get(x).getAssessmentAnswers().get(y);
					
					if(isDPP)
					{
						//For DPP add only the asnwers having the same AnswerStatus (e.g. ANSWERED, NOT APPLICABLE)
						if(isAnswerStatus(answer, answerStatus))
							answers.add(answer);
					}
					else
					{
						// WDEV-5868
						//if(!displayAnsweredOnly || (answer.getIsAnsweredIsNotNull() && answer.getIsAnswered().equals(AnswerStatus.ANSWERED) && answer.getAssessmentQuestionIsNotNull()))
						// we show all the questions
						if(answer.getAssessmentQuestionIsNotNull())
						{						
							answers.add(answer);
						}
					}
				}
			}
		}		
		
		answers = sortAnswersBySequence(answers);
		
		for(int x = 0; x < answers.size(); x++)
		{
			Patient_AssessmentQuestionVo answer = answers.get(x);
			Assessment_QuestionVo question = answer.getAssessmentQuestion();
			Assessment_QuestionGroupVo questionGroup = null;
			
			for(int y = 0; y < data.getAnswerGroups().size(); y++)
			{
				if(data.getAnswerGroups().get(y) != null 
						&& data.getAnswerGroups().get(y).getAssessmentAnswers() != null)
				{
					for(int z = 0; z < data.getAnswerGroups().get(y).getAssessmentAnswers().size(); z++)
					{
						if(data.getAnswerGroups().get(y).getAssessmentAnswers().get(z) != null 
								&& data.getAnswerGroups().get(y).getAssessmentAnswers().get(z).equals(answer))
						{
							questionGroup = data.getAnswerGroups().get(y).getAssessmentQuestionGroup();
							break;
						}
					}
				}
				
				if(questionGroup != null)
					break;
			}
			
			addQuestionRow(question, questionGroup, getInstAnswer(data, questionGroup, question));
		}
	}
	
	private boolean isAnswerStatus(Patient_AssessmentQuestionVo instAnswer, AnswerStatus answerStatus)
	{
		if(answerStatus == null)
			return true;
		
		if(instAnswer != null && instAnswer.getIsAnsweredIsNotNull() && instAnswer.getIsAnswered().equals(answerStatus))
			return true;
			
		return false;
	}
	
	private void populateQuestionsHierarchical(Patient_AssessmentDataVo data) throws PresentationLogicException 
	{
		if(data.getAnswerGroups() == null)
			return;	
		
		checkDataIntegrity(data);
		
		boolean flatView = data.getUserAssessment().getIsFlatView().booleanValue();
		
		Assessment_QuestionGroupVoCollection existingGroups = buildExistingGroups(data);
		
		for(int x = 0; x < existingGroups.size(); x++)
		{
			if(existingGroups.get(x) != null)
			{
				Assessment_QuestionVoCollection existingQuestions = buildExistingQuestions(data, existingGroups.get(x));
				
				if(flatView)
				{
					for(int y = 0; y < existingQuestions.size(); y++)
					{
						addQuestionRow(existingQuestions.get(y), existingGroups.get(x), getInstAnswer(data, existingGroups.get(x), existingQuestions.get(y)));						
					}
				}
				else
				{		
					addGroupRow(existingGroups.get(x), existingQuestions, data);
				}
			}
		}
	}
	
	private Assessment_QuestionVoCollection buildExistingQuestions(Patient_AssessmentDataVo data, Assessment_QuestionGroupVo group) throws PresentationLogicException
	{
		if(data.getAnswerGroups() == null || group == null)
			return new Assessment_QuestionVoCollection();
		
		checkDataIntegrity(data);		
		
		Assessment_QuestionVoCollection result = new Assessment_QuestionVoCollection();
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			if(data.getAnswerGroups().get(x).getAssessmentQuestionGroup() != null
					&& data.getAnswerGroups().get(x).getAssessmentQuestionGroup().equals(group))
			{
				Patient_AssessmentQuestionVoCollection answers = sortAnswersBySequence(data.getAnswerGroups().get(x).getAssessmentAnswers()); 
				for(int y = 0; y < answers.size(); y++)
				{
					result.add(data.getAnswerGroups().get(x).getAssessmentAnswers().get(y).getAssessmentQuestion());
				}
			}
		}
		
		return result;
	}
	
	private Patient_AssessmentQuestionVoCollection sortAnswersBySequence(Patient_AssessmentQuestionVoCollection answersToBeSorted)
	{
		if(answersToBeSorted == null)
			return new Patient_AssessmentQuestionVoCollection();
		
		int size = answersToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				Patient_AssessmentQuestionVo source = answersToBeSorted.get(sorted[x]);
				Patient_AssessmentQuestionVo compare = answersToBeSorted.get(sorted[y]);
					
				if(source.getSequenceIsNotNull() && compare.getSequenceIsNotNull())
				{
					if(source.getSequence().compareTo(compare.getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		Patient_AssessmentQuestionVoCollection sortedAnswers = new Patient_AssessmentQuestionVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedAnswers.add(answersToBeSorted.get(sorted[x]));
		}
		
		return sortedAnswers;
	}
	
	private Assessment_QuestionGroupVoCollection buildExistingGroups(Patient_AssessmentDataVo data) throws PresentationLogicException
	{
		if(data.getAnswerGroups() == null)
			return new Assessment_QuestionGroupVoCollection();
		
		checkDataIntegrity(data);
		
		Assessment_QuestionGroupVoCollection result = new Assessment_QuestionGroupVoCollection();
		
		for(int x = 0; x < data.getAnswerGroups().size(); x++)
		{
			result.add(data.getAnswerGroups().get(x).getAssessmentQuestionGroup());
		}
		
		return result;
	}
	
	public Patient_GraphicAssessmentQuestionAnswerVoCollection get_GraphicAnswers(Patient_GraphicAssessmentQuestionAnswerVoCollection answers)
	{
		if(answers == null)
			answers = new Patient_GraphicAssessmentQuestionAnswerVoCollection();
		
//		//WDEV-11366
//		//Remove answers that are not valid anymore for current patient
//		for (int i = answers.size()-1 ; i >=0 ; i--)
//		{
//			PatientGraphicAssessmentQuestionAnswerVo question = answers.get(i);
//			if (question == null)
//				continue;
//			if (!question.getGraphicQuestionIsNotNull())
//				continue;
//			if (!question.getGraphicQuestion().getQuestionIsNotNull())
//				continue;
//			if (isQuestionInvalidForPatient(question.getGraphicQuestion().getQuestion()))
//				answers.remove(i);
//		}
		
		for(int x = 0; x < this.grid.getRows().size(); x++)
		{
			answers = updateGraphicQuestion(answers, this.grid.getRows().get(x));
		}
		
		return answers;
	}
	
	private Patient_GraphicAssessmentQuestionAnswerVoCollection updateGraphicQuestion(Patient_GraphicAssessmentQuestionAnswerVoCollection answers, DynamicGridRow row)
	{
		if(answers == null)
			answers = new Patient_GraphicAssessmentQuestionAnswerVoCollection();		
		if(row == null || NON_DATA_ROW.equals(row.getIdentifier()))
			return answers;
		
		
		Graphic_AssessmentQuestionVo question = (Graphic_AssessmentQuestionVo)row.getIdentifier();
		Patient_GraphicAssessmentQuestionAnswerVo answer = findOrCreateAnswer(answers, question);
		
		answer.setGraphicQuestion(question);
		answer.setIsMandatory(question.getIsMandatory());
				
		Answer_DetailsVoCollection answerDetails = new Answer_DetailsVoCollection();
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = row.getCells().get(this.grid.getColumns().get(x));
			
			if(cell != null && !cell.getType().equals(DynamicCellType.DYNAMICLABEL) && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof Question_AnswerTypeVo || cell.getIdentifier() instanceof Answer_CellData))
			{										
				answerDetails.add(get_CellAnswer(cell));					
			}			
		}
		
		Patient_AssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		if(patientAnswers == null)
			patientAnswers = new Patient_AssessmentAnswerVoCollection();			
		
		Patient_AssessmentAnswerVo patientAnswer = (Patient_AssessmentAnswerVo)row.getValue();
		if(patientAnswer == null)
			patientAnswer = new Patient_AssessmentAnswerVo();

		if(isFirstAnswer(row))
			patientAnswers.clear();
		
		//PatientAssessmentAnswerVo patientAnswer = new PatientAssessmentAnswerVo();
		patientAnswer.setAnswerDetails(answerDetails);		
		patientAnswers.add(patientAnswer);
		
		answer.setPatientAnswers(patientAnswers);
		answer.setIsAnswered(isAnswered(answer));
		
		answers.add(answer);
		return answers;
	}
	
	private Boolean isAnswered(Patient_GraphicAssessmentQuestionAnswerVo answer)
	{
		if(answer == null || answer.getPatientAnswers() == null)
			return Boolean.FALSE;
		
		for (int i = 0; i < answer.getPatientAnswers().size(); i++)
		{
			if(isAnswered(answer.getPatientAnswers().get(i)))
				return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	private boolean isAnswered(Patient_AssessmentAnswerVo answer)
	{
		if(answer == null || answer.getAnswerDetails() == null)
			return false;		
		if(answer.getAuthoringInfoIsNotNull())
			return true;
		
		for(int x = 0; x < answer.getAnswerDetails().size(); x++)
		{
			if(isAnswered(answer.getAnswerDetails().get(x)))
				return true;
		}
		
		return false;
	}
	
	private boolean isAnswered(Answer_DetailsVo answerDetail)
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
	
	public Answer_DetailsVo get_CellAnswer(DynamicGridCell cell)
	{
		if(cell == null)
			return null;
		
			Answer_DetailsVo answerDetails = null;
			Question_AnswerTypeVo config =  null;
			
			if(cell.getIdentifier() instanceof Answer_CellData)
			{
				answerDetails = ((Answer_CellData)cell.getIdentifier()).getInstData();
				config = ((Answer_CellData)cell.getIdentifier()).getConfigData();
			}
			else if(cell.getIdentifier() instanceof Question_AnswerTypeVo)
			{
				config = (Question_AnswerTypeVo)cell.getIdentifier();
			}
			
			if(answerDetails == null)
				answerDetails = new Answer_DetailsVo();
			
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
			answerDetails.setPicklist((Answer_OptionVo)cell.getValue());
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
			answerDetails.setMultiSelectAnswers(get_CellMultiAnswer(cell));
		}
		
		return answerDetails;
	}
	
	private Answer_OptionVoCollection get_CellMultiAnswer(DynamicGridCell cell)
	{
		if(!cell.getType().equals(DynamicCellType.MULTISELECT))
			throw new CodingRuntimeException("Multiple answer should be collected only for multiselect cells");
		
		Answer_OptionVoCollection result = new Answer_OptionVoCollection();
		
		for(int x = 0; x < cell.getItems().size(); x++)
		{
			if(cell.getItems().get(x).isChecked())
			{
				result.add((Answer_OptionVo)cell.getItems().get(x).getIdentifier());
			}
		}
		
		return result;
	}
	
	private Patient_GraphicAssessmentQuestionAnswerVo findOrCreateAnswer(Patient_GraphicAssessmentQuestionAnswerVoCollection answers, Graphic_AssessmentQuestionVo question)
	{
		if(answers == null || question == null)
			return new Patient_GraphicAssessmentQuestionAnswerVo();
		
		for(int x = 0; x < answers.size(); x++)
		{
			Patient_GraphicAssessmentQuestionAnswerVo answer = answers.get(x);
			if(answer != null 
					&& answer.getGraphicQuestionIsNotNull()
					&& answer.getGraphicQuestion().equals(question))
			{
				return answer;
			}
		}
		
		return new Patient_GraphicAssessmentQuestionAnswerVo();
	}
	
	public void populateGraphicFinding(Patient_AssessmentVo data, Patient_GraphicAssessmentFindingVo voGraphicAssessmentFinding) throws PresentationLogicException
	{
		checkDataIntegrity(voGraphicAssessmentFinding);
		prepareGraphicGrid(isCompleted(data.getStatus()));
		populateGraphicFindingQuestions(voGraphicAssessmentFinding);
		setAnswersGraphicFindings(voGraphicAssessmentFinding.getStage());
	}
	
	private void setAnswersGraphicFindings(Patient_GraphicalAssessmentStageVoCollection stages)
	{
		if(stages == null || stages.size() <= 0)
			return;

		//we need annotated stage
		Patient_GraphicalAssessmentStageVo annotatedStage = null;
		for (int i = 0; i < stages.size(); i++)
		{
			Patient_GraphicalAssessmentStageVo stage = stages.get(i);
			
			if(stage.getStageIsNotNull() 
					&& stage.getStage().getAssessmentStageIsNotNull() 
					&& stage.getStage().getAssessmentStage().getIsAnnotatedIsNotNull()
					&& stage.getStage().getAssessmentStage().getIsAnnotated().booleanValue())
			{
				annotatedStage = stage;
				break;
			}
		}
		
		if(annotatedStage == null)
		{
			//we should always have an annotated stage
			annotatedStage = stages.get(0);
		}
		//else
		{
			if(annotatedStage.getFindingQuestionIsNotNull())
			{
				for(int x = 0; x < annotatedStage.getFindingQuestion().size(); x++)
				{
					Patient_GraphicAssessmentFindingQuestionAnswerVo answerGraphicFinding = annotatedStage.getFindingQuestion().get(x);
					setQuestionFindingRowAnswer(answerGraphicFinding);
				}
			}
		}
	}
	
	private boolean setQuestionFindingRowAnswer(Patient_GraphicAssessmentFindingQuestionAnswerVo graphicAnswer)
	{
		if(graphicAnswer == null || graphicAnswer.getPatientAnswers() == null)
			return false;
		
		DynamicGridRow initialQuestionRow = null;
		DynamicGridRow questionRow = getRowByIdentifier(graphicAnswer);		
		if(questionRow == null)
			return false;
		
		for(int i = 0; i < graphicAnswer.getPatientAnswers().size(); i++)
		{
			Patient_AssessmentAnswerVo answerDetail = graphicAnswer.getPatientAnswers().get(i);
		
			if(answerDetail != null)
			{
				if(i > 0)
				{
					if(initialQuestionRow == null)
						initialQuestionRow = questionRow;
					
					questionRow = duplicate_QuestionRow(initialQuestionRow);
				}
				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{
					Answer_DetailsVo answer = answerDetail.getAnswerDetails().get(x);
					DynamicGridCell cell = findCell(questionRow, answer.getAnswerType());
					
					if(cell != null)
					{
						if (x == 0)
							cell.getRow().setValue(answerDetail);
						
						setCellAnswer(cell, answer);
					}
				}
			}
		}
		
		return true;
	}
	
	private DynamicGridRow getRowByIdentifier(Patient_GraphicAssessmentFindingQuestionAnswerVo graphicFindingQuestionAnswer)
	{
		if(graphicFindingQuestionAnswer == null)
			return null;

		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			Patient_GraphicAssessmentFindingQuestionAnswerVo findingAnswer = (Patient_GraphicAssessmentFindingQuestionAnswerVo)(this.grid.getRows().get(x).getCells().get(this.grid.getColumns().getByIdentifier(QUESTION_COLUMN)).getIdentifier());
			if(graphicFindingQuestionAnswer.equals(findingAnswer))
				return this.grid.getRows().get(x);
		}
		
		return null;
	}
	
	private void populateGraphicFindingQuestions(Patient_GraphicAssessmentFindingVo voGraphicAssessmentFinding) throws PresentationLogicException 
	{
		if(voGraphicAssessmentFinding.getStage() == null || voGraphicAssessmentFinding.getStage().size() == 0)
			return;
		
		Patient_GraphicalAssessmentStageVo annotatedStage = null;
		
		if(voGraphicAssessmentFinding.getStage().size() == 1)
			annotatedStage = voGraphicAssessmentFinding.getStage().get(0);
		else
		{
			for (int i = 0; i < voGraphicAssessmentFinding.getStage().size(); i++)
			{
				if(voGraphicAssessmentFinding.getStage().get(i).getStageIsNotNull() 
						&& voGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStageIsNotNull() 
						&& voGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotatedIsNotNull()
						&& voGraphicAssessmentFinding.getStage().get(i).getStage().getAssessmentStage().getIsAnnotated().booleanValue())
				{
					annotatedStage = voGraphicAssessmentFinding.getStage().get(i);
					break;
				}
			}
		}
		
		if(annotatedStage == null)
			return;
		
		Patient_GraphicAssessmentFindingQuestionAnswerVoCollection voColl = null;
		for(int i = 0; i < annotatedStage.getFindingQuestion().size(); i++)
		{
			if(voColl == null)
				voColl = new Patient_GraphicAssessmentFindingQuestionAnswerVoCollection();
			if (isQuestionInvalidForPatient(annotatedStage.getFindingQuestion().get(i).getGraphicFindingQuestion().getQuestion()))
				continue;
			voColl.add(annotatedStage.getFindingQuestion().get(i));
		}
		
		voColl = sortGraphicQuestionsByIndex(voColl);
		for (int i = 0; i < voColl.size(); i++)
		{
			addGraphicQuestionRow(voColl.get(i).getGraphicFindingQuestion(), voColl.get(i), allowMultipleAnswers(voColl.get(i).getGraphicFindingQuestion()));			
		}
	}
	
	private void addGraphicQuestionRow(Graphic_AssessmentFindingQuestionVo question, Patient_GraphicAssessmentFindingQuestionAnswerVo voPatientGraphicAssessmentFindingQuestionAnswer, boolean allowMultipleQuestion)  throws PresentationLogicException
	{
		DynamicGridColumn questionColumn = this.grid.getColumns().getByIdentifier(QUESTION_COLUMN);
		DynamicGridColumn buttonColumn = this.grid.getColumns().getByIdentifier(BUTTON_COLUMN);
	
		checkDataIntegrity(question);
		
		addGraphicQuestionLegend(question.getQuestion().getLegendText());
		
		DynamicGridRow row = this.grid.getRows().newRow();
		
		Image rowQuestionImage = this.questionImage;
		if(question.getIsMandatoryIsNotNull() && question.getIsMandatory().booleanValue())
			rowQuestionImage = this.mandatoryQuestionImage;
		
		DynamicGridColumn imageColumn = this.grid.getColumns().getByIdentifier(IMAGE_COLUMN);
		if(imageColumn != null)
		{
			row.getCells().newCell(imageColumn, DynamicCellType.IMAGE).setValue(rowQuestionImage);				
		}
		
		row.setIdentifier(question);
		row.setExpandedImage(rowQuestionImage);
		row.setCollapsedImage(rowQuestionImage);
		
		if(buttonColumn != null && allowMultipleQuestion)
		{
			DynamicGridCell buttonCell = row.getCells().newCell(buttonColumn, DynamicCellType.IMAGEBUTTON);			
			buttonCell.setTooltip("Create new answer for this question");
			buttonCell.setValue(this.buttonAddImage);
			buttonCell.setIdentifier(BUTTON_ADD_ANSWER);			
			buttonColumn.setWidth(DEFAULT_BUTTON_CELL_WIDTH);
		}

		DynamicGridCell questionCell = row.getCells().newCell(questionColumn, DynamicCellType.WRAPTEXT);		
		questionCell.setValue(question.getQuestion().getShortText());
		questionCell.setTooltip(question.getQuestion().getText());			
		questionCell.setReadOnly(true);	
		
		questionCell.setIdentifier(voPatientGraphicAssessmentFindingQuestionAnswer);
		
		if(question.getQuestion().getAnswerTypesIsNotNull())
		{
			for(int x = 0; x < question.getQuestion().getAnswerTypes().size(); x++)
			{
				if(question.getQuestion().getAnswerTypes().get(x).getActiveStatusIsNotNull() 
					&& question.getQuestion().getAnswerTypes().get(x).getActiveStatus().booleanValue())
				{
					addAnswerCell(row, getAnswerColumn(x), question.getQuestion().getAnswerTypes().get(x), getInstAnswerType(voPatientGraphicAssessmentFindingQuestionAnswer.getPatientAnswers(), question.getQuestion().getAnswerTypes().get(x)));
				}
			}
		}
	}
	
	private void checkDataIntegrity(Graphic_AssessmentFindingQuestionVo voGraphicAssessmentFinding) throws PresentationLogicException
	{
		if(voGraphicAssessmentFinding == null)
			throw new PresentationLogicException("Invalid graphic assessment finding question data");
		
		if(voGraphicAssessmentFinding.getQuestion() == null)
			throw new PresentationLogicException("Invalid graphic assessment finding question");
	}
	
	private boolean allowMultipleAnswers(Graphic_AssessmentFindingQuestionVo graphicFindingQuestion)
	{
		if(graphicFindingQuestion != null)
		{
			return graphicFindingQuestion.getAllowsMultipleAnswersIsNotNull() && graphicFindingQuestion.getAllowsMultipleAnswers().booleanValue();
		}
		return false;
	}
	
	private void checkDataIntegrity(Patient_GraphicAssessmentFindingVo voGraphicAssessmentFinding)  throws PresentationLogicException
	{
		if(voGraphicAssessmentFinding == null)
			throw new PresentationLogicException("Invalid patient graphic assessment finding data");
	
		if(voGraphicAssessmentFinding.getStage() == null || voGraphicAssessmentFinding.getStage().size() == 0 || voGraphicAssessmentFinding.getStage().get(0).getFindingQuestion() == null)
			throw new PresentationLogicException("Invalid patient graphic assessment finding question data");
	}
	
	private Patient_GraphicAssessmentFindingQuestionAnswerVoCollection sortGraphicQuestionsByIndex(Patient_GraphicAssessmentFindingQuestionAnswerVoCollection questionsToBeSorted)
	{
		if(questionsToBeSorted == null)
			return new Patient_GraphicAssessmentFindingQuestionAnswerVoCollection();
	
		int size = questionsToBeSorted.size();
		int[] sorted = new int[size];
		for(int x = 0; x < size; x++)
		{
			sorted[x] = x;
		}
		
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y < size; y++)
			{
				Patient_GraphicAssessmentFindingQuestionAnswerVo source = questionsToBeSorted.get(sorted[x]);
				Patient_GraphicAssessmentFindingQuestionAnswerVo compare = questionsToBeSorted.get(sorted[y]);
					
				if(source.getGraphicFindingQuestionIsNotNull() && compare.getGraphicFindingQuestionIsNotNull())
				{
					if(source.getGraphicFindingQuestion().getSequenceIsNotNull())
					if(source.getGraphicFindingQuestion().getSequence().compareTo(compare.getGraphicFindingQuestion().getSequence()) < 0)
					{
						int temp = sorted[x]; 
						sorted[x] = sorted[y];
						sorted[y] = temp;	
					}
				}
			}
		}
		
		Patient_GraphicAssessmentFindingQuestionAnswerVoCollection sortedQuestions = new Patient_GraphicAssessmentFindingQuestionAnswerVoCollection();
		for(int x = 0; x < size; x++)
		{
			sortedQuestions.add(questionsToBeSorted.get(sorted[x]));
		}
		
		return sortedQuestions;
	}
	
	public Patient_GraphicAssessmentFindingQuestionAnswerVoCollection get_GraphicFindingAnswers(Patient_GraphicAssessmentFindingQuestionAnswerVoCollection answers)
	{
		if(answers == null)
			answers = new Patient_GraphicAssessmentFindingQuestionAnswerVoCollection(); 

		for(int x = 0; x < this.grid.getRows().size(); x++)
		{	
			answers = updateGraphicFindingQuestion(answers, this.grid.getRows().get(x));
		}
		
		return answers;
	}
	
	private Patient_GraphicAssessmentFindingQuestionAnswerVoCollection updateGraphicFindingQuestion(Patient_GraphicAssessmentFindingQuestionAnswerVoCollection answers, DynamicGridRow row)
	{
		if(answers == null)
			answers = new Patient_GraphicAssessmentFindingQuestionAnswerVoCollection();		
		if(row == null || NON_DATA_ROW.equals(row.getIdentifier()))
			return answers;
		
		Graphic_AssessmentFindingQuestionVo question = (Graphic_AssessmentFindingQuestionVo)row.getIdentifier();
		Patient_GraphicAssessmentFindingQuestionAnswerVo answer = findOrCreateAnswer(answers, question);
		
		answer.setGraphicFindingQuestion(question);
		answer.setIsMandatory(question.getIsMandatory());
				
		Answer_DetailsVoCollection answerDetails = new Answer_DetailsVoCollection();
		
		for(int x = 0; x < this.grid.getColumns().size(); x++)
		{
			DynamicGridCell cell = row.getCells().get(this.grid.getColumns().get(x));
			
			//we save the separators as well
			//if(cell != null && !cell.getType().equals(DynamicCellType.DYNAMICLABEL) && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && cell.getIdentifier() instanceof QuestionAnswerTypeVo)
			if(cell != null && !cell.getType().equals(DynamicCellType.EMPTY) && cell.getIdentifier() != null && (cell.getIdentifier() instanceof Question_AnswerTypeVo || cell.getIdentifier() instanceof Answer_CellData))
			{										
				answerDetails.add(get_CellAnswer(cell));					
			}			
		}
		
		Patient_AssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		if(patientAnswers == null)
			patientAnswers = new Patient_AssessmentAnswerVoCollection();
		else if(isFirstAnswer(row))
			patientAnswers.clear();
		
		Patient_AssessmentAnswerVo patientAnswer = (Patient_AssessmentAnswerVo)row.getValue();
		if(patientAnswer == null)
			patientAnswer = new Patient_AssessmentAnswerVo();
		
		patientAnswer.setAnswerDetails(answerDetails);		
		patientAnswers.add(patientAnswer);
		
		answer.setPatientAnswers(patientAnswers);	
		answer.setIsAnswered(isAnswered(answer));
		answers.add(answer);
		return answers;
	}
	
	private Patient_GraphicAssessmentFindingQuestionAnswerVo findOrCreateAnswer(Patient_GraphicAssessmentFindingQuestionAnswerVoCollection answers, Graphic_AssessmentFindingQuestionVo question)
	{
		if(answers == null || question == null)
			return new Patient_GraphicAssessmentFindingQuestionAnswerVo();
		
		for(int x = 0; x < answers.size(); x++)
		{
			Patient_GraphicAssessmentFindingQuestionAnswerVo answer = answers.get(x);
			if(answer != null 
					&& answer.getGraphicFindingQuestionIsNotNull()
					&& answer.getGraphicFindingQuestion().equals(question))
			{
				return answer;
			}
		}
		
		return new Patient_GraphicAssessmentFindingQuestionAnswerVo();
	}
	
	private Boolean isAnswered(Patient_GraphicAssessmentFindingQuestionAnswerVo answer)
	{
		if(answer == null || answer.getPatientAnswers() == null)
			return Boolean.FALSE;
		
		for (int i = 0; i < answer.getPatientAnswers().size(); i++)
		{
			if(isAnswered(answer.getPatientAnswers().get(i)))
				return Boolean.TRUE;
		}
			
		return Boolean.FALSE;
	}
	
	public void add_OrRemoveAnswer(DynamicGridCell initiatorCell)
	{
		if(initiatorCell == null || initiatorCell.getIdentifier() == null)
			return;
		if(!initiatorCell.getIdentifier().equals(BUTTON_ADD_ANSWER) 
				&& !initiatorCell.getIdentifier().equals(BUTTON_REMOVE_ANSWER))
			return;
		
		checkDataIntegrity(initiatorCell.getRow());
		
		if(initiatorCell.getIdentifier().equals(BUTTON_REMOVE_ANSWER))
		{
			if(initiatorCell.getRow().getParent() != null)
				initiatorCell.getRow().getParent().getRows().remove(initiatorCell.getRow());
			else
				this.grid.getRows().remove(initiatorCell.getRow());
		}
		else
		{			
			duplicate_QuestionRow(initiatorCell.getRow());
		}			
	}
	
	public String[] validateAllGraphicQuestions(Patient_AssessmentDataVo voPatientAssessmentData)
	{
		ArrayList errors = new ArrayList();
		if(voPatientAssessmentData == null)
			return null;
		
		//Graphic Questions
		if(voPatientAssessmentData.getGraphicQuestionIsNotNull())
		{
			for (int i = 0; i < voPatientAssessmentData.getGraphicQuestion().size(); i++)
			{

				errors = validateGraphicAnswer(voPatientAssessmentData.getGraphicQuestion().get(i), errors);
			}
		}
		
		//Graphic Finding Questions
		if(voPatientAssessmentData.getGraphicFindingsIsNotNull())
		{
			for (int i = 0; i < voPatientAssessmentData.getGraphicFindings().size(); i++)
			{
				Patient_GraphicAssessmentFindingVoCollection voGraphicAssessFindingColl = voPatientAssessmentData.getGraphicFindings().get(i).getPatientGraphicFinding();
				if(voGraphicAssessFindingColl == null)
					continue;
					
				for (int j = 0; j < voGraphicAssessFindingColl.size(); j++)
				{
					Patient_GraphicalAssessmentStageVoCollection stages = voGraphicAssessFindingColl.get(j).getStage();
					if(stages != null)
					{
						for (int k = 0; k < stages.size(); k++)
						{
							Patient_GraphicAssessmentFindingQuestionAnswerVoCollection findingQuestionsColl = stages.get(k).getFindingQuestion();
							if(findingQuestionsColl != null)
							{
								for (int l = 0; l < findingQuestionsColl.size(); l++)
								{
									errors = validateGraphicFindingAnswer(findingQuestionsColl.get(l), errors);						
								}
							}
						}
					}
				}
			}
		}
		if(errors.size() > 0)
		{
			String[] result = new String[errors.size()];
			errors.toArray(result);
			return result;
		}
		return null;
	}
	
	private ArrayList validateGraphicFindingAnswer(Patient_GraphicAssessmentFindingQuestionAnswerVo answer, ArrayList errors)
	{
		if(errors == null)
			errors = new ArrayList();	
	
		if(answer == null || answer.getGraphicFindingQuestion() == null || answer.getPatientAnswers() == null)
			return errors;
		
		Question_InformationVo question = answer.getGraphicFindingQuestion().getQuestion();
		Patient_AssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		Boolean isMandatory = answer.getIsMandatory();
		
		validateAllAnswers(errors, question, patientAnswers, isMandatory);
		return errors;
	}
	
	private ArrayList validateGraphicAnswer(Patient_GraphicAssessmentQuestionAnswerVo answer, ArrayList errors)
	{
		if(errors == null)
			errors = new ArrayList();	
		
		if(answer == null || answer.getGraphicQuestion() == null || answer.getPatientAnswers() == null)
			return errors;
		
		Question_InformationVo question = answer.getGraphicQuestion().getQuestion();
		if (isQuestionInvalidForPatient(question))
			return errors;
		Patient_AssessmentAnswerVoCollection patientAnswers = answer.getPatientAnswers();
		Boolean isMandatory = answer.getIsMandatory();
		
		validateAllAnswers(errors, question, patientAnswers, isMandatory);

		return errors;
	}
	
	private void validateAllAnswers(ArrayList errors, Question_InformationVo question, Patient_AssessmentAnswerVoCollection patientAnswers, Boolean isMandatory)
	{
		if(isMandatory != null && isMandatory.booleanValue())
		{
			boolean questionWasAnswered = true;
			if(patientAnswers != null && patientAnswers.size() > 0)
			{
				for(int i = 0; i < patientAnswers.size(); i++)
				{
					questionWasAnswered = false;						
					Patient_AssessmentAnswerVo answerDetail = patientAnswers.get(i);
										
					if(answerDetail != null)
					{
						for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
						{								
							if(wasAnswered(answerDetail.getAnswerDetails().get(x)))
								questionWasAnswered = true;
						}
					}
					
					if(!questionWasAnswered)
					{
						errors.add("The question '" + question.getShortText() + "' is mandatory.");
					}
				}		
			}
			else
			{
				errors.add("The question '" + question.getShortText() + "' is mandatory.");
			}					
		}
		
		boolean anyAnswered = false;
		ArrayList indecidedErrors = new ArrayList();
		if(patientAnswers != null && patientAnswers.size() > 0)
		{
			for(int i = 0; i < patientAnswers.size(); i++)
			{
				Patient_AssessmentAnswerVo answerDetail = patientAnswers.get(i);				
				for(int x = 0; x < answerDetail.getAnswerDetails().size(); x++)
				{		
					if(answerDetail.getAnswerDetails().get(x).getAnswerTypeIsNotNull() 
							&& answerDetail.getAnswerDetails().get(x).getAnswerType().getIsMandatoryIsNotNull())
					{						
						if(answerDetail.getAnswerDetails().get(x).getAnswerType().getIsMandatory().booleanValue())
						{
							if(!wasAnswered(answerDetail.getAnswerDetails().get(x)))
							{
								String posNo = String.valueOf(x + 1);
								if(x == 0)
									posNo += "st";
								else if(x == 1)
									posNo += "nd";
								else if(x == 2)
									posNo += "rd";
								else
									posNo += "th";
								
								String validationMessage = answerDetail.getAnswerDetails().get(x).getAnswerType().getMandatoryValMessage();
								if(validationMessage != null && validationMessage.trim().length() > 0)
									indecidedErrors.add(validationMessage);
								else									
									indecidedErrors.add("The " + posNo + " answer detail for the question '" + question.getShortText() + "' answer number " + i + " is mandatory.");
							}
							else
							{
								anyAnswered = true;
							}
						}
						else
						{
							if(wasAnswered(answerDetail.getAnswerDetails().get(x)))
								anyAnswered = true;
						}
					}
				}
			}
		}
		if(anyAnswered)
		{
			for(int x = 0; x < indecidedErrors.size(); x++)
			{
				errors.add(indecidedErrors.get(x));
			}
		}
	}
	
	private boolean wasAnswered(Answer_DetailsVo answerDetails)
	{
		if(answerDetails == null || answerDetails.getAnswerType() == null)
			return false;
		
		if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.DATE))
		{
			return answerDetails.getDateAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.DECIMAL))
		{
			return answerDetails.getDecimalAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.INTEGER))
		{
			return answerDetails.getIntegerAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT))
		{
			return answerDetails.getMultiSelectAnswersIsNotNull() && answerDetails.getMultiSelectAnswers().size() > 0;	//WDEV-11137
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PARTIALDATE))
		{
			return answerDetails.getPartialDateIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.PICKLIST))
		{
			return answerDetails.getPicklistIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.SEPARATOR))
		{
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.TEXT))
		{
			if(answerDetails.getStringAnswer() == null)
				return false;
			else
				return answerDetails.getStringAnswer().trim().length() > 0;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.TIME))
		{
			return answerDetails.getTimeAnswerIsNotNull();
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(ims.core.vo.lookups.QuestionAnswerType.YESNO))
		{
			return answerDetails.getBoolValueAnswerIsNotNull();
		}
		
		return false;
	}
	
	//WDEV-12215 - ends here
	
	public class AnswerCellData
	{
		QuestionAnswerTypeVo		configData;
		AnswerDetailsVo				instData;

		public AnswerCellData(QuestionAnswerTypeVo configData, AnswerDetailsVo instData)
		{
			this.configData = configData;
			this.instData = instData;
		}

		public QuestionAnswerTypeVo getConfigData()
		{
			return configData;
		}

		public AnswerDetailsVo getInstData()
		{
			return instData;
		}
	}
	
	public class Answer_CellData
	{
		Question_AnswerTypeVo		configData;
		Answer_DetailsVo				instData;

		public Answer_CellData(Question_AnswerTypeVo configData, Answer_DetailsVo instData)
		{
			this.configData = configData;
			this.instData = instData;
		}

		public Question_AnswerTypeVo getConfigData()
		{
			return configData;
		}

		public Answer_DetailsVo getInstData()
		{
			return instData;
		}
	}
	
	public class GroupRowData
	{
		AssessmentQuestionGroupVo	configGroup;
		PatientAssessmentGroupVo	instGroup;

		public GroupRowData(AssessmentQuestionGroupVo configGroup, PatientAssessmentGroupVo instGroup)
		{
			this.configGroup = configGroup;
			this.instGroup = instGroup;
		}

		public AssessmentQuestionGroupVo getConfigGroup()
		{
			return configGroup;
		}

		public PatientAssessmentGroupVo getInstGroup()
		{
			return instGroup;
		}
	}
	
	//	WDEV-12215
	public class Group_RowData
	{
		Assessment_QuestionGroupVo	configGroup;
		Patient_AssessmentGroupVo	instGroup;

		public Group_RowData(Assessment_QuestionGroupVo configGroup, Patient_AssessmentGroupVo instGroup)
		{
			this.configGroup = configGroup;
			this.instGroup = instGroup;
		}

		public Assessment_QuestionGroupVo getConfigGroup()
		{
			return configGroup;
		}

		public Patient_AssessmentGroupVo getInstGroup()
		{
			return instGroup;
		}
	}
}
