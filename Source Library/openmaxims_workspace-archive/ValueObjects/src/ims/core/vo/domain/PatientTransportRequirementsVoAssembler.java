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
 * @author George Cristian Josan
 */
public class PatientTransportRequirementsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientTransportRequirementsVo copy(ims.core.vo.PatientTransportRequirementsVo valueObjectDest, ims.core.vo.PatientTransportRequirementsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientTransportRequirements(valueObjectSrc.getID_PatientTransportRequirements());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// TransportRequired
		valueObjectDest.setTransportRequired(valueObjectSrc.getTransportRequired());
		// Transport
		valueObjectDest.setTransport(valueObjectSrc.getTransport());
		// SpecialRequirements
		valueObjectDest.setSpecialRequirements(valueObjectSrc.getSpecialRequirements());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.domain.objects.PatientTransportRequirements objects.
	 */
	public static ims.core.vo.PatientTransportRequirementsVoCollection createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(java.util.Set domainObjectSet)	
	{
		return createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.domain.objects.PatientTransportRequirements objects.
	 */
	public static ims.core.vo.PatientTransportRequirementsVoCollection createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientTransportRequirementsVoCollection voList = new ims.core.vo.PatientTransportRequirementsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.domain.objects.PatientTransportRequirements domainObject = (ims.core.domain.objects.PatientTransportRequirements) iterator.next();
			ims.core.vo.PatientTransportRequirementsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.domain.objects.PatientTransportRequirements objects.
	 */
	public static ims.core.vo.PatientTransportRequirementsVoCollection createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(java.util.List domainObjectList) 
	{
		return createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.domain.objects.PatientTransportRequirements objects.
	 */
	public static ims.core.vo.PatientTransportRequirementsVoCollection createPatientTransportRequirementsVoCollectionFromPatientTransportRequirements(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientTransportRequirementsVoCollection voList = new ims.core.vo.PatientTransportRequirementsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.domain.objects.PatientTransportRequirements domainObject = (ims.core.domain.objects.PatientTransportRequirements) domainObjectList.get(i);
			ims.core.vo.PatientTransportRequirementsVo vo = create(map, domainObject);

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
	 * Create the ims.core.domain.objects.PatientTransportRequirements set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientTransportRequirementsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientTransportRequirementsVoCollection voCollection) 
	 {
	 	return extractPatientTransportRequirementsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientTransportRequirementsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientTransportRequirementsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientTransportRequirementsVo vo = voCollection.get(i);
			ims.core.domain.objects.PatientTransportRequirements domainObject = PatientTransportRequirementsVoAssembler.extractPatientTransportRequirements(domainFactory, vo, domMap);

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
	 * Create the ims.core.domain.objects.PatientTransportRequirements list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientTransportRequirementsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientTransportRequirementsVoCollection voCollection) 
	 {
	 	return extractPatientTransportRequirementsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientTransportRequirementsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientTransportRequirementsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientTransportRequirementsVo vo = voCollection.get(i);
			ims.core.domain.objects.PatientTransportRequirements domainObject = PatientTransportRequirementsVoAssembler.extractPatientTransportRequirements(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.domain.objects.PatientTransportRequirements object.
	 * @param domainObject ims.core.domain.objects.PatientTransportRequirements
	 */
	 public static ims.core.vo.PatientTransportRequirementsVo create(ims.core.domain.objects.PatientTransportRequirements domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.domain.objects.PatientTransportRequirements object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientTransportRequirementsVo create(DomainObjectMap map, ims.core.domain.objects.PatientTransportRequirements domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientTransportRequirementsVo valueObject = (ims.core.vo.PatientTransportRequirementsVo) map.getValueObject(domainObject, ims.core.vo.PatientTransportRequirementsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientTransportRequirementsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.domain.objects.PatientTransportRequirements
	 */
	 public static ims.core.vo.PatientTransportRequirementsVo insert(ims.core.vo.PatientTransportRequirementsVo valueObject, ims.core.domain.objects.PatientTransportRequirements domainObject) 
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
	 * @param domainObject ims.core.domain.objects.PatientTransportRequirements
	 */
	 public static ims.core.vo.PatientTransportRequirementsVo insert(DomainObjectMap map, ims.core.vo.PatientTransportRequirementsVo valueObject, ims.core.domain.objects.PatientTransportRequirements domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientTransportRequirements(domainObject.getId());
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
			
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// TransportRequired
		valueObject.setTransportRequired( domainObject.isTransportRequired() );
		// Transport
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTransport();
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

			ims.scheduling.vo.lookups.ApptTransportType voLookup3 = new ims.scheduling.vo.lookups.ApptTransportType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTransport(voLookup3);
		}
				// SpecialRequirements
		valueObject.setSpecialRequirements(domainObject.getSpecialRequirements());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.domain.objects.PatientTransportRequirements extractPatientTransportRequirements(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientTransportRequirementsVo valueObject) 
	{
		return 	extractPatientTransportRequirements(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.domain.objects.PatientTransportRequirements extractPatientTransportRequirements(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientTransportRequirementsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientTransportRequirements();
		ims.core.domain.objects.PatientTransportRequirements domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.domain.objects.PatientTransportRequirements)domMap.get(valueObject);
			}
			// ims.core.vo.PatientTransportRequirementsVo ID_PatientTransportRequirements field is unknown
			domainObject = new ims.core.domain.objects.PatientTransportRequirements();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientTransportRequirements());
			if (domMap.get(key) != null)
			{
				return (ims.core.domain.objects.PatientTransportRequirements)domMap.get(key);
			}
			domainObject = (ims.core.domain.objects.PatientTransportRequirements) domainFactory.getDomainObject(ims.core.domain.objects.PatientTransportRequirements.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientTransportRequirements());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		domainObject.setTransportRequired(valueObject.getTransportRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTransport() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTransport().getID());
		}
		domainObject.setTransport(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialRequirements() != null && valueObject.getSpecialRequirements().equals(""))
		{
			valueObject.setSpecialRequirements(null);
		}
		domainObject.setSpecialRequirements(valueObject.getSpecialRequirements());

		return domainObject;
	}

}
