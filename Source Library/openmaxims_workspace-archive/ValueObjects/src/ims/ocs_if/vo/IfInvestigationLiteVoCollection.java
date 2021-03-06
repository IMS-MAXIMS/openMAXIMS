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

package ims.ocs_if.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to OCRR.Configuration.Investigation business object (ID: 1058100001).
 */
public class IfInvestigationLiteVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<IfInvestigationLiteVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<IfInvestigationLiteVo> col = new ArrayList<IfInvestigationLiteVo>();
	public String getBoClassName()
	{
		return "ims.ocrr.configuration.domain.objects.Investigation";
	}
	public boolean add(IfInvestigationLiteVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, IfInvestigationLiteVo value)
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
	public int indexOf(IfInvestigationLiteVo instance)
	{
		return col.indexOf(instance);
	}
	public IfInvestigationLiteVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, IfInvestigationLiteVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(IfInvestigationLiteVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(IfInvestigationLiteVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		IfInvestigationLiteVoCollection clone = new IfInvestigationLiteVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((IfInvestigationLiteVo)this.col.get(x).clone());
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
	public IfInvestigationLiteVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public IfInvestigationLiteVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public IfInvestigationLiteVoCollection sort(SortOrder order)
	{
		return sort(new IfInvestigationLiteVoComparator(order));
	}
	public IfInvestigationLiteVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new IfInvestigationLiteVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public IfInvestigationLiteVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.ocrr.configuration.vo.InvestigationRefVoCollection toRefVoCollection()
	{
		ims.ocrr.configuration.vo.InvestigationRefVoCollection result = new ims.ocrr.configuration.vo.InvestigationRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public IfInvestigationLiteVo[] toArray()
	{
		IfInvestigationLiteVo[] arr = new IfInvestigationLiteVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<IfInvestigationLiteVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class IfInvestigationLiteVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public IfInvestigationLiteVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public IfInvestigationLiteVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public IfInvestigationLiteVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			IfInvestigationLiteVo voObj1 = (IfInvestigationLiteVo)obj1;
			IfInvestigationLiteVo voObj2 = (IfInvestigationLiteVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.ocs_if.vo.beans.IfInvestigationLiteVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.ocs_if.vo.beans.IfInvestigationLiteVoBean[] getBeanCollectionArray()
	{
		ims.ocs_if.vo.beans.IfInvestigationLiteVoBean[] result = new ims.ocs_if.vo.beans.IfInvestigationLiteVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			IfInvestigationLiteVo vo = ((IfInvestigationLiteVo)col.get(i));
			result[i] = (ims.ocs_if.vo.beans.IfInvestigationLiteVoBean)vo.getBean();
		}
		return result;
	}
	public static IfInvestigationLiteVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		IfInvestigationLiteVoCollection coll = new IfInvestigationLiteVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.ocs_if.vo.beans.IfInvestigationLiteVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static IfInvestigationLiteVoCollection buildFromBeanCollection(ims.ocs_if.vo.beans.IfInvestigationLiteVoBean[] beans)
	{
		IfInvestigationLiteVoCollection coll = new IfInvestigationLiteVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
