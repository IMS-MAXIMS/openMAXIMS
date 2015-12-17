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
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class ChartRequested extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100033;
	private static final long serialVersionUID = 1086100033L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** EmergencyAttendence */
	private ims.core.admin.domain.objects.EmergencyAttendance emergencyAttendence;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Episode */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.CareContext attendance;
	/** Chart Required by Triage */
	private ims.domain.lookups.LookupInstance chartRequiredbyTriage;
	/** Chart Requested by Reception */
	private ims.domain.lookups.LookupInstance requestedbyReception;
	/** Date Time Requested */
	private java.util.Date dateTimeRequested;
	/** Reason not requested */
	private ims.domain.lookups.LookupInstance reasonnotrequested;
	/** Chart Received */
	private ims.domain.lookups.LookupInstance chartReceived;
	/** Date Time Received */
	private java.util.Date dateTimeReceived;
	/** Comment */
	private String comment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ChartRequested (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ChartRequested ()
    {
    	super();
    }
    public ChartRequested (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.ChartRequested.class;
	}


	public ims.core.admin.domain.objects.EmergencyAttendance getEmergencyAttendence() {
		return emergencyAttendence;
	}
	public void setEmergencyAttendence(ims.core.admin.domain.objects.EmergencyAttendance emergencyAttendence) {
		this.emergencyAttendence = emergencyAttendence;
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

	public ims.domain.lookups.LookupInstance getChartRequiredbyTriage() {
		return chartRequiredbyTriage;
	}
	public void setChartRequiredbyTriage(ims.domain.lookups.LookupInstance chartRequiredbyTriage) {
		this.chartRequiredbyTriage = chartRequiredbyTriage;
	}

	public ims.domain.lookups.LookupInstance getRequestedbyReception() {
		return requestedbyReception;
	}
	public void setRequestedbyReception(ims.domain.lookups.LookupInstance requestedbyReception) {
		this.requestedbyReception = requestedbyReception;
	}

	public java.util.Date getDateTimeRequested() {
		return dateTimeRequested;
	}
	public void setDateTimeRequested(java.util.Date dateTimeRequested) {
		this.dateTimeRequested = dateTimeRequested;
	}

	public ims.domain.lookups.LookupInstance getReasonnotrequested() {
		return reasonnotrequested;
	}
	public void setReasonnotrequested(ims.domain.lookups.LookupInstance reasonnotrequested) {
		this.reasonnotrequested = reasonnotrequested;
	}

	public ims.domain.lookups.LookupInstance getChartReceived() {
		return chartReceived;
	}
	public void setChartReceived(ims.domain.lookups.LookupInstance chartReceived) {
		this.chartReceived = chartReceived;
	}

	public java.util.Date getDateTimeReceived() {
		return dateTimeReceived;
	}
	public void setDateTimeReceived(java.util.Date dateTimeReceived) {
		this.dateTimeReceived = dateTimeReceived;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
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
		
		auditStr.append("\r\n*emergencyAttendence* :");
		if (emergencyAttendence != null)
		{
			auditStr.append(toShortClassName(emergencyAttendence));
				
		    auditStr.append(emergencyAttendence.getId());
		}
	    auditStr.append("; ");
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
		auditStr.append("\r\n*chartRequiredbyTriage* :");
		if (chartRequiredbyTriage != null)
			auditStr.append(chartRequiredbyTriage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedbyReception* :");
		if (requestedbyReception != null)
			auditStr.append(requestedbyReception.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeRequested* :");
		auditStr.append(dateTimeRequested);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonnotrequested* :");
		if (reasonnotrequested != null)
			auditStr.append(reasonnotrequested.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*chartReceived* :");
		if (chartReceived != null)
			auditStr.append(chartReceived.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeReceived* :");
		auditStr.append(dateTimeReceived);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
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
		
		String keyClassName = "ChartRequested";
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
		if (this.getEmergencyAttendence() != null)
		{
			sb.append("<emergencyAttendence>");
			sb.append(this.getEmergencyAttendence().toXMLString(domMap)); 	
			sb.append("</emergencyAttendence>");		
		}
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
		if (this.getChartRequiredbyTriage() != null)
		{
			sb.append("<chartRequiredbyTriage>");
			sb.append(this.getChartRequiredbyTriage().toXMLString()); 
			sb.append("</chartRequiredbyTriage>");		
		}
		if (this.getRequestedbyReception() != null)
		{
			sb.append("<requestedbyReception>");
			sb.append(this.getRequestedbyReception().toXMLString()); 
			sb.append("</requestedbyReception>");		
		}
		if (this.getDateTimeRequested() != null)
		{
			sb.append("<dateTimeRequested>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeRequested()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeRequested>");		
		}
		if (this.getReasonnotrequested() != null)
		{
			sb.append("<reasonnotrequested>");
			sb.append(this.getReasonnotrequested().toXMLString()); 
			sb.append("</reasonnotrequested>");		
		}
		if (this.getChartReceived() != null)
		{
			sb.append("<chartReceived>");
			sb.append(this.getChartReceived().toXMLString()); 
			sb.append("</chartReceived>");		
		}
		if (this.getDateTimeReceived() != null)
		{
			sb.append("<dateTimeReceived>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeReceived()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeReceived>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
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
			ChartRequested domainObject = getChartRequestedfromXML(itemEl, factory, domMap);

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
			ChartRequested domainObject = getChartRequestedfromXML(itemEl, factory, domMap);

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
		
	public static ChartRequested getChartRequestedfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getChartRequestedfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ChartRequested getChartRequestedfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ChartRequested.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ChartRequested.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ChartRequested class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ChartRequested)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ChartRequested.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ChartRequested ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ChartRequested)factory.getImportedDomainObject(ChartRequested.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ChartRequested();
		}
		String keyClassName = "ChartRequested";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ChartRequested)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ChartRequested obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("emergencyAttendence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEmergencyAttendence(ims.core.admin.domain.objects.EmergencyAttendance.getEmergencyAttendancefromXML(fldEl, factory, domMap)); 
		}
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
		fldEl = el.element("chartRequiredbyTriage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChartRequiredbyTriage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requestedbyReception");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequestedbyReception(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateTimeRequested");
		if(fldEl != null)
		{	
    		obj.setDateTimeRequested(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonnotrequested");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonnotrequested(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("chartReceived");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChartReceived(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateTimeReceived");
		if(fldEl != null)
		{	
    		obj.setDateTimeReceived(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
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
		public static final String EmergencyAttendence = "emergencyAttendence";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String ChartRequiredbyTriage = "chartRequiredbyTriage";
		public static final String RequestedbyReception = "requestedbyReception";
		public static final String DateTimeRequested = "dateTimeRequested";
		public static final String Reasonnotrequested = "reasonnotrequested";
		public static final String ChartReceived = "chartReceived";
		public static final String DateTimeReceived = "dateTimeReceived";
		public static final String Comment = "comment";
	}
}

