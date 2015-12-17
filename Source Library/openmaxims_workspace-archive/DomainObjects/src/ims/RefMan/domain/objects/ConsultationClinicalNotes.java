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


public class ConsultationClinicalNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100029;
	private static final long serialVersionUID = 1096100029L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** Initially Seen By */
	private ims.core.clinical.domain.objects.AuthoringInformation initiallySeenBy;
	/** History of Presenting Complaint */
	private String historyPresentingComplaint;
	/** Relevant Past Medical History */
	private String relevantPMH;
	/** Other Relevant History */
	private String otherRelevantHistory;
	/** Relevant Medication */
	private String relevantMedication;
	/** Examination */
	private String examination;
	/** Clinical Impression */
	private String clinicalImpression;
	/** Has No Known Allergies */
	private Boolean hasNoKnownAllergies;
	/** Allergies
	  * Collection of ims.core.clinical.domain.objects.PatientAllergy.
	  */
	private java.util.Set allergies;
	/** See Scanned Notes */
	private Boolean seeScannedNotes;
	/** Notes Dictated */
	private Boolean notesDictated;
	/** Include Notes In GP Report */
	private Boolean includeNotesInGpReport;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInformation;
	/** Last Updating HCP */
	private ims.core.clinical.domain.objects.AuthoringInformation lastUpdatingHCP;
	/** Health Questionnaire completed */
	private Boolean healthQuestionnaireCompleted;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConsultationClinicalNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ConsultationClinicalNotes ()
    {
    	super();
    }
    public ConsultationClinicalNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ConsultationClinicalNotes.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getInitiallySeenBy() {
		return initiallySeenBy;
	}
	public void setInitiallySeenBy(ims.core.clinical.domain.objects.AuthoringInformation initiallySeenBy) {
		this.initiallySeenBy = initiallySeenBy;
	}

	public String getHistoryPresentingComplaint() {
		return historyPresentingComplaint;
	}
	public void setHistoryPresentingComplaint(String historyPresentingComplaint) {
		this.historyPresentingComplaint = historyPresentingComplaint;
	}

	public String getRelevantPMH() {
		return relevantPMH;
	}
	public void setRelevantPMH(String relevantPMH) {
		this.relevantPMH = relevantPMH;
	}

	public String getOtherRelevantHistory() {
		return otherRelevantHistory;
	}
	public void setOtherRelevantHistory(String otherRelevantHistory) {
		this.otherRelevantHistory = otherRelevantHistory;
	}

	public String getRelevantMedication() {
		return relevantMedication;
	}
	public void setRelevantMedication(String relevantMedication) {
		this.relevantMedication = relevantMedication;
	}

	public String getExamination() {
		return examination;
	}
	public void setExamination(String examination) {
		this.examination = examination;
	}

	public String getClinicalImpression() {
		return clinicalImpression;
	}
	public void setClinicalImpression(String clinicalImpression) {
		this.clinicalImpression = clinicalImpression;
	}

	public Boolean isHasNoKnownAllergies() {
		return hasNoKnownAllergies;
	}
	public void setHasNoKnownAllergies(Boolean hasNoKnownAllergies) {
		this.hasNoKnownAllergies = hasNoKnownAllergies;
	}

	public java.util.Set getAllergies() {
		if ( null == allergies ) {
			allergies = new java.util.HashSet();
		}
		return allergies;
	}
	public void setAllergies(java.util.Set paramValue) {
		this.allergies = paramValue;
	}

	public Boolean isSeeScannedNotes() {
		return seeScannedNotes;
	}
	public void setSeeScannedNotes(Boolean seeScannedNotes) {
		this.seeScannedNotes = seeScannedNotes;
	}

	public Boolean isNotesDictated() {
		return notesDictated;
	}
	public void setNotesDictated(Boolean notesDictated) {
		this.notesDictated = notesDictated;
	}

	public Boolean isIncludeNotesInGpReport() {
		return includeNotesInGpReport;
	}
	public void setIncludeNotesInGpReport(Boolean includeNotesInGpReport) {
		this.includeNotesInGpReport = includeNotesInGpReport;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getLastUpdatingHCP() {
		return lastUpdatingHCP;
	}
	public void setLastUpdatingHCP(ims.core.clinical.domain.objects.AuthoringInformation lastUpdatingHCP) {
		this.lastUpdatingHCP = lastUpdatingHCP;
	}

	public Boolean isHealthQuestionnaireCompleted() {
		return healthQuestionnaireCompleted;
	}
	public void setHealthQuestionnaireCompleted(Boolean healthQuestionnaireCompleted) {
		this.healthQuestionnaireCompleted = healthQuestionnaireCompleted;
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
		auditStr.append("\r\n*initiallySeenBy* :");
		if (initiallySeenBy != null)
		{
			auditStr.append(toShortClassName(initiallySeenBy));
				
		    auditStr.append(initiallySeenBy.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*historyPresentingComplaint* :");
		auditStr.append(historyPresentingComplaint);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantPMH* :");
		auditStr.append(relevantPMH);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherRelevantHistory* :");
		auditStr.append(otherRelevantHistory);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantMedication* :");
		auditStr.append(relevantMedication);
	    auditStr.append("; ");
		auditStr.append("\r\n*examination* :");
		auditStr.append(examination);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalImpression* :");
		auditStr.append(clinicalImpression);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasNoKnownAllergies* :");
		auditStr.append(hasNoKnownAllergies);
	    auditStr.append("; ");
		auditStr.append("\r\n*allergies* :");
		if (allergies != null)
		{
			java.util.Iterator it10 = allergies.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientAllergy obj = (ims.core.clinical.domain.objects.PatientAllergy)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*seeScannedNotes* :");
		auditStr.append(seeScannedNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*notesDictated* :");
		auditStr.append(notesDictated);
	    auditStr.append("; ");
		auditStr.append("\r\n*includeNotesInGpReport* :");
		auditStr.append(includeNotesInGpReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastUpdatingHCP* :");
		if (lastUpdatingHCP != null)
		{
			auditStr.append(toShortClassName(lastUpdatingHCP));
				
		    auditStr.append(lastUpdatingHCP.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*healthQuestionnaireCompleted* :");
		auditStr.append(healthQuestionnaireCompleted);
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
		
		String keyClassName = "ConsultationClinicalNotes";
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
		if (this.getInitiallySeenBy() != null)
		{
			sb.append("<initiallySeenBy>");
			sb.append(this.getInitiallySeenBy().toXMLString(domMap)); 	
			sb.append("</initiallySeenBy>");		
		}
		if (this.getHistoryPresentingComplaint() != null)
		{
			sb.append("<historyPresentingComplaint>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHistoryPresentingComplaint().toString()));
			sb.append("</historyPresentingComplaint>");		
		}
		if (this.getRelevantPMH() != null)
		{
			sb.append("<relevantPMH>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelevantPMH().toString()));
			sb.append("</relevantPMH>");		
		}
		if (this.getOtherRelevantHistory() != null)
		{
			sb.append("<otherRelevantHistory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherRelevantHistory().toString()));
			sb.append("</otherRelevantHistory>");		
		}
		if (this.getRelevantMedication() != null)
		{
			sb.append("<relevantMedication>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelevantMedication().toString()));
			sb.append("</relevantMedication>");		
		}
		if (this.getExamination() != null)
		{
			sb.append("<examination>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExamination().toString()));
			sb.append("</examination>");		
		}
		if (this.getClinicalImpression() != null)
		{
			sb.append("<clinicalImpression>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalImpression().toString()));
			sb.append("</clinicalImpression>");		
		}
		if (this.isHasNoKnownAllergies() != null)
		{
			sb.append("<hasNoKnownAllergies>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasNoKnownAllergies().toString()));
			sb.append("</hasNoKnownAllergies>");		
		}
		if (this.getAllergies() != null)
		{
			if (this.getAllergies().size() > 0 )
			{
			sb.append("<allergies>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAllergies(), domMap));
			sb.append("</allergies>");		
			}
		}
		if (this.isSeeScannedNotes() != null)
		{
			sb.append("<seeScannedNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSeeScannedNotes().toString()));
			sb.append("</seeScannedNotes>");		
		}
		if (this.isNotesDictated() != null)
		{
			sb.append("<notesDictated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNotesDictated().toString()));
			sb.append("</notesDictated>");		
		}
		if (this.isIncludeNotesInGpReport() != null)
		{
			sb.append("<includeNotesInGpReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIncludeNotesInGpReport().toString()));
			sb.append("</includeNotesInGpReport>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getLastUpdatingHCP() != null)
		{
			sb.append("<lastUpdatingHCP>");
			sb.append(this.getLastUpdatingHCP().toXMLString(domMap)); 	
			sb.append("</lastUpdatingHCP>");		
		}
		if (this.isHealthQuestionnaireCompleted() != null)
		{
			sb.append("<healthQuestionnaireCompleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHealthQuestionnaireCompleted().toString()));
			sb.append("</healthQuestionnaireCompleted>");		
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
			ConsultationClinicalNotes domainObject = getConsultationClinicalNotesfromXML(itemEl, factory, domMap);

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
			ConsultationClinicalNotes domainObject = getConsultationClinicalNotesfromXML(itemEl, factory, domMap);

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
		
	public static ConsultationClinicalNotes getConsultationClinicalNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConsultationClinicalNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConsultationClinicalNotes getConsultationClinicalNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConsultationClinicalNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConsultationClinicalNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConsultationClinicalNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConsultationClinicalNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConsultationClinicalNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConsultationClinicalNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ConsultationClinicalNotes)factory.getImportedDomainObject(ConsultationClinicalNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ConsultationClinicalNotes();
		}
		String keyClassName = "ConsultationClinicalNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ConsultationClinicalNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConsultationClinicalNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("initiallySeenBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInitiallySeenBy(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("historyPresentingComplaint");
		if(fldEl != null)
		{	
    		obj.setHistoryPresentingComplaint(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantPMH");
		if(fldEl != null)
		{	
    		obj.setRelevantPMH(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherRelevantHistory");
		if(fldEl != null)
		{	
    		obj.setOtherRelevantHistory(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantMedication");
		if(fldEl != null)
		{	
    		obj.setRelevantMedication(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("examination");
		if(fldEl != null)
		{	
    		obj.setExamination(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalImpression");
		if(fldEl != null)
		{	
    		obj.setClinicalImpression(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasNoKnownAllergies");
		if(fldEl != null)
		{	
    		obj.setHasNoKnownAllergies(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allergies");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAllergies(ims.core.clinical.domain.objects.PatientAllergy.fromSetXMLString(fldEl, factory, obj.getAllergies(), domMap));
		}
		fldEl = el.element("seeScannedNotes");
		if(fldEl != null)
		{	
    		obj.setSeeScannedNotes(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notesDictated");
		if(fldEl != null)
		{	
    		obj.setNotesDictated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("includeNotesInGpReport");
		if(fldEl != null)
		{	
    		obj.setIncludeNotesInGpReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lastUpdatingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLastUpdatingHCP(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("healthQuestionnaireCompleted");
		if(fldEl != null)
		{	
    		obj.setHealthQuestionnaireCompleted(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "allergies"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String InitiallySeenBy = "initiallySeenBy";
		public static final String HistoryPresentingComplaint = "historyPresentingComplaint";
		public static final String RelevantPMH = "relevantPMH";
		public static final String OtherRelevantHistory = "otherRelevantHistory";
		public static final String RelevantMedication = "relevantMedication";
		public static final String Examination = "examination";
		public static final String ClinicalImpression = "clinicalImpression";
		public static final String HasNoKnownAllergies = "hasNoKnownAllergies";
		public static final String Allergies = "allergies";
		public static final String SeeScannedNotes = "seeScannedNotes";
		public static final String NotesDictated = "notesDictated";
		public static final String IncludeNotesInGpReport = "includeNotesInGpReport";
		public static final String RecordingInformation = "recordingInformation";
		public static final String LastUpdatingHCP = "lastUpdatingHCP";
		public static final String HealthQuestionnaireCompleted = "healthQuestionnaireCompleted";
	}
}

