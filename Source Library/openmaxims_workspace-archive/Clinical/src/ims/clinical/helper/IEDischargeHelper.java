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
package ims.clinical.helper;

import ims.core.vo.MedicationLiteVo;
import ims.domain.DomainFactory;
import ims.domain.DomainInterface;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.edischarge.vo.SummaryRefVo;
import ims.vo.interfaces.IEDischargeSummary;

public interface IEDischargeHelper extends DomainInterface
{
	public ims.clinical.vo.DischargeDetailsVo getDischargeDetails(ims.core.admin.vo.CareContextRefVo careContextRefvo);
	public ims.clinical.vo.DischargeDetailsVo saveDischargeDetails(ims.clinical.vo.DischargeDetailsVo voDischargeDetails) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;
	public ims.clinical.vo.TTAMedicationAndPharmacyVo getTTAMedicationAndPharmacy(ims.core.admin.vo.CareContextRefVo careContextRefvo);
	public ims.core.vo.HcpLiteVo getHcp(ims.core.resource.people.vo.HcpRefVo voRef);
	public ims.core.vo.MemberOfStaffLiteVo getMemberOfStaff(ims.core.resource.people.vo.MemberOfStaffRefVo voRef);
	public ims.clinical.vo.TTAMedicationAndPharmacyVo save(ims.clinical.vo.TTAMedicationAndPharmacyVo record, SummaryRefVo summary) throws StaleObjectException, DomainInterfaceException, UniqueKeyViolationException; 
	public MedicationLiteVo saveMedication(MedicationLiteVo medication) throws DomainInterfaceException, StaleObjectException, UniqueKeyViolationException;
	public void updateSummaryIfRequired(IEDischargeSummary record, SummaryRefVo summary, DomainFactory factory) throws StaleObjectException;	
	public ims.framework.utils.Date getEstimatedDischargeDate(SummaryRefVo summary);
}
