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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class FamilyAddressVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.FamilyAddressVo copy(ims.pci.vo.FamilyAddressVo valueObjectDest, ims.pci.vo.FamilyAddressVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// identifiers
		valueObjectDest.setIdentifiers(valueObjectSrc.getIdentifiers());
		// addresses
		valueObjectDest.setAddresses(valueObjectSrc.getAddresses());
		// clientParent
		valueObjectDest.setClientParent(valueObjectSrc.getClientParent());
		// CommunityCare
		valueObjectDest.setCommunityCare(valueObjectSrc.getCommunityCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFamilyAddressVoCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.FamilyAddressVoCollection createFamilyAddressVoCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createFamilyAddressVoCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.FamilyAddressVoCollection createFamilyAddressVoCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.FamilyAddressVoCollection voList = new ims.pci.vo.FamilyAddressVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) iterator.next();
			ims.pci.vo.FamilyAddressVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.FamilyAddressVoCollection createFamilyAddressVoCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createFamilyAddressVoCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.pci.vo.FamilyAddressVoCollection createFamilyAddressVoCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.FamilyAddressVoCollection voList = new ims.pci.vo.FamilyAddressVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.pci.vo.FamilyAddressVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.Patient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.FamilyAddressVoCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.FamilyAddressVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.FamilyAddressVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = FamilyAddressVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.Patient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.FamilyAddressVoCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.FamilyAddressVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.FamilyAddressVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = FamilyAddressVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.pci.vo.FamilyAddressVo create(ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.FamilyAddressVo create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.FamilyAddressVo valueObject = (ims.pci.vo.FamilyAddressVo) map.getValueObject(domainObject, ims.pci.vo.FamilyAddressVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.FamilyAddressVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.pci.vo.FamilyAddressVo insert(ims.pci.vo.FamilyAddressVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.pci.vo.FamilyAddressVo insert(DomainObjectMap map, ims.pci.vo.FamilyAddressVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Patient(domainObject.getId());
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
		if (domainObject.getName() != null)
		{
			if(domainObject.getName() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getName();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setName(new ims.core.generic.vo.PersonNameRefVo(id, -1));				
			}
			else
			{
				valueObject.setName(new ims.core.generic.vo.PersonNameRefVo(domainObject.getName().getId(), domainObject.getName().getVersion()));
			}
		}
		// address
		if (domainObject.getAddress() != null)
		{
			if(domainObject.getAddress() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAddress();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAddress(new ims.core.generic.vo.AddressRefVo(id, -1));				
			}
			else
			{
				valueObject.setAddress(new ims.core.generic.vo.AddressRefVo(domainObject.getAddress().getId(), domainObject.getAddress().getVersion()));
			}
		}
		// identifiers
		ims.core.patient.vo.PatientIdRefVoCollection identifiers = new ims.core.patient.vo.PatientIdRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getIdentifiers().iterator(); iterator.hasNext(); ) 
		{
			ims.core.patient.domain.objects.PatientId tmp = (ims.core.patient.domain.objects.PatientId)iterator.next();
			if (tmp != null)
				identifiers.add(new ims.core.patient.vo.PatientIdRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setIdentifiers(identifiers);
		// addresses
		ims.core.generic.vo.AddressRefVoCollection addresses = new ims.core.generic.vo.AddressRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAddresses().iterator(); iterator.hasNext(); ) 
		{
			ims.core.generic.domain.objects.Address tmp = (ims.core.generic.domain.objects.Address)iterator.next();
			if (tmp != null)
				addresses.add(new ims.core.generic.vo.AddressRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAddresses(addresses);
		// clientParent
		if (domainObject.getClientParent() != null)
		{
			if(domainObject.getClientParent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClientParent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClientParent(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setClientParent(new ims.core.patient.vo.PatientRefVo(domainObject.getClientParent().getId(), domainObject.getClientParent().getVersion()));
			}
		}
		// CommunityCare
		if (domainObject.getCommunityCare() != null)
		{
			if(domainObject.getCommunityCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCommunityCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCommunityCare(new ims.core.patient.vo.CommunityCareDetailRefVo(id, -1));				
			}
			else
			{
				valueObject.setCommunityCare(new ims.core.patient.vo.CommunityCareDetailRefVo(domainObject.getCommunityCare().getId(), domainObject.getCommunityCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.FamilyAddressVo valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.FamilyAddressVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Patient();
		ims.core.patient.domain.objects.Patient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(valueObject);
			}
			// ims.pci.vo.FamilyAddressVo ID_Patient field is unknown
			domainObject = new ims.core.patient.domain.objects.Patient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Patient());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.Patient) domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Patient());

		ims.core.generic.domain.objects.PersonName value1 = null;
		if ( null != valueObject.getName() ) 
		{
			if (valueObject.getName().getBoId() == null)
			{
				if (domMap.get(valueObject.getName()) != null)
				{
					value1 = (ims.core.generic.domain.objects.PersonName)domMap.get(valueObject.getName());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getName();	
			}
			else
			{
				value1 = (ims.core.generic.domain.objects.PersonName)domainFactory.getDomainObject(ims.core.generic.domain.objects.PersonName.class, valueObject.getName().getBoId());
			}
		}
		domainObject.setName(value1);
		ims.core.generic.domain.objects.Address value2 = null;
		if ( null != valueObject.getAddress() ) 
		{
			if (valueObject.getAddress().getBoId() == null)
			{
				if (domMap.get(valueObject.getAddress()) != null)
				{
					value2 = (ims.core.generic.domain.objects.Address)domMap.get(valueObject.getAddress());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAddress();	
			}
			else
			{
				value2 = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject(ims.core.generic.domain.objects.Address.class, valueObject.getAddress().getBoId());
			}
		}
		domainObject.setAddress(value2);

		ims.core.patient.vo.PatientIdRefVoCollection refCollection3 = valueObject.getIdentifiers();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainIdentifiers3 = domainObject.getIdentifiers();
		if (domainIdentifiers3 == null)
		{
			domainIdentifiers3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.core.patient.vo.PatientIdRefVo vo = refCollection3.get(i);			
			ims.core.patient.domain.objects.PatientId dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.patient.domain.objects.PatientId)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.patient.domain.objects.PatientId)domainFactory.getDomainObject( ims.core.patient.domain.objects.PatientId.class, vo.getBoId());
				}
			}

			int domIdx = domainIdentifiers3.indexOf(dom);
			if (domIdx == -1)
			{
				domainIdentifiers3.add(i, dom);
			}
			else if (i != domIdx && i < domainIdentifiers3.size())
			{
				Object tmp = domainIdentifiers3.get(i);
				domainIdentifiers3.set(i, domainIdentifiers3.get(domIdx));
				domainIdentifiers3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainIdentifiers3.size();
		while (i3 > size3)
		{
			domainIdentifiers3.remove(i3-1);
			i3 = domainIdentifiers3.size();
		}
		
		domainObject.setIdentifiers(domainIdentifiers3);		

		ims.core.generic.vo.AddressRefVoCollection refCollection4 = valueObject.getAddresses();
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainAddresses4 = domainObject.getAddresses();
		if (domainAddresses4 == null)
		{
			domainAddresses4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.core.generic.vo.AddressRefVo vo = refCollection4.get(i);			
			ims.core.generic.domain.objects.Address dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.Address)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject( ims.core.generic.domain.objects.Address.class, vo.getBoId());
				}
			}

			int domIdx = domainAddresses4.indexOf(dom);
			if (domIdx == -1)
			{
				domainAddresses4.add(i, dom);
			}
			else if (i != domIdx && i < domainAddresses4.size())
			{
				Object tmp = domainAddresses4.get(i);
				domainAddresses4.set(i, domainAddresses4.get(domIdx));
				domainAddresses4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainAddresses4.size();
		while (i4 > size4)
		{
			domainAddresses4.remove(i4-1);
			i4 = domainAddresses4.size();
		}
		
		domainObject.setAddresses(domainAddresses4);		
		ims.core.patient.domain.objects.Patient value5 = null;
		if ( null != valueObject.getClientParent() ) 
		{
			if (valueObject.getClientParent().getBoId() == null)
			{
				if (domMap.get(valueObject.getClientParent()) != null)
				{
					value5 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getClientParent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getClientParent();	
			}
			else
			{
				value5 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getClientParent().getBoId());
			}
		}
		domainObject.setClientParent(value5);
		ims.core.patient.domain.objects.CommunityCareDetail value6 = null;
		if ( null != valueObject.getCommunityCare() ) 
		{
			if (valueObject.getCommunityCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getCommunityCare()) != null)
				{
					value6 = (ims.core.patient.domain.objects.CommunityCareDetail)domMap.get(valueObject.getCommunityCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCommunityCare();	
			}
			else
			{
				value6 = (ims.core.patient.domain.objects.CommunityCareDetail)domainFactory.getDomainObject(ims.core.patient.domain.objects.CommunityCareDetail.class, valueObject.getCommunityCare().getBoId());
			}
		}
		domainObject.setCommunityCare(value6);

		return domainObject;
	}

}
