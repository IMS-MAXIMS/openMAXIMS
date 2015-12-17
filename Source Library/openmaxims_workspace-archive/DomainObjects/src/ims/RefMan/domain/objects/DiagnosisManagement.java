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


public class DiagnosisManagement extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100030;
	private static final long serialVersionUID = 1096100030L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** Last Authoring HCP */
	private ims.core.clinical.domain.objects.AuthoringInformation lastAuthoringHCP;
	/** Diagnosis
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set diagnosis;
	/** Procedures
	  * Collection of ims.core.clinical.domain.objects.PatientProcedure.
	  */
	private java.util.Set procedures;
	/** First Definitive Treatment Date */
	private java.util.Date firstDefinitiveTreatmentDate;
	/** Investigations And Results */
	private String investigationsAndResults;
	/** Management Plan */
	private String managementPlan;
	/** Advice and Information Given */
	private String adviceAndInfoGiven;
	/** Is Action Required By GP */
	private ims.domain.lookups.LookupInstance actionRequiredByGP;
	/** Action Required By GP Notes */
	private String actionRequiredByGPNotes;
	/** Patient Consent to receive copy of CATS Report */
	private ims.domain.lookups.LookupInstance patientConsent;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DiagnosisManagement (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DiagnosisManagement ()
    {
    	super();
    }
    public DiagnosisManagement (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.DiagnosisManagement.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getLastAuthoringHCP() {
		return lastAuthoringHCP;
	}
	public void setLastAuthoringHCP(ims.core.clinical.domain.objects.AuthoringInformation lastAuthoringHCP) {
		this.lastAuthoringHCP = lastAuthoringHCP;
	}

	public java.util.Set getDiagnosis() {
		if ( null == diagnosis ) {
			diagnosis = new java.util.HashSet();
		}
		return diagnosis;
	}
	public void setDiagnosis(java.util.Set paramValue) {
		this.diagnosis = paramValue;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
	}

	public java.util.Date getFirstDefinitiveTreatmentDate() {
		return firstDefinitiveTreatmentDate;
	}
	public void setFirstDefinitiveTreatmentDate(java.util.Date firstDefinitiveTreatmentDate) {
		this.firstDefinitiveTreatmentDate = firstDefinitiveTreatmentDate;
	}

	public String getInvestigationsAndResults() {
		return investigationsAndResults;
	}
	public void setInvestigationsAndResults(String investigationsAndResults) {
		this.investigationsAndResults = investigationsAndResults;
	}

	public String getManagementPlan() {
		return managementPlan;
	}
	public void setManagementPlan(String managementPlan) {
		this.managementPlan = managementPlan;
	}

	public String getAdviceAndInfoGiven() {
		return adviceAndInfoGiven;
	}
	public void setAdviceAndInfoGiven(String adviceAndInfoGiven) {
		this.adviceAndInfoGiven = adviceAndInfoGiven;
	}

	public ims.domain.lookups.LookupInstance getActionRequiredByGP() {
		return actionRequiredByGP;
	}
	public void setActionRequiredByGP(ims.domain.lookups.LookupInstance actionRequiredByGP) {
		this.actionRequiredByGP = actionRequiredByGP;
	}

	public String getActionRequiredByGPNotes() {
		return actionRequiredByGPNotes;
	}
	public void setActionRequiredByGPNotes(String actionRequiredByGPNotes) {
		this.actionRequiredByGPNotes = actionRequiredByGPNotes;
	}

	public ims.domain.lookups.LookupInstance getPatientConsent() {
		return patientConsent;
	}
	public void setPatientConsent(ims.domain.lookups.LookupInstance patientConsent) {
		this.patientConsent = patientConsent;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		auditStr.append("\r\n*lastAuthoringHCP* :");
		if (lastAuthoringHCP != null)
		{
			auditStr.append(toShortClassName(lastAuthoringHCP));
				
		    auditStr.append(lastAuthoringHCP.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			java.util.Iterator it3 = diagnosis.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it4 = procedures.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientProcedure obj = (ims.core.clinical.domain.objects.PatientProcedure)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*firstDefinitiveTreatmentDate* :");
		auditStr.append(firstDefinitiveTreatmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationsAndResults* :");
		auditStr.append(investigationsAndResults);
	    auditStr.append("; ");
		auditStr.append("\r\n*managementPlan* :");
		auditStr.append(managementPlan);
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceAndInfoGiven* :");
		auditStr.append(adviceAndInfoGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionRequiredByGP* :");
		if (actionRequiredByGP != null)
			auditStr.append(actionRequiredByGP.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*actionRequiredByGPNotes* :");
		auditStr.append(actionRequiredByGPNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientConsent* :");
		if (patientConsent != null)
			auditStr.append(patientConsent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "DiagnosisManagement";
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
		if (this.getLastAuthoringHCP() != null)
		{
			sb.append("<lastAuthoringHCP>");
			sb.append(this.getLastAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</lastAuthoringHCP>");		
		}
		if (this.getDiagnosis() != null)
		{
			if (this.getDiagnosis().size() > 0 )
			{
			sb.append("<diagnosis>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDiagnosis(), domMap));
			sb.append("</diagnosis>");		
			}
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
		}
		if (this.getFirstDefinitiveTreatmentDate() != null)
		{
			sb.append("<firstDefinitiveTreatmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstDefinitiveTreatmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstDefinitiveTreatmentDate>");		
		}
		if (this.getInvestigationsAndResults() != null)
		{
			sb.append("<investigationsAndResults>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvestigationsAndResults().toString()));
			sb.append("</investigationsAndResults>");		
		}
		if (this.getManagementPlan() != null)
		{
			sb.append("<managementPlan>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getManagementPlan().toString()));
			sb.append("</managementPlan>");		
		}
		if (this.getAdviceAndInfoGiven() != null)
		{
			sb.append("<adviceAndInfoGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdviceAndInfoGiven().toString()));
			sb.append("</adviceAndInfoGiven>");		
		}
		if (this.getActionRequiredByGP() != null)
		{
			sb.append("<actionRequiredByGP>");
			sb.append(this.getActionRequiredByGP().toXMLString()); 
			sb.append("</actionRequiredByGP>");		
		}
		if (this.getActionRequiredByGPNotes() != null)
		{
			sb.append("<actionRequiredByGPNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionRequiredByGPNotes().toString()));
			sb.append("</actionRequiredByGPNotes>");		
		}
		if (this.getPatientConsent() != null)
		{
			sb.append("<patientConsent>");
			sb.append(this.getPatientConsent().toXMLString()); 
			sb.append("</patientConsent>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			DiagnosisManagement domainObject = getDiagnosisManagementfromXML(itemEl, factory, domMap);

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
			DiagnosisManagement domainObject = getDiagnosisManagementfromXML(itemEl, factory, domMap);

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
		
	public static DiagnosisManagement getDiagnosisManagementfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDiagnosisManagementfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DiagnosisManagement getDiagnosisManagementfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DiagnosisManagement.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DiagnosisManagement.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DiagnosisManagement class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DiagnosisManagement)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DiagnosisManagement.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DiagnosisManagement ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DiagnosisManagement)factory.getImportedDomainObject(DiagnosisManagement.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DiagnosisManagement();
		}
		String keyClassName = "DiagnosisManagement";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DiagnosisManagement)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DiagnosisManagement obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lastAuthoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLastAuthoringHCP(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getDiagnosis(), domMap));
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.core.clinical.domain.objects.PatientProcedure.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
		fldEl = el.element("firstDefinitiveTreatmentDate");
		if(fldEl != null)
		{	
    		obj.setFirstDefinitiveTreatmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("investigationsAndResults");
		if(fldEl != null)
		{	
    		obj.setInvestigationsAndResults(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("managementPlan");
		if(fldEl != null)
		{	
    		obj.setManagementPlan(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adviceAndInfoGiven");
		if(fldEl != null)
		{	
    		obj.setAdviceAndInfoGiven(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionRequiredByGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActionRequiredByGP(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("actionRequiredByGPNotes");
		if(fldEl != null)
		{	
    		obj.setActionRequiredByGPNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientConsent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientConsent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "diagnosis"
		, "procedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String LastAuthoringHCP = "lastAuthoringHCP";
		public static final String Diagnosis = "diagnosis";
		public static final String Procedures = "procedures";
		public static final String FirstDefinitiveTreatmentDate = "firstDefinitiveTreatmentDate";
		public static final String InvestigationsAndResults = "investigationsAndResults";
		public static final String ManagementPlan = "managementPlan";
		public static final String AdviceAndInfoGiven = "adviceAndInfoGiven";
		public static final String ActionRequiredByGP = "actionRequiredByGP";
		public static final String ActionRequiredByGPNotes = "actionRequiredByGPNotes";
		public static final String PatientConsent = "patientConsent";
		public static final String RecordingInformation = "recordingInformation";
	}
}

