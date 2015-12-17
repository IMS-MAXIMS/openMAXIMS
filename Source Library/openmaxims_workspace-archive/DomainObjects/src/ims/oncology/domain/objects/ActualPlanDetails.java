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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ActualPlanDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100034;
	private static final long serialVersionUID = 1074100034L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Date Decision To Treat */
	private java.util.Date dateDecisionToTreat;
	/** Planned Treatment Type */
	private ims.domain.lookups.LookupInstance plannedTreatmentType;
	/** Organisation Planned */
	private ims.domain.lookups.LookupInstance organisationPlanned;
	/** Actual Treatment Date */
	private java.util.Date actualTreatmentDate;
	/** Actual Treatment Type */
	private ims.domain.lookups.LookupInstance actualTreatmentType;
	/** Organisation Organised */
	private ims.domain.lookups.LookupInstance organisationOrganised;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ActualPlanDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActualPlanDetails ()
    {
    	super();
    }
    public ActualPlanDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.ActualPlanDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getDateDecisionToTreat() {
		return dateDecisionToTreat;
	}
	public void setDateDecisionToTreat(java.util.Date dateDecisionToTreat) {
		this.dateDecisionToTreat = dateDecisionToTreat;
	}

	public ims.domain.lookups.LookupInstance getPlannedTreatmentType() {
		return plannedTreatmentType;
	}
	public void setPlannedTreatmentType(ims.domain.lookups.LookupInstance plannedTreatmentType) {
		this.plannedTreatmentType = plannedTreatmentType;
	}

	public ims.domain.lookups.LookupInstance getOrganisationPlanned() {
		return organisationPlanned;
	}
	public void setOrganisationPlanned(ims.domain.lookups.LookupInstance organisationPlanned) {
		this.organisationPlanned = organisationPlanned;
	}

	public java.util.Date getActualTreatmentDate() {
		return actualTreatmentDate;
	}
	public void setActualTreatmentDate(java.util.Date actualTreatmentDate) {
		this.actualTreatmentDate = actualTreatmentDate;
	}

	public ims.domain.lookups.LookupInstance getActualTreatmentType() {
		return actualTreatmentType;
	}
	public void setActualTreatmentType(ims.domain.lookups.LookupInstance actualTreatmentType) {
		this.actualTreatmentType = actualTreatmentType;
	}

	public ims.domain.lookups.LookupInstance getOrganisationOrganised() {
		return organisationOrganised;
	}
	public void setOrganisationOrganised(ims.domain.lookups.LookupInstance organisationOrganised) {
		this.organisationOrganised = organisationOrganised;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateDecisionToTreat* :");
		auditStr.append(dateDecisionToTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedTreatmentType* :");
		if (plannedTreatmentType != null)
			auditStr.append(plannedTreatmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*organisationPlanned* :");
		if (organisationPlanned != null)
			auditStr.append(organisationPlanned.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*actualTreatmentDate* :");
		auditStr.append(actualTreatmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualTreatmentType* :");
		if (actualTreatmentType != null)
			auditStr.append(actualTreatmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*organisationOrganised* :");
		if (organisationOrganised != null)
			auditStr.append(organisationOrganised.getText());
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
		
		String keyClassName = "ActualPlanDetails";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getDateDecisionToTreat() != null)
		{
			sb.append("<dateDecisionToTreat>");
			sb.append(new ims.framework.utils.DateTime(this.getDateDecisionToTreat()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateDecisionToTreat>");		
		}
		if (this.getPlannedTreatmentType() != null)
		{
			sb.append("<plannedTreatmentType>");
			sb.append(this.getPlannedTreatmentType().toXMLString()); 
			sb.append("</plannedTreatmentType>");		
		}
		if (this.getOrganisationPlanned() != null)
		{
			sb.append("<organisationPlanned>");
			sb.append(this.getOrganisationPlanned().toXMLString()); 
			sb.append("</organisationPlanned>");		
		}
		if (this.getActualTreatmentDate() != null)
		{
			sb.append("<actualTreatmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getActualTreatmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</actualTreatmentDate>");		
		}
		if (this.getActualTreatmentType() != null)
		{
			sb.append("<actualTreatmentType>");
			sb.append(this.getActualTreatmentType().toXMLString()); 
			sb.append("</actualTreatmentType>");		
		}
		if (this.getOrganisationOrganised() != null)
		{
			sb.append("<organisationOrganised>");
			sb.append(this.getOrganisationOrganised().toXMLString()); 
			sb.append("</organisationOrganised>");		
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
			ActualPlanDetails domainObject = getActualPlanDetailsfromXML(itemEl, factory, domMap);

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
			ActualPlanDetails domainObject = getActualPlanDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ActualPlanDetails getActualPlanDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActualPlanDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActualPlanDetails getActualPlanDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActualPlanDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActualPlanDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActualPlanDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActualPlanDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActualPlanDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActualPlanDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActualPlanDetails)factory.getImportedDomainObject(ActualPlanDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActualPlanDetails();
		}
		String keyClassName = "ActualPlanDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActualPlanDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActualPlanDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateDecisionToTreat");
		if(fldEl != null)
		{	
    		obj.setDateDecisionToTreat(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("plannedTreatmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlannedTreatmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("organisationPlanned");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrganisationPlanned(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("actualTreatmentDate");
		if(fldEl != null)
		{	
    		obj.setActualTreatmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("actualTreatmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActualTreatmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("organisationOrganised");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrganisationOrganised(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CareContext = "careContext";
		public static final String DateDecisionToTreat = "dateDecisionToTreat";
		public static final String PlannedTreatmentType = "plannedTreatmentType";
		public static final String OrganisationPlanned = "organisationPlanned";
		public static final String ActualTreatmentDate = "actualTreatmentDate";
		public static final String ActualTreatmentType = "actualTreatmentType";
		public static final String OrganisationOrganised = "organisationOrganised";
	}
}

