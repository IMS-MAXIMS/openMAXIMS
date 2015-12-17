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
package ims.ntpf.common.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class Comment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1036100000;
	private static final long serialVersionUID = 1036100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringCP;
	/** Comment Context - LoCall/Case/Invoice/Outlier */
	private ims.domain.lookups.LookupInstance context;
	/** note type - e.g. General / Admin / Complication */
	private ims.domain.lookups.LookupInstance commentType;
	/** Comment Text */
	private String commentText;
	/** Comment requires follow up. */
	private Boolean isFollowUp;
	/** Follow- Up User */
	private ims.core.resource.people.domain.objects.MemberOfStaff followUpUser;
	/** Follow-Up Date */
	private java.util.Date followUpDate;
	/** Comment
	  * Collection of ims.ntpf.common.domain.objects.Comment.
	  */
	private java.util.Set comment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Comment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Comment ()
    {
    	super();
    }
    public Comment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.common.domain.objects.Comment.class;
	}


	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.MemberOfStaff authoringCP) {
		this.authoringCP = authoringCP;
	}

	public ims.domain.lookups.LookupInstance getContext() {
		return context;
	}
	public void setContext(ims.domain.lookups.LookupInstance context) {
		this.context = context;
	}

	public ims.domain.lookups.LookupInstance getCommentType() {
		return commentType;
	}
	public void setCommentType(ims.domain.lookups.LookupInstance commentType) {
		this.commentType = commentType;
	}

	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		if ( null != commentText && commentText.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for commentText. Tried to set value: "+
				commentText);
		}
		this.commentText = commentText;
	}

	public Boolean isIsFollowUp() {
		return isFollowUp;
	}
	public void setIsFollowUp(Boolean isFollowUp) {
		this.isFollowUp = isFollowUp;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getFollowUpUser() {
		return followUpUser;
	}
	public void setFollowUpUser(ims.core.resource.people.domain.objects.MemberOfStaff followUpUser) {
		this.followUpUser = followUpUser;
	}

	public java.util.Date getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(java.util.Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	public java.util.Set getComment() {
		if ( null == comment ) {
			comment = new java.util.HashSet();
		}
		return comment;
	}
	public void setComment(java.util.Set paramValue) {
		this.comment = paramValue;
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
		
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*context* :");
		if (context != null)
			auditStr.append(context.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commentType* :");
		if (commentType != null)
			auditStr.append(commentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commentText* :");
		auditStr.append(commentText);
	    auditStr.append("; ");
		auditStr.append("\r\n*isFollowUp* :");
		auditStr.append(isFollowUp);
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpUser* :");
		if (followUpUser != null)
		{
			auditStr.append(toShortClassName(followUpUser));
				
		    auditStr.append(followUpUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpDate* :");
		auditStr.append(followUpDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		if (comment != null)
		{
			java.util.Iterator it9 = comment.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.ntpf.common.domain.objects.Comment obj = (ims.ntpf.common.domain.objects.Comment)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
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
		
		String keyClassName = "Comment";
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
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getContext() != null)
		{
			sb.append("<context>");
			sb.append(this.getContext().toXMLString()); 
			sb.append("</context>");		
		}
		if (this.getCommentType() != null)
		{
			sb.append("<commentType>");
			sb.append(this.getCommentType().toXMLString()); 
			sb.append("</commentType>");		
		}
		if (this.getCommentText() != null)
		{
			sb.append("<commentText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCommentText().toString()));
			sb.append("</commentText>");		
		}
		if (this.isIsFollowUp() != null)
		{
			sb.append("<isFollowUp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFollowUp().toString()));
			sb.append("</isFollowUp>");		
		}
		if (this.getFollowUpUser() != null)
		{
			sb.append("<followUpUser>");
			sb.append(this.getFollowUpUser().toXMLString(domMap)); 	
			sb.append("</followUpUser>");		
		}
		if (this.getFollowUpDate() != null)
		{
			sb.append("<followUpDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFollowUpDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</followUpDate>");		
		}
		if (this.getComment() != null)
		{
			if (this.getComment().size() > 0 )
			{
			sb.append("<comment>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComment(), domMap));
			sb.append("</comment>");		
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
			Comment domainObject = getCommentfromXML(itemEl, factory, domMap);

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
			Comment domainObject = getCommentfromXML(itemEl, factory, domMap);

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
		
	public static Comment getCommentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCommentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Comment getCommentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Comment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Comment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Comment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Comment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Comment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Comment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Comment)factory.getImportedDomainObject(Comment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Comment();
		}
		String keyClassName = "Comment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Comment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Comment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("context");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCommentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commentText");
		if(fldEl != null)
		{	
    		obj.setCommentText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFollowUp");
		if(fldEl != null)
		{	
    		obj.setIsFollowUp(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followUpUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFollowUpUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("followUpDate");
		if(fldEl != null)
		{	
    		obj.setFollowUpDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComment(ims.ntpf.common.domain.objects.Comment.fromSetXMLString(fldEl, factory, obj.getComment(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "comment"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String Context = "context";
		public static final String CommentType = "commentType";
		public static final String CommentText = "commentText";
		public static final String IsFollowUp = "isFollowUp";
		public static final String FollowUpUser = "followUpUser";
		public static final String FollowUpDate = "followUpDate";
		public static final String Comment = "comment";
	}
}

