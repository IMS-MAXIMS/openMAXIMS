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


import org.apache.log4j.Logger;
import ims.core.vo.ClinicVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.LocSiteShortVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.TaxonomyMapCollection;
import ims.core.vo.lookups.AddressType;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.GPPracticeMessageQueueVo;
import ims.hl7.vo.WardMessageQueueVo;
import ims.hl7.vo.ifGPPracticeMessageQueueVo;
import ims.hl7.vo.ifWardMessageQueueVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.IfLocParentVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.PL;
import ca.uhn.hl7v2.model.v24.group.MFN_M05_MFELOCLCHLRLLDPLCHLCC;
import ca.uhn.hl7v2.model.v24.message.MFN_M05;
import ca.uhn.hl7v2.model.v24.segment.LDP;
import ca.uhn.hl7v2.model.v24.segment.LOC;
import ca.uhn.hl7v2.model.v24.segment.MFE;
import ca.uhn.hl7v2.model.v24.segment.MFI;

public class M05VoMapper extends VoMapper
{
	
	/**
	 * MFN_M05
	 * Clinics and Wards
	 */
	private static final Logger		LOG		= Logger.getLogger(M05VoMapper.class);

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception  //WDEV-20112
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		try
		{
			if (isClinicType(msg))
				processClinic(msg, providerSystem);
			else
				processLocation(msg,providerSystem);


		}
		catch (Exception ex)
		{
			LOG.error(ex.getMessage(), ex);
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}

	private void processClinic(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		ClinicVo clinic = populateClinic(msg, providerSystem);
		saveClinic(clinic);
	}

	private void saveClinic(ClinicVo clinic) throws HL7Exception
	{
		try
		{
			String[] errors = clinic.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of Clinic failed. " + VoMapper.toDisplayString(errors));				
			}
			orgLoc.saveClinic(clinic);
		}
		catch (StaleObjectException e)
		{
			LOG.error("StaleObjectException occurred saving clinic - " + e.getMessage(), e);
			throw new HL7Exception("Clinic data has been updated by another user/process - please try again", e);
		}
		
	}

	private ClinicVo populateClinic(Message msg, ProviderSystemVo prov) throws HL7Exception
	{
		MFN_M05_MFELOCLCHLRLLDPLCHLCC mfn_m05 = (MFN_M05_MFELOCLCHLRLLDPLCHLCC) msg.get("MFN_M05_MFELOCLCHLRLLDPLCHLCC");
		LOC loc = mfn_m05.getLOC();

		String clinicCode = loc.getPrimaryKeyValueLOC().getComponent(0).toString();
		ClinicVo clinic = orgLoc.getClinicByTaxonomyCode(prov.getCodeSystem(), clinicCode);	
		if (clinic == null)
		{
			clinic = new ClinicVo();
			TaxonomyMapCollection taxonomyMapCollection = new TaxonomyMapCollection();
			TaxonomyMap tax=new TaxonomyMap();
			tax.setTaxonomyCode(clinicCode);
			tax.setTaxonomyName(prov.getCodeSystem());
			taxonomyMapCollection.add(tax);
			clinic.setCodeMappings(taxonomyMapCollection);//.setClinicCode(clinicCode);
		}
		
		//WDEV-7394 - remove bracketed clinic code from clinic name
		String locName = loc.getLocationDescription().getValue();
		if (locName == null)
			throw new HL7Exception("Clinic name cannot be blank: (code is " + clinicCode + ")");
		
		clinic.setClinicName(locName);
		// Get the clinic's hospital by Pas Code
		// LocSiteShortVo hospitalVo = orgLoc.getLocSiteByPostCode(loc.getLocationAddress(0).getZipOrPostalCode().getValue());

		//WDEV-20278
//		LocSiteShortVo hospitalVo = orgLoc.getLocSiteShortByTaxonomyType(loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue(), TaxonomyType.PAS);
		LocSiteShortVo hospitalVo = orgLoc.getLocSiteShortByTaxonomyType(loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue(), prov.getCodeSystem()); //WDEV-20278
		if (hospitalVo == null)
			throw new HL7Exception("Location not found for Clinic Organisation:" + clinicCode + " using PAS Code:" + loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue());
		clinic.setClinicLocation(hospitalVo);
		LDP ldp = mfn_m05.getMFN_M05_LDPLCHLCC().getLDP();
		
		if (ldp != null && ldp.getActiveInactiveFlag() != null && ldp.getActiveInactiveFlag().getValue() != null)
		{
			if (ldp.getActiveInactiveFlag().toString().equals("A"))
				clinic.setIsActive(true);
			else
				clinic.setIsActive(false);
		}
		else
		{
			clinic.setIsActive(true);
		}
		return clinic;
		
	}

	private void processLocation(Message msg,ProviderSystemVo providerSystem) throws HL7Exception
	{
		IfLocParentVo loc = populateLocation(msg,providerSystem);
		saveLocation(loc);
	}
	
	protected IfLocParentVo populateLocation(Message msg,ProviderSystemVo providerSystem) throws HL7Exception
	{
		MFN_M05_MFELOCLCHLRLLDPLCHLCC mfn_m05 = (MFN_M05_MFELOCLCHLRLLDPLCHLCC) msg.get("MFN_M05_MFELOCLCHLRLLDPLCHLCC");
		LOC loc = mfn_m05.getLOC();
	
		String locCode= loc.getPrimaryKeyValueLOC().getComponent(0).toString();
		String parentLocCode = loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue();
		if (locCode == null)
			throw new HL7Exception("PAS code for Location cannot be null. - LOC-1");
		if (parentLocCode == null)
			throw new HL7Exception("Parent code for parent Location cannot be null.");
		if (locCode.equals(parentLocCode))
			throw new HL7Exception("Location code and parent Location code cannot be the same.");
		
		// Get the parent location by pas code
		//WDEV-20278
//		LocationLiteVo hospitalVo = orgLoc.getLocationLiteByTaxonomyType(parentLocCode, TaxonomyType.PAS);
		LocationLiteVo hospitalVo = orgLoc.getLocationLiteByTaxonomyType(parentLocCode, providerSystem.getCodeSystem()); //WDEV-20278
		if (hospitalVo == null)
			throw new HL7Exception("Parent Location not found for Location:" + locCode + " using PAS Code:" + loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue());

		//WDEV-20278
//		IfLocParentVo locVo = ocsIfInbound.getLocParentByTaxType(locCode, TaxonomyType.PAS);
		IfLocParentVo locVo = ocsIfInbound.getLocParentByTaxType(locCode, providerSystem.getCodeSystem()); //WDEV-20278
		if (locVo ==  null)
		{
			locVo = new IfLocParentVo();
			locVo.setIsActive(Boolean.TRUE);
			locVo.setType(LocationType.WARD);
			// Add the Code Mappings
			TaxonomyMapCollection coll = new TaxonomyMapCollection();
			TaxonomyMap map = new TaxonomyMap();
			map.setTaxonomyCode(locCode);
			//WDEV-20278
//			map.setTaxonomyName(TaxonomyType.PAS);
			map.setTaxonomyName(providerSystem.getCodeSystem()); //WDEV-20278
			coll.add(map);
			locVo.setCodeMappings(coll);
			locVo.setIsVirtual(Boolean.FALSE);
		}
		
		locVo.setAddress(populateAddressVoFromXAD(locVo.getAddress(), loc.getLocationAddress(0),providerSystem, AddressType.LOCATION));
		locVo.setName(loc.getLocationDescription().getValue());
		locVo.setUpperName(locVo.getName().toUpperCase());
		locVo.setParentLocation(hospitalVo);
		LDP ldp = mfn_m05.getMFN_M05_LDPLCHLCC().getLDP();
		
		if (ldp != null && ldp.getActiveInactiveFlag()!=null && ldp.getActiveInactiveFlag().getValue() != null)
		{
			if (ldp.getActiveInactiveFlag().getValue().equals("A"))
				locVo.setIsActive(true);
			else
				locVo.setIsActive(false);
		}
		else
		{
			locVo.setIsActive(true);
		}
		
		return locVo;
	}
	
	private void saveLocation(IfLocParentVo loc) throws HL7Exception
	{
		try
		{
			String[] errors = loc.validate();
			if (errors != null)
			{
				throw new HL7Exception("Validation of Location failed. " + VoMapper.toDisplayString(errors));				
			}
			ocsIfInbound.saveLocation(loc);
		}
		catch (StaleObjectException e)
		{
			LOG.error("StaleObjectException occurred saving location - " + e.getMessage(), e);
			throw new HL7Exception("Location data has been updated by another user/process - please try again", e);
		}
		catch (UniqueKeyViolationException e)
		{
			LOG.error("UniqueKeyViolationException occurred saveLocationSite " + e.getMessage(), e);
			throw new HL7Exception("UniqueKeyViolationException occurred saveLocationSite " + e.getMessage(), e);
		}
	}
	
	public boolean isClinicType(Message msg) throws HL7Exception
	{
		MFI mfi = (MFI) msg.get("MFI");
		if (mfi.getMasterFileIdentifier().getIdentifier().getValue().equals("CLN"))
			return true;
		else
			return false;
		
	}
	
	
	// WDEV-19576
	public Message populateMessage(IHL7OutboundMessageHandler event) throws Exception
	{
		LOG.debug("M05VoMapper populateMessage: entry");
		MFN_M05 message = new MFN_M05();
		MFI mfi = message.getMFI();
		MFE mfe = message.getMFN_M05_MFELOCLCHLRLLDPLCHLCC().getMFE();
		LOC loc = message.getMFN_M05_MFELOCLCHLRLLDPLCHLCC().getLOC();
		LDP ldp = message.getMFN_M05_MFELOCLCHLRLLDPLCHLCC().getMFN_M05_LDPLCHLCC().getLDP();
		
		
		if(event instanceof WardMessageQueueVo)
		{
			WardMessageQueueVo feedVo = (WardMessageQueueVo)event;
			ifWardMessageQueueVo wardDetails = adt.getWardMessageQueueDetails(feedVo);

			//MFE-1 Record Level Event Code (ID) 
			//[MAD for new record, MUP for updated record]
			mfe.getRecordLevelEventCode().setValue("MAD");
			if(wardDetails.getSystemInformation().getLastupdateDateTime() != null)
			{
				mfe.getRecordLevelEventCode().setValue("MUP");
			}
			
			//MFI-4 Entered Date Time (TS)
			if(wardDetails.getSystemInformation().getLastupdateDateTime() != null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(wardDetails.getSystemInformation().getLastupdateDateTime().toString(DateTimeFormat.ISO));
			}
			else if(wardDetails.getSystemInformation().getCreationDateTime() != null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(wardDetails.getSystemInformation().getCreationDateTime().toString(DateTimeFormat.ISO));
			}

			//LOC-1-1 Point of care (IS)
			//LDP-1-1 Point of care (IS)
			if(wardDetails.getCodeMappings() != null)
			{
				for (int i=0; i<wardDetails.getCodeMappings().size(); i++)
				{
					TaxonomyMap codeMapping = wardDetails.getCodeMappings().get(i);
					if(codeMapping.getTaxonomyCode() !=null 
							&& codeMapping.getTaxonomyCode().length() > 0
							//WDEV-20278
							&& codeMapping.getTaxonomyName().equals(event.getProviderSystem().getCodeSystem())) //WDEV-20278
					{
						loc.getPrimaryKeyValueLOC().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
						ldp.getPrimaryKeyValueLDP().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
					}
				}
					
			}

			//LOC-1-4 Facility (HD)
			//LDP-1-4 Facility (HD)
			if(wardDetails.getParentLocation()!=null && wardDetails.getParentLocation().getCodeMappings()!=null)
			{
				for (int i=0; i<wardDetails.getParentLocation().getCodeMappings().size(); i++)
				{
					TaxonomyMap codeMapping = wardDetails.getParentLocation().getCodeMappings().get(i);
					if(codeMapping.getTaxonomyCode() != null 
							&& codeMapping.getTaxonomyCode().length() > 0
							//WDEV-20278
							&& codeMapping.getTaxonomyName().equals(event.getProviderSystem().getCodeSystem())) //WDEV-20278
					{
						loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().setValue(codeMapping.getTaxonomyCode());
						ldp.getPrimaryKeyValueLDP().getFacility().getNamespaceID().setValue(codeMapping.getTaxonomyCode());
					}
				}
			}
							
			//LOC-1-9 Location name (ST)
			//LDP-1-9 Location name (ST)
			//LOC-2 Location description (ST)
			//LDP-2 Location description (CE)
			if(wardDetails.getName() !=null && wardDetails.getName().length() > 0)
			{
				loc.getPrimaryKeyValueLOC().getLocationDescription().setValue(wardDetails.getName());
				ldp.getPrimaryKeyValueLDP().getLocationDescription().setValue(wardDetails.getName());
				loc.getLocationDescription().setValue(wardDetails.getName());
				ldp.getLocationDepartment().getIdentifier().setValue(wardDetails.getName());
			}
				
			//LOC-3 Location type (IS)
			if(wardDetails.getType() != null)
			{
				loc.getLocationTypeLOC(0).setValue(svc.getRemoteLookup(wardDetails.getType().getID(), event.getProviderSystem().getCodeSystem().getText()));					
			}

			//LOC-5 Address (XAD)
			if(wardDetails.getAddress() != null)
			{
				renderAddressVoToXAD(wardDetails.getAddress(), loc.getLocationAddress(0), event.getProviderSystem());
				
				//WDEV-20271 Move code commented out below to here
				//LOC-6 Location Phone (XTN)
				if(wardDetails.getAddress().getPhone() !=null && wardDetails.getAddress().getPhone().length() > 0)
				{
					loc.getLocationPhone(0).getTelecommunicationUseCode().setValue("WPN");
					loc.getLocationPhone(0).getTelecommunicationEquipmentType().setValue("PH");
					loc.getLocationPhone(0).getAnyText().setValue(wardDetails.getAddress().getPhone());
				}
				//LOC-6 Location fax
				if(wardDetails.getAddress().getFax() != null && wardDetails.getAddress().getFax().length() > 0)
				{
					if(wardDetails.getAddress().getPhoneIsNotNull())
					{
						loc.getLocationPhone(1).getTelecommunicationUseCode().setValue("WPN");
						loc.getLocationPhone(1).getTelecommunicationEquipmentType().setValue("FX");
						loc.getLocationPhone(1).getAnyText().setValue(wardDetails.getAddress().getFax());					
					}
					else 
					{
						loc.getLocationPhone(0).getTelecommunicationUseCode().setValue("WPN");
						loc.getLocationPhone(0).getTelecommunicationEquipmentType().setValue("FX");
						loc.getLocationPhone(0).getAnyText().setValue(wardDetails.getAddress().getFax());					
					}
				}
				//LOC-6 Location Phone (XTN)
				if(wardDetails.getAddress().getOtherphone() != null && wardDetails.getAddress().getOtherphone().length() > 0)
				{
					if(wardDetails.getAddress().getPhoneIsNotNull() && wardDetails.getAddress().getFaxIsNotNull())
					{
						loc.getLocationPhone(2).getTelecommunicationUseCode().setValue("WPN");
						loc.getLocationPhone(2).getTelecommunicationEquipmentType().setValue("PH");
						loc.getLocationPhone(2).getAnyText().setValue(wardDetails.getAddress().getOtherphone());
					}
					else if(wardDetails.getAddress().getPhoneIsNotNull() && wardDetails.getAddress().getFax()==null)
					{
						loc.getLocationPhone(1).getTelecommunicationUseCode().setValue("WPN");
						loc.getLocationPhone(1).getTelecommunicationEquipmentType().setValue("PH");
						loc.getLocationPhone(1).getAnyText().setValue(wardDetails.getAddress().getOtherphone());
					}
					else if(wardDetails.getAddress().getPhone()==null && wardDetails.getAddress().getFax()==null)
					{
						loc.getLocationPhone(0).getTelecommunicationUseCode().setValue("WPN");
						loc.getLocationPhone(0).getTelecommunicationEquipmentType().setValue("PH");
						loc.getLocationPhone(0).getAnyText().setValue(wardDetails.getAddress().getOtherphone());					
					}
				}
				//WDEV-20271
			}
				
//			//LOC-6 Location Phone (XTN)
//			if(wardDetails.getAddress().getPhone() !=null && wardDetails.getAddress().getPhone().length() > 0)
//			{
//				loc.getLocationPhone(0).getTelecommunicationUseCode().setValue("WPN");
//				loc.getLocationPhone(0).getTelecommunicationEquipmentType().setValue("PH");
//				loc.getLocationPhone(0).getAnyText().setValue(wardDetails.getAddress().getPhone());
//			}
//			//LOC-6 Location fax
//			if(wardDetails.getAddress().getFax() != null && wardDetails.getAddress().getFax().length() > 0)
//			{
//				if(wardDetails.getAddress().getPhoneIsNotNull())
//				{
//					loc.getLocationPhone(1).getTelecommunicationUseCode().setValue("WPN");
//					loc.getLocationPhone(1).getTelecommunicationEquipmentType().setValue("FX");
//					loc.getLocationPhone(1).getAnyText().setValue(wardDetails.getAddress().getFax());					
//				}
//				else 
//				{
//					loc.getLocationPhone(0).getTelecommunicationUseCode().setValue("WPN");
//					loc.getLocationPhone(0).getTelecommunicationEquipmentType().setValue("FX");
//					loc.getLocationPhone(0).getAnyText().setValue(wardDetails.getAddress().getFax());					
//				}
//			}
//			//LOC-6 Location Phone (XTN)
//			if(wardDetails.getAddress().getOtherphone() != null && wardDetails.getAddress().getOtherphone().length() > 0)
//			{
//				if(wardDetails.getAddress().getPhoneIsNotNull() && wardDetails.getAddress().getFaxIsNotNull())
//				{
//					loc.getLocationPhone(2).getTelecommunicationUseCode().setValue("WPN");
//					loc.getLocationPhone(2).getTelecommunicationEquipmentType().setValue("PH");
//					loc.getLocationPhone(2).getAnyText().setValue(wardDetails.getAddress().getOtherphone());
//				}
//				else if(wardDetails.getAddress().getPhoneIsNotNull() && wardDetails.getAddress().getFax()==null)
//				{
//					loc.getLocationPhone(1).getTelecommunicationUseCode().setValue("WPN");
//					loc.getLocationPhone(1).getTelecommunicationEquipmentType().setValue("PH");
//					loc.getLocationPhone(1).getAnyText().setValue(wardDetails.getAddress().getOtherphone());
//				}
//				else if(wardDetails.getAddress().getPhone()==null && wardDetails.getAddress().getFax()==null)
//				{
//					loc.getLocationPhone(0).getTelecommunicationUseCode().setValue("WPN");
//					loc.getLocationPhone(0).getTelecommunicationEquipmentType().setValue("PH");
//					loc.getLocationPhone(0).getAnyText().setValue(wardDetails.getAddress().getOtherphone());					
//				}
//			}

			//LPD-6 Active/Inactive flag (ID)
			if(wardDetails.getIsActive() != null 
					&& wardDetails.getIsActive().toString().equalsIgnoreCase("TRUE"))
			{
				ldp.getActiveInactiveFlag().setValue("A");
			}
			else ldp.getActiveInactiveFlag().setValue("I");
			
		}

		
		else if(event instanceof GPPracticeMessageQueueVo)
		{
			GPPracticeMessageQueueVo feedVo = (GPPracticeMessageQueueVo)event;
			ifGPPracticeMessageQueueVo gPPracticeDetails=adt.getGPPracticeMessageQueueDetails(feedVo);			
	
			//MFI-4 Entered Date Time (TS)
			if(gPPracticeDetails.getSystemInformation()!=null && gPPracticeDetails.getSystemInformation().getLastupdateDateTime()!=null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(gPPracticeDetails.getSystemInformation().getLastupdateDateTime().toString(DateTimeFormat.ISO));
			}
			else if(gPPracticeDetails.getSystemInformation()!=null && gPPracticeDetails.getSystemInformation().getCreationDateTime()!=null)
			{
				mfi.getEnteredDateTime().getTimeOfAnEvent().setValue(gPPracticeDetails.getSystemInformation().getCreationDateTime().toString(DateTimeFormat.ISO));
			}
		
			//MFE-1 Record Level Event Code (ID) 
			//[MAD for new record, MUP for updated record]
			mfe.getRecordLevelEventCode().setValue("MAD");
			if(gPPracticeDetails.getSystemInformation()!=null && gPPracticeDetails.getSystemInformation().getLastupdateDateTime()!=null)
			{
				mfe.getRecordLevelEventCode().setValue("MUP");
			}

			//LOC-1-1 Point of care (IS)
			//LDP-1-1 Point of care (IS)
			if(gPPracticeDetails.getCodeMappings() != null)
			{
				for (int i=0; i<gPPracticeDetails.getCodeMappings().size(); i++)
				{
					TaxonomyMap codeMapping = gPPracticeDetails.getCodeMappings().get(i);
					if(codeMapping.getTaxonomyCode() != null
							&& codeMapping.getTaxonomyCode().length() > 0
							&& codeMapping.getTaxonomyName().equals(TaxonomyType.NAT_LOC_CODE))
					{
						loc.getPrimaryKeyValueLOC().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
						ldp.getPrimaryKeyValueLDP().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
					break;
					}
				}
			}

			//LOC-1-4 Facility (HD)
			if(gPPracticeDetails.getPctCode() != null && gPPracticeDetails.getPctCode().length() > 0 )
			{
				loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().setValue(gPPracticeDetails.getPctCode());
				ldp.getPrimaryKeyValueLDP().getFacility().getNamespaceID().setValue(gPPracticeDetails.getPctCode());
			}

			//LOC-1-9 Location description (ST)
			//LOC-2 Location description (ST)
			//LPD-2 Location department (CE)
			if(gPPracticeDetails.getName() != null && gPPracticeDetails.getName().length() > 0)
			{
				loc.getPrimaryKeyValueLOC().getLocationDescription().setValue(gPPracticeDetails.getName());
				loc.getLocationDescription().setValue(gPPracticeDetails.getName());
				ldp.getPrimaryKeyValueLDP().getLocationDescription().setValue(gPPracticeDetails.getName());
				ldp.getLocationDepartment().getIdentifier().setValue(gPPracticeDetails.getName());
			}
				
			//LOC-3 Location type (IS)
			if(gPPracticeDetails.getType() != null)
			{
				loc.getLocationTypeLOC(0).setValue(svc.getRemoteLookup(gPPracticeDetails.getType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}	

			//LOC-5 Address (XAD)
			if(gPPracticeDetails.getAddress() != null)
			{
				renderOrgAddressVoToXAD(gPPracticeDetails.getAddress(), loc.getLocationAddress(0), event.getProviderSystem());
			}
				
			//LOC-6 Location Phone  (XTN)
			if(gPPracticeDetails.getCommChannelsIsNotNull())
			{
				int comChannelCount = 0;
				
				for (int i=0; i<gPPracticeDetails.getCommChannels().size(); i++)
				{
					CommChannelVo commVo = gPPracticeDetails.getCommChannels().get(i);
					
					if(commVo.getCommValue() != null && commVo.getCommValue().length() > 0)
					{
						if(commVo.getChannelType().equals(ChannelType.EMAIL))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("NET");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("Internet");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());
							comChannelCount++;
						}
							
						else if(commVo.getChannelType().equals(ChannelType.MOBILE))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("CP");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());						
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.HOME_PHONE))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.FAX))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("FX");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
	
						else if(commVo.getChannelType().equals(ChannelType.WORK_PHONE))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
						
						else if(commVo.getChannelType().equals(ChannelType.GEN_PHONE))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("WPN");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("PH");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
	
						else if(commVo.getChannelType().equals(ChannelType.BLEEP))
						{
							loc.getLocationPhone(comChannelCount).getTelecommunicationUseCode().setValue("BPN");
							loc.getLocationPhone(comChannelCount).getTelecommunicationEquipmentType().setValue("BP");
							loc.getLocationPhone(comChannelCount).getAnyText().setValue(commVo.getCommValue());												
							comChannelCount++;
						}
					}

				}
			}						
			
			//LDP-6 Active/inactive flag  (ID)
			if(gPPracticeDetails.getIsActive() != null && gPPracticeDetails.getIsActive().toString().equalsIgnoreCase("TRUE"))
			{
				ldp.getActiveInactiveFlag().setValue("A");
			}
			else ldp.getActiveInactiveFlag().setValue("I");

		}


		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"MFN","M05");

		// MFI-1 Master File Identifier (CE)
		mfi.getMasterFileIdentifier().getIdentifier().setValue("LOC");
		
		//MFI-2 Master File Application Identifier (HD) (same as MSH-3 Sending Application) 
		if(message.getMSH().getSendingApplication().getNamespaceID().getValue().length() > 0 
				&& message.getMSH().getSendingApplication().getNamespaceID() != null)
		{
			mfi.getMasterFileApplicationIdentifier().getNamespaceID().setValue(message.getMSH().getSendingApplication().getNamespaceID().getValue());
		}

		//MFE-4 Primary key value (PL)
		//[Same as LOC-1]
		if(message.getMFN_M05_MFELOCLCHLRLLDPLCHLCC().getLOC() != null)
		{
			PL type = new PL();
			type = message.getMFN_M05_MFELOCLCHLRLLDPLCHLCC().getLOC().getPrimaryKeyValueLOC();
			mfe.getPrimaryKeyValueMFE(0).setData(type);
		}
		
		//MFI-3 File Level Event Code (ID)
		mfi.getFileLevelEventCode().setValue("UPD");	

		// MFI-6 Response level code ((ID)
		mfi.getResponseLevelCode().setValue("NE");
		
		//MFE-5 Primary Key Location Type (ID)
		mfe.getPrimaryKeyValueType(0).setValue("PL");
		
		return message;
		
	}

	@Override
	public Message populateMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
