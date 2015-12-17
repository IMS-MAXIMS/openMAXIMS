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
package ims.admin.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static AppointmentOutcomeReasonCollection getAppointmentOutcomeReason(LookupService lookupService) {
		AppointmentOutcomeReasonCollection collection =
			(AppointmentOutcomeReasonCollection) lookupService.getLookupCollection(AppointmentOutcomeReason.TYPE_ID, 
				AppointmentOutcomeReasonCollection.class, AppointmentOutcomeReason.class);
		return collection;
	}

	public static AppointmentOutcomeReason getAppointmentOutcomeReasonInstance(LookupService lookupService, int id) 
	{
		return (AppointmentOutcomeReason)lookupService.getLookupInstance(AppointmentOutcomeReason.class, AppointmentOutcomeReason.TYPE_ID, id);
	}
	

	public static ReasonChartNotRequestedCollection getReasonChartNotRequested(LookupService lookupService) {
		ReasonChartNotRequestedCollection collection =
			(ReasonChartNotRequestedCollection) lookupService.getLookupCollection(ReasonChartNotRequested.TYPE_ID, 
				ReasonChartNotRequestedCollection.class, ReasonChartNotRequested.class);
		return collection;
	}

	public static ReasonChartNotRequested getReasonChartNotRequestedInstance(LookupService lookupService, int id) 
	{
		return (ReasonChartNotRequested)lookupService.getLookupInstance(ReasonChartNotRequested.class, ReasonChartNotRequested.TYPE_ID, id);
	}
	

	public static NotificationPriorityCollection getNotificationPriority(LookupService lookupService) {
		NotificationPriorityCollection collection =
			(NotificationPriorityCollection) lookupService.getLookupCollection(NotificationPriority.TYPE_ID, 
				NotificationPriorityCollection.class, NotificationPriority.class);
		return collection;
	}

	public static NotificationPriority getNotificationPriorityInstance(LookupService lookupService, int id) 
	{
		return (NotificationPriority)lookupService.getLookupInstance(NotificationPriority.class, NotificationPriority.TYPE_ID, id);
	}
	

	public static FileFormatTypeCollection getFileFormatType(LookupService lookupService) {
		FileFormatTypeCollection collection =
			(FileFormatTypeCollection) lookupService.getLookupCollection(FileFormatType.TYPE_ID, 
				FileFormatTypeCollection.class, FileFormatType.class);
		return collection;
	}

	public static FileFormatType getFileFormatTypeInstance(LookupService lookupService, int id) 
	{
		return (FileFormatType)lookupService.getLookupInstance(FileFormatType.class, FileFormatType.TYPE_ID, id);
	}
	

	public static PatientKioskMessagesCollection getPatientKioskMessages(LookupService lookupService) {
		PatientKioskMessagesCollection collection =
			(PatientKioskMessagesCollection) lookupService.getLookupCollection(PatientKioskMessages.TYPE_ID, 
				PatientKioskMessagesCollection.class, PatientKioskMessages.class);
		return collection;
	}

	public static PatientKioskMessages getPatientKioskMessagesInstance(LookupService lookupService, int id) 
	{
		return (PatientKioskMessages)lookupService.getLookupInstance(PatientKioskMessages.class, PatientKioskMessages.TYPE_ID, id);
	}
	

	public static ContextVariableValTypeCollection getContextVariableValType(LookupService lookupService) {
		ContextVariableValTypeCollection collection =
			(ContextVariableValTypeCollection) lookupService.getLookupCollection(ContextVariableValType.TYPE_ID, 
				ContextVariableValTypeCollection.class, ContextVariableValType.class);
		return collection;
	}

	public static ContextVariableValType getContextVariableValTypeInstance(LookupService lookupService, int id) 
	{
		return (ContextVariableValType)lookupService.getLookupInstance(ContextVariableValType.class, ContextVariableValType.TYPE_ID, id);
	}
	

	public static ContextVariableTypeCollection getContextVariableType(LookupService lookupService) {
		ContextVariableTypeCollection collection =
			(ContextVariableTypeCollection) lookupService.getLookupCollection(ContextVariableType.TYPE_ID, 
				ContextVariableTypeCollection.class, ContextVariableType.class);
		return collection;
	}

	public static ContextVariableType getContextVariableTypeInstance(LookupService lookupService, int id) 
	{
		return (ContextVariableType)lookupService.getLookupInstance(ContextVariableType.class, ContextVariableType.TYPE_ID, id);
	}
	

	public static CacheUsageCollection getCacheUsage(LookupService lookupService) {
		CacheUsageCollection collection =
			(CacheUsageCollection) lookupService.getLookupCollection(CacheUsage.TYPE_ID, 
				CacheUsageCollection.class, CacheUsage.class);
		return collection;
	}

	public static CacheUsage getCacheUsageInstance(LookupService lookupService, int id) 
	{
		return (CacheUsage)lookupService.getLookupInstance(CacheUsage.class, CacheUsage.TYPE_ID, id);
	}
	

	public static FormAccessContextCollection getFormAccessContext(LookupService lookupService) {
		FormAccessContextCollection collection =
			(FormAccessContextCollection) lookupService.getLookupCollection(FormAccessContext.TYPE_ID, 
				FormAccessContextCollection.class, FormAccessContext.class);
		return collection;
	}

	public static FormAccessContext getFormAccessContextInstance(LookupService lookupService, int id) 
	{
		return (FormAccessContext)lookupService.getLookupInstance(FormAccessContext.class, FormAccessContext.TYPE_ID, id);
	}
	

	public static LookupTypesShownCollection getLookupTypesShown(LookupService lookupService) {
		LookupTypesShownCollection collection =
			(LookupTypesShownCollection) lookupService.getLookupCollection(LookupTypesShown.TYPE_ID, 
				LookupTypesShownCollection.class, LookupTypesShown.class);
		return collection;
	}

	public static LookupTypesShown getLookupTypesShownInstance(LookupService lookupService, int id) 
	{
		return (LookupTypesShown)lookupService.getLookupInstance(LookupTypesShown.class, LookupTypesShown.TYPE_ID, id);
	}
	

	public static DateStartExpressionCollection getDateStartExpression(LookupService lookupService) {
		DateStartExpressionCollection collection =
			(DateStartExpressionCollection) lookupService.getLookupCollection(DateStartExpression.TYPE_ID, 
				DateStartExpressionCollection.class, DateStartExpression.class);
		return collection;
	}

	public static DateStartExpression getDateStartExpressionInstance(LookupService lookupService, int id) 
	{
		return (DateStartExpression)lookupService.getLookupInstance(DateStartExpression.class, DateStartExpression.TYPE_ID, id);
	}
	

	public static DateOperatorCollection getDateOperator(LookupService lookupService) {
		DateOperatorCollection collection =
			(DateOperatorCollection) lookupService.getLookupCollection(DateOperator.TYPE_ID, 
				DateOperatorCollection.class, DateOperator.class);
		return collection;
	}

	public static DateOperator getDateOperatorInstance(LookupService lookupService, int id) 
	{
		return (DateOperator)lookupService.getLookupInstance(DateOperator.class, DateOperator.TYPE_ID, id);
	}
	

	public static DateExpressionRangeUnitCollection getDateExpressionRangeUnit(LookupService lookupService) {
		DateExpressionRangeUnitCollection collection =
			(DateExpressionRangeUnitCollection) lookupService.getLookupCollection(DateExpressionRangeUnit.TYPE_ID, 
				DateExpressionRangeUnitCollection.class, DateExpressionRangeUnit.class);
		return collection;
	}

	public static DateExpressionRangeUnit getDateExpressionRangeUnitInstance(LookupService lookupService, int id) 
	{
		return (DateExpressionRangeUnit)lookupService.getLookupInstance(DateExpressionRangeUnit.class, DateExpressionRangeUnit.TYPE_ID, id);
	}
	

	public static GenderSpecificCollection getGenderSpecific(LookupService lookupService) {
		GenderSpecificCollection collection =
			(GenderSpecificCollection) lookupService.getLookupCollection(GenderSpecific.TYPE_ID, 
				GenderSpecificCollection.class, GenderSpecific.class);
		return collection;
	}

	public static GenderSpecific getGenderSpecificInstance(LookupService lookupService, int id) 
	{
		return (GenderSpecific)lookupService.getLookupInstance(GenderSpecific.class, GenderSpecific.TYPE_ID, id);
	}
	

	public static TopButtonActionCollection getTopButtonAction(LookupService lookupService) {
		TopButtonActionCollection collection =
			(TopButtonActionCollection) lookupService.getLookupCollection(TopButtonAction.TYPE_ID, 
				TopButtonActionCollection.class, TopButtonAction.class);
		return collection;
	}

	public static TopButtonAction getTopButtonActionInstance(LookupService lookupService, int id) 
	{
		return (TopButtonAction)lookupService.getLookupInstance(TopButtonAction.class, TopButtonAction.TYPE_ID, id);
	}
	

	public static ClearSpanEventLevelCollection getClearSpanEventLevel(LookupService lookupService) {
		ClearSpanEventLevelCollection collection =
			(ClearSpanEventLevelCollection) lookupService.getLookupCollection(ClearSpanEventLevel.TYPE_ID, 
				ClearSpanEventLevelCollection.class, ClearSpanEventLevel.class);
		return collection;
	}

	public static ClearSpanEventLevel getClearSpanEventLevelInstance(LookupService lookupService, int id) 
	{
		return (ClearSpanEventLevel)lookupService.getLookupInstance(ClearSpanEventLevel.class, ClearSpanEventLevel.TYPE_ID, id);
	}
	

	public static NavigationStyleCollection getNavigationStyle(LookupService lookupService) {
		NavigationStyleCollection collection =
			(NavigationStyleCollection) lookupService.getLookupCollection(NavigationStyle.TYPE_ID, 
				NavigationStyleCollection.class, NavigationStyle.class);
		return collection;
	}

	public static NavigationStyle getNavigationStyleInstance(LookupService lookupService, int id) 
	{
		return (NavigationStyle)lookupService.getLookupInstance(NavigationStyle.class, NavigationStyle.TYPE_ID, id);
	}
	

	public static BusinessRuleCategoryCollection getBusinessRuleCategory(LookupService lookupService) {
		BusinessRuleCategoryCollection collection =
			(BusinessRuleCategoryCollection) lookupService.getLookupCollection(BusinessRuleCategory.TYPE_ID, 
				BusinessRuleCategoryCollection.class, BusinessRuleCategory.class);
		return collection;
	}

	public static BusinessRuleCategory getBusinessRuleCategoryInstance(LookupService lookupService, int id) 
	{
		return (BusinessRuleCategory)lookupService.getLookupInstance(BusinessRuleCategory.class, BusinessRuleCategory.TYPE_ID, id);
	}
	

	public static FormReadWriteCollection getFormReadWrite(LookupService lookupService) {
		FormReadWriteCollection collection =
			(FormReadWriteCollection) lookupService.getLookupCollection(FormReadWrite.TYPE_ID, 
				FormReadWriteCollection.class, FormReadWrite.class);
		return collection;
	}

	public static FormReadWrite getFormReadWriteInstance(LookupService lookupService, int id) 
	{
		return (FormReadWrite)lookupService.getLookupInstance(FormReadWrite.class, FormReadWrite.TYPE_ID, id);
	}
	

	public static HTTPServletDebugCollection getHTTPServletDebug(LookupService lookupService) {
		HTTPServletDebugCollection collection =
			(HTTPServletDebugCollection) lookupService.getLookupCollection(HTTPServletDebug.TYPE_ID, 
				HTTPServletDebugCollection.class, HTTPServletDebug.class);
		return collection;
	}

	public static HTTPServletDebug getHTTPServletDebugInstance(LookupService lookupService, int id) 
	{
		return (HTTPServletDebug)lookupService.getLookupInstance(HTTPServletDebug.class, HTTPServletDebug.TYPE_ID, id);
	}
	

	public static EDAttendenceControlTypeCollection getEDAttendenceControlType(LookupService lookupService) {
		EDAttendenceControlTypeCollection collection =
			(EDAttendenceControlTypeCollection) lookupService.getLookupCollection(EDAttendenceControlType.TYPE_ID, 
				EDAttendenceControlTypeCollection.class, EDAttendenceControlType.class);
		return collection;
	}

	public static EDAttendenceControlType getEDAttendenceControlTypeInstance(LookupService lookupService, int id) 
	{
		return (EDAttendenceControlType)lookupService.getLookupInstance(EDAttendenceControlType.class, EDAttendenceControlType.TYPE_ID, id);
	}
	

	public static ClearSpanEventsCollection getClearSpanEvents(LookupService lookupService) {
		ClearSpanEventsCollection collection =
			(ClearSpanEventsCollection) lookupService.getLookupCollection(ClearSpanEvents.TYPE_ID, 
				ClearSpanEventsCollection.class, ClearSpanEvents.class);
		return collection;
	}

	public static ClearSpanEvents getClearSpanEventsInstance(LookupService lookupService, int id) 
	{
		return (ClearSpanEvents)lookupService.getLookupInstance(ClearSpanEvents.class, ClearSpanEvents.TYPE_ID, id);
	}
	

	public static NotificationDeliveryCollection getNotificationDelivery(LookupService lookupService) {
		NotificationDeliveryCollection collection =
			(NotificationDeliveryCollection) lookupService.getLookupCollection(NotificationDelivery.TYPE_ID, 
				NotificationDeliveryCollection.class, NotificationDelivery.class);
		return collection;
	}

	public static NotificationDelivery getNotificationDeliveryInstance(LookupService lookupService, int id) 
	{
		return (NotificationDelivery)lookupService.getLookupInstance(NotificationDelivery.class, NotificationDelivery.TYPE_ID, id);
	}
	

	public static ImageTypeCollection getImageType(LookupService lookupService) {
		ImageTypeCollection collection =
			(ImageTypeCollection) lookupService.getLookupCollection(ImageType.TYPE_ID, 
				ImageTypeCollection.class, ImageType.class);
		return collection;
	}

	public static ImageType getImageTypeInstance(LookupService lookupService, int id) 
	{
		return (ImageType)lookupService.getLookupInstance(ImageType.class, ImageType.TYPE_ID, id);
	}
	

	public static RuleConditionTypeCollection getRuleConditionType(LookupService lookupService) {
		RuleConditionTypeCollection collection =
			(RuleConditionTypeCollection) lookupService.getLookupCollection(RuleConditionType.TYPE_ID, 
				RuleConditionTypeCollection.class, RuleConditionType.class);
		return collection;
	}

	public static RuleConditionType getRuleConditionTypeInstance(LookupService lookupService, int id) 
	{
		return (RuleConditionType)lookupService.getLookupInstance(RuleConditionType.class, RuleConditionType.TYPE_ID, id);
	}
	
}



