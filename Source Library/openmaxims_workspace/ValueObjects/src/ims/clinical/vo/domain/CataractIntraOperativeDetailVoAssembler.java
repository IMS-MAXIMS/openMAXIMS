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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Calin Perebiceanu
 */
public class CataractIntraOperativeDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.CataractIntraOperativeDetailVo copy(ims.clinical.vo.CataractIntraOperativeDetailVo valueObjectDest, ims.clinical.vo.CataractIntraOperativeDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CataractIntraOperative(valueObjectSrc.getID_CataractIntraOperative());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Medications
		valueObjectDest.setMedications(valueObjectSrc.getMedications());
		// SkinPreperationUsed
		valueObjectDest.setSkinPreperationUsed(valueObjectSrc.getSkinPreperationUsed());
		// LocalAnaestheticUsed
		valueObjectDest.setLocalAnaestheticUsed(valueObjectSrc.getLocalAnaestheticUsed());
		// Dressings
		valueObjectDest.setDressings(valueObjectSrc.getDressings());
		// SwabNeedleCount
		valueObjectDest.setSwabNeedleCount(valueObjectSrc.getSwabNeedleCount());
		// wasSwabNeedleCountCorrect
		valueObjectDest.setWasSwabNeedleCountCorrect(valueObjectSrc.getWasSwabNeedleCountCorrect());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.CataractIntraOperative objects.
	 */
	public static ims.clinical.vo.CataractIntraOperativeDetailVoCollection createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(java.util.Set domainObjectSet)	
	{
		return createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.CataractIntraOperative objects.
	 */
	public static ims.clinical.vo.CataractIntraOperativeDetailVoCollection createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.CataractIntraOperativeDetailVoCollection voList = new ims.clinical.vo.CataractIntraOperativeDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.CataractIntraOperative domainObject = (ims.core.clinical.domain.objects.CataractIntraOperative) iterator.next();
			ims.clinical.vo.CataractIntraOperativeDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.CataractIntraOperative objects.
	 */
	public static ims.clinical.vo.CataractIntraOperativeDetailVoCollection createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(java.util.List domainObjectList) 
	{
		return createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.CataractIntraOperative objects.
	 */
	public static ims.clinical.vo.CataractIntraOperativeDetailVoCollection createCataractIntraOperativeDetailVoCollectionFromCataractIntraOperative(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.CataractIntraOperativeDetailVoCollection voList = new ims.clinical.vo.CataractIntraOperativeDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.CataractIntraOperative domainObject = (ims.core.clinical.domain.objects.CataractIntraOperative) domainObjectList.get(i);
			ims.clinical.vo.CataractIntraOperativeDetailVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.CataractIntraOperative set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCataractIntraOperativeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CataractIntraOperativeDetailVoCollection voCollection) 
	 {
	 	return extractCataractIntraOperativeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCataractIntraOperativeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CataractIntraOperativeDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.CataractIntraOperativeDetailVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.CataractIntraOperative domainObject = CataractIntraOperativeDetailVoAssembler.extractCataractIntraOperative(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.CataractIntraOperative list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCataractIntraOperativeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CataractIntraOperativeDetailVoCollection voCollection) 
	 {
	 	return extractCataractIntraOperativeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCataractIntraOperativeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CataractIntraOperativeDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.CataractIntraOperativeDetailVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.CataractIntraOperative domainObject = CataractIntraOperativeDetailVoAssembler.extractCataractIntraOperative(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.CataractIntraOperative object.
	 * @param domainObject ims.core.clinical.domain.objects.CataractIntraOperative
	 */
	 public static ims.clinical.vo.CataractIntraOperativeDetailVo create(ims.core.clinical.domain.objects.CataractIntraOperative domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.CataractIntraOperative object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.CataractIntraOperativeDetailVo create(DomainObjectMap map, ims.core.clinical.domain.objects.CataractIntraOperative domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.CataractIntraOperativeDetailVo valueObject = (ims.clinical.vo.CataractIntraOperativeDetailVo) map.getValueObject(domainObject, ims.clinical.vo.CataractIntraOperativeDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.CataractIntraOperativeDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.CataractIntraOperative
	 */
	 public static ims.clinical.vo.CataractIntraOperativeDetailVo insert(ims.clinical.vo.CataractIntraOperativeDetailVo valueObject, ims.core.clinical.domain.objects.CataractIntraOperative domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.CataractIntraOperative
	 */
	 public static ims.clinical.vo.CataractIntraOperativeDetailVo insert(DomainObjectMap map, ims.clinical.vo.CataractIntraOperativeDetailVo valueObject, ims.core.clinical.domain.objects.CataractIntraOperative domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CataractIntraOperative(domainObject.getId());
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
			
		// Medications
		valueObject.setMedications(ims.core.vo.domain.PatientMedicationLiteVoAssembler.createPatientMedicationLiteVoCollectionFromPatientMedication(map, domainObject.getMedications()) );
		// SkinPreperationUsed
		valueObject.setSkinPreperationUsed(ims.clinical.vo.domain.SkinPreperationVoAssembler.createSkinPreperationVoCollectionFromSkinPreperation(map, domainObject.getSkinPreperationUsed()) );
		// LocalAnaestheticUsed
		valueObject.setLocalAnaestheticUsed(ims.clinical.vo.domain.LocalAnaestheticAdministeredVoAssembler.createLocalAnaestheticAdministeredVoCollectionFromLocalAnaestheticAdministered(map, domainObject.getLocalAnaestheticUsed()) );
		// Dressings
		java.util.List listDressings = domainObject.getDressings();
		ims.clinical.vo.lookups.CataractDressingsCollection Dressings = new ims.clinical.vo.lookups.CataractDressingsCollection();
		for(java.util.Iterator iterator = listDressings.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.CataractDressings voInstance = new ims.clinical.vo.lookups.CataractDressings(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.CataractDressings parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.CataractDressings(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Dressings.add(voInstance);
		}
		valueObject.setDressings( Dressings );
		// SwabNeedleCount
		valueObject.setSwabNeedleCount(domainObject.getSwabNeedleCount());
		// wasSwabNeedleCountCorrect
		ims.domain.lookups.LookupInstance instance6 = domainObject.getWasSwabNeedleCountCorrect();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setWasSwabNeedleCountCorrect(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.CataractIntraOperative extractCataractIntraOperative(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CataractIntraOperativeDetailVo valueObject) 
	{
		return 	extractCataractIntraOperative(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.CataractIntraOperative extractCataractIntraOperative(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.CataractIntraOperativeDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CataractIntraOperative();
		ims.core.clinical.domain.objects.CataractIntraOperative domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.CataractIntraOperative)domMap.get(valueObject);
			}
			// ims.clinical.vo.CataractIntraOperativeDetailVo ID_CataractIntraOperative field is unknown
			domainObject = new ims.core.clinical.domain.objects.CataractIntraOperative();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CataractIntraOperative());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.CataractIntraOperative)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.CataractIntraOperative) domainFactory.getDomainObject(ims.core.clinical.domain.objects.CataractIntraOperative.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CataractIntraOperative());

		domainObject.setMedications(ims.core.vo.domain.PatientMedicationLiteVoAssembler.extractPatientMedicationSet(domainFactory, valueObject.getMedications(), domainObject.getMedications(), domMap));		
		domainObject.setSkinPreperationUsed(ims.clinical.vo.domain.SkinPreperationVoAssembler.extractSkinPreperationSet(domainFactory, valueObject.getSkinPreperationUsed(), domainObject.getSkinPreperationUsed(), domMap));		
		domainObject.setLocalAnaestheticUsed(ims.clinical.vo.domain.LocalAnaestheticAdministeredVoAssembler.extractLocalAnaestheticAdministeredSet(domainFactory, valueObject.getLocalAnaestheticUsed(), domainObject.getLocalAnaestheticUsed(), domMap));		
		ims.clinical.vo.lookups.CataractDressingsCollection collection4 =
	valueObject.getDressings();
	    java.util.List domainDressings = domainObject.getDressings();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainDressings = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainDressings.indexOf(dom);
			if (domIdx == -1)
			{
				domainDressings.add(i, dom);
			}
			else if (i != domIdx && i < domainDressings.size())
			{
				Object tmp = domainDressings.get(i);
				domainDressings.set(i, domainDressings.get(domIdx));
				domainDressings.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainDressings.size();
		while (j4 > collection4Size)
		{
			domainDressings.remove(j4-1);
			j4 = domainDressings.size();
		}

		domainObject.setDressings(domainDressings);		
		domainObject.setSwabNeedleCount(valueObject.getSwabNeedleCount());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getWasSwabNeedleCountCorrect() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getWasSwabNeedleCountCorrect().getID());
		}
		domainObject.setWasSwabNeedleCountCorrect(value6);

		return domainObject;
	}

}
