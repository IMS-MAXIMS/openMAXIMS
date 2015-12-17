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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class STHKPendingElectiveAdmissionListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.STHKPendingElectiveAdmissionListVo copy(ims.core.vo.STHKPendingElectiveAdmissionListVo valueObjectDest, ims.core.vo.STHKPendingElectiveAdmissionListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PendingElectiveAdmission(valueObjectSrc.getID_PendingElectiveAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// AllocatedWard
		valueObjectDest.setAllocatedWard(valueObjectSrc.getAllocatedWard());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// TCIDate
		valueObjectDest.setTCIDate(valueObjectSrc.getTCIDate());
		// TCITime
		valueObjectDest.setTCITime(valueObjectSrc.getTCITime());
		// ManagementIntention
		valueObjectDest.setManagementIntention(valueObjectSrc.getManagementIntention());
		// Procedures
		valueObjectDest.setProcedures(valueObjectSrc.getProcedures());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.STHKPendingElectiveAdmissionListVoCollection createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(java.util.Set domainObjectSet)	
	{
		return createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.STHKPendingElectiveAdmissionListVoCollection createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.STHKPendingElectiveAdmissionListVoCollection voList = new ims.core.vo.STHKPendingElectiveAdmissionListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingElectiveAdmission) iterator.next();
			ims.core.vo.STHKPendingElectiveAdmissionListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.STHKPendingElectiveAdmissionListVoCollection createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(java.util.List domainObjectList) 
	{
		return createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.PendingElectiveAdmission objects.
	 */
	public static ims.core.vo.STHKPendingElectiveAdmissionListVoCollection createSTHKPendingElectiveAdmissionListVoCollectionFromPendingElectiveAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.STHKPendingElectiveAdmissionListVoCollection voList = new ims.core.vo.STHKPendingElectiveAdmissionListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = (ims.core.admin.pas.domain.objects.PendingElectiveAdmission) domainObjectList.get(i);
			ims.core.vo.STHKPendingElectiveAdmissionListVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingElectiveAdmission set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPendingElectiveAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.STHKPendingElectiveAdmissionListVoCollection voCollection) 
	 {
	 	return extractPendingElectiveAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPendingElectiveAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.STHKPendingElectiveAdmissionListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.STHKPendingElectiveAdmissionListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = STHKPendingElectiveAdmissionListVoAssembler.extractPendingElectiveAdmission(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.PendingElectiveAdmission list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPendingElectiveAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.STHKPendingElectiveAdmissionListVoCollection voCollection) 
	 {
	 	return extractPendingElectiveAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPendingElectiveAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.STHKPendingElectiveAdmissionListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.STHKPendingElectiveAdmissionListVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = STHKPendingElectiveAdmissionListVoAssembler.extractPendingElectiveAdmission(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingElectiveAdmission object.
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingElectiveAdmission
	 */
	 public static ims.core.vo.STHKPendingElectiveAdmissionListVo create(ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.PendingElectiveAdmission object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.STHKPendingElectiveAdmissionListVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.STHKPendingElectiveAdmissionListVo valueObject = (ims.core.vo.STHKPendingElectiveAdmissionListVo) map.getValueObject(domainObject, ims.core.vo.STHKPendingElectiveAdmissionListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.STHKPendingElectiveAdmissionListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingElectiveAdmission
	 */
	 public static ims.core.vo.STHKPendingElectiveAdmissionListVo insert(ims.core.vo.STHKPendingElectiveAdmissionListVo valueObject, ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.PendingElectiveAdmission
	 */
	 public static ims.core.vo.STHKPendingElectiveAdmissionListVo insert(DomainObjectMap map, ims.core.vo.STHKPendingElectiveAdmissionListVo valueObject, ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PendingElectiveAdmission(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventForSTHKListVoAssembler.create(map, domainObject.getPasEvent()) );
		// AllocatedWard
		valueObject.setAllocatedWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getAllocatedWard()) );
		// Comments
		valueObject.setComments(domainObject.getComments());
		// TCIDate
		java.util.Date TCIDate = domainObject.getTCIDate();
		if ( null != TCIDate ) 
		{
			valueObject.setTCIDate(new ims.framework.utils.Date(TCIDate) );
		}
		// TCITime
		String TCITime = domainObject.getTCITime();
		if ( null != TCITime ) 
		{
			valueObject.setTCITime(new ims.framework.utils.Time(TCITime) );
		}
		// ManagementIntention
		ims.domain.lookups.LookupInstance instance6 = domainObject.getManagementIntention();
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

			ims.core.vo.lookups.ManagementIntention voLookup6 = new ims.core.vo.lookups.ManagementIntention(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.ManagementIntention parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.ManagementIntention(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setManagementIntention(voLookup6);
		}
				// Procedures
		valueObject.setProcedures(ims.core.vo.domain.ProcedureLiteVoAssembler.createProcedureLiteVoCollectionFromProcedure(map, domainObject.getProcedures()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.PendingElectiveAdmission extractPendingElectiveAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.STHKPendingElectiveAdmissionListVo valueObject) 
	{
		return 	extractPendingElectiveAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.PendingElectiveAdmission extractPendingElectiveAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.STHKPendingElectiveAdmissionListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PendingElectiveAdmission();
		ims.core.admin.pas.domain.objects.PendingElectiveAdmission domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingElectiveAdmission)domMap.get(valueObject);
			}
			// ims.core.vo.STHKPendingElectiveAdmissionListVo ID_PendingElectiveAdmission field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.PendingElectiveAdmission();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PendingElectiveAdmission());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.PendingElectiveAdmission)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.PendingElectiveAdmission) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PendingElectiveAdmission.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PendingElectiveAdmission());

		domainObject.setPasEvent(ims.core.vo.domain.PasEventForSTHKListVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		domainObject.setAllocatedWard(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getAllocatedWard(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getTCIDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setTCIDate(value4);
		ims.framework.utils.Time time5 = valueObject.getTCITime();
		String value5 = null;
		if ( time5 != null ) 
		{
			value5 = time5.toString();
		}
		domainObject.setTCITime(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getManagementIntention() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getManagementIntention().getID());
		}
		domainObject.setManagementIntention(value6);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ProcedureRefVoCollection refCollection7 = new ims.core.clinical.vo.ProcedureRefVoCollection();
		if (valueObject.getProcedures() != null)
		{
			for (int i7=0; i7<valueObject.getProcedures().size(); i7++)
			{
				ims.core.clinical.vo.ProcedureRefVo ref7 = (ims.core.clinical.vo.ProcedureRefVo)valueObject.getProcedures().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainProcedures7 = domainObject.getProcedures();
		if (domainProcedures7 == null)
		{
			domainProcedures7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection7.get(i);					
			ims.core.clinical.domain.objects.Procedure dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Procedure)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Procedure.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainProcedures7.contains(dom))
			{
				domainProcedures7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainProcedures7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainProcedures7.remove(iter7.next());
		}		
		
		domainObject.setProcedures(domainProcedures7);		

		return domainObject;
	}

}
