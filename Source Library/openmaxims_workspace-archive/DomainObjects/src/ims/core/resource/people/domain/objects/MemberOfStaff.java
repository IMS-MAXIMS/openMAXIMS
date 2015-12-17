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
package ims.core.resource.people.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class MemberOfStaff extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1006100006;
	private static final long serialVersionUID = 1006100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private ims.core.generic.domain.objects.PersonName name;
	/** hcp */
	private ims.core.resource.people.domain.objects.Hcp hcp;
	/** App User */
	private ims.core.configuration.domain.objects.AppUser appUser;
	/** Staff Type */
	private ims.domain.lookups.LookupInstance staffType;
	/** Initials */
	private String initials;
	/** isActive */
	private Boolean isActive;
	/** Locations
	  * Collection of ims.core.resource.domain.objects.HcpLocation.
	  */
	private java.util.Set locations;
	/** Communication Channels
	  * Collection of ims.core.generic.domain.objects.CommunicationChannel.
	  */
	private java.util.List commChannels;
	/** Code Mappings
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List codeMappings;
	/** Role Id */
	private String sdsRoleId;
	/** Signature Block */
	private String signatureBlock;
	/** can the consultant Refer a Patient */
	private Boolean canReferPatient;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MemberOfStaff (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MemberOfStaff ()
    {
    	super();
    }
    public MemberOfStaff (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.people.domain.objects.MemberOfStaff.class;
	}


	public ims.core.generic.domain.objects.PersonName getName() {
		return name;
	}
	public void setName(ims.core.generic.domain.objects.PersonName name) {
		this.name = name;
	}

	public ims.core.resource.people.domain.objects.Hcp getHcp() {
		return hcp;
	}
	public void setHcp(ims.core.resource.people.domain.objects.Hcp hcp) {
		this.hcp = hcp;
	}

	public ims.core.configuration.domain.objects.AppUser getAppUser() {
		return appUser;
	}
	public void setAppUser(ims.core.configuration.domain.objects.AppUser appUser) {
		this.appUser = appUser;
	}

	public ims.domain.lookups.LookupInstance getStaffType() {
		return staffType;
	}
	public void setStaffType(ims.domain.lookups.LookupInstance staffType) {
		this.staffType = staffType;
	}

	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		if ( null != initials && initials.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for initials. Tried to set value: "+
				initials);
		}
		this.initials = initials;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getLocations() {
		if ( null == locations ) {
			locations = new java.util.HashSet();
		}
		return locations;
	}
	public void setLocations(java.util.Set paramValue) {
		this.locations = paramValue;
	}

	public java.util.List getCommChannels() {
		if ( null == commChannels ) {
			commChannels = new java.util.ArrayList();
		}
		return commChannels;
	}
	public void setCommChannels(java.util.List paramValue) {
		this.commChannels = paramValue;
	}

	public java.util.List getCodeMappings() {
		if ( null == codeMappings ) {
			codeMappings = new java.util.ArrayList();
		}
		return codeMappings;
	}
	public void setCodeMappings(java.util.List paramValue) {
		this.codeMappings = paramValue;
	}

	public String getSdsRoleId() {
		return sdsRoleId;
	}
	public void setSdsRoleId(String sdsRoleId) {
		if ( null != sdsRoleId && sdsRoleId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sdsRoleId. Tried to set value: "+
				sdsRoleId);
		}
		this.sdsRoleId = sdsRoleId;
	}

	public String getSignatureBlock() {
		return signatureBlock;
	}
	public void setSignatureBlock(String signatureBlock) {
		if ( null != signatureBlock && signatureBlock.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for signatureBlock. Tried to set value: "+
				signatureBlock);
		}
		this.signatureBlock = signatureBlock;
	}

	public Boolean isCanReferPatient() {
		return canReferPatient;
	}
	public void setCanReferPatient(Boolean canReferPatient) {
		this.canReferPatient = canReferPatient;
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
		
		auditStr.append("\r\n*name* :");
		if (name != null)
		{
			auditStr.append(toShortClassName(name));
				
		    auditStr.append(name.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hcp* :");
		if (hcp != null)
		{
			auditStr.append(toShortClassName(hcp));
				
		    auditStr.append(hcp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appUser* :");
		if (appUser != null)
		{
			auditStr.append(toShortClassName(appUser));
				
		    auditStr.append(appUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*staffType* :");
		if (staffType != null)
			auditStr.append(staffType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*initials* :");
		auditStr.append(initials);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*locations* :");
		if (locations != null)
		{
			java.util.Iterator it7 = locations.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.resource.domain.objects.HcpLocation obj = (ims.core.resource.domain.objects.HcpLocation)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*commChannels* :");
		if (commChannels != null)
		{
		int i8=0;
		for (i8=0; i8<commChannels.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.CommunicationChannel obj = (ims.core.generic.domain.objects.CommunicationChannel)commChannels.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codeMappings* :");
		if (codeMappings != null)
		{
		int i9=0;
		for (i9=0; i9<codeMappings.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)codeMappings.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sdsRoleId* :");
		auditStr.append(sdsRoleId);
	    auditStr.append("; ");
		auditStr.append("\r\n*signatureBlock* :");
		auditStr.append(signatureBlock);
	    auditStr.append("; ");
		auditStr.append("\r\n*canReferPatient* :");
		auditStr.append(canReferPatient);
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
		
		String keyClassName = "MemberOfStaff";
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
			sb.append(this.getName().toXMLString(domMap)); 	
			sb.append("</name>");		
		}
		if (this.getHcp() != null)
		{
			sb.append("<hcp>");
			sb.append(this.getHcp().toXMLString(domMap)); 	
			sb.append("</hcp>");		
		}
		if (this.getAppUser() != null)
		{
			sb.append("<appUser>");
			sb.append(this.getAppUser().toXMLString(domMap)); 	
			sb.append("</appUser>");		
		}
		if (this.getStaffType() != null)
		{
			sb.append("<staffType>");
			sb.append(this.getStaffType().toXMLString()); 
			sb.append("</staffType>");		
		}
		if (this.getInitials() != null)
		{
			sb.append("<initials>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInitials().toString()));
			sb.append("</initials>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getLocations() != null)
		{
			if (this.getLocations().size() > 0 )
			{
			sb.append("<locations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocations(), domMap));
			sb.append("</locations>");		
			}
		}
		if (this.getCommChannels() != null)
		{
			if (this.getCommChannels().size() > 0 )
			{
			sb.append("<commChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCommChannels(), domMap));
			sb.append("</commChannels>");		
			}
		}
		if (this.getCodeMappings() != null)
		{
			if (this.getCodeMappings().size() > 0 )
			{
			sb.append("<codeMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCodeMappings(), domMap));
			sb.append("</codeMappings>");		
			}
		}
		if (this.getSdsRoleId() != null)
		{
			sb.append("<sdsRoleId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSdsRoleId().toString()));
			sb.append("</sdsRoleId>");		
		}
		if (this.getSignatureBlock() != null)
		{
			sb.append("<signatureBlock>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSignatureBlock().toString()));
			sb.append("</signatureBlock>");		
		}
		if (this.isCanReferPatient() != null)
		{
			sb.append("<canReferPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanReferPatient().toString()));
			sb.append("</canReferPatient>");		
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
			MemberOfStaff domainObject = getMemberOfStafffromXML(itemEl, factory, domMap);

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
			MemberOfStaff domainObject = getMemberOfStafffromXML(itemEl, factory, domMap);

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
		
	public static MemberOfStaff getMemberOfStafffromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMemberOfStafffromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MemberOfStaff getMemberOfStafffromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MemberOfStaff.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MemberOfStaff.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MemberOfStaff class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MemberOfStaff)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MemberOfStaff.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MemberOfStaff ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MemberOfStaff)factory.getImportedDomainObject(MemberOfStaff.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MemberOfStaff();
		}
		String keyClassName = "MemberOfStaff";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MemberOfStaff)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MemberOfStaff obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hcp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHcp(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("staffType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStaffType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("initials");
		if(fldEl != null)
		{	
    		obj.setInitials(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("locations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLocations(ims.core.resource.domain.objects.HcpLocation.fromSetXMLString(fldEl, factory, obj.getLocations(), domMap));
		}
		fldEl = el.element("commChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommChannels(ims.core.generic.domain.objects.CommunicationChannel.fromListXMLString(fldEl, factory, obj.getCommChannels(), domMap));
		}
		fldEl = el.element("codeMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodeMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getCodeMappings(), domMap));
		}
		fldEl = el.element("sdsRoleId");
		if(fldEl != null)
		{	
    		obj.setSdsRoleId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("signatureBlock");
		if(fldEl != null)
		{	
    		obj.setSignatureBlock(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canReferPatient");
		if(fldEl != null)
		{	
    		obj.setCanReferPatient(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "locations"
		, "commChannels"
		, "codeMappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Hcp = "hcp";
		public static final String AppUser = "appUser";
		public static final String StaffType = "staffType";
		public static final String Initials = "initials";
		public static final String IsActive = "isActive";
		public static final String Locations = "locations";
		public static final String CommChannels = "commChannels";
		public static final String CodeMappings = "codeMappings";
		public static final String SdsRoleId = "sdsRoleId";
		public static final String SignatureBlock = "signatureBlock";
		public static final String CanReferPatient = "canReferPatient";
	}
}

