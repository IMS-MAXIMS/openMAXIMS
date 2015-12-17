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
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.forms.clinicviewcancel;

import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.PatientShort;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.dto.Result;
import ims.dto.client.Lkup;
import ims.dto.client.Sd_appt;
import ims.dto.client.Sd_session;
import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DialogResult;

import java.util.Hashtable;

public class Logic extends BaseLogic
{
	private final static String NewLine = System.getProperty("line.separator");
	
	protected void onFormOpen()
	{
		if(form.getGlobalContext().CcoSched.ClinicViewCancel.getDialogTitleIsNotNull())
			form.pnlTitle().setValue(form.getGlobalContext().CcoSched.ClinicViewCancel.getDialogTitle());
		// load statuses
		Lkup statuses = (Lkup)domain.getDTOInstance(Lkup.class);
		statuses.Filter.clear();
		statuses.Filter.Lkup_typ = "3449";
		Result result = statuses.list();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return;
		}

		for (int i = 0; i < statuses.DataCollection.count(); ++i)
			if ((statuses.DataCollection.get(i).Lkup_stat.equalsIgnoreCase("Y") || statuses.DataCollection.get(i).Lkup_stat.equals("1")) && (statuses.DataCollection.get(i).Lkup_id.equals("-2190") || statuses.DataCollection.get(i).Lkup_id.equals("-2193")))
				form.Status().newRow(statuses.DataCollection.get(i).Lkup_id, statuses.DataCollection.get(i).Lkup_nm);

		if(form.getGlobalContext().CcoSched.ClinicView.getStatus() != null)
			form.Status().setValue(form.getGlobalContext().CcoSched.ClinicView.getStatus().equals("-2193") ? "-2193" : "-2190");

		// load reasons
		Lkup reasons = (Lkup)domain.getDTOInstance(Lkup.class);
		reasons.Filter.clear();
		reasons.Filter.Lkup_typ = "3444";
		result = reasons.list();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return;
		}

		Hashtable ht = new Hashtable();
		for (int i = 0; i < reasons.DataCollection.count(); ++i)
			if ((reasons.DataCollection.get(i).Lkup_stat.equalsIgnoreCase("Y") || reasons.DataCollection.get(i).Lkup_stat.equals("1")) && ( reasons.DataCollection.get(i).Lkup_parent.equals("0") || reasons.DataCollection.get(i).Lkup_parent.equals("")))
				ht.put(reasons.DataCollection.get(i).Lkup_id, form.Reason().getNodes().add(reasons.DataCollection.get(i).Lkup_id, reasons.DataCollection.get(i).Lkup_nm));
		
		for (int i = 0; i < reasons.DataCollection.count(); ++i)
		{
			if ((reasons.DataCollection.get(i).Lkup_stat.equalsIgnoreCase("Y") || reasons.DataCollection.get(i).Lkup_stat.equals("1")) && !reasons.DataCollection.get(i).Lkup_parent.equals("0") && !reasons.DataCollection.get(i).Lkup_parent.equals(""))
			{
				//TreeNode tn = ht[reasons.LkupCollection[i].attLkup_parent] as TreeNode;
				TreeNode tn = (TreeNode)ht.get(reasons.DataCollection.get(i).Lkup_parent);
				if (tn == null)
				{
					engine.showMessage("Parent undefinded (Reason lookup).");
					return;
				}					
				ht.put(reasons.DataCollection.get(i).Lkup_id, tn.getNodes().add(reasons.DataCollection.get(i).Lkup_id, reasons.DataCollection.get(i).Lkup_nm));
			}
		}
		
		String s = form.getGlobalContext().CcoSched.ClinicView.getReason();
		boolean b = false;
		//foreach (TreeNode root in Form.Reason.Nodes)
		for (int i = 0; i < form.Reason().getNodes().size(); i++)
		{
			TreeNode root = form.Reason().getNodes().get(i);
			//foreach (TreeNode node in root.Nodes)
			for (int j = 0; j < root.getNodes().size(); j++)
			{
				TreeNode node = root.getNodes().get(j);
				
				b = ((String)node.getValue()).equalsIgnoreCase(s);
				if (b)
					form.Reason().setValue(s);
				node.setChecked(b);
			}

			b = ((String)root.getValue()).equalsIgnoreCase(s);
			if (b)
				form.Reason().setValue(s);
			root.setChecked(b);
		}

		// load patient information
		PatientShort patient = form.getGlobalContext().Core.getPatientShort();
		if(patient!=null){
			form.PatientHospitalNumber().setValue(patient.getHospnum() != null ? patient.getHospnum().getValue() : "");
			form.PatientName().setValue(patient.getNameIsNotNull() ? patient.getName().getForename() + " " + patient.getName().getSurname() : "");
			form.PatientDOB().setValue(patient.getDobIsNotNull() ? patient.getDob().toString() : "");
	
			if (patient.getAddressIsNotNull())
			{
				StringBuffer address = new StringBuffer(200);
				if(patient.getAddress().getLine1()!=null){
					address.append(patient.getAddress().getLine1());
					address.append(NewLine);
				}
				if(patient.getAddress().getLine2()!=null){
					address.append(patient.getAddress().getLine2());
					address.append(NewLine);
				}
				if(patient.getAddress().getLine3()!=null){
					address.append(patient.getAddress().getLine3());
					address.append(NewLine);
				}
				if(patient.getAddress().getLine4()!=null){
					address.append(patient.getAddress().getLine4());
					address.append(NewLine);
				}
				if(patient.getAddress().getLine5()!=null){
					address.append(patient.getAddress().getLine5());
					address.append(NewLine);
				}
				form.PatientAddress().setValue(address.toString());
			}
		}
		//WDEV-16929 Category is now populated
		form.PatientCategory().setValue(form.getGlobalContext().CcoSched.ClinicView.getCategoryIsNotNull() ? form.getGlobalContext().CcoSched.ClinicView.getCategory() : ""); //??????????????

		form.Comment().setValue(form.getGlobalContext().CcoSched.ClinicView.getBookingComment());
		//12/06/2003 - The get was done before the update before
		DoGet();
	}
	protected void onCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	protected void onSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.getLocalContext().getApptDtp() == null)
		{
			engine.showMessage("No appointment selected.");
			return;
		}
		//wdev-13350
		if(form.Status().getValue() == null)
		{
			engine.showMessage("Status is mandatory.");
			return;
		}
		//----------
		//13/12/2004 - Make Reason mandatory 
		if(!ReasonSelected(null))
		{
			engine.showMessage("No reason selected.");
			return;
		}

		Sd_appt appointments = form.getLocalContext().getApptDtp();
		Sd_appt.Sd_apptRecord appointment = appointments.DataCollection.get(0);

		Result result = appointments.getForUpdate();
		if (result != null)
		{
			if (result.getId() < 0)
				engine.showMessage(result.getMessage());
			else
				engine.showMessage("Data was changed.");
			return;
		}
		if (form.getGlobalContext().CcoSched.ClinicView.getAppointmentIDList() != null)
			for (int i=0; i<form.getGlobalContext().CcoSched.ClinicView.getAppointmentIDList().size(); i++)				
			{
				//foreach (dto.Sd_apptDTO.Appt_idClient t in appointment.Appt_idCollection)
				for(int j = 0; j < appointment.Appt_idCollection.count(); j++)
				{
					Sd_appt.Sd_apptAppt_idRecord t = appointment.Appt_idCollection.get(j); 

					if (t.Appt_id.equals(form.getGlobalContext().CcoSched.ClinicView.getAppointmentIDList().get(i)))					
					{
						//					t.attHcp_present = Form.Seen.Value ? "-10100" : "-10101";
						t.Appt_stat = form.Status().getValue();

						String tmp = "";
						//foreach (TreeNode root in Form.Reason.Nodes)
						for (int k = 0; k < form.Reason().getNodes().size(); k++)
						{
							TreeNode root = form.Reason().getNodes().get(k);
							//foreach (TreeNode node in root.Nodes)
							for (int index = 0; index < root.getNodes().size(); index++)
							{
								TreeNode node = root.getNodes().get(index);
								
								if (node.isChecked())
								{
									tmp = (String)node.getValue();
									break;
								}
							}
							
							if (tmp.length() > 0)
								break;
							
							if (root.isChecked())
							{
								tmp = (String)root.getValue();
								break;
							}
						}

						t.Appt_stat_reason = tmp;
						//t.ing1 = form.getGlobalContext().CcoSched.getLoggedInUserId();
						// WDEV-14218
						// Any member of staff can make a booking
						MemberOfStaffShortVo mosVo = (MemberOfStaffShortVo) domain.getMosUser();
						if (mosVo != null)
							t.Hcp_booking1 =String.valueOf(mosVo.getIMosId());
						
						break;
					}
				}
			}	
		else
			//foreach (dto.Sd_apptDTO.Appt_idClient t in appointment.Appt_idCollection)
			for(int i = 0; i < appointment.Appt_idCollection.count(); i++)
			{
				Sd_appt.Sd_apptAppt_idRecord t = appointment.Appt_idCollection.get(i);
				
				if (t.Appt_id.equals(form.getGlobalContext().CcoSched.ClinicView.getAppointmentID()))					
				{
					//					t.attHcp_present = Form.Seen.Value ? "-10100" : "-10101";
					t.Appt_stat = form.Status().getValue();

					String tmp = "";
					//foreach (TreeNode root in Form.Reason.Nodes)
					for (int k = 0; k < form.Reason().getNodes().size(); k++)
					{
						TreeNode root = form.Reason().getNodes().get(k);
						//foreach (TreeNode node in root.Nodes)
						for (int index = 0; index < root.getNodes().size(); index++)
						{
							TreeNode node = root.getNodes().get(index);
							if (node.isChecked())
							{
								tmp = (String)node.getValue();
								break;
							}
						}
						if (tmp != "")
							break;
						
						if (root.isChecked())
						{
							tmp = (String)root.getValue();
							break;
						}
					}

					t.Appt_stat_reason = tmp;
					// WDEV-14218
					// Any member of staff can make a booking
					MemberOfStaffShortVo mosVo = (MemberOfStaffShortVo) domain.getMosUser();
					if (mosVo != null)
						t.Hcp_booking1 =String.valueOf(mosVo.getIMosId());

					
					//20/01/2004 - Set the inpatient value
					if(form.getGlobalContext().CcoSched.ClinicView.getInpatientIsNotNull())
						t.Appinpatstat = form.getGlobalContext().CcoSched.ClinicView.getInpatient();
					break;
				}
			}
		//28/03/2003 - Jacinta requirements - Clear "Arrival Time" and "Attendance Status"
		if(appointments.DataCollection.count() > 0 && appointments.DataCollection.get(0).Appt_idCollection.count() > 0)
		{
			appointments.DataCollection.get(0).Appt_idCollection.get(0).Arr_tme  = "";
			appointments.DataCollection.get(0).Appt_idCollection.get(0).Att_stat = "";
		}
		
		result = appointments.update();
		if (result != null)
		{
			engine.showMessage("Failed to update record.");
			engine.showMessage(result.getMessage());
			return;
		}

		// wdev-8873 - Instantiate this event on Patient's Pathway
		if (appointments.DataCollection.count() > 0)
			notifyPathway(appointments.DataCollection.get(0));
		engine.close(DialogResult.OK);
	}
	
	/**
	 * wdev-8873
	 * Check if there is an rkey associated with this appointment
	 * If so, make a call to instantiate an event based on the referral
	 * @param appointmentsRecord
	 */
	private void notifyPathway(Sd_appt.Sd_apptRecord appt) 
	{
		
		// Get the activity from the session, this should be passed to the instantiate Event method
		Sd_session session = (Sd_session)domain.getDTOInstance(Sd_session.class);
		session.Filter.clear();
		
		session.Filter.Prfile_sess_id = appt.Appt_idCollection.get(0).Prfile_sess_id;
		Result result = session.get();
		if (result != null || session.DataCollection.count() == 0)
			return;

		try
		{
			String apptDtDetails = appt.First_appt_date;
			if (appt.First_appt_att_time.length() == 5)
				apptDtDetails += "0";
			apptDtDetails += appt.First_appt_att_time;
			
			// WDEV-13403
			EpisodeOfCareRefVo voEpis = new EpisodeOfCareRefVo(new Integer(appt.Ccs_epid), 0);
			domain.instantiateEvent(null, appt.First_appt_id, apptDtDetails, session.DataCollection.get(0).Activ_id, voEpis);
		}
		catch (DomainInterfaceException e) 
		{
			engine.showMessage(e.getMessage());
		} catch (StaleObjectException e) 
		{
			engine.showMessage(e.getMessage());
		}

	}

	
	protected void onReasonTreeViewSelectionChanged(ims.framework.controls.TreeNode nodeval) throws ims.framework.exceptions.PresentationLogicException
	{
		//foreach (TreeNode root in Form.Reason.Nodes)
		for (int i = 0; i < form.Reason().getNodes().size(); i++) 
		{
			TreeNode root = form.Reason().getNodes().get(i);
			
			//foreach (TreeNode node in root.Nodes)
			for (int j = 0; j < root.getNodes().size(); j++) 
			{
				TreeNode node = root.getNodes().get(j);
				
				node.setChecked(node.getValue().equals(nodeval));
				root.setChecked(root.getValue().equals(nodeval));
			}
		}
	}
	protected void onReasonTreeViewCheck(ims.framework.controls.TreeNode nodeval) throws ims.framework.exceptions.PresentationLogicException
	{
		//foreach (TreeNode root in Form.Reason.Nodes)
		for (int i = 0; i < form.Reason().getNodes().size(); i++) 
		{
			TreeNode root = form.Reason().getNodes().get(i);
			
			//foreach (TreeNode node in root.Nodes)
			for (int j = 0; j < root.getNodes().size(); j++) 
			{
				TreeNode node = root.getNodes().get(j);
				
				if (!node.equals(nodeval))
					node.setChecked(false);
			}
			
			if (!root.equals(nodeval))
				root.setChecked(false);

			form.Reason().setValue(nodeval.getValue());
		}
	}
	
	private void DoGet()
	{
		Sd_appt appointments = (Sd_appt)domain.getDTOInstance(Sd_appt.class);
		appointments.Filter.clear();
		appointments.Filter.Appt_head_id = form.getGlobalContext().CcoSched.ClinicView.getAppointmentHeaderID();

		Result result = appointments.get();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return;
		}
		
		form.getLocalContext().setApptDtp(appointments);
	}
	
	private boolean ReasonSelected(TreeNode nodeSelected)
	{
		for (int k = 0; k < form.Reason().getNodes().size(); k++)
		{
			TreeNode root = form.Reason().getNodes().get(k);
			if(root.isChecked())
				return true;
			for (int index = 0; index < root.getNodes().size(); index++)
				if (root.getNodes().get(index).isChecked())
					return true;
		}
		return false;
	}
}
