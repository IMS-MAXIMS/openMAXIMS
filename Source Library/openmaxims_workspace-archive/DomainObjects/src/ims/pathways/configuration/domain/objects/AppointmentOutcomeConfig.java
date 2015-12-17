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
package ims.pathways.configuration.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class AppointmentOutcomeConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100065;
	private static final long serialVersionUID = 1004100065L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AppointmentOutcome */
	private ims.domain.lookups.LookupInstance appointmentOutcome;
	/** AppointmentOutcomeReasons
	  * Collection of ims.pathways.configuration.domain.objects.AppointmentOutcomeReasons.
	  */
	private java.util.List appointmentOutcomeReasons;
	/** ShowFirstDefinitiveTreatment */
	private Boolean showFirstDefinitiveTreatment;
	/** FirstDefinitiveTreatmentEvent */
	private ims.pathways.configuration.domain.objects.Event firstDefinitiveTreatmentEvent;
	/** CanAddtoWaitingList */
	private Boolean canAddtoWaitingList;
	/** CanAddtoBookedList */
	private Boolean canAddtoBookedList;
	/** CanAddtoPlannedList */
	private Boolean canAddtoPlannedList;
	/** CanMakeAppointment */
	private Boolean canMakeAppointment;
	/** CanMakeOnwardReferral */
	private Boolean canMakeOnwardReferral;
	/** CanTransfer */
	private Boolean canTransfer;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppointmentOutcomeConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppointmentOutcomeConfig ()
    {
    	super();
    }
    public AppointmentOutcomeConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.configuration.domain.objects.AppointmentOutcomeConfig.class;
	}


	public ims.domain.lookups.LookupInstance getAppointmentOutcome() {
		return appointmentOutcome;
	}
	public void setAppointmentOutcome(ims.domain.lookups.LookupInstance appointmentOutcome) {
		this.appointmentOutcome = appointmentOutcome;
	}

	public java.util.List getAppointmentOutcomeReasons() {
		if ( null == appointmentOutcomeReasons ) {
			appointmentOutcomeReasons = new java.util.ArrayList();
		}
		return appointmentOutcomeReasons;
	}
	public void setAppointmentOutcomeReasons(java.util.List paramValue) {
		this.appointmentOutcomeReasons = paramValue;
	}

	public Boolean isShowFirstDefinitiveTreatment() {
		return showFirstDefinitiveTreatment;
	}
	public void setShowFirstDefinitiveTreatment(Boolean showFirstDefinitiveTreatment) {
		this.showFirstDefinitiveTreatment = showFirstDefinitiveTreatment;
	}

	public ims.pathways.configuration.domain.objects.Event getFirstDefinitiveTreatmentEvent() {
		return firstDefinitiveTreatmentEvent;
	}
	public void setFirstDefinitiveTreatmentEvent(ims.pathways.configuration.domain.objects.Event firstDefinitiveTreatmentEvent) {
		this.firstDefinitiveTreatmentEvent = firstDefinitiveTreatmentEvent;
	}

	public Boolean isCanAddtoWaitingList() {
		return canAddtoWaitingList;
	}
	public void setCanAddtoWaitingList(Boolean canAddtoWaitingList) {
		this.canAddtoWaitingList = canAddtoWaitingList;
	}

	public Boolean isCanAddtoBookedList() {
		return canAddtoBookedList;
	}
	public void setCanAddtoBookedList(Boolean canAddtoBookedList) {
		this.canAddtoBookedList = canAddtoBookedList;
	}

	public Boolean isCanAddtoPlannedList() {
		return canAddtoPlannedList;
	}
	public void setCanAddtoPlannedList(Boolean canAddtoPlannedList) {
		this.canAddtoPlannedList = canAddtoPlannedList;
	}

	public Boolean isCanMakeAppointment() {
		return canMakeAppointment;
	}
	public void setCanMakeAppointment(Boolean canMakeAppointment) {
		this.canMakeAppointment = canMakeAppointment;
	}

	public Boolean isCanMakeOnwardReferral() {
		return canMakeOnwardReferral;
	}
	public void setCanMakeOnwardReferral(Boolean canMakeOnwardReferral) {
		this.canMakeOnwardReferral = canMakeOnwardReferral;
	}

	public Boolean isCanTransfer() {
		return canTransfer;
	}
	public void setCanTransfer(Boolean canTransfer) {
		this.canTransfer = canTransfer;
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
		
		auditStr.append("\r\n*appointmentOutcome* :");
		if (appointmentOutcome != null)
			auditStr.append(appointmentOutcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentOutcomeReasons* :");
		if (appointmentOutcomeReasons != null)
		{
		int i2=0;
		for (i2=0; i2<appointmentOutcomeReasons.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.pathways.configuration.domain.objects.AppointmentOutcomeReasons obj = (ims.pathways.configuration.domain.objects.AppointmentOutcomeReasons)appointmentOutcomeReasons.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*showFirstDefinitiveTreatment* :");
		auditStr.append(showFirstDefinitiveTreatment);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstDefinitiveTreatmentEvent* :");
		if (firstDefinitiveTreatmentEvent != null)
		{
			auditStr.append(toShortClassName(firstDefinitiveTreatmentEvent));
				
		    auditStr.append(firstDefinitiveTreatmentEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*canAddtoWaitingList* :");
		auditStr.append(canAddtoWaitingList);
	    auditStr.append("; ");
		auditStr.append("\r\n*canAddtoBookedList* :");
		auditStr.append(canAddtoBookedList);
	    auditStr.append("; ");
		auditStr.append("\r\n*canAddtoPlannedList* :");
		auditStr.append(canAddtoPlannedList);
	    auditStr.append("; ");
		auditStr.append("\r\n*canMakeAppointment* :");
		auditStr.append(canMakeAppointment);
	    auditStr.append("; ");
		auditStr.append("\r\n*canMakeOnwardReferral* :");
		auditStr.append(canMakeOnwardReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*canTransfer* :");
		auditStr.append(canTransfer);
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
		
		String keyClassName = "AppointmentOutcomeConfig";
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
		if (this.getAppointmentOutcome() != null)
		{
			sb.append("<appointmentOutcome>");
			sb.append(this.getAppointmentOutcome().toXMLString()); 
			sb.append("</appointmentOutcome>");		
		}
		if (this.getAppointmentOutcomeReasons() != null)
		{
			if (this.getAppointmentOutcomeReasons().size() > 0 )
			{
			sb.append("<appointmentOutcomeReasons>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAppointmentOutcomeReasons(), domMap));
			sb.append("</appointmentOutcomeReasons>");		
			}
		}
		if (this.isShowFirstDefinitiveTreatment() != null)
		{
			sb.append("<showFirstDefinitiveTreatment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isShowFirstDefinitiveTreatment().toString()));
			sb.append("</showFirstDefinitiveTreatment>");		
		}
		if (this.getFirstDefinitiveTreatmentEvent() != null)
		{
			sb.append("<firstDefinitiveTreatmentEvent>");
			sb.append(this.getFirstDefinitiveTreatmentEvent().toXMLString(domMap)); 	
			sb.append("</firstDefinitiveTreatmentEvent>");		
		}
		if (this.isCanAddtoWaitingList() != null)
		{
			sb.append("<canAddtoWaitingList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanAddtoWaitingList().toString()));
			sb.append("</canAddtoWaitingList>");		
		}
		if (this.isCanAddtoBookedList() != null)
		{
			sb.append("<canAddtoBookedList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanAddtoBookedList().toString()));
			sb.append("</canAddtoBookedList>");		
		}
		if (this.isCanAddtoPlannedList() != null)
		{
			sb.append("<canAddtoPlannedList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanAddtoPlannedList().toString()));
			sb.append("</canAddtoPlannedList>");		
		}
		if (this.isCanMakeAppointment() != null)
		{
			sb.append("<canMakeAppointment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanMakeAppointment().toString()));
			sb.append("</canMakeAppointment>");		
		}
		if (this.isCanMakeOnwardReferral() != null)
		{
			sb.append("<canMakeOnwardReferral>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanMakeOnwardReferral().toString()));
			sb.append("</canMakeOnwardReferral>");		
		}
		if (this.isCanTransfer() != null)
		{
			sb.append("<canTransfer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanTransfer().toString()));
			sb.append("</canTransfer>");		
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
			AppointmentOutcomeConfig domainObject = getAppointmentOutcomeConfigfromXML(itemEl, factory, domMap);

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
			AppointmentOutcomeConfig domainObject = getAppointmentOutcomeConfigfromXML(itemEl, factory, domMap);

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
		
	public static AppointmentOutcomeConfig getAppointmentOutcomeConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentOutcomeConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppointmentOutcomeConfig getAppointmentOutcomeConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppointmentOutcomeConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppointmentOutcomeConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppointmentOutcomeConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppointmentOutcomeConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppointmentOutcomeConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppointmentOutcomeConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppointmentOutcomeConfig)factory.getImportedDomainObject(AppointmentOutcomeConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppointmentOutcomeConfig();
		}
		String keyClassName = "AppointmentOutcomeConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppointmentOutcomeConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppointmentOutcomeConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("appointmentOutcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAppointmentOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appointmentOutcomeReasons");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAppointmentOutcomeReasons(ims.pathways.configuration.domain.objects.AppointmentOutcomeReasons.fromListXMLString(fldEl, factory, obj.getAppointmentOutcomeReasons(), domMap));
		}
		fldEl = el.element("showFirstDefinitiveTreatment");
		if(fldEl != null)
		{	
    		obj.setShowFirstDefinitiveTreatment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstDefinitiveTreatmentEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFirstDefinitiveTreatmentEvent(ims.pathways.configuration.domain.objects.Event.getEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("canAddtoWaitingList");
		if(fldEl != null)
		{	
    		obj.setCanAddtoWaitingList(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canAddtoBookedList");
		if(fldEl != null)
		{	
    		obj.setCanAddtoBookedList(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canAddtoPlannedList");
		if(fldEl != null)
		{	
    		obj.setCanAddtoPlannedList(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canMakeAppointment");
		if(fldEl != null)
		{	
    		obj.setCanMakeAppointment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canMakeOnwardReferral");
		if(fldEl != null)
		{	
    		obj.setCanMakeOnwardReferral(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canTransfer");
		if(fldEl != null)
		{	
    		obj.setCanTransfer(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "appointmentOutcomeReasons"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AppointmentOutcome = "appointmentOutcome";
		public static final String AppointmentOutcomeReasons = "appointmentOutcomeReasons";
		public static final String ShowFirstDefinitiveTreatment = "showFirstDefinitiveTreatment";
		public static final String FirstDefinitiveTreatmentEvent = "firstDefinitiveTreatmentEvent";
		public static final String CanAddtoWaitingList = "canAddtoWaitingList";
		public static final String CanAddtoBookedList = "canAddtoBookedList";
		public static final String CanAddtoPlannedList = "canAddtoPlannedList";
		public static final String CanMakeAppointment = "canMakeAppointment";
		public static final String CanMakeOnwardReferral = "canMakeOnwardReferral";
		public static final String CanTransfer = "canTransfer";
	}
}

