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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author George Cristian Josan
 * Generated.
 */


public class WardMixedSexBreach extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100026;
	private static final long serialVersionUID = 1014100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.resource.place.domain.objects.Location ward;
	private ims.core.resource.place.domain.objects.Location bay;
	private java.util.Date admissionDateTime;
	private ims.core.resource.people.domain.objects.MemberOfStaff memberOfStaff;
	/** Number of male patients */
	private Integer malePatients;
	/** Number of female patients */
	private Integer femalePatients;
	private ims.domain.lookups.LookupInstance reasonForGenderBreach;
	private String reasonForGenderBreachComment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WardMixedSexBreach (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WardMixedSexBreach ()
    {
    	super();
    }
    public WardMixedSexBreach (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.WardMixedSexBreach.class;
	}


	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public ims.core.resource.place.domain.objects.Location getBay() {
		return bay;
	}
	public void setBay(ims.core.resource.place.domain.objects.Location bay) {
		this.bay = bay;
	}

	public java.util.Date getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setAdmissionDateTime(java.util.Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMemberOfStaff() {
		return memberOfStaff;
	}
	public void setMemberOfStaff(ims.core.resource.people.domain.objects.MemberOfStaff memberOfStaff) {
		this.memberOfStaff = memberOfStaff;
	}

	public Integer getMalePatients() {
		return malePatients;
	}
	public void setMalePatients(Integer malePatients) {
		this.malePatients = malePatients;
	}

	public Integer getFemalePatients() {
		return femalePatients;
	}
	public void setFemalePatients(Integer femalePatients) {
		this.femalePatients = femalePatients;
	}

	public ims.domain.lookups.LookupInstance getReasonForGenderBreach() {
		return reasonForGenderBreach;
	}
	public void setReasonForGenderBreach(ims.domain.lookups.LookupInstance reasonForGenderBreach) {
		this.reasonForGenderBreach = reasonForGenderBreach;
	}

	public String getReasonForGenderBreachComment() {
		return reasonForGenderBreachComment;
	}
	public void setReasonForGenderBreachComment(String reasonForGenderBreachComment) {
		if ( null != reasonForGenderBreachComment && reasonForGenderBreachComment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForGenderBreachComment. Tried to set value: "+
				reasonForGenderBreachComment);
		}
		this.reasonForGenderBreachComment = reasonForGenderBreachComment;
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
		
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bay* :");
		if (bay != null)
		{
			auditStr.append(toShortClassName(bay));
				
		    auditStr.append(bay.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDateTime* :");
		auditStr.append(admissionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*memberOfStaff* :");
		if (memberOfStaff != null)
		{
			auditStr.append(toShortClassName(memberOfStaff));
				
		    auditStr.append(memberOfStaff.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*malePatients* :");
		auditStr.append(malePatients);
	    auditStr.append("; ");
		auditStr.append("\r\n*femalePatients* :");
		auditStr.append(femalePatients);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForGenderBreach* :");
		if (reasonForGenderBreach != null)
			auditStr.append(reasonForGenderBreach.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForGenderBreachComment* :");
		auditStr.append(reasonForGenderBreachComment);
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
		
		String keyClassName = "WardMixedSexBreach";
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
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getBay() != null)
		{
			sb.append("<bay>");
			sb.append(this.getBay().toXMLString(domMap)); 	
			sb.append("</bay>");		
		}
		if (this.getAdmissionDateTime() != null)
		{
			sb.append("<admissionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDateTime>");		
		}
		if (this.getMemberOfStaff() != null)
		{
			sb.append("<memberOfStaff>");
			sb.append(this.getMemberOfStaff().toXMLString(domMap)); 	
			sb.append("</memberOfStaff>");		
		}
		if (this.getMalePatients() != null)
		{
			sb.append("<malePatients>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMalePatients().toString()));
			sb.append("</malePatients>");		
		}
		if (this.getFemalePatients() != null)
		{
			sb.append("<femalePatients>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFemalePatients().toString()));
			sb.append("</femalePatients>");		
		}
		if (this.getReasonForGenderBreach() != null)
		{
			sb.append("<reasonForGenderBreach>");
			sb.append(this.getReasonForGenderBreach().toXMLString()); 
			sb.append("</reasonForGenderBreach>");		
		}
		if (this.getReasonForGenderBreachComment() != null)
		{
			sb.append("<reasonForGenderBreachComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForGenderBreachComment().toString()));
			sb.append("</reasonForGenderBreachComment>");		
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
			WardMixedSexBreach domainObject = getWardMixedSexBreachfromXML(itemEl, factory, domMap);

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
			WardMixedSexBreach domainObject = getWardMixedSexBreachfromXML(itemEl, factory, domMap);

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
		
	public static WardMixedSexBreach getWardMixedSexBreachfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWardMixedSexBreachfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WardMixedSexBreach getWardMixedSexBreachfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WardMixedSexBreach.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WardMixedSexBreach.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WardMixedSexBreach class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WardMixedSexBreach)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WardMixedSexBreach.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WardMixedSexBreach ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WardMixedSexBreach)factory.getImportedDomainObject(WardMixedSexBreach.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WardMixedSexBreach();
		}
		String keyClassName = "WardMixedSexBreach";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WardMixedSexBreach)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WardMixedSexBreach obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBay(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("memberOfStaff");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMemberOfStaff(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("malePatients");
		if(fldEl != null)
		{	
    		obj.setMalePatients(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("femalePatients");
		if(fldEl != null)
		{	
    		obj.setFemalePatients(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonForGenderBreach");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForGenderBreach(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForGenderBreachComment");
		if(fldEl != null)
		{	
    		obj.setReasonForGenderBreachComment(new String(fldEl.getTextTrim()));	
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
		public static final String Ward = "ward";
		public static final String Bay = "bay";
		public static final String AdmissionDateTime = "admissionDateTime";
		public static final String MemberOfStaff = "memberOfStaff";
		public static final String MalePatients = "malePatients";
		public static final String FemalePatients = "femalePatients";
		public static final String ReasonForGenderBreach = "reasonForGenderBreach";
		public static final String ReasonForGenderBreachComment = "reasonForGenderBreachComment";
	}
}

