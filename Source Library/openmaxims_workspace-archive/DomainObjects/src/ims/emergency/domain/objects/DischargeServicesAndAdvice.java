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
package ims.emergency.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DischargeServicesAndAdvice extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100026;
	private static final long serialVersionUID = 1086100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Episode */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.CareContext attendance;
	/** Support Network Family
	  * Collection of ims.core.clinical.domain.objects.SupportNetworkFamily.
	  */
	private java.util.List supportNetworkFamily;
	/** Support Network Professional
	  * Collection of ims.core.clinical.domain.objects.SupportNetworkProfessional.
	  */
	private java.util.List supportNetworkProfessionals;
	/** Support Network Services
	  * Collection of ims.core.clinical.domain.objects.SupportNetworkServices.
	  */
	private java.util.List supportNetworkServices;
	/** PatientMobility
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List patientMobility;
	/** Transport Arranged Type */
	private ims.domain.lookups.LookupInstance transportArrangedType;
	/** Transport Date Time */
	private java.util.Date transportDateTime;
	/** Comments */
	private String comments;
	/** Equipment
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List equipment;
	/** BookingNo */
	private String bookingNo;
	/** Advice Leaflets Printed
	  * Collection of ims.core.clinical.domain.objects.AdviceLeaflets.
	  */
	private java.util.List adviceLeafletsPrinted;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeServicesAndAdvice (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeServicesAndAdvice ()
    {
    	super();
    }
    public DischargeServicesAndAdvice (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.DischargeServicesAndAdvice.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public ims.core.admin.domain.objects.CareContext getAttendance() {
		return attendance;
	}
	public void setAttendance(ims.core.admin.domain.objects.CareContext attendance) {
		this.attendance = attendance;
	}

	public java.util.List getSupportNetworkFamily() {
		if ( null == supportNetworkFamily ) {
			supportNetworkFamily = new java.util.ArrayList();
		}
		return supportNetworkFamily;
	}
	public void setSupportNetworkFamily(java.util.List paramValue) {
		this.supportNetworkFamily = paramValue;
	}

	public java.util.List getSupportNetworkProfessionals() {
		if ( null == supportNetworkProfessionals ) {
			supportNetworkProfessionals = new java.util.ArrayList();
		}
		return supportNetworkProfessionals;
	}
	public void setSupportNetworkProfessionals(java.util.List paramValue) {
		this.supportNetworkProfessionals = paramValue;
	}

	public java.util.List getSupportNetworkServices() {
		if ( null == supportNetworkServices ) {
			supportNetworkServices = new java.util.ArrayList();
		}
		return supportNetworkServices;
	}
	public void setSupportNetworkServices(java.util.List paramValue) {
		this.supportNetworkServices = paramValue;
	}

	public java.util.List getPatientMobility() {
		if ( null == patientMobility ) {
			patientMobility = new java.util.ArrayList();
		}
		return patientMobility;
	}
	public void setPatientMobility(java.util.List paramValue) {
		this.patientMobility = paramValue;
	}

	public ims.domain.lookups.LookupInstance getTransportArrangedType() {
		return transportArrangedType;
	}
	public void setTransportArrangedType(ims.domain.lookups.LookupInstance transportArrangedType) {
		this.transportArrangedType = transportArrangedType;
	}

	public java.util.Date getTransportDateTime() {
		return transportDateTime;
	}
	public void setTransportDateTime(java.util.Date transportDateTime) {
		this.transportDateTime = transportDateTime;
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

	public java.util.List getEquipment() {
		if ( null == equipment ) {
			equipment = new java.util.ArrayList();
		}
		return equipment;
	}
	public void setEquipment(java.util.List paramValue) {
		this.equipment = paramValue;
	}

	public String getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(String bookingNo) {
		if ( null != bookingNo && bookingNo.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bookingNo. Tried to set value: "+
				bookingNo);
		}
		this.bookingNo = bookingNo;
	}

	public java.util.List getAdviceLeafletsPrinted() {
		if ( null == adviceLeafletsPrinted ) {
			adviceLeafletsPrinted = new java.util.ArrayList();
		}
		return adviceLeafletsPrinted;
	}
	public void setAdviceLeafletsPrinted(java.util.List paramValue) {
		this.adviceLeafletsPrinted = paramValue;
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
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*attendance* :");
		if (attendance != null)
		{
			auditStr.append(toShortClassName(attendance));
				
		    auditStr.append(attendance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supportNetworkFamily* :");
		if (supportNetworkFamily != null)
		{
		int i4=0;
		for (i4=0; i4<supportNetworkFamily.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.SupportNetworkFamily obj = (ims.core.clinical.domain.objects.SupportNetworkFamily)supportNetworkFamily.get(i4);
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
		auditStr.append("\r\n*supportNetworkProfessionals* :");
		if (supportNetworkProfessionals != null)
		{
		int i5=0;
		for (i5=0; i5<supportNetworkProfessionals.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.SupportNetworkProfessional obj = (ims.core.clinical.domain.objects.SupportNetworkProfessional)supportNetworkProfessionals.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supportNetworkServices* :");
		if (supportNetworkServices != null)
		{
		int i6=0;
		for (i6=0; i6<supportNetworkServices.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.SupportNetworkServices obj = (ims.core.clinical.domain.objects.SupportNetworkServices)supportNetworkServices.get(i6);
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
		auditStr.append("\r\n*patientMobility* :");
		if (patientMobility != null)
		{
		int i7=0;
		for (i7=0; i7<patientMobility.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)patientMobility.get(i7);
			auditStr.append(obj.getText());
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transportArrangedType* :");
		if (transportArrangedType != null)
			auditStr.append(transportArrangedType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transportDateTime* :");
		auditStr.append(transportDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*equipment* :");
		if (equipment != null)
		{
			java.util.Iterator it11 = equipment.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it11.next();
			auditStr.append(obj.getText());
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingNo* :");
		auditStr.append(bookingNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceLeafletsPrinted* :");
		if (adviceLeafletsPrinted != null)
		{
		int i13=0;
		for (i13=0; i13<adviceLeafletsPrinted.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.AdviceLeaflets obj = (ims.core.clinical.domain.objects.AdviceLeaflets)adviceLeafletsPrinted.get(i13);
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
		
		String keyClassName = "DischargeServicesAndAdvice";
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
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAttendance() != null)
		{
			sb.append("<attendance>");
			sb.append(this.getAttendance().toXMLString(domMap)); 	
			sb.append("</attendance>");		
		}
		if (this.getSupportNetworkFamily() != null)
		{
			if (this.getSupportNetworkFamily().size() > 0 )
			{
			sb.append("<supportNetworkFamily>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSupportNetworkFamily(), domMap));
			sb.append("</supportNetworkFamily>");		
			}
		}
		if (this.getSupportNetworkProfessionals() != null)
		{
			if (this.getSupportNetworkProfessionals().size() > 0 )
			{
			sb.append("<supportNetworkProfessionals>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSupportNetworkProfessionals(), domMap));
			sb.append("</supportNetworkProfessionals>");		
			}
		}
		if (this.getSupportNetworkServices() != null)
		{
			if (this.getSupportNetworkServices().size() > 0 )
			{
			sb.append("<supportNetworkServices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSupportNetworkServices(), domMap));
			sb.append("</supportNetworkServices>");		
			}
		}
		if (this.getPatientMobility() != null)
		{
			if (this.getPatientMobility().size() > 0 )
			{
			sb.append("<patientMobility>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getPatientMobility())); 
			sb.append("</patientMobility>");		
			}
		}
		if (this.getTransportArrangedType() != null)
		{
			sb.append("<transportArrangedType>");
			sb.append(this.getTransportArrangedType().toXMLString()); 
			sb.append("</transportArrangedType>");		
		}
		if (this.getTransportDateTime() != null)
		{
			sb.append("<transportDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTransportDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transportDateTime>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getEquipment() != null)
		{
			if (this.getEquipment().size() > 0 )
			{
			sb.append("<equipment>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getEquipment())); 
			sb.append("</equipment>");		
			}
		}
		if (this.getBookingNo() != null)
		{
			sb.append("<bookingNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBookingNo().toString()));
			sb.append("</bookingNo>");		
		}
		if (this.getAdviceLeafletsPrinted() != null)
		{
			if (this.getAdviceLeafletsPrinted().size() > 0 )
			{
			sb.append("<adviceLeafletsPrinted>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdviceLeafletsPrinted(), domMap));
			sb.append("</adviceLeafletsPrinted>");		
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
			DischargeServicesAndAdvice domainObject = getDischargeServicesAndAdvicefromXML(itemEl, factory, domMap);

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
			DischargeServicesAndAdvice domainObject = getDischargeServicesAndAdvicefromXML(itemEl, factory, domMap);

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
		
	public static DischargeServicesAndAdvice getDischargeServicesAndAdvicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeServicesAndAdvicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeServicesAndAdvice getDischargeServicesAndAdvicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeServicesAndAdvice.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeServicesAndAdvice.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeServicesAndAdvice class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeServicesAndAdvice)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeServicesAndAdvice.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeServicesAndAdvice ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeServicesAndAdvice)factory.getImportedDomainObject(DischargeServicesAndAdvice.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeServicesAndAdvice();
		}
		String keyClassName = "DischargeServicesAndAdvice";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeServicesAndAdvice)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeServicesAndAdvice obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendance(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("supportNetworkFamily");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSupportNetworkFamily(ims.core.clinical.domain.objects.SupportNetworkFamily.fromListXMLString(fldEl, factory, obj.getSupportNetworkFamily(), domMap));
		}
		fldEl = el.element("supportNetworkProfessionals");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSupportNetworkProfessionals(ims.core.clinical.domain.objects.SupportNetworkProfessional.fromListXMLString(fldEl, factory, obj.getSupportNetworkProfessionals(), domMap));
		}
		fldEl = el.element("supportNetworkServices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSupportNetworkServices(ims.core.clinical.domain.objects.SupportNetworkServices.fromListXMLString(fldEl, factory, obj.getSupportNetworkServices(), domMap));
		}
		fldEl = el.element("patientMobility");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientMobility(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getPatientMobility())); 
		}
		fldEl = el.element("transportArrangedType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransportArrangedType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transportDateTime");
		if(fldEl != null)
		{	
    		obj.setTransportDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("equipment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setEquipment(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getEquipment())); 
		}
		fldEl = el.element("bookingNo");
		if(fldEl != null)
		{	
    		obj.setBookingNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("adviceLeafletsPrinted");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdviceLeafletsPrinted(ims.core.clinical.domain.objects.AdviceLeaflets.fromListXMLString(fldEl, factory, obj.getAdviceLeafletsPrinted(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "supportNetworkFamily"
		, "supportNetworkProfessionals"
		, "supportNetworkServices"
		, "patientMobility"
		, "equipment"
		, "adviceLeafletsPrinted"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String SupportNetworkFamily = "supportNetworkFamily";
		public static final String SupportNetworkProfessionals = "supportNetworkProfessionals";
		public static final String SupportNetworkServices = "supportNetworkServices";
		public static final String PatientMobility = "patientMobility";
		public static final String TransportArrangedType = "transportArrangedType";
		public static final String TransportDateTime = "transportDateTime";
		public static final String Comments = "comments";
		public static final String Equipment = "equipment";
		public static final String BookingNo = "bookingNo";
		public static final String AdviceLeafletsPrinted = "adviceLeafletsPrinted";
	}
}

