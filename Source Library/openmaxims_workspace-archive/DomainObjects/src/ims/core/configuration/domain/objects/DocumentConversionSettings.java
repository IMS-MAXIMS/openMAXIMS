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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class DocumentConversionSettings extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1028100062;
	private static final long serialVersionUID = 1028100062L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}
	@Override
	public boolean shouldFireRules()
	{
		return false;
	}

	/** Configured Job Id Instance */
	private ims.core.configuration.domain.objects.ConfiguredJob configuredJob;
	/** Server Address */
	private String server;
	/** Server Port */
	private Integer serverPort;
	/** Database Name */
	private String databaseName;
	/** Database Username */
	private String databaseUsername;
	/** Database Password */
	private String databasePassword;
	/** File path */
	private String filesPath;
	/** Run conversion for all records */
	private Boolean allRecords;
	/** Document conversion end date */
	private java.util.Date fromDate;
	/** Document conversion start date */
	private java.util.Date toDate;
    public DocumentConversionSettings (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DocumentConversionSettings ()
    {
    	super();
    }
    public DocumentConversionSettings (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.DocumentConversionSettings.class;
	}


	public ims.core.configuration.domain.objects.ConfiguredJob getConfiguredJob() {
		return configuredJob;
	}
	public static DocumentConversionSettings getDocumentConversionSettingsFromConfiguredJob(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from DocumentConversionSettings c where c.configuredJob.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. DocumentConversionSettings.configuredJob.id = " + id + " returned " + l.size() + " records. " );
		return (DocumentConversionSettings)l.get(0);
	}
	public void setConfiguredJob(ims.core.configuration.domain.objects.ConfiguredJob configuredJob) {
		this.configuredJob = configuredJob;
	}

	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		if ( null != server && server.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for server. Tried to set value: "+
				server);
		}
		this.server = server;
	}

	public Integer getServerPort() {
		return serverPort;
	}
	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}

	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		if ( null != databaseName && databaseName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for databaseName. Tried to set value: "+
				databaseName);
		}
		this.databaseName = databaseName;
	}

	public String getDatabaseUsername() {
		return databaseUsername;
	}
	public void setDatabaseUsername(String databaseUsername) {
		if ( null != databaseUsername && databaseUsername.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for databaseUsername. Tried to set value: "+
				databaseUsername);
		}
		this.databaseUsername = databaseUsername;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(String databasePassword) {
		if ( null != databasePassword && databasePassword.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for databasePassword. Tried to set value: "+
				databasePassword);
		}
		this.databasePassword = databasePassword;
	}

	public String getFilesPath() {
		return filesPath;
	}
	public void setFilesPath(String filesPath) {
		if ( null != filesPath && filesPath.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for filesPath. Tried to set value: "+
				filesPath);
		}
		this.filesPath = filesPath;
	}

	public Boolean isAllRecords() {
		return allRecords;
	}
	public void setAllRecords(Boolean allRecords) {
		this.allRecords = allRecords;
	}

	public java.util.Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}

	public java.util.Date getToDate() {
		return toDate;
	}
	public void setToDate(java.util.Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*configuredJob* :");
		if (configuredJob != null)
		{
			auditStr.append(toShortClassName(configuredJob));
				
		    auditStr.append(configuredJob.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*server* :");
		auditStr.append(server);
	    auditStr.append("; ");
		auditStr.append("\r\n*serverPort* :");
		auditStr.append(serverPort);
	    auditStr.append("; ");
		auditStr.append("\r\n*databaseName* :");
		auditStr.append(databaseName);
	    auditStr.append("; ");
		auditStr.append("\r\n*databaseUsername* :");
		auditStr.append(databaseUsername);
	    auditStr.append("; ");
		auditStr.append("\r\n*databasePassword* :");
		auditStr.append(databasePassword);
	    auditStr.append("; ");
		auditStr.append("\r\n*filesPath* :");
		auditStr.append(filesPath);
	    auditStr.append("; ");
		auditStr.append("\r\n*allRecords* :");
		auditStr.append(allRecords);
	    auditStr.append("; ");
		auditStr.append("\r\n*fromDate* :");
		auditStr.append(fromDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*toDate* :");
		auditStr.append(toDate);
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
		
		String keyClassName = "DocumentConversionSettings";
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
		if (this.getConfiguredJob() != null)
		{
			sb.append("<configuredJob>");
			sb.append(this.getConfiguredJob().toXMLString(domMap)); 	
			sb.append("</configuredJob>");		
		}
		if (this.getServer() != null)
		{
			sb.append("<server>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getServer().toString()));
			sb.append("</server>");		
		}
		if (this.getServerPort() != null)
		{
			sb.append("<serverPort>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getServerPort().toString()));
			sb.append("</serverPort>");		
		}
		if (this.getDatabaseName() != null)
		{
			sb.append("<databaseName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDatabaseName().toString()));
			sb.append("</databaseName>");		
		}
		if (this.getDatabaseUsername() != null)
		{
			sb.append("<databaseUsername>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDatabaseUsername().toString()));
			sb.append("</databaseUsername>");		
		}
		if (this.getDatabasePassword() != null)
		{
			sb.append("<databasePassword>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDatabasePassword().toString()));
			sb.append("</databasePassword>");		
		}
		if (this.getFilesPath() != null)
		{
			sb.append("<filesPath>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFilesPath().toString()));
			sb.append("</filesPath>");		
		}
		if (this.isAllRecords() != null)
		{
			sb.append("<allRecords>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllRecords().toString()));
			sb.append("</allRecords>");		
		}
		if (this.getFromDate() != null)
		{
			sb.append("<fromDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFromDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</fromDate>");		
		}
		if (this.getToDate() != null)
		{
			sb.append("<toDate>");
			sb.append(new ims.framework.utils.DateTime(this.getToDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</toDate>");		
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
			DocumentConversionSettings domainObject = getDocumentConversionSettingsfromXML(itemEl, factory, domMap);

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
			DocumentConversionSettings domainObject = getDocumentConversionSettingsfromXML(itemEl, factory, domMap);

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
		
	public static DocumentConversionSettings getDocumentConversionSettingsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDocumentConversionSettingsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DocumentConversionSettings getDocumentConversionSettingsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DocumentConversionSettings.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DocumentConversionSettings.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DocumentConversionSettings class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DocumentConversionSettings)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DocumentConversionSettings.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DocumentConversionSettings ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DocumentConversionSettings)factory.getImportedDomainObject(DocumentConversionSettings.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DocumentConversionSettings();
		}
		String keyClassName = "DocumentConversionSettings";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DocumentConversionSettings)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DocumentConversionSettings obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("configuredJob");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfiguredJob(ims.core.configuration.domain.objects.ConfiguredJob.getConfiguredJobfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("server");
		if(fldEl != null)
		{	
    		obj.setServer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serverPort");
		if(fldEl != null)
		{	
    		obj.setServerPort(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("databaseName");
		if(fldEl != null)
		{	
    		obj.setDatabaseName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("databaseUsername");
		if(fldEl != null)
		{	
    		obj.setDatabaseUsername(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("databasePassword");
		if(fldEl != null)
		{	
    		obj.setDatabasePassword(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("filesPath");
		if(fldEl != null)
		{	
    		obj.setFilesPath(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allRecords");
		if(fldEl != null)
		{	
    		obj.setAllRecords(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fromDate");
		if(fldEl != null)
		{	
    		obj.setFromDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("toDate");
		if(fldEl != null)
		{	
    		obj.setToDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String ConfiguredJob = "configuredJob";
		public static final String Server = "server";
		public static final String ServerPort = "serverPort";
		public static final String DatabaseName = "databaseName";
		public static final String DatabaseUsername = "databaseUsername";
		public static final String DatabasePassword = "databasePassword";
		public static final String FilesPath = "filesPath";
		public static final String AllRecords = "allRecords";
		public static final String FromDate = "fromDate";
		public static final String ToDate = "toDate";
	}
}

