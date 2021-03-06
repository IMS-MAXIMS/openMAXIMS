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

package ims.core.forms.wardbayconfigdialog;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected void bindcmbDependencyLookup();
	abstract protected void defaultcmbDependencyLookupValue();
	abstract protected void bindgrdLayoutsColDependencyLevelLookup();
	abstract protected void bindansYesNoLookup();
	abstract protected void defaultansYesNoLookupValue();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbDependencyValueSet(Object value);
	abstract protected void onCmbTemplatesValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTimClosingValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTimOpeningValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdLayoutsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdLayoutsMutableComboBoxSelected(int column, GenForm.grdLayoutsRow row, Object value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdLayoutsGridCheckBoxClicked(int column, GenForm.grdLayoutsRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onansYesNoValueSet(Object value);
	abstract protected void onAnsYesNoValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdSpecialtiesGridCheckBoxClicked(int column, GenForm.grdSpecialtiesRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

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
				onFormOpen(args);
			}
		});
		this.form.cmbDependency().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbDependencyValueSet(value);
			}
		});
		this.form.cmbTemplates().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbTemplatesValueChanged();
			}
		});
		this.form.timClosing().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onTimClosingValueChanged();
			}
		});
		this.form.timOpening().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onTimOpeningValueChanged();
			}
		});
		this.form.grdLayouts().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdLayoutsSelectionChanged();
			}
		});
		this.form.grdLayouts().setGridMutableComboBoxSelectedEvent(new GridMutableComboBoxSelected()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, Object value) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdLayoutsMutableComboBoxSelected(column, new GenForm.grdLayoutsRow(row), value);
			}
		});
		this.form.grdLayouts().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdLayoutsGridCheckBoxClicked(column, new GenForm.grdLayoutsRow(row), isChecked);
			}
		});
		this.form.ansYesNo().setValueSetEvent(new AnswerBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				onansYesNoValueSet(value);
			}
		});
		this.form.ansYesNo().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onAnsYesNoValueChanged();
			}
		});
		this.form.grdSpecialties().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdSpecialtiesGridCheckBoxClicked(column, new GenForm.grdSpecialtiesRow(row), isChecked);
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.getContextMenus().Core.getWardBayConfigDialogADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.WardBayConfigDialog.ADD, sender);
			}
		});
		this.form.getContextMenus().Core.getWardBayConfigDialogREMOVEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.WardBayConfigDialog.REMOVE, sender);
			}
		});
		this.form.getContextMenus().Core.getWardBayConfigDialogCONFIGURE_BED_TIMESItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.WardBayConfigDialog.CONFIGURE_BED_TIMES, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbDependencyLookup();
		bindgrdLayoutsColDependencyLevelLookup();
		bindansYesNoLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbDependencyLookup();
		bindgrdLayoutsColDependencyLevelLookup();
		bindansYesNoLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbDependencyLookupValue();
		defaultansYesNoLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
