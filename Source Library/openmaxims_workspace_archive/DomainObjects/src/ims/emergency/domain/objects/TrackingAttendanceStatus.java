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


public class TrackingAttendanceStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100013;
	private static final long serialVersionUID = 1086100013L;
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
	/** Current Area */
	private ims.emergency.configuration.domain.objects.TrackingArea trackingArea;
	/** Previous Area */
	private ims.emergency.configuration.domain.objects.TrackingArea prevTrackingArea;
	/** Status Date and time */
	private java.util.Date statusDatetime;
	/** Created By */
	private ims.core.resource.people.domain.objects.MemberOfStaff createdBy;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Previous Status */
	private ims.domain.lookups.LookupInstance prevStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TrackingAttendanceStatus (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TrackingAttendanceStatus ()
    {
    	super();
    }
    public TrackingAttendanceStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.TrackingAttendanceStatus.class;
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

	public ims.emergency.configuration.domain.objects.TrackingArea getTrackingArea() {
		return trackingArea;
	}
	public void setTrackingArea(ims.emergency.configuration.domain.objects.TrackingArea trackingArea) {
		this.trackingArea = trackingArea;
	}

	public ims.emergency.configuration.domain.objects.TrackingArea getPrevTrackingArea() {
		return prevTrackingArea;
	}
	public void setPrevTrackingArea(ims.emergency.configuration.domain.objects.TrackingArea prevTrackingArea) {
		this.prevTrackingArea = prevTrackingArea;
	}

	public java.util.Date getStatusDatetime() {
		return statusDatetime;
	}
	public void setStatusDatetime(java.util.Date statusDatetime) {
		this.statusDatetime = statusDatetime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(ims.core.resource.people.domain.objects.MemberOfStaff createdBy) {
		this.createdBy = createdBy;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getPrevStatus() {
		return prevStatus;
	}
	public void setPrevStatus(ims.domain.lookups.LookupInstance prevStatus) {
		this.prevStatus = prevStatus;
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
		auditStr.append("\r\n*trackingArea* :");
		if (trackingArea != null)
		{
			auditStr.append(toShortClassName(trackingArea));
				
		    auditStr.append(trackingArea.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prevTrackingArea* :");
		if (prevTrackingArea != null)
		{
			auditStr.append(toShortClassName(prevTrackingArea));
				
		    auditStr.append(prevTrackingArea.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusDatetime* :");
		auditStr.append(statusDatetime);
	    auditStr.append("; ");
		auditStr.append("\r\n*createdBy* :");
		if (createdBy != null)
		{
			auditStr.append(toShortClassName(createdBy));
				
		    auditStr.append(createdBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prevStatus* :");
		if (prevStatus != null)
			auditStr.append(prevStatus.getText());
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
		
		String keyClassName = "TrackingAttendanceStatus";
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
		if (this.getTrackingArea() != null)
		{
			sb.append("<trackingArea>");
			sb.append(this.getTrackingArea().toXMLString(domMap)); 	
			sb.append("</trackingArea>");		
		}
		if (this.getPrevTrackingArea() != null)
		{
			sb.append("<prevTrackingArea>");
			sb.append(this.getPrevTrackingArea().toXMLString(domMap)); 	
			sb.append("</prevTrackingArea>");		
		}
		if (this.getStatusDatetime() != null)
		{
			sb.append("<statusDatetime>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusDatetime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusDatetime>");		
		}
		if (this.getCreatedBy() != null)
		{
			sb.append("<createdBy>");
			sb.append(this.getCreatedBy().toXMLString(domMap)); 	
			sb.append("</createdBy>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getPrevStatus() != null)
		{
			sb.append("<prevStatus>");
			sb.append(this.getPrevStatus().toXMLString()); 
			sb.append("</prevStatus>");		
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
			TrackingAttendanceStatus domainObject = getTrackingAttendanceStatusfromXML(itemEl, factory, domMap);

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
			TrackingAttendanceStatus domainObject = getTrackingAttendanceStatusfromXML(itemEl, factory, domMap);

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
		
	public static TrackingAttendanceStatus getTrackingAttendanceStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTrackingAttendanceStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TrackingAttendanceStatus getTrackingAttendanceStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TrackingAttendanceStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TrackingAttendanceStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TrackingAttendanceStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TrackingAttendanceStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TrackingAttendanceStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TrackingAttendanceStatus ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TrackingAttendanceStatus)factory.getImportedDomainObject(TrackingAttendanceStatus.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TrackingAttendanceStatus();
		}
		String keyClassName = "TrackingAttendanceStatus";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TrackingAttendanceStatus)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TrackingAttendanceStatus obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("trackingArea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTrackingArea(ims.emergency.configuration.domain.objects.TrackingArea.getTrackingAreafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prevTrackingArea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrevTrackingArea(ims.emergency.configuration.domain.objects.TrackingArea.getTrackingAreafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusDatetime");
		if(fldEl != null)
		{	
    		obj.setStatusDatetime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("createdBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prevStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrevStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String TrackingArea = "trackingArea";
		public static final String PrevTrackingArea = "prevTrackingArea";
		public static final String StatusDatetime = "statusDatetime";
		public static final String CreatedBy = "createdBy";
		public static final String Status = "status";
		public static final String PrevStatus = "prevStatus";
	}
}

