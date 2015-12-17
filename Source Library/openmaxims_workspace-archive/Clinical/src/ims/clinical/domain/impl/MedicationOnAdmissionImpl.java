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
package ims.clinical.domain.impl;
 
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.clinical.domain.objects.PatientMedication;
import ims.core.clinical.vo.PatientMedicationRefVo;
import ims.core.vo.CareContextLiteVo;
import ims.core.vo.ClinicalContactShortVo;
import ims.core.vo.HcpCollection;
import ims.core.vo.PatientMedicationLiteVoCollection;
import ims.core.vo.PatientMedicationVo;
import ims.core.vo.PatientMedicationVoCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.CareContextLiteVoAssembler;
import ims.core.vo.domain.PatientMedicationLiteVoAssembler;
import ims.core.vo.domain.PatientMedicationVoAssembler;
import ims.core.vo.lookups.ContextType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;

import java.util.ArrayList;

public class MedicationOnAdmissionImpl extends DomainImpl implements ims.clinical.domain.MedicationOnAdmission, ims.domain.impl.Transactional
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HcpCollection listHcps(ims.core.vo.HcpFilter filter)
	{
		HcpAdmin hcpAdmin = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHCPs(filter);
	}

	/*
	 * 
	 */
	public PatientMedicationVo saveMedicationOnAdmission(PatientMedicationVo medicationOnAdmissionItem) throws StaleObjectException
	{
		if (!medicationOnAdmissionItem.isValidated())
		{
			throw new DomainRuntimeException("PatientMedication ValueObject has not been validated");
		}

		DomainFactory factory = getDomainFactory();

		PatientMedication doPatientMedication = PatientMedicationVoAssembler.extractPatientMedication(factory, medicationOnAdmissionItem);
		factory.save(doPatientMedication);
		return (PatientMedicationVoAssembler.create(doPatientMedication));
	}

	public PatientMedicationVoCollection listMedicationOnAdmission(ClinicalContactShortVo clinicalContactShortVo, CareContextRefVo careContextRefVo)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" ");
		String query = "from PatientMedication t ";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		String andStr = " ";

		if (clinicalContactShortVo != null)
		{
			hql.append(andStr + " t.clinicalContact.id = :Id");
			markers.add("Id");
			values.add(clinicalContactShortVo.getID_ClinicalContact());
			andStr = " and ";
		}
		if (careContextRefVo != null)
		{
			hql.append(andStr + " t.careContext.id = :IdCX");
			markers.add("IdCX");
			values.add(careContextRefVo.getID_CareContext());
			andStr = " and ";
		}

		if (markers.size() > 0)
			query += " where ";
		query += hql.toString();

		return PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(factory.find(query, markers, values));
	}

	/**
	 * Lists Medication
	 */
	public PatientMedicationVoCollection listMedicationOnAdmission(ClinicalContactShortVo clinicalContactShortVo, CareContextRefVo careContextRefVo, Boolean isDiscontinued) 
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" ");
		String query = "from PatientMedication t ";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		String andStr = " ";

		if (clinicalContactShortVo != null)
		{
			hql.append(andStr + " t.clinicalContact.id = :Id");
			markers.add("Id");
			values.add(clinicalContactShortVo.getID_ClinicalContact());
			andStr = " and ";
		}
		if (careContextRefVo != null)
		{
			hql.append(andStr + " t.careContext.id = :IdCX");
			markers.add("IdCX");
			values.add(careContextRefVo.getID_CareContext());
			andStr = " and ";
		}
		if (isDiscontinued != null)
		{
			hql.append(andStr + " t.isDiscontinued = :IsDiscontinued");
			markers.add("IsDiscontinued");
			values.add(isDiscontinued);
			andStr = " and ";
		}

		if (markers.size() > 0)
			query += " where ";
		query += hql.toString();

		return PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(factory.find(query, markers, values));
	}

	/**
	 * 
	 */
	public void markAsRIE(PatientMedicationVo medication, ClinicalContactShortVo clinicalContactShortVo) throws StaleObjectException, ForeignKeyViolationException
	{
//		DomainFactory factory = getDomainFactory();
//		PatientMedication domMed = PatientMedicationVoAssembler.extractPatientMedication(factory, medication);
	}

	public PatientMedicationLiteVoCollection listPatientLastMedication(PatientShort patient, DateTime startDateTime)
	{
		if (patient == null || !patient.getID_PatientIsNotNull())
			return null;
		
		// Get last care context (of type INPATIET)
		StringBuilder ccQuery = new StringBuilder();
		ccQuery.append("select cc from PatientMedication as pmed join pmed.careContext as cc where pmed.patient.id = :PAT_ID and cc.context.id = :CC_TYPE and (pmed.isRIE is null or pmed.isRIE = 0) and (pmed.isDiscontinued is null or pmed.isDiscontinued = 0)");
		ArrayList<String> paramCCNames = new ArrayList<String>();
		ArrayList<Object> paramCCValues = new ArrayList<Object>();
		
		paramCCNames.add("PAT_ID");
		paramCCNames.add("CC_TYPE");
		paramCCValues.add(patient.getID_Patient());
		paramCCValues.add(ContextType.INPATIENT.getID());
		
		if (startDateTime != null)
		{
			ccQuery.append(" and cc.startDateTime <= :DATE");
			paramCCNames.add("DATE");
			paramCCValues.add(startDateTime.getJavaDate());
		}
		
		ccQuery.append(" order by cc.startDateTime desc");

		CareContextLiteVo careContext = CareContextLiteVoAssembler.create((CareContext) getDomainFactory().findFirst(ccQuery.toString(), paramCCNames, paramCCValues));
		
		if (careContext == null || !careContext.getID_CareContextIsNotNull())
			return null;
		
		String hqlQuery = "select pmed from PatientMedication as pmed where pmed.patient.id = :PAT_ID and pmed.careContext.id = :CC_ID";
		ArrayList<String> paramPMedNames = new ArrayList<String>();
		ArrayList<Object> paramPMedValues = new ArrayList<Object>();
		
		paramPMedNames.add("PAT_ID");
		paramPMedNames.add("CC_ID");
		paramPMedValues.add(patient.getID_Patient());
		paramPMedValues.add(careContext.getID_CareContext());
		
				
		return PatientMedicationLiteVoAssembler.createPatientMedicationLiteVoCollectionFromPatientMedication(getDomainFactory().find(hqlQuery, paramPMedNames, paramPMedValues));
	}

	public PatientMedicationVo getPatientMedication(PatientMedicationRefVo patientMedicationId) 
	{
		if(patientMedicationId == null || !patientMedicationId.getID_PatientMedicationIsNotNull())
			throw new CodingRuntimeException("Can not get PatientMedication on null Id.");
		
		return PatientMedicationVoAssembler.create((PatientMedication) getDomainFactory().getDomainObject(PatientMedication.class, patientMedicationId.getID_PatientMedication()));
	}
}
