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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class MobilityComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100030;
	private static final long serialVersionUID = 1012100030L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String notes;
	private ims.domain.lookups.LookupInstance bedType;
	private ims.domain.lookups.LookupInstance chairType;
	private ims.domain.lookups.LookupInstance assistanceWithMobility;
	private ims.coe.assessmenttools.domain.objects.FallAssessment optionalFallAssessment;
	private ims.coe.assessmenttools.domain.objects.PatientMovementHandlingScreening patientHandling;
	private ims.coe.assessmenttools.domain.objects.PatientMovementHandling patientMovement;
	/** Fall Assessment Score */
	private Integer fallAssessmentScore;
	/** EnvironmentChecklist */
	private ims.nursing.domain.objects.EnvironmentalChecklist environmentChecklist;
    public MobilityComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MobilityComponent ()
    {
    	super();
    }
    public MobilityComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.MobilityComponent.class;
	}


	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.domain.lookups.LookupInstance getBedType() {
		return bedType;
	}
	public void setBedType(ims.domain.lookups.LookupInstance bedType) {
		this.bedType = bedType;
	}

	public ims.domain.lookups.LookupInstance getChairType() {
		return chairType;
	}
	public void setChairType(ims.domain.lookups.LookupInstance chairType) {
		this.chairType = chairType;
	}

	public ims.domain.lookups.LookupInstance getAssistanceWithMobility() {
		return assistanceWithMobility;
	}
	public void setAssistanceWithMobility(ims.domain.lookups.LookupInstance assistanceWithMobility) {
		this.assistanceWithMobility = assistanceWithMobility;
	}

	public ims.coe.assessmenttools.domain.objects.FallAssessment getOptionalFallAssessment() {
		return optionalFallAssessment;
	}
	public void setOptionalFallAssessment(ims.coe.assessmenttools.domain.objects.FallAssessment optionalFallAssessment) {
		this.optionalFallAssessment = optionalFallAssessment;
	}

	public ims.coe.assessmenttools.domain.objects.PatientMovementHandlingScreening getPatientHandling() {
		return patientHandling;
	}
	public void setPatientHandling(ims.coe.assessmenttools.domain.objects.PatientMovementHandlingScreening patientHandling) {
		this.patientHandling = patientHandling;
	}

	public ims.coe.assessmenttools.domain.objects.PatientMovementHandling getPatientMovement() {
		return patientMovement;
	}
	public void setPatientMovement(ims.coe.assessmenttools.domain.objects.PatientMovementHandling patientMovement) {
		this.patientMovement = patientMovement;
	}

	public Integer getFallAssessmentScore() {
		return fallAssessmentScore;
	}
	public void setFallAssessmentScore(Integer fallAssessmentScore) {
		this.fallAssessmentScore = fallAssessmentScore;
	}

	public ims.nursing.domain.objects.EnvironmentalChecklist getEnvironmentChecklist() {
		return environmentChecklist;
	}
	public void setEnvironmentChecklist(ims.nursing.domain.objects.EnvironmentalChecklist environmentChecklist) {
		this.environmentChecklist = environmentChecklist;
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
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedType* :");
		if (bedType != null)
			auditStr.append(bedType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*chairType* :");
		if (chairType != null)
			auditStr.append(chairType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assistanceWithMobility* :");
		if (assistanceWithMobility != null)
			auditStr.append(assistanceWithMobility.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*optionalFallAssessment* :");
		if (optionalFallAssessment != null)
		{
			auditStr.append(toShortClassName(optionalFallAssessment));
				
		    auditStr.append(optionalFallAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientHandling* :");
		if (patientHandling != null)
		{
			auditStr.append(toShortClassName(patientHandling));
				
		    auditStr.append(patientHandling.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientMovement* :");
		if (patientMovement != null)
		{
			auditStr.append(toShortClassName(patientMovement));
				
		    auditStr.append(patientMovement.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fallAssessmentScore* :");
		auditStr.append(fallAssessmentScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*environmentChecklist* :");
		if (environmentChecklist != null)
		{
			auditStr.append(toShortClassName(environmentChecklist));
				
		    auditStr.append(environmentChecklist.getId());
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
		
		String keyClassName = "MobilityComponent";
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
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getBedType() != null)
		{
			sb.append("<bedType>");
			sb.append(this.getBedType().toXMLString()); 
			sb.append("</bedType>");		
		}
		if (this.getChairType() != null)
		{
			sb.append("<chairType>");
			sb.append(this.getChairType().toXMLString()); 
			sb.append("</chairType>");		
		}
		if (this.getAssistanceWithMobility() != null)
		{
			sb.append("<assistanceWithMobility>");
			sb.append(this.getAssistanceWithMobility().toXMLString()); 
			sb.append("</assistanceWithMobility>");		
		}
		if (this.getOptionalFallAssessment() != null)
		{
			sb.append("<optionalFallAssessment>");
			sb.append(this.getOptionalFallAssessment().toXMLString(domMap)); 	
			sb.append("</optionalFallAssessment>");		
		}
		if (this.getPatientHandling() != null)
		{
			sb.append("<patientHandling>");
			sb.append(this.getPatientHandling().toXMLString(domMap)); 	
			sb.append("</patientHandling>");		
		}
		if (this.getPatientMovement() != null)
		{
			sb.append("<patientMovement>");
			sb.append(this.getPatientMovement().toXMLString(domMap)); 	
			sb.append("</patientMovement>");		
		}
		if (this.getFallAssessmentScore() != null)
		{
			sb.append("<fallAssessmentScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFallAssessmentScore().toString()));
			sb.append("</fallAssessmentScore>");		
		}
		if (this.getEnvironmentChecklist() != null)
		{
			sb.append("<environmentChecklist>");
			sb.append(this.getEnvironmentChecklist().toXMLString(domMap)); 	
			sb.append("</environmentChecklist>");		
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
			MobilityComponent domainObject = getMobilityComponentfromXML(itemEl, factory, domMap);

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
			MobilityComponent domainObject = getMobilityComponentfromXML(itemEl, factory, domMap);

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
		
	public static MobilityComponent getMobilityComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMobilityComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MobilityComponent getMobilityComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MobilityComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MobilityComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MobilityComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MobilityComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MobilityComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MobilityComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MobilityComponent)factory.getImportedDomainObject(MobilityComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MobilityComponent();
		}
		String keyClassName = "MobilityComponent";
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
			return (MobilityComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MobilityComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bedType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBedType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("chairType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChairType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assistanceWithMobility");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssistanceWithMobility(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("optionalFallAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOptionalFallAssessment(ims.coe.assessmenttools.domain.objects.FallAssessment.getFallAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientHandling");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientHandling(ims.coe.assessmenttools.domain.objects.PatientMovementHandlingScreening.getPatientMovementHandlingScreeningfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientMovement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientMovement(ims.coe.assessmenttools.domain.objects.PatientMovementHandling.getPatientMovementHandlingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("fallAssessmentScore");
		if(fldEl != null)
		{	
    		obj.setFallAssessmentScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("environmentChecklist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEnvironmentChecklist(ims.nursing.domain.objects.EnvironmentalChecklist.getEnvironmentalChecklistfromXML(fldEl, factory, domMap)); 
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
		public static final String Notes = "notes";
		public static final String BedType = "bedType";
		public static final String ChairType = "chairType";
		public static final String AssistanceWithMobility = "assistanceWithMobility";
		public static final String OptionalFallAssessment = "optionalFallAssessment";
		public static final String PatientHandling = "patientHandling";
		public static final String PatientMovement = "patientMovement";
		public static final String FallAssessmentScore = "fallAssessmentScore";
		public static final String EnvironmentChecklist = "environmentChecklist";
	}
}

