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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class FinalCountsIntraOpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.FinalCountsIntraOpVo copy(ims.clinical.vo.FinalCountsIntraOpVo valueObjectDest, ims.clinical.vo.FinalCountsIntraOpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FinalCountIntraOp(valueObjectSrc.getID_FinalCountIntraOp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// SwabsAccountableItemscorrect
		valueObjectDest.setSwabsAccountableItemscorrect(valueObjectSrc.getSwabsAccountableItemscorrect());
		// InstrumentsCorrect
		valueObjectDest.setInstrumentsCorrect(valueObjectSrc.getInstrumentsCorrect());
		// SharpsOtherCorrectAndRemovedFromSet
		valueObjectDest.setSharpsOtherCorrectAndRemovedFromSet(valueObjectSrc.getSharpsOtherCorrectAndRemovedFromSet());
		// VerifiedBy1
		valueObjectDest.setVerifiedBy1(valueObjectSrc.getVerifiedBy1());
		// MissingItems
		valueObjectDest.setMissingItems(valueObjectSrc.getMissingItems());
		// OtherMissingItems
		valueObjectDest.setOtherMissingItems(valueObjectSrc.getOtherMissingItems());
		// ActionsTaken
		valueObjectDest.setActionsTaken(valueObjectSrc.getActionsTaken());
		// VerifiedBy2
		valueObjectDest.setVerifiedBy2(valueObjectSrc.getVerifiedBy2());
		// VerifiedBy
		valueObjectDest.setVerifiedBy(valueObjectSrc.getVerifiedBy());
		// OtherActionsTaken
		valueObjectDest.setOtherActionsTaken(valueObjectSrc.getOtherActionsTaken());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.FinalCountIntraOp objects.
	 */
	public static ims.clinical.vo.FinalCountsIntraOpVoCollection createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(java.util.Set domainObjectSet)	
	{
		return createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.FinalCountIntraOp objects.
	 */
	public static ims.clinical.vo.FinalCountsIntraOpVoCollection createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.FinalCountsIntraOpVoCollection voList = new ims.clinical.vo.FinalCountsIntraOpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.FinalCountIntraOp domainObject = (ims.clinical.domain.objects.FinalCountIntraOp) iterator.next();
			ims.clinical.vo.FinalCountsIntraOpVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.FinalCountIntraOp objects.
	 */
	public static ims.clinical.vo.FinalCountsIntraOpVoCollection createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(java.util.List domainObjectList) 
	{
		return createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.FinalCountIntraOp objects.
	 */
	public static ims.clinical.vo.FinalCountsIntraOpVoCollection createFinalCountsIntraOpVoCollectionFromFinalCountIntraOp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.FinalCountsIntraOpVoCollection voList = new ims.clinical.vo.FinalCountsIntraOpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.FinalCountIntraOp domainObject = (ims.clinical.domain.objects.FinalCountIntraOp) domainObjectList.get(i);
			ims.clinical.vo.FinalCountsIntraOpVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.FinalCountIntraOp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFinalCountIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.FinalCountsIntraOpVoCollection voCollection) 
	 {
	 	return extractFinalCountIntraOpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFinalCountIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.FinalCountsIntraOpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.FinalCountsIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.FinalCountIntraOp domainObject = FinalCountsIntraOpVoAssembler.extractFinalCountIntraOp(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.FinalCountIntraOp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFinalCountIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.FinalCountsIntraOpVoCollection voCollection) 
	 {
	 	return extractFinalCountIntraOpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFinalCountIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.FinalCountsIntraOpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.FinalCountsIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.FinalCountIntraOp domainObject = FinalCountsIntraOpVoAssembler.extractFinalCountIntraOp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.FinalCountIntraOp object.
	 * @param domainObject ims.clinical.domain.objects.FinalCountIntraOp
	 */
	 public static ims.clinical.vo.FinalCountsIntraOpVo create(ims.clinical.domain.objects.FinalCountIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.FinalCountIntraOp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.FinalCountsIntraOpVo create(DomainObjectMap map, ims.clinical.domain.objects.FinalCountIntraOp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.FinalCountsIntraOpVo valueObject = (ims.clinical.vo.FinalCountsIntraOpVo) map.getValueObject(domainObject, ims.clinical.vo.FinalCountsIntraOpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.FinalCountsIntraOpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.FinalCountIntraOp
	 */
	 public static ims.clinical.vo.FinalCountsIntraOpVo insert(ims.clinical.vo.FinalCountsIntraOpVo valueObject, ims.clinical.domain.objects.FinalCountIntraOp domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.FinalCountIntraOp
	 */
	 public static ims.clinical.vo.FinalCountsIntraOpVo insert(DomainObjectMap map, ims.clinical.vo.FinalCountsIntraOpVo valueObject, ims.clinical.domain.objects.FinalCountIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FinalCountIntraOp(domainObject.getId());
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
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.PatientProcedureMinVoAssembler.create(map, domainObject.getProcedure()) );
		// SwabsAccountableItemscorrect
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSwabsAccountableItemscorrect();
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

			ims.core.vo.lookups.YesNoNotApplicable voLookup3 = new ims.core.vo.lookups.YesNoNotApplicable(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoNotApplicable parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoNotApplicable(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSwabsAccountableItemscorrect(voLookup3);
		}
				// InstrumentsCorrect
		ims.domain.lookups.LookupInstance instance4 = domainObject.getInstrumentsCorrect();
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

			ims.core.vo.lookups.YesNoNotApplicable voLookup4 = new ims.core.vo.lookups.YesNoNotApplicable(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoNotApplicable parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNoNotApplicable(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setInstrumentsCorrect(voLookup4);
		}
				// SharpsOtherCorrectAndRemovedFromSet
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSharpsOtherCorrectAndRemovedFromSet();
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

			ims.core.vo.lookups.YesNoNotApplicable voLookup5 = new ims.core.vo.lookups.YesNoNotApplicable(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoNotApplicable parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNoNotApplicable(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSharpsOtherCorrectAndRemovedFromSet(voLookup5);
		}
				// VerifiedBy1
		valueObject.setVerifiedBy1(ims.core.vo.domain.NurseLiteVoAssembler.create(map, domainObject.getVerifiedBy1()) );
		// MissingItems
		java.util.List listMissingItems = domainObject.getMissingItems();
		ims.clinical.vo.lookups.FinalCountMissingItemCollection MissingItems = new ims.clinical.vo.lookups.FinalCountMissingItemCollection();
		for(java.util.Iterator iterator = listMissingItems.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.FinalCountMissingItem voInstance = new ims.clinical.vo.lookups.FinalCountMissingItem(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.FinalCountMissingItem parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.FinalCountMissingItem(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			MissingItems.add(voInstance);
		}
		valueObject.setMissingItems( MissingItems );
		// OtherMissingItems
		valueObject.setOtherMissingItems(domainObject.getOtherMissingItems());
		// ActionsTaken
		java.util.List listActionsTaken = domainObject.getActionsTaken();
		ims.clinical.vo.lookups.FinalCountActionsTakenCollection ActionsTaken = new ims.clinical.vo.lookups.FinalCountActionsTakenCollection();
		for(java.util.Iterator iterator = listActionsTaken.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.FinalCountActionsTaken voInstance = new ims.clinical.vo.lookups.FinalCountActionsTaken(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.FinalCountActionsTaken parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.FinalCountActionsTaken(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ActionsTaken.add(voInstance);
		}
		valueObject.setActionsTaken( ActionsTaken );
		// VerifiedBy2
		valueObject.setVerifiedBy2(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getVerifiedBy2()) );
		// VerifiedBy
		valueObject.setVerifiedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getVerifiedBy()) );
		// OtherActionsTaken
		valueObject.setOtherActionsTaken(domainObject.getOtherActionsTaken());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.FinalCountIntraOp extractFinalCountIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.FinalCountsIntraOpVo valueObject) 
	{
		return 	extractFinalCountIntraOp(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.FinalCountIntraOp extractFinalCountIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.FinalCountsIntraOpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FinalCountIntraOp();
		ims.clinical.domain.objects.FinalCountIntraOp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.FinalCountIntraOp)domMap.get(valueObject);
			}
			// ims.clinical.vo.FinalCountsIntraOpVo ID_FinalCountIntraOp field is unknown
			domainObject = new ims.clinical.domain.objects.FinalCountIntraOp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FinalCountIntraOp());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.FinalCountIntraOp)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.FinalCountIntraOp) domainFactory.getDomainObject(ims.clinical.domain.objects.FinalCountIntraOp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FinalCountIntraOp());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		domainObject.setProcedure(ims.core.vo.domain.PatientProcedureMinVoAssembler.extractPatientProcedure(domainFactory, valueObject.getProcedure(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSwabsAccountableItemscorrect() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSwabsAccountableItemscorrect().getID());
		}
		domainObject.setSwabsAccountableItemscorrect(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getInstrumentsCorrect() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getInstrumentsCorrect().getID());
		}
		domainObject.setInstrumentsCorrect(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSharpsOtherCorrectAndRemovedFromSet() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSharpsOtherCorrectAndRemovedFromSet().getID());
		}
		domainObject.setSharpsOtherCorrectAndRemovedFromSet(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value6 = null;
		if ( null != valueObject.getVerifiedBy1() ) 
		{
			if (valueObject.getVerifiedBy1().getBoId() == null)
			{
				if (domMap.get(valueObject.getVerifiedBy1()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getVerifiedBy1());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getVerifiedBy1().getBoId());
			}
		}
		domainObject.setVerifiedBy1(value6);
		ims.clinical.vo.lookups.FinalCountMissingItemCollection collection7 =
	valueObject.getMissingItems();
	    java.util.List domainMissingItems = domainObject.getMissingItems();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainMissingItems = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainMissingItems.indexOf(dom);
			if (domIdx == -1)
			{
				domainMissingItems.add(i, dom);
			}
			else if (i != domIdx && i < domainMissingItems.size())
			{
				Object tmp = domainMissingItems.get(i);
				domainMissingItems.set(i, domainMissingItems.get(domIdx));
				domainMissingItems.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainMissingItems.size();
		while (j7 > collection7Size)
		{
			domainMissingItems.remove(j7-1);
			j7 = domainMissingItems.size();
		}

		domainObject.setMissingItems(domainMissingItems);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherMissingItems() != null && valueObject.getOtherMissingItems().equals(""))
		{
			valueObject.setOtherMissingItems(null);
		}
		domainObject.setOtherMissingItems(valueObject.getOtherMissingItems());
		ims.clinical.vo.lookups.FinalCountActionsTakenCollection collection9 =
	valueObject.getActionsTaken();
	    java.util.List domainActionsTaken = domainObject.getActionsTaken();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainActionsTaken = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainActionsTaken.indexOf(dom);
			if (domIdx == -1)
			{
				domainActionsTaken.add(i, dom);
			}
			else if (i != domIdx && i < domainActionsTaken.size())
			{
				Object tmp = domainActionsTaken.get(i);
				domainActionsTaken.set(i, domainActionsTaken.get(domIdx));
				domainActionsTaken.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainActionsTaken.size();
		while (j9 > collection9Size)
		{
			domainActionsTaken.remove(j9-1);
			j9 = domainActionsTaken.size();
		}

		domainObject.setActionsTaken(domainActionsTaken);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getVerifiedBy2() ) 
		{
			if (valueObject.getVerifiedBy2().getBoId() == null)
			{
				if (domMap.get(valueObject.getVerifiedBy2()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getVerifiedBy2());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getVerifiedBy2().getBoId());
			}
		}
		domainObject.setVerifiedBy2(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getVerifiedBy() ) 
		{
			if (valueObject.getVerifiedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getVerifiedBy()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getVerifiedBy());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getVerifiedBy().getBoId());
			}
		}
		domainObject.setVerifiedBy(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherActionsTaken() != null && valueObject.getOtherActionsTaken().equals(""))
		{
			valueObject.setOtherActionsTaken(null);
		}
		domainObject.setOtherActionsTaken(valueObject.getOtherActionsTaken());

		return domainObject;
	}

}
