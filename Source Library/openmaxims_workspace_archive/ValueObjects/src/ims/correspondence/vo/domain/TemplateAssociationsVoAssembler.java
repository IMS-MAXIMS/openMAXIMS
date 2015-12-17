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
 * @author Neil McAnaspie
 */
public class TemplateAssociationsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.correspondence.vo.TemplateAssociationsVo copy(ims.correspondence.vo.TemplateAssociationsVo valueObjectDest, ims.correspondence.vo.TemplateAssociationsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TemplateAssociations(valueObjectSrc.getID_TemplateAssociations());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// template
		valueObjectDest.setTemplate(valueObjectSrc.getTemplate());
		// Clinics
		valueObjectDest.setClinics(valueObjectSrc.getClinics());
		// Specialties
		valueObjectDest.setSpecialties(valueObjectSrc.getSpecialties());
		// Consultants
		valueObjectDest.setConsultants(valueObjectSrc.getConsultants());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTemplateAssociationsVoCollectionFromTemplateAssociations(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.TemplateAssociations objects.
	 */
	public static ims.correspondence.vo.TemplateAssociationsVoCollection createTemplateAssociationsVoCollectionFromTemplateAssociations(java.util.Set domainObjectSet)	
	{
		return createTemplateAssociationsVoCollectionFromTemplateAssociations(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.TemplateAssociations objects.
	 */
	public static ims.correspondence.vo.TemplateAssociationsVoCollection createTemplateAssociationsVoCollectionFromTemplateAssociations(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.correspondence.vo.TemplateAssociationsVoCollection voList = new ims.correspondence.vo.TemplateAssociationsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject = (ims.correspondence.configuration.domain.objects.TemplateAssociations) iterator.next();
			ims.correspondence.vo.TemplateAssociationsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.TemplateAssociations objects.
	 */
	public static ims.correspondence.vo.TemplateAssociationsVoCollection createTemplateAssociationsVoCollectionFromTemplateAssociations(java.util.List domainObjectList) 
	{
		return createTemplateAssociationsVoCollectionFromTemplateAssociations(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.TemplateAssociations objects.
	 */
	public static ims.correspondence.vo.TemplateAssociationsVoCollection createTemplateAssociationsVoCollectionFromTemplateAssociations(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.correspondence.vo.TemplateAssociationsVoCollection voList = new ims.correspondence.vo.TemplateAssociationsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject = (ims.correspondence.configuration.domain.objects.TemplateAssociations) domainObjectList.get(i);
			ims.correspondence.vo.TemplateAssociationsVo vo = create(map, domainObject);

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
	 * Create the ims.correspondence.configuration.domain.objects.TemplateAssociations set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTemplateAssociationsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateAssociationsVoCollection voCollection) 
	 {
	 	return extractTemplateAssociationsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTemplateAssociationsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateAssociationsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.TemplateAssociationsVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject = TemplateAssociationsVoAssembler.extractTemplateAssociations(domainFactory, vo, domMap);

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
	 * Create the ims.correspondence.configuration.domain.objects.TemplateAssociations list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTemplateAssociationsList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateAssociationsVoCollection voCollection) 
	 {
	 	return extractTemplateAssociationsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTemplateAssociationsList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateAssociationsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.TemplateAssociationsVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject = TemplateAssociationsVoAssembler.extractTemplateAssociations(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.correspondence.configuration.domain.objects.TemplateAssociations object.
	 * @param domainObject ims.correspondence.configuration.domain.objects.TemplateAssociations
	 */
	 public static ims.correspondence.vo.TemplateAssociationsVo create(ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.correspondence.configuration.domain.objects.TemplateAssociations object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.correspondence.vo.TemplateAssociationsVo create(DomainObjectMap map, ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.correspondence.vo.TemplateAssociationsVo valueObject = (ims.correspondence.vo.TemplateAssociationsVo) map.getValueObject(domainObject, ims.correspondence.vo.TemplateAssociationsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.correspondence.vo.TemplateAssociationsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.correspondence.configuration.domain.objects.TemplateAssociations
	 */
	 public static ims.correspondence.vo.TemplateAssociationsVo insert(ims.correspondence.vo.TemplateAssociationsVo valueObject, ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject) 
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
	 * @param domainObject ims.correspondence.configuration.domain.objects.TemplateAssociations
	 */
	 public static ims.correspondence.vo.TemplateAssociationsVo insert(DomainObjectMap map, ims.correspondence.vo.TemplateAssociationsVo valueObject, ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TemplateAssociations(domainObject.getId());
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
		// Clinics
		valueObject.setClinics(ims.core.vo.domain.ClinicLiteVoAssembler.createClinicLiteVoCollectionFromClinic(map, domainObject.getClinics()) );
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
		// Consultants
		valueObject.setConsultants(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getConsultants()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.correspondence.configuration.domain.objects.TemplateAssociations extractTemplateAssociations(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateAssociationsVo valueObject) 
	{
		return 	extractTemplateAssociations(domainFactory, valueObject, new HashMap());
	}

	public static ims.correspondence.configuration.domain.objects.TemplateAssociations extractTemplateAssociations(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.TemplateAssociationsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TemplateAssociations();
		ims.correspondence.configuration.domain.objects.TemplateAssociations domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.correspondence.configuration.domain.objects.TemplateAssociations)domMap.get(valueObject);
			}
			// ims.correspondence.vo.TemplateAssociationsVo ID_TemplateAssociations field is unknown
			domainObject = new ims.correspondence.configuration.domain.objects.TemplateAssociations();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TemplateAssociations());
			if (domMap.get(key) != null)
			{
				return (ims.correspondence.configuration.domain.objects.TemplateAssociations)domMap.get(key);
			}
			domainObject = (ims.correspondence.configuration.domain.objects.TemplateAssociations) domainFactory.getDomainObject(ims.correspondence.configuration.domain.objects.TemplateAssociations.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TemplateAssociations());

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
		domainObject.setClinics(ims.core.vo.domain.ClinicLiteVoAssembler.extractClinicSet(domainFactory, valueObject.getClinics(), domainObject.getClinics(), domMap));		
		ims.core.vo.lookups.SpecialtyCollection collection3 =
	valueObject.getSpecialties();
	    java.util.List domainSpecialties = domainObject.getSpecialties();;			
	    int collection3Size=0;
		if (collection3 == null)
		{
			domainSpecialties = new java.util.ArrayList(0);
		}
		else
		{
			collection3Size = collection3.size();
		}
		
		for(int i=0; i<collection3Size; i++) 
		{
			int instanceId = collection3.get(i).getID();
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
		int j3 = domainSpecialties.size();
		while (j3 > collection3Size)
		{
			domainSpecialties.remove(j3-1);
			j3 = domainSpecialties.size();
		}

		domainObject.setSpecialties(domainSpecialties);		
		domainObject.setConsultants(ims.core.vo.domain.MedicLiteVoAssembler.extractMedicSet(domainFactory, valueObject.getConsultants(), domainObject.getConsultants(), domMap));		

		return domainObject;
	}

}
