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

package ims.pci.forms.schoolquerydialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		PCI = new PCIContext(context);
	}
	public final class PCIContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private PCIContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCurrentSectorIsNotNull()
		{
			return !cx_PCICurrentSector.getValueIsNull(context);
		}
		public ims.core.vo.LocationLiteVo getCurrentSector()
		{
			return (ims.core.vo.LocationLiteVo)cx_PCICurrentSector.getValue(context);
		}
		public void setCurrentSector(ims.core.vo.LocationLiteVo value)
		{
			cx_PCICurrentSector.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_PCICurrentSector = new ims.framework.ContextVariable("PCI.CurrentSector", "_cv_PCI.CurrentSector");
		public boolean getSchoolIsNotNull()
		{
			return !cx_PCISchool.getValueIsNull(context);
		}
		public ims.core.vo.SchoolShortVo getSchool()
		{
			return (ims.core.vo.SchoolShortVo)cx_PCISchool.getValue(context);
		}
		public void setSchool(ims.core.vo.SchoolShortVo value)
		{
			cx_PCISchool.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_PCISchool = new ims.framework.ContextVariable("PCI.School", "_cv_PCI.School");

		private ims.framework.Context context;
	}

	public PCIContext PCI;
}
