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
package ims.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class PatientGoal extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100019;
	private static final long serialVersionUID = 1072100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Goal Planning - Goal Term */
	private ims.domain.lookups.LookupInstance goalType;
	/** Goal Planning - Area of Need */
	private ims.domain.lookups.LookupInstance areaOfNeed;
	/** Goal Planning - Goal Description */
	private String goalText;
	/** Goal Planning - Date and Time Goal Created */
	private java.util.Date createdDateTime;
	/** Goal Planning - Date Goal Achieved */
	private java.util.Date dateAchieved;
	/** Goal Planning - Goal Targets
	  * Collection of ims.clinical.domain.objects.PatientGoalTarget.
	  */
	private java.util.Set target;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring HCP  - editable on New, disabled on Update  */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientGoal (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientGoal ()
    {
    	super();
    }
    public PatientGoal (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientGoal.class;
	}


	public ims.domain.lookups.LookupInstance getGoalType() {
		return goalType;
	}
	public void setGoalType(ims.domain.lookups.LookupInstance goalType) {
		this.goalType = goalType;
	}

	public ims.domain.lookups.LookupInstance getAreaOfNeed() {
		return areaOfNeed;
	}
	public void setAreaOfNeed(ims.domain.lookups.LookupInstance areaOfNeed) {
		this.areaOfNeed = areaOfNeed;
	}

	public String getGoalText() {
		return goalText;
	}
	public void setGoalText(String goalText) {
		if ( null != goalText && goalText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for goalText. Tried to set value: "+
				goalText);
		}
		this.goalText = goalText;
	}

	public java.util.Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(java.util.Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public java.util.Date getDateAchieved() {
		return dateAchieved;
	}
	public void setDateAchieved(java.util.Date dateAchieved) {
		this.dateAchieved = dateAchieved;
	}

	public java.util.Set getTarget() {
		if ( null == target ) {
			target = new java.util.HashSet();
		}
		return target;
	}
	public void setTarget(java.util.Set paramValue) {
		this.target = paramValue;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
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
		
		auditStr.append("\r\n*goalType* :");
		if (goalType != null)
			auditStr.append(goalType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*areaOfNeed* :");
		if (areaOfNeed != null)
			auditStr.append(areaOfNeed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*goalText* :");
		auditStr.append(goalText);
	    auditStr.append("; ");
		auditStr.append("\r\n*createdDateTime* :");
		auditStr.append(createdDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateAchieved* :");
		auditStr.append(dateAchieved);
	    auditStr.append("; ");
		auditStr.append("\r\n*target* :");
		if (target != null)
		{
			java.util.Iterator it6 = target.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.PatientGoalTarget obj = (ims.clinical.domain.objects.PatientGoalTarget)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
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
		
		String keyClassName = "PatientGoal";
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
		if (this.getGoalType() != null)
		{
			sb.append("<goalType>");
			sb.append(this.getGoalType().toXMLString()); 
			sb.append("</goalType>");		
		}
		if (this.getAreaOfNeed() != null)
		{
			sb.append("<areaOfNeed>");
			sb.append(this.getAreaOfNeed().toXMLString()); 
			sb.append("</areaOfNeed>");		
		}
		if (this.getGoalText() != null)
		{
			sb.append("<goalText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGoalText().toString()));
			sb.append("</goalText>");		
		}
		if (this.getCreatedDateTime() != null)
		{
			sb.append("<createdDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCreatedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</createdDateTime>");		
		}
		if (this.getDateAchieved() != null)
		{
			sb.append("<dateAchieved>");
			sb.append(new ims.framework.utils.DateTime(this.getDateAchieved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateAchieved>");		
		}
		if (this.getTarget() != null)
		{
			if (this.getTarget().size() > 0 )
			{
			sb.append("<target>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTarget(), domMap));
			sb.append("</target>");		
			}
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
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
			PatientGoal domainObject = getPatientGoalfromXML(itemEl, factory, domMap);

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
			PatientGoal domainObject = getPatientGoalfromXML(itemEl, factory, domMap);

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
		
	public static PatientGoal getPatientGoalfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientGoalfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientGoal getPatientGoalfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientGoal.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientGoal.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientGoal class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientGoal)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientGoal.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientGoal ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientGoal)factory.getImportedDomainObject(PatientGoal.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientGoal();
		}
		String keyClassName = "PatientGoal";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientGoal)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientGoal obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("goalType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGoalType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("areaOfNeed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAreaOfNeed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("goalText");
		if(fldEl != null)
		{	
    		obj.setGoalText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("createdDateTime");
		if(fldEl != null)
		{	
    		obj.setCreatedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateAchieved");
		if(fldEl != null)
		{	
    		obj.setDateAchieved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("target");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTarget(ims.clinical.domain.objects.PatientGoalTarget.fromSetXMLString(fldEl, factory, obj.getTarget(), domMap));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "target"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String GoalType = "goalType";
		public static final String AreaOfNeed = "areaOfNeed";
		public static final String GoalText = "goalText";
		public static final String CreatedDateTime = "createdDateTime";
		public static final String DateAchieved = "dateAchieved";
		public static final String Target = "target";
		public static final String CareContext = "careContext";
		public static final String AuthoringHCP = "authoringHCP";
	}
}

