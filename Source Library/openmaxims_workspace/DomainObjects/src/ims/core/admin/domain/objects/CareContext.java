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
 * Care Context (Level 2 record)
 * @author Neil McAnaspie
 * Generated.
 */


public class CareContext extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100019;
	private static final long serialVersionUID = 1004100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Context type */
	private ims.domain.lookups.LookupInstance context;
	/** StartDateTime */
	private java.util.Date startDateTime;
	/** End Date Time */
	private java.util.Date endDateTime;
	/** Episode Of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Clinical Contacts
	  * Collection of ims.core.admin.domain.objects.ClinicalContact.
	  */
	private java.util.Set clinicalContacts;
	/** LocationType - Home/Hospital/OPD */
	private ims.domain.lookups.LookupInstance locationType;
	/** pasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Bed Number */
	private String bedNumber;
	/** Overall Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
	/** History of any updates to the Care Context
	  * Collection of ims.core.admin.domain.objects.CareContextHistory.
	  */
	private java.util.Set careContextHistory;
	/** Discharge Reason */
	private ims.domain.lookups.LookupInstance dischargeReason;
	/** GHG specific: Hospital to associate the PADID with see wdev-8997 */
	private ims.core.resource.place.domain.objects.LocSite orderingHospital;
	/** Current Status */
	private ims.core.admin.domain.objects.CareContextStatusHistory currentStatus;
	/** Status History
	  * Collection of ims.core.admin.domain.objects.CareContextStatusHistory.
	  */
	private java.util.List statusHistory;
	/** Estimated Discharge Date */
	private java.util.Date estimatedDischargeDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CareContext (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CareContext ()
    {
    	super();
    }
    public CareContext (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.CareContext.class;
	}


	public ims.domain.lookups.LookupInstance getContext() {
		return context;
	}
	public void setContext(ims.domain.lookups.LookupInstance context) {
		this.context = context;
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

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public java.util.Set getClinicalContacts() {
		if ( null == clinicalContacts ) {
			clinicalContacts = new java.util.HashSet();
		}
		return clinicalContacts;
	}
	public void setClinicalContacts(java.util.Set paramValue) {
		this.clinicalContacts = paramValue;
	}

	public ims.domain.lookups.LookupInstance getLocationType() {
		return locationType;
	}
	public void setLocationType(ims.domain.lookups.LookupInstance locationType) {
		this.locationType = locationType;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public static java.util.List listCareContextByPasEvent(ims.domain.ILightweightDomainFactory factory, ims.core.admin.pas.domain.objects.PASEvent val)
	{
		String hql = "from CareContext c where c.pasEvent = :pasEvent";		
		return factory.find(hql, new String[]{"pasEvent"}, new Object[]{val});		
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public String getBedNumber() {
		return bedNumber;
	}
	public void setBedNumber(String bedNumber) {
		if ( null != bedNumber && bedNumber.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bedNumber. Tried to set value: "+
				bedNumber);
		}
		this.bedNumber = bedNumber;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public java.util.Set getCareContextHistory() {
		if ( null == careContextHistory ) {
			careContextHistory = new java.util.HashSet();
		}
		return careContextHistory;
	}
	public void setCareContextHistory(java.util.Set paramValue) {
		this.careContextHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDischargeReason() {
		return dischargeReason;
	}
	public void setDischargeReason(ims.domain.lookups.LookupInstance dischargeReason) {
		this.dischargeReason = dischargeReason;
	}

	public ims.core.resource.place.domain.objects.LocSite getOrderingHospital() {
		return orderingHospital;
	}
	public void setOrderingHospital(ims.core.resource.place.domain.objects.LocSite orderingHospital) {
		this.orderingHospital = orderingHospital;
	}

	public ims.core.admin.domain.objects.CareContextStatusHistory getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.admin.domain.objects.CareContextStatusHistory currentStatus) {
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

	public java.util.Date getEstimatedDischargeDate() {
		return estimatedDischargeDate;
	}
	public void setEstimatedDischargeDate(java.util.Date estimatedDischargeDate) {
		this.estimatedDischargeDate = estimatedDischargeDate;
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
		
		auditStr.append("\r\n*context* :");
		if (context != null)
			auditStr.append(context.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateTime* :");
		auditStr.append(endDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContacts* :");
		if (clinicalContacts != null)
		{
			java.util.Iterator it5 = clinicalContacts.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.ClinicalContact obj = (ims.core.admin.domain.objects.ClinicalContact)it5.next();
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
		auditStr.append("\r\n*locationType* :");
		if (locationType != null)
			auditStr.append(locationType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bedNumber* :");
		auditStr.append(bedNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContextHistory* :");
		if (careContextHistory != null)
		{
			java.util.Iterator it10 = careContextHistory.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.CareContextHistory obj = (ims.core.admin.domain.objects.CareContextHistory)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeReason* :");
		if (dischargeReason != null)
			auditStr.append(dischargeReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*orderingHospital* :");
		if (orderingHospital != null)
		{
			auditStr.append(toShortClassName(orderingHospital));
				
		    auditStr.append(orderingHospital.getId());
		}
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
		int i14=0;
		for (i14=0; i14<statusHistory.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.CareContextStatusHistory obj = (ims.core.admin.domain.objects.CareContextStatusHistory)statusHistory.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*estimatedDischargeDate* :");
		auditStr.append(estimatedDischargeDate);
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
		
		String keyClassName = "CareContext";
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
		if (this.getContext() != null)
		{
			sb.append("<context>");
			sb.append(this.getContext().toXMLString()); 
			sb.append("</context>");		
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
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getClinicalContacts() != null)
		{
			if (this.getClinicalContacts().size() > 0 )
			{
			sb.append("<clinicalContacts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinicalContacts(), domMap));
			sb.append("</clinicalContacts>");		
			}
		}
		if (this.getLocationType() != null)
		{
			sb.append("<locationType>");
			sb.append(this.getLocationType().toXMLString()); 
			sb.append("</locationType>");		
		}
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getBedNumber() != null)
		{
			sb.append("<bedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedNumber().toString()));
			sb.append("</bedNumber>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.getCareContextHistory() != null)
		{
			if (this.getCareContextHistory().size() > 0 )
			{
			sb.append("<careContextHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCareContextHistory(), domMap));
			sb.append("</careContextHistory>");		
			}
		}
		if (this.getDischargeReason() != null)
		{
			sb.append("<dischargeReason>");
			sb.append(this.getDischargeReason().toXMLString()); 
			sb.append("</dischargeReason>");		
		}
		if (this.getOrderingHospital() != null)
		{
			sb.append("<orderingHospital>");
			sb.append(this.getOrderingHospital().toXMLString(domMap)); 	
			sb.append("</orderingHospital>");		
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
		if (this.getEstimatedDischargeDate() != null)
		{
			sb.append("<estimatedDischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEstimatedDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estimatedDischargeDate>");		
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
			CareContext domainObject = getCareContextfromXML(itemEl, factory, domMap);

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
			CareContext domainObject = getCareContextfromXML(itemEl, factory, domMap);

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
		
	public static CareContext getCareContextfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCareContextfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CareContext getCareContextfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CareContext.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CareContext.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CareContext class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CareContext)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CareContext.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CareContext ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CareContext)factory.getImportedDomainObject(CareContext.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CareContext();
		}
		String keyClassName = "CareContext";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CareContext)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CareContext obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("context");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContacts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClinicalContacts(ims.core.admin.domain.objects.ClinicalContact.fromSetXMLString(fldEl, factory, obj.getClinicalContacts(), domMap));
		}
		fldEl = el.element("locationType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLocationType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bedNumber");
		if(fldEl != null)
		{	
    		obj.setBedNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContextHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCareContextHistory(ims.core.admin.domain.objects.CareContextHistory.fromSetXMLString(fldEl, factory, obj.getCareContextHistory(), domMap));
		}
		fldEl = el.element("dischargeReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("orderingHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderingHospital(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.admin.domain.objects.CareContextStatusHistory.getCareContextStatusHistoryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.core.admin.domain.objects.CareContextStatusHistory.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("estimatedDischargeDate");
		if(fldEl != null)
		{	
    		obj.setEstimatedDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "clinicalContacts"
		, "careContextHistory"
		, "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Context = "context";
		public static final String StartDateTime = "startDateTime";
		public static final String EndDateTime = "endDateTime";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String ClinicalContacts = "clinicalContacts";
		public static final String LocationType = "locationType";
		public static final String PasEvent = "pasEvent";
		public static final String BedNumber = "bedNumber";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String CareContextHistory = "careContextHistory";
		public static final String DischargeReason = "dischargeReason";
		public static final String OrderingHospital = "orderingHospital";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String EstimatedDischargeDate = "estimatedDischargeDate";
	}
}

