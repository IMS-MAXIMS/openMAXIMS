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
 * @author Barbara Worwood
 * Generated.
 */


public class Gp extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1006100001;
	private static final long serialVersionUID = 1006100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.generic.domain.objects.PersonName name;
	private ims.domain.lookups.LookupInstance status;
	/** 
	  * Collection of ims.core.resource.domain.objects.GpToPractice.
	  */
	private java.util.Set practices;
	/** 
	  * Collection of ims.core.generic.domain.objects.CommunicationChannel.
	  */
	private java.util.List commChannels;
	/** 
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List codeMappings;
    public Gp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Gp ()
    {
    	super();
    }
    public Gp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.people.domain.objects.Gp.class;
	}


	public ims.core.generic.domain.objects.PersonName getName() {
		return name;
	}
	public void setName(ims.core.generic.domain.objects.PersonName name) {
		this.name = name;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.Set getPractices() {
		if ( null == practices ) {
			practices = new java.util.HashSet();
		}
		return practices;
	}
	public void setPractices(java.util.Set paramValue) {
		this.practices = paramValue;
	}

	public java.util.List getCommChannels() {
		if ( null == commChannels ) {
			commChannels = new java.util.ArrayList();
		}
		return commChannels;
	}
	public void setCommChannels(java.util.List paramValue) {
		this.commChannels = paramValue;
	}

	public java.util.List getCodeMappings() {
		if ( null == codeMappings ) {
			codeMappings = new java.util.ArrayList();
		}
		return codeMappings;
	}
	public void setCodeMappings(java.util.List paramValue) {
		this.codeMappings = paramValue;
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
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*practices* :");
		if (practices != null)
		{
			java.util.Iterator it3 = practices.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.resource.domain.objects.GpToPractice obj = (ims.core.resource.domain.objects.GpToPractice)it3.next();
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
		auditStr.append("\r\n*commChannels* :");
		if (commChannels != null)
		{
		int i4=0;
		for (i4=0; i4<commChannels.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.CommunicationChannel obj = (ims.core.generic.domain.objects.CommunicationChannel)commChannels.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codeMappings* :");
		if (codeMappings != null)
		{
		int i5=0;
		for (i5=0; i5<codeMappings.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)codeMappings.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
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
		
		String keyClassName = "Gp";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(this.getName().toXMLString(domMap)); 	
			sb.append("</name>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getPractices() != null)
		{
			if (this.getPractices().size() > 0 )
			{
			sb.append("<practices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPractices(), domMap));
			sb.append("</practices>");		
			}
		}
		if (this.getCommChannels() != null)
		{
			if (this.getCommChannels().size() > 0 )
			{
			sb.append("<commChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCommChannels(), domMap));
			sb.append("</commChannels>");		
			}
		}
		if (this.getCodeMappings() != null)
		{
			if (this.getCodeMappings().size() > 0 )
			{
			sb.append("<codeMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCodeMappings(), domMap));
			sb.append("</codeMappings>");		
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
			Gp domainObject = getGpfromXML(itemEl, factory, domMap);

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
			Gp domainObject = getGpfromXML(itemEl, factory, domMap);

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
		
	public static Gp getGpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Gp getGpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Gp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Gp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Gp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Gp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Gp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Gp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Gp)factory.getImportedDomainObject(Gp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Gp();
		}
		String keyClassName = "Gp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Gp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Gp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("practices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPractices(ims.core.resource.domain.objects.GpToPractice.fromSetXMLString(fldEl, factory, obj.getPractices(), domMap));
		}
		fldEl = el.element("commChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommChannels(ims.core.generic.domain.objects.CommunicationChannel.fromListXMLString(fldEl, factory, obj.getCommChannels(), domMap));
		}
		fldEl = el.element("codeMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodeMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getCodeMappings(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "practices"
		, "commChannels"
		, "codeMappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Status = "status";
		public static final String Practices = "practices";
		public static final String CommChannels = "commChannels";
		public static final String CodeMappings = "codeMappings";
	}
}

