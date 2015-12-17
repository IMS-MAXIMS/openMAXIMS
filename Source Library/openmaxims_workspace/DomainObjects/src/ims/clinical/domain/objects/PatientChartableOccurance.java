//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientChartableOccurance extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100130;
	private static final long serialVersionUID = 1072100130L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Time Observed */
	private java.util.Date timeObserved;
	/** Chartable Occurance Type */
	private ims.domain.lookups.LookupInstance chartableOccuranceType;
	/** Reported By */
	private ims.core.resource.people.domain.objects.MemberOfStaff reportedBy;
	/** Incident Number */
	private String incidentNumber;
	/** PeriOp Stage */
	private ims.domain.lookups.LookupInstance periOpStage;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientChartableOccurance (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientChartableOccurance ()
    {
    	super();
    }
    public PatientChartableOccurance (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientChartableOccurance.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public java.util.Date getTimeObserved() {
		return timeObserved;
	}
	public void setTimeObserved(java.util.Date timeObserved) {
		this.timeObserved = timeObserved;
	}

	public ims.domain.lookups.LookupInstance getChartableOccuranceType() {
		return chartableOccuranceType;
	}
	public void setChartableOccuranceType(ims.domain.lookups.LookupInstance chartableOccuranceType) {
		this.chartableOccuranceType = chartableOccuranceType;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(ims.core.resource.people.domain.objects.MemberOfStaff reportedBy) {
		this.reportedBy = reportedBy;
	}

	public String getIncidentNumber() {
		return incidentNumber;
	}
	public void setIncidentNumber(String incidentNumber) {
		if ( null != incidentNumber && incidentNumber.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for incidentNumber. Tried to set value: "+
				incidentNumber);
		}
		this.incidentNumber = incidentNumber;
	}

	public ims.domain.lookups.LookupInstance getPeriOpStage() {
		return periOpStage;
	}
	public void setPeriOpStage(ims.domain.lookups.LookupInstance periOpStage) {
		this.periOpStage = periOpStage;
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
		
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*timeObserved* :");
		auditStr.append(timeObserved);
	    auditStr.append("; ");
		auditStr.append("\r\n*chartableOccuranceType* :");
		if (chartableOccuranceType != null)
			auditStr.append(chartableOccuranceType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reportedBy* :");
		if (reportedBy != null)
		{
			auditStr.append(toShortClassName(reportedBy));
				
		    auditStr.append(reportedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*incidentNumber* :");
		auditStr.append(incidentNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*periOpStage* :");
		if (periOpStage != null)
			auditStr.append(periOpStage.getText());
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
		
		String keyClassName = "PatientChartableOccurance";
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
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.getTimeObserved() != null)
		{
			sb.append("<timeObserved>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeObserved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeObserved>");		
		}
		if (this.getChartableOccuranceType() != null)
		{
			sb.append("<chartableOccuranceType>");
			sb.append(this.getChartableOccuranceType().toXMLString()); 
			sb.append("</chartableOccuranceType>");		
		}
		if (this.getReportedBy() != null)
		{
			sb.append("<reportedBy>");
			sb.append(this.getReportedBy().toXMLString(domMap)); 	
			sb.append("</reportedBy>");		
		}
		if (this.getIncidentNumber() != null)
		{
			sb.append("<incidentNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIncidentNumber().toString()));
			sb.append("</incidentNumber>");		
		}
		if (this.getPeriOpStage() != null)
		{
			sb.append("<periOpStage>");
			sb.append(this.getPeriOpStage().toXMLString()); 
			sb.append("</periOpStage>");		
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
			PatientChartableOccurance domainObject = getPatientChartableOccurancefromXML(itemEl, factory, domMap);

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
			PatientChartableOccurance domainObject = getPatientChartableOccurancefromXML(itemEl, factory, domMap);

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
		
	public static PatientChartableOccurance getPatientChartableOccurancefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientChartableOccurancefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientChartableOccurance getPatientChartableOccurancefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientChartableOccurance.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientChartableOccurance.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientChartableOccurance class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientChartableOccurance)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientChartableOccurance.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientChartableOccurance ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientChartableOccurance)factory.getImportedDomainObject(PatientChartableOccurance.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientChartableOccurance();
		}
		String keyClassName = "PatientChartableOccurance";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientChartableOccurance)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientChartableOccurance obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("timeObserved");
		if(fldEl != null)
		{	
    		obj.setTimeObserved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("chartableOccuranceType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChartableOccuranceType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reportedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReportedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("incidentNumber");
		if(fldEl != null)
		{	
    		obj.setIncidentNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("periOpStage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPeriOpStage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String TimeObserved = "timeObserved";
		public static final String ChartableOccuranceType = "chartableOccuranceType";
		public static final String ReportedBy = "reportedBy";
		public static final String IncidentNumber = "incidentNumber";
		public static final String PeriOpStage = "periOpStage";
	}
}

