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
 * @author Bogdan Tofei
 */
public class InterProviderTransferOutVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.InterProviderTransferOutVo copy(ims.RefMan.vo.InterProviderTransferOutVo valueObjectDest, ims.RefMan.vo.InterProviderTransferOutVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InterProviderTransferOut(valueObjectSrc.getID_InterProviderTransferOut());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// RequestedDate
		valueObjectDest.setRequestedDate(valueObjectSrc.getRequestedDate());
		// ReferringClinican
		valueObjectDest.setReferringClinican(valueObjectSrc.getReferringClinican());
		// IPTOrganisation
		valueObjectDest.setIPTOrganisation(valueObjectSrc.getIPTOrganisation());
		// IPTService
		valueObjectDest.setIPTService(valueObjectSrc.getIPTService());
		// IPTClinician
		valueObjectDest.setIPTClinician(valueObjectSrc.getIPTClinician());
		// IPTComments
		valueObjectDest.setIPTComments(valueObjectSrc.getIPTComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.InterProviderTransferOut objects.
	 */
	public static ims.RefMan.vo.InterProviderTransferOutVoCollection createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(java.util.Set domainObjectSet)	
	{
		return createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.InterProviderTransferOut objects.
	 */
	public static ims.RefMan.vo.InterProviderTransferOutVoCollection createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.InterProviderTransferOutVoCollection voList = new ims.RefMan.vo.InterProviderTransferOutVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.InterProviderTransferOut domainObject = (ims.RefMan.domain.objects.InterProviderTransferOut) iterator.next();
			ims.RefMan.vo.InterProviderTransferOutVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.InterProviderTransferOut objects.
	 */
	public static ims.RefMan.vo.InterProviderTransferOutVoCollection createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(java.util.List domainObjectList) 
	{
		return createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.InterProviderTransferOut objects.
	 */
	public static ims.RefMan.vo.InterProviderTransferOutVoCollection createInterProviderTransferOutVoCollectionFromInterProviderTransferOut(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.InterProviderTransferOutVoCollection voList = new ims.RefMan.vo.InterProviderTransferOutVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.InterProviderTransferOut domainObject = (ims.RefMan.domain.objects.InterProviderTransferOut) domainObjectList.get(i);
			ims.RefMan.vo.InterProviderTransferOutVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.InterProviderTransferOut set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractInterProviderTransferOutSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.InterProviderTransferOutVoCollection voCollection) 
	 {
	 	return extractInterProviderTransferOutSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInterProviderTransferOutSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.InterProviderTransferOutVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.InterProviderTransferOutVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.InterProviderTransferOut domainObject = InterProviderTransferOutVoAssembler.extractInterProviderTransferOut(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.InterProviderTransferOut list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractInterProviderTransferOutList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.InterProviderTransferOutVoCollection voCollection) 
	 {
	 	return extractInterProviderTransferOutList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInterProviderTransferOutList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.InterProviderTransferOutVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.InterProviderTransferOutVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.InterProviderTransferOut domainObject = InterProviderTransferOutVoAssembler.extractInterProviderTransferOut(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.InterProviderTransferOut object.
	 * @param domainObject ims.RefMan.domain.objects.InterProviderTransferOut
	 */
	 public static ims.RefMan.vo.InterProviderTransferOutVo create(ims.RefMan.domain.objects.InterProviderTransferOut domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.InterProviderTransferOut object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.InterProviderTransferOutVo create(DomainObjectMap map, ims.RefMan.domain.objects.InterProviderTransferOut domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.InterProviderTransferOutVo valueObject = (ims.RefMan.vo.InterProviderTransferOutVo) map.getValueObject(domainObject, ims.RefMan.vo.InterProviderTransferOutVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.InterProviderTransferOutVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.InterProviderTransferOut
	 */
	 public static ims.RefMan.vo.InterProviderTransferOutVo insert(ims.RefMan.vo.InterProviderTransferOutVo valueObject, ims.RefMan.domain.objects.InterProviderTransferOut domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.InterProviderTransferOut
	 */
	 public static ims.RefMan.vo.InterProviderTransferOutVo insert(DomainObjectMap map, ims.RefMan.vo.InterProviderTransferOutVo valueObject, ims.RefMan.domain.objects.InterProviderTransferOut domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_InterProviderTransferOut(domainObject.getId());
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
			
		// Patient
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
		// RequestedDate
		java.util.Date RequestedDate = domainObject.getRequestedDate();
		if ( null != RequestedDate ) 
		{
			valueObject.setRequestedDate(new ims.framework.utils.Date(RequestedDate) );
		}
		// ReferringClinican
		valueObject.setReferringClinican(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReferringClinican()) );
		// IPTOrganisation
		ims.domain.lookups.LookupInstance instance5 = domainObject.getIPTOrganisation();
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

			ims.RefMan.vo.lookups.OtherProviders voLookup5 = new ims.RefMan.vo.lookups.OtherProviders(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.RefMan.vo.lookups.OtherProviders parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.RefMan.vo.lookups.OtherProviders(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setIPTOrganisation(voLookup5);
		}
				// IPTService
		valueObject.setIPTService(domainObject.getIPTService());
		// IPTClinician
		valueObject.setIPTClinician(domainObject.getIPTClinician());
		// IPTComments
		valueObject.setIPTComments(domainObject.getIPTComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.InterProviderTransferOut extractInterProviderTransferOut(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.InterProviderTransferOutVo valueObject) 
	{
		return 	extractInterProviderTransferOut(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.InterProviderTransferOut extractInterProviderTransferOut(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.InterProviderTransferOutVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_InterProviderTransferOut();
		ims.RefMan.domain.objects.InterProviderTransferOut domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.InterProviderTransferOut)domMap.get(valueObject);
			}
			// ims.RefMan.vo.InterProviderTransferOutVo ID_InterProviderTransferOut field is unknown
			domainObject = new ims.RefMan.domain.objects.InterProviderTransferOut();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_InterProviderTransferOut());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.InterProviderTransferOut)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.InterProviderTransferOut) domainFactory.getDomainObject(ims.RefMan.domain.objects.InterProviderTransferOut.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_InterProviderTransferOut());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		ims.RefMan.domain.objects.CatsReferral value2 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value2 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCatsReferral();	
			}
			else
			{
				value2 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getRequestedDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setRequestedDate(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getReferringClinican() ) 
		{
			if (valueObject.getReferringClinican().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringClinican()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferringClinican());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferringClinican().getBoId());
			}
		}
		domainObject.setReferringClinican(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getIPTOrganisation() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getIPTOrganisation().getID());
		}
		domainObject.setIPTOrganisation(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIPTService() != null && valueObject.getIPTService().equals(""))
		{
			valueObject.setIPTService(null);
		}
		domainObject.setIPTService(valueObject.getIPTService());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIPTClinician() != null && valueObject.getIPTClinician().equals(""))
		{
			valueObject.setIPTClinician(null);
		}
		domainObject.setIPTClinician(valueObject.getIPTClinician());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIPTComments() != null && valueObject.getIPTComments().equals(""))
		{
			valueObject.setIPTComments(null);
		}
		domainObject.setIPTComments(valueObject.getIPTComments());

		return domainObject;
	}

}
