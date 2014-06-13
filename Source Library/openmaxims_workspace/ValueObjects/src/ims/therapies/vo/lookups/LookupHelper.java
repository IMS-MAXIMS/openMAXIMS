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
package ims.therapies.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static DominantHandCollection getDominantHand(LookupService lookupService) {
		DominantHandCollection collection =
			(DominantHandCollection) lookupService.getLookupCollection(DominantHand.TYPE_ID, 
				DominantHandCollection.class, DominantHand.class);
		return collection;
	}

	public static DominantHand getDominantHandInstance(LookupService lookupService, int id) 
	{
		return (DominantHand)lookupService.getLookupInstance(DominantHand.class, DominantHand.TYPE_ID, id);
	}
	

	public static HandednessCollection getHandedness(LookupService lookupService) {
		HandednessCollection collection =
			(HandednessCollection) lookupService.getLookupCollection(Handedness.TYPE_ID, 
				HandednessCollection.class, Handedness.class);
		return collection;
	}

	public static Handedness getHandednessInstance(LookupService lookupService, int id) 
	{
		return (Handedness)lookupService.getLookupInstance(Handedness.class, Handedness.TYPE_ID, id);
	}
	

	public static PlinthWorkActivityCollection getPlinthWorkActivity(LookupService lookupService) {
		PlinthWorkActivityCollection collection =
			(PlinthWorkActivityCollection) lookupService.getLookupCollection(PlinthWorkActivity.TYPE_ID, 
				PlinthWorkActivityCollection.class, PlinthWorkActivity.class);
		return collection;
	}

	public static PlinthWorkActivity getPlinthWorkActivityInstance(LookupService lookupService, int id) 
	{
		return (PlinthWorkActivity)lookupService.getLookupInstance(PlinthWorkActivity.class, PlinthWorkActivity.TYPE_ID, id);
	}
	

	public static GaitOrthosisCollection getGaitOrthosis(LookupService lookupService) {
		GaitOrthosisCollection collection =
			(GaitOrthosisCollection) lookupService.getLookupCollection(GaitOrthosis.TYPE_ID, 
				GaitOrthosisCollection.class, GaitOrthosis.class);
		return collection;
	}

	public static GaitOrthosis getGaitOrthosisInstance(LookupService lookupService, int id) 
	{
		return (GaitOrthosis)lookupService.getLookupInstance(GaitOrthosis.class, GaitOrthosis.TYPE_ID, id);
	}
	

	public static StandingSupportTypeExerciseCollection getStandingSupportTypeExercise(LookupService lookupService) {
		StandingSupportTypeExerciseCollection collection =
			(StandingSupportTypeExerciseCollection) lookupService.getLookupCollection(StandingSupportTypeExercise.TYPE_ID, 
				StandingSupportTypeExerciseCollection.class, StandingSupportTypeExercise.class);
		return collection;
	}

	public static StandingSupportTypeExercise getStandingSupportTypeExerciseInstance(LookupService lookupService, int id) 
	{
		return (StandingSupportTypeExercise)lookupService.getLookupInstance(StandingSupportTypeExercise.class, StandingSupportTypeExercise.TYPE_ID, id);
	}
	

	public static TreatmentEquipmentTypeConfigCollection getTreatmentEquipmentTypeConfig(LookupService lookupService) {
		TreatmentEquipmentTypeConfigCollection collection =
			(TreatmentEquipmentTypeConfigCollection) lookupService.getLookupCollection(TreatmentEquipmentTypeConfig.TYPE_ID, 
				TreatmentEquipmentTypeConfigCollection.class, TreatmentEquipmentTypeConfig.class);
		return collection;
	}

	public static TreatmentEquipmentTypeConfig getTreatmentEquipmentTypeConfigInstance(LookupService lookupService, int id) 
	{
		return (TreatmentEquipmentTypeConfig)lookupService.getLookupInstance(TreatmentEquipmentTypeConfig.class, TreatmentEquipmentTypeConfig.TYPE_ID, id);
	}
	

	public static BalanceActivitiesCollection getBalanceActivities(LookupService lookupService) {
		BalanceActivitiesCollection collection =
			(BalanceActivitiesCollection) lookupService.getLookupCollection(BalanceActivities.TYPE_ID, 
				BalanceActivitiesCollection.class, BalanceActivities.class);
		return collection;
	}

	public static BalanceActivities getBalanceActivitiesInstance(LookupService lookupService, int id) 
	{
		return (BalanceActivities)lookupService.getLookupInstance(BalanceActivities.class, BalanceActivities.TYPE_ID, id);
	}
	

	public static PlinthWorkTreatmentCollection getPlinthWorkTreatment(LookupService lookupService) {
		PlinthWorkTreatmentCollection collection =
			(PlinthWorkTreatmentCollection) lookupService.getLookupCollection(PlinthWorkTreatment.TYPE_ID, 
				PlinthWorkTreatmentCollection.class, PlinthWorkTreatment.class);
		return collection;
	}

	public static PlinthWorkTreatment getPlinthWorkTreatmentInstance(LookupService lookupService, int id) 
	{
		return (PlinthWorkTreatment)lookupService.getLookupInstance(PlinthWorkTreatment.class, PlinthWorkTreatment.TYPE_ID, id);
	}
	

	public static PlinthWorkBalanceAnalysisCollection getPlinthWorkBalanceAnalysis(LookupService lookupService) {
		PlinthWorkBalanceAnalysisCollection collection =
			(PlinthWorkBalanceAnalysisCollection) lookupService.getLookupCollection(PlinthWorkBalanceAnalysis.TYPE_ID, 
				PlinthWorkBalanceAnalysisCollection.class, PlinthWorkBalanceAnalysis.class);
		return collection;
	}

	public static PlinthWorkBalanceAnalysis getPlinthWorkBalanceAnalysisInstance(LookupService lookupService, int id) 
	{
		return (PlinthWorkBalanceAnalysis)lookupService.getLookupInstance(PlinthWorkBalanceAnalysis.class, PlinthWorkBalanceAnalysis.TYPE_ID, id);
	}
	

	public static StretchingAreaCollection getStretchingArea(LookupService lookupService) {
		StretchingAreaCollection collection =
			(StretchingAreaCollection) lookupService.getLookupCollection(StretchingArea.TYPE_ID, 
				StretchingAreaCollection.class, StretchingArea.class);
		return collection;
	}

	public static StretchingArea getStretchingAreaInstance(LookupService lookupService, int id) 
	{
		return (StretchingArea)lookupService.getLookupInstance(StretchingArea.class, StretchingArea.TYPE_ID, id);
	}
	

	public static CarerEducationCollection getCarerEducation(LookupService lookupService) {
		CarerEducationCollection collection =
			(CarerEducationCollection) lookupService.getLookupCollection(CarerEducation.TYPE_ID, 
				CarerEducationCollection.class, CarerEducation.class);
		return collection;
	}

	public static CarerEducation getCarerEducationInstance(LookupService lookupService, int id) 
	{
		return (CarerEducation)lookupService.getLookupInstance(CarerEducation.class, CarerEducation.TYPE_ID, id);
	}
	

	public static JaymarLevelCollection getJaymarLevel(LookupService lookupService) {
		JaymarLevelCollection collection =
			(JaymarLevelCollection) lookupService.getLookupCollection(JaymarLevel.TYPE_ID, 
				JaymarLevelCollection.class, JaymarLevel.class);
		return collection;
	}

	public static JaymarLevel getJaymarLevelInstance(LookupService lookupService, int id) 
	{
		return (JaymarLevel)lookupService.getLookupInstance(JaymarLevel.class, JaymarLevel.TYPE_ID, id);
	}
	
}



