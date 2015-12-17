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


public class PatientCaseNote extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100130;
	private static final long serialVersionUID = 1003100130L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Type */
	private ims.domain.lookups.LookupInstance type;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Tracking ID */
	private String trackingID;
	/** CurrentLocation */
	private ims.core.resource.place.domain.objects.Location currentLocation;
	/** Created By */
	private ims.core.resource.people.domain.objects.MemberOfStaff createdBy;
	/** Creation Date */
	private java.util.Date creationDate;
	/** Current Comment */
	private ims.core.clinical.domain.objects.PatientCaseNoteComment currentComment;
	/** OpenRequests
	  * Collection of ims.core.clinical.domain.objects.PatientCaseNoteRequest.
	  */
	private java.util.List openRequests;
	/** Archived By */
	private ims.core.resource.people.domain.objects.MemberOfStaff archivedBy;
	/** Archived Date */
	private java.util.Date archivedDate;
	/** ArchivedComment */
	private String archivedComment;
	/** Destroyed By */
	private ims.core.resource.people.domain.objects.MemberOfStaff destroyedBy;
	/** Destroyed Date */
	private java.util.Date destroyedDate;
	/** DestroyedComment */
	private String destroyedComment;
	/** Merged By */
	private ims.core.resource.people.domain.objects.MemberOfStaff mergedBy;
	/** Merged Date */
	private java.util.Date mergedDate;
	/** Merged From */
	private ims.core.clinical.domain.objects.PatientCaseNote mergedFrom;
	/** Scanned By */
	private ims.core.resource.people.domain.objects.MemberOfStaff scannedBy;
	/** Scanned Date */
	private java.util.Date scannedDate;
	/** Scanned Comment */
	private String scannedComment;
	private ims.domain.lookups.LookupInstance folder;
	/** LastTransferDate */
	private java.util.Date lastTransferDate;
	/** LastRequestDate */
	private java.util.Date lastRequestDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCaseNote (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCaseNote ()
    {
    	super();
    }
    public PatientCaseNote (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientCaseNote.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
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

	public String getTrackingID() {
		return trackingID;
	}
	public void setTrackingID(String trackingID) {
		if ( null != trackingID && trackingID.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for trackingID. Tried to set value: "+
				trackingID);
		}
		this.trackingID = trackingID;
	}

	public ims.core.resource.place.domain.objects.Location getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(ims.core.resource.place.domain.objects.Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(ims.core.resource.people.domain.objects.MemberOfStaff createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public ims.core.clinical.domain.objects.PatientCaseNoteComment getCurrentComment() {
		return currentComment;
	}
	public void setCurrentComment(ims.core.clinical.domain.objects.PatientCaseNoteComment currentComment) {
		this.currentComment = currentComment;
	}

	public java.util.List getOpenRequests() {
		if ( null == openRequests ) {
			openRequests = new java.util.ArrayList();
		}
		return openRequests;
	}
	public void setOpenRequests(java.util.List paramValue) {
		this.openRequests = paramValue;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getArchivedBy() {
		return archivedBy;
	}
	public void setArchivedBy(ims.core.resource.people.domain.objects.MemberOfStaff archivedBy) {
		this.archivedBy = archivedBy;
	}

	public java.util.Date getArchivedDate() {
		return archivedDate;
	}
	public void setArchivedDate(java.util.Date archivedDate) {
		this.archivedDate = archivedDate;
	}

	public String getArchivedComment() {
		return archivedComment;
	}
	public void setArchivedComment(String archivedComment) {
		this.archivedComment = archivedComment;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getDestroyedBy() {
		return destroyedBy;
	}
	public void setDestroyedBy(ims.core.resource.people.domain.objects.MemberOfStaff destroyedBy) {
		this.destroyedBy = destroyedBy;
	}

	public java.util.Date getDestroyedDate() {
		return destroyedDate;
	}
	public void setDestroyedDate(java.util.Date destroyedDate) {
		this.destroyedDate = destroyedDate;
	}

	public String getDestroyedComment() {
		return destroyedComment;
	}
	public void setDestroyedComment(String destroyedComment) {
		this.destroyedComment = destroyedComment;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMergedBy() {
		return mergedBy;
	}
	public void setMergedBy(ims.core.resource.people.domain.objects.MemberOfStaff mergedBy) {
		this.mergedBy = mergedBy;
	}

	public java.util.Date getMergedDate() {
		return mergedDate;
	}
	public void setMergedDate(java.util.Date mergedDate) {
		this.mergedDate = mergedDate;
	}

	public ims.core.clinical.domain.objects.PatientCaseNote getMergedFrom() {
		return mergedFrom;
	}
	public void setMergedFrom(ims.core.clinical.domain.objects.PatientCaseNote mergedFrom) {
		this.mergedFrom = mergedFrom;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getScannedBy() {
		return scannedBy;
	}
	public void setScannedBy(ims.core.resource.people.domain.objects.MemberOfStaff scannedBy) {
		this.scannedBy = scannedBy;
	}

	public java.util.Date getScannedDate() {
		return scannedDate;
	}
	public void setScannedDate(java.util.Date scannedDate) {
		this.scannedDate = scannedDate;
	}

	public String getScannedComment() {
		return scannedComment;
	}
	public void setScannedComment(String scannedComment) {
		this.scannedComment = scannedComment;
	}

	public ims.domain.lookups.LookupInstance getFolder() {
		return folder;
	}
	public void setFolder(ims.domain.lookups.LookupInstance folder) {
		this.folder = folder;
	}

	public java.util.Date getLastTransferDate() {
		return lastTransferDate;
	}
	public void setLastTransferDate(java.util.Date lastTransferDate) {
		this.lastTransferDate = lastTransferDate;
	}

	public java.util.Date getLastRequestDate() {
		return lastRequestDate;
	}
	public void setLastRequestDate(java.util.Date lastRequestDate) {
		this.lastRequestDate = lastRequestDate;
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
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*trackingID* :");
		auditStr.append(trackingID);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentLocation* :");
		if (currentLocation != null)
		{
			auditStr.append(toShortClassName(currentLocation));
				
		    auditStr.append(currentLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*createdBy* :");
		if (createdBy != null)
		{
			auditStr.append(toShortClassName(createdBy));
				
		    auditStr.append(createdBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentComment* :");
		if (currentComment != null)
		{
			auditStr.append(toShortClassName(currentComment));
				
		    auditStr.append(currentComment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*openRequests* :");
		if (openRequests != null)
		{
		int i9=0;
		for (i9=0; i9<openRequests.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientCaseNoteRequest obj = (ims.core.clinical.domain.objects.PatientCaseNoteRequest)openRequests.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*archivedBy* :");
		if (archivedBy != null)
		{
			auditStr.append(toShortClassName(archivedBy));
				
		    auditStr.append(archivedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*archivedDate* :");
		auditStr.append(archivedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*archivedComment* :");
		auditStr.append(archivedComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*destroyedBy* :");
		if (destroyedBy != null)
		{
			auditStr.append(toShortClassName(destroyedBy));
				
		    auditStr.append(destroyedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*destroyedDate* :");
		auditStr.append(destroyedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*destroyedComment* :");
		auditStr.append(destroyedComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*mergedBy* :");
		if (mergedBy != null)
		{
			auditStr.append(toShortClassName(mergedBy));
				
		    auditStr.append(mergedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mergedDate* :");
		auditStr.append(mergedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*mergedFrom* :");
		if (mergedFrom != null)
		{
			auditStr.append(toShortClassName(mergedFrom));
				
		    auditStr.append(mergedFrom.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scannedBy* :");
		if (scannedBy != null)
		{
			auditStr.append(toShortClassName(scannedBy));
				
		    auditStr.append(scannedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scannedDate* :");
		auditStr.append(scannedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*scannedComment* :");
		auditStr.append(scannedComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*folder* :");
		if (folder != null)
			auditStr.append(folder.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*lastTransferDate* :");
		auditStr.append(lastTransferDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastRequestDate* :");
		auditStr.append(lastRequestDate);
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
		
		String keyClassName = "PatientCaseNote";
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
		if (this.getTrackingID() != null)
		{
			sb.append("<trackingID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTrackingID().toString()));
			sb.append("</trackingID>");		
		}
		if (this.getCurrentLocation() != null)
		{
			sb.append("<currentLocation>");
			sb.append(this.getCurrentLocation().toXMLString(domMap)); 	
			sb.append("</currentLocation>");		
		}
		if (this.getCreatedBy() != null)
		{
			sb.append("<createdBy>");
			sb.append(this.getCreatedBy().toXMLString(domMap)); 	
			sb.append("</createdBy>");		
		}
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getCurrentComment() != null)
		{
			sb.append("<currentComment>");
			sb.append(this.getCurrentComment().toXMLString(domMap)); 	
			sb.append("</currentComment>");		
		}
		if (this.getOpenRequests() != null)
		{
			if (this.getOpenRequests().size() > 0 )
			{
			sb.append("<openRequests>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOpenRequests(), domMap));
			sb.append("</openRequests>");		
			}
		}
		if (this.getArchivedBy() != null)
		{
			sb.append("<archivedBy>");
			sb.append(this.getArchivedBy().toXMLString(domMap)); 	
			sb.append("</archivedBy>");		
		}
		if (this.getArchivedDate() != null)
		{
			sb.append("<archivedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getArchivedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</archivedDate>");		
		}
		if (this.getArchivedComment() != null)
		{
			sb.append("<archivedComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getArchivedComment().toString()));
			sb.append("</archivedComment>");		
		}
		if (this.getDestroyedBy() != null)
		{
			sb.append("<destroyedBy>");
			sb.append(this.getDestroyedBy().toXMLString(domMap)); 	
			sb.append("</destroyedBy>");		
		}
		if (this.getDestroyedDate() != null)
		{
			sb.append("<destroyedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDestroyedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</destroyedDate>");		
		}
		if (this.getDestroyedComment() != null)
		{
			sb.append("<destroyedComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDestroyedComment().toString()));
			sb.append("</destroyedComment>");		
		}
		if (this.getMergedBy() != null)
		{
			sb.append("<mergedBy>");
			sb.append(this.getMergedBy().toXMLString(domMap)); 	
			sb.append("</mergedBy>");		
		}
		if (this.getMergedDate() != null)
		{
			sb.append("<mergedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getMergedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</mergedDate>");		
		}
		if (this.getMergedFrom() != null)
		{
			sb.append("<mergedFrom>");
			sb.append(this.getMergedFrom().toXMLString(domMap)); 	
			sb.append("</mergedFrom>");		
		}
		if (this.getScannedBy() != null)
		{
			sb.append("<scannedBy>");
			sb.append(this.getScannedBy().toXMLString(domMap)); 	
			sb.append("</scannedBy>");		
		}
		if (this.getScannedDate() != null)
		{
			sb.append("<scannedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getScannedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</scannedDate>");		
		}
		if (this.getScannedComment() != null)
		{
			sb.append("<scannedComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getScannedComment().toString()));
			sb.append("</scannedComment>");		
		}
		if (this.getFolder() != null)
		{
			sb.append("<folder>");
			sb.append(this.getFolder().toXMLString()); 
			sb.append("</folder>");		
		}
		if (this.getLastTransferDate() != null)
		{
			sb.append("<lastTransferDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastTransferDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastTransferDate>");		
		}
		if (this.getLastRequestDate() != null)
		{
			sb.append("<lastRequestDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastRequestDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastRequestDate>");		
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
			PatientCaseNote domainObject = getPatientCaseNotefromXML(itemEl, factory, domMap);

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
			PatientCaseNote domainObject = getPatientCaseNotefromXML(itemEl, factory, domMap);

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
		
	public static PatientCaseNote getPatientCaseNotefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCaseNotefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCaseNote getPatientCaseNotefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCaseNote.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCaseNote.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCaseNote class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCaseNote)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCaseNote.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCaseNote ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCaseNote)factory.getImportedDomainObject(PatientCaseNote.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCaseNote();
		}
		String keyClassName = "PatientCaseNote";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCaseNote)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCaseNote obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("trackingID");
		if(fldEl != null)
		{	
    		obj.setTrackingID(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("createdBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentComment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentComment(ims.core.clinical.domain.objects.PatientCaseNoteComment.getPatientCaseNoteCommentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("openRequests");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOpenRequests(ims.core.clinical.domain.objects.PatientCaseNoteRequest.fromListXMLString(fldEl, factory, obj.getOpenRequests(), domMap));
		}
		fldEl = el.element("archivedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setArchivedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("archivedDate");
		if(fldEl != null)
		{	
    		obj.setArchivedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("archivedComment");
		if(fldEl != null)
		{	
    		obj.setArchivedComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("destroyedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDestroyedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("destroyedDate");
		if(fldEl != null)
		{	
    		obj.setDestroyedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("destroyedComment");
		if(fldEl != null)
		{	
    		obj.setDestroyedComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mergedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMergedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mergedDate");
		if(fldEl != null)
		{	
    		obj.setMergedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("mergedFrom");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMergedFrom(ims.core.clinical.domain.objects.PatientCaseNote.getPatientCaseNotefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scannedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScannedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scannedDate");
		if(fldEl != null)
		{	
    		obj.setScannedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("scannedComment");
		if(fldEl != null)
		{	
    		obj.setScannedComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("folder");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFolder(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("lastTransferDate");
		if(fldEl != null)
		{	
    		obj.setLastTransferDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastRequestDate");
		if(fldEl != null)
		{	
    		obj.setLastRequestDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "openRequests"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String Type = "type";
		public static final String Status = "status";
		public static final String TrackingID = "trackingID";
		public static final String CurrentLocation = "currentLocation";
		public static final String CreatedBy = "createdBy";
		public static final String CreationDate = "creationDate";
		public static final String CurrentComment = "currentComment";
		public static final String OpenRequests = "openRequests";
		public static final String ArchivedBy = "archivedBy";
		public static final String ArchivedDate = "archivedDate";
		public static final String ArchivedComment = "archivedComment";
		public static final String DestroyedBy = "destroyedBy";
		public static final String DestroyedDate = "destroyedDate";
		public static final String DestroyedComment = "destroyedComment";
		public static final String MergedBy = "mergedBy";
		public static final String MergedDate = "mergedDate";
		public static final String MergedFrom = "mergedFrom";
		public static final String ScannedBy = "scannedBy";
		public static final String ScannedDate = "scannedDate";
		public static final String ScannedComment = "scannedComment";
		public static final String Folder = "folder";
		public static final String LastTransferDate = "lastTransferDate";
		public static final String LastRequestDate = "lastRequestDate";
	}
}

