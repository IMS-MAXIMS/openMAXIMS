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


import ims.RefMan.vo.AdmissionDetailWithConsultantStaysForCodingVo;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.ConsultantStayForPatientCodingListVo;
import ims.RefMan.vo.DischargedEpisodeForReferralExternalCodingVo;
import ims.RefMan.vo.ReferralExternalCodingVo;
import ims.core.vo.PatientShort;
import ims.framework.interfaces.IAppUser;

public interface ICodeExportImportHelper 
{
	//WDEV-23787
	StringBuilder exportCodingData(IAppUser iAppUser,
			CatsReferralRefVo referralVo,
			AdmissionDetailWithConsultantStaysForCodingVo admissionVo,
			ConsultantStayForPatientCodingListVo  FCEVo,
			DischargedEpisodeForReferralExternalCodingVo dischargeVo,
			PatientShort patient,
			Integer totalNumFCEs,
			Integer episodeOrder,
			Boolean lastEpisodeSpell,
			ReferralExternalCodingVo referralCodingVo);
	//WDEV-23787
	
	ReferralExternalCodingVo importCodingData(ReferralExternalCodingVo referralCodingRecord,String codedFileContent);
}


