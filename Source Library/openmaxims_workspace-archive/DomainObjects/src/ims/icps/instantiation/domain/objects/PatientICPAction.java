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
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.icps.instantiation.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientICPAction extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1100100004;
	private static final long serialVersionUID = 1100100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ICP */
	private ims.icps.instantiation.domain.objects.PatientICP iCP;
	/** Action */
	private ims.icps.configuration.domain.objects.ICPAction action;
	/** CurrentStatus */
	private ims.icps.instantiation.domain.objects.PatientICPActionStatus currentStatus;
	/** StatusHistory
	  * Collection of ims.icps.instantiation.domain.objects.PatientICPActionStatus.
	  */
	private java.util.Set statusHistory;
	/** AchievedDateTime */
	private java.util.Date completedOnDate;
	/** ParentPhase */
	private ims.icps.instantiation.domain.objects.PatientICPPhase parentPhase;
	private Boolean requiresCounterSigning;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientICPAction (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientICPAction ()
    {
    	super();
    }
    public PatientICPAction (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.icps.instantiation.domain.objects.PatientICPAction.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.icps.instantiation.domain.objects.PatientICP getICP() {
		return iCP;
	}
	public void setICP(ims.icps.instantiation.domain.objects.PatientICP iCP) {
		this.iCP = iCP;
	}

	public ims.icps.configuration.domain.objects.ICPAction getAction() {
		return action;
	}
	public void setAction(ims.icps.configuration.domain.objects.ICPAction action) {
		this.action = action;
	}

	public ims.icps.instantiation.domain.objects.PatientICPActionStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.icps.instantiation.domain.objects.PatientICPActionStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public java.util.Date getCompletedOnDate() {
		return completedOnDate;
	}
	public void setCompletedOnDate(java.util.Date completedOnDate) {
		this.completedOnDate = completedOnDate;
	}

	public ims.icps.instantiation.domain.objects.PatientICPPhase getParentPhase() {
		return parentPhase;
	}
	public void setParentPhase(ims.icps.instantiation.domain.objects.PatientICPPhase parentPhase) {
		this.parentPhase = parentPhase;
	}

	public Boolean isRequiresCounterSigning() {
		return requiresCounterSigning;
	}
	public void setRequiresCounterSigning(Boolean requiresCounterSigning) {
		this.requiresCounterSigning = requiresCounterSigning;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*iCP* :");
		if (iCP != null)
		{
			auditStr.append(toShortClassName(iCP));
				
		    auditStr.append(iCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*action* :");
		if (action != null)
		{
			auditStr.append(toShortClassName(action));
				
		    auditStr.append(action.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
			java.util.Iterator it6 = statusHistory.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.icps.instantiation.domain.objects.PatientICPActionStatus obj = (ims.icps.instantiation.domain.objects.PatientICPActionStatus)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completedOnDate* :");
		auditStr.append(completedOnDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*parentPhase* :");
		if (parentPhase != null)
		{
			auditStr.append(toShortClassName(parentPhase));
				
		    auditStr.append(parentPhase.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresCounterSigning* :");
		auditStr.append(requiresCounterSigning);
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "PatientICPAction";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getICP() != null)
		{
			sb.append("<iCP>");
			sb.append(this.getICP().toXMLString(domMap)); 	
			sb.append("</iCP>");		
		}
		if (this.getAction() != null)
		{
			sb.append("<action>");
			sb.append(this.getAction().toXMLString(domMap)); 	
			sb.append("</action>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getCompletedOnDate() != null)
		{
			sb.append("<completedOnDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedOnDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedOnDate>");		
		}
		if (this.getParentPhase() != null)
		{
			sb.append("<parentPhase>");
			sb.append(this.getParentPhase().toXMLString(domMap)); 	
			sb.append("</parentPhase>");		
		}
		if (this.isRequiresCounterSigning() != null)
		{
			sb.append("<requiresCounterSigning>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresCounterSigning().toString()));
			sb.append("</requiresCounterSigning>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			PatientICPAction domainObject = getPatientICPActionfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			PatientICPAction domainObject = getPatientICPActionfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static PatientICPAction getPatientICPActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientICPActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientICPAction getPatientICPActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientICPAction.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientICPAction.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientICPAction class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientICPAction)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientICPAction.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientICPAction ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientICPAction)factory.getImportedDomainObject(PatientICPAction.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientICPAction();
		}
		String keyClassName = "PatientICPAction";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientICPAction)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientICPAction obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("iCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setICP(ims.icps.instantiation.domain.objects.PatientICP.getPatientICPfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("action");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAction(ims.icps.configuration.domain.objects.ICPAction.getICPActionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.icps.instantiation.domain.objects.PatientICPActionStatus.getPatientICPActionStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.icps.instantiation.domain.objects.PatientICPActionStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("completedOnDate");
		if(fldEl != null)
		{	
    		obj.setCompletedOnDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("parentPhase");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setParentPhase(ims.icps.instantiation.domain.objects.PatientICPPhase.getPatientICPPhasefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requiresCounterSigning");
		if(fldEl != null)
		{	
    		obj.setRequiresCounterSigning(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public void bringStageIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String stage)
	{	
                  // Lookup ID (system negative instances)
            final int STATUS_STAGE_NOT_IN_SCOPE = -1746;
            final int STATUS_STAGE_OUTSTANDING = -1747;
            final int STATUS_PHASE_IN_PROGRESS = -1750;
            final int STATUS_ACTION_OUTSTANDING  = -1753;
            
            final int HCP_DISC_NURSING = -27;
            final int HCP_DISC_MEDICAL = -59;
            final int HCP_DISC_OTHER = -62;
            final int HCP_DISC_THERAPY = -61;

            // Get an iterator for stages
            java.util.Iterator<PatientICPStage> iteratorStages = this.getICP().getStages().iterator();

            while (iteratorStages.hasNext())
            {
                  // Get parent stage
                  PatientICPStage parentStage = iteratorStages.next();

                  // Test if parent stage is not in scope
                  if (parentStage.getStage().getId().equals(Integer.parseInt(stage)) && parentStage.getCurrentStatus().getStatus().getId() == STATUS_STAGE_NOT_IN_SCOPE)
                  {
                        // Create a new status for parent stage
                        PatientICPStageStatus status = new PatientICPStageStatus();
                        status.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
                        status.setStatus(factory.getLookupInstance(STATUS_STAGE_OUTSTANDING));
                        status.setStatusDate(new java.util.Date());

                        // Set parent stage current status
                        parentStage.setCurrentStatus(status);

                        // Add status to parent stage status history
                        parentStage.getStatusHistory().add(status);

                        java.util.Iterator<PatientICPPhase> iteratorPhase = parentStage.getStagePhases().iterator();

                        // Iterate through phase collection
                        while (iteratorPhase.hasNext())
                        {
                              PatientICPPhase phase = iteratorPhase.next();
                              
                              if (!phase.getPhase().isIsActivatedOnInitiation())
                                continue;

                              // Create a new status for phase
                              PatientICPPhaseStatus phaseStatus = new PatientICPPhaseStatus();
                              phaseStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
                              phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_IN_PROGRESS));
                              phaseStatus.setStatusDate(new java.util.Date());

                              // Set phase current status
                              phase.setCurrentStatus(phaseStatus);

                              // Add status to phase status history
                              phase.getStatusHistory().add(phaseStatus);

                              java.util.Iterator<PatientICPAction> iteratorActions = phase.getPhaseActions().iterator();

                               // Iterate through action collection
                              while (iteratorActions.hasNext())
                              {
                                    PatientICPAction action = iteratorActions.next();

                                    // Create a new status for action
                                    PatientICPActionStatus actionStatus = new PatientICPActionStatus();
                                    actionStatus.setChangedBy((ims.core.resource.people.domain.objects.MemberOfStaff) factory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, factory.getDomainSession().getUser().getMosId()));
                                    actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_OUTSTANDING));
                                    actionStatus.setStatusDate(new java.util.Date());

                                    // Set action current status
                                    action.setCurrentStatus(actionStatus);

                                    // Add status to action history
                                    action.getStatusHistory().add(actionStatus);
                                    
                                    // Update the ICP field hasOutstandingNursingActions
                                    if (factory.getLookupInstance(HCP_DISC_NURSING).equals(action.getAction().getDiscipline()))
                                    {
                                          this.getICP().setHasOutstandingNursingActions(Boolean.TRUE);
                                    }
                                    
                                    // Update the ICP field hasOutstandingMedicalActions
                                    if (factory.getLookupInstance(HCP_DISC_MEDICAL).equals(action.getAction().getDiscipline()))
                                    {
                                          this.getICP().setHasOutstandingClinicalActions(Boolean.TRUE);
                                    }
                                    
                                    // Update the ICP field hasOutstandingAdminActions
                                    if (factory.getLookupInstance(HCP_DISC_OTHER).equals(action.getAction().getDiscipline()))
                                    {
                                          this.getICP().setHasOutstandingAdminActions(Boolean.TRUE);
                                    }
                                    
                                    // Update the ICP field hasOutstandingPhysioActions
                                    if (factory.getLookupInstance(HCP_DISC_THERAPY).equals(action.getAction().getDiscipline()))
                                    {
                                          this.getICP().setHasOutstandingPhysioActions(Boolean.TRUE);
                                    }
                              }
                        }
                  }
            }

	}

	public void bringPhaseIntoScope(ims.domain.DomainFactory factory, ims.rules.engine.RulesRuntimeEngine engine, String phase)
	{	
// Lookup ID (system negative instances)
final int STATUS_PHASE_NOT_IN_SCOPE = -1749;
final int STATUS_PHASE_IN_PROGRESS = -1750;
final int STATUS_ACTION_OUTSTANDING = -1753;

final int HCP_DISC_NURSING = -27;
final int HCP_DISC_MEDICAL = -59;
final int HCP_DISC_OTHER = -62;
final int HCP_DISC_THERAPY = -61;

// Get an iterator for stages
java.util.Iterator<PatientICPStage> iteratorStages = this.getICP().getStages().iterator();

// Iterate through stage collection
while (iteratorStages.hasNext())
{
      PatientICPStage stage = iteratorStages.next();

      // Get an iterator for phases
      java.util.Iterator<PatientICPPhase> iteratorPhases = stage.getStagePhases().iterator();

      // Iterate through phase collection
      while (iteratorPhases.hasNext())
      {
            PatientICPPhase phaseIteration = iteratorPhases.next();

            if (phaseIteration.getPhase().getId().equals(Integer.parseInt(phase)) && phaseIteration.getCurrentStatus().getStatus().getId() == STATUS_PHASE_NOT_IN_SCOPE)
            {
                  // Create a new status for phase
                  PatientICPPhaseStatus phaseStatus = new PatientICPPhaseStatus();
                  phaseStatus.setChangedBy(factory.getDomainSession().getUser().getUserRealName());
                  phaseStatus.setStatus(factory.getLookupInstance(STATUS_PHASE_IN_PROGRESS));
                  phaseStatus.setStatusDate(new java.util.Date());

                  // Set current status for phase iteration
                  phaseIteration.setCurrentStatus(phaseStatus);

                  // Add status to status history
                  phaseIteration.getStatusHistory().add(phaseStatus);

                  // Bring parent stage into scope
                  this.bringStageIntoScope(factory, engine, phaseIteration.getParentStage().getStage().getId().toString());

                  // Get an iterator for phase actions
                  java.util.Iterator<PatientICPAction> iteratorActions = phaseIteration.getPhaseActions().iterator();

                  // Iterate through action collection
                  while (iteratorActions.hasNext())
                  {
                        PatientICPAction action = iteratorActions.next();

                        // Create a new status for action
                        PatientICPActionStatus actionStatus = new PatientICPActionStatus();
                        actionStatus.setChangedBy((ims.core.resource.people.domain.objects.MemberOfStaff) factory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, factory.getDomainSession().getUser().getMosId()));
                        actionStatus.setStatus(factory.getLookupInstance(STATUS_ACTION_OUTSTANDING));
                        actionStatus.setStatusDate(new java.util.Date());

                        // Set current status for action iteration
                        action.setCurrentStatus(actionStatus);

                        // Add status to action status history
                        action.getStatusHistory().add(actionStatus);

                        // Update the ICP field hasOutstandingNursingActions
                        if (factory.getLookupInstance(HCP_DISC_NURSING).equals(action.getAction().getDiscipline()))
                        {
                              this.getICP().setHasOutstandingNursingActions(Boolean.TRUE);
                        }

                        // Update the ICP field hasOutstandingMedicalActions
                        if (factory.getLookupInstance(HCP_DISC_MEDICAL).equals(action.getAction().getDiscipline()))
                        {
                              this.getICP().setHasOutstandingClinicalActions(Boolean.TRUE);
                        }

                        // Update the ICP field hasOutstandingAdminActions
                        if (factory.getLookupInstance(HCP_DISC_OTHER).equals(action.getAction().getDiscipline()))
                        {
                              this.getICP().setHasOutstandingAdminActions(Boolean.TRUE);
                        }

                        // Update the ICP field hasOutstandingPhysioActions
                        if (factory.getLookupInstance(HCP_DISC_THERAPY).equals(action.getAction().getDiscipline()))
                        {
                              this.getICP().setHasOutstandingPhysioActions(Boolean.TRUE);
                        }
                  }
            }
      }
}

	}

	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String ICP = "iCP";
		public static final String Action = "action";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String CompletedOnDate = "completedOnDate";
		public static final String ParentPhase = "parentPhase";
		public static final String RequiresCounterSigning = "requiresCounterSigning";
	}
}

