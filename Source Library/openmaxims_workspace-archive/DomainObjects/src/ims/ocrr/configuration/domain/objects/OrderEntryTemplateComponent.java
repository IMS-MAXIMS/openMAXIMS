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
package ims.ocrr.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OrderEntryTemplateComponent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100006;
	private static final long serialVersionUID = 1061100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Sequence */
	private Integer sequence;
	/** Investigation */
	private ims.ocrr.configuration.domain.objects.Investigation investigation;
	/** OrderSet */
	private ims.ocrr.configuration.domain.objects.OrderSet orderSet;
	/** Divider */
	private ims.domain.lookups.LookupInstance divider;
	/** DividerIsBold */
	private Boolean dividerIsBold;
	/** DividerText */
	private String dividerText;
	/** DividerColour */
	private ims.framework.utils.Color dividerColour;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderEntryTemplateComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderEntryTemplateComponent ()
    {
    	super();
    }
    public OrderEntryTemplateComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent.class;
	}


	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public ims.ocrr.configuration.domain.objects.Investigation getInvestigation() {
		return investigation;
	}
	public void setInvestigation(ims.ocrr.configuration.domain.objects.Investigation investigation) {
		this.investigation = investigation;
	}

	public ims.ocrr.configuration.domain.objects.OrderSet getOrderSet() {
		return orderSet;
	}
	public void setOrderSet(ims.ocrr.configuration.domain.objects.OrderSet orderSet) {
		this.orderSet = orderSet;
	}

	public ims.domain.lookups.LookupInstance getDivider() {
		return divider;
	}
	public void setDivider(ims.domain.lookups.LookupInstance divider) {
		this.divider = divider;
	}

	public Boolean isDividerIsBold() {
		return dividerIsBold;
	}
	public void setDividerIsBold(Boolean dividerIsBold) {
		this.dividerIsBold = dividerIsBold;
	}

	public String getDividerText() {
		return dividerText;
	}
	public void setDividerText(String dividerText) {
		if ( null != dividerText && dividerText.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dividerText. Tried to set value: "+
				dividerText);
		}
		this.dividerText = dividerText;
	}

	public ims.framework.utils.Color getDividerColour() {
		return dividerColour;
	}
	public void setDividerColour(ims.framework.utils.Color dividerColour) {
		this.dividerColour = dividerColour;
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
		
		auditStr.append("\r\n*sequence* :");
		auditStr.append(sequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigation* :");
		if (investigation != null)
		{
			auditStr.append(toShortClassName(investigation));
				
		    auditStr.append(investigation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderSet* :");
		if (orderSet != null)
		{
			auditStr.append(toShortClassName(orderSet));
				
		    auditStr.append(orderSet.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*divider* :");
		if (divider != null)
			auditStr.append(divider.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dividerIsBold* :");
		auditStr.append(dividerIsBold);
	    auditStr.append("; ");
		auditStr.append("\r\n*dividerText* :");
		auditStr.append(dividerText);
	    auditStr.append("; ");
		auditStr.append("\r\n*dividerColour* :");
		auditStr.append(dividerColour);
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
		
		String keyClassName = "OrderEntryTemplateComponent";
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
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequence().toString()));
			sb.append("</sequence>");		
		}
		if (this.getInvestigation() != null)
		{
			sb.append("<investigation>");
			sb.append(this.getInvestigation().toXMLString(domMap)); 	
			sb.append("</investigation>");		
		}
		if (this.getOrderSet() != null)
		{
			sb.append("<orderSet>");
			sb.append(this.getOrderSet().toXMLString(domMap)); 	
			sb.append("</orderSet>");		
		}
		if (this.getDivider() != null)
		{
			sb.append("<divider>");
			sb.append(this.getDivider().toXMLString()); 
			sb.append("</divider>");		
		}
		if (this.isDividerIsBold() != null)
		{
			sb.append("<dividerIsBold>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDividerIsBold().toString()));
			sb.append("</dividerIsBold>");		
		}
		if (this.getDividerText() != null)
		{
			sb.append("<dividerText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDividerText().toString()));
			sb.append("</dividerText>");		
		}
		if (this.getDividerColour() != null)
		{
			sb.append("<dividerColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDividerColour().toString()));
			sb.append("</dividerColour>");		
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
			OrderEntryTemplateComponent domainObject = getOrderEntryTemplateComponentfromXML(itemEl, factory, domMap);

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
			OrderEntryTemplateComponent domainObject = getOrderEntryTemplateComponentfromXML(itemEl, factory, domMap);

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
		
	public static OrderEntryTemplateComponent getOrderEntryTemplateComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderEntryTemplateComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderEntryTemplateComponent getOrderEntryTemplateComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderEntryTemplateComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderEntryTemplateComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderEntryTemplateComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderEntryTemplateComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderEntryTemplateComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderEntryTemplateComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderEntryTemplateComponent)factory.getImportedDomainObject(OrderEntryTemplateComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderEntryTemplateComponent();
		}
		String keyClassName = "OrderEntryTemplateComponent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderEntryTemplateComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderEntryTemplateComponent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("sequence");
		if(fldEl != null)
		{	
    		obj.setSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInvestigation(ims.ocrr.configuration.domain.objects.Investigation.getInvestigationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("orderSet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderSet(ims.ocrr.configuration.domain.objects.OrderSet.getOrderSetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("divider");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDivider(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dividerIsBold");
		if(fldEl != null)
		{	
    		obj.setDividerIsBold(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dividerText");
		if(fldEl != null)
		{	
    		obj.setDividerText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dividerColour");
		if(fldEl != null)
		{	
    		obj.setDividerColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
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
		public static final String Sequence = "sequence";
		public static final String Investigation = "investigation";
		public static final String OrderSet = "orderSet";
		public static final String Divider = "divider";
		public static final String DividerIsBold = "dividerIsBold";
		public static final String DividerText = "dividerText";
		public static final String DividerColour = "dividerColour";
	}
}

