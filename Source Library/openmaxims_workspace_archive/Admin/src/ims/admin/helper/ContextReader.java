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

import ims.core.vo.CareContextShortVo;
import ims.core.vo.ClinicalContactShortVo;
import ims.core.vo.EpisodeofCareShortVo;
import ims.core.vo.PatientShort;
import ims.framework.Context;
import ims.framework.enumerations.ContextQueryItem;

public class ContextReader
{
	public static PatientShort getPatientShort(Context ctx)
	{
		return (PatientShort)ctx.get(ContextQueryItem.PATIENT.getKey());
	}
	public static EpisodeofCareShortVo getCurrentEpisodeOfCare(Context ctx)
	{
		return (EpisodeofCareShortVo)ctx.get(ContextQueryItem.EPISODE_OF_CARE.getKey());
	}	
	public static void setPatientShort(PatientShort patVo, Context ctx)
	{
		ctx.put(ContextQueryItem.PATIENT.getKey(), patVo);
	}
	public static void setCareContext(CareContextShortVo ctxVo, Context ctx)
	{
		ctx.put(ContextQueryItem.CURRENT_CARE_CONTEXT.getKey(), ctxVo);
	}
	public static void setClinicalContact(ClinicalContactShortVo conVo, Context ctx)
	{
		ctx.put(ContextQueryItem.CLINICAL_CONTACT.getKey(), conVo);
	}
	public static void setCurrentEpisodeOfCare(EpisodeofCareShortVo eocVo, Context ctx)
	{
		ctx.put(ContextQueryItem.EPISODE_OF_CARE.getKey(), eocVo);
	}
	public static void setLoggedInUSer(String userId, Context ctx)
	{
		ctx.put(ContextQueryItem.LOGGEDIN_USER.getKey(), userId);
	}
	public static void setLoggedInRsno(String rsnoId, Context ctx)
	{
		ctx.put(ContextQueryItem.LOGGEDIN_USER_RSNO.getKey(), rsnoId);
	}			
}
