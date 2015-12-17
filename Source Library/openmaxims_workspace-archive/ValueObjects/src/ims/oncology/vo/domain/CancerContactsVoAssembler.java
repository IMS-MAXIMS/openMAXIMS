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
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class CancerContactsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.CancerContactsVo copy(ims.oncology.vo.CancerContactsVo valueObjectDest, ims.oncology.vo.CancerContactsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CancerContacts(valueObjectSrc.getID_CancerContacts());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ContactHCP
		valueObjectDest.setContactHCP(valueObjectSrc.getContactHCP());
		// HCPDiscipline
		valueObjectDest.setHCPDiscipline(valueObjectSrc.getHCPDiscipline());
		// ContactDateTime
		valueObjectDest.setContactDateTime(valueObjectSrc.getContactDateTime());
		// UnitsRequired
		valueObjectDest.setUnitsRequired(valueObjectSrc.getUnitsRequired());
		// UnitsGiven
		valueObjectDest.setUnitsGiven(valueObjectSrc.getUnitsGiven());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// ContactTypes
		valueObjectDest.setContactTypes(valueObjectSrc.getContactTypes());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// RecordingInfo
		valueObjectDest.setRecordingInfo(valueObjectSrc.getRecordingInfo());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCancerContactsVoCollectionFromCancerContacts(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerContacts objects.
	 */
	public static ims.oncology.vo.CancerContactsVoCollection createCancerContactsVoCollectionFromCancerContacts(java.util.Set domainObjectSet)	
	{
		return createCancerContactsVoCollectionFromCancerContacts(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerContacts objects.
	 */
	public static ims.oncology.vo.CancerContactsVoCollection createCancerContactsVoCollectionFromCancerContacts(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.CancerContactsVoCollection voList = new ims.oncology.vo.CancerContactsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.CancerContacts domainObject = (ims.oncology.domain.objects.CancerContacts) iterator.next();
			ims.oncology.vo.CancerContactsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerContacts objects.
	 */
	public static ims.oncology.vo.CancerContactsVoCollection createCancerContactsVoCollectionFromCancerContacts(java.util.List domainObjectList) 
	{
		return createCancerContactsVoCollectionFromCancerContacts(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerContacts objects.
	 */
	public static ims.oncology.vo.CancerContactsVoCollection createCancerContactsVoCollectionFromCancerContacts(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.CancerContactsVoCollection voList = new ims.oncology.vo.CancerContactsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CancerContacts domainObject = (ims.oncology.domain.objects.CancerContacts) domainObjectList.get(i);
			ims.oncology.vo.CancerContactsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.CancerContacts set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCancerContactsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerContactsVoCollection voCollection) 
	 {
	 	return extractCancerContactsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCancerContactsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerContactsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerContactsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerContacts domainObject = CancerContactsVoAssembler.extractCancerContacts(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.CancerContacts list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCancerContactsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerContactsVoCollection voCollection) 
	 {
	 	return extractCancerContactsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCancerContactsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerContactsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerContactsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerContacts domainObject = CancerContactsVoAssembler.extractCancerContacts(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.CancerContacts object.
	 * @param domainObject ims.oncology.domain.objects.CancerContacts
	 */
	 public static ims.oncology.vo.CancerContactsVo create(ims.oncology.domain.objects.CancerContacts domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.CancerContacts object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.CancerContactsVo create(DomainObjectMap map, ims.oncology.domain.objects.CancerContacts domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.CancerContactsVo valueObject = (ims.oncology.vo.CancerContactsVo) map.getValueObject(domainObject, ims.oncology.vo.CancerContactsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.CancerContactsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CancerContacts
	 */
	 public static ims.oncology.vo.CancerContactsVo insert(ims.oncology.vo.CancerContactsVo valueObject, ims.oncology.domain.objects.CancerContacts domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.CancerContacts
	 */
	 public static ims.oncology.vo.CancerContactsVo insert(DomainObjectMap map, ims.oncology.vo.CancerContactsVo valueObject, ims.oncology.domain.objects.CancerContacts domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CancerContacts(domainObject.getId());
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
		// ContactHCP
		valueObject.setContactHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getContactHCP()) );
		// HCPDiscipline
		ims.domain.lookups.LookupInstance instance3 = domainObject.getHCPDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup3 = new ims.core.vo.lookups.HcpDisType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.HcpDisType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setHCPDiscipline(voLookup3);
		}
				// ContactDateTime
		java.util.Date ContactDateTime = domainObject.getContactDateTime();
		if ( null != ContactDateTime ) 
		{
			valueObject.setContactDateTime(new ims.framework.utils.DateTime(ContactDateTime) );
		}
		// UnitsRequired
		valueObject.setUnitsRequired(domainObject.getUnitsRequired());
		// UnitsGiven
		valueObject.setUnitsGiven(domainObject.getUnitsGiven());
		// Comment
		valueObject.setComment(domainObject.getComment());
		// ContactTypes
		ims.oncology.vo.ContactTypesByDisciplineItemRefVoCollection ContactTypes = new ims.oncology.vo.ContactTypesByDisciplineItemRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getContactTypes().iterator(); iterator.hasNext(); ) 
		{
			ims.oncology.domain.objects.ContactTypesByDisciplineItem tmp = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)iterator.next();
			if (tmp != null)
				ContactTypes.add(new ims.oncology.vo.ContactTypesByDisciplineItemRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setContactTypes(ContactTypes);
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// RecordingInfo
		valueObject.setRecordingInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getRecordingInfo()) );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CancerContacts extractCancerContacts(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerContactsVo valueObject) 
	{
		return 	extractCancerContacts(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CancerContacts extractCancerContacts(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerContactsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CancerContacts();
		ims.oncology.domain.objects.CancerContacts domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.CancerContacts)domMap.get(valueObject);
			}
			// ims.oncology.vo.CancerContactsVo ID_CancerContacts field is unknown
			domainObject = new ims.oncology.domain.objects.CancerContacts();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CancerContacts());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.CancerContacts)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.CancerContacts) domainFactory.getDomainObject(ims.oncology.domain.objects.CancerContacts.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CancerContacts());

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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getContactHCP() ) 
		{
			if (valueObject.getContactHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getContactHCP()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getContactHCP());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getContactHCP().getBoId());
			}
		}
		domainObject.setContactHCP(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getHCPDiscipline() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getHCPDiscipline().getID());
		}
		domainObject.setHCPDiscipline(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getContactDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setContactDateTime(value4);
		domainObject.setUnitsRequired(valueObject.getUnitsRequired());
		domainObject.setUnitsGiven(valueObject.getUnitsGiven());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		ims.oncology.vo.ContactTypesByDisciplineItemRefVoCollection refCollection8 = valueObject.getContactTypes();
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainContactTypes8 = domainObject.getContactTypes();
		if (domainContactTypes8 == null)
		{
			domainContactTypes8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.oncology.vo.ContactTypesByDisciplineItemRefVo vo = refCollection8.get(i);			
			ims.oncology.domain.objects.ContactTypesByDisciplineItem dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)domainFactory.getDomainObject( ims.oncology.domain.objects.ContactTypesByDisciplineItem.class, vo.getBoId());
				}
			}

			int domIdx = domainContactTypes8.indexOf(dom);
			if (domIdx == -1)
			{
				domainContactTypes8.add(i, dom);
			}
			else if (i != domIdx && i < domainContactTypes8.size())
			{
				Object tmp = domainContactTypes8.get(i);
				domainContactTypes8.set(i, domainContactTypes8.get(domIdx));
				domainContactTypes8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainContactTypes8.size();
		while (i8 > size8)
		{
			domainContactTypes8.remove(i8-1);
			i8 = domainContactTypes8.size();
		}
		
		domainObject.setContactTypes(domainContactTypes8);		
		ims.core.admin.domain.objects.EpisodeOfCare value9 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value9 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value9);
		domainObject.setRecordingInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getRecordingInfo(), domMap));

		return domainObject;
	}

}
