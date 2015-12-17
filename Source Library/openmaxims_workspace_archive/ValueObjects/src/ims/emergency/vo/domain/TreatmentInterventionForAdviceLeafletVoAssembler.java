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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class TreatmentInterventionForAdviceLeafletVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo copy(ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObjectDest, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TreatmentIntervention(valueObjectSrc.getID_TreatmentIntervention());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatmentInterventionName
		valueObjectDest.setTreatmentInterventionName(valueObjectSrc.getTreatmentInterventionName());
		// TaxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Keywords
		valueObjectDest.setKeywords(valueObjectSrc.getKeywords());
		// TreatmentInterventionType
		valueObjectDest.setTreatmentInterventionType(valueObjectSrc.getTreatmentInterventionType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.TreatmentIntervention objects.
	 */
	public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(java.util.Set domainObjectSet)	
	{
		return createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.TreatmentIntervention objects.
	 */
	public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection voList = new ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.TreatmentIntervention domainObject = (ims.core.clinical.domain.objects.TreatmentIntervention) iterator.next();
			ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.TreatmentIntervention objects.
	 */
	public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(java.util.List domainObjectList) 
	{
		return createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.TreatmentIntervention objects.
	 */
	public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection createTreatmentInterventionForAdviceLeafletVoCollectionFromTreatmentIntervention(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection voList = new ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.TreatmentIntervention domainObject = (ims.core.clinical.domain.objects.TreatmentIntervention) domainObjectList.get(i);
			ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.TreatmentIntervention set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTreatmentInterventionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection voCollection) 
	 {
	 	return extractTreatmentInterventionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTreatmentInterventionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.TreatmentIntervention domainObject = TreatmentInterventionForAdviceLeafletVoAssembler.extractTreatmentIntervention(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.TreatmentIntervention list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTreatmentInterventionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection voCollection) 
	 {
	 	return extractTreatmentInterventionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTreatmentInterventionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.TreatmentIntervention domainObject = TreatmentInterventionForAdviceLeafletVoAssembler.extractTreatmentIntervention(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.TreatmentIntervention object.
	 * @param domainObject ims.core.clinical.domain.objects.TreatmentIntervention
	 */
	 public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo create(ims.core.clinical.domain.objects.TreatmentIntervention domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.TreatmentIntervention object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo create(DomainObjectMap map, ims.core.clinical.domain.objects.TreatmentIntervention domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObject = (ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo) map.getValueObject(domainObject, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.TreatmentIntervention
	 */
	 public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo insert(ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObject, ims.core.clinical.domain.objects.TreatmentIntervention domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.TreatmentIntervention
	 */
	 public static ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo insert(DomainObjectMap map, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObject, ims.core.clinical.domain.objects.TreatmentIntervention domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TreatmentIntervention(domainObject.getId());
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
			
		// TreatmentInterventionName
		valueObject.setTreatmentInterventionName(domainObject.getTreatmentInterventionName());
		// TaxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Keywords
		valueObject.setKeywords(ims.core.vo.domain.KeywordVoAssembler.createKeywordVoCollectionFromKeyword(map, domainObject.getKeywords()) );
		// TreatmentInterventionType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getTreatmentInterventionType();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.TreatmentInterventionType voLookup5 = new ims.clinical.vo.lookups.TreatmentInterventionType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.TreatmentInterventionType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.TreatmentInterventionType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setTreatmentInterventionType(voLookup5);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.TreatmentIntervention extractTreatmentIntervention(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObject) 
	{
		return 	extractTreatmentIntervention(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.TreatmentIntervention extractTreatmentIntervention(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TreatmentIntervention();
		ims.core.clinical.domain.objects.TreatmentIntervention domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.TreatmentIntervention)domMap.get(valueObject);
			}
			// ims.emergency.vo.TreatmentInterventionForAdviceLeafletVo ID_TreatmentIntervention field is unknown
			domainObject = new ims.core.clinical.domain.objects.TreatmentIntervention();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TreatmentIntervention());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.TreatmentIntervention)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.TreatmentIntervention) domainFactory.getDomainObject(ims.core.clinical.domain.objects.TreatmentIntervention.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TreatmentIntervention());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTreatmentInterventionName() != null && valueObject.getTreatmentInterventionName().equals(""))
		{
			valueObject.setTreatmentInterventionName(null);
		}
		domainObject.setTreatmentInterventionName(valueObject.getTreatmentInterventionName());

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.TaxonomyMapRefVoCollection refCollection2 = new ims.core.clinical.vo.TaxonomyMapRefVoCollection();
		if (valueObject.getTaxonomyMap() != null)
		{
			for (int i2=0; i2<valueObject.getTaxonomyMap().size(); i2++)
			{
				ims.core.clinical.vo.TaxonomyMapRefVo ref2 = (ims.core.clinical.vo.TaxonomyMapRefVo)valueObject.getTaxonomyMap().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainTaxonomyMap2 = domainObject.getTaxonomyMap();
		if (domainTaxonomyMap2 == null)
		{
			domainTaxonomyMap2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.core.clinical.vo.TaxonomyMapRefVo vo = refCollection2.get(i);			
			ims.core.clinical.domain.objects.TaxonomyMap dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.TaxonomyMap)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.TaxonomyMap)domainFactory.getDomainObject( ims.core.clinical.domain.objects.TaxonomyMap.class, vo.getBoId());
				}
			}

			int domIdx = domainTaxonomyMap2.indexOf(dom);
			if (domIdx == -1)
			{
				domainTaxonomyMap2.add(i, dom);
			}
			else if (i != domIdx && i < domainTaxonomyMap2.size())
			{
				Object tmp = domainTaxonomyMap2.get(i);
				domainTaxonomyMap2.set(i, domainTaxonomyMap2.get(domIdx));
				domainTaxonomyMap2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainTaxonomyMap2.size();
		while (i2 > size2)
		{
			domainTaxonomyMap2.remove(i2-1);
			i2 = domainTaxonomyMap2.size();
		}
		
		domainObject.setTaxonomyMap(domainTaxonomyMap2);		
		domainObject.setIsActive(valueObject.getIsActive());

		// SaveAsRefVO treated as RefValueObject
		ims.core.generic.vo.KeywordRefVoCollection refCollection4 = new ims.core.generic.vo.KeywordRefVoCollection();
		if (valueObject.getKeywords() != null)
		{
			for (int i4=0; i4<valueObject.getKeywords().size(); i4++)
			{
				ims.core.generic.vo.KeywordRefVo ref4 = (ims.core.generic.vo.KeywordRefVo)valueObject.getKeywords().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainKeywords4 = domainObject.getKeywords();
		if (domainKeywords4 == null)
		{
			domainKeywords4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.core.generic.vo.KeywordRefVo vo = refCollection4.get(i);			
			ims.core.generic.domain.objects.Keyword dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.Keyword)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.Keyword)domainFactory.getDomainObject( ims.core.generic.domain.objects.Keyword.class, vo.getBoId());
				}
			}

			int domIdx = domainKeywords4.indexOf(dom);
			if (domIdx == -1)
			{
				domainKeywords4.add(i, dom);
			}
			else if (i != domIdx && i < domainKeywords4.size())
			{
				Object tmp = domainKeywords4.get(i);
				domainKeywords4.set(i, domainKeywords4.get(domIdx));
				domainKeywords4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainKeywords4.size();
		while (i4 > size4)
		{
			domainKeywords4.remove(i4-1);
			i4 = domainKeywords4.size();
		}
		
		domainObject.setKeywords(domainKeywords4);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getTreatmentInterventionType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getTreatmentInterventionType().getID());
		}
		domainObject.setTreatmentInterventionType(value5);

		return domainObject;
	}

}
