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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class StatusWorkflowConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100023;
	private static final long serialVersionUID = 1087100023L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Status */
	private ims.domain.lookups.LookupInstance workflowStatus;
	/** CreatesClinicalDischarge */
	private Boolean createsClinicalDischarge;
	/** RequiresPreAdmission */
	private Boolean requiresPreAdmission;
	/** RecordEDDeparture */
	private Boolean recordEDDeparture;
	/** DepartureContinueToDisplay */
	private Boolean departureContinueToDisplay;
	/** DepartureSeperateContextRecord */
	private Boolean departureSeperateContextRecord;
	/** DepartureOutcomeDefault */
	private ims.domain.lookups.LookupInstance departureOutcomeDefault;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public StatusWorkflowConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public StatusWorkflowConfig ()
    {
    	super();
    }
    public StatusWorkflowConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.StatusWorkflowConfig.class;
	}


	public ims.domain.lookups.LookupInstance getWorkflowStatus() {
		return workflowStatus;
	}
	public void setWorkflowStatus(ims.domain.lookups.LookupInstance workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public Boolean isCreatesClinicalDischarge() {
		return createsClinicalDischarge;
	}
	public void setCreatesClinicalDischarge(Boolean createsClinicalDischarge) {
		this.createsClinicalDischarge = createsClinicalDischarge;
	}

	public Boolean isRequiresPreAdmission() {
		return requiresPreAdmission;
	}
	public void setRequiresPreAdmission(Boolean requiresPreAdmission) {
		this.requiresPreAdmission = requiresPreAdmission;
	}

	public Boolean isRecordEDDeparture() {
		return recordEDDeparture;
	}
	public void setRecordEDDeparture(Boolean recordEDDeparture) {
		this.recordEDDeparture = recordEDDeparture;
	}

	public Boolean isDepartureContinueToDisplay() {
		return departureContinueToDisplay;
	}
	public void setDepartureContinueToDisplay(Boolean departureContinueToDisplay) {
		this.departureContinueToDisplay = departureContinueToDisplay;
	}

	public Boolean isDepartureSeperateContextRecord() {
		return departureSeperateContextRecord;
	}
	public void setDepartureSeperateContextRecord(Boolean departureSeperateContextRecord) {
		this.departureSeperateContextRecord = departureSeperateContextRecord;
	}

	public ims.domain.lookups.LookupInstance getDepartureOutcomeDefault() {
		return departureOutcomeDefault;
	}
	public void setDepartureOutcomeDefault(ims.domain.lookups.LookupInstance departureOutcomeDefault) {
		this.departureOutcomeDefault = departureOutcomeDefault;
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
		
		auditStr.append("\r\n*workflowStatus* :");
		if (workflowStatus != null)
			auditStr.append(workflowStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*createsClinicalDischarge* :");
		auditStr.append(createsClinicalDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresPreAdmission* :");
		auditStr.append(requiresPreAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordEDDeparture* :");
		auditStr.append(recordEDDeparture);
	    auditStr.append("; ");
		auditStr.append("\r\n*departureContinueToDisplay* :");
		auditStr.append(departureContinueToDisplay);
	    auditStr.append("; ");
		auditStr.append("\r\n*departureSeperateContextRecord* :");
		auditStr.append(departureSeperateContextRecord);
	    auditStr.append("; ");
		auditStr.append("\r\n*departureOutcomeDefault* :");
		if (departureOutcomeDefault != null)
			auditStr.append(departureOutcomeDefault.getText());
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
		
		String keyClassName = "StatusWorkflowConfig";
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
		if (this.getWorkflowStatus() != null)
		{
			sb.append("<workflowStatus>");
			sb.append(this.getWorkflowStatus().toXMLString()); 
			sb.append("</workflowStatus>");		
		}
		if (this.isCreatesClinicalDischarge() != null)
		{
			sb.append("<createsClinicalDischarge>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCreatesClinicalDischarge().toString()));
			sb.append("</createsClinicalDischarge>");		
		}
		if (this.isRequiresPreAdmission() != null)
		{
			sb.append("<requiresPreAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresPreAdmission().toString()));
			sb.append("</requiresPreAdmission>");		
		}
		if (this.isRecordEDDeparture() != null)
		{
			sb.append("<recordEDDeparture>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecordEDDeparture().toString()));
			sb.append("</recordEDDeparture>");		
		}
		if (this.isDepartureContinueToDisplay() != null)
		{
			sb.append("<departureContinueToDisplay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDepartureContinueToDisplay().toString()));
			sb.append("</departureContinueToDisplay>");		
		}
		if (this.isDepartureSeperateContextRecord() != null)
		{
			sb.append("<departureSeperateContextRecord>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDepartureSeperateContextRecord().toString()));
			sb.append("</departureSeperateContextRecord>");		
		}
		if (this.getDepartureOutcomeDefault() != null)
		{
			sb.append("<departureOutcomeDefault>");
			sb.append(this.getDepartureOutcomeDefault().toXMLString()); 
			sb.append("</departureOutcomeDefault>");		
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
			StatusWorkflowConfig domainObject = getStatusWorkflowConfigfromXML(itemEl, factory, domMap);

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
			StatusWorkflowConfig domainObject = getStatusWorkflowConfigfromXML(itemEl, factory, domMap);

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
		
	public static StatusWorkflowConfig getStatusWorkflowConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getStatusWorkflowConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static StatusWorkflowConfig getStatusWorkflowConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!StatusWorkflowConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!StatusWorkflowConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the StatusWorkflowConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (StatusWorkflowConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(StatusWorkflowConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		StatusWorkflowConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (StatusWorkflowConfig)factory.getImportedDomainObject(StatusWorkflowConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new StatusWorkflowConfig();
		}
		String keyClassName = "StatusWorkflowConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (StatusWorkflowConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, StatusWorkflowConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("workflowStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWorkflowStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("createsClinicalDischarge");
		if(fldEl != null)
		{	
    		obj.setCreatesClinicalDischarge(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresPreAdmission");
		if(fldEl != null)
		{	
    		obj.setRequiresPreAdmission(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordEDDeparture");
		if(fldEl != null)
		{	
    		obj.setRecordEDDeparture(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("departureContinueToDisplay");
		if(fldEl != null)
		{	
    		obj.setDepartureContinueToDisplay(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("departureSeperateContextRecord");
		if(fldEl != null)
		{	
    		obj.setDepartureSeperateContextRecord(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("departureOutcomeDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDepartureOutcomeDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String WorkflowStatus = "workflowStatus";
		public static final String CreatesClinicalDischarge = "createsClinicalDischarge";
		public static final String RequiresPreAdmission = "requiresPreAdmission";
		public static final String RecordEDDeparture = "recordEDDeparture";
		public static final String DepartureContinueToDisplay = "departureContinueToDisplay";
		public static final String DepartureSeperateContextRecord = "departureSeperateContextRecord";
		public static final String DepartureOutcomeDefault = "departureOutcomeDefault";
	}
}

