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
package ims.core.admin.domain.objects;

/**
 * Clinical Contact  (Level 1 record)
 * @author John MacEnri
 * Generated.
 */


public class ClinicalContact extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100003;
	private static final long serialVersionUID = 1004100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** Seen By / Recording HCP / Authoring HCP */
	private ims.core.resource.people.domain.objects.Hcp seenBy;
	/** Contact Type (Medical Review, Ward Round) */
	private ims.domain.lookups.LookupInstance contactType;
	/** StartDateTime */
	private java.util.Date startDateTime;
	/** End Date Time */
	private java.util.Date endDateTime;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** isClinicalNoteCreated */
	private Boolean isClinicalNoteCreated;
	/** Current Status */
	private ims.core.admin.domain.objects.ClinicalContactStatusHistory currentStatus;
	/** Status History
	  * Collection of ims.core.admin.domain.objects.ClinicalContactStatusHistory.
	  */
	private java.util.List statusHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalContact (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalContact ()
    {
    	super();
    }
    public ClinicalContact (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.ClinicalContact.class;
	}


	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.core.resource.people.domain.objects.Hcp getSeenBy() {
		return seenBy;
	}
	public void setSeenBy(ims.core.resource.people.domain.objects.Hcp seenBy) {
		this.seenBy = seenBy;
	}

	public ims.domain.lookups.LookupInstance getContactType() {
		return contactType;
	}
	public void setContactType(ims.domain.lookups.LookupInstance contactType) {
		this.contactType = contactType;
	}

	public java.util.Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public java.util.Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(java.util.Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isIsClinicalNoteCreated() {
		return isClinicalNoteCreated;
	}
	public void setIsClinicalNoteCreated(Boolean isClinicalNoteCreated) {
		this.isClinicalNoteCreated = isClinicalNoteCreated;
	}

	public ims.core.admin.domain.objects.ClinicalContactStatusHistory getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.admin.domain.objects.ClinicalContactStatusHistory currentStatus) {
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
		
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*seenBy* :");
		if (seenBy != null)
		{
			auditStr.append(toShortClassName(seenBy));
				
		    auditStr.append(seenBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*contactType* :");
		if (contactType != null)
			auditStr.append(contactType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateTime* :");
		auditStr.append(endDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isClinicalNoteCreated* :");
		auditStr.append(isClinicalNoteCreated);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i9=0;
		for (i9=0; i9<statusHistory.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.ClinicalContactStatusHistory obj = (ims.core.admin.domain.objects.ClinicalContactStatusHistory)statusHistory.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
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
		
		String keyClassName = "ClinicalContact";
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
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getSeenBy() != null)
		{
			sb.append("<seenBy>");
			sb.append(this.getSeenBy().toXMLString(domMap)); 	
			sb.append("</seenBy>");		
		}
		if (this.getContactType() != null)
		{
			sb.append("<contactType>");
			sb.append(this.getContactType().toXMLString()); 
			sb.append("</contactType>");		
		}
		if (this.getStartDateTime() != null)
		{
			sb.append("<startDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateTime>");		
		}
		if (this.getEndDateTime() != null)
		{
			sb.append("<endDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateTime>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.isIsClinicalNoteCreated() != null)
		{
			sb.append("<isClinicalNoteCreated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsClinicalNoteCreated().toString()));
			sb.append("</isClinicalNoteCreated>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
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
			ClinicalContact domainObject = getClinicalContactfromXML(itemEl, factory, domMap);

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
			ClinicalContact domainObject = getClinicalContactfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalContact getClinicalContactfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalContactfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalContact getClinicalContactfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalContact.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalContact.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalContact class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalContact)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalContact.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalContact ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalContact)factory.getImportedDomainObject(ClinicalContact.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalContact();
		}
		String keyClassName = "ClinicalContact";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalContact)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalContact obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("seenBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSeenBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("contactType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContactType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDateTime");
		if(fldEl != null)
		{	
    		obj.setStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDateTime");
		if(fldEl != null)
		{	
    		obj.setEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isClinicalNoteCreated");
		if(fldEl != null)
		{	
    		obj.setIsClinicalNoteCreated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.admin.domain.objects.ClinicalContactStatusHistory.getClinicalContactStatusHistoryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.core.admin.domain.objects.ClinicalContactStatusHistory.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
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
		public static final String Specialty = "specialty";
		public static final String SeenBy = "seenBy";
		public static final String ContactType = "contactType";
		public static final String StartDateTime = "startDateTime";
		public static final String EndDateTime = "endDateTime";
		public static final String CareContext = "careContext";
		public static final String IsClinicalNoteCreated = "isClinicalNoteCreated";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
	}
}

