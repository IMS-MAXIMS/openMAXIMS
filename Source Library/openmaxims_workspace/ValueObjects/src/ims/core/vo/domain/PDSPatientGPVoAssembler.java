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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PDSPatientGPVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSPatientGPVo copy(ims.core.vo.PDSPatientGPVo valueObjectDest, ims.core.vo.PDSPatientGPVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientGP(valueObjectSrc.getID_PatientGP());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// lkp_provisiontype
		valueObjectDest.setLkp_provisiontype(valueObjectSrc.getLkp_provisiontype());
		// primaryCareIdentifier
		valueObjectDest.setPrimaryCareIdentifier(valueObjectSrc.getPrimaryCareIdentifier());
		// objectidentifier
		valueObjectDest.setObjectidentifier(valueObjectSrc.getObjectidentifier());
		// beffdate
		valueObjectDest.setBeffdate(valueObjectSrc.getBeffdate());
		// beffdatecnf
		valueObjectDest.setBeffdatecnf(valueObjectSrc.getBeffdatecnf());
		// betdate
		valueObjectDest.setBetdate(valueObjectSrc.getBetdate());
		// betdatecnf
		valueObjectDest.setBetdatecnf(valueObjectSrc.getBetdatecnf());
		// Gp
		valueObjectDest.setGp(valueObjectSrc.getGp());
		// practice
		valueObjectDest.setPractice(valueObjectSrc.getPractice());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSPatientGPVoCollectionFromPatientGP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.domain.objects.PatientGP objects.
	 */
	public static ims.core.vo.PDSPatientGPVoCollection createPDSPatientGPVoCollectionFromPatientGP(java.util.Set domainObjectSet)	
	{
		return createPDSPatientGPVoCollectionFromPatientGP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.domain.objects.PatientGP objects.
	 */
	public static ims.core.vo.PDSPatientGPVoCollection createPDSPatientGPVoCollectionFromPatientGP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSPatientGPVoCollection voList = new ims.core.vo.PDSPatientGPVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.domain.objects.PatientGP domainObject = (ims.core.domain.objects.PatientGP) iterator.next();
			ims.core.vo.PDSPatientGPVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.domain.objects.PatientGP objects.
	 */
	public static ims.core.vo.PDSPatientGPVoCollection createPDSPatientGPVoCollectionFromPatientGP(java.util.List domainObjectList) 
	{
		return createPDSPatientGPVoCollectionFromPatientGP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.domain.objects.PatientGP objects.
	 */
	public static ims.core.vo.PDSPatientGPVoCollection createPDSPatientGPVoCollectionFromPatientGP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSPatientGPVoCollection voList = new ims.core.vo.PDSPatientGPVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.domain.objects.PatientGP domainObject = (ims.core.domain.objects.PatientGP) domainObjectList.get(i);
			ims.core.vo.PDSPatientGPVo vo = create(map, domainObject);

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
	 * Create the ims.core.domain.objects.PatientGP set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientGPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientGPVoCollection voCollection) 
	 {
	 	return extractPatientGPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientGPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientGPVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSPatientGPVo vo = voCollection.get(i);
			ims.core.domain.objects.PatientGP domainObject = PDSPatientGPVoAssembler.extractPatientGP(domainFactory, vo, domMap);

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
	 * Create the ims.core.domain.objects.PatientGP list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientGPList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientGPVoCollection voCollection) 
	 {
	 	return extractPatientGPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientGPList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientGPVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSPatientGPVo vo = voCollection.get(i);
			ims.core.domain.objects.PatientGP domainObject = PDSPatientGPVoAssembler.extractPatientGP(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.domain.objects.PatientGP object.
	 * @param domainObject ims.core.domain.objects.PatientGP
	 */
	 public static ims.core.vo.PDSPatientGPVo create(ims.core.domain.objects.PatientGP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.domain.objects.PatientGP object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSPatientGPVo create(DomainObjectMap map, ims.core.domain.objects.PatientGP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSPatientGPVo valueObject = (ims.core.vo.PDSPatientGPVo) map.getValueObject(domainObject, ims.core.vo.PDSPatientGPVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSPatientGPVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.domain.objects.PatientGP
	 */
	 public static ims.core.vo.PDSPatientGPVo insert(ims.core.vo.PDSPatientGPVo valueObject, ims.core.domain.objects.PatientGP domainObject) 
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
	 * @param domainObject ims.core.domain.objects.PatientGP
	 */
	 public static ims.core.vo.PDSPatientGPVo insert(DomainObjectMap map, ims.core.vo.PDSPatientGPVo valueObject, ims.core.domain.objects.PatientGP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientGP(domainObject.getId());
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
			
		// lkp_provisiontype
		ims.domain.lookups.LookupInstance instance1 = domainObject.getLkp_provisiontype();
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

			ims.core.vo.lookups.PDSProvisionType voLookup1 = new ims.core.vo.lookups.PDSProvisionType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PDSProvisionType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PDSProvisionType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setLkp_provisiontype(voLookup1);
		}
				// primaryCareIdentifier
		valueObject.setPrimaryCareIdentifier(domainObject.getPrimaryCareIdentifier());
		// objectidentifier
		valueObject.setObjectidentifier(domainObject.getObjectidentifier());
		// beffdate
		java.util.Date beffdate = domainObject.getBeffdate();
		if ( null != beffdate ) 
		{
			valueObject.setBeffdate(new ims.framework.utils.Date(beffdate) );
		}
		// beffdatecnf
		valueObject.setBeffdatecnf( domainObject.isBeffdatecnf() );
		// betdate
		java.util.Date betdate = domainObject.getBetdate();
		if ( null != betdate ) 
		{
			valueObject.setBetdate(new ims.framework.utils.Date(betdate) );
		}
		// betdatecnf
		valueObject.setBetdatecnf( domainObject.isBetdatecnf() );
		// Gp
		if (domainObject.getGp() != null)
		{
			if(domainObject.getGp() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getGp();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setGp(new ims.core.resource.people.vo.GpRefVo(id, -1));				
			}
			else
			{
				valueObject.setGp(new ims.core.resource.people.vo.GpRefVo(domainObject.getGp().getId(), domainObject.getGp().getVersion()));
			}
		}
		// practice
		if (domainObject.getPractice() != null)
		{
			if(domainObject.getPractice() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPractice();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPractice(new ims.core.resource.place.vo.OrganisationRefVo(id, -1));				
			}
			else
			{
				valueObject.setPractice(new ims.core.resource.place.vo.OrganisationRefVo(domainObject.getPractice().getId(), domainObject.getPractice().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.domain.objects.PatientGP extractPatientGP(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientGPVo valueObject) 
	{
		return 	extractPatientGP(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.domain.objects.PatientGP extractPatientGP(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSPatientGPVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientGP();
		ims.core.domain.objects.PatientGP domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.domain.objects.PatientGP)domMap.get(valueObject);
			}
			// ims.core.vo.PDSPatientGPVo ID_PatientGP field is unknown
			domainObject = new ims.core.domain.objects.PatientGP();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientGP());
			if (domMap.get(key) != null)
			{
				return (ims.core.domain.objects.PatientGP)domMap.get(key);
			}
			domainObject = (ims.core.domain.objects.PatientGP) domainFactory.getDomainObject(ims.core.domain.objects.PatientGP.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientGP());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getLkp_provisiontype() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getLkp_provisiontype().getID());
		}
		domainObject.setLkp_provisiontype(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrimaryCareIdentifier() != null && valueObject.getPrimaryCareIdentifier().equals(""))
		{
			valueObject.setPrimaryCareIdentifier(null);
		}
		domainObject.setPrimaryCareIdentifier(valueObject.getPrimaryCareIdentifier());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObjectidentifier() != null && valueObject.getObjectidentifier().equals(""))
		{
			valueObject.setObjectidentifier(null);
		}
		domainObject.setObjectidentifier(valueObject.getObjectidentifier());
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getBeffdate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setBeffdate(value4);
		domainObject.setBeffdatecnf(valueObject.getBeffdatecnf());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getBetdate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setBetdate(value6);
		domainObject.setBetdatecnf(valueObject.getBetdatecnf());
		ims.core.resource.people.domain.objects.Gp value8 = null;
		if ( null != valueObject.getGp() ) 
		{
			if (valueObject.getGp().getBoId() == null)
			{
				if (domMap.get(valueObject.getGp()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Gp)domMap.get(valueObject.getGp());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getGp();	
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Gp.class, valueObject.getGp().getBoId());
			}
		}
		domainObject.setGp(value8);
		ims.core.resource.place.domain.objects.Organisation value9 = null;
		if ( null != valueObject.getPractice() ) 
		{
			if (valueObject.getPractice().getBoId() == null)
			{
				if (domMap.get(valueObject.getPractice()) != null)
				{
					value9 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getPractice());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getPractice();	
			}
			else
			{
				value9 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getPractice().getBoId());
			}
		}
		domainObject.setPractice(value9);

		return domainObject;
	}

}
