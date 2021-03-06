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

package ims.nursing.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to nursing.assessment.Bladder Management business object (ID: 1015100003).
 */
public class BladderManagementCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<BladderManagement>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<BladderManagement> col = new ArrayList<BladderManagement>();
	public String getBoClassName()
	{
		return "ims.nursing.assessment.domain.objects.BladderManagement";
	}
	public boolean add(BladderManagement value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, BladderManagement value)
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
	public int indexOf(BladderManagement instance)
	{
		return col.indexOf(instance);
	}
	public BladderManagement get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, BladderManagement value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(BladderManagement instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(BladderManagement instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		BladderManagementCollection clone = new BladderManagementCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((BladderManagement)this.col.get(x).clone());
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
	public BladderManagementCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public BladderManagementCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public BladderManagementCollection sort(SortOrder order)
	{
		return sort(new BladderManagementComparator(order));
	}
	public BladderManagementCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new BladderManagementComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public BladderManagementCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.nursing.assessment.vo.BladderManagementRefVoCollection toRefVoCollection()
	{
		ims.nursing.assessment.vo.BladderManagementRefVoCollection result = new ims.nursing.assessment.vo.BladderManagementRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public BladderManagement[] toArray()
	{
		BladderManagement[] arr = new BladderManagement[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<BladderManagement> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class BladderManagementComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public BladderManagementComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public BladderManagementComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public BladderManagementComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			BladderManagement voObj1 = (BladderManagement)obj1;
			BladderManagement voObj2 = (BladderManagement)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.nursing.vo.beans.BladderManagementBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.nursing.vo.beans.BladderManagementBean[] getBeanCollectionArray()
	{
		ims.nursing.vo.beans.BladderManagementBean[] result = new ims.nursing.vo.beans.BladderManagementBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			BladderManagement vo = ((BladderManagement)col.get(i));
			result[i] = (ims.nursing.vo.beans.BladderManagementBean)vo.getBean();
		}
		return result;
	}
	public static BladderManagementCollection buildFromBeanCollection(java.util.Collection beans)
	{
		BladderManagementCollection coll = new BladderManagementCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.nursing.vo.beans.BladderManagementBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static BladderManagementCollection buildFromBeanCollection(ims.nursing.vo.beans.BladderManagementBean[] beans)
	{
		BladderManagementCollection coll = new BladderManagementCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
