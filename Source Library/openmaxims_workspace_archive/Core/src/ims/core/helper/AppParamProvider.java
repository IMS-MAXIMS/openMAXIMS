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


import ims.core.vo.LocationLiteVo;
import ims.framework.UIEngine;
import ims.framework.interfaces.IAppParam;
import ims.framework.interfaces.IAppParamHandlerProvider;
import ims.framework.interfaces.ILocation;

public class AppParamProvider implements IAppParamHandlerProvider{

	public void handle(UIEngine engine, IAppParam[] params) 
	{
		//add handlers here
		processLocationContext(engine, params, "locid");			
	}

	private void processLocationContext(UIEngine engine, IAppParam[] params, String location) {
		String name,value,locId;
		
		locId = "";
		
		if (params != null && params.length > 0)
		{
			for(int i = 0; i<params.length; i++)
			{
				name = params[i].getName();
				value = params[i].getValue();
				if (name.equals(location))
				{
					locId = value;
					break;
				}
			}
		}
		
		if (locId != "")
		{
			//set ILocation
			LocationLiteVo loc = new LocationLiteVo();
			
			//conv locId to int
			Integer iLocId = new Integer(locId);
			loc.setID_Location(iLocId);
			
			ILocation validLocation = engine.getLocationProvider().validateLocation(loc);
			
			if (validLocation != null)
				engine.setCurrentLocation(validLocation);
		}
	}

}
