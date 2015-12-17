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
package ims.core.helper;


import org.apache.log4j.Logger;

import ims.core.vo.CommChannelVo;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.NationalHealthCoverVo;
import ims.core.vo.PDSAddrVo;
import ims.core.vo.PDSAddrVoCollection;
import ims.core.vo.PDSCommChannelRemovedVo;
import ims.core.vo.PDSCommChannelRemovedVoCollection;
import ims.core.vo.PDSNamesRemovedVo;
import ims.core.vo.PDSNamesRemovedVoCollection;
import ims.core.vo.PDSPatientUpdateVo;
import ims.core.vo.PDSRelativeRemoveVo;
import ims.core.vo.PDSRelativeRemoveVoCollection;
import ims.core.vo.PatRelative;
import ims.core.vo.PatRelativeCollection;
import ims.core.vo.Patient;
import ims.core.vo.PatientContactPreferenceVo;
import ims.core.vo.PatientId;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonAddressCollection;
import ims.core.vo.PersonName;
import ims.core.vo.PersonNameCollection;
import ims.core.vo.lookups.AddressType;
import ims.core.vo.lookups.PDSUpdateMode;
import ims.domain.DomainInterface;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;

public class PdsPatientUpdateHelper
{
	private static final Logger LOG = Logger.getLogger(PdsPatientUpdateHelper.class);

	protected DomainInterface domain;
	
	public PdsPatientUpdateHelper(DomainInterface domain)
	{
		this.domain = domain;
	}

	public void setPatientUpdateFields(Patient patient, Patient orginalPatient)
	{
		// WDEV-21883 - PDS Update Mode, SCN to be set to zero if any of the fields below are set, otherwise it needs to be set to the value from PDS if updating locally from PDS
		boolean updateFound=false;
		
		//patient name
		if(!patient.getName().pdsEquals(orginalPatient.getName()))
		{
			if(orginalPatient.getName() == null || patient.getName().getObjectidentifier() == null)
				patient.getName().setPdsUpdateMode(PDSUpdateMode.ADDED);
			else
				patient.getName().setPdsUpdateMode(PDSUpdateMode.ALTERED);
			updateFound=true;
		}
		

		//patient address
		if(!patient.getAddress().pdsEquals(orginalPatient.getAddress()))
		{
			if(orginalPatient.getAddress() == null || patient.getAddress().getObjectidentifier() == null)
				patient.getAddress().setPdsUpdateMode(PDSUpdateMode.ADDED);
			else
				patient.getAddress().setPdsUpdateMode(PDSUpdateMode.ALTERED);
			updateFound=true;
		}
		
		//communication channels
		if(patient.getCommChannelsIsNotNull() && patient.getCommChannels().size() > 0)
		{
			for(CommChannelVo commChannel :  patient.getCommChannels())
			{
				if(commChannel.getObjectidentifier() == null)
				{
					commChannel.setPdsUpdateMode(PDSUpdateMode.ADDED);
					updateFound=true;
				}
				else
				{
					CommChannelVo originalCommChannel = getCommChannelByObjectIdentifier(commChannel.getObjectidentifier(), orginalPatient.getCommChannels());
					
					if(originalCommChannel != null)
					{
						if(!commChannel.pdsEquals(originalCommChannel))
						{
							commChannel.setPdsUpdateMode(PDSUpdateMode.ALTERED);
							updateFound=true;
						}
					}
					else
					{
						//it should never get here - it means that commChannel.Objectidentifier was modified by code !!!
						//commChannel.Objectidentifier is set by SPINE services only, it is updated in MAXIMS by PDS full retrieval
						String err = "commChannel.Objectidentifier was changed in MAXIMS: patient=" + patient.getName().toString() + ", commChannel=" + commChannel.toString();
						LOG.error(err);
						domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, err);
					}
				}
			}
		}

		//patient relatives
		if(patient.getPDSrelativesIsNotNull() && patient.getPDSrelatives().size() > 0)
		{
			for(PatRelative rel :  patient.getPDSrelatives())
			{
				if(rel.getObjectidentifier() == null)
				{
					rel.setPdsUpdateMode(PDSUpdateMode.ADDED);
					updateFound=true;
					
					if(rel.getNameIsNotNull())
						rel.getName().setPdsUpdateMode(PDSUpdateMode.ADDED);
					if(rel.getAddressIsNotNull())
						rel.getAddress().setPdsUpdateMode(PDSUpdateMode.ADDED);
					if(rel.getCommChannelsIsNotNull())
					{
						for(CommChannelVo commChannel :  rel.getCommChannels())
						{
							commChannel.setPdsUpdateMode(PDSUpdateMode.ADDED);
						}
					}
				}
				else
				{
					PatRelative originalRel = getPatientRelativeByObjectIdentifier(rel.getObjectidentifier(), orginalPatient.getPDSrelatives());
					
					if(originalRel != null)
					{
						if(!rel.pdsEquals(originalRel))
						{
							rel.setPdsUpdateMode(PDSUpdateMode.ALTERED);
							updateFound=true;
							
							if(rel.getNameIsNotNull())
							{
								if(rel.getName().getObjectidentifier() == null)
									rel.getName().setPdsUpdateMode(PDSUpdateMode.ADDED);
								else if(!rel.getName().pdsEquals(originalRel.getName()))
									rel.getName().setPdsUpdateMode(PDSUpdateMode.ALTERED);
							}
							
							if(rel.getAddressIsNotNull())
							{
								if(rel.getAddress().getObjectidentifier() == null)
									rel.getAddress().setPdsUpdateMode(PDSUpdateMode.ADDED);
								else if(!rel.getAddress().pdsEquals(originalRel.getAddress()))
									rel.getAddress().setPdsUpdateMode(PDSUpdateMode.ALTERED);
							}
							
							if(rel.getCommChannelsIsNotNull())
							{
								for(CommChannelVo commChannel :  rel.getCommChannels())
								{
									if(commChannel.getObjectidentifier() == null)
										commChannel.setPdsUpdateMode(PDSUpdateMode.ADDED);
									else
									{
										CommChannelVo originalCommChannel = getCommChannelByObjectIdentifier(commChannel.getObjectidentifier(), originalRel.getCommChannels());
										
										if(originalCommChannel != null)
										{
											if(!commChannel.pdsEquals(originalCommChannel))
											{
												commChannel.setPdsUpdateMode(PDSUpdateMode.ALTERED);
											}
										}
										else
										{
											//it should never get here - it means that commChannel.Objectidentifier was modified by code !!!
											//commChannel.Objectidentifier is set by SPINE services only, it is updated in MAXIMS by PDS full retrieval
											String err = "commChannel.Objectidentifier was changed in MAXIMS: patient=" + patient.getName().toString() + ", relative=" + rel.getName().toString() + ", commChannel=" + commChannel.toString();
											LOG.error(err);
											domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, err);
										}
										
									}
								}
							}
							
						}
					}
					else
					{
						//it should never get here - it means that commChannel.Objectidentifier was modified by code !!!
						//commChannel.Objectidentifier is set by SPINE services only, it is updated in MAXIMS by PDS full retrieval
						String err = "Relative.Objectidentifier was changed in MAXIMS: patient=" + patient.getName().toString() + ", commChannel=" + rel.toString();
						LOG.error(err);
						domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, err);
					}
				}
			}
		}
		
		//addresses
		if(patient.getAddressesIsNotNull() && patient.getAddresses().size() > 0)
		{
			for(PersonAddress addr :  patient.getAddresses())
			{
				// WDEV-22130, We will not send historic addresses to PDS
				if (!addr.getAddressTypeIsNotNull() || (addr.getAddressTypeIsNotNull() && addr.getAddressType().equals(AddressType.HISTORICAL)))
					continue;
				
				if(addr.getObjectidentifier() == null)
				{
					addr.setPdsUpdateMode(PDSUpdateMode.ADDED);
					updateFound=true;
				}
				else
				{
					PersonAddress originalAddress = getAddressByObjectIdentifier(addr.getObjectidentifier(), orginalPatient.getAddresses());
					
					if(originalAddress != null)
					{
						if(!addr.pdsEquals(originalAddress))
						{
							updateFound=true;
							addr.setPdsUpdateMode(PDSUpdateMode.ALTERED);
						}
					}
					else
					{
						//it should never get here - it means that commChannel.Objectidentifier was modified by code !!!
						//commChannel.Objectidentifier is set by SPINE services only, it is updated in MAXIMS by PDS full retrieval
						String err = "address.Objectidentifier was changed in MAXIMS: patient=" + patient.getName().toString() + ", address=" + addr.toString();
						LOG.error(err);
						domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, err);
					}
				}
			}
		}
		
		//names
		if(patient.getOtherNamesIsNotNull() && patient.getOtherNames().size() > 0)
		{
			for(PersonName pn :  patient.getOtherNames())
			{
				if(pn.getObjectidentifier() == null)
				{
					pn.setPdsUpdateMode(PDSUpdateMode.ADDED);
					updateFound=true;
				}
				else
				{
					PersonName originalName = getNameByObjectIdentifier(pn.getObjectidentifier(), orginalPatient.getOtherNames());
					
					if(originalName != null)
					{
						if(!pn.pdsEquals(originalName))
						{
							pn.setPdsUpdateMode(PDSUpdateMode.ALTERED);
							updateFound=true;
						}
					}
					else
					{
						//it should never get here - it means that commChannel.Objectidentifier was modified by code !!!
						//commChannel.Objectidentifier is set by SPINE services only, it is updated in MAXIMS by PDS full retrieval
						String err = "name.Objectidentifier was changed in MAXIMS: patient=" + patient.getName().toString() + ", name=" + pn.toString();
						LOG.error(err);
						domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, err);
					}
				}
			}
		}
		
		
		PDSPatientUpdateVo pdsUpdate = patient.getPDSPatientUpdate();
		
		//don't change patient.PDSPatientUpdate fields if there is a record already
//		if(pdsUpdate != null && pdsUpdate.getID_PDSPatientUpdateIsNotNull())
//			return;
		
		if(pdsUpdate == null)
		{
			pdsUpdate = new PDSPatientUpdateVo();
			pdsUpdate.setPatient(patient); 
		}

				
		//comm channels to be removed
		if(orginalPatient.getCommChannelsIsNotNull() && orginalPatient.getCommChannels().size() > 0)
		{
			for(CommChannelVo originalCommChannel : orginalPatient.getCommChannels())
			{
				if(originalCommChannel.getObjectidentifierIsNotNull() && getCommChannelByObjectIdentifier(originalCommChannel.getObjectidentifier(), patient.getCommChannels()) == null)
				{
					PDSCommChannelRemovedVo toBeRemoved = new PDSCommChannelRemovedVo();
					
					toBeRemoved.setObjectidentifier(originalCommChannel.getObjectidentifier());
					toBeRemoved.setUsage(originalCommChannel.getChannelUsage());
					toBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
					updateFound=true;
					if(pdsUpdate.getCommChannels() == null)
						pdsUpdate.setCommChannels(new PDSCommChannelRemovedVoCollection());
					
					pdsUpdate.getCommChannels().add(toBeRemoved);
				}
			}
		}
		
		if (patient.getSCNIsNotNull()&& patient.getSCN()!=0 && patient.getPDSPatientUpdateIsNotNull())
			patient.getPDSPatientUpdate().setSCN(patient.getSCN());
		
		//addresses to be removed
		if(orginalPatient.getAddressesIsNotNull() && orginalPatient.getAddresses().size() > 0)
		{
			for(PersonAddress originalAddress : orginalPatient.getAddresses())
			{
				if(originalAddress.getObjectidentifierIsNotNull() && getAddressByObjectIdentifier(originalAddress.getObjectidentifier(), patient.getAddresses()) == null)
				{
					PDSAddrVo toBeRemoved = new PDSAddrVo();
					
					toBeRemoved.setObjectIdentifier(originalAddress.getObjectidentifier());
					toBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
					toBeRemoved.setAddressType(originalAddress.getAddressType());
					
					updateFound=true;
					if(pdsUpdate.getAddress() == null)
						pdsUpdate.setAddress(new PDSAddrVoCollection());
					
					pdsUpdate.getAddress().add(toBeRemoved);
				}
			}
		}
	
		//names to be removed
		if(orginalPatient.getOtherNamesIsNotNull() && orginalPatient.getOtherNames().size() > 0)
		{
			for(PersonName originalName : orginalPatient.getOtherNames())
			{
				if(originalName.getObjectidentifierIsNotNull() && getNameByObjectIdentifier(originalName.getObjectidentifier(), patient.getOtherNames()) == null)
				{
					PDSNamesRemovedVo toBeRemoved = new PDSNamesRemovedVo();
					
					toBeRemoved.setObjectidentifier(originalName.getObjectidentifier());
					toBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
					updateFound=true;
					if(pdsUpdate.getNames() == null)
						pdsUpdate.setNames(new PDSNamesRemovedVoCollection());
					
					pdsUpdate.getNames().add(toBeRemoved);
				}
			}
		}
		
		//NOK address to be removed
		PatRelative originalNok = null;
		PatRelative newNok = null;
		if(orginalPatient.getPDSrelativesIsNotNull() && orginalPatient.getPDSrelatives().size() > 0)
		{
			for(PatRelative orginalPdsRel : orginalPatient.getPDSrelatives())
			{
				if(Boolean.TRUE.equals(orginalPdsRel.getNokInd()))
				{
					originalNok = orginalPdsRel;
					break;
				}
			}
			
			if(originalNok != null && originalNok.getObjectidentifierIsNotNull() && originalNok.getAddressIsNotNull() && originalNok.getAddress().getObjectidentifierIsNotNull())
			{
				//there was a NOK saved
				newNok = getPatientRelativeByObjectIdentifier(originalNok.getObjectidentifier(), patient.getPDSrelatives());
				
				if(newNok == null)
				{
					PDSAddrVo toBeRemoved = new PDSAddrVo();
					
					toBeRemoved.setObjectIdentifier(originalNok.getAddress().getObjectidentifier());
					toBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
					updateFound=true;
					pdsUpdate.setNokAddress(toBeRemoved);
				}
			}
		}
		
		//NOK comm channels to be removed
		if(originalNok != null && originalNok.getCommChannelsIsNotNull() && originalNok.getCommChannels().size() > 0)
		{
			for(CommChannelVo originalCommChannel : originalNok.getCommChannels())
			{
				if(originalCommChannel.getObjectidentifierIsNotNull())
				{
					boolean doRemove = false;
					
					if(newNok == null)
					{
						doRemove = true;
					}
					else
					{
						CommChannelVo newCommChannel = getCommChannelByObjectIdentifier(originalCommChannel.getObjectidentifier(), newNok.getCommChannels());
						
						if(newCommChannel == null)
							doRemove = true;
					}
					
					if(doRemove)
					{
						PDSCommChannelRemovedVo toBeRemoved = new PDSCommChannelRemovedVo();
						
						toBeRemoved.setObjectidentifier(originalCommChannel.getObjectidentifier());
						toBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
						updateFound=true;
						if(pdsUpdate.getNokCommChannels() == null)
							pdsUpdate.setNokCommChannels(new PDSCommChannelRemovedVoCollection());
						
						pdsUpdate.getNokCommChannels().add(toBeRemoved);
					}
				}
			}
		}

		//Relatives to be removed
		//WDEV-22179
		if(orginalPatient.getPDSrelativesIsNotNull() && orginalPatient.getPDSrelatives().size() > 0)
		{
			for(PatRelative originalRel :  orginalPatient.getPDSrelatives())
			{
				if(originalRel.getObjectidentifier() != null)
				{
					PatRelative newRel = getPatientRelativeByObjectIdentifier(originalRel.getObjectidentifier(), patient.getPDSrelatives());
					
					if(newRel == null)
					{
						PDSRelativeRemoveVo toBeRemoved = new PDSRelativeRemoveVo();
						
						toBeRemoved.setObjectidentifier(originalRel.getObjectidentifier());
						toBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
						updateFound=true;
						if(pdsUpdate.getRelatives() == null)
							pdsUpdate.setRelatives(new PDSRelativeRemoveVoCollection());
						
						pdsUpdate.getRelatives().add(toBeRemoved);
						
						//also add the comm channels to be removed
						if(originalRel.getCommChannelsIsNotNull())
						{
    						for(CommChannelVo originalCommChannel : originalRel.getCommChannels())
    						{
    							if(originalCommChannel.getObjectidentifierIsNotNull())
    							{
    								PDSCommChannelRemovedVo commChannelToBeRemoved = new PDSCommChannelRemovedVo();
    								
    								commChannelToBeRemoved.setObjectidentifier(originalCommChannel.getObjectidentifier());
    								commChannelToBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
    								updateFound=true;
    								if(toBeRemoved.getCommChannels() == null)
    									toBeRemoved.setCommChannels(new PDSCommChannelRemovedVoCollection());
    								
    								toBeRemoved.getCommChannels().add(commChannelToBeRemoved);
    							}
    						}
						}
					}
					else
					{
						//check whether any comm channel was removed
						if(originalRel.getCommChannelsIsNotNull())
						{
    						PDSRelativeRemoveVo toBeRemoved = new PDSRelativeRemoveVo();

    						for(CommChannelVo originalCommChannel : originalRel.getCommChannels())
    						{
    							if(originalCommChannel.getObjectidentifierIsNotNull())
    							{
    								CommChannelVo newCommChannel = getCommChannelByObjectIdentifier(originalCommChannel.getObjectidentifier(), newRel.getCommChannels());

    								if(newCommChannel == null)
    								{
        								PDSCommChannelRemovedVo commChannelToBeRemoved = new PDSCommChannelRemovedVo();
        								
        								commChannelToBeRemoved.setObjectidentifier(originalCommChannel.getObjectidentifier());
        								commChannelToBeRemoved.setPdsUpdateMode(PDSUpdateMode.REMOVED);
        								updateFound=true;
        								if(toBeRemoved.getCommChannels() == null)
        									toBeRemoved.setCommChannels(new PDSCommChannelRemovedVoCollection());
        								
        								toBeRemoved.getCommChannels().add(commChannelToBeRemoved);
    								}
    							}
    						}
    						
    						if(toBeRemoved.getCommChannelsIsNotNull() && toBeRemoved.getCommChannels().size() > 0)
    						{
        						toBeRemoved.setObjectidentifier(originalRel.getObjectidentifier());
        						toBeRemoved.setPdsUpdateMode(PDSUpdateMode.ALTERED);
        						updateFound=true;
        						if(pdsUpdate.getRelatives() == null)
        							pdsUpdate.setRelatives(new PDSRelativeRemoveVoCollection());
        						
        						pdsUpdate.getRelatives().add(toBeRemoved);
    						}
						}
					}
				}
			}
		}
		
		PatientContactPreferenceVo contact = patient.getAlternativeContact();
		PatientContactPreferenceVo originalContact = orginalPatient.getAlternativeContact();
		PatRelative relative = null;
		PatRelative originalRelative = null;
		
		if(patient.getPDSrelativesIsNotNull() && patient.getPDSrelatives().size() > 0)
		{
			for(PatRelative rel :  patient.getPDSrelatives())
			{
				if(Boolean.TRUE.equals(rel.getNokInd()))
				{
					relative = rel;
					break;
				}
			}
		}
		
		if(orginalPatient.getPDSrelativesIsNotNull() && orginalPatient.getPDSrelatives().size() > 0)
		{
			for(PatRelative rel :  orginalPatient.getPDSrelatives())
			{
				if(Boolean.TRUE.equals(rel.getNokInd()))
				{
					originalRelative = rel;
					break;
				}
			}
		}
		
		pdsUpdate.setAdministrativeGenderCode(pdsUpdateStatus(orginalPatient.getSex(), patient.getSex()));
		if (pdsUpdate.getAdministrativeGenderCodeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setBirthTime(pdsUpdateStatus(orginalPatient.getTimeOfBirth(), patient.getTimeOfBirth()));
		if (pdsUpdate.getBirthTimeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setDeceasedTime(pdsUpdateStatus(orginalPatient.getTimeOfDeath(), patient.getTimeOfDeath()));
		if (pdsUpdate.getDeceasedTimeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setLanguageCodeUpdateMode(pdsUpdateStatus(orginalPatient.getPrefCommLanguage(), patient.getPrefCommLanguage()));
		if (pdsUpdate.getLanguageCodeUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setProficiencyLevelCodeUpdateMode(pdsUpdateStatus(orginalPatient.getPDSInterpreterRequired(), patient.getPDSInterpreterRequired()));
		if (pdsUpdate.getProficiencyLevelCodeUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setPreferredContactMethodUpdateMode(pdsUpdateStatus(originalContact == null ? null : originalContact.getPdsPreferredContactMethod(), contact == null ? null : contact.getPdsPreferredContactMethod()));
		if (pdsUpdate.getPreferredContactMethodUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setPreferredContactTimesUpdateMode(pdsUpdateStatus(originalContact == null ? null : originalContact.getPreferredContactTimes(), contact == null ? null : contact.getPreferredContactTimes()));
		if (pdsUpdate.getPreferredContactTimesUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setCallCentreCallBackConsentUpdateMode(pdsUpdateStatus(originalContact == null ? null : originalContact.getPatientCallBackConsent(), contact == null ? null : contact.getPatientCallBackConsent()));
		if (pdsUpdate.getCallCentreCallBackConsentUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setNokRelationshipUpdateMode(pdsUpdateStatus(originalRelative == null ? null : originalRelative.getRelationship(), relative == null ? null : relative.getRelationship()));
		if (pdsUpdate.getNokRelationshipUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setNokEffectiveDatesUpdateMode(pdsUpdateStatus(originalRelative == null ? null : originalRelative.getBeffdate(), relative == null ? null : relative.getBeffdate()));
		if(pdsUpdate.getNokEffectiveDatesUpdateMode() != null)
		{
			pdsUpdate.setNokEffectiveDatesUpdateMode(pdsUpdateStatus(originalRelative == null ? null : originalRelative.getBetdate(), relative == null ? null : relative.getBetdate()));
			updateFound=true;
		}
		
		pdsUpdate.setNokContactRankUpdateMode(pdsUpdateStatus(originalRelative == null ? null : originalRelative.getContactRank(), relative == null ? null : relative.getContactRank()));
		if (pdsUpdate.getNokContactRankUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setNokUpdateMode(pdsUpdateStatus(originalRelative, relative));
		if (pdsUpdate.getNokUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setNokLanguageCommunicationUpdateMode(pdsUpdateStatus(originalRelative == null ? null : originalRelative.getPDSlanguage(), relative == null ? null : relative.getPDSlanguage()));
		if (pdsUpdate.getNokLanguageCommunicationUpdateModeIsNotNull())
			updateFound=true;
		
		//WDEV-21463
		pdsUpdate.setGenderUpdateMode(pdsUpdateStatus(orginalPatient.getSex(), patient.getSex()));
		if (pdsUpdate.getGenderUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setDateOfBirthUpdateMode(pdsUpdateStatus(orginalPatient.getDob(), patient.getDob()));
		if (pdsUpdate.getDateOfBirthUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setDateOfDeathUpdateMode(pdsUpdateStatus(orginalPatient.getDod(), patient.getDod()));
		if (pdsUpdate.getDateOfDeathUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setConsentUpdateMode(pdsUpdateStatus(orginalPatient.getAlternativeContact() == null ? null : orginalPatient.getAlternativeContact().getPdsConsent(), patient.getAlternativeContact() == null ? null : patient.getAlternativeContact().getPdsConsent()));
		if (pdsUpdate.getConsentUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setPreferredWrittenCommFormatUpdateMode(pdsUpdateStatus(orginalPatient.getAlternativeContact() == null ? null : orginalPatient.getAlternativeContact().getPdsPreferredWrittenComm(), patient.getAlternativeContact() == null ? null : patient.getAlternativeContact().getPdsPreferredWrittenComm()));
		if (pdsUpdate.getPreferredWrittenCommFormatUpdateModeIsNotNull())
			updateFound=true;
		
		pdsUpdate.setDeathNotificationUpdateMode(pdsUpdateStatus(orginalPatient.getPDSDeathNotificationStatus(), patient.getPDSDeathNotificationStatus()));
		if (pdsUpdate.getDeathNotificationUpdateModeIsNotNull())
			updateFound=true;
		
		// WDEV-21883 - We only set pdsUpdate when an actual update has been found
		if (updateFound)
		{
			patient.setPDSPatientUpdate(pdsUpdate);
		}
	}

	private PersonName getNameByObjectIdentifier(String objectidentifier, PersonNameCollection otherNames)
	{
		if(otherNames == null || objectidentifier == null)
			return null;
		
		for(PersonName pn :  otherNames)
		{
			if(objectidentifier.equals(pn.getObjectidentifier()))
				return pn;
		}
		
		return null;
	}

	private PersonAddress getAddressByObjectIdentifier(String objectidentifier, PersonAddressCollection addresses)
	{
		if(addresses == null || objectidentifier == null)
			return null;
		
		for(PersonAddress addr :  addresses)
		{
			if(objectidentifier.equals(addr.getObjectidentifier()))
				return addr;
		}
		
		return null;
	}

	private PatRelative getPatientRelativeByObjectIdentifier(String objectidentifier, PatRelativeCollection coll)
	{
		if(coll == null || objectidentifier == null)
			return null;
		
		for(PatRelative rel :  coll)
		{
			if(objectidentifier.equals(rel.getObjectidentifier()))
				return rel;
		}
		
		return null;
	}

	private CommChannelVo getCommChannelByObjectIdentifier(String objectidentifier, CommChannelVoCollection commChannels)
	{
		if(commChannels == null || objectidentifier == null)
			return null;
		
		for(CommChannelVo commChannel :  commChannels)
		{
			if(objectidentifier.equals(commChannel.getObjectidentifier()))
				return commChannel;
		}
		
		return null;
	}

	private PDSUpdateMode pdsUpdateStatus(Object originalValue, Object actualValue)
	{
		if(originalValue instanceof PatRelative || actualValue instanceof PatRelative)
		{
			if(originalValue == null && actualValue != null)
				return PDSUpdateMode.ADDED;

			if(actualValue != null && !((PatRelative)actualValue).pdsEquals(originalValue))
				return PDSUpdateMode.ALTERED;

			if(originalValue != null && !((PatRelative)originalValue).pdsEquals(actualValue))
				return PDSUpdateMode.ALTERED;
			
			return null;
		}
		
		// WDEV-21930 If boolean values - treat null as false
		if (originalValue instanceof Boolean || actualValue instanceof Boolean)
		{
			Boolean bOrigValue = (Boolean) originalValue;
			Boolean bActValue = (Boolean) actualValue;
			
			if (bOrigValue  == null && bActValue != null && bActValue.booleanValue() == true)
				return PDSUpdateMode.ADDED;
			
			if (bOrigValue != null && bActValue != null && !bOrigValue.equals(bActValue))
				return PDSUpdateMode.ALTERED;
			
			if (bOrigValue != null && bActValue == null && bOrigValue.booleanValue() == true)
				return PDSUpdateMode.ALTERED;
			
			return null;
		}
		
		if(originalValue == null && actualValue != null)
			return PDSUpdateMode.ADDED;
		
		if(actualValue != null && !actualValue.equals(originalValue))
			return PDSUpdateMode.ALTERED;
		
		if(originalValue != null && !originalValue.equals(actualValue))
			return PDSUpdateMode.ALTERED;
		
		return null;
	}

	/*
	 * returns true if any of the PDS fields has changed
	 */
	public boolean pdsFieldsChanged(Patient initialPatient, Patient pdsPatient)
	{
		if(initialPatient == null && pdsPatient == null)
			return false;
		
		if(initialPatient == null || pdsPatient == null)
			return true;
		
		//name
		PersonName name = initialPatient.getName();
		PersonName pdsName = pdsPatient.getName();
		
		if(name == null && pdsName != null || name != null && pdsName == null)
			return true;
		
		if(name != null && pdsName != null)
		{		
    		if(name.getForename() != null ? !name.getForename().equals(pdsName.getForename()) : pdsName.getForename() != null)
    			return true;
    		if(name.getMiddleName() != null ? !name.getMiddleName().equals(pdsName.getMiddleName()) : pdsName.getMiddleName() != null)
    			return true;
    		if(name.getSurname() != null ? !name.getSurname().equals(pdsName.getSurname()) : pdsName.getSurname() != null)
    			return true;
    		if(name.getTitle() != null ? !name.getTitle().equals(pdsName.getTitle()) : pdsName.getTitle() != null)
    			return true;
		}
		//gender
		if(initialPatient.getSex() != null ? !initialPatient.getSex().equals(pdsPatient.getSex()) : pdsPatient.getSex() != null)
			return true;
		
		//dob
		if(initialPatient.getDob() != null ? !initialPatient.getDob().equals(pdsPatient.getDob()) : pdsPatient.getDob() != null)
			return true;
		
		//dod
		if(initialPatient.getDod() != null ? !initialPatient.getDod().equals(pdsPatient.getDod()) : pdsPatient.getDod() != null)
			return true;

		//ethnic origin
		if(initialPatient.getEthnicOrigin() != null ? !initialPatient.getEthnicOrigin().equals(pdsPatient.getEthnicOrigin()) : pdsPatient.getEthnicOrigin() != null)
			return true;

		//religion
		if(initialPatient.getReligion() != null ? !initialPatient.getReligion().equals(pdsPatient.getReligion()) : pdsPatient.getReligion() != null)
			return true;

		//marital status
		if(initialPatient.getMaritalStatus() != null ? !initialPatient.getMaritalStatus().equals(pdsPatient.getMaritalStatus()) : pdsPatient.getMaritalStatus() != null)
			return true;

		//occupation
		if(initialPatient.getOccupation() != null ? !initialPatient.getOccupation().equals(pdsPatient.getOccupation()) : pdsPatient.getOccupation() != null)
			return true;

		//language
		if(initialPatient.getLanguage() != null ? !initialPatient.getLanguage().equals(pdsPatient.getLanguage()) : pdsPatient.getLanguage() != null)
			return true;

		//GP surgery
		if(initialPatient.getGpSurgery() != null ? !initialPatient.getGpSurgery().equals(pdsPatient.getGpSurgery()) : pdsPatient.getGpSurgery() != null)
			return true;

		//GP
		if(initialPatient.getGp() != null ? !initialPatient.getGp().equals(pdsPatient.getGp()) : pdsPatient.getGp() != null)
			return true;

		//medical card
		NationalHealthCoverVo nhc = initialPatient.getNationalHealthCover();
		NationalHealthCoverVo pdsNhc = pdsPatient.getNationalHealthCover();
		
		if(nhc == null && pdsNhc != null || nhc != null && pdsNhc == null)
			return true;
		
		if(nhc != null && pdsNhc != null)
		{		
    		if(nhc.getMedicalCardNo() != null ? !nhc.getMedicalCardNo().equals(pdsNhc.getMedicalCardNo()) : pdsNhc.getMedicalCardNo() != null)
    			return true;
		}
		//address
		PersonAddress addr = initialPatient.getAddress();
		PersonAddress pdsAddr = pdsPatient.getAddress();

		if(addr == null && pdsAddr != null || addr != null && pdsAddr == null)
			return true;
		
		if(addr != null && pdsAddr != null)
		{		
    		if(addr.getLine1() != null ? !addr.getLine1().equals(pdsAddr.getLine1()) : pdsAddr.getLine1() != null)
    			return true;
    		if(addr.getLine2() != null ? !addr.getLine2().equals(pdsAddr.getLine2()) : pdsAddr.getLine2() != null)
    			return true;
    		if(addr.getLine3() != null ? !addr.getLine3().equals(pdsAddr.getLine3()) : pdsAddr.getLine3() != null)
    			return true;
    		if(addr.getLine4() != null ? !addr.getLine4().equals(pdsAddr.getLine4()) : pdsAddr.getLine4() != null)
    			return true;
    		if(addr.getLine5() != null ? !addr.getLine5().equals(pdsAddr.getLine5()) : pdsAddr.getLine5() != null)
    			return true;
    		if(addr.getPostCode() != null ? !addr.getPostCode().equals(pdsAddr.getPostCode()) : pdsAddr.getPostCode() != null)
    			return true;
    		if(addr.getPhone() != null ? !addr.getPhone().equals(pdsAddr.getPhone()) : pdsAddr.getPhone() != null)
    			return true;
    		if(addr.getOtherphone() != null ? !addr.getOtherphone().equals(pdsAddr.getOtherphone()) : pdsAddr.getOtherphone() != null)
    			return true;
    		if(addr.getPCT()!= null ? !addr.getPCT().equals(pdsAddr.getPCT()) : pdsAddr.getPCT() != null)
    			return true;
    		if(addr.getAddressType() != null ? !addr.getAddressType().equals(pdsAddr.getAddressType()) : pdsAddr.getAddressType() != null)
    			return true;
    		if(addr.getFax() != null ? !addr.getFax().equals(pdsAddr.getFax()) : pdsAddr.getFax() != null)
    			return true;
    		if(addr.getAreaOfResidence() != null ? !addr.getAreaOfResidence().equals(pdsAddr.getAreaOfResidence()) : pdsAddr.getAreaOfResidence() != null)
    			return true;
    		if(addr.getCounty() != null ? !addr.getCounty().equals(pdsAddr.getCounty()) : pdsAddr.getCounty() != null)
    			return true;
		}
		
		//comm channels
		if(initialPatient.getCommChannels() == null && pdsPatient.getCommChannels() != null && pdsPatient.getCommChannels().size() > 0 || initialPatient.getCommChannels() != null && pdsPatient.getCommChannels() == null && initialPatient.getCommChannels().size() > 0)
			return true;

		if(initialPatient.getCommChannels() != null && pdsPatient.getCommChannels() != null)
		{
			if(initialPatient.getCommChannels().size() != pdsPatient.getCommChannels().size())
				return true;
			
			for(CommChannelVo commChannel :  initialPatient.getCommChannels())
			{
				if(commChannel.getObjectidentifier() == null)
					return true; //newly added comm channel
				else
				{
					CommChannelVo originalCommChannel = getCommChannelByObjectIdentifier(commChannel.getObjectidentifier(), pdsPatient.getCommChannels());
					
					if(!commChannel.pdsEquals(originalCommChannel))
					{
						return true;
					}
				}
			}
		}

		//patient identifiers
		if(initialPatient.getIdentifiers() == null && pdsPatient.getIdentifiers() != null && pdsPatient.getIdentifiers().size() > 0 || initialPatient.getIdentifiers() != null && pdsPatient.getIdentifiers() == null && initialPatient.getIdentifiers().size() > 0)
			return true;

		if(initialPatient.getIdentifiers() != null && pdsPatient.getIdentifiers() != null)
		{
			if(initialPatient.getIdentifiers().size() != pdsPatient.getIdentifiers().size())
				return true;
			
			for(PatientId item :  initialPatient.getIdentifiers())
			{
				boolean found = false;
				for(PatientId pdsItem :  pdsPatient.getIdentifiers())
				{
					if(item.getType().equals(pdsItem.getType()))
					{
						if(item.getValue().equals(pdsItem.getValue()))
						{
							found = true;
							break;
						}
					}
				}
				
				if(!found)
					return false;
			}
		}
		
		return false;
	}
	
}
