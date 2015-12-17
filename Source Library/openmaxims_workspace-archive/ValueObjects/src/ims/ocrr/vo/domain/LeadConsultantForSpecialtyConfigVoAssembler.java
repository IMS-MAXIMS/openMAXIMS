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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class LeadConsultantForSpecialtyConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo copy(ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObjectDest, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SpecialtyLeadConsultant(valueObjectSrc.getID_SpecialtyLeadConsultant());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// LeadConsultant
		valueObjectDest.setLeadConsultant(valueObjectSrc.getLeadConsultant());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant objects.
	 */
	public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(java.util.Set domainObjectSet)	
	{
		return createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant objects.
	 */
	public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection voList = new ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject = (ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant) iterator.next();
			ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant objects.
	 */
	public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(java.util.List domainObjectList) 
	{
		return createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant objects.
	 */
	public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection createLeadConsultantForSpecialtyConfigVoCollectionFromSpecialtyLeadConsultant(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection voList = new ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject = (ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant) domainObjectList.get(i);
			ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSpecialtyLeadConsultantSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection voCollection) 
	 {
	 	return extractSpecialtyLeadConsultantSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSpecialtyLeadConsultantSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject = LeadConsultantForSpecialtyConfigVoAssembler.extractSpecialtyLeadConsultant(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSpecialtyLeadConsultantList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection voCollection) 
	 {
	 	return extractSpecialtyLeadConsultantList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSpecialtyLeadConsultantList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject = LeadConsultantForSpecialtyConfigVoAssembler.extractSpecialtyLeadConsultant(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant
	 */
	 public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo create(ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObject = (ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo) map.getValueObject(domainObject, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant
	 */
	 public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo insert(ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObject, ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant
	 */
	 public static ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo insert(DomainObjectMap map, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObject, ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SpecialtyLeadConsultant(domainObject.getId());
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
			
		// Specialty
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup1 = new ims.core.vo.lookups.Specialty(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.Specialty(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSpecialty(voLookup1);
		}
				// LeadConsultant
		valueObject.setLeadConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getLeadConsultant()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant extractSpecialtyLeadConsultant(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObject) 
	{
		return 	extractSpecialtyLeadConsultant(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant extractSpecialtyLeadConsultant(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SpecialtyLeadConsultant();
		ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant)domMap.get(valueObject);
			}
			// ims.ocrr.vo.LeadConsultantForSpecialtyConfigVo ID_SpecialtyLeadConsultant field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SpecialtyLeadConsultant());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.SpecialtyLeadConsultant.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SpecialtyLeadConsultant());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getLeadConsultant() ) 
		{
			if (valueObject.getLeadConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getLeadConsultant()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getLeadConsultant());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getLeadConsultant().getBoId());
			}
		}
		domainObject.setLeadConsultant(value2);

		return domainObject;
	}

}
