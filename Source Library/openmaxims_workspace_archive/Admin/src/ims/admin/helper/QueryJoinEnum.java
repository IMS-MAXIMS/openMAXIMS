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

public enum QueryJoinEnum
{
	// New Results Search form JOINS
	ORDER_INVESTIGATION,
	ORDER_INVESTIGATION_ORDER_DETAILS,
	ORDER_INVESTIGATION_ORDER_DETAILS_PATIENT, 
	ORDER_INVESTIGATION_ORDER_DETAILS_PATIENT_MEDIC,
	ORDER_INVESTIGATION_ORDER_DETAILS_OUTPATIENT_DEPT,
	ORDER_INVESTIGATION_RESULT_DETAILS, 
	ORDER_INVESTIGATION_RESULT_DETAILS_PATHOLOGY,
	ORDER_INVESTIGATION_INVESTIGATION,
	ORDER_INVESTIGATION_INVESTIGATION_LOCATION_PROVIDER,
	ORDER_INVESTIGATION_INVESTIGATION_LOCATION_PROVIDER_SERVICE,
}
