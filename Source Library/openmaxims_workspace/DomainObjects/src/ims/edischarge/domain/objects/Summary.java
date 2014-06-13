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


public class Summary extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100018;
	private static final long serialVersionUID = 1099100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** DischargeLetterStatus */
	private ims.domain.lookups.LookupInstance dischargeLetterStatus;
	/** Admission Date Time */
	private java.util.Date admissionDateTime;
	/** Status */
	private ims.domain.lookups.LookupInstance tTAStatus;
	/** Has Had Any Procedures Performed */
	private ims.domain.lookups.LookupInstance hasHadAnyProceduresPerformed;
	/** Additonal Clinical Information */
	private ims.domain.lookups.LookupInstance additonalClinicalInfo;
	/** Discharge Supplementary Letter Status */
	private ims.domain.lookups.LookupInstance dischargeSupplementaryLetterStatus;
	/** SummaryDetails
	  * Collection of ims.edischarge.domain.objects.SummaryDetail.
	  */
	private java.util.List summaryDetails;
	/** DischargeDocuments
	  * Collection of ims.core.documents.domain.objects.PatientDocument.
	  */
	private java.util.Set dischargeDocuments;
	/** Discharge Details */
	private ims.edischarge.domain.objects.DischargeDetails dischargeDetails;
	/** Patient Was Discharged and then an undo discharge was performed */
	private Boolean wasPatientDischargedThenUndone;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Summary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Summary ()
    {
    	super();
    }
    public Summary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.Summary.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getDischargeLetterStatus() {
		return dischargeLetterStatus;
	}
	public void setDischargeLetterStatus(ims.domain.lookups.LookupInstance dischargeLetterStatus) {
		this.dischargeLetterStatus = dischargeLetterStatus;
	}

	public java.util.Date getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setAdmissionDateTime(java.util.Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public ims.domain.lookups.LookupInstance getTTAStatus() {
		return tTAStatus;
	}
	public void setTTAStatus(ims.domain.lookups.LookupInstance tTAStatus) {
		this.tTAStatus = tTAStatus;
	}

	public ims.domain.lookups.LookupInstance getHasHadAnyProceduresPerformed() {
		return hasHadAnyProceduresPerformed;
	}
	public void setHasHadAnyProceduresPerformed(ims.domain.lookups.LookupInstance hasHadAnyProceduresPerformed) {
		this.hasHadAnyProceduresPerformed = hasHadAnyProceduresPerformed;
	}

	public ims.domain.lookups.LookupInstance getAdditonalClinicalInfo() {
		return additonalClinicalInfo;
	}
	public void setAdditonalClinicalInfo(ims.domain.lookups.LookupInstance additonalClinicalInfo) {
		this.additonalClinicalInfo = additonalClinicalInfo;
	}

	public ims.domain.lookups.LookupInstance getDischargeSupplementaryLetterStatus() {
		return dischargeSupplementaryLetterStatus;
	}
	public void setDischargeSupplementaryLetterStatus(ims.domain.lookups.LookupInstance dischargeSupplementaryLetterStatus) {
		this.dischargeSupplementaryLetterStatus = dischargeSupplementaryLetterStatus;
	}

	public java.util.List getSummaryDetails() {
		if ( null == summaryDetails ) {
			summaryDetails = new java.util.ArrayList();
		}
		return summaryDetails;
	}
	public void setSummaryDetails(java.util.List paramValue) {
		this.summaryDetails = paramValue;
	}

	public java.util.Set getDischargeDocuments() {
		if ( null == dischargeDocuments ) {
			dischargeDocuments = new java.util.HashSet();
		}
		return dischargeDocuments;
	}
	public void setDischargeDocuments(java.util.Set paramValue) {
		this.dischargeDocuments = paramValue;
	}

	public ims.edischarge.domain.objects.DischargeDetails getDischargeDetails() {
		return dischargeDetails;
	}
	public void setDischargeDetails(ims.edischarge.domain.objects.DischargeDetails dischargeDetails) {
		this.dischargeDetails = dischargeDetails;
	}

	public Boolean isWasPatientDischargedThenUndone() {
		return wasPatientDischargedThenUndone;
	}
	public void setWasPatientDischargedThenUndone(Boolean wasPatientDischargedThenUndone) {
		this.wasPatientDischargedThenUndone = wasPatientDischargedThenUndone;
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
		auditStr.append("\r\n*dischargeLetterStatus* :");
		if (dischargeLetterStatus != null)
			auditStr.append(dischargeLetterStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDateTime* :");
		auditStr.append(admissionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*tTAStatus* :");
		if (tTAStatus != null)
			auditStr.append(tTAStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hasHadAnyProceduresPerformed* :");
		if (hasHadAnyProceduresPerformed != null)
			auditStr.append(hasHadAnyProceduresPerformed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*additonalClinicalInfo* :");
		if (additonalClinicalInfo != null)
			auditStr.append(additonalClinicalInfo.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeSupplementaryLetterStatus* :");
		if (dischargeSupplementaryLetterStatus != null)
			auditStr.append(dischargeSupplementaryLetterStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*summaryDetails* :");
		if (summaryDetails != null)
		{
		int i8=0;
		for (i8=0; i8<summaryDetails.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.edischarge.domain.objects.SummaryDetail obj = (ims.edischarge.domain.objects.SummaryDetail)summaryDetails.get(i8);
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
		auditStr.append("\r\n*dischargeDocuments* :");
		if (dischargeDocuments != null)
		{
			java.util.Iterator it9 = dischargeDocuments.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.documents.domain.objects.PatientDocument obj = (ims.core.documents.domain.objects.PatientDocument)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDetails* :");
		if (dischargeDetails != null)
		{
			auditStr.append(toShortClassName(dischargeDetails));
				
		    auditStr.append(dischargeDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPatientDischargedThenUndone* :");
		auditStr.append(wasPatientDischargedThenUndone);
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
		
		String keyClassName = "Summary";
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
		if (this.getDischargeLetterStatus() != null)
		{
			sb.append("<dischargeLetterStatus>");
			sb.append(this.getDischargeLetterStatus().toXMLString()); 
			sb.append("</dischargeLetterStatus>");		
		}
		if (this.getAdmissionDateTime() != null)
		{
			sb.append("<admissionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDateTime>");		
		}
		if (this.getTTAStatus() != null)
		{
			sb.append("<tTAStatus>");
			sb.append(this.getTTAStatus().toXMLString()); 
			sb.append("</tTAStatus>");		
		}
		if (this.getHasHadAnyProceduresPerformed() != null)
		{
			sb.append("<hasHadAnyProceduresPerformed>");
			sb.append(this.getHasHadAnyProceduresPerformed().toXMLString()); 
			sb.append("</hasHadAnyProceduresPerformed>");		
		}
		if (this.getAdditonalClinicalInfo() != null)
		{
			sb.append("<additonalClinicalInfo>");
			sb.append(this.getAdditonalClinicalInfo().toXMLString()); 
			sb.append("</additonalClinicalInfo>");		
		}
		if (this.getDischargeSupplementaryLetterStatus() != null)
		{
			sb.append("<dischargeSupplementaryLetterStatus>");
			sb.append(this.getDischargeSupplementaryLetterStatus().toXMLString()); 
			sb.append("</dischargeSupplementaryLetterStatus>");		
		}
		if (this.getSummaryDetails() != null)
		{
			if (this.getSummaryDetails().size() > 0 )
			{
			sb.append("<summaryDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSummaryDetails(), domMap));
			sb.append("</summaryDetails>");		
			}
		}
		if (this.getDischargeDocuments() != null)
		{
			if (this.getDischargeDocuments().size() > 0 )
			{
			sb.append("<dischargeDocuments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDischargeDocuments(), domMap));
			sb.append("</dischargeDocuments>");		
			}
		}
		if (this.getDischargeDetails() != null)
		{
			sb.append("<dischargeDetails>");
			sb.append(this.getDischargeDetails().toXMLString(domMap)); 	
			sb.append("</dischargeDetails>");		
		}
		if (this.isWasPatientDischargedThenUndone() != null)
		{
			sb.append("<wasPatientDischargedThenUndone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPatientDischargedThenUndone().toString()));
			sb.append("</wasPatientDischargedThenUndone>");		
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
			Summary domainObject = getSummaryfromXML(itemEl, factory, domMap);

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
			Summary domainObject = getSummaryfromXML(itemEl, factory, domMap);

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
		
	public static Summary getSummaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSummaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Summary getSummaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Summary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Summary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Summary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Summary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Summary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Summary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Summary)factory.getImportedDomainObject(Summary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Summary();
		}
		String keyClassName = "Summary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Summary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Summary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeLetterStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeLetterStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("tTAStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTTAStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hasHadAnyProceduresPerformed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHasHadAnyProceduresPerformed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("additonalClinicalInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdditonalClinicalInfo(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeSupplementaryLetterStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeSupplementaryLetterStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("summaryDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSummaryDetails(ims.edischarge.domain.objects.SummaryDetail.fromListXMLString(fldEl, factory, obj.getSummaryDetails(), domMap));
		}
		fldEl = el.element("dischargeDocuments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDischargeDocuments(ims.core.documents.domain.objects.PatientDocument.fromSetXMLString(fldEl, factory, obj.getDischargeDocuments(), domMap));
		}
		fldEl = el.element("dischargeDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargeDetails(ims.edischarge.domain.objects.DischargeDetails.getDischargeDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasPatientDischargedThenUndone");
		if(fldEl != null)
		{	
    		obj.setWasPatientDischargedThenUndone(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "summaryDetails"
		, "dischargeDocuments"
		};
	}

	/**
	getSummaryDetailRecord
	*/
/**
 * wdev-12588
 * Gets the summary detail record for the given section type
 * @param sectionType
 * @return
 */
public ims.edischarge.domain.objects.SummaryDetail getSummaryDetailRecord (ims.domain.lookups.LookupInstance sectionType)
{
	if (summaryDetails == null || summaryDetails.size() == 0)
		return null;
	
	// Loop through summary details collection to find the one matching the given section
	for (int i=0; i<summaryDetails.size(); i++)
	{
		ims.edischarge.domain.objects.SummaryDetail summDet = (ims.edischarge.domain.objects.SummaryDetail)summaryDetails.get(i);
		if (summDet.getSection().getId() == sectionType.getId())
		{
			return summDet;
		}
	}
	
	return null;
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String DischargeLetterStatus = "dischargeLetterStatus";
		public static final String AdmissionDateTime = "admissionDateTime";
		public static final String TTAStatus = "tTAStatus";
		public static final String HasHadAnyProceduresPerformed = "hasHadAnyProceduresPerformed";
		public static final String AdditonalClinicalInfo = "additonalClinicalInfo";
		public static final String DischargeSupplementaryLetterStatus = "dischargeSupplementaryLetterStatus";
		public static final String SummaryDetails = "summaryDetails";
		public static final String DischargeDocuments = "dischargeDocuments";
		public static final String DischargeDetails = "dischargeDetails";
		public static final String WasPatientDischargedThenUndone = "wasPatientDischargedThenUndone";
	}
}

