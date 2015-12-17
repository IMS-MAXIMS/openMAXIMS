//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
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
	/** A textual suffix that may be added to the end of a person's name, for example, Jnr, Snr, OBE, MBE, BSc, JP, GM.  */
	private String namesuffix;
	/** Object identifier - UID */
	private String objectidentifier;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private java.util.Date beffdate;
	/** Beffdate confirmed */
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	/** Betdate confirmed */
	private Boolean betdatecnf;
	/** name updateMode attribute to indicate whether the item should be "added", "altered", or "removed" */
	private ims.domain.lookups.LookupInstance pdsUpdateMode;
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
		if ( null != middleName && middleName.length() > 100 ) {
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

	public String getNamesuffix() {
		return namesuffix;
	}
	public void setNamesuffix(String namesuffix) {
		if ( null != namesuffix && namesuffix.length() > 35 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for namesuffix. Tried to set value: "+
				namesuffix);
		}
		this.namesuffix = namesuffix;
	}

	public String getObjectidentifier() {
		return objectidentifier;
	}
	public void setObjectidentifier(String objectidentifier) {
		if ( null != objectidentifier && objectidentifier.length() > 14 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for objectidentifier. Tried to set value: "+
				objectidentifier);
		}
		this.objectidentifier = objectidentifier;
	}

	public java.util.Date getBeffdate() {
		return beffdate;
	}
	public void setBeffdate(java.util.Date beffdate) {
		this.beffdate = beffdate;
	}

	public Boolean isBeffdatecnf() {
		return beffdatecnf;
	}
	public void setBeffdatecnf(Boolean beffdatecnf) {
		this.beffdatecnf = beffdatecnf;
	}

	public java.util.Date getBetdate() {
		return betdate;
	}
	public void setBetdate(java.util.Date betdate) {
		this.betdate = betdate;
	}

	public Boolean isBetdatecnf() {
		return betdatecnf;
	}
	public void setBetdatecnf(Boolean betdatecnf) {
		this.betdatecnf = betdatecnf;
	}

	public ims.domain.lookups.LookupInstance getPdsUpdateMode() {
		return pdsUpdateMode;
	}
	public void setPdsUpdateMode(ims.domain.lookups.LookupInstance pdsUpdateMode) {
		this.pdsUpdateMode = pdsUpdateMode;
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
		auditStr.append("\r\n*namesuffix* :");
		auditStr.append(namesuffix);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectidentifier* :");
		auditStr.append(objectidentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdate* :");
		auditStr.append(beffdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdatecnf* :");
		auditStr.append(beffdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdate* :");
		auditStr.append(betdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdatecnf* :");
		auditStr.append(betdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsUpdateMode* :");
		if (pdsUpdateMode != null)
			auditStr.append(pdsUpdateMode.getText());
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
		if (this.getNamesuffix() != null)
		{
			sb.append("<namesuffix>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNamesuffix().toString()));
			sb.append("</namesuffix>");		
		}
		if (this.getObjectidentifier() != null)
		{
			sb.append("<objectidentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectidentifier().toString()));
			sb.append("</objectidentifier>");		
		}
		if (this.getBeffdate() != null)
		{
			sb.append("<beffdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBeffdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</beffdate>");		
		}
		if (this.isBeffdatecnf() != null)
		{
			sb.append("<beffdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBeffdatecnf().toString()));
			sb.append("</beffdatecnf>");		
		}
		if (this.getBetdate() != null)
		{
			sb.append("<betdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBetdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</betdate>");		
		}
		if (this.isBetdatecnf() != null)
		{
			sb.append("<betdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBetdatecnf().toString()));
			sb.append("</betdatecnf>");		
		}
		if (this.getPdsUpdateMode() != null)
		{
			sb.append("<pdsUpdateMode>");
			sb.append(this.getPdsUpdateMode().toXMLString()); 
			sb.append("</pdsUpdateMode>");		
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
		fldEl = el.element("namesuffix");
		if(fldEl != null)
		{	
    		obj.setNamesuffix(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectidentifier");
		if(fldEl != null)
		{	
    		obj.setObjectidentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("beffdate");
		if(fldEl != null)
		{	
    		obj.setBeffdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("beffdatecnf");
		if(fldEl != null)
		{	
    		obj.setBeffdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("betdate");
		if(fldEl != null)
		{	
    		obj.setBetdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("betdatecnf");
		if(fldEl != null)
		{	
    		obj.setBetdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	PersonName other = (PersonName) obj;
	if (beffdate == null)
	{
		if (other.beffdate != null)
			return false;
	}
	else if (!beffdate.equals(other.beffdate))
		return false;
	if (beffdatecnf == null)
	{
		if (other.beffdatecnf != null)
			return false;
	}
	else if (!beffdatecnf.equals(other.beffdatecnf))
		return false;
	if (betdate == null)
	{
		if (other.betdate != null)
			return false;
	}
	else if (!betdate.equals(other.betdate))
		return false;
	if (betdatecnf == null)
	{
		if (other.betdatecnf != null)
			return false;
	}
	else if (!betdatecnf.equals(other.betdatecnf))
		return false;
	if (pdsUpdateMode == null)
	{
		if (other.pdsUpdateMode != null)
			return false;
	}
	else if (!pdsUpdateMode.equals(other.pdsUpdateMode))
		return false;
	if (forename == null)
	{
		if (other.forename != null)
			return false;
	}
	else if (!forename.equals(other.forename))
		return false;
	if (middleName == null)
	{
		if (other.middleName != null)
			return false;
	}
	else if (!middleName.equals(other.middleName))
		return false;
	if (nameType == null)
	{
		if (other.nameType != null)
			return false;
	}
	else if (!nameType.equals(other.nameType))
		return false;
	if (namesuffix == null)
	{
		if (other.namesuffix != null)
			return false;
	}
	else if (!namesuffix.equals(other.namesuffix))
		return false;
	if (objectidentifier == null)
	{
		if (other.objectidentifier != null)
			return false;
	}
	else if (!objectidentifier.equals(other.objectidentifier))
		return false;
	if (surname == null)
	{
		if (other.surname != null)
			return false;
	}
	else if (!surname.equals(other.surname))
		return false;
	if (title == null)
	{
		if (other.title != null)
			return false;
	}
	else if (!title.equals(other.title))
		return false;
	if (upperForename == null)
	{
		if (other.upperForename != null)
			return false;
	}
	else if (!upperForename.equals(other.upperForename))
		return false;
	if (upperSurname == null)
	{
		if (other.upperSurname != null)
			return false;
	}
	else if (!upperSurname.equals(other.upperSurname))
		return false;
	return true;
}

	/**
	hashCode:
	*/
public int hashCode()
{
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((beffdate == null) ? 0 : beffdate.hashCode());
	result = prime * result + ((beffdatecnf == null) ? 0 : beffdatecnf.hashCode());
	result = prime * result + ((betdate == null) ? 0 : betdate.hashCode());
	result = prime * result + ((betdatecnf == null) ? 0 : betdatecnf.hashCode());
	result = prime * result + ((pdsUpdateMode== null) ? 0 : pdsUpdateMode.hashCode());
	result = prime * result + ((forename == null) ? 0 : forename.hashCode());
	result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
	result = prime * result + ((nameType == null) ? 0 : nameType.hashCode());
	result = prime * result + ((namesuffix == null) ? 0 : namesuffix.hashCode());
	result = prime * result + ((objectidentifier == null) ? 0 : objectidentifier.hashCode());
	result = prime * result + ((surname == null) ? 0 : surname.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((upperForename == null) ? 0 : upperForename.hashCode());
	result = prime * result + ((upperSurname == null) ? 0 : upperSurname.hashCode());
	return result;
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
		public static final String Namesuffix = "namesuffix";
		public static final String Objectidentifier = "objectidentifier";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String PdsUpdateMode = "pdsUpdateMode";
	}
}

