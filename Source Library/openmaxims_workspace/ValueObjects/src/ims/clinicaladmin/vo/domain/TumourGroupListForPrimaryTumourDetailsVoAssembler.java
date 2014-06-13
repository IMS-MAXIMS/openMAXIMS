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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class TumourGroupListForPrimaryTumourDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo copy(ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObjectDest, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TumourGroup(valueObjectSrc.getID_TumourGroup());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// GroupName
		valueObjectDest.setGroupName(valueObjectSrc.getGroupName());
		// Sites
		valueObjectDest.setSites(valueObjectSrc.getSites());
		// TnmRequiresOver45
		valueObjectDest.setTnmRequiresOver45(valueObjectSrc.getTnmRequiresOver45());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// TNMValues
		valueObjectDest.setTNMValues(valueObjectSrc.getTNMValues());
		// SerumMarkers
		valueObjectDest.setSerumMarkers(valueObjectSrc.getSerumMarkers());
		// OtherClassifications
		valueObjectDest.setOtherClassifications(valueObjectSrc.getOtherClassifications());
		// AssociatedSpecialties
		valueObjectDest.setAssociatedSpecialties(valueObjectSrc.getAssociatedSpecialties());
		// hasTNM
		valueObjectDest.setHasTNM(valueObjectSrc.getHasTNM());
		// Histologies
		valueObjectDest.setHistologies(valueObjectSrc.getHistologies());
		// HistopathologicGrades
		valueObjectDest.setHistopathologicGrades(valueObjectSrc.getHistopathologicGrades());
		// Assessment
		valueObjectDest.setAssessment(valueObjectSrc.getAssessment());
		// isPrognosticGroupingRelevant
		valueObjectDest.setIsPrognosticGroupingRelevant(valueObjectSrc.getIsPrognosticGroupingRelevant());
		// PrognosticGroupingConfig
		valueObjectDest.setPrognosticGroupingConfig(valueObjectSrc.getPrognosticGroupingConfig());
		// TnmRequiresDiff
		valueObjectDest.setTnmRequiresDiff(valueObjectSrc.getTnmRequiresDiff());
		// TnmRequiresHisto
		valueObjectDest.setTnmRequiresHisto(valueObjectSrc.getTnmRequiresHisto());
		// TnmRequiresSMarkers
		valueObjectDest.setTnmRequiresSMarkers(valueObjectSrc.getTnmRequiresSMarkers());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourGroup objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(java.util.Set domainObjectSet)	
	{
		return createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourGroup objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection voList = new ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.TumourGroup domainObject = (ims.oncology.configuration.domain.objects.TumourGroup) iterator.next();
			ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourGroup objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(java.util.List domainObjectList) 
	{
		return createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourGroup objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection voList = new ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.TumourGroup domainObject = (ims.oncology.configuration.domain.objects.TumourGroup) domainObjectList.get(i);
			ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourGroup set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTumourGroupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection voCollection) 
	 {
	 	return extractTumourGroupSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTumourGroupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourGroup domainObject = TumourGroupListForPrimaryTumourDetailsVoAssembler.extractTumourGroup(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourGroup list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTumourGroupList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection voCollection) 
	 {
	 	return extractTumourGroupList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTumourGroupList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourGroup domainObject = TumourGroupListForPrimaryTumourDetailsVoAssembler.extractTumourGroup(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourGroup object.
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroup
	 */
	 public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo create(ims.oncology.configuration.domain.objects.TumourGroup domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourGroup object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.TumourGroup domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObject = (ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroup
	 */
	 public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo insert(ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObject, ims.oncology.configuration.domain.objects.TumourGroup domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroup
	 */
	 public static ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo insert(DomainObjectMap map, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObject, ims.oncology.configuration.domain.objects.TumourGroup domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TumourGroup(domainObject.getId());
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
			
		// GroupName
		valueObject.setGroupName(domainObject.getGroupName());
		// Sites
		valueObject.setSites(ims.clinicaladmin.vo.domain.TumourSiteLiteVoAssembler.createTumourSiteLiteVoCollectionFromTumourSite(map, domainObject.getSites()) );
		// TnmRequiresOver45
		valueObject.setTnmRequiresOver45( domainObject.isTnmRequiresOver45() );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// TNMValues
		valueObject.setTNMValues(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(map, domainObject.getTNMValues()) );
		// SerumMarkers
		valueObject.setSerumMarkers(ims.clinicaladmin.vo.domain.TumourSerumMarkersVoAssembler.createTumourSerumMarkersVoCollectionFromTumourSerumMarker(map, domainObject.getSerumMarkers()) );
		// OtherClassifications
		valueObject.setOtherClassifications(ims.oncology.vo.domain.TumourGroupClassificationVoAssembler.createTumourGroupClassificationVoCollectionFromTumourGroupClassification(map, domainObject.getOtherClassifications()) );
		// AssociatedSpecialties
		valueObject.setAssociatedSpecialties(ims.oncology.vo.domain.TumourGroupSpecialtyVoAssembler.createTumourGroupSpecialtyVoCollectionFromTumourGroupSpecialty(map, domainObject.getAssociatedSpecialties()) );
		// hasTNM
		valueObject.setHasTNM( domainObject.isHasTNM() );
		// Histologies
		valueObject.setHistologies(ims.clinicaladmin.vo.domain.TumourGroupHistologyVoAssembler.createTumourGroupHistologyVoCollectionFromTumourGroupHistology(map, domainObject.getHistologies()) );
		// HistopathologicGrades
		valueObject.setHistopathologicGrades(ims.clinicaladmin.vo.domain.TumourGroupHistopathologyGradeVoAssembler.createTumourGroupHistopathologyGradeVoCollectionFromTumourGroupHistopathologicGrade(map, domainObject.getHistopathologicGrades()) );
		// Assessment
		if (domainObject.getAssessment() != null)
		{
			if(domainObject.getAssessment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssessment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssessment(new ims.assessment.configuration.vo.UserAssessmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssessment(new ims.assessment.configuration.vo.UserAssessmentRefVo(domainObject.getAssessment().getId(), domainObject.getAssessment().getVersion()));
			}
		}
		// isPrognosticGroupingRelevant
		valueObject.setIsPrognosticGroupingRelevant( domainObject.isIsPrognosticGroupingRelevant() );
		// PrognosticGroupingConfig
		valueObject.setPrognosticGroupingConfig(ims.clinicaladmin.vo.domain.PrognosticGroupingCongfigVoAssembler.create(map, domainObject.getPrognosticGroupingConfig()) );
		// TnmRequiresDiff
		valueObject.setTnmRequiresDiff( domainObject.isTnmRequiresDiff() );
		// TnmRequiresHisto
		valueObject.setTnmRequiresHisto( domainObject.isTnmRequiresHisto() );
		// TnmRequiresSMarkers
		valueObject.setTnmRequiresSMarkers( domainObject.isTnmRequiresSMarkers() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.TumourGroup extractTumourGroup(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObject) 
	{
		return 	extractTumourGroup(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.TumourGroup extractTumourGroup(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TumourGroup();
		ims.oncology.configuration.domain.objects.TumourGroup domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo ID_TumourGroup field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.TumourGroup();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TumourGroup());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.TumourGroup) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroup.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TumourGroup());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGroupName() != null && valueObject.getGroupName().equals(""))
		{
			valueObject.setGroupName(null);
		}
		domainObject.setGroupName(valueObject.getGroupName());
		domainObject.setSites(ims.clinicaladmin.vo.domain.TumourSiteLiteVoAssembler.extractTumourSiteList(domainFactory, valueObject.getSites(), domainObject.getSites(), domMap));		
		domainObject.setTnmRequiresOver45(valueObject.getTnmRequiresOver45());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setTNMValues(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValueList(domainFactory, valueObject.getTNMValues(), domainObject.getTNMValues(), domMap));		
		domainObject.setSerumMarkers(ims.clinicaladmin.vo.domain.TumourSerumMarkersVoAssembler.extractTumourSerumMarkerSet(domainFactory, valueObject.getSerumMarkers(), domainObject.getSerumMarkers(), domMap));		
		domainObject.setOtherClassifications(ims.oncology.vo.domain.TumourGroupClassificationVoAssembler.extractTumourGroupClassificationSet(domainFactory, valueObject.getOtherClassifications(), domainObject.getOtherClassifications(), domMap));		
		domainObject.setAssociatedSpecialties(ims.oncology.vo.domain.TumourGroupSpecialtyVoAssembler.extractTumourGroupSpecialtySet(domainFactory, valueObject.getAssociatedSpecialties(), domainObject.getAssociatedSpecialties(), domMap));		
		domainObject.setHasTNM(valueObject.getHasTNM());

		// SaveAsRefVO treated as RefValueObject
		ims.oncology.configuration.vo.TumourGroupHistologyRefVoCollection refCollection10 = new ims.oncology.configuration.vo.TumourGroupHistologyRefVoCollection();
		if (valueObject.getHistologies() != null)
		{
			for (int i10=0; i10<valueObject.getHistologies().size(); i10++)
			{
				ims.oncology.configuration.vo.TumourGroupHistologyRefVo ref10 = (ims.oncology.configuration.vo.TumourGroupHistologyRefVo)valueObject.getHistologies().get(i10);
				refCollection10.add(ref10);
			}
		}
		int size10 = (null == refCollection10) ? 0 : refCollection10.size();		
		java.util.List domainHistologies10 = domainObject.getHistologies();
		if (domainHistologies10 == null)
		{
			domainHistologies10 = new java.util.ArrayList();
		}
		for(int i=0; i < size10; i++) 
		{
			ims.oncology.configuration.vo.TumourGroupHistologyRefVo vo = refCollection10.get(i);			
			ims.oncology.configuration.domain.objects.TumourGroupHistology dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.TumourGroupHistology)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.TumourGroupHistology)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.TumourGroupHistology.class, vo.getBoId());
				}
			}

			int domIdx = domainHistologies10.indexOf(dom);
			if (domIdx == -1)
			{
				domainHistologies10.add(i, dom);
			}
			else if (i != domIdx && i < domainHistologies10.size())
			{
				Object tmp = domainHistologies10.get(i);
				domainHistologies10.set(i, domainHistologies10.get(domIdx));
				domainHistologies10.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i10 = domainHistologies10.size();
		while (i10 > size10)
		{
			domainHistologies10.remove(i10-1);
			i10 = domainHistologies10.size();
		}
		
		domainObject.setHistologies(domainHistologies10);		
		domainObject.setHistopathologicGrades(ims.clinicaladmin.vo.domain.TumourGroupHistopathologyGradeVoAssembler.extractTumourGroupHistopathologicGradeSet(domainFactory, valueObject.getHistopathologicGrades(), domainObject.getHistopathologicGrades(), domMap));		
		ims.assessment.configuration.domain.objects.UserAssessment value12 = null;
		if ( null != valueObject.getAssessment() ) 
		{
			if (valueObject.getAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssessment()) != null)
				{
					value12 = (ims.assessment.configuration.domain.objects.UserAssessment)domMap.get(valueObject.getAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getAssessment();	
			}
			else
			{
				value12 = (ims.assessment.configuration.domain.objects.UserAssessment)domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.UserAssessment.class, valueObject.getAssessment().getBoId());
			}
		}
		domainObject.setAssessment(value12);
		domainObject.setIsPrognosticGroupingRelevant(valueObject.getIsPrognosticGroupingRelevant());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.PrognosticGroupingConfig value14 = null;
		if ( null != valueObject.getPrognosticGroupingConfig() ) 
		{
			if (valueObject.getPrognosticGroupingConfig().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrognosticGroupingConfig()) != null)
				{
					value14 = (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig)domMap.get(valueObject.getPrognosticGroupingConfig());
				}
			}
			else
			{
				value14 = (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticGroupingConfig.class, valueObject.getPrognosticGroupingConfig().getBoId());
			}
		}
		domainObject.setPrognosticGroupingConfig(value14);
		domainObject.setTnmRequiresDiff(valueObject.getTnmRequiresDiff());
		domainObject.setTnmRequiresHisto(valueObject.getTnmRequiresHisto());
		domainObject.setTnmRequiresSMarkers(valueObject.getTnmRequiresSMarkers());

		return domainObject;
	}

}
