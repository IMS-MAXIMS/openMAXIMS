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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class NurEatingComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1015100023;
	private static final long serialVersionUID = 1015100023L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Does the patient require assistance? */
	private ims.domain.lookups.LookupInstance patientRequireAssistance;
	/** Nutritional Method
	  * Collection of ims.nursing.assessment.domain.objects.NutritionalMethod.
	  */
	private java.util.Set nutritionalMethod;
	/** Oral Assessment
	  * Collection of ims.nursing.assessment.domain.objects.EatingOralAssessment.
	  */
	private java.util.Set oralAssessment;
	/** Difficulties In Swallowing */
	private ims.domain.lookups.LookupInstance difficultiesInSwallowing;
	/** Referral Date - Speech And Language Therapist */
	private java.util.Date referralSpeechAndLanguageTherapist;
	/** Referral Date - Dietitian */
	private java.util.Date referralDietitian;
	/** Special Diet
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List specialDiet;
	/** Alcohol Units */
	private Integer alcoholUnits;
	/** Nutritional Risk Assessment */
	private ims.nursing.assessmenttools.domain.objects.NutritionalRiskAssessment nutritionalRiskAssessment;
	/** Nutritional Risk Score */
	private Integer nutritionalRiskScore;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NurEatingComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NurEatingComponent ()
    {
    	super();
    }
    public NurEatingComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.NurEatingComponent.class;
	}


	public ims.domain.lookups.LookupInstance getPatientRequireAssistance() {
		return patientRequireAssistance;
	}
	public void setPatientRequireAssistance(ims.domain.lookups.LookupInstance patientRequireAssistance) {
		this.patientRequireAssistance = patientRequireAssistance;
	}

	public java.util.Set getNutritionalMethod() {
		if ( null == nutritionalMethod ) {
			nutritionalMethod = new java.util.HashSet();
		}
		return nutritionalMethod;
	}
	public void setNutritionalMethod(java.util.Set paramValue) {
		this.nutritionalMethod = paramValue;
	}

	public java.util.Set getOralAssessment() {
		if ( null == oralAssessment ) {
			oralAssessment = new java.util.HashSet();
		}
		return oralAssessment;
	}
	public void setOralAssessment(java.util.Set paramValue) {
		this.oralAssessment = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDifficultiesInSwallowing() {
		return difficultiesInSwallowing;
	}
	public void setDifficultiesInSwallowing(ims.domain.lookups.LookupInstance difficultiesInSwallowing) {
		this.difficultiesInSwallowing = difficultiesInSwallowing;
	}

	public java.util.Date getReferralSpeechAndLanguageTherapist() {
		return referralSpeechAndLanguageTherapist;
	}
	public void setReferralSpeechAndLanguageTherapist(java.util.Date referralSpeechAndLanguageTherapist) {
		this.referralSpeechAndLanguageTherapist = referralSpeechAndLanguageTherapist;
	}

	public java.util.Date getReferralDietitian() {
		return referralDietitian;
	}
	public void setReferralDietitian(java.util.Date referralDietitian) {
		this.referralDietitian = referralDietitian;
	}

	public java.util.List getSpecialDiet() {
		if ( null == specialDiet ) {
			specialDiet = new java.util.ArrayList();
		}
		return specialDiet;
	}
	public void setSpecialDiet(java.util.List paramValue) {
		this.specialDiet = paramValue;
	}

	public Integer getAlcoholUnits() {
		return alcoholUnits;
	}
	public void setAlcoholUnits(Integer alcoholUnits) {
		this.alcoholUnits = alcoholUnits;
	}

	public ims.nursing.assessmenttools.domain.objects.NutritionalRiskAssessment getNutritionalRiskAssessment() {
		return nutritionalRiskAssessment;
	}
	public void setNutritionalRiskAssessment(ims.nursing.assessmenttools.domain.objects.NutritionalRiskAssessment nutritionalRiskAssessment) {
		this.nutritionalRiskAssessment = nutritionalRiskAssessment;
	}

	public Integer getNutritionalRiskScore() {
		return nutritionalRiskScore;
	}
	public void setNutritionalRiskScore(Integer nutritionalRiskScore) {
		this.nutritionalRiskScore = nutritionalRiskScore;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*patientRequireAssistance* :");
		if (patientRequireAssistance != null)
			auditStr.append(patientRequireAssistance.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nutritionalMethod* :");
		if (nutritionalMethod != null)
		{
			java.util.Iterator it2 = nutritionalMethod.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.NutritionalMethod obj = (ims.nursing.assessment.domain.objects.NutritionalMethod)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oralAssessment* :");
		if (oralAssessment != null)
		{
			java.util.Iterator it3 = oralAssessment.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.EatingOralAssessment obj = (ims.nursing.assessment.domain.objects.EatingOralAssessment)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*difficultiesInSwallowing* :");
		if (difficultiesInSwallowing != null)
			auditStr.append(difficultiesInSwallowing.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralSpeechAndLanguageTherapist* :");
		auditStr.append(referralSpeechAndLanguageTherapist);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDietitian* :");
		auditStr.append(referralDietitian);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialDiet* :");
		if (specialDiet != null)
		{
			java.util.Iterator it7 = specialDiet.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it7.next();
			auditStr.append(obj.getText());
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*alcoholUnits* :");
		auditStr.append(alcoholUnits);
	    auditStr.append("; ");
		auditStr.append("\r\n*nutritionalRiskAssessment* :");
		if (nutritionalRiskAssessment != null)
		{
			auditStr.append(toShortClassName(nutritionalRiskAssessment));
				
		    auditStr.append(nutritionalRiskAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nutritionalRiskScore* :");
		auditStr.append(nutritionalRiskScore);
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
		
		String keyClassName = "NurEatingComponent";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getPatientRequireAssistance() != null)
		{
			sb.append("<patientRequireAssistance>");
			sb.append(this.getPatientRequireAssistance().toXMLString()); 
			sb.append("</patientRequireAssistance>");		
		}
		if (this.getNutritionalMethod() != null)
		{
			if (this.getNutritionalMethod().size() > 0 )
			{
			sb.append("<nutritionalMethod>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNutritionalMethod(), domMap));
			sb.append("</nutritionalMethod>");		
			}
		}
		if (this.getOralAssessment() != null)
		{
			if (this.getOralAssessment().size() > 0 )
			{
			sb.append("<oralAssessment>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOralAssessment(), domMap));
			sb.append("</oralAssessment>");		
			}
		}
		if (this.getDifficultiesInSwallowing() != null)
		{
			sb.append("<difficultiesInSwallowing>");
			sb.append(this.getDifficultiesInSwallowing().toXMLString()); 
			sb.append("</difficultiesInSwallowing>");		
		}
		if (this.getReferralSpeechAndLanguageTherapist() != null)
		{
			sb.append("<referralSpeechAndLanguageTherapist>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralSpeechAndLanguageTherapist()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralSpeechAndLanguageTherapist>");		
		}
		if (this.getReferralDietitian() != null)
		{
			sb.append("<referralDietitian>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralDietitian()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralDietitian>");		
		}
		if (this.getSpecialDiet() != null)
		{
			if (this.getSpecialDiet().size() > 0 )
			{
			sb.append("<specialDiet>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSpecialDiet())); 
			sb.append("</specialDiet>");		
			}
		}
		if (this.getAlcoholUnits() != null)
		{
			sb.append("<alcoholUnits>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAlcoholUnits().toString()));
			sb.append("</alcoholUnits>");		
		}
		if (this.getNutritionalRiskAssessment() != null)
		{
			sb.append("<nutritionalRiskAssessment>");
			sb.append(this.getNutritionalRiskAssessment().toXMLString(domMap)); 	
			sb.append("</nutritionalRiskAssessment>");		
		}
		if (this.getNutritionalRiskScore() != null)
		{
			sb.append("<nutritionalRiskScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNutritionalRiskScore().toString()));
			sb.append("</nutritionalRiskScore>");		
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
			NurEatingComponent domainObject = getNurEatingComponentfromXML(itemEl, factory, domMap);

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
			NurEatingComponent domainObject = getNurEatingComponentfromXML(itemEl, factory, domMap);

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
		
	public static NurEatingComponent getNurEatingComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNurEatingComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NurEatingComponent getNurEatingComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NurEatingComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NurEatingComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NurEatingComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NurEatingComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NurEatingComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NurEatingComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NurEatingComponent)factory.getImportedDomainObject(NurEatingComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NurEatingComponent();
		}
		String keyClassName = "NurEatingComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NurEatingComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NurEatingComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("patientRequireAssistance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientRequireAssistance(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nutritionalMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setNutritionalMethod(ims.nursing.assessment.domain.objects.NutritionalMethod.fromSetXMLString(fldEl, factory, obj.getNutritionalMethod(), domMap));
		}
		fldEl = el.element("oralAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOralAssessment(ims.nursing.assessment.domain.objects.EatingOralAssessment.fromSetXMLString(fldEl, factory, obj.getOralAssessment(), domMap));
		}
		fldEl = el.element("difficultiesInSwallowing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDifficultiesInSwallowing(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralSpeechAndLanguageTherapist");
		if(fldEl != null)
		{	
    		obj.setReferralSpeechAndLanguageTherapist(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referralDietitian");
		if(fldEl != null)
		{	
    		obj.setReferralDietitian(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("specialDiet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecialDiet(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSpecialDiet())); 
		}
		fldEl = el.element("alcoholUnits");
		if(fldEl != null)
		{	
    		obj.setAlcoholUnits(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nutritionalRiskAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNutritionalRiskAssessment(ims.nursing.assessmenttools.domain.objects.NutritionalRiskAssessment.getNutritionalRiskAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nutritionalRiskScore");
		if(fldEl != null)
		{	
    		obj.setNutritionalRiskScore(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "nutritionalMethod"
		, "oralAssessment"
		, "specialDiet"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PatientRequireAssistance = "patientRequireAssistance";
		public static final String NutritionalMethod = "nutritionalMethod";
		public static final String OralAssessment = "oralAssessment";
		public static final String DifficultiesInSwallowing = "difficultiesInSwallowing";
		public static final String ReferralSpeechAndLanguageTherapist = "referralSpeechAndLanguageTherapist";
		public static final String ReferralDietitian = "referralDietitian";
		public static final String SpecialDiet = "specialDiet";
		public static final String AlcoholUnits = "alcoholUnits";
		public static final String NutritionalRiskAssessment = "nutritionalRiskAssessment";
		public static final String NutritionalRiskScore = "nutritionalRiskScore";
	}
}

