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
package ims.core.helper;

import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.place.domain.objects.LocSite;
import ims.core.resource.place.domain.objects.Location;
import ims.core.resource.place.domain.objects.Organisation;
import ims.core.vo.HcpLocationVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.MemberOfStaffVo;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.domain.MemberOfStaffVoAssembler;
import ims.core.vo.lookups.OrganisationType;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppUser;
import ims.framework.interfaces.ILocation;
import ims.framework.interfaces.ILocationProvider;
import ims.framework.interfaces.IOrganisation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationProvider extends DomainImpl implements ILocationProvider
{
	private static final long serialVersionUID = 1L;
 
	public ILocation validateLocation(ILocation location) 
	{
		if(location == null)
			return null;
		
		LocationLiteVo result = LocationLiteVoAssembler.create((Location)getDomainFactory().getDomainObject(Location.class, location.getID()));
		if(result != null && (result.getIsActive() == null || !result.getIsActive().booleanValue()))
			return null;
		
		return result;
	}
	public boolean locationIsAllowed(ILocation location, IAppUser user) 
	{
		if(location == null)
			throw new RuntimeException("Invalid location");
		if(user == null)
			throw new RuntimeException("Invalid user");
		
		return true;
	}
	
	public boolean hasLocations(IAppUser user)
	{
		DomainFactory factory = getDomainFactory();

		String hql = " from Organisation o ";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		StringBuffer condStr = new StringBuffer();
		String andStr = " ";

		condStr.append(andStr + " o.isActive = :isActive");
		markers.add("isActive");
		values.add(Boolean.TRUE);
		andStr = " and ";

		condStr.append(andStr + " ((o.type != :GP and o.type != :SUP) or o.type.id is null)"); 	//WDEV-11814
		markers.add("GP");
		values.add(getDomLookup(OrganisationType.GPP));
		markers.add("SUP");		//WDEV-11814
		values.add(getDomLookup(OrganisationType.SUPPLIER)); 	//WDEV-11814
		andStr = " and ";

		hql += " where ";		
		hql += condStr.toString();
		hql += " order by o.id ";
		
		List list = factory.find(hql, markers, values);
				
		boolean res = false;
		Iterator<Organisation> iterator = list.iterator();
		while ( iterator.hasNext() )
		{
		  	res = checkForValidLocation(iterator.next());
		  	if (res)
				return true;
			else
				continue;  
		}

		return false;
	}
	
	private boolean checkForValidLocation(Organisation bo) 
	{
		// Check is the organization is null (should never be true, but keep the check)
		if (bo == null)
			return false;		
		
		if (bo.getLocationSites() != null)
		{		
			Iterator it = ((Iterable<LocSite>) bo.getLocationSites()).iterator(); 
			while (it.hasNext()) 
			{ 
				LocSite locationsSite = (LocSite) it.next(); 
				
				// If the location site is allowed return true and end function here
				if (Boolean.TRUE.equals(locationsSite.isIsActive()) && Boolean.FALSE.equals(locationsSite.isIsVirtual()) && locationIsAllowed(locationsSite, null))
					return true;
	
				// If the location site is not allowed check it's locations for a valid location				
				Iterator locationSite = ((Iterable<Location>) locationsSite.getLocations()).iterator(); 
				while (locationSite.hasNext()) 
				{ 
					Location locSite = (Location)locationSite.next();
					if (checkForValidLocation(locSite, null))
						return true;
				}
			}
		}
		// At this point return false
		return false;			
	}
	
	private boolean locationIsAllowed(Location location, IAppUser user) 
	{
		if (location == null)
			return false;
		
		return true;
	}
	
	private boolean checkForValidLocation(Location location, IAppUser user) 
	{
		// If the location is null - then return false
		if (location == null)
			return false;
		
		// If the location itself is an allowed location - return true
		if (Boolean.TRUE.equals(location.isIsActive()) && Boolean.FALSE.equals(location.isIsVirtual()) && locationIsAllowed(location, user))
			return true;
		
		if (location.getLocations() != null)
		{			
			// Recursively check the sub locations
			Iterator locationSite = ((Iterable<LocSite>) location.getLocations()).iterator(); 
			while (locationSite.hasNext()) 
			{ 
				Location locationChild = (Location)locationSite.next();
				
				if (checkForValidLocation(locationChild, user))
					return true;
			}
		}
		
		// At this point return false		
		return false;	
	}
	
	public boolean shouldSelectLocation(IAppUser user)
	{
		return false;
	}
	
	public ILocation[] listConfiguredUserLocations(IAppUser user) 
	{
		if (user == null)
			throw new RuntimeException("Invalid user");

		if (user.getMosId() == null)
			return new ILocation[0];
		
		DomainFactory factory = getDomainFactory();

		// Get the member of staff and the location from database
		MemberOfStaffVo memberOfStaff = MemberOfStaffVoAssembler.create((MemberOfStaff) factory.getDomainObject(MemberOfStaff.class, user.getMosId()));
		
		// If the member of staff has no locations - return false
		if (memberOfStaff.getLocations() == null)
			return new ILocation[0];

		LocationLiteVoCollection locColl = new LocationLiteVoCollection();
		
		// Check for a location for the member of staff
		for (int i = 0; i < memberOfStaff.getLocations().size(); i++)
		{
			HcpLocationVo hcpLocation = memberOfStaff.getLocations().get(i);

			// Skip to next location if the HCP location is null or HCP location doesn't have a location 
			if (hcpLocation == null)
				continue;

			if (hcpLocation.getLocation() == null)
				continue;

			if (hcpLocation.getLocation().getIsActiveIsNotNull() && !hcpLocation.getLocation().getIsActive())
				continue;
			
			if(hcpLocation.getLocation().getIsVirtualIsNotNull() && hcpLocation.getLocation().getIsVirtual())
				continue;
			
			// The locations match - return true
			locColl.add(hcpLocation.getLocation());
		}

		return locColl.size() == 0 ? new ILocation[0] : locColl.sort(true).toILocationArray();
	}
}
