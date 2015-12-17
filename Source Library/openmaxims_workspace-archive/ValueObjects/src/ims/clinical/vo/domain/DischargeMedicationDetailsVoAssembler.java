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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class DischargeMedicationDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeMedicationDetailsVo copy(ims.clinical.vo.DischargeMedicationDetailsVo valueObjectDest, ims.clinical.vo.DischargeMedicationDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MedicationDetails(valueObjectSrc.getID_MedicationDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// MedicationRecommendations
		valueObjectDest.setMedicationRecommendations(valueObjectSrc.getMedicationRecommendations());
		// TTARequired
		valueObjectDest.setTTARequired(valueObjectSrc.getTTARequired());
		// TTAs
		valueObjectDest.setTTAs(valueObjectSrc.getTTAs());
		// AdmissionMedicationChanges
		valueObjectDest.setAdmissionMedicationChanges(valueObjectSrc.getAdmissionMedicationChanges());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeMedicationDetailsVoCollectionFromMedicationDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.MedicationDetails objects.
	 */
	public static ims.clinical.vo.DischargeMedicationDetailsVoCollection createDischargeMedicationDetailsVoCollectionFromMedicationDetails(java.util.Set domainObjectSet)	
	{
		return createDischargeMedicationDetailsVoCollectionFromMedicationDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.MedicationDetails objects.
	 */
	public static ims.clinical.vo.DischargeMedicationDetailsVoCollection createDischargeMedicationDetailsVoCollectionFromMedicationDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeMedicationDetailsVoCollection voList = new ims.clinical.vo.DischargeMedicationDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.MedicationDetails domainObject = (ims.edischarge.domain.objects.MedicationDetails) iterator.next();
			ims.clinical.vo.DischargeMedicationDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.MedicationDetails objects.
	 */
	public static ims.clinical.vo.DischargeMedicationDetailsVoCollection createDischargeMedicationDetailsVoCollectionFromMedicationDetails(java.util.List domainObjectList) 
	{
		return createDischargeMedicationDetailsVoCollectionFromMedicationDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.MedicationDetails objects.
	 */
	public static ims.clinical.vo.DischargeMedicationDetailsVoCollection createDischargeMedicationDetailsVoCollectionFromMedicationDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeMedicationDetailsVoCollection voList = new ims.clinical.vo.DischargeMedicationDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.MedicationDetails domainObject = (ims.edischarge.domain.objects.MedicationDetails) domainObjectList.get(i);
			ims.clinical.vo.DischargeMedicationDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.MedicationDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMedicationDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeMedicationDetailsVoCollection voCollection) 
	 {
	 	return extractMedicationDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMedicationDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeMedicationDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeMedicationDetailsVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.MedicationDetails domainObject = DischargeMedicationDetailsVoAssembler.extractMedicationDetails(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.MedicationDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMedicationDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeMedicationDetailsVoCollection voCollection) 
	 {
	 	return extractMedicationDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMedicationDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeMedicationDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeMedicationDetailsVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.MedicationDetails domainObject = DischargeMedicationDetailsVoAssembler.extractMedicationDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.MedicationDetails object.
	 * @param domainObject ims.edischarge.domain.objects.MedicationDetails
	 */
	 public static ims.clinical.vo.DischargeMedicationDetailsVo create(ims.edischarge.domain.objects.MedicationDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.MedicationDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeMedicationDetailsVo create(DomainObjectMap map, ims.edischarge.domain.objects.MedicationDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeMedicationDetailsVo valueObject = (ims.clinical.vo.DischargeMedicationDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeMedicationDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeMedicationDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.MedicationDetails
	 */
	 public static ims.clinical.vo.DischargeMedicationDetailsVo insert(ims.clinical.vo.DischargeMedicationDetailsVo valueObject, ims.edischarge.domain.objects.MedicationDetails domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.MedicationDetails
	 */
	 public static ims.clinical.vo.DischargeMedicationDetailsVo insert(DomainObjectMap map, ims.clinical.vo.DischargeMedicationDetailsVo valueObject, ims.edischarge.domain.objects.MedicationDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MedicationDetails(domainObject.getId());
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
		// MedicationRecommendations
		valueObject.setMedicationRecommendations(domainObject.getMedicationRecommendations());
		// TTARequired
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTTARequired();
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

			ims.clinical.vo.lookups.TTORequired voLookup3 = new ims.clinical.vo.lookups.TTORequired(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.TTORequired parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.TTORequired(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTTARequired(voLookup3);
		}
				// TTAs
		valueObject.setTTAs(ims.clinical.vo.domain.TTAMedicationVoAssembler.createTTAMedicationVoCollectionFromTTAMedication(map, domainObject.getTTAs()) );
		// AdmissionMedicationChanges
		valueObject.setAdmissionMedicationChanges(ims.clinical.vo.domain.AdmissionMedicationChangesVoAssembler.createAdmissionMedicationChangesVoCollectionFromAdmissionMedicationChanges(map, domainObject.getAdmissionMedicationChanges()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.MedicationDetails extractMedicationDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeMedicationDetailsVo valueObject) 
	{
		return 	extractMedicationDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.MedicationDetails extractMedicationDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeMedicationDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MedicationDetails();
		ims.edischarge.domain.objects.MedicationDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.MedicationDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeMedicationDetailsVo ID_MedicationDetails field is unknown
			domainObject = new ims.edischarge.domain.objects.MedicationDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MedicationDetails());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.MedicationDetails)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.MedicationDetails) domainFactory.getDomainObject(ims.edischarge.domain.objects.MedicationDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MedicationDetails());

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
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMedicationRecommendations() != null && valueObject.getMedicationRecommendations().equals(""))
		{
			valueObject.setMedicationRecommendations(null);
		}
		domainObject.setMedicationRecommendations(valueObject.getMedicationRecommendations());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTTARequired() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTTARequired().getID());
		}
		domainObject.setTTARequired(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.edischarge.vo.TTAMedicationRefVoCollection refCollection4 = new ims.edischarge.vo.TTAMedicationRefVoCollection();
		if (valueObject.getTTAs() != null)
		{
			for (int i4=0; i4<valueObject.getTTAs().size(); i4++)
			{
				ims.edischarge.vo.TTAMedicationRefVo ref4 = (ims.edischarge.vo.TTAMedicationRefVo)valueObject.getTTAs().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainTTAs4 = domainObject.getTTAs();
		if (domainTTAs4 == null)
		{
			domainTTAs4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.edischarge.vo.TTAMedicationRefVo vo = refCollection4.get(i);					
			ims.edischarge.domain.objects.TTAMedication dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.edischarge.domain.objects.TTAMedication)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.edischarge.domain.objects.TTAMedication)domainFactory.getDomainObject( ims.edischarge.domain.objects.TTAMedication.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainTTAs4.contains(dom))
			{
				domainTTAs4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainTTAs4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainTTAs4.remove(iter4.next());
		}		
		
		domainObject.setTTAs(domainTTAs4);		

		// SaveAsRefVO treated as RefValueObject
		ims.edischarge.vo.AdmissionMedicationChangesRefVoCollection refCollection5 = new ims.edischarge.vo.AdmissionMedicationChangesRefVoCollection();
		if (valueObject.getAdmissionMedicationChanges() != null)
		{
			for (int i5=0; i5<valueObject.getAdmissionMedicationChanges().size(); i5++)
			{
				ims.edischarge.vo.AdmissionMedicationChangesRefVo ref5 = (ims.edischarge.vo.AdmissionMedicationChangesRefVo)valueObject.getAdmissionMedicationChanges().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.Set domainAdmissionMedicationChanges5 = domainObject.getAdmissionMedicationChanges();
		if (domainAdmissionMedicationChanges5 == null)
		{
			domainAdmissionMedicationChanges5 = new java.util.HashSet();
		}
		java.util.Set newSet5  = new java.util.HashSet();
		for(int i=0; i<size5; i++) 
		{
			ims.edischarge.vo.AdmissionMedicationChangesRefVo vo = refCollection5.get(i);					
			ims.edischarge.domain.objects.AdmissionMedicationChanges dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.edischarge.domain.objects.AdmissionMedicationChanges)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.edischarge.domain.objects.AdmissionMedicationChanges)domainFactory.getDomainObject( ims.edischarge.domain.objects.AdmissionMedicationChanges.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainAdmissionMedicationChanges5.contains(dom))
			{
				domainAdmissionMedicationChanges5.add(dom);
			}
			newSet5.add(dom);			
		}
		java.util.Set removedSet5 = new java.util.HashSet();
		java.util.Iterator iter5 = domainAdmissionMedicationChanges5.iterator();
		//Find out which objects need to be removed
		while (iter5.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter5.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet5.contains(o))
			{
				removedSet5.add(o);
			}
		}
		iter5 = removedSet5.iterator();
		//Remove the unwanted objects
		while (iter5.hasNext())
		{
			domainAdmissionMedicationChanges5.remove(iter5.next());
		}		
		
		domainObject.setAdmissionMedicationChanges(domainAdmissionMedicationChanges5);		

		return domainObject;
	}

}
