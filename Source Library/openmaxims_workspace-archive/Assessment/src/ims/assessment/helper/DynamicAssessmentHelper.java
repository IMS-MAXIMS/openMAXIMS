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

import ims.assessment.vo.Answer_DetailsVo;
import ims.assessment.vo.Answer_OptionVo;
import ims.assessment.vo.PatientAssessmentAnswerVo;
import ims.assessment.vo.PatientAssessmentGroupVo;
import ims.assessment.vo.PatientAssessmentQuestionVo;
import ims.assessment.vo.PatientAssessmentVo;
import ims.assessment.vo.PatientGraphicAssessmentFindingQuestionAnswerVo;
import ims.assessment.vo.PatientGraphicAssessmentFindingVo;
import ims.assessment.vo.PatientGraphicAssessmentQuestionAnswerVo;
import ims.assessment.vo.PatientGraphicAssessmentVo;
import ims.assessment.vo.PatientGraphicalAssessmentStageVo;
import ims.assessment.vo.Patient_AssessmentAnswerVo;
import ims.assessment.vo.Patient_AssessmentGroupVo;
import ims.assessment.vo.Patient_AssessmentQuestionVo;
import ims.assessment.vo.Patient_AssessmentVo;
import ims.assessment.vo.Patient_GraphicAssessmentFindingQuestionAnswerVo;
import ims.assessment.vo.Patient_GraphicAssessmentFindingVo;
import ims.assessment.vo.Patient_GraphicAssessmentQuestionAnswerVo;
import ims.assessment.vo.Patient_GraphicAssessmentVo;
import ims.assessment.vo.Patient_GraphicalAssessmentStageVo;
import ims.assessment.vo.lookups.AnswerStatus;
import ims.core.vo.AnswerDetailsVo;
import ims.core.vo.AnswerOptionVo;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.lookups.QuestionAnswerType;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;

public class DynamicAssessmentHelper 
{
	public static PatientAssessmentVo populateHCPDataForAnswers(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, HcpLiteVo hcp, DateTime dateTime)
	{
		AuthoringInformationVo author = new AuthoringInformationVo();
		author.setAuthoringHcp(hcp);
		author.setAuthoringDateTime(dateTime);
		return populateHCPDataForAnswers(initialData, updatedData, author);
	}
	
	//WDEV-12215
	public static Patient_AssessmentVo populateHCPDataForAnswers(Patient_AssessmentVo initialData, Patient_AssessmentVo updatedData, HcpLiteVo hcp, DateTime dateTime)
	{
		AuthoringInformationVo author = new AuthoringInformationVo();
		author.setAuthoringHcp(hcp);
		author.setAuthoringDateTime(dateTime);
		return populateHCPDataForAnswers(initialData, updatedData, author);
	}
	
	public static PatientAssessmentVo populateHCPDataForAnswers(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, AuthoringInformationVo author)
	{
		if(updatedData == null || updatedData.getAssessmentData() == null)
			throw new CodingRuntimeException("Invalid assessment data to update");		
		
		
		// Answer Groups
		if(updatedData.getAssessmentData().getAnswerGroups() != null)
		{
			populateHCPDataForAnswerGroups(initialData, updatedData, author);
		}

		//Associated Graphic Questions
		if(updatedData.getAssessmentData().getGraphicQuestion() != null)
		{
			populateHCPDataForGraphicQuestions(initialData, updatedData, author);
		}
		
		// Findings
		if(updatedData.getAssessmentData().getGraphicFindings() != null)
		{
			populateHCPDataForGraphicFindings(initialData, updatedData, author);
		}
		
		return updatedData;
	}
	
	//WDEV-12215
	public static Patient_AssessmentVo populateHCPDataForAnswers(Patient_AssessmentVo initialData, Patient_AssessmentVo updatedData, AuthoringInformationVo author)
	{
		if(updatedData == null || updatedData.getAssessmentData() == null)
			throw new CodingRuntimeException("Invalid assessment data to update");		
		
		
		// Answer Groups
		if(updatedData.getAssessmentData().getAnswerGroups() != null)
		{
			populateHCPDataForAnswerGroups(initialData, updatedData, author);
		}

		//Associated Graphic Questions
		if(updatedData.getAssessmentData().getGraphicQuestion() != null)
		{
			populateHCPDataForGraphicQuestions(initialData, updatedData, author);
		}
		
		// Findings
		if(updatedData.getAssessmentData().getGraphicFindings() != null)
		{
			populateHCPDataForGraphicFindings(initialData, updatedData, author);
		}
		
		return updatedData;
	}
	
	public static PatientAssessmentVo populateConfirmingHCPDataForAnswers(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, HcpLiteVo hcp, DateTime dateTime)
	{
		AuthoringInformationVo author = new AuthoringInformationVo();
		author.setAuthoringHcp(hcp);
		author.setAuthoringDateTime(dateTime);
		return populateConfirmingHCPDataForAnswers(initialData, updatedData, author);
	}
	public static PatientAssessmentVo populateConfirmingHCPDataForAnswers(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, AuthoringInformationVo author)
	{
		if(updatedData == null || updatedData.getAssessmentData() == null)
			throw new CodingRuntimeException("Invalid assessment data to update");		
		
		
		// Answer Groups
		if(updatedData.getAssessmentData().getAnswerGroups() != null)
		{
			populateConfirmingDataForAnswerGroups(initialData, updatedData, author);
		}

		return updatedData;
	}
	
	private static void populateConfirmingDataForAnswerGroups(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, AuthoringInformationVo author)
	{
		int answerGroups = updatedData.getAssessmentData().getAnswerGroups().size();
		
		for(int x = 0; x < answerGroups; x++)
		{
			PatientAssessmentGroupVo answerGroup = updatedData.getAssessmentData().getAnswerGroups().get(x);
			if(answerGroup != null && answerGroup.getAssessmentAnswers() != null)
			{
				int assessmentAnswers = answerGroup.getAssessmentAnswers().size();
				
				for(int y = 0; y < assessmentAnswers; y++)
				{
					PatientAssessmentQuestionVo answer = answerGroup.getAssessmentAnswers().get(y);
					
					if(answer != null && answer.getPatientAnswersIsNotNull())
					{
						boolean isAnswered 	    = answer.getIsAnswered() != null && answer.getIsAnswered().equals(AnswerStatus.ANSWERED);
						boolean isToBeFonfirmed = answer.getIsConfirmedIsNotNull() && answer.getIsConfirmed().booleanValue();
						
						if(isAnswered && isToBeFonfirmed)
						{
							int patientAnswers = answer.getPatientAnswers().size();
							
							for(int z = 0; z < patientAnswers; z++)
							{
								PatientAssessmentAnswerVo patientAnswer = answer.getPatientAnswers().get(z);
								
								if(patientAnswer != null)
								{
									//No Confirming info or Answer changed 
									if(patientAnswer.getConfirmingInfo() == null || answerChanged(findAnswer(initialData, patientAnswer.getID_PatientAssessmentAnswer()), patientAnswer))
										patientAnswer.setConfirmingInfo(author);
								}
							}
						}
					}
				}
			}
		}
		
	}
	private static void populateHCPDataForAnswerGroups(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, AuthoringInformationVo author) 
	{
		int answerGroups = updatedData.getAssessmentData().getAnswerGroups().size();
		
		for(int x = 0; x < answerGroups; x++)
		{
			PatientAssessmentGroupVo answerGroup = updatedData.getAssessmentData().getAnswerGroups().get(x);
			if(answerGroup != null && answerGroup.getAssessmentAnswers() != null)
			{
				int assessmentAnswers = answerGroup.getAssessmentAnswers().size();
				
				for(int y = 0; y < assessmentAnswers; y++)
				{
					PatientAssessmentQuestionVo answer = answerGroup.getAssessmentAnswers().get(y);
					
					if(answer != null && answer.getPatientAnswers() != null && answer.getIsAnswered() != null && answer.getIsAnswered().equals(AnswerStatus.ANSWERED))
					{
						int patientAnswers = answer.getPatientAnswers().size();
						
						for(int z = 0; z < patientAnswers; z++)
						{
							PatientAssessmentAnswerVo patientAnswer = answer.getPatientAnswers().get(z);
							
							if(patientAnswer != null)
							{
								populateHCPDataForPatientAnswer(initialData, patientAnswer, author);
							}
						}
					}
				}
			}
		}
	}
	
	//WDEV-12215
	private static void populateHCPDataForAnswerGroups(Patient_AssessmentVo initialData, Patient_AssessmentVo updatedData, AuthoringInformationVo author) 
	{
		int answerGroups = updatedData.getAssessmentData().getAnswerGroups().size();
		
		for(int x = 0; x < answerGroups; x++)
		{
			Patient_AssessmentGroupVo answerGroup = updatedData.getAssessmentData().getAnswerGroups().get(x);
			if(answerGroup != null && answerGroup.getAssessmentAnswers() != null)
			{
				int assessmentAnswers = answerGroup.getAssessmentAnswers().size();
				
				for(int y = 0; y < assessmentAnswers; y++)
				{
					Patient_AssessmentQuestionVo answer = answerGroup.getAssessmentAnswers().get(y);
					
					if(answer != null && answer.getPatientAnswers() != null && answer.getIsAnswered() != null && answer.getIsAnswered().equals(AnswerStatus.ANSWERED))
					{
						int patientAnswers = answer.getPatientAnswers().size();
						
						for(int z = 0; z < patientAnswers; z++)
						{
							Patient_AssessmentAnswerVo patientAnswer = answer.getPatientAnswers().get(z);
							
							if(patientAnswer != null)
							{
								populateHCPDataForPatientAnswer(initialData, patientAnswer, author);
							}
						}
					}
				}
			}
		}
	}
	private static void populateHCPDataForPatientAnswer(PatientAssessmentVo initialData, PatientAssessmentAnswerVo patientAnswer, AuthoringInformationVo author) 
	{
		if(shouldUpdateAuthoringInformation(initialData, patientAnswer))
			patientAnswer.setAuthoringInfo(author);			
	}
	
	//WDEV-12215
	private static void populateHCPDataForPatientAnswer(Patient_AssessmentVo initialData, Patient_AssessmentAnswerVo patientAnswer, AuthoringInformationVo author) 
	{
		if(shouldUpdateAuthoringInformation(initialData, patientAnswer))
			patientAnswer.setAuthoringInfo(author);			
	}
	
	private static boolean shouldUpdateAuthoringInformation(PatientAssessmentVo initialData, PatientAssessmentAnswerVo patientAnswer) 
	{
		if(patientAnswer.getAuthoringInfo() == null)
			return true;
				
		return answerChanged(findAnswer(initialData, patientAnswer.getID_PatientAssessmentAnswer()), patientAnswer);
	}
	
	//WDEV-12215
	private static boolean shouldUpdateAuthoringInformation(Patient_AssessmentVo initialData, Patient_AssessmentAnswerVo patientAnswer) 
	{
		if(patientAnswer.getAuthoringInfo() == null)
			return true;
				
		return answerChanged(findAnswer(initialData, patientAnswer.getID_PatientAssessmentAnswer()), patientAnswer);
	}	
	
	private static PatientAssessmentAnswerVo findAnswer(PatientAssessmentVo initialData, Integer id) 
	{
		if(initialData == null || 
				initialData.getAssessmentData() == null ||
				initialData.getAssessmentData().getAnswerGroups() == null ||
				id == null)
			return null;
		
		int answerGroups = initialData.getAssessmentData().getAnswerGroups().size();
		
		for(int x = 0; x < answerGroups; x++)
		{
			PatientAssessmentGroupVo answerGroup = initialData.getAssessmentData().getAnswerGroups().get(x);
			if(answerGroup != null)
			{
				if(answerGroup.getAssessmentAnswers() != null)
				{
					int assessmentAnswers = answerGroup.getAssessmentAnswers().size();
					
					for(int y = 0; y < assessmentAnswers; y++)
					{
						PatientAssessmentQuestionVo assessmentAnswer = answerGroup.getAssessmentAnswers().get(y);
						
						if(assessmentAnswer != null && assessmentAnswer.getPatientAnswers() != null)
						{
							int patientAnswers = assessmentAnswer.getPatientAnswers().size();
							for(int z = 0; z < patientAnswers; z++)
							{
								PatientAssessmentAnswerVo answer = assessmentAnswer.getPatientAnswers().get(z);
								if(answer != null && 
										answer.getID_PatientAssessmentAnswer() != null &&
										answer.getID_PatientAssessmentAnswer().intValue() == id.intValue())
								{
									return answer;
								}
							}
						}
					}
				}
			}
		}
		
		return null;
	}
	
	//WDEV-12215
	private static Patient_AssessmentAnswerVo findAnswer(Patient_AssessmentVo initialData, Integer id) 
	{
		if(initialData == null || 
				initialData.getAssessmentData() == null ||
				initialData.getAssessmentData().getAnswerGroups() == null ||
				id == null)
			return null;
		
		int answerGroups = initialData.getAssessmentData().getAnswerGroups().size();
		
		for(int x = 0; x < answerGroups; x++)
		{
			Patient_AssessmentGroupVo answerGroup = initialData.getAssessmentData().getAnswerGroups().get(x);
			if(answerGroup != null)
			{
				if(answerGroup.getAssessmentAnswers() != null)
				{
					int assessmentAnswers = answerGroup.getAssessmentAnswers().size();
					
					for(int y = 0; y < assessmentAnswers; y++)
					{
						Patient_AssessmentQuestionVo assessmentAnswer = answerGroup.getAssessmentAnswers().get(y);
						
						if(assessmentAnswer != null && assessmentAnswer.getPatientAnswers() != null)
						{
							int patientAnswers = assessmentAnswer.getPatientAnswers().size();
							for(int z = 0; z < patientAnswers; z++)
							{
								Patient_AssessmentAnswerVo answer = assessmentAnswer.getPatientAnswers().get(z);
								if(answer != null && 
										answer.getID_PatientAssessmentAnswer() != null &&
										answer.getID_PatientAssessmentAnswer().intValue() == id.intValue())
								{
									return answer;
								}
							}
						}
					}
				}
			}
		}
		
		return null;
	}
	
	private static AnswerDetailsVo findAnswerDetails(PatientAssessmentAnswerVo initialAnswer, Integer id) 
	{
		if(initialAnswer == null || 
				initialAnswer.getAnswerDetails() == null || 				
				id == null)
			return null;
		
		int details = initialAnswer.getAnswerDetails().size();
		
		for(int x = 0; x < details; x++)
		{
			AnswerDetailsVo answerDetails = initialAnswer.getAnswerDetails().get(x);
			if(answerDetails != null && 
					answerDetails.getID_PatientAnswerDetails() != null &&
					answerDetails.getID_PatientAnswerDetails().intValue() == id.intValue())
			{
				return answerDetails;
			}
		}
		
		return null;
	}
	
	private static Answer_DetailsVo findAnswerDetails(Patient_AssessmentAnswerVo initialAnswer, Integer id) 
	{
		if(initialAnswer == null || 
				initialAnswer.getAnswerDetails() == null || 				
				id == null)
			return null;
		
		int details = initialAnswer.getAnswerDetails().size();
		
		for(int x = 0; x < details; x++)
		{
			Answer_DetailsVo answerDetails = initialAnswer.getAnswerDetails().get(x);
			if(answerDetails != null && 
					answerDetails.getID_PatientAnswerDetails() != null &&
					answerDetails.getID_PatientAnswerDetails().intValue() == id.intValue())
			{
				return answerDetails;
			}
		}
		
		return null;
	}
	
	private static boolean answerChanged(PatientAssessmentAnswerVo initialAnswer, PatientAssessmentAnswerVo patientAnswer) 
	{
		if(initialAnswer == null || initialAnswer.getAnswerDetails() == null || initialAnswer.getAnswerDetails().size() == 0)
			return true;
		
		int answerDetails = patientAnswer.getAnswerDetails().size();
		
		for(int x = 0; x < answerDetails; x++)
		{
			if(answerDetailsChanged(initialAnswer, patientAnswer.getAnswerDetails().get(x)))
				return true;
		}
		
		return false;
	}
	
	//WDEV-12215
	private static boolean answerChanged(Patient_AssessmentAnswerVo initialAnswer, Patient_AssessmentAnswerVo patientAnswer) 
	{
		if(initialAnswer == null || initialAnswer.getAnswerDetails() == null || initialAnswer.getAnswerDetails().size() == 0)
			return true;
		
		int answerDetails = patientAnswer.getAnswerDetails().size();
		
		for(int x = 0; x < answerDetails; x++)
		{
			if(answerDetailsChanged(initialAnswer, patientAnswer.getAnswerDetails().get(x)))
				return true;
		}
		
		return false;
	}
	
	private static boolean answerDetailsChanged(PatientAssessmentAnswerVo initialAnswer, AnswerDetailsVo answerDetails) 
	{
		if(initialAnswer == null)
			return true;
		
		AnswerDetailsVo initialDetails = findAnswerDetails(initialAnswer, answerDetails.getID_PatientAnswerDetails());		
		if(initialDetails == null || initialDetails.getAnswerType() == null || initialDetails.getAnswerType().getAnswerType() == null)
			return true;		
		if(answerDetails.getAnswerType() == null || answerDetails.getAnswerType().getAnswerType() == null)
			throw new CodingRuntimeException("Answer type not specified");
		if(!initialDetails.getAnswerType().getAnswerType().equals(answerDetails.getAnswerType().getAnswerType()))
			return true;		
		
		if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.DATE))
		{
			if(initialDetails.getDateAnswer() == null && answerDetails.getDateAnswer() != null)
				return true;
			if(initialDetails.getDateAnswer() != null && answerDetails.getDateAnswer() == null)
				return true;
			if(initialDetails.getDateAnswer() != null && answerDetails.getDateAnswer() != null)
				return !initialDetails.getDateAnswer().equals(answerDetails.getDateAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.DECIMAL))
		{
			if(initialDetails.getDecimalAnswer() == null && answerDetails.getDecimalAnswer() != null)
				return true;
			if(initialDetails.getDecimalAnswer() != null && answerDetails.getDecimalAnswer() == null)
				return true;
			if(initialDetails.getDecimalAnswer() != null && answerDetails.getDecimalAnswer() != null)
				return !initialDetails.getDecimalAnswer().equals(answerDetails.getDecimalAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.INTEGER))
		{
			if(initialDetails.getIntegerAnswer() == null && answerDetails.getIntegerAnswer() != null)
				return true;
			if(initialDetails.getIntegerAnswer() != null && answerDetails.getIntegerAnswer() == null)
				return true;
			if(initialDetails.getIntegerAnswer() != null && answerDetails.getIntegerAnswer() != null)
				return !initialDetails.getIntegerAnswer().equals(answerDetails.getIntegerAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.MULTISELECT))
		{
			if(initialDetails.getMultiSelectAnswers() == null && answerDetails.getMultiSelectAnswers() != null)
				return true;
			if(initialDetails.getMultiSelectAnswers() != null && answerDetails.getMultiSelectAnswers() == null)
				return true;
			if(initialDetails.getMultiSelectAnswers() != null && answerDetails.getMultiSelectAnswers() != null)
			{
				int initialSize = initialDetails.getMultiSelectAnswers().size();
				int currentSize = answerDetails.getMultiSelectAnswers().size();
				
				if(initialSize != currentSize)
					return true;
				
				for(int x = 0; x < currentSize; x++)
				{
					boolean found = false;
					
					AnswerOptionVo answerOption = answerDetails.getMultiSelectAnswers().get(x);
					
					for(int y = 0; y < initialSize; y++)
					{
						AnswerOptionVo initialAnswerOption = initialDetails.getMultiSelectAnswers().get(y);
						if(initialAnswerOption != null && initialAnswerOption.equals(answerOption))
						{
							found = true;
							break;
						}						
					}
					
					if(!found)
						return true;
				}
			}
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
		{
			if(initialDetails.getPartialDate() == null && answerDetails.getPartialDate() != null)
				return true;
			if(initialDetails.getPartialDate() != null && answerDetails.getPartialDate() == null)
				return true;
			if(initialDetails.getPartialDate() != null && answerDetails.getPartialDate() != null)
				return !initialDetails.getPartialDate().equals(answerDetails.getPartialDate());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.PICKLIST))
		{
			if(initialDetails.getPicklist() == null && answerDetails.getPicklist() != null)
				return true;
			if(initialDetails.getPicklist() != null && answerDetails.getPicklist() == null)
				return true;
			if(initialDetails.getPicklist() != null && answerDetails.getPicklist() != null)
				return !initialDetails.getPicklist().equals(answerDetails.getPicklist());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.TEXT))
		{
			String s1 = initialDetails.getStringAnswer() == null ? "" : initialDetails.getStringAnswer();
			String s2 = answerDetails.getStringAnswer() == null ? "" : answerDetails.getStringAnswer();
			
			return !s1.equals(s2);			
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.TIME))
		{
			if(initialDetails.getTimeAnswer() == null && answerDetails.getTimeAnswer() != null)
				return true;
			if(initialDetails.getTimeAnswer() != null && answerDetails.getTimeAnswer() == null)
				return true;
			if(initialDetails.getTimeAnswer() != null && answerDetails.getTimeAnswer() != null)
				return !initialDetails.getTimeAnswer().equals(answerDetails.getTimeAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.YESNO))
		{
			if(initialDetails.getBoolValueAnswer() == null && answerDetails.getBoolValueAnswer() != null)
				return true;
			if(initialDetails.getBoolValueAnswer() != null && answerDetails.getBoolValueAnswer() == null)
				return true;
			if(initialDetails.getBoolValueAnswer() != null && answerDetails.getBoolValueAnswer() != null)
				return !initialDetails.getBoolValueAnswer().equals(answerDetails.getBoolValueAnswer());
			
			return false;
		}
		
		return false;
	}
	
	//WDEV-12215
	private static boolean answerDetailsChanged(Patient_AssessmentAnswerVo initialAnswer, Answer_DetailsVo answerDetails) 
	{
		if(initialAnswer == null)
			return true;
		
		Answer_DetailsVo initialDetails = findAnswerDetails(initialAnswer, answerDetails.getID_PatientAnswerDetails());		
		if(initialDetails == null || initialDetails.getAnswerType() == null || initialDetails.getAnswerType().getAnswerType() == null)
			return true;		
		if(answerDetails.getAnswerType() == null || answerDetails.getAnswerType().getAnswerType() == null)
			throw new CodingRuntimeException("Answer type not specified");
		if(!initialDetails.getAnswerType().getAnswerType().equals(answerDetails.getAnswerType().getAnswerType()))
			return true;		
		
		if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.DATE))
		{
			if(initialDetails.getDateAnswer() == null && answerDetails.getDateAnswer() != null)
				return true;
			if(initialDetails.getDateAnswer() != null && answerDetails.getDateAnswer() == null)
				return true;
			if(initialDetails.getDateAnswer() != null && answerDetails.getDateAnswer() != null)
				return !initialDetails.getDateAnswer().equals(answerDetails.getDateAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.DECIMAL))
		{
			if(initialDetails.getDecimalAnswer() == null && answerDetails.getDecimalAnswer() != null)
				return true;
			if(initialDetails.getDecimalAnswer() != null && answerDetails.getDecimalAnswer() == null)
				return true;
			if(initialDetails.getDecimalAnswer() != null && answerDetails.getDecimalAnswer() != null)
				return !initialDetails.getDecimalAnswer().equals(answerDetails.getDecimalAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.INTEGER))
		{
			if(initialDetails.getIntegerAnswer() == null && answerDetails.getIntegerAnswer() != null)
				return true;
			if(initialDetails.getIntegerAnswer() != null && answerDetails.getIntegerAnswer() == null)
				return true;
			if(initialDetails.getIntegerAnswer() != null && answerDetails.getIntegerAnswer() != null)
				return !initialDetails.getIntegerAnswer().equals(answerDetails.getIntegerAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.MULTISELECT))
		{
			if(initialDetails.getMultiSelectAnswers() == null && answerDetails.getMultiSelectAnswers() != null)
				return true;
			if(initialDetails.getMultiSelectAnswers() != null && answerDetails.getMultiSelectAnswers() == null)
				return true;
			if(initialDetails.getMultiSelectAnswers() != null && answerDetails.getMultiSelectAnswers() != null)
			{
				int initialSize = initialDetails.getMultiSelectAnswers().size();
				int currentSize = answerDetails.getMultiSelectAnswers().size();
				
				if(initialSize != currentSize)
					return true;
				
				for(int x = 0; x < currentSize; x++)
				{
					boolean found = false;
					
					Answer_OptionVo answerOption = answerDetails.getMultiSelectAnswers().get(x);
					
					for(int y = 0; y < initialSize; y++)
					{
						Answer_OptionVo initialAnswerOption = initialDetails.getMultiSelectAnswers().get(y);
						if(initialAnswerOption != null && initialAnswerOption.equals(answerOption))
						{
							found = true;
							break;
						}						
					}
					
					if(!found)
						return true;
				}
			}
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.PARTIALDATE))
		{
			if(initialDetails.getPartialDate() == null && answerDetails.getPartialDate() != null)
				return true;
			if(initialDetails.getPartialDate() != null && answerDetails.getPartialDate() == null)
				return true;
			if(initialDetails.getPartialDate() != null && answerDetails.getPartialDate() != null)
				return !initialDetails.getPartialDate().equals(answerDetails.getPartialDate());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.PICKLIST))
		{
			if(initialDetails.getPicklist() == null && answerDetails.getPicklist() != null)
				return true;
			if(initialDetails.getPicklist() != null && answerDetails.getPicklist() == null)
				return true;
			if(initialDetails.getPicklist() != null && answerDetails.getPicklist() != null)
				return !initialDetails.getPicklist().equals(answerDetails.getPicklist());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.TEXT))
		{
			String s1 = initialDetails.getStringAnswer() == null ? "" : initialDetails.getStringAnswer();
			String s2 = answerDetails.getStringAnswer() == null ? "" : answerDetails.getStringAnswer();
			
			return !s1.equals(s2);			
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.TIME))
		{
			if(initialDetails.getTimeAnswer() == null && answerDetails.getTimeAnswer() != null)
				return true;
			if(initialDetails.getTimeAnswer() != null && answerDetails.getTimeAnswer() == null)
				return true;
			if(initialDetails.getTimeAnswer() != null && answerDetails.getTimeAnswer() != null)
				return !initialDetails.getTimeAnswer().equals(answerDetails.getTimeAnswer());
			
			return false;
		}
		else if(answerDetails.getAnswerType().getAnswerType().equals(QuestionAnswerType.YESNO))
		{
			if(initialDetails.getBoolValueAnswer() == null && answerDetails.getBoolValueAnswer() != null)
				return true;
			if(initialDetails.getBoolValueAnswer() != null && answerDetails.getBoolValueAnswer() == null)
				return true;
			if(initialDetails.getBoolValueAnswer() != null && answerDetails.getBoolValueAnswer() != null)
				return !initialDetails.getBoolValueAnswer().equals(answerDetails.getBoolValueAnswer());
			
			return false;
		}
		
		return false;
	}
	
	private static void populateHCPDataForGraphicQuestions(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, AuthoringInformationVo author)
	{
		int graphicQuestions = updatedData.getAssessmentData().getGraphicQuestion().size();
		for (int x = 0; x < graphicQuestions; x++)
		{
			PatientGraphicAssessmentQuestionAnswerVo graphicQuestionAnswer = updatedData.getAssessmentData().getGraphicQuestion().get(x);
			if(graphicQuestionAnswer != null && graphicQuestionAnswer.getPatientAnswersIsNotNull())
			{
				if(graphicQuestionAnswer.getPatientAnswersIsNotNull() && graphicQuestionAnswer.getIsAnsweredIsNotNull() && graphicQuestionAnswer.getIsAnswered().booleanValue())
				{
					int answer = graphicQuestionAnswer.getPatientAnswers().size();
					for (int y = 0; y < answer; y++)
					{
						PatientAssessmentAnswerVo patientAnswer = graphicQuestionAnswer.getPatientAnswers().get(y);
						
						if(patientAnswer != null)
						{
							populateHCPDataForPatientAnswer(initialData, patientAnswer, author);
						}
					}
				}
			}
		}
	}
	
	//WDEV-12215
	private static void populateHCPDataForGraphicQuestions(Patient_AssessmentVo initialData, Patient_AssessmentVo updatedData, AuthoringInformationVo author)
	{
		int graphicQuestions = updatedData.getAssessmentData().getGraphicQuestion().size();
		for (int x = 0; x < graphicQuestions; x++)
		{
			Patient_GraphicAssessmentQuestionAnswerVo graphicQuestionAnswer = updatedData.getAssessmentData().getGraphicQuestion().get(x);
			if(graphicQuestionAnswer != null && graphicQuestionAnswer.getPatientAnswersIsNotNull())
			{
				if(graphicQuestionAnswer.getPatientAnswersIsNotNull() && graphicQuestionAnswer.getIsAnsweredIsNotNull() && graphicQuestionAnswer.getIsAnswered().booleanValue())
				{
					int answer = graphicQuestionAnswer.getPatientAnswers().size();
					for (int y = 0; y < answer; y++)
					{
						Patient_AssessmentAnswerVo patientAnswer = graphicQuestionAnswer.getPatientAnswers().get(y);
						
						if(patientAnswer != null)
						{
							populateHCPDataForPatientAnswer(initialData, patientAnswer, author);
						}
					}
				}
			}
		}
	}
	
	private static void populateHCPDataForGraphicFindings(PatientAssessmentVo initialData, PatientAssessmentVo updatedData, AuthoringInformationVo author) 
	{
		int graphicFindings = updatedData.getAssessmentData().getGraphicFindings().size();
		
		for(int x = 0; x < graphicFindings; x++)
		{
			PatientGraphicAssessmentVo graphicAssessment = updatedData.getAssessmentData().getGraphicFindings().get(x);
			if(graphicAssessment != null && graphicAssessment.getPatientGraphicFinding() != null)
			{
				int patientGraphicFindings = graphicAssessment.getPatientGraphicFinding().size();
				
				for(int y = 0; y < patientGraphicFindings; y++)
				{
					PatientGraphicAssessmentFindingVo finding = graphicAssessment.getPatientGraphicFinding().get(y);
					
					if(finding != null && finding.getStage() != null)
					{
						int stages = finding.getStage().size();
						
						for(int z = 0; z < stages; z++)
						{
							PatientGraphicalAssessmentStageVo stage = finding.getStage().get(z);

							if(stage != null && stage.getFindingQuestion() != null)
							{
								int questions = stage.getFindingQuestion().size();
								
								for(int k = 0; k < questions; k++)
								{
									PatientGraphicAssessmentFindingQuestionAnswerVo question = stage.getFindingQuestion().get(k);
									
									if(question != null && question.getPatientAnswers() != null && question.getIsAnsweredIsNotNull() && question.getIsAnswered().booleanValue())
									{
										int patientAnswers = question.getPatientAnswers().size();
										
										for(int t = 0; t < patientAnswers; t++)
										{
											PatientAssessmentAnswerVo patientAnswer = question.getPatientAnswers().get(t);
											
											if(patientAnswer != null)
											{
												populateHCPDataForGraphicPatientAnswer(initialData, patientAnswer, author);
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
	
	//WDEV-12215
	private static void populateHCPDataForGraphicFindings(Patient_AssessmentVo initialData, Patient_AssessmentVo updatedData, AuthoringInformationVo author) 
	{
		int graphicFindings = updatedData.getAssessmentData().getGraphicFindings().size();
		
		for(int x = 0; x < graphicFindings; x++)
		{
			Patient_GraphicAssessmentVo graphicAssessment = updatedData.getAssessmentData().getGraphicFindings().get(x);
			if(graphicAssessment != null && graphicAssessment.getPatientGraphicFinding() != null)
			{
				int patientGraphicFindings = graphicAssessment.getPatientGraphicFinding().size();
				
				for(int y = 0; y < patientGraphicFindings; y++)
				{
					Patient_GraphicAssessmentFindingVo finding = graphicAssessment.getPatientGraphicFinding().get(y);
					
					if(finding != null && finding.getStage() != null)
					{
						int stages = finding.getStage().size();
						
						for(int z = 0; z < stages; z++)
						{
							Patient_GraphicalAssessmentStageVo stage = finding.getStage().get(z);

							if(stage != null && stage.getFindingQuestion() != null)
							{
								int questions = stage.getFindingQuestion().size();
								
								for(int k = 0; k < questions; k++)
								{
									Patient_GraphicAssessmentFindingQuestionAnswerVo question = stage.getFindingQuestion().get(k);
									
									if(question != null && question.getPatientAnswers() != null && question.getIsAnsweredIsNotNull() && question.getIsAnswered().booleanValue())
									{
										int patientAnswers = question.getPatientAnswers().size();
										
										for(int t = 0; t < patientAnswers; t++)
										{
											Patient_AssessmentAnswerVo patientAnswer = question.getPatientAnswers().get(t);
											
											if(patientAnswer != null)
											{
												populateHCPDataForGraphicPatientAnswer(initialData, patientAnswer, author);
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
	
	private static void populateHCPDataForGraphicPatientAnswer(PatientAssessmentVo initialData, PatientAssessmentAnswerVo patientAnswer, AuthoringInformationVo author) 
	{
		if(shouldUpdateAuthoringInformationForGraphic(initialData, patientAnswer))
			patientAnswer.setAuthoringInfo(author);			
	}
	
	//WDEV-12215
	private static void populateHCPDataForGraphicPatientAnswer(Patient_AssessmentVo initialData, Patient_AssessmentAnswerVo patientAnswer, AuthoringInformationVo author) 
	{
		if(shouldUpdateAuthoringInformationForGraphic(initialData, patientAnswer))
			patientAnswer.setAuthoringInfo(author);			
	}
	
	private static boolean shouldUpdateAuthoringInformationForGraphic(PatientAssessmentVo initialData, PatientAssessmentAnswerVo patientAnswer) 
	{
		if(patientAnswer.getAuthoringInfo() == null)
			return true;
				
		return answerChanged(findGraphicAnswer(initialData, patientAnswer.getID_PatientAssessmentAnswer()), patientAnswer);
	}
	
	//WDEV-12215
	private static boolean shouldUpdateAuthoringInformationForGraphic(Patient_AssessmentVo initialData, Patient_AssessmentAnswerVo patientAnswer) 
	{
		if(patientAnswer.getAuthoringInfo() == null)
			return true;
				
		return answerChanged(findGraphicAnswer(initialData, patientAnswer.getID_PatientAssessmentAnswer()), patientAnswer);
	}
	
	private static PatientAssessmentAnswerVo findGraphicAnswer(PatientAssessmentVo initialData, Integer id) 
	{
		if(initialData == null || 
				initialData.getAssessmentData() == null ||
				initialData.getAssessmentData().getGraphicFindings() == null ||				
				id == null)
			return null;
		
		int findings = initialData.getAssessmentData().getGraphicFindings().size();
		
		for(int x = 0; x < findings; x++)
		{
			PatientGraphicAssessmentVo graphicAssessment = initialData.getAssessmentData().getGraphicFindings().get(x);
			
			if(graphicAssessment != null && graphicAssessment.getPatientGraphicFinding() != null)
			{
				int patientGraphicAssessmentFindings = graphicAssessment.getPatientGraphicFinding().size();
				
				for(int y = 0; y < patientGraphicAssessmentFindings; y++)
				{
					PatientGraphicAssessmentFindingVo finding = graphicAssessment.getPatientGraphicFinding().get(y);
					
					if(finding != null && finding.getStage() != null)
					{
						int stages = finding.getStage().size();
						
						for(int z = 0; z < stages; z++)
						{
							PatientGraphicalAssessmentStageVo stage = finding.getStage().get(z);
							
							if(stage != null && stage.getFindingQuestion() != null)
							{
								int questions = stage.getFindingQuestion().size();
								
								for(int k = 0; k < questions; k++)
								{
									PatientGraphicAssessmentFindingQuestionAnswerVo question = stage.getFindingQuestion().get(k);
									
									if(question != null && question.getPatientAnswers() != null)
									{
										int patientAnswers = question.getPatientAnswers().size();
										
										for(int t = 0; t < patientAnswers; t++)
										{
											PatientAssessmentAnswerVo patientAnswer = question.getPatientAnswers().get(t);
											
											if(patientAnswer != null && 
													patientAnswer.getID_PatientAssessmentAnswer() != null &&
													patientAnswer.getID_PatientAssessmentAnswer().intValue() == id.intValue())
											{
												return patientAnswer;
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
		
		return null;
	}
	
	//WDEV-12215
	private static Patient_AssessmentAnswerVo findGraphicAnswer(Patient_AssessmentVo initialData, Integer id) 
	{
		if(initialData == null || 
				initialData.getAssessmentData() == null ||
				initialData.getAssessmentData().getGraphicFindings() == null ||				
				id == null)
			return null;
		
		int findings = initialData.getAssessmentData().getGraphicFindings().size();
		
		for(int x = 0; x < findings; x++)
		{
			Patient_GraphicAssessmentVo graphicAssessment = initialData.getAssessmentData().getGraphicFindings().get(x);
			
			if(graphicAssessment != null && graphicAssessment.getPatientGraphicFinding() != null)
			{
				int patientGraphicAssessmentFindings = graphicAssessment.getPatientGraphicFinding().size();
				
				for(int y = 0; y < patientGraphicAssessmentFindings; y++)
				{
					Patient_GraphicAssessmentFindingVo finding = graphicAssessment.getPatientGraphicFinding().get(y);
					
					if(finding != null && finding.getStage() != null)
					{
						int stages = finding.getStage().size();
						
						for(int z = 0; z < stages; z++)
						{
							Patient_GraphicalAssessmentStageVo stage = finding.getStage().get(z);
							
							if(stage != null && stage.getFindingQuestion() != null)
							{
								int questions = stage.getFindingQuestion().size();
								
								for(int k = 0; k < questions; k++)
								{
									Patient_GraphicAssessmentFindingQuestionAnswerVo question = stage.getFindingQuestion().get(k);
									
									if(question != null && question.getPatientAnswers() != null)
									{
										int patientAnswers = question.getPatientAnswers().size();
										
										for(int t = 0; t < patientAnswers; t++)
										{
											Patient_AssessmentAnswerVo patientAnswer = question.getPatientAnswers().get(t);
											
											if(patientAnswer != null && 
													patientAnswer.getID_PatientAssessmentAnswer() != null &&
													patientAnswer.getID_PatientAssessmentAnswer().intValue() == id.intValue())
											{
												return patientAnswer;
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
		
		return null;
	}
}
