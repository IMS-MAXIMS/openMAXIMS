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

/*
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:38
 */
package ims.billing.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static ReasonForNonPaymentCollection getReasonForNonPayment(LookupService lookupService) {
		ReasonForNonPaymentCollection collection =
			(ReasonForNonPaymentCollection) lookupService.getLookupCollection(ReasonForNonPayment.TYPE_ID, 
				ReasonForNonPaymentCollection.class, ReasonForNonPayment.class);
		return collection;
	}

	public static ReasonForNonPayment getReasonForNonPaymentInstance(LookupService lookupService, int id) 
	{
		return (ReasonForNonPayment)lookupService.getLookupInstance(ReasonForNonPayment.class, ReasonForNonPayment.TYPE_ID, id);
	}
	
}



