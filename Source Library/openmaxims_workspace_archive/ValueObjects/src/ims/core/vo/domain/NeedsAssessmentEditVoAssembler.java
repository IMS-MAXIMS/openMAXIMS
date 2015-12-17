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
 * @author Marius Mihalec
 */
public class NeedsAssessmentEditVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.NeedsAssessmentEditVo copy(ims.core.vo.NeedsAssessmentEditVo valueObjectDest, ims.core.vo.NeedsAssessmentEditVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NeedsAssessment(valueObjectSrc.getID_NeedsAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MobilisationDate
		valueObjectDest.setMobilisationDate(valueObjectSrc.getMobilisationDate());
		// ComponentScore
		valueObjectDest.setComponentScore(valueObjectSrc.getComponentScore());
		// PatientUserDefinedObject
		valueObjectDest.setPatientUserDefinedObject(valueObjectSrc.getPatientUserDefinedObject());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// GoalPlanMeetingDate
		valueObjectDest.setGoalPlanMeetingDate(valueObjectSrc.getGoalPlanMeetingDate());
		// NeedAssessmentNumber
		valueObjectDest.setNeedAssessmentNumber(valueObjectSrc.getNeedAssessmentNumber());
		// HadBooklet
		valueObjectDest.setHadBooklet(valueObjectSrc.getHadBooklet());
		// AttachBookletToSummarySheet
		valueObjectDest.setAttachBookletToSummarySheet(valueObjectSrc.getAttachBookletToSummarySheet());
		// DateStarted
		valueObjectDest.setDateStarted(valueObjectSrc.getDateStarted());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNeedsAssessmentEditVoCollectionFromNeedsAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.NeedsAssessment objects.
	 */
	public static ims.core.vo.NeedsAssessmentEditVoCollection createNeedsAssessmentEditVoCollectionFromNeedsAssessment(java.util.Set domainObjectSet)	
	{
		return createNeedsAssessmentEditVoCollectionFromNeedsAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.NeedsAssessment objects.
	 */
	public static ims.core.vo.NeedsAssessmentEditVoCollection createNeedsAssessmentEditVoCollectionFromNeedsAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.NeedsAssessmentEditVoCollection voList = new ims.core.vo.NeedsAssessmentEditVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.NeedsAssessment domainObject = (ims.clinical.domain.objects.NeedsAssessment) iterator.next();
			ims.core.vo.NeedsAssessmentEditVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.NeedsAssessment objects.
	 */
	public static ims.core.vo.NeedsAssessmentEditVoCollection createNeedsAssessmentEditVoCollectionFromNeedsAssessment(java.util.List domainObjectList) 
	{
		return createNeedsAssessmentEditVoCollectionFromNeedsAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.NeedsAssessment objects.
	 */
	public static ims.core.vo.NeedsAssessmentEditVoCollection createNeedsAssessmentEditVoCollectionFromNeedsAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.NeedsAssessmentEditVoCollection voList = new ims.core.vo.NeedsAssessmentEditVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.NeedsAssessment domainObject = (ims.clinical.domain.objects.NeedsAssessment) domainObjectList.get(i);
			ims.core.vo.NeedsAssessmentEditVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.NeedsAssessment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNeedsAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NeedsAssessmentEditVoCollection voCollection) 
	 {
	 	return extractNeedsAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNeedsAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NeedsAssessmentEditVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.NeedsAssessmentEditVo vo = voCollection.get(i);
			ims.clinical.domain.objects.NeedsAssessment domainObject = NeedsAssessmentEditVoAssembler.extractNeedsAssessment(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.NeedsAssessment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNeedsAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NeedsAssessmentEditVoCollection voCollection) 
	 {
	 	return extractNeedsAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNeedsAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NeedsAssessmentEditVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.NeedsAssessmentEditVo vo = voCollection.get(i);
			ims.clinical.domain.objects.NeedsAssessment domainObject = NeedsAssessmentEditVoAssembler.extractNeedsAssessment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.NeedsAssessment object.
	 * @param domainObject ims.clinical.domain.objects.NeedsAssessment
	 */
	 public static ims.core.vo.NeedsAssessmentEditVo create(ims.clinical.domain.objects.NeedsAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.NeedsAssessment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.NeedsAssessmentEditVo create(DomainObjectMap map, ims.clinical.domain.objects.NeedsAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.NeedsAssessmentEditVo valueObject = (ims.core.vo.NeedsAssessmentEditVo) map.getValueObject(domainObject, ims.core.vo.NeedsAssessmentEditVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.NeedsAssessmentEditVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.NeedsAssessment
	 */
	 public static ims.core.vo.NeedsAssessmentEditVo insert(ims.core.vo.NeedsAssessmentEditVo valueObject, ims.clinical.domain.objects.NeedsAssessment domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.NeedsAssessment
	 */
	 public static ims.core.vo.NeedsAssessmentEditVo insert(DomainObjectMap map, ims.core.vo.NeedsAssessmentEditVo valueObject, ims.clinical.domain.objects.NeedsAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NeedsAssessment(domainObject.getId());
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
			
		// MobilisationDate
		java.util.Date MobilisationDate = domainObject.getMobilisationDate();
		if ( null != MobilisationDate ) 
		{
			valueObject.setMobilisationDate(new ims.framework.utils.Date(MobilisationDate) );
		}
		// ComponentScore
		valueObject.setComponentScore(ims.core.vo.domain.NeedsAssessmentComponentScoreVoAssembler.createNeedsAssessmentComponentScoreVoCollectionFromNeedsAssessmentComponentScore(map, domainObject.getComponentScore()) );
		// PatientUserDefinedObject
		valueObject.setPatientUserDefinedObject(ims.assessment.vo.domain.PatientUserDefinedObjectListVoAssembler.create(map, domainObject.getPatientUserDefinedObject()) );
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
		// GoalPlanMeetingDate
		java.util.Date GoalPlanMeetingDate = domainObject.getGoalPlanMeetingDate();
		if ( null != GoalPlanMeetingDate ) 
		{
			valueObject.setGoalPlanMeetingDate(new ims.framework.utils.Date(GoalPlanMeetingDate) );
		}
		// NeedAssessmentNumber
		ims.domain.lookups.LookupInstance instance6 = domainObject.getNeedAssessmentNumber();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.NeedsAssessmentNumber voLookup6 = new ims.clinical.vo.lookups.NeedsAssessmentNumber(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.NeedsAssessmentNumber parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.NeedsAssessmentNumber(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setNeedAssessmentNumber(voLookup6);
		}
				// HadBooklet
		ims.domain.lookups.LookupInstance instance7 = domainObject.getHadBooklet();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup7 = new ims.core.vo.lookups.YesNoUnknown(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNoUnknown(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setHadBooklet(voLookup7);
		}
				// AttachBookletToSummarySheet
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAttachBookletToSummarySheet();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAttachBookletToSummarySheet(voLookup8);
		}
				// DateStarted
		java.util.Date DateStarted = domainObject.getDateStarted();
		if ( null != DateStarted ) 
		{
			valueObject.setDateStarted(new ims.framework.utils.DateTime(DateStarted) );
		}
		// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.NeedsAssessment extractNeedsAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NeedsAssessmentEditVo valueObject) 
	{
		return 	extractNeedsAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.NeedsAssessment extractNeedsAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.NeedsAssessmentEditVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NeedsAssessment();
		ims.clinical.domain.objects.NeedsAssessment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.NeedsAssessment)domMap.get(valueObject);
			}
			// ims.core.vo.NeedsAssessmentEditVo ID_NeedsAssessment field is unknown
			domainObject = new ims.clinical.domain.objects.NeedsAssessment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NeedsAssessment());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.NeedsAssessment)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.NeedsAssessment) domainFactory.getDomainObject(ims.clinical.domain.objects.NeedsAssessment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NeedsAssessment());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getMobilisationDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setMobilisationDate(value1);
		domainObject.setComponentScore(ims.core.vo.domain.NeedsAssessmentComponentScoreVoAssembler.extractNeedsAssessmentComponentScoreSet(domainFactory, valueObject.getComponentScore(), domainObject.getComponentScore(), domMap));		
		domainObject.setPatientUserDefinedObject(ims.assessment.vo.domain.PatientUserDefinedObjectListVoAssembler.extractPatientUserDefinedObject(domainFactory, valueObject.getPatientUserDefinedObject(), domMap));
		ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getCareContext();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getGoalPlanMeetingDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setGoalPlanMeetingDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getNeedAssessmentNumber() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getNeedAssessmentNumber().getID());
		}
		domainObject.setNeedAssessmentNumber(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getHadBooklet() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getHadBooklet().getID());
		}
		domainObject.setHadBooklet(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAttachBookletToSummarySheet() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAttachBookletToSummarySheet().getID());
		}
		domainObject.setAttachBookletToSummarySheet(value8);
		ims.framework.utils.DateTime dateTime9 = valueObject.getDateStarted();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setDateStarted(value9);
		domainObject.setAuthoringHCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringHCP(), domMap));

		return domainObject;
	}

}
