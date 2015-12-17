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
 * @author Rory Fitzpatrick
 */
public class PathologyDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.PathologyDetailsVo copy(ims.clinicaladmin.vo.PathologyDetailsVo valueObjectDest, ims.clinicaladmin.vo.PathologyDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PathologyDetails(valueObjectSrc.getID_PathologyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InvasiveLesionSize
		valueObjectDest.setInvasiveLesionSize(valueObjectSrc.getInvasiveLesionSize());
		// SynchronousTumourIndicator
		valueObjectDest.setSynchronousTumourIndicator(valueObjectSrc.getSynchronousTumourIndicator());
		// Histology
		valueObjectDest.setHistology(valueObjectSrc.getHistology());
		// VascularLymphInvasion
		valueObjectDest.setVascularLymphInvasion(valueObjectSrc.getVascularLymphInvasion());
		// ExcisionMargin
		valueObjectDest.setExcisionMargin(valueObjectSrc.getExcisionMargin());
		// NumberNodesExamined
		valueObjectDest.setNumberNodesExamined(valueObjectSrc.getNumberNodesExamined());
		// NodesPositiveNumber
		valueObjectDest.setNodesPositiveNumber(valueObjectSrc.getNodesPositiveNumber());
		// PathologicalTVal
		valueObjectDest.setPathologicalTVal(valueObjectSrc.getPathologicalTVal());
		// PathologicalNVal
		valueObjectDest.setPathologicalNVal(valueObjectSrc.getPathologicalNVal());
		// PathologicalMVal
		valueObjectDest.setPathologicalMVal(valueObjectSrc.getPathologicalMVal());
		// PathologicalOverall
		valueObjectDest.setPathologicalOverall(valueObjectSrc.getPathologicalOverall());
		// ServiceReportId
		valueObjectDest.setServiceReportId(valueObjectSrc.getServiceReportId());
		// ServiceReportStatus
		valueObjectDest.setServiceReportStatus(valueObjectSrc.getServiceReportStatus());
		// SpecimenNature
		valueObjectDest.setSpecimenNature(valueObjectSrc.getSpecimenNature());
		// OrgaCodeRequester
		valueObjectDest.setOrgaCodeRequester(valueObjectSrc.getOrgaCodeRequester());
		// CareProfCodeRequester
		valueObjectDest.setCareProfCodeRequester(valueObjectSrc.getCareProfCodeRequester());
		// TCategoryExtended
		valueObjectDest.setTCategoryExtended(valueObjectSrc.getTCategoryExtended());
		// MCategoryExtended
		valueObjectDest.setMCategoryExtended(valueObjectSrc.getMCategoryExtended());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// AssociatedQuestions
		valueObjectDest.setAssociatedQuestions(valueObjectSrc.getAssociatedQuestions());
		// AssociatiatedTumourDetails
		valueObjectDest.setAssociatiatedTumourDetails(valueObjectSrc.getAssociatiatedTumourDetails());
		// GradeOfDifferentation
		valueObjectDest.setGradeOfDifferentation(valueObjectSrc.getGradeOfDifferentation());
		// InvestigationType
		valueObjectDest.setInvestigationType(valueObjectSrc.getInvestigationType());
		// SampleReceiptDate
		valueObjectDest.setSampleReceiptDate(valueObjectSrc.getSampleReceiptDate());
		// InvestigationResultDate
		valueObjectDest.setInvestigationResultDate(valueObjectSrc.getInvestigationResultDate());
		// ReportingConsultantCode
		valueObjectDest.setReportingConsultantCode(valueObjectSrc.getReportingConsultantCode());
		// ReportingOrganisation
		valueObjectDest.setReportingOrganisation(valueObjectSrc.getReportingOrganisation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// PreviousVersion
		valueObjectDest.setPreviousVersion(valueObjectSrc.getPreviousVersion());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathologyDetailsVoCollectionFromPathologyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PathologyDetails objects.
	 */
	public static ims.clinicaladmin.vo.PathologyDetailsVoCollection createPathologyDetailsVoCollectionFromPathologyDetails(java.util.Set domainObjectSet)	
	{
		return createPathologyDetailsVoCollectionFromPathologyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PathologyDetails objects.
	 */
	public static ims.clinicaladmin.vo.PathologyDetailsVoCollection createPathologyDetailsVoCollectionFromPathologyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.PathologyDetailsVoCollection voList = new ims.clinicaladmin.vo.PathologyDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.PathologyDetails domainObject = (ims.oncology.domain.objects.PathologyDetails) iterator.next();
			ims.clinicaladmin.vo.PathologyDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.PathologyDetails objects.
	 */
	public static ims.clinicaladmin.vo.PathologyDetailsVoCollection createPathologyDetailsVoCollectionFromPathologyDetails(java.util.List domainObjectList) 
	{
		return createPathologyDetailsVoCollectionFromPathologyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PathologyDetails objects.
	 */
	public static ims.clinicaladmin.vo.PathologyDetailsVoCollection createPathologyDetailsVoCollectionFromPathologyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.PathologyDetailsVoCollection voList = new ims.clinicaladmin.vo.PathologyDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PathologyDetails domainObject = (ims.oncology.domain.objects.PathologyDetails) domainObjectList.get(i);
			ims.clinicaladmin.vo.PathologyDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.PathologyDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPathologyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PathologyDetailsVoCollection voCollection) 
	 {
	 	return extractPathologyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPathologyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PathologyDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.PathologyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PathologyDetails domainObject = PathologyDetailsVoAssembler.extractPathologyDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.PathologyDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPathologyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PathologyDetailsVoCollection voCollection) 
	 {
	 	return extractPathologyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPathologyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PathologyDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.PathologyDetailsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PathologyDetails domainObject = PathologyDetailsVoAssembler.extractPathologyDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.PathologyDetails object.
	 * @param domainObject ims.oncology.domain.objects.PathologyDetails
	 */
	 public static ims.clinicaladmin.vo.PathologyDetailsVo create(ims.oncology.domain.objects.PathologyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.PathologyDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.PathologyDetailsVo create(DomainObjectMap map, ims.oncology.domain.objects.PathologyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.PathologyDetailsVo valueObject = (ims.clinicaladmin.vo.PathologyDetailsVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.PathologyDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.PathologyDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.PathologyDetails
	 */
	 public static ims.clinicaladmin.vo.PathologyDetailsVo insert(ims.clinicaladmin.vo.PathologyDetailsVo valueObject, ims.oncology.domain.objects.PathologyDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.PathologyDetails
	 */
	 public static ims.clinicaladmin.vo.PathologyDetailsVo insert(DomainObjectMap map, ims.clinicaladmin.vo.PathologyDetailsVo valueObject, ims.oncology.domain.objects.PathologyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PathologyDetails(domainObject.getId());
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
			
		// InvasiveLesionSize
		valueObject.setInvasiveLesionSize(domainObject.getInvasiveLesionSize());
		// SynchronousTumourIndicator
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSynchronousTumourIndicator();
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

			ims.oncology.vo.lookups.SynchronousTumourIndicator voLookup2 = new ims.oncology.vo.lookups.SynchronousTumourIndicator(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.oncology.vo.lookups.SynchronousTumourIndicator parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.oncology.vo.lookups.SynchronousTumourIndicator(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSynchronousTumourIndicator(voLookup2);
		}
				// Histology
		valueObject.setHistology(ims.clinicaladmin.vo.domain.TumourHistologyLiteVoAssembler.createTumourHistologyLiteVoCollectionFromTumourHistology(map, domainObject.getHistology()) );
		// VascularLymphInvasion
		ims.domain.lookups.LookupInstance instance4 = domainObject.getVascularLymphInvasion();
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

			ims.oncology.vo.lookups.VascularLymphInvasion voLookup4 = new ims.oncology.vo.lookups.VascularLymphInvasion(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.VascularLymphInvasion parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.VascularLymphInvasion(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setVascularLymphInvasion(voLookup4);
		}
				// ExcisionMargin
		ims.domain.lookups.LookupInstance instance5 = domainObject.getExcisionMargin();
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

			ims.oncology.vo.lookups.ExcisionMargin voLookup5 = new ims.oncology.vo.lookups.ExcisionMargin(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.ExcisionMargin parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.ExcisionMargin(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setExcisionMargin(voLookup5);
		}
				// NumberNodesExamined
		valueObject.setNumberNodesExamined(domainObject.getNumberNodesExamined());
		// NodesPositiveNumber
		valueObject.setNodesPositiveNumber(domainObject.getNodesPositiveNumber());
		// PathologicalTVal
		valueObject.setPathologicalTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.create(map, domainObject.getPathologicalTVal()) );
		// PathologicalNVal
		valueObject.setPathologicalNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.create(map, domainObject.getPathologicalNVal()) );
		// PathologicalMVal
		valueObject.setPathologicalMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.create(map, domainObject.getPathologicalMVal()) );
		// PathologicalOverall
		valueObject.setPathologicalOverall(ims.clinicaladmin.vo.domain.TumourGroupSiteOverallStagingVoAssembler.create(map, domainObject.getPathologicalOverall()) );
		// ServiceReportId
		valueObject.setServiceReportId(domainObject.getServiceReportId());
		// ServiceReportStatus
		ims.domain.lookups.LookupInstance instance13 = domainObject.getServiceReportStatus();
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

			ims.oncology.vo.lookups.ServiceReportStatus voLookup13 = new ims.oncology.vo.lookups.ServiceReportStatus(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.oncology.vo.lookups.ServiceReportStatus parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.oncology.vo.lookups.ServiceReportStatus(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setServiceReportStatus(voLookup13);
		}
				// SpecimenNature
		ims.domain.lookups.LookupInstance instance14 = domainObject.getSpecimenNature();
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

			ims.oncology.vo.lookups.SpecimenNature voLookup14 = new ims.oncology.vo.lookups.SpecimenNature(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.oncology.vo.lookups.SpecimenNature parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.oncology.vo.lookups.SpecimenNature(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setSpecimenNature(voLookup14);
		}
				// OrgaCodeRequester
		valueObject.setOrgaCodeRequester(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getOrgaCodeRequester()) );
		// CareProfCodeRequester
		valueObject.setCareProfCodeRequester((ims.core.vo.HcpLiteVo)ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getCareProfCodeRequester()) );
		// TCategoryExtended
		valueObject.setTCategoryExtended(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.createTumourGroupSiteTNMValueVoCollectionFromTumourGroupSiteTNMValue(map, domainObject.getTCategoryExtended()) );
		// MCategoryExtended
		valueObject.setMCategoryExtended(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.createTumourGroupSiteTNMValueVoCollectionFromTumourGroupSiteTNMValue(map, domainObject.getMCategoryExtended()) );
		// Status
		ims.domain.lookups.LookupInstance instance19 = domainObject.getStatus();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.HistopathologyReportStatus voLookup19 = new ims.oncology.vo.lookups.HistopathologyReportStatus(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.oncology.vo.lookups.HistopathologyReportStatus parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.oncology.vo.lookups.HistopathologyReportStatus(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setStatus(voLookup19);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// AssociatedQuestions
		valueObject.setAssociatedQuestions(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getAssociatedQuestions()) );
		// AssociatiatedTumourDetails
		valueObject.setAssociatiatedTumourDetails(ims.oncology.vo.domain.PrimaryTumourDetailsShortVoAssembler.create(map, domainObject.getAssociatiatedTumourDetails()) );
		// GradeOfDifferentation
		valueObject.setGradeOfDifferentation(ims.clinicaladmin.vo.domain.TumourGroupHistopathologyGradeVoAssembler.create(map, domainObject.getGradeOfDifferentation()) );
		// InvestigationType
		ims.domain.lookups.LookupInstance instance24 = domainObject.getInvestigationType();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.InvestigationType voLookup24 = new ims.oncology.vo.lookups.InvestigationType(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.oncology.vo.lookups.InvestigationType parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.oncology.vo.lookups.InvestigationType(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setInvestigationType(voLookup24);
		}
				// SampleReceiptDate
		java.util.Date SampleReceiptDate = domainObject.getSampleReceiptDate();
		if ( null != SampleReceiptDate ) 
		{
			valueObject.setSampleReceiptDate(new ims.framework.utils.Date(SampleReceiptDate) );
		}
		// InvestigationResultDate
		java.util.Date InvestigationResultDate = domainObject.getInvestigationResultDate();
		if ( null != InvestigationResultDate ) 
		{
			valueObject.setInvestigationResultDate(new ims.framework.utils.Date(InvestigationResultDate) );
		}
		// ReportingConsultantCode
		valueObject.setReportingConsultantCode((ims.core.vo.HcpLiteVo)ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReportingConsultantCode()) );
		// ReportingOrganisation
		valueObject.setReportingOrganisation(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getReportingOrganisation()) );
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
		// PreviousVersion
		if (domainObject.getPreviousVersion() != null)
		{
			if(domainObject.getPreviousVersion() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPreviousVersion();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPreviousVersion(new ims.oncology.vo.PathologyDetailsRefVo(id, -1));				
			}
			else
			{
				valueObject.setPreviousVersion(new ims.oncology.vo.PathologyDetailsRefVo(domainObject.getPreviousVersion().getId(), domainObject.getPreviousVersion().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.PathologyDetails extractPathologyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PathologyDetailsVo valueObject) 
	{
		return 	extractPathologyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PathologyDetails extractPathologyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PathologyDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PathologyDetails();
		ims.oncology.domain.objects.PathologyDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.PathologyDetails)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.PathologyDetailsVo ID_PathologyDetails field is unknown
			domainObject = new ims.oncology.domain.objects.PathologyDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PathologyDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.PathologyDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.PathologyDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.PathologyDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PathologyDetails());

		domainObject.setInvasiveLesionSize(valueObject.getInvasiveLesionSize());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSynchronousTumourIndicator() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSynchronousTumourIndicator().getID());
		}
		domainObject.setSynchronousTumourIndicator(value2);
		domainObject.setHistology(ims.clinicaladmin.vo.domain.TumourHistologyLiteVoAssembler.extractTumourHistologySet(domainFactory, valueObject.getHistology(), domainObject.getHistology(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getVascularLymphInvasion() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getVascularLymphInvasion().getID());
		}
		domainObject.setVascularLymphInvasion(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getExcisionMargin() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getExcisionMargin().getID());
		}
		domainObject.setExcisionMargin(value5);
		domainObject.setNumberNodesExamined(valueObject.getNumberNodesExamined());
		domainObject.setNodesPositiveNumber(valueObject.getNodesPositiveNumber());
		domainObject.setPathologicalTVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getPathologicalTVal(), domMap));
		domainObject.setPathologicalNVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getPathologicalNVal(), domMap));
		domainObject.setPathologicalMVal(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, valueObject.getPathologicalMVal(), domMap));
		domainObject.setPathologicalOverall(ims.clinicaladmin.vo.domain.TumourGroupSiteOverallStagingVoAssembler.extractTumourGroupSiteOverallStaging(domainFactory, valueObject.getPathologicalOverall(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServiceReportId() != null && valueObject.getServiceReportId().equals(""))
		{
			valueObject.setServiceReportId(null);
		}
		domainObject.setServiceReportId(valueObject.getServiceReportId());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getServiceReportStatus() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getServiceReportStatus().getID());
		}
		domainObject.setServiceReportStatus(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getSpecimenNature() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getSpecimenNature().getID());
		}
		domainObject.setSpecimenNature(value14);
		domainObject.setOrgaCodeRequester(ims.core.vo.domain.OrgLiteVoAssembler.extractOrganisation(domainFactory, valueObject.getOrgaCodeRequester(), domMap));
		domainObject.setCareProfCodeRequester(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, (ims.core.vo.HcpLiteVo)valueObject.getCareProfCodeRequester(), domMap));
		domainObject.setTCategoryExtended(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.extractTumourGroupSiteTNMValueSet(domainFactory, valueObject.getTCategoryExtended(), domainObject.getTCategoryExtended(), domMap));		
		domainObject.setMCategoryExtended(ims.clinicaladmin.vo.domain.TumourGroupSiteTNMValueVoAssembler.extractTumourGroupSiteTNMValueSet(domainFactory, valueObject.getMCategoryExtended(), domainObject.getMCategoryExtended(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value19);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setAssociatedQuestions(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getAssociatedQuestions(), domMap));
		domainObject.setAssociatiatedTumourDetails(ims.oncology.vo.domain.PrimaryTumourDetailsShortVoAssembler.extractPrimaryTumourDetails(domainFactory, valueObject.getAssociatiatedTumourDetails(), domMap));
		domainObject.setGradeOfDifferentation(ims.clinicaladmin.vo.domain.TumourGroupHistopathologyGradeVoAssembler.extractTumourGroupHistopathologicGrade(domainFactory, valueObject.getGradeOfDifferentation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getInvestigationType() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getInvestigationType().getID());
		}
		domainObject.setInvestigationType(value24);
		java.util.Date value25 = null;
		ims.framework.utils.Date date25 = valueObject.getSampleReceiptDate();		
		if ( date25 != null ) 
		{
			value25 = date25.getDate();
		}
		domainObject.setSampleReceiptDate(value25);
		java.util.Date value26 = null;
		ims.framework.utils.Date date26 = valueObject.getInvestigationResultDate();		
		if ( date26 != null ) 
		{
			value26 = date26.getDate();
		}
		domainObject.setInvestigationResultDate(value26);
		domainObject.setReportingConsultantCode(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, (ims.core.vo.HcpLiteVo)valueObject.getReportingConsultantCode(), domMap));
		domainObject.setReportingOrganisation(ims.core.vo.domain.OrgLiteVoAssembler.extractOrganisation(domainFactory, valueObject.getReportingOrganisation(), domMap));
		ims.core.admin.domain.objects.CareContext value29 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value29 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value29 = domainObject.getCareContext();	
			}
			else
			{
				value29 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value29);
		ims.oncology.domain.objects.PathologyDetails value30 = null;
		if ( null != valueObject.getPreviousVersion() ) 
		{
			if (valueObject.getPreviousVersion().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreviousVersion()) != null)
				{
					value30 = (ims.oncology.domain.objects.PathologyDetails)domMap.get(valueObject.getPreviousVersion());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value30 = domainObject.getPreviousVersion();	
			}
			else
			{
				value30 = (ims.oncology.domain.objects.PathologyDetails)domainFactory.getDomainObject(ims.oncology.domain.objects.PathologyDetails.class, valueObject.getPreviousVersion().getBoId());
			}
		}
		domainObject.setPreviousVersion(value30);

		return domainObject;
	}

}
