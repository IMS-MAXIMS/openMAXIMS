/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class AppointmentClinicalNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100059;
	private static final long serialVersionUID = 1096100059L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Clinical Note */
	private String clinicalNote;
	/** Clinical Note Type */
	private ims.domain.lookups.LookupInstance clinicalNoteType;
	/** Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	/** AuthoringUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringUser;
	private ims.domain.lookups.LookupInstance noteType;
	/** Note Status */
	private ims.domain.lookups.LookupInstance noteStatus;
	/** Copy To GP */
	private Boolean copyToGP;
	/** Copy To Patient */
	private Boolean copyToPatient;
	/** Copy To Secondary Care */
	private Boolean copyToSecondaryCare;
	private java.util.Date correspondenceMadeActiveDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppointmentClinicalNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppointmentClinicalNotes ()
    {
    	super();
    }
    public AppointmentClinicalNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.AppointmentClinicalNotes.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public String getClinicalNote() {
		return clinicalNote;
	}
	public void setClinicalNote(String clinicalNote) {
		this.clinicalNote = clinicalNote;
	}

	public ims.domain.lookups.LookupInstance getClinicalNoteType() {
		return clinicalNoteType;
	}
	public void setClinicalNoteType(ims.domain.lookups.LookupInstance clinicalNoteType) {
		this.clinicalNoteType = clinicalNoteType;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringUser() {
		return authoringUser;
	}
	public void setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff authoringUser) {
		this.authoringUser = authoringUser;
	}

	public ims.domain.lookups.LookupInstance getNoteType() {
		return noteType;
	}
	public void setNoteType(ims.domain.lookups.LookupInstance noteType) {
		this.noteType = noteType;
	}

	public ims.domain.lookups.LookupInstance getNoteStatus() {
		return noteStatus;
	}
	public void setNoteStatus(ims.domain.lookups.LookupInstance noteStatus) {
		this.noteStatus = noteStatus;
	}

	public Boolean isCopyToGP() {
		return copyToGP;
	}
	public void setCopyToGP(Boolean copyToGP) {
		this.copyToGP = copyToGP;
	}

	public Boolean isCopyToPatient() {
		return copyToPatient;
	}
	public void setCopyToPatient(Boolean copyToPatient) {
		this.copyToPatient = copyToPatient;
	}

	public Boolean isCopyToSecondaryCare() {
		return copyToSecondaryCare;
	}
	public void setCopyToSecondaryCare(Boolean copyToSecondaryCare) {
		this.copyToSecondaryCare = copyToSecondaryCare;
	}

	public java.util.Date getCorrespondenceMadeActiveDateTime() {
		return correspondenceMadeActiveDateTime;
	}
	public void setCorrespondenceMadeActiveDateTime(java.util.Date correspondenceMadeActiveDateTime) {
		this.correspondenceMadeActiveDateTime = correspondenceMadeActiveDateTime;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalNote* :");
		auditStr.append(clinicalNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalNoteType* :");
		if (clinicalNoteType != null)
			auditStr.append(clinicalNoteType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringUser* :");
		if (authoringUser != null)
		{
			auditStr.append(toShortClassName(authoringUser));
				
		    auditStr.append(authoringUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noteType* :");
		if (noteType != null)
			auditStr.append(noteType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*noteStatus* :");
		if (noteStatus != null)
			auditStr.append(noteStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*copyToGP* :");
		auditStr.append(copyToGP);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyToPatient* :");
		auditStr.append(copyToPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyToSecondaryCare* :");
		auditStr.append(copyToSecondaryCare);
	    auditStr.append("; ");
		auditStr.append("\r\n*correspondenceMadeActiveDateTime* :");
		auditStr.append(correspondenceMadeActiveDateTime);
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
		
		String keyClassName = "AppointmentClinicalNotes";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getClinicalNote() != null)
		{
			sb.append("<clinicalNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalNote().toString()));
			sb.append("</clinicalNote>");		
		}
		if (this.getClinicalNoteType() != null)
		{
			sb.append("<clinicalNoteType>");
			sb.append(this.getClinicalNoteType().toXMLString()); 
			sb.append("</clinicalNoteType>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.getAuthoringUser() != null)
		{
			sb.append("<authoringUser>");
			sb.append(this.getAuthoringUser().toXMLString(domMap)); 	
			sb.append("</authoringUser>");		
		}
		if (this.getNoteType() != null)
		{
			sb.append("<noteType>");
			sb.append(this.getNoteType().toXMLString()); 
			sb.append("</noteType>");		
		}
		if (this.getNoteStatus() != null)
		{
			sb.append("<noteStatus>");
			sb.append(this.getNoteStatus().toXMLString()); 
			sb.append("</noteStatus>");		
		}
		if (this.isCopyToGP() != null)
		{
			sb.append("<copyToGP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyToGP().toString()));
			sb.append("</copyToGP>");		
		}
		if (this.isCopyToPatient() != null)
		{
			sb.append("<copyToPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyToPatient().toString()));
			sb.append("</copyToPatient>");		
		}
		if (this.isCopyToSecondaryCare() != null)
		{
			sb.append("<copyToSecondaryCare>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyToSecondaryCare().toString()));
			sb.append("</copyToSecondaryCare>");		
		}
		if (this.getCorrespondenceMadeActiveDateTime() != null)
		{
			sb.append("<correspondenceMadeActiveDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCorrespondenceMadeActiveDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</correspondenceMadeActiveDateTime>");		
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
			AppointmentClinicalNotes domainObject = getAppointmentClinicalNotesfromXML(itemEl, factory, domMap);

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
			AppointmentClinicalNotes domainObject = getAppointmentClinicalNotesfromXML(itemEl, factory, domMap);

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
		
	public static AppointmentClinicalNotes getAppointmentClinicalNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentClinicalNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppointmentClinicalNotes getAppointmentClinicalNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppointmentClinicalNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppointmentClinicalNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppointmentClinicalNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppointmentClinicalNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppointmentClinicalNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppointmentClinicalNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppointmentClinicalNotes)factory.getImportedDomainObject(AppointmentClinicalNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppointmentClinicalNotes();
		}
		String keyClassName = "AppointmentClinicalNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppointmentClinicalNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppointmentClinicalNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalNote");
		if(fldEl != null)
		{	
    		obj.setClinicalNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalNoteType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalNoteType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noteType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoteType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("noteStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoteStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("copyToGP");
		if(fldEl != null)
		{	
    		obj.setCopyToGP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyToPatient");
		if(fldEl != null)
		{	
    		obj.setCopyToPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyToSecondaryCare");
		if(fldEl != null)
		{	
    		obj.setCopyToSecondaryCare(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correspondenceMadeActiveDateTime");
		if(fldEl != null)
		{	
    		obj.setCorrespondenceMadeActiveDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String CatsReferral = "catsReferral";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ClinicalNote = "clinicalNote";
		public static final String ClinicalNoteType = "clinicalNoteType";
		public static final String Appointment = "appointment";
		public static final String AuthoringUser = "authoringUser";
		public static final String NoteType = "noteType";
		public static final String NoteStatus = "noteStatus";
		public static final String CopyToGP = "copyToGP";
		public static final String CopyToPatient = "copyToPatient";
		public static final String CopyToSecondaryCare = "copyToSecondaryCare";
		public static final String CorrespondenceMadeActiveDateTime = "correspondenceMadeActiveDateTime";
	}
}

