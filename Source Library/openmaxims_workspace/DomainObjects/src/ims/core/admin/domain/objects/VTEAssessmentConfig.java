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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class VTEAssessmentConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100069;
	private static final long serialVersionUID = 1004100069L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The number of days a pre-op is valid for from completion date */
	private Integer preOpAssessmentValidPeriod;
	/** Wards Excluded from VTE Assessment
	  * Collection of ims.core.admin.domain.objects.VTEAssessmentExclusions.
	  */
	private java.util.List excludedWards;
	/** Specialties excluded from VTE Assessment
	  * Collection of ims.core.admin.domain.objects.VTEAssessmentExclusions.
	  */
	private java.util.List excludedSpecialties;
	/** Combination of Ward/Specialty exclusion
	  * Collection of ims.core.admin.domain.objects.VTEAssessmentExclusions.
	  */
	private java.util.List excludedCombination;
	/** The Colour Configuration for VTE Worklists
	  * Collection of ims.core.admin.domain.objects.VTEAssessmentColourConfig.
	  */
	private java.util.List colourConfiguration;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public VTEAssessmentConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VTEAssessmentConfig ()
    {
    	super();
    }
    public VTEAssessmentConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.VTEAssessmentConfig.class;
	}


	public Integer getPreOpAssessmentValidPeriod() {
		return preOpAssessmentValidPeriod;
	}
	public void setPreOpAssessmentValidPeriod(Integer preOpAssessmentValidPeriod) {
		this.preOpAssessmentValidPeriod = preOpAssessmentValidPeriod;
	}

	public java.util.List getExcludedWards() {
		if ( null == excludedWards ) {
			excludedWards = new java.util.ArrayList();
		}
		return excludedWards;
	}
	public void setExcludedWards(java.util.List paramValue) {
		this.excludedWards = paramValue;
	}

	public java.util.List getExcludedSpecialties() {
		if ( null == excludedSpecialties ) {
			excludedSpecialties = new java.util.ArrayList();
		}
		return excludedSpecialties;
	}
	public void setExcludedSpecialties(java.util.List paramValue) {
		this.excludedSpecialties = paramValue;
	}

	public java.util.List getExcludedCombination() {
		if ( null == excludedCombination ) {
			excludedCombination = new java.util.ArrayList();
		}
		return excludedCombination;
	}
	public void setExcludedCombination(java.util.List paramValue) {
		this.excludedCombination = paramValue;
	}

	public java.util.List getColourConfiguration() {
		if ( null == colourConfiguration ) {
			colourConfiguration = new java.util.ArrayList();
		}
		return colourConfiguration;
	}
	public void setColourConfiguration(java.util.List paramValue) {
		this.colourConfiguration = paramValue;
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
		
		auditStr.append("\r\n*preOpAssessmentValidPeriod* :");
		auditStr.append(preOpAssessmentValidPeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*excludedWards* :");
		if (excludedWards != null)
		{
		int i2=0;
		for (i2=0; i2<excludedWards.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.VTEAssessmentExclusions obj = (ims.core.admin.domain.objects.VTEAssessmentExclusions)excludedWards.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*excludedSpecialties* :");
		if (excludedSpecialties != null)
		{
		int i3=0;
		for (i3=0; i3<excludedSpecialties.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.VTEAssessmentExclusions obj = (ims.core.admin.domain.objects.VTEAssessmentExclusions)excludedSpecialties.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*excludedCombination* :");
		if (excludedCombination != null)
		{
		int i4=0;
		for (i4=0; i4<excludedCombination.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.VTEAssessmentExclusions obj = (ims.core.admin.domain.objects.VTEAssessmentExclusions)excludedCombination.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*colourConfiguration* :");
		if (colourConfiguration != null)
		{
		int i5=0;
		for (i5=0; i5<colourConfiguration.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.VTEAssessmentColourConfig obj = (ims.core.admin.domain.objects.VTEAssessmentColourConfig)colourConfiguration.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
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
		
		String keyClassName = "VTEAssessmentConfig";
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
		if (this.getPreOpAssessmentValidPeriod() != null)
		{
			sb.append("<preOpAssessmentValidPeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreOpAssessmentValidPeriod().toString()));
			sb.append("</preOpAssessmentValidPeriod>");		
		}
		if (this.getExcludedWards() != null)
		{
			if (this.getExcludedWards().size() > 0 )
			{
			sb.append("<excludedWards>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExcludedWards(), domMap));
			sb.append("</excludedWards>");		
			}
		}
		if (this.getExcludedSpecialties() != null)
		{
			if (this.getExcludedSpecialties().size() > 0 )
			{
			sb.append("<excludedSpecialties>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExcludedSpecialties(), domMap));
			sb.append("</excludedSpecialties>");		
			}
		}
		if (this.getExcludedCombination() != null)
		{
			if (this.getExcludedCombination().size() > 0 )
			{
			sb.append("<excludedCombination>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExcludedCombination(), domMap));
			sb.append("</excludedCombination>");		
			}
		}
		if (this.getColourConfiguration() != null)
		{
			if (this.getColourConfiguration().size() > 0 )
			{
			sb.append("<colourConfiguration>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getColourConfiguration(), domMap));
			sb.append("</colourConfiguration>");		
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
			VTEAssessmentConfig domainObject = getVTEAssessmentConfigfromXML(itemEl, factory, domMap);

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
			VTEAssessmentConfig domainObject = getVTEAssessmentConfigfromXML(itemEl, factory, domMap);

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
		
	public static VTEAssessmentConfig getVTEAssessmentConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVTEAssessmentConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VTEAssessmentConfig getVTEAssessmentConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VTEAssessmentConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VTEAssessmentConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VTEAssessmentConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VTEAssessmentConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VTEAssessmentConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VTEAssessmentConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VTEAssessmentConfig)factory.getImportedDomainObject(VTEAssessmentConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VTEAssessmentConfig();
		}
		String keyClassName = "VTEAssessmentConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VTEAssessmentConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VTEAssessmentConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("preOpAssessmentValidPeriod");
		if(fldEl != null)
		{	
    		obj.setPreOpAssessmentValidPeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("excludedWards");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExcludedWards(ims.core.admin.domain.objects.VTEAssessmentExclusions.fromListXMLString(fldEl, factory, obj.getExcludedWards(), domMap));
		}
		fldEl = el.element("excludedSpecialties");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExcludedSpecialties(ims.core.admin.domain.objects.VTEAssessmentExclusions.fromListXMLString(fldEl, factory, obj.getExcludedSpecialties(), domMap));
		}
		fldEl = el.element("excludedCombination");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExcludedCombination(ims.core.admin.domain.objects.VTEAssessmentExclusions.fromListXMLString(fldEl, factory, obj.getExcludedCombination(), domMap));
		}
		fldEl = el.element("colourConfiguration");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setColourConfiguration(ims.core.admin.domain.objects.VTEAssessmentColourConfig.fromListXMLString(fldEl, factory, obj.getColourConfiguration(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "excludedWards"
		, "excludedSpecialties"
		, "excludedCombination"
		, "colourConfiguration"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PreOpAssessmentValidPeriod = "preOpAssessmentValidPeriod";
		public static final String ExcludedWards = "excludedWards";
		public static final String ExcludedSpecialties = "excludedSpecialties";
		public static final String ExcludedCombination = "excludedCombination";
		public static final String ColourConfiguration = "colourConfiguration";
	}
}

