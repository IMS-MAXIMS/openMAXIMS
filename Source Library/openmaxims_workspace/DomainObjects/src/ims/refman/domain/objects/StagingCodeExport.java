//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class StagingCodeExport extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100073;
	private static final long serialVersionUID = 1096100073L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ExportDateTime */
	private java.util.Date exportDateTime;
	/** Exported Interface Record Data */
	private String dataExport;
	/** Returned Interface Record Coded Data */
	private String dataImport;
	/** Collection of Procedures/Diagnosis used to form the export
	  * Collection of ims.RefMan.domain.objects.ReferralCodingItem.
	  */
	private java.util.List pushedCodingItems;
	/** ImpotDateTime */
	private java.util.Date importDateTime;
	/** Collection of Procedures/Diagnosis received on the import of data
	  * Collection of ims.RefMan.domain.objects.ReferralCodingItem.
	  */
	private java.util.List receivedCodingItems;
	/** Received Patient Identifier from external coding session */
	private String receivedPatientId;
	/** Received FCE Id from external coding session */
	private String receivedFCEId;
	/** CodingStatus */
	private ims.domain.lookups.LookupInstance codingStatus;
	/** ReceivedCodingStatus */
	private String receivedCodingStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public StagingCodeExport (Integer id, int ver)
    {
    	super(id, ver);
    }
    public StagingCodeExport ()
    {
    	super();
    }
    public StagingCodeExport (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.StagingCodeExport.class;
	}


	public java.util.Date getExportDateTime() {
		return exportDateTime;
	}
	public void setExportDateTime(java.util.Date exportDateTime) {
		this.exportDateTime = exportDateTime;
	}

	public String getDataExport() {
		return dataExport;
	}
	public void setDataExport(String dataExport) {
		this.dataExport = dataExport;
	}

	public String getDataImport() {
		return dataImport;
	}
	public void setDataImport(String dataImport) {
		this.dataImport = dataImport;
	}

	public java.util.List getPushedCodingItems() {
		if ( null == pushedCodingItems ) {
			pushedCodingItems = new java.util.ArrayList();
		}
		return pushedCodingItems;
	}
	public void setPushedCodingItems(java.util.List paramValue) {
		this.pushedCodingItems = paramValue;
	}

	public java.util.Date getImportDateTime() {
		return importDateTime;
	}
	public void setImportDateTime(java.util.Date importDateTime) {
		this.importDateTime = importDateTime;
	}

	public java.util.List getReceivedCodingItems() {
		if ( null == receivedCodingItems ) {
			receivedCodingItems = new java.util.ArrayList();
		}
		return receivedCodingItems;
	}
	public void setReceivedCodingItems(java.util.List paramValue) {
		this.receivedCodingItems = paramValue;
	}

	public String getReceivedPatientId() {
		return receivedPatientId;
	}
	public void setReceivedPatientId(String receivedPatientId) {
		if ( null != receivedPatientId && receivedPatientId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for receivedPatientId. Tried to set value: "+
				receivedPatientId);
		}
		this.receivedPatientId = receivedPatientId;
	}

	public String getReceivedFCEId() {
		return receivedFCEId;
	}
	public void setReceivedFCEId(String receivedFCEId) {
		if ( null != receivedFCEId && receivedFCEId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for receivedFCEId. Tried to set value: "+
				receivedFCEId);
		}
		this.receivedFCEId = receivedFCEId;
	}

	public ims.domain.lookups.LookupInstance getCodingStatus() {
		return codingStatus;
	}
	public void setCodingStatus(ims.domain.lookups.LookupInstance codingStatus) {
		this.codingStatus = codingStatus;
	}

	public String getReceivedCodingStatus() {
		return receivedCodingStatus;
	}
	public void setReceivedCodingStatus(String receivedCodingStatus) {
		if ( null != receivedCodingStatus && receivedCodingStatus.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for receivedCodingStatus. Tried to set value: "+
				receivedCodingStatus);
		}
		this.receivedCodingStatus = receivedCodingStatus;
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
		
		auditStr.append("\r\n*exportDateTime* :");
		auditStr.append(exportDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dataExport* :");
		auditStr.append(dataExport);
	    auditStr.append("; ");
		auditStr.append("\r\n*dataImport* :");
		auditStr.append(dataImport);
	    auditStr.append("; ");
		auditStr.append("\r\n*pushedCodingItems* :");
		if (pushedCodingItems != null)
		{
		int i4=0;
		for (i4=0; i4<pushedCodingItems.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralCodingItem obj = (ims.RefMan.domain.objects.ReferralCodingItem)pushedCodingItems.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*importDateTime* :");
		auditStr.append(importDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*receivedCodingItems* :");
		if (receivedCodingItems != null)
		{
		int i6=0;
		for (i6=0; i6<receivedCodingItems.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralCodingItem obj = (ims.RefMan.domain.objects.ReferralCodingItem)receivedCodingItems.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*receivedPatientId* :");
		auditStr.append(receivedPatientId);
	    auditStr.append("; ");
		auditStr.append("\r\n*receivedFCEId* :");
		auditStr.append(receivedFCEId);
	    auditStr.append("; ");
		auditStr.append("\r\n*codingStatus* :");
		if (codingStatus != null)
			auditStr.append(codingStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*receivedCodingStatus* :");
		auditStr.append(receivedCodingStatus);
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
		
		String keyClassName = "StagingCodeExport";
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
		if (this.getExportDateTime() != null)
		{
			sb.append("<exportDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getExportDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</exportDateTime>");		
		}
		if (this.getDataExport() != null)
		{
			sb.append("<dataExport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDataExport().toString()));
			sb.append("</dataExport>");		
		}
		if (this.getDataImport() != null)
		{
			sb.append("<dataImport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDataImport().toString()));
			sb.append("</dataImport>");		
		}
		if (this.getPushedCodingItems() != null)
		{
			if (this.getPushedCodingItems().size() > 0 )
			{
			sb.append("<pushedCodingItems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPushedCodingItems(), domMap));
			sb.append("</pushedCodingItems>");		
			}
		}
		if (this.getImportDateTime() != null)
		{
			sb.append("<importDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getImportDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</importDateTime>");		
		}
		if (this.getReceivedCodingItems() != null)
		{
			if (this.getReceivedCodingItems().size() > 0 )
			{
			sb.append("<receivedCodingItems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReceivedCodingItems(), domMap));
			sb.append("</receivedCodingItems>");		
			}
		}
		if (this.getReceivedPatientId() != null)
		{
			sb.append("<receivedPatientId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReceivedPatientId().toString()));
			sb.append("</receivedPatientId>");		
		}
		if (this.getReceivedFCEId() != null)
		{
			sb.append("<receivedFCEId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReceivedFCEId().toString()));
			sb.append("</receivedFCEId>");		
		}
		if (this.getCodingStatus() != null)
		{
			sb.append("<codingStatus>");
			sb.append(this.getCodingStatus().toXMLString()); 
			sb.append("</codingStatus>");		
		}
		if (this.getReceivedCodingStatus() != null)
		{
			sb.append("<receivedCodingStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReceivedCodingStatus().toString()));
			sb.append("</receivedCodingStatus>");		
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
			StagingCodeExport domainObject = getStagingCodeExportfromXML(itemEl, factory, domMap);

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
			StagingCodeExport domainObject = getStagingCodeExportfromXML(itemEl, factory, domMap);

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
		
	public static StagingCodeExport getStagingCodeExportfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getStagingCodeExportfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static StagingCodeExport getStagingCodeExportfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!StagingCodeExport.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!StagingCodeExport.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the StagingCodeExport class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (StagingCodeExport)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(StagingCodeExport.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		StagingCodeExport ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (StagingCodeExport)factory.getImportedDomainObject(StagingCodeExport.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new StagingCodeExport();
		}
		String keyClassName = "StagingCodeExport";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (StagingCodeExport)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, StagingCodeExport obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("exportDateTime");
		if(fldEl != null)
		{	
    		obj.setExportDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dataExport");
		if(fldEl != null)
		{	
    		obj.setDataExport(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dataImport");
		if(fldEl != null)
		{	
    		obj.setDataImport(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pushedCodingItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPushedCodingItems(ims.RefMan.domain.objects.ReferralCodingItem.fromListXMLString(fldEl, factory, obj.getPushedCodingItems(), domMap));
		}
		fldEl = el.element("importDateTime");
		if(fldEl != null)
		{	
    		obj.setImportDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("receivedCodingItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setReceivedCodingItems(ims.RefMan.domain.objects.ReferralCodingItem.fromListXMLString(fldEl, factory, obj.getReceivedCodingItems(), domMap));
		}
		fldEl = el.element("receivedPatientId");
		if(fldEl != null)
		{	
    		obj.setReceivedPatientId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("receivedFCEId");
		if(fldEl != null)
		{	
    		obj.setReceivedFCEId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("codingStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCodingStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("receivedCodingStatus");
		if(fldEl != null)
		{	
    		obj.setReceivedCodingStatus(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "pushedCodingItems"
		, "receivedCodingItems"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ExportDateTime = "exportDateTime";
		public static final String DataExport = "dataExport";
		public static final String DataImport = "dataImport";
		public static final String PushedCodingItems = "pushedCodingItems";
		public static final String ImportDateTime = "importDateTime";
		public static final String ReceivedCodingItems = "receivedCodingItems";
		public static final String ReceivedPatientId = "receivedPatientId";
		public static final String ReceivedFCEId = "receivedFCEId";
		public static final String CodingStatus = "codingStatus";
		public static final String ReceivedCodingStatus = "receivedCodingStatus";
	}
}

