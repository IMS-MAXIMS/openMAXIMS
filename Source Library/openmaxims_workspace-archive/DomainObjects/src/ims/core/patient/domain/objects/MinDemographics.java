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
package ims.core.patient.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class MinDemographics extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1001100011;
	private static final long serialVersionUID = 1001100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.generic.domain.objects.PersonName name;
	private Integer dob;
	private ims.domain.lookups.LookupInstance sex;
	private String nhsNumber;
	private String hospNum;
    public MinDemographics (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public MinDemographics ()
    {
    	super();
		isComponentClass=true;
    }
    public MinDemographics (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.MinDemographics.class;
	}


	public ims.core.generic.domain.objects.PersonName getName() {
		return name;
	}
	public void setName(ims.core.generic.domain.objects.PersonName name) {
		this.name = name;
	}

	public Integer getDob() {
		return dob;
	}
	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public ims.domain.lookups.LookupInstance getSex() {
		return sex;
	}
	public void setSex(ims.domain.lookups.LookupInstance sex) {
		this.sex = sex;
	}

	public String getNhsNumber() {
		return nhsNumber;
	}
	public void setNhsNumber(String nhsNumber) {
		if ( null != nhsNumber && nhsNumber.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nhsNumber. Tried to set value: "+
				nhsNumber);
		}
		this.nhsNumber = nhsNumber;
	}

	public String getHospNum() {
		return hospNum;
	}
	public void setHospNum(String hospNum) {
		if ( null != hospNum && hospNum.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hospNum. Tried to set value: "+
				hospNum);
		}
		this.hospNum = hospNum;
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
		
		auditStr.append("\r\n*name* :");
		if (name != null)
		{
			auditStr.append(toShortClassName(name));
				
		    auditStr.append(name.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dob* :");
		auditStr.append(dob);
	    auditStr.append("; ");
		auditStr.append("\r\n*sex* :");
		if (sex != null)
			auditStr.append(sex.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nhsNumber* :");
		auditStr.append(nhsNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*hospNum* :");
		auditStr.append(hospNum);
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(this.getName().toXMLString(domMap)); 	
			sb.append("</name>");		
		}
		if (this.getDob() != null)
		{
			sb.append("<dob>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDob().toString()));
			sb.append("</dob>");		
		}
		if (this.getSex() != null)
		{
			sb.append("<sex>");
			sb.append(this.getSex().toXMLString()); 
			sb.append("</sex>");		
		}
		if (this.getNhsNumber() != null)
		{
			sb.append("<nhsNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNhsNumber().toString()));
			sb.append("</nhsNumber>");		
		}
		if (this.getHospNum() != null)
		{
			sb.append("<hospNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHospNum().toString()));
			sb.append("</hospNum>");		
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
			MinDemographics domainObject = getMinDemographicsfromXML(itemEl, factory, domMap);

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
			MinDemographics domainObject = getMinDemographicsfromXML(itemEl, factory, domMap);

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
		
	public static MinDemographics getMinDemographicsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMinDemographicsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MinDemographics getMinDemographicsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MinDemographics.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MinDemographics.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MinDemographics class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MinDemographics)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MinDemographics.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MinDemographics ret = null;
		if (ret == null)
		{
			ret = new MinDemographics();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MinDemographics obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dob");
		if(fldEl != null)
		{	
    		obj.setDob(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sex");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSex(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nhsNumber");
		if(fldEl != null)
		{	
    		obj.setNhsNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hospNum");
		if(fldEl != null)
		{	
    		obj.setHospNum(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals
	*/
	public boolean equals(Object obj)
      {
            if (obj == null)
                  return false;
            
            if (!(obj instanceof MinDemographics))
                  return false;
            
            MinDemographics tmp = (MinDemographics)obj;
            
            if ((name != null && tmp.getName() == null) || (name == null && tmp.getName() != null) || (name != null && !name.equals(tmp.getName())))
                        return false;
            if (dob != tmp.getDob())
                        return false;
            if ((sex != null && tmp.getSex() == null) || (sex == null && tmp.getSex() != null) || (sex != null && sex.getId() != tmp.getSex().getId()))
                  return false;
            if ((nhsNumber != null && tmp.getNhsNumber() == null) || (nhsNumber == null && tmp.getNhsNumber() != null) || (nhsNumber != null && !nhsNumber.equals(tmp.getNhsNumber())))
                  return false;
            if ((hospNum != null && tmp.getHospNum() == null) || (hospNum == null && tmp.getHospNum() != null) || (hospNum != null && !hospNum.equals(tmp.getHospNum())))
                  return false;
            
            return true;
      }


	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (name != null)
			objStr.append(name.toString() + "-");
	      if (dob != null)
			objStr.append(dob + "-");
		if (sex != null)
			objStr.append(sex.getText() + "-");
            if (nhsNumber != null)
			objStr.append(nhsNumber + "-");
		if (hospNum != null)
			objStr.append(hospNum);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Dob = "dob";
		public static final String Sex = "sex";
		public static final String NhsNumber = "nhsNumber";
		public static final String HospNum = "hospNum";
	}
}

