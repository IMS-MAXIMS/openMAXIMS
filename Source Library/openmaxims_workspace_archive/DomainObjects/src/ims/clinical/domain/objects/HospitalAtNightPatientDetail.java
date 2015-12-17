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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class HospitalAtNightPatientDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100096;
	private static final long serialVersionUID = 1072100096L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context - Inpatient */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Situation */
	private String situation;
	/** Background */
	private String background;
	/** Assessment */
	private String assessment;
	/** Recommendation */
	private String recommendation;
	/** MEWS */
	private ims.domain.lookups.LookupInstance mEWS;
	/** Type Of Request */
	private ims.domain.lookups.LookupInstance typeOfRequest;
	/** ClinicalTasks
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List clinicalTasks;
	/** Requesting DateTime */
	private java.util.Date requestingDateTime;
	/** Requesting HCP */
	private ims.core.resource.people.domain.objects.Hcp requestingHCP;
	/** Notes
	  * Collection of ims.clinical.domain.objects.HospitalAtNightNotes.
	  */
	private java.util.Set notes;
	/** Ward When Placed On List */
	private ims.core.resource.place.domain.objects.Location wardWhenPlacedOnList;
	/** HospitalAtNightListAndDates */
	private ims.clinical.domain.objects.HospitalAtNightListandDates hospitalAtNightListAndDates;
	/** CurrentStatus */
	private ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus currentStatus;
	/** StatusHistory
	  * Collection of ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus.
	  */
	private java.util.List statusHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HospitalAtNightPatientDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HospitalAtNightPatientDetail ()
    {
    	super();
    }
    public HospitalAtNightPatientDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.HospitalAtNightPatientDetail.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		if ( null != situation && situation.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for situation. Tried to set value: "+
				situation);
		}
		this.situation = situation;
	}

	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		if ( null != background && background.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for background. Tried to set value: "+
				background);
		}
		this.background = background;
	}

	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		if ( null != assessment && assessment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for assessment. Tried to set value: "+
				assessment);
		}
		this.assessment = assessment;
	}

	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		if ( null != recommendation && recommendation.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recommendation. Tried to set value: "+
				recommendation);
		}
		this.recommendation = recommendation;
	}

	public ims.domain.lookups.LookupInstance getMEWS() {
		return mEWS;
	}
	public void setMEWS(ims.domain.lookups.LookupInstance mEWS) {
		this.mEWS = mEWS;
	}

	public ims.domain.lookups.LookupInstance getTypeOfRequest() {
		return typeOfRequest;
	}
	public void setTypeOfRequest(ims.domain.lookups.LookupInstance typeOfRequest) {
		this.typeOfRequest = typeOfRequest;
	}

	public java.util.List getClinicalTasks() {
		if ( null == clinicalTasks ) {
			clinicalTasks = new java.util.ArrayList();
		}
		return clinicalTasks;
	}
	public void setClinicalTasks(java.util.List paramValue) {
		this.clinicalTasks = paramValue;
	}

	public java.util.Date getRequestingDateTime() {
		return requestingDateTime;
	}
	public void setRequestingDateTime(java.util.Date requestingDateTime) {
		this.requestingDateTime = requestingDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getRequestingHCP() {
		return requestingHCP;
	}
	public void setRequestingHCP(ims.core.resource.people.domain.objects.Hcp requestingHCP) {
		this.requestingHCP = requestingHCP;
	}

	public java.util.Set getNotes() {
		if ( null == notes ) {
			notes = new java.util.HashSet();
		}
		return notes;
	}
	public void setNotes(java.util.Set paramValue) {
		this.notes = paramValue;
	}

	public ims.core.resource.place.domain.objects.Location getWardWhenPlacedOnList() {
		return wardWhenPlacedOnList;
	}
	public void setWardWhenPlacedOnList(ims.core.resource.place.domain.objects.Location wardWhenPlacedOnList) {
		this.wardWhenPlacedOnList = wardWhenPlacedOnList;
	}

	public ims.clinical.domain.objects.HospitalAtNightListandDates getHospitalAtNightListAndDates() {
		return hospitalAtNightListAndDates;
	}
	public void setHospitalAtNightListAndDates(ims.clinical.domain.objects.HospitalAtNightListandDates hospitalAtNightListAndDates) {
		this.hospitalAtNightListAndDates = hospitalAtNightListAndDates;
	}

	public ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*situation* :");
		auditStr.append(situation);
	    auditStr.append("; ");
		auditStr.append("\r\n*background* :");
		auditStr.append(background);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		auditStr.append(assessment);
	    auditStr.append("; ");
		auditStr.append("\r\n*recommendation* :");
		auditStr.append(recommendation);
	    auditStr.append("; ");
		auditStr.append("\r\n*mEWS* :");
		if (mEWS != null)
			auditStr.append(mEWS.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*typeOfRequest* :");
		if (typeOfRequest != null)
			auditStr.append(typeOfRequest.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTasks* :");
		if (clinicalTasks != null)
		{
		int i9=0;
		for (i9=0; i9<clinicalTasks.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)clinicalTasks.get(i9);
			auditStr.append(obj.getText());
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestingDateTime* :");
		auditStr.append(requestingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestingHCP* :");
		if (requestingHCP != null)
		{
			auditStr.append(toShortClassName(requestingHCP));
				
		    auditStr.append(requestingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		if (notes != null)
		{
			java.util.Iterator it12 = notes.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.HospitalAtNightNotes obj = (ims.clinical.domain.objects.HospitalAtNightNotes)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wardWhenPlacedOnList* :");
		if (wardWhenPlacedOnList != null)
		{
			auditStr.append(toShortClassName(wardWhenPlacedOnList));
				
		    auditStr.append(wardWhenPlacedOnList.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospitalAtNightListAndDates* :");
		if (hospitalAtNightListAndDates != null)
		{
			auditStr.append(toShortClassName(hospitalAtNightListAndDates));
				
		    auditStr.append(hospitalAtNightListAndDates.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i16=0;
		for (i16=0; i16<statusHistory.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus obj = (ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus)statusHistory.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
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
		
		String keyClassName = "HospitalAtNightPatientDetail";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getSituation() != null)
		{
			sb.append("<situation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSituation().toString()));
			sb.append("</situation>");		
		}
		if (this.getBackground() != null)
		{
			sb.append("<background>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBackground().toString()));
			sb.append("</background>");		
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssessment().toString()));
			sb.append("</assessment>");		
		}
		if (this.getRecommendation() != null)
		{
			sb.append("<recommendation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecommendation().toString()));
			sb.append("</recommendation>");		
		}
		if (this.getMEWS() != null)
		{
			sb.append("<mEWS>");
			sb.append(this.getMEWS().toXMLString()); 
			sb.append("</mEWS>");		
		}
		if (this.getTypeOfRequest() != null)
		{
			sb.append("<typeOfRequest>");
			sb.append(this.getTypeOfRequest().toXMLString()); 
			sb.append("</typeOfRequest>");		
		}
		if (this.getClinicalTasks() != null)
		{
			if (this.getClinicalTasks().size() > 0 )
			{
			sb.append("<clinicalTasks>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getClinicalTasks())); 
			sb.append("</clinicalTasks>");		
			}
		}
		if (this.getRequestingDateTime() != null)
		{
			sb.append("<requestingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRequestingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requestingDateTime>");		
		}
		if (this.getRequestingHCP() != null)
		{
			sb.append("<requestingHCP>");
			sb.append(this.getRequestingHCP().toXMLString(domMap)); 	
			sb.append("</requestingHCP>");		
		}
		if (this.getNotes() != null)
		{
			if (this.getNotes().size() > 0 )
			{
			sb.append("<notes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNotes(), domMap));
			sb.append("</notes>");		
			}
		}
		if (this.getWardWhenPlacedOnList() != null)
		{
			sb.append("<wardWhenPlacedOnList>");
			sb.append(this.getWardWhenPlacedOnList().toXMLString(domMap)); 	
			sb.append("</wardWhenPlacedOnList>");		
		}
		if (this.getHospitalAtNightListAndDates() != null)
		{
			sb.append("<hospitalAtNightListAndDates>");
			sb.append(this.getHospitalAtNightListAndDates().toXMLString(domMap)); 	
			sb.append("</hospitalAtNightListAndDates>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
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
			HospitalAtNightPatientDetail domainObject = getHospitalAtNightPatientDetailfromXML(itemEl, factory, domMap);

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
			HospitalAtNightPatientDetail domainObject = getHospitalAtNightPatientDetailfromXML(itemEl, factory, domMap);

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
		
	public static HospitalAtNightPatientDetail getHospitalAtNightPatientDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHospitalAtNightPatientDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HospitalAtNightPatientDetail getHospitalAtNightPatientDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HospitalAtNightPatientDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HospitalAtNightPatientDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HospitalAtNightPatientDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HospitalAtNightPatientDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HospitalAtNightPatientDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HospitalAtNightPatientDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HospitalAtNightPatientDetail)factory.getImportedDomainObject(HospitalAtNightPatientDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HospitalAtNightPatientDetail();
		}
		String keyClassName = "HospitalAtNightPatientDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HospitalAtNightPatientDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HospitalAtNightPatientDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("situation");
		if(fldEl != null)
		{	
    		obj.setSituation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("background");
		if(fldEl != null)
		{	
    		obj.setBackground(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{	
    		obj.setAssessment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recommendation");
		if(fldEl != null)
		{	
    		obj.setRecommendation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mEWS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMEWS(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("typeOfRequest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTypeOfRequest(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalTasks");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setClinicalTasks(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getClinicalTasks())); 
		}
		fldEl = el.element("requestingDateTime");
		if(fldEl != null)
		{	
    		obj.setRequestingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("requestingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setNotes(ims.clinical.domain.objects.HospitalAtNightNotes.fromSetXMLString(fldEl, factory, obj.getNotes(), domMap));
		}
		fldEl = el.element("wardWhenPlacedOnList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWardWhenPlacedOnList(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospitalAtNightListAndDates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospitalAtNightListAndDates(ims.clinical.domain.objects.HospitalAtNightListandDates.getHospitalAtNightListandDatesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus.getHospitalAtNightPatientDetailStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.clinical.domain.objects.HospitalAtNightPatientDetailStatus.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "clinicalTasks"
		, "notes"
		, "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String Patient = "patient";
		public static final String Situation = "situation";
		public static final String Background = "background";
		public static final String Assessment = "assessment";
		public static final String Recommendation = "recommendation";
		public static final String MEWS = "mEWS";
		public static final String TypeOfRequest = "typeOfRequest";
		public static final String ClinicalTasks = "clinicalTasks";
		public static final String RequestingDateTime = "requestingDateTime";
		public static final String RequestingHCP = "requestingHCP";
		public static final String Notes = "notes";
		public static final String WardWhenPlacedOnList = "wardWhenPlacedOnList";
		public static final String HospitalAtNightListAndDates = "hospitalAtNightListAndDates";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
	}
}

