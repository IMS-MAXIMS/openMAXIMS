//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.nursing.careplans.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class CarePlanTemplate extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1010100000;
	private static final long serialVersionUID = 1010100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.util.Date creationDate;
	private String title;
	/** Identifies the associated activity of daily livig: lookup */
	private ims.domain.lookups.LookupInstance assessmentComponent;
	private Boolean active;
	/** 
	  * Collection of ims.nursing.careplans.domain.objects.CarePlanTemplateObjective.
	  */
	private java.util.Set objectives;
	/** 
	  * Collection of ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention.
	  */
	private java.util.List interventions;
	/** 
	  * Collection of ims.nursing.assessment.domain.objects.AssessmentComponent.
	  */
	private java.util.Set assessmentComponents;
    public CarePlanTemplate (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CarePlanTemplate ()
    {
    	super();
    }
    public CarePlanTemplate (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.careplans.domain.objects.CarePlanTemplate.class;
	}


	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if ( null != title && title.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for title. Tried to set value: "+
				title);
		}
		this.title = title;
	}

	public ims.domain.lookups.LookupInstance getAssessmentComponent() {
		return assessmentComponent;
	}
	public void setAssessmentComponent(ims.domain.lookups.LookupInstance assessmentComponent) {
		this.assessmentComponent = assessmentComponent;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public java.util.Set getObjectives() {
		if ( null == objectives ) {
			objectives = new java.util.HashSet();
		}
		return objectives;
	}
	public void setObjectives(java.util.Set paramValue) {
		this.objectives = paramValue;
	}

	public java.util.List getInterventions() {
		if ( null == interventions ) {
			interventions = new java.util.ArrayList();
		}
		return interventions;
	}
	public void setInterventions(java.util.List paramValue) {
		this.interventions = paramValue;
	}

	public java.util.Set getAssessmentComponents() {
		if ( null == assessmentComponents ) {
			assessmentComponents = new java.util.HashSet();
		}
		return assessmentComponents;
	}
	public void setAssessmentComponents(java.util.Set paramValue) {
		this.assessmentComponents = paramValue;
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
		
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*title* :");
		auditStr.append(title);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentComponent* :");
		if (assessmentComponent != null)
			auditStr.append(assessmentComponent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectives* :");
		if (objectives != null)
		{
			java.util.Iterator it5 = objectives.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.nursing.careplans.domain.objects.CarePlanTemplateObjective obj = (ims.nursing.careplans.domain.objects.CarePlanTemplateObjective)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*interventions* :");
		if (interventions != null)
		{
		int i6=0;
		for (i6=0; i6<interventions.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention obj = (ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention)interventions.get(i6);
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
		auditStr.append("\r\n*assessmentComponents* :");
		if (assessmentComponents != null)
		{
			java.util.Iterator it7 = assessmentComponents.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.AssessmentComponent obj = (ims.nursing.assessment.domain.objects.AssessmentComponent)it7.next();
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
		
		String keyClassName = "CarePlanTemplate";
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
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getTitle() != null)
		{
			sb.append("<title>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTitle().toString()));
			sb.append("</title>");		
		}
		if (this.getAssessmentComponent() != null)
		{
			sb.append("<assessmentComponent>");
			sb.append(this.getAssessmentComponent().toXMLString()); 
			sb.append("</assessmentComponent>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getObjectives() != null)
		{
			if (this.getObjectives().size() > 0 )
			{
			sb.append("<objectives>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getObjectives(), domMap));
			sb.append("</objectives>");		
			}
		}
		if (this.getInterventions() != null)
		{
			if (this.getInterventions().size() > 0 )
			{
			sb.append("<interventions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInterventions(), domMap));
			sb.append("</interventions>");		
			}
		}
		if (this.getAssessmentComponents() != null)
		{
			if (this.getAssessmentComponents().size() > 0 )
			{
			sb.append("<assessmentComponents>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssessmentComponents(), domMap));
			sb.append("</assessmentComponents>");		
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
			CarePlanTemplate domainObject = getCarePlanTemplatefromXML(itemEl, factory, domMap);

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
			CarePlanTemplate domainObject = getCarePlanTemplatefromXML(itemEl, factory, domMap);

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
		
	public static CarePlanTemplate getCarePlanTemplatefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCarePlanTemplatefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CarePlanTemplate getCarePlanTemplatefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CarePlanTemplate.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CarePlanTemplate.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CarePlanTemplate class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CarePlanTemplate)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CarePlanTemplate.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CarePlanTemplate ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CarePlanTemplate)factory.getImportedDomainObject(CarePlanTemplate.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CarePlanTemplate();
		}
		String keyClassName = "CarePlanTemplate";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CarePlanTemplate)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CarePlanTemplate obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("title");
		if(fldEl != null)
		{	
    		obj.setTitle(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessmentComponent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssessmentComponent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectives");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setObjectives(ims.nursing.careplans.domain.objects.CarePlanTemplateObjective.fromSetXMLString(fldEl, factory, obj.getObjectives(), domMap));
		}
		fldEl = el.element("interventions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setInterventions(ims.nursing.careplans.domain.objects.CarePlanTemplateIntervention.fromListXMLString(fldEl, factory, obj.getInterventions(), domMap));
		}
		fldEl = el.element("assessmentComponents");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssessmentComponents(ims.nursing.assessment.domain.objects.AssessmentComponent.fromSetXMLString(fldEl, factory, obj.getAssessmentComponents(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "objectives"
		, "interventions"
		, "assessmentComponents"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CreationDate = "creationDate";
		public static final String Title = "title";
		public static final String AssessmentComponent = "assessmentComponent";
		public static final String Active = "active";
		public static final String Objectives = "objectives";
		public static final String Interventions = "interventions";
		public static final String AssessmentComponents = "assessmentComponents";
	}
}

