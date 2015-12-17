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
 * @author Vasile Purdila
 */
public class UserAssessmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.UserAssessmentVo copy(ims.assessment.vo.UserAssessmentVo valueObjectDest, ims.assessment.vo.UserAssessmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_UserAssessment(valueObjectSrc.getID_UserAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// QuestionGroups
		valueObjectDest.setQuestionGroups(valueObjectSrc.getQuestionGroups());
		// isMultiRole
		valueObjectDest.setIsMultiRole(valueObjectSrc.getIsMultiRole());
		// AssessmentRoles
		valueObjectDest.setAssessmentRoles(valueObjectSrc.getAssessmentRoles());
		// HeaderText
		valueObjectDest.setHeaderText(valueObjectSrc.getHeaderText());
		// FooterText
		valueObjectDest.setFooterText(valueObjectSrc.getFooterText());
		// MaxHeaderHeight
		valueObjectDest.setMaxHeaderHeight(valueObjectSrc.getMaxHeaderHeight());
		// MaxFooterHeight
		valueObjectDest.setMaxFooterHeight(valueObjectSrc.getMaxFooterHeight());
		// AssociatedReport
		valueObjectDest.setAssociatedReport(valueObjectSrc.getAssociatedReport());
		// AssessmentSpecialties
		valueObjectDest.setAssessmentSpecialties(valueObjectSrc.getAssessmentSpecialties());
		// canCopyLast
		valueObjectDest.setCanCopyLast(valueObjectSrc.getCanCopyLast());
		// CopyLastFromContext
		valueObjectDest.setCopyLastFromContext(valueObjectSrc.getCopyLastFromContext());
		// TaxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// Services
		valueObjectDest.setServices(valueObjectSrc.getServices());
		// ScoringMethod
		valueObjectDest.setScoringMethod(valueObjectSrc.getScoringMethod());
		// isFlatView
		valueObjectDest.setIsFlatView(valueObjectSrc.getIsFlatView());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// isMultipleGroup
		valueObjectDest.setIsMultipleGroup(valueObjectSrc.getIsMultipleGroup());
		// GroupQuestionWidth
		valueObjectDest.setGroupQuestionWidth(valueObjectSrc.getGroupQuestionWidth());
		// StorePrintedAssessment
		valueObjectDest.setStorePrintedAssessment(valueObjectSrc.getStorePrintedAssessment());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// AssessmentType
		valueObjectDest.setAssessmentType(valueObjectSrc.getAssessmentType());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// HelpURL
		valueObjectDest.setHelpURL(valueObjectSrc.getHelpURL());
		// SystemInfo
		valueObjectDest.setSystemInfo(valueObjectSrc.getSystemInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createUserAssessmentVoCollectionFromUserAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.UserAssessmentVoCollection createUserAssessmentVoCollectionFromUserAssessment(java.util.Set domainObjectSet)	
	{
		return createUserAssessmentVoCollectionFromUserAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.UserAssessmentVoCollection createUserAssessmentVoCollectionFromUserAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.UserAssessmentVoCollection voList = new ims.assessment.vo.UserAssessmentVoCollection();
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
			ims.assessment.vo.UserAssessmentVo vo = create(map, domainObject);
			
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
	public static ims.assessment.vo.UserAssessmentVoCollection createUserAssessmentVoCollectionFromUserAssessment(java.util.List domainObjectList) 
	{
		return createUserAssessmentVoCollectionFromUserAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.UserAssessment objects.
	 */
	public static ims.assessment.vo.UserAssessmentVoCollection createUserAssessmentVoCollectionFromUserAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.UserAssessmentVoCollection voList = new ims.assessment.vo.UserAssessmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = (ims.assessment.configuration.domain.objects.UserAssessment) domainObjectList.get(i);
			ims.assessment.vo.UserAssessmentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractUserAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.UserAssessmentVoCollection voCollection) 
	 {
	 	return extractUserAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractUserAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.UserAssessmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.UserAssessmentVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = UserAssessmentVoAssembler.extractUserAssessment(domainFactory, vo, domMap);

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
	 public static java.util.List extractUserAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.UserAssessmentVoCollection voCollection) 
	 {
	 	return extractUserAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractUserAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.UserAssessmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.UserAssessmentVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.UserAssessment domainObject = UserAssessmentVoAssembler.extractUserAssessment(domainFactory, vo, domMap);

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
	 public static ims.assessment.vo.UserAssessmentVo create(ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
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
	  public static ims.assessment.vo.UserAssessmentVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.UserAssessmentVo valueObject = (ims.assessment.vo.UserAssessmentVo) map.getValueObject(domainObject, ims.assessment.vo.UserAssessmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.UserAssessmentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.assessment.vo.UserAssessmentVo insert(ims.assessment.vo.UserAssessmentVo valueObject, ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
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
	 public static ims.assessment.vo.UserAssessmentVo insert(DomainObjectMap map, ims.assessment.vo.UserAssessmentVo valueObject, ims.assessment.configuration.domain.objects.UserAssessment domainObject) 
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
			
		// QuestionGroups
		valueObject.setQuestionGroups(ims.core.vo.domain.AssessmentQuestionGroupVoAssembler.createAssessmentQuestionGroupVoCollectionFromAssessmentQuestionGroup(map, domainObject.getQuestionGroups()) );
		// isMultiRole
		valueObject.setIsMultiRole( domainObject.isIsMultiRole() );
		// AssessmentRoles
		valueObject.setAssessmentRoles(ims.assessment.vo.domain.AssessmentRoleVoAssembler.createAssessmentRoleVoCollectionFromAssessmentRole(map, domainObject.getAssessmentRoles()) );
		// HeaderText
		valueObject.setHeaderText(domainObject.getHeaderText());
		// FooterText
		valueObject.setFooterText(domainObject.getFooterText());
		// MaxHeaderHeight
		valueObject.setMaxHeaderHeight(domainObject.getMaxHeaderHeight());
		// MaxFooterHeight
		valueObject.setMaxFooterHeight(domainObject.getMaxFooterHeight());
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
		// AssessmentSpecialties
		java.util.List listAssessmentSpecialties = domainObject.getAssessmentSpecialties();
		ims.core.vo.lookups.SpecialtyCollection AssessmentSpecialties = new ims.core.vo.lookups.SpecialtyCollection();
		for(java.util.Iterator iterator = listAssessmentSpecialties.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.Specialty voInstance = new ims.core.vo.lookups.Specialty(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.Specialty(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AssessmentSpecialties.add(voInstance);
		}
		valueObject.setAssessmentSpecialties( AssessmentSpecialties );
		// canCopyLast
		valueObject.setCanCopyLast( domainObject.isCanCopyLast() );
		// CopyLastFromContext
		ims.domain.lookups.LookupInstance instance11 = domainObject.getCopyLastFromContext();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.assessment.vo.lookups.CopyLastAssessmentContextType voLookup11 = new ims.assessment.vo.lookups.CopyLastAssessmentContextType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.assessment.vo.lookups.CopyLastAssessmentContextType parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.assessment.vo.lookups.CopyLastAssessmentContextType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setCopyLastFromContext(voLookup11);
		}
				// TaxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// Services
		valueObject.setServices(ims.core.vo.domain.ServiceShortVoAssembler.createServiceShortVoCollectionFromService(map, domainObject.getServices()) );
		// ScoringMethod
		ims.domain.lookups.LookupInstance instance14 = domainObject.getScoringMethod();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UserAssessmentScoringMethod voLookup14 = new ims.core.vo.lookups.UserAssessmentScoringMethod(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.UserAssessmentScoringMethod parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.UserAssessmentScoringMethod(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setScoringMethod(voLookup14);
		}
				// isFlatView
		valueObject.setIsFlatView( domainObject.isIsFlatView() );
		// Category
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCategory();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UserAssessmentCategory voLookup16 = new ims.core.vo.lookups.UserAssessmentCategory(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.UserAssessmentCategory parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.UserAssessmentCategory(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCategory(voLookup16);
		}
				// isMultipleGroup
		valueObject.setIsMultipleGroup( domainObject.isIsMultipleGroup() );
		// GroupQuestionWidth
		valueObject.setGroupQuestionWidth(domainObject.getGroupQuestionWidth());
		// StorePrintedAssessment
		valueObject.setStorePrintedAssessment( domainObject.isStorePrintedAssessment() );
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// AssessmentType
		ims.domain.lookups.LookupInstance instance22 = domainObject.getAssessmentType();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.UserDefinedAssessmentType voLookup22 = new ims.core.vo.lookups.UserDefinedAssessmentType(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.core.vo.lookups.UserDefinedAssessmentType parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.core.vo.lookups.UserDefinedAssessmentType(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setAssessmentType(voLookup22);
		}
				// ActiveStatus
		ims.domain.lookups.LookupInstance instance23 = domainObject.getActiveStatus();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup23 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setActiveStatus(voLookup23);
		}
				// HelpURL
		valueObject.setHelpURL(domainObject.getHelpURL());
		// SystemInfo
		// set system information
		valueObject.setSystemInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.UserAssessment extractUserAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.UserAssessmentVo valueObject) 
	{
		return 	extractUserAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.UserAssessment extractUserAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.UserAssessmentVo valueObject, HashMap domMap) 
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
			// ims.assessment.vo.UserAssessmentVo ID_UserAssessment field is unknown
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

		domainObject.setQuestionGroups(ims.core.vo.domain.AssessmentQuestionGroupVoAssembler.extractAssessmentQuestionGroupList(domainFactory, valueObject.getQuestionGroups(), domainObject.getQuestionGroups(), domMap));		
		domainObject.setIsMultiRole(valueObject.getIsMultiRole());
		domainObject.setAssessmentRoles(ims.assessment.vo.domain.AssessmentRoleVoAssembler.extractAssessmentRoleSet(domainFactory, valueObject.getAssessmentRoles(), domainObject.getAssessmentRoles(), domMap));		
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
		ims.core.admin.domain.objects.TemplateBo value8 = null;
		if ( null != valueObject.getAssociatedReport() ) 
		{
			if (valueObject.getAssociatedReport().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedReport()) != null)
				{
					value8 = (ims.core.admin.domain.objects.TemplateBo)domMap.get(valueObject.getAssociatedReport());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getAssociatedReport();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.TemplateBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, valueObject.getAssociatedReport().getBoId());
			}
		}
		domainObject.setAssociatedReport(value8);
		ims.core.vo.lookups.SpecialtyCollection collection9 =
	valueObject.getAssessmentSpecialties();
	    java.util.List domainAssessmentSpecialties = domainObject.getAssessmentSpecialties();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainAssessmentSpecialties = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAssessmentSpecialties.indexOf(dom);
			if (domIdx == -1)
			{
				domainAssessmentSpecialties.add(i, dom);
			}
			else if (i != domIdx && i < domainAssessmentSpecialties.size())
			{
				Object tmp = domainAssessmentSpecialties.get(i);
				domainAssessmentSpecialties.set(i, domainAssessmentSpecialties.get(domIdx));
				domainAssessmentSpecialties.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainAssessmentSpecialties.size();
		while (j9 > collection9Size)
		{
			domainAssessmentSpecialties.remove(j9-1);
			j9 = domainAssessmentSpecialties.size();
		}

		domainObject.setAssessmentSpecialties(domainAssessmentSpecialties);		
		domainObject.setCanCopyLast(valueObject.getCanCopyLast());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getCopyLastFromContext() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getCopyLastFromContext().getID());
		}
		domainObject.setCopyLastFromContext(value11);
		domainObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getTaxonomyMap(), domainObject.getTaxonomyMap(), domMap));		

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ServiceRefVoCollection refCollection13 = new ims.core.clinical.vo.ServiceRefVoCollection();
		if (valueObject.getServices() != null)
		{
			for (int i13=0; i13<valueObject.getServices().size(); i13++)
			{
				ims.core.clinical.vo.ServiceRefVo ref13 = (ims.core.clinical.vo.ServiceRefVo)valueObject.getServices().get(i13);
				refCollection13.add(ref13);
			}
		}
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.List domainServices13 = domainObject.getServices();
		if (domainServices13 == null)
		{
			domainServices13 = new java.util.ArrayList();
		}
		for(int i=0; i < size13; i++) 
		{
			ims.core.clinical.vo.ServiceRefVo vo = refCollection13.get(i);			
			ims.core.clinical.domain.objects.Service dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Service)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Service.class, vo.getBoId());
				}
			}

			int domIdx = domainServices13.indexOf(dom);
			if (domIdx == -1)
			{
				domainServices13.add(i, dom);
			}
			else if (i != domIdx && i < domainServices13.size())
			{
				Object tmp = domainServices13.get(i);
				domainServices13.set(i, domainServices13.get(domIdx));
				domainServices13.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i13 = domainServices13.size();
		while (i13 > size13)
		{
			domainServices13.remove(i13-1);
			i13 = domainServices13.size();
		}
		
		domainObject.setServices(domainServices13);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getScoringMethod() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getScoringMethod().getID());
		}
		domainObject.setScoringMethod(value14);
		domainObject.setIsFlatView(valueObject.getIsFlatView());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value16);
		domainObject.setIsMultipleGroup(valueObject.getIsMultipleGroup());
		domainObject.setGroupQuestionWidth(valueObject.getGroupQuestionWidth());
		domainObject.setStorePrintedAssessment(valueObject.getStorePrintedAssessment());
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getAssessmentType() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getAssessmentType().getID());
		}
		domainObject.setAssessmentType(value22);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value23);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHelpURL() != null && valueObject.getHelpURL().equals(""))
		{
			valueObject.setHelpURL(null);
		}
		domainObject.setHelpURL(valueObject.getHelpURL());

		return domainObject;
	}

}
