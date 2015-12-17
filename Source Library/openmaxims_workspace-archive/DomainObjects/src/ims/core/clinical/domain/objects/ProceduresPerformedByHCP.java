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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ProceduresPerformedByHCP extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100100;
	private static final long serialVersionUID = 1003100100L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Performing HCP */
	private ims.core.resource.people.domain.objects.Hcp performingHCP;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Procedures
	  * Collection of ims.core.clinical.domain.objects.Procedure.
	  */
	private java.util.Set procedures;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ProceduresPerformedByHCP (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ProceduresPerformedByHCP ()
    {
    	super();
    }
    public ProceduresPerformedByHCP (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ProceduresPerformedByHCP.class;
	}


	public ims.core.resource.people.domain.objects.Hcp getPerformingHCP() {
		return performingHCP;
	}
	public void setPerformingHCP(ims.core.resource.people.domain.objects.Hcp performingHCP) {
		this.performingHCP = performingHCP;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
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
	// method generated based on 'proc_hcp_serv_unq1' unique index.
	public static boolean recordExistForPerformingHCPAndService(ims.domain.ILightweightDomainFactory factory,
		 ims.core.resource.people.domain.objects.Hcp performingHCP
	,
	 ims.core.clinical.domain.objects.Service service
	)	
	{
		return recordExistForPerformingHCPAndService(factory, performingHCP, service, null);
	}	

	// method generated based on 'proc_hcp_serv_unq1' unique index.
	public static boolean recordExistForPerformingHCPAndService(ims.domain.ILightweightDomainFactory factory,
		 ims.core.resource.people.domain.objects.Hcp performingHCP
	,
	 ims.core.clinical.domain.objects.Service service
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from ProceduresPerformedByHCP c where ");
		hql.append(" c.performingHCP = :performingHCP ");
		names[0] = "performingHCP";
		values[0] = performingHCP;		
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

	// method generated based on 'proc_hcp_serv_unq1' unique index.
	public static ProceduresPerformedByHCP getRecordByPerformingHCPAndService(ims.domain.ILightweightDomainFactory factory,
	 ims.core.resource.people.domain.objects.Hcp performingHCP
	,
	 ims.core.clinical.domain.objects.Service service
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from ProceduresPerformedByHCP c where ");
		hql.append(" c.performingHCP = :performingHCP ");
		names[0] = "performingHCP";
		values[0] = performingHCP;		
		hql.append(" and "); 
		hql.append(" c.service = :service ");
		names[1] = "service";
		values[1] = service;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ProceduresPerformedByHCP)l.get(0);
	}

	public static ProceduresPerformedByHCP getProceduresPerformedByHCPFromproc_hcp_serv_unq1(ims.domain.ILightweightDomainFactory factory,
	 ims.core.resource.people.domain.objects.Hcp performingHCP
	,
	 ims.core.clinical.domain.objects.Service service
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from ProceduresPerformedByHCP c where ");
		hql.append(" c.performingHCP = :performingHCP ");
		names[0] = "performingHCP";
		values[0] = performingHCP;		
		hql.append(" and "); 
		hql.append(" c.service = :service ");
		names[1] = "service";
		values[1] = service;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ProceduresPerformedByHCP)l.get(0);
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
		
		auditStr.append("\r\n*performingHCP* :");
		if (performingHCP != null)
		{
			auditStr.append(toShortClassName(performingHCP));
				
		    auditStr.append(performingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it3 = procedures.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.Procedure obj = (ims.core.clinical.domain.objects.Procedure)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
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
		
		String keyClassName = "ProceduresPerformedByHCP";
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
		if (this.getPerformingHCP() != null)
		{
			sb.append("<performingHCP>");
			sb.append(this.getPerformingHCP().toXMLString(domMap)); 	
			sb.append("</performingHCP>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
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
			ProceduresPerformedByHCP domainObject = getProceduresPerformedByHCPfromXML(itemEl, factory, domMap);

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
			ProceduresPerformedByHCP domainObject = getProceduresPerformedByHCPfromXML(itemEl, factory, domMap);

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
		
	public static ProceduresPerformedByHCP getProceduresPerformedByHCPfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProceduresPerformedByHCPfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ProceduresPerformedByHCP getProceduresPerformedByHCPfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ProceduresPerformedByHCP.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ProceduresPerformedByHCP.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ProceduresPerformedByHCP class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ProceduresPerformedByHCP)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ProceduresPerformedByHCP.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ProceduresPerformedByHCP ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ProceduresPerformedByHCP)factory.getImportedDomainObject(ProceduresPerformedByHCP.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ProceduresPerformedByHCP();
		}
		String keyClassName = "ProceduresPerformedByHCP";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ProceduresPerformedByHCP)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ProceduresPerformedByHCP obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("performingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPerformingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.core.clinical.domain.objects.Procedure.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "procedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PerformingHCP = "performingHCP";
		public static final String Service = "service";
		public static final String Procedures = "procedures";
	}
}

