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


public class PathSpecimenContainer extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1058100007;
	private static final long serialVersionUID = 1058100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Manufacturer */
	private ims.domain.lookups.LookupInstance manufacturer;
	/** Manufacturer ref No */
	private String manufRefNo;
	/** Colour */
	private ims.domain.lookups.LookupInstance colour;
	/** Size */
	private ims.domain.lookups.LookupInstance size;
	/** Label */
	private ims.ocrr.orderingresults.domain.objects.Label label;
	/** Volume (mls) */
	private java.lang.Float volume;
	/** VolumeUnits */
	private ims.domain.lookups.LookupInstance volumeUnits;
	/** Material */
	private ims.domain.lookups.LookupInstance material;
	/** Additive
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List additive;
	/** Notes */
	private String notes;
	/** isActive */
	private Boolean isActive;
	private Integer pathSpecimenOrder;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PathSpecimenContainer (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PathSpecimenContainer ()
    {
    	super();
    }
    public PathSpecimenContainer (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.PathSpecimenContainer.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public ims.domain.lookups.LookupInstance getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(ims.domain.lookups.LookupInstance manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufRefNo() {
		return manufRefNo;
	}
	public void setManufRefNo(String manufRefNo) {
		if ( null != manufRefNo && manufRefNo.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for manufRefNo. Tried to set value: "+
				manufRefNo);
		}
		this.manufRefNo = manufRefNo;
	}

	public ims.domain.lookups.LookupInstance getColour() {
		return colour;
	}
	public void setColour(ims.domain.lookups.LookupInstance colour) {
		this.colour = colour;
	}

	public ims.domain.lookups.LookupInstance getSize() {
		return size;
	}
	public void setSize(ims.domain.lookups.LookupInstance size) {
		this.size = size;
	}

	public ims.ocrr.orderingresults.domain.objects.Label getLabel() {
		return label;
	}
	public void setLabel(ims.ocrr.orderingresults.domain.objects.Label label) {
		this.label = label;
	}

	public java.lang.Float getVolume() {
		return volume;
	}
	public void setVolume(java.lang.Float volume) {
		this.volume = volume;
	}

	public ims.domain.lookups.LookupInstance getVolumeUnits() {
		return volumeUnits;
	}
	public void setVolumeUnits(ims.domain.lookups.LookupInstance volumeUnits) {
		this.volumeUnits = volumeUnits;
	}

	public ims.domain.lookups.LookupInstance getMaterial() {
		return material;
	}
	public void setMaterial(ims.domain.lookups.LookupInstance material) {
		this.material = material;
	}

	public java.util.List getAdditive() {
		if ( null == additive ) {
			additive = new java.util.ArrayList();
		}
		return additive;
	}
	public void setAdditive(java.util.List paramValue) {
		this.additive = paramValue;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getPathSpecimenOrder() {
		return pathSpecimenOrder;
	}
	public void setPathSpecimenOrder(Integer pathSpecimenOrder) {
		this.pathSpecimenOrder = pathSpecimenOrder;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*manufacturer* :");
		if (manufacturer != null)
			auditStr.append(manufacturer.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*manufRefNo* :");
		auditStr.append(manufRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*colour* :");
		if (colour != null)
			auditStr.append(colour.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*size* :");
		if (size != null)
			auditStr.append(size.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*label* :");
		if (label != null)
		{
			auditStr.append(toShortClassName(label));
				
		    auditStr.append(label.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*volume* :");
		auditStr.append(volume);
	    auditStr.append("; ");
		auditStr.append("\r\n*volumeUnits* :");
		if (volumeUnits != null)
			auditStr.append(volumeUnits.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*material* :");
		if (material != null)
			auditStr.append(material.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*additive* :");
		if (additive != null)
		{
			java.util.Iterator it10 = additive.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it10.next();
			auditStr.append(obj.getText());
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathSpecimenOrder* :");
		auditStr.append(pathSpecimenOrder);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i14=0;
		for (i14=0; i14<taxonomyMap.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
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
		
		String keyClassName = "PathSpecimenContainer";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getManufacturer() != null)
		{
			sb.append("<manufacturer>");
			sb.append(this.getManufacturer().toXMLString()); 
			sb.append("</manufacturer>");		
		}
		if (this.getManufRefNo() != null)
		{
			sb.append("<manufRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getManufRefNo().toString()));
			sb.append("</manufRefNo>");		
		}
		if (this.getColour() != null)
		{
			sb.append("<colour>");
			sb.append(this.getColour().toXMLString()); 
			sb.append("</colour>");		
		}
		if (this.getSize() != null)
		{
			sb.append("<size>");
			sb.append(this.getSize().toXMLString()); 
			sb.append("</size>");		
		}
		if (this.getLabel() != null)
		{
			sb.append("<label>");
			sb.append(this.getLabel().toXMLString(domMap)); 	
			sb.append("</label>");		
		}
		if (this.getVolume() != null)
		{
			sb.append("<volume>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVolume().toString()));
			sb.append("</volume>");		
		}
		if (this.getVolumeUnits() != null)
		{
			sb.append("<volumeUnits>");
			sb.append(this.getVolumeUnits().toXMLString()); 
			sb.append("</volumeUnits>");		
		}
		if (this.getMaterial() != null)
		{
			sb.append("<material>");
			sb.append(this.getMaterial().toXMLString()); 
			sb.append("</material>");		
		}
		if (this.getAdditive() != null)
		{
			if (this.getAdditive().size() > 0 )
			{
			sb.append("<additive>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAdditive())); 
			sb.append("</additive>");		
			}
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getPathSpecimenOrder() != null)
		{
			sb.append("<pathSpecimenOrder>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPathSpecimenOrder().toString()));
			sb.append("</pathSpecimenOrder>");		
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
			PathSpecimenContainer domainObject = getPathSpecimenContainerfromXML(itemEl, factory, domMap);

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
			PathSpecimenContainer domainObject = getPathSpecimenContainerfromXML(itemEl, factory, domMap);

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
		
	public static PathSpecimenContainer getPathSpecimenContainerfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPathSpecimenContainerfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PathSpecimenContainer getPathSpecimenContainerfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PathSpecimenContainer.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PathSpecimenContainer.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PathSpecimenContainer class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PathSpecimenContainer)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PathSpecimenContainer.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PathSpecimenContainer ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PathSpecimenContainer)factory.getImportedDomainObject(PathSpecimenContainer.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PathSpecimenContainer();
		}
		String keyClassName = "PathSpecimenContainer";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PathSpecimenContainer)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PathSpecimenContainer obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("manufacturer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setManufacturer(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("manufRefNo");
		if(fldEl != null)
		{	
    		obj.setManufRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("colour");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setColour(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("size");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSize(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("label");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLabel(ims.ocrr.orderingresults.domain.objects.Label.getLabelfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("volume");
		if(fldEl != null)
		{	
    		obj.setVolume(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("volumeUnits");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVolumeUnits(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("material");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMaterial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("additive");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdditive(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAdditive())); 
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pathSpecimenOrder");
		if(fldEl != null)
		{	
    		obj.setPathSpecimenOrder(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "additive"
		, "taxonomyMap"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Manufacturer = "manufacturer";
		public static final String ManufRefNo = "manufRefNo";
		public static final String Colour = "colour";
		public static final String Size = "size";
		public static final String Label = "label";
		public static final String Volume = "volume";
		public static final String VolumeUnits = "volumeUnits";
		public static final String Material = "material";
		public static final String Additive = "additive";
		public static final String Notes = "notes";
		public static final String IsActive = "isActive";
		public static final String PathSpecimenOrder = "pathSpecimenOrder";
		public static final String TaxonomyMap = "taxonomyMap";
	}
}

