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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class OPDGenNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.OPDGenNotesVo copy(ims.generalmedical.vo.OPDGenNotesVo valueObjectDest, ims.generalmedical.vo.OPDGenNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPDGenNotes(valueObjectSrc.getID_OPDGenNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AutonomicDysreflexia
		valueObjectDest.setAutonomicDysreflexia(valueObjectSrc.getAutonomicDysreflexia());
		// ModAshworth
		valueObjectDest.setModAshworth(valueObjectSrc.getModAshworth());
		// SpasType
		valueObjectDest.setSpasType(valueObjectSrc.getSpasType());
		// PainScale
		valueObjectDest.setPainScale(valueObjectSrc.getPainScale());
		// GenNotes
		valueObjectDest.setGenNotes(valueObjectSrc.getGenNotes());
		// EvidenceSyringomyelia
		valueObjectDest.setEvidenceSyringomyelia(valueObjectSrc.getEvidenceSyringomyelia());
		// PlanAction
		valueObjectDest.setPlanAction(valueObjectSrc.getPlanAction());
		// OPDNext
		valueObjectDest.setOPDNext(valueObjectSrc.getOPDNext());
		// OpdNextUnits
		valueObjectDest.setOpdNextUnits(valueObjectSrc.getOpdNextUnits());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOPDGenNotesVoCollectionFromOPDGenNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDGenNotes objects.
	 */
	public static ims.generalmedical.vo.OPDGenNotesVoCollection createOPDGenNotesVoCollectionFromOPDGenNotes(java.util.Set domainObjectSet)	
	{
		return createOPDGenNotesVoCollectionFromOPDGenNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDGenNotes objects.
	 */
	public static ims.generalmedical.vo.OPDGenNotesVoCollection createOPDGenNotesVoCollectionFromOPDGenNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.OPDGenNotesVoCollection voList = new ims.generalmedical.vo.OPDGenNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.OPDGenNotes domainObject = (ims.medical.domain.objects.OPDGenNotes) iterator.next();
			ims.generalmedical.vo.OPDGenNotesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDGenNotes objects.
	 */
	public static ims.generalmedical.vo.OPDGenNotesVoCollection createOPDGenNotesVoCollectionFromOPDGenNotes(java.util.List domainObjectList) 
	{
		return createOPDGenNotesVoCollectionFromOPDGenNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDGenNotes objects.
	 */
	public static ims.generalmedical.vo.OPDGenNotesVoCollection createOPDGenNotesVoCollectionFromOPDGenNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.OPDGenNotesVoCollection voList = new ims.generalmedical.vo.OPDGenNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.OPDGenNotes domainObject = (ims.medical.domain.objects.OPDGenNotes) domainObjectList.get(i);
			ims.generalmedical.vo.OPDGenNotesVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.OPDGenNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPDGenNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDGenNotesVoCollection voCollection) 
	 {
	 	return extractOPDGenNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPDGenNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDGenNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDGenNotesVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDGenNotes domainObject = OPDGenNotesVoAssembler.extractOPDGenNotes(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.OPDGenNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPDGenNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDGenNotesVoCollection voCollection) 
	 {
	 	return extractOPDGenNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPDGenNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDGenNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDGenNotesVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDGenNotes domainObject = OPDGenNotesVoAssembler.extractOPDGenNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.OPDGenNotes object.
	 * @param domainObject ims.medical.domain.objects.OPDGenNotes
	 */
	 public static ims.generalmedical.vo.OPDGenNotesVo create(ims.medical.domain.objects.OPDGenNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.OPDGenNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.OPDGenNotesVo create(DomainObjectMap map, ims.medical.domain.objects.OPDGenNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.OPDGenNotesVo valueObject = (ims.generalmedical.vo.OPDGenNotesVo) map.getValueObject(domainObject, ims.generalmedical.vo.OPDGenNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.OPDGenNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.OPDGenNotes
	 */
	 public static ims.generalmedical.vo.OPDGenNotesVo insert(ims.generalmedical.vo.OPDGenNotesVo valueObject, ims.medical.domain.objects.OPDGenNotes domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.OPDGenNotes
	 */
	 public static ims.generalmedical.vo.OPDGenNotesVo insert(DomainObjectMap map, ims.generalmedical.vo.OPDGenNotesVo valueObject, ims.medical.domain.objects.OPDGenNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPDGenNotes(domainObject.getId());
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
			
		// AutonomicDysreflexia
		ims.domain.lookups.LookupInstance instance1 = domainObject.getAutonomicDysreflexia();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.AutonomicDysreflexia voLookup1 = new ims.core.vo.lookups.AutonomicDysreflexia(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.AutonomicDysreflexia parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.AutonomicDysreflexia(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setAutonomicDysreflexia(voLookup1);
		}
				// ModAshworth
		valueObject.setModAshworth(domainObject.getModAshworth());
		// SpasType
		valueObject.setSpasType(domainObject.getSpasType());
		// PainScale
		valueObject.setPainScale(domainObject.getPainScale());
		// GenNotes
		valueObject.setGenNotes(domainObject.getGenNotes());
		// EvidenceSyringomyelia
		valueObject.setEvidenceSyringomyelia(domainObject.getEvidenceSyringomyelia());
		// PlanAction
		valueObject.setPlanAction(domainObject.getPlanAction());
		// OPDNext
		valueObject.setOPDNext(domainObject.getOPDNext());
		// OpdNextUnits
		ims.domain.lookups.LookupInstance instance9 = domainObject.getOpdNextUnits();
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

			ims.core.vo.lookups.TimeWeeksMonthsYears voLookup9 = new ims.core.vo.lookups.TimeWeeksMonthsYears(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.TimeWeeksMonthsYears parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.TimeWeeksMonthsYears(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setOpdNextUnits(voLookup9);
		}
				// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.OPDGenNotes extractOPDGenNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDGenNotesVo valueObject) 
	{
		return 	extractOPDGenNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.OPDGenNotes extractOPDGenNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDGenNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPDGenNotes();
		ims.medical.domain.objects.OPDGenNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.OPDGenNotes)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.OPDGenNotesVo ID_OPDGenNotes field is unknown
			domainObject = new ims.medical.domain.objects.OPDGenNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPDGenNotes());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.OPDGenNotes)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.OPDGenNotes) domainFactory.getDomainObject(ims.medical.domain.objects.OPDGenNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPDGenNotes());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getAutonomicDysreflexia() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getAutonomicDysreflexia().getID());
		}
		domainObject.setAutonomicDysreflexia(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getModAshworth() != null && valueObject.getModAshworth().equals(""))
		{
			valueObject.setModAshworth(null);
		}
		domainObject.setModAshworth(valueObject.getModAshworth());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSpasType() != null && valueObject.getSpasType().equals(""))
		{
			valueObject.setSpasType(null);
		}
		domainObject.setSpasType(valueObject.getSpasType());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPainScale() != null && valueObject.getPainScale().equals(""))
		{
			valueObject.setPainScale(null);
		}
		domainObject.setPainScale(valueObject.getPainScale());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGenNotes() != null && valueObject.getGenNotes().equals(""))
		{
			valueObject.setGenNotes(null);
		}
		domainObject.setGenNotes(valueObject.getGenNotes());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEvidenceSyringomyelia() != null && valueObject.getEvidenceSyringomyelia().equals(""))
		{
			valueObject.setEvidenceSyringomyelia(null);
		}
		domainObject.setEvidenceSyringomyelia(valueObject.getEvidenceSyringomyelia());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPlanAction() != null && valueObject.getPlanAction().equals(""))
		{
			valueObject.setPlanAction(null);
		}
		domainObject.setPlanAction(valueObject.getPlanAction());
		domainObject.setOPDNext(valueObject.getOPDNext());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getOpdNextUnits() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getOpdNextUnits().getID());
		}
		domainObject.setOpdNextUnits(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value10 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value10 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value10 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value10);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
