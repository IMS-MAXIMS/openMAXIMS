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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DirectoryOfServiceSessionSlot extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100003;
	private static final long serialVersionUID = 1090100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.scheduling.domain.objects.DirectoryofService directoryOfService;
	private ims.scheduling.domain.objects.Session_Slot slot;
	private String uSRN;
	private String uBRN;
	/** isPublished */
	private Boolean isPublished;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DirectoryOfServiceSessionSlot (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DirectoryOfServiceSessionSlot ()
    {
    	super();
    }
    public DirectoryOfServiceSessionSlot (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot.class;
	}


	public ims.scheduling.domain.objects.DirectoryofService getDirectoryOfService() {
		return directoryOfService;
	}
	public void setDirectoryOfService(ims.scheduling.domain.objects.DirectoryofService directoryOfService) {
		this.directoryOfService = directoryOfService;
	}

	public ims.scheduling.domain.objects.Session_Slot getSlot() {
		return slot;
	}
	public void setSlot(ims.scheduling.domain.objects.Session_Slot slot) {
		this.slot = slot;
	}

	public String getUSRN() {
		return uSRN;
	}
	public void setUSRN(String uSRN) {
		if ( null != uSRN && uSRN.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uSRN. Tried to set value: "+
				uSRN);
		}
		this.uSRN = uSRN;
	}

	public String getUBRN() {
		return uBRN;
	}
	public void setUBRN(String uBRN) {
		if ( null != uBRN && uBRN.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uBRN. Tried to set value: "+
				uBRN);
		}
		this.uBRN = uBRN;
	}

	public Boolean isIsPublished() {
		return isPublished;
	}
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
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
		
		auditStr.append("\r\n*directoryOfService* :");
		if (directoryOfService != null)
		{
			auditStr.append(toShortClassName(directoryOfService));
				
		    auditStr.append(directoryOfService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*slot* :");
		if (slot != null)
		{
			auditStr.append(toShortClassName(slot));
				
		    auditStr.append(slot.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*uSRN* :");
		auditStr.append(uSRN);
	    auditStr.append("; ");
		auditStr.append("\r\n*uBRN* :");
		auditStr.append(uBRN);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPublished* :");
		auditStr.append(isPublished);
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
		
		String keyClassName = "DirectoryOfServiceSessionSlot";
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
		if (this.getDirectoryOfService() != null)
		{
			sb.append("<directoryOfService>");
			sb.append(this.getDirectoryOfService().toXMLString(domMap)); 	
			sb.append("</directoryOfService>");		
		}
		if (this.getSlot() != null)
		{
			sb.append("<slot>");
			sb.append(this.getSlot().toXMLString(domMap)); 	
			sb.append("</slot>");		
		}
		if (this.getUSRN() != null)
		{
			sb.append("<uSRN>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUSRN().toString()));
			sb.append("</uSRN>");		
		}
		if (this.getUBRN() != null)
		{
			sb.append("<uBRN>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUBRN().toString()));
			sb.append("</uBRN>");		
		}
		if (this.isIsPublished() != null)
		{
			sb.append("<isPublished>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPublished().toString()));
			sb.append("</isPublished>");		
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
			DirectoryOfServiceSessionSlot domainObject = getDirectoryOfServiceSessionSlotfromXML(itemEl, factory, domMap);

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
			DirectoryOfServiceSessionSlot domainObject = getDirectoryOfServiceSessionSlotfromXML(itemEl, factory, domMap);

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
		
	public static DirectoryOfServiceSessionSlot getDirectoryOfServiceSessionSlotfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDirectoryOfServiceSessionSlotfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DirectoryOfServiceSessionSlot getDirectoryOfServiceSessionSlotfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DirectoryOfServiceSessionSlot.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DirectoryOfServiceSessionSlot.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DirectoryOfServiceSessionSlot class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DirectoryOfServiceSessionSlot)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DirectoryOfServiceSessionSlot.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DirectoryOfServiceSessionSlot ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DirectoryOfServiceSessionSlot)factory.getImportedDomainObject(DirectoryOfServiceSessionSlot.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DirectoryOfServiceSessionSlot();
		}
		String keyClassName = "DirectoryOfServiceSessionSlot";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DirectoryOfServiceSessionSlot)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DirectoryOfServiceSessionSlot obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("directoryOfService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDirectoryOfService(ims.scheduling.domain.objects.DirectoryofService.getDirectoryofServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("slot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSlot(ims.scheduling.domain.objects.Session_Slot.getSession_SlotfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("uSRN");
		if(fldEl != null)
		{	
    		obj.setUSRN(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uBRN");
		if(fldEl != null)
		{	
    		obj.setUBRN(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPublished");
		if(fldEl != null)
		{	
    		obj.setIsPublished(new Boolean(fldEl.getTextTrim()));	
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
		public static final String DirectoryOfService = "directoryOfService";
		public static final String Slot = "slot";
		public static final String USRN = "uSRN";
		public static final String UBRN = "uBRN";
		public static final String IsPublished = "isPublished";
	}
}

