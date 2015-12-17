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


public class PatientAnswerDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100052;
	private static final long serialVersionUID = 1003100052L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AnswerType */
	private ims.core.clinical.domain.objects.QuestionAnswerType answerType;
	/** MultiSelectAnswers
	  * Collection of ims.core.clinical.domain.objects.AnswerOption.
	  */
	private java.util.Set multiSelectAnswers;
	/** Picklist */
	private ims.core.clinical.domain.objects.AnswerOption picklist;
	/** Calculated Score - Scoring Answers */
	private java.lang.Float calculatedScore;
	/** BoolValueAnswer */
	private Boolean boolValueAnswer;
	/** DateAnswer */
	private java.util.Date dateAnswer;
	/** TimeAnswer */
	private String timeAnswer;
	/** StringAnswer */
	private String stringAnswer;
	/** IntegerAnswer */
	private Integer integerAnswer;
	/** DecimalAnswer */
	private java.lang.Float decimalAnswer;
	/** PartialDate */
	private Integer partialDate;
	/** MaxMultiselectAllowed */
	private Integer maxMultiselectAllowed;
	/** AnswerWidth (picklist/multiselect/text) */
	private Integer answerWidth;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAnswerDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAnswerDetails ()
    {
    	super();
    }
    public PatientAnswerDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.instantiation.domain.objects.PatientAnswerDetails.class;
	}


	public ims.core.clinical.domain.objects.QuestionAnswerType getAnswerType() {
		return answerType;
	}
	public void setAnswerType(ims.core.clinical.domain.objects.QuestionAnswerType answerType) {
		this.answerType = answerType;
	}

	public java.util.Set getMultiSelectAnswers() {
		if ( null == multiSelectAnswers ) {
			multiSelectAnswers = new java.util.HashSet();
		}
		return multiSelectAnswers;
	}
	public void setMultiSelectAnswers(java.util.Set paramValue) {
		this.multiSelectAnswers = paramValue;
	}

	public ims.core.clinical.domain.objects.AnswerOption getPicklist() {
		return picklist;
	}
	public void setPicklist(ims.core.clinical.domain.objects.AnswerOption picklist) {
		this.picklist = picklist;
	}

	public java.lang.Float getCalculatedScore() {
		return calculatedScore;
	}
	public void setCalculatedScore(java.lang.Float calculatedScore) {
		this.calculatedScore = calculatedScore;
	}

	public Boolean isBoolValueAnswer() {
		return boolValueAnswer;
	}
	public void setBoolValueAnswer(Boolean boolValueAnswer) {
		this.boolValueAnswer = boolValueAnswer;
	}

	public java.util.Date getDateAnswer() {
		return dateAnswer;
	}
	public void setDateAnswer(java.util.Date dateAnswer) {
		this.dateAnswer = dateAnswer;
	}

	public String getTimeAnswer() {
		return timeAnswer;
	}
	public void setTimeAnswer(String timeAnswer) {
		this.timeAnswer = timeAnswer;
	}

	public String getStringAnswer() {
		return stringAnswer;
	}
	public void setStringAnswer(String stringAnswer) {
		this.stringAnswer = stringAnswer;
	}

	public Integer getIntegerAnswer() {
		return integerAnswer;
	}
	public void setIntegerAnswer(Integer integerAnswer) {
		this.integerAnswer = integerAnswer;
	}

	public java.lang.Float getDecimalAnswer() {
		return decimalAnswer;
	}
	public void setDecimalAnswer(java.lang.Float decimalAnswer) {
		this.decimalAnswer = decimalAnswer;
	}

	public Integer getPartialDate() {
		return partialDate;
	}
	public void setPartialDate(Integer partialDate) {
		this.partialDate = partialDate;
	}

	public Integer getMaxMultiselectAllowed() {
		return maxMultiselectAllowed;
	}
	public void setMaxMultiselectAllowed(Integer maxMultiselectAllowed) {
		this.maxMultiselectAllowed = maxMultiselectAllowed;
	}

	public Integer getAnswerWidth() {
		return answerWidth;
	}
	public void setAnswerWidth(Integer answerWidth) {
		this.answerWidth = answerWidth;
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
		
		auditStr.append("\r\n*answerType* :");
		if (answerType != null)
		{
			auditStr.append(toShortClassName(answerType));
				
		    auditStr.append(answerType.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*multiSelectAnswers* :");
		if (multiSelectAnswers != null)
		{
			java.util.Iterator it2 = multiSelectAnswers.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.AnswerOption obj = (ims.core.clinical.domain.objects.AnswerOption)it2.next();
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
		auditStr.append("\r\n*picklist* :");
		if (picklist != null)
		{
			auditStr.append(toShortClassName(picklist));
				
		    auditStr.append(picklist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*calculatedScore* :");
		auditStr.append(calculatedScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*boolValueAnswer* :");
		auditStr.append(boolValueAnswer);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateAnswer* :");
		auditStr.append(dateAnswer);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeAnswer* :");
		auditStr.append(timeAnswer);
	    auditStr.append("; ");
		auditStr.append("\r\n*stringAnswer* :");
		auditStr.append(stringAnswer);
	    auditStr.append("; ");
		auditStr.append("\r\n*integerAnswer* :");
		auditStr.append(integerAnswer);
	    auditStr.append("; ");
		auditStr.append("\r\n*decimalAnswer* :");
		auditStr.append(decimalAnswer);
	    auditStr.append("; ");
		auditStr.append("\r\n*partialDate* :");
		auditStr.append(partialDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxMultiselectAllowed* :");
		auditStr.append(maxMultiselectAllowed);
	    auditStr.append("; ");
		auditStr.append("\r\n*answerWidth* :");
		auditStr.append(answerWidth);
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
		
		String keyClassName = "PatientAnswerDetails";
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
		if (this.getAnswerType() != null)
		{
			sb.append("<answerType>");
			sb.append(this.getAnswerType().toXMLString(domMap)); 	
			sb.append("</answerType>");		
		}
		if (this.getMultiSelectAnswers() != null)
		{
			if (this.getMultiSelectAnswers().size() > 0 )
			{
			sb.append("<multiSelectAnswers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMultiSelectAnswers(), domMap));
			sb.append("</multiSelectAnswers>");		
			}
		}
		if (this.getPicklist() != null)
		{
			sb.append("<picklist>");
			sb.append(this.getPicklist().toXMLString(domMap)); 	
			sb.append("</picklist>");		
		}
		if (this.getCalculatedScore() != null)
		{
			sb.append("<calculatedScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCalculatedScore().toString()));
			sb.append("</calculatedScore>");		
		}
		if (this.isBoolValueAnswer() != null)
		{
			sb.append("<boolValueAnswer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBoolValueAnswer().toString()));
			sb.append("</boolValueAnswer>");		
		}
		if (this.getDateAnswer() != null)
		{
			sb.append("<dateAnswer>");
			sb.append(new ims.framework.utils.DateTime(this.getDateAnswer()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateAnswer>");		
		}
		if (this.getTimeAnswer() != null)
		{
			sb.append("<timeAnswer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeAnswer().toString()));
			sb.append("</timeAnswer>");		
		}
		if (this.getStringAnswer() != null)
		{
			sb.append("<stringAnswer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStringAnswer().toString()));
			sb.append("</stringAnswer>");		
		}
		if (this.getIntegerAnswer() != null)
		{
			sb.append("<integerAnswer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntegerAnswer().toString()));
			sb.append("</integerAnswer>");		
		}
		if (this.getDecimalAnswer() != null)
		{
			sb.append("<decimalAnswer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDecimalAnswer().toString()));
			sb.append("</decimalAnswer>");		
		}
		if (this.getPartialDate() != null)
		{
			sb.append("<partialDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPartialDate().toString()));
			sb.append("</partialDate>");		
		}
		if (this.getMaxMultiselectAllowed() != null)
		{
			sb.append("<maxMultiselectAllowed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxMultiselectAllowed().toString()));
			sb.append("</maxMultiselectAllowed>");		
		}
		if (this.getAnswerWidth() != null)
		{
			sb.append("<answerWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnswerWidth().toString()));
			sb.append("</answerWidth>");		
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
			PatientAnswerDetails domainObject = getPatientAnswerDetailsfromXML(itemEl, factory, domMap);

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
			PatientAnswerDetails domainObject = getPatientAnswerDetailsfromXML(itemEl, factory, domMap);

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
		
	public static PatientAnswerDetails getPatientAnswerDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAnswerDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAnswerDetails getPatientAnswerDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAnswerDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAnswerDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAnswerDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAnswerDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAnswerDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAnswerDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAnswerDetails)factory.getImportedDomainObject(PatientAnswerDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAnswerDetails();
		}
		String keyClassName = "PatientAnswerDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAnswerDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAnswerDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("answerType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnswerType(ims.core.clinical.domain.objects.QuestionAnswerType.getQuestionAnswerTypefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("multiSelectAnswers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMultiSelectAnswers(ims.core.clinical.domain.objects.AnswerOption.fromSetXMLString(fldEl, factory, obj.getMultiSelectAnswers(), domMap));
		}
		fldEl = el.element("picklist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPicklist(ims.core.clinical.domain.objects.AnswerOption.getAnswerOptionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("calculatedScore");
		if(fldEl != null)
		{	
    		obj.setCalculatedScore(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("boolValueAnswer");
		if(fldEl != null)
		{	
    		obj.setBoolValueAnswer(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateAnswer");
		if(fldEl != null)
		{	
    		obj.setDateAnswer(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeAnswer");
		if(fldEl != null)
		{	
    		obj.setTimeAnswer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stringAnswer");
		if(fldEl != null)
		{	
    		obj.setStringAnswer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("integerAnswer");
		if(fldEl != null)
		{	
    		obj.setIntegerAnswer(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("decimalAnswer");
		if(fldEl != null)
		{	
    		obj.setDecimalAnswer(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("partialDate");
		if(fldEl != null)
		{	
    		obj.setPartialDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxMultiselectAllowed");
		if(fldEl != null)
		{	
    		obj.setMaxMultiselectAllowed(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("answerWidth");
		if(fldEl != null)
		{	
    		obj.setAnswerWidth(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "multiSelectAnswers"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AnswerType = "answerType";
		public static final String MultiSelectAnswers = "multiSelectAnswers";
		public static final String Picklist = "picklist";
		public static final String CalculatedScore = "calculatedScore";
		public static final String BoolValueAnswer = "boolValueAnswer";
		public static final String DateAnswer = "dateAnswer";
		public static final String TimeAnswer = "timeAnswer";
		public static final String StringAnswer = "stringAnswer";
		public static final String IntegerAnswer = "integerAnswer";
		public static final String DecimalAnswer = "decimalAnswer";
		public static final String PartialDate = "partialDate";
		public static final String MaxMultiselectAllowed = "maxMultiselectAllowed";
		public static final String AnswerWidth = "answerWidth";
	}
}

