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
 * @author Joan Heelan
 * Generated.
 */


public class RACPSymptomRiskFactors extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100072;
	private static final long serialVersionUID = 1072100072L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** No Symptoms */
	private Boolean symptomIndicator;
	/** Symptoms
	  * Collection of ims.clinical.domain.objects.RACPSymptoms.
	  */
	private java.util.Set symptoms;
	/** Symptom Duration */
	private ims.domain.lookups.LookupInstance symptomDuration;
	/** Symptom Notes */
	private String symptomNotes;
	/** No Risk Factors Detected */
	private Boolean riskFactorIndicator;
	/** Risk Factors
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List riskFactors;
	/** Current Smoking Status */
	private ims.core.clinical.domain.objects.Smoking smokingStatus;
	/** Alcohol Units Per Week */
	private ims.core.clinical.domain.objects.Alcohol alcoholUnitsPerWeek;
	/** Diabetes Status */
	private ims.domain.lookups.LookupInstance diabetesStatus;
	/** Other Notes */
	private String otherNotes;
	/** Symptom Duration Unit */
	private Integer symptomDurationUnit;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RACPSymptomRiskFactors (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RACPSymptomRiskFactors ()
    {
    	super();
    }
    public RACPSymptomRiskFactors (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.RACPSymptomRiskFactors.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isSymptomIndicator() {
		return symptomIndicator;
	}
	public void setSymptomIndicator(Boolean symptomIndicator) {
		this.symptomIndicator = symptomIndicator;
	}

	public java.util.Set getSymptoms() {
		if ( null == symptoms ) {
			symptoms = new java.util.HashSet();
		}
		return symptoms;
	}
	public void setSymptoms(java.util.Set paramValue) {
		this.symptoms = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSymptomDuration() {
		return symptomDuration;
	}
	public void setSymptomDuration(ims.domain.lookups.LookupInstance symptomDuration) {
		this.symptomDuration = symptomDuration;
	}

	public String getSymptomNotes() {
		return symptomNotes;
	}
	public void setSymptomNotes(String symptomNotes) {
		if ( null != symptomNotes && symptomNotes.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for symptomNotes. Tried to set value: "+
				symptomNotes);
		}
		this.symptomNotes = symptomNotes;
	}

	public Boolean isRiskFactorIndicator() {
		return riskFactorIndicator;
	}
	public void setRiskFactorIndicator(Boolean riskFactorIndicator) {
		this.riskFactorIndicator = riskFactorIndicator;
	}

	public java.util.List getRiskFactors() {
		if ( null == riskFactors ) {
			riskFactors = new java.util.ArrayList();
		}
		return riskFactors;
	}
	public void setRiskFactors(java.util.List paramValue) {
		this.riskFactors = paramValue;
	}

	public ims.core.clinical.domain.objects.Smoking getSmokingStatus() {
		return smokingStatus;
	}
	public void setSmokingStatus(ims.core.clinical.domain.objects.Smoking smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	public ims.core.clinical.domain.objects.Alcohol getAlcoholUnitsPerWeek() {
		return alcoholUnitsPerWeek;
	}
	public void setAlcoholUnitsPerWeek(ims.core.clinical.domain.objects.Alcohol alcoholUnitsPerWeek) {
		this.alcoholUnitsPerWeek = alcoholUnitsPerWeek;
	}

	public ims.domain.lookups.LookupInstance getDiabetesStatus() {
		return diabetesStatus;
	}
	public void setDiabetesStatus(ims.domain.lookups.LookupInstance diabetesStatus) {
		this.diabetesStatus = diabetesStatus;
	}

	public String getOtherNotes() {
		return otherNotes;
	}
	public void setOtherNotes(String otherNotes) {
		if ( null != otherNotes && otherNotes.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherNotes. Tried to set value: "+
				otherNotes);
		}
		this.otherNotes = otherNotes;
	}

	public Integer getSymptomDurationUnit() {
		return symptomDurationUnit;
	}
	public void setSymptomDurationUnit(Integer symptomDurationUnit) {
		this.symptomDurationUnit = symptomDurationUnit;
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
		auditStr.append("\r\n*symptomIndicator* :");
		auditStr.append(symptomIndicator);
	    auditStr.append("; ");
		auditStr.append("\r\n*symptoms* :");
		if (symptoms != null)
		{
			java.util.Iterator it3 = symptoms.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.RACPSymptoms obj = (ims.clinical.domain.objects.RACPSymptoms)it3.next();
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
		auditStr.append("\r\n*symptomDuration* :");
		if (symptomDuration != null)
			auditStr.append(symptomDuration.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*symptomNotes* :");
		auditStr.append(symptomNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*riskFactorIndicator* :");
		auditStr.append(riskFactorIndicator);
	    auditStr.append("; ");
		auditStr.append("\r\n*riskFactors* :");
		if (riskFactors != null)
		{
			java.util.Iterator it7 = riskFactors.iterator();
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
		auditStr.append("\r\n*smokingStatus* :");
		if (smokingStatus != null)
		{
			auditStr.append(toShortClassName(smokingStatus));
				
		    auditStr.append(smokingStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*alcoholUnitsPerWeek* :");
		if (alcoholUnitsPerWeek != null)
		{
			auditStr.append(toShortClassName(alcoholUnitsPerWeek));
				
		    auditStr.append(alcoholUnitsPerWeek.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diabetesStatus* :");
		if (diabetesStatus != null)
			auditStr.append(diabetesStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*otherNotes* :");
		auditStr.append(otherNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*symptomDurationUnit* :");
		auditStr.append(symptomDurationUnit);
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
		
		String keyClassName = "RACPSymptomRiskFactors";
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
		if (this.isSymptomIndicator() != null)
		{
			sb.append("<symptomIndicator>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSymptomIndicator().toString()));
			sb.append("</symptomIndicator>");		
		}
		if (this.getSymptoms() != null)
		{
			if (this.getSymptoms().size() > 0 )
			{
			sb.append("<symptoms>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSymptoms(), domMap));
			sb.append("</symptoms>");		
			}
		}
		if (this.getSymptomDuration() != null)
		{
			sb.append("<symptomDuration>");
			sb.append(this.getSymptomDuration().toXMLString()); 
			sb.append("</symptomDuration>");		
		}
		if (this.getSymptomNotes() != null)
		{
			sb.append("<symptomNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSymptomNotes().toString()));
			sb.append("</symptomNotes>");		
		}
		if (this.isRiskFactorIndicator() != null)
		{
			sb.append("<riskFactorIndicator>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRiskFactorIndicator().toString()));
			sb.append("</riskFactorIndicator>");		
		}
		if (this.getRiskFactors() != null)
		{
			if (this.getRiskFactors().size() > 0 )
			{
			sb.append("<riskFactors>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getRiskFactors())); 
			sb.append("</riskFactors>");		
			}
		}
		if (this.getSmokingStatus() != null)
		{
			sb.append("<smokingStatus>");
			sb.append(this.getSmokingStatus().toXMLString(domMap)); 	
			sb.append("</smokingStatus>");		
		}
		if (this.getAlcoholUnitsPerWeek() != null)
		{
			sb.append("<alcoholUnitsPerWeek>");
			sb.append(this.getAlcoholUnitsPerWeek().toXMLString(domMap)); 	
			sb.append("</alcoholUnitsPerWeek>");		
		}
		if (this.getDiabetesStatus() != null)
		{
			sb.append("<diabetesStatus>");
			sb.append(this.getDiabetesStatus().toXMLString()); 
			sb.append("</diabetesStatus>");		
		}
		if (this.getOtherNotes() != null)
		{
			sb.append("<otherNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherNotes().toString()));
			sb.append("</otherNotes>");		
		}
		if (this.getSymptomDurationUnit() != null)
		{
			sb.append("<symptomDurationUnit>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSymptomDurationUnit().toString()));
			sb.append("</symptomDurationUnit>");		
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
			RACPSymptomRiskFactors domainObject = getRACPSymptomRiskFactorsfromXML(itemEl, factory, domMap);

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
			RACPSymptomRiskFactors domainObject = getRACPSymptomRiskFactorsfromXML(itemEl, factory, domMap);

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
		
	public static RACPSymptomRiskFactors getRACPSymptomRiskFactorsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRACPSymptomRiskFactorsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RACPSymptomRiskFactors getRACPSymptomRiskFactorsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RACPSymptomRiskFactors.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RACPSymptomRiskFactors.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RACPSymptomRiskFactors class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RACPSymptomRiskFactors)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RACPSymptomRiskFactors.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RACPSymptomRiskFactors ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RACPSymptomRiskFactors)factory.getImportedDomainObject(RACPSymptomRiskFactors.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RACPSymptomRiskFactors();
		}
		String keyClassName = "RACPSymptomRiskFactors";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RACPSymptomRiskFactors)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RACPSymptomRiskFactors obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("symptomIndicator");
		if(fldEl != null)
		{	
    		obj.setSymptomIndicator(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("symptoms");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSymptoms(ims.clinical.domain.objects.RACPSymptoms.fromSetXMLString(fldEl, factory, obj.getSymptoms(), domMap));
		}
		fldEl = el.element("symptomDuration");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSymptomDuration(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("symptomNotes");
		if(fldEl != null)
		{	
    		obj.setSymptomNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("riskFactorIndicator");
		if(fldEl != null)
		{	
    		obj.setRiskFactorIndicator(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("riskFactors");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRiskFactors(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getRiskFactors())); 
		}
		fldEl = el.element("smokingStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSmokingStatus(ims.core.clinical.domain.objects.Smoking.getSmokingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("alcoholUnitsPerWeek");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAlcoholUnitsPerWeek(ims.core.clinical.domain.objects.Alcohol.getAlcoholfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diabetesStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiabetesStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("otherNotes");
		if(fldEl != null)
		{	
    		obj.setOtherNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("symptomDurationUnit");
		if(fldEl != null)
		{	
    		obj.setSymptomDurationUnit(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "symptoms"
		, "riskFactors"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String SymptomIndicator = "symptomIndicator";
		public static final String Symptoms = "symptoms";
		public static final String SymptomDuration = "symptomDuration";
		public static final String SymptomNotes = "symptomNotes";
		public static final String RiskFactorIndicator = "riskFactorIndicator";
		public static final String RiskFactors = "riskFactors";
		public static final String SmokingStatus = "smokingStatus";
		public static final String AlcoholUnitsPerWeek = "alcoholUnitsPerWeek";
		public static final String DiabetesStatus = "diabetesStatus";
		public static final String OtherNotes = "otherNotes";
		public static final String SymptomDurationUnit = "symptomDurationUnit";
	}
}

