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


public class ProfileDetail extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100020;
	private static final long serialVersionUID = 1105100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.dto_move.domain.objects.InternalLocation location;
	private ims.dto_move.domain.objects.RadiotherapyMachine machine;
	private String description;
	private Integer maxApp;
	private String active;
	private Integer minInterval;
	private Integer profileDetailId;
    public ProfileDetail (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public ProfileDetail ()
    {
    	super();
		isComponentClass=true;
    }
    public ProfileDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.ProfileDetail.class;
	}


	public ims.dto_move.domain.objects.InternalLocation getLocation() {
		return location;
	}
	public void setLocation(ims.dto_move.domain.objects.InternalLocation location) {
		this.location = location;
	}

	public ims.dto_move.domain.objects.RadiotherapyMachine getMachine() {
		return machine;
	}
	public void setMachine(ims.dto_move.domain.objects.RadiotherapyMachine machine) {
		this.machine = machine;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public Integer getMaxApp() {
		return maxApp;
	}
	public void setMaxApp(Integer maxApp) {
		this.maxApp = maxApp;
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

	public Integer getMinInterval() {
		return minInterval;
	}
	public void setMinInterval(Integer minInterval) {
		this.minInterval = minInterval;
	}

	public Integer getProfileDetailId() {
		return profileDetailId;
	}
	public void setProfileDetailId(Integer profileDetailId) {
		this.profileDetailId = profileDetailId;
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
		
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*machine* :");
		if (machine != null)
		{
			auditStr.append(toShortClassName(machine));
				
		    auditStr.append(machine.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxApp* :");
		auditStr.append(maxApp);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*minInterval* :");
		auditStr.append(minInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*profileDetailId* :");
		auditStr.append(profileDetailId);
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
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getMachine() != null)
		{
			sb.append("<machine>");
			sb.append(this.getMachine().toXMLString(domMap)); 	
			sb.append("</machine>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getMaxApp() != null)
		{
			sb.append("<maxApp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxApp().toString()));
			sb.append("</maxApp>");		
		}
		if (this.getActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive().toString()));
			sb.append("</active>");		
		}
		if (this.getMinInterval() != null)
		{
			sb.append("<minInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinInterval().toString()));
			sb.append("</minInterval>");		
		}
		if (this.getProfileDetailId() != null)
		{
			sb.append("<profileDetailId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfileDetailId().toString()));
			sb.append("</profileDetailId>");		
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
			ProfileDetail domainObject = getProfileDetailfromXML(itemEl, factory, domMap);

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
			ProfileDetail domainObject = getProfileDetailfromXML(itemEl, factory, domMap);

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
		
	public static ProfileDetail getProfileDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProfileDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ProfileDetail getProfileDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ProfileDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ProfileDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ProfileDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ProfileDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ProfileDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ProfileDetail ret = null;
		if (ret == null)
		{
			ret = new ProfileDetail();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ProfileDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.dto_move.domain.objects.InternalLocation.getInternalLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("machine");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMachine(ims.dto_move.domain.objects.RadiotherapyMachine.getRadiotherapyMachinefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxApp");
		if(fldEl != null)
		{	
    		obj.setMaxApp(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minInterval");
		if(fldEl != null)
		{	
    		obj.setMinInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profileDetailId");
		if(fldEl != null)
		{	
    		obj.setProfileDetailId(new Integer(fldEl.getTextTrim()));	
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
		public static final String Location = "location";
		public static final String Machine = "machine";
		public static final String Description = "description";
		public static final String MaxApp = "maxApp";
		public static final String Active = "active";
		public static final String MinInterval = "minInterval";
		public static final String ProfileDetailId = "profileDetailId";
	}
}

