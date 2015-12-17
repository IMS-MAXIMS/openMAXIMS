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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class Action extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100008;
	private static final long serialVersionUID = 1105100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String name;
	private String description;
	private Integer timeRequired;
	private Integer intervalRequired;
	private String patReq;
	private String schedFlag;
	private String active;
	/** TODO: Change to Lookup */
	private Integer actionReason;
	/** 
	  * Collection of ims.dto_move.domain.objects.ActivityAction.
	  */
	private java.util.Set activityAction;
	/** 
	  * Collection of ims.dto_move.domain.objects.ActionHRG.
	  */
	private java.util.List actionHrg;
	/** There is not data of this type on site
	  * Collection of ims.dto_move.domain.objects.Dummy.
	  */
	private java.util.List requirements;
    public Action (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Action ()
    {
    	super();
    }
    public Action (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.Action.class;
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
		if ( null != description && description.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public Integer getTimeRequired() {
		return timeRequired;
	}
	public void setTimeRequired(Integer timeRequired) {
		this.timeRequired = timeRequired;
	}

	public Integer getIntervalRequired() {
		return intervalRequired;
	}
	public void setIntervalRequired(Integer intervalRequired) {
		this.intervalRequired = intervalRequired;
	}

	public String getPatReq() {
		return patReq;
	}
	public void setPatReq(String patReq) {
		if ( null != patReq && patReq.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patReq. Tried to set value: "+
				patReq);
		}
		this.patReq = patReq;
	}

	public String getSchedFlag() {
		return schedFlag;
	}
	public void setSchedFlag(String schedFlag) {
		if ( null != schedFlag && schedFlag.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for schedFlag. Tried to set value: "+
				schedFlag);
		}
		this.schedFlag = schedFlag;
	}

	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		if ( null != active && active.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for active. Tried to set value: "+
				active);
		}
		this.active = active;
	}

	public Integer getActionReason() {
		return actionReason;
	}
	public void setActionReason(Integer actionReason) {
		this.actionReason = actionReason;
	}

	public java.util.Set getActivityAction() {
		if ( null == activityAction ) {
			activityAction = new java.util.HashSet();
		}
		return activityAction;
	}
	public void setActivityAction(java.util.Set paramValue) {
		this.activityAction = paramValue;
	}

	public java.util.List getActionHrg() {
		if ( null == actionHrg ) {
			actionHrg = new java.util.ArrayList();
		}
		return actionHrg;
	}
	public void setActionHrg(java.util.List paramValue) {
		this.actionHrg = paramValue;
	}

	public java.util.List getRequirements() {
		if ( null == requirements ) {
			requirements = new java.util.ArrayList();
		}
		return requirements;
	}
	public void setRequirements(java.util.List paramValue) {
		this.requirements = paramValue;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeRequired* :");
		auditStr.append(timeRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalRequired* :");
		auditStr.append(intervalRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*patReq* :");
		auditStr.append(patReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*schedFlag* :");
		auditStr.append(schedFlag);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionReason* :");
		auditStr.append(actionReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityAction* :");
		if (activityAction != null)
		{
			java.util.Iterator it9 = activityAction.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.dto_move.domain.objects.ActivityAction obj = (ims.dto_move.domain.objects.ActivityAction)it9.next();
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
		auditStr.append("\r\n*actionHrg* :");
		if (actionHrg != null)
		{
		int i10=0;
		for (i10=0; i10<actionHrg.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ActionHRG obj = (ims.dto_move.domain.objects.ActionHRG)actionHrg.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requirements* :");
		if (requirements != null)
		{
		int i11=0;
		for (i11=0; i11<requirements.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.Dummy obj = (ims.dto_move.domain.objects.Dummy)requirements.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
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
		
		String keyClassName = "Action";
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
		if (this.getTimeRequired() != null)
		{
			sb.append("<timeRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeRequired().toString()));
			sb.append("</timeRequired>");		
		}
		if (this.getIntervalRequired() != null)
		{
			sb.append("<intervalRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntervalRequired().toString()));
			sb.append("</intervalRequired>");		
		}
		if (this.getPatReq() != null)
		{
			sb.append("<patReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatReq().toString()));
			sb.append("</patReq>");		
		}
		if (this.getSchedFlag() != null)
		{
			sb.append("<schedFlag>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSchedFlag().toString()));
			sb.append("</schedFlag>");		
		}
		if (this.getActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive().toString()));
			sb.append("</active>");		
		}
		if (this.getActionReason() != null)
		{
			sb.append("<actionReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionReason().toString()));
			sb.append("</actionReason>");		
		}
		if (this.getActivityAction() != null)
		{
			if (this.getActivityAction().size() > 0 )
			{
			sb.append("<activityAction>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivityAction(), domMap));
			sb.append("</activityAction>");		
			}
		}
		if (this.getActionHrg() != null)
		{
			if (this.getActionHrg().size() > 0 )
			{
			sb.append("<actionHrg>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActionHrg(), domMap));
			sb.append("</actionHrg>");		
			}
		}
		if (this.getRequirements() != null)
		{
			if (this.getRequirements().size() > 0 )
			{
			sb.append("<requirements>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRequirements(), domMap));
			sb.append("</requirements>");		
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
			Action domainObject = getActionfromXML(itemEl, factory, domMap);

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
			Action domainObject = getActionfromXML(itemEl, factory, domMap);

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
		
	public static Action getActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Action getActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Action.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Action.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Action class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Action)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Action.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Action ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Action)factory.getImportedDomainObject(Action.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Action();
		}
		String keyClassName = "Action";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Action)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Action obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("timeRequired");
		if(fldEl != null)
		{	
    		obj.setTimeRequired(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intervalRequired");
		if(fldEl != null)
		{	
    		obj.setIntervalRequired(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patReq");
		if(fldEl != null)
		{	
    		obj.setPatReq(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("schedFlag");
		if(fldEl != null)
		{	
    		obj.setSchedFlag(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionReason");
		if(fldEl != null)
		{	
    		obj.setActionReason(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityAction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivityAction(ims.dto_move.domain.objects.ActivityAction.fromSetXMLString(fldEl, factory, obj.getActivityAction(), domMap));
		}
		fldEl = el.element("actionHrg");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActionHrg(ims.dto_move.domain.objects.ActionHRG.fromListXMLString(fldEl, factory, obj.getActionHrg(), domMap));
		}
		fldEl = el.element("requirements");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRequirements(ims.dto_move.domain.objects.Dummy.fromListXMLString(fldEl, factory, obj.getRequirements(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "activityAction"
		, "actionHrg"
		, "requirements"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String TimeRequired = "timeRequired";
		public static final String IntervalRequired = "intervalRequired";
		public static final String PatReq = "patReq";
		public static final String SchedFlag = "schedFlag";
		public static final String Active = "active";
		public static final String ActionReason = "actionReason";
		public static final String ActivityAction = "activityAction";
		public static final String ActionHrg = "actionHrg";
		public static final String Requirements = "requirements";
	}
}

