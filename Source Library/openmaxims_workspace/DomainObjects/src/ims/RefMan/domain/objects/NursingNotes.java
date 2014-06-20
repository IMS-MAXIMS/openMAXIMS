/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class NursingNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100002;
	private static final long serialVersionUID = 1096100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** AuthoringUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringUser;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** VitalSigns */
	private ims.core.vitals.domain.objects.VitalSigns vitalSigns;
	/** Allergies
	  * Collection of ims.core.clinical.domain.objects.PatientAllergy.
	  */
	private java.util.Set allergies;
	/** Current Smoking Status */
	private ims.domain.lookups.LookupInstance smokingStatus;
	/** Advice Given */
	private Boolean adviceGiven;
	/** Units Of Alcohol Consumed Per Week */
	private java.lang.Float unitsOfAlcoholConsumedPerWeek;
	/** Referred To Somking Cessation Clinic */
	private Boolean referredToSomkingCessation;
	/** Observation Notes */
	private String observationNotes;
	/** Comorbidities
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set comorbidities;
	/** MRSAResult */
	private ims.domain.lookups.LookupInstance mRSAResult;
	/** Special Needs
	  * Collection of ims.clinical.domain.objects.PatientSpecialNeed.
	  */
	private java.util.Set specialNeeds;
	/** CurrentMedications
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.Set currentMedications;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NursingNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NursingNotes ()
    {
    	super();
    }
    public NursingNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.NursingNotes.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringUser() {
		return authoringUser;
	}
	public void setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff authoringUser) {
		this.authoringUser = authoringUser;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.vitals.domain.objects.VitalSigns getVitalSigns() {
		return vitalSigns;
	}
	public void setVitalSigns(ims.core.vitals.domain.objects.VitalSigns vitalSigns) {
		this.vitalSigns = vitalSigns;
	}

	public java.util.Set getAllergies() {
		if ( null == allergies ) {
			allergies = new java.util.HashSet();
		}
		return allergies;
	}
	public void setAllergies(java.util.Set paramValue) {
		this.allergies = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSmokingStatus() {
		return smokingStatus;
	}
	public void setSmokingStatus(ims.domain.lookups.LookupInstance smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	public Boolean isAdviceGiven() {
		return adviceGiven;
	}
	public void setAdviceGiven(Boolean adviceGiven) {
		this.adviceGiven = adviceGiven;
	}

	public java.lang.Float getUnitsOfAlcoholConsumedPerWeek() {
		return unitsOfAlcoholConsumedPerWeek;
	}
	public void setUnitsOfAlcoholConsumedPerWeek(java.lang.Float unitsOfAlcoholConsumedPerWeek) {
		this.unitsOfAlcoholConsumedPerWeek = unitsOfAlcoholConsumedPerWeek;
	}

	public Boolean isReferredToSomkingCessation() {
		return referredToSomkingCessation;
	}
	public void setReferredToSomkingCessation(Boolean referredToSomkingCessation) {
		this.referredToSomkingCessation = referredToSomkingCessation;
	}

	public String getObservationNotes() {
		return observationNotes;
	}
	public void setObservationNotes(String observationNotes) {
		if ( null != observationNotes && observationNotes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for observationNotes. Tried to set value: "+
				observationNotes);
		}
		this.observationNotes = observationNotes;
	}

	public java.util.Set getComorbidities() {
		if ( null == comorbidities ) {
			comorbidities = new java.util.HashSet();
		}
		return comorbidities;
	}
	public void setComorbidities(java.util.Set paramValue) {
		this.comorbidities = paramValue;
	}

	public ims.domain.lookups.LookupInstance getMRSAResult() {
		return mRSAResult;
	}
	public void setMRSAResult(ims.domain.lookups.LookupInstance mRSAResult) {
		this.mRSAResult = mRSAResult;
	}

	public java.util.Set getSpecialNeeds() {
		if ( null == specialNeeds ) {
			specialNeeds = new java.util.HashSet();
		}
		return specialNeeds;
	}
	public void setSpecialNeeds(java.util.Set paramValue) {
		this.specialNeeds = paramValue;
	}

	public java.util.Set getCurrentMedications() {
		if ( null == currentMedications ) {
			currentMedications = new java.util.HashSet();
		}
		return currentMedications;
	}
	public void setCurrentMedications(java.util.Set paramValue) {
		this.currentMedications = paramValue;
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
		auditStr.append("\r\n*authoringUser* :");
		if (authoringUser != null)
		{
			auditStr.append(toShortClassName(authoringUser));
				
		    auditStr.append(authoringUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*vitalSigns* :");
		if (vitalSigns != null)
		{
			auditStr.append(toShortClassName(vitalSigns));
				
		    auditStr.append(vitalSigns.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allergies* :");
		if (allergies != null)
		{
			java.util.Iterator it5 = allergies.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientAllergy obj = (ims.core.clinical.domain.objects.PatientAllergy)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*smokingStatus* :");
		if (smokingStatus != null)
			auditStr.append(smokingStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceGiven* :");
		auditStr.append(adviceGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitsOfAlcoholConsumedPerWeek* :");
		auditStr.append(unitsOfAlcoholConsumedPerWeek);
	    auditStr.append("; ");
		auditStr.append("\r\n*referredToSomkingCessation* :");
		auditStr.append(referredToSomkingCessation);
	    auditStr.append("; ");
		auditStr.append("\r\n*observationNotes* :");
		auditStr.append(observationNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*comorbidities* :");
		if (comorbidities != null)
		{
			java.util.Iterator it11 = comorbidities.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mRSAResult* :");
		if (mRSAResult != null)
			auditStr.append(mRSAResult.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialNeeds* :");
		if (specialNeeds != null)
		{
			java.util.Iterator it13 = specialNeeds.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.PatientSpecialNeed obj = (ims.clinical.domain.objects.PatientSpecialNeed)it13.next();
		if (obj != null)
		{
		   if (i13 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentMedications* :");
		if (currentMedications != null)
		{
			java.util.Iterator it14 = currentMedications.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
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
		
		String keyClassName = "NursingNotes";
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
		if (this.getAuthoringUser() != null)
		{
			sb.append("<authoringUser>");
			sb.append(this.getAuthoringUser().toXMLString(domMap)); 	
			sb.append("</authoringUser>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getVitalSigns() != null)
		{
			sb.append("<vitalSigns>");
			sb.append(this.getVitalSigns().toXMLString(domMap)); 	
			sb.append("</vitalSigns>");		
		}
		if (this.getAllergies() != null)
		{
			if (this.getAllergies().size() > 0 )
			{
			sb.append("<allergies>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAllergies(), domMap));
			sb.append("</allergies>");		
			}
		}
		if (this.getSmokingStatus() != null)
		{
			sb.append("<smokingStatus>");
			sb.append(this.getSmokingStatus().toXMLString()); 
			sb.append("</smokingStatus>");		
		}
		if (this.isAdviceGiven() != null)
		{
			sb.append("<adviceGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAdviceGiven().toString()));
			sb.append("</adviceGiven>");		
		}
		if (this.getUnitsOfAlcoholConsumedPerWeek() != null)
		{
			sb.append("<unitsOfAlcoholConsumedPerWeek>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUnitsOfAlcoholConsumedPerWeek().toString()));
			sb.append("</unitsOfAlcoholConsumedPerWeek>");		
		}
		if (this.isReferredToSomkingCessation() != null)
		{
			sb.append("<referredToSomkingCessation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isReferredToSomkingCessation().toString()));
			sb.append("</referredToSomkingCessation>");		
		}
		if (this.getObservationNotes() != null)
		{
			sb.append("<observationNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObservationNotes().toString()));
			sb.append("</observationNotes>");		
		}
		if (this.getComorbidities() != null)
		{
			if (this.getComorbidities().size() > 0 )
			{
			sb.append("<comorbidities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComorbidities(), domMap));
			sb.append("</comorbidities>");		
			}
		}
		if (this.getMRSAResult() != null)
		{
			sb.append("<mRSAResult>");
			sb.append(this.getMRSAResult().toXMLString()); 
			sb.append("</mRSAResult>");		
		}
		if (this.getSpecialNeeds() != null)
		{
			if (this.getSpecialNeeds().size() > 0 )
			{
			sb.append("<specialNeeds>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecialNeeds(), domMap));
			sb.append("</specialNeeds>");		
			}
		}
		if (this.getCurrentMedications() != null)
		{
			if (this.getCurrentMedications().size() > 0 )
			{
			sb.append("<currentMedications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCurrentMedications(), domMap));
			sb.append("</currentMedications>");		
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
			NursingNotes domainObject = getNursingNotesfromXML(itemEl, factory, domMap);

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
			NursingNotes domainObject = getNursingNotesfromXML(itemEl, factory, domMap);

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
		
	public static NursingNotes getNursingNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNursingNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NursingNotes getNursingNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NursingNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NursingNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NursingNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NursingNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NursingNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NursingNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NursingNotes)factory.getImportedDomainObject(NursingNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NursingNotes();
		}
		String keyClassName = "NursingNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NursingNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NursingNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("vitalSigns");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVitalSigns(ims.core.vitals.domain.objects.VitalSigns.getVitalSignsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allergies");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAllergies(ims.core.clinical.domain.objects.PatientAllergy.fromSetXMLString(fldEl, factory, obj.getAllergies(), domMap));
		}
		fldEl = el.element("smokingStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSmokingStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("adviceGiven");
		if(fldEl != null)
		{	
    		obj.setAdviceGiven(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unitsOfAlcoholConsumedPerWeek");
		if(fldEl != null)
		{	
    		obj.setUnitsOfAlcoholConsumedPerWeek(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referredToSomkingCessation");
		if(fldEl != null)
		{	
    		obj.setReferredToSomkingCessation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("observationNotes");
		if(fldEl != null)
		{	
    		obj.setObservationNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comorbidities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComorbidities(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getComorbidities(), domMap));
		}
		fldEl = el.element("mRSAResult");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMRSAResult(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialNeeds");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSpecialNeeds(ims.clinical.domain.objects.PatientSpecialNeed.fromSetXMLString(fldEl, factory, obj.getSpecialNeeds(), domMap));
		}
		fldEl = el.element("currentMedications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCurrentMedications(ims.core.clinical.domain.objects.PatientMedication.fromSetXMLString(fldEl, factory, obj.getCurrentMedications(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "allergies"
		, "comorbidities"
		, "specialNeeds"
		, "currentMedications"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String AuthoringUser = "authoringUser";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String VitalSigns = "vitalSigns";
		public static final String Allergies = "allergies";
		public static final String SmokingStatus = "smokingStatus";
		public static final String AdviceGiven = "adviceGiven";
		public static final String UnitsOfAlcoholConsumedPerWeek = "unitsOfAlcoholConsumedPerWeek";
		public static final String ReferredToSomkingCessation = "referredToSomkingCessation";
		public static final String ObservationNotes = "observationNotes";
		public static final String Comorbidities = "comorbidities";
		public static final String MRSAResult = "mRSAResult";
		public static final String SpecialNeeds = "specialNeeds";
		public static final String CurrentMedications = "currentMedications";
	}
}

