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

package ims.coe.vo;

/**
 * Linked to coe.assessment tools.InfectionControlDetails business object (ID: 1013100011).
 */
public class InfectionControlDetailsVo extends ims.coe.assessmenttools.vo.InfectionControlDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public InfectionControlDetailsVo()
	{
	}
	public InfectionControlDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public InfectionControlDetailsVo(ims.coe.vo.beans.InfectionControlDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.infectioncontroltype = bean.getInfectionControlType() == null ? null : ims.coe.vo.lookups.InfectionControlType.buildLookup(bean.getInfectionControlType());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getStatus());
		this.result = bean.getResult() == null ? null : ims.coe.vo.lookups.InfectionResult.buildLookup(bean.getResult());
		this.comments = bean.getComments();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.coe.vo.beans.InfectionControlDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.infectioncontroltype = bean.getInfectionControlType() == null ? null : ims.coe.vo.lookups.InfectionControlType.buildLookup(bean.getInfectionControlType());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getStatus());
		this.result = bean.getResult() == null ? null : ims.coe.vo.lookups.InfectionResult.buildLookup(bean.getResult());
		this.comments = bean.getComments();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.coe.vo.beans.InfectionControlDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.coe.vo.beans.InfectionControlDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.coe.vo.beans.InfectionControlDetailsVoBean();
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
		if(fieldName.equals("INFECTIONCONTROLTYPE"))
			return getInfectionControlType();
		if(fieldName.equals("STATUS"))
			return getStatus();
		if(fieldName.equals("RESULT"))
			return getResult();
		if(fieldName.equals("COMMENTS"))
			return getComments();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getInfectionControlTypeIsNotNull()
	{
		return this.infectioncontroltype != null;
	}
	public ims.coe.vo.lookups.InfectionControlType getInfectionControlType()
	{
		return this.infectioncontroltype;
	}
	public void setInfectionControlType(ims.coe.vo.lookups.InfectionControlType value)
	{
		this.isValidated = false;
		this.infectioncontroltype = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.YesNo getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getResultIsNotNull()
	{
		return this.result != null;
	}
	public ims.coe.vo.lookups.InfectionResult getResult()
	{
		return this.result;
	}
	public void setResult(ims.coe.vo.lookups.InfectionResult value)
	{
		this.isValidated = false;
		this.result = value;
	}
	public boolean getCommentsIsNotNull()
	{
		return this.comments != null;
	}
	public String getComments()
	{
		return this.comments;
	}
	public static int getCommentsMaxLength()
	{
		return 255;
	}
	public void setComments(String value)
	{
		this.isValidated = false;
		this.comments = value;
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
		if(this.infectioncontroltype == null)
			listOfErrors.add("InfectionControlType is mandatory");
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
	
		InfectionControlDetailsVo clone = new InfectionControlDetailsVo(this.id, this.version);
		
		if(this.infectioncontroltype == null)
			clone.infectioncontroltype = null;
		else
			clone.infectioncontroltype = (ims.coe.vo.lookups.InfectionControlType)this.infectioncontroltype.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.YesNo)this.status.clone();
		if(this.result == null)
			clone.result = null;
		else
			clone.result = (ims.coe.vo.lookups.InfectionResult)this.result.clone();
		clone.comments = this.comments;
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
		if (!(InfectionControlDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A InfectionControlDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((InfectionControlDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((InfectionControlDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.infectioncontroltype != null)
			count++;
		if(this.status != null)
			count++;
		if(this.result != null)
			count++;
		if(this.comments != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.coe.vo.lookups.InfectionControlType infectioncontroltype;
	protected ims.core.vo.lookups.YesNo status;
	protected ims.coe.vo.lookups.InfectionResult result;
	protected String comments;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
