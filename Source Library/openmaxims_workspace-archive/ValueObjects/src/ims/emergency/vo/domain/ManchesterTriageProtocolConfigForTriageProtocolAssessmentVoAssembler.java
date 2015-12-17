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
 * @author George Cristian Josan
 */
public class ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo copy(ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObjectDest, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ManchesterTriageProtocolConfiguration(valueObjectSrc.getID_ManchesterTriageProtocolConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProtocolName
		valueObjectDest.setProtocolName(valueObjectSrc.getProtocolName());
		// Discriminators
		valueObjectDest.setDiscriminators(valueObjectSrc.getDiscriminators());
		// DefaultPriority
		valueObjectDest.setDefaultPriority(valueObjectSrc.getDefaultPriority());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(java.util.Set domainObjectSet)	
	{
		return createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection voList = new ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration) iterator.next();
			ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(java.util.List domainObjectList) 
	{
		return createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration objects.
	 */
	public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection createManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollectionFromManchesterTriageProtocolConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection voList = new ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration) domainObjectList.get(i);
			ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractManchesterTriageProtocolConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection voCollection) 
	 {
	 	return extractManchesterTriageProtocolConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractManchesterTriageProtocolConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoAssembler.extractManchesterTriageProtocolConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractManchesterTriageProtocolConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection voCollection) 
	 {
	 	return extractManchesterTriageProtocolConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractManchesterTriageProtocolConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoAssembler.extractManchesterTriageProtocolConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration object.
	 * @param domainObject ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo create(ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObject = (ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo) map.getValueObject(domainObject, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo insert(ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObject, ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration
	 */
	 public static ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo insert(DomainObjectMap map, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObject, ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ManchesterTriageProtocolConfiguration(domainObject.getId());
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
			
		// ProtocolName
		valueObject.setProtocolName(domainObject.getProtocolName());
		// Discriminators
		valueObject.setDiscriminators(ims.emergency.vo.domain.ProtocolDiscriminatorLiteVoAssembler.createProtocolDiscriminatorLiteVoCollectionFromProtocolDiscriminator(map, domainObject.getDiscriminators()) );
		// DefaultPriority
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDefaultPriority();
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

			ims.emergency.vo.lookups.TriagePriority voLookup3 = new ims.emergency.vo.lookups.TriagePriority(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.TriagePriority parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.TriagePriority(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDefaultPriority(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration extractManchesterTriageProtocolConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObject) 
	{
		return 	extractManchesterTriageProtocolConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration extractManchesterTriageProtocolConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ManchesterTriageProtocolConfiguration();
		ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration)domMap.get(valueObject);
			}
			// ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo ID_ManchesterTriageProtocolConfiguration field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ManchesterTriageProtocolConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ManchesterTriageProtocolConfiguration());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProtocolName() != null && valueObject.getProtocolName().equals(""))
		{
			valueObject.setProtocolName(null);
		}
		domainObject.setProtocolName(valueObject.getProtocolName());

		// SaveAsRefVO treated as RefValueObject
		ims.emergency.configuration.vo.ProtocolDiscriminatorRefVoCollection refCollection2 = new ims.emergency.configuration.vo.ProtocolDiscriminatorRefVoCollection();
		if (valueObject.getDiscriminators() != null)
		{
			for (int i2=0; i2<valueObject.getDiscriminators().size(); i2++)
			{
				ims.emergency.configuration.vo.ProtocolDiscriminatorRefVo ref2 = (ims.emergency.configuration.vo.ProtocolDiscriminatorRefVo)valueObject.getDiscriminators().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainDiscriminators2 = domainObject.getDiscriminators();
		if (domainDiscriminators2 == null)
		{
			domainDiscriminators2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.emergency.configuration.vo.ProtocolDiscriminatorRefVo vo = refCollection2.get(i);			
			ims.emergency.configuration.domain.objects.ProtocolDiscriminator dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.emergency.configuration.domain.objects.ProtocolDiscriminator)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.emergency.configuration.domain.objects.ProtocolDiscriminator)domainFactory.getDomainObject( ims.emergency.configuration.domain.objects.ProtocolDiscriminator.class, vo.getBoId());
				}
			}

			int domIdx = domainDiscriminators2.indexOf(dom);
			if (domIdx == -1)
			{
				domainDiscriminators2.add(i, dom);
			}
			else if (i != domIdx && i < domainDiscriminators2.size())
			{
				Object tmp = domainDiscriminators2.get(i);
				domainDiscriminators2.set(i, domainDiscriminators2.get(domIdx));
				domainDiscriminators2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainDiscriminators2.size();
		while (i2 > size2)
		{
			domainDiscriminators2.remove(i2-1);
			i2 = domainDiscriminators2.size();
		}
		
		domainObject.setDiscriminators(domainDiscriminators2);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDefaultPriority() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDefaultPriority().getID());
		}
		domainObject.setDefaultPriority(value3);

		return domainObject;
	}

}
