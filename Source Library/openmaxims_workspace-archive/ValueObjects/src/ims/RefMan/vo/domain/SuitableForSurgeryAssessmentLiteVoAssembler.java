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
 * @author George Cristian Josan
 */
public class SuitableForSurgeryAssessmentLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo copy(ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObjectDest, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SuitableForSurgeryAssessment(valueObjectSrc.getID_SuitableForSurgeryAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// HistoryPresComplaint
		valueObjectDest.setHistoryPresComplaint(valueObjectSrc.getHistoryPresComplaint());
		// Examination
		valueObjectDest.setExamination(valueObjectSrc.getExamination());
		// Conclusions
		valueObjectDest.setConclusions(valueObjectSrc.getConclusions());
		// NotSuitableForSurgeyComments
		valueObjectDest.setNotSuitableForSurgeyComments(valueObjectSrc.getNotSuitableForSurgeyComments());
		// SuitableForSurgery
		valueObjectDest.setSuitableForSurgery(valueObjectSrc.getSuitableForSurgery());
		// ReasonNotSuitable
		valueObjectDest.setReasonNotSuitable(valueObjectSrc.getReasonNotSuitable());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// ProcedurePerformed
		valueObjectDest.setProcedurePerformed(valueObjectSrc.getProcedurePerformed());
		// SuitableForSurgeryDate
		valueObjectDest.setSuitableForSurgeryDate(valueObjectSrc.getSuitableForSurgeryDate());
		// RequiredDurationInMins
		valueObjectDest.setRequiredDurationInMins(valueObjectSrc.getRequiredDurationInMins());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// NamedSurgeon
		valueObjectDest.setNamedSurgeon(valueObjectSrc.getNamedSurgeon());
		// SpecialEquipmentRequired
		valueObjectDest.setSpecialEquipmentRequired(valueObjectSrc.getSpecialEquipmentRequired());
		// SpecialEquipmentComments
		valueObjectDest.setSpecialEquipmentComments(valueObjectSrc.getSpecialEquipmentComments());
		// SpecialInstructionsRequired
		valueObjectDest.setSpecialInstructionsRequired(valueObjectSrc.getSpecialInstructionsRequired());
		// SpecialInstructionsComments
		valueObjectDest.setSpecialInstructionsComments(valueObjectSrc.getSpecialInstructionsComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.SuitableForSurgeryAssessment objects.
	 */
	public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(java.util.Set domainObjectSet)	
	{
		return createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.SuitableForSurgeryAssessment objects.
	 */
	public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection voList = new ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject = (ims.RefMan.domain.objects.SuitableForSurgeryAssessment) iterator.next();
			ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.SuitableForSurgeryAssessment objects.
	 */
	public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(java.util.List domainObjectList) 
	{
		return createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.SuitableForSurgeryAssessment objects.
	 */
	public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection createSuitableForSurgeryAssessmentLiteVoCollectionFromSuitableForSurgeryAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection voList = new ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject = (ims.RefMan.domain.objects.SuitableForSurgeryAssessment) domainObjectList.get(i);
			ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.SuitableForSurgeryAssessment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSuitableForSurgeryAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection voCollection) 
	 {
	 	return extractSuitableForSurgeryAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSuitableForSurgeryAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject = SuitableForSurgeryAssessmentLiteVoAssembler.extractSuitableForSurgeryAssessment(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.SuitableForSurgeryAssessment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSuitableForSurgeryAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection voCollection) 
	 {
	 	return extractSuitableForSurgeryAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSuitableForSurgeryAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject = SuitableForSurgeryAssessmentLiteVoAssembler.extractSuitableForSurgeryAssessment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.SuitableForSurgeryAssessment object.
	 * @param domainObject ims.RefMan.domain.objects.SuitableForSurgeryAssessment
	 */
	 public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo create(ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.SuitableForSurgeryAssessment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo create(DomainObjectMap map, ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObject = (ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo) map.getValueObject(domainObject, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.SuitableForSurgeryAssessment
	 */
	 public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo insert(ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObject, ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.SuitableForSurgeryAssessment
	 */
	 public static ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo insert(DomainObjectMap map, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObject, ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SuitableForSurgeryAssessment(domainObject.getId());
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
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.PatientProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// TheatreType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTheatreType();
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

			ims.scheduling.vo.lookups.TheatreType voLookup4 = new ims.scheduling.vo.lookups.TheatreType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.scheduling.vo.lookups.TheatreType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTheatreType(voLookup4);
		}
				// HistoryPresComplaint
		valueObject.setHistoryPresComplaint(domainObject.getHistoryPresComplaint());
		// Examination
		valueObject.setExamination(domainObject.getExamination());
		// Conclusions
		valueObject.setConclusions(domainObject.getConclusions());
		// NotSuitableForSurgeyComments
		valueObject.setNotSuitableForSurgeyComments(domainObject.getNotSuitableForSurgeyComments());
		// SuitableForSurgery
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSuitableForSurgery();
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

			ims.core.vo.lookups.YesNoUnknown voLookup9 = new ims.core.vo.lookups.YesNoUnknown(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNoUnknown(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSuitableForSurgery(voLookup9);
		}
				// ReasonNotSuitable
		ims.domain.lookups.LookupInstance instance10 = domainObject.getReasonNotSuitable();
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

			ims.RefMan.vo.lookups.ReasonNotSuitableForSurgery voLookup10 = new ims.RefMan.vo.lookups.ReasonNotSuitableForSurgery(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReasonNotSuitableForSurgery parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.RefMan.vo.lookups.ReasonNotSuitableForSurgery(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setReasonNotSuitable(voLookup10);
		}
				// Comments
		valueObject.setComments(ims.RefMan.vo.domain.SuitableForSurgeryCommentVoAssembler.createSuitableForSurgeryCommentVoCollectionFromSuitableForSurgeryComment(map, domainObject.getComments()) );
		// ProcedurePerformed
		valueObject.setProcedurePerformed( domainObject.isProcedurePerformed() );
		// SuitableForSurgeryDate
		java.util.Date SuitableForSurgeryDate = domainObject.getSuitableForSurgeryDate();
		if ( null != SuitableForSurgeryDate ) 
		{
			valueObject.setSuitableForSurgeryDate(new ims.framework.utils.Date(SuitableForSurgeryDate) );
		}
		// RequiredDurationInMins
		valueObject.setRequiredDurationInMins(domainObject.getRequiredDurationInMins());
		// AnaestheticType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup15 = new ims.clinical.vo.lookups.AnaestheticType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setAnaestheticType(voLookup15);
		}
				// NamedSurgeon
		valueObject.setNamedSurgeon(ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getNamedSurgeon()) );
		// SpecialEquipmentRequired
		valueObject.setSpecialEquipmentRequired( domainObject.isSpecialEquipmentRequired() );
		// SpecialEquipmentComments
		valueObject.setSpecialEquipmentComments(domainObject.getSpecialEquipmentComments());
		// SpecialInstructionsRequired
		valueObject.setSpecialInstructionsRequired( domainObject.isSpecialInstructionsRequired() );
		// SpecialInstructionsComments
		valueObject.setSpecialInstructionsComments(domainObject.getSpecialInstructionsComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.SuitableForSurgeryAssessment extractSuitableForSurgeryAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObject) 
	{
		return 	extractSuitableForSurgeryAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.SuitableForSurgeryAssessment extractSuitableForSurgeryAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SuitableForSurgeryAssessment();
		ims.RefMan.domain.objects.SuitableForSurgeryAssessment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.SuitableForSurgeryAssessment)domMap.get(valueObject);
			}
			// ims.RefMan.vo.SuitableForSurgeryAssessmentLiteVo ID_SuitableForSurgeryAssessment field is unknown
			domainObject = new ims.RefMan.domain.objects.SuitableForSurgeryAssessment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SuitableForSurgeryAssessment());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.SuitableForSurgeryAssessment)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.SuitableForSurgeryAssessment) domainFactory.getDomainObject(ims.RefMan.domain.objects.SuitableForSurgeryAssessment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SuitableForSurgeryAssessment());

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
		domainObject.setProcedure(ims.core.vo.domain.PatientProcedureLiteVoAssembler.extractPatientProcedure(domainFactory, valueObject.getProcedure(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHistoryPresComplaint() != null && valueObject.getHistoryPresComplaint().equals(""))
		{
			valueObject.setHistoryPresComplaint(null);
		}
		domainObject.setHistoryPresComplaint(valueObject.getHistoryPresComplaint());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExamination() != null && valueObject.getExamination().equals(""))
		{
			valueObject.setExamination(null);
		}
		domainObject.setExamination(valueObject.getExamination());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConclusions() != null && valueObject.getConclusions().equals(""))
		{
			valueObject.setConclusions(null);
		}
		domainObject.setConclusions(valueObject.getConclusions());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotSuitableForSurgeyComments() != null && valueObject.getNotSuitableForSurgeyComments().equals(""))
		{
			valueObject.setNotSuitableForSurgeyComments(null);
		}
		domainObject.setNotSuitableForSurgeyComments(valueObject.getNotSuitableForSurgeyComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSuitableForSurgery() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSuitableForSurgery().getID());
		}
		domainObject.setSuitableForSurgery(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getReasonNotSuitable() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getReasonNotSuitable().getID());
		}
		domainObject.setReasonNotSuitable(value10);
		domainObject.setComments(ims.RefMan.vo.domain.SuitableForSurgeryCommentVoAssembler.extractSuitableForSurgeryCommentSet(domainFactory, valueObject.getComments(), domainObject.getComments(), domMap));		
		domainObject.setProcedurePerformed(valueObject.getProcedurePerformed());
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getSuitableForSurgeryDate();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setSuitableForSurgeryDate(value13);
		domainObject.setRequiredDurationInMins(valueObject.getRequiredDurationInMins());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value16 = null;
		if ( null != valueObject.getNamedSurgeon() ) 
		{
			if (valueObject.getNamedSurgeon().getBoId() == null)
			{
				if (domMap.get(valueObject.getNamedSurgeon()) != null)
				{
					value16 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getNamedSurgeon());
				}
			}
			else
			{
				value16 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getNamedSurgeon().getBoId());
			}
		}
		domainObject.setNamedSurgeon(value16);
		domainObject.setSpecialEquipmentRequired(valueObject.getSpecialEquipmentRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialEquipmentComments() != null && valueObject.getSpecialEquipmentComments().equals(""))
		{
			valueObject.setSpecialEquipmentComments(null);
		}
		domainObject.setSpecialEquipmentComments(valueObject.getSpecialEquipmentComments());
		domainObject.setSpecialInstructionsRequired(valueObject.getSpecialInstructionsRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpecialInstructionsComments() != null && valueObject.getSpecialInstructionsComments().equals(""))
		{
			valueObject.setSpecialInstructionsComments(null);
		}
		domainObject.setSpecialInstructionsComments(valueObject.getSpecialInstructionsComments());

		return domainObject;
	}

}
