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
 * @author Sean Nesbitt
 */
public class OPDSpasticityAssessTreatVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.OPDSpasticityAssessTreatVo copy(ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObjectDest, ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPDSpasticityAssessTreat(valueObjectSrc.getID_OPDSpasticityAssessTreat());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatGoals
		valueObjectDest.setTreatGoals(valueObjectSrc.getTreatGoals());
		// TreatmentPlan
		valueObjectDest.setTreatmentPlan(valueObjectSrc.getTreatmentPlan());
		// BotulismTreatment
		valueObjectDest.setBotulismTreatment(valueObjectSrc.getBotulismTreatment());
		// JointContracture
		valueObjectDest.setJointContracture(valueObjectSrc.getJointContracture());
		// LimbFinding
		valueObjectDest.setLimbFinding(valueObjectSrc.getLimbFinding());
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
 	 * If more than one call to an Assembler is made then #createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDSpasticityAssessTreat objects.
	 */
	public static ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(java.util.Set domainObjectSet)	
	{
		return createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDSpasticityAssessTreat objects.
	 */
	public static ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection voList = new ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject = (ims.medical.domain.objects.OPDSpasticityAssessTreat) iterator.next();
			ims.generalmedical.vo.OPDSpasticityAssessTreatVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDSpasticityAssessTreat objects.
	 */
	public static ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(java.util.List domainObjectList) 
	{
		return createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDSpasticityAssessTreat objects.
	 */
	public static ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection createOPDSpasticityAssessTreatVoCollectionFromOPDSpasticityAssessTreat(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection voList = new ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject = (ims.medical.domain.objects.OPDSpasticityAssessTreat) domainObjectList.get(i);
			ims.generalmedical.vo.OPDSpasticityAssessTreatVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.OPDSpasticityAssessTreat set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPDSpasticityAssessTreatSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection voCollection) 
	 {
	 	return extractOPDSpasticityAssessTreatSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPDSpasticityAssessTreatSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDSpasticityAssessTreatVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject = OPDSpasticityAssessTreatVoAssembler.extractOPDSpasticityAssessTreat(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.OPDSpasticityAssessTreat list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPDSpasticityAssessTreatList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection voCollection) 
	 {
	 	return extractOPDSpasticityAssessTreatList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPDSpasticityAssessTreatList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasticityAssessTreatVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDSpasticityAssessTreatVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject = OPDSpasticityAssessTreatVoAssembler.extractOPDSpasticityAssessTreat(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.OPDSpasticityAssessTreat object.
	 * @param domainObject ims.medical.domain.objects.OPDSpasticityAssessTreat
	 */
	 public static ims.generalmedical.vo.OPDSpasticityAssessTreatVo create(ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.OPDSpasticityAssessTreat object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.OPDSpasticityAssessTreatVo create(DomainObjectMap map, ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObject = (ims.generalmedical.vo.OPDSpasticityAssessTreatVo) map.getValueObject(domainObject, ims.generalmedical.vo.OPDSpasticityAssessTreatVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.OPDSpasticityAssessTreatVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.OPDSpasticityAssessTreat
	 */
	 public static ims.generalmedical.vo.OPDSpasticityAssessTreatVo insert(ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObject, ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.OPDSpasticityAssessTreat
	 */
	 public static ims.generalmedical.vo.OPDSpasticityAssessTreatVo insert(DomainObjectMap map, ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObject, ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPDSpasticityAssessTreat(domainObject.getId());
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
			
		// TreatGoals
		valueObject.setTreatGoals(ims.generalmedical.vo.domain.OPDSpasticityAssessTreatGoalVoAssembler.createOPDSpasticityAssessTreatGoalVoCollectionFromOPDSpasAssessTreatGoal(map, domainObject.getTreatGoals()) );
		// TreatmentPlan
		java.util.List listTreatmentPlan = domainObject.getTreatmentPlan();
		ims.spinalinjuries.vo.lookups.SATreatmentPlanCollection TreatmentPlan = new ims.spinalinjuries.vo.lookups.SATreatmentPlanCollection();
		for(java.util.Iterator iterator = listTreatmentPlan.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.SATreatmentPlan voInstance = new ims.spinalinjuries.vo.lookups.SATreatmentPlan(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SATreatmentPlan parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.SATreatmentPlan(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			TreatmentPlan.add(voInstance);
		}
		valueObject.setTreatmentPlan( TreatmentPlan );
		// BotulismTreatment
		java.util.List listBotulismTreatment = domainObject.getBotulismTreatment();
		ims.spinalinjuries.vo.lookups.SABotulinmCollection BotulismTreatment = new ims.spinalinjuries.vo.lookups.SABotulinmCollection();
		for(java.util.Iterator iterator = listBotulismTreatment.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.SABotulinm voInstance = new ims.spinalinjuries.vo.lookups.SABotulinm(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.SABotulinm parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.SABotulinm(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			BotulismTreatment.add(voInstance);
		}
		valueObject.setBotulismTreatment( BotulismTreatment );
		// JointContracture
		valueObject.setJointContracture(domainObject.getJointContracture());
		// LimbFinding
		valueObject.setLimbFinding(ims.generalmedical.vo.domain.OPDSpasAssLimbsVoAssembler.createOPDSpasAssLimbsVoCollectionFromOPDSpasAssLimbs(map, domainObject.getLimbFinding()) );
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
	public static ims.medical.domain.objects.OPDSpasticityAssessTreat extractOPDSpasticityAssessTreat(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObject) 
	{
		return 	extractOPDSpasticityAssessTreat(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.OPDSpasticityAssessTreat extractOPDSpasticityAssessTreat(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDSpasticityAssessTreatVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPDSpasticityAssessTreat();
		ims.medical.domain.objects.OPDSpasticityAssessTreat domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.OPDSpasticityAssessTreat)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.OPDSpasticityAssessTreatVo ID_OPDSpasticityAssessTreat field is unknown
			domainObject = new ims.medical.domain.objects.OPDSpasticityAssessTreat();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPDSpasticityAssessTreat());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.OPDSpasticityAssessTreat)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.OPDSpasticityAssessTreat) domainFactory.getDomainObject(ims.medical.domain.objects.OPDSpasticityAssessTreat.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPDSpasticityAssessTreat());

		domainObject.setTreatGoals(ims.generalmedical.vo.domain.OPDSpasticityAssessTreatGoalVoAssembler.extractOPDSpasAssessTreatGoalSet(domainFactory, valueObject.getTreatGoals(), domainObject.getTreatGoals(), domMap));		
		ims.spinalinjuries.vo.lookups.SATreatmentPlanCollection collection2 =
	valueObject.getTreatmentPlan();
	    java.util.List domainTreatmentPlan = domainObject.getTreatmentPlan();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainTreatmentPlan = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainTreatmentPlan.indexOf(dom);
			if (domIdx == -1)
			{
				domainTreatmentPlan.add(i, dom);
			}
			else if (i != domIdx && i < domainTreatmentPlan.size())
			{
				Object tmp = domainTreatmentPlan.get(i);
				domainTreatmentPlan.set(i, domainTreatmentPlan.get(domIdx));
				domainTreatmentPlan.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainTreatmentPlan.size();
		while (j2 > collection2Size)
		{
			domainTreatmentPlan.remove(j2-1);
			j2 = domainTreatmentPlan.size();
		}

		domainObject.setTreatmentPlan(domainTreatmentPlan);		
		ims.spinalinjuries.vo.lookups.SABotulinmCollection collection3 =
	valueObject.getBotulismTreatment();
	    java.util.List domainBotulismTreatment = domainObject.getBotulismTreatment();;			
	    int collection3Size=0;
		if (collection3 == null)
		{
			domainBotulismTreatment = new java.util.ArrayList(0);
		}
		else
		{
			collection3Size = collection3.size();
		}
		
		for(int i=0; i<collection3Size; i++) 
		{
			int instanceId = collection3.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBotulismTreatment.indexOf(dom);
			if (domIdx == -1)
			{
				domainBotulismTreatment.add(i, dom);
			}
			else if (i != domIdx && i < domainBotulismTreatment.size())
			{
				Object tmp = domainBotulismTreatment.get(i);
				domainBotulismTreatment.set(i, domainBotulismTreatment.get(domIdx));
				domainBotulismTreatment.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j3 = domainBotulismTreatment.size();
		while (j3 > collection3Size)
		{
			domainBotulismTreatment.remove(j3-1);
			j3 = domainBotulismTreatment.size();
		}

		domainObject.setBotulismTreatment(domainBotulismTreatment);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getJointContracture() != null && valueObject.getJointContracture().equals(""))
		{
			valueObject.setJointContracture(null);
		}
		domainObject.setJointContracture(valueObject.getJointContracture());
		domainObject.setLimbFinding(ims.generalmedical.vo.domain.OPDSpasAssLimbsVoAssembler.extractOPDSpasAssLimbsSet(domainFactory, valueObject.getLimbFinding(), domainObject.getLimbFinding(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
