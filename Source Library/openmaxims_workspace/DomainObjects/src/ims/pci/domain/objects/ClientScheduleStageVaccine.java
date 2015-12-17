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
package ims.pci.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ClientScheduleStageVaccine extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100009;
	private static final long serialVersionUID = 1091100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Vaccine details for the Stage */
	private ims.pci.domain.objects.StageVaccine stageVaccine;
	/** Schedule Type */
	private ims.domain.lookups.LookupInstance scheduleType;
	/** ScheduledDate */
	private java.util.Date scheduledDate;
	/** DeliveredDate */
	private java.util.Date deliveredDate;
	/** TerminatedDate */
	private java.util.Date terminatedDate;
	/** Vaccine Manufacturer */
	private ims.domain.lookups.LookupInstance vaccineManufacturer;
	/** Vaccine Expiry Date */
	private java.util.Date expiryDate;
	/** Vaccine Batch Number */
	private String batchNumber;
	/** Payment Type */
	private ims.domain.lookups.LookupInstance paymentType;
	/** Delivered By Medic */
	private ims.core.resource.people.domain.objects.Hcp deliveredByMedic;
	/** Delivered By Gp */
	private ims.core.resource.people.domain.objects.Gp deliveredByGp;
	/** Payment Gp */
	private ims.core.resource.people.domain.objects.Gp paymentGp;
	/** Terminated By */
	private ims.domain.lookups.LookupInstance terminatedBy;
	/** Termination Reason */
	private ims.domain.lookups.LookupInstance terminationReason;
	/** Determines if the vaccine is deleted or not */
	private Boolean isDeleted;
	/** Was vaccine record extracted for report */
	private Boolean isExtracted;
	/** Person Recording Delivery Details */
	private ims.core.resource.people.domain.objects.MemberOfStaff personRecordingDelivery;
	/** Was the vaccine cancelled */
	private Boolean isCancelled;
	/** Person who cancelled the vaccine */
	private ims.core.resource.people.domain.objects.MemberOfStaff cancelledBy;
	/** Cancellation Reason */
	private ims.domain.lookups.LookupInstance cancellationReason;
	/** CancellationDateTime */
	private java.util.Date cancellationDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClientScheduleStageVaccine (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClientScheduleStageVaccine ()
    {
    	super();
    }
    public ClientScheduleStageVaccine (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.ClientScheduleStageVaccine.class;
	}


	public ims.pci.domain.objects.StageVaccine getStageVaccine() {
		return stageVaccine;
	}
	public void setStageVaccine(ims.pci.domain.objects.StageVaccine stageVaccine) {
		this.stageVaccine = stageVaccine;
	}

	public ims.domain.lookups.LookupInstance getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(ims.domain.lookups.LookupInstance scheduleType) {
		this.scheduleType = scheduleType;
	}

	public java.util.Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(java.util.Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public java.util.Date getDeliveredDate() {
		return deliveredDate;
	}
	public void setDeliveredDate(java.util.Date deliveredDate) {
		this.deliveredDate = deliveredDate;
	}

	public java.util.Date getTerminatedDate() {
		return terminatedDate;
	}
	public void setTerminatedDate(java.util.Date terminatedDate) {
		this.terminatedDate = terminatedDate;
	}

	public ims.domain.lookups.LookupInstance getVaccineManufacturer() {
		return vaccineManufacturer;
	}
	public void setVaccineManufacturer(ims.domain.lookups.LookupInstance vaccineManufacturer) {
		this.vaccineManufacturer = vaccineManufacturer;
	}

	public java.util.Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(java.util.Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		if ( null != batchNumber && batchNumber.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for batchNumber. Tried to set value: "+
				batchNumber);
		}
		this.batchNumber = batchNumber;
	}

	public ims.domain.lookups.LookupInstance getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(ims.domain.lookups.LookupInstance paymentType) {
		this.paymentType = paymentType;
	}

	public ims.core.resource.people.domain.objects.Hcp getDeliveredByMedic() {
		return deliveredByMedic;
	}
	public void setDeliveredByMedic(ims.core.resource.people.domain.objects.Hcp deliveredByMedic) {
		this.deliveredByMedic = deliveredByMedic;
	}

	public ims.core.resource.people.domain.objects.Gp getDeliveredByGp() {
		return deliveredByGp;
	}
	public void setDeliveredByGp(ims.core.resource.people.domain.objects.Gp deliveredByGp) {
		this.deliveredByGp = deliveredByGp;
	}

	public ims.core.resource.people.domain.objects.Gp getPaymentGp() {
		return paymentGp;
	}
	public void setPaymentGp(ims.core.resource.people.domain.objects.Gp paymentGp) {
		this.paymentGp = paymentGp;
	}

	public ims.domain.lookups.LookupInstance getTerminatedBy() {
		return terminatedBy;
	}
	public void setTerminatedBy(ims.domain.lookups.LookupInstance terminatedBy) {
		this.terminatedBy = terminatedBy;
	}

	public ims.domain.lookups.LookupInstance getTerminationReason() {
		return terminationReason;
	}
	public void setTerminationReason(ims.domain.lookups.LookupInstance terminationReason) {
		this.terminationReason = terminationReason;
	}

	public Boolean isIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean isIsExtracted() {
		return isExtracted;
	}
	public void setIsExtracted(Boolean isExtracted) {
		this.isExtracted = isExtracted;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getPersonRecordingDelivery() {
		return personRecordingDelivery;
	}
	public void setPersonRecordingDelivery(ims.core.resource.people.domain.objects.MemberOfStaff personRecordingDelivery) {
		this.personRecordingDelivery = personRecordingDelivery;
	}

	public Boolean isIsCancelled() {
		return isCancelled;
	}
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCancelledBy() {
		return cancelledBy;
	}
	public void setCancelledBy(ims.core.resource.people.domain.objects.MemberOfStaff cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	public ims.domain.lookups.LookupInstance getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(ims.domain.lookups.LookupInstance cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public java.util.Date getCancellationDateTime() {
		return cancellationDateTime;
	}
	public void setCancellationDateTime(java.util.Date cancellationDateTime) {
		this.cancellationDateTime = cancellationDateTime;
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
		
		auditStr.append("\r\n*stageVaccine* :");
		if (stageVaccine != null)
		{
			auditStr.append(toShortClassName(stageVaccine));
				
		    auditStr.append(stageVaccine.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduleType* :");
		if (scheduleType != null)
			auditStr.append(scheduleType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduledDate* :");
		auditStr.append(scheduledDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*deliveredDate* :");
		auditStr.append(deliveredDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*terminatedDate* :");
		auditStr.append(terminatedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*vaccineManufacturer* :");
		if (vaccineManufacturer != null)
			auditStr.append(vaccineManufacturer.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*expiryDate* :");
		auditStr.append(expiryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*batchNumber* :");
		auditStr.append(batchNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*paymentType* :");
		if (paymentType != null)
			auditStr.append(paymentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deliveredByMedic* :");
		if (deliveredByMedic != null)
		{
			auditStr.append(toShortClassName(deliveredByMedic));
				
		    auditStr.append(deliveredByMedic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*deliveredByGp* :");
		if (deliveredByGp != null)
		{
			auditStr.append(toShortClassName(deliveredByGp));
				
		    auditStr.append(deliveredByGp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*paymentGp* :");
		if (paymentGp != null)
		{
			auditStr.append(toShortClassName(paymentGp));
				
		    auditStr.append(paymentGp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*terminatedBy* :");
		if (terminatedBy != null)
			auditStr.append(terminatedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*terminationReason* :");
		if (terminationReason != null)
			auditStr.append(terminationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isDeleted* :");
		auditStr.append(isDeleted);
	    auditStr.append("; ");
		auditStr.append("\r\n*isExtracted* :");
		auditStr.append(isExtracted);
	    auditStr.append("; ");
		auditStr.append("\r\n*personRecordingDelivery* :");
		if (personRecordingDelivery != null)
		{
			auditStr.append(toShortClassName(personRecordingDelivery));
				
		    auditStr.append(personRecordingDelivery.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCancelled* :");
		auditStr.append(isCancelled);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledBy* :");
		if (cancelledBy != null)
		{
			auditStr.append(toShortClassName(cancelledBy));
				
		    auditStr.append(cancelledBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationReason* :");
		if (cancellationReason != null)
			auditStr.append(cancellationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationDateTime* :");
		auditStr.append(cancellationDateTime);
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
		
		String keyClassName = "ClientScheduleStageVaccine";
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
		if (this.getStageVaccine() != null)
		{
			sb.append("<stageVaccine>");
			sb.append(this.getStageVaccine().toXMLString(domMap)); 	
			sb.append("</stageVaccine>");		
		}
		if (this.getScheduleType() != null)
		{
			sb.append("<scheduleType>");
			sb.append(this.getScheduleType().toXMLString()); 
			sb.append("</scheduleType>");		
		}
		if (this.getScheduledDate() != null)
		{
			sb.append("<scheduledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getScheduledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</scheduledDate>");		
		}
		if (this.getDeliveredDate() != null)
		{
			sb.append("<deliveredDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDeliveredDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</deliveredDate>");		
		}
		if (this.getTerminatedDate() != null)
		{
			sb.append("<terminatedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTerminatedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</terminatedDate>");		
		}
		if (this.getVaccineManufacturer() != null)
		{
			sb.append("<vaccineManufacturer>");
			sb.append(this.getVaccineManufacturer().toXMLString()); 
			sb.append("</vaccineManufacturer>");		
		}
		if (this.getExpiryDate() != null)
		{
			sb.append("<expiryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getExpiryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expiryDate>");		
		}
		if (this.getBatchNumber() != null)
		{
			sb.append("<batchNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBatchNumber().toString()));
			sb.append("</batchNumber>");		
		}
		if (this.getPaymentType() != null)
		{
			sb.append("<paymentType>");
			sb.append(this.getPaymentType().toXMLString()); 
			sb.append("</paymentType>");		
		}
		if (this.getDeliveredByMedic() != null)
		{
			sb.append("<deliveredByMedic>");
			sb.append(this.getDeliveredByMedic().toXMLString(domMap)); 	
			sb.append("</deliveredByMedic>");		
		}
		if (this.getDeliveredByGp() != null)
		{
			sb.append("<deliveredByGp>");
			sb.append(this.getDeliveredByGp().toXMLString(domMap)); 	
			sb.append("</deliveredByGp>");		
		}
		if (this.getPaymentGp() != null)
		{
			sb.append("<paymentGp>");
			sb.append(this.getPaymentGp().toXMLString(domMap)); 	
			sb.append("</paymentGp>");		
		}
		if (this.getTerminatedBy() != null)
		{
			sb.append("<terminatedBy>");
			sb.append(this.getTerminatedBy().toXMLString()); 
			sb.append("</terminatedBy>");		
		}
		if (this.getTerminationReason() != null)
		{
			sb.append("<terminationReason>");
			sb.append(this.getTerminationReason().toXMLString()); 
			sb.append("</terminationReason>");		
		}
		if (this.isIsDeleted() != null)
		{
			sb.append("<isDeleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDeleted().toString()));
			sb.append("</isDeleted>");		
		}
		if (this.isIsExtracted() != null)
		{
			sb.append("<isExtracted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsExtracted().toString()));
			sb.append("</isExtracted>");		
		}
		if (this.getPersonRecordingDelivery() != null)
		{
			sb.append("<personRecordingDelivery>");
			sb.append(this.getPersonRecordingDelivery().toXMLString(domMap)); 	
			sb.append("</personRecordingDelivery>");		
		}
		if (this.isIsCancelled() != null)
		{
			sb.append("<isCancelled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCancelled().toString()));
			sb.append("</isCancelled>");		
		}
		if (this.getCancelledBy() != null)
		{
			sb.append("<cancelledBy>");
			sb.append(this.getCancelledBy().toXMLString(domMap)); 	
			sb.append("</cancelledBy>");		
		}
		if (this.getCancellationReason() != null)
		{
			sb.append("<cancellationReason>");
			sb.append(this.getCancellationReason().toXMLString()); 
			sb.append("</cancellationReason>");		
		}
		if (this.getCancellationDateTime() != null)
		{
			sb.append("<cancellationDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCancellationDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cancellationDateTime>");		
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
			ClientScheduleStageVaccine domainObject = getClientScheduleStageVaccinefromXML(itemEl, factory, domMap);

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
			ClientScheduleStageVaccine domainObject = getClientScheduleStageVaccinefromXML(itemEl, factory, domMap);

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
		
	public static ClientScheduleStageVaccine getClientScheduleStageVaccinefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClientScheduleStageVaccinefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClientScheduleStageVaccine getClientScheduleStageVaccinefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClientScheduleStageVaccine.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClientScheduleStageVaccine.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClientScheduleStageVaccine class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClientScheduleStageVaccine)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClientScheduleStageVaccine.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClientScheduleStageVaccine ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClientScheduleStageVaccine)factory.getImportedDomainObject(ClientScheduleStageVaccine.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClientScheduleStageVaccine();
		}
		String keyClassName = "ClientScheduleStageVaccine";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClientScheduleStageVaccine)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClientScheduleStageVaccine obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("stageVaccine");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStageVaccine(ims.pci.domain.objects.StageVaccine.getStageVaccinefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scheduleType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setScheduleType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("scheduledDate");
		if(fldEl != null)
		{	
    		obj.setScheduledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("deliveredDate");
		if(fldEl != null)
		{	
    		obj.setDeliveredDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("terminatedDate");
		if(fldEl != null)
		{	
    		obj.setTerminatedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("vaccineManufacturer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVaccineManufacturer(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("expiryDate");
		if(fldEl != null)
		{	
    		obj.setExpiryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("batchNumber");
		if(fldEl != null)
		{	
    		obj.setBatchNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("paymentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPaymentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deliveredByMedic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDeliveredByMedic(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("deliveredByGp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDeliveredByGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("paymentGp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPaymentGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("terminatedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTerminatedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("terminationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTerminationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isDeleted");
		if(fldEl != null)
		{	
    		obj.setIsDeleted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isExtracted");
		if(fldEl != null)
		{	
    		obj.setIsExtracted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("personRecordingDelivery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPersonRecordingDelivery(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCancelled");
		if(fldEl != null)
		{	
    		obj.setIsCancelled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cancelledBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCancelledBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cancellationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancellationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancellationDateTime");
		if(fldEl != null)
		{	
    		obj.setCancellationDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String StageVaccine = "stageVaccine";
		public static final String ScheduleType = "scheduleType";
		public static final String ScheduledDate = "scheduledDate";
		public static final String DeliveredDate = "deliveredDate";
		public static final String TerminatedDate = "terminatedDate";
		public static final String VaccineManufacturer = "vaccineManufacturer";
		public static final String ExpiryDate = "expiryDate";
		public static final String BatchNumber = "batchNumber";
		public static final String PaymentType = "paymentType";
		public static final String DeliveredByMedic = "deliveredByMedic";
		public static final String DeliveredByGp = "deliveredByGp";
		public static final String PaymentGp = "paymentGp";
		public static final String TerminatedBy = "terminatedBy";
		public static final String TerminationReason = "terminationReason";
		public static final String IsDeleted = "isDeleted";
		public static final String IsExtracted = "isExtracted";
		public static final String PersonRecordingDelivery = "personRecordingDelivery";
		public static final String IsCancelled = "isCancelled";
		public static final String CancelledBy = "cancelledBy";
		public static final String CancellationReason = "cancellationReason";
		public static final String CancellationDateTime = "cancellationDateTime";
	}
}

