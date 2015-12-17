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
 * @author John MacEnri
 * Generated.
 */


public class GeneralQuestionAnswer extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100072;
	private static final long serialVersionUID = 1003100072L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** PatientAnswers
	  * Collection of ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer.
	  */
	private java.util.List patientAnswers;
	private ims.core.clinical.domain.objects.QuestionInformation question;
	private ims.domain.lookups.LookupInstance questionGroup;
	private Boolean wasMandatory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public GeneralQuestionAnswer (Integer id, int ver)
    {
    	super(id, ver);
    }
    public GeneralQuestionAnswer ()
    {
    	super();
    }
    public GeneralQuestionAnswer (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.GeneralQuestionAnswer.class;
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

	public ims.core.clinical.domain.objects.QuestionInformation getQuestion() {
		return question;
	}
	public void setQuestion(ims.core.clinical.domain.objects.QuestionInformation question) {
		this.question = question;
	}

	public ims.domain.lookups.LookupInstance getQuestionGroup() {
		return questionGroup;
	}
	public void setQuestionGroup(ims.domain.lookups.LookupInstance questionGroup) {
		this.questionGroup = questionGroup;
	}

	public Boolean isWasMandatory() {
		return wasMandatory;
	}
	public void setWasMandatory(Boolean wasMandatory) {
		this.wasMandatory = wasMandatory;
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
		
		auditStr.append("\r\n*patientAnswers* :");
		if (patientAnswers != null)
		{
		int i1=0;
		for (i1=0; i1<patientAnswers.size(); i1++)
		{
			if (i1 > 0)
				auditStr.append(",");
			ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer obj = (ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer)patientAnswers.get(i1);
		    if (obj != null)
			{
				if (i1 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*question* :");
		if (question != null)
		{
			auditStr.append(toShortClassName(question));
				
		    auditStr.append(question.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*questionGroup* :");
		if (questionGroup != null)
			auditStr.append(questionGroup.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasMandatory* :");
		auditStr.append(wasMandatory);
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
		
		String keyClassName = "GeneralQuestionAnswer";
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
		if (this.getPatientAnswers() != null)
		{
			if (this.getPatientAnswers().size() > 0 )
			{
			sb.append("<patientAnswers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientAnswers(), domMap));
			sb.append("</patientAnswers>");		
			}
		}
		if (this.getQuestion() != null)
		{
			sb.append("<question>");
			sb.append(this.getQuestion().toXMLString(domMap)); 	
			sb.append("</question>");		
		}
		if (this.getQuestionGroup() != null)
		{
			sb.append("<questionGroup>");
			sb.append(this.getQuestionGroup().toXMLString()); 
			sb.append("</questionGroup>");		
		}
		if (this.isWasMandatory() != null)
		{
			sb.append("<wasMandatory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasMandatory().toString()));
			sb.append("</wasMandatory>");		
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
			GeneralQuestionAnswer domainObject = getGeneralQuestionAnswerfromXML(itemEl, factory, domMap);

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
			GeneralQuestionAnswer domainObject = getGeneralQuestionAnswerfromXML(itemEl, factory, domMap);

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
		
	public static GeneralQuestionAnswer getGeneralQuestionAnswerfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGeneralQuestionAnswerfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static GeneralQuestionAnswer getGeneralQuestionAnswerfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!GeneralQuestionAnswer.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!GeneralQuestionAnswer.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the GeneralQuestionAnswer class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (GeneralQuestionAnswer)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(GeneralQuestionAnswer.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		GeneralQuestionAnswer ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (GeneralQuestionAnswer)factory.getImportedDomainObject(GeneralQuestionAnswer.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new GeneralQuestionAnswer();
		}
		String keyClassName = "GeneralQuestionAnswer";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (GeneralQuestionAnswer)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, GeneralQuestionAnswer obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patientAnswers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPatientAnswers(ims.assessment.instantiation.domain.objects.PatientAssessmentAnswer.fromListXMLString(fldEl, factory, obj.getPatientAnswers(), domMap));
		}
		fldEl = el.element("question");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setQuestion(ims.core.clinical.domain.objects.QuestionInformation.getQuestionInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("questionGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQuestionGroup(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasMandatory");
		if(fldEl != null)
		{	
    		obj.setWasMandatory(new Boolean(fldEl.getTextTrim()));	
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
		public static final String PatientAnswers = "patientAnswers";
		public static final String Question = "question";
		public static final String QuestionGroup = "questionGroup";
		public static final String WasMandatory = "wasMandatory";
	}
}

