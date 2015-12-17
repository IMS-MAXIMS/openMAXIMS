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
 * @author Catalin Tomozei
 */
public class FollowUpNoteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.FollowUpNoteVo copy(ims.RefMan.vo.FollowUpNoteVo valueObjectDest, ims.RefMan.vo.FollowUpNoteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FollowUpNote(valueObjectSrc.getID_FollowUpNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FollowUpNote
		valueObjectDest.setFollowUpNote(valueObjectSrc.getFollowUpNote());
		// FollowUpType
		valueObjectDest.setFollowUpType(valueObjectSrc.getFollowUpType());
		// includeInCatsReport
		valueObjectDest.setIncludeInCatsReport(valueObjectSrc.getIncludeInCatsReport());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
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
 	 * If more than one call to an Assembler is made then #createFollowUpNoteVoCollectionFromFollowUpNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.FollowUpNote objects.
	 */
	public static ims.RefMan.vo.FollowUpNoteVoCollection createFollowUpNoteVoCollectionFromFollowUpNote(java.util.Set domainObjectSet)	
	{
		return createFollowUpNoteVoCollectionFromFollowUpNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.FollowUpNote objects.
	 */
	public static ims.RefMan.vo.FollowUpNoteVoCollection createFollowUpNoteVoCollectionFromFollowUpNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.FollowUpNoteVoCollection voList = new ims.RefMan.vo.FollowUpNoteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.FollowUpNote domainObject = (ims.RefMan.domain.objects.FollowUpNote) iterator.next();
			ims.RefMan.vo.FollowUpNoteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.FollowUpNote objects.
	 */
	public static ims.RefMan.vo.FollowUpNoteVoCollection createFollowUpNoteVoCollectionFromFollowUpNote(java.util.List domainObjectList) 
	{
		return createFollowUpNoteVoCollectionFromFollowUpNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.FollowUpNote objects.
	 */
	public static ims.RefMan.vo.FollowUpNoteVoCollection createFollowUpNoteVoCollectionFromFollowUpNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.FollowUpNoteVoCollection voList = new ims.RefMan.vo.FollowUpNoteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.FollowUpNote domainObject = (ims.RefMan.domain.objects.FollowUpNote) domainObjectList.get(i);
			ims.RefMan.vo.FollowUpNoteVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.FollowUpNote set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFollowUpNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FollowUpNoteVoCollection voCollection) 
	 {
	 	return extractFollowUpNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFollowUpNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FollowUpNoteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FollowUpNoteVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.FollowUpNote domainObject = FollowUpNoteVoAssembler.extractFollowUpNote(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.FollowUpNote list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFollowUpNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FollowUpNoteVoCollection voCollection) 
	 {
	 	return extractFollowUpNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFollowUpNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FollowUpNoteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.FollowUpNoteVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.FollowUpNote domainObject = FollowUpNoteVoAssembler.extractFollowUpNote(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.FollowUpNote object.
	 * @param domainObject ims.RefMan.domain.objects.FollowUpNote
	 */
	 public static ims.RefMan.vo.FollowUpNoteVo create(ims.RefMan.domain.objects.FollowUpNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.FollowUpNote object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.FollowUpNoteVo create(DomainObjectMap map, ims.RefMan.domain.objects.FollowUpNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.FollowUpNoteVo valueObject = (ims.RefMan.vo.FollowUpNoteVo) map.getValueObject(domainObject, ims.RefMan.vo.FollowUpNoteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.FollowUpNoteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.FollowUpNote
	 */
	 public static ims.RefMan.vo.FollowUpNoteVo insert(ims.RefMan.vo.FollowUpNoteVo valueObject, ims.RefMan.domain.objects.FollowUpNote domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.FollowUpNote
	 */
	 public static ims.RefMan.vo.FollowUpNoteVo insert(DomainObjectMap map, ims.RefMan.vo.FollowUpNoteVo valueObject, ims.RefMan.domain.objects.FollowUpNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FollowUpNote(domainObject.getId());
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
			
		// FollowUpNote
		valueObject.setFollowUpNote(domainObject.getFollowUpNote());
		// FollowUpType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getFollowUpType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.FollowUpType voLookup2 = new ims.core.vo.lookups.FollowUpType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.FollowUpType parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.FollowUpType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setFollowUpType(voLookup2);
		}
				// includeInCatsReport
		valueObject.setIncludeInCatsReport( domainObject.isIncludeInCatsReport() );
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
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
	public static ims.RefMan.domain.objects.FollowUpNote extractFollowUpNote(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FollowUpNoteVo valueObject) 
	{
		return 	extractFollowUpNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.FollowUpNote extractFollowUpNote(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.FollowUpNoteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FollowUpNote();
		ims.RefMan.domain.objects.FollowUpNote domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.FollowUpNote)domMap.get(valueObject);
			}
			// ims.RefMan.vo.FollowUpNoteVo ID_FollowUpNote field is unknown
			domainObject = new ims.RefMan.domain.objects.FollowUpNote();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FollowUpNote());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.FollowUpNote)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.FollowUpNote) domainFactory.getDomainObject(ims.RefMan.domain.objects.FollowUpNote.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FollowUpNote());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFollowUpNote() != null && valueObject.getFollowUpNote().equals(""))
		{
			valueObject.setFollowUpNote(null);
		}
		domainObject.setFollowUpNote(valueObject.getFollowUpNote());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getFollowUpType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getFollowUpType().getID());
		}
		domainObject.setFollowUpType(value2);
		domainObject.setIncludeInCatsReport(valueObject.getIncludeInCatsReport());
		ims.RefMan.domain.objects.CatsReferral value4 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value4 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getCatsReferral();	
			}
			else
			{
				value4 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value4);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInformation(), domMap));

		return domainObject;
	}

}
