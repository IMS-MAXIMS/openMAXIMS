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
/*
 * Created on Apr 23, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package ims.scheduler.TreatmentPlanTooltip;
import java.text.ParseException;
import java.util.ArrayList;

import ims.dto.client.Go_ptplact;
import ims.dto.client.Go_ptreatpl;
import ims.dto.client.Lkup;
import ims.dto.Result;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
/**
 * @author aursache
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */


public class TreatmentPlanTooltip
{
	public class TreatmentPlanGridData
	{
		private String activity;
		private String tooltip;

		public String getActivity() {return activity;}
		public String getTooltip() {return tooltip;}
		public void   setActivity(String Activity){activity = Activity;}
		public void   setTooltip(String Tooltip)  {tooltip  = Tooltip;}

		public TreatmentPlanGridData(String activity, String tooltip)
		{
			this.activity = activity;
			this.tooltip  = tooltip;
		}
	}
	
	protected ArrayList GridData = new ArrayList();
	protected ims.framework.UIEngine engine;
	protected ims.dto.DTODomain domain;
	protected Lkup Anaesthetic;
	protected Lkup Technique; 
	protected Go_ptreatpl.Go_ptreatplRecord TreatmentPlanDetails;
	protected Go_ptplact TreatmentPlanActions;
	protected Object GlobalContext;
	
	//Constructor
//	public TreatmentPlanTooltip(ims.framework.UIEngine engine, ims.dto.DTODomain domain, Lkup Anaesthetic, Lkup Technique, Go_ptreatpl.Go_ptreatplRecord TreatmentPlanDetails, Go_ptplact TreatmentPlanActions)
//	{
//		this.engine = engine; 
//		this.domain = domain;
//		this.Anaesthetic = Anaesthetic;
//		this.Technique   = Technique;
//		this.TreatmentPlanDetails = TreatmentPlanDetails;
//		this.TreatmentPlanActions = TreatmentPlanActions;
//		this.GlobalContext = null;
//		LoadLookups();
//	}
	public TreatmentPlanTooltip(ims.framework.UIEngine engine, ims.dto.DTODomain domain, Object globalContext)
	{
		this.engine = engine; 
		this.domain = domain;
		this.Anaesthetic = null;
		this.Technique   = null;
		this.TreatmentPlanDetails = null;
		this.TreatmentPlanActions = null;
		this.GlobalContext = globalContext;
		LoadLookups();
	}
	//End Constructor
	
//	Private variables
//	private readonly IMS.Domain.DTO.Domain Domain;
//	private readonly Context Context;
	private String Newline = new String("<br>");
	private String TreatmentPlanId = new String();
	private boolean contextUpdatable = true;
	private ArrayList TPTooltip = new ArrayList();
	//end Private 
	
	//PublicMethods
	public void SetTreatmentPlanId(String tpId)
	{
		TreatmentPlanId = tpId;
	}
	public void UpdateContext(boolean bUpdade)
	{
		contextUpdatable = bUpdade;
	}
	public ArrayList GetArrayListRows()
	{
		String tmpStr = new String();
		String Activity  = new String();
		String Tooltip   = new String();

		Go_ptreatpl tp = (Go_ptreatpl)domain.getDTOInstance(Go_ptreatpl.class);
		tp.Filter.clear();
		tp.Filter.Unid = TreatmentPlanId;
		Result result = tp.get();
		if (result != null)
		{
			//UIEngine.MessageBox(result.message);
			return TPTooltip;
		}

		if(contextUpdatable)
		{
			if(TreatmentPlanDetails != null)
				TreatmentPlanDetails = tp.DataCollection.get(0);
			else
				setGlobalContextValue(GlobalContext,"Scheduler.TreatmentPlan.TreatmentPlanDetails",true,tp.DataCollection.get(0));
		}

		Activity = GetDate(tp.DataCollection.get(0).Tp_des_treat) + ", " + tp.DataCollection.get(0).Chcptxt;
	
		tmpStr = GetDate(tp.DataCollection.get(0).Dt_seen);

		String treatmentSiteStr = new String("");
		for(int x=0; x<tp.DataCollection.get(0).SeqnoCollection.count(); x++)
		{
			//Check the active
			if(tp.DataCollection.get(0).SeqnoCollection.get(0).Act_stat.equals("-10100"))
				treatmentSiteStr += tp.DataCollection.get(0).SeqnoCollection.get(0).Tsitetxt;
			if(!treatmentSiteStr.equals("") && x < (tp.DataCollection.get(0).SeqnoCollection.count()-1))
				treatmentSiteStr+= ", ";
		}

		//10/01/2003 - AU - Kevin's improvements
		////row.ToolTip
		Tooltip = "<center><b>"+ "Treatment Plan" + "</b></center>"+
		"Date Seen: "	+ tmpStr + Newline+ 
		"Treatment Intent: " + tp.DataCollection.get(0).Tr_intenttxt+ Newline+
		"Treatment Site: " + treatmentSiteStr + Newline+
		"Tumour Group: "	+ tp.DataCollection.get(0).Tumgrouptxt + Newline+
		"Tumour Site: "	+ tp.DataCollection.get(0).Tumsitetxt  + Newline+
		"Histology: "	+ tp.DataCollection.get(0).Cshisttxt + Newline+
		"Comment: " + tp.DataCollection.get(0).Tp_cmnt;
		
		//TPTooltip.Add(Activity, Tooltip);
		TPTooltip.add(new TreatmentPlanGridData(Activity, Tooltip));

		Go_ptplact actions = (Go_ptplact)domain.getDTOInstance(Go_ptplact.class);
		actions.Filter.clear();
		actions.Filter.Pt_tp_id = TreatmentPlanId;
		//10/07/2003 - List only the active actions
		actions.Filter.Actdstat = "Y";
		result = actions.list();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return TPTooltip;
		}

		if(contextUpdatable)
		{
			if(TreatmentPlanActions != null)
				TreatmentPlanActions = actions;
			else
				setGlobalContextValue(GlobalContext,"Scheduler.ActionUpdate.TreatmentPlanActions",true,actions);
		}

		if (actions.DataCollection.count()== 0)
		{
			engine.showMessage("Failed to get treatment plan actions.");
			return TPTooltip;
		}

		Activity = ""; Tooltip = "";
		for (int i = 0; i < actions.DataCollection.count(); ++i)
		{
			//row = Form.TreatmentPlan.NewRow();
			//row.Activity = actions.Go_ptplactCollection[i].attActivity_idtxt + ", " + actions.Go_ptplactCollection[i].attAction_idtxt;
			Activity = actions.DataCollection.get(i).Activity_idtxt + ", " + actions.DataCollection.get(i).Action_idtxt;
			//10/01/2003 - AU - Kevin's improvements
			String	tooltip = "<center><b>"+ Activity + "</b></center>"+
			"Consultant: " + actions.DataCollection.get(i).Act_consultxt  + Newline + 
			"Priority: " + actions.DataCollection.get(i).Txtact_priorty + Newline + 
			"Attending As: " + actions.DataCollection.get(i).Attend_astxt   + Newline;
			
			if(actions.DataCollection.get(i).Attnd_as.length() > 0)
			{
				//Inpatient case
				Integer nAttndAs = null;
				try{
					nAttndAs = Integer.valueOf(actions.DataCollection.get(i).Attnd_as);
				}
				catch(NumberFormatException e)
				{
					e.printStackTrace();
				}
				if(nAttndAs != null)
				{
					if(nAttndAs.intValue() < 0)
					{
						tooltip+= " Booked Date: " + GetDate(actions.DataCollection.get(i).Act_bk_date) + Newline;
						tooltip+= " Ward: " + actions.DataCollection.get(i).Opa_rsnodesc + Newline;
					}//Outpatient case
					else
					{
						tooltip+= " Appointment Date: " + GetDate(actions.DataCollection.get(i).Appt_date) + Newline;
					}
				}
			}
			tooltip += "Transport Required: " + actions.DataCollection.get(i).Txttrans_req  + Newline + 
			"Treatment Category: " + actions.DataCollection.get(i).Txcattypetxt	  + Newline;
			
			tooltip += "Estimated Start Date: " + GetDate(actions.DataCollection.get(i).Eststartdt) + Newline; 

			tooltip += "Estimated End Date: " + GetDate(actions.DataCollection.get(i).Estenddate) + Newline; 
			
			if(actions.DataCollection.get(i).Activity_id.length() > 0)
			{
				//External Beam or Orthvoltage
				Integer nActivityId = null;
				try{
					nActivityId = Integer.valueOf(actions.DataCollection.get(i).Activity_id);
				}
				catch(NumberFormatException e){
					e.printStackTrace();}
				
				if(nActivityId != null)
				{
					if(nActivityId.intValue() == -202 || nActivityId.intValue() == -207)
					{
						tooltip +=  "  Modality: " + actions.DataCollection.get(i).Modality_idtxt + Newline + 
						"  Energy Value: " + actions.DataCollection.get(i).Modality_enrgy	  + Newline + 
						"  Units: "		  + actions.DataCollection.get(i).Modality_unit_idtxt		  + Newline + 
						"  Dose: "		  + actions.DataCollection.get(i).Tl_dose			  + " in "    + 
						actions.DataCollection.get(i).Tl_fractions		  + " Fractions over " + 
						actions.DataCollection.get(i).Tl_dur			  + " days" + Newline+
						GetActionTreatmentSite(actions.DataCollection.get(i).Pt_act_id);

					}//Chemotherapy
					else if(nActivityId.intValue() == -201)
					{
						tooltip +=  " Start Date: " + GetDate(actions.DataCollection.get(i).Ch_pl_st_dt)+
						" Planned Regime: " + actions.DataCollection.get(i).Txtch_pl_reg  + Newline;
					}//Brachytherapy
					else if(nActivityId.intValue()== -204 || nActivityId.intValue() == -200)
					{
						if(nActivityId.intValue() == -204)
						{
							tooltip +=  " Date: " + GetDate(actions.DataCollection.get(i).Imag_dt) + Newline;
							tooltip +=  " Modality: " + actions.DataCollection.get(i).Modality_idtxt + Newline;
							tooltip +=  " Anaesthetic Needed: " + GetAnaestheticText(actions.DataCollection.get(i).Anaesthetic);
						}
					}
				}
			}
			
			Tooltip = tooltip;
			TPTooltip.add(new TreatmentPlanGridData(Activity, Tooltip));
		}
		return TPTooltip;
	}

	private void LoadLookups()
	{
		//Anaesthetic
		Anaesthetic = (Lkup)getGlobalContextValue(GlobalContext, "Scheduler.TreatmentPlan.Anaesthetic",true);
		if (Anaesthetic == null)
		{
			Anaesthetic = (Lkup)domain.getDTOInstance(Lkup.class);
			Anaesthetic.Filter.clear();
			Anaesthetic.Filter.Lkup_typ = new String("3541");
			Result result = Anaesthetic.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return;
			}
			
			setGlobalContextValue(GlobalContext, "Scheduler.TreatmentPlan.Anaesthetic", true, Anaesthetic);
		}

		//Technique
		Technique = (Lkup)getGlobalContextValue(GlobalContext, "Scheduler.TreatmentPlan.Technique",true);
		if (Technique == null)
		{
			Technique = (Lkup)domain.getDTOInstance(Lkup.class);
			Technique.Filter.clear();
			Technique.Filter.Lkup_typ = new String("3415");
			Result result = Technique.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return;
			}
			
			setGlobalContextValue(GlobalContext, "Scheduler.TreatmentPlan.Technique", true, Technique);
		}
	}

	private String GetAnaestheticText(String lkup_id)
	{
		//Anaesthetic
		if(Anaesthetic != null)
		{
			for(int i=0; i<Anaesthetic.DataCollection.count(); i++)
			{
				if(Anaesthetic.DataCollection.get(i).Lkup_id.equals(lkup_id))
				{
					return Anaesthetic.DataCollection.get(i).Lkup_nm;
				}
			}
		}
		
		return "";
	}

	private String GetActionTreatmentSite(String actionId)
	{
		String trSite = new String();
		Go_ptplact actions = (Go_ptplact)domain.getDTOInstance(Go_ptplact.class);
		actions.Filter.clear();
		actions.Filter.Pt_act_id = actionId;
		Result result = actions.get();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return trSite;
		}
		
		if(actions.DataCollection.count()> 0)
		{
			int nCount = actions.DataCollection.get(0).SeqnoCollection.count();
			for(int x=0; x<nCount;x++)
			{
				//Active ones
				if(actions.DataCollection.get(0).SeqnoCollection.get(x).Sntact_stat.equals("-10100"))
				{
					trSite += "Treatment Site: "+actions.DataCollection.get(0).SeqnoCollection.get(x).Txsitetxt+" "+ Newline + 
					"Technique: "+GetTechniqueText(actions.DataCollection.get(0).SeqnoCollection.get(x).Techniq) + Newline;
				}
			}
		}
		
		return trSite;
	}

	//Technique
	private String GetTechniqueText(String lkup_id)
	{
		if(Technique != null)
			for(int i=0; i<Technique.DataCollection.count(); i++)
				if(Technique.DataCollection.get(i).Lkup_id.equals(lkup_id))
					return Technique.DataCollection.get(i).Lkup_nm;

		return "";
	}
	
	private String GetDate(String dtoDate)
	{	
		Date date = null;
		try{
			date = new Date(dtoDate, DateFormat.ISO);
		}
		catch(ParseException e)
		{
			/*e.printStackTrace();*/
		}
					
		return (date == null?"":date.toString(DateFormat.STANDARD));
	}
	
	private void setGlobalContextValue(Object globalContextObject, String contextName, boolean bPersistent, Object value)
	{
		Method method_setContextValue = null;
		try
		{
			method_setContextValue = globalContextObject.getClass().getDeclaredMethod("setContextValue",new Class[] {String.class, boolean.class, Object.class});
		} 
		catch (SecurityException e)
		{
			e.printStackTrace();
		} 
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		
		if(method_setContextValue == null)
		{
			throw new RuntimeException("The private method 'setContextValue' is not declared in GlobalContext !");
		}
		
        //now we invoke form.getGlobalContext().Scheduler.TreatmentPlan.setTreatmentPlanDetails()
		try
        {
			method_setContextValue.setAccessible(true);
			method_setContextValue.invoke(globalContextObject, new Object[] {contextName, bPersistent == true ? Boolean.TRUE : Boolean.FALSE, value});
        }
        catch (IllegalAccessException e)
        {
          throw new RuntimeException(e);
        }
        catch (InvocationTargetException e)
        {
        	throw new RuntimeException(e);
        }
	}
	
	private Object getGlobalContextValue(Object globalContextObject, String contextName, boolean bPersistent)
	{
		Method method_getContextValue = null;
		try
		{
			method_getContextValue = globalContextObject.getClass().getDeclaredMethod("getContextValue",new Class[] {String.class, boolean.class});
		} 
		catch (SecurityException e)
		{
			e.printStackTrace();
		} 
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		
		if(method_getContextValue == null)
		{
			throw new RuntimeException("The private method 'setContextValue' is not declared in GlobalContext !");
		}
		
        //now we invoke form.getGlobalContext().Scheduler.TreatmentPlan.setTreatmentPlanDetails()
		try
        {
			method_getContextValue.setAccessible(true);
			Object obj = method_getContextValue.invoke(globalContextObject, new Object[] {contextName, bPersistent == true ? Boolean.TRUE : Boolean.FALSE});
			return obj;
        }
        catch (IllegalAccessException e)
        {
          throw new RuntimeException(e);
        }
        catch (InvocationTargetException e)
        {
        	throw new RuntimeException(e);
        }
	}
	
}
