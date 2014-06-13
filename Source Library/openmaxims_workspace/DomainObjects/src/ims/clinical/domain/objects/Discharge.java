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
package ims.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class Discharge extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1017100000;
	private static final long serialVersionUID = 1017100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Date Commenced */
	private java.util.Date dateCommenced;
	/** Destination */
	private ims.domain.lookups.LookupInstance destination;
	/** DateTime Discharged */
	private java.util.Date dateTimeDischarged;
	/** HCP */
	private ims.core.resource.people.domain.objects.Hcp hCP;
	/** Actions
	  * Collection of ims.clinical.domain.objects.Actions.
	  */
	private java.util.Set actions;
	/** Assessment */
	private ims.clinical.domain.objects.DischargeAssessment assessment;
	/** Notes */
	private String notes;
	/** Checklist */
	private ims.assessment.instantiation.domain.objects.PatientAssessment checklist;
    public Discharge (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Discharge ()
    {
    	super();
    }
    public Discharge (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.Discharge.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Date getDateCommenced() {
		return dateCommenced;
	}
	public void setDateCommenced(java.util.Date dateCommenced) {
		this.dateCommenced = dateCommenced;
	}

	public ims.domain.lookups.LookupInstance getDestination() {
		return destination;
	}
	public void setDestination(ims.domain.lookups.LookupInstance destination) {
		this.destination = destination;
	}

	public java.util.Date getDateTimeDischarged() {
		return dateTimeDischarged;
	}
	public void setDateTimeDischarged(java.util.Date dateTimeDischarged) {
		this.dateTimeDischarged = dateTimeDischarged;
	}

	public ims.core.resource.people.domain.objects.Hcp getHCP() {
		return hCP;
	}
	public void setHCP(ims.core.resource.people.domain.objects.Hcp hCP) {
		this.hCP = hCP;
	}

	public java.util.Set getActions() {
		if ( null == actions ) {
			actions = new java.util.HashSet();
		}
		return actions;
	}
	public void setActions(java.util.Set paramValue) {
		this.actions = paramValue;
	}

	public ims.clinical.domain.objects.DischargeAssessment getAssessment() {
		return assessment;
	}
	public void setAssessment(ims.clinical.domain.objects.DischargeAssessment assessment) {
		this.assessment = assessment;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getChecklist() {
		return checklist;
	}
	public void setChecklist(ims.assessment.instantiation.domain.objects.PatientAssessment checklist) {
		this.checklist = checklist;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateCommenced* :");
		auditStr.append(dateCommenced);
	    auditStr.append("; ");
		auditStr.append("\r\n*destination* :");
		if (destination != null)
			auditStr.append(destination.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeDischarged* :");
		auditStr.append(dateTimeDischarged);
	    auditStr.append("; ");
		auditStr.append("\r\n*hCP* :");
		if (hCP != null)
		{
			auditStr.append(toShortClassName(hCP));
				
		    auditStr.append(hCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
			java.util.Iterator it7 = actions.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.Actions obj = (ims.clinical.domain.objects.Actions)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		if (assessment != null)
		{
			auditStr.append(toShortClassName(assessment));
				
		    auditStr.append(assessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*checklist* :");
		if (checklist != null)
		{
			auditStr.append(toShortClassName(checklist));
				
		    auditStr.append(checklist.getId());
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
		
		String keyClassName = "Discharge";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getDateCommenced() != null)
		{
			sb.append("<dateCommenced>");
			sb.append(new ims.framework.utils.DateTime(this.getDateCommenced()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateCommenced>");		
		}
		if (this.getDestination() != null)
		{
			sb.append("<destination>");
			sb.append(this.getDestination().toXMLString()); 
			sb.append("</destination>");		
		}
		if (this.getDateTimeDischarged() != null)
		{
			sb.append("<dateTimeDischarged>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeDischarged()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeDischarged>");		
		}
		if (this.getHCP() != null)
		{
			sb.append("<hCP>");
			sb.append(this.getHCP().toXMLString(domMap)); 	
			sb.append("</hCP>");		
		}
		if (this.getActions() != null)
		{
			if (this.getActions().size() > 0 )
			{
			sb.append("<actions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActions(), domMap));
			sb.append("</actions>");		
			}
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(this.getAssessment().toXMLString(domMap)); 	
			sb.append("</assessment>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getChecklist() != null)
		{
			sb.append("<checklist>");
			sb.append(this.getChecklist().toXMLString(domMap)); 	
			sb.append("</checklist>");		
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
			Discharge domainObject = getDischargefromXML(itemEl, factory, domMap);

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
			Discharge domainObject = getDischargefromXML(itemEl, factory, domMap);

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
		
	public static Discharge getDischargefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Discharge getDischargefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Discharge.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Discharge.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Discharge class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Discharge)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Discharge.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Discharge ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Discharge)factory.getImportedDomainObject(Discharge.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Discharge();
		}
		String keyClassName = "Discharge";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Discharge)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Discharge obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateCommenced");
		if(fldEl != null)
		{	
    		obj.setDateCommenced(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("destination");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDestination(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateTimeDischarged");
		if(fldEl != null)
		{	
    		obj.setDateTimeDischarged(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActions(ims.clinical.domain.objects.Actions.fromSetXMLString(fldEl, factory, obj.getActions(), domMap));
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessment(ims.clinical.domain.objects.DischargeAssessment.getDischargeAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("checklist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setChecklist(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "actions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String DateCommenced = "dateCommenced";
		public static final String Destination = "destination";
		public static final String DateTimeDischarged = "dateTimeDischarged";
		public static final String HCP = "hCP";
		public static final String Actions = "actions";
		public static final String Assessment = "assessment";
		public static final String Notes = "notes";
		public static final String Checklist = "checklist";
	}
}

