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
package ims.oncology.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TNMStagingClassificationVersion extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1075100012;
	private static final long serialVersionUID = 1075100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** VersionNumber */
	private String versionNumber;
	/** Version Description */
	private String versionDescription;
	/** Active From */
	private java.util.Date activeFrom;
	/** Active To */
	private java.util.Date activeTo;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TNMStagingClassificationVersion (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TNMStagingClassificationVersion ()
    {
    	super();
    }
    public TNMStagingClassificationVersion (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.class;
	}


	public String getVersionNumber() {
		return versionNumber;
	}
	public static TNMStagingClassificationVersion getTNMStagingClassificationVersionFromVersionNumber(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from TNMStagingClassificationVersion c where c.versionNumber = :versionNumber";		
		java.util.List l = factory.find(hql, new String[]{"versionNumber"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. TNMStagingClassificationVersion.versionNumber = " + val + " returned " + l.size() + " records. " );
		return (TNMStagingClassificationVersion)l.get(0);
	}
	public void setVersionNumber(String versionNumber) {
		if ( null != versionNumber && versionNumber.length() > 55 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for versionNumber. Tried to set value: "+
				versionNumber);
		}
		this.versionNumber = versionNumber;
	}

	public String getVersionDescription() {
		return versionDescription;
	}
	public void setVersionDescription(String versionDescription) {
		if ( null != versionDescription && versionDescription.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for versionDescription. Tried to set value: "+
				versionDescription);
		}
		this.versionDescription = versionDescription;
	}

	public java.util.Date getActiveFrom() {
		return activeFrom;
	}
	public void setActiveFrom(java.util.Date activeFrom) {
		this.activeFrom = activeFrom;
	}

	public java.util.Date getActiveTo() {
		return activeTo;
	}
	public void setActiveTo(java.util.Date activeTo) {
		this.activeTo = activeTo;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*versionNumber* :");
		auditStr.append(versionNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*versionDescription* :");
		auditStr.append(versionDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeFrom* :");
		auditStr.append(activeFrom);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeTo* :");
		auditStr.append(activeTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
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
		
		String keyClassName = "TNMStagingClassificationVersion";
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
		if (this.getVersionNumber() != null)
		{
			sb.append("<versionNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVersionNumber().toString()));
			sb.append("</versionNumber>");		
		}
		if (this.getVersionDescription() != null)
		{
			sb.append("<versionDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVersionDescription().toString()));
			sb.append("</versionDescription>");		
		}
		if (this.getActiveFrom() != null)
		{
			sb.append("<activeFrom>");
			sb.append(new ims.framework.utils.DateTime(this.getActiveFrom()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</activeFrom>");		
		}
		if (this.getActiveTo() != null)
		{
			sb.append("<activeTo>");
			sb.append(new ims.framework.utils.DateTime(this.getActiveTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</activeTo>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
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
			TNMStagingClassificationVersion domainObject = getTNMStagingClassificationVersionfromXML(itemEl, factory, domMap);

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
			TNMStagingClassificationVersion domainObject = getTNMStagingClassificationVersionfromXML(itemEl, factory, domMap);

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
		
	public static TNMStagingClassificationVersion getTNMStagingClassificationVersionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTNMStagingClassificationVersionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TNMStagingClassificationVersion getTNMStagingClassificationVersionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TNMStagingClassificationVersion.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TNMStagingClassificationVersion.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TNMStagingClassificationVersion class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TNMStagingClassificationVersion)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TNMStagingClassificationVersion.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TNMStagingClassificationVersion ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TNMStagingClassificationVersion)factory.getImportedDomainObject(TNMStagingClassificationVersion.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TNMStagingClassificationVersion();
		}
		String keyClassName = "TNMStagingClassificationVersion";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TNMStagingClassificationVersion)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TNMStagingClassificationVersion obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("versionNumber");
		if(fldEl != null)
		{	
    		obj.setVersionNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("versionDescription");
		if(fldEl != null)
		{	
    		obj.setVersionDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activeFrom");
		if(fldEl != null)
		{	
    		obj.setActiveFrom(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activeTo");
		if(fldEl != null)
		{	
    		obj.setActiveTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String VersionNumber = "versionNumber";
		public static final String VersionDescription = "versionDescription";
		public static final String ActiveFrom = "activeFrom";
		public static final String ActiveTo = "activeTo";
		public static final String Status = "status";
	}
}

