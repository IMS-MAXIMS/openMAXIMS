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


public class HandoverCountIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100154;
	private static final long serialVersionUID = 1072100154L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure procedure;
	/** Count Type */
	private ims.domain.lookups.LookupInstance countType;
	/** Count Status */
	private ims.domain.lookups.LookupInstance countStatus;
	/** Scrub Practitioner */
	private ims.core.resource.people.domain.objects.Nurse scrubPractitioner;
	/** Circulator */
	private ims.core.resource.people.domain.objects.Nurse circulator;
	/** Incorrect Count Status */
	private ims.domain.lookups.LookupInstance incorrectCountStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HandoverCountIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HandoverCountIntraOp ()
    {
    	super();
    }
    public HandoverCountIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.HandoverCountIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.PatientProcedure procedure) {
		this.procedure = procedure;
	}

	public ims.domain.lookups.LookupInstance getCountType() {
		return countType;
	}
	public void setCountType(ims.domain.lookups.LookupInstance countType) {
		this.countType = countType;
	}

	public ims.domain.lookups.LookupInstance getCountStatus() {
		return countStatus;
	}
	public void setCountStatus(ims.domain.lookups.LookupInstance countStatus) {
		this.countStatus = countStatus;
	}

	public ims.core.resource.people.domain.objects.Nurse getScrubPractitioner() {
		return scrubPractitioner;
	}
	public void setScrubPractitioner(ims.core.resource.people.domain.objects.Nurse scrubPractitioner) {
		this.scrubPractitioner = scrubPractitioner;
	}

	public ims.core.resource.people.domain.objects.Nurse getCirculator() {
		return circulator;
	}
	public void setCirculator(ims.core.resource.people.domain.objects.Nurse circulator) {
		this.circulator = circulator;
	}

	public ims.domain.lookups.LookupInstance getIncorrectCountStatus() {
		return incorrectCountStatus;
	}
	public void setIncorrectCountStatus(ims.domain.lookups.LookupInstance incorrectCountStatus) {
		this.incorrectCountStatus = incorrectCountStatus;
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
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*countType* :");
		if (countType != null)
			auditStr.append(countType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*countStatus* :");
		if (countStatus != null)
			auditStr.append(countStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*scrubPractitioner* :");
		if (scrubPractitioner != null)
		{
			auditStr.append(toShortClassName(scrubPractitioner));
				
		    auditStr.append(scrubPractitioner.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*circulator* :");
		if (circulator != null)
		{
			auditStr.append(toShortClassName(circulator));
				
		    auditStr.append(circulator.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*incorrectCountStatus* :");
		if (incorrectCountStatus != null)
			auditStr.append(incorrectCountStatus.getText());
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
		
		String keyClassName = "HandoverCountIntraOp";
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
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getCountType() != null)
		{
			sb.append("<countType>");
			sb.append(this.getCountType().toXMLString()); 
			sb.append("</countType>");		
		}
		if (this.getCountStatus() != null)
		{
			sb.append("<countStatus>");
			sb.append(this.getCountStatus().toXMLString()); 
			sb.append("</countStatus>");		
		}
		if (this.getScrubPractitioner() != null)
		{
			sb.append("<scrubPractitioner>");
			sb.append(this.getScrubPractitioner().toXMLString(domMap)); 	
			sb.append("</scrubPractitioner>");		
		}
		if (this.getCirculator() != null)
		{
			sb.append("<circulator>");
			sb.append(this.getCirculator().toXMLString(domMap)); 	
			sb.append("</circulator>");		
		}
		if (this.getIncorrectCountStatus() != null)
		{
			sb.append("<incorrectCountStatus>");
			sb.append(this.getIncorrectCountStatus().toXMLString()); 
			sb.append("</incorrectCountStatus>");		
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
			HandoverCountIntraOp domainObject = getHandoverCountIntraOpfromXML(itemEl, factory, domMap);

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
			HandoverCountIntraOp domainObject = getHandoverCountIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static HandoverCountIntraOp getHandoverCountIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHandoverCountIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HandoverCountIntraOp getHandoverCountIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HandoverCountIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HandoverCountIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HandoverCountIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HandoverCountIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HandoverCountIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HandoverCountIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HandoverCountIntraOp)factory.getImportedDomainObject(HandoverCountIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HandoverCountIntraOp();
		}
		String keyClassName = "HandoverCountIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HandoverCountIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HandoverCountIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("countType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCountType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("countStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCountStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("scrubPractitioner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScrubPractitioner(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("circulator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCirculator(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("incorrectCountStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIncorrectCountStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Procedure = "procedure";
		public static final String CountType = "countType";
		public static final String CountStatus = "countStatus";
		public static final String ScrubPractitioner = "scrubPractitioner";
		public static final String Circulator = "circulator";
		public static final String IncorrectCountStatus = "incorrectCountStatus";
	}
}

