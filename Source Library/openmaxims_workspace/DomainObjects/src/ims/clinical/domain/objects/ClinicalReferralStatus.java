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
 * @author Rory Fitzpatrick
 * Generated.
 */


public class ClinicalReferralStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100113;
	private static final long serialVersionUID = 1072100113L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ReferralStatus */
	private ims.domain.lookups.LookupInstance referralStatus;
	/** RecordingInfo */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo;
	/** RejectionReason */
	private ims.domain.lookups.LookupInstance rejectionReason;
	/** RejectionReasonText */
	private String rejectionReasonText;
	/** InternalReferralStatusChangeReason */
	private ims.domain.lookups.LookupInstance internalReferralStatusChangeReason;
	/** Appointment Required */
	private Boolean appointmentRequired;
	/** Appointment Booked */
	private Boolean appointmentBooked;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalReferralStatus (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalReferralStatus ()
    {
    	super();
    }
    public ClinicalReferralStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.ClinicalReferralStatus.class;
	}


	public ims.domain.lookups.LookupInstance getReferralStatus() {
		return referralStatus;
	}
	public void setReferralStatus(ims.domain.lookups.LookupInstance referralStatus) {
		this.referralStatus = referralStatus;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
	}

	public ims.domain.lookups.LookupInstance getRejectionReason() {
		return rejectionReason;
	}
	public void setRejectionReason(ims.domain.lookups.LookupInstance rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getRejectionReasonText() {
		return rejectionReasonText;
	}
	public void setRejectionReasonText(String rejectionReasonText) {
		if ( null != rejectionReasonText && rejectionReasonText.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rejectionReasonText. Tried to set value: "+
				rejectionReasonText);
		}
		this.rejectionReasonText = rejectionReasonText;
	}

	public ims.domain.lookups.LookupInstance getInternalReferralStatusChangeReason() {
		return internalReferralStatusChangeReason;
	}
	public void setInternalReferralStatusChangeReason(ims.domain.lookups.LookupInstance internalReferralStatusChangeReason) {
		this.internalReferralStatusChangeReason = internalReferralStatusChangeReason;
	}

	public Boolean isAppointmentRequired() {
		return appointmentRequired;
	}
	public void setAppointmentRequired(Boolean appointmentRequired) {
		this.appointmentRequired = appointmentRequired;
	}

	public Boolean isAppointmentBooked() {
		return appointmentBooked;
	}
	public void setAppointmentBooked(Boolean appointmentBooked) {
		this.appointmentBooked = appointmentBooked;
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
		
		auditStr.append("\r\n*referralStatus* :");
		if (referralStatus != null)
			auditStr.append(referralStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectionReason* :");
		if (rejectionReason != null)
			auditStr.append(rejectionReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectionReasonText* :");
		auditStr.append(rejectionReasonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*internalReferralStatusChangeReason* :");
		if (internalReferralStatusChangeReason != null)
			auditStr.append(internalReferralStatusChangeReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentRequired* :");
		auditStr.append(appointmentRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentBooked* :");
		auditStr.append(appointmentBooked);
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
		
		String keyClassName = "ClinicalReferralStatus";
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
		if (this.getReferralStatus() != null)
		{
			sb.append("<referralStatus>");
			sb.append(this.getReferralStatus().toXMLString()); 
			sb.append("</referralStatus>");		
		}
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
		}
		if (this.getRejectionReason() != null)
		{
			sb.append("<rejectionReason>");
			sb.append(this.getRejectionReason().toXMLString()); 
			sb.append("</rejectionReason>");		
		}
		if (this.getRejectionReasonText() != null)
		{
			sb.append("<rejectionReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRejectionReasonText().toString()));
			sb.append("</rejectionReasonText>");		
		}
		if (this.getInternalReferralStatusChangeReason() != null)
		{
			sb.append("<internalReferralStatusChangeReason>");
			sb.append(this.getInternalReferralStatusChangeReason().toXMLString()); 
			sb.append("</internalReferralStatusChangeReason>");		
		}
		if (this.isAppointmentRequired() != null)
		{
			sb.append("<appointmentRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAppointmentRequired().toString()));
			sb.append("</appointmentRequired>");		
		}
		if (this.isAppointmentBooked() != null)
		{
			sb.append("<appointmentBooked>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAppointmentBooked().toString()));
			sb.append("</appointmentBooked>");		
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
			ClinicalReferralStatus domainObject = getClinicalReferralStatusfromXML(itemEl, factory, domMap);

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
			ClinicalReferralStatus domainObject = getClinicalReferralStatusfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalReferralStatus getClinicalReferralStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalReferralStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalReferralStatus getClinicalReferralStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalReferralStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalReferralStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalReferralStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalReferralStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalReferralStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalReferralStatus ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalReferralStatus)factory.getImportedDomainObject(ClinicalReferralStatus.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalReferralStatus();
		}
		String keyClassName = "ClinicalReferralStatus";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalReferralStatus)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalReferralStatus obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("referralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rejectionReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRejectionReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rejectionReasonText");
		if(fldEl != null)
		{	
    		obj.setRejectionReasonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("internalReferralStatusChangeReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInternalReferralStatusChangeReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appointmentRequired");
		if(fldEl != null)
		{	
    		obj.setAppointmentRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointmentBooked");
		if(fldEl != null)
		{	
    		obj.setAppointmentBooked(new Boolean(fldEl.getTextTrim()));	
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
		public static final String ReferralStatus = "referralStatus";
		public static final String RecordingInfo = "recordingInfo";
		public static final String RejectionReason = "rejectionReason";
		public static final String RejectionReasonText = "rejectionReasonText";
		public static final String InternalReferralStatusChangeReason = "internalReferralStatusChangeReason";
		public static final String AppointmentRequired = "appointmentRequired";
		public static final String AppointmentBooked = "appointmentBooked";
	}
}

