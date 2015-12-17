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
package ims.assessment.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class AssessmentQuestion extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100045;
	private static final long serialVersionUID = 1003100045L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Question */
	private ims.core.clinical.domain.objects.QuestionInformation question;
	/** isMandatory */
	private Boolean isMandatory;
	/** QuestionScoringAnswer */
	private ims.core.clinical.domain.objects.QuestionAnswerType scoringAnswerType;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** Sequence */
	private Integer sequence;
	/** allowsMultipleAnswers */
	private Boolean allowsMultipleAnswers;
	/** AssessmentAnswerRole
	  * Collection of ims.assessment.configuration.domain.objects.AssessmentQuestionRole.
	  */
	private java.util.Set assessmentAnswerRole;
	/** URL */
	private String uRL;
	/** Protocol */
	private String protocol;
	/** isNonStandard */
	private Boolean isNonStandard;
	/** Manchester Triage Priority */
	private Integer triagePriority;
	/** Legend Text for the Question */
	private String legendText;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AssessmentQuestion (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AssessmentQuestion ()
    {
    	super();
    }
    public AssessmentQuestion (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.configuration.domain.objects.AssessmentQuestion.class;
	}


	public ims.core.clinical.domain.objects.QuestionInformation getQuestion() {
		return question;
	}
	public void setQuestion(ims.core.clinical.domain.objects.QuestionInformation question) {
		this.question = question;
	}

	public Boolean isIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public ims.core.clinical.domain.objects.QuestionAnswerType getScoringAnswerType() {
		return scoringAnswerType;
	}
	public void setScoringAnswerType(ims.core.clinical.domain.objects.QuestionAnswerType scoringAnswerType) {
		this.scoringAnswerType = scoringAnswerType;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Boolean isAllowsMultipleAnswers() {
		return allowsMultipleAnswers;
	}
	public void setAllowsMultipleAnswers(Boolean allowsMultipleAnswers) {
		this.allowsMultipleAnswers = allowsMultipleAnswers;
	}

	public java.util.Set getAssessmentAnswerRole() {
		if ( null == assessmentAnswerRole ) {
			assessmentAnswerRole = new java.util.HashSet();
		}
		return assessmentAnswerRole;
	}
	public void setAssessmentAnswerRole(java.util.Set paramValue) {
		this.assessmentAnswerRole = paramValue;
	}

	public String getURL() {
		return uRL;
	}
	public void setURL(String uRL) {
		if ( null != uRL && uRL.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uRL. Tried to set value: "+
				uRL);
		}
		this.uRL = uRL;
	}

	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		if ( null != protocol && protocol.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for protocol. Tried to set value: "+
				protocol);
		}
		this.protocol = protocol;
	}

	public Boolean isIsNonStandard() {
		return isNonStandard;
	}
	public void setIsNonStandard(Boolean isNonStandard) {
		this.isNonStandard = isNonStandard;
	}

	public Integer getTriagePriority() {
		return triagePriority;
	}
	public void setTriagePriority(Integer triagePriority) {
		this.triagePriority = triagePriority;
	}

	public String getLegendText() {
		return legendText;
	}
	public void setLegendText(String legendText) {
		this.legendText = legendText;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*question* :");
		if (question != null)
		{
			auditStr.append(toShortClassName(question));
				
		    auditStr.append(question.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isMandatory* :");
		auditStr.append(isMandatory);
	    auditStr.append("; ");
		auditStr.append("\r\n*scoringAnswerType* :");
		if (scoringAnswerType != null)
		{
			auditStr.append(toShortClassName(scoringAnswerType));
				
		    auditStr.append(scoringAnswerType.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sequence* :");
		auditStr.append(sequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*allowsMultipleAnswers* :");
		auditStr.append(allowsMultipleAnswers);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentAnswerRole* :");
		if (assessmentAnswerRole != null)
		{
			java.util.Iterator it7 = assessmentAnswerRole.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.assessment.configuration.domain.objects.AssessmentQuestionRole obj = (ims.assessment.configuration.domain.objects.AssessmentQuestionRole)it7.next();
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
		auditStr.append("\r\n*uRL* :");
		auditStr.append(uRL);
	    auditStr.append("; ");
		auditStr.append("\r\n*protocol* :");
		auditStr.append(protocol);
	    auditStr.append("; ");
		auditStr.append("\r\n*isNonStandard* :");
		auditStr.append(isNonStandard);
	    auditStr.append("; ");
		auditStr.append("\r\n*triagePriority* :");
		auditStr.append(triagePriority);
	    auditStr.append("; ");
		auditStr.append("\r\n*legendText* :");
		auditStr.append(legendText);
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
		
		String keyClassName = "AssessmentQuestion";
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
		if (this.getQuestion() != null)
		{
			sb.append("<question>");
			sb.append(this.getQuestion().toXMLString(domMap)); 	
			sb.append("</question>");		
		}
		if (this.isIsMandatory() != null)
		{
			sb.append("<isMandatory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMandatory().toString()));
			sb.append("</isMandatory>");		
		}
		if (this.getScoringAnswerType() != null)
		{
			sb.append("<scoringAnswerType>");
			sb.append(this.getScoringAnswerType().toXMLString(domMap)); 	
			sb.append("</scoringAnswerType>");		
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequence().toString()));
			sb.append("</sequence>");		
		}
		if (this.isAllowsMultipleAnswers() != null)
		{
			sb.append("<allowsMultipleAnswers>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllowsMultipleAnswers().toString()));
			sb.append("</allowsMultipleAnswers>");		
		}
		if (this.getAssessmentAnswerRole() != null)
		{
			if (this.getAssessmentAnswerRole().size() > 0 )
			{
			sb.append("<assessmentAnswerRole>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssessmentAnswerRole(), domMap));
			sb.append("</assessmentAnswerRole>");		
			}
		}
		if (this.getURL() != null)
		{
			sb.append("<uRL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getURL().toString()));
			sb.append("</uRL>");		
		}
		if (this.getProtocol() != null)
		{
			sb.append("<protocol>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProtocol().toString()));
			sb.append("</protocol>");		
		}
		if (this.isIsNonStandard() != null)
		{
			sb.append("<isNonStandard>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsNonStandard().toString()));
			sb.append("</isNonStandard>");		
		}
		if (this.getTriagePriority() != null)
		{
			sb.append("<triagePriority>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTriagePriority().toString()));
			sb.append("</triagePriority>");		
		}
		if (this.getLegendText() != null)
		{
			sb.append("<legendText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLegendText().toString()));
			sb.append("</legendText>");		
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
			AssessmentQuestion domainObject = getAssessmentQuestionfromXML(itemEl, factory, domMap);

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
			AssessmentQuestion domainObject = getAssessmentQuestionfromXML(itemEl, factory, domMap);

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
		
	public static AssessmentQuestion getAssessmentQuestionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAssessmentQuestionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AssessmentQuestion getAssessmentQuestionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AssessmentQuestion.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AssessmentQuestion.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AssessmentQuestion class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AssessmentQuestion)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AssessmentQuestion.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AssessmentQuestion ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AssessmentQuestion)factory.getImportedDomainObject(AssessmentQuestion.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AssessmentQuestion();
		}
		String keyClassName = "AssessmentQuestion";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AssessmentQuestion)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AssessmentQuestion obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("question");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setQuestion(ims.core.clinical.domain.objects.QuestionInformation.getQuestionInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isMandatory");
		if(fldEl != null)
		{	
    		obj.setIsMandatory(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("scoringAnswerType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScoringAnswerType(ims.core.clinical.domain.objects.QuestionAnswerType.getQuestionAnswerTypefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sequence");
		if(fldEl != null)
		{	
    		obj.setSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allowsMultipleAnswers");
		if(fldEl != null)
		{	
    		obj.setAllowsMultipleAnswers(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessmentAnswerRole");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssessmentAnswerRole(ims.assessment.configuration.domain.objects.AssessmentQuestionRole.fromSetXMLString(fldEl, factory, obj.getAssessmentAnswerRole(), domMap));
		}
		fldEl = el.element("uRL");
		if(fldEl != null)
		{	
    		obj.setURL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("protocol");
		if(fldEl != null)
		{	
    		obj.setProtocol(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isNonStandard");
		if(fldEl != null)
		{	
    		obj.setIsNonStandard(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("triagePriority");
		if(fldEl != null)
		{	
    		obj.setTriagePriority(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("legendText");
		if(fldEl != null)
		{	
    		obj.setLegendText(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assessmentAnswerRole"
		};
	}

	/**
	hashcode_equals
	*/
public boolean equals(Object obj)
    {
          if (null == obj)
          {
              return false;
           }
          
          Integer id = this.getId();
          if ( null == id ) // fall back on object equality 
		  {  
			return (this == obj); 
		  } 
          Integer objId = ((AssessmentQuestion)obj).getId();
          if (objId == null)
          {
        	  return (this == obj);
          }
          if (id.intValue() == objId.intValue())
             return true;
        return false;
	}

    public int hashCode()
    {
		if (this.getId() == null)
		{ 
			return super.hashCode(); 
		}
        return (this.getId().hashCode() * 14001) + this.getClassId();
    }


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Question = "question";
		public static final String IsMandatory = "isMandatory";
		public static final String ScoringAnswerType = "scoringAnswerType";
		public static final String ActiveStatus = "activeStatus";
		public static final String Sequence = "sequence";
		public static final String AllowsMultipleAnswers = "allowsMultipleAnswers";
		public static final String AssessmentAnswerRole = "assessmentAnswerRole";
		public static final String URL = "uRL";
		public static final String Protocol = "protocol";
		public static final String IsNonStandard = "isNonStandard";
		public static final String TriagePriority = "triagePriority";
		public static final String LegendText = "legendText";
	}
}

