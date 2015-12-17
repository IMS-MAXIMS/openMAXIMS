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


public class DischargeReportDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100004;
	private static final long serialVersionUID = 1099100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Completing HCP */
	private ims.core.resource.people.domain.objects.Hcp completingHCP;
	/** Date of Completion */
	private java.util.Date dateOfCompletion;
	/** GP Recipients
	  * Collection of ims.core.resource.people.domain.objects.Gp.
	  */
	private java.util.Set gpRecipients;
	/** Copy Letter To Patient */
	private Boolean copyLetterToPatient;
	/** Are the Clinical Details Complete */
	private Boolean isClinicalDetailsComplete;
	/** DischargeDocuments
	  * Collection of ims.core.documents.domain.objects.PatientDocument.
	  */
	private java.util.Set dischargeDocuments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeReportDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeReportDetail ()
    {
    	super();
    }
    public DischargeReportDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.DischargeReportDetail.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getCompletingHCP() {
		return completingHCP;
	}
	public void setCompletingHCP(ims.core.resource.people.domain.objects.Hcp completingHCP) {
		this.completingHCP = completingHCP;
	}

	public java.util.Date getDateOfCompletion() {
		return dateOfCompletion;
	}
	public void setDateOfCompletion(java.util.Date dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	public java.util.Set getGpRecipients() {
		if ( null == gpRecipients ) {
			gpRecipients = new java.util.HashSet();
		}
		return gpRecipients;
	}
	public void setGpRecipients(java.util.Set paramValue) {
		this.gpRecipients = paramValue;
	}

	public Boolean isCopyLetterToPatient() {
		return copyLetterToPatient;
	}
	public void setCopyLetterToPatient(Boolean copyLetterToPatient) {
		this.copyLetterToPatient = copyLetterToPatient;
	}

	public Boolean isIsClinicalDetailsComplete() {
		return isClinicalDetailsComplete;
	}
	public void setIsClinicalDetailsComplete(Boolean isClinicalDetailsComplete) {
		this.isClinicalDetailsComplete = isClinicalDetailsComplete;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completingHCP* :");
		if (completingHCP != null)
		{
			auditStr.append(toShortClassName(completingHCP));
				
		    auditStr.append(completingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfCompletion* :");
		auditStr.append(dateOfCompletion);
	    auditStr.append("; ");
		auditStr.append("\r\n*gpRecipients* :");
		if (gpRecipients != null)
		{
			java.util.Iterator it5 = gpRecipients.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.resource.people.domain.objects.Gp obj = (ims.core.resource.people.domain.objects.Gp)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*copyLetterToPatient* :");
		auditStr.append(copyLetterToPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*isClinicalDetailsComplete* :");
		auditStr.append(isClinicalDetailsComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDocuments* :");
		if (dischargeDocuments != null)
		{
			java.util.Iterator it8 = dischargeDocuments.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.core.documents.domain.objects.PatientDocument obj = (ims.core.documents.domain.objects.PatientDocument)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
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
		
		String keyClassName = "DischargeReportDetail";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getCompletingHCP() != null)
		{
			sb.append("<completingHCP>");
			sb.append(this.getCompletingHCP().toXMLString(domMap)); 	
			sb.append("</completingHCP>");		
		}
		if (this.getDateOfCompletion() != null)
		{
			sb.append("<dateOfCompletion>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfCompletion()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfCompletion>");		
		}
		if (this.getGpRecipients() != null)
		{
			if (this.getGpRecipients().size() > 0 )
			{
			sb.append("<gpRecipients>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGpRecipients(), domMap));
			sb.append("</gpRecipients>");		
			}
		}
		if (this.isCopyLetterToPatient() != null)
		{
			sb.append("<copyLetterToPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyLetterToPatient().toString()));
			sb.append("</copyLetterToPatient>");		
		}
		if (this.isIsClinicalDetailsComplete() != null)
		{
			sb.append("<isClinicalDetailsComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsClinicalDetailsComplete().toString()));
			sb.append("</isClinicalDetailsComplete>");		
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
			DischargeReportDetail domainObject = getDischargeReportDetailfromXML(itemEl, factory, domMap);

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
			DischargeReportDetail domainObject = getDischargeReportDetailfromXML(itemEl, factory, domMap);

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
		
	public static DischargeReportDetail getDischargeReportDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeReportDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeReportDetail getDischargeReportDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeReportDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeReportDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeReportDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeReportDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeReportDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeReportDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeReportDetail)factory.getImportedDomainObject(DischargeReportDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeReportDetail();
		}
		String keyClassName = "DischargeReportDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeReportDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeReportDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("completingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateOfCompletion");
		if(fldEl != null)
		{	
    		obj.setDateOfCompletion(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("gpRecipients");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setGpRecipients(ims.core.resource.people.domain.objects.Gp.fromSetXMLString(fldEl, factory, obj.getGpRecipients(), domMap));
		}
		fldEl = el.element("copyLetterToPatient");
		if(fldEl != null)
		{	
    		obj.setCopyLetterToPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isClinicalDetailsComplete");
		if(fldEl != null)
		{	
    		obj.setIsClinicalDetailsComplete(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDocuments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDischargeDocuments(ims.core.documents.domain.objects.PatientDocument.fromSetXMLString(fldEl, factory, obj.getDischargeDocuments(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "gpRecipients"
		, "dischargeDocuments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String CareContext = "careContext";
		public static final String CompletingHCP = "completingHCP";
		public static final String DateOfCompletion = "dateOfCompletion";
		public static final String GpRecipients = "gpRecipients";
		public static final String CopyLetterToPatient = "copyLetterToPatient";
		public static final String IsClinicalDetailsComplete = "isClinicalDetailsComplete";
		public static final String DischargeDocuments = "dischargeDocuments";
	}
}

