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
 * @author Dara Hickey
 */
public class ClinicalDIAssociationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ClinicalDIAssociationVo copy(ims.clinical.vo.ClinicalDIAssociationVo valueObjectDest, ims.clinical.vo.ClinicalDIAssociationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Clinicalcdiassociations(valueObjectSrc.getID_Clinicalcdiassociations());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PrimDiagnosis
		valueObjectDest.setPrimDiagnosis(valueObjectSrc.getPrimDiagnosis());
		// PrimProcedure
		valueObjectDest.setPrimProcedure(valueObjectSrc.getPrimProcedure());
		// PrimProblem
		valueObjectDest.setPrimProblem(valueObjectSrc.getPrimProblem());
		// AssociationDescription
		valueObjectDest.setAssociationDescription(valueObjectSrc.getAssociationDescription());
		// AssocDiagnosis
		valueObjectDest.setAssocDiagnosis(valueObjectSrc.getAssocDiagnosis());
		// AssocProcedure
		valueObjectDest.setAssocProcedure(valueObjectSrc.getAssocProcedure());
		// AssocProblem
		valueObjectDest.setAssocProblem(valueObjectSrc.getAssocProblem());
		// ReverseAssociation
		valueObjectDest.setReverseAssociation(valueObjectSrc.getReverseAssociation());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.Clinicalcdiassociations objects.
	 */
	public static ims.clinical.vo.ClinicalDIAssociationVoCollection createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(java.util.Set domainObjectSet)	
	{
		return createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.Clinicalcdiassociations objects.
	 */
	public static ims.clinical.vo.ClinicalDIAssociationVoCollection createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ClinicalDIAssociationVoCollection voList = new ims.clinical.vo.ClinicalDIAssociationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.Clinicalcdiassociations domainObject = (ims.clinical.domain.objects.Clinicalcdiassociations) iterator.next();
			ims.clinical.vo.ClinicalDIAssociationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.Clinicalcdiassociations objects.
	 */
	public static ims.clinical.vo.ClinicalDIAssociationVoCollection createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(java.util.List domainObjectList) 
	{
		return createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.Clinicalcdiassociations objects.
	 */
	public static ims.clinical.vo.ClinicalDIAssociationVoCollection createClinicalDIAssociationVoCollectionFromClinicalcdiassociations(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ClinicalDIAssociationVoCollection voList = new ims.clinical.vo.ClinicalDIAssociationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.Clinicalcdiassociations domainObject = (ims.clinical.domain.objects.Clinicalcdiassociations) domainObjectList.get(i);
			ims.clinical.vo.ClinicalDIAssociationVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.Clinicalcdiassociations set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalcdiassociationsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalDIAssociationVoCollection voCollection) 
	 {
	 	return extractClinicalcdiassociationsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalcdiassociationsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalDIAssociationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ClinicalDIAssociationVo vo = voCollection.get(i);
			ims.clinical.domain.objects.Clinicalcdiassociations domainObject = ClinicalDIAssociationVoAssembler.extractClinicalcdiassociations(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.Clinicalcdiassociations list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalcdiassociationsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalDIAssociationVoCollection voCollection) 
	 {
	 	return extractClinicalcdiassociationsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalcdiassociationsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalDIAssociationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ClinicalDIAssociationVo vo = voCollection.get(i);
			ims.clinical.domain.objects.Clinicalcdiassociations domainObject = ClinicalDIAssociationVoAssembler.extractClinicalcdiassociations(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.Clinicalcdiassociations object.
	 * @param domainObject ims.clinical.domain.objects.Clinicalcdiassociations
	 */
	 public static ims.clinical.vo.ClinicalDIAssociationVo create(ims.clinical.domain.objects.Clinicalcdiassociations domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.Clinicalcdiassociations object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ClinicalDIAssociationVo create(DomainObjectMap map, ims.clinical.domain.objects.Clinicalcdiassociations domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ClinicalDIAssociationVo valueObject = (ims.clinical.vo.ClinicalDIAssociationVo) map.getValueObject(domainObject, ims.clinical.vo.ClinicalDIAssociationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ClinicalDIAssociationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.Clinicalcdiassociations
	 */
	 public static ims.clinical.vo.ClinicalDIAssociationVo insert(ims.clinical.vo.ClinicalDIAssociationVo valueObject, ims.clinical.domain.objects.Clinicalcdiassociations domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.Clinicalcdiassociations
	 */
	 public static ims.clinical.vo.ClinicalDIAssociationVo insert(DomainObjectMap map, ims.clinical.vo.ClinicalDIAssociationVo valueObject, ims.clinical.domain.objects.Clinicalcdiassociations domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Clinicalcdiassociations(domainObject.getId());
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
			
		// PrimDiagnosis
		if (domainObject.getPrimDiagnosis() != null)
		{
			if(domainObject.getPrimDiagnosis() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPrimDiagnosis();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPrimDiagnosis(new ims.core.clinical.vo.PatientDiagnosisRefVo(id, -1));				
			}
			else
			{
				valueObject.setPrimDiagnosis(new ims.core.clinical.vo.PatientDiagnosisRefVo(domainObject.getPrimDiagnosis().getId(), domainObject.getPrimDiagnosis().getVersion()));
			}
		}
		// PrimProcedure
		if (domainObject.getPrimProcedure() != null)
		{
			if(domainObject.getPrimProcedure() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPrimProcedure();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPrimProcedure(new ims.core.clinical.vo.PatientProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setPrimProcedure(new ims.core.clinical.vo.PatientProcedureRefVo(domainObject.getPrimProcedure().getId(), domainObject.getPrimProcedure().getVersion()));
			}
		}
		// PrimProblem
		if (domainObject.getPrimProblem() != null)
		{
			if(domainObject.getPrimProblem() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPrimProblem();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPrimProblem(new ims.core.clinical.vo.PatientProblemRefVo(id, -1));				
			}
			else
			{
				valueObject.setPrimProblem(new ims.core.clinical.vo.PatientProblemRefVo(domainObject.getPrimProblem().getId(), domainObject.getPrimProblem().getVersion()));
			}
		}
		// AssociationDescription
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAssociationDescription();
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

			ims.clinical.vo.lookups.CDIAssociationDescription voLookup4 = new ims.clinical.vo.lookups.CDIAssociationDescription(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.clinical.vo.lookups.CDIAssociationDescription parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.clinical.vo.lookups.CDIAssociationDescription(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAssociationDescription(voLookup4);
		}
				// AssocDiagnosis
		if (domainObject.getAssocDiagnosis() != null)
		{
			if(domainObject.getAssocDiagnosis() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssocDiagnosis();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssocDiagnosis(new ims.core.clinical.vo.PatientDiagnosisRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssocDiagnosis(new ims.core.clinical.vo.PatientDiagnosisRefVo(domainObject.getAssocDiagnosis().getId(), domainObject.getAssocDiagnosis().getVersion()));
			}
		}
		// AssocProcedure
		if (domainObject.getAssocProcedure() != null)
		{
			if(domainObject.getAssocProcedure() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssocProcedure();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssocProcedure(new ims.core.clinical.vo.PatientProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssocProcedure(new ims.core.clinical.vo.PatientProcedureRefVo(domainObject.getAssocProcedure().getId(), domainObject.getAssocProcedure().getVersion()));
			}
		}
		// AssocProblem
		if (domainObject.getAssocProblem() != null)
		{
			if(domainObject.getAssocProblem() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssocProblem();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssocProblem(new ims.core.clinical.vo.PatientProblemRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssocProblem(new ims.core.clinical.vo.PatientProblemRefVo(domainObject.getAssocProblem().getId(), domainObject.getAssocProblem().getVersion()));
			}
		}
		// ReverseAssociation
		ims.domain.lookups.LookupInstance instance8 = domainObject.getReverseAssociation();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.CDIAssociationDescription voLookup8 = new ims.clinical.vo.lookups.CDIAssociationDescription(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.CDIAssociationDescription parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.CDIAssociationDescription(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setReverseAssociation(voLookup8);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.Clinicalcdiassociations extractClinicalcdiassociations(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalDIAssociationVo valueObject) 
	{
		return 	extractClinicalcdiassociations(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.Clinicalcdiassociations extractClinicalcdiassociations(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalDIAssociationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Clinicalcdiassociations();
		ims.clinical.domain.objects.Clinicalcdiassociations domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.Clinicalcdiassociations)domMap.get(valueObject);
			}
			// ims.clinical.vo.ClinicalDIAssociationVo ID_Clinicalcdiassociations field is unknown
			domainObject = new ims.clinical.domain.objects.Clinicalcdiassociations();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Clinicalcdiassociations());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.Clinicalcdiassociations)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.Clinicalcdiassociations) domainFactory.getDomainObject(ims.clinical.domain.objects.Clinicalcdiassociations.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Clinicalcdiassociations());

		ims.core.clinical.domain.objects.PatientDiagnosis value1 = null;
		if ( null != valueObject.getPrimDiagnosis() ) 
		{
			if (valueObject.getPrimDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimDiagnosis()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject.getPrimDiagnosis());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPrimDiagnosis();	
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, valueObject.getPrimDiagnosis().getBoId());
			}
		}
		domainObject.setPrimDiagnosis(value1);
		ims.core.clinical.domain.objects.PatientProcedure value2 = null;
		if ( null != valueObject.getPrimProcedure() ) 
		{
			if (valueObject.getPrimProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimProcedure()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getPrimProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getPrimProcedure();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getPrimProcedure().getBoId());
			}
		}
		domainObject.setPrimProcedure(value2);
		ims.core.clinical.domain.objects.PatientProblem value3 = null;
		if ( null != valueObject.getPrimProblem() ) 
		{
			if (valueObject.getPrimProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimProblem()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.PatientProblem)domMap.get(valueObject.getPrimProblem());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPrimProblem();	
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.PatientProblem)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProblem.class, valueObject.getPrimProblem().getBoId());
			}
		}
		domainObject.setPrimProblem(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAssociationDescription() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAssociationDescription().getID());
		}
		domainObject.setAssociationDescription(value4);
		ims.core.clinical.domain.objects.PatientDiagnosis value5 = null;
		if ( null != valueObject.getAssocDiagnosis() ) 
		{
			if (valueObject.getAssocDiagnosis().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssocDiagnosis()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject.getAssocDiagnosis());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getAssocDiagnosis();	
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.PatientDiagnosis)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, valueObject.getAssocDiagnosis().getBoId());
			}
		}
		domainObject.setAssocDiagnosis(value5);
		ims.core.clinical.domain.objects.PatientProcedure value6 = null;
		if ( null != valueObject.getAssocProcedure() ) 
		{
			if (valueObject.getAssocProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssocProcedure()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getAssocProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getAssocProcedure();	
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getAssocProcedure().getBoId());
			}
		}
		domainObject.setAssocProcedure(value6);
		ims.core.clinical.domain.objects.PatientProblem value7 = null;
		if ( null != valueObject.getAssocProblem() ) 
		{
			if (valueObject.getAssocProblem().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssocProblem()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.PatientProblem)domMap.get(valueObject.getAssocProblem());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getAssocProblem();	
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.PatientProblem)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProblem.class, valueObject.getAssocProblem().getBoId());
			}
		}
		domainObject.setAssocProblem(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getReverseAssociation() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getReverseAssociation().getID());
		}
		domainObject.setReverseAssociation(value8);
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
