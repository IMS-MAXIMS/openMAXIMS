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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class Dummy extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100015;
	private static final long serialVersionUID = 1105100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String active;
	private ims.domain.lookups.LookupInstance priority;
	private ims.domain.lookups.LookupInstance specialtyCode;
	private ims.domain.lookups.LookupInstance serviceType;
	private ims.domain.lookups.LookupInstance contractLocation;
	private ims.domain.lookups.LookupInstance cancelReason;
	private ims.domain.lookups.LookupInstance apptStatus;
	private ims.domain.lookups.LookupInstance treatmentCategory;
	private ims.domain.lookups.LookupInstance dNAReason;
	private ims.domain.lookups.LookupInstance machineType;
	private ims.domain.lookups.LookupInstance scheduleCategory;
	private ims.domain.lookups.LookupInstance scheduleType;
	private ims.domain.lookups.LookupInstance intervalType;
	private ims.domain.lookups.LookupInstance locationChar;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Dummy (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public Dummy ()
    {
    	super();
		isComponentClass=true;
    }
    public Dummy (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.Dummy.class;
	}


	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		if ( null != active && active.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for active. Tried to set value: "+
				active);
		}
		this.active = active;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public ims.domain.lookups.LookupInstance getSpecialtyCode() {
		return specialtyCode;
	}
	public void setSpecialtyCode(ims.domain.lookups.LookupInstance specialtyCode) {
		this.specialtyCode = specialtyCode;
	}

	public ims.domain.lookups.LookupInstance getServiceType() {
		return serviceType;
	}
	public void setServiceType(ims.domain.lookups.LookupInstance serviceType) {
		this.serviceType = serviceType;
	}

	public ims.domain.lookups.LookupInstance getContractLocation() {
		return contractLocation;
	}
	public void setContractLocation(ims.domain.lookups.LookupInstance contractLocation) {
		this.contractLocation = contractLocation;
	}

	public ims.domain.lookups.LookupInstance getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(ims.domain.lookups.LookupInstance cancelReason) {
		this.cancelReason = cancelReason;
	}

	public ims.domain.lookups.LookupInstance getApptStatus() {
		return apptStatus;
	}
	public void setApptStatus(ims.domain.lookups.LookupInstance apptStatus) {
		this.apptStatus = apptStatus;
	}

	public ims.domain.lookups.LookupInstance getTreatmentCategory() {
		return treatmentCategory;
	}
	public void setTreatmentCategory(ims.domain.lookups.LookupInstance treatmentCategory) {
		this.treatmentCategory = treatmentCategory;
	}

	public ims.domain.lookups.LookupInstance getDNAReason() {
		return dNAReason;
	}
	public void setDNAReason(ims.domain.lookups.LookupInstance dNAReason) {
		this.dNAReason = dNAReason;
	}

	public ims.domain.lookups.LookupInstance getMachineType() {
		return machineType;
	}
	public void setMachineType(ims.domain.lookups.LookupInstance machineType) {
		this.machineType = machineType;
	}

	public ims.domain.lookups.LookupInstance getScheduleCategory() {
		return scheduleCategory;
	}
	public void setScheduleCategory(ims.domain.lookups.LookupInstance scheduleCategory) {
		this.scheduleCategory = scheduleCategory;
	}

	public ims.domain.lookups.LookupInstance getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(ims.domain.lookups.LookupInstance scheduleType) {
		this.scheduleType = scheduleType;
	}

	public ims.domain.lookups.LookupInstance getIntervalType() {
		return intervalType;
	}
	public void setIntervalType(ims.domain.lookups.LookupInstance intervalType) {
		this.intervalType = intervalType;
	}

	public ims.domain.lookups.LookupInstance getLocationChar() {
		return locationChar;
	}
	public void setLocationChar(ims.domain.lookups.LookupInstance locationChar) {
		this.locationChar = locationChar;
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
		
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialtyCode* :");
		if (specialtyCode != null)
			auditStr.append(specialtyCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceType* :");
		if (serviceType != null)
			auditStr.append(serviceType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*contractLocation* :");
		if (contractLocation != null)
			auditStr.append(contractLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelReason* :");
		if (cancelReason != null)
			auditStr.append(cancelReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStatus* :");
		if (apptStatus != null)
			auditStr.append(apptStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentCategory* :");
		if (treatmentCategory != null)
			auditStr.append(treatmentCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dNAReason* :");
		if (dNAReason != null)
			auditStr.append(dNAReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*machineType* :");
		if (machineType != null)
			auditStr.append(machineType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduleCategory* :");
		if (scheduleCategory != null)
			auditStr.append(scheduleCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduleType* :");
		if (scheduleType != null)
			auditStr.append(scheduleType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalType* :");
		if (intervalType != null)
			auditStr.append(intervalType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*locationChar* :");
		if (locationChar != null)
			auditStr.append(locationChar.getText());
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive().toString()));
			sb.append("</active>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getSpecialtyCode() != null)
		{
			sb.append("<specialtyCode>");
			sb.append(this.getSpecialtyCode().toXMLString()); 
			sb.append("</specialtyCode>");		
		}
		if (this.getServiceType() != null)
		{
			sb.append("<serviceType>");
			sb.append(this.getServiceType().toXMLString()); 
			sb.append("</serviceType>");		
		}
		if (this.getContractLocation() != null)
		{
			sb.append("<contractLocation>");
			sb.append(this.getContractLocation().toXMLString()); 
			sb.append("</contractLocation>");		
		}
		if (this.getCancelReason() != null)
		{
			sb.append("<cancelReason>");
			sb.append(this.getCancelReason().toXMLString()); 
			sb.append("</cancelReason>");		
		}
		if (this.getApptStatus() != null)
		{
			sb.append("<apptStatus>");
			sb.append(this.getApptStatus().toXMLString()); 
			sb.append("</apptStatus>");		
		}
		if (this.getTreatmentCategory() != null)
		{
			sb.append("<treatmentCategory>");
			sb.append(this.getTreatmentCategory().toXMLString()); 
			sb.append("</treatmentCategory>");		
		}
		if (this.getDNAReason() != null)
		{
			sb.append("<dNAReason>");
			sb.append(this.getDNAReason().toXMLString()); 
			sb.append("</dNAReason>");		
		}
		if (this.getMachineType() != null)
		{
			sb.append("<machineType>");
			sb.append(this.getMachineType().toXMLString()); 
			sb.append("</machineType>");		
		}
		if (this.getScheduleCategory() != null)
		{
			sb.append("<scheduleCategory>");
			sb.append(this.getScheduleCategory().toXMLString()); 
			sb.append("</scheduleCategory>");		
		}
		if (this.getScheduleType() != null)
		{
			sb.append("<scheduleType>");
			sb.append(this.getScheduleType().toXMLString()); 
			sb.append("</scheduleType>");		
		}
		if (this.getIntervalType() != null)
		{
			sb.append("<intervalType>");
			sb.append(this.getIntervalType().toXMLString()); 
			sb.append("</intervalType>");		
		}
		if (this.getLocationChar() != null)
		{
			sb.append("<locationChar>");
			sb.append(this.getLocationChar().toXMLString()); 
			sb.append("</locationChar>");		
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
			Dummy domainObject = getDummyfromXML(itemEl, factory, domMap);

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
			Dummy domainObject = getDummyfromXML(itemEl, factory, domMap);

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
		
	public static Dummy getDummyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDummyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Dummy getDummyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Dummy.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Dummy.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Dummy class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Dummy)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Dummy.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Dummy ret = null;
		if (ret == null)
		{
			ret = new Dummy();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Dummy obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialtyCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialtyCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("serviceType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setServiceType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("contractLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContractLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancelReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancelReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("apptStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setApptStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dNAReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDNAReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("machineType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMachineType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("scheduleCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setScheduleCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("scheduleType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setScheduleType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intervalType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntervalType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("locationChar");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLocationChar(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Active = "active";
		public static final String Priority = "priority";
		public static final String SpecialtyCode = "specialtyCode";
		public static final String ServiceType = "serviceType";
		public static final String ContractLocation = "contractLocation";
		public static final String CancelReason = "cancelReason";
		public static final String ApptStatus = "apptStatus";
		public static final String TreatmentCategory = "treatmentCategory";
		public static final String DNAReason = "dNAReason";
		public static final String MachineType = "machineType";
		public static final String ScheduleCategory = "scheduleCategory";
		public static final String ScheduleType = "scheduleType";
		public static final String IntervalType = "intervalType";
		public static final String LocationChar = "locationChar";
	}
}

