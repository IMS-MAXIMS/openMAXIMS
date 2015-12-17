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
package ims.clinical.configuration.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class SECSRangeScore extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100040;
	private static final long serialVersionUID = 1028100040L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** If score falls above this value... */
	private Integer greaterThanIntValue;
	/** And/Or If score falls below this value */
	private Integer lessThanIntValue;
	/** Text of warning displayed */
	private String warningText;
	/** Score value used to trigger EWS protocol. 0 - 3 */
	private Integer score;
	private java.lang.Float greaterThanDecValue;
	private java.lang.Float lessThanDecValue;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SECSRangeScore (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SECSRangeScore ()
    {
    	super();
    }
    public SECSRangeScore (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.configuration.domain.objects.SECSRangeScore.class;
	}


	public Integer getGreaterThanIntValue() {
		return greaterThanIntValue;
	}
	public void setGreaterThanIntValue(Integer greaterThanIntValue) {
		this.greaterThanIntValue = greaterThanIntValue;
	}

	public Integer getLessThanIntValue() {
		return lessThanIntValue;
	}
	public void setLessThanIntValue(Integer lessThanIntValue) {
		this.lessThanIntValue = lessThanIntValue;
	}

	public String getWarningText() {
		return warningText;
	}
	public void setWarningText(String warningText) {
		if ( null != warningText && warningText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for warningText. Tried to set value: "+
				warningText);
		}
		this.warningText = warningText;
	}

	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

	public java.lang.Float getGreaterThanDecValue() {
		return greaterThanDecValue;
	}
	public void setGreaterThanDecValue(java.lang.Float greaterThanDecValue) {
		this.greaterThanDecValue = greaterThanDecValue;
	}

	public java.lang.Float getLessThanDecValue() {
		return lessThanDecValue;
	}
	public void setLessThanDecValue(java.lang.Float lessThanDecValue) {
		this.lessThanDecValue = lessThanDecValue;
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
		
		auditStr.append("\r\n*greaterThanIntValue* :");
		auditStr.append(greaterThanIntValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*lessThanIntValue* :");
		auditStr.append(lessThanIntValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*warningText* :");
		auditStr.append(warningText);
	    auditStr.append("; ");
		auditStr.append("\r\n*score* :");
		auditStr.append(score);
	    auditStr.append("; ");
		auditStr.append("\r\n*greaterThanDecValue* :");
		auditStr.append(greaterThanDecValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*lessThanDecValue* :");
		auditStr.append(lessThanDecValue);
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
		
		String keyClassName = "SECSRangeScore";
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
		if (this.getGreaterThanIntValue() != null)
		{
			sb.append("<greaterThanIntValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGreaterThanIntValue().toString()));
			sb.append("</greaterThanIntValue>");		
		}
		if (this.getLessThanIntValue() != null)
		{
			sb.append("<lessThanIntValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLessThanIntValue().toString()));
			sb.append("</lessThanIntValue>");		
		}
		if (this.getWarningText() != null)
		{
			sb.append("<warningText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWarningText().toString()));
			sb.append("</warningText>");		
		}
		if (this.getScore() != null)
		{
			sb.append("<score>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getScore().toString()));
			sb.append("</score>");		
		}
		if (this.getGreaterThanDecValue() != null)
		{
			sb.append("<greaterThanDecValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGreaterThanDecValue().toString()));
			sb.append("</greaterThanDecValue>");		
		}
		if (this.getLessThanDecValue() != null)
		{
			sb.append("<lessThanDecValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLessThanDecValue().toString()));
			sb.append("</lessThanDecValue>");		
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
			SECSRangeScore domainObject = getSECSRangeScorefromXML(itemEl, factory, domMap);

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
			SECSRangeScore domainObject = getSECSRangeScorefromXML(itemEl, factory, domMap);

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
		
	public static SECSRangeScore getSECSRangeScorefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSECSRangeScorefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SECSRangeScore getSECSRangeScorefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SECSRangeScore.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SECSRangeScore.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SECSRangeScore class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SECSRangeScore)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SECSRangeScore.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SECSRangeScore ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SECSRangeScore)factory.getImportedDomainObject(SECSRangeScore.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SECSRangeScore();
		}
		String keyClassName = "SECSRangeScore";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SECSRangeScore)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SECSRangeScore obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("greaterThanIntValue");
		if(fldEl != null)
		{	
    		obj.setGreaterThanIntValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lessThanIntValue");
		if(fldEl != null)
		{	
    		obj.setLessThanIntValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("warningText");
		if(fldEl != null)
		{	
    		obj.setWarningText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("score");
		if(fldEl != null)
		{	
    		obj.setScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("greaterThanDecValue");
		if(fldEl != null)
		{	
    		obj.setGreaterThanDecValue(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lessThanDecValue");
		if(fldEl != null)
		{	
    		obj.setLessThanDecValue(new java.lang.Float(fldEl.getTextTrim()));	
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
		public static final String GreaterThanIntValue = "greaterThanIntValue";
		public static final String LessThanIntValue = "lessThanIntValue";
		public static final String WarningText = "warningText";
		public static final String Score = "score";
		public static final String GreaterThanDecValue = "greaterThanDecValue";
		public static final String LessThanDecValue = "lessThanDecValue";
	}
}

