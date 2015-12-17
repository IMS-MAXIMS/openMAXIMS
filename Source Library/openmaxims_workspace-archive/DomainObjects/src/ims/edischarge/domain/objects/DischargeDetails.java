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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DischargeDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100001;
	private static final long serialVersionUID = 1099100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** InitiatingHCP */
	private ims.core.resource.people.domain.objects.Hcp initiatingHCP;
	/** Date and Time of Discharge */
	private java.util.Date dateOfDischarge;
	/** Discharge Method */
	private ims.domain.lookups.LookupInstance dischargeMethod;
	/** Discharge Destination */
	private ims.domain.lookups.LookupInstance dischargeDestination;
	/** Discharging ward */
	private ims.core.resource.place.domain.objects.Location dischargingWard;
	/** DischargeLetterStatus */
	private ims.domain.lookups.LookupInstance dischargeLetterStatus;
	/** PatientAssessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment patientAssessment;
	/** has No Complications */
	private Boolean hasNoComplications;
	/** has No Comorbidities */
	private Boolean hasNoComorbidities;
	/** DischargingConsultant */
	private ims.core.resource.people.domain.objects.Hcp dischargingConsultant;
	/** Secondary Discharging Consultant */
	private ims.core.resource.people.domain.objects.Hcp secondaryDischargingConsultant;
	/** DischargingSpecialty */
	private ims.domain.lookups.LookupInstance dischargingSpecialty;
	/** Discharge Supplementary Letter Status */
	private ims.domain.lookups.LookupInstance dischargeSupplementaryLetterStatus;
	/** NurseEnabledInstructions */
	private ims.edischarge.domain.objects.NurseEnabledInstructions nurseEnabledInstructions;
	/** has No Diagnosis */
	private Boolean hasNoDiagnosis;
	/** Method Of Discharge (STHK) */
	private ims.domain.lookups.LookupInstance methodOfDischarge;
	/** isDiagnosisComplete */
	private Boolean isDiagnosisComplete;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeDetails ()
    {
    	super();
    }
    public DischargeDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.DischargeDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getInitiatingHCP() {
		return initiatingHCP;
	}
	public void setInitiatingHCP(ims.core.resource.people.domain.objects.Hcp initiatingHCP) {
		this.initiatingHCP = initiatingHCP;
	}

	public java.util.Date getDateOfDischarge() {
		return dateOfDischarge;
	}
	public void setDateOfDischarge(java.util.Date dateOfDischarge) {
		this.dateOfDischarge = dateOfDischarge;
	}

	public ims.domain.lookups.LookupInstance getDischargeMethod() {
		return dischargeMethod;
	}
	public void setDischargeMethod(ims.domain.lookups.LookupInstance dischargeMethod) {
		this.dischargeMethod = dischargeMethod;
	}

	public ims.domain.lookups.LookupInstance getDischargeDestination() {
		return dischargeDestination;
	}
	public void setDischargeDestination(ims.domain.lookups.LookupInstance dischargeDestination) {
		this.dischargeDestination = dischargeDestination;
	}

	public ims.core.resource.place.domain.objects.Location getDischargingWard() {
		return dischargingWard;
	}
	public void setDischargingWard(ims.core.resource.place.domain.objects.Location dischargingWard) {
		this.dischargingWard = dischargingWard;
	}

	public ims.domain.lookups.LookupInstance getDischargeLetterStatus() {
		return dischargeLetterStatus;
	}
	public void setDischargeLetterStatus(ims.domain.lookups.LookupInstance dischargeLetterStatus) {
		this.dischargeLetterStatus = dischargeLetterStatus;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getPatientAssessment() {
		return patientAssessment;
	}
	public void setPatientAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment patientAssessment) {
		this.patientAssessment = patientAssessment;
	}

	public Boolean isHasNoComplications() {
		return hasNoComplications;
	}
	public void setHasNoComplications(Boolean hasNoComplications) {
		this.hasNoComplications = hasNoComplications;
	}

	public Boolean isHasNoComorbidities() {
		return hasNoComorbidities;
	}
	public void setHasNoComorbidities(Boolean hasNoComorbidities) {
		this.hasNoComorbidities = hasNoComorbidities;
	}

	public ims.core.resource.people.domain.objects.Hcp getDischargingConsultant() {
		return dischargingConsultant;
	}
	public void setDischargingConsultant(ims.core.resource.people.domain.objects.Hcp dischargingConsultant) {
		this.dischargingConsultant = dischargingConsultant;
	}

	public ims.core.resource.people.domain.objects.Hcp getSecondaryDischargingConsultant() {
		return secondaryDischargingConsultant;
	}
	public void setSecondaryDischargingConsultant(ims.core.resource.people.domain.objects.Hcp secondaryDischargingConsultant) {
		this.secondaryDischargingConsultant = secondaryDischargingConsultant;
	}

	public ims.domain.lookups.LookupInstance getDischargingSpecialty() {
		return dischargingSpecialty;
	}
	public void setDischargingSpecialty(ims.domain.lookups.LookupInstance dischargingSpecialty) {
		this.dischargingSpecialty = dischargingSpecialty;
	}

	public ims.domain.lookups.LookupInstance getDischargeSupplementaryLetterStatus() {
		return dischargeSupplementaryLetterStatus;
	}
	public void setDischargeSupplementaryLetterStatus(ims.domain.lookups.LookupInstance dischargeSupplementaryLetterStatus) {
		this.dischargeSupplementaryLetterStatus = dischargeSupplementaryLetterStatus;
	}

	public ims.edischarge.domain.objects.NurseEnabledInstructions getNurseEnabledInstructions() {
		return nurseEnabledInstructions;
	}
	public void setNurseEnabledInstructions(ims.edischarge.domain.objects.NurseEnabledInstructions nurseEnabledInstructions) {
		this.nurseEnabledInstructions = nurseEnabledInstructions;
	}

	public Boolean isHasNoDiagnosis() {
		return hasNoDiagnosis;
	}
	public void setHasNoDiagnosis(Boolean hasNoDiagnosis) {
		this.hasNoDiagnosis = hasNoDiagnosis;
	}

	public ims.domain.lookups.LookupInstance getMethodOfDischarge() {
		return methodOfDischarge;
	}
	public void setMethodOfDischarge(ims.domain.lookups.LookupInstance methodOfDischarge) {
		this.methodOfDischarge = methodOfDischarge;
	}

	public Boolean isIsDiagnosisComplete() {
		return isDiagnosisComplete;
	}
	public void setIsDiagnosisComplete(Boolean isDiagnosisComplete) {
		this.isDiagnosisComplete = isDiagnosisComplete;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*initiatingHCP* :");
		if (initiatingHCP != null)
		{
			auditStr.append(toShortClassName(initiatingHCP));
				
		    auditStr.append(initiatingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfDischarge* :");
		auditStr.append(dateOfDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeMethod* :");
		if (dischargeMethod != null)
			auditStr.append(dischargeMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDestination* :");
		if (dischargeDestination != null)
			auditStr.append(dischargeDestination.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargingWard* :");
		if (dischargingWard != null)
		{
			auditStr.append(toShortClassName(dischargingWard));
				
		    auditStr.append(dischargingWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeLetterStatus* :");
		if (dischargeLetterStatus != null)
			auditStr.append(dischargeLetterStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAssessment* :");
		if (patientAssessment != null)
		{
			auditStr.append(toShortClassName(patientAssessment));
				
		    auditStr.append(patientAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasNoComplications* :");
		auditStr.append(hasNoComplications);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasNoComorbidities* :");
		auditStr.append(hasNoComorbidities);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargingConsultant* :");
		if (dischargingConsultant != null)
		{
			auditStr.append(toShortClassName(dischargingConsultant));
				
		    auditStr.append(dischargingConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryDischargingConsultant* :");
		if (secondaryDischargingConsultant != null)
		{
			auditStr.append(toShortClassName(secondaryDischargingConsultant));
				
		    auditStr.append(secondaryDischargingConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargingSpecialty* :");
		if (dischargingSpecialty != null)
			auditStr.append(dischargingSpecialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeSupplementaryLetterStatus* :");
		if (dischargeSupplementaryLetterStatus != null)
			auditStr.append(dischargeSupplementaryLetterStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nurseEnabledInstructions* :");
		if (nurseEnabledInstructions != null)
		{
			auditStr.append(toShortClassName(nurseEnabledInstructions));
				
		    auditStr.append(nurseEnabledInstructions.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasNoDiagnosis* :");
		auditStr.append(hasNoDiagnosis);
	    auditStr.append("; ");
		auditStr.append("\r\n*methodOfDischarge* :");
		if (methodOfDischarge != null)
			auditStr.append(methodOfDischarge.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiagnosisComplete* :");
		auditStr.append(isDiagnosisComplete);
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
		
		String keyClassName = "DischargeDetails";
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
		if (this.getInitiatingHCP() != null)
		{
			sb.append("<initiatingHCP>");
			sb.append(this.getInitiatingHCP().toXMLString(domMap)); 	
			sb.append("</initiatingHCP>");		
		}
		if (this.getDateOfDischarge() != null)
		{
			sb.append("<dateOfDischarge>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfDischarge()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfDischarge>");		
		}
		if (this.getDischargeMethod() != null)
		{
			sb.append("<dischargeMethod>");
			sb.append(this.getDischargeMethod().toXMLString()); 
			sb.append("</dischargeMethod>");		
		}
		if (this.getDischargeDestination() != null)
		{
			sb.append("<dischargeDestination>");
			sb.append(this.getDischargeDestination().toXMLString()); 
			sb.append("</dischargeDestination>");		
		}
		if (this.getDischargingWard() != null)
		{
			sb.append("<dischargingWard>");
			sb.append(this.getDischargingWard().toXMLString(domMap)); 	
			sb.append("</dischargingWard>");		
		}
		if (this.getDischargeLetterStatus() != null)
		{
			sb.append("<dischargeLetterStatus>");
			sb.append(this.getDischargeLetterStatus().toXMLString()); 
			sb.append("</dischargeLetterStatus>");		
		}
		if (this.getPatientAssessment() != null)
		{
			sb.append("<patientAssessment>");
			sb.append(this.getPatientAssessment().toXMLString(domMap)); 	
			sb.append("</patientAssessment>");		
		}
		if (this.isHasNoComplications() != null)
		{
			sb.append("<hasNoComplications>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasNoComplications().toString()));
			sb.append("</hasNoComplications>");		
		}
		if (this.isHasNoComorbidities() != null)
		{
			sb.append("<hasNoComorbidities>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasNoComorbidities().toString()));
			sb.append("</hasNoComorbidities>");		
		}
		if (this.getDischargingConsultant() != null)
		{
			sb.append("<dischargingConsultant>");
			sb.append(this.getDischargingConsultant().toXMLString(domMap)); 	
			sb.append("</dischargingConsultant>");		
		}
		if (this.getSecondaryDischargingConsultant() != null)
		{
			sb.append("<secondaryDischargingConsultant>");
			sb.append(this.getSecondaryDischargingConsultant().toXMLString(domMap)); 	
			sb.append("</secondaryDischargingConsultant>");		
		}
		if (this.getDischargingSpecialty() != null)
		{
			sb.append("<dischargingSpecialty>");
			sb.append(this.getDischargingSpecialty().toXMLString()); 
			sb.append("</dischargingSpecialty>");		
		}
		if (this.getDischargeSupplementaryLetterStatus() != null)
		{
			sb.append("<dischargeSupplementaryLetterStatus>");
			sb.append(this.getDischargeSupplementaryLetterStatus().toXMLString()); 
			sb.append("</dischargeSupplementaryLetterStatus>");		
		}
		if (this.getNurseEnabledInstructions() != null)
		{
			sb.append("<nurseEnabledInstructions>");
			sb.append(this.getNurseEnabledInstructions().toXMLString(domMap)); 	
			sb.append("</nurseEnabledInstructions>");		
		}
		if (this.isHasNoDiagnosis() != null)
		{
			sb.append("<hasNoDiagnosis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasNoDiagnosis().toString()));
			sb.append("</hasNoDiagnosis>");		
		}
		if (this.getMethodOfDischarge() != null)
		{
			sb.append("<methodOfDischarge>");
			sb.append(this.getMethodOfDischarge().toXMLString()); 
			sb.append("</methodOfDischarge>");		
		}
		if (this.isIsDiagnosisComplete() != null)
		{
			sb.append("<isDiagnosisComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDiagnosisComplete().toString()));
			sb.append("</isDiagnosisComplete>");		
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
			DischargeDetails domainObject = getDischargeDetailsfromXML(itemEl, factory, domMap);

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
			DischargeDetails domainObject = getDischargeDetailsfromXML(itemEl, factory, domMap);

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
		
	public static DischargeDetails getDischargeDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeDetails getDischargeDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeDetails)factory.getImportedDomainObject(DischargeDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeDetails();
		}
		String keyClassName = "DischargeDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("initiatingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInitiatingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateOfDischarge");
		if(fldEl != null)
		{	
    		obj.setDateOfDischarge(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeDestination");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeDestination(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargingWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargingWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeLetterStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeLetterStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasNoComplications");
		if(fldEl != null)
		{	
    		obj.setHasNoComplications(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasNoComorbidities");
		if(fldEl != null)
		{	
    		obj.setHasNoComorbidities(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargingConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("secondaryDischargingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSecondaryDischargingConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargingSpecialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargingSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeSupplementaryLetterStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeSupplementaryLetterStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nurseEnabledInstructions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNurseEnabledInstructions(ims.edischarge.domain.objects.NurseEnabledInstructions.getNurseEnabledInstructionsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasNoDiagnosis");
		if(fldEl != null)
		{	
    		obj.setHasNoDiagnosis(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("methodOfDischarge");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMethodOfDischarge(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isDiagnosisComplete");
		if(fldEl != null)
		{	
    		obj.setIsDiagnosisComplete(new Boolean(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String InitiatingHCP = "initiatingHCP";
		public static final String DateOfDischarge = "dateOfDischarge";
		public static final String DischargeMethod = "dischargeMethod";
		public static final String DischargeDestination = "dischargeDestination";
		public static final String DischargingWard = "dischargingWard";
		public static final String DischargeLetterStatus = "dischargeLetterStatus";
		public static final String PatientAssessment = "patientAssessment";
		public static final String HasNoComplications = "hasNoComplications";
		public static final String HasNoComorbidities = "hasNoComorbidities";
		public static final String DischargingConsultant = "dischargingConsultant";
		public static final String SecondaryDischargingConsultant = "secondaryDischargingConsultant";
		public static final String DischargingSpecialty = "dischargingSpecialty";
		public static final String DischargeSupplementaryLetterStatus = "dischargeSupplementaryLetterStatus";
		public static final String NurseEnabledInstructions = "nurseEnabledInstructions";
		public static final String HasNoDiagnosis = "hasNoDiagnosis";
		public static final String MethodOfDischarge = "methodOfDischarge";
		public static final String IsDiagnosisComplete = "isDiagnosisComplete";
	}
}

