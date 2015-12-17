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
package ims.ccosched.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class PatTreatmentPlanVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ccosched.vo.PatTreatmentPlanVo copy(ims.ccosched.vo.PatTreatmentPlanVo valueObjectDest, ims.ccosched.vo.PatTreatmentPlanVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatTreatmentPlan(valueObjectSrc.getID_PatTreatmentPlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CreationUser
		valueObjectDest.setCreationUser(valueObjectSrc.getCreationUser());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// authUser
		valueObjectDest.setAuthUser(valueObjectSrc.getAuthUser());
		// modu
		valueObjectDest.setModu(valueObjectSrc.getModu());
		// SurgeryRequired
		valueObjectDest.setSurgeryRequired(valueObjectSrc.getSurgeryRequired());
		// SeenLocation
		valueObjectDest.setSeenLocation(valueObjectSrc.getSeenLocation());
		// TreatmentIntent
		valueObjectDest.setTreatmentIntent(valueObjectSrc.getTreatmentIntent());
		// DateSeen
		valueObjectDest.setDateSeen(valueObjectSrc.getDateSeen());
		// DecisionToTreat
		valueObjectDest.setDecisionToTreat(valueObjectSrc.getDecisionToTreat());
		// Actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// pkey
		valueObjectDest.setPkey(valueObjectSrc.getPkey());
		// rkey
		valueObjectDest.setRkey(valueObjectSrc.getRkey());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// TreatmentplanComment
		valueObjectDest.setTreatmentplanComment(valueObjectSrc.getTreatmentplanComment());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// PrimaryTumourHistology
		valueObjectDest.setPrimaryTumourHistology(valueObjectSrc.getPrimaryTumourHistology());
		// ecad_date
		valueObjectDest.setEcad_date(valueObjectSrc.getEcad_date());
		// PrimaryTumourGroup
		valueObjectDest.setPrimaryTumourGroup(valueObjectSrc.getPrimaryTumourGroup());
		// PrimaryTumourSite
		valueObjectDest.setPrimaryTumourSite(valueObjectSrc.getPrimaryTumourSite());
		// TreatmentSites
		valueObjectDest.setTreatmentSites(valueObjectSrc.getTreatmentSites());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanVoCollection createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(java.util.Set domainObjectSet)	
	{
		return createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanVoCollection createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ccosched.vo.PatTreatmentPlanVoCollection voList = new ims.ccosched.vo.PatTreatmentPlanVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = (ims.oncology.domain.objects.PatTreatmentPlan) iterator.next();
			ims.ccosched.vo.PatTreatmentPlanVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanVoCollection createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(java.util.List domainObjectList) 
	{
		return createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanVoCollection createPatTreatmentPlanVoCollectionFromPatTreatmentPlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ccosched.vo.PatTreatmentPlanVoCollection voList = new ims.ccosched.vo.PatTreatmentPlanVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = (ims.oncology.domain.objects.PatTreatmentPlan) domainObjectList.get(i);
			ims.ccosched.vo.PatTreatmentPlanVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.PatTreatmentPlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatTreatmentPlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanVoCollection voCollection) 
	 {
	 	return extractPatTreatmentPlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatTreatmentPlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatTreatmentPlanVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = PatTreatmentPlanVoAssembler.extractPatTreatmentPlan(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.PatTreatmentPlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatTreatmentPlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanVoCollection voCollection) 
	 {
	 	return extractPatTreatmentPlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatTreatmentPlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatTreatmentPlanVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = PatTreatmentPlanVoAssembler.extractPatTreatmentPlan(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.PatTreatmentPlan object.
	 * @param domainObject ims.oncology.domain.objects.PatTreatmentPlan
	 */
	 public static ims.ccosched.vo.PatTreatmentPlanVo create(ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.PatTreatmentPlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ccosched.vo.PatTreatmentPlanVo create(DomainObjectMap map, ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ccosched.vo.PatTreatmentPlanVo valueObject = (ims.ccosched.vo.PatTreatmentPlanVo) map.getValueObject(domainObject, ims.ccosched.vo.PatTreatmentPlanVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ccosched.vo.PatTreatmentPlanVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.PatTreatmentPlan
	 */
	 public static ims.ccosched.vo.PatTreatmentPlanVo insert(ims.ccosched.vo.PatTreatmentPlanVo valueObject, ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.PatTreatmentPlan
	 */
	 public static ims.ccosched.vo.PatTreatmentPlanVo insert(DomainObjectMap map, ims.ccosched.vo.PatTreatmentPlanVo valueObject, ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatTreatmentPlan(domainObject.getId());
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
			
		// CreationUser
		if (domainObject.getCreationUser() != null)
		{
			if(domainObject.getCreationUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCreationUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCreationUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setCreationUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getCreationUser().getId(), domainObject.getCreationUser().getVersion()));
			}
		}
		// PatientStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPatientStatus();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Status voLookup2 = new ims.ccosched.vo.lookups.Status(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Status parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.ccosched.vo.lookups.Status(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPatientStatus(voLookup2);
		}
				// authUser
		if (domainObject.getAuthUser() != null)
		{
			if(domainObject.getAuthUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAuthUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAuthUser(new ims.core.clinical.vo.AuthoringInformationRefVo(id, -1));				
			}
			else
			{
				valueObject.setAuthUser(new ims.core.clinical.vo.AuthoringInformationRefVo(domainObject.getAuthUser().getId(), domainObject.getAuthUser().getVersion()));
			}
		}
		// modu
		valueObject.setModu(domainObject.getModu());
		// SurgeryRequired
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSurgeryRequired();
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

			ims.oncology.vo.lookups.SurgeryRequired voLookup5 = new ims.oncology.vo.lookups.SurgeryRequired(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.SurgeryRequired parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.SurgeryRequired(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSurgeryRequired(voLookup5);
		}
				// SeenLocation
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSeenLocation();
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

			ims.ccosched.vo.lookups.SeenAt voLookup6 = new ims.ccosched.vo.lookups.SeenAt(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.ccosched.vo.lookups.SeenAt parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.ccosched.vo.lookups.SeenAt(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSeenLocation(voLookup6);
		}
				// TreatmentIntent
		ims.domain.lookups.LookupInstance instance7 = domainObject.getTreatmentIntent();
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

			ims.ccosched.vo.lookups.TreatmentIntent voLookup7 = new ims.ccosched.vo.lookups.TreatmentIntent(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ccosched.vo.lookups.TreatmentIntent parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ccosched.vo.lookups.TreatmentIntent(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setTreatmentIntent(voLookup7);
		}
				// DateSeen
		java.util.Date DateSeen = domainObject.getDateSeen();
		if ( null != DateSeen ) 
		{
			valueObject.setDateSeen(new ims.framework.utils.Date(DateSeen) );
		}
		// DecisionToTreat
		java.util.Date DecisionToTreat = domainObject.getDecisionToTreat();
		if ( null != DecisionToTreat ) 
		{
			valueObject.setDecisionToTreat(new ims.framework.utils.Date(DecisionToTreat) );
		}
		// Actions
		valueObject.setActions(ims.ccosched.vo.domain.PatTreatPlanActionVoAssembler.createPatTreatPlanActionVoCollectionFromPatAction(map, domainObject.getActions()) );
		// patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// pkey
		valueObject.setPkey(domainObject.getPkey());
		// rkey
		valueObject.setRkey(domainObject.getRkey());
		// Episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// TreatmentplanComment
		valueObject.setTreatmentplanComment(domainObject.getTreatmentplanComment());
		// ActiveStatus
		valueObject.setActiveStatus( domainObject.isActiveStatus() );
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// PrimaryTumourHistology
		valueObject.setPrimaryTumourHistology(ims.clinicaladmin.vo.domain.TumourHistologyLiteVoAssembler.create(map, domainObject.getPrimaryTumourHistology()) );
		// ecad_date
		java.util.Date ecad_date = domainObject.getEcad_date();
		if ( null != ecad_date ) 
		{
			valueObject.setEcad_date(new ims.framework.utils.Date(ecad_date) );
		}
		// PrimaryTumourGroup
		valueObject.setPrimaryTumourGroup(ims.clinicaladmin.vo.domain.TumourGroupLiteVoAssembler.create(map, domainObject.getPrimaryTumourGroup()) );
		// PrimaryTumourSite
		valueObject.setPrimaryTumourSite(ims.clinicaladmin.vo.domain.TumourSiteLiteVoAssembler.create(map, domainObject.getPrimaryTumourSite()) );
		// TreatmentSites
		java.util.List listTreatmentSites = domainObject.getTreatmentSites();
		ims.oncology.vo.lookups.TreatmentGroupSiteCollection TreatmentSites = new ims.oncology.vo.lookups.TreatmentGroupSiteCollection();
		for(java.util.Iterator iterator = listTreatmentSites.iterator(); iterator.hasNext(); ) 
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
			ims.oncology.vo.lookups.TreatmentGroupSite voInstance = new ims.oncology.vo.lookups.TreatmentGroupSite(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.oncology.vo.lookups.TreatmentGroupSite parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.oncology.vo.lookups.TreatmentGroupSite(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			TreatmentSites.add(voInstance);
		}
		valueObject.setTreatmentSites( TreatmentSites );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.PatTreatmentPlan extractPatTreatmentPlan(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanVo valueObject) 
	{
		return 	extractPatTreatmentPlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PatTreatmentPlan extractPatTreatmentPlan(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatTreatmentPlan();
		ims.oncology.domain.objects.PatTreatmentPlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.PatTreatmentPlan)domMap.get(valueObject);
			}
			// ims.ccosched.vo.PatTreatmentPlanVo ID_PatTreatmentPlan field is unknown
			domainObject = new ims.oncology.domain.objects.PatTreatmentPlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatTreatmentPlan());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.PatTreatmentPlan)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.PatTreatmentPlan) domainFactory.getDomainObject(ims.oncology.domain.objects.PatTreatmentPlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatTreatmentPlan());

		ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getCreationUser() ) 
		{
			if (valueObject.getCreationUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getCreationUser()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getCreationUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCreationUser();	
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getCreationUser().getBoId());
			}
		}
		domainObject.setCreationUser(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value2);
		ims.core.clinical.domain.objects.AuthoringInformation value3 = null;
		if ( null != valueObject.getAuthUser() ) 
		{
			if (valueObject.getAuthUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthUser()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.AuthoringInformation)domMap.get(valueObject.getAuthUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getAuthUser();	
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.AuthoringInformation)domainFactory.getDomainObject(ims.core.clinical.domain.objects.AuthoringInformation.class, valueObject.getAuthUser().getBoId());
			}
		}
		domainObject.setAuthUser(value3);
		domainObject.setModu(valueObject.getModu());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSurgeryRequired() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSurgeryRequired().getID());
		}
		domainObject.setSurgeryRequired(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSeenLocation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSeenLocation().getID());
		}
		domainObject.setSeenLocation(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getTreatmentIntent() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getTreatmentIntent().getID());
		}
		domainObject.setTreatmentIntent(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateSeen();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateSeen(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDecisionToTreat();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDecisionToTreat(value9);
		domainObject.setActions(ims.ccosched.vo.domain.PatTreatPlanActionVoAssembler.extractPatActionSet(domainFactory, valueObject.getActions(), domainObject.getActions(), domMap));		
		ims.core.patient.domain.objects.Patient value11 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value11 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getPatient();	
			}
			else
			{
				value11 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value11);
		domainObject.setPkey(valueObject.getPkey());
		domainObject.setRkey(valueObject.getRkey());
		ims.core.admin.domain.objects.EpisodeOfCare value14 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value14 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getEpisode();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value14);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTreatmentplanComment() != null && valueObject.getTreatmentplanComment().equals(""))
		{
			valueObject.setTreatmentplanComment(null);
		}
		domainObject.setTreatmentplanComment(valueObject.getTreatmentplanComment());
		domainObject.setActiveStatus(valueObject.getActiveStatus());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value17 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value17 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value17 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value17);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourHistology value19 = null;
		if ( null != valueObject.getPrimaryTumourHistology() ) 
		{
			if (valueObject.getPrimaryTumourHistology().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumourHistology()) != null)
				{
					value19 = (ims.oncology.configuration.domain.objects.TumourHistology)domMap.get(valueObject.getPrimaryTumourHistology());
				}
			}
			else
			{
				value19 = (ims.oncology.configuration.domain.objects.TumourHistology)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourHistology.class, valueObject.getPrimaryTumourHistology().getBoId());
			}
		}
		domainObject.setPrimaryTumourHistology(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getEcad_date();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setEcad_date(value20);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroup value21 = null;
		if ( null != valueObject.getPrimaryTumourGroup() ) 
		{
			if (valueObject.getPrimaryTumourGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumourGroup()) != null)
				{
					value21 = (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(valueObject.getPrimaryTumourGroup());
				}
			}
			else
			{
				value21 = (ims.oncology.configuration.domain.objects.TumourGroup)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroup.class, valueObject.getPrimaryTumourGroup().getBoId());
			}
		}
		domainObject.setPrimaryTumourGroup(value21);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourSite value22 = null;
		if ( null != valueObject.getPrimaryTumourSite() ) 
		{
			if (valueObject.getPrimaryTumourSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumourSite()) != null)
				{
					value22 = (ims.oncology.configuration.domain.objects.TumourSite)domMap.get(valueObject.getPrimaryTumourSite());
				}
			}
			else
			{
				value22 = (ims.oncology.configuration.domain.objects.TumourSite)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourSite.class, valueObject.getPrimaryTumourSite().getBoId());
			}
		}
		domainObject.setPrimaryTumourSite(value22);
		ims.oncology.vo.lookups.TreatmentGroupSiteCollection collection23 =
	valueObject.getTreatmentSites();
	    java.util.List domainTreatmentSites = domainObject.getTreatmentSites();;			
	    int collection23Size=0;
		if (collection23 == null)
		{
			domainTreatmentSites = new java.util.ArrayList(0);
		}
		else
		{
			collection23Size = collection23.size();
		}
		
		for(int i=0; i<collection23Size; i++) 
		{
			int instanceId = collection23.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainTreatmentSites.indexOf(dom);
			if (domIdx == -1)
			{
				domainTreatmentSites.add(i, dom);
			}
			else if (i != domIdx && i < domainTreatmentSites.size())
			{
				Object tmp = domainTreatmentSites.get(i);
				domainTreatmentSites.set(i, domainTreatmentSites.get(domIdx));
				domainTreatmentSites.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j23 = domainTreatmentSites.size();
		while (j23 > collection23Size)
		{
			domainTreatmentSites.remove(j23-1);
			j23 = domainTreatmentSites.size();
		}

		domainObject.setTreatmentSites(domainTreatmentSites);		

		return domainObject;
	}

}
