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
package ims.clinical.helper;

import ims.clinical.vo.SurgicalAuditOperationDetailRefVo;
import ims.clinical.vo.SurgicalAuditOperationDetailVo;
import ims.clinical.vo.SurgicalAuditOperationDetailVoCollection;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.resource.place.vo.LocSiteRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.domain.DomainInterface;

public interface IESurgicalAuditHelper extends DomainInterface
{
	public SurgicalAuditOperationDetailVoCollection listSurgicalAuditOperationDetailByCareContext(CareContextRefVo careContextRef);
	public SurgicalAuditOperationDetailVo getSurgicalAuditOperationDetail(SurgicalAuditOperationDetailRefVo surgicalAuditOpRef);
	public LocationLiteVoCollection getTheatre(LocationRefVo locRef);	//wdev-15093
	public ims.clinical.vo.SurgicalAuditOperationDetailVo saveSurgicalAuditOperationDetail(ims.clinical.vo.SurgicalAuditOperationDetailVo record) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException; //wdev-15101
	public LocationLiteVoCollection listActiveLocationsAtTheSameLevelWithLocation(LocationRefVo locationRef);
	public LocationLiteVoCollection listLocationsByParentLocation(LocationRefVo locationRef);
	public Boolean isStale(SurgicalAuditOperationDetailVo surgAudit);
	public LocationLiteVo getLocationLiteVo(LocSiteRefVo locSiteRef);
	
	//WDEV-15675
	public LocationLiteVoCollection listLocationsByParentLocation(LocationRefVo locationRef, ims.core.vo.lookups.LocationType locType);
	public LocationLiteVoCollection listActiveLocationsAtTheSameLevelWithLocation(LocationRefVo locationRef, ims.core.vo.lookups.LocationType locType);
	
}
