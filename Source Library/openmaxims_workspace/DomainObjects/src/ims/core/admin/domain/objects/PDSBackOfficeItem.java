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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSBackOfficeItem extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100073;
	private static final long serialVersionUID = 1004100073L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Back Office Type from MAXIMS interaction or automatic response to a failed PDS transaction.  */
	private ims.domain.lookups.LookupInstance type;
	/** Description of error encountered */
	private String description;
	/** The source of the error */
	private String source;
	/** The priority of the MAXIMS Back Office Item  */
	private ims.domain.lookups.LookupInstance priority;
	/** The status of the Back Office item  */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** Status History
	  * Collection of ims.core.admin.domain.objects.PDSBackOfficeStatus.
	  */
	private java.util.List statusHistory;
	/** NHS Number that was in context at the time of the error */
	private String nHSNumber;
	/** Superseded NHS number that was in context at the time of the error. */
	private String nHSNumberSuperseded;
	/** Back Office Outcome of actions taken */
	private ims.domain.lookups.LookupInstance outcome;
	/** PDS update type */
	private ims.domain.lookups.LookupInstance updateType;
	/** The type of registering authority, used for death status updates to PDS. */
	private ims.domain.lookups.LookupInstance registeryAuthorityType;
	/** reference to patient for updates */
	private ims.core.patient.domain.objects.Patient patient;
	/** Linked Notifications
	  * Collection of ims.core.admin.domain.objects.Notifications.
	  */
	private java.util.List notifications;
	/** updates and components to be removed from PDS */
	private ims.core.patient.domain.objects.PDSPatientUpdate patientUpdates;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSBackOfficeItem (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSBackOfficeItem ()
    {
    	super();
    }
    public PDSBackOfficeItem (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.PDSBackOfficeItem.class;
	}


	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		if ( null != source && source.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for source. Tried to set value: "+
				source);
		}
		this.source = source;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
	}

	public String getNHSNumber() {
		return nHSNumber;
	}
	public void setNHSNumber(String nHSNumber) {
		if ( null != nHSNumber && nHSNumber.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumber. Tried to set value: "+
				nHSNumber);
		}
		this.nHSNumber = nHSNumber;
	}

	public String getNHSNumberSuperseded() {
		return nHSNumberSuperseded;
	}
	public void setNHSNumberSuperseded(String nHSNumberSuperseded) {
		if ( null != nHSNumberSuperseded && nHSNumberSuperseded.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumberSuperseded. Tried to set value: "+
				nHSNumberSuperseded);
		}
		this.nHSNumberSuperseded = nHSNumberSuperseded;
	}

	public ims.domain.lookups.LookupInstance getOutcome() {
		return outcome;
	}
	public void setOutcome(ims.domain.lookups.LookupInstance outcome) {
		this.outcome = outcome;
	}

	public ims.domain.lookups.LookupInstance getUpdateType() {
		return updateType;
	}
	public void setUpdateType(ims.domain.lookups.LookupInstance updateType) {
		this.updateType = updateType;
	}

	public ims.domain.lookups.LookupInstance getRegisteryAuthorityType() {
		return registeryAuthorityType;
	}
	public void setRegisteryAuthorityType(ims.domain.lookups.LookupInstance registeryAuthorityType) {
		this.registeryAuthorityType = registeryAuthorityType;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public java.util.List getNotifications() {
		if ( null == notifications ) {
			notifications = new java.util.ArrayList();
		}
		return notifications;
	}
	public void setNotifications(java.util.List paramValue) {
		this.notifications = paramValue;
	}

	public ims.core.patient.domain.objects.PDSPatientUpdate getPatientUpdates() {
		return patientUpdates;
	}
	public void setPatientUpdates(ims.core.patient.domain.objects.PDSPatientUpdate patientUpdates) {
		this.patientUpdates = patientUpdates;
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
		
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		auditStr.append(source);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i6=0;
		for (i6=0; i6<statusHistory.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.PDSBackOfficeStatus obj = (ims.core.admin.domain.objects.PDSBackOfficeStatus)statusHistory.get(i6);
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
		auditStr.append("\r\n*nHSNumber* :");
		auditStr.append(nHSNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSNumberSuperseded* :");
		auditStr.append(nHSNumberSuperseded);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcome* :");
		if (outcome != null)
			auditStr.append(outcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*updateType* :");
		if (updateType != null)
			auditStr.append(updateType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*registeryAuthorityType* :");
		if (registeryAuthorityType != null)
			auditStr.append(registeryAuthorityType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notifications* :");
		if (notifications != null)
		{
		int i13=0;
		for (i13=0; i13<notifications.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.Notifications obj = (ims.core.admin.domain.objects.Notifications)notifications.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientUpdates* :");
		if (patientUpdates != null)
		{
			auditStr.append(toShortClassName(patientUpdates));
				
		    auditStr.append(patientUpdates.getId());
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
		
		String keyClassName = "PDSBackOfficeItem";
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
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSource().toString()));
			sb.append("</source>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getNHSNumber() != null)
		{
			sb.append("<nHSNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumber().toString()));
			sb.append("</nHSNumber>");		
		}
		if (this.getNHSNumberSuperseded() != null)
		{
			sb.append("<nHSNumberSuperseded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumberSuperseded().toString()));
			sb.append("</nHSNumberSuperseded>");		
		}
		if (this.getOutcome() != null)
		{
			sb.append("<outcome>");
			sb.append(this.getOutcome().toXMLString()); 
			sb.append("</outcome>");		
		}
		if (this.getUpdateType() != null)
		{
			sb.append("<updateType>");
			sb.append(this.getUpdateType().toXMLString()); 
			sb.append("</updateType>");		
		}
		if (this.getRegisteryAuthorityType() != null)
		{
			sb.append("<registeryAuthorityType>");
			sb.append(this.getRegisteryAuthorityType().toXMLString()); 
			sb.append("</registeryAuthorityType>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getNotifications() != null)
		{
			if (this.getNotifications().size() > 0 )
			{
			sb.append("<notifications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNotifications(), domMap));
			sb.append("</notifications>");		
			}
		}
		if (this.getPatientUpdates() != null)
		{
			sb.append("<patientUpdates>");
			sb.append(this.getPatientUpdates().toXMLString(domMap)); 	
			sb.append("</patientUpdates>");		
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
			PDSBackOfficeItem domainObject = getPDSBackOfficeItemfromXML(itemEl, factory, domMap);

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
			PDSBackOfficeItem domainObject = getPDSBackOfficeItemfromXML(itemEl, factory, domMap);

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
		
	public static PDSBackOfficeItem getPDSBackOfficeItemfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSBackOfficeItemfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSBackOfficeItem getPDSBackOfficeItemfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSBackOfficeItem.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSBackOfficeItem.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSBackOfficeItem class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSBackOfficeItem)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSBackOfficeItem.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSBackOfficeItem ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSBackOfficeItem)factory.getImportedDomainObject(PDSBackOfficeItem.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSBackOfficeItem();
		}
		String keyClassName = "PDSBackOfficeItem";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSBackOfficeItem)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSBackOfficeItem obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{	
    		obj.setSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.core.admin.domain.objects.PDSBackOfficeStatus.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("nHSNumber");
		if(fldEl != null)
		{	
    		obj.setNHSNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nHSNumberSuperseded");
		if(fldEl != null)
		{	
    		obj.setNHSNumberSuperseded(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("updateType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUpdateType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("registeryAuthorityType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRegisteryAuthorityType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notifications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNotifications(ims.core.admin.domain.objects.Notifications.fromListXMLString(fldEl, factory, obj.getNotifications(), domMap));
		}
		fldEl = el.element("patientUpdates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientUpdates(ims.core.patient.domain.objects.PDSPatientUpdate.getPDSPatientUpdatefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		, "notifications"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Type = "type";
		public static final String Description = "description";
		public static final String Source = "source";
		public static final String Priority = "priority";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String NHSNumber = "nHSNumber";
		public static final String NHSNumberSuperseded = "nHSNumberSuperseded";
		public static final String Outcome = "outcome";
		public static final String UpdateType = "updateType";
		public static final String RegisteryAuthorityType = "registeryAuthorityType";
		public static final String Patient = "patient";
		public static final String Notifications = "notifications";
		public static final String PatientUpdates = "patientUpdates";
	}
}

