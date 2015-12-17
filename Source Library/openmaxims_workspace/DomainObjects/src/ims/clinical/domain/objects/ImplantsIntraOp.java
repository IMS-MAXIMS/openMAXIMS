//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ImplantsIntraOp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100146;
	private static final long serialVersionUID = 1072100146L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Implant Description */
	private String implantDescription;
	/** Manufacturer */
	private String manufacturer;
	/** Catalogue Number */
	private String catalogueNumber;
	/** Lot number */
	private String lotNumber;
	/** Serial Number */
	private String serialNumber;
	/** Quantity */
	private Integer quantity;
	/** Size */
	private String size;
	/** Expiry Date */
	private java.util.Date expiryDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ImplantsIntraOp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ImplantsIntraOp ()
    {
    	super();
    }
    public ImplantsIntraOp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.ImplantsIntraOp.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public String getImplantDescription() {
		return implantDescription;
	}
	public void setImplantDescription(String implantDescription) {
		if ( null != implantDescription && implantDescription.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for implantDescription. Tried to set value: "+
				implantDescription);
		}
		this.implantDescription = implantDescription;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		if ( null != manufacturer && manufacturer.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for manufacturer. Tried to set value: "+
				manufacturer);
		}
		this.manufacturer = manufacturer;
	}

	public String getCatalogueNumber() {
		return catalogueNumber;
	}
	public void setCatalogueNumber(String catalogueNumber) {
		if ( null != catalogueNumber && catalogueNumber.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for catalogueNumber. Tried to set value: "+
				catalogueNumber);
		}
		this.catalogueNumber = catalogueNumber;
	}

	public String getLotNumber() {
		return lotNumber;
	}
	public void setLotNumber(String lotNumber) {
		if ( null != lotNumber && lotNumber.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for lotNumber. Tried to set value: "+
				lotNumber);
		}
		this.lotNumber = lotNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		if ( null != serialNumber && serialNumber.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for serialNumber. Tried to set value: "+
				serialNumber);
		}
		this.serialNumber = serialNumber;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		if ( null != size && size.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for size. Tried to set value: "+
				size);
		}
		this.size = size;
	}

	public java.util.Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(java.util.Date expiryDate) {
		this.expiryDate = expiryDate;
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
		
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*implantDescription* :");
		auditStr.append(implantDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*manufacturer* :");
		auditStr.append(manufacturer);
	    auditStr.append("; ");
		auditStr.append("\r\n*catalogueNumber* :");
		auditStr.append(catalogueNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*lotNumber* :");
		auditStr.append(lotNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*serialNumber* :");
		auditStr.append(serialNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*quantity* :");
		auditStr.append(quantity);
	    auditStr.append("; ");
		auditStr.append("\r\n*size* :");
		auditStr.append(size);
	    auditStr.append("; ");
		auditStr.append("\r\n*expiryDate* :");
		auditStr.append(expiryDate);
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
		
		String keyClassName = "ImplantsIntraOp";
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
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.getImplantDescription() != null)
		{
			sb.append("<implantDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImplantDescription().toString()));
			sb.append("</implantDescription>");		
		}
		if (this.getManufacturer() != null)
		{
			sb.append("<manufacturer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getManufacturer().toString()));
			sb.append("</manufacturer>");		
		}
		if (this.getCatalogueNumber() != null)
		{
			sb.append("<catalogueNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCatalogueNumber().toString()));
			sb.append("</catalogueNumber>");		
		}
		if (this.getLotNumber() != null)
		{
			sb.append("<lotNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLotNumber().toString()));
			sb.append("</lotNumber>");		
		}
		if (this.getSerialNumber() != null)
		{
			sb.append("<serialNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSerialNumber().toString()));
			sb.append("</serialNumber>");		
		}
		if (this.getQuantity() != null)
		{
			sb.append("<quantity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getQuantity().toString()));
			sb.append("</quantity>");		
		}
		if (this.getSize() != null)
		{
			sb.append("<size>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSize().toString()));
			sb.append("</size>");		
		}
		if (this.getExpiryDate() != null)
		{
			sb.append("<expiryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getExpiryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expiryDate>");		
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
			ImplantsIntraOp domainObject = getImplantsIntraOpfromXML(itemEl, factory, domMap);

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
			ImplantsIntraOp domainObject = getImplantsIntraOpfromXML(itemEl, factory, domMap);

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
		
	public static ImplantsIntraOp getImplantsIntraOpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getImplantsIntraOpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ImplantsIntraOp getImplantsIntraOpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ImplantsIntraOp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ImplantsIntraOp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ImplantsIntraOp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ImplantsIntraOp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ImplantsIntraOp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ImplantsIntraOp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ImplantsIntraOp)factory.getImportedDomainObject(ImplantsIntraOp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ImplantsIntraOp();
		}
		String keyClassName = "ImplantsIntraOp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ImplantsIntraOp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ImplantsIntraOp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("implantDescription");
		if(fldEl != null)
		{	
    		obj.setImplantDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("manufacturer");
		if(fldEl != null)
		{	
    		obj.setManufacturer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("catalogueNumber");
		if(fldEl != null)
		{	
    		obj.setCatalogueNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lotNumber");
		if(fldEl != null)
		{	
    		obj.setLotNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serialNumber");
		if(fldEl != null)
		{	
    		obj.setSerialNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("quantity");
		if(fldEl != null)
		{	
    		obj.setQuantity(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("size");
		if(fldEl != null)
		{	
    		obj.setSize(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expiryDate");
		if(fldEl != null)
		{	
    		obj.setExpiryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String ImplantDescription = "implantDescription";
		public static final String Manufacturer = "manufacturer";
		public static final String CatalogueNumber = "catalogueNumber";
		public static final String LotNumber = "lotNumber";
		public static final String SerialNumber = "serialNumber";
		public static final String Quantity = "quantity";
		public static final String Size = "size";
		public static final String ExpiryDate = "expiryDate";
	}
}

