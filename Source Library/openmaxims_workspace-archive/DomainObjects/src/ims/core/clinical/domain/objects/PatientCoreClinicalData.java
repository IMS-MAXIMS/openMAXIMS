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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientCoreClinicalData extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100083;
	private static final long serialVersionUID = 1003100083L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Allergy Status */
	private ims.domain.lookups.LookupInstance allergyStatus;
	/** AllergyAuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation allergyAuthoringInformation;
	private Integer noAllergyWhenIdentified;
	/** Source of information */
	private ims.domain.lookups.LookupInstance noAllergySourceofInformation;
	/** Alert Status */
	private ims.domain.lookups.LookupInstance alertStatus;
	/** AlertAuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation alertAuthoringInformation;
	private Integer noAlertWhenIdentified;
	/** Source of information */
	private ims.domain.lookups.LookupInstance noAlertSourceofInformation;
	/** Support Network Professional Status */
	private ims.domain.lookups.LookupInstance supportNetworkStatus;
	/** SnStatusAuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation snStatusAuthoringInformation;
	/** Support Network Services Status */
	private ims.domain.lookups.LookupInstance supportNetworkServiceStatus;
	/** SnServiceAuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation snServiceAuthoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCoreClinicalData (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCoreClinicalData ()
    {
    	super();
    }
    public PatientCoreClinicalData (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientCoreClinicalData.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static PatientCoreClinicalData getPatientCoreClinicalDataFromPatient(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from PatientCoreClinicalData c where c.patient.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PatientCoreClinicalData.patient.id = " + id + " returned " + l.size() + " records. " );
		return (PatientCoreClinicalData)l.get(0);
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.domain.lookups.LookupInstance getAllergyStatus() {
		return allergyStatus;
	}
	public void setAllergyStatus(ims.domain.lookups.LookupInstance allergyStatus) {
		this.allergyStatus = allergyStatus;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAllergyAuthoringInformation() {
		return allergyAuthoringInformation;
	}
	public void setAllergyAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation allergyAuthoringInformation) {
		this.allergyAuthoringInformation = allergyAuthoringInformation;
	}

	public Integer getNoAllergyWhenIdentified() {
		return noAllergyWhenIdentified;
	}
	public void setNoAllergyWhenIdentified(Integer noAllergyWhenIdentified) {
		this.noAllergyWhenIdentified = noAllergyWhenIdentified;
	}

	public ims.domain.lookups.LookupInstance getNoAllergySourceofInformation() {
		return noAllergySourceofInformation;
	}
	public void setNoAllergySourceofInformation(ims.domain.lookups.LookupInstance noAllergySourceofInformation) {
		this.noAllergySourceofInformation = noAllergySourceofInformation;
	}

	public ims.domain.lookups.LookupInstance getAlertStatus() {
		return alertStatus;
	}
	public void setAlertStatus(ims.domain.lookups.LookupInstance alertStatus) {
		this.alertStatus = alertStatus;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAlertAuthoringInformation() {
		return alertAuthoringInformation;
	}
	public void setAlertAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation alertAuthoringInformation) {
		this.alertAuthoringInformation = alertAuthoringInformation;
	}

	public Integer getNoAlertWhenIdentified() {
		return noAlertWhenIdentified;
	}
	public void setNoAlertWhenIdentified(Integer noAlertWhenIdentified) {
		this.noAlertWhenIdentified = noAlertWhenIdentified;
	}

	public ims.domain.lookups.LookupInstance getNoAlertSourceofInformation() {
		return noAlertSourceofInformation;
	}
	public void setNoAlertSourceofInformation(ims.domain.lookups.LookupInstance noAlertSourceofInformation) {
		this.noAlertSourceofInformation = noAlertSourceofInformation;
	}

	public ims.domain.lookups.LookupInstance getSupportNetworkStatus() {
		return supportNetworkStatus;
	}
	public void setSupportNetworkStatus(ims.domain.lookups.LookupInstance supportNetworkStatus) {
		this.supportNetworkStatus = supportNetworkStatus;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getSnStatusAuthoringInformation() {
		return snStatusAuthoringInformation;
	}
	public void setSnStatusAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation snStatusAuthoringInformation) {
		this.snStatusAuthoringInformation = snStatusAuthoringInformation;
	}

	public ims.domain.lookups.LookupInstance getSupportNetworkServiceStatus() {
		return supportNetworkServiceStatus;
	}
	public void setSupportNetworkServiceStatus(ims.domain.lookups.LookupInstance supportNetworkServiceStatus) {
		this.supportNetworkServiceStatus = supportNetworkServiceStatus;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getSnServiceAuthoringInformation() {
		return snServiceAuthoringInformation;
	}
	public void setSnServiceAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation snServiceAuthoringInformation) {
		this.snServiceAuthoringInformation = snServiceAuthoringInformation;
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
		auditStr.append("\r\n*allergyStatus* :");
		if (allergyStatus != null)
			auditStr.append(allergyStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allergyAuthoringInformation* :");
		if (allergyAuthoringInformation != null)
		{
			auditStr.append(toShortClassName(allergyAuthoringInformation));
				
		    auditStr.append(allergyAuthoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noAllergyWhenIdentified* :");
		auditStr.append(noAllergyWhenIdentified);
	    auditStr.append("; ");
		auditStr.append("\r\n*noAllergySourceofInformation* :");
		if (noAllergySourceofInformation != null)
			auditStr.append(noAllergySourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*alertStatus* :");
		if (alertStatus != null)
			auditStr.append(alertStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*alertAuthoringInformation* :");
		if (alertAuthoringInformation != null)
		{
			auditStr.append(toShortClassName(alertAuthoringInformation));
				
		    auditStr.append(alertAuthoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noAlertWhenIdentified* :");
		auditStr.append(noAlertWhenIdentified);
	    auditStr.append("; ");
		auditStr.append("\r\n*noAlertSourceofInformation* :");
		if (noAlertSourceofInformation != null)
			auditStr.append(noAlertSourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*supportNetworkStatus* :");
		if (supportNetworkStatus != null)
			auditStr.append(supportNetworkStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*snStatusAuthoringInformation* :");
		if (snStatusAuthoringInformation != null)
		{
			auditStr.append(toShortClassName(snStatusAuthoringInformation));
				
		    auditStr.append(snStatusAuthoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*supportNetworkServiceStatus* :");
		if (supportNetworkServiceStatus != null)
			auditStr.append(supportNetworkServiceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*snServiceAuthoringInformation* :");
		if (snServiceAuthoringInformation != null)
		{
			auditStr.append(toShortClassName(snServiceAuthoringInformation));
				
		    auditStr.append(snServiceAuthoringInformation.toString());
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
		
		String keyClassName = "PatientCoreClinicalData";
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
		if (this.getAllergyStatus() != null)
		{
			sb.append("<allergyStatus>");
			sb.append(this.getAllergyStatus().toXMLString()); 
			sb.append("</allergyStatus>");		
		}
		if (this.getAllergyAuthoringInformation() != null)
		{
			sb.append("<allergyAuthoringInformation>");
			sb.append(this.getAllergyAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</allergyAuthoringInformation>");		
		}
		if (this.getNoAllergyWhenIdentified() != null)
		{
			sb.append("<noAllergyWhenIdentified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoAllergyWhenIdentified().toString()));
			sb.append("</noAllergyWhenIdentified>");		
		}
		if (this.getNoAllergySourceofInformation() != null)
		{
			sb.append("<noAllergySourceofInformation>");
			sb.append(this.getNoAllergySourceofInformation().toXMLString()); 
			sb.append("</noAllergySourceofInformation>");		
		}
		if (this.getAlertStatus() != null)
		{
			sb.append("<alertStatus>");
			sb.append(this.getAlertStatus().toXMLString()); 
			sb.append("</alertStatus>");		
		}
		if (this.getAlertAuthoringInformation() != null)
		{
			sb.append("<alertAuthoringInformation>");
			sb.append(this.getAlertAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</alertAuthoringInformation>");		
		}
		if (this.getNoAlertWhenIdentified() != null)
		{
			sb.append("<noAlertWhenIdentified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoAlertWhenIdentified().toString()));
			sb.append("</noAlertWhenIdentified>");		
		}
		if (this.getNoAlertSourceofInformation() != null)
		{
			sb.append("<noAlertSourceofInformation>");
			sb.append(this.getNoAlertSourceofInformation().toXMLString()); 
			sb.append("</noAlertSourceofInformation>");		
		}
		if (this.getSupportNetworkStatus() != null)
		{
			sb.append("<supportNetworkStatus>");
			sb.append(this.getSupportNetworkStatus().toXMLString()); 
			sb.append("</supportNetworkStatus>");		
		}
		if (this.getSnStatusAuthoringInformation() != null)
		{
			sb.append("<snStatusAuthoringInformation>");
			sb.append(this.getSnStatusAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</snStatusAuthoringInformation>");		
		}
		if (this.getSupportNetworkServiceStatus() != null)
		{
			sb.append("<supportNetworkServiceStatus>");
			sb.append(this.getSupportNetworkServiceStatus().toXMLString()); 
			sb.append("</supportNetworkServiceStatus>");		
		}
		if (this.getSnServiceAuthoringInformation() != null)
		{
			sb.append("<snServiceAuthoringInformation>");
			sb.append(this.getSnServiceAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</snServiceAuthoringInformation>");		
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
			PatientCoreClinicalData domainObject = getPatientCoreClinicalDatafromXML(itemEl, factory, domMap);

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
			PatientCoreClinicalData domainObject = getPatientCoreClinicalDatafromXML(itemEl, factory, domMap);

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
		
	public static PatientCoreClinicalData getPatientCoreClinicalDatafromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCoreClinicalDatafromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCoreClinicalData getPatientCoreClinicalDatafromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCoreClinicalData.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCoreClinicalData.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCoreClinicalData class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCoreClinicalData)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCoreClinicalData.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCoreClinicalData ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCoreClinicalData)factory.getImportedDomainObject(PatientCoreClinicalData.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCoreClinicalData();
		}
		String keyClassName = "PatientCoreClinicalData";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCoreClinicalData)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCoreClinicalData obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allergyStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAllergyStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allergyAuthoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllergyAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noAllergyWhenIdentified");
		if(fldEl != null)
		{	
    		obj.setNoAllergyWhenIdentified(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noAllergySourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoAllergySourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("alertStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAlertStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("alertAuthoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAlertAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noAlertWhenIdentified");
		if(fldEl != null)
		{	
    		obj.setNoAlertWhenIdentified(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noAlertSourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNoAlertSourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("supportNetworkStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupportNetworkStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("snStatusAuthoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSnStatusAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("supportNetworkServiceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupportNetworkServiceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("snServiceAuthoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSnServiceAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String Patient = "patient";
		public static final String AllergyStatus = "allergyStatus";
		public static final String AllergyAuthoringInformation = "allergyAuthoringInformation";
		public static final String NoAllergyWhenIdentified = "noAllergyWhenIdentified";
		public static final String NoAllergySourceofInformation = "noAllergySourceofInformation";
		public static final String AlertStatus = "alertStatus";
		public static final String AlertAuthoringInformation = "alertAuthoringInformation";
		public static final String NoAlertWhenIdentified = "noAlertWhenIdentified";
		public static final String NoAlertSourceofInformation = "noAlertSourceofInformation";
		public static final String SupportNetworkStatus = "supportNetworkStatus";
		public static final String SnStatusAuthoringInformation = "snStatusAuthoringInformation";
		public static final String SupportNetworkServiceStatus = "supportNetworkServiceStatus";
		public static final String SnServiceAuthoringInformation = "snServiceAuthoringInformation";
	}
}

