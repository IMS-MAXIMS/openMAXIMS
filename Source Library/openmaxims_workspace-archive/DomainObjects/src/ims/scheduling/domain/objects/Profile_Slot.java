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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Profile_Slot extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100000;
	private static final long serialVersionUID = 1055100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Activity */
	private ims.core.resource.place.domain.objects.Activity activity;
	/** StartTm */
	private String startTm;
	/** Duration(Min) */
	private Integer duration;
	/** Priority */
	private ims.domain.lookups.LookupInstance priority;
	/** Number of Slots to Generate for this time */
	private Integer numberSlotsReq;
	/** Number Of Instances */
	private Integer noOfInstances;
	/** CAB Slot Type */
	private ims.domain.lookups.LookupInstance directAccessSlot;
	/** DirectoryOfServices
	  * Collection of ims.scheduling.domain.objects.SlotDirectoryOfService.
	  */
	private java.util.Set directoryOfServices;
	/** DeallocNoOfDays */
	private Integer deallocNoOfDays;
	/** isActive */
	private Boolean isActive;
	/** Function
	  * Collection of ims.core.clinical.domain.objects.ServiceFunction.
	  */
	private java.util.Set functions;
	/** Slot Responsibility */
	private ims.scheduling.domain.objects.Profile_ListOwner slotResp;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Profile_Slot (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Profile_Slot ()
    {
    	super();
    }
    public Profile_Slot (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Profile_Slot.class;
	}


	public ims.core.resource.place.domain.objects.Activity getActivity() {
		return activity;
	}
	public void setActivity(ims.core.resource.place.domain.objects.Activity activity) {
		this.activity = activity;
	}

	public String getStartTm() {
		return startTm;
	}
	public void setStartTm(String startTm) {
		this.startTm = startTm;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public Integer getNumberSlotsReq() {
		return numberSlotsReq;
	}
	public void setNumberSlotsReq(Integer numberSlotsReq) {
		this.numberSlotsReq = numberSlotsReq;
	}

	public Integer getNoOfInstances() {
		return noOfInstances;
	}
	public void setNoOfInstances(Integer noOfInstances) {
		this.noOfInstances = noOfInstances;
	}

	public ims.domain.lookups.LookupInstance getDirectAccessSlot() {
		return directAccessSlot;
	}
	public void setDirectAccessSlot(ims.domain.lookups.LookupInstance directAccessSlot) {
		this.directAccessSlot = directAccessSlot;
	}

	public java.util.Set getDirectoryOfServices() {
		if ( null == directoryOfServices ) {
			directoryOfServices = new java.util.HashSet();
		}
		return directoryOfServices;
	}
	public void setDirectoryOfServices(java.util.Set paramValue) {
		this.directoryOfServices = paramValue;
	}

	public Integer getDeallocNoOfDays() {
		return deallocNoOfDays;
	}
	public void setDeallocNoOfDays(Integer deallocNoOfDays) {
		this.deallocNoOfDays = deallocNoOfDays;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getFunctions() {
		if ( null == functions ) {
			functions = new java.util.HashSet();
		}
		return functions;
	}
	public void setFunctions(java.util.Set paramValue) {
		this.functions = paramValue;
	}

	public ims.scheduling.domain.objects.Profile_ListOwner getSlotResp() {
		return slotResp;
	}
	public void setSlotResp(ims.scheduling.domain.objects.Profile_ListOwner slotResp) {
		this.slotResp = slotResp;
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
		
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			auditStr.append(toShortClassName(activity));
				
		    auditStr.append(activity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startTm* :");
		auditStr.append(startTm);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*numberSlotsReq* :");
		auditStr.append(numberSlotsReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfInstances* :");
		auditStr.append(noOfInstances);
	    auditStr.append("; ");
		auditStr.append("\r\n*directAccessSlot* :");
		if (directAccessSlot != null)
			auditStr.append(directAccessSlot.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*directoryOfServices* :");
		if (directoryOfServices != null)
		{
			java.util.Iterator it8 = directoryOfServices.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SlotDirectoryOfService obj = (ims.scheduling.domain.objects.SlotDirectoryOfService)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*deallocNoOfDays* :");
		auditStr.append(deallocNoOfDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*functions* :");
		if (functions != null)
		{
			java.util.Iterator it11 = functions.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.ServiceFunction obj = (ims.core.clinical.domain.objects.ServiceFunction)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*slotResp* :");
		if (slotResp != null)
		{
			auditStr.append(toShortClassName(slotResp));
				
		    auditStr.append(slotResp.getId());
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
		
		String keyClassName = "Profile_Slot";
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
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString(domMap)); 	
			sb.append("</activity>");		
		}
		if (this.getStartTm() != null)
		{
			sb.append("<startTm>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTm().toString()));
			sb.append("</startTm>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getNumberSlotsReq() != null)
		{
			sb.append("<numberSlotsReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberSlotsReq().toString()));
			sb.append("</numberSlotsReq>");		
		}
		if (this.getNoOfInstances() != null)
		{
			sb.append("<noOfInstances>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfInstances().toString()));
			sb.append("</noOfInstances>");		
		}
		if (this.getDirectAccessSlot() != null)
		{
			sb.append("<directAccessSlot>");
			sb.append(this.getDirectAccessSlot().toXMLString()); 
			sb.append("</directAccessSlot>");		
		}
		if (this.getDirectoryOfServices() != null)
		{
			if (this.getDirectoryOfServices().size() > 0 )
			{
			sb.append("<directoryOfServices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDirectoryOfServices(), domMap));
			sb.append("</directoryOfServices>");		
			}
		}
		if (this.getDeallocNoOfDays() != null)
		{
			sb.append("<deallocNoOfDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDeallocNoOfDays().toString()));
			sb.append("</deallocNoOfDays>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getFunctions() != null)
		{
			if (this.getFunctions().size() > 0 )
			{
			sb.append("<functions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFunctions(), domMap));
			sb.append("</functions>");		
			}
		}
		if (this.getSlotResp() != null)
		{
			sb.append("<slotResp>");
			sb.append(this.getSlotResp().toXMLString(domMap)); 	
			sb.append("</slotResp>");		
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
			Profile_Slot domainObject = getProfile_SlotfromXML(itemEl, factory, domMap);

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
			Profile_Slot domainObject = getProfile_SlotfromXML(itemEl, factory, domMap);

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
		
	public static Profile_Slot getProfile_SlotfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProfile_SlotfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Profile_Slot getProfile_SlotfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Profile_Slot.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Profile_Slot.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Profile_Slot class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Profile_Slot)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Profile_Slot.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Profile_Slot ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Profile_Slot)factory.getImportedDomainObject(Profile_Slot.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Profile_Slot();
		}
		String keyClassName = "Profile_Slot";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Profile_Slot)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Profile_Slot obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivity(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startTm");
		if(fldEl != null)
		{	
    		obj.setStartTm(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("numberSlotsReq");
		if(fldEl != null)
		{	
    		obj.setNumberSlotsReq(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfInstances");
		if(fldEl != null)
		{	
    		obj.setNoOfInstances(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("directAccessSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDirectAccessSlot(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("directoryOfServices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDirectoryOfServices(ims.scheduling.domain.objects.SlotDirectoryOfService.fromSetXMLString(fldEl, factory, obj.getDirectoryOfServices(), domMap));
		}
		fldEl = el.element("deallocNoOfDays");
		if(fldEl != null)
		{	
    		obj.setDeallocNoOfDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("functions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFunctions(ims.core.clinical.domain.objects.ServiceFunction.fromSetXMLString(fldEl, factory, obj.getFunctions(), domMap));
		}
		fldEl = el.element("slotResp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSlotResp(ims.scheduling.domain.objects.Profile_ListOwner.getProfile_ListOwnerfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "directoryOfServices"
		, "functions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Activity = "activity";
		public static final String StartTm = "startTm";
		public static final String Duration = "duration";
		public static final String Priority = "priority";
		public static final String NumberSlotsReq = "numberSlotsReq";
		public static final String NoOfInstances = "noOfInstances";
		public static final String DirectAccessSlot = "directAccessSlot";
		public static final String DirectoryOfServices = "directoryOfServices";
		public static final String DeallocNoOfDays = "deallocNoOfDays";
		public static final String IsActive = "isActive";
		public static final String Functions = "functions";
		public static final String SlotResp = "slotResp";
	}
}

