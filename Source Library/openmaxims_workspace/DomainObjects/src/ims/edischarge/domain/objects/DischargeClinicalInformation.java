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


public class DischargeClinicalInformation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100071;
	private static final long serialVersionUID = 1072100071L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Presenting Complaints */
	private String presentingComplaints;
	/** Summary Of Admission */
	private String summaryOfAdmission;
	/** Investigation Comments */
	private String investigationComments;
	/** Relevant Treatments and Changes Made to Treatments: */
	private String relevantTreatments;
	/** Additional Comments */
	private String additionalComments;
	/** Pending Results to be included in Report
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.Set results;
	/** Patient Alerts
	  * Collection of ims.core.clinical.domain.objects.PatientAlert.
	  */
	private java.util.List patientAlerts;
	/** Reason For Admission And Presenting Complaints */
	private String reasonForAdmissionAndPresentingComplaints;
	/** Relevant Infections Risks and Warnings */
	private String relevantInfectionsRisksWarnings;
	/** Summary Of Inpatient Episode */
	private String summaryOfInpatientEpisode;
	/** Relevant Investigations And Results */
	private String relevantInvsAndResults;
	/** Pending Results Comments */
	private String pendingResultsComments;
	/** Relevant Treatments and Changes Made to Treatments: And Changes Made to Treatments */
	private String relevantTreatmentsAndChanges;
	/** SchoolNursery */
	private String schoolNursery;
	/** isComplete */
	private Boolean isComplete;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeClinicalInformation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeClinicalInformation ()
    {
    	super();
    }
    public DischargeClinicalInformation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.DischargeClinicalInformation.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public String getPresentingComplaints() {
		return presentingComplaints;
	}
	public void setPresentingComplaints(String presentingComplaints) {
		this.presentingComplaints = presentingComplaints;
	}

	public String getSummaryOfAdmission() {
		return summaryOfAdmission;
	}
	public void setSummaryOfAdmission(String summaryOfAdmission) {
		this.summaryOfAdmission = summaryOfAdmission;
	}

	public String getInvestigationComments() {
		return investigationComments;
	}
	public void setInvestigationComments(String investigationComments) {
		this.investigationComments = investigationComments;
	}

	public String getRelevantTreatments() {
		return relevantTreatments;
	}
	public void setRelevantTreatments(String relevantTreatments) {
		this.relevantTreatments = relevantTreatments;
	}

	public String getAdditionalComments() {
		return additionalComments;
	}
	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	public java.util.Set getResults() {
		if ( null == results ) {
			results = new java.util.HashSet();
		}
		return results;
	}
	public void setResults(java.util.Set paramValue) {
		this.results = paramValue;
	}

	public java.util.List getPatientAlerts() {
		if ( null == patientAlerts ) {
			patientAlerts = new java.util.ArrayList();
		}
		return patientAlerts;
	}
	public void setPatientAlerts(java.util.List paramValue) {
		this.patientAlerts = paramValue;
	}

	public String getReasonForAdmissionAndPresentingComplaints() {
		return reasonForAdmissionAndPresentingComplaints;
	}
	public void setReasonForAdmissionAndPresentingComplaints(String reasonForAdmissionAndPresentingComplaints) {
		this.reasonForAdmissionAndPresentingComplaints = reasonForAdmissionAndPresentingComplaints;
	}

	public String getRelevantInfectionsRisksWarnings() {
		return relevantInfectionsRisksWarnings;
	}
	public void setRelevantInfectionsRisksWarnings(String relevantInfectionsRisksWarnings) {
		this.relevantInfectionsRisksWarnings = relevantInfectionsRisksWarnings;
	}

	public String getSummaryOfInpatientEpisode() {
		return summaryOfInpatientEpisode;
	}
	public void setSummaryOfInpatientEpisode(String summaryOfInpatientEpisode) {
		this.summaryOfInpatientEpisode = summaryOfInpatientEpisode;
	}

	public String getRelevantInvsAndResults() {
		return relevantInvsAndResults;
	}
	public void setRelevantInvsAndResults(String relevantInvsAndResults) {
		this.relevantInvsAndResults = relevantInvsAndResults;
	}

	public String getPendingResultsComments() {
		return pendingResultsComments;
	}
	public void setPendingResultsComments(String pendingResultsComments) {
		this.pendingResultsComments = pendingResultsComments;
	}

	public String getRelevantTreatmentsAndChanges() {
		return relevantTreatmentsAndChanges;
	}
	public void setRelevantTreatmentsAndChanges(String relevantTreatmentsAndChanges) {
		this.relevantTreatmentsAndChanges = relevantTreatmentsAndChanges;
	}

	public String getSchoolNursery() {
		return schoolNursery;
	}
	public void setSchoolNursery(String schoolNursery) {
		if ( null != schoolNursery && schoolNursery.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for schoolNursery. Tried to set value: "+
				schoolNursery);
		}
		this.schoolNursery = schoolNursery;
	}

	public Boolean isIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
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
		auditStr.append("\r\n*presentingComplaints* :");
		auditStr.append(presentingComplaints);
	    auditStr.append("; ");
		auditStr.append("\r\n*summaryOfAdmission* :");
		auditStr.append(summaryOfAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationComments* :");
		auditStr.append(investigationComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantTreatments* :");
		auditStr.append(relevantTreatments);
	    auditStr.append("; ");
		auditStr.append("\r\n*additionalComments* :");
		auditStr.append(additionalComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*results* :");
		if (results != null)
		{
			java.util.Iterator it7 = results.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)it7.next();
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
		auditStr.append("\r\n*patientAlerts* :");
		if (patientAlerts != null)
		{
		int i8=0;
		for (i8=0; i8<patientAlerts.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientAlert obj = (ims.core.clinical.domain.objects.PatientAlert)patientAlerts.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForAdmissionAndPresentingComplaints* :");
		auditStr.append(reasonForAdmissionAndPresentingComplaints);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantInfectionsRisksWarnings* :");
		auditStr.append(relevantInfectionsRisksWarnings);
	    auditStr.append("; ");
		auditStr.append("\r\n*summaryOfInpatientEpisode* :");
		auditStr.append(summaryOfInpatientEpisode);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantInvsAndResults* :");
		auditStr.append(relevantInvsAndResults);
	    auditStr.append("; ");
		auditStr.append("\r\n*pendingResultsComments* :");
		auditStr.append(pendingResultsComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*relevantTreatmentsAndChanges* :");
		auditStr.append(relevantTreatmentsAndChanges);
	    auditStr.append("; ");
		auditStr.append("\r\n*schoolNursery* :");
		auditStr.append(schoolNursery);
	    auditStr.append("; ");
		auditStr.append("\r\n*isComplete* :");
		auditStr.append(isComplete);
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
		
		String keyClassName = "DischargeClinicalInformation";
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
		if (this.getPresentingComplaints() != null)
		{
			sb.append("<presentingComplaints>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPresentingComplaints().toString()));
			sb.append("</presentingComplaints>");		
		}
		if (this.getSummaryOfAdmission() != null)
		{
			sb.append("<summaryOfAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSummaryOfAdmission().toString()));
			sb.append("</summaryOfAdmission>");		
		}
		if (this.getInvestigationComments() != null)
		{
			sb.append("<investigationComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvestigationComments().toString()));
			sb.append("</investigationComments>");		
		}
		if (this.getRelevantTreatments() != null)
		{
			sb.append("<relevantTreatments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelevantTreatments().toString()));
			sb.append("</relevantTreatments>");		
		}
		if (this.getAdditionalComments() != null)
		{
			sb.append("<additionalComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdditionalComments().toString()));
			sb.append("</additionalComments>");		
		}
		if (this.getResults() != null)
		{
			if (this.getResults().size() > 0 )
			{
			sb.append("<results>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResults(), domMap));
			sb.append("</results>");		
			}
		}
		if (this.getPatientAlerts() != null)
		{
			if (this.getPatientAlerts().size() > 0 )
			{
			sb.append("<patientAlerts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientAlerts(), domMap));
			sb.append("</patientAlerts>");		
			}
		}
		if (this.getReasonForAdmissionAndPresentingComplaints() != null)
		{
			sb.append("<reasonForAdmissionAndPresentingComplaints>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForAdmissionAndPresentingComplaints().toString()));
			sb.append("</reasonForAdmissionAndPresentingComplaints>");		
		}
		if (this.getRelevantInfectionsRisksWarnings() != null)
		{
			sb.append("<relevantInfectionsRisksWarnings>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelevantInfectionsRisksWarnings().toString()));
			sb.append("</relevantInfectionsRisksWarnings>");		
		}
		if (this.getSummaryOfInpatientEpisode() != null)
		{
			sb.append("<summaryOfInpatientEpisode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSummaryOfInpatientEpisode().toString()));
			sb.append("</summaryOfInpatientEpisode>");		
		}
		if (this.getRelevantInvsAndResults() != null)
		{
			sb.append("<relevantInvsAndResults>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelevantInvsAndResults().toString()));
			sb.append("</relevantInvsAndResults>");		
		}
		if (this.getPendingResultsComments() != null)
		{
			sb.append("<pendingResultsComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPendingResultsComments().toString()));
			sb.append("</pendingResultsComments>");		
		}
		if (this.getRelevantTreatmentsAndChanges() != null)
		{
			sb.append("<relevantTreatmentsAndChanges>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelevantTreatmentsAndChanges().toString()));
			sb.append("</relevantTreatmentsAndChanges>");		
		}
		if (this.getSchoolNursery() != null)
		{
			sb.append("<schoolNursery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSchoolNursery().toString()));
			sb.append("</schoolNursery>");		
		}
		if (this.isIsComplete() != null)
		{
			sb.append("<isComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComplete().toString()));
			sb.append("</isComplete>");		
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
			DischargeClinicalInformation domainObject = getDischargeClinicalInformationfromXML(itemEl, factory, domMap);

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
			DischargeClinicalInformation domainObject = getDischargeClinicalInformationfromXML(itemEl, factory, domMap);

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
		
	public static DischargeClinicalInformation getDischargeClinicalInformationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeClinicalInformationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeClinicalInformation getDischargeClinicalInformationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeClinicalInformation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeClinicalInformation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeClinicalInformation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeClinicalInformation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeClinicalInformation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeClinicalInformation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeClinicalInformation)factory.getImportedDomainObject(DischargeClinicalInformation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeClinicalInformation();
		}
		String keyClassName = "DischargeClinicalInformation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeClinicalInformation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeClinicalInformation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("presentingComplaints");
		if(fldEl != null)
		{	
    		obj.setPresentingComplaints(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("summaryOfAdmission");
		if(fldEl != null)
		{	
    		obj.setSummaryOfAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationComments");
		if(fldEl != null)
		{	
    		obj.setInvestigationComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantTreatments");
		if(fldEl != null)
		{	
    		obj.setRelevantTreatments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("additionalComments");
		if(fldEl != null)
		{	
    		obj.setAdditionalComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("results");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setResults(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromSetXMLString(fldEl, factory, obj.getResults(), domMap));
		}
		fldEl = el.element("patientAlerts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientAlerts(ims.core.clinical.domain.objects.PatientAlert.fromListXMLString(fldEl, factory, obj.getPatientAlerts(), domMap));
		}
		fldEl = el.element("reasonForAdmissionAndPresentingComplaints");
		if(fldEl != null)
		{	
    		obj.setReasonForAdmissionAndPresentingComplaints(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantInfectionsRisksWarnings");
		if(fldEl != null)
		{	
    		obj.setRelevantInfectionsRisksWarnings(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("summaryOfInpatientEpisode");
		if(fldEl != null)
		{	
    		obj.setSummaryOfInpatientEpisode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantInvsAndResults");
		if(fldEl != null)
		{	
    		obj.setRelevantInvsAndResults(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pendingResultsComments");
		if(fldEl != null)
		{	
    		obj.setPendingResultsComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relevantTreatmentsAndChanges");
		if(fldEl != null)
		{	
    		obj.setRelevantTreatmentsAndChanges(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("schoolNursery");
		if(fldEl != null)
		{	
    		obj.setSchoolNursery(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isComplete");
		if(fldEl != null)
		{	
    		obj.setIsComplete(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "results"
		, "patientAlerts"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String PresentingComplaints = "presentingComplaints";
		public static final String SummaryOfAdmission = "summaryOfAdmission";
		public static final String InvestigationComments = "investigationComments";
		public static final String RelevantTreatments = "relevantTreatments";
		public static final String AdditionalComments = "additionalComments";
		public static final String Results = "results";
		public static final String PatientAlerts = "patientAlerts";
		public static final String ReasonForAdmissionAndPresentingComplaints = "reasonForAdmissionAndPresentingComplaints";
		public static final String RelevantInfectionsRisksWarnings = "relevantInfectionsRisksWarnings";
		public static final String SummaryOfInpatientEpisode = "summaryOfInpatientEpisode";
		public static final String RelevantInvsAndResults = "relevantInvsAndResults";
		public static final String PendingResultsComments = "pendingResultsComments";
		public static final String RelevantTreatmentsAndChanges = "relevantTreatmentsAndChanges";
		public static final String SchoolNursery = "schoolNursery";
		public static final String IsComplete = "isComplete";
	}
}

