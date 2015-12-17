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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class WhiteBoardQuestionConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100020;
	private static final long serialVersionUID = 1087100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Question Text */
	private String questionText;
	/** Column Header Text */
	private String columnHeaderText;
	/** AnswerType */
	private ims.domain.lookups.LookupInstance answerType;
	/** Answer Options
	  * Collection of ims.core.clinical.domain.objects.AnswerOption.
	  */
	private java.util.List options;
	/** ColumnWidth  */
	private Integer columnWidth;
	/** GenderSpecific */
	private ims.domain.lookups.LookupInstance genderSpecific;
	/** AgeRangeMin */
	private Integer ageRangeMin;
	/** AgeRangeMax */
	private Integer ageRangeMax;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WhiteBoardQuestionConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WhiteBoardQuestionConfig ()
    {
    	super();
    }
    public WhiteBoardQuestionConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig.class;
	}


	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		if ( null != questionText && questionText.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for questionText. Tried to set value: "+
				questionText);
		}
		this.questionText = questionText;
	}

	public String getColumnHeaderText() {
		return columnHeaderText;
	}
	public void setColumnHeaderText(String columnHeaderText) {
		if ( null != columnHeaderText && columnHeaderText.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for columnHeaderText. Tried to set value: "+
				columnHeaderText);
		}
		this.columnHeaderText = columnHeaderText;
	}

	public ims.domain.lookups.LookupInstance getAnswerType() {
		return answerType;
	}
	public void setAnswerType(ims.domain.lookups.LookupInstance answerType) {
		this.answerType = answerType;
	}

	public java.util.List getOptions() {
		if ( null == options ) {
			options = new java.util.ArrayList();
		}
		return options;
	}
	public void setOptions(java.util.List paramValue) {
		this.options = paramValue;
	}

	public Integer getColumnWidth() {
		return columnWidth;
	}
	public void setColumnWidth(Integer columnWidth) {
		this.columnWidth = columnWidth;
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
		
		auditStr.append("\r\n*questionText* :");
		auditStr.append(questionText);
	    auditStr.append("; ");
		auditStr.append("\r\n*columnHeaderText* :");
		auditStr.append(columnHeaderText);
	    auditStr.append("; ");
		auditStr.append("\r\n*answerType* :");
		if (answerType != null)
			auditStr.append(answerType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*options* :");
		if (options != null)
		{
		int i4=0;
		for (i4=0; i4<options.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.AnswerOption obj = (ims.core.clinical.domain.objects.AnswerOption)options.get(i4);
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
		auditStr.append("\r\n*columnWidth* :");
		auditStr.append(columnWidth);
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
		
		String keyClassName = "WhiteBoardQuestionConfig";
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
		if (this.getQuestionText() != null)
		{
			sb.append("<questionText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getQuestionText().toString()));
			sb.append("</questionText>");		
		}
		if (this.getColumnHeaderText() != null)
		{
			sb.append("<columnHeaderText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColumnHeaderText().toString()));
			sb.append("</columnHeaderText>");		
		}
		if (this.getAnswerType() != null)
		{
			sb.append("<answerType>");
			sb.append(this.getAnswerType().toXMLString()); 
			sb.append("</answerType>");		
		}
		if (this.getOptions() != null)
		{
			if (this.getOptions().size() > 0 )
			{
			sb.append("<options>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOptions(), domMap));
			sb.append("</options>");		
			}
		}
		if (this.getColumnWidth() != null)
		{
			sb.append("<columnWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColumnWidth().toString()));
			sb.append("</columnWidth>");		
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
			WhiteBoardQuestionConfig domainObject = getWhiteBoardQuestionConfigfromXML(itemEl, factory, domMap);

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
			WhiteBoardQuestionConfig domainObject = getWhiteBoardQuestionConfigfromXML(itemEl, factory, domMap);

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
		
	public static WhiteBoardQuestionConfig getWhiteBoardQuestionConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWhiteBoardQuestionConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WhiteBoardQuestionConfig getWhiteBoardQuestionConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WhiteBoardQuestionConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WhiteBoardQuestionConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WhiteBoardQuestionConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WhiteBoardQuestionConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WhiteBoardQuestionConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WhiteBoardQuestionConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WhiteBoardQuestionConfig)factory.getImportedDomainObject(WhiteBoardQuestionConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WhiteBoardQuestionConfig();
		}
		String keyClassName = "WhiteBoardQuestionConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WhiteBoardQuestionConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WhiteBoardQuestionConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("questionText");
		if(fldEl != null)
		{	
    		obj.setQuestionText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("columnHeaderText");
		if(fldEl != null)
		{	
    		obj.setColumnHeaderText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("answerType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnswerType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("options");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOptions(ims.core.clinical.domain.objects.AnswerOption.fromListXMLString(fldEl, factory, obj.getOptions(), domMap));
		}
		fldEl = el.element("columnWidth");
		if(fldEl != null)
		{	
    		obj.setColumnWidth(new Integer(fldEl.getTextTrim()));	
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "options"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String QuestionText = "questionText";
		public static final String ColumnHeaderText = "columnHeaderText";
		public static final String AnswerType = "answerType";
		public static final String Options = "options";
		public static final String ColumnWidth = "columnWidth";
		public static final String GenderSpecific = "genderSpecific";
		public static final String AgeRangeMin = "ageRangeMin";
		public static final String AgeRangeMax = "ageRangeMax";
	}
}

