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
package ims.core.admin.domain.objects;

/**
 * Episode Of Care (Level 3 record)
 * @author Kevin O'Carroll
 * Generated.
 */


public class EpisodeOfCare extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100018;
	private static final long serialVersionUID = 1004100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Relationship */
	private ims.domain.lookups.LookupInstance relationship;
	/** CareContexts
	  * Collection of ims.core.admin.domain.objects.CareContext.
	  */
	private java.util.Set careContexts;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** Overall Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
	/** StartDate */
	private java.util.Date startDate;
	/** End Date */
	private java.util.Date endDate;
	/** Care Spell */
	private ims.core.admin.domain.objects.CareSpell careSpell;
	/** Linked Referrals
	  * Collection of ims.core.admin.domain.objects.Referral.
	  */
	private java.util.List linkedReferrals;
	/** Linked Referrals History
	  * Collection of ims.core.admin.domain.objects.Referral.
	  */
	private java.util.List linkedReferralsHistory;
	/** Current Referral linked to this episode */
	private ims.core.admin.domain.objects.Referral currentReferral;
	/** Episode Of Care History
	  * Collection of ims.core.admin.domain.objects.EpisodeOfCareHistory.
	  */
	private java.util.Set episodeOfCareHistory;
	/** Current Status */
	private ims.core.admin.domain.objects.EpisodeOfCareStatusHistory currentStatus;
	/** Status History
	  * Collection of ims.core.admin.domain.objects.EpisodeOfCareStatusHistory.
	  */
	private java.util.List statusHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EpisodeOfCare (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EpisodeOfCare ()
    {
    	super();
    }
    public EpisodeOfCare (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.EpisodeOfCare.class;
	}


	public ims.domain.lookups.LookupInstance getRelationship() {
		return relationship;
	}
	public void setRelationship(ims.domain.lookups.LookupInstance relationship) {
		this.relationship = relationship;
	}

	public java.util.Set getCareContexts() {
		if ( null == careContexts ) {
			careContexts = new java.util.HashSet();
		}
		return careContexts;
	}
	public void setCareContexts(java.util.Set paramValue) {
		this.careContexts = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public ims.core.admin.domain.objects.CareSpell getCareSpell() {
		return careSpell;
	}
	public void setCareSpell(ims.core.admin.domain.objects.CareSpell careSpell) {
		this.careSpell = careSpell;
	}

	public java.util.List getLinkedReferrals() {
		if ( null == linkedReferrals ) {
			linkedReferrals = new java.util.ArrayList();
		}
		return linkedReferrals;
	}
	public void setLinkedReferrals(java.util.List paramValue) {
		this.linkedReferrals = paramValue;
	}

	public java.util.List getLinkedReferralsHistory() {
		if ( null == linkedReferralsHistory ) {
			linkedReferralsHistory = new java.util.ArrayList();
		}
		return linkedReferralsHistory;
	}
	public void setLinkedReferralsHistory(java.util.List paramValue) {
		this.linkedReferralsHistory = paramValue;
	}

	public ims.core.admin.domain.objects.Referral getCurrentReferral() {
		return currentReferral;
	}
	public void setCurrentReferral(ims.core.admin.domain.objects.Referral currentReferral) {
		this.currentReferral = currentReferral;
	}

	public java.util.Set getEpisodeOfCareHistory() {
		if ( null == episodeOfCareHistory ) {
			episodeOfCareHistory = new java.util.HashSet();
		}
		return episodeOfCareHistory;
	}
	public void setEpisodeOfCareHistory(java.util.Set paramValue) {
		this.episodeOfCareHistory = paramValue;
	}

	public ims.core.admin.domain.objects.EpisodeOfCareStatusHistory getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.admin.domain.objects.EpisodeOfCareStatusHistory currentStatus) {
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
		
		auditStr.append("\r\n*relationship* :");
		if (relationship != null)
			auditStr.append(relationship.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*careContexts* :");
		if (careContexts != null)
		{
			java.util.Iterator it2 = careContexts.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.CareContext obj = (ims.core.admin.domain.objects.CareContext)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*careSpell* :");
		if (careSpell != null)
		{
			auditStr.append(toShortClassName(careSpell));
				
		    auditStr.append(careSpell.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedReferrals* :");
		if (linkedReferrals != null)
		{
		int i8=0;
		for (i8=0; i8<linkedReferrals.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.Referral obj = (ims.core.admin.domain.objects.Referral)linkedReferrals.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedReferralsHistory* :");
		if (linkedReferralsHistory != null)
		{
		int i9=0;
		for (i9=0; i9<linkedReferralsHistory.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.Referral obj = (ims.core.admin.domain.objects.Referral)linkedReferralsHistory.get(i9);
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
		auditStr.append("\r\n*currentReferral* :");
		if (currentReferral != null)
		{
			auditStr.append(toShortClassName(currentReferral));
				
		    auditStr.append(currentReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCareHistory* :");
		if (episodeOfCareHistory != null)
		{
			java.util.Iterator it11 = episodeOfCareHistory.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.EpisodeOfCareHistory obj = (ims.core.admin.domain.objects.EpisodeOfCareHistory)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
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
		int i13=0;
		for (i13=0; i13<statusHistory.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.admin.domain.objects.EpisodeOfCareStatusHistory obj = (ims.core.admin.domain.objects.EpisodeOfCareStatusHistory)statusHistory.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
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
		
		String keyClassName = "EpisodeOfCare";
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
		if (this.getRelationship() != null)
		{
			sb.append("<relationship>");
			sb.append(this.getRelationship().toXMLString()); 
			sb.append("</relationship>");		
		}
		if (this.getCareContexts() != null)
		{
			if (this.getCareContexts().size() > 0 )
			{
			sb.append("<careContexts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCareContexts(), domMap));
			sb.append("</careContexts>");		
			}
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
		}
		if (this.getCareSpell() != null)
		{
			sb.append("<careSpell>");
			sb.append(this.getCareSpell().toXMLString(domMap)); 	
			sb.append("</careSpell>");		
		}
		if (this.getLinkedReferrals() != null)
		{
			if (this.getLinkedReferrals().size() > 0 )
			{
			sb.append("<linkedReferrals>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLinkedReferrals(), domMap));
			sb.append("</linkedReferrals>");		
			}
		}
		if (this.getLinkedReferralsHistory() != null)
		{
			if (this.getLinkedReferralsHistory().size() > 0 )
			{
			sb.append("<linkedReferralsHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLinkedReferralsHistory(), domMap));
			sb.append("</linkedReferralsHistory>");		
			}
		}
		if (this.getCurrentReferral() != null)
		{
			sb.append("<currentReferral>");
			sb.append(this.getCurrentReferral().toXMLString(domMap)); 	
			sb.append("</currentReferral>");		
		}
		if (this.getEpisodeOfCareHistory() != null)
		{
			if (this.getEpisodeOfCareHistory().size() > 0 )
			{
			sb.append("<episodeOfCareHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getEpisodeOfCareHistory(), domMap));
			sb.append("</episodeOfCareHistory>");		
			}
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
			EpisodeOfCare domainObject = getEpisodeOfCarefromXML(itemEl, factory, domMap);

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
			EpisodeOfCare domainObject = getEpisodeOfCarefromXML(itemEl, factory, domMap);

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
		
	public static EpisodeOfCare getEpisodeOfCarefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEpisodeOfCarefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EpisodeOfCare getEpisodeOfCarefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EpisodeOfCare.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EpisodeOfCare.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EpisodeOfCare class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EpisodeOfCare)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EpisodeOfCare.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EpisodeOfCare ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EpisodeOfCare)factory.getImportedDomainObject(EpisodeOfCare.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EpisodeOfCare();
		}
		String keyClassName = "EpisodeOfCare";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EpisodeOfCare)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EpisodeOfCare obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("relationship");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRelationship(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("careContexts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCareContexts(ims.core.admin.domain.objects.CareContext.fromSetXMLString(fldEl, factory, obj.getCareContexts(), domMap));
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("careSpell");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareSpell(ims.core.admin.domain.objects.CareSpell.getCareSpellfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("linkedReferrals");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLinkedReferrals(ims.core.admin.domain.objects.Referral.fromListXMLString(fldEl, factory, obj.getLinkedReferrals(), domMap));
		}
		fldEl = el.element("linkedReferralsHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLinkedReferralsHistory(ims.core.admin.domain.objects.Referral.fromListXMLString(fldEl, factory, obj.getLinkedReferralsHistory(), domMap));
		}
		fldEl = el.element("currentReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentReferral(ims.core.admin.domain.objects.Referral.getReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCareHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setEpisodeOfCareHistory(ims.core.admin.domain.objects.EpisodeOfCareHistory.fromSetXMLString(fldEl, factory, obj.getEpisodeOfCareHistory(), domMap));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.admin.domain.objects.EpisodeOfCareStatusHistory.getEpisodeOfCareStatusHistoryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.core.admin.domain.objects.EpisodeOfCareStatusHistory.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "careContexts"
		, "linkedReferrals"
		, "linkedReferralsHistory"
		, "episodeOfCareHistory"
		, "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Relationship = "relationship";
		public static final String CareContexts = "careContexts";
		public static final String Specialty = "specialty";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
		public static final String CareSpell = "careSpell";
		public static final String LinkedReferrals = "linkedReferrals";
		public static final String LinkedReferralsHistory = "linkedReferralsHistory";
		public static final String CurrentReferral = "currentReferral";
		public static final String EpisodeOfCareHistory = "episodeOfCareHistory";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
	}
}

