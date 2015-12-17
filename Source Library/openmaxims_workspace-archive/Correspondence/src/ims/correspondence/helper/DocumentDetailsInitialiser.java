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
package ims.correspondence.helper;


import ims.core.vo.DocumentVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.PasEventVo;
import ims.correspondence.vo.ClinicAccessFullVoCollection;
import ims.correspondence.vo.ConsultantAccessFullVoCollection;
import ims.correspondence.vo.CorrespondenceDetailsVo;
import ims.correspondence.vo.CorrespondenceStatusHistoryVo;
import ims.correspondence.vo.CorrespondenceStatusHistoryVoCollection;
import ims.correspondence.vo.SpecialtyAccessVoCollection;
import ims.correspondence.vo.PasContactVo;
import ims.correspondence.vo.lookups.Access;
import ims.core.vo.lookups.DocumentStatus;

public class DocumentDetailsInitialiser 
{
	
	private PasEventVo m_PasEvent;
	private CorrespondenceDetailsVo m_CorrespondenceDetails;

	private ConsultantAccessFullVoCollection m_ConsultantAccessCollection = new ConsultantAccessFullVoCollection();
	private SpecialtyAccessVoCollection m_SpecialtyAccessCollection = new SpecialtyAccessVoCollection();
	private ClinicAccessFullVoCollection m_LocationAccessCollection = new ClinicAccessFullVoCollection();
	private boolean m_bInPatientList;
	private String m_strError;

	public DocumentDetailsInitialiser()
	{
		m_PasEvent = new PasEventVo();		
		m_CorrespondenceDetails = new CorrespondenceDetailsVo();
	}
	
	public DocumentDetailsInitialiser(MemberOfStaffShortVo voMos, PasEventVo voPasEvent)
	{
		m_PasEvent = voPasEvent;
		m_CorrespondenceDetails = new CorrespondenceDetailsVo();		
		initializeCorrespondenceDetails(voMos);		
	}


	public DocumentDetailsInitialiser(ConsultantAccessFullVoCollection voCollConsultantAccess, ClinicAccessFullVoCollection voCollLocationAccess,SpecialtyAccessVoCollection voCollSpecialtyAccess)
	{
		m_ConsultantAccessCollection = voCollConsultantAccess;
		m_SpecialtyAccessCollection = voCollSpecialtyAccess;
		m_LocationAccessCollection = voCollLocationAccess;		
	}
			
		
	private void initializeCorrespondenceDetails(MemberOfStaffShortVo voMos)
	{		
		if (null == voMos)
		{
			m_strError = "Member of Staff details not supplied.";			
			m_CorrespondenceDetails = null;
		}
		
		//Set PasEventVo
		m_CorrespondenceDetails.setPasEvent(m_PasEvent);

		CorrespondenceStatusHistoryVoCollection voCollStatusHistory = new CorrespondenceStatusHistoryVoCollection();
		CorrespondenceStatusHistoryVo voStatusHistory = new CorrespondenceStatusHistoryVo();
		voStatusHistory.setStatus(DocumentStatus.LETTERREQUIRED);
		voStatusHistory.setTemplateName(StatusHelper.getGenericTemplateName());
		voStatusHistory.setMos(voMos);//wdev-2677
		
		voCollStatusHistory.add(voStatusHistory);			
		m_CorrespondenceDetails.setCspStatusHistory(voCollStatusHistory);
		
		//Initialise the current document
		DocumentVo voCurrentDocument = new DocumentVo();											
		voCurrentDocument.setStatus(DocumentStatus.LETTERREQUIRED);
		voCurrentDocument.setPatient(m_PasEvent.getPatient());	
		
		//TODO Review
		voCurrentDocument.setClinicalContact(null);
		
		m_CorrespondenceDetails.setCurrentDocument(voCurrentDocument);
		
	}
	
	
	public ims.correspondence.vo.lookups.Access getUserAccess(PasContactVo voPasContact)
	{
		if (voPasContact == null)
			return null;
				
		Access lkpLocationAccess = null;
		Access lkpSpecialtyAccess = null;
		Access lkpConsultantAccess = null;
				
		if (voPasContact.getConsultantIsNotNull() && m_ConsultantAccessCollection != null )
		{
			for (int i=0 ; i < m_ConsultantAccessCollection.size(); i++)
			{
				if (voPasContact.getConsultant().getID_Hcp().equals(m_ConsultantAccessCollection.get(i).getConsultant().getID_Hcp()))
				{
					lkpConsultantAccess = m_ConsultantAccessCollection.get(i).getAccessRight();
					break;
				}						
			}		
			
		}
		
		if (m_bInPatientList == false)
		{
			if (voPasContact.getLocationIsNotNull() && m_LocationAccessCollection != null)
			{
				for (int i=0; i < m_LocationAccessCollection.size(); i++)
				{
					if (voPasContact.getLocation().getID_Location().equals(m_LocationAccessCollection.get(i).getClinic()))
					{
						lkpLocationAccess = m_LocationAccessCollection.get(i).getAccessRight();
						break;
					}
				}
			}
		}
		
		if (voPasContact.getSpecialtyIsNotNull() && m_SpecialtyAccessCollection != null)
		{
			for (int i=0; i < m_SpecialtyAccessCollection.size(); i++)
			{
				if (voPasContact.getSpecialty().equals(m_SpecialtyAccessCollection.get(i).getSpecialty()))
				{
					lkpSpecialtyAccess = m_SpecialtyAccessCollection.get(i).getAccessRight();
					break;
				}					
			}
			
		}
	
		if (lkpLocationAccess == null && lkpSpecialtyAccess == null && lkpConsultantAccess == null)
		{
			return null;
		}
		else if ( (lkpLocationAccess != null && lkpLocationAccess.equals(Access.READONLY)) 
				|| (lkpLocationAccess != null && lkpLocationAccess.equals(Access.READONLY))
				|| (lkpLocationAccess != null && lkpLocationAccess.equals(Access.READONLY)))
		{
			return Access.READONLY;
		}
		else
			return Access.READWRITE;
			
	}		
	
	public boolean get_InPatientList()
	{
		return m_bInPatientList;
	}
	
	public void set_InPatientList(boolean bInPatientList)
	{
		m_bInPatientList = bInPatientList;
	}
	
	public CorrespondenceDetailsVo get_DocumentDetails() {
		return m_CorrespondenceDetails;
	}

	public String getErrorMessage() {
		return m_strError;
	}
	
	public boolean canUpdateStatus(DocumentStatus statusFrom, DocumentStatus statusTo)
	{
		if (statusFrom.getId() == DocumentStatus.LETTERREQUIRED.getId())
		{
			if (statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.DICTATED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
				return true;
			else
				return false;
		}
			
		if (statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId())
		{
			if (statusTo.getId() == DocumentStatus.LETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.DICTATED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
				return true;
			else
				return false;
			
		}

		if (statusTo.getId() == DocumentStatus.DICTATED.getId())
		{
			if (statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
				return true;
			else
				return false;
			
		}

		if (statusTo.getId() == DocumentStatus.NOLETTERDICTATED.getId())
		{
			if (statusTo.getId() == DocumentStatus.LETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.NOLETTERREQUIRED.getId() ||
					statusTo.getId() == DocumentStatus.DICTATED.getId())
				return true;
			else
				return false;
			
		}
		
		return false;
	}
	
	
}
