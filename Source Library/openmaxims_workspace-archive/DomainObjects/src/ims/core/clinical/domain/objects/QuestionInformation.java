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
 * @author Kevin O'Carroll
 * Generated.
 */


public class QuestionInformation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1058100000;
	private static final long serialVersionUID = 1058100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Text */
	private String text;
	/** ShortText - String used for display in Assessments */
	private String shortText;
	/** Question Type */
	private ims.domain.lookups.LookupInstance questionType;
	/** Classification
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List classification;
	/** isQuestion */
	private Boolean isQuestion;
	/** PreActive/Active/Inactive */
	private ims.domain.lookups.LookupInstance status;
	/** GenderSpecific */
	private ims.domain.lookups.LookupInstance genderSpecific;
	/** AgeRangeMin */
	private Integer ageRangeMin;
	/** AgeRangeMax */
	private Integer ageRangeMax;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** AnswerTypes
	  * Collection of ims.core.clinical.domain.objects.QuestionAnswerType.
	  */
	private java.util.List answerTypes;
	/** Used for searching
	  * Collection of ims.core.generic.domain.objects.Keyword.
	  */
	private java.util.List keywords;
	/** Legend Text for the Question */
	private String legendText;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public QuestionInformation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public QuestionInformation ()
    {
    	super();
    }
    public QuestionInformation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.QuestionInformation.class;
	}


	public String getText() {
		return text;
	}
	public void setText(String text) {
		if ( null != text && text.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for text. Tried to set value: "+
				text);
		}
		this.text = text;
	}

	public String getShortText() {
		return shortText;
	}
	public void setShortText(String shortText) {
		if ( null != shortText && shortText.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for shortText. Tried to set value: "+
				shortText);
		}
		this.shortText = shortText;
	}

	public ims.domain.lookups.LookupInstance getQuestionType() {
		return questionType;
	}
	public void setQuestionType(ims.domain.lookups.LookupInstance questionType) {
		this.questionType = questionType;
	}

	public java.util.List getClassification() {
		if ( null == classification ) {
			classification = new java.util.ArrayList();
		}
		return classification;
	}
	public void setClassification(java.util.List paramValue) {
		this.classification = paramValue;
	}

	public Boolean isIsQuestion() {
		return isQuestion;
	}
	public void setIsQuestion(Boolean isQuestion) {
		this.isQuestion = isQuestion;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getGenderSpecific() {
		return genderSpecific;
	}
	public void setGenderSpecific(ims.domain.lookups.LookupInstance genderSpecific) {
		this.genderSpecific = genderSpecific;
	}

	public Integer getAgeRangeMin() {
		return ageRangeMin;
	}
	public void setAgeRangeMin(Integer ageRangeMin) {
		this.ageRangeMin = ageRangeMin;
	}

	public Integer getAgeRangeMax() {
		return ageRangeMax;
	}
	public void setAgeRangeMax(Integer ageRangeMax) {
		this.ageRangeMax = ageRangeMax;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public java.util.List getAnswerTypes() {
		if ( null == answerTypes ) {
			answerTypes = new java.util.ArrayList();
		}
		return answerTypes;
	}
	public void setAnswerTypes(java.util.List paramValue) {
		this.answerTypes = paramValue;
	}

	public java.util.List getKeywords() {
		if ( null == keywords ) {
			keywords = new java.util.ArrayList();
		}
		return keywords;
	}
	public void setKeywords(java.util.List paramValue) {
		this.keywords = paramValue;
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
		
		auditStr.append("\r\n*text* :");
		auditStr.append(text);
	    auditStr.append("; ");
		auditStr.append("\r\n*shortText* :");
		auditStr.append(shortText);
	    auditStr.append("; ");
		auditStr.append("\r\n*questionType* :");
		if (questionType != null)
			auditStr.append(questionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*classification* :");
		if (classification != null)
		{
			java.util.Iterator it4 = classification.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it4.next();
			auditStr.append(obj.getText());
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isQuestion* :");
		auditStr.append(isQuestion);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*genderSpecific* :");
		if (genderSpecific != null)
			auditStr.append(genderSpecific.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ageRangeMin* :");
		auditStr.append(ageRangeMin);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageRangeMax* :");
		auditStr.append(ageRangeMax);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i10=0;
		for (i10=0; i10<taxonomyMap.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*answerTypes* :");
		if (answerTypes != null)
		{
		int i11=0;
		for (i11=0; i11<answerTypes.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.QuestionAnswerType obj = (ims.core.clinical.domain.objects.QuestionAnswerType)answerTypes.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*keywords* :");
		if (keywords != null)
		{
		int i12=0;
		for (i12=0; i12<keywords.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.Keyword obj = (ims.core.generic.domain.objects.Keyword)keywords.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
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
		
		String keyClassName = "QuestionInformation";
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
		if (this.getText() != null)
		{
			sb.append("<text>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getText().toString()));
			sb.append("</text>");		
		}
		if (this.getShortText() != null)
		{
			sb.append("<shortText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getShortText().toString()));
			sb.append("</shortText>");		
		}
		if (this.getQuestionType() != null)
		{
			sb.append("<questionType>");
			sb.append(this.getQuestionType().toXMLString()); 
			sb.append("</questionType>");		
		}
		if (this.getClassification() != null)
		{
			if (this.getClassification().size() > 0 )
			{
			sb.append("<classification>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getClassification())); 
			sb.append("</classification>");		
			}
		}
		if (this.isIsQuestion() != null)
		{
			sb.append("<isQuestion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsQuestion().toString()));
			sb.append("</isQuestion>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getGenderSpecific() != null)
		{
			sb.append("<genderSpecific>");
			sb.append(this.getGenderSpecific().toXMLString()); 
			sb.append("</genderSpecific>");		
		}
		if (this.getAgeRangeMin() != null)
		{
			sb.append("<ageRangeMin>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeRangeMin().toString()));
			sb.append("</ageRangeMin>");		
		}
		if (this.getAgeRangeMax() != null)
		{
			sb.append("<ageRangeMax>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeRangeMax().toString()));
			sb.append("</ageRangeMax>");		
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.getAnswerTypes() != null)
		{
			if (this.getAnswerTypes().size() > 0 )
			{
			sb.append("<answerTypes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAnswerTypes(), domMap));
			sb.append("</answerTypes>");		
			}
		}
		if (this.getKeywords() != null)
		{
			if (this.getKeywords().size() > 0 )
			{
			sb.append("<keywords>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getKeywords(), domMap));
			sb.append("</keywords>");		
			}
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
			QuestionInformation domainObject = getQuestionInformationfromXML(itemEl, factory, domMap);

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
			QuestionInformation domainObject = getQuestionInformationfromXML(itemEl, factory, domMap);

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
		
	public static QuestionInformation getQuestionInformationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getQuestionInformationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static QuestionInformation getQuestionInformationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!QuestionInformation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!QuestionInformation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the QuestionInformation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (QuestionInformation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(QuestionInformation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		QuestionInformation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (QuestionInformation)factory.getImportedDomainObject(QuestionInformation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new QuestionInformation();
		}
		String keyClassName = "QuestionInformation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (QuestionInformation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, QuestionInformation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("text");
		if(fldEl != null)
		{	
    		obj.setText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("shortText");
		if(fldEl != null)
		{	
    		obj.setShortText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("questionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQuestionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("classification");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setClassification(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getClassification())); 
		}
		fldEl = el.element("isQuestion");
		if(fldEl != null)
		{	
    		obj.setIsQuestion(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("genderSpecific");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGenderSpecific(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ageRangeMin");
		if(fldEl != null)
		{	
    		obj.setAgeRangeMin(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ageRangeMax");
		if(fldEl != null)
		{	
    		obj.setAgeRangeMax(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("answerTypes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnswerTypes(ims.core.clinical.domain.objects.QuestionAnswerType.fromListXMLString(fldEl, factory, obj.getAnswerTypes(), domMap));
		}
		fldEl = el.element("keywords");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setKeywords(ims.core.generic.domain.objects.Keyword.fromListXMLString(fldEl, factory, obj.getKeywords(), domMap));
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
		 "classification"
		, "taxonomyMap"
		, "answerTypes"
		, "keywords"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Text = "text";
		public static final String ShortText = "shortText";
		public static final String QuestionType = "questionType";
		public static final String Classification = "classification";
		public static final String IsQuestion = "isQuestion";
		public static final String Status = "status";
		public static final String GenderSpecific = "genderSpecific";
		public static final String AgeRangeMin = "ageRangeMin";
		public static final String AgeRangeMax = "ageRangeMax";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String AnswerTypes = "answerTypes";
		public static final String Keywords = "keywords";
		public static final String LegendText = "legendText";
	}
}

