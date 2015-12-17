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
public class SkinClosureIntraOpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SkinClosureIntraOpVo copy(ims.clinical.vo.SkinClosureIntraOpVo valueObjectDest, ims.clinical.vo.SkinClosureIntraOpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SkinClosureIntraOp(valueObjectSrc.getID_SkinClosureIntraOp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// PatientProcedure
		valueObjectDest.setPatientProcedure(valueObjectSrc.getPatientProcedure());
		// ProcedureWoundClass
		valueObjectDest.setProcedureWoundClass(valueObjectSrc.getProcedureWoundClass());
		// Other
		valueObjectDest.setOther(valueObjectSrc.getOther());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// SkinClosureType
		valueObjectDest.setSkinClosureType(valueObjectSrc.getSkinClosureType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SkinClosureIntraOp objects.
	 */
	public static ims.clinical.vo.SkinClosureIntraOpVoCollection createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(java.util.Set domainObjectSet)	
	{
		return createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SkinClosureIntraOp objects.
	 */
	public static ims.clinical.vo.SkinClosureIntraOpVoCollection createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SkinClosureIntraOpVoCollection voList = new ims.clinical.vo.SkinClosureIntraOpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SkinClosureIntraOp domainObject = (ims.clinical.domain.objects.SkinClosureIntraOp) iterator.next();
			ims.clinical.vo.SkinClosureIntraOpVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SkinClosureIntraOp objects.
	 */
	public static ims.clinical.vo.SkinClosureIntraOpVoCollection createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(java.util.List domainObjectList) 
	{
		return createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SkinClosureIntraOp objects.
	 */
	public static ims.clinical.vo.SkinClosureIntraOpVoCollection createSkinClosureIntraOpVoCollectionFromSkinClosureIntraOp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SkinClosureIntraOpVoCollection voList = new ims.clinical.vo.SkinClosureIntraOpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SkinClosureIntraOp domainObject = (ims.clinical.domain.objects.SkinClosureIntraOp) domainObjectList.get(i);
			ims.clinical.vo.SkinClosureIntraOpVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SkinClosureIntraOp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSkinClosureIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SkinClosureIntraOpVoCollection voCollection) 
	 {
	 	return extractSkinClosureIntraOpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSkinClosureIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SkinClosureIntraOpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SkinClosureIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SkinClosureIntraOp domainObject = SkinClosureIntraOpVoAssembler.extractSkinClosureIntraOp(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SkinClosureIntraOp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSkinClosureIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SkinClosureIntraOpVoCollection voCollection) 
	 {
	 	return extractSkinClosureIntraOpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSkinClosureIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SkinClosureIntraOpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SkinClosureIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SkinClosureIntraOp domainObject = SkinClosureIntraOpVoAssembler.extractSkinClosureIntraOp(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SkinClosureIntraOp object.
	 * @param domainObject ims.clinical.domain.objects.SkinClosureIntraOp
	 */
	 public static ims.clinical.vo.SkinClosureIntraOpVo create(ims.clinical.domain.objects.SkinClosureIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SkinClosureIntraOp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SkinClosureIntraOpVo create(DomainObjectMap map, ims.clinical.domain.objects.SkinClosureIntraOp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SkinClosureIntraOpVo valueObject = (ims.clinical.vo.SkinClosureIntraOpVo) map.getValueObject(domainObject, ims.clinical.vo.SkinClosureIntraOpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SkinClosureIntraOpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SkinClosureIntraOp
	 */
	 public static ims.clinical.vo.SkinClosureIntraOpVo insert(ims.clinical.vo.SkinClosureIntraOpVo valueObject, ims.clinical.domain.objects.SkinClosureIntraOp domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SkinClosureIntraOp
	 */
	 public static ims.clinical.vo.SkinClosureIntraOpVo insert(DomainObjectMap map, ims.clinical.vo.SkinClosureIntraOpVo valueObject, ims.clinical.domain.objects.SkinClosureIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SkinClosureIntraOp(domainObject.getId());
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
		// PatientProcedure
		valueObject.setPatientProcedure(ims.core.vo.domain.PatientProcedureMinVoAssembler.create(map, domainObject.getPatientProcedure()) );
		// ProcedureWoundClass
		ims.domain.lookups.LookupInstance instance3 = domainObject.getProcedureWoundClass();
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

			ims.core.vo.lookups.ProcedureWoundClass voLookup3 = new ims.core.vo.lookups.ProcedureWoundClass(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureWoundClass parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ProcedureWoundClass(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setProcedureWoundClass(voLookup3);
		}
				// Other
		valueObject.setOther( domainObject.isOther() );
		// Details
		valueObject.setDetails(domainObject.getDetails());
		// SkinClosureType
		java.util.List listSkinClosureType = domainObject.getSkinClosureType();
		ims.clinical.vo.lookups.SkinClosureTypeCollection SkinClosureType = new ims.clinical.vo.lookups.SkinClosureTypeCollection();
		for(java.util.Iterator iterator = listSkinClosureType.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.SkinClosureType voInstance = new ims.clinical.vo.lookups.SkinClosureType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.SkinClosureType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.SkinClosureType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			SkinClosureType.add(voInstance);
		}
		valueObject.setSkinClosureType( SkinClosureType );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SkinClosureIntraOp extractSkinClosureIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SkinClosureIntraOpVo valueObject) 
	{
		return 	extractSkinClosureIntraOp(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SkinClosureIntraOp extractSkinClosureIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SkinClosureIntraOpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SkinClosureIntraOp();
		ims.clinical.domain.objects.SkinClosureIntraOp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SkinClosureIntraOp)domMap.get(valueObject);
			}
			// ims.clinical.vo.SkinClosureIntraOpVo ID_SkinClosureIntraOp field is unknown
			domainObject = new ims.clinical.domain.objects.SkinClosureIntraOp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SkinClosureIntraOp());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SkinClosureIntraOp)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SkinClosureIntraOp) domainFactory.getDomainObject(ims.clinical.domain.objects.SkinClosureIntraOp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SkinClosureIntraOp());

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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProcedure value2 = null;
		if ( null != valueObject.getPatientProcedure() ) 
		{
			if (valueObject.getPatientProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientProcedure()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getPatientProcedure());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getPatientProcedure().getBoId());
			}
		}
		domainObject.setPatientProcedure(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getProcedureWoundClass() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getProcedureWoundClass().getID());
		}
		domainObject.setProcedureWoundClass(value3);
		domainObject.setOther(valueObject.getOther());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		ims.clinical.vo.lookups.SkinClosureTypeCollection collection6 =
	valueObject.getSkinClosureType();
	    java.util.List domainSkinClosureType = domainObject.getSkinClosureType();;			
	    int collection6Size=0;
		if (collection6 == null)
		{
			domainSkinClosureType = new java.util.ArrayList(0);
		}
		else
		{
			collection6Size = collection6.size();
		}
		
		for(int i=0; i<collection6Size; i++) 
		{
			int instanceId = collection6.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSkinClosureType.indexOf(dom);
			if (domIdx == -1)
			{
				domainSkinClosureType.add(i, dom);
			}
			else if (i != domIdx && i < domainSkinClosureType.size())
			{
				Object tmp = domainSkinClosureType.get(i);
				domainSkinClosureType.set(i, domainSkinClosureType.get(domIdx));
				domainSkinClosureType.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j6 = domainSkinClosureType.size();
		while (j6 > collection6Size)
		{
			domainSkinClosureType.remove(j6-1);
			j6 = domainSkinClosureType.size();
		}

		domainObject.setSkinClosureType(domainSkinClosureType);		

		return domainObject;
	}

}
