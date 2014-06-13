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
 * @author Daniel Laffan
 */
public class EDischargeSTHKSummaryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.EDischargeSTHKSummaryVo copy(ims.clinical.vo.EDischargeSTHKSummaryVo valueObjectDest, ims.clinical.vo.EDischargeSTHKSummaryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Summary(valueObjectSrc.getID_Summary());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AdmissionDateTime
		valueObjectDest.setAdmissionDateTime(valueObjectSrc.getAdmissionDateTime());
		// TTAStatus
		valueObjectDest.setTTAStatus(valueObjectSrc.getTTAStatus());
		// HasHadAnyProceduresPerformed
		valueObjectDest.setHasHadAnyProceduresPerformed(valueObjectSrc.getHasHadAnyProceduresPerformed());
		// AdditonalClinicalInfo
		valueObjectDest.setAdditonalClinicalInfo(valueObjectSrc.getAdditonalClinicalInfo());
		// SummaryDetails
		valueObjectDest.setSummaryDetails(valueObjectSrc.getSummaryDetails());
		// DischargeLetterStatus
		valueObjectDest.setDischargeLetterStatus(valueObjectSrc.getDischargeLetterStatus());
		// DischargeSupplementaryLetterStatus
		valueObjectDest.setDischargeSupplementaryLetterStatus(valueObjectSrc.getDischargeSupplementaryLetterStatus());
		// DischargeDocuments
		valueObjectDest.setDischargeDocuments(valueObjectSrc.getDischargeDocuments());
		// DischargeDetails
		valueObjectDest.setDischargeDetails(valueObjectSrc.getDischargeDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDischargeSTHKSummaryVoCollectionFromSummary(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.Summary objects.
	 */
	public static ims.clinical.vo.EDischargeSTHKSummaryVoCollection createEDischargeSTHKSummaryVoCollectionFromSummary(java.util.Set domainObjectSet)	
	{
		return createEDischargeSTHKSummaryVoCollectionFromSummary(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.Summary objects.
	 */
	public static ims.clinical.vo.EDischargeSTHKSummaryVoCollection createEDischargeSTHKSummaryVoCollectionFromSummary(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.EDischargeSTHKSummaryVoCollection voList = new ims.clinical.vo.EDischargeSTHKSummaryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.Summary domainObject = (ims.edischarge.domain.objects.Summary) iterator.next();
			ims.clinical.vo.EDischargeSTHKSummaryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.Summary objects.
	 */
	public static ims.clinical.vo.EDischargeSTHKSummaryVoCollection createEDischargeSTHKSummaryVoCollectionFromSummary(java.util.List domainObjectList) 
	{
		return createEDischargeSTHKSummaryVoCollectionFromSummary(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.Summary objects.
	 */
	public static ims.clinical.vo.EDischargeSTHKSummaryVoCollection createEDischargeSTHKSummaryVoCollectionFromSummary(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.EDischargeSTHKSummaryVoCollection voList = new ims.clinical.vo.EDischargeSTHKSummaryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.Summary domainObject = (ims.edischarge.domain.objects.Summary) domainObjectList.get(i);
			ims.clinical.vo.EDischargeSTHKSummaryVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.Summary set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.EDischargeSTHKSummaryVoCollection voCollection) 
	 {
	 	return extractSummarySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSummarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.EDischargeSTHKSummaryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.EDischargeSTHKSummaryVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.Summary domainObject = EDischargeSTHKSummaryVoAssembler.extractSummary(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.Summary list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.EDischargeSTHKSummaryVoCollection voCollection) 
	 {
	 	return extractSummaryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSummaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.EDischargeSTHKSummaryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.EDischargeSTHKSummaryVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.Summary domainObject = EDischargeSTHKSummaryVoAssembler.extractSummary(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.Summary object.
	 * @param domainObject ims.edischarge.domain.objects.Summary
	 */
	 public static ims.clinical.vo.EDischargeSTHKSummaryVo create(ims.edischarge.domain.objects.Summary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.Summary object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.EDischargeSTHKSummaryVo create(DomainObjectMap map, ims.edischarge.domain.objects.Summary domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.EDischargeSTHKSummaryVo valueObject = (ims.clinical.vo.EDischargeSTHKSummaryVo) map.getValueObject(domainObject, ims.clinical.vo.EDischargeSTHKSummaryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.EDischargeSTHKSummaryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.Summary
	 */
	 public static ims.clinical.vo.EDischargeSTHKSummaryVo insert(ims.clinical.vo.EDischargeSTHKSummaryVo valueObject, ims.edischarge.domain.objects.Summary domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.Summary
	 */
	 public static ims.clinical.vo.EDischargeSTHKSummaryVo insert(DomainObjectMap map, ims.clinical.vo.EDischargeSTHKSummaryVo valueObject, ims.edischarge.domain.objects.Summary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Summary(domainObject.getId());
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
		// AdmissionDateTime
		java.util.Date AdmissionDateTime = domainObject.getAdmissionDateTime();
		if ( null != AdmissionDateTime ) 
		{
			valueObject.setAdmissionDateTime(new ims.framework.utils.DateTime(AdmissionDateTime) );
		}
		// TTAStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTTAStatus();
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

			ims.clinical.vo.lookups.TTAStatus voLookup3 = new ims.clinical.vo.lookups.TTAStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.TTAStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.TTAStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTTAStatus(voLookup3);
		}
				// HasHadAnyProceduresPerformed
		ims.domain.lookups.LookupInstance instance4 = domainObject.getHasHadAnyProceduresPerformed();
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

			ims.core.vo.lookups.YesNo voLookup4 = new ims.core.vo.lookups.YesNo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setHasHadAnyProceduresPerformed(voLookup4);
		}
				// AdditonalClinicalInfo
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAdditonalClinicalInfo();
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

			ims.clinical.vo.lookups.AdditonalClinicalInformation voLookup5 = new ims.clinical.vo.lookups.AdditonalClinicalInformation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.AdditonalClinicalInformation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.AdditonalClinicalInformation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAdditonalClinicalInfo(voLookup5);
		}
				// SummaryDetails
		valueObject.setSummaryDetails(ims.clinical.vo.domain.EDischargeSTHKSummaryDetailVoAssembler.createEDischargeSTHKSummaryDetailVoCollectionFromSummaryDetail(map, domainObject.getSummaryDetails()) );
		// DischargeLetterStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getDischargeLetterStatus();
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

			ims.clinical.vo.lookups.DischargeLetterStatus voLookup7 = new ims.clinical.vo.lookups.DischargeLetterStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeLetterStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.clinical.vo.lookups.DischargeLetterStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setDischargeLetterStatus(voLookup7);
		}
				// DischargeSupplementaryLetterStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDischargeSupplementaryLetterStatus();
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

			ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus voLookup8 = new ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDischargeSupplementaryLetterStatus(voLookup8);
		}
				// DischargeDocuments
		valueObject.setDischargeDocuments(ims.core.vo.domain.PatientDocumentVoAssembler.createPatientDocumentVoCollectionFromPatientDocument(map, domainObject.getDischargeDocuments()) );
		// DischargeDetails
		if (domainObject.getDischargeDetails() != null)
		{
			if(domainObject.getDischargeDetails() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDischargeDetails();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDischargeDetails(new ims.edischarge.vo.DischargeDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setDischargeDetails(new ims.edischarge.vo.DischargeDetailsRefVo(domainObject.getDischargeDetails().getId(), domainObject.getDischargeDetails().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.Summary extractSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.EDischargeSTHKSummaryVo valueObject) 
	{
		return 	extractSummary(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.Summary extractSummary(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.EDischargeSTHKSummaryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Summary();
		ims.edischarge.domain.objects.Summary domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.Summary)domMap.get(valueObject);
			}
			// ims.clinical.vo.EDischargeSTHKSummaryVo ID_Summary field is unknown
			domainObject = new ims.edischarge.domain.objects.Summary();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Summary());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.Summary)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.Summary) domainFactory.getDomainObject(ims.edischarge.domain.objects.Summary.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Summary());

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
		ims.framework.utils.DateTime dateTime2 = valueObject.getAdmissionDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAdmissionDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTTAStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTTAStatus().getID());
		}
		domainObject.setTTAStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getHasHadAnyProceduresPerformed() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getHasHadAnyProceduresPerformed().getID());
		}
		domainObject.setHasHadAnyProceduresPerformed(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAdditonalClinicalInfo() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAdditonalClinicalInfo().getID());
		}
		domainObject.setAdditonalClinicalInfo(value5);
		domainObject.setSummaryDetails(ims.clinical.vo.domain.EDischargeSTHKSummaryDetailVoAssembler.extractSummaryDetailList(domainFactory, valueObject.getSummaryDetails(), domainObject.getSummaryDetails(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getDischargeLetterStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getDischargeLetterStatus().getID());
		}
		domainObject.setDischargeLetterStatus(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDischargeSupplementaryLetterStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDischargeSupplementaryLetterStatus().getID());
		}
		domainObject.setDischargeSupplementaryLetterStatus(value8);
		domainObject.setDischargeDocuments(ims.core.vo.domain.PatientDocumentVoAssembler.extractPatientDocumentSet(domainFactory, valueObject.getDischargeDocuments(), domainObject.getDischargeDocuments(), domMap));		
		ims.edischarge.domain.objects.DischargeDetails value10 = null;
		if ( null != valueObject.getDischargeDetails() ) 
		{
			if (valueObject.getDischargeDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargeDetails()) != null)
				{
					value10 = (ims.edischarge.domain.objects.DischargeDetails)domMap.get(valueObject.getDischargeDetails());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getDischargeDetails();	
			}
			else
			{
				value10 = (ims.edischarge.domain.objects.DischargeDetails)domainFactory.getDomainObject(ims.edischarge.domain.objects.DischargeDetails.class, valueObject.getDischargeDetails().getBoId());
			}
		}
		domainObject.setDischargeDetails(value10);

		return domainObject;
	}

}
