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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class SleepReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100029;
	private static final long serialVersionUID = 1023100029L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Care Professional */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Pulse Oximetry */
	private Boolean pulseOximetry;
	/** Oximetry Values */
	private ims.domain.lookups.LookupInstance oximetryValues;
	/** Weight / Height / Neck Size */
	private ims.core.vitals.domain.objects.Metrics weightHeightNeckSize;
	/** Medication */
	private String medication;
	/** Sleep Findings
	  * Collection of ims.medical.domain.objects.SleepFindings.
	  */
	private java.util.Set sleepFindings;
	/** Epworth Sleep Assessment
	  * Collection of ims.core.clinical.domain.objects.EpworthSleepAssessment.
	  */
	private java.util.Set epworthSleepAssessment;
	/** Cognitive Function
	  * Collection of ims.medical.domain.objects.CognitiveFunction.
	  */
	private java.util.Set cognitiveFunction;
	/** Sleep Apnoea
	  * Collection of ims.medical.domain.objects.SleepApnoea.
	  */
	private java.util.Set sleepApnoea;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SleepReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SleepReferral ()
    {
    	super();
    }
    public SleepReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.SleepReferral.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public Boolean isPulseOximetry() {
		return pulseOximetry;
	}
	public void setPulseOximetry(Boolean pulseOximetry) {
		this.pulseOximetry = pulseOximetry;
	}

	public ims.domain.lookups.LookupInstance getOximetryValues() {
		return oximetryValues;
	}
	public void setOximetryValues(ims.domain.lookups.LookupInstance oximetryValues) {
		this.oximetryValues = oximetryValues;
	}

	public ims.core.vitals.domain.objects.Metrics getWeightHeightNeckSize() {
		return weightHeightNeckSize;
	}
	public void setWeightHeightNeckSize(ims.core.vitals.domain.objects.Metrics weightHeightNeckSize) {
		this.weightHeightNeckSize = weightHeightNeckSize;
	}

	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}

	public java.util.Set getSleepFindings() {
		if ( null == sleepFindings ) {
			sleepFindings = new java.util.HashSet();
		}
		return sleepFindings;
	}
	public void setSleepFindings(java.util.Set paramValue) {
		this.sleepFindings = paramValue;
	}

	public java.util.Set getEpworthSleepAssessment() {
		if ( null == epworthSleepAssessment ) {
			epworthSleepAssessment = new java.util.HashSet();
		}
		return epworthSleepAssessment;
	}
	public void setEpworthSleepAssessment(java.util.Set paramValue) {
		this.epworthSleepAssessment = paramValue;
	}

	public java.util.Set getCognitiveFunction() {
		if ( null == cognitiveFunction ) {
			cognitiveFunction = new java.util.HashSet();
		}
		return cognitiveFunction;
	}
	public void setCognitiveFunction(java.util.Set paramValue) {
		this.cognitiveFunction = paramValue;
	}

	public java.util.Set getSleepApnoea() {
		if ( null == sleepApnoea ) {
			sleepApnoea = new java.util.HashSet();
		}
		return sleepApnoea;
	}
	public void setSleepApnoea(java.util.Set paramValue) {
		this.sleepApnoea = paramValue;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pulseOximetry* :");
		auditStr.append(pulseOximetry);
	    auditStr.append("; ");
		auditStr.append("\r\n*oximetryValues* :");
		if (oximetryValues != null)
			auditStr.append(oximetryValues.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*weightHeightNeckSize* :");
		if (weightHeightNeckSize != null)
		{
			auditStr.append(toShortClassName(weightHeightNeckSize));
				
		    auditStr.append(weightHeightNeckSize.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*medication* :");
		auditStr.append(medication);
	    auditStr.append("; ");
		auditStr.append("\r\n*sleepFindings* :");
		if (sleepFindings != null)
		{
			java.util.Iterator it6 = sleepFindings.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.SleepFindings obj = (ims.medical.domain.objects.SleepFindings)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*epworthSleepAssessment* :");
		if (epworthSleepAssessment != null)
		{
			java.util.Iterator it7 = epworthSleepAssessment.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.EpworthSleepAssessment obj = (ims.core.clinical.domain.objects.EpworthSleepAssessment)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cognitiveFunction* :");
		if (cognitiveFunction != null)
		{
			java.util.Iterator it8 = cognitiveFunction.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.CognitiveFunction obj = (ims.medical.domain.objects.CognitiveFunction)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sleepApnoea* :");
		if (sleepApnoea != null)
		{
			java.util.Iterator it9 = sleepApnoea.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.medical.domain.objects.SleepApnoea obj = (ims.medical.domain.objects.SleepApnoea)it9.next();
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "SleepReferral";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.isPulseOximetry() != null)
		{
			sb.append("<pulseOximetry>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPulseOximetry().toString()));
			sb.append("</pulseOximetry>");		
		}
		if (this.getOximetryValues() != null)
		{
			sb.append("<oximetryValues>");
			sb.append(this.getOximetryValues().toXMLString()); 
			sb.append("</oximetryValues>");		
		}
		if (this.getWeightHeightNeckSize() != null)
		{
			sb.append("<weightHeightNeckSize>");
			sb.append(this.getWeightHeightNeckSize().toXMLString(domMap)); 	
			sb.append("</weightHeightNeckSize>");		
		}
		if (this.getMedication() != null)
		{
			sb.append("<medication>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedication().toString()));
			sb.append("</medication>");		
		}
		if (this.getSleepFindings() != null)
		{
			if (this.getSleepFindings().size() > 0 )
			{
			sb.append("<sleepFindings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSleepFindings(), domMap));
			sb.append("</sleepFindings>");		
			}
		}
		if (this.getEpworthSleepAssessment() != null)
		{
			if (this.getEpworthSleepAssessment().size() > 0 )
			{
			sb.append("<epworthSleepAssessment>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getEpworthSleepAssessment(), domMap));
			sb.append("</epworthSleepAssessment>");		
			}
		}
		if (this.getCognitiveFunction() != null)
		{
			if (this.getCognitiveFunction().size() > 0 )
			{
			sb.append("<cognitiveFunction>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCognitiveFunction(), domMap));
			sb.append("</cognitiveFunction>");		
			}
		}
		if (this.getSleepApnoea() != null)
		{
			if (this.getSleepApnoea().size() > 0 )
			{
			sb.append("<sleepApnoea>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSleepApnoea(), domMap));
			sb.append("</sleepApnoea>");		
			}
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			SleepReferral domainObject = getSleepReferralfromXML(itemEl, factory, domMap);

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
			SleepReferral domainObject = getSleepReferralfromXML(itemEl, factory, domMap);

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
		
	public static SleepReferral getSleepReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSleepReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SleepReferral getSleepReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SleepReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SleepReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SleepReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SleepReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SleepReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SleepReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SleepReferral)factory.getImportedDomainObject(SleepReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SleepReferral();
		}
		String keyClassName = "SleepReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SleepReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SleepReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pulseOximetry");
		if(fldEl != null)
		{	
    		obj.setPulseOximetry(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oximetryValues");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOximetryValues(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("weightHeightNeckSize");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWeightHeightNeckSize(ims.core.vitals.domain.objects.Metrics.getMetricsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("medication");
		if(fldEl != null)
		{	
    		obj.setMedication(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sleepFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSleepFindings(ims.medical.domain.objects.SleepFindings.fromSetXMLString(fldEl, factory, obj.getSleepFindings(), domMap));
		}
		fldEl = el.element("epworthSleepAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setEpworthSleepAssessment(ims.core.clinical.domain.objects.EpworthSleepAssessment.fromSetXMLString(fldEl, factory, obj.getEpworthSleepAssessment(), domMap));
		}
		fldEl = el.element("cognitiveFunction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCognitiveFunction(ims.medical.domain.objects.CognitiveFunction.fromSetXMLString(fldEl, factory, obj.getCognitiveFunction(), domMap));
		}
		fldEl = el.element("sleepApnoea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSleepApnoea(ims.medical.domain.objects.SleepApnoea.fromSetXMLString(fldEl, factory, obj.getSleepApnoea(), domMap));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "sleepFindings"
		, "epworthSleepAssessment"
		, "cognitiveFunction"
		, "sleepApnoea"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String PulseOximetry = "pulseOximetry";
		public static final String OximetryValues = "oximetryValues";
		public static final String WeightHeightNeckSize = "weightHeightNeckSize";
		public static final String Medication = "medication";
		public static final String SleepFindings = "sleepFindings";
		public static final String EpworthSleepAssessment = "epworthSleepAssessment";
		public static final String CognitiveFunction = "cognitiveFunction";
		public static final String SleepApnoea = "sleepApnoea";
		public static final String CareContext = "careContext";
	}
}

