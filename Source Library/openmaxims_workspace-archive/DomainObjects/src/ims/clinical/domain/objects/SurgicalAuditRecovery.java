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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class SurgicalAuditRecovery extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100106;
	private static final long serialVersionUID = 1072100106L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Recovery Room Nurse */
	private ims.core.resource.people.domain.objects.Nurse recoveryRoomNurse;
	/** Recovery Room Nurse is Locum Nurse? */
	private Boolean recoveryLocumBool;
	/** Recovery Room Locum Nurse name */
	private String recoveryLocumNurse;
	/** Confirm Patient Arrival  */
	private ims.domain.lookups.LookupInstance confirmPatientArrival;
	/** Time Patient Arrives in Recovery */
	private java.util.Date timeArrivesInRecovery;
	/** Time Ward Unit notified that Patient is Ready */
	private java.util.Date timeWardNotified;
	/** Time Patient Leaves Recovery  */
	private java.util.Date timeLeavesRecovery;
	/** Sent To */
	private ims.core.resource.place.domain.objects.Location sentTo;
	/** Handover from Recovery Nurse */
	private ims.core.resource.people.domain.objects.Nurse handoverfromRecoveryNurse;
	/** Recovery Handover Nurse is Locum Nurse? */
	private Boolean recoveryHandoverLocumBool;
	/** Recovery Handover Nurse name */
	private String recoveryHandoverLocumNurse;
	/** Ward Unit Nurse receiving Hand Over */
	private ims.core.resource.people.domain.objects.Nurse wardUnitNurse;
	/** Ward Nurse is Locum Nurse? */
	private Boolean wardLocumBool;
	/** Ward Nurse Locum name */
	private String wardLocumNurse;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalAuditRecovery (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalAuditRecovery ()
    {
    	super();
    }
    public SurgicalAuditRecovery (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalAuditRecovery.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.resource.people.domain.objects.Nurse getRecoveryRoomNurse() {
		return recoveryRoomNurse;
	}
	public void setRecoveryRoomNurse(ims.core.resource.people.domain.objects.Nurse recoveryRoomNurse) {
		this.recoveryRoomNurse = recoveryRoomNurse;
	}

	public Boolean isRecoveryLocumBool() {
		return recoveryLocumBool;
	}
	public void setRecoveryLocumBool(Boolean recoveryLocumBool) {
		this.recoveryLocumBool = recoveryLocumBool;
	}

	public String getRecoveryLocumNurse() {
		return recoveryLocumNurse;
	}
	public void setRecoveryLocumNurse(String recoveryLocumNurse) {
		if ( null != recoveryLocumNurse && recoveryLocumNurse.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recoveryLocumNurse. Tried to set value: "+
				recoveryLocumNurse);
		}
		this.recoveryLocumNurse = recoveryLocumNurse;
	}

	public ims.domain.lookups.LookupInstance getConfirmPatientArrival() {
		return confirmPatientArrival;
	}
	public void setConfirmPatientArrival(ims.domain.lookups.LookupInstance confirmPatientArrival) {
		this.confirmPatientArrival = confirmPatientArrival;
	}

	public java.util.Date getTimeArrivesInRecovery() {
		return timeArrivesInRecovery;
	}
	public void setTimeArrivesInRecovery(java.util.Date timeArrivesInRecovery) {
		this.timeArrivesInRecovery = timeArrivesInRecovery;
	}

	public java.util.Date getTimeWardNotified() {
		return timeWardNotified;
	}
	public void setTimeWardNotified(java.util.Date timeWardNotified) {
		this.timeWardNotified = timeWardNotified;
	}

	public java.util.Date getTimeLeavesRecovery() {
		return timeLeavesRecovery;
	}
	public void setTimeLeavesRecovery(java.util.Date timeLeavesRecovery) {
		this.timeLeavesRecovery = timeLeavesRecovery;
	}

	public ims.core.resource.place.domain.objects.Location getSentTo() {
		return sentTo;
	}
	public void setSentTo(ims.core.resource.place.domain.objects.Location sentTo) {
		this.sentTo = sentTo;
	}

	public ims.core.resource.people.domain.objects.Nurse getHandoverfromRecoveryNurse() {
		return handoverfromRecoveryNurse;
	}
	public void setHandoverfromRecoveryNurse(ims.core.resource.people.domain.objects.Nurse handoverfromRecoveryNurse) {
		this.handoverfromRecoveryNurse = handoverfromRecoveryNurse;
	}

	public Boolean isRecoveryHandoverLocumBool() {
		return recoveryHandoverLocumBool;
	}
	public void setRecoveryHandoverLocumBool(Boolean recoveryHandoverLocumBool) {
		this.recoveryHandoverLocumBool = recoveryHandoverLocumBool;
	}

	public String getRecoveryHandoverLocumNurse() {
		return recoveryHandoverLocumNurse;
	}
	public void setRecoveryHandoverLocumNurse(String recoveryHandoverLocumNurse) {
		if ( null != recoveryHandoverLocumNurse && recoveryHandoverLocumNurse.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recoveryHandoverLocumNurse. Tried to set value: "+
				recoveryHandoverLocumNurse);
		}
		this.recoveryHandoverLocumNurse = recoveryHandoverLocumNurse;
	}

	public ims.core.resource.people.domain.objects.Nurse getWardUnitNurse() {
		return wardUnitNurse;
	}
	public void setWardUnitNurse(ims.core.resource.people.domain.objects.Nurse wardUnitNurse) {
		this.wardUnitNurse = wardUnitNurse;
	}

	public Boolean isWardLocumBool() {
		return wardLocumBool;
	}
	public void setWardLocumBool(Boolean wardLocumBool) {
		this.wardLocumBool = wardLocumBool;
	}

	public String getWardLocumNurse() {
		return wardLocumNurse;
	}
	public void setWardLocumNurse(String wardLocumNurse) {
		if ( null != wardLocumNurse && wardLocumNurse.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wardLocumNurse. Tried to set value: "+
				wardLocumNurse);
		}
		this.wardLocumNurse = wardLocumNurse;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recoveryRoomNurse* :");
		if (recoveryRoomNurse != null)
		{
			auditStr.append(toShortClassName(recoveryRoomNurse));
				
		    auditStr.append(recoveryRoomNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recoveryLocumBool* :");
		auditStr.append(recoveryLocumBool);
	    auditStr.append("; ");
		auditStr.append("\r\n*recoveryLocumNurse* :");
		auditStr.append(recoveryLocumNurse);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmPatientArrival* :");
		if (confirmPatientArrival != null)
			auditStr.append(confirmPatientArrival.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*timeArrivesInRecovery* :");
		auditStr.append(timeArrivesInRecovery);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeWardNotified* :");
		auditStr.append(timeWardNotified);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeLeavesRecovery* :");
		auditStr.append(timeLeavesRecovery);
	    auditStr.append("; ");
		auditStr.append("\r\n*sentTo* :");
		if (sentTo != null)
		{
			auditStr.append(toShortClassName(sentTo));
				
		    auditStr.append(sentTo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*handoverfromRecoveryNurse* :");
		if (handoverfromRecoveryNurse != null)
		{
			auditStr.append(toShortClassName(handoverfromRecoveryNurse));
				
		    auditStr.append(handoverfromRecoveryNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recoveryHandoverLocumBool* :");
		auditStr.append(recoveryHandoverLocumBool);
	    auditStr.append("; ");
		auditStr.append("\r\n*recoveryHandoverLocumNurse* :");
		auditStr.append(recoveryHandoverLocumNurse);
	    auditStr.append("; ");
		auditStr.append("\r\n*wardUnitNurse* :");
		if (wardUnitNurse != null)
		{
			auditStr.append(toShortClassName(wardUnitNurse));
				
		    auditStr.append(wardUnitNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wardLocumBool* :");
		auditStr.append(wardLocumBool);
	    auditStr.append("; ");
		auditStr.append("\r\n*wardLocumNurse* :");
		auditStr.append(wardLocumNurse);
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
		
		String keyClassName = "SurgicalAuditRecovery";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getRecoveryRoomNurse() != null)
		{
			sb.append("<recoveryRoomNurse>");
			sb.append(this.getRecoveryRoomNurse().toXMLString(domMap)); 	
			sb.append("</recoveryRoomNurse>");		
		}
		if (this.isRecoveryLocumBool() != null)
		{
			sb.append("<recoveryLocumBool>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecoveryLocumBool().toString()));
			sb.append("</recoveryLocumBool>");		
		}
		if (this.getRecoveryLocumNurse() != null)
		{
			sb.append("<recoveryLocumNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecoveryLocumNurse().toString()));
			sb.append("</recoveryLocumNurse>");		
		}
		if (this.getConfirmPatientArrival() != null)
		{
			sb.append("<confirmPatientArrival>");
			sb.append(this.getConfirmPatientArrival().toXMLString()); 
			sb.append("</confirmPatientArrival>");		
		}
		if (this.getTimeArrivesInRecovery() != null)
		{
			sb.append("<timeArrivesInRecovery>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeArrivesInRecovery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeArrivesInRecovery>");		
		}
		if (this.getTimeWardNotified() != null)
		{
			sb.append("<timeWardNotified>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeWardNotified()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeWardNotified>");		
		}
		if (this.getTimeLeavesRecovery() != null)
		{
			sb.append("<timeLeavesRecovery>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeLeavesRecovery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeLeavesRecovery>");		
		}
		if (this.getSentTo() != null)
		{
			sb.append("<sentTo>");
			sb.append(this.getSentTo().toXMLString(domMap)); 	
			sb.append("</sentTo>");		
		}
		if (this.getHandoverfromRecoveryNurse() != null)
		{
			sb.append("<handoverfromRecoveryNurse>");
			sb.append(this.getHandoverfromRecoveryNurse().toXMLString(domMap)); 	
			sb.append("</handoverfromRecoveryNurse>");		
		}
		if (this.isRecoveryHandoverLocumBool() != null)
		{
			sb.append("<recoveryHandoverLocumBool>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecoveryHandoverLocumBool().toString()));
			sb.append("</recoveryHandoverLocumBool>");		
		}
		if (this.getRecoveryHandoverLocumNurse() != null)
		{
			sb.append("<recoveryHandoverLocumNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecoveryHandoverLocumNurse().toString()));
			sb.append("</recoveryHandoverLocumNurse>");		
		}
		if (this.getWardUnitNurse() != null)
		{
			sb.append("<wardUnitNurse>");
			sb.append(this.getWardUnitNurse().toXMLString(domMap)); 	
			sb.append("</wardUnitNurse>");		
		}
		if (this.isWardLocumBool() != null)
		{
			sb.append("<wardLocumBool>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWardLocumBool().toString()));
			sb.append("</wardLocumBool>");		
		}
		if (this.getWardLocumNurse() != null)
		{
			sb.append("<wardLocumNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWardLocumNurse().toString()));
			sb.append("</wardLocumNurse>");		
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
			SurgicalAuditRecovery domainObject = getSurgicalAuditRecoveryfromXML(itemEl, factory, domMap);

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
			SurgicalAuditRecovery domainObject = getSurgicalAuditRecoveryfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalAuditRecovery getSurgicalAuditRecoveryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalAuditRecoveryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalAuditRecovery getSurgicalAuditRecoveryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalAuditRecovery.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalAuditRecovery.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalAuditRecovery class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalAuditRecovery)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalAuditRecovery.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalAuditRecovery ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalAuditRecovery)factory.getImportedDomainObject(SurgicalAuditRecovery.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalAuditRecovery();
		}
		String keyClassName = "SurgicalAuditRecovery";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalAuditRecovery)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalAuditRecovery obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recoveryRoomNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecoveryRoomNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recoveryLocumBool");
		if(fldEl != null)
		{	
    		obj.setRecoveryLocumBool(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recoveryLocumNurse");
		if(fldEl != null)
		{	
    		obj.setRecoveryLocumNurse(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmPatientArrival");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConfirmPatientArrival(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("timeArrivesInRecovery");
		if(fldEl != null)
		{	
    		obj.setTimeArrivesInRecovery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeWardNotified");
		if(fldEl != null)
		{	
    		obj.setTimeWardNotified(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeLeavesRecovery");
		if(fldEl != null)
		{	
    		obj.setTimeLeavesRecovery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sentTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSentTo(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("handoverfromRecoveryNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHandoverfromRecoveryNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recoveryHandoverLocumBool");
		if(fldEl != null)
		{	
    		obj.setRecoveryHandoverLocumBool(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recoveryHandoverLocumNurse");
		if(fldEl != null)
		{	
    		obj.setRecoveryHandoverLocumNurse(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wardUnitNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWardUnitNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wardLocumBool");
		if(fldEl != null)
		{	
    		obj.setWardLocumBool(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wardLocumNurse");
		if(fldEl != null)
		{	
    		obj.setWardLocumNurse(new String(fldEl.getTextTrim()));	
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
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String RecoveryRoomNurse = "recoveryRoomNurse";
		public static final String RecoveryLocumBool = "recoveryLocumBool";
		public static final String RecoveryLocumNurse = "recoveryLocumNurse";
		public static final String ConfirmPatientArrival = "confirmPatientArrival";
		public static final String TimeArrivesInRecovery = "timeArrivesInRecovery";
		public static final String TimeWardNotified = "timeWardNotified";
		public static final String TimeLeavesRecovery = "timeLeavesRecovery";
		public static final String SentTo = "sentTo";
		public static final String HandoverfromRecoveryNurse = "handoverfromRecoveryNurse";
		public static final String RecoveryHandoverLocumBool = "recoveryHandoverLocumBool";
		public static final String RecoveryHandoverLocumNurse = "recoveryHandoverLocumNurse";
		public static final String WardUnitNurse = "wardUnitNurse";
		public static final String WardLocumBool = "wardLocumBool";
		public static final String WardLocumNurse = "wardLocumNurse";
	}
}

