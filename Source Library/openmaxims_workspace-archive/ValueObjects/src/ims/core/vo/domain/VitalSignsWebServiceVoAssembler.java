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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Brendan Woods
 */
public class VitalSignsWebServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VitalSignsWebServiceVo copy(ims.core.vo.VitalSignsWebServiceVo valueObjectDest, ims.core.vo.VitalSignsWebServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VitalSigns(valueObjectSrc.getID_VitalSigns());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// VitalsTakenDateTime
		valueObjectDest.setVitalsTakenDateTime(valueObjectSrc.getVitalsTakenDateTime());
		// BloodPressure
		valueObjectDest.setBloodPressure(valueObjectSrc.getBloodPressure());
		// Pulse
		valueObjectDest.setPulse(valueObjectSrc.getPulse());
		// Temperature
		valueObjectDest.setTemperature(valueObjectSrc.getTemperature());
		// RecordedSigns
		valueObjectDest.setRecordedSigns(valueObjectSrc.getRecordedSigns());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVitalSignsWebServiceVoCollectionFromVitalSigns(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsWebServiceVoCollection createVitalSignsWebServiceVoCollectionFromVitalSigns(java.util.Set domainObjectSet)	
	{
		return createVitalSignsWebServiceVoCollectionFromVitalSigns(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsWebServiceVoCollection createVitalSignsWebServiceVoCollectionFromVitalSigns(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VitalSignsWebServiceVoCollection voList = new ims.core.vo.VitalSignsWebServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.VitalSigns domainObject = (ims.core.vitals.domain.objects.VitalSigns) iterator.next();
			ims.core.vo.VitalSignsWebServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsWebServiceVoCollection createVitalSignsWebServiceVoCollectionFromVitalSigns(java.util.List domainObjectList) 
	{
		return createVitalSignsWebServiceVoCollectionFromVitalSigns(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsWebServiceVoCollection createVitalSignsWebServiceVoCollectionFromVitalSigns(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VitalSignsWebServiceVoCollection voList = new ims.core.vo.VitalSignsWebServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.VitalSigns domainObject = (ims.core.vitals.domain.objects.VitalSigns) domainObjectList.get(i);
			ims.core.vo.VitalSignsWebServiceVo vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.VitalSigns set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVitalSignsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsWebServiceVoCollection voCollection) 
	 {
	 	return extractVitalSignsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVitalSignsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsWebServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VitalSignsWebServiceVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VitalSigns domainObject = VitalSignsWebServiceVoAssembler.extractVitalSigns(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.VitalSigns list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVitalSignsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsWebServiceVoCollection voCollection) 
	 {
	 	return extractVitalSignsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVitalSignsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsWebServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VitalSignsWebServiceVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VitalSigns domainObject = VitalSignsWebServiceVoAssembler.extractVitalSigns(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.VitalSigns object.
	 * @param domainObject ims.core.vitals.domain.objects.VitalSigns
	 */
	 public static ims.core.vo.VitalSignsWebServiceVo create(ims.core.vitals.domain.objects.VitalSigns domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.VitalSigns object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VitalSignsWebServiceVo create(DomainObjectMap map, ims.core.vitals.domain.objects.VitalSigns domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VitalSignsWebServiceVo valueObject = (ims.core.vo.VitalSignsWebServiceVo) map.getValueObject(domainObject, ims.core.vo.VitalSignsWebServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VitalSignsWebServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.VitalSigns
	 */
	 public static ims.core.vo.VitalSignsWebServiceVo insert(ims.core.vo.VitalSignsWebServiceVo valueObject, ims.core.vitals.domain.objects.VitalSigns domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.VitalSigns
	 */
	 public static ims.core.vo.VitalSignsWebServiceVo insert(DomainObjectMap map, ims.core.vo.VitalSignsWebServiceVo valueObject, ims.core.vitals.domain.objects.VitalSigns domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VitalSigns(domainObject.getId());
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
			
		// VitalsTakenDateTime
		java.util.Date VitalsTakenDateTime = domainObject.getVitalsTakenDateTime();
		if ( null != VitalsTakenDateTime ) 
		{
			valueObject.setVitalsTakenDateTime(new ims.framework.utils.DateTime(VitalsTakenDateTime) );
		}
		// BloodPressure
		valueObject.setBloodPressure(ims.core.vo.domain.VSBloodPressureAssembler.create(map, domainObject.getBloodPressure()) );
		// Pulse
		valueObject.setPulse(ims.core.vo.domain.VSPulseAssembler.create(map, domainObject.getPulse()) );
		// Temperature
		valueObject.setTemperature(ims.core.vo.domain.VSTemperatureAssembler.create(map, domainObject.getTemperature()) );
		// RecordedSigns
		java.util.List listRecordedSigns = domainObject.getRecordedSigns();
		ims.core.vo.lookups.VSTypeCollection RecordedSigns = new ims.core.vo.lookups.VSTypeCollection();
		for(java.util.Iterator iterator = listRecordedSigns.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.VSType voInstance = new ims.core.vo.lookups.VSType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.VSType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.VSType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			RecordedSigns.add(voInstance);
		}
		valueObject.setRecordedSigns( RecordedSigns );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.vitals.domain.objects.VitalSigns extractVitalSigns(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsWebServiceVo valueObject) 
	{
		return 	extractVitalSigns(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.VitalSigns extractVitalSigns(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsWebServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VitalSigns();
		ims.core.vitals.domain.objects.VitalSigns domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.VitalSigns)domMap.get(valueObject);
			}
			// ims.core.vo.VitalSignsWebServiceVo ID_VitalSigns field is unknown
			domainObject = new ims.core.vitals.domain.objects.VitalSigns();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VitalSigns());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.VitalSigns)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.VitalSigns) domainFactory.getDomainObject(ims.core.vitals.domain.objects.VitalSigns.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VitalSigns());

		ims.framework.utils.DateTime dateTime1 = valueObject.getVitalsTakenDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setVitalsTakenDateTime(value1);
		domainObject.setBloodPressure(ims.core.vo.domain.VSBloodPressureAssembler.extractBloodpressure(domainFactory, valueObject.getBloodPressure(), domMap));
		domainObject.setPulse(ims.core.vo.domain.VSPulseAssembler.extractPulse(domainFactory, valueObject.getPulse(), domMap));
		domainObject.setTemperature(ims.core.vo.domain.VSTemperatureAssembler.extractTemperature(domainFactory, valueObject.getTemperature(), domMap));
		ims.core.vo.lookups.VSTypeCollection collection5 =
	valueObject.getRecordedSigns();
	    java.util.List domainRecordedSigns = domainObject.getRecordedSigns();;			
	    int collection5Size=0;
		if (collection5 == null)
		{
			domainRecordedSigns = new java.util.ArrayList(0);
		}
		else
		{
			collection5Size = collection5.size();
		}
		
		for(int i=0; i<collection5Size; i++) 
		{
			int instanceId = collection5.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainRecordedSigns.indexOf(dom);
			if (domIdx == -1)
			{
				domainRecordedSigns.add(i, dom);
			}
			else if (i != domIdx && i < domainRecordedSigns.size())
			{
				Object tmp = domainRecordedSigns.get(i);
				domainRecordedSigns.set(i, domainRecordedSigns.get(domIdx));
				domainRecordedSigns.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j5 = domainRecordedSigns.size();
		while (j5 > collection5Size)
		{
			domainRecordedSigns.remove(j5-1);
			j5 = domainRecordedSigns.size();
		}

		domainObject.setRecordedSigns(domainRecordedSigns);		
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.CareContext value7 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value7 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCareContext();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value7);

		return domainObject;
	}

}
