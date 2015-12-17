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

package ims.pathways.vo;

/**
 * Linked to Pathways.Configuration.EventTarget business object (ID: 1089100006).
 */
public class EventTargetVo extends ims.pathways.configuration.vo.EventTargetRefVo implements ims.vo.ImsCloneable, Comparable, ims.framework.interfaces.IRecordStatusTree
{
	private static final long serialVersionUID = 1L;

	public EventTargetVo()
	{
	}
	public EventTargetVo(Integer id, int version)
	{
		super(id, version);
	}
	public EventTargetVo(ims.pathways.vo.beans.EventTargetVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.target = bean.getTarget() == null ? null : bean.getTarget().buildVo();
		this.event = bean.getEvent() == null ? null : new ims.pathways.configuration.vo.EventRefVo(new Integer(bean.getEvent().getId()), bean.getEvent().getVersion());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		if(bean.getActivateTargets() != null)
		{
			this.activatetargets = new ims.pathways.configuration.vo.TargetRefVoCollection();
			for(int activatetargets_i = 0; activatetargets_i < bean.getActivateTargets().length; activatetargets_i++)
			{
				this.activatetargets.add(new ims.pathways.configuration.vo.TargetRefVo(new Integer(bean.getActivateTargets()[activatetargets_i].getId()), bean.getActivateTargets()[activatetargets_i].getVersion()));
			}
		}
		this.setjourneytargetstatusto = bean.getSetJourneyTargetStatusTo() == null ? null : ims.pathways.vo.lookups.PatientTargetStatus.buildLookup(bean.getSetJourneyTargetStatusTo());
		this.settoinscope = bean.getSetToInScope();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.beans.EventTargetVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.target = bean.getTarget() == null ? null : bean.getTarget().buildVo(map);
		this.event = bean.getEvent() == null ? null : new ims.pathways.configuration.vo.EventRefVo(new Integer(bean.getEvent().getId()), bean.getEvent().getVersion());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		if(bean.getActivateTargets() != null)
		{
			this.activatetargets = new ims.pathways.configuration.vo.TargetRefVoCollection();
			for(int activatetargets_i = 0; activatetargets_i < bean.getActivateTargets().length; activatetargets_i++)
			{
				this.activatetargets.add(new ims.pathways.configuration.vo.TargetRefVo(new Integer(bean.getActivateTargets()[activatetargets_i].getId()), bean.getActivateTargets()[activatetargets_i].getVersion()));
			}
		}
		this.setjourneytargetstatusto = bean.getSetJourneyTargetStatusTo() == null ? null : ims.pathways.vo.lookups.PatientTargetStatus.buildLookup(bean.getSetJourneyTargetStatusTo());
		this.settoinscope = bean.getSetToInScope();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.beans.EventTargetVoBean bean = null;
		if(map != null)
			bean = (ims.pathways.vo.beans.EventTargetVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.pathways.vo.beans.EventTargetVoBean();
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
		if(fieldName.equals("TARGET"))
			return getTarget();
		if(fieldName.equals("EVENT"))
			return getEvent();
		if(fieldName.equals("STATUS"))
			return getStatus();
		if(fieldName.equals("ACTIVATETARGETS"))
			return getActivateTargets();
		if(fieldName.equals("SETJOURNEYTARGETSTATUSTO"))
			return getSetJourneyTargetStatusTo();
		if(fieldName.equals("SETTOINSCOPE"))
			return getSetToInScope();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTargetIsNotNull()
	{
		return this.target != null;
	}
	public ims.pathways.vo.TargetShortVo getTarget()
	{
		return this.target;
	}
	public void setTarget(ims.pathways.vo.TargetShortVo value)
	{
		this.isValidated = false;
		this.target = value;
	}
	public boolean getEventIsNotNull()
	{
		return this.event != null;
	}
	public ims.pathways.configuration.vo.EventRefVo getEvent()
	{
		return this.event;
	}
	public void setEvent(ims.pathways.configuration.vo.EventRefVo value)
	{
		this.isValidated = false;
		this.event = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getActivateTargetsIsNotNull()
	{
		return this.activatetargets != null;
	}
	public ims.pathways.configuration.vo.TargetRefVoCollection getActivateTargets()
	{
		return this.activatetargets;
	}
	public void setActivateTargets(ims.pathways.configuration.vo.TargetRefVoCollection value)
	{
		this.isValidated = false;
		this.activatetargets = value;
	}
	public boolean getSetJourneyTargetStatusToIsNotNull()
	{
		return this.setjourneytargetstatusto != null;
	}
	public ims.pathways.vo.lookups.PatientTargetStatus getSetJourneyTargetStatusTo()
	{
		return this.setjourneytargetstatusto;
	}
	public void setSetJourneyTargetStatusTo(ims.pathways.vo.lookups.PatientTargetStatus value)
	{
		this.isValidated = false;
		this.setjourneytargetstatusto = value;
	}
	public boolean getSetToInScopeIsNotNull()
	{
		return this.settoinscope != null;
	}
	public Boolean getSetToInScope()
	{
		return this.settoinscope;
	}
	public void setSetToInScope(Boolean value)
	{
		this.isValidated = false;
		this.settoinscope = value;
	}
	/**
	* IRecordStatusTree interface methods
	*/
		public ims.framework.interfaces.IRecordStatusTree[] getChildren()
		{
			return null;
		}
		public ims.framework.RecordStatus getIRecordStatusTreeStatus()
		{
			if(status != null)
			{
				if(status.equals(ims.core.vo.lookups.PreActiveActiveInactiveStatus.ACTIVE))
					return ims.framework.RecordStatus.ACTIVE;
				else if(status.equals(ims.core.vo.lookups.PreActiveActiveInactiveStatus.PREACTIVE))
					return ims.framework.RecordStatus.PREACTIVE;
				else if(status.equals(ims.core.vo.lookups.PreActiveActiveInactiveStatus.INACTIVE))
					return ims.framework.RecordStatus.INACTIVE;
			}
			
			return null;
		}
		public boolean isNew()
		{
			return this.id == null;
		}
		public String getDomainObjectName()
		{
			return "Event Target";
		}
	      public String getStatusMethodName()
		{
			return "getStatus";
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
		if(this.target == null)
			listOfErrors.add("Target is mandatory");
		if(this.event == null)
			listOfErrors.add("Event is mandatory");
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
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
	
		EventTargetVo clone = new EventTargetVo(this.id, this.version);
		
		if(this.target == null)
			clone.target = null;
		else
			clone.target = (ims.pathways.vo.TargetShortVo)this.target.clone();
		clone.event = this.event;
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
		clone.activatetargets = this.activatetargets;
		if(this.setjourneytargetstatusto == null)
			clone.setjourneytargetstatusto = null;
		else
			clone.setjourneytargetstatusto = (ims.pathways.vo.lookups.PatientTargetStatus)this.setjourneytargetstatusto.clone();
		clone.settoinscope = this.settoinscope;
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
		if (!(EventTargetVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EventTargetVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((EventTargetVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((EventTargetVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.target != null)
			count++;
		if(this.event != null)
			count++;
		if(this.status != null)
			count++;
		if(this.activatetargets != null)
			count++;
		if(this.setjourneytargetstatusto != null)
			count++;
		if(this.settoinscope != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.pathways.vo.TargetShortVo target;
	protected ims.pathways.configuration.vo.EventRefVo event;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus status;
	protected ims.pathways.configuration.vo.TargetRefVoCollection activatetargets;
	protected ims.pathways.vo.lookups.PatientTargetStatus setjourneytargetstatusto;
	protected Boolean settoinscope;
	private boolean isValidated = false;
	private boolean isBusy = false;
}