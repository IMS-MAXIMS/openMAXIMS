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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo;


public class CaseNoteRequestsColumnWidthVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CaseNoteRequestsColumnWidthVo()
	{
	}
	public CaseNoteRequestsColumnWidthVo(ims.core.vo.beans.CaseNoteRequestsColumnWidthVoBean bean)
	{
		this.columntypewidth = bean.getColumnTypeWidth();
		this.columnrequestdatewidth = bean.getColumnRequestDateWidth();
		this.columnrequestlocationwidth = bean.getColumnRequestLocationWidth();
		this.columnrequestbywidth = bean.getColumnRequestByWidth();
		this.columnselectwidth = bean.getColumnSelectWidth();
		this.columnimage = bean.getColumnImage();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.CaseNoteRequestsColumnWidthVoBean bean)
	{
		this.columntypewidth = bean.getColumnTypeWidth();
		this.columnrequestdatewidth = bean.getColumnRequestDateWidth();
		this.columnrequestlocationwidth = bean.getColumnRequestLocationWidth();
		this.columnrequestbywidth = bean.getColumnRequestByWidth();
		this.columnselectwidth = bean.getColumnSelectWidth();
		this.columnimage = bean.getColumnImage();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.CaseNoteRequestsColumnWidthVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.CaseNoteRequestsColumnWidthVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.CaseNoteRequestsColumnWidthVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getColumnTypeWidthIsNotNull()
	{
		return this.columntypewidth != null;
	}
	public Integer getColumnTypeWidth()
	{
		return this.columntypewidth;
	}
	public void setColumnTypeWidth(Integer value)
	{
		this.isValidated = false;
		this.columntypewidth = value;
	}
	public boolean getColumnRequestDateWidthIsNotNull()
	{
		return this.columnrequestdatewidth != null;
	}
	public Integer getColumnRequestDateWidth()
	{
		return this.columnrequestdatewidth;
	}
	public void setColumnRequestDateWidth(Integer value)
	{
		this.isValidated = false;
		this.columnrequestdatewidth = value;
	}
	public boolean getColumnRequestLocationWidthIsNotNull()
	{
		return this.columnrequestlocationwidth != null;
	}
	public Integer getColumnRequestLocationWidth()
	{
		return this.columnrequestlocationwidth;
	}
	public void setColumnRequestLocationWidth(Integer value)
	{
		this.isValidated = false;
		this.columnrequestlocationwidth = value;
	}
	public boolean getColumnRequestByWidthIsNotNull()
	{
		return this.columnrequestbywidth != null;
	}
	public Integer getColumnRequestByWidth()
	{
		return this.columnrequestbywidth;
	}
	public void setColumnRequestByWidth(Integer value)
	{
		this.isValidated = false;
		this.columnrequestbywidth = value;
	}
	public boolean getColumnSelectWidthIsNotNull()
	{
		return this.columnselectwidth != null;
	}
	public Integer getColumnSelectWidth()
	{
		return this.columnselectwidth;
	}
	public void setColumnSelectWidth(Integer value)
	{
		this.isValidated = false;
		this.columnselectwidth = value;
	}
	public boolean getColumnImageIsNotNull()
	{
		return this.columnimage != null;
	}
	public Integer getColumnImage()
	{
		return this.columnimage;
	}
	public void setColumnImage(Integer value)
	{
		this.isValidated = false;
		this.columnimage = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof CaseNoteRequestsColumnWidthVo))
			return false;
		CaseNoteRequestsColumnWidthVo compareObj = (CaseNoteRequestsColumnWidthVo)obj;
		if(this.getColumnTypeWidth() == null && compareObj.getColumnTypeWidth() != null)
			return false;
		if(this.getColumnTypeWidth() != null && compareObj.getColumnTypeWidth() == null)
			return false;
		if(this.getColumnTypeWidth() != null && compareObj.getColumnTypeWidth() != null)
			if(!this.getColumnTypeWidth().equals(compareObj.getColumnTypeWidth()))
				return false;
		if(this.getColumnRequestDateWidth() == null && compareObj.getColumnRequestDateWidth() != null)
			return false;
		if(this.getColumnRequestDateWidth() != null && compareObj.getColumnRequestDateWidth() == null)
			return false;
		if(this.getColumnRequestDateWidth() != null && compareObj.getColumnRequestDateWidth() != null)
			if(!this.getColumnRequestDateWidth().equals(compareObj.getColumnRequestDateWidth()))
				return false;
		if(this.getColumnRequestLocationWidth() == null && compareObj.getColumnRequestLocationWidth() != null)
			return false;
		if(this.getColumnRequestLocationWidth() != null && compareObj.getColumnRequestLocationWidth() == null)
			return false;
		if(this.getColumnRequestLocationWidth() != null && compareObj.getColumnRequestLocationWidth() != null)
			if(!this.getColumnRequestLocationWidth().equals(compareObj.getColumnRequestLocationWidth()))
				return false;
		if(this.getColumnRequestByWidth() == null && compareObj.getColumnRequestByWidth() != null)
			return false;
		if(this.getColumnRequestByWidth() != null && compareObj.getColumnRequestByWidth() == null)
			return false;
		if(this.getColumnRequestByWidth() != null && compareObj.getColumnRequestByWidth() != null)
			if(!this.getColumnRequestByWidth().equals(compareObj.getColumnRequestByWidth()))
				return false;
		if(this.getColumnSelectWidth() == null && compareObj.getColumnSelectWidth() != null)
			return false;
		if(this.getColumnSelectWidth() != null && compareObj.getColumnSelectWidth() == null)
			return false;
		if(this.getColumnSelectWidth() != null && compareObj.getColumnSelectWidth() != null)
			return this.getColumnSelectWidth().equals(compareObj.getColumnSelectWidth());
		return super.equals(obj);
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		CaseNoteRequestsColumnWidthVo clone = new CaseNoteRequestsColumnWidthVo();
		
		clone.columntypewidth = this.columntypewidth;
		clone.columnrequestdatewidth = this.columnrequestdatewidth;
		clone.columnrequestlocationwidth = this.columnrequestlocationwidth;
		clone.columnrequestbywidth = this.columnrequestbywidth;
		clone.columnselectwidth = this.columnselectwidth;
		clone.columnimage = this.columnimage;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(CaseNoteRequestsColumnWidthVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CaseNoteRequestsColumnWidthVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		CaseNoteRequestsColumnWidthVo compareObj = (CaseNoteRequestsColumnWidthVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getColumnTypeWidth() == null && compareObj.getColumnTypeWidth() != null)
				return -1;
			if(this.getColumnTypeWidth() != null && compareObj.getColumnTypeWidth() == null)
				return 1;
			if(this.getColumnTypeWidth() != null && compareObj.getColumnTypeWidth() != null)
				retVal = this.getColumnTypeWidth().compareTo(compareObj.getColumnTypeWidth());
		}
		if (retVal == 0)
		{
			if(this.getColumnRequestDateWidth() == null && compareObj.getColumnRequestDateWidth() != null)
				return -1;
			if(this.getColumnRequestDateWidth() != null && compareObj.getColumnRequestDateWidth() == null)
				return 1;
			if(this.getColumnRequestDateWidth() != null && compareObj.getColumnRequestDateWidth() != null)
				retVal = this.getColumnRequestDateWidth().compareTo(compareObj.getColumnRequestDateWidth());
		}
		if (retVal == 0)
		{
			if(this.getColumnRequestLocationWidth() == null && compareObj.getColumnRequestLocationWidth() != null)
				return -1;
			if(this.getColumnRequestLocationWidth() != null && compareObj.getColumnRequestLocationWidth() == null)
				return 1;
			if(this.getColumnRequestLocationWidth() != null && compareObj.getColumnRequestLocationWidth() != null)
				retVal = this.getColumnRequestLocationWidth().compareTo(compareObj.getColumnRequestLocationWidth());
		}
		if (retVal == 0)
		{
			if(this.getColumnRequestByWidth() == null && compareObj.getColumnRequestByWidth() != null)
				return -1;
			if(this.getColumnRequestByWidth() != null && compareObj.getColumnRequestByWidth() == null)
				return 1;
			if(this.getColumnRequestByWidth() != null && compareObj.getColumnRequestByWidth() != null)
				retVal = this.getColumnRequestByWidth().compareTo(compareObj.getColumnRequestByWidth());
		}
		if (retVal == 0)
		{
			if(this.getColumnSelectWidth() == null && compareObj.getColumnSelectWidth() != null)
				return -1;
			if(this.getColumnSelectWidth() != null && compareObj.getColumnSelectWidth() == null)
				return 1;
			if(this.getColumnSelectWidth() != null && compareObj.getColumnSelectWidth() != null)
				retVal = this.getColumnSelectWidth().compareTo(compareObj.getColumnSelectWidth());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.columntypewidth != null)
			count++;
		if(this.columnrequestdatewidth != null)
			count++;
		if(this.columnrequestlocationwidth != null)
			count++;
		if(this.columnrequestbywidth != null)
			count++;
		if(this.columnselectwidth != null)
			count++;
		if(this.columnimage != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected Integer columntypewidth;
	protected Integer columnrequestdatewidth;
	protected Integer columnrequestlocationwidth;
	protected Integer columnrequestbywidth;
	protected Integer columnselectwidth;
	protected Integer columnimage;
	private boolean isValidated = false;
	private boolean isBusy = false;
}