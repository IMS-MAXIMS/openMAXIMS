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
 * Generic info about a PAS event
 * @author John MacEnri
 * Generated.
 */


public class PASEvent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100003;
	private static final long serialVersionUID = 1014100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Admit DT for inp, Attend DT for OP & AE */
	private java.util.Date eventDateTime;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** PAS Event Number */
	private String pasEventId;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Medic consultant;
	/** Location */
	private ims.core.resource.place.domain.objects.Location location;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	private ims.domain.lookups.LookupInstance sourceOfReferral;
	private Boolean isVip;
	/** referringGP */
	private ims.core.resource.people.domain.objects.Gp referringGP;
	/** GP Surgery at which Patient Attended */
	private ims.core.resource.place.domain.objects.LocSite referringGpSurgery;
	/** Practice at which Patient Attended */
	private ims.core.resource.place.domain.objects.Organisation referringGpPractice;
	/** Type of PAS Event */
	private ims.domain.lookups.LookupInstance eventType;
	/** Correspondence Current Document Status */
	private ims.domain.lookups.LookupInstance cspDocumentStatus;
	/** The episode id contained ADT messages if the flag INSTANTIATE_EPISODE_FROM_ADT is set */
	private String pasEpisodeId;
	/** PAS Specialty uused in CCO for holing internal PAS Specialty value */
	private ims.domain.lookups.LookupInstance pASSpecialty;
	/** Episode Financial Class */
	private ims.domain.lookups.LookupInstance episodeFinancialClass;
	/** PV1-7 */
	private ims.core.resource.people.domain.objects.Hcp attendingHCP;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PASEvent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PASEvent ()
    {
    	super();
    }
    public PASEvent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.PASEvent.class;
	}


	public java.util.Date getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(java.util.Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getPasEventId() {
		return pasEventId;
	}
	public void setPasEventId(String pasEventId) {
		if ( null != pasEventId && pasEventId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pasEventId. Tried to set value: "+
				pasEventId);
		}
		this.pasEventId = pasEventId;
	}

	public ims.core.resource.people.domain.objects.Medic getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Medic consultant) {
		this.consultant = consultant;
	}

	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.domain.lookups.LookupInstance getSourceOfReferral() {
		return sourceOfReferral;
	}
	public void setSourceOfReferral(ims.domain.lookups.LookupInstance sourceOfReferral) {
		this.sourceOfReferral = sourceOfReferral;
	}

	public Boolean isIsVip() {
		return isVip;
	}
	public void setIsVip(Boolean isVip) {
		this.isVip = isVip;
	}

	public ims.core.resource.people.domain.objects.Gp getReferringGP() {
		return referringGP;
	}
	public void setReferringGP(ims.core.resource.people.domain.objects.Gp referringGP) {
		this.referringGP = referringGP;
	}

	public ims.core.resource.place.domain.objects.LocSite getReferringGpSurgery() {
		return referringGpSurgery;
	}
	public void setReferringGpSurgery(ims.core.resource.place.domain.objects.LocSite referringGpSurgery) {
		this.referringGpSurgery = referringGpSurgery;
	}

	public ims.core.resource.place.domain.objects.Organisation getReferringGpPractice() {
		return referringGpPractice;
	}
	public void setReferringGpPractice(ims.core.resource.place.domain.objects.Organisation referringGpPractice) {
		this.referringGpPractice = referringGpPractice;
	}

	public ims.domain.lookups.LookupInstance getEventType() {
		return eventType;
	}
	public void setEventType(ims.domain.lookups.LookupInstance eventType) {
		this.eventType = eventType;
	}

	public ims.domain.lookups.LookupInstance getCspDocumentStatus() {
		return cspDocumentStatus;
	}
	public void setCspDocumentStatus(ims.domain.lookups.LookupInstance cspDocumentStatus) {
		this.cspDocumentStatus = cspDocumentStatus;
	}

	public String getPasEpisodeId() {
		return pasEpisodeId;
	}
	public void setPasEpisodeId(String pasEpisodeId) {
		if ( null != pasEpisodeId && pasEpisodeId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pasEpisodeId. Tried to set value: "+
				pasEpisodeId);
		}
		this.pasEpisodeId = pasEpisodeId;
	}

	public ims.domain.lookups.LookupInstance getPASSpecialty() {
		return pASSpecialty;
	}
	public void setPASSpecialty(ims.domain.lookups.LookupInstance pASSpecialty) {
		this.pASSpecialty = pASSpecialty;
	}

	public ims.domain.lookups.LookupInstance getEpisodeFinancialClass() {
		return episodeFinancialClass;
	}
	public void setEpisodeFinancialClass(ims.domain.lookups.LookupInstance episodeFinancialClass) {
		this.episodeFinancialClass = episodeFinancialClass;
	}

	public ims.core.resource.people.domain.objects.Hcp getAttendingHCP() {
		return attendingHCP;
	}
	public void setAttendingHCP(ims.core.resource.people.domain.objects.Hcp attendingHCP) {
		this.attendingHCP = attendingHCP;
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
	// method generated based on 'pasevent_unq1' unique index.
	public static boolean recordExistForPatientAndPasEventId(ims.domain.ILightweightDomainFactory factory,
		 ims.core.patient.domain.objects.Patient patient
	,
	 String pasEventId
	)	
	{
		return recordExistForPatientAndPasEventId(factory, patient, pasEventId, null);
	}	

	// method generated based on 'pasevent_unq1' unique index.
	public static boolean recordExistForPatientAndPasEventId(ims.domain.ILightweightDomainFactory factory,
		 ims.core.patient.domain.objects.Patient patient
	,
	 String pasEventId
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from PASEvent c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		hql.append(" and "); 
		hql.append(" c.pasEventId = :pasEventId ");
		names[1] = "pasEventId";
		values[1] = pasEventId;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'pasevent_unq1' unique index.
	public static PASEvent getRecordByPatientAndPasEventId(ims.domain.ILightweightDomainFactory factory,
	 ims.core.patient.domain.objects.Patient patient
	,
	 String pasEventId
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from PASEvent c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		hql.append(" and "); 
		hql.append(" c.pasEventId = :pasEventId ");
		names[1] = "pasEventId";
		values[1] = pasEventId;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PASEvent)l.get(0);
	}

	public static PASEvent getPASEventFrompasevent_unq1(ims.domain.ILightweightDomainFactory factory,
	 ims.core.patient.domain.objects.Patient patient
	,
	 String pasEventId
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from PASEvent c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		hql.append(" and "); 
		hql.append(" c.pasEventId = :pasEventId ");
		names[1] = "pasEventId";
		values[1] = pasEventId;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PASEvent)l.get(0);
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
		
		auditStr.append("\r\n*eventDateTime* :");
		auditStr.append(eventDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEventId* :");
		auditStr.append(pasEventId);
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfReferral* :");
		if (sourceOfReferral != null)
			auditStr.append(sourceOfReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isVip* :");
		auditStr.append(isVip);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringGP* :");
		if (referringGP != null)
		{
			auditStr.append(toShortClassName(referringGP));
				
		    auditStr.append(referringGP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringGpSurgery* :");
		if (referringGpSurgery != null)
		{
			auditStr.append(toShortClassName(referringGpSurgery));
				
		    auditStr.append(referringGpSurgery.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringGpPractice* :");
		if (referringGpPractice != null)
		{
			auditStr.append(toShortClassName(referringGpPractice));
				
		    auditStr.append(referringGpPractice.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*eventType* :");
		if (eventType != null)
			auditStr.append(eventType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cspDocumentStatus* :");
		if (cspDocumentStatus != null)
			auditStr.append(cspDocumentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEpisodeId* :");
		auditStr.append(pasEpisodeId);
	    auditStr.append("; ");
		auditStr.append("\r\n*pASSpecialty* :");
		if (pASSpecialty != null)
			auditStr.append(pASSpecialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeFinancialClass* :");
		if (episodeFinancialClass != null)
			auditStr.append(episodeFinancialClass.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attendingHCP* :");
		if (attendingHCP != null)
		{
			auditStr.append(toShortClassName(attendingHCP));
				
		    auditStr.append(attendingHCP.getId());
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
		
		String keyClassName = "PASEvent";
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
		if (this.getEventDateTime() != null)
		{
			sb.append("<eventDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEventDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eventDateTime>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getPasEventId() != null)
		{
			sb.append("<pasEventId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPasEventId().toString()));
			sb.append("</pasEventId>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getSourceOfReferral() != null)
		{
			sb.append("<sourceOfReferral>");
			sb.append(this.getSourceOfReferral().toXMLString()); 
			sb.append("</sourceOfReferral>");		
		}
		if (this.isIsVip() != null)
		{
			sb.append("<isVip>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsVip().toString()));
			sb.append("</isVip>");		
		}
		if (this.getReferringGP() != null)
		{
			sb.append("<referringGP>");
			sb.append(this.getReferringGP().toXMLString(domMap)); 	
			sb.append("</referringGP>");		
		}
		if (this.getReferringGpSurgery() != null)
		{
			sb.append("<referringGpSurgery>");
			sb.append(this.getReferringGpSurgery().toXMLString(domMap)); 	
			sb.append("</referringGpSurgery>");		
		}
		if (this.getReferringGpPractice() != null)
		{
			sb.append("<referringGpPractice>");
			sb.append(this.getReferringGpPractice().toXMLString(domMap)); 	
			sb.append("</referringGpPractice>");		
		}
		if (this.getEventType() != null)
		{
			sb.append("<eventType>");
			sb.append(this.getEventType().toXMLString()); 
			sb.append("</eventType>");		
		}
		if (this.getCspDocumentStatus() != null)
		{
			sb.append("<cspDocumentStatus>");
			sb.append(this.getCspDocumentStatus().toXMLString()); 
			sb.append("</cspDocumentStatus>");		
		}
		if (this.getPasEpisodeId() != null)
		{
			sb.append("<pasEpisodeId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPasEpisodeId().toString()));
			sb.append("</pasEpisodeId>");		
		}
		if (this.getPASSpecialty() != null)
		{
			sb.append("<pASSpecialty>");
			sb.append(this.getPASSpecialty().toXMLString()); 
			sb.append("</pASSpecialty>");		
		}
		if (this.getEpisodeFinancialClass() != null)
		{
			sb.append("<episodeFinancialClass>");
			sb.append(this.getEpisodeFinancialClass().toXMLString()); 
			sb.append("</episodeFinancialClass>");		
		}
		if (this.getAttendingHCP() != null)
		{
			sb.append("<attendingHCP>");
			sb.append(this.getAttendingHCP().toXMLString(domMap)); 	
			sb.append("</attendingHCP>");		
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
			PASEvent domainObject = getPASEventfromXML(itemEl, factory, domMap);

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
			PASEvent domainObject = getPASEventfromXML(itemEl, factory, domMap);

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
		
	public static PASEvent getPASEventfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPASEventfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PASEvent getPASEventfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PASEvent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PASEvent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PASEvent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PASEvent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PASEvent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PASEvent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PASEvent)factory.getImportedDomainObject(PASEvent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PASEvent();
		}
		String keyClassName = "PASEvent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PASEvent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PASEvent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("eventDateTime");
		if(fldEl != null)
		{	
    		obj.setEventDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pasEventId");
		if(fldEl != null)
		{	
    		obj.setPasEventId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sourceOfReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isVip");
		if(fldEl != null)
		{	
    		obj.setIsVip(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referringGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringGP(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringGpSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringGpSurgery(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringGpPractice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringGpPractice(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("eventType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEventType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cspDocumentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCspDocumentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pasEpisodeId");
		if(fldEl != null)
		{	
    		obj.setPasEpisodeId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pASSpecialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPASSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("episodeFinancialClass");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEpisodeFinancialClass(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attendingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
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
		public static final String EventDateTime = "eventDateTime";
		public static final String Patient = "patient";
		public static final String PasEventId = "pasEventId";
		public static final String Consultant = "consultant";
		public static final String Location = "location";
		public static final String Specialty = "specialty";
		public static final String SourceOfReferral = "sourceOfReferral";
		public static final String IsVip = "isVip";
		public static final String ReferringGP = "referringGP";
		public static final String ReferringGpSurgery = "referringGpSurgery";
		public static final String ReferringGpPractice = "referringGpPractice";
		public static final String EventType = "eventType";
		public static final String CspDocumentStatus = "cspDocumentStatus";
		public static final String PasEpisodeId = "pasEpisodeId";
		public static final String PASSpecialty = "pASSpecialty";
		public static final String EpisodeFinancialClass = "episodeFinancialClass";
		public static final String AttendingHCP = "attendingHCP";
	}
}

