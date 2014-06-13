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
 * @author Neil McAnaspie
 * Generated.
 */


public class SurgicalAuditActualProcedure extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100104;
	private static final long serialVersionUID = 1072100104L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Planned and Actual Procedures
	  * Collection of ims.core.clinical.domain.objects.PatientProcedure.
	  */
	private java.util.List plannedActualProcedures;
	/** SurgicalPacks
	  * Collection of ims.clinical.domain.objects.SurgicalAuditSurgicalPack.
	  */
	private java.util.List surgicalPacks;
	/** Anaesthetists Start Time */
	private java.util.Date anaesthetistsStartTime;
	/** Surgery Start Time */
	private java.util.Date surgeryStartTime;
	/** Surgery Finish Time */
	private java.util.Date surgeryFinishTime;
	/** Anaesthetists Finish Time */
	private java.util.Date anaesthetistsFinishTime;
	/** Patient Sent To */
	private ims.core.resource.place.domain.objects.Location sent;
	/** Time patient leaves operating Theatre. */
	private java.util.Date timeLeftTheatre;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalAuditActualProcedure (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalAuditActualProcedure ()
    {
    	super();
    }
    public SurgicalAuditActualProcedure (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalAuditActualProcedure.class;
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

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.List getPlannedActualProcedures() {
		if ( null == plannedActualProcedures ) {
			plannedActualProcedures = new java.util.ArrayList();
		}
		return plannedActualProcedures;
	}
	public void setPlannedActualProcedures(java.util.List paramValue) {
		this.plannedActualProcedures = paramValue;
	}

	public java.util.List getSurgicalPacks() {
		if ( null == surgicalPacks ) {
			surgicalPacks = new java.util.ArrayList();
		}
		return surgicalPacks;
	}
	public void setSurgicalPacks(java.util.List paramValue) {
		this.surgicalPacks = paramValue;
	}

	public java.util.Date getAnaesthetistsStartTime() {
		return anaesthetistsStartTime;
	}
	public void setAnaesthetistsStartTime(java.util.Date anaesthetistsStartTime) {
		this.anaesthetistsStartTime = anaesthetistsStartTime;
	}

	public java.util.Date getSurgeryStartTime() {
		return surgeryStartTime;
	}
	public void setSurgeryStartTime(java.util.Date surgeryStartTime) {
		this.surgeryStartTime = surgeryStartTime;
	}

	public java.util.Date getSurgeryFinishTime() {
		return surgeryFinishTime;
	}
	public void setSurgeryFinishTime(java.util.Date surgeryFinishTime) {
		this.surgeryFinishTime = surgeryFinishTime;
	}

	public java.util.Date getAnaesthetistsFinishTime() {
		return anaesthetistsFinishTime;
	}
	public void setAnaesthetistsFinishTime(java.util.Date anaesthetistsFinishTime) {
		this.anaesthetistsFinishTime = anaesthetistsFinishTime;
	}

	public ims.core.resource.place.domain.objects.Location getSent() {
		return sent;
	}
	public void setSent(ims.core.resource.place.domain.objects.Location sent) {
		this.sent = sent;
	}

	public java.util.Date getTimeLeftTheatre() {
		return timeLeftTheatre;
	}
	public void setTimeLeftTheatre(java.util.Date timeLeftTheatre) {
		this.timeLeftTheatre = timeLeftTheatre;
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedActualProcedures* :");
		if (plannedActualProcedures != null)
		{
		int i4=0;
		for (i4=0; i4<plannedActualProcedures.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientProcedure obj = (ims.core.clinical.domain.objects.PatientProcedure)plannedActualProcedures.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*surgicalPacks* :");
		if (surgicalPacks != null)
		{
		int i5=0;
		for (i5=0; i5<surgicalPacks.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.SurgicalAuditSurgicalPack obj = (ims.clinical.domain.objects.SurgicalAuditSurgicalPack)surgicalPacks.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistsStartTime* :");
		auditStr.append(anaesthetistsStartTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryStartTime* :");
		auditStr.append(surgeryStartTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryFinishTime* :");
		auditStr.append(surgeryFinishTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistsFinishTime* :");
		auditStr.append(anaesthetistsFinishTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*sent* :");
		if (sent != null)
		{
			auditStr.append(toShortClassName(sent));
				
		    auditStr.append(sent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*timeLeftTheatre* :");
		auditStr.append(timeLeftTheatre);
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
		
		String keyClassName = "SurgicalAuditActualProcedure";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getPlannedActualProcedures() != null)
		{
			if (this.getPlannedActualProcedures().size() > 0 )
			{
			sb.append("<plannedActualProcedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPlannedActualProcedures(), domMap));
			sb.append("</plannedActualProcedures>");		
			}
		}
		if (this.getSurgicalPacks() != null)
		{
			if (this.getSurgicalPacks().size() > 0 )
			{
			sb.append("<surgicalPacks>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSurgicalPacks(), domMap));
			sb.append("</surgicalPacks>");		
			}
		}
		if (this.getAnaesthetistsStartTime() != null)
		{
			sb.append("<anaesthetistsStartTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAnaesthetistsStartTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</anaesthetistsStartTime>");		
		}
		if (this.getSurgeryStartTime() != null)
		{
			sb.append("<surgeryStartTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSurgeryStartTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</surgeryStartTime>");		
		}
		if (this.getSurgeryFinishTime() != null)
		{
			sb.append("<surgeryFinishTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSurgeryFinishTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</surgeryFinishTime>");		
		}
		if (this.getAnaesthetistsFinishTime() != null)
		{
			sb.append("<anaesthetistsFinishTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAnaesthetistsFinishTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</anaesthetistsFinishTime>");		
		}
		if (this.getSent() != null)
		{
			sb.append("<sent>");
			sb.append(this.getSent().toXMLString(domMap)); 	
			sb.append("</sent>");		
		}
		if (this.getTimeLeftTheatre() != null)
		{
			sb.append("<timeLeftTheatre>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeLeftTheatre()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeLeftTheatre>");		
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
			SurgicalAuditActualProcedure domainObject = getSurgicalAuditActualProcedurefromXML(itemEl, factory, domMap);

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
			SurgicalAuditActualProcedure domainObject = getSurgicalAuditActualProcedurefromXML(itemEl, factory, domMap);

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
		
	public static SurgicalAuditActualProcedure getSurgicalAuditActualProcedurefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalAuditActualProcedurefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalAuditActualProcedure getSurgicalAuditActualProcedurefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalAuditActualProcedure.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalAuditActualProcedure.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalAuditActualProcedure class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalAuditActualProcedure)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalAuditActualProcedure.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalAuditActualProcedure ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalAuditActualProcedure)factory.getImportedDomainObject(SurgicalAuditActualProcedure.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalAuditActualProcedure();
		}
		String keyClassName = "SurgicalAuditActualProcedure";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalAuditActualProcedure)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalAuditActualProcedure obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("plannedActualProcedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPlannedActualProcedures(ims.core.clinical.domain.objects.PatientProcedure.fromListXMLString(fldEl, factory, obj.getPlannedActualProcedures(), domMap));
		}
		fldEl = el.element("surgicalPacks");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSurgicalPacks(ims.clinical.domain.objects.SurgicalAuditSurgicalPack.fromListXMLString(fldEl, factory, obj.getSurgicalPacks(), domMap));
		}
		fldEl = el.element("anaesthetistsStartTime");
		if(fldEl != null)
		{	
    		obj.setAnaesthetistsStartTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("surgeryStartTime");
		if(fldEl != null)
		{	
    		obj.setSurgeryStartTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("surgeryFinishTime");
		if(fldEl != null)
		{	
    		obj.setSurgeryFinishTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("anaesthetistsFinishTime");
		if(fldEl != null)
		{	
    		obj.setAnaesthetistsFinishTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSent(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("timeLeftTheatre");
		if(fldEl != null)
		{	
    		obj.setTimeLeftTheatre(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "plannedActualProcedures"
		, "surgicalPacks"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String PlannedActualProcedures = "plannedActualProcedures";
		public static final String SurgicalPacks = "surgicalPacks";
		public static final String AnaesthetistsStartTime = "anaesthetistsStartTime";
		public static final String SurgeryStartTime = "surgeryStartTime";
		public static final String SurgeryFinishTime = "surgeryFinishTime";
		public static final String AnaesthetistsFinishTime = "anaesthetistsFinishTime";
		public static final String Sent = "sent";
		public static final String TimeLeftTheatre = "timeLeftTheatre";
	}
}

