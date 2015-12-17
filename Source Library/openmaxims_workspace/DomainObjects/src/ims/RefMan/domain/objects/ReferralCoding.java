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
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ReferralCoding extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100037;
	private static final long serialVersionUID = 1096100037L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** PasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Appointment for Outpatient Coding */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	/** CodingItems
	  * Collection of ims.RefMan.domain.objects.ReferralCodingItem.
	  */
	private java.util.List codingItems;
	/** Authoring MOS */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringMOS;
	/** AuthoringDateTime */
	private java.util.Date authoringDateTime;
	/** Comments */
	private String comments;
	/** Active / Inactive indicator */
	private Boolean active;
	/** StagingExportData for external coder
	  * Collection of ims.RefMan.domain.objects.StagingCodeExport.
	  */
	private java.util.List stagingCodeExport;
	/** Finished Consultant Episode */
	private ims.core.admin.pas.domain.objects.ConsultantStay fCE;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralCoding (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralCoding ()
    {
    	super();
    }
    public ReferralCoding (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReferralCoding.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public java.util.List getCodingItems() {
		if ( null == codingItems ) {
			codingItems = new java.util.ArrayList();
		}
		return codingItems;
	}
	public void setCodingItems(java.util.List paramValue) {
		this.codingItems = paramValue;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringMOS() {
		return authoringMOS;
	}
	public void setAuthoringMOS(ims.core.resource.people.domain.objects.MemberOfStaff authoringMOS) {
		this.authoringMOS = authoringMOS;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public java.util.List getStagingCodeExport() {
		if ( null == stagingCodeExport ) {
			stagingCodeExport = new java.util.ArrayList();
		}
		return stagingCodeExport;
	}
	public void setStagingCodeExport(java.util.List paramValue) {
		this.stagingCodeExport = paramValue;
	}

	public ims.core.admin.pas.domain.objects.ConsultantStay getFCE() {
		return fCE;
	}
	public void setFCE(ims.core.admin.pas.domain.objects.ConsultantStay fCE) {
		this.fCE = fCE;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codingItems* :");
		if (codingItems != null)
		{
		int i4=0;
		for (i4=0; i4<codingItems.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.ReferralCodingItem obj = (ims.RefMan.domain.objects.ReferralCodingItem)codingItems.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringMOS* :");
		if (authoringMOS != null)
		{
			auditStr.append(toShortClassName(authoringMOS));
				
		    auditStr.append(authoringMOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*stagingCodeExport* :");
		if (stagingCodeExport != null)
		{
		int i9=0;
		for (i9=0; i9<stagingCodeExport.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.StagingCodeExport obj = (ims.RefMan.domain.objects.StagingCodeExport)stagingCodeExport.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fCE* :");
		if (fCE != null)
		{
			auditStr.append(toShortClassName(fCE));
				
		    auditStr.append(fCE.getId());
		}
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
		
		String keyClassName = "ReferralCoding";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.getCodingItems() != null)
		{
			if (this.getCodingItems().size() > 0 )
			{
			sb.append("<codingItems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCodingItems(), domMap));
			sb.append("</codingItems>");		
			}
		}
		if (this.getAuthoringMOS() != null)
		{
			sb.append("<authoringMOS>");
			sb.append(this.getAuthoringMOS().toXMLString(domMap)); 	
			sb.append("</authoringMOS>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getStagingCodeExport() != null)
		{
			if (this.getStagingCodeExport().size() > 0 )
			{
			sb.append("<stagingCodeExport>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStagingCodeExport(), domMap));
			sb.append("</stagingCodeExport>");		
			}
		}
		if (this.getFCE() != null)
		{
			sb.append("<fCE>");
			sb.append(this.getFCE().toXMLString(domMap)); 	
			sb.append("</fCE>");		
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
			ReferralCoding domainObject = getReferralCodingfromXML(itemEl, factory, domMap);

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
			ReferralCoding domainObject = getReferralCodingfromXML(itemEl, factory, domMap);

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
		
	public static ReferralCoding getReferralCodingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralCodingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralCoding getReferralCodingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralCoding.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralCoding.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralCoding class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralCoding)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralCoding.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralCoding ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralCoding)factory.getImportedDomainObject(ReferralCoding.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralCoding();
		}
		String keyClassName = "ReferralCoding";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralCoding)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralCoding obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("codingItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodingItems(ims.RefMan.domain.objects.ReferralCodingItem.fromListXMLString(fldEl, factory, obj.getCodingItems(), domMap));
		}
		fldEl = el.element("authoringMOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stagingCodeExport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStagingCodeExport(ims.RefMan.domain.objects.StagingCodeExport.fromListXMLString(fldEl, factory, obj.getStagingCodeExport(), domMap));
		}
		fldEl = el.element("fCE");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFCE(ims.core.admin.pas.domain.objects.ConsultantStay.getConsultantStayfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "codingItems"
		, "stagingCodeExport"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String PasEvent = "pasEvent";
		public static final String Appointment = "appointment";
		public static final String CodingItems = "codingItems";
		public static final String AuthoringMOS = "authoringMOS";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String Comments = "comments";
		public static final String Active = "active";
		public static final String StagingCodeExport = "stagingCodeExport";
		public static final String FCE = "fCE";
	}
}

