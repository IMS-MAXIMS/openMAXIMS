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
package ims.core.helper;

import ims.admin.vo.AppUserNotificationVo;
import ims.admin.vo.RBACBaselineJobRoleVo;
import ims.core.admin.vo.RBACBaselineJobRoleRefVo;
import ims.core.configuration.vo.AppUserRefVo;
import ims.core.resource.people.vo.GpRefVo;
import ims.core.resource.place.vo.OrganisationRefVo;
import ims.core.vo.GpShortVo;
import ims.core.vo.OrganisationWithSitesVo;
import ims.core.vo.PDSBackOfficeItemVo;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.DomainInterface;
import ims.domain.exceptions.DomainException;

public interface IPdsDomainHelper extends DomainInterface
{
	public ims.core.vo.Patient getPatient(ims.core.patient.vo.PatientRefVo patient);
	public ims.core.vo.GpLiteWithNameVo getGpByTaxonomyCode(String code, TaxonomyType type);
	public ims.core.vo.OrgLiteVo getPracticeByTaxonomyCode(String code, TaxonomyType type);
	public ims.admin.vo.PDSConfigurationVo getPdsConfiguration();
	public PDSBackOfficeItemVo createBackOfficeItemAndNotification(PDSBackOfficeItemVo item) throws DomainException;
	public AppUserNotificationVo getAppUserById(AppUserRefVo user);
	public RBACBaselineJobRoleVo getRBACBaselineJobRole(RBACBaselineJobRoleRefVo role);
	public GpShortVo getGp(GpRefVo refVo);
	public OrganisationWithSitesVo getPractice(OrganisationRefVo refVo);
}

