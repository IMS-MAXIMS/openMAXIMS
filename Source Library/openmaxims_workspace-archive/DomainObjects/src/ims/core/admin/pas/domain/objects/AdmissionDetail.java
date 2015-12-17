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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class AdmissionDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100008;
	private static final long serialVersionUID = 1014100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** pasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Admission Date Time */
	private java.util.Date admissionDateTime;
	/** Ward */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Bed */
	private ims.core.layout.domain.objects.BedSpace bed;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Medic consultant;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** Ward Type -  Main or Side */
	private ims.domain.lookups.LookupInstance wardType;
	/** Method of Admission */
	private ims.domain.lookups.LookupInstance methodOfAdmission;
	/** SourceOfAdmission */
	private ims.domain.lookups.LookupInstance sourceOfAdmission;
	/** Reason For Admission */
	private String reasonForAdmission;
	/** Estimated Discharge Date */
	private java.util.Date estDischargeDate;
	/** is Chaplain Required */
	private Boolean isChaplainRequired;
	/** Update Case Folder Location */
	private Boolean updateCFL;
	/** Print Wristband */
	private Boolean printWristband;
	/** TransferHistory
	  * Collection of ims.core.admin.pas.domain.objects.TransferHistory.
	  */
	private java.util.List transferHistory;
	/** Admitting User */
	private ims.core.configuration.domain.objects.AppUser admittingUser;
	/** Date Time the admission action was undertaken */
	private java.util.Date admissionTransactionDateTime;
	/** Referring Consultant */
	private ims.core.resource.people.domain.objects.Medic referringConsultant;
	/** Patient Status */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** Anticipated Stay in Days  */
	private Integer anticipatedStay;
	/** CaseFolderComments */
	private String caseFolderComments;
	/** Episode Of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare admissionEpisode;
	/** ExtendedDetails */
	private ims.core.admin.pas.domain.objects.ExtendedAdmissionDetail extendedDetails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AdmissionDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AdmissionDetail ()
    {
    	super();
    }
    public AdmissionDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.AdmissionDetail.class;
	}


	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public static java.util.List listAdmissionDetailByPasEvent(ims.domain.ILightweightDomainFactory factory, ims.core.admin.pas.domain.objects.PASEvent val)
	{
		String hql = "from AdmissionDetail c where c.pasEvent = :pasEvent";		
		return factory.find(hql, new String[]{"pasEvent"}, new Object[]{val});		
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public java.util.Date getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setAdmissionDateTime(java.util.Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public ims.core.layout.domain.objects.BedSpace getBed() {
		return bed;
	}
	public void setBed(ims.core.layout.domain.objects.BedSpace bed) {
		this.bed = bed;
	}

	public ims.core.resource.people.domain.objects.Medic getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Medic consultant) {
		this.consultant = consultant;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.domain.lookups.LookupInstance getWardType() {
		return wardType;
	}
	public void setWardType(ims.domain.lookups.LookupInstance wardType) {
		this.wardType = wardType;
	}

	public ims.domain.lookups.LookupInstance getMethodOfAdmission() {
		return methodOfAdmission;
	}
	public void setMethodOfAdmission(ims.domain.lookups.LookupInstance methodOfAdmission) {
		this.methodOfAdmission = methodOfAdmission;
	}

	public ims.domain.lookups.LookupInstance getSourceOfAdmission() {
		return sourceOfAdmission;
	}
	public void setSourceOfAdmission(ims.domain.lookups.LookupInstance sourceOfAdmission) {
		this.sourceOfAdmission = sourceOfAdmission;
	}

	public String getReasonForAdmission() {
		return reasonForAdmission;
	}
	public void setReasonForAdmission(String reasonForAdmission) {
		if ( null != reasonForAdmission && reasonForAdmission.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForAdmission. Tried to set value: "+
				reasonForAdmission);
		}
		this.reasonForAdmission = reasonForAdmission;
	}

	public java.util.Date getEstDischargeDate() {
		return estDischargeDate;
	}
	public void setEstDischargeDate(java.util.Date estDischargeDate) {
		this.estDischargeDate = estDischargeDate;
	}

	public Boolean isIsChaplainRequired() {
		return isChaplainRequired;
	}
	public void setIsChaplainRequired(Boolean isChaplainRequired) {
		this.isChaplainRequired = isChaplainRequired;
	}

	public Boolean isUpdateCFL() {
		return updateCFL;
	}
	public void setUpdateCFL(Boolean updateCFL) {
		this.updateCFL = updateCFL;
	}

	public Boolean isPrintWristband() {
		return printWristband;
	}
	public void setPrintWristband(Boolean printWristband) {
		this.printWristband = printWristband;
	}

	public java.util.List getTransferHistory() {
		if ( null == transferHistory ) {
			transferHistory = new java.util.ArrayList();
		}
		return transferHistory;
	}
	public void setTransferHistory(java.util.List paramValue) {
		this.transferHistory = paramValue;
	}

	public ims.core.configuration.domain.objects.AppUser getAdmittingUser() {
		return admittingUser;
	}
	public void setAdmittingUser(ims.core.configuration.domain.objects.AppUser admittingUser) {
		this.admittingUser = admittingUser;
	}

	public java.util.Date getAdmissionTransactionDateTime() {
		return admissionTransactionDateTime;
	}
	public void setAdmissionTransactionDateTime(java.util.Date admissionTransactionDateTime) {
		this.admissionTransactionDateTime = admissionTransactionDateTime;
	}

	public ims.core.resource.people.domain.objects.Medic getReferringConsultant() {
		return referringConsultant;
	}
	public void setReferringConsultant(ims.core.resource.people.domain.objects.Medic referringConsultant) {
		this.referringConsultant = referringConsultant;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public Integer getAnticipatedStay() {
		return anticipatedStay;
	}
	public void setAnticipatedStay(Integer anticipatedStay) {
		this.anticipatedStay = anticipatedStay;
	}

	public String getCaseFolderComments() {
		return caseFolderComments;
	}
	public void setCaseFolderComments(String caseFolderComments) {
		if ( null != caseFolderComments && caseFolderComments.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for caseFolderComments. Tried to set value: "+
				caseFolderComments);
		}
		this.caseFolderComments = caseFolderComments;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getAdmissionEpisode() {
		return admissionEpisode;
	}
	public void setAdmissionEpisode(ims.core.admin.domain.objects.EpisodeOfCare admissionEpisode) {
		this.admissionEpisode = admissionEpisode;
	}

	public ims.core.admin.pas.domain.objects.ExtendedAdmissionDetail getExtendedDetails() {
		return extendedDetails;
	}
	public void setExtendedDetails(ims.core.admin.pas.domain.objects.ExtendedAdmissionDetail extendedDetails) {
		this.extendedDetails = extendedDetails;
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
		
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDateTime* :");
		auditStr.append(admissionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bed* :");
		if (bed != null)
		{
			auditStr.append(toShortClassName(bed));
				
		    auditStr.append(bed.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wardType* :");
		if (wardType != null)
			auditStr.append(wardType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*methodOfAdmission* :");
		if (methodOfAdmission != null)
			auditStr.append(methodOfAdmission.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfAdmission* :");
		if (sourceOfAdmission != null)
			auditStr.append(sourceOfAdmission.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForAdmission* :");
		auditStr.append(reasonForAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*estDischargeDate* :");
		auditStr.append(estDischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isChaplainRequired* :");
		auditStr.append(isChaplainRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*updateCFL* :");
		auditStr.append(updateCFL);
	    auditStr.append("; ");
		auditStr.append("\r\n*printWristband* :");
		auditStr.append(printWristband);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferHistory* :");
		if (transferHistory != null)
		{
		int i15=0;
		for (i15=0; i15<transferHistory.size(); i15++)
		{
			if (i15 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.TransferHistory obj = (ims.core.admin.pas.domain.objects.TransferHistory)transferHistory.get(i15);
		    if (obj != null)
			{
				if (i15 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admittingUser* :");
		if (admittingUser != null)
		{
			auditStr.append(toShortClassName(admittingUser));
				
		    auditStr.append(admittingUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionTransactionDateTime* :");
		auditStr.append(admissionTransactionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringConsultant* :");
		if (referringConsultant != null)
		{
			auditStr.append(toShortClassName(referringConsultant));
				
		    auditStr.append(referringConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anticipatedStay* :");
		auditStr.append(anticipatedStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*caseFolderComments* :");
		auditStr.append(caseFolderComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionEpisode* :");
		if (admissionEpisode != null)
		{
			auditStr.append(toShortClassName(admissionEpisode));
				
		    auditStr.append(admissionEpisode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*extendedDetails* :");
		if (extendedDetails != null)
		{
			auditStr.append(toShortClassName(extendedDetails));
				
		    auditStr.append(extendedDetails.getId());
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
		
		String keyClassName = "AdmissionDetail";
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
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getAdmissionDateTime() != null)
		{
			sb.append("<admissionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDateTime>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getBed() != null)
		{
			sb.append("<bed>");
			sb.append(this.getBed().toXMLString(domMap)); 	
			sb.append("</bed>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getWardType() != null)
		{
			sb.append("<wardType>");
			sb.append(this.getWardType().toXMLString()); 
			sb.append("</wardType>");		
		}
		if (this.getMethodOfAdmission() != null)
		{
			sb.append("<methodOfAdmission>");
			sb.append(this.getMethodOfAdmission().toXMLString()); 
			sb.append("</methodOfAdmission>");		
		}
		if (this.getSourceOfAdmission() != null)
		{
			sb.append("<sourceOfAdmission>");
			sb.append(this.getSourceOfAdmission().toXMLString()); 
			sb.append("</sourceOfAdmission>");		
		}
		if (this.getReasonForAdmission() != null)
		{
			sb.append("<reasonForAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForAdmission().toString()));
			sb.append("</reasonForAdmission>");		
		}
		if (this.getEstDischargeDate() != null)
		{
			sb.append("<estDischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEstDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estDischargeDate>");		
		}
		if (this.isIsChaplainRequired() != null)
		{
			sb.append("<isChaplainRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsChaplainRequired().toString()));
			sb.append("</isChaplainRequired>");		
		}
		if (this.isUpdateCFL() != null)
		{
			sb.append("<updateCFL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUpdateCFL().toString()));
			sb.append("</updateCFL>");		
		}
		if (this.isPrintWristband() != null)
		{
			sb.append("<printWristband>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPrintWristband().toString()));
			sb.append("</printWristband>");		
		}
		if (this.getTransferHistory() != null)
		{
			if (this.getTransferHistory().size() > 0 )
			{
			sb.append("<transferHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTransferHistory(), domMap));
			sb.append("</transferHistory>");		
			}
		}
		if (this.getAdmittingUser() != null)
		{
			sb.append("<admittingUser>");
			sb.append(this.getAdmittingUser().toXMLString(domMap)); 	
			sb.append("</admittingUser>");		
		}
		if (this.getAdmissionTransactionDateTime() != null)
		{
			sb.append("<admissionTransactionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionTransactionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionTransactionDateTime>");		
		}
		if (this.getReferringConsultant() != null)
		{
			sb.append("<referringConsultant>");
			sb.append(this.getReferringConsultant().toXMLString(domMap)); 	
			sb.append("</referringConsultant>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getAnticipatedStay() != null)
		{
			sb.append("<anticipatedStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnticipatedStay().toString()));
			sb.append("</anticipatedStay>");		
		}
		if (this.getCaseFolderComments() != null)
		{
			sb.append("<caseFolderComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCaseFolderComments().toString()));
			sb.append("</caseFolderComments>");		
		}
		if (this.getAdmissionEpisode() != null)
		{
			sb.append("<admissionEpisode>");
			sb.append(this.getAdmissionEpisode().toXMLString(domMap)); 	
			sb.append("</admissionEpisode>");		
		}
		if (this.getExtendedDetails() != null)
		{
			sb.append("<extendedDetails>");
			sb.append(this.getExtendedDetails().toXMLString(domMap)); 	
			sb.append("</extendedDetails>");		
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
			AdmissionDetail domainObject = getAdmissionDetailfromXML(itemEl, factory, domMap);

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
			AdmissionDetail domainObject = getAdmissionDetailfromXML(itemEl, factory, domMap);

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
		
	public static AdmissionDetail getAdmissionDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAdmissionDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AdmissionDetail getAdmissionDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AdmissionDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AdmissionDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AdmissionDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AdmissionDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AdmissionDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AdmissionDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AdmissionDetail)factory.getImportedDomainObject(AdmissionDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AdmissionDetail();
		}
		String keyClassName = "AdmissionDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AdmissionDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AdmissionDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBed(ims.core.layout.domain.objects.BedSpace.getBedSpacefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wardType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWardType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("methodOfAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMethodOfAdmission(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sourceOfAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfAdmission(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForAdmission");
		if(fldEl != null)
		{	
    		obj.setReasonForAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("estDischargeDate");
		if(fldEl != null)
		{	
    		obj.setEstDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isChaplainRequired");
		if(fldEl != null)
		{	
    		obj.setIsChaplainRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("updateCFL");
		if(fldEl != null)
		{	
    		obj.setUpdateCFL(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("printWristband");
		if(fldEl != null)
		{	
    		obj.setPrintWristband(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transferHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTransferHistory(ims.core.admin.pas.domain.objects.TransferHistory.fromListXMLString(fldEl, factory, obj.getTransferHistory(), domMap));
		}
		fldEl = el.element("admittingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmittingUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionTransactionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionTransactionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referringConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anticipatedStay");
		if(fldEl != null)
		{	
    		obj.setAnticipatedStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("caseFolderComments");
		if(fldEl != null)
		{	
    		obj.setCaseFolderComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionEpisode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("extendedDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setExtendedDetails(ims.core.admin.pas.domain.objects.ExtendedAdmissionDetail.getExtendedAdmissionDetailfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "transferHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PasEvent = "pasEvent";
		public static final String AdmissionDateTime = "admissionDateTime";
		public static final String Ward = "ward";
		public static final String Bed = "bed";
		public static final String Consultant = "consultant";
		public static final String Specialty = "specialty";
		public static final String WardType = "wardType";
		public static final String MethodOfAdmission = "methodOfAdmission";
		public static final String SourceOfAdmission = "sourceOfAdmission";
		public static final String ReasonForAdmission = "reasonForAdmission";
		public static final String EstDischargeDate = "estDischargeDate";
		public static final String IsChaplainRequired = "isChaplainRequired";
		public static final String UpdateCFL = "updateCFL";
		public static final String PrintWristband = "printWristband";
		public static final String TransferHistory = "transferHistory";
		public static final String AdmittingUser = "admittingUser";
		public static final String AdmissionTransactionDateTime = "admissionTransactionDateTime";
		public static final String ReferringConsultant = "referringConsultant";
		public static final String PatientStatus = "patientStatus";
		public static final String AnticipatedStay = "anticipatedStay";
		public static final String CaseFolderComments = "caseFolderComments";
		public static final String AdmissionEpisode = "admissionEpisode";
		public static final String ExtendedDetails = "extendedDetails";
	}
}

