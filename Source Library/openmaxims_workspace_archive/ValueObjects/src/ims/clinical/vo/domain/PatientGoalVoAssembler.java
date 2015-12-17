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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class PatientGoalVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientGoalVo copy(ims.clinical.vo.PatientGoalVo valueObjectDest, ims.clinical.vo.PatientGoalVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientGoal(valueObjectSrc.getID_PatientGoal());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Target
		valueObjectDest.setTarget(valueObjectSrc.getTarget());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
		// GoalType
		valueObjectDest.setGoalType(valueObjectSrc.getGoalType());
		// AreaOfNeed
		valueObjectDest.setAreaOfNeed(valueObjectSrc.getAreaOfNeed());
		// GoalText
		valueObjectDest.setGoalText(valueObjectSrc.getGoalText());
		// CreatedDateTime
		valueObjectDest.setCreatedDateTime(valueObjectSrc.getCreatedDateTime());
		// DateAchieved
		valueObjectDest.setDateAchieved(valueObjectSrc.getDateAchieved());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientGoalVoCollectionFromPatientGoal(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientGoal objects.
	 */
	public static ims.clinical.vo.PatientGoalVoCollection createPatientGoalVoCollectionFromPatientGoal(java.util.Set domainObjectSet)	
	{
		return createPatientGoalVoCollectionFromPatientGoal(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientGoal objects.
	 */
	public static ims.clinical.vo.PatientGoalVoCollection createPatientGoalVoCollectionFromPatientGoal(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientGoalVoCollection voList = new ims.clinical.vo.PatientGoalVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientGoal domainObject = (ims.clinical.domain.objects.PatientGoal) iterator.next();
			ims.clinical.vo.PatientGoalVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientGoal objects.
	 */
	public static ims.clinical.vo.PatientGoalVoCollection createPatientGoalVoCollectionFromPatientGoal(java.util.List domainObjectList) 
	{
		return createPatientGoalVoCollectionFromPatientGoal(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientGoal objects.
	 */
	public static ims.clinical.vo.PatientGoalVoCollection createPatientGoalVoCollectionFromPatientGoal(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientGoalVoCollection voList = new ims.clinical.vo.PatientGoalVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientGoal domainObject = (ims.clinical.domain.objects.PatientGoal) domainObjectList.get(i);
			ims.clinical.vo.PatientGoalVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientGoal set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientGoalSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientGoalVoCollection voCollection) 
	 {
	 	return extractPatientGoalSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientGoalSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientGoalVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientGoalVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientGoal domainObject = PatientGoalVoAssembler.extractPatientGoal(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientGoal list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientGoalList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientGoalVoCollection voCollection) 
	 {
	 	return extractPatientGoalList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientGoalList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientGoalVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientGoalVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientGoal domainObject = PatientGoalVoAssembler.extractPatientGoal(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientGoal object.
	 * @param domainObject ims.clinical.domain.objects.PatientGoal
	 */
	 public static ims.clinical.vo.PatientGoalVo create(ims.clinical.domain.objects.PatientGoal domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientGoal object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientGoalVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientGoal domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientGoalVo valueObject = (ims.clinical.vo.PatientGoalVo) map.getValueObject(domainObject, ims.clinical.vo.PatientGoalVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientGoalVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientGoal
	 */
	 public static ims.clinical.vo.PatientGoalVo insert(ims.clinical.vo.PatientGoalVo valueObject, ims.clinical.domain.objects.PatientGoal domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientGoal
	 */
	 public static ims.clinical.vo.PatientGoalVo insert(DomainObjectMap map, ims.clinical.vo.PatientGoalVo valueObject, ims.clinical.domain.objects.PatientGoal domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientGoal(domainObject.getId());
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
			
		// Target
		valueObject.setTarget(ims.clinical.vo.domain.PatientGoalTargetVoAssembler.createPatientGoalTargetVoCollectionFromPatientGoalTarget(map, domainObject.getTarget()) );
		// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringHCP()) );
		// GoalType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getGoalType();
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

			ims.clinical.vo.lookups.GoalTerm voLookup3 = new ims.clinical.vo.lookups.GoalTerm(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.GoalTerm parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.GoalTerm(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setGoalType(voLookup3);
		}
				// AreaOfNeed
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAreaOfNeed();
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

			ims.clinical.vo.lookups.GoalAreaOfNeed voLookup4 = new ims.clinical.vo.lookups.GoalAreaOfNeed(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinical.vo.lookups.GoalAreaOfNeed parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinical.vo.lookups.GoalAreaOfNeed(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAreaOfNeed(voLookup4);
		}
				// GoalText
		valueObject.setGoalText(domainObject.getGoalText());
		// CreatedDateTime
		java.util.Date CreatedDateTime = domainObject.getCreatedDateTime();
		if ( null != CreatedDateTime ) 
		{
			valueObject.setCreatedDateTime(new ims.framework.utils.DateTime(CreatedDateTime) );
		}
		// DateAchieved
		java.util.Date DateAchieved = domainObject.getDateAchieved();
		if ( null != DateAchieved ) 
		{
			valueObject.setDateAchieved(new ims.framework.utils.Date(DateAchieved) );
		}
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
	public static ims.clinical.domain.objects.PatientGoal extractPatientGoal(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientGoalVo valueObject) 
	{
		return 	extractPatientGoal(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientGoal extractPatientGoal(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientGoalVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientGoal();
		ims.clinical.domain.objects.PatientGoal domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientGoal)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientGoalVo ID_PatientGoal field is unknown
			domainObject = new ims.clinical.domain.objects.PatientGoal();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientGoal());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientGoal)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientGoal) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientGoal.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientGoal());

		domainObject.setTarget(ims.clinical.vo.domain.PatientGoalTargetVoAssembler.extractPatientGoalTargetSet(domainFactory, valueObject.getTarget(), domainObject.getTarget(), domMap));		
		domainObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringHCP(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getGoalType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getGoalType().getID());
		}
		domainObject.setGoalType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAreaOfNeed() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAreaOfNeed().getID());
		}
		domainObject.setAreaOfNeed(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGoalText() != null && valueObject.getGoalText().equals(""))
		{
			valueObject.setGoalText(null);
		}
		domainObject.setGoalText(valueObject.getGoalText());
		ims.framework.utils.DateTime dateTime6 = valueObject.getCreatedDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setCreatedDateTime(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateAchieved();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateAchieved(value7);
		ims.core.admin.domain.objects.CareContext value8 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value8 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getCareContext();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value8);

		return domainObject;
	}

}
