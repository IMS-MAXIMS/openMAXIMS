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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class VitalSignsMonitoring extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100073;
	private static final long serialVersionUID = 1003100073L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Vital Sign Grouping */
	private ims.core.configuration.domain.objects.VitalSignMonitoringGroup vitalSignGroup;
	/** Group Frequency */
	private ims.domain.lookups.LookupInstance groupFrequency;
	/** Item Frequency
	  * Collection of ims.core.clinical.domain.objects.VitalSignItemFrequency.
	  */
	private java.util.Set itemFrequency;
	/** Start Date/Time */
	private java.util.Date startDateTime;
	/** Duration Value */
	private Integer durationValue;
	/** Duration Unit */
	private ims.domain.lookups.LookupInstance durationUnit;
	/** Requested By */
	private ims.core.resource.people.domain.objects.Hcp requestedBy;
	/** Request Details */
	private String requestDetails;
	/** Stopped By */
	private ims.core.resource.people.domain.objects.Hcp stoppedBy;
	/** Stopped Date/Time */
	private java.util.Date stoppedDateTime;
	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public VitalSignsMonitoring (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VitalSignsMonitoring ()
    {
    	super();
    }
    public VitalSignsMonitoring (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.VitalSignsMonitoring.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.configuration.domain.objects.VitalSignMonitoringGroup getVitalSignGroup() {
		return vitalSignGroup;
	}
	public void setVitalSignGroup(ims.core.configuration.domain.objects.VitalSignMonitoringGroup vitalSignGroup) {
		this.vitalSignGroup = vitalSignGroup;
	}

	public ims.domain.lookups.LookupInstance getGroupFrequency() {
		return groupFrequency;
	}
	public void setGroupFrequency(ims.domain.lookups.LookupInstance groupFrequency) {
		this.groupFrequency = groupFrequency;
	}

	public java.util.Set getItemFrequency() {
		if ( null == itemFrequency ) {
			itemFrequency = new java.util.HashSet();
		}
		return itemFrequency;
	}
	public void setItemFrequency(java.util.Set paramValue) {
		this.itemFrequency = paramValue;
	}

	public java.util.Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Integer getDurationValue() {
		return durationValue;
	}
	public void setDurationValue(Integer durationValue) {
		this.durationValue = durationValue;
	}

	public ims.domain.lookups.LookupInstance getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(ims.domain.lookups.LookupInstance durationUnit) {
		this.durationUnit = durationUnit;
	}

	public ims.core.resource.people.domain.objects.Hcp getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(ims.core.resource.people.domain.objects.Hcp requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getRequestDetails() {
		return requestDetails;
	}
	public void setRequestDetails(String requestDetails) {
		if ( null != requestDetails && requestDetails.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for requestDetails. Tried to set value: "+
				requestDetails);
		}
		this.requestDetails = requestDetails;
	}

	public ims.core.resource.people.domain.objects.Hcp getStoppedBy() {
		return stoppedBy;
	}
	public void setStoppedBy(ims.core.resource.people.domain.objects.Hcp stoppedBy) {
		this.stoppedBy = stoppedBy;
	}

	public java.util.Date getStoppedDateTime() {
		return stoppedDateTime;
	}
	public void setStoppedDateTime(java.util.Date stoppedDateTime) {
		this.stoppedDateTime = stoppedDateTime;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vitalSignGroup* :");
		if (vitalSignGroup != null)
		{
			auditStr.append(toShortClassName(vitalSignGroup));
				
		    auditStr.append(vitalSignGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*groupFrequency* :");
		if (groupFrequency != null)
			auditStr.append(groupFrequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*itemFrequency* :");
		if (itemFrequency != null)
		{
			java.util.Iterator it5 = itemFrequency.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.VitalSignItemFrequency obj = (ims.core.clinical.domain.objects.VitalSignItemFrequency)it5.next();
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
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationValue* :");
		auditStr.append(durationValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationUnit* :");
		if (durationUnit != null)
			auditStr.append(durationUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedBy* :");
		if (requestedBy != null)
		{
			auditStr.append(toShortClassName(requestedBy));
				
		    auditStr.append(requestedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestDetails* :");
		auditStr.append(requestDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*stoppedBy* :");
		if (stoppedBy != null)
		{
			auditStr.append(toShortClassName(stoppedBy));
				
		    auditStr.append(stoppedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*stoppedDateTime* :");
		auditStr.append(stoppedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
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
		
		String keyClassName = "VitalSignsMonitoring";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getVitalSignGroup() != null)
		{
			sb.append("<vitalSignGroup>");
			sb.append(this.getVitalSignGroup().toXMLString(domMap)); 	
			sb.append("</vitalSignGroup>");		
		}
		if (this.getGroupFrequency() != null)
		{
			sb.append("<groupFrequency>");
			sb.append(this.getGroupFrequency().toXMLString()); 
			sb.append("</groupFrequency>");		
		}
		if (this.getItemFrequency() != null)
		{
			if (this.getItemFrequency().size() > 0 )
			{
			sb.append("<itemFrequency>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getItemFrequency(), domMap));
			sb.append("</itemFrequency>");		
			}
		}
		if (this.getStartDateTime() != null)
		{
			sb.append("<startDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateTime>");		
		}
		if (this.getDurationValue() != null)
		{
			sb.append("<durationValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationValue().toString()));
			sb.append("</durationValue>");		
		}
		if (this.getDurationUnit() != null)
		{
			sb.append("<durationUnit>");
			sb.append(this.getDurationUnit().toXMLString()); 
			sb.append("</durationUnit>");		
		}
		if (this.getRequestedBy() != null)
		{
			sb.append("<requestedBy>");
			sb.append(this.getRequestedBy().toXMLString(domMap)); 	
			sb.append("</requestedBy>");		
		}
		if (this.getRequestDetails() != null)
		{
			sb.append("<requestDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequestDetails().toString()));
			sb.append("</requestDetails>");		
		}
		if (this.getStoppedBy() != null)
		{
			sb.append("<stoppedBy>");
			sb.append(this.getStoppedBy().toXMLString(domMap)); 	
			sb.append("</stoppedBy>");		
		}
		if (this.getStoppedDateTime() != null)
		{
			sb.append("<stoppedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStoppedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</stoppedDateTime>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			VitalSignsMonitoring domainObject = getVitalSignsMonitoringfromXML(itemEl, factory, domMap);

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
			VitalSignsMonitoring domainObject = getVitalSignsMonitoringfromXML(itemEl, factory, domMap);

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
		
	public static VitalSignsMonitoring getVitalSignsMonitoringfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVitalSignsMonitoringfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VitalSignsMonitoring getVitalSignsMonitoringfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VitalSignsMonitoring.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VitalSignsMonitoring.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VitalSignsMonitoring class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VitalSignsMonitoring)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VitalSignsMonitoring.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VitalSignsMonitoring ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VitalSignsMonitoring)factory.getImportedDomainObject(VitalSignsMonitoring.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VitalSignsMonitoring();
		}
		String keyClassName = "VitalSignsMonitoring";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VitalSignsMonitoring)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VitalSignsMonitoring obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vitalSignGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVitalSignGroup(ims.core.configuration.domain.objects.VitalSignMonitoringGroup.getVitalSignMonitoringGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("groupFrequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGroupFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("itemFrequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setItemFrequency(ims.core.clinical.domain.objects.VitalSignItemFrequency.fromSetXMLString(fldEl, factory, obj.getItemFrequency(), domMap));
		}
		fldEl = el.element("startDateTime");
		if(fldEl != null)
		{	
    		obj.setStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("durationValue");
		if(fldEl != null)
		{	
    		obj.setDurationValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durationUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDurationUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requestedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestDetails");
		if(fldEl != null)
		{	
    		obj.setRequestDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stoppedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStoppedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("stoppedDateTime");
		if(fldEl != null)
		{	
    		obj.setStoppedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "itemFrequency"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String VitalSignGroup = "vitalSignGroup";
		public static final String GroupFrequency = "groupFrequency";
		public static final String ItemFrequency = "itemFrequency";
		public static final String StartDateTime = "startDateTime";
		public static final String DurationValue = "durationValue";
		public static final String DurationUnit = "durationUnit";
		public static final String RequestedBy = "requestedBy";
		public static final String RequestDetails = "requestDetails";
		public static final String StoppedBy = "stoppedBy";
		public static final String StoppedDateTime = "stoppedDateTime";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

