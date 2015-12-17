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
package ims.nursing.careplans.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class CarePlanIntervention extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1010100005;
	private static final long serialVersionUID = 1010100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String description;
	private java.util.Date startDate;
	private ims.core.resource.people.domain.objects.Hcp startBy;
	private java.util.Date stopDate;
	private ims.core.resource.people.domain.objects.Hcp stopBy;
	private Boolean active;
	private Integer order;
	/** True = Active, False = Recorded in error */
	private Boolean recInError;
	/** Manual or Optional */
	private ims.domain.lookups.LookupInstance interventionType;
	/** Additional Info */
	private String additionalInfo;
	/** Frequency */
	private ims.domain.lookups.LookupInstance frequency;
	private Boolean isRemoved;
	private java.util.Date removedDate;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
    public CarePlanIntervention (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CarePlanIntervention ()
    {
    	super();
    }
    public CarePlanIntervention (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.careplans.domain.objects.CarePlanIntervention.class;
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

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getStartBy() {
		return startBy;
	}
	public void setStartBy(ims.core.resource.people.domain.objects.Hcp startBy) {
		this.startBy = startBy;
	}

	public java.util.Date getStopDate() {
		return stopDate;
	}
	public void setStopDate(java.util.Date stopDate) {
		this.stopDate = stopDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getStopBy() {
		return stopBy;
	}
	public void setStopBy(ims.core.resource.people.domain.objects.Hcp stopBy) {
		this.stopBy = stopBy;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}

	public Boolean isRecInError() {
		return recInError;
	}
	public void setRecInError(Boolean recInError) {
		this.recInError = recInError;
	}

	public ims.domain.lookups.LookupInstance getInterventionType() {
		return interventionType;
	}
	public void setInterventionType(ims.domain.lookups.LookupInstance interventionType) {
		this.interventionType = interventionType;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		if ( null != additionalInfo && additionalInfo.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for additionalInfo. Tried to set value: "+
				additionalInfo);
		}
		this.additionalInfo = additionalInfo;
	}

	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public Boolean isIsRemoved() {
		return isRemoved;
	}
	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public java.util.Date getRemovedDate() {
		return removedDate;
	}
	public void setRemovedDate(java.util.Date removedDate) {
		this.removedDate = removedDate;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startBy* :");
		if (startBy != null)
		{
			auditStr.append(toShortClassName(startBy));
				
		    auditStr.append(startBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*stopDate* :");
		auditStr.append(stopDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*stopBy* :");
		if (stopBy != null)
		{
			auditStr.append(toShortClassName(stopBy));
				
		    auditStr.append(stopBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*order* :");
		auditStr.append(order);
	    auditStr.append("; ");
		auditStr.append("\r\n*recInError* :");
		auditStr.append(recInError);
	    auditStr.append("; ");
		auditStr.append("\r\n*interventionType* :");
		if (interventionType != null)
			auditStr.append(interventionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*additionalInfo* :");
		auditStr.append(additionalInfo);
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isRemoved* :");
		auditStr.append(isRemoved);
	    auditStr.append("; ");
		auditStr.append("\r\n*removedDate* :");
		auditStr.append(removedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "CarePlanIntervention";
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
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getStartBy() != null)
		{
			sb.append("<startBy>");
			sb.append(this.getStartBy().toXMLString(domMap)); 	
			sb.append("</startBy>");		
		}
		if (this.getStopDate() != null)
		{
			sb.append("<stopDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStopDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</stopDate>");		
		}
		if (this.getStopBy() != null)
		{
			sb.append("<stopBy>");
			sb.append(this.getStopBy().toXMLString(domMap)); 	
			sb.append("</stopBy>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getOrder() != null)
		{
			sb.append("<order>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrder().toString()));
			sb.append("</order>");		
		}
		if (this.isRecInError() != null)
		{
			sb.append("<recInError>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecInError().toString()));
			sb.append("</recInError>");		
		}
		if (this.getInterventionType() != null)
		{
			sb.append("<interventionType>");
			sb.append(this.getInterventionType().toXMLString()); 
			sb.append("</interventionType>");		
		}
		if (this.getAdditionalInfo() != null)
		{
			sb.append("<additionalInfo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdditionalInfo().toString()));
			sb.append("</additionalInfo>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.isIsRemoved() != null)
		{
			sb.append("<isRemoved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsRemoved().toString()));
			sb.append("</isRemoved>");		
		}
		if (this.getRemovedDate() != null)
		{
			sb.append("<removedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRemovedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</removedDate>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			CarePlanIntervention domainObject = getCarePlanInterventionfromXML(itemEl, factory, domMap);

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
			CarePlanIntervention domainObject = getCarePlanInterventionfromXML(itemEl, factory, domMap);

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
		
	public static CarePlanIntervention getCarePlanInterventionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCarePlanInterventionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CarePlanIntervention getCarePlanInterventionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CarePlanIntervention.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CarePlanIntervention.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CarePlanIntervention class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CarePlanIntervention)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CarePlanIntervention.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CarePlanIntervention ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CarePlanIntervention)factory.getImportedDomainObject(CarePlanIntervention.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CarePlanIntervention();
		}
		String keyClassName = "CarePlanIntervention";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CarePlanIntervention)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CarePlanIntervention obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStartBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("stopDate");
		if(fldEl != null)
		{	
    		obj.setStopDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("stopBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStopBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("order");
		if(fldEl != null)
		{	
    		obj.setOrder(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recInError");
		if(fldEl != null)
		{	
    		obj.setRecInError(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("interventionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInterventionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("additionalInfo");
		if(fldEl != null)
		{	
    		obj.setAdditionalInfo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isRemoved");
		if(fldEl != null)
		{	
    		obj.setIsRemoved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("removedDate");
		if(fldEl != null)
		{	
    		obj.setRemovedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String Description = "description";
		public static final String StartDate = "startDate";
		public static final String StartBy = "startBy";
		public static final String StopDate = "stopDate";
		public static final String StopBy = "stopBy";
		public static final String Active = "active";
		public static final String Order = "order";
		public static final String RecInError = "recInError";
		public static final String InterventionType = "interventionType";
		public static final String AdditionalInfo = "additionalInfo";
		public static final String Frequency = "frequency";
		public static final String IsRemoved = "isRemoved";
		public static final String RemovedDate = "removedDate";
		public static final String RecordingInformation = "recordingInformation";
	}
}

