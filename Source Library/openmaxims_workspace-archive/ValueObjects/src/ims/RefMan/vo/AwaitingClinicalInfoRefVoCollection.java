// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to RefMan.AwaitingClinicalInfo business object (ID: 1096100044).
 */
public class AwaitingClinicalInfoRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<AwaitingClinicalInfoRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<AwaitingClinicalInfoRefVo> col = new ArrayList<AwaitingClinicalInfoRefVo>();
	public final String getBoClassName()
	{
		return "ims.RefMan.domain.objects.AwaitingClinicalInfo";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(AwaitingClinicalInfoRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, AwaitingClinicalInfoRefVo value)
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
	public int indexOf(AwaitingClinicalInfoRefVo instance)
	{
		return col.indexOf(instance);
	}
	public AwaitingClinicalInfoRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, AwaitingClinicalInfoRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(AwaitingClinicalInfoRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(AwaitingClinicalInfoRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		AwaitingClinicalInfoRefVoCollection clone = new AwaitingClinicalInfoRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((AwaitingClinicalInfoRefVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		return clone;
	}
	public boolean isValidated()
	{
		return true;
	}
	public String[] validate()
	{
		return null;
	}
	public AwaitingClinicalInfoRefVo[] toArray()
	{
		AwaitingClinicalInfoRefVo[] arr = new AwaitingClinicalInfoRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public AwaitingClinicalInfoRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public AwaitingClinicalInfoRefVoCollection sort(SortOrder order)
	{
		return sort(new AwaitingClinicalInfoRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public AwaitingClinicalInfoRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<AwaitingClinicalInfoRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class AwaitingClinicalInfoRefVoComparator implements Comparator
	{
		private int direction = 1;
		public AwaitingClinicalInfoRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public AwaitingClinicalInfoRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			AwaitingClinicalInfoRefVo voObj1 = (AwaitingClinicalInfoRefVo)obj1;
			AwaitingClinicalInfoRefVo voObj2 = (AwaitingClinicalInfoRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}
