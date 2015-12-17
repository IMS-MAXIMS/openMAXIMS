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
public class ReferralDischargeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralDischargeVo copy(ims.RefMan.vo.ReferralDischargeVo valueObjectDest, ims.RefMan.vo.ReferralDischargeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeOutcome(valueObjectSrc.getID_DischargeOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DischargeType
		valueObjectDest.setDischargeType(valueObjectSrc.getDischargeType());
		// FurtherManagement
		valueObjectDest.setFurtherManagement(valueObjectSrc.getFurtherManagement());
		// DischargeOtherType
		valueObjectDest.setDischargeOtherType(valueObjectSrc.getDischargeOtherType());
		// OtherDetails
		valueObjectDest.setOtherDetails(valueObjectSrc.getOtherDetails());
		// CurrentOnwardReferral
		valueObjectDest.setCurrentOnwardReferral(valueObjectSrc.getCurrentOnwardReferral());
		// OnwardReferrals
		valueObjectDest.setOnwardReferrals(valueObjectSrc.getOnwardReferrals());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// DischargingHCP
		valueObjectDest.setDischargingHCP(valueObjectSrc.getDischargingHCP());
		// ResultsForReport
		valueObjectDest.setResultsForReport(valueObjectSrc.getResultsForReport());
		// DiagnosisForReport
		valueObjectDest.setDiagnosisForReport(valueObjectSrc.getDiagnosisForReport());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralDischargeVoCollectionFromDischargeOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.DischargeOutcome objects.
	 */
	public static ims.RefMan.vo.ReferralDischargeVoCollection createReferralDischargeVoCollectionFromDischargeOutcome(java.util.Set domainObjectSet)	
	{
		return createReferralDischargeVoCollectionFromDischargeOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.DischargeOutcome objects.
	 */
	public static ims.RefMan.vo.ReferralDischargeVoCollection createReferralDischargeVoCollectionFromDischargeOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralDischargeVoCollection voList = new ims.RefMan.vo.ReferralDischargeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.DischargeOutcome domainObject = (ims.RefMan.domain.objects.DischargeOutcome) iterator.next();
			ims.RefMan.vo.ReferralDischargeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.DischargeOutcome objects.
	 */
	public static ims.RefMan.vo.ReferralDischargeVoCollection createReferralDischargeVoCollectionFromDischargeOutcome(java.util.List domainObjectList) 
	{
		return createReferralDischargeVoCollectionFromDischargeOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.DischargeOutcome objects.
	 */
	public static ims.RefMan.vo.ReferralDischargeVoCollection createReferralDischargeVoCollectionFromDischargeOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralDischargeVoCollection voList = new ims.RefMan.vo.ReferralDischargeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.DischargeOutcome domainObject = (ims.RefMan.domain.objects.DischargeOutcome) domainObjectList.get(i);
			ims.RefMan.vo.ReferralDischargeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.DischargeOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDischargeVoCollection voCollection) 
	 {
	 	return extractDischargeOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDischargeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralDischargeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.DischargeOutcome domainObject = ReferralDischargeVoAssembler.extractDischargeOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.DischargeOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDischargeVoCollection voCollection) 
	 {
	 	return extractDischargeOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDischargeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralDischargeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.DischargeOutcome domainObject = ReferralDischargeVoAssembler.extractDischargeOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.DischargeOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.DischargeOutcome
	 */
	 public static ims.RefMan.vo.ReferralDischargeVo create(ims.RefMan.domain.objects.DischargeOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.DischargeOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ReferralDischargeVo create(DomainObjectMap map, ims.RefMan.domain.objects.DischargeOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralDischargeVo valueObject = (ims.RefMan.vo.ReferralDischargeVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralDischargeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralDischargeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.DischargeOutcome
	 */
	 public static ims.RefMan.vo.ReferralDischargeVo insert(ims.RefMan.vo.ReferralDischargeVo valueObject, ims.RefMan.domain.objects.DischargeOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.DischargeOutcome
	 */
	 public static ims.RefMan.vo.ReferralDischargeVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralDischargeVo valueObject, ims.RefMan.domain.objects.DischargeOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeOutcome(domainObject.getId());
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
			
		// DischargeType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getDischargeType();
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

			ims.RefMan.vo.lookups.DischargeType voLookup1 = new ims.RefMan.vo.lookups.DischargeType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.RefMan.vo.lookups.DischargeType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.RefMan.vo.lookups.DischargeType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setDischargeType(voLookup1);
		}
				// FurtherManagement
		valueObject.setFurtherManagement(domainObject.getFurtherManagement());
		// DischargeOtherType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDischargeOtherType();
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

			ims.RefMan.vo.lookups.DischargeOtherType voLookup3 = new ims.RefMan.vo.lookups.DischargeOtherType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.RefMan.vo.lookups.DischargeOtherType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.RefMan.vo.lookups.DischargeOtherType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDischargeOtherType(voLookup3);
		}
				// OtherDetails
		valueObject.setOtherDetails(domainObject.getOtherDetails());
		// CurrentOnwardReferral
		valueObject.setCurrentOnwardReferral(ims.RefMan.vo.domain.OnwardReferralVoAssembler.create(map, domainObject.getCurrentOnwardReferral()) );
		// OnwardReferrals
		valueObject.setOnwardReferrals(ims.RefMan.vo.domain.OnwardReferralVoAssembler.createOnwardReferralVoCollectionFromOnwardReferral(map, domainObject.getOnwardReferrals()) );
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// DischargingHCP
		valueObject.setDischargingHCP(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getDischargingHCP()) );
		// ResultsForReport
		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection ResultsForReport = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getResultsForReport().iterator(); iterator.hasNext(); ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation tmp = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)iterator.next();
			if (tmp != null)
				ResultsForReport.add(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setResultsForReport(ResultsForReport);
		// DiagnosisForReport
		ims.core.clinical.vo.PatientDiagnosisRefVoCollection DiagnosisForReport = new ims.core.clinical.vo.PatientDiagnosisRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getDiagnosisForReport().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.PatientDiagnosis tmp = (ims.core.clinical.domain.objects.PatientDiagnosis)iterator.next();
			if (tmp != null)
				DiagnosisForReport.add(new ims.core.clinical.vo.PatientDiagnosisRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setDiagnosisForReport(DiagnosisForReport);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.DischargeOutcome extractDischargeOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDischargeVo valueObject) 
	{
		return 	extractDischargeOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.DischargeOutcome extractDischargeOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralDischargeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeOutcome();
		ims.RefMan.domain.objects.DischargeOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.DischargeOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ReferralDischargeVo ID_DischargeOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.DischargeOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.DischargeOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.DischargeOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.DischargeOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeOutcome());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getDischargeType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getDischargeType().getID());
		}
		domainObject.setDischargeType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFurtherManagement() != null && valueObject.getFurtherManagement().equals(""))
		{
			valueObject.setFurtherManagement(null);
		}
		domainObject.setFurtherManagement(valueObject.getFurtherManagement());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDischargeOtherType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDischargeOtherType().getID());
		}
		domainObject.setDischargeOtherType(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherDetails() != null && valueObject.getOtherDetails().equals(""))
		{
			valueObject.setOtherDetails(null);
		}
		domainObject.setOtherDetails(valueObject.getOtherDetails());
		domainObject.setCurrentOnwardReferral(ims.RefMan.vo.domain.OnwardReferralVoAssembler.extractOnwardReferral(domainFactory, valueObject.getCurrentOnwardReferral(), domMap));
		domainObject.setOnwardReferrals(ims.RefMan.vo.domain.OnwardReferralVoAssembler.extractOnwardReferralSet(domainFactory, valueObject.getOnwardReferrals(), domainObject.getOnwardReferrals(), domMap));		
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDischargeDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDischargeDate(value7);
		domainObject.setRecordingInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		domainObject.setDischargingHCP(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getDischargingHCP(), domMap));

		ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection refCollection10 = valueObject.getResultsForReport();
		int size10 = (null == refCollection10) ? 0 : refCollection10.size();		
		java.util.Set domainResultsForReport10 = domainObject.getResultsForReport();
		if (domainResultsForReport10 == null)
		{
			domainResultsForReport10 = new java.util.HashSet();
		}
		java.util.Set newSet10  = new java.util.HashSet();
		for(int i=0; i<size10; i++) 
		{
			ims.ocrr.orderingresults.vo.OrderInvestigationRefVo vo = refCollection10.get(i);					
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject( ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainResultsForReport10.contains(dom))
			{
				domainResultsForReport10.add(dom);
			}
			newSet10.add(dom);			
		}
		java.util.Set removedSet10 = new java.util.HashSet();
		java.util.Iterator iter10 = domainResultsForReport10.iterator();
		//Find out which objects need to be removed
		while (iter10.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter10.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet10.contains(o))
			{
				removedSet10.add(o);
			}
		}
		iter10 = removedSet10.iterator();
		//Remove the unwanted objects
		while (iter10.hasNext())
		{
			domainResultsForReport10.remove(iter10.next());
		}		
		
		domainObject.setResultsForReport(domainResultsForReport10);		

		ims.core.clinical.vo.PatientDiagnosisRefVoCollection refCollection11 = valueObject.getDiagnosisForReport();
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.List domainDiagnosisForReport11 = domainObject.getDiagnosisForReport();
		if (domainDiagnosisForReport11 == null)
		{
			domainDiagnosisForReport11 = new java.util.ArrayList();
		}
		for(int i=0; i < size11; i++) 
		{
			ims.core.clinical.vo.PatientDiagnosisRefVo vo = refCollection11.get(i);			
			ims.core.clinical.domain.objects.PatientDiagnosis dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientDiagnosis.class, vo.getBoId());
				}
			}

			int domIdx = domainDiagnosisForReport11.indexOf(dom);
			if (domIdx == -1)
			{
				domainDiagnosisForReport11.add(i, dom);
			}
			else if (i != domIdx && i < domainDiagnosisForReport11.size())
			{
				Object tmp = domainDiagnosisForReport11.get(i);
				domainDiagnosisForReport11.set(i, domainDiagnosisForReport11.get(domIdx));
				domainDiagnosisForReport11.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i11 = domainDiagnosisForReport11.size();
		while (i11 > size11)
		{
			domainDiagnosisForReport11.remove(i11-1);
			i11 = domainDiagnosisForReport11.size();
		}
		
		domainObject.setDiagnosisForReport(domainDiagnosisForReport11);		

		return domainObject;
	}

}
