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
package ims.ocrr.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class RoleDisciplineSecurityLevel extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100020;
	private static final long serialVersionUID = 1061100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Application Role */
	private ims.core.configuration.domain.objects.AppRole role;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Ordering Security Level */
	private ims.ocrr.configuration.domain.objects.SecurityLevel orderingSecurityLevel;
	/** Viewing Security Level */
	private ims.ocrr.configuration.domain.objects.SecurityLevel viewingSecurityLevel;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RoleDisciplineSecurityLevel (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RoleDisciplineSecurityLevel ()
    {
    	super();
    }
    public RoleDisciplineSecurityLevel (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel.class;
	}


	public ims.core.configuration.domain.objects.AppRole getRole() {
		return role;
	}
	public void setRole(ims.core.configuration.domain.objects.AppRole role) {
		this.role = role;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.ocrr.configuration.domain.objects.SecurityLevel getOrderingSecurityLevel() {
		return orderingSecurityLevel;
	}
	public void setOrderingSecurityLevel(ims.ocrr.configuration.domain.objects.SecurityLevel orderingSecurityLevel) {
		this.orderingSecurityLevel = orderingSecurityLevel;
	}

	public ims.ocrr.configuration.domain.objects.SecurityLevel getViewingSecurityLevel() {
		return viewingSecurityLevel;
	}
	public void setViewingSecurityLevel(ims.ocrr.configuration.domain.objects.SecurityLevel viewingSecurityLevel) {
		this.viewingSecurityLevel = viewingSecurityLevel;
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
	// method generated based on 'role_service_unq1' unique index.
	public static boolean recordExistForRoleAndService(ims.domain.ILightweightDomainFactory factory,
		 ims.core.configuration.domain.objects.AppRole role
	,
	 ims.core.clinical.domain.objects.Service service
	)	
	{
		return recordExistForRoleAndService(factory, role, service, null);
	}	

	// method generated based on 'role_service_unq1' unique index.
	public static boolean recordExistForRoleAndService(ims.domain.ILightweightDomainFactory factory,
		 ims.core.configuration.domain.objects.AppRole role
	,
	 ims.core.clinical.domain.objects.Service service
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from RoleDisciplineSecurityLevel c where ");
		hql.append(" c.role = :role ");
		names[0] = "role";
		values[0] = role;		
		hql.append(" and "); 
		hql.append(" c.service = :service ");
		names[1] = "service";
		values[1] = service;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'role_service_unq1' unique index.
	public static RoleDisciplineSecurityLevel getRecordByRoleAndService(ims.domain.ILightweightDomainFactory factory,
	 ims.core.configuration.domain.objects.AppRole role
	,
	 ims.core.clinical.domain.objects.Service service
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from RoleDisciplineSecurityLevel c where ");
		hql.append(" c.role = :role ");
		names[0] = "role";
		values[0] = role;		
		hql.append(" and "); 
		hql.append(" c.service = :service ");
		names[1] = "service";
		values[1] = service;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (RoleDisciplineSecurityLevel)l.get(0);
	}

	public static RoleDisciplineSecurityLevel getRoleDisciplineSecurityLevelFromrole_service_unq1(ims.domain.ILightweightDomainFactory factory,
	 ims.core.configuration.domain.objects.AppRole role
	,
	 ims.core.clinical.domain.objects.Service service
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from RoleDisciplineSecurityLevel c where ");
		hql.append(" c.role = :role ");
		names[0] = "role";
		values[0] = role;		
		hql.append(" and "); 
		hql.append(" c.service = :service ");
		names[1] = "service";
		values[1] = service;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (RoleDisciplineSecurityLevel)l.get(0);
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
		
		auditStr.append("\r\n*role* :");
		if (role != null)
		{
			auditStr.append(toShortClassName(role));
				
		    auditStr.append(role.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderingSecurityLevel* :");
		if (orderingSecurityLevel != null)
		{
			auditStr.append(toShortClassName(orderingSecurityLevel));
				
		    auditStr.append(orderingSecurityLevel.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*viewingSecurityLevel* :");
		if (viewingSecurityLevel != null)
		{
			auditStr.append(toShortClassName(viewingSecurityLevel));
				
		    auditStr.append(viewingSecurityLevel.getId());
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
		
		String keyClassName = "RoleDisciplineSecurityLevel";
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
		if (this.getRole() != null)
		{
			sb.append("<role>");
			sb.append(this.getRole().toXMLString(domMap)); 	
			sb.append("</role>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getOrderingSecurityLevel() != null)
		{
			sb.append("<orderingSecurityLevel>");
			sb.append(this.getOrderingSecurityLevel().toXMLString(domMap)); 	
			sb.append("</orderingSecurityLevel>");		
		}
		if (this.getViewingSecurityLevel() != null)
		{
			sb.append("<viewingSecurityLevel>");
			sb.append(this.getViewingSecurityLevel().toXMLString(domMap)); 	
			sb.append("</viewingSecurityLevel>");		
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
			RoleDisciplineSecurityLevel domainObject = getRoleDisciplineSecurityLevelfromXML(itemEl, factory, domMap);

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
			RoleDisciplineSecurityLevel domainObject = getRoleDisciplineSecurityLevelfromXML(itemEl, factory, domMap);

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
		
	public static RoleDisciplineSecurityLevel getRoleDisciplineSecurityLevelfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRoleDisciplineSecurityLevelfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RoleDisciplineSecurityLevel getRoleDisciplineSecurityLevelfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RoleDisciplineSecurityLevel.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RoleDisciplineSecurityLevel.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RoleDisciplineSecurityLevel class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RoleDisciplineSecurityLevel)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RoleDisciplineSecurityLevel.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RoleDisciplineSecurityLevel ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RoleDisciplineSecurityLevel)factory.getImportedDomainObject(RoleDisciplineSecurityLevel.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RoleDisciplineSecurityLevel();
		}
		String keyClassName = "RoleDisciplineSecurityLevel";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RoleDisciplineSecurityLevel)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RoleDisciplineSecurityLevel obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("role");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRole(ims.core.configuration.domain.objects.AppRole.getAppRolefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("orderingSecurityLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderingSecurityLevel(ims.ocrr.configuration.domain.objects.SecurityLevel.getSecurityLevelfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("viewingSecurityLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setViewingSecurityLevel(ims.ocrr.configuration.domain.objects.SecurityLevel.getSecurityLevelfromXML(fldEl, factory, domMap)); 
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
		public static final String Role = "role";
		public static final String Service = "service";
		public static final String OrderingSecurityLevel = "orderingSecurityLevel";
		public static final String ViewingSecurityLevel = "viewingSecurityLevel";
	}
}

