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
package ims.icps.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ICP extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1060100000;
	private static final long serialVersionUID = 1060100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** Stages
	  * Collection of ims.icps.configuration.domain.objects.ICPStage.
	  */
	private java.util.List stages;
	/** Category */
	private ims.domain.lookups.LookupInstance category;
	/** Type */
	private ims.domain.lookups.LookupInstance type;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** HelpURL */
	private String helpURL;
	/** ContactPerson */
	private ims.core.resource.people.domain.objects.MemberOfStaff contactPerson;
	/** CreationDate */
	private java.util.Date creationDate;
	/** Procedures
	  * Collection of ims.core.clinical.domain.objects.Procedure.
	  */
	private java.util.Set procedures;
	/** Diagnosis */
	private ims.core.clinical.domain.objects.Diagnosis diagnosis;
	/** Requires Suitable For Surgery Assessment */
	private Boolean requiresSuitableForSurgeryAssessment;
	/** Suitable For Surgery Assessment */
	private ims.assessment.configuration.domain.objects.UserAssessment suitableForSurgeryAssessment;
	/** Problem */
	private ims.clinical.configuration.domain.objects.ClinicalProblem problem;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ICP (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ICP ()
    {
    	super();
    }
    public ICP (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.icps.configuration.domain.objects.ICP.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.List getStages() {
		if ( null == stages ) {
			stages = new java.util.ArrayList();
		}
		return stages;
	}
	public void setStages(java.util.List paramValue) {
		this.stages = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public String getHelpURL() {
		return helpURL;
	}
	public void setHelpURL(String helpURL) {
		if ( null != helpURL && helpURL.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for helpURL. Tried to set value: "+
				helpURL);
		}
		this.helpURL = helpURL;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(ims.core.resource.people.domain.objects.MemberOfStaff contactPerson) {
		this.contactPerson = contactPerson;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
	}

	public ims.core.clinical.domain.objects.Diagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(ims.core.clinical.domain.objects.Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Boolean isRequiresSuitableForSurgeryAssessment() {
		return requiresSuitableForSurgeryAssessment;
	}
	public void setRequiresSuitableForSurgeryAssessment(Boolean requiresSuitableForSurgeryAssessment) {
		this.requiresSuitableForSurgeryAssessment = requiresSuitableForSurgeryAssessment;
	}

	public ims.assessment.configuration.domain.objects.UserAssessment getSuitableForSurgeryAssessment() {
		return suitableForSurgeryAssessment;
	}
	public void setSuitableForSurgeryAssessment(ims.assessment.configuration.domain.objects.UserAssessment suitableForSurgeryAssessment) {
		this.suitableForSurgeryAssessment = suitableForSurgeryAssessment;
	}

	public ims.clinical.configuration.domain.objects.ClinicalProblem getProblem() {
		return problem;
	}
	public void setProblem(ims.clinical.configuration.domain.objects.ClinicalProblem problem) {
		this.problem = problem;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*stages* :");
		if (stages != null)
		{
		int i3=0;
		for (i3=0; i3<stages.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.icps.configuration.domain.objects.ICPStage obj = (ims.icps.configuration.domain.objects.ICPStage)stages.get(i3);
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
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*helpURL* :");
		auditStr.append(helpURL);
	    auditStr.append("; ");
		auditStr.append("\r\n*contactPerson* :");
		if (contactPerson != null)
		{
			auditStr.append(toShortClassName(contactPerson));
				
		    auditStr.append(contactPerson.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it11 = procedures.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.Procedure obj = (ims.core.clinical.domain.objects.Procedure)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			auditStr.append(toShortClassName(diagnosis));
				
		    auditStr.append(diagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresSuitableForSurgeryAssessment* :");
		auditStr.append(requiresSuitableForSurgeryAssessment);
	    auditStr.append("; ");
		auditStr.append("\r\n*suitableForSurgeryAssessment* :");
		if (suitableForSurgeryAssessment != null)
		{
			auditStr.append(toShortClassName(suitableForSurgeryAssessment));
				
		    auditStr.append(suitableForSurgeryAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*problem* :");
		if (problem != null)
		{
			auditStr.append(toShortClassName(problem));
				
		    auditStr.append(problem.getId());
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
		
		String keyClassName = "ICP";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getStages() != null)
		{
			if (this.getStages().size() > 0 )
			{
			sb.append("<stages>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStages(), domMap));
			sb.append("</stages>");		
			}
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getHelpURL() != null)
		{
			sb.append("<helpURL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHelpURL().toString()));
			sb.append("</helpURL>");		
		}
		if (this.getContactPerson() != null)
		{
			sb.append("<contactPerson>");
			sb.append(this.getContactPerson().toXMLString(domMap)); 	
			sb.append("</contactPerson>");		
		}
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
		}
		if (this.getDiagnosis() != null)
		{
			sb.append("<diagnosis>");
			sb.append(this.getDiagnosis().toXMLString(domMap)); 	
			sb.append("</diagnosis>");		
		}
		if (this.isRequiresSuitableForSurgeryAssessment() != null)
		{
			sb.append("<requiresSuitableForSurgeryAssessment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresSuitableForSurgeryAssessment().toString()));
			sb.append("</requiresSuitableForSurgeryAssessment>");		
		}
		if (this.getSuitableForSurgeryAssessment() != null)
		{
			sb.append("<suitableForSurgeryAssessment>");
			sb.append(this.getSuitableForSurgeryAssessment().toXMLString(domMap)); 	
			sb.append("</suitableForSurgeryAssessment>");		
		}
		if (this.getProblem() != null)
		{
			sb.append("<problem>");
			sb.append(this.getProblem().toXMLString(domMap)); 	
			sb.append("</problem>");		
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
			ICP domainObject = getICPfromXML(itemEl, factory, domMap);

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
			ICP domainObject = getICPfromXML(itemEl, factory, domMap);

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
		
	public static ICP getICPfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getICPfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ICP getICPfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ICP.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ICP.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ICP class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ICP)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ICP.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ICP ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ICP)factory.getImportedDomainObject(ICP.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ICP();
		}
		String keyClassName = "ICP";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ICP)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ICP obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stages");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStages(ims.icps.configuration.domain.objects.ICPStage.fromListXMLString(fldEl, factory, obj.getStages(), domMap));
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("helpURL");
		if(fldEl != null)
		{	
    		obj.setHelpURL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contactPerson");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContactPerson(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.core.clinical.domain.objects.Procedure.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagnosis(ims.core.clinical.domain.objects.Diagnosis.getDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requiresSuitableForSurgeryAssessment");
		if(fldEl != null)
		{	
    		obj.setRequiresSuitableForSurgeryAssessment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("suitableForSurgeryAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSuitableForSurgeryAssessment(ims.assessment.configuration.domain.objects.UserAssessment.getUserAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("problem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProblem(ims.clinical.configuration.domain.objects.ClinicalProblem.getClinicalProblemfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "stages"
		, "procedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String Stages = "stages";
		public static final String Category = "category";
		public static final String Type = "type";
		public static final String Status = "status";
		public static final String Specialty = "specialty";
		public static final String HelpURL = "helpURL";
		public static final String ContactPerson = "contactPerson";
		public static final String CreationDate = "creationDate";
		public static final String Procedures = "procedures";
		public static final String Diagnosis = "diagnosis";
		public static final String RequiresSuitableForSurgeryAssessment = "requiresSuitableForSurgeryAssessment";
		public static final String SuitableForSurgeryAssessment = "suitableForSurgeryAssessment";
		public static final String Problem = "problem";
	}
}

