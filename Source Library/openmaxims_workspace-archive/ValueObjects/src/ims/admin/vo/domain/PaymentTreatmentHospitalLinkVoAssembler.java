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
 * @author Rory Fitzpatrick
 */
public class PaymentTreatmentHospitalLinkVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.PaymentTreatmentHospitalLinkVo copy(ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObjectDest, ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PaymentTreatingHospitalLink(valueObjectSrc.getID_PaymentTreatingHospitalLink());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PaymentHospital
		valueObjectDest.setPaymentHospital(valueObjectSrc.getPaymentHospital());
		// TreatingHospital
		valueObjectDest.setTreatingHospital(valueObjectSrc.getTreatingHospital());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink objects.
	 */
	public static ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(java.util.Set domainObjectSet)	
	{
		return createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink objects.
	 */
	public static ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection voList = new ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject = (ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink) iterator.next();
			ims.admin.vo.PaymentTreatmentHospitalLinkVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink objects.
	 */
	public static ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(java.util.List domainObjectList) 
	{
		return createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink objects.
	 */
	public static ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection createPaymentTreatmentHospitalLinkVoCollectionFromPaymentTreatingHospitalLink(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection voList = new ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject = (ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink) domainObjectList.get(i);
			ims.admin.vo.PaymentTreatmentHospitalLinkVo vo = create(map, domainObject);

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
	 * Create the ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPaymentTreatingHospitalLinkSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection voCollection) 
	 {
	 	return extractPaymentTreatingHospitalLinkSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPaymentTreatingHospitalLinkSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PaymentTreatmentHospitalLinkVo vo = voCollection.get(i);
			ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject = PaymentTreatmentHospitalLinkVoAssembler.extractPaymentTreatingHospitalLink(domainFactory, vo, domMap);

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
	 * Create the ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPaymentTreatingHospitalLinkList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection voCollection) 
	 {
	 	return extractPaymentTreatingHospitalLinkList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPaymentTreatingHospitalLinkList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PaymentTreatmentHospitalLinkVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PaymentTreatmentHospitalLinkVo vo = voCollection.get(i);
			ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject = PaymentTreatmentHospitalLinkVoAssembler.extractPaymentTreatingHospitalLink(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink object.
	 * @param domainObject ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink
	 */
	 public static ims.admin.vo.PaymentTreatmentHospitalLinkVo create(ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.PaymentTreatmentHospitalLinkVo create(DomainObjectMap map, ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObject = (ims.admin.vo.PaymentTreatmentHospitalLinkVo) map.getValueObject(domainObject, ims.admin.vo.PaymentTreatmentHospitalLinkVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.PaymentTreatmentHospitalLinkVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink
	 */
	 public static ims.admin.vo.PaymentTreatmentHospitalLinkVo insert(ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObject, ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject) 
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
	 * @param domainObject ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink
	 */
	 public static ims.admin.vo.PaymentTreatmentHospitalLinkVo insert(DomainObjectMap map, ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObject, ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PaymentTreatingHospitalLink(domainObject.getId());
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
			
		// PaymentHospital
		valueObject.setPaymentHospital(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getPaymentHospital()) );
		// TreatingHospital
		valueObject.setTreatingHospital(ims.core.vo.domain.LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(map, domainObject.getTreatingHospital()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink extractPaymentTreatingHospitalLink(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObject) 
	{
		return 	extractPaymentTreatingHospitalLink(domainFactory, valueObject, new HashMap());
	}

	public static ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink extractPaymentTreatingHospitalLink(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PaymentTreatmentHospitalLinkVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PaymentTreatingHospitalLink();
		ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink)domMap.get(valueObject);
			}
			// ims.admin.vo.PaymentTreatmentHospitalLinkVo ID_PaymentTreatingHospitalLink field is unknown
			domainObject = new ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PaymentTreatingHospitalLink());
			if (domMap.get(key) != null)
			{
				return (ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink)domMap.get(key);
			}
			domainObject = (ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink) domainFactory.getDomainObject(ims.ntpf.configuration.domain.objects.PaymentTreatingHospitalLink.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PaymentTreatingHospitalLink());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getPaymentHospital() ) 
		{
			if (valueObject.getPaymentHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getPaymentHospital()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getPaymentHospital());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getPaymentHospital().getBoId());
			}
		}
		domainObject.setPaymentHospital(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.LocationRefVoCollection refCollection2 = new ims.core.resource.place.vo.LocationRefVoCollection();
		if (valueObject.getTreatingHospital() != null)
		{
			for (int i2=0; i2<valueObject.getTreatingHospital().size(); i2++)
			{
				ims.core.resource.place.vo.LocationRefVo ref2 = (ims.core.resource.place.vo.LocationRefVo)valueObject.getTreatingHospital().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainTreatingHospital2 = domainObject.getTreatingHospital();
		if (domainTreatingHospital2 == null)
		{
			domainTreatingHospital2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.core.resource.place.vo.LocationRefVo vo = refCollection2.get(i);			
			ims.core.resource.place.domain.objects.Location dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Location)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Location.class, vo.getBoId());
				}
			}

			int domIdx = domainTreatingHospital2.indexOf(dom);
			if (domIdx == -1)
			{
				domainTreatingHospital2.add(i, dom);
			}
			else if (i != domIdx && i < domainTreatingHospital2.size())
			{
				Object tmp = domainTreatingHospital2.get(i);
				domainTreatingHospital2.set(i, domainTreatingHospital2.get(domIdx));
				domainTreatingHospital2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainTreatingHospital2.size();
		while (i2 > size2)
		{
			domainTreatingHospital2.remove(i2-1);
			i2 = domainTreatingHospital2.size();
		}
		
		domainObject.setTreatingHospital(domainTreatingHospital2);		

		return domainObject;
	}

}
