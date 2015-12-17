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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class ActualPlanDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.ActualPlanDetailsVo copy(ims.oncology.vo.ActualPlanDetailsVo valueObjectDest, ims.oncology.vo.ActualPlanDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ActualPlanDetails(valueObjectSrc.getID_ActualPlanDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// PlannedTreatmentType
		valueObjectDest.setPlannedTreatmentType(valueObjectSrc.getPlannedTreatmentType());
		// OrganisationPlanned
		valueObjectDest.setOrganisationPlanned(valueObjectSrc.getOrganisationPlanned());
		// ActualTreatmentDate
		valueObjectDest.setActualTreatmentDate(valueObjectSrc.getActualTreatmentDate());
		// ActualTreatmentType
		valueObjectDest.setActualTreatmentType(valueObjectSrc.getActualTreatmentType());
		// OrganisationOrganised
		valueObjectDest.setOrganisationOrganised(valueObjectSrc.getOrganisationOrganised());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createActualPlanDetailsVoCollectionFromActualPlanDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ActualPlanDetails objects.
	 */
	public static ims.oncology.vo.ActualPlanDetailsVoCollection createActualPlanDetailsVoCollectionFromActualPlanDetails(java.util.Set domainObjectSet)	
	{
		return createActualPlanDetailsVoCollectionFromActualPlanDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ActualPlanDetails objects.
	 */
	public static ims.oncology.vo.ActualPlanDetailsVoCollection createActualPlanDetailsVoCollectionFromActualPlanDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.ActualPlanDetailsVoCollection voList = new ims.oncology.vo.ActualPlanDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.ActualPlanDetails domainObject = (ims.oncology.domain.objects.ActualPlanDetails) iterator.next();
			ims.oncology.vo.ActualPlanDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.ActualPlanDetails objects.
	 */
	public static ims.oncology.vo.ActualPlanDetailsVoCollection createActualPlanDetailsVoCollectionFromActualPlanDetails(java.util.List domainObjectList) 
	{
		return createActualPlanDetailsVoCollectionFromActualPlanDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ActualPlanDetails objects.
	 */
	public static ims.oncology.vo.ActualPlanDetailsVoCollection createActualPlanDetailsVoCollectionFromActualPlanDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.ActualPlanDetailsVoCollection voList = new ims.oncology.vo.ActualPlanDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ActualPlanDetails domainObject = (ims.oncology.domain.objects.ActualPlanDetails) domainObjectList.get(i);
			ims.oncology.vo.ActualPlanDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.ActualPlanDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractActualPlanDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ActualPlanDetailsVoCollection voCollection) 
	 {
	 	return extractActualPlanDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractActualPlanDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ActualPlanDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ActualPlanDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ActualPlanDetails domainObject = ActualPlanDetailsVoAssembler.extractActualPlanDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.ActualPlanDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractActualPlanDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ActualPlanDetailsVoCollection voCollection) 
	 {
	 	return extractActualPlanDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractActualPlanDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ActualPlanDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ActualPlanDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ActualPlanDetails domainObject = ActualPlanDetailsVoAssembler.extractActualPlanDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.ActualPlanDetails object.
	 * @param domainObject ims.oncology.domain.objects.ActualPlanDetails
	 */
	 public static ims.oncology.vo.ActualPlanDetailsVo create(ims.oncology.domain.objects.ActualPlanDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.ActualPlanDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.ActualPlanDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.ActualPlanDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.ActualPlanDetailsVo valueObject = (ims.oncology.vo.ActualPlanDetailsVo) map.getValueObject(domainObject, ims.oncology.vo.ActualPlanDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.ActualPlanDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.ActualPlanDetails
	 */
	 public static ims.oncology.vo.ActualPlanDetailsVo insert(ims.oncology.vo.ActualPlanDetailsVo valueObject, ims.oncology.domain.objects.ActualPlanDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.ActualPlanDetails
	 */
	 public static ims.oncology.vo.ActualPlanDetailsVo insert(DomainObjectMap map, ims.oncology.vo.ActualPlanDetailsVo valueObject, ims.oncology.domain.objects.ActualPlanDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ActualPlanDetails(domainObject.getId());
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
			
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// PlannedTreatmentType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPlannedTreatmentType();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.TreatmentType voLookup3 = new ims.oncology.vo.lookups.TreatmentType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.TreatmentType parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.TreatmentType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPlannedTreatmentType(voLookup3);
		}
				// OrganisationPlanned
		ims.domain.lookups.LookupInstance instance4 = domainObject.getOrganisationPlanned();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.OrganisationPlannedTreatment voLookup4 = new ims.oncology.vo.lookups.OrganisationPlannedTreatment(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.OrganisationPlannedTreatment parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.OrganisationPlannedTreatment(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setOrganisationPlanned(voLookup4);
		}
				// ActualTreatmentDate
		java.util.Date ActualTreatmentDate = domainObject.getActualTreatmentDate();
		if ( null != ActualTreatmentDate ) 
		{
			valueObject.setActualTreatmentDate(new ims.framework.utils.Date(ActualTreatmentDate) );
		}
		// ActualTreatmentType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getActualTreatmentType();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.TreatmentType voLookup6 = new ims.oncology.vo.lookups.TreatmentType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.TreatmentType parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.TreatmentType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setActualTreatmentType(voLookup6);
		}
				// OrganisationOrganised
		ims.domain.lookups.LookupInstance instance7 = domainObject.getOrganisationOrganised();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.OrganisationOrganisedTreatment voLookup7 = new ims.oncology.vo.lookups.OrganisationOrganisedTreatment(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.OrganisationOrganisedTreatment parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.OrganisationOrganisedTreatment(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setOrganisationOrganised(voLookup7);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ActualPlanDetails extractActualPlanDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ActualPlanDetailsVo valueObject) 
	{
		return 	extractActualPlanDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ActualPlanDetails extractActualPlanDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ActualPlanDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ActualPlanDetails();
		ims.oncology.domain.objects.ActualPlanDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.ActualPlanDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.ActualPlanDetailsVo ID_ActualPlanDetails field is unknown
			domainObject = new ims.oncology.domain.objects.ActualPlanDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ActualPlanDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.ActualPlanDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.ActualPlanDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.ActualPlanDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ActualPlanDetails());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateDecisionToTreat();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateDecisionToTreat(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPlannedTreatmentType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPlannedTreatmentType().getID());
		}
		domainObject.setPlannedTreatmentType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getOrganisationPlanned() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getOrganisationPlanned().getID());
		}
		domainObject.setOrganisationPlanned(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getActualTreatmentDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setActualTreatmentDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getActualTreatmentType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getActualTreatmentType().getID());
		}
		domainObject.setActualTreatmentType(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getOrganisationOrganised() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getOrganisationOrganised().getID());
		}
		domainObject.setOrganisationOrganised(value7);

		return domainObject;
	}

}
