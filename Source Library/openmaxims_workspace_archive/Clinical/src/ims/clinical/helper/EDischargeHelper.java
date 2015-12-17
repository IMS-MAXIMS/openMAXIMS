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
package ims.clinical.helper;

import ims.admin.helper.Keywords;
import ims.clinical.vo.DischargeDetailsVoCollection;
import ims.clinical.vo.TTAMedicationAndPharmacyVo;
import ims.clinical.vo.TTAMedicationAndPharmacyVoCollection;
import ims.clinical.vo.TTAMedicationDetailVo;
import ims.clinical.vo.domain.DischargeDetailsVoAssembler;
import ims.clinical.vo.domain.TTAMedicationAndPharmacyVoAssembler;
import ims.clinical.vo.lookups.DischargeLetterStatus;
import ims.clinical.vo.lookups.EDischargeSummarySection;
import ims.clinical.vo.lookups.EDischargeSummarySectionStatus;
import ims.clinical.vo.lookups.TTAStatus;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.clinical.domain.objects.Medication;
import ims.core.resource.people.domain.objects.Hcp;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.MedicationLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.domain.HcpLiteVoAssembler;
import ims.core.vo.domain.MedicationLiteVoAssembler;
import ims.core.vo.domain.MemberOfStaffLiteVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.domain.impl.DomainImpl;
import ims.edischarge.domain.objects.DischargeDetails;
import ims.edischarge.domain.objects.Summary;
import ims.edischarge.domain.objects.SummaryDetail;
import ims.edischarge.domain.objects.TTAMedicationAndPharmacy;
import ims.edischarge.vo.SummaryRefVo;
import ims.framework.exceptions.CodingRuntimeException;
import ims.vo.interfaces.IEDischargeSummary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author dlaffan
 * methods common across the Edischarge Implementations
 */
public class EDischargeHelper extends DomainImpl implements IEDischargeHelper
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	/**
	* get Discharge Details
	*/
	public ims.clinical.vo.DischargeDetailsVo getDischargeDetails(ims.core.admin.vo.CareContextRefVo careContextRefvo)
	{
		if(careContextRefvo == null)
			throw new CodingRuntimeException("careContextRefVo Filter not provided for list call. ");

		if(careContextRefvo != null)
		{
			DomainFactory factory = getDomainFactory();
			StringBuffer hql = new StringBuffer(" from DischargeDetails dd where "); 
			String andStr = " ";
		
			ArrayList<String> markers = new ArrayList<String>();
			ArrayList<Serializable> values = new ArrayList<Serializable>();
		
			hql.append(andStr + " dd.careContext.id = :careContextId");
 			markers.add("careContextId");
			values.add(careContextRefvo.getID_CareContext());
			andStr = " and ";	

			List list = factory.find(hql.toString(), markers,values);
			if(list != null && list.size() > 0)
			{ 
				DischargeDetailsVoCollection voColl = DischargeDetailsVoAssembler.createDischargeDetailsVoCollectionFromDischargeDetails(list);
				if(voColl != null && voColl.size() > 0)
					return voColl.get(0);
			}
		}
		return null;
	}

	/**
	* saveDischargeDetails
	*/
	public ims.clinical.vo.DischargeDetailsVo saveDischargeDetails(ims.clinical.vo.DischargeDetailsVo voDischargeDetails) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		if(voDischargeDetails == null)
			throw new CodingRuntimeException("DischargeDetailsVo is null");
		
		if(!voDischargeDetails.isValidated())
			throw new CodingRuntimeException("DischargeDetailsVo Value Object has not been validated");

		DomainFactory factory = getDomainFactory();
		DischargeDetails doDD = DischargeDetailsVoAssembler.extractDischargeDetails(factory, voDischargeDetails);

		factory.save(doDD);
		return DischargeDetailsVoAssembler.create(doDD);
	}
	
	public TTAMedicationAndPharmacyVo getTTAMedicationAndPharmacy(CareContextRefVo careContextRefvo) 
	{		
		if(careContextRefvo == null)
			throw new CodingRuntimeException("CareContextRefVo is null");

		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from TTAMedicationAndPharmacy tta where tta.careContext.id = :careContextId"); 

		ArrayList<String> markers = new ArrayList<String>();
		markers.add("careContextId");
		
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		values.add(careContextRefvo.getID_CareContext());
		
		List list = factory.find(hql.toString(), markers,values);
		if(list != null && list.size() > 0)
		{ 
				TTAMedicationAndPharmacyVoCollection voColl = TTAMedicationAndPharmacyVoAssembler.createTTAMedicationAndPharmacyVoCollectionFromTTAMedicationAndPharmacy(list);
				if(voColl != null && voColl.size() > 0)
					return voColl.get(0);
		}
		
		return null;
	}

	public HcpLiteVo getHcp(HcpRefVo voRef) 
	{
		if(voRef == null || voRef.getID_Hcp() == null)
			throw new CodingRuntimeException("HcpRefVo is null or id not provided for getHcp");
		
		return HcpLiteVoAssembler.create((Hcp)getDomainFactory().getDomainObject(voRef));
	}
	
	public MemberOfStaffLiteVo getMemberOfStaff(MemberOfStaffRefVo voRef) 
	{
		if(voRef == null || voRef.getID_MemberOfStaff() == null)
			throw new CodingRuntimeException("MemberOfStaffRefVo is null or id not provided for getHcp");
		
		return MemberOfStaffLiteVoAssembler.create((MemberOfStaff)getDomainFactory().getDomainObject(voRef));
	}

	/**
	 * WDEV-12688
	 * Function used to save a TTA Medication & Pharmacy record
	 * For the TTA Medication Details it will automatically create Medication records (with Keywords) 
	 */
	public TTAMedicationAndPharmacyVo save(TTAMedicationAndPharmacyVo record, SummaryRefVo summary) throws StaleObjectException, DomainInterfaceException, UniqueKeyViolationException 
	{
		if (!record.isValidated())
			throw new CodingRuntimeException("TTAMedicationAndPharmacyVo is not validated");

		DomainFactory factory = getDomainFactory();

		if (record.getTTAMedicationsIsNotNull())
		{			
			// Create a hash map used to commit to database unsaved medication records (because they are marked as RefVo in the VO)
			// Do not use IDs - as the records might be brand new so ID would be null, use TTAMedicationDetailVo record, the impact
			// on performance should be minimal as these objects already exist.
			HashMap<TTAMedicationDetailVo, Medication> medicationMap = new HashMap<TTAMedicationDetailVo, Medication>();

			for (int i = 0; i < record.getTTAMedications().size(); i++) 
			{
				TTAMedicationDetailVo 	ttaMedication = record.getTTAMedications().get(i);				
				MedicationLiteVo 		medication 	  = ttaMedication.getMedication();
				
				// If the medication ID is -1 then it means that the Medication records has not been registered
				// in the database, so record we need to record it separately before saving TTA Medication & Pharmacy record
				// and then link it to appropriate TTA Medication Detail record (because it is marked as a RefVo)
				if ( medication != null && medication.getID_MedicationIsNotNull() && medication.getID_Medication() < 0)
				{
					// Set medication as active and set ID to null
					medication.setID_Medication(null);
					medication.setIsActive(true);
					
					// Extract Medication domain object
					Medication domMedication = MedicationLiteVoAssembler.extractMedication(factory, medication);
					// Generate keywords for Medication domain object
					if (domMedication.getKeywords() == null || domMedication.getKeywords().size() == 0)
						domMedication.setKeywords(Keywords.setupKeyWords(domMedication.getKeywords(), domMedication.getMedicationName()));		
					if (domMedication.getKeywords().size() <= 0)
						throw new DomainInterfaceException("No keywords were created. Please amend Medication name.");		
					
					try
					{
						// Save Medication record - do not commit to database yet
						// (DO NOT call assembler on these domain objects until all have been saved to session)
						factory.save(domMedication);
					}
					catch (UnqViolationUncheckedException e) 
					{
						// Revert Medication records ID to -1 value (if the ID is null, otherwise leave it as it is)
						// This is done to avoid a Null Pointer Exception when editing the Medication record in TTA or Pharmacy tab
						for (int reverseIndex = i; reverseIndex >= 0; reverseIndex--)
						{
							TTAMedicationDetailVo ttaMedicationRevert = record.getTTAMedications().get(reverseIndex);
							MedicationLiteVo medicationRevert = ttaMedicationRevert.getMedication();
							
							if (medicationRevert != null && !medicationRevert.getID_MedicationIsNotNull())
								medicationRevert.setID_Medication(Integer.valueOf(-1));
						}
						
						// Throw exception & terminate function
						throw new UniqueKeyViolationException(e);
					}

					// After each successful save to session of a Medication record, add the record to hash map
					medicationMap.put(ttaMedication, domMedication);
				}
			}
			
			// After all Medication records are saved to database, use the hash map to extract Medication VO
			// and link them to corresponding TTA Medication Detail record (after the TTA Medication Detail ID - the key on hash map)
			for (int i = 0; i < record.getTTAMedications().size(); i++)
			{
				// For each TTA Medication Detail record retrieve based on the ID the corresponding
				// Medication domain object
				TTAMedicationDetailVo ttaMedication = record.getTTAMedications().get(i);
				Medication domMedication = medicationMap.get(ttaMedication);
				
				// If a Medication domain object is found then link it to TTA Medication Detail record
				if (domMedication != null)
					ttaMedication.setMedication(MedicationLiteVoAssembler.create(domMedication));
			}
		}

		// Save the TTA Medication & Pharmacy record
		TTAMedicationAndPharmacy doTTAMedicationAndPharmacy = TTAMedicationAndPharmacyVoAssembler.extractTTAMedicationAndPharmacy(factory, record);
		factory.save(doTTAMedicationAndPharmacy);
		
		// Update Summary
		if (record.getCurrentTTAStatusIsNotNull() && record.getCurrentTTAStatus().getStatusIsNotNull())
		{
			updateSummary(summary, record.getCurrentTTAStatus().getStatus());
		}		
		
		return TTAMedicationAndPharmacyVoAssembler.create(doTTAMedicationAndPharmacy);
	}	

	private void updateSummary(SummaryRefVo summary, TTAStatus status) throws ims.domain.exceptions.StaleObjectException
	{
		if(summary == null || status == null)
			return;
		
		DomainFactory factory = getDomainFactory();
		Summary doSummary = (Summary)factory.getDomainObject(summary);
		if (getDomLookup(DischargeLetterStatus.GENERATED).equals(doSummary.getDischargeLetterStatus()))
			throw new StaleObjectException(null);
		doSummary.setTTAStatus(getDomLookup(status));
		
		factory.save(doSummary);			
	}
	
	public MedicationLiteVo saveMedication(MedicationLiteVo medication) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException 
	{
		DomainFactory factory = getDomainFactory();
		
		Medication domMedication = MedicationLiteVoAssembler.extractMedication(factory, medication);
		
		if (domMedication.getKeywords() == null || domMedication.getKeywords().size() == 0)
			domMedication.setKeywords(Keywords.setupKeyWords(domMedication.getKeywords(), domMedication.getMedicationName()));		
		if (domMedication.getKeywords().size() <= 0)
			throw new DomainInterfaceException("No keywords were created. Please amend Medication name.");		
		
		factory.save(domMedication);
		
		return MedicationLiteVoAssembler.create(domMedication);
		
	}
	
	public ims.framework.utils.Date getEstimatedDischargeDate(SummaryRefVo summary)
	{
		if(summary == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" select summary.estimatedDischargeDate from Summary as summary where summary.id = :summaryId ");
		ArrayList<String> markers = new ArrayList<String>();
		markers.add("summaryId");
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		values.add(summary.getID_Summary());
		
		List list = factory.find(hql.toString(), markers,values);
		if(list != null && list.size() > 0)
		{
			return new ims.framework.utils.DateTime((java.util.Date)list.get(0)).getDate(); 
		}
		
		return null;
	}
	
	public void updateSummaryIfRequired(IEDischargeSummary record, SummaryRefVo summary, DomainFactory factory) throws ims.domain.exceptions.StaleObjectException
	{
		if(summary == null)
			return;
		
		boolean updateRequired = false;
		Summary doSummary = (Summary)factory.getDomainObject(summary);
		/*
		 * If in the meantime the Discharge Letter has been generated than it's a SOE
		 */
		if (getDomLookup(DischargeLetterStatus.GENERATED).equals(doSummary.getDischargeLetterStatus()))
			throw new StaleObjectException(null);
		SummaryDetail doSummaryDetail = (SummaryDetail) doSummary.getSummaryDetails().get(findDetailRecordForType(doSummary.getSummaryDetails(),record.getIEDischargeSummarySection()));
		if(record.getIEDischargeSummaryIsComplete())
		{
			updateRequired = true;
			doSummaryDetail.setProgressStatus(getDomLookup(EDischargeSummarySectionStatus.COMPLETED));
		}
		else
		{
			updateRequired = true;
			doSummaryDetail.setProgressStatus(getDomLookup(EDischargeSummarySectionStatus.IN_PROGRESS));
		}
		
		if(updateRequired)
			factory.save(doSummaryDetail);
	}
	
	private int findDetailRecordForType(List summaryDetails, EDischargeSummarySection section) throws StaleObjectException
	{
		for(int i=0; i<summaryDetails.size(); i++)
		{
			SummaryDetail doSummDetail = (SummaryDetail) summaryDetails.get(i);
			if(doSummDetail.getSection().equals(getDomLookup(section)))
				return i;
		}
		
		//Actually this is a stale. Meaning that somebody else removed that type from additional info
		//throw new CodingRuntimeException("Summary Detail record not instantiated for " + section.getText());
		throw new StaleObjectException(null);
	}
}
