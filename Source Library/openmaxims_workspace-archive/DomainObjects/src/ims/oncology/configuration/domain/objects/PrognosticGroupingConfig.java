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
package ims.oncology.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PrognosticGroupingConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1075100014;
	private static final long serialVersionUID = 1075100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Is histological type pertinent to prognostic group configuration? */
	private Boolean isHistologicalTypePertinent;
	/** Is histological Grade pertinent to prognostic group configuration? */
	private Boolean isHistologicalGradePertinent;
	/** Is Tumour Location pertinent to prognostic group configuration */
	private Boolean isTumourLocationPertinent;
	/** Is Risk Category pertinent to prognostic group configuration? */
	private Boolean isRiskCategoryPertinent;
	/** Is PSA pertinent to prognostic group configuration? */
	private Boolean isPSAPertinent;
	/** Is Gleason pertinent to prognostic group configuration? */
	private Boolean isGleasonPertinent;
	/** PSA
	  * Collection of ims.oncology.configuration.domain.objects.PSAConfig.
	  */
	private java.util.List pSA;
	/** Gleason
	  * Collection of ims.oncology.configuration.domain.objects.GleasonConfig.
	  */
	private java.util.List gleason;
	/** Location
	  * Collection of ims.oncology.configuration.domain.objects.PrognosticLocationConfig.
	  */
	private java.util.List location;
	/** Risk
	  * Collection of ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration.
	  */
	private java.util.List risk;
	/** Uses T Values */
	private Boolean useTValues;
	/** Uses M Values */
	private Boolean useMValues;
	/** Uses N Values */
	private Boolean useNValues;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PrognosticGroupingConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PrognosticGroupingConfig ()
    {
    	super();
    }
    public PrognosticGroupingConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.configuration.domain.objects.PrognosticGroupingConfig.class;
	}


	public Boolean isIsHistologicalTypePertinent() {
		return isHistologicalTypePertinent;
	}
	public void setIsHistologicalTypePertinent(Boolean isHistologicalTypePertinent) {
		this.isHistologicalTypePertinent = isHistologicalTypePertinent;
	}

	public Boolean isIsHistologicalGradePertinent() {
		return isHistologicalGradePertinent;
	}
	public void setIsHistologicalGradePertinent(Boolean isHistologicalGradePertinent) {
		this.isHistologicalGradePertinent = isHistologicalGradePertinent;
	}

	public Boolean isIsTumourLocationPertinent() {
		return isTumourLocationPertinent;
	}
	public void setIsTumourLocationPertinent(Boolean isTumourLocationPertinent) {
		this.isTumourLocationPertinent = isTumourLocationPertinent;
	}

	public Boolean isIsRiskCategoryPertinent() {
		return isRiskCategoryPertinent;
	}
	public void setIsRiskCategoryPertinent(Boolean isRiskCategoryPertinent) {
		this.isRiskCategoryPertinent = isRiskCategoryPertinent;
	}

	public Boolean isIsPSAPertinent() {
		return isPSAPertinent;
	}
	public void setIsPSAPertinent(Boolean isPSAPertinent) {
		this.isPSAPertinent = isPSAPertinent;
	}

	public Boolean isIsGleasonPertinent() {
		return isGleasonPertinent;
	}
	public void setIsGleasonPertinent(Boolean isGleasonPertinent) {
		this.isGleasonPertinent = isGleasonPertinent;
	}

	public java.util.List getPSA() {
		if ( null == pSA ) {
			pSA = new java.util.ArrayList();
		}
		return pSA;
	}
	public void setPSA(java.util.List paramValue) {
		this.pSA = paramValue;
	}

	public java.util.List getGleason() {
		if ( null == gleason ) {
			gleason = new java.util.ArrayList();
		}
		return gleason;
	}
	public void setGleason(java.util.List paramValue) {
		this.gleason = paramValue;
	}

	public java.util.List getLocation() {
		if ( null == location ) {
			location = new java.util.ArrayList();
		}
		return location;
	}
	public void setLocation(java.util.List paramValue) {
		this.location = paramValue;
	}

	public java.util.List getRisk() {
		if ( null == risk ) {
			risk = new java.util.ArrayList();
		}
		return risk;
	}
	public void setRisk(java.util.List paramValue) {
		this.risk = paramValue;
	}

	public Boolean isUseTValues() {
		return useTValues;
	}
	public void setUseTValues(Boolean useTValues) {
		this.useTValues = useTValues;
	}

	public Boolean isUseMValues() {
		return useMValues;
	}
	public void setUseMValues(Boolean useMValues) {
		this.useMValues = useMValues;
	}

	public Boolean isUseNValues() {
		return useNValues;
	}
	public void setUseNValues(Boolean useNValues) {
		this.useNValues = useNValues;
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
		
		auditStr.append("\r\n*isHistologicalTypePertinent* :");
		auditStr.append(isHistologicalTypePertinent);
	    auditStr.append("; ");
		auditStr.append("\r\n*isHistologicalGradePertinent* :");
		auditStr.append(isHistologicalGradePertinent);
	    auditStr.append("; ");
		auditStr.append("\r\n*isTumourLocationPertinent* :");
		auditStr.append(isTumourLocationPertinent);
	    auditStr.append("; ");
		auditStr.append("\r\n*isRiskCategoryPertinent* :");
		auditStr.append(isRiskCategoryPertinent);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPSAPertinent* :");
		auditStr.append(isPSAPertinent);
	    auditStr.append("; ");
		auditStr.append("\r\n*isGleasonPertinent* :");
		auditStr.append(isGleasonPertinent);
	    auditStr.append("; ");
		auditStr.append("\r\n*pSA* :");
		if (pSA != null)
		{
		int i7=0;
		for (i7=0; i7<pSA.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.PSAConfig obj = (ims.oncology.configuration.domain.objects.PSAConfig)pSA.get(i7);
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
		auditStr.append("\r\n*gleason* :");
		if (gleason != null)
		{
		int i8=0;
		for (i8=0; i8<gleason.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.GleasonConfig obj = (ims.oncology.configuration.domain.objects.GleasonConfig)gleason.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
		int i9=0;
		for (i9=0; i9<location.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.PrognosticLocationConfig obj = (ims.oncology.configuration.domain.objects.PrognosticLocationConfig)location.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*risk* :");
		if (risk != null)
		{
		int i10=0;
		for (i10=0; i10<risk.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration obj = (ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration)risk.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*useTValues* :");
		auditStr.append(useTValues);
	    auditStr.append("; ");
		auditStr.append("\r\n*useMValues* :");
		auditStr.append(useMValues);
	    auditStr.append("; ");
		auditStr.append("\r\n*useNValues* :");
		auditStr.append(useNValues);
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
		
		String keyClassName = "PrognosticGroupingConfig";
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
		if (this.isIsHistologicalTypePertinent() != null)
		{
			sb.append("<isHistologicalTypePertinent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsHistologicalTypePertinent().toString()));
			sb.append("</isHistologicalTypePertinent>");		
		}
		if (this.isIsHistologicalGradePertinent() != null)
		{
			sb.append("<isHistologicalGradePertinent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsHistologicalGradePertinent().toString()));
			sb.append("</isHistologicalGradePertinent>");		
		}
		if (this.isIsTumourLocationPertinent() != null)
		{
			sb.append("<isTumourLocationPertinent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTumourLocationPertinent().toString()));
			sb.append("</isTumourLocationPertinent>");		
		}
		if (this.isIsRiskCategoryPertinent() != null)
		{
			sb.append("<isRiskCategoryPertinent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsRiskCategoryPertinent().toString()));
			sb.append("</isRiskCategoryPertinent>");		
		}
		if (this.isIsPSAPertinent() != null)
		{
			sb.append("<isPSAPertinent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPSAPertinent().toString()));
			sb.append("</isPSAPertinent>");		
		}
		if (this.isIsGleasonPertinent() != null)
		{
			sb.append("<isGleasonPertinent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsGleasonPertinent().toString()));
			sb.append("</isGleasonPertinent>");		
		}
		if (this.getPSA() != null)
		{
			if (this.getPSA().size() > 0 )
			{
			sb.append("<pSA>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPSA(), domMap));
			sb.append("</pSA>");		
			}
		}
		if (this.getGleason() != null)
		{
			if (this.getGleason().size() > 0 )
			{
			sb.append("<gleason>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGleason(), domMap));
			sb.append("</gleason>");		
			}
		}
		if (this.getLocation() != null)
		{
			if (this.getLocation().size() > 0 )
			{
			sb.append("<location>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocation(), domMap));
			sb.append("</location>");		
			}
		}
		if (this.getRisk() != null)
		{
			if (this.getRisk().size() > 0 )
			{
			sb.append("<risk>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRisk(), domMap));
			sb.append("</risk>");		
			}
		}
		if (this.isUseTValues() != null)
		{
			sb.append("<useTValues>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUseTValues().toString()));
			sb.append("</useTValues>");		
		}
		if (this.isUseMValues() != null)
		{
			sb.append("<useMValues>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUseMValues().toString()));
			sb.append("</useMValues>");		
		}
		if (this.isUseNValues() != null)
		{
			sb.append("<useNValues>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUseNValues().toString()));
			sb.append("</useNValues>");		
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
			PrognosticGroupingConfig domainObject = getPrognosticGroupingConfigfromXML(itemEl, factory, domMap);

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
			PrognosticGroupingConfig domainObject = getPrognosticGroupingConfigfromXML(itemEl, factory, domMap);

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
		
	public static PrognosticGroupingConfig getPrognosticGroupingConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPrognosticGroupingConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PrognosticGroupingConfig getPrognosticGroupingConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PrognosticGroupingConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PrognosticGroupingConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PrognosticGroupingConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PrognosticGroupingConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PrognosticGroupingConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PrognosticGroupingConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PrognosticGroupingConfig)factory.getImportedDomainObject(PrognosticGroupingConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PrognosticGroupingConfig();
		}
		String keyClassName = "PrognosticGroupingConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PrognosticGroupingConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PrognosticGroupingConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("isHistologicalTypePertinent");
		if(fldEl != null)
		{	
    		obj.setIsHistologicalTypePertinent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isHistologicalGradePertinent");
		if(fldEl != null)
		{	
    		obj.setIsHistologicalGradePertinent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isTumourLocationPertinent");
		if(fldEl != null)
		{	
    		obj.setIsTumourLocationPertinent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isRiskCategoryPertinent");
		if(fldEl != null)
		{	
    		obj.setIsRiskCategoryPertinent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPSAPertinent");
		if(fldEl != null)
		{	
    		obj.setIsPSAPertinent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isGleasonPertinent");
		if(fldEl != null)
		{	
    		obj.setIsGleasonPertinent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pSA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPSA(ims.oncology.configuration.domain.objects.PSAConfig.fromListXMLString(fldEl, factory, obj.getPSA(), domMap));
		}
		fldEl = el.element("gleason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGleason(ims.oncology.configuration.domain.objects.GleasonConfig.fromListXMLString(fldEl, factory, obj.getGleason(), domMap));
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLocation(ims.oncology.configuration.domain.objects.PrognosticLocationConfig.fromListXMLString(fldEl, factory, obj.getLocation(), domMap));
		}
		fldEl = el.element("risk");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRisk(ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration.fromListXMLString(fldEl, factory, obj.getRisk(), domMap));
		}
		fldEl = el.element("useTValues");
		if(fldEl != null)
		{	
    		obj.setUseTValues(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("useMValues");
		if(fldEl != null)
		{	
    		obj.setUseMValues(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("useNValues");
		if(fldEl != null)
		{	
    		obj.setUseNValues(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "pSA"
		, "gleason"
		, "location"
		, "risk"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String IsHistologicalTypePertinent = "isHistologicalTypePertinent";
		public static final String IsHistologicalGradePertinent = "isHistologicalGradePertinent";
		public static final String IsTumourLocationPertinent = "isTumourLocationPertinent";
		public static final String IsRiskCategoryPertinent = "isRiskCategoryPertinent";
		public static final String IsPSAPertinent = "isPSAPertinent";
		public static final String IsGleasonPertinent = "isGleasonPertinent";
		public static final String PSA = "pSA";
		public static final String Gleason = "gleason";
		public static final String Location = "location";
		public static final String Risk = "risk";
		public static final String UseTValues = "useTValues";
		public static final String UseMValues = "useMValues";
		public static final String UseNValues = "useNValues";
	}
}

