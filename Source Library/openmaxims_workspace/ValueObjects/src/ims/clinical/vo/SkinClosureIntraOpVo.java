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

package ims.clinical.vo;

/**
 * Linked to clinical.SkinClosureIntraOp business object (ID: 1072100145).
 */
public class SkinClosureIntraOpVo extends ims.clinical.vo.SkinClosureIntraOpRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SkinClosureIntraOpVo()
	{
	}
	public SkinClosureIntraOpVo(Integer id, int version)
	{
		super(id, version);
	}
	public SkinClosureIntraOpVo(ims.clinical.vo.beans.SkinClosureIntraOpVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.patientprocedure = bean.getPatientProcedure() == null ? null : bean.getPatientProcedure().buildVo();
		this.procedurewoundclass = bean.getProcedureWoundClass() == null ? null : ims.core.vo.lookups.ProcedureWoundClass.buildLookup(bean.getProcedureWoundClass());
		this.other = bean.getOther();
		this.details = bean.getDetails();
		this.skinclosuretype = ims.clinical.vo.lookups.SkinClosureTypeCollection.buildFromBeanCollection(bean.getSkinClosureType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.SkinClosureIntraOpVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.patientprocedure = bean.getPatientProcedure() == null ? null : bean.getPatientProcedure().buildVo(map);
		this.procedurewoundclass = bean.getProcedureWoundClass() == null ? null : ims.core.vo.lookups.ProcedureWoundClass.buildLookup(bean.getProcedureWoundClass());
		this.other = bean.getOther();
		this.details = bean.getDetails();
		this.skinclosuretype = ims.clinical.vo.lookups.SkinClosureTypeCollection.buildFromBeanCollection(bean.getSkinClosureType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.SkinClosureIntraOpVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.SkinClosureIntraOpVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.SkinClosureIntraOpVoBean();
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
		if(fieldName.equals("THEATREAPPOINTMENT"))
			return getTheatreAppointment();
		if(fieldName.equals("PATIENTPROCEDURE"))
			return getPatientProcedure();
		if(fieldName.equals("PROCEDUREWOUNDCLASS"))
			return getProcedureWoundClass();
		if(fieldName.equals("OTHER"))
			return getOther();
		if(fieldName.equals("DETAILS"))
			return getDetails();
		if(fieldName.equals("SKINCLOSURETYPE"))
			return getSkinClosureType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTheatreAppointmentIsNotNull()
	{
		return this.theatreappointment != null;
	}
	public ims.scheduling.vo.Booking_AppointmentRefVo getTheatreAppointment()
	{
		return this.theatreappointment;
	}
	public void setTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo value)
	{
		this.isValidated = false;
		this.theatreappointment = value;
	}
	public boolean getPatientProcedureIsNotNull()
	{
		return this.patientprocedure != null;
	}
	public ims.core.vo.PatientProcedureMinVo getPatientProcedure()
	{
		return this.patientprocedure;
	}
	public void setPatientProcedure(ims.core.vo.PatientProcedureMinVo value)
	{
		this.isValidated = false;
		this.patientprocedure = value;
	}
	public boolean getProcedureWoundClassIsNotNull()
	{
		return this.procedurewoundclass != null;
	}
	public ims.core.vo.lookups.ProcedureWoundClass getProcedureWoundClass()
	{
		return this.procedurewoundclass;
	}
	public void setProcedureWoundClass(ims.core.vo.lookups.ProcedureWoundClass value)
	{
		this.isValidated = false;
		this.procedurewoundclass = value;
	}
	public boolean getOtherIsNotNull()
	{
		return this.other != null;
	}
	public Boolean getOther()
	{
		return this.other;
	}
	public void setOther(Boolean value)
	{
		this.isValidated = false;
		this.other = value;
	}
	public boolean getDetailsIsNotNull()
	{
		return this.details != null;
	}
	public String getDetails()
	{
		return this.details;
	}
	public static int getDetailsMaxLength()
	{
		return 125;
	}
	public void setDetails(String value)
	{
		this.isValidated = false;
		this.details = value;
	}
	public boolean getSkinClosureTypeIsNotNull()
	{
		return this.skinclosuretype != null;
	}
	public ims.clinical.vo.lookups.SkinClosureTypeCollection getSkinClosureType()
	{
		return this.skinclosuretype;
	}
	public void setSkinClosureType(ims.clinical.vo.lookups.SkinClosureTypeCollection value)
	{
		this.isValidated = false;
		this.skinclosuretype = value;
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
		if(this.theatreappointment == null)
			listOfErrors.add("TheatreAppointment is mandatory");
		if(this.patientprocedure == null)
			listOfErrors.add("Procedure is mandatory");
		if(this.procedurewoundclass == null)
			listOfErrors.add("Procedure Wound Class is mandatory");
		if(this.details != null)
			if(this.details.length() > 125)
				listOfErrors.add("The length of the field [details] in the value object [ims.clinical.vo.SkinClosureIntraOpVo] is too big. It should be less or equal to 125");
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
	
		SkinClosureIntraOpVo clone = new SkinClosureIntraOpVo(this.id, this.version);
		
		clone.theatreappointment = this.theatreappointment;
		if(this.patientprocedure == null)
			clone.patientprocedure = null;
		else
			clone.patientprocedure = (ims.core.vo.PatientProcedureMinVo)this.patientprocedure.clone();
		if(this.procedurewoundclass == null)
			clone.procedurewoundclass = null;
		else
			clone.procedurewoundclass = (ims.core.vo.lookups.ProcedureWoundClass)this.procedurewoundclass.clone();
		clone.other = this.other;
		clone.details = this.details;
		if(this.skinclosuretype == null)
			clone.skinclosuretype = null;
		else
			clone.skinclosuretype = (ims.clinical.vo.lookups.SkinClosureTypeCollection)this.skinclosuretype.clone();
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
		if (!(SkinClosureIntraOpVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SkinClosureIntraOpVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SkinClosureIntraOpVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SkinClosureIntraOpVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.theatreappointment != null)
			count++;
		if(this.patientprocedure != null)
			count++;
		if(this.procedurewoundclass != null)
			count++;
		if(this.other != null)
			count++;
		if(this.details != null)
			count++;
		if(this.skinclosuretype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.scheduling.vo.Booking_AppointmentRefVo theatreappointment;
	protected ims.core.vo.PatientProcedureMinVo patientprocedure;
	protected ims.core.vo.lookups.ProcedureWoundClass procedurewoundclass;
	protected Boolean other;
	protected String details;
	protected ims.clinical.vo.lookups.SkinClosureTypeCollection skinclosuretype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
