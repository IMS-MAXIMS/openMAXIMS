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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class InvestigationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.InvestigationVo copy(ims.ocrr.vo.InvestigationVo valueObjectDest, ims.ocrr.vo.InvestigationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Investigation(valueObjectSrc.getID_Investigation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Colour
		valueObjectDest.setColour(valueObjectSrc.getColour());
		// ProviderInvCode
		valueObjectDest.setProviderInvCode(valueObjectSrc.getProviderInvCode());
		// PathInvDetails
		valueObjectDest.setPathInvDetails(valueObjectSrc.getPathInvDetails());
		// ClinImagInvDetails
		valueObjectDest.setClinImagInvDetails(valueObjectSrc.getClinImagInvDetails());
		// AssocQuestions
		valueObjectDest.setAssocQuestions(valueObjectSrc.getAssocQuestions());
		// HelpText
		valueObjectDest.setHelpText(valueObjectSrc.getHelpText());
		// ProviderService
		valueObjectDest.setProviderService(valueObjectSrc.getProviderService());
		// AssocInvestigations
		valueObjectDest.setAssocInvestigations(valueObjectSrc.getAssocInvestigations());
		// SeparateOrder
		valueObjectDest.setSeparateOrder(valueObjectSrc.getSeparateOrder());
		// IsAddon
		valueObjectDest.setIsAddon(valueObjectSrc.getIsAddon());
		// MinReorderPeriodVal
		valueObjectDest.setMinReorderPeriodVal(valueObjectSrc.getMinReorderPeriodVal());
		// MinReorderPeriodUnit
		valueObjectDest.setMinReorderPeriodUnit(valueObjectSrc.getMinReorderPeriodUnit());
		// FemaleMinReorderPeriodVal
		valueObjectDest.setFemaleMinReorderPeriodVal(valueObjectSrc.getFemaleMinReorderPeriodVal());
		// FemaleMinReorderPeriodUnit
		valueObjectDest.setFemaleMinReorderPeriodUnit(valueObjectSrc.getFemaleMinReorderPeriodUnit());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// NoLabelSets
		valueObjectDest.setNoLabelSets(valueObjectSrc.getNoLabelSets());
		// TurnaroundMeasure
		valueObjectDest.setTurnaroundMeasure(valueObjectSrc.getTurnaroundMeasure());
		// ExpectedTurnaround
		valueObjectDest.setExpectedTurnaround(valueObjectSrc.getExpectedTurnaround());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// InvestigationIndex
		valueObjectDest.setInvestigationIndex(valueObjectSrc.getInvestigationIndex());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInvestigationVoCollectionFromInvestigation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationVoCollection createInvestigationVoCollectionFromInvestigation(java.util.Set domainObjectSet)	
	{
		return createInvestigationVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationVoCollection createInvestigationVoCollectionFromInvestigation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.InvestigationVoCollection voList = new ims.ocrr.vo.InvestigationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) iterator.next();
			ims.ocrr.vo.InvestigationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationVoCollection createInvestigationVoCollectionFromInvestigation(java.util.List domainObjectList) 
	{
		return createInvestigationVoCollectionFromInvestigation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.Investigation objects.
	 */
	public static ims.ocrr.vo.InvestigationVoCollection createInvestigationVoCollectionFromInvestigation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.InvestigationVoCollection voList = new ims.ocrr.vo.InvestigationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.Investigation domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainObjectList.get(i);
			ims.ocrr.vo.InvestigationVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationVoCollection voCollection) 
	 {
	 	return extractInvestigationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInvestigationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestigationVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.Investigation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationVoCollection voCollection) 
	 {
	 	return extractInvestigationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInvestigationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.Investigation domainObject = InvestigationVoAssembler.extractInvestigation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationVo create(ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.Investigation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.InvestigationVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.InvestigationVo valueObject = (ims.ocrr.vo.InvestigationVo) map.getValueObject(domainObject, ims.ocrr.vo.InvestigationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.InvestigationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationVo insert(ims.ocrr.vo.InvestigationVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.Investigation
	 */
	 public static ims.ocrr.vo.InvestigationVo insert(DomainObjectMap map, ims.ocrr.vo.InvestigationVo valueObject, ims.ocrr.configuration.domain.objects.Investigation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Investigation(domainObject.getId());
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
			
		// Colour
		valueObject.setColour(domainObject.getColour());
		// ProviderInvCode
		valueObject.setProviderInvCode(domainObject.getProviderInvCode());
		// PathInvDetails
		valueObject.setPathInvDetails(ims.ocrr.vo.domain.PathInvDetailsVoAssembler.create(map, domainObject.getPathInvDetails()) );
		// ClinImagInvDetails
		valueObject.setClinImagInvDetails(ims.ocrr.vo.domain.ClinImagInvDetailsVoAssembler.create(map, domainObject.getClinImagInvDetails()) );
		// AssocQuestions
		valueObject.setAssocQuestions(ims.ocrr.vo.domain.InvestigationQuestionVoAssembler.createInvestigationQuestionVoCollectionFromInvestigationQuestion(map, domainObject.getAssocQuestions()) );
		// HelpText
		valueObject.setHelpText(ims.ocrr.vo.domain.HelpTextVoAssembler.createHelpTextVoCollectionFromHelpText(map, domainObject.getHelpText()) );
		// ProviderService
		valueObject.setProviderService(ims.ocrr.vo.domain.LocSvcProviderSysVoAssembler.create(map, domainObject.getProviderService()) );
		// AssocInvestigations
		valueObject.setAssocInvestigations(ims.ocrr.vo.domain.InvestShortVoAssembler.createInvestShortVoCollectionFromInvestigation(map, domainObject.getAssocInvestigations()) );
		// SeparateOrder
		valueObject.setSeparateOrder( domainObject.isSeparateOrder() );
		// IsAddon
		valueObject.setIsAddon( domainObject.isIsAddon() );
		// MinReorderPeriodVal
		valueObject.setMinReorderPeriodVal(domainObject.getMinReorderPeriodVal());
		// MinReorderPeriodUnit
		ims.domain.lookups.LookupInstance instance12 = domainObject.getMinReorderPeriodUnit();
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

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup12 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setMinReorderPeriodUnit(voLookup12);
		}
				// FemaleMinReorderPeriodVal
		valueObject.setFemaleMinReorderPeriodVal(domainObject.getFemaleMinReorderPeriodVal());
		// FemaleMinReorderPeriodUnit
		ims.domain.lookups.LookupInstance instance14 = domainObject.getFemaleMinReorderPeriodUnit();
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

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup14 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setFemaleMinReorderPeriodUnit(voLookup14);
		}
				// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// Type
		ims.domain.lookups.LookupInstance instance16 = domainObject.getType();
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

			ims.ocrr.vo.lookups.InvType voLookup16 = new ims.ocrr.vo.lookups.InvType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.ocrr.vo.lookups.InvType parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.ocrr.vo.lookups.InvType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setType(voLookup16);
		}
				// EventType
		ims.domain.lookups.LookupInstance instance17 = domainObject.getEventType();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.InvEventType voLookup17 = new ims.ocrr.vo.lookups.InvEventType(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.ocrr.vo.lookups.InvEventType parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.ocrr.vo.lookups.InvEventType(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setEventType(voLookup17);
		}
				// NoLabelSets
		valueObject.setNoLabelSets(domainObject.getNoLabelSets());
		// TurnaroundMeasure
		ims.domain.lookups.LookupInstance instance19 = domainObject.getTurnaroundMeasure();
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

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup19 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setTurnaroundMeasure(voLookup19);
		}
				// ExpectedTurnaround
		valueObject.setExpectedTurnaround(domainObject.getExpectedTurnaround());
		// ActiveStatus
		ims.domain.lookups.LookupInstance instance21 = domainObject.getActiveStatus();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup21 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setActiveStatus(voLookup21);
		}
				// InvestigationIndex
		valueObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexVoAssembler.create(map, domainObject.getInvestigationIndex()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationVo valueObject) 
	{
		return 	extractInvestigation(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.Investigation extractInvestigation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Investigation();
		ims.ocrr.configuration.domain.objects.Investigation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(valueObject);
			}
			// ims.ocrr.vo.InvestigationVo ID_Investigation field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.Investigation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Investigation());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.Investigation)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.Investigation) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.Investigation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Investigation());

		domainObject.setColour(valueObject.getColour());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProviderInvCode() != null && valueObject.getProviderInvCode().equals(""))
		{
			valueObject.setProviderInvCode(null);
		}
		domainObject.setProviderInvCode(valueObject.getProviderInvCode());
		domainObject.setPathInvDetails(ims.ocrr.vo.domain.PathInvDetailsVoAssembler.extractPathInvDetails(domainFactory, valueObject.getPathInvDetails(), domMap));
		domainObject.setClinImagInvDetails(ims.ocrr.vo.domain.ClinImagInvDetailsVoAssembler.extractClinImagInvDetails(domainFactory, valueObject.getClinImagInvDetails(), domMap));
		domainObject.setAssocQuestions(ims.ocrr.vo.domain.InvestigationQuestionVoAssembler.extractInvestigationQuestionList(domainFactory, valueObject.getAssocQuestions(), domainObject.getAssocQuestions(), domMap));		
		domainObject.setHelpText(ims.ocrr.vo.domain.HelpTextVoAssembler.extractHelpTextList(domainFactory, valueObject.getHelpText(), domainObject.getHelpText(), domMap));		
		domainObject.setProviderService(ims.ocrr.vo.domain.LocSvcProviderSysVoAssembler.extractLocSvcProviderSys(domainFactory, valueObject.getProviderService(), domMap));
		domainObject.setAssocInvestigations(ims.ocrr.vo.domain.InvestShortVoAssembler.extractInvestigationSet(domainFactory, valueObject.getAssocInvestigations(), domainObject.getAssocInvestigations(), domMap));		
		domainObject.setSeparateOrder(valueObject.getSeparateOrder());
		domainObject.setIsAddon(valueObject.getIsAddon());
		domainObject.setMinReorderPeriodVal(valueObject.getMinReorderPeriodVal());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getMinReorderPeriodUnit() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getMinReorderPeriodUnit().getID());
		}
		domainObject.setMinReorderPeriodUnit(value12);
		domainObject.setFemaleMinReorderPeriodVal(valueObject.getFemaleMinReorderPeriodVal());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getFemaleMinReorderPeriodUnit() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getFemaleMinReorderPeriodUnit().getID());
		}
		domainObject.setFemaleMinReorderPeriodUnit(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value17);
		domainObject.setNoLabelSets(valueObject.getNoLabelSets());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getTurnaroundMeasure() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getTurnaroundMeasure().getID());
		}
		domainObject.setTurnaroundMeasure(value19);
		domainObject.setExpectedTurnaround(valueObject.getExpectedTurnaround());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value21);
		domainObject.setInvestigationIndex(ims.ocrr.vo.domain.InvestigationIndexVoAssembler.extractInvestigationIndex(domainFactory, valueObject.getInvestigationIndex(), domMap));

		return domainObject;
	}

}
