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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class SurgicalAuditOperationDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100108;
	private static final long serialVersionUID = 1072100108L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Current Status */
	private ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus currentStatus;
	/** StatusHistory
	  * Collection of ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus.
	  */
	private java.util.List statusHistory;
	/** Pre Op Checks */
	private ims.clinical.domain.objects.SurgicalAuditPreOpChecks preOpChecks;
	/** Pre Op Checks Theatre Nurse */
	private ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse preOpChecksTheatreNurse;
	/** Procedure Details */
	private ims.clinical.domain.objects.SurgicalAuditProcedureDetails procedureDetails;
	/** Actual Procedure */
	private ims.clinical.domain.objects.SurgicalAuditActualProcedure actualProcedure;
	/** Recovery */
	private ims.clinical.domain.objects.SurgicalAuditRecovery recovery;
	/** Operation Cancelled */
	private Boolean operationCancelled;
	/** Reason for cancellation */
	private ims.domain.lookups.LookupInstance reasonForCancellation;
	/** Reason for Cancellation comment */
	private String reasonForCancellationComment;
	/** Operation Cancelled By  */
	private ims.core.resource.people.domain.objects.Hcp operationCancelledBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalAuditOperationDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalAuditOperationDetail ()
    {
    	super();
    }
    public SurgicalAuditOperationDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalAuditOperationDetail.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.clinical.domain.objects.SurgicalAuditPreOpChecks getPreOpChecks() {
		return preOpChecks;
	}
	public void setPreOpChecks(ims.clinical.domain.objects.SurgicalAuditPreOpChecks preOpChecks) {
		this.preOpChecks = preOpChecks;
	}

	public ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse getPreOpChecksTheatreNurse() {
		return preOpChecksTheatreNurse;
	}
	public void setPreOpChecksTheatreNurse(ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse preOpChecksTheatreNurse) {
		this.preOpChecksTheatreNurse = preOpChecksTheatreNurse;
	}

	public ims.clinical.domain.objects.SurgicalAuditProcedureDetails getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(ims.clinical.domain.objects.SurgicalAuditProcedureDetails procedureDetails) {
		this.procedureDetails = procedureDetails;
	}

	public ims.clinical.domain.objects.SurgicalAuditActualProcedure getActualProcedure() {
		return actualProcedure;
	}
	public void setActualProcedure(ims.clinical.domain.objects.SurgicalAuditActualProcedure actualProcedure) {
		this.actualProcedure = actualProcedure;
	}

	public ims.clinical.domain.objects.SurgicalAuditRecovery getRecovery() {
		return recovery;
	}
	public void setRecovery(ims.clinical.domain.objects.SurgicalAuditRecovery recovery) {
		this.recovery = recovery;
	}

	public Boolean isOperationCancelled() {
		return operationCancelled;
	}
	public void setOperationCancelled(Boolean operationCancelled) {
		this.operationCancelled = operationCancelled;
	}

	public ims.domain.lookups.LookupInstance getReasonForCancellation() {
		return reasonForCancellation;
	}
	public void setReasonForCancellation(ims.domain.lookups.LookupInstance reasonForCancellation) {
		this.reasonForCancellation = reasonForCancellation;
	}

	public String getReasonForCancellationComment() {
		return reasonForCancellationComment;
	}
	public void setReasonForCancellationComment(String reasonForCancellationComment) {
		if ( null != reasonForCancellationComment && reasonForCancellationComment.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForCancellationComment. Tried to set value: "+
				reasonForCancellationComment);
		}
		this.reasonForCancellationComment = reasonForCancellationComment;
	}

	public ims.core.resource.people.domain.objects.Hcp getOperationCancelledBy() {
		return operationCancelledBy;
	}
	public void setOperationCancelledBy(ims.core.resource.people.domain.objects.Hcp operationCancelledBy) {
		this.operationCancelledBy = operationCancelledBy;
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i5=0;
		for (i5=0; i5<statusHistory.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus obj = (ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus)statusHistory.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpChecks* :");
		if (preOpChecks != null)
		{
			auditStr.append(toShortClassName(preOpChecks));
				
		    auditStr.append(preOpChecks.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preOpChecksTheatreNurse* :");
		if (preOpChecksTheatreNurse != null)
		{
			auditStr.append(toShortClassName(preOpChecksTheatreNurse));
				
		    auditStr.append(preOpChecksTheatreNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDetails* :");
		if (procedureDetails != null)
		{
			auditStr.append(toShortClassName(procedureDetails));
				
		    auditStr.append(procedureDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actualProcedure* :");
		if (actualProcedure != null)
		{
			auditStr.append(toShortClassName(actualProcedure));
				
		    auditStr.append(actualProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recovery* :");
		if (recovery != null)
		{
			auditStr.append(toShortClassName(recovery));
				
		    auditStr.append(recovery.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*operationCancelled* :");
		auditStr.append(operationCancelled);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForCancellation* :");
		if (reasonForCancellation != null)
			auditStr.append(reasonForCancellation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForCancellationComment* :");
		auditStr.append(reasonForCancellationComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*operationCancelledBy* :");
		if (operationCancelledBy != null)
		{
			auditStr.append(toShortClassName(operationCancelledBy));
				
		    auditStr.append(operationCancelledBy.getId());
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
		
		String keyClassName = "SurgicalAuditOperationDetail";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
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
		if (this.getPreOpChecks() != null)
		{
			sb.append("<preOpChecks>");
			sb.append(this.getPreOpChecks().toXMLString(domMap)); 	
			sb.append("</preOpChecks>");		
		}
		if (this.getPreOpChecksTheatreNurse() != null)
		{
			sb.append("<preOpChecksTheatreNurse>");
			sb.append(this.getPreOpChecksTheatreNurse().toXMLString(domMap)); 	
			sb.append("</preOpChecksTheatreNurse>");		
		}
		if (this.getProcedureDetails() != null)
		{
			sb.append("<procedureDetails>");
			sb.append(this.getProcedureDetails().toXMLString(domMap)); 	
			sb.append("</procedureDetails>");		
		}
		if (this.getActualProcedure() != null)
		{
			sb.append("<actualProcedure>");
			sb.append(this.getActualProcedure().toXMLString(domMap)); 	
			sb.append("</actualProcedure>");		
		}
		if (this.getRecovery() != null)
		{
			sb.append("<recovery>");
			sb.append(this.getRecovery().toXMLString(domMap)); 	
			sb.append("</recovery>");		
		}
		if (this.isOperationCancelled() != null)
		{
			sb.append("<operationCancelled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOperationCancelled().toString()));
			sb.append("</operationCancelled>");		
		}
		if (this.getReasonForCancellation() != null)
		{
			sb.append("<reasonForCancellation>");
			sb.append(this.getReasonForCancellation().toXMLString()); 
			sb.append("</reasonForCancellation>");		
		}
		if (this.getReasonForCancellationComment() != null)
		{
			sb.append("<reasonForCancellationComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForCancellationComment().toString()));
			sb.append("</reasonForCancellationComment>");		
		}
		if (this.getOperationCancelledBy() != null)
		{
			sb.append("<operationCancelledBy>");
			sb.append(this.getOperationCancelledBy().toXMLString(domMap)); 	
			sb.append("</operationCancelledBy>");		
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
			SurgicalAuditOperationDetail domainObject = getSurgicalAuditOperationDetailfromXML(itemEl, factory, domMap);

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
			SurgicalAuditOperationDetail domainObject = getSurgicalAuditOperationDetailfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalAuditOperationDetail getSurgicalAuditOperationDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalAuditOperationDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalAuditOperationDetail getSurgicalAuditOperationDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalAuditOperationDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalAuditOperationDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalAuditOperationDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalAuditOperationDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalAuditOperationDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalAuditOperationDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalAuditOperationDetail)factory.getImportedDomainObject(SurgicalAuditOperationDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalAuditOperationDetail();
		}
		String keyClassName = "SurgicalAuditOperationDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalAuditOperationDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalAuditOperationDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus.getSurgicalAuditOperationDetailStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.clinical.domain.objects.SurgicalAuditOperationDetailStatus.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("preOpChecks");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreOpChecks(ims.clinical.domain.objects.SurgicalAuditPreOpChecks.getSurgicalAuditPreOpChecksfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preOpChecksTheatreNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreOpChecksTheatreNurse(ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse.getSurgicalAuditPreOpChecksTheatreNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedureDetails(ims.clinical.domain.objects.SurgicalAuditProcedureDetails.getSurgicalAuditProcedureDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("actualProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActualProcedure(ims.clinical.domain.objects.SurgicalAuditActualProcedure.getSurgicalAuditActualProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recovery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecovery(ims.clinical.domain.objects.SurgicalAuditRecovery.getSurgicalAuditRecoveryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("operationCancelled");
		if(fldEl != null)
		{	
    		obj.setOperationCancelled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonForCancellation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForCancellation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForCancellationComment");
		if(fldEl != null)
		{	
    		obj.setReasonForCancellationComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("operationCancelledBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOperationCancelledBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
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
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String PreOpChecks = "preOpChecks";
		public static final String PreOpChecksTheatreNurse = "preOpChecksTheatreNurse";
		public static final String ProcedureDetails = "procedureDetails";
		public static final String ActualProcedure = "actualProcedure";
		public static final String Recovery = "recovery";
		public static final String OperationCancelled = "operationCancelled";
		public static final String ReasonForCancellation = "reasonForCancellation";
		public static final String ReasonForCancellationComment = "reasonForCancellationComment";
		public static final String OperationCancelledBy = "operationCancelledBy";
	}
}

