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
 * @author Alexie Ursache
 * Generated.
 */


public class ClinicalNotesAdditional extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100053;
	private static final long serialVersionUID = 1003100053L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** NotingMethod */
	private ims.domain.lookups.LookupInstance notingMethod;
	/** Clinial Notes */
	private ims.core.clinical.domain.objects.ClinicalNotes clinialNotes;
	/** Transcribed Date/Time */
	private java.util.Date transcribedDateTime;
	/** Transcribed By */
	private ims.core.resource.people.domain.objects.Hcp transcribedBy;
	/** Validation Date/Time */
	private java.util.Date validationDateTime;
	/** Validated By */
	private ims.core.resource.people.domain.objects.Hcp validatedBy;
	/** Scanned Date/Time */
	private java.util.Date scannedDateTime;
	/** Scanned By */
	private ims.core.resource.people.domain.objects.Hcp scannedBy;
	/** External Document Identifier */
	private String extDocumentID;
	/** Corrected Reason */
	private ims.domain.lookups.LookupInstance correctedReason;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalNotesAdditional (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalNotesAdditional ()
    {
    	super();
    }
    public ClinicalNotesAdditional (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ClinicalNotesAdditional.class;
	}


	public ims.domain.lookups.LookupInstance getNotingMethod() {
		return notingMethod;
	}
	public void setNotingMethod(ims.domain.lookups.LookupInstance notingMethod) {
		this.notingMethod = notingMethod;
	}

	public ims.core.clinical.domain.objects.ClinicalNotes getClinialNotes() {
		return clinialNotes;
	}
	public void setClinialNotes(ims.core.clinical.domain.objects.ClinicalNotes clinialNotes) {
		this.clinialNotes = clinialNotes;
	}

	public java.util.Date getTranscribedDateTime() {
		return transcribedDateTime;
	}
	public void setTranscribedDateTime(java.util.Date transcribedDateTime) {
		this.transcribedDateTime = transcribedDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getTranscribedBy() {
		return transcribedBy;
	}
	public void setTranscribedBy(ims.core.resource.people.domain.objects.Hcp transcribedBy) {
		this.transcribedBy = transcribedBy;
	}

	public java.util.Date getValidationDateTime() {
		return validationDateTime;
	}
	public void setValidationDateTime(java.util.Date validationDateTime) {
		this.validationDateTime = validationDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getValidatedBy() {
		return validatedBy;
	}
	public void setValidatedBy(ims.core.resource.people.domain.objects.Hcp validatedBy) {
		this.validatedBy = validatedBy;
	}

	public java.util.Date getScannedDateTime() {
		return scannedDateTime;
	}
	public void setScannedDateTime(java.util.Date scannedDateTime) {
		this.scannedDateTime = scannedDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getScannedBy() {
		return scannedBy;
	}
	public void setScannedBy(ims.core.resource.people.domain.objects.Hcp scannedBy) {
		this.scannedBy = scannedBy;
	}

	public String getExtDocumentID() {
		return extDocumentID;
	}
	public void setExtDocumentID(String extDocumentID) {
		this.extDocumentID = extDocumentID;
	}

	public ims.domain.lookups.LookupInstance getCorrectedReason() {
		return correctedReason;
	}
	public void setCorrectedReason(ims.domain.lookups.LookupInstance correctedReason) {
		this.correctedReason = correctedReason;
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
		
		auditStr.append("\r\n*notingMethod* :");
		if (notingMethod != null)
			auditStr.append(notingMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinialNotes* :");
		if (clinialNotes != null)
		{
			auditStr.append(toShortClassName(clinialNotes));
				
		    auditStr.append(clinialNotes.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transcribedDateTime* :");
		auditStr.append(transcribedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*transcribedBy* :");
		if (transcribedBy != null)
		{
			auditStr.append(toShortClassName(transcribedBy));
				
		    auditStr.append(transcribedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*validationDateTime* :");
		auditStr.append(validationDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*validatedBy* :");
		if (validatedBy != null)
		{
			auditStr.append(toShortClassName(validatedBy));
				
		    auditStr.append(validatedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scannedDateTime* :");
		auditStr.append(scannedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*scannedBy* :");
		if (scannedBy != null)
		{
			auditStr.append(toShortClassName(scannedBy));
				
		    auditStr.append(scannedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*extDocumentID* :");
		auditStr.append(extDocumentID);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctedReason* :");
		if (correctedReason != null)
			auditStr.append(correctedReason.getText());
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
		
		String keyClassName = "ClinicalNotesAdditional";
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
		if (this.getNotingMethod() != null)
		{
			sb.append("<notingMethod>");
			sb.append(this.getNotingMethod().toXMLString()); 
			sb.append("</notingMethod>");		
		}
		if (this.getClinialNotes() != null)
		{
			sb.append("<clinialNotes>");
			sb.append(this.getClinialNotes().toXMLString(domMap)); 	
			sb.append("</clinialNotes>");		
		}
		if (this.getTranscribedDateTime() != null)
		{
			sb.append("<transcribedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTranscribedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transcribedDateTime>");		
		}
		if (this.getTranscribedBy() != null)
		{
			sb.append("<transcribedBy>");
			sb.append(this.getTranscribedBy().toXMLString(domMap)); 	
			sb.append("</transcribedBy>");		
		}
		if (this.getValidationDateTime() != null)
		{
			sb.append("<validationDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getValidationDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</validationDateTime>");		
		}
		if (this.getValidatedBy() != null)
		{
			sb.append("<validatedBy>");
			sb.append(this.getValidatedBy().toXMLString(domMap)); 	
			sb.append("</validatedBy>");		
		}
		if (this.getScannedDateTime() != null)
		{
			sb.append("<scannedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getScannedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</scannedDateTime>");		
		}
		if (this.getScannedBy() != null)
		{
			sb.append("<scannedBy>");
			sb.append(this.getScannedBy().toXMLString(domMap)); 	
			sb.append("</scannedBy>");		
		}
		if (this.getExtDocumentID() != null)
		{
			sb.append("<extDocumentID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtDocumentID().toString()));
			sb.append("</extDocumentID>");		
		}
		if (this.getCorrectedReason() != null)
		{
			sb.append("<correctedReason>");
			sb.append(this.getCorrectedReason().toXMLString()); 
			sb.append("</correctedReason>");		
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
			ClinicalNotesAdditional domainObject = getClinicalNotesAdditionalfromXML(itemEl, factory, domMap);

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
			ClinicalNotesAdditional domainObject = getClinicalNotesAdditionalfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalNotesAdditional getClinicalNotesAdditionalfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalNotesAdditionalfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalNotesAdditional getClinicalNotesAdditionalfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalNotesAdditional.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalNotesAdditional.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalNotesAdditional class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalNotesAdditional)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalNotesAdditional.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalNotesAdditional ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalNotesAdditional)factory.getImportedDomainObject(ClinicalNotesAdditional.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalNotesAdditional();
		}
		String keyClassName = "ClinicalNotesAdditional";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalNotesAdditional)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalNotesAdditional obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("notingMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNotingMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinialNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinialNotes(ims.core.clinical.domain.objects.ClinicalNotes.getClinicalNotesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transcribedDateTime");
		if(fldEl != null)
		{	
    		obj.setTranscribedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transcribedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTranscribedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("validationDateTime");
		if(fldEl != null)
		{	
    		obj.setValidationDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("validatedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setValidatedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scannedDateTime");
		if(fldEl != null)
		{	
    		obj.setScannedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("scannedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScannedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("extDocumentID");
		if(fldEl != null)
		{	
    		obj.setExtDocumentID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctedReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCorrectedReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String NotingMethod = "notingMethod";
		public static final String ClinialNotes = "clinialNotes";
		public static final String TranscribedDateTime = "transcribedDateTime";
		public static final String TranscribedBy = "transcribedBy";
		public static final String ValidationDateTime = "validationDateTime";
		public static final String ValidatedBy = "validatedBy";
		public static final String ScannedDateTime = "scannedDateTime";
		public static final String ScannedBy = "scannedBy";
		public static final String ExtDocumentID = "extDocumentID";
		public static final String CorrectedReason = "correctedReason";
	}
}

