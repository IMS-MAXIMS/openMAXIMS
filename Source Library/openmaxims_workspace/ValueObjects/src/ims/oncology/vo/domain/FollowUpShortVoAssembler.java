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
 * @author George Cristian Josan
 */
public class FollowUpShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.FollowUpShortVo copy(ims.oncology.vo.FollowUpShortVo valueObjectDest, ims.oncology.vo.FollowUpShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FollowUp(valueObjectSrc.getID_FollowUp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// MorbidityCodeSurgery
		valueObjectDest.setMorbidityCodeSurgery(valueObjectSrc.getMorbidityCodeSurgery());
		// MorbidityCodeCancerChemotherapy
		valueObjectDest.setMorbidityCodeCancerChemotherapy(valueObjectSrc.getMorbidityCodeCancerChemotherapy());
		// MorbidityCodeCancerRadiotherapy
		valueObjectDest.setMorbidityCodeCancerRadiotherapy(valueObjectSrc.getMorbidityCodeCancerRadiotherapy());
		// MorbidityCodeCancerCombination
		valueObjectDest.setMorbidityCodeCancerCombination(valueObjectSrc.getMorbidityCodeCancerCombination());
		// DyspneaScore
		valueObjectDest.setDyspneaScore(valueObjectSrc.getDyspneaScore());
		// AssessmentDate
		valueObjectDest.setAssessmentDate(valueObjectSrc.getAssessmentDate());
		// PatientFollowUpStatus
		valueObjectDest.setPatientFollowUpStatus(valueObjectSrc.getPatientFollowUpStatus());
		// TreatmentType
		valueObjectDest.setTreatmentType(valueObjectSrc.getTreatmentType());
		// PrimaryTumourStatus
		valueObjectDest.setPrimaryTumourStatus(valueObjectSrc.getPrimaryTumourStatus());
		// NodalStatus
		valueObjectDest.setNodalStatus(valueObjectSrc.getNodalStatus());
		// MetastaticStatus
		valueObjectDest.setMetastaticStatus(valueObjectSrc.getMetastaticStatus());
		// MarkerResponseStatus
		valueObjectDest.setMarkerResponseStatus(valueObjectSrc.getMarkerResponseStatus());
		// PerformanceStatus
		valueObjectDest.setPerformanceStatus(valueObjectSrc.getPerformanceStatus());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFollowUpShortVoCollectionFromFollowUp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.FollowUp objects.
	 */
	public static ims.oncology.vo.FollowUpShortVoCollection createFollowUpShortVoCollectionFromFollowUp(java.util.Set domainObjectSet)	
	{
		return createFollowUpShortVoCollectionFromFollowUp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.FollowUp objects.
	 */
	public static ims.oncology.vo.FollowUpShortVoCollection createFollowUpShortVoCollectionFromFollowUp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.FollowUpShortVoCollection voList = new ims.oncology.vo.FollowUpShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.FollowUp domainObject = (ims.oncology.domain.objects.FollowUp) iterator.next();
			ims.oncology.vo.FollowUpShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.FollowUp objects.
	 */
	public static ims.oncology.vo.FollowUpShortVoCollection createFollowUpShortVoCollectionFromFollowUp(java.util.List domainObjectList) 
	{
		return createFollowUpShortVoCollectionFromFollowUp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.FollowUp objects.
	 */
	public static ims.oncology.vo.FollowUpShortVoCollection createFollowUpShortVoCollectionFromFollowUp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.FollowUpShortVoCollection voList = new ims.oncology.vo.FollowUpShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.FollowUp domainObject = (ims.oncology.domain.objects.FollowUp) domainObjectList.get(i);
			ims.oncology.vo.FollowUpShortVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.FollowUp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFollowUpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.FollowUpShortVoCollection voCollection) 
	 {
	 	return extractFollowUpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFollowUpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.FollowUpShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.FollowUpShortVo vo = voCollection.get(i);
			ims.oncology.domain.objects.FollowUp domainObject = FollowUpShortVoAssembler.extractFollowUp(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.FollowUp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFollowUpList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.FollowUpShortVoCollection voCollection) 
	 {
	 	return extractFollowUpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFollowUpList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.FollowUpShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.FollowUpShortVo vo = voCollection.get(i);
			ims.oncology.domain.objects.FollowUp domainObject = FollowUpShortVoAssembler.extractFollowUp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.FollowUp object.
	 * @param domainObject ims.oncology.domain.objects.FollowUp
	 */
	 public static ims.oncology.vo.FollowUpShortVo create(ims.oncology.domain.objects.FollowUp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.FollowUp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.FollowUpShortVo create(DomainObjectMap map, ims.oncology.domain.objects.FollowUp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.FollowUpShortVo valueObject = (ims.oncology.vo.FollowUpShortVo) map.getValueObject(domainObject, ims.oncology.vo.FollowUpShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.FollowUpShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.FollowUp
	 */
	 public static ims.oncology.vo.FollowUpShortVo insert(ims.oncology.vo.FollowUpShortVo valueObject, ims.oncology.domain.objects.FollowUp domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.FollowUp
	 */
	 public static ims.oncology.vo.FollowUpShortVo insert(DomainObjectMap map, ims.oncology.vo.FollowUpShortVo valueObject, ims.oncology.domain.objects.FollowUp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FollowUp(domainObject.getId());
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
		// MorbidityCodeSurgery
		ims.domain.lookups.LookupInstance instance3 = domainObject.getMorbidityCodeSurgery();
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

			ims.oncology.vo.lookups.FUMorbiditySurgery voLookup3 = new ims.oncology.vo.lookups.FUMorbiditySurgery(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUMorbiditySurgery parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.FUMorbiditySurgery(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setMorbidityCodeSurgery(voLookup3);
		}
				// MorbidityCodeCancerChemotherapy
		ims.domain.lookups.LookupInstance instance4 = domainObject.getMorbidityCodeCancerChemotherapy();
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

			ims.oncology.vo.lookups.FUMorbidityChemoTx voLookup4 = new ims.oncology.vo.lookups.FUMorbidityChemoTx(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUMorbidityChemoTx parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.FUMorbidityChemoTx(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setMorbidityCodeCancerChemotherapy(voLookup4);
		}
				// MorbidityCodeCancerRadiotherapy
		ims.domain.lookups.LookupInstance instance5 = domainObject.getMorbidityCodeCancerRadiotherapy();
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

			ims.oncology.vo.lookups.FUMorbidityRadiotx voLookup5 = new ims.oncology.vo.lookups.FUMorbidityRadiotx(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUMorbidityRadiotx parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.FUMorbidityRadiotx(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setMorbidityCodeCancerRadiotherapy(voLookup5);
		}
				// MorbidityCodeCancerCombination
		ims.domain.lookups.LookupInstance instance6 = domainObject.getMorbidityCodeCancerCombination();
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

			ims.oncology.vo.lookups.FUMorbidityCombination voLookup6 = new ims.oncology.vo.lookups.FUMorbidityCombination(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUMorbidityCombination parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.FUMorbidityCombination(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setMorbidityCodeCancerCombination(voLookup6);
		}
				// DyspneaScore
		ims.domain.lookups.LookupInstance instance7 = domainObject.getDyspneaScore();
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

			ims.oncology.vo.lookups.FUDyspneaScore voLookup7 = new ims.oncology.vo.lookups.FUDyspneaScore(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUDyspneaScore parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.FUDyspneaScore(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setDyspneaScore(voLookup7);
		}
				// AssessmentDate
		java.util.Date AssessmentDate = domainObject.getAssessmentDate();
		if ( null != AssessmentDate ) 
		{
			valueObject.setAssessmentDate(new ims.framework.utils.Date(AssessmentDate) );
		}
		// PatientFollowUpStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPatientFollowUpStatus();
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

			ims.oncology.vo.lookups.FUPatientFollowUpStatus voLookup9 = new ims.oncology.vo.lookups.FUPatientFollowUpStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUPatientFollowUpStatus parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.oncology.vo.lookups.FUPatientFollowUpStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPatientFollowUpStatus(voLookup9);
		}
				// TreatmentType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getTreatmentType();
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

			ims.oncology.vo.lookups.FUTreatmentType voLookup10 = new ims.oncology.vo.lookups.FUTreatmentType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUTreatmentType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.oncology.vo.lookups.FUTreatmentType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setTreatmentType(voLookup10);
		}
				// PrimaryTumourStatus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPrimaryTumourStatus();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.FUPrimaryTumourStatus voLookup11 = new ims.oncology.vo.lookups.FUPrimaryTumourStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUPrimaryTumourStatus parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.oncology.vo.lookups.FUPrimaryTumourStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPrimaryTumourStatus(voLookup11);
		}
				// NodalStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getNodalStatus();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.FUNodalStatus voLookup12 = new ims.oncology.vo.lookups.FUNodalStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUNodalStatus parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.oncology.vo.lookups.FUNodalStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setNodalStatus(voLookup12);
		}
				// MetastaticStatus
		ims.domain.lookups.LookupInstance instance13 = domainObject.getMetastaticStatus();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.FUMetastaticStatus voLookup13 = new ims.oncology.vo.lookups.FUMetastaticStatus(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUMetastaticStatus parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.oncology.vo.lookups.FUMetastaticStatus(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setMetastaticStatus(voLookup13);
		}
				// MarkerResponseStatus
		ims.domain.lookups.LookupInstance instance14 = domainObject.getMarkerResponseStatus();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.FUMarkerResponseStatus voLookup14 = new ims.oncology.vo.lookups.FUMarkerResponseStatus(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.oncology.vo.lookups.FUMarkerResponseStatus parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.oncology.vo.lookups.FUMarkerResponseStatus(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setMarkerResponseStatus(voLookup14);
		}
				// PerformanceStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getPerformanceStatus();
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

			ims.oncology.vo.lookups.WHOPerformanceStatus voLookup15 = new ims.oncology.vo.lookups.WHOPerformanceStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.oncology.vo.lookups.WHOPerformanceStatus parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.oncology.vo.lookups.WHOPerformanceStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setPerformanceStatus(voLookup15);
		}
				// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.FollowUp extractFollowUp(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.FollowUpShortVo valueObject) 
	{
		return 	extractFollowUp(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.FollowUp extractFollowUp(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.FollowUpShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FollowUp();
		ims.oncology.domain.objects.FollowUp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.FollowUp)domMap.get(valueObject);
			}
			// ims.oncology.vo.FollowUpShortVo ID_FollowUp field is unknown
			domainObject = new ims.oncology.domain.objects.FollowUp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FollowUp());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.FollowUp)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.FollowUp) domainFactory.getDomainObject(ims.oncology.domain.objects.FollowUp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FollowUp());

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
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getMorbidityCodeSurgery() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getMorbidityCodeSurgery().getID());
		}
		domainObject.setMorbidityCodeSurgery(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getMorbidityCodeCancerChemotherapy() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getMorbidityCodeCancerChemotherapy().getID());
		}
		domainObject.setMorbidityCodeCancerChemotherapy(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getMorbidityCodeCancerRadiotherapy() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getMorbidityCodeCancerRadiotherapy().getID());
		}
		domainObject.setMorbidityCodeCancerRadiotherapy(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getMorbidityCodeCancerCombination() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getMorbidityCodeCancerCombination().getID());
		}
		domainObject.setMorbidityCodeCancerCombination(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getDyspneaScore() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getDyspneaScore().getID());
		}
		domainObject.setDyspneaScore(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getAssessmentDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setAssessmentDate(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPatientFollowUpStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPatientFollowUpStatus().getID());
		}
		domainObject.setPatientFollowUpStatus(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getTreatmentType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getTreatmentType().getID());
		}
		domainObject.setTreatmentType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPrimaryTumourStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPrimaryTumourStatus().getID());
		}
		domainObject.setPrimaryTumourStatus(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getNodalStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getNodalStatus().getID());
		}
		domainObject.setNodalStatus(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getMetastaticStatus() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getMetastaticStatus().getID());
		}
		domainObject.setMetastaticStatus(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getMarkerResponseStatus() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getMarkerResponseStatus().getID());
		}
		domainObject.setMarkerResponseStatus(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getPerformanceStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getPerformanceStatus().getID());
		}
		domainObject.setPerformanceStatus(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value16 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value16 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value16 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value16);

		return domainObject;
	}

}
