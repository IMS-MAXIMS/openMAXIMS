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

import ims.RefMan.vo.ContractConfigShortVo;
import ims.RefMan.vo.domain.ContractConfigShortVoAssembler;
import ims.configuration.gen.ConfigFlag;
import ims.core.configuration.domain.objects.ContractConfig;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.place.domain.objects.CCGPCTPCCodes;
import ims.core.vo.GpToPracticesVo;
import ims.core.vo.PatientWithGPForCCGVo;
import ims.core.vo.domain.PatientWithGPForCCGVoAssembler;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.impl.DomainImpl;

/**
 * helper class to retrieve CCG / Contract Suitable for CCG based on Patient's GP practice/surgery address or patient's address
 *
 *
 */
public class CCGContractForPostCodeHelper extends DomainImpl implements ICCGContractForPostCodeHelper
{

	private static final long serialVersionUID = 1L;

	String cCGCode;
	PatientWithGPForCCGVo patient;
	ContractConfigShortVo contract;

	public CCGContractForPostCodeHelper initializeContractSuitableForCCGHelper(PatientRefVo patientRef)
	{
		if (patientRef == null || patientRef.getID_Patient() == null)
			return null;
		this.patient = getPatientForCCG(patientRef);
		setCCGCode(patient);
		setContractConfigSuitableforCCG(cCGCode);

		return this;
	}

	public String getCCGCode()
	{
		return cCGCode;
	}
	public ContractConfigShortVo getContractConfigSuitableForCCG()
	{
		return contract;
	}
	public PatientWithGPForCCGVo getPatientWithGPForCCG()
	{
		return patient;
	}

	private void setCCGCode(PatientWithGPForCCGVo patientWithGP)
	{
		this.cCGCode = getCCGCode(patientWithGP);

	}
	private void setContractConfigSuitableforCCG(String cCGVal)
	{
		this.contract = getContractByCCG(cCGVal);	
	}

	private PatientWithGPForCCGVo getPatientForCCG(PatientRefVo patient)
	{
		if (patient == null || patient.getID_Patient() == null)
			return null;

		PatientWithGPForCCGVo patientWithGP = (PatientWithGPForCCGVo) PatientWithGPForCCGVoAssembler.create((ims.core.patient.domain.objects.Patient) getDomainFactory().getDomainObject(ims.core.patient.domain.objects.Patient.class, patient.getID_Patient()));
		return patientWithGP;
	}


	private ContractConfigShortVo getContractByCCG(String codeCCG)
	{
		if (cCGCode == null || cCGCode.length() == 0)
			return null;

		String contractQuery = "SELECT contract FROM ContractConfig AS contract LEFT JOIN contract.cCGsForContract AS ccgContract WHERE contract.status = :ACTIVE AND ccgContract.cCGCode = :CCG_CONTRACT AND ccgContract.isActive = 1";

		ContractConfigShortVo contractVO = ContractConfigShortVoAssembler.create((ContractConfig) getDomainFactory().findFirst(contractQuery, new String[]{"ACTIVE","CCG_CONTRACT"}, new Object[]{getDomLookup(PreActiveActiveInactiveStatus.ACTIVE), codeCCG}));
		return contractVO;
	}


	private String getCCGCodeFromPostCode(String postCode)
	{
		if (postCode == null || postCode.length() == 0)
			return null;

		postCode = postCode.replace(" ","");	//wdev-18655
		String ccgQuery = "SELECT ccg FROM CCGPCTPCCodes AS ccg WHERE REPLACE(ccg.postcode, ' ','') = :POST_CODE";
		CCGPCTPCCodes ccgCode = (CCGPCTPCCodes) getDomainFactory().findFirst(ccgQuery, "POST_CODE", postCode);

		if (ccgCode != null)
			return ccgCode.getCCGCode();
		return null;
	}		

	private String getCCGCode(PatientWithGPForCCGVo patient)
	{
		if (patient == null)
			return null;
		String ccG = null;
		if (!Boolean.TRUE.equals(ConfigFlag.DOM.GP_USE_SURGERIES.getValue()))
		{
			// 1 - Patient.Gp.practices.practice (with isDefault).PCTCode (this is a CCG so no lookup of CCGPCTPCCodes needed) 
			// 2 - Patient.Gp.practices.practice (with isDefault).Address.Postcode
			if (patient.getGp() != null && patient.getGp().getPractices() != null)
			{
				for (GpToPracticesVo gpToPractice : patient.getGp().getPractices())
				{
					if (Boolean.TRUE.equals(gpToPractice.getIsPrimaryPractice()))
					{
						// Case 1
						if (gpToPractice.getPractice() != null && gpToPractice.getPractice().getPctCode() != null && gpToPractice.getPractice().getPctCode().trim().length() > 0)
							return gpToPractice.getPractice().getPctCode();

						// Case 2
						if (gpToPractice.getPractice() != null && gpToPractice.getPractice().getAddress() != null)
						{
							ccG = getCCGCodeFromPostCode(gpToPractice.getPractice().getAddress().getPostCode());
							if (ccG != null) 
								return ccG;
						}
					}

				}
			}
		}

		// 3 - Patient.gpSurgery.address.postcode
		if (patient.getGpSurgery() != null && patient.getGpSurgery().getAddress() != null)
		{
			ccG = getCCGCodeFromPostCode(patient.getGpSurgery().getAddress().getPostCode());
			if (ccG != null)
				return ccG;
		}

		// 4 -  Patient.Address.Postcode 
		if (patient.getAddress() != null)
		{
			ccG = getCCGCodeFromPostCode(patient.getAddress().getPostCode());
			if (ccG != null)
				return ccG;
		}		
		return null;
	}
}
