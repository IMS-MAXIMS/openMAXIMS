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
package ims.correspondence.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class CorrespondenceDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1052100001;
	private static final long serialVersionUID = 1052100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** PAS Event */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Current Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** Historic Status of CSP Details record
	  * Collection of ims.correspondence.domain.objects.CorrespondenceStatusHistory.
	  */
	private java.util.Set cspStatusHistory;
	/** Discharge Categories 
	  * Collection of ims.correspondence.domain.objects.CategoryNotes.
	  */
	private java.util.List categories;
	/** document recipient(s)
	  * Collection of ims.correspondence.domain.objects.Recipient.
	  */
	private java.util.List recipients;
	/** Current Document */
	private ims.core.documents.domain.objects.Document currentDocument;
	/** Document Detail signed byMOS-HCP */
	private ims.core.resource.people.domain.objects.Medic signedBy;
	/** Special Interest Type */
	private ims.domain.lookups.LookupInstance specialInterest;
	/** Date Of Clinic */
	private java.util.Date dateOfClinic;
	/** Admission Date */
	private java.util.Date admissionDate;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** DictatedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff dictatedBy;
	/** Dictated By Initials */
	private String dictatedByInitials;
	/** TypedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff typedBy;
	/** TypedByInitials */
	private String typedByInitials;
	/** EnquiriesTo */
	private ims.core.resource.people.domain.objects.MemberOfStaff enquiriesTo;
	/** WasTypedWithoutCaseNotes */
	private Boolean wasTypedWithoutCaseNotes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CorrespondenceDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CorrespondenceDetails ()
    {
    	super();
    }
    public CorrespondenceDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.correspondence.domain.objects.CorrespondenceDetails.class;
	}


	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public static CorrespondenceDetails getCorrespondenceDetailsFromPasEvent(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from CorrespondenceDetails c where c.pasEvent.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. CorrespondenceDetails.pasEvent.id = " + id + " returned " + l.size() + " records. " );
		return (CorrespondenceDetails)l.get(0);
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Set getCspStatusHistory() {
		if ( null == cspStatusHistory ) {
			cspStatusHistory = new java.util.HashSet();
		}
		return cspStatusHistory;
	}
	public void setCspStatusHistory(java.util.Set paramValue) {
		this.cspStatusHistory = paramValue;
	}

	public java.util.List getCategories() {
		if ( null == categories ) {
			categories = new java.util.ArrayList();
		}
		return categories;
	}
	public void setCategories(java.util.List paramValue) {
		this.categories = paramValue;
	}

	public java.util.List getRecipients() {
		if ( null == recipients ) {
			recipients = new java.util.ArrayList();
		}
		return recipients;
	}
	public void setRecipients(java.util.List paramValue) {
		this.recipients = paramValue;
	}

	public ims.core.documents.domain.objects.Document getCurrentDocument() {
		return currentDocument;
	}
	public void setCurrentDocument(ims.core.documents.domain.objects.Document currentDocument) {
		this.currentDocument = currentDocument;
	}

	public ims.core.resource.people.domain.objects.Medic getSignedBy() {
		return signedBy;
	}
	public void setSignedBy(ims.core.resource.people.domain.objects.Medic signedBy) {
		this.signedBy = signedBy;
	}

	public ims.domain.lookups.LookupInstance getSpecialInterest() {
		return specialInterest;
	}
	public void setSpecialInterest(ims.domain.lookups.LookupInstance specialInterest) {
		this.specialInterest = specialInterest;
	}

	public java.util.Date getDateOfClinic() {
		return dateOfClinic;
	}
	public void setDateOfClinic(java.util.Date dateOfClinic) {
		this.dateOfClinic = dateOfClinic;
	}

	public java.util.Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(java.util.Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getDictatedBy() {
		return dictatedBy;
	}
	public void setDictatedBy(ims.core.resource.people.domain.objects.MemberOfStaff dictatedBy) {
		this.dictatedBy = dictatedBy;
	}

	public String getDictatedByInitials() {
		return dictatedByInitials;
	}
	public void setDictatedByInitials(String dictatedByInitials) {
		if ( null != dictatedByInitials && dictatedByInitials.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dictatedByInitials. Tried to set value: "+
				dictatedByInitials);
		}
		this.dictatedByInitials = dictatedByInitials;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getTypedBy() {
		return typedBy;
	}
	public void setTypedBy(ims.core.resource.people.domain.objects.MemberOfStaff typedBy) {
		this.typedBy = typedBy;
	}

	public String getTypedByInitials() {
		return typedByInitials;
	}
	public void setTypedByInitials(String typedByInitials) {
		if ( null != typedByInitials && typedByInitials.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for typedByInitials. Tried to set value: "+
				typedByInitials);
		}
		this.typedByInitials = typedByInitials;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getEnquiriesTo() {
		return enquiriesTo;
	}
	public void setEnquiriesTo(ims.core.resource.people.domain.objects.MemberOfStaff enquiriesTo) {
		this.enquiriesTo = enquiriesTo;
	}

	public Boolean isWasTypedWithoutCaseNotes() {
		return wasTypedWithoutCaseNotes;
	}
	public void setWasTypedWithoutCaseNotes(Boolean wasTypedWithoutCaseNotes) {
		this.wasTypedWithoutCaseNotes = wasTypedWithoutCaseNotes;
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
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cspStatusHistory* :");
		if (cspStatusHistory != null)
		{
			java.util.Iterator it3 = cspStatusHistory.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.correspondence.domain.objects.CorrespondenceStatusHistory obj = (ims.correspondence.domain.objects.CorrespondenceStatusHistory)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*categories* :");
		if (categories != null)
		{
		int i4=0;
		for (i4=0; i4<categories.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.correspondence.domain.objects.CategoryNotes obj = (ims.correspondence.domain.objects.CategoryNotes)categories.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recipients* :");
		if (recipients != null)
		{
		int i5=0;
		for (i5=0; i5<recipients.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.correspondence.domain.objects.Recipient obj = (ims.correspondence.domain.objects.Recipient)recipients.get(i5);
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
		auditStr.append("\r\n*currentDocument* :");
		if (currentDocument != null)
		{
			auditStr.append(toShortClassName(currentDocument));
				
		    auditStr.append(currentDocument.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*signedBy* :");
		if (signedBy != null)
		{
			auditStr.append(toShortClassName(signedBy));
				
		    auditStr.append(signedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialInterest* :");
		if (specialInterest != null)
			auditStr.append(specialInterest.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfClinic* :");
		auditStr.append(dateOfClinic);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDate* :");
		auditStr.append(admissionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dictatedBy* :");
		if (dictatedBy != null)
		{
			auditStr.append(toShortClassName(dictatedBy));
				
		    auditStr.append(dictatedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dictatedByInitials* :");
		auditStr.append(dictatedByInitials);
	    auditStr.append("; ");
		auditStr.append("\r\n*typedBy* :");
		if (typedBy != null)
		{
			auditStr.append(toShortClassName(typedBy));
				
		    auditStr.append(typedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*typedByInitials* :");
		auditStr.append(typedByInitials);
	    auditStr.append("; ");
		auditStr.append("\r\n*enquiriesTo* :");
		if (enquiriesTo != null)
		{
			auditStr.append(toShortClassName(enquiriesTo));
				
		    auditStr.append(enquiriesTo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasTypedWithoutCaseNotes* :");
		auditStr.append(wasTypedWithoutCaseNotes);
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
		
		String keyClassName = "CorrespondenceDetails";
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
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.getCspStatusHistory() != null)
		{
			if (this.getCspStatusHistory().size() > 0 )
			{
			sb.append("<cspStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCspStatusHistory(), domMap));
			sb.append("</cspStatusHistory>");		
			}
		}
		if (this.getCategories() != null)
		{
			if (this.getCategories().size() > 0 )
			{
			sb.append("<categories>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCategories(), domMap));
			sb.append("</categories>");		
			}
		}
		if (this.getRecipients() != null)
		{
			if (this.getRecipients().size() > 0 )
			{
			sb.append("<recipients>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRecipients(), domMap));
			sb.append("</recipients>");		
			}
		}
		if (this.getCurrentDocument() != null)
		{
			sb.append("<currentDocument>");
			sb.append(this.getCurrentDocument().toXMLString(domMap)); 	
			sb.append("</currentDocument>");		
		}
		if (this.getSignedBy() != null)
		{
			sb.append("<signedBy>");
			sb.append(this.getSignedBy().toXMLString(domMap)); 	
			sb.append("</signedBy>");		
		}
		if (this.getSpecialInterest() != null)
		{
			sb.append("<specialInterest>");
			sb.append(this.getSpecialInterest().toXMLString()); 
			sb.append("</specialInterest>");		
		}
		if (this.getDateOfClinic() != null)
		{
			sb.append("<dateOfClinic>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfClinic()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfClinic>");		
		}
		if (this.getAdmissionDate() != null)
		{
			sb.append("<admissionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDate>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getDictatedBy() != null)
		{
			sb.append("<dictatedBy>");
			sb.append(this.getDictatedBy().toXMLString(domMap)); 	
			sb.append("</dictatedBy>");		
		}
		if (this.getDictatedByInitials() != null)
		{
			sb.append("<dictatedByInitials>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDictatedByInitials().toString()));
			sb.append("</dictatedByInitials>");		
		}
		if (this.getTypedBy() != null)
		{
			sb.append("<typedBy>");
			sb.append(this.getTypedBy().toXMLString(domMap)); 	
			sb.append("</typedBy>");		
		}
		if (this.getTypedByInitials() != null)
		{
			sb.append("<typedByInitials>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTypedByInitials().toString()));
			sb.append("</typedByInitials>");		
		}
		if (this.getEnquiriesTo() != null)
		{
			sb.append("<enquiriesTo>");
			sb.append(this.getEnquiriesTo().toXMLString(domMap)); 	
			sb.append("</enquiriesTo>");		
		}
		if (this.isWasTypedWithoutCaseNotes() != null)
		{
			sb.append("<wasTypedWithoutCaseNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasTypedWithoutCaseNotes().toString()));
			sb.append("</wasTypedWithoutCaseNotes>");		
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
			CorrespondenceDetails domainObject = getCorrespondenceDetailsfromXML(itemEl, factory, domMap);

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
			CorrespondenceDetails domainObject = getCorrespondenceDetailsfromXML(itemEl, factory, domMap);

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
		
	public static CorrespondenceDetails getCorrespondenceDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCorrespondenceDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CorrespondenceDetails getCorrespondenceDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CorrespondenceDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CorrespondenceDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CorrespondenceDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CorrespondenceDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CorrespondenceDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CorrespondenceDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CorrespondenceDetails)factory.getImportedDomainObject(CorrespondenceDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CorrespondenceDetails();
		}
		String keyClassName = "CorrespondenceDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CorrespondenceDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CorrespondenceDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cspStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCspStatusHistory(ims.correspondence.domain.objects.CorrespondenceStatusHistory.fromSetXMLString(fldEl, factory, obj.getCspStatusHistory(), domMap));
		}
		fldEl = el.element("categories");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCategories(ims.correspondence.domain.objects.CategoryNotes.fromListXMLString(fldEl, factory, obj.getCategories(), domMap));
		}
		fldEl = el.element("recipients");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRecipients(ims.correspondence.domain.objects.Recipient.fromListXMLString(fldEl, factory, obj.getRecipients(), domMap));
		}
		fldEl = el.element("currentDocument");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentDocument(ims.core.documents.domain.objects.Document.getDocumentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("signedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSignedBy(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialInterest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialInterest(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateOfClinic");
		if(fldEl != null)
		{	
    		obj.setDateOfClinic(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("admissionDate");
		if(fldEl != null)
		{	
    		obj.setAdmissionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dictatedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDictatedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dictatedByInitials");
		if(fldEl != null)
		{	
    		obj.setDictatedByInitials(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("typedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTypedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("typedByInitials");
		if(fldEl != null)
		{	
    		obj.setTypedByInitials(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("enquiriesTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEnquiriesTo(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasTypedWithoutCaseNotes");
		if(fldEl != null)
		{	
    		obj.setWasTypedWithoutCaseNotes(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "cspStatusHistory"
		, "categories"
		, "recipients"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PasEvent = "pasEvent";
		public static final String CurrentStatus = "currentStatus";
		public static final String CspStatusHistory = "cspStatusHistory";
		public static final String Categories = "categories";
		public static final String Recipients = "recipients";
		public static final String CurrentDocument = "currentDocument";
		public static final String SignedBy = "signedBy";
		public static final String SpecialInterest = "specialInterest";
		public static final String DateOfClinic = "dateOfClinic";
		public static final String AdmissionDate = "admissionDate";
		public static final String DischargeDate = "dischargeDate";
		public static final String DictatedBy = "dictatedBy";
		public static final String DictatedByInitials = "dictatedByInitials";
		public static final String TypedBy = "typedBy";
		public static final String TypedByInitials = "typedByInitials";
		public static final String EnquiriesTo = "enquiriesTo";
		public static final String WasTypedWithoutCaseNotes = "wasTypedWithoutCaseNotes";
	}
}

