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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class PrognosticGroupingCongfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVo copy(ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObjectDest, ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrognosticGroupingConfig(valueObjectSrc.getID_PrognosticGroupingConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isHistologicalTypePertinent
		valueObjectDest.setIsHistologicalTypePertinent(valueObjectSrc.getIsHistologicalTypePertinent());
		// isHistologicalGradePertinent
		valueObjectDest.setIsHistologicalGradePertinent(valueObjectSrc.getIsHistologicalGradePertinent());
		// isTumourLocationPertinent
		valueObjectDest.setIsTumourLocationPertinent(valueObjectSrc.getIsTumourLocationPertinent());
		// isRiskCategoryPertinent
		valueObjectDest.setIsRiskCategoryPertinent(valueObjectSrc.getIsRiskCategoryPertinent());
		// isPSAPertinent
		valueObjectDest.setIsPSAPertinent(valueObjectSrc.getIsPSAPertinent());
		// isGleasonPertinent
		valueObjectDest.setIsGleasonPertinent(valueObjectSrc.getIsGleasonPertinent());
		// PSA
		valueObjectDest.setPSA(valueObjectSrc.getPSA());
		// Gleason
		valueObjectDest.setGleason(valueObjectSrc.getGleason());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Risk
		valueObjectDest.setRisk(valueObjectSrc.getRisk());
		// useTValues
		valueObjectDest.setUseTValues(valueObjectSrc.getUseTValues());
		// useMValues
		valueObjectDest.setUseMValues(valueObjectSrc.getUseMValues());
		// useNValues
		valueObjectDest.setUseNValues(valueObjectSrc.getUseNValues());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.PrognosticGroupingConfig objects.
	 */
	public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(java.util.Set domainObjectSet)	
	{
		return createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.PrognosticGroupingConfig objects.
	 */
	public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection voList = new ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject = (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig) iterator.next();
			ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.PrognosticGroupingConfig objects.
	 */
	public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(java.util.List domainObjectList) 
	{
		return createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.PrognosticGroupingConfig objects.
	 */
	public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection createPrognosticGroupingCongfigVoCollectionFromPrognosticGroupingConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection voList = new ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject = (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig) domainObjectList.get(i);
			ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.PrognosticGroupingConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrognosticGroupingConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection voCollection) 
	 {
	 	return extractPrognosticGroupingConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrognosticGroupingConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject = PrognosticGroupingCongfigVoAssembler.extractPrognosticGroupingConfig(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.PrognosticGroupingConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrognosticGroupingConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection voCollection) 
	 {
	 	return extractPrognosticGroupingConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrognosticGroupingConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PrognosticGroupingCongfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject = PrognosticGroupingCongfigVoAssembler.extractPrognosticGroupingConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.PrognosticGroupingConfig object.
	 * @param domainObject ims.oncology.configuration.domain.objects.PrognosticGroupingConfig
	 */
	 public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVo create(ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.PrognosticGroupingConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObject = (ims.clinicaladmin.vo.PrognosticGroupingCongfigVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.PrognosticGroupingCongfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.PrognosticGroupingCongfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.PrognosticGroupingConfig
	 */
	 public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVo insert(ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObject, ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.PrognosticGroupingConfig
	 */
	 public static ims.clinicaladmin.vo.PrognosticGroupingCongfigVo insert(DomainObjectMap map, ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObject, ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrognosticGroupingConfig(domainObject.getId());
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
			
		// isHistologicalTypePertinent
		valueObject.setIsHistologicalTypePertinent( domainObject.isIsHistologicalTypePertinent() );
		// isHistologicalGradePertinent
		valueObject.setIsHistologicalGradePertinent( domainObject.isIsHistologicalGradePertinent() );
		// isTumourLocationPertinent
		valueObject.setIsTumourLocationPertinent( domainObject.isIsTumourLocationPertinent() );
		// isRiskCategoryPertinent
		valueObject.setIsRiskCategoryPertinent( domainObject.isIsRiskCategoryPertinent() );
		// isPSAPertinent
		valueObject.setIsPSAPertinent( domainObject.isIsPSAPertinent() );
		// isGleasonPertinent
		valueObject.setIsGleasonPertinent( domainObject.isIsGleasonPertinent() );
		// PSA
		valueObject.setPSA(ims.clinicaladmin.vo.domain.PSAConfigVoAssembler.createPSAConfigVoCollectionFromPSAConfig(map, domainObject.getPSA()) );
		// Gleason
		valueObject.setGleason(ims.clinicaladmin.vo.domain.GleasonConfigLiteVoAssembler.createGleasonConfigLiteVoCollectionFromGleasonConfig(map, domainObject.getGleason()) );
		// Location
		valueObject.setLocation(ims.oncology.vo.domain.PrognosticLocationConfigVoAssembler.createPrognosticLocationConfigVoCollectionFromPrognosticLocationConfig(map, domainObject.getLocation()) );
		// Risk
		valueObject.setRisk(ims.clinicaladmin.vo.domain.PrognosticRiskConfigVoAssembler.createPrognosticRiskConfigVoCollectionFromPrognosticRiskConfiguration(map, domainObject.getRisk()) );
		// useTValues
		valueObject.setUseTValues( domainObject.isUseTValues() );
		// useMValues
		valueObject.setUseMValues( domainObject.isUseMValues() );
		// useNValues
		valueObject.setUseNValues( domainObject.isUseNValues() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.PrognosticGroupingConfig extractPrognosticGroupingConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObject) 
	{
		return 	extractPrognosticGroupingConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.PrognosticGroupingConfig extractPrognosticGroupingConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.PrognosticGroupingCongfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrognosticGroupingConfig();
		ims.oncology.configuration.domain.objects.PrognosticGroupingConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.PrognosticGroupingCongfigVo ID_PrognosticGroupingConfig field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.PrognosticGroupingConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrognosticGroupingConfig());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.PrognosticGroupingConfig) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.PrognosticGroupingConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrognosticGroupingConfig());

		domainObject.setIsHistologicalTypePertinent(valueObject.getIsHistologicalTypePertinent());
		domainObject.setIsHistologicalGradePertinent(valueObject.getIsHistologicalGradePertinent());
		domainObject.setIsTumourLocationPertinent(valueObject.getIsTumourLocationPertinent());
		domainObject.setIsRiskCategoryPertinent(valueObject.getIsRiskCategoryPertinent());
		domainObject.setIsPSAPertinent(valueObject.getIsPSAPertinent());
		domainObject.setIsGleasonPertinent(valueObject.getIsGleasonPertinent());

		// SaveAsRefVO treated as RefValueObject
		ims.oncology.configuration.vo.PSAConfigRefVoCollection refCollection7 = new ims.oncology.configuration.vo.PSAConfigRefVoCollection();
		if (valueObject.getPSA() != null)
		{
			for (int i7=0; i7<valueObject.getPSA().size(); i7++)
			{
				ims.oncology.configuration.vo.PSAConfigRefVo ref7 = (ims.oncology.configuration.vo.PSAConfigRefVo)valueObject.getPSA().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.List domainPSA7 = domainObject.getPSA();
		if (domainPSA7 == null)
		{
			domainPSA7 = new java.util.ArrayList();
		}
		for(int i=0; i < size7; i++) 
		{
			ims.oncology.configuration.vo.PSAConfigRefVo vo = refCollection7.get(i);			
			ims.oncology.configuration.domain.objects.PSAConfig dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.PSAConfig)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.PSAConfig)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.PSAConfig.class, vo.getBoId());
				}
			}

			int domIdx = domainPSA7.indexOf(dom);
			if (domIdx == -1)
			{
				domainPSA7.add(i, dom);
			}
			else if (i != domIdx && i < domainPSA7.size())
			{
				Object tmp = domainPSA7.get(i);
				domainPSA7.set(i, domainPSA7.get(domIdx));
				domainPSA7.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i7 = domainPSA7.size();
		while (i7 > size7)
		{
			domainPSA7.remove(i7-1);
			i7 = domainPSA7.size();
		}
		
		domainObject.setPSA(domainPSA7);		

		// SaveAsRefVO treated as RefValueObject
		ims.oncology.configuration.vo.GleasonConfigRefVoCollection refCollection8 = new ims.oncology.configuration.vo.GleasonConfigRefVoCollection();
		if (valueObject.getGleason() != null)
		{
			for (int i8=0; i8<valueObject.getGleason().size(); i8++)
			{
				ims.oncology.configuration.vo.GleasonConfigRefVo ref8 = (ims.oncology.configuration.vo.GleasonConfigRefVo)valueObject.getGleason().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainGleason8 = domainObject.getGleason();
		if (domainGleason8 == null)
		{
			domainGleason8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.oncology.configuration.vo.GleasonConfigRefVo vo = refCollection8.get(i);			
			ims.oncology.configuration.domain.objects.GleasonConfig dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.GleasonConfig)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.GleasonConfig)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.GleasonConfig.class, vo.getBoId());
				}
			}

			int domIdx = domainGleason8.indexOf(dom);
			if (domIdx == -1)
			{
				domainGleason8.add(i, dom);
			}
			else if (i != domIdx && i < domainGleason8.size())
			{
				Object tmp = domainGleason8.get(i);
				domainGleason8.set(i, domainGleason8.get(domIdx));
				domainGleason8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainGleason8.size();
		while (i8 > size8)
		{
			domainGleason8.remove(i8-1);
			i8 = domainGleason8.size();
		}
		
		domainObject.setGleason(domainGleason8);		

		// SaveAsRefVO treated as RefValueObject
		ims.oncology.configuration.vo.PrognosticLocationConfigRefVoCollection refCollection9 = new ims.oncology.configuration.vo.PrognosticLocationConfigRefVoCollection();
		if (valueObject.getLocation() != null)
		{
			for (int i9=0; i9<valueObject.getLocation().size(); i9++)
			{
				ims.oncology.configuration.vo.PrognosticLocationConfigRefVo ref9 = (ims.oncology.configuration.vo.PrognosticLocationConfigRefVo)valueObject.getLocation().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainLocation9 = domainObject.getLocation();
		if (domainLocation9 == null)
		{
			domainLocation9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.oncology.configuration.vo.PrognosticLocationConfigRefVo vo = refCollection9.get(i);			
			ims.oncology.configuration.domain.objects.PrognosticLocationConfig dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.PrognosticLocationConfig.class, vo.getBoId());
				}
			}

			int domIdx = domainLocation9.indexOf(dom);
			if (domIdx == -1)
			{
				domainLocation9.add(i, dom);
			}
			else if (i != domIdx && i < domainLocation9.size())
			{
				Object tmp = domainLocation9.get(i);
				domainLocation9.set(i, domainLocation9.get(domIdx));
				domainLocation9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainLocation9.size();
		while (i9 > size9)
		{
			domainLocation9.remove(i9-1);
			i9 = domainLocation9.size();
		}
		
		domainObject.setLocation(domainLocation9);		

		// SaveAsRefVO treated as RefValueObject
		ims.oncology.configuration.vo.PrognosticRiskConfigurationRefVoCollection refCollection10 = new ims.oncology.configuration.vo.PrognosticRiskConfigurationRefVoCollection();
		if (valueObject.getRisk() != null)
		{
			for (int i10=0; i10<valueObject.getRisk().size(); i10++)
			{
				ims.oncology.configuration.vo.PrognosticRiskConfigurationRefVo ref10 = (ims.oncology.configuration.vo.PrognosticRiskConfigurationRefVo)valueObject.getRisk().get(i10);
				refCollection10.add(ref10);
			}
		}
		int size10 = (null == refCollection10) ? 0 : refCollection10.size();		
		java.util.List domainRisk10 = domainObject.getRisk();
		if (domainRisk10 == null)
		{
			domainRisk10 = new java.util.ArrayList();
		}
		for(int i=0; i < size10; i++) 
		{
			ims.oncology.configuration.vo.PrognosticRiskConfigurationRefVo vo = refCollection10.get(i);			
			ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)domainFactory.getDomainObject( ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration.class, vo.getBoId());
				}
			}

			int domIdx = domainRisk10.indexOf(dom);
			if (domIdx == -1)
			{
				domainRisk10.add(i, dom);
			}
			else if (i != domIdx && i < domainRisk10.size())
			{
				Object tmp = domainRisk10.get(i);
				domainRisk10.set(i, domainRisk10.get(domIdx));
				domainRisk10.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i10 = domainRisk10.size();
		while (i10 > size10)
		{
			domainRisk10.remove(i10-1);
			i10 = domainRisk10.size();
		}
		
		domainObject.setRisk(domainRisk10);		
		domainObject.setUseTValues(valueObject.getUseTValues());
		domainObject.setUseMValues(valueObject.getUseMValues());
		domainObject.setUseNValues(valueObject.getUseNValues());

		return domainObject;
	}

}
