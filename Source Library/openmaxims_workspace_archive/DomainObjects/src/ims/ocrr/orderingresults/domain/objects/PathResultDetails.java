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


public class PathResultDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100003;
	private static final long serialVersionUID = 1070100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Abnormal Flag */
	private Boolean isAbnormal;
	/** Result Components
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultComponent.
	  */
	private java.util.List resultComponents;
	/** Result Comments
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultComment.
	  */
	private java.util.List resultComments;
	private ims.ocrr.orderingresults.domain.objects.OrderSpecimen orderSpecimen;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PathResultDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PathResultDetails ()
    {
    	super();
    }
    public PathResultDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.PathResultDetails.class;
	}


	public Boolean isIsAbnormal() {
		return isAbnormal;
	}
	public void setIsAbnormal(Boolean isAbnormal) {
		this.isAbnormal = isAbnormal;
	}

	public java.util.List getResultComponents() {
		if ( null == resultComponents ) {
			resultComponents = new java.util.ArrayList();
		}
		return resultComponents;
	}
	public void setResultComponents(java.util.List paramValue) {
		this.resultComponents = paramValue;
	}

	public java.util.List getResultComments() {
		if ( null == resultComments ) {
			resultComments = new java.util.ArrayList();
		}
		return resultComments;
	}
	public void setResultComments(java.util.List paramValue) {
		this.resultComments = paramValue;
	}

	public ims.ocrr.orderingresults.domain.objects.OrderSpecimen getOrderSpecimen() {
		return orderSpecimen;
	}
	public void setOrderSpecimen(ims.ocrr.orderingresults.domain.objects.OrderSpecimen orderSpecimen) {
		this.orderSpecimen = orderSpecimen;
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
		
		auditStr.append("\r\n*isAbnormal* :");
		auditStr.append(isAbnormal);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultComponents* :");
		if (resultComponents != null)
		{
		int i2=0;
		for (i2=0; i2<resultComponents.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.ResultComponent obj = (ims.ocrr.orderingresults.domain.objects.ResultComponent)resultComponents.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*resultComments* :");
		if (resultComments != null)
		{
		int i3=0;
		for (i3=0; i3<resultComments.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.ResultComment obj = (ims.ocrr.orderingresults.domain.objects.ResultComment)resultComments.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderSpecimen* :");
		if (orderSpecimen != null)
		{
			auditStr.append(toShortClassName(orderSpecimen));
				
		    auditStr.append(orderSpecimen.getId());
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
		
		String keyClassName = "PathResultDetails";
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
		if (this.isIsAbnormal() != null)
		{
			sb.append("<isAbnormal>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAbnormal().toString()));
			sb.append("</isAbnormal>");		
		}
		if (this.getResultComponents() != null)
		{
			if (this.getResultComponents().size() > 0 )
			{
			sb.append("<resultComponents>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultComponents(), domMap));
			sb.append("</resultComponents>");		
			}
		}
		if (this.getResultComments() != null)
		{
			if (this.getResultComments().size() > 0 )
			{
			sb.append("<resultComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultComments(), domMap));
			sb.append("</resultComments>");		
			}
		}
		if (this.getOrderSpecimen() != null)
		{
			sb.append("<orderSpecimen>");
			sb.append(this.getOrderSpecimen().toXMLString(domMap)); 	
			sb.append("</orderSpecimen>");		
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
			PathResultDetails domainObject = getPathResultDetailsfromXML(itemEl, factory, domMap);

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
			PathResultDetails domainObject = getPathResultDetailsfromXML(itemEl, factory, domMap);

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
		
	public static PathResultDetails getPathResultDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPathResultDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PathResultDetails getPathResultDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PathResultDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PathResultDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PathResultDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PathResultDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PathResultDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PathResultDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PathResultDetails)factory.getImportedDomainObject(PathResultDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PathResultDetails();
		}
		String keyClassName = "PathResultDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PathResultDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PathResultDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("isAbnormal");
		if(fldEl != null)
		{	
    		obj.setIsAbnormal(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultComponents");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setResultComponents(ims.ocrr.orderingresults.domain.objects.ResultComponent.fromListXMLString(fldEl, factory, obj.getResultComponents(), domMap));
		}
		fldEl = el.element("resultComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setResultComments(ims.ocrr.orderingresults.domain.objects.ResultComment.fromListXMLString(fldEl, factory, obj.getResultComments(), domMap));
		}
		fldEl = el.element("orderSpecimen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderSpecimen(ims.ocrr.orderingresults.domain.objects.OrderSpecimen.getOrderSpecimenfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "resultComponents"
		, "resultComments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String IsAbnormal = "isAbnormal";
		public static final String ResultComponents = "resultComponents";
		public static final String ResultComments = "resultComments";
		public static final String OrderSpecimen = "orderSpecimen";
	}
}

