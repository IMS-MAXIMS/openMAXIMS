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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class Appt_Tracking_Status_History extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100015;
	private static final long serialVersionUID = 1090100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Tracking Status */
	private ims.domain.lookups.LookupInstance trackingStatus;
	/** ApptDate */
	private java.util.Date apptDate;
	/** ApptTime */
	private String apptTime;
	/** Status Change Date Time */
	private java.util.Date statusChangeDateTime;
	/** ChangedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff changedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Appt_Tracking_Status_History (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Appt_Tracking_Status_History ()
    {
    	super();
    }
    public Appt_Tracking_Status_History (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Appt_Tracking_Status_History.class;
	}


	public ims.domain.lookups.LookupInstance getTrackingStatus() {
		return trackingStatus;
	}
	public void setTrackingStatus(ims.domain.lookups.LookupInstance trackingStatus) {
		this.trackingStatus = trackingStatus;
	}

	public java.util.Date getApptDate() {
		return apptDate;
	}
	public void setApptDate(java.util.Date apptDate) {
		this.apptDate = apptDate;
	}

	public String getApptTime() {
		return apptTime;
	}
	public void setApptTime(String apptTime) {
		this.apptTime = apptTime;
	}

	public java.util.Date getStatusChangeDateTime() {
		return statusChangeDateTime;
	}
	public void setStatusChangeDateTime(java.util.Date statusChangeDateTime) {
		this.statusChangeDateTime = statusChangeDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(ims.core.resource.people.domain.objects.MemberOfStaff changedBy) {
		this.changedBy = changedBy;
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
		
		auditStr.append("\r\n*trackingStatus* :");
		if (trackingStatus != null)
			auditStr.append(trackingStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*apptDate* :");
		auditStr.append(apptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptTime* :");
		auditStr.append(apptTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*statusChangeDateTime* :");
		auditStr.append(statusChangeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*changedBy* :");
		if (changedBy != null)
		{
			auditStr.append(toShortClassName(changedBy));
				
		    auditStr.append(changedBy.getId());
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
		
		String keyClassName = "Appt_Tracking_Status_History";
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
		if (this.getTrackingStatus() != null)
		{
			sb.append("<trackingStatus>");
			sb.append(this.getTrackingStatus().toXMLString()); 
			sb.append("</trackingStatus>");		
		}
		if (this.getApptDate() != null)
		{
			sb.append("<apptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getApptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</apptDate>");		
		}
		if (this.getApptTime() != null)
		{
			sb.append("<apptTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptTime().toString()));
			sb.append("</apptTime>");		
		}
		if (this.getStatusChangeDateTime() != null)
		{
			sb.append("<statusChangeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusChangeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusChangeDateTime>");		
		}
		if (this.getChangedBy() != null)
		{
			sb.append("<changedBy>");
			sb.append(this.getChangedBy().toXMLString(domMap)); 	
			sb.append("</changedBy>");		
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
			Appt_Tracking_Status_History domainObject = getAppt_Tracking_Status_HistoryfromXML(itemEl, factory, domMap);

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
			Appt_Tracking_Status_History domainObject = getAppt_Tracking_Status_HistoryfromXML(itemEl, factory, domMap);

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
		
	public static Appt_Tracking_Status_History getAppt_Tracking_Status_HistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppt_Tracking_Status_HistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Appt_Tracking_Status_History getAppt_Tracking_Status_HistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Appt_Tracking_Status_History.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Appt_Tracking_Status_History.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Appt_Tracking_Status_History class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Appt_Tracking_Status_History)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Appt_Tracking_Status_History.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Appt_Tracking_Status_History ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Appt_Tracking_Status_History)factory.getImportedDomainObject(Appt_Tracking_Status_History.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Appt_Tracking_Status_History();
		}
		String keyClassName = "Appt_Tracking_Status_History";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Appt_Tracking_Status_History)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Appt_Tracking_Status_History obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("trackingStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTrackingStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("apptDate");
		if(fldEl != null)
		{	
    		obj.setApptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("apptTime");
		if(fldEl != null)
		{	
    		obj.setApptTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statusChangeDateTime");
		if(fldEl != null)
		{	
    		obj.setStatusChangeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("changedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setChangedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
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
		public static final String TrackingStatus = "trackingStatus";
		public static final String ApptDate = "apptDate";
		public static final String ApptTime = "apptTime";
		public static final String StatusChangeDateTime = "statusChangeDateTime";
		public static final String ChangedBy = "changedBy";
	}
}

