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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class DirectoryofService extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100011;
	private static final long serialVersionUID = 1055100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** DoSName */
	private String doSName;
	/** DoSId */
	private String doSId;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Functions
	  * Collection of ims.core.clinical.domain.objects.ServiceFunction.
	  */
	private java.util.Set functions;
	/** Active Flag */
	private Boolean isActive;
	/** Location */
	private ims.core.resource.place.domain.objects.Location location;
	/** Contract */
	private ims.core.configuration.domain.objects.ContractConfig contract;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DirectoryofService (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DirectoryofService ()
    {
    	super();
    }
    public DirectoryofService (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.DirectoryofService.class;
	}


	public String getDoSName() {
		return doSName;
	}
	public void setDoSName(String doSName) {
		if ( null != doSName && doSName.length() > 300 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for doSName. Tried to set value: "+
				doSName);
		}
		this.doSName = doSName;
	}

	public String getDoSId() {
		return doSId;
	}
	public void setDoSId(String doSId) {
		if ( null != doSId && doSId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for doSId. Tried to set value: "+
				doSId);
		}
		this.doSId = doSId;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public java.util.Set getFunctions() {
		if ( null == functions ) {
			functions = new java.util.HashSet();
		}
		return functions;
	}
	public void setFunctions(java.util.Set paramValue) {
		this.functions = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public ims.core.configuration.domain.objects.ContractConfig getContract() {
		return contract;
	}
	public void setContract(ims.core.configuration.domain.objects.ContractConfig contract) {
		this.contract = contract;
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
	// method generated based on 'dos_unq1' unique index.
	public static boolean recordExistForDoSIdAndIsActive(ims.domain.ILightweightDomainFactory factory,
		 String doSId
	,
	 Boolean isActive
	)	
	{
		return recordExistForDoSIdAndIsActive(factory, doSId, isActive, null);
	}	

	// method generated based on 'dos_unq1' unique index.
	public static boolean recordExistForDoSIdAndIsActive(ims.domain.ILightweightDomainFactory factory,
		 String doSId
	,
	 Boolean isActive
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from DirectoryofService c where ");
		hql.append(" c.doSId = :doSId ");
		names[0] = "doSId";
		values[0] = doSId;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'dos_unq1' unique index.
	public static DirectoryofService getRecordByDoSIdAndIsActive(ims.domain.ILightweightDomainFactory factory,
	 String doSId
	,
	 Boolean isActive
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from DirectoryofService c where ");
		hql.append(" c.doSId = :doSId ");
		names[0] = "doSId";
		values[0] = doSId;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (DirectoryofService)l.get(0);
	}

	public static DirectoryofService getDirectoryofServiceFromdos_unq1(ims.domain.ILightweightDomainFactory factory,
	 String doSId
	,
	 Boolean isActive
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from DirectoryofService c where ");
		hql.append(" c.doSId = :doSId ");
		names[0] = "doSId";
		values[0] = doSId;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (DirectoryofService)l.get(0);
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
		
		auditStr.append("\r\n*doSName* :");
		auditStr.append(doSName);
	    auditStr.append("; ");
		auditStr.append("\r\n*doSId* :");
		auditStr.append(doSId);
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*functions* :");
		if (functions != null)
		{
			java.util.Iterator it4 = functions.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.ServiceFunction obj = (ims.core.clinical.domain.objects.ServiceFunction)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*contract* :");
		if (contract != null)
		{
			auditStr.append(toShortClassName(contract));
				
		    auditStr.append(contract.getId());
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
		
		String keyClassName = "DirectoryofService";
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
		if (this.getDoSName() != null)
		{
			sb.append("<doSName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDoSName().toString()));
			sb.append("</doSName>");		
		}
		if (this.getDoSId() != null)
		{
			sb.append("<doSId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDoSId().toString()));
			sb.append("</doSId>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getFunctions() != null)
		{
			if (this.getFunctions().size() > 0 )
			{
			sb.append("<functions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFunctions(), domMap));
			sb.append("</functions>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getContract() != null)
		{
			sb.append("<contract>");
			sb.append(this.getContract().toXMLString(domMap)); 	
			sb.append("</contract>");		
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
			DirectoryofService domainObject = getDirectoryofServicefromXML(itemEl, factory, domMap);

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
			DirectoryofService domainObject = getDirectoryofServicefromXML(itemEl, factory, domMap);

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
		
	public static DirectoryofService getDirectoryofServicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDirectoryofServicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DirectoryofService getDirectoryofServicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DirectoryofService.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DirectoryofService.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DirectoryofService class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DirectoryofService)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DirectoryofService.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DirectoryofService ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DirectoryofService)factory.getImportedDomainObject(DirectoryofService.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DirectoryofService();
		}
		String keyClassName = "DirectoryofService";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DirectoryofService)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DirectoryofService obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("doSName");
		if(fldEl != null)
		{	
    		obj.setDoSName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doSId");
		if(fldEl != null)
		{	
    		obj.setDoSId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("functions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFunctions(ims.core.clinical.domain.objects.ServiceFunction.fromSetXMLString(fldEl, factory, obj.getFunctions(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("contract");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContract(ims.core.configuration.domain.objects.ContractConfig.getContractConfigfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "functions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DoSName = "doSName";
		public static final String DoSId = "doSId";
		public static final String Service = "service";
		public static final String Functions = "functions";
		public static final String IsActive = "isActive";
		public static final String Location = "location";
		public static final String Contract = "contract";
	}
}

