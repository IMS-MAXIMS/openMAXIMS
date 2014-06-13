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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Charlotte Murphy
 */
public class WorkOnAdmissionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.WorkOnAdmissionVo copy(ims.therapies.vo.WorkOnAdmissionVo valueObjectDest, ims.therapies.vo.WorkOnAdmissionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WorkOnAdmission(valueObjectSrc.getID_WorkOnAdmission());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// PresentCareer
		valueObjectDest.setPresentCareer(valueObjectSrc.getPresentCareer());
		// PastQualifications
		valueObjectDest.setPastQualifications(valueObjectSrc.getPastQualifications());
		// EmployerName
		valueObjectDest.setEmployerName(valueObjectSrc.getEmployerName());
		// EmployerAddress
		valueObjectDest.setEmployerAddress(valueObjectSrc.getEmployerAddress());
		// EmployerPhone
		valueObjectDest.setEmployerPhone(valueObjectSrc.getEmployerPhone());
		// BenefitAdvice
		valueObjectDest.setBenefitAdvice(valueObjectSrc.getBenefitAdvice());
		// WorkSiteAssessment
		valueObjectDest.setWorkSiteAssessment(valueObjectSrc.getWorkSiteAssessment());
		// WorkSiteAssessComment
		valueObjectDest.setWorkSiteAssessComment(valueObjectSrc.getWorkSiteAssessComment());
		// ReferDEA
		valueObjectDest.setReferDEA(valueObjectSrc.getReferDEA());
		// DEAComment
		valueObjectDest.setDEAComment(valueObjectSrc.getDEAComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWorkOnAdmissionVoCollectionFromWorkOnAdmission(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission objects.
	 */
	public static ims.therapies.vo.WorkOnAdmissionVoCollection createWorkOnAdmissionVoCollectionFromWorkOnAdmission(java.util.Set domainObjectSet)	
	{
		return createWorkOnAdmissionVoCollectionFromWorkOnAdmission(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission objects.
	 */
	public static ims.therapies.vo.WorkOnAdmissionVoCollection createWorkOnAdmissionVoCollectionFromWorkOnAdmission(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.WorkOnAdmissionVoCollection voList = new ims.therapies.vo.WorkOnAdmissionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject = (ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission) iterator.next();
			ims.therapies.vo.WorkOnAdmissionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission objects.
	 */
	public static ims.therapies.vo.WorkOnAdmissionVoCollection createWorkOnAdmissionVoCollectionFromWorkOnAdmission(java.util.List domainObjectList) 
	{
		return createWorkOnAdmissionVoCollectionFromWorkOnAdmission(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission objects.
	 */
	public static ims.therapies.vo.WorkOnAdmissionVoCollection createWorkOnAdmissionVoCollectionFromWorkOnAdmission(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.WorkOnAdmissionVoCollection voList = new ims.therapies.vo.WorkOnAdmissionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject = (ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission) domainObjectList.get(i);
			ims.therapies.vo.WorkOnAdmissionVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWorkOnAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WorkOnAdmissionVoCollection voCollection) 
	 {
	 	return extractWorkOnAdmissionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWorkOnAdmissionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WorkOnAdmissionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WorkOnAdmissionVo vo = voCollection.get(i);
			ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject = WorkOnAdmissionVoAssembler.extractWorkOnAdmission(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWorkOnAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WorkOnAdmissionVoCollection voCollection) 
	 {
	 	return extractWorkOnAdmissionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWorkOnAdmissionList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WorkOnAdmissionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.WorkOnAdmissionVo vo = voCollection.get(i);
			ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject = WorkOnAdmissionVoAssembler.extractWorkOnAdmission(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission object.
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission
	 */
	 public static ims.therapies.vo.WorkOnAdmissionVo create(ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.WorkOnAdmissionVo create(DomainObjectMap map, ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.WorkOnAdmissionVo valueObject = (ims.therapies.vo.WorkOnAdmissionVo) map.getValueObject(domainObject, ims.therapies.vo.WorkOnAdmissionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.WorkOnAdmissionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission
	 */
	 public static ims.therapies.vo.WorkOnAdmissionVo insert(ims.therapies.vo.WorkOnAdmissionVo valueObject, ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject) 
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
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission
	 */
	 public static ims.therapies.vo.WorkOnAdmissionVo insert(DomainObjectMap map, ims.therapies.vo.WorkOnAdmissionVo valueObject, ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WorkOnAdmission(domainObject.getId());
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
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// PresentCareer
		valueObject.setPresentCareer(domainObject.getPresentCareer());
		// PastQualifications
		valueObject.setPastQualifications(domainObject.getPastQualifications());
		// EmployerName
		valueObject.setEmployerName(domainObject.getEmployerName());
		// EmployerAddress
		valueObject.setEmployerAddress(domainObject.getEmployerAddress());
		// EmployerPhone
		valueObject.setEmployerPhone(domainObject.getEmployerPhone());
		// BenefitAdvice
		valueObject.setBenefitAdvice(domainObject.getBenefitAdvice());
		// WorkSiteAssessment
		ims.domain.lookups.LookupInstance instance10 = domainObject.getWorkSiteAssessment();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup10 = new ims.core.vo.lookups.YesNoUnknown(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNoUnknown(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setWorkSiteAssessment(voLookup10);
		}
				// WorkSiteAssessComment
		valueObject.setWorkSiteAssessComment(domainObject.getWorkSiteAssessComment());
		// ReferDEA
		ims.domain.lookups.LookupInstance instance12 = domainObject.getReferDEA();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup12 = new ims.core.vo.lookups.YesNoUnknown(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNoUnknown(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setReferDEA(voLookup12);
		}
				// DEAComment
		valueObject.setDEAComment(domainObject.getDEAComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission extractWorkOnAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WorkOnAdmissionVo valueObject) 
	{
		return 	extractWorkOnAdmission(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission extractWorkOnAdmission(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.WorkOnAdmissionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WorkOnAdmission();
		ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission)domMap.get(valueObject);
			}
			// ims.therapies.vo.WorkOnAdmissionVo ID_WorkOnAdmission field is unknown
			domainObject = new ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WorkOnAdmission());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission)domMap.get(key);
			}
			domainObject = (ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission) domainFactory.getDomainObject(ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WorkOnAdmission());

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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAuthoringDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value2);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPresentCareer() != null && valueObject.getPresentCareer().equals(""))
		{
			valueObject.setPresentCareer(null);
		}
		domainObject.setPresentCareer(valueObject.getPresentCareer());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPastQualifications() != null && valueObject.getPastQualifications().equals(""))
		{
			valueObject.setPastQualifications(null);
		}
		domainObject.setPastQualifications(valueObject.getPastQualifications());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEmployerName() != null && valueObject.getEmployerName().equals(""))
		{
			valueObject.setEmployerName(null);
		}
		domainObject.setEmployerName(valueObject.getEmployerName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEmployerAddress() != null && valueObject.getEmployerAddress().equals(""))
		{
			valueObject.setEmployerAddress(null);
		}
		domainObject.setEmployerAddress(valueObject.getEmployerAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEmployerPhone() != null && valueObject.getEmployerPhone().equals(""))
		{
			valueObject.setEmployerPhone(null);
		}
		domainObject.setEmployerPhone(valueObject.getEmployerPhone());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBenefitAdvice() != null && valueObject.getBenefitAdvice().equals(""))
		{
			valueObject.setBenefitAdvice(null);
		}
		domainObject.setBenefitAdvice(valueObject.getBenefitAdvice());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getWorkSiteAssessment() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getWorkSiteAssessment().getID());
		}
		domainObject.setWorkSiteAssessment(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWorkSiteAssessComment() != null && valueObject.getWorkSiteAssessComment().equals(""))
		{
			valueObject.setWorkSiteAssessComment(null);
		}
		domainObject.setWorkSiteAssessComment(valueObject.getWorkSiteAssessComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getReferDEA() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getReferDEA().getID());
		}
		domainObject.setReferDEA(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDEAComment() != null && valueObject.getDEAComment().equals(""))
		{
			valueObject.setDEAComment(null);
		}
		domainObject.setDEAComment(valueObject.getDEAComment());

		return domainObject;
	}

}
