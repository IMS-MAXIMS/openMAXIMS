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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSAddr extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100025;
	private static final long serialVersionUID = 1001100025L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The particular flavour of the address datatype used here is Address streetAddressLine Typed (format 2 in the datatypes description) */
	private String addressLines;
	/** Postcode */
	private String postcode;
	/** PAF */
	private String addressKey;
	/** Description */
	private String description;
	private ims.domain.lookups.LookupInstance addressType;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private Boolean beffdate;
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	private Boolean betdatecnf;
	/** PDS Update Mode */
	private ims.domain.lookups.LookupInstance pdsUpdateMode;
	/** Unique PDS identifier */
	private String objectIdentifier;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSAddr (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSAddr ()
    {
    	super();
    }
    public PDSAddr (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PDSAddr.class;
	}


	public String getAddressLines() {
		return addressLines;
	}
	public void setAddressLines(String addressLines) {
		if ( null != addressLines && addressLines.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for addressLines. Tried to set value: "+
				addressLines);
		}
		this.addressLines = addressLines;
	}

	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		if ( null != postcode && postcode.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for postcode. Tried to set value: "+
				postcode);
		}
		this.postcode = postcode;
	}

	public String getAddressKey() {
		return addressKey;
	}
	public void setAddressKey(String addressKey) {
		if ( null != addressKey && addressKey.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for addressKey. Tried to set value: "+
				addressKey);
		}
		this.addressKey = addressKey;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public ims.domain.lookups.LookupInstance getAddressType() {
		return addressType;
	}
	public void setAddressType(ims.domain.lookups.LookupInstance addressType) {
		this.addressType = addressType;
	}

	public Boolean isBeffdate() {
		return beffdate;
	}
	public void setBeffdate(Boolean beffdate) {
		this.beffdate = beffdate;
	}

	public Boolean isBeffdatecnf() {
		return beffdatecnf;
	}
	public void setBeffdatecnf(Boolean beffdatecnf) {
		this.beffdatecnf = beffdatecnf;
	}

	public java.util.Date getBetdate() {
		return betdate;
	}
	public void setBetdate(java.util.Date betdate) {
		this.betdate = betdate;
	}

	public Boolean isBetdatecnf() {
		return betdatecnf;
	}
	public void setBetdatecnf(Boolean betdatecnf) {
		this.betdatecnf = betdatecnf;
	}

	public ims.domain.lookups.LookupInstance getPdsUpdateMode() {
		return pdsUpdateMode;
	}
	public void setPdsUpdateMode(ims.domain.lookups.LookupInstance pdsUpdateMode) {
		this.pdsUpdateMode = pdsUpdateMode;
	}

	public String getObjectIdentifier() {
		return objectIdentifier;
	}
	public void setObjectIdentifier(String objectIdentifier) {
		if ( null != objectIdentifier && objectIdentifier.length() > 14 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for objectIdentifier. Tried to set value: "+
				objectIdentifier);
		}
		this.objectIdentifier = objectIdentifier;
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
		
		auditStr.append("\r\n*addressLines* :");
		auditStr.append(addressLines);
	    auditStr.append("; ");
		auditStr.append("\r\n*postcode* :");
		auditStr.append(postcode);
	    auditStr.append("; ");
		auditStr.append("\r\n*addressKey* :");
		auditStr.append(addressKey);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*addressType* :");
		if (addressType != null)
			auditStr.append(addressType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdate* :");
		auditStr.append(beffdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdatecnf* :");
		auditStr.append(beffdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdate* :");
		auditStr.append(betdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdatecnf* :");
		auditStr.append(betdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsUpdateMode* :");
		if (pdsUpdateMode != null)
			auditStr.append(pdsUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*objectIdentifier* :");
		auditStr.append(objectIdentifier);
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
		
		String keyClassName = "PDSAddr";
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
		if (this.getAddressLines() != null)
		{
			sb.append("<addressLines>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAddressLines().toString()));
			sb.append("</addressLines>");		
		}
		if (this.getPostcode() != null)
		{
			sb.append("<postcode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostcode().toString()));
			sb.append("</postcode>");		
		}
		if (this.getAddressKey() != null)
		{
			sb.append("<addressKey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAddressKey().toString()));
			sb.append("</addressKey>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getAddressType() != null)
		{
			sb.append("<addressType>");
			sb.append(this.getAddressType().toXMLString()); 
			sb.append("</addressType>");		
		}
		if (this.isBeffdate() != null)
		{
			sb.append("<beffdate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBeffdate().toString()));
			sb.append("</beffdate>");		
		}
		if (this.isBeffdatecnf() != null)
		{
			sb.append("<beffdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBeffdatecnf().toString()));
			sb.append("</beffdatecnf>");		
		}
		if (this.getBetdate() != null)
		{
			sb.append("<betdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBetdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</betdate>");		
		}
		if (this.isBetdatecnf() != null)
		{
			sb.append("<betdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBetdatecnf().toString()));
			sb.append("</betdatecnf>");		
		}
		if (this.getPdsUpdateMode() != null)
		{
			sb.append("<pdsUpdateMode>");
			sb.append(this.getPdsUpdateMode().toXMLString()); 
			sb.append("</pdsUpdateMode>");		
		}
		if (this.getObjectIdentifier() != null)
		{
			sb.append("<objectIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectIdentifier().toString()));
			sb.append("</objectIdentifier>");		
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
			PDSAddr domainObject = getPDSAddrfromXML(itemEl, factory, domMap);

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
			PDSAddr domainObject = getPDSAddrfromXML(itemEl, factory, domMap);

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
		
	public static PDSAddr getPDSAddrfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSAddrfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSAddr getPDSAddrfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSAddr.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSAddr.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSAddr class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSAddr)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSAddr.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSAddr ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSAddr)factory.getImportedDomainObject(PDSAddr.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSAddr();
		}
		String keyClassName = "PDSAddr";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSAddr)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSAddr obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("addressLines");
		if(fldEl != null)
		{	
    		obj.setAddressLines(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postcode");
		if(fldEl != null)
		{	
    		obj.setPostcode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("addressKey");
		if(fldEl != null)
		{	
    		obj.setAddressKey(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("addressType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAddressType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("beffdate");
		if(fldEl != null)
		{	
    		obj.setBeffdate(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("beffdatecnf");
		if(fldEl != null)
		{	
    		obj.setBeffdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("betdate");
		if(fldEl != null)
		{	
    		obj.setBetdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("betdatecnf");
		if(fldEl != null)
		{	
    		obj.setBetdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pdsUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("objectIdentifier");
		if(fldEl != null)
		{	
    		obj.setObjectIdentifier(new String(fldEl.getTextTrim()));	
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
		public static final String AddressLines = "addressLines";
		public static final String Postcode = "postcode";
		public static final String AddressKey = "addressKey";
		public static final String Description = "description";
		public static final String AddressType = "addressType";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String PdsUpdateMode = "pdsUpdateMode";
		public static final String ObjectIdentifier = "objectIdentifier";
	}
}

