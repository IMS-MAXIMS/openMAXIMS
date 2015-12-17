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
 * @author Joan Heelan
 * Generated.
 */


public class BatchPricing extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1057100005;
	private static final long serialVersionUID = 1057100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Batch Name */
	private String batchName;
	/** Member of Staff creating the batch */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordedBy;
	/** Date Time batch created */
	private java.util.Date recordingDate;
	/** Hospital  */
	private ims.core.resource.place.domain.objects.Location location;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Location/Service
	  * Collection of ims.core.resource.place.domain.objects.LocationService.
	  */
	private java.util.Set locationService;
	/** Percentage Applied */
	private java.lang.Float percentageApplied;
	/** Effective From */
	private java.util.Date effectiveFrom;
	/** Activated Date */
	private java.util.Date activatedDate;
	/** Has Batch Been Printed? */
	private Boolean isPrinted;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public BatchPricing (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BatchPricing ()
    {
    	super();
    }
    public BatchPricing (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.BatchPricing.class;
	}


	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordedBy() {
		return recordedBy;
	}
	public void setRecordedBy(ims.core.resource.people.domain.objects.MemberOfStaff recordedBy) {
		this.recordedBy = recordedBy;
	}

	public java.util.Date getRecordingDate() {
		return recordingDate;
	}
	public void setRecordingDate(java.util.Date recordingDate) {
		this.recordingDate = recordingDate;
	}

	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.Set getLocationService() {
		if ( null == locationService ) {
			locationService = new java.util.HashSet();
		}
		return locationService;
	}
	public void setLocationService(java.util.Set paramValue) {
		this.locationService = paramValue;
	}

	public java.lang.Float getPercentageApplied() {
		return percentageApplied;
	}
	public void setPercentageApplied(java.lang.Float percentageApplied) {
		this.percentageApplied = percentageApplied;
	}

	public java.util.Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(java.util.Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public java.util.Date getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(java.util.Date activatedDate) {
		this.activatedDate = activatedDate;
	}

	public Boolean isIsPrinted() {
		return isPrinted;
	}
	public void setIsPrinted(Boolean isPrinted) {
		this.isPrinted = isPrinted;
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
		
		auditStr.append("\r\n*batchName* :");
		auditStr.append(batchName);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordedBy* :");
		if (recordedBy != null)
		{
			auditStr.append(toShortClassName(recordedBy));
				
		    auditStr.append(recordedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDate* :");
		auditStr.append(recordingDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*locationService* :");
		if (locationService != null)
		{
			java.util.Iterator it6 = locationService.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.LocationService obj = (ims.core.resource.place.domain.objects.LocationService)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*percentageApplied* :");
		auditStr.append(percentageApplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFrom* :");
		auditStr.append(effectiveFrom);
	    auditStr.append("; ");
		auditStr.append("\r\n*activatedDate* :");
		auditStr.append(activatedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrinted* :");
		auditStr.append(isPrinted);
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
		
		String keyClassName = "BatchPricing";
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
		if (this.getBatchName() != null)
		{
			sb.append("<batchName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBatchName().toString()));
			sb.append("</batchName>");		
		}
		if (this.getRecordedBy() != null)
		{
			sb.append("<recordedBy>");
			sb.append(this.getRecordedBy().toXMLString(domMap)); 	
			sb.append("</recordedBy>");		
		}
		if (this.getRecordingDate() != null)
		{
			sb.append("<recordingDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDate>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getLocationService() != null)
		{
			if (this.getLocationService().size() > 0 )
			{
			sb.append("<locationService>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocationService(), domMap));
			sb.append("</locationService>");		
			}
		}
		if (this.getPercentageApplied() != null)
		{
			sb.append("<percentageApplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPercentageApplied().toString()));
			sb.append("</percentageApplied>");		
		}
		if (this.getEffectiveFrom() != null)
		{
			sb.append("<effectiveFrom>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveFrom()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveFrom>");		
		}
		if (this.getActivatedDate() != null)
		{
			sb.append("<activatedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getActivatedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</activatedDate>");		
		}
		if (this.isIsPrinted() != null)
		{
			sb.append("<isPrinted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrinted().toString()));
			sb.append("</isPrinted>");		
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
			BatchPricing domainObject = getBatchPricingfromXML(itemEl, factory, domMap);

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
			BatchPricing domainObject = getBatchPricingfromXML(itemEl, factory, domMap);

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
		
	public static BatchPricing getBatchPricingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBatchPricingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BatchPricing getBatchPricingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BatchPricing.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BatchPricing.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BatchPricing class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BatchPricing)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BatchPricing.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BatchPricing ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BatchPricing)factory.getImportedDomainObject(BatchPricing.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BatchPricing();
		}
		String keyClassName = "BatchPricing";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BatchPricing)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BatchPricing obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("batchName");
		if(fldEl != null)
		{	
    		obj.setBatchName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDate");
		if(fldEl != null)
		{	
    		obj.setRecordingDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("locationService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLocationService(ims.core.resource.place.domain.objects.LocationService.fromSetXMLString(fldEl, factory, obj.getLocationService(), domMap));
		}
		fldEl = el.element("percentageApplied");
		if(fldEl != null)
		{	
    		obj.setPercentageApplied(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effectiveFrom");
		if(fldEl != null)
		{	
    		obj.setEffectiveFrom(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activatedDate");
		if(fldEl != null)
		{	
    		obj.setActivatedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isPrinted");
		if(fldEl != null)
		{	
    		obj.setIsPrinted(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "locationService"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String BatchName = "batchName";
		public static final String RecordedBy = "recordedBy";
		public static final String RecordingDate = "recordingDate";
		public static final String Location = "location";
		public static final String Status = "status";
		public static final String LocationService = "locationService";
		public static final String PercentageApplied = "percentageApplied";
		public static final String EffectiveFrom = "effectiveFrom";
		public static final String ActivatedDate = "activatedDate";
		public static final String IsPrinted = "isPrinted";
	}
}

