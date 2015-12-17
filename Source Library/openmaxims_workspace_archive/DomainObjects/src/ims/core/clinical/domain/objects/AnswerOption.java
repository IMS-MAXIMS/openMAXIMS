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


public class AnswerOption extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100046;
	private static final long serialVersionUID = 1003100046L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Option Text */
	private String optionText;
	/** Option Description */
	private String optionDescription;
	/** Score */
	private java.lang.Float score;
	/** TaxonomyMappings
	  * Collection of ims.core.clinical.domain.objects.NonUniqueTaxonomyMap.
	  */
	private java.util.List taxonomyMappings;
	/** Colour */
	private ims.framework.utils.Color colour;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AnswerOption (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AnswerOption ()
    {
    	super();
    }
    public AnswerOption (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.AnswerOption.class;
	}


	public String getOptionText() {
		return optionText;
	}
	public void setOptionText(String optionText) {
		if ( null != optionText && optionText.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for optionText. Tried to set value: "+
				optionText);
		}
		this.optionText = optionText;
	}

	public String getOptionDescription() {
		return optionDescription;
	}
	public void setOptionDescription(String optionDescription) {
		if ( null != optionDescription && optionDescription.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for optionDescription. Tried to set value: "+
				optionDescription);
		}
		this.optionDescription = optionDescription;
	}

	public java.lang.Float getScore() {
		return score;
	}
	public void setScore(java.lang.Float score) {
		this.score = score;
	}

	public java.util.List getTaxonomyMappings() {
		if ( null == taxonomyMappings ) {
			taxonomyMappings = new java.util.ArrayList();
		}
		return taxonomyMappings;
	}
	public void setTaxonomyMappings(java.util.List paramValue) {
		this.taxonomyMappings = paramValue;
	}

	public ims.framework.utils.Color getColour() {
		return colour;
	}
	public void setColour(ims.framework.utils.Color colour) {
		this.colour = colour;
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
		
		auditStr.append("\r\n*optionText* :");
		auditStr.append(optionText);
	    auditStr.append("; ");
		auditStr.append("\r\n*optionDescription* :");
		auditStr.append(optionDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*score* :");
		auditStr.append(score);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMappings* :");
		if (taxonomyMappings != null)
		{
		int i4=0;
		for (i4=0; i4<taxonomyMappings.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.NonUniqueTaxonomyMap obj = (ims.core.clinical.domain.objects.NonUniqueTaxonomyMap)taxonomyMappings.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*colour* :");
		auditStr.append(colour);
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
		
		String keyClassName = "AnswerOption";
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
		if (this.getOptionText() != null)
		{
			sb.append("<optionText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOptionText().toString()));
			sb.append("</optionText>");		
		}
		if (this.getOptionDescription() != null)
		{
			sb.append("<optionDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOptionDescription().toString()));
			sb.append("</optionDescription>");		
		}
		if (this.getScore() != null)
		{
			sb.append("<score>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getScore().toString()));
			sb.append("</score>");		
		}
		if (this.getTaxonomyMappings() != null)
		{
			if (this.getTaxonomyMappings().size() > 0 )
			{
			sb.append("<taxonomyMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMappings(), domMap));
			sb.append("</taxonomyMappings>");		
			}
		}
		if (this.getColour() != null)
		{
			sb.append("<colour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColour().toString()));
			sb.append("</colour>");		
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
			AnswerOption domainObject = getAnswerOptionfromXML(itemEl, factory, domMap);

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
			AnswerOption domainObject = getAnswerOptionfromXML(itemEl, factory, domMap);

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
		
	public static AnswerOption getAnswerOptionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAnswerOptionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AnswerOption getAnswerOptionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AnswerOption.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AnswerOption.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AnswerOption class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AnswerOption)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AnswerOption.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AnswerOption ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AnswerOption)factory.getImportedDomainObject(AnswerOption.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AnswerOption();
		}
		String keyClassName = "AnswerOption";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AnswerOption)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AnswerOption obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("optionText");
		if(fldEl != null)
		{	
    		obj.setOptionText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("optionDescription");
		if(fldEl != null)
		{	
    		obj.setOptionDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("score");
		if(fldEl != null)
		{	
    		obj.setScore(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMappings(ims.core.clinical.domain.objects.NonUniqueTaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMappings(), domMap));
		}
		fldEl = el.element("colour");
		if(fldEl != null)
		{	
    		obj.setColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "taxonomyMappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String OptionText = "optionText";
		public static final String OptionDescription = "optionDescription";
		public static final String Score = "score";
		public static final String TaxonomyMappings = "taxonomyMappings";
		public static final String Colour = "colour";
	}
}

