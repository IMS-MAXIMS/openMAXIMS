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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class ExternalCodingConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100089;
	private static final long serialVersionUID = 1028100089L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Use External Coder */
	private Boolean useExternalCoder;
	/** Code File In FileName and Full Path */
	private String codeFileIn;
	/** Code File Out FileName and Full Path */
	private String codeFileOut;
	/** Target Window Title */
	private String windowTitle;
	/** default (false) */
	private Boolean debug;
	/** Medicode Program name and full path */
	private String medicodeProgName;
	/** Medicode Shorcut Parameters */
	private String medicodeParams;
	private String defaultMessageValue;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ExternalCodingConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ExternalCodingConfig ()
    {
    	super();
    }
    public ExternalCodingConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.ExternalCodingConfig.class;
	}


	public Boolean isUseExternalCoder() {
		return useExternalCoder;
	}
	public void setUseExternalCoder(Boolean useExternalCoder) {
		this.useExternalCoder = useExternalCoder;
	}

	public String getCodeFileIn() {
		return codeFileIn;
	}
	public void setCodeFileIn(String codeFileIn) {
		if ( null != codeFileIn && codeFileIn.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for codeFileIn. Tried to set value: "+
				codeFileIn);
		}
		this.codeFileIn = codeFileIn;
	}

	public String getCodeFileOut() {
		return codeFileOut;
	}
	public void setCodeFileOut(String codeFileOut) {
		if ( null != codeFileOut && codeFileOut.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for codeFileOut. Tried to set value: "+
				codeFileOut);
		}
		this.codeFileOut = codeFileOut;
	}

	public String getWindowTitle() {
		return windowTitle;
	}
	public void setWindowTitle(String windowTitle) {
		if ( null != windowTitle && windowTitle.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for windowTitle. Tried to set value: "+
				windowTitle);
		}
		this.windowTitle = windowTitle;
	}

	public Boolean isDebug() {
		return debug;
	}
	public void setDebug(Boolean debug) {
		this.debug = debug;
	}

	public String getMedicodeProgName() {
		return medicodeProgName;
	}
	public void setMedicodeProgName(String medicodeProgName) {
		if ( null != medicodeProgName && medicodeProgName.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for medicodeProgName. Tried to set value: "+
				medicodeProgName);
		}
		this.medicodeProgName = medicodeProgName;
	}

	public String getMedicodeParams() {
		return medicodeParams;
	}
	public void setMedicodeParams(String medicodeParams) {
		if ( null != medicodeParams && medicodeParams.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for medicodeParams. Tried to set value: "+
				medicodeParams);
		}
		this.medicodeParams = medicodeParams;
	}

	public String getDefaultMessageValue() {
		return defaultMessageValue;
	}
	public void setDefaultMessageValue(String defaultMessageValue) {
		if ( null != defaultMessageValue && defaultMessageValue.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for defaultMessageValue. Tried to set value: "+
				defaultMessageValue);
		}
		this.defaultMessageValue = defaultMessageValue;
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
		
		auditStr.append("\r\n*useExternalCoder* :");
		auditStr.append(useExternalCoder);
	    auditStr.append("; ");
		auditStr.append("\r\n*codeFileIn* :");
		auditStr.append(codeFileIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*codeFileOut* :");
		auditStr.append(codeFileOut);
	    auditStr.append("; ");
		auditStr.append("\r\n*windowTitle* :");
		auditStr.append(windowTitle);
	    auditStr.append("; ");
		auditStr.append("\r\n*debug* :");
		auditStr.append(debug);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicodeProgName* :");
		auditStr.append(medicodeProgName);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicodeParams* :");
		auditStr.append(medicodeParams);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultMessageValue* :");
		auditStr.append(defaultMessageValue);
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
		
		String keyClassName = "ExternalCodingConfig";
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
		if (this.isUseExternalCoder() != null)
		{
			sb.append("<useExternalCoder>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUseExternalCoder().toString()));
			sb.append("</useExternalCoder>");		
		}
		if (this.getCodeFileIn() != null)
		{
			sb.append("<codeFileIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCodeFileIn().toString()));
			sb.append("</codeFileIn>");		
		}
		if (this.getCodeFileOut() != null)
		{
			sb.append("<codeFileOut>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCodeFileOut().toString()));
			sb.append("</codeFileOut>");		
		}
		if (this.getWindowTitle() != null)
		{
			sb.append("<windowTitle>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWindowTitle().toString()));
			sb.append("</windowTitle>");		
		}
		if (this.isDebug() != null)
		{
			sb.append("<debug>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDebug().toString()));
			sb.append("</debug>");		
		}
		if (this.getMedicodeProgName() != null)
		{
			sb.append("<medicodeProgName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicodeProgName().toString()));
			sb.append("</medicodeProgName>");		
		}
		if (this.getMedicodeParams() != null)
		{
			sb.append("<medicodeParams>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicodeParams().toString()));
			sb.append("</medicodeParams>");		
		}
		if (this.getDefaultMessageValue() != null)
		{
			sb.append("<defaultMessageValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDefaultMessageValue().toString()));
			sb.append("</defaultMessageValue>");		
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
			ExternalCodingConfig domainObject = getExternalCodingConfigfromXML(itemEl, factory, domMap);

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
			ExternalCodingConfig domainObject = getExternalCodingConfigfromXML(itemEl, factory, domMap);

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
		
	public static ExternalCodingConfig getExternalCodingConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getExternalCodingConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ExternalCodingConfig getExternalCodingConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ExternalCodingConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ExternalCodingConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ExternalCodingConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ExternalCodingConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ExternalCodingConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ExternalCodingConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ExternalCodingConfig)factory.getImportedDomainObject(ExternalCodingConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ExternalCodingConfig();
		}
		String keyClassName = "ExternalCodingConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ExternalCodingConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ExternalCodingConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("useExternalCoder");
		if(fldEl != null)
		{	
    		obj.setUseExternalCoder(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("codeFileIn");
		if(fldEl != null)
		{	
    		obj.setCodeFileIn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("codeFileOut");
		if(fldEl != null)
		{	
    		obj.setCodeFileOut(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("windowTitle");
		if(fldEl != null)
		{	
    		obj.setWindowTitle(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("debug");
		if(fldEl != null)
		{	
    		obj.setDebug(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicodeProgName");
		if(fldEl != null)
		{	
    		obj.setMedicodeProgName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicodeParams");
		if(fldEl != null)
		{	
    		obj.setMedicodeParams(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("defaultMessageValue");
		if(fldEl != null)
		{	
    		obj.setDefaultMessageValue(new String(fldEl.getTextTrim()));	
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
		public static final String UseExternalCoder = "useExternalCoder";
		public static final String CodeFileIn = "codeFileIn";
		public static final String CodeFileOut = "codeFileOut";
		public static final String WindowTitle = "windowTitle";
		public static final String Debug = "debug";
		public static final String MedicodeProgName = "medicodeProgName";
		public static final String MedicodeParams = "medicodeParams";
		public static final String DefaultMessageValue = "defaultMessageValue";
	}
}

