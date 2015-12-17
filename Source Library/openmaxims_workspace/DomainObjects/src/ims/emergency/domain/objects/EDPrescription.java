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
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.emergency.domain.objects;

/**
 * 
 * @author George Cristian Josan
 * Generated.
 */


public class EDPrescription extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100048;
	private static final long serialVersionUID = 1086100048L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.patient.domain.objects.Patient patient;
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	private ims.core.admin.domain.objects.CareContext attendance;
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** 
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.List medications;
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInformation;
	private Boolean isCompleted;
	private Boolean isPrinted;
	/** Prescription Print History
	  * Collection of ims.emergency.domain.objects.PrescriptionPrintDetails.
	  */
	private java.util.List prescriptionPrintHistory;
	private ims.core.clinical.domain.objects.AuthoringInformation completingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EDPrescription (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EDPrescription ()
    {
    	super();
    }
    public EDPrescription (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.EDPrescription.class;
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

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.List getMedications() {
		if ( null == medications ) {
			medications = new java.util.ArrayList();
		}
		return medications;
	}
	public void setMedications(java.util.List paramValue) {
		this.medications = paramValue;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public Boolean isIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Boolean isIsPrinted() {
		return isPrinted;
	}
	public void setIsPrinted(Boolean isPrinted) {
		this.isPrinted = isPrinted;
	}

	public java.util.List getPrescriptionPrintHistory() {
		if ( null == prescriptionPrintHistory ) {
			prescriptionPrintHistory = new java.util.ArrayList();
		}
		return prescriptionPrintHistory;
	}
	public void setPrescriptionPrintHistory(java.util.List paramValue) {
		this.prescriptionPrintHistory = paramValue;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getCompletingInformation() {
		return completingInformation;
	}
	public void setCompletingInformation(ims.core.clinical.domain.objects.AuthoringInformation completingInformation) {
		this.completingInformation = completingInformation;
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*medications* :");
		if (medications != null)
		{
		int i5=0;
		for (i5=0; i5<medications.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)medications.get(i5);
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
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCompleted* :");
		auditStr.append(isCompleted);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrinted* :");
		auditStr.append(isPrinted);
	    auditStr.append("; ");
		auditStr.append("\r\n*prescriptionPrintHistory* :");
		if (prescriptionPrintHistory != null)
		{
		int i9=0;
		for (i9=0; i9<prescriptionPrintHistory.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.emergency.domain.objects.PrescriptionPrintDetails obj = (ims.emergency.domain.objects.PrescriptionPrintDetails)prescriptionPrintHistory.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completingInformation* :");
		if (completingInformation != null)
		{
			auditStr.append(toShortClassName(completingInformation));
				
		    auditStr.append(completingInformation.toString());
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
		
		String keyClassName = "EDPrescription";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getMedications() != null)
		{
			if (this.getMedications().size() > 0 )
			{
			sb.append("<medications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMedications(), domMap));
			sb.append("</medications>");		
			}
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.isIsCompleted() != null)
		{
			sb.append("<isCompleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCompleted().toString()));
			sb.append("</isCompleted>");		
		}
		if (this.isIsPrinted() != null)
		{
			sb.append("<isPrinted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrinted().toString()));
			sb.append("</isPrinted>");		
		}
		if (this.getPrescriptionPrintHistory() != null)
		{
			if (this.getPrescriptionPrintHistory().size() > 0 )
			{
			sb.append("<prescriptionPrintHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPrescriptionPrintHistory(), domMap));
			sb.append("</prescriptionPrintHistory>");		
			}
		}
		if (this.getCompletingInformation() != null)
		{
			sb.append("<completingInformation>");
			sb.append(this.getCompletingInformation().toXMLString(domMap)); 	
			sb.append("</completingInformation>");		
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
			EDPrescription domainObject = getEDPrescriptionfromXML(itemEl, factory, domMap);

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
			EDPrescription domainObject = getEDPrescriptionfromXML(itemEl, factory, domMap);

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
		
	public static EDPrescription getEDPrescriptionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEDPrescriptionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EDPrescription getEDPrescriptionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EDPrescription.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EDPrescription.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EDPrescription class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EDPrescription)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EDPrescription.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EDPrescription ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EDPrescription)factory.getImportedDomainObject(EDPrescription.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EDPrescription();
		}
		String keyClassName = "EDPrescription";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EDPrescription)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EDPrescription obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("medications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMedications(ims.core.clinical.domain.objects.PatientMedication.fromListXMLString(fldEl, factory, obj.getMedications(), domMap));
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCompleted");
		if(fldEl != null)
		{	
    		obj.setIsCompleted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPrinted");
		if(fldEl != null)
		{	
    		obj.setIsPrinted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prescriptionPrintHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPrescriptionPrintHistory(ims.emergency.domain.objects.PrescriptionPrintDetails.fromListXMLString(fldEl, factory, obj.getPrescriptionPrintHistory(), domMap));
		}
		fldEl = el.element("completingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "medications"
		, "prescriptionPrintHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Medications = "medications";
		public static final String RecordingInformation = "recordingInformation";
		public static final String IsCompleted = "isCompleted";
		public static final String IsPrinted = "isPrinted";
		public static final String PrescriptionPrintHistory = "prescriptionPrintHistory";
		public static final String CompletingInformation = "completingInformation";
	}
}

