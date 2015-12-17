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
public class TheatreSessionStaffDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TheatreSessionStaffDetailVo copy(ims.clinical.vo.TheatreSessionStaffDetailVo valueObjectDest, ims.clinical.vo.TheatreSessionStaffDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TheatreSessionStaffDetail(valueObjectSrc.getID_TheatreSessionStaffDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreSession
		valueObjectDest.setTheatreSession(valueObjectSrc.getTheatreSession());
		// Anaesthetist
		valueObjectDest.setAnaesthetist(valueObjectSrc.getAnaesthetist());
		// AssistingAnaesthetist
		valueObjectDest.setAssistingAnaesthetist(valueObjectSrc.getAssistingAnaesthetist());
		// SupervisingAnaesthetist
		valueObjectDest.setSupervisingAnaesthetist(valueObjectSrc.getSupervisingAnaesthetist());
		// AnaestheticPractioner
		valueObjectDest.setAnaestheticPractioner(valueObjectSrc.getAnaestheticPractioner());
		// OperatingSurgeon
		valueObjectDest.setOperatingSurgeon(valueObjectSrc.getOperatingSurgeon());
		// SupervisingSurgeon
		valueObjectDest.setSupervisingSurgeon(valueObjectSrc.getSupervisingSurgeon());
		// AssistingSurgeons
		valueObjectDest.setAssistingSurgeons(valueObjectSrc.getAssistingSurgeons());
		// CirculatorsScrubNurses
		valueObjectDest.setCirculatorsScrubNurses(valueObjectSrc.getCirculatorsScrubNurses());
		// Other
		valueObjectDest.setOther(valueObjectSrc.getOther());
		// NoAnaesthetistPresentLA
		valueObjectDest.setNoAnaesthetistPresentLA(valueObjectSrc.getNoAnaesthetistPresentLA());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.TheatreSessionStaffDetail objects.
	 */
	public static ims.clinical.vo.TheatreSessionStaffDetailVoCollection createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(java.util.Set domainObjectSet)	
	{
		return createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.TheatreSessionStaffDetail objects.
	 */
	public static ims.clinical.vo.TheatreSessionStaffDetailVoCollection createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TheatreSessionStaffDetailVoCollection voList = new ims.clinical.vo.TheatreSessionStaffDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject = (ims.clinical.domain.objects.TheatreSessionStaffDetail) iterator.next();
			ims.clinical.vo.TheatreSessionStaffDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.TheatreSessionStaffDetail objects.
	 */
	public static ims.clinical.vo.TheatreSessionStaffDetailVoCollection createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(java.util.List domainObjectList) 
	{
		return createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.TheatreSessionStaffDetail objects.
	 */
	public static ims.clinical.vo.TheatreSessionStaffDetailVoCollection createTheatreSessionStaffDetailVoCollectionFromTheatreSessionStaffDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TheatreSessionStaffDetailVoCollection voList = new ims.clinical.vo.TheatreSessionStaffDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject = (ims.clinical.domain.objects.TheatreSessionStaffDetail) domainObjectList.get(i);
			ims.clinical.vo.TheatreSessionStaffDetailVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.TheatreSessionStaffDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTheatreSessionStaffDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TheatreSessionStaffDetailVoCollection voCollection) 
	 {
	 	return extractTheatreSessionStaffDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTheatreSessionStaffDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TheatreSessionStaffDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TheatreSessionStaffDetailVo vo = voCollection.get(i);
			ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject = TheatreSessionStaffDetailVoAssembler.extractTheatreSessionStaffDetail(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.TheatreSessionStaffDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTheatreSessionStaffDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TheatreSessionStaffDetailVoCollection voCollection) 
	 {
	 	return extractTheatreSessionStaffDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTheatreSessionStaffDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TheatreSessionStaffDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TheatreSessionStaffDetailVo vo = voCollection.get(i);
			ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject = TheatreSessionStaffDetailVoAssembler.extractTheatreSessionStaffDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.TheatreSessionStaffDetail object.
	 * @param domainObject ims.clinical.domain.objects.TheatreSessionStaffDetail
	 */
	 public static ims.clinical.vo.TheatreSessionStaffDetailVo create(ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.TheatreSessionStaffDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TheatreSessionStaffDetailVo create(DomainObjectMap map, ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TheatreSessionStaffDetailVo valueObject = (ims.clinical.vo.TheatreSessionStaffDetailVo) map.getValueObject(domainObject, ims.clinical.vo.TheatreSessionStaffDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TheatreSessionStaffDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.TheatreSessionStaffDetail
	 */
	 public static ims.clinical.vo.TheatreSessionStaffDetailVo insert(ims.clinical.vo.TheatreSessionStaffDetailVo valueObject, ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.TheatreSessionStaffDetail
	 */
	 public static ims.clinical.vo.TheatreSessionStaffDetailVo insert(DomainObjectMap map, ims.clinical.vo.TheatreSessionStaffDetailVo valueObject, ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TheatreSessionStaffDetail(domainObject.getId());
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
			
		// TheatreSession
		valueObject.setTheatreSession(ims.scheduling.vo.domain.SessionTheatreDetailsLiteVoAssembler.create(map, domainObject.getTheatreSession()) );
		// Anaesthetist
		valueObject.setAnaesthetist((ims.core.vo.MedicLiteVo)ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getAnaesthetist()) );
		// AssistingAnaesthetist
		valueObject.setAssistingAnaesthetist((ims.core.vo.MedicLiteVo)ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getAssistingAnaesthetist()) );
		// SupervisingAnaesthetist
		valueObject.setSupervisingAnaesthetist((ims.core.vo.MedicLiteVo)ims.core.vo.domain.MedicLiteVoAssembler.create(map, domainObject.getSupervisingAnaesthetist()) );
		// AnaestheticPractioner
		valueObject.setAnaestheticPractioner((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getAnaestheticPractioner()) );
		// OperatingSurgeon
		valueObject.setOperatingSurgeon((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getOperatingSurgeon()) );
		// SupervisingSurgeon
		valueObject.setSupervisingSurgeon((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getSupervisingSurgeon()) );
		// AssistingSurgeons
		valueObject.setAssistingSurgeons(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getAssistingSurgeons()) );
		// CirculatorsScrubNurses
		valueObject.setCirculatorsScrubNurses(ims.core.vo.domain.NurseLiteVoAssembler.createNurseLiteVoCollectionFromNurse(map, domainObject.getCirculatorsScrubNurses()) );
		// Other
		valueObject.setOther(domainObject.getOther());
		// NoAnaesthetistPresentLA
		valueObject.setNoAnaesthetistPresentLA( domainObject.isNoAnaesthetistPresentLA() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.TheatreSessionStaffDetail extractTheatreSessionStaffDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TheatreSessionStaffDetailVo valueObject) 
	{
		return 	extractTheatreSessionStaffDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.TheatreSessionStaffDetail extractTheatreSessionStaffDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TheatreSessionStaffDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TheatreSessionStaffDetail();
		ims.clinical.domain.objects.TheatreSessionStaffDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.TheatreSessionStaffDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.TheatreSessionStaffDetailVo ID_TheatreSessionStaffDetail field is unknown
			domainObject = new ims.clinical.domain.objects.TheatreSessionStaffDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TheatreSessionStaffDetail());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.TheatreSessionStaffDetail)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.TheatreSessionStaffDetail) domainFactory.getDomainObject(ims.clinical.domain.objects.TheatreSessionStaffDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TheatreSessionStaffDetail());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value1 = null;
		if ( null != valueObject.getTheatreSession() ) 
		{
			if (valueObject.getTheatreSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreSession()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getTheatreSession());
				}
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getTheatreSession().getBoId());
			}
		}
		domainObject.setTheatreSession(value1);
		domainObject.setAnaesthetist(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicLiteVo)valueObject.getAnaesthetist(), domMap));
		domainObject.setAssistingAnaesthetist(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicLiteVo)valueObject.getAssistingAnaesthetist(), domMap));
		domainObject.setSupervisingAnaesthetist(ims.core.vo.domain.MedicLiteVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicLiteVo)valueObject.getSupervisingAnaesthetist(), domMap));
		domainObject.setAnaestheticPractioner(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getAnaestheticPractioner(), domMap));
		domainObject.setOperatingSurgeon(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getOperatingSurgeon(), domMap));
		domainObject.setSupervisingSurgeon(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getSupervisingSurgeon(), domMap));
		domainObject.setAssistingSurgeons(ims.core.vo.domain.MedicLiteVoAssembler.extractMedicList(domainFactory, valueObject.getAssistingSurgeons(), domainObject.getAssistingSurgeons(), domMap));		
		domainObject.setCirculatorsScrubNurses(ims.core.vo.domain.NurseLiteVoAssembler.extractNurseList(domainFactory, valueObject.getCirculatorsScrubNurses(), domainObject.getCirculatorsScrubNurses(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOther() != null && valueObject.getOther().equals(""))
		{
			valueObject.setOther(null);
		}
		domainObject.setOther(valueObject.getOther());
		domainObject.setNoAnaesthetistPresentLA(valueObject.getNoAnaesthetistPresentLA());

		return domainObject;
	}

}
