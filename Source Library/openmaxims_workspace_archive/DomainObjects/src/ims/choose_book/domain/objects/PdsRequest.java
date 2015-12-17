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


public class PdsRequest extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1069100002;
	private static final long serialVersionUID = 1069100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** NHS Number  */
	private String nhsn;
	/** Date and Time Request was placed */
	private java.util.Date dateTimeRequested;
	/** Date and Time the PDS was last checked for access */
	private java.util.Date dateTimeLastChecked;
	/** Active */
	private Boolean active;
	/** Any relevant comments */
	private String comments;
	/** Flag to determine whether successful or not */
	private ims.domain.lookups.LookupInstance success;
    public PdsRequest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PdsRequest ()
    {
    	super();
    }
    public PdsRequest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.choose_book.domain.objects.PdsRequest.class;
	}


	public String getNhsn() {
		return nhsn;
	}
	public static PdsRequest getPdsRequestFromNhsn(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from PdsRequest c where c.nhsn = :nhsn";		
		java.util.List l = factory.find(hql, new String[]{"nhsn"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PdsRequest.nhsn = " + val + " returned " + l.size() + " records. " );
		return (PdsRequest)l.get(0);
	}
	public void setNhsn(String nhsn) {
		if ( null != nhsn && nhsn.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nhsn. Tried to set value: "+
				nhsn);
		}
		this.nhsn = nhsn;
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

	public ims.domain.lookups.LookupInstance getSuccess() {
		return success;
	}
	public void setSuccess(ims.domain.lookups.LookupInstance success) {
		this.success = success;
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
		
		auditStr.append("\r\n*nhsn* :");
		auditStr.append(nhsn);
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
		auditStr.append("\r\n*success* :");
		if (success != null)
			auditStr.append(success.getText());
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
		
		String keyClassName = "PdsRequest";
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
		if (this.getNhsn() != null)
		{
			sb.append("<nhsn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNhsn().toString()));
			sb.append("</nhsn>");		
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
		if (this.getSuccess() != null)
		{
			sb.append("<success>");
			sb.append(this.getSuccess().toXMLString()); 
			sb.append("</success>");		
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
			PdsRequest domainObject = getPdsRequestfromXML(itemEl, factory, domMap);

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
			PdsRequest domainObject = getPdsRequestfromXML(itemEl, factory, domMap);

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
		
	public static PdsRequest getPdsRequestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPdsRequestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PdsRequest getPdsRequestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PdsRequest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PdsRequest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PdsRequest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PdsRequest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PdsRequest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PdsRequest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PdsRequest)factory.getImportedDomainObject(PdsRequest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PdsRequest();
		}
		String keyClassName = "PdsRequest";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PdsRequest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PdsRequest obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("nhsn");
		if(fldEl != null)
		{	
    		obj.setNhsn(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("success");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSuccess(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Nhsn = "nhsn";
		public static final String DateTimeRequested = "dateTimeRequested";
		public static final String DateTimeLastChecked = "dateTimeLastChecked";
		public static final String Active = "active";
		public static final String Comments = "comments";
		public static final String Success = "success";
	}
}

