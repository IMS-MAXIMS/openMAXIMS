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
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 13/10/2015, 13:23
 */
package ims.eas.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static RemovalReasonCollection getRemovalReason(LookupService lookupService) {
		RemovalReasonCollection collection =
			(RemovalReasonCollection) lookupService.getLookupCollection(RemovalReason.TYPE_ID, 
				RemovalReasonCollection.class, RemovalReason.class);
		return collection;
	}

	public static RemovalReason getRemovalReasonInstance(LookupService lookupService, int id) 
	{
		return (RemovalReason)lookupService.getLookupInstance(RemovalReason.class, RemovalReason.TYPE_ID, id);
	}
	

	public static ProtocolActionsCollection getProtocolActions(LookupService lookupService) {
		ProtocolActionsCollection collection =
			(ProtocolActionsCollection) lookupService.getLookupCollection(ProtocolActions.TYPE_ID, 
				ProtocolActionsCollection.class, ProtocolActions.class);
		return collection;
	}

	public static ProtocolActions getProtocolActionsInstance(LookupService lookupService, int id) 
	{
		return (ProtocolActions)lookupService.getLookupInstance(ProtocolActions.class, ProtocolActions.TYPE_ID, id);
	}
	

	public static EASStatusCollection getEASStatus(LookupService lookupService) {
		EASStatusCollection collection =
			(EASStatusCollection) lookupService.getLookupCollection(EASStatus.TYPE_ID, 
				EASStatusCollection.class, EASStatus.class);
		return collection;
	}

	public static EASStatus getEASStatusInstance(LookupService lookupService, int id) 
	{
		return (EASStatus)lookupService.getLookupInstance(EASStatus.class, EASStatus.TYPE_ID, id);
	}
	

	public static PhaseNamesCollection getPhaseNames(LookupService lookupService) {
		PhaseNamesCollection collection =
			(PhaseNamesCollection) lookupService.getLookupCollection(PhaseNames.TYPE_ID, 
				PhaseNamesCollection.class, PhaseNames.class);
		return collection;
	}

	public static PhaseNames getPhaseNamesInstance(LookupService lookupService, int id) 
	{
		return (PhaseNames)lookupService.getLookupInstance(PhaseNames.class, PhaseNames.TYPE_ID, id);
	}
	

	public static MouldRoomActivityCollection getMouldRoomActivity(LookupService lookupService) {
		MouldRoomActivityCollection collection =
			(MouldRoomActivityCollection) lookupService.getLookupCollection(MouldRoomActivity.TYPE_ID, 
				MouldRoomActivityCollection.class, MouldRoomActivity.class);
		return collection;
	}

	public static MouldRoomActivity getMouldRoomActivityInstance(LookupService lookupService, int id) 
	{
		return (MouldRoomActivity)lookupService.getLookupInstance(MouldRoomActivity.class, MouldRoomActivity.TYPE_ID, id);
	}
	

	public static ImmobilisationTypeCollection getImmobilisationType(LookupService lookupService) {
		ImmobilisationTypeCollection collection =
			(ImmobilisationTypeCollection) lookupService.getLookupCollection(ImmobilisationType.TYPE_ID, 
				ImmobilisationTypeCollection.class, ImmobilisationType.class);
		return collection;
	}

	public static ImmobilisationType getImmobilisationTypeInstance(LookupService lookupService, int id) 
	{
		return (ImmobilisationType)lookupService.getLookupInstance(ImmobilisationType.class, ImmobilisationType.TYPE_ID, id);
	}
	

	public static IMRTCollection getIMRT(LookupService lookupService) {
		IMRTCollection collection =
			(IMRTCollection) lookupService.getLookupCollection(IMRT.TYPE_ID, 
				IMRTCollection.class, IMRT.class);
		return collection;
	}

	public static IMRT getIMRTInstance(LookupService lookupService, int id) 
	{
		return (IMRT)lookupService.getLookupInstance(IMRT.class, IMRT.TYPE_ID, id);
	}
	

	public static GatingOptionsCollection getGatingOptions(LookupService lookupService) {
		GatingOptionsCollection collection =
			(GatingOptionsCollection) lookupService.getLookupCollection(GatingOptions.TYPE_ID, 
				GatingOptionsCollection.class, GatingOptions.class);
		return collection;
	}

	public static GatingOptions getGatingOptionsInstance(LookupService lookupService, int id) 
	{
		return (GatingOptions)lookupService.getLookupInstance(GatingOptions.class, GatingOptions.TYPE_ID, id);
	}
	

	public static OralContrastCollection getOralContrast(LookupService lookupService) {
		OralContrastCollection collection =
			(OralContrastCollection) lookupService.getLookupCollection(OralContrast.TYPE_ID, 
				OralContrastCollection.class, OralContrast.class);
		return collection;
	}

	public static OralContrast getOralContrastInstance(LookupService lookupService, int id) 
	{
		return (OralContrast)lookupService.getLookupInstance(OralContrast.class, OralContrast.TYPE_ID, id);
	}
	

	public static IVContrastCollection getIVContrast(LookupService lookupService) {
		IVContrastCollection collection =
			(IVContrastCollection) lookupService.getLookupCollection(IVContrast.TYPE_ID, 
				IVContrastCollection.class, IVContrast.class);
		return collection;
	}

	public static IVContrast getIVContrastInstance(LookupService lookupService, int id) 
	{
		return (IVContrast)lookupService.getLookupInstance(IVContrast.class, IVContrast.TYPE_ID, id);
	}
	

	public static ScanLimitsCollection getScanLimits(LookupService lookupService) {
		ScanLimitsCollection collection =
			(ScanLimitsCollection) lookupService.getLookupCollection(ScanLimits.TYPE_ID, 
				ScanLimitsCollection.class, ScanLimits.class);
		return collection;
	}

	public static ScanLimits getScanLimitsInstance(LookupService lookupService, int id) 
	{
		return (ScanLimits)lookupService.getLookupInstance(ScanLimits.class, ScanLimits.TYPE_ID, id);
	}
	

	public static AgentsCollection getAgents(LookupService lookupService) {
		AgentsCollection collection =
			(AgentsCollection) lookupService.getLookupCollection(Agents.TYPE_ID, 
				AgentsCollection.class, Agents.class);
		return collection;
	}

	public static Agents getAgentsInstance(LookupService lookupService, int id) 
	{
		return (Agents)lookupService.getLookupInstance(Agents.class, Agents.TYPE_ID, id);
	}
	

	public static TreatmentSitesCollection getTreatmentSites(LookupService lookupService) {
		TreatmentSitesCollection collection =
			(TreatmentSitesCollection) lookupService.getLookupCollection(TreatmentSites.TYPE_ID, 
				TreatmentSitesCollection.class, TreatmentSites.class);
		return collection;
	}

	public static TreatmentSites getTreatmentSitesInstance(LookupService lookupService, int id) 
	{
		return (TreatmentSites)lookupService.getLookupInstance(TreatmentSites.class, TreatmentSites.TYPE_ID, id);
	}
	

	public static PrimaryTumourCollection getPrimaryTumour(LookupService lookupService) {
		PrimaryTumourCollection collection =
			(PrimaryTumourCollection) lookupService.getLookupCollection(PrimaryTumour.TYPE_ID, 
				PrimaryTumourCollection.class, PrimaryTumour.class);
		return collection;
	}

	public static PrimaryTumour getPrimaryTumourInstance(LookupService lookupService, int id) 
	{
		return (PrimaryTumour)lookupService.getLookupInstance(PrimaryTumour.class, PrimaryTumour.TYPE_ID, id);
	}
	

	public static OptionsRequiredCollection getOptionsRequired(LookupService lookupService) {
		OptionsRequiredCollection collection =
			(OptionsRequiredCollection) lookupService.getLookupCollection(OptionsRequired.TYPE_ID, 
				OptionsRequiredCollection.class, OptionsRequired.class);
		return collection;
	}

	public static OptionsRequired getOptionsRequiredInstance(LookupService lookupService, int id) 
	{
		return (OptionsRequired)lookupService.getLookupInstance(OptionsRequired.class, OptionsRequired.TYPE_ID, id);
	}
	
}



