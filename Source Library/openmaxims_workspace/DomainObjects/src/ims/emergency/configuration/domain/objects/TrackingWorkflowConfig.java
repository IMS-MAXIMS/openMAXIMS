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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author George Cristian Josan
 * Generated.
 */


public class TrackingWorkflowConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100026;
	private static final long serialVersionUID = 1087100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance trackingStatus;
	private Boolean recordsConclusionDateTime;
	private Boolean triggersPreAdmissionPas;
	private Boolean recordsEdAttendanceDeparture;
	private Boolean continueDisplayInTracking;
	private Boolean createNewCareContext;
	private ims.domain.lookups.LookupInstance dischargeOutcome;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TrackingWorkflowConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TrackingWorkflowConfig ()
    {
    	super();
    }
    public TrackingWorkflowConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.TrackingWorkflowConfig.class;
	}


	public ims.domain.lookups.LookupInstance getTrackingStatus() {
		return trackingStatus;
	}
	public static TrackingWorkflowConfig getTrackingWorkflowConfigFromTrackingStatus(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from TrackingWorkflowConfig c where c.trackingStatus.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. TrackingWorkflowConfig.trackingStatus.id = " + id + " returned " + l.size() + " records. " );
		return (TrackingWorkflowConfig)l.get(0);
	}
	public void setTrackingStatus(ims.domain.lookups.LookupInstance trackingStatus) {
		this.trackingStatus = trackingStatus;
	}

	public Boolean isRecordsConclusionDateTime() {
		return recordsConclusionDateTime;
	}
	public void setRecordsConclusionDateTime(Boolean recordsConclusionDateTime) {
		this.recordsConclusionDateTime = recordsConclusionDateTime;
	}

	public Boolean isTriggersPreAdmissionPas() {
		return triggersPreAdmissionPas;
	}
	public void setTriggersPreAdmissionPas(Boolean triggersPreAdmissionPas) {
		this.triggersPreAdmissionPas = triggersPreAdmissionPas;
	}

	public Boolean isRecordsEdAttendanceDeparture() {
		return recordsEdAttendanceDeparture;
	}
	public void setRecordsEdAttendanceDeparture(Boolean recordsEdAttendanceDeparture) {
		this.recordsEdAttendanceDeparture = recordsEdAttendanceDeparture;
	}

	public Boolean isContinueDisplayInTracking() {
		return continueDisplayInTracking;
	}
	public void setContinueDisplayInTracking(Boolean continueDisplayInTracking) {
		this.continueDisplayInTracking = continueDisplayInTracking;
	}

	public Boolean isCreateNewCareContext() {
		return createNewCareContext;
	}
	public void setCreateNewCareContext(Boolean createNewCareContext) {
		this.createNewCareContext = createNewCareContext;
	}

	public ims.domain.lookups.LookupInstance getDischargeOutcome() {
		return dischargeOutcome;
	}
	public void setDischargeOutcome(ims.domain.lookups.LookupInstance dischargeOutcome) {
		this.dischargeOutcome = dischargeOutcome;
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
		
		auditStr.append("\r\n*trackingStatus* :");
		if (trackingStatus != null)
			auditStr.append(trackingStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordsConclusionDateTime* :");
		auditStr.append(recordsConclusionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*triggersPreAdmissionPas* :");
		auditStr.append(triggersPreAdmissionPas);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordsEdAttendanceDeparture* :");
		auditStr.append(recordsEdAttendanceDeparture);
	    auditStr.append("; ");
		auditStr.append("\r\n*continueDisplayInTracking* :");
		auditStr.append(continueDisplayInTracking);
	    auditStr.append("; ");
		auditStr.append("\r\n*createNewCareContext* :");
		auditStr.append(createNewCareContext);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeOutcome* :");
		if (dischargeOutcome != null)
			auditStr.append(dischargeOutcome.getText());
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
		
		String keyClassName = "TrackingWorkflowConfig";
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
		if (this.getTrackingStatus() != null)
		{
			sb.append("<trackingStatus>");
			sb.append(this.getTrackingStatus().toXMLString()); 
			sb.append("</trackingStatus>");		
		}
		if (this.isRecordsConclusionDateTime() != null)
		{
			sb.append("<recordsConclusionDateTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecordsConclusionDateTime().toString()));
			sb.append("</recordsConclusionDateTime>");		
		}
		if (this.isTriggersPreAdmissionPas() != null)
		{
			sb.append("<triggersPreAdmissionPas>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTriggersPreAdmissionPas().toString()));
			sb.append("</triggersPreAdmissionPas>");		
		}
		if (this.isRecordsEdAttendanceDeparture() != null)
		{
			sb.append("<recordsEdAttendanceDeparture>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRecordsEdAttendanceDeparture().toString()));
			sb.append("</recordsEdAttendanceDeparture>");		
		}
		if (this.isContinueDisplayInTracking() != null)
		{
			sb.append("<continueDisplayInTracking>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isContinueDisplayInTracking().toString()));
			sb.append("</continueDisplayInTracking>");		
		}
		if (this.isCreateNewCareContext() != null)
		{
			sb.append("<createNewCareContext>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCreateNewCareContext().toString()));
			sb.append("</createNewCareContext>");		
		}
		if (this.getDischargeOutcome() != null)
		{
			sb.append("<dischargeOutcome>");
			sb.append(this.getDischargeOutcome().toXMLString()); 
			sb.append("</dischargeOutcome>");		
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
			TrackingWorkflowConfig domainObject = getTrackingWorkflowConfigfromXML(itemEl, factory, domMap);

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
			TrackingWorkflowConfig domainObject = getTrackingWorkflowConfigfromXML(itemEl, factory, domMap);

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
		
	public static TrackingWorkflowConfig getTrackingWorkflowConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTrackingWorkflowConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TrackingWorkflowConfig getTrackingWorkflowConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TrackingWorkflowConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TrackingWorkflowConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TrackingWorkflowConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TrackingWorkflowConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TrackingWorkflowConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TrackingWorkflowConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TrackingWorkflowConfig)factory.getImportedDomainObject(TrackingWorkflowConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TrackingWorkflowConfig();
		}
		String keyClassName = "TrackingWorkflowConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TrackingWorkflowConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TrackingWorkflowConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("trackingStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTrackingStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordsConclusionDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordsConclusionDateTime(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("triggersPreAdmissionPas");
		if(fldEl != null)
		{	
    		obj.setTriggersPreAdmissionPas(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordsEdAttendanceDeparture");
		if(fldEl != null)
		{	
    		obj.setRecordsEdAttendanceDeparture(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("continueDisplayInTracking");
		if(fldEl != null)
		{	
    		obj.setContinueDisplayInTracking(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("createNewCareContext");
		if(fldEl != null)
		{	
    		obj.setCreateNewCareContext(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeOutcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String TrackingStatus = "trackingStatus";
		public static final String RecordsConclusionDateTime = "recordsConclusionDateTime";
		public static final String TriggersPreAdmissionPas = "triggersPreAdmissionPas";
		public static final String RecordsEdAttendanceDeparture = "recordsEdAttendanceDeparture";
		public static final String ContinueDisplayInTracking = "continueDisplayInTracking";
		public static final String CreateNewCareContext = "createNewCareContext";
		public static final String DischargeOutcome = "dischargeOutcome";
	}
}

