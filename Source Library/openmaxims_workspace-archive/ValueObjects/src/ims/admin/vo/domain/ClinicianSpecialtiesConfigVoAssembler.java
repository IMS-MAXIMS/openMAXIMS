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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ClinicianSpecialtiesConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ClinicianSpecialtiesConfigVo copy(ims.admin.vo.ClinicianSpecialtiesConfigVo valueObjectDest, ims.admin.vo.ClinicianSpecialtiesConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicianSpecialtiesConfig(valueObjectSrc.getID_ClinicianSpecialtiesConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// HCP
		valueObjectDest.setHCP(valueObjectSrc.getHCP());
		// Specialties
		valueObjectDest.setSpecialties(valueObjectSrc.getSpecialties());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ClinicianSpecialtiesConfig objects.
	 */
	public static ims.admin.vo.ClinicianSpecialtiesConfigVoCollection createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(java.util.Set domainObjectSet)	
	{
		return createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ClinicianSpecialtiesConfig objects.
	 */
	public static ims.admin.vo.ClinicianSpecialtiesConfigVoCollection createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ClinicianSpecialtiesConfigVoCollection voList = new ims.admin.vo.ClinicianSpecialtiesConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject = (ims.core.admin.domain.objects.ClinicianSpecialtiesConfig) iterator.next();
			ims.admin.vo.ClinicianSpecialtiesConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ClinicianSpecialtiesConfig objects.
	 */
	public static ims.admin.vo.ClinicianSpecialtiesConfigVoCollection createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(java.util.List domainObjectList) 
	{
		return createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ClinicianSpecialtiesConfig objects.
	 */
	public static ims.admin.vo.ClinicianSpecialtiesConfigVoCollection createClinicianSpecialtiesConfigVoCollectionFromClinicianSpecialtiesConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ClinicianSpecialtiesConfigVoCollection voList = new ims.admin.vo.ClinicianSpecialtiesConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject = (ims.core.admin.domain.objects.ClinicianSpecialtiesConfig) domainObjectList.get(i);
			ims.admin.vo.ClinicianSpecialtiesConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.ClinicianSpecialtiesConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicianSpecialtiesConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ClinicianSpecialtiesConfigVoCollection voCollection) 
	 {
	 	return extractClinicianSpecialtiesConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicianSpecialtiesConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ClinicianSpecialtiesConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ClinicianSpecialtiesConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject = ClinicianSpecialtiesConfigVoAssembler.extractClinicianSpecialtiesConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.ClinicianSpecialtiesConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicianSpecialtiesConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ClinicianSpecialtiesConfigVoCollection voCollection) 
	 {
	 	return extractClinicianSpecialtiesConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicianSpecialtiesConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ClinicianSpecialtiesConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ClinicianSpecialtiesConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject = ClinicianSpecialtiesConfigVoAssembler.extractClinicianSpecialtiesConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.ClinicianSpecialtiesConfig object.
	 * @param domainObject ims.core.admin.domain.objects.ClinicianSpecialtiesConfig
	 */
	 public static ims.admin.vo.ClinicianSpecialtiesConfigVo create(ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.ClinicianSpecialtiesConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ClinicianSpecialtiesConfigVo create(DomainObjectMap map, ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ClinicianSpecialtiesConfigVo valueObject = (ims.admin.vo.ClinicianSpecialtiesConfigVo) map.getValueObject(domainObject, ims.admin.vo.ClinicianSpecialtiesConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ClinicianSpecialtiesConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.ClinicianSpecialtiesConfig
	 */
	 public static ims.admin.vo.ClinicianSpecialtiesConfigVo insert(ims.admin.vo.ClinicianSpecialtiesConfigVo valueObject, ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.ClinicianSpecialtiesConfig
	 */
	 public static ims.admin.vo.ClinicianSpecialtiesConfigVo insert(DomainObjectMap map, ims.admin.vo.ClinicianSpecialtiesConfigVo valueObject, ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicianSpecialtiesConfig(domainObject.getId());
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
			
		// HCP
		if (domainObject.getHCP() != null)
		{
			if(domainObject.getHCP() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHCP();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHCP(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setHCP(new ims.core.resource.people.vo.HcpRefVo(domainObject.getHCP().getId(), domainObject.getHCP().getVersion()));
			}
		}
		// Specialties
		java.util.List listSpecialties = domainObject.getSpecialties();
		ims.core.vo.lookups.SpecialtyCollection Specialties = new ims.core.vo.lookups.SpecialtyCollection();
		for(java.util.Iterator iterator = listSpecialties.iterator(); iterator.hasNext(); ) 
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
			Specialties.add(voInstance);
		}
		valueObject.setSpecialties( Specialties );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.ClinicianSpecialtiesConfig extractClinicianSpecialtiesConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ClinicianSpecialtiesConfigVo valueObject) 
	{
		return 	extractClinicianSpecialtiesConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.ClinicianSpecialtiesConfig extractClinicianSpecialtiesConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ClinicianSpecialtiesConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicianSpecialtiesConfig();
		ims.core.admin.domain.objects.ClinicianSpecialtiesConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.ClinicianSpecialtiesConfig)domMap.get(valueObject);
			}
			// ims.admin.vo.ClinicianSpecialtiesConfigVo ID_ClinicianSpecialtiesConfig field is unknown
			domainObject = new ims.core.admin.domain.objects.ClinicianSpecialtiesConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicianSpecialtiesConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.ClinicianSpecialtiesConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.ClinicianSpecialtiesConfig) domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicianSpecialtiesConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicianSpecialtiesConfig());

		ims.core.resource.people.domain.objects.Hcp value1 = null;
		if ( null != valueObject.getHCP() ) 
		{
			if (valueObject.getHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getHCP()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getHCP());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getHCP();	
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getHCP().getBoId());
			}
		}
		domainObject.setHCP(value1);
		ims.core.vo.lookups.SpecialtyCollection collection2 =
	valueObject.getSpecialties();
	    java.util.List domainSpecialties = domainObject.getSpecialties();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainSpecialties = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSpecialties.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecialties.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecialties.size())
			{
				Object tmp = domainSpecialties.get(i);
				domainSpecialties.set(i, domainSpecialties.get(domIdx));
				domainSpecialties.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainSpecialties.size();
		while (j2 > collection2Size)
		{
			domainSpecialties.remove(j2-1);
			j2 = domainSpecialties.size();
		}

		domainObject.setSpecialties(domainSpecialties);		

		return domainObject;
	}

}
