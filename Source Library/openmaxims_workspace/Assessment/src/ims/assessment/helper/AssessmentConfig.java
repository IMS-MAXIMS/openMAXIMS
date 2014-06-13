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

import ims.assessment.configuration.vo.GraphicAssessmentRefVo;
import ims.assessment.configuration.vo.UserAssessmentRefVo;
import ims.assessment.vo.PatientAssessmentListVo;
import ims.assessment.vo.PatientAssessmentVo;
import ims.assessment.vo.PatientUserDefinedObjectVo;
import ims.assessment.vo.UserDefinedObjectComponentVo;

public class AssessmentConfig
{
	public UserDefinedObjectComponentVo getEditedComponent(PatientUserDefinedObjectVo voPatientUserDefinedObject, PatientAssessmentVo voPatientAssessment)
	{
		if(voPatientAssessment == null)
			return null;
		if(voPatientUserDefinedObject == null)
			return null;
		
		UserAssessmentRefVo userAssessmentRefVo 	  = voPatientAssessment.getAssessmentData().getUserAssessment();
		GraphicAssessmentRefVo graphicAssessmentRefVo = voPatientAssessment.getAssessmentData().getGraphic();

		return getUserDefinedObjectComponent(voPatientUserDefinedObject, userAssessmentRefVo, graphicAssessmentRefVo);
	}

	
	public UserDefinedObjectComponentVo getEditedComponent(PatientUserDefinedObjectVo voPatientUserDefinedObject, PatientAssessmentListVo voPatientAssessmentList)
	{
		if(voPatientUserDefinedObject == null)
			return null;
		if(voPatientAssessmentList == null)
			return null;
		
		UserAssessmentRefVo userAssessmentRefVo 	  = voPatientAssessmentList.getAssessmentData().getUserAssessment();
		GraphicAssessmentRefVo graphicAssessmentRefVo = voPatientAssessmentList.getAssessmentData().getGraphic();
		
		return getUserDefinedObjectComponent(voPatientUserDefinedObject, userAssessmentRefVo, graphicAssessmentRefVo);
	}

	/**
	 * @param voPatientUserDefinedObject
	 * @param userAssessmentRefVo
	 * @param graphicAssessmentRefVo
	 * @return
	 */
	private UserDefinedObjectComponentVo getUserDefinedObjectComponent(PatientUserDefinedObjectVo voPatientUserDefinedObject, UserAssessmentRefVo userAssessmentRefVo, GraphicAssessmentRefVo graphicAssessmentRefVo)
	{
		if (userAssessmentRefVo == null && graphicAssessmentRefVo == null)
			return null;

		if (voPatientUserDefinedObject != null && voPatientUserDefinedObject.getUserDefinedObjectIsNotNull())
		{
			for (int i = 0; i < voPatientUserDefinedObject.getUserDefinedObject().getComponents().size(); i++)
			{
				UserDefinedObjectComponentVo voUserDefinedObjectComponent = voPatientUserDefinedObject.getUserDefinedObject().getComponents().get(i);
				UserAssessmentRefVo userUserDefinedAssessmentRefVo = voUserDefinedObjectComponent.getUserAssessment();
				GraphicAssessmentRefVo graphicUserDefinedAssessmentRefVo = voUserDefinedObjectComponent.getGraphic();
				boolean sameUserAssessment = userUserDefinedAssessmentRefVo != null && userUserDefinedAssessmentRefVo.equals(userAssessmentRefVo);
				boolean sameGraphicAssessment = graphicUserDefinedAssessmentRefVo != null && graphicUserDefinedAssessmentRefVo.equals(graphicAssessmentRefVo);

				if (sameUserAssessment || sameGraphicAssessment)
					return voUserDefinedObjectComponent;
			}
		}

		return null;
	}
	
}
