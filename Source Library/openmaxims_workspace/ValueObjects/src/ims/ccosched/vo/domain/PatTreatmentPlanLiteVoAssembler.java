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
package ims.ccosched.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class PatTreatmentPlanLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ccosched.vo.PatTreatmentPlanLiteVo copy(ims.ccosched.vo.PatTreatmentPlanLiteVo valueObjectDest, ims.ccosched.vo.PatTreatmentPlanLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatTreatmentPlan(valueObjectSrc.getID_PatTreatmentPlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanLiteVoCollection createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(java.util.Set domainObjectSet)	
	{
		return createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanLiteVoCollection createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ccosched.vo.PatTreatmentPlanLiteVoCollection voList = new ims.ccosched.vo.PatTreatmentPlanLiteVoCollection();
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
			ims.ccosched.vo.PatTreatmentPlanLiteVo vo = create(map, domainObject);
			
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
	public static ims.ccosched.vo.PatTreatmentPlanLiteVoCollection createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(java.util.List domainObjectList) 
	{
		return createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatTreatmentPlan objects.
	 */
	public static ims.ccosched.vo.PatTreatmentPlanLiteVoCollection createPatTreatmentPlanLiteVoCollectionFromPatTreatmentPlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ccosched.vo.PatTreatmentPlanLiteVoCollection voList = new ims.ccosched.vo.PatTreatmentPlanLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = (ims.oncology.domain.objects.PatTreatmentPlan) domainObjectList.get(i);
			ims.ccosched.vo.PatTreatmentPlanLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatTreatmentPlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanLiteVoCollection voCollection) 
	 {
	 	return extractPatTreatmentPlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatTreatmentPlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatTreatmentPlanLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = PatTreatmentPlanLiteVoAssembler.extractPatTreatmentPlan(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatTreatmentPlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanLiteVoCollection voCollection) 
	 {
	 	return extractPatTreatmentPlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatTreatmentPlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatTreatmentPlanLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatTreatmentPlan domainObject = PatTreatmentPlanLiteVoAssembler.extractPatTreatmentPlan(domainFactory, vo, domMap);

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
	 public static ims.ccosched.vo.PatTreatmentPlanLiteVo create(ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
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
	  public static ims.ccosched.vo.PatTreatmentPlanLiteVo create(DomainObjectMap map, ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ccosched.vo.PatTreatmentPlanLiteVo valueObject = (ims.ccosched.vo.PatTreatmentPlanLiteVo) map.getValueObject(domainObject, ims.ccosched.vo.PatTreatmentPlanLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ccosched.vo.PatTreatmentPlanLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ccosched.vo.PatTreatmentPlanLiteVo insert(ims.ccosched.vo.PatTreatmentPlanLiteVo valueObject, ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
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
	 public static ims.ccosched.vo.PatTreatmentPlanLiteVo insert(DomainObjectMap map, ims.ccosched.vo.PatTreatmentPlanLiteVo valueObject, ims.oncology.domain.objects.PatTreatmentPlan domainObject) 
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
			
		// TreatmentIntent
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTreatmentIntent();
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

			ims.ccosched.vo.lookups.TreatmentIntent voLookup1 = new ims.ccosched.vo.lookups.TreatmentIntent(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.ccosched.vo.lookups.TreatmentIntent parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.ccosched.vo.lookups.TreatmentIntent(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTreatmentIntent(voLookup1);
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
	public static ims.oncology.domain.objects.PatTreatmentPlan extractPatTreatmentPlan(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanLiteVo valueObject) 
	{
		return 	extractPatTreatmentPlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PatTreatmentPlan extractPatTreatmentPlan(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatTreatmentPlanLiteVo valueObject, HashMap domMap) 
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
			// ims.ccosched.vo.PatTreatmentPlanLiteVo ID_PatTreatmentPlan field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTreatmentIntent() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTreatmentIntent().getID());
		}
		domainObject.setTreatmentIntent(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateSeen();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateSeen(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDecisionToTreat();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDecisionToTreat(value3);
		domainObject.setActions(ims.ccosched.vo.domain.PatTreatPlanActionVoAssembler.extractPatActionSet(domainFactory, valueObject.getActions(), domainObject.getActions(), domMap));		
		ims.core.patient.domain.objects.Patient value5 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value5 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getPatient();	
			}
			else
			{
				value5 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value5);
		domainObject.setPkey(valueObject.getPkey());
		domainObject.setRkey(valueObject.getRkey());
		ims.core.admin.domain.objects.EpisodeOfCare value8 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getEpisode();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTreatmentplanComment() != null && valueObject.getTreatmentplanComment().equals(""))
		{
			valueObject.setTreatmentplanComment(null);
		}
		domainObject.setTreatmentplanComment(valueObject.getTreatmentplanComment());
		domainObject.setActiveStatus(valueObject.getActiveStatus());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourHistology value13 = null;
		if ( null != valueObject.getPrimaryTumourHistology() ) 
		{
			if (valueObject.getPrimaryTumourHistology().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumourHistology()) != null)
				{
					value13 = (ims.oncology.configuration.domain.objects.TumourHistology)domMap.get(valueObject.getPrimaryTumourHistology());
				}
			}
			else
			{
				value13 = (ims.oncology.configuration.domain.objects.TumourHistology)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourHistology.class, valueObject.getPrimaryTumourHistology().getBoId());
			}
		}
		domainObject.setPrimaryTumourHistology(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getEcad_date();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setEcad_date(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourGroup value15 = null;
		if ( null != valueObject.getPrimaryTumourGroup() ) 
		{
			if (valueObject.getPrimaryTumourGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumourGroup()) != null)
				{
					value15 = (ims.oncology.configuration.domain.objects.TumourGroup)domMap.get(valueObject.getPrimaryTumourGroup());
				}
			}
			else
			{
				value15 = (ims.oncology.configuration.domain.objects.TumourGroup)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroup.class, valueObject.getPrimaryTumourGroup().getBoId());
			}
		}
		domainObject.setPrimaryTumourGroup(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.oncology.configuration.domain.objects.TumourSite value16 = null;
		if ( null != valueObject.getPrimaryTumourSite() ) 
		{
			if (valueObject.getPrimaryTumourSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumourSite()) != null)
				{
					value16 = (ims.oncology.configuration.domain.objects.TumourSite)domMap.get(valueObject.getPrimaryTumourSite());
				}
			}
			else
			{
				value16 = (ims.oncology.configuration.domain.objects.TumourSite)domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourSite.class, valueObject.getPrimaryTumourSite().getBoId());
			}
		}
		domainObject.setPrimaryTumourSite(value16);
		ims.oncology.vo.lookups.TreatmentGroupSiteCollection collection17 =
	valueObject.getTreatmentSites();
	    java.util.List domainTreatmentSites = domainObject.getTreatmentSites();;			
	    int collection17Size=0;
		if (collection17 == null)
		{
			domainTreatmentSites = new java.util.ArrayList(0);
		}
		else
		{
			collection17Size = collection17.size();
		}
		
		for(int i=0; i<collection17Size; i++) 
		{
			int instanceId = collection17.get(i).getID();
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
		int j17 = domainTreatmentSites.size();
		while (j17 > collection17Size)
		{
			domainTreatmentSites.remove(j17-1);
			j17 = domainTreatmentSites.size();
		}

		domainObject.setTreatmentSites(domainTreatmentSites);		

		return domainObject;
	}

}
