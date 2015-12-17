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
package ims.oncology.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PatActionStatusPoint extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100048;
	private static final long serialVersionUID = 1074100048L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Action Status reason Point */
	private ims.domain.lookups.LookupInstance actionStatusReason;
	/** Status point end date */
	private java.util.Date spEndDate;
	/** Status Point Start Date */
	private java.util.Date spStartDate;
	/** Action Status Point */
	private ims.domain.lookups.LookupInstance actionStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatActionStatusPoint (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatActionStatusPoint ()
    {
    	super();
    }
    public PatActionStatusPoint (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PatActionStatusPoint.class;
	}


	public ims.domain.lookups.LookupInstance getActionStatusReason() {
		return actionStatusReason;
	}
	public void setActionStatusReason(ims.domain.lookups.LookupInstance actionStatusReason) {
		this.actionStatusReason = actionStatusReason;
	}

	public java.util.Date getSpEndDate() {
		return spEndDate;
	}
	public void setSpEndDate(java.util.Date spEndDate) {
		this.spEndDate = spEndDate;
	}

	public java.util.Date getSpStartDate() {
		return spStartDate;
	}
	public void setSpStartDate(java.util.Date spStartDate) {
		this.spStartDate = spStartDate;
	}

	public ims.domain.lookups.LookupInstance getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(ims.domain.lookups.LookupInstance actionStatus) {
		this.actionStatus = actionStatus;
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
		
		auditStr.append("\r\n*actionStatusReason* :");
		if (actionStatusReason != null)
			auditStr.append(actionStatusReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*spEndDate* :");
		auditStr.append(spEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*spStartDate* :");
		auditStr.append(spStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionStatus* :");
		if (actionStatus != null)
			auditStr.append(actionStatus.getText());
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
		
		String keyClassName = "PatActionStatusPoint";
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
		if (this.getActionStatusReason() != null)
		{
			sb.append("<actionStatusReason>");
			sb.append(this.getActionStatusReason().toXMLString()); 
			sb.append("</actionStatusReason>");		
		}
		if (this.getSpEndDate() != null)
		{
			sb.append("<spEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSpEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</spEndDate>");		
		}
		if (this.getSpStartDate() != null)
		{
			sb.append("<spStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSpStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</spStartDate>");		
		}
		if (this.getActionStatus() != null)
		{
			sb.append("<actionStatus>");
			sb.append(this.getActionStatus().toXMLString()); 
			sb.append("</actionStatus>");		
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
			PatActionStatusPoint domainObject = getPatActionStatusPointfromXML(itemEl, factory, domMap);

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
			PatActionStatusPoint domainObject = getPatActionStatusPointfromXML(itemEl, factory, domMap);

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
		
	public static PatActionStatusPoint getPatActionStatusPointfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatActionStatusPointfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatActionStatusPoint getPatActionStatusPointfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatActionStatusPoint.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatActionStatusPoint.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatActionStatusPoint class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatActionStatusPoint)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatActionStatusPoint.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatActionStatusPoint ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatActionStatusPoint)factory.getImportedDomainObject(PatActionStatusPoint.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatActionStatusPoint();
		}
		String keyClassName = "PatActionStatusPoint";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatActionStatusPoint)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatActionStatusPoint obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("actionStatusReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActionStatusReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("spEndDate");
		if(fldEl != null)
		{	
    		obj.setSpEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("spStartDate");
		if(fldEl != null)
		{	
    		obj.setSpStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("actionStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActionStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ActionStatusReason = "actionStatusReason";
		public static final String SpEndDate = "spEndDate";
		public static final String SpStartDate = "spStartDate";
		public static final String ActionStatus = "actionStatus";
	}
}

