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
 * @author Kevin O'Carroll
 * Generated.
 */


public class Service extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1003100032;
	private static final long serialVersionUID = 1003100032L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ServiceName */
	private String serviceName;
	/** ServiceDescription */
	private String serviceDescription;
	/** Service Category */
	private ims.domain.lookups.LookupInstance serviceCategory;
	/** Specialty - If category is "CLINICAL" */
	private ims.domain.lookups.LookupInstance specialty;
	/** isActive */
	private Boolean isActive;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	private String upperName;
	/** Used to group services e.g. BLS will group CH and HM */
	private String alternateServiceCode;
	/** Can this service be Scheduled */
	private Boolean canBeScheduled;
	/** Expected Turnaround Measure */
	private ims.domain.lookups.LookupInstance turnaroundMeasure;
	/** Expected Turnaround Value */
	private Integer expectedTurnaround;
	/** MaternityIndicator */
	private Boolean maternityIndicator;
    public Service (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Service ()
    {
    	super();
    }
    public Service (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.Service.class;
	}


	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		if ( null != serviceName && serviceName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for serviceName. Tried to set value: "+
				serviceName);
		}
		this.serviceName = serviceName;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		if ( null != serviceDescription && serviceDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for serviceDescription. Tried to set value: "+
				serviceDescription);
		}
		this.serviceDescription = serviceDescription;
	}

	public ims.domain.lookups.LookupInstance getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(ims.domain.lookups.LookupInstance serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public String getUpperName() {
		return upperName;
	}
	public void setUpperName(String upperName) {
		if ( null != upperName && upperName.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperName. Tried to set value: "+
				upperName);
		}
		this.upperName = upperName;
	}

	public String getAlternateServiceCode() {
		return alternateServiceCode;
	}
	public void setAlternateServiceCode(String alternateServiceCode) {
		if ( null != alternateServiceCode && alternateServiceCode.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for alternateServiceCode. Tried to set value: "+
				alternateServiceCode);
		}
		this.alternateServiceCode = alternateServiceCode;
	}

	public Boolean isCanBeScheduled() {
		return canBeScheduled;
	}
	public void setCanBeScheduled(Boolean canBeScheduled) {
		this.canBeScheduled = canBeScheduled;
	}

	public ims.domain.lookups.LookupInstance getTurnaroundMeasure() {
		return turnaroundMeasure;
	}
	public void setTurnaroundMeasure(ims.domain.lookups.LookupInstance turnaroundMeasure) {
		this.turnaroundMeasure = turnaroundMeasure;
	}

	public Integer getExpectedTurnaround() {
		return expectedTurnaround;
	}
	public void setExpectedTurnaround(Integer expectedTurnaround) {
		this.expectedTurnaround = expectedTurnaround;
	}

	public Boolean isMaternityIndicator() {
		return maternityIndicator;
	}
	public void setMaternityIndicator(Boolean maternityIndicator) {
		this.maternityIndicator = maternityIndicator;
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
	// method generated based on 'svc_unq_1' unique index.
	public static boolean recordExistForServiceNameAndIsActive(ims.domain.ILightweightDomainFactory factory,
		 String serviceName
	,
	 Boolean isActive
	)	
	{
		return recordExistForServiceNameAndIsActive(factory, serviceName, isActive, null);
	}	

	// method generated based on 'svc_unq_1' unique index.
	public static boolean recordExistForServiceNameAndIsActive(ims.domain.ILightweightDomainFactory factory,
		 String serviceName
	,
	 Boolean isActive
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from Service c where ");
		hql.append(" c.serviceName = :serviceName ");
		names[0] = "serviceName";
		values[0] = serviceName;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'svc_unq_1' unique index.
	public static Service getRecordByServiceNameAndIsActive(ims.domain.ILightweightDomainFactory factory,
	 String serviceName
	,
	 Boolean isActive
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from Service c where ");
		hql.append(" c.serviceName = :serviceName ");
		names[0] = "serviceName";
		values[0] = serviceName;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (Service)l.get(0);
	}

	public static Service getServiceFromsvc_unq_1(ims.domain.ILightweightDomainFactory factory,
	 String serviceName
	,
	 Boolean isActive
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from Service c where ");
		hql.append(" c.serviceName = :serviceName ");
		names[0] = "serviceName";
		values[0] = serviceName;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (Service)l.get(0);
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
		
		auditStr.append("\r\n*serviceName* :");
		auditStr.append(serviceName);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceDescription* :");
		auditStr.append(serviceDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceCategory* :");
		if (serviceCategory != null)
			auditStr.append(serviceCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i6=0;
		for (i6=0; i6<taxonomyMap.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*upperName* :");
		auditStr.append(upperName);
	    auditStr.append("; ");
		auditStr.append("\r\n*alternateServiceCode* :");
		auditStr.append(alternateServiceCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*canBeScheduled* :");
		auditStr.append(canBeScheduled);
	    auditStr.append("; ");
		auditStr.append("\r\n*turnaroundMeasure* :");
		if (turnaroundMeasure != null)
			auditStr.append(turnaroundMeasure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedTurnaround* :");
		auditStr.append(expectedTurnaround);
	    auditStr.append("; ");
		auditStr.append("\r\n*maternityIndicator* :");
		auditStr.append(maternityIndicator);
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
		
		String keyClassName = "Service";
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
		if (this.getServiceName() != null)
		{
			sb.append("<serviceName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getServiceName().toString()));
			sb.append("</serviceName>");		
		}
		if (this.getServiceDescription() != null)
		{
			sb.append("<serviceDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getServiceDescription().toString()));
			sb.append("</serviceDescription>");		
		}
		if (this.getServiceCategory() != null)
		{
			sb.append("<serviceCategory>");
			sb.append(this.getServiceCategory().toXMLString()); 
			sb.append("</serviceCategory>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.getUpperName() != null)
		{
			sb.append("<upperName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperName().toString()));
			sb.append("</upperName>");		
		}
		if (this.getAlternateServiceCode() != null)
		{
			sb.append("<alternateServiceCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAlternateServiceCode().toString()));
			sb.append("</alternateServiceCode>");		
		}
		if (this.isCanBeScheduled() != null)
		{
			sb.append("<canBeScheduled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanBeScheduled().toString()));
			sb.append("</canBeScheduled>");		
		}
		if (this.getTurnaroundMeasure() != null)
		{
			sb.append("<turnaroundMeasure>");
			sb.append(this.getTurnaroundMeasure().toXMLString()); 
			sb.append("</turnaroundMeasure>");		
		}
		if (this.getExpectedTurnaround() != null)
		{
			sb.append("<expectedTurnaround>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExpectedTurnaround().toString()));
			sb.append("</expectedTurnaround>");		
		}
		if (this.isMaternityIndicator() != null)
		{
			sb.append("<maternityIndicator>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMaternityIndicator().toString()));
			sb.append("</maternityIndicator>");		
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
			Service domainObject = getServicefromXML(itemEl, factory, domMap);

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
			Service domainObject = getServicefromXML(itemEl, factory, domMap);

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
		
	public static Service getServicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getServicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Service getServicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Service.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Service.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Service class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Service)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Service.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Service ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Service)factory.getImportedDomainObject(Service.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Service();
		}
		String keyClassName = "Service";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Service)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Service obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("serviceName");
		if(fldEl != null)
		{	
    		obj.setServiceName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceDescription");
		if(fldEl != null)
		{	
    		obj.setServiceDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setServiceCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("upperName");
		if(fldEl != null)
		{	
    		obj.setUpperName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("alternateServiceCode");
		if(fldEl != null)
		{	
    		obj.setAlternateServiceCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canBeScheduled");
		if(fldEl != null)
		{	
    		obj.setCanBeScheduled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("turnaroundMeasure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTurnaroundMeasure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("expectedTurnaround");
		if(fldEl != null)
		{	
    		obj.setExpectedTurnaround(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maternityIndicator");
		if(fldEl != null)
		{	
    		obj.setMaternityIndicator(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "taxonomyMap"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ServiceName = "serviceName";
		public static final String ServiceDescription = "serviceDescription";
		public static final String ServiceCategory = "serviceCategory";
		public static final String Specialty = "specialty";
		public static final String IsActive = "isActive";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String UpperName = "upperName";
		public static final String AlternateServiceCode = "alternateServiceCode";
		public static final String CanBeScheduled = "canBeScheduled";
		public static final String TurnaroundMeasure = "turnaroundMeasure";
		public static final String ExpectedTurnaround = "expectedTurnaround";
		public static final String MaternityIndicator = "maternityIndicator";
	}
}

