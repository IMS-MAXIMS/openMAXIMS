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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.35 build 2104.19580)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.spinalinjuries.domain.impl;

import java.util.ArrayList;
import java.util.List;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.domain.VitalSignsAll;
import ims.core.domain.impl.VitalSignsImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CareContextLiteVo;
import ims.core.vo.CareContextShortVoCollection;
import ims.core.vo.EpisodeofCareLiteVo;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.VSMetricsCollection;
import ims.core.vo.VitalSignsVo;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.VSMetricsAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.CodingRuntimeException;
import ims.generalmedical.vo.MedExamGeneralVo;
import ims.generalmedical.vo.MedExamGeneralVoCollection;
import ims.generalmedical.vo.domain.MedExamGeneralVoAssembler;
import ims.spinalinjuries.domain.SleepAssessment;
import ims.clinical.domain.objects.ExamGen;

public class OPDMedExamImpl extends DomainImpl implements ims.spinalinjuries.domain.OPDMedExam, ims.domain.impl.Transactional
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	* Save the MedExamGeneralVo
	 * @throws UniqueKeyViolationException 
	*/
	public void saveMedExamGeneralVo(ims.generalmedical.vo.MedExamGeneralVo voMedExamGeneral) throws StaleObjectException, UniqueKeyViolationException
	{
		// Ensure the value object has been validated
		if (!voMedExamGeneral.isValidated())
			throw new DomainRuntimeException("OPD Medical Exam has not been validated");
		
		DomainFactory factory = getDomainFactory();
		if (voMedExamGeneral.getID_ExamGen() == null)//Inserting a record
		{
			StringBuffer hql = new StringBuffer();
			hql.append("from ExamGen as e where e.careContext.id = :CCID and e.isRIE is null");
			java.util.List list = getDomainFactory().find(hql.toString(), "CCID",voMedExamGeneral.getCareContext().getID_CareContext());
			if (list == null || list.size() > 0)
				throw new UniqueKeyViolationException("A record exists for this Care Context, the screen will be refreshed");
		}
		ExamGen doMedExamGeneral = MedExamGeneralVoAssembler.extractExamGen(factory, voMedExamGeneral);
		factory.save(doMedExamGeneral);
		
		return;
	}


	public VitalSignsVo saveVitalsVo(VitalSignsVo voVitals) throws DomainInterfaceException, StaleObjectException 
	{
		VitalSignsAll impl = (VitalSignsAll)getDomainImpl(VitalSignsImpl.class);
		return impl.saveVitalSign(voVitals);
	}

	public MedExamGeneralVo getMedExamGeneralVoByCareContext(CareContextLiteVo voCareContext)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();
		String query = " from ExamGen examGen ";
		ArrayList markers= new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " ";

		if(voCareContext != null)
		{
			hql.append(andStr + " examGen.careContext.id = :ec");
			markers.add("ec");
			values.add(voCareContext.getID_CareContext());
			andStr = " and ";
		}
		if (markers.size() > 0) query += " where ";
		query += hql.toString();	
		
		java.util.List egList = factory.find(query,markers,values);
		
		MedExamGeneralVoCollection voMedExamGeneralColl = MedExamGeneralVoAssembler.createMedExamGeneralVoCollectionFromExamGen(egList);
		if(voMedExamGeneralColl.size()==1)
			return voMedExamGeneralColl.get(0);
		else
			return null;
	}

	public VitalSignsVo getVitalsVoByCareContext(CareContextLiteVo voCareContext)
	{
		SleepAssessment impl = (SleepAssessment) getDomainImpl(SleepAssessmentImpl.class);
		return impl.getVitalSignsByCareContext(voCareContext);
	}

	public CareContextShortVoCollection listOPDMedExamByCareContextShort(EpisodeofCareLiteVo voEpisodeOfCareLite)
	{
		if (voEpisodeOfCareLite == null)
			throw new CodingRuntimeException("Episode of Care was not supplied. Mandatory argument");
	
		DomainFactory factory = getDomainFactory();
		String hql = "select careContext from ExamGen examGen where examGen.careContext.episodeOfCare.id = " + voEpisodeOfCareLite.getID_EpisodeOfCare(); 
		List investList = factory.find(hql);							
		return CareContextShortVoAssembler.createCareContextShortVoCollectionFromCareContext(investList).sort(SortOrder.DESCENDING);
	}

	public HcpLiteVoCollection listHcpLiteByName(String hcpName)
	{
		HcpAdmin impl = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return impl.listHcpLiteByName(hcpName);

	}

	public VSMetricsCollection listMetricsData(PatientRefVo voRefPatient) 
	{
		DomainFactory factory = getDomainFactory();
		
		String hql= "select metrics from VitalSigns vs where vs.careContext.episodeOfCare.careSpell.patient.id = " + voRefPatient.getID_Patient();
		List lstVitalSigns = factory.find(hql);		
		return VSMetricsAssembler.createVSMetricsCollectionFromMetrics(lstVitalSigns).sort(SortOrder.DESCENDING);		
	}



}