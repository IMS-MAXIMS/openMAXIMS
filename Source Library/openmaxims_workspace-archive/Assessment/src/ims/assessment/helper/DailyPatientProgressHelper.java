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

import ims.assessment.vo.PatientAssessmentAnswerVo;
import ims.assessment.vo.PatientAssessmentGroupVoCollection;
import ims.assessment.vo.PatientAssessmentQuestionVo;
import ims.assessment.vo.PatientAssessmentQuestionVoCollection;
import ims.assessment.vo.enums.DPPScore;
import ims.assessment.vo.lookups.AnswerStatus;
import ims.core.vo.AnswerDetailsVo;
import ims.core.vo.AnswerOptionVo;
import ims.framework.controls.TreeNode;
import ims.framework.utils.Color;
import ims.framework.utils.Image;

public class DailyPatientProgressHelper
{
	public static final int	GREEN_SCORE		= getScoreNumber(DPPScore.GREEN_SCORE.getText());
	public static final int	YELLOW_SCORE	= getScoreNumber(DPPScore.YELLOW_SCORE.getText());
	public static final int	RED_SCORE		= getScoreNumber(DPPScore.RED_SCORE.getText());

	private Image			redImage		= null;
	private Image			yellowImage		= null;
	private Image			greenImage		= null;

	private static int getScoreNumber(String scoreText)
	{
		int defaultValue = 0;
		if (scoreText != null)
		{
			if (scoreText.equals(DPPScore.GREEN_SCORE.getText()))
				defaultValue = 0;

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
	
	public DailyPatientProgressHelper(Image redImage, Image yellowImage, Image greenImage)
	{
		this.redImage = redImage;
		this.yellowImage = yellowImage;
		this.greenImage = greenImage;
	}
	
	private Color getColourFromScore(int score)
	{
		Color color = null;
		
		if(score == GREEN_SCORE)
		{
			color = DPPScore.GREEN_SCORE.getTextColor();
		}
		else if(score == YELLOW_SCORE)
		{
			color = DPPScore.YELLOW_SCORE.getTextColor();
		}
		else if(score == RED_SCORE)
		{
			color = DPPScore.RED_SCORE.getTextColor();
		}

		return color;
	}
	
	public ScoreAndImage getScoreImage(PatientAssessmentQuestionVo voPatAssessment)
	{
		if (voPatAssessment == null || (voPatAssessment.getIsAnsweredIsNotNull() && !voPatAssessment.getIsAnswered().equals(AnswerStatus.ANSWERED)))
			return null;

		Image image = null;
		int totalScore = 0;
		int highestScore = -1;
		for (int i = 0; i < voPatAssessment.getPatientAnswers().size(); i++)
		{
			PatientAssessmentAnswerVo voPatAssessAnswer = voPatAssessment.getPatientAnswers().get(i);
			if (voPatAssessAnswer != null)
			{
				for (int j = 0; j < voPatAssessAnswer.getAnswerDetails().size(); j++)
				{
					AnswerDetailsVo voAnswerDetails = voPatAssessAnswer.getAnswerDetails().get(j);
					for (int k = 0; voAnswerDetails.getMultiSelectAnswersIsNotNull() && k < voAnswerDetails.getMultiSelectAnswers().size(); k++)
					{
						AnswerOptionVo voAnswerOption = voAnswerDetails.getMultiSelectAnswers().get(k);
						if (voAnswerOption.getScoreIsNotNull())
						{
							int score = voAnswerOption.getScore().intValue();
							if(score > 2)
								continue;
							totalScore = totalScore + score;
							if(score > highestScore)
								highestScore = score;
						}
					}
				}
			}
		}
		if(highestScore == GREEN_SCORE)
			image = greenImage;
		if(highestScore == YELLOW_SCORE)
			image = yellowImage;
		if(highestScore == RED_SCORE)
			image = redImage;
		
		return new ScoreAndImage(new Integer(totalScore), new Integer(highestScore), image);
	}

	private TotalScore calculateAnswersScore(PatientAssessmentQuestionVoCollection voColl, TotalScore totalScore)
	{
		if(totalScore == null)
			totalScore = new TotalScore();

		for (int l = 0; voColl != null && l < voColl.size(); l++)
		{
			PatientAssessmentQuestionVo voPatAssessQuestion = voColl.get(l);

			if (voPatAssessQuestion == null || !isAnswered(voPatAssessQuestion) || !hasAnswers(voPatAssessQuestion))
				continue;

			int highestScore = -1;
			int partialTotalScore = 0;
			for (int i = 0; i < voPatAssessQuestion.getPatientAnswers().size(); i++)
			{
				PatientAssessmentAnswerVo voPatAssessAnswer = voPatAssessQuestion.getPatientAnswers().get(i);
				if (voPatAssessAnswer != null)
				{
					for (int j = 0; j < voPatAssessAnswer.getAnswerDetails().size(); j++)
					{
						AnswerDetailsVo voAnswerDetails = voPatAssessAnswer.getAnswerDetails().get(j);
						for (int k = 0; voAnswerDetails.getMultiSelectAnswersIsNotNull() && k < voAnswerDetails.getMultiSelectAnswers().size(); k++)
						{
							AnswerOptionVo voAnswerOption = voAnswerDetails.getMultiSelectAnswers().get(k);
							if (voAnswerOption.getScoreIsNotNull())
							{
								int score = voAnswerOption.getScore().intValue();
								if (score > 2)
									continue;
								partialTotalScore = partialTotalScore + score;
								if (score > highestScore)
									highestScore = score;
							}
						}
					}
				}
			}

			if(highestScore == GREEN_SCORE)
			{
				totalScore.addToGreenScore(1);
			}
			else if(highestScore == YELLOW_SCORE)
			{
				totalScore.addToYellowScore(1);
			}
			else if(highestScore == RED_SCORE)
			{
				totalScore.addToRedScore(1);
			}
			
			totalScore.addToTotalScore(partialTotalScore);
		}
		
		return totalScore;
	}
	
	public void populateTreeScores(ims.framework.controls.TreeView tree, PatientAssessmentGroupVoCollection voColl)
	{
		if(tree == null)
			return;
		
		TotalScore totalScore = getTotalScore(voColl);
		
		if(totalScore != null)
		{
			TreeNode node = tree.getNodes().add(new Integer(RED_SCORE), "(" + Integer.toString(totalScore.getRedScore()) + ") Red");
			node.setExpandedImage(redImage);
			node.setCollapsedImage(redImage);
			node = tree.getNodes().add(new Integer(YELLOW_SCORE), "(" + Integer.toString(totalScore.getYellowScore()) + ") Yellow");
			node.setExpandedImage(yellowImage);
			node.setCollapsedImage(yellowImage);
			node = tree.getNodes().add(new Integer(GREEN_SCORE), "(" + Integer.toString(totalScore.getGreenScore()) + ") Green");
			node.setExpandedImage(greenImage);
			node.setCollapsedImage(greenImage);
			node = tree.getNodes().add(null, "Total Score: " + totalScore.getTotalScore());
			node.setTextColor(Color.Blue);
		}
	}
	
	private TotalScore getTotalScore(PatientAssessmentGroupVoCollection voColl)
	{
		TotalScore totalScore = null;
		for (int i = 0; voColl != null && i < voColl.size(); i++)
		{
			totalScore = calculateAnswersScore(voColl.get(i).getAssessmentAnswers(), totalScore);	
		}
		
		return totalScore;
	}
	
	
	private boolean hasAnswers(PatientAssessmentQuestionVo voAssessQuestion)
	{
		if(voAssessQuestion == null)
			return false;
		
		for (int i = 0; i < voAssessQuestion.getPatientAnswers().size(); i++)
		{
			for (int j = 0; j < voAssessQuestion.getPatientAnswers().get(i).getAnswerDetails().size(); j++)
			{
				AnswerDetailsVo answerDetail = voAssessQuestion.getPatientAnswers().get(i).getAnswerDetails().get(j);
				if(isMultiSelectAnswer(answerDetail))
				{
					return answerDetail.getMultiSelectAnswers().size() > 0;
				}
			}
		}
		return false;
	}

	private boolean isMultiSelectAnswer(AnswerDetailsVo answerDetail)
	{
		ims.core.vo.lookups.QuestionAnswerType questionAnswerType = answerDetail.getAnswerTypeIsNotNull() ? answerDetail.getAnswerType().getAnswerType():null;
		return questionAnswerType != null && questionAnswerType.equals(ims.core.vo.lookups.QuestionAnswerType.MULTISELECT);
	}

	private boolean isAnswered(PatientAssessmentQuestionVo voPatAssQuestion)
	{
		return voPatAssQuestion != null && voPatAssQuestion.getIsAnsweredIsNotNull() && voPatAssQuestion.getIsAnswered().equals(AnswerStatus.ANSWERED);
	}
	
	public class ScoreAndImage
	{
		Image	image	= null;
		Integer	totalScore	= null;
		Integer highestScore = null;
		Color   color = null;

		public ScoreAndImage(Integer totalScore, Integer highestScore, Image image)
		{
			this.image = image;
			this.totalScore = totalScore;
			this.highestScore = highestScore;
		}

		public Integer getTotalScore()
		{
			return totalScore;
		}
		
		public Image getImage()
		{
			return image;
		}

		public Integer getHighestScore()
		{
			return highestScore;
		}

		public void setHighertScore(Integer highestScore)
		{
			this.highestScore = highestScore;
		}
		
		public Color getColor()
		{
			return getColourFromScore(highestScore != null?highestScore.intValue():-1);
		}
	}
	
	public class TotalScore
	{
		int	redScore	= 0;
		int	yellowScore	= 0;
		int	greenScore	= 0;
		int totalScore 	= 0; 

		public TotalScore()
		{
			this.redScore 	 = 0;
			this.yellowScore = 0;
			this.greenScore  = 0;
			this.totalScore  = 0;
		}

		public int getGreenScore()
		{
			return greenScore;
		}

		public void addToGreenScore(int score)
		{
			this.greenScore += score;
		}

		public int getRedScore()
		{
			return redScore;
		}

		public void addToRedScore(int score)
		{
			this.redScore += score;
		}

		public int getYellowScore()
		{
			return yellowScore;
		}

		public void addToYellowScore(int score)
		{
			this.yellowScore += score;
		}

		public int getTotalScore()
		{
			return totalScore;
		}

		public void setTotalScore(int totalScore)
		{
			this.totalScore = totalScore;
		}
		
		public void addToTotalScore(int score)
		{
			this.totalScore += score;
		}
	}
}

