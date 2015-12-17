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


public class AppContextVariable extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1028100031;
	private static final long serialVersionUID = 1028100031L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}

	private String variableName;
	private String variableKey;
	private Boolean isCollection;
	private ims.domain.lookups.LookupInstance variableType;
	private ims.domain.lookups.LookupInstance valueType;
	private String valueClass;
    public AppContextVariable (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppContextVariable ()
    {
    	super();
    }
    public AppContextVariable (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppContextVariable.class;
	}


	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String variableName) {
		if ( null != variableName && variableName.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for variableName. Tried to set value: "+
				variableName);
		}
		this.variableName = variableName;
	}

	public String getVariableKey() {
		return variableKey;
	}
	public static AppContextVariable getAppContextVariableFromVariableKey(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from AppContextVariable c where c.variableKey = :variableKey";		
		java.util.List l = factory.find(hql, new String[]{"variableKey"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. AppContextVariable.variableKey = " + val + " returned " + l.size() + " records. " );
		return (AppContextVariable)l.get(0);
	}
	public void setVariableKey(String variableKey) {
		if ( null != variableKey && variableKey.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for variableKey. Tried to set value: "+
				variableKey);
		}
		this.variableKey = variableKey;
	}

	public Boolean isIsCollection() {
		return isCollection;
	}
	public void setIsCollection(Boolean isCollection) {
		this.isCollection = isCollection;
	}

	public ims.domain.lookups.LookupInstance getVariableType() {
		return variableType;
	}
	public void setVariableType(ims.domain.lookups.LookupInstance variableType) {
		this.variableType = variableType;
	}

	public ims.domain.lookups.LookupInstance getValueType() {
		return valueType;
	}
	public void setValueType(ims.domain.lookups.LookupInstance valueType) {
		this.valueType = valueType;
	}

	public String getValueClass() {
		return valueClass;
	}
	public void setValueClass(String valueClass) {
		if ( null != valueClass && valueClass.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for valueClass. Tried to set value: "+
				valueClass);
		}
		this.valueClass = valueClass;
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
		
		auditStr.append("\r\n*variableName* :");
		auditStr.append(variableName);
	    auditStr.append("; ");
		auditStr.append("\r\n*variableKey* :");
		auditStr.append(variableKey);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCollection* :");
		auditStr.append(isCollection);
	    auditStr.append("; ");
		auditStr.append("\r\n*variableType* :");
		if (variableType != null)
			auditStr.append(variableType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*valueType* :");
		if (valueType != null)
			auditStr.append(valueType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*valueClass* :");
		auditStr.append(valueClass);
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
		
		String keyClassName = "AppContextVariable";
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
		if (this.getVariableName() != null)
		{
			sb.append("<variableName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVariableName().toString()));
			sb.append("</variableName>");		
		}
		if (this.getVariableKey() != null)
		{
			sb.append("<variableKey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVariableKey().toString()));
			sb.append("</variableKey>");		
		}
		if (this.isIsCollection() != null)
		{
			sb.append("<isCollection>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCollection().toString()));
			sb.append("</isCollection>");		
		}
		if (this.getVariableType() != null)
		{
			sb.append("<variableType>");
			sb.append(this.getVariableType().toXMLString()); 
			sb.append("</variableType>");		
		}
		if (this.getValueType() != null)
		{
			sb.append("<valueType>");
			sb.append(this.getValueType().toXMLString()); 
			sb.append("</valueType>");		
		}
		if (this.getValueClass() != null)
		{
			sb.append("<valueClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getValueClass().toString()));
			sb.append("</valueClass>");		
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
			AppContextVariable domainObject = getAppContextVariablefromXML(itemEl, factory, domMap);

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
			AppContextVariable domainObject = getAppContextVariablefromXML(itemEl, factory, domMap);

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
		
	public static AppContextVariable getAppContextVariablefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppContextVariablefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppContextVariable getAppContextVariablefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppContextVariable.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppContextVariable.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppContextVariable class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppContextVariable)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppContextVariable.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppContextVariable ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppContextVariable)factory.getImportedDomainObject(AppContextVariable.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppContextVariable();
		}
		String keyClassName = "AppContextVariable";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppContextVariable)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppContextVariable obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("variableName");
		if(fldEl != null)
		{	
    		obj.setVariableName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("variableKey");
		if(fldEl != null)
		{	
    		obj.setVariableKey(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCollection");
		if(fldEl != null)
		{	
    		obj.setIsCollection(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("variableType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVariableType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("valueType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setValueType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("valueClass");
		if(fldEl != null)
		{	
    		obj.setValueClass(new String(fldEl.getTextTrim()));	
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
		public static final String VariableName = "variableName";
		public static final String VariableKey = "variableKey";
		public static final String IsCollection = "isCollection";
		public static final String VariableType = "variableType";
		public static final String ValueType = "valueType";
		public static final String ValueClass = "valueClass";
	}
}

