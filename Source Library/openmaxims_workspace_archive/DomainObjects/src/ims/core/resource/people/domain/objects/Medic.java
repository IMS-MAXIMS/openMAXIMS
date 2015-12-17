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
package ims.core.resource.people.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class Medic extends ims.core.resource.people.domain.objects.Hcp implements java.io.Serializable {
	public static final int CLASSID = 1006100004;
	private static final long serialVersionUID = 1006100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Child Lookup of Medic. (Surgeon, Physician etc. ) */
	private ims.domain.lookups.LookupInstance medicType;
	private ims.domain.lookups.LookupInstance grade;
	private ims.domain.lookups.LookupInstance specialty;
	private ims.domain.lookups.LookupInstance secondSpecialty;
	private ims.domain.lookups.LookupInstance thirdSpecialty;
	private Boolean inpatientHandling;
    public Medic (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Medic ()
    {
    	super();
    }
    public Medic (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.people.domain.objects.Medic.class;
	}


	public ims.domain.lookups.LookupInstance getMedicType() {
		return medicType;
	}
	public void setMedicType(ims.domain.lookups.LookupInstance medicType) {
		this.medicType = medicType;
	}

	public ims.domain.lookups.LookupInstance getGrade() {
		return grade;
	}
	public void setGrade(ims.domain.lookups.LookupInstance grade) {
		this.grade = grade;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.domain.lookups.LookupInstance getSecondSpecialty() {
		return secondSpecialty;
	}
	public void setSecondSpecialty(ims.domain.lookups.LookupInstance secondSpecialty) {
		this.secondSpecialty = secondSpecialty;
	}

	public ims.domain.lookups.LookupInstance getThirdSpecialty() {
		return thirdSpecialty;
	}
	public void setThirdSpecialty(ims.domain.lookups.LookupInstance thirdSpecialty) {
		this.thirdSpecialty = thirdSpecialty;
	}

	public Boolean isInpatientHandling() {
		return inpatientHandling;
	}
	public void setInpatientHandling(Boolean inpatientHandling) {
		this.inpatientHandling = inpatientHandling;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*medicType* :");
		if (medicType != null)
			auditStr.append(medicType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*grade* :");
		if (grade != null)
			auditStr.append(grade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*secondSpecialty* :");
		if (secondSpecialty != null)
			auditStr.append(secondSpecialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*thirdSpecialty* :");
		if (thirdSpecialty != null)
			auditStr.append(thirdSpecialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*inpatientHandling* :");
		auditStr.append(inpatientHandling);
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
		
		String keyClassName = "Medic";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getMedicType() != null)
		{
			sb.append("<medicType>");
			sb.append(this.getMedicType().toXMLString()); 
			sb.append("</medicType>");		
		}
		if (this.getGrade() != null)
		{
			sb.append("<grade>");
			sb.append(this.getGrade().toXMLString()); 
			sb.append("</grade>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getSecondSpecialty() != null)
		{
			sb.append("<secondSpecialty>");
			sb.append(this.getSecondSpecialty().toXMLString()); 
			sb.append("</secondSpecialty>");		
		}
		if (this.getThirdSpecialty() != null)
		{
			sb.append("<thirdSpecialty>");
			sb.append(this.getThirdSpecialty().toXMLString()); 
			sb.append("</thirdSpecialty>");		
		}
		if (this.isInpatientHandling() != null)
		{
			sb.append("<inpatientHandling>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInpatientHandling().toString()));
			sb.append("</inpatientHandling>");		
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
			Medic domainObject = getMedicfromXML(itemEl, factory, domMap);

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
			Medic domainObject = getMedicfromXML(itemEl, factory, domMap);

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
		
	public static Medic getMedicfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMedicfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Medic getMedicfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Medic.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Medic.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Medic class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Medic)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Medic.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Medic ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Medic)factory.getImportedDomainObject(Medic.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Medic();
		}
		String keyClassName = "Medic";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Medic)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Medic obj, java.util.HashMap domMap) throws Exception
	{
		ims.core.resource.people.domain.objects.Hcp.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("medicType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMedicType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("grade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGrade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("secondSpecialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("thirdSpecialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setThirdSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("inpatientHandling");
		if(fldEl != null)
		{	
    		obj.setInpatientHandling(new Boolean(fldEl.getTextTrim()));	
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
		public static final String MedicType = "medicType";
		public static final String Grade = "grade";
		public static final String Specialty = "specialty";
		public static final String SecondSpecialty = "secondSpecialty";
		public static final String ThirdSpecialty = "thirdSpecialty";
		public static final String InpatientHandling = "inpatientHandling";
	}
}

