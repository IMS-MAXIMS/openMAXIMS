//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * Created on 25-Nov-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package ims.coe.domain.impl;

import ims.coe.domain.AssessPain;
import ims.core.admin.vo.ClinicalContactRefVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.nursing.domain.impl.PainBodyChartImpl;

/**
 * @author dlaffan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class PainBodyChartCoeImpl extends PainBodyChartImpl  implements ims.nursing.domain.PainBodyChart, ims.domain.impl.Transactional
{
	@Override
	public ims.nursing.vo.AssessmentHeaderInfo savePainAssessmentComponent(ims.nursing.vo.AssessmentHeaderInfo assessment, ims.nursing.vo.AssessmentComponent component, ClinicalContactRefVo clinContactShortVo) throws StaleObjectException, UniqueKeyViolationException, DomainInterfaceException
	{
		AssessPain componentImpl = (AssessPain)getDomainImpl(AssessmentComponentImpl.class);
		return (componentImpl.saveComponent(assessment, component));
	}
}
