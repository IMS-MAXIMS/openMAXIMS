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


public class QuestionAnswerType extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100041;
	private static final long serialVersionUID = 1003100041L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AnswerType */
	private ims.domain.lookups.LookupInstance answerType;
	/** SeparatorText */
	private String separatorText;
	/** isMandatory */
	private Boolean isMandatory;
	/** MandatoryValMessage */
	private String mandatoryValMessage;
	/** ActiveStatus */
	private Boolean activeStatus;
	/** Answer Options
	  * Collection of ims.core.clinical.domain.objects.AnswerOption.
	  */
	private java.util.List options;
	/** MaxMultiselectAllowed */
	private Integer maxMultiselectAllowed;
	/** AnswerWidth (picklist/multiselect/text) */
	private Integer answerWidth;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public QuestionAnswerType (Integer id, int ver)
    {
    	super(id, ver);
    }
    public QuestionAnswerType ()
    {
    	super();
    }
    public QuestionAnswerType (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.QuestionAnswerType.class;
	}


	public ims.domain.lookups.LookupInstance getAnswerType() {
		return answerType;
	}
	public void setAnswerType(ims.domain.lookups.LookupInstance answerType) {
		this.answerType = answerType;
	}

	public String getSeparatorText() {
		return separatorText;
	}
	public void setSeparatorText(String separatorText) {
		if ( null != separatorText && separatorText.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for separatorText. Tried to set value: "+
				separatorText);
		}
		this.separatorText = separatorText;
	}

	public Boolean isIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public String getMandatoryValMessage() {
		return mandatoryValMessage;
	}
	public void setMandatoryValMessage(String mandatoryValMessage) {
		if ( null != mandatoryValMessage && mandatoryValMessage.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mandatoryValMessage. Tried to set value: "+
				mandatoryValMessage);
		}
		this.mandatoryValMessage = mandatoryValMessage;
	}

	public Boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
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
			auditStr.append(answerType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*separatorText* :");
		auditStr.append(separatorText);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMandatory* :");
		auditStr.append(isMandatory);
	    auditStr.append("; ");
		auditStr.append("\r\n*mandatoryValMessage* :");
		auditStr.append(mandatoryValMessage);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		auditStr.append(activeStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*options* :");
		if (options != null)
		{
		int i6=0;
		for (i6=0; i6<options.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.AnswerOption obj = (ims.core.clinical.domain.objects.AnswerOption)options.get(i6);
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
		
		String keyClassName = "QuestionAnswerType";
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
			sb.append(this.getAnswerType().toXMLString()); 
			sb.append("</answerType>");		
		}
		if (this.getSeparatorText() != null)
		{
			sb.append("<separatorText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeparatorText().toString()));
			sb.append("</separatorText>");		
		}
		if (this.isIsMandatory() != null)
		{
			sb.append("<isMandatory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMandatory().toString()));
			sb.append("</isMandatory>");		
		}
		if (this.getMandatoryValMessage() != null)
		{
			sb.append("<mandatoryValMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMandatoryValMessage().toString()));
			sb.append("</mandatoryValMessage>");		
		}
		if (this.isActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActiveStatus().toString()));
			sb.append("</activeStatus>");		
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
			QuestionAnswerType domainObject = getQuestionAnswerTypefromXML(itemEl, factory, domMap);

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
			QuestionAnswerType domainObject = getQuestionAnswerTypefromXML(itemEl, factory, domMap);

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
		
	public static QuestionAnswerType getQuestionAnswerTypefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getQuestionAnswerTypefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static QuestionAnswerType getQuestionAnswerTypefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!QuestionAnswerType.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!QuestionAnswerType.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the QuestionAnswerType class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (QuestionAnswerType)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(QuestionAnswerType.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		QuestionAnswerType ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (QuestionAnswerType)factory.getImportedDomainObject(QuestionAnswerType.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new QuestionAnswerType();
		}
		String keyClassName = "QuestionAnswerType";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (QuestionAnswerType)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, QuestionAnswerType obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("answerType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnswerType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("separatorText");
		if(fldEl != null)
		{	
    		obj.setSeparatorText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMandatory");
		if(fldEl != null)
		{	
    		obj.setIsMandatory(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mandatoryValMessage");
		if(fldEl != null)
		{	
    		obj.setMandatoryValMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{	
    		obj.setActiveStatus(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("options");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOptions(ims.core.clinical.domain.objects.AnswerOption.fromListXMLString(fldEl, factory, obj.getOptions(), domMap));
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
		 "options"
		};
	}

	/**
	EqualsAndHashcode 
	*/
public boolean equals(Object obj)
{
	if (null == obj)  
	{
		return false;
	}
	if(this.getId() != null && ((QuestionAnswerType)obj).getId() != null)
	{
		if (this.getId().intValue() == ((QuestionAnswerType)obj).getId().intValue())
			return true;
	}
	
	return false;
}
public int hashCode()
{
	if(this.getId() != null)
		return (this.getId().hashCode() * 1001) + this.getClassId();
	
	return super.hashCode();
}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AnswerType = "answerType";
		public static final String SeparatorText = "separatorText";
		public static final String IsMandatory = "isMandatory";
		public static final String MandatoryValMessage = "mandatoryValMessage";
		public static final String ActiveStatus = "activeStatus";
		public static final String Options = "options";
		public static final String MaxMultiselectAllowed = "maxMultiselectAllowed";
		public static final String AnswerWidth = "answerWidth";
	}
}

