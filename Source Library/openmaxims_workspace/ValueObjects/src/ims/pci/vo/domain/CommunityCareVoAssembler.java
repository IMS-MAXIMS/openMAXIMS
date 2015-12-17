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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class CommunityCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.CommunityCareVo copy(ims.pci.vo.CommunityCareVo valueObjectDest, ims.pci.vo.CommunityCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CommunityCareDetail(valueObjectSrc.getID_CommunityCareDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Lho
		valueObjectDest.setLho(valueObjectSrc.getLho());
		// Sector
		valueObjectDest.setSector(valueObjectSrc.getSector());
		// RegisteredGp
		valueObjectDest.setRegisteredGp(valueObjectSrc.getRegisteredGp());
		// RegisteredGpSurgery
		valueObjectDest.setRegisteredGpSurgery(valueObjectSrc.getRegisteredGpSurgery());
		// PhnDistrict
		valueObjectDest.setPhnDistrict(valueObjectSrc.getPhnDistrict());
		// DED
		valueObjectDest.setDED(valueObjectSrc.getDED());
		// UserDefinedField1
		valueObjectDest.setUserDefinedField1(valueObjectSrc.getUserDefinedField1());
		// UserDefinedField2
		valueObjectDest.setUserDefinedField2(valueObjectSrc.getUserDefinedField2());
		// UserDefinedField3
		valueObjectDest.setUserDefinedField3(valueObjectSrc.getUserDefinedField3());
		// UserDefinedField4
		valueObjectDest.setUserDefinedField4(valueObjectSrc.getUserDefinedField4());
		// UserDefinedField5
		valueObjectDest.setUserDefinedField5(valueObjectSrc.getUserDefinedField5());
		// AddressHistory
		valueObjectDest.setAddressHistory(valueObjectSrc.getAddressHistory());
		// isExtracted
		valueObjectDest.setIsExtracted(valueObjectSrc.getIsExtracted());
		// CurrentSchool
		valueObjectDest.setCurrentSchool(valueObjectSrc.getCurrentSchool());
		// Cca
		valueObjectDest.setCca(valueObjectSrc.getCca());
		// GPRegistrationDate
		valueObjectDest.setGPRegistrationDate(valueObjectSrc.getGPRegistrationDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCommunityCareVoCollectionFromCommunityCareDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.CommunityCareDetail objects.
	 */
	public static ims.pci.vo.CommunityCareVoCollection createCommunityCareVoCollectionFromCommunityCareDetail(java.util.Set domainObjectSet)	
	{
		return createCommunityCareVoCollectionFromCommunityCareDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.CommunityCareDetail objects.
	 */
	public static ims.pci.vo.CommunityCareVoCollection createCommunityCareVoCollectionFromCommunityCareDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.CommunityCareVoCollection voList = new ims.pci.vo.CommunityCareVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.CommunityCareDetail domainObject = (ims.core.patient.domain.objects.CommunityCareDetail) iterator.next();
			ims.pci.vo.CommunityCareVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.CommunityCareDetail objects.
	 */
	public static ims.pci.vo.CommunityCareVoCollection createCommunityCareVoCollectionFromCommunityCareDetail(java.util.List domainObjectList) 
	{
		return createCommunityCareVoCollectionFromCommunityCareDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.CommunityCareDetail objects.
	 */
	public static ims.pci.vo.CommunityCareVoCollection createCommunityCareVoCollectionFromCommunityCareDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.CommunityCareVoCollection voList = new ims.pci.vo.CommunityCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.CommunityCareDetail domainObject = (ims.core.patient.domain.objects.CommunityCareDetail) domainObjectList.get(i);
			ims.pci.vo.CommunityCareVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.CommunityCareDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCommunityCareDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.CommunityCareVoCollection voCollection) 
	 {
	 	return extractCommunityCareDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCommunityCareDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.CommunityCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.CommunityCareVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.CommunityCareDetail domainObject = CommunityCareVoAssembler.extractCommunityCareDetail(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.CommunityCareDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCommunityCareDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.CommunityCareVoCollection voCollection) 
	 {
	 	return extractCommunityCareDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCommunityCareDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.CommunityCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.CommunityCareVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.CommunityCareDetail domainObject = CommunityCareVoAssembler.extractCommunityCareDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.CommunityCareDetail object.
	 * @param domainObject ims.core.patient.domain.objects.CommunityCareDetail
	 */
	 public static ims.pci.vo.CommunityCareVo create(ims.core.patient.domain.objects.CommunityCareDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.CommunityCareDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.CommunityCareVo create(DomainObjectMap map, ims.core.patient.domain.objects.CommunityCareDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.CommunityCareVo valueObject = (ims.pci.vo.CommunityCareVo) map.getValueObject(domainObject, ims.pci.vo.CommunityCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.CommunityCareVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.CommunityCareDetail
	 */
	 public static ims.pci.vo.CommunityCareVo insert(ims.pci.vo.CommunityCareVo valueObject, ims.core.patient.domain.objects.CommunityCareDetail domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.CommunityCareDetail
	 */
	 public static ims.pci.vo.CommunityCareVo insert(DomainObjectMap map, ims.pci.vo.CommunityCareVo valueObject, ims.core.patient.domain.objects.CommunityCareDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CommunityCareDetail(domainObject.getId());
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
			
		// Lho
		valueObject.setLho(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getLho()) );
		// Sector
		valueObject.setSector(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getSector()) );
		// RegisteredGp
		valueObject.setRegisteredGp(ims.core.vo.domain.GpLiteWithNameVoAssembler.create(map, domainObject.getRegisteredGp()) );
		// RegisteredGpSurgery
		if (domainObject.getRegisteredGpSurgery() != null)
		{
			if(domainObject.getRegisteredGpSurgery() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRegisteredGpSurgery();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRegisteredGpSurgery(new ims.core.resource.place.vo.LocSiteRefVo(id, -1));				
			}
			else
			{
				valueObject.setRegisteredGpSurgery(new ims.core.resource.place.vo.LocSiteRefVo(domainObject.getRegisteredGpSurgery().getId(), domainObject.getRegisteredGpSurgery().getVersion()));
			}
		}
		// PhnDistrict
		valueObject.setPhnDistrict(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getPhnDistrict()) );
		// DED
		valueObject.setDED(ims.core.vo.domain.DEDLiteVoAssembler.create(map, domainObject.getDED()) );
		// UserDefinedField1
		ims.domain.lookups.LookupInstance instance7 = domainObject.getUserDefinedField1();
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

			ims.pci.vo.lookups.UserDefinedType1 voLookup7 = new ims.pci.vo.lookups.UserDefinedType1(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.pci.vo.lookups.UserDefinedType1 parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.pci.vo.lookups.UserDefinedType1(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setUserDefinedField1(voLookup7);
		}
				// UserDefinedField2
		ims.domain.lookups.LookupInstance instance8 = domainObject.getUserDefinedField2();
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

			ims.pci.vo.lookups.UserDefinedType2 voLookup8 = new ims.pci.vo.lookups.UserDefinedType2(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.pci.vo.lookups.UserDefinedType2 parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.pci.vo.lookups.UserDefinedType2(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setUserDefinedField2(voLookup8);
		}
				// UserDefinedField3
		ims.domain.lookups.LookupInstance instance9 = domainObject.getUserDefinedField3();
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

			ims.pci.vo.lookups.UserDefinedType3 voLookup9 = new ims.pci.vo.lookups.UserDefinedType3(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.pci.vo.lookups.UserDefinedType3 parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.pci.vo.lookups.UserDefinedType3(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setUserDefinedField3(voLookup9);
		}
				// UserDefinedField4
		ims.domain.lookups.LookupInstance instance10 = domainObject.getUserDefinedField4();
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

			ims.pci.vo.lookups.UserDefinedType4 voLookup10 = new ims.pci.vo.lookups.UserDefinedType4(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.pci.vo.lookups.UserDefinedType4 parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.pci.vo.lookups.UserDefinedType4(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setUserDefinedField4(voLookup10);
		}
				// UserDefinedField5
		ims.domain.lookups.LookupInstance instance11 = domainObject.getUserDefinedField5();
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

			ims.pci.vo.lookups.UserDefinedType5 voLookup11 = new ims.pci.vo.lookups.UserDefinedType5(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.pci.vo.lookups.UserDefinedType5 parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.pci.vo.lookups.UserDefinedType5(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setUserDefinedField5(voLookup11);
		}
				// AddressHistory
		valueObject.setAddressHistory(ims.pci.vo.domain.PciAddressHistoryVoAssembler.createPciAddressHistoryVoCollectionFromPciAddressHistory(map, domainObject.getAddressHistory()) );
		// isExtracted
		valueObject.setIsExtracted( domainObject.isIsExtracted() );
		// CurrentSchool
		valueObject.setCurrentSchool(ims.core.vo.domain.SchoolShortVoAssembler.create(map, domainObject.getCurrentSchool()) );
		// Cca
		valueObject.setCca(ims.core.vo.domain.LocSiteLiteVoAssembler.create(map, domainObject.getCca()) );
		// GPRegistrationDate
		java.util.Date GPRegistrationDate = domainObject.getGPRegistrationDate();
		if ( null != GPRegistrationDate ) 
		{
			valueObject.setGPRegistrationDate(new ims.framework.utils.Date(GPRegistrationDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.CommunityCareDetail extractCommunityCareDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.CommunityCareVo valueObject) 
	{
		return 	extractCommunityCareDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.CommunityCareDetail extractCommunityCareDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.CommunityCareVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CommunityCareDetail();
		ims.core.patient.domain.objects.CommunityCareDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.CommunityCareDetail)domMap.get(valueObject);
			}
			// ims.pci.vo.CommunityCareVo ID_CommunityCareDetail field is unknown
			domainObject = new ims.core.patient.domain.objects.CommunityCareDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CommunityCareDetail());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.CommunityCareDetail)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.CommunityCareDetail) domainFactory.getDomainObject(ims.core.patient.domain.objects.CommunityCareDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CommunityCareDetail());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value1 = null;
		if ( null != valueObject.getLho() ) 
		{
			if (valueObject.getLho().getBoId() == null)
			{
				if (domMap.get(valueObject.getLho()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getLho());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getLho().getBoId());
			}
		}
		domainObject.setLho(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getSector() ) 
		{
			if (valueObject.getSector().getBoId() == null)
			{
				if (domMap.get(valueObject.getSector()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSector());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSector().getBoId());
			}
		}
		domainObject.setSector(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Gp value3 = null;
		if ( null != valueObject.getRegisteredGp() ) 
		{
			if (valueObject.getRegisteredGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getRegisteredGp()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getRegisteredGp());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getRegisteredGp().getBoId());
			}
		}
		domainObject.setRegisteredGp(value3);
		ims.core.resource.place.domain.objects.LocSite value4 = null;
		if ( null != valueObject.getRegisteredGpSurgery() ) 
		{
			if (valueObject.getRegisteredGpSurgery().getBoId() == null)
			{
				if (domMap.get(valueObject.getRegisteredGpSurgery()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.LocSite)domMap.get(valueObject.getRegisteredGpSurgery());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getRegisteredGpSurgery();	
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.LocSite)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocSite.class, valueObject.getRegisteredGpSurgery().getBoId());
			}
		}
		domainObject.setRegisteredGpSurgery(value4);
		domainObject.setPhnDistrict(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getPhnDistrict(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.DED value6 = null;
		if ( null != valueObject.getDED() ) 
		{
			if (valueObject.getDED().getBoId() == null)
			{
				if (domMap.get(valueObject.getDED()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.DED)domMap.get(valueObject.getDED());
				}
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.DED)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.DED.class, valueObject.getDED().getBoId());
			}
		}
		domainObject.setDED(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getUserDefinedField1() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getUserDefinedField1().getID());
		}
		domainObject.setUserDefinedField1(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getUserDefinedField2() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getUserDefinedField2().getID());
		}
		domainObject.setUserDefinedField2(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getUserDefinedField3() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getUserDefinedField3().getID());
		}
		domainObject.setUserDefinedField3(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getUserDefinedField4() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getUserDefinedField4().getID());
		}
		domainObject.setUserDefinedField4(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getUserDefinedField5() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getUserDefinedField5().getID());
		}
		domainObject.setUserDefinedField5(value11);
		domainObject.setAddressHistory(ims.pci.vo.domain.PciAddressHistoryVoAssembler.extractPciAddressHistoryList(domainFactory, valueObject.getAddressHistory(), domainObject.getAddressHistory(), domMap));		
		domainObject.setIsExtracted(valueObject.getIsExtracted());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.School value14 = null;
		if ( null != valueObject.getCurrentSchool() ) 
		{
			if (valueObject.getCurrentSchool().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentSchool()) != null)
				{
					value14 = (ims.core.resource.place.domain.objects.School)domMap.get(valueObject.getCurrentSchool());
				}
			}
			else
			{
				value14 = (ims.core.resource.place.domain.objects.School)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.School.class, valueObject.getCurrentSchool().getBoId());
			}
		}
		domainObject.setCurrentSchool(value14);
		domainObject.setCca(ims.core.vo.domain.LocSiteLiteVoAssembler.extractLocSite(domainFactory, valueObject.getCca(), domMap));
		java.util.Date value16 = null;
		ims.framework.utils.Date date16 = valueObject.getGPRegistrationDate();		
		if ( date16 != null ) 
		{
			value16 = date16.getDate();
		}
		domainObject.setGPRegistrationDate(value16);

		return domainObject;
	}

}
