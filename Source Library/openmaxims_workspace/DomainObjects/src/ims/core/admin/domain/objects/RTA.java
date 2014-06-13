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
package ims.core.admin.domain.objects;

/**
 * RTA - Road Traffic Accident
 * @author Neil McAnaspie
 * Generated.
 */


public class RTA extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100000;
	private static final long serialVersionUID = 1086100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** RTA Patient Type */
	private ims.domain.lookups.LookupInstance rTAType;
	/** Protection Device */
	private ims.domain.lookups.LookupInstance protectionDevice;
	/** Is the Driver the owner of the Car */
	private Boolean isDriverOwner;
	/** Driver Name */
	private ims.core.generic.domain.objects.PersonName driverName;
	/** Driver Address */
	private ims.core.generic.domain.objects.Address driverAddress;
	/** Notes */
	private String notes;
	/** Police Involved */
	private Boolean policeInvolved;
	/** Police ID */
	private String policeID;
	/** PoliceStation */
	private ims.domain.lookups.LookupInstance policeStation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RTA (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RTA ()
    {
    	super();
    }
    public RTA (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.RTA.class;
	}


	public ims.domain.lookups.LookupInstance getRTAType() {
		return rTAType;
	}
	public void setRTAType(ims.domain.lookups.LookupInstance rTAType) {
		this.rTAType = rTAType;
	}

	public ims.domain.lookups.LookupInstance getProtectionDevice() {
		return protectionDevice;
	}
	public void setProtectionDevice(ims.domain.lookups.LookupInstance protectionDevice) {
		this.protectionDevice = protectionDevice;
	}

	public Boolean isIsDriverOwner() {
		return isDriverOwner;
	}
	public void setIsDriverOwner(Boolean isDriverOwner) {
		this.isDriverOwner = isDriverOwner;
	}

	public ims.core.generic.domain.objects.PersonName getDriverName() {
		return driverName;
	}
	public void setDriverName(ims.core.generic.domain.objects.PersonName driverName) {
		this.driverName = driverName;
	}

	public ims.core.generic.domain.objects.Address getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(ims.core.generic.domain.objects.Address driverAddress) {
		this.driverAddress = driverAddress;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public Boolean isPoliceInvolved() {
		return policeInvolved;
	}
	public void setPoliceInvolved(Boolean policeInvolved) {
		this.policeInvolved = policeInvolved;
	}

	public String getPoliceID() {
		return policeID;
	}
	public void setPoliceID(String policeID) {
		if ( null != policeID && policeID.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for policeID. Tried to set value: "+
				policeID);
		}
		this.policeID = policeID;
	}

	public ims.domain.lookups.LookupInstance getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(ims.domain.lookups.LookupInstance policeStation) {
		this.policeStation = policeStation;
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
		
		auditStr.append("\r\n*rTAType* :");
		if (rTAType != null)
			auditStr.append(rTAType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*protectionDevice* :");
		if (protectionDevice != null)
			auditStr.append(protectionDevice.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isDriverOwner* :");
		auditStr.append(isDriverOwner);
	    auditStr.append("; ");
		auditStr.append("\r\n*driverName* :");
		if (driverName != null)
		{
			auditStr.append(toShortClassName(driverName));
				
		    auditStr.append(driverName.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*driverAddress* :");
		if (driverAddress != null)
		{
			auditStr.append(toShortClassName(driverAddress));
				
		    auditStr.append(driverAddress.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*policeInvolved* :");
		auditStr.append(policeInvolved);
	    auditStr.append("; ");
		auditStr.append("\r\n*policeID* :");
		auditStr.append(policeID);
	    auditStr.append("; ");
		auditStr.append("\r\n*policeStation* :");
		if (policeStation != null)
			auditStr.append(policeStation.getText());
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
		
		String keyClassName = "RTA";
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
		if (this.getRTAType() != null)
		{
			sb.append("<rTAType>");
			sb.append(this.getRTAType().toXMLString()); 
			sb.append("</rTAType>");		
		}
		if (this.getProtectionDevice() != null)
		{
			sb.append("<protectionDevice>");
			sb.append(this.getProtectionDevice().toXMLString()); 
			sb.append("</protectionDevice>");		
		}
		if (this.isIsDriverOwner() != null)
		{
			sb.append("<isDriverOwner>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDriverOwner().toString()));
			sb.append("</isDriverOwner>");		
		}
		if (this.getDriverName() != null)
		{
			sb.append("<driverName>");
			sb.append(this.getDriverName().toXMLString(domMap)); 	
			sb.append("</driverName>");		
		}
		if (this.getDriverAddress() != null)
		{
			sb.append("<driverAddress>");
			sb.append(this.getDriverAddress().toXMLString(domMap)); 	
			sb.append("</driverAddress>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.isPoliceInvolved() != null)
		{
			sb.append("<policeInvolved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPoliceInvolved().toString()));
			sb.append("</policeInvolved>");		
		}
		if (this.getPoliceID() != null)
		{
			sb.append("<policeID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPoliceID().toString()));
			sb.append("</policeID>");		
		}
		if (this.getPoliceStation() != null)
		{
			sb.append("<policeStation>");
			sb.append(this.getPoliceStation().toXMLString()); 
			sb.append("</policeStation>");		
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
			RTA domainObject = getRTAfromXML(itemEl, factory, domMap);

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
			RTA domainObject = getRTAfromXML(itemEl, factory, domMap);

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
		
	public static RTA getRTAfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRTAfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RTA getRTAfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RTA.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RTA.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RTA class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RTA)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RTA.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RTA ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RTA)factory.getImportedDomainObject(RTA.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RTA();
		}
		String keyClassName = "RTA";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RTA)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RTA obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("rTAType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRTAType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("protectionDevice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProtectionDevice(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isDriverOwner");
		if(fldEl != null)
		{	
    		obj.setIsDriverOwner(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("driverName");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDriverName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("driverAddress");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDriverAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("policeInvolved");
		if(fldEl != null)
		{	
    		obj.setPoliceInvolved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("policeID");
		if(fldEl != null)
		{	
    		obj.setPoliceID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("policeStation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPoliceStation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String RTAType = "rTAType";
		public static final String ProtectionDevice = "protectionDevice";
		public static final String IsDriverOwner = "isDriverOwner";
		public static final String DriverName = "driverName";
		public static final String DriverAddress = "driverAddress";
		public static final String Notes = "notes";
		public static final String PoliceInvolved = "policeInvolved";
		public static final String PoliceID = "policeID";
		public static final String PoliceStation = "policeStation";
	}
}

