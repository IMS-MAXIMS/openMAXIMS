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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class ElectrotherapyTENSVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.ElectrotherapyTENSVo copy(ims.therapies.vo.ElectrotherapyTENSVo valueObjectDest, ims.therapies.vo.ElectrotherapyTENSVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectrotherapyTENS(valueObjectSrc.getID_ElectrotherapyTENS());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// WarningGiven
		valueObjectDest.setWarningGiven(valueObjectSrc.getWarningGiven());
		// TensTreatments
		valueObjectDest.setTensTreatments(valueObjectSrc.getTensTreatments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyTENS objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTENSVoCollection createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(java.util.Set domainObjectSet)	
	{
		return createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyTENS objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTENSVoCollection createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.ElectrotherapyTENSVoCollection voList = new ims.therapies.vo.ElectrotherapyTENSVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyTENS) iterator.next();
			ims.therapies.vo.ElectrotherapyTENSVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyTENS objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTENSVoCollection createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(java.util.List domainObjectList) 
	{
		return createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyTENS objects.
	 */
	public static ims.therapies.vo.ElectrotherapyTENSVoCollection createElectrotherapyTENSVoCollectionFromElectrotherapyTENS(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.ElectrotherapyTENSVoCollection voList = new ims.therapies.vo.ElectrotherapyTENSVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyTENS) domainObjectList.get(i);
			ims.therapies.vo.ElectrotherapyTENSVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyTENS set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectrotherapyTENSSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTENSVoCollection voCollection) 
	 {
	 	return extractElectrotherapyTENSSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectrotherapyTENSSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTENSVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyTENSVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject = ElectrotherapyTENSVoAssembler.extractElectrotherapyTENS(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyTENS list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectrotherapyTENSList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTENSVoCollection voCollection) 
	 {
	 	return extractElectrotherapyTENSList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectrotherapyTENSList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTENSVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyTENSVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject = ElectrotherapyTENSVoAssembler.extractElectrotherapyTENS(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyTENS object.
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyTENS
	 */
	 public static ims.therapies.vo.ElectrotherapyTENSVo create(ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyTENS object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.ElectrotherapyTENSVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.ElectrotherapyTENSVo valueObject = (ims.therapies.vo.ElectrotherapyTENSVo) map.getValueObject(domainObject, ims.therapies.vo.ElectrotherapyTENSVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.ElectrotherapyTENSVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyTENS
	 */
	 public static ims.therapies.vo.ElectrotherapyTENSVo insert(ims.therapies.vo.ElectrotherapyTENSVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyTENS
	 */
	 public static ims.therapies.vo.ElectrotherapyTENSVo insert(DomainObjectMap map, ims.therapies.vo.ElectrotherapyTENSVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectrotherapyTENS(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// WarningGiven
		ims.domain.lookups.LookupInstance instance4 = domainObject.getWarningGiven();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup4 = new ims.core.vo.lookups.YesNoUnknown(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNoUnknown(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setWarningGiven(voLookup4);
		}
				// TensTreatments
		valueObject.setTensTreatments(ims.therapies.vo.domain.ElectrotherapyTensTreatmentVoAssembler.createElectrotherapyTensTreatmentVoCollectionFromElectrotherapyTensTreatment(map, domainObject.getTensTreatments()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.ElectrotherapyTENS extractElectrotherapyTENS(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTENSVo valueObject) 
	{
		return 	extractElectrotherapyTENS(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.ElectrotherapyTENS extractElectrotherapyTENS(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyTENSVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectrotherapyTENS();
		ims.therapies.treatment.domain.objects.ElectrotherapyTENS domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyTENS)domMap.get(valueObject);
			}
			// ims.therapies.vo.ElectrotherapyTENSVo ID_ElectrotherapyTENS field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.ElectrotherapyTENS();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectrotherapyTENS());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyTENS)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyTENS) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.ElectrotherapyTENS.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectrotherapyTENS());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getWarningGiven() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getWarningGiven().getID());
		}
		domainObject.setWarningGiven(value4);
		domainObject.setTensTreatments(ims.therapies.vo.domain.ElectrotherapyTensTreatmentVoAssembler.extractElectrotherapyTensTreatmentSet(domainFactory, valueObject.getTensTreatments(), domainObject.getTensTreatments(), domMap));		

		return domainObject;
	}

}
