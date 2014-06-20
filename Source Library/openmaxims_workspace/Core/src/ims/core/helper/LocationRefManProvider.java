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

import ims.core.resource.domain.objects.HcpLocation;
import ims.core.resource.people.domain.objects.MemberOfStaff;
import ims.core.resource.place.domain.objects.LocSite;
import ims.core.resource.place.domain.objects.Location;
import ims.core.resource.place.domain.objects.Organisation;
import ims.core.vo.lookups.OrganisationType;
import ims.domain.DomainFactory;
import ims.framework.interfaces.IAppUser;
import ims.framework.interfaces.ILocation;
import ims.framework.interfaces.ILocationProvider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationRefManProvider extends LocationProvider implements ILocationProvider
{
	private static final long serialVersionUID = 1L;

	/**
	 * Function used to determine if an Organization has locations
	 */
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

		condStr.append(andStr + " ((o.type != :GP and o.type != :SUP) or o.type.id is null)");	//WDEV-11814
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
		  	res = checkForValidLocation(iterator.next(), user);
		  	if (res)
				return true;
			else
				continue;  
		}

		return false;
	}
	
	private boolean checkForValidLocation(Organisation bo, IAppUser user) 
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
				if (Boolean.TRUE.equals(locationsSite.isIsActive()) && Boolean.FALSE.equals(locationsSite.isIsVirtual()) && locationIsAllowed(locationsSite, user))
					return true;
	
				// If the location site is not allowed check it's locations for a valid location				
				Iterator locationSite = ((Iterable<Location>) locationsSite.getLocations()).iterator(); 
				while (locationSite.hasNext()) 
				{ 
					Location locSite = (Location)locationSite.next();
					if (checkForValidLocation(locSite, user))
						return true;
				}
			}
		}
		// At this point return false
		return false;		
	}

	private boolean checkForValidLocation(LocSite locSite, IAppUser user) 
	{
		// If the location is null - then return false
		if (locSite == null)
			return false;
		
		// If the location itself is an allowed location - return true
		if (Boolean.TRUE.equals(locSite.isIsActive()) && Boolean.FALSE.equals(locSite.isIsVirtual()) && locationIsAllowed(locSite, user))
			return true;
		
		if (locSite.getLocations() != null)
		{		
			// Recursively check the sub locations
			Iterator locationSite = ((Iterable<Location>) locSite.getLocations()).iterator(); 
			while (locationSite.hasNext()) 
			{ 
				Location location = (Location)locationSite.next();			
				if (checkForValidLocation(location, user))
					return true;
			}
		}
				
		// At this point return false
		return false;
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

	public boolean locationIsAllowed(ILocation location, IAppUser user) 
	{
		if (location == null)
			return false;

		if (user == null)
			return false;

		if (user.getMosId() == null)
			return true;

		DomainFactory factory = getDomainFactory();		
		MemberOfStaff memberOfStaff = (MemberOfStaff) factory.getDomainObject(MemberOfStaff.class, user.getMosId());		
		Location locationShort = (Location) factory.getDomainObject(Location.class, location.getID());
				
		// If the member of staff has no locations - return false
		if (memberOfStaff.getLocations() == null)
			return false;		
		
		Iterator it = ((Iterable<HcpLocation>) memberOfStaff.getLocations()).iterator(); 
		while (it.hasNext()) 
		{ 
			HcpLocation hcpLocation = (HcpLocation) it.next(); 
			
			// Skip to next location if the HCP location is null or HCP location doesn't have a location 
			if (hcpLocation == null)
				continue;

			if (hcpLocation.getLocation() == null)
				continue;

			// The locations match - return true
			if (hcpLocation.getLocation().equals(locationShort))
				return true;			 
		}
				
		// No matching location found - return false			
		return false;
	}
	
	private boolean locationIsAllowed(Location location, IAppUser user) 
	{
		if (location == null)
			return false;

		if (user == null)
			return false;

		if (user.getMosId() == null)
			return true;

		DomainFactory factory = getDomainFactory();		
		MemberOfStaff memberOfStaff = (MemberOfStaff) factory.getDomainObject(MemberOfStaff.class, user.getMosId());				
				
		// If the member of staff has no locations - return false
		if (memberOfStaff.getLocations() == null)
			return false;
				
		Iterator it = ((Iterable<HcpLocation>) memberOfStaff.getLocations()).iterator(); 
		while (it.hasNext()) 
		{ 
			HcpLocation hcpLocation = (HcpLocation) it.next(); 
			
			// Skip to next location if the HCP location is null or HCP location doesn't have a location 
			if (hcpLocation == null)
				continue;

			if (hcpLocation.getLocation() == null)
				continue;

			// The locations match - return true
			if (hcpLocation.getLocation().equals(location))
				return true;			 
		}
				
		// No matching location found - return false			
		return false;
	}

	public boolean shouldSelectLocation(IAppUser user)
	{
		if (user != null && user.getMosId() != null)
			return true;

		return false;
	}

	public ILocation[] listConfiguredUserLocations(IAppUser user) 
	{
		return super.listConfiguredUserLocations(user);
	}

	public ILocation validateLocation(ILocation location) 
	{
		return super.validateLocation(location);
	}
}
