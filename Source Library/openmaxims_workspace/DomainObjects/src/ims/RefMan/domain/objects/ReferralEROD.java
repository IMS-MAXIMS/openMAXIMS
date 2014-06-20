/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class ReferralEROD extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100062;
	private static final long serialVersionUID = 1096100062L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The first EROD Date */
	private java.util.Date eRODDate1;
	/** A second EROD Date can be recorded */
	private java.util.Date eRODDate2;
	/** The Patient Available from Date */
	private java.util.Date patAvailFromDate;
	/** An indicator from the patient that they agreed the date was a reasonable offer */
	private Boolean reasonableOffer;
	/** Whether this relates to a Theatre Booking or an Outpatient Booking */
	private ims.domain.lookups.LookupInstance eRODType;
	/** When the appointment is made, the link to that appointment will be held against the EROD record */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	/** Sequence Order of record creation, default 1 */
	private Integer sequence;
	private Boolean isActive;
	/** PathWayClock */
	private ims.pathways.domain.objects.PathwayClock pathWayClock;
	/** ErodStatus */
	private ims.domain.lookups.LookupInstance erodStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralEROD (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralEROD ()
    {
    	super();
    }
    public ReferralEROD (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReferralEROD.class;
	}


	public java.util.Date getERODDate1() {
		return eRODDate1;
	}
	public void setERODDate1(java.util.Date eRODDate1) {
		this.eRODDate1 = eRODDate1;
	}

	public java.util.Date getERODDate2() {
		return eRODDate2;
	}
	public void setERODDate2(java.util.Date eRODDate2) {
		this.eRODDate2 = eRODDate2;
	}

	public java.util.Date getPatAvailFromDate() {
		return patAvailFromDate;
	}
	public void setPatAvailFromDate(java.util.Date patAvailFromDate) {
		this.patAvailFromDate = patAvailFromDate;
	}

	public Boolean isReasonableOffer() {
		return reasonableOffer;
	}
	public void setReasonableOffer(Boolean reasonableOffer) {
		this.reasonableOffer = reasonableOffer;
	}

	public ims.domain.lookups.LookupInstance getERODType() {
		return eRODType;
	}
	public void setERODType(ims.domain.lookups.LookupInstance eRODType) {
		this.eRODType = eRODType;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.pathways.domain.objects.PathwayClock getPathWayClock() {
		return pathWayClock;
	}
	public void setPathWayClock(ims.pathways.domain.objects.PathwayClock pathWayClock) {
		this.pathWayClock = pathWayClock;
	}

	public ims.domain.lookups.LookupInstance getErodStatus() {
		return erodStatus;
	}
	public void setErodStatus(ims.domain.lookups.LookupInstance erodStatus) {
		this.erodStatus = erodStatus;
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
		
		auditStr.append("\r\n*eRODDate1* :");
		auditStr.append(eRODDate1);
	    auditStr.append("; ");
		auditStr.append("\r\n*eRODDate2* :");
		auditStr.append(eRODDate2);
	    auditStr.append("; ");
		auditStr.append("\r\n*patAvailFromDate* :");
		auditStr.append(patAvailFromDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonableOffer* :");
		auditStr.append(reasonableOffer);
	    auditStr.append("; ");
		auditStr.append("\r\n*eRODType* :");
		if (eRODType != null)
			auditStr.append(eRODType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sequence* :");
		auditStr.append(sequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathWayClock* :");
		if (pathWayClock != null)
		{
			auditStr.append(toShortClassName(pathWayClock));
				
		    auditStr.append(pathWayClock.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*erodStatus* :");
		if (erodStatus != null)
			auditStr.append(erodStatus.getText());
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
		
		String keyClassName = "ReferralEROD";
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
		if (this.getERODDate1() != null)
		{
			sb.append("<eRODDate1>");
			sb.append(new ims.framework.utils.DateTime(this.getERODDate1()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eRODDate1>");		
		}
		if (this.getERODDate2() != null)
		{
			sb.append("<eRODDate2>");
			sb.append(new ims.framework.utils.DateTime(this.getERODDate2()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eRODDate2>");		
		}
		if (this.getPatAvailFromDate() != null)
		{
			sb.append("<patAvailFromDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPatAvailFromDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</patAvailFromDate>");		
		}
		if (this.isReasonableOffer() != null)
		{
			sb.append("<reasonableOffer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isReasonableOffer().toString()));
			sb.append("</reasonableOffer>");		
		}
		if (this.getERODType() != null)
		{
			sb.append("<eRODType>");
			sb.append(this.getERODType().toXMLString()); 
			sb.append("</eRODType>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequence().toString()));
			sb.append("</sequence>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getPathWayClock() != null)
		{
			sb.append("<pathWayClock>");
			sb.append(this.getPathWayClock().toXMLString(domMap)); 	
			sb.append("</pathWayClock>");		
		}
		if (this.getErodStatus() != null)
		{
			sb.append("<erodStatus>");
			sb.append(this.getErodStatus().toXMLString()); 
			sb.append("</erodStatus>");		
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
			ReferralEROD domainObject = getReferralERODfromXML(itemEl, factory, domMap);

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
			ReferralEROD domainObject = getReferralERODfromXML(itemEl, factory, domMap);

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
		
	public static ReferralEROD getReferralERODfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralERODfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralEROD getReferralERODfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralEROD.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralEROD.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralEROD class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralEROD)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralEROD.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralEROD ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralEROD)factory.getImportedDomainObject(ReferralEROD.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralEROD();
		}
		String keyClassName = "ReferralEROD";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralEROD)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralEROD obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("eRODDate1");
		if(fldEl != null)
		{	
    		obj.setERODDate1(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eRODDate2");
		if(fldEl != null)
		{	
    		obj.setERODDate2(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("patAvailFromDate");
		if(fldEl != null)
		{	
    		obj.setPatAvailFromDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonableOffer");
		if(fldEl != null)
		{	
    		obj.setReasonableOffer(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eRODType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setERODType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sequence");
		if(fldEl != null)
		{	
    		obj.setSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pathWayClock");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathWayClock(ims.pathways.domain.objects.PathwayClock.getPathwayClockfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("erodStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setErodStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ERODDate1 = "eRODDate1";
		public static final String ERODDate2 = "eRODDate2";
		public static final String PatAvailFromDate = "patAvailFromDate";
		public static final String ReasonableOffer = "reasonableOffer";
		public static final String ERODType = "eRODType";
		public static final String Appointment = "appointment";
		public static final String Sequence = "sequence";
		public static final String IsActive = "isActive";
		public static final String PathWayClock = "pathWayClock";
		public static final String ErodStatus = "erodStatus";
	}
}

