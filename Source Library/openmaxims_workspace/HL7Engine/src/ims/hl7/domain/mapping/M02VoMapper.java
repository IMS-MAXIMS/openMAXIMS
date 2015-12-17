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
package ims.hl7.domain.mapping;

import java.text.ParseException;

import org.apache.log4j.Logger;


import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AddressVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.GP;
import ims.core.vo.GpToPracticesVo;
import ims.core.vo.GpToPracticesVoCollection;
import ims.core.vo.LocSiteVo;
import ims.core.vo.LocSiteVoCollection;
import ims.core.vo.MedicVo;
import ims.core.vo.MemberOfStaffVo;
import ims.core.vo.NurseVo;
import ims.core.vo.OrganisationVo;
import ims.core.vo.OrganisationWithSitesVo;
import ims.core.vo.PersonAddress;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.TaxonomyMapCollection;
import ims.core.vo.TherapistVo;
import ims.core.vo.lookups.AddressType;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.GPStatus;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.MedicGrade;
import ims.core.vo.lookups.OrganisationType;
import ims.core.vo.lookups.StaffType;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.GPMessageQueueVo;
import ims.hl7.vo.MOSMessageQueueVo;
import ims.hl7.vo.ifGPMessageQueueVo;
import ims.hl7.vo.ifMOSMessageQueueVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.datatype.XAD;
import ca.uhn.hl7v2.model.v24.group.MFN_M02_MFESTFPRAORG;
import ca.uhn.hl7v2.model.v24.message.MFN_M02;
import ca.uhn.hl7v2.model.v24.segment.LOC;
import ca.uhn.hl7v2.model.v24.segment.MFE;
import ca.uhn.hl7v2.model.v24.segment.MFI;
import ca.uhn.hl7v2.model.v24.segment.PRA;
import ca.uhn.hl7v2.model.v24.segment.STF;

public class M02VoMapper extends VoMapper
{
	/**
	 * MFN_M02
	 * Consultants and GPs
	 */
	
	private static final Logger		LOG		= Logger.getLogger(M02VoMapper.class);


	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		// We need to first check whether this is a GP or a Consultant that we
		// are processing.  For GPs, we need to populate the GPVo, and
		// for consultants, we need to populate the Hcp Vo
		
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		try
		{
			if (isGPStaffType(msg))
			{
				try
				{
					processGP(msg,providerSystem);
				}
				catch(StaleObjectException soe)
				{
					try
					{
						System.out.println("Handeling SOE"+soe.getMessage());
						Thread.sleep(1000);
						processGP(msg,providerSystem);
					}
					catch(Exception ie)
					{
						this.errorCount++;
						ie.printStackTrace();
						//WDEV-20112
//						return HL7Utils.buildRejAck(msg.get("MSH"), "Exception. " + ie.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
						response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception. " + ie.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
						return response; //WDEV-20112
					}

				}
			}
			else
			{
				processMedic(msg,providerSystem);
			}
		}
		catch (Exception ex)
		{
			LOG.error(ex.getMessage(), ex);
			//WDEV-20112
//			return HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage( HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
	
	private void processMedic(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		MemberOfStaffVo mos = populateMOSVo(msg,providerSystem);
		saveMos(mos);
	}
	
	private void processGP(Message msg,ProviderSystemVo providerSystem) throws HL7Exception,StaleObjectException
	{
		GP gp = populateGPVo(msg,providerSystem);
		saveGP(gp);
	}
	
	private void saveMos(MemberOfStaffVo mos) throws HL7Exception 
	{
		try
		{
			String[] errors = mos.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation errors occurred for organisation. " + VoMapper.toDisplayString(errors));				
			}

			mosAdmin.saveMosVo(mos);
		}
		catch (StaleObjectException e)
		{
			LOG.error("StaleObjectException occurred saving Medic will retry save", e);
			throw new HL7Exception("MOS Data has been modified by another user/process - please retry", e);
		}
		catch (DomainInterfaceException e)
		{
			LOG.error("DomainInterfaceException occurred saving Medic will retry save", e);
			throw new HL7Exception("DomainInterfaceException occurred saving Medic will retry save", e);
		}
		catch (UniqueKeyViolationException e)
		{
			LOG.error("UniqueKeyViolationException occurred saving Medic will retry save", e);
			throw new HL7Exception("UniqueKeyViolationException occurred saving Medic will retry save", e);
		}
	}

	private void saveGP(GP gp) throws HL7Exception
	{
		try
		{
			String[] errors  = gp.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation errors found in GP Record - " + VoMapper.toDisplayString(errors));				
			}			
			gpAdmin.saveGp(gp);
		}
		catch (StaleObjectException e)
		{
			LOG.error("StaleobjectException occurred saving GP");
			throw new HL7Exception("GP Data has been modified by another user/process - please try again", e);
		}
		catch (UniqueKeyViolationException e)
		{
			LOG.error("UniqueKeyViolationException occurred saving GP");
			throw new HL7Exception(e.getMessage(), e);
		}
	}

	public boolean isGPStaffType(Message msg) throws HL7Exception
	{
		MFI mfi = (MFI) msg.get("MFI");
		if (mfi.getMasterFileIdentifier().getIdentifier().getValue().equals("PRA"))
			return true;
		else
			return false;
	}

	
	private MemberOfStaffVo populateMOSVo(Message msg, ProviderSystemVo providerSystem ) throws HL7Exception
	{
		MFN_M02_MFESTFPRAORG mfn_m02 = (MFN_M02_MFESTFPRAORG) msg.get("MFN_M02_MFESTFPRAORG");
	
		STF stf = mfn_m02.getSTF();
		PRA pra  = mfn_m02.getPRA();
		
		// Let's see if this Consultant already exists
		// The first is always the national code
		String nationalCode = pra.getPractitionerIDNumbers(0).getIDNumber().getValue();
		String pasCode = pra.getPractitionerIDNumbers(1).getIDNumber().getValue();
		if ((pasCode == null || pasCode.length() == 0) && (nationalCode == null || nationalCode.length() == 0))
		{
			throw new HL7Exception("Either the National Consultant Code or the PAS code must be supplied");
		}		

		MemberOfStaffVo mos = null;
		if (pasCode != null && pasCode.length() > 0)
		{
			//WDEV-20278
//			mos = mosAdmin.getMemberOfStaffByTaxonomyType(pasCode, TaxonomyType.PAS);			
			mos = mosAdmin.getMemberOfStaffByTaxonomyType(pasCode, providerSystem.getCodeSystem()); //WDEV-20278			
		}
		
		if (mos == null && nationalCode != null && nationalCode.length() > 0)
		{
			mos = mosAdmin.getMemberOfStaffByTaxonomyType(nationalCode, TaxonomyType.NAT_CONS_CODE);						
		}
		
		if (mos == null)
		{		
			mos = new MemberOfStaffVo();
			mos.setIsAppUser(Boolean.FALSE);
		}
		
		mos.setNationalConsCode(nationalCode);
		mos.setPasCode(pasCode);
		
		if (stf.getActiveInactiveFlag().getValue().equalsIgnoreCase("A"))
			mos.setIsActive(Boolean.TRUE);
		else
			mos.setIsActive(Boolean.FALSE);
		
		mos.setName(populateNameVoFromXPN(mos.getName(),stf.getStaffName(0),providerSystem));
		StaffType staffType=null;
		HcpDisType hcpDisType=null;
		
		if (stf.getStaffType().length>0) //http://jira/browse/WDEV-12712
		{
			staffType =(StaffType)svc.getLocalLookup(StaffType.class, StaffType.TYPE_ID, providerSystem.getCodeSystem().getText(), stf.getStaffType()[0].getValue()); 
			// staffType
			hcpDisType=(HcpDisType)svc.getLocalLookup(HcpDisType.class,HcpDisType.TYPE_ID,providerSystem.getCodeSystem().getText(), stf.getStaffType()[0].getValue());
		}
		HcpDisType parentDisType= hcpDisType;
		//Get the highest parent
		
		while (parentDisType!=null &&parentDisType.getParent()!=null)
		{
			parentDisType=parentDisType.getParent();
		}
		
		// if the type is a HCP create the HCP
		if(parentDisType!=null&&parentDisType.equals(HcpDisType.NURSING))
		{
			NurseVo nurse = new NurseVo();
			nurse.setHcpType(parentDisType);
			nurse.setNurseType(hcpDisType);
			mos.setHcp(nurse);
		}else if (parentDisType!=null&&parentDisType.equals(HcpDisType.THERAPY))
		{
			TherapistVo therapist = new TherapistVo();
			therapist.setHcpType(HcpDisType.THERAPY);
			therapist.setTherapistType(hcpDisType);
			mos.setHcp(therapist);
		}
		else if (parentDisType!=null&&parentDisType.equals(HcpDisType.MEDICAL))
		{
			MedicVo hcp = new MedicVo();
			hcp.setHcpType(HcpDisType.MEDICAL);
			hcp.setMedicType(hcpDisType);
			hcp.setGrade(MedicGrade.CONS);
			//http://jira/browse/WDEV-12609
			if (stf.getStaffType().length>2)
			{
				String referringConsultant =  stf.getStaffType()[2].getValue();
				if ("RP".equalsIgnoreCase(referringConsultant))
				{
					mos.setCanReferPatient(Boolean.TRUE);
				}
				else if(Hl7Null.equalsIgnoreCase(referringConsultant))
				{
					mos.setCanReferPatient(Boolean.FALSE);
				}
			}
			
			// WDEV-10999 InpatientHandling
			if (stf.getStaffType().length>1)
			{
				String inpatientHandling =  stf.getStaffType()[1].getValue();
				if ("IP".equalsIgnoreCase(inpatientHandling))
				{
					hcp.setInpatientHandling(Boolean.TRUE);
				}
				else if(Hl7Null.equalsIgnoreCase(inpatientHandling))
				{
					hcp.setInpatientHandling(Boolean.FALSE);
				}
			}
			mos.setHcp(hcp);
		}
		else if (parentDisType!=null&&parentDisType.equals(HcpDisType.OTHER))
		{
			MedicVo hcp = new MedicVo();
			hcp.setHcpType(hcpDisType);
			hcp.setMedicType(HcpDisType.OTHER);
			mos.setHcp(hcp);
		}
		
		else if (staffType!=null)
		{
			mos.setStaffType(staffType);
		}
		else
		{
			MedicVo hcp = (MedicVo) mos.getHcp();
			if (hcp == null)
			{
				hcp = new MedicVo();
				hcp.setHcpType(HcpDisType.MEDICAL);
				hcp.setGrade(MedicGrade.CONS);
			}
				//http://jira/browse/WDEV-12609
			if (stf.getStaffType().length>2)
			{
				String referringConsultant =  stf.getStaffType()[2].getValue();
				if ("RP".equalsIgnoreCase(referringConsultant))
				{
					mos.setCanReferPatient(Boolean.TRUE);
				}
				else if(Hl7Null.equalsIgnoreCase(referringConsultant))
				{
					mos.setCanReferPatient(Boolean.FALSE);
				}
			}

			// WDEV-10999 InpatientHandling
			if (stf.getStaffType().length>1)
			{
				String inpatientHandling =  stf.getStaffType()[1].getValue();
				if ("IP".equalsIgnoreCase(inpatientHandling))
				{
					hcp.setInpatientHandling(Boolean.TRUE);
				}
				else if(Hl7Null.equalsIgnoreCase(inpatientHandling))
				{
					hcp.setInpatientHandling(Boolean.FALSE);
				}
			}
			mos.setHcp(hcp);
		}
		
		// wdev-3965 Default StaffType if it is null at this stage
		if (!mos.getStaffTypeIsNotNull())
			mos.setStaffType(StaffType.HCP);
		
		if(mos!=null&&mos.getHcpIsNotNull())
		{
			mos.getHcp().setIsActive(mos.getIsActive());
			//http://jira/browse/WDEV-12609
			if (stf.getStaffType().length>2)
			{
				String referringConsultant =  stf.getStaffType()[2].getValue();
				if ("RP".equalsIgnoreCase(referringConsultant))
				{
					mos.setCanReferPatient(Boolean.TRUE);
				}
				else if(Hl7Null.equalsIgnoreCase(referringConsultant))
				{
					mos.setCanReferPatient(Boolean.FALSE);
				}
			}

		}
		mos.setCommChannels(populateCommsChannelVoCollectionFromXTN(stf.getPhone(), mos.getCommChannels()));
		
		return mos;
	}
	
	

	private GP populateGPVo(Message msg,ProviderSystemVo providerSystem) throws HL7Exception,StaleObjectException
	{
		MFN_M02_MFESTFPRAORG mfn_m02 = (MFN_M02_MFESTFPRAORG) msg.get("MFN_M02_MFESTFPRAORG");
		
		STF stf = mfn_m02.getSTF();
		String nationalCode = stf.getPrimaryKeyValueSTF().getIdentifier().getValue();
		String pasCode = stf.getStaffIDCode(1).getID().getValue();

		if ((pasCode == null || pasCode.length() == 0) && (nationalCode == null || nationalCode.length() == 0))
		{
			throw new HL7Exception("Either the National Consultant Code or the PAS code must be supplied");
		}		
		
		GP gpVo = gpAdmin.getGPByTaxonomyType(nationalCode, TaxonomyType.NAT_GP_CODE);
		
		if (gpVo == null && pasCode != null)  // Try by PAS CODE
			//WDEV-20278
			// gpVo = gpAdmin.getGPByTaxonomyType(pasCode, TaxonomyType.PAS);
			gpVo = gpAdmin.getGPByTaxonomyType(pasCode, providerSystem.getCodeSystem()); //WDEV-20278
		
		// GP Practices
		GpToPracticesVoCollection coll = new GpToPracticesVoCollection();

		if (gpVo == null)
			gpVo = new GP();
		else if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
			coll = gpVo.getPractices();			
		
			
		if (stf.getActiveInactiveFlag().getValue() != null)
		{
			if (stf.getActiveInactiveFlag().getValue().equalsIgnoreCase("A"))
				gpVo.setStatus(GPStatus.ACTIVE);
			else
				gpVo.setStatus(GPStatus.INACTIVE);
		}
		else
		{
			throw new HL7Exception("Active/Inactive flag must be supplied");
		}

		gpVo.setNationalCode(nationalCode);
		gpVo.setCommChannels(populateCommsChannelVoCollectionFromXTN(stf.getPhone(), gpVo.getCommChannels()));
		gpVo.setName(populateNameVoFromXPN(gpVo.getName(), stf.getStaffName(0),providerSystem));
		if(null!=stf.getEMailAddress(0).getValue())
		{
			gpVo.setEmailAddress(stf.getEMailAddress(0).getValue());
		}
		if (pasCode != null)
			//WDEV-20278
			//gpVo.setExternalCode(TaxonomyType.PAS, pasCode);
			gpVo.setExternalCode(providerSystem.getCodeSystem(), pasCode); //WDEV-20278

		// TODO check this out
		// Multiple practices seems to be handled funny with hapi
		// the second PRA and LOC segments have the number 2
		// appended on to them i.e. LOC2 - not really sure how to handle
		// this, but have created a method that will work and
		// probably needs to be sorted
		//Map practices = new HashMap();
		int i = 0;
		LOC loc = getNextLOC(mfn_m02, i);
		while (loc != null)
		{
			OrganisationVo orgVo = populatePracticeFromLOC(loc,mfn_m02.getPRA(),providerSystem);
			String segName = (i == 0) ? "LOC" : "LOC" + (i+1);
			int surgeryCount = mfn_m02.currentReps(segName);
			PRA pra  = mfn_m02.getPRA();
			for (int j = 0; j < surgeryCount; j++)
			{
				loc = (LOC) mfn_m02.get(segName, j);
				LocSiteVo siteVo = populateSurgeryFromSTForLOC(pra,loc, stf, orgVo,providerSystem);

				//WDEV-9447 - iterate through current collection to see if this Locsite is already there
				//if it is, compare all fields - if all equal add as normal, if not, delete and add as new one
				//this method will delete the surgery if it's there and modified.
				checkModifiedSurgery(orgVo.getLocationSites(),siteVo);		
				if(orgVo.getLocationSites().contains(siteVo))
				{
					orgVo.getLocationSites().remove(siteVo);
				}
				orgVo.getLocationSites().add(siteVo);				
				orgVo = saveOrganisation(orgVo);
				
			}
			
			//WDEV-9674
			if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
			{
				addOrRemoveLink(coll,pra,gpVo,orgVo,i,nationalCode);								
			}
			else
				linkGPtoPractice(coll,gpVo,orgVo,i,false);			
			
			//WDEV-9674
			//In Hearts, if GP has practices, it's active. end of story.
			if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
			{
				orgVo=updatePracticeStatus(orgVo); //http://jira/browse/WDEV-18379
				gpVo.setPractices(coll);
				gpVo = updateGpStatus(gpVo);
				
//				if(coll.size() > 0)
//					gpVo.setStatus(GPStatus.ACTIVE);
//				else
//					gpVo.setStatus(GPStatus.INACTIVE);
			}
			else
				gpVo.setStatus(GPStatus.ACTIVE);
			
			i++;
			loc = getNextLOC(mfn_m02, i);
		}

		gpVo.setPractices(coll);
		return gpVo;
	}
	
	/*
	 * checks the active status of all the contained surgeries and 
	 * updates the practice status
	 */
	private OrganisationVo updatePracticeStatus(OrganisationVo practiceVo)
	{
	if(practiceVo!=null&&practiceVo.getLocationSitesIsNotNull()&&practiceVo.getLocationSites().size()>0)
	{
		practiceVo.setIsActive(Boolean.FALSE); //inactive 
		for (LocSiteVo surgery : practiceVo.getLocationSites())
		{
			if(surgery.getIsActiveIsNotNull()&&surgery.getIsActive().equals(Boolean.TRUE))
			{
				practiceVo.setIsActive(Boolean.TRUE); // if there is an active surgery the practice is active
				break;
			}
		}
	}
	return practiceVo;
	}

	
	/*
	 * updates the GP status to active if linked to any active practices/surgeries
	 */
	private GP updateGpStatus(GP gp)
	{
		if(gp!=null)
		{
			gp.setStatus(GPStatus.INACTIVE);
			String gMCCode = gp.getNationalCode();
			if(gp.getPracticesIsNotNull()&&gp.getPractices().size()>0 &&gMCCode!=null)
			{
				for (GpToPracticesVo gpToPracticesVo : gp.getPractices())
				{
					if(gpToPracticesVo.getPracticeIsNotNull()&&gpToPracticesVo.getPractice().getIsActive()!=null&&gpToPracticesVo.getPractice().getIsActive())
					{
						if(gpToPracticesVo.getPractice().getLocationSitesIsNotNull()&&gpToPracticesVo.getPractice().getLocationSites().size()>0)
						{
							for (LocSiteVo surgery : gpToPracticesVo.getPractice().getLocationSites()) {
								if(surgery.getIsActiveIsNotNull() && 
										surgery.getIsActive().equals(Boolean.TRUE)&&
										surgery.getPasCode()!=null&&
										gMCCode!=null&&
										gMCCode.trim()!=null&&
										surgery.getPasCode().toUpperCase().matches("\\S+_"+gMCCode.trim().toUpperCase()+"_\\S+")) //http://jira/browse/WDEV-15535 changed filter from PAS to GMC 
								{
									gp.setStatus(GPStatus.ACTIVE);
									break;
								}
							}
						}
					}
				}
			}
		}
		return gp;
	}
	
	
	private boolean containsSurgeryForGp(OrganisationWithSitesVo practice, String gMCCode)
	{
		if(practice != null 
				&&practice.getLocationSitesIsNotNull()&&practice.getLocationSites().size()>0)
		{
			for (LocSiteVo surgery : practice.getLocationSites()) {
				if(surgery.getIsActiveIsNotNull() && 
						surgery.getIsActive().equals(Boolean.TRUE)&&
						surgery.getPasCode()!=null&&
						gMCCode!=null&&
						gMCCode.trim()!=null&&
						surgery.getPasCode().toUpperCase().matches("\\S+_"+gMCCode.trim().toUpperCase()+"_\\S+")) //http://jira/browse/WDEV-15535 changed filter from PAS to GMC 
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	private boolean containsPrimary(GpToPracticesVoCollection coll)
	{
		if (coll!=null)
		{
			for (GpToPracticesVo gpToPracticesVo : coll)
			{
				if(gpToPracticesVo.getIsPrimaryPracticeIsNotNull()
						&&gpToPracticesVo.getIsPrimaryPractice().equals(Boolean.TRUE))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	private void addOrRemoveLink(GpToPracticesVoCollection coll, PRA pra, GP gpVo, OrganisationVo practiceVo, int i,String gpNatCode) throws HL7Exception
	{
		boolean bSetPrimary = false;
		boolean bLinked = false;
		
		String practiceNatCode = pra.getPractitionerGroup(0).getIdentifier().getValue();
		if (pra.getPractitionerCategory().length > 0 && pra.getPractitionerCategory(0).getValue().equalsIgnoreCase("M")) bSetPrimary = true;
		
		DateTime dateLeft = null;
		
		try
		{			
			//find this practice from the linked practices collection, and remove the link if it's there.
			//if it's not there, check date, and create the link if appropriate
		
			if (pra.getDateLeftPractice().getValue() != null)
				dateLeft = new DateTime(pra.getDateLeftPractice().getValue());
			
			DateTime today = new DateTime();
			int j;
			if (coll == null)
				coll = new GpToPracticesVoCollection();
				
			for (j = 0; j < coll.size(); j++)
			{
				if (coll.get(j).getPracticeIsNotNull() && coll.get(j).getPractice().getCodeMappingsIsNotNull())
				{									
					if (coll.get(j).getPractice().getNationalLocCode() != null 
							&& coll.get(j).getPractice().getNationalLocCode().equals(practiceNatCode))
					{
						bLinked = true;
						break;
					}
				}
			}
			
			if (bLinked && dateLeft != null && dateLeft.isLessOrEqualThan(today)) //if in collection and not active any more -- remove
			{
				coll.get(j).setPractice(practiceVo); //http://jira/browse/WDEV-12049 caused a SOE
				if(!containsSurgeryForGp(practiceVo,gpNatCode))
				{
					coll.remove(j); //remove if not hearts!
				}
				if(!containsPrimary(coll)&&coll.size()>0)
				{
					coll.get(0).setIsPrimaryPractice(Boolean.TRUE);
				}
			}
			else if ( (dateLeft == null || dateLeft.isGreaterThan(today)))
			{
				if (!bLinked)
					linkGPtoPractice(coll,gpVo,practiceVo,i,bSetPrimary);
				else
				{
					coll.get(j).setPractice(practiceVo);
					coll.get(j).setIsPrimaryPractice(bSetPrimary);
					// http://jira/browse/WDEV-12050 set all the others to not primary if this is primary
					if(bSetPrimary)
					{
					for (int k=0;k<coll.size();k++)
						{
							if(k!=j)
							{
								coll.get(k).setIsPrimaryPractice(false);
							}
						}
					}
					// end http://jira/browse/WDEV-12050
						
				}
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new HL7Exception("Parse error in PRA segment (using HEARTS_GP_MODEL) " + e.getMessage());
		}		
	}

	private void linkGPtoPractice(GpToPracticesVoCollection coll, GP gpVo, OrganisationVo orgVo, int i, boolean bSetPrimary) throws HL7Exception,StaleObjectException
	{
		
		orgVo = saveOrganisation(orgVo);		
				
		GpToPracticesVo link = new GpToPracticesVo();
		link.setGp(gpVo);
		link.setPractice(orgVo);

		if (bSetPrimary) //only HEARTS behaviour will set this
		{
			link.setIsPrimaryPractice(true);
			for (int j = 0; j < coll.size(); j++)
				coll.get(j).setIsPrimaryPractice(false);			
		}
		else if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == false)
		{
			// set the first practice to primary
			if (i == 0)
				link.setIsPrimaryPractice(true);
			else
				link.setIsPrimaryPractice(false);
		}
		coll.add(link);
	}

	private OrganisationVo saveOrganisation(OrganisationVo orgVo) throws HL7Exception,StaleObjectException
	{
		String[] errors = orgVo.validate();
		if (errors != null)
		{
			throw new HL7Exception("Validation errors before save of GP Practice Org. " + VoMapper.toDisplayString(errors));				
		}			
		try
		{
			orgVo = orgLoc.saveOrganisation(orgVo);
		}
		catch (UniqueKeyViolationException e)
		{
			LOG.error("UniqueKeyViolationException occurred saving GP Practice " + e.getMessage(), e);
			throw new HL7Exception("UniqueKeyViolationException occurred saveLocationSite " + e.getMessage(), e);
		}
		return orgVo;
	}

	private void checkModifiedSurgery(LocSiteVoCollection locationSites, LocSiteVo siteVo)
	{
		for (int i = 0; i < locationSites.size(); i++)
		{
			LocSiteVo vo =locationSites.get(i); 
			if (vo.equals(siteVo))
			{				
				if (vo.getAddress() == null) vo.setAddress(new PersonAddress());
				
				if (!siteVo.getAddressIsNotNull() || //msg surgery will be null if all fields cleared with HL7Null ("")
				!adrLinesEqual(vo.getAddress().getLine1(),siteVo.getAddress().getLine1()) ||						
				!adrLinesEqual(vo.getAddress().getLine2(),siteVo.getAddress().getLine2()) ||
				!adrLinesEqual(vo.getAddress().getLine3(),siteVo.getAddress().getLine3()) || 
				!adrLinesEqual(vo.getAddress().getLine4(),siteVo.getAddress().getLine4()) || 
				!adrLinesEqual(vo.getAddress().getLine5(),siteVo.getAddress().getLine5()) ||
				!adrLinesEqual(vo.getAddress().getPostCode(),siteVo.getAddress().getPostCode()	)
				||
				vo.getAddress().getCountyIsNotNull() && !vo.getAddress().getCounty().equals(siteVo.getAddress().getCounty())
				)
				{
					vo.setAddress(siteVo.getAddress());
					vo.setName(siteVo.getName());
				}
				setCommsChannels(vo.getCommChannels(),siteVo.getCommChannels());				
			}
		}
	}

	private void setCommsChannels(CommChannelVoCollection commChannelsExisting, CommChannelVoCollection commChannelsMsg)
	{
		if (commChannelsMsg == null) return; //nothing to do
		
		int idx = findWorkPhone(commChannelsMsg);
		if(idx == -1) return;
		
		String newVal = commChannelsMsg.get(idx).getCommValue();
		CommChannelVo vo = new CommChannelVo();		
		vo.setChannelType(ChannelType.WORK_PHONE);
		vo.setCommValue(newVal);
		
		
		if (commChannelsExisting != null)
		{
			idx = findWorkPhone(commChannelsExisting);
			
			if (newVal.equals(Hl7Null))
			{
				if(idx != -1) commChannelsExisting.remove(idx);
			}
			else
			{			
				if(idx == -1 ) 							
					commChannelsExisting.add(vo);
				else
					commChannelsExisting.set(idx, vo);
			}
		}
		else if (!newVal.equals(Hl7Null)) 
		{
			commChannelsExisting = new CommChannelVoCollection();			
			commChannelsExisting.add(vo);
		}
		return;
	}
	

	private int findWorkPhone(CommChannelVoCollection commChannels)
	{
		int ix = -1;
		for (int i = 0; i < commChannels.size(); i++)
		{
			if (commChannels.get(i).getChannelTypeIsNotNull() && commChannels.get(i).getChannelType().equals(ChannelType.WORK_PHONE))
			{								
				ix = i;
				break;
			}
		}
		return ix;		
	}

	private boolean adrLinesEqual(String line1, String line2)
	{
		if (line1 != null && line2 != null)
		{
			if (line2.equals(Hl7Null))
				return false;
			else if (line1.equals(line2)) 
				return true;
		}
		else if (line1 == null && line2 == null)
			return true;
		
		return false;		
	}

	private LOC getNextLOC(MFN_M02_MFESTFPRAORG msg, int instance)
	{
		try
		{
			String instanceVal="LOC";
			if (instance > 0)
				instanceVal = "LOC" + (instance + 1);
			LOC loc = (LOC) msg.get(instanceVal);
			return loc;
		}
		catch (HL7Exception e)
		{
			// No more instances found, return null
			return null;
		}
	}
	
	private OrganisationVo populatePracticeFromLOC(LOC loc,PRA pra,ProviderSystemVo providerSystem) throws HL7Exception
	{
		String practiceCode = loc.getPrimaryKeyValueLOC().getPointOfCare().getValue();
		
		// wdev-11515 - Reject Message if practiceCode is null or HL7Null
		if (practiceCode == null || practiceCode.equals(Hl7Null))
		{
			throw new HL7Exception("National Location Code (LOC-1#0) Invalid or Null - Message Rejected");
		}
		// wdev-11515 end
		
		boolean newPractice=false;
		OrganisationVo practiceVo = orgLoc.getOrganisationByTaxonomyType(practiceCode, TaxonomyType.NAT_LOC_CODE);
		if (practiceVo == null)
		{
			newPractice=true;
			practiceVo = new OrganisationVo();
			practiceVo.setIsActive(Boolean.TRUE);
			practiceVo.setType(OrganisationType.GPP);
			practiceVo.setCodeMappings(new TaxonomyMapCollection());
			TaxonomyMap map = new TaxonomyMap();
			map.setTaxonomyCode(practiceCode);
			map.setTaxonomyName(TaxonomyType.NAT_LOC_CODE);
			practiceVo.getCodeMappings().add(map);
			practiceVo.setLocationSites(new LocSiteVoCollection());
			//http://jira/browse/WDEV-18379
			if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
			{
				DateTime dateLeft=null;
				if (pra.getDateLeftPractice().getValue() != null)
				{
					try 
					{
						dateLeft = new DateTime(pra.getDateLeftPractice().getValue());
					} catch (ParseException e)
					{
						e.printStackTrace();
						throw new HL7Exception("Error parsing PRA-10 (Date Left Practice)");
					}
					DateTime today = new DateTime();
					if(dateLeft != null && dateLeft.isLessOrEqualThan(today))
					{
						practiceVo.setIsActive(Boolean.FALSE);
					}
					else
					{
						practiceVo.setIsActive(Boolean.TRUE);
					}
				}
				else
				{
					practiceVo.setIsActive(Boolean.TRUE);
				}
			}
		}	
		if (pra.getDateLeftPractice().getValue()==null||newPractice) //http://jira/browse/WDEV-12049
		{
			if(ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true) //Hearts does not hold the pratctice name
			{
				String practiceName = getPracticeNameFromAddress(loc.getLocationAddress(0));
				if(practiceName !=null) //http://jira/browse/WDEV-18795
				{
					practiceVo.setName(practiceName);
				}
				
				if(practiceVo.getName() ==null)
				{
					throw new HL7Exception("Practice Name is a Mandatory field");
				}
//				practiceVo.setName(practiceName);
			}
			else
			{
				if (loc.getLocationDescription().getValue()==null||loc.getLocationDescription().getValue().equals(Hl7Null))
				{
					throw new HL7Exception("Practice Name (Location Description, LOC-2) is Mandatory");
				}
				practiceVo.setName(loc.getLocationDescription().getValue());
			}
			practiceVo.setAddress(populateAddressVoFromXAD(practiceVo.getAddress(), loc.getLocationAddress(0),providerSystem, AddressType.ORGANISATION));
			if (practiceVo.getAddress() != null)
			{
				practiceVo.getAddress().setPhone(loc.getLocationPhone(0).getAnyText().getValue());
				practiceVo.getAddress().setAddressType(AddressType.PRACTICE);
				
				// WDEV-16839 If the Address PCT/CCG value is set, set it at this root level too
				if (practiceVo.getAddress().getPCTIsNotNull())
					practiceVo.setPctCode(practiceVo.getAddress().getPCT());
			}

			//WDEV-9447
			practiceVo.setCommChannels(populateCommChannels(loc,null));

		} //end http://jira/browse/WDEV-12049
		return practiceVo;
	}
	
	private String getPracticeNameFromAddress(XAD xad)
	{
		if(xad!=null)
		{
			String line = xad.getStreetAddress().getStreetOrMailingAddress().getValue();
			if (line != null && !line.equals(Hl7Null))
				return line;
			line = xad.getOtherDesignation().getValue();
			if (line != null && !line.equals(Hl7Null))
				return line;
			line = xad.getCity().getValue();
			if (line != null && !line.equals(Hl7Null))
				return line;
			line = xad.getStateOrProvince().getValue();
			if (line != null && !line.equals(Hl7Null))
				return line;
			line = xad.getOtherGeographicDesignation().getValue();
			if (line != null && !line.equals(Hl7Null))
				return line;
		}
		return null;
	}
	
	private CommChannelVoCollection populateCommChannels(LOC loc, STF stf) throws HL7Exception
	{
		CommChannelVoCollection commChannels = null;
		
		if (loc != null && loc.getLocationPhone(0).getAnyText().getValue() != null && !loc.getLocationPhone(0).getAnyText().getValue().equals(Hl7Null))
		{
			commChannels = new CommChannelVoCollection();
			CommChannelVo voCommChannel = new CommChannelVo(); 
			voCommChannel.setChannelType(ChannelType.WORK_PHONE);		
			voCommChannel.setCommValue(loc.getLocationPhone(0).getAnyText().getValue());
			commChannels.add(voCommChannel);
		}
		else if (stf != null && stf.getPhone(0).getAnyText().getValue() != null && !stf.getPhone(0).getAnyText().getValue().equals(Hl7Null))
		{
			commChannels = new CommChannelVoCollection();
			CommChannelVo voCommChannel = new CommChannelVo(); 
			voCommChannel.setChannelType(ChannelType.WORK_PHONE);
			voCommChannel.setCommValue(stf.getPhone(0).getAnyText().getValue());			
			commChannels.add(voCommChannel);
		}
		return commChannels; 
	}
	
	private LocSiteVo populateSurgeryFromSTForLOC(PRA pra,LOC loc, STF stf, OrganisationVo parentOrg,ProviderSystemVo providerSystem) throws HL7Exception
	{
		String practiceCode = loc.getPrimaryKeyValueLOC().getPointOfCare().getValue();
		String surgeryCode = loc.getPrimaryKeyValueLOC().getComponent(0).getExtraComponents().getComponent(0).getData().toString();
		String practiceSurgeryCode = practiceCode + "_" + surgeryCode;

		//WDEV-20278
//		LocSiteVo surgery = orgLoc.getLocSiteByTaxonomyType(practiceSurgeryCode, TaxonomyType.PAS);
		LocSiteVo surgery = orgLoc.getLocSiteByTaxonomyType(practiceSurgeryCode, providerSystem.getCodeSystem()); //WDEV-20278
		if (surgery == null)
		{
			surgery = new LocSiteVo();
			surgery.setIsActive(Boolean.TRUE);
			surgery.setType(LocationType.SURGERY);
			surgery.setCodeMappings(new TaxonomyMapCollection());
			TaxonomyMap map = new TaxonomyMap();
			map.setTaxonomyCode(practiceSurgeryCode);
			//WDEV-20278
//			map.setTaxonomyName(TaxonomyType.PAS);
			map.setTaxonomyName(providerSystem.getCodeSystem()); //WDEV-20278
			surgery.getCodeMappings().add(map);
			surgery.setIsVirtual(Boolean.FALSE);
			surgery.setAddress(new PersonAddress());

		}			
		surgery.setName(loc.getLocationDescription().getValue() + " - Surgery " + surgeryCode);
		if (surgery.getAddress() == null)
			surgery.setAddress(new PersonAddress());
		
		//WDEV-9447
		//if office address provided in STF segment, use that for surgery, otherwise use the LOC details.
		if (stf.getOfficeHomeAddress().length > 0)
		{
			surgery.setAddress(populateAddressVoFromXAD(surgery.getAddress(), stf.getOfficeHomeAddress(0),providerSystem, AddressType.SURGERY));
			if (surgery.getAddressIsNotNull()) //address may have been cleared/blanked
				surgery.getAddress().setPhone(stf.getPhone(0).getAnyText().getValue());
			surgery.setCommChannels(populateCommChannels(null,stf));				
		}
		else if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() != true) // Never update the Surgery from the LOC address for HEARTS WDEV-18378
		{
			surgery.setAddress(populateAddressVoFromXAD(surgery.getAddress(), loc.getLocationAddress(0),providerSystem, AddressType.SURGERY));
			if (surgery.getAddressIsNotNull()) //address may have been cleared/blanked
				surgery.getAddress().setPhone(loc.getLocationPhone(0).getAnyText().getValue());
			surgery.setCommChannels(populateCommChannels(loc,null));				
		}
		if(surgery.getAddressIsNotNull())
		{
			surgery.getAddress().setAddressType(AddressType.SURGERY);
		}
		if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
		{
			DateTime dateLeft=null;
			if (pra.getDateLeftPractice().getValue() != null)
			{
				try 
				{
					dateLeft = new DateTime(pra.getDateLeftPractice().getValue());
				} catch (ParseException e)
				{
					e.printStackTrace();
					throw new HL7Exception("Error parsing PRA-10 (Date Left Practice)");
				}
				DateTime today = new DateTime();
				if(dateLeft != null && dateLeft.isLessOrEqualThan(today))
				{
					surgery.setIsActive(Boolean.FALSE);
				}
				else
				{
					surgery.setIsActive(Boolean.TRUE);
					parentOrg.setIsActive(Boolean.TRUE);
				}
			}
			else
			{
				surgery.setIsActive(Boolean.TRUE);
				parentOrg.setIsActive(Boolean.TRUE);
			}
		}
		surgery.setParentOrganisation(parentOrg);
		return surgery;
	}
	
	//WDEV-19576
	public Message populateMessage(IHL7OutboundMessageHandler event) throws Exception
	{
		LOG.debug("M02VoMapper populateMessage: entry");
		MFN_M02 message = new MFN_M02();
		MFI mfi = message.getMFI();
		MFE mfe = message.getMFN_M02_MFESTFPRAORG().getMFE();
		STF stf = message.getMFN_M02_MFESTFPRAORG().getSTF();
		PRA pra = message.getMFN_M02_MFESTFPRAORG().getPRA();
		
		if(event instanceof GPMessageQueueVo)
		{
			GPMessageQueueVo feedVo = (GPMessageQueueVo)event;
			ifGPMessageQueueVo gPDetails = adt.getGPMessageQueueDetails(feedVo);
			
			//MFI-1 Master file identifier (CE) 
			mfi.getMasterFileIdentifier().getIdentifier().setValue("PRA");

			//MFI-4 Entered Date Time (ST)
			if(gPDetails != null
					&& gPDetails.getSystemInformation() != null
					&& gPDetails.getSystemInformation().getLastupdateDateTime() != null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(gPDetails.getSystemInformation().getLastupdateDateTime().toString(DateTimeFormat.ISO));
			}
			else if(gPDetails != null
					&& gPDetails.getSystemInformation() != null
					&& gPDetails.getSystemInformation().getCreationDateTime() != null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(gPDetails.getSystemInformation().getCreationDateTime().toString(DateTimeFormat.ISO));
			}

			//MFE-1 Record Level Event Code (ID) 
			//[MAD for new record, MUP for updated record]
			mfe.getRecordLevelEventCode().setValue("MAD");
			if(gPDetails != null
					&& gPDetails.getSystemInformation() != null 
					&& gPDetails.getSystemInformation().getLastupdateDateTime()!=null)
				mfe.getRecordLevelEventCode().setValue("MUP");

			//MFE-4 Primary key value (Varies) 
			//[All MemberOfStaff code mappings as repeating fields]
			TaxonomyMapCollection codeMappings = gPDetails.getCodeMappings();
			if(codeMappings != null)
			{
				for (int i=0; i<codeMappings.size(); i++)
				{
					CE type = new CE();
					if(codeMappings.get(i).getTaxonomyCode() != null 
							&& codeMappings.get(i).getTaxonomyCode().length() > 0
							&& codeMappings.get(i).getTaxonomyName().getText() != null
							&& codeMappings.get(i).getTaxonomyName().getText().length() > 0)
					{
						type.getIdentifier().setValue(codeMappings.get(i).getTaxonomyCode());
						type.getText().setValue(codeMappings.get(i).getTaxonomyName().getText());
						mfe.getPrimaryKeyValueMFE(i).setData(type);
					}
				}
			}
			
			//STF-1 Primary key value (CE)
			//PRA-1 Primary key value (CE)
			if(codeMappings != null)
			{
				for (TaxonomyMap taxonomyMap : codeMappings)
				{
					if(taxonomyMap.getTaxonomyCode() != null
						&& taxonomyMap.getTaxonomyCode().length() > 0
						&& taxonomyMap.getTaxonomyName().equals(TaxonomyType.NAT_GP_CODE))
					{
						stf.getPrimaryKeyValueSTF().getIdentifier().setValue(taxonomyMap.getTaxonomyCode().toString());
						stf.getPrimaryKeyValueSTF().getNameOfCodingSystem().setValue(taxonomyMap.getTaxonomyName().toString());
						pra.getPrimaryKeyValuePRA().getIdentifier().setValue(taxonomyMap.getTaxonomyCode());
						pra.getPrimaryKeyValuePRA().getText().setValue(taxonomyMap.getTaxonomyName().toString());
						break;
					}
				}
			}
			
			//STF-2 Staff ID code (CX) 
			//[Repeating field all GP code mappings]
			if(codeMappings!=null)
			{
				for (int i=0; i<codeMappings.size(); i++)
				{
					if(codeMappings.get(i).getTaxonomyName() != null
						&& codeMappings.get(i).getTaxonomyName().getText().length() > 0
						&& codeMappings.get(i).getTaxonomyCode() != null
						&& codeMappings.get(i).getTaxonomyCode().length() > 0)
					{
						stf.getStaffIDCode(i).getID().setValue(codeMappings.get(i).getTaxonomyCode());
						stf.getStaffIDCode(i).getIdentifierTypeCode().setValue(codeMappings.get(i).getTaxonomyName().toString());
					}
				}
			}
			
			//STF-3 Staff name (XPN)
			if(gPDetails != null
					&& gPDetails.getName() !=null)
			{
				renderNameVoToXPN(gPDetails.getName(), stf.getStaffName(0), event.getProviderSystem());
			}

			//STF-4 Staff type (IS)
			stf.getStaffType(0).setValue("GP");

			//STF-7 Active/inactive flag (ID)
			if(gPDetails != null
					&& gPDetails.getStatus() !=null 
					&& gPDetails.getStatus().getId()==GPStatus.ACTIVE.getID())
			{
				stf.getActiveInactiveFlag().setValue("A");
			}
			else stf.getActiveInactiveFlag().setValue("I");
						
			//STF-10 Phone (XTN)
			if(gPDetails != null
					&& gPDetails.getCommChannelsIsNotNull())
			{
				int comChannelCount = 0;
				
				for (int i=0; i<gPDetails.getCommChannels().size(); i++)
				{
					CommChannelVo commVo = gPDetails.getCommChannels().get(i);
					
					if(commVo.getCommValue() != null && commVo.getCommValue().length() > 0)
					{
						if(commVo.getChannelType().equals(ChannelType.EMAIL))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("NET");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("Internet");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}
							
						else if(commVo.getChannelType().equals(ChannelType.MOBILE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("ORN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("CP");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());						
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.GEN_PHONE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("PRN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());						
							comChannelCount++;
						}
	
						else if(commVo.getChannelType().equals(ChannelType.HOME_PHONE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("PRN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.FAX))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("FX");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
	
						else if(commVo.getChannelType().equals(ChannelType.WORK_PHONE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.BLEEP))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("BPN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("BP");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}

					}
				}
			}						
			
			//STF-11 Office/home address (XAD)
//			if(gPDetails != null
//					&& gPDetails.getPractices() != null
//					&& gPDetails.getPractices().get(0) != null
//					&& gPDetails.getPractices().get(0).getPractice() != null
//					&& gPDetails.getPractices().get(0).getPractice().getAddress() != null)
//			{
//				AddressVo addressVo = gPDetails.getPractices().get(0).getPractice().getAddress();
//				if(addressVo!=null)
//				{
//					 renderOrgAddressVoToXAD(addressVo, stf.getOfficeHomeAddress(0), event.getProviderSystem());
//				}
//			}
			//WDEV-20039 Ensure that M02VoMapper traps empty GP practices collection
//			if(gPDetails.getPractices() != null)
			if(gPDetails != null
				&& gPDetails.getPractices() != null) //WDEV-20039
			{
				int addressIterator = 0; //WDEV-22691
				for (int i=0; i<gPDetails.getPractices().size(); i++)
				{
					if(gPDetails.getPractices().get(i) != null
						&& gPDetails.getPractices().get(i).getPractice() != null
						&& gPDetails.getPractices().get(i).getPractice().getAddress() != null)
						{
							AddressVo addressVo = gPDetails.getPractices().get(i).getPractice().getAddress();
							//WDEV-22691
//							if(addressVo != null)
//								renderOrgAddressVoToXAD(addressVo, stf.getOfficeHomeAddress(i), event.getProviderSystem());
							if (addressVo != null)
							{
								renderOrgAddressVoToXAD(addressVo, stf.getOfficeHomeAddress(addressIterator), event.getProviderSystem());
								addressIterator++;
							} //WDEV-22691
						}
				}
			}
		

			//PRA-2 Practitioner group (CE) 
			//[Repeating list of Practice National Codes where GP works - external code type is NAT_LOC_CODE]
			// Note: Possible for there to be multiple mappings per practice. Hence the loop within a loop!
			if(gPDetails != null
					&& gPDetails.getPractices() != null)
			{
				int pracGroupIterator = 0; //WDEV-22691
				for (int i=0; i<gPDetails.getPractices().size(); i++)
				{
//					if(gPDetails.getPractices().get(i).getPractice().getCodeMappings() != null) //WDEV-22597
					if (gPDetails.getPractices().get(i).getPractice() != null
							&& gPDetails.getPractices().get(i).getPractice().getCodeMappings() != null)
					{
						for (int j=0; j<gPDetails.getPractices().get(i).getPractice().getCodeMappings().size(); j++)
						{
							TaxonomyMap codeMapping = gPDetails.getPractices().get(i).getPractice().getCodeMappings().get(j);
							if(codeMapping.getTaxonomyCode() != null
									&& codeMapping.getTaxonomyCode().length() > 0
									&& codeMapping.getTaxonomyName().equals(TaxonomyType.NAT_LOC_CODE))
							{
								// WDEV-22691
//								pra.getPractitionerGroup(i).getIdentifier().setValue(codeMapping.getTaxonomyCode());
//								pra.getPractitionerGroup(i).getNameOfCodingSystem().setValue(codeMapping.getTaxonomyName().toString());
								pra.getPractitionerGroup(pracGroupIterator).getIdentifier().setValue(codeMapping.getTaxonomyCode());
								pra.getPractitionerGroup(pracGroupIterator).getNameOfCodingSystem().setValue(codeMapping.getTaxonomyName().toString());
								pracGroupIterator ++; //WDEV-22691
							}							
						}
					}
				}
			}

			//PRA-3 Practitioner category  (IS)
			pra.getPractitionerCategory(0).setValue("GP");

		}
		
		
		
		
		else if(event instanceof MOSMessageQueueVo)
		{
			MOSMessageQueueVo feedVo = (MOSMessageQueueVo)event;
			ifMOSMessageQueueVo mosDetails = adt.getMOSMessageQueueDetails(feedVo);
			
			//MFI-1 Master file identifier (CE) 
			mfi.getMasterFileIdentifier().getIdentifier().setValue("STF");

			//MFI-4 Entered date/time (TS)
			if(mosDetails.getSystemInformation().getLastupdateDateTime()!= null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(mosDetails.getSystemInformation().getLastupdateDateTime().toString(DateTimeFormat.ISO));
			}
			else if(mosDetails.getSystemInformation().getCreationDateTime() != null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(mosDetails.getSystemInformation().getCreationDateTime().toString(DateTimeFormat.ISO));
			}
			
			//MFE-1 Record Level Event Code (ID) [MAD for new, MUP for update]
			mfe.getRecordLevelEventCode().setValue("MAD");
			if(mosDetails.getSystemInformation().getLastupdateDateTime() != null)
				mfe.getRecordLevelEventCode().setValue("MUP");

			//MFE-4 Primary key value0 (Varies) 
			//[All MemberOfStaff code mappings as repeating fields]
			TaxonomyMapCollection codeMappings = mosDetails.getCodeMappings();
			if(codeMappings != null)
			{
				for (int i=0; i<codeMappings.size(); i++)
				{
					CE type = new CE();
					if(codeMappings.get(i).getTaxonomyCode() != null 
							&& codeMappings.get(i).getTaxonomyCode().length() > 0
							&& codeMappings.get(i).getTaxonomyName() != null
							&& codeMappings.get(i).getTaxonomyName().getText().length() > 0)
					{
						type.getIdentifier().setValue(codeMappings.get(i).getTaxonomyCode());
						type.getText().setValue(codeMappings.get(i).getTaxonomyName().getText());
						mfe.getPrimaryKeyValueMFE(i).setData(type);
					}
				}
			}
	
			//STF-1 Primary key value (CE)
			if(codeMappings != null)
			{
				for (TaxonomyMap taxonomyMap : codeMappings)
				{
					if(taxonomyMap.getTaxonomyCode() != null
							&& taxonomyMap.getTaxonomyCode().length() > 0
							&& taxonomyMap.getTaxonomyName().equals(TaxonomyType.NAT_CONS_CODE))
					{
						stf.getPrimaryKeyValueSTF().getIdentifier().setValue(taxonomyMap.getTaxonomyCode().toString());
						stf.getPrimaryKeyValueSTF().getNameOfCodingSystem().setValue(taxonomyMap.getTaxonomyName().toString());
						break;
					}
				}
			}
			
			//STF-2 Staff ID code (CX)
			if(codeMappings != null)
			{
				for (int i=0; i<codeMappings.size(); i++)
				{
					if(codeMappings.get(i).getTaxonomyCode() != null 
							&& codeMappings.get(i).getTaxonomyCode().length() > 0
							&& codeMappings.get(i).getTaxonomyName() != null
							&& codeMappings.get(i).getTaxonomyName().getText().length() > 0)
					{
						stf.getStaffIDCode(i).getID().setValue(codeMappings.get(i).getTaxonomyCode().toString());
						stf.getStaffIDCode(i).getIdentifierTypeCode().setValue(codeMappings.get(i).getTaxonomyName().getText());
					}
				}
			}

			//STF-3 Staff name (XPN)
			if(mosDetails.getName() != null)
			{
				renderNameVoToXPN(mosDetails.getName(), stf.getStaffName(0), event.getProviderSystem());
			}
			
			//STF-4 Staff type (IS)
			if(mosDetails.getHcpTypeIsNotNull())
			{
				stf.getStaffType(0).setValue(svc.getRemoteLookup(mosDetails.getHcpType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			//WDEV-21148
//			else if(mosDetails.getStaffType().getID() > 0)
			else if(mosDetails.getStaffTypeIsNotNull()
					&& mosDetails.getStaffType().getID() > 0)
			{
				stf.getStaffType(0).setValue(svc.getRemoteLookup(mosDetails.getStaffType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}

			//STF-7 Active/inactive flag (ID)
			if(mosDetails.getIsActive() !=null && mosDetails.getIsActive().toString().equalsIgnoreCase("TRUE"))
			{
				stf.getActiveInactiveFlag().setValue("A");
			}
			else stf.getActiveInactiveFlag().setValue("I");

		
			//STF-10 Phone  (XTN)
			if(mosDetails.getCommChannels() != null)
			{
				int comChannelCount = 0;
				
				for (int i=0; i<mosDetails.getCommChannels().size(); i++)
				{
					CommChannelVo commVo = mosDetails.getCommChannels().get(i);
					
					if(commVo.getCommValue() != null && commVo.getCommValue().length() > 0)
					{
						if(commVo.getChannelType().equals(ChannelType.EMAIL))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("NET");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("Internet");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}
							
						else if(commVo.getChannelType().equals(ChannelType.MOBILE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("ORN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("CP");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());						
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.GEN_PHONE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("PRN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());						
							comChannelCount++;
						}
	
						else if(commVo.getChannelType().equals(ChannelType.HOME_PHONE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("PRN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.FAX))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("FX");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
	
						else if(commVo.getChannelType().equals(ChannelType.WORK_PHONE))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.BLEEP))
						{
							stf.getPhone(comChannelCount).getTelecommunicationUseCode().setValue("BPN");
							stf.getPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("BP");
							stf.getPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}

					}
				}
			}
		}
		
				
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"MFN","M02");

		//MFI-2 Master File Application Identifier (HD)
		//[same as MSH-3 Sending Application] 
		if(message.getMSH().getSendingApplication().getNamespaceID().getValue().length() > 0 
				&& message.getMSH().getSendingApplication().getNamespaceID() != null)
		{
			mfi.getMasterFileApplicationIdentifier().getNamespaceID().setValue(message.getMSH().getSendingApplication().getNamespaceID().getValue());
		}
		
		//MFI-3 File Level Event Code (ID)
		mfi.getFileLevelEventCode().setValue("UPD");
		
		//MFI-6 Response level code (ID)
		mfi.getResponseLevelCode().setValue("NE");
		
		//MFE-5 Primary key value (ID)
		mfe.getPrimaryKeyValueType(0).setValue("CE");
		
		return message;

	}

	@Override
	public Message populateMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}


}
