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


public class PatientPreperationIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100136;
	private static final long serialVersionUID = 1072100136L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Patient Preparation
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List patientPreparation;
	/** Other Details */
	private String otherDetails;
	/** Skin Integrity Maintained */
	private ims.domain.lookups.LookupInstance skinIntegrityMaintained;
	/** Patient Transfer To Operating Table Via */
	private ims.domain.lookups.LookupInstance patientTransferToOperatingTableVia;
	/** Patient Transfer From Operating Table Via */
	private ims.domain.lookups.LookupInstance patientTransferFromOperatingTableVia1;
	/** Body Position */
	private ims.domain.lookups.LookupInstance bodyPosition;
	/** Left Arm Position */
	private ims.domain.lookups.LookupInstance leftArmPosition;
	/** Right Arm Position */
	private ims.domain.lookups.LookupInstance rightArmPosition;
	/** Left Leg Position */
	private ims.domain.lookups.LookupInstance leftLegPosition;
	/** Right Leg Position */
	private ims.domain.lookups.LookupInstance rightLegPosition;
	/** Positioning Devices
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List positioningDevices;
	/** Was Patient Warmed */
	private ims.domain.lookups.LookupInstance wasPatientWarmed;
	/** Fluid Warmer Used */
	private ims.domain.lookups.LookupInstance fluidWarmerUsed;
	/** Warming Blanket Used */
	private ims.domain.lookups.LookupInstance warmingBlanketUsed;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientPreperationIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientPreperationIntraOp ()
    {
    	super();
    }
    public PatientPreperationIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientPreperationIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static PatientPreperationIntraOp getPatientPreperationIntraOpFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from PatientPreperationIntraOp c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PatientPreperationIntraOp.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (PatientPreperationIntraOp)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public java.util.List getPatientPreparation() {
		if ( null == patientPreparation ) {
			patientPreparation = new java.util.ArrayList();
		}
		return patientPreparation;
	}
	public void setPatientPreparation(java.util.List paramValue) {
		this.patientPreparation = paramValue;
	}

	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		if ( null != otherDetails && otherDetails.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherDetails. Tried to set value: "+
				otherDetails);
		}
		this.otherDetails = otherDetails;
	}

	public ims.domain.lookups.LookupInstance getSkinIntegrityMaintained() {
		return skinIntegrityMaintained;
	}
	public void setSkinIntegrityMaintained(ims.domain.lookups.LookupInstance skinIntegrityMaintained) {
		this.skinIntegrityMaintained = skinIntegrityMaintained;
	}

	public ims.domain.lookups.LookupInstance getPatientTransferToOperatingTableVia() {
		return patientTransferToOperatingTableVia;
	}
	public void setPatientTransferToOperatingTableVia(ims.domain.lookups.LookupInstance patientTransferToOperatingTableVia) {
		this.patientTransferToOperatingTableVia = patientTransferToOperatingTableVia;
	}

	public ims.domain.lookups.LookupInstance getPatientTransferFromOperatingTableVia1() {
		return patientTransferFromOperatingTableVia1;
	}
	public void setPatientTransferFromOperatingTableVia1(ims.domain.lookups.LookupInstance patientTransferFromOperatingTableVia1) {
		this.patientTransferFromOperatingTableVia1 = patientTransferFromOperatingTableVia1;
	}

	public ims.domain.lookups.LookupInstance getBodyPosition() {
		return bodyPosition;
	}
	public void setBodyPosition(ims.domain.lookups.LookupInstance bodyPosition) {
		this.bodyPosition = bodyPosition;
	}

	public ims.domain.lookups.LookupInstance getLeftArmPosition() {
		return leftArmPosition;
	}
	public void setLeftArmPosition(ims.domain.lookups.LookupInstance leftArmPosition) {
		this.leftArmPosition = leftArmPosition;
	}

	public ims.domain.lookups.LookupInstance getRightArmPosition() {
		return rightArmPosition;
	}
	public void setRightArmPosition(ims.domain.lookups.LookupInstance rightArmPosition) {
		this.rightArmPosition = rightArmPosition;
	}

	public ims.domain.lookups.LookupInstance getLeftLegPosition() {
		return leftLegPosition;
	}
	public void setLeftLegPosition(ims.domain.lookups.LookupInstance leftLegPosition) {
		this.leftLegPosition = leftLegPosition;
	}

	public ims.domain.lookups.LookupInstance getRightLegPosition() {
		return rightLegPosition;
	}
	public void setRightLegPosition(ims.domain.lookups.LookupInstance rightLegPosition) {
		this.rightLegPosition = rightLegPosition;
	}

	public java.util.List getPositioningDevices() {
		if ( null == positioningDevices ) {
			positioningDevices = new java.util.ArrayList();
		}
		return positioningDevices;
	}
	public void setPositioningDevices(java.util.List paramValue) {
		this.positioningDevices = paramValue;
	}

	public ims.domain.lookups.LookupInstance getWasPatientWarmed() {
		return wasPatientWarmed;
	}
	public void setWasPatientWarmed(ims.domain.lookups.LookupInstance wasPatientWarmed) {
		this.wasPatientWarmed = wasPatientWarmed;
	}

	public ims.domain.lookups.LookupInstance getFluidWarmerUsed() {
		return fluidWarmerUsed;
	}
	public void setFluidWarmerUsed(ims.domain.lookups.LookupInstance fluidWarmerUsed) {
		this.fluidWarmerUsed = fluidWarmerUsed;
	}

	public ims.domain.lookups.LookupInstance getWarmingBlanketUsed() {
		return warmingBlanketUsed;
	}
	public void setWarmingBlanketUsed(ims.domain.lookups.LookupInstance warmingBlanketUsed) {
		this.warmingBlanketUsed = warmingBlanketUsed;
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
		auditStr.append("\r\n*patientPreparation* :");
		if (patientPreparation != null)
		{
		int i2=0;
		for (i2=0; i2<patientPreparation.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)patientPreparation.get(i2);
			auditStr.append(obj.getText());
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherDetails* :");
		auditStr.append(otherDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*skinIntegrityMaintained* :");
		if (skinIntegrityMaintained != null)
			auditStr.append(skinIntegrityMaintained.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientTransferToOperatingTableVia* :");
		if (patientTransferToOperatingTableVia != null)
			auditStr.append(patientTransferToOperatingTableVia.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientTransferFromOperatingTableVia1* :");
		if (patientTransferFromOperatingTableVia1 != null)
			auditStr.append(patientTransferFromOperatingTableVia1.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bodyPosition* :");
		if (bodyPosition != null)
			auditStr.append(bodyPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*leftArmPosition* :");
		if (leftArmPosition != null)
			auditStr.append(leftArmPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rightArmPosition* :");
		if (rightArmPosition != null)
			auditStr.append(rightArmPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*leftLegPosition* :");
		if (leftLegPosition != null)
			auditStr.append(leftLegPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rightLegPosition* :");
		if (rightLegPosition != null)
			auditStr.append(rightLegPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*positioningDevices* :");
		if (positioningDevices != null)
		{
		int i12=0;
		for (i12=0; i12<positioningDevices.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)positioningDevices.get(i12);
			auditStr.append(obj.getText());
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPatientWarmed* :");
		if (wasPatientWarmed != null)
			auditStr.append(wasPatientWarmed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fluidWarmerUsed* :");
		if (fluidWarmerUsed != null)
			auditStr.append(fluidWarmerUsed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*warmingBlanketUsed* :");
		if (warmingBlanketUsed != null)
			auditStr.append(warmingBlanketUsed.getText());
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
		
		String keyClassName = "PatientPreperationIntraOp";
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
		if (this.getPatientPreparation() != null)
		{
			if (this.getPatientPreparation().size() > 0 )
			{
			sb.append("<patientPreparation>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getPatientPreparation())); 
			sb.append("</patientPreparation>");		
			}
		}
		if (this.getOtherDetails() != null)
		{
			sb.append("<otherDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherDetails().toString()));
			sb.append("</otherDetails>");		
		}
		if (this.getSkinIntegrityMaintained() != null)
		{
			sb.append("<skinIntegrityMaintained>");
			sb.append(this.getSkinIntegrityMaintained().toXMLString()); 
			sb.append("</skinIntegrityMaintained>");		
		}
		if (this.getPatientTransferToOperatingTableVia() != null)
		{
			sb.append("<patientTransferToOperatingTableVia>");
			sb.append(this.getPatientTransferToOperatingTableVia().toXMLString()); 
			sb.append("</patientTransferToOperatingTableVia>");		
		}
		if (this.getPatientTransferFromOperatingTableVia1() != null)
		{
			sb.append("<patientTransferFromOperatingTableVia1>");
			sb.append(this.getPatientTransferFromOperatingTableVia1().toXMLString()); 
			sb.append("</patientTransferFromOperatingTableVia1>");		
		}
		if (this.getBodyPosition() != null)
		{
			sb.append("<bodyPosition>");
			sb.append(this.getBodyPosition().toXMLString()); 
			sb.append("</bodyPosition>");		
		}
		if (this.getLeftArmPosition() != null)
		{
			sb.append("<leftArmPosition>");
			sb.append(this.getLeftArmPosition().toXMLString()); 
			sb.append("</leftArmPosition>");		
		}
		if (this.getRightArmPosition() != null)
		{
			sb.append("<rightArmPosition>");
			sb.append(this.getRightArmPosition().toXMLString()); 
			sb.append("</rightArmPosition>");		
		}
		if (this.getLeftLegPosition() != null)
		{
			sb.append("<leftLegPosition>");
			sb.append(this.getLeftLegPosition().toXMLString()); 
			sb.append("</leftLegPosition>");		
		}
		if (this.getRightLegPosition() != null)
		{
			sb.append("<rightLegPosition>");
			sb.append(this.getRightLegPosition().toXMLString()); 
			sb.append("</rightLegPosition>");		
		}
		if (this.getPositioningDevices() != null)
		{
			if (this.getPositioningDevices().size() > 0 )
			{
			sb.append("<positioningDevices>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getPositioningDevices())); 
			sb.append("</positioningDevices>");		
			}
		}
		if (this.getWasPatientWarmed() != null)
		{
			sb.append("<wasPatientWarmed>");
			sb.append(this.getWasPatientWarmed().toXMLString()); 
			sb.append("</wasPatientWarmed>");		
		}
		if (this.getFluidWarmerUsed() != null)
		{
			sb.append("<fluidWarmerUsed>");
			sb.append(this.getFluidWarmerUsed().toXMLString()); 
			sb.append("</fluidWarmerUsed>");		
		}
		if (this.getWarmingBlanketUsed() != null)
		{
			sb.append("<warmingBlanketUsed>");
			sb.append(this.getWarmingBlanketUsed().toXMLString()); 
			sb.append("</warmingBlanketUsed>");		
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
			PatientPreperationIntraOp domainObject = getPatientPreperationIntraOpfromXML(itemEl, factory, domMap);

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
			PatientPreperationIntraOp domainObject = getPatientPreperationIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static PatientPreperationIntraOp getPatientPreperationIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientPreperationIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientPreperationIntraOp getPatientPreperationIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientPreperationIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientPreperationIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientPreperationIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientPreperationIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientPreperationIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientPreperationIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientPreperationIntraOp)factory.getImportedDomainObject(PatientPreperationIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientPreperationIntraOp();
		}
		String keyClassName = "PatientPreperationIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientPreperationIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientPreperationIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientPreparation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientPreparation(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getPatientPreparation())); 
		}
		fldEl = el.element("otherDetails");
		if(fldEl != null)
		{	
    		obj.setOtherDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("skinIntegrityMaintained");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSkinIntegrityMaintained(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientTransferToOperatingTableVia");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientTransferToOperatingTableVia(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientTransferFromOperatingTableVia1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientTransferFromOperatingTableVia1(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bodyPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBodyPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("leftArmPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLeftArmPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rightArmPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRightArmPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("leftLegPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLeftLegPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rightLegPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRightLegPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("positioningDevices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPositioningDevices(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getPositioningDevices())); 
		}
		fldEl = el.element("wasPatientWarmed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWasPatientWarmed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fluidWarmerUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFluidWarmerUsed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("warmingBlanketUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWarmingBlanketUsed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientPreparation"
		, "positioningDevices"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String PatientPreparation = "patientPreparation";
		public static final String OtherDetails = "otherDetails";
		public static final String SkinIntegrityMaintained = "skinIntegrityMaintained";
		public static final String PatientTransferToOperatingTableVia = "patientTransferToOperatingTableVia";
		public static final String PatientTransferFromOperatingTableVia1 = "patientTransferFromOperatingTableVia1";
		public static final String BodyPosition = "bodyPosition";
		public static final String LeftArmPosition = "leftArmPosition";
		public static final String RightArmPosition = "rightArmPosition";
		public static final String LeftLegPosition = "leftLegPosition";
		public static final String RightLegPosition = "rightLegPosition";
		public static final String PositioningDevices = "positioningDevices";
		public static final String WasPatientWarmed = "wasPatientWarmed";
		public static final String FluidWarmerUsed = "fluidWarmerUsed";
		public static final String WarmingBlanketUsed = "warmingBlanketUsed";
	}
}

