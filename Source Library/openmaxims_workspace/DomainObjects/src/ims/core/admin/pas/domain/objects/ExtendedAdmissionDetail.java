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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class ExtendedAdmissionDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100018;
	private static final long serialVersionUID = 1014100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ReferredFromType */
	private ims.domain.lookups.LookupInstance referredFromType;
	/** ReferrerDetails */
	private ims.core.resource.domain.objects.ExternalResource referrerDetails;
	/** AdmittedFromType */
	private ims.domain.lookups.LookupInstance admittedFromType;
	/** AdmittedFrom */
	private ims.core.resource.domain.objects.ExternalResource admittedFrom;
	/** BedNumber */
	private Integer bedNumber;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ExtendedAdmissionDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ExtendedAdmissionDetail ()
    {
    	super();
    }
    public ExtendedAdmissionDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.ExtendedAdmissionDetail.class;
	}


	public ims.domain.lookups.LookupInstance getReferredFromType() {
		return referredFromType;
	}
	public void setReferredFromType(ims.domain.lookups.LookupInstance referredFromType) {
		this.referredFromType = referredFromType;
	}

	public ims.core.resource.domain.objects.ExternalResource getReferrerDetails() {
		return referrerDetails;
	}
	public void setReferrerDetails(ims.core.resource.domain.objects.ExternalResource referrerDetails) {
		this.referrerDetails = referrerDetails;
	}

	public ims.domain.lookups.LookupInstance getAdmittedFromType() {
		return admittedFromType;
	}
	public void setAdmittedFromType(ims.domain.lookups.LookupInstance admittedFromType) {
		this.admittedFromType = admittedFromType;
	}

	public ims.core.resource.domain.objects.ExternalResource getAdmittedFrom() {
		return admittedFrom;
	}
	public void setAdmittedFrom(ims.core.resource.domain.objects.ExternalResource admittedFrom) {
		this.admittedFrom = admittedFrom;
	}

	public Integer getBedNumber() {
		return bedNumber;
	}
	public void setBedNumber(Integer bedNumber) {
		this.bedNumber = bedNumber;
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
		
		auditStr.append("\r\n*referredFromType* :");
		if (referredFromType != null)
			auditStr.append(referredFromType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerDetails* :");
		if (referrerDetails != null)
		{
			auditStr.append(toShortClassName(referrerDetails));
				
		    auditStr.append(referrerDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admittedFromType* :");
		if (admittedFromType != null)
			auditStr.append(admittedFromType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admittedFrom* :");
		if (admittedFrom != null)
		{
			auditStr.append(toShortClassName(admittedFrom));
				
		    auditStr.append(admittedFrom.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bedNumber* :");
		auditStr.append(bedNumber);
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
		
		String keyClassName = "ExtendedAdmissionDetail";
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
		if (this.getReferredFromType() != null)
		{
			sb.append("<referredFromType>");
			sb.append(this.getReferredFromType().toXMLString()); 
			sb.append("</referredFromType>");		
		}
		if (this.getReferrerDetails() != null)
		{
			sb.append("<referrerDetails>");
			sb.append(this.getReferrerDetails().toXMLString(domMap)); 	
			sb.append("</referrerDetails>");		
		}
		if (this.getAdmittedFromType() != null)
		{
			sb.append("<admittedFromType>");
			sb.append(this.getAdmittedFromType().toXMLString()); 
			sb.append("</admittedFromType>");		
		}
		if (this.getAdmittedFrom() != null)
		{
			sb.append("<admittedFrom>");
			sb.append(this.getAdmittedFrom().toXMLString(domMap)); 	
			sb.append("</admittedFrom>");		
		}
		if (this.getBedNumber() != null)
		{
			sb.append("<bedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedNumber().toString()));
			sb.append("</bedNumber>");		
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
			ExtendedAdmissionDetail domainObject = getExtendedAdmissionDetailfromXML(itemEl, factory, domMap);

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
			ExtendedAdmissionDetail domainObject = getExtendedAdmissionDetailfromXML(itemEl, factory, domMap);

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
		
	public static ExtendedAdmissionDetail getExtendedAdmissionDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getExtendedAdmissionDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ExtendedAdmissionDetail getExtendedAdmissionDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ExtendedAdmissionDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ExtendedAdmissionDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ExtendedAdmissionDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ExtendedAdmissionDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ExtendedAdmissionDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ExtendedAdmissionDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ExtendedAdmissionDetail)factory.getImportedDomainObject(ExtendedAdmissionDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ExtendedAdmissionDetail();
		}
		String keyClassName = "ExtendedAdmissionDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ExtendedAdmissionDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ExtendedAdmissionDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("referredFromType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferredFromType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referrerDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferrerDetails(ims.core.resource.domain.objects.ExternalResource.getExternalResourcefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admittedFromType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmittedFromType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admittedFrom");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmittedFrom(ims.core.resource.domain.objects.ExternalResource.getExternalResourcefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bedNumber");
		if(fldEl != null)
		{	
    		obj.setBedNumber(new Integer(fldEl.getTextTrim()));	
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
		public static final String ReferredFromType = "referredFromType";
		public static final String ReferrerDetails = "referrerDetails";
		public static final String AdmittedFromType = "admittedFromType";
		public static final String AdmittedFrom = "admittedFrom";
		public static final String BedNumber = "bedNumber";
	}
}

