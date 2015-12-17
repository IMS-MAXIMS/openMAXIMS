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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PendingTransfers extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100013;
	private static final long serialVersionUID = 1014100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Inpatient Episode */
	private ims.core.admin.pas.domain.objects.InpatientEpisode inpatientEpisode;
	/** Destination Ward */
	private ims.core.resource.place.domain.objects.Location destinationWard;
	/** Ward Type -  Main or Side */
	private ims.domain.lookups.LookupInstance wardType;
	/** Transfer Request Date Time */
	private java.util.Date transferRequestDateTime;
	/** Current Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Medic consultant;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** PASSpecialty */
	private ims.domain.lookups.LookupInstance pASSpecialty;
	private ims.domain.lookups.LookupInstance transferReason;
	private String transferComment;
	/** Patient Status */
	private ims.domain.lookups.LookupInstance patientStatus;
	private java.util.Date bedAvailableDateTime;
	private ims.core.clinical.domain.objects.Service service;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PendingTransfers (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PendingTransfers ()
    {
    	super();
    }
    public PendingTransfers (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.PendingTransfers.class;
	}


	public ims.core.admin.pas.domain.objects.InpatientEpisode getInpatientEpisode() {
		return inpatientEpisode;
	}
	public static PendingTransfers getPendingTransfersFromInpatientEpisode(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from PendingTransfers c where c.inpatientEpisode.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. PendingTransfers.inpatientEpisode.id = " + id + " returned " + l.size() + " records. " );
		return (PendingTransfers)l.get(0);
	}
	public void setInpatientEpisode(ims.core.admin.pas.domain.objects.InpatientEpisode inpatientEpisode) {
		this.inpatientEpisode = inpatientEpisode;
	}

	public ims.core.resource.place.domain.objects.Location getDestinationWard() {
		return destinationWard;
	}
	public void setDestinationWard(ims.core.resource.place.domain.objects.Location destinationWard) {
		this.destinationWard = destinationWard;
	}

	public ims.domain.lookups.LookupInstance getWardType() {
		return wardType;
	}
	public void setWardType(ims.domain.lookups.LookupInstance wardType) {
		this.wardType = wardType;
	}

	public java.util.Date getTransferRequestDateTime() {
		return transferRequestDateTime;
	}
	public void setTransferRequestDateTime(java.util.Date transferRequestDateTime) {
		this.transferRequestDateTime = transferRequestDateTime;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
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

	public ims.domain.lookups.LookupInstance getPASSpecialty() {
		return pASSpecialty;
	}
	public void setPASSpecialty(ims.domain.lookups.LookupInstance pASSpecialty) {
		this.pASSpecialty = pASSpecialty;
	}

	public ims.domain.lookups.LookupInstance getTransferReason() {
		return transferReason;
	}
	public void setTransferReason(ims.domain.lookups.LookupInstance transferReason) {
		this.transferReason = transferReason;
	}

	public String getTransferComment() {
		return transferComment;
	}
	public void setTransferComment(String transferComment) {
		if ( null != transferComment && transferComment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transferComment. Tried to set value: "+
				transferComment);
		}
		this.transferComment = transferComment;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public java.util.Date getBedAvailableDateTime() {
		return bedAvailableDateTime;
	}
	public void setBedAvailableDateTime(java.util.Date bedAvailableDateTime) {
		this.bedAvailableDateTime = bedAvailableDateTime;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
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
		
		auditStr.append("\r\n*inpatientEpisode* :");
		if (inpatientEpisode != null)
		{
			auditStr.append(toShortClassName(inpatientEpisode));
				
		    auditStr.append(inpatientEpisode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*destinationWard* :");
		if (destinationWard != null)
		{
			auditStr.append(toShortClassName(destinationWard));
				
		    auditStr.append(destinationWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wardType* :");
		if (wardType != null)
			auditStr.append(wardType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferRequestDateTime* :");
		auditStr.append(transferRequestDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
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
		auditStr.append("\r\n*pASSpecialty* :");
		if (pASSpecialty != null)
			auditStr.append(pASSpecialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferReason* :");
		if (transferReason != null)
			auditStr.append(transferReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferComment* :");
		auditStr.append(transferComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bedAvailableDateTime* :");
		auditStr.append(bedAvailableDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
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
		
		String keyClassName = "PendingTransfers";
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
		if (this.getInpatientEpisode() != null)
		{
			sb.append("<inpatientEpisode>");
			sb.append(this.getInpatientEpisode().toXMLString(domMap)); 	
			sb.append("</inpatientEpisode>");		
		}
		if (this.getDestinationWard() != null)
		{
			sb.append("<destinationWard>");
			sb.append(this.getDestinationWard().toXMLString(domMap)); 	
			sb.append("</destinationWard>");		
		}
		if (this.getWardType() != null)
		{
			sb.append("<wardType>");
			sb.append(this.getWardType().toXMLString()); 
			sb.append("</wardType>");		
		}
		if (this.getTransferRequestDateTime() != null)
		{
			sb.append("<transferRequestDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTransferRequestDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transferRequestDateTime>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
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
		if (this.getPASSpecialty() != null)
		{
			sb.append("<pASSpecialty>");
			sb.append(this.getPASSpecialty().toXMLString()); 
			sb.append("</pASSpecialty>");		
		}
		if (this.getTransferReason() != null)
		{
			sb.append("<transferReason>");
			sb.append(this.getTransferReason().toXMLString()); 
			sb.append("</transferReason>");		
		}
		if (this.getTransferComment() != null)
		{
			sb.append("<transferComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransferComment().toString()));
			sb.append("</transferComment>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getBedAvailableDateTime() != null)
		{
			sb.append("<bedAvailableDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getBedAvailableDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</bedAvailableDateTime>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
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
			PendingTransfers domainObject = getPendingTransfersfromXML(itemEl, factory, domMap);

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
			PendingTransfers domainObject = getPendingTransfersfromXML(itemEl, factory, domMap);

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
		
	public static PendingTransfers getPendingTransfersfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPendingTransfersfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PendingTransfers getPendingTransfersfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PendingTransfers.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PendingTransfers.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PendingTransfers class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PendingTransfers)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PendingTransfers.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PendingTransfers ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PendingTransfers)factory.getImportedDomainObject(PendingTransfers.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PendingTransfers();
		}
		String keyClassName = "PendingTransfers";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PendingTransfers)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PendingTransfers obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("inpatientEpisode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInpatientEpisode(ims.core.admin.pas.domain.objects.InpatientEpisode.getInpatientEpisodefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("destinationWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDestinationWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wardType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWardType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferRequestDateTime");
		if(fldEl != null)
		{	
    		obj.setTransferRequestDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("pASSpecialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPASSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransferReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferComment");
		if(fldEl != null)
		{	
    		obj.setTransferComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bedAvailableDateTime");
		if(fldEl != null)
		{	
    		obj.setBedAvailableDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
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
		public static final String InpatientEpisode = "inpatientEpisode";
		public static final String DestinationWard = "destinationWard";
		public static final String WardType = "wardType";
		public static final String TransferRequestDateTime = "transferRequestDateTime";
		public static final String CurrentStatus = "currentStatus";
		public static final String Consultant = "consultant";
		public static final String Specialty = "specialty";
		public static final String PASSpecialty = "pASSpecialty";
		public static final String TransferReason = "transferReason";
		public static final String TransferComment = "transferComment";
		public static final String PatientStatus = "patientStatus";
		public static final String BedAvailableDateTime = "bedAvailableDateTime";
		public static final String Service = "service";
	}
}

