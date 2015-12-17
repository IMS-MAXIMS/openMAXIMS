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
package ims.hl7.domain.mapping;

import org.apache.log4j.Logger;

import ims.configuration.gen.ConfigFlag;
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
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.group.MFN_M02_MFESTFPRAORG;
import ca.uhn.hl7v2.model.v24.segment.LOC;
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


	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		// We need to first check whether this is a GP or a Consultant that we
		// are processing.  For GPs, we need to populate the GPVo, and
		// for consultants, we need to populate the Hcp Vo
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
						return HL7Utils.buildRejAck(msg.get("MSH"), "Exception. " + ie.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
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
			return HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;	
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
			mos = mosAdmin.getMemberOfStaffByTaxonomyType(pasCode, TaxonomyType.PAS);			
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
			gpVo = gpAdmin.getGPByTaxonomyType(pasCode, TaxonomyType.PAS);
			
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
			gpVo.setExternalCode(TaxonomyType.PAS, pasCode);

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
			OrganisationVo orgVo = populateOrganisationFromLOC(loc,mfn_m02.getPRA(),providerSystem);
			String segName = (i == 0) ? "LOC" : "LOC" + (i+1);
			int surgeryCount = mfn_m02.currentReps(segName);
			for (int j = 0; j < surgeryCount; j++)
			{
				loc = (LOC) mfn_m02.get(segName, j);
				LocSiteVo siteVo = populateLocSiteFromLOC(loc, stf, orgVo,providerSystem);

				//WDEV-9447 - iterate through current collection to see if this Locsite is already there
				//if it is, compare all fields - if all equal add as normal, if not, delete and add as new one
				//this method will delete the surgery if it's there and modified.
				checkModifiedSurgery(orgVo.getLocationSites(),siteVo);				
				orgVo.getLocationSites().add(siteVo);				
				orgVo = saveOrganisation(orgVo);
				
			}
			
			//WDEV-9674
			if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
			{
				//PRA[10] (Date Left practice determines if we've to de-activet/remove the link)				
				PRA pra  = mfn_m02.getPRA();				
				addOrRemoveLink(coll,pra,gpVo,orgVo,i);								
			}
			else
				linkGPtoPractice(coll,gpVo,orgVo,i,false);			
			
			//WDEV-9674
			//In Hearts, if GP has practices, it's active. end of story.
			if (ConfigFlag.HL7.HEARTS_GP_MODEL.getValue() == true)
			{
				if(coll.size() > 0)
					gpVo.setStatus(GPStatus.ACTIVE);
				else
					gpVo.setStatus(GPStatus.INACTIVE);
			}
			else
				gpVo.setStatus(GPStatus.ACTIVE);
			
			i++;
			loc = getNextLOC(mfn_m02, i);
		}

		gpVo.setPractices(coll);
		return gpVo;
	}
	
	private void addOrRemoveLink(GpToPracticesVoCollection coll, PRA pra, GP gpVo, OrganisationVo orgVo, int i) throws HL7Exception
	{
		boolean bSetPrimary = false;
		boolean bLinked = false;
		
		String natCode = pra.getPractitionerGroup(0).getIdentifier().getValue();
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
					if (coll.get(j).getPractice().getNationalLocCode() != null && coll.get(j).getPractice().getNationalLocCode().equals(natCode))
					{
						bLinked = true;
						break;
					}
				}
			}
			if (bLinked && dateLeft != null && dateLeft.isLessOrEqualThan(today))
			{
				coll.get(j).setPractice(orgVo); //http://jira/browse/WDEV-12049 caused a SOE
				coll.remove(j);
			}
			else if ( (dateLeft == null || dateLeft.isGreaterThan(today)))
			{
				if (!bLinked)
					linkGPtoPractice(coll,gpVo,orgVo,i,bSetPrimary);
				else
				{
					coll.get(j).setPractice(orgVo);
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
//		catch (StaleObjectException e)
//		{
//			LOG.error("GP Practice has been modified by another user/process - please try again");
//			throw new HL7Exception("LocationSite has been modified by another user/process - please try again", e);
//		}
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
	
	private OrganisationVo populateOrganisationFromLOC(LOC loc,PRA pra,ProviderSystemVo providerSystem) throws HL7Exception
	{
		String practiceCode = loc.getPrimaryKeyValueLOC().getPointOfCare().getValue();
		
		// wdev-11515 - Reject Message if practiceCode is null or HL7Null
		if (practiceCode == null || practiceCode.equals(Hl7Null))
		{
			throw new HL7Exception("National Location Code (LOC-1#0) Invalid or Null - Message Rejected");
		}
		// wdev-11515 end
		
		
		OrganisationVo vo = orgLoc.getOrganisationByTaxonomyType(practiceCode, TaxonomyType.NAT_LOC_CODE);
		if (vo == null)
		{
			vo = new OrganisationVo();
			vo.setIsActive(Boolean.TRUE);
			vo.setType(OrganisationType.GPP);
			vo.setCodeMappings(new TaxonomyMapCollection());
			TaxonomyMap map = new TaxonomyMap();
			map.setTaxonomyCode(practiceCode);
			map.setTaxonomyName(TaxonomyType.NAT_LOC_CODE);
			vo.getCodeMappings().add(map);
			vo.setLocationSites(new LocSiteVoCollection());
		}	
		if (pra.getDateLeftPractice().getValue()==null) //http://jira/browse/WDEV-12049
		{
			if (loc.getLocationDescription().getValue()==null||loc.getLocationDescription().getValue().equals(Hl7Null))
			{
				throw new HL7Exception("Practice Name (Location Description, LOC-2) is Mandatory");
			}
			vo.setName(loc.getLocationDescription().getValue());
			vo.setAddress(populateAddressVoFromXAD(vo.getAddress(), loc.getLocationAddress(0),providerSystem, AddressType.ORGANISATION));
			if (vo.getAddress() != null)
			{
				vo.getAddress().setPhone(loc.getLocationPhone(0).getAnyText().getValue());
				vo.getAddress().setAddressType(AddressType.PRACTICE);
				
				// WDEV-16839 If the Address PCT/CCG value is set, set it at this root level too
				if (vo.getAddress().getPCTIsNotNull())
					vo.setPctCode(vo.getAddress().getPCT());
			}
			//WDEV-9447
			vo.setCommChannels(populateCommChannels(loc,null));

		} //end http://jira/browse/WDEV-12049
		return vo;
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
	
	private LocSiteVo populateLocSiteFromLOC(LOC loc, STF stf, OrganisationVo parentOrg,ProviderSystemVo providerSystem) throws HL7Exception
	{
		String practiceCode = loc.getPrimaryKeyValueLOC().getPointOfCare().getValue();
		String surgeryCode = loc.getPrimaryKeyValueLOC().getComponent(0).getExtraComponents().getComponent(0).getData().toString();
		String practiceSurgeryCode = practiceCode + "_" + surgeryCode;
	
		LocSiteVo vo = orgLoc.getLocSiteByTaxonomyType(practiceSurgeryCode, TaxonomyType.PAS);
		if (vo == null)
		{
			vo = new LocSiteVo();
			vo.setIsActive(Boolean.TRUE);
			vo.setType(LocationType.SURGERY);
			vo.setCodeMappings(new TaxonomyMapCollection());
			TaxonomyMap map = new TaxonomyMap();
			map.setTaxonomyCode(practiceSurgeryCode);
			map.setTaxonomyName(TaxonomyType.PAS);
			vo.getCodeMappings().add(map);
			vo.setIsVirtual(Boolean.FALSE);
			vo.setAddress(new PersonAddress());

		}			
		vo.setName(loc.getLocationDescription().getValue() + " - Surgery " + surgeryCode);
		if (vo.getAddress() == null)
			vo.setAddress(new PersonAddress());
		
		//WDEV-9447
		//if office address provided in STF segment, use that for surgery, otherwise use the LOC details.
		if (stf.getOfficeHomeAddress().length > 0)
		{
			vo.setAddress(populateAddressVoFromXAD(vo.getAddress(), stf.getOfficeHomeAddress(0),providerSystem, AddressType.SURGERY));
			if (vo.getAddressIsNotNull()) //address may have been cleared/blanked
				vo.getAddress().setPhone(stf.getPhone(0).getAnyText().getValue());
			vo.setCommChannels(populateCommChannels(null,stf));				
		}
		else
		{
			vo.setAddress(populateAddressVoFromXAD(vo.getAddress(), loc.getLocationAddress(0),providerSystem, AddressType.SURGERY));
			if (vo.getAddressIsNotNull()) //address may have been cleared/blanked
				vo.getAddress().setPhone(loc.getLocationPhone(0).getAnyText().getValue());
			vo.setCommChannels(populateCommChannels(loc,null));				
		}
		if(vo.getAddressIsNotNull())
		{
			vo.getAddress().setAddressType(AddressType.SURGERY);
		}
		
		vo.setParentOrganisation(parentOrg);
		return vo;
	}
	
	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

}
