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
package ims.core.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class PatientSummaryRecord extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1000100005;
	private static final long serialVersionUID = 1000100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Which patient is this record for */
	private ims.core.patient.domain.objects.Patient patient;
	/** The most recent Pre-Op VTE Assessment for this patient */
	private ims.core.clinical.domain.objects.VTERiskAssessment preOpVTEAssessment;
	/** When was the VTEPreOp Completed */
	private java.util.Date preOpVTECompletedDate;
	/** When is this Pre-OP VTE Valid Until */
	private java.util.Date preOpVTEValidationDate;
	/** The most recent Inpatient VTE Assessment */
	private ims.core.clinical.domain.objects.VTERiskAssessment inpatientVTEAssessment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientSummaryRecord (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientSummaryRecord ()
    {
    	super();
    }
    public PatientSummaryRecord (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.domain.objects.PatientSummaryRecord.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static PatientSummaryRecord getPatientSummaryRecordFromPatient(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from PatientSummaryRecord c where c.patient.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PatientSummaryRecord.patient.id = " + id + " returned " + l.size() + " records. " );
		return (PatientSummaryRecord)l.get(0);
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.VTERiskAssessment getPreOpVTEAssessment() {
		return preOpVTEAssessment;
	}
	public void setPreOpVTEAssessment(ims.core.clinical.domain.objects.VTERiskAssessment preOpVTEAssessment) {
		this.preOpVTEAssessment = preOpVTEAssessment;
	}

	public java.util.Date getPreOpVTECompletedDate() {
		return preOpVTECompletedDate;
	}
	public void setPreOpVTECompletedDate(java.util.Date preOpVTECompletedDate) {
		this.preOpVTECompletedDate = preOpVTECompletedDate;
	}

	public java.util.Date getPreOpVTEValidationDate() {
		return preOpVTEValidationDate;
	}
	public void setPreOpVTEValidationDate(java.util.Date preOpVTEValidationDate) {
		this.preOpVTEValidationDate = preOpVTEValidationDate;
	}

	public ims.core.clinical.domain.objects.VTERiskAssessment getInpatientVTEAssessment() {
		return inpatientVTEAssessment;
	}
	public void setInpatientVTEAssessment(ims.core.clinical.domain.objects.VTERiskAssessment inpatientVTEAssessment) {
		this.inpatientVTEAssessment = inpatientVTEAssessment;
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
		auditStr.append("\r\n*preOpVTEAssessment* :");
		if (preOpVTEAssessment != null)
		{
			auditStr.append(toShortClassName(preOpVTEAssessment));
				
		    auditStr.append(preOpVTEAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpVTECompletedDate* :");
		auditStr.append(preOpVTECompletedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpVTEValidationDate* :");
		auditStr.append(preOpVTEValidationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*inpatientVTEAssessment* :");
		if (inpatientVTEAssessment != null)
		{
			auditStr.append(toShortClassName(inpatientVTEAssessment));
				
		    auditStr.append(inpatientVTEAssessment.getId());
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
		
		String keyClassName = "PatientSummaryRecord";
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
		if (this.getPreOpVTEAssessment() != null)
		{
			sb.append("<preOpVTEAssessment>");
			sb.append(this.getPreOpVTEAssessment().toXMLString(domMap)); 	
			sb.append("</preOpVTEAssessment>");		
		}
		if (this.getPreOpVTECompletedDate() != null)
		{
			sb.append("<preOpVTECompletedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPreOpVTECompletedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</preOpVTECompletedDate>");		
		}
		if (this.getPreOpVTEValidationDate() != null)
		{
			sb.append("<preOpVTEValidationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPreOpVTEValidationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</preOpVTEValidationDate>");		
		}
		if (this.getInpatientVTEAssessment() != null)
		{
			sb.append("<inpatientVTEAssessment>");
			sb.append(this.getInpatientVTEAssessment().toXMLString(domMap)); 	
			sb.append("</inpatientVTEAssessment>");		
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
			PatientSummaryRecord domainObject = getPatientSummaryRecordfromXML(itemEl, factory, domMap);

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
			PatientSummaryRecord domainObject = getPatientSummaryRecordfromXML(itemEl, factory, domMap);

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
		
	public static PatientSummaryRecord getPatientSummaryRecordfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientSummaryRecordfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientSummaryRecord getPatientSummaryRecordfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientSummaryRecord.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientSummaryRecord.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientSummaryRecord class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientSummaryRecord)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientSummaryRecord.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientSummaryRecord ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientSummaryRecord)factory.getImportedDomainObject(PatientSummaryRecord.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientSummaryRecord();
		}
		String keyClassName = "PatientSummaryRecord";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientSummaryRecord)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientSummaryRecord obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preOpVTEAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreOpVTEAssessment(ims.core.clinical.domain.objects.VTERiskAssessment.getVTERiskAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preOpVTECompletedDate");
		if(fldEl != null)
		{	
    		obj.setPreOpVTECompletedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("preOpVTEValidationDate");
		if(fldEl != null)
		{	
    		obj.setPreOpVTEValidationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("inpatientVTEAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInpatientVTEAssessment(ims.core.clinical.domain.objects.VTERiskAssessment.getVTERiskAssessmentfromXML(fldEl, factory, domMap)); 
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
		public static final String PreOpVTEAssessment = "preOpVTEAssessment";
		public static final String PreOpVTECompletedDate = "preOpVTECompletedDate";
		public static final String PreOpVTEValidationDate = "preOpVTEValidationDate";
		public static final String InpatientVTEAssessment = "inpatientVTEAssessment";
	}
}

