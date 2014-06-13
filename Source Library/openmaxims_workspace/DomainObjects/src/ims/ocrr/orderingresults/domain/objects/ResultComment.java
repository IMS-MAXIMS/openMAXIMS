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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ResultComment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100007;
	private static final long serialVersionUID = 1070100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CmtType */
	private ims.domain.lookups.LookupInstance commentType;
	/** Comment Source */
	private String cmtSrc;
	/** Comment Text */
	private String cmtText;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ResultComment (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public ResultComment ()
    {
    	super();
		isComponentClass=true;
    }
    public ResultComment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.ResultComment.class;
	}


	public ims.domain.lookups.LookupInstance getCommentType() {
		return commentType;
	}
	public void setCommentType(ims.domain.lookups.LookupInstance commentType) {
		this.commentType = commentType;
	}

	public String getCmtSrc() {
		return cmtSrc;
	}
	public void setCmtSrc(String cmtSrc) {
		if ( null != cmtSrc && cmtSrc.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cmtSrc. Tried to set value: "+
				cmtSrc);
		}
		this.cmtSrc = cmtSrc;
	}

	public String getCmtText() {
		return cmtText;
	}
	public void setCmtText(String cmtText) {
		if ( null != cmtText && cmtText.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cmtText. Tried to set value: "+
				cmtText);
		}
		this.cmtText = cmtText;
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
		
		auditStr.append("\r\n*commentType* :");
		if (commentType != null)
			auditStr.append(commentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cmtSrc* :");
		auditStr.append(cmtSrc);
	    auditStr.append("; ");
		auditStr.append("\r\n*cmtText* :");
		auditStr.append(cmtText);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getCommentType() != null)
		{
			sb.append("<commentType>");
			sb.append(this.getCommentType().toXMLString()); 
			sb.append("</commentType>");		
		}
		if (this.getCmtSrc() != null)
		{
			sb.append("<cmtSrc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCmtSrc().toString()));
			sb.append("</cmtSrc>");		
		}
		if (this.getCmtText() != null)
		{
			sb.append("<cmtText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCmtText().toString()));
			sb.append("</cmtText>");		
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
			ResultComment domainObject = getResultCommentfromXML(itemEl, factory, domMap);

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
			ResultComment domainObject = getResultCommentfromXML(itemEl, factory, domMap);

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
		
	public static ResultComment getResultCommentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getResultCommentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ResultComment getResultCommentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ResultComment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ResultComment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ResultComment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ResultComment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ResultComment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ResultComment ret = null;
		if (ret == null)
		{
			ret = new ResultComment();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ResultComment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("commentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCommentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cmtSrc");
		if(fldEl != null)
		{	
    		obj.setCmtSrc(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cmtText");
		if(fldEl != null)
		{	
    		obj.setCmtText(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals
	*/

	public boolean equals(Object obj)
	{
		if (obj == null)
			return false;
		
		if (!(obj instanceof ResultComment))
			return false;
		
		ResultComment tmp = (ResultComment)obj;
		
		if ((commentType != null && tmp.getCommentType() == null) || (commentType == null && tmp.getCommentType() != null))
			return false;
		
		if (commentType != null && tmp.getCommentType() != null && commentType.getId() != tmp.getCommentType().getId())
			return false;
		
		if ((cmtSrc != null && tmp.getCmtSrc() == null) || (cmtSrc == null && tmp.getCmtSrc() != null))
			return false;
		
		if (cmtSrc != null && tmp.getCmtSrc() != null && !cmtSrc.equals(tmp.getCmtSrc()))
			return false;
		
		if ((cmtText != null && tmp.getCmtText() == null) || (cmtText == null && tmp.getCmtText() != null))
			return false;
		
		if (cmtText  != null && tmp.getCmtText() != null && !(cmtText==(tmp.getCmtText())))
			return false;
		
		return true;
	}

	/**
	toString
	*/
	public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (commentType != null)
			objStr.append(commentType.getText() + "-");
		if (cmtSrc != null)
			objStr.append(cmtSrc + "-");
		if (cmtText != null)
			objStr.append(cmtText);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CommentType = "commentType";
		public static final String CmtSrc = "cmtSrc";
		public static final String CmtText = "cmtText";
	}
}

