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
// This code was generated by John MacEnri using IMS Development Environment (version 1.53 build 2663.17474)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.core.domain.impl;

import java.util.List;

import ims.admin.domain.MosAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.impl.MosAdminImpl;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.core.domain.ADT;
import ims.core.domain.base.impl.BaseAdtTransferDialogImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.MedicRefVo;
import ims.core.resource.place.domain.objects.LocSite;
import ims.core.resource.place.domain.objects.Location;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.MedicLiteVoCollection;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.lookups.LocationType;
import ims.domain.DomainFactory;

public class AdtTransferDialogImpl extends BaseAdtTransferDialogImpl
{

	private static final long serialVersionUID = 1L;

	public LocationLiteVo getParentHospital(ims.core.resource.place.vo.LocationRefVo ward)
	{
		DomainFactory factory = getDomainFactory();
		Location doLocation =  ward != null ? (Location) factory.getDomainObject(ward) : null; //WDEV-20173
		return getHospital(doLocation);	
	}
	
	private LocationLiteVo getHospital(Location doLocation)
	{
		if (doLocation ==null)
			return null; //WDEV-20173		
		if(doLocation instanceof LocSite && doLocation.getType().equals(getDomLookup(LocationType.HOSP)))
			return LocationLiteVoAssembler.create(doLocation);
	
		while(doLocation.getParentLocation() != null) 
		{
			doLocation = doLocation.getParentLocation();
			if(doLocation instanceof LocSite && doLocation.getType().equals(getDomLookup(LocationType.HOSP)))
				return LocationLiteVoAssembler.create(doLocation);
		}		
		return null;
	}

	public MedicLiteVoCollection listConsultants(String nameFilter)
	{
		MosAdmin mosAdmin = (MosAdmin)getDomainImpl(MosAdminImpl.class);
		return mosAdmin.listConsultants();
	}

	public LocationLiteVoCollection listHospitals()
	{
		DomainFactory factory = getDomainFactory();
		String hql = " from Location loc where loc.type = :locType and loc.isActive = :isActive and loc.isVirtual = :isVirtual";	//WDEV-19532
		List l = factory.find(hql, new String[]{"locType","isActive","isVirtual"}, new Object[]{getDomLookup(LocationType.HOSP), Boolean.TRUE,Boolean.FALSE});	//WDEV-19532
		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(l);
	}

	public LocationLiteVoCollection listWardsForHospital(LocationRefVo hospital)
	{
		OrganisationAndLocation orgAdmin = (OrganisationAndLocation)getDomainImpl(OrganisationAndLocationImpl.class);
		return orgAdmin.listActiveWardsForHospitalByNameLite(hospital, null);
	}

	public void transferInpatient(PatientRefVo patient, LocationRefVo ward, MedicRefVo consultant) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		ADT adt = (ADT)getDomainImpl(ADTImpl.class);
		adt.transferPatient(patient, consultant, ward);		
	}

}
