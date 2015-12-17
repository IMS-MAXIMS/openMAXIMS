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
package ims.core.vitals.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class SignatoryShiftDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100020;
	private static final long serialVersionUID = 1022100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** DateTimeSigned */
	private java.util.Date dateTimeSigned;
	/** SignedOffBy */
	private ims.core.resource.people.domain.objects.Hcp signedOffBy;
	/** StartTime */
	private ims.domain.lookups.LookupInstance startTime;
	/** EndTime */
	private ims.domain.lookups.LookupInstance endTime;
	/** ShiftStartDateTime */
	private java.util.Date shiftStartDateTime;
	/** ShiftEndDateTime */
	private java.util.Date shiftEndDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SignatoryShiftDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SignatoryShiftDetails ()
    {
    	super();
    }
    public SignatoryShiftDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.SignatoryShiftDetails.class;
	}


	public java.util.Date getDateTimeSigned() {
		return dateTimeSigned;
	}
	public void setDateTimeSigned(java.util.Date dateTimeSigned) {
		this.dateTimeSigned = dateTimeSigned;
	}

	public ims.core.resource.people.domain.objects.Hcp getSignedOffBy() {
		return signedOffBy;
	}
	public void setSignedOffBy(ims.core.resource.people.domain.objects.Hcp signedOffBy) {
		this.signedOffBy = signedOffBy;
	}

	public ims.domain.lookups.LookupInstance getStartTime() {
		return startTime;
	}
	public void setStartTime(ims.domain.lookups.LookupInstance startTime) {
		this.startTime = startTime;
	}

	public ims.domain.lookups.LookupInstance getEndTime() {
		return endTime;
	}
	public void setEndTime(ims.domain.lookups.LookupInstance endTime) {
		this.endTime = endTime;
	}

	public java.util.Date getShiftStartDateTime() {
		return shiftStartDateTime;
	}
	public void setShiftStartDateTime(java.util.Date shiftStartDateTime) {
		this.shiftStartDateTime = shiftStartDateTime;
	}

	public java.util.Date getShiftEndDateTime() {
		return shiftEndDateTime;
	}
	public void setShiftEndDateTime(java.util.Date shiftEndDateTime) {
		this.shiftEndDateTime = shiftEndDateTime;
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
		
		auditStr.append("\r\n*dateTimeSigned* :");
		auditStr.append(dateTimeSigned);
	    auditStr.append("; ");
		auditStr.append("\r\n*signedOffBy* :");
		if (signedOffBy != null)
		{
			auditStr.append(toShortClassName(signedOffBy));
				
		    auditStr.append(signedOffBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		if (startTime != null)
			auditStr.append(startTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		if (endTime != null)
			auditStr.append(endTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*shiftStartDateTime* :");
		auditStr.append(shiftStartDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*shiftEndDateTime* :");
		auditStr.append(shiftEndDateTime);
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
		
		String keyClassName = "SignatoryShiftDetails";
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
		if (this.getDateTimeSigned() != null)
		{
			sb.append("<dateTimeSigned>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeSigned()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeSigned>");		
		}
		if (this.getSignedOffBy() != null)
		{
			sb.append("<signedOffBy>");
			sb.append(this.getSignedOffBy().toXMLString(domMap)); 	
			sb.append("</signedOffBy>");		
		}
		if (this.getStartTime() != null)
		{
			sb.append("<startTime>");
			sb.append(this.getStartTime().toXMLString()); 
			sb.append("</startTime>");		
		}
		if (this.getEndTime() != null)
		{
			sb.append("<endTime>");
			sb.append(this.getEndTime().toXMLString()); 
			sb.append("</endTime>");		
		}
		if (this.getShiftStartDateTime() != null)
		{
			sb.append("<shiftStartDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getShiftStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</shiftStartDateTime>");		
		}
		if (this.getShiftEndDateTime() != null)
		{
			sb.append("<shiftEndDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getShiftEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</shiftEndDateTime>");		
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
			SignatoryShiftDetails domainObject = getSignatoryShiftDetailsfromXML(itemEl, factory, domMap);

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
			SignatoryShiftDetails domainObject = getSignatoryShiftDetailsfromXML(itemEl, factory, domMap);

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
		
	public static SignatoryShiftDetails getSignatoryShiftDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSignatoryShiftDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SignatoryShiftDetails getSignatoryShiftDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SignatoryShiftDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SignatoryShiftDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SignatoryShiftDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SignatoryShiftDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SignatoryShiftDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SignatoryShiftDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SignatoryShiftDetails)factory.getImportedDomainObject(SignatoryShiftDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SignatoryShiftDetails();
		}
		String keyClassName = "SignatoryShiftDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SignatoryShiftDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SignatoryShiftDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateTimeSigned");
		if(fldEl != null)
		{	
    		obj.setDateTimeSigned(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("signedOffBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSignedOffBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStartTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("endTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEndTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("shiftStartDateTime");
		if(fldEl != null)
		{	
    		obj.setShiftStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("shiftEndDateTime");
		if(fldEl != null)
		{	
    		obj.setShiftEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String DateTimeSigned = "dateTimeSigned";
		public static final String SignedOffBy = "signedOffBy";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String ShiftStartDateTime = "shiftStartDateTime";
		public static final String ShiftEndDateTime = "shiftEndDateTime";
	}
}

