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
package ims.admin.helper;

import ims.admin.vo.AppUserVo;
import ims.admin.vo.domain.AppUserVoAssembler;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.domain.objects.ClinicalContact;
import ims.core.admin.domain.objects.EpisodeOfCare;
import ims.core.configuration.domain.objects.AppUser;
import ims.core.patient.domain.objects.Patient;
import ims.core.vo.PatientShort;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.ClinicalContactShortVoAssembler;
import ims.core.vo.domain.EpisodeofCareShortVoAssembler;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.DomainFactory;
import ims.dto.DTODomainImplementation;
import ims.framework.Context;
import ims.framework.interfaces.IContextSetter;

public class CcoContextSetter extends DTODomainImplementation implements IContextSetter
{
	private static final long serialVersionUID = 1L;
	private Context ctx;
	
	public CcoContextSetter()
	{
	}

	public void setContext(Context ctx)
	{
		this.ctx = ctx;
	}
	
	public void setPatient(int patId)
	{
		DomainFactory factory = this.getDomainFactory();		
		Patient domPat = (Patient)factory.getDomainObject(Patient.class, patId);
		PatientShort patientVo = PatientShortAssembler.create(domPat);		
		CcoContextReader.setPatientShort(patientVo, ctx);		
	}

	public void setCareContext(int ctxId)
	{
		DomainFactory factory = this.getDomainFactory();
		CareContext cont = (CareContext)factory.getDomainObject(CareContext.class, ctxId);
		CcoContextReader.setCareContext(CareContextShortVoAssembler.create(cont), ctx);		
	}

	public void setClinicalContact(int conId)
	{
		DomainFactory factory = this.getDomainFactory();
		ClinicalContact cc = (ClinicalContact)factory.getDomainObject(ClinicalContact.class, conId);
		CcoContextReader.setClinicalContact(ClinicalContactShortVoAssembler.create(cc), ctx);		
	}

	public void setEpisodeOfCare(int eocId)
	{
		DomainFactory factory = this.getDomainFactory();
		EpisodeOfCare eoc = (EpisodeOfCare)factory.getDomainObject(EpisodeOfCare.class, eocId);
		CcoContextReader.setCurrentEpisodeOfCare(EpisodeofCareShortVoAssembler.create(eoc), ctx);		
	}

	public void setLoggedInUser() 
	{
		CcoContextReader.setLoggedInUSer(new Integer(getSession().getUser().getUserId()).toString(),ctx);
	}

	public void setLoggedInRsno(int userId) 
	{
		DomainFactory factory = this.getDomainFactory();
		AppUser appusr = (AppUser)factory.getDomainObject(AppUser.class, userId);
		AppUserVo appuserVo = AppUserVoAssembler.create(appusr);
		
		String rsnoId = "";
		
		if (appuserVo.getMosIsNotNull())
		{
			if (appuserVo.getMos().getCodeMappingsIsNotNull())
			{
				for (int i=0; i < appuserVo.getMos().getCodeMappings().size();i++)
				{
					TaxonomyMap taxmapVo = appuserVo.getMos().getCodeMappings().get(i);					
					if (taxmapVo.getTaxonomyNameIsNotNull() && taxmapVo.getTaxonomyName().equals(TaxonomyType.PAS))
					{
						rsnoId = taxmapVo.getTaxonomyCode();
						break;
					}
				}
				
				CcoContextReader.setLoggedInRsno(rsnoId, ctx);
				
			}
			
		}
	}
}
