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


public class OnwardReferralFromTriage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100055;
	private static final long serialVersionUID = 1096100055L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** Date and Time referred */
	private java.util.Date referredDate;
	/** Secondary Care Provider */
	private ims.core.resource.place.domain.objects.Organisation secondaryCareProvider;
	/** Requested by the GP */
	private ims.domain.lookups.LookupInstance requestedByGP;
	/** Agree With Decision */
	private ims.domain.lookups.LookupInstance agreeWithDecision;
	/** Notes */
	private String notes;
	/** Service Referred Into */
	private ims.domain.lookups.LookupInstance serviceReferredInto;
	/** ReferralComplete */
	private ims.domain.lookups.LookupInstance referralComplete;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OnwardReferralFromTriage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OnwardReferralFromTriage ()
    {
    	super();
    }
    public OnwardReferralFromTriage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.OnwardReferralFromTriage.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public java.util.Date getReferredDate() {
		return referredDate;
	}
	public void setReferredDate(java.util.Date referredDate) {
		this.referredDate = referredDate;
	}

	public ims.core.resource.place.domain.objects.Organisation getSecondaryCareProvider() {
		return secondaryCareProvider;
	}
	public void setSecondaryCareProvider(ims.core.resource.place.domain.objects.Organisation secondaryCareProvider) {
		this.secondaryCareProvider = secondaryCareProvider;
	}

	public ims.domain.lookups.LookupInstance getRequestedByGP() {
		return requestedByGP;
	}
	public void setRequestedByGP(ims.domain.lookups.LookupInstance requestedByGP) {
		this.requestedByGP = requestedByGP;
	}

	public ims.domain.lookups.LookupInstance getAgreeWithDecision() {
		return agreeWithDecision;
	}
	public void setAgreeWithDecision(ims.domain.lookups.LookupInstance agreeWithDecision) {
		this.agreeWithDecision = agreeWithDecision;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.domain.lookups.LookupInstance getServiceReferredInto() {
		return serviceReferredInto;
	}
	public void setServiceReferredInto(ims.domain.lookups.LookupInstance serviceReferredInto) {
		this.serviceReferredInto = serviceReferredInto;
	}

	public ims.domain.lookups.LookupInstance getReferralComplete() {
		return referralComplete;
	}
	public void setReferralComplete(ims.domain.lookups.LookupInstance referralComplete) {
		this.referralComplete = referralComplete;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referredDate* :");
		auditStr.append(referredDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryCareProvider* :");
		if (secondaryCareProvider != null)
		{
			auditStr.append(toShortClassName(secondaryCareProvider));
				
		    auditStr.append(secondaryCareProvider.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedByGP* :");
		if (requestedByGP != null)
			auditStr.append(requestedByGP.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*agreeWithDecision* :");
		if (agreeWithDecision != null)
			auditStr.append(agreeWithDecision.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceReferredInto* :");
		if (serviceReferredInto != null)
			auditStr.append(serviceReferredInto.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralComplete* :");
		if (referralComplete != null)
			auditStr.append(referralComplete.getText());
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
		
		String keyClassName = "OnwardReferralFromTriage";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getReferredDate() != null)
		{
			sb.append("<referredDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReferredDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referredDate>");		
		}
		if (this.getSecondaryCareProvider() != null)
		{
			sb.append("<secondaryCareProvider>");
			sb.append(this.getSecondaryCareProvider().toXMLString(domMap)); 	
			sb.append("</secondaryCareProvider>");		
		}
		if (this.getRequestedByGP() != null)
		{
			sb.append("<requestedByGP>");
			sb.append(this.getRequestedByGP().toXMLString()); 
			sb.append("</requestedByGP>");		
		}
		if (this.getAgreeWithDecision() != null)
		{
			sb.append("<agreeWithDecision>");
			sb.append(this.getAgreeWithDecision().toXMLString()); 
			sb.append("</agreeWithDecision>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getServiceReferredInto() != null)
		{
			sb.append("<serviceReferredInto>");
			sb.append(this.getServiceReferredInto().toXMLString()); 
			sb.append("</serviceReferredInto>");		
		}
		if (this.getReferralComplete() != null)
		{
			sb.append("<referralComplete>");
			sb.append(this.getReferralComplete().toXMLString()); 
			sb.append("</referralComplete>");		
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
			OnwardReferralFromTriage domainObject = getOnwardReferralFromTriagefromXML(itemEl, factory, domMap);

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
			OnwardReferralFromTriage domainObject = getOnwardReferralFromTriagefromXML(itemEl, factory, domMap);

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
		
	public static OnwardReferralFromTriage getOnwardReferralFromTriagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOnwardReferralFromTriagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OnwardReferralFromTriage getOnwardReferralFromTriagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OnwardReferralFromTriage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OnwardReferralFromTriage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OnwardReferralFromTriage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OnwardReferralFromTriage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OnwardReferralFromTriage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OnwardReferralFromTriage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OnwardReferralFromTriage)factory.getImportedDomainObject(OnwardReferralFromTriage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OnwardReferralFromTriage();
		}
		String keyClassName = "OnwardReferralFromTriage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OnwardReferralFromTriage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OnwardReferralFromTriage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referredDate");
		if(fldEl != null)
		{	
    		obj.setReferredDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("secondaryCareProvider");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSecondaryCareProvider(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestedByGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequestedByGP(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("agreeWithDecision");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAgreeWithDecision(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceReferredInto");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setServiceReferredInto(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralComplete");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralComplete(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CatsReferral = "catsReferral";
		public static final String ReferredDate = "referredDate";
		public static final String SecondaryCareProvider = "secondaryCareProvider";
		public static final String RequestedByGP = "requestedByGP";
		public static final String AgreeWithDecision = "agreeWithDecision";
		public static final String Notes = "notes";
		public static final String ServiceReferredInto = "serviceReferredInto";
		public static final String ReferralComplete = "referralComplete";
	}
}

