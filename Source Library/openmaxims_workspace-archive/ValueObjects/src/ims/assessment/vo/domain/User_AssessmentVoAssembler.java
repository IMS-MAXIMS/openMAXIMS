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
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.assessment.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class User_AssessmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.User_AssessmentVo copy(ims.assessment.vo.User_AssessmentVo valueObjectDest, ims.assessment.vo.User_AssessmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_UserAssessment(valueObjectSrc.getID_UserAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// GroupQuestionWidth
		valueObjectDest.setGroupQuestionWidth(valueObjectSrc.getGroupQuestionWidth());
		// HelpURL
		valueObjectDest.setHelpURL(valueObjectSrc.getHelpURL());
		// isFlatView
		valueObjectDest.setIsFlatView(valueObjectSrc.getIsFlatView());
		// isMultipleGroup
		valueObjectDest.setIsMultipleGroup(valueObjectSrc.getIsMultipleGroup());
		// QuestionGroups
		valueObjectDest.setQuestionGroups(valueObjectSrc.getQuestionGroups());
		// HeaderText
		valueObjectDest.setHeaderText(valueObjectSrc.getHeaderText());
		// FooterText
		valueObjectDest.setFooterText(valueObjectSrc.getFooterText());
		// MaxHeaderHeight
		valueObjectDest.setMaxHeaderHeight(valueObjectSrc.getMaxHeaderHeight());
		// MaxFooterHeight
		valueObjectDest.setMaxFooterHeight(valueObjectSrc.getMaxFooterHeight());
		// AssessmentType
		valueObjectDest.setAssessmentType(valueObjectSrc.getAssessmentType());
		// ScoringMethod
		valueObjectDest.setScoringMethod(valueObjectSrc.getScoringMethod());
		// AssociatedReport
		valueObjectDest.setAssociatedReport(valueObjectSrc.getAssociatedReport());
		// StorePrintedAssessment
		valueObjectDest.setStorePrintedAssessment(valueObjectSrc.getStorePrintedAssessment());
		// canCopyLast
		valueObjectDest.setCanCopyLast(valueObjectSrc.getCanCopyLast());
		// CopyLastFromContext
		valueObjectDest.setCopyLastFromContext(valueObjectSrc.getCopyLastFromContext());
		// AssessmentRoles
		valueObjectDest.setAssessmentRoles(valueObjectSrc.getAssessmentRoles());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createUser_AssessmentVoCollectionFromUserAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.User_AssessmentVoCollection createUser_AssessmentVoCollectionFromUserAssessment(java.util.Set domainObjectSet)	
	{
		return createUser_AssessmentVoCollectionFromUserAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.User_AssessmentVoCollection createUser_AssessmentVoCollectionFromUserAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.User_AssessmentVoCollection voList = new ims.assessment.vo.User_AssessmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = (ims.assessment.configuration.domain.objects.UserAssessment) iterator.next();
			ims.assessment.vo.User_AssessmentVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.User_AssessmentVoCollection createUser_AssessmentVoCollectionFromUserAssessment(java.util.List domainObjectList) 
	{
		return createUser_AssessmentVoCollectionFromUserAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.User_AssessmentVoCollection createUser_AssessmentVoCollectionFromUserAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.User_AssessmentVoCollection voList = new ims.assessment.vo.User_AssessmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = (ims.assessment.configuration.domain.objects.UserAssessment) domainObjectList.get(i);
			ims.assessment.vo.User_AssessmentVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.assessment.configuration.domain.objects.UserAssessment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractUserAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.User_AssessmentVoCollection voCollection) 
	 {
	 	return extractUserAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractUserAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.User_AssessmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.User_AssessmentVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = User_AssessmentVoAssembler.extractUserAssessment(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.assessment.configuration.domain.objects.UserAssessment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractUserAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.User_AssessmentVoCollection voCollection) 
	 {
	 	return extractUserAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractUserAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.User_AssessmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.User_AssessmentVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = User_AssessmentVoAssembler.extractUserAssessment(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.UserAssessment object.
	 * @param domainObject ims.assessment.configuration.domain.objects.UserAssessment
	 */
	 public static ims.assessment.vo.User_AssessmentVo create(ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.UserAssessment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.User_AssessmentVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.User_AssessmentVo valueObject = (ims.assessment.vo.User_AssessmentVo) map.getValueObject(domainObject, ims.assessment.vo.User_AssessmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.User_AssessmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.UserAssessment
	 */
	 public static ims.assessment.vo.User_AssessmentVo insert(ims.assessment.vo.User_AssessmentVo valueObject, ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.UserAssessment
	 */
	 public static ims.assessment.vo.User_AssessmentVo insert(DomainObjectMap map, ims.assessment.vo.User_AssessmentVo valueObject, ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_UserAssessment(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// GroupQuestionWidth
		valueObject.setGroupQuestionWidth(domainObject.getGroupQuestionWidth());
		// HelpURL
		valueObject.setHelpURL(domainObject.getHelpURL());
		// isFlatView
		valueObject.setIsFlatView( domainObject.isIsFlatView() );
		// isMultipleGroup
		valueObject.setIsMultipleGroup( domainObject.isIsMultipleGroup() );
		// QuestionGroups
		valueObject.setQuestionGroups(ims.assessment.vo.domain.Assessment_QuestionGroupVoAssembler.createAssessment_QuestionGroupVoCollectionFromAssessmentQuestionGroup(map, domainObject.getQuestionGroups()) );
		// HeaderText
		valueObject.setHeaderText(domainObject.getHeaderText());
		// FooterText
		valueObject.setFooterText(domainObject.getFooterText());
		// MaxHeaderHeight
		valueObject.setMaxHeaderHeight(domainObject.getMaxHeaderHeight());
		// MaxFooterHeight
		valueObject.setMaxFooterHeight(domainObject.getMaxFooterHeight());
		// AssessmentType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getAssessmentType();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UserDefinedAssessmentType voLookup12 = new ims.core.vo.lookups.UserDefinedAssessmentType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.UserDefinedAssessmentType parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.UserDefinedAssessmentType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setAssessmentType(voLookup12);
		}
				// ScoringMethod
		ims.domain.lookups.LookupInstance instance13 = domainObject.getScoringMethod();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UserAssessmentScoringMethod voLookup13 = new ims.core.vo.lookups.UserAssessmentScoringMethod(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.UserAssessmentScoringMethod parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.UserAssessmentScoringMethod(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setScoringMethod(voLookup13);
		}
				// AssociatedReport
		if (domainObject.getAssociatedReport() != null)
		{
			if(domainObject.getAssociatedReport() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssociatedReport();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssociatedReport(new ims.core.admin.vo.TemplateBoRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssociatedReport(new ims.core.admin.vo.TemplateBoRefVo(domainObject.getAssociatedReport().getId(), domainObject.getAssociatedReport().getVersion()));
			}
		}
		// StorePrintedAssessment
		valueObject.setStorePrintedAssessment( domainObject.isStorePrintedAssessment() );
		// canCopyLast
		valueObject.setCanCopyLast( domainObject.isCanCopyLast() );
		// CopyLastFromContext
		ims.domain.lookups.LookupInstance instance17 = domainObject.getCopyLastFromContext();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.assessment.vo.lookups.CopyLastAssessmentContextType voLookup17 = new ims.assessment.vo.lookups.CopyLastAssessmentContextType(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.assessment.vo.lookups.CopyLastAssessmentContextType parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.assessment.vo.lookups.CopyLastAssessmentContextType(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setCopyLastFromContext(voLookup17);
		}
				// AssessmentRoles
		valueObject.setAssessmentRoles(ims.assessment.vo.domain.AssessmentRoleVoAssembler.createAssessmentRoleVoCollectionFromAssessmentRole(map, domainObject.getAssessmentRoles()) );
		// Category
		ims.domain.lookups.LookupInstance instance19 = domainObject.getCategory();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UserAssessmentCategory voLookup19 = new ims.core.vo.lookups.UserAssessmentCategory(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.UserAssessmentCategory parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.core.vo.lookups.UserAssessmentCategory(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setCategory(voLookup19);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.UserAssessment extractUserAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.User_AssessmentVo valueObject) 
	{
		return 	extractUserAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.UserAssessment extractUserAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.User_AssessmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_UserAssessment();
		ims.assessment.configuration.domain.objects.UserAssessment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.UserAssessment)domMap.get(valueObject);
			}
			// ims.assessment.vo.User_AssessmentVo ID_UserAssessment field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.UserAssessment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_UserAssessment());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.UserAssessment)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.UserAssessment) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.UserAssessment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_UserAssessment());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setGroupQuestionWidth(valueObject.getGroupQuestionWidth());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHelpURL() != null && valueObject.getHelpURL().equals(""))
		{
			valueObject.setHelpURL(null);
		}
		domainObject.setHelpURL(valueObject.getHelpURL());
		domainObject.setIsFlatView(valueObject.getIsFlatView());
		domainObject.setIsMultipleGroup(valueObject.getIsMultipleGroup());
		domainObject.setQuestionGroups(ims.assessment.vo.domain.Assessment_QuestionGroupVoAssembler.extractAssessmentQuestionGroupList(domainFactory, valueObject.getQuestionGroups(), domainObject.getQuestionGroups(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHeaderText() != null && valueObject.getHeaderText().equals(""))
		{
			valueObject.setHeaderText(null);
		}
		domainObject.setHeaderText(valueObject.getHeaderText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFooterText() != null && valueObject.getFooterText().equals(""))
		{
			valueObject.setFooterText(null);
		}
		domainObject.setFooterText(valueObject.getFooterText());
		domainObject.setMaxHeaderHeight(valueObject.getMaxHeaderHeight());
		domainObject.setMaxFooterHeight(valueObject.getMaxFooterHeight());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getAssessmentType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getAssessmentType().getID());
		}
		domainObject.setAssessmentType(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getScoringMethod() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getScoringMethod().getID());
		}
		domainObject.setScoringMethod(value13);
		ims.core.admin.domain.objects.TemplateBo value14 = null;
		if ( null != valueObject.getAssociatedReport() ) 
		{
			if (valueObject.getAssociatedReport().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedReport()) != null)
				{
					value14 = (ims.core.admin.domain.objects.TemplateBo)domMap.get(valueObject.getAssociatedReport());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getAssociatedReport();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.TemplateBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, valueObject.getAssociatedReport().getBoId());
			}
		}
		domainObject.setAssociatedReport(value14);
		domainObject.setStorePrintedAssessment(valueObject.getStorePrintedAssessment());
		domainObject.setCanCopyLast(valueObject.getCanCopyLast());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getCopyLastFromContext() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getCopyLastFromContext().getID());
		}
		domainObject.setCopyLastFromContext(value17);

		// SaveAsRefVO treated as RefValueObject
		ims.assessment.configuration.vo.AssessmentRoleRefVoCollection refCollection18 = new ims.assessment.configuration.vo.AssessmentRoleRefVoCollection();
		if (valueObject.getAssessmentRoles() != null)
		{
			for (int i18=0; i18<valueObject.getAssessmentRoles().size(); i18++)
			{
				ims.assessment.configuration.vo.AssessmentRoleRefVo ref18 = (ims.assessment.configuration.vo.AssessmentRoleRefVo)valueObject.getAssessmentRoles().get(i18);
				refCollection18.add(ref18);
			}
		}
		int size18 = (null == refCollection18) ? 0 : refCollection18.size();		
		java.util.Set domainAssessmentRoles18 = domainObject.getAssessmentRoles();
		if (domainAssessmentRoles18 == null)
		{
			domainAssessmentRoles18 = new java.util.HashSet();
		}
		java.util.Set newSet18  = new java.util.HashSet();
		for(int i=0; i<size18; i++) 
		{
			ims.assessment.configuration.vo.AssessmentRoleRefVo vo = refCollection18.get(i);					
			ims.assessment.configuration.domain.objects.AssessmentRole dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.assessment.configuration.domain.objects.AssessmentRole)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.assessment.configuration.domain.objects.AssessmentRole)domainFactory.getDomainObject( ims.assessment.configuration.domain.objects.AssessmentRole.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainAssessmentRoles18.contains(dom))
			{
				domainAssessmentRoles18.add(dom);
			}
			newSet18.add(dom);			
		}
		java.util.Set removedSet18 = new java.util.HashSet();
		java.util.Iterator iter18 = domainAssessmentRoles18.iterator();
		//Find out which objects need to be removed
		while (iter18.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter18.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet18.contains(o))
			{
				removedSet18.add(o);
			}
		}
		iter18 = removedSet18.iterator();
		//Remove the unwanted objects
		while (iter18.hasNext())
		{
			domainAssessmentRoles18.remove(iter18.next());
		}		
		
		domainObject.setAssessmentRoles(domainAssessmentRoles18);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value19);

		return domainObject;
	}

}
