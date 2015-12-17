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
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:38
 */
package ims.ntpf.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static BatchStatusCollection getBatchStatus(LookupService lookupService) {
		BatchStatusCollection collection =
			(BatchStatusCollection) lookupService.getLookupCollection(BatchStatus.TYPE_ID, 
				BatchStatusCollection.class, BatchStatus.class);
		return collection;
	}

	public static BatchStatus getBatchStatusInstance(LookupService lookupService, int id) 
	{
		return (BatchStatus)lookupService.getLookupInstance(BatchStatus.class, BatchStatus.TYPE_ID, id);
	}
	

	public static AccountingTypeCollection getAccountingType(LookupService lookupService) {
		AccountingTypeCollection collection =
			(AccountingTypeCollection) lookupService.getLookupCollection(AccountingType.TYPE_ID, 
				AccountingTypeCollection.class, AccountingType.class);
		return collection;
	}

	public static AccountingType getAccountingTypeInstance(LookupService lookupService, int id) 
	{
		return (AccountingType)lookupService.getLookupInstance(AccountingType.class, AccountingType.TYPE_ID, id);
	}
	

	public static CallTypeCollection getCallType(LookupService lookupService) {
		CallTypeCollection collection =
			(CallTypeCollection) lookupService.getLookupCollection(CallType.TYPE_ID, 
				CallTypeCollection.class, CallType.class);
		return collection;
	}

	public static CallType getCallTypeInstance(LookupService lookupService, int id) 
	{
		return (CallType)lookupService.getLookupInstance(CallType.class, CallType.TYPE_ID, id);
	}
	

	public static InsuranceTypeCollection getInsuranceType(LookupService lookupService) {
		InsuranceTypeCollection collection =
			(InsuranceTypeCollection) lookupService.getLookupCollection(InsuranceType.TYPE_ID, 
				InsuranceTypeCollection.class, InsuranceType.class);
		return collection;
	}

	public static InsuranceType getInsuranceTypeInstance(LookupService lookupService, int id) 
	{
		return (InsuranceType)lookupService.getLookupInstance(InsuranceType.class, InsuranceType.TYPE_ID, id);
	}
	

	public static JobTypeCollection getJobType(LookupService lookupService) {
		JobTypeCollection collection =
			(JobTypeCollection) lookupService.getLookupCollection(JobType.TYPE_ID, 
				JobTypeCollection.class, JobType.class);
		return collection;
	}

	public static JobType getJobTypeInstance(LookupService lookupService, int id) 
	{
		return (JobType)lookupService.getLookupInstance(JobType.class, JobType.TYPE_ID, id);
	}
	

	public static WorkQueueStatusCollection getWorkQueueStatus(LookupService lookupService) {
		WorkQueueStatusCollection collection =
			(WorkQueueStatusCollection) lookupService.getLookupCollection(WorkQueueStatus.TYPE_ID, 
				WorkQueueStatusCollection.class, WorkQueueStatus.class);
		return collection;
	}

	public static WorkQueueStatus getWorkQueueStatusInstance(LookupService lookupService, int id) 
	{
		return (WorkQueueStatus)lookupService.getLookupInstance(WorkQueueStatus.class, WorkQueueStatus.TYPE_ID, id);
	}
	

	public static WaitingListLengthQualifierCollection getWaitingListLengthQualifier(LookupService lookupService) {
		WaitingListLengthQualifierCollection collection =
			(WaitingListLengthQualifierCollection) lookupService.getLookupCollection(WaitingListLengthQualifier.TYPE_ID, 
				WaitingListLengthQualifierCollection.class, WaitingListLengthQualifier.class);
		return collection;
	}

	public static WaitingListLengthQualifier getWaitingListLengthQualifierInstance(LookupService lookupService, int id) 
	{
		return (WaitingListLengthQualifier)lookupService.getLookupInstance(WaitingListLengthQualifier.class, WaitingListLengthQualifier.TYPE_ID, id);
	}
	

	public static CommentContextTypeCollection getCommentContextType(LookupService lookupService) {
		CommentContextTypeCollection collection =
			(CommentContextTypeCollection) lookupService.getLookupCollection(CommentContextType.TYPE_ID, 
				CommentContextTypeCollection.class, CommentContextType.class);
		return collection;
	}

	public static CommentContextType getCommentContextTypeInstance(LookupService lookupService, int id) 
	{
		return (CommentContextType)lookupService.getLookupInstance(CommentContextType.class, CommentContextType.TYPE_ID, id);
	}
	

	public static PatientCheckListCollection getPatientCheckList(LookupService lookupService) {
		PatientCheckListCollection collection =
			(PatientCheckListCollection) lookupService.getLookupCollection(PatientCheckList.TYPE_ID, 
				PatientCheckListCollection.class, PatientCheckList.class);
		return collection;
	}

	public static PatientCheckList getPatientCheckListInstance(LookupService lookupService, int id) 
	{
		return (PatientCheckList)lookupService.getLookupInstance(PatientCheckList.class, PatientCheckList.TYPE_ID, id);
	}
	

	public static CountyCollection getCounty(LookupService lookupService) {
		CountyCollection collection =
			(CountyCollection) lookupService.getLookupCollection(County.TYPE_ID, 
				CountyCollection.class, County.class);
		return collection;
	}

	public static County getCountyInstance(LookupService lookupService, int id) 
	{
		return (County)lookupService.getLookupInstance(County.class, County.TYPE_ID, id);
	}
	

	public static CaseTypeCollection getCaseType(LookupService lookupService) {
		CaseTypeCollection collection =
			(CaseTypeCollection) lookupService.getLookupCollection(CaseType.TYPE_ID, 
				CaseTypeCollection.class, CaseType.class);
		return collection;
	}

	public static CaseType getCaseTypeInstance(LookupService lookupService, int id) 
	{
		return (CaseType)lookupService.getLookupInstance(CaseType.class, CaseType.TYPE_ID, id);
	}
	

	public static LoCallStatusCollection getLoCallStatus(LookupService lookupService) {
		LoCallStatusCollection collection =
			(LoCallStatusCollection) lookupService.getLookupCollection(LoCallStatus.TYPE_ID, 
				LoCallStatusCollection.class, LoCallStatus.class);
		return collection;
	}

	public static LoCallStatus getLoCallStatusInstance(LookupService lookupService, int id) 
	{
		return (LoCallStatus)lookupService.getLookupInstance(LoCallStatus.class, LoCallStatus.TYPE_ID, id);
	}
	

	public static PatientTypeCollection getPatientType(LookupService lookupService) {
		PatientTypeCollection collection =
			(PatientTypeCollection) lookupService.getLookupCollection(PatientType.TYPE_ID, 
				PatientTypeCollection.class, PatientType.class);
		return collection;
	}

	public static PatientType getPatientTypeInstance(LookupService lookupService, int id) 
	{
		return (PatientType)lookupService.getLookupInstance(PatientType.class, PatientType.TYPE_ID, id);
	}
	

	public static WhereHeardCollection getWhereHeard(LookupService lookupService) {
		WhereHeardCollection collection =
			(WhereHeardCollection) lookupService.getLookupCollection(WhereHeard.TYPE_ID, 
				WhereHeardCollection.class, WhereHeard.class);
		return collection;
	}

	public static WhereHeard getWhereHeardInstance(LookupService lookupService, int id) 
	{
		return (WhereHeard)lookupService.getLookupInstance(WhereHeard.class, WhereHeard.TYPE_ID, id);
	}
	

	public static CallerRelationshipCollection getCallerRelationship(LookupService lookupService) {
		CallerRelationshipCollection collection =
			(CallerRelationshipCollection) lookupService.getLookupCollection(CallerRelationship.TYPE_ID, 
				CallerRelationshipCollection.class, CallerRelationship.class);
		return collection;
	}

	public static CallerRelationship getCallerRelationshipInstance(LookupService lookupService, int id) 
	{
		return (CallerRelationship)lookupService.getLookupInstance(CallerRelationship.class, CallerRelationship.TYPE_ID, id);
	}
	
}



