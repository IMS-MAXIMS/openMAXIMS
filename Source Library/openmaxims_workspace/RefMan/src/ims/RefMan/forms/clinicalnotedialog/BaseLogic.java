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

package ims.RefMan.forms.clinicalnotedialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.ClinicalNoteDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.ClinicalNoteDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbReportNoteTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReportNoteType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReportNoteType existingInstance = (ims.RefMan.vo.lookups.ReportNoteType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReportNoteTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReportNoteType)
		{
			ims.RefMan.vo.lookups.ReportNoteType instance = (ims.RefMan.vo.lookups.ReportNoteType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReportNoteTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReportNoteType existingInstance = (ims.RefMan.vo.lookups.ReportNoteType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReportNoteType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReportNoteTypeLookup()
	{
		this.form.cmbReportNoteType().clear();
		ims.RefMan.vo.lookups.ReportNoteTypeCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReportNoteType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReportNoteType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReportNoteTypeLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReportNoteType instance = ims.RefMan.vo.lookups.LookupHelper.getReportNoteTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReportNoteType().setValue(instance);
	}
	protected final void defaultcmbReportNoteTypeLookupValue()
	{
		this.form.cmbReportNoteType().setValue((ims.RefMan.vo.lookups.ReportNoteType)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReportNoteType.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReportNoteType.TYPE_ID));
	}
	protected final void oncmbNoteTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbNoteType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment existingInstance = (ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbNoteTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment)
		{
			ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment instance = (ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbNoteTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment existingInstance = (ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbNoteType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbNoteTypeLookup()
	{
		this.form.cmbNoteType().clear();
		ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointmentCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getClinicalNoteTypeForAnAppointment(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbNoteType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbNoteTypeLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment instance = ims.RefMan.vo.lookups.LookupHelper.getClinicalNoteTypeForAnAppointmentInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbNoteType().setValue(instance);
	}
	protected final void defaultcmbNoteTypeLookupValue()
	{
		this.form.cmbNoteType().setValue((ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ClinicalNoteTypeForAnAppointment.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.ClinicalNoteDialog domain;
}
