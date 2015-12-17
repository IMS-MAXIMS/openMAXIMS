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
public class InvestigationIndexVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.InvestigationIndexVo copy(ims.ocrr.vo.InvestigationIndexVo valueObjectDest, ims.ocrr.vo.InvestigationIndexVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InvestigationIndex(valueObjectSrc.getID_InvestigationIndex());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Investigations
		valueObjectDest.setInvestigations(valueObjectSrc.getInvestigations());
		// Synonyms
		valueObjectDest.setSynonyms(valueObjectSrc.getSynonyms());
		// TaxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// ShowLast
		valueObjectDest.setShowLast(valueObjectSrc.getShowLast());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// NoInterface
		valueObjectDest.setNoInterface(valueObjectSrc.getNoInterface());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Colour
		valueObjectDest.setColour(valueObjectSrc.getColour());
		// isProfile
		valueObjectDest.setIsProfile(valueObjectSrc.getIsProfile());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// GenderSpecific
		valueObjectDest.setGenderSpecific(valueObjectSrc.getGenderSpecific());
		// PhlebMayCollect
		valueObjectDest.setPhlebMayCollect(valueObjectSrc.getPhlebMayCollect());
		// RequiresSiteSpecifier
		valueObjectDest.setRequiresSiteSpecifier(valueObjectSrc.getRequiresSiteSpecifier());
		// Sites
		valueObjectDest.setSites(valueObjectSrc.getSites());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
		// Orderability
		valueObjectDest.setOrderability(valueObjectSrc.getOrderability());
		// SecurityLevel
		valueObjectDest.setSecurityLevel(valueObjectSrc.getSecurityLevel());
		// TimeSeriesInstructionsURL
		valueObjectDest.setTimeSeriesInstructionsURL(valueObjectSrc.getTimeSeriesInstructionsURL());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInvestigationIndexVoCollectionFromInvestigationIndex(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.InvestigationIndex objects.
	 */
	public static ims.ocrr.vo.InvestigationIndexVoCollection createInvestigationIndexVoCollectionFromInvestigationIndex(java.util.Set domainObjectSet)	
	{
		return createInvestigationIndexVoCollectionFromInvestigationIndex(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.InvestigationIndex objects.
	 */
	public static ims.ocrr.vo.InvestigationIndexVoCollection createInvestigationIndexVoCollectionFromInvestigationIndex(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.InvestigationIndexVoCollection voList = new ims.ocrr.vo.InvestigationIndexVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject = (ims.ocrr.configuration.domain.objects.InvestigationIndex) iterator.next();
			ims.ocrr.vo.InvestigationIndexVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.InvestigationIndex objects.
	 */
	public static ims.ocrr.vo.InvestigationIndexVoCollection createInvestigationIndexVoCollectionFromInvestigationIndex(java.util.List domainObjectList) 
	{
		return createInvestigationIndexVoCollectionFromInvestigationIndex(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.InvestigationIndex objects.
	 */
	public static ims.ocrr.vo.InvestigationIndexVoCollection createInvestigationIndexVoCollectionFromInvestigationIndex(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.InvestigationIndexVoCollection voList = new ims.ocrr.vo.InvestigationIndexVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject = (ims.ocrr.configuration.domain.objects.InvestigationIndex) domainObjectList.get(i);
			ims.ocrr.vo.InvestigationIndexVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.InvestigationIndex set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInvestigationIndexSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationIndexVoCollection voCollection) 
	 {
	 	return extractInvestigationIndexSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInvestigationIndexSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationIndexVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationIndexVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject = InvestigationIndexVoAssembler.extractInvestigationIndex(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.InvestigationIndex list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInvestigationIndexList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationIndexVoCollection voCollection) 
	 {
	 	return extractInvestigationIndexList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInvestigationIndexList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationIndexVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.InvestigationIndexVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject = InvestigationIndexVoAssembler.extractInvestigationIndex(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.InvestigationIndex object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.InvestigationIndex
	 */
	 public static ims.ocrr.vo.InvestigationIndexVo create(ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.InvestigationIndex object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.InvestigationIndexVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.InvestigationIndexVo valueObject = (ims.ocrr.vo.InvestigationIndexVo) map.getValueObject(domainObject, ims.ocrr.vo.InvestigationIndexVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.InvestigationIndexVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.InvestigationIndex
	 */
	 public static ims.ocrr.vo.InvestigationIndexVo insert(ims.ocrr.vo.InvestigationIndexVo valueObject, ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.InvestigationIndex
	 */
	 public static ims.ocrr.vo.InvestigationIndexVo insert(DomainObjectMap map, ims.ocrr.vo.InvestigationIndexVo valueObject, ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InvestigationIndex(domainObject.getId());
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
			
		// Investigations
		valueObject.setInvestigations(ims.ocrr.vo.domain.InvestigationVoAssembler.createInvestigationVoCollectionFromInvestigation(map, domainObject.getInvestigations()) );
		// Synonyms
		valueObject.setSynonyms(ims.ocrr.vo.domain.InvSynonymVoAssembler.createInvSynonymVoCollectionFromInvSynonym(map, domainObject.getSynonyms()) );
		// TaxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// ShowLast
		valueObject.setShowLast( domainObject.isShowLast() );
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityVoAssembler.create(map, domainObject.getActivity()) );
		// NoInterface
		valueObject.setNoInterface( domainObject.isNoInterface() );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Colour
		valueObject.setColour(domainObject.getColour());
		// isProfile
		valueObject.setIsProfile( domainObject.isIsProfile() );
		// ActiveStatus
		ims.domain.lookups.LookupInstance instance10 = domainObject.getActiveStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup10 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setActiveStatus(voLookup10);
		}
				// GenderSpecific
		ims.domain.lookups.LookupInstance instance11 = domainObject.getGenderSpecific();
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

			ims.admin.vo.lookups.GenderSpecific voLookup11 = new ims.admin.vo.lookups.GenderSpecific(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.admin.vo.lookups.GenderSpecific parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.admin.vo.lookups.GenderSpecific(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setGenderSpecific(voLookup11);
		}
				// PhlebMayCollect
		valueObject.setPhlebMayCollect( domainObject.isPhlebMayCollect() );
		// RequiresSiteSpecifier
		valueObject.setRequiresSiteSpecifier( domainObject.isRequiresSiteSpecifier() );
		// Sites
		java.util.List listSites = domainObject.getSites();
		ims.ocrr.vo.lookups.SpecimenSiteCollection Sites = new ims.ocrr.vo.lookups.SpecimenSiteCollection();
		for(java.util.Iterator iterator = listSites.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.ocrr.vo.lookups.SpecimenSite voInstance = new ims.ocrr.vo.lookups.SpecimenSite(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.ocrr.vo.lookups.SpecimenSite parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.ocrr.vo.lookups.SpecimenSite(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Sites.add(voInstance);
		}
		valueObject.setSites( Sites );
		// Name
		valueObject.setName(domainObject.getName());
		// Category
		ims.domain.lookups.LookupInstance instance16 = domainObject.getCategory();
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

			ims.ocrr.vo.lookups.Category voLookup16 = new ims.ocrr.vo.lookups.Category(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.ocrr.vo.lookups.Category parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.ocrr.vo.lookups.Category(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setCategory(voLookup16);
		}
				// Orderability
		ims.domain.lookups.LookupInstance instance17 = domainObject.getOrderability();
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

			ims.ocrr.vo.lookups.InvestigationOrderability voLookup17 = new ims.ocrr.vo.lookups.InvestigationOrderability(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.ocrr.vo.lookups.InvestigationOrderability parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.ocrr.vo.lookups.InvestigationOrderability(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setOrderability(voLookup17);
		}
				// SecurityLevel
		valueObject.setSecurityLevel(ims.ocrr.vo.domain.SecurityLevelConfigVoAssembler.create(map, domainObject.getSecurityLevel()) );
		// TimeSeriesInstructionsURL
		valueObject.setTimeSeriesInstructionsURL(domainObject.getTimeSeriesInstructionsURL());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.InvestigationIndex extractInvestigationIndex(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationIndexVo valueObject) 
	{
		return 	extractInvestigationIndex(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.InvestigationIndex extractInvestigationIndex(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.InvestigationIndexVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InvestigationIndex();
		ims.ocrr.configuration.domain.objects.InvestigationIndex domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.InvestigationIndex)domMap.get(valueObject);
			}
			// ims.ocrr.vo.InvestigationIndexVo ID_InvestigationIndex field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.InvestigationIndex();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InvestigationIndex());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.InvestigationIndex)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.InvestigationIndex) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.InvestigationIndex.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InvestigationIndex());

		domainObject.setInvestigations(ims.ocrr.vo.domain.InvestigationVoAssembler.extractInvestigationSet(domainFactory, valueObject.getInvestigations(), domainObject.getInvestigations(), domMap));		
		domainObject.setSynonyms(ims.ocrr.vo.domain.InvSynonymVoAssembler.extractInvSynonymSet(domainFactory, valueObject.getSynonyms(), domainObject.getSynonyms(), domMap));		
		domainObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getTaxonomyMap(), domainObject.getTaxonomyMap(), domMap));		
		domainObject.setShowLast(valueObject.getShowLast());
		domainObject.setActivity(ims.core.vo.domain.ActivityVoAssembler.extractActivity(domainFactory, valueObject.getActivity(), domMap));
		domainObject.setNoInterface(valueObject.getNoInterface());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setColour(valueObject.getColour());
		domainObject.setIsProfile(valueObject.getIsProfile());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getGenderSpecific() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getGenderSpecific().getID());
		}
		domainObject.setGenderSpecific(value11);
		domainObject.setPhlebMayCollect(valueObject.getPhlebMayCollect());
		domainObject.setRequiresSiteSpecifier(valueObject.getRequiresSiteSpecifier());
		ims.ocrr.vo.lookups.SpecimenSiteCollection collection14 =
	valueObject.getSites();
	    java.util.List domainSites = domainObject.getSites();;			
	    int collection14Size=0;
		if (collection14 == null)
		{
			domainSites = new java.util.ArrayList(0);
		}
		else
		{
			collection14Size = collection14.size();
		}
		
		for(int i=0; i<collection14Size; i++) 
		{
			int instanceId = collection14.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSites.indexOf(dom);
			if (domIdx == -1)
			{
				domainSites.add(i, dom);
			}
			else if (i != domIdx && i < domainSites.size())
			{
				Object tmp = domainSites.get(i);
				domainSites.set(i, domainSites.get(domIdx));
				domainSites.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j14 = domainSites.size();
		while (j14 > collection14Size)
		{
			domainSites.remove(j14-1);
			j14 = domainSites.size();
		}

		domainObject.setSites(domainSites);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getOrderability() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getOrderability().getID());
		}
		domainObject.setOrderability(value17);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.configuration.domain.objects.SecurityLevel value18 = null;
		if ( null != valueObject.getSecurityLevel() ) 
		{
			if (valueObject.getSecurityLevel().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecurityLevel()) != null)
				{
					value18 = (ims.ocrr.configuration.domain.objects.SecurityLevel)domMap.get(valueObject.getSecurityLevel());
				}
			}
			else
			{
				value18 = (ims.ocrr.configuration.domain.objects.SecurityLevel)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.SecurityLevel.class, valueObject.getSecurityLevel().getBoId());
			}
		}
		domainObject.setSecurityLevel(value18);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTimeSeriesInstructionsURL() != null && valueObject.getTimeSeriesInstructionsURL().equals(""))
		{
			valueObject.setTimeSeriesInstructionsURL(null);
		}
		domainObject.setTimeSeriesInstructionsURL(valueObject.getTimeSeriesInstructionsURL());

		return domainObject;
	}

}
