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
 * @author Catalin Tomozei
 */
public class DischargeReportDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeReportDetailVo copy(ims.clinical.vo.DischargeReportDetailVo valueObjectDest, ims.clinical.vo.DischargeReportDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeReportDetail(valueObjectSrc.getID_DischargeReportDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// CompletingHCP
		valueObjectDest.setCompletingHCP(valueObjectSrc.getCompletingHCP());
		// DateOfCompletion
		valueObjectDest.setDateOfCompletion(valueObjectSrc.getDateOfCompletion());
		// GpRecipients
		valueObjectDest.setGpRecipients(valueObjectSrc.getGpRecipients());
		// copyLetterToPatient
		valueObjectDest.setCopyLetterToPatient(valueObjectSrc.getCopyLetterToPatient());
		// isClinicalDetailsComplete
		valueObjectDest.setIsClinicalDetailsComplete(valueObjectSrc.getIsClinicalDetailsComplete());
		// DischargeDocuments
		valueObjectDest.setDischargeDocuments(valueObjectSrc.getDischargeDocuments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeReportDetailVoCollectionFromDischargeReportDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeReportDetail objects.
	 */
	public static ims.clinical.vo.DischargeReportDetailVoCollection createDischargeReportDetailVoCollectionFromDischargeReportDetail(java.util.Set domainObjectSet)	
	{
		return createDischargeReportDetailVoCollectionFromDischargeReportDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeReportDetail objects.
	 */
	public static ims.clinical.vo.DischargeReportDetailVoCollection createDischargeReportDetailVoCollectionFromDischargeReportDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeReportDetailVoCollection voList = new ims.clinical.vo.DischargeReportDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.DischargeReportDetail domainObject = (ims.edischarge.domain.objects.DischargeReportDetail) iterator.next();
			ims.clinical.vo.DischargeReportDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeReportDetail objects.
	 */
	public static ims.clinical.vo.DischargeReportDetailVoCollection createDischargeReportDetailVoCollectionFromDischargeReportDetail(java.util.List domainObjectList) 
	{
		return createDischargeReportDetailVoCollectionFromDischargeReportDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeReportDetail objects.
	 */
	public static ims.clinical.vo.DischargeReportDetailVoCollection createDischargeReportDetailVoCollectionFromDischargeReportDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeReportDetailVoCollection voList = new ims.clinical.vo.DischargeReportDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.DischargeReportDetail domainObject = (ims.edischarge.domain.objects.DischargeReportDetail) domainObjectList.get(i);
			ims.clinical.vo.DischargeReportDetailVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.DischargeReportDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeReportDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReportDetailVoCollection voCollection) 
	 {
	 	return extractDischargeReportDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeReportDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReportDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeReportDetailVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeReportDetail domainObject = DischargeReportDetailVoAssembler.extractDischargeReportDetail(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.DischargeReportDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeReportDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReportDetailVoCollection voCollection) 
	 {
	 	return extractDischargeReportDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeReportDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReportDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeReportDetailVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeReportDetail domainObject = DischargeReportDetailVoAssembler.extractDischargeReportDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.DischargeReportDetail object.
	 * @param domainObject ims.edischarge.domain.objects.DischargeReportDetail
	 */
	 public static ims.clinical.vo.DischargeReportDetailVo create(ims.edischarge.domain.objects.DischargeReportDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.DischargeReportDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeReportDetailVo create(DomainObjectMap map, ims.edischarge.domain.objects.DischargeReportDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeReportDetailVo valueObject = (ims.clinical.vo.DischargeReportDetailVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeReportDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeReportDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.DischargeReportDetail
	 */
	 public static ims.clinical.vo.DischargeReportDetailVo insert(ims.clinical.vo.DischargeReportDetailVo valueObject, ims.edischarge.domain.objects.DischargeReportDetail domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.DischargeReportDetail
	 */
	 public static ims.clinical.vo.DischargeReportDetailVo insert(DomainObjectMap map, ims.clinical.vo.DischargeReportDetailVo valueObject, ims.edischarge.domain.objects.DischargeReportDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeReportDetail(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
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
		// CompletingHCP
		valueObject.setCompletingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getCompletingHCP()) );
		// DateOfCompletion
		java.util.Date DateOfCompletion = domainObject.getDateOfCompletion();
		if ( null != DateOfCompletion ) 
		{
			valueObject.setDateOfCompletion(new ims.framework.utils.DateTime(DateOfCompletion) );
		}
		// GpRecipients
		valueObject.setGpRecipients(ims.core.vo.domain.GPLiteWithCommChannelsVoAssembler.createGPLiteWithCommChannelsVoCollectionFromGp(map, domainObject.getGpRecipients()) );
		// copyLetterToPatient
		valueObject.setCopyLetterToPatient( domainObject.isCopyLetterToPatient() );
		// isClinicalDetailsComplete
		valueObject.setIsClinicalDetailsComplete( domainObject.isIsClinicalDetailsComplete() );
		// DischargeDocuments
		valueObject.setDischargeDocuments(ims.core.vo.domain.PatientDocumentVoAssembler.createPatientDocumentVoCollectionFromPatientDocument(map, domainObject.getDischargeDocuments()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.DischargeReportDetail extractDischargeReportDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReportDetailVo valueObject) 
	{
		return 	extractDischargeReportDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.DischargeReportDetail extractDischargeReportDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeReportDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeReportDetail();
		ims.edischarge.domain.objects.DischargeReportDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.DischargeReportDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeReportDetailVo ID_DischargeReportDetail field is unknown
			domainObject = new ims.edischarge.domain.objects.DischargeReportDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeReportDetail());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.DischargeReportDetail)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.DischargeReportDetail) domainFactory.getDomainObject(ims.edischarge.domain.objects.DischargeReportDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeReportDetail());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getCompletingHCP() ) 
		{
			if (valueObject.getCompletingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getCompletingHCP()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getCompletingHCP());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getCompletingHCP().getBoId());
			}
		}
		domainObject.setCompletingHCP(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getDateOfCompletion();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDateOfCompletion(value4);

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.people.vo.GpRefVoCollection refCollection5 = new ims.core.resource.people.vo.GpRefVoCollection();
		if (valueObject.getGpRecipients() != null)
		{
			for (int i5=0; i5<valueObject.getGpRecipients().size(); i5++)
			{
				ims.core.resource.people.vo.GpRefVo ref5 = (ims.core.resource.people.vo.GpRefVo)valueObject.getGpRecipients().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.Set domainGpRecipients5 = domainObject.getGpRecipients();
		if (domainGpRecipients5 == null)
		{
			domainGpRecipients5 = new java.util.HashSet();
		}
		java.util.Set newSet5  = new java.util.HashSet();
		for(int i=0; i<size5; i++) 
		{
			ims.core.resource.people.vo.GpRefVo vo = refCollection5.get(i);					
			ims.core.resource.people.domain.objects.Gp dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.people.domain.objects.Gp)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.people.domain.objects.Gp)domainFactory.getDomainObject( ims.core.resource.people.domain.objects.Gp.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainGpRecipients5.contains(dom))
			{
				domainGpRecipients5.add(dom);
			}
			newSet5.add(dom);			
		}
		java.util.Set removedSet5 = new java.util.HashSet();
		java.util.Iterator iter5 = domainGpRecipients5.iterator();
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
			domainGpRecipients5.remove(iter5.next());
		}		
		
		domainObject.setGpRecipients(domainGpRecipients5);		
		domainObject.setCopyLetterToPatient(valueObject.getCopyLetterToPatient());
		domainObject.setIsClinicalDetailsComplete(valueObject.getIsClinicalDetailsComplete());
		domainObject.setDischargeDocuments(ims.core.vo.domain.PatientDocumentVoAssembler.extractPatientDocumentSet(domainFactory, valueObject.getDischargeDocuments(), domainObject.getDischargeDocuments(), domMap));		

		return domainObject;
	}

}
