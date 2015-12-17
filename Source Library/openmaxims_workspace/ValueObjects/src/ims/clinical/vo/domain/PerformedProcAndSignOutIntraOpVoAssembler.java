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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PerformedProcAndSignOutIntraOpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVo copy(ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObjectDest, ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PerfProcAndSignOutIntraOp(valueObjectSrc.getID_PerfProcAndSignOutIntraOp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// Unplannedreturntotheatre
		valueObjectDest.setUnplannedreturntotheatre(valueObjectSrc.getUnplannedreturntotheatre());
		// ConfirmedCountsComplete
		valueObjectDest.setConfirmedCountsComplete(valueObjectSrc.getConfirmedCountsComplete());
		// AntibioticsAfterKnifeToSkin
		valueObjectDest.setAntibioticsAfterKnifeToSkin(valueObjectSrc.getAntibioticsAfterKnifeToSkin());
		// TimeIntraOpAntibioticsGiven
		valueObjectDest.setTimeIntraOpAntibioticsGiven(valueObjectSrc.getTimeIntraOpAntibioticsGiven());
		// AdministrationRecordCompleted
		valueObjectDest.setAdministrationRecordCompleted(valueObjectSrc.getAdministrationRecordCompleted());
		// AnySpecimensHaveBeenLabelled
		valueObjectDest.setAnySpecimensHaveBeenLabelled(valueObjectSrc.getAnySpecimensHaveBeenLabelled());
		// AnyEquipmentProblemsAddressed
		valueObjectDest.setAnyEquipmentProblemsAddressed(valueObjectSrc.getAnyEquipmentProblemsAddressed());
		// KeyConcernsDocumented
		valueObjectDest.setKeyConcernsDocumented(valueObjectSrc.getKeyConcernsDocumented());
		// SignatureByRegisteredPractitioner
		valueObjectDest.setSignatureByRegisteredPractitioner(valueObjectSrc.getSignatureByRegisteredPractitioner());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PerfProcAndSignOutIntraOp objects.
	 */
	public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(java.util.Set domainObjectSet)	
	{
		return createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PerfProcAndSignOutIntraOp objects.
	 */
	public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection voList = new ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject = (ims.clinical.domain.objects.PerfProcAndSignOutIntraOp) iterator.next();
			ims.clinical.vo.PerformedProcAndSignOutIntraOpVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PerfProcAndSignOutIntraOp objects.
	 */
	public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(java.util.List domainObjectList) 
	{
		return createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PerfProcAndSignOutIntraOp objects.
	 */
	public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection createPerformedProcAndSignOutIntraOpVoCollectionFromPerfProcAndSignOutIntraOp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection voList = new ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject = (ims.clinical.domain.objects.PerfProcAndSignOutIntraOp) domainObjectList.get(i);
			ims.clinical.vo.PerformedProcAndSignOutIntraOpVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PerfProcAndSignOutIntraOp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPerfProcAndSignOutIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection voCollection) 
	 {
	 	return extractPerfProcAndSignOutIntraOpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPerfProcAndSignOutIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PerformedProcAndSignOutIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject = PerformedProcAndSignOutIntraOpVoAssembler.extractPerfProcAndSignOutIntraOp(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PerfProcAndSignOutIntraOp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPerfProcAndSignOutIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection voCollection) 
	 {
	 	return extractPerfProcAndSignOutIntraOpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPerfProcAndSignOutIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PerformedProcAndSignOutIntraOpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PerformedProcAndSignOutIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject = PerformedProcAndSignOutIntraOpVoAssembler.extractPerfProcAndSignOutIntraOp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PerfProcAndSignOutIntraOp object.
	 * @param domainObject ims.clinical.domain.objects.PerfProcAndSignOutIntraOp
	 */
	 public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVo create(ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PerfProcAndSignOutIntraOp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVo create(DomainObjectMap map, ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObject = (ims.clinical.vo.PerformedProcAndSignOutIntraOpVo) map.getValueObject(domainObject, ims.clinical.vo.PerformedProcAndSignOutIntraOpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PerformedProcAndSignOutIntraOpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PerfProcAndSignOutIntraOp
	 */
	 public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVo insert(ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObject, ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PerfProcAndSignOutIntraOp
	 */
	 public static ims.clinical.vo.PerformedProcAndSignOutIntraOpVo insert(DomainObjectMap map, ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObject, ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PerfProcAndSignOutIntraOp(domainObject.getId());
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
		// Unplannedreturntotheatre
		valueObject.setUnplannedreturntotheatre( domainObject.isUnplannedreturntotheatre() );
		// ConfirmedCountsComplete
		valueObject.setConfirmedCountsComplete( domainObject.isConfirmedCountsComplete() );
		// AntibioticsAfterKnifeToSkin
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAntibioticsAfterKnifeToSkin();
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
			valueObject.setAntibioticsAfterKnifeToSkin(voLookup4);
		}
				// TimeIntraOpAntibioticsGiven
		java.util.Date TimeIntraOpAntibioticsGiven = domainObject.getTimeIntraOpAntibioticsGiven();
		if ( null != TimeIntraOpAntibioticsGiven ) 
		{
			valueObject.setTimeIntraOpAntibioticsGiven(new ims.framework.utils.DateTime(TimeIntraOpAntibioticsGiven) );
		}
		// AdministrationRecordCompleted
		valueObject.setAdministrationRecordCompleted( domainObject.isAdministrationRecordCompleted() );
		// AnySpecimensHaveBeenLabelled
		valueObject.setAnySpecimensHaveBeenLabelled( domainObject.isAnySpecimensHaveBeenLabelled() );
		// AnyEquipmentProblemsAddressed
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAnyEquipmentProblemsAddressed();
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

			ims.core.vo.lookups.YesNoNotApplicable voLookup8 = new ims.core.vo.lookups.YesNoNotApplicable(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoNotApplicable parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNoNotApplicable(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAnyEquipmentProblemsAddressed(voLookup8);
		}
				// KeyConcernsDocumented
		valueObject.setKeyConcernsDocumented( domainObject.isKeyConcernsDocumented() );
		// SignatureByRegisteredPractitioner
		valueObject.setSignatureByRegisteredPractitioner(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSignatureByRegisteredPractitioner()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PerfProcAndSignOutIntraOp extractPerfProcAndSignOutIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObject) 
	{
		return 	extractPerfProcAndSignOutIntraOp(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PerfProcAndSignOutIntraOp extractPerfProcAndSignOutIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PerformedProcAndSignOutIntraOpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PerfProcAndSignOutIntraOp();
		ims.clinical.domain.objects.PerfProcAndSignOutIntraOp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PerfProcAndSignOutIntraOp)domMap.get(valueObject);
			}
			// ims.clinical.vo.PerformedProcAndSignOutIntraOpVo ID_PerfProcAndSignOutIntraOp field is unknown
			domainObject = new ims.clinical.domain.objects.PerfProcAndSignOutIntraOp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PerfProcAndSignOutIntraOp());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PerfProcAndSignOutIntraOp)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PerfProcAndSignOutIntraOp) domainFactory.getDomainObject(ims.clinical.domain.objects.PerfProcAndSignOutIntraOp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PerfProcAndSignOutIntraOp());

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
		domainObject.setUnplannedreturntotheatre(valueObject.getUnplannedreturntotheatre());
		domainObject.setConfirmedCountsComplete(valueObject.getConfirmedCountsComplete());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAntibioticsAfterKnifeToSkin() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAntibioticsAfterKnifeToSkin().getID());
		}
		domainObject.setAntibioticsAfterKnifeToSkin(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getTimeIntraOpAntibioticsGiven();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setTimeIntraOpAntibioticsGiven(value5);
		domainObject.setAdministrationRecordCompleted(valueObject.getAdministrationRecordCompleted());
		domainObject.setAnySpecimensHaveBeenLabelled(valueObject.getAnySpecimensHaveBeenLabelled());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAnyEquipmentProblemsAddressed() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAnyEquipmentProblemsAddressed().getID());
		}
		domainObject.setAnyEquipmentProblemsAddressed(value8);
		domainObject.setKeyConcernsDocumented(valueObject.getKeyConcernsDocumented());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getSignatureByRegisteredPractitioner() ) 
		{
			if (valueObject.getSignatureByRegisteredPractitioner().getBoId() == null)
			{
				if (domMap.get(valueObject.getSignatureByRegisteredPractitioner()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSignatureByRegisteredPractitioner());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSignatureByRegisteredPractitioner().getBoId());
			}
		}
		domainObject.setSignatureByRegisteredPractitioner(value10);

		return domainObject;
	}

}
