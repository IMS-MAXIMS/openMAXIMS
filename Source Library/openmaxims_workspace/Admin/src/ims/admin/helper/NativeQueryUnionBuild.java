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
import java.util.Map;
import java.util.TreeMap;


public class NativeQueryUnionBuild
{
	private class TreeNode
	{
		private StringBuilder queryConditionPart;
		private TreeMap<QueryJoinEnum, String> queryJoinsPart;
		private ArrayList<Object> parameters;

		private ArrayList<TreeNode> leafNodes;
		private boolean analyzed = false;
		

		public TreeNode(HashMap<QueryJoinEnum, String> queryJoinsPart, String queryConditionPart, ArrayList<Object> parameters)
		{
			this.queryConditionPart = new StringBuilder();
			this.queryJoinsPart = new TreeMap<QueryJoinEnum, String>();
			this.parameters = new ArrayList<Object>();
			
			
			// Add the query condition part
			if (queryConditionPart != null)
				this.queryConditionPart.append(queryConditionPart);
			
			// Add the query joins part
			if (queryJoinsPart != null)
				this.queryJoinsPart.putAll(queryJoinsPart);
			
			// Add the parameters part
			if (parameters != null)
				this.parameters.addAll(parameters);
				
			
			this.leafNodes = new ArrayList<NativeQueryUnionBuild.TreeNode>();
			this.analyzed = false;
		}
		
		
		public void addUnionConditions(ArrayList<PairUnionQuery> unionConditions)
		{
			if (leafNodes.size() == 0)
			{
				for (PairUnionQuery unionEntry : unionConditions)
				{
					TreeNode node = new TreeNode(unionEntry.getQueryJoins(), unionEntry.getQueryCondition(), unionEntry.getQueryParameters());
					
					this.leafNodes.add(node);
				}
			}
			else
			{
				for (TreeNode node : leafNodes)
				{
					node.addUnionConditions(unionConditions);
				}
			}
		}

		
		public boolean isAnalyzed()
		{
			return analyzed;
		}

	
		/**
		 * 
		 * @param querySelectPart
		 * @param queryFromPart
		 * @param joinKeys			-- ATENTION: This parameter is passed down from the root node for each branch and keys are added into it
		 * 											If there is a case where the branch needs to be abandoned, be sure that you don't have the *UNDESIRABLE EFFECTS*
		 * @param queryWherePart
		 * @param parameters		-- ATENTION: This parameter is passed down form the root node for each branch and parameters are added into it
		 * 											If there is a case where the branch needs to be abandoned, the parameters collection will be discarded
		 * 											If the branch turns out to be valid, then the array will be added to the general array of parameters
		 * 
		 * @return	<li><b>true</b> if the branch is a valid one and needs to be added as a query to the general UNION query
		 * 			<li><b>true</b> if the branch is not a valid one and query, parameters and join keys will be discarded
		 */
		public boolean getUnionQuery(StringBuilder query, StringBuilder joins, ArrayList<QueryJoinEnum> joinKeys, StringBuilder conditions, ArrayList<Object> parameters)
		{
			// Leave the SELECT part of the query as it is

			// Append the joins needed to the query
			for (Map.Entry<QueryJoinEnum, String> joinEntry : this.queryJoinsPart.entrySet())
			{
				if (!joinKeys.contains(joinEntry.getKey()))
				{
					joins.append(joinEntry.getValue());
					joinKeys.add(joinEntry.getKey());
				}
			}

			// Append the condition to the query
			conditions.append(this.queryConditionPart);
			
			// Append the parameters
			parameters.addAll(this.parameters);
			
			
			// Check node for child nodes
			// 		IF there are no child nodes, then mark node as analyzed and consider branch valid
			//		IF there are child nodes, analyze the child nodes that were not analyzed yet
			//				IF all child nodes were analyzed before, then consider this branch invalid - discard parameters, discard query (Discarding is done at root level)
			if (this.leafNodes != null && this.leafNodes.size() > 0)
			{
				for (TreeNode node : this.leafNodes)
				{
					if (!node.isAnalyzed())
					{
						return node.getUnionQuery(query, joins, joinKeys, conditions, parameters);
					}
				}
				
				this.analyzed = true;
				return false;
			}
			
			
			// If there were no child nodes then build up the query
			query.append(joins).append(conditions);
			this.analyzed = true;
			return true;	
		}
	}
	
	
	private StringBuilder selectPartOfQuery;
	private TreeMap<QueryJoinEnum, String> joinPartsOfQuery;
	private StringBuilder conditionPartOfQuery;
	private ArrayList<Object> parameters;
	private StringBuilder orderByClause;
	
	private ArrayList<TreeNode> leafNodes;
	
	
	public NativeQueryUnionBuild(String selectPart, HashMap<QueryJoinEnum, String> joinParts, String condition, ArrayList<Object> parameters)
	{
		this.selectPartOfQuery = new StringBuilder();
		this.joinPartsOfQuery = new TreeMap<QueryJoinEnum, String>();
		this.conditionPartOfQuery = new StringBuilder();
		this.parameters = new ArrayList<Object>();
		this.orderByClause = new StringBuilder();
		
		if (selectPart != null)
			this.selectPartOfQuery.append(selectPart);
		
		if (joinParts != null)
			this.joinPartsOfQuery.putAll(joinParts);
		
		if (condition != null)
			this.conditionPartOfQuery.append(condition);
		
		if (parameters != null)
			this.parameters.addAll(parameters);
		
		this.leafNodes = new ArrayList<NativeQueryUnionBuild.TreeNode>();
	}
	
	
	public void addOrderByClause(String orderBy)
	{
		if (orderBy == null)
			throw new IllegalArgumentException("Order By clause cannot be null!");
		
		this.orderByClause.append(orderBy);
	}

	/**
	 * Appends to root select part of the query
	 * @param querySelectPart - add the string to the root select part of the query, MANDATORY
	 * @param queryFromPart - add the string to the root from part of the query, can be null
	 */
	public void addQuerySelectPart(String select, HashMap<QueryJoinEnum, String> joins)
	{
		if (select == null)
			throw new IllegalArgumentException("The SELECT part of the query is mandatory.");
		
		this.selectPartOfQuery.append(select);
		
		if (joins != null)
		{
			for (Map.Entry<QueryJoinEnum, String> joinEntry : joins.entrySet())
			{
				if (!this.joinPartsOfQuery.containsKey(joinEntry.getKey()))
				{
					this.joinPartsOfQuery.put(joinEntry.getKey(), joinEntry.getValue());
				}
			}
		}
	}
	
	
	/**
	 * Appends to root from part of the query
	 * @param queryFromPart
	 */
	public void addQueryJoinPart(HashMap<QueryJoinEnum, String> joins)
	{
		if (joins == null)
			throw new IllegalArgumentException("The JOIN parts of the query is mandatory.");
		
		for (Map.Entry<QueryJoinEnum, String> joinEntry : joins.entrySet())
		{
			if (!this.joinPartsOfQuery.containsKey(joinEntry.getKey()))
			{
				this.joinPartsOfQuery.put(joinEntry.getKey(), joinEntry.getValue());
			}
		}
	}
	
	
	/**
	 * Appends to root where part of the query
	 * @param condition - add the string to the root where part of the query, MANDATORY
	 * @param queryFromPart - add the string to the root from part of the query, can be null
	 */
	public void addQueryConditionPart(String condition, ArrayList<Object> parameters, HashMap<QueryJoinEnum, String> joins)
	{
		if (condition == null)
			throw new IllegalArgumentException("The CONDITION part of the query is mandatory.");
		
		this.conditionPartOfQuery.append(condition);
		
		if (parameters != null)
			this.parameters.addAll(parameters);
		
		
		if (joins != null)
		{
			for (Map.Entry<QueryJoinEnum, String> joinEntry : joins.entrySet())
			{
				if (!this.joinPartsOfQuery.containsKey(joinEntry.getKey()))
				{
					this.joinPartsOfQuery.put(joinEntry.getKey(), joinEntry.getValue());
				}
			}
		}
	}
	
	public void addQueryConditionPart(String condition, Object parameter, HashMap<QueryJoinEnum, String> joins)
	{
		if (condition == null)
			throw new IllegalArgumentException("The CONDITION part of the query is mandatory.");
		
		this.conditionPartOfQuery.append(condition);
		
		if (parameter != null)
			this.parameters.add(parameter);
		
		if (joins != null)
		{
			for (Map.Entry<QueryJoinEnum, String> joinEntry : joins.entrySet())
			{
				if (!this.joinPartsOfQuery.containsKey(joinEntry.getKey()))
				{
					this.joinPartsOfQuery.put(joinEntry.getKey(), joinEntry.getValue());
				}
			}
		}
	}
	
	
	public void addUnionConditions(ArrayList<PairUnionQuery> unionConditions)
	{
		if (leafNodes.size() == 0)
		{
			for (PairUnionQuery unionEntry : unionConditions)
			{
				TreeNode node = new TreeNode(unionEntry.getQueryJoins(), unionEntry.getQueryCondition(), unionEntry.getQueryParameters());
				
				this.leafNodes.add(node);
			}
		}
		else
		{
			for (TreeNode node : leafNodes)
			{
				node.addUnionConditions(unionConditions);
			}
		}
	}
	
	
	public NativeQuery getFullQuery()
	{
		StringBuilder fullQuery = new StringBuilder();
		ArrayList<Object> queryParameters = new ArrayList<Object>();

		if (this.leafNodes == null || this.leafNodes.size() == 0)
		{
			fullQuery.append(this.selectPartOfQuery);
			
			for (Map.Entry<QueryJoinEnum, String> joinEntry : this.joinPartsOfQuery.entrySet())
				fullQuery.append(joinEntry.getValue());
			
			fullQuery.append(this.conditionPartOfQuery);
			
			queryParameters.addAll(this.parameters);
			
			return new NativeQuery(fullQuery.toString(), queryParameters);
		}

		boolean firstIteration = true;
		
		for (TreeNode node : this.leafNodes)
		{
			while (!node.isAnalyzed())
			{
				// For each analysis of the node start with brand new set of values
				StringBuilder query = new StringBuilder(this.selectPartOfQuery);
				
				StringBuilder joins = new StringBuilder();
				ArrayList<QueryJoinEnum> joinKeys = new ArrayList<QueryJoinEnum>();
				
				for (Map.Entry<QueryJoinEnum, String> joinEntry : this.joinPartsOfQuery.entrySet())
				{
					joins.append(joinEntry.getValue());
					joinKeys.add(joinEntry.getKey());
				}
				
				StringBuilder conditions = new StringBuilder(this.conditionPartOfQuery);
				
				ArrayList<Object> parameters = new ArrayList<Object>();
				parameters.addAll(this.parameters);
				
				if (node.getUnionQuery(query, joins, joinKeys, conditions, parameters))
				{
					if (!firstIteration)
						fullQuery.append(" UNION ");
					
					fullQuery.append(query);
					firstIteration = false;
					
					queryParameters.addAll(parameters);
				}
			}
		}
		
		fullQuery.append(this.orderByClause);
		
		return new NativeQuery(fullQuery.toString(), queryParameters);
	}
}
