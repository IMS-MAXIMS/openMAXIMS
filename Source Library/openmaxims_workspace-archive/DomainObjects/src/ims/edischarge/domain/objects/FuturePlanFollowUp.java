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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class FuturePlanFollowUp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100007;
	private static final long serialVersionUID = 1099100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Hospital Follow Up */
	private ims.domain.lookups.LookupInstance hospitalFollowUp;
	/** Hospital To Follow Up */
	private ims.core.resource.place.domain.objects.Location hospitalToFollowUp;
	/** Follow Up In Value */
	private Integer followUpInValue;
	/** FollowUp InUnit */
	private ims.domain.lookups.LookupInstance followUpInUnit;
	/** Follow Up HCP */
	private ims.core.resource.people.domain.objects.Hcp followUpHCP;
	/** Follow Up Specialty */
	private ims.domain.lookups.LookupInstance followUpSpecialty;
	/** Location */
	private ims.core.resource.place.domain.objects.Location location;
	/** FollowUp Type  */
	private ims.domain.lookups.LookupInstance followUpType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FuturePlanFollowUp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FuturePlanFollowUp ()
    {
    	super();
    }
    public FuturePlanFollowUp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.FuturePlanFollowUp.class;
	}


	public ims.domain.lookups.LookupInstance getHospitalFollowUp() {
		return hospitalFollowUp;
	}
	public void setHospitalFollowUp(ims.domain.lookups.LookupInstance hospitalFollowUp) {
		this.hospitalFollowUp = hospitalFollowUp;
	}

	public ims.core.resource.place.domain.objects.Location getHospitalToFollowUp() {
		return hospitalToFollowUp;
	}
	public void setHospitalToFollowUp(ims.core.resource.place.domain.objects.Location hospitalToFollowUp) {
		this.hospitalToFollowUp = hospitalToFollowUp;
	}

	public Integer getFollowUpInValue() {
		return followUpInValue;
	}
	public void setFollowUpInValue(Integer followUpInValue) {
		this.followUpInValue = followUpInValue;
	}

	public ims.domain.lookups.LookupInstance getFollowUpInUnit() {
		return followUpInUnit;
	}
	public void setFollowUpInUnit(ims.domain.lookups.LookupInstance followUpInUnit) {
		this.followUpInUnit = followUpInUnit;
	}

	public ims.core.resource.people.domain.objects.Hcp getFollowUpHCP() {
		return followUpHCP;
	}
	public void setFollowUpHCP(ims.core.resource.people.domain.objects.Hcp followUpHCP) {
		this.followUpHCP = followUpHCP;
	}

	public ims.domain.lookups.LookupInstance getFollowUpSpecialty() {
		return followUpSpecialty;
	}
	public void setFollowUpSpecialty(ims.domain.lookups.LookupInstance followUpSpecialty) {
		this.followUpSpecialty = followUpSpecialty;
	}

	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public ims.domain.lookups.LookupInstance getFollowUpType() {
		return followUpType;
	}
	public void setFollowUpType(ims.domain.lookups.LookupInstance followUpType) {
		this.followUpType = followUpType;
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
		
		auditStr.append("\r\n*hospitalFollowUp* :");
		if (hospitalFollowUp != null)
			auditStr.append(hospitalFollowUp.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hospitalToFollowUp* :");
		if (hospitalToFollowUp != null)
		{
			auditStr.append(toShortClassName(hospitalToFollowUp));
				
		    auditStr.append(hospitalToFollowUp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpInValue* :");
		auditStr.append(followUpInValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpInUnit* :");
		if (followUpInUnit != null)
			auditStr.append(followUpInUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpHCP* :");
		if (followUpHCP != null)
		{
			auditStr.append(toShortClassName(followUpHCP));
				
		    auditStr.append(followUpHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpSpecialty* :");
		if (followUpSpecialty != null)
			auditStr.append(followUpSpecialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpType* :");
		if (followUpType != null)
			auditStr.append(followUpType.getText());
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
		
		String keyClassName = "FuturePlanFollowUp";
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
		if (this.getHospitalFollowUp() != null)
		{
			sb.append("<hospitalFollowUp>");
			sb.append(this.getHospitalFollowUp().toXMLString()); 
			sb.append("</hospitalFollowUp>");		
		}
		if (this.getHospitalToFollowUp() != null)
		{
			sb.append("<hospitalToFollowUp>");
			sb.append(this.getHospitalToFollowUp().toXMLString(domMap)); 	
			sb.append("</hospitalToFollowUp>");		
		}
		if (this.getFollowUpInValue() != null)
		{
			sb.append("<followUpInValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFollowUpInValue().toString()));
			sb.append("</followUpInValue>");		
		}
		if (this.getFollowUpInUnit() != null)
		{
			sb.append("<followUpInUnit>");
			sb.append(this.getFollowUpInUnit().toXMLString()); 
			sb.append("</followUpInUnit>");		
		}
		if (this.getFollowUpHCP() != null)
		{
			sb.append("<followUpHCP>");
			sb.append(this.getFollowUpHCP().toXMLString(domMap)); 	
			sb.append("</followUpHCP>");		
		}
		if (this.getFollowUpSpecialty() != null)
		{
			sb.append("<followUpSpecialty>");
			sb.append(this.getFollowUpSpecialty().toXMLString()); 
			sb.append("</followUpSpecialty>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getFollowUpType() != null)
		{
			sb.append("<followUpType>");
			sb.append(this.getFollowUpType().toXMLString()); 
			sb.append("</followUpType>");		
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
			FuturePlanFollowUp domainObject = getFuturePlanFollowUpfromXML(itemEl, factory, domMap);

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
			FuturePlanFollowUp domainObject = getFuturePlanFollowUpfromXML(itemEl, factory, domMap);

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
		
	public static FuturePlanFollowUp getFuturePlanFollowUpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFuturePlanFollowUpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FuturePlanFollowUp getFuturePlanFollowUpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FuturePlanFollowUp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FuturePlanFollowUp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FuturePlanFollowUp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FuturePlanFollowUp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FuturePlanFollowUp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FuturePlanFollowUp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FuturePlanFollowUp)factory.getImportedDomainObject(FuturePlanFollowUp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FuturePlanFollowUp();
		}
		String keyClassName = "FuturePlanFollowUp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FuturePlanFollowUp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FuturePlanFollowUp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("hospitalFollowUp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHospitalFollowUp(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hospitalToFollowUp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospitalToFollowUp(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("followUpInValue");
		if(fldEl != null)
		{	
    		obj.setFollowUpInValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followUpInUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowUpInUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("followUpHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFollowUpHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("followUpSpecialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowUpSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("followUpType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowUpType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String HospitalFollowUp = "hospitalFollowUp";
		public static final String HospitalToFollowUp = "hospitalToFollowUp";
		public static final String FollowUpInValue = "followUpInValue";
		public static final String FollowUpInUnit = "followUpInUnit";
		public static final String FollowUpHCP = "followUpHCP";
		public static final String FollowUpSpecialty = "followUpSpecialty";
		public static final String Location = "location";
		public static final String FollowUpType = "followUpType";
	}
}

