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
package ims.emergency.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TriageProtocolAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100018;
	private static final long serialVersionUID = 1086100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Episode */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.CareContext attendance;
	/** TriagePriority */
	private ims.domain.lookups.LookupInstance triagePriority;
	/** Patient Problem */
	private ims.core.clinical.domain.objects.PatientProblem patientProblem;
	/** Is the Main Presenting Problem */
	private Boolean isMain;
	/** Triage Protocol */
	private ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration triageProtocol;
	/** Discriminator */
	private ims.emergency.configuration.domain.objects.ProtocolDiscriminator discriminator;
	/** Assessment Date Time */
	private java.util.Date assessmentDateTime;
	/** Assessment Nurse */
	private ims.core.resource.people.domain.objects.Hcp assessmentNurse;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TriageProtocolAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TriageProtocolAssessment ()
    {
    	super();
    }
    public TriageProtocolAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.TriageProtocolAssessment.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public ims.core.admin.domain.objects.CareContext getAttendance() {
		return attendance;
	}
	public void setAttendance(ims.core.admin.domain.objects.CareContext attendance) {
		this.attendance = attendance;
	}

	public ims.domain.lookups.LookupInstance getTriagePriority() {
		return triagePriority;
	}
	public void setTriagePriority(ims.domain.lookups.LookupInstance triagePriority) {
		this.triagePriority = triagePriority;
	}

	public ims.core.clinical.domain.objects.PatientProblem getPatientProblem() {
		return patientProblem;
	}
	public void setPatientProblem(ims.core.clinical.domain.objects.PatientProblem patientProblem) {
		this.patientProblem = patientProblem;
	}

	public Boolean isIsMain() {
		return isMain;
	}
	public void setIsMain(Boolean isMain) {
		this.isMain = isMain;
	}

	public ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration getTriageProtocol() {
		return triageProtocol;
	}
	public void setTriageProtocol(ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration triageProtocol) {
		this.triageProtocol = triageProtocol;
	}

	public ims.emergency.configuration.domain.objects.ProtocolDiscriminator getDiscriminator() {
		return discriminator;
	}
	public void setDiscriminator(ims.emergency.configuration.domain.objects.ProtocolDiscriminator discriminator) {
		this.discriminator = discriminator;
	}

	public java.util.Date getAssessmentDateTime() {
		return assessmentDateTime;
	}
	public void setAssessmentDateTime(java.util.Date assessmentDateTime) {
		this.assessmentDateTime = assessmentDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAssessmentNurse() {
		return assessmentNurse;
	}
	public void setAssessmentNurse(ims.core.resource.people.domain.objects.Hcp assessmentNurse) {
		this.assessmentNurse = assessmentNurse;
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
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*attendance* :");
		if (attendance != null)
		{
			auditStr.append(toShortClassName(attendance));
				
		    auditStr.append(attendance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triagePriority* :");
		if (triagePriority != null)
			auditStr.append(triagePriority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientProblem* :");
		if (patientProblem != null)
		{
			auditStr.append(toShortClassName(patientProblem));
				
		    auditStr.append(patientProblem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isMain* :");
		auditStr.append(isMain);
	    auditStr.append("; ");
		auditStr.append("\r\n*triageProtocol* :");
		if (triageProtocol != null)
		{
			auditStr.append(toShortClassName(triageProtocol));
				
		    auditStr.append(triageProtocol.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*discriminator* :");
		if (discriminator != null)
		{
			auditStr.append(toShortClassName(discriminator));
				
		    auditStr.append(discriminator.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentDateTime* :");
		auditStr.append(assessmentDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentNurse* :");
		if (assessmentNurse != null)
		{
			auditStr.append(toShortClassName(assessmentNurse));
				
		    auditStr.append(assessmentNurse.getId());
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
		
		String keyClassName = "TriageProtocolAssessment";
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
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAttendance() != null)
		{
			sb.append("<attendance>");
			sb.append(this.getAttendance().toXMLString(domMap)); 	
			sb.append("</attendance>");		
		}
		if (this.getTriagePriority() != null)
		{
			sb.append("<triagePriority>");
			sb.append(this.getTriagePriority().toXMLString()); 
			sb.append("</triagePriority>");		
		}
		if (this.getPatientProblem() != null)
		{
			sb.append("<patientProblem>");
			sb.append(this.getPatientProblem().toXMLString(domMap)); 	
			sb.append("</patientProblem>");		
		}
		if (this.isIsMain() != null)
		{
			sb.append("<isMain>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMain().toString()));
			sb.append("</isMain>");		
		}
		if (this.getTriageProtocol() != null)
		{
			sb.append("<triageProtocol>");
			sb.append(this.getTriageProtocol().toXMLString(domMap)); 	
			sb.append("</triageProtocol>");		
		}
		if (this.getDiscriminator() != null)
		{
			sb.append("<discriminator>");
			sb.append(this.getDiscriminator().toXMLString(domMap)); 	
			sb.append("</discriminator>");		
		}
		if (this.getAssessmentDateTime() != null)
		{
			sb.append("<assessmentDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAssessmentDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</assessmentDateTime>");		
		}
		if (this.getAssessmentNurse() != null)
		{
			sb.append("<assessmentNurse>");
			sb.append(this.getAssessmentNurse().toXMLString(domMap)); 	
			sb.append("</assessmentNurse>");		
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
			TriageProtocolAssessment domainObject = getTriageProtocolAssessmentfromXML(itemEl, factory, domMap);

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
			TriageProtocolAssessment domainObject = getTriageProtocolAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static TriageProtocolAssessment getTriageProtocolAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTriageProtocolAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TriageProtocolAssessment getTriageProtocolAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TriageProtocolAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TriageProtocolAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TriageProtocolAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TriageProtocolAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TriageProtocolAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TriageProtocolAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TriageProtocolAssessment)factory.getImportedDomainObject(TriageProtocolAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TriageProtocolAssessment();
		}
		String keyClassName = "TriageProtocolAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TriageProtocolAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TriageProtocolAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendance(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("triagePriority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTriagePriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientProblem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientProblem(ims.core.clinical.domain.objects.PatientProblem.getPatientProblemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isMain");
		if(fldEl != null)
		{	
    		obj.setIsMain(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("triageProtocol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTriageProtocol(ims.emergency.configuration.domain.objects.ManchesterTriageProtocolConfiguration.getManchesterTriageProtocolConfigurationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("discriminator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiscriminator(ims.emergency.configuration.domain.objects.ProtocolDiscriminator.getProtocolDiscriminatorfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessmentDateTime");
		if(fldEl != null)
		{	
    		obj.setAssessmentDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("assessmentNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessmentNurse(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String TriagePriority = "triagePriority";
		public static final String PatientProblem = "patientProblem";
		public static final String IsMain = "isMain";
		public static final String TriageProtocol = "triageProtocol";
		public static final String Discriminator = "discriminator";
		public static final String AssessmentDateTime = "assessmentDateTime";
		public static final String AssessmentNurse = "assessmentNurse";
	}
}

