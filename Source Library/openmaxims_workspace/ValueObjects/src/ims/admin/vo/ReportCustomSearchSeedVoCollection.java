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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.admin.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;


public class ReportCustomSearchSeedVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ReportCustomSearchSeedVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ReportCustomSearchSeedVo> col = new ArrayList<ReportCustomSearchSeedVo>();
	public String getBoClassName()
	{
		return null;
	}
	public boolean add(ReportCustomSearchSeedVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ReportCustomSearchSeedVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(ReportCustomSearchSeedVo instance)
	{
		return col.indexOf(instance);
	}
	public ReportCustomSearchSeedVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ReportCustomSearchSeedVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ReportCustomSearchSeedVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ReportCustomSearchSeedVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ReportCustomSearchSeedVoCollection clone = new ReportCustomSearchSeedVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ReportCustomSearchSeedVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public ReportCustomSearchSeedVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ReportCustomSearchSeedVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ReportCustomSearchSeedVoCollection sort(SortOrder order)
	{
		return sort(new ReportCustomSearchSeedVoComparator(order));
	}
	public ReportCustomSearchSeedVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ReportCustomSearchSeedVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ReportCustomSearchSeedVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ReportCustomSearchSeedVo[] toArray()
	{
		ReportCustomSearchSeedVo[] arr = new ReportCustomSearchSeedVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ReportCustomSearchSeedVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ReportCustomSearchSeedVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ReportCustomSearchSeedVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ReportCustomSearchSeedVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ReportCustomSearchSeedVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ReportCustomSearchSeedVo voObj1 = (ReportCustomSearchSeedVo)obj1;
			ReportCustomSearchSeedVo voObj2 = (ReportCustomSearchSeedVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.admin.vo.beans.ReportCustomSearchSeedVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.admin.vo.beans.ReportCustomSearchSeedVoBean[] getBeanCollectionArray()
	{
		ims.admin.vo.beans.ReportCustomSearchSeedVoBean[] result = new ims.admin.vo.beans.ReportCustomSearchSeedVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ReportCustomSearchSeedVo vo = ((ReportCustomSearchSeedVo)col.get(i));
			result[i] = (ims.admin.vo.beans.ReportCustomSearchSeedVoBean)vo.getBean();
		}
		return result;
	}
	public static ReportCustomSearchSeedVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ReportCustomSearchSeedVoCollection coll = new ReportCustomSearchSeedVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.admin.vo.beans.ReportCustomSearchSeedVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ReportCustomSearchSeedVoCollection buildFromBeanCollection(ims.admin.vo.beans.ReportCustomSearchSeedVoBean[] beans)
	{
		ReportCustomSearchSeedVoCollection coll = new ReportCustomSearchSeedVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}