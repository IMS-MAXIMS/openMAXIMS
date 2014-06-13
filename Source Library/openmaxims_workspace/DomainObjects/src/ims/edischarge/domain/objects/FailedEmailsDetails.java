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
 * @author Catalin Tomozei
 * Generated.
 */


public class FailedEmailsDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100011;
	private static final long serialVersionUID = 1099100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** GP Name */
	private String gPName;
	/** GP Email address */
	private String emailAddress;
	/** Initial sent DateTime */
	private java.util.Date initialDateTime;
	/** Failed DateTime */
	private java.util.Date failedDateTime;
	/** Successful DateTime */
	private java.util.Date successfulDateTime;
	/** Generated Leetter Path */
	private String filePath;
	/** Patient Name */
	private String patientName;
	/** Job Type */
	private ims.domain.lookups.LookupInstance jobType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FailedEmailsDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FailedEmailsDetails ()
    {
    	super();
    }
    public FailedEmailsDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.FailedEmailsDetails.class;
	}


	public String getGPName() {
		return gPName;
	}
	public void setGPName(String gPName) {
		if ( null != gPName && gPName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gPName. Tried to set value: "+
				gPName);
		}
		this.gPName = gPName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		if ( null != emailAddress && emailAddress.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for emailAddress. Tried to set value: "+
				emailAddress);
		}
		this.emailAddress = emailAddress;
	}

	public java.util.Date getInitialDateTime() {
		return initialDateTime;
	}
	public void setInitialDateTime(java.util.Date initialDateTime) {
		this.initialDateTime = initialDateTime;
	}

	public java.util.Date getFailedDateTime() {
		return failedDateTime;
	}
	public void setFailedDateTime(java.util.Date failedDateTime) {
		this.failedDateTime = failedDateTime;
	}

	public java.util.Date getSuccessfulDateTime() {
		return successfulDateTime;
	}
	public void setSuccessfulDateTime(java.util.Date successfulDateTime) {
		this.successfulDateTime = successfulDateTime;
	}

	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		if ( null != filePath && filePath.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for filePath. Tried to set value: "+
				filePath);
		}
		this.filePath = filePath;
	}

	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		if ( null != patientName && patientName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientName. Tried to set value: "+
				patientName);
		}
		this.patientName = patientName;
	}

	public ims.domain.lookups.LookupInstance getJobType() {
		return jobType;
	}
	public void setJobType(ims.domain.lookups.LookupInstance jobType) {
		this.jobType = jobType;
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
		
		auditStr.append("\r\n*gPName* :");
		auditStr.append(gPName);
	    auditStr.append("; ");
		auditStr.append("\r\n*emailAddress* :");
		auditStr.append(emailAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*initialDateTime* :");
		auditStr.append(initialDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*failedDateTime* :");
		auditStr.append(failedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*successfulDateTime* :");
		auditStr.append(successfulDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*filePath* :");
		auditStr.append(filePath);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientName* :");
		auditStr.append(patientName);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobType* :");
		if (jobType != null)
			auditStr.append(jobType.getText());
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
		
		String keyClassName = "FailedEmailsDetails";
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
		if (this.getGPName() != null)
		{
			sb.append("<gPName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGPName().toString()));
			sb.append("</gPName>");		
		}
		if (this.getEmailAddress() != null)
		{
			sb.append("<emailAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEmailAddress().toString()));
			sb.append("</emailAddress>");		
		}
		if (this.getInitialDateTime() != null)
		{
			sb.append("<initialDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getInitialDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</initialDateTime>");		
		}
		if (this.getFailedDateTime() != null)
		{
			sb.append("<failedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getFailedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</failedDateTime>");		
		}
		if (this.getSuccessfulDateTime() != null)
		{
			sb.append("<successfulDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSuccessfulDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</successfulDateTime>");		
		}
		if (this.getFilePath() != null)
		{
			sb.append("<filePath>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFilePath().toString()));
			sb.append("</filePath>");		
		}
		if (this.getPatientName() != null)
		{
			sb.append("<patientName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientName().toString()));
			sb.append("</patientName>");		
		}
		if (this.getJobType() != null)
		{
			sb.append("<jobType>");
			sb.append(this.getJobType().toXMLString()); 
			sb.append("</jobType>");		
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
			FailedEmailsDetails domainObject = getFailedEmailsDetailsfromXML(itemEl, factory, domMap);

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
			FailedEmailsDetails domainObject = getFailedEmailsDetailsfromXML(itemEl, factory, domMap);

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
		
	public static FailedEmailsDetails getFailedEmailsDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFailedEmailsDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FailedEmailsDetails getFailedEmailsDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FailedEmailsDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FailedEmailsDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FailedEmailsDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FailedEmailsDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FailedEmailsDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FailedEmailsDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FailedEmailsDetails)factory.getImportedDomainObject(FailedEmailsDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FailedEmailsDetails();
		}
		String keyClassName = "FailedEmailsDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FailedEmailsDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FailedEmailsDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("gPName");
		if(fldEl != null)
		{	
    		obj.setGPName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("emailAddress");
		if(fldEl != null)
		{	
    		obj.setEmailAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("initialDateTime");
		if(fldEl != null)
		{	
    		obj.setInitialDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("failedDateTime");
		if(fldEl != null)
		{	
    		obj.setFailedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("successfulDateTime");
		if(fldEl != null)
		{	
    		obj.setSuccessfulDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("filePath");
		if(fldEl != null)
		{	
    		obj.setFilePath(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientName");
		if(fldEl != null)
		{	
    		obj.setPatientName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("jobType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setJobType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String GPName = "gPName";
		public static final String EmailAddress = "emailAddress";
		public static final String InitialDateTime = "initialDateTime";
		public static final String FailedDateTime = "failedDateTime";
		public static final String SuccessfulDateTime = "successfulDateTime";
		public static final String FilePath = "filePath";
		public static final String PatientName = "patientName";
		public static final String JobType = "jobType";
	}
}

