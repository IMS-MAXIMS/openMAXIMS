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
 * @author George Cristian Josan
 * Generated.
 */


public class Specimen extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100026;
	private static final long serialVersionUID = 1061100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Specimen Type */
	private ims.domain.lookups.LookupInstance type;
	/** Adult Containers Collection
	  * Collection of ims.ocrr.configuration.domain.objects.Container.
	  */
	private java.util.Set adultContainers;
	/** Paediatric Containers Collection
	  * Collection of ims.ocrr.configuration.domain.objects.Container.
	  */
	private java.util.Set paediatricContainers;
	/** Alternative Paediatric Containers Collection
	  * Collection of ims.ocrr.configuration.domain.objects.Container.
	  */
	private java.util.Set alternativePaediatricContainers;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Specimen (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Specimen ()
    {
    	super();
    }
    public Specimen (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.Specimen.class;
	}


	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public java.util.Set getAdultContainers() {
		if ( null == adultContainers ) {
			adultContainers = new java.util.HashSet();
		}
		return adultContainers;
	}
	public void setAdultContainers(java.util.Set paramValue) {
		this.adultContainers = paramValue;
	}

	public java.util.Set getPaediatricContainers() {
		if ( null == paediatricContainers ) {
			paediatricContainers = new java.util.HashSet();
		}
		return paediatricContainers;
	}
	public void setPaediatricContainers(java.util.Set paramValue) {
		this.paediatricContainers = paramValue;
	}

	public java.util.Set getAlternativePaediatricContainers() {
		if ( null == alternativePaediatricContainers ) {
			alternativePaediatricContainers = new java.util.HashSet();
		}
		return alternativePaediatricContainers;
	}
	public void setAlternativePaediatricContainers(java.util.Set paramValue) {
		this.alternativePaediatricContainers = paramValue;
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
		
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adultContainers* :");
		if (adultContainers != null)
		{
			java.util.Iterator it2 = adultContainers.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.Container obj = (ims.ocrr.configuration.domain.objects.Container)it2.next();
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
		auditStr.append("\r\n*paediatricContainers* :");
		if (paediatricContainers != null)
		{
			java.util.Iterator it3 = paediatricContainers.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.Container obj = (ims.ocrr.configuration.domain.objects.Container)it3.next();
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
		auditStr.append("\r\n*alternativePaediatricContainers* :");
		if (alternativePaediatricContainers != null)
		{
			java.util.Iterator it4 = alternativePaediatricContainers.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.Container obj = (ims.ocrr.configuration.domain.objects.Container)it4.next();
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
		
		String keyClassName = "Specimen";
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
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getAdultContainers() != null)
		{
			if (this.getAdultContainers().size() > 0 )
			{
			sb.append("<adultContainers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdultContainers(), domMap));
			sb.append("</adultContainers>");		
			}
		}
		if (this.getPaediatricContainers() != null)
		{
			if (this.getPaediatricContainers().size() > 0 )
			{
			sb.append("<paediatricContainers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPaediatricContainers(), domMap));
			sb.append("</paediatricContainers>");		
			}
		}
		if (this.getAlternativePaediatricContainers() != null)
		{
			if (this.getAlternativePaediatricContainers().size() > 0 )
			{
			sb.append("<alternativePaediatricContainers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAlternativePaediatricContainers(), domMap));
			sb.append("</alternativePaediatricContainers>");		
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
			Specimen domainObject = getSpecimenfromXML(itemEl, factory, domMap);

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
			Specimen domainObject = getSpecimenfromXML(itemEl, factory, domMap);

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
		
	public static Specimen getSpecimenfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSpecimenfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Specimen getSpecimenfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Specimen.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Specimen.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Specimen class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Specimen)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Specimen.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Specimen ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Specimen)factory.getImportedDomainObject(Specimen.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Specimen();
		}
		String keyClassName = "Specimen";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Specimen)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Specimen obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adultContainers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAdultContainers(ims.ocrr.configuration.domain.objects.Container.fromSetXMLString(fldEl, factory, obj.getAdultContainers(), domMap));
		}
		fldEl = el.element("paediatricContainers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPaediatricContainers(ims.ocrr.configuration.domain.objects.Container.fromSetXMLString(fldEl, factory, obj.getPaediatricContainers(), domMap));
		}
		fldEl = el.element("alternativePaediatricContainers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAlternativePaediatricContainers(ims.ocrr.configuration.domain.objects.Container.fromSetXMLString(fldEl, factory, obj.getAlternativePaediatricContainers(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "adultContainers"
		, "paediatricContainers"
		, "alternativePaediatricContainers"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Type = "type";
		public static final String AdultContainers = "adultContainers";
		public static final String PaediatricContainers = "paediatricContainers";
		public static final String AlternativePaediatricContainers = "alternativePaediatricContainers";
	}
}

