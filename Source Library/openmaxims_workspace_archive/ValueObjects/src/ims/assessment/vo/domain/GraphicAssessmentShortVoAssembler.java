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
package ims.assessment.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class GraphicAssessmentShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.GraphicAssessmentShortVo copy(ims.assessment.vo.GraphicAssessmentShortVo valueObjectDest, ims.assessment.vo.GraphicAssessmentShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GraphicAssessment(valueObjectSrc.getID_GraphicAssessment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AssessmentSpecialties
		valueObjectDest.setAssessmentSpecialties(valueObjectSrc.getAssessmentSpecialties());
		// AssociatedReportForPrinting
		valueObjectDest.setAssociatedReportForPrinting(valueObjectSrc.getAssociatedReportForPrinting());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// AssessmentType
		valueObjectDest.setAssessmentType(valueObjectSrc.getAssessmentType());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// HelpUrl
		valueObjectDest.setHelpUrl(valueObjectSrc.getHelpUrl());
		// StorePrintedReport
		valueObjectDest.setStorePrintedReport(valueObjectSrc.getStorePrintedReport());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGraphicAssessmentShortVoCollectionFromGraphicAssessment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.GraphicAssessment objects.
	 */
	public static ims.assessment.vo.GraphicAssessmentShortVoCollection createGraphicAssessmentShortVoCollectionFromGraphicAssessment(java.util.Set domainObjectSet)	
	{
		return createGraphicAssessmentShortVoCollectionFromGraphicAssessment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.GraphicAssessment objects.
	 */
	public static ims.assessment.vo.GraphicAssessmentShortVoCollection createGraphicAssessmentShortVoCollectionFromGraphicAssessment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.GraphicAssessmentShortVoCollection voList = new ims.assessment.vo.GraphicAssessmentShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.GraphicAssessment domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessment) iterator.next();
			ims.assessment.vo.GraphicAssessmentShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.GraphicAssessment objects.
	 */
	public static ims.assessment.vo.GraphicAssessmentShortVoCollection createGraphicAssessmentShortVoCollectionFromGraphicAssessment(java.util.List domainObjectList) 
	{
		return createGraphicAssessmentShortVoCollectionFromGraphicAssessment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.GraphicAssessment objects.
	 */
	public static ims.assessment.vo.GraphicAssessmentShortVoCollection createGraphicAssessmentShortVoCollectionFromGraphicAssessment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.GraphicAssessmentShortVoCollection voList = new ims.assessment.vo.GraphicAssessmentShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.GraphicAssessment domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessment) domainObjectList.get(i);
			ims.assessment.vo.GraphicAssessmentShortVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.configuration.domain.objects.GraphicAssessment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGraphicAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.GraphicAssessmentShortVoCollection voCollection) 
	 {
	 	return extractGraphicAssessmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGraphicAssessmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.GraphicAssessmentShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.GraphicAssessmentShortVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.GraphicAssessment domainObject = GraphicAssessmentShortVoAssembler.extractGraphicAssessment(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.configuration.domain.objects.GraphicAssessment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGraphicAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.GraphicAssessmentShortVoCollection voCollection) 
	 {
	 	return extractGraphicAssessmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGraphicAssessmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.GraphicAssessmentShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.GraphicAssessmentShortVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.GraphicAssessment domainObject = GraphicAssessmentShortVoAssembler.extractGraphicAssessment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.GraphicAssessment object.
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessment
	 */
	 public static ims.assessment.vo.GraphicAssessmentShortVo create(ims.assessment.configuration.domain.objects.GraphicAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.GraphicAssessment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.GraphicAssessmentShortVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.GraphicAssessment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.GraphicAssessmentShortVo valueObject = (ims.assessment.vo.GraphicAssessmentShortVo) map.getValueObject(domainObject, ims.assessment.vo.GraphicAssessmentShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.GraphicAssessmentShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessment
	 */
	 public static ims.assessment.vo.GraphicAssessmentShortVo insert(ims.assessment.vo.GraphicAssessmentShortVo valueObject, ims.assessment.configuration.domain.objects.GraphicAssessment domainObject) 
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
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessment
	 */
	 public static ims.assessment.vo.GraphicAssessmentShortVo insert(DomainObjectMap map, ims.assessment.vo.GraphicAssessmentShortVo valueObject, ims.assessment.configuration.domain.objects.GraphicAssessment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GraphicAssessment(domainObject.getId());
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
			
		// AssessmentSpecialties
		java.util.List listAssessmentSpecialties = domainObject.getAssessmentSpecialties();
		ims.core.vo.lookups.SpecialtyCollection AssessmentSpecialties = new ims.core.vo.lookups.SpecialtyCollection();
		for(java.util.Iterator iterator = listAssessmentSpecialties.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.Specialty voInstance = new ims.core.vo.lookups.Specialty(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.Specialty(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AssessmentSpecialties.add(voInstance);
		}
		valueObject.setAssessmentSpecialties( AssessmentSpecialties );
		// AssociatedReportForPrinting
		if (domainObject.getAssociatedReportForPrinting() != null)
		{
			if(domainObject.getAssociatedReportForPrinting() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssociatedReportForPrinting();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssociatedReportForPrinting(new ims.core.admin.vo.TemplateBoRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssociatedReportForPrinting(new ims.core.admin.vo.TemplateBoRefVo(domainObject.getAssociatedReportForPrinting().getId(), domainObject.getAssociatedReportForPrinting().getVersion()));
			}
		}
		// Name
		valueObject.setName(domainObject.getName());
		// AssessmentType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAssessmentType();
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

			ims.core.vo.lookups.UserDefinedAssessmentType voLookup4 = new ims.core.vo.lookups.UserDefinedAssessmentType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.UserDefinedAssessmentType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.UserDefinedAssessmentType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAssessmentType(voLookup4);
		}
				// ActiveStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getActiveStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup5 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setActiveStatus(voLookup5);
		}
				// HelpUrl
		valueObject.setHelpUrl(domainObject.getHelpUrl());
		// StorePrintedReport
		valueObject.setStorePrintedReport( domainObject.isStorePrintedReport() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.GraphicAssessment extractGraphicAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.GraphicAssessmentShortVo valueObject) 
	{
		return 	extractGraphicAssessment(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.GraphicAssessment extractGraphicAssessment(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.GraphicAssessmentShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GraphicAssessment();
		ims.assessment.configuration.domain.objects.GraphicAssessment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.GraphicAssessment)domMap.get(valueObject);
			}
			// ims.assessment.vo.GraphicAssessmentShortVo ID_GraphicAssessment field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.GraphicAssessment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GraphicAssessment());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.GraphicAssessment)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessment) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.GraphicAssessment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GraphicAssessment());

		ims.core.vo.lookups.SpecialtyCollection collection1 =
	valueObject.getAssessmentSpecialties();
	    java.util.List domainAssessmentSpecialties = domainObject.getAssessmentSpecialties();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainAssessmentSpecialties = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAssessmentSpecialties.indexOf(dom);
			if (domIdx == -1)
			{
				domainAssessmentSpecialties.add(i, dom);
			}
			else if (i != domIdx && i < domainAssessmentSpecialties.size())
			{
				Object tmp = domainAssessmentSpecialties.get(i);
				domainAssessmentSpecialties.set(i, domainAssessmentSpecialties.get(domIdx));
				domainAssessmentSpecialties.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainAssessmentSpecialties.size();
		while (j1 > collection1Size)
		{
			domainAssessmentSpecialties.remove(j1-1);
			j1 = domainAssessmentSpecialties.size();
		}

		domainObject.setAssessmentSpecialties(domainAssessmentSpecialties);		
		ims.core.admin.domain.objects.TemplateBo value2 = null;
		if ( null != valueObject.getAssociatedReportForPrinting() ) 
		{
			if (valueObject.getAssociatedReportForPrinting().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedReportForPrinting()) != null)
				{
					value2 = (ims.core.admin.domain.objects.TemplateBo)domMap.get(valueObject.getAssociatedReportForPrinting());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAssociatedReportForPrinting();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.TemplateBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, valueObject.getAssociatedReportForPrinting().getBoId());
			}
		}
		domainObject.setAssociatedReportForPrinting(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAssessmentType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAssessmentType().getID());
		}
		domainObject.setAssessmentType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHelpUrl() != null && valueObject.getHelpUrl().equals(""))
		{
			valueObject.setHelpUrl(null);
		}
		domainObject.setHelpUrl(valueObject.getHelpUrl());
		domainObject.setStorePrintedReport(valueObject.getStorePrintedReport());

		return domainObject;
	}

}
