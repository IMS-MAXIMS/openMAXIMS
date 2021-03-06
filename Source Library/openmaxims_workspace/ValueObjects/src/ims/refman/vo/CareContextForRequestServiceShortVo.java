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

package ims.RefMan.vo;

/**
 * Linked to core.admin.CareContext business object (ID: 1004100019).
 */
public class CareContextForRequestServiceShortVo extends ims.core.admin.vo.CareContextRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CareContextForRequestServiceShortVo()
	{
	}
	public CareContextForRequestServiceShortVo(Integer id, int version)
	{
		super(id, version);
	}
	public CareContextForRequestServiceShortVo(ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.context = bean.getContext() == null ? null : ims.core.vo.lookups.ContextType.buildLookup(bean.getContext());
		this.startdatetime = bean.getStartDateTime() == null ? null : bean.getStartDateTime().buildDateTime();
		this.enddatetime = bean.getEndDateTime() == null ? null : bean.getEndDateTime().buildDateTime();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : new ims.core.admin.vo.EpisodeOfCareRefVo(new Integer(bean.getEpisodeOfCare().getId()), bean.getEpisodeOfCare().getVersion());
		this.locationtype = bean.getLocationType() == null ? null : ims.core.vo.lookups.ContactLocation.buildLookup(bean.getLocationType());
		this.pasevent = bean.getPasEvent() == null ? null : new ims.core.admin.pas.vo.PASEventRefVo(new Integer(bean.getPasEvent().getId()), bean.getPasEvent().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.context = bean.getContext() == null ? null : ims.core.vo.lookups.ContextType.buildLookup(bean.getContext());
		this.startdatetime = bean.getStartDateTime() == null ? null : bean.getStartDateTime().buildDateTime();
		this.enddatetime = bean.getEndDateTime() == null ? null : bean.getEndDateTime().buildDateTime();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : new ims.core.admin.vo.EpisodeOfCareRefVo(new Integer(bean.getEpisodeOfCare().getId()), bean.getEpisodeOfCare().getVersion());
		this.locationtype = bean.getLocationType() == null ? null : ims.core.vo.lookups.ContactLocation.buildLookup(bean.getLocationType());
		this.pasevent = bean.getPasEvent() == null ? null : new ims.core.admin.pas.vo.PASEventRefVo(new Integer(bean.getPasEvent().getId()), bean.getPasEvent().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean();
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
		if(fieldName.equals("CONTEXT"))
			return getContext();
		if(fieldName.equals("STARTDATETIME"))
			return getStartDateTime();
		if(fieldName.equals("ENDDATETIME"))
			return getEndDateTime();
		if(fieldName.equals("EPISODEOFCARE"))
			return getEpisodeOfCare();
		if(fieldName.equals("LOCATIONTYPE"))
			return getLocationType();
		if(fieldName.equals("PASEVENT"))
			return getPasEvent();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getContextIsNotNull()
	{
		return this.context != null;
	}
	public ims.core.vo.lookups.ContextType getContext()
	{
		return this.context;
	}
	public void setContext(ims.core.vo.lookups.ContextType value)
	{
		this.isValidated = false;
		this.context = value;
	}
	public boolean getStartDateTimeIsNotNull()
	{
		return this.startdatetime != null;
	}
	public ims.framework.utils.DateTime getStartDateTime()
	{
		return this.startdatetime;
	}
	public void setStartDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.startdatetime = value;
	}
	public boolean getEndDateTimeIsNotNull()
	{
		return this.enddatetime != null;
	}
	public ims.framework.utils.DateTime getEndDateTime()
	{
		return this.enddatetime;
	}
	public void setEndDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.enddatetime = value;
	}
	public boolean getEpisodeOfCareIsNotNull()
	{
		return this.episodeofcare != null;
	}
	public ims.core.admin.vo.EpisodeOfCareRefVo getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo value)
	{
		this.isValidated = false;
		this.episodeofcare = value;
	}
	public boolean getLocationTypeIsNotNull()
	{
		return this.locationtype != null;
	}
	public ims.core.vo.lookups.ContactLocation getLocationType()
	{
		return this.locationtype;
	}
	public void setLocationType(ims.core.vo.lookups.ContactLocation value)
	{
		this.isValidated = false;
		this.locationtype = value;
	}
	public boolean getPasEventIsNotNull()
	{
		return this.pasevent != null;
	}
	public ims.core.admin.pas.vo.PASEventRefVo getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.admin.pas.vo.PASEventRefVo value)
	{
		this.isValidated = false;
		this.pasevent = value;
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
		if(this.context == null)
			listOfErrors.add("Context is mandatory");
		if(this.startdatetime == null)
			listOfErrors.add("StartDateTime is mandatory");
		if(this.episodeofcare == null)
			listOfErrors.add("EpisodeOfCare is mandatory");
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
	
		CareContextForRequestServiceShortVo clone = new CareContextForRequestServiceShortVo(this.id, this.version);
		
		if(this.context == null)
			clone.context = null;
		else
			clone.context = (ims.core.vo.lookups.ContextType)this.context.clone();
		if(this.startdatetime == null)
			clone.startdatetime = null;
		else
			clone.startdatetime = (ims.framework.utils.DateTime)this.startdatetime.clone();
		if(this.enddatetime == null)
			clone.enddatetime = null;
		else
			clone.enddatetime = (ims.framework.utils.DateTime)this.enddatetime.clone();
		clone.episodeofcare = this.episodeofcare;
		if(this.locationtype == null)
			clone.locationtype = null;
		else
			clone.locationtype = (ims.core.vo.lookups.ContactLocation)this.locationtype.clone();
		clone.pasevent = this.pasevent;
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
		if (!(CareContextForRequestServiceShortVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CareContextForRequestServiceShortVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CareContextForRequestServiceShortVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CareContextForRequestServiceShortVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.context != null)
			count++;
		if(this.startdatetime != null)
			count++;
		if(this.enddatetime != null)
			count++;
		if(this.episodeofcare != null)
			count++;
		if(this.locationtype != null)
			count++;
		if(this.pasevent != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.core.vo.lookups.ContextType context;
	protected ims.framework.utils.DateTime startdatetime;
	protected ims.framework.utils.DateTime enddatetime;
	protected ims.core.admin.vo.EpisodeOfCareRefVo episodeofcare;
	protected ims.core.vo.lookups.ContactLocation locationtype;
	protected ims.core.admin.pas.vo.PASEventRefVo pasevent;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
