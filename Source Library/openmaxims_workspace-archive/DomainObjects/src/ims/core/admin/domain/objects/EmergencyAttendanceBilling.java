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


public class EmergencyAttendanceBilling extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100063;
	private static final long serialVersionUID = 1004100063L;
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
	/** Is Patient Exempt */
	private ims.domain.lookups.LookupInstance isPatientExempt;
	/** Exemption Reason */
	private ims.domain.lookups.LookupInstance exemptionReason;
	/** Exemption Reason Other */
	private String exemptionReasonOther;
	/** Payment Made */
	private ims.domain.lookups.LookupInstance paymentMade;
	/** Payment Type */
	private ims.domain.lookups.LookupInstance paymentType;
	/** Invoice Amount */
	private Integer invoiceAmount;
	/** Reason For Non Payment */
	private ims.domain.lookups.LookupInstance reasonForNonPayment;
	/** Payment Refunded */
	private ims.domain.lookups.LookupInstance paymentRefunded;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EmergencyAttendanceBilling (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EmergencyAttendanceBilling ()
    {
    	super();
    }
    public EmergencyAttendanceBilling (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.EmergencyAttendanceBilling.class;
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

	public ims.domain.lookups.LookupInstance getIsPatientExempt() {
		return isPatientExempt;
	}
	public void setIsPatientExempt(ims.domain.lookups.LookupInstance isPatientExempt) {
		this.isPatientExempt = isPatientExempt;
	}

	public ims.domain.lookups.LookupInstance getExemptionReason() {
		return exemptionReason;
	}
	public void setExemptionReason(ims.domain.lookups.LookupInstance exemptionReason) {
		this.exemptionReason = exemptionReason;
	}

	public String getExemptionReasonOther() {
		return exemptionReasonOther;
	}
	public void setExemptionReasonOther(String exemptionReasonOther) {
		if ( null != exemptionReasonOther && exemptionReasonOther.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for exemptionReasonOther. Tried to set value: "+
				exemptionReasonOther);
		}
		this.exemptionReasonOther = exemptionReasonOther;
	}

	public ims.domain.lookups.LookupInstance getPaymentMade() {
		return paymentMade;
	}
	public void setPaymentMade(ims.domain.lookups.LookupInstance paymentMade) {
		this.paymentMade = paymentMade;
	}

	public ims.domain.lookups.LookupInstance getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(ims.domain.lookups.LookupInstance paymentType) {
		this.paymentType = paymentType;
	}

	public Integer getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(Integer invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public ims.domain.lookups.LookupInstance getReasonForNonPayment() {
		return reasonForNonPayment;
	}
	public void setReasonForNonPayment(ims.domain.lookups.LookupInstance reasonForNonPayment) {
		this.reasonForNonPayment = reasonForNonPayment;
	}

	public ims.domain.lookups.LookupInstance getPaymentRefunded() {
		return paymentRefunded;
	}
	public void setPaymentRefunded(ims.domain.lookups.LookupInstance paymentRefunded) {
		this.paymentRefunded = paymentRefunded;
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
		auditStr.append("\r\n*isPatientExempt* :");
		if (isPatientExempt != null)
			auditStr.append(isPatientExempt.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*exemptionReason* :");
		if (exemptionReason != null)
			auditStr.append(exemptionReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*exemptionReasonOther* :");
		auditStr.append(exemptionReasonOther);
	    auditStr.append("; ");
		auditStr.append("\r\n*paymentMade* :");
		if (paymentMade != null)
			auditStr.append(paymentMade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*paymentType* :");
		if (paymentType != null)
			auditStr.append(paymentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*invoiceAmount* :");
		auditStr.append(invoiceAmount);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForNonPayment* :");
		if (reasonForNonPayment != null)
			auditStr.append(reasonForNonPayment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*paymentRefunded* :");
		if (paymentRefunded != null)
			auditStr.append(paymentRefunded.getText());
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
		
		String keyClassName = "EmergencyAttendanceBilling";
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
		if (this.getIsPatientExempt() != null)
		{
			sb.append("<isPatientExempt>");
			sb.append(this.getIsPatientExempt().toXMLString()); 
			sb.append("</isPatientExempt>");		
		}
		if (this.getExemptionReason() != null)
		{
			sb.append("<exemptionReason>");
			sb.append(this.getExemptionReason().toXMLString()); 
			sb.append("</exemptionReason>");		
		}
		if (this.getExemptionReasonOther() != null)
		{
			sb.append("<exemptionReasonOther>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExemptionReasonOther().toString()));
			sb.append("</exemptionReasonOther>");		
		}
		if (this.getPaymentMade() != null)
		{
			sb.append("<paymentMade>");
			sb.append(this.getPaymentMade().toXMLString()); 
			sb.append("</paymentMade>");		
		}
		if (this.getPaymentType() != null)
		{
			sb.append("<paymentType>");
			sb.append(this.getPaymentType().toXMLString()); 
			sb.append("</paymentType>");		
		}
		if (this.getInvoiceAmount() != null)
		{
			sb.append("<invoiceAmount>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvoiceAmount().toString()));
			sb.append("</invoiceAmount>");		
		}
		if (this.getReasonForNonPayment() != null)
		{
			sb.append("<reasonForNonPayment>");
			sb.append(this.getReasonForNonPayment().toXMLString()); 
			sb.append("</reasonForNonPayment>");		
		}
		if (this.getPaymentRefunded() != null)
		{
			sb.append("<paymentRefunded>");
			sb.append(this.getPaymentRefunded().toXMLString()); 
			sb.append("</paymentRefunded>");		
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
			EmergencyAttendanceBilling domainObject = getEmergencyAttendanceBillingfromXML(itemEl, factory, domMap);

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
			EmergencyAttendanceBilling domainObject = getEmergencyAttendanceBillingfromXML(itemEl, factory, domMap);

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
		
	public static EmergencyAttendanceBilling getEmergencyAttendanceBillingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEmergencyAttendanceBillingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EmergencyAttendanceBilling getEmergencyAttendanceBillingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EmergencyAttendanceBilling.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EmergencyAttendanceBilling.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EmergencyAttendanceBilling class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EmergencyAttendanceBilling)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EmergencyAttendanceBilling.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EmergencyAttendanceBilling ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EmergencyAttendanceBilling)factory.getImportedDomainObject(EmergencyAttendanceBilling.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EmergencyAttendanceBilling();
		}
		String keyClassName = "EmergencyAttendanceBilling";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EmergencyAttendanceBilling)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EmergencyAttendanceBilling obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("isPatientExempt");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsPatientExempt(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("exemptionReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExemptionReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("exemptionReasonOther");
		if(fldEl != null)
		{	
    		obj.setExemptionReasonOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("paymentMade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPaymentMade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("paymentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPaymentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("invoiceAmount");
		if(fldEl != null)
		{	
    		obj.setInvoiceAmount(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonForNonPayment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForNonPayment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("paymentRefunded");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPaymentRefunded(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String IsPatientExempt = "isPatientExempt";
		public static final String ExemptionReason = "exemptionReason";
		public static final String ExemptionReasonOther = "exemptionReasonOther";
		public static final String PaymentMade = "paymentMade";
		public static final String PaymentType = "paymentType";
		public static final String InvoiceAmount = "invoiceAmount";
		public static final String ReasonForNonPayment = "reasonForNonPayment";
		public static final String PaymentRefunded = "paymentRefunded";
	}
}

