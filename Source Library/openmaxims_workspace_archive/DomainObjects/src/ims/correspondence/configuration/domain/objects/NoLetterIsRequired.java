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
 * @author Dara Hickey
 * Generated.
 */


public class NoLetterIsRequired extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1053100007;
	private static final long serialVersionUID = 1053100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** 
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.Set consultants;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List specialties;
	/** 
	  * Collection of ims.core.resource.place.domain.objects.Clinic.
	  */
	private java.util.Set newClinics;
	/** 
	  * Collection of ims.core.resource.place.domain.objects.Clinic.
	  */
	private java.util.Set reviewClinics;
	/** isActive */
	private Boolean isActive;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NoLetterIsRequired (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NoLetterIsRequired ()
    {
    	super();
    }
    public NoLetterIsRequired (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.correspondence.configuration.domain.objects.NoLetterIsRequired.class;
	}


	public java.util.Set getConsultants() {
		if ( null == consultants ) {
			consultants = new java.util.HashSet();
		}
		return consultants;
	}
	public void setConsultants(java.util.Set paramValue) {
		this.consultants = paramValue;
	}

	public java.util.List getSpecialties() {
		if ( null == specialties ) {
			specialties = new java.util.ArrayList();
		}
		return specialties;
	}
	public void setSpecialties(java.util.List paramValue) {
		this.specialties = paramValue;
	}

	public java.util.Set getNewClinics() {
		if ( null == newClinics ) {
			newClinics = new java.util.HashSet();
		}
		return newClinics;
	}
	public void setNewClinics(java.util.Set paramValue) {
		this.newClinics = paramValue;
	}

	public java.util.Set getReviewClinics() {
		if ( null == reviewClinics ) {
			reviewClinics = new java.util.HashSet();
		}
		return reviewClinics;
	}
	public void setReviewClinics(java.util.Set paramValue) {
		this.reviewClinics = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public static NoLetterIsRequired getNoLetterIsRequiredFromIsActive(ims.domain.ILightweightDomainFactory factory, Boolean val)
	{
		String hql = "from NoLetterIsRequired c where c.isActive = :isActive";		
		java.util.List l = factory.find(hql, new String[]{"isActive"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. NoLetterIsRequired.isActive = " + val + " returned " + l.size() + " records. " );
		return (NoLetterIsRequired)l.get(0);
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		
		auditStr.append("\r\n*consultants* :");
		if (consultants != null)
		{
			java.util.Iterator it1 = consultants.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)it1.next();
		if (obj != null)
		{
		   if (i1 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialties* :");
		if (specialties != null)
		{
			java.util.Iterator it2 = specialties.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it2.next();
			auditStr.append(obj.getText());
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*newClinics* :");
		if (newClinics != null)
		{
			java.util.Iterator it3 = newClinics.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Clinic obj = (ims.core.resource.place.domain.objects.Clinic)it3.next();
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
		auditStr.append("\r\n*reviewClinics* :");
		if (reviewClinics != null)
		{
			java.util.Iterator it4 = reviewClinics.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Clinic obj = (ims.core.resource.place.domain.objects.Clinic)it4.next();
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
		
		String keyClassName = "NoLetterIsRequired";
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
		if (this.getConsultants() != null)
		{
			if (this.getConsultants().size() > 0 )
			{
			sb.append("<consultants>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultants(), domMap));
			sb.append("</consultants>");		
			}
		}
		if (this.getSpecialties() != null)
		{
			if (this.getSpecialties().size() > 0 )
			{
			sb.append("<specialties>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSpecialties())); 
			sb.append("</specialties>");		
			}
		}
		if (this.getNewClinics() != null)
		{
			if (this.getNewClinics().size() > 0 )
			{
			sb.append("<newClinics>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNewClinics(), domMap));
			sb.append("</newClinics>");		
			}
		}
		if (this.getReviewClinics() != null)
		{
			if (this.getReviewClinics().size() > 0 )
			{
			sb.append("<reviewClinics>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReviewClinics(), domMap));
			sb.append("</reviewClinics>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
			NoLetterIsRequired domainObject = getNoLetterIsRequiredfromXML(itemEl, factory, domMap);

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
			NoLetterIsRequired domainObject = getNoLetterIsRequiredfromXML(itemEl, factory, domMap);

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
		
	public static NoLetterIsRequired getNoLetterIsRequiredfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNoLetterIsRequiredfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NoLetterIsRequired getNoLetterIsRequiredfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NoLetterIsRequired.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NoLetterIsRequired.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NoLetterIsRequired class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NoLetterIsRequired)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NoLetterIsRequired.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NoLetterIsRequired ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NoLetterIsRequired)factory.getImportedDomainObject(NoLetterIsRequired.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NoLetterIsRequired();
		}
		String keyClassName = "NoLetterIsRequired";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NoLetterIsRequired)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NoLetterIsRequired obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("consultants");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setConsultants(ims.core.resource.people.domain.objects.Medic.fromSetXMLString(fldEl, factory, obj.getConsultants(), domMap));
		}
		fldEl = el.element("specialties");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecialties(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSpecialties())); 
		}
		fldEl = el.element("newClinics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setNewClinics(ims.core.resource.place.domain.objects.Clinic.fromSetXMLString(fldEl, factory, obj.getNewClinics(), domMap));
		}
		fldEl = el.element("reviewClinics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReviewClinics(ims.core.resource.place.domain.objects.Clinic.fromSetXMLString(fldEl, factory, obj.getReviewClinics(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "consultants"
		, "specialties"
		, "newClinics"
		, "reviewClinics"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Consultants = "consultants";
		public static final String Specialties = "specialties";
		public static final String NewClinics = "newClinics";
		public static final String ReviewClinics = "reviewClinics";
		public static final String IsActive = "isActive";
	}
}

