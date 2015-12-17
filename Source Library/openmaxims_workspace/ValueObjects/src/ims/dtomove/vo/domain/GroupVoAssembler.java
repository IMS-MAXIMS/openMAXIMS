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
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class GroupVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.GroupVo copy(ims.dtomove.vo.GroupVo valueObjectDest, ims.dtomove.vo.GroupVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Group(valueObjectSrc.getID_Group());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// technique
		valueObjectDest.setTechnique(valueObjectSrc.getTechnique());
		// site
		valueObjectDest.setSite(valueObjectSrc.getSite());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGroupVoCollectionFromGroup(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Group objects.
	 */
	public static ims.dtomove.vo.GroupVoCollection createGroupVoCollectionFromGroup(java.util.Set domainObjectSet)	
	{
		return createGroupVoCollectionFromGroup(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Group objects.
	 */
	public static ims.dtomove.vo.GroupVoCollection createGroupVoCollectionFromGroup(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.GroupVoCollection voList = new ims.dtomove.vo.GroupVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.Group domainObject = (ims.dto_move.domain.objects.Group) iterator.next();
			ims.dtomove.vo.GroupVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Group objects.
	 */
	public static ims.dtomove.vo.GroupVoCollection createGroupVoCollectionFromGroup(java.util.List domainObjectList) 
	{
		return createGroupVoCollectionFromGroup(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Group objects.
	 */
	public static ims.dtomove.vo.GroupVoCollection createGroupVoCollectionFromGroup(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.GroupVoCollection voList = new ims.dtomove.vo.GroupVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.Group domainObject = (ims.dto_move.domain.objects.Group) domainObjectList.get(i);
			ims.dtomove.vo.GroupVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.Group set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGroupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.GroupVoCollection voCollection) 
	 {
	 	return extractGroupSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGroupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.GroupVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.GroupVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Group domainObject = GroupVoAssembler.extractGroup(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.Group list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGroupList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.GroupVoCollection voCollection) 
	 {
	 	return extractGroupList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGroupList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.GroupVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.GroupVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Group domainObject = GroupVoAssembler.extractGroup(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.Group object.
	 * @param domainObject ims.dto_move.domain.objects.Group
	 */
	 public static ims.dtomove.vo.GroupVo create(ims.dto_move.domain.objects.Group domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.Group object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.GroupVo create(DomainObjectMap map, ims.dto_move.domain.objects.Group domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.GroupVo valueObject = (ims.dtomove.vo.GroupVo) map.getValueObject(domainObject, ims.dtomove.vo.GroupVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.GroupVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.Group
	 */
	 public static ims.dtomove.vo.GroupVo insert(ims.dtomove.vo.GroupVo valueObject, ims.dto_move.domain.objects.Group domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.Group
	 */
	 public static ims.dtomove.vo.GroupVo insert(DomainObjectMap map, ims.dtomove.vo.GroupVo valueObject, ims.dto_move.domain.objects.Group domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Group(domainObject.getId());
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
			
		// name
		valueObject.setName(domainObject.getName());
		// active
		valueObject.setActive(domainObject.getActive());
		// technique
		valueObject.setTechnique(ims.dtomove.vo.domain.GroupTechniqueVoAssembler.createGroupTechniqueVoCollectionFromGroupTechnique(map, domainObject.getTechnique()) );
		// site
		valueObject.setSite(ims.dtomove.vo.domain.GroupSiteVoAssembler.createGroupSiteVoCollectionFromGroupSite(map, domainObject.getSite()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.Group extractGroup(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.GroupVo valueObject) 
	{
		return 	extractGroup(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.Group extractGroup(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.GroupVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Group();
		ims.dto_move.domain.objects.Group domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.Group)domMap.get(valueObject);
			}
			// ims.dtomove.vo.GroupVo ID_Group field is unknown
			domainObject = new ims.dto_move.domain.objects.Group();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Group());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.Group)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.Group) domainFactory.getDomainObject(ims.dto_move.domain.objects.Group.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Group());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActive() != null && valueObject.getActive().equals(""))
		{
			valueObject.setActive(null);
		}
		domainObject.setActive(valueObject.getActive());

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.GroupTechniqueRefVoCollection refCollection3 = new ims.dto_move.vo.GroupTechniqueRefVoCollection();
		if (valueObject.getTechnique() != null)
		{
			for (int i3=0; i3<valueObject.getTechnique().size(); i3++)
			{
				ims.dto_move.vo.GroupTechniqueRefVo ref3 = (ims.dto_move.vo.GroupTechniqueRefVo)valueObject.getTechnique().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainTechnique3 = domainObject.getTechnique();
		if (domainTechnique3 == null)
		{
			domainTechnique3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.dto_move.vo.GroupTechniqueRefVo vo = refCollection3.get(i);			
			ims.dto_move.domain.objects.GroupTechnique dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.GroupTechnique)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.GroupTechnique)domainFactory.getDomainObject( ims.dto_move.domain.objects.GroupTechnique.class, vo.getBoId());
				}
			}

			int domIdx = domainTechnique3.indexOf(dom);
			if (domIdx == -1)
			{
				domainTechnique3.add(i, dom);
			}
			else if (i != domIdx && i < domainTechnique3.size())
			{
				Object tmp = domainTechnique3.get(i);
				domainTechnique3.set(i, domainTechnique3.get(domIdx));
				domainTechnique3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainTechnique3.size();
		while (i3 > size3)
		{
			domainTechnique3.remove(i3-1);
			i3 = domainTechnique3.size();
		}
		
		domainObject.setTechnique(domainTechnique3);		

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.GroupSiteRefVoCollection refCollection4 = new ims.dto_move.vo.GroupSiteRefVoCollection();
		if (valueObject.getSite() != null)
		{
			for (int i4=0; i4<valueObject.getSite().size(); i4++)
			{
				ims.dto_move.vo.GroupSiteRefVo ref4 = (ims.dto_move.vo.GroupSiteRefVo)valueObject.getSite().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainSite4 = domainObject.getSite();
		if (domainSite4 == null)
		{
			domainSite4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.dto_move.vo.GroupSiteRefVo vo = refCollection4.get(i);			
			ims.dto_move.domain.objects.GroupSite dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.GroupSite)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.GroupSite)domainFactory.getDomainObject( ims.dto_move.domain.objects.GroupSite.class, vo.getBoId());
				}
			}

			int domIdx = domainSite4.indexOf(dom);
			if (domIdx == -1)
			{
				domainSite4.add(i, dom);
			}
			else if (i != domIdx && i < domainSite4.size())
			{
				Object tmp = domainSite4.get(i);
				domainSite4.set(i, domainSite4.get(domIdx));
				domainSite4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainSite4.size();
		while (i4 > size4)
		{
			domainSite4.remove(i4-1);
			i4 = domainSite4.size();
		}
		
		domainObject.setSite(domainSite4);		

		return domainObject;
	}

}
