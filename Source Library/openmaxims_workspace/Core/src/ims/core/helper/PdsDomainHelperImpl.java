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

import java.util.List;

import ims.admin.vo.AppUserNotificationVo;
import ims.admin.vo.PDSConfigurationVo;
import ims.admin.vo.RBACBaselineJobRoleVo;
import ims.admin.vo.domain.AppUserNotificationVoAssembler;
import ims.admin.vo.domain.PDSConfigurationVoAssembler;
import ims.admin.vo.domain.RBACBaselineJobRoleVoAssembler;
import ims.core.admin.domain.objects.PDSBackOfficeItem;
import ims.core.admin.domain.objects.PDSConfiguration;
import ims.core.admin.domain.objects.RBACBaselineJobRole;
import ims.core.admin.vo.RBACBaselineJobRoleRefVo;
import ims.core.configuration.domain.objects.AppUser;
import ims.core.configuration.vo.AppUserRefVo;
import ims.core.resource.people.domain.objects.Gp;
import ims.core.resource.people.vo.GpRefVo;
import ims.core.resource.place.domain.objects.Organisation;
import ims.core.resource.place.vo.OrganisationRefVo;
import ims.core.vo.GpLiteWithNameVo;
import ims.core.vo.GpShortVo;
import ims.core.vo.OrgLiteVo;
import ims.core.vo.OrganisationWithSitesVo;
import ims.core.vo.PDSBackOfficeItemVo;
import ims.core.vo.domain.GpLiteWithNameVoAssembler;
import ims.core.vo.domain.GpShortVoAssembler;
import ims.core.vo.domain.OrgLiteVoAssembler;
import ims.core.vo.domain.OrganisationWithSitesVoAssembler;
import ims.core.vo.domain.PDSBackOfficeItemVoAssembler;
import ims.core.vo.domain.PatientAssembler;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainException;
import ims.domain.impl.DomainImpl;
import ims.domain.impl.Transactional;
import ims.framework.exceptions.CodingRuntimeException;

public class PdsDomainHelperImpl extends DomainImpl implements IPdsDomainHelper, Transactional
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public ims.core.vo.Patient getPatient(ims.core.patient.vo.PatientRefVo patient)
	{
		if(patient == null || patient.getID_Patient() == null)
			throw new CodingRuntimeException("patient os null or id not provided for method getPatient");
		
		return PatientAssembler.create((ims.core.patient.domain.objects.Patient) getDomainFactory().getDomainObject(patient)); 
	}

	@Override
	public GpLiteWithNameVo getGpByTaxonomyCode(String code, TaxonomyType type)
	{
		String hql = "select g1	from Gp as g1 left join g1.codeMappings as t1 left join t1.taxonomyName as l1\r\n" + 
				"where t1.taxonomyCode = :taxonomyCode and l1.id = :type order by g1.id";
		
		List<?> list = getDomainFactory().find(hql, new String[] {"taxonomyCode", "type"}, new Object[] {code, type.getID()});

		if(list != null && list.size() > 0)
			return GpLiteWithNameVoAssembler.create((Gp) list.get(0));
		
		return null;
	}

	@Override
	public OrgLiteVo getPracticeByTaxonomyCode(String code, TaxonomyType type)
	{
		String hql = "select org from Organisation as org left join org.codeMappings as tax left join tax.taxonomyName as lkp\r\n" + 
				"where (tax.taxonomyCode = :taxonomyCode and lkp.id = :type) order by org.id asc ";

		List<?> list = getDomainFactory().find(hql, new String[] {"taxonomyCode", "type"}, new Object[] {code, type.getID()});

		if(list != null && list.size() > 0)
			return OrgLiteVoAssembler.create((Organisation) list.get(0));
		
		return null;
	}

	@Override
	public PDSConfigurationVo getPdsConfiguration()
	{
		String hql = "select pds from PDSConfiguration as pds where pds.isRIE is null order by pds.id desc";
		
		List<?> list = getDomainFactory().find(hql);

		if(list != null && list.size() > 0)
			return PDSConfigurationVoAssembler.create((PDSConfiguration) list.get(0));
		
		return null;
	}

	@Override
	public PDSBackOfficeItemVo createBackOfficeItemAndNotification(PDSBackOfficeItemVo item) throws DomainException
	{
		DomainFactory factory = getDomainFactory();
		
		PDSBackOfficeItem domObj = PDSBackOfficeItemVoAssembler.extractPDSBackOfficeItem(factory, item);
		factory.save(domObj);
		
		return PDSBackOfficeItemVoAssembler.create(domObj);
	}

	@Override
	public AppUserNotificationVo getAppUserById(AppUserRefVo user)
	{
		if(user == null)
			throw new CodingRuntimeException("The user param is null in getAppUserById() function call !");
		
		return AppUserNotificationVoAssembler.create((AppUser) getDomainFactory().getDomainObject(user));
	}

	@Override
	public RBACBaselineJobRoleVo getRBACBaselineJobRole(RBACBaselineJobRoleRefVo role)
	{
		if(role == null || role.getID_RBACBaselineJobRole() == null)
			throw new CodingRuntimeException("role is null or id not provided for method getRBACBaselineJobRole");
		
		return RBACBaselineJobRoleVoAssembler.create((RBACBaselineJobRole) getDomainFactory().getDomainObject(role)); 
	}

	@Override
	public GpShortVo getGp(GpRefVo refVo)
	{
		if(refVo == null || refVo.getID_Gp() == null)
			throw new CodingRuntimeException("GpRefVo is null or id not provided for method getGp");
		
		return GpShortVoAssembler.create((Gp) getDomainFactory().getDomainObject(refVo)); 
	}

	@Override
	public OrganisationWithSitesVo getPractice(OrganisationRefVo refVo)
	{
		if(refVo == null || refVo.getID_Organisation() == null)
			throw new CodingRuntimeException("OrganisationRefVo is null or id not provided for method getPractice");
		
		return OrganisationWithSitesVoAssembler.create((Organisation) getDomainFactory().getDomainObject(refVo)); 
	}
	
}
