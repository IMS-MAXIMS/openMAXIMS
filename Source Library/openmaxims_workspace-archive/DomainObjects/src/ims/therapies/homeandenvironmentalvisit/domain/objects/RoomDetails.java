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
package ims.therapies.homeandenvironmentalvisit.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RoomDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100093;
	private static final long serialVersionUID = 1019100093L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Location */
	private ims.domain.lookups.LookupInstance location;
	/** Home Visit Room Type */
	private ims.domain.lookups.LookupInstance homeVisitRoomType;
	/** Environment Visit Room Type */
	private ims.domain.lookups.LookupInstance environmentVisitRoomType;
	/** AccessDetails */
	private String accessDetails;
	/** Door Width */
	private Integer doorWidth;
	private ims.domain.lookups.LookupInstance unitOfMeasure;
	/** Room Details */
	private String roomDetails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RoomDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RoomDetails ()
    {
    	super();
    }
    public RoomDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails.class;
	}


	public ims.domain.lookups.LookupInstance getLocation() {
		return location;
	}
	public void setLocation(ims.domain.lookups.LookupInstance location) {
		this.location = location;
	}

	public ims.domain.lookups.LookupInstance getHomeVisitRoomType() {
		return homeVisitRoomType;
	}
	public void setHomeVisitRoomType(ims.domain.lookups.LookupInstance homeVisitRoomType) {
		this.homeVisitRoomType = homeVisitRoomType;
	}

	public ims.domain.lookups.LookupInstance getEnvironmentVisitRoomType() {
		return environmentVisitRoomType;
	}
	public void setEnvironmentVisitRoomType(ims.domain.lookups.LookupInstance environmentVisitRoomType) {
		this.environmentVisitRoomType = environmentVisitRoomType;
	}

	public String getAccessDetails() {
		return accessDetails;
	}
	public void setAccessDetails(String accessDetails) {
		if ( null != accessDetails && accessDetails.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for accessDetails. Tried to set value: "+
				accessDetails);
		}
		this.accessDetails = accessDetails;
	}

	public Integer getDoorWidth() {
		return doorWidth;
	}
	public void setDoorWidth(Integer doorWidth) {
		this.doorWidth = doorWidth;
	}

	public ims.domain.lookups.LookupInstance getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(ims.domain.lookups.LookupInstance unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getRoomDetails() {
		return roomDetails;
	}
	public void setRoomDetails(String roomDetails) {
		if ( null != roomDetails && roomDetails.length() > 300 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for roomDetails. Tried to set value: "+
				roomDetails);
		}
		this.roomDetails = roomDetails;
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
		
		auditStr.append("\r\n*location* :");
		if (location != null)
			auditStr.append(location.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*homeVisitRoomType* :");
		if (homeVisitRoomType != null)
			auditStr.append(homeVisitRoomType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*environmentVisitRoomType* :");
		if (environmentVisitRoomType != null)
			auditStr.append(environmentVisitRoomType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*accessDetails* :");
		auditStr.append(accessDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*doorWidth* :");
		auditStr.append(doorWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitOfMeasure* :");
		if (unitOfMeasure != null)
			auditStr.append(unitOfMeasure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*roomDetails* :");
		auditStr.append(roomDetails);
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
		
		String keyClassName = "RoomDetails";
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
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString()); 
			sb.append("</location>");		
		}
		if (this.getHomeVisitRoomType() != null)
		{
			sb.append("<homeVisitRoomType>");
			sb.append(this.getHomeVisitRoomType().toXMLString()); 
			sb.append("</homeVisitRoomType>");		
		}
		if (this.getEnvironmentVisitRoomType() != null)
		{
			sb.append("<environmentVisitRoomType>");
			sb.append(this.getEnvironmentVisitRoomType().toXMLString()); 
			sb.append("</environmentVisitRoomType>");		
		}
		if (this.getAccessDetails() != null)
		{
			sb.append("<accessDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAccessDetails().toString()));
			sb.append("</accessDetails>");		
		}
		if (this.getDoorWidth() != null)
		{
			sb.append("<doorWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDoorWidth().toString()));
			sb.append("</doorWidth>");		
		}
		if (this.getUnitOfMeasure() != null)
		{
			sb.append("<unitOfMeasure>");
			sb.append(this.getUnitOfMeasure().toXMLString()); 
			sb.append("</unitOfMeasure>");		
		}
		if (this.getRoomDetails() != null)
		{
			sb.append("<roomDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRoomDetails().toString()));
			sb.append("</roomDetails>");		
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
			RoomDetails domainObject = getRoomDetailsfromXML(itemEl, factory, domMap);

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
			RoomDetails domainObject = getRoomDetailsfromXML(itemEl, factory, domMap);

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
		
	public static RoomDetails getRoomDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRoomDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RoomDetails getRoomDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RoomDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RoomDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RoomDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RoomDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RoomDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RoomDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RoomDetails)factory.getImportedDomainObject(RoomDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RoomDetails();
		}
		String keyClassName = "RoomDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RoomDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RoomDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("homeVisitRoomType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHomeVisitRoomType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("environmentVisitRoomType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEnvironmentVisitRoomType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("accessDetails");
		if(fldEl != null)
		{	
    		obj.setAccessDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doorWidth");
		if(fldEl != null)
		{	
    		obj.setDoorWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unitOfMeasure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnitOfMeasure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("roomDetails");
		if(fldEl != null)
		{	
    		obj.setRoomDetails(new String(fldEl.getTextTrim()));	
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
		public static final String HomeVisitRoomType = "homeVisitRoomType";
		public static final String EnvironmentVisitRoomType = "environmentVisitRoomType";
		public static final String AccessDetails = "accessDetails";
		public static final String DoorWidth = "doorWidth";
		public static final String UnitOfMeasure = "unitOfMeasure";
		public static final String RoomDetails = "roomDetails";
	}
}

