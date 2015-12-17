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
package ims.correspondence.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class TemplateCategoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.correspondence.vo.TemplateCategoryVo copy(ims.correspondence.vo.TemplateCategoryVo valueObjectDest, ims.correspondence.vo.TemplateCategoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TemplateCategory(valueObjectSrc.getID_TemplateCategory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// template
		valueObjectDest.setTemplate(valueObjectSrc.getTemplate());
		// dischargeCategories
		valueObjectDest.setDischargeCategories(valueObjectSrc.getDischargeCategories());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTemplateCategoryVoCollectionFromTemplateCategory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.TemplateCategory objects.
	 */
	public static ims.correspondence.vo.TemplateCategoryVoCollection createTemplateCategoryVoCollectionFromTemplateCategory(java.util.Set domainObjectSet)	
	{
		return createTemplateCategoryVoCollectionFromTemplateCategory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.TemplateCategory objects.
	 */
	public static ims.correspondence.vo.TemplateCategoryVoCollection createTemplateCategoryVoCollectionFromTemplateCategory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.correspondence.vo.TemplateCategoryVoCollection voList = new ims.correspondence.vo.TemplateCategoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.correspondence.configuration.domain.objects.TemplateCategory domainObject = (ims.correspondence.configuration.domain.objects.TemplateCategory) iterator.next();
			ims.correspondence.vo.TemplateCategoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.TemplateCategory objects.
	 */
	public static ims.correspondence.vo.TemplateCategoryVoCollection createTemplateCategoryVoCollectionFromTemplateCategory(java.util.List domainObjectList) 
	{
		return createTemplateCategoryVoCollectionFromTemplateCategory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.TemplateCategory objects.
	 */
	public static ims.correspondence.vo.TemplateCategoryVoCollection createTemplateCategoryVoCollectionFromTemplateCategory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.correspondence.vo.TemplateCategoryVoCollection voList = new ims.correspondence.vo.TemplateCategoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.correspondence.configuration.domain.objects.TemplateCategory domainObject = (ims.correspondence.configuration.domain.objects.TemplateCategory) domainObjectList.get(i);
			ims.correspondence.vo.TemplateCategoryVo vo = create(map, domainObject);

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
	 * Create the ims.correspondence.configuration.domain.objects.TemplateCategory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTemplateCategorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateCategoryVoCollection voCollection) 
	 {
	 	return extractTemplateCategorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTemplateCategorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateCategoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.TemplateCategoryVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.TemplateCategory domainObject = TemplateCategoryVoAssembler.extractTemplateCategory(domainFactory, vo, domMap);

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
	 * Create the ims.correspondence.configuration.domain.objects.TemplateCategory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTemplateCategoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateCategoryVoCollection voCollection) 
	 {
	 	return extractTemplateCategoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTemplateCategoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateCategoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.TemplateCategoryVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.TemplateCategory domainObject = TemplateCategoryVoAssembler.extractTemplateCategory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.correspondence.configuration.domain.objects.TemplateCategory object.
	 * @param domainObject ims.correspondence.configuration.domain.objects.TemplateCategory
	 */
	 public static ims.correspondence.vo.TemplateCategoryVo create(ims.correspondence.configuration.domain.objects.TemplateCategory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.correspondence.configuration.domain.objects.TemplateCategory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.correspondence.vo.TemplateCategoryVo create(DomainObjectMap map, ims.correspondence.configuration.domain.objects.TemplateCategory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.correspondence.vo.TemplateCategoryVo valueObject = (ims.correspondence.vo.TemplateCategoryVo) map.getValueObject(domainObject, ims.correspondence.vo.TemplateCategoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.correspondence.vo.TemplateCategoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.correspondence.configuration.domain.objects.TemplateCategory
	 */
	 public static ims.correspondence.vo.TemplateCategoryVo insert(ims.correspondence.vo.TemplateCategoryVo valueObject, ims.correspondence.configuration.domain.objects.TemplateCategory domainObject) 
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
	 * @param domainObject ims.correspondence.configuration.domain.objects.TemplateCategory
	 */
	 public static ims.correspondence.vo.TemplateCategoryVo insert(DomainObjectMap map, ims.correspondence.vo.TemplateCategoryVo valueObject, ims.correspondence.configuration.domain.objects.TemplateCategory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TemplateCategory(domainObject.getId());
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
			
		// template
		if (domainObject.getTemplate() != null)
		{
			if(domainObject.getTemplate() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTemplate();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTemplate(new ims.core.admin.vo.TemplateBoRefVo(id, -1));				
			}
			else
			{
				valueObject.setTemplate(new ims.core.admin.vo.TemplateBoRefVo(domainObject.getTemplate().getId(), domainObject.getTemplate().getVersion()));
			}
		}
		// dischargeCategories
		java.util.List listDischargeCategories = domainObject.getDischargeCategories();
		ims.correspondence.vo.lookups.HeaderCollection dischargeCategories = new ims.correspondence.vo.lookups.HeaderCollection();
		for(java.util.Iterator iterator = listDischargeCategories.iterator(); iterator.hasNext(); ) 
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
			ims.correspondence.vo.lookups.Header voInstance = new ims.correspondence.vo.lookups.Header(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.correspondence.vo.lookups.Header parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.correspondence.vo.lookups.Header(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			dischargeCategories.add(voInstance);
		}
		valueObject.setDischargeCategories( dischargeCategories );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.correspondence.configuration.domain.objects.TemplateCategory extractTemplateCategory(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateCategoryVo valueObject) 
	{
		return 	extractTemplateCategory(domainFactory, valueObject, new HashMap());
	}

	public static ims.correspondence.configuration.domain.objects.TemplateCategory extractTemplateCategory(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateCategoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TemplateCategory();
		ims.correspondence.configuration.domain.objects.TemplateCategory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.correspondence.configuration.domain.objects.TemplateCategory)domMap.get(valueObject);
			}
			// ims.correspondence.vo.TemplateCategoryVo ID_TemplateCategory field is unknown
			domainObject = new ims.correspondence.configuration.domain.objects.TemplateCategory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TemplateCategory());
			if (domMap.get(key) != null)
			{
				return (ims.correspondence.configuration.domain.objects.TemplateCategory)domMap.get(key);
			}
			domainObject = (ims.correspondence.configuration.domain.objects.TemplateCategory) domainFactory.getDomainObject(ims.correspondence.configuration.domain.objects.TemplateCategory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TemplateCategory());

		ims.core.admin.domain.objects.TemplateBo value1 = null;
		if ( null != valueObject.getTemplate() ) 
		{
			if (valueObject.getTemplate().getBoId() == null)
			{
				if (domMap.get(valueObject.getTemplate()) != null)
				{
					value1 = (ims.core.admin.domain.objects.TemplateBo)domMap.get(valueObject.getTemplate());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTemplate();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.TemplateBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, valueObject.getTemplate().getBoId());
			}
		}
		domainObject.setTemplate(value1);
		ims.correspondence.vo.lookups.HeaderCollection collection2 =
	valueObject.getDischargeCategories();
	    java.util.List domainDischargeCategories = domainObject.getDischargeCategories();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainDischargeCategories = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainDischargeCategories.indexOf(dom);
			if (domIdx == -1)
			{
				domainDischargeCategories.add(i, dom);
			}
			else if (i != domIdx && i < domainDischargeCategories.size())
			{
				Object tmp = domainDischargeCategories.get(i);
				domainDischargeCategories.set(i, domainDischargeCategories.get(domIdx));
				domainDischargeCategories.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainDischargeCategories.size();
		while (j2 > collection2Size)
		{
			domainDischargeCategories.remove(j2-1);
			j2 = domainDischargeCategories.size();
		}

		domainObject.setDischargeCategories(domainDischargeCategories);		

		return domainObject;
	}

}
