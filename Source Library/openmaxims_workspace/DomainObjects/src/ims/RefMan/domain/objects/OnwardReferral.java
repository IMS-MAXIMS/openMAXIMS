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
 * @author Neil McAnaspie
 * Generated.
 */


public class OnwardReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100020;
	private static final long serialVersionUID = 1096100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** OnwardReferralDate */
	private java.util.Date dischargeDate;
	/** Onward Referral Organisation */
	private ims.core.resource.place.domain.objects.Organisation onwardReferralOrg;
	/** Onward Referral Instructions */
	private String onwardReferral;
	/** Rejected Date */
	private java.util.Date rejectedDate;
	/** Rejection Reason */
	private String rejectionReason;
	/** RejectedBy */
	private ims.domain.lookups.LookupInstance rejectedBy;
	/** Onward Referral Reason */
	private ims.domain.lookups.LookupInstance onwardReferralReason;
	/** Copy To GP */
	private Boolean copyToGP;
	/** Copy To Patient */
	private Boolean copyToPatient;
	/** Copy To Secondary Care */
	private Boolean copyToSecondaryCare;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OnwardReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OnwardReferral ()
    {
    	super();
    }
    public OnwardReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.OnwardReferral.class;
	}


	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public ims.core.resource.place.domain.objects.Organisation getOnwardReferralOrg() {
		return onwardReferralOrg;
	}
	public void setOnwardReferralOrg(ims.core.resource.place.domain.objects.Organisation onwardReferralOrg) {
		this.onwardReferralOrg = onwardReferralOrg;
	}

	public String getOnwardReferral() {
		return onwardReferral;
	}
	public void setOnwardReferral(String onwardReferral) {
		this.onwardReferral = onwardReferral;
	}

	public java.util.Date getRejectedDate() {
		return rejectedDate;
	}
	public void setRejectedDate(java.util.Date rejectedDate) {
		this.rejectedDate = rejectedDate;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}
	public void setRejectionReason(String rejectionReason) {
		if ( null != rejectionReason && rejectionReason.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rejectionReason. Tried to set value: "+
				rejectionReason);
		}
		this.rejectionReason = rejectionReason;
	}

	public ims.domain.lookups.LookupInstance getRejectedBy() {
		return rejectedBy;
	}
	public void setRejectedBy(ims.domain.lookups.LookupInstance rejectedBy) {
		this.rejectedBy = rejectedBy;
	}

	public ims.domain.lookups.LookupInstance getOnwardReferralReason() {
		return onwardReferralReason;
	}
	public void setOnwardReferralReason(ims.domain.lookups.LookupInstance onwardReferralReason) {
		this.onwardReferralReason = onwardReferralReason;
	}

	public Boolean isCopyToGP() {
		return copyToGP;
	}
	public void setCopyToGP(Boolean copyToGP) {
		this.copyToGP = copyToGP;
	}

	public Boolean isCopyToPatient() {
		return copyToPatient;
	}
	public void setCopyToPatient(Boolean copyToPatient) {
		this.copyToPatient = copyToPatient;
	}

	public Boolean isCopyToSecondaryCare() {
		return copyToSecondaryCare;
	}
	public void setCopyToSecondaryCare(Boolean copyToSecondaryCare) {
		this.copyToSecondaryCare = copyToSecondaryCare;
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
		
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*onwardReferralOrg* :");
		if (onwardReferralOrg != null)
		{
			auditStr.append(toShortClassName(onwardReferralOrg));
				
		    auditStr.append(onwardReferralOrg.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*onwardReferral* :");
		auditStr.append(onwardReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectedDate* :");
		auditStr.append(rejectedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectionReason* :");
		auditStr.append(rejectionReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*rejectedBy* :");
		if (rejectedBy != null)
			auditStr.append(rejectedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*onwardReferralReason* :");
		if (onwardReferralReason != null)
			auditStr.append(onwardReferralReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*copyToGP* :");
		auditStr.append(copyToGP);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyToPatient* :");
		auditStr.append(copyToPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyToSecondaryCare* :");
		auditStr.append(copyToSecondaryCare);
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
		
		String keyClassName = "OnwardReferral";
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
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getOnwardReferralOrg() != null)
		{
			sb.append("<onwardReferralOrg>");
			sb.append(this.getOnwardReferralOrg().toXMLString(domMap)); 	
			sb.append("</onwardReferralOrg>");		
		}
		if (this.getOnwardReferral() != null)
		{
			sb.append("<onwardReferral>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOnwardReferral().toString()));
			sb.append("</onwardReferral>");		
		}
		if (this.getRejectedDate() != null)
		{
			sb.append("<rejectedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRejectedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rejectedDate>");		
		}
		if (this.getRejectionReason() != null)
		{
			sb.append("<rejectionReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRejectionReason().toString()));
			sb.append("</rejectionReason>");		
		}
		if (this.getRejectedBy() != null)
		{
			sb.append("<rejectedBy>");
			sb.append(this.getRejectedBy().toXMLString()); 
			sb.append("</rejectedBy>");		
		}
		if (this.getOnwardReferralReason() != null)
		{
			sb.append("<onwardReferralReason>");
			sb.append(this.getOnwardReferralReason().toXMLString()); 
			sb.append("</onwardReferralReason>");		
		}
		if (this.isCopyToGP() != null)
		{
			sb.append("<copyToGP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyToGP().toString()));
			sb.append("</copyToGP>");		
		}
		if (this.isCopyToPatient() != null)
		{
			sb.append("<copyToPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyToPatient().toString()));
			sb.append("</copyToPatient>");		
		}
		if (this.isCopyToSecondaryCare() != null)
		{
			sb.append("<copyToSecondaryCare>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyToSecondaryCare().toString()));
			sb.append("</copyToSecondaryCare>");		
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
			OnwardReferral domainObject = getOnwardReferralfromXML(itemEl, factory, domMap);

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
			OnwardReferral domainObject = getOnwardReferralfromXML(itemEl, factory, domMap);

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
		
	public static OnwardReferral getOnwardReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOnwardReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OnwardReferral getOnwardReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OnwardReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OnwardReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OnwardReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OnwardReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OnwardReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OnwardReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OnwardReferral)factory.getImportedDomainObject(OnwardReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OnwardReferral();
		}
		String keyClassName = "OnwardReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OnwardReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OnwardReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("onwardReferralOrg");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOnwardReferralOrg(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("onwardReferral");
		if(fldEl != null)
		{	
    		obj.setOnwardReferral(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rejectedDate");
		if(fldEl != null)
		{	
    		obj.setRejectedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("rejectionReason");
		if(fldEl != null)
		{	
    		obj.setRejectionReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rejectedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRejectedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("onwardReferralReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOnwardReferralReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("copyToGP");
		if(fldEl != null)
		{	
    		obj.setCopyToGP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyToPatient");
		if(fldEl != null)
		{	
    		obj.setCopyToPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyToSecondaryCare");
		if(fldEl != null)
		{	
    		obj.setCopyToSecondaryCare(new Boolean(fldEl.getTextTrim()));	
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
		public static final String DischargeDate = "dischargeDate";
		public static final String OnwardReferralOrg = "onwardReferralOrg";
		public static final String OnwardReferral = "onwardReferral";
		public static final String RejectedDate = "rejectedDate";
		public static final String RejectionReason = "rejectionReason";
		public static final String RejectedBy = "rejectedBy";
		public static final String OnwardReferralReason = "onwardReferralReason";
		public static final String CopyToGP = "copyToGP";
		public static final String CopyToPatient = "copyToPatient";
		public static final String CopyToSecondaryCare = "copyToSecondaryCare";
	}
}

