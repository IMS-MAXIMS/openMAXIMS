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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ConsultantStayVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ConsultantStayVo copy(ims.core.vo.ConsultantStayVo valueObjectDest, ims.core.vo.ConsultantStayVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ConsultantStay(valueObjectSrc.getID_ConsultantStay());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CodingStatus
		valueObjectDest.setCodingStatus(valueObjectSrc.getCodingStatus());
		// CodingComment
		valueObjectDest.setCodingComment(valueObjectSrc.getCodingComment());
		// HistologyStatus
		valueObjectDest.setHistologyStatus(valueObjectSrc.getHistologyStatus());
		// transferDateTime
		valueObjectDest.setTransferDateTime(valueObjectSrc.getTransferDateTime());
		// endDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// service
		valueObjectDest.setService(valueObjectSrc.getService());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConsultantStayVoCollectionFromConsultantStay(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.core.vo.ConsultantStayVoCollection createConsultantStayVoCollectionFromConsultantStay(java.util.Set domainObjectSet)	
	{
		return createConsultantStayVoCollectionFromConsultantStay(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.core.vo.ConsultantStayVoCollection createConsultantStayVoCollectionFromConsultantStay(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ConsultantStayVoCollection voList = new ims.core.vo.ConsultantStayVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = (ims.core.admin.pas.domain.objects.ConsultantStay) iterator.next();
			ims.core.vo.ConsultantStayVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.core.vo.ConsultantStayVoCollection createConsultantStayVoCollectionFromConsultantStay(java.util.List domainObjectList) 
	{
		return createConsultantStayVoCollectionFromConsultantStay(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.ConsultantStay objects.
	 */
	public static ims.core.vo.ConsultantStayVoCollection createConsultantStayVoCollectionFromConsultantStay(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ConsultantStayVoCollection voList = new ims.core.vo.ConsultantStayVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = (ims.core.admin.pas.domain.objects.ConsultantStay) domainObjectList.get(i);
			ims.core.vo.ConsultantStayVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.ConsultantStay set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractConsultantStaySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConsultantStayVoCollection voCollection) 
	 {
	 	return extractConsultantStaySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractConsultantStaySet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConsultantStayVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ConsultantStayVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = ConsultantStayVoAssembler.extractConsultantStay(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.ConsultantStay list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractConsultantStayList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConsultantStayVoCollection voCollection) 
	 {
	 	return extractConsultantStayList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractConsultantStayList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConsultantStayVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ConsultantStayVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.ConsultantStay domainObject = ConsultantStayVoAssembler.extractConsultantStay(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.ConsultantStay object.
	 * @param domainObject ims.core.admin.pas.domain.objects.ConsultantStay
	 */
	 public static ims.core.vo.ConsultantStayVo create(ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.ConsultantStay object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ConsultantStayVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ConsultantStayVo valueObject = (ims.core.vo.ConsultantStayVo) map.getValueObject(domainObject, ims.core.vo.ConsultantStayVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ConsultantStayVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.ConsultantStay
	 */
	 public static ims.core.vo.ConsultantStayVo insert(ims.core.vo.ConsultantStayVo valueObject, ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.ConsultantStay
	 */
	 public static ims.core.vo.ConsultantStayVo insert(DomainObjectMap map, ims.core.vo.ConsultantStayVo valueObject, ims.core.admin.pas.domain.objects.ConsultantStay domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ConsultantStay(domainObject.getId());
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
			
		// CodingStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getCodingStatus();
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

			ims.core.vo.lookups.CodingStatus voLookup1 = new ims.core.vo.lookups.CodingStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.CodingStatus parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.CodingStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setCodingStatus(voLookup1);
		}
				// CodingComment
		ims.clinical.vo.CodingCommentRefVoCollection CodingComment = new ims.clinical.vo.CodingCommentRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getCodingComment().iterator(); iterator.hasNext(); ) 
		{
			ims.clinical.domain.objects.CodingComment tmp = (ims.clinical.domain.objects.CodingComment)iterator.next();
			if (tmp != null)
				CodingComment.add(new ims.clinical.vo.CodingCommentRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setCodingComment(CodingComment);
		// HistologyStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getHistologyStatus();
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

			ims.clinical.vo.lookups.HistologyStatus voLookup3 = new ims.clinical.vo.lookups.HistologyStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.HistologyStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.HistologyStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setHistologyStatus(voLookup3);
		}
				// transferDateTime
		java.util.Date transferDateTime = domainObject.getTransferDateTime();
		if ( null != transferDateTime ) 
		{
			valueObject.setTransferDateTime(new ims.framework.utils.DateTime(transferDateTime) );
		}
		// endDateTime
		java.util.Date endDateTime = domainObject.getEndDateTime();
		if ( null != endDateTime ) 
		{
			valueObject.setEndDateTime(new ims.framework.utils.DateTime(endDateTime) );
		}
		// Specialty
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSpecialty();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup6 = new ims.core.vo.lookups.Specialty(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.Specialty(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSpecialty(voLookup6);
		}
				// service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// PatientStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPatientStatus();
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

			ims.core.vo.lookups.PatientStatus voLookup8 = new ims.core.vo.lookups.PatientStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PatientStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPatientStatus(voLookup8);
		}
				// consultant
		valueObject.setConsultant(ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getConsultant()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.ConsultantStay extractConsultantStay(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConsultantStayVo valueObject) 
	{
		return 	extractConsultantStay(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.ConsultantStay extractConsultantStay(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConsultantStayVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ConsultantStay();
		ims.core.admin.pas.domain.objects.ConsultantStay domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(valueObject);
			}
			// ims.core.vo.ConsultantStayVo ID_ConsultantStay field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.ConsultantStay();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ConsultantStay());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.ConsultantStay) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.ConsultantStay.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ConsultantStay());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getCodingStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getCodingStatus().getID());
		}
		domainObject.setCodingStatus(value1);

		ims.clinical.vo.CodingCommentRefVoCollection refCollection2 = valueObject.getCodingComment();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainCodingComment2 = domainObject.getCodingComment();
		if (domainCodingComment2 == null)
		{
			domainCodingComment2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.clinical.vo.CodingCommentRefVo vo = refCollection2.get(i);			
			ims.clinical.domain.objects.CodingComment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.clinical.domain.objects.CodingComment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.clinical.domain.objects.CodingComment)domainFactory.getDomainObject( ims.clinical.domain.objects.CodingComment.class, vo.getBoId());
				}
			}

			int domIdx = domainCodingComment2.indexOf(dom);
			if (domIdx == -1)
			{
				domainCodingComment2.add(i, dom);
			}
			else if (i != domIdx && i < domainCodingComment2.size())
			{
				Object tmp = domainCodingComment2.get(i);
				domainCodingComment2.set(i, domainCodingComment2.get(domIdx));
				domainCodingComment2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainCodingComment2.size();
		while (i2 > size2)
		{
			domainCodingComment2.remove(i2-1);
			i2 = domainCodingComment2.size();
		}
		
		domainObject.setCodingComment(domainCodingComment2);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getHistologyStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getHistologyStatus().getID());
		}
		domainObject.setHistologyStatus(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getTransferDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setTransferDateTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getEndDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setEndDateTime(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value7 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Medic value9 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value9 = (ims.core.resource.people.domain.objects.Medic)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value9 = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Medic.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value9);

		return domainObject;
	}

}
