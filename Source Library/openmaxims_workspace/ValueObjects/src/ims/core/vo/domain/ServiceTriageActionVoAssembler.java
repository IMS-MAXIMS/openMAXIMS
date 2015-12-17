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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ServiceTriageActionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ServiceTriageActionVo copy(ims.core.vo.ServiceTriageActionVo valueObjectDest, ims.core.vo.ServiceTriageActionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ServiceTriageAction(valueObjectSrc.getID_ServiceTriageAction());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// OPA
		valueObjectDest.setOPA(valueObjectSrc.getOPA());
		// DirectToList
		valueObjectDest.setDirectToList(valueObjectSrc.getDirectToList());
		// DirectToListAndOPA
		valueObjectDest.setDirectToListAndOPA(valueObjectSrc.getDirectToListAndOPA());
		// SPR
		valueObjectDest.setSPR(valueObjectSrc.getSPR());
		// LinkedDiagnostic
		valueObjectDest.setLinkedDiagnostic(valueObjectSrc.getLinkedDiagnostic());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// AssociateSpecialist
		valueObjectDest.setAssociateSpecialist(valueObjectSrc.getAssociateSpecialist());
		// AnyDoctorToSee
		valueObjectDest.setAnyDoctorToSee(valueObjectSrc.getAnyDoctorToSee());
		// OtherHCP
		valueObjectDest.setOtherHCP(valueObjectSrc.getOtherHCP());
		// OtherHCPValues
		valueObjectDest.setOtherHCPValues(valueObjectSrc.getOtherHCPValues());
		// LinkedOPAsAndDiagnostic
		valueObjectDest.setLinkedOPAsAndDiagnostic(valueObjectSrc.getLinkedOPAsAndDiagnostic());
		// OPAAndLinkedDiagostic
		valueObjectDest.setOPAAndLinkedDiagostic(valueObjectSrc.getOPAAndLinkedDiagostic());
		// LinkedOPAs
		valueObjectDest.setLinkedOPAs(valueObjectSrc.getLinkedOPAs());
		// DefaultActionForManualReferral
		valueObjectDest.setDefaultActionForManualReferral(valueObjectSrc.getDefaultActionForManualReferral());
		// DefaultActionForCABReferral
		valueObjectDest.setDefaultActionForCABReferral(valueObjectSrc.getDefaultActionForCABReferral());
		// ChangeCABOPA
		valueObjectDest.setChangeCABOPA(valueObjectSrc.getChangeCABOPA());
		// ChangeCABOPAandDirectToList
		valueObjectDest.setChangeCABOPAandDirectToList(valueObjectSrc.getChangeCABOPAandDirectToList());
		// CABOPAandDirectToList
		valueObjectDest.setCABOPAandDirectToList(valueObjectSrc.getCABOPAandDirectToList());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createServiceTriageActionVoCollectionFromServiceTriageAction(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.domain.objects.ServiceTriageAction objects.
	 */
	public static ims.core.vo.ServiceTriageActionVoCollection createServiceTriageActionVoCollectionFromServiceTriageAction(java.util.Set domainObjectSet)	
	{
		return createServiceTriageActionVoCollectionFromServiceTriageAction(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.domain.objects.ServiceTriageAction objects.
	 */
	public static ims.core.vo.ServiceTriageActionVoCollection createServiceTriageActionVoCollectionFromServiceTriageAction(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ServiceTriageActionVoCollection voList = new ims.core.vo.ServiceTriageActionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.domain.objects.ServiceTriageAction domainObject = (ims.core.resource.domain.objects.ServiceTriageAction) iterator.next();
			ims.core.vo.ServiceTriageActionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.domain.objects.ServiceTriageAction objects.
	 */
	public static ims.core.vo.ServiceTriageActionVoCollection createServiceTriageActionVoCollectionFromServiceTriageAction(java.util.List domainObjectList) 
	{
		return createServiceTriageActionVoCollectionFromServiceTriageAction(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.domain.objects.ServiceTriageAction objects.
	 */
	public static ims.core.vo.ServiceTriageActionVoCollection createServiceTriageActionVoCollectionFromServiceTriageAction(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ServiceTriageActionVoCollection voList = new ims.core.vo.ServiceTriageActionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.domain.objects.ServiceTriageAction domainObject = (ims.core.resource.domain.objects.ServiceTriageAction) domainObjectList.get(i);
			ims.core.vo.ServiceTriageActionVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.domain.objects.ServiceTriageAction set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractServiceTriageActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceTriageActionVoCollection voCollection) 
	 {
	 	return extractServiceTriageActionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractServiceTriageActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceTriageActionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ServiceTriageActionVo vo = voCollection.get(i);
			ims.core.resource.domain.objects.ServiceTriageAction domainObject = ServiceTriageActionVoAssembler.extractServiceTriageAction(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.domain.objects.ServiceTriageAction list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractServiceTriageActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceTriageActionVoCollection voCollection) 
	 {
	 	return extractServiceTriageActionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractServiceTriageActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceTriageActionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ServiceTriageActionVo vo = voCollection.get(i);
			ims.core.resource.domain.objects.ServiceTriageAction domainObject = ServiceTriageActionVoAssembler.extractServiceTriageAction(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.domain.objects.ServiceTriageAction object.
	 * @param domainObject ims.core.resource.domain.objects.ServiceTriageAction
	 */
	 public static ims.core.vo.ServiceTriageActionVo create(ims.core.resource.domain.objects.ServiceTriageAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.domain.objects.ServiceTriageAction object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ServiceTriageActionVo create(DomainObjectMap map, ims.core.resource.domain.objects.ServiceTriageAction domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ServiceTriageActionVo valueObject = (ims.core.vo.ServiceTriageActionVo) map.getValueObject(domainObject, ims.core.vo.ServiceTriageActionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ServiceTriageActionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.domain.objects.ServiceTriageAction
	 */
	 public static ims.core.vo.ServiceTriageActionVo insert(ims.core.vo.ServiceTriageActionVo valueObject, ims.core.resource.domain.objects.ServiceTriageAction domainObject) 
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
	 * @param domainObject ims.core.resource.domain.objects.ServiceTriageAction
	 */
	 public static ims.core.vo.ServiceTriageActionVo insert(DomainObjectMap map, ims.core.vo.ServiceTriageActionVo valueObject, ims.core.resource.domain.objects.ServiceTriageAction domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ServiceTriageAction(domainObject.getId());
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
			
		// Service
		if (domainObject.getService() != null)
		{
			if(domainObject.getService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(domainObject.getService().getId(), domainObject.getService().getVersion()));
			}
		}
		// OPA
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOPA();
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

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup2 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOPA(voLookup2);
		}
				// DirectToList
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDirectToList();
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

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup3 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDirectToList(voLookup3);
		}
				// DirectToListAndOPA
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDirectToListAndOPA();
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

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup4 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDirectToListAndOPA(voLookup4);
		}
				// SPR
		valueObject.setSPR( domainObject.isSPR() );
		// LinkedDiagnostic
		ims.domain.lookups.LookupInstance instance6 = domainObject.getLinkedDiagnostic();
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

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup6 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setLinkedDiagnostic(voLookup6);
		}
				// Consultant
		valueObject.setConsultant( domainObject.isConsultant() );
		// AssociateSpecialist
		valueObject.setAssociateSpecialist( domainObject.isAssociateSpecialist() );
		// AnyDoctorToSee
		valueObject.setAnyDoctorToSee( domainObject.isAnyDoctorToSee() );
		// OtherHCP
		valueObject.setOtherHCP( domainObject.isOtherHCP() );
		// OtherHCPValues
		java.util.List listOtherHCPValues = domainObject.getOtherHCPValues();
		ims.core.vo.lookups.OtherHCPCollection OtherHCPValues = new ims.core.vo.lookups.OtherHCPCollection();
		for(java.util.Iterator iterator = listOtherHCPValues.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.OtherHCP voInstance = new ims.core.vo.lookups.OtherHCP(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.OtherHCP parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.OtherHCP(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			OtherHCPValues.add(voInstance);
		}
		valueObject.setOtherHCPValues( OtherHCPValues );
		// LinkedOPAsAndDiagnostic
		ims.domain.lookups.LookupInstance instance12 = domainObject.getLinkedOPAsAndDiagnostic();
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

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup12 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setLinkedOPAsAndDiagnostic(voLookup12);
		}
				// OPAAndLinkedDiagostic
		ims.domain.lookups.LookupInstance instance13 = domainObject.getOPAAndLinkedDiagostic();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup13 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setOPAAndLinkedDiagostic(voLookup13);
		}
				// LinkedOPAs
		ims.domain.lookups.LookupInstance instance14 = domainObject.getLinkedOPAs();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup14 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setLinkedOPAs(voLookup14);
		}
				// DefaultActionForManualReferral
		ims.domain.lookups.LookupInstance instance15 = domainObject.getDefaultActionForManualReferral();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.DefaultTriageActionForManualReferral voLookup15 = new ims.RefMan.vo.lookups.DefaultTriageActionForManualReferral(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.RefMan.vo.lookups.DefaultTriageActionForManualReferral parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.RefMan.vo.lookups.DefaultTriageActionForManualReferral(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setDefaultActionForManualReferral(voLookup15);
		}
				// DefaultActionForCABReferral
		ims.domain.lookups.LookupInstance instance16 = domainObject.getDefaultActionForCABReferral();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.DefaultTriageActionForCABReferral voLookup16 = new ims.RefMan.vo.lookups.DefaultTriageActionForCABReferral(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.RefMan.vo.lookups.DefaultTriageActionForCABReferral parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.RefMan.vo.lookups.DefaultTriageActionForCABReferral(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setDefaultActionForCABReferral(voLookup16);
		}
				// ChangeCABOPA
		ims.domain.lookups.LookupInstance instance17 = domainObject.getChangeCABOPA();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup17 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setChangeCABOPA(voLookup17);
		}
				// ChangeCABOPAandDirectToList
		ims.domain.lookups.LookupInstance instance18 = domainObject.getChangeCABOPAandDirectToList();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup18 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setChangeCABOPAandDirectToList(voLookup18);
		}
				// CABOPAandDirectToList
		ims.domain.lookups.LookupInstance instance19 = domainObject.getCABOPAandDirectToList();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReferralTypeForTriageAction voLookup19 = new ims.core.vo.lookups.ReferralTypeForTriageAction(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.ReferralTypeForTriageAction parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.core.vo.lookups.ReferralTypeForTriageAction(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setCABOPAandDirectToList(voLookup19);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.domain.objects.ServiceTriageAction extractServiceTriageAction(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceTriageActionVo valueObject) 
	{
		return 	extractServiceTriageAction(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.domain.objects.ServiceTriageAction extractServiceTriageAction(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceTriageActionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ServiceTriageAction();
		ims.core.resource.domain.objects.ServiceTriageAction domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.domain.objects.ServiceTriageAction)domMap.get(valueObject);
			}
			// ims.core.vo.ServiceTriageActionVo ID_ServiceTriageAction field is unknown
			domainObject = new ims.core.resource.domain.objects.ServiceTriageAction();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ServiceTriageAction());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.domain.objects.ServiceTriageAction)domMap.get(key);
			}
			domainObject = (ims.core.resource.domain.objects.ServiceTriageAction) domainFactory.getDomainObject(ims.core.resource.domain.objects.ServiceTriageAction.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ServiceTriageAction());

		ims.core.clinical.domain.objects.Service value1 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getService();	
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getOPA() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOPA().getID());
		}
		domainObject.setOPA(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDirectToList() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDirectToList().getID());
		}
		domainObject.setDirectToList(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDirectToListAndOPA() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDirectToListAndOPA().getID());
		}
		domainObject.setDirectToListAndOPA(value4);
		domainObject.setSPR(valueObject.getSPR());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getLinkedDiagnostic() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getLinkedDiagnostic().getID());
		}
		domainObject.setLinkedDiagnostic(value6);
		domainObject.setConsultant(valueObject.getConsultant());
		domainObject.setAssociateSpecialist(valueObject.getAssociateSpecialist());
		domainObject.setAnyDoctorToSee(valueObject.getAnyDoctorToSee());
		domainObject.setOtherHCP(valueObject.getOtherHCP());
		ims.core.vo.lookups.OtherHCPCollection collection11 =
	valueObject.getOtherHCPValues();
	    java.util.List domainOtherHCPValues = domainObject.getOtherHCPValues();;			
	    int collection11Size=0;
		if (collection11 == null)
		{
			domainOtherHCPValues = new java.util.ArrayList(0);
		}
		else
		{
			collection11Size = collection11.size();
		}
		
		for(int i=0; i<collection11Size; i++) 
		{
			int instanceId = collection11.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainOtherHCPValues.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherHCPValues.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherHCPValues.size())
			{
				Object tmp = domainOtherHCPValues.get(i);
				domainOtherHCPValues.set(i, domainOtherHCPValues.get(domIdx));
				domainOtherHCPValues.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j11 = domainOtherHCPValues.size();
		while (j11 > collection11Size)
		{
			domainOtherHCPValues.remove(j11-1);
			j11 = domainOtherHCPValues.size();
		}

		domainObject.setOtherHCPValues(domainOtherHCPValues);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getLinkedOPAsAndDiagnostic() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getLinkedOPAsAndDiagnostic().getID());
		}
		domainObject.setLinkedOPAsAndDiagnostic(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getOPAAndLinkedDiagostic() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getOPAAndLinkedDiagostic().getID());
		}
		domainObject.setOPAAndLinkedDiagostic(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getLinkedOPAs() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getLinkedOPAs().getID());
		}
		domainObject.setLinkedOPAs(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getDefaultActionForManualReferral() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getDefaultActionForManualReferral().getID());
		}
		domainObject.setDefaultActionForManualReferral(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getDefaultActionForCABReferral() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getDefaultActionForCABReferral().getID());
		}
		domainObject.setDefaultActionForCABReferral(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getChangeCABOPA() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getChangeCABOPA().getID());
		}
		domainObject.setChangeCABOPA(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getChangeCABOPAandDirectToList() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getChangeCABOPAandDirectToList().getID());
		}
		domainObject.setChangeCABOPAandDirectToList(value18);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getCABOPAandDirectToList() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getCABOPAandDirectToList().getID());
		}
		domainObject.setCABOPAandDirectToList(value19);

		return domainObject;
	}

}
