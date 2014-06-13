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
package ims.assessment.instantiation.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientAssessmentQuestion extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100005;
	private static final long serialVersionUID = 1070100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** isAnswered */
	private ims.domain.lookups.LookupInstance isAnswered;
	/** AssessmentQuestion */
	private ims.assessment.configuration.domain.objects.AssessmentQuestion assessmentQuestion;
	/** Sequence */
	private Integer sequence;
	/** PatientAnswers
	  * Collection of ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer.
	  */
	private java.util.List patientAnswers;
	/** isMandatory */
	private Boolean isMandatory;
	/** allowsMultipleAnswers */
	private Boolean allowsMultipleAnswers;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAssessmentQuestion (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAssessmentQuestion ()
    {
    	super();
    }
    public PatientAssessmentQuestion (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.instantiation.domain.objects.PatientAssessmentQuestion.class;
	}


	public ims.domain.lookups.LookupInstance getIsAnswered() {
		return isAnswered;
	}
	public void setIsAnswered(ims.domain.lookups.LookupInstance isAnswered) {
		this.isAnswered = isAnswered;
	}

	public ims.assessment.configuration.domain.objects.AssessmentQuestion getAssessmentQuestion() {
		return assessmentQuestion;
	}
	public void setAssessmentQuestion(ims.assessment.configuration.domain.objects.AssessmentQuestion assessmentQuestion) {
		this.assessmentQuestion = assessmentQuestion;
	}

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public java.util.List getPatientAnswers() {
		if ( null == patientAnswers ) {
			patientAnswers = new java.util.ArrayList();
		}
		return patientAnswers;
	}
	public void setPatientAnswers(java.util.List paramValue) {
		this.patientAnswers = paramValue;
	}

	public Boolean isIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Boolean isAllowsMultipleAnswers() {
		return allowsMultipleAnswers;
	}
	public void setAllowsMultipleAnswers(Boolean allowsMultipleAnswers) {
		this.allowsMultipleAnswers = allowsMultipleAnswers;
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
		
		auditStr.append("\r\n*isAnswered* :");
		if (isAnswered != null)
			auditStr.append(isAnswered.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentQuestion* :");
		if (assessmentQuestion != null)
		{
			auditStr.append(toShortClassName(assessmentQuestion));
				
		    auditStr.append(assessmentQuestion.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sequence* :");
		auditStr.append(sequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAnswers* :");
		if (patientAnswers != null)
		{
		int i4=0;
		for (i4=0; i4<patientAnswers.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer obj = (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer)patientAnswers.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isMandatory* :");
		auditStr.append(isMandatory);
	    auditStr.append("; ");
		auditStr.append("\r\n*allowsMultipleAnswers* :");
		auditStr.append(allowsMultipleAnswers);
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
		
		String keyClassName = "PatientAssessmentQuestion";
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
		if (this.getIsAnswered() != null)
		{
			sb.append("<isAnswered>");
			sb.append(this.getIsAnswered().toXMLString()); 
			sb.append("</isAnswered>");		
		}
		if (this.getAssessmentQuestion() != null)
		{
			sb.append("<assessmentQuestion>");
			sb.append(this.getAssessmentQuestion().toXMLString(domMap)); 	
			sb.append("</assessmentQuestion>");		
		}
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequence().toString()));
			sb.append("</sequence>");		
		}
		if (this.getPatientAnswers() != null)
		{
			if (this.getPatientAnswers().size() > 0 )
			{
			sb.append("<patientAnswers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientAnswers(), domMap));
			sb.append("</patientAnswers>");		
			}
		}
		if (this.isIsMandatory() != null)
		{
			sb.append("<isMandatory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMandatory().toString()));
			sb.append("</isMandatory>");		
		}
		if (this.isAllowsMultipleAnswers() != null)
		{
			sb.append("<allowsMultipleAnswers>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllowsMultipleAnswers().toString()));
			sb.append("</allowsMultipleAnswers>");		
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
			PatientAssessmentQuestion domainObject = getPatientAssessmentQuestionfromXML(itemEl, factory, domMap);

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
			PatientAssessmentQuestion domainObject = getPatientAssessmentQuestionfromXML(itemEl, factory, domMap);

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
		
	public static PatientAssessmentQuestion getPatientAssessmentQuestionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAssessmentQuestionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAssessmentQuestion getPatientAssessmentQuestionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAssessmentQuestion.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAssessmentQuestion.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAssessmentQuestion class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAssessmentQuestion)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAssessmentQuestion.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAssessmentQuestion ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAssessmentQuestion)factory.getImportedDomainObject(PatientAssessmentQuestion.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAssessmentQuestion();
		}
		String keyClassName = "PatientAssessmentQuestion";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAssessmentQuestion)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAssessmentQuestion obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("isAnswered");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsAnswered(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assessmentQuestion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessmentQuestion(ims.assessment.configuration.domain.objects.AssessmentQuestion.getAssessmentQuestionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sequence");
		if(fldEl != null)
		{	
    		obj.setSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientAnswers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientAnswers(ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer.fromListXMLString(fldEl, factory, obj.getPatientAnswers(), domMap));
		}
		fldEl = el.element("isMandatory");
		if(fldEl != null)
		{	
    		obj.setIsMandatory(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allowsMultipleAnswers");
		if(fldEl != null)
		{	
    		obj.setAllowsMultipleAnswers(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientAnswers"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String IsAnswered = "isAnswered";
		public static final String AssessmentQuestion = "assessmentQuestion";
		public static final String Sequence = "sequence";
		public static final String PatientAnswers = "patientAnswers";
		public static final String IsMandatory = "isMandatory";
		public static final String AllowsMultipleAnswers = "allowsMultipleAnswers";
	}
}

