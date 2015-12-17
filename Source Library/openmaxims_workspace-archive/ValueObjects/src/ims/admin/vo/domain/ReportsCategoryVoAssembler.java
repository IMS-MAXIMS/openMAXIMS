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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class ReportsCategoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ReportsCategoryVo copy(ims.admin.vo.ReportsCategoryVo valueObjectDest, ims.admin.vo.ReportsCategoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReportsCategory(valueObjectSrc.getID_ReportsCategory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Reports
		valueObjectDest.setReports(valueObjectSrc.getReports());
		// ParentCategory
		valueObjectDest.setParentCategory(valueObjectSrc.getParentCategory());
		// SubCategories
		valueObjectDest.setSubCategories(valueObjectSrc.getSubCategories());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReportsCategoryVoCollectionFromReportsCategory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ReportsCategory objects.
	 */
	public static ims.admin.vo.ReportsCategoryVoCollection createReportsCategoryVoCollectionFromReportsCategory(java.util.Set domainObjectSet)	
	{
		return createReportsCategoryVoCollectionFromReportsCategory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.ReportsCategory objects.
	 */
	public static ims.admin.vo.ReportsCategoryVoCollection createReportsCategoryVoCollectionFromReportsCategory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ReportsCategoryVoCollection voList = new ims.admin.vo.ReportsCategoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.ReportsCategory domainObject = (ims.core.admin.domain.objects.ReportsCategory) iterator.next();
			ims.admin.vo.ReportsCategoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ReportsCategory objects.
	 */
	public static ims.admin.vo.ReportsCategoryVoCollection createReportsCategoryVoCollectionFromReportsCategory(java.util.List domainObjectList) 
	{
		return createReportsCategoryVoCollectionFromReportsCategory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.ReportsCategory objects.
	 */
	public static ims.admin.vo.ReportsCategoryVoCollection createReportsCategoryVoCollectionFromReportsCategory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ReportsCategoryVoCollection voList = new ims.admin.vo.ReportsCategoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.ReportsCategory domainObject = (ims.core.admin.domain.objects.ReportsCategory) domainObjectList.get(i);
			ims.admin.vo.ReportsCategoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.ReportsCategory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReportsCategorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportsCategoryVoCollection voCollection) 
	 {
	 	return extractReportsCategorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReportsCategorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportsCategoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ReportsCategoryVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ReportsCategory domainObject = ReportsCategoryVoAssembler.extractReportsCategory(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.ReportsCategory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReportsCategoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportsCategoryVoCollection voCollection) 
	 {
	 	return extractReportsCategoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReportsCategoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportsCategoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ReportsCategoryVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.ReportsCategory domainObject = ReportsCategoryVoAssembler.extractReportsCategory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.ReportsCategory object.
	 * @param domainObject ims.core.admin.domain.objects.ReportsCategory
	 */
	 public static ims.admin.vo.ReportsCategoryVo create(ims.core.admin.domain.objects.ReportsCategory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.ReportsCategory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ReportsCategoryVo create(DomainObjectMap map, ims.core.admin.domain.objects.ReportsCategory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ReportsCategoryVo valueObject = (ims.admin.vo.ReportsCategoryVo) map.getValueObject(domainObject, ims.admin.vo.ReportsCategoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ReportsCategoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.ReportsCategory
	 */
	 public static ims.admin.vo.ReportsCategoryVo insert(ims.admin.vo.ReportsCategoryVo valueObject, ims.core.admin.domain.objects.ReportsCategory domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.ReportsCategory
	 */
	 public static ims.admin.vo.ReportsCategoryVo insert(DomainObjectMap map, ims.admin.vo.ReportsCategoryVo valueObject, ims.core.admin.domain.objects.ReportsCategory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReportsCategory(domainObject.getId());
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
			
		// Reports
		ims.core.admin.vo.ReportBoRefVoCollection Reports = new ims.core.admin.vo.ReportBoRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getReports().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.domain.objects.ReportBo tmp = (ims.core.admin.domain.objects.ReportBo)iterator.next();
			if (tmp != null)
				Reports.add(new ims.core.admin.vo.ReportBoRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setReports(Reports);
		// ParentCategory
		if (domainObject.getParentCategory() != null)
		{
			if(domainObject.getParentCategory() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getParentCategory();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setParentCategory(new ims.core.admin.vo.ReportsCategoryRefVo(id, -1));				
			}
			else
			{
				valueObject.setParentCategory(new ims.core.admin.vo.ReportsCategoryRefVo(domainObject.getParentCategory().getId(), domainObject.getParentCategory().getVersion()));
			}
		}
		// SubCategories
		ims.core.admin.vo.ReportsCategoryRefVoCollection SubCategories = new ims.core.admin.vo.ReportsCategoryRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getSubCategories().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.domain.objects.ReportsCategory tmp = (ims.core.admin.domain.objects.ReportsCategory)iterator.next();
			if (tmp != null)
				SubCategories.add(new ims.core.admin.vo.ReportsCategoryRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setSubCategories(SubCategories);
		// Name
		valueObject.setName(domainObject.getName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.ReportsCategory extractReportsCategory(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportsCategoryVo valueObject) 
	{
		return 	extractReportsCategory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.ReportsCategory extractReportsCategory(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportsCategoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReportsCategory();
		ims.core.admin.domain.objects.ReportsCategory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.ReportsCategory)domMap.get(valueObject);
			}
			// ims.admin.vo.ReportsCategoryVo ID_ReportsCategory field is unknown
			domainObject = new ims.core.admin.domain.objects.ReportsCategory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReportsCategory());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.ReportsCategory)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.ReportsCategory) domainFactory.getDomainObject(ims.core.admin.domain.objects.ReportsCategory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReportsCategory());


		ims.core.admin.vo.ReportBoRefVoCollection refCollection1 = valueObject.getReports();
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainReports1 = domainObject.getReports();
		if (domainReports1 == null)
		{
			domainReports1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.core.admin.vo.ReportBoRefVo vo = refCollection1.get(i);					
			ims.core.admin.domain.objects.ReportBo dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.ReportBo)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.ReportBo)domainFactory.getDomainObject( ims.core.admin.domain.objects.ReportBo.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainReports1.contains(dom))
			{
				domainReports1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainReports1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainReports1.remove(iter1.next());
		}		
		
		domainObject.setReports(domainReports1);		
		ims.core.admin.domain.objects.ReportsCategory value2 = null;
		if ( null != valueObject.getParentCategory() ) 
		{
			if (valueObject.getParentCategory().getBoId() == null)
			{
				if (domMap.get(valueObject.getParentCategory()) != null)
				{
					value2 = (ims.core.admin.domain.objects.ReportsCategory)domMap.get(valueObject.getParentCategory());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getParentCategory();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.ReportsCategory)domainFactory.getDomainObject(ims.core.admin.domain.objects.ReportsCategory.class, valueObject.getParentCategory().getBoId());
			}
		}
		domainObject.setParentCategory(value2);

		ims.core.admin.vo.ReportsCategoryRefVoCollection refCollection3 = valueObject.getSubCategories();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainSubCategories3 = domainObject.getSubCategories();
		if (domainSubCategories3 == null)
		{
			domainSubCategories3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.admin.vo.ReportsCategoryRefVo vo = refCollection3.get(i);					
			ims.core.admin.domain.objects.ReportsCategory dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.ReportsCategory)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.ReportsCategory)domainFactory.getDomainObject( ims.core.admin.domain.objects.ReportsCategory.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainSubCategories3.contains(dom))
			{
				domainSubCategories3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainSubCategories3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainSubCategories3.remove(iter3.next());
		}		
		
		domainObject.setSubCategories(domainSubCategories3);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());

		return domainObject;
	}

}
