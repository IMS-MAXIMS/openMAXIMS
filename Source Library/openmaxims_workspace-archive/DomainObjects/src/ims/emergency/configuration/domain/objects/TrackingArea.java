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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TrackingArea extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100001;
	private static final long serialVersionUID = 1087100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ED Location */
	private ims.core.resource.place.domain.objects.Location eDLocation;
	/** Description of Area */
	private String areaNameDescription;
	/** Name of Area to be Displayed in Tracking */
	private String areaDisplayName;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Overall Area View */
	private Boolean isOverallView;
	/** Registration */
	private Boolean isRegistrationArea;
	/** PatientRefreshRate */
	private Integer patientRefreshRate;
	/** Number of Cubicles */
	private Integer noOfCubicles;
	/** Columns to be displayed for Area
	  * Collection of ims.emergency.configuration.domain.objects.ColumnDetail.
	  */
	private java.util.List columns;
	/** Send To Areas
	  * Collection of ims.emergency.configuration.domain.objects.TrackingArea.
	  */
	private java.util.List sendToAreas;
	private ims.domain.lookups.LookupInstance areaType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TrackingArea (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TrackingArea ()
    {
    	super();
    }
    public TrackingArea (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.TrackingArea.class;
	}


	public ims.core.resource.place.domain.objects.Location getEDLocation() {
		return eDLocation;
	}
	public void setEDLocation(ims.core.resource.place.domain.objects.Location eDLocation) {
		this.eDLocation = eDLocation;
	}

	public String getAreaNameDescription() {
		return areaNameDescription;
	}
	public void setAreaNameDescription(String areaNameDescription) {
		if ( null != areaNameDescription && areaNameDescription.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for areaNameDescription. Tried to set value: "+
				areaNameDescription);
		}
		this.areaNameDescription = areaNameDescription;
	}

	public String getAreaDisplayName() {
		return areaDisplayName;
	}
	public void setAreaDisplayName(String areaDisplayName) {
		if ( null != areaDisplayName && areaDisplayName.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for areaDisplayName. Tried to set value: "+
				areaDisplayName);
		}
		this.areaDisplayName = areaDisplayName;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Boolean isIsOverallView() {
		return isOverallView;
	}
	public void setIsOverallView(Boolean isOverallView) {
		this.isOverallView = isOverallView;
	}

	public Boolean isIsRegistrationArea() {
		return isRegistrationArea;
	}
	public void setIsRegistrationArea(Boolean isRegistrationArea) {
		this.isRegistrationArea = isRegistrationArea;
	}

	public Integer getPatientRefreshRate() {
		return patientRefreshRate;
	}
	public void setPatientRefreshRate(Integer patientRefreshRate) {
		this.patientRefreshRate = patientRefreshRate;
	}

	public Integer getNoOfCubicles() {
		return noOfCubicles;
	}
	public void setNoOfCubicles(Integer noOfCubicles) {
		this.noOfCubicles = noOfCubicles;
	}

	public java.util.List getColumns() {
		if ( null == columns ) {
			columns = new java.util.ArrayList();
		}
		return columns;
	}
	public void setColumns(java.util.List paramValue) {
		this.columns = paramValue;
	}

	public java.util.List getSendToAreas() {
		if ( null == sendToAreas ) {
			sendToAreas = new java.util.ArrayList();
		}
		return sendToAreas;
	}
	public void setSendToAreas(java.util.List paramValue) {
		this.sendToAreas = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAreaType() {
		return areaType;
	}
	public void setAreaType(ims.domain.lookups.LookupInstance areaType) {
		this.areaType = areaType;
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
		
		auditStr.append("\r\n*eDLocation* :");
		if (eDLocation != null)
		{
			auditStr.append(toShortClassName(eDLocation));
				
		    auditStr.append(eDLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*areaNameDescription* :");
		auditStr.append(areaNameDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*areaDisplayName* :");
		auditStr.append(areaDisplayName);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isOverallView* :");
		auditStr.append(isOverallView);
	    auditStr.append("; ");
		auditStr.append("\r\n*isRegistrationArea* :");
		auditStr.append(isRegistrationArea);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientRefreshRate* :");
		auditStr.append(patientRefreshRate);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfCubicles* :");
		auditStr.append(noOfCubicles);
	    auditStr.append("; ");
		auditStr.append("\r\n*columns* :");
		if (columns != null)
		{
		int i9=0;
		for (i9=0; i9<columns.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.emergency.configuration.domain.objects.ColumnDetail obj = (ims.emergency.configuration.domain.objects.ColumnDetail)columns.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sendToAreas* :");
		if (sendToAreas != null)
		{
		int i10=0;
		for (i10=0; i10<sendToAreas.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.emergency.configuration.domain.objects.TrackingArea obj = (ims.emergency.configuration.domain.objects.TrackingArea)sendToAreas.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*areaType* :");
		if (areaType != null)
			auditStr.append(areaType.getText());
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
		
		String keyClassName = "TrackingArea";
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
		if (this.getEDLocation() != null)
		{
			sb.append("<eDLocation>");
			sb.append(this.getEDLocation().toXMLString(domMap)); 	
			sb.append("</eDLocation>");		
		}
		if (this.getAreaNameDescription() != null)
		{
			sb.append("<areaNameDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAreaNameDescription().toString()));
			sb.append("</areaNameDescription>");		
		}
		if (this.getAreaDisplayName() != null)
		{
			sb.append("<areaDisplayName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAreaDisplayName().toString()));
			sb.append("</areaDisplayName>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.isIsOverallView() != null)
		{
			sb.append("<isOverallView>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsOverallView().toString()));
			sb.append("</isOverallView>");		
		}
		if (this.isIsRegistrationArea() != null)
		{
			sb.append("<isRegistrationArea>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsRegistrationArea().toString()));
			sb.append("</isRegistrationArea>");		
		}
		if (this.getPatientRefreshRate() != null)
		{
			sb.append("<patientRefreshRate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientRefreshRate().toString()));
			sb.append("</patientRefreshRate>");		
		}
		if (this.getNoOfCubicles() != null)
		{
			sb.append("<noOfCubicles>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfCubicles().toString()));
			sb.append("</noOfCubicles>");		
		}
		if (this.getColumns() != null)
		{
			if (this.getColumns().size() > 0 )
			{
			sb.append("<columns>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getColumns(), domMap));
			sb.append("</columns>");		
			}
		}
		if (this.getSendToAreas() != null)
		{
			if (this.getSendToAreas().size() > 0 )
			{
			sb.append("<sendToAreas>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSendToAreas(), domMap));
			sb.append("</sendToAreas>");		
			}
		}
		if (this.getAreaType() != null)
		{
			sb.append("<areaType>");
			sb.append(this.getAreaType().toXMLString()); 
			sb.append("</areaType>");		
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
			TrackingArea domainObject = getTrackingAreafromXML(itemEl, factory, domMap);

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
			TrackingArea domainObject = getTrackingAreafromXML(itemEl, factory, domMap);

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
		
	public static TrackingArea getTrackingAreafromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTrackingAreafromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TrackingArea getTrackingAreafromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TrackingArea.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TrackingArea.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TrackingArea class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TrackingArea)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TrackingArea.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TrackingArea ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TrackingArea)factory.getImportedDomainObject(TrackingArea.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TrackingArea();
		}
		String keyClassName = "TrackingArea";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TrackingArea)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TrackingArea obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("eDLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEDLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("areaNameDescription");
		if(fldEl != null)
		{	
    		obj.setAreaNameDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("areaDisplayName");
		if(fldEl != null)
		{	
    		obj.setAreaDisplayName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isOverallView");
		if(fldEl != null)
		{	
    		obj.setIsOverallView(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isRegistrationArea");
		if(fldEl != null)
		{	
    		obj.setIsRegistrationArea(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientRefreshRate");
		if(fldEl != null)
		{	
    		obj.setPatientRefreshRate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfCubicles");
		if(fldEl != null)
		{	
    		obj.setNoOfCubicles(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("columns");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setColumns(ims.emergency.configuration.domain.objects.ColumnDetail.fromListXMLString(fldEl, factory, obj.getColumns(), domMap));
		}
		fldEl = el.element("sendToAreas");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSendToAreas(ims.emergency.configuration.domain.objects.TrackingArea.fromListXMLString(fldEl, factory, obj.getSendToAreas(), domMap));
		}
		fldEl = el.element("areaType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAreaType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "columns"
		, "sendToAreas"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String EDLocation = "eDLocation";
		public static final String AreaNameDescription = "areaNameDescription";
		public static final String AreaDisplayName = "areaDisplayName";
		public static final String Status = "status";
		public static final String IsOverallView = "isOverallView";
		public static final String IsRegistrationArea = "isRegistrationArea";
		public static final String PatientRefreshRate = "patientRefreshRate";
		public static final String NoOfCubicles = "noOfCubicles";
		public static final String Columns = "columns";
		public static final String SendToAreas = "sendToAreas";
		public static final String AreaType = "areaType";
	}
}

