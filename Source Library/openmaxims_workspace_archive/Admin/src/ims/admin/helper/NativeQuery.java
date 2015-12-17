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
package ims.admin.helper;

import java.util.ArrayList;

public class NativeQuery
{
	private String query;
	private ArrayList<Object> parameters;
	
	
	public NativeQuery(String query, ArrayList<Object> parameters)
	{
		if (query == null)
			throw new IllegalArgumentException("Query cannot be null.");
		
		this.query = query;
		
		if (parameters != null)
		{
			this.parameters = new ArrayList<Object>();
			this.parameters.addAll(parameters);
		}
	}
	
	public String getQuery()
	{
		return this.query;
	}
	
	public ArrayList<Object> getParameters()
	{
		return this.parameters;
	}
}
