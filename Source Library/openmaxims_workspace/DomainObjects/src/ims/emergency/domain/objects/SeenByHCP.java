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


public class SeenByHCP extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100034;
	private static final long serialVersionUID = 1086100034L;
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
	/** Allocated Date Time */
	private java.util.Date allocatedDateTime;
	/** Allocated Medic */
	private ims.core.resource.people.domain.objects.Medic allocatedMedic;
	/** Allocated Nurse */
	private ims.core.resource.people.domain.objects.Nurse allocatedNurse;
	/** Seen Date and Time */
	private java.util.Date seenDateTime;
	/** Completed Date and Time */
	private java.util.Date completedDateTime;
	/** Seen By HCP Notes
	  * Collection of ims.emergency.domain.objects.AttendanceClinicalNotes.
	  */
	private java.util.List seenByHCPNotes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SeenByHCP (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SeenByHCP ()
    {
    	super();
    }
    public SeenByHCP (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.SeenByHCP.class;
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

	public java.util.Date getAllocatedDateTime() {
		return allocatedDateTime;
	}
	public void setAllocatedDateTime(java.util.Date allocatedDateTime) {
		this.allocatedDateTime = allocatedDateTime;
	}

	public ims.core.resource.people.domain.objects.Medic getAllocatedMedic() {
		return allocatedMedic;
	}
	public void setAllocatedMedic(ims.core.resource.people.domain.objects.Medic allocatedMedic) {
		this.allocatedMedic = allocatedMedic;
	}

	public ims.core.resource.people.domain.objects.Nurse getAllocatedNurse() {
		return allocatedNurse;
	}
	public void setAllocatedNurse(ims.core.resource.people.domain.objects.Nurse allocatedNurse) {
		this.allocatedNurse = allocatedNurse;
	}

	public java.util.Date getSeenDateTime() {
		return seenDateTime;
	}
	public void setSeenDateTime(java.util.Date seenDateTime) {
		this.seenDateTime = seenDateTime;
	}

	public java.util.Date getCompletedDateTime() {
		return completedDateTime;
	}
	public void setCompletedDateTime(java.util.Date completedDateTime) {
		this.completedDateTime = completedDateTime;
	}

	public java.util.List getSeenByHCPNotes() {
		if ( null == seenByHCPNotes ) {
			seenByHCPNotes = new java.util.ArrayList();
		}
		return seenByHCPNotes;
	}
	public void setSeenByHCPNotes(java.util.List paramValue) {
		this.seenByHCPNotes = paramValue;
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
		auditStr.append("\r\n*allocatedDateTime* :");
		auditStr.append(allocatedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedMedic* :");
		if (allocatedMedic != null)
		{
			auditStr.append(toShortClassName(allocatedMedic));
				
		    auditStr.append(allocatedMedic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedNurse* :");
		if (allocatedNurse != null)
		{
			auditStr.append(toShortClassName(allocatedNurse));
				
		    auditStr.append(allocatedNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*seenDateTime* :");
		auditStr.append(seenDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*completedDateTime* :");
		auditStr.append(completedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*seenByHCPNotes* :");
		if (seenByHCPNotes != null)
		{
		int i10=0;
		for (i10=0; i10<seenByHCPNotes.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.emergency.domain.objects.AttendanceClinicalNotes obj = (ims.emergency.domain.objects.AttendanceClinicalNotes)seenByHCPNotes.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
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
		
		String keyClassName = "SeenByHCP";
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
		if (this.getAllocatedDateTime() != null)
		{
			sb.append("<allocatedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAllocatedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</allocatedDateTime>");		
		}
		if (this.getAllocatedMedic() != null)
		{
			sb.append("<allocatedMedic>");
			sb.append(this.getAllocatedMedic().toXMLString(domMap)); 	
			sb.append("</allocatedMedic>");		
		}
		if (this.getAllocatedNurse() != null)
		{
			sb.append("<allocatedNurse>");
			sb.append(this.getAllocatedNurse().toXMLString(domMap)); 	
			sb.append("</allocatedNurse>");		
		}
		if (this.getSeenDateTime() != null)
		{
			sb.append("<seenDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSeenDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</seenDateTime>");		
		}
		if (this.getCompletedDateTime() != null)
		{
			sb.append("<completedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedDateTime>");		
		}
		if (this.getSeenByHCPNotes() != null)
		{
			if (this.getSeenByHCPNotes().size() > 0 )
			{
			sb.append("<seenByHCPNotes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSeenByHCPNotes(), domMap));
			sb.append("</seenByHCPNotes>");		
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
			SeenByHCP domainObject = getSeenByHCPfromXML(itemEl, factory, domMap);

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
			SeenByHCP domainObject = getSeenByHCPfromXML(itemEl, factory, domMap);

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
		
	public static SeenByHCP getSeenByHCPfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSeenByHCPfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SeenByHCP getSeenByHCPfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SeenByHCP.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SeenByHCP.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SeenByHCP class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SeenByHCP)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SeenByHCP.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SeenByHCP ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SeenByHCP)factory.getImportedDomainObject(SeenByHCP.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SeenByHCP();
		}
		String keyClassName = "SeenByHCP";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SeenByHCP)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SeenByHCP obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("allocatedDateTime");
		if(fldEl != null)
		{	
    		obj.setAllocatedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("allocatedMedic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedMedic(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("seenDateTime");
		if(fldEl != null)
		{	
    		obj.setSeenDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("completedDateTime");
		if(fldEl != null)
		{	
    		obj.setCompletedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("seenByHCPNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSeenByHCPNotes(ims.emergency.domain.objects.AttendanceClinicalNotes.fromListXMLString(fldEl, factory, obj.getSeenByHCPNotes(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "seenByHCPNotes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String TrackingArea = "trackingArea";
		public static final String AllocatedDateTime = "allocatedDateTime";
		public static final String AllocatedMedic = "allocatedMedic";
		public static final String AllocatedNurse = "allocatedNurse";
		public static final String SeenDateTime = "seenDateTime";
		public static final String CompletedDateTime = "completedDateTime";
		public static final String SeenByHCPNotes = "seenByHCPNotes";
	}
}

