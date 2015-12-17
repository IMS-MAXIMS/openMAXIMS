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
package ims.therapies.homeandenvironmentalvisit.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class HomeVisit extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100088;
	private static final long serialVersionUID = 1019100088L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Care Professional */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Visit Date */
	private java.util.Date visitDate;
	/** Address and ownership status */
	private ims.therapies.homeandenvironmentalvisit.domain.objects.HomeDetails houseDetails;
	/** Therapist Present */
	private ims.core.resource.people.domain.objects.Hcp therapistPresent;
	/** Others Present */
	private String othersPresent;
	/** Physical Structure Assessment
	  * Collection of ims.therapies.homeandenvironmentalvisit.domain.objects.BathingFacility.
	  */
	private java.util.Set homeAssessmentComponent;
	/** Rooms
	  * Collection of ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails.
	  */
	private java.util.Set rooms;
	/** Visit Summary */
	private ims.therapies.homeandenvironmentalvisit.domain.objects.VisitSummary visitSummary;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
    public HomeVisit (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HomeVisit ()
    {
    	super();
    }
    public HomeVisit (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(java.util.Date visitDate) {
		this.visitDate = visitDate;
	}

	public ims.therapies.homeandenvironmentalvisit.domain.objects.HomeDetails getHouseDetails() {
		return houseDetails;
	}
	public void setHouseDetails(ims.therapies.homeandenvironmentalvisit.domain.objects.HomeDetails houseDetails) {
		this.houseDetails = houseDetails;
	}

	public ims.core.resource.people.domain.objects.Hcp getTherapistPresent() {
		return therapistPresent;
	}
	public void setTherapistPresent(ims.core.resource.people.domain.objects.Hcp therapistPresent) {
		this.therapistPresent = therapistPresent;
	}

	public String getOthersPresent() {
		return othersPresent;
	}
	public void setOthersPresent(String othersPresent) {
		if ( null != othersPresent && othersPresent.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for othersPresent. Tried to set value: "+
				othersPresent);
		}
		this.othersPresent = othersPresent;
	}

	public java.util.Set getHomeAssessmentComponent() {
		if ( null == homeAssessmentComponent ) {
			homeAssessmentComponent = new java.util.HashSet();
		}
		return homeAssessmentComponent;
	}
	public void setHomeAssessmentComponent(java.util.Set paramValue) {
		this.homeAssessmentComponent = paramValue;
	}

	public java.util.Set getRooms() {
		if ( null == rooms ) {
			rooms = new java.util.HashSet();
		}
		return rooms;
	}
	public void setRooms(java.util.Set paramValue) {
		this.rooms = paramValue;
	}

	public ims.therapies.homeandenvironmentalvisit.domain.objects.VisitSummary getVisitSummary() {
		return visitSummary;
	}
	public void setVisitSummary(ims.therapies.homeandenvironmentalvisit.domain.objects.VisitSummary visitSummary) {
		this.visitSummary = visitSummary;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*visitDate* :");
		auditStr.append(visitDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*houseDetails* :");
		if (houseDetails != null)
		{
			auditStr.append(toShortClassName(houseDetails));
				
		    auditStr.append(houseDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*therapistPresent* :");
		if (therapistPresent != null)
		{
			auditStr.append(toShortClassName(therapistPresent));
				
		    auditStr.append(therapistPresent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*othersPresent* :");
		auditStr.append(othersPresent);
	    auditStr.append("; ");
		auditStr.append("\r\n*homeAssessmentComponent* :");
		if (homeAssessmentComponent != null)
		{
			java.util.Iterator it6 = homeAssessmentComponent.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.therapies.homeandenvironmentalvisit.domain.objects.BathingFacility obj = (ims.therapies.homeandenvironmentalvisit.domain.objects.BathingFacility)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rooms* :");
		if (rooms != null)
		{
			java.util.Iterator it7 = rooms.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails obj = (ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails)it7.next();
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
		auditStr.append("\r\n*visitSummary* :");
		if (visitSummary != null)
		{
			auditStr.append(toShortClassName(visitSummary));
				
		    auditStr.append(visitSummary.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "HomeVisit";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getVisitDate() != null)
		{
			sb.append("<visitDate>");
			sb.append(new ims.framework.utils.DateTime(this.getVisitDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</visitDate>");		
		}
		if (this.getHouseDetails() != null)
		{
			sb.append("<houseDetails>");
			sb.append(this.getHouseDetails().toXMLString(domMap)); 	
			sb.append("</houseDetails>");		
		}
		if (this.getTherapistPresent() != null)
		{
			sb.append("<therapistPresent>");
			sb.append(this.getTherapistPresent().toXMLString(domMap)); 	
			sb.append("</therapistPresent>");		
		}
		if (this.getOthersPresent() != null)
		{
			sb.append("<othersPresent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOthersPresent().toString()));
			sb.append("</othersPresent>");		
		}
		if (this.getHomeAssessmentComponent() != null)
		{
			if (this.getHomeAssessmentComponent().size() > 0 )
			{
			sb.append("<homeAssessmentComponent>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHomeAssessmentComponent(), domMap));
			sb.append("</homeAssessmentComponent>");		
			}
		}
		if (this.getRooms() != null)
		{
			if (this.getRooms().size() > 0 )
			{
			sb.append("<rooms>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRooms(), domMap));
			sb.append("</rooms>");		
			}
		}
		if (this.getVisitSummary() != null)
		{
			sb.append("<visitSummary>");
			sb.append(this.getVisitSummary().toXMLString(domMap)); 	
			sb.append("</visitSummary>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			HomeVisit domainObject = getHomeVisitfromXML(itemEl, factory, domMap);

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
			HomeVisit domainObject = getHomeVisitfromXML(itemEl, factory, domMap);

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
		
	public static HomeVisit getHomeVisitfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHomeVisitfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HomeVisit getHomeVisitfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HomeVisit.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HomeVisit.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HomeVisit class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HomeVisit)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HomeVisit.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HomeVisit ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HomeVisit)factory.getImportedDomainObject(HomeVisit.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HomeVisit();
		}
		String keyClassName = "HomeVisit";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HomeVisit)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HomeVisit obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("visitDate");
		if(fldEl != null)
		{	
    		obj.setVisitDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("houseDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHouseDetails(ims.therapies.homeandenvironmentalvisit.domain.objects.HomeDetails.getHomeDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("therapistPresent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTherapistPresent(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("othersPresent");
		if(fldEl != null)
		{	
    		obj.setOthersPresent(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("homeAssessmentComponent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setHomeAssessmentComponent(ims.therapies.homeandenvironmentalvisit.domain.objects.BathingFacility.fromSetXMLString(fldEl, factory, obj.getHomeAssessmentComponent(), domMap));
		}
		fldEl = el.element("rooms");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setRooms(ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails.fromSetXMLString(fldEl, factory, obj.getRooms(), domMap));
		}
		fldEl = el.element("visitSummary");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVisitSummary(ims.therapies.homeandenvironmentalvisit.domain.objects.VisitSummary.getVisitSummaryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "homeAssessmentComponent"
		, "rooms"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String VisitDate = "visitDate";
		public static final String HouseDetails = "houseDetails";
		public static final String TherapistPresent = "therapistPresent";
		public static final String OthersPresent = "othersPresent";
		public static final String HomeAssessmentComponent = "homeAssessmentComponent";
		public static final String Rooms = "rooms";
		public static final String VisitSummary = "visitSummary";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
	}
}

