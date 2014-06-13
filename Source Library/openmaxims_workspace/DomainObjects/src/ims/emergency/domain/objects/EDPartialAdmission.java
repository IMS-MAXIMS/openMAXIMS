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
 * @author Rory Fitzpatrick
 * Generated.
 */


public class EDPartialAdmission extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100043;
	private static final long serialVersionUID = 1086100043L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** DecisionToAdmitDateTime */
	private java.util.Date decisionToAdmitDateTime;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** AdmittingConsultant */
	private ims.domain.lookups.LookupInstance admittingConsultant;
	/** AllocatedDateTime */
	private java.util.Date allocatedDateTime;
	/** Allocated Bed Type */
	private ims.domain.lookups.LookupInstance allocatedBedType;
	/** Allocated Bed Note */
	private String allocatedBedNote;
	/** Allocated Ward */
	private ims.core.resource.place.domain.objects.Location allocatedWard;
	/** AllocationStatus */
	private ims.domain.lookups.LookupInstance allocatedStatus;
	/** AdmissionDateTime */
	private java.util.Date admissionDateTime;
	/** Admission Ward */
	private ims.core.resource.place.domain.objects.Location admissionWard;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EDPartialAdmission (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EDPartialAdmission ()
    {
    	super();
    }
    public EDPartialAdmission (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.EDPartialAdmission.class;
	}


	public java.util.Date getDecisionToAdmitDateTime() {
		return decisionToAdmitDateTime;
	}
	public void setDecisionToAdmitDateTime(java.util.Date decisionToAdmitDateTime) {
		this.decisionToAdmitDateTime = decisionToAdmitDateTime;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.domain.lookups.LookupInstance getAdmittingConsultant() {
		return admittingConsultant;
	}
	public void setAdmittingConsultant(ims.domain.lookups.LookupInstance admittingConsultant) {
		this.admittingConsultant = admittingConsultant;
	}

	public java.util.Date getAllocatedDateTime() {
		return allocatedDateTime;
	}
	public void setAllocatedDateTime(java.util.Date allocatedDateTime) {
		this.allocatedDateTime = allocatedDateTime;
	}

	public ims.domain.lookups.LookupInstance getAllocatedBedType() {
		return allocatedBedType;
	}
	public void setAllocatedBedType(ims.domain.lookups.LookupInstance allocatedBedType) {
		this.allocatedBedType = allocatedBedType;
	}

	public String getAllocatedBedNote() {
		return allocatedBedNote;
	}
	public void setAllocatedBedNote(String allocatedBedNote) {
		if ( null != allocatedBedNote && allocatedBedNote.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for allocatedBedNote. Tried to set value: "+
				allocatedBedNote);
		}
		this.allocatedBedNote = allocatedBedNote;
	}

	public ims.core.resource.place.domain.objects.Location getAllocatedWard() {
		return allocatedWard;
	}
	public void setAllocatedWard(ims.core.resource.place.domain.objects.Location allocatedWard) {
		this.allocatedWard = allocatedWard;
	}

	public ims.domain.lookups.LookupInstance getAllocatedStatus() {
		return allocatedStatus;
	}
	public void setAllocatedStatus(ims.domain.lookups.LookupInstance allocatedStatus) {
		this.allocatedStatus = allocatedStatus;
	}

	public java.util.Date getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setAdmissionDateTime(java.util.Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public ims.core.resource.place.domain.objects.Location getAdmissionWard() {
		return admissionWard;
	}
	public void setAdmissionWard(ims.core.resource.place.domain.objects.Location admissionWard) {
		this.admissionWard = admissionWard;
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
		
		auditStr.append("\r\n*decisionToAdmitDateTime* :");
		auditStr.append(decisionToAdmitDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admittingConsultant* :");
		if (admittingConsultant != null)
			auditStr.append(admittingConsultant.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedDateTime* :");
		auditStr.append(allocatedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedBedType* :");
		if (allocatedBedType != null)
			auditStr.append(allocatedBedType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedBedNote* :");
		auditStr.append(allocatedBedNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedWard* :");
		if (allocatedWard != null)
		{
			auditStr.append(toShortClassName(allocatedWard));
				
		    auditStr.append(allocatedWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedStatus* :");
		if (allocatedStatus != null)
			auditStr.append(allocatedStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDateTime* :");
		auditStr.append(admissionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionWard* :");
		if (admissionWard != null)
		{
			auditStr.append(toShortClassName(admissionWard));
				
		    auditStr.append(admissionWard.getId());
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
		
		String keyClassName = "EDPartialAdmission";
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
		if (this.getDecisionToAdmitDateTime() != null)
		{
			sb.append("<decisionToAdmitDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDecisionToAdmitDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</decisionToAdmitDateTime>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getAdmittingConsultant() != null)
		{
			sb.append("<admittingConsultant>");
			sb.append(this.getAdmittingConsultant().toXMLString()); 
			sb.append("</admittingConsultant>");		
		}
		if (this.getAllocatedDateTime() != null)
		{
			sb.append("<allocatedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAllocatedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</allocatedDateTime>");		
		}
		if (this.getAllocatedBedType() != null)
		{
			sb.append("<allocatedBedType>");
			sb.append(this.getAllocatedBedType().toXMLString()); 
			sb.append("</allocatedBedType>");		
		}
		if (this.getAllocatedBedNote() != null)
		{
			sb.append("<allocatedBedNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAllocatedBedNote().toString()));
			sb.append("</allocatedBedNote>");		
		}
		if (this.getAllocatedWard() != null)
		{
			sb.append("<allocatedWard>");
			sb.append(this.getAllocatedWard().toXMLString(domMap)); 	
			sb.append("</allocatedWard>");		
		}
		if (this.getAllocatedStatus() != null)
		{
			sb.append("<allocatedStatus>");
			sb.append(this.getAllocatedStatus().toXMLString()); 
			sb.append("</allocatedStatus>");		
		}
		if (this.getAdmissionDateTime() != null)
		{
			sb.append("<admissionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDateTime>");		
		}
		if (this.getAdmissionWard() != null)
		{
			sb.append("<admissionWard>");
			sb.append(this.getAdmissionWard().toXMLString(domMap)); 	
			sb.append("</admissionWard>");		
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
			EDPartialAdmission domainObject = getEDPartialAdmissionfromXML(itemEl, factory, domMap);

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
			EDPartialAdmission domainObject = getEDPartialAdmissionfromXML(itemEl, factory, domMap);

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
		
	public static EDPartialAdmission getEDPartialAdmissionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEDPartialAdmissionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EDPartialAdmission getEDPartialAdmissionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EDPartialAdmission.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EDPartialAdmission.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EDPartialAdmission class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EDPartialAdmission)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EDPartialAdmission.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EDPartialAdmission ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EDPartialAdmission)factory.getImportedDomainObject(EDPartialAdmission.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EDPartialAdmission();
		}
		String keyClassName = "EDPartialAdmission";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EDPartialAdmission)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EDPartialAdmission obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("decisionToAdmitDateTime");
		if(fldEl != null)
		{	
    		obj.setDecisionToAdmitDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admittingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmittingConsultant(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allocatedDateTime");
		if(fldEl != null)
		{	
    		obj.setAllocatedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("allocatedBedType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAllocatedBedType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allocatedBedNote");
		if(fldEl != null)
		{	
    		obj.setAllocatedBedNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allocatedWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAllocatedStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("admissionWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
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
		public static final String DecisionToAdmitDateTime = "decisionToAdmitDateTime";
		public static final String Specialty = "specialty";
		public static final String AdmittingConsultant = "admittingConsultant";
		public static final String AllocatedDateTime = "allocatedDateTime";
		public static final String AllocatedBedType = "allocatedBedType";
		public static final String AllocatedBedNote = "allocatedBedNote";
		public static final String AllocatedWard = "allocatedWard";
		public static final String AllocatedStatus = "allocatedStatus";
		public static final String AdmissionDateTime = "admissionDateTime";
		public static final String AdmissionWard = "admissionWard";
	}
}

