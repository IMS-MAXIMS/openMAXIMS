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
package ims.ocrr.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static ResultDetailsTypeCollection getResultDetailsType(LookupService lookupService) {
		ResultDetailsTypeCollection collection =
			(ResultDetailsTypeCollection) lookupService.getLookupCollection(ResultDetailsType.TYPE_ID, 
				ResultDetailsTypeCollection.class, ResultDetailsType.class);
		return collection;
	}

	public static ResultDetailsType getResultDetailsTypeInstance(LookupService lookupService, int id) 
	{
		return (ResultDetailsType)lookupService.getLookupInstance(ResultDetailsType.class, ResultDetailsType.TYPE_ID, id);
	}
	

	public static SpecimenContainerTypeCollection getSpecimenContainerType(LookupService lookupService) {
		SpecimenContainerTypeCollection collection =
			(SpecimenContainerTypeCollection) lookupService.getLookupCollection(SpecimenContainerType.TYPE_ID, 
				SpecimenContainerTypeCollection.class, SpecimenContainerType.class);
		return collection;
	}

	public static SpecimenContainerType getSpecimenContainerTypeInstance(LookupService lookupService, int id) 
	{
		return (SpecimenContainerType)lookupService.getLookupInstance(SpecimenContainerType.class, SpecimenContainerType.TYPE_ID, id);
	}
	

	public static InvEventTypeCollection getInvEventType(LookupService lookupService) {
		InvEventTypeCollection collection =
			(InvEventTypeCollection) lookupService.getLookupCollection(InvEventType.TYPE_ID, 
				InvEventTypeCollection.class, InvEventType.class);
		return collection;
	}

	public static InvEventType getInvEventTypeInstance(LookupService lookupService, int id) 
	{
		return (InvEventType)lookupService.getLookupInstance(InvEventType.class, InvEventType.TYPE_ID, id);
	}
	

	public static InvTypeCollection getInvType(LookupService lookupService) {
		InvTypeCollection collection =
			(InvTypeCollection) lookupService.getLookupCollection(InvType.TYPE_ID, 
				InvTypeCollection.class, InvType.class);
		return collection;
	}

	public static InvType getInvTypeInstance(LookupService lookupService, int id) 
	{
		return (InvType)lookupService.getLookupInstance(InvType.class, InvType.TYPE_ID, id);
	}
	

	public static PatientClericalTaskStatusCollection getPatientClericalTaskStatus(LookupService lookupService) {
		PatientClericalTaskStatusCollection collection =
			(PatientClericalTaskStatusCollection) lookupService.getLookupCollection(PatientClericalTaskStatus.TYPE_ID, 
				PatientClericalTaskStatusCollection.class, PatientClericalTaskStatus.class);
		return collection;
	}

	public static PatientClericalTaskStatus getPatientClericalTaskStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientClericalTaskStatus)lookupService.getLookupInstance(PatientClericalTaskStatus.class, PatientClericalTaskStatus.TYPE_ID, id);
	}
	

	public static SpecimenCollectionTimeCollection getSpecimenCollectionTime(LookupService lookupService) {
		SpecimenCollectionTimeCollection collection =
			(SpecimenCollectionTimeCollection) lookupService.getLookupCollection(SpecimenCollectionTime.TYPE_ID, 
				SpecimenCollectionTimeCollection.class, SpecimenCollectionTime.class);
		return collection;
	}

	public static SpecimenCollectionTime getSpecimenCollectionTimeInstance(LookupService lookupService, int id) 
	{
		return (SpecimenCollectionTime)lookupService.getLookupInstance(SpecimenCollectionTime.class, SpecimenCollectionTime.TYPE_ID, id);
	}
	

	public static ResultStatusCollection getResultStatus(LookupService lookupService) {
		ResultStatusCollection collection =
			(ResultStatusCollection) lookupService.getLookupCollection(ResultStatus.TYPE_ID, 
				ResultStatusCollection.class, ResultStatus.class);
		return collection;
	}

	public static ResultStatus getResultStatusInstance(LookupService lookupService, int id) 
	{
		return (ResultStatus)lookupService.getLookupInstance(ResultStatus.class, ResultStatus.TYPE_ID, id);
	}
	

	public static NormalcyStatusCollection getNormalcyStatus(LookupService lookupService) {
		NormalcyStatusCollection collection =
			(NormalcyStatusCollection) lookupService.getLookupCollection(NormalcyStatus.TYPE_ID, 
				NormalcyStatusCollection.class, NormalcyStatus.class);
		return collection;
	}

	public static NormalcyStatus getNormalcyStatusInstance(LookupService lookupService, int id) 
	{
		return (NormalcyStatus)lookupService.getLookupInstance(NormalcyStatus.class, NormalcyStatus.TYPE_ID, id);
	}
	

	public static ResultUnitOfMeasureCollection getResultUnitOfMeasure(LookupService lookupService) {
		ResultUnitOfMeasureCollection collection =
			(ResultUnitOfMeasureCollection) lookupService.getLookupCollection(ResultUnitOfMeasure.TYPE_ID, 
				ResultUnitOfMeasureCollection.class, ResultUnitOfMeasure.class);
		return collection;
	}

	public static ResultUnitOfMeasure getResultUnitOfMeasureInstance(LookupService lookupService, int id) 
	{
		return (ResultUnitOfMeasure)lookupService.getLookupInstance(ResultUnitOfMeasure.class, ResultUnitOfMeasure.TYPE_ID, id);
	}
	

	public static ResultValueTypeCollection getResultValueType(LookupService lookupService) {
		ResultValueTypeCollection collection =
			(ResultValueTypeCollection) lookupService.getLookupCollection(ResultValueType.TYPE_ID, 
				ResultValueTypeCollection.class, ResultValueType.class);
		return collection;
	}

	public static ResultValueType getResultValueTypeInstance(LookupService lookupService, int id) 
	{
		return (ResultValueType)lookupService.getLookupInstance(ResultValueType.class, ResultValueType.TYPE_ID, id);
	}
	

	public static ResultCommentTypeCollection getResultCommentType(LookupService lookupService) {
		ResultCommentTypeCollection collection =
			(ResultCommentTypeCollection) lookupService.getLookupCollection(ResultCommentType.TYPE_ID, 
				ResultCommentTypeCollection.class, ResultCommentType.class);
		return collection;
	}

	public static ResultCommentType getResultCommentTypeInstance(LookupService lookupService, int id) 
	{
		return (ResultCommentType)lookupService.getLookupInstance(ResultCommentType.class, ResultCommentType.TYPE_ID, id);
	}
	

	public static OrderInvStatusCollection getOrderInvStatus(LookupService lookupService) {
		OrderInvStatusCollection collection =
			(OrderInvStatusCollection) lookupService.getLookupCollection(OrderInvStatus.TYPE_ID, 
				OrderInvStatusCollection.class, OrderInvStatus.class);
		return collection;
	}

	public static OrderInvStatus getOrderInvStatusInstance(LookupService lookupService, int id) 
	{
		return (OrderInvStatus)lookupService.getLookupInstance(OrderInvStatus.class, OrderInvStatus.TYPE_ID, id);
	}
	

	public static OrderPatMobilityCollection getOrderPatMobility(LookupService lookupService) {
		OrderPatMobilityCollection collection =
			(OrderPatMobilityCollection) lookupService.getLookupCollection(OrderPatMobility.TYPE_ID, 
				OrderPatMobilityCollection.class, OrderPatMobility.class);
		return collection;
	}

	public static OrderPatMobility getOrderPatMobilityInstance(LookupService lookupService, int id) 
	{
		return (OrderPatMobility)lookupService.getLookupInstance(OrderPatMobility.class, OrderPatMobility.TYPE_ID, id);
	}
	

	public static ResultSpecimenTypesCollection getResultSpecimenTypes(LookupService lookupService) {
		ResultSpecimenTypesCollection collection =
			(ResultSpecimenTypesCollection) lookupService.getLookupCollection(ResultSpecimenTypes.TYPE_ID, 
				ResultSpecimenTypesCollection.class, ResultSpecimenTypes.class);
		return collection;
	}

	public static ResultSpecimenTypes getResultSpecimenTypesInstance(LookupService lookupService, int id) 
	{
		return (ResultSpecimenTypes)lookupService.getLookupInstance(ResultSpecimenTypes.class, ResultSpecimenTypes.TYPE_ID, id);
	}
	

	public static InvestigationOrderabilityCollection getInvestigationOrderability(LookupService lookupService) {
		InvestigationOrderabilityCollection collection =
			(InvestigationOrderabilityCollection) lookupService.getLookupCollection(InvestigationOrderability.TYPE_ID, 
				InvestigationOrderabilityCollection.class, InvestigationOrderability.class);
		return collection;
	}

	public static InvestigationOrderability getInvestigationOrderabilityInstance(LookupService lookupService, int id) 
	{
		return (InvestigationOrderability)lookupService.getLookupInstance(InvestigationOrderability.class, InvestigationOrderability.TYPE_ID, id);
	}
	

	public static OutPatientDurationCollection getOutPatientDuration(LookupService lookupService) {
		OutPatientDurationCollection collection =
			(OutPatientDurationCollection) lookupService.getLookupCollection(OutPatientDuration.TYPE_ID, 
				OutPatientDurationCollection.class, OutPatientDuration.class);
		return collection;
	}

	public static OutPatientDuration getOutPatientDurationInstance(LookupService lookupService, int id) 
	{
		return (OutPatientDuration)lookupService.getLookupInstance(OutPatientDuration.class, OutPatientDuration.TYPE_ID, id);
	}
	

	public static SpecimenColourCollection getSpecimenColour(LookupService lookupService) {
		SpecimenColourCollection collection =
			(SpecimenColourCollection) lookupService.getLookupCollection(SpecimenColour.TYPE_ID, 
				SpecimenColourCollection.class, SpecimenColour.class);
		return collection;
	}

	public static SpecimenColour getSpecimenColourInstance(LookupService lookupService, int id) 
	{
		return (SpecimenColour)lookupService.getLookupInstance(SpecimenColour.class, SpecimenColour.TYPE_ID, id);
	}
	

	public static SpecimenTypeCollection getSpecimenType(LookupService lookupService) {
		SpecimenTypeCollection collection =
			(SpecimenTypeCollection) lookupService.getLookupCollection(SpecimenType.TYPE_ID, 
				SpecimenTypeCollection.class, SpecimenType.class);
		return collection;
	}

	public static SpecimenType getSpecimenTypeInstance(LookupService lookupService, int id) 
	{
		return (SpecimenType)lookupService.getLookupInstance(SpecimenType.class, SpecimenType.TYPE_ID, id);
	}
	

	public static SpecimenSiteCollection getSpecimenSite(LookupService lookupService) {
		SpecimenSiteCollection collection =
			(SpecimenSiteCollection) lookupService.getLookupCollection(SpecimenSite.TYPE_ID, 
				SpecimenSiteCollection.class, SpecimenSite.class);
		return collection;
	}

	public static SpecimenSite getSpecimenSiteInstance(LookupService lookupService, int id) 
	{
		return (SpecimenSite)lookupService.getLookupInstance(SpecimenSite.class, SpecimenSite.TYPE_ID, id);
	}
	

	public static SpecimenActionCodeCollection getSpecimenActionCode(LookupService lookupService) {
		SpecimenActionCodeCollection collection =
			(SpecimenActionCodeCollection) lookupService.getLookupCollection(SpecimenActionCode.TYPE_ID, 
				SpecimenActionCodeCollection.class, SpecimenActionCode.class);
		return collection;
	}

	public static SpecimenActionCode getSpecimenActionCodeInstance(LookupService lookupService, int id) 
	{
		return (SpecimenActionCode)lookupService.getLookupInstance(SpecimenActionCode.class, SpecimenActionCode.TYPE_ID, id);
	}
	

	public static PathContainerAdditiveCollection getPathContainerAdditive(LookupService lookupService) {
		PathContainerAdditiveCollection collection =
			(PathContainerAdditiveCollection) lookupService.getLookupCollection(PathContainerAdditive.TYPE_ID, 
				PathContainerAdditiveCollection.class, PathContainerAdditive.class);
		return collection;
	}

	public static PathContainerAdditive getPathContainerAdditiveInstance(LookupService lookupService, int id) 
	{
		return (PathContainerAdditive)lookupService.getLookupInstance(PathContainerAdditive.class, PathContainerAdditive.TYPE_ID, id);
	}
	

	public static PathContainerSizeCollection getPathContainerSize(LookupService lookupService) {
		PathContainerSizeCollection collection =
			(PathContainerSizeCollection) lookupService.getLookupCollection(PathContainerSize.TYPE_ID, 
				PathContainerSizeCollection.class, PathContainerSize.class);
		return collection;
	}

	public static PathContainerSize getPathContainerSizeInstance(LookupService lookupService, int id) 
	{
		return (PathContainerSize)lookupService.getLookupInstance(PathContainerSize.class, PathContainerSize.TYPE_ID, id);
	}
	

	public static PathContainerMaterialCollection getPathContainerMaterial(LookupService lookupService) {
		PathContainerMaterialCollection collection =
			(PathContainerMaterialCollection) lookupService.getLookupCollection(PathContainerMaterial.TYPE_ID, 
				PathContainerMaterialCollection.class, PathContainerMaterial.class);
		return collection;
	}

	public static PathContainerMaterial getPathContainerMaterialInstance(LookupService lookupService, int id) 
	{
		return (PathContainerMaterial)lookupService.getLookupInstance(PathContainerMaterial.class, PathContainerMaterial.TYPE_ID, id);
	}
	

	public static SpecimenManufacturerCollection getSpecimenManufacturer(LookupService lookupService) {
		SpecimenManufacturerCollection collection =
			(SpecimenManufacturerCollection) lookupService.getLookupCollection(SpecimenManufacturer.TYPE_ID, 
				SpecimenManufacturerCollection.class, SpecimenManufacturer.class);
		return collection;
	}

	public static SpecimenManufacturer getSpecimenManufacturerInstance(LookupService lookupService, int id) 
	{
		return (SpecimenManufacturer)lookupService.getLookupInstance(SpecimenManufacturer.class, SpecimenManufacturer.TYPE_ID, id);
	}
	

	public static PathVolumeUnitsCollection getPathVolumeUnits(LookupService lookupService) {
		PathVolumeUnitsCollection collection =
			(PathVolumeUnitsCollection) lookupService.getLookupCollection(PathVolumeUnits.TYPE_ID, 
				PathVolumeUnitsCollection.class, PathVolumeUnits.class);
		return collection;
	}

	public static PathVolumeUnits getPathVolumeUnitsInstance(LookupService lookupService, int id) 
	{
		return (PathVolumeUnits)lookupService.getLookupInstance(PathVolumeUnits.class, PathVolumeUnits.TYPE_ID, id);
	}
	

	public static InvestigationStatusChangeReasonCollection getInvestigationStatusChangeReason(LookupService lookupService) {
		InvestigationStatusChangeReasonCollection collection =
			(InvestigationStatusChangeReasonCollection) lookupService.getLookupCollection(InvestigationStatusChangeReason.TYPE_ID, 
				InvestigationStatusChangeReasonCollection.class, InvestigationStatusChangeReason.class);
		return collection;
	}

	public static InvestigationStatusChangeReason getInvestigationStatusChangeReasonInstance(LookupService lookupService, int id) 
	{
		return (InvestigationStatusChangeReason)lookupService.getLookupInstance(InvestigationStatusChangeReason.class, InvestigationStatusChangeReason.TYPE_ID, id);
	}
	

	public static MinReorderPeriodCollection getMinReorderPeriod(LookupService lookupService) {
		MinReorderPeriodCollection collection =
			(MinReorderPeriodCollection) lookupService.getLookupCollection(MinReorderPeriod.TYPE_ID, 
				MinReorderPeriodCollection.class, MinReorderPeriod.class);
		return collection;
	}

	public static MinReorderPeriod getMinReorderPeriodInstance(LookupService lookupService, int id) 
	{
		return (MinReorderPeriod)lookupService.getLookupInstance(MinReorderPeriod.class, MinReorderPeriod.TYPE_ID, id);
	}
	

	public static ClinImagDurUnitCollection getClinImagDurUnit(LookupService lookupService) {
		ClinImagDurUnitCollection collection =
			(ClinImagDurUnitCollection) lookupService.getLookupCollection(ClinImagDurUnit.TYPE_ID, 
				ClinImagDurUnitCollection.class, ClinImagDurUnit.class);
		return collection;
	}

	public static ClinImagDurUnit getClinImagDurUnitInstance(LookupService lookupService, int id) 
	{
		return (ClinImagDurUnit)lookupService.getLookupInstance(ClinImagDurUnit.class, ClinImagDurUnit.TYPE_ID, id);
	}
	

	public static OrderPriorityCollection getOrderPriority(LookupService lookupService) {
		OrderPriorityCollection collection =
			(OrderPriorityCollection) lookupService.getLookupCollection(OrderPriority.TYPE_ID, 
				OrderPriorityCollection.class, OrderPriority.class);
		return collection;
	}

	public static OrderPriority getOrderPriorityInstance(LookupService lookupService, int id) 
	{
		return (OrderPriority)lookupService.getLookupInstance(OrderPriority.class, OrderPriority.TYPE_ID, id);
	}
	

	public static ItemSelectionTypeCollection getItemSelectionType(LookupService lookupService) {
		ItemSelectionTypeCollection collection =
			(ItemSelectionTypeCollection) lookupService.getLookupCollection(ItemSelectionType.TYPE_ID, 
				ItemSelectionTypeCollection.class, ItemSelectionType.class);
		return collection;
	}

	public static ItemSelectionType getItemSelectionTypeInstance(LookupService lookupService, int id) 
	{
		return (ItemSelectionType)lookupService.getLookupInstance(ItemSelectionType.class, ItemSelectionType.TYPE_ID, id);
	}
	

	public static CategoryCollection getCategory(LookupService lookupService) {
		CategoryCollection collection =
			(CategoryCollection) lookupService.getLookupCollection(Category.TYPE_ID, 
				CategoryCollection.class, Category.class);
		return collection;
	}

	public static Category getCategoryInstance(LookupService lookupService, int id) 
	{
		return (Category)lookupService.getLookupInstance(Category.class, Category.TYPE_ID, id);
	}
	

	public static ResultEDSubtypeCollection getResultEDSubtype(LookupService lookupService) {
		ResultEDSubtypeCollection collection =
			(ResultEDSubtypeCollection) lookupService.getLookupCollection(ResultEDSubtype.TYPE_ID, 
				ResultEDSubtypeCollection.class, ResultEDSubtype.class);
		return collection;
	}

	public static ResultEDSubtype getResultEDSubtypeInstance(LookupService lookupService, int id) 
	{
		return (ResultEDSubtype)lookupService.getLookupInstance(ResultEDSubtype.class, ResultEDSubtype.TYPE_ID, id);
	}
	

	public static PrintingLocationTypeCollection getPrintingLocationType(LookupService lookupService) {
		PrintingLocationTypeCollection collection =
			(PrintingLocationTypeCollection) lookupService.getLookupCollection(PrintingLocationType.TYPE_ID, 
				PrintingLocationTypeCollection.class, PrintingLocationType.class);
		return collection;
	}

	public static PrintingLocationType getPrintingLocationTypeInstance(LookupService lookupService, int id) 
	{
		return (PrintingLocationType)lookupService.getLookupInstance(PrintingLocationType.class, PrintingLocationType.TYPE_ID, id);
	}
	

	public static ReportToTypeCollection getReportToType(LookupService lookupService) {
		ReportToTypeCollection collection =
			(ReportToTypeCollection) lookupService.getLookupCollection(ReportToType.TYPE_ID, 
				ReportToTypeCollection.class, ReportToType.class);
		return collection;
	}

	public static ReportToType getReportToTypeInstance(LookupService lookupService, int id) 
	{
		return (ReportToType)lookupService.getLookupInstance(ReportToType.class, ReportToType.TYPE_ID, id);
	}
	

	public static AuthorisationOrderStatusCollection getAuthorisationOrderStatus(LookupService lookupService) {
		AuthorisationOrderStatusCollection collection =
			(AuthorisationOrderStatusCollection) lookupService.getLookupCollection(AuthorisationOrderStatus.TYPE_ID, 
				AuthorisationOrderStatusCollection.class, AuthorisationOrderStatus.class);
		return collection;
	}

	public static AuthorisationOrderStatus getAuthorisationOrderStatusInstance(LookupService lookupService, int id) 
	{
		return (AuthorisationOrderStatus)lookupService.getLookupInstance(AuthorisationOrderStatus.class, AuthorisationOrderStatus.TYPE_ID, id);
	}
	

	public static PrintStatusCollection getPrintStatus(LookupService lookupService) {
		PrintStatusCollection collection =
			(PrintStatusCollection) lookupService.getLookupCollection(PrintStatus.TYPE_ID, 
				PrintStatusCollection.class, PrintStatus.class);
		return collection;
	}

	public static PrintStatus getPrintStatusInstance(LookupService lookupService, int id) 
	{
		return (PrintStatus)lookupService.getLookupInstance(PrintStatus.class, PrintStatus.TYPE_ID, id);
	}
	

	public static OrderQuestionTypeCollection getOrderQuestionType(LookupService lookupService) {
		OrderQuestionTypeCollection collection =
			(OrderQuestionTypeCollection) lookupService.getLookupCollection(OrderQuestionType.TYPE_ID, 
				OrderQuestionTypeCollection.class, OrderQuestionType.class);
		return collection;
	}

	public static OrderQuestionType getOrderQuestionTypeInstance(LookupService lookupService, int id) 
	{
		return (OrderQuestionType)lookupService.getLookupInstance(OrderQuestionType.class, OrderQuestionType.TYPE_ID, id);
	}
	

	public static SpecimenCollectionStatusCollection getSpecimenCollectionStatus(LookupService lookupService) {
		SpecimenCollectionStatusCollection collection =
			(SpecimenCollectionStatusCollection) lookupService.getLookupCollection(SpecimenCollectionStatus.TYPE_ID, 
				SpecimenCollectionStatusCollection.class, SpecimenCollectionStatus.class);
		return collection;
	}

	public static SpecimenCollectionStatus getSpecimenCollectionStatusInstance(LookupService lookupService, int id) 
	{
		return (SpecimenCollectionStatus)lookupService.getLookupInstance(SpecimenCollectionStatus.class, SpecimenCollectionStatus.TYPE_ID, id);
	}
	

	public static SpecimenCollectionTypeCollection getSpecimenCollectionType(LookupService lookupService) {
		SpecimenCollectionTypeCollection collection =
			(SpecimenCollectionTypeCollection) lookupService.getLookupCollection(SpecimenCollectionType.TYPE_ID, 
				SpecimenCollectionTypeCollection.class, SpecimenCollectionType.class);
		return collection;
	}

	public static SpecimenCollectionType getSpecimenCollectionTypeInstance(LookupService lookupService, int id) 
	{
		return (SpecimenCollectionType)lookupService.getLookupInstance(SpecimenCollectionType.class, SpecimenCollectionType.TYPE_ID, id);
	}
	

	public static DayOfWeekCollection getDayOfWeek(LookupService lookupService) {
		DayOfWeekCollection collection =
			(DayOfWeekCollection) lookupService.getLookupCollection(DayOfWeek.TYPE_ID, 
				DayOfWeekCollection.class, DayOfWeek.class);
		return collection;
	}

	public static DayOfWeek getDayOfWeekInstance(LookupService lookupService, int id) 
	{
		return (DayOfWeek)lookupService.getLookupInstance(DayOfWeek.class, DayOfWeek.TYPE_ID, id);
	}
	

	public static OcsDisplayFlagCollection getOcsDisplayFlag(LookupService lookupService) {
		OcsDisplayFlagCollection collection =
			(OcsDisplayFlagCollection) lookupService.getLookupCollection(OcsDisplayFlag.TYPE_ID, 
				OcsDisplayFlagCollection.class, OcsDisplayFlag.class);
		return collection;
	}

	public static OcsDisplayFlag getOcsDisplayFlagInstance(LookupService lookupService, int id) 
	{
		return (OcsDisplayFlag)lookupService.getLookupInstance(OcsDisplayFlag.class, OcsDisplayFlag.TYPE_ID, id);
	}
	

	public static OrderMessageStatusCollection getOrderMessageStatus(LookupService lookupService) {
		OrderMessageStatusCollection collection =
			(OrderMessageStatusCollection) lookupService.getLookupCollection(OrderMessageStatus.TYPE_ID, 
				OrderMessageStatusCollection.class, OrderMessageStatus.class);
		return collection;
	}

	public static OrderMessageStatus getOrderMessageStatusInstance(LookupService lookupService, int id) 
	{
		return (OrderMessageStatus)lookupService.getLookupInstance(OrderMessageStatus.class, OrderMessageStatus.TYPE_ID, id);
	}
	

	public static OrderCategoryCollection getOrderCategory(LookupService lookupService) {
		OrderCategoryCollection collection =
			(OrderCategoryCollection) lookupService.getLookupCollection(OrderCategory.TYPE_ID, 
				OrderCategoryCollection.class, OrderCategory.class);
		return collection;
	}

	public static OrderCategory getOrderCategoryInstance(LookupService lookupService, int id) 
	{
		return (OrderCategory)lookupService.getLookupInstance(OrderCategory.class, OrderCategory.TYPE_ID, id);
	}
	

	public static SelectAndOrderComponentTypeCollection getSelectAndOrderComponentType(LookupService lookupService) {
		SelectAndOrderComponentTypeCollection collection =
			(SelectAndOrderComponentTypeCollection) lookupService.getLookupCollection(SelectAndOrderComponentType.TYPE_ID, 
				SelectAndOrderComponentTypeCollection.class, SelectAndOrderComponentType.class);
		return collection;
	}

	public static SelectAndOrderComponentType getSelectAndOrderComponentTypeInstance(LookupService lookupService, int id) 
	{
		return (SelectAndOrderComponentType)lookupService.getLookupInstance(SelectAndOrderComponentType.class, SelectAndOrderComponentType.TYPE_ID, id);
	}
	

	public static TemplateCategoriesCollection getTemplateCategories(LookupService lookupService) {
		TemplateCategoriesCollection collection =
			(TemplateCategoriesCollection) lookupService.getLookupCollection(TemplateCategories.TYPE_ID, 
				TemplateCategoriesCollection.class, TemplateCategories.class);
		return collection;
	}

	public static TemplateCategories getTemplateCategoriesInstance(LookupService lookupService, int id) 
	{
		return (TemplateCategories)lookupService.getLookupInstance(TemplateCategories.class, TemplateCategories.TYPE_ID, id);
	}
	

	public static SpecimenCollectionMethodCollection getSpecimenCollectionMethod(LookupService lookupService) {
		SpecimenCollectionMethodCollection collection =
			(SpecimenCollectionMethodCollection) lookupService.getLookupCollection(SpecimenCollectionMethod.TYPE_ID, 
				SpecimenCollectionMethodCollection.class, SpecimenCollectionMethod.class);
		return collection;
	}

	public static SpecimenCollectionMethod getSpecimenCollectionMethodInstance(LookupService lookupService, int id) 
	{
		return (SpecimenCollectionMethod)lookupService.getLookupInstance(SpecimenCollectionMethod.class, SpecimenCollectionMethod.TYPE_ID, id);
	}
	

	public static TemplateDividerTypeCollection getTemplateDividerType(LookupService lookupService) {
		TemplateDividerTypeCollection collection =
			(TemplateDividerTypeCollection) lookupService.getLookupCollection(TemplateDividerType.TYPE_ID, 
				TemplateDividerTypeCollection.class, TemplateDividerType.class);
		return collection;
	}

	public static TemplateDividerType getTemplateDividerTypeInstance(LookupService lookupService, int id) 
	{
		return (TemplateDividerType)lookupService.getLookupInstance(TemplateDividerType.class, TemplateDividerType.TYPE_ID, id);
	}
	

	public static TestHelpTitlesCollection getTestHelpTitles(LookupService lookupService) {
		TestHelpTitlesCollection collection =
			(TestHelpTitlesCollection) lookupService.getLookupCollection(TestHelpTitles.TYPE_ID, 
				TestHelpTitlesCollection.class, TestHelpTitles.class);
		return collection;
	}

	public static TestHelpTitles getTestHelpTitlesInstance(LookupService lookupService, int id) 
	{
		return (TestHelpTitles)lookupService.getLookupInstance(TestHelpTitles.class, TestHelpTitles.TYPE_ID, id);
	}
	

	public static HelpTextCategoryCollection getHelpTextCategory(LookupService lookupService) {
		HelpTextCategoryCollection collection =
			(HelpTextCategoryCollection) lookupService.getLookupCollection(HelpTextCategory.TYPE_ID, 
				HelpTextCategoryCollection.class, HelpTextCategory.class);
		return collection;
	}

	public static HelpTextCategory getHelpTextCategoryInstance(LookupService lookupService, int id) 
	{
		return (HelpTextCategory)lookupService.getLookupInstance(HelpTextCategory.class, HelpTextCategory.TYPE_ID, id);
	}
	
}



