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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientCaseNoteTransfer extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100132;
	private static final long serialVersionUID = 1003100132L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CaseNote */
	private ims.core.clinical.domain.objects.PatientCaseNote caseNote;
	/** Transferred From Location */
	private ims.core.resource.place.domain.objects.Location transferredFromLocation;
	/** Transferred To  Location */
	private ims.core.resource.place.domain.objects.Location transferredToLocation;
	/** Transferred By */
	private ims.core.resource.people.domain.objects.MemberOfStaff transferredBy;
	/** Transfer Date */
	private java.util.Date transferDate;
	/** ReasonForTransfer */
	private ims.domain.lookups.LookupInstance reasonForTransfer;
	/** Transfer Comment */
	private ims.core.clinical.domain.objects.PatientCaseNoteComment tansferComment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCaseNoteTransfer (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCaseNoteTransfer ()
    {
    	super();
    }
    public PatientCaseNoteTransfer (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientCaseNoteTransfer.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.PatientCaseNote getCaseNote() {
		return caseNote;
	}
	public void setCaseNote(ims.core.clinical.domain.objects.PatientCaseNote caseNote) {
		this.caseNote = caseNote;
	}

	public ims.core.resource.place.domain.objects.Location getTransferredFromLocation() {
		return transferredFromLocation;
	}
	public void setTransferredFromLocation(ims.core.resource.place.domain.objects.Location transferredFromLocation) {
		this.transferredFromLocation = transferredFromLocation;
	}

	public ims.core.resource.place.domain.objects.Location getTransferredToLocation() {
		return transferredToLocation;
	}
	public void setTransferredToLocation(ims.core.resource.place.domain.objects.Location transferredToLocation) {
		this.transferredToLocation = transferredToLocation;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getTransferredBy() {
		return transferredBy;
	}
	public void setTransferredBy(ims.core.resource.people.domain.objects.MemberOfStaff transferredBy) {
		this.transferredBy = transferredBy;
	}

	public java.util.Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(java.util.Date transferDate) {
		this.transferDate = transferDate;
	}

	public ims.domain.lookups.LookupInstance getReasonForTransfer() {
		return reasonForTransfer;
	}
	public void setReasonForTransfer(ims.domain.lookups.LookupInstance reasonForTransfer) {
		this.reasonForTransfer = reasonForTransfer;
	}

	public ims.core.clinical.domain.objects.PatientCaseNoteComment getTansferComment() {
		return tansferComment;
	}
	public void setTansferComment(ims.core.clinical.domain.objects.PatientCaseNoteComment tansferComment) {
		this.tansferComment = tansferComment;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*caseNote* :");
		if (caseNote != null)
		{
			auditStr.append(toShortClassName(caseNote));
				
		    auditStr.append(caseNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transferredFromLocation* :");
		if (transferredFromLocation != null)
		{
			auditStr.append(toShortClassName(transferredFromLocation));
				
		    auditStr.append(transferredFromLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transferredToLocation* :");
		if (transferredToLocation != null)
		{
			auditStr.append(toShortClassName(transferredToLocation));
				
		    auditStr.append(transferredToLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transferredBy* :");
		if (transferredBy != null)
		{
			auditStr.append(toShortClassName(transferredBy));
				
		    auditStr.append(transferredBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transferDate* :");
		auditStr.append(transferDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForTransfer* :");
		if (reasonForTransfer != null)
			auditStr.append(reasonForTransfer.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tansferComment* :");
		if (tansferComment != null)
		{
			auditStr.append(toShortClassName(tansferComment));
				
		    auditStr.append(tansferComment.getId());
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
		
		String keyClassName = "PatientCaseNoteTransfer";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCaseNote() != null)
		{
			sb.append("<caseNote>");
			sb.append(this.getCaseNote().toXMLString(domMap)); 	
			sb.append("</caseNote>");		
		}
		if (this.getTransferredFromLocation() != null)
		{
			sb.append("<transferredFromLocation>");
			sb.append(this.getTransferredFromLocation().toXMLString(domMap)); 	
			sb.append("</transferredFromLocation>");		
		}
		if (this.getTransferredToLocation() != null)
		{
			sb.append("<transferredToLocation>");
			sb.append(this.getTransferredToLocation().toXMLString(domMap)); 	
			sb.append("</transferredToLocation>");		
		}
		if (this.getTransferredBy() != null)
		{
			sb.append("<transferredBy>");
			sb.append(this.getTransferredBy().toXMLString(domMap)); 	
			sb.append("</transferredBy>");		
		}
		if (this.getTransferDate() != null)
		{
			sb.append("<transferDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTransferDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transferDate>");		
		}
		if (this.getReasonForTransfer() != null)
		{
			sb.append("<reasonForTransfer>");
			sb.append(this.getReasonForTransfer().toXMLString()); 
			sb.append("</reasonForTransfer>");		
		}
		if (this.getTansferComment() != null)
		{
			sb.append("<tansferComment>");
			sb.append(this.getTansferComment().toXMLString(domMap)); 	
			sb.append("</tansferComment>");		
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
			PatientCaseNoteTransfer domainObject = getPatientCaseNoteTransferfromXML(itemEl, factory, domMap);

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
			PatientCaseNoteTransfer domainObject = getPatientCaseNoteTransferfromXML(itemEl, factory, domMap);

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
		
	public static PatientCaseNoteTransfer getPatientCaseNoteTransferfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCaseNoteTransferfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCaseNoteTransfer getPatientCaseNoteTransferfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCaseNoteTransfer.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCaseNoteTransfer.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCaseNoteTransfer class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCaseNoteTransfer)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCaseNoteTransfer.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCaseNoteTransfer ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCaseNoteTransfer)factory.getImportedDomainObject(PatientCaseNoteTransfer.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCaseNoteTransfer();
		}
		String keyClassName = "PatientCaseNoteTransfer";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCaseNoteTransfer)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCaseNoteTransfer obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCaseNote(ims.core.clinical.domain.objects.PatientCaseNote.getPatientCaseNotefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transferredFromLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferredFromLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transferredToLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferredToLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transferredBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferredBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transferDate");
		if(fldEl != null)
		{	
    		obj.setTransferDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForTransfer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForTransfer(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tansferComment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTansferComment(ims.core.clinical.domain.objects.PatientCaseNoteComment.getPatientCaseNoteCommentfromXML(fldEl, factory, domMap)); 
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
		public static final String Patient = "patient";
		public static final String CaseNote = "caseNote";
		public static final String TransferredFromLocation = "transferredFromLocation";
		public static final String TransferredToLocation = "transferredToLocation";
		public static final String TransferredBy = "transferredBy";
		public static final String TransferDate = "transferDate";
		public static final String ReasonForTransfer = "reasonForTransfer";
		public static final String TansferComment = "tansferComment";
	}
}

