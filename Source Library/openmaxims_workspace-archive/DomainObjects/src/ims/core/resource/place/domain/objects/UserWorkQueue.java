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
package ims.core.resource.place.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class UserWorkQueue extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1038100000;
	private static final long serialVersionUID = 1038100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Lookup: Identified the Request Type */
	private ims.core.resource.place.domain.objects.Activity requestType;
	/** Source User */
	private ims.core.resource.people.domain.objects.MemberOfStaff requestedBy;
	/** Date / Time request made */
	private java.util.Date requestDateTime;
	/** Target User */
	private ims.core.resource.people.domain.objects.MemberOfStaff targetUser;
	/** Requesting Description */
	private String description;
	/** Date Work Queue Entry becomes active */
	private java.util.Date requiredOnDate;
	/** Unique ID of Requesting Object */
	private Integer requestingObjectID;
	/** Requesting Form */
	private ims.framework.FormName requestingForm;
	/** Unique ID of Requesting Object */
	private Integer targetObjectID;
	/** Target Form */
	private ims.framework.FormName targetForm;
	/** Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** Work Queue Status History
	  * Collection of ims.core.resource.place.domain.objects.WorkQueueStatus.
	  */
	private java.util.Set statusHistory;
	/** OrigNoteType */
	private ims.domain.lookups.LookupInstance origNoteType;
	/** Work Queue Comments */
	private String comments;
	/** ProcedureLocationService */
	private ims.core.resource.place.domain.objects.LocationService procedureLocationService;
	/** Procedure Activity */
	private ims.core.resource.place.domain.objects.Activity procedureActivity;
	/** Procedure Context */
	private ims.domain.lookups.LookupInstance procedureContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public UserWorkQueue (Integer id, int ver)
    {
    	super(id, ver);
    }
    public UserWorkQueue ()
    {
    	super();
    }
    public UserWorkQueue (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.UserWorkQueue.class;
	}


	public ims.core.resource.place.domain.objects.Activity getRequestType() {
		return requestType;
	}
	public void setRequestType(ims.core.resource.place.domain.objects.Activity requestType) {
		this.requestType = requestType;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(ims.core.resource.people.domain.objects.MemberOfStaff requestedBy) {
		this.requestedBy = requestedBy;
	}

	public java.util.Date getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(java.util.Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getTargetUser() {
		return targetUser;
	}
	public void setTargetUser(ims.core.resource.people.domain.objects.MemberOfStaff targetUser) {
		this.targetUser = targetUser;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.Date getRequiredOnDate() {
		return requiredOnDate;
	}
	public void setRequiredOnDate(java.util.Date requiredOnDate) {
		this.requiredOnDate = requiredOnDate;
	}

	public Integer getRequestingObjectID() {
		return requestingObjectID;
	}
	public void setRequestingObjectID(Integer requestingObjectID) {
		this.requestingObjectID = requestingObjectID;
	}

	public ims.framework.FormName getRequestingForm() {
		return requestingForm;
	}
	public void setRequestingForm(ims.framework.FormName requestingForm) {
		this.requestingForm = requestingForm;
	}

	public Integer getTargetObjectID() {
		return targetObjectID;
	}
	public void setTargetObjectID(Integer targetObjectID) {
		this.targetObjectID = targetObjectID;
	}

	public ims.framework.FormName getTargetForm() {
		return targetForm;
	}
	public void setTargetForm(ims.framework.FormName targetForm) {
		this.targetForm = targetForm;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getOrigNoteType() {
		return origNoteType;
	}
	public void setOrigNoteType(ims.domain.lookups.LookupInstance origNoteType) {
		this.origNoteType = origNoteType;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.core.resource.place.domain.objects.LocationService getProcedureLocationService() {
		return procedureLocationService;
	}
	public void setProcedureLocationService(ims.core.resource.place.domain.objects.LocationService procedureLocationService) {
		this.procedureLocationService = procedureLocationService;
	}

	public ims.core.resource.place.domain.objects.Activity getProcedureActivity() {
		return procedureActivity;
	}
	public void setProcedureActivity(ims.core.resource.place.domain.objects.Activity procedureActivity) {
		this.procedureActivity = procedureActivity;
	}

	public ims.domain.lookups.LookupInstance getProcedureContext() {
		return procedureContext;
	}
	public void setProcedureContext(ims.domain.lookups.LookupInstance procedureContext) {
		this.procedureContext = procedureContext;
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
		
		auditStr.append("\r\n*requestType* :");
		if (requestType != null)
		{
			auditStr.append(toShortClassName(requestType));
				
		    auditStr.append(requestType.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedBy* :");
		if (requestedBy != null)
		{
			auditStr.append(toShortClassName(requestedBy));
				
		    auditStr.append(requestedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestDateTime* :");
		auditStr.append(requestDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetUser* :");
		if (targetUser != null)
		{
			auditStr.append(toShortClassName(targetUser));
				
		    auditStr.append(targetUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiredOnDate* :");
		auditStr.append(requiredOnDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestingObjectID* :");
		auditStr.append(requestingObjectID);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestingForm* :");
		auditStr.append(requestingForm);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetObjectID* :");
		auditStr.append(targetObjectID);
	    auditStr.append("; ");
		auditStr.append("\r\n*targetForm* :");
		auditStr.append(targetForm);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
			java.util.Iterator it12 = statusHistory.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.WorkQueueStatus obj = (ims.core.resource.place.domain.objects.WorkQueueStatus)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*origNoteType* :");
		if (origNoteType != null)
			auditStr.append(origNoteType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureLocationService* :");
		if (procedureLocationService != null)
		{
			auditStr.append(toShortClassName(procedureLocationService));
				
		    auditStr.append(procedureLocationService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureActivity* :");
		if (procedureActivity != null)
		{
			auditStr.append(toShortClassName(procedureActivity));
				
		    auditStr.append(procedureActivity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureContext* :");
		if (procedureContext != null)
			auditStr.append(procedureContext.getText());
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
		
		String keyClassName = "UserWorkQueue";
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
		if (this.getRequestType() != null)
		{
			sb.append("<requestType>");
			sb.append(this.getRequestType().toXMLString(domMap)); 	
			sb.append("</requestType>");		
		}
		if (this.getRequestedBy() != null)
		{
			sb.append("<requestedBy>");
			sb.append(this.getRequestedBy().toXMLString(domMap)); 	
			sb.append("</requestedBy>");		
		}
		if (this.getRequestDateTime() != null)
		{
			sb.append("<requestDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRequestDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requestDateTime>");		
		}
		if (this.getTargetUser() != null)
		{
			sb.append("<targetUser>");
			sb.append(this.getTargetUser().toXMLString(domMap)); 	
			sb.append("</targetUser>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getRequiredOnDate() != null)
		{
			sb.append("<requiredOnDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRequiredOnDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requiredOnDate>");		
		}
		if (this.getRequestingObjectID() != null)
		{
			sb.append("<requestingObjectID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequestingObjectID().toString()));
			sb.append("</requestingObjectID>");		
		}
		if (this.getRequestingForm() != null)
		{
			sb.append("<requestingForm>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequestingForm().toString()));
			sb.append("</requestingForm>");		
		}
		if (this.getTargetObjectID() != null)
		{
			sb.append("<targetObjectID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTargetObjectID().toString()));
			sb.append("</targetObjectID>");		
		}
		if (this.getTargetForm() != null)
		{
			sb.append("<targetForm>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTargetForm().toString()));
			sb.append("</targetForm>");		
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
		if (this.getOrigNoteType() != null)
		{
			sb.append("<origNoteType>");
			sb.append(this.getOrigNoteType().toXMLString()); 
			sb.append("</origNoteType>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getProcedureLocationService() != null)
		{
			sb.append("<procedureLocationService>");
			sb.append(this.getProcedureLocationService().toXMLString(domMap)); 	
			sb.append("</procedureLocationService>");		
		}
		if (this.getProcedureActivity() != null)
		{
			sb.append("<procedureActivity>");
			sb.append(this.getProcedureActivity().toXMLString(domMap)); 	
			sb.append("</procedureActivity>");		
		}
		if (this.getProcedureContext() != null)
		{
			sb.append("<procedureContext>");
			sb.append(this.getProcedureContext().toXMLString()); 
			sb.append("</procedureContext>");		
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
			UserWorkQueue domainObject = getUserWorkQueuefromXML(itemEl, factory, domMap);

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
			UserWorkQueue domainObject = getUserWorkQueuefromXML(itemEl, factory, domMap);

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
		
	public static UserWorkQueue getUserWorkQueuefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getUserWorkQueuefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static UserWorkQueue getUserWorkQueuefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!UserWorkQueue.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!UserWorkQueue.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the UserWorkQueue class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (UserWorkQueue)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(UserWorkQueue.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		UserWorkQueue ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (UserWorkQueue)factory.getImportedDomainObject(UserWorkQueue.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new UserWorkQueue();
		}
		String keyClassName = "UserWorkQueue";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (UserWorkQueue)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, UserWorkQueue obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("requestType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestType(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestDateTime");
		if(fldEl != null)
		{	
    		obj.setRequestDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("targetUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTargetUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiredOnDate");
		if(fldEl != null)
		{	
    		obj.setRequiredOnDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("requestingObjectID");
		if(fldEl != null)
		{	
    		obj.setRequestingObjectID(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requestingForm");
		if(fldEl != null)
		{	
    		java.util.StringTokenizer st8 = new java.util.StringTokenizer(fldEl.getTextTrim(), ",");
    		if (st8.countTokens() == 1)
    		{
				obj.setRequestingForm(new ims.framework.FormNameImpl(Integer.parseInt(fldEl.getTextTrim())));	
    		}
    		else
    		{
				obj.setRequestingForm(new ims.framework.FormNameImpl(Integer.parseInt(st8.nextToken()), st8.nextToken()));	
    		}
		}
		fldEl = el.element("targetObjectID");
		if(fldEl != null)
		{	
    		obj.setTargetObjectID(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("targetForm");
		if(fldEl != null)
		{	
    		java.util.StringTokenizer st10 = new java.util.StringTokenizer(fldEl.getTextTrim(), ",");
    		if (st10.countTokens() == 1)
    		{
				obj.setTargetForm(new ims.framework.FormNameImpl(Integer.parseInt(fldEl.getTextTrim())));	
    		}
    		else
    		{
				obj.setTargetForm(new ims.framework.FormNameImpl(Integer.parseInt(st10.nextToken()), st10.nextToken()));	
    		}
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
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.core.resource.place.domain.objects.WorkQueueStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("origNoteType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrigNoteType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedureLocationService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedureLocationService(ims.core.resource.place.domain.objects.LocationService.getLocationServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureActivity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedureActivity(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String RequestType = "requestType";
		public static final String RequestedBy = "requestedBy";
		public static final String RequestDateTime = "requestDateTime";
		public static final String TargetUser = "targetUser";
		public static final String Description = "description";
		public static final String RequiredOnDate = "requiredOnDate";
		public static final String RequestingObjectID = "requestingObjectID";
		public static final String RequestingForm = "requestingForm";
		public static final String TargetObjectID = "targetObjectID";
		public static final String TargetForm = "targetForm";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String OrigNoteType = "origNoteType";
		public static final String Comments = "comments";
		public static final String ProcedureLocationService = "procedureLocationService";
		public static final String ProcedureActivity = "procedureActivity";
		public static final String ProcedureContext = "procedureContext";
	}
}

