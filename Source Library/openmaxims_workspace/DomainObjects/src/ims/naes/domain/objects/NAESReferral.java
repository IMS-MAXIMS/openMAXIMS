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
package ims.naes.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class NAESReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1097100004;
	private static final long serialVersionUID = 1097100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date Received */
	private java.util.Date dateReferralReceived;
	/** Date of Surgery */
	private java.util.Date dateOfSurgery;
	/** Referring Hospital */
	private String referringHospital;
	/** Referring Doctor */
	private String referringDoctor;
	/** Reason for Referral */
	private ims.domain.lookups.LookupInstance referralReason;
	/** Secondary Surgery */
	private ims.domain.lookups.LookupInstance secondarySurgery;
	/** Underlying Reason */
	private ims.domain.lookups.LookupInstance underlyingReason;
	/** Laterality of Affected Eye */
	private ims.domain.lookups.LookupInstance affectedEye;
	/** Implant? */
	private ims.domain.lookups.LookupInstance implant;
	/** Implant Type */
	private ims.domain.lookups.LookupInstance implantType;
	/** Interpreter Required? */
	private ims.domain.lookups.LookupInstance interpreterRequired;
	/** Language */
	private ims.domain.lookups.LookupInstance language;
	/** Language - If Other */
	private String languageIfOther;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** ReferredBy */
	private ims.domain.lookups.LookupInstance referredBy;
	/** 6 Week KPI Date */
	private java.util.Date _6weekKPI;
	/** 3 Week KPI Date */
	private java.util.Date _3weekKPI;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Preferred Clinic */
	private String preferredClinic;
	/** Notes */
	private String notes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NAESReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NAESReferral ()
    {
    	super();
    }
    public NAESReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.naes.domain.objects.NAESReferral.class;
	}


	public java.util.Date getDateReferralReceived() {
		return dateReferralReceived;
	}
	public void setDateReferralReceived(java.util.Date dateReferralReceived) {
		this.dateReferralReceived = dateReferralReceived;
	}

	public java.util.Date getDateOfSurgery() {
		return dateOfSurgery;
	}
	public void setDateOfSurgery(java.util.Date dateOfSurgery) {
		this.dateOfSurgery = dateOfSurgery;
	}

	public String getReferringHospital() {
		return referringHospital;
	}
	public void setReferringHospital(String referringHospital) {
		if ( null != referringHospital && referringHospital.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referringHospital. Tried to set value: "+
				referringHospital);
		}
		this.referringHospital = referringHospital;
	}

	public String getReferringDoctor() {
		return referringDoctor;
	}
	public void setReferringDoctor(String referringDoctor) {
		if ( null != referringDoctor && referringDoctor.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referringDoctor. Tried to set value: "+
				referringDoctor);
		}
		this.referringDoctor = referringDoctor;
	}

	public ims.domain.lookups.LookupInstance getReferralReason() {
		return referralReason;
	}
	public void setReferralReason(ims.domain.lookups.LookupInstance referralReason) {
		this.referralReason = referralReason;
	}

	public ims.domain.lookups.LookupInstance getSecondarySurgery() {
		return secondarySurgery;
	}
	public void setSecondarySurgery(ims.domain.lookups.LookupInstance secondarySurgery) {
		this.secondarySurgery = secondarySurgery;
	}

	public ims.domain.lookups.LookupInstance getUnderlyingReason() {
		return underlyingReason;
	}
	public void setUnderlyingReason(ims.domain.lookups.LookupInstance underlyingReason) {
		this.underlyingReason = underlyingReason;
	}

	public ims.domain.lookups.LookupInstance getAffectedEye() {
		return affectedEye;
	}
	public void setAffectedEye(ims.domain.lookups.LookupInstance affectedEye) {
		this.affectedEye = affectedEye;
	}

	public ims.domain.lookups.LookupInstance getImplant() {
		return implant;
	}
	public void setImplant(ims.domain.lookups.LookupInstance implant) {
		this.implant = implant;
	}

	public ims.domain.lookups.LookupInstance getImplantType() {
		return implantType;
	}
	public void setImplantType(ims.domain.lookups.LookupInstance implantType) {
		this.implantType = implantType;
	}

	public ims.domain.lookups.LookupInstance getInterpreterRequired() {
		return interpreterRequired;
	}
	public void setInterpreterRequired(ims.domain.lookups.LookupInstance interpreterRequired) {
		this.interpreterRequired = interpreterRequired;
	}

	public ims.domain.lookups.LookupInstance getLanguage() {
		return language;
	}
	public void setLanguage(ims.domain.lookups.LookupInstance language) {
		this.language = language;
	}

	public String getLanguageIfOther() {
		return languageIfOther;
	}
	public void setLanguageIfOther(String languageIfOther) {
		if ( null != languageIfOther && languageIfOther.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for languageIfOther. Tried to set value: "+
				languageIfOther);
		}
		this.languageIfOther = languageIfOther;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static java.util.List listNAESReferralByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from NAESReferral c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.domain.lookups.LookupInstance getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(ims.domain.lookups.LookupInstance referredBy) {
		this.referredBy = referredBy;
	}

	public java.util.Date get_6weekKPI() {
		return _6weekKPI;
	}
	public void set_6weekKPI(java.util.Date _6weekKPI) {
		this._6weekKPI = _6weekKPI;
	}

	public java.util.Date get_3weekKPI() {
		return _3weekKPI;
	}
	public void set_3weekKPI(java.util.Date _3weekKPI) {
		this._3weekKPI = _3weekKPI;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public String getPreferredClinic() {
		return preferredClinic;
	}
	public void setPreferredClinic(String preferredClinic) {
		if ( null != preferredClinic && preferredClinic.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for preferredClinic. Tried to set value: "+
				preferredClinic);
		}
		this.preferredClinic = preferredClinic;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
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
		
		auditStr.append("\r\n*dateReferralReceived* :");
		auditStr.append(dateReferralReceived);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfSurgery* :");
		auditStr.append(dateOfSurgery);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringHospital* :");
		auditStr.append(referringHospital);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringDoctor* :");
		auditStr.append(referringDoctor);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralReason* :");
		if (referralReason != null)
			auditStr.append(referralReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*secondarySurgery* :");
		if (secondarySurgery != null)
			auditStr.append(secondarySurgery.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*underlyingReason* :");
		if (underlyingReason != null)
			auditStr.append(underlyingReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*affectedEye* :");
		if (affectedEye != null)
			auditStr.append(affectedEye.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*implant* :");
		if (implant != null)
			auditStr.append(implant.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*implantType* :");
		if (implantType != null)
			auditStr.append(implantType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*interpreterRequired* :");
		if (interpreterRequired != null)
			auditStr.append(interpreterRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*language* :");
		if (language != null)
			auditStr.append(language.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*languageIfOther* :");
		auditStr.append(languageIfOther);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referredBy* :");
		if (referredBy != null)
			auditStr.append(referredBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_6weekKPI* :");
		auditStr.append(_6weekKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*_3weekKPI* :");
		auditStr.append(_3weekKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredClinic* :");
		auditStr.append(preferredClinic);
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
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
		
		String keyClassName = "NAESReferral";
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
		if (this.getDateReferralReceived() != null)
		{
			sb.append("<dateReferralReceived>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReferralReceived()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReferralReceived>");		
		}
		if (this.getDateOfSurgery() != null)
		{
			sb.append("<dateOfSurgery>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfSurgery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfSurgery>");		
		}
		if (this.getReferringHospital() != null)
		{
			sb.append("<referringHospital>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferringHospital().toString()));
			sb.append("</referringHospital>");		
		}
		if (this.getReferringDoctor() != null)
		{
			sb.append("<referringDoctor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferringDoctor().toString()));
			sb.append("</referringDoctor>");		
		}
		if (this.getReferralReason() != null)
		{
			sb.append("<referralReason>");
			sb.append(this.getReferralReason().toXMLString()); 
			sb.append("</referralReason>");		
		}
		if (this.getSecondarySurgery() != null)
		{
			sb.append("<secondarySurgery>");
			sb.append(this.getSecondarySurgery().toXMLString()); 
			sb.append("</secondarySurgery>");		
		}
		if (this.getUnderlyingReason() != null)
		{
			sb.append("<underlyingReason>");
			sb.append(this.getUnderlyingReason().toXMLString()); 
			sb.append("</underlyingReason>");		
		}
		if (this.getAffectedEye() != null)
		{
			sb.append("<affectedEye>");
			sb.append(this.getAffectedEye().toXMLString()); 
			sb.append("</affectedEye>");		
		}
		if (this.getImplant() != null)
		{
			sb.append("<implant>");
			sb.append(this.getImplant().toXMLString()); 
			sb.append("</implant>");		
		}
		if (this.getImplantType() != null)
		{
			sb.append("<implantType>");
			sb.append(this.getImplantType().toXMLString()); 
			sb.append("</implantType>");		
		}
		if (this.getInterpreterRequired() != null)
		{
			sb.append("<interpreterRequired>");
			sb.append(this.getInterpreterRequired().toXMLString()); 
			sb.append("</interpreterRequired>");		
		}
		if (this.getLanguage() != null)
		{
			sb.append("<language>");
			sb.append(this.getLanguage().toXMLString()); 
			sb.append("</language>");		
		}
		if (this.getLanguageIfOther() != null)
		{
			sb.append("<languageIfOther>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLanguageIfOther().toString()));
			sb.append("</languageIfOther>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getReferredBy() != null)
		{
			sb.append("<referredBy>");
			sb.append(this.getReferredBy().toXMLString()); 
			sb.append("</referredBy>");		
		}
		if (this.get_6weekKPI() != null)
		{
			sb.append("<_6weekKPI>");
			sb.append(new ims.framework.utils.DateTime(this.get_6weekKPI()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_6weekKPI>");		
		}
		if (this.get_3weekKPI() != null)
		{
			sb.append("<_3weekKPI>");
			sb.append(new ims.framework.utils.DateTime(this.get_3weekKPI()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_3weekKPI>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPreferredClinic() != null)
		{
			sb.append("<preferredClinic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreferredClinic().toString()));
			sb.append("</preferredClinic>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
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
			NAESReferral domainObject = getNAESReferralfromXML(itemEl, factory, domMap);

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
			NAESReferral domainObject = getNAESReferralfromXML(itemEl, factory, domMap);

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
		
	public static NAESReferral getNAESReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNAESReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NAESReferral getNAESReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NAESReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NAESReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NAESReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NAESReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NAESReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NAESReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NAESReferral)factory.getImportedDomainObject(NAESReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NAESReferral();
		}
		String keyClassName = "NAESReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NAESReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NAESReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateReferralReceived");
		if(fldEl != null)
		{	
    		obj.setDateReferralReceived(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateOfSurgery");
		if(fldEl != null)
		{	
    		obj.setDateOfSurgery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referringHospital");
		if(fldEl != null)
		{	
    		obj.setReferringHospital(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referringDoctor");
		if(fldEl != null)
		{	
    		obj.setReferringDoctor(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("secondarySurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondarySurgery(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("underlyingReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnderlyingReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("affectedEye");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAffectedEye(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("implant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImplant(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("implantType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImplantType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("interpreterRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInterpreterRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("language");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("languageIfOther");
		if(fldEl != null)
		{	
    		obj.setLanguageIfOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referredBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferredBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_6weekKPI");
		if(fldEl != null)
		{	
    		obj.set_6weekKPI(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_3weekKPI");
		if(fldEl != null)
		{	
    		obj.set_3weekKPI(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preferredClinic");
		if(fldEl != null)
		{	
    		obj.setPreferredClinic(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
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
		public static final String DateReferralReceived = "dateReferralReceived";
		public static final String DateOfSurgery = "dateOfSurgery";
		public static final String ReferringHospital = "referringHospital";
		public static final String ReferringDoctor = "referringDoctor";
		public static final String ReferralReason = "referralReason";
		public static final String SecondarySurgery = "secondarySurgery";
		public static final String UnderlyingReason = "underlyingReason";
		public static final String AffectedEye = "affectedEye";
		public static final String Implant = "implant";
		public static final String ImplantType = "implantType";
		public static final String InterpreterRequired = "interpreterRequired";
		public static final String Language = "language";
		public static final String LanguageIfOther = "languageIfOther";
		public static final String Patient = "patient";
		public static final String ReferredBy = "referredBy";
		public static final String _6weekKPI = "_6weekKPI";
		public static final String _3weekKPI = "_3weekKPI";
		public static final String CareContext = "careContext";
		public static final String PreferredClinic = "preferredClinic";
		public static final String Notes = "notes";
	}
}

