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
package ims.icps.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ICPStage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1060100001;
	private static final long serialVersionUID = 1060100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Phases
	  * Collection of ims.icps.configuration.domain.objects.ICPPhase.
	  */
	private java.util.List phases;
	/** Name */
	private String name;
	/** Description */
	private String description;
	/** Sequence */
	private Integer sequence;
	/** HelpURL */
	private String helpURL;
	/** HasPhase */
	private Boolean hasPhase;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Is Activated On Initiation */
	private Boolean isActivatedOnInitiation;
	/** Rules
	  * Collection of ims.core.admin.domain.objects.BusinessRule.
	  */
	private java.util.Set rules;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ICPStage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ICPStage ()
    {
    	super();
    }
    public ICPStage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.icps.configuration.domain.objects.ICPStage.class;
	}


	public java.util.List getPhases() {
		if ( null == phases ) {
			phases = new java.util.ArrayList();
		}
		return phases;
	}
	public void setPhases(java.util.List paramValue) {
		this.phases = paramValue;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getHelpURL() {
		return helpURL;
	}
	public void setHelpURL(String helpURL) {
		if ( null != helpURL && helpURL.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for helpURL. Tried to set value: "+
				helpURL);
		}
		this.helpURL = helpURL;
	}

	public Boolean isHasPhase() {
		return hasPhase;
	}
	public void setHasPhase(Boolean hasPhase) {
		this.hasPhase = hasPhase;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Boolean isIsActivatedOnInitiation() {
		return isActivatedOnInitiation;
	}
	public void setIsActivatedOnInitiation(Boolean isActivatedOnInitiation) {
		this.isActivatedOnInitiation = isActivatedOnInitiation;
	}

	public java.util.Set getRules() {
		if ( null == rules ) {
			rules = new java.util.HashSet();
		}
		return rules;
	}
	public void setRules(java.util.Set paramValue) {
		this.rules = paramValue;
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
		
		auditStr.append("\r\n*phases* :");
		if (phases != null)
		{
		int i1=0;
		for (i1=0; i1<phases.size(); i1++)
		{
			if (i1 > 0)
				auditStr.append(",");
			ims.icps.configuration.domain.objects.ICPPhase obj = (ims.icps.configuration.domain.objects.ICPPhase)phases.get(i1);
		    if (obj != null)
			{
				if (i1 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*sequence* :");
		auditStr.append(sequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*helpURL* :");
		auditStr.append(helpURL);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasPhase* :");
		auditStr.append(hasPhase);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActivatedOnInitiation* :");
		auditStr.append(isActivatedOnInitiation);
	    auditStr.append("; ");
		auditStr.append("\r\n*rules* :");
		if (rules != null)
		{
			java.util.Iterator it9 = rules.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.BusinessRule obj = (ims.core.admin.domain.objects.BusinessRule)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
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
		
		String keyClassName = "ICPStage";
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
		if (this.getPhases() != null)
		{
			if (this.getPhases().size() > 0 )
			{
			sb.append("<phases>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPhases(), domMap));
			sb.append("</phases>");		
			}
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequence().toString()));
			sb.append("</sequence>");		
		}
		if (this.getHelpURL() != null)
		{
			sb.append("<helpURL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHelpURL().toString()));
			sb.append("</helpURL>");		
		}
		if (this.isHasPhase() != null)
		{
			sb.append("<hasPhase>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasPhase().toString()));
			sb.append("</hasPhase>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.isIsActivatedOnInitiation() != null)
		{
			sb.append("<isActivatedOnInitiation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActivatedOnInitiation().toString()));
			sb.append("</isActivatedOnInitiation>");		
		}
		if (this.getRules() != null)
		{
			if (this.getRules().size() > 0 )
			{
			sb.append("<rules>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRules(), domMap));
			sb.append("</rules>");		
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
			ICPStage domainObject = getICPStagefromXML(itemEl, factory, domMap);

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
			ICPStage domainObject = getICPStagefromXML(itemEl, factory, domMap);

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
		
	public static ICPStage getICPStagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getICPStagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ICPStage getICPStagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ICPStage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ICPStage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ICPStage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ICPStage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ICPStage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ICPStage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ICPStage)factory.getImportedDomainObject(ICPStage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ICPStage();
		}
		String keyClassName = "ICPStage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ICPStage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ICPStage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("phases");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPhases(ims.icps.configuration.domain.objects.ICPPhase.fromListXMLString(fldEl, factory, obj.getPhases(), domMap));
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sequence");
		if(fldEl != null)
		{	
    		obj.setSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("helpURL");
		if(fldEl != null)
		{	
    		obj.setHelpURL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasPhase");
		if(fldEl != null)
		{	
    		obj.setHasPhase(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActivatedOnInitiation");
		if(fldEl != null)
		{	
    		obj.setIsActivatedOnInitiation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rules");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setRules(ims.core.admin.domain.objects.BusinessRule.fromSetXMLString(fldEl, factory, obj.getRules(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "phases"
		, "rules"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Phases = "phases";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String Sequence = "sequence";
		public static final String HelpURL = "helpURL";
		public static final String HasPhase = "hasPhase";
		public static final String Status = "status";
		public static final String IsActivatedOnInitiation = "isActivatedOnInitiation";
		public static final String Rules = "rules";
	}
}

