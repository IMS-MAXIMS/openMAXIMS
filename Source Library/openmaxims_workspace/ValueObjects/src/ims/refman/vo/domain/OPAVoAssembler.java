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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class OPAVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.OPAVo copy(ims.RefMan.vo.OPAVo valueObjectDest, ims.RefMan.vo.OPAVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPA(valueObjectSrc.getID_OPA());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// SPR
		valueObjectDest.setSPR(valueObjectSrc.getSPR());
		// AssociateSpecialist
		valueObjectDest.setAssociateSpecialist(valueObjectSrc.getAssociateSpecialist());
		// AnyDoctorToSee
		valueObjectDest.setAnyDoctorToSee(valueObjectSrc.getAnyDoctorToSee());
		// OtherHCP
		valueObjectDest.setOtherHCP(valueObjectSrc.getOtherHCP());
		// OtherHCPValue
		valueObjectDest.setOtherHCPValue(valueObjectSrc.getOtherHCPValue());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// NamedConsultant
		valueObjectDest.setNamedConsultant(valueObjectSrc.getNamedConsultant());
		// NamedConsultantValue
		valueObjectDest.setNamedConsultantValue(valueObjectSrc.getNamedConsultantValue());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOPAVoCollectionFromOPA(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OPA objects.
	 */
	public static ims.RefMan.vo.OPAVoCollection createOPAVoCollectionFromOPA(java.util.Set domainObjectSet)	
	{
		return createOPAVoCollectionFromOPA(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OPA objects.
	 */
	public static ims.RefMan.vo.OPAVoCollection createOPAVoCollectionFromOPA(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.OPAVoCollection voList = new ims.RefMan.vo.OPAVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.OPA domainObject = (ims.RefMan.domain.objects.OPA) iterator.next();
			ims.RefMan.vo.OPAVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OPA objects.
	 */
	public static ims.RefMan.vo.OPAVoCollection createOPAVoCollectionFromOPA(java.util.List domainObjectList) 
	{
		return createOPAVoCollectionFromOPA(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OPA objects.
	 */
	public static ims.RefMan.vo.OPAVoCollection createOPAVoCollectionFromOPA(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.OPAVoCollection voList = new ims.RefMan.vo.OPAVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.OPA domainObject = (ims.RefMan.domain.objects.OPA) domainObjectList.get(i);
			ims.RefMan.vo.OPAVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.OPA set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPASet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OPAVoCollection voCollection) 
	 {
	 	return extractOPASet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPASet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OPAVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OPAVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OPA domainObject = OPAVoAssembler.extractOPA(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.OPA list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPAList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OPAVoCollection voCollection) 
	 {
	 	return extractOPAList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPAList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OPAVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OPAVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OPA domainObject = OPAVoAssembler.extractOPA(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.OPA object.
	 * @param domainObject ims.RefMan.domain.objects.OPA
	 */
	 public static ims.RefMan.vo.OPAVo create(ims.RefMan.domain.objects.OPA domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.OPA object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.OPAVo create(DomainObjectMap map, ims.RefMan.domain.objects.OPA domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.OPAVo valueObject = (ims.RefMan.vo.OPAVo) map.getValueObject(domainObject, ims.RefMan.vo.OPAVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.OPAVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.OPA
	 */
	 public static ims.RefMan.vo.OPAVo insert(ims.RefMan.vo.OPAVo valueObject, ims.RefMan.domain.objects.OPA domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.OPA
	 */
	 public static ims.RefMan.vo.OPAVo insert(DomainObjectMap map, ims.RefMan.vo.OPAVo valueObject, ims.RefMan.domain.objects.OPA domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPA(domainObject.getId());
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
			
		// Consultant
		valueObject.setConsultant( domainObject.isConsultant() );
		// SPR
		valueObject.setSPR( domainObject.isSPR() );
		// AssociateSpecialist
		valueObject.setAssociateSpecialist( domainObject.isAssociateSpecialist() );
		// AnyDoctorToSee
		valueObject.setAnyDoctorToSee( domainObject.isAnyDoctorToSee() );
		// OtherHCP
		valueObject.setOtherHCP( domainObject.isOtherHCP() );
		// OtherHCPValue
		ims.domain.lookups.LookupInstance instance6 = domainObject.getOtherHCPValue();
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

			ims.core.vo.lookups.OtherHCP voLookup6 = new ims.core.vo.lookups.OtherHCP(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.OtherHCP parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.OtherHCP(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setOtherHCPValue(voLookup6);
		}
				// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// NamedConsultant
		valueObject.setNamedConsultant( domainObject.isNamedConsultant() );
		// NamedConsultantValue
		valueObject.setNamedConsultantValue(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getNamedConsultantValue()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.OPA extractOPA(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OPAVo valueObject) 
	{
		return 	extractOPA(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.OPA extractOPA(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OPAVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPA();
		ims.RefMan.domain.objects.OPA domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.OPA)domMap.get(valueObject);
			}
			// ims.RefMan.vo.OPAVo ID_OPA field is unknown
			domainObject = new ims.RefMan.domain.objects.OPA();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPA());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.OPA)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.OPA) domainFactory.getDomainObject(ims.RefMan.domain.objects.OPA.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPA());

		domainObject.setConsultant(valueObject.getConsultant());
		domainObject.setSPR(valueObject.getSPR());
		domainObject.setAssociateSpecialist(valueObject.getAssociateSpecialist());
		domainObject.setAnyDoctorToSee(valueObject.getAnyDoctorToSee());
		domainObject.setOtherHCP(valueObject.getOtherHCP());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getOtherHCPValue() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getOtherHCPValue().getID());
		}
		domainObject.setOtherHCPValue(value6);
		ims.RefMan.domain.objects.CatsReferral value7 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value7 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCatsReferral();	
			}
			else
			{
				value7 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value7);
		domainObject.setNamedConsultant(valueObject.getNamedConsultant());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value9 = null;
		if ( null != valueObject.getNamedConsultantValue() ) 
		{
			if (valueObject.getNamedConsultantValue().getBoId() == null)
			{
				if (domMap.get(valueObject.getNamedConsultantValue()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getNamedConsultantValue());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getNamedConsultantValue().getBoId());
			}
		}
		domainObject.setNamedConsultantValue(value9);

		return domainObject;
	}

}
