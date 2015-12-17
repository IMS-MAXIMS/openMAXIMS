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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class OrderSpecimenContainer extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100014;
	private static final long serialVersionUID = 1070100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Container */
	private ims.ocrr.configuration.domain.objects.PathSpecimenContainer container;
	/** Number of Containers */
	private Integer containerQuantity;
	/** Investigation Names */
	private String investigationNames;
	/** Container Label Suffix */
	private String labelSuffix;
	/** Order Investigation
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.List orderInvestigation;
	/** Minimum Required Volume for Container */
	private java.lang.Float requiredVolume;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderSpecimenContainer (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderSpecimenContainer ()
    {
    	super();
    }
    public OrderSpecimenContainer (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer.class;
	}


	public ims.ocrr.configuration.domain.objects.PathSpecimenContainer getContainer() {
		return container;
	}
	public void setContainer(ims.ocrr.configuration.domain.objects.PathSpecimenContainer container) {
		this.container = container;
	}

	public Integer getContainerQuantity() {
		return containerQuantity;
	}
	public void setContainerQuantity(Integer containerQuantity) {
		this.containerQuantity = containerQuantity;
	}

	public String getInvestigationNames() {
		return investigationNames;
	}
	public void setInvestigationNames(String investigationNames) {
		if ( null != investigationNames && investigationNames.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for investigationNames. Tried to set value: "+
				investigationNames);
		}
		this.investigationNames = investigationNames;
	}

	public String getLabelSuffix() {
		return labelSuffix;
	}
	public void setLabelSuffix(String labelSuffix) {
		if ( null != labelSuffix && labelSuffix.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for labelSuffix. Tried to set value: "+
				labelSuffix);
		}
		this.labelSuffix = labelSuffix;
	}

	public java.util.List getOrderInvestigation() {
		if ( null == orderInvestigation ) {
			orderInvestigation = new java.util.ArrayList();
		}
		return orderInvestigation;
	}
	public void setOrderInvestigation(java.util.List paramValue) {
		this.orderInvestigation = paramValue;
	}

	public java.lang.Float getRequiredVolume() {
		return requiredVolume;
	}
	public void setRequiredVolume(java.lang.Float requiredVolume) {
		this.requiredVolume = requiredVolume;
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
		
		auditStr.append("\r\n*container* :");
		if (container != null)
		{
			auditStr.append(toShortClassName(container));
				
		    auditStr.append(container.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*containerQuantity* :");
		auditStr.append(containerQuantity);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationNames* :");
		auditStr.append(investigationNames);
	    auditStr.append("; ");
		auditStr.append("\r\n*labelSuffix* :");
		auditStr.append(labelSuffix);
	    auditStr.append("; ");
		auditStr.append("\r\n*orderInvestigation* :");
		if (orderInvestigation != null)
		{
		int i5=0;
		for (i5=0; i5<orderInvestigation.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)orderInvestigation.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiredVolume* :");
		auditStr.append(requiredVolume);
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
		
		String keyClassName = "OrderSpecimenContainer";
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
		if (this.getContainer() != null)
		{
			sb.append("<container>");
			sb.append(this.getContainer().toXMLString(domMap)); 	
			sb.append("</container>");		
		}
		if (this.getContainerQuantity() != null)
		{
			sb.append("<containerQuantity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContainerQuantity().toString()));
			sb.append("</containerQuantity>");		
		}
		if (this.getInvestigationNames() != null)
		{
			sb.append("<investigationNames>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvestigationNames().toString()));
			sb.append("</investigationNames>");		
		}
		if (this.getLabelSuffix() != null)
		{
			sb.append("<labelSuffix>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLabelSuffix().toString()));
			sb.append("</labelSuffix>");		
		}
		if (this.getOrderInvestigation() != null)
		{
			if (this.getOrderInvestigation().size() > 0 )
			{
			sb.append("<orderInvestigation>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOrderInvestigation(), domMap));
			sb.append("</orderInvestigation>");		
			}
		}
		if (this.getRequiredVolume() != null)
		{
			sb.append("<requiredVolume>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRequiredVolume().toString()));
			sb.append("</requiredVolume>");		
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
			OrderSpecimenContainer domainObject = getOrderSpecimenContainerfromXML(itemEl, factory, domMap);

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
			OrderSpecimenContainer domainObject = getOrderSpecimenContainerfromXML(itemEl, factory, domMap);

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
		
	public static OrderSpecimenContainer getOrderSpecimenContainerfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderSpecimenContainerfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderSpecimenContainer getOrderSpecimenContainerfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderSpecimenContainer.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderSpecimenContainer.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderSpecimenContainer class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderSpecimenContainer)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderSpecimenContainer.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderSpecimenContainer ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderSpecimenContainer)factory.getImportedDomainObject(OrderSpecimenContainer.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderSpecimenContainer();
		}
		String keyClassName = "OrderSpecimenContainer";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderSpecimenContainer)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderSpecimenContainer obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("container");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContainer(ims.ocrr.configuration.domain.objects.PathSpecimenContainer.getPathSpecimenContainerfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("containerQuantity");
		if(fldEl != null)
		{	
    		obj.setContainerQuantity(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationNames");
		if(fldEl != null)
		{	
    		obj.setInvestigationNames(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("labelSuffix");
		if(fldEl != null)
		{	
    		obj.setLabelSuffix(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orderInvestigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOrderInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromListXMLString(fldEl, factory, obj.getOrderInvestigation(), domMap));
		}
		fldEl = el.element("requiredVolume");
		if(fldEl != null)
		{	
    		obj.setRequiredVolume(new java.lang.Float(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "orderInvestigation"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Container = "container";
		public static final String ContainerQuantity = "containerQuantity";
		public static final String InvestigationNames = "investigationNames";
		public static final String LabelSuffix = "labelSuffix";
		public static final String OrderInvestigation = "orderInvestigation";
		public static final String RequiredVolume = "requiredVolume";
	}
}

