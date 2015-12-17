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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class InjuryDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100000;
	private static final long serialVersionUID = 1023100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Injury date */
	private java.util.Date injuryDate;
	/** Injury Time */
	private String injuryTime;
	/** ReferralDate */
	private java.util.Date referralDate;
	/** Transfer Time */
	private java.util.Date transferDate;
	/** Loss of Consciousness */
	private Boolean sufferedLOC;
	/** Duration Loss of Consciousness */
	private Integer durLOC;
	/** Duration Loss of Consciousness Units */
	private ims.domain.lookups.LookupInstance durLOCUnit;
	/** Patient requires ventillation */
	private ims.domain.lookups.LookupInstance requiresVentillation;
	/** Description of Injury */
	private String descriptionOfInjury;
	/** Presenting Complaints */
	private String presentingComplaints;
	/** Associated factor in Injury
	  * Collection of ims.medical.domain.objects.InjuryAssocFactor.
	  */
	private java.util.Set associatedFactor;
	/** Mode Of Injury */
	private ims.domain.lookups.LookupInstance modeOfInjury;
	/** Cause Of Injury */
	private ims.domain.lookups.LookupInstance causeOfInjury;
	/** Mechanism Of Injury */
	private ims.domain.lookups.LookupInstance mechanismOfInjury;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InjuryDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InjuryDetails ()
    {
    	super();
    }
    public InjuryDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.InjuryDetails.class;
	}


	public java.util.Date getInjuryDate() {
		return injuryDate;
	}
	public void setInjuryDate(java.util.Date injuryDate) {
		this.injuryDate = injuryDate;
	}

	public String getInjuryTime() {
		return injuryTime;
	}
	public void setInjuryTime(String injuryTime) {
		this.injuryTime = injuryTime;
	}

	public java.util.Date getReferralDate() {
		return referralDate;
	}
	public void setReferralDate(java.util.Date referralDate) {
		this.referralDate = referralDate;
	}

	public java.util.Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(java.util.Date transferDate) {
		this.transferDate = transferDate;
	}

	public Boolean isSufferedLOC() {
		return sufferedLOC;
	}
	public void setSufferedLOC(Boolean sufferedLOC) {
		this.sufferedLOC = sufferedLOC;
	}

	public Integer getDurLOC() {
		return durLOC;
	}
	public void setDurLOC(Integer durLOC) {
		this.durLOC = durLOC;
	}

	public ims.domain.lookups.LookupInstance getDurLOCUnit() {
		return durLOCUnit;
	}
	public void setDurLOCUnit(ims.domain.lookups.LookupInstance durLOCUnit) {
		this.durLOCUnit = durLOCUnit;
	}

	public ims.domain.lookups.LookupInstance getRequiresVentillation() {
		return requiresVentillation;
	}
	public void setRequiresVentillation(ims.domain.lookups.LookupInstance requiresVentillation) {
		this.requiresVentillation = requiresVentillation;
	}

	public String getDescriptionOfInjury() {
		return descriptionOfInjury;
	}
	public void setDescriptionOfInjury(String descriptionOfInjury) {
		if ( null != descriptionOfInjury && descriptionOfInjury.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for descriptionOfInjury. Tried to set value: "+
				descriptionOfInjury);
		}
		this.descriptionOfInjury = descriptionOfInjury;
	}

	public String getPresentingComplaints() {
		return presentingComplaints;
	}
	public void setPresentingComplaints(String presentingComplaints) {
		if ( null != presentingComplaints && presentingComplaints.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for presentingComplaints. Tried to set value: "+
				presentingComplaints);
		}
		this.presentingComplaints = presentingComplaints;
	}

	public java.util.Set getAssociatedFactor() {
		if ( null == associatedFactor ) {
			associatedFactor = new java.util.HashSet();
		}
		return associatedFactor;
	}
	public void setAssociatedFactor(java.util.Set paramValue) {
		this.associatedFactor = paramValue;
	}

	public ims.domain.lookups.LookupInstance getModeOfInjury() {
		return modeOfInjury;
	}
	public void setModeOfInjury(ims.domain.lookups.LookupInstance modeOfInjury) {
		this.modeOfInjury = modeOfInjury;
	}

	public ims.domain.lookups.LookupInstance getCauseOfInjury() {
		return causeOfInjury;
	}
	public void setCauseOfInjury(ims.domain.lookups.LookupInstance causeOfInjury) {
		this.causeOfInjury = causeOfInjury;
	}

	public ims.domain.lookups.LookupInstance getMechanismOfInjury() {
		return mechanismOfInjury;
	}
	public void setMechanismOfInjury(ims.domain.lookups.LookupInstance mechanismOfInjury) {
		this.mechanismOfInjury = mechanismOfInjury;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
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
		
		auditStr.append("\r\n*injuryDate* :");
		auditStr.append(injuryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*injuryTime* :");
		auditStr.append(injuryTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDate* :");
		auditStr.append(referralDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferDate* :");
		auditStr.append(transferDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*sufferedLOC* :");
		auditStr.append(sufferedLOC);
	    auditStr.append("; ");
		auditStr.append("\r\n*durLOC* :");
		auditStr.append(durLOC);
	    auditStr.append("; ");
		auditStr.append("\r\n*durLOCUnit* :");
		if (durLOCUnit != null)
			auditStr.append(durLOCUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresVentillation* :");
		if (requiresVentillation != null)
			auditStr.append(requiresVentillation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*descriptionOfInjury* :");
		auditStr.append(descriptionOfInjury);
	    auditStr.append("; ");
		auditStr.append("\r\n*presentingComplaints* :");
		auditStr.append(presentingComplaints);
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedFactor* :");
		if (associatedFactor != null)
		{
			java.util.Iterator it11 = associatedFactor.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.InjuryAssocFactor obj = (ims.medical.domain.objects.InjuryAssocFactor)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*modeOfInjury* :");
		if (modeOfInjury != null)
			auditStr.append(modeOfInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*causeOfInjury* :");
		if (causeOfInjury != null)
			auditStr.append(causeOfInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mechanismOfInjury* :");
		if (mechanismOfInjury != null)
			auditStr.append(mechanismOfInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
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
		
		String keyClassName = "InjuryDetails";
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
		if (this.getInjuryDate() != null)
		{
			sb.append("<injuryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getInjuryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</injuryDate>");		
		}
		if (this.getInjuryTime() != null)
		{
			sb.append("<injuryTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInjuryTime().toString()));
			sb.append("</injuryTime>");		
		}
		if (this.getReferralDate() != null)
		{
			sb.append("<referralDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralDate>");		
		}
		if (this.getTransferDate() != null)
		{
			sb.append("<transferDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTransferDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transferDate>");		
		}
		if (this.isSufferedLOC() != null)
		{
			sb.append("<sufferedLOC>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSufferedLOC().toString()));
			sb.append("</sufferedLOC>");		
		}
		if (this.getDurLOC() != null)
		{
			sb.append("<durLOC>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurLOC().toString()));
			sb.append("</durLOC>");		
		}
		if (this.getDurLOCUnit() != null)
		{
			sb.append("<durLOCUnit>");
			sb.append(this.getDurLOCUnit().toXMLString()); 
			sb.append("</durLOCUnit>");		
		}
		if (this.getRequiresVentillation() != null)
		{
			sb.append("<requiresVentillation>");
			sb.append(this.getRequiresVentillation().toXMLString()); 
			sb.append("</requiresVentillation>");		
		}
		if (this.getDescriptionOfInjury() != null)
		{
			sb.append("<descriptionOfInjury>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescriptionOfInjury().toString()));
			sb.append("</descriptionOfInjury>");		
		}
		if (this.getPresentingComplaints() != null)
		{
			sb.append("<presentingComplaints>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPresentingComplaints().toString()));
			sb.append("</presentingComplaints>");		
		}
		if (this.getAssociatedFactor() != null)
		{
			if (this.getAssociatedFactor().size() > 0 )
			{
			sb.append("<associatedFactor>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssociatedFactor(), domMap));
			sb.append("</associatedFactor>");		
			}
		}
		if (this.getModeOfInjury() != null)
		{
			sb.append("<modeOfInjury>");
			sb.append(this.getModeOfInjury().toXMLString()); 
			sb.append("</modeOfInjury>");		
		}
		if (this.getCauseOfInjury() != null)
		{
			sb.append("<causeOfInjury>");
			sb.append(this.getCauseOfInjury().toXMLString()); 
			sb.append("</causeOfInjury>");		
		}
		if (this.getMechanismOfInjury() != null)
		{
			sb.append("<mechanismOfInjury>");
			sb.append(this.getMechanismOfInjury().toXMLString()); 
			sb.append("</mechanismOfInjury>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
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
			InjuryDetails domainObject = getInjuryDetailsfromXML(itemEl, factory, domMap);

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
			InjuryDetails domainObject = getInjuryDetailsfromXML(itemEl, factory, domMap);

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
		
	public static InjuryDetails getInjuryDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInjuryDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InjuryDetails getInjuryDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InjuryDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InjuryDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InjuryDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InjuryDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InjuryDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InjuryDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InjuryDetails)factory.getImportedDomainObject(InjuryDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InjuryDetails();
		}
		String keyClassName = "InjuryDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InjuryDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InjuryDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("injuryDate");
		if(fldEl != null)
		{	
    		obj.setInjuryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("injuryTime");
		if(fldEl != null)
		{	
    		obj.setInjuryTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralDate");
		if(fldEl != null)
		{	
    		obj.setReferralDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transferDate");
		if(fldEl != null)
		{	
    		obj.setTransferDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sufferedLOC");
		if(fldEl != null)
		{	
    		obj.setSufferedLOC(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durLOC");
		if(fldEl != null)
		{	
    		obj.setDurLOC(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durLOCUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDurLOCUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requiresVentillation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequiresVentillation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("descriptionOfInjury");
		if(fldEl != null)
		{	
    		obj.setDescriptionOfInjury(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("presentingComplaints");
		if(fldEl != null)
		{	
    		obj.setPresentingComplaints(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("associatedFactor");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssociatedFactor(ims.medical.domain.objects.InjuryAssocFactor.fromSetXMLString(fldEl, factory, obj.getAssociatedFactor(), domMap));
		}
		fldEl = el.element("modeOfInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModeOfInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("causeOfInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCauseOfInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mechanismOfInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMechanismOfInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "associatedFactor"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String InjuryDate = "injuryDate";
		public static final String InjuryTime = "injuryTime";
		public static final String ReferralDate = "referralDate";
		public static final String TransferDate = "transferDate";
		public static final String SufferedLOC = "sufferedLOC";
		public static final String DurLOC = "durLOC";
		public static final String DurLOCUnit = "durLOCUnit";
		public static final String RequiresVentillation = "requiresVentillation";
		public static final String DescriptionOfInjury = "descriptionOfInjury";
		public static final String PresentingComplaints = "presentingComplaints";
		public static final String AssociatedFactor = "associatedFactor";
		public static final String ModeOfInjury = "modeOfInjury";
		public static final String CauseOfInjury = "causeOfInjury";
		public static final String MechanismOfInjury = "mechanismOfInjury";
		public static final String ClinicalContact = "clinicalContact";
	}
}

