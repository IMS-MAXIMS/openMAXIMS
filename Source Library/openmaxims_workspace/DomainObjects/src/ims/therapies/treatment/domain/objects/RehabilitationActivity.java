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
package ims.therapies.treatment.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RehabilitationActivity extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100009;
	private static final long serialVersionUID = 1019100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Location */
	private ims.domain.lookups.LookupInstance location;
	/** Purpose */
	private ims.domain.lookups.LookupInstance purpose;
	/** Independence Level */
	private ims.domain.lookups.LookupInstance independenceLevel;
	/** Activity Type */
	private ims.domain.lookups.LookupInstance activityType;
	/** Activity Category */
	private ims.domain.lookups.LookupInstance activityCategory;
	/** Activity Group */
	private ims.domain.lookups.LookupInstance activityGroup;
	/** Activity */
	private ims.domain.lookups.LookupInstance activity;
	/** NB. Configuration based on Activity Group
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List technique;
	/** NB. Configuration based on Activity Group
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List equipment;
	/** NB. Configuration based on Activity Group
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List envAdaptations;
    public RehabilitationActivity (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RehabilitationActivity ()
    {
    	super();
    }
    public RehabilitationActivity (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.RehabilitationActivity.class;
	}


	public ims.domain.lookups.LookupInstance getLocation() {
		return location;
	}
	public void setLocation(ims.domain.lookups.LookupInstance location) {
		this.location = location;
	}

	public ims.domain.lookups.LookupInstance getPurpose() {
		return purpose;
	}
	public void setPurpose(ims.domain.lookups.LookupInstance purpose) {
		this.purpose = purpose;
	}

	public ims.domain.lookups.LookupInstance getIndependenceLevel() {
		return independenceLevel;
	}
	public void setIndependenceLevel(ims.domain.lookups.LookupInstance independenceLevel) {
		this.independenceLevel = independenceLevel;
	}

	public ims.domain.lookups.LookupInstance getActivityType() {
		return activityType;
	}
	public void setActivityType(ims.domain.lookups.LookupInstance activityType) {
		this.activityType = activityType;
	}

	public ims.domain.lookups.LookupInstance getActivityCategory() {
		return activityCategory;
	}
	public void setActivityCategory(ims.domain.lookups.LookupInstance activityCategory) {
		this.activityCategory = activityCategory;
	}

	public ims.domain.lookups.LookupInstance getActivityGroup() {
		return activityGroup;
	}
	public void setActivityGroup(ims.domain.lookups.LookupInstance activityGroup) {
		this.activityGroup = activityGroup;
	}

	public ims.domain.lookups.LookupInstance getActivity() {
		return activity;
	}
	public void setActivity(ims.domain.lookups.LookupInstance activity) {
		this.activity = activity;
	}

	public java.util.List getTechnique() {
		if ( null == technique ) {
			technique = new java.util.ArrayList();
		}
		return technique;
	}
	public void setTechnique(java.util.List paramValue) {
		this.technique = paramValue;
	}

	public java.util.List getEquipment() {
		if ( null == equipment ) {
			equipment = new java.util.ArrayList();
		}
		return equipment;
	}
	public void setEquipment(java.util.List paramValue) {
		this.equipment = paramValue;
	}

	public java.util.List getEnvAdaptations() {
		if ( null == envAdaptations ) {
			envAdaptations = new java.util.ArrayList();
		}
		return envAdaptations;
	}
	public void setEnvAdaptations(java.util.List paramValue) {
		this.envAdaptations = paramValue;
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
		
		auditStr.append("\r\n*location* :");
		if (location != null)
			auditStr.append(location.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*purpose* :");
		if (purpose != null)
			auditStr.append(purpose.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*independenceLevel* :");
		if (independenceLevel != null)
			auditStr.append(independenceLevel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityType* :");
		if (activityType != null)
			auditStr.append(activityType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityCategory* :");
		if (activityCategory != null)
			auditStr.append(activityCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityGroup* :");
		if (activityGroup != null)
			auditStr.append(activityGroup.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		if (activity != null)
			auditStr.append(activity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*technique* :");
		if (technique != null)
		{
			java.util.Iterator it8 = technique.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it8.next();
			auditStr.append(obj.getText());
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*equipment* :");
		if (equipment != null)
		{
			java.util.Iterator it9 = equipment.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it9.next();
			auditStr.append(obj.getText());
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*envAdaptations* :");
		if (envAdaptations != null)
		{
			java.util.Iterator it10 = envAdaptations.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it10.next();
			auditStr.append(obj.getText());
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
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
		
		String keyClassName = "RehabilitationActivity";
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
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString()); 
			sb.append("</location>");		
		}
		if (this.getPurpose() != null)
		{
			sb.append("<purpose>");
			sb.append(this.getPurpose().toXMLString()); 
			sb.append("</purpose>");		
		}
		if (this.getIndependenceLevel() != null)
		{
			sb.append("<independenceLevel>");
			sb.append(this.getIndependenceLevel().toXMLString()); 
			sb.append("</independenceLevel>");		
		}
		if (this.getActivityType() != null)
		{
			sb.append("<activityType>");
			sb.append(this.getActivityType().toXMLString()); 
			sb.append("</activityType>");		
		}
		if (this.getActivityCategory() != null)
		{
			sb.append("<activityCategory>");
			sb.append(this.getActivityCategory().toXMLString()); 
			sb.append("</activityCategory>");		
		}
		if (this.getActivityGroup() != null)
		{
			sb.append("<activityGroup>");
			sb.append(this.getActivityGroup().toXMLString()); 
			sb.append("</activityGroup>");		
		}
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString()); 
			sb.append("</activity>");		
		}
		if (this.getTechnique() != null)
		{
			if (this.getTechnique().size() > 0 )
			{
			sb.append("<technique>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTechnique())); 
			sb.append("</technique>");		
			}
		}
		if (this.getEquipment() != null)
		{
			if (this.getEquipment().size() > 0 )
			{
			sb.append("<equipment>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getEquipment())); 
			sb.append("</equipment>");		
			}
		}
		if (this.getEnvAdaptations() != null)
		{
			if (this.getEnvAdaptations().size() > 0 )
			{
			sb.append("<envAdaptations>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getEnvAdaptations())); 
			sb.append("</envAdaptations>");		
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
			RehabilitationActivity domainObject = getRehabilitationActivityfromXML(itemEl, factory, domMap);

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
			RehabilitationActivity domainObject = getRehabilitationActivityfromXML(itemEl, factory, domMap);

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
		
	public static RehabilitationActivity getRehabilitationActivityfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRehabilitationActivityfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RehabilitationActivity getRehabilitationActivityfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RehabilitationActivity.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RehabilitationActivity.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RehabilitationActivity class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RehabilitationActivity)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RehabilitationActivity.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RehabilitationActivity ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RehabilitationActivity)factory.getImportedDomainObject(RehabilitationActivity.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RehabilitationActivity();
		}
		String keyClassName = "RehabilitationActivity";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RehabilitationActivity)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RehabilitationActivity obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("purpose");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPurpose(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("independenceLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIndependenceLevel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivityType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivityCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivityGroup(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("technique");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTechnique(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTechnique())); 
		}
		fldEl = el.element("equipment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setEquipment(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getEquipment())); 
		}
		fldEl = el.element("envAdaptations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setEnvAdaptations(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getEnvAdaptations())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "technique"
		, "equipment"
		, "envAdaptations"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Location = "location";
		public static final String Purpose = "purpose";
		public static final String IndependenceLevel = "independenceLevel";
		public static final String ActivityType = "activityType";
		public static final String ActivityCategory = "activityCategory";
		public static final String ActivityGroup = "activityGroup";
		public static final String Activity = "activity";
		public static final String Technique = "technique";
		public static final String Equipment = "equipment";
		public static final String EnvAdaptations = "envAdaptations";
	}
}

