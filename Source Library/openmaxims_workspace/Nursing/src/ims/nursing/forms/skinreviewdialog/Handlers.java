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

package ims.nursing.forms.skinreviewdialog;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbPainLookup();
	abstract protected void defaultcmbPainLookupValue();
	abstract protected void bindcmbWoundBedLookup();
	abstract protected void defaultcmbWoundBedLookupValue();
	abstract protected void bindcmbSurroundingSkinLookup();
	abstract protected void defaultcmbSurroundingSkinLookupValue();
	abstract protected void bindcmbExudateAmountLookup();
	abstract protected void defaultcmbExudateAmountLookupValue();
	abstract protected void bindcmbExudateTypeLookup();
	abstract protected void defaultcmbExudateTypeLookupValue();
	abstract protected void bindcmbOdourLookup();
	abstract protected void defaultcmbOdourLookupValue();
	abstract protected void bindcmbPressureGradeLookup();
	abstract protected void defaultcmbPressureGradeLookupValue();
	abstract protected void bindcmbCleansedWithLookup();
	abstract protected void defaultcmbCleansedWithLookupValue();
	abstract protected void bindcmbFrequencyLookup();
	abstract protected void defaultcmbFrequencyLookupValue();
	abstract protected void bindcmbSecondaryLookup();
	abstract protected void defaultcmbSecondaryLookupValue();
	abstract protected void bindcmbPrimaryLookup();
	abstract protected void defaultcmbPrimaryLookupValue();
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPainValueSet(Object value);
	abstract protected void oncmbWoundBedValueSet(Object value);
	abstract protected void oncmbSurroundingSkinValueSet(Object value);
	abstract protected void oncmbExudateAmountValueSet(Object value);
	abstract protected void oncmbExudateTypeValueSet(Object value);
	abstract protected void oncmbOdourValueSet(Object value);
	abstract protected void oncmbPressureGradeValueSet(Object value);
	abstract protected void oncmbCleansedWithValueSet(Object value);
	abstract protected void oncmbFrequencyValueSet(Object value);
	abstract protected void oncmbSecondaryValueSet(Object value);
	abstract protected void oncmbPrimaryValueSet(Object value);
	abstract protected void onBCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBSaveClick() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen();
			}
		});
		this.form.cmbPain().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPainValueSet(value);
			}
		});
		this.form.cmbWoundBed().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbWoundBedValueSet(value);
			}
		});
		this.form.cmbSurroundingSkin().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSurroundingSkinValueSet(value);
			}
		});
		this.form.cmbExudateAmount().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbExudateAmountValueSet(value);
			}
		});
		this.form.cmbExudateType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbExudateTypeValueSet(value);
			}
		});
		this.form.cmbOdour().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbOdourValueSet(value);
			}
		});
		this.form.cmbPressureGrade().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPressureGradeValueSet(value);
			}
		});
		this.form.cmbCleansedWith().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbCleansedWithValueSet(value);
			}
		});
		this.form.cmbFrequency().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbFrequencyValueSet(value);
			}
		});
		this.form.cmbSecondary().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSecondaryValueSet(value);
			}
		});
		this.form.cmbPrimary().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPrimaryValueSet(value);
			}
		});
		this.form.bCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBCancelClick();
			}
		});
		this.form.bSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBSaveClick();
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbPainLookup();
		bindcmbWoundBedLookup();
		bindcmbSurroundingSkinLookup();
		bindcmbExudateAmountLookup();
		bindcmbExudateTypeLookup();
		bindcmbOdourLookup();
		bindcmbPressureGradeLookup();
		bindcmbCleansedWithLookup();
		bindcmbFrequencyLookup();
		bindcmbSecondaryLookup();
		bindcmbPrimaryLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbPainLookup();
		bindcmbWoundBedLookup();
		bindcmbSurroundingSkinLookup();
		bindcmbExudateAmountLookup();
		bindcmbExudateTypeLookup();
		bindcmbOdourLookup();
		bindcmbPressureGradeLookup();
		bindcmbCleansedWithLookup();
		bindcmbFrequencyLookup();
		bindcmbSecondaryLookup();
		bindcmbPrimaryLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbPainLookupValue();
		defaultcmbWoundBedLookupValue();
		defaultcmbSurroundingSkinLookupValue();
		defaultcmbExudateAmountLookupValue();
		defaultcmbExudateTypeLookupValue();
		defaultcmbOdourLookupValue();
		defaultcmbPressureGradeLookupValue();
		defaultcmbCleansedWithLookupValue();
		defaultcmbFrequencyLookupValue();
		defaultcmbSecondaryLookupValue();
		defaultcmbPrimaryLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}