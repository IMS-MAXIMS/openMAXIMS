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
 * @author Neil McAnaspie
 * Generated.
 */


public class FurtherManagement extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100018;
	private static final long serialVersionUID = 1096100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Followup Management Type */
	private ims.domain.lookups.LookupInstance followupType;
	/** Further Management Plan for CATS */
	private String furtherManagementByCATS;
	/** Number of TLT sessions */
	private Integer noOfTltSessions;
	/** TLTNotes */
	private String tLTNotes;
	/** AnotherConsultationAppt */
	private ims.domain.lookups.LookupInstance anotherConsultationAppt;
	/** Procedure */
	private ims.core.clinical.domain.objects.Procedure procedure;
	/** No of Days */
	private Integer procedureNoOfDays;
	/** Medically Incomplete Reason */
	private ims.domain.lookups.LookupInstance medicallyIncomplete;
	/** Medically Incomplete No of Days */
	private Integer incompleteNoOfDays;
	/** TLT Type */
	private ims.domain.lookups.LookupInstance tLTType;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FurtherManagement (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FurtherManagement ()
    {
    	super();
    }
    public FurtherManagement (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.FurtherManagement.class;
	}


	public ims.domain.lookups.LookupInstance getFollowupType() {
		return followupType;
	}
	public void setFollowupType(ims.domain.lookups.LookupInstance followupType) {
		this.followupType = followupType;
	}

	public String getFurtherManagementByCATS() {
		return furtherManagementByCATS;
	}
	public void setFurtherManagementByCATS(String furtherManagementByCATS) {
		this.furtherManagementByCATS = furtherManagementByCATS;
	}

	public Integer getNoOfTltSessions() {
		return noOfTltSessions;
	}
	public void setNoOfTltSessions(Integer noOfTltSessions) {
		this.noOfTltSessions = noOfTltSessions;
	}

	public String getTLTNotes() {
		return tLTNotes;
	}
	public void setTLTNotes(String tLTNotes) {
		this.tLTNotes = tLTNotes;
	}

	public ims.domain.lookups.LookupInstance getAnotherConsultationAppt() {
		return anotherConsultationAppt;
	}
	public void setAnotherConsultationAppt(ims.domain.lookups.LookupInstance anotherConsultationAppt) {
		this.anotherConsultationAppt = anotherConsultationAppt;
	}

	public ims.core.clinical.domain.objects.Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.Procedure procedure) {
		this.procedure = procedure;
	}

	public Integer getProcedureNoOfDays() {
		return procedureNoOfDays;
	}
	public void setProcedureNoOfDays(Integer procedureNoOfDays) {
		this.procedureNoOfDays = procedureNoOfDays;
	}

	public ims.domain.lookups.LookupInstance getMedicallyIncomplete() {
		return medicallyIncomplete;
	}
	public void setMedicallyIncomplete(ims.domain.lookups.LookupInstance medicallyIncomplete) {
		this.medicallyIncomplete = medicallyIncomplete;
	}

	public Integer getIncompleteNoOfDays() {
		return incompleteNoOfDays;
	}
	public void setIncompleteNoOfDays(Integer incompleteNoOfDays) {
		this.incompleteNoOfDays = incompleteNoOfDays;
	}

	public ims.domain.lookups.LookupInstance getTLTType() {
		return tLTType;
	}
	public void setTLTType(ims.domain.lookups.LookupInstance tLTType) {
		this.tLTType = tLTType;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*followupType* :");
		if (followupType != null)
			auditStr.append(followupType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*furtherManagementByCATS* :");
		auditStr.append(furtherManagementByCATS);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfTltSessions* :");
		auditStr.append(noOfTltSessions);
	    auditStr.append("; ");
		auditStr.append("\r\n*tLTNotes* :");
		auditStr.append(tLTNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*anotherConsultationAppt* :");
		if (anotherConsultationAppt != null)
			auditStr.append(anotherConsultationAppt.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureNoOfDays* :");
		auditStr.append(procedureNoOfDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicallyIncomplete* :");
		if (medicallyIncomplete != null)
			auditStr.append(medicallyIncomplete.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*incompleteNoOfDays* :");
		auditStr.append(incompleteNoOfDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*tLTType* :");
		if (tLTType != null)
			auditStr.append(tLTType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "FurtherManagement";
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
		if (this.getFollowupType() != null)
		{
			sb.append("<followupType>");
			sb.append(this.getFollowupType().toXMLString()); 
			sb.append("</followupType>");		
		}
		if (this.getFurtherManagementByCATS() != null)
		{
			sb.append("<furtherManagementByCATS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFurtherManagementByCATS().toString()));
			sb.append("</furtherManagementByCATS>");		
		}
		if (this.getNoOfTltSessions() != null)
		{
			sb.append("<noOfTltSessions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfTltSessions().toString()));
			sb.append("</noOfTltSessions>");		
		}
		if (this.getTLTNotes() != null)
		{
			sb.append("<tLTNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTLTNotes().toString()));
			sb.append("</tLTNotes>");		
		}
		if (this.getAnotherConsultationAppt() != null)
		{
			sb.append("<anotherConsultationAppt>");
			sb.append(this.getAnotherConsultationAppt().toXMLString()); 
			sb.append("</anotherConsultationAppt>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getProcedureNoOfDays() != null)
		{
			sb.append("<procedureNoOfDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureNoOfDays().toString()));
			sb.append("</procedureNoOfDays>");		
		}
		if (this.getMedicallyIncomplete() != null)
		{
			sb.append("<medicallyIncomplete>");
			sb.append(this.getMedicallyIncomplete().toXMLString()); 
			sb.append("</medicallyIncomplete>");		
		}
		if (this.getIncompleteNoOfDays() != null)
		{
			sb.append("<incompleteNoOfDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIncompleteNoOfDays().toString()));
			sb.append("</incompleteNoOfDays>");		
		}
		if (this.getTLTType() != null)
		{
			sb.append("<tLTType>");
			sb.append(this.getTLTType().toXMLString()); 
			sb.append("</tLTType>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			FurtherManagement domainObject = getFurtherManagementfromXML(itemEl, factory, domMap);

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
			FurtherManagement domainObject = getFurtherManagementfromXML(itemEl, factory, domMap);

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
		
	public static FurtherManagement getFurtherManagementfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFurtherManagementfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FurtherManagement getFurtherManagementfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FurtherManagement.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FurtherManagement.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FurtherManagement class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FurtherManagement)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FurtherManagement.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FurtherManagement ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FurtherManagement)factory.getImportedDomainObject(FurtherManagement.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FurtherManagement();
		}
		String keyClassName = "FurtherManagement";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FurtherManagement)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FurtherManagement obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("followupType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowupType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("furtherManagementByCATS");
		if(fldEl != null)
		{	
    		obj.setFurtherManagementByCATS(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfTltSessions");
		if(fldEl != null)
		{	
    		obj.setNoOfTltSessions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tLTNotes");
		if(fldEl != null)
		{	
    		obj.setTLTNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anotherConsultationAppt");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnotherConsultationAppt(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureNoOfDays");
		if(fldEl != null)
		{	
    		obj.setProcedureNoOfDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicallyIncomplete");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMedicallyIncomplete(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("incompleteNoOfDays");
		if(fldEl != null)
		{	
    		obj.setIncompleteNoOfDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tLTType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTLTType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String FollowupType = "followupType";
		public static final String FurtherManagementByCATS = "furtherManagementByCATS";
		public static final String NoOfTltSessions = "noOfTltSessions";
		public static final String TLTNotes = "tLTNotes";
		public static final String AnotherConsultationAppt = "anotherConsultationAppt";
		public static final String Procedure = "procedure";
		public static final String ProcedureNoOfDays = "procedureNoOfDays";
		public static final String MedicallyIncomplete = "medicallyIncomplete";
		public static final String IncompleteNoOfDays = "incompleteNoOfDays";
		public static final String TLTType = "tLTType";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String RecordingInformation = "recordingInformation";
	}
}

