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


public class PatientAssessmentData extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100050;
	private static final long serialVersionUID = 1003100050L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** UserAssessment */
	private ims.assessment.configuration.domain.objects.UserAssessment userAssessment;
	/** Graphic */
	private ims.assessment.configuration.domain.objects.GraphicAssessment graphic;
	/** GraphicFindings
	  * Collection of ims.assessment.instantiation.domain.objects.PatientGraphicAssessment.
	  */
	private java.util.List graphicFindings;
	/** AnswerGroups
	  * Collection of ims.assessment.instantiation.domain.objects.PatientAssessmentGroup.
	  */
	private java.util.List answerGroups;
	/** GroupQuestionWidth */
	private Integer groupQuestionWidth;
	/** GraphicQuestion
	  * Collection of ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentQuestionAnswer.
	  */
	private java.util.List graphicQuestion;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAssessmentData (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAssessmentData ()
    {
    	super();
    }
    public PatientAssessmentData (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.instantiation.domain.objects.PatientAssessmentData.class;
	}


	public ims.assessment.configuration.domain.objects.UserAssessment getUserAssessment() {
		return userAssessment;
	}
	public void setUserAssessment(ims.assessment.configuration.domain.objects.UserAssessment userAssessment) {
		this.userAssessment = userAssessment;
	}

	public ims.assessment.configuration.domain.objects.GraphicAssessment getGraphic() {
		return graphic;
	}
	public void setGraphic(ims.assessment.configuration.domain.objects.GraphicAssessment graphic) {
		this.graphic = graphic;
	}

	public java.util.List getGraphicFindings() {
		if ( null == graphicFindings ) {
			graphicFindings = new java.util.ArrayList();
		}
		return graphicFindings;
	}
	public void setGraphicFindings(java.util.List paramValue) {
		this.graphicFindings = paramValue;
	}

	public java.util.List getAnswerGroups() {
		if ( null == answerGroups ) {
			answerGroups = new java.util.ArrayList();
		}
		return answerGroups;
	}
	public void setAnswerGroups(java.util.List paramValue) {
		this.answerGroups = paramValue;
	}

	public Integer getGroupQuestionWidth() {
		return groupQuestionWidth;
	}
	public void setGroupQuestionWidth(Integer groupQuestionWidth) {
		this.groupQuestionWidth = groupQuestionWidth;
	}

	public java.util.List getGraphicQuestion() {
		if ( null == graphicQuestion ) {
			graphicQuestion = new java.util.ArrayList();
		}
		return graphicQuestion;
	}
	public void setGraphicQuestion(java.util.List paramValue) {
		this.graphicQuestion = paramValue;
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
		
		auditStr.append("\r\n*userAssessment* :");
		if (userAssessment != null)
		{
			auditStr.append(toShortClassName(userAssessment));
				
		    auditStr.append(userAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*graphic* :");
		if (graphic != null)
		{
			auditStr.append(toShortClassName(graphic));
				
		    auditStr.append(graphic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*graphicFindings* :");
		if (graphicFindings != null)
		{
		int i3=0;
		for (i3=0; i3<graphicFindings.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.assessment.instantiation.domain.objects.PatientGraphicAssessment obj = (ims.assessment.instantiation.domain.objects.PatientGraphicAssessment)graphicFindings.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*answerGroups* :");
		if (answerGroups != null)
		{
		int i4=0;
		for (i4=0; i4<answerGroups.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.assessment.instantiation.domain.objects.PatientAssessmentGroup obj = (ims.assessment.instantiation.domain.objects.PatientAssessmentGroup)answerGroups.get(i4);
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
		auditStr.append("\r\n*groupQuestionWidth* :");
		auditStr.append(groupQuestionWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*graphicQuestion* :");
		if (graphicQuestion != null)
		{
		int i6=0;
		for (i6=0; i6<graphicQuestion.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentQuestionAnswer obj = (ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentQuestionAnswer)graphicQuestion.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
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
		
		String keyClassName = "PatientAssessmentData";
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
		if (this.getUserAssessment() != null)
		{
			sb.append("<userAssessment>");
			sb.append(this.getUserAssessment().toXMLString(domMap)); 	
			sb.append("</userAssessment>");		
		}
		if (this.getGraphic() != null)
		{
			sb.append("<graphic>");
			sb.append(this.getGraphic().toXMLString(domMap)); 	
			sb.append("</graphic>");		
		}
		if (this.getGraphicFindings() != null)
		{
			if (this.getGraphicFindings().size() > 0 )
			{
			sb.append("<graphicFindings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGraphicFindings(), domMap));
			sb.append("</graphicFindings>");		
			}
		}
		if (this.getAnswerGroups() != null)
		{
			if (this.getAnswerGroups().size() > 0 )
			{
			sb.append("<answerGroups>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnswerGroups(), domMap));
			sb.append("</answerGroups>");		
			}
		}
		if (this.getGroupQuestionWidth() != null)
		{
			sb.append("<groupQuestionWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGroupQuestionWidth().toString()));
			sb.append("</groupQuestionWidth>");		
		}
		if (this.getGraphicQuestion() != null)
		{
			if (this.getGraphicQuestion().size() > 0 )
			{
			sb.append("<graphicQuestion>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGraphicQuestion(), domMap));
			sb.append("</graphicQuestion>");		
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
			PatientAssessmentData domainObject = getPatientAssessmentDatafromXML(itemEl, factory, domMap);

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
			PatientAssessmentData domainObject = getPatientAssessmentDatafromXML(itemEl, factory, domMap);

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
		
	public static PatientAssessmentData getPatientAssessmentDatafromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAssessmentDatafromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAssessmentData getPatientAssessmentDatafromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAssessmentData.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAssessmentData.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAssessmentData class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAssessmentData)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAssessmentData.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAssessmentData ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAssessmentData)factory.getImportedDomainObject(PatientAssessmentData.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAssessmentData();
		}
		String keyClassName = "PatientAssessmentData";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAssessmentData)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAssessmentData obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("userAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setUserAssessment(ims.assessment.configuration.domain.objects.UserAssessment.getUserAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("graphic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGraphic(ims.assessment.configuration.domain.objects.GraphicAssessment.getGraphicAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("graphicFindings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGraphicFindings(ims.assessment.instantiation.domain.objects.PatientGraphicAssessment.fromListXMLString(fldEl, factory, obj.getGraphicFindings(), domMap));
		}
		fldEl = el.element("answerGroups");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnswerGroups(ims.assessment.instantiation.domain.objects.PatientAssessmentGroup.fromListXMLString(fldEl, factory, obj.getAnswerGroups(), domMap));
		}
		fldEl = el.element("groupQuestionWidth");
		if(fldEl != null)
		{	
    		obj.setGroupQuestionWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("graphicQuestion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGraphicQuestion(ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentQuestionAnswer.fromListXMLString(fldEl, factory, obj.getGraphicQuestion(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "graphicFindings"
		, "answerGroups"
		, "graphicQuestion"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String UserAssessment = "userAssessment";
		public static final String Graphic = "graphic";
		public static final String GraphicFindings = "graphicFindings";
		public static final String AnswerGroups = "answerGroups";
		public static final String GroupQuestionWidth = "groupQuestionWidth";
		public static final String GraphicQuestion = "graphicQuestion";
	}
}

