/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class TCIOutcomeForPatientElectiveList extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100068;
	private static final long serialVersionUID = 1096100068L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Outcome */
	private ims.domain.lookups.LookupInstance outcome;
	/** Change By */
	private ims.core.resource.people.domain.objects.MemberOfStaff changeBy;
	/** Status Date Time */
	private java.util.Date statusDateTime;
	/** Status Change Reason */
	private ims.domain.lookups.LookupInstance outcomeReason;
	/** Was TCI Cancelled for non-medical reason */
	private Boolean cancelledForNonMedicalReason;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TCIOutcomeForPatientElectiveList (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TCIOutcomeForPatientElectiveList ()
    {
    	super();
    }
    public TCIOutcomeForPatientElectiveList (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList.class;
	}


	public ims.domain.lookups.LookupInstance getOutcome() {
		return outcome;
	}
	public void setOutcome(ims.domain.lookups.LookupInstance outcome) {
		this.outcome = outcome;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getChangeBy() {
		return changeBy;
	}
	public void setChangeBy(ims.core.resource.people.domain.objects.MemberOfStaff changeBy) {
		this.changeBy = changeBy;
	}

	public java.util.Date getStatusDateTime() {
		return statusDateTime;
	}
	public void setStatusDateTime(java.util.Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public ims.domain.lookups.LookupInstance getOutcomeReason() {
		return outcomeReason;
	}
	public void setOutcomeReason(ims.domain.lookups.LookupInstance outcomeReason) {
		this.outcomeReason = outcomeReason;
	}

	public Boolean isCancelledForNonMedicalReason() {
		return cancelledForNonMedicalReason;
	}
	public void setCancelledForNonMedicalReason(Boolean cancelledForNonMedicalReason) {
		this.cancelledForNonMedicalReason = cancelledForNonMedicalReason;
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
		
		auditStr.append("\r\n*outcome* :");
		if (outcome != null)
			auditStr.append(outcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*changeBy* :");
		if (changeBy != null)
		{
			auditStr.append(toShortClassName(changeBy));
				
		    auditStr.append(changeBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusDateTime* :");
		auditStr.append(statusDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeReason* :");
		if (outcomeReason != null)
			auditStr.append(outcomeReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledForNonMedicalReason* :");
		auditStr.append(cancelledForNonMedicalReason);
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
		
		String keyClassName = "TCIOutcomeForPatientElectiveList";
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
		if (this.getOutcome() != null)
		{
			sb.append("<outcome>");
			sb.append(this.getOutcome().toXMLString()); 
			sb.append("</outcome>");		
		}
		if (this.getChangeBy() != null)
		{
			sb.append("<changeBy>");
			sb.append(this.getChangeBy().toXMLString(domMap)); 	
			sb.append("</changeBy>");		
		}
		if (this.getStatusDateTime() != null)
		{
			sb.append("<statusDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusDateTime>");		
		}
		if (this.getOutcomeReason() != null)
		{
			sb.append("<outcomeReason>");
			sb.append(this.getOutcomeReason().toXMLString()); 
			sb.append("</outcomeReason>");		
		}
		if (this.isCancelledForNonMedicalReason() != null)
		{
			sb.append("<cancelledForNonMedicalReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCancelledForNonMedicalReason().toString()));
			sb.append("</cancelledForNonMedicalReason>");		
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
			TCIOutcomeForPatientElectiveList domainObject = getTCIOutcomeForPatientElectiveListfromXML(itemEl, factory, domMap);

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
			TCIOutcomeForPatientElectiveList domainObject = getTCIOutcomeForPatientElectiveListfromXML(itemEl, factory, domMap);

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
		
	public static TCIOutcomeForPatientElectiveList getTCIOutcomeForPatientElectiveListfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTCIOutcomeForPatientElectiveListfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TCIOutcomeForPatientElectiveList getTCIOutcomeForPatientElectiveListfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TCIOutcomeForPatientElectiveList.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TCIOutcomeForPatientElectiveList.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TCIOutcomeForPatientElectiveList class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TCIOutcomeForPatientElectiveList)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TCIOutcomeForPatientElectiveList.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TCIOutcomeForPatientElectiveList ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TCIOutcomeForPatientElectiveList)factory.getImportedDomainObject(TCIOutcomeForPatientElectiveList.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TCIOutcomeForPatientElectiveList();
		}
		String keyClassName = "TCIOutcomeForPatientElectiveList";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TCIOutcomeForPatientElectiveList)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TCIOutcomeForPatientElectiveList obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("outcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("changeBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setChangeBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusDateTime");
		if(fldEl != null)
		{	
    		obj.setStatusDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("outcomeReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcomeReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancelledForNonMedicalReason");
		if(fldEl != null)
		{	
    		obj.setCancelledForNonMedicalReason(new Boolean(fldEl.getTextTrim()));	
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
		public static final String Outcome = "outcome";
		public static final String ChangeBy = "changeBy";
		public static final String StatusDateTime = "statusDateTime";
		public static final String OutcomeReason = "outcomeReason";
		public static final String CancelledForNonMedicalReason = "cancelledForNonMedicalReason";
	}
}

