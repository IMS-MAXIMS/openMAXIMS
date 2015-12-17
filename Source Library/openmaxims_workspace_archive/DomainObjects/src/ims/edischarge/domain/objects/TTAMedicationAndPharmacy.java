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


public class TTAMedicationAndPharmacy extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100015;
	private static final long serialVersionUID = 1099100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** BodyWeightKg */
	private java.lang.Float bodyWeightKg;
	/** Clinical CommentsTo Pharmacy */
	private String clinicalCommentsToPharmacy;
	/** Ordering Clinician */
	private ims.core.resource.people.domain.objects.Hcp orderingClinician;
	/** Ordering Date Time */
	private java.util.Date orderingDateTime;
	/** Clinician Bleep No */
	private String clinicianBleepNo;
	/** Current TTA Status */
	private ims.edischarge.domain.objects.TTAStatus currentTTAStatus;
	/** Current TTA Status
	  * Collection of ims.edischarge.domain.objects.TTAStatus.
	  */
	private java.util.Set tTAStatusHistory;
	/** TTA Medications
	  * Collection of ims.edischarge.domain.objects.TTAMedicationDetail.
	  */
	private java.util.List tTAMedications;
	/** Responsible Pharmacist */
	private ims.core.resource.people.domain.objects.Hcp responsiblePharmacist;
	/** Date Submitted To Pharmacy */
	private java.util.Date dateSubmittedToPharmacy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TTAMedicationAndPharmacy (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TTAMedicationAndPharmacy ()
    {
    	super();
    }
    public TTAMedicationAndPharmacy (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.TTAMedicationAndPharmacy.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.lang.Float getBodyWeightKg() {
		return bodyWeightKg;
	}
	public void setBodyWeightKg(java.lang.Float bodyWeightKg) {
		this.bodyWeightKg = bodyWeightKg;
	}

	public String getClinicalCommentsToPharmacy() {
		return clinicalCommentsToPharmacy;
	}
	public void setClinicalCommentsToPharmacy(String clinicalCommentsToPharmacy) {
		if ( null != clinicalCommentsToPharmacy && clinicalCommentsToPharmacy.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clinicalCommentsToPharmacy. Tried to set value: "+
				clinicalCommentsToPharmacy);
		}
		this.clinicalCommentsToPharmacy = clinicalCommentsToPharmacy;
	}

	public ims.core.resource.people.domain.objects.Hcp getOrderingClinician() {
		return orderingClinician;
	}
	public void setOrderingClinician(ims.core.resource.people.domain.objects.Hcp orderingClinician) {
		this.orderingClinician = orderingClinician;
	}

	public java.util.Date getOrderingDateTime() {
		return orderingDateTime;
	}
	public void setOrderingDateTime(java.util.Date orderingDateTime) {
		this.orderingDateTime = orderingDateTime;
	}

	public String getClinicianBleepNo() {
		return clinicianBleepNo;
	}
	public void setClinicianBleepNo(String clinicianBleepNo) {
		if ( null != clinicianBleepNo && clinicianBleepNo.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clinicianBleepNo. Tried to set value: "+
				clinicianBleepNo);
		}
		this.clinicianBleepNo = clinicianBleepNo;
	}

	public ims.edischarge.domain.objects.TTAStatus getCurrentTTAStatus() {
		return currentTTAStatus;
	}
	public void setCurrentTTAStatus(ims.edischarge.domain.objects.TTAStatus currentTTAStatus) {
		this.currentTTAStatus = currentTTAStatus;
	}

	public java.util.Set getTTAStatusHistory() {
		if ( null == tTAStatusHistory ) {
			tTAStatusHistory = new java.util.HashSet();
		}
		return tTAStatusHistory;
	}
	public void setTTAStatusHistory(java.util.Set paramValue) {
		this.tTAStatusHistory = paramValue;
	}

	public java.util.List getTTAMedications() {
		if ( null == tTAMedications ) {
			tTAMedications = new java.util.ArrayList();
		}
		return tTAMedications;
	}
	public void setTTAMedications(java.util.List paramValue) {
		this.tTAMedications = paramValue;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsiblePharmacist() {
		return responsiblePharmacist;
	}
	public void setResponsiblePharmacist(ims.core.resource.people.domain.objects.Hcp responsiblePharmacist) {
		this.responsiblePharmacist = responsiblePharmacist;
	}

	public java.util.Date getDateSubmittedToPharmacy() {
		return dateSubmittedToPharmacy;
	}
	public void setDateSubmittedToPharmacy(java.util.Date dateSubmittedToPharmacy) {
		this.dateSubmittedToPharmacy = dateSubmittedToPharmacy;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bodyWeightKg* :");
		auditStr.append(bodyWeightKg);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalCommentsToPharmacy* :");
		auditStr.append(clinicalCommentsToPharmacy);
	    auditStr.append("; ");
		auditStr.append("\r\n*orderingClinician* :");
		if (orderingClinician != null)
		{
			auditStr.append(toShortClassName(orderingClinician));
				
		    auditStr.append(orderingClinician.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderingDateTime* :");
		auditStr.append(orderingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicianBleepNo* :");
		auditStr.append(clinicianBleepNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentTTAStatus* :");
		if (currentTTAStatus != null)
		{
			auditStr.append(toShortClassName(currentTTAStatus));
				
		    auditStr.append(currentTTAStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tTAStatusHistory* :");
		if (tTAStatusHistory != null)
		{
			java.util.Iterator it9 = tTAStatusHistory.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.edischarge.domain.objects.TTAStatus obj = (ims.edischarge.domain.objects.TTAStatus)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tTAMedications* :");
		if (tTAMedications != null)
		{
		int i10=0;
		for (i10=0; i10<tTAMedications.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.edischarge.domain.objects.TTAMedicationDetail obj = (ims.edischarge.domain.objects.TTAMedicationDetail)tTAMedications.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsiblePharmacist* :");
		if (responsiblePharmacist != null)
		{
			auditStr.append(toShortClassName(responsiblePharmacist));
				
		    auditStr.append(responsiblePharmacist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateSubmittedToPharmacy* :");
		auditStr.append(dateSubmittedToPharmacy);
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
		
		String keyClassName = "TTAMedicationAndPharmacy";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getBodyWeightKg() != null)
		{
			sb.append("<bodyWeightKg>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBodyWeightKg().toString()));
			sb.append("</bodyWeightKg>");		
		}
		if (this.getClinicalCommentsToPharmacy() != null)
		{
			sb.append("<clinicalCommentsToPharmacy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalCommentsToPharmacy().toString()));
			sb.append("</clinicalCommentsToPharmacy>");		
		}
		if (this.getOrderingClinician() != null)
		{
			sb.append("<orderingClinician>");
			sb.append(this.getOrderingClinician().toXMLString(domMap)); 	
			sb.append("</orderingClinician>");		
		}
		if (this.getOrderingDateTime() != null)
		{
			sb.append("<orderingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getOrderingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</orderingDateTime>");		
		}
		if (this.getClinicianBleepNo() != null)
		{
			sb.append("<clinicianBleepNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicianBleepNo().toString()));
			sb.append("</clinicianBleepNo>");		
		}
		if (this.getCurrentTTAStatus() != null)
		{
			sb.append("<currentTTAStatus>");
			sb.append(this.getCurrentTTAStatus().toXMLString(domMap)); 	
			sb.append("</currentTTAStatus>");		
		}
		if (this.getTTAStatusHistory() != null)
		{
			if (this.getTTAStatusHistory().size() > 0 )
			{
			sb.append("<tTAStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTTAStatusHistory(), domMap));
			sb.append("</tTAStatusHistory>");		
			}
		}
		if (this.getTTAMedications() != null)
		{
			if (this.getTTAMedications().size() > 0 )
			{
			sb.append("<tTAMedications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTTAMedications(), domMap));
			sb.append("</tTAMedications>");		
			}
		}
		if (this.getResponsiblePharmacist() != null)
		{
			sb.append("<responsiblePharmacist>");
			sb.append(this.getResponsiblePharmacist().toXMLString(domMap)); 	
			sb.append("</responsiblePharmacist>");		
		}
		if (this.getDateSubmittedToPharmacy() != null)
		{
			sb.append("<dateSubmittedToPharmacy>");
			sb.append(new ims.framework.utils.DateTime(this.getDateSubmittedToPharmacy()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateSubmittedToPharmacy>");		
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
			TTAMedicationAndPharmacy domainObject = getTTAMedicationAndPharmacyfromXML(itemEl, factory, domMap);

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
			TTAMedicationAndPharmacy domainObject = getTTAMedicationAndPharmacyfromXML(itemEl, factory, domMap);

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
		
	public static TTAMedicationAndPharmacy getTTAMedicationAndPharmacyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTTAMedicationAndPharmacyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TTAMedicationAndPharmacy getTTAMedicationAndPharmacyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TTAMedicationAndPharmacy.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TTAMedicationAndPharmacy.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TTAMedicationAndPharmacy class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TTAMedicationAndPharmacy)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TTAMedicationAndPharmacy.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TTAMedicationAndPharmacy ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TTAMedicationAndPharmacy)factory.getImportedDomainObject(TTAMedicationAndPharmacy.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TTAMedicationAndPharmacy();
		}
		String keyClassName = "TTAMedicationAndPharmacy";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TTAMedicationAndPharmacy)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TTAMedicationAndPharmacy obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bodyWeightKg");
		if(fldEl != null)
		{	
    		obj.setBodyWeightKg(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalCommentsToPharmacy");
		if(fldEl != null)
		{	
    		obj.setClinicalCommentsToPharmacy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orderingClinician");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderingClinician(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("orderingDateTime");
		if(fldEl != null)
		{	
    		obj.setOrderingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinicianBleepNo");
		if(fldEl != null)
		{	
    		obj.setClinicianBleepNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentTTAStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentTTAStatus(ims.edischarge.domain.objects.TTAStatus.getTTAStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tTAStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTTAStatusHistory(ims.edischarge.domain.objects.TTAStatus.fromSetXMLString(fldEl, factory, obj.getTTAStatusHistory(), domMap));
		}
		fldEl = el.element("tTAMedications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTTAMedications(ims.edischarge.domain.objects.TTAMedicationDetail.fromListXMLString(fldEl, factory, obj.getTTAMedications(), domMap));
		}
		fldEl = el.element("responsiblePharmacist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsiblePharmacist(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateSubmittedToPharmacy");
		if(fldEl != null)
		{	
    		obj.setDateSubmittedToPharmacy(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "tTAStatusHistory"
		, "tTAMedications"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String BodyWeightKg = "bodyWeightKg";
		public static final String ClinicalCommentsToPharmacy = "clinicalCommentsToPharmacy";
		public static final String OrderingClinician = "orderingClinician";
		public static final String OrderingDateTime = "orderingDateTime";
		public static final String ClinicianBleepNo = "clinicianBleepNo";
		public static final String CurrentTTAStatus = "currentTTAStatus";
		public static final String TTAStatusHistory = "tTAStatusHistory";
		public static final String TTAMedications = "tTAMedications";
		public static final String ResponsiblePharmacist = "responsiblePharmacist";
		public static final String DateSubmittedToPharmacy = "dateSubmittedToPharmacy";
	}
}

