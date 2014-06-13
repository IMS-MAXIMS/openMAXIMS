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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.45 build 2421.18554)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.admin.forms.roleselect;

import ims.admin.vo.AppRoleShortVo;
import ims.admin.vo.AppRoleShortVoCollection;
import ims.framework.enumerations.DialogResult;

public class Logic extends BaseLogic
{
	private static final long	serialVersionUID	= 1L;

	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	protected void onGrdRolesGridCheckBoxClicked(int column, GenForm.grdRolesRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
	{
		enableOkButton();
	}

	protected void onBtnOkClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateRolesFromGrid();
		engine.close(DialogResult.OK);
	}

	private void populateRolesFromGrid()
	{
		AppRoleShortVoCollection voRoles = new AppRoleShortVoCollection();
		for (int i = 0; i < form.grdRoles().getRows().size(); i++)
		{
			if (form.grdRoles().getRows().get(i).getcolSelect())
				voRoles.add(form.grdRoles().getRows().get(i).getValue());
		}
		form.getGlobalContext().Admin.setSelectedRoles(voRoles);
	}

	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);
	}

	private void open()
	{
		AppRoleShortVoCollection voColl = domain.listRoles();
		form.grdRoles().getRows().clear();
		for (int i = 0; i < voColl.size(); i++)
		{
			AppRoleShortVo voAppRole = voColl.get(i);
			if(voAppRole.getIsActiveIsNotNull() && voAppRole.getIsActive().booleanValue())
			{
				GenForm.grdRolesRow row = form.grdRoles().getRows().newRow();
				row.setcolImage(form.getImages().OCRR.Role);
				row.setcolRole(voAppRole.getName());
				row.setValue(voAppRole);

				if (form.getGlobalContext().Admin.getSelectedRolesIsNotNull())
				{
					for (int j = 0 ; j < form.getGlobalContext().Admin.getSelectedRoles().size() ; j++)
					{
						if (voAppRole.getID_AppRoleIsNotNull()
							&& form.getGlobalContext().Admin.getSelectedRoles().get(j).getID_AppRoleIsNotNull()
							&& voAppRole.getID_AppRole().equals(form.getGlobalContext().Admin.getSelectedRoles().get(j).getID_AppRole()))
							row.setcolSelect(true);
					}

				}

			}
		}

		enableOkButton();
	}

	private void enableOkButton()
	{
		form.btnOk().setEnabled(isAtLeastOneRoleSelected());
	}

	private boolean isAtLeastOneRoleSelected()
	{
		for (int i = 0; i < form.grdRoles().getRows().size(); i++)
		{
			if (form.grdRoles().getRows().get(i).getcolSelect())
				return true;
		}

		if (form.getGlobalContext().Admin.getSelectedRolesIsNotNull()
			&& form.getGlobalContext().Admin.getSelectedRoles().size() > 0)
			return true;
		
		return false;
	}
}