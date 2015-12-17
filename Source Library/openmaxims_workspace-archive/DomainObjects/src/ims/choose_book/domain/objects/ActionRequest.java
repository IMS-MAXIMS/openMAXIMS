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


public class ActionRequest extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1069100000;
	private static final long serialVersionUID = 1069100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Request Type */
	private ims.domain.lookups.LookupInstance requestType;
	/** Date the request was made */
	private java.util.Date requestDate;
	/** ConversationID */
	private String convId;
	private String cpaId;
	/** Contains the Message Details to Action agains */
	private String msgDetails;
	/** Is this an active action request */
	private Boolean active;
	/** Various comment - reason status is set to false etc.. */
	private String statComment;
	/** Comment with details of progress ie. error or processed successfully */
	private String progressComment;
    public ActionRequest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActionRequest ()
    {
    	super();
    }
    public ActionRequest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.choose_book.domain.objects.ActionRequest.class;
	}


	public ims.domain.lookups.LookupInstance getRequestType() {
		return requestType;
	}
	public void setRequestType(ims.domain.lookups.LookupInstance requestType) {
		this.requestType = requestType;
	}

	public java.util.Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(java.util.Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getConvId() {
		return convId;
	}
	public void setConvId(String convId) {
		if ( null != convId && convId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for convId. Tried to set value: "+
				convId);
		}
		this.convId = convId;
	}

	public String getCpaId() {
		return cpaId;
	}
	public void setCpaId(String cpaId) {
		if ( null != cpaId && cpaId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cpaId. Tried to set value: "+
				cpaId);
		}
		this.cpaId = cpaId;
	}

	public String getMsgDetails() {
		return msgDetails;
	}
	public void setMsgDetails(String msgDetails) {
		if ( null != msgDetails && msgDetails.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for msgDetails. Tried to set value: "+
				msgDetails);
		}
		this.msgDetails = msgDetails;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getStatComment() {
		return statComment;
	}
	public void setStatComment(String statComment) {
		if ( null != statComment && statComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for statComment. Tried to set value: "+
				statComment);
		}
		this.statComment = statComment;
	}

	public String getProgressComment() {
		return progressComment;
	}
	public void setProgressComment(String progressComment) {
		if ( null != progressComment && progressComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for progressComment. Tried to set value: "+
				progressComment);
		}
		this.progressComment = progressComment;
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
		
		auditStr.append("\r\n*requestType* :");
		if (requestType != null)
			auditStr.append(requestType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requestDate* :");
		auditStr.append(requestDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*convId* :");
		auditStr.append(convId);
	    auditStr.append("; ");
		auditStr.append("\r\n*cpaId* :");
		auditStr.append(cpaId);
	    auditStr.append("; ");
		auditStr.append("\r\n*msgDetails* :");
		auditStr.append(msgDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*statComment* :");
		auditStr.append(statComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*progressComment* :");
		auditStr.append(progressComment);
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
		
		String keyClassName = "ActionRequest";
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
		if (this.getRequestType() != null)
		{
			sb.append("<requestType>");
			sb.append(this.getRequestType().toXMLString()); 
			sb.append("</requestType>");		
		}
		if (this.getRequestDate() != null)
		{
			sb.append("<requestDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRequestDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requestDate>");		
		}
		if (this.getConvId() != null)
		{
			sb.append("<convId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConvId().toString()));
			sb.append("</convId>");		
		}
		if (this.getCpaId() != null)
		{
			sb.append("<cpaId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCpaId().toString()));
			sb.append("</cpaId>");		
		}
		if (this.getMsgDetails() != null)
		{
			sb.append("<msgDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMsgDetails().toString()));
			sb.append("</msgDetails>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getStatComment() != null)
		{
			sb.append("<statComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStatComment().toString()));
			sb.append("</statComment>");		
		}
		if (this.getProgressComment() != null)
		{
			sb.append("<progressComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProgressComment().toString()));
			sb.append("</progressComment>");		
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
			ActionRequest domainObject = getActionRequestfromXML(itemEl, factory, domMap);

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
			ActionRequest domainObject = getActionRequestfromXML(itemEl, factory, domMap);

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
		
	public static ActionRequest getActionRequestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActionRequestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActionRequest getActionRequestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActionRequest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActionRequest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActionRequest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActionRequest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActionRequest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActionRequest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActionRequest)factory.getImportedDomainObject(ActionRequest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActionRequest();
		}
		String keyClassName = "ActionRequest";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActionRequest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActionRequest obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("requestType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequestType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requestDate");
		if(fldEl != null)
		{	
    		obj.setRequestDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("convId");
		if(fldEl != null)
		{	
    		obj.setConvId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cpaId");
		if(fldEl != null)
		{	
    		obj.setCpaId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("msgDetails");
		if(fldEl != null)
		{	
    		obj.setMsgDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statComment");
		if(fldEl != null)
		{	
    		obj.setStatComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("progressComment");
		if(fldEl != null)
		{	
    		obj.setProgressComment(new String(fldEl.getTextTrim()));	
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
		public static final String RequestType = "requestType";
		public static final String RequestDate = "requestDate";
		public static final String ConvId = "convId";
		public static final String CpaId = "cpaId";
		public static final String MsgDetails = "msgDetails";
		public static final String Active = "active";
		public static final String StatComment = "statComment";
		public static final String ProgressComment = "progressComment";
	}
}

