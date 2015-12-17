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
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class OPDErectDysfxnVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.OPDErectDysfxnVo copy(ims.generalmedical.vo.OPDErectDysfxnVo valueObjectDest, ims.generalmedical.vo.OPDErectDysfxnVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPDErectDysfxn(valueObjectSrc.getID_OPDErectDysfxn());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ErectionQual
		valueObjectDest.setErectionQual(valueObjectSrc.getErectionQual());
		// ConsetnFormSigned
		valueObjectDest.setConsetnFormSigned(valueObjectSrc.getConsetnFormSigned());
		// TreatDiscussed
		valueObjectDest.setTreatDiscussed(valueObjectSrc.getTreatDiscussed());
		// AdvLeafletGiven
		valueObjectDest.setAdvLeafletGiven(valueObjectSrc.getAdvLeafletGiven());
		// ActualLeafletsGiven
		valueObjectDest.setActualLeafletsGiven(valueObjectSrc.getActualLeafletsGiven());
		// ActualTreatmentDiscussed
		valueObjectDest.setActualTreatmentDiscussed(valueObjectSrc.getActualTreatmentDiscussed());
		// TreatmentHistory
		valueObjectDest.setTreatmentHistory(valueObjectSrc.getTreatmentHistory());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDErectDysfxn objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysfxnVoCollection createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(java.util.Set domainObjectSet)	
	{
		return createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDErectDysfxn objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysfxnVoCollection createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.OPDErectDysfxnVoCollection voList = new ims.generalmedical.vo.OPDErectDysfxnVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.OPDErectDysfxn domainObject = (ims.medical.domain.objects.OPDErectDysfxn) iterator.next();
			ims.generalmedical.vo.OPDErectDysfxnVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDErectDysfxn objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysfxnVoCollection createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(java.util.List domainObjectList) 
	{
		return createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDErectDysfxn objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysfxnVoCollection createOPDErectDysfxnVoCollectionFromOPDErectDysfxn(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.OPDErectDysfxnVoCollection voList = new ims.generalmedical.vo.OPDErectDysfxnVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.OPDErectDysfxn domainObject = (ims.medical.domain.objects.OPDErectDysfxn) domainObjectList.get(i);
			ims.generalmedical.vo.OPDErectDysfxnVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.OPDErectDysfxn set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPDErectDysfxnSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysfxnVoCollection voCollection) 
	 {
	 	return extractOPDErectDysfxnSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPDErectDysfxnSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysfxnVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDErectDysfxnVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDErectDysfxn domainObject = OPDErectDysfxnVoAssembler.extractOPDErectDysfxn(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.OPDErectDysfxn list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPDErectDysfxnList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysfxnVoCollection voCollection) 
	 {
	 	return extractOPDErectDysfxnList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPDErectDysfxnList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysfxnVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDErectDysfxnVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDErectDysfxn domainObject = OPDErectDysfxnVoAssembler.extractOPDErectDysfxn(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.OPDErectDysfxn object.
	 * @param domainObject ims.medical.domain.objects.OPDErectDysfxn
	 */
	 public static ims.generalmedical.vo.OPDErectDysfxnVo create(ims.medical.domain.objects.OPDErectDysfxn domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.OPDErectDysfxn object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.OPDErectDysfxnVo create(DomainObjectMap map, ims.medical.domain.objects.OPDErectDysfxn domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.OPDErectDysfxnVo valueObject = (ims.generalmedical.vo.OPDErectDysfxnVo) map.getValueObject(domainObject, ims.generalmedical.vo.OPDErectDysfxnVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.OPDErectDysfxnVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.OPDErectDysfxn
	 */
	 public static ims.generalmedical.vo.OPDErectDysfxnVo insert(ims.generalmedical.vo.OPDErectDysfxnVo valueObject, ims.medical.domain.objects.OPDErectDysfxn domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.OPDErectDysfxn
	 */
	 public static ims.generalmedical.vo.OPDErectDysfxnVo insert(DomainObjectMap map, ims.generalmedical.vo.OPDErectDysfxnVo valueObject, ims.medical.domain.objects.OPDErectDysfxn domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPDErectDysfxn(domainObject.getId());
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
			
		// ErectionQual
		ims.domain.lookups.LookupInstance instance1 = domainObject.getErectionQual();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.ErectDysfxnErectQual voLookup1 = new ims.spinalinjuries.vo.lookups.ErectDysfxnErectQual(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.ErectDysfxnErectQual parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.ErectDysfxnErectQual(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setErectionQual(voLookup1);
		}
				// ConsetnFormSigned
		ims.domain.lookups.LookupInstance instance2 = domainObject.getConsetnFormSigned();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setConsetnFormSigned(voLookup2);
		}
				// TreatDiscussed
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTreatDiscussed();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTreatDiscussed(voLookup3);
		}
				// AdvLeafletGiven
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAdvLeafletGiven();
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

			ims.core.vo.lookups.YesNoUnknown voLookup4 = new ims.core.vo.lookups.YesNoUnknown(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNoUnknown(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAdvLeafletGiven(voLookup4);
		}
				// ActualLeafletsGiven
		java.util.List listActualLeafletsGiven = domainObject.getActualLeafletsGiven();
		ims.core.vo.lookups.AdviceLeafletsCollection ActualLeafletsGiven = new ims.core.vo.lookups.AdviceLeafletsCollection();
		for(java.util.Iterator iterator = listActualLeafletsGiven.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.AdviceLeaflets voInstance = new ims.core.vo.lookups.AdviceLeaflets(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.AdviceLeaflets parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.AdviceLeaflets(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ActualLeafletsGiven.add(voInstance);
		}
		valueObject.setActualLeafletsGiven( ActualLeafletsGiven );
		// ActualTreatmentDiscussed
		java.util.List listActualTreatmentDiscussed = domainObject.getActualTreatmentDiscussed();
		ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGivenCollection ActualTreatmentDiscussed = new ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGivenCollection();
		for(java.util.Iterator iterator = listActualTreatmentDiscussed.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven voInstance = new ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ActualTreatmentDiscussed.add(voInstance);
		}
		valueObject.setActualTreatmentDiscussed( ActualTreatmentDiscussed );
		// TreatmentHistory
		valueObject.setTreatmentHistory(ims.generalmedical.vo.domain.OPDErectDysTreatmentsVoAssembler.createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(map, domainObject.getTreatmentHistory()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.OPDErectDysfxn extractOPDErectDysfxn(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysfxnVo valueObject) 
	{
		return 	extractOPDErectDysfxn(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.OPDErectDysfxn extractOPDErectDysfxn(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysfxnVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPDErectDysfxn();
		ims.medical.domain.objects.OPDErectDysfxn domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.OPDErectDysfxn)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.OPDErectDysfxnVo ID_OPDErectDysfxn field is unknown
			domainObject = new ims.medical.domain.objects.OPDErectDysfxn();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPDErectDysfxn());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.OPDErectDysfxn)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.OPDErectDysfxn) domainFactory.getDomainObject(ims.medical.domain.objects.OPDErectDysfxn.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPDErectDysfxn());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getErectionQual() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getErectionQual().getID());
		}
		domainObject.setErectionQual(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getConsetnFormSigned() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getConsetnFormSigned().getID());
		}
		domainObject.setConsetnFormSigned(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTreatDiscussed() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTreatDiscussed().getID());
		}
		domainObject.setTreatDiscussed(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAdvLeafletGiven() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAdvLeafletGiven().getID());
		}
		domainObject.setAdvLeafletGiven(value4);
		ims.core.vo.lookups.AdviceLeafletsCollection collection5 =
	valueObject.getActualLeafletsGiven();
	    java.util.List domainActualLeafletsGiven = domainObject.getActualLeafletsGiven();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainActualLeafletsGiven = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainActualLeafletsGiven.indexOf(dom);
			if (domIdx == -1)
			{
				domainActualLeafletsGiven.add(i, dom);
			}
			else if (i != domIdx && i < domainActualLeafletsGiven.size())
			{
				Object tmp = domainActualLeafletsGiven.get(i);
				domainActualLeafletsGiven.set(i, domainActualLeafletsGiven.get(domIdx));
				domainActualLeafletsGiven.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainActualLeafletsGiven.size();
		while (j5 > collection5Size)
		{
			domainActualLeafletsGiven.remove(j5-1);
			j5 = domainActualLeafletsGiven.size();
		}

		domainObject.setActualLeafletsGiven(domainActualLeafletsGiven);		
		ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGivenCollection collection6 =
	valueObject.getActualTreatmentDiscussed();
	    java.util.List domainActualTreatmentDiscussed = domainObject.getActualTreatmentDiscussed();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainActualTreatmentDiscussed = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainActualTreatmentDiscussed.indexOf(dom);
			if (domIdx == -1)
			{
				domainActualTreatmentDiscussed.add(i, dom);
			}
			else if (i != domIdx && i < domainActualTreatmentDiscussed.size())
			{
				Object tmp = domainActualTreatmentDiscussed.get(i);
				domainActualTreatmentDiscussed.set(i, domainActualTreatmentDiscussed.get(domIdx));
				domainActualTreatmentDiscussed.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainActualTreatmentDiscussed.size();
		while (j6 > collection6Size)
		{
			domainActualTreatmentDiscussed.remove(j6-1);
			j6 = domainActualTreatmentDiscussed.size();
		}

		domainObject.setActualTreatmentDiscussed(domainActualTreatmentDiscussed);		
		domainObject.setTreatmentHistory(ims.generalmedical.vo.domain.OPDErectDysTreatmentsVoAssembler.extractOPDErectDysfxTreatmentsSet(domainFactory, valueObject.getTreatmentHistory(), domainObject.getTreatmentHistory(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value8 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value8 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value8);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
