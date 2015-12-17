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
 * @author Barbara Worwood
 */
public class PrimaryTumourVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.PrimaryTumourVo copy(ims.eas.vo.PrimaryTumourVo valueObjectDest, ims.eas.vo.PrimaryTumourVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrimaryTumour(valueObjectSrc.getID_PrimaryTumour());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Agents
		valueObjectDest.setAgents(valueObjectSrc.getAgents());
		// DefaultAgent
		valueObjectDest.setDefaultAgent(valueObjectSrc.getDefaultAgent());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// TreatmentSites
		valueObjectDest.setTreatmentSites(valueObjectSrc.getTreatmentSites());
		// ClinicalTrials
		valueObjectDest.setClinicalTrials(valueObjectSrc.getClinicalTrials());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrimaryTumourVoCollectionFromPrimaryTumour(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourVoCollection createPrimaryTumourVoCollectionFromPrimaryTumour(java.util.Set domainObjectSet)	
	{
		return createPrimaryTumourVoCollectionFromPrimaryTumour(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourVoCollection createPrimaryTumourVoCollectionFromPrimaryTumour(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.PrimaryTumourVoCollection voList = new ims.eas.vo.PrimaryTumourVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = (ims.eas.configuration.domain.objects.PrimaryTumour) iterator.next();
			ims.eas.vo.PrimaryTumourVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourVoCollection createPrimaryTumourVoCollectionFromPrimaryTumour(java.util.List domainObjectList) 
	{
		return createPrimaryTumourVoCollectionFromPrimaryTumour(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.configuration.domain.objects.PrimaryTumour objects.
	 */
	public static ims.eas.vo.PrimaryTumourVoCollection createPrimaryTumourVoCollectionFromPrimaryTumour(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.PrimaryTumourVoCollection voList = new ims.eas.vo.PrimaryTumourVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = (ims.eas.configuration.domain.objects.PrimaryTumour) domainObjectList.get(i);
			ims.eas.vo.PrimaryTumourVo vo = create(map, domainObject);

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
	 * Create the ims.eas.configuration.domain.objects.PrimaryTumour set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrimaryTumourSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrimaryTumourSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.PrimaryTumourVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = PrimaryTumourVoAssembler.extractPrimaryTumour(domainFactory, vo, domMap);

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
	 * Create the ims.eas.configuration.domain.objects.PrimaryTumour list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrimaryTumourList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourVoCollection voCollection) 
	 {
	 	return extractPrimaryTumourList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrimaryTumourList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.PrimaryTumourVo vo = voCollection.get(i);
			ims.eas.configuration.domain.objects.PrimaryTumour domainObject = PrimaryTumourVoAssembler.extractPrimaryTumour(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.configuration.domain.objects.PrimaryTumour object.
	 * @param domainObject ims.eas.configuration.domain.objects.PrimaryTumour
	 */
	 public static ims.eas.vo.PrimaryTumourVo create(ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.configuration.domain.objects.PrimaryTumour object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.PrimaryTumourVo create(DomainObjectMap map, ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.PrimaryTumourVo valueObject = (ims.eas.vo.PrimaryTumourVo) map.getValueObject(domainObject, ims.eas.vo.PrimaryTumourVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.PrimaryTumourVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.configuration.domain.objects.PrimaryTumour
	 */
	 public static ims.eas.vo.PrimaryTumourVo insert(ims.eas.vo.PrimaryTumourVo valueObject, ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
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
	 * @param domainObject ims.eas.configuration.domain.objects.PrimaryTumour
	 */
	 public static ims.eas.vo.PrimaryTumourVo insert(DomainObjectMap map, ims.eas.vo.PrimaryTumourVo valueObject, ims.eas.configuration.domain.objects.PrimaryTumour domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrimaryTumour(domainObject.getId());
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
			
		// Agents
		java.util.List listAgents = domainObject.getAgents();
		ims.eas.vo.lookups.AgentsCollection Agents = new ims.eas.vo.lookups.AgentsCollection();
		for(java.util.Iterator iterator = listAgents.iterator(); iterator.hasNext(); ) 
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
			ims.eas.vo.lookups.Agents voInstance = new ims.eas.vo.lookups.Agents(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.eas.vo.lookups.Agents parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.eas.vo.lookups.Agents(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Agents.add(voInstance);
		}
		valueObject.setAgents( Agents );
		// DefaultAgent
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDefaultAgent();
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

			ims.eas.vo.lookups.Agents voLookup2 = new ims.eas.vo.lookups.Agents(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.eas.vo.lookups.Agents parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.eas.vo.lookups.Agents(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDefaultAgent(voLookup2);
		}
				// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
				// TreatmentSites
		valueObject.setTreatmentSites(ims.eas.vo.domain.TreatmentSiteNameVoAssembler.createTreatmentSiteNameVoCollectionFromTreatmentSites(map, domainObject.getTreatmentSites()) );
		// ClinicalTrials
		valueObject.setClinicalTrials(ims.eas.vo.domain.ClinicalTrialLinkVoAssembler.createClinicalTrialLinkVoCollectionFromClinicalTrialsLink(map, domainObject.getClinicalTrials()) );
		// PrimaryTumour
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPrimaryTumour();
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

			ims.eas.vo.lookups.PrimaryTumour voLookup7 = new ims.eas.vo.lookups.PrimaryTumour(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.eas.vo.lookups.PrimaryTumour parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.eas.vo.lookups.PrimaryTumour(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPrimaryTumour(voLookup7);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.configuration.domain.objects.PrimaryTumour extractPrimaryTumour(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourVo valueObject) 
	{
		return 	extractPrimaryTumour(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.configuration.domain.objects.PrimaryTumour extractPrimaryTumour(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PrimaryTumourVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrimaryTumour();
		ims.eas.configuration.domain.objects.PrimaryTumour domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject);
			}
			// ims.eas.vo.PrimaryTumourVo ID_PrimaryTumour field is unknown
			domainObject = new ims.eas.configuration.domain.objects.PrimaryTumour();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrimaryTumour());
			if (domMap.get(key) != null)
			{
				return (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(key);
			}
			domainObject = (ims.eas.configuration.domain.objects.PrimaryTumour) domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrimaryTumour());

		ims.eas.vo.lookups.AgentsCollection collection1 =
	valueObject.getAgents();
	    java.util.List domainAgents = domainObject.getAgents();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainAgents = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAgents.indexOf(dom);
			if (domIdx == -1)
			{
				domainAgents.add(i, dom);
			}
			else if (i != domIdx && i < domainAgents.size())
			{
				Object tmp = domainAgents.get(i);
				domainAgents.set(i, domainAgents.get(domIdx));
				domainAgents.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainAgents.size();
		while (j1 > collection1Size)
		{
			domainAgents.remove(j1-1);
			j1 = domainAgents.size();
		}

		domainObject.setAgents(domainAgents);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDefaultAgent() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDefaultAgent().getID());
		}
		domainObject.setDefaultAgent(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);
		domainObject.setTreatmentSites(ims.eas.vo.domain.TreatmentSiteNameVoAssembler.extractTreatmentSitesList(domainFactory, valueObject.getTreatmentSites(), domainObject.getTreatmentSites(), domMap));		
		domainObject.setClinicalTrials(ims.eas.vo.domain.ClinicalTrialLinkVoAssembler.extractClinicalTrialsLinkList(domainFactory, valueObject.getClinicalTrials(), domainObject.getClinicalTrials(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPrimaryTumour().getID());
		}
		domainObject.setPrimaryTumour(value7);

		return domainObject;
	}

}
