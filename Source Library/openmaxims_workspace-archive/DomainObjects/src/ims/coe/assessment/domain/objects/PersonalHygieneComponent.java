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
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class PersonalHygieneComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100035;
	private static final long serialVersionUID = 1012100035L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String preferredBathingPattern;
	private ims.domain.lookups.LookupInstance assisstanceWithPersonalHygiene;
	/** 
	  * Collection of ims.nursing.assessment.domain.objects.PersonalHygieneActivities.
	  */
	private java.util.List hygieneActivities;
	private ims.coe.assessment.domain.objects.PersonalHygieneFeet personalHygieneFeet;
	private ims.domain.lookups.LookupInstance conditionOfHair;
	private ims.domain.lookups.LookupInstance evidenceOfHairInfestation;
	private ims.domain.lookups.LookupInstance conditionOfNails;
	private String conditionOfSkin;
    public PersonalHygieneComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PersonalHygieneComponent ()
    {
    	super();
    }
    public PersonalHygieneComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.PersonalHygieneComponent.class;
	}


	public String getPreferredBathingPattern() {
		return preferredBathingPattern;
	}
	public void setPreferredBathingPattern(String preferredBathingPattern) {
		this.preferredBathingPattern = preferredBathingPattern;
	}

	public ims.domain.lookups.LookupInstance getAssisstanceWithPersonalHygiene() {
		return assisstanceWithPersonalHygiene;
	}
	public void setAssisstanceWithPersonalHygiene(ims.domain.lookups.LookupInstance assisstanceWithPersonalHygiene) {
		this.assisstanceWithPersonalHygiene = assisstanceWithPersonalHygiene;
	}

	public java.util.List getHygieneActivities() {
		if ( null == hygieneActivities ) {
			hygieneActivities = new java.util.ArrayList();
		}
		return hygieneActivities;
	}
	public void setHygieneActivities(java.util.List paramValue) {
		this.hygieneActivities = paramValue;
	}

	public ims.coe.assessment.domain.objects.PersonalHygieneFeet getPersonalHygieneFeet() {
		return personalHygieneFeet;
	}
	public void setPersonalHygieneFeet(ims.coe.assessment.domain.objects.PersonalHygieneFeet personalHygieneFeet) {
		this.personalHygieneFeet = personalHygieneFeet;
	}

	public ims.domain.lookups.LookupInstance getConditionOfHair() {
		return conditionOfHair;
	}
	public void setConditionOfHair(ims.domain.lookups.LookupInstance conditionOfHair) {
		this.conditionOfHair = conditionOfHair;
	}

	public ims.domain.lookups.LookupInstance getEvidenceOfHairInfestation() {
		return evidenceOfHairInfestation;
	}
	public void setEvidenceOfHairInfestation(ims.domain.lookups.LookupInstance evidenceOfHairInfestation) {
		this.evidenceOfHairInfestation = evidenceOfHairInfestation;
	}

	public ims.domain.lookups.LookupInstance getConditionOfNails() {
		return conditionOfNails;
	}
	public void setConditionOfNails(ims.domain.lookups.LookupInstance conditionOfNails) {
		this.conditionOfNails = conditionOfNails;
	}

	public String getConditionOfSkin() {
		return conditionOfSkin;
	}
	public void setConditionOfSkin(String conditionOfSkin) {
		this.conditionOfSkin = conditionOfSkin;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*preferredBathingPattern* :");
		auditStr.append(preferredBathingPattern);
	    auditStr.append("; ");
		auditStr.append("\r\n*assisstanceWithPersonalHygiene* :");
		if (assisstanceWithPersonalHygiene != null)
			auditStr.append(assisstanceWithPersonalHygiene.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hygieneActivities* :");
		if (hygieneActivities != null)
		{
		int i3=0;
		for (i3=0; i3<hygieneActivities.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.nursing.assessment.domain.objects.PersonalHygieneActivities obj = (ims.nursing.assessment.domain.objects.PersonalHygieneActivities)hygieneActivities.get(i3);
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
		auditStr.append("\r\n*personalHygieneFeet* :");
		if (personalHygieneFeet != null)
		{
			auditStr.append(toShortClassName(personalHygieneFeet));
				
		    auditStr.append(personalHygieneFeet.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*conditionOfHair* :");
		if (conditionOfHair != null)
			auditStr.append(conditionOfHair.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*evidenceOfHairInfestation* :");
		if (evidenceOfHairInfestation != null)
			auditStr.append(evidenceOfHairInfestation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*conditionOfNails* :");
		if (conditionOfNails != null)
			auditStr.append(conditionOfNails.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*conditionOfSkin* :");
		auditStr.append(conditionOfSkin);
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
		
		String keyClassName = "PersonalHygieneComponent";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getPreferredBathingPattern() != null)
		{
			sb.append("<preferredBathingPattern>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreferredBathingPattern().toString()));
			sb.append("</preferredBathingPattern>");		
		}
		if (this.getAssisstanceWithPersonalHygiene() != null)
		{
			sb.append("<assisstanceWithPersonalHygiene>");
			sb.append(this.getAssisstanceWithPersonalHygiene().toXMLString()); 
			sb.append("</assisstanceWithPersonalHygiene>");		
		}
		if (this.getHygieneActivities() != null)
		{
			if (this.getHygieneActivities().size() > 0 )
			{
			sb.append("<hygieneActivities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHygieneActivities(), domMap));
			sb.append("</hygieneActivities>");		
			}
		}
		if (this.getPersonalHygieneFeet() != null)
		{
			sb.append("<personalHygieneFeet>");
			sb.append(this.getPersonalHygieneFeet().toXMLString(domMap)); 	
			sb.append("</personalHygieneFeet>");		
		}
		if (this.getConditionOfHair() != null)
		{
			sb.append("<conditionOfHair>");
			sb.append(this.getConditionOfHair().toXMLString()); 
			sb.append("</conditionOfHair>");		
		}
		if (this.getEvidenceOfHairInfestation() != null)
		{
			sb.append("<evidenceOfHairInfestation>");
			sb.append(this.getEvidenceOfHairInfestation().toXMLString()); 
			sb.append("</evidenceOfHairInfestation>");		
		}
		if (this.getConditionOfNails() != null)
		{
			sb.append("<conditionOfNails>");
			sb.append(this.getConditionOfNails().toXMLString()); 
			sb.append("</conditionOfNails>");		
		}
		if (this.getConditionOfSkin() != null)
		{
			sb.append("<conditionOfSkin>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConditionOfSkin().toString()));
			sb.append("</conditionOfSkin>");		
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
			PersonalHygieneComponent domainObject = getPersonalHygieneComponentfromXML(itemEl, factory, domMap);

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
			PersonalHygieneComponent domainObject = getPersonalHygieneComponentfromXML(itemEl, factory, domMap);

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
		
	public static PersonalHygieneComponent getPersonalHygieneComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPersonalHygieneComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PersonalHygieneComponent getPersonalHygieneComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PersonalHygieneComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PersonalHygieneComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PersonalHygieneComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PersonalHygieneComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PersonalHygieneComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PersonalHygieneComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PersonalHygieneComponent)factory.getImportedDomainObject(PersonalHygieneComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PersonalHygieneComponent();
		}
		String keyClassName = "PersonalHygieneComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PersonalHygieneComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PersonalHygieneComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("preferredBathingPattern");
		if(fldEl != null)
		{	
    		obj.setPreferredBathingPattern(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assisstanceWithPersonalHygiene");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssisstanceWithPersonalHygiene(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hygieneActivities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHygieneActivities(ims.nursing.assessment.domain.objects.PersonalHygieneActivities.fromListXMLString(fldEl, factory, obj.getHygieneActivities(), domMap));
		}
		fldEl = el.element("personalHygieneFeet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPersonalHygieneFeet(ims.coe.assessment.domain.objects.PersonalHygieneFeet.getPersonalHygieneFeetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("conditionOfHair");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConditionOfHair(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("evidenceOfHairInfestation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEvidenceOfHairInfestation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("conditionOfNails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConditionOfNails(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("conditionOfSkin");
		if(fldEl != null)
		{	
    		obj.setConditionOfSkin(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "hygieneActivities"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PreferredBathingPattern = "preferredBathingPattern";
		public static final String AssisstanceWithPersonalHygiene = "assisstanceWithPersonalHygiene";
		public static final String HygieneActivities = "hygieneActivities";
		public static final String PersonalHygieneFeet = "personalHygieneFeet";
		public static final String ConditionOfHair = "conditionOfHair";
		public static final String EvidenceOfHairInfestation = "evidenceOfHairInfestation";
		public static final String ConditionOfNails = "conditionOfNails";
		public static final String ConditionOfSkin = "conditionOfSkin";
	}
}

