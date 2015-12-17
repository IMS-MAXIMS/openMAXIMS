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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class NeuroSenastionFindingsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.NeuroSenastionFindingsVo copy(ims.generalmedical.vo.NeuroSenastionFindingsVo valueObjectDest, ims.generalmedical.vo.NeuroSenastionFindingsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NeuExamSens(valueObjectSrc.getID_NeuExamSens());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// rootfinding
		valueObjectDest.setRootfinding(valueObjectSrc.getRootfinding());
		// rightSensoryLevel
		valueObjectDest.setRightSensoryLevel(valueObjectSrc.getRightSensoryLevel());
		// leftSensoryLevel
		valueObjectDest.setLeftSensoryLevel(valueObjectSrc.getLeftSensoryLevel());
		// FrankleGrade
		valueObjectDest.setFrankleGrade(valueObjectSrc.getFrankleGrade());
		// isProblem
		valueObjectDest.setIsProblem(valueObjectSrc.getIsProblem());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNeuroSenastionFindingsVoCollectionFromNeuExamSens(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuExamSens objects.
	 */
	public static ims.generalmedical.vo.NeuroSenastionFindingsVoCollection createNeuroSenastionFindingsVoCollectionFromNeuExamSens(java.util.Set domainObjectSet)	
	{
		return createNeuroSenastionFindingsVoCollectionFromNeuExamSens(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.NeuExamSens objects.
	 */
	public static ims.generalmedical.vo.NeuroSenastionFindingsVoCollection createNeuroSenastionFindingsVoCollectionFromNeuExamSens(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.NeuroSenastionFindingsVoCollection voList = new ims.generalmedical.vo.NeuroSenastionFindingsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.NeuExamSens domainObject = (ims.medical.domain.objects.NeuExamSens) iterator.next();
			ims.generalmedical.vo.NeuroSenastionFindingsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuExamSens objects.
	 */
	public static ims.generalmedical.vo.NeuroSenastionFindingsVoCollection createNeuroSenastionFindingsVoCollectionFromNeuExamSens(java.util.List domainObjectList) 
	{
		return createNeuroSenastionFindingsVoCollectionFromNeuExamSens(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.NeuExamSens objects.
	 */
	public static ims.generalmedical.vo.NeuroSenastionFindingsVoCollection createNeuroSenastionFindingsVoCollectionFromNeuExamSens(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.NeuroSenastionFindingsVoCollection voList = new ims.generalmedical.vo.NeuroSenastionFindingsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.NeuExamSens domainObject = (ims.medical.domain.objects.NeuExamSens) domainObjectList.get(i);
			ims.generalmedical.vo.NeuroSenastionFindingsVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.NeuExamSens set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNeuExamSensSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSenastionFindingsVoCollection voCollection) 
	 {
	 	return extractNeuExamSensSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNeuExamSensSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSenastionFindingsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroSenastionFindingsVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuExamSens domainObject = NeuroSenastionFindingsVoAssembler.extractNeuExamSens(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.NeuExamSens list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNeuExamSensList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSenastionFindingsVoCollection voCollection) 
	 {
	 	return extractNeuExamSensList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNeuExamSensList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSenastionFindingsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.NeuroSenastionFindingsVo vo = voCollection.get(i);
			ims.medical.domain.objects.NeuExamSens domainObject = NeuroSenastionFindingsVoAssembler.extractNeuExamSens(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.NeuExamSens object.
	 * @param domainObject ims.medical.domain.objects.NeuExamSens
	 */
	 public static ims.generalmedical.vo.NeuroSenastionFindingsVo create(ims.medical.domain.objects.NeuExamSens domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.NeuExamSens object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.NeuroSenastionFindingsVo create(DomainObjectMap map, ims.medical.domain.objects.NeuExamSens domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.NeuroSenastionFindingsVo valueObject = (ims.generalmedical.vo.NeuroSenastionFindingsVo) map.getValueObject(domainObject, ims.generalmedical.vo.NeuroSenastionFindingsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.NeuroSenastionFindingsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.NeuExamSens
	 */
	 public static ims.generalmedical.vo.NeuroSenastionFindingsVo insert(ims.generalmedical.vo.NeuroSenastionFindingsVo valueObject, ims.medical.domain.objects.NeuExamSens domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.NeuExamSens
	 */
	 public static ims.generalmedical.vo.NeuroSenastionFindingsVo insert(DomainObjectMap map, ims.generalmedical.vo.NeuroSenastionFindingsVo valueObject, ims.medical.domain.objects.NeuExamSens domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NeuExamSens(domainObject.getId());
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
			
		// rootfinding
		valueObject.setRootfinding(ims.generalmedical.vo.domain.NeuroSensationRootValueVoAssembler.createNeuroSensationRootValueVoCollectionFromNeuRootSensFinding(map, domainObject.getRootfinding()) );
		// rightSensoryLevel
		valueObject.setRightSensoryLevel(ims.core.vo.domain.VertebrallevelVoAssembler.create(map, domainObject.getRightSensoryLevel()) );
		// leftSensoryLevel
		valueObject.setLeftSensoryLevel(ims.core.vo.domain.VertebrallevelVoAssembler.create(map, domainObject.getLeftSensoryLevel()) );
		// FrankleGrade
		ims.domain.lookups.LookupInstance instance4 = domainObject.getFrankleGrade();
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

			ims.spinalinjuries.vo.lookups.MSKSensationFrankelGrade voLookup4 = new ims.spinalinjuries.vo.lookups.MSKSensationFrankelGrade(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MSKSensationFrankelGrade parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.MSKSensationFrankelGrade(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setFrankleGrade(voLookup4);
		}
				// isProblem
		valueObject.setIsProblem( domainObject.isIsProblem() );
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
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
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.NeuExamSens extractNeuExamSens(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSenastionFindingsVo valueObject) 
	{
		return 	extractNeuExamSens(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.NeuExamSens extractNeuExamSens(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.NeuroSenastionFindingsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NeuExamSens();
		ims.medical.domain.objects.NeuExamSens domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.NeuExamSens)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.NeuroSenastionFindingsVo ID_NeuExamSens field is unknown
			domainObject = new ims.medical.domain.objects.NeuExamSens();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NeuExamSens());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.NeuExamSens)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.NeuExamSens) domainFactory.getDomainObject(ims.medical.domain.objects.NeuExamSens.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NeuExamSens());

		domainObject.setRootfinding(ims.generalmedical.vo.domain.NeuroSensationRootValueVoAssembler.extractNeuRootSensFindingSet(domainFactory, valueObject.getRootfinding(), domainObject.getRootfinding(), domMap));		
		domainObject.setRightSensoryLevel(ims.core.vo.domain.VertebrallevelVoAssembler.extractVertebralLevels(domainFactory, valueObject.getRightSensoryLevel(), domMap));
		domainObject.setLeftSensoryLevel(ims.core.vo.domain.VertebrallevelVoAssembler.extractVertebralLevels(domainFactory, valueObject.getLeftSensoryLevel(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getFrankleGrade() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getFrankleGrade().getID());
		}
		domainObject.setFrankleGrade(value4);
		domainObject.setIsProblem(valueObject.getIsProblem());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value6 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value6 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value6);
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.DateTime dateTime8 = valueObject.getAuthoringDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value8);
		ims.core.admin.domain.objects.CareContext value9 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value9 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getCareContext();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value9);

		return domainObject;
	}

}
