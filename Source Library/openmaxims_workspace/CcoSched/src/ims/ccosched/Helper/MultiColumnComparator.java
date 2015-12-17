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
/*
 * Created on 20 Nov 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.ccosched.Helper;

import java.util.Comparator;

/**
 * Used for sorting rows in a table.
 * Callback delegate to describe our particular collating sequence
 * to SunSort, binary search etc.
 * Objects at each grid point can be many
 * different types so long as they implement the Comparable interface,
 * and all objects in a column are of the same type.
 */
public class MultiColumnComparator implements Comparator
{
	/**
	 * List of columns we will sort, major key first,
	 * 0-based.
	 */
	private int[]		colsToSort;

	/**
	 * Do we sort the i'th most important column in ascending or
	 * descending order. true=ascending.
	 */
	private boolean[]	ascendingOnCol;

	/**
	 * public constructor
	 *
	 * @param colsToSort 0-based cols to sort. May not be null or empty.
	 * Specify most important (major) key first and tie breakers later.
	 * @param ascendingOncol. 0-based booleans how to sort each column you requested
	 * to be sorted in that same order (Don't include non-sort-key columns).
	 * true=ascending, false=descending. Array will always have same length as colsToSort.
	 */
	public MultiColumnComparator(int[] colsToSort, boolean[] ascendingOnCol)
	{
		if (colsToSort.length != ascendingOnCol.length)
		{
			throw new IllegalArgumentException("wrong length on MulticolumnComparator parms");
		}
		this.colsToSort = colsToSort;
		this.ascendingOnCol = ascendingOnCol;
	}

	/** Compare two rows.
	 * effectively returns a-b;
	 * e.g. +1 (or any +ve number) if a > b
	 * 0 if a == b
	 * -1 (or any -ve number) if a < b
	 */
	@SuppressWarnings("unchecked")
	public final int compare(Object a, Object b)
	{
		Object[] rowa = (Object[]) a;
		Object[] rowb = (Object[]) b;

		for (int i = 0; i < colsToSort.length; i++)
		{
			int col = colsToSort[i];
			int result = 0;
			
			if(rowa[col] == null || rowb[col] == null)
				result = -1;
			else
				result = ((Comparable) rowa[col]).compareTo(rowb[col]);
			
			if (result != 0)
			{
				if (ascendingOnCol[i])
					return result;
				
				return -result;
			}
		}// end for // everything was exactly equal
		return 0;
	} // end compare

} // end class MultiColumnComparator	
