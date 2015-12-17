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
package ims.core.helper;

import ims.core.domain.Demographics;
import ims.core.domain.impl.DemographicsImpl;
import ims.core.vo.Patient;
import ims.core.vo.PatientShort;
import ims.domain.Transaction;
import ims.domain.exceptions.StaleObjectException;
import ims.dto.DTODomainImplementation;
import ims.utils.Logging;
import org.apache.log4j.Logger;

public class DomainHelper extends DTODomainImplementation implements ims.core.helper.IDomainHelper, ims.domain.impl.Transactional
{
	
	private static final Logger					LOG					= Logging.getLogger(DomainHelper.class);
	
	public Patient getPatient(PatientShort patient) throws StaleObjectException {
		
		Demographics demographicsImpl = (Demographics)getDomainImpl(DemographicsImpl.class);
		Patient pt= demographicsImpl.getPatient(patient);
		
		Transaction transaction = this.getDomainFactory().getTransaction();

		if (transaction != null)
		{
			transaction.commit();
			boolean wasRolledBack = transaction.wasRolledBack();
			boolean wasCommitted = transaction.wasCommitted();
			// commit
			if ( !wasRolledBack && ! wasCommitted ) {
				if (LOG.isDebugEnabled())
					LOG.debug("commited method patient save");
				if (getSessLogger() != null)
				{
					getSessLogger().warn("commited method patient save");
				}
			}
			else {
				if (LOG.isDebugEnabled())
					LOG.debug("method save patient"+", wasRolledBack="+wasRolledBack+", wasCommitted="+wasCommitted);
				if (getSessLogger() != null)
				{
					getSessLogger().warn("method save patient"+", wasRolledBack="+wasRolledBack+", wasCommitted="+wasCommitted);
				}
			}	
			this.getDomainFactory().setTransaction(null);
		}
		this.free();		
		return pt;
	}

	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.helper.IDomainHelper domain;


}
