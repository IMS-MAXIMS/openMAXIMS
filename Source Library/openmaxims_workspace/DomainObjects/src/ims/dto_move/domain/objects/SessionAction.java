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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class SessionAction extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100028;
	private static final long serialVersionUID = 1105100028L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Int value only as can't have component within component */
	private Integer sessiondId;
	/** session action id */
	private ims.dto_move.domain.objects.Action action_id;
	/** maximum number of appointments */
	private Integer max_appts;
	/** Active indicator Y/N */
	private String active_indicator;
	/** Remaining Number of Actions */
	private Integer rem_actions;
	/** profile id flat */
	private Integer profile_id;
    public SessionAction (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public SessionAction ()
    {
    	super();
		isComponentClass=true;
    }
    public SessionAction (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.SessionAction.class;
	}


	public Integer getSessiondId() {
		return sessiondId;
	}
	public void setSessiondId(Integer sessiondId) {
		this.sessiondId = sessiondId;
	}

	public ims.dto_move.domain.objects.Action getAction_id() {
		return action_id;
	}
	public void setAction_id(ims.dto_move.domain.objects.Action action_id) {
		this.action_id = action_id;
	}

	public Integer getMax_appts() {
		return max_appts;
	}
	public void setMax_appts(Integer max_appts) {
		this.max_appts = max_appts;
	}

	public String getActive_indicator() {
		return active_indicator;
	}
	public void setActive_indicator(String active_indicator) {
		if ( null != active_indicator && active_indicator.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for active_indicator. Tried to set value: "+
				active_indicator);
		}
		this.active_indicator = active_indicator;
	}

	public Integer getRem_actions() {
		return rem_actions;
	}
	public void setRem_actions(Integer rem_actions) {
		this.rem_actions = rem_actions;
	}

	public Integer getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(Integer profile_id) {
		this.profile_id = profile_id;
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
		
		auditStr.append("\r\n*sessiondId* :");
		auditStr.append(sessiondId);
	    auditStr.append("; ");
		auditStr.append("\r\n*action_id* :");
		if (action_id != null)
		{
			auditStr.append(toShortClassName(action_id));
				
		    auditStr.append(action_id.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*max_appts* :");
		auditStr.append(max_appts);
	    auditStr.append("; ");
		auditStr.append("\r\n*active_indicator* :");
		auditStr.append(active_indicator);
	    auditStr.append("; ");
		auditStr.append("\r\n*rem_actions* :");
		auditStr.append(rem_actions);
	    auditStr.append("; ");
		auditStr.append("\r\n*profile_id* :");
		auditStr.append(profile_id);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getSessiondId() != null)
		{
			sb.append("<sessiondId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSessiondId().toString()));
			sb.append("</sessiondId>");		
		}
		if (this.getAction_id() != null)
		{
			sb.append("<action_id>");
			sb.append(this.getAction_id().toXMLString(domMap)); 	
			sb.append("</action_id>");		
		}
		if (this.getMax_appts() != null)
		{
			sb.append("<max_appts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMax_appts().toString()));
			sb.append("</max_appts>");		
		}
		if (this.getActive_indicator() != null)
		{
			sb.append("<active_indicator>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive_indicator().toString()));
			sb.append("</active_indicator>");		
		}
		if (this.getRem_actions() != null)
		{
			sb.append("<rem_actions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRem_actions().toString()));
			sb.append("</rem_actions>");		
		}
		if (this.getProfile_id() != null)
		{
			sb.append("<profile_id>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfile_id().toString()));
			sb.append("</profile_id>");		
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
			SessionAction domainObject = getSessionActionfromXML(itemEl, factory, domMap);

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
			SessionAction domainObject = getSessionActionfromXML(itemEl, factory, domMap);

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
		
	public static SessionAction getSessionActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSessionActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SessionAction getSessionActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SessionAction.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SessionAction.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SessionAction class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SessionAction)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SessionAction.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SessionAction ret = null;
		if (ret == null)
		{
			ret = new SessionAction();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SessionAction obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("sessiondId");
		if(fldEl != null)
		{	
    		obj.setSessiondId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("action_id");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAction_id(ims.dto_move.domain.objects.Action.getActionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("max_appts");
		if(fldEl != null)
		{	
    		obj.setMax_appts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active_indicator");
		if(fldEl != null)
		{	
    		obj.setActive_indicator(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rem_actions");
		if(fldEl != null)
		{	
    		obj.setRem_actions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profile_id");
		if(fldEl != null)
		{	
    		obj.setProfile_id(new Integer(fldEl.getTextTrim()));	
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
		public static final String SessiondId = "sessiondId";
		public static final String Action_id = "action_id";
		public static final String Max_appts = "max_appts";
		public static final String Active_indicator = "active_indicator";
		public static final String Rem_actions = "rem_actions";
		public static final String Profile_id = "profile_id";
	}
}

