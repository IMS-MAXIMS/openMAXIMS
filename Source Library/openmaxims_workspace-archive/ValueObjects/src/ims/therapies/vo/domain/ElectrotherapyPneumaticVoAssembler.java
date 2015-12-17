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
 * @author Peter Martin
 */
public class ElectrotherapyPneumaticVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticVo copy(ims.therapies.vo.ElectrotherapyPneumaticVo valueObjectDest, ims.therapies.vo.ElectrotherapyPneumaticVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectrotherapyPneumatic(valueObjectSrc.getID_ElectrotherapyPneumatic());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// WarningGiven
		valueObjectDest.setWarningGiven(valueObjectSrc.getWarningGiven());
		// PneumaticTreatment
		valueObjectDest.setPneumaticTreatment(valueObjectSrc.getPneumaticTreatment());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticVoCollection createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(java.util.Set domainObjectSet)	
	{
		return createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticVoCollection createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.ElectrotherapyPneumaticVoCollection voList = new ims.therapies.vo.ElectrotherapyPneumaticVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic) iterator.next();
			ims.therapies.vo.ElectrotherapyPneumaticVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticVoCollection createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(java.util.List domainObjectList) 
	{
		return createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticVoCollection createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.ElectrotherapyPneumaticVoCollection voList = new ims.therapies.vo.ElectrotherapyPneumaticVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic) domainObjectList.get(i);
			ims.therapies.vo.ElectrotherapyPneumaticVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectrotherapyPneumaticSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticVoCollection voCollection) 
	 {
	 	return extractElectrotherapyPneumaticSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectrotherapyPneumaticSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyPneumaticVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject = ElectrotherapyPneumaticVoAssembler.extractElectrotherapyPneumatic(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectrotherapyPneumaticList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticVoCollection voCollection) 
	 {
	 	return extractElectrotherapyPneumaticList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectrotherapyPneumaticList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyPneumaticVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject = ElectrotherapyPneumaticVoAssembler.extractElectrotherapyPneumatic(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic object.
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticVo create(ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.ElectrotherapyPneumaticVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.ElectrotherapyPneumaticVo valueObject = (ims.therapies.vo.ElectrotherapyPneumaticVo) map.getValueObject(domainObject, ims.therapies.vo.ElectrotherapyPneumaticVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.ElectrotherapyPneumaticVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticVo insert(ims.therapies.vo.ElectrotherapyPneumaticVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticVo insert(DomainObjectMap map, ims.therapies.vo.ElectrotherapyPneumaticVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectrotherapyPneumatic(domainObject.getId());
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
			
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// WarningGiven
		ims.domain.lookups.LookupInstance instance3 = domainObject.getWarningGiven();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setWarningGiven(voLookup3);
		}
				// PneumaticTreatment
		valueObject.setPneumaticTreatment(ims.therapies.vo.domain.ElectrotherapyPneumaticTreatmentVoAssembler.createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(map, domainObject.getPneumaticTreatment()) );
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic extractElectrotherapyPneumatic(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticVo valueObject) 
	{
		return 	extractElectrotherapyPneumatic(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic extractElectrotherapyPneumatic(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectrotherapyPneumatic();
		ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic)domMap.get(valueObject);
			}
			// ims.therapies.vo.ElectrotherapyPneumaticVo ID_ElectrotherapyPneumatic field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectrotherapyPneumatic());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectrotherapyPneumatic());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAuthoringDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value1);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getWarningGiven() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getWarningGiven().getID());
		}
		domainObject.setWarningGiven(value3);
		domainObject.setPneumaticTreatment(ims.therapies.vo.domain.ElectrotherapyPneumaticTreatmentVoAssembler.extractElectrotherapyPneumaticTreatmentSet(domainFactory, valueObject.getPneumaticTreatment(), domainObject.getPneumaticTreatment(), domMap));		
		ims.core.admin.domain.objects.ClinicalContact value5 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value5 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getClinicalContact();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value5);

		return domainObject;
	}

}
