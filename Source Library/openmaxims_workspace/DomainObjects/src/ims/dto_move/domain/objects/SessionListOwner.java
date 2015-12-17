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
 * @author Barbara Worwood
 * Generated.
 */


public class SessionListOwner extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100016;
	private static final long serialVersionUID = 1105100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.resource.people.domain.objects.MemberOfStaff mos;
	private String startTime;
	private String endTime;
	private Integer maxAppts;
	/** Set to id only as component within component not working :) */
	private Integer sessionDetail;
	private String active;
	private Integer duration;
	private Integer remTime;
	private Integer remApps;
	private Integer profileListOwner;
    public SessionListOwner (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public SessionListOwner ()
    {
    	super();
		isComponentClass=true;
    }
    public SessionListOwner (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.SessionListOwner.class;
	}


	public ims.core.resource.people.domain.objects.MemberOfStaff getMos() {
		return mos;
	}
	public void setMos(ims.core.resource.people.domain.objects.MemberOfStaff mos) {
		this.mos = mos;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getMaxAppts() {
		return maxAppts;
	}
	public void setMaxAppts(Integer maxAppts) {
		this.maxAppts = maxAppts;
	}

	public Integer getSessionDetail() {
		return sessionDetail;
	}
	public void setSessionDetail(Integer sessionDetail) {
		this.sessionDetail = sessionDetail;
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

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getRemTime() {
		return remTime;
	}
	public void setRemTime(Integer remTime) {
		this.remTime = remTime;
	}

	public Integer getRemApps() {
		return remApps;
	}
	public void setRemApps(Integer remApps) {
		this.remApps = remApps;
	}

	public Integer getProfileListOwner() {
		return profileListOwner;
	}
	public void setProfileListOwner(Integer profileListOwner) {
		this.profileListOwner = profileListOwner;
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
		
		auditStr.append("\r\n*mos* :");
		if (mos != null)
		{
			auditStr.append(toShortClassName(mos));
				
		    auditStr.append(mos.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		auditStr.append(endTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxAppts* :");
		auditStr.append(maxAppts);
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionDetail* :");
		auditStr.append(sessionDetail);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*remTime* :");
		auditStr.append(remTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*remApps* :");
		auditStr.append(remApps);
	    auditStr.append("; ");
		auditStr.append("\r\n*profileListOwner* :");
		auditStr.append(profileListOwner);
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
		if (this.getMos() != null)
		{
			sb.append("<mos>");
			sb.append(this.getMos().toXMLString(domMap)); 	
			sb.append("</mos>");		
		}
		if (this.getStartTime() != null)
		{
			sb.append("<startTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTime().toString()));
			sb.append("</startTime>");		
		}
		if (this.getEndTime() != null)
		{
			sb.append("<endTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEndTime().toString()));
			sb.append("</endTime>");		
		}
		if (this.getMaxAppts() != null)
		{
			sb.append("<maxAppts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxAppts().toString()));
			sb.append("</maxAppts>");		
		}
		if (this.getSessionDetail() != null)
		{
			sb.append("<sessionDetail>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSessionDetail().toString()));
			sb.append("</sessionDetail>");		
		}
		if (this.getActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive().toString()));
			sb.append("</active>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getRemTime() != null)
		{
			sb.append("<remTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemTime().toString()));
			sb.append("</remTime>");		
		}
		if (this.getRemApps() != null)
		{
			sb.append("<remApps>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemApps().toString()));
			sb.append("</remApps>");		
		}
		if (this.getProfileListOwner() != null)
		{
			sb.append("<profileListOwner>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfileListOwner().toString()));
			sb.append("</profileListOwner>");		
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
			SessionListOwner domainObject = getSessionListOwnerfromXML(itemEl, factory, domMap);

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
			SessionListOwner domainObject = getSessionListOwnerfromXML(itemEl, factory, domMap);

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
		
	public static SessionListOwner getSessionListOwnerfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSessionListOwnerfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SessionListOwner getSessionListOwnerfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SessionListOwner.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SessionListOwner.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SessionListOwner class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SessionListOwner)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SessionListOwner.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SessionListOwner ret = null;
		if (ret == null)
		{
			ret = new SessionListOwner();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SessionListOwner obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("mos");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMos(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startTime");
		if(fldEl != null)
		{	
    		obj.setStartTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endTime");
		if(fldEl != null)
		{	
    		obj.setEndTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxAppts");
		if(fldEl != null)
		{	
    		obj.setMaxAppts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sessionDetail");
		if(fldEl != null)
		{	
    		obj.setSessionDetail(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("remTime");
		if(fldEl != null)
		{	
    		obj.setRemTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("remApps");
		if(fldEl != null)
		{	
    		obj.setRemApps(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profileListOwner");
		if(fldEl != null)
		{	
    		obj.setProfileListOwner(new Integer(fldEl.getTextTrim()));	
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
		public static final String Mos = "mos";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String MaxAppts = "maxAppts";
		public static final String SessionDetail = "sessionDetail";
		public static final String Active = "active";
		public static final String Duration = "duration";
		public static final String RemTime = "remTime";
		public static final String RemApps = "remApps";
		public static final String ProfileListOwner = "profileListOwner";
	}
}

