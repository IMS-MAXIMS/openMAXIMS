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


public class LeisureComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100028;
	private static final long serialVersionUID = 1012100028L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String hobbies;
	private String enjoyDoingMost;
	private String preferencesOfTime;
	private ims.domain.lookups.LookupInstance alcoholSocially;
	private String alcoholDetails;
	private Integer alcoholUnits;
	/** 
	  * Collection of ims.coe.assessment.domain.objects.LeisueClubs.
	  */
	private java.util.Set leisureClubs;
    public LeisureComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LeisureComponent ()
    {
    	super();
    }
    public LeisureComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.LeisureComponent.class;
	}


	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getEnjoyDoingMost() {
		return enjoyDoingMost;
	}
	public void setEnjoyDoingMost(String enjoyDoingMost) {
		this.enjoyDoingMost = enjoyDoingMost;
	}

	public String getPreferencesOfTime() {
		return preferencesOfTime;
	}
	public void setPreferencesOfTime(String preferencesOfTime) {
		if ( null != preferencesOfTime && preferencesOfTime.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for preferencesOfTime. Tried to set value: "+
				preferencesOfTime);
		}
		this.preferencesOfTime = preferencesOfTime;
	}

	public ims.domain.lookups.LookupInstance getAlcoholSocially() {
		return alcoholSocially;
	}
	public void setAlcoholSocially(ims.domain.lookups.LookupInstance alcoholSocially) {
		this.alcoholSocially = alcoholSocially;
	}

	public String getAlcoholDetails() {
		return alcoholDetails;
	}
	public void setAlcoholDetails(String alcoholDetails) {
		this.alcoholDetails = alcoholDetails;
	}

	public Integer getAlcoholUnits() {
		return alcoholUnits;
	}
	public void setAlcoholUnits(Integer alcoholUnits) {
		this.alcoholUnits = alcoholUnits;
	}

	public java.util.Set getLeisureClubs() {
		if ( null == leisureClubs ) {
			leisureClubs = new java.util.HashSet();
		}
		return leisureClubs;
	}
	public void setLeisureClubs(java.util.Set paramValue) {
		this.leisureClubs = paramValue;
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
		auditStr.append("\r\n*hobbies* :");
		auditStr.append(hobbies);
	    auditStr.append("; ");
		auditStr.append("\r\n*enjoyDoingMost* :");
		auditStr.append(enjoyDoingMost);
	    auditStr.append("; ");
		auditStr.append("\r\n*preferencesOfTime* :");
		auditStr.append(preferencesOfTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*alcoholSocially* :");
		if (alcoholSocially != null)
			auditStr.append(alcoholSocially.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*alcoholDetails* :");
		auditStr.append(alcoholDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*alcoholUnits* :");
		auditStr.append(alcoholUnits);
	    auditStr.append("; ");
		auditStr.append("\r\n*leisureClubs* :");
		if (leisureClubs != null)
		{
			java.util.Iterator it7 = leisureClubs.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.coe.assessment.domain.objects.LeisueClubs obj = (ims.coe.assessment.domain.objects.LeisueClubs)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
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
		
		String keyClassName = "LeisureComponent";
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
		if (this.getHobbies() != null)
		{
			sb.append("<hobbies>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHobbies().toString()));
			sb.append("</hobbies>");		
		}
		if (this.getEnjoyDoingMost() != null)
		{
			sb.append("<enjoyDoingMost>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEnjoyDoingMost().toString()));
			sb.append("</enjoyDoingMost>");		
		}
		if (this.getPreferencesOfTime() != null)
		{
			sb.append("<preferencesOfTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreferencesOfTime().toString()));
			sb.append("</preferencesOfTime>");		
		}
		if (this.getAlcoholSocially() != null)
		{
			sb.append("<alcoholSocially>");
			sb.append(this.getAlcoholSocially().toXMLString()); 
			sb.append("</alcoholSocially>");		
		}
		if (this.getAlcoholDetails() != null)
		{
			sb.append("<alcoholDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAlcoholDetails().toString()));
			sb.append("</alcoholDetails>");		
		}
		if (this.getAlcoholUnits() != null)
		{
			sb.append("<alcoholUnits>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAlcoholUnits().toString()));
			sb.append("</alcoholUnits>");		
		}
		if (this.getLeisureClubs() != null)
		{
			if (this.getLeisureClubs().size() > 0 )
			{
			sb.append("<leisureClubs>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLeisureClubs(), domMap));
			sb.append("</leisureClubs>");		
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
			LeisureComponent domainObject = getLeisureComponentfromXML(itemEl, factory, domMap);

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
			LeisureComponent domainObject = getLeisureComponentfromXML(itemEl, factory, domMap);

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
		
	public static LeisureComponent getLeisureComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLeisureComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LeisureComponent getLeisureComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LeisureComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LeisureComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LeisureComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LeisureComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LeisureComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LeisureComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LeisureComponent)factory.getImportedDomainObject(LeisureComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LeisureComponent();
		}
		String keyClassName = "LeisureComponent";
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
			return (LeisureComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LeisureComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("hobbies");
		if(fldEl != null)
		{	
    		obj.setHobbies(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("enjoyDoingMost");
		if(fldEl != null)
		{	
    		obj.setEnjoyDoingMost(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preferencesOfTime");
		if(fldEl != null)
		{	
    		obj.setPreferencesOfTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("alcoholSocially");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAlcoholSocially(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("alcoholDetails");
		if(fldEl != null)
		{	
    		obj.setAlcoholDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("alcoholUnits");
		if(fldEl != null)
		{	
    		obj.setAlcoholUnits(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("leisureClubs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLeisureClubs(ims.coe.assessment.domain.objects.LeisueClubs.fromSetXMLString(fldEl, factory, obj.getLeisureClubs(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "leisureClubs"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Hobbies = "hobbies";
		public static final String EnjoyDoingMost = "enjoyDoingMost";
		public static final String PreferencesOfTime = "preferencesOfTime";
		public static final String AlcoholSocially = "alcoholSocially";
		public static final String AlcoholDetails = "alcoholDetails";
		public static final String AlcoholUnits = "alcoholUnits";
		public static final String LeisureClubs = "leisureClubs";
	}
}

