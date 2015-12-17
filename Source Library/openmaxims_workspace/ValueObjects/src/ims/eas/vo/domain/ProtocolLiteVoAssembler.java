//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class ProtocolLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.ProtocolLiteVo copy(ims.eas.vo.ProtocolLiteVo valueObjectDest, ims.eas.vo.ProtocolLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Protocol(valueObjectSrc.getID_Protocol());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Phases
		valueObjectDest.setPhases(valueObjectSrc.getPhases());
		// ProtocolName
		valueObjectDest.setProtocolName(valueObjectSrc.getProtocolName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProtocolLiteVoCollectionFromProtocol(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteVoCollection createProtocolLiteVoCollectionFromProtocol(java.util.Set domainObjectSet)	
	{
		return createProtocolLiteVoCollectionFromProtocol(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteVoCollection createProtocolLiteVoCollectionFromProtocol(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.ProtocolLiteVoCollection voList = new ims.eas.vo.ProtocolLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.Protocol domainObject = (ims.eas.configuration.domain.objects.Protocol) iterator.next();
			ims.eas.vo.ProtocolLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteVoCollection createProtocolLiteVoCollectionFromProtocol(java.util.List domainObjectList) 
	{
		return createProtocolLiteVoCollectionFromProtocol(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.Protocol objects.
	 */
	public static ims.eas.vo.ProtocolLiteVoCollection createProtocolLiteVoCollectionFromProtocol(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.ProtocolLiteVoCollection voList = new ims.eas.vo.ProtocolLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.Protocol domainObject = (ims.eas.configuration.domain.objects.Protocol) domainObjectList.get(i);
			ims.eas.vo.ProtocolLiteVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.Protocol set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProtocolSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteVoCollection voCollection) 
	 {
	 	return extractProtocolSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProtocolSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolLiteVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.Protocol domainObject = ProtocolLiteVoAssembler.extractProtocol(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.Protocol list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProtocolList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteVoCollection voCollection) 
	 {
	 	return extractProtocolList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProtocolList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.ProtocolLiteVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.Protocol domainObject = ProtocolLiteVoAssembler.extractProtocol(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.Protocol object.
	 * @param domainObject ims.eas.configuration.domain.objects.Protocol
	 */
	 public static ims.eas.vo.ProtocolLiteVo create(ims.eas.configuration.domain.objects.Protocol domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.Protocol object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.ProtocolLiteVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.Protocol domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.ProtocolLiteVo valueObject = (ims.eas.vo.ProtocolLiteVo) map.getValueObject(domainObject, ims.eas.vo.ProtocolLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.ProtocolLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.Protocol
	 */
	 public static ims.eas.vo.ProtocolLiteVo insert(ims.eas.vo.ProtocolLiteVo valueObject, ims.eas.configuration.domain.objects.Protocol domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.Protocol
	 */
	 public static ims.eas.vo.ProtocolLiteVo insert(DomainObjectMap map, ims.eas.vo.ProtocolLiteVo valueObject, ims.eas.configuration.domain.objects.Protocol domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Protocol(domainObject.getId());
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
			
		// PrimaryTumour
		valueObject.setPrimaryTumour(ims.eas.vo.domain.PrimaryTumourNameVoAssembler.create(map, domainObject.getPrimaryTumour()) );
		// TreatmentSite
		valueObject.setTreatmentSite(ims.eas.vo.domain.TreatmentSiteNameVoAssembler.create(map, domainObject.getTreatmentSite()) );
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// Phases
		valueObject.setPhases(ims.eas.vo.domain.ProtocolPhaseVoAssembler.createProtocolPhaseVoCollectionFromProtocolPhase(map, domainObject.getPhases()) );
		// ProtocolName
		valueObject.setProtocolName(domainObject.getProtocolName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.Protocol extractProtocol(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteVo valueObject) 
	{
		return 	extractProtocol(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.Protocol extractProtocol(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.ProtocolLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Protocol();
		ims.eas.configuration.domain.objects.Protocol domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.Protocol)domMap.get(valueObject);
			}
			// ims.eas.vo.ProtocolLiteVo ID_Protocol field is unknown
			domainObject = new ims.eas.configuration.domain.objects.Protocol();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Protocol());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.Protocol)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.Protocol) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.Protocol.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Protocol());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.PrimaryTumour value1 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			if (valueObject.getPrimaryTumour().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumour()) != null)
				{
					value1 = (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject.getPrimaryTumour());
				}
			}
			else
			{
				value1 = (ims.eas.configuration.domain.objects.PrimaryTumour)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, valueObject.getPrimaryTumour().getBoId());
			}
		}
		domainObject.setPrimaryTumour(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.TreatmentSites value2 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			if (valueObject.getTreatmentSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatmentSite()) != null)
				{
					value2 = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject.getTreatmentSite());
				}
			}
			else
			{
				value2 = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, valueObject.getTreatmentSite().getBoId());
			}
		}
		domainObject.setTreatmentSite(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		domainObject.setPhases(ims.eas.vo.domain.ProtocolPhaseVoAssembler.extractProtocolPhaseList(domainFactory, valueObject.getPhases(), domainObject.getPhases(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProtocolName() != null && valueObject.getProtocolName().equals(""))
		{
			valueObject.setProtocolName(null);
		}
		domainObject.setProtocolName(valueObject.getProtocolName());

		return domainObject;
	}

}
