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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class AdviceLeafletsForSelectAndPrinterVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo copy(ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObjectDest, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AdviceLeaflets(valueObjectSrc.getID_AdviceLeaflets());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// adviceLeaflet
		valueObjectDest.setAdviceLeaflet(valueObjectSrc.getAdviceLeaflet());
		// template
		valueObjectDest.setTemplate(valueObjectSrc.getTemplate());
		// dateGiven
		valueObjectDest.setDateGiven(valueObjectSrc.getDateGiven());
		// givenTo
		valueObjectDest.setGivenTo(valueObjectSrc.getGivenTo());
		// givenToName
		valueObjectDest.setGivenToName(valueObjectSrc.getGivenToName());
		// leafletVersion
		valueObjectDest.setLeafletVersion(valueObjectSrc.getLeafletVersion());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringHCP
		valueObjectDest.setAuthoringHCP(valueObjectSrc.getAuthoringHCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.AdviceLeaflets objects.
	 */
	public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(java.util.Set domainObjectSet)	
	{
		return createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.AdviceLeaflets objects.
	 */
	public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection voList = new ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.AdviceLeaflets domainObject = (ims.core.clinical.domain.objects.AdviceLeaflets) iterator.next();
			ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.AdviceLeaflets objects.
	 */
	public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(java.util.List domainObjectList) 
	{
		return createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.AdviceLeaflets objects.
	 */
	public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection createAdviceLeafletsForSelectAndPrinterVoCollectionFromAdviceLeaflets(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection voList = new ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.AdviceLeaflets domainObject = (ims.core.clinical.domain.objects.AdviceLeaflets) domainObjectList.get(i);
			ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.AdviceLeaflets set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAdviceLeafletsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection voCollection) 
	 {
	 	return extractAdviceLeafletsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAdviceLeafletsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.AdviceLeaflets domainObject = AdviceLeafletsForSelectAndPrinterVoAssembler.extractAdviceLeaflets(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.AdviceLeaflets list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAdviceLeafletsList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection voCollection) 
	 {
	 	return extractAdviceLeafletsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAdviceLeafletsList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.AdviceLeaflets domainObject = AdviceLeafletsForSelectAndPrinterVoAssembler.extractAdviceLeaflets(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.AdviceLeaflets object.
	 * @param domainObject ims.core.clinical.domain.objects.AdviceLeaflets
	 */
	 public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo create(ims.core.clinical.domain.objects.AdviceLeaflets domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.AdviceLeaflets object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo create(DomainObjectMap map, ims.core.clinical.domain.objects.AdviceLeaflets domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObject = (ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo) map.getValueObject(domainObject, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.AdviceLeaflets
	 */
	 public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo insert(ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObject, ims.core.clinical.domain.objects.AdviceLeaflets domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.AdviceLeaflets
	 */
	 public static ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo insert(DomainObjectMap map, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObject, ims.core.clinical.domain.objects.AdviceLeaflets domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AdviceLeaflets(domainObject.getId());
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
			
		// adviceLeaflet
		ims.domain.lookups.LookupInstance instance1 = domainObject.getAdviceLeaflet();
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

			ims.core.vo.lookups.AdviceLeaflets voLookup1 = new ims.core.vo.lookups.AdviceLeaflets(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.AdviceLeaflets parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.AdviceLeaflets(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setAdviceLeaflet(voLookup1);
		}
				// template
		if (domainObject.getTemplate() != null)
		{
			if(domainObject.getTemplate() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTemplate();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTemplate(new ims.core.admin.vo.TemplateBoRefVo(id, -1));				
			}
			else
			{
				valueObject.setTemplate(new ims.core.admin.vo.TemplateBoRefVo(domainObject.getTemplate().getId(), domainObject.getTemplate().getVersion()));
			}
		}
		// dateGiven
		java.util.Date dateGiven = domainObject.getDateGiven();
		if ( null != dateGiven ) 
		{
			valueObject.setDateGiven(new ims.framework.utils.Date(dateGiven) );
		}
		// givenTo
		ims.domain.lookups.LookupInstance instance4 = domainObject.getGivenTo();
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

			ims.core.vo.lookups.AdviceLeafletGivenTo voLookup4 = new ims.core.vo.lookups.AdviceLeafletGivenTo(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.AdviceLeafletGivenTo parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.AdviceLeafletGivenTo(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setGivenTo(voLookup4);
		}
				// givenToName
		valueObject.setGivenToName(domainObject.getGivenToName());
		// leafletVersion
		valueObject.setLeafletVersion(domainObject.getLeafletVersion());
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
		// AuthoringHCP
		valueObject.setAuthoringHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAuthoringHCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.AdviceLeaflets extractAdviceLeaflets(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObject) 
	{
		return 	extractAdviceLeaflets(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.AdviceLeaflets extractAdviceLeaflets(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AdviceLeaflets();
		ims.core.clinical.domain.objects.AdviceLeaflets domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.AdviceLeaflets)domMap.get(valueObject);
			}
			// ims.emergency.vo.AdviceLeafletsForSelectAndPrinterVo ID_AdviceLeaflets field is unknown
			domainObject = new ims.core.clinical.domain.objects.AdviceLeaflets();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AdviceLeaflets());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.AdviceLeaflets)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.AdviceLeaflets) domainFactory.getDomainObject(ims.core.clinical.domain.objects.AdviceLeaflets.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AdviceLeaflets());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getAdviceLeaflet() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getAdviceLeaflet().getID());
		}
		domainObject.setAdviceLeaflet(value1);
		ims.core.admin.domain.objects.TemplateBo value2 = null;
		if ( null != valueObject.getTemplate() ) 
		{
			if (valueObject.getTemplate().getBoId() == null)
			{
				if (domMap.get(valueObject.getTemplate()) != null)
				{
					value2 = (ims.core.admin.domain.objects.TemplateBo)domMap.get(valueObject.getTemplate());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getTemplate();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.TemplateBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, valueObject.getTemplate().getBoId());
			}
		}
		domainObject.setTemplate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateGiven();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateGiven(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getGivenTo() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getGivenTo().getID());
		}
		domainObject.setGivenTo(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGivenToName() != null && valueObject.getGivenToName().equals(""))
		{
			valueObject.setGivenToName(null);
		}
		domainObject.setGivenToName(valueObject.getGivenToName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLeafletVersion() != null && valueObject.getLeafletVersion().equals(""))
		{
			valueObject.setLeafletVersion(null);
		}
		domainObject.setLeafletVersion(valueObject.getLeafletVersion());
		ims.core.admin.domain.objects.CareContext value7 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value7 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCareContext();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getAuthoringHCP() ) 
		{
			if (valueObject.getAuthoringHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringHCP()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAuthoringHCP());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAuthoringHCP().getBoId());
			}
		}
		domainObject.setAuthoringHCP(value8);
		ims.framework.utils.DateTime dateTime9 = valueObject.getAuthoringDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value9);

		return domainObject;
	}

}
