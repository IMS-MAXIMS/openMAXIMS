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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class PersonalDetailsComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1015100014;
	private static final long serialVersionUID = 1015100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Sports Interests Hobbies */
	private String sportsInterestsHobbies;
	/** Occupation */
	private ims.domain.lookups.LookupInstance occupation;
	/** Occupation Other Text */
	private String occupationOther;
	/** Usual Sleep Pattern */
	private Integer usualSleepPattern;
	/** Takes Night Sedation */
	private ims.domain.lookups.LookupInstance takesNightSedation;
	/** Notes */
	private String notes;
	/** Sexuality */
	private String sexuality;
	/** Not Appropriate To Ask */
	private Boolean notAppropriateToAsk;
	/** Anxiety Dying */
	private String anxietyDying;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PersonalDetailsComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PersonalDetailsComponent ()
    {
    	super();
    }
    public PersonalDetailsComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.PersonalDetailsComponent.class;
	}


	public String getSportsInterestsHobbies() {
		return sportsInterestsHobbies;
	}
	public void setSportsInterestsHobbies(String sportsInterestsHobbies) {
		this.sportsInterestsHobbies = sportsInterestsHobbies;
	}

	public ims.domain.lookups.LookupInstance getOccupation() {
		return occupation;
	}
	public void setOccupation(ims.domain.lookups.LookupInstance occupation) {
		this.occupation = occupation;
	}

	public String getOccupationOther() {
		return occupationOther;
	}
	public void setOccupationOther(String occupationOther) {
		if ( null != occupationOther && occupationOther.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for occupationOther. Tried to set value: "+
				occupationOther);
		}
		this.occupationOther = occupationOther;
	}

	public Integer getUsualSleepPattern() {
		return usualSleepPattern;
	}
	public void setUsualSleepPattern(Integer usualSleepPattern) {
		this.usualSleepPattern = usualSleepPattern;
	}

	public ims.domain.lookups.LookupInstance getTakesNightSedation() {
		return takesNightSedation;
	}
	public void setTakesNightSedation(ims.domain.lookups.LookupInstance takesNightSedation) {
		this.takesNightSedation = takesNightSedation;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public String getSexuality() {
		return sexuality;
	}
	public void setSexuality(String sexuality) {
		if ( null != sexuality && sexuality.length() > 450 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sexuality. Tried to set value: "+
				sexuality);
		}
		this.sexuality = sexuality;
	}

	public Boolean isNotAppropriateToAsk() {
		return notAppropriateToAsk;
	}
	public void setNotAppropriateToAsk(Boolean notAppropriateToAsk) {
		this.notAppropriateToAsk = notAppropriateToAsk;
	}

	public String getAnxietyDying() {
		return anxietyDying;
	}
	public void setAnxietyDying(String anxietyDying) {
		if ( null != anxietyDying && anxietyDying.length() > 450 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for anxietyDying. Tried to set value: "+
				anxietyDying);
		}
		this.anxietyDying = anxietyDying;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*sportsInterestsHobbies* :");
		auditStr.append(sportsInterestsHobbies);
	    auditStr.append("; ");
		auditStr.append("\r\n*occupation* :");
		if (occupation != null)
			auditStr.append(occupation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*occupationOther* :");
		auditStr.append(occupationOther);
	    auditStr.append("; ");
		auditStr.append("\r\n*usualSleepPattern* :");
		auditStr.append(usualSleepPattern);
	    auditStr.append("; ");
		auditStr.append("\r\n*takesNightSedation* :");
		if (takesNightSedation != null)
			auditStr.append(takesNightSedation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*sexuality* :");
		auditStr.append(sexuality);
	    auditStr.append("; ");
		auditStr.append("\r\n*notAppropriateToAsk* :");
		auditStr.append(notAppropriateToAsk);
	    auditStr.append("; ");
		auditStr.append("\r\n*anxietyDying* :");
		auditStr.append(anxietyDying);
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
		
		String keyClassName = "PersonalDetailsComponent";
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
		if (this.getSportsInterestsHobbies() != null)
		{
			sb.append("<sportsInterestsHobbies>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSportsInterestsHobbies().toString()));
			sb.append("</sportsInterestsHobbies>");		
		}
		if (this.getOccupation() != null)
		{
			sb.append("<occupation>");
			sb.append(this.getOccupation().toXMLString()); 
			sb.append("</occupation>");		
		}
		if (this.getOccupationOther() != null)
		{
			sb.append("<occupationOther>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOccupationOther().toString()));
			sb.append("</occupationOther>");		
		}
		if (this.getUsualSleepPattern() != null)
		{
			sb.append("<usualSleepPattern>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUsualSleepPattern().toString()));
			sb.append("</usualSleepPattern>");		
		}
		if (this.getTakesNightSedation() != null)
		{
			sb.append("<takesNightSedation>");
			sb.append(this.getTakesNightSedation().toXMLString()); 
			sb.append("</takesNightSedation>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getSexuality() != null)
		{
			sb.append("<sexuality>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSexuality().toString()));
			sb.append("</sexuality>");		
		}
		if (this.isNotAppropriateToAsk() != null)
		{
			sb.append("<notAppropriateToAsk>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNotAppropriateToAsk().toString()));
			sb.append("</notAppropriateToAsk>");		
		}
		if (this.getAnxietyDying() != null)
		{
			sb.append("<anxietyDying>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnxietyDying().toString()));
			sb.append("</anxietyDying>");		
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
			PersonalDetailsComponent domainObject = getPersonalDetailsComponentfromXML(itemEl, factory, domMap);

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
			PersonalDetailsComponent domainObject = getPersonalDetailsComponentfromXML(itemEl, factory, domMap);

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
		
	public static PersonalDetailsComponent getPersonalDetailsComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPersonalDetailsComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PersonalDetailsComponent getPersonalDetailsComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PersonalDetailsComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PersonalDetailsComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PersonalDetailsComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PersonalDetailsComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PersonalDetailsComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PersonalDetailsComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PersonalDetailsComponent)factory.getImportedDomainObject(PersonalDetailsComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PersonalDetailsComponent();
		}
		String keyClassName = "PersonalDetailsComponent";
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
			return (PersonalDetailsComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PersonalDetailsComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("sportsInterestsHobbies");
		if(fldEl != null)
		{	
    		obj.setSportsInterestsHobbies(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("occupation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("occupationOther");
		if(fldEl != null)
		{	
    		obj.setOccupationOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("usualSleepPattern");
		if(fldEl != null)
		{	
    		obj.setUsualSleepPattern(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("takesNightSedation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTakesNightSedation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sexuality");
		if(fldEl != null)
		{	
    		obj.setSexuality(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notAppropriateToAsk");
		if(fldEl != null)
		{	
    		obj.setNotAppropriateToAsk(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anxietyDying");
		if(fldEl != null)
		{	
    		obj.setAnxietyDying(new String(fldEl.getTextTrim()));	
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
		public static final String SportsInterestsHobbies = "sportsInterestsHobbies";
		public static final String Occupation = "occupation";
		public static final String OccupationOther = "occupationOther";
		public static final String UsualSleepPattern = "usualSleepPattern";
		public static final String TakesNightSedation = "takesNightSedation";
		public static final String Notes = "notes";
		public static final String Sexuality = "sexuality";
		public static final String NotAppropriateToAsk = "notAppropriateToAsk";
		public static final String AnxietyDying = "anxietyDying";
	}
}

