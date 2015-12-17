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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class GmsPaymentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.GmsPaymentsVo copy(ims.pci.vo.GmsPaymentsVo valueObjectDest, ims.pci.vo.GmsPaymentsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GmsPayments(valueObjectSrc.getID_GmsPayments());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// GPContract
		valueObjectDest.setGPContract(valueObjectSrc.getGPContract());
		// YearMonth
		valueObjectDest.setYearMonth(valueObjectSrc.getYearMonth());
		// AmountPaid
		valueObjectDest.setAmountPaid(valueObjectSrc.getAmountPaid());
		// GMSPaymentType
		valueObjectDest.setGMSPaymentType(valueObjectSrc.getGMSPaymentType());
		// ImportDate
		valueObjectDest.setImportDate(valueObjectSrc.getImportDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGmsPaymentsVoCollectionFromGmsPayments(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.GmsPayments objects.
	 */
	public static ims.pci.vo.GmsPaymentsVoCollection createGmsPaymentsVoCollectionFromGmsPayments(java.util.Set domainObjectSet)	
	{
		return createGmsPaymentsVoCollectionFromGmsPayments(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.GmsPayments objects.
	 */
	public static ims.pci.vo.GmsPaymentsVoCollection createGmsPaymentsVoCollectionFromGmsPayments(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.GmsPaymentsVoCollection voList = new ims.pci.vo.GmsPaymentsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.GmsPayments domainObject = (ims.pci.domain.objects.GmsPayments) iterator.next();
			ims.pci.vo.GmsPaymentsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.GmsPayments objects.
	 */
	public static ims.pci.vo.GmsPaymentsVoCollection createGmsPaymentsVoCollectionFromGmsPayments(java.util.List domainObjectList) 
	{
		return createGmsPaymentsVoCollectionFromGmsPayments(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.GmsPayments objects.
	 */
	public static ims.pci.vo.GmsPaymentsVoCollection createGmsPaymentsVoCollectionFromGmsPayments(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.GmsPaymentsVoCollection voList = new ims.pci.vo.GmsPaymentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.GmsPayments domainObject = (ims.pci.domain.objects.GmsPayments) domainObjectList.get(i);
			ims.pci.vo.GmsPaymentsVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.GmsPayments set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGmsPaymentsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.GmsPaymentsVoCollection voCollection) 
	 {
	 	return extractGmsPaymentsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGmsPaymentsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.GmsPaymentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.GmsPaymentsVo vo = voCollection.get(i);
			ims.pci.domain.objects.GmsPayments domainObject = GmsPaymentsVoAssembler.extractGmsPayments(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.GmsPayments list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGmsPaymentsList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.GmsPaymentsVoCollection voCollection) 
	 {
	 	return extractGmsPaymentsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGmsPaymentsList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.GmsPaymentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.GmsPaymentsVo vo = voCollection.get(i);
			ims.pci.domain.objects.GmsPayments domainObject = GmsPaymentsVoAssembler.extractGmsPayments(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.GmsPayments object.
	 * @param domainObject ims.pci.domain.objects.GmsPayments
	 */
	 public static ims.pci.vo.GmsPaymentsVo create(ims.pci.domain.objects.GmsPayments domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.GmsPayments object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.GmsPaymentsVo create(DomainObjectMap map, ims.pci.domain.objects.GmsPayments domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.GmsPaymentsVo valueObject = (ims.pci.vo.GmsPaymentsVo) map.getValueObject(domainObject, ims.pci.vo.GmsPaymentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.GmsPaymentsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.GmsPayments
	 */
	 public static ims.pci.vo.GmsPaymentsVo insert(ims.pci.vo.GmsPaymentsVo valueObject, ims.pci.domain.objects.GmsPayments domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.GmsPayments
	 */
	 public static ims.pci.vo.GmsPaymentsVo insert(DomainObjectMap map, ims.pci.vo.GmsPaymentsVo valueObject, ims.pci.domain.objects.GmsPayments domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GmsPayments(domainObject.getId());
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
			
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// GPContract
		if (domainObject.getGPContract() != null)
		{
			if(domainObject.getGPContract() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getGPContract();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setGPContract(new ims.pci.vo.GpContractRefVo(id, -1));				
			}
			else
			{
				valueObject.setGPContract(new ims.pci.vo.GpContractRefVo(domainObject.getGPContract().getId(), domainObject.getGPContract().getVersion()));
			}
		}
		// YearMonth
		valueObject.setYearMonth(domainObject.getYearMonth());
		// AmountPaid
		valueObject.setAmountPaid(domainObject.getAmountPaid());
		// GMSPaymentType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getGMSPaymentType();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.pci.vo.lookups.GMSPaymentType voLookup5 = new ims.pci.vo.lookups.GMSPaymentType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.pci.vo.lookups.GMSPaymentType parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.pci.vo.lookups.GMSPaymentType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setGMSPaymentType(voLookup5);
		}
				// ImportDate
		java.util.Date ImportDate = domainObject.getImportDate();
		if ( null != ImportDate ) 
		{
			valueObject.setImportDate(new ims.framework.utils.DateTime(ImportDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.GmsPayments extractGmsPayments(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.GmsPaymentsVo valueObject) 
	{
		return 	extractGmsPayments(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.GmsPayments extractGmsPayments(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.GmsPaymentsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GmsPayments();
		ims.pci.domain.objects.GmsPayments domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.GmsPayments)domMap.get(valueObject);
			}
			// ims.pci.vo.GmsPaymentsVo ID_GmsPayments field is unknown
			domainObject = new ims.pci.domain.objects.GmsPayments();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GmsPayments());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.GmsPayments)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.GmsPayments) domainFactory.getDomainObject(ims.pci.domain.objects.GmsPayments.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GmsPayments());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.pci.domain.objects.GpContract value2 = null;
		if ( null != valueObject.getGPContract() ) 
		{
			if (valueObject.getGPContract().getBoId() == null)
			{
				if (domMap.get(valueObject.getGPContract()) != null)
				{
					value2 = (ims.pci.domain.objects.GpContract)domMap.get(valueObject.getGPContract());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getGPContract();	
			}
			else
			{
				value2 = (ims.pci.domain.objects.GpContract)domainFactory.getDomainObject(ims.pci.domain.objects.GpContract.class, valueObject.getGPContract().getBoId());
			}
		}
		domainObject.setGPContract(value2);
		domainObject.setYearMonth(valueObject.getYearMonth());
		domainObject.setAmountPaid(valueObject.getAmountPaid());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getGMSPaymentType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getGMSPaymentType().getID());
		}
		domainObject.setGMSPaymentType(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getImportDate();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setImportDate(value6);

		return domainObject;
	}

}
