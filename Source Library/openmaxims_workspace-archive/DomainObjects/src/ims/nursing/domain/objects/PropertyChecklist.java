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
package ims.nursing.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PropertyChecklist extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1009100012;
	private static final long serialVersionUID = 1009100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** MovementType */
	private ims.domain.lookups.LookupInstance movementType;
	/** Ward */
	private ims.core.resource.place.domain.objects.Location ward;
	/** AuthoringHCP */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** AuthoringDateTime */
	private java.util.Date authoringDateTime;
	/** Destination Ward */
	private ims.core.resource.place.domain.objects.Location destinationWard;
	/** ConfirmingHCP */
	private ims.core.resource.people.domain.objects.Hcp confirmingHCP;
	/** ConfirmingDateTime */
	private java.util.Date confirmingDateTime;
	/** ItemsRetained
	  * Collection of ims.nursing.domain.objects.PropertyItem.
	  */
	private java.util.List itemsRetained;
	/** Valuables
	  * Collection of ims.nursing.domain.objects.Valuable.
	  */
	private java.util.List valuables;
	/** Other Valuables */
	private String otherValuables;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PropertyChecklist (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PropertyChecklist ()
    {
    	super();
    }
    public PropertyChecklist (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.domain.objects.PropertyChecklist.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getMovementType() {
		return movementType;
	}
	public void setMovementType(ims.domain.lookups.LookupInstance movementType) {
		this.movementType = movementType;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.place.domain.objects.Location getDestinationWard() {
		return destinationWard;
	}
	public void setDestinationWard(ims.core.resource.place.domain.objects.Location destinationWard) {
		this.destinationWard = destinationWard;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmingHCP() {
		return confirmingHCP;
	}
	public void setConfirmingHCP(ims.core.resource.people.domain.objects.Hcp confirmingHCP) {
		this.confirmingHCP = confirmingHCP;
	}

	public java.util.Date getConfirmingDateTime() {
		return confirmingDateTime;
	}
	public void setConfirmingDateTime(java.util.Date confirmingDateTime) {
		this.confirmingDateTime = confirmingDateTime;
	}

	public java.util.List getItemsRetained() {
		if ( null == itemsRetained ) {
			itemsRetained = new java.util.ArrayList();
		}
		return itemsRetained;
	}
	public void setItemsRetained(java.util.List paramValue) {
		this.itemsRetained = paramValue;
	}

	public java.util.List getValuables() {
		if ( null == valuables ) {
			valuables = new java.util.ArrayList();
		}
		return valuables;
	}
	public void setValuables(java.util.List paramValue) {
		this.valuables = paramValue;
	}

	public String getOtherValuables() {
		return otherValuables;
	}
	public void setOtherValuables(String otherValuables) {
		if ( null != otherValuables && otherValuables.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherValuables. Tried to set value: "+
				otherValuables);
		}
		this.otherValuables = otherValuables;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*movementType* :");
		if (movementType != null)
			auditStr.append(movementType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*destinationWard* :");
		if (destinationWard != null)
		{
			auditStr.append(toShortClassName(destinationWard));
				
		    auditStr.append(destinationWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmingHCP* :");
		if (confirmingHCP != null)
		{
			auditStr.append(toShortClassName(confirmingHCP));
				
		    auditStr.append(confirmingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmingDateTime* :");
		auditStr.append(confirmingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*itemsRetained* :");
		if (itemsRetained != null)
		{
		int i9=0;
		for (i9=0; i9<itemsRetained.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.nursing.domain.objects.PropertyItem obj = (ims.nursing.domain.objects.PropertyItem)itemsRetained.get(i9);
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
		auditStr.append("\r\n*valuables* :");
		if (valuables != null)
		{
		int i10=0;
		for (i10=0; i10<valuables.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.nursing.domain.objects.Valuable obj = (ims.nursing.domain.objects.Valuable)valuables.get(i10);
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
		auditStr.append("\r\n*otherValuables* :");
		auditStr.append(otherValuables);
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
		
		String keyClassName = "PropertyChecklist";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getMovementType() != null)
		{
			sb.append("<movementType>");
			sb.append(this.getMovementType().toXMLString()); 
			sb.append("</movementType>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getDestinationWard() != null)
		{
			sb.append("<destinationWard>");
			sb.append(this.getDestinationWard().toXMLString(domMap)); 	
			sb.append("</destinationWard>");		
		}
		if (this.getConfirmingHCP() != null)
		{
			sb.append("<confirmingHCP>");
			sb.append(this.getConfirmingHCP().toXMLString(domMap)); 	
			sb.append("</confirmingHCP>");		
		}
		if (this.getConfirmingDateTime() != null)
		{
			sb.append("<confirmingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmingDateTime>");		
		}
		if (this.getItemsRetained() != null)
		{
			if (this.getItemsRetained().size() > 0 )
			{
			sb.append("<itemsRetained>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getItemsRetained(), domMap));
			sb.append("</itemsRetained>");		
			}
		}
		if (this.getValuables() != null)
		{
			if (this.getValuables().size() > 0 )
			{
			sb.append("<valuables>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getValuables(), domMap));
			sb.append("</valuables>");		
			}
		}
		if (this.getOtherValuables() != null)
		{
			sb.append("<otherValuables>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherValuables().toString()));
			sb.append("</otherValuables>");		
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
			PropertyChecklist domainObject = getPropertyChecklistfromXML(itemEl, factory, domMap);

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
			PropertyChecklist domainObject = getPropertyChecklistfromXML(itemEl, factory, domMap);

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
		
	public static PropertyChecklist getPropertyChecklistfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPropertyChecklistfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PropertyChecklist getPropertyChecklistfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PropertyChecklist.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PropertyChecklist.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PropertyChecklist class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PropertyChecklist)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PropertyChecklist.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PropertyChecklist ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PropertyChecklist)factory.getImportedDomainObject(PropertyChecklist.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PropertyChecklist();
		}
		String keyClassName = "PropertyChecklist";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PropertyChecklist)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PropertyChecklist obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("movementType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMovementType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("destinationWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDestinationWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmingDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("itemsRetained");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setItemsRetained(ims.nursing.domain.objects.PropertyItem.fromListXMLString(fldEl, factory, obj.getItemsRetained(), domMap));
		}
		fldEl = el.element("valuables");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setValuables(ims.nursing.domain.objects.Valuable.fromListXMLString(fldEl, factory, obj.getValuables(), domMap));
		}
		fldEl = el.element("otherValuables");
		if(fldEl != null)
		{	
    		obj.setOtherValuables(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "itemsRetained"
		, "valuables"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String MovementType = "movementType";
		public static final String Ward = "ward";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String DestinationWard = "destinationWard";
		public static final String ConfirmingHCP = "confirmingHCP";
		public static final String ConfirmingDateTime = "confirmingDateTime";
		public static final String ItemsRetained = "itemsRetained";
		public static final String Valuables = "valuables";
		public static final String OtherValuables = "otherValuables";
	}
}

