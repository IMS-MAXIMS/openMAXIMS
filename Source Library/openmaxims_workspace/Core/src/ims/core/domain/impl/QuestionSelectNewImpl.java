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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.39 build 2173.29356)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.core.domain.impl;

import ims.admin.domain.LookupTree;
import ims.admin.domain.impl.LookupTreeImpl;
import ims.admin.helper.Keywords;
import ims.core.clinical.domain.objects.QuestionInformation;
import ims.core.domain.base.impl.BaseQuestionSelectNewImpl;
import ims.core.vo.QuestionInformationShortVoCollection;
import ims.core.vo.QuestionInformationVoCollection;
import ims.core.vo.domain.QuestionInformationShortVoAssembler;
import ims.core.vo.domain.QuestionInformationVoAssembler;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.QuestionClassification;
import ims.core.vo.lookups.QuestionClassificationCollection;
import ims.core.vo.lookups.QuestionType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.exceptions.CodingRuntimeException;

import java.util.ArrayList;
import java.util.List;

public class QuestionSelectNewImpl extends BaseQuestionSelectNewImpl
{
	/**
	* Question Add/Update
	*/
	public ims.core.vo.QuestionInformationVo saveQuestion(ims.core.vo.QuestionInformationVo questionInfo) throws ims.domain.exceptions.StaleObjectException, UniqueKeyViolationException
	{
		if(questionInfo == null)
			throw new RuntimeException("Cannot save null value for QuestionInformationVo");
		if(!questionInfo.isValidated())
			throw new CodingRuntimeException("QuestionInformationVo has not been validated");
					
		DomainFactory factory = getDomainFactory();
		QuestionInformation doQuestionInfo = QuestionInformationVoAssembler.extractQuestionInformation(factory, questionInfo);
		try 
		{
			factory.save(doQuestionInfo);
		} 
		catch(UnqViolationUncheckedException e)
		{
			String dupMessage = Keywords.checkDuplicateTaxonomy(factory, doQuestionInfo, "taxonomyMap", questionInfo.getTaxonomyMap(), "getText");
			if(dupMessage != null)
				throw new UniqueKeyViolationException(dupMessage);
			
			throw new UniqueKeyViolationException(e);
		}
		
		return QuestionInformationVoAssembler.create(doQuestionInfo);
	
	}

	/**
	* Add/Save a Lookup Instance
	 * @throws DomainInterfaceException 
	*/
	public ims.vo.LookupInstanceCollection saveLookupInstance(ims.vo.LookupTypeVo type, ims.vo.LookupInstVo instance) throws ims.domain.exceptions.StaleObjectException, DomainInterfaceException
	{
		LookupTree domainLookupTree = (LookupTree) getDomainImpl(LookupTreeImpl.class);
		return domainLookupTree.saveLookupInstance(type, instance);
	}

	public ims.vo.LookupInstVo deactivateInstance(ims.vo.LookupTypeVo type, ims.vo.LookupInstVo voInstance) throws ims.domain.exceptions.StaleObjectException
	{
		LookupTree domainLookupTree = (LookupTree) getDomainImpl(LookupTreeImpl.class);
		return domainLookupTree.deactivateInstance(type, voInstance);
	}

	/**
	* Get Lookup Instances
	*/
	public ims.vo.LookupInstanceCollection getLookupInstances(ims.vo.LookupTypeVo type)
	{
		LookupTree domainLookupTree = (LookupTree) getDomainImpl(LookupTreeImpl.class);
		return domainLookupTree.getLookupInstances(type);
	}

	/**
	* List Question
	*/
	public ims.core.vo.QuestionInformationShortVoCollection listQuestion(ims.core.vo.QuestionInformationVo filter)
	{
		StringBuffer hql = new StringBuffer(" from QuestionInformation QI");
		DomainFactory factory = getDomainFactory();
		ArrayList names = new ArrayList(), values = new ArrayList();
		QuestionInformationShortVoCollection voColl = new QuestionInformationShortVoCollection();
		if(filter != null)
		{
			if(filter.getTextIsNotNull())
			{
				hql.append(" where upper(QI.text) like :qText ");
				names.add("qText");
				values.add("%" + filter.getText().toUpperCase() + "%");
			
				List qInfoList = factory.find(hql.toString(), names, values);
				return QuestionInformationShortVoAssembler.createQuestionInformationShortVoCollectionFromQuestionInformation(qInfoList);
			}
			if(filter.getClassificationIsNotNull() && filter.getClassification().size() > 0)
			{
				for(int i=0; i<filter.getClassification().size(); i++)
				{
					hql = new StringBuffer();
					hql.append("from QuestionInformation QI where :item in elements(QI.classification)");
					names.add("item");	
					values.add(getDomLookup(filter.getClassification().get(i)));
					List qInfoList = factory.find(hql.toString(), names, values);
					QuestionInformationVoCollection voQInfoColl = QuestionInformationVoAssembler.createQuestionInformationVoCollectionFromQuestionInformation(qInfoList);
					//Add the collection to the main one
					for(int j=0; voQInfoColl != null && j<voQInfoColl.size(); j++)
						voColl.add(voQInfoColl.get(j));
				}
				
				return voColl;
			}
		}
		return null;
	}

	public ims.core.vo.QuestionInformationVo getQuestion(Integer idQuestion)
	{
		if(idQuestion == null)
			throw new RuntimeException("Cannot get QuestionInformationVo for null id");
		DomainFactory factory = getDomainFactory();
		return QuestionInformationVoAssembler.create((QuestionInformation) factory.getDomainObject(QuestionInformation.class, idQuestion));
	}

	/**
	* list Questions using Question Information Filter
	*/
	public QuestionInformationShortVoCollection listQuestion(QuestionClassification classification, QuestionType questionType, String text, PreActiveActiveInactiveStatus status, Boolean isQuestion, Boolean isShortText)
	{
		return listQuestions(classification, questionType, text, status, isQuestion, false,isShortText);				
	}

	public QuestionInformationShortVoCollection listQuestionExcludeInactive(QuestionClassification classification, QuestionType questionType, String text, Boolean isQuestion, Boolean isShortText)
	{
		return listQuestions(classification, questionType, text, null, isQuestion, true, isShortText);	
	}
	
	/**
	 * @param classification
	 * @param questionType
	 * @param text
	 * @param status
	 * @param isQuestion
	 * @return
	 */
	private QuestionInformationShortVoCollection listQuestions(QuestionClassification classification, QuestionType questionType, String text, PreActiveActiveInactiveStatus status, Boolean isQuestion, boolean excludeInactive, boolean isShortText)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select QI from QuestionInformation QI ");
		ArrayList values = new ArrayList(), names = new ArrayList();
		boolean firstClause = true;

		if(isQuestion != null)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" QI.isQuestion = :isQuestion");
			names.add("isQuestion");
			values.add(isQuestion);
			firstClause = false;
		}
		if(questionType != null)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" QI.questionType = :qType");
			names.add("qType");
			values.add(getDomLookup(questionType));
			firstClause = false;
		}
		if(text != null && !isShortText)
		{
			text = text.toUpperCase();
			hql.append(firstClause?" where ":" and ");
			hql.append(" (upper(QI.text) like :qText or :keyword in elements(QI.keywords))");
			names.add("qText");
			values.add("%" + text + "%");

			names.add("keyword");
			values.add(text);
			
			firstClause = false;
		}
		if(text != null && isShortText)
		{
			text = text.toUpperCase();
			hql.append(firstClause?" where ":" and ");
			hql.append(" (upper(QI.shortText) like :qText or :keyword in elements(QI.keywords))");
			names.add("qText");
			values.add("%" + text + "%");

			names.add("keyword");
			values.add(text);
			
			firstClause = false;
		}
		
		if(excludeInactive)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" QI.status != :statExcluded");
			names.add("statExcluded");
			values.add(getDomLookup(PreActiveActiveInactiveStatus.INACTIVE));
			firstClause = false;	
		}
		
		if(status != null)
		{
			hql.append(firstClause?" where ":" and ");
			hql.append(" QI.status = :statLkp");
			names.add("statLkp");
			values.add(getDomLookup(status));
			firstClause = false;
		}
		if(classification != null)
		{	
			hql.append(firstClause?" where ":" and ");
			hql.append(" :classItem in elements(QI.classification)");
			names.add("classItem");
			values.add(getDomLookup(classification));
			firstClause = false;
		}
		
		List qInfoList = factory.find(hql.toString(), names, values);
		return QuestionInformationShortVoAssembler.createQuestionInformationShortVoCollectionFromQuestionInformation(qInfoList);
	}

	/**
	* Counts the number of questions
	*/
	public Integer countQuestion(QuestionClassificationCollection classification, QuestionType questionType, String text, PreActiveActiveInactiveStatus status, Boolean isQuestion)
	{
		return countQuestions(classification, questionType, text, status, isQuestion, false);
	}


	public Integer countQuestionExcludeInactive(QuestionClassificationCollection classification, QuestionType questionType, String text, Boolean isQuestion)
	{
		return countQuestions(classification, questionType, text, null, isQuestion, true);
	}
	
	/**
	 * @param classification
	 * @param questionType
	 * @param text
	 * @param status
	 * @param isQuestion
	 * @return
	 */
	private Integer countQuestions(QuestionClassificationCollection classification, QuestionType questionType, String text, PreActiveActiveInactiveStatus status, Boolean isQuestion, boolean excludeInactive)
	{
		DomainFactory factory = getDomainFactory();
		QuestionClassification classItem;
		boolean hasClassification = classification != null && classification.size() > 0;
		boolean hasText = text != null && text.length() > 0;
		int count = 0;
		
		if(hasClassification)
		{
			for(int i=0; i<classification.size(); i++)
			{
				boolean firstClause = true;
				classItem = classification.get(i);
				StringBuffer hql = new StringBuffer();
				ArrayList names = new ArrayList(), values = new ArrayList();
				hql.append(" select QI.id, QI.isQuestion, QI.text, QI.status.id, count(QI.id) from QuestionInformation QI");
				if(isQuestion != null)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" QI.isQuestion = :bVal");
					names.add("bVal");
					values.add(isQuestion);
					firstClause = false;
				}
				if(questionType != null)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" QI.questionType = :qType");
					names.add("qType");
					values.add(getDomLookup(questionType));
					firstClause = false;
				}
				if(hasText)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" (upper(QI.text) like :text or :keyword in elements(QI.keywords))");
					names.add("text");
					values.add("%" + text + "%");

					names.add("keyword");
					values.add(text);
					
					firstClause = false;
				}
				if(excludeInactive)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" QI.status != :statExcluded");
					names.add("statExcluded");
					values.add(getDomLookup(PreActiveActiveInactiveStatus.INACTIVE));
					firstClause = false;	
				}
				
				if(status != null)
				{
					hql.append(firstClause?" where ":" and ");
					hql.append(" QI.status = :status");
					names.add("status");
					values.add(getDomLookup(status));
					firstClause = false;
				}
				if(classification != null)
				{	
					hql.append(firstClause?" where ":" and ");
					hql.append(" :classItem in elements(QI.classification)");
					names.add("classItem");
					values.add(getDomLookup(classItem));
					firstClause = false;
				}
				
				hql.append(" group by QI.id, QI.isQuestion, QI.text, QI.status.id");
				
				List list = factory.find(hql.toString(), names, values);
				if(list != null)
					count +=list.size();
			}
		}
		else
		{
			StringBuffer hql = new StringBuffer();
			ArrayList names = new ArrayList(), values = new ArrayList();
			boolean firstClause = true;
			hql.append(" select QI.id, QI.isQuestion, QI.text, count(QI.id) from QuestionInformation QI");
			if(isQuestion != null)
			{
				hql.append(firstClause?" where ":" and ");
				hql.append(" QI.isQuestion = :bVal");
				names.add("bVal");
				values.add(isQuestion);
				firstClause = false;
			}
			if(questionType != null)
			{
				hql.append(firstClause?" where ":" and ");
				hql.append(" QI.questionType = :qType");
				names.add("qType");
				values.add(getDomLookup(questionType));
				firstClause = false;
			}
			if(excludeInactive)
			{
				hql.append(firstClause?" where ":" and ");
				hql.append(" QI.status != :statExcluded");
				names.add("statExcluded");
				values.add(getDomLookup(PreActiveActiveInactiveStatus.INACTIVE));
				firstClause = false;	
			}
			if(hasText)
			{
				hql.append(firstClause?" where ":" and ");
				hql.append(" (upper(QI.text) like :text or :keyword in elements(QI.keywords))");
				names.add("text");
				values.add("%" + text + "%");
				
				names.add("keyword");
				values.add(text);
				
				firstClause = false;
			}
			hql.append(" group by QI.id, QI.text, QI.isQuestion");
			
			List list = factory.find(hql.toString(), names, values);
			if(list != null)
				count +=list.size();
		}
		
		return new Integer(count);
	}

	




}