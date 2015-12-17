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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class CancerMDTMeeting extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100017;
	private static final long serialVersionUID = 1074100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** MDT Date */
	private java.util.Date date;
	/** CoMorbidityAssessment */
	private ims.domain.lookups.LookupInstance coMorbidityAssessment;
	/** Notes */
	private String notes;
	/** PatientPerformanceStatus */
	private ims.domain.lookups.LookupInstance patientPerformanceStatus;
	/** MDTLocation */
	private ims.core.resource.place.domain.objects.Location mDTLocation;
	/** AssociatedCarePlan */
	private ims.oncology.domain.objects.CancerCarePlan associatedCarePlan;
	/** HCP
	  * Collection of ims.oncology.domain.objects.InvitedHCP.
	  */
	private java.util.Set invitedHCP;
	/** OthersPresent
	  * Collection of String.
	  */
	private java.util.List othersPresent;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CancerMDTMeeting (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CancerMDTMeeting ()
    {
    	super();
    }
    public CancerMDTMeeting (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.CancerMDTMeeting.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public ims.domain.lookups.LookupInstance getCoMorbidityAssessment() {
		return coMorbidityAssessment;
	}
	public void setCoMorbidityAssessment(ims.domain.lookups.LookupInstance coMorbidityAssessment) {
		this.coMorbidityAssessment = coMorbidityAssessment;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public ims.domain.lookups.LookupInstance getPatientPerformanceStatus() {
		return patientPerformanceStatus;
	}
	public void setPatientPerformanceStatus(ims.domain.lookups.LookupInstance patientPerformanceStatus) {
		this.patientPerformanceStatus = patientPerformanceStatus;
	}

	public ims.core.resource.place.domain.objects.Location getMDTLocation() {
		return mDTLocation;
	}
	public void setMDTLocation(ims.core.resource.place.domain.objects.Location mDTLocation) {
		this.mDTLocation = mDTLocation;
	}

	public ims.oncology.domain.objects.CancerCarePlan getAssociatedCarePlan() {
		return associatedCarePlan;
	}
	public void setAssociatedCarePlan(ims.oncology.domain.objects.CancerCarePlan associatedCarePlan) {
		this.associatedCarePlan = associatedCarePlan;
	}

	public java.util.Set getInvitedHCP() {
		if ( null == invitedHCP ) {
			invitedHCP = new java.util.HashSet();
		}
		return invitedHCP;
	}
	public void setInvitedHCP(java.util.Set paramValue) {
		this.invitedHCP = paramValue;
	}

	public java.util.List getOthersPresent() {
		if ( null == othersPresent ) {
			othersPresent = new java.util.ArrayList();
		}
		return othersPresent;
	}
	public void setOthersPresent(java.util.List othersPresent) {
		this.othersPresent = othersPresent;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*date* :");
		auditStr.append(date);
	    auditStr.append("; ");
		auditStr.append("\r\n*coMorbidityAssessment* :");
		if (coMorbidityAssessment != null)
			auditStr.append(coMorbidityAssessment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientPerformanceStatus* :");
		if (patientPerformanceStatus != null)
			auditStr.append(patientPerformanceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mDTLocation* :");
		if (mDTLocation != null)
		{
			auditStr.append(toShortClassName(mDTLocation));
				
		    auditStr.append(mDTLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedCarePlan* :");
		if (associatedCarePlan != null)
		{
			auditStr.append(toShortClassName(associatedCarePlan));
				
		    auditStr.append(associatedCarePlan.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*invitedHCP* :");
		if (invitedHCP != null)
		{
			java.util.Iterator it9 = invitedHCP.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.oncology.domain.objects.InvitedHCP obj = (ims.oncology.domain.objects.InvitedHCP)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*othersPresent* :");
		if (othersPresent != null)
		{
			java.util.Iterator it10 = othersPresent.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				String obj = (String)it10.next();
	auditStr.append(obj);		
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
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
		
		String keyClassName = "CancerMDTMeeting";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getDate() != null)
		{
			sb.append("<date>");
			sb.append(new ims.framework.utils.DateTime(this.getDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</date>");		
		}
		if (this.getCoMorbidityAssessment() != null)
		{
			sb.append("<coMorbidityAssessment>");
			sb.append(this.getCoMorbidityAssessment().toXMLString()); 
			sb.append("</coMorbidityAssessment>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getPatientPerformanceStatus() != null)
		{
			sb.append("<patientPerformanceStatus>");
			sb.append(this.getPatientPerformanceStatus().toXMLString()); 
			sb.append("</patientPerformanceStatus>");		
		}
		if (this.getMDTLocation() != null)
		{
			sb.append("<mDTLocation>");
			sb.append(this.getMDTLocation().toXMLString(domMap)); 	
			sb.append("</mDTLocation>");		
		}
		if (this.getAssociatedCarePlan() != null)
		{
			sb.append("<associatedCarePlan>");
			sb.append(this.getAssociatedCarePlan().toXMLString(domMap)); 	
			sb.append("</associatedCarePlan>");		
		}
		if (this.getInvitedHCP() != null)
		{
			if (this.getInvitedHCP().size() > 0 )
			{
			sb.append("<invitedHCP>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvitedHCP(), domMap));
			sb.append("</invitedHCP>");		
			}
		}
		if (this.getOthersPresent() != null)
		{
			if (this.getOthersPresent().size() > 0 )
			{
			sb.append("<othersPresent>");
			sb.append("<list>");
			java.util.Iterator iter = this.getOthersPresent().iterator();
			while (iter.hasNext())
			{
				sb.append("<item>");
				sb.append(ims.framework.utils.StringUtils.encodeXML(iter.next().toString()));
				sb.append("</item>");
			}
			sb.append("</list>");			
			sb.append("</othersPresent>");		
			}
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
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
			CancerMDTMeeting domainObject = getCancerMDTMeetingfromXML(itemEl, factory, domMap);

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
			CancerMDTMeeting domainObject = getCancerMDTMeetingfromXML(itemEl, factory, domMap);

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
		
	public static CancerMDTMeeting getCancerMDTMeetingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCancerMDTMeetingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CancerMDTMeeting getCancerMDTMeetingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CancerMDTMeeting.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CancerMDTMeeting.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CancerMDTMeeting class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CancerMDTMeeting)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CancerMDTMeeting.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CancerMDTMeeting ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CancerMDTMeeting)factory.getImportedDomainObject(CancerMDTMeeting.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CancerMDTMeeting();
		}
		String keyClassName = "CancerMDTMeeting";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CancerMDTMeeting)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CancerMDTMeeting obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("date");
		if(fldEl != null)
		{	
    		obj.setDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("coMorbidityAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCoMorbidityAssessment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientPerformanceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientPerformanceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mDTLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMDTLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("associatedCarePlan");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedCarePlan(ims.oncology.domain.objects.CancerCarePlan.getCancerCarePlanfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("invitedHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvitedHCP(ims.oncology.domain.objects.InvitedHCP.fromSetXMLString(fldEl, factory, obj.getInvitedHCP(), domMap));
		}
		fldEl = el.element("othersPresent");
		if(fldEl != null)
		{
  			fldEl = fldEl.element("list");
			java.util.List elList = fldEl.elements("item");
    		java.util.List objList = obj.getOthersPresent();
			if (objList == null)
				objList = new java.util.ArrayList();
			
    		int i;
    		for (i=0; i < elList.size(); i++)
    		{
				org.dom4j.Element itemEl = (org.dom4j.Element)elList.get(i);
				String lstValue = new String(itemEl.getTextTrim());
    			int idx = objList.indexOf(lstValue);
    			if (idx == -1)
    				objList.add(i, lstValue);
    			else if (i != idx && i < objList.size())
    			{
    				String tmp = (String) objList.get(i);
    				objList.set(i, lstValue);
    				objList.set(idx, tmp);    				
    			}
    		}
    		i = objList.size();
    		while (i > elList.size())
    		{
    			objList.remove(i-1);
    			i = objList.size();
    		}	
			
    		obj.setOthersPresent(objList);
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "invitedHCP"
		, "othersPresent"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String Date = "date";
		public static final String CoMorbidityAssessment = "coMorbidityAssessment";
		public static final String Notes = "notes";
		public static final String PatientPerformanceStatus = "patientPerformanceStatus";
		public static final String MDTLocation = "mDTLocation";
		public static final String AssociatedCarePlan = "associatedCarePlan";
		public static final String InvitedHCP = "invitedHCP";
		public static final String OthersPresent = "othersPresent";
		public static final String EpisodeOfCare = "episodeOfCare";
	}
}

