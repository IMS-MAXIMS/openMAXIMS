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
package ims.correspondence.configuration.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class UserAccess extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1053100011;
	private static final long serialVersionUID = 1053100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** App User */
	private ims.core.configuration.domain.objects.AppUser appUser;
	/** Consultant Access Collection
	  * Collection of ims.correspondence.configuration.domain.objects.ConsultantAccess.
	  */
	private java.util.Set consultantAccess;
	/** Clinic Access Collection
	  * Collection of ims.correspondence.configuration.domain.objects.ClinicAccess.
	  */
	private java.util.Set clinicAccess;
	/** Specialty Access Collection
	  * Collection of ims.correspondence.configuration.domain.objects.SpecialtyAccess.
	  */
	private java.util.Set specialtyAccess;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public UserAccess (Integer id, int ver)
    {
    	super(id, ver);
    }
    public UserAccess ()
    {
    	super();
    }
    public UserAccess (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.correspondence.configuration.domain.objects.UserAccess.class;
	}


	public ims.core.configuration.domain.objects.AppUser getAppUser() {
		return appUser;
	}
	public static UserAccess getUserAccessFromAppUser(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from UserAccess c where c.appUser.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. UserAccess.appUser.id = " + id + " returned " + l.size() + " records. " );
		return (UserAccess)l.get(0);
	}
	public void setAppUser(ims.core.configuration.domain.objects.AppUser appUser) {
		this.appUser = appUser;
	}

	public java.util.Set getConsultantAccess() {
		if ( null == consultantAccess ) {
			consultantAccess = new java.util.HashSet();
		}
		return consultantAccess;
	}
	public void setConsultantAccess(java.util.Set paramValue) {
		this.consultantAccess = paramValue;
	}

	public java.util.Set getClinicAccess() {
		if ( null == clinicAccess ) {
			clinicAccess = new java.util.HashSet();
		}
		return clinicAccess;
	}
	public void setClinicAccess(java.util.Set paramValue) {
		this.clinicAccess = paramValue;
	}

	public java.util.Set getSpecialtyAccess() {
		if ( null == specialtyAccess ) {
			specialtyAccess = new java.util.HashSet();
		}
		return specialtyAccess;
	}
	public void setSpecialtyAccess(java.util.Set paramValue) {
		this.specialtyAccess = paramValue;
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
		
		auditStr.append("\r\n*appUser* :");
		if (appUser != null)
		{
			auditStr.append(toShortClassName(appUser));
				
		    auditStr.append(appUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantAccess* :");
		if (consultantAccess != null)
		{
			java.util.Iterator it2 = consultantAccess.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.correspondence.configuration.domain.objects.ConsultantAccess obj = (ims.correspondence.configuration.domain.objects.ConsultantAccess)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicAccess* :");
		if (clinicAccess != null)
		{
			java.util.Iterator it3 = clinicAccess.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.correspondence.configuration.domain.objects.ClinicAccess obj = (ims.correspondence.configuration.domain.objects.ClinicAccess)it3.next();
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
		auditStr.append("\r\n*specialtyAccess* :");
		if (specialtyAccess != null)
		{
			java.util.Iterator it4 = specialtyAccess.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.correspondence.configuration.domain.objects.SpecialtyAccess obj = (ims.correspondence.configuration.domain.objects.SpecialtyAccess)it4.next();
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
		
		String keyClassName = "UserAccess";
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
		if (this.getAppUser() != null)
		{
			sb.append("<appUser>");
			sb.append(this.getAppUser().toXMLString(domMap)); 	
			sb.append("</appUser>");		
		}
		if (this.getConsultantAccess() != null)
		{
			if (this.getConsultantAccess().size() > 0 )
			{
			sb.append("<consultantAccess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultantAccess(), domMap));
			sb.append("</consultantAccess>");		
			}
		}
		if (this.getClinicAccess() != null)
		{
			if (this.getClinicAccess().size() > 0 )
			{
			sb.append("<clinicAccess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinicAccess(), domMap));
			sb.append("</clinicAccess>");		
			}
		}
		if (this.getSpecialtyAccess() != null)
		{
			if (this.getSpecialtyAccess().size() > 0 )
			{
			sb.append("<specialtyAccess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecialtyAccess(), domMap));
			sb.append("</specialtyAccess>");		
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
			UserAccess domainObject = getUserAccessfromXML(itemEl, factory, domMap);

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
			UserAccess domainObject = getUserAccessfromXML(itemEl, factory, domMap);

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
		
	public static UserAccess getUserAccessfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getUserAccessfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static UserAccess getUserAccessfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!UserAccess.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!UserAccess.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the UserAccess class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (UserAccess)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(UserAccess.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		UserAccess ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (UserAccess)factory.getImportedDomainObject(UserAccess.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new UserAccess();
		}
		String keyClassName = "UserAccess";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (UserAccess)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, UserAccess obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("appUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("consultantAccess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setConsultantAccess(ims.correspondence.configuration.domain.objects.ConsultantAccess.fromSetXMLString(fldEl, factory, obj.getConsultantAccess(), domMap));
		}
		fldEl = el.element("clinicAccess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClinicAccess(ims.correspondence.configuration.domain.objects.ClinicAccess.fromSetXMLString(fldEl, factory, obj.getClinicAccess(), domMap));
		}
		fldEl = el.element("specialtyAccess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSpecialtyAccess(ims.correspondence.configuration.domain.objects.SpecialtyAccess.fromSetXMLString(fldEl, factory, obj.getSpecialtyAccess(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "consultantAccess"
		, "clinicAccess"
		, "specialtyAccess"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AppUser = "appUser";
		public static final String ConsultantAccess = "consultantAccess";
		public static final String ClinicAccess = "clinicAccess";
		public static final String SpecialtyAccess = "specialtyAccess";
	}
}

