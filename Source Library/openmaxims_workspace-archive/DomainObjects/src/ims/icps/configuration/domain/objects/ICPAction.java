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
 * @author Neil McAnaspie
 * Generated.
 */


public class ICPAction extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1060100008;
	private static final long serialVersionUID = 1060100008L;
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
	/** Sequence */
	private Integer sequence;
	/** HelpURL */
	private String helpURL;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Discipline
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List discipline;
	/** LinkedType */
	private ims.domain.lookups.LookupInstance linkedType;
	/** LinkedForm */
	private ims.core.configuration.domain.objects.AppForm linkedForm;
	/** Is the action Mandatory */
	private Boolean isMandatory;
	/** Linked Assessment */
	private ims.assessment.configuration.domain.objects.UserAssessment linkedAssessment;
	/** Is Activated On Initiation */
	private Boolean isActivatedOnInitiation;
	/** Linked Graphic Assessment */
	private ims.assessment.configuration.domain.objects.GraphicAssessment linkedGraphicAssessment;
	/** Linked Order Entry Template */
	private ims.ocrr.configuration.domain.objects.OrderEntryTemplate linkedOrderEntryTemplate;
	/** Requires Counter Signature */
	private Boolean requiresCounterSignature;
	/** Clinical Detail Actions
	  * Collection of ims.icps.configuration.domain.objects.ICPAction.
	  */
	private java.util.Set clinicalDetailActions;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ICPAction (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ICPAction ()
    {
    	super();
    }
    public ICPAction (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.icps.configuration.domain.objects.ICPAction.class;
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
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
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

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.List getDiscipline() {
		if ( null == discipline ) {
			discipline = new java.util.ArrayList();
		}
		return discipline;
	}
	public void setDiscipline(java.util.List paramValue) {
		this.discipline = paramValue;
	}

	public ims.domain.lookups.LookupInstance getLinkedType() {
		return linkedType;
	}
	public void setLinkedType(ims.domain.lookups.LookupInstance linkedType) {
		this.linkedType = linkedType;
	}

	public ims.core.configuration.domain.objects.AppForm getLinkedForm() {
		return linkedForm;
	}
	public void setLinkedForm(ims.core.configuration.domain.objects.AppForm linkedForm) {
		this.linkedForm = linkedForm;
	}

	public Boolean isIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public ims.assessment.configuration.domain.objects.UserAssessment getLinkedAssessment() {
		return linkedAssessment;
	}
	public void setLinkedAssessment(ims.assessment.configuration.domain.objects.UserAssessment linkedAssessment) {
		this.linkedAssessment = linkedAssessment;
	}

	public Boolean isIsActivatedOnInitiation() {
		return isActivatedOnInitiation;
	}
	public void setIsActivatedOnInitiation(Boolean isActivatedOnInitiation) {
		this.isActivatedOnInitiation = isActivatedOnInitiation;
	}

	public ims.assessment.configuration.domain.objects.GraphicAssessment getLinkedGraphicAssessment() {
		return linkedGraphicAssessment;
	}
	public void setLinkedGraphicAssessment(ims.assessment.configuration.domain.objects.GraphicAssessment linkedGraphicAssessment) {
		this.linkedGraphicAssessment = linkedGraphicAssessment;
	}

	public ims.ocrr.configuration.domain.objects.OrderEntryTemplate getLinkedOrderEntryTemplate() {
		return linkedOrderEntryTemplate;
	}
	public void setLinkedOrderEntryTemplate(ims.ocrr.configuration.domain.objects.OrderEntryTemplate linkedOrderEntryTemplate) {
		this.linkedOrderEntryTemplate = linkedOrderEntryTemplate;
	}

	public Boolean isRequiresCounterSignature() {
		return requiresCounterSignature;
	}
	public void setRequiresCounterSignature(Boolean requiresCounterSignature) {
		this.requiresCounterSignature = requiresCounterSignature;
	}

	public java.util.Set getClinicalDetailActions() {
		if ( null == clinicalDetailActions ) {
			clinicalDetailActions = new java.util.HashSet();
		}
		return clinicalDetailActions;
	}
	public void setClinicalDetailActions(java.util.Set paramValue) {
		this.clinicalDetailActions = paramValue;
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
		auditStr.append("\r\n*sequence* :");
		auditStr.append(sequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*helpURL* :");
		auditStr.append(helpURL);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*discipline* :");
		if (discipline != null)
		{
			java.util.Iterator it6 = discipline.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it6.next();
			auditStr.append(obj.getText());
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedType* :");
		if (linkedType != null)
			auditStr.append(linkedType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedForm* :");
		if (linkedForm != null)
		{
			auditStr.append(toShortClassName(linkedForm));
				
		    auditStr.append(linkedForm.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isMandatory* :");
		auditStr.append(isMandatory);
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedAssessment* :");
		if (linkedAssessment != null)
		{
			auditStr.append(toShortClassName(linkedAssessment));
				
		    auditStr.append(linkedAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActivatedOnInitiation* :");
		auditStr.append(isActivatedOnInitiation);
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedGraphicAssessment* :");
		if (linkedGraphicAssessment != null)
		{
			auditStr.append(toShortClassName(linkedGraphicAssessment));
				
		    auditStr.append(linkedGraphicAssessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedOrderEntryTemplate* :");
		if (linkedOrderEntryTemplate != null)
		{
			auditStr.append(toShortClassName(linkedOrderEntryTemplate));
				
		    auditStr.append(linkedOrderEntryTemplate.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresCounterSignature* :");
		auditStr.append(requiresCounterSignature);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalDetailActions* :");
		if (clinicalDetailActions != null)
		{
			java.util.Iterator it15 = clinicalDetailActions.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.icps.configuration.domain.objects.ICPAction obj = (ims.icps.configuration.domain.objects.ICPAction)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
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
		
		String keyClassName = "ICPAction";
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
		if (this.getSequence() != null)
		{
			sb.append("<sequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequence().toString()));
			sb.append("</sequence>");		
		}
		if (this.getHelpURL() != null)
		{
			sb.append("<helpURL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHelpURL().toString()));
			sb.append("</helpURL>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getDiscipline() != null)
		{
			if (this.getDiscipline().size() > 0 )
			{
			sb.append("<discipline>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getDiscipline())); 
			sb.append("</discipline>");		
			}
		}
		if (this.getLinkedType() != null)
		{
			sb.append("<linkedType>");
			sb.append(this.getLinkedType().toXMLString()); 
			sb.append("</linkedType>");		
		}
		if (this.getLinkedForm() != null)
		{
			sb.append("<linkedForm>");
			sb.append(this.getLinkedForm().toXMLString(domMap)); 	
			sb.append("</linkedForm>");		
		}
		if (this.isIsMandatory() != null)
		{
			sb.append("<isMandatory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMandatory().toString()));
			sb.append("</isMandatory>");		
		}
		if (this.getLinkedAssessment() != null)
		{
			sb.append("<linkedAssessment>");
			sb.append(this.getLinkedAssessment().toXMLString(domMap)); 	
			sb.append("</linkedAssessment>");		
		}
		if (this.isIsActivatedOnInitiation() != null)
		{
			sb.append("<isActivatedOnInitiation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActivatedOnInitiation().toString()));
			sb.append("</isActivatedOnInitiation>");		
		}
		if (this.getLinkedGraphicAssessment() != null)
		{
			sb.append("<linkedGraphicAssessment>");
			sb.append(this.getLinkedGraphicAssessment().toXMLString(domMap)); 	
			sb.append("</linkedGraphicAssessment>");		
		}
		if (this.getLinkedOrderEntryTemplate() != null)
		{
			sb.append("<linkedOrderEntryTemplate>");
			sb.append(this.getLinkedOrderEntryTemplate().toXMLString(domMap)); 	
			sb.append("</linkedOrderEntryTemplate>");		
		}
		if (this.isRequiresCounterSignature() != null)
		{
			sb.append("<requiresCounterSignature>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresCounterSignature().toString()));
			sb.append("</requiresCounterSignature>");		
		}
		if (this.getClinicalDetailActions() != null)
		{
			if (this.getClinicalDetailActions().size() > 0 )
			{
			sb.append("<clinicalDetailActions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinicalDetailActions(), domMap));
			sb.append("</clinicalDetailActions>");		
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
			ICPAction domainObject = getICPActionfromXML(itemEl, factory, domMap);

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
			ICPAction domainObject = getICPActionfromXML(itemEl, factory, domMap);

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
		
	public static ICPAction getICPActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getICPActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ICPAction getICPActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ICPAction.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ICPAction.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ICPAction class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ICPAction)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ICPAction.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ICPAction ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ICPAction)factory.getImportedDomainObject(ICPAction.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ICPAction();
		}
		String keyClassName = "ICPAction";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ICPAction)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ICPAction obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("sequence");
		if(fldEl != null)
		{	
    		obj.setSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("helpURL");
		if(fldEl != null)
		{	
    		obj.setHelpURL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("discipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDiscipline(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getDiscipline())); 
		}
		fldEl = el.element("linkedType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLinkedType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("linkedForm");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedForm(ims.core.configuration.domain.objects.AppForm.getAppFormfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isMandatory");
		if(fldEl != null)
		{	
    		obj.setIsMandatory(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("linkedAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedAssessment(ims.assessment.configuration.domain.objects.UserAssessment.getUserAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActivatedOnInitiation");
		if(fldEl != null)
		{	
    		obj.setIsActivatedOnInitiation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("linkedGraphicAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedGraphicAssessment(ims.assessment.configuration.domain.objects.GraphicAssessment.getGraphicAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("linkedOrderEntryTemplate");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedOrderEntryTemplate(ims.ocrr.configuration.domain.objects.OrderEntryTemplate.getOrderEntryTemplatefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requiresCounterSignature");
		if(fldEl != null)
		{	
    		obj.setRequiresCounterSignature(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalDetailActions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClinicalDetailActions(ims.icps.configuration.domain.objects.ICPAction.fromSetXMLString(fldEl, factory, obj.getClinicalDetailActions(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "discipline"
		, "clinicalDetailActions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String Sequence = "sequence";
		public static final String HelpURL = "helpURL";
		public static final String Status = "status";
		public static final String Discipline = "discipline";
		public static final String LinkedType = "linkedType";
		public static final String LinkedForm = "linkedForm";
		public static final String IsMandatory = "isMandatory";
		public static final String LinkedAssessment = "linkedAssessment";
		public static final String IsActivatedOnInitiation = "isActivatedOnInitiation";
		public static final String LinkedGraphicAssessment = "linkedGraphicAssessment";
		public static final String LinkedOrderEntryTemplate = "linkedOrderEntryTemplate";
		public static final String RequiresCounterSignature = "requiresCounterSignature";
		public static final String ClinicalDetailActions = "clinicalDetailActions";
	}
}

