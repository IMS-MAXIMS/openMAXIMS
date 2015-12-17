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
 * @author Dara Hickey
 */
public class NoLetterIsRequiredVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.correspondence.vo.NoLetterIsRequiredVo copy(ims.correspondence.vo.NoLetterIsRequiredVo valueObjectDest, ims.correspondence.vo.NoLetterIsRequiredVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NoLetterIsRequired(valueObjectSrc.getID_NoLetterIsRequired());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Consultants
		valueObjectDest.setConsultants(valueObjectSrc.getConsultants());
		// Specialties
		valueObjectDest.setSpecialties(valueObjectSrc.getSpecialties());
		// NewClinics
		valueObjectDest.setNewClinics(valueObjectSrc.getNewClinics());
		// ReviewClinics
		valueObjectDest.setReviewClinics(valueObjectSrc.getReviewClinics());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.NoLetterIsRequired objects.
	 */
	public static ims.correspondence.vo.NoLetterIsRequiredVoCollection createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(java.util.Set domainObjectSet)	
	{
		return createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.NoLetterIsRequired objects.
	 */
	public static ims.correspondence.vo.NoLetterIsRequiredVoCollection createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.correspondence.vo.NoLetterIsRequiredVoCollection voList = new ims.correspondence.vo.NoLetterIsRequiredVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject = (ims.correspondence.configuration.domain.objects.NoLetterIsRequired) iterator.next();
			ims.correspondence.vo.NoLetterIsRequiredVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.NoLetterIsRequired objects.
	 */
	public static ims.correspondence.vo.NoLetterIsRequiredVoCollection createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(java.util.List domainObjectList) 
	{
		return createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.NoLetterIsRequired objects.
	 */
	public static ims.correspondence.vo.NoLetterIsRequiredVoCollection createNoLetterIsRequiredVoCollectionFromNoLetterIsRequired(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.correspondence.vo.NoLetterIsRequiredVoCollection voList = new ims.correspondence.vo.NoLetterIsRequiredVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject = (ims.correspondence.configuration.domain.objects.NoLetterIsRequired) domainObjectList.get(i);
			ims.correspondence.vo.NoLetterIsRequiredVo vo = create(map, domainObject);

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
	 * Create the ims.correspondence.configuration.domain.objects.NoLetterIsRequired set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNoLetterIsRequiredSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.NoLetterIsRequiredVoCollection voCollection) 
	 {
	 	return extractNoLetterIsRequiredSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNoLetterIsRequiredSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.NoLetterIsRequiredVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.NoLetterIsRequiredVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject = NoLetterIsRequiredVoAssembler.extractNoLetterIsRequired(domainFactory, vo, domMap);

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
	 * Create the ims.correspondence.configuration.domain.objects.NoLetterIsRequired list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNoLetterIsRequiredList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.NoLetterIsRequiredVoCollection voCollection) 
	 {
	 	return extractNoLetterIsRequiredList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNoLetterIsRequiredList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.NoLetterIsRequiredVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.NoLetterIsRequiredVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject = NoLetterIsRequiredVoAssembler.extractNoLetterIsRequired(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.correspondence.configuration.domain.objects.NoLetterIsRequired object.
	 * @param domainObject ims.correspondence.configuration.domain.objects.NoLetterIsRequired
	 */
	 public static ims.correspondence.vo.NoLetterIsRequiredVo create(ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.correspondence.configuration.domain.objects.NoLetterIsRequired object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.correspondence.vo.NoLetterIsRequiredVo create(DomainObjectMap map, ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.correspondence.vo.NoLetterIsRequiredVo valueObject = (ims.correspondence.vo.NoLetterIsRequiredVo) map.getValueObject(domainObject, ims.correspondence.vo.NoLetterIsRequiredVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.correspondence.vo.NoLetterIsRequiredVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.correspondence.configuration.domain.objects.NoLetterIsRequired
	 */
	 public static ims.correspondence.vo.NoLetterIsRequiredVo insert(ims.correspondence.vo.NoLetterIsRequiredVo valueObject, ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject) 
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
	 * @param domainObject ims.correspondence.configuration.domain.objects.NoLetterIsRequired
	 */
	 public static ims.correspondence.vo.NoLetterIsRequiredVo insert(DomainObjectMap map, ims.correspondence.vo.NoLetterIsRequiredVo valueObject, ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NoLetterIsRequired(domainObject.getId());
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
			
		// Consultants
		valueObject.setConsultants(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getConsultants()) );
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
		// NewClinics
		valueObject.setNewClinics(ims.core.vo.domain.ClinicLiteVoAssembler.createClinicLiteVoCollectionFromClinic(map, domainObject.getNewClinics()) );
		// ReviewClinics
		valueObject.setReviewClinics(ims.core.vo.domain.ClinicLiteVoAssembler.createClinicLiteVoCollectionFromClinic(map, domainObject.getReviewClinics()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.correspondence.configuration.domain.objects.NoLetterIsRequired extractNoLetterIsRequired(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.NoLetterIsRequiredVo valueObject) 
	{
		return 	extractNoLetterIsRequired(domainFactory, valueObject, new HashMap());
	}

	public static ims.correspondence.configuration.domain.objects.NoLetterIsRequired extractNoLetterIsRequired(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.NoLetterIsRequiredVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NoLetterIsRequired();
		ims.correspondence.configuration.domain.objects.NoLetterIsRequired domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.correspondence.configuration.domain.objects.NoLetterIsRequired)domMap.get(valueObject);
			}
			// ims.correspondence.vo.NoLetterIsRequiredVo ID_NoLetterIsRequired field is unknown
			domainObject = new ims.correspondence.configuration.domain.objects.NoLetterIsRequired();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NoLetterIsRequired());
			if (domMap.get(key) != null)
			{
				return (ims.correspondence.configuration.domain.objects.NoLetterIsRequired)domMap.get(key);
			}
			domainObject = (ims.correspondence.configuration.domain.objects.NoLetterIsRequired) domainFactory.getDomainObject(ims.correspondence.configuration.domain.objects.NoLetterIsRequired.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NoLetterIsRequired());


		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.people.vo.MedicRefVoCollection refCollection1 = new ims.core.resource.people.vo.MedicRefVoCollection();
		if (valueObject.getConsultants() != null)
		{
			for (int i1=0; i1<valueObject.getConsultants().size(); i1++)
			{
				ims.core.resource.people.vo.MedicRefVo ref1 = (ims.core.resource.people.vo.MedicRefVo)valueObject.getConsultants().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainConsultants1 = domainObject.getConsultants();
		if (domainConsultants1 == null)
		{
			domainConsultants1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.core.resource.people.vo.MedicRefVo vo = refCollection1.get(i);					
			ims.core.resource.people.domain.objects.Medic dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.people.domain.objects.Medic)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject( ims.core.resource.people.domain.objects.Medic.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainConsultants1.contains(dom))
			{
				domainConsultants1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainConsultants1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainConsultants1.remove(iter1.next());
		}		
		
		domainObject.setConsultants(domainConsultants1);		
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

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.ClinicRefVoCollection refCollection3 = new ims.core.resource.place.vo.ClinicRefVoCollection();
		if (valueObject.getNewClinics() != null)
		{
			for (int i3=0; i3<valueObject.getNewClinics().size(); i3++)
			{
				ims.core.resource.place.vo.ClinicRefVo ref3 = (ims.core.resource.place.vo.ClinicRefVo)valueObject.getNewClinics().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainNewClinics3 = domainObject.getNewClinics();
		if (domainNewClinics3 == null)
		{
			domainNewClinics3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.resource.place.vo.ClinicRefVo vo = refCollection3.get(i);					
			ims.core.resource.place.domain.objects.Clinic dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Clinic)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Clinic.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainNewClinics3.contains(dom))
			{
				domainNewClinics3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainNewClinics3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainNewClinics3.remove(iter3.next());
		}		
		
		domainObject.setNewClinics(domainNewClinics3);		

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.ClinicRefVoCollection refCollection4 = new ims.core.resource.place.vo.ClinicRefVoCollection();
		if (valueObject.getReviewClinics() != null)
		{
			for (int i4=0; i4<valueObject.getReviewClinics().size(); i4++)
			{
				ims.core.resource.place.vo.ClinicRefVo ref4 = (ims.core.resource.place.vo.ClinicRefVo)valueObject.getReviewClinics().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainReviewClinics4 = domainObject.getReviewClinics();
		if (domainReviewClinics4 == null)
		{
			domainReviewClinics4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.core.resource.place.vo.ClinicRefVo vo = refCollection4.get(i);					
			ims.core.resource.place.domain.objects.Clinic dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Clinic)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Clinic)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Clinic.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainReviewClinics4.contains(dom))
			{
				domainReviewClinics4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainReviewClinics4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainReviewClinics4.remove(iter4.next());
		}		
		
		domainObject.setReviewClinics(domainReviewClinics4);		
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
