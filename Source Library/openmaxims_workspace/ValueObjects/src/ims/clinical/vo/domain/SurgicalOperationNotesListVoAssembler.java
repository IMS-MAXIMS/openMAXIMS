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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Calin Perebiceanu
 */
public class SurgicalOperationNotesListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesListVo copy(ims.clinical.vo.SurgicalOperationNotesListVo valueObjectDest, ims.clinical.vo.SurgicalOperationNotesListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalOperationNotes(valueObjectSrc.getID_SurgicalOperationNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// SignOffHCP
		valueObjectDest.setSignOffHCP(valueObjectSrc.getSignOffHCP());
		// SignOffDateTime
		valueObjectDest.setSignOffDateTime(valueObjectSrc.getSignOffDateTime());
		// MainProcedure
		valueObjectDest.setMainProcedure(valueObjectSrc.getMainProcedure());
		// ProceduresPerformed
		valueObjectDest.setProceduresPerformed(valueObjectSrc.getProceduresPerformed());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesListVoCollection createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(java.util.Set domainObjectSet)	
	{
		return createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesListVoCollection createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalOperationNotesListVoCollection voList = new ims.clinical.vo.SurgicalOperationNotesListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = (ims.clinical.domain.objects.SurgicalOperationNotes) iterator.next();
			ims.clinical.vo.SurgicalOperationNotesListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesListVoCollection createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(java.util.List domainObjectList) 
	{
		return createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesListVoCollection createSurgicalOperationNotesListVoCollectionFromSurgicalOperationNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalOperationNotesListVoCollection voList = new ims.clinical.vo.SurgicalOperationNotesListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = (ims.clinical.domain.objects.SurgicalOperationNotes) domainObjectList.get(i);
			ims.clinical.vo.SurgicalOperationNotesListVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalOperationNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalOperationNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesListVoCollection voCollection) 
	 {
	 	return extractSurgicalOperationNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalOperationNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalOperationNotesListVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = SurgicalOperationNotesListVoAssembler.extractSurgicalOperationNotes(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalOperationNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalOperationNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesListVoCollection voCollection) 
	 {
	 	return extractSurgicalOperationNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalOperationNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalOperationNotesListVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = SurgicalOperationNotesListVoAssembler.extractSurgicalOperationNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalOperationNotes object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalOperationNotes
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesListVo create(ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalOperationNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalOperationNotesListVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalOperationNotesListVo valueObject = (ims.clinical.vo.SurgicalOperationNotesListVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalOperationNotesListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalOperationNotesListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalOperationNotes
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesListVo insert(ims.clinical.vo.SurgicalOperationNotesListVo valueObject, ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalOperationNotes
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesListVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalOperationNotesListVo valueObject, ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalOperationNotes(domainObject.getId());
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
			
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextListVoAssembler.create(map, domainObject.getCareContext()) );
		// SignOffHCP
		valueObject.setSignOffHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSignOffHCP()) );
		// SignOffDateTime
		java.util.Date SignOffDateTime = domainObject.getSignOffDateTime();
		if ( null != SignOffDateTime ) 
		{
			valueObject.setSignOffDateTime(new ims.framework.utils.DateTime(SignOffDateTime) );
		}
		// MainProcedure
		valueObject.setMainProcedure(ims.core.vo.domain.PatientProcedureMinVoAssembler.create(map, domainObject.getMainProcedure()) );
		// ProceduresPerformed
		valueObject.setProceduresPerformed(ims.core.vo.domain.PatientProcedureSurgicalOpVoAssembler.createPatientProcedureSurgicalOpVoCollectionFromPatientProcedure(map, domainObject.getProceduresPerformed()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalOperationNotes extractSurgicalOperationNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesListVo valueObject) 
	{
		return 	extractSurgicalOperationNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalOperationNotes extractSurgicalOperationNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalOperationNotes();
		ims.clinical.domain.objects.SurgicalOperationNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalOperationNotes)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalOperationNotesListVo ID_SurgicalOperationNotes field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalOperationNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalOperationNotes());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalOperationNotes)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalOperationNotes) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalOperationNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalOperationNotes());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getSignOffHCP() ) 
		{
			if (valueObject.getSignOffHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getSignOffHCP()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSignOffHCP());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSignOffHCP().getBoId());
			}
		}
		domainObject.setSignOffHCP(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getSignOffDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setSignOffDateTime(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProcedure value4 = null;
		if ( null != valueObject.getMainProcedure() ) 
		{
			if (valueObject.getMainProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getMainProcedure()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getMainProcedure());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getMainProcedure().getBoId());
			}
		}
		domainObject.setMainProcedure(value4);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.PatientProcedureRefVoCollection refCollection5 = new ims.core.clinical.vo.PatientProcedureRefVoCollection();
		if (valueObject.getProceduresPerformed() != null)
		{
			for (int i5=0; i5<valueObject.getProceduresPerformed().size(); i5++)
			{
				ims.core.clinical.vo.PatientProcedureRefVo ref5 = (ims.core.clinical.vo.PatientProcedureRefVo)valueObject.getProceduresPerformed().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.Set domainProceduresPerformed5 = domainObject.getProceduresPerformed();
		if (domainProceduresPerformed5 == null)
		{
			domainProceduresPerformed5 = new java.util.HashSet();
		}
		java.util.Set newSet5  = new java.util.HashSet();
		for(int i=0; i<size5; i++) 
		{
			ims.core.clinical.vo.PatientProcedureRefVo vo = refCollection5.get(i);					
			ims.core.clinical.domain.objects.PatientProcedure dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientProcedure.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainProceduresPerformed5.contains(dom))
			{
				domainProceduresPerformed5.add(dom);
			}
			newSet5.add(dom);			
		}
		java.util.Set removedSet5 = new java.util.HashSet();
		java.util.Iterator iter5 = domainProceduresPerformed5.iterator();
		//Find out which objects need to be removed
		while (iter5.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter5.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet5.contains(o))
			{
				removedSet5.add(o);
			}
		}
		iter5 = removedSet5.iterator();
		//Remove the unwanted objects
		while (iter5.hasNext())
		{
			domainProceduresPerformed5.remove(iter5.next());
		}		
		
		domainObject.setProceduresPerformed(domainProceduresPerformed5);		

		return domainObject;
	}

}
