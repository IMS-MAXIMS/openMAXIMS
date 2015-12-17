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
 * @author Neil McAnaspie
 * Generated.
 */


public class ElectronicPrescribingConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100055;
	private static final long serialVersionUID = 1004100055L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Button */
	private ims.domain.lookups.LookupInstance button;
	/** Text to appear on Button */
	private String buttonText;
	/** Text to appear on Label */
	private String labelText;
	/** Executable Path for Button */
	private String buttonExecutablePath;
	/** Executable Path for Button */
	private String buttonParameter;
	/** Roles denied Access to Button
	  * Collection of ims.core.configuration.domain.objects.AppRole.
	  */
	private java.util.List buttonDeniedRoleAccess;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ElectronicPrescribingConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ElectronicPrescribingConfig ()
    {
    	super();
    }
    public ElectronicPrescribingConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.ElectronicPrescribingConfig.class;
	}


	public ims.domain.lookups.LookupInstance getButton() {
		return button;
	}
	public static ElectronicPrescribingConfig getElectronicPrescribingConfigFromButton(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from ElectronicPrescribingConfig c where c.button.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ElectronicPrescribingConfig.button.id = " + id + " returned " + l.size() + " records. " );
		return (ElectronicPrescribingConfig)l.get(0);
	}
	public void setButton(ims.domain.lookups.LookupInstance button) {
		this.button = button;
	}

	public String getButtonText() {
		return buttonText;
	}
	public void setButtonText(String buttonText) {
		if ( null != buttonText && buttonText.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for buttonText. Tried to set value: "+
				buttonText);
		}
		this.buttonText = buttonText;
	}

	public String getLabelText() {
		return labelText;
	}
	public void setLabelText(String labelText) {
		if ( null != labelText && labelText.length() > 125 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for labelText. Tried to set value: "+
				labelText);
		}
		this.labelText = labelText;
	}

	public String getButtonExecutablePath() {
		return buttonExecutablePath;
	}
	public void setButtonExecutablePath(String buttonExecutablePath) {
		if ( null != buttonExecutablePath && buttonExecutablePath.length() > 175 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for buttonExecutablePath. Tried to set value: "+
				buttonExecutablePath);
		}
		this.buttonExecutablePath = buttonExecutablePath;
	}

	public String getButtonParameter() {
		return buttonParameter;
	}
	public void setButtonParameter(String buttonParameter) {
		if ( null != buttonParameter && buttonParameter.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for buttonParameter. Tried to set value: "+
				buttonParameter);
		}
		this.buttonParameter = buttonParameter;
	}

	public java.util.List getButtonDeniedRoleAccess() {
		if ( null == buttonDeniedRoleAccess ) {
			buttonDeniedRoleAccess = new java.util.ArrayList();
		}
		return buttonDeniedRoleAccess;
	}
	public void setButtonDeniedRoleAccess(java.util.List paramValue) {
		this.buttonDeniedRoleAccess = paramValue;
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
		
		auditStr.append("\r\n*button* :");
		if (button != null)
			auditStr.append(button.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*buttonText* :");
		auditStr.append(buttonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*labelText* :");
		auditStr.append(labelText);
	    auditStr.append("; ");
		auditStr.append("\r\n*buttonExecutablePath* :");
		auditStr.append(buttonExecutablePath);
	    auditStr.append("; ");
		auditStr.append("\r\n*buttonParameter* :");
		auditStr.append(buttonParameter);
	    auditStr.append("; ");
		auditStr.append("\r\n*buttonDeniedRoleAccess* :");
		if (buttonDeniedRoleAccess != null)
		{
		int i6=0;
		for (i6=0; i6<buttonDeniedRoleAccess.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppRole obj = (ims.core.configuration.domain.objects.AppRole)buttonDeniedRoleAccess.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
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
		
		String keyClassName = "ElectronicPrescribingConfig";
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
		if (this.getButton() != null)
		{
			sb.append("<button>");
			sb.append(this.getButton().toXMLString()); 
			sb.append("</button>");		
		}
		if (this.getButtonText() != null)
		{
			sb.append("<buttonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getButtonText().toString()));
			sb.append("</buttonText>");		
		}
		if (this.getLabelText() != null)
		{
			sb.append("<labelText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLabelText().toString()));
			sb.append("</labelText>");		
		}
		if (this.getButtonExecutablePath() != null)
		{
			sb.append("<buttonExecutablePath>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getButtonExecutablePath().toString()));
			sb.append("</buttonExecutablePath>");		
		}
		if (this.getButtonParameter() != null)
		{
			sb.append("<buttonParameter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getButtonParameter().toString()));
			sb.append("</buttonParameter>");		
		}
		if (this.getButtonDeniedRoleAccess() != null)
		{
			if (this.getButtonDeniedRoleAccess().size() > 0 )
			{
			sb.append("<buttonDeniedRoleAccess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getButtonDeniedRoleAccess(), domMap));
			sb.append("</buttonDeniedRoleAccess>");		
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
			ElectronicPrescribingConfig domainObject = getElectronicPrescribingConfigfromXML(itemEl, factory, domMap);

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
			ElectronicPrescribingConfig domainObject = getElectronicPrescribingConfigfromXML(itemEl, factory, domMap);

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
		
	public static ElectronicPrescribingConfig getElectronicPrescribingConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getElectronicPrescribingConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ElectronicPrescribingConfig getElectronicPrescribingConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ElectronicPrescribingConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ElectronicPrescribingConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ElectronicPrescribingConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ElectronicPrescribingConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ElectronicPrescribingConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ElectronicPrescribingConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ElectronicPrescribingConfig)factory.getImportedDomainObject(ElectronicPrescribingConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ElectronicPrescribingConfig();
		}
		String keyClassName = "ElectronicPrescribingConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ElectronicPrescribingConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ElectronicPrescribingConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("button");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setButton(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("buttonText");
		if(fldEl != null)
		{	
    		obj.setButtonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("labelText");
		if(fldEl != null)
		{	
    		obj.setLabelText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("buttonExecutablePath");
		if(fldEl != null)
		{	
    		obj.setButtonExecutablePath(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("buttonParameter");
		if(fldEl != null)
		{	
    		obj.setButtonParameter(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("buttonDeniedRoleAccess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setButtonDeniedRoleAccess(ims.core.configuration.domain.objects.AppRole.fromListXMLString(fldEl, factory, obj.getButtonDeniedRoleAccess(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "buttonDeniedRoleAccess"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Button = "button";
		public static final String ButtonText = "buttonText";
		public static final String LabelText = "labelText";
		public static final String ButtonExecutablePath = "buttonExecutablePath";
		public static final String ButtonParameter = "buttonParameter";
		public static final String ButtonDeniedRoleAccess = "buttonDeniedRoleAccess";
	}
}

