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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class ClinicalNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1011100000;
	private static final long serialVersionUID = 1011100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Note */
	private String clinicalNote;
	/** NoteType */
	private ims.domain.lookups.LookupInstance noteType;
	/** True = Flagged for hospital report, False = Not flagged for hospital report */
	private Boolean inHospitalReport;
	/** Used for contact note Discipline e.g Nursing / Medical */
	private ims.domain.lookups.LookupInstance discipline;
	/** Stores the remote identifier of the ward the patient is currently in */
	private ims.core.resource.place.domain.objects.Location ward;
	/** clinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring Care Professional */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** isDerivedNote */
	private Boolean isDerivedNote;
	/** Marked as needing review */
	private Boolean forReview;
	/** Reviewing Discipline */
	private ims.domain.lookups.LookupInstance forReviewDiscipline;
	/** Reviewing HCP */
	private ims.core.resource.people.domain.objects.Hcp reviewingHCP;
	/** Reviewing DateTime */
	private java.util.Date reviewingDateTime;
	/** NotingDetail */
	private ims.core.clinical.domain.objects.NotingDetails notingDetail;
	/** CurrentStatus */
	private ims.core.clinical.domain.objects.ClinicalNoteNoteStatus currentStatus;
	/** StatusHistory
	  * Collection of ims.core.clinical.domain.objects.ClinicalNoteNoteStatus.
	  */
	private java.util.List statusHistory;
	/** isCorrected */
	private Boolean isCorrected;
	/** isTranscribed */
	private Boolean isTranscribed;
	/** Source Of Note */
	private ims.domain.lookups.LookupInstance sourceOfNote;
	/** RecordingUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingUser;
	/** RecordingDateTime */
	private java.util.Date recordingDateTime;
	/** User Defineable Clinical Note Classification */
	private ims.domain.lookups.LookupInstance noteClassification;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalNotes ()
    {
    	super();
    }
    public ClinicalNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ClinicalNotes.class;
	}


	public String getClinicalNote() {
		return clinicalNote;
	}
	public void setClinicalNote(String clinicalNote) {
		this.clinicalNote = clinicalNote;
	}

	public ims.domain.lookups.LookupInstance getNoteType() {
		return noteType;
	}
	public void setNoteType(ims.domain.lookups.LookupInstance noteType) {
		this.noteType = noteType;
	}

	public Boolean isInHospitalReport() {
		return inHospitalReport;
	}
	public void setInHospitalReport(Boolean inHospitalReport) {
		this.inHospitalReport = inHospitalReport;
	}

	public ims.domain.lookups.LookupInstance getDiscipline() {
		return discipline;
	}
	public void setDiscipline(ims.domain.lookups.LookupInstance discipline) {
		this.discipline = discipline;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
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

	public Boolean isIsDerivedNote() {
		return isDerivedNote;
	}
	public void setIsDerivedNote(Boolean isDerivedNote) {
		this.isDerivedNote = isDerivedNote;
	}

	public Boolean isForReview() {
		return forReview;
	}
	public void setForReview(Boolean forReview) {
		this.forReview = forReview;
	}

	public ims.domain.lookups.LookupInstance getForReviewDiscipline() {
		return forReviewDiscipline;
	}
	public void setForReviewDiscipline(ims.domain.lookups.LookupInstance forReviewDiscipline) {
		this.forReviewDiscipline = forReviewDiscipline;
	}

	public ims.core.resource.people.domain.objects.Hcp getReviewingHCP() {
		return reviewingHCP;
	}
	public void setReviewingHCP(ims.core.resource.people.domain.objects.Hcp reviewingHCP) {
		this.reviewingHCP = reviewingHCP;
	}

	public java.util.Date getReviewingDateTime() {
		return reviewingDateTime;
	}
	public void setReviewingDateTime(java.util.Date reviewingDateTime) {
		this.reviewingDateTime = reviewingDateTime;
	}

	public ims.core.clinical.domain.objects.NotingDetails getNotingDetail() {
		return notingDetail;
	}
	public void setNotingDetail(ims.core.clinical.domain.objects.NotingDetails notingDetail) {
		this.notingDetail = notingDetail;
	}

	public ims.core.clinical.domain.objects.ClinicalNoteNoteStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.clinical.domain.objects.ClinicalNoteNoteStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
	}

	public Boolean isIsCorrected() {
		return isCorrected;
	}
	public void setIsCorrected(Boolean isCorrected) {
		this.isCorrected = isCorrected;
	}

	public Boolean isIsTranscribed() {
		return isTranscribed;
	}
	public void setIsTranscribed(Boolean isTranscribed) {
		this.isTranscribed = isTranscribed;
	}

	public ims.domain.lookups.LookupInstance getSourceOfNote() {
		return sourceOfNote;
	}
	public void setSourceOfNote(ims.domain.lookups.LookupInstance sourceOfNote) {
		this.sourceOfNote = sourceOfNote;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingUser() {
		return recordingUser;
	}
	public void setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff recordingUser) {
		this.recordingUser = recordingUser;
	}

	public java.util.Date getRecordingDateTime() {
		return recordingDateTime;
	}
	public void setRecordingDateTime(java.util.Date recordingDateTime) {
		this.recordingDateTime = recordingDateTime;
	}

	public ims.domain.lookups.LookupInstance getNoteClassification() {
		return noteClassification;
	}
	public void setNoteClassification(ims.domain.lookups.LookupInstance noteClassification) {
		this.noteClassification = noteClassification;
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
		
		auditStr.append("\r\n*clinicalNote* :");
		auditStr.append(clinicalNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*noteType* :");
		if (noteType != null)
			auditStr.append(noteType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*inHospitalReport* :");
		auditStr.append(inHospitalReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*discipline* :");
		if (discipline != null)
			auditStr.append(discipline.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
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
		auditStr.append("\r\n*isDerivedNote* :");
		auditStr.append(isDerivedNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*forReview* :");
		auditStr.append(forReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*forReviewDiscipline* :");
		if (forReviewDiscipline != null)
			auditStr.append(forReviewDiscipline.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewingHCP* :");
		if (reviewingHCP != null)
		{
			auditStr.append(toShortClassName(reviewingHCP));
				
		    auditStr.append(reviewingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewingDateTime* :");
		auditStr.append(reviewingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*notingDetail* :");
		if (notingDetail != null)
		{
			auditStr.append(toShortClassName(notingDetail));
				
		    auditStr.append(notingDetail.getId());
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
		int i16=0;
		for (i16=0; i16<statusHistory.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.ClinicalNoteNoteStatus obj = (ims.core.clinical.domain.objects.ClinicalNoteNoteStatus)statusHistory.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCorrected* :");
		auditStr.append(isCorrected);
	    auditStr.append("; ");
		auditStr.append("\r\n*isTranscribed* :");
		auditStr.append(isTranscribed);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfNote* :");
		if (sourceOfNote != null)
			auditStr.append(sourceOfNote.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingUser* :");
		if (recordingUser != null)
		{
			auditStr.append(toShortClassName(recordingUser));
				
		    auditStr.append(recordingUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDateTime* :");
		auditStr.append(recordingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*noteClassification* :");
		if (noteClassification != null)
			auditStr.append(noteClassification.getText());
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
		
		String keyClassName = "ClinicalNotes";
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
		if (this.getClinicalNote() != null)
		{
			sb.append("<clinicalNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalNote().toString()));
			sb.append("</clinicalNote>");		
		}
		if (this.getNoteType() != null)
		{
			sb.append("<noteType>");
			sb.append(this.getNoteType().toXMLString()); 
			sb.append("</noteType>");		
		}
		if (this.isInHospitalReport() != null)
		{
			sb.append("<inHospitalReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInHospitalReport().toString()));
			sb.append("</inHospitalReport>");		
		}
		if (this.getDiscipline() != null)
		{
			sb.append("<discipline>");
			sb.append(this.getDiscipline().toXMLString()); 
			sb.append("</discipline>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
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
		if (this.isIsDerivedNote() != null)
		{
			sb.append("<isDerivedNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDerivedNote().toString()));
			sb.append("</isDerivedNote>");		
		}
		if (this.isForReview() != null)
		{
			sb.append("<forReview>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isForReview().toString()));
			sb.append("</forReview>");		
		}
		if (this.getForReviewDiscipline() != null)
		{
			sb.append("<forReviewDiscipline>");
			sb.append(this.getForReviewDiscipline().toXMLString()); 
			sb.append("</forReviewDiscipline>");		
		}
		if (this.getReviewingHCP() != null)
		{
			sb.append("<reviewingHCP>");
			sb.append(this.getReviewingHCP().toXMLString(domMap)); 	
			sb.append("</reviewingHCP>");		
		}
		if (this.getReviewingDateTime() != null)
		{
			sb.append("<reviewingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getReviewingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</reviewingDateTime>");		
		}
		if (this.getNotingDetail() != null)
		{
			sb.append("<notingDetail>");
			sb.append(this.getNotingDetail().toXMLString(domMap)); 	
			sb.append("</notingDetail>");		
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
		if (this.isIsCorrected() != null)
		{
			sb.append("<isCorrected>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCorrected().toString()));
			sb.append("</isCorrected>");		
		}
		if (this.isIsTranscribed() != null)
		{
			sb.append("<isTranscribed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTranscribed().toString()));
			sb.append("</isTranscribed>");		
		}
		if (this.getSourceOfNote() != null)
		{
			sb.append("<sourceOfNote>");
			sb.append(this.getSourceOfNote().toXMLString()); 
			sb.append("</sourceOfNote>");		
		}
		if (this.getRecordingUser() != null)
		{
			sb.append("<recordingUser>");
			sb.append(this.getRecordingUser().toXMLString(domMap)); 	
			sb.append("</recordingUser>");		
		}
		if (this.getRecordingDateTime() != null)
		{
			sb.append("<recordingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDateTime>");		
		}
		if (this.getNoteClassification() != null)
		{
			sb.append("<noteClassification>");
			sb.append(this.getNoteClassification().toXMLString()); 
			sb.append("</noteClassification>");		
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
			ClinicalNotes domainObject = getClinicalNotesfromXML(itemEl, factory, domMap);

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
			ClinicalNotes domainObject = getClinicalNotesfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalNotes getClinicalNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalNotes getClinicalNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalNotes)factory.getImportedDomainObject(ClinicalNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalNotes();
		}
		String keyClassName = "ClinicalNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalNote");
		if(fldEl != null)
		{	
    		obj.setClinicalNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noteType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoteType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("inHospitalReport");
		if(fldEl != null)
		{	
    		obj.setInHospitalReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("discipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiscipline(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("isDerivedNote");
		if(fldEl != null)
		{	
    		obj.setIsDerivedNote(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forReview");
		if(fldEl != null)
		{	
    		obj.setForReview(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forReviewDiscipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setForReviewDiscipline(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reviewingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReviewingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reviewingDateTime");
		if(fldEl != null)
		{	
    		obj.setReviewingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("notingDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNotingDetail(ims.core.clinical.domain.objects.NotingDetails.getNotingDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.clinical.domain.objects.ClinicalNoteNoteStatus.getClinicalNoteNoteStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.core.clinical.domain.objects.ClinicalNoteNoteStatus.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("isCorrected");
		if(fldEl != null)
		{	
    		obj.setIsCorrected(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isTranscribed");
		if(fldEl != null)
		{	
    		obj.setIsTranscribed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sourceOfNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfNote(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("noteClassification");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoteClassification(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalNote = "clinicalNote";
		public static final String NoteType = "noteType";
		public static final String InHospitalReport = "inHospitalReport";
		public static final String Discipline = "discipline";
		public static final String Ward = "ward";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String IsDerivedNote = "isDerivedNote";
		public static final String ForReview = "forReview";
		public static final String ForReviewDiscipline = "forReviewDiscipline";
		public static final String ReviewingHCP = "reviewingHCP";
		public static final String ReviewingDateTime = "reviewingDateTime";
		public static final String NotingDetail = "notingDetail";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String IsCorrected = "isCorrected";
		public static final String IsTranscribed = "isTranscribed";
		public static final String SourceOfNote = "sourceOfNote";
		public static final String RecordingUser = "recordingUser";
		public static final String RecordingDateTime = "recordingDateTime";
		public static final String NoteClassification = "noteClassification";
	}
}

