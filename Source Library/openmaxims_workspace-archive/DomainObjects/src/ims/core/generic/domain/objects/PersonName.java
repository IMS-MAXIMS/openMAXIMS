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
package ims.core.generic.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class PersonName extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1002100001;
	private static final long serialVersionUID = 1002100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name Type Identifier */
	private ims.domain.lookups.LookupInstance nameType;
	/** Surname */
	private String surname;
	/** uppercase copy of surname */
	private String upperSurname;
	/** Forename */
	private String forename;
	/** uppercase copy of forename */
	private String upperForename;
	/** MiddleName / 2nd Forename */
	private String middleName;
	/** Title */
	private ims.domain.lookups.LookupInstance title;
    public PersonName (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public PersonName ()
    {
    	super();
		isComponentClass=true;
    }
    public PersonName (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.generic.domain.objects.PersonName.class;
	}


	public ims.domain.lookups.LookupInstance getNameType() {
		return nameType;
	}
	public void setNameType(ims.domain.lookups.LookupInstance nameType) {
		this.nameType = nameType;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if ( null != surname && surname.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for surname. Tried to set value: "+
				surname);
		}
		this.surname = surname;
	}

	public String getUpperSurname() {
		return upperSurname;
	}
	public void setUpperSurname(String upperSurname) {
		if ( null != upperSurname && upperSurname.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperSurname. Tried to set value: "+
				upperSurname);
		}
		this.upperSurname = upperSurname;
	}

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		if ( null != forename && forename.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for forename. Tried to set value: "+
				forename);
		}
		this.forename = forename;
	}

	public String getUpperForename() {
		return upperForename;
	}
	public void setUpperForename(String upperForename) {
		if ( null != upperForename && upperForename.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperForename. Tried to set value: "+
				upperForename);
		}
		this.upperForename = upperForename;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		if ( null != middleName && middleName.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for middleName. Tried to set value: "+
				middleName);
		}
		this.middleName = middleName;
	}

	public ims.domain.lookups.LookupInstance getTitle() {
		return title;
	}
	public void setTitle(ims.domain.lookups.LookupInstance title) {
		this.title = title;
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
		
		auditStr.append("\r\n*nameType* :");
		if (nameType != null)
			auditStr.append(nameType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*surname* :");
		auditStr.append(surname);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperSurname* :");
		auditStr.append(upperSurname);
	    auditStr.append("; ");
		auditStr.append("\r\n*forename* :");
		auditStr.append(forename);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperForename* :");
		auditStr.append(upperForename);
	    auditStr.append("; ");
		auditStr.append("\r\n*middleName* :");
		auditStr.append(middleName);
	    auditStr.append("; ");
		auditStr.append("\r\n*title* :");
		if (title != null)
			auditStr.append(title.getText());
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getNameType() != null)
		{
			sb.append("<nameType>");
			sb.append(this.getNameType().toXMLString()); 
			sb.append("</nameType>");		
		}
		if (this.getSurname() != null)
		{
			sb.append("<surname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurname().toString()));
			sb.append("</surname>");		
		}
		if (this.getUpperSurname() != null)
		{
			sb.append("<upperSurname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperSurname().toString()));
			sb.append("</upperSurname>");		
		}
		if (this.getForename() != null)
		{
			sb.append("<forename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForename().toString()));
			sb.append("</forename>");		
		}
		if (this.getUpperForename() != null)
		{
			sb.append("<upperForename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperForename().toString()));
			sb.append("</upperForename>");		
		}
		if (this.getMiddleName() != null)
		{
			sb.append("<middleName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMiddleName().toString()));
			sb.append("</middleName>");		
		}
		if (this.getTitle() != null)
		{
			sb.append("<title>");
			sb.append(this.getTitle().toXMLString()); 
			sb.append("</title>");		
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
			PersonName domainObject = getPersonNamefromXML(itemEl, factory, domMap);

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
			PersonName domainObject = getPersonNamefromXML(itemEl, factory, domMap);

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
		
	public static PersonName getPersonNamefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPersonNamefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PersonName getPersonNamefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PersonName.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PersonName.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PersonName class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PersonName)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PersonName.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PersonName ret = null;
		if (ret == null)
		{
			ret = new PersonName();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PersonName obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("nameType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNameType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("surname");
		if(fldEl != null)
		{	
    		obj.setSurname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperSurname");
		if(fldEl != null)
		{	
    		obj.setUpperSurname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forename");
		if(fldEl != null)
		{	
    		obj.setForename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperForename");
		if(fldEl != null)
		{	
    		obj.setUpperForename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("middleName");
		if(fldEl != null)
		{	
    		obj.setMiddleName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("title");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTitle(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals:
	*/
	public boolean equals(Object obj)
	{
		if (null == obj) {
			return false;
		}
		if (!(obj instanceof ims.core.generic.domain.objects.PersonName)) 
		{
			return false;
		}
		ims.core.generic.domain.objects.PersonName tmp = (ims.core.generic.domain.objects.PersonName)obj;
		
		if ((surname != null && tmp.getSurname() != null) && !surname.equals(tmp.getSurname())) return false;
		if ((surname != null && tmp.getSurname() == null) || (surname == null && tmp.getSurname() != null)) return false;

		if ((upperSurname!= null && tmp.getUpperSurname() != null) && !upperSurname.equals(tmp.getUpperSurname())) return false;
		if ((upperSurname!= null && tmp.getUpperSurname() == null) || (upperSurname== null && tmp.getUpperSurname() != null)) return false;

		if ((forename!= null && tmp.getForename() != null) && !forename.equals(tmp.getForename())) return false;
		if ((forename!= null && tmp.getForename() == null) || (forename== null && tmp.getForename() != null)) return false;

		if ((upperForename!= null && tmp.getUpperForename() != null) && !upperForename.equals(tmp.getUpperForename())) return false;
		if ((upperForename!= null && tmp.getUpperForename() == null) || (upperForename== null && tmp.getUpperForename() != null)) return false;

		if ((middleName!= null && tmp.getMiddleName() != null) && !middleName.equals(tmp.getMiddleName())) return false;
		if ((middleName!= null && tmp.getMiddleName() == null) || (middleName== null && tmp.getMiddleName() != null)) return false;

		if ((title!= null && tmp.getTitle() != null) && !title.equals(tmp.getTitle())) return false;
		if ((title!= null && tmp.getTitle() == null) || (title== null && tmp.getTitle() != null)) return false;

		if ((nameType!= null && tmp.getNameType() != null) && !nameType.equals(tmp.getNameType())) return false;
		if ((nameType!= null && tmp.getNameType() == null) || (nameType== null && tmp.getNameType() != null)) return false;

		return true;
	}


	/**
	hashCode:
	*/
	public int hashCode()
	{
		int hash = 0;

		if (surname != null) hash += surname.hashCode();
		if (upperSurname!= null) hash += upperSurname.hashCode();
		if (forename != null) hash += forename.hashCode();
		if (upperForename!= null) hash += upperForename.hashCode();
		if (middleName != null) hash += middleName.hashCode();
		if (nameType != null) hash += nameType.hashCode();
		if (title != null) hash += title.hashCode();

		return hash;
	}



	/**
	toString()
	*/
public String toString()
{
	java.lang.StringBuffer sb = new java.lang.StringBuffer("");
	if (this.title != null) {
		sb.append(this.title.getText() + " ");
	}
	if (this.forename != null && this.forename.length() > 0) {
		sb.append(this.forename + " ");
	}
	if (this.middleName != null && this.middleName.length() > 0) {
		sb.append(this.middleName+ " ");
	}
	if (this.surname != null && this.surname.length() > 0) {
		sb.append(this.surname + " ");
	}
	if (sb.length() > 0)
	{
		sb.setLength(sb.length() - 1);
	}
	return sb.toString();
}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String NameType = "nameType";
		public static final String Surname = "surname";
		public static final String UpperSurname = "upperSurname";
		public static final String Forename = "forename";
		public static final String UpperForename = "upperForename";
		public static final String MiddleName = "middleName";
		public static final String Title = "title";
	}
}

