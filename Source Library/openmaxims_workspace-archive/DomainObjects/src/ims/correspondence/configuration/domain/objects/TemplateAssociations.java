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
 * @author Neil McAnaspie
 * Generated.
 */


public class TemplateAssociations extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1053100000;
	private static final long serialVersionUID = 1053100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.admin.domain.objects.TemplateBo template;
	/** Clinics
	  * Collection of ims.core.resource.place.domain.objects.Clinic.
	  */
	private java.util.Set clinics;
	/** Specialty
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List specialties;
	/** Consultants
	  * Collection of ims.core.resource.people.domain.objects.Medic.
	  */
	private java.util.Set consultants;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TemplateAssociations (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TemplateAssociations ()
    {
    	super();
    }
    public TemplateAssociations (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.correspondence.configuration.domain.objects.TemplateAssociations.class;
	}


	public ims.core.admin.domain.objects.TemplateBo getTemplate() {
		return template;
	}
	public static TemplateAssociations getTemplateAssociationsFromTemplate(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from TemplateAssociations c where c.template.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. TemplateAssociations.template.id = " + id + " returned " + l.size() + " records. " );
		return (TemplateAssociations)l.get(0);
	}
	public void setTemplate(ims.core.admin.domain.objects.TemplateBo template) {
		this.template = template;
	}

	public java.util.Set getClinics() {
		if ( null == clinics ) {
			clinics = new java.util.HashSet();
		}
		return clinics;
	}
	public void setClinics(java.util.Set paramValue) {
		this.clinics = paramValue;
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

	public java.util.Set getConsultants() {
		if ( null == consultants ) {
			consultants = new java.util.HashSet();
		}
		return consultants;
	}
	public void setConsultants(java.util.Set paramValue) {
		this.consultants = paramValue;
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
		
		auditStr.append("\r\n*template* :");
		if (template != null)
		{
			auditStr.append(toShortClassName(template));
				
		    auditStr.append(template.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinics* :");
		if (clinics != null)
		{
			java.util.Iterator it2 = clinics.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Clinic obj = (ims.core.resource.place.domain.objects.Clinic)it2.next();
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
		auditStr.append("\r\n*specialties* :");
		if (specialties != null)
		{
			java.util.Iterator it3 = specialties.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it3.next();
			auditStr.append(obj.getText());
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultants* :");
		if (consultants != null)
		{
			java.util.Iterator it4 = consultants.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.resource.people.domain.objects.Medic obj = (ims.core.resource.people.domain.objects.Medic)it4.next();
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
		
		String keyClassName = "TemplateAssociations";
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
		if (this.getTemplate() != null)
		{
			sb.append("<template>");
			sb.append(this.getTemplate().toXMLString(domMap)); 	
			sb.append("</template>");		
		}
		if (this.getClinics() != null)
		{
			if (this.getClinics().size() > 0 )
			{
			sb.append("<clinics>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinics(), domMap));
			sb.append("</clinics>");		
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
		if (this.getConsultants() != null)
		{
			if (this.getConsultants().size() > 0 )
			{
			sb.append("<consultants>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultants(), domMap));
			sb.append("</consultants>");		
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
			TemplateAssociations domainObject = getTemplateAssociationsfromXML(itemEl, factory, domMap);

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
			TemplateAssociations domainObject = getTemplateAssociationsfromXML(itemEl, factory, domMap);

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
		
	public static TemplateAssociations getTemplateAssociationsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTemplateAssociationsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TemplateAssociations getTemplateAssociationsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TemplateAssociations.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TemplateAssociations.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TemplateAssociations class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TemplateAssociations)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TemplateAssociations.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TemplateAssociations ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TemplateAssociations)factory.getImportedDomainObject(TemplateAssociations.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TemplateAssociations();
		}
		String keyClassName = "TemplateAssociations";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TemplateAssociations)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TemplateAssociations obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("template");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTemplate(ims.core.admin.domain.objects.TemplateBo.getTemplateBofromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClinics(ims.core.resource.place.domain.objects.Clinic.fromSetXMLString(fldEl, factory, obj.getClinics(), domMap));
		}
		fldEl = el.element("specialties");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecialties(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSpecialties())); 
		}
		fldEl = el.element("consultants");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setConsultants(ims.core.resource.people.domain.objects.Medic.fromSetXMLString(fldEl, factory, obj.getConsultants(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "clinics"
		, "specialties"
		, "consultants"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Template = "template";
		public static final String Clinics = "clinics";
		public static final String Specialties = "specialties";
		public static final String Consultants = "consultants";
	}
}

