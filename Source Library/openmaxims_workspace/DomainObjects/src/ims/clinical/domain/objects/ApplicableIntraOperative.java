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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ApplicableIntraOperative extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100131;
	private static final long serialVersionUID = 1072100131L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Theatre Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointment;
	/** Display Planned Procedures */
	private Boolean displayPlannedProcedures;
	/** Display Anaesthetic Details */
	private Boolean displayAnaestheticDetails;
	/** Display Preperation and Positioning */
	private Boolean displayPrepAndPositioning;
	/** Display Diathermy and Laster */
	private Boolean displayDiathermyAndLaser;
	/** Display Irrigant Catheters */
	private Boolean displayIrrigantCatheters;
	/** Display Specimen Wounds */
	private Boolean displaySpecimenWounds;
	/** Display Implants Arterial */
	private Boolean displayImplantsArterial;
	/** Display Tourniquet */
	private Boolean displayTourniquet;
	/** Display Counts and Occurances */
	private Boolean displayCountsOccurances;
	/** Display Performed Procedures */
	private Boolean displayPerformedProcedures;
	/** Display PACU */
	private Boolean displayPACU;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ApplicableIntraOperative (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ApplicableIntraOperative ()
    {
    	super();
    }
    public ApplicableIntraOperative (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.ApplicableIntraOperative.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointment() {
		return theatreAppointment;
	}
	public static ApplicableIntraOperative getApplicableIntraOperativeFromTheatreAppointment(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from ApplicableIntraOperative c where c.theatreAppointment.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ApplicableIntraOperative.theatreAppointment.id = " + id + " returned " + l.size() + " records. " );
		return (ApplicableIntraOperative)l.get(0);
	}
	public void setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment theatreAppointment) {
		this.theatreAppointment = theatreAppointment;
	}

	public Boolean isDisplayPlannedProcedures() {
		return displayPlannedProcedures;
	}
	public void setDisplayPlannedProcedures(Boolean displayPlannedProcedures) {
		this.displayPlannedProcedures = displayPlannedProcedures;
	}

	public Boolean isDisplayAnaestheticDetails() {
		return displayAnaestheticDetails;
	}
	public void setDisplayAnaestheticDetails(Boolean displayAnaestheticDetails) {
		this.displayAnaestheticDetails = displayAnaestheticDetails;
	}

	public Boolean isDisplayPrepAndPositioning() {
		return displayPrepAndPositioning;
	}
	public void setDisplayPrepAndPositioning(Boolean displayPrepAndPositioning) {
		this.displayPrepAndPositioning = displayPrepAndPositioning;
	}

	public Boolean isDisplayDiathermyAndLaser() {
		return displayDiathermyAndLaser;
	}
	public void setDisplayDiathermyAndLaser(Boolean displayDiathermyAndLaser) {
		this.displayDiathermyAndLaser = displayDiathermyAndLaser;
	}

	public Boolean isDisplayIrrigantCatheters() {
		return displayIrrigantCatheters;
	}
	public void setDisplayIrrigantCatheters(Boolean displayIrrigantCatheters) {
		this.displayIrrigantCatheters = displayIrrigantCatheters;
	}

	public Boolean isDisplaySpecimenWounds() {
		return displaySpecimenWounds;
	}
	public void setDisplaySpecimenWounds(Boolean displaySpecimenWounds) {
		this.displaySpecimenWounds = displaySpecimenWounds;
	}

	public Boolean isDisplayImplantsArterial() {
		return displayImplantsArterial;
	}
	public void setDisplayImplantsArterial(Boolean displayImplantsArterial) {
		this.displayImplantsArterial = displayImplantsArterial;
	}

	public Boolean isDisplayTourniquet() {
		return displayTourniquet;
	}
	public void setDisplayTourniquet(Boolean displayTourniquet) {
		this.displayTourniquet = displayTourniquet;
	}

	public Boolean isDisplayCountsOccurances() {
		return displayCountsOccurances;
	}
	public void setDisplayCountsOccurances(Boolean displayCountsOccurances) {
		this.displayCountsOccurances = displayCountsOccurances;
	}

	public Boolean isDisplayPerformedProcedures() {
		return displayPerformedProcedures;
	}
	public void setDisplayPerformedProcedures(Boolean displayPerformedProcedures) {
		this.displayPerformedProcedures = displayPerformedProcedures;
	}

	public Boolean isDisplayPACU() {
		return displayPACU;
	}
	public void setDisplayPACU(Boolean displayPACU) {
		this.displayPACU = displayPACU;
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
		
		auditStr.append("\r\n*theatreAppointment* :");
		if (theatreAppointment != null)
		{
			auditStr.append(toShortClassName(theatreAppointment));
				
		    auditStr.append(theatreAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*displayPlannedProcedures* :");
		auditStr.append(displayPlannedProcedures);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayAnaestheticDetails* :");
		auditStr.append(displayAnaestheticDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayPrepAndPositioning* :");
		auditStr.append(displayPrepAndPositioning);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayDiathermyAndLaser* :");
		auditStr.append(displayDiathermyAndLaser);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayIrrigantCatheters* :");
		auditStr.append(displayIrrigantCatheters);
	    auditStr.append("; ");
		auditStr.append("\r\n*displaySpecimenWounds* :");
		auditStr.append(displaySpecimenWounds);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayImplantsArterial* :");
		auditStr.append(displayImplantsArterial);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayTourniquet* :");
		auditStr.append(displayTourniquet);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayCountsOccurances* :");
		auditStr.append(displayCountsOccurances);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayPerformedProcedures* :");
		auditStr.append(displayPerformedProcedures);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayPACU* :");
		auditStr.append(displayPACU);
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
		
		String keyClassName = "ApplicableIntraOperative";
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
		if (this.getTheatreAppointment() != null)
		{
			sb.append("<theatreAppointment>");
			sb.append(this.getTheatreAppointment().toXMLString(domMap)); 	
			sb.append("</theatreAppointment>");		
		}
		if (this.isDisplayPlannedProcedures() != null)
		{
			sb.append("<displayPlannedProcedures>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayPlannedProcedures().toString()));
			sb.append("</displayPlannedProcedures>");		
		}
		if (this.isDisplayAnaestheticDetails() != null)
		{
			sb.append("<displayAnaestheticDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayAnaestheticDetails().toString()));
			sb.append("</displayAnaestheticDetails>");		
		}
		if (this.isDisplayPrepAndPositioning() != null)
		{
			sb.append("<displayPrepAndPositioning>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayPrepAndPositioning().toString()));
			sb.append("</displayPrepAndPositioning>");		
		}
		if (this.isDisplayDiathermyAndLaser() != null)
		{
			sb.append("<displayDiathermyAndLaser>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayDiathermyAndLaser().toString()));
			sb.append("</displayDiathermyAndLaser>");		
		}
		if (this.isDisplayIrrigantCatheters() != null)
		{
			sb.append("<displayIrrigantCatheters>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayIrrigantCatheters().toString()));
			sb.append("</displayIrrigantCatheters>");		
		}
		if (this.isDisplaySpecimenWounds() != null)
		{
			sb.append("<displaySpecimenWounds>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplaySpecimenWounds().toString()));
			sb.append("</displaySpecimenWounds>");		
		}
		if (this.isDisplayImplantsArterial() != null)
		{
			sb.append("<displayImplantsArterial>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayImplantsArterial().toString()));
			sb.append("</displayImplantsArterial>");		
		}
		if (this.isDisplayTourniquet() != null)
		{
			sb.append("<displayTourniquet>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayTourniquet().toString()));
			sb.append("</displayTourniquet>");		
		}
		if (this.isDisplayCountsOccurances() != null)
		{
			sb.append("<displayCountsOccurances>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayCountsOccurances().toString()));
			sb.append("</displayCountsOccurances>");		
		}
		if (this.isDisplayPerformedProcedures() != null)
		{
			sb.append("<displayPerformedProcedures>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayPerformedProcedures().toString()));
			sb.append("</displayPerformedProcedures>");		
		}
		if (this.isDisplayPACU() != null)
		{
			sb.append("<displayPACU>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayPACU().toString()));
			sb.append("</displayPACU>");		
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
			ApplicableIntraOperative domainObject = getApplicableIntraOperativefromXML(itemEl, factory, domMap);

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
			ApplicableIntraOperative domainObject = getApplicableIntraOperativefromXML(itemEl, factory, domMap);

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
		
	public static ApplicableIntraOperative getApplicableIntraOperativefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getApplicableIntraOperativefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ApplicableIntraOperative getApplicableIntraOperativefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ApplicableIntraOperative.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ApplicableIntraOperative.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ApplicableIntraOperative class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ApplicableIntraOperative)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ApplicableIntraOperative.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ApplicableIntraOperative ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ApplicableIntraOperative)factory.getImportedDomainObject(ApplicableIntraOperative.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ApplicableIntraOperative();
		}
		String keyClassName = "ApplicableIntraOperative";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ApplicableIntraOperative)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ApplicableIntraOperative obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("theatreAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("displayPlannedProcedures");
		if(fldEl != null)
		{	
    		obj.setDisplayPlannedProcedures(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayAnaestheticDetails");
		if(fldEl != null)
		{	
    		obj.setDisplayAnaestheticDetails(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayPrepAndPositioning");
		if(fldEl != null)
		{	
    		obj.setDisplayPrepAndPositioning(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayDiathermyAndLaser");
		if(fldEl != null)
		{	
    		obj.setDisplayDiathermyAndLaser(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayIrrigantCatheters");
		if(fldEl != null)
		{	
    		obj.setDisplayIrrigantCatheters(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displaySpecimenWounds");
		if(fldEl != null)
		{	
    		obj.setDisplaySpecimenWounds(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayImplantsArterial");
		if(fldEl != null)
		{	
    		obj.setDisplayImplantsArterial(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayTourniquet");
		if(fldEl != null)
		{	
    		obj.setDisplayTourniquet(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayCountsOccurances");
		if(fldEl != null)
		{	
    		obj.setDisplayCountsOccurances(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayPerformedProcedures");
		if(fldEl != null)
		{	
    		obj.setDisplayPerformedProcedures(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayPACU");
		if(fldEl != null)
		{	
    		obj.setDisplayPACU(new Boolean(fldEl.getTextTrim()));	
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
		public static final String TheatreAppointment = "theatreAppointment";
		public static final String DisplayPlannedProcedures = "displayPlannedProcedures";
		public static final String DisplayAnaestheticDetails = "displayAnaestheticDetails";
		public static final String DisplayPrepAndPositioning = "displayPrepAndPositioning";
		public static final String DisplayDiathermyAndLaser = "displayDiathermyAndLaser";
		public static final String DisplayIrrigantCatheters = "displayIrrigantCatheters";
		public static final String DisplaySpecimenWounds = "displaySpecimenWounds";
		public static final String DisplayImplantsArterial = "displayImplantsArterial";
		public static final String DisplayTourniquet = "displayTourniquet";
		public static final String DisplayCountsOccurances = "displayCountsOccurances";
		public static final String DisplayPerformedProcedures = "displayPerformedProcedures";
		public static final String DisplayPACU = "displayPACU";
	}
}

