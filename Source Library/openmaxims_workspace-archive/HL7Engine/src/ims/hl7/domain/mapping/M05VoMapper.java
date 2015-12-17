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

import ims.core.vo.ClinicVo;
import ims.core.vo.LocSiteShortVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.TaxonomyMapCollection;
import ims.core.vo.lookups.AddressType;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.IfLocParentVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.group.MFN_M05_MFELOCLCHLRLLDPLCHLCC;
import ca.uhn.hl7v2.model.v24.segment.LDP;
import ca.uhn.hl7v2.model.v24.segment.LOC;
import ca.uhn.hl7v2.model.v24.segment.MFI;

public class M05VoMapper extends VoMapper
{
	
	/**
	 * MFN_M05
	 * Clinics and Wards
	 */
	private static final Logger		LOG		= Logger.getLogger(M05VoMapper.class);

	
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		
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
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
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

		LocSiteShortVo hospitalVo = orgLoc.getLocSiteShortByTaxonomyType(loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue(), TaxonomyType.PAS);
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
		LocationLiteVo hospitalVo = orgLoc.getLocationLiteByTaxonomyType(parentLocCode, TaxonomyType.PAS);
		if (hospitalVo == null)
			throw new HL7Exception("Parent Location not found for Location:" + locCode + " using PAS Code:" + loc.getPrimaryKeyValueLOC().getFacility().getNamespaceID().getValue());

		
		IfLocParentVo locVo = ocsIfInbound.getLocParentByTaxType(locCode, TaxonomyType.PAS);
		if (locVo ==  null)
		{
			locVo = new IfLocParentVo();
			locVo.setIsActive(Boolean.TRUE);
			locVo.setType(LocationType.WARD);
			// Add the Code Mappings
			TaxonomyMapCollection coll = new TaxonomyMapCollection();
			TaxonomyMap map = new TaxonomyMap();
			map.setTaxonomyCode(locCode);
			map.setTaxonomyName(TaxonomyType.PAS);
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
	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}
}
