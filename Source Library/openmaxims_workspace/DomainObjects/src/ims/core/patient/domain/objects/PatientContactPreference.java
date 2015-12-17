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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class PatientContactPreference extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100015;
	private static final long serialVersionUID = 1001100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ContactName */
	private String contactName;
	/** PreferredContactTimes */
	private ims.domain.lookups.LookupInstance preferredContactTimes;
	/** PreferredContactMethod */
	private ims.domain.lookups.LookupInstance preferredContactMethod;
	/** PatientCallBackConsent */
	private Boolean patientCallBackConsent;
	/** A text string specifying the patient's preferred times for being contacted. */
	private String pdsPreferredContactTimes;
	/** A coded value for the patient's preferred written method of being contacted. */
	private ims.domain.lookups.LookupInstance pdsPreferredWrittenComm;
	/** Indicates whether a patient has expressly consented to or expressly dissented from having their clinical details used by NHS organisations for clinical consultation, treatment and for secondary uses of the data such as research purposes. */
	private ims.domain.lookups.LookupInstance pdsConsent;
	/** The date when the Consent to NHS Care Record Sharing status was last changed. */
	private java.util.Date pdsDateLastChanged;
	/** pdsPreferredContactMethod */
	private ims.domain.lookups.LookupInstance pdsPreferredContactMethod;
	private Boolean optOutOfReminders;
	/** To indicate the type of observed consent information */
	private ims.domain.lookups.LookupInstance pdsConsentType;
	/** PDS Update Mode */
	private ims.domain.lookups.LookupInstance pdsUpdateMode;
	/** consent comments */
	private String comment;
	/** PDS consent history
	  * Collection of ims.core.patient.domain.objects.pdsConsentHistory.
	  */
	private java.util.List consentHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientContactPreference (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientContactPreference ()
    {
    	super();
    }
    public PatientContactPreference (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PatientContactPreference.class;
	}


	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		if ( null != contactName && contactName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contactName. Tried to set value: "+
				contactName);
		}
		this.contactName = contactName;
	}

	public ims.domain.lookups.LookupInstance getPreferredContactTimes() {
		return preferredContactTimes;
	}
	public void setPreferredContactTimes(ims.domain.lookups.LookupInstance preferredContactTimes) {
		this.preferredContactTimes = preferredContactTimes;
	}

	public ims.domain.lookups.LookupInstance getPreferredContactMethod() {
		return preferredContactMethod;
	}
	public void setPreferredContactMethod(ims.domain.lookups.LookupInstance preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}

	public Boolean isPatientCallBackConsent() {
		return patientCallBackConsent;
	}
	public void setPatientCallBackConsent(Boolean patientCallBackConsent) {
		this.patientCallBackConsent = patientCallBackConsent;
	}

	public String getPdsPreferredContactTimes() {
		return pdsPreferredContactTimes;
	}
	public void setPdsPreferredContactTimes(String pdsPreferredContactTimes) {
		if ( null != pdsPreferredContactTimes && pdsPreferredContactTimes.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pdsPreferredContactTimes. Tried to set value: "+
				pdsPreferredContactTimes);
		}
		this.pdsPreferredContactTimes = pdsPreferredContactTimes;
	}

	public ims.domain.lookups.LookupInstance getPdsPreferredWrittenComm() {
		return pdsPreferredWrittenComm;
	}
	public void setPdsPreferredWrittenComm(ims.domain.lookups.LookupInstance pdsPreferredWrittenComm) {
		this.pdsPreferredWrittenComm = pdsPreferredWrittenComm;
	}

	public ims.domain.lookups.LookupInstance getPdsConsent() {
		return pdsConsent;
	}
	public void setPdsConsent(ims.domain.lookups.LookupInstance pdsConsent) {
		this.pdsConsent = pdsConsent;
	}

	public java.util.Date getPdsDateLastChanged() {
		return pdsDateLastChanged;
	}
	public void setPdsDateLastChanged(java.util.Date pdsDateLastChanged) {
		this.pdsDateLastChanged = pdsDateLastChanged;
	}

	public ims.domain.lookups.LookupInstance getPdsPreferredContactMethod() {
		return pdsPreferredContactMethod;
	}
	public void setPdsPreferredContactMethod(ims.domain.lookups.LookupInstance pdsPreferredContactMethod) {
		this.pdsPreferredContactMethod = pdsPreferredContactMethod;
	}

	public Boolean isOptOutOfReminders() {
		return optOutOfReminders;
	}
	public void setOptOutOfReminders(Boolean optOutOfReminders) {
		this.optOutOfReminders = optOutOfReminders;
	}

	public ims.domain.lookups.LookupInstance getPdsConsentType() {
		return pdsConsentType;
	}
	public void setPdsConsentType(ims.domain.lookups.LookupInstance pdsConsentType) {
		this.pdsConsentType = pdsConsentType;
	}

	public ims.domain.lookups.LookupInstance getPdsUpdateMode() {
		return pdsUpdateMode;
	}
	public void setPdsUpdateMode(ims.domain.lookups.LookupInstance pdsUpdateMode) {
		this.pdsUpdateMode = pdsUpdateMode;
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

	public java.util.List getConsentHistory() {
		if ( null == consentHistory ) {
			consentHistory = new java.util.ArrayList();
		}
		return consentHistory;
	}
	public void setConsentHistory(java.util.List paramValue) {
		this.consentHistory = paramValue;
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
		
		auditStr.append("\r\n*contactName* :");
		auditStr.append(contactName);
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredContactTimes* :");
		if (preferredContactTimes != null)
			auditStr.append(preferredContactTimes.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredContactMethod* :");
		if (preferredContactMethod != null)
			auditStr.append(preferredContactMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientCallBackConsent* :");
		auditStr.append(patientCallBackConsent);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsPreferredContactTimes* :");
		auditStr.append(pdsPreferredContactTimes);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsPreferredWrittenComm* :");
		if (pdsPreferredWrittenComm != null)
			auditStr.append(pdsPreferredWrittenComm.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsConsent* :");
		if (pdsConsent != null)
			auditStr.append(pdsConsent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsDateLastChanged* :");
		auditStr.append(pdsDateLastChanged);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsPreferredContactMethod* :");
		if (pdsPreferredContactMethod != null)
			auditStr.append(pdsPreferredContactMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*optOutOfReminders* :");
		auditStr.append(optOutOfReminders);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsConsentType* :");
		if (pdsConsentType != null)
			auditStr.append(pdsConsentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsUpdateMode* :");
		if (pdsUpdateMode != null)
			auditStr.append(pdsUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*consentHistory* :");
		if (consentHistory != null)
		{
		int i14=0;
		for (i14=0; i14<consentHistory.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.pdsConsentHistory obj = (ims.core.patient.domain.objects.pdsConsentHistory)consentHistory.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
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
		
		String keyClassName = "PatientContactPreference";
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
		if (this.getContactName() != null)
		{
			sb.append("<contactName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContactName().toString()));
			sb.append("</contactName>");		
		}
		if (this.getPreferredContactTimes() != null)
		{
			sb.append("<preferredContactTimes>");
			sb.append(this.getPreferredContactTimes().toXMLString()); 
			sb.append("</preferredContactTimes>");		
		}
		if (this.getPreferredContactMethod() != null)
		{
			sb.append("<preferredContactMethod>");
			sb.append(this.getPreferredContactMethod().toXMLString()); 
			sb.append("</preferredContactMethod>");		
		}
		if (this.isPatientCallBackConsent() != null)
		{
			sb.append("<patientCallBackConsent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPatientCallBackConsent().toString()));
			sb.append("</patientCallBackConsent>");		
		}
		if (this.getPdsPreferredContactTimes() != null)
		{
			sb.append("<pdsPreferredContactTimes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPdsPreferredContactTimes().toString()));
			sb.append("</pdsPreferredContactTimes>");		
		}
		if (this.getPdsPreferredWrittenComm() != null)
		{
			sb.append("<pdsPreferredWrittenComm>");
			sb.append(this.getPdsPreferredWrittenComm().toXMLString()); 
			sb.append("</pdsPreferredWrittenComm>");		
		}
		if (this.getPdsConsent() != null)
		{
			sb.append("<pdsConsent>");
			sb.append(this.getPdsConsent().toXMLString()); 
			sb.append("</pdsConsent>");		
		}
		if (this.getPdsDateLastChanged() != null)
		{
			sb.append("<pdsDateLastChanged>");
			sb.append(new ims.framework.utils.DateTime(this.getPdsDateLastChanged()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</pdsDateLastChanged>");		
		}
		if (this.getPdsPreferredContactMethod() != null)
		{
			sb.append("<pdsPreferredContactMethod>");
			sb.append(this.getPdsPreferredContactMethod().toXMLString()); 
			sb.append("</pdsPreferredContactMethod>");		
		}
		if (this.isOptOutOfReminders() != null)
		{
			sb.append("<optOutOfReminders>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOptOutOfReminders().toString()));
			sb.append("</optOutOfReminders>");		
		}
		if (this.getPdsConsentType() != null)
		{
			sb.append("<pdsConsentType>");
			sb.append(this.getPdsConsentType().toXMLString()); 
			sb.append("</pdsConsentType>");		
		}
		if (this.getPdsUpdateMode() != null)
		{
			sb.append("<pdsUpdateMode>");
			sb.append(this.getPdsUpdateMode().toXMLString()); 
			sb.append("</pdsUpdateMode>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getConsentHistory() != null)
		{
			if (this.getConsentHistory().size() > 0 )
			{
			sb.append("<consentHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsentHistory(), domMap));
			sb.append("</consentHistory>");		
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
			PatientContactPreference domainObject = getPatientContactPreferencefromXML(itemEl, factory, domMap);

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
			PatientContactPreference domainObject = getPatientContactPreferencefromXML(itemEl, factory, domMap);

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
		
	public static PatientContactPreference getPatientContactPreferencefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientContactPreferencefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientContactPreference getPatientContactPreferencefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientContactPreference.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientContactPreference.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientContactPreference class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientContactPreference)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientContactPreference.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientContactPreference ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientContactPreference)factory.getImportedDomainObject(PatientContactPreference.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientContactPreference();
		}
		String keyClassName = "PatientContactPreference";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientContactPreference)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientContactPreference obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("contactName");
		if(fldEl != null)
		{	
    		obj.setContactName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preferredContactTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreferredContactTimes(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preferredContactMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreferredContactMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientCallBackConsent");
		if(fldEl != null)
		{	
    		obj.setPatientCallBackConsent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsPreferredContactTimes");
		if(fldEl != null)
		{	
    		obj.setPdsPreferredContactTimes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsPreferredWrittenComm");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsPreferredWrittenComm(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pdsConsent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsConsent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pdsDateLastChanged");
		if(fldEl != null)
		{	
    		obj.setPdsDateLastChanged(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pdsPreferredContactMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsPreferredContactMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("optOutOfReminders");
		if(fldEl != null)
		{	
    		obj.setOptOutOfReminders(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsConsentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsConsentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pdsUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consentHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setConsentHistory(ims.core.patient.domain.objects.pdsConsentHistory.fromListXMLString(fldEl, factory, obj.getConsentHistory(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "consentHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ContactName = "contactName";
		public static final String PreferredContactTimes = "preferredContactTimes";
		public static final String PreferredContactMethod = "preferredContactMethod";
		public static final String PatientCallBackConsent = "patientCallBackConsent";
		public static final String PdsPreferredContactTimes = "pdsPreferredContactTimes";
		public static final String PdsPreferredWrittenComm = "pdsPreferredWrittenComm";
		public static final String PdsConsent = "pdsConsent";
		public static final String PdsDateLastChanged = "pdsDateLastChanged";
		public static final String PdsPreferredContactMethod = "pdsPreferredContactMethod";
		public static final String OptOutOfReminders = "optOutOfReminders";
		public static final String PdsConsentType = "pdsConsentType";
		public static final String PdsUpdateMode = "pdsUpdateMode";
		public static final String Comment = "comment";
		public static final String ConsentHistory = "consentHistory";
	}
}

