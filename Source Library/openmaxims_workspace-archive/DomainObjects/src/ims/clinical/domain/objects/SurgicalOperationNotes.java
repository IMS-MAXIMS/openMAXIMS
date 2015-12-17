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
 * @author Joan Heelan
 * Generated.
 */


public class SurgicalOperationNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100106;
	private static final long serialVersionUID = 1003100106L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Info */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Sign Off HCP */
	private ims.core.resource.people.domain.objects.Hcp signOffHCP;
	/** Sign Off Date Time */
	private java.util.Date signOffDateTime;
	/** to be Patient Graphic Assessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment diagram;
	/** Procedures Performed 
	  * Collection of ims.core.clinical.domain.objects.PatientProcedure.
	  */
	private java.util.Set proceduresPerformed;
	/** Patient Diagnoses
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set patientDiagnoses;
	/** Patient's Main Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure mainProcedure;
	/** Surgical Op Note Document  */
	private ims.core.documents.domain.objects.PatientDocument surgicalOpNoteDocument;
	/** Estimated Date Of Discharge */
	private java.util.Date estimatedDateOfDischarge;
	/** Principal Anaesthetist  */
	private ims.core.resource.people.domain.objects.Hcp principalAnaesthetist;
	/** Consultant Anaesthetist  */
	private ims.core.resource.people.domain.objects.Hcp consultantAnaesthetist;
	/** Anaesthetic Given */
	private ims.domain.lookups.LookupInstance anaestheticGiven;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalOperationNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalOperationNotes ()
    {
    	super();
    }
    public SurgicalOperationNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalOperationNotes.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getSignOffHCP() {
		return signOffHCP;
	}
	public void setSignOffHCP(ims.core.resource.people.domain.objects.Hcp signOffHCP) {
		this.signOffHCP = signOffHCP;
	}

	public java.util.Date getSignOffDateTime() {
		return signOffDateTime;
	}
	public void setSignOffDateTime(java.util.Date signOffDateTime) {
		this.signOffDateTime = signOffDateTime;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getDiagram() {
		return diagram;
	}
	public void setDiagram(ims.assessment.instantiation.domain.objects.PatientAssessment diagram) {
		this.diagram = diagram;
	}

	public java.util.Set getProceduresPerformed() {
		if ( null == proceduresPerformed ) {
			proceduresPerformed = new java.util.HashSet();
		}
		return proceduresPerformed;
	}
	public void setProceduresPerformed(java.util.Set paramValue) {
		this.proceduresPerformed = paramValue;
	}

	public java.util.Set getPatientDiagnoses() {
		if ( null == patientDiagnoses ) {
			patientDiagnoses = new java.util.HashSet();
		}
		return patientDiagnoses;
	}
	public void setPatientDiagnoses(java.util.Set paramValue) {
		this.patientDiagnoses = paramValue;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getMainProcedure() {
		return mainProcedure;
	}
	public void setMainProcedure(ims.core.clinical.domain.objects.PatientProcedure mainProcedure) {
		this.mainProcedure = mainProcedure;
	}

	public ims.core.documents.domain.objects.PatientDocument getSurgicalOpNoteDocument() {
		return surgicalOpNoteDocument;
	}
	public void setSurgicalOpNoteDocument(ims.core.documents.domain.objects.PatientDocument surgicalOpNoteDocument) {
		this.surgicalOpNoteDocument = surgicalOpNoteDocument;
	}

	public java.util.Date getEstimatedDateOfDischarge() {
		return estimatedDateOfDischarge;
	}
	public void setEstimatedDateOfDischarge(java.util.Date estimatedDateOfDischarge) {
		this.estimatedDateOfDischarge = estimatedDateOfDischarge;
	}

	public ims.core.resource.people.domain.objects.Hcp getPrincipalAnaesthetist() {
		return principalAnaesthetist;
	}
	public void setPrincipalAnaesthetist(ims.core.resource.people.domain.objects.Hcp principalAnaesthetist) {
		this.principalAnaesthetist = principalAnaesthetist;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultantAnaesthetist() {
		return consultantAnaesthetist;
	}
	public void setConsultantAnaesthetist(ims.core.resource.people.domain.objects.Hcp consultantAnaesthetist) {
		this.consultantAnaesthetist = consultantAnaesthetist;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticGiven() {
		return anaestheticGiven;
	}
	public void setAnaestheticGiven(ims.domain.lookups.LookupInstance anaestheticGiven) {
		this.anaestheticGiven = anaestheticGiven;
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
		
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*signOffHCP* :");
		if (signOffHCP != null)
		{
			auditStr.append(toShortClassName(signOffHCP));
				
		    auditStr.append(signOffHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*signOffDateTime* :");
		auditStr.append(signOffDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagram* :");
		if (diagram != null)
		{
			auditStr.append(toShortClassName(diagram));
				
		    auditStr.append(diagram.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*proceduresPerformed* :");
		if (proceduresPerformed != null)
		{
			java.util.Iterator it6 = proceduresPerformed.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientProcedure obj = (ims.core.clinical.domain.objects.PatientProcedure)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientDiagnoses* :");
		if (patientDiagnoses != null)
		{
			java.util.Iterator it7 = patientDiagnoses.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it7.next();
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
		auditStr.append("\r\n*mainProcedure* :");
		if (mainProcedure != null)
		{
			auditStr.append(toShortClassName(mainProcedure));
				
		    auditStr.append(mainProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*surgicalOpNoteDocument* :");
		if (surgicalOpNoteDocument != null)
		{
			auditStr.append(toShortClassName(surgicalOpNoteDocument));
				
		    auditStr.append(surgicalOpNoteDocument.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*estimatedDateOfDischarge* :");
		auditStr.append(estimatedDateOfDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*principalAnaesthetist* :");
		if (principalAnaesthetist != null)
		{
			auditStr.append(toShortClassName(principalAnaesthetist));
				
		    auditStr.append(principalAnaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantAnaesthetist* :");
		if (consultantAnaesthetist != null)
		{
			auditStr.append(toShortClassName(consultantAnaesthetist));
				
		    auditStr.append(consultantAnaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticGiven* :");
		if (anaestheticGiven != null)
			auditStr.append(anaestheticGiven.getText());
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
		
		String keyClassName = "SurgicalOperationNotes";
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
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getSignOffHCP() != null)
		{
			sb.append("<signOffHCP>");
			sb.append(this.getSignOffHCP().toXMLString(domMap)); 	
			sb.append("</signOffHCP>");		
		}
		if (this.getSignOffDateTime() != null)
		{
			sb.append("<signOffDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSignOffDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</signOffDateTime>");		
		}
		if (this.getDiagram() != null)
		{
			sb.append("<diagram>");
			sb.append(this.getDiagram().toXMLString(domMap)); 	
			sb.append("</diagram>");		
		}
		if (this.getProceduresPerformed() != null)
		{
			if (this.getProceduresPerformed().size() > 0 )
			{
			sb.append("<proceduresPerformed>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProceduresPerformed(), domMap));
			sb.append("</proceduresPerformed>");		
			}
		}
		if (this.getPatientDiagnoses() != null)
		{
			if (this.getPatientDiagnoses().size() > 0 )
			{
			sb.append("<patientDiagnoses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientDiagnoses(), domMap));
			sb.append("</patientDiagnoses>");		
			}
		}
		if (this.getMainProcedure() != null)
		{
			sb.append("<mainProcedure>");
			sb.append(this.getMainProcedure().toXMLString(domMap)); 	
			sb.append("</mainProcedure>");		
		}
		if (this.getSurgicalOpNoteDocument() != null)
		{
			sb.append("<surgicalOpNoteDocument>");
			sb.append(this.getSurgicalOpNoteDocument().toXMLString(domMap)); 	
			sb.append("</surgicalOpNoteDocument>");		
		}
		if (this.getEstimatedDateOfDischarge() != null)
		{
			sb.append("<estimatedDateOfDischarge>");
			sb.append(new ims.framework.utils.DateTime(this.getEstimatedDateOfDischarge()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estimatedDateOfDischarge>");		
		}
		if (this.getPrincipalAnaesthetist() != null)
		{
			sb.append("<principalAnaesthetist>");
			sb.append(this.getPrincipalAnaesthetist().toXMLString(domMap)); 	
			sb.append("</principalAnaesthetist>");		
		}
		if (this.getConsultantAnaesthetist() != null)
		{
			sb.append("<consultantAnaesthetist>");
			sb.append(this.getConsultantAnaesthetist().toXMLString(domMap)); 	
			sb.append("</consultantAnaesthetist>");		
		}
		if (this.getAnaestheticGiven() != null)
		{
			sb.append("<anaestheticGiven>");
			sb.append(this.getAnaestheticGiven().toXMLString()); 
			sb.append("</anaestheticGiven>");		
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
			SurgicalOperationNotes domainObject = getSurgicalOperationNotesfromXML(itemEl, factory, domMap);

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
			SurgicalOperationNotes domainObject = getSurgicalOperationNotesfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalOperationNotes getSurgicalOperationNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalOperationNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalOperationNotes getSurgicalOperationNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalOperationNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalOperationNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalOperationNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalOperationNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalOperationNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalOperationNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalOperationNotes)factory.getImportedDomainObject(SurgicalOperationNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalOperationNotes();
		}
		String keyClassName = "SurgicalOperationNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalOperationNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalOperationNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("signOffHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSignOffHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("signOffDateTime");
		if(fldEl != null)
		{	
    		obj.setSignOffDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("diagram");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagram(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("proceduresPerformed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProceduresPerformed(ims.core.clinical.domain.objects.PatientProcedure.fromSetXMLString(fldEl, factory, obj.getProceduresPerformed(), domMap));
		}
		fldEl = el.element("patientDiagnoses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientDiagnoses(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getPatientDiagnoses(), domMap));
		}
		fldEl = el.element("mainProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMainProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("surgicalOpNoteDocument");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSurgicalOpNoteDocument(ims.core.documents.domain.objects.PatientDocument.getPatientDocumentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("estimatedDateOfDischarge");
		if(fldEl != null)
		{	
    		obj.setEstimatedDateOfDischarge(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("principalAnaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrincipalAnaesthetist(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("consultantAnaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultantAnaesthetist(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaestheticGiven");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticGiven(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "proceduresPerformed"
		, "patientDiagnoses"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String CareContext = "careContext";
		public static final String SignOffHCP = "signOffHCP";
		public static final String SignOffDateTime = "signOffDateTime";
		public static final String Diagram = "diagram";
		public static final String ProceduresPerformed = "proceduresPerformed";
		public static final String PatientDiagnoses = "patientDiagnoses";
		public static final String MainProcedure = "mainProcedure";
		public static final String SurgicalOpNoteDocument = "surgicalOpNoteDocument";
		public static final String EstimatedDateOfDischarge = "estimatedDateOfDischarge";
		public static final String PrincipalAnaesthetist = "principalAnaesthetist";
		public static final String ConsultantAnaesthetist = "consultantAnaesthetist";
		public static final String AnaestheticGiven = "anaestheticGiven";
	}
}

