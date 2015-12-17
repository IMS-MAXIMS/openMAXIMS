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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientCaseNoteComment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100133;
	private static final long serialVersionUID = 1003100133L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CaseNote */
	private ims.core.clinical.domain.objects.PatientCaseNote caseNote;
	/** Authored By */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoredBy;
	/** Authored Date */
	private java.util.Date authoredDate;
	/** Comment */
	private String comment;
	/** CaseNoteFolderLocation */
	private ims.core.resource.place.domain.objects.Location caseNoteFolderLocation;
	private ims.domain.lookups.LookupInstance noteType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCaseNoteComment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCaseNoteComment ()
    {
    	super();
    }
    public PatientCaseNoteComment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientCaseNoteComment.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.PatientCaseNote getCaseNote() {
		return caseNote;
	}
	public void setCaseNote(ims.core.clinical.domain.objects.PatientCaseNote caseNote) {
		this.caseNote = caseNote;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoredBy() {
		return authoredBy;
	}
	public void setAuthoredBy(ims.core.resource.people.domain.objects.MemberOfStaff authoredBy) {
		this.authoredBy = authoredBy;
	}

	public java.util.Date getAuthoredDate() {
		return authoredDate;
	}
	public void setAuthoredDate(java.util.Date authoredDate) {
		this.authoredDate = authoredDate;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public ims.core.resource.place.domain.objects.Location getCaseNoteFolderLocation() {
		return caseNoteFolderLocation;
	}
	public void setCaseNoteFolderLocation(ims.core.resource.place.domain.objects.Location caseNoteFolderLocation) {
		this.caseNoteFolderLocation = caseNoteFolderLocation;
	}

	public ims.domain.lookups.LookupInstance getNoteType() {
		return noteType;
	}
	public void setNoteType(ims.domain.lookups.LookupInstance noteType) {
		this.noteType = noteType;
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
		auditStr.append("\r\n*caseNote* :");
		if (caseNote != null)
		{
			auditStr.append(toShortClassName(caseNote));
				
		    auditStr.append(caseNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoredBy* :");
		if (authoredBy != null)
		{
			auditStr.append(toShortClassName(authoredBy));
				
		    auditStr.append(authoredBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoredDate* :");
		auditStr.append(authoredDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*caseNoteFolderLocation* :");
		if (caseNoteFolderLocation != null)
		{
			auditStr.append(toShortClassName(caseNoteFolderLocation));
				
		    auditStr.append(caseNoteFolderLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noteType* :");
		if (noteType != null)
			auditStr.append(noteType.getText());
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
		
		String keyClassName = "PatientCaseNoteComment";
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
		if (this.getCaseNote() != null)
		{
			sb.append("<caseNote>");
			sb.append(this.getCaseNote().toXMLString(domMap)); 	
			sb.append("</caseNote>");		
		}
		if (this.getAuthoredBy() != null)
		{
			sb.append("<authoredBy>");
			sb.append(this.getAuthoredBy().toXMLString(domMap)); 	
			sb.append("</authoredBy>");		
		}
		if (this.getAuthoredDate() != null)
		{
			sb.append("<authoredDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoredDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoredDate>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getCaseNoteFolderLocation() != null)
		{
			sb.append("<caseNoteFolderLocation>");
			sb.append(this.getCaseNoteFolderLocation().toXMLString(domMap)); 	
			sb.append("</caseNoteFolderLocation>");		
		}
		if (this.getNoteType() != null)
		{
			sb.append("<noteType>");
			sb.append(this.getNoteType().toXMLString()); 
			sb.append("</noteType>");		
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
			PatientCaseNoteComment domainObject = getPatientCaseNoteCommentfromXML(itemEl, factory, domMap);

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
			PatientCaseNoteComment domainObject = getPatientCaseNoteCommentfromXML(itemEl, factory, domMap);

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
		
	public static PatientCaseNoteComment getPatientCaseNoteCommentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCaseNoteCommentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCaseNoteComment getPatientCaseNoteCommentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCaseNoteComment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCaseNoteComment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCaseNoteComment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCaseNoteComment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCaseNoteComment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCaseNoteComment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCaseNoteComment)factory.getImportedDomainObject(PatientCaseNoteComment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCaseNoteComment();
		}
		String keyClassName = "PatientCaseNoteComment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCaseNoteComment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCaseNoteComment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCaseNote(ims.core.clinical.domain.objects.PatientCaseNote.getPatientCaseNotefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoredBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoredBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoredDate");
		if(fldEl != null)
		{	
    		obj.setAuthoredDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("caseNoteFolderLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCaseNoteFolderLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noteType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoteType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CaseNote = "caseNote";
		public static final String AuthoredBy = "authoredBy";
		public static final String AuthoredDate = "authoredDate";
		public static final String Comment = "comment";
		public static final String CaseNoteFolderLocation = "caseNoteFolderLocation";
		public static final String NoteType = "noteType";
	}
}

