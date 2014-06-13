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

package ims.core.domain.impl;

import ims.configuration.gen.ConfigFlag;
import ims.core.admin.domain.objects.ProviderSystem;
import ims.core.clinical.domain.objects.PatientNoAlertInfo;
import ims.core.clinical.domain.objects.PatientNoAllergyInfo;
import ims.core.clinical.domain.objects.PatientNotification;
import ims.core.clinical.domain.objects.PatientOCSNewResults;
import ims.core.clinical.domain.objects.PatientOCSSeenResults;
import ims.core.domain.PatientSearch;
import ims.core.domain.base.impl.BasePatientMergeImpl;
import ims.core.patient.domain.objects.MergeRequest;
import ims.core.patient.domain.objects.MergedTables;
import ims.core.patient.domain.objects.Patient;
import ims.core.patient.domain.objects.PatientMergeHistory;
import ims.core.patient.vo.MergeRequestRefVo;
import ims.core.vo.MergeRequestVo;
import ims.core.vo.MergeRequestVoCollection;
import ims.core.vo.MergeTableDetailsVo;
import ims.core.vo.MergeTableDetailsVoCollection;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.domain.MergeRequestVoAssembler;
import ims.core.vo.domain.PatientAssembler;
import ims.core.vo.domain.PatientIdAssembler;
import ims.core.vo.lookups.MsgEventType;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.QueueType;
import ims.domain.DomainFactory;
import ims.domain.DomainObject;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.hibernate3.IMSCriteria;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IAppUser;
import ims.hl7adtout.domain.objects.DemographicsMessageQueue;
import ims.ocrr.vo.lookups.OrderMessageStatus;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PatientMergeImpl extends BasePatientMergeImpl
{

	private static final long serialVersionUID = 1L;
	private static final String DUMMY_PATIENT = "DummyICABSurname";  // wdev-10710
	/**
	* Returns a set of Patients (Minimal details)
	*/
	public ims.core.vo.PatientShortCollection searchPatients(ims.core.vo.PatientFilter filter) throws ims.domain.exceptions.DomainInterfaceException
	{
		PatientSearch impl = (PatientSearch) getDomainImpl(ims.core.domain.impl.PatientSearchImpl.class);
		return impl.listActivePatients(filter);
	}
	/**
	* Save a merge request
	*/
	public void saveMergeRequest(ims.core.vo.MergeRequestVo mergeRequest) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		if(mergeRequest == null)
			throw new RuntimeException("Cannot save null value for MergeRequest");
		if(!mergeRequest.isValidated())
			throw new DomainRuntimeException("MergeRequest not validated before save");
		if(!validateMergeRequest(mergeRequest))
			throw new DomainInterfaceException("A pending Merge Request involving a selected patient exists");
		getDomainFactory().save(MergeRequestVoAssembler.extractMergeRequest(getDomainFactory(), mergeRequest));
	}
	private boolean validateMergeRequest(MergeRequestVo mergeRequest) 
	{
		PatientSearch impl = (PatientSearch) getDomainImpl (ims.core.domain.impl.PatientSearchImpl.class);
		return impl.validateMergeRequest(mergeRequest);
	}
	
	public Integer[] listPatientsWaitingToBeMerged() 
	{
		
		DomainFactory factory = getDomainFactory();
		IMSCriteria imsc=new IMSCriteria(MergeRequest.class, factory);
		List merges=imsc.find();
		Vector<Integer> ids=new Vector<Integer>();
		for (int i=0;i<merges.size();i++)
		{
			MergeRequest merge=(MergeRequest)merges.get(i);
			ids.add(merge.getDestinationPatId());
			ids.add(merge.getSourcePatId());
		}
		if (ids.size()>0)
			return ids.toArray(new Integer[0]);
		return null;
	}
	
	
	public MergeRequestVoCollection listPatientsToBeMerged() 
	{
		DomainFactory factory = getDomainFactory();
		IMSCriteria imsc=new IMSCriteria(MergeRequest.class, factory);
		imsc.equal(MergeRequest.FieldNames.Status, new Boolean(false));
		List merges=imsc.find();
		return MergeRequestVoAssembler.createMergeRequestVoCollectionFromMergeRequest(merges);
	}
	
	public Integer countPatientsToBeMerged() 
	{
		DomainFactory factory = getDomainFactory();
		
		String[] paramNames = new String[1];
		paramNames[0] = "active";
		Object[] paramValues = new Object[1];
		paramValues[0] = new Boolean(false);
		return (factory.count(" from MergeRequest mq where mq.status = :active", paramNames, paramValues));
	
	}
	
	public void saveMessageQueueForProvider(MergeRequest request, PatientMergeHistory history, Patient destPatient, Patient sourcePatient) throws StaleObjectException
	{
		DomainFactory factory = getDomainFactory();
		String hql = " select prov from ProviderSystem prov join prov.configItems cfg where " +
		                 " cfg.propertyName = 'SendDeomgraphicFeed' and cfg.propertyValue='TRUE'";
		
		List lst = factory.find(hql);

		for (int i=0; i<lst.size(); i++)
		{
		
			ProviderSystem prov = (ProviderSystem) lst.get(i);

			DemographicsMessageQueue queue = new DemographicsMessageQueue();
			queue.setMergeHistory(history);
			queue.setMessageStatus(getDomLookup(OrderMessageStatus.CREATED));
			queue.setMsgType(getDomLookup(MsgEventType.A40));
			queue.setQueueType(getDomLookup(QueueType.DEMOGRAPHICFEED));
			queue.setPatient(destPatient);
			queue.setPriorPatient(sourcePatient);
			queue.setProviderSystem(prov);
			factory.save(queue);
		}
	}
	
	/**
	 * wdev-9360
	 * To ensure it is all part of one transaction, the merge has been moved to this impl method
	 * @param request
	 * @throws StaleObjectException 
	 * @throws t dStaleObjectException 
	 * @throws ClassNotFoundException 
	 */
	public void performPatientMerge(MergeRequestVo request, MergeTableDetailsVoCollection tablesList, Boolean mergeIdentifiers, Boolean processOcsCounts) throws StaleObjectException, DomainInterfaceException
	{
		DomainFactory factory = getDomainFactory();
			
		MergeRequest domRequest = MergeRequestVoAssembler.extractMergeRequest(factory, request);

		if (!request.getSourcePatIdIsNotNull() || !request.getDestinationPatIdIsNotNull())
		{
			domRequest.setComment("Both source and destination patient ids mandatory");
			domRequest.setStatus(true);
			factory.save(domRequest);
			throw new DomainInterfaceException("Both source and destination patient ids mandatory");
		}
		if (request.getSourcePatId().intValue() == request.getDestinationPatId().intValue())
		{
			domRequest.setComment("Both source and destination patients equal - merge ignored");
			domRequest.setStatus(true);
			factory.save(domRequest);
			throw new DomainInterfaceException("Both source and destination patients equal - merge ignored");
		}

		// Now we can begin transaction handling for each merge request
		StringBuffer hql;
		// For each table in tablesList, get the list of affected items.
		List mergedTablesList = new ArrayList();
		for (int i=0; i<tablesList.size(); i++)
		{
			MergeTableDetailsVo tableDet = tablesList.get(i);

			hql = new StringBuffer();
			hql.append(" select id from " + tableDet.getEntityName() + " patRef where patRef." + tableDet.getAttributeName() + " = " + domRequest.getSourcePatId());
			List lst = factory.find(hql.toString());
			if (lst != null && lst.size() > 0)
			{
				for (int j=0; j<lst.size(); j++)
				{
					Integer obj = (Integer) lst.get(j);
					MergedTables det = new MergedTables();
					det.setTableName(tableDet.getTableName());
					det.setObjectId(obj);
					det.setEntityName(tableDet.getEntityName());
					det.setAttributeName(tableDet.getAttributeName());
					mergedTablesList.add(det);
				}
			}
		}
				
		Patient destPat = (Patient)factory.getDomainObject(Patient.class, domRequest.getDestinationPatId());

		try
		{
			// Now go through the mergedTables list and update data as specified
			for (int j=0; j<mergedTablesList.size(); j++)
			{
				MergedTables det = (MergedTables) mergedTablesList.get(j);
				Object domObj = factory.getDomainObject(Class.forName(det.getEntityName()), det.getObjectId());
				
				// Construct get and set methods for the patient values
				String getMethodName = "get" + det.getAttributeName().substring(0,1).toUpperCase() + det.getAttributeName().substring(1);
				String setMethodName = "set" + det.getAttributeName().substring(0,1).toUpperCase() + det.getAttributeName().substring(1);
				
				Class[] parameterTypes = null;
				Object[] parameterValues = null;
				
				Method getPat = domObj.getClass().getMethod(getMethodName, parameterTypes);
				Object ret=getPat.invoke(domObj, parameterValues);
				int retId = ((DomainObject)ret).getId();
				if (retId == domRequest.getSourcePatId())  // It is currently set to source patient id, then set to destination patient id
				{
					parameterTypes = new Class[1];
					parameterTypes[0]=Patient.class;
					parameterValues = new Object[1];
					parameterValues[0] = destPat;
					Method setPat = domObj.getClass().getMethod(setMethodName, parameterTypes);
					setPat.invoke(domObj, parameterValues);
				}
			}
			
			// We need to mark the removed Patient as merged, so we
			// 	set the associatedPatient field of the Patient Bo
			Patient srcPat = (Patient)factory.getDomainObject(Patient.class, domRequest.getSourcePatId());
			srcPat.setAssociatedPatient(destPat);
			srcPat.setIsActive(false);
		
			//WDEV-4333
			PatientIdCollection sourceIds=null;
			if (mergeIdentifiers && Boolean.TRUE.equals(request.getMergeIdentifiers()))  // maxgen-656, WDEV-17888
			{
				sourceIds = mergePatientIdentifiers(factory, srcPat, destPat);
			}

			factory.save(destPat);
			PatientMergeHistory history = new PatientMergeHistory();
			history.setComment("Patient Merge Processed Successfully");
			history.setDatabaseName(ConfigFlag.DBNAME.getValue());
			IAppUser usr = getSession().getUser();
			if (usr != null)
				history.setHostname(usr.getHostName());
			history.setCreationDateTime(new java.util.Date());
			history.setDestinationPatId(domRequest.getDestinationPatId());
			history.setSourcePatId(domRequest.getSourcePatId());
			history.setRequestedBy(domRequest.getRequestedBy());
			history.setItems(mergedTablesList);
			history.setMergeIdentifiers(request.getMergeIdentifiers());//WDEV-17888
			
			// Only the non-merge identifiers are moved to history
			// WDEV-15050 
			if (mergeIdentifiers && Boolean.TRUE.equals(request.getMergeIdentifiers())) //WDEV-17888
			{
				history.setPatientIds(new ArrayList());
				for (int k=0; k<sourceIds.size(); k++)
				{
					ims.core.patient.domain.objects.PatientId id = PatientIdAssembler.extractPatientId(factory,sourceIds.get(k));
					if (id.isMerged() == null || id.isMerged().booleanValue() == false)
						history.getPatientIds().add(id);
				}
			}

			// WDEV-17085 
			// Process OCS Counts, need to manually update counts and then set source patient records as RIE
			if (processOcsCounts)
			{
				PatientOCSNewResults destNewRes = PatientOCSNewResults.getRecordByPatient(factory, destPat);
				PatientOCSNewResults srcNewRes = PatientOCSNewResults.getRecordByPatient(factory, srcPat);
				if (srcNewRes != null && (srcNewRes.getIsRIE() == null  || srcNewRes.getIsRIE() == false))
				{
					// No destination patient record, simply update the source patient value
					if (destNewRes == null || (destNewRes != null && destNewRes.getIsRIE() != null && destNewRes.getIsRIE() == true))
					{
						srcNewRes.setPatient(destPat);
//						destNewRes.setPatient(srcPat);
						factory.save(srcNewRes);
					}
					
					// Destination and source record found, add values together, save to destination and RIE the source
					if (destNewRes  != null && (destNewRes.getIsRIE() == null  || destNewRes.getIsRIE() == false))
					{
						destNewRes.setNewCount(destNewRes.getNewCount() + srcNewRes.getNewCount());
						factory.save(destNewRes);;
						srcNewRes.setIsRIE(true);
						factory.save(srcNewRes);
					}
				}
				
				PatientOCSSeenResults destSeenRes = PatientOCSSeenResults.getRecordByPatient(factory, destPat);
				PatientOCSSeenResults srcSeenRes = PatientOCSSeenResults.getRecordByPatient(factory, srcPat);
				if (srcSeenRes != null && (srcSeenRes.getIsRIE() == null  || srcSeenRes.getIsRIE() == false))
				{
					// No destination patient record, simply update the source patient value
					if (destSeenRes == null || (destSeenRes != null && destSeenRes.getIsRIE() != null && destSeenRes.getIsRIE() == true))
					{
						srcSeenRes.setPatient(destPat);
						factory.save(srcSeenRes);
					}
					
					// Destination and source record found, add values together, save to destination and RIE the source
					if (destSeenRes  != null && (destSeenRes.getIsRIE() == null  || destSeenRes.getIsRIE() == false))
					{
						destSeenRes.setSeenCount(destSeenRes.getSeenCount() + srcSeenRes.getSeenCount());
						factory.save(destSeenRes);;
						srcSeenRes.setIsRIE(true);
						factory.save(srcSeenRes);
					}
				}
				
				PatientNotification destNot = PatientNotification.getRecordByPatient(factory, destPat);
				PatientNotification srcNot = PatientNotification.getRecordByPatient(factory, srcPat);
				if (srcNot != null && (srcNot.getIsRIE() == null  || srcNot.getIsRIE() == false))
				{
					// No destination patient record, simply update the source patient value
					if (destNot == null || (destNot != null && destNot.getIsRIE() != null && destNot.getIsRIE() == true))
					{
						srcNot.setPatient(destPat);
						factory.save(srcNot);
					}
					
					// Destination and source record found, add values together, save to destination and RIE the source
					if (destNot  != null && (destNot.getIsRIE() == null  || destNot.getIsRIE() == false))
					{
						srcNot.setIsRIE(true);
						factory.save(srcNot);
					}
				}
			}
			
			// WDEV-17197
			// PatientNoAlertInfo and PatientNoAllergyInfo need to be handled separately as they are unique per patient 
			// and so can cause unique constraints
			PatientNoAllergyInfo srcNoAllergy = PatientNoAllergyInfo.getPatientNoAllergyInfoFromPatient(factory, srcPat.getId());
			PatientNoAllergyInfo dstNoAllergy = PatientNoAllergyInfo.getPatientNoAllergyInfoFromPatient(factory, destPat.getId());
			if (srcNoAllergy != null && (srcNoAllergy.getIsRIE() == null || srcNoAllergy.getIsRIE() == false))
			{
				// No destination patient record, simply update the source patient value
				if (dstNoAllergy == null || (dstNoAllergy != null && dstNoAllergy.getIsRIE() != null && dstNoAllergy.getIsRIE() == true))
				{
					srcNoAllergy.setPatient(destPat);
					factory.save(srcNoAllergy);
				}
				
				// Destination and source record found, we need to RIE the source
				if (dstNoAllergy != null && (dstNoAllergy.getIsRIE() == null || dstNoAllergy.getIsRIE() == false))
				{
					srcNoAllergy.setIsRIE(true);
					factory.save(srcNoAllergy);
				}
			}
			
			PatientNoAlertInfo srcNoAlert = PatientNoAlertInfo.getPatientNoAlertInfoFromPatient(factory, srcPat.getId());
			PatientNoAlertInfo dstNoAlert = PatientNoAlertInfo.getPatientNoAlertInfoFromPatient(factory, destPat.getId());
			if (srcNoAlert != null && (srcNoAlert.getIsRIE() == null || srcNoAlert.getIsRIE() == false))
			{
				// No destination patient record, simply update the source patient value
				if (dstNoAlert == null || (dstNoAlert != null && dstNoAlert.getIsRIE() != null && dstNoAlert.getIsRIE() == true))
				{
					srcNoAlert.setPatient(destPat);
					factory.save(srcNoAlert);
				}
				
				// Destination and source record found, we need to RIE the source
				if (dstNoAlert != null && (dstNoAlert.getIsRIE() == null || dstNoAlert.getIsRIE() == false))
				{
					srcNoAlert.setIsRIE(true);
					factory.save(srcNoAlert);
				}
			}
			
			factory.save(history);
	
			saveMessageQueueForProvider(domRequest, history, destPat, srcPat);
			
			factory.delete(domRequest);
		}
		catch (Exception e)
		{
			throw new DomainInterfaceException(e.getMessage(), e);
		} 
	}
	
	private PatientIdCollection mergePatientIdentifiers(DomainFactory factory, Patient srcPat, Patient destPat) throws SQLException, DomainInterfaceException, StaleObjectException, UniqueKeyViolationException
	{
		ims.core.vo.Patient sourcePatient = PatientAssembler.create(srcPat);
		PatientIdCollection sourceIds = (PatientIdCollection) sourcePatient.getIdentifiers().clone();

		srcPat.getIdentifiers().clear();  // Source identifiers moved to destination
		factory.save(srcPat);  // Need to save source pat with no ids before assigning to destination as otherwise, hibernate complains

		//add (source) identifiers to new (destination) patient
		for(int i=0;i<sourceIds.size();i++)
		{
			PatientId id = (PatientId) sourceIds.get(i).clone();

			// wdev-6169 Do not move the nhsn over if it's the same as the nhsn for the destination patient
			if (id.getType().getId() == PatIdType.NHSN.getID())
			{
				if (getNHSN(destPat.getIdentifiers()).equals(id.getValue()))
					continue;

				// wdev-6148 If moving an NHSN value over and it is verified, set it to unverified
				id.setVerified(false);
			}
			
			// wdev-10710 Only merge the PATNUM identifier if the source is NOT an ICABDummy Patient
			if (id.getType().getId() == PatIdType.PATNUM.getID())
			{
				if (sourcePatient.getNameIsNotNull() && sourcePatient.getName().getSurnameIsNotNull() &&
						sourcePatient.getName().getSurname().equals(DUMMY_PATIENT))
					continue;  // Do no insert them
			}

			
			id.setMerged(true);
			destPat.getIdentifiers().add(PatientIdAssembler.extractPatientId(factory,id));
		}

		
		return sourceIds;
	}
	
	private String getNHSN(List identifiers) 
	{
		if (identifiers == null)
			return "";
		for (int i=0; i<identifiers.size(); i++)
		{
			ims.core.patient.domain.objects.PatientId patId = (ims.core.patient.domain.objects.PatientId) identifiers.get(i);
			if (patId.getType().getId() == PatIdType.NHSN.getID())
				return patId.getValue();
		}
		return "";
	}
	
	/**
	 * This will be called from the servlet when an exception as been caught
	 * and the transaction rolled back, this will save the request to an inactive
	 * state, updating the comment with the exception String
	 * @throws StaleObjectException 
	 */
	public void logMergeError(MergeRequestRefVo request, String exceptionStr) throws StaleObjectException 
	{
		DomainFactory factory = getDomainFactory();
		MergeRequest domRequest = (MergeRequest) factory.getDomainObject(MergeRequest.class, request.getID_MergeRequest());
		domRequest.setComment(exceptionStr);
		domRequest.setStatus(true);  // Reverse logic for some reason!
		factory.save(domRequest);
		super.createSystemLogEntry(SystemLogType.PATIENT_MERGE, SystemLogLevel.ERROR, "PatientMergeError - " + exceptionStr);

	}
}
	
	
