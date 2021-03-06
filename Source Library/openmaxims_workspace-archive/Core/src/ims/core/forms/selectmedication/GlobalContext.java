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

package ims.core.forms.selectmedication;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		RefMan = new RefManContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

			SelectMedication = new SelectMedicationContext(context);
		}
		public final class SelectMedicationContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private SelectMedicationContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getSelectedMedicationIsNotNull()
			{
				return !cx_CoreSelectMedicationSelectedMedication.getValueIsNull(context);
			}
			public ims.core.vo.MedicationVo getSelectedMedication()
			{
				return (ims.core.vo.MedicationVo)cx_CoreSelectMedicationSelectedMedication.getValue(context);
			}
		public void setSelectedMedication(ims.core.vo.MedicationVo value)
		{
				cx_CoreSelectMedicationSelectedMedication.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CoreSelectMedicationSelectedMedication = new ims.framework.ContextVariable("Core.SelectMedication.SelectedMedication", "_cv_Core.SelectMedication.SelectedMedication");
			public boolean getHotlistSearchOnlyIsNotNull()
			{
				return !cx_CoreSelectMedicationHotlistSearchOnly.getValueIsNull(context);
			}
			public Boolean getHotlistSearchOnly()
			{
				return (Boolean)cx_CoreSelectMedicationHotlistSearchOnly.getValue(context);
			}

			private ims.framework.ContextVariable cx_CoreSelectMedicationHotlistSearchOnly = new ims.framework.ContextVariable("Core.SelectMedication.HotlistSearchOnly", "_cv_Core.SelectMedication.HotlistSearchOnly");
			private ims.framework.Context context;
		}


		public SelectMedicationContext SelectMedication;
		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getSelectedSpecialtyIsNotNull()
		{
			return !cx_RefManSelectedSpecialty.getValueIsNull(context);
		}
		public ims.core.vo.lookups.Specialty getSelectedSpecialty()
		{
			return (ims.core.vo.lookups.Specialty)cx_RefManSelectedSpecialty.getValue(context);
		}
		public void setSelectedSpecialty(ims.core.vo.lookups.Specialty value)
		{
			cx_RefManSelectedSpecialty.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSelectedSpecialty = new ims.framework.ContextVariable("RefMan.SelectedSpecialty", "_cv_RefMan.SelectedSpecialty");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public RefManContext RefMan;
}
