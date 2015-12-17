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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Daniel Laffan
 * Generated.
 */


public class PatientMergeHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100008;
	private static final long serialVersionUID = 1001100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The Patient unique id data has been merged from */
	private Integer sourcePatId;
	/** The Patient unique id data has been merged to */
	private Integer destinationPatId;
	/** The Member of Staff Requested By */
	private ims.core.resource.people.domain.objects.MemberOfStaff requestedBy;
	/** From the system info generated on inserting a mergeRequest */
	private java.util.Date creationDateTime;
	/** Comment */
	private String comment;
	/** Contains list of Identifiers that belonged to the Source Patient
	  * Collection of ims.core.patient.domain.objects.PatientId.
	  */
	private java.util.List patientIds;
	/** Name of the Database where the merge took place */
	private String databaseName;
	/** List of Tables and ids affected by the merge
	  * Collection of ims.core.patient.domain.objects.MergedTables.
	  */
	private java.util.List items;
	/** Hostname or IP of machine where this merge ran from */
	private String hostname;
	private Boolean mergeIdentifiers;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientMergeHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientMergeHistory ()
    {
    	super();
    }
    public PatientMergeHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PatientMergeHistory.class;
	}


	public Integer getSourcePatId() {
		return sourcePatId;
	}
	public void setSourcePatId(Integer sourcePatId) {
		this.sourcePatId = sourcePatId;
	}

	public Integer getDestinationPatId() {
		return destinationPatId;
	}
	public void setDestinationPatId(Integer destinationPatId) {
		this.destinationPatId = destinationPatId;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(ims.core.resource.people.domain.objects.MemberOfStaff requestedBy) {
		this.requestedBy = requestedBy;
	}

	public java.util.Date getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(java.util.Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public java.util.List getPatientIds() {
		if ( null == patientIds ) {
			patientIds = new java.util.ArrayList();
		}
		return patientIds;
	}
	public void setPatientIds(java.util.List paramValue) {
		this.patientIds = paramValue;
	}

	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		if ( null != databaseName && databaseName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for databaseName. Tried to set value: "+
				databaseName);
		}
		this.databaseName = databaseName;
	}

	public java.util.List getItems() {
		if ( null == items ) {
			items = new java.util.ArrayList();
		}
		return items;
	}
	public void setItems(java.util.List paramValue) {
		this.items = paramValue;
	}

	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		if ( null != hostname && hostname.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hostname. Tried to set value: "+
				hostname);
		}
		this.hostname = hostname;
	}

	public Boolean isMergeIdentifiers() {
		return mergeIdentifiers;
	}
	public void setMergeIdentifiers(Boolean mergeIdentifiers) {
		this.mergeIdentifiers = mergeIdentifiers;
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
		
		auditStr.append("\r\n*sourcePatId* :");
		auditStr.append(sourcePatId);
	    auditStr.append("; ");
		auditStr.append("\r\n*destinationPatId* :");
		auditStr.append(destinationPatId);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedBy* :");
		if (requestedBy != null)
		{
			auditStr.append(toShortClassName(requestedBy));
				
		    auditStr.append(requestedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDateTime* :");
		auditStr.append(creationDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientIds* :");
		if (patientIds != null)
		{
		int i6=0;
		for (i6=0; i6<patientIds.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PatientId obj = (ims.core.patient.domain.objects.PatientId)patientIds.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*databaseName* :");
		auditStr.append(databaseName);
	    auditStr.append("; ");
		auditStr.append("\r\n*items* :");
		if (items != null)
		{
		int i8=0;
		for (i8=0; i8<items.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.MergedTables obj = (ims.core.patient.domain.objects.MergedTables)items.get(i8);
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
		auditStr.append("\r\n*hostname* :");
		auditStr.append(hostname);
	    auditStr.append("; ");
		auditStr.append("\r\n*mergeIdentifiers* :");
		auditStr.append(mergeIdentifiers);
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
		
		String keyClassName = "PatientMergeHistory";
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
		if (this.getSourcePatId() != null)
		{
			sb.append("<sourcePatId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSourcePatId().toString()));
			sb.append("</sourcePatId>");		
		}
		if (this.getDestinationPatId() != null)
		{
			sb.append("<destinationPatId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDestinationPatId().toString()));
			sb.append("</destinationPatId>");		
		}
		if (this.getRequestedBy() != null)
		{
			sb.append("<requestedBy>");
			sb.append(this.getRequestedBy().toXMLString(domMap)); 	
			sb.append("</requestedBy>");		
		}
		if (this.getCreationDateTime() != null)
		{
			sb.append("<creationDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDateTime>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getPatientIds() != null)
		{
			if (this.getPatientIds().size() > 0 )
			{
			sb.append("<patientIds>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientIds(), domMap));
			sb.append("</patientIds>");		
			}
		}
		if (this.getDatabaseName() != null)
		{
			sb.append("<databaseName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDatabaseName().toString()));
			sb.append("</databaseName>");		
		}
		if (this.getItems() != null)
		{
			if (this.getItems().size() > 0 )
			{
			sb.append("<items>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getItems(), domMap));
			sb.append("</items>");		
			}
		}
		if (this.getHostname() != null)
		{
			sb.append("<hostname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHostname().toString()));
			sb.append("</hostname>");		
		}
		if (this.isMergeIdentifiers() != null)
		{
			sb.append("<mergeIdentifiers>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMergeIdentifiers().toString()));
			sb.append("</mergeIdentifiers>");		
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
			PatientMergeHistory domainObject = getPatientMergeHistoryfromXML(itemEl, factory, domMap);

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
			PatientMergeHistory domainObject = getPatientMergeHistoryfromXML(itemEl, factory, domMap);

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
		
	public static PatientMergeHistory getPatientMergeHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientMergeHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientMergeHistory getPatientMergeHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientMergeHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientMergeHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientMergeHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientMergeHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientMergeHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientMergeHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientMergeHistory)factory.getImportedDomainObject(PatientMergeHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientMergeHistory();
		}
		String keyClassName = "PatientMergeHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientMergeHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientMergeHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("sourcePatId");
		if(fldEl != null)
		{	
    		obj.setSourcePatId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("destinationPatId");
		if(fldEl != null)
		{	
    		obj.setDestinationPatId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requestedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("creationDateTime");
		if(fldEl != null)
		{	
    		obj.setCreationDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientIds");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientIds(ims.core.patient.domain.objects.PatientId.fromListXMLString(fldEl, factory, obj.getPatientIds(), domMap));
		}
		fldEl = el.element("databaseName");
		if(fldEl != null)
		{	
    		obj.setDatabaseName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("items");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setItems(ims.core.patient.domain.objects.MergedTables.fromListXMLString(fldEl, factory, obj.getItems(), domMap));
		}
		fldEl = el.element("hostname");
		if(fldEl != null)
		{	
    		obj.setHostname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mergeIdentifiers");
		if(fldEl != null)
		{	
    		obj.setMergeIdentifiers(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientIds"
		, "items"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SourcePatId = "sourcePatId";
		public static final String DestinationPatId = "destinationPatId";
		public static final String RequestedBy = "requestedBy";
		public static final String CreationDateTime = "creationDateTime";
		public static final String Comment = "comment";
		public static final String PatientIds = "patientIds";
		public static final String DatabaseName = "databaseName";
		public static final String Items = "items";
		public static final String Hostname = "hostname";
		public static final String MergeIdentifiers = "mergeIdentifiers";
	}
}

