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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class AppTopButton extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1021100009;
	private static final long serialVersionUID = 1021100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Text */
	private String text;
	private ims.domain.lookups.LookupInstance action;
	private Integer buildIn;
	private ims.framework.FormName form;
	private String uRL;
	private Boolean alwaysEnabled;
	private Boolean enabled;
	private Boolean contextDependent;
	private Boolean patientMustBeSelected;
	/** For Dialog open from TopButton show maximise button */
	private Boolean displayMaximiseButton;
	/** For Dialog open from TopButton show close button if available */
	private Boolean displayCloseButton;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppTopButton (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppTopButton ()
    {
    	super();
    }
    public AppTopButton (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppTopButton.class;
	}


	public String getText() {
		return text;
	}
	public void setText(String text) {
		if ( null != text && text.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for text. Tried to set value: "+
				text);
		}
		this.text = text;
	}

	public ims.domain.lookups.LookupInstance getAction() {
		return action;
	}
	public void setAction(ims.domain.lookups.LookupInstance action) {
		this.action = action;
	}

	public Integer getBuildIn() {
		return buildIn;
	}
	public void setBuildIn(Integer buildIn) {
		this.buildIn = buildIn;
	}

	public ims.framework.FormName getForm() {
		return form;
	}
	public void setForm(ims.framework.FormName form) {
		this.form = form;
	}

	public String getURL() {
		return uRL;
	}
	public void setURL(String uRL) {
		if ( null != uRL && uRL.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uRL. Tried to set value: "+
				uRL);
		}
		this.uRL = uRL;
	}

	public Boolean isAlwaysEnabled() {
		return alwaysEnabled;
	}
	public void setAlwaysEnabled(Boolean alwaysEnabled) {
		this.alwaysEnabled = alwaysEnabled;
	}

	public Boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean isContextDependent() {
		return contextDependent;
	}
	public void setContextDependent(Boolean contextDependent) {
		this.contextDependent = contextDependent;
	}

	public Boolean isPatientMustBeSelected() {
		return patientMustBeSelected;
	}
	public void setPatientMustBeSelected(Boolean patientMustBeSelected) {
		this.patientMustBeSelected = patientMustBeSelected;
	}

	public Boolean isDisplayMaximiseButton() {
		return displayMaximiseButton;
	}
	public void setDisplayMaximiseButton(Boolean displayMaximiseButton) {
		this.displayMaximiseButton = displayMaximiseButton;
	}

	public Boolean isDisplayCloseButton() {
		return displayCloseButton;
	}
	public void setDisplayCloseButton(Boolean displayCloseButton) {
		this.displayCloseButton = displayCloseButton;
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
		
		auditStr.append("\r\n*text* :");
		auditStr.append(text);
	    auditStr.append("; ");
		auditStr.append("\r\n*action* :");
		if (action != null)
			auditStr.append(action.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*buildIn* :");
		auditStr.append(buildIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*form* :");
		auditStr.append(form);
	    auditStr.append("; ");
		auditStr.append("\r\n*uRL* :");
		auditStr.append(uRL);
	    auditStr.append("; ");
		auditStr.append("\r\n*alwaysEnabled* :");
		auditStr.append(alwaysEnabled);
	    auditStr.append("; ");
		auditStr.append("\r\n*enabled* :");
		auditStr.append(enabled);
	    auditStr.append("; ");
		auditStr.append("\r\n*contextDependent* :");
		auditStr.append(contextDependent);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientMustBeSelected* :");
		auditStr.append(patientMustBeSelected);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayMaximiseButton* :");
		auditStr.append(displayMaximiseButton);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayCloseButton* :");
		auditStr.append(displayCloseButton);
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
		
		String keyClassName = "AppTopButton";
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
		if (this.getText() != null)
		{
			sb.append("<text>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getText().toString()));
			sb.append("</text>");		
		}
		if (this.getAction() != null)
		{
			sb.append("<action>");
			sb.append(this.getAction().toXMLString()); 
			sb.append("</action>");		
		}
		if (this.getBuildIn() != null)
		{
			sb.append("<buildIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBuildIn().toString()));
			sb.append("</buildIn>");		
		}
		if (this.getForm() != null)
		{
			sb.append("<form>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForm().toString()));
			sb.append("</form>");		
		}
		if (this.getURL() != null)
		{
			sb.append("<uRL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getURL().toString()));
			sb.append("</uRL>");		
		}
		if (this.isAlwaysEnabled() != null)
		{
			sb.append("<alwaysEnabled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAlwaysEnabled().toString()));
			sb.append("</alwaysEnabled>");		
		}
		if (this.isEnabled() != null)
		{
			sb.append("<enabled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isEnabled().toString()));
			sb.append("</enabled>");		
		}
		if (this.isContextDependent() != null)
		{
			sb.append("<contextDependent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isContextDependent().toString()));
			sb.append("</contextDependent>");		
		}
		if (this.isPatientMustBeSelected() != null)
		{
			sb.append("<patientMustBeSelected>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPatientMustBeSelected().toString()));
			sb.append("</patientMustBeSelected>");		
		}
		if (this.isDisplayMaximiseButton() != null)
		{
			sb.append("<displayMaximiseButton>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayMaximiseButton().toString()));
			sb.append("</displayMaximiseButton>");		
		}
		if (this.isDisplayCloseButton() != null)
		{
			sb.append("<displayCloseButton>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayCloseButton().toString()));
			sb.append("</displayCloseButton>");		
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
			AppTopButton domainObject = getAppTopButtonfromXML(itemEl, factory, domMap);

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
			AppTopButton domainObject = getAppTopButtonfromXML(itemEl, factory, domMap);

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
		
	public static AppTopButton getAppTopButtonfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppTopButtonfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppTopButton getAppTopButtonfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppTopButton.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppTopButton.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppTopButton class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppTopButton)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppTopButton.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppTopButton ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppTopButton)factory.getImportedDomainObject(AppTopButton.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppTopButton();
		}
		String keyClassName = "AppTopButton";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppTopButton)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppTopButton obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("text");
		if(fldEl != null)
		{	
    		obj.setText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("action");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("buildIn");
		if(fldEl != null)
		{	
    		obj.setBuildIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("form");
		if(fldEl != null)
		{	
    		java.util.StringTokenizer st4 = new java.util.StringTokenizer(fldEl.getTextTrim(), ",");
    		if (st4.countTokens() == 1)
    		{
				obj.setForm(new ims.framework.FormNameImpl(Integer.parseInt(fldEl.getTextTrim())));	
    		}
    		else
    		{
				obj.setForm(new ims.framework.FormNameImpl(Integer.parseInt(st4.nextToken()), st4.nextToken()));	
    		}
		}
		fldEl = el.element("uRL");
		if(fldEl != null)
		{	
    		obj.setURL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("alwaysEnabled");
		if(fldEl != null)
		{	
    		obj.setAlwaysEnabled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("enabled");
		if(fldEl != null)
		{	
    		obj.setEnabled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contextDependent");
		if(fldEl != null)
		{	
    		obj.setContextDependent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientMustBeSelected");
		if(fldEl != null)
		{	
    		obj.setPatientMustBeSelected(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayMaximiseButton");
		if(fldEl != null)
		{	
    		obj.setDisplayMaximiseButton(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayCloseButton");
		if(fldEl != null)
		{	
    		obj.setDisplayCloseButton(new Boolean(fldEl.getTextTrim()));	
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
		public static final String Text = "text";
		public static final String Action = "action";
		public static final String BuildIn = "buildIn";
		public static final String Form = "form";
		public static final String URL = "uRL";
		public static final String AlwaysEnabled = "alwaysEnabled";
		public static final String Enabled = "enabled";
		public static final String ContextDependent = "contextDependent";
		public static final String PatientMustBeSelected = "patientMustBeSelected";
		public static final String DisplayMaximiseButton = "displayMaximiseButton";
		public static final String DisplayCloseButton = "displayCloseButton";
	}
}

