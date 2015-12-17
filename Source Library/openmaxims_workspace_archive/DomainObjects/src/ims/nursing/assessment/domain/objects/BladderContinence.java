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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class BladderContinence extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1012100006;
	private static final long serialVersionUID = 1012100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance day;
	private ims.domain.lookups.LookupInstance night;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List problemType;
	private String otherProblem;
	private ims.domain.lookups.LookupInstance bladderEmptySpontaneously;
    public BladderContinence (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BladderContinence ()
    {
    	super();
    }
    public BladderContinence (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.BladderContinence.class;
	}


	public ims.domain.lookups.LookupInstance getDay() {
		return day;
	}
	public void setDay(ims.domain.lookups.LookupInstance day) {
		this.day = day;
	}

	public ims.domain.lookups.LookupInstance getNight() {
		return night;
	}
	public void setNight(ims.domain.lookups.LookupInstance night) {
		this.night = night;
	}

	public java.util.List getProblemType() {
		if ( null == problemType ) {
			problemType = new java.util.ArrayList();
		}
		return problemType;
	}
	public void setProblemType(java.util.List paramValue) {
		this.problemType = paramValue;
	}

	public String getOtherProblem() {
		return otherProblem;
	}
	public void setOtherProblem(String otherProblem) {
		this.otherProblem = otherProblem;
	}

	public ims.domain.lookups.LookupInstance getBladderEmptySpontaneously() {
		return bladderEmptySpontaneously;
	}
	public void setBladderEmptySpontaneously(ims.domain.lookups.LookupInstance bladderEmptySpontaneously) {
		this.bladderEmptySpontaneously = bladderEmptySpontaneously;
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
		
		auditStr.append("\r\n*day* :");
		if (day != null)
			auditStr.append(day.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*night* :");
		if (night != null)
			auditStr.append(night.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*problemType* :");
		if (problemType != null)
		{
		int i3=0;
		for (i3=0; i3<problemType.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)problemType.get(i3);
			auditStr.append(obj.getText());
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherProblem* :");
		auditStr.append(otherProblem);
	    auditStr.append("; ");
		auditStr.append("\r\n*bladderEmptySpontaneously* :");
		if (bladderEmptySpontaneously != null)
			auditStr.append(bladderEmptySpontaneously.getText());
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
		
		String keyClassName = "BladderContinence";
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
		if (this.getDay() != null)
		{
			sb.append("<day>");
			sb.append(this.getDay().toXMLString()); 
			sb.append("</day>");		
		}
		if (this.getNight() != null)
		{
			sb.append("<night>");
			sb.append(this.getNight().toXMLString()); 
			sb.append("</night>");		
		}
		if (this.getProblemType() != null)
		{
			if (this.getProblemType().size() > 0 )
			{
			sb.append("<problemType>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getProblemType())); 
			sb.append("</problemType>");		
			}
		}
		if (this.getOtherProblem() != null)
		{
			sb.append("<otherProblem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherProblem().toString()));
			sb.append("</otherProblem>");		
		}
		if (this.getBladderEmptySpontaneously() != null)
		{
			sb.append("<bladderEmptySpontaneously>");
			sb.append(this.getBladderEmptySpontaneously().toXMLString()); 
			sb.append("</bladderEmptySpontaneously>");		
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
			BladderContinence domainObject = getBladderContinencefromXML(itemEl, factory, domMap);

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
			BladderContinence domainObject = getBladderContinencefromXML(itemEl, factory, domMap);

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
		
	public static BladderContinence getBladderContinencefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBladderContinencefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BladderContinence getBladderContinencefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BladderContinence.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BladderContinence.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BladderContinence class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BladderContinence)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BladderContinence.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BladderContinence ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BladderContinence)factory.getImportedDomainObject(BladderContinence.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BladderContinence();
		}
		String keyClassName = "BladderContinence";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BladderContinence)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BladderContinence obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("day");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDay(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("night");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNight(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("problemType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setProblemType(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getProblemType())); 
		}
		fldEl = el.element("otherProblem");
		if(fldEl != null)
		{	
    		obj.setOtherProblem(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bladderEmptySpontaneously");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBladderEmptySpontaneously(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "problemType"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Day = "day";
		public static final String Night = "night";
		public static final String ProblemType = "problemType";
		public static final String OtherProblem = "otherProblem";
		public static final String BladderEmptySpontaneously = "bladderEmptySpontaneously";
	}
}

