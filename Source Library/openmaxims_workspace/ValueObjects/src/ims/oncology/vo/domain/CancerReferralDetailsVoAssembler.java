//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class CancerReferralDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.CancerReferralDetailsVo copy(ims.oncology.vo.CancerReferralDetailsVo valueObjectDest, ims.oncology.vo.CancerReferralDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CancerReferralDetails(valueObjectSrc.getID_CancerReferralDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// PASReferral
		valueObjectDest.setPASReferral(valueObjectSrc.getPASReferral());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// TumourRel
		valueObjectDest.setTumourRel(valueObjectSrc.getTumourRel());
		// FirstTheraInter
		valueObjectDest.setFirstTheraInter(valueObjectSrc.getFirstTheraInter());
		// PerfStatus
		valueObjectDest.setPerfStatus(valueObjectSrc.getPerfStatus());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCancerReferralDetailsVoCollectionFromCancerReferralDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerReferralDetails objects.
	 */
	public static ims.oncology.vo.CancerReferralDetailsVoCollection createCancerReferralDetailsVoCollectionFromCancerReferralDetails(java.util.Set domainObjectSet)	
	{
		return createCancerReferralDetailsVoCollectionFromCancerReferralDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerReferralDetails objects.
	 */
	public static ims.oncology.vo.CancerReferralDetailsVoCollection createCancerReferralDetailsVoCollectionFromCancerReferralDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.CancerReferralDetailsVoCollection voList = new ims.oncology.vo.CancerReferralDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.CancerReferralDetails domainObject = (ims.oncology.domain.objects.CancerReferralDetails) iterator.next();
			ims.oncology.vo.CancerReferralDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerReferralDetails objects.
	 */
	public static ims.oncology.vo.CancerReferralDetailsVoCollection createCancerReferralDetailsVoCollectionFromCancerReferralDetails(java.util.List domainObjectList) 
	{
		return createCancerReferralDetailsVoCollectionFromCancerReferralDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerReferralDetails objects.
	 */
	public static ims.oncology.vo.CancerReferralDetailsVoCollection createCancerReferralDetailsVoCollectionFromCancerReferralDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.CancerReferralDetailsVoCollection voList = new ims.oncology.vo.CancerReferralDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CancerReferralDetails domainObject = (ims.oncology.domain.objects.CancerReferralDetails) domainObjectList.get(i);
			ims.oncology.vo.CancerReferralDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.CancerReferralDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCancerReferralDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerReferralDetailsVoCollection voCollection) 
	 {
	 	return extractCancerReferralDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCancerReferralDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerReferralDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerReferralDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerReferralDetails domainObject = CancerReferralDetailsVoAssembler.extractCancerReferralDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.CancerReferralDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCancerReferralDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerReferralDetailsVoCollection voCollection) 
	 {
	 	return extractCancerReferralDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCancerReferralDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerReferralDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerReferralDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerReferralDetails domainObject = CancerReferralDetailsVoAssembler.extractCancerReferralDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.CancerReferralDetails object.
	 * @param domainObject ims.oncology.domain.objects.CancerReferralDetails
	 */
	 public static ims.oncology.vo.CancerReferralDetailsVo create(ims.oncology.domain.objects.CancerReferralDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.CancerReferralDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.CancerReferralDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.CancerReferralDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.CancerReferralDetailsVo valueObject = (ims.oncology.vo.CancerReferralDetailsVo) map.getValueObject(domainObject, ims.oncology.vo.CancerReferralDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.CancerReferralDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CancerReferralDetails
	 */
	 public static ims.oncology.vo.CancerReferralDetailsVo insert(ims.oncology.vo.CancerReferralDetailsVo valueObject, ims.oncology.domain.objects.CancerReferralDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.CancerReferralDetails
	 */
	 public static ims.oncology.vo.CancerReferralDetailsVo insert(DomainObjectMap map, ims.oncology.vo.CancerReferralDetailsVo valueObject, ims.oncology.domain.objects.CancerReferralDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CancerReferralDetails(domainObject.getId());
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
			
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// PASReferral
		valueObject.setPASReferral(ims.core.vo.domain.PASReferralVoAssembler.create(map, domainObject.getPASReferral()) );
		// Assessment
		valueObject.setAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getAssessment()) );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// TumourRel
		valueObject.setTumourRel( domainObject.isTumourRel() );
		// FirstTheraInter
		ims.domain.lookups.LookupInstance instance6 = domainObject.getFirstTheraInter();
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

			ims.core.vo.lookups.YesNoUnknown voLookup6 = new ims.core.vo.lookups.YesNoUnknown(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNoUnknown(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setFirstTheraInter(voLookup6);
		}
				// PerfStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getPerfStatus();
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

			ims.oncology.vo.lookups.PatientPerformanceStatus voLookup7 = new ims.oncology.vo.lookups.PatientPerformanceStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.PatientPerformanceStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.PatientPerformanceStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setPerfStatus(voLookup7);
		}
				// Diagnosis
		valueObject.setDiagnosis(ims.oncology.vo.domain.PatientDiagnosisForPrimaryTumourVoAssembler.create(map, domainObject.getDiagnosis()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CancerReferralDetails extractCancerReferralDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerReferralDetailsVo valueObject) 
	{
		return 	extractCancerReferralDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CancerReferralDetails extractCancerReferralDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerReferralDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CancerReferralDetails();
		ims.oncology.domain.objects.CancerReferralDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.CancerReferralDetails)domMap.get(valueObject);
			}
			// ims.oncology.vo.CancerReferralDetailsVo ID_CancerReferralDetails field is unknown
			domainObject = new ims.oncology.domain.objects.CancerReferralDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CancerReferralDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.CancerReferralDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.CancerReferralDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.CancerReferralDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CancerReferralDetails());

		ims.core.admin.domain.objects.EpisodeOfCare value1 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value1 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.Referral value2 = null;
		if ( null != valueObject.getPASReferral() ) 
		{
			if (valueObject.getPASReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getPASReferral()) != null)
				{
					value2 = (ims.core.admin.domain.objects.Referral)domMap.get(valueObject.getPASReferral());
				}
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.Referral)domainFactory.getDomainObject(ims.core.admin.domain.objects.Referral.class, valueObject.getPASReferral().getBoId());
			}
		}
		domainObject.setPASReferral(value2);
		domainObject.setAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getAssessment(), domMap));
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		domainObject.setTumourRel(valueObject.getTumourRel());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getFirstTheraInter() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getFirstTheraInter().getID());
		}
		domainObject.setFirstTheraInter(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getPerfStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getPerfStatus().getID());
		}
		domainObject.setPerfStatus(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientDiagnosis value8 = null;
		if ( null != valueObject.getDiagnosis() ) 
		{
			if (valueObject.getDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getDiagnosis()) != null)
				{
					value8 = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject.getDiagnosis());
				}
			}
			else
			{
				value8 = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, valueObject.getDiagnosis().getBoId());
			}
		}
		domainObject.setDiagnosis(value8);

		return domainObject;
	}

}
