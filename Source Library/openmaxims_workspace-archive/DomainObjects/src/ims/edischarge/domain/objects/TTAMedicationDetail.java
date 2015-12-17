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


public class TTAMedicationDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100016;
	private static final long serialVersionUID = 1099100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Medication */
	private ims.core.clinical.domain.objects.Medication medication;
	/** Free text field for other medications */
	private String otherMedicationText;
	/** Dose Value */
	private java.lang.Float doseValue;
	/** DoseUnit */
	private ims.domain.lookups.LookupInstance doseUnit;
	/** Form */
	private ims.domain.lookups.LookupInstance form;
	/** Route */
	private ims.domain.lookups.LookupInstance route;
	/** Frequency Value */
	private Integer frequencyValue;
	/** Frequency Unit */
	private ims.domain.lookups.LookupInstance frequencyUnit;
	/** Duration Value */
	private Integer durationValue;
	/** Duration Unit */
	private ims.domain.lookups.LookupInstance durationUnit;
	/** Date Drug Commenced */
	private java.util.Date commencedDate;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Clinical Comments For Pharmacy */
	private String clinicalCommentsForPharmacy;
	/** MedicationInstructionsForPatient */
	private String medicationInstructionsForPatient;
	/** Prescriber Contacted */
	private Boolean prescriberContacted;
	/** UnitText */
	private String unitText;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TTAMedicationDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TTAMedicationDetail ()
    {
    	super();
    }
    public TTAMedicationDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.TTAMedicationDetail.class;
	}


	public ims.core.clinical.domain.objects.Medication getMedication() {
		return medication;
	}
	public void setMedication(ims.core.clinical.domain.objects.Medication medication) {
		this.medication = medication;
	}

	public String getOtherMedicationText() {
		return otherMedicationText;
	}
	public void setOtherMedicationText(String otherMedicationText) {
		if ( null != otherMedicationText && otherMedicationText.length() > 700 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherMedicationText. Tried to set value: "+
				otherMedicationText);
		}
		this.otherMedicationText = otherMedicationText;
	}

	public java.lang.Float getDoseValue() {
		return doseValue;
	}
	public void setDoseValue(java.lang.Float doseValue) {
		this.doseValue = doseValue;
	}

	public ims.domain.lookups.LookupInstance getDoseUnit() {
		return doseUnit;
	}
	public void setDoseUnit(ims.domain.lookups.LookupInstance doseUnit) {
		this.doseUnit = doseUnit;
	}

	public ims.domain.lookups.LookupInstance getForm() {
		return form;
	}
	public void setForm(ims.domain.lookups.LookupInstance form) {
		this.form = form;
	}

	public ims.domain.lookups.LookupInstance getRoute() {
		return route;
	}
	public void setRoute(ims.domain.lookups.LookupInstance route) {
		this.route = route;
	}

	public Integer getFrequencyValue() {
		return frequencyValue;
	}
	public void setFrequencyValue(Integer frequencyValue) {
		this.frequencyValue = frequencyValue;
	}

	public ims.domain.lookups.LookupInstance getFrequencyUnit() {
		return frequencyUnit;
	}
	public void setFrequencyUnit(ims.domain.lookups.LookupInstance frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}

	public Integer getDurationValue() {
		return durationValue;
	}
	public void setDurationValue(Integer durationValue) {
		this.durationValue = durationValue;
	}

	public ims.domain.lookups.LookupInstance getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(ims.domain.lookups.LookupInstance durationUnit) {
		this.durationUnit = durationUnit;
	}

	public java.util.Date getCommencedDate() {
		return commencedDate;
	}
	public void setCommencedDate(java.util.Date commencedDate) {
		this.commencedDate = commencedDate;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public String getClinicalCommentsForPharmacy() {
		return clinicalCommentsForPharmacy;
	}
	public void setClinicalCommentsForPharmacy(String clinicalCommentsForPharmacy) {
		if ( null != clinicalCommentsForPharmacy && clinicalCommentsForPharmacy.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clinicalCommentsForPharmacy. Tried to set value: "+
				clinicalCommentsForPharmacy);
		}
		this.clinicalCommentsForPharmacy = clinicalCommentsForPharmacy;
	}

	public String getMedicationInstructionsForPatient() {
		return medicationInstructionsForPatient;
	}
	public void setMedicationInstructionsForPatient(String medicationInstructionsForPatient) {
		if ( null != medicationInstructionsForPatient && medicationInstructionsForPatient.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for medicationInstructionsForPatient. Tried to set value: "+
				medicationInstructionsForPatient);
		}
		this.medicationInstructionsForPatient = medicationInstructionsForPatient;
	}

	public Boolean isPrescriberContacted() {
		return prescriberContacted;
	}
	public void setPrescriberContacted(Boolean prescriberContacted) {
		this.prescriberContacted = prescriberContacted;
	}

	public String getUnitText() {
		return unitText;
	}
	public void setUnitText(String unitText) {
		if ( null != unitText && unitText.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for unitText. Tried to set value: "+
				unitText);
		}
		this.unitText = unitText;
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
		
		auditStr.append("\r\n*medication* :");
		if (medication != null)
		{
			auditStr.append(toShortClassName(medication));
				
		    auditStr.append(medication.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherMedicationText* :");
		auditStr.append(otherMedicationText);
	    auditStr.append("; ");
		auditStr.append("\r\n*doseValue* :");
		auditStr.append(doseValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*doseUnit* :");
		if (doseUnit != null)
			auditStr.append(doseUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*form* :");
		if (form != null)
			auditStr.append(form.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*route* :");
		if (route != null)
			auditStr.append(route.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*frequencyValue* :");
		auditStr.append(frequencyValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*frequencyUnit* :");
		if (frequencyUnit != null)
			auditStr.append(frequencyUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*durationValue* :");
		auditStr.append(durationValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationUnit* :");
		if (durationUnit != null)
			auditStr.append(durationUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commencedDate* :");
		auditStr.append(commencedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalCommentsForPharmacy* :");
		auditStr.append(clinicalCommentsForPharmacy);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicationInstructionsForPatient* :");
		auditStr.append(medicationInstructionsForPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*prescriberContacted* :");
		auditStr.append(prescriberContacted);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitText* :");
		auditStr.append(unitText);
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
		
		String keyClassName = "TTAMedicationDetail";
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
		if (this.getMedication() != null)
		{
			sb.append("<medication>");
			sb.append(this.getMedication().toXMLString(domMap)); 	
			sb.append("</medication>");		
		}
		if (this.getOtherMedicationText() != null)
		{
			sb.append("<otherMedicationText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherMedicationText().toString()));
			sb.append("</otherMedicationText>");		
		}
		if (this.getDoseValue() != null)
		{
			sb.append("<doseValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDoseValue().toString()));
			sb.append("</doseValue>");		
		}
		if (this.getDoseUnit() != null)
		{
			sb.append("<doseUnit>");
			sb.append(this.getDoseUnit().toXMLString()); 
			sb.append("</doseUnit>");		
		}
		if (this.getForm() != null)
		{
			sb.append("<form>");
			sb.append(this.getForm().toXMLString()); 
			sb.append("</form>");		
		}
		if (this.getRoute() != null)
		{
			sb.append("<route>");
			sb.append(this.getRoute().toXMLString()); 
			sb.append("</route>");		
		}
		if (this.getFrequencyValue() != null)
		{
			sb.append("<frequencyValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFrequencyValue().toString()));
			sb.append("</frequencyValue>");		
		}
		if (this.getFrequencyUnit() != null)
		{
			sb.append("<frequencyUnit>");
			sb.append(this.getFrequencyUnit().toXMLString()); 
			sb.append("</frequencyUnit>");		
		}
		if (this.getDurationValue() != null)
		{
			sb.append("<durationValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationValue().toString()));
			sb.append("</durationValue>");		
		}
		if (this.getDurationUnit() != null)
		{
			sb.append("<durationUnit>");
			sb.append(this.getDurationUnit().toXMLString()); 
			sb.append("</durationUnit>");		
		}
		if (this.getCommencedDate() != null)
		{
			sb.append("<commencedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCommencedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</commencedDate>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getClinicalCommentsForPharmacy() != null)
		{
			sb.append("<clinicalCommentsForPharmacy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalCommentsForPharmacy().toString()));
			sb.append("</clinicalCommentsForPharmacy>");		
		}
		if (this.getMedicationInstructionsForPatient() != null)
		{
			sb.append("<medicationInstructionsForPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicationInstructionsForPatient().toString()));
			sb.append("</medicationInstructionsForPatient>");		
		}
		if (this.isPrescriberContacted() != null)
		{
			sb.append("<prescriberContacted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPrescriberContacted().toString()));
			sb.append("</prescriberContacted>");		
		}
		if (this.getUnitText() != null)
		{
			sb.append("<unitText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUnitText().toString()));
			sb.append("</unitText>");		
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
			TTAMedicationDetail domainObject = getTTAMedicationDetailfromXML(itemEl, factory, domMap);

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
			TTAMedicationDetail domainObject = getTTAMedicationDetailfromXML(itemEl, factory, domMap);

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
		
	public static TTAMedicationDetail getTTAMedicationDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTTAMedicationDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TTAMedicationDetail getTTAMedicationDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TTAMedicationDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TTAMedicationDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TTAMedicationDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TTAMedicationDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TTAMedicationDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TTAMedicationDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TTAMedicationDetail)factory.getImportedDomainObject(TTAMedicationDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TTAMedicationDetail();
		}
		String keyClassName = "TTAMedicationDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TTAMedicationDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TTAMedicationDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("medication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMedication(ims.core.clinical.domain.objects.Medication.getMedicationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("otherMedicationText");
		if(fldEl != null)
		{	
    		obj.setOtherMedicationText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doseValue");
		if(fldEl != null)
		{	
    		obj.setDoseValue(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doseUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDoseUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("form");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setForm(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("route");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRoute(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("frequencyValue");
		if(fldEl != null)
		{	
    		obj.setFrequencyValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("frequencyUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequencyUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("durationValue");
		if(fldEl != null)
		{	
    		obj.setDurationValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durationUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDurationUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commencedDate");
		if(fldEl != null)
		{	
    		obj.setCommencedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalCommentsForPharmacy");
		if(fldEl != null)
		{	
    		obj.setClinicalCommentsForPharmacy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicationInstructionsForPatient");
		if(fldEl != null)
		{	
    		obj.setMedicationInstructionsForPatient(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prescriberContacted");
		if(fldEl != null)
		{	
    		obj.setPrescriberContacted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unitText");
		if(fldEl != null)
		{	
    		obj.setUnitText(new String(fldEl.getTextTrim()));	
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
		public static final String Medication = "medication";
		public static final String OtherMedicationText = "otherMedicationText";
		public static final String DoseValue = "doseValue";
		public static final String DoseUnit = "doseUnit";
		public static final String Form = "form";
		public static final String Route = "route";
		public static final String FrequencyValue = "frequencyValue";
		public static final String FrequencyUnit = "frequencyUnit";
		public static final String DurationValue = "durationValue";
		public static final String DurationUnit = "durationUnit";
		public static final String CommencedDate = "commencedDate";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ClinicalCommentsForPharmacy = "clinicalCommentsForPharmacy";
		public static final String MedicationInstructionsForPatient = "medicationInstructionsForPatient";
		public static final String PrescriberContacted = "prescriberContacted";
		public static final String UnitText = "unitText";
	}
}

