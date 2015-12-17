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
import java.util.HashMap;

public class PairUnionQuery
{
	private String queryConditionPart;
	private HashMap<QueryJoinEnum, String> queryJoinsPart;
	private ArrayList<Object> parameters;
	
	
	/**
	 * @param queryWherePart
	 * @param queryFromPart
	 */
	public PairUnionQuery(String condition, HashMap<QueryJoinEnum, String> joins, ArrayList<Object> parameters)
	{
		if (condition == null)
			throw new IllegalArgumentException("Condition cannot be null.");
		
		this.queryConditionPart = condition;
		
		if (joins != null)
			this.queryJoinsPart = joins;
		
		if (parameters != null)
			this.parameters = parameters;
	}
	
	
	public String getQueryCondition()
	{
		return this.queryConditionPart;
	}

	public HashMap<QueryJoinEnum, String> getQueryJoins()
	{
		return this.queryJoinsPart;
	}
	
	public ArrayList<Object> getQueryParameters()
	{
		return this.parameters;
	}
}
