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
package ims.therapies.homeandenvironmentalvisit.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class VisitSummary extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100095;
	private static final long serialVersionUID = 1019100095L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String problemsIdentified;
	private String recommendations;
	private String equipment;
	private String conclusions;
    public VisitSummary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VisitSummary ()
    {
    	super();
    }
    public VisitSummary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.homeandenvironmentalvisit.domain.objects.VisitSummary.class;
	}


	public String getProblemsIdentified() {
		return problemsIdentified;
	}
	public void setProblemsIdentified(String problemsIdentified) {
		if ( null != problemsIdentified && problemsIdentified.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for problemsIdentified. Tried to set value: "+
				problemsIdentified);
		}
		this.problemsIdentified = problemsIdentified;
	}

	public String getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(String recommendations) {
		if ( null != recommendations && recommendations.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recommendations. Tried to set value: "+
				recommendations);
		}
		this.recommendations = recommendations;
	}

	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		if ( null != equipment && equipment.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for equipment. Tried to set value: "+
				equipment);
		}
		this.equipment = equipment;
	}

	public String getConclusions() {
		return conclusions;
	}
	public void setConclusions(String conclusions) {
		if ( null != conclusions && conclusions.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for conclusions. Tried to set value: "+
				conclusions);
		}
		this.conclusions = conclusions;
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
		
		auditStr.append("\r\n*problemsIdentified* :");
		auditStr.append(problemsIdentified);
	    auditStr.append("; ");
		auditStr.append("\r\n*recommendations* :");
		auditStr.append(recommendations);
	    auditStr.append("; ");
		auditStr.append("\r\n*equipment* :");
		auditStr.append(equipment);
	    auditStr.append("; ");
		auditStr.append("\r\n*conclusions* :");
		auditStr.append(conclusions);
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
		
		String keyClassName = "VisitSummary";
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
		if (this.getProblemsIdentified() != null)
		{
			sb.append("<problemsIdentified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProblemsIdentified().toString()));
			sb.append("</problemsIdentified>");		
		}
		if (this.getRecommendations() != null)
		{
			sb.append("<recommendations>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecommendations().toString()));
			sb.append("</recommendations>");		
		}
		if (this.getEquipment() != null)
		{
			sb.append("<equipment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEquipment().toString()));
			sb.append("</equipment>");		
		}
		if (this.getConclusions() != null)
		{
			sb.append("<conclusions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConclusions().toString()));
			sb.append("</conclusions>");		
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
			VisitSummary domainObject = getVisitSummaryfromXML(itemEl, factory, domMap);

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
			VisitSummary domainObject = getVisitSummaryfromXML(itemEl, factory, domMap);

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
		
	public static VisitSummary getVisitSummaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVisitSummaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VisitSummary getVisitSummaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VisitSummary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VisitSummary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VisitSummary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VisitSummary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VisitSummary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VisitSummary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VisitSummary)factory.getImportedDomainObject(VisitSummary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VisitSummary();
		}
		String keyClassName = "VisitSummary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VisitSummary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VisitSummary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("problemsIdentified");
		if(fldEl != null)
		{	
    		obj.setProblemsIdentified(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recommendations");
		if(fldEl != null)
		{	
    		obj.setRecommendations(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("equipment");
		if(fldEl != null)
		{	
    		obj.setEquipment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("conclusions");
		if(fldEl != null)
		{	
    		obj.setConclusions(new String(fldEl.getTextTrim()));	
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
		public static final String ProblemsIdentified = "problemsIdentified";
		public static final String Recommendations = "recommendations";
		public static final String Equipment = "equipment";
		public static final String Conclusions = "conclusions";
	}
}

