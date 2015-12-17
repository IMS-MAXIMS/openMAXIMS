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
package ims.pci.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ClientPCIScheduleProfile extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100007;
	private static final long serialVersionUID = 1091100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The PCI schedule selected */
	private ims.pci.domain.objects.ScheduleConfiguration schedule;
	private ims.core.resource.people.domain.objects.MemberOfStaff selectedBy;
	/** Date Schedule Selected on */
	private java.util.Date dateCreated;
	/** was profile deleted from schedule */
	private Boolean isDeleted;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClientPCIScheduleProfile (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClientPCIScheduleProfile ()
    {
    	super();
    }
    public ClientPCIScheduleProfile (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.ClientPCIScheduleProfile.class;
	}


	public ims.pci.domain.objects.ScheduleConfiguration getSchedule() {
		return schedule;
	}
	public void setSchedule(ims.pci.domain.objects.ScheduleConfiguration schedule) {
		this.schedule = schedule;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getSelectedBy() {
		return selectedBy;
	}
	public void setSelectedBy(ims.core.resource.people.domain.objects.MemberOfStaff selectedBy) {
		this.selectedBy = selectedBy;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean isIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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
		
		auditStr.append("\r\n*schedule* :");
		if (schedule != null)
		{
			auditStr.append(toShortClassName(schedule));
				
		    auditStr.append(schedule.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*selectedBy* :");
		if (selectedBy != null)
		{
			auditStr.append(toShortClassName(selectedBy));
				
		    auditStr.append(selectedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateCreated* :");
		auditStr.append(dateCreated);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDeleted* :");
		auditStr.append(isDeleted);
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
		
		String keyClassName = "ClientPCIScheduleProfile";
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
		if (this.getSchedule() != null)
		{
			sb.append("<schedule>");
			sb.append(this.getSchedule().toXMLString(domMap)); 	
			sb.append("</schedule>");		
		}
		if (this.getSelectedBy() != null)
		{
			sb.append("<selectedBy>");
			sb.append(this.getSelectedBy().toXMLString(domMap)); 	
			sb.append("</selectedBy>");		
		}
		if (this.getDateCreated() != null)
		{
			sb.append("<dateCreated>");
			sb.append(new ims.framework.utils.DateTime(this.getDateCreated()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateCreated>");		
		}
		if (this.isIsDeleted() != null)
		{
			sb.append("<isDeleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDeleted().toString()));
			sb.append("</isDeleted>");		
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
			ClientPCIScheduleProfile domainObject = getClientPCIScheduleProfilefromXML(itemEl, factory, domMap);

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
			ClientPCIScheduleProfile domainObject = getClientPCIScheduleProfilefromXML(itemEl, factory, domMap);

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
		
	public static ClientPCIScheduleProfile getClientPCIScheduleProfilefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClientPCIScheduleProfilefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClientPCIScheduleProfile getClientPCIScheduleProfilefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClientPCIScheduleProfile.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClientPCIScheduleProfile.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClientPCIScheduleProfile class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClientPCIScheduleProfile)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClientPCIScheduleProfile.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClientPCIScheduleProfile ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClientPCIScheduleProfile)factory.getImportedDomainObject(ClientPCIScheduleProfile.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClientPCIScheduleProfile();
		}
		String keyClassName = "ClientPCIScheduleProfile";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClientPCIScheduleProfile)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClientPCIScheduleProfile obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("schedule");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSchedule(ims.pci.domain.objects.ScheduleConfiguration.getScheduleConfigurationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("selectedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSelectedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateCreated");
		if(fldEl != null)
		{	
    		obj.setDateCreated(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isDeleted");
		if(fldEl != null)
		{	
    		obj.setIsDeleted(new Boolean(fldEl.getTextTrim()));	
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
		public static final String Schedule = "schedule";
		public static final String SelectedBy = "selectedBy";
		public static final String DateCreated = "dateCreated";
		public static final String IsDeleted = "isDeleted";
	}
}

