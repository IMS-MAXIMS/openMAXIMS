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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class ActivityLimitGroup extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100040;
	private static final long serialVersionUID = 1003100040L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Group Name - must have at least one activity associated with it  */
	private String name;
	/** Group Description */
	private String description;
	/** Activity
	  * Collection of ims.core.resource.place.domain.objects.Activity.
	  */
	private java.util.Set activity;
	/** Adult Activity Limit */
	private Integer adultLimit;
	/** Number Of Adult Referrals for that activity  */
	private Integer numberOfAdultReferrals;
	/** Paediatric Activity Limit */
	private Integer paediatricLimit;
	/** Number Of Paediatric Referrals for that activity */
	private Integer numberOfPaediatricReferrals;
	/** is Active */
	private Boolean isActive;
	/** Member Of Staff */
	private ims.core.resource.people.domain.objects.MemberOfStaff memberOfStaff;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ActivityLimitGroup (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActivityLimitGroup ()
    {
    	super();
    }
    public ActivityLimitGroup (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ActivityLimitGroup.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Set getActivity() {
		if ( null == activity ) {
			activity = new java.util.HashSet();
		}
		return activity;
	}
	public void setActivity(java.util.Set paramValue) {
		this.activity = paramValue;
	}

	public Integer getAdultLimit() {
		return adultLimit;
	}
	public void setAdultLimit(Integer adultLimit) {
		this.adultLimit = adultLimit;
	}

	public Integer getNumberOfAdultReferrals() {
		return numberOfAdultReferrals;
	}
	public void setNumberOfAdultReferrals(Integer numberOfAdultReferrals) {
		this.numberOfAdultReferrals = numberOfAdultReferrals;
	}

	public Integer getPaediatricLimit() {
		return paediatricLimit;
	}
	public void setPaediatricLimit(Integer paediatricLimit) {
		this.paediatricLimit = paediatricLimit;
	}

	public Integer getNumberOfPaediatricReferrals() {
		return numberOfPaediatricReferrals;
	}
	public void setNumberOfPaediatricReferrals(Integer numberOfPaediatricReferrals) {
		this.numberOfPaediatricReferrals = numberOfPaediatricReferrals;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMemberOfStaff() {
		return memberOfStaff;
	}
	public void setMemberOfStaff(ims.core.resource.people.domain.objects.MemberOfStaff memberOfStaff) {
		this.memberOfStaff = memberOfStaff;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			java.util.Iterator it3 = activity.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Activity obj = (ims.core.resource.place.domain.objects.Activity)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adultLimit* :");
		auditStr.append(adultLimit);
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfAdultReferrals* :");
		auditStr.append(numberOfAdultReferrals);
	    auditStr.append("; ");
		auditStr.append("\r\n*paediatricLimit* :");
		auditStr.append(paediatricLimit);
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfPaediatricReferrals* :");
		auditStr.append(numberOfPaediatricReferrals);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*memberOfStaff* :");
		if (memberOfStaff != null)
		{
			auditStr.append(toShortClassName(memberOfStaff));
				
		    auditStr.append(memberOfStaff.getId());
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
		
		String keyClassName = "ActivityLimitGroup";
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
		if (this.getActivity() != null)
		{
			if (this.getActivity().size() > 0 )
			{
			sb.append("<activity>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivity(), domMap));
			sb.append("</activity>");		
			}
		}
		if (this.getAdultLimit() != null)
		{
			sb.append("<adultLimit>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdultLimit().toString()));
			sb.append("</adultLimit>");		
		}
		if (this.getNumberOfAdultReferrals() != null)
		{
			sb.append("<numberOfAdultReferrals>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfAdultReferrals().toString()));
			sb.append("</numberOfAdultReferrals>");		
		}
		if (this.getPaediatricLimit() != null)
		{
			sb.append("<paediatricLimit>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPaediatricLimit().toString()));
			sb.append("</paediatricLimit>");		
		}
		if (this.getNumberOfPaediatricReferrals() != null)
		{
			sb.append("<numberOfPaediatricReferrals>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfPaediatricReferrals().toString()));
			sb.append("</numberOfPaediatricReferrals>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getMemberOfStaff() != null)
		{
			sb.append("<memberOfStaff>");
			sb.append(this.getMemberOfStaff().toXMLString(domMap)); 	
			sb.append("</memberOfStaff>");		
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
			ActivityLimitGroup domainObject = getActivityLimitGroupfromXML(itemEl, factory, domMap);

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
			ActivityLimitGroup domainObject = getActivityLimitGroupfromXML(itemEl, factory, domMap);

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
		
	public static ActivityLimitGroup getActivityLimitGroupfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActivityLimitGroupfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActivityLimitGroup getActivityLimitGroupfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActivityLimitGroup.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActivityLimitGroup.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActivityLimitGroup class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActivityLimitGroup)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActivityLimitGroup.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActivityLimitGroup ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActivityLimitGroup)factory.getImportedDomainObject(ActivityLimitGroup.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActivityLimitGroup();
		}
		String keyClassName = "ActivityLimitGroup";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActivityLimitGroup)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActivityLimitGroup obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivity(ims.core.resource.place.domain.objects.Activity.fromSetXMLString(fldEl, factory, obj.getActivity(), domMap));
		}
		fldEl = el.element("adultLimit");
		if(fldEl != null)
		{	
    		obj.setAdultLimit(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numberOfAdultReferrals");
		if(fldEl != null)
		{	
    		obj.setNumberOfAdultReferrals(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("paediatricLimit");
		if(fldEl != null)
		{	
    		obj.setPaediatricLimit(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numberOfPaediatricReferrals");
		if(fldEl != null)
		{	
    		obj.setNumberOfPaediatricReferrals(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("memberOfStaff");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMemberOfStaff(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "activity"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String Activity = "activity";
		public static final String AdultLimit = "adultLimit";
		public static final String NumberOfAdultReferrals = "numberOfAdultReferrals";
		public static final String PaediatricLimit = "paediatricLimit";
		public static final String NumberOfPaediatricReferrals = "numberOfPaediatricReferrals";
		public static final String IsActive = "isActive";
		public static final String MemberOfStaff = "memberOfStaff";
	}
}

