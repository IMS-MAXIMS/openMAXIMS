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
package ims.ntpf.locall.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class LoCallWaitingListDetails extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1039100002;
	private static final long serialVersionUID = 1039100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Speciality */
	private ims.core.clinical.domain.objects.Service speciality;
	/** Procedure */
	private ims.core.resource.place.domain.objects.Activity procedure;
	/** ProcedureText */
	private String procedureText;
	/** Referring Hospital where Referring Hospital = true */
	private ims.core.resource.place.domain.objects.Location referringHospital;
	/** Referring Consultant where primary location = Referring Hospital above */
	private ims.core.resource.people.domain.objects.Medic referringConsultant;
	/** ReferringConsultantText */
	private String referringConsultantText;
	/** Category - Adult/Paediatric  */
	private ims.domain.lookups.LookupInstance category;
	/** Wait List Type - inpatient, outpatient, day case */
	private ims.domain.lookups.LookupInstance waitingListType;
	/** Waiting list date  */
	private java.util.Date waitingListDate;
	/** Waiting List Interval */
	private Integer waitingListMonthInterval;
	/** Waiting List Length Qualifier */
	private ims.domain.lookups.LookupInstance waitingListLengthQualifier;
	/** Lo-Call Fax To - Liaison Officier */
	private ims.core.resource.people.domain.objects.MemberOfStaff faxTo;
	/** FaxDate */
	private java.util.Date faxDate;
	/** Text to appear on fax / email to liaison officer */
	private String liaisonQuery;
	/** Status History
	  * Collection of ims.ntpf.locall.domain.objects.LoCallStatus.
	  */
	private java.util.Set statusHistory;
	/** Current Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** CurrentStatusReason */
	private ims.domain.lookups.LookupInstance currentStatusReason;
	/** isLinkedtoCase */
	private Boolean isLinkedtoCase;
	/** Case */
	private ims.ntpf.casereferral.domain.objects.CaseReferral assocCase;
	/** Locall */
	private ims.ntpf.locall.domain.objects.LoCall assocLocall;
	/** Hospital Received From */
	private ims.core.resource.place.domain.objects.Location hospital;
	/** Medical Record Number */
	private String mrn;
	/** WL Episode Number */
	private String episodeNumber;
    public LoCallWaitingListDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LoCallWaitingListDetails ()
    {
    	super();
    }
    public LoCallWaitingListDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.locall.domain.objects.LoCallWaitingListDetails.class;
	}


	public ims.core.clinical.domain.objects.Service getSpeciality() {
		return speciality;
	}
	public void setSpeciality(ims.core.clinical.domain.objects.Service speciality) {
		this.speciality = speciality;
	}

	public ims.core.resource.place.domain.objects.Activity getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.resource.place.domain.objects.Activity procedure) {
		this.procedure = procedure;
	}

	public String getProcedureText() {
		return procedureText;
	}
	public void setProcedureText(String procedureText) {
		if ( null != procedureText && procedureText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureText. Tried to set value: "+
				procedureText);
		}
		this.procedureText = procedureText;
	}

	public ims.core.resource.place.domain.objects.Location getReferringHospital() {
		return referringHospital;
	}
	public void setReferringHospital(ims.core.resource.place.domain.objects.Location referringHospital) {
		this.referringHospital = referringHospital;
	}

	public ims.core.resource.people.domain.objects.Medic getReferringConsultant() {
		return referringConsultant;
	}
	public void setReferringConsultant(ims.core.resource.people.domain.objects.Medic referringConsultant) {
		this.referringConsultant = referringConsultant;
	}

	public String getReferringConsultantText() {
		return referringConsultantText;
	}
	public void setReferringConsultantText(String referringConsultantText) {
		if ( null != referringConsultantText && referringConsultantText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referringConsultantText. Tried to set value: "+
				referringConsultantText);
		}
		this.referringConsultantText = referringConsultantText;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getWaitingListType() {
		return waitingListType;
	}
	public void setWaitingListType(ims.domain.lookups.LookupInstance waitingListType) {
		this.waitingListType = waitingListType;
	}

	public java.util.Date getWaitingListDate() {
		return waitingListDate;
	}
	public void setWaitingListDate(java.util.Date waitingListDate) {
		this.waitingListDate = waitingListDate;
	}

	public Integer getWaitingListMonthInterval() {
		return waitingListMonthInterval;
	}
	public void setWaitingListMonthInterval(Integer waitingListMonthInterval) {
		this.waitingListMonthInterval = waitingListMonthInterval;
	}

	public ims.domain.lookups.LookupInstance getWaitingListLengthQualifier() {
		return waitingListLengthQualifier;
	}
	public void setWaitingListLengthQualifier(ims.domain.lookups.LookupInstance waitingListLengthQualifier) {
		this.waitingListLengthQualifier = waitingListLengthQualifier;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getFaxTo() {
		return faxTo;
	}
	public void setFaxTo(ims.core.resource.people.domain.objects.MemberOfStaff faxTo) {
		this.faxTo = faxTo;
	}

	public java.util.Date getFaxDate() {
		return faxDate;
	}
	public void setFaxDate(java.util.Date faxDate) {
		this.faxDate = faxDate;
	}

	public String getLiaisonQuery() {
		return liaisonQuery;
	}
	public void setLiaisonQuery(String liaisonQuery) {
		if ( null != liaisonQuery && liaisonQuery.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for liaisonQuery. Tried to set value: "+
				liaisonQuery);
		}
		this.liaisonQuery = liaisonQuery;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatusReason() {
		return currentStatusReason;
	}
	public void setCurrentStatusReason(ims.domain.lookups.LookupInstance currentStatusReason) {
		this.currentStatusReason = currentStatusReason;
	}

	public Boolean isIsLinkedtoCase() {
		return isLinkedtoCase;
	}
	public void setIsLinkedtoCase(Boolean isLinkedtoCase) {
		this.isLinkedtoCase = isLinkedtoCase;
	}

	public ims.ntpf.casereferral.domain.objects.CaseReferral getAssocCase() {
		return assocCase;
	}
	public void setAssocCase(ims.ntpf.casereferral.domain.objects.CaseReferral assocCase) {
		this.assocCase = assocCase;
	}

	public ims.ntpf.locall.domain.objects.LoCall getAssocLocall() {
		return assocLocall;
	}
	public void setAssocLocall(ims.ntpf.locall.domain.objects.LoCall assocLocall) {
		this.assocLocall = assocLocall;
	}

	public ims.core.resource.place.domain.objects.Location getHospital() {
		return hospital;
	}
	public void setHospital(ims.core.resource.place.domain.objects.Location hospital) {
		this.hospital = hospital;
	}

	public String getMrn() {
		return mrn;
	}
	public void setMrn(String mrn) {
		if ( null != mrn && mrn.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mrn. Tried to set value: "+
				mrn);
		}
		this.mrn = mrn;
	}

	public String getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(String episodeNumber) {
		if ( null != episodeNumber && episodeNumber.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for episodeNumber. Tried to set value: "+
				episodeNumber);
		}
		this.episodeNumber = episodeNumber;
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
		
		auditStr.append("\r\n*speciality* :");
		if (speciality != null)
		{
			auditStr.append(toShortClassName(speciality));
				
		    auditStr.append(speciality.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureText* :");
		auditStr.append(procedureText);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringHospital* :");
		if (referringHospital != null)
		{
			auditStr.append(toShortClassName(referringHospital));
				
		    auditStr.append(referringHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringConsultant* :");
		if (referringConsultant != null)
		{
			auditStr.append(toShortClassName(referringConsultant));
				
		    auditStr.append(referringConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringConsultantText* :");
		auditStr.append(referringConsultantText);
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingListType* :");
		if (waitingListType != null)
			auditStr.append(waitingListType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingListDate* :");
		auditStr.append(waitingListDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingListMonthInterval* :");
		auditStr.append(waitingListMonthInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingListLengthQualifier* :");
		if (waitingListLengthQualifier != null)
			auditStr.append(waitingListLengthQualifier.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*faxTo* :");
		if (faxTo != null)
		{
			auditStr.append(toShortClassName(faxTo));
				
		    auditStr.append(faxTo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*faxDate* :");
		auditStr.append(faxDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*liaisonQuery* :");
		auditStr.append(liaisonQuery);
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
			java.util.Iterator it15 = statusHistory.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.ntpf.locall.domain.objects.LoCallStatus obj = (ims.ntpf.locall.domain.objects.LoCallStatus)it15.next();
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
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatusReason* :");
		if (currentStatusReason != null)
			auditStr.append(currentStatusReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isLinkedtoCase* :");
		auditStr.append(isLinkedtoCase);
	    auditStr.append("; ");
		auditStr.append("\r\n*assocCase* :");
		if (assocCase != null)
		{
			auditStr.append(toShortClassName(assocCase));
				
		    auditStr.append(assocCase.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assocLocall* :");
		if (assocLocall != null)
		{
			auditStr.append(toShortClassName(assocLocall));
				
		    auditStr.append(assocLocall.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospital* :");
		if (hospital != null)
		{
			auditStr.append(toShortClassName(hospital));
				
		    auditStr.append(hospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mrn* :");
		auditStr.append(mrn);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeNumber* :");
		auditStr.append(episodeNumber);
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
		
		String keyClassName = "LoCallWaitingListDetails";
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
		if (this.getSpeciality() != null)
		{
			sb.append("<speciality>");
			sb.append(this.getSpeciality().toXMLString(domMap)); 	
			sb.append("</speciality>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getProcedureText() != null)
		{
			sb.append("<procedureText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureText().toString()));
			sb.append("</procedureText>");		
		}
		if (this.getReferringHospital() != null)
		{
			sb.append("<referringHospital>");
			sb.append(this.getReferringHospital().toXMLString(domMap)); 	
			sb.append("</referringHospital>");		
		}
		if (this.getReferringConsultant() != null)
		{
			sb.append("<referringConsultant>");
			sb.append(this.getReferringConsultant().toXMLString(domMap)); 	
			sb.append("</referringConsultant>");		
		}
		if (this.getReferringConsultantText() != null)
		{
			sb.append("<referringConsultantText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferringConsultantText().toString()));
			sb.append("</referringConsultantText>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getWaitingListType() != null)
		{
			sb.append("<waitingListType>");
			sb.append(this.getWaitingListType().toXMLString()); 
			sb.append("</waitingListType>");		
		}
		if (this.getWaitingListDate() != null)
		{
			sb.append("<waitingListDate>");
			sb.append(new ims.framework.utils.DateTime(this.getWaitingListDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</waitingListDate>");		
		}
		if (this.getWaitingListMonthInterval() != null)
		{
			sb.append("<waitingListMonthInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWaitingListMonthInterval().toString()));
			sb.append("</waitingListMonthInterval>");		
		}
		if (this.getWaitingListLengthQualifier() != null)
		{
			sb.append("<waitingListLengthQualifier>");
			sb.append(this.getWaitingListLengthQualifier().toXMLString()); 
			sb.append("</waitingListLengthQualifier>");		
		}
		if (this.getFaxTo() != null)
		{
			sb.append("<faxTo>");
			sb.append(this.getFaxTo().toXMLString(domMap)); 	
			sb.append("</faxTo>");		
		}
		if (this.getFaxDate() != null)
		{
			sb.append("<faxDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFaxDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</faxDate>");		
		}
		if (this.getLiaisonQuery() != null)
		{
			sb.append("<liaisonQuery>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLiaisonQuery().toString()));
			sb.append("</liaisonQuery>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.getCurrentStatusReason() != null)
		{
			sb.append("<currentStatusReason>");
			sb.append(this.getCurrentStatusReason().toXMLString()); 
			sb.append("</currentStatusReason>");		
		}
		if (this.isIsLinkedtoCase() != null)
		{
			sb.append("<isLinkedtoCase>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsLinkedtoCase().toString()));
			sb.append("</isLinkedtoCase>");		
		}
		if (this.getAssocCase() != null)
		{
			sb.append("<assocCase>");
			sb.append(this.getAssocCase().toXMLString(domMap)); 	
			sb.append("</assocCase>");		
		}
		if (this.getAssocLocall() != null)
		{
			sb.append("<assocLocall>");
			sb.append(this.getAssocLocall().toXMLString(domMap)); 	
			sb.append("</assocLocall>");		
		}
		if (this.getHospital() != null)
		{
			sb.append("<hospital>");
			sb.append(this.getHospital().toXMLString(domMap)); 	
			sb.append("</hospital>");		
		}
		if (this.getMrn() != null)
		{
			sb.append("<mrn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMrn().toString()));
			sb.append("</mrn>");		
		}
		if (this.getEpisodeNumber() != null)
		{
			sb.append("<episodeNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEpisodeNumber().toString()));
			sb.append("</episodeNumber>");		
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
			LoCallWaitingListDetails domainObject = getLoCallWaitingListDetailsfromXML(itemEl, factory, domMap);

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
			LoCallWaitingListDetails domainObject = getLoCallWaitingListDetailsfromXML(itemEl, factory, domMap);

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
		
	public static LoCallWaitingListDetails getLoCallWaitingListDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLoCallWaitingListDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LoCallWaitingListDetails getLoCallWaitingListDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LoCallWaitingListDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LoCallWaitingListDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LoCallWaitingListDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LoCallWaitingListDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LoCallWaitingListDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LoCallWaitingListDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LoCallWaitingListDetails)factory.getImportedDomainObject(LoCallWaitingListDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LoCallWaitingListDetails();
		}
		String keyClassName = "LoCallWaitingListDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LoCallWaitingListDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LoCallWaitingListDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("speciality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSpeciality(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureText");
		if(fldEl != null)
		{	
    		obj.setProcedureText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referringHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringConsultantText");
		if(fldEl != null)
		{	
    		obj.setReferringConsultantText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("waitingListType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWaitingListType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("waitingListDate");
		if(fldEl != null)
		{	
    		obj.setWaitingListDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("waitingListMonthInterval");
		if(fldEl != null)
		{	
    		obj.setWaitingListMonthInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("waitingListLengthQualifier");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWaitingListLengthQualifier(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("faxTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFaxTo(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("faxDate");
		if(fldEl != null)
		{	
    		obj.setFaxDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("liaisonQuery");
		if(fldEl != null)
		{	
    		obj.setLiaisonQuery(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.ntpf.locall.domain.objects.LoCallStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentStatusReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatusReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isLinkedtoCase");
		if(fldEl != null)
		{	
    		obj.setIsLinkedtoCase(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assocCase");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocCase(ims.ntpf.casereferral.domain.objects.CaseReferral.getCaseReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assocLocall");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocLocall(ims.ntpf.locall.domain.objects.LoCall.getLoCallfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mrn");
		if(fldEl != null)
		{	
    		obj.setMrn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("episodeNumber");
		if(fldEl != null)
		{	
    		obj.setEpisodeNumber(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Speciality = "speciality";
		public static final String Procedure = "procedure";
		public static final String ProcedureText = "procedureText";
		public static final String ReferringHospital = "referringHospital";
		public static final String ReferringConsultant = "referringConsultant";
		public static final String ReferringConsultantText = "referringConsultantText";
		public static final String Category = "category";
		public static final String WaitingListType = "waitingListType";
		public static final String WaitingListDate = "waitingListDate";
		public static final String WaitingListMonthInterval = "waitingListMonthInterval";
		public static final String WaitingListLengthQualifier = "waitingListLengthQualifier";
		public static final String FaxTo = "faxTo";
		public static final String FaxDate = "faxDate";
		public static final String LiaisonQuery = "liaisonQuery";
		public static final String StatusHistory = "statusHistory";
		public static final String CurrentStatus = "currentStatus";
		public static final String CurrentStatusReason = "currentStatusReason";
		public static final String IsLinkedtoCase = "isLinkedtoCase";
		public static final String AssocCase = "assocCase";
		public static final String AssocLocall = "assocLocall";
		public static final String Hospital = "hospital";
		public static final String Mrn = "mrn";
		public static final String EpisodeNumber = "episodeNumber";
	}
}

