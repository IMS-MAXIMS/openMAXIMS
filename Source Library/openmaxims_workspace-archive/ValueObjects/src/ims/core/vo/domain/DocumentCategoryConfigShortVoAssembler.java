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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Calin Perebiceanu
 */
public class DocumentCategoryConfigShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.DocumentCategoryConfigShortVo copy(ims.core.vo.DocumentCategoryConfigShortVo valueObjectDest, ims.core.vo.DocumentCategoryConfigShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DocumentCategoryConfig(valueObjectSrc.getID_DocumentCategoryConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Template
		valueObjectDest.setTemplate(valueObjectSrc.getTemplate());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.DocumentCategoryConfig objects.
	 */
	public static ims.core.vo.DocumentCategoryConfigShortVoCollection createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(java.util.Set domainObjectSet)	
	{
		return createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.DocumentCategoryConfig objects.
	 */
	public static ims.core.vo.DocumentCategoryConfigShortVoCollection createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.DocumentCategoryConfigShortVoCollection voList = new ims.core.vo.DocumentCategoryConfigShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.documents.domain.objects.DocumentCategoryConfig domainObject = (ims.core.documents.domain.objects.DocumentCategoryConfig) iterator.next();
			ims.core.vo.DocumentCategoryConfigShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.documents.domain.objects.DocumentCategoryConfig objects.
	 */
	public static ims.core.vo.DocumentCategoryConfigShortVoCollection createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(java.util.List domainObjectList) 
	{
		return createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.DocumentCategoryConfig objects.
	 */
	public static ims.core.vo.DocumentCategoryConfigShortVoCollection createDocumentCategoryConfigShortVoCollectionFromDocumentCategoryConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.DocumentCategoryConfigShortVoCollection voList = new ims.core.vo.DocumentCategoryConfigShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.DocumentCategoryConfig domainObject = (ims.core.documents.domain.objects.DocumentCategoryConfig) domainObjectList.get(i);
			ims.core.vo.DocumentCategoryConfigShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.documents.domain.objects.DocumentCategoryConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDocumentCategoryConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DocumentCategoryConfigShortVoCollection voCollection) 
	 {
	 	return extractDocumentCategoryConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDocumentCategoryConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DocumentCategoryConfigShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DocumentCategoryConfigShortVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.DocumentCategoryConfig domainObject = DocumentCategoryConfigShortVoAssembler.extractDocumentCategoryConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.documents.domain.objects.DocumentCategoryConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDocumentCategoryConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DocumentCategoryConfigShortVoCollection voCollection) 
	 {
	 	return extractDocumentCategoryConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDocumentCategoryConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DocumentCategoryConfigShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DocumentCategoryConfigShortVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.DocumentCategoryConfig domainObject = DocumentCategoryConfigShortVoAssembler.extractDocumentCategoryConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.documents.domain.objects.DocumentCategoryConfig object.
	 * @param domainObject ims.core.documents.domain.objects.DocumentCategoryConfig
	 */
	 public static ims.core.vo.DocumentCategoryConfigShortVo create(ims.core.documents.domain.objects.DocumentCategoryConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.documents.domain.objects.DocumentCategoryConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.DocumentCategoryConfigShortVo create(DomainObjectMap map, ims.core.documents.domain.objects.DocumentCategoryConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.DocumentCategoryConfigShortVo valueObject = (ims.core.vo.DocumentCategoryConfigShortVo) map.getValueObject(domainObject, ims.core.vo.DocumentCategoryConfigShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.DocumentCategoryConfigShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.documents.domain.objects.DocumentCategoryConfig
	 */
	 public static ims.core.vo.DocumentCategoryConfigShortVo insert(ims.core.vo.DocumentCategoryConfigShortVo valueObject, ims.core.documents.domain.objects.DocumentCategoryConfig domainObject) 
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
	 * @param domainObject ims.core.documents.domain.objects.DocumentCategoryConfig
	 */
	 public static ims.core.vo.DocumentCategoryConfigShortVo insert(DomainObjectMap map, ims.core.vo.DocumentCategoryConfigShortVo valueObject, ims.core.documents.domain.objects.DocumentCategoryConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DocumentCategoryConfig(domainObject.getId());
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
			
		// Template
		valueObject.setTemplate(ims.core.vo.domain.TemplateForPatientDocumentVoAssembler.create(map, domainObject.getTemplate()) );
		// Specialty
		java.util.List listSpecialty = domainObject.getSpecialty();
		ims.core.vo.lookups.SpecialtyCollection Specialty = new ims.core.vo.lookups.SpecialtyCollection();
		for(java.util.Iterator iterator = listSpecialty.iterator(); iterator.hasNext(); ) 
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
			Specialty.add(voInstance);
		}
		valueObject.setSpecialty( Specialty );
		// Category
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCategory();
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

			ims.core.vo.lookups.DocumentCategory voLookup3 = new ims.core.vo.lookups.DocumentCategory(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.DocumentCategory parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.DocumentCategory(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCategory(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.DocumentCategoryConfig extractDocumentCategoryConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DocumentCategoryConfigShortVo valueObject) 
	{
		return 	extractDocumentCategoryConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.DocumentCategoryConfig extractDocumentCategoryConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DocumentCategoryConfigShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DocumentCategoryConfig();
		ims.core.documents.domain.objects.DocumentCategoryConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.documents.domain.objects.DocumentCategoryConfig)domMap.get(valueObject);
			}
			// ims.core.vo.DocumentCategoryConfigShortVo ID_DocumentCategoryConfig field is unknown
			domainObject = new ims.core.documents.domain.objects.DocumentCategoryConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DocumentCategoryConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.documents.domain.objects.DocumentCategoryConfig)domMap.get(key);
			}
			domainObject = (ims.core.documents.domain.objects.DocumentCategoryConfig) domainFactory.getDomainObject(ims.core.documents.domain.objects.DocumentCategoryConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DocumentCategoryConfig());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.admin.domain.objects.TemplateBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, valueObject.getTemplate().getBoId());
			}
		}
		domainObject.setTemplate(value1);
		ims.core.vo.lookups.SpecialtyCollection collection2 =
	valueObject.getSpecialty();
	    java.util.List domainSpecialty = domainObject.getSpecialty();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainSpecialty = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSpecialty.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecialty.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecialty.size())
			{
				Object tmp = domainSpecialty.get(i);
				domainSpecialty.set(i, domainSpecialty.get(domIdx));
				domainSpecialty.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainSpecialty.size();
		while (j2 > collection2Size)
		{
			domainSpecialty.remove(j2-1);
			j2 = domainSpecialty.size();
		}

		domainObject.setSpecialty(domainSpecialty);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value3);

		return domainObject;
	}

}
