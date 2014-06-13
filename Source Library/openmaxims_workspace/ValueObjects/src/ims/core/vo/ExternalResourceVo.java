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

package ims.core.vo;

/**
 * Linked to core.resource.ExternalResource business object (ID: 1005100008).
 */
public class ExternalResourceVo extends ims.core.resource.vo.ExternalResourceRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ExternalResourceVo()
	{
	}
	public ExternalResourceVo(Integer id, int version)
	{
		super(id, version);
	}
	public ExternalResourceVo(ims.core.vo.beans.ExternalResourceVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.externalresourcetype = bean.getExternalResourceType() == null ? null : ims.core.vo.lookups.ExternalResourceType.buildLookup(bean.getExternalResourceType());
		this.hcptype = bean.getHCPType() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getHCPType());
		this.resourceaddress = bean.getResourceAddress() == null ? null : bean.getResourceAddress().buildVo();
		this.resourcestatus = bean.getResourceStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getResourceStatus());
		this.resourcename = bean.getResourcename();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.ExternalResourceVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.externalresourcetype = bean.getExternalResourceType() == null ? null : ims.core.vo.lookups.ExternalResourceType.buildLookup(bean.getExternalResourceType());
		this.hcptype = bean.getHCPType() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getHCPType());
		this.resourceaddress = bean.getResourceAddress() == null ? null : bean.getResourceAddress().buildVo(map);
		this.resourcestatus = bean.getResourceStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getResourceStatus());
		this.resourcename = bean.getResourcename();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.ExternalResourceVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.ExternalResourceVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.ExternalResourceVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("EXTERNALRESOURCETYPE"))
			return getExternalResourceType();
		if(fieldName.equals("HCPTYPE"))
			return getHCPType();
		if(fieldName.equals("RESOURCEADDRESS"))
			return getResourceAddress();
		if(fieldName.equals("RESOURCESTATUS"))
			return getResourceStatus();
		if(fieldName.equals("RESOURCENAME"))
			return getResourcename();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getExternalResourceTypeIsNotNull()
	{
		return this.externalresourcetype != null;
	}
	public ims.core.vo.lookups.ExternalResourceType getExternalResourceType()
	{
		return this.externalresourcetype;
	}
	public void setExternalResourceType(ims.core.vo.lookups.ExternalResourceType value)
	{
		this.isValidated = false;
		this.externalresourcetype = value;
	}
	public boolean getHCPTypeIsNotNull()
	{
		return this.hcptype != null;
	}
	public ims.core.vo.lookups.HcpDisType getHCPType()
	{
		return this.hcptype;
	}
	public void setHCPType(ims.core.vo.lookups.HcpDisType value)
	{
		this.isValidated = false;
		this.hcptype = value;
	}
	public boolean getResourceAddressIsNotNull()
	{
		return this.resourceaddress != null;
	}
	public ims.core.vo.PersonAddress getResourceAddress()
	{
		return this.resourceaddress;
	}
	public void setResourceAddress(ims.core.vo.PersonAddress value)
	{
		this.isValidated = false;
		this.resourceaddress = value;
	}
	public boolean getResourceStatusIsNotNull()
	{
		return this.resourcestatus != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getResourceStatus()
	{
		return this.resourcestatus;
	}
	public void setResourceStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.resourcestatus = value;
	}
	public boolean getResourcenameIsNotNull()
	{
		return this.resourcename != null;
	}
	public String getResourcename()
	{
		return this.resourcename;
	}
	public static int getResourcenameMaxLength()
	{
		return 70;
	}
	public void setResourcename(String value)
	{
		this.isValidated = false;
		this.resourcename = value;
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
		if(this.resourceaddress != null)
		{
			if(!this.resourceaddress.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.externalresourcetype == null)
			listOfErrors.add("ExternalResourceType is mandatory");
		if(this.resourceaddress == null)
			listOfErrors.add("ResourceAddress is mandatory");
		if(this.resourceaddress != null)
		{
			String[] listOfOtherErrors = this.resourceaddress.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.resourcestatus == null)
			listOfErrors.add("ResourceStatus is mandatory");
		if(this.resourcename == null || this.resourcename.length() == 0)
			listOfErrors.add("Resourcename is mandatory");
		else if(this.resourcename.length() > 70)
			listOfErrors.add("The length of the field [resourcename] in the value object [ims.core.vo.ExternalResourceVo] is too big. It should be less or equal to 70");
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
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		ExternalResourceVo clone = new ExternalResourceVo(this.id, this.version);
		
		if(this.externalresourcetype == null)
			clone.externalresourcetype = null;
		else
			clone.externalresourcetype = (ims.core.vo.lookups.ExternalResourceType)this.externalresourcetype.clone();
		if(this.hcptype == null)
			clone.hcptype = null;
		else
			clone.hcptype = (ims.core.vo.lookups.HcpDisType)this.hcptype.clone();
		if(this.resourceaddress == null)
			clone.resourceaddress = null;
		else
			clone.resourceaddress = (ims.core.vo.PersonAddress)this.resourceaddress.clone();
		if(this.resourcestatus == null)
			clone.resourcestatus = null;
		else
			clone.resourcestatus = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.resourcestatus.clone();
		clone.resourcename = this.resourcename;
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
		if (!(ExternalResourceVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ExternalResourceVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ExternalResourceVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ExternalResourceVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.externalresourcetype != null)
			count++;
		if(this.hcptype != null)
			count++;
		if(this.resourceaddress != null)
			count++;
		if(this.resourcestatus != null)
			count++;
		if(this.resourcename != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.core.vo.lookups.ExternalResourceType externalresourcetype;
	protected ims.core.vo.lookups.HcpDisType hcptype;
	protected ims.core.vo.PersonAddress resourceaddress;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus resourcestatus;
	protected String resourcename;
	private boolean isValidated = false;
	private boolean isBusy = false;
}