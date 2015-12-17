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
package ims.choose_book.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class SdsRequest extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1069100015;
	private static final long serialVersionUID = 1069100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Spine Data Services Referral ID e.g. GP */
	private String referrerSdsId;
	/** Spine Data Services Referral Role Id */
	private String referrerSdsRoleId;
	/** Spine Data Services Referral Organisation Id e.g. Practice */
	private String referrerSdsOrgId;
	/** Date and Time Request was placed */
	private java.util.Date dateTimeRequested;
	/** Date and Time the PDS was last checked for access */
	private java.util.Date dateTimeLastChecked;
	/** Active */
	private Boolean active;
	/** Any relevant comments */
	private String comments;
	/** Appointment associated with this request */
	private Integer appointment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SdsRequest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SdsRequest ()
    {
    	super();
    }
    public SdsRequest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.choose_book.domain.objects.SdsRequest.class;
	}


	public String getReferrerSdsId() {
		return referrerSdsId;
	}
	public void setReferrerSdsId(String referrerSdsId) {
		if ( null != referrerSdsId && referrerSdsId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerSdsId. Tried to set value: "+
				referrerSdsId);
		}
		this.referrerSdsId = referrerSdsId;
	}

	public String getReferrerSdsRoleId() {
		return referrerSdsRoleId;
	}
	public void setReferrerSdsRoleId(String referrerSdsRoleId) {
		if ( null != referrerSdsRoleId && referrerSdsRoleId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerSdsRoleId. Tried to set value: "+
				referrerSdsRoleId);
		}
		this.referrerSdsRoleId = referrerSdsRoleId;
	}

	public String getReferrerSdsOrgId() {
		return referrerSdsOrgId;
	}
	public void setReferrerSdsOrgId(String referrerSdsOrgId) {
		if ( null != referrerSdsOrgId && referrerSdsOrgId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerSdsOrgId. Tried to set value: "+
				referrerSdsOrgId);
		}
		this.referrerSdsOrgId = referrerSdsOrgId;
	}

	public java.util.Date getDateTimeRequested() {
		return dateTimeRequested;
	}
	public void setDateTimeRequested(java.util.Date dateTimeRequested) {
		this.dateTimeRequested = dateTimeRequested;
	}

	public java.util.Date getDateTimeLastChecked() {
		return dateTimeLastChecked;
	}
	public void setDateTimeLastChecked(java.util.Date dateTimeLastChecked) {
		this.dateTimeLastChecked = dateTimeLastChecked;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public Integer getAppointment() {
		return appointment;
	}
	public void setAppointment(Integer appointment) {
		this.appointment = appointment;
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
		
		auditStr.append("\r\n*referrerSdsId* :");
		auditStr.append(referrerSdsId);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerSdsRoleId* :");
		auditStr.append(referrerSdsRoleId);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerSdsOrgId* :");
		auditStr.append(referrerSdsOrgId);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeRequested* :");
		auditStr.append(dateTimeRequested);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeLastChecked* :");
		auditStr.append(dateTimeLastChecked);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		auditStr.append(appointment);
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
		
		String keyClassName = "SdsRequest";
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
		if (this.getReferrerSdsId() != null)
		{
			sb.append("<referrerSdsId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerSdsId().toString()));
			sb.append("</referrerSdsId>");		
		}
		if (this.getReferrerSdsRoleId() != null)
		{
			sb.append("<referrerSdsRoleId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerSdsRoleId().toString()));
			sb.append("</referrerSdsRoleId>");		
		}
		if (this.getReferrerSdsOrgId() != null)
		{
			sb.append("<referrerSdsOrgId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerSdsOrgId().toString()));
			sb.append("</referrerSdsOrgId>");		
		}
		if (this.getDateTimeRequested() != null)
		{
			sb.append("<dateTimeRequested>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeRequested()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeRequested>");		
		}
		if (this.getDateTimeLastChecked() != null)
		{
			sb.append("<dateTimeLastChecked>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeLastChecked()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeLastChecked>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAppointment().toString()));
			sb.append("</appointment>");		
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
			SdsRequest domainObject = getSdsRequestfromXML(itemEl, factory, domMap);

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
			SdsRequest domainObject = getSdsRequestfromXML(itemEl, factory, domMap);

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
		
	public static SdsRequest getSdsRequestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSdsRequestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SdsRequest getSdsRequestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SdsRequest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SdsRequest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SdsRequest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SdsRequest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SdsRequest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SdsRequest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SdsRequest)factory.getImportedDomainObject(SdsRequest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SdsRequest();
		}
		String keyClassName = "SdsRequest";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SdsRequest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SdsRequest obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("referrerSdsId");
		if(fldEl != null)
		{	
    		obj.setReferrerSdsId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerSdsRoleId");
		if(fldEl != null)
		{	
    		obj.setReferrerSdsRoleId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerSdsOrgId");
		if(fldEl != null)
		{	
    		obj.setReferrerSdsOrgId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateTimeRequested");
		if(fldEl != null)
		{	
    		obj.setDateTimeRequested(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateTimeLastChecked");
		if(fldEl != null)
		{	
    		obj.setDateTimeLastChecked(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{	
    		obj.setAppointment(new Integer(fldEl.getTextTrim()));	
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
		public static final String ReferrerSdsId = "referrerSdsId";
		public static final String ReferrerSdsRoleId = "referrerSdsRoleId";
		public static final String ReferrerSdsOrgId = "referrerSdsOrgId";
		public static final String DateTimeRequested = "dateTimeRequested";
		public static final String DateTimeLastChecked = "dateTimeLastChecked";
		public static final String Active = "active";
		public static final String Comments = "comments";
		public static final String Appointment = "appointment";
	}
}

