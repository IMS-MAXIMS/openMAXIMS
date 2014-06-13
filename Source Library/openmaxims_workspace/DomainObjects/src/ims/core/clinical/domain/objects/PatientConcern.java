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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientConcern extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1024100000;
	private static final long serialVersionUID = 1024100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Collection of associated Medical Problems
	  * Collection of ims.core.clinical.domain.objects.PatientProblem.
	  */
	private java.util.Set assocProblem;
	/** Description of Concern */
	private String concernDescription;
	/** Date and Time Concern Identified */
	private java.util.Date dateTimeIdentified;
	/** Multidisciplinary team who identified problem */
	private ims.domain.lookups.LookupInstance teamIdentified;
	/** Member Of Team who Identified Concern */
	private ims.core.resource.people.domain.objects.Hcp memberIdentified;
	/** Associated Note */
	private String associatedNote;
	/** Team Allocated To */
	private ims.domain.lookups.LookupInstance allocatedToTeam;
	/** Allocated To Team Member */
	private ims.core.resource.people.domain.objects.Hcp allocToTeamMember;
	/** Date and Time Allocated */
	private java.util.Date dateTimeAllocated;
	/** Status Of Concern */
	private ims.domain.lookups.LookupInstance concernStatus;
	/** RecordingHCP */
	private ims.core.resource.people.domain.objects.Hcp recordingHCP;
	/** UpdatingHCP */
	private ims.core.resource.people.domain.objects.Hcp updatingHCP;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientConcern (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientConcern ()
    {
    	super();
    }
    public PatientConcern (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientConcern.class;
	}


	public java.util.Set getAssocProblem() {
		if ( null == assocProblem ) {
			assocProblem = new java.util.HashSet();
		}
		return assocProblem;
	}
	public void setAssocProblem(java.util.Set paramValue) {
		this.assocProblem = paramValue;
	}

	public String getConcernDescription() {
		return concernDescription;
	}
	public void setConcernDescription(String concernDescription) {
		if ( null != concernDescription && concernDescription.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for concernDescription. Tried to set value: "+
				concernDescription);
		}
		this.concernDescription = concernDescription;
	}

	public java.util.Date getDateTimeIdentified() {
		return dateTimeIdentified;
	}
	public void setDateTimeIdentified(java.util.Date dateTimeIdentified) {
		this.dateTimeIdentified = dateTimeIdentified;
	}

	public ims.domain.lookups.LookupInstance getTeamIdentified() {
		return teamIdentified;
	}
	public void setTeamIdentified(ims.domain.lookups.LookupInstance teamIdentified) {
		this.teamIdentified = teamIdentified;
	}

	public ims.core.resource.people.domain.objects.Hcp getMemberIdentified() {
		return memberIdentified;
	}
	public void setMemberIdentified(ims.core.resource.people.domain.objects.Hcp memberIdentified) {
		this.memberIdentified = memberIdentified;
	}

	public String getAssociatedNote() {
		return associatedNote;
	}
	public void setAssociatedNote(String associatedNote) {
		if ( null != associatedNote && associatedNote.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for associatedNote. Tried to set value: "+
				associatedNote);
		}
		this.associatedNote = associatedNote;
	}

	public ims.domain.lookups.LookupInstance getAllocatedToTeam() {
		return allocatedToTeam;
	}
	public void setAllocatedToTeam(ims.domain.lookups.LookupInstance allocatedToTeam) {
		this.allocatedToTeam = allocatedToTeam;
	}

	public ims.core.resource.people.domain.objects.Hcp getAllocToTeamMember() {
		return allocToTeamMember;
	}
	public void setAllocToTeamMember(ims.core.resource.people.domain.objects.Hcp allocToTeamMember) {
		this.allocToTeamMember = allocToTeamMember;
	}

	public java.util.Date getDateTimeAllocated() {
		return dateTimeAllocated;
	}
	public void setDateTimeAllocated(java.util.Date dateTimeAllocated) {
		this.dateTimeAllocated = dateTimeAllocated;
	}

	public ims.domain.lookups.LookupInstance getConcernStatus() {
		return concernStatus;
	}
	public void setConcernStatus(ims.domain.lookups.LookupInstance concernStatus) {
		this.concernStatus = concernStatus;
	}

	public ims.core.resource.people.domain.objects.Hcp getRecordingHCP() {
		return recordingHCP;
	}
	public void setRecordingHCP(ims.core.resource.people.domain.objects.Hcp recordingHCP) {
		this.recordingHCP = recordingHCP;
	}

	public ims.core.resource.people.domain.objects.Hcp getUpdatingHCP() {
		return updatingHCP;
	}
	public void setUpdatingHCP(ims.core.resource.people.domain.objects.Hcp updatingHCP) {
		this.updatingHCP = updatingHCP;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		
		auditStr.append("\r\n*assocProblem* :");
		if (assocProblem != null)
		{
			java.util.Iterator it1 = assocProblem.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientProblem obj = (ims.core.clinical.domain.objects.PatientProblem)it1.next();
		if (obj != null)
		{
		   if (i1 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*concernDescription* :");
		auditStr.append(concernDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeIdentified* :");
		auditStr.append(dateTimeIdentified);
	    auditStr.append("; ");
		auditStr.append("\r\n*teamIdentified* :");
		if (teamIdentified != null)
			auditStr.append(teamIdentified.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*memberIdentified* :");
		if (memberIdentified != null)
		{
			auditStr.append(toShortClassName(memberIdentified));
				
		    auditStr.append(memberIdentified.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedNote* :");
		auditStr.append(associatedNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedToTeam* :");
		if (allocatedToTeam != null)
			auditStr.append(allocatedToTeam.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allocToTeamMember* :");
		if (allocToTeamMember != null)
		{
			auditStr.append(toShortClassName(allocToTeamMember));
				
		    auditStr.append(allocToTeamMember.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeAllocated* :");
		auditStr.append(dateTimeAllocated);
	    auditStr.append("; ");
		auditStr.append("\r\n*concernStatus* :");
		if (concernStatus != null)
			auditStr.append(concernStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingHCP* :");
		if (recordingHCP != null)
		{
			auditStr.append(toShortClassName(recordingHCP));
				
		    auditStr.append(recordingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*updatingHCP* :");
		if (updatingHCP != null)
		{
			auditStr.append(toShortClassName(updatingHCP));
				
		    auditStr.append(updatingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "PatientConcern";
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
		if (this.getAssocProblem() != null)
		{
			if (this.getAssocProblem().size() > 0 )
			{
			sb.append("<assocProblem>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssocProblem(), domMap));
			sb.append("</assocProblem>");		
			}
		}
		if (this.getConcernDescription() != null)
		{
			sb.append("<concernDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConcernDescription().toString()));
			sb.append("</concernDescription>");		
		}
		if (this.getDateTimeIdentified() != null)
		{
			sb.append("<dateTimeIdentified>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeIdentified()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeIdentified>");		
		}
		if (this.getTeamIdentified() != null)
		{
			sb.append("<teamIdentified>");
			sb.append(this.getTeamIdentified().toXMLString()); 
			sb.append("</teamIdentified>");		
		}
		if (this.getMemberIdentified() != null)
		{
			sb.append("<memberIdentified>");
			sb.append(this.getMemberIdentified().toXMLString(domMap)); 	
			sb.append("</memberIdentified>");		
		}
		if (this.getAssociatedNote() != null)
		{
			sb.append("<associatedNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssociatedNote().toString()));
			sb.append("</associatedNote>");		
		}
		if (this.getAllocatedToTeam() != null)
		{
			sb.append("<allocatedToTeam>");
			sb.append(this.getAllocatedToTeam().toXMLString()); 
			sb.append("</allocatedToTeam>");		
		}
		if (this.getAllocToTeamMember() != null)
		{
			sb.append("<allocToTeamMember>");
			sb.append(this.getAllocToTeamMember().toXMLString(domMap)); 	
			sb.append("</allocToTeamMember>");		
		}
		if (this.getDateTimeAllocated() != null)
		{
			sb.append("<dateTimeAllocated>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeAllocated()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeAllocated>");		
		}
		if (this.getConcernStatus() != null)
		{
			sb.append("<concernStatus>");
			sb.append(this.getConcernStatus().toXMLString()); 
			sb.append("</concernStatus>");		
		}
		if (this.getRecordingHCP() != null)
		{
			sb.append("<recordingHCP>");
			sb.append(this.getRecordingHCP().toXMLString(domMap)); 	
			sb.append("</recordingHCP>");		
		}
		if (this.getUpdatingHCP() != null)
		{
			sb.append("<updatingHCP>");
			sb.append(this.getUpdatingHCP().toXMLString(domMap)); 	
			sb.append("</updatingHCP>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			PatientConcern domainObject = getPatientConcernfromXML(itemEl, factory, domMap);

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
			PatientConcern domainObject = getPatientConcernfromXML(itemEl, factory, domMap);

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
		
	public static PatientConcern getPatientConcernfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientConcernfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientConcern getPatientConcernfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientConcern.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientConcern.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientConcern class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientConcern)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientConcern.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientConcern ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientConcern)factory.getImportedDomainObject(PatientConcern.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientConcern();
		}
		String keyClassName = "PatientConcern";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientConcern)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientConcern obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("assocProblem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssocProblem(ims.core.clinical.domain.objects.PatientProblem.fromSetXMLString(fldEl, factory, obj.getAssocProblem(), domMap));
		}
		fldEl = el.element("concernDescription");
		if(fldEl != null)
		{	
    		obj.setConcernDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateTimeIdentified");
		if(fldEl != null)
		{	
    		obj.setDateTimeIdentified(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("teamIdentified");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTeamIdentified(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("memberIdentified");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMemberIdentified(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("associatedNote");
		if(fldEl != null)
		{	
    		obj.setAssociatedNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allocatedToTeam");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAllocatedToTeam(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allocToTeamMember");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocToTeamMember(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateTimeAllocated");
		if(fldEl != null)
		{	
    		obj.setDateTimeAllocated(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("concernStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConcernStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("updatingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setUpdatingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assocProblem"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AssocProblem = "assocProblem";
		public static final String ConcernDescription = "concernDescription";
		public static final String DateTimeIdentified = "dateTimeIdentified";
		public static final String TeamIdentified = "teamIdentified";
		public static final String MemberIdentified = "memberIdentified";
		public static final String AssociatedNote = "associatedNote";
		public static final String AllocatedToTeam = "allocatedToTeam";
		public static final String AllocToTeamMember = "allocToTeamMember";
		public static final String DateTimeAllocated = "dateTimeAllocated";
		public static final String ConcernStatus = "concernStatus";
		public static final String RecordingHCP = "recordingHCP";
		public static final String UpdatingHCP = "updatingHCP";
		public static final String CareContext = "careContext";
	}
}

