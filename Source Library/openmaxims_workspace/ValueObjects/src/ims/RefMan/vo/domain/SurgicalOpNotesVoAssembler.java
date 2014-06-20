/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class SurgicalOpNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.SurgicalOpNotesVo copy(ims.RefMan.vo.SurgicalOpNotesVo valueObjectDest, ims.RefMan.vo.SurgicalOpNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalOpNotes(valueObjectSrc.getID_SurgicalOpNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// IntraOperativeCareRecord
		valueObjectDest.setIntraOperativeCareRecord(valueObjectSrc.getIntraOperativeCareRecord());
		// Incision
		valueObjectDest.setIncision(valueObjectSrc.getIncision());
		// Findings
		valueObjectDest.setFindings(valueObjectSrc.getFindings());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// Closure
		valueObjectDest.setClosure(valueObjectSrc.getClosure());
		// PostOpInstructions
		valueObjectDest.setPostOpInstructions(valueObjectSrc.getPostOpInstructions());
		// Complications
		valueObjectDest.setComplications(valueObjectSrc.getComplications());
		// LAInfiltration
		valueObjectDest.setLAInfiltration(valueObjectSrc.getLAInfiltration());
		// PreOperativeDiagnosis
		valueObjectDest.setPreOperativeDiagnosis(valueObjectSrc.getPreOperativeDiagnosis());
		// Antibiotics
		valueObjectDest.setAntibiotics(valueObjectSrc.getAntibiotics());
		// VTE
		valueObjectDest.setVTE(valueObjectSrc.getVTE());
		// EBI
		valueObjectDest.setEBI(valueObjectSrc.getEBI());
		// FollowUpType
		valueObjectDest.setFollowUpType(valueObjectSrc.getFollowUpType());
		// FollowUpTypeIn
		valueObjectDest.setFollowUpTypeIn(valueObjectSrc.getFollowUpTypeIn());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.SurgicalOpNotes objects.
	 */
	public static ims.RefMan.vo.SurgicalOpNotesVoCollection createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(java.util.Set domainObjectSet)	
	{
		return createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.SurgicalOpNotes objects.
	 */
	public static ims.RefMan.vo.SurgicalOpNotesVoCollection createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.SurgicalOpNotesVoCollection voList = new ims.RefMan.vo.SurgicalOpNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.SurgicalOpNotes domainObject = (ims.RefMan.domain.objects.SurgicalOpNotes) iterator.next();
			ims.RefMan.vo.SurgicalOpNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.SurgicalOpNotes objects.
	 */
	public static ims.RefMan.vo.SurgicalOpNotesVoCollection createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(java.util.List domainObjectList) 
	{
		return createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.SurgicalOpNotes objects.
	 */
	public static ims.RefMan.vo.SurgicalOpNotesVoCollection createSurgicalOpNotesVoCollectionFromSurgicalOpNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.SurgicalOpNotesVoCollection voList = new ims.RefMan.vo.SurgicalOpNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.SurgicalOpNotes domainObject = (ims.RefMan.domain.objects.SurgicalOpNotes) domainObjectList.get(i);
			ims.RefMan.vo.SurgicalOpNotesVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.SurgicalOpNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalOpNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SurgicalOpNotesVoCollection voCollection) 
	 {
	 	return extractSurgicalOpNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalOpNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SurgicalOpNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.SurgicalOpNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.SurgicalOpNotes domainObject = SurgicalOpNotesVoAssembler.extractSurgicalOpNotes(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.SurgicalOpNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalOpNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SurgicalOpNotesVoCollection voCollection) 
	 {
	 	return extractSurgicalOpNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalOpNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SurgicalOpNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.SurgicalOpNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.SurgicalOpNotes domainObject = SurgicalOpNotesVoAssembler.extractSurgicalOpNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.SurgicalOpNotes object.
	 * @param domainObject ims.RefMan.domain.objects.SurgicalOpNotes
	 */
	 public static ims.RefMan.vo.SurgicalOpNotesVo create(ims.RefMan.domain.objects.SurgicalOpNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.SurgicalOpNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.SurgicalOpNotesVo create(DomainObjectMap map, ims.RefMan.domain.objects.SurgicalOpNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.SurgicalOpNotesVo valueObject = (ims.RefMan.vo.SurgicalOpNotesVo) map.getValueObject(domainObject, ims.RefMan.vo.SurgicalOpNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.SurgicalOpNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.SurgicalOpNotes
	 */
	 public static ims.RefMan.vo.SurgicalOpNotesVo insert(ims.RefMan.vo.SurgicalOpNotesVo valueObject, ims.RefMan.domain.objects.SurgicalOpNotes domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.SurgicalOpNotes
	 */
	 public static ims.RefMan.vo.SurgicalOpNotesVo insert(DomainObjectMap map, ims.RefMan.vo.SurgicalOpNotesVo valueObject, ims.RefMan.domain.objects.SurgicalOpNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalOpNotes(domainObject.getId());
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
		// IntraOperativeCareRecord
		if (domainObject.getIntraOperativeCareRecord() != null)
		{
			if(domainObject.getIntraOperativeCareRecord() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getIntraOperativeCareRecord();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setIntraOperativeCareRecord(new ims.core.clinical.vo.IntraOperativeCareRecordRefVo(id, -1));				
			}
			else
			{
				valueObject.setIntraOperativeCareRecord(new ims.core.clinical.vo.IntraOperativeCareRecordRefVo(domainObject.getIntraOperativeCareRecord().getId(), domainObject.getIntraOperativeCareRecord().getVersion()));
			}
		}
		// Incision
		valueObject.setIncision(domainObject.getIncision());
		// Findings
		valueObject.setFindings(domainObject.getFindings());
		// Procedure
		valueObject.setProcedure(domainObject.getProcedure());
		// Closure
		valueObject.setClosure(domainObject.getClosure());
		// PostOpInstructions
		valueObject.setPostOpInstructions(domainObject.getPostOpInstructions());
		// Complications
		valueObject.setComplications(domainObject.getComplications());
		// LAInfiltration
		valueObject.setLAInfiltration(domainObject.getLAInfiltration());
		// PreOperativeDiagnosis
		valueObject.setPreOperativeDiagnosis(domainObject.getPreOperativeDiagnosis());
		// Antibiotics
		valueObject.setAntibiotics(domainObject.getAntibiotics());
		// VTE
		valueObject.setVTE(domainObject.getVTE());
		// EBI
		valueObject.setEBI(domainObject.getEBI());
		// FollowUpType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getFollowUpType();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.SurgicalOpFollowUpType voLookup15 = new ims.RefMan.vo.lookups.SurgicalOpFollowUpType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.RefMan.vo.lookups.SurgicalOpFollowUpType parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.RefMan.vo.lookups.SurgicalOpFollowUpType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setFollowUpType(voLookup15);
		}
				// FollowUpTypeIn
		ims.domain.lookups.LookupInstance instance16 = domainObject.getFollowUpTypeIn();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.SurgicalOpFollowUpIn voLookup16 = new ims.RefMan.vo.lookups.SurgicalOpFollowUpIn(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.RefMan.vo.lookups.SurgicalOpFollowUpIn parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.RefMan.vo.lookups.SurgicalOpFollowUpIn(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setFollowUpTypeIn(voLookup16);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.SurgicalOpNotes extractSurgicalOpNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SurgicalOpNotesVo valueObject) 
	{
		return 	extractSurgicalOpNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.SurgicalOpNotes extractSurgicalOpNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SurgicalOpNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalOpNotes();
		ims.RefMan.domain.objects.SurgicalOpNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.SurgicalOpNotes)domMap.get(valueObject);
			}
			// ims.RefMan.vo.SurgicalOpNotesVo ID_SurgicalOpNotes field is unknown
			domainObject = new ims.RefMan.domain.objects.SurgicalOpNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalOpNotes());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.SurgicalOpNotes)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.SurgicalOpNotes) domainFactory.getDomainObject(ims.RefMan.domain.objects.SurgicalOpNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalOpNotes());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.clinical.domain.objects.IntraOperativeCareRecord value3 = null;
		if ( null != valueObject.getIntraOperativeCareRecord() ) 
		{
			if (valueObject.getIntraOperativeCareRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getIntraOperativeCareRecord()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject.getIntraOperativeCareRecord());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getIntraOperativeCareRecord();	
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, valueObject.getIntraOperativeCareRecord().getBoId());
			}
		}
		domainObject.setIntraOperativeCareRecord(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIncision() != null && valueObject.getIncision().equals(""))
		{
			valueObject.setIncision(null);
		}
		domainObject.setIncision(valueObject.getIncision());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFindings() != null && valueObject.getFindings().equals(""))
		{
			valueObject.setFindings(null);
		}
		domainObject.setFindings(valueObject.getFindings());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedure() != null && valueObject.getProcedure().equals(""))
		{
			valueObject.setProcedure(null);
		}
		domainObject.setProcedure(valueObject.getProcedure());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClosure() != null && valueObject.getClosure().equals(""))
		{
			valueObject.setClosure(null);
		}
		domainObject.setClosure(valueObject.getClosure());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPostOpInstructions() != null && valueObject.getPostOpInstructions().equals(""))
		{
			valueObject.setPostOpInstructions(null);
		}
		domainObject.setPostOpInstructions(valueObject.getPostOpInstructions());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComplications() != null && valueObject.getComplications().equals(""))
		{
			valueObject.setComplications(null);
		}
		domainObject.setComplications(valueObject.getComplications());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLAInfiltration() != null && valueObject.getLAInfiltration().equals(""))
		{
			valueObject.setLAInfiltration(null);
		}
		domainObject.setLAInfiltration(valueObject.getLAInfiltration());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPreOperativeDiagnosis() != null && valueObject.getPreOperativeDiagnosis().equals(""))
		{
			valueObject.setPreOperativeDiagnosis(null);
		}
		domainObject.setPreOperativeDiagnosis(valueObject.getPreOperativeDiagnosis());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAntibiotics() != null && valueObject.getAntibiotics().equals(""))
		{
			valueObject.setAntibiotics(null);
		}
		domainObject.setAntibiotics(valueObject.getAntibiotics());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVTE() != null && valueObject.getVTE().equals(""))
		{
			valueObject.setVTE(null);
		}
		domainObject.setVTE(valueObject.getVTE());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEBI() != null && valueObject.getEBI().equals(""))
		{
			valueObject.setEBI(null);
		}
		domainObject.setEBI(valueObject.getEBI());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getFollowUpType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getFollowUpType().getID());
		}
		domainObject.setFollowUpType(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getFollowUpTypeIn() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getFollowUpTypeIn().getID());
		}
		domainObject.setFollowUpTypeIn(value16);

		return domainObject;
	}

}
