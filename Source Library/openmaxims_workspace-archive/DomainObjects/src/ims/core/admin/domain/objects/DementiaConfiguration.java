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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class DementiaConfiguration extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100057;
	private static final long serialVersionUID = 1004100057L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Age (in years) at which screening is to start */
	private Integer age;
	/** Exclude patients who have had a FAIR assessment within this  number of days */
	private Integer excludeFAIRPeriod;
	/** Period of time (in hours) in which Step 1 is to be completed */
	private Integer stepOnePeriod;
	/** Length of time (in hours) from admission time when the Remove option becomes available on the worklist */
	private Integer removeTimePeriod;
	/** AMTS Threshold Score */
	private Integer aMTSThresholdScore;
	/** Admission types to be included in the screening process
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List admissionTypes;
	/** 
	  * Collection of ims.core.admin.domain.objects.DementiaColourConfig.
	  */
	private java.util.List colourConfig;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DementiaConfiguration (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DementiaConfiguration ()
    {
    	super();
    }
    public DementiaConfiguration (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.DementiaConfiguration.class;
	}


	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getExcludeFAIRPeriod() {
		return excludeFAIRPeriod;
	}
	public void setExcludeFAIRPeriod(Integer excludeFAIRPeriod) {
		this.excludeFAIRPeriod = excludeFAIRPeriod;
	}

	public Integer getStepOnePeriod() {
		return stepOnePeriod;
	}
	public void setStepOnePeriod(Integer stepOnePeriod) {
		this.stepOnePeriod = stepOnePeriod;
	}

	public Integer getRemoveTimePeriod() {
		return removeTimePeriod;
	}
	public void setRemoveTimePeriod(Integer removeTimePeriod) {
		this.removeTimePeriod = removeTimePeriod;
	}

	public Integer getAMTSThresholdScore() {
		return aMTSThresholdScore;
	}
	public void setAMTSThresholdScore(Integer aMTSThresholdScore) {
		this.aMTSThresholdScore = aMTSThresholdScore;
	}

	public java.util.List getAdmissionTypes() {
		if ( null == admissionTypes ) {
			admissionTypes = new java.util.ArrayList();
		}
		return admissionTypes;
	}
	public void setAdmissionTypes(java.util.List paramValue) {
		this.admissionTypes = paramValue;
	}

	public java.util.List getColourConfig() {
		if ( null == colourConfig ) {
			colourConfig = new java.util.ArrayList();
		}
		return colourConfig;
	}
	public void setColourConfig(java.util.List paramValue) {
		this.colourConfig = paramValue;
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
		
		auditStr.append("\r\n*age* :");
		auditStr.append(age);
	    auditStr.append("; ");
		auditStr.append("\r\n*excludeFAIRPeriod* :");
		auditStr.append(excludeFAIRPeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*stepOnePeriod* :");
		auditStr.append(stepOnePeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*removeTimePeriod* :");
		auditStr.append(removeTimePeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*aMTSThresholdScore* :");
		auditStr.append(aMTSThresholdScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionTypes* :");
		if (admissionTypes != null)
		{
		int i6=0;
		for (i6=0; i6<admissionTypes.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)admissionTypes.get(i6);
			auditStr.append(obj.getText());
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*colourConfig* :");
		if (colourConfig != null)
		{
		int i7=0;
		for (i7=0; i7<colourConfig.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.DementiaColourConfig obj = (ims.core.admin.domain.objects.DementiaColourConfig)colourConfig.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
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
		
		String keyClassName = "DementiaConfiguration";
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
		if (this.getAge() != null)
		{
			sb.append("<age>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAge().toString()));
			sb.append("</age>");		
		}
		if (this.getExcludeFAIRPeriod() != null)
		{
			sb.append("<excludeFAIRPeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExcludeFAIRPeriod().toString()));
			sb.append("</excludeFAIRPeriod>");		
		}
		if (this.getStepOnePeriod() != null)
		{
			sb.append("<stepOnePeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStepOnePeriod().toString()));
			sb.append("</stepOnePeriod>");		
		}
		if (this.getRemoveTimePeriod() != null)
		{
			sb.append("<removeTimePeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemoveTimePeriod().toString()));
			sb.append("</removeTimePeriod>");		
		}
		if (this.getAMTSThresholdScore() != null)
		{
			sb.append("<aMTSThresholdScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAMTSThresholdScore().toString()));
			sb.append("</aMTSThresholdScore>");		
		}
		if (this.getAdmissionTypes() != null)
		{
			if (this.getAdmissionTypes().size() > 0 )
			{
			sb.append("<admissionTypes>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAdmissionTypes())); 
			sb.append("</admissionTypes>");		
			}
		}
		if (this.getColourConfig() != null)
		{
			if (this.getColourConfig().size() > 0 )
			{
			sb.append("<colourConfig>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getColourConfig(), domMap));
			sb.append("</colourConfig>");		
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
			DementiaConfiguration domainObject = getDementiaConfigurationfromXML(itemEl, factory, domMap);

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
			DementiaConfiguration domainObject = getDementiaConfigurationfromXML(itemEl, factory, domMap);

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
		
	public static DementiaConfiguration getDementiaConfigurationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDementiaConfigurationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DementiaConfiguration getDementiaConfigurationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DementiaConfiguration.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DementiaConfiguration.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DementiaConfiguration class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DementiaConfiguration)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DementiaConfiguration.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DementiaConfiguration ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DementiaConfiguration)factory.getImportedDomainObject(DementiaConfiguration.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DementiaConfiguration();
		}
		String keyClassName = "DementiaConfiguration";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DementiaConfiguration)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DementiaConfiguration obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("age");
		if(fldEl != null)
		{	
    		obj.setAge(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("excludeFAIRPeriod");
		if(fldEl != null)
		{	
    		obj.setExcludeFAIRPeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stepOnePeriod");
		if(fldEl != null)
		{	
    		obj.setStepOnePeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removeTimePeriod");
		if(fldEl != null)
		{	
    		obj.setRemoveTimePeriod(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aMTSThresholdScore");
		if(fldEl != null)
		{	
    		obj.setAMTSThresholdScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionTypes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdmissionTypes(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAdmissionTypes())); 
		}
		fldEl = el.element("colourConfig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setColourConfig(ims.core.admin.domain.objects.DementiaColourConfig.fromListXMLString(fldEl, factory, obj.getColourConfig(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "admissionTypes"
		, "colourConfig"
		};
	}

	/**
	isMethodOfAdmissionListed - Checks to see if the method of admission provided is in the list
	*/
	public boolean isMethodOfAdmissionListed(ims.domain.lookups.LookupInstance moa)
	{
		// Check if the method of admission passed into this method is in the list of configured values
		if (moa != null && admissionTypes != null && admissionTypes.size() > 0)
		{
			for (int i=0; i<admissionTypes.size(); i++)
			{
				ims.domain.lookups.LookupInstance item = (ims.domain.lookups.LookupInstance) admissionTypes.get(i);
				if (item.getId() == moa.getId())
					return true;
			}
		}
		return false;
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Age = "age";
		public static final String ExcludeFAIRPeriod = "excludeFAIRPeriod";
		public static final String StepOnePeriod = "stepOnePeriod";
		public static final String RemoveTimePeriod = "removeTimePeriod";
		public static final String AMTSThresholdScore = "aMTSThresholdScore";
		public static final String AdmissionTypes = "admissionTypes";
		public static final String ColourConfig = "colourConfig";
	}
}

