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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ClinicalResultDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100009;
	private static final long serialVersionUID = 1070100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ExamDateTime */
	private java.util.Date examDateTime;
	/** ExamTimeSupplied */
	private Boolean examTimeSupplied;
	/** Authoring Radiologist Name */
	private String authoringRadiologistName;
	/** Verifying Radiologist Name */
	private String verifyingRadiologistName;
	/** Radiographer Name */
	private String radiographerName;
	/** Transcription Secretary Name */
	private String transcriberName;
	/** ReportText */
	private String reportText;
	/** Result Comments
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultComment.
	  */
	private java.util.List resultComments;
	/** Result Report */
	private ims.core.documents.domain.objects.PatientDocument resultReport;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalResultDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalResultDetail ()
    {
    	super();
    }
    public ClinicalResultDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.ClinicalResultDetail.class;
	}


	public java.util.Date getExamDateTime() {
		return examDateTime;
	}
	public void setExamDateTime(java.util.Date examDateTime) {
		this.examDateTime = examDateTime;
	}

	public Boolean isExamTimeSupplied() {
		return examTimeSupplied;
	}
	public void setExamTimeSupplied(Boolean examTimeSupplied) {
		this.examTimeSupplied = examTimeSupplied;
	}

	public String getAuthoringRadiologistName() {
		return authoringRadiologistName;
	}
	public void setAuthoringRadiologistName(String authoringRadiologistName) {
		if ( null != authoringRadiologistName && authoringRadiologistName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for authoringRadiologistName. Tried to set value: "+
				authoringRadiologistName);
		}
		this.authoringRadiologistName = authoringRadiologistName;
	}

	public String getVerifyingRadiologistName() {
		return verifyingRadiologistName;
	}
	public void setVerifyingRadiologistName(String verifyingRadiologistName) {
		if ( null != verifyingRadiologistName && verifyingRadiologistName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for verifyingRadiologistName. Tried to set value: "+
				verifyingRadiologistName);
		}
		this.verifyingRadiologistName = verifyingRadiologistName;
	}

	public String getRadiographerName() {
		return radiographerName;
	}
	public void setRadiographerName(String radiographerName) {
		if ( null != radiographerName && radiographerName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for radiographerName. Tried to set value: "+
				radiographerName);
		}
		this.radiographerName = radiographerName;
	}

	public String getTranscriberName() {
		return transcriberName;
	}
	public void setTranscriberName(String transcriberName) {
		if ( null != transcriberName && transcriberName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transcriberName. Tried to set value: "+
				transcriberName);
		}
		this.transcriberName = transcriberName;
	}

	public String getReportText() {
		return reportText;
	}
	public void setReportText(String reportText) {
		this.reportText = reportText;
	}

	public java.util.List getResultComments() {
		if ( null == resultComments ) {
			resultComments = new java.util.ArrayList();
		}
		return resultComments;
	}
	public void setResultComments(java.util.List paramValue) {
		this.resultComments = paramValue;
	}

	public ims.core.documents.domain.objects.PatientDocument getResultReport() {
		return resultReport;
	}
	public void setResultReport(ims.core.documents.domain.objects.PatientDocument resultReport) {
		this.resultReport = resultReport;
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
		
		auditStr.append("\r\n*examDateTime* :");
		auditStr.append(examDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*examTimeSupplied* :");
		auditStr.append(examTimeSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringRadiologistName* :");
		auditStr.append(authoringRadiologistName);
	    auditStr.append("; ");
		auditStr.append("\r\n*verifyingRadiologistName* :");
		auditStr.append(verifyingRadiologistName);
	    auditStr.append("; ");
		auditStr.append("\r\n*radiographerName* :");
		auditStr.append(radiographerName);
	    auditStr.append("; ");
		auditStr.append("\r\n*transcriberName* :");
		auditStr.append(transcriberName);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportText* :");
		auditStr.append(reportText);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultComments* :");
		if (resultComments != null)
		{
		int i8=0;
		for (i8=0; i8<resultComments.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.ResultComment obj = (ims.ocrr.orderingresults.domain.objects.ResultComment)resultComments.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*resultReport* :");
		if (resultReport != null)
		{
			auditStr.append(toShortClassName(resultReport));
				
		    auditStr.append(resultReport.getId());
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
		
		String keyClassName = "ClinicalResultDetail";
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
		if (this.getExamDateTime() != null)
		{
			sb.append("<examDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getExamDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</examDateTime>");		
		}
		if (this.isExamTimeSupplied() != null)
		{
			sb.append("<examTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isExamTimeSupplied().toString()));
			sb.append("</examTimeSupplied>");		
		}
		if (this.getAuthoringRadiologistName() != null)
		{
			sb.append("<authoringRadiologistName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAuthoringRadiologistName().toString()));
			sb.append("</authoringRadiologistName>");		
		}
		if (this.getVerifyingRadiologistName() != null)
		{
			sb.append("<verifyingRadiologistName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVerifyingRadiologistName().toString()));
			sb.append("</verifyingRadiologistName>");		
		}
		if (this.getRadiographerName() != null)
		{
			sb.append("<radiographerName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRadiographerName().toString()));
			sb.append("</radiographerName>");		
		}
		if (this.getTranscriberName() != null)
		{
			sb.append("<transcriberName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTranscriberName().toString()));
			sb.append("</transcriberName>");		
		}
		if (this.getReportText() != null)
		{
			sb.append("<reportText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportText().toString()));
			sb.append("</reportText>");		
		}
		if (this.getResultComments() != null)
		{
			if (this.getResultComments().size() > 0 )
			{
			sb.append("<resultComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultComments(), domMap));
			sb.append("</resultComments>");		
			}
		}
		if (this.getResultReport() != null)
		{
			sb.append("<resultReport>");
			sb.append(this.getResultReport().toXMLString(domMap)); 	
			sb.append("</resultReport>");		
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
			ClinicalResultDetail domainObject = getClinicalResultDetailfromXML(itemEl, factory, domMap);

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
			ClinicalResultDetail domainObject = getClinicalResultDetailfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalResultDetail getClinicalResultDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalResultDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalResultDetail getClinicalResultDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalResultDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalResultDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalResultDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalResultDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalResultDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalResultDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalResultDetail)factory.getImportedDomainObject(ClinicalResultDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalResultDetail();
		}
		String keyClassName = "ClinicalResultDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalResultDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalResultDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("examDateTime");
		if(fldEl != null)
		{	
    		obj.setExamDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("examTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setExamTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringRadiologistName");
		if(fldEl != null)
		{	
    		obj.setAuthoringRadiologistName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("verifyingRadiologistName");
		if(fldEl != null)
		{	
    		obj.setVerifyingRadiologistName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("radiographerName");
		if(fldEl != null)
		{	
    		obj.setRadiographerName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transcriberName");
		if(fldEl != null)
		{	
    		obj.setTranscriberName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportText");
		if(fldEl != null)
		{	
    		obj.setReportText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setResultComments(ims.ocrr.orderingresults.domain.objects.ResultComment.fromListXMLString(fldEl, factory, obj.getResultComments(), domMap));
		}
		fldEl = el.element("resultReport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResultReport(ims.core.documents.domain.objects.PatientDocument.getPatientDocumentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "resultComments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ExamDateTime = "examDateTime";
		public static final String ExamTimeSupplied = "examTimeSupplied";
		public static final String AuthoringRadiologistName = "authoringRadiologistName";
		public static final String VerifyingRadiologistName = "verifyingRadiologistName";
		public static final String RadiographerName = "radiographerName";
		public static final String TranscriberName = "transcriberName";
		public static final String ReportText = "reportText";
		public static final String ResultComments = "resultComments";
		public static final String ResultReport = "resultReport";
	}
}

