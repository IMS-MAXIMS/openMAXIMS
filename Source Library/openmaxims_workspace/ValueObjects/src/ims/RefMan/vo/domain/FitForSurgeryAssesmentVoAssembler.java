/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class FitForSurgeryAssesmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.FitForSurgeryAssesmentVo copy(ims.RefMan.vo.FitForSurgeryAssesmentVo valueObjectDest, ims.RefMan.vo.FitForSurgeryAssesmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FitForSurgeryAssesment(valueObjectSrc.getID_FitForSurgeryAssesment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ASAScore
		valueObjectDest.setASAScore(valueObjectSrc.getASAScore());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// FitForSurgery
		valueObjectDest.setFitForSurgery(valueObjectSrc.getFitForSurgery());
		// NotFitReason
		valueObjectDest.setNotFitReason(valueObjectSrc.getNotFitReason());
		// FitComments
		valueObjectDest.setFitComments(valueObjectSrc.getFitComments());
		// OPDAppt
		valueObjectDest.setOPDAppt(valueObjectSrc.getOPDAppt());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.FitForSurgeryAssesment objects.
	 */
	public static ims.RefMan.vo.FitForSurgeryAssesmentVoCollection createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(java.util.Set domainObjectSet)	
	{
		return createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.FitForSurgeryAssesment objects.
	 */
	public static ims.RefMan.vo.FitForSurgeryAssesmentVoCollection createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.FitForSurgeryAssesmentVoCollection voList = new ims.RefMan.vo.FitForSurgeryAssesmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject = (ims.RefMan.domain.objects.FitForSurgeryAssesment) iterator.next();
			ims.RefMan.vo.FitForSurgeryAssesmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.FitForSurgeryAssesment objects.
	 */
	public static ims.RefMan.vo.FitForSurgeryAssesmentVoCollection createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(java.util.List domainObjectList) 
	{
		return createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.FitForSurgeryAssesment objects.
	 */
	public static ims.RefMan.vo.FitForSurgeryAssesmentVoCollection createFitForSurgeryAssesmentVoCollectionFromFitForSurgeryAssesment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.FitForSurgeryAssesmentVoCollection voList = new ims.RefMan.vo.FitForSurgeryAssesmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject = (ims.RefMan.domain.objects.FitForSurgeryAssesment) domainObjectList.get(i);
			ims.RefMan.vo.FitForSurgeryAssesmentVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.FitForSurgeryAssesment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFitForSurgeryAssesmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FitForSurgeryAssesmentVoCollection voCollection) 
	 {
	 	return extractFitForSurgeryAssesmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFitForSurgeryAssesmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FitForSurgeryAssesmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FitForSurgeryAssesmentVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject = FitForSurgeryAssesmentVoAssembler.extractFitForSurgeryAssesment(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.FitForSurgeryAssesment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFitForSurgeryAssesmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FitForSurgeryAssesmentVoCollection voCollection) 
	 {
	 	return extractFitForSurgeryAssesmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFitForSurgeryAssesmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FitForSurgeryAssesmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FitForSurgeryAssesmentVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject = FitForSurgeryAssesmentVoAssembler.extractFitForSurgeryAssesment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.FitForSurgeryAssesment object.
	 * @param domainObject ims.RefMan.domain.objects.FitForSurgeryAssesment
	 */
	 public static ims.RefMan.vo.FitForSurgeryAssesmentVo create(ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.FitForSurgeryAssesment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.FitForSurgeryAssesmentVo create(DomainObjectMap map, ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.FitForSurgeryAssesmentVo valueObject = (ims.RefMan.vo.FitForSurgeryAssesmentVo) map.getValueObject(domainObject, ims.RefMan.vo.FitForSurgeryAssesmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.FitForSurgeryAssesmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.FitForSurgeryAssesment
	 */
	 public static ims.RefMan.vo.FitForSurgeryAssesmentVo insert(ims.RefMan.vo.FitForSurgeryAssesmentVo valueObject, ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.FitForSurgeryAssesment
	 */
	 public static ims.RefMan.vo.FitForSurgeryAssesmentVo insert(DomainObjectMap map, ims.RefMan.vo.FitForSurgeryAssesmentVo valueObject, ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FitForSurgeryAssesment(domainObject.getId());
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
			
		// ASAScore
		valueObject.setASAScore(domainObject.getASAScore());
		// Comments
		valueObject.setComments(domainObject.getComments());
		// FitForSurgery
		valueObject.setFitForSurgery( domainObject.isFitForSurgery() );
		// NotFitReason
		ims.domain.lookups.LookupInstance instance4 = domainObject.getNotFitReason();
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

			ims.clinical.vo.lookups.ReasonNotFitForSurgery voLookup4 = new ims.clinical.vo.lookups.ReasonNotFitForSurgery(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReasonNotFitForSurgery parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinical.vo.lookups.ReasonNotFitForSurgery(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setNotFitReason(voLookup4);
		}
				// FitComments
		valueObject.setFitComments(ims.RefMan.vo.domain.FitForSurgeryCommentVoAssembler.createFitForSurgeryCommentVoCollectionFromFitForSurgeryComment(map, domainObject.getFitComments()) );
		// OPDAppt
		valueObject.setOPDAppt(ims.scheduling.vo.domain.BookingAppointmentForFitForSurgeryAssessmentVoAssembler.create(map, domainObject.getOPDAppt()) );
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// AnaestheticType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getAnaestheticType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.AnaestheticType voLookup9 = new ims.clinical.vo.lookups.AnaestheticType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setAnaestheticType(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.FitForSurgeryAssesment extractFitForSurgeryAssesment(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FitForSurgeryAssesmentVo valueObject) 
	{
		return 	extractFitForSurgeryAssesment(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.FitForSurgeryAssesment extractFitForSurgeryAssesment(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FitForSurgeryAssesmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FitForSurgeryAssesment();
		ims.RefMan.domain.objects.FitForSurgeryAssesment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.FitForSurgeryAssesment)domMap.get(valueObject);
			}
			// ims.RefMan.vo.FitForSurgeryAssesmentVo ID_FitForSurgeryAssesment field is unknown
			domainObject = new ims.RefMan.domain.objects.FitForSurgeryAssesment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FitForSurgeryAssesment());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.FitForSurgeryAssesment)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.FitForSurgeryAssesment) domainFactory.getDomainObject(ims.RefMan.domain.objects.FitForSurgeryAssesment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FitForSurgeryAssesment());

		domainObject.setASAScore(valueObject.getASAScore());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setFitForSurgery(valueObject.getFitForSurgery());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getNotFitReason() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getNotFitReason().getID());
		}
		domainObject.setNotFitReason(value4);
		domainObject.setFitComments(ims.RefMan.vo.domain.FitForSurgeryCommentVoAssembler.extractFitForSurgeryCommentSet(domainFactory, valueObject.getFitComments(), domainObject.getFitComments(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value6 = null;
		if ( null != valueObject.getOPDAppt() ) 
		{
			if (valueObject.getOPDAppt().getBoId() == null)
			{
				if (domMap.get(valueObject.getOPDAppt()) != null)
				{
					value6 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getOPDAppt());
				}
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getOPDAppt().getBoId());
			}
		}
		domainObject.setOPDAppt(value6);
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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value9);

		return domainObject;
	}

}
