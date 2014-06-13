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
 * Created on 14-Jun-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package ims.coe.domain.impl;



import ims.coe.assessment.domain.objects.AccommodationComponent;
import ims.coe.assessment.domain.objects.ActivityLevelComponent;
import ims.coe.assessment.domain.objects.BladderComponent;
import ims.coe.assessment.domain.objects.BowelComponent;
import ims.coe.assessment.domain.objects.CommunicationComponent;
import ims.coe.assessment.domain.objects.DressingandGroomingComponent;
import ims.coe.assessment.domain.objects.EmotionalStateComponent;
import ims.coe.assessment.domain.objects.InfectionControlComponent;
import ims.coe.assessment.domain.objects.LeisureComponent;
import ims.coe.assessment.domain.objects.MobilityComponent;
import ims.coe.assessment.domain.objects.PainComponent;
import ims.coe.assessment.domain.objects.PersonalHygieneComponent;
import ims.coe.assessment.domain.objects.SleepingComponent;
import ims.coe.assessment.domain.objects.SpiritualityComponent;
import ims.coe.domain.AssessInfectionControl;
import ims.coe.vo.AssessmentAccommodation;
import ims.coe.vo.AssessmentActivityLevel;
import ims.coe.vo.AssessmentBladder;
import ims.coe.vo.AssessmentBowels;
import ims.coe.vo.AssessmentBreathingVo;
import ims.coe.vo.AssessmentCommunication;
import ims.coe.vo.AssessmentDressingAndGrooming;
import ims.coe.vo.AssessmentEatingAndDrinking;
import ims.coe.vo.AssessmentEmotionalState;
import ims.coe.vo.AssessmentLeisure;
import ims.coe.vo.AssessmentMobility;
import ims.coe.vo.AssessmentPain;
import ims.coe.vo.AssessmentPersonalHygiene;
import ims.coe.vo.AssessmentSkin;
import ims.coe.vo.AssessmentSleeping;
import ims.coe.vo.AssessmentSpirituality;
import ims.coe.vo.InfectionControlComponentVo;
import ims.coe.vo.domain.AssessmentAccommodationAssembler;
import ims.coe.vo.domain.AssessmentActivityLevelAssembler;
import ims.coe.vo.domain.AssessmentBladderAssembler;
import ims.coe.vo.domain.AssessmentBowelsAssembler;
import ims.coe.vo.domain.AssessmentBreathingVoAssembler;
import ims.coe.vo.domain.AssessmentCommunicationAssembler;
import ims.coe.vo.domain.AssessmentDressingAndGroomingAssembler;
import ims.coe.vo.domain.AssessmentEatingAndDrinkingAssembler;
import ims.coe.vo.domain.AssessmentEmotionalStateAssembler;
import ims.coe.vo.domain.AssessmentLeisureAssembler;
import ims.coe.vo.domain.AssessmentMobilityAssembler;
import ims.coe.vo.domain.AssessmentPainAssembler;
import ims.coe.vo.domain.AssessmentPersonalHygieneAssembler;
import ims.coe.vo.domain.AssessmentSkinAssembler;
import ims.coe.vo.domain.AssessmentSleepingAssembler;
import ims.coe.vo.domain.AssessmentSpiritualityAssembler;
import ims.coe.vo.domain.InfectionControlComponentVoAssembler;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.clinical.vo.AssessmentRefVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.HcpAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;
import ims.nursing.assessment.domain.objects.AdmissionAssessment;
import ims.nursing.assessment.domain.objects.BreathingComponent;
import ims.nursing.assessment.domain.objects.EatingComponent;
import ims.nursing.assessment.domain.objects.SkinComponent;
import ims.nursing.assessment.vo.AssessmentComponentRefVo;
import ims.nursing.vo.AssessmentComponent;
import ims.nursing.vo.AssessmentHeaderInfo;
import ims.nursing.vo.AssessmentInfo;
import ims.nursing.vo.AssessmentInfoCollection;
import ims.nursing.vo.CarePlanTemplateTitleCollection;
import ims.nursing.vo.domain.AssessmentComponentAssembler;
import ims.nursing.vo.domain.AssessmentHeaderInfoAssembler;
import ims.nursing.vo.lookups.AssessmentComponentType;
import ims.nursing.vo.lookups.AssessmentInformationStatus;
import ims.nursing.vo.lookups.AssessmentStatus;

import java.util.List;


public class AssessmentComponentImpl extends DomainImpl implements ims.coe.domain.AssessActivityLevel, ims.coe.domain.AssessAccommodation, ims.coe.domain.AssessBreathing, 
																   ims.coe.domain.AssessCommunication, ims.coe.domain.AssessDressingGrooming, ims.coe.domain.AssessMobility,
																   ims.coe.domain.AssessPersonalHygiene,  ims.coe.domain.AssessSkin, ims.coe.domain.AssessEating,
																   ims.coe.domain.AssessBowels, ims.coe.domain.AssessSleeping, ims.coe.domain.AssessLeisure,
																   ims.coe.domain.AssessBladder, ims.coe.domain.AssessEmotionalState, ims.coe.domain.AssessSpirituality, 
																   ims.coe.domain.AssessPain, ims.coe.domain.AssessBowelMedication, ims.coe.domain.AssessBladderManagement, ims.coe.domain.AssessPainMedication, ims.coe.domain.AssessSleepingMedication, AssessInfectionControl, ims.domain.impl.Transactional
{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Returns a list of careplan templates
	 */
	public CarePlanTemplateTitleCollection listCarePlanTemplates(AssessmentComponentType componentType)
	{
		DomainFactory factory = getDomainFactory();
		
		String hql = "from CarePlanTemplate t " +
				" where t.assessmentComponent = :compType" + 
				" and t.active = :isActive";
		java.util.List<?> templates = factory.find(hql, new String[]{"compType", "isActive"}, new Object[]{getDomLookup(componentType), Boolean.TRUE});
		return (ims.nursing.vo.domain.CarePlanTemplateTitleAssembler.createCarePlanTemplateTitleCollectionFromCarePlanTemplate(templates)).sort();
		
	}

	/**
	* save the component, add to the assessment, updates the list of components in the returned object
	*/
	public AssessmentHeaderInfo saveComponent(AssessmentHeaderInfo assessmentVo, AssessmentComponent componentVo) throws StaleObjectException,DomainInterfaceException 
	{
		
		// Ensure that the value object has been validated
		if (!componentVo.isValidated())
			throw new DomainRuntimeException("Assessment Component has not been validated");
		
		// Check if the assessment already exists, if not, create this then save the actual component
		DomainFactory factory = getDomainFactory();
		
		AdmissionAssessment domAssmnt = null;
		
		// If it's a new AssessmentHeaderInfo make sure that another one wasn't created since you opened the form
		if (assessmentVo.getID_Assessment() == null)
		{
			domAssmnt = getAdmissionAssessment(assessmentVo.getCareContext());
			
			
		}
		//If not save the one you have
		if (domAssmnt == null)
		{
			//	Convert from VO to Domain Object
			domAssmnt = AssessmentHeaderInfoAssembler.extractAdmissionAssessment(factory, assessmentVo);			
			factory.save(domAssmnt);
		}
		
		if (componentVo.getID_AssessmentComponent() == null && wasAnotherComponentCreated(domAssmnt,componentVo.getComponentType()))
			throw new DomainInterfaceException("A component of this type was created by another user. The screen will be refreshed");
	
		// The assessment is now persistant, we now want to save the component
		// We want to add another assessinfo record on this save too
		AssessmentInfoCollection voAssessInfoColl = componentVo.getAssessmentInfo();
		if (voAssessInfoColl == null)
			voAssessInfoColl = new AssessmentInfoCollection();	
		
		AssessmentInfo voAssessInfo = new AssessmentInfo();
		Object Object = getHcpLiteUser();
		HcpLiteVo hcpLiteVo = Object!=null?(HcpLiteVo)Object:null;
		
		voAssessInfo.setHCP(hcpLiteVo);
		
		AssessmentInformationStatus AssessInfoStatus;
		if (voAssessInfoColl.size() == 0)
			// New Component, set info status to new
			AssessInfoStatus = AssessmentInformationStatus.NEW;
		else
		{
			if (componentVo.getIsComplete().booleanValue() == true)
				// Complete component, set info status to complete
				AssessInfoStatus = AssessmentInformationStatus.COMPLETE;
			else
				// Incomplete component, set info status to incomplete
				AssessInfoStatus = AssessmentInformationStatus.INCOMPLETE;
		}
		voAssessInfo.setStatus(AssessInfoStatus);
		voAssessInfo.setDateTime(new ims.framework.utils.DateTime());	
		voAssessInfoColl.add(voAssessInfo);
		
		
		if (componentVo instanceof AssessmentAccommodation)
		{
			AssessmentAccommodation voAssessAccomodation = (AssessmentAccommodation)componentVo;
			voAssessAccomodation.setAssessmentInfo(voAssessInfoColl);
			AccommodationComponent doAccomodationComp = AssessmentAccommodationAssembler.extractAccommodationComponent(factory, voAssessAccomodation);
			doAccomodationComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.ACCOMMODATION.getId()));
			doAccomodationComp.setAssessment(domAssmnt);
			factory.save(doAccomodationComp);
			componentVo.setID_AssessmentComponent(doAccomodationComp.getId());
		}
		else if (componentVo instanceof AssessmentActivityLevel)
		{
			AssessmentActivityLevel voAssessActivity = (AssessmentActivityLevel)componentVo;
			voAssessActivity.setAssessmentInfo(voAssessInfoColl);
			ActivityLevelComponent doActivityComp = AssessmentActivityLevelAssembler.extractActivityLevelComponent(factory, voAssessActivity);	
			doActivityComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.ACTIVITY_LEVEL.getId()));
			doActivityComp.setAssessment(domAssmnt);
			factory.save(doActivityComp);	
			componentVo.setID_AssessmentComponent(doActivityComp.getId());
		}
		else if (componentVo instanceof AssessmentBladder)
		{
			AssessmentBladder voAssessBladder = (AssessmentBladder)componentVo;
			voAssessBladder.setAssessmentInfo(voAssessInfoColl);
			BladderComponent doBladderComp = AssessmentBladderAssembler.extractBladderComponent(factory, voAssessBladder);
			doBladderComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.BLADDER.getId()));
			doBladderComp.setAssessment(domAssmnt);
			factory.save(doBladderComp);
			componentVo.setID_AssessmentComponent(doBladderComp.getId());
		}
		else if (componentVo instanceof AssessmentBowels)
		{
			AssessmentBowels voAssessBowels = (AssessmentBowels)componentVo;
			voAssessBowels.setAssessmentInfo(voAssessInfoColl);
			BowelComponent doBowelComp = AssessmentBowelsAssembler.extractBowelComponent(factory, voAssessBowels);
			doBowelComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.BOWELS.getId()));
			doBowelComp.setAssessment(domAssmnt);
			factory.save(doBowelComp);
			componentVo.setID_AssessmentComponent(doBowelComp.getId());
		}
		else if (componentVo instanceof AssessmentBreathingVo)
		{
			AssessmentBreathingVo voAssessBreathing = (AssessmentBreathingVo)componentVo;
			voAssessBreathing.setAssessmentInfo(voAssessInfoColl);
			BreathingComponent doBreathComp = AssessmentBreathingVoAssembler.extractBreathingComponent(factory, voAssessBreathing);
			doBreathComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.BREATHING.getId()));
			doBreathComp.setAssessment(domAssmnt);
			factory.save(doBreathComp);
			componentVo.setID_AssessmentComponent(doBreathComp.getId());
		}			
		else if (componentVo instanceof AssessmentCommunication)
		{
			AssessmentCommunication voAssessComm = (AssessmentCommunication)componentVo;
			voAssessComm.setAssessmentInfo(voAssessInfoColl);
			CommunicationComponent doCommunComp = AssessmentCommunicationAssembler.extractCommunicationComponent(factory, voAssessComm);
			doCommunComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.COMMUNICATION.getId()));
			doCommunComp.setAssessment(domAssmnt);
			factory.save(doCommunComp);
			componentVo.setID_AssessmentComponent(doCommunComp.getId());
		}
		else if (componentVo instanceof AssessmentDressingAndGrooming)
		{
			AssessmentDressingAndGrooming voAssessDress = (AssessmentDressingAndGrooming)componentVo;
			voAssessDress.setAssessmentInfo(voAssessInfoColl);
			DressingandGroomingComponent doDressComp = AssessmentDressingAndGroomingAssembler.extractDressingandGroomingComponent(factory, voAssessDress);
			doDressComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.DRESSING.getId()));
			doDressComp.setAssessment(domAssmnt);
			factory.save(doDressComp);
			componentVo.setID_AssessmentComponent(doDressComp.getId());
		}
		else if (componentVo instanceof AssessmentEatingAndDrinking)
		{
			AssessmentEatingAndDrinking voAssessEat = (AssessmentEatingAndDrinking)componentVo;
			voAssessEat.setAssessmentInfo(voAssessInfoColl);
			EatingComponent doEatComp = AssessmentEatingAndDrinkingAssembler.extractEatingComponent(factory, voAssessEat);
			doEatComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.EATING.getId()));
			doEatComp.setAssessment(domAssmnt);
			factory.save(doEatComp);
			componentVo.setID_AssessmentComponent(doEatComp.getId());
		}
		else if (componentVo instanceof AssessmentEmotionalState)
		{
			AssessmentEmotionalState voAssessEmotion = (AssessmentEmotionalState)componentVo;
			voAssessEmotion.setAssessmentInfo(voAssessInfoColl);
			EmotionalStateComponent doEmotionComp = AssessmentEmotionalStateAssembler.extractEmotionalStateComponent(factory, voAssessEmotion);
			doEmotionComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.EMOTIONAL_STATE.getId()));
			doEmotionComp.setAssessment(domAssmnt);
			factory.save(doEmotionComp);
			componentVo.setID_AssessmentComponent(doEmotionComp.getId());
		}
		else if (componentVo instanceof AssessmentLeisure)
		{
			AssessmentLeisure voAssessLeisure = (AssessmentLeisure)componentVo;
			voAssessLeisure.setAssessmentInfo(voAssessInfoColl);
			LeisureComponent doLeisureComp = AssessmentLeisureAssembler.extractLeisureComponent(factory, voAssessLeisure);
			doLeisureComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.LEISURE.getId()));
			doLeisureComp.setAssessment(domAssmnt);
			factory.save(doLeisureComp);	
			componentVo.setID_AssessmentComponent(doLeisureComp.getId());
		}
		else if (componentVo instanceof AssessmentMobility)
		{
			AssessmentMobility voMobility = (AssessmentMobility)componentVo;
			voMobility.setAssessmentInfo(voAssessInfoColl);
			MobilityComponent doMobilityComp = AssessmentMobilityAssembler.extractMobilityComponent(factory, voMobility);				
			doMobilityComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.MOBILITY.getId()));
			doMobilityComp.setAssessment(domAssmnt);
			factory.save(doMobilityComp);	
			componentVo.setID_AssessmentComponent(doMobilityComp.getId());
		}
		else if (componentVo instanceof AssessmentPain)
		{
			AssessmentPain voPain = (AssessmentPain)componentVo;
			voPain.setAssessmentInfo(voAssessInfoColl);
			PainComponent doPainComp = AssessmentPainAssembler.extractPainComponent(factory, voPain);
			doPainComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.PAIN.getId()));
			doPainComp.setAssessment(domAssmnt);
			factory.save(doPainComp);	
			componentVo.setID_AssessmentComponent(doPainComp.getId());
		}
		else if (componentVo instanceof AssessmentPersonalHygiene)
		{
			AssessmentPersonalHygiene voHygiene = (AssessmentPersonalHygiene)componentVo;
			voHygiene.setAssessmentInfo(voAssessInfoColl);
			PersonalHygieneComponent doHygieneComp = AssessmentPersonalHygieneAssembler.extractPersonalHygieneComponent(factory, voHygiene);
			doHygieneComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.PERSONAL_HYGIENE.getId()));
			doHygieneComp.setAssessment(domAssmnt);
			factory.save(doHygieneComp);
			componentVo.setID_AssessmentComponent(doHygieneComp.getId());
		}
		else if (componentVo instanceof AssessmentSkin)
		{
			AssessmentSkin voSkin = (AssessmentSkin)componentVo;
			voSkin.setAssessmentInfo(voAssessInfoColl);
			SkinComponent doSkinComp = AssessmentSkinAssembler.extractSkinComponent(factory, voSkin);
			doSkinComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.SKIN.getId()));
			doSkinComp.setAssessment(domAssmnt);
			factory.save(doSkinComp);
			componentVo.setID_AssessmentComponent(doSkinComp.getId());
		}
		else if (componentVo instanceof AssessmentSleeping)
		{
			AssessmentSleeping voSleep = (AssessmentSleeping)componentVo;
			voSleep.setAssessmentInfo(voAssessInfoColl);
			SleepingComponent doSleepComp = AssessmentSleepingAssembler.extractSleepingComponent(factory, voSleep);		
			doSleepComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.SLEEPING.getId()));
			doSleepComp.setAssessment(domAssmnt);
			factory.save(doSleepComp);
			componentVo.setID_AssessmentComponent(doSleepComp.getId());
		}
		else if (componentVo instanceof AssessmentSpirituality)
		{
			AssessmentSpirituality voSpirit = (AssessmentSpirituality)componentVo;
			voSpirit.setAssessmentInfo(voAssessInfoColl);
			SpiritualityComponent doSpiritComp = AssessmentSpiritualityAssembler.extractSpiritualityComponent(factory, voSpirit);
//WDEV-3826			doSpiritComp.setComponentType(factory.getLookupInstance(doSpiritComp.getId(), AssessmentComponentType.SPIRITUALITY.getId()));
			doSpiritComp.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.SPIRITUALITY.getId()));
			doSpiritComp.setAssessment(domAssmnt);
			factory.save(doSpiritComp);	
			componentVo.setID_AssessmentComponent(doSpiritComp.getId());
		}
		else if (componentVo instanceof InfectionControlComponentVo)
		{
			InfectionControlComponentVo voInfectionControlComponent = (InfectionControlComponentVo)componentVo;
			voInfectionControlComponent.setAssessmentInfo(voAssessInfoColl);
			InfectionControlComponent doInfectionControlComponent = InfectionControlComponentVoAssembler.extractInfectionControlComponent(factory, voInfectionControlComponent);				
			doInfectionControlComponent.setComponentType(factory.getLookupInstance(AssessmentComponentType.TYPE_ID, AssessmentComponentType.INFECTION_CONTROL.getId()));
			doInfectionControlComponent.setAssessment(domAssmnt);
			factory.save(doInfectionControlComponent);	
			componentVo.setID_AssessmentComponent(doInfectionControlComponent.getId());
		}
		else
			throw new DomainRuntimeException("Invalid Component Instance Specified");
				
		// When saving the component, if the status is complete
		// we need to check for any other components with
		// a status incomplete.  If none found, we need to complete
		// the overall assessment
		if (domAssmnt.isAssessmentCompleted())
		{
			domAssmnt.setDateTimeComplete(new java.util.Date());				
			domAssmnt.setHCPComplete(HcpAssembler.extractHcp(factory,(ims.core.vo.Hcp)getHcpUser()));					
			domAssmnt.setAssessmentStatus(factory.getLookupInstance(AssessmentStatus.TYPE_ID, AssessmentStatus.COMPLETE.getId()));
		}
		factory.save(domAssmnt);
		ims.nursing.vo.AssessmentHeaderInfo header = AssessmentHeaderInfoAssembler.create(domAssmnt);
		componentVo.setAssessmentInfo(voAssessInfoColl);
		header.setCurrentComponent(componentVo);
		
		
		return header;
	}
private boolean wasAnotherComponentCreated(AdmissionAssessment domAssmnt,AssessmentComponentType componentType) {
		if (componentType == null)
			return false;
		String hql = "select count(ac.id) from AssessmentComponent as ac where	(ac.assessment.id = :acID and ac.componentType.id = :compType )";
		long count = getDomainFactory().countWithHQL(hql, new String[]{"acID","compType"}, new Object[]{domAssmnt.getId(),componentType.getId()});
		if (count > 0)
			return true;
		return false;
	}

	
	private AdmissionAssessment getAdmissionAssessment(CareContextRefVo careContext) {
		if (careContext == null || careContext.getID_CareContext() == null)
			throw new DomainRuntimeException("Invalid CareContextRefVo provided");
		String hql = "select aa from AdmissionAssessment as aa where (aa.careContext.id = :id)";
		List<?> domObjs = getDomainFactory().find(hql,"id",careContext.getID_CareContext());
		if (domObjs == null || domObjs.size() == 0)
			return null;
		return (AdmissionAssessment) domObjs.get(0);
	}
	public AssessmentComponent getLastAssessmentComponent(PatientShort patientVo, AssessmentComponentType componentTypeVo) 
	{
		DomainFactory factory = getDomainFactory();
		
		String hql1 =  "select asmntComp " +
		" from ims.nursing.assessment.domain.objects.AssessmentComponent asmntComp " +
		" where asmntComp.assessment.careContext.episodeOfCare.careSpell.patient.id = :idPatient" +
		" and asmntComp.componentType = :compType" +
		" order by asmntComp.id desc";
		
		java.util.List<?> components = factory.find(hql1, new String[]{"idPatient", "compType"}, new Object[]{patientVo.getID_Patient(), getDomLookup(componentTypeVo)});

		if ( components != null && ! components.isEmpty()) 
		{
			ims.nursing.assessment.domain.objects.AssessmentComponent comp = (ims.nursing.assessment.domain.objects.AssessmentComponent) components.get(0);
			AssessmentComponent copyComp = getComponent(AssessmentComponentAssembler.create(comp));
			copyComp.setAssessmentInfo(null);
			copyComp.setID_AssessmentComponent(null);
			return (copyComp);				
		}
		return null;
	}

	public AssessmentComponent getLastAssessmentComponent(PatientShort patientVo, CareContextRefVo careContextRefVo, AssessmentComponentType componentTypeVo) 
	{
	
		DomainFactory factory = getDomainFactory();
		
		String hql1 =  "select asmntComp " +
		" from ims.nursing.assessment.domain.objects.AssessmentComponent asmntComp " +
		" where asmntComp.assessment.careContext.episodeOfCare.careSpell.patient.id = :idPatient" +
		" and asmntComp.componentType = :compType" +
		" order by asmntComp.id desc";
		
		java.util.List<?> components = factory.find(hql1, new String[]{"idPatient", "compType"}, new Object[]{patientVo.getID_Patient(), getDomLookup(componentTypeVo)});

		if ( components != null && ! components.isEmpty()) 
		{
			ims.nursing.assessment.domain.objects.AssessmentComponent comp = (ims.nursing.assessment.domain.objects.AssessmentComponent) components.get(0);
			AssessmentComponent copyComp = getComponent(AssessmentComponentAssembler.create(comp));
			copyComp.setAssessmentInfo(null);
			copyComp.setID_AssessmentComponent(null);
			return (copyComp);				
		} 
		return null;			
	}
	
	
	public AssessmentComponent getComponent(AssessmentComponentRefVo voRefAssessComp)
	{
		DomainFactory factory = getDomainFactory();		
		ims.nursing.assessment.domain.objects.AssessmentComponent comp = (ims.nursing.assessment.domain.objects.AssessmentComponent) factory.getDomainObject(ims.nursing.assessment.domain.objects.AssessmentComponent.class, voRefAssessComp.getID_AssessmentComponent());
		
		if (comp instanceof AccommodationComponent)
			return AssessmentAccommodationAssembler.create((AccommodationComponent)comp);
		else if (comp instanceof ActivityLevelComponent)
			return AssessmentActivityLevelAssembler.create((ActivityLevelComponent)comp);
		else if (comp instanceof BladderComponent)
			return AssessmentBladderAssembler.create((BladderComponent)comp);
		else if (comp instanceof BowelComponent)
			return AssessmentBowelsAssembler.create((BowelComponent) comp);
		else if (comp instanceof BreathingComponent)
			return AssessmentBreathingVoAssembler.create((BreathingComponent)comp);
		else if (comp instanceof CommunicationComponent)
			return AssessmentCommunicationAssembler.create((CommunicationComponent) comp);
		else if (comp instanceof EatingComponent)
			return AssessmentEatingAndDrinkingAssembler.create((EatingComponent) comp);
		else if (comp instanceof DressingandGroomingComponent)
			return AssessmentDressingAndGroomingAssembler.create((DressingandGroomingComponent) comp);
		else if (comp instanceof LeisureComponent)
			return AssessmentLeisureAssembler.create((LeisureComponent) comp);
		else if (comp instanceof EmotionalStateComponent)
			return AssessmentEmotionalStateAssembler.create((EmotionalStateComponent) comp);
		else if (comp instanceof MobilityComponent)
			return AssessmentMobilityAssembler.create((MobilityComponent) comp);
		else if (comp instanceof PainComponent)
			return AssessmentPainAssembler.create((PainComponent) comp);
		else if (comp instanceof PersonalHygieneComponent)
			return AssessmentPersonalHygieneAssembler.create((PersonalHygieneComponent) comp);
		else if (comp instanceof SkinComponent)
			return AssessmentSkinAssembler.create((SkinComponent) comp);
		else if (comp instanceof SleepingComponent)
			return AssessmentSleepingAssembler.create((SleepingComponent) comp);
		else if (comp instanceof SpiritualityComponent)
			return AssessmentSpiritualityAssembler.create((SpiritualityComponent) comp);
		else if (comp instanceof InfectionControlComponent)
			return InfectionControlComponentVoAssembler.create((InfectionControlComponent) comp);
		else
		{	
			throw new DomainRuntimeException("Invalid Assessment Component Type Specified (" + comp.getComponentType().toString()+ ")in AssessmentComponentImpl.getComponent");
		}
	}

	public AssessmentComponent getComponent(AssessmentRefVo assessmentVo,AssessmentComponentType componentType) 
	{
		if (assessmentVo == null || assessmentVo.getID_Assessment() == null)
			throw new DomainRuntimeException("Invalid AdmissionAssessmentRefVo provided.");
		if (componentType == null)
			throw new DomainRuntimeException("Invalid AssessmentComponentType provided.");
		
		
		String hql ="select ac from AssessmentComponent as ac where (ac.assessment.id = :assId  and ac.componentType.id = :componentType and ac.isRIE is null)"; 
		
		List<?> find = getDomainFactory().find(hql,new String[]{"assId","componentType"},new Object[]{assessmentVo.getID_Assessment(),componentType.getId()});
		if (find == null || find.size() == 0)
			return null;
		Object comp = find.get(0);
		
		if (componentType.equals(AssessmentComponentType.ACCOMMODATION))
			return AssessmentAccommodationAssembler.create((AccommodationComponent)comp);
		
		if (componentType.equals(AssessmentComponentType.ACTIVITY_LEVEL))
			return AssessmentActivityLevelAssembler.create((ActivityLevelComponent)comp);
		
		if (componentType.equals(AssessmentComponentType.BLADDER))
			return AssessmentBladderAssembler.create((BladderComponent)comp);
		
		if (componentType.equals(AssessmentComponentType.BOWELS))
			return AssessmentBowelsAssembler.create((BowelComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.BREATHING))
			return AssessmentBreathingVoAssembler.create((BreathingComponent)comp);
		
		if (componentType.equals(AssessmentComponentType.COMMUNICATION))
			return AssessmentCommunicationAssembler.create((CommunicationComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.EATING))
			return AssessmentEatingAndDrinkingAssembler.create((EatingComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.DRESSING))
			return AssessmentDressingAndGroomingAssembler.create((DressingandGroomingComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.LEISURE))
			return AssessmentLeisureAssembler.create((LeisureComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.EMOTIONAL_STATE))
			return AssessmentEmotionalStateAssembler.create((EmotionalStateComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.MOBILITY))
			return AssessmentMobilityAssembler.create((MobilityComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.PAIN))
			return AssessmentPainAssembler.create((PainComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.PERSONAL_HYGIENE))
			return AssessmentPersonalHygieneAssembler.create((PersonalHygieneComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.SKIN))
			return AssessmentSkinAssembler.create((SkinComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.SLEEPING))
			return AssessmentSleepingAssembler.create((SleepingComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.SPIRITUALITY))
			return AssessmentSpiritualityAssembler.create((SpiritualityComponent) comp);
		
		if (componentType.equals(AssessmentComponentType.INFECTION_CONTROL))
			return InfectionControlComponentVoAssembler.create((InfectionControlComponent) comp);
			
		throw new DomainRuntimeException("Invalid Assessment Component Type Specified (" + componentType.toString() + ")in AssessmentComponentImpl.getComponent");
		
	}

	public AssessmentHeaderInfo getAssessment(CareContextRefVo careContextVo)
	{
		if (careContextVo == null || careContextVo.getID_CareContext()==null)
			throw new DomainRuntimeException("Invalid CareContextRefVo provided");
			
		String hql = "select aa from AdmissionAssessment as aa where (aa.careContext.id = :id and aa.isRIE is null )";
		List<?> list = getDomainFactory().find(hql,"id",careContextVo.getID_CareContext());
		if (list == null || list.size() == 0 )
			return null;
		return AssessmentHeaderInfoAssembler.create((AdmissionAssessment) list.get(0));
	}
}
