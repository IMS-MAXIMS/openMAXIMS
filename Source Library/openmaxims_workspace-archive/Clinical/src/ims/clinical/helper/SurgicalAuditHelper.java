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

import ims.clinical.domain.objects.SurgicalAuditOperationDetail;
import ims.clinical.vo.SurgicalAuditOperationDetailRefVo;
import ims.clinical.vo.SurgicalAuditOperationDetailVo;
import ims.clinical.vo.SurgicalAuditOperationDetailVoCollection;
import ims.clinical.vo.domain.SurgicalAuditOperationDetailVoAssembler;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.resource.place.domain.objects.Location;
import ims.core.resource.place.vo.LocSiteRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.lookups.LocationType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;

import java.util.List;

public class SurgicalAuditHelper extends DomainImpl implements IESurgicalAuditHelper 
{

	public SurgicalAuditOperationDetailVoCollection listSurgicalAuditOperationDetailByCareContext(CareContextRefVo careContextRef)
	{	
		if (careContextRef == null || careContextRef.getID_CareContext() == null)
		{
			throw new CodingRuntimeException("Cannot get SurgicalAuditOperationDetailVoCollection on null Id for CareContext ");
		}

		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("select surgAudit from SurgicalAuditOperationDetail as surgAudit where surgAudit.careContext.id = :careContextID order by surgAudit.systemInformation.creationDateTime desc ");

		List<?> list = factory.find(hql.toString(), new String[] { "careContextID" }, new Object[] { careContextRef.getID_CareContext() });

		return SurgicalAuditOperationDetailVoAssembler.createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(list);
		
	}

	public SurgicalAuditOperationDetailVo getSurgicalAuditOperationDetail(SurgicalAuditOperationDetailRefVo surgicalAuditOpRef)
	{
		if (surgicalAuditOpRef == null || surgicalAuditOpRef.getID_SurgicalAuditOperationDetail() == null)
		{
			throw new CodingRuntimeException("Cannot get SurgicalAuditOperationDetailVo on null Id ");
		}

		DomainFactory factory = getDomainFactory();

		SurgicalAuditOperationDetail domainSurgicalAudit = (SurgicalAuditOperationDetail) factory.getDomainObject(SurgicalAuditOperationDetail.class, surgicalAuditOpRef.getID_SurgicalAuditOperationDetail());

		return SurgicalAuditOperationDetailVoAssembler.create(domainSurgicalAudit);
	}

	
	//wdev-15093
	public LocationLiteVoCollection getTheatre(LocationRefVo locRef) 
	{
		if( locRef == null)
			return null;
		DomainFactory factory = getDomainFactory();
		LocationLiteVoCollection tempColl = new LocationLiteVoCollection();
		
		
		StringBuffer hql = new StringBuffer();
		StringBuffer hqlId = new StringBuffer();
		List loc = null;
		hqlId.append(locRef.getID_Location());
		do
		{
			hql.append("select l2_1 from Location as l1_1 left join l1_1.locations as l2_1 left join l2_1.type as l3_1 where (l1_1.id in (" + hqlId + ") and l2_1.type.id = :TheatreId and l2_1.isActive = :Active and  l2_1.isVirtual = :Virtual)");
		
			loc = factory.find(hql.toString(), new String[] { "TheatreId","Active","Virtual" }, new Object[] { getDomLookup(LocationType.THEATRE).getId(),true,false });
			
			if(loc != null && loc.size() > 0)
			{
				LocationLiteVoCollection tempLocColl = LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(loc);
				hqlId = new StringBuffer();
				hql = new StringBuffer();
				if( tempLocColl != null && tempLocColl.size() > 0)
				{
					for(int i = 0; i < tempLocColl.size();i++)
					{
						tempColl.add(tempLocColl.get(i));
						
						if(i > 0)
							hqlId.append(",");
						
						hqlId.append(tempLocColl.get(i).getID_Location());
					}
				}
			}
			
		}while(loc != null && loc.size() > 0);
		
		hql = new StringBuffer();
		
		hql.append("select l1_1 from Location as l1_1 left join l1_1.type as l2_1	where (l1_1.type.id = :TheatreId and l1_1.id = :locatId and l1_1.isActive = :Active and  l1_1.isVirtual = :Virtual) ");
		
		loc = factory.find(hql.toString(), new String[] { "TheatreId","locatId","Active","Virtual" }, new Object[] { getDomLookup(LocationType.THEATRE).getId(),locRef.getID_Location(),true,false });
		if(	loc != null && loc.size() > 0)
		{
			LocationLiteVoCollection tempLocColl = LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(loc);
			if( tempLocColl != null && tempLocColl.size() > 0)
			{
				tempColl.add(tempLocColl.get(0));
			}
		}
	
		 


		return tempColl;
	}
	//wdev-15101
	public SurgicalAuditOperationDetailVo saveSurgicalAuditOperationDetail(ims.clinical.vo.SurgicalAuditOperationDetailVo record) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if (record == null )
		{
			throw new CodingRuntimeException("Cannot get SurgicalAuditOperationDetailVo on null Id ");
		}

		DomainFactory factory = getDomainFactory();
		
		SurgicalAuditOperationDetail domainSurgicalAudit = SurgicalAuditOperationDetailVoAssembler.extractSurgicalAuditOperationDetail(factory, record);
		factory.save(domainSurgicalAudit);
		return SurgicalAuditOperationDetailVoAssembler.create(domainSurgicalAudit);
	}

	public LocationLiteVoCollection listActiveLocationsAtTheSameLevelWithLocation(LocationRefVo locationRef)
	{
		if(locationRef == null || locationRef.getID_Location()==null)
			throw new CodingRuntimeException("Can not get LocationLiteVo value on null locationRef.");
		
		StringBuffer hql = new StringBuffer();
	
		hql.append("select loc from Location as loc left join loc.parentLocation as parentLoc ");
		hql.append("where (loc.isActive = :isActive and loc.isVirtual= :isVirtual and loc.type = :locType and parentLoc.id in (select loc.parentLocation.id  from Location as loc where (loc.id = :locID))) order by loc.name asc");
		
		DomainFactory factory = getDomainFactory();
		List<?> list = factory.find(hql.toString(), new String[] {"locID","isActive","isVirtual","locType"}, new Object[] {locationRef.getID_Location(),true,false,getDomLookup(LocationType.WARD)});
		
		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(list);
	}

	public LocationLiteVoCollection listLocationsByParentLocation(LocationRefVo locationRef)
	{
		if(locationRef == null || locationRef.getID_Location()==null)
			throw new CodingRuntimeException("Can not get LocationLiteVo value on null locationRef.");
		
		StringBuffer hql = new StringBuffer();
	
		hql.append("select loc from Location as loc left join loc.parentLocation as parentLoc ");
		hql.append("where (loc.isActive = :isActive and loc.isVirtual= :isVirtual and loc.type = :locType and parentLoc.id = :locID) order by loc.name asc");
		
		DomainFactory factory = getDomainFactory();
		List<?> list = factory.find(hql.toString(), new String[] {"locID","isActive","isVirtual","locType"}, new Object[] {locationRef.getID_Location(),true,false,getDomLookup(LocationType.WARD)});
		
		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(list);
	}

	public Boolean isStale(SurgicalAuditOperationDetailVo surgAudit)
	{
		if (surgAudit == null || surgAudit.getID_SurgicalAuditOperationDetail() == null)
		{
			throw new CodingRuntimeException("Cannot get SurgicalAuditOperationDetailVo on null Id ");
		}
				
		DomainFactory factory = getDomainFactory();
		SurgicalAuditOperationDetail domainSurgAudit = (SurgicalAuditOperationDetail) factory.getDomainObject(SurgicalAuditOperationDetail.class, surgAudit.getID_SurgicalAuditOperationDetail());
		
		if(domainSurgAudit==null)
		{
			return true;
		}
		
		if (domainSurgAudit.getVersion() > surgAudit.getVersion_SurgicalAuditOperationDetail())
		{
			return true;
		}
		
		return false;
	}

	public LocationLiteVo getLocationLiteVo(LocSiteRefVo locSiteRef)
	{
		if( locSiteRef == null)
			throw new DomainRuntimeException("Location cannot be null.");
		
		
		DomainFactory factory = getDomainFactory();
		Location doLocation = (Location) factory.getDomainObject(Location.class, locSiteRef.getID_Location());
		return LocationLiteVoAssembler.create(doLocation);
	}

	//WDEV-15675
	public LocationLiteVoCollection listLocationsByParentLocation(LocationRefVo locationRef, LocationType locType)
	{
		if(locationRef == null || locationRef.getID_Location()==null)
			throw new CodingRuntimeException("Can not get LocationLiteVo value on null locationRef.");
		
		StringBuffer hql = new StringBuffer();
	
		hql.append("select loc from Location as loc left join loc.parentLocation as parentLoc ");
		hql.append("where (loc.isActive = :isActive and loc.isVirtual= :isVirtual and loc.type = :locType and parentLoc.id = :locID) order by loc.name asc");
		
		DomainFactory factory = getDomainFactory();
		List<?> list = factory.find(hql.toString(), new String[] {"locID","isActive","isVirtual","locType"}, new Object[] {locationRef.getID_Location(),true,false,getDomLookup(locType)});
		
		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(list);
	}

	//WDEV-15675
	public LocationLiteVoCollection listActiveLocationsAtTheSameLevelWithLocation(LocationRefVo locationRef, LocationType locType)
	{
		if(locationRef == null || locationRef.getID_Location()==null)
			throw new CodingRuntimeException("Can not get LocationLiteVo value on null locationRef.");
		
		StringBuffer hql = new StringBuffer();
	
		hql.append("select loc from Location as loc left join loc.parentLocation as parentLoc ");
		hql.append("where (loc.isActive = :isActive and loc.isVirtual= :isVirtual and loc.type = :locType and parentLoc.id in (select loc.parentLocation.id  from Location as loc where (loc.id = :locID))) order by loc.name asc");
		
		DomainFactory factory = getDomainFactory();
		List<?> list = factory.find(hql.toString(), new String[] {"locID","isActive","isVirtual","locType"}, new Object[] {locationRef.getID_Location(),true,false,getDomLookup(locType)});
		
		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(list);
	}

}
