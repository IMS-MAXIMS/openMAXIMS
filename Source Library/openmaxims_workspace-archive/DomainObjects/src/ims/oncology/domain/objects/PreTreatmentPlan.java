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
package ims.oncology.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PreTreatmentPlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100043;
	private static final long serialVersionUID = 1074100043L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.patient.domain.objects.Patient patient;
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	private ims.core.admin.domain.objects.CareContext careContext;
	private Boolean active;
	/** HCP to plan - LKT 3705 not used in live */
	private Integer planHcp;
	/** computer planning to be carried out on - LKT 3706 not used in live */
	private Integer compHcp;
	/** Oveall target deadline */
	private java.util.Date targetDeadline;
	/** plan delayed */
	private Boolean planDelayed;
	/** remove from list */
	private Boolean removeFromList;
	/** action status - Hierarchical Parent LKT 3195 */
	private Integer actionStatus;
	/** action status reason - Hierarchical Child LKT 3195 */
	private Integer actionStatReas;
	/** actionConsultant */
	private Integer actionConsultant;
	/** preTreatPlanActivity
	  * Collection of ims.oncology.domain.objects.PreTreatmentPlanActivity.
	  */
	private java.util.List preTreatPlanActivity;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PreTreatmentPlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PreTreatmentPlan ()
    {
    	super();
    }
    public PreTreatmentPlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PreTreatmentPlan.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getPlanHcp() {
		return planHcp;
	}
	public void setPlanHcp(Integer planHcp) {
		this.planHcp = planHcp;
	}

	public Integer getCompHcp() {
		return compHcp;
	}
	public void setCompHcp(Integer compHcp) {
		this.compHcp = compHcp;
	}

	public java.util.Date getTargetDeadline() {
		return targetDeadline;
	}
	public void setTargetDeadline(java.util.Date targetDeadline) {
		this.targetDeadline = targetDeadline;
	}

	public Boolean isPlanDelayed() {
		return planDelayed;
	}
	public void setPlanDelayed(Boolean planDelayed) {
		this.planDelayed = planDelayed;
	}

	public Boolean isRemoveFromList() {
		return removeFromList;
	}
	public void setRemoveFromList(Boolean removeFromList) {
		this.removeFromList = removeFromList;
	}

	public Integer getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(Integer actionStatus) {
		this.actionStatus = actionStatus;
	}

	public Integer getActionStatReas() {
		return actionStatReas;
	}
	public void setActionStatReas(Integer actionStatReas) {
		this.actionStatReas = actionStatReas;
	}

	public Integer getActionConsultant() {
		return actionConsultant;
	}
	public void setActionConsultant(Integer actionConsultant) {
		this.actionConsultant = actionConsultant;
	}

	public java.util.List getPreTreatPlanActivity() {
		if ( null == preTreatPlanActivity ) {
			preTreatPlanActivity = new java.util.ArrayList();
		}
		return preTreatPlanActivity;
	}
	public void setPreTreatPlanActivity(java.util.List paramValue) {
		this.preTreatPlanActivity = paramValue;
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*planHcp* :");
		auditStr.append(planHcp);
	    auditStr.append("; ");
		auditStr.append("\r\n*compHcp* :");
		auditStr.append(compHcp);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetDeadline* :");
		auditStr.append(targetDeadline);
	    auditStr.append("; ");
		auditStr.append("\r\n*planDelayed* :");
		auditStr.append(planDelayed);
	    auditStr.append("; ");
		auditStr.append("\r\n*removeFromList* :");
		auditStr.append(removeFromList);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionStatus* :");
		auditStr.append(actionStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionStatReas* :");
		auditStr.append(actionStatReas);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionConsultant* :");
		auditStr.append(actionConsultant);
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatPlanActivity* :");
		if (preTreatPlanActivity != null)
		{
		int i13=0;
		for (i13=0; i13<preTreatPlanActivity.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.PreTreatmentPlanActivity obj = (ims.oncology.domain.objects.PreTreatmentPlanActivity)preTreatPlanActivity.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
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
		
		String keyClassName = "PreTreatmentPlan";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getPlanHcp() != null)
		{
			sb.append("<planHcp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlanHcp().toString()));
			sb.append("</planHcp>");		
		}
		if (this.getCompHcp() != null)
		{
			sb.append("<compHcp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCompHcp().toString()));
			sb.append("</compHcp>");		
		}
		if (this.getTargetDeadline() != null)
		{
			sb.append("<targetDeadline>");
			sb.append(new ims.framework.utils.DateTime(this.getTargetDeadline()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</targetDeadline>");		
		}
		if (this.isPlanDelayed() != null)
		{
			sb.append("<planDelayed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPlanDelayed().toString()));
			sb.append("</planDelayed>");		
		}
		if (this.isRemoveFromList() != null)
		{
			sb.append("<removeFromList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRemoveFromList().toString()));
			sb.append("</removeFromList>");		
		}
		if (this.getActionStatus() != null)
		{
			sb.append("<actionStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionStatus().toString()));
			sb.append("</actionStatus>");		
		}
		if (this.getActionStatReas() != null)
		{
			sb.append("<actionStatReas>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionStatReas().toString()));
			sb.append("</actionStatReas>");		
		}
		if (this.getActionConsultant() != null)
		{
			sb.append("<actionConsultant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionConsultant().toString()));
			sb.append("</actionConsultant>");		
		}
		if (this.getPreTreatPlanActivity() != null)
		{
			if (this.getPreTreatPlanActivity().size() > 0 )
			{
			sb.append("<preTreatPlanActivity>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPreTreatPlanActivity(), domMap));
			sb.append("</preTreatPlanActivity>");		
			}
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
			PreTreatmentPlan domainObject = getPreTreatmentPlanfromXML(itemEl, factory, domMap);

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
			PreTreatmentPlan domainObject = getPreTreatmentPlanfromXML(itemEl, factory, domMap);

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
		
	public static PreTreatmentPlan getPreTreatmentPlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPreTreatmentPlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PreTreatmentPlan getPreTreatmentPlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PreTreatmentPlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PreTreatmentPlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PreTreatmentPlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PreTreatmentPlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PreTreatmentPlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PreTreatmentPlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PreTreatmentPlan)factory.getImportedDomainObject(PreTreatmentPlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PreTreatmentPlan();
		}
		String keyClassName = "PreTreatmentPlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PreTreatmentPlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PreTreatmentPlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("planHcp");
		if(fldEl != null)
		{	
    		obj.setPlanHcp(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("compHcp");
		if(fldEl != null)
		{	
    		obj.setCompHcp(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("targetDeadline");
		if(fldEl != null)
		{	
    		obj.setTargetDeadline(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("planDelayed");
		if(fldEl != null)
		{	
    		obj.setPlanDelayed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removeFromList");
		if(fldEl != null)
		{	
    		obj.setRemoveFromList(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionStatus");
		if(fldEl != null)
		{	
    		obj.setActionStatus(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionStatReas");
		if(fldEl != null)
		{	
    		obj.setActionStatReas(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionConsultant");
		if(fldEl != null)
		{	
    		obj.setActionConsultant(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preTreatPlanActivity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPreTreatPlanActivity(ims.oncology.domain.objects.PreTreatmentPlanActivity.fromListXMLString(fldEl, factory, obj.getPreTreatPlanActivity(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "preTreatPlanActivity"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String CareContext = "careContext";
		public static final String Active = "active";
		public static final String PlanHcp = "planHcp";
		public static final String CompHcp = "compHcp";
		public static final String TargetDeadline = "targetDeadline";
		public static final String PlanDelayed = "planDelayed";
		public static final String RemoveFromList = "removeFromList";
		public static final String ActionStatus = "actionStatus";
		public static final String ActionStatReas = "actionStatReas";
		public static final String ActionConsultant = "actionConsultant";
		public static final String PreTreatPlanActivity = "preTreatPlanActivity";
	}
}

