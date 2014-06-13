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
package ims.core.resource.place.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class CCGPCTPCCodes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1007100017;
	private static final long serialVersionUID = 1007100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CCG Code */
	private String cCGCode;
	/** Description of the CCG Area */
	private String cCGDescription;
	/** The associated DHA code for the Postcode */
	private String dHACode;
	/** Unit postcode – 8 character version */
	private String postcode;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CCGPCTPCCodes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CCGPCTPCCodes ()
    {
    	super();
    }
    public CCGPCTPCCodes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.CCGPCTPCCodes.class;
	}


	public String getCCGCode() {
		return cCGCode;
	}
	public void setCCGCode(String cCGCode) {
		if ( null != cCGCode && cCGCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCGCode. Tried to set value: "+
				cCGCode);
		}
		this.cCGCode = cCGCode;
	}

	public String getCCGDescription() {
		return cCGDescription;
	}
	public void setCCGDescription(String cCGDescription) {
		if ( null != cCGDescription && cCGDescription.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cCGDescription. Tried to set value: "+
				cCGDescription);
		}
		this.cCGDescription = cCGDescription;
	}

	public String getDHACode() {
		return dHACode;
	}
	public void setDHACode(String dHACode) {
		if ( null != dHACode && dHACode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dHACode. Tried to set value: "+
				dHACode);
		}
		this.dHACode = dHACode;
	}

	public String getPostcode() {
		return postcode;
	}
	public static CCGPCTPCCodes getCCGPCTPCCodesFromPostcode(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from CCGPCTPCCodes c where c.postcode = :postcode";		
		java.util.List l = factory.find(hql, new String[]{"postcode"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. CCGPCTPCCodes.postcode = " + val + " returned " + l.size() + " records. " );
		return (CCGPCTPCCodes)l.get(0);
	}
	public void setPostcode(String postcode) {
		if ( null != postcode && postcode.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for postcode. Tried to set value: "+
				postcode);
		}
		this.postcode = postcode;
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
		
		auditStr.append("\r\n*cCGCode* :");
		auditStr.append(cCGCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCGDescription* :");
		auditStr.append(cCGDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*dHACode* :");
		auditStr.append(dHACode);
	    auditStr.append("; ");
		auditStr.append("\r\n*postcode* :");
		auditStr.append(postcode);
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
		
		String keyClassName = "CCGPCTPCCodes";
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
		if (this.getCCGCode() != null)
		{
			sb.append("<cCGCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCGCode().toString()));
			sb.append("</cCGCode>");		
		}
		if (this.getCCGDescription() != null)
		{
			sb.append("<cCGDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCGDescription().toString()));
			sb.append("</cCGDescription>");		
		}
		if (this.getDHACode() != null)
		{
			sb.append("<dHACode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDHACode().toString()));
			sb.append("</dHACode>");		
		}
		if (this.getPostcode() != null)
		{
			sb.append("<postcode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostcode().toString()));
			sb.append("</postcode>");		
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
			CCGPCTPCCodes domainObject = getCCGPCTPCCodesfromXML(itemEl, factory, domMap);

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
			CCGPCTPCCodes domainObject = getCCGPCTPCCodesfromXML(itemEl, factory, domMap);

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
		
	public static CCGPCTPCCodes getCCGPCTPCCodesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCCGPCTPCCodesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CCGPCTPCCodes getCCGPCTPCCodesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CCGPCTPCCodes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CCGPCTPCCodes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CCGPCTPCCodes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CCGPCTPCCodes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CCGPCTPCCodes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CCGPCTPCCodes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CCGPCTPCCodes)factory.getImportedDomainObject(CCGPCTPCCodes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CCGPCTPCCodes();
		}
		String keyClassName = "CCGPCTPCCodes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CCGPCTPCCodes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CCGPCTPCCodes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("cCGCode");
		if(fldEl != null)
		{	
    		obj.setCCGCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCGDescription");
		if(fldEl != null)
		{	
    		obj.setCCGDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dHACode");
		if(fldEl != null)
		{	
    		obj.setDHACode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postcode");
		if(fldEl != null)
		{	
    		obj.setPostcode(new String(fldEl.getTextTrim()));	
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
		public static final String CCGCode = "cCGCode";
		public static final String CCGDescription = "cCGDescription";
		public static final String DHACode = "dHACode";
		public static final String Postcode = "postcode";
	}
}

