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
 * @author Rory Fitzpatrick
 */
public class FurtherManagementDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.FurtherManagementDetailsVo copy(ims.RefMan.vo.FurtherManagementDetailsVo valueObjectDest, ims.RefMan.vo.FurtherManagementDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FurtherManagement(valueObjectSrc.getID_FurtherManagement());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FollowupType
		valueObjectDest.setFollowupType(valueObjectSrc.getFollowupType());
		// FurtherManagementByCATS
		valueObjectDest.setFurtherManagementByCATS(valueObjectSrc.getFurtherManagementByCATS());
		// NoOfTltSessions
		valueObjectDest.setNoOfTltSessions(valueObjectSrc.getNoOfTltSessions());
		// TLTNotes
		valueObjectDest.setTLTNotes(valueObjectSrc.getTLTNotes());
		// AnotherConsultationAppt
		valueObjectDest.setAnotherConsultationAppt(valueObjectSrc.getAnotherConsultationAppt());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureNoOfDays
		valueObjectDest.setProcedureNoOfDays(valueObjectSrc.getProcedureNoOfDays());
		// MedicallyIncomplete
		valueObjectDest.setMedicallyIncomplete(valueObjectSrc.getMedicallyIncomplete());
		// IncompleteNoOfDays
		valueObjectDest.setIncompleteNoOfDays(valueObjectSrc.getIncompleteNoOfDays());
		// TLTType
		valueObjectDest.setTLTType(valueObjectSrc.getTLTType());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFurtherManagementDetailsVoCollectionFromFurtherManagement(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.FurtherManagement objects.
	 */
	public static ims.RefMan.vo.FurtherManagementDetailsVoCollection createFurtherManagementDetailsVoCollectionFromFurtherManagement(java.util.Set domainObjectSet)	
	{
		return createFurtherManagementDetailsVoCollectionFromFurtherManagement(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.FurtherManagement objects.
	 */
	public static ims.RefMan.vo.FurtherManagementDetailsVoCollection createFurtherManagementDetailsVoCollectionFromFurtherManagement(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.FurtherManagementDetailsVoCollection voList = new ims.RefMan.vo.FurtherManagementDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.FurtherManagement domainObject = (ims.RefMan.domain.objects.FurtherManagement) iterator.next();
			ims.RefMan.vo.FurtherManagementDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.FurtherManagement objects.
	 */
	public static ims.RefMan.vo.FurtherManagementDetailsVoCollection createFurtherManagementDetailsVoCollectionFromFurtherManagement(java.util.List domainObjectList) 
	{
		return createFurtherManagementDetailsVoCollectionFromFurtherManagement(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.FurtherManagement objects.
	 */
	public static ims.RefMan.vo.FurtherManagementDetailsVoCollection createFurtherManagementDetailsVoCollectionFromFurtherManagement(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.FurtherManagementDetailsVoCollection voList = new ims.RefMan.vo.FurtherManagementDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.FurtherManagement domainObject = (ims.RefMan.domain.objects.FurtherManagement) domainObjectList.get(i);
			ims.RefMan.vo.FurtherManagementDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.FurtherManagement set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFurtherManagementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FurtherManagementDetailsVoCollection voCollection) 
	 {
	 	return extractFurtherManagementSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFurtherManagementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FurtherManagementDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FurtherManagementDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.FurtherManagement domainObject = FurtherManagementDetailsVoAssembler.extractFurtherManagement(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.FurtherManagement list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFurtherManagementList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FurtherManagementDetailsVoCollection voCollection) 
	 {
	 	return extractFurtherManagementList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFurtherManagementList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FurtherManagementDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FurtherManagementDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.FurtherManagement domainObject = FurtherManagementDetailsVoAssembler.extractFurtherManagement(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.FurtherManagement object.
	 * @param domainObject ims.RefMan.domain.objects.FurtherManagement
	 */
	 public static ims.RefMan.vo.FurtherManagementDetailsVo create(ims.RefMan.domain.objects.FurtherManagement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.FurtherManagement object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.FurtherManagementDetailsVo create(DomainObjectMap map, ims.RefMan.domain.objects.FurtherManagement domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.FurtherManagementDetailsVo valueObject = (ims.RefMan.vo.FurtherManagementDetailsVo) map.getValueObject(domainObject, ims.RefMan.vo.FurtherManagementDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.FurtherManagementDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.FurtherManagement
	 */
	 public static ims.RefMan.vo.FurtherManagementDetailsVo insert(ims.RefMan.vo.FurtherManagementDetailsVo valueObject, ims.RefMan.domain.objects.FurtherManagement domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.FurtherManagement
	 */
	 public static ims.RefMan.vo.FurtherManagementDetailsVo insert(DomainObjectMap map, ims.RefMan.vo.FurtherManagementDetailsVo valueObject, ims.RefMan.domain.objects.FurtherManagement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FurtherManagement(domainObject.getId());
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
			
		// FollowupType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getFollowupType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.FollowupManagementType voLookup1 = new ims.RefMan.vo.lookups.FollowupManagementType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.RefMan.vo.lookups.FollowupManagementType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.RefMan.vo.lookups.FollowupManagementType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setFollowupType(voLookup1);
		}
				// FurtherManagementByCATS
		valueObject.setFurtherManagementByCATS(domainObject.getFurtherManagementByCATS());
		// NoOfTltSessions
		valueObject.setNoOfTltSessions(domainObject.getNoOfTltSessions());
		// TLTNotes
		valueObject.setTLTNotes(domainObject.getTLTNotes());
		// AnotherConsultationAppt
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAnotherConsultationAppt();
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

			ims.RefMan.vo.lookups.AnotherConsultationAppt voLookup5 = new ims.RefMan.vo.lookups.AnotherConsultationAppt(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.AnotherConsultationAppt parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.AnotherConsultationAppt(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAnotherConsultationAppt(voLookup5);
		}
				// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureNoOfDays
		valueObject.setProcedureNoOfDays(domainObject.getProcedureNoOfDays());
		// MedicallyIncomplete
		ims.domain.lookups.LookupInstance instance8 = domainObject.getMedicallyIncomplete();
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

			ims.RefMan.vo.lookups.MedicallyIncomplete voLookup8 = new ims.RefMan.vo.lookups.MedicallyIncomplete(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.RefMan.vo.lookups.MedicallyIncomplete parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.RefMan.vo.lookups.MedicallyIncomplete(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setMedicallyIncomplete(voLookup8);
		}
				// IncompleteNoOfDays
		valueObject.setIncompleteNoOfDays(domainObject.getIncompleteNoOfDays());
		// TLTType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getTLTType();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.TLTType voLookup10 = new ims.RefMan.vo.lookups.TLTType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.RefMan.vo.lookups.TLTType parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.RefMan.vo.lookups.TLTType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setTLTType(voLookup10);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.FurtherManagement extractFurtherManagement(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FurtherManagementDetailsVo valueObject) 
	{
		return 	extractFurtherManagement(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.FurtherManagement extractFurtherManagement(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FurtherManagementDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FurtherManagement();
		ims.RefMan.domain.objects.FurtherManagement domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.FurtherManagement)domMap.get(valueObject);
			}
			// ims.RefMan.vo.FurtherManagementDetailsVo ID_FurtherManagement field is unknown
			domainObject = new ims.RefMan.domain.objects.FurtherManagement();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FurtherManagement());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.FurtherManagement)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.FurtherManagement) domainFactory.getDomainObject(ims.RefMan.domain.objects.FurtherManagement.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FurtherManagement());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getFollowupType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getFollowupType().getID());
		}
		domainObject.setFollowupType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFurtherManagementByCATS() != null && valueObject.getFurtherManagementByCATS().equals(""))
		{
			valueObject.setFurtherManagementByCATS(null);
		}
		domainObject.setFurtherManagementByCATS(valueObject.getFurtherManagementByCATS());
		domainObject.setNoOfTltSessions(valueObject.getNoOfTltSessions());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTLTNotes() != null && valueObject.getTLTNotes().equals(""))
		{
			valueObject.setTLTNotes(null);
		}
		domainObject.setTLTNotes(valueObject.getTLTNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAnotherConsultationAppt() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAnotherConsultationAppt().getID());
		}
		domainObject.setAnotherConsultationAppt(value5);
		domainObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.extractProcedure(domainFactory, valueObject.getProcedure(), domMap));
		domainObject.setProcedureNoOfDays(valueObject.getProcedureNoOfDays());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getMedicallyIncomplete() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getMedicallyIncomplete().getID());
		}
		domainObject.setMedicallyIncomplete(value8);
		domainObject.setIncompleteNoOfDays(valueObject.getIncompleteNoOfDays());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getTLTType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getTLTType().getID());
		}
		domainObject.setTLTType(value10);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInformation(), domMap));

		return domainObject;
	}

}
