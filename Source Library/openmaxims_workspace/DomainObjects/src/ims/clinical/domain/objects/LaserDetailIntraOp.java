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


public class LaserDetailIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100139;
	private static final long serialVersionUID = 1072100139L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Device Name */
	private ims.domain.lookups.LookupInstance deviceName;
	/** Device Serial Number */
	private ims.domain.lookups.LookupInstance deviceSerialNumber;
	/** Laser Fibre Lot Number */
	private String laserFibreLotNumber;
	/** LaserMode */
	private ims.domain.lookups.LookupInstance laserMode;
	/** Power */
	private java.lang.Float power;
	/** Total Duration Seconds */
	private Integer totalDurationSeconds;
	/** Number Of Burns */
	private Integer numberOfBurns;
	/** Laser Operator */
	private ims.core.resource.people.domain.objects.Hcp laserOperator;
	/** Patient Safety Measures
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List patientSafetyMeasures;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public LaserDetailIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LaserDetailIntraOp ()
    {
    	super();
    }
    public LaserDetailIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.LaserDetailIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static LaserDetailIntraOp getLaserDetailIntraOpFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from LaserDetailIntraOp c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. LaserDetailIntraOp.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (LaserDetailIntraOp)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public ims.domain.lookups.LookupInstance getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(ims.domain.lookups.LookupInstance deviceName) {
		this.deviceName = deviceName;
	}

	public ims.domain.lookups.LookupInstance getDeviceSerialNumber() {
		return deviceSerialNumber;
	}
	public void setDeviceSerialNumber(ims.domain.lookups.LookupInstance deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getLaserFibreLotNumber() {
		return laserFibreLotNumber;
	}
	public void setLaserFibreLotNumber(String laserFibreLotNumber) {
		if ( null != laserFibreLotNumber && laserFibreLotNumber.length() > 75 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for laserFibreLotNumber. Tried to set value: "+
				laserFibreLotNumber);
		}
		this.laserFibreLotNumber = laserFibreLotNumber;
	}

	public ims.domain.lookups.LookupInstance getLaserMode() {
		return laserMode;
	}
	public void setLaserMode(ims.domain.lookups.LookupInstance laserMode) {
		this.laserMode = laserMode;
	}

	public java.lang.Float getPower() {
		return power;
	}
	public void setPower(java.lang.Float power) {
		this.power = power;
	}

	public Integer getTotalDurationSeconds() {
		return totalDurationSeconds;
	}
	public void setTotalDurationSeconds(Integer totalDurationSeconds) {
		this.totalDurationSeconds = totalDurationSeconds;
	}

	public Integer getNumberOfBurns() {
		return numberOfBurns;
	}
	public void setNumberOfBurns(Integer numberOfBurns) {
		this.numberOfBurns = numberOfBurns;
	}

	public ims.core.resource.people.domain.objects.Hcp getLaserOperator() {
		return laserOperator;
	}
	public void setLaserOperator(ims.core.resource.people.domain.objects.Hcp laserOperator) {
		this.laserOperator = laserOperator;
	}

	public java.util.List getPatientSafetyMeasures() {
		if ( null == patientSafetyMeasures ) {
			patientSafetyMeasures = new java.util.ArrayList();
		}
		return patientSafetyMeasures;
	}
	public void setPatientSafetyMeasures(java.util.List paramValue) {
		this.patientSafetyMeasures = paramValue;
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
		auditStr.append("\r\n*deviceName* :");
		if (deviceName != null)
			auditStr.append(deviceName.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deviceSerialNumber* :");
		if (deviceSerialNumber != null)
			auditStr.append(deviceSerialNumber.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laserFibreLotNumber* :");
		auditStr.append(laserFibreLotNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*laserMode* :");
		if (laserMode != null)
			auditStr.append(laserMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*power* :");
		auditStr.append(power);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalDurationSeconds* :");
		auditStr.append(totalDurationSeconds);
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfBurns* :");
		auditStr.append(numberOfBurns);
	    auditStr.append("; ");
		auditStr.append("\r\n*laserOperator* :");
		if (laserOperator != null)
		{
			auditStr.append(toShortClassName(laserOperator));
				
		    auditStr.append(laserOperator.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientSafetyMeasures* :");
		if (patientSafetyMeasures != null)
		{
		int i10=0;
		for (i10=0; i10<patientSafetyMeasures.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)patientSafetyMeasures.get(i10);
			auditStr.append(obj.getText());
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
		
		String keyClassName = "LaserDetailIntraOp";
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
		if (this.getDeviceName() != null)
		{
			sb.append("<deviceName>");
			sb.append(this.getDeviceName().toXMLString()); 
			sb.append("</deviceName>");		
		}
		if (this.getDeviceSerialNumber() != null)
		{
			sb.append("<deviceSerialNumber>");
			sb.append(this.getDeviceSerialNumber().toXMLString()); 
			sb.append("</deviceSerialNumber>");		
		}
		if (this.getLaserFibreLotNumber() != null)
		{
			sb.append("<laserFibreLotNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLaserFibreLotNumber().toString()));
			sb.append("</laserFibreLotNumber>");		
		}
		if (this.getLaserMode() != null)
		{
			sb.append("<laserMode>");
			sb.append(this.getLaserMode().toXMLString()); 
			sb.append("</laserMode>");		
		}
		if (this.getPower() != null)
		{
			sb.append("<power>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPower().toString()));
			sb.append("</power>");		
		}
		if (this.getTotalDurationSeconds() != null)
		{
			sb.append("<totalDurationSeconds>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalDurationSeconds().toString()));
			sb.append("</totalDurationSeconds>");		
		}
		if (this.getNumberOfBurns() != null)
		{
			sb.append("<numberOfBurns>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfBurns().toString()));
			sb.append("</numberOfBurns>");		
		}
		if (this.getLaserOperator() != null)
		{
			sb.append("<laserOperator>");
			sb.append(this.getLaserOperator().toXMLString(domMap)); 	
			sb.append("</laserOperator>");		
		}
		if (this.getPatientSafetyMeasures() != null)
		{
			if (this.getPatientSafetyMeasures().size() > 0 )
			{
			sb.append("<patientSafetyMeasures>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getPatientSafetyMeasures())); 
			sb.append("</patientSafetyMeasures>");		
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
			LaserDetailIntraOp domainObject = getLaserDetailIntraOpfromXML(itemEl, factory, domMap);

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
			LaserDetailIntraOp domainObject = getLaserDetailIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static LaserDetailIntraOp getLaserDetailIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLaserDetailIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LaserDetailIntraOp getLaserDetailIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LaserDetailIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LaserDetailIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LaserDetailIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LaserDetailIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LaserDetailIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LaserDetailIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LaserDetailIntraOp)factory.getImportedDomainObject(LaserDetailIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LaserDetailIntraOp();
		}
		String keyClassName = "LaserDetailIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LaserDetailIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LaserDetailIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("deviceName");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeviceName(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deviceSerialNumber");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeviceSerialNumber(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laserFibreLotNumber");
		if(fldEl != null)
		{	
    		obj.setLaserFibreLotNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("laserMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaserMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("power");
		if(fldEl != null)
		{	
    		obj.setPower(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("totalDurationSeconds");
		if(fldEl != null)
		{	
    		obj.setTotalDurationSeconds(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numberOfBurns");
		if(fldEl != null)
		{	
    		obj.setNumberOfBurns(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("laserOperator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLaserOperator(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientSafetyMeasures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientSafetyMeasures(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getPatientSafetyMeasures())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientSafetyMeasures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String DeviceName = "deviceName";
		public static final String DeviceSerialNumber = "deviceSerialNumber";
		public static final String LaserFibreLotNumber = "laserFibreLotNumber";
		public static final String LaserMode = "laserMode";
		public static final String Power = "power";
		public static final String TotalDurationSeconds = "totalDurationSeconds";
		public static final String NumberOfBurns = "numberOfBurns";
		public static final String LaserOperator = "laserOperator";
		public static final String PatientSafetyMeasures = "patientSafetyMeasures";
	}
}

